// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.KeyEvent;
import android.os.Build$VERSION;

public class a
{
    static final d a;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            a = new c();
            return;
        }
        a = new b();
    }
    
    public static boolean a(final KeyEvent keyEvent) {
        return android.support.v4.view.a.a.b(keyEvent.getMetaState());
    }
    
    public static boolean a(final KeyEvent keyEvent, final int n) {
        return android.support.v4.view.a.a.a(keyEvent.getMetaState(), n);
    }
}
