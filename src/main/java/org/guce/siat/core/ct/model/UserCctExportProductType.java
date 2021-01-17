package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import org.guce.siat.common.model.u
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.util.enums.CctExportProductType;

/**
 *
 * @author tadzotsa
 */
@Entity
@Table(name = "USERS_CCT_EXPORT_PRODUCT_TYPE")
@IdClass(UserCctExportProductType.UserCctExportProductTypeID.class)
public class UserCctExportProductType implements Serializable {

    private static final long serialVersionUID = -2391801697523747134L;

    @Id
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    @Id
    @Column(name = "PRODUCT_TYPE")
    @Enumerated(EnumType.STRING)
    private CctExportProductType productType;

    public UserCctExportProductType() {
    }

    public UserCctExportProductType(User user, CctExportProductType productType) {
        this.user = user;
        this.productType = productType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CctExportProductType getProductType() {
        return productType;
    }

    public void setProductType(CctExportProductType productType) {
        this.productType = productType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.user);
        hash = 53 * hash + Objects.hashCode(this.productType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserCctExportProductType other = (UserCctExportProductType) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return this.productType == other.productType;
    }

    public static class UserCctExportProductTypeID implements Serializable {

        private static final long serialVersionUID = 2563171069849918015L;

        private Long user;
        private CctExportProductType productType;

        public UserCctExportProductTypeID() {
        }

        public UserCctExportProductTypeID(Long user, CctExportProductType productType) {
            this.user = user;
            this.productType = productType;
        }

        public Long getUser() {
            return user;
        }

        public void setUser(Long user) {
            this.user = user;
        }

        public CctExportProductType getProductType() {
            return productType;
        }

        public void setProductType(CctExportProductType productType) {
            this.productType = productType;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 41 * hash + Objects.hashCode(this.user);
            hash = 41 * hash + Objects.hashCode(this.productType);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final UserCctExportProductTypeID other = (UserCctExportProductTypeID) obj;
            if (!Objects.equals(this.user, other.user)) {
                return false;
            }
            return this.productType == other.productType;
        }

    }

}
