package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_343;
import com.google.android.gms.internal.class_86;
import java.util.ArrayList;

public final class InvitationEntity extends class_86 implements Invitation {
   public static final Creator CREATOR = new class_497();
   // $FF: renamed from: a int
   private final int field_13;
   // $FF: renamed from: b com.google.android.gms.games.GameEntity
   private final GameEntity field_14;
   // $FF: renamed from: c java.lang.String
   private final String field_15;
   // $FF: renamed from: d long
   private final long field_16;
   // $FF: renamed from: e int
   private final int field_17;
   // $FF: renamed from: f com.google.android.gms.games.multiplayer.ParticipantEntity
   private final ParticipantEntity field_18;
   // $FF: renamed from: g java.util.ArrayList
   private final ArrayList field_19;
   // $FF: renamed from: h int
   private final int field_20;

   InvitationEntity(int var1, GameEntity var2, String var3, long var4, int var6, ParticipantEntity var7, ArrayList var8, int var9) {
      this.field_13 = var1;
      this.field_14 = var2;
      this.field_15 = var3;
      this.field_16 = var4;
      this.field_17 = var6;
      this.field_18 = var7;
      this.field_19 = var8;
      this.field_20 = var9;
   }

   InvitationEntity(Invitation var1) {
      this.field_13 = 1;
      this.field_14 = new GameEntity(var1.method_14());
      this.field_15 = var1.method_15();
      this.field_16 = var1.method_17();
      this.field_17 = var1.method_18();
      this.field_20 = var1.method_19();
      String var5 = var1.method_16().method_52();
      Participant var4 = null;
      ArrayList var6 = var1.i();
      int var3 = var6.size();
      this.field_19 = new ArrayList(var3);
      int var2 = 0;

      Participant var7;
      for(var7 = var4; var2 < var3; ++var2) {
         var4 = (Participant)var6.get(var2);
         if (var4.method_52().equals(var5)) {
            var7 = var4;
         }

         this.field_19.add((ParticipantEntity)var4.a());
      }

      class_343.method_1190(var7, "Must have a valid inviter!");
      this.field_18 = (ParticipantEntity)var7.a();
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.Invitation) int
   static int method_236(Invitation var0) {
      return class_310.method_1033(var0.method_14(), var0.method_15(), var0.method_17(), var0.method_18(), var0.method_16(), var0.i(), var0.method_19());
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.Invitation, java.lang.Object) boolean
   static boolean method_237(Invitation var0, Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof Invitation)) {
         var2 = false;
      } else {
         var2 = var3;
         if (var0 != var1) {
            Invitation var4 = (Invitation)var1;
            if (class_310.method_1035(var4.method_14(), var0.method_14()) && class_310.method_1035(var4.method_15(), var0.method_15()) && class_310.method_1035(var4.method_17(), var0.method_17()) && class_310.method_1035(var4.method_18(), var0.method_18()) && class_310.method_1035(var4.method_16(), var0.method_16()) && class_310.method_1035(var4.i(), var0.i())) {
               var2 = var3;
               if (class_310.method_1035(var4.method_19(), var0.method_19())) {
                  return var2;
               }
            }

            return false;
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.Integer) boolean
   // $FF: synthetic method
   static boolean method_238(Integer var0) {
      return b(var0);
   }

   // $FF: renamed from: a (java.lang.String) boolean
   // $FF: synthetic method
   static boolean method_239(String var0) {
      return b(var0);
   }

   // $FF: renamed from: b (com.google.android.gms.games.multiplayer.Invitation) java.lang.String
   static String method_240(Invitation var0) {
      return class_310.method_1034(var0).method_1032("Game", var0.method_14()).method_1032("InvitationId", var0.method_15()).method_1032("CreationTimestamp", var0.method_17()).method_1032("InvitationType", var0.method_18()).method_1032("Inviter", var0.method_16()).method_1032("Participants", var0.i()).method_1032("Variant", var0.method_19()).toString();
   }

   // $FF: renamed from: k () java.lang.Integer
   // $FF: synthetic method
   static Integer method_241() {
      return w();
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_244();
   }

   // $FF: renamed from: b () com.google.android.gms.games.Game
   public Game method_14() {
      return this.field_14;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_15() {
      return this.field_15;
   }

   // $FF: renamed from: d () com.google.android.gms.games.multiplayer.Participant
   public Participant method_16() {
      return this.field_18;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () long
   public long method_17() {
      return this.field_16;
   }

   public boolean equals(Object var1) {
      return method_237(this, var1);
   }

   // $FF: renamed from: f () int
   public int method_18() {
      return this.field_17;
   }

   // $FF: renamed from: g () int
   public int method_19() {
      return this.field_20;
   }

   // $FF: renamed from: h () int
   public int method_242() {
      return this.field_13;
   }

   public int hashCode() {
      return method_236(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_243() {
      return new ArrayList(this.field_19);
   }

   // $FF: renamed from: j () com.google.android.gms.games.multiplayer.Invitation
   public Invitation method_244() {
      return this;
   }

   public String toString() {
      return method_240(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (!this.x()) {
         class_496.method_1709(this, var1, var2);
      } else {
         this.field_14.writeToParcel(var1, var2);
         var1.writeString(this.field_15);
         var1.writeLong(this.field_16);
         var1.writeInt(this.field_17);
         this.field_18.writeToParcel(var1, var2);
         int var4 = this.field_19.size();
         var1.writeInt(var4);

         for(int var3 = 0; var3 < var4; ++var3) {
            ((ParticipantEntity)this.field_19.get(var3)).writeToParcel(var1, var2);
         }
      }

   }
}
