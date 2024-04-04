package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_86;

public final class ParticipantEntity extends class_86 implements Participant {
   public static final Creator CREATOR = new class_499();
   // $FF: renamed from: a int
   private final int field_49;
   // $FF: renamed from: b java.lang.String
   private final String field_50;
   // $FF: renamed from: c java.lang.String
   private final String field_51;
   // $FF: renamed from: d android.net.Uri
   private final Uri field_52;
   // $FF: renamed from: e android.net.Uri
   private final Uri field_53;
   // $FF: renamed from: f int
   private final int field_54;
   // $FF: renamed from: g java.lang.String
   private final String field_55;
   // $FF: renamed from: h boolean
   private final boolean field_56;
   // $FF: renamed from: i com.google.android.gms.games.PlayerEntity
   private final PlayerEntity field_57;
   // $FF: renamed from: j int
   private final int field_58;
   // $FF: renamed from: k com.google.android.gms.games.multiplayer.ParticipantResult
   private final ParticipantResult field_59;

   ParticipantEntity(int var1, String var2, String var3, Uri var4, Uri var5, int var6, String var7, boolean var8, PlayerEntity var9, int var10, ParticipantResult var11) {
      this.field_49 = var1;
      this.field_50 = var2;
      this.field_51 = var3;
      this.field_52 = var4;
      this.field_53 = var5;
      this.field_54 = var6;
      this.field_55 = var7;
      this.field_56 = var8;
      this.field_57 = var9;
      this.field_58 = var10;
      this.field_59 = var11;
   }

   public ParticipantEntity(Participant var1) {
      this.field_49 = 2;
      this.field_50 = var1.method_52();
      this.field_51 = var1.method_49();
      this.field_52 = var1.method_50();
      this.field_53 = var1.method_51();
      this.field_54 = var1.method_45();
      this.field_55 = var1.method_46();
      this.field_56 = var1.method_48();
      Player var2 = var1.method_53();
      PlayerEntity var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = new PlayerEntity(var2);
      }

      this.field_57 = var3;
      this.field_58 = var1.method_47();
      this.field_59 = var1.method_54();
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.Participant) int
   static int method_262(Participant var0) {
      return class_310.method_1033(var0.method_53(), var0.method_45(), var0.method_46(), var0.method_48(), var0.method_49(), var0.method_50(), var0.method_51(), var0.method_47(), var0.method_54());
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.Participant, java.lang.Object) boolean
   static boolean method_263(Participant var0, Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof Participant)) {
         var2 = false;
      } else {
         var2 = var3;
         if (var0 != var1) {
            Participant var4 = (Participant)var1;
            if (class_310.method_1035(var4.method_53(), var0.method_53()) && class_310.method_1035(var4.method_45(), var0.method_45()) && class_310.method_1035(var4.method_46(), var0.method_46()) && class_310.method_1035(var4.method_48(), var0.method_48()) && class_310.method_1035(var4.method_49(), var0.method_49()) && class_310.method_1035(var4.method_50(), var0.method_50()) && class_310.method_1035(var4.method_51(), var0.method_51()) && class_310.method_1035(var4.method_47(), var0.method_47())) {
               var2 = var3;
               if (class_310.method_1035(var4.method_54(), var0.method_54())) {
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
   static boolean method_264(Integer var0) {
      return b(var0);
   }

   // $FF: renamed from: a (java.lang.String) boolean
   // $FF: synthetic method
   static boolean method_265(String var0) {
      return b(var0);
   }

   // $FF: renamed from: b (com.google.android.gms.games.multiplayer.Participant) java.lang.String
   static String method_266(Participant var0) {
      return class_310.method_1034(var0).method_1032("Player", var0.method_53()).method_1032("Status", var0.method_45()).method_1032("ClientAddress", var0.method_46()).method_1032("ConnectedToRoom", var0.method_48()).method_1032("DisplayName", var0.method_49()).method_1032("IconImage", var0.method_50()).method_1032("HiResImage", var0.method_51()).method_1032("Capabilities", var0.method_47()).method_1032("Result", var0.method_54()).toString();
   }

   // $FF: renamed from: n () java.lang.Integer
   // $FF: synthetic method
   static Integer method_267() {
      return w();
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_269();
   }

   // $FF: renamed from: b () int
   public int method_45() {
      return this.field_54;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_46() {
      return this.field_55;
   }

   // $FF: renamed from: d () int
   public int method_47() {
      return this.field_58;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () boolean
   public boolean method_48() {
      return this.field_56;
   }

   public boolean equals(Object var1) {
      return method_263(this, var1);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_49() {
      return this.field_57 == null ? this.field_51 : this.field_57.method_56();
   }

   // $FF: renamed from: g () android.net.Uri
   public Uri method_50() {
      return this.field_57 == null ? this.field_52 : this.field_57.method_57();
   }

   // $FF: renamed from: h () android.net.Uri
   public Uri method_51() {
      return this.field_57 == null ? this.field_53 : this.field_57.method_58();
   }

   public int hashCode() {
      return method_262(this);
   }

   // $FF: renamed from: i () java.lang.String
   public String method_52() {
      return this.field_50;
   }

   // $FF: renamed from: j () com.google.android.gms.games.Player
   public Player method_53() {
      return this.field_57;
   }

   // $FF: renamed from: k () com.google.android.gms.games.multiplayer.ParticipantResult
   public ParticipantResult method_54() {
      return this.field_59;
   }

   // $FF: renamed from: l () int
   public int method_268() {
      return this.field_49;
   }

   // $FF: renamed from: m () com.google.android.gms.games.multiplayer.Participant
   public Participant method_269() {
      return this;
   }

   public String toString() {
      return method_266(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      Object var6 = null;
      byte var4 = 0;
      if (!this.x()) {
         class_498.method_1712(this, var1, var2);
      } else {
         var1.writeString(this.field_50);
         var1.writeString(this.field_51);
         String var5;
         if (this.field_52 == null) {
            var5 = null;
         } else {
            var5 = this.field_52.toString();
         }

         var1.writeString(var5);
         if (this.field_53 == null) {
            var5 = (String)var6;
         } else {
            var5 = this.field_53.toString();
         }

         var1.writeString(var5);
         var1.writeInt(this.field_54);
         var1.writeString(this.field_55);
         byte var3;
         if (this.field_56) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         var1.writeInt(var3);
         if (this.field_57 == null) {
            var3 = var4;
         } else {
            var3 = 1;
         }

         var1.writeInt(var3);
         if (this.field_57 != null) {
            this.field_57.writeToParcel(var1, var2);
            return;
         }
      }

   }
}
