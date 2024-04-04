package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.dn
public class class_443 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.bz, android.os.Parcel, int) void
   static void method_1497(class_433 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1157);
      class_333.method_1142(var1, 2, var0.field_1158, false);
      class_333.method_1145(var1, 3, var0.field_1159, var2, false);
      class_333.method_1145(var1, 4, var0.field_1160, var2, false);
      class_333.method_1147(var1, 5, var0.field_1161, false);
      class_333.method_1145(var1, 6, var0.field_1162, var2, false);
      class_333.method_1145(var1, 7, var0.field_1163, var2, false);
      class_333.method_1147(var1, 8, var0.field_1164, false);
      class_333.method_1147(var1, 9, var0.field_1165, false);
      class_333.method_1147(var1, 10, var0.field_1166, false);
      class_333.method_1145(var1, 11, var0.field_1167, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.bz
   public class_433 method_1498(Parcel var1) {
      class_424 var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      PackageInfo var9 = null;
      ApplicationInfo var10 = null;
      String var11 = null;
      class_607 var12 = null;
      class_597 var13 = null;
      Bundle var14 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var14 = class_327.method_1115(var1, var4);
            break;
         case 3:
            var13 = (class_597)class_327.method_1095(var1, var4, class_597.field_1979);
            break;
         case 4:
            var12 = (class_607)class_327.method_1095(var1, var4, class_607.field_2019);
            break;
         case 5:
            var11 = class_327.method_1113(var1, var4);
            break;
         case 6:
            var10 = (ApplicationInfo)class_327.method_1095(var1, var4, ApplicationInfo.CREATOR);
            break;
         case 7:
            var9 = (PackageInfo)class_327.method_1095(var1, var4, PackageInfo.CREATOR);
            break;
         case 8:
            var8 = class_327.method_1113(var1, var4);
            break;
         case 9:
            var7 = class_327.method_1113(var1, var4);
            break;
         case 10:
            var6 = class_327.method_1113(var1, var4);
            break;
         case 11:
            var5 = (class_424)class_327.method_1095(var1, var4, class_424.field_1125);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new class_433(var2, var14, var13, var12, var11, var10, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.bz[]
   public class_433[] method_1499(int var1) {
      return new class_433[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1498(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1499(var1);
   }
}
