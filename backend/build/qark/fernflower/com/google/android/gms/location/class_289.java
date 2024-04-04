package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.location.c
public class class_289 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.location.LocationRequest, android.os.Parcel, int) void
   static void method_990(LocationRequest var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_837);
      class_333.method_1140(var1, 1000, var0.method_1020());
      class_333.method_1141(var1, 2, var0.field_838);
      class_333.method_1141(var1, 3, var0.field_839);
      class_333.method_1150(var1, 4, var0.field_840);
      class_333.method_1141(var1, 5, var0.field_841);
      class_333.method_1140(var1, 6, var0.field_842);
      class_333.method_1139(var1, 7, var0.field_843);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.location.LocationRequest
   public LocationRequest method_991(Parcel var1) {
      boolean var8 = false;
      int var6 = class_327.method_1099(var1);
      int var4 = 102;
      long var13 = 3600000L;
      long var11 = 600000L;
      long var9 = Long.MAX_VALUE;
      int var3 = Integer.MAX_VALUE;
      float var2 = 0.0F;
      int var5 = 0;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var4 = class_327.method_1107(var1, var7);
            break;
         case 2:
            var13 = class_327.method_1108(var1, var7);
            break;
         case 3:
            var11 = class_327.method_1108(var1, var7);
            break;
         case 4:
            var8 = class_327.method_1103(var1, var7);
            break;
         case 5:
            var9 = class_327.method_1108(var1, var7);
            break;
         case 6:
            var3 = class_327.method_1107(var1, var7);
            break;
         case 7:
            var2 = class_327.method_1110(var1, var7);
            break;
         case 1000:
            var5 = class_327.method_1107(var1, var7);
            break;
         default:
            class_327.method_1100(var1, var7);
         }
      }

      if (var1.dataPosition() != var6) {
         throw new class_330("Overread allowed size end=" + var6, var1);
      } else {
         return new LocationRequest(var5, var4, var13, var11, var8, var9, var3, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.location.LocationRequest[]
   public LocationRequest[] method_992(int var1) {
      return new LocationRequest[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_991(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_992(var1);
   }
}
