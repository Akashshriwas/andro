package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.it
public class class_354 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha, android.os.Parcel, int) void
   static void method_1234(class_138 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      Set var4 = var0.method_423();
      if (var4.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_424());
      }

      if (var4.contains(2)) {
         class_333.method_1147(var1, 2, var0.method_425(), true);
      }

      if (var4.contains(3)) {
         class_333.method_1145(var1, 3, var0.method_426(), var2, true);
      }

      if (var4.contains(4)) {
         class_333.method_1147(var1, 4, var0.method_427(), true);
      }

      if (var4.contains(5)) {
         class_333.method_1147(var1, 5, var0.method_428(), true);
      }

      if (var4.contains(6)) {
         class_333.method_1140(var1, 6, var0.method_429());
      }

      if (var4.contains(7)) {
         class_333.method_1145(var1, 7, var0.method_430(), var2, true);
      }

      if (var4.contains(8)) {
         class_333.method_1147(var1, 8, var0.method_431(), true);
      }

      if (var4.contains(9)) {
         class_333.method_1147(var1, 9, var0.method_432(), true);
      }

      if (var4.contains(12)) {
         class_333.method_1140(var1, 12, var0.method_433());
      }

      if (var4.contains(14)) {
         class_333.method_1147(var1, 14, var0.method_434(), true);
      }

      if (var4.contains(15)) {
         class_333.method_1145(var1, 15, var0.method_435(), var2, true);
      }

      if (var4.contains(16)) {
         class_333.method_1150(var1, 16, var0.method_436());
      }

      if (var4.contains(19)) {
         class_333.method_1145(var1, 19, var0.method_438(), var2, true);
      }

      if (var4.contains(18)) {
         class_333.method_1147(var1, 18, var0.method_437(), true);
      }

      if (var4.contains(21)) {
         class_333.method_1140(var1, 21, var0.method_440());
      }

      if (var4.contains(20)) {
         class_333.method_1147(var1, 20, var0.method_439(), true);
      }

      if (var4.contains(23)) {
         class_333.method_1158(var1, 23, var0.method_442(), true);
      }

      if (var4.contains(22)) {
         class_333.method_1158(var1, 22, var0.method_441(), true);
      }

      if (var4.contains(25)) {
         class_333.method_1140(var1, 25, var0.method_444());
      }

      if (var4.contains(24)) {
         class_333.method_1140(var1, 24, var0.method_443());
      }

      if (var4.contains(27)) {
         class_333.method_1147(var1, 27, var0.method_419(), true);
      }

      if (var4.contains(26)) {
         class_333.method_1147(var1, 26, var0.method_418(), true);
      }

      if (var4.contains(29)) {
         class_333.method_1150(var1, 29, var0.method_421());
      }

      if (var4.contains(28)) {
         class_333.method_1158(var1, 28, var0.method_420(), true);
      }

      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha
   public class_138 method_1235(Parcel var1) {
      int var8 = class_327.method_1099(var1);
      HashSet var29 = new HashSet();
      int var7 = 0;
      String var27 = null;
      ha$a var28 = null;
      String var26 = null;
      String var24 = null;
      int var6 = 0;
      ha$b var25 = null;
      String var23 = null;
      String var22 = null;
      int var5 = 0;
      String var20 = null;
      ha$c var21 = null;
      boolean var11 = false;
      String var18 = null;
      ha$d var19 = null;
      String var17 = null;
      int var4 = 0;
      ArrayList var16 = null;
      ArrayList var15 = null;
      int var3 = 0;
      int var2 = 0;
      String var14 = null;
      String var13 = null;
      ArrayList var12 = null;
      boolean var10 = false;

      while(var1.dataPosition() < var8) {
         int var9 = class_327.method_1093(var1);
         switch(class_327.method_1092(var9)) {
         case 1:
            var7 = class_327.method_1107(var1, var9);
            var29.add(1);
            break;
         case 2:
            var27 = class_327.method_1113(var1, var9);
            var29.add(2);
            break;
         case 3:
            var28 = (ha$a)class_327.method_1095(var1, var9, ha$a.field_328);
            var29.add(3);
            break;
         case 4:
            var26 = class_327.method_1113(var1, var9);
            var29.add(4);
            break;
         case 5:
            var24 = class_327.method_1113(var1, var9);
            var29.add(5);
            break;
         case 6:
            var6 = class_327.method_1107(var1, var9);
            var29.add(6);
            break;
         case 7:
            var25 = (ha$b)class_327.method_1095(var1, var9, ha$b.field_334);
            var29.add(7);
            break;
         case 8:
            var23 = class_327.method_1113(var1, var9);
            var29.add(8);
            break;
         case 9:
            var22 = class_327.method_1113(var1, var9);
            var29.add(9);
            break;
         case 10:
         case 11:
         case 13:
         case 17:
         default:
            class_327.method_1100(var1, var9);
            break;
         case 12:
            var5 = class_327.method_1107(var1, var9);
            var29.add(12);
            break;
         case 14:
            var20 = class_327.method_1113(var1, var9);
            var29.add(14);
            break;
         case 15:
            var21 = (ha$c)class_327.method_1095(var1, var9, ha$c.field_286);
            var29.add(15);
            break;
         case 16:
            var11 = class_327.method_1103(var1, var9);
            var29.add(16);
            break;
         case 18:
            var18 = class_327.method_1113(var1, var9);
            var29.add(18);
            break;
         case 19:
            var19 = (ha$d)class_327.method_1095(var1, var9, ha$d.field_291);
            var29.add(19);
            break;
         case 20:
            var17 = class_327.method_1113(var1, var9);
            var29.add(20);
            break;
         case 21:
            var4 = class_327.method_1107(var1, var9);
            var29.add(21);
            break;
         case 22:
            var16 = class_327.method_1102(var1, var9, ha$f.field_301);
            var29.add(22);
            break;
         case 23:
            var15 = class_327.method_1102(var1, var9, ha$g.field_314);
            var29.add(23);
            break;
         case 24:
            var3 = class_327.method_1107(var1, var9);
            var29.add(24);
            break;
         case 25:
            var2 = class_327.method_1107(var1, var9);
            var29.add(25);
            break;
         case 26:
            var14 = class_327.method_1113(var1, var9);
            var29.add(26);
            break;
         case 27:
            var13 = class_327.method_1113(var1, var9);
            var29.add(27);
            break;
         case 28:
            var12 = class_327.method_1102(var1, var9, ha$h.field_320);
            var29.add(28);
            break;
         case 29:
            var10 = class_327.method_1103(var1, var9);
            var29.add(29);
         }
      }

      if (var1.dataPosition() != var8) {
         throw new class_330("Overread allowed size end=" + var8, var1);
      } else {
         return new class_138(var29, var7, var27, var28, var26, var24, var6, var25, var23, var22, var5, var20, var21, var11, var18, var19, var17, var4, var16, var15, var3, var2, var14, var13, var12, var10);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha[]
   public class_138[] method_1236(int var1) {
      return new class_138[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1235(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1236(var1);
   }
}
