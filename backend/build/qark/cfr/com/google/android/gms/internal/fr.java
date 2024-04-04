/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.fm;

final class fr
extends Drawable.ConstantState {
    int a;
    int b;

    fr(fr fr2) {
        if (fr2 != null) {
            this.a = fr2.a;
            this.b = fr2.b;
        }
    }

    public int getChangingConfigurations() {
        return this.a;
    }

    public Drawable newDrawable() {
        return new fm(this);
    }
}

