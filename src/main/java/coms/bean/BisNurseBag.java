package coms.bean;

import java.util.Date;

public class BisNurseBag {
    private String bagId;

    private String bagName;

    private Double bagTotalPrice;

    private String coverPhoto;

    private String coverBigPhoto;

    private Integer openCardNum;

    private Integer remainNum;

    private Integer maxBuyNum;

    private Integer minBuyNum;

    private Date putawayTime;

    private Date soldoutTime;

    private Integer overdueTime;

    private String status;

    private Integer sortNo;

    private String isDel;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    private String bagIntroduce;

    private Integer buyCount;

    private String content;

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
    }

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName == null ? null : bagName.trim();
    }

    public Double getBagTotalPrice() {
        return bagTotalPrice;
    }

    public void setBagTotalPrice(Double bagTotalPrice) {
        this.bagTotalPrice = bagTotalPrice;
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

    public Integer getOpenCardNum() {
        return openCardNum;
    }

    public void setOpenCardNum(Integer openCardNum) {
        this.openCardNum = openCardNum;
    }

    public Integer getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }

    public Integer getMaxBuyNum() {
        return maxBuyNum;
    }

    public void setMaxBuyNum(Integer maxBuyNum) {
        this.maxBuyNum = maxBuyNum;
    }

    public Integer getMinBuyNum() {
        return minBuyNum;
    }

    public void setMinBuyNum(Integer minBuyNum) {
        this.minBuyNum = minBuyNum;
    }

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    public Date getSoldoutTime() {
        return soldoutTime;
    }

    public void setSoldoutTime(Date soldoutTime) {
        this.soldoutTime = soldoutTime;
    }

    public Integer getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(Integer overdueTime) {
        this.overdueTime = overdueTime;
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

    public String getBagIntroduce() {
        return bagIntroduce;
    }

    public void setBagIntroduce(String bagIntroduce) {
        this.bagIntroduce = bagIntroduce == null ? null : bagIntroduce.trim();
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "BisNurseBag{" +
                "bagId='" + bagId + '\'' +
                ", bagName='" + bagName + '\'' +
                ", bagTotalPrice=" + bagTotalPrice +
                ", coverPhoto='" + coverPhoto + '\'' +
                ", coverBigPhoto='" + coverBigPhoto + '\'' +
                ", openCardNum=" + openCardNum +
                ", remainNum=" + remainNum +
                ", maxBuyNum=" + maxBuyNum +
                ", minBuyNum=" + minBuyNum +
                ", putawayTime=" + putawayTime +
                ", soldoutTime=" + soldoutTime +
                ", overdueTime=" + overdueTime +
                ", status='" + status + '\'' +
                ", sortNo=" + sortNo +
                ", isDel='" + isDel + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                ", bagIntroduce='" + bagIntroduce + '\'' +
                ", buyCount=" + buyCount +
                ", content='" + content + '\'' +
                '}';
    }
}