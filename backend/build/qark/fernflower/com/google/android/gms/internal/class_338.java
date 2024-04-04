package com.google.android.gms.internal;

import android.os.Build.VERSION;

// $FF: renamed from: com.google.android.gms.internal.ht
public final class class_338 {
   // $FF: renamed from: a () boolean
   public static boolean method_1164() {
      return method_1165(11);
   }

   // $FF: renamed from: a (int) boolean
   private static boolean method_1165(int var0) {
      return VERSION.SDK_INT >= var0;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_1166() {
      return method_1165(17);
   }
}
