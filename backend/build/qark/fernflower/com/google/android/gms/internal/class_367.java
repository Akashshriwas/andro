package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.ib
public class class_367 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.fn, android.os.Parcel, int) void
   static void method_1272(class_488 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.method_1689(), false);
      class_333.method_1140(var1, 1000, var0.method_1684());
      class_333.method_1141(var1, 2, var0.method_1690());
      class_333.method_1149(var1, 3, var0.method_1685());
      class_333.method_1138(var1, 4, var0.method_1686());
      class_333.method_1138(var1, 5, var0.method_1687());
      class_333.method_1139(var1, 6, var0.method_1688());
      class_333.method_1140(var1, 7, var0.method_1691());
      class_333.method_1140(var1, 8, var0.method_1692());
      class_333.method_1140(var1, 9, var0.method_1693());
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.fn
   public class_488 method_1273(Parcel var1) {
      int var12 = class_327.method_1099(var1);
      int var11 = 0;
      String var16 = null;
      int var10 = 0;
      short var2 = 0;
      double var5 = 0.0D;
      double var3 = 0.0D;
      float var7 = 0.0F;
      long var14 = 0L;
      int var9 = 0;
      int var8 = -1;

      while(var1.dataPosition() < var12) {
         int var13 = class_327.method_1093(var1);
         switch(class_327.method_1092(var13)) {
         case 1:
            var16 = class_327.method_1113(var1, var13);
            break;
         case 2:
            var14 = class_327.method_1108(var1, var13);
            break;
         case 3:
            var2 = class_327.method_1106(var1, var13);
            break;
         case 4:
            var5 = class_327.method_1111(var1, var13);
            break;
         case 5:
            var3 = class_327.method_1111(var1, var13);
            break;
         case 6:
            var7 = class_327.method_1110(var1, var13);
            break;
         case 7:
            var10 = class_327.method_1107(var1, var13);
            break;
         case 8:
            var9 = class_327.method_1107(var1, var13);
            break;
         case 9:
            var8 = class_327.method_1107(var1, var13);
            break;
         case 1000:
            var11 = class_327.method_1107(var1, var13);
            break;
         default:
            class_327.method_1100(var1, var13);
         }
      }

      if (var1.dataPosition() != var12) {
         throw new class_330("Overread allowed size end=" + var12, var1);
      } else {
         return new class_488(var11, var16, var10, var2, var5, var3, var7, var14, var9, var8);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.fn[]
   public class_488[] method_1274(int var1) {
      return new class_488[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1273(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1274(var1);
   }
}
