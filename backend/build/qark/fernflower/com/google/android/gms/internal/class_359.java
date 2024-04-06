package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.iw
public class class_359 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha$b$a, android.os.Parcel, int) void
   static void method_1252(ha$b$a var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      Set var3 = var0.method_564();
      if (var3.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_565());
      }

      if (var3.contains(2)) {
         class_333.method_1140(var1, 2, var0.method_566());
      }

      if (var3.contains(3)) {
         class_333.method_1140(var1, 3, var0.method_567());
      }

      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha$b$a
   public ha$b$a method_1253(Parcel var1) {
      int var4 = 0;
      int var5 = class_327.method_1099(var1);
      HashSet var7 = new HashSet();
      int var3 = 0;
      int var2 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var2 = class_327.method_1107(var1, var6);
            var7.add(1);
            break;
         case 2:
            var3 = class_327.method_1107(var1, var6);
            var7.add(2);
            break;
         case 3:
            var4 = class_327.method_1107(var1, var6);
            var7.add(3);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new ha$b$a(var7, var2, var3, var4);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha$b$a[]
   public ha$b$a[] method_1254(int var1) {
      return new ha$b$a[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1253(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1254(var1);
   }
}