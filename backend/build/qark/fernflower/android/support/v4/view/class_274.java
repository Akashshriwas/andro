package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

// $FF: renamed from: android.support.v4.view.f
public class class_274 {
   // $FF: renamed from: a android.support.v4.view.i
   static final class_33 field_769;

   static {
      if (VERSION.SDK_INT >= 5) {
         field_769 = new class_272();
      } else {
         field_769 = new class_273();
      }
   }

   // $FF: renamed from: a (android.view.MotionEvent) int
   public static int method_953(MotionEvent var0) {
      return (var0.getAction() & '\uff00') >> 8;
   }

   // $FF: renamed from: a (android.view.MotionEvent, int) int
   public static int method_954(MotionEvent var0, int var1) {
      return field_769.method_86(var0, var1);
   }

   // $FF: renamed from: b (android.view.MotionEvent, int) int
   public static int method_955(MotionEvent var0, int var1) {
      return field_769.method_87(var0, var1);
   }

   // $FF: renamed from: c (android.view.MotionEvent, int) float
   public static float method_956(MotionEvent var0, int var1) {
      return field_769.method_88(var0, var1);
   }

   // $FF: renamed from: d (android.view.MotionEvent, int) float
   public static float method_957(MotionEvent var0, int var1) {
      return field_769.method_89(var0, var1);
   }
}
