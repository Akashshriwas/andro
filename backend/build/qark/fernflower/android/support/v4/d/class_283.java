package android.support.v4.d;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

// $FF: renamed from: android.support.v4.d.e
class class_283 {
   // $FF: renamed from: a (java.lang.Object, int, int) void
   public static void method_973(Object var0, int var1, int var2) {
      ((EdgeEffect)var0).setSize(var1, var2);
   }

   // $FF: renamed from: a (java.lang.Object) boolean
   public static boolean method_974(Object var0) {
      return ((EdgeEffect)var0).isFinished();
   }

   // $FF: renamed from: a (java.lang.Object, float) boolean
   public static boolean method_975(Object var0, float var1) {
      ((EdgeEffect)var0).onPull(var1);
      return true;
   }

   // $FF: renamed from: a (java.lang.Object, android.graphics.Canvas) boolean
   public static boolean method_976(Object var0, Canvas var1) {
      return ((EdgeEffect)var0).draw(var1);
   }

   // $FF: renamed from: b (java.lang.Object) void
   public static void method_977(Object var0) {
      ((EdgeEffect)var0).finish();
   }

   // $FF: renamed from: c (java.lang.Object) boolean
   public static boolean method_978(Object var0) {
      EdgeEffect var1 = (EdgeEffect)var0;
      var1.onRelease();
      return var1.isFinished();
   }
}
