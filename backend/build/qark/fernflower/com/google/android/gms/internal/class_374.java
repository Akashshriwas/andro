package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.ik
public class class_374 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.gb, android.os.Parcel, int) void
   static void method_1289(class_314 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.method_1037(), false);
      class_333.method_1142(var1, 2, var0.method_1047(), false);
      class_333.method_1145(var1, 3, var0.method_1048(), var2, false);
      class_333.method_1145(var1, 4, var0.method_1039(), var2, false);
      class_333.method_1139(var1, 5, var0.method_1040());
      class_333.method_1145(var1, 6, var0.method_1041(), var2, false);
      class_333.method_1147(var1, 7, var0.method_1049(), false);
      class_333.method_1145(var1, 8, var0.method_1042(), var2, false);
      class_333.method_1150(var1, 9, var0.method_1043());
      class_333.method_1139(var1, 10, var0.method_1044());
      class_333.method_1140(var1, 11, var0.method_1045());
      class_333.method_1141(var1, 12, var0.method_1046());
      class_333.method_1158(var1, 13, var0.method_1038(), false);
      class_333.method_1140(var1, 1000, var0.field_874);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.gb
   public class_314 method_1290(Parcel var1) {
      int var6 = class_327.method_1099(var1);
      int var5 = 0;
      String var18 = null;
      ArrayList var17 = null;
      Bundle var16 = null;
      class_319 var15 = null;
      LatLng var14 = null;
      float var3 = 0.0F;
      LatLngBounds var13 = null;
      String var12 = null;
      Uri var11 = null;
      boolean var8 = false;
      float var2 = 0.0F;
      int var4 = 0;
      long var9 = 0L;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var18 = class_327.method_1113(var1, var7);
            break;
         case 2:
            var16 = class_327.method_1115(var1, var7);
            break;
         case 3:
            var15 = (class_319)class_327.method_1095(var1, var7, class_319.field_900);
            break;
         case 4:
            var14 = (LatLng)class_327.method_1095(var1, var7, LatLng.field_648);
            break;
         case 5:
            var3 = class_327.method_1110(var1, var7);
            break;
         case 6:
            var13 = (LatLngBounds)class_327.method_1095(var1, var7, LatLngBounds.field_1406);
            break;
         case 7:
            var12 = class_327.method_1113(var1, var7);
            break;
         case 8:
            var11 = (Uri)class_327.method_1095(var1, var7, Uri.CREATOR);
            break;
         case 9:
            var8 = class_327.method_1103(var1, var7);
            break;
         case 10:
            var2 = class_327.method_1110(var1, var7);
            break;
         case 11:
            var4 = class_327.method_1107(var1, var7);
            break;
         case 12:
            var9 = class_327.method_1108(var1, var7);
            break;
         case 13:
            var17 = class_327.method_1102(var1, var7, class_494.field_1511);
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
         return new class_314(var5, var18, var17, var16, var15, var14, var3, var13, var12, var11, var8, var2, var4, var9);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.gb[]
   public class_314[] method_1291(int var1) {
      return new class_314[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1290(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1291(var1);
   }
}
