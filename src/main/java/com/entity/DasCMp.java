package com.entity;
public class DasCMp {
    private  String mpId;
    private String mpNo;
    private String mpName;
    private String switchNo;

    public String getMpId() {
        return mpId;
    }

    public void setMpId(String mpId) {
        this.mpId = mpId;
    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getMpName() {
        return mpName;
    }

    public void setMpName(String mpName) {
        this.mpName = mpName;
    }

    public String getSwitchNo() {
        return switchNo;
    }

    public void setSwitchNo(String switchNo) {
        this.switchNo = switchNo;
    }

    @Override
    public String toString() {
        return "DasCMp{" +
                "mpId='" + mpId + '\'' +
                ", mpNo='" + mpNo + '\'' +
                ", mpName='" + mpName + '\'' +
                ", switchNo='" + switchNo + '\'' +
                '}';
    }
}
