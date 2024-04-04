// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.a.f;
import android.os.RemoteException;
import com.google.android.gms.a.d;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import com.google.android.gms.a.e;

public final class cn extends e
{
    private static final cn a;
    
    static {
        a = new cn();
    }
    
    private cn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }
    
    public static cp a(final Activity activity) {
        try {
            if (b(activity)) {
                et.a("Using AdOverlay from the client jar.");
                return new cc(activity);
            }
            return cn.a.c(activity);
        }
        catch (co co) {
            et.e(co.getMessage());
            return null;
        }
    }
    
    private static boolean b(final Activity activity) {
        final Intent intent = activity.getIntent();
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            throw new co("Ad overlay requires the useClientJar flag in intent extras.");
        }
        return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
    }
    
    private cp c(final Activity activity) {
        try {
            return cq.a(((cs)this.a((Context)activity)).a(d.a(activity)));
        }
        catch (RemoteException ex) {
            et.b("Could not create remote AdOverlay.", (Throwable)ex);
            return null;
        }
        catch (f f) {
            et.b("Could not create remote AdOverlay.", f);
            return null;
        }
    }
    
    protected cs b(final IBinder binder) {
        return cu.a(binder);
    }
}
