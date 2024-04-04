// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.g;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.e;
import android.content.Context;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class x implements SafeParcelable
{
    public static final kb a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final x[] i;
    
    static {
        a = new kb();
    }
    
    public x() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }
    
    x(final int b, final String c, final int d, final int e, final boolean f, final int g, final int h, final x[] i) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public x(final Context context, final e e) {
        this(context, new e[] { e });
    }
    
    public x(final Context context, final e[] array) {
        final int n = 0;
        final e e = array[0];
        this.b = 2;
        this.f = false;
        this.g = e.b();
        this.d = e.a();
        boolean b;
        if (this.g == -1) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if (this.d == -2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int g;
        if (b) {
            this.h = a(displayMetrics);
            g = (int)(this.h / displayMetrics.density);
        }
        else {
            g = this.g;
            this.h = es.a(displayMetrics, this.g);
        }
        int i;
        if (b2) {
            i = c(displayMetrics);
        }
        else {
            i = this.d;
        }
        this.e = es.a(displayMetrics, i);
        if (b || b2) {
            this.c = g + "x" + i + "_as";
        }
        else {
            this.c = e.toString();
        }
        if (array.length > 1) {
            this.i = new x[array.length];
            for (int j = n; j < array.length; ++j) {
                this.i[j] = new x(context, array[j]);
            }
        }
        else {
            this.i = null;
        }
    }
    
    public x(final x x, final x[] array) {
        this(2, x.c, x.d, x.e, x.f, x.g, x.h, array);
    }
    
    public static int a(final DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }
    
    public static int b(final DisplayMetrics displayMetrics) {
        return (int)(c(displayMetrics) * displayMetrics.density);
    }
    
    private static int c(final DisplayMetrics displayMetrics) {
        final int n = (int)(displayMetrics.heightPixels / displayMetrics.density);
        if (n <= 400) {
            return 32;
        }
        if (n <= 720) {
            return 50;
        }
        return 90;
    }
    
    public e a() {
        return com.google.android.gms.ads.g.a(this.g, this.d, this.c);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        kb.a(this, parcel, n);
    }
}
