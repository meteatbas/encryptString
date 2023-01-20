package com.example.stringencryption.leetcode;

public class TaxCalculator {
    public static float taxRate = 10;
    public float grossIncome;
    public float deduction;

    public TaxCalculator(float grossIncome, float deduction) {
        this.grossIncome = grossIncome;
        this.deduction = deduction;
    }

    public float getPayable() {
        return (TaxCalculator.taxRate / 100) * (this.grossIncome - this.deduction);
    }
}
