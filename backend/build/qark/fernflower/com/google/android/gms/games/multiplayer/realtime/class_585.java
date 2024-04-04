package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.realtime.e
public class class_585 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.realtime.RoomEntity, android.os.Parcel, int) void
   static void method_1903(RoomEntity var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1147(var1, 1, var0.method_37(), false);
      class_333.method_1140(var1, 1000, var0.method_260());
      class_333.method_1147(var1, 2, var0.method_38(), false);
      class_333.method_1141(var1, 3, var0.method_39());
      class_333.method_1140(var1, 4, var0.method_40());
      class_333.method_1147(var1, 5, var0.method_41(), false);
      class_333.method_1140(var1, 6, var0.method_42());
      class_333.method_1142(var1, 7, var0.method_43(), false);
      class_333.method_1158(var1, 8, var0.method_259(), false);
      class_333.method_1140(var1, 9, var0.method_44());
      class_333.method_1136(var1, var2);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.realtime.RoomEntity
   public RoomEntity method_1904(Parcel var1) {
      int var2 = 0;
      ArrayList var10 = null;
      int var6 = class_327.method_1099(var1);
      long var8 = 0L;
      Bundle var11 = null;
      int var3 = 0;
      String var12 = null;
      int var4 = 0;
      String var13 = null;
      String var14 = null;
      int var5 = 0;

      while(var1.dataPosition() < var6) {
         int var7 = class_327.method_1093(var1);
         switch(class_327.method_1092(var7)) {
         case 1:
            var14 = class_327.method_1113(var1, var7);
            break;
         case 2:
            var13 = class_327.method_1113(var1, var7);
            break;
         case 3:
            var8 = class_327.method_1108(var1, var7);
            break;
         case 4:
            var4 = class_327.method_1107(var1, var7);
            break;
         case 5:
            var12 = class_327.method_1113(var1, var7);
            break;
         case 6:
            var3 = class_327.method_1107(var1, var7);
            break;
         case 7:
            var11 = class_327.method_1115(var1, var7);
            break;
         case 8:
            var10 = class_327.method_1102(var1, var7, ParticipantEntity.CREATOR);
            break;
         case 9:
            var2 = class_327.method_1107(var1, var7);
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
         return new RoomEntity(var5, var14, var13, var8, var4, var12, var3, var11, var10, var2);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.multiplayer.realtime.RoomEntity[]
   public RoomEntity[] method_1905(int var1) {
      return new RoomEntity[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1904(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1905(var1);
   }
}
