package cn.yangxy.cloud.system.common.object;

import jakarta.persistence.Column;

import java.time.Instant;

public class BaseEntity {

    private String creatorAccount;
    private String creatorName;
    private String creatorId;
    private String createDeptName;
    private String createDeptId;
    private String createUnitName;
    private String createUnitId;
    private String lastUpdateAccount;
    private String lastUpdateDept;
    private String lateUpdateUnit;
    private Instant creationTime;
    private Instant lateUpdateTime;
    private int deleted;

    @Column(name = "CREATOR_ACCOUNT")
    public String getCreatorAccount() {
        return creatorAccount;
    }

    public void setCreatorAccount(String creatorAccount) {
        this.creatorAccount = creatorAccount;
    }

    @Column(name = "CREATOR_NAME")
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    @Column(name = "CREATOR_ID")
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @Column(name = "CREATE_DEPT_NAME")
    public String getCreateDeptName() {
        return createDeptName;
    }

    public void setCreateDeptName(String createDeptName) {
        this.createDeptName = createDeptName;
    }

    @Column(name = "CREATE_DEPT_ID")
    public String getCreateDeptId() {
        return createDeptId;
    }

    public void setCreateDeptId(String createDeptId) {
        this.createDeptId = createDeptId;
    }

    @Column(name = "CREATE_UNIT_NAME")
    public String getCreateUnitName() {
        return createUnitName;
    }

    public void setCreateUnitName(String createUnitName) {
        this.createUnitName = createUnitName;
    }

    @Column(name = "CREATE_UNIT_ID")
    public String getCreateUnitId() {
        return createUnitId;
    }

    public void setCreateUnitId(String createUnitId) {
        this.createUnitId = createUnitId;
    }

    @Column(name = "LAST_UPDATE_ACCOUNT")
    public String getLastUpdateAccount() {
        return lastUpdateAccount;
    }

    public void setLastUpdateAccount(String lastUpdateAccount) {
        this.lastUpdateAccount = lastUpdateAccount;
    }

    @Column(name = "LAST_UPDATE_DEPT")
    public String getLastUpdateDept() {
        return lastUpdateDept;
    }

    public void setLastUpdateDept(String lastUpdateDept) {
        this.lastUpdateDept = lastUpdateDept;
    }

    @Column(name = "LAST_UPDATE_UNIT")
    public String getLateUpdateUnit() {
        return lateUpdateUnit;
    }

    public void setLateUpdateUnit(String lateUpdateUnit) {
        this.lateUpdateUnit = lateUpdateUnit;
    }

    @Column(name = "CREATION_TIME")
    public Instant getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Instant creationTime) {
        this.creationTime = creationTime;
    }

    @Column(name = "LAST_UPDATE_TIME")
    public Instant getLateUpdateTime() {
        return lateUpdateTime;
    }

    public void setLateUpdateTime(Instant lateUpdateTime) {
        this.lateUpdateTime = lateUpdateTime;
    }

    @Column(name = "DELETED")
    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}
