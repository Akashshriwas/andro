package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.ka
public class class_398 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.v, android.os.Parcel, int) void
   static void method_1358(class_597 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1980);
      class_333.method_1141(var1, 2, var0.field_1981);
      class_333.method_1142(var1, 3, var0.field_1982, false);
      class_333.method_1140(var1, 4, var0.field_1983);
      class_333.method_1148(var1, 5, var0.field_1984, false);
      class_333.method_1150(var1, 6, var0.field_1985);
      class_333.method_1140(var1, 7, var0.field_1986);
      class_333.method_1150(var1, 8, var0.field_1987);
      class_333.method_1147(var1, 9, var0.field_1988, false);
      class_333.method_1145(var1, 10, var0.field_1989, var2, false);
      class_333.method_1145(var1, 11, var0.field_1990, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.v
   public class_597 method_1359(Parcel var1) {
      int var5 = class_327.method_1099(var1);
      int var4 = 0;
      long var7 = 0L;
      Bundle var15 = null;
      int var3 = 0;
      ArrayList var14 = null;
      boolean var10 = false;
      int var2 = 0;
      boolean var9 = false;
      String var13 = null;
      class_530 var12 = null;
      Location var11 = null;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var4 = class_327.method_1107(var1, var6);
            break;
         case 2:
            var7 = class_327.method_1108(var1, var6);
            break;
         case 3:
            var15 = class_327.method_1115(var1, var6);
            break;
         case 4:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 5:
            var14 = class_327.method_1125(var1, var6);
            break;
         case 6:
            var10 = class_327.method_1103(var1, var6);
            break;
         case 7:
            var2 = class_327.method_1107(var1, var6);
            break;
         case 8:
            var9 = class_327.method_1103(var1, var6);
            break;
         case 9:
            var13 = class_327.method_1113(var1, var6);
            break;
         case 10:
            var12 = (class_530)class_327.method_1095(var1, var6, class_530.field_1636);
            break;
         case 11:
            var11 = (Location)class_327.method_1095(var1, var6, Location.CREATOR);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new class_597(var4, var7, var15, var3, var14, var10, var2, var9, var13, var12, var11);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.v[]
   public class_597[] method_1360(int var1) {
      return new class_597[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1359(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1360(var1);
   }
}
