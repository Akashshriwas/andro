package com.google.android.gms.internal;

import android.content.Context;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.aj
public final class class_528 {
   // $FF: renamed from: a com.google.android.gms.internal.bz
   private final class_433 field_1629;
   // $FF: renamed from: b com.google.android.gms.internal.bl
   private final class_62 field_1630;
   // $FF: renamed from: c android.content.Context
   private final Context field_1631;
   // $FF: renamed from: d java.lang.Object
   private final Object field_1632 = new Object();
   // $FF: renamed from: e com.google.android.gms.internal.am
   private final class_537 field_1633;
   // $FF: renamed from: f boolean
   private boolean field_1634 = false;
   // $FF: renamed from: g com.google.android.gms.internal.ap
   private class_531 field_1635;

   public class_528(Context var1, class_433 var2, class_62 var3, class_537 var4) {
      this.field_1631 = var1;
      this.field_1629 = var2;
      this.field_1630 = var3;
      this.field_1633 = var4;
   }

   // $FF: renamed from: a (long, long) com.google.android.gms.internal.ar
   public class_542 method_1789(long var1, long var3) {
      class_467.method_1603("Starting mediation.");
      Iterator var6 = this.field_1633.field_1665.iterator();

      while(var6.hasNext()) {
         class_524 var7 = (class_524)var6.next();
         class_467.method_1608("Trying mediation network: " + var7.field_1618);
         Iterator var8 = var7.field_1619.iterator();

         while(var8.hasNext()) {
            String var9 = (String)var8.next();
            Object var5 = this.field_1632;
            synchronized(var5){}

            Throwable var10000;
            boolean var10001;
            label225: {
               try {
                  if (this.field_1634) {
                     class_542 var24 = new class_542(-1);
                     return var24;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label225;
               }

               try {
                  this.field_1635 = new class_531(this.field_1631, var9, this.field_1630, this.field_1633, var7, this.field_1629.field_1159, this.field_1629.field_1160);
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label225;
               }

               class_542 var22 = this.field_1635.method_1804(var1, var3);
               if (var22.field_1672 == 0) {
                  class_467.method_1603("Adapter succeeded.");
                  return var22;
               }

               if (var22.field_1674 != null) {
                  class_468.field_1283.post(new class_526(this, var22));
               }
               continue;
            }

            while(true) {
               Throwable var23 = var10000;

               try {
                  throw var23;
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      return new class_542(1);
   }

   // $FF: renamed from: a () void
   public void method_1790() {
      Object var1 = this.field_1632;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            this.field_1634 = true;
            if (this.field_1635 != null) {
               this.field_1635.method_1805();
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }
}
