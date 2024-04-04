// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.MotionEvent;
import android.os.Build$VERSION;

public class f
{
    static final i a;
    
    static {
        if (Build$VERSION.SDK_INT >= 5) {
            a = new h();
            return;
        }
        a = new g();
    }
    
    public static int a(final MotionEvent motionEvent) {
        return (motionEvent.getAction() & 0xFF00) >> 8;
    }
    
    public static int a(final MotionEvent motionEvent, final int n) {
        return f.a.a(motionEvent, n);
    }
    
    public static int b(final MotionEvent motionEvent, final int n) {
        return f.a.b(motionEvent, n);
    }
    
    public static float c(final MotionEvent motionEvent, final int n) {
        return f.a.c(motionEvent, n);
    }
    
    public static float d(final MotionEvent motionEvent, final int n) {
        return f.a.d(motionEvent, n);
    }
}
