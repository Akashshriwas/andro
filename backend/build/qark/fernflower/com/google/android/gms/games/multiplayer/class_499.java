package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;

// $FF: renamed from: com.google.android.gms.games.multiplayer.c
final class class_499 extends class_498 {
   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.ParticipantEntity
   public ParticipantEntity method_1713(Parcel var1) {
      boolean var2 = true;
      if (!ParticipantEntity.method_264(ParticipantEntity.method_267()) && !ParticipantEntity.method_265(ParticipantEntity.class.getCanonicalName())) {
         String var7 = var1.readString();
         String var8 = var1.readString();
         String var5 = var1.readString();
         Uri var11;
         if (var5 == null) {
            var11 = null;
         } else {
            var11 = Uri.parse(var5);
         }

         String var6 = var1.readString();
         Uri var12;
         if (var6 == null) {
            var12 = null;
         } else {
            var12 = Uri.parse(var6);
         }

         int var3 = var1.readInt();
         String var9 = var1.readString();
         boolean var4;
         if (var1.readInt() > 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (var1.readInt() <= 0) {
            var2 = false;
         }

         PlayerEntity var10;
         if (var2) {
            var10 = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(var1);
         } else {
            var10 = null;
         }

         return new ParticipantEntity(2, var7, var8, var11, var12, var3, var9, var4, var10, 7, (ParticipantResult)null);
      } else {
         return super.method_1713(var1);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1713(var1);
   }
}
