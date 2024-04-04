package com.google.android.gms.internal;

import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.ae
public final class class_555 implements class_60 {
   // $FF: renamed from: a (java.util.Map) boolean
   private static boolean method_1840(Map var0) {
      return "1".equals(var0.get("custom_close"));
   }

   // $FF: renamed from: b (java.util.Map) int
   private static int method_1841(Map var0) {
      String var1 = (String)var0.get("o");
      if (var1 != null) {
         if ("p".equalsIgnoreCase(var1)) {
            return class_466.method_1599();
         }

         if ("l".equalsIgnoreCase(var1)) {
            return class_466.method_1595();
         }
      }

      return -1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var4 = (String)var2.get("a");
      if (var4 == null) {
         class_467.method_1610("Action missing from an open GMSG.");
      } else {
         class_470 var3 = var1.method_1649();
         if ("expand".equalsIgnoreCase(var4)) {
            if (var1.method_1652()) {
               class_467.method_1610("Cannot expand WebView that is already expanded.");
            } else {
               var3.method_1629(method_1840(var2), method_1841(var2));
            }
         } else if ("webapp".equalsIgnoreCase(var4)) {
            String var5 = (String)var2.get("u");
            if (var5 != null) {
               var3.method_1630(method_1840(var2), method_1841(var2), var5);
            } else {
               var3.method_1631(method_1840(var2), method_1841(var2), (String)var2.get("html"), (String)var2.get("baseurl"));
            }
         } else {
            var3.method_1624(new class_559((String)var2.get("i"), (String)var2.get("u"), (String)var2.get("m"), (String)var2.get("p"), (String)var2.get("c"), (String)var2.get("f"), (String)var2.get("e")));
         }
      }
   }
}
