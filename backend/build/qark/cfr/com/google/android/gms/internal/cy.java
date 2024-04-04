/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  org.json.JSONException
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.aj;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cz;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.List;
import org.json.JSONException;

public final class cy
extends ef
implements de,
fa {
    private final bl a;
    private final cx b;
    private final ev c;
    private final Context d;
    private final Object e = new Object();
    private final dl f;
    private final is g;
    private ef h;
    private cb i;
    private boolean j = false;
    private aj k;
    private am l;
    private ar m;

    public cy(Context context, dl dl2, is is2, ev ev2, bl bl2, cx cx2) {
        this.a = bl2;
        this.b = cx2;
        this.c = ev2;
        this.d = context;
        this.f = dl2;
        this.g = is2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private x a(bz bz2) {
        if (this.i.n == null) {
            throw new dc("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] arrstring = this.i.n.split("x");
        if (arrstring.length != 2) {
            throw new dc("Could not parse the ad size from the ad response: " + this.i.n, 0);
        }
        try {}
        catch (NumberFormatException numberFormatException) {
            throw new dc("Could not parse the ad size from the ad response: " + this.i.n, 0);
        }
        int n2 = Integer.parseInt((String)arrstring[0]);
        int n3 = Integer.parseInt((String)arrstring[1]);
        arrstring = bz2.e.i;
        int n4 = arrstring.length;
        int n5 = 0;
        do {
            if (n5 >= n4) {
                throw new dc("The ad size from the ad response was not one of the requested sizes: " + this.i.n, 0);
            }
            String string = arrstring[n5];
            float f2 = this.d.getResources().getDisplayMetrics().density;
            int n6 = string.g == -1 ? (int)((float)string.h / f2) : string.g;
            int n7 = string.d == -2 ? (int)((float)string.e / f2) : string.d;
            if (n2 == n6 && n3 == n7) {
                return new x((x)((Object)string), bz2.e.i);
            }
            ++n5;
        } while (true);
    }

    static /* synthetic */ Object a(cy cy2) {
        return cy2.e;
    }

    private void a(long l2) {
        es.a.post((Runnable)new db(this));
        this.c(l2);
    }

    private void a(bz bz2, long l2) {
        this.k = new aj(this.d, bz2, this.a, this.l);
        this.m = this.k.a(l2, 60000L);
        switch (this.m.a) {
            default: {
                throw new dc("Unexpected mediation result: " + this.m.a, 0);
            }
            case 1: {
                throw new dc("No fill from any mediation ad networks.", 3);
            }
            case 0: 
        }
    }

    static /* synthetic */ cx b(cy cy2) {
        return cy2.b;
    }

    private void b(long l2) {
        do {
            if (this.d(l2)) continue;
            throw new dc("Timed out waiting for ad response.", 2);
        } while (this.i == null);
        this.h = null;
        if (this.i.f != -2 && this.i.f != -3) {
            throw new dc("There was a problem getting an ad response. ErrorCode: " + this.i.f, this.i.f);
        }
    }

    static /* synthetic */ cb c(cy cy2) {
        return cy2.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        block7 : {
            block6 : {
                if (this.i.f == -3) break block6;
                if (TextUtils.isEmpty((CharSequence)this.i.d)) {
                    throw new dc("No fill from ad server.", 3);
                }
                if (this.i.i) break block7;
            }
            return;
        }
        try {
            this.l = new am(this.i.d);
            return;
        }
        catch (JSONException jSONException) {
            throw new dc("Could not parse mediation config: " + this.i.d, 0);
        }
    }

    private void c(long l2) {
        do {
            if (this.d(l2)) continue;
            throw new dc("Timed out waiting for WebView to finish loading.", 2);
        } while (!this.j);
    }

    static /* synthetic */ ev d(cy cy2) {
        return cy2.c;
    }

    private boolean d(long l2) {
        l2 = 60000L - (SystemClock.elapsedRealtime() - l2);
        if (l2 <= 0L) {
            return false;
        }
        try {
            this.e.wait(l2);
            return true;
        }
        catch (InterruptedException interruptedException) {
            throw new dc("Ad request cancelled.", -1);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        var11_1 = this.e;
        // MONITORENTER : var11_1
        et.a("AdLoaderBackgroundTask started.");
        var6_2 = this.g.a().a(this.d);
        var9_4 = new bz(this.f, (String)var6_2);
        var6_2 = null;
        var8_5 = null;
        var1_6 = -2;
        var7_7 = var8_5;
        try {
            var3_8 = SystemClock.elapsedRealtime();
            var7_7 = var8_5;
            this.h = dd.a(this.d, (bz)var9_4, this);
            var7_7 = var8_5;
            if (this.h == null) {
                var7_7 = var8_5;
                throw new dc("Could not start the ad request service.", 0);
            }
            var7_7 = var8_5;
            this.b(var3_8);
            var7_7 = var8_5;
            this.c();
            var7_7 = var8_5;
            if (var9_4.e.i != null) {
                var7_7 = var8_5;
                var6_2 = this.a((bz)var9_4);
            }
            var7_7 = var6_2;
            if (!this.i.i) ** GOTO lbl36
            var7_7 = var6_2;
            this.a((bz)var9_4, var3_8);
            ** GOTO lbl45
        }
        catch (dc var6_3) {
            block11 : {
                block10 : {
                    block9 : {
                        var1_6 = var6_3.a();
                        if (var1_6 != 3 && var1_6 != -1) break block9;
                        et.c(var6_3.getMessage());
                        break block10;
lbl36: // 1 sources:
                        var7_7 = var6_2;
                        this.a(var3_8);
                        break block11;
                    }
                    et.e(var6_3.getMessage());
                }
                this.i = new cb(var1_6);
                es.a.post((Runnable)new cz(this));
                var6_2 = var7_7;
            }
            var12_9 = var9_4.d;
            var13_10 = this.c;
            var14_11 = this.i.e;
            var15_12 = this.i.g;
            var16_13 = this.i.k;
            var2_14 = this.i.m;
            var3_8 = this.i.l;
            var17_15 = var9_4.j;
            var5_16 = this.i.i;
            var7_7 = this.m != null ? this.m.b : null;
            var8_5 = this.m != null ? this.m.c : null;
            var9_4 = this.m != null ? this.m.d : null;
            var18_17 = this.l;
            var10_18 = this.m != null ? this.m.e : null;
            var6_2 = new ec(var12_9, var13_10, var14_11, var1_6, var15_12, var16_13, var2_14, var3_8, var17_15, var5_16, (al)var7_7, (bp)var8_5, (String)var9_4, var18_17, var10_18, this.i.j, (x)var6_2, this.i.h);
            es.a.post((Runnable)new da(this, (ec)var6_2));
            // MONITOREXIT : var11_1
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(cb cb2) {
        Object object = this.e;
        synchronized (object) {
            et.a("Received ad response.");
            this.i = cb2;
            this.e.notify();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(ev object) {
        object = this.e;
        synchronized (object) {
            et.a("WebView finished loading.");
            this.j = true;
            this.e.notify();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        Object object = this.e;
        synchronized (object) {
            if (this.h != null) {
                this.h.f();
            }
            this.c.stopLoading();
            em.a(this.c);
            if (this.k != null) {
                this.k.a();
            }
            return;
        }
    }
}

