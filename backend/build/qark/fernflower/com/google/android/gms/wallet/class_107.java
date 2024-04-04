package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.a
public class class_107 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.Address, android.os.Parcel, int) void
   static void method_337(Address var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1188());
      class_333.method_1147(var1, 2, var0.field_963, false);
      class_333.method_1147(var1, 3, var0.field_964, false);
      class_333.method_1147(var1, 4, var0.field_965, false);
      class_333.method_1147(var1, 5, var0.field_966, false);
      class_333.method_1147(var1, 6, var0.field_967, false);
      class_333.method_1147(var1, 7, var0.field_968, false);
      class_333.method_1147(var1, 8, var0.field_969, false);
      class_333.method_1147(var1, 9, var0.field_970, false);
      class_333.method_1147(var1, 10, var0.field_971, false);
      class_333.method_1150(var1, 11, var0.field_972);
      class_333.method_1147(var1, 12, var0.field_973, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.Address
   public Address method_338(Parcel var1) {
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      String var15 = null;
      String var14 = null;
      String var13 = null;
      String var12 = null;
      String var11 = null;
      String var10 = null;
      String var9 = null;
      String var8 = null;
      String var7 = null;
      boolean var5 = false;
      String var6 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var2 = class_327.method_1107(var1, var4);
            break;
         case 2:
            var15 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var14 = class_327.method_1113(var1, var4);
            break;
         case 4:
            var13 = class_327.method_1113(var1, var4);
            break;
         case 5:
            var12 = class_327.method_1113(var1, var4);
            break;
         case 6:
            var11 = class_327.method_1113(var1, var4);
            break;
         case 7:
            var10 = class_327.method_1113(var1, var4);
            break;
         case 8:
            var9 = class_327.method_1113(var1, var4);
            break;
         case 9:
            var8 = class_327.method_1113(var1, var4);
            break;
         case 10:
            var7 = class_327.method_1113(var1, var4);
            break;
         case 11:
            var5 = class_327.method_1103(var1, var4);
            break;
         case 12:
            var6 = class_327.method_1113(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new Address(var2, var15, var14, var13, var12, var11, var10, var9, var8, var7, var5, var6);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.Address[]
   public Address[] method_339(int var1) {
      return new Address[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_338(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_339(var1);
   }
}
