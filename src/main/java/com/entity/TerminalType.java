package com.entity;

public class TerminalType {
    private long ftu;
    private long dtu;
    private long ttu;
    private long rtu;
    private long fbs;
    private long gz;
    private long dlx;
    private long wz;

    public long getFtu() {
        return ftu;
    }

    public void setFtu(long ftu) {
        this.ftu = ftu;
    }

    public long getDtu() {
        return dtu;
    }

    public void setDtu(long dtu) {
        this.dtu = dtu;
    }

    public long getTtu() {
        return ttu;
    }

    public void setTtu(long ttu) {
        this.ttu = ttu;
    }

    public long getRtu() {
        return rtu;
    }

    public void setRtu(long rtu) {
        this.rtu = rtu;
    }

    public long getFbs() {
        return fbs;
    }

    public void setFbs(long fbs) {
        this.fbs = fbs;
    }

    public long getGz() {
        return gz;
    }

    public void setGz(long gz) {
        this.gz = gz;
    }

    public long getDlx() {
        return dlx;
    }

    public void setDlx(long dlx) {
        this.dlx = dlx;
    }

    public long getWz() {
        return wz;
    }

    public void setWz(long wz) {
        this.wz = wz;
    }

    @Override
    public String toString() {
        return "TerminalType{" +
                "ftu=" + ftu +
                ", dtu=" + dtu +
                ", ttu=" + ttu +
                ", rtu=" + rtu +
                ", fbs=" + fbs +
                ", gz=" + gz +
                ", dlx=" + dlx +
                ", wz=" + wz +
                '}';
    }
}
