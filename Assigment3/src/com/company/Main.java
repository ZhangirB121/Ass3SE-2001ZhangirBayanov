package com.company;

public class Main {

    public static void main(String[] args) {
        Wizard wizard = new Archmage(new Pyromaniac(new Pyromancer()));

        System.out.println(wizard.conjure());
    }
}
