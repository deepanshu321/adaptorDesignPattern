package com.adaptor;

import com.thirdpartycharger.ThirdpartyCharger;

public class AdaptorCharger implements Charger{
    ThirdpartyCharger tc;
    public AdaptorCharger(ThirdpartyCharger tc){
        this.tc=tc;
    }
    @Override
    public void charge() {
        tc.start();
    }
}
