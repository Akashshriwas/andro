package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.g
public class class_104 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.LoyaltyWalletObject, android.os.Parcel, int) void
   static void method_332(LoyaltyWalletObject var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_669());
      class_333.method_1147(var1, 2, var0.field_494, false);
      class_333.method_1147(var1, 3, var0.field_495, false);
      class_333.method_1147(var1, 4, var0.field_496, false);
      class_333.method_1147(var1, 5, var0.field_497, false);
      class_333.method_1147(var1, 6, var0.field_498, false);
      class_333.method_1147(var1, 7, var0.field_499, false);
      class_333.method_1147(var1, 8, var0.field_500, false);
      class_333.method_1147(var1, 9, var0.field_501, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.LoyaltyWalletObject
   public LoyaltyWalletObject method_333(Parcel var1) {
      String var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      String var10 = null;
      String var11 = null;
      String var12 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var12 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var11 = class_327.method_1113(var1, var4);
            break;
         case 4:
            var10 = class_327.method_1113(var1, var4);
            break;
         case 5:
            var9 = class_327.method_1113(var1, var4);
            break;
         case 6:
            var8 = class_327.method_1113(var1, var4);
            break;
         case 7:
            var7 = class_327.method_1113(var1, var4);
            break;
         case 8:
            var6 = class_327.method_1113(var1, var4);
            break;
         case 9:
            var5 = class_327.method_1113(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new LoyaltyWalletObject(var2, var12, var11, var10, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.LoyaltyWalletObject[]
   public LoyaltyWalletObject[] method_334(int var1) {
      return new LoyaltyWalletObject[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_333(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_334(var1);
   }
}
