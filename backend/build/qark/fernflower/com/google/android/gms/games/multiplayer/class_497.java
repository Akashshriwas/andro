package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.a
final class class_497 extends class_496 {
   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.InvitationEntity
   public InvitationEntity method_1710(Parcel var1) {
      if (!InvitationEntity.method_238(InvitationEntity.method_241()) && !InvitationEntity.method_239(InvitationEntity.class.getCanonicalName())) {
         GameEntity var7 = (GameEntity)GameEntity.CREATOR.createFromParcel(var1);
         String var8 = var1.readString();
         long var5 = var1.readLong();
         int var3 = var1.readInt();
         ParticipantEntity var9 = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(var1);
         int var4 = var1.readInt();
         ArrayList var10 = new ArrayList(var4);

         for(int var2 = 0; var2 < var4; ++var2) {
            var10.add(ParticipantEntity.CREATOR.createFromParcel(var1));
         }

         return new InvitationEntity(1, var7, var8, var5, var3, var9, var10, -1);
      } else {
         return super.method_1710(var1);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1710(var1);
   }
}
