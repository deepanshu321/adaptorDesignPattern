package com.adaptor;

import com.thirdpartycharger.MiCharger;
import com.thirdpartycharger.SamsungCharger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IPhone phone=new IPhone();
        Charger c=new AdaptorCharger(new MiCharger());
        phone.setcharger(c);
        phone.chargeOn();
    }
}