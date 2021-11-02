package org.guce.siat.core.ct.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.User;

/**
 *
 * @author lissouck
 */
@Entity
@Table(name = "USER_STAMP_SIGNATURE")
@XmlRootElement
public class UserStampSignature extends AbstractModel implements Serializable {

    private static final long serialVersionUID = -2909713764041243938L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_STAMP_SIGNATURE_SEQ")
    @SequenceGenerator(name = "USER_STAMP_SIGNATURE_SEQ", sequenceName = "USER_STAMP_SIGNATURE_SEQ", allocationSize = 1)
    private Long id;


    /**
     * The USER.
     */
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    private User user;

    /**
     * The alfresco path of image signature.
     */
    @Column(unique = false, name = "SIGNATURE_PATH")
    private String signaturePath;
    
    /**
     * The alfresco path of image stamp.
     */
    @Column(unique = false, name = "STAMP_PATH")
    private String stampPath;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSignaturePath() {
        return signaturePath;
    }

    public void setSignaturePath(String signaturePath) {
        this.signaturePath = signaturePath;
    }

    public String getStampPath() {
        return stampPath;
    }

    public void setStampPath(String stampPath) {
        this.stampPath = stampPath;
    }


    @Override
    public String toString() {
        return "TreatmentInfos{" + "id=" + id + ", user=" + user + ", signature path=" + signaturePath+ ", stamp path=" + stampPath + "}";
    }

    @PrePersist
    private void prePersist() {
        
    }

}
