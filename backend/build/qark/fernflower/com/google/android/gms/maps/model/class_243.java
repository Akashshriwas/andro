package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.f
public class class_243 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.LatLng, android.os.Parcel, int) void
   static void method_894(LatLng var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_816());
      class_333.method_1138(var1, 2, var0.field_649);
      class_333.method_1138(var1, 3, var0.field_650);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.LatLng
   public LatLng method_895(Parcel var1) {
      double var2 = 0.0D;
      int var7 = class_327.method_1099(var1);
      int var6 = 0;
      double var4 = 0.0D;

      while(var1.dataPosition() < var7) {
         int var8 = class_327.method_1093(var1);
         switch(class_327.method_1092(var8)) {
         case 1:
            var6 = class_327.method_1107(var1, var8);
            break;
         case 2:
            var4 = class_327.method_1111(var1, var8);
            break;
         case 3:
            var2 = class_327.method_1111(var1, var8);
            break;
         default:
            class_327.method_1100(var1, var8);
         }
      }

      if (var1.dataPosition() != var7) {
         throw new class_330("Overread allowed size end=" + var7, var1);
      } else {
         return new LatLng(var6, var4, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.LatLng[]
   public LatLng[] method_896(int var1) {
      return new LatLng[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_895(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_896(var1);
   }
}