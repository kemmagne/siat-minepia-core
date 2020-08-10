package org.guce.siat.common.service;

import java.util.List;
import org.guce.siat.common.dao.AuditDao;
import org.guce.siat.common.job.EmailSenderJob;
import org.guce.siat.common.mail.bo.EmailSenderService;
import org.guce.siat.common.model.AuditEntity;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.enums.AuditConstants;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ht
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DataSourceConfig.class})
@ContextConfiguration("classpath:spring-config.xml")
@PropertySource("classpath:global-config.properties")
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    private AuditDao auditDao;

    @Value("${mails.folder}")
    private String mailsFolder;

    @Ignore
    @Test
    public void testResetUserPassword() throws Exception {
        User user = userService.findByLogin("MINADER-AG-AGENT");
        String oldEncryptedPassword = user.getPassword();
        String password = userService.resetUserPassword(user);
        User usr = userService.findByLogin("MINADER-AG-AGENT");
        String newEncryptedPassword = usr.getPassword();
        Assert.assertTrue(usr.getFirstLogin());
        Assert.assertEquals(Constants.ZERO, usr.getAttempts());
        Assert.assertFalse(oldEncryptedPassword.equals(newEncryptedPassword));
        System.out.println("NEW PASSWORD : " + password);
        List<AuditEntity> auditEntities = auditDao.findByUsername("Scheduled Job");
        AuditEntity auditEntity = auditEntities.get(0);
        Assert.assertEquals(AuditConstants.PASSWORD_RESET.getCode(), auditEntity.getAction());
        Assert.assertEquals(user.getId(), auditEntity.getIdModel());
        EmailSenderJob senderJob = new EmailSenderJob();
        senderJob.setEmailSenderService(emailSenderService);
        senderJob.setMailsFolder(mailsFolder);
        senderJob.executeInternal1();
    }

    @Ignore
    @Test
    public void test() {
    }

}
