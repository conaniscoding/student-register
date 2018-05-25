package com.conan.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_menu_info", schema = "student-register")
public class SysMenuInfoEntity {
    private Integer id;
    private String menuCode;
    private String menuName;
    private Integer pMenuId;
    private Integer menuType;
    private String menuUrl;
    private Integer menuLogo;
    private Integer sort;
    private Integer sysType;
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
    @Column(name = "menu_code", nullable = false, length = 20)
    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @Basic
    @Column(name = "menu_name", nullable = false, length = 30)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "p_menu_id", nullable = false)
    public Integer getpMenuId() {
        return pMenuId;
    }

    public void setpMenuId(Integer pMenuId) {
        this.pMenuId = pMenuId;
    }

    @Basic
    @Column(name = "menu_type", nullable = false)
    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "menu_url", nullable = false, length = 90)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_logo", nullable = false)
    public Integer getMenuLogo() {
        return menuLogo;
    }

    public void setMenuLogo(Integer menuLogo) {
        this.menuLogo = menuLogo;
    }

    @Basic
    @Column(name = "sort", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "sys_type", nullable = false)
    public Integer getSysType() {
        return sysType;
    }

    public void setSysType(Integer sysType) {
        this.sysType = sysType;
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

        SysMenuInfoEntity that = (SysMenuInfoEntity) o;

        if (id != that.id) return false;
        if (pMenuId != that.pMenuId) return false;
        if (menuType != that.menuType) return false;
        if (menuLogo != that.menuLogo) return false;
        if (sort != that.sort) return false;
        if (sysType != that.sysType) return false;
        if (menuCode != null ? !menuCode.equals(that.menuCode) : that.menuCode != null) return false;
        if (menuName != null ? !menuName.equals(that.menuName) : that.menuName != null) return false;
        if (menuUrl != null ? !menuUrl.equals(that.menuUrl) : that.menuUrl != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (menuCode != null ? menuCode.hashCode() : 0);
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + pMenuId;
        result = 31 * result + menuType;
        result = 31 * result + (menuUrl != null ? menuUrl.hashCode() : 0);
        result = 31 * result + menuLogo;
        result = 31 * result + sort;
        result = 31 * result + sysType;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
