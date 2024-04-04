package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.b.class_156;
import com.google.android.gms.ads.b.class_161;
import com.google.android.gms.common.class_175;
import com.google.android.gms.common.class_180;
import java.io.IOException;

// $FF: renamed from: com.google.android.gms.internal.ih
public class class_342 extends class_341 {
   private class_342(Context var1, class_46 var2, class_45 var3) {
      super(var1, var2, var3);
   }

   // $FF: renamed from: a (java.lang.String, android.content.Context) com.google.android.gms.internal.ih
   public static class_342 method_1186(String var0, Context var1) {
      class_666 var2 = new class_666();
      a(var0, var1, var2);
      return new class_342(var1, var2, new class_414(239));
   }

   // $FF: renamed from: b (android.content.Context) void
   protected void method_1174(Context var1) {
      long var2 = 1L;
      super.method_1174(var1);

      boolean var10001;
      class_381 var10;
      try {
         var10 = this.method_1187(var1);
      } catch (class_175 var8) {
         return;
      } catch (IOException var9) {
         try {
            this.a(28, 1L);
            return;
         } catch (IOException var4) {
            var10001 = false;
            return;
         }
      }

      label42: {
         try {
            if (var10.method_1308()) {
               break label42;
            }
         } catch (IOException var7) {
            var10001 = false;
            return;
         }

         var2 = 0L;
      }

      String var11;
      try {
         this.a(28, var2);
         var11 = var10.method_1307();
      } catch (IOException var6) {
         var10001 = false;
         return;
      }

      if (var11 != null) {
         try {
            this.a(30, var11);
         } catch (IOException var5) {
            var10001 = false;
         }
      }
   }

   // $FF: renamed from: e (android.content.Context) com.google.android.gms.internal.ii
   class_381 method_1187(Context var1) {
      int var2 = 0;

      class_161 var5;
      try {
         var5 = class_156.method_660(var1);
      } catch (class_180 var7) {
         throw new IOException(var7);
      }

      String var8 = var5.method_663();
      if (var8 != null && var8.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
         byte[] var6 = new byte[16];

         int var4;
         for(int var3 = 0; var2 < var8.length(); var2 = var4 + 2) {
            label31: {
               if (var2 != 8 && var2 != 13 && var2 != 18) {
                  var4 = var2;
                  if (var2 != 23) {
                     break label31;
                  }
               }

               var4 = var2 + 1;
            }

            var6[var3] = (byte)((Character.digit(var8.charAt(var4), 16) << 4) + Character.digit(var8.charAt(var4 + 1), 16));
            ++var3;
         }

         var8 = this.c.method_134(var6, true);
      }

      return new class_381(this, var8, var5.method_664());
   }
}
