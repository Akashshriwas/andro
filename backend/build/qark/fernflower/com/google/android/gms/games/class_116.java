package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.games.d
public class class_116 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.games.GameEntity, android.os.Parcel, int) void
   static void method_361(GameEntity var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.method_20(), false);
      class_333.method_1147(var1, 2, var0.method_21(), false);
      class_333.method_1147(var1, 3, var0.method_22(), false);
      class_333.method_1147(var1, 4, var0.method_23(), false);
      class_333.method_1147(var1, 5, var0.method_24(), false);
      class_333.method_1147(var1, 6, var0.method_25(), false);
      class_333.method_1145(var1, 7, var0.method_26(), var2, false);
      class_333.method_1145(var1, 8, var0.method_27(), var2, false);
      class_333.method_1145(var1, 9, var0.method_28(), var2, false);
      class_333.method_1150(var1, 10, var0.method_29());
      class_333.method_1150(var1, 11, var0.method_30());
      class_333.method_1147(var1, 12, var0.method_31(), false);
      class_333.method_1140(var1, 13, var0.method_32());
      class_333.method_1140(var1, 14, var0.method_33());
      class_333.method_1140(var1, 15, var0.method_34());
      class_333.method_1150(var1, 17, var0.method_36());
      class_333.method_1150(var1, 16, var0.method_35());
      class_333.method_1140(var1, 1000, var0.method_251());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.GameEntity
   public GameEntity method_362(Parcel var1) {
      int var6 = class_327.method_1099(var1);
      int var5 = 0;
      String var21 = null;
      String var20 = null;
      String var19 = null;
      String var18 = null;
      String var17 = null;
      String var16 = null;
      Uri var15 = null;
      Uri var14 = null;
      Uri var13 = null;
      boolean var11 = false;
      boolean var10 = false;
      String var12 = null;
      int var4 = 0;
      int var3 = 0;
      int var2 = 0;
      boolean var9 = false;
      boolean var8 = false;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var21 = class_327.method_1113(var1, var7);
            break;
         case 2:
            var20 = class_327.method_1113(var1, var7);
            break;
         case 3:
            var19 = class_327.method_1113(var1, var7);
            break;
         case 4:
            var18 = class_327.method_1113(var1, var7);
            break;
         case 5:
            var17 = class_327.method_1113(var1, var7);
            break;
         case 6:
            var16 = class_327.method_1113(var1, var7);
            break;
         case 7:
            var15 = (Uri)class_327.method_1095(var1, var7, Uri.CREATOR);
            break;
         case 8:
            var14 = (Uri)class_327.method_1095(var1, var7, Uri.CREATOR);
            break;
         case 9:
            var13 = (Uri)class_327.method_1095(var1, var7, Uri.CREATOR);
            break;
         case 10:
            var11 = class_327.method_1103(var1, var7);
            break;
         case 11:
            var10 = class_327.method_1103(var1, var7);
            break;
         case 12:
            var12 = class_327.method_1113(var1, var7);
            break;
         case 13:
            var4 = class_327.method_1107(var1, var7);
            break;
         case 14:
            var3 = class_327.method_1107(var1, var7);
            break;
         case 15:
            var2 = class_327.method_1107(var1, var7);
            break;
         case 16:
            var9 = class_327.method_1103(var1, var7);
            break;
         case 17:
            var8 = class_327.method_1103(var1, var7);
            break;
         case 1000:
            var5 = class_327.method_1107(var1, var7);
            break;
         default:
            class_327.method_1100(var1, var7);
         }
      }

      if (var1.dataPosition() != var6) {
         throw new class_330("Overread allowed size end=" + var6, var1);
      } else {
         return new GameEntity(var5, var21, var20, var19, var18, var17, var16, var15, var14, var13, var11, var10, var12, var4, var3, var2, var9, var8);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.GameEntity[]
   public GameEntity[] method_363(int var1) {
      return new GameEntity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_362(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_363(var1);
   }
}
