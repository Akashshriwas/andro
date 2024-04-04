package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.class_310;
import java.util.ArrayList;

public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
   // $FF: renamed from: b com.google.android.gms.games.multiplayer.turnbased.c
   public static final class_141 field_373 = new class_141();
   // $FF: renamed from: c int
   private final int field_374;
   // $FF: renamed from: d com.google.android.gms.games.GameEntity
   private final GameEntity field_375;
   // $FF: renamed from: e java.lang.String
   private final String field_376;
   // $FF: renamed from: f java.lang.String
   private final String field_377;
   // $FF: renamed from: g long
   private final long field_378;
   // $FF: renamed from: h java.lang.String
   private final String field_379;
   // $FF: renamed from: i long
   private final long field_380;
   // $FF: renamed from: j java.lang.String
   private final String field_381;
   // $FF: renamed from: k int
   private final int field_382;
   // $FF: renamed from: l int
   private final int field_383;
   // $FF: renamed from: m int
   private final int field_384;
   // $FF: renamed from: n byte[]
   private final byte[] field_385;
   // $FF: renamed from: o java.util.ArrayList
   private final ArrayList field_386;
   // $FF: renamed from: p java.lang.String
   private final String field_387;
   // $FF: renamed from: q byte[]
   private final byte[] field_388;
   // $FF: renamed from: r int
   private final int field_389;
   // $FF: renamed from: s android.os.Bundle
   private final Bundle field_390;
   // $FF: renamed from: t int
   private final int field_391;
   // $FF: renamed from: u boolean
   private final boolean field_392;

   TurnBasedMatchEntity(int var1, GameEntity var2, String var3, String var4, long var5, String var7, long var8, String var10, int var11, int var12, int var13, byte[] var14, ArrayList var15, String var16, byte[] var17, int var18, Bundle var19, int var20, boolean var21) {
      this.field_374 = var1;
      this.field_375 = var2;
      this.field_376 = var3;
      this.field_377 = var4;
      this.field_378 = var5;
      this.field_379 = var7;
      this.field_380 = var8;
      this.field_381 = var10;
      this.field_382 = var11;
      this.field_391 = var20;
      this.field_383 = var12;
      this.field_384 = var13;
      this.field_385 = var14;
      this.field_386 = var15;
      this.field_387 = var16;
      this.field_388 = var17;
      this.field_389 = var18;
      this.field_390 = var19;
      this.field_392 = var21;
   }

   public TurnBasedMatchEntity(TurnBasedMatch var1) {
      this.field_374 = 2;
      this.field_375 = new GameEntity(var1.method_61());
      this.field_376 = var1.method_62();
      this.field_377 = var1.method_63();
      this.field_378 = var1.method_64();
      this.field_379 = var1.method_68();
      this.field_380 = var1.method_69();
      this.field_381 = var1.method_70();
      this.field_382 = var1.method_65();
      this.field_391 = var1.method_66();
      this.field_383 = var1.method_67();
      this.field_384 = var1.method_72();
      this.field_387 = var1.method_73();
      this.field_389 = var1.method_75();
      this.field_390 = var1.method_76();
      this.field_392 = var1.method_78();
      byte[] var4 = var1.method_71();
      if (var4 == null) {
         this.field_385 = null;
      } else {
         this.field_385 = new byte[var4.length];
         System.arraycopy(var4, 0, this.field_385, 0, var4.length);
      }

      var4 = var1.method_74();
      if (var4 == null) {
         this.field_388 = null;
      } else {
         this.field_388 = new byte[var4.length];
         System.arraycopy(var4, 0, this.field_388, 0, var4.length);
      }

      ArrayList var5 = var1.i();
      int var3 = var5.size();
      this.field_386 = new ArrayList(var3);

      for(int var2 = 0; var2 < var3; ++var2) {
         this.field_386.add((ParticipantEntity)((ParticipantEntity)((Participant)var5.get(var2)).a()));
      }

   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch) int
   static int method_587(TurnBasedMatch var0) {
      return class_310.method_1033(var0.method_61(), var0.method_62(), var0.method_63(), var0.method_64(), var0.method_68(), var0.method_69(), var0.method_70(), var0.method_65(), var0.method_66(), var0.method_67(), var0.method_72(), var0.i(), var0.method_73(), var0.method_75(), var0.method_76(), var0.method_77(), var0.method_78());
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch, java.lang.Object) boolean
   static boolean method_588(TurnBasedMatch var0, Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof TurnBasedMatch)) {
         var2 = false;
      } else {
         var2 = var3;
         if (var0 != var1) {
            TurnBasedMatch var4 = (TurnBasedMatch)var1;
            if (class_310.method_1035(var4.method_61(), var0.method_61()) && class_310.method_1035(var4.method_62(), var0.method_62()) && class_310.method_1035(var4.method_63(), var0.method_63()) && class_310.method_1035(var4.method_64(), var0.method_64()) && class_310.method_1035(var4.method_68(), var0.method_68()) && class_310.method_1035(var4.method_69(), var0.method_69()) && class_310.method_1035(var4.method_70(), var0.method_70()) && class_310.method_1035(var4.method_65(), var0.method_65()) && class_310.method_1035(var4.method_66(), var0.method_66()) && class_310.method_1035(var4.method_67(), var0.method_67()) && class_310.method_1035(var4.method_72(), var0.method_72()) && class_310.method_1035(var4.i(), var0.i()) && class_310.method_1035(var4.method_73(), var0.method_73()) && class_310.method_1035(var4.method_75(), var0.method_75()) && class_310.method_1035(var4.method_76(), var0.method_76()) && class_310.method_1035(var4.method_77(), var0.method_77())) {
               var2 = var3;
               if (class_310.method_1035(var4.method_78(), var0.method_78())) {
                  return var2;
               }
            }

            return false;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch) java.lang.String
   static String method_589(TurnBasedMatch var0) {
      return class_310.method_1034(var0).method_1032("Game", var0.method_61()).method_1032("MatchId", var0.method_62()).method_1032("CreatorId", var0.method_63()).method_1032("CreationTimestamp", var0.method_64()).method_1032("LastUpdaterId", var0.method_68()).method_1032("LastUpdatedTimestamp", var0.method_69()).method_1032("PendingParticipantId", var0.method_70()).method_1032("MatchStatus", var0.method_65()).method_1032("TurnStatus", var0.method_66()).method_1032("Variant", var0.method_67()).method_1032("Data", var0.method_71()).method_1032("Version", var0.method_72()).method_1032("Participants", var0.i()).method_1032("RematchId", var0.method_73()).method_1032("PreviousData", var0.method_74()).method_1032("MatchNumber", var0.method_75()).method_1032("AutoMatchCriteria", var0.method_76()).method_1032("AvailableAutoMatchSlots", var0.method_77()).method_1032("LocallyModified", var0.method_78()).toString();
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_591();
   }

   // $FF: renamed from: b () com.google.android.gms.games.Game
   public Game method_61() {
      return this.field_375;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_62() {
      return this.field_376;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_63() {
      return this.field_377;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () long
   public long method_64() {
      return this.field_378;
   }

   public boolean equals(Object var1) {
      return method_588(this, var1);
   }

   // $FF: renamed from: f () int
   public int method_65() {
      return this.field_382;
   }

   // $FF: renamed from: g () int
   public int method_66() {
      return this.field_391;
   }

   // $FF: renamed from: h () int
   public int method_67() {
      return this.field_383;
   }

   public int hashCode() {
      return method_587(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_60() {
      return new ArrayList(this.field_386);
   }

   // $FF: renamed from: j () java.lang.String
   public String method_68() {
      return this.field_379;
   }

   // $FF: renamed from: k () long
   public long method_69() {
      return this.field_380;
   }

   // $FF: renamed from: l () java.lang.String
   public String method_70() {
      return this.field_381;
   }

   // $FF: renamed from: m () byte[]
   public byte[] method_71() {
      return this.field_385;
   }

   // $FF: renamed from: n () int
   public int method_72() {
      return this.field_384;
   }

   // $FF: renamed from: o () java.lang.String
   public String method_73() {
      return this.field_387;
   }

   // $FF: renamed from: p () byte[]
   public byte[] method_74() {
      return this.field_388;
   }

   // $FF: renamed from: q () int
   public int method_75() {
      return this.field_389;
   }

   // $FF: renamed from: r () android.os.Bundle
   public Bundle method_76() {
      return this.field_390;
   }

   // $FF: renamed from: s () int
   public int method_77() {
      return this.field_390 == null ? 0 : this.field_390.getInt("max_automatch_players");
   }

   // $FF: renamed from: t () boolean
   public boolean method_78() {
      return this.field_392;
   }

   public String toString() {
      return method_589(this);
   }

   // $FF: renamed from: u () int
   public int method_590() {
      return this.field_374;
   }

   // $FF: renamed from: v () com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
   public TurnBasedMatch method_591() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_141.method_570(this, var1, var2);
   }
}
