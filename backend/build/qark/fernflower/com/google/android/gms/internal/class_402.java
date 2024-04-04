package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.jc
public class class_402 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha$h, android.os.Parcel, int) void
   static void method_1391(ha$h var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      Set var3 = var0.method_540();
      if (var3.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_541());
      }

      if (var3.contains(3)) {
         class_333.method_1140(var1, 3, var0.method_543());
      }

      if (var3.contains(4)) {
         class_333.method_1147(var1, 4, var0.method_545(), true);
      }

      if (var3.contains(5)) {
         class_333.method_1147(var1, 5, var0.method_542(), true);
      }

      if (var3.contains(6)) {
         class_333.method_1140(var1, 6, var0.method_544());
      }

      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha$h
   public ha$h method_1392(Parcel var1) {
      String var7 = null;
      int var2 = 0;
      int var5 = class_327.method_1099(var1);
      HashSet var9 = new HashSet();
      int var3 = 0;
      String var8 = null;
      int var4 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var4 = class_327.method_1107(var1, var6);
            var9.add(1);
            break;
         case 2:
         default:
            class_327.method_1100(var1, var6);
            break;
         case 3:
            var2 = class_327.method_1107(var1, var6);
            var9.add(3);
            break;
         case 4:
            var7 = class_327.method_1113(var1, var6);
            var9.add(4);
            break;
         case 5:
            var8 = class_327.method_1113(var1, var6);
            var9.add(5);
            break;
         case 6:
            var3 = class_327.method_1107(var1, var6);
            var9.add(6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new ha$h(var9, var4, var8, var3, var7, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha$h[]
   public ha$h[] method_1393(int var1) {
      return new ha$h[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1392(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1393(var1);
   }
}
