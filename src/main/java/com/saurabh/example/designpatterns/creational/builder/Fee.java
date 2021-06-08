package com.saurabh.example.designpatterns.creational.builder;

public class Fee {
    private String feeName;
    private String feeType;
    private Double feeRate;
    private Double adjValue;

    public Fee(String feeName, String feeType, Double feeRate, Double adjValue) {
        this.feeName = feeName;
        this.feeType = feeType;
        this.feeRate = feeRate;
        this.adjValue = adjValue;
    }

    public String getFeeName() {
        return feeName;
    }

    public String getFeeType() {
        return feeType;
    }

    public Double getFeeRate() {
        return feeRate;
    }

    public Double getAdjValue() {
        return adjValue;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "feeName='" + feeName + '\'' +
                ", feeType='" + feeType + '\'' +
                ", feeRate=" + feeRate +
                ", adjValue=" + adjValue +
                '}';
    }
}
