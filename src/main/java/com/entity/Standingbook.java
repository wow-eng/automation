package com.entity;

import java.io.Serializable;

/**
 * (Standingbook)实体类
 *
 * @author makejava
 * @since 2020-12-01 16:41:33
 */
public class Standingbook implements Serializable {
    private static final long serialVersionUID = -62835632236116591L;
    
    private String terminalId;
    
    private String terminalName;
    
    private String chanName;
    
    private String equipType;
    
    private String chanType;
    
    private String factoryName;
    
    private String factoryId;


    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getChanName() {
        return chanName;
    }

    public void setChanName(String chanName) {
        this.chanName = chanName;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public String getChanType() {
        return chanType;
    }

    public void setChanType(String chanType) {
        this.chanType = chanType;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

}