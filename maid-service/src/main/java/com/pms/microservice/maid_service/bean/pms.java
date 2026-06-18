package com.pms.microservice.maid_service.bean;

public class pms {
    private int mininum;
    private int maximum;

    public pms() {
        super();
    }

    public pms(int mininum, int maximum) {
        super();
        this.mininum = mininum;
        this.maximum = maximum;
    }

    public int getMininum() {
        return mininum;
    }

    public void setMininum(int mininum) {
        this.mininum = mininum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
