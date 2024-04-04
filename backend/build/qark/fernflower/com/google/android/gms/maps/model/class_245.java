package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.d
public class class_245 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.GroundOverlayOptions, android.os.Parcel, int) void
   static void method_900(GroundOverlayOptions var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_995());
      class_333.method_1143(var1, 2, var0.method_994(), false);
      class_333.method_1145(var1, 3, var0.method_996(), var2, false);
      class_333.method_1139(var1, 4, var0.method_997());
      class_333.method_1139(var1, 5, var0.method_998());
      class_333.method_1145(var1, 6, var0.method_999(), var2, false);
      class_333.method_1139(var1, 7, var0.method_1000());
      class_333.method_1139(var1, 8, var0.method_1001());
      class_333.method_1150(var1, 9, var0.method_1005());
      class_333.method_1139(var1, 10, var0.method_1002());
      class_333.method_1139(var1, 11, var0.method_1003());
      class_333.method_1139(var1, 12, var0.method_1004());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.GroundOverlayOptions
   public GroundOverlayOptions method_901(Parcel var1) {
      int var10 = class_327.method_1099(var1);
      int var9 = 0;
      IBinder var15 = null;
      LatLng var14 = null;
      float var8 = 0.0F;
      float var7 = 0.0F;
      LatLngBounds var13 = null;
      float var6 = 0.0F;
      float var5 = 0.0F;
      boolean var12 = false;
      float var4 = 0.0F;
      float var3 = 0.0F;
      float var2 = 0.0F;

      while(var1.dataPosition() < var10) {
         int var11 = class_327.method_1093(var1);
         switch(class_327.method_1092(var11)) {
         case 1:
            var9 = class_327.method_1107(var1, var11);
            break;
         case 2:
            var15 = class_327.method_1114(var1, var11);
            break;
         case 3:
            var14 = (LatLng)class_327.method_1095(var1, var11, LatLng.field_648);
            break;
         case 4:
            var8 = class_327.method_1110(var1, var11);
            break;
         case 5:
            var7 = class_327.method_1110(var1, var11);
            break;
         case 6:
            var13 = (LatLngBounds)class_327.method_1095(var1, var11, LatLngBounds.field_1406);
            break;
         case 7:
            var6 = class_327.method_1110(var1, var11);
            break;
         case 8:
            var5 = class_327.method_1110(var1, var11);
            break;
         case 9:
            var12 = class_327.method_1103(var1, var11);
            break;
         case 10:
            var4 = class_327.method_1110(var1, var11);
            break;
         case 11:
            var3 = class_327.method_1110(var1, var11);
            break;
         case 12:
            var2 = class_327.method_1110(var1, var11);
            break;
         default:
            class_327.method_1100(var1, var11);
         }
      }

      if (var1.dataPosition() != var10) {
         throw new class_330("Overread allowed size end=" + var10, var1);
      } else {
         return new GroundOverlayOptions(var9, var15, var14, var8, var7, var13, var6, var5, var12, var4, var3, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.GroundOverlayOptions[]
   public GroundOverlayOptions[] method_902(int var1) {
      return new GroundOverlayOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_901(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_902(var1);
   }
}
