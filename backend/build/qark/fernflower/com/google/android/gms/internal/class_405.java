package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.jb
public class class_405 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.ha$g, android.os.Parcel, int) void
   static void method_1396(ha$g var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      Set var3 = var0.method_535();
      if (var3.contains(1)) {
         class_333.method_1140(var1, 1, var0.method_536());
      }

      if (var3.contains(2)) {
         class_333.method_1150(var1, 2, var0.method_537());
      }

      if (var3.contains(3)) {
         class_333.method_1147(var1, 3, var0.method_538(), true);
      }

      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.ha$g
   public ha$g method_1397(Parcel var1) {
      boolean var5 = false;
      int var3 = class_327.method_1099(var1);
      HashSet var7 = new HashSet();
      String var6 = null;
      int var2 = 0;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            var7.add(1);
            break;
         case 2:
            var5 = class_327.method_1103(var1, var4);
            var7.add(2);
            break;
         case 3:
            var6 = class_327.method_1113(var1, var4);
            var7.add(3);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new ha$g(var7, var2, var5, var6);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.ha$g[]
   public ha$g[] method_1398(int var1) {
      return new ha$g[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1397(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1398(var1);
   }
}
