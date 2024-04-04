package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

// $FF: renamed from: android.support.v4.view.ab
public class class_114 {
   // $FF: renamed from: a android.support.v4.view.ae
   static final class_3 field_116;

   static {
      if (VERSION.SDK_INT >= 11) {
         field_116 = new class_109();
      } else {
         field_116 = new class_113();
      }
   }

   // $FF: renamed from: a (android.view.ViewConfiguration) int
   public static int method_359(ViewConfiguration var0) {
      return field_116.method_4(var0);
   }
}
