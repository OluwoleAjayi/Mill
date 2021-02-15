package com.example.mill;

public class Word {

    private String milwokTransition;
    private String defaultTransition;

    public Word(String milwokTransition, String defaultTransition) {
        this.milwokTransition = milwokTransition;
        this.defaultTransition = defaultTransition;
    }

    public String getMilwokTransition() {
        return milwokTransition;
    }

    public void setMilwokTransition(String milwokTransition) {
        this.milwokTransition = milwokTransition;
    }

    public String getDefaultTransition() {
        return defaultTransition;
    }

    public void setDefaultTransition(String defaultTransition) {
        this.defaultTransition = defaultTransition;
    }
}
