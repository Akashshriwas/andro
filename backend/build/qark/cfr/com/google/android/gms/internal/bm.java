/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.b;
import com.google.android.gms.a.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.cg;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.s;

public final class bm
implements SafeParcelable {
    public static final cg a = new cg();
    public final int b;
    public final bj c;
    public final jt d;
    public final ch e;
    public final ev f;
    public final s g;
    public final String h;
    public final boolean i;
    public final String j;
    public final cm k;
    public final int l;
    public final int m;
    public final String n;
    public final ct o;

    bm(int n2, bj bj2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String string, boolean bl2, String string2, IBinder iBinder5, int n3, int n4, String string3, ct ct2) {
        this.b = n2;
        this.c = bj2;
        this.d = (jt)d.a(b.a(iBinder));
        this.e = (ch)d.a(b.a(iBinder2));
        this.f = (ev)((Object)d.a(b.a(iBinder3)));
        this.g = (s)d.a(b.a(iBinder4));
        this.h = string;
        this.i = bl2;
        this.j = string2;
        this.k = (cm)d.a(b.a(iBinder5));
        this.l = n3;
        this.m = n4;
        this.n = string3;
        this.o = ct2;
    }

    public bm(bj bj2, jt jt2, ch ch2, cm cm2, ct ct2) {
        this.b = 1;
        this.c = bj2;
        this.d = jt2;
        this.e = ch2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = cm2;
        this.l = -1;
        this.m = 4;
        this.n = null;
        this.o = ct2;
    }

    public bm(jt jt2, ch ch2, cm cm2, ev ev2, int n2, ct ct2) {
        this.b = 1;
        this.c = null;
        this.d = jt2;
        this.e = ch2;
        this.f = ev2;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = cm2;
        this.l = n2;
        this.m = 1;
        this.n = null;
        this.o = ct2;
    }

    public bm(jt jt2, ch ch2, cm cm2, ev ev2, boolean bl2, int n2, ct ct2) {
        this.b = 1;
        this.c = null;
        this.d = jt2;
        this.e = ch2;
        this.f = ev2;
        this.g = null;
        this.h = null;
        this.i = bl2;
        this.j = null;
        this.k = cm2;
        this.l = n2;
        this.m = 2;
        this.n = null;
        this.o = ct2;
    }

    public bm(jt jt2, ch ch2, s s2, cm cm2, ev ev2, boolean bl2, int n2, String string, ct ct2) {
        this.b = 1;
        this.c = null;
        this.d = jt2;
        this.e = ch2;
        this.f = ev2;
        this.g = s2;
        this.h = null;
        this.i = bl2;
        this.j = null;
        this.k = cm2;
        this.l = n2;
        this.m = 3;
        this.n = string;
        this.o = ct2;
    }

    public bm(jt jt2, ch ch2, s s2, cm cm2, ev ev2, boolean bl2, int n2, String string, String string2, ct ct2) {
        this.b = 1;
        this.c = null;
        this.d = jt2;
        this.e = ch2;
        this.f = ev2;
        this.g = s2;
        this.h = string2;
        this.i = bl2;
        this.j = string;
        this.k = cm2;
        this.l = n2;
        this.m = 3;
        this.n = null;
        this.o = ct2;
    }

    public static bm a(Intent object) {
        try {
            object = object.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            object.setClassLoader(bm.class.getClassLoader());
            object = (bm)object.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(Intent intent, bm bm2) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", (Parcelable)bm2);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder a() {
        return d.a(this.d).asBinder();
    }

    IBinder b() {
        return d.a(this.e).asBinder();
    }

    IBinder c() {
        return d.a((Object)this.f).asBinder();
    }

    IBinder d() {
        return d.a(this.g).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    IBinder e() {
        return d.a(this.k).asBinder();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        cg.a(this, parcel, n2);
    }
}

