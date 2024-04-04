package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.drive.Contents;

// $FF: renamed from: com.google.android.gms.drive.internal.b
public class class_579 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.internal.CloseContentsRequest, android.os.Parcel, int) void
   static void method_1886(CloseContentsRequest var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_137);
      class_333.method_1145(var1, 2, var0.field_138, var2, false);
      class_333.method_1146(var1, 3, var0.field_139, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.internal.CloseContentsRequest
   public CloseContentsRequest method_1887(Parcel var1) {
      Boolean var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      Contents var6 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var6 = (Contents)class_327.method_1095(var1, var4, Contents.CREATOR);
            break;
         case 3:
            var5 = class_327.method_1104(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new CloseContentsRequest(var2, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.internal.CloseContentsRequest[]
   public CloseContentsRequest[] method_1888(int var1) {
      return new CloseContentsRequest[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1887(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1888(var1);
   }
}
