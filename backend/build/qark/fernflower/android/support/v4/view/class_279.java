package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

// $FF: renamed from: android.support.v4.view.a
public class class_279 {
   // $FF: renamed from: a android.support.v4.view.d
   static final class_36 field_775;

   static {
      if (VERSION.SDK_INT >= 11) {
         field_775 = new class_277();
      } else {
         field_775 = new class_278();
      }
   }

   // $FF: renamed from: a (android.view.KeyEvent) boolean
   public static boolean method_965(KeyEvent var0) {
      return field_775.method_95(var0.getMetaState());
   }

   // $FF: renamed from: a (android.view.KeyEvent, int) boolean
   public static boolean method_966(KeyEvent var0, int var1) {
      return field_775.method_94(var0.getMetaState(), var1);
   }
}
