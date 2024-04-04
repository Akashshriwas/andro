package com.google.android.gms.internal;

import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.r
public final class class_602 implements class_60 {
   // $FF: renamed from: a com.google.android.gms.internal.s
   private final class_71 field_2005;

   public class_602(class_71 var1) {
      this.field_2005 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var3 = (String)var2.get("name");
      if (var3 == null) {
         class_467.method_1610("App event with no name parameter.");
      } else {
         this.field_2005.method_189(var3, (String)var2.get("info"));
      }
   }
}
