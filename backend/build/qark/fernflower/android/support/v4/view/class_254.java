package android.support.v4.view;

import android.view.MotionEvent;

// $FF: renamed from: android.support.v4.view.j
class class_254 {
   // $FF: renamed from: a (android.view.MotionEvent, int) int
   public static int method_933(MotionEvent var0, int var1) {
      return var0.findPointerIndex(var1);
   }

   // $FF: renamed from: b (android.view.MotionEvent, int) int
   public static int method_934(MotionEvent var0, int var1) {
      return var0.getPointerId(var1);
   }

   // $FF: renamed from: c (android.view.MotionEvent, int) float
   public static float method_935(MotionEvent var0, int var1) {
      return var0.getX(var1);
   }

   // $FF: renamed from: d (android.view.MotionEvent, int) float
   public static float method_936(MotionEvent var0, int var1) {
      return var0.getY(var1);
   }
}
