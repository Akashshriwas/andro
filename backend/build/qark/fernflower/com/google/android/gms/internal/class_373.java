package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.il
public class class_373 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.gd, android.os.Parcel, int) void
   static void method_1286(class_319 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.field_902, false);
      class_333.method_1140(var1, 1000, var0.field_901);
      class_333.method_1147(var1, 2, var0.field_903, false);
      class_333.method_1147(var1, 3, var0.field_904, false);
      class_333.method_1147(var1, 4, var0.field_905, false);
      class_333.method_1148(var1, 5, var0.field_906, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.gd
   public class_319 method_1287(Parcel var1) {
      ArrayList var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var9 = class_327.method_1113(var1, var4);
            break;
         case 2:
            var8 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var7 = class_327.method_1113(var1, var4);
            break;
         case 4:
            var6 = class_327.method_1113(var1, var4);
            break;
         case 5:
            var5 = class_327.method_1125(var1, var4);
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
         return new class_319(var2, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.gd[]
   public class_319[] method_1288(int var1) {
      return new class_319[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1287(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1288(var1);
   }
}
