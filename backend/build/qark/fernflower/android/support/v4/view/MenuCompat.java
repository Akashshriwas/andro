package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MenuItem;

public class MenuCompat {
   static final MenuCompat.MenuVersionImpl IMPL;

   static {
      if (VERSION.SDK_INT >= 11) {
         IMPL = new MenuCompat.HoneycombMenuVersionImpl();
      } else {
         IMPL = new MenuCompat.BaseMenuVersionImpl();
      }
   }

   public static boolean setShowAsAction(MenuItem var0, int var1) {
      return IMPL.setShowAsAction(var0, var1);
   }

   static class BaseMenuVersionImpl implements MenuCompat.MenuVersionImpl {
      public boolean setShowAsAction(MenuItem var1, int var2) {
         return false;
      }
   }

   static class HoneycombMenuVersionImpl implements MenuCompat.MenuVersionImpl {
      public boolean setShowAsAction(MenuItem var1, int var2) {
         MenuItemCompatHoneycomb.setShowAsAction(var1, var2);
         return true;
      }
   }

   interface MenuVersionImpl {
      boolean setShowAsAction(MenuItem var1, int var2);
   }
}
