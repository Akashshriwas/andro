package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.j
public class class_97 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.NotifyTransactionStatusRequest, android.os.Parcel, int) void
   static void method_298(NotifyTransactionStatusRequest var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1991);
      class_333.method_1147(var1, 2, var0.field_1992, false);
      class_333.method_1140(var1, 3, var0.field_1993);
      class_333.method_1147(var1, 4, var0.field_1994, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.NotifyTransactionStatusRequest
   public NotifyTransactionStatusRequest method_299(Parcel var1) {
      String var7 = null;
      int var3 = 0;
      int var4 = class_327.method_1099(var1);
      String var6 = null;
      int var2 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var2 = class_327.method_1107(var1, var5);
            break;
         case 2:
            var6 = class_327.method_1113(var1, var5);
            break;
         case 3:
            var3 = class_327.method_1107(var1, var5);
            break;
         case 4:
            var7 = class_327.method_1113(var1, var5);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new NotifyTransactionStatusRequest(var2, var6, var3, var7);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.NotifyTransactionStatusRequest[]
   public NotifyTransactionStatusRequest[] method_300(int var1) {
      return new NotifyTransactionStatusRequest[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_299(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_300(var1);
   }
}
