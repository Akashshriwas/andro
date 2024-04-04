package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.h
public class class_93 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.MaskedWallet, android.os.Parcel, int) void
   static void method_292(MaskedWallet var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_993());
      class_333.method_1147(var1, 2, var0.field_787, false);
      class_333.method_1147(var1, 3, var0.field_788, false);
      class_333.method_1154(var1, 4, var0.field_789, false);
      class_333.method_1147(var1, 5, var0.field_790, false);
      class_333.method_1145(var1, 6, var0.field_791, var2, false);
      class_333.method_1145(var1, 7, var0.field_792, var2, false);
      class_333.method_1153(var1, 8, var0.field_793, var2, false);
      class_333.method_1153(var1, 9, var0.field_794, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.MaskedWallet
   public MaskedWallet method_293(Parcel var1) {
      OfferWalletObject[] var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      LoyaltyWalletObject[] var6 = null;
      Address var7 = null;
      Address var8 = null;
      String var9 = null;
      String[] var10 = null;
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
            var10 = class_327.method_1124(var1, var4);
            break;
         case 5:
            var9 = class_327.method_1113(var1, var4);
            break;
         case 6:
            var8 = (Address)class_327.method_1095(var1, var4, Address.CREATOR);
            break;
         case 7:
            var7 = (Address)class_327.method_1095(var1, var4, Address.CREATOR);
            break;
         case 8:
            var6 = (LoyaltyWalletObject[])class_327.method_1101(var1, var4, LoyaltyWalletObject.CREATOR);
            break;
         case 9:
            var5 = (OfferWalletObject[])class_327.method_1101(var1, var4, OfferWalletObject.CREATOR);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new MaskedWallet(var2, var12, var11, var10, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.MaskedWallet[]
   public MaskedWallet[] method_294(int var1) {
      return new MaskedWallet[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_293(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_294(var1);
   }
}
