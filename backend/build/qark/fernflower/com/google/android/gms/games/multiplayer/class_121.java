package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.class_118;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.games.multiplayer.b
public final class class_121 extends class_118 implements Invitation {
   // $FF: renamed from: c com.google.android.gms.games.Game
   private final Game field_124;
   // $FF: renamed from: d com.google.android.gms.games.multiplayer.e
   private final class_120 field_125;
   // $FF: renamed from: e java.util.ArrayList
   private final ArrayList field_126;

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_374();
   }

   // $FF: renamed from: b () com.google.android.gms.games.Game
   public Game method_14() {
      return this.field_124;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_15() {
      return this.d("external_invitation_id");
   }

   // $FF: renamed from: d () com.google.android.gms.games.multiplayer.Participant
   public Participant method_16() {
      return this.field_125;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () long
   public long method_17() {
      return Math.max(this.a("creation_timestamp"), this.a("last_modified_timestamp"));
   }

   public boolean equals(Object var1) {
      return InvitationEntity.method_237(this, var1);
   }

   // $FF: renamed from: f () int
   public int method_18() {
      return this.b("type");
   }

   // $FF: renamed from: g () int
   public int method_19() {
      return this.b("variant");
   }

   // $FF: renamed from: h () com.google.android.gms.games.multiplayer.Invitation
   public Invitation method_374() {
      return new InvitationEntity(this);
   }

   public int hashCode() {
      return InvitationEntity.method_236(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_375() {
      return this.field_126;
   }

   public String toString() {
      return InvitationEntity.method_240(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      ((InvitationEntity)this.method_374()).writeToParcel(var1, var2);
   }
}
