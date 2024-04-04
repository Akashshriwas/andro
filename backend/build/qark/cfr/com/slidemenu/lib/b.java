/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 */
package com.slidemenu.lib;

import android.view.animation.Interpolator;

class b
implements Interpolator {
    b() {
    }

    public float getInterpolation(float f2) {
        return f2 * (f2 * f2 * f2 * (f2 -= 1.0f)) + 1.0f;
    }
}

