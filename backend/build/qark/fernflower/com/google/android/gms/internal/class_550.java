package com.google.android.gms.internal;

import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.ac
final class class_550 implements class_60 {
   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var6 = (String)var2.get("tx");
      String var7 = (String)var2.get("ty");
      String var11 = (String)var2.get("td");

      label27: {
         boolean var10001;
         int var3;
         int var4;
         int var5;
         class_355 var10;
         try {
            var3 = Integer.parseInt(var6);
            var4 = Integer.parseInt(var7);
            var5 = Integer.parseInt(var11);
            var10 = var1.method_1650();
         } catch (NumberFormatException var9) {
            var10001 = false;
            break label27;
         }

         if (var10 == null) {
            return;
         }

         try {
            var10.method_1240().method_158(var3, var4, var5);
            return;
         } catch (NumberFormatException var8) {
            var10001 = false;
         }
      }

      class_467.method_1610("Could not parse touch parameters from gmsg.");
   }
}
