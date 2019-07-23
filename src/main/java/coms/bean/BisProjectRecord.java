package coms.bean;

import java.util.Date;

public class BisProjectRecord {
    private String recordId;

    private String projectId;

    private String bagRecordId;

    private String shopId;

    private String projectStatus;

    private Date drawTime;

    private Date useTime;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getBagRecordId() {
        return bagRecordId;
    }

    public void setBagRecordId(String bagRecordId) {
        this.bagRecordId = bagRecordId == null ? null : bagRecordId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    @Override
    public String toString() {
        return "BisProjectRecord{" +
                "recordId='" + recordId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", bagRecordId='" + bagRecordId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", projectStatus='" + projectStatus + '\'' +
                ", drawTime=" + drawTime +
                ", useTime=" + useTime +
                '}';
    }
}