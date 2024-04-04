/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.RemoteException
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import android.view.View;
import com.google.a.a.b;
import com.google.a.a.d;
import com.google.a.a.e;
import com.google.a.a.f;
import com.google.a.a.g;
import com.google.a.a.j;
import com.google.a.c;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.bq;
import com.google.android.gms.internal.bs;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.bx;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class bv
extends bq {
    private final b a;
    private final j b;

    public bv(b b2, j j2) {
        this.a = b2;
        this.b = j2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private g a(String var1_1, int var2_3, String var3_4) {
        if (var1_1 == null) ** GOTO lbl11
        try {
            block5 : {
                var4_5 = new JSONObject((String)var1_1);
                var1_1 = new HashMap(var4_5.length());
                var5_6 = var4_5.keys();
                while (var5_6.hasNext()) {
                    var6_7 = (String)var5_6.next();
                    var1_1.put((Object)var6_7, (Object)var4_5.getString(var6_7));
                }
                break block5;
lbl11: // 1 sources:
                var1_1 = new HashMap(0);
            }
            var5_6 = this.a.c();
            var4_5 = null;
            if (var5_6 != null) {
                var4_5 = (g)var5_6.newInstance();
                var4_5.a((Map)var1_1);
            }
            if (var4_5 instanceof com.google.a.a.a.a == false) return var4_5;
            var1_1 = (com.google.a.a.a.a)var4_5;
            var1_1.b = var3_4;
            var1_1.c = var2_3;
            return var4_5;
        }
        catch (Throwable var1_2) {
            et.b("Could not get MediationServerParameters.", var1_2);
            throw new RemoteException();
        }
    }

    @Override
    public a a() {
        if (!(this.a instanceof com.google.a.a.c)) {
            et.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            a a2 = com.google.android.gms.a.d.a((Object)((com.google.a.a.c)this.a).d());
            return a2;
        }
        catch (Throwable throwable) {
            et.b("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
    }

    @Override
    public void a(a a2, v v2, String string, bs bs2) {
        this.a(a2, v2, string, null, bs2);
    }

    @Override
    public void a(a a2, v v2, String string, String string2, bs bs2) {
        if (!(this.a instanceof e)) {
            et.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        et.a("Requesting interstitial ad from adapter.");
        try {
            ((e)this.a).a(new bw(bs2), (Activity)com.google.android.gms.a.d.a(a2), this.a(string, v2.h, string2), bx.a(v2), this.b);
            return;
        }
        catch (Throwable throwable) {
            et.b("Could not request interstitial ad from adapter.", throwable);
            throw new RemoteException();
        }
    }

    @Override
    public void a(a a2, x x2, v v2, String string, bs bs2) {
        this.a(a2, x2, v2, string, null, bs2);
    }

    @Override
    public void a(a a2, x x2, v v2, String string, String string2, bs bs2) {
        if (!(this.a instanceof com.google.a.a.c)) {
            et.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        et.a("Requesting banner ad from adapter.");
        try {
            ((com.google.a.a.c)this.a).a(new bw(bs2), (Activity)com.google.android.gms.a.d.a(a2), this.a(string, v2.h, string2), bx.a(x2), bx.a(v2), this.b);
            return;
        }
        catch (Throwable throwable) {
            et.b("Could not request banner ad from adapter.", throwable);
            throw new RemoteException();
        }
    }

    @Override
    public void b() {
        if (!(this.a instanceof e)) {
            et.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        et.a("Showing interstitial from adapter.");
        try {
            ((e)this.a).d();
            return;
        }
        catch (Throwable throwable) {
            et.b("Could not show interstitial from adapter.", throwable);
            throw new RemoteException();
        }
    }

    @Override
    public void c() {
        try {
            this.a.a();
            return;
        }
        catch (Throwable throwable) {
            et.b("Could not destroy adapter.", throwable);
            throw new RemoteException();
        }
    }
}

