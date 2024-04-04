package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.q
public class class_605 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ai, android.os.Parcel, int) void
   static void method_1937(class_530 var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1637);
      class_333.method_1140(var1, 2, var0.field_1638);
      class_333.method_1140(var1, 3, var0.field_1639);
      class_333.method_1140(var1, 4, var0.field_1640);
      class_333.method_1140(var1, 5, var0.field_1641);
      class_333.method_1140(var1, 6, var0.field_1642);
      class_333.method_1140(var1, 7, var0.field_1643);
      class_333.method_1140(var1, 8, var0.field_1644);
      class_333.method_1140(var1, 9, var0.field_1645);
      class_333.method_1147(var1, 10, var0.field_1646, false);
      class_333.method_1140(var1, 11, var0.field_1647);
      class_333.method_1147(var1, 12, var0.field_1648, false);
      class_333.method_1140(var1, 13, var0.field_1649);
      class_333.method_1140(var1, 14, var0.field_1650);
      class_333.method_1147(var1, 15, var0.field_1651, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ai
   public class_530 method_1938(Parcel var1) {
      int var14 = class_327.method_1099(var1);
      int var13 = 0;
      int var12 = 0;
      int var11 = 0;
      int var10 = 0;
      int var9 = 0;
      int var8 = 0;
      int var7 = 0;
      int var6 = 0;
      int var5 = 0;
      String var18 = null;
      int var4 = 0;
      String var17 = null;
      int var3 = 0;
      int var2 = 0;
      String var16 = null;

      while(var1.dataPosition() < var14) {
         int var15 = class_327.method_1093(var1);
         switch(class_327.method_1092(var15)) {
         case 1:
            var13 = class_327.method_1107(var1, var15);
            break;
         case 2:
            var12 = class_327.method_1107(var1, var15);
            break;
         case 3:
            var11 = class_327.method_1107(var1, var15);
            break;
         case 4:
            var10 = class_327.method_1107(var1, var15);
            break;
         case 5:
            var9 = class_327.method_1107(var1, var15);
            break;
         case 6:
            var8 = class_327.method_1107(var1, var15);
            break;
         case 7:
            var7 = class_327.method_1107(var1, var15);
            break;
         case 8:
            var6 = class_327.method_1107(var1, var15);
            break;
         case 9:
            var5 = class_327.method_1107(var1, var15);
            break;
         case 10:
            var18 = class_327.method_1113(var1, var15);
            break;
         case 11:
            var4 = class_327.method_1107(var1, var15);
            break;
         case 12:
            var17 = class_327.method_1113(var1, var15);
            break;
         case 13:
            var3 = class_327.method_1107(var1, var15);
            break;
         case 14:
            var2 = class_327.method_1107(var1, var15);
            break;
         case 15:
            var16 = class_327.method_1113(var1, var15);
            break;
         default:
            class_327.method_1100(var1, var15);
         }
      }

      if (var1.dataPosition() != var14) {
         throw new class_330("Overread allowed size end=" + var14, var1);
      } else {
         return new class_530(var13, var12, var11, var10, var9, var8, var7, var6, var5, var18, var4, var17, var3, var2, var16);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ai[]
   public class_530[] method_1939(int var1) {
      return new class_530[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1938(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1939(var1);
   }
}
