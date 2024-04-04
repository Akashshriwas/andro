package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.l
public class class_169 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.ProxyCard, android.os.Parcel, int) void
   static void method_666(ProxyCard var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1656());
      class_333.method_1147(var1, 2, var0.field_1305, false);
      class_333.method_1147(var1, 3, var0.field_1306, false);
      class_333.method_1140(var1, 4, var0.field_1307);
      class_333.method_1140(var1, 5, var0.field_1308);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.ProxyCard
   public ProxyCard method_667(Parcel var1) {
      String var7 = null;
      int var2 = 0;
      int var5 = class_327.method_1099(var1);
      int var3 = 0;
      String var8 = null;
      int var4 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var4 = class_327.method_1107(var1, var6);
            break;
         case 2:
            var8 = class_327.method_1113(var1, var6);
            break;
         case 3:
            var7 = class_327.method_1113(var1, var6);
            break;
         case 4:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 5:
            var2 = class_327.method_1107(var1, var6);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new ProxyCard(var4, var8, var7, var3, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.ProxyCard[]
   public ProxyCard[] method_668(int var1) {
      return new ProxyCard[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_667(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_668(var1);
   }
}
