package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// $FF: renamed from: com.google.android.gms.drive.query.internal.b
public class class_653 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.query.internal.FieldOnlyFilter, android.os.Parcel, int) void
   static void method_2151(FieldOnlyFilter var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1000, var0.field_173);
      class_333.method_1145(var1, 1, var0.field_172, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.query.internal.FieldOnlyFilter
   public FieldOnlyFilter method_2152(Parcel var1) {
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      MetadataBundle var5 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var5 = (MetadataBundle)class_327.method_1095(var1, var4, MetadataBundle.CREATOR);
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
         return new FieldOnlyFilter(var2, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.query.internal.FieldOnlyFilter[]
   public FieldOnlyFilter[] method_2153(int var1) {
      return new FieldOnlyFilter[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2152(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2153(var1);
   }
}
