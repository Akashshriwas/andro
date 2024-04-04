package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;

public class MenuItemCompat {
   static final MenuItemCompat.MenuVersionImpl IMPL;
   public static final int SHOW_AS_ACTION_ALWAYS = 2;
   public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
   public static final int SHOW_AS_ACTION_IF_ROOM = 1;
   public static final int SHOW_AS_ACTION_NEVER = 0;
   public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

   static {
      if (VERSION.SDK_INT >= 11) {
         IMPL = new MenuItemCompat.HoneycombMenuVersionImpl();
      } else {
         IMPL = new MenuItemCompat.BaseMenuVersionImpl();
      }
   }

   public static MenuItem setActionView(MenuItem var0, View var1) {
      return IMPL.setActionView(var0, var1);
   }

   public static boolean setShowAsAction(MenuItem var0, int var1) {
      return IMPL.setShowAsAction(var0, var1);
   }

   static class BaseMenuVersionImpl implements MenuItemCompat.MenuVersionImpl {
      public MenuItem setActionView(MenuItem var1, View var2) {
         return var1;
      }

      public boolean setShowAsAction(MenuItem var1, int var2) {
         return false;
      }
   }

   static class HoneycombMenuVersionImpl implements MenuItemCompat.MenuVersionImpl {
      public MenuItem setActionView(MenuItem var1, View var2) {
         return MenuItemCompatHoneycomb.setActionView(var1, var2);
      }

      public boolean setShowAsAction(MenuItem var1, int var2) {
         MenuItemCompatHoneycomb.setShowAsAction(var1, var2);
         return true;
      }
   }

   interface MenuVersionImpl {
      MenuItem setActionView(MenuItem var1, View var2);

      boolean setShowAsAction(MenuItem var1, int var2);
   }
}
