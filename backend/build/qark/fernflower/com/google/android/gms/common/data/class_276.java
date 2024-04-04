package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.common.data.c
public class class_276 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.common.data.DataHolder, android.os.Parcel, int) void
   static void method_960(DataHolder var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1154(var1, 1, var0.method_1339(), false);
      class_333.method_1140(var1, 1000, var0.method_1336());
      class_333.method_1153(var1, 2, var0.method_1341(), var2, false);
      class_333.method_1140(var1, 3, var0.method_1342());
      class_333.method_1142(var1, 4, var0.method_1345(), false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.common.data.DataHolder
   public DataHolder method_961(Parcel var1) {
      int var2 = 0;
      Bundle var6 = null;
      int var4 = class_327.method_1099(var1);
      CursorWindow[] var7 = null;
      String[] var8 = null;
      int var3 = 0;

      while(var1.dataPosition() < var4) {
         int var5 = class_327.method_1093(var1);
         switch(class_327.method_1092(var5)) {
         case 1:
            var8 = class_327.method_1124(var1, var5);
            break;
         case 2:
            var7 = (CursorWindow[])class_327.method_1101(var1, var5, CursorWindow.CREATOR);
            break;
         case 3:
            var2 = class_327.method_1107(var1, var5);
            break;
         case 4:
            var6 = class_327.method_1115(var1, var5);
            break;
         case 1000:
            var3 = class_327.method_1107(var1, var5);
            break;
         default:
            class_327.method_1100(var1, var5);
         }
      }

      if (var1.dataPosition() != var4) {
         throw new class_330("Overread allowed size end=" + var4, var1);
      } else {
         DataHolder var9 = new DataHolder(var3, var8, var7, var2, var6);
         var9.method_1335();
         return var9;
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.common.data.DataHolder[]
   public DataHolder[] method_962(int var1) {
      return new DataHolder[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_961(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_962(var1);
   }
}
