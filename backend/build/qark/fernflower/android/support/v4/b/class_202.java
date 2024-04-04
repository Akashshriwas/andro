package android.support.v4.b;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.b.a
public class class_202 {
   // $FF: renamed from: a (android.support.v4.b.c) android.os.Parcelable.Creator
   public static Creator method_815(class_30 var0) {
      if (VERSION.SDK_INT >= 13) {
         class_200.method_812(var0);
      }

      return new class_197(var0);
   }
}
