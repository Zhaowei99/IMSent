package coms.bean;

import java.util.Date;

public class SysDept {
    private String deptId;

    private String cascadeId;

    private String deptName;

    private String parentId;

    private String deptCode;

    private String manager;

    private String phone;

    private String fax;

    private String address;

    private String isAutoExpand;

    private String iconName;

    private Integer sortNo;

    private String remark;

    private String isDel;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getCascadeId() {
        return cascadeId;
    }

    public void setCascadeId(String cascadeId) {
        this.cascadeId = cascadeId == null ? null : cascadeId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIsAutoExpand() {
        return isAutoExpand;
    }

    public void setIsAutoExpand(String isAutoExpand) {
        this.isAutoExpand = isAutoExpand == null ? null : isAutoExpand.trim();
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName == null ? null : iconName.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    @Override
    public String toString() {
        return "SysDept{" +
                "deptId='" + deptId + '\'' +
                ", cascadeId='" + cascadeId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", manager='" + manager + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", isAutoExpand='" + isAutoExpand + '\'' +
                ", iconName='" + iconName + '\'' +
                ", sortNo=" + sortNo +
                ", remark='" + remark + '\'' +
                ", isDel='" + isDel + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                '}';
    }
}