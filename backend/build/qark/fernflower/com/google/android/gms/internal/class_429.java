package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.class_174;
import com.google.android.gms.common.class_25;
import com.google.android.gms.common.class_26;

// $FF: renamed from: com.google.android.gms.internal.di
public final class class_429 extends class_428 implements class_26, class_25 {
   // $FF: renamed from: a com.google.android.gms.internal.de
   private final class_54 field_1139;
   // $FF: renamed from: b com.google.android.gms.internal.dk
   private final class_461 field_1140;
   // $FF: renamed from: c java.lang.Object
   private final Object field_1141 = new Object();

   public class_429(Context var1, class_433 var2, class_54 var3) {
      super(var2, var3);
      this.field_1139 = var3;
      this.field_1140 = new class_461(var1, this, this, var2.field_1167.field_1129);
      this.field_1140.d();
   }

   // $FF: renamed from: a (android.os.Bundle) void
   public void method_81(Bundle var1) {
      this.e();
   }

   // $FF: renamed from: a (com.google.android.gms.common.a) void
   public void method_80(class_174 var1) {
      this.field_1139.method_154(new class_434(0));
   }

   // $FF: renamed from: a_ () void
   public void method_82() {
      class_467.method_1603("Disconnected from remote ad request service.");
   }

   // $FF: renamed from: c () void
   public void method_1458() {
      Object var1 = this.field_1141;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label183: {
         label182: {
            try {
               if (!this.field_1140.e() && !this.field_1140.f()) {
                  break label182;
               }
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label183;
            }

            try {
               this.field_1140.g();
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label183;
            }
         }

         label173:
         try {
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label173;
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

   // $FF: renamed from: d () com.google.android.gms.internal.dp
   public class_53 method_1459() {
      Object var1 = this.field_1141;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label180: {
         class_53 var2;
         label179: {
            try {
               try {
                  var2 = this.field_1140.method_1570();
                  break label179;
               } catch (IllegalStateException var26) {
               }
            } catch (Throwable var27) {
               var10000 = var27;
               var10001 = false;
               break label180;
            }

            try {
               return null;
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label180;
            }
         }

         label173:
         try {
            return var2;
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label173;
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
}
