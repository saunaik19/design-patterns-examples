package com.saurabh.example.designpatterns.creational.builder;

public class FeeBuilder {
    private String feeName;
    private String feeType;
    private Double feeRate;
    private Double adjValue;

    public FeeBuilder setFeeName(String feeName) {
        this.feeName = feeName;
        return this;
    }

    public FeeBuilder setFeeType(String feeType) {
        feeType = feeType;
        return this;
    }

    public FeeBuilder setFeeRate(Double feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    public FeeBuilder setAdjValue(Double adjValue) {
        this.adjValue = adjValue;
        return this;
    }

    public Fee build(){
       return new Fee(feeName,feeType,feeRate,adjValue);
    }


}
