package com.google.android.gms.internal;

import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.z
final class class_606 implements class_60 {
   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      class_420 var3 = var1.method_1647();
      if (var3 == null) {
         class_467.method_1610("A GMSG tried to use a custom close button on something that wasn't an overlay.");
      } else {
         var3.method_1448("1".equals(var2.get("custom_close")));
      }
   }
}
