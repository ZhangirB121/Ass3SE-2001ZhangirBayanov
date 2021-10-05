package com.company;

public class Pyromaniac extends WizardDecorator{

    public Pyromaniac(Wizard doctor) {
        super(doctor);
    }

    String fireMagic(){
        return "Firestorm. ";
    }

    @Override
    public String conjure() {
        return super.conjure() + fireMagic();
    }
}
