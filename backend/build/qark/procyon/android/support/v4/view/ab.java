// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.ViewConfiguration;
import android.os.Build$VERSION;

public class ab
{
    static final ae a;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            a = new ad();
            return;
        }
        a = new ac();
    }
    
    public static int a(final ViewConfiguration viewConfiguration) {
        return ab.a.a(viewConfiguration);
    }
}
