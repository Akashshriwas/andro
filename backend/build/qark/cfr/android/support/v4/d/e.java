/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.widget.EdgeEffect
 *  java.lang.Object
 */
package android.support.v4.d;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

class e {
    public static void a(Object object, int n2, int n3) {
        ((EdgeEffect)object).setSize(n2, n3);
    }

    public static boolean a(Object object) {
        return ((EdgeEffect)object).isFinished();
    }

    public static boolean a(Object object, float f2) {
        ((EdgeEffect)object).onPull(f2);
        return true;
    }

    public static boolean a(Object object, Canvas canvas) {
        return ((EdgeEffect)object).draw(canvas);
    }

    public static void b(Object object) {
        ((EdgeEffect)object).finish();
    }

    public static boolean c(Object object) {
        object = (EdgeEffect)object;
        object.onRelease();
        return object.isFinished();
    }
}

