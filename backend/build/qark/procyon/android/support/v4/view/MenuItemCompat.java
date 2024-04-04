// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.View;
import android.view.MenuItem;
import android.os.Build$VERSION;

public class MenuItemCompat
{
    static final MenuVersionImpl IMPL;
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            IMPL = (MenuVersionImpl)new HoneycombMenuVersionImpl();
            return;
        }
        IMPL = (MenuVersionImpl)new BaseMenuVersionImpl();
    }
    
    public static MenuItem setActionView(final MenuItem menuItem, final View view) {
        return MenuItemCompat.IMPL.setActionView(menuItem, view);
    }
    
    public static boolean setShowAsAction(final MenuItem menuItem, final int n) {
        return MenuItemCompat.IMPL.setShowAsAction(menuItem, n);
    }
    
    static class BaseMenuVersionImpl implements MenuVersionImpl
    {
        @Override
        public MenuItem setActionView(final MenuItem menuItem, final View view) {
            return menuItem;
        }
        
        @Override
        public boolean setShowAsAction(final MenuItem menuItem, final int n) {
            return false;
        }
    }
    
    static class HoneycombMenuVersionImpl implements MenuVersionImpl
    {
        @Override
        public MenuItem setActionView(final MenuItem menuItem, final View view) {
            return MenuItemCompatHoneycomb.setActionView(menuItem, view);
        }
        
        @Override
        public boolean setShowAsAction(final MenuItem menuItem, final int n) {
            MenuItemCompatHoneycomb.setShowAsAction(menuItem, n);
            return true;
        }
    }
    
    interface MenuVersionImpl
    {
        MenuItem setActionView(final MenuItem p0, final View p1);
        
        boolean setShowAsAction(final MenuItem p0, final int p1);
    }
}
