package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.w
final class class_598 implements class_60 {
   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var4 = (String)var2.get("u");
      if (var4 == null) {
         class_467.method_1610("URL missing from click GMSG.");
      } else {
         Uri var7 = Uri.parse(var4);

         label32: {
            Uri var9;
            label31: {
               label38: {
                  boolean var10001;
                  class_355 var3;
                  try {
                     var3 = var1.method_1650();
                  } catch (class_412 var6) {
                     var10001 = false;
                     break label38;
                  }

                  if (var3 == null) {
                     break label32;
                  }

                  try {
                     if (!var3.method_1242(var7)) {
                        break label32;
                     }

                     var9 = var3.method_1239(var7, var1.getContext());
                     break label31;
                  } catch (class_412 var5) {
                     var10001 = false;
                  }
               }

               class_467.method_1610("Unable to append parameter to URL: " + var4);
               break label32;
            }

            var7 = var9;
         }

         String var8 = var7.toString();
         (new class_427(var1.getContext(), var1.method_1651().field_1127, var8)).e();
      }
   }
}
