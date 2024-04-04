package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.ca
public class class_435 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.bj, android.os.Parcel, int) void
   static void method_1472(class_559 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1898);
      class_333.method_1147(var1, 2, var0.field_1899, false);
      class_333.method_1147(var1, 3, var0.field_1900, false);
      class_333.method_1147(var1, 4, var0.field_1901, false);
      class_333.method_1147(var1, 5, var0.field_1902, false);
      class_333.method_1147(var1, 6, var0.field_1903, false);
      class_333.method_1147(var1, 7, var0.field_1904, false);
      class_333.method_1147(var1, 8, var0.field_1905, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.bj
   public class_559 method_1473(Parcel var1) {
      String var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      String var10 = null;
      String var11 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var11 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var10 = class_327.method_1113(var1, var4);
            break;
         case 4:
            var9 = class_327.method_1113(var1, var4);
            break;
         case 5:
            var8 = class_327.method_1113(var1, var4);
            break;
         case 6:
            var7 = class_327.method_1113(var1, var4);
            break;
         case 7:
            var6 = class_327.method_1113(var1, var4);
            break;
         case 8:
            var5 = class_327.method_1113(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new class_559(var2, var11, var10, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.bj[]
   public class_559[] method_1474(int var1) {
      return new class_559[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1473(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1474(var1);
   }
}
