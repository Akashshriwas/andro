package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.hk
public class class_347 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.eh$b, android.os.Parcel, int) void
   static void method_1208(eh$b var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_180);
      class_333.method_1147(var1, 2, var0.field_181, false);
      class_333.method_1145(var1, 3, var0.field_182, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.eh$b
   public eh$b method_1209(Parcel var1) {
      ee$a var6 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var5 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var5 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var6 = (ee$a)class_327.method_1095(var1, var4, ee$a.field_2158);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new eh$b(var2, var5, var6);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.eh$b[]
   public eh$b[] method_1210(int var1) {
      return new eh$b[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1209(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1210(var1);
   }
}