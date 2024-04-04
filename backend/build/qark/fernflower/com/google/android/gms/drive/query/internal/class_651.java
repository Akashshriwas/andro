package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.drive.query.internal.c
public class class_651 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.query.internal.FilterHolder, android.os.Parcel, int) void
   static void method_2122(FilterHolder var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1145(var1, 1, var0.field_367, var2, false);
      class_333.method_1140(var1, 1000, var0.field_366);
      class_333.method_1145(var1, 2, var0.field_368, var2, false);
      class_333.method_1145(var1, 3, var0.field_369, var2, false);
      class_333.method_1145(var1, 4, var0.field_370, var2, false);
      class_333.method_1145(var1, 5, var0.field_371, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.query.internal.FilterHolder
   public FilterHolder method_2123(Parcel var1) {
      InFilter var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      NotFilter var6 = null;
      LogicalFilter var7 = null;
      FieldOnlyFilter var8 = null;
      ComparisonFilter var9 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var9 = (ComparisonFilter)class_327.method_1095(var1, var4, ComparisonFilter.field_770);
            break;
         case 2:
            var8 = (FieldOnlyFilter)class_327.method_1095(var1, var4, FieldOnlyFilter.CREATOR);
            break;
         case 3:
            var7 = (LogicalFilter)class_327.method_1095(var1, var4, LogicalFilter.CREATOR);
            break;
         case 4:
            var6 = (NotFilter)class_327.method_1095(var1, var4, NotFilter.CREATOR);
            break;
         case 5:
            var5 = (InFilter)class_327.method_1095(var1, var4, InFilter.field_728);
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
         return new FilterHolder(var2, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.query.internal.FilterHolder[]
   public FilterHolder[] method_2124(int var1) {
      return new FilterHolder[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2123(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2124(var1);
   }
}
