package com.atmcard;
public interface ATMoperationInterface {
    public void  viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount);
    public void viewMiniStatement();
}
