package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.ie
public class class_371 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.fs, android.os.Parcel, int) void
   static void method_1283(class_491 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1699());
      class_333.method_1140(var1, 1000, var0.field_1396);
      class_333.method_1158(var1, 2, var0.field_1397, false);
      class_333.method_1147(var1, 3, var0.method_1700(), false);
      class_333.method_1147(var1, 4, var0.method_1701(), false);
      class_333.method_1150(var1, 5, var0.method_1702());
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.fs
   public class_491 method_1284(Parcel var1) {
      String var7 = null;
      boolean var6 = false;
      int var4 = class_327.method_1099(var1);
      String var8 = null;
      ArrayList var9 = null;
      int var2 = 0;
      int var3 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var2 = class_327.method_1107(var1, var5);
            break;
         case 2:
            var9 = class_327.method_1102(var1, var5, class_494.field_1511);
            break;
         case 3:
            var8 = class_327.method_1113(var1, var5);
            break;
         case 4:
            var7 = class_327.method_1113(var1, var5);
            break;
         case 5:
            var6 = class_327.method_1103(var1, var5);
            break;
         case 1000:
            var3 = class_327.method_1107(var1, var5);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new class_491(var3, var2, var9, var8, var7, var6);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.fs[]
   public class_491[] method_1285(int var1) {
      return new class_491[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1284(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1285(var1);
   }
}
