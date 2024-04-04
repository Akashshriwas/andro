/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.aj;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.et;

class ak
implements Runnable {
    final /* synthetic */ ar a;
    final /* synthetic */ aj b;

    ak(aj aj2, ar ar2) {
        this.b = aj2;
        this.a = ar2;
    }

    public void run() {
        try {
            this.a.c.c();
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not destroy mediation adapter.", (Throwable)remoteException);
            return;
        }
    }
}

