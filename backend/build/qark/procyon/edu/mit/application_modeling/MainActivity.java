// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package edu.mit.application_modeling;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity
{
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903040);
        ((MyApplication)this.getApplication()).imei = ((TelephonyManager)this.getSystemService("phone")).getDeviceId();
        new Intent((Context)this, (Class)AnotherActivity.class);
    }
}
