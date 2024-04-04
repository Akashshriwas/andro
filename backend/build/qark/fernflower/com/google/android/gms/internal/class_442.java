package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.do
public class class_442 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.cb, android.os.Parcel, int) void
   static void method_1494(class_434 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1169);
      class_333.method_1147(var1, 2, var0.field_1170, false);
      class_333.method_1147(var1, 3, var0.field_1171, false);
      class_333.method_1148(var1, 4, var0.field_1172, false);
      class_333.method_1140(var1, 5, var0.field_1173);
      class_333.method_1148(var1, 6, var0.field_1174, false);
      class_333.method_1141(var1, 7, var0.field_1175);
      class_333.method_1150(var1, 8, var0.field_1176);
      class_333.method_1141(var1, 9, var0.field_1177);
      class_333.method_1148(var1, 10, var0.field_1178, false);
      class_333.method_1141(var1, 11, var0.field_1179);
      class_333.method_1140(var1, 12, var0.field_1180);
      class_333.method_1147(var1, 13, var0.field_1181, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.cb
   public class_434 method_1495(Parcel var1) {
      int var5 = class_327.method_1099(var1);
      int var4 = 0;
      String var19 = null;
      String var18 = null;
      ArrayList var17 = null;
      int var3 = 0;
      ArrayList var16 = null;
      long var11 = 0L;
      boolean var13 = false;
      long var9 = 0L;
      ArrayList var15 = null;
      long var7 = 0L;
      int var2 = 0;
      String var14 = null;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var4 = class_327.method_1107(var1, var6);
            break;
         case 2:
            var19 = class_327.method_1113(var1, var6);
            break;
         case 3:
            var18 = class_327.method_1113(var1, var6);
            break;
         case 4:
            var17 = class_327.method_1125(var1, var6);
            break;
         case 5:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 6:
            var16 = class_327.method_1125(var1, var6);
            break;
         case 7:
            var11 = class_327.method_1108(var1, var6);
            break;
         case 8:
            var13 = class_327.method_1103(var1, var6);
            break;
         case 9:
            var9 = class_327.method_1108(var1, var6);
            break;
         case 10:
            var15 = class_327.method_1125(var1, var6);
            break;
         case 11:
            var7 = class_327.method_1108(var1, var6);
            break;
         case 12:
            var2 = class_327.method_1107(var1, var6);
            break;
         case 13:
            var14 = class_327.method_1113(var1, var6);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new class_434(var4, var19, var18, var17, var3, var16, var11, var13, var9, var15, var7, var2, var14);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.cb[]
   public class_434[] method_1496(int var1) {
      return new class_434[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1495(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1496(var1);
   }
}
