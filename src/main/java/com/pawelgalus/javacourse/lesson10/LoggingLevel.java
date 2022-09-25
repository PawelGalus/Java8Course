package com.pawelgalus.javacourse.lesson10;

public enum LoggingLevel {
    PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, ""), ERROR(4, "some text");

    private int i;
    private String str;

    private LoggingLevel(int i, String str) {
        this.i = i;
        this.str = str;
    }

    public int code() {
        return i;
    }

}