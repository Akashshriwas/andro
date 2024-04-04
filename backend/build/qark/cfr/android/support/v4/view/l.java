/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.VelocityTracker
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.view.VelocityTracker;

public class l {
    static final o a = Build.VERSION.SDK_INT >= 11 ? new n() : new m();

    public static float a(VelocityTracker velocityTracker, int n2) {
        return a.a(velocityTracker, n2);
    }
}

