/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.telephony.SmsManager
 *  android.telephony.TelephonyManager
 *  android.view.View
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package de.ecspride;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Toast;

public class Button1
extends Activity {
    private static String imei = null;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903040);
        imei = ((TelephonyManager)this.getSystemService("phone")).getDeviceId();
    }

    public void sendMessage(View view) {
        Toast.makeText((Context)this, (CharSequence)imei, (int)1).show();
        SmsManager.getDefault().sendTextMessage("+49", null, imei, null, null);
    }
}

