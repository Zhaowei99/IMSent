package coms.bean;

import java.util.Date;

public class SysDictionary {
    private String dicId;

    private String dicIndexId;

    private String dicCode;

    private String dicValue;

    private String showColor;

    private String status;

    private String editMode;

    private Integer sortNo;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    public String getDicId() {
        return dicId;
    }

    public void setDicId(String dicId) {
        this.dicId = dicId == null ? null : dicId.trim();
    }

    public String getDicIndexId() {
        return dicIndexId;
    }

    public void setDicIndexId(String dicIndexId) {
        this.dicIndexId = dicIndexId == null ? null : dicIndexId.trim();
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode == null ? null : dicCode.trim();
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }

    public String getShowColor() {
        return showColor;
    }

    public void setShowColor(String showColor) {
        this.showColor = showColor == null ? null : showColor.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode == null ? null : editMode.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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
        return "SysDictionary{" +
                "dicId='" + dicId + '\'' +
                ", dicIndexId='" + dicIndexId + '\'' +
                ", dicCode='" + dicCode + '\'' +
                ", dicValue='" + dicValue + '\'' +
                ", showColor='" + showColor + '\'' +
                ", status='" + status + '\'' +
                ", editMode='" + editMode + '\'' +
                ", sortNo=" + sortNo +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                '}';
    }
}