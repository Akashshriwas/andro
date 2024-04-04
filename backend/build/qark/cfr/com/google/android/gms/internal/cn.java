/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;
import com.google.android.gms.a.f;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.co;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.cs;
import com.google.android.gms.internal.cu;
import com.google.android.gms.internal.et;

public final class cn
extends e {
    private static final cn a = new cn();

    private cn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static cp a(Activity object) {
        try {
            if (cn.b((Activity)object)) {
                et.a("Using AdOverlay from the client jar.");
                return new cc((Activity)object);
            }
            object = a.c((Activity)object);
            return object;
        }
        catch (co co2) {
            et.e(co2.getMessage());
            return null;
        }
    }

    private static boolean b(Activity activity) {
        if (!(activity = activity.getIntent()).hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            throw new co("Ad overlay requires the useClientJar flag in intent extras.");
        }
        return activity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
    }

    private cp c(Activity object) {
        try {
            a a2 = d.a(object);
            object = cq.a(((cs)this.a((Context)object)).a(a2));
            return object;
        }
        catch (RemoteException remoteException) {
            et.b("Could not create remote AdOverlay.", (Throwable)remoteException);
            return null;
        }
        catch (f f2) {
            et.b("Could not create remote AdOverlay.", (Throwable)f2);
            return null;
        }
    }

    @Override
    protected /* synthetic */ Object a(IBinder iBinder) {
        return this.b(iBinder);
    }

    protected cs b(IBinder iBinder) {
        return cu.a(iBinder);
    }
}

