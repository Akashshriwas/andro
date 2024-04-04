package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.class_118;
import com.google.android.gms.games.multiplayer.class_120;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.realtime.d
public final class class_119 extends class_118 implements Room {
   // $FF: renamed from: c int
   private final int field_122;

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_372();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_37() {
      return this.d("external_match_id");
   }

   // $FF: renamed from: c () java.lang.String
   public String method_38() {
      return this.d("creator_external");
   }

   // $FF: renamed from: d () long
   public long method_39() {
      return this.a("creation_timestamp");
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () int
   public int method_40() {
      return this.b("status");
   }

   public boolean equals(Object var1) {
      return RoomEntity.method_254(this, var1);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_41() {
      return this.d("description");
   }

   // $FF: renamed from: g () int
   public int method_42() {
      return this.b("variant");
   }

   // $FF: renamed from: h () android.os.Bundle
   public Bundle method_43() {
      return !this.c("has_automatch_criteria") ? null : class_589.method_1915(this.b("automatch_min_players"), this.b("automatch_max_players"), this.a("automatch_bit_mask"));
   }

   public int hashCode() {
      return RoomEntity.method_253(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_371() {
      ArrayList var2 = new ArrayList(this.field_122);

      for(int var1 = 0; var1 < this.field_122; ++var1) {
         var2.add(new class_120(this.a, this.b + var1));
      }

      return var2;
   }

   // $FF: renamed from: j () int
   public int method_44() {
      return this.b("automatch_wait_estimate_sec");
   }

   // $FF: renamed from: k () com.google.android.gms.games.multiplayer.realtime.Room
   public Room method_372() {
      return new RoomEntity(this);
   }

   public String toString() {
      return RoomEntity.method_257(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      ((RoomEntity)this.method_372()).writeToParcel(var1, var2);
   }
}
