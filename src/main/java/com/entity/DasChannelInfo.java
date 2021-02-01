package com.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DasChannelInfo)实体类
 *
 * @author makejava
 * @since 2021-02-01 19:53:00
 */
public class DasChannelInfo implements Serializable {
    private static final long serialVersionUID = 142404873684868070L;
    
    private String chanId;
    
    private String commFacId;
    
    private String terminalId;
    
    private String chanNo;
    
    private String chanName;
    
    private String chanType;
    
    private String netDescription;
    
    private String orgId;
    
    private Date updateDate;
    
    private Date fileDate;
    
    private String delflag;


    public String getChanId() {
        return chanId;
    }

    public void setChanId(String chanId) {
        this.chanId = chanId;
    }

    public String getCommFacId() {
        return commFacId;
    }

    public void setCommFacId(String commFacId) {
        this.commFacId = commFacId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getChanNo() {
        return chanNo;
    }

    public void setChanNo(String chanNo) {
        this.chanNo = chanNo;
    }

    public String getChanName() {
        return chanName;
    }

    public void setChanName(String chanName) {
        this.chanName = chanName;
    }

    public String getChanType() {
        return chanType;
    }

    public void setChanType(String chanType) {
        this.chanType = chanType;
    }

    public String getNetDescription() {
        return netDescription;
    }

    public void setNetDescription(String netDescription) {
        this.netDescription = netDescription;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

}