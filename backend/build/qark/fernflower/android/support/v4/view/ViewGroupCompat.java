package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ViewGroupCompat {
   static final ViewGroupCompat.ViewGroupCompatImpl IMPL;

   static {
      if (VERSION.SDK_INT >= 14) {
         IMPL = new ViewGroupCompat.ViewGroupCompatIcsImpl();
      } else {
         IMPL = new ViewGroupCompat.ViewGroupCompatStubImpl();
      }
   }

   private ViewGroupCompat() {
   }

   public static boolean onRequestSendAccessibilityEvent(ViewGroup var0, View var1, AccessibilityEvent var2) {
      return IMPL.onRequestSendAccessibilityEvent(var0, var1, var2);
   }

   static class ViewGroupCompatIcsImpl extends ViewGroupCompat.ViewGroupCompatStubImpl {
      public boolean onRequestSendAccessibilityEvent(ViewGroup var1, View var2, AccessibilityEvent var3) {
         return ViewGroupCompatIcs.onRequestSendAccessibilityEvent(var1, var2, var3);
      }
   }

   interface ViewGroupCompatImpl {
      boolean onRequestSendAccessibilityEvent(ViewGroup var1, View var2, AccessibilityEvent var3);
   }

   static class ViewGroupCompatStubImpl implements ViewGroupCompat.ViewGroupCompatImpl {
      public boolean onRequestSendAccessibilityEvent(ViewGroup var1, View var2, AccessibilityEvent var3) {
         return true;
      }
   }
}
