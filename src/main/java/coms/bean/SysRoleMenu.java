package coms.bean;

import java.util.Date;

public class SysRoleMenu {
    private String roleId;

    private String menuId;

    private String grantType;

    private String createUserId;

    private Date createTime;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType == null ? null : grantType.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysRoleMenu{" +
                "roleId='" + roleId + '\'' +
                ", menuId='" + menuId + '\'' +
                ", grantType='" + grantType + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}