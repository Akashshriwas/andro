/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.fx;

final class ge
implements ServiceConnection {
    final /* synthetic */ fx a;

    ge(fx fx2) {
        this.a = fx2;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.c(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        fx.a(this.a, null);
        fx.a(this.a).b();
    }
}

