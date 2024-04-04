package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class ViewCompat {
   private static final long FAKE_FRAME_TIME = 10L;
   static final ViewCompat.ViewCompatImpl IMPL;
   public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
   public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
   public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
   public static final int OVER_SCROLL_ALWAYS = 0;
   public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
   public static final int OVER_SCROLL_NEVER = 2;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 < 16 && !VERSION.CODENAME.equals("JellyBean")) {
         if (var0 >= 14) {
            IMPL = new ViewCompat.ICSViewCompatImpl();
         } else if (var0 >= 11) {
            IMPL = new ViewCompat.HCViewCompatImpl();
         } else if (var0 >= 9) {
            IMPL = new ViewCompat.GBViewCompatImpl();
         } else {
            IMPL = new ViewCompat.BaseViewCompatImpl();
         }
      } else {
         IMPL = new ViewCompat.JBViewCompatImpl();
      }
   }

   public static boolean canScrollHorizontally(View var0, int var1) {
      return IMPL.canScrollHorizontally(var0, var1);
   }

   public static boolean canScrollVertically(View var0, int var1) {
      return IMPL.canScrollVertically(var0, var1);
   }

   public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View var0) {
      return IMPL.getAccessibilityNodeProvider(var0);
   }

   public static int getImportantForAccessibility(View var0) {
      return IMPL.getImportantForAccessibility(var0);
   }

   public static int getOverScrollMode(View var0) {
      return IMPL.getOverScrollMode(var0);
   }

   public static boolean hasTransientState(View var0) {
      return IMPL.hasTransientState(var0);
   }

   public static void onInitializeAccessibilityEvent(View var0, AccessibilityEvent var1) {
      IMPL.onInitializeAccessibilityEvent(var0, var1);
   }

   public static void onInitializeAccessibilityNodeInfo(View var0, AccessibilityNodeInfoCompat var1) {
      IMPL.onInitializeAccessibilityNodeInfo(var0, var1);
   }

   public static void onPopulateAccessibilityEvent(View var0, AccessibilityEvent var1) {
      IMPL.onPopulateAccessibilityEvent(var0, var1);
   }

   public static void postInvalidateOnAnimation(View var0) {
      IMPL.postInvalidateOnAnimation(var0);
   }

   public static void postInvalidateOnAnimation(View var0, int var1, int var2, int var3, int var4) {
      IMPL.postInvalidateOnAnimation(var0, var1, var2, var3, var4);
   }

   public static void postOnAnimation(View var0, Runnable var1) {
      IMPL.postOnAnimation(var0, var1);
   }

   public static void postOnAnimationDelayed(View var0, Runnable var1, long var2) {
      IMPL.postOnAnimationDelayed(var0, var1, var2);
   }

   public static void setAccessibilityDelegate(View var0, AccessibilityDelegateCompat var1) {
      IMPL.setAccessibilityDelegate(var0, var1);
   }

   public static void setHasTransientState(View var0, boolean var1) {
      IMPL.setHasTransientState(var0, var1);
   }

   public static void setImportantForAccessibility(View var0, int var1) {
      IMPL.setImportantForAccessibility(var0, var1);
   }

   public static void setOverScrollMode(View var0, int var1) {
      IMPL.setOverScrollMode(var0, var1);
   }

   static class BaseViewCompatImpl implements ViewCompat.ViewCompatImpl {
      public boolean canScrollHorizontally(View var1, int var2) {
         return false;
      }

      public boolean canScrollVertically(View var1, int var2) {
         return false;
      }

      public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View var1) {
         return null;
      }

      long getFrameTime() {
         return 10L;
      }

      public int getImportantForAccessibility(View var1) {
         return 0;
      }

      public int getOverScrollMode(View var1) {
         return 2;
      }

      public boolean hasTransientState(View var1) {
         return false;
      }

      public void onInitializeAccessibilityEvent(View var1, AccessibilityEvent var2) {
      }

      public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
      }

      public void onPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
      }

      public void postInvalidateOnAnimation(View var1) {
         var1.postInvalidateDelayed(this.getFrameTime());
      }

      public void postInvalidateOnAnimation(View var1, int var2, int var3, int var4, int var5) {
         var1.postInvalidateDelayed(this.getFrameTime(), var2, var3, var4, var5);
      }

      public void postOnAnimation(View var1, Runnable var2) {
         var1.postDelayed(var2, this.getFrameTime());
      }

      public void postOnAnimationDelayed(View var1, Runnable var2, long var3) {
         var1.postDelayed(var2, this.getFrameTime() + var3);
      }

      public void setAccessibilityDelegate(View var1, AccessibilityDelegateCompat var2) {
      }

      public void setHasTransientState(View var1, boolean var2) {
      }

      public void setImportantForAccessibility(View var1, int var2) {
      }

      public void setOverScrollMode(View var1, int var2) {
      }
   }

   static class GBViewCompatImpl extends ViewCompat.BaseViewCompatImpl {
      public int getOverScrollMode(View var1) {
         return ViewCompatGingerbread.getOverScrollMode(var1);
      }

      public void setOverScrollMode(View var1, int var2) {
         ViewCompatGingerbread.setOverScrollMode(var1, var2);
      }
   }

   static class HCViewCompatImpl extends ViewCompat.GBViewCompatImpl {
      long getFrameTime() {
         return ViewCompatHC.getFrameTime();
      }
   }

   static class ICSViewCompatImpl extends ViewCompat.HCViewCompatImpl {
      public boolean canScrollHorizontally(View var1, int var2) {
         return ViewCompatICS.canScrollHorizontally(var1, var2);
      }

      public boolean canScrollVertically(View var1, int var2) {
         return ViewCompatICS.canScrollVertically(var1, var2);
      }

      public void onInitializeAccessibilityEvent(View var1, AccessibilityEvent var2) {
         ViewCompatICS.onInitializeAccessibilityEvent(var1, var2);
      }

      public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
         ViewCompatICS.onInitializeAccessibilityNodeInfo(var1, var2.getInfo());
      }

      public void onPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
         ViewCompatICS.onPopulateAccessibilityEvent(var1, var2);
      }

      public void setAccessibilityDelegate(View var1, AccessibilityDelegateCompat var2) {
         ViewCompatICS.setAccessibilityDelegate(var1, var2.getBridge());
      }
   }

   static class JBViewCompatImpl extends ViewCompat.ICSViewCompatImpl {
      public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View var1) {
         Object var2 = ViewCompatJB.getAccessibilityNodeProvider(var1);
         return var2 != null ? new AccessibilityNodeProviderCompat(var2) : null;
      }

      public int getImportantForAccessibility(View var1) {
         return ViewCompatJB.getImportantForAccessibility(var1);
      }

      public boolean hasTransientState(View var1) {
         return ViewCompatJB.hasTransientState(var1);
      }

      public void postInvalidateOnAnimation(View var1) {
         ViewCompatJB.postInvalidateOnAnimation(var1);
      }

      public void postInvalidateOnAnimation(View var1, int var2, int var3, int var4, int var5) {
         ViewCompatJB.postInvalidateOnAnimation(var1, var2, var3, var4, var5);
      }

      public void postOnAnimation(View var1, Runnable var2) {
         ViewCompatJB.postOnAnimation(var1, var2);
      }

      public void postOnAnimationDelayed(View var1, Runnable var2, long var3) {
         ViewCompatJB.postOnAnimationDelayed(var1, var2, var3);
      }

      public void setHasTransientState(View var1, boolean var2) {
         ViewCompatJB.setHasTransientState(var1, var2);
      }

      public void setImportantForAccessibility(View var1, int var2) {
         ViewCompatJB.setImportantForAccessibility(var1, var2);
      }
   }

   interface ViewCompatImpl {
      boolean canScrollHorizontally(View var1, int var2);

      boolean canScrollVertically(View var1, int var2);

      AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View var1);

      int getImportantForAccessibility(View var1);

      int getOverScrollMode(View var1);

      boolean hasTransientState(View var1);

      void onInitializeAccessibilityEvent(View var1, AccessibilityEvent var2);

      void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2);

      void onPopulateAccessibilityEvent(View var1, AccessibilityEvent var2);

      void postInvalidateOnAnimation(View var1);

      void postInvalidateOnAnimation(View var1, int var2, int var3, int var4, int var5);

      void postOnAnimation(View var1, Runnable var2);

      void postOnAnimationDelayed(View var1, Runnable var2, long var3);

      void setAccessibilityDelegate(View var1, AccessibilityDelegateCompat var2);

      void setHasTransientState(View var1, boolean var2);

      void setImportantForAccessibility(View var1, int var2);

      void setOverScrollMode(View var1, int var2);
   }
}
