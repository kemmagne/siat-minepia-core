package org.guce.siat.core.ct.dao.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author ht
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {
    "org.guce.siat.common.dao", "org.guce.siat.common.service",
    "org.guce.siat.core.ct.dao", "org.guce.siat.core.gr.dao"
})
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() throws Exception {

        Properties props = new Properties();
        props.load(new ClassPathResource("datasource.properties").getInputStream());
//        HikariConfig config = new HikariConfig(props);
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("oracle.jdbc.OracleDriver");
        config.setJdbcUrl("jdbc:oracle:thin:@htserver:1521:GUCE");
        config.setUsername("SIAT_CT");
        config.setPassword("siat");
        config.setAutoCommit(false);
//        config.setConnectionTestQuery("SELECT 1");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        HikariDataSource ds = new HikariDataSource(config);

        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {

        final HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();

        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
        jpaVendorAdapter.setGenerateDdl(false);

        return jpaVendorAdapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {

        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        entityManagerFactoryBean.setJpaProperties(jpaProperties());
        entityManagerFactoryBean.setPackagesToScan("org.guce.siat.common.model", "org.guce.siat.core.ct.model", "org.guce.siat.core.gr.model");

        return entityManagerFactoryBean;
    }

    private Properties jpaProperties() throws Exception {

        Properties jpaProperties = new Properties();

        jpaProperties.load(new ClassPathResource("jpa_properties.properties").getInputStream());

        return jpaProperties;
    }

    @Bean
    public JpaTransactionManager transactionManager() throws Exception {

        JpaTransactionManager transactionManager = new JpaTransactionManager();

        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }

    @Bean
    public ShaPasswordEncoder passwordEncoder() {
        return new ShaPasswordEncoder(256);
    }

}
