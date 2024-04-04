/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ViewSwitcher
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.ih;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.x;

final class jv {
    public final ViewSwitcher a;
    public final String b;
    public final Context c;
    public final is d;
    public final ct e;
    public b f;
    public ef g;
    public x h;
    public ec i;
    public k j;

    /*
     * Enabled aggressive block sorting
     */
    public jv(Context context, x x2, String string, ct ct2) {
        if (x2.f) {
            this.a = null;
        } else {
            this.a = new ViewSwitcher(context);
            this.a.setMinimumWidth(x2.h);
            this.a.setMinimumHeight(x2.e);
            this.a.setVisibility(4);
        }
        this.h = x2;
        this.b = string;
        this.c = context;
        this.d = new is(ih.a(ct2.c, context));
        this.e = ct2;
    }
}

