package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.g
public class class_244 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.MarkerOptions, android.os.Parcel, int) void
   static void method_897(MarkerOptions var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_2156());
      class_333.method_1145(var1, 2, var0.method_2158(), var2, false);
      class_333.method_1147(var1, 3, var0.method_2159(), false);
      class_333.method_1147(var1, 4, var0.method_2160(), false);
      class_333.method_1143(var1, 5, var0.method_2157(), false);
      class_333.method_1139(var1, 6, var0.method_2161());
      class_333.method_1139(var1, 7, var0.method_2162());
      class_333.method_1150(var1, 8, var0.method_2163());
      class_333.method_1150(var1, 9, var0.method_2164());
      class_333.method_1150(var1, 10, var0.method_2165());
      class_333.method_1139(var1, 11, var0.method_2166());
      class_333.method_1139(var1, 12, var0.method_2167());
      class_333.method_1139(var1, 13, var0.method_2168());
      class_333.method_1139(var1, 14, var0.method_2169());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.MarkerOptions
   public MarkerOptions method_898(Parcel var1) {
      int var9 = class_327.method_1099(var1);
      int var8 = 0;
      LatLng var17 = null;
      String var16 = null;
      String var15 = null;
      IBinder var14 = null;
      float var7 = 0.0F;
      float var6 = 0.0F;
      boolean var13 = false;
      boolean var12 = false;
      boolean var11 = false;
      float var5 = 0.0F;
      float var4 = 0.5F;
      float var3 = 0.0F;
      float var2 = 1.0F;

      while(var1.dataPosition() < var9) {
         int var10 = class_327.method_1093(var1);
         switch(class_327.method_1092(var10)) {
         case 1:
            var8 = class_327.method_1107(var1, var10);
            break;
         case 2:
            var17 = (LatLng)class_327.method_1095(var1, var10, LatLng.field_648);
            break;
         case 3:
            var16 = class_327.method_1113(var1, var10);
            break;
         case 4:
            var15 = class_327.method_1113(var1, var10);
            break;
         case 5:
            var14 = class_327.method_1114(var1, var10);
            break;
         case 6:
            var7 = class_327.method_1110(var1, var10);
            break;
         case 7:
            var6 = class_327.method_1110(var1, var10);
            break;
         case 8:
            var13 = class_327.method_1103(var1, var10);
            break;
         case 9:
            var12 = class_327.method_1103(var1, var10);
            break;
         case 10:
            var11 = class_327.method_1103(var1, var10);
            break;
         case 11:
            var5 = class_327.method_1110(var1, var10);
            break;
         case 12:
            var4 = class_327.method_1110(var1, var10);
            break;
         case 13:
            var3 = class_327.method_1110(var1, var10);
            break;
         case 14:
            var2 = class_327.method_1110(var1, var10);
            break;
         default:
            class_327.method_1100(var1, var10);
         }
      }

      if (var1.dataPosition() != var9) {
         throw new class_330("Overread allowed size end=" + var9, var1);
      } else {
         return new MarkerOptions(var8, var17, var16, var15, var14, var7, var6, var13, var12, var11, var5, var4, var3, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.MarkerOptions[]
   public MarkerOptions[] method_899(int var1) {
      return new MarkerOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_898(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_899(var1);
   }
}
