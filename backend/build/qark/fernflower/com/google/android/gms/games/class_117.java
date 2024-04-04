package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.games.a
final class class_117 extends class_116 {
   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.GameEntity
   public GameEntity method_362(Parcel var1) {
      if (!GameEntity.method_247(GameEntity.method_250()) && !GameEntity.method_248(GameEntity.class.getCanonicalName())) {
         String var7 = var1.readString();
         String var8 = var1.readString();
         String var9 = var1.readString();
         String var10 = var1.readString();
         String var11 = var1.readString();
         String var12 = var1.readString();
         String var4 = var1.readString();
         Uri var13;
         if (var4 == null) {
            var13 = null;
         } else {
            var13 = Uri.parse(var4);
         }

         String var5 = var1.readString();
         Uri var14;
         if (var5 == null) {
            var14 = null;
         } else {
            var14 = Uri.parse(var5);
         }

         String var6 = var1.readString();
         Uri var15;
         if (var6 == null) {
            var15 = null;
         } else {
            var15 = Uri.parse(var6);
         }

         boolean var2;
         if (var1.readInt() > 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         boolean var3;
         if (var1.readInt() > 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         return new GameEntity(2, var7, var8, var9, var10, var11, var12, var13, var14, var15, var2, var3, var1.readString(), var1.readInt(), var1.readInt(), var1.readInt(), false, false);
      } else {
         return super.method_362(var1);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_362(var1);
   }
}
