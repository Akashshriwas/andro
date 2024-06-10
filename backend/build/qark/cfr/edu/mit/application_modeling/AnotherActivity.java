/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.String
 */
package edu.mit.application_modeling;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import edu.mit.application_modeling.MyApplication;

public class AnotherActivity
extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903040);
        Log.i((String)"DroidBench", (String)((MyApplication)this.getApplication()).imei);
    }
}

