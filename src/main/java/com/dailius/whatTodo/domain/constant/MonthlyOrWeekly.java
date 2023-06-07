package com.dailius.whatTodo.domain.constant;

public enum MonthlyOrWeekly {
    MONTHLY("월간 목표"), WEEKLY("주간 목표");

    private final String monthlyOrWeekly;

    MonthlyOrWeekly(String monthlyOrWeekly) {
        this.monthlyOrWeekly = monthlyOrWeekly;
    }

    public String getMonthlyOrWeekly() {
        return monthlyOrWeekly;
    }
}
