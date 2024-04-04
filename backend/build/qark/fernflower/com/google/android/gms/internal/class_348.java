package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.hj
public class class_348 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ee$a, android.os.Parcel, int) void
   static void method_1212(ee$a var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_2092());
      class_333.method_1140(var1, 2, var0.method_2095());
      class_333.method_1150(var1, 3, var0.method_2096());
      class_333.method_1140(var1, 4, var0.method_2097());
      class_333.method_1150(var1, 5, var0.method_2098());
      class_333.method_1147(var1, 6, var0.method_2099(), false);
      class_333.method_1140(var1, 7, var0.method_2100());
      class_333.method_1147(var1, 8, var0.method_2102(), false);
      class_333.method_1145(var1, 9, var0.method_2104(), var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ee$a
   public ee$a method_1213(Parcel var1) {
      class_453 var10 = null;
      int var2 = 0;
      int var6 = class_327.method_1099(var1);
      String var11 = null;
      String var12 = null;
      boolean var8 = false;
      int var3 = 0;
      boolean var9 = false;
      int var4 = 0;
      int var5 = 0;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var5 = class_327.method_1107(var1, var7);
            break;
         case 2:
            var4 = class_327.method_1107(var1, var7);
            break;
         case 3:
            var9 = class_327.method_1103(var1, var7);
            break;
         case 4:
            var3 = class_327.method_1107(var1, var7);
            break;
         case 5:
            var8 = class_327.method_1103(var1, var7);
            break;
         case 6:
            var12 = class_327.method_1113(var1, var7);
            break;
         case 7:
            var2 = class_327.method_1107(var1, var7);
            break;
         case 8:
            var11 = class_327.method_1113(var1, var7);
            break;
         case 9:
            var10 = (class_453)class_327.method_1095(var1, var7, class_453.field_1222);
            break;
         default:
            class_327.method_1100(var1, var7);
         }
      }

      if (var1.dataPosition() != var6) {
         throw new class_330("Overread allowed size end=" + var6, var1);
      } else {
         return new ee$a(var5, var4, var9, var3, var8, var12, var2, var11, var10);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ee$a[]
   public ee$a[] method_1214(int var1) {
      return new ee$a[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1213(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1214(var1);
   }
}
