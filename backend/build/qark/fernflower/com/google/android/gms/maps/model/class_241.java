package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.maps.model.h
public class class_241 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.maps.model.PolygonOptions, android.os.Parcel, int) void
   static void method_888(PolygonOptions var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_671());
      class_333.method_1158(var1, 2, var0.method_673(), false);
      class_333.method_1160(var1, 3, var0.method_672(), false);
      class_333.method_1139(var1, 4, var0.method_674());
      class_333.method_1140(var1, 5, var0.method_675());
      class_333.method_1140(var1, 6, var0.method_676());
      class_333.method_1139(var1, 7, var0.method_677());
      class_333.method_1150(var1, 8, var0.method_678());
      class_333.method_1150(var1, 9, var0.method_679());
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.maps.model.PolygonOptions
   public PolygonOptions method_889(Parcel var1) {
      float var2 = 0.0F;
      boolean var9 = false;
      int var7 = class_327.method_1099(var1);
      ArrayList var11 = null;
      ArrayList var12 = new ArrayList();
      boolean var10 = false;
      int var4 = 0;
      int var5 = 0;
      float var3 = 0.0F;
      int var6 = 0;

      while(var1.dataPosition() < var7) {
         int var8 = class_327.method_1093(var1);
         switch(class_327.method_1092(var8)) {
         case 1:
            var6 = class_327.method_1107(var1, var8);
            break;
         case 2:
            var11 = class_327.method_1102(var1, var8, LatLng.field_648);
            break;
         case 3:
            class_327.method_1098(var1, var8, var12, this.getClass().getClassLoader());
            break;
         case 4:
            var3 = class_327.method_1110(var1, var8);
            break;
         case 5:
            var5 = class_327.method_1107(var1, var8);
            break;
         case 6:
            var4 = class_327.method_1107(var1, var8);
            break;
         case 7:
            var2 = class_327.method_1110(var1, var8);
            break;
         case 8:
            var10 = class_327.method_1103(var1, var8);
            break;
         case 9:
            var9 = class_327.method_1103(var1, var8);
            break;
         default:
            class_327.method_1100(var1, var8);
         }
      }

      if (var1.dataPosition() != var7) {
         throw new class_330("Overread allowed size end=" + var7, var1);
      } else {
         return new PolygonOptions(var6, var11, var12, var3, var5, var4, var2, var10, var9);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.maps.model.PolygonOptions[]
   public PolygonOptions[] method_890(int var1) {
      return new PolygonOptions[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_889(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_890(var1);
   }
}
