package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.iz
public class class_362 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha$d, android.os.Parcel, int) void
   static void method_1261(ha$d var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      Set var3 = var0.method_514();
      if (var3.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_515());
      }

      if (var3.contains(2)) {
         class_333.method_1147(var1, 2, var0.method_516(), true);
      }

      if (var3.contains(3)) {
         class_333.method_1147(var1, 3, var0.method_517(), true);
      }

      if (var3.contains(4)) {
         class_333.method_1147(var1, 4, var0.method_518(), true);
      }

      if (var3.contains(5)) {
         class_333.method_1147(var1, 5, var0.method_519(), true);
      }

      if (var3.contains(6)) {
         class_333.method_1147(var1, 6, var0.method_520(), true);
      }

      if (var3.contains(7)) {
         class_333.method_1147(var1, 7, var0.method_521(), true);
      }

      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha$d
   public ha$d method_1262(Parcel var1) {
      String var5 = null;
      int var3 = class_327.method_1099(var1);
      HashSet var11 = new HashSet();
      int var2 = 0;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      String var10 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            var11.add(1);
            break;
         case 2:
            var10 = class_327.method_1113(var1, var4);
            var11.add(2);
            break;
         case 3:
            var9 = class_327.method_1113(var1, var4);
            var11.add(3);
            break;
         case 4:
            var8 = class_327.method_1113(var1, var4);
            var11.add(4);
            break;
         case 5:
            var7 = class_327.method_1113(var1, var4);
            var11.add(5);
            break;
         case 6:
            var6 = class_327.method_1113(var1, var4);
            var11.add(6);
            break;
         case 7:
            var5 = class_327.method_1113(var1, var4);
            var11.add(7);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new ha$d(var11, var2, var10, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha$d[]
   public ha$d[] method_1263(int var1) {
      return new ha$d[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1262(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1263(var1);
   }
}
