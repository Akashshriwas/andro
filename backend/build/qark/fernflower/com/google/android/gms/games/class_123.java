package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.class_118;

// $FF: renamed from: com.google.android.gms.games.b
public final class class_123 extends class_118 implements Game {
   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_377();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_20() {
      return this.d("external_game_id");
   }

   // $FF: renamed from: c () java.lang.String
   public String method_21() {
      return this.d("display_name");
   }

   // $FF: renamed from: d () java.lang.String
   public String method_22() {
      return this.d("primary_category");
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_23() {
      return this.d("secondary_category");
   }

   public boolean equals(Object var1) {
      return GameEntity.method_246(this, var1);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_24() {
      return this.d("game_description");
   }

   // $FF: renamed from: g () java.lang.String
   public String method_25() {
      return this.d("developer_name");
   }

   // $FF: renamed from: h () android.net.Uri
   public Uri method_26() {
      return this.f("game_icon_image_uri");
   }

   public int hashCode() {
      return GameEntity.method_245(this);
   }

   // $FF: renamed from: i () android.net.Uri
   public Uri method_27() {
      return this.f("game_hi_res_image_uri");
   }

   // $FF: renamed from: j () android.net.Uri
   public Uri method_28() {
      return this.f("featured_image_uri");
   }

   // $FF: renamed from: k () boolean
   public boolean method_29() {
      return this.c("play_enabled_game");
   }

   // $FF: renamed from: l () boolean
   public boolean method_30() {
      return this.b("installed") > 0;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_31() {
      return this.d("package_name");
   }

   // $FF: renamed from: n () int
   public int method_32() {
      return this.b("gameplay_acl_status");
   }

   // $FF: renamed from: o () int
   public int method_33() {
      return this.b("achievement_total_count");
   }

   // $FF: renamed from: p () int
   public int method_34() {
      return this.b("leaderboard_count");
   }

   // $FF: renamed from: q () boolean
   public boolean method_35() {
      return this.b("real_time_support") > 0;
   }

   // $FF: renamed from: r () boolean
   public boolean method_36() {
      return this.b("turn_based_support") > 0;
   }

   // $FF: renamed from: s () com.google.android.gms.games.Game
   public Game method_377() {
      return new GameEntity(this);
   }

   public String toString() {
      return GameEntity.method_249(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      ((GameEntity)this.method_377()).writeToParcel(var1, var2);
   }
}
