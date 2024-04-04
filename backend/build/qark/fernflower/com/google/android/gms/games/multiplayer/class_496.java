package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.g
public class class_496 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.InvitationEntity, android.os.Parcel, int) void
   static void method_1709(InvitationEntity var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1145(var1, 1, var0.method_14(), var2, false);
      class_333.method_1140(var1, 1000, var0.method_242());
      class_333.method_1147(var1, 2, var0.method_15(), false);
      class_333.method_1141(var1, 3, var0.method_17());
      class_333.method_1140(var1, 4, var0.method_18());
      class_333.method_1145(var1, 5, var0.method_16(), var2, false);
      class_333.method_1158(var1, 6, var0.method_243(), false);
      class_333.method_1140(var1, 7, var0.method_19());
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.InvitationEntity
   public InvitationEntity method_1710(Parcel var1) {
      int var2 = 0;
      ArrayList var9 = null;
      int var5 = class_327.method_1099(var1);
      long var7 = 0L;
      ParticipantEntity var10 = null;
      int var3 = 0;
      String var11 = null;
      GameEntity var12 = null;
      int var4 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var12 = (GameEntity)class_327.method_1095(var1, var6, GameEntity.CREATOR);
            break;
         case 2:
            var11 = class_327.method_1113(var1, var6);
            break;
         case 3:
            var7 = class_327.method_1108(var1, var6);
            break;
         case 4:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 5:
            var10 = (ParticipantEntity)class_327.method_1095(var1, var6, ParticipantEntity.CREATOR);
            break;
         case 6:
            var9 = class_327.method_1102(var1, var6, ParticipantEntity.CREATOR);
            break;
         case 7:
            var2 = class_327.method_1107(var1, var6);
            break;
         case 1000:
            var4 = class_327.method_1107(var1, var6);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new InvitationEntity(var4, var12, var11, var7, var3, var10, var9, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.multiplayer.InvitationEntity[]
   public InvitationEntity[] method_1711(int var1) {
      return new InvitationEntity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1710(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1711(var1);
   }
}
