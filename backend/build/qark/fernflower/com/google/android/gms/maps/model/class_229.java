package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.c
public class class_229 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.CircleOptions, android.os.Parcel, int) void
   static void method_849(CircleOptions var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1919());
      class_333.method_1145(var1, 2, var0.method_1920(), var2, false);
      class_333.method_1138(var1, 3, var0.method_1921());
      class_333.method_1139(var1, 4, var0.method_1922());
      class_333.method_1140(var1, 5, var0.method_1923());
      class_333.method_1140(var1, 6, var0.method_1924());
      class_333.method_1139(var1, 7, var0.method_1925());
      class_333.method_1150(var1, 8, var0.method_1926());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.CircleOptions
   public CircleOptions method_850(Parcel var1) {
      float var4 = 0.0F;
      boolean var11 = false;
      int var9 = class_327.method_1099(var1);
      LatLng var12 = null;
      double var2 = 0.0D;
      int var6 = 0;
      int var7 = 0;
      float var5 = 0.0F;
      int var8 = 0;

      while(var1.dataPosition() < var9) {
         int var10 = class_327.method_1093(var1);
         switch(class_327.method_1092(var10)) {
         case 1:
            var8 = class_327.method_1107(var1, var10);
            break;
         case 2:
            var12 = (LatLng)class_327.method_1095(var1, var10, LatLng.field_648);
            break;
         case 3:
            var2 = class_327.method_1111(var1, var10);
            break;
         case 4:
            var5 = class_327.method_1110(var1, var10);
            break;
         case 5:
            var7 = class_327.method_1107(var1, var10);
            break;
         case 6:
            var6 = class_327.method_1107(var1, var10);
            break;
         case 7:
            var4 = class_327.method_1110(var1, var10);
            break;
         case 8:
            var11 = class_327.method_1103(var1, var10);
            break;
         default:
            class_327.method_1100(var1, var10);
         }
      }

      if (var1.dataPosition() != var9) {
         throw new class_330("Overread allowed size end=" + var9, var1);
      } else {
         return new CircleOptions(var8, var12, var2, var5, var7, var6, var4, var11);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.CircleOptions[]
   public CircleOptions[] method_851(int var1) {
      return new CircleOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_850(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_851(var1);
   }
}
