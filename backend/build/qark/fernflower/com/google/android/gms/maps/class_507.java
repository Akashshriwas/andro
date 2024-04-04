package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.maps.model.CameraPosition;

// $FF: renamed from: com.google.android.gms.maps.a
public class class_507 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.GoogleMapOptions, android.os.Parcel, int) void
   static void method_1722(GoogleMapOptions var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_270());
      class_333.method_1137(var1, 2, var0.method_271());
      class_333.method_1137(var1, 3, var0.method_272());
      class_333.method_1140(var1, 4, var0.method_279());
      class_333.method_1145(var1, 5, var0.method_280(), var2, false);
      class_333.method_1137(var1, 6, var0.method_273());
      class_333.method_1137(var1, 7, var0.method_274());
      class_333.method_1137(var1, 8, var0.method_275());
      class_333.method_1137(var1, 9, var0.method_276());
      class_333.method_1137(var1, 10, var0.method_277());
      class_333.method_1137(var1, 11, var0.method_278());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.GoogleMapOptions
   public GoogleMapOptions method_1723(Parcel var1) {
      byte var2 = 0;
      int var12 = class_327.method_1099(var1);
      CameraPosition var14 = null;
      byte var3 = 0;
      byte var4 = 0;
      byte var5 = 0;
      byte var6 = 0;
      byte var7 = 0;
      int var10 = 0;
      byte var8 = 0;
      byte var9 = 0;
      int var11 = 0;

      while(var1.dataPosition() < var12) {
         int var13 = class_327.method_1093(var1);
         switch(class_327.method_1092(var13)) {
         case 1:
            var11 = class_327.method_1107(var1, var13);
            break;
         case 2:
            var9 = class_327.method_1105(var1, var13);
            break;
         case 3:
            var8 = class_327.method_1105(var1, var13);
            break;
         case 4:
            var10 = class_327.method_1107(var1, var13);
            break;
         case 5:
            var14 = (CameraPosition)class_327.method_1095(var1, var13, CameraPosition.field_1248);
            break;
         case 6:
            var7 = class_327.method_1105(var1, var13);
            break;
         case 7:
            var6 = class_327.method_1105(var1, var13);
            break;
         case 8:
            var5 = class_327.method_1105(var1, var13);
            break;
         case 9:
            var4 = class_327.method_1105(var1, var13);
            break;
         case 10:
            var3 = class_327.method_1105(var1, var13);
            break;
         case 11:
            var2 = class_327.method_1105(var1, var13);
            break;
         default:
            class_327.method_1100(var1, var13);
         }
      }

      if (var1.dataPosition() != var12) {
         throw new class_330("Overread allowed size end=" + var12, var1);
      } else {
         return new GoogleMapOptions(var11, var9, var8, var10, var14, var7, var6, var5, var4, var3, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.GoogleMapOptions[]
   public GoogleMapOptions[] method_1724(int var1) {
      return new GoogleMapOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1723(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1724(var1);
   }
}
