package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.turnbased.c
public class class_141 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity, android.os.Parcel, int) void
   static void method_570(TurnBasedMatchEntity var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1145(var1, 1, var0.method_61(), var2, false);
      class_333.method_1147(var1, 2, var0.method_62(), false);
      class_333.method_1147(var1, 3, var0.method_63(), false);
      class_333.method_1141(var1, 4, var0.method_64());
      class_333.method_1147(var1, 5, var0.method_68(), false);
      class_333.method_1141(var1, 6, var0.method_69());
      class_333.method_1147(var1, 7, var0.method_70(), false);
      class_333.method_1140(var1, 8, var0.method_65());
      class_333.method_1140(var1, 10, var0.method_67());
      class_333.method_1140(var1, 11, var0.method_72());
      class_333.method_1151(var1, 12, var0.method_71(), false);
      class_333.method_1158(var1, 13, var0.method_60(), false);
      class_333.method_1147(var1, 14, var0.method_73(), false);
      class_333.method_1151(var1, 15, var0.method_74(), false);
      class_333.method_1142(var1, 17, var0.method_76(), false);
      class_333.method_1140(var1, 16, var0.method_75());
      class_333.method_1140(var1, 1000, var0.method_590());
      class_333.method_1150(var1, 19, var0.method_78());
      class_333.method_1140(var1, 18, var0.method_66());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity
   public TurnBasedMatchEntity method_571(Parcel var1) {
      int var8 = class_327.method_1099(var1);
      int var7 = 0;
      GameEntity var24 = null;
      String var23 = null;
      String var22 = null;
      long var12 = 0L;
      String var21 = null;
      long var10 = 0L;
      String var20 = null;
      int var6 = 0;
      int var5 = 0;
      int var4 = 0;
      byte[] var19 = null;
      ArrayList var18 = null;
      String var17 = null;
      byte[] var16 = null;
      int var3 = 0;
      Bundle var15 = null;
      int var2 = 0;
      boolean var14 = false;

      while(var1.dataPosition() < var8) {
         int var9 = class_327.method_1093(var1);
         switch(class_327.method_1092(var9)) {
         case 1:
            var24 = (GameEntity)class_327.method_1095(var1, var9, GameEntity.CREATOR);
            break;
         case 2:
            var23 = class_327.method_1113(var1, var9);
            break;
         case 3:
            var22 = class_327.method_1113(var1, var9);
            break;
         case 4:
            var12 = class_327.method_1108(var1, var9);
            break;
         case 5:
            var21 = class_327.method_1113(var1, var9);
            break;
         case 6:
            var10 = class_327.method_1108(var1, var9);
            break;
         case 7:
            var20 = class_327.method_1113(var1, var9);
            break;
         case 8:
            var6 = class_327.method_1107(var1, var9);
            break;
         case 10:
            var5 = class_327.method_1107(var1, var9);
            break;
         case 11:
            var4 = class_327.method_1107(var1, var9);
            break;
         case 12:
            var19 = class_327.method_1116(var1, var9);
            break;
         case 13:
            var18 = class_327.method_1102(var1, var9, ParticipantEntity.CREATOR);
            break;
         case 14:
            var17 = class_327.method_1113(var1, var9);
            break;
         case 15:
            var16 = class_327.method_1116(var1, var9);
            break;
         case 16:
            var3 = class_327.method_1107(var1, var9);
            break;
         case 17:
            var15 = class_327.method_1115(var1, var9);
            break;
         case 18:
            var2 = class_327.method_1107(var1, var9);
            break;
         case 19:
            var14 = class_327.method_1103(var1, var9);
            break;
         case 1000:
            var7 = class_327.method_1107(var1, var9);
            break;
         default:
            class_327.method_1100(var1, var9);
         }
      }

      if (var1.dataPosition() != var8) {
         throw new class_330("Overread allowed size end=" + var8, var1);
      } else {
         return new TurnBasedMatchEntity(var7, var24, var23, var22, var12, var21, var10, var20, var6, var5, var4, var19, var18, var17, var16, var3, var15, var2, var14);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity[]
   public TurnBasedMatchEntity[] method_572(int var1) {
      return new TurnBasedMatchEntity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_571(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_572(var1);
   }
}
