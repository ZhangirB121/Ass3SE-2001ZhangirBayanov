package com.company;

public class Archmage extends WizardDecorator{

    public Archmage(Wizard doctor) {
        super(doctor);
    }

    public String higherMagic(){
        return "Higher magic. ";
    }

    @Override
    public String conjure() {
        return super.conjure() + higherMagic();
    }
}
