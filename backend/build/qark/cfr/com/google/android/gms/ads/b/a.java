/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.ads.b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.jr;
import java.io.IOException;

public final class a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a(Context context) {
        hc.c("Calling this from your main thread can lead to deadlock");
        i i2 = a.b(context);
        try {
            Object object = jr.a(i2.a());
            object = new b(object.a(), object.a(true));
            return object;
        }
        catch (RemoteException remoteException) {
            Log.i((String)"AdvertisingIdClient", (String)"GMS remote exception ", (Throwable)remoteException);
            throw new IOException("Remote exception");
        }
        catch (InterruptedException interruptedException) {
            throw new IOException("Interrupted exception");
        }
        finally {
            context.unbindService((ServiceConnection)i2);
        }
    }

    private static i b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new e(9);
        }
        try {
            g.b(context);
        }
        catch (e e2) {
            throw new IOException((Throwable)e2);
        }
        i i2 = new i();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, (ServiceConnection)i2, 1)) {
            return i2;
        }
        throw new IOException("Connection failure");
    }
}

