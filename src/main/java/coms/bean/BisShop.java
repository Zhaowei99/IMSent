package coms.bean;

import java.util.Date;

public class BisShop {
    private String shopId;

    private String ownerId;

    private String shopName;

    private String shortName;

    private Double monthCashIn;

    private Double monthExpendIn;

    private String shopLicense;

    private String shopImage;

    private String shopDetailImage;

    private Double gpsX;

    private Double gpsY;

    private Integer sortNo;

    private String shopAddress;

    private String shopQrcode;

    private String shopPhone;

    private Double shopArea;

    private String shopProject;

    private String shopType;

    private String showStatus;

    private String isDel;

    private String shopRemark;

    private String beginTime;

    private String endTime;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    private String shopIntro;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Double getMonthCashIn() {
        return monthCashIn;
    }

    public void setMonthCashIn(Double monthCashIn) {
        this.monthCashIn = monthCashIn;
    }

    public Double getMonthExpendIn() {
        return monthExpendIn;
    }

    public void setMonthExpendIn(Double monthExpendIn) {
        this.monthExpendIn = monthExpendIn;
    }

    public String getShopLicense() {
        return shopLicense;
    }

    public void setShopLicense(String shopLicense) {
        this.shopLicense = shopLicense == null ? null : shopLicense.trim();
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage == null ? null : shopImage.trim();
    }

    public String getShopDetailImage() {
        return shopDetailImage;
    }

    public void setShopDetailImage(String shopDetailImage) {
        this.shopDetailImage = shopDetailImage == null ? null : shopDetailImage.trim();
    }

    public Double getGpsX() {
        return gpsX;
    }

    public void setGpsX(Double gpsX) {
        this.gpsX = gpsX;
    }

    public Double getGpsY() {
        return gpsY;
    }

    public void setGpsY(Double gpsY) {
        this.gpsY = gpsY;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopQrcode() {
        return shopQrcode;
    }

    public void setShopQrcode(String shopQrcode) {
        this.shopQrcode = shopQrcode == null ? null : shopQrcode.trim();
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public Double getShopArea() {
        return shopArea;
    }

    public void setShopArea(Double shopArea) {
        this.shopArea = shopArea;
    }

    public String getShopProject() {
        return shopProject;
    }

    public void setShopProject(String shopProject) {
        this.shopProject = shopProject == null ? null : shopProject.trim();
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public String getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(String showStatus) {
        this.showStatus = showStatus == null ? null : showStatus.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getShopRemark() {
        return shopRemark;
    }

    public void setShopRemark(String shopRemark) {
        this.shopRemark = shopRemark == null ? null : shopRemark.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
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

    public String getShopIntro() {
        return shopIntro;
    }

    public void setShopIntro(String shopIntro) {
        this.shopIntro = shopIntro == null ? null : shopIntro.trim();
    }

    @Override
    public String toString() {
        return "BisShop{" +
                "shopId='" + shopId + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", monthCashIn=" + monthCashIn +
                ", monthExpendIn=" + monthExpendIn +
                ", shopLicense='" + shopLicense + '\'' +
                ", shopImage='" + shopImage + '\'' +
                ", shopDetailImage='" + shopDetailImage + '\'' +
                ", gpsX=" + gpsX +
                ", gpsY=" + gpsY +
                ", sortNo=" + sortNo +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopQrcode='" + shopQrcode + '\'' +
                ", shopPhone='" + shopPhone + '\'' +
                ", shopArea=" + shopArea +
                ", shopProject='" + shopProject + '\'' +
                ", shopType='" + shopType + '\'' +
                ", showStatus='" + showStatus + '\'' +
                ", isDel='" + isDel + '\'' +
                ", shopRemark='" + shopRemark + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                ", shopIntro='" + shopIntro + '\'' +
                '}';
    }
}