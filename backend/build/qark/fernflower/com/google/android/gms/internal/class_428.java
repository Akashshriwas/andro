package com.google.android.gms.internal;

import android.os.RemoteException;

// $FF: renamed from: com.google.android.gms.internal.df
public abstract class class_428 extends class_426 {
   // $FF: renamed from: a com.google.android.gms.internal.bz
   private final class_433 field_1137;
   // $FF: renamed from: b com.google.android.gms.internal.de
   private final class_54 field_1138;

   public class_428(class_433 var1, class_54 var2) {
      this.field_1137 = var1;
      this.field_1138 = var2;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.dp, com.google.android.gms.internal.bz) com.google.android.gms.internal.cb
   private static class_434 method_1457(class_53 var0, class_433 var1) {
      try {
         class_434 var3 = var0.method_153(var1);
         return var3;
      } catch (RemoteException var2) {
         class_467.method_1607("Could not fetch ad response from ad request service.", var2);
         return null;
      }
   }

   // $FF: renamed from: a () void
   public final void method_1453() {
      class_434 var23;
      label164: {
         Throwable var10000;
         label163: {
            class_53 var1;
            boolean var10001;
            try {
               var1 = this.method_1459();
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label163;
            }

            if (var1 == null) {
               label153:
               try {
                  var23 = new class_434(0);
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label153;
               }
            } else {
               label166: {
                  class_434 var2;
                  try {
                     var2 = method_1457(var1, this.field_1137);
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label166;
                  }

                  var23 = var2;
                  if (var2 != null) {
                     break label164;
                  }

                  label155:
                  try {
                     var23 = new class_434(0);
                  } catch (Throwable var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label155;
                  }
               }
            }
            break label164;
         }

         Throwable var24 = var10000;
         this.method_1458();
         throw var24;
      }

      this.method_1458();
      this.field_1138.method_154(var23);
   }

   // $FF: renamed from: b () void
   public final void method_1454() {
      this.method_1458();
   }

   // $FF: renamed from: c () void
   public abstract void method_1458();

   // $FF: renamed from: d () com.google.android.gms.internal.dp
   public abstract class_53 method_1459();
}
