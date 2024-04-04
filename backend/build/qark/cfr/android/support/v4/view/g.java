/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.view;

import android.support.v4.view.i;
import android.view.MotionEvent;

class g
implements i {
    g() {
    }

    @Override
    public int a(MotionEvent motionEvent, int n2) {
        if (n2 == 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public int b(MotionEvent motionEvent, int n2) {
        if (n2 == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override
    public float c(MotionEvent motionEvent, int n2) {
        if (n2 == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override
    public float d(MotionEvent motionEvent, int n2) {
        if (n2 == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}

