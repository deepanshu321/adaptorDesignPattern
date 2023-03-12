package com.thirdpartycharger;

public class MiCharger implements ThirdpartyCharger{
    @Override
    public void start() {
        System.out.println("charging start through Mi charger");
    }
}
