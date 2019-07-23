package coms.bean;

import java.util.Date;

public class SysIcon {
    private String iconId;

    private String iconName;

    private String iconFileName;

    private String iconPath;

    private String iconType;

    private String iconSizeType;

    private String status;

    private String editMode;

    private String createUserId;

    private Date createTime;

    private String modifyUserId;

    private Date modifyTime;

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId == null ? null : iconId.trim();
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName == null ? null : iconName.trim();
    }

    public String getIconFileName() {
        return iconFileName;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName == null ? null : iconFileName.trim();
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }

    public String getIconType() {
        return iconType;
    }

    public void setIconType(String iconType) {
        this.iconType = iconType == null ? null : iconType.trim();
    }

    public String getIconSizeType() {
        return iconSizeType;
    }

    public void setIconSizeType(String iconSizeType) {
        this.iconSizeType = iconSizeType == null ? null : iconSizeType.trim();
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

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "SysIcon{" +
                "iconId='" + iconId + '\'' +
                ", iconName='" + iconName + '\'' +
                ", iconFileName='" + iconFileName + '\'' +
                ", iconPath='" + iconPath + '\'' +
                ", iconType='" + iconType + '\'' +
                ", iconSizeType='" + iconSizeType + '\'' +
                ", status='" + status + '\'' +
                ", editMode='" + editMode + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                ", modifyTime=" + modifyTime +
                '}';
    }
}