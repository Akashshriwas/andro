package android.support.v4.view;

import android.view.View;

public class ViewCompatJB {
   public static Object getAccessibilityNodeProvider(View var0) {
      return var0.getAccessibilityNodeProvider();
   }

   public static int getImportantForAccessibility(View var0) {
      return var0.getImportantForAccessibility();
   }

   public static boolean hasTransientState(View var0) {
      return var0.hasTransientState();
   }

   public static void postInvalidateOnAnimation(View var0) {
      var0.postInvalidateOnAnimation();
   }

   public static void postInvalidateOnAnimation(View var0, int var1, int var2, int var3, int var4) {
      var0.postInvalidate(var1, var2, var3, var4);
   }

   public static void postOnAnimation(View var0, Runnable var1) {
      var0.postOnAnimation(var1);
   }

   public static void postOnAnimationDelayed(View var0, Runnable var1, long var2) {
      var0.postOnAnimationDelayed(var1, var2);
   }

   public static void setHasTransientState(View var0, boolean var1) {
      var0.setHasTransientState(var1);
   }

   public static void setImportantForAccessibility(View var0, int var1) {
      var0.setImportantForAccessibility(var1);
   }
}
