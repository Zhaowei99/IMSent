package coms.bean;

import java.util.Date;

public class BisBagProject {
    private String bagId;

    private String projectId;

    private Double projectOldPrice;

    private Double projectNewPrice;

    private Integer projectNum;

    private Date createTime;

    private String createUserId;

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Double getProjectOldPrice() {
        return projectOldPrice;
    }

    public void setProjectOldPrice(Double projectOldPrice) {
        this.projectOldPrice = projectOldPrice;
    }

    public Double getProjectNewPrice() {
        return projectNewPrice;
    }

    public void setProjectNewPrice(Double projectNewPrice) {
        this.projectNewPrice = projectNewPrice;
    }

    public Integer getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
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

    @Override
    public String toString() {
        return "BisBagProject{" +
                "bagId='" + bagId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", projectOldPrice=" + projectOldPrice +
                ", projectNewPrice=" + projectNewPrice +
                ", projectNum=" + projectNum +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                '}';
    }
}