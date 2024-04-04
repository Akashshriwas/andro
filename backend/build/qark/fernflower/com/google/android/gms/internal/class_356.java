package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.ir
public class class_356 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.gx, android.os.Parcel, int) void
   static void method_1243(class_139 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      Set var4 = var0.method_445();
      if (var4.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_446());
      }

      if (var4.contains(2)) {
         class_333.method_1147(var1, 2, var0.method_447(), true);
      }

      if (var4.contains(4)) {
         class_333.method_1145(var1, 4, var0.method_448(), var2, true);
      }

      if (var4.contains(5)) {
         class_333.method_1147(var1, 5, var0.method_449(), true);
      }

      if (var4.contains(6)) {
         class_333.method_1145(var1, 6, var0.method_450(), var2, true);
      }

      if (var4.contains(7)) {
         class_333.method_1147(var1, 7, var0.method_451(), true);
      }

      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.gx
   public class_139 method_1244(Parcel var1) {
      String var5 = null;
      int var3 = class_327.method_1099(var1);
      HashSet var10 = new HashSet();
      int var2 = 0;
      class_140 var7 = null;
      String var6 = null;
      class_140 var9 = null;
      String var8 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            var10.add(1);
            break;
         case 2:
            var8 = class_327.method_1113(var1, var4);
            var10.add(2);
            break;
         case 3:
         default:
            class_327.method_1100(var1, var4);
            break;
         case 4:
            var9 = (class_140)class_327.method_1095(var1, var4, class_140.field_228);
            var10.add(4);
            break;
         case 5:
            var6 = class_327.method_1113(var1, var4);
            var10.add(5);
            break;
         case 6:
            var7 = (class_140)class_327.method_1095(var1, var4, class_140.field_228);
            var10.add(6);
            break;
         case 7:
            var5 = class_327.method_1113(var1, var4);
            var10.add(7);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new class_139(var10, var2, var8, var9, var6, var7, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.gx[]
   public class_139[] method_1245(int var1) {
      return new class_139[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1244(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1245(var1);
   }
}
