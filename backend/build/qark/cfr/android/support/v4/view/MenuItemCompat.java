/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.MenuItemCompatHoneycomb;
import android.view.MenuItem;
import android.view.View;

public class MenuItemCompat {
    static final MenuVersionImpl IMPL = Build.VERSION.SDK_INT >= 11 ? new HoneycombMenuVersionImpl() : new BaseMenuVersionImpl();
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    public static MenuItem setActionView(MenuItem menuItem, View view) {
        return IMPL.setActionView(menuItem, view);
    }

    public static boolean setShowAsAction(MenuItem menuItem, int n) {
        return IMPL.setShowAsAction(menuItem, n);
    }

    static class BaseMenuVersionImpl
    implements MenuVersionImpl {
        BaseMenuVersionImpl() {
        }

        @Override
        public MenuItem setActionView(MenuItem menuItem, View view) {
            return menuItem;
        }

        @Override
        public boolean setShowAsAction(MenuItem menuItem, int n) {
            return false;
        }
    }

    static class HoneycombMenuVersionImpl
    implements MenuVersionImpl {
        HoneycombMenuVersionImpl() {
        }

        @Override
        public MenuItem setActionView(MenuItem menuItem, View view) {
            return MenuItemCompatHoneycomb.setActionView(menuItem, view);
        }

        @Override
        public boolean setShowAsAction(MenuItem menuItem, int n) {
            MenuItemCompatHoneycomb.setShowAsAction(menuItem, n);
            return true;
        }
    }

    static interface MenuVersionImpl {
        public MenuItem setActionView(MenuItem var1, View var2);

        public boolean setShowAsAction(MenuItem var1, int var2);
    }

}

