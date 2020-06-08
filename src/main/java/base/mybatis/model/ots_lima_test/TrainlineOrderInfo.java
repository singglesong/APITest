package base.mybatis.model.ots_lima_test;

import java.math.BigDecimal;
import java.util.Date;

public class TrainlineOrderInfo {
    private String id;

    private String orderCode;

    private String from;

    private String to;

    private String trainNumber;

    private String contactName;

    private String contactTel;

    private String itemIdTrain;

    private String date;

    private String startTime;

    private BigDecimal totalOtherFee;

    private BigDecimal totalPurPrice;

    private BigDecimal totalFacePrice;

    private BigDecimal totalSalePrice;

    private BigDecimal totalPayCash;

    private Integer state;

    private String endTime;

    private Integer runTimeHour;

    private Integer runTimeMinutes;

    private Integer runTimeDays;

    private String etime;

    private String billTime;

    private Integer billState;

    private String title;

    private String ctime;

    private String tradeNo;

    private String remark;

    private String tplId;

    private Long totalRefundAmount;

    private Integer isDeleted;

    private String creatorId;

    private Date createTime;

    private String modifiedId;

    private Date modifiedTime;

    private Integer isVisible;

    private String distirbuteId;

    private String distirbuteName;

    private String supplierName;

    private String supplierId;

    private Integer status;

    private Integer week;

    private String memberId;

    private Date timeoutPayTime;

    private String payTradeNo;

    private Integer payType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber == null ? null : trainNumber.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getItemIdTrain() {
        return itemIdTrain;
    }

