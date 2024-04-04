package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.drive.a
public class class_331 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.Contents, android.os.Parcel, int) void
   static void method_1131(Contents var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1577);
      class_333.method_1145(var1, 2, var0.field_1578, var2, false);
      class_333.method_1140(var1, 3, var0.field_1579);
      class_333.method_1140(var1, 4, var0.field_1580);
      class_333.method_1145(var1, 5, var0.field_1581, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.Contents
   public Contents method_1132(Parcel var1) {
      DriveId var7 = null;
      int var2 = 0;
      int var5 = class_327.method_1099(var1);
      int var3 = 0;
      ParcelFileDescriptor var8 = null;
      int var4 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var4 = class_327.method_1107(var1, var6);
            break;
         case 2:
            var8 = (ParcelFileDescriptor)class_327.method_1095(var1, var6, ParcelFileDescriptor.CREATOR);
            break;
         case 3:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 4:
            var2 = class_327.method_1107(var1, var6);
            break;
         case 5:
            var7 = (DriveId)class_327.method_1095(var1, var6, DriveId.CREATOR);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new Contents(var4, var8, var3, var2, var7);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.Contents[]
   public Contents[] method_1133(int var1) {
      return new Contents[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1132(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1133(var1);
   }
}
