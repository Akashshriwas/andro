package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.games.f
public class class_125 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.games.PlayerEntity, android.os.Parcel, int) void
   static void method_379(PlayerEntity var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.method_55(), false);
      class_333.method_1140(var1, 1000, var0.method_234());
      class_333.method_1147(var1, 2, var0.method_56(), false);
      class_333.method_1145(var1, 3, var0.method_57(), var2, false);
      class_333.method_1145(var1, 4, var0.method_58(), var2, false);
      class_333.method_1141(var1, 5, var0.method_59());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.PlayerEntity
   public PlayerEntity method_380(Parcel var1) {
      Uri var7 = null;
      int var3 = class_327.method_1099(var1);
      int var2 = 0;
      long var5 = 0L;
      Uri var8 = null;
      String var9 = null;
      String var10 = null;

      while(var1.dataPosition() < var3) {
         int var4 = class_327.method_1093(var1);
         switch(class_327.method_1092(var4)) {
         case 1:
            var10 = class_327.method_1113(var1, var4);
            break;
         case 2:
            var9 = class_327.method_1113(var1, var4);
            break;
         case 3:
            var8 = (Uri)class_327.method_1095(var1, var4, Uri.CREATOR);
            break;
         case 4:
            var7 = (Uri)class_327.method_1095(var1, var4, Uri.CREATOR);
            break;
         case 5:
            var5 = class_327.method_1108(var1, var4);
            break;
         case 1000:
            var2 = class_327.method_1107(var1, var4);
            break;
         default:
            class_327.method_1100(var1, var4);
         }
      }

      if (var1.dataPosition() != var3) {
         throw new class_330("Overread allowed size end=" + var3, var1);
      } else {
         return new PlayerEntity(var2, var10, var9, var8, var7, var5);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.PlayerEntity[]
   public PlayerEntity[] method_381(int var1) {
      return new PlayerEntity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_380(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_381(var1);
   }
}
