package com.Enum;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    Operation(String symbol) {this.symbol = symbol;}



}



