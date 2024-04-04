/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.internal.gh;
import java.util.ArrayList;

final class gi
extends Handler {
    final /* synthetic */ gh a;

    public gi(gh gh2, Looper looper) {
        this.a = gh2;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleMessage(Message message) {
        if (message.what != 1) {
            Log.wtf((String)"GmsClientEvents", (String)"Don't know how to handle this message.");
            return;
        }
        ArrayList arrayList = gh.a(this.a);
        synchronized (arrayList) {
            if (gh.b(this.a).l() && gh.b(this.a).e() && gh.a(this.a).contains(message.obj)) {
                Bundle bundle = gh.b(this.a).j();
                ((c)message.obj).a(bundle);
            }
            return;
        }
    }
}

