/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.g;
import android.support.v4.view.h;
import android.support.v4.view.i;
import android.view.MotionEvent;

public class f {
    static final i a = Build.VERSION.SDK_INT >= 5 ? new h() : new g();

    public static int a(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int a(MotionEvent motionEvent, int n2) {
        return a.a(motionEvent, n2);
    }

    public static int b(MotionEvent motionEvent, int n2) {
        return a.b(motionEvent, n2);
    }

    public static float c(MotionEvent motionEvent, int n2) {
        return a.c(motionEvent, n2);
    }

    public static float d(MotionEvent motionEvent, int n2) {
        return a.d(motionEvent, n2);
    }
}

