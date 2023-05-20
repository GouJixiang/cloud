package cn.yangxy.cloud.system.user.entity;

import cn.yangxy.cloud.system.common.object.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "USER")
public class UserEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -1253969073953260020L;

    private String id;
    private String loginName;
    private String fullName;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
