package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.class_118;

// $FF: renamed from: com.google.android.gms.games.e
public final class class_124 extends class_118 implements Player {
   public class_124(DataHolder var1, int var2) {
      super(var1, var2);
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_378();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_55() {
      return this.d("external_player_id");
   }

   // $FF: renamed from: c () java.lang.String
   public String method_56() {
      return this.d("profile_name");
   }

   // $FF: renamed from: d () android.net.Uri
   public Uri method_57() {
      return this.f("profile_icon_image_uri");
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () android.net.Uri
   public Uri method_58() {
      return this.f("profile_hi_res_image_uri");
   }

   public boolean equals(Object var1) {
      return PlayerEntity.method_229(this, var1);
   }

   // $FF: renamed from: f () long
   public long method_59() {
      return this.a("last_updated");
   }

   // $FF: renamed from: g () com.google.android.gms.games.Player
   public Player method_378() {
      return new PlayerEntity(this);
   }

   public int hashCode() {
      return PlayerEntity.method_228(this);
   }

   public String toString() {
      return PlayerEntity.method_232(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      ((PlayerEntity)this.method_378()).writeToParcel(var1, var2);
   }
}
