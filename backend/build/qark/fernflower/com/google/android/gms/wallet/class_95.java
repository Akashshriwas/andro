package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.i
public class class_95 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.MaskedWalletRequest, android.os.Parcel, int) void
   static void method_295(MaskedWalletRequest var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1276());
      class_333.method_1147(var1, 2, var0.field_988, false);
      class_333.method_1150(var1, 3, var0.field_989);
      class_333.method_1150(var1, 4, var0.field_990);
      class_333.method_1150(var1, 5, var0.field_991);
      class_333.method_1147(var1, 6, var0.field_992, false);
      class_333.method_1147(var1, 7, var0.field_993, false);
      class_333.method_1147(var1, 8, var0.field_994, false);
      class_333.method_1145(var1, 9, var0.field_995, var2, false);
      class_333.method_1150(var1, 10, var0.field_996);
      class_333.method_1150(var1, 11, var0.field_997);
      class_333.method_1153(var1, 12, var0.field_998, var2, false);
      class_333.method_1150(var1, 13, var0.field_999);
      class_333.method_1150(var1, 14, var0.field_1000);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.MaskedWalletRequest
   public MaskedWalletRequest method_296(Parcel var1) {
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var17 = null;
      boolean var11 = false;
      boolean var10 = false;
      boolean var9 = false;
      String var16 = null;
      String var15 = null;
      String var14 = null;
      Cart var13 = null;
      boolean var8 = false;
      boolean var7 = false;
      CountrySpecification[] var12 = null;
      boolean var6 = true;
      boolean var5 = true;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var17 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var11 = class_327.method_1103(var1, var4);
            break;
         case 4:
            var10 = class_327.method_1103(var1, var4);
            break;
         case 5:
            var9 = class_327.method_1103(var1, var4);
            break;
         case 6:
            var16 = class_327.method_1113(var1, var4);
            break;
         case 7:
            var15 = class_327.method_1113(var1, var4);
            break;
         case 8:
            var14 = class_327.method_1113(var1, var4);
            break;
         case 9:
            var13 = (Cart)class_327.method_1095(var1, var4, Cart.CREATOR);
            break;
         case 10:
            var8 = class_327.method_1103(var1, var4);
            break;
         case 11:
            var7 = class_327.method_1103(var1, var4);
            break;
         case 12:
            var12 = (CountrySpecification[])class_327.method_1101(var1, var4, CountrySpecification.CREATOR);
            break;
         case 13:
            var6 = class_327.method_1103(var1, var4);
            break;
         case 14:
            var5 = class_327.method_1103(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new MaskedWalletRequest(var2, var17, var11, var10, var9, var16, var15, var14, var13, var8, var7, var12, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.MaskedWalletRequest[]
   public MaskedWalletRequest[] method_297(int var1) {
      return new MaskedWalletRequest[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_296(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_297(var1);
   }
}
