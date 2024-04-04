package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.d
public class class_101 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.FullWallet, android.os.Parcel, int) void
   static void method_323(FullWallet var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_824());
      class_333.method_1147(var1, 2, var0.field_678, false);
      class_333.method_1147(var1, 3, var0.field_679, false);
      class_333.method_1145(var1, 4, var0.field_680, var2, false);
      class_333.method_1147(var1, 5, var0.field_681, false);
      class_333.method_1145(var1, 6, var0.field_682, var2, false);
      class_333.method_1145(var1, 7, var0.field_683, var2, false);
      class_333.method_1154(var1, 8, var0.field_684, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.FullWallet
   public FullWallet method_324(Parcel var1) {
      String[] var5 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      Address var6 = null;
      Address var7 = null;
      String var8 = null;
      ProxyCard var9 = null;
      String var10 = null;
      String var11 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var11 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var10 = class_327.method_1113(var1, var4);
            break;
         case 4:
            var9 = (ProxyCard)class_327.method_1095(var1, var4, ProxyCard.CREATOR);
            break;
         case 5:
            var8 = class_327.method_1113(var1, var4);
            break;
         case 6:
            var7 = (Address)class_327.method_1095(var1, var4, Address.CREATOR);
            break;
         case 7:
            var6 = (Address)class_327.method_1095(var1, var4, Address.CREATOR);
            break;
         case 8:
            var5 = class_327.method_1124(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new FullWallet(var2, var11, var10, var9, var8, var7, var6, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.FullWallet[]
   public FullWallet[] method_325(int var1) {
      return new FullWallet[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_324(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_325(var1);
   }
}
