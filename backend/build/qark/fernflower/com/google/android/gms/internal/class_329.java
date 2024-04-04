package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.hs
public class class_329 {
   // $FF: renamed from: a (java.lang.StringBuilder, java.util.HashMap) void
   public static void method_1130(StringBuilder var0, HashMap var1) {
      var0.append("{");
      Iterator var3 = var1.keySet().iterator();
      boolean var2 = true;

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         if (!var2) {
            var0.append(",");
         } else {
            var2 = false;
         }

         String var5 = (String)var1.get(var4);
         var0.append("\"").append(var4).append("\":");
         if (var5 == null) {
            var0.append("null");
         } else {
            var0.append("\"").append(var5).append("\"");
         }
      }

      var0.append("}");
   }
}
