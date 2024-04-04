// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.MenuItem;
import android.os.Build$VERSION;

public class MenuCompat
{
    static final MenuVersionImpl IMPL;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            IMPL = (MenuVersionImpl)new HoneycombMenuVersionImpl();
            return;
        }
        IMPL = (MenuVersionImpl)new BaseMenuVersionImpl();
    }
    
    public static boolean setShowAsAction(final MenuItem menuItem, final int n) {
        return MenuCompat.IMPL.setShowAsAction(menuItem, n);
    }
    
    static class BaseMenuVersionImpl implements MenuVersionImpl
    {
        @Override
        public boolean setShowAsAction(final MenuItem menuItem, final int n) {
            return false;
        }
    }
    
    static class HoneycombMenuVersionImpl implements MenuVersionImpl
    {
        @Override
        public boolean setShowAsAction(final MenuItem menuItem, final int n) {
            MenuItemCompatHoneycomb.setShowAsAction(menuItem, n);
            return true;
        }
    }
    
    interface MenuVersionImpl
    {
        boolean setShowAsAction(final MenuItem p0, final int p1);
    }
}
