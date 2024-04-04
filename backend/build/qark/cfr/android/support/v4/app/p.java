/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 */
package android.support.v4.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.view.View;
import android.view.animation.Animation;

class p
implements Animation.AnimationListener {
    final /* synthetic */ Fragment a;
    final /* synthetic */ m b;

    p(m m2, Fragment fragment) {
        this.b = m2;
        this.a = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.a.b != null) {
            this.a.b = null;
            this.b.a(this.a, this.a.c, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}

