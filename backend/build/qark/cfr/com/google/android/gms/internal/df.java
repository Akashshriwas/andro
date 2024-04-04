/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.et;

public abstract class df
extends ef {
    private final bz a;
    private final de b;

    public df(bz bz2, de de2) {
        this.a = bz2;
        this.b = de2;
    }

    private static cb a(dp object, bz bz2) {
        try {
            object = object.a(bz2);
            return object;
        }
        catch (RemoteException remoteException) {
            et.b("Could not fetch ad response from ad request service.", (Throwable)remoteException);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        try {
            Object object = this.d();
            if (object == null) {
                object = new cb(0);
            } else {
                cb cb2 = df.a((dp)object, this.a);
                object = cb2;
                if (cb2 == null) {
                    object = new cb(0);
                }
            }
            this.b.a((cb)object);
            return;
        }
        finally {
            this.c();
        }
    }

    @Override
    public final void b() {
        this.c();
    }

    public abstract void c();

    public abstract dp d();
}

