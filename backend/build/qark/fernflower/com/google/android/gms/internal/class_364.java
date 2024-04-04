package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.ja
public class class_364 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha$f, android.os.Parcel, int) void
   static void method_1267(ha$f var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      Set var3 = var0.method_523();
      if (var3.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_524());
      }

      if (var3.contains(2)) {
         class_333.method_1147(var1, 2, var0.method_525(), true);
      }

      if (var3.contains(3)) {
         class_333.method_1147(var1, 3, var0.method_526(), true);
      }

      if (var3.contains(4)) {
         class_333.method_1147(var1, 4, var0.method_527(), true);
      }

      if (var3.contains(5)) {
         class_333.method_1147(var1, 5, var0.method_528(), true);
      }

      if (var3.contains(6)) {
         class_333.method_1147(var1, 6, var0.method_529(), true);
      }

      if (var3.contains(7)) {
         class_333.method_1150(var1, 7, var0.method_530());
      }

      if (var3.contains(8)) {
         class_333.method_1147(var1, 8, var0.method_531(), true);
      }

      if (var3.contains(9)) {
         class_333.method_1147(var1, 9, var0.method_532(), true);
      }

      if (var3.contains(10)) {
         class_333.method_1140(var1, 10, var0.method_533());
      }

      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha$f
   public ha$f method_1268(Parcel var1) {
      int var2 = 0;
      String var7 = null;
      int var4 = class_327.method_1099(var1);
      HashSet var14 = new HashSet();
      String var8 = null;
      boolean var6 = false;
      String var9 = null;
      String var10 = null;
      String var11 = null;
      String var12 = null;
      String var13 = null;
      int var3 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var3 = class_327.method_1107(var1, var5);
            var14.add(1);
            break;
         case 2:
            var13 = class_327.method_1113(var1, var5);
            var14.add(2);
            break;
         case 3:
            var12 = class_327.method_1113(var1, var5);
            var14.add(3);
            break;
         case 4:
            var11 = class_327.method_1113(var1, var5);
            var14.add(4);
            break;
         case 5:
            var10 = class_327.method_1113(var1, var5);
            var14.add(5);
            break;
         case 6:
            var9 = class_327.method_1113(var1, var5);
            var14.add(6);
            break;
         case 7:
            var6 = class_327.method_1103(var1, var5);
            var14.add(7);
            break;
         case 8:
            var8 = class_327.method_1113(var1, var5);
            var14.add(8);
            break;
         case 9:
            var7 = class_327.method_1113(var1, var5);
            var14.add(9);
            break;
         case 10:
            var2 = class_327.method_1107(var1, var5);
            var14.add(10);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new ha$f(var14, var3, var13, var12, var11, var10, var9, var6, var8, var7, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha$f[]
   public ha$f[] method_1269(int var1) {
      return new ha$f[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1268(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1269(var1);
   }
}
