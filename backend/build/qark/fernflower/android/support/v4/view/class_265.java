package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;

// $FF: renamed from: android.support.v4.view.q
public class class_265 {
   // $FF: renamed from: a android.support.v4.view.w
   static final class_34 field_760;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 < 16 && !VERSION.CODENAME.equals("JellyBean")) {
         if (var0 >= 14) {
            field_760 = new class_259();
         } else if (var0 >= 11) {
            field_760 = new class_258();
         } else if (var0 >= 9) {
            field_760 = new class_257();
         } else {
            field_760 = new class_256();
         }
      } else {
         field_760 = new class_260();
      }
   }

   // $FF: renamed from: a (android.view.View) int
   public static int method_948(View var0) {
      return field_760.method_90(var0);
   }

   // $FF: renamed from: a (android.view.View, int) boolean
   public static boolean method_949(View var0, int var1) {
      return field_760.method_91(var0, var1);
   }

   // $FF: renamed from: b (android.view.View) void
   public static void method_950(View var0) {
      field_760.method_92(var0);
   }
}
