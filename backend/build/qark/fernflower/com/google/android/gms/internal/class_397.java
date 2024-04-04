package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.kb
public class class_397 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.x, android.os.Parcel, int) void
   static void method_1355(class_607 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_2020);
      class_333.method_1147(var1, 2, var0.field_2021, false);
      class_333.method_1140(var1, 3, var0.field_2022);
      class_333.method_1140(var1, 4, var0.field_2023);
      class_333.method_1150(var1, 5, var0.field_2024);
      class_333.method_1140(var1, 6, var0.field_2025);
      class_333.method_1140(var1, 7, var0.field_2026);
      class_333.method_1153(var1, 8, var0.field_2027, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.x
   public class_607 method_1356(Parcel var1) {
      class_607[] var10 = null;
      int var2 = 0;
      int var7 = class_327.method_1099(var1);
      int var3 = 0;
      boolean var9 = false;
      int var4 = 0;
      int var5 = 0;
      String var11 = null;
      int var6 = 0;

      while(var1.dataPosition() < var7) {
         int var8 = class_327.method_1093(var1);
         switch(class_327.method_1092(var8)) {
         case 1:
            var6 = class_327.method_1107(var1, var8);
            break;
         case 2:
            var11 = class_327.method_1113(var1, var8);
            break;
         case 3:
            var5 = class_327.method_1107(var1, var8);
            break;
         case 4:
            var4 = class_327.method_1107(var1, var8);
            break;
         case 5:
            var9 = class_327.method_1103(var1, var8);
            break;
         case 6:
            var3 = class_327.method_1107(var1, var8);
            break;
         case 7:
            var2 = class_327.method_1107(var1, var8);
            break;
         case 8:
            var10 = (class_607[])class_327.method_1101(var1, var8, class_607.field_2019);
            break;
         default:
            class_327.method_1100(var1, var8);
         }
      }

      if (var1.dataPosition() != var7) {
         throw new class_330("Overread allowed size end=" + var7, var1);
      } else {
         return new class_607(var6, var11, var5, var4, var9, var3, var2, var10);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.x[]
   public class_607[] method_1357(int var1) {
      return new class_607[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1356(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1357(var1);
   }
}
