/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.telephony.TelephonyManager
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package edu.mit.application_modeling;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import edu.mit.application_modeling.AnotherActivity;
import edu.mit.application_modeling.MyApplication;

public class MainActivity
extends Activity {
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(2130903040);
        ((MyApplication)this.getApplication()).imei = object = ((TelephonyManager)this.getSystemService("phone")).getDeviceId();
        new Intent((Context)this, AnotherActivity.class);
    }
}

