package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.ds
public final class class_447 extends class_446 {
   // $FF: renamed from: a java.lang.Object
   private static final Object field_1203 = new Object();
   // $FF: renamed from: b com.google.android.gms.internal.ds
   private static class_447 field_1204;
   // $FF: renamed from: c android.content.Context
   private final Context field_1205;
   // $FF: renamed from: d com.google.android.gms.internal.ag
   private final class_61 field_1206;

   private class_447(Context var1, class_61 var2) {
      this.field_1205 = var1;
      this.field_1206 = var2;
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.ag, com.google.android.gms.internal.bz) com.google.android.gms.internal.cb
   private static class_434 method_1501(Context var0, class_61 var1, class_433 var2) {
      class_467.method_1603("Starting ad request from service.");
      var1.method_169();
      class_479 var4 = new class_479(var0);
      if (var4.field_1357 == -1) {
         class_467.method_1603("Device is offline.");
         return new class_434(2);
      } else {
         class_450 var3 = new class_450();
         if (var2.field_1159.field_1982 != null) {
            String var5 = var2.field_1159.field_1982.getString("_ad");
            if (var5 != null) {
               return class_451.method_1511(var0, var2, var5);
            }
         }

         String var6 = class_451.method_1514(var2, var4, var1.method_168(250L));
         if (var6 == null) {
            return new class_434(0);
         } else {
            class_468.field_1283.post(new class_452(var0, var2, var3, var6));
            var6 = var3.method_1510();
            return TextUtils.isEmpty(var6) ? new class_434(var3.method_1508()) : method_1502(var0, var2.field_1167.field_1127, var6);
         }
      }
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, java.lang.String) com.google.android.gms.internal.cb
   public static class_434 method_1502(Context param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.ag) com.google.android.gms.internal.ds
   public static class_447 method_1503(Context var0, class_61 var1) {
      Object var2 = field_1203;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (field_1204 == null) {
               field_1204 = new class_447(var0.getApplicationContext(), var1);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            class_447 var16 = field_1204;
            return var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.util.Map, java.lang.String, int) void
   private static void method_1504(String var0, Map var1, String var2, int var3) {
      if (class_467.method_1605(2)) {
         class_467.method_1609("Http Response: {\n  URL:\n    " + var0 + "\n  Headers:");
         if (var1 != null) {
            Iterator var7 = var1.keySet().iterator();

            while(var7.hasNext()) {
               String var5 = (String)var7.next();
               class_467.method_1609("    " + var5 + ":");
               Iterator var8 = ((List)var1.get(var5)).iterator();

               while(var8.hasNext()) {
                  String var6 = (String)var8.next();
                  class_467.method_1609("      " + var6);
               }
            }
         }

         class_467.method_1609("  Body:");
         if (var2 != null) {
            for(int var4 = 0; var4 < Math.min(var2.length(), 100000); var4 += 1000) {
               class_467.method_1609(var2.substring(var4, Math.min(var2.length(), var4 + 1000)));
            }
         } else {
            class_467.method_1609("    null");
         }

         class_467.method_1609("  Response Code:\n    " + var3 + "\n}");
      }

   }

   // $FF: renamed from: a (com.google.android.gms.internal.bz) com.google.android.gms.internal.cb
   public class_434 method_153(class_433 var1) {
      return method_1501(this.field_1205, this.field_1206, var1);
   }
}
