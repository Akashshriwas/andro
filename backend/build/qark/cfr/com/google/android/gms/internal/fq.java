/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fp;

final class fq
extends Drawable.ConstantState {
    private fq() {
    }

    /* synthetic */ fq(fo fo2) {
        this();
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        return fp.a();
    }
}

