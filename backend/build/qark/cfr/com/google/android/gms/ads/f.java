/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Math
 *  java.lang.String
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.e;
import com.google.android.gms.internal.n;
import com.google.android.gms.internal.p;

public final class f
extends ViewGroup {
    private final p a;

    public f(Context context) {
        super(context);
        this.a = new p(this);
    }

    public void a(b b2) {
        this.a.a(b2.a());
    }

    public a getAdListener() {
        return this.a.a();
    }

    public e getAdSize() {
        return this.a.b();
    }

    public String getAdUnitId() {
        return this.a.c();
    }

    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        View view = this.getChildAt(0);
        if (view != null && view.getVisibility() != 8) {
            int n6 = view.getMeasuredWidth();
            int n7 = view.getMeasuredHeight();
            n2 = (n4 - n2 - n6) / 2;
            n3 = (n5 - n3 - n7) / 2;
            view.layout(n2, n3, n6 + n2, n7 + n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onMeasure(int n2, int n3) {
        int n4;
        int n5 = 0;
        View view = this.getChildAt(0);
        e e2 = this.getAdSize();
        if (view != null && view.getVisibility() != 8) {
            this.measureChild(view, n2, n3);
            n4 = view.getMeasuredWidth();
            n5 = view.getMeasuredHeight();
        } else if (e2 != null) {
            view = this.getContext();
            n4 = e2.b((Context)view);
            n5 = e2.a((Context)view);
        } else {
            n4 = 0;
        }
        n4 = Math.max((int)n4, (int)this.getSuggestedMinimumWidth());
        n5 = Math.max((int)n5, (int)this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSize((int)n4, (int)n2), View.resolveSize((int)n5, (int)n3));
    }

    public void setAdListener(a a2) {
        this.a.a(a2);
    }

    public void setAdSize(e e2) {
        this.a.a(e2);
    }

    public void setAdUnitId(String string) {
        this.a.a(string);
    }
}

