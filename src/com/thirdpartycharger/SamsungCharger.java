package com.thirdpartycharger;

public class SamsungCharger implements ThirdpartyCharger{
    @Override
    public void start() {
        System.out.println("chargin start through samsung charger");
    }
}
