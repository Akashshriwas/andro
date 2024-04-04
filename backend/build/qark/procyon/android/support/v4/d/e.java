// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.d;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

class e
{
    public static void a(final Object o, final int n, final int n2) {
        ((EdgeEffect)o).setSize(n, n2);
    }
    
    public static boolean a(final Object o) {
        return ((EdgeEffect)o).isFinished();
    }
    
    public static boolean a(final Object o, final float n) {
        ((EdgeEffect)o).onPull(n);
        return true;
    }
    
    public static boolean a(final Object o, final Canvas canvas) {
        return ((EdgeEffect)o).draw(canvas);
    }
    
    public static void b(final Object o) {
        ((EdgeEffect)o).finish();
    }
    
    public static boolean c(final Object o) {
        final EdgeEffect edgeEffect = (EdgeEffect)o;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
