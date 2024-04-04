package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONException;

// $FF: renamed from: com.google.android.gms.internal.cy
public final class class_431 extends class_426 implements class_54, class_55 {
   // $FF: renamed from: a com.google.android.gms.internal.bl
   private final class_62 field_1143;
   // $FF: renamed from: b com.google.android.gms.internal.cx
   private final class_51 field_1144;
   // $FF: renamed from: c com.google.android.gms.internal.ev
   private final class_473 field_1145;
   // $FF: renamed from: d android.content.Context
   private final Context field_1146;
   // $FF: renamed from: e java.lang.Object
   private final Object field_1147 = new Object();
   // $FF: renamed from: f com.google.android.gms.internal.dl
   private final class_445 field_1148;
   // $FF: renamed from: g com.google.android.gms.internal.is
   private final class_355 field_1149;
   // $FF: renamed from: h com.google.android.gms.internal.ef
   private class_426 field_1150;
   // $FF: renamed from: i com.google.android.gms.internal.cb
   private class_434 field_1151;
   // $FF: renamed from: j boolean
   private boolean field_1152 = false;
   // $FF: renamed from: k com.google.android.gms.internal.aj
   private class_528 field_1153;
   // $FF: renamed from: l com.google.android.gms.internal.am
   private class_537 field_1154;
   // $FF: renamed from: m com.google.android.gms.internal.ar
   private class_542 field_1155;

   public class_431(Context var1, class_445 var2, class_355 var3, class_473 var4, class_62 var5, class_51 var6) {
      this.field_1143 = var5;
      this.field_1144 = var6;
      this.field_1145 = var4;
      this.field_1146 = var1;
      this.field_1148 = var2;
      this.field_1149 = var3;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.bz) com.google.android.gms.internal.x
   private class_607 method_1460(class_433 var1) {
      if (this.field_1151.field_1181 == null) {
         throw new class_456("The ad response must specify one of the supported ad sizes.", 0);
      } else {
         String[] var9 = this.field_1151.field_1181.split("x");
         if (var9.length != 2) {
            throw new class_456("Could not parse the ad size from the ad response: " + this.field_1151.field_1181, 0);
         } else {
            int var6;
            int var7;
            try {
               var6 = Integer.parseInt(var9[0]);
               var7 = Integer.parseInt(var9[1]);
            } catch (NumberFormatException var11) {
               throw new class_456("Could not parse the ad size from the ad response: " + this.field_1151.field_1181, 0);
            }

            class_607[] var12 = var1.field_1160.field_2027;
            int var8 = var12.length;

            for(int var3 = 0; var3 < var8; ++var3) {
               class_607 var10 = var12[var3];
               float var2 = this.field_1146.getResources().getDisplayMetrics().density;
               int var4;
               if (var10.field_2025 == -1) {
                  var4 = (int)((float)var10.field_2026 / var2);
               } else {
                  var4 = var10.field_2025;
               }

               int var5;
               if (var10.field_2022 == -2) {
                  var5 = (int)((float)var10.field_2023 / var2);
               } else {
                  var5 = var10.field_2022;
               }

               if (var6 == var4 && var7 == var5) {
                  return new class_607(var10, var1.field_1160.field_2027);
               }
            }

            throw new class_456("The ad size from the ad response was not one of the requested sizes: " + this.field_1151.field_1181, 0);
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.cy) java.lang.Object
   // $FF: synthetic method
   static Object method_1461(class_431 var0) {
      return var0.field_1147;
   }

   // $FF: renamed from: a (long) void
   private void method_1462(long var1) {
      class_468.field_1283.post(new class_457(this));
      this.method_1468(var1);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.bz, long) void
   private void method_1463(class_433 var1, long var2) {
      this.field_1153 = new class_528(this.field_1146, var1, this.field_1143, this.field_1154);
      this.field_1155 = this.field_1153.method_1789(var2, 60000L);
      switch(this.field_1155.field_1672) {
      case 0:
         return;
      case 1:
         throw new class_456("No fill from any mediation ad networks.", 3);
      default:
         throw new class_456("Unexpected mediation result: " + this.field_1155.field_1672, 0);
      }
   }

   // $FF: renamed from: b (com.google.android.gms.internal.cy) com.google.android.gms.internal.cx
   // $FF: synthetic method
   static class_51 method_1464(class_431 var0) {
      return var0.field_1144;
   }

   // $FF: renamed from: b (long) void
   private void method_1465(long var1) {
      do {
         if (!this.method_1470(var1)) {
            throw new class_456("Timed out waiting for ad response.", 2);
         }
      } while(this.field_1151 == null);

      this.field_1150 = null;
      if (this.field_1151.field_1173 != -2 && this.field_1151.field_1173 != -3) {
         throw new class_456("There was a problem getting an ad response. ErrorCode: " + this.field_1151.field_1173, this.field_1151.field_1173);
      }
   }

   // $FF: renamed from: c (com.google.android.gms.internal.cy) com.google.android.gms.internal.cb
   // $FF: synthetic method
   static class_434 method_1466(class_431 var0) {
      return var0.field_1151;
   }

   // $FF: renamed from: c () void
   private void method_1467() {
      if (this.field_1151.field_1173 != -3) {
         if (TextUtils.isEmpty(this.field_1151.field_1171)) {
            throw new class_456("No fill from ad server.", 3);
         }

         if (this.field_1151.field_1176) {
            try {
               this.field_1154 = new class_537(this.field_1151.field_1171);
               return;
            } catch (JSONException var2) {
               throw new class_456("Could not parse mediation config: " + this.field_1151.field_1171, 0);
            }
         }
      }

   }

   // $FF: renamed from: c (long) void
   private void method_1468(long var1) {
      do {
         if (!this.method_1470(var1)) {
            throw new class_456("Timed out waiting for WebView to finish loading.", 2);
         }
      } while(!this.field_1152);

   }

   // $FF: renamed from: d (com.google.android.gms.internal.cy) com.google.android.gms.internal.ev
   // $FF: synthetic method
   static class_473 method_1469(class_431 var0) {
      return var0.field_1145;
   }

   // $FF: renamed from: d (long) boolean
   private boolean method_1470(long var1) {
      var1 = 60000L - (SystemClock.elapsedRealtime() - var1);
      if (var1 <= 0L) {
         return false;
      } else {
         try {
            this.field_1147.wait(var1);
            return true;
         } catch (InterruptedException var4) {
            throw new class_456("Ad request cancelled.", -1);
         }
      }
   }

   // $FF: renamed from: a () void
   public void method_1453() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (com.google.android.gms.internal.cb) void
   public void method_154(class_434 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev) void
   public void method_155(class_473 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_1454() {
      Object var1 = this.field_1147;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label196: {
         try {
            if (this.field_1150 != null) {
               this.field_1150.method_1456();
            }
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label196;
         }

         try {
            this.field_1145.stopLoading();
            class_466.method_1588(this.field_1145);
            if (this.field_1153 != null) {
               this.field_1153.method_1790();
            }
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label196;
         }

         label186:
         try {
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label186;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }
}
