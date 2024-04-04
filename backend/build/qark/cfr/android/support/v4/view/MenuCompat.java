/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MenuItem
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.MenuItemCompatHoneycomb;
import android.view.MenuItem;

public class MenuCompat {
    static final MenuVersionImpl IMPL = Build.VERSION.SDK_INT >= 11 ? new HoneycombMenuVersionImpl() : new BaseMenuVersionImpl();

    public static boolean setShowAsAction(MenuItem menuItem, int n) {
        return IMPL.setShowAsAction(menuItem, n);
    }

    static class BaseMenuVersionImpl
    implements MenuVersionImpl {
        BaseMenuVersionImpl() {
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
        public boolean setShowAsAction(MenuItem menuItem, int n) {
            MenuItemCompatHoneycomb.setShowAsAction(menuItem, n);
            return true;
        }
    }

    static interface MenuVersionImpl {
        public boolean setShowAsAction(MenuItem var1, int var2);
    }

}

