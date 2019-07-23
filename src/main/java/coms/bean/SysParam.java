package coms.bean;

import java.util.Date;

public class SysParam {
    private String paramId;

    private String paramName;

    private String paramKey;

    private String paramValue;

    private String catalogId;

    private String catalogCascadeId;

    private String paramRemark;

    private String status;

    private String editMode;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey == null ? null : paramKey.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId == null ? null : catalogId.trim();
    }

    public String getCatalogCascadeId() {
        return catalogCascadeId;
    }

    public void setCatalogCascadeId(String catalogCascadeId) {
        this.catalogCascadeId = catalogCascadeId == null ? null : catalogCascadeId.trim();
    }

    public String getParamRemark() {
        return paramRemark;
    }

    public void setParamRemark(String paramRemark) {
        this.paramRemark = paramRemark == null ? null : paramRemark.trim();
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
        return "SysParam{" +
                "paramId='" + paramId + '\'' +
                ", paramName='" + paramName + '\'' +
                ", paramKey='" + paramKey + '\'' +
                ", paramValue='" + paramValue + '\'' +
                ", catalogId='" + catalogId + '\'' +
                ", catalogCascadeId='" + catalogCascadeId + '\'' +
                ", paramRemark='" + paramRemark + '\'' +
                ", status='" + status + '\'' +
                ", editMode='" + editMode + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                '}';
    }
}