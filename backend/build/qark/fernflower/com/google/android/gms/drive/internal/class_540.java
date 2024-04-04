package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.drive.DriveId;

// $FF: renamed from: com.google.android.gms.drive.internal.k
public class class_540 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.internal.OnDriveIdResponse, android.os.Parcel, int) void
   static void method_1823(OnDriveIdResponse var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1609);
      class_333.method_1145(var1, 2, var0.field_1610, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.internal.OnDriveIdResponse
   public OnDriveIdResponse method_1824(Parcel var1) {
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      DriveId var5 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var5 = (DriveId)class_327.method_1095(var1, var4, DriveId.CREATOR);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new OnDriveIdResponse(var2, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.internal.OnDriveIdResponse[]
   public OnDriveIdResponse[] method_1825(int var1) {
      return new OnDriveIdResponse[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1824(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1825(var1);
   }
}
