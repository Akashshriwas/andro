package android.support.v4.view;

import android.view.MotionEvent;

// $FF: renamed from: android.support.v4.view.g
class class_273 implements class_33 {
   // $FF: renamed from: a (android.view.MotionEvent, int) int
   public int method_86(MotionEvent var1, int var2) {
      return var2 == 0 ? 0 : -1;
   }

   // $FF: renamed from: b (android.view.MotionEvent, int) int
   public int method_87(MotionEvent var1, int var2) {
      if (var2 == 0) {
         return 0;
      } else {
         throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
      }
   }

   // $FF: renamed from: c (android.view.MotionEvent, int) float
   public float method_88(MotionEvent var1, int var2) {
      if (var2 == 0) {
         return var1.getX();
      } else {
         throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
      }
   }

   // $FF: renamed from: d (android.view.MotionEvent, int) float
   public float method_89(MotionEvent var1, int var2) {
      if (var2 == 0) {
         return var1.getY();
      } else {
         throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
      }
   }
}
