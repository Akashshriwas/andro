package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.location.a
public class class_285 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.location.ActivityRecognitionResult, android.os.Parcel, int) void
   static void method_982(ActivityRecognitionResult var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1158(var1, 1, var0.field_2136, false);
      class_333.method_1140(var1, 1000, var0.method_2055());
      class_333.method_1141(var1, 2, var0.field_2137);
      class_333.method_1141(var1, 3, var0.field_2138);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.location.ActivityRecognitionResult
   public ActivityRecognitionResult method_983(Parcel var1) {
      long var5 = 0L;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      ArrayList var9 = null;
      long var7 = 0L;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var9 = class_327.method_1102(var1, var4, DetectedActivity.field_1623);
            break;
         case 2:
            var7 = class_327.method_1108(var1, var4);
            break;
         case 3:
            var5 = class_327.method_1108(var1, var4);
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
         return new ActivityRecognitionResult(var2, var9, var7, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.location.ActivityRecognitionResult[]
   public ActivityRecognitionResult[] method_984(int var1) {
      return new ActivityRecognitionResult[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_983(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_984(var1);
   }
}
