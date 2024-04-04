/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Exception
 */
package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.d;
import mm.pr;

class al
extends BroadcastReceiver {
    final /* synthetic */ pr a;

    al(pr pr2) {
        this.a = pr2;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (pr.c(this.a) != null) {
                pr.c(this.a).a(new d().a());
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

