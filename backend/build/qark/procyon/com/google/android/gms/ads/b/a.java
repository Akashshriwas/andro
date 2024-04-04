// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.ads.b;

import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.e;
import android.content.Intent;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.jq;
import com.google.android.gms.common.i;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.io.IOException;
import android.util.Log;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.hc;
import android.content.Context;

public final class a
{
    public static b a(final Context context) {
        hc.c("Calling this from your main thread can lead to deadlock");
        final i b = b(context);
        try {
            final jq a = jr.a(b.a());
            return new b(a.a(), a.a(true));
        }
        catch (RemoteException ex) {
            Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex);
            throw new IOException("Remote exception");
        }
        catch (InterruptedException ex2) {
            throw new IOException("Interrupted exception");
        }
        finally {
            context.unbindService((ServiceConnection)b);
        }
    }
    
    private static i b(final Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            final Context context2 = context;
            g.b(context2);
            final i i = new i();
            final String s = "com.google.android.gms.ads.identifier.service.START";
            final Intent intent = new Intent(s);
            final Intent intent3;
            final Intent intent2 = intent3 = intent;
            final String s2 = "com.google.android.gms";
            intent3.setPackage(s2);
            final Context context3 = context;
            final Intent intent4 = intent2;
            final Object o = i;
            final int n = 1;
            final boolean b = context3.bindService(intent4, (ServiceConnection)o, n);
            if (b) {
                return i;
            }
            throw new IOException("Connection failure");
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new e(9);
        }
        try {
            final Context context2 = context;
            g.b(context2);
            final i i = new i();
            final String s = "com.google.android.gms.ads.identifier.service.START";
            final Intent intent = new Intent(s);
            final Intent intent3;
            final Intent intent2 = intent3 = intent;
            final String s2 = "com.google.android.gms";
            intent3.setPackage(s2);
            final Context context3 = context;
            final Intent intent4 = intent2;
            final Object o = i;
            final int n = 1;
            final boolean b = context3.bindService(intent4, (ServiceConnection)o, n);
            if (b) {
                return i;
            }
        }
        catch (e cause) {
            throw new IOException(cause);
        }
        throw new IOException("Connection failure");
    }
}
