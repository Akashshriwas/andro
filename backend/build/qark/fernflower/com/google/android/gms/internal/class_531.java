package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.a.class_376;

// $FF: renamed from: com.google.android.gms.internal.ap
public final class class_531 implements class_58 {
   // $FF: renamed from: a java.lang.String
   private final String field_1652;
   // $FF: renamed from: b com.google.android.gms.internal.bl
   private final class_62 field_1653;
   // $FF: renamed from: c long
   private final long field_1654;
   // $FF: renamed from: d com.google.android.gms.internal.al
   private final class_524 field_1655;
   // $FF: renamed from: e com.google.android.gms.internal.v
   private final class_597 field_1656;
   // $FF: renamed from: f com.google.android.gms.internal.x
   private final class_607 field_1657;
   // $FF: renamed from: g android.content.Context
   private final Context field_1658;
   // $FF: renamed from: h java.lang.Object
   private final Object field_1659 = new Object();
   // $FF: renamed from: i com.google.android.gms.internal.bp
   private class_63 field_1660;
   // $FF: renamed from: j int
   private int field_1661 = -2;

   public class_531(Context var1, String var2, class_62 var3, class_537 var4, class_524 var5, class_597 var6, class_607 var7) {
      this.field_1658 = var1;
      this.field_1652 = var2;
      this.field_1653 = var3;
      long var8;
      if (var4.field_1666 != -1L) {
         var8 = var4.field_1666;
      } else {
         var8 = 10000L;
      }

      this.field_1654 = var8;
      this.field_1655 = var5;
      this.field_1656 = var6;
      this.field_1657 = var7;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ap, com.google.android.gms.internal.bp) com.google.android.gms.internal.bp
   // $FF: synthetic method
   static class_63 method_1794(class_531 var0, class_63 var1) {
      var0.field_1660 = var1;
      return var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ap) java.lang.Object
   // $FF: synthetic method
   static Object method_1795(class_531 var0) {
      return var0.field_1659;
   }

   // $FF: renamed from: a (long, long, long, long) void
   private void method_1796(long var1, long var3, long var5, long var7) {
      while(this.field_1661 == -2) {
         this.method_1801(var1, var3, var5, var7);
      }

   }

   // $FF: renamed from: a (com.google.android.gms.internal.ao) void
   private void method_1797(class_534 var1) {
      try {
         if (this.field_1657.field_2024) {
            this.field_1660.method_173(class_376.method_1293(this.field_1658), this.field_1656, this.field_1655.field_1622, this.field_1655.field_1617, var1);
         } else {
            this.field_1660.method_175(class_376.method_1293(this.field_1658), this.field_1657, this.field_1656, this.field_1655.field_1622, this.field_1655.field_1617, var1);
         }
      } catch (RemoteException var2) {
         class_467.method_1607("Could not request ad from mediation adapter.", var2);
         this.method_165(5);
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ap, com.google.android.gms.internal.ao) void
   // $FF: synthetic method
   static void method_1798(class_531 var0, class_534 var1) {
      var0.method_1797(var1);
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ap) int
   // $FF: synthetic method
   static int method_1799(class_531 var0) {
      return var0.field_1661;
   }

   // $FF: renamed from: b () com.google.android.gms.internal.bp
   private class_63 method_1800() {
      class_467.method_1608("Instantiating mediation adapter: " + this.field_1652);

      try {
         class_63 var1 = this.field_1653.method_170(this.field_1652);
         return var1;
      } catch (RemoteException var2) {
         class_467.method_1604("Could not instantiate mediation adapter: " + this.field_1652, var2);
         return null;
      }
   }

   // $FF: renamed from: b (long, long, long, long) void
   private void method_1801(long var1, long var3, long var5, long var7) {
      long var9 = SystemClock.elapsedRealtime();
      var1 = var3 - (var9 - var1);
      var3 = var7 - (var9 - var5);
      if (var1 > 0L && var3 > 0L) {
         try {
            this.field_1659.wait(Math.min(var1, var3));
         } catch (InterruptedException var12) {
            this.field_1661 = -1;
         }
      } else {
         class_467.method_1608("Timed out waiting for adapter.");
         this.field_1661 = 3;
      }
   }

   // $FF: renamed from: c (com.google.android.gms.internal.ap) com.google.android.gms.internal.bp
   // $FF: synthetic method
   static class_63 method_1802(class_531 var0) {
      return var0.method_1800();
   }

   // $FF: renamed from: d (com.google.android.gms.internal.ap) com.google.android.gms.internal.bp
   // $FF: synthetic method
   static class_63 method_1803(class_531 var0) {
      return var0.field_1660;
   }

   // $FF: renamed from: a (long, long) com.google.android.gms.internal.ar
   public class_542 method_1804(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   public void method_1805() {
      Object var1 = this.field_1659;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label198: {
         label202: {
            RemoteException var2;
            try {
               try {
                  if (this.field_1660 != null) {
                     this.field_1660.method_177();
                  }
                  break label202;
               } catch (RemoteException var26) {
                  var2 = var26;
               }
            } catch (Throwable var27) {
               var10000 = var27;
               var10001 = false;
               break label198;
            }

            try {
               class_467.method_1607("Could not destroy mediation adapter.", var2);
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label198;
            }
         }

         label189:
         try {
            this.field_1661 = -1;
            this.field_1659.notify();
            return;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label189;
         }
      }

      while(true) {
         Throwable var28 = var10000;

         try {
            throw var28;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (int) void
   public void method_165(int param1) {
      // $FF: Couldn't be decompiled
   }
}