    public void setItemIdTrain(String itemIdTrain) {
        this.itemIdTrain = itemIdTrain == null ? null : itemIdTrain.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public BigDecimal getTotalOtherFee() {
        return totalOtherFee;
    }

    public void setTotalOtherFee(BigDecimal totalOtherFee) {
        this.totalOtherFee = totalOtherFee;
    }

    public BigDecimal getTotalPurPrice() {
        return totalPurPrice;
    }

    public void setTotalPurPrice(BigDecimal totalPurPrice) {
        this.totalPurPrice = totalPurPrice;
    }

    public BigDecimal getTotalFacePrice() {
        return totalFacePrice;
    }

    public void setTotalFacePrice(BigDecimal totalFacePrice) {
        this.totalFacePrice = totalFacePrice;
    }

    public BigDecimal getTotalSalePrice() {
        return totalSalePrice;
    }

    public void setTotalSalePrice(BigDecimal totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
    }

    public BigDecimal getTotalPayCash() {
        return totalPayCash;
    }

    public void setTotalPayCash(BigDecimal totalPayCash) {
        this.totalPayCash = totalPayCash;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getRunTimeHour() {
        return runTimeHour;
    }

    public void setRunTimeHour(Integer runTimeHour) {
        this.runTimeHour = runTimeHour;
    }

    public Integer getRunTimeMinutes() {
        return runTimeMinutes;
    }

    public void setRunTimeMinutes(Integer runTimeMinutes) {
        this.runTimeMinutes = runTimeMinutes;
    }

    public Integer getRunTimeDays() {
        return runTimeDays;
    }

    public void setRunTimeDays(Integer runTimeDays) {
        this.runTimeDays = runTimeDays;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime == null ? null : etime.trim();
    }

    public String getBillTime() {
        return billTime;
    }

    public void setBillTime(String billTime) {
        this.billTime = billTime == null ? null : billTime.trim();
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId == null ? null : tplId.trim();
    }

    public Long getTotalRefundAmount() {
        return totalRefundAmount;
    }

    public void setTotalRefundAmount(Long totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(String modifiedId) {
        this.modifiedId = modifiedId == null ? null : modifiedId.trim();
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public String getDistirbuteId() {
        return distirbuteId;
    }

    public void setDistirbuteId(String distirbuteId) {
        this.distirbuteId = distirbuteId == null ? null : distirbuteId.trim();
    }

    public String getDistirbuteName() {
        return distirbuteName;
    }

    public void setDistirbuteName(String distirbuteName) {
        this.distirbuteName = distirbuteName == null ? null : distirbuteName.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public Date getTimeoutPayTime() {
        return timeoutPayTime;
    }

    public void setTimeoutPayTime(Date timeoutPayTime) {
        this.timeoutPayTime = timeoutPayTime;
    }

    public String getPayTradeNo() {
        return payTradeNo;
    }

    public void setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo == null ? null : payTradeNo.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TrainlineOrderInfo other = (TrainlineOrderInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getFrom() == null ? other.getFrom() == null : this.getFrom().equals(other.getFrom()))
            && (this.getTo() == null ? other.getTo() == null : this.getTo().equals(other.getTo()))
            && (this.getTrainNumber() == null ? other.getTrainNumber() == null : this.getTrainNumber().equals(other.getTrainNumber()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getContactTel() == null ? other.getContactTel() == null : this.getContactTel().equals(other.getContactTel()))
            && (this.getItemIdTrain() == null ? other.getItemIdTrain() == null : this.getItemIdTrain().equals(other.getItemIdTrain()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getTotalOtherFee() == null ? other.getTotalOtherFee() == null : this.getTotalOtherFee().equals(other.getTotalOtherFee()))
            && (this.getTotalPurPrice() == null ? other.getTotalPurPrice() == null : this.getTotalPurPrice().equals(other.getTotalPurPrice()))
            && (this.getTotalFacePrice() == null ? other.getTotalFacePrice() == null : this.getTotalFacePrice().equals(other.getTotalFacePrice()))
            && (this.getTotalSalePrice() == null ? other.getTotalSalePrice() == null : this.getTotalSalePrice().equals(other.getTotalSalePrice()))
            && (this.getTotalPayCash() == null ? other.getTotalPayCash() == null : this.getTotalPayCash().equals(other.getTotalPayCash()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getRunTimeHour() == null ? other.getRunTimeHour() == null : this.getRunTimeHour().equals(other.getRunTimeHour()))
            && (this.getRunTimeMinutes() == null ? other.getRunTimeMinutes() == null : this.getRunTimeMinutes().equals(other.getRunTimeMinutes()))
            && (this.getRunTimeDays() == null ? other.getRunTimeDays() == null : this.getRunTimeDays().equals(other.getRunTimeDays()))
            && (this.getEtime() == null ? other.getEtime() == null : this.getEtime().equals(other.getEtime()))
            && (this.getBillTime() == null ? other.getBillTime() == null : this.getBillTime().equals(other.getBillTime()))
            && (this.getBillState() == null ? other.getBillState() == null : this.getBillState().equals(other.getBillState()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTplId() == null ? other.getTplId() == null : this.getTplId().equals(other.getTplId()))
            && (this.getTotalRefundAmount() == null ? other.getTotalRefundAmount() == null : this.getTotalRefundAmount().equals(other.getTotalRefundAmount()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifiedId() == null ? other.getModifiedId() == null : this.getModifiedId().equals(other.getModifiedId()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()))
            && (this.getIsVisible() == null ? other.getIsVisible() == null : this.getIsVisible().equals(other.getIsVisible()))
            && (this.getDistirbuteId() == null ? other.getDistirbuteId() == null : this.getDistirbuteId().equals(other.getDistirbuteId()))
            && (this.getDistirbuteName() == null ? other.getDistirbuteName() == null : this.getDistirbuteName().equals(other.getDistirbuteName()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getTimeoutPayTime() == null ? other.getTimeoutPayTime() == null : this.getTimeoutPayTime().equals(other.getTimeoutPayTime()))
            && (this.getPayTradeNo() == null ? other.getPayTradeNo() == null : this.getPayTradeNo().equals(other.getPayTradeNo()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getFrom() == null) ? 0 : getFrom().hashCode());
        result = prime * result + ((getTo() == null) ? 0 : getTo().hashCode());
        result = prime * result + ((getTrainNumber() == null) ? 0 : getTrainNumber().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactTel() == null) ? 0 : getContactTel().hashCode());
        result = prime * result + ((getItemIdTrain() == null) ? 0 : getItemIdTrain().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getTotalOtherFee() == null) ? 0 : getTotalOtherFee().hashCode());
        result = prime * result + ((getTotalPurPrice() == null) ? 0 : getTotalPurPrice().hashCode());
        result = prime * result + ((getTotalFacePrice() == null) ? 0 : getTotalFacePrice().hashCode());
        result = prime * result + ((getTotalSalePrice() == null) ? 0 : getTotalSalePrice().hashCode());
        result = prime * result + ((getTotalPayCash() == null) ? 0 : getTotalPayCash().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getRunTimeHour() == null) ? 0 : getRunTimeHour().hashCode());
        result = prime * result + ((getRunTimeMinutes() == null) ? 0 : getRunTimeMinutes().hashCode());
        result = prime * result + ((getRunTimeDays() == null) ? 0 : getRunTimeDays().hashCode());
        result = prime * result + ((getEtime() == null) ? 0 : getEtime().hashCode());
        result = prime * result + ((getBillTime() == null) ? 0 : getBillTime().hashCode());
        result = prime * result + ((getBillState() == null) ? 0 : getBillState().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTplId() == null) ? 0 : getTplId().hashCode());
        result = prime * result + ((getTotalRefundAmount() == null) ? 0 : getTotalRefundAmount().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifiedId() == null) ? 0 : getModifiedId().hashCode());
        result = prime * result + ((getModifiedTime() == null) ? 0 : getModifiedTime().hashCode());
        result = prime * result + ((getIsVisible() == null) ? 0 : getIsVisible().hashCode());
        result = prime * result + ((getDistirbuteId() == null) ? 0 : getDistirbuteId().hashCode());
        result = prime * result + ((getDistirbuteName() == null) ? 0 : getDistirbuteName().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getTimeoutPayTime() == null) ? 0 : getTimeoutPayTime().hashCode());
        result = prime * result + ((getPayTradeNo() == null) ? 0 : getPayTradeNo().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        return result;
    }
}