package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.common.api.a
public class class_518 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.common.api.Status, android.os.Parcel, int) void
   static void method_1767(Status var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1661());
      class_333.method_1140(var1, 1000, var0.method_1660());
      class_333.method_1147(var1, 2, var0.method_1659(), false);
      class_333.method_1145(var1, 3, var0.method_1658(), var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.common.api.Status
   public Status method_1768(Parcel var1) {
      PendingIntent var7 = null;
      int var3 = 0;
      int var4 = class_327.method_1099(var1);
      String var6 = null;
      int var2 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var3 = class_327.method_1107(var1, var5);
            break;
         case 2:
            var6 = class_327.method_1113(var1, var5);
            break;
         case 3:
            var7 = (PendingIntent)class_327.method_1095(var1, var5, PendingIntent.CREATOR);
            break;
         case 1000:
            var2 = class_327.method_1107(var1, var5);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new Status(var2, var3, var6, var7);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.common.api.Status[]
   public Status[] method_1769(int var1) {
      return new Status[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1768(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1769(var1);
   }
}
