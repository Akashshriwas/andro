/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Parcel
 *  android.util.DisplayMetrics
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.kb;

public final class x
implements SafeParcelable {
    public static final kb a = new kb();
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final x[] i;

    public x() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    x(int n2, String string, int n3, int n4, boolean bl2, int n5, int n6, x[] arrx) {
        this.b = n2;
        this.c = string;
        this.d = n3;
        this.e = n4;
        this.f = bl2;
        this.g = n5;
        this.h = n6;
        this.i = arrx;
    }

    public x(Context context, e e2) {
        this(context, new e[]{e2});
    }

    /*
     * Enabled aggressive block sorting
     */
    public x(Context context, e[] arre) {
        int n2;
        int n3 = 0;
        e e2 = arre[0];
        this.b = 2;
        this.f = false;
        this.g = e2.b();
        this.d = e2.a();
        int n4 = this.g == -1 ? 1 : 0;
        boolean bl2 = this.d == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (n4 != 0) {
            this.h = x.a(displayMetrics);
            n2 = (int)((float)this.h / displayMetrics.density);
        } else {
            n2 = this.g;
            this.h = es.a(displayMetrics, this.g);
        }
        int n5 = bl2 ? x.c(displayMetrics) : this.d;
        this.e = es.a(displayMetrics, n5);
        this.c = n4 != 0 || bl2 ? "" + n2 + "x" + n5 + "_as" : e2.toString();
        if (arre.length > 1) {
            this.i = new x[arre.length];
            for (n4 = n3; n4 < arre.length; ++n4) {
                this.i[n4] = new x(context, arre[n4]);
            }
            return;
        } else {
            this.i = null;
        }
    }

    public x(x x2, x[] arrx) {
        this(2, x2.c, x2.d, x2.e, x2.f, x2.g, x2.h, arrx);
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int)((float)x.c(displayMetrics) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int n2 = (int)((float)displayMetrics.heightPixels / displayMetrics.density);
        if (n2 <= 400) {
            return 32;
        }
        if (n2 <= 720) {
            return 50;
        }
        return 90;
    }

    public e a() {
        return g.a(this.g, this.d, this.c);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        kb.a(this, parcel, n2);
    }
}

