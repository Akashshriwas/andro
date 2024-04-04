/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.fx;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.hc;

public final class gc
extends gp {
    private fx a;

    public gc(fx fx2) {
        this.a = fx2;
    }

    @Override
    public void a(int n2, IBinder iBinder, Bundle bundle) {
        hc.a("onPostInitComplete can be called only once per call to getServiceFromBroker", (Object)this.a);
        this.a.a(n2, iBinder, bundle);
        this.a = null;
    }
}

