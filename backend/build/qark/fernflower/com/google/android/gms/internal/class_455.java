package com.google.android.gms.internal;

import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.dx
class class_455 implements class_60 {
   // $FF: renamed from: a com.google.android.gms.internal.dv
   // $FF: synthetic field
   final class_450 field_1236;

   class_455(class_450 var1) {
      this.field_1236 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      Object var23 = class_450.method_1506(this.field_1236);
      synchronized(var23){}

      Throwable var10000;
      boolean var10001;
      label164: {
         String var24;
         try {
            var24 = (String)var2.get("url");
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label164;
         }

         if (var24 == null) {
            label158:
            try {
               class_467.method_1610("URL missing in loadAdUrl GMSG.");
               return;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label158;
            }
         } else {
            label160:
            try {
               class_450.method_1507(this.field_1236, var24);
               class_450.method_1506(this.field_1236).notify();
               return;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label160;
            }
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }
}
