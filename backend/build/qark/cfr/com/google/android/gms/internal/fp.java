/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fq;

final class fp
extends Drawable {
    private static final fp a = new fp();
    private static final fq b = new fq(null);

    private fp() {
    }

    static /* synthetic */ fp a() {
        return a;
    }

    public void draw(Canvas canvas) {
    }

    public Drawable.ConstantState getConstantState() {
        return b;
    }

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int n2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}

