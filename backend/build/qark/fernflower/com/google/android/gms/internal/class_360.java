package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.iv
public class class_360 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha$b, android.os.Parcel, int) void
   static void method_1255(ha$b var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      Set var4 = var0.method_552();
      if (var4.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_553());
      }

      if (var4.contains(2)) {
         class_333.method_1145(var1, 2, var0.method_554(), var2, true);
      }

      if (var4.contains(3)) {
         class_333.method_1145(var1, 3, var0.method_555(), var2, true);
      }

      if (var4.contains(4)) {
         class_333.method_1140(var1, 4, var0.method_556());
      }

      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha$b
   public ha$b method_1256(Parcel var1) {
      ha$b$b var6 = null;
      int var2 = 0;
      int var4 = class_327.method_1099(var1);
      HashSet var8 = new HashSet();
      ha$b$a var7 = null;
      int var3 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var3 = class_327.method_1107(var1, var5);
            var8.add(1);
            break;
         case 2:
            var7 = (ha$b$a)class_327.method_1095(var1, var5, ha$b$a.field_348);
            var8.add(2);
            break;
         case 3:
            var6 = (ha$b$b)class_327.method_1095(var1, var5, ha$b$b.field_341);
            var8.add(3);
            break;
         case 4:
            var2 = class_327.method_1107(var1, var5);
            var8.add(4);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new ha$b(var8, var3, var7, var6, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha$b[]
   public ha$b[] method_1257(int var1) {
      return new ha$b[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1256(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1257(var1);
   }
}
