package com.myapp.loosely;

import java.math.BigDecimal;

public class BalanceService {

    public boolean checkout(Balance balance, BigDecimal checkoutAmount) {
        BigDecimal balanceAmount = balance.getAmount();
        if (balanceAmount.subtract(checkoutAmount).compareTo(BigDecimal.ZERO) >= 0) {
            balance.setAmount(balanceAmount.subtract(checkoutAmount));
            return true;
        }
        return false;
    }
}
