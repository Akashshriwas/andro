package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.drive.internal.j
public class class_535 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.drive.internal.OnDownloadProgressResponse, android.os.Parcel, int) void
   static void method_1812(OnDownloadProgressResponse var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1268);
      class_333.method_1141(var1, 2, var0.field_1269);
      class_333.method_1141(var1, 3, var0.field_1270);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.drive.internal.OnDownloadProgressResponse
   public OnDownloadProgressResponse method_1813(Parcel var1) {
      long var5 = 0L;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      long var7 = 0L;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var7 = class_327.method_1108(var1, var4);
            break;
         case 3:
            var5 = class_327.method_1108(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new OnDownloadProgressResponse(var2, var7, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.drive.internal.OnDownloadProgressResponse[]
   public OnDownloadProgressResponse[] method_1814(int var1) {
      return new OnDownloadProgressResponse[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1813(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1814(var1);
   }
}
