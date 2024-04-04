package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

// $FF: renamed from: android.support.v4.view.l
public class class_252 {
   // $FF: renamed from: a android.support.v4.view.o
   static final class_32 field_743;

   static {
      if (VERSION.SDK_INT >= 11) {
         field_743 = new class_248();
      } else {
         field_743 = new class_250();
      }
   }

   // $FF: renamed from: a (android.view.VelocityTracker, int) float
   public static float method_914(VelocityTracker var0, int var1) {
      return field_743.method_85(var0, var1);
   }
}
