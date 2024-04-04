package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.location.b
public class class_287 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.location.DetectedActivity, android.os.Parcel, int) void
   static void method_986(DetectedActivity var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1624);
      class_333.method_1140(var1, 1000, var0.method_1782());
      class_333.method_1140(var1, 2, var0.field_1625);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.location.DetectedActivity
   public DetectedActivity method_987(Parcel var1) {
      int var4 = 0;
      int var5 = class_327.method_1099(var1);
      int var3 = 0;
      int var2 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 2:
            var4 = class_327.method_1107(var1, var6);
            break;
         case 1000:
            var2 = class_327.method_1107(var1, var6);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new DetectedActivity(var2, var3, var4);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.location.DetectedActivity[]
   public DetectedActivity[] method_988(int var1) {
      return new DetectedActivity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_987(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_988(var1);
   }
}
