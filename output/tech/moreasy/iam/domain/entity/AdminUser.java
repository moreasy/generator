package tech.moreasy.iam.domain.entity;

import javax.persistence.*;

@Table(name = "admin_user")
public class AdminUser {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 组织id
     */
    @Column(name = "org_id")
    private Integer orgId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 密码哈希值
     */
    @Column(name = "password_hash")
    private String passwordHash;

    /**
     * 用户姓名
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 用户状态 0禁用1正常
     */
    private Byte status;

    /**
     * 是否删除 0否 1是
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    /**
     * 创建人id
     */
    @Column(name = "creator_id")
    private Integer creatorId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Long updateTime;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取组织id
     *
     * @return org_id - 组织id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置组织id
     *
     * @param orgId 组织id
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码哈希值
     *
     * @return password_hash - 密码哈希值
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * 设置密码哈希值
     *
     * @param passwordHash 密码哈希值
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * 获取用户姓名
     *
     * @return full_name - 用户姓名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置用户姓名
     *
     * @param fullName 用户姓名
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取用户状态 0禁用1正常
     *
     * @return status - 用户状态 0禁用1正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置用户状态 0禁用1正常
     *
     * @param status 用户状态 0禁用1正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取是否删除 0否 1是
     *
     * @return is_deleted - 是否删除 0否 1是
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 0否 1是
     *
     * @param isDeleted 是否删除 0否 1是
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取创建人id
     *
     * @return creator_id - 创建人id
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人id
     *
     * @param creatorId 创建人id
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}