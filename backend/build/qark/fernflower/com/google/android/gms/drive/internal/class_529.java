package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// $FF: renamed from: com.google.android.gms.drive.internal.e
public class class_529 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.internal.CreateFileRequest, android.os.Parcel, int) void
   static void method_1791(CreateFileRequest var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1598);
      class_333.method_1145(var1, 2, var0.field_1599, var2, false);
      class_333.method_1145(var1, 3, var0.field_1600, var2, false);
      class_333.method_1145(var1, 4, var0.field_1601, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.internal.CreateFileRequest
   public CreateFileRequest method_1792(Parcel var1) {
      Contents var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      MetadataBundle var7 = null;

      DriveId var6;
      DriveId var8;
      for(var6 = null; var1.dataPosition() < var3; var6 = var8) {
         int var4 = class_327.method_1093(var1);
         MetadataBundle var9;
         DriveId var10;
         MetadataBundle var11;
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            var8 = var6;
            var9 = var7;
            var10 = var8;
            break;
         case 2:
            var8 = (DriveId)class_327.method_1095(var1, var4, DriveId.CREATOR);
            var9 = var7;
            var10 = var8;
            break;
         case 3:
            var11 = (MetadataBundle)class_327.method_1095(var1, var4, MetadataBundle.CREATOR);
            var10 = var6;
            var9 = var11;
            break;
         case 4:
            var5 = (Contents)class_327.method_1095(var1, var4, Contents.CREATOR);
            var8 = var6;
            var9 = var7;
            var10 = var8;
            break;
         default:
            class_327.method_1100(var1, var4);
            var11 = var7;
            var10 = var6;
            var9 = var11;
         }

         var8 = var10;
         var7 = var9;
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new CreateFileRequest(var2, var6, var7, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.internal.CreateFileRequest[]
   public CreateFileRequest[] method_1793(int var1) {
      return new CreateFileRequest[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1792(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1793(var1);
   }
}
