package coms.bean;

import java.util.Date;

public class BisNurseProject {
    private String projectId;

    private String projectName;

    private String typeId;

    private String coverPhoto;

    private String coverBigPhoto;

    private String useDevice;

    private Integer serverTime;

    private Double rmbPrice;

    private Integer beautyPrice;

    private Double manualPrice;

    private Double activePrice;

    private String status;

    private Integer sortNo;

    private String isDel;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    private String content;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto == null ? null : coverPhoto.trim();
    }

    public String getCoverBigPhoto() {
        return coverBigPhoto;
    }

    public void setCoverBigPhoto(String coverBigPhoto) {
        this.coverBigPhoto = coverBigPhoto == null ? null : coverBigPhoto.trim();
    }

    public String getUseDevice() {
        return useDevice;
    }

    public void setUseDevice(String useDevice) {
        this.useDevice = useDevice == null ? null : useDevice.trim();
    }

    public Integer getServerTime() {
        return serverTime;
    }

    public void setServerTime(Integer serverTime) {
        this.serverTime = serverTime;
    }

    public Double getRmbPrice() {
        return rmbPrice;
    }

    public void setRmbPrice(Double rmbPrice) {
        this.rmbPrice = rmbPrice;
    }

    public Integer getBeautyPrice() {
        return beautyPrice;
    }

    public void setBeautyPrice(Integer beautyPrice) {
        this.beautyPrice = beautyPrice;
    }

    public Double getManualPrice() {
        return manualPrice;
    }

    public void setManualPrice(Double manualPrice) {
        this.manualPrice = manualPrice;
    }

    public Double getActivePrice() {
        return activePrice;
    }

    public void setActivePrice(Double activePrice) {
        this.activePrice = activePrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "BisNurseProject{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", typeId='" + typeId + '\'' +
                ", coverPhoto='" + coverPhoto + '\'' +
                ", coverBigPhoto='" + coverBigPhoto + '\'' +
                ", useDevice='" + useDevice + '\'' +
                ", serverTime=" + serverTime +
                ", rmbPrice=" + rmbPrice +
                ", beautyPrice=" + beautyPrice +
                ", manualPrice=" + manualPrice +
                ", activePrice=" + activePrice +
                ", status='" + status + '\'' +
                ", sortNo=" + sortNo +
                ", isDel='" + isDel + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}