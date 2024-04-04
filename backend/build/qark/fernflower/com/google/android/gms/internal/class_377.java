package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.ij
public class class_377 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.fz, android.os.Parcel, int) void
   static void method_1295(class_366 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1153(var1, 1, var0.method_1270(), var2, false);
      class_333.method_1140(var1, 1000, var0.field_985);
      class_333.method_1152(var1, 2, var0.method_1271(), false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.fz
   public class_366 method_1296(Parcel var1) {
      float[] var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      class_314[] var6 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var6 = (class_314[])class_327.method_1101(var1, var4, class_314.field_873);
            break;
         case 2:
            var5 = class_327.method_1121(var1, var4);
            break;
         case 1000:
            var2 = class_327.method_1107(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new class_366(var2, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.fz[]
   public class_366[] method_1297(int var1) {
      return new class_366[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1296(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1297(var1);
   }
}
