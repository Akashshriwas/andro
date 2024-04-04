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
import mm.m;

class ab
extends BroadcastReceiver {
    final /* synthetic */ m a;

    ab(m m2) {
        this.a = m2;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (m.h(this.a) != null) {
                m.h(this.a).a(new d().a());
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

