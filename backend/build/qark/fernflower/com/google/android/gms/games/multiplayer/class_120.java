package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.class_118;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.class_124;

// $FF: renamed from: com.google.android.gms.games.multiplayer.e
public final class class_120 extends class_118 implements Participant {
   // $FF: renamed from: c com.google.android.gms.games.e
   private final class_124 field_123;

   public class_120(DataHolder var1, int var2) {
      super(var1, var2);
      this.field_123 = new class_124(var1, var2);
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_373();
   }

   // $FF: renamed from: b () int
   public int method_45() {
      return this.b("player_status");
   }

   // $FF: renamed from: c () java.lang.String
   public String method_46() {
      return this.d("client_address");
   }

   // $FF: renamed from: d () int
   public int method_47() {
      return this.b("capabilities");
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () boolean
   public boolean method_48() {
      return this.b("connected") > 0;
   }

   public boolean equals(Object var1) {
      return ParticipantEntity.method_263(this, var1);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_49() {
      return this.g("external_player_id") ? this.d("default_display_name") : this.field_123.method_56();
   }

   // $FF: renamed from: g () android.net.Uri
   public Uri method_50() {
      return this.g("external_player_id") ? this.f("default_display_image_uri") : this.field_123.method_57();
   }

   // $FF: renamed from: h () android.net.Uri
   public Uri method_51() {
      return this.g("external_player_id") ? null : this.field_123.method_58();
   }

   public int hashCode() {
      return ParticipantEntity.method_262(this);
   }

   // $FF: renamed from: i () java.lang.String
   public String method_52() {
      return this.d("external_participant_id");
   }

   // $FF: renamed from: j () com.google.android.gms.games.Player
   public Player method_53() {
      return this.g("external_player_id") ? null : this.field_123;
   }

   // $FF: renamed from: k () com.google.android.gms.games.multiplayer.ParticipantResult
   public ParticipantResult method_54() {
      if (this.g("result_type")) {
         return null;
      } else {
         int var1 = this.b("result_type");
         int var2 = this.b("placing");
         return new ParticipantResult(this.method_52(), var1, var2);
      }
   }

   // $FF: renamed from: l () com.google.android.gms.games.multiplayer.Participant
   public Participant method_373() {
      return new ParticipantEntity(this);
   }

   public String toString() {
      return ParticipantEntity.method_266(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      ((ParticipantEntity)this.method_373()).writeToParcel(var1, var2);
   }
}
