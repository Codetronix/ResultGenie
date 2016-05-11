package com.rg.utils;

/**
 * Created by prathyush on 5/11/16.
 */
public class Subject {

    private String name;
    private int internalMarks;
    private int externalMarks;
    private int totalMarks;
    private boolean  result;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInternalMarks() {
        return internalMarks;
    }

    public void setInternalMarks(int internalMarks) {
        this.internalMarks = internalMarks;
    }

    public int getExternalMarks() {
        return externalMarks;
    }

    public void setExternalMarks(int externalMarks) {
        this.externalMarks = externalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
