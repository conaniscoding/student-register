package com.conan.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_type_info", schema = "student-register")
public class SysTypeInfoEntity {
    private Integer id;
    private String sysCode;
    private String sysName;
    private String fpUrl;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sys_code", nullable = false, length = 20)
    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    @Basic
    @Column(name = "sys_name", nullable = false, length = 30)
    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    @Basic
    @Column(name = "fp_url", nullable = false, length = 90)
    public String getFpUrl() {
        return fpUrl;
    }

    public void setFpUrl(String fpUrl) {
        this.fpUrl = fpUrl;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysTypeInfoEntity that = (SysTypeInfoEntity) o;

        if (id != that.id) return false;
        if (sysCode != null ? !sysCode.equals(that.sysCode) : that.sysCode != null) return false;
        if (sysName != null ? !sysName.equals(that.sysName) : that.sysName != null) return false;
        if (fpUrl != null ? !fpUrl.equals(that.fpUrl) : that.fpUrl != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sysCode != null ? sysCode.hashCode() : 0);
        result = 31 * result + (sysName != null ? sysName.hashCode() : 0);
        result = 31 * result + (fpUrl != null ? fpUrl.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
