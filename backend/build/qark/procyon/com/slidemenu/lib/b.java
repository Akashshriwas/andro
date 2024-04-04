// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.view.animation.Interpolator;

class b implements Interpolator
{
    public float getInterpolation(float n) {
        --n;
        return n * (n * n * n * n) + 1.0f;
    }
}
