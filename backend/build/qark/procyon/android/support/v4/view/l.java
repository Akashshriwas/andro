// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.VelocityTracker;
import android.os.Build$VERSION;

public class l
{
    static final o a;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            a = new n();
            return;
        }
        a = new m();
    }
    
    public static float a(final VelocityTracker velocityTracker, final int n) {
        return l.a.a(velocityTracker, n);
    }
}
