package com.example.task05;

import java.util.Objects;

public class Salary implements Sendable<Integer> {
    private String to;
    private String from;
    private int moneyCount;

    public Salary(String fromCompany, String toPerson, int moneyCount) {
        Objects.requireNonNull(toPerson);
        Objects.requireNonNull(fromCompany);

        this.to = toPerson;
        this.from = fromCompany;
        this.moneyCount = moneyCount;
    }

    @Override
    public String getTo() {
        return this.to;
    }

    @Override
    public String getFrom() {
        return this.from;
    }

    @Override
    public Integer getContent() {
        return this.moneyCount;
    }

    public int getMoneyCount(){ return this.moneyCount;}
}
