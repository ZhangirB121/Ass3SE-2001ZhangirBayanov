package com.company;

public class WizardDecorator implements Wizard{

    private Wizard wizard;

    public WizardDecorator(Wizard doctor) {
        this.wizard = doctor;
    }

    @Override
    public String conjure() {
        return wizard.conjure();
    }
}
