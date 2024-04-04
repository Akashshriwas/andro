package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.wallet.f
public class class_103 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.wallet.LineItem, android.os.Parcel, int) void
   static void method_329(LineItem var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1018());
      class_333.method_1147(var1, 2, var0.field_828, false);
      class_333.method_1147(var1, 3, var0.field_829, false);
      class_333.method_1147(var1, 4, var0.field_830, false);
      class_333.method_1147(var1, 5, var0.field_831, false);
      class_333.method_1140(var1, 6, var0.field_832);
      class_333.method_1147(var1, 7, var0.field_833, false);
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.wallet.LineItem
   public LineItem method_330(Parcel var1) {
      int var2 = 0;
      String var6 = null;
      int var4 = class_327.method_1099(var1);
      String var7 = null;
      String var8 = null;
      String var9 = null;
      String var10 = null;
      int var3 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var3 = class_327.method_1107(var1, var5);
            break;
         case 2:
            var10 = class_327.method_1113(var1, var5);
            break;
         case 3:
            var9 = class_327.method_1113(var1, var5);
            break;
         case 4:
            var8 = class_327.method_1113(var1, var5);
            break;
         case 5:
            var7 = class_327.method_1113(var1, var5);
            break;
         case 6:
            var2 = class_327.method_1107(var1, var5);
            break;
         case 7:
            var6 = class_327.method_1113(var1, var5);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         return new LineItem(var3, var10, var9, var8, var7, var2, var6);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.wallet.LineItem[]
   public LineItem[] method_331(int var1) {
      return new LineItem[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_330(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_331(var1);
   }
}
