// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.MotionEvent;

class j
{
    public static int a(final MotionEvent motionEvent, final int n) {
        return motionEvent.findPointerIndex(n);
    }
    
    public static int b(final MotionEvent motionEvent, final int n) {
        return motionEvent.getPointerId(n);
    }
    
    public static float c(final MotionEvent motionEvent, final int n) {
        return motionEvent.getX(n);
    }
    
    public static float d(final MotionEvent motionEvent, final int n) {
        return motionEvent.getY(n);
    }
}
