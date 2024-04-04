/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 */
package android.support.v4.view;

import android.view.animation.Interpolator;

final class ah
implements Interpolator {
    ah() {
    }

    public float getInterpolation(float f2) {
        return f2 * (f2 * f2 * f2 * (f2 -= 1.0f)) + 1.0f;
    }
}

