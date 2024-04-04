// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.KeyEvent;

class e
{
    public static boolean a(final int n) {
        return KeyEvent.metaStateHasNoModifiers(n);
    }
    
    public static boolean a(final int n, final int n2) {
        return KeyEvent.metaStateHasModifiers(n, n2);
    }
}
