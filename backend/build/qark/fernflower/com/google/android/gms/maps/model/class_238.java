package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.l
public class class_238 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.TileOverlayOptions, android.os.Parcel, int) void
   static void method_882(TileOverlayOptions var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_869());
      class_333.method_1143(var1, 2, var0.method_870(), false);
      class_333.method_1150(var1, 3, var0.method_872());
      class_333.method_1139(var1, 4, var0.method_871());
      class_333.method_1150(var1, 5, var0.method_873());
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.TileOverlayOptions
   public TileOverlayOptions method_883(Parcel var1) {
      boolean var7 = false;
      int var4 = class_327.method_1099(var1);
      IBinder var8 = null;
      float var2 = 0.0F;
      boolean var6 = true;
      int var3 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var3 = class_327.method_1107(var1, var5);
            break;
         case 2:
            var8 = class_327.method_1114(var1, var5);
            break;
         case 3:
            var7 = class_327.method_1103(var1, var5);
            break;
         case 4:
            var2 = class_327.method_1110(var1, var5);
            break;
         case 5:
            var6 = class_327.method_1103(var1, var5);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new TileOverlayOptions(var3, var8, var7, var2, var6);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.TileOverlayOptions[]
   public TileOverlayOptions[] method_884(int var1) {
      return new TileOverlayOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_883(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_884(var1);
   }
}
