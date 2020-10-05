package com.lex418.microservices.limitsservice;

public class LimitConfiguration {

    private int maximum;
    private int minimum;

    public LimitConfiguration(){}

    public LimitConfiguration(int maximum, int minimum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "LimitConfiguration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
