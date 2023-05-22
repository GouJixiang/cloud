package cn.yangxy.cloud.system.user.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "SYS_USER")
public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -1253969073953260020L;

    private String id;
    private String loginName;
    private String fullName;

    @Id
    @GeneratedValue(generator = "UserIdGenerator")
    @GenericGenerator(name = "UserIdGenerator", strategy = "uuid2")
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "LOGIN_NAME")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
