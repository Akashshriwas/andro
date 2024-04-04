package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.b
public class class_227 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.CameraPosition, android.os.Parcel, int) void
   static void method_845(CameraPosition var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1542());
      class_333.method_1145(var1, 2, var0.field_1249, var2, false);
      class_333.method_1139(var1, 3, var0.field_1250);
      class_333.method_1139(var1, 4, var0.field_1251);
      class_333.method_1139(var1, 5, var0.field_1252);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.CameraPosition
   public CameraPosition method_846(Parcel var1) {
      float var2 = 0.0F;
      int var6 = class_327.method_1099(var1);
      int var5 = 0;
      LatLng var8 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var5 = class_327.method_1107(var1, var7);
            break;
         case 2:
            var8 = (LatLng)class_327.method_1095(var1, var7, LatLng.field_648);
            break;
         case 3:
            var4 = class_327.method_1110(var1, var7);
            break;
         case 4:
            var3 = class_327.method_1110(var1, var7);
            break;
         case 5:
            var2 = class_327.method_1110(var1, var7);
            break;
         default:
            class_327.method_1100(var1, var7);
         }
      }

      if (var1.dataPosition() != var6) {
         throw new class_330("Overread allowed size end=" + var6, var1);
      } else {
         return new CameraPosition(var5, var8, var4, var3, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.CameraPosition[]
   public CameraPosition[] method_847(int var1) {
      return new CameraPosition[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_846(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_847(var1);
   }
}
