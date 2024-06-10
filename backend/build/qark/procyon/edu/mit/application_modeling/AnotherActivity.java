// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package edu.mit.application_modeling;

import android.util.Log;
import android.os.Bundle;
import android.app.Activity;

public class AnotherActivity extends Activity
{
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903040);
        Log.i("DroidBench", ((MyApplication)this.getApplication()).imei);
    }
}
