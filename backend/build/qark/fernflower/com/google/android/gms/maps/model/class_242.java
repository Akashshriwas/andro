package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.maps.model.i
public class class_242 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.PolylineOptions, android.os.Parcel, int) void
   static void method_891(PolylineOptions var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1760());
      class_333.method_1158(var1, 2, var0.method_1761(), false);
      class_333.method_1139(var1, 3, var0.method_1762());
      class_333.method_1140(var1, 4, var0.method_1763());
      class_333.method_1139(var1, 5, var0.method_1764());
      class_333.method_1150(var1, 6, var0.method_1765());
      class_333.method_1150(var1, 7, var0.method_1766());
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.PolylineOptions
   public PolylineOptions method_892(Parcel var1) {
      float var2 = 0.0F;
      boolean var8 = false;
      int var6 = class_327.method_1099(var1);
      ArrayList var10 = null;
      boolean var9 = false;
      int var4 = 0;
      float var3 = 0.0F;
      int var5 = 0;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var5 = class_327.method_1107(var1, var7);
            break;
         case 2:
            var10 = class_327.method_1102(var1, var7, LatLng.field_648);
            break;
         case 3:
            var3 = class_327.method_1110(var1, var7);
            break;
         case 4:
            var4 = class_327.method_1107(var1, var7);
            break;
         case 5:
            var2 = class_327.method_1110(var1, var7);
            break;
         case 6:
            var9 = class_327.method_1103(var1, var7);
            break;
         case 7:
            var8 = class_327.method_1103(var1, var7);
            break;
         default:
            class_327.method_1100(var1, var7);
         }
      }

      if (var1.dataPosition() != var6) {
         throw new class_330("Overread allowed size end=" + var6, var1);
      } else {
         return new PolylineOptions(var5, var10, var3, var4, var2, var9, var8);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.PolylineOptions[]
   public PolylineOptions[] method_893(int var1) {
      return new PolylineOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_892(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_893(var1);
   }
}