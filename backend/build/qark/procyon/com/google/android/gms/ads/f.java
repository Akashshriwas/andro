// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.ads;

import android.view.View;
import android.content.Context;
import com.google.android.gms.internal.p;
import android.view.ViewGroup;

public final class f extends ViewGroup
{
    private final p a;
    
    public f(final Context context) {
        super(context);
        this.a = new p(this);
    }
    
    public void a(final b b) {
        this.a.a(b.a());
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
    
    protected void onLayout(final boolean b, int n, int n2, final int n3, final int n4) {
        final View child = this.getChildAt(0);
        if (child != null && child.getVisibility() != 8) {
            final int measuredWidth = child.getMeasuredWidth();
            final int measuredHeight = child.getMeasuredHeight();
            n = (n3 - n - measuredWidth) / 2;
            n2 = (n4 - n2 - measuredHeight) / 2;
            child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        int a = 0;
        final View child = this.getChildAt(0);
        final e adSize = this.getAdSize();
        int a2;
        if (child != null && child.getVisibility() != 8) {
            this.measureChild(child, n, n2);
            a2 = child.getMeasuredWidth();
            a = child.getMeasuredHeight();
        }
        else if (adSize != null) {
            final Context context = this.getContext();
            a2 = adSize.b(context);
            a = adSize.a(context);
        }
        else {
            a2 = 0;
        }
        this.setMeasuredDimension(View.resolveSize(Math.max(a2, this.getSuggestedMinimumWidth()), n), View.resolveSize(Math.max(a, this.getSuggestedMinimumHeight()), n2));
    }
    
    public void setAdListener(final a a) {
        this.a.a(a);
    }
    
    public void setAdSize(final e e) {
        this.a.a(e);
    }
    
    public void setAdUnitId(final String s) {
        this.a.a(s);
    }
}
