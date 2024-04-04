/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  java.lang.Object
 */
package android.support.v4.view;

import android.view.MotionEvent;

class j {
    public static int a(MotionEvent motionEvent, int n2) {
        return motionEvent.findPointerIndex(n2);
    }

    public static int b(MotionEvent motionEvent, int n2) {
        return motionEvent.getPointerId(n2);
    }

    public static float c(MotionEvent motionEvent, int n2) {
        return motionEvent.getX(n2);
    }

    public static float d(MotionEvent motionEvent, int n2) {
        return motionEvent.getY(n2);
    }
}

