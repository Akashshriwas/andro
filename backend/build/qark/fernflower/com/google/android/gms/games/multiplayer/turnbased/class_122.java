package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.class_118;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.class_120;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.turnbased.a
public final class class_122 extends class_118 implements TurnBasedMatch {
   // $FF: renamed from: c com.google.android.gms.games.Game
   private final Game field_127;
   // $FF: renamed from: d int
   private final int field_128;

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_376();
   }

   // $FF: renamed from: b () com.google.android.gms.games.Game
   public Game method_61() {
      return this.field_127;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_62() {
      return this.d("external_match_id");
   }

   // $FF: renamed from: d () java.lang.String
   public String method_63() {
      return this.d("creator_external");
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () long
   public long method_64() {
      return this.a("creation_timestamp");
   }

   public boolean equals(Object var1) {
      return TurnBasedMatchEntity.method_588(this, var1);
   }

   // $FF: renamed from: f () int
   public int method_65() {
      return this.b("status");
   }

   // $FF: renamed from: g () int
   public int method_66() {
      return this.b("user_match_status");
   }

   // $FF: renamed from: h () int
   public int method_67() {
      return this.b("variant");
   }

   public int hashCode() {
      return TurnBasedMatchEntity.method_587(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_60() {
      ArrayList var2 = new ArrayList(this.field_128);

      for(int var1 = 0; var1 < this.field_128; ++var1) {
         var2.add(new class_120(this.a, this.b + var1));
      }

      return var2;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_68() {
      return this.d("last_updater_external");
   }

   // $FF: renamed from: k () long
   public long method_69() {
      return this.a("last_updated_timestamp");
   }

   // $FF: renamed from: l () java.lang.String
   public String method_70() {
      return this.d("pending_participant_external");
   }

   // $FF: renamed from: m () byte[]
   public byte[] method_71() {
      return this.e("data");
   }

   // $FF: renamed from: n () int
   public int method_72() {
      return this.b("version");
   }

   // $FF: renamed from: o () java.lang.String
   public String method_73() {
      return this.d("rematch_id");
   }

   // $FF: renamed from: p () byte[]
   public byte[] method_74() {
      return this.e("previous_match_data");
   }

   // $FF: renamed from: q () int
   public int method_75() {
      return this.b("match_number");
   }

   // $FF: renamed from: r () android.os.Bundle
   public Bundle method_76() {
      return !this.c("has_automatch_criteria") ? null : class_142.method_573(this.b("automatch_min_players"), this.b("automatch_max_players"), this.a("automatch_bit_mask"));
   }

   // $FF: renamed from: s () int
   public int method_77() {
      return !this.c("has_automatch_criteria") ? 0 : this.b("automatch_max_players");
   }

   // $FF: renamed from: t () boolean
   public boolean method_78() {
      return this.c("upsync_required");
   }

   public String toString() {
      return TurnBasedMatchEntity.method_589(this);
   }

   // $FF: renamed from: u () com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
   public TurnBasedMatch method_376() {
      return new TurnBasedMatchEntity(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      ((TurnBasedMatchEntity)this.method_376()).writeToParcel(var1, var2);
   }
}
