package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.hg
public class class_345 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.eb, android.os.Parcel, int) void
   static void method_1202(class_478 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1664());
      class_333.method_1158(var1, 2, var0.method_1667(), false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.eb
   public class_478 method_1203(Parcel var1) {
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      ArrayList var5 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var5 = class_327.method_1102(var1, var4, eb$a.field_1602);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new class_478(var2, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.eb[]
   public class_478[] method_1204(int var1) {
      return new class_478[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1203(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1204(var1);
   }
}
