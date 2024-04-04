package com.google.android.gms.internal;

import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.aa
final class class_552 implements class_60 {
   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var3 = (String)var2.get("u");
      if (var3 == null) {
         class_467.method_1610("URL missing from httpTrack GMSG.");
      } else {
         (new class_427(var1.getContext(), var1.method_1651().field_1127, var3)).e();
      }
   }
}
