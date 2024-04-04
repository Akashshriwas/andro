/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Exception
 *  java.lang.String
 */
package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mm.pr;

class ak
extends BroadcastReceiver {
    final /* synthetic */ pr a;

    ak(pr pr2) {
        this.a = pr2;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            intent.getAction().compareTo("android.intent.action.HEADSET_PLUG");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

