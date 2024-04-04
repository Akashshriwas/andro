package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.games.c
final class class_126 extends class_125 {
   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.PlayerEntity
   public PlayerEntity method_380(Parcel var1) {
      Uri var3 = null;
      if (!PlayerEntity.method_230(PlayerEntity.method_233()) && !PlayerEntity.method_231(PlayerEntity.class.getCanonicalName())) {
         String var4 = var1.readString();
         String var5 = var1.readString();
         String var2 = var1.readString();
         String var6 = var1.readString();
         Uri var7;
         if (var2 == null) {
            var7 = null;
         } else {
            var7 = Uri.parse(var2);
         }

         if (var6 != null) {
            var3 = Uri.parse(var6);
         }

         return new PlayerEntity(1, var4, var5, var7, var3, var1.readLong());
      } else {
         return super.method_380(var1);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_380(var1);
   }
}
