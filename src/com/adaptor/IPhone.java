package com.adaptor;

import com.adaptor.Charger;

public class IPhone {
    public Charger c;
    public void setcharger(Charger c){
        this.c=c;
    }
    public void chargeOn(){
        this.c.charge();
    }
}
