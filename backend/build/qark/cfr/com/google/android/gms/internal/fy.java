/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.fx;
import com.google.android.gms.internal.ga;

final class fy
extends Handler {
    final /* synthetic */ fx a;

    public fy(fx fx2, Looper looper) {
        this.a = fx2;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void handleMessage(Message object) {
        if (object.what == 1 && !this.a.f()) {
            object = (ga)object.obj;
            object.a();
            object.c();
            return;
        }
        Object object2 = fx.b(this.a);
        // MONITORENTER : object2
        this.a.c = false;
        // MONITOREXIT : object2
        if (object.what == 3) {
            fx.a(this.a).a(new a((Integer)object.obj, null));
            return;
        }
        if (object.what == 2 && !this.a.e()) {
            object = (ga)object.obj;
            object.a();
            object.c();
            return;
        }
        if (object.what != 2 && object.what != 1) {
            Log.wtf((String)"GmsClient", (String)"Don't know how to handle this message.");
            return;
        }
        ((ga)object.obj).b();
    }
}

