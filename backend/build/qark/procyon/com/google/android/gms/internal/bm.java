// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.gms.a.d;
import com.google.android.gms.a.b;
import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class bm implements SafeParcelable
{
    public static final cg a;
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
    
    static {
        a = new cg();
    }
    
    bm(final int b, final bj c, final IBinder binder, final IBinder binder2, final IBinder binder3, final IBinder binder4, final String h, final boolean i, final String j, final IBinder binder5, final int l, final int m, final String n, final ct o) {
        this.b = b;
        this.c = c;
        this.d = (jt)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(binder));
        this.e = (ch)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(binder2));
        this.f = (ev)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(binder3));
        this.g = (s)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(binder4));
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = (cm)com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(binder5));
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public bm(final bj c, final jt d, final ch e, final cm k, final ct o) {
        this.b = 1;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = k;
        this.l = -1;
        this.m = 4;
        this.n = null;
        this.o = o;
    }
    
    public bm(final jt d, final ch e, final cm k, final ev f, final int l, final ct o) {
        this.b = 1;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = k;
        this.l = l;
        this.m = 1;
        this.n = null;
        this.o = o;
    }
    
    public bm(final jt d, final ch e, final cm k, final ev f, final boolean i, final int l, final ct o) {
        this.b = 1;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = null;
        this.h = null;
        this.i = i;
        this.j = null;
        this.k = k;
        this.l = l;
        this.m = 2;
        this.n = null;
        this.o = o;
    }
    
    public bm(final jt d, final ch e, final s g, final cm k, final ev f, final boolean i, final int l, final String n, final ct o) {
        this.b = 1;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = null;
        this.i = i;
        this.j = null;
        this.k = k;
        this.l = l;
        this.m = 3;
        this.n = n;
        this.o = o;
    }
    
    public bm(final jt d, final ch e, final s g, final cm k, final ev f, final boolean i, final int l, final String j, final String h, final ct o) {
        this.b = 1;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = 3;
        this.n = null;
        this.o = o;
    }
    
    public static bm a(final Intent intent) {
        try {
            final Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(bm.class.getClassLoader());
            return (bm)bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static void a(final Intent intent, final bm bm) {
        final Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", (Parcelable)bm);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }
    
    IBinder a() {
        return com.google.android.gms.a.d.a(this.d).asBinder();
    }
    
    IBinder b() {
        return com.google.android.gms.a.d.a(this.e).asBinder();
    }
    
    IBinder c() {
        return com.google.android.gms.a.d.a(this.f).asBinder();
    }
    
    IBinder d() {
        return com.google.android.gms.a.d.a(this.g).asBinder();
    }
    
    public int describeContents() {
        return 0;
    }
    
    IBinder e() {
        return com.google.android.gms.a.d.a(this.k).asBinder();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        cg.a(this, parcel, n);
    }
}
