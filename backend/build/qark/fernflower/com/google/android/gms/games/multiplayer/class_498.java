package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.games.PlayerEntity;

// $FF: renamed from: com.google.android.gms.games.multiplayer.h
public class class_498 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.ParticipantEntity, android.os.Parcel, int) void
   static void method_1712(ParticipantEntity var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.method_52(), false);
      class_333.method_1140(var1, 1000, var0.method_268());
      class_333.method_1147(var1, 2, var0.method_49(), false);
      class_333.method_1145(var1, 3, var0.method_50(), var2, false);
      class_333.method_1145(var1, 4, var0.method_51(), var2, false);
      class_333.method_1140(var1, 5, var0.method_45());
      class_333.method_1147(var1, 6, var0.method_46(), false);
      class_333.method_1150(var1, 7, var0.method_48());
      class_333.method_1145(var1, 8, var0.method_53(), var2, false);
      class_333.method_1140(var1, 9, var0.method_47());
      class_333.method_1145(var1, 10, var0.method_54(), var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.ParticipantEntity
   public ParticipantEntity method_1713(Parcel var1) {
      int var2 = 0;
      ParticipantResult var8 = null;
      int var5 = class_327.method_1099(var1);
      PlayerEntity var9 = null;
      boolean var7 = false;
      String var10 = null;
      int var3 = 0;
      Uri var11 = null;
      Uri var12 = null;
      String var13 = null;
      String var14 = null;
      int var4 = 0;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var14 = class_327.method_1113(var1, var6);
            break;
         case 2:
            var13 = class_327.method_1113(var1, var6);
            break;
         case 3:
            var12 = (Uri)class_327.method_1095(var1, var6, Uri.CREATOR);
            break;
         case 4:
            var11 = (Uri)class_327.method_1095(var1, var6, Uri.CREATOR);
            break;
         case 5:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 6:
            var10 = class_327.method_1113(var1, var6);
            break;
         case 7:
            var7 = class_327.method_1103(var1, var6);
            break;
         case 8:
            var9 = (PlayerEntity)class_327.method_1095(var1, var6, PlayerEntity.CREATOR);
            break;
         case 9:
            var2 = class_327.method_1107(var1, var6);
            break;
         case 10:
            var8 = (ParticipantResult)class_327.method_1095(var1, var6, ParticipantResult.field_1237);
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
         return new ParticipantEntity(var4, var14, var13, var12, var11, var3, var10, var7, var9, var2, var8);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.multiplayer.ParticipantEntity[]
   public ParticipantEntity[] method_1714(int var1) {
      return new ParticipantEntity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1713(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1714(var1);
   }
}
