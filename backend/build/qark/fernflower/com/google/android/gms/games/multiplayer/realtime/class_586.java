package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.realtime.c
final class class_586 extends class_585 {
   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.realtime.RoomEntity
   public RoomEntity method_1904(Parcel var1) {
      if (!RoomEntity.method_255(RoomEntity.method_258()) && !RoomEntity.method_256(RoomEntity.class.getCanonicalName())) {
         String var8 = var1.readString();
         String var9 = var1.readString();
         long var6 = var1.readLong();
         int var3 = var1.readInt();
         String var10 = var1.readString();
         int var4 = var1.readInt();
         Bundle var11 = var1.readBundle();
         int var5 = var1.readInt();
         ArrayList var12 = new ArrayList(var5);

         for(int var2 = 0; var2 < var5; ++var2) {
            var12.add(ParticipantEntity.CREATOR.createFromParcel(var1));
         }

         return new RoomEntity(2, var8, var9, var6, var3, var10, var4, var11, var12, -1);
      } else {
         return super.method_1904(var1);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1904(var1);
   }
}
