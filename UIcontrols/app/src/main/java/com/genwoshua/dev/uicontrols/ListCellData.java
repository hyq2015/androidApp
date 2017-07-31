package com.genwoshua.dev.uicontrols;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2017/7/31.
 */

public class ListCellData {


    public ListCellData(Context context, String controlName, Intent relatedIntent){
        this.controlName=controlName;
        this.context=context;
        this.relatedIntent=relatedIntent;
    }
    private String controlName="";

    public String getControlName() {
        return controlName;
    }
    private Context context=null;

    public Context getContext() {
        return context;
    }
    public void StartActivity(){
        //TODO
        getContext().startActivity(getRelatedIntent());
    }

    private Intent relatedIntent=null;

    public Intent getRelatedIntent() {
        return relatedIntent;
    }

    @Override
    public String toString() {
        return getControlName();
    }
}
