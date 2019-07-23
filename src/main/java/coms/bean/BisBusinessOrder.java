package coms.bean;

import java.util.Date;

public class BisBusinessOrder {
    private String orderId;

    private String orderContent;

    private String projectId;

    private String shopId;

    private String customUserId;

    private Date subscribeTime;

    private String orderType;

    private Double orderMoney;

    private Integer buyNum;

    private Double payMoney;

    private Integer extendBeautyNum;

    private Double cashIncome;

    private Double extendIncome;

    private String payWay;

    private Date payTime;

    private String checkCode;

    private String orderStatus;

    private String orderRemark;

    private String serverUserId;

    private String handleUserId;

    private Date createTime;

    private Date serviceTime;

    private Date cancelTime;

    private String cancelType;

    private Date finishTime;

    private String orderSource;

    private String modifyStatus;

    private Integer freeNum;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    public Date getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getExtendBeautyNum() {
        return extendBeautyNum;
    }

    public void setExtendBeautyNum(Integer extendBeautyNum) {
        this.extendBeautyNum = extendBeautyNum;
    }

    public Double getCashIncome() {
        return cashIncome;
    }

    public void setCashIncome(Double cashIncome) {
        this.cashIncome = cashIncome;
    }

    public Double getExtendIncome() {
        return extendIncome;
    }

    public void setExtendIncome(Double extendIncome) {
        this.extendIncome = extendIncome;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public String getServerUserId() {
        return serverUserId;
    }

    public void setServerUserId(String serverUserId) {
        this.serverUserId = serverUserId == null ? null : serverUserId.trim();
    }

    public String getHandleUserId() {
        return handleUserId;
    }

    public void setHandleUserId(String handleUserId) {
        this.handleUserId = handleUserId == null ? null : handleUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCancelType() {
        return cancelType;
    }

    public void setCancelType(String cancelType) {
        this.cancelType = cancelType == null ? null : cancelType.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus == null ? null : modifyStatus.trim();
    }

    public Integer getFreeNum() {
        return freeNum;
    }

    public void setFreeNum(Integer freeNum) {
        this.freeNum = freeNum;
    }


    @Override
    public String toString() {
        return "BisBusinessOrder{" +
                "orderId='" + orderId + '\'' +
                ", orderContent='" + orderContent + '\'' +
                ", projectId='" + projectId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", customUserId='" + customUserId + '\'' +
                ", subscribeTime=" + subscribeTime +
                ", orderType='" + orderType + '\'' +
                ", orderMoney=" + orderMoney +
                ", buyNum=" + buyNum +
                ", payMoney=" + payMoney +
                ", extendBeautyNum=" + extendBeautyNum +
                ", cashIncome=" + cashIncome +
                ", extendIncome=" + extendIncome +
                ", payWay='" + payWay + '\'' +
                ", payTime=" + payTime +
                ", checkCode='" + checkCode + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderRemark='" + orderRemark + '\'' +
                ", serverUserId='" + serverUserId + '\'' +
                ", handleUserId='" + handleUserId + '\'' +
                ", createTime=" + createTime +
                ", serviceTime=" + serviceTime +
                ", cancelTime=" + cancelTime +
                ", cancelType='" + cancelType + '\'' +
                ", finishTime=" + finishTime +
                ", orderSource='" + orderSource + '\'' +
                ", modifyStatus='" + modifyStatus + '\'' +
                ", freeNum=" + freeNum +
                '}';
    }
}