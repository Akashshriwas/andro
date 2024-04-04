package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_86;

public final class GameEntity extends class_86 implements Game {
   public static final Creator CREATOR = new class_117();
   // $FF: renamed from: a int
   private final int field_21;
   // $FF: renamed from: b java.lang.String
   private final String field_22;
   // $FF: renamed from: c java.lang.String
   private final String field_23;
   // $FF: renamed from: d java.lang.String
   private final String field_24;
   // $FF: renamed from: e java.lang.String
   private final String field_25;
   // $FF: renamed from: f java.lang.String
   private final String field_26;
   // $FF: renamed from: g java.lang.String
   private final String field_27;
   // $FF: renamed from: h android.net.Uri
   private final Uri field_28;
   // $FF: renamed from: i android.net.Uri
   private final Uri field_29;
   // $FF: renamed from: j android.net.Uri
   private final Uri field_30;
   // $FF: renamed from: k boolean
   private final boolean field_31;
   // $FF: renamed from: l boolean
   private final boolean field_32;
   // $FF: renamed from: m java.lang.String
   private final String field_33;
   // $FF: renamed from: n int
   private final int field_34;
   // $FF: renamed from: o int
   private final int field_35;
   // $FF: renamed from: p int
   private final int field_36;
   // $FF: renamed from: q boolean
   private final boolean field_37;
   // $FF: renamed from: r boolean
   private final boolean field_38;

   GameEntity(int var1, String var2, String var3, String var4, String var5, String var6, String var7, Uri var8, Uri var9, Uri var10, boolean var11, boolean var12, String var13, int var14, int var15, int var16, boolean var17, boolean var18) {
      this.field_21 = var1;
      this.field_22 = var2;
      this.field_23 = var3;
      this.field_24 = var4;
      this.field_25 = var5;
      this.field_26 = var6;
      this.field_27 = var7;
      this.field_28 = var8;
      this.field_29 = var9;
      this.field_30 = var10;
      this.field_31 = var11;
      this.field_32 = var12;
      this.field_33 = var13;
      this.field_34 = var14;
      this.field_35 = var15;
      this.field_36 = var16;
      this.field_37 = var17;
      this.field_38 = var18;
   }

   public GameEntity(Game var1) {
      this.field_21 = 2;
      this.field_22 = var1.method_20();
      this.field_24 = var1.method_22();
      this.field_25 = var1.method_23();
      this.field_26 = var1.method_24();
      this.field_27 = var1.method_25();
      this.field_23 = var1.method_21();
      this.field_28 = var1.method_26();
      this.field_29 = var1.method_27();
      this.field_30 = var1.method_28();
      this.field_31 = var1.method_29();
      this.field_32 = var1.method_30();
      this.field_33 = var1.method_31();
      this.field_34 = var1.method_32();
      this.field_35 = var1.method_33();
      this.field_36 = var1.method_34();
      this.field_37 = var1.method_35();
      this.field_38 = var1.method_36();
   }

   // $FF: renamed from: a (com.google.android.gms.games.Game) int
   static int method_245(Game var0) {
      return class_310.method_1033(var0.method_20(), var0.method_21(), var0.method_22(), var0.method_23(), var0.method_24(), var0.method_25(), var0.method_26(), var0.method_27(), var0.method_28(), var0.method_29(), var0.method_30(), var0.method_31(), var0.method_32(), var0.method_33(), var0.method_34(), var0.method_35(), var0.method_36());
   }

   // $FF: renamed from: a (com.google.android.gms.games.Game, java.lang.Object) boolean
   static boolean method_246(Game var0, Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof Game)) {
         var2 = false;
      } else {
         var2 = var3;
         if (var0 != var1) {
            Game var4 = (Game)var1;
            if (class_310.method_1035(var4.method_20(), var0.method_20()) && class_310.method_1035(var4.method_21(), var0.method_21()) && class_310.method_1035(var4.method_22(), var0.method_22()) && class_310.method_1035(var4.method_23(), var0.method_23()) && class_310.method_1035(var4.method_24(), var0.method_24()) && class_310.method_1035(var4.method_25(), var0.method_25()) && class_310.method_1035(var4.method_26(), var0.method_26()) && class_310.method_1035(var4.method_27(), var0.method_27()) && class_310.method_1035(var4.method_28(), var0.method_28()) && class_310.method_1035(var4.method_29(), var0.method_29()) && class_310.method_1035(var4.method_30(), var0.method_30()) && class_310.method_1035(var4.method_31(), var0.method_31()) && class_310.method_1035(var4.method_32(), var0.method_32()) && class_310.method_1035(var4.method_33(), var0.method_33()) && class_310.method_1035(var4.method_34(), var0.method_34()) && class_310.method_1035(var4.method_35(), var0.method_35())) {
               var2 = var3;
               if (class_310.method_1035(var4.method_36(), var0.method_36())) {
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
   static boolean method_247(Integer var0) {
      return b(var0);
   }

   // $FF: renamed from: a (java.lang.String) boolean
   // $FF: synthetic method
   static boolean method_248(String var0) {
      return b(var0);
   }

   // $FF: renamed from: b (com.google.android.gms.games.Game) java.lang.String
   static String method_249(Game var0) {
      return class_310.method_1034(var0).method_1032("ApplicationId", var0.method_20()).method_1032("DisplayName", var0.method_21()).method_1032("PrimaryCategory", var0.method_22()).method_1032("SecondaryCategory", var0.method_23()).method_1032("Description", var0.method_24()).method_1032("DeveloperName", var0.method_25()).method_1032("IconImageUri", var0.method_26()).method_1032("HiResImageUri", var0.method_27()).method_1032("FeaturedImageUri", var0.method_28()).method_1032("PlayEnabledGame", var0.method_29()).method_1032("InstanceInstalled", var0.method_30()).method_1032("InstancePackageName", var0.method_31()).method_1032("GameplayAclStatus", var0.method_32()).method_1032("AchievementTotalCount", var0.method_33()).method_1032("LeaderboardCount", var0.method_34()).method_1032("RealTimeMultiplayerEnabled", var0.method_35()).method_1032("TurnBasedMultiplayerEnabled", var0.method_36()).toString();
   }

   // $FF: renamed from: u () java.lang.Integer
   // $FF: synthetic method
   static Integer method_250() {
      return w();
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_252();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_20() {
      return this.field_22;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_21() {
      return this.field_23;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_22() {
      return this.field_24;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_23() {
      return this.field_25;
   }

   public boolean equals(Object var1) {
      return method_246(this, var1);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_24() {
      return this.field_26;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_25() {
      return this.field_27;
   }

   // $FF: renamed from: h () android.net.Uri
   public Uri method_26() {
      return this.field_28;
   }

   public int hashCode() {
      return method_245(this);
   }

   // $FF: renamed from: i () android.net.Uri
   public Uri method_27() {
      return this.field_29;
   }

   // $FF: renamed from: j () android.net.Uri
   public Uri method_28() {
      return this.field_30;
   }

   // $FF: renamed from: k () boolean
   public boolean method_29() {
      return this.field_31;
   }

   // $FF: renamed from: l () boolean
   public boolean method_30() {
      return this.field_32;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_31() {
      return this.field_33;
   }

   // $FF: renamed from: n () int
   public int method_32() {
      return this.field_34;
   }

   // $FF: renamed from: o () int
   public int method_33() {
      return this.field_35;
   }

   // $FF: renamed from: p () int
   public int method_34() {
      return this.field_36;
   }

   // $FF: renamed from: q () boolean
   public boolean method_35() {
      return this.field_37;
   }

   // $FF: renamed from: r () boolean
   public boolean method_36() {
      return this.field_38;
   }

   // $FF: renamed from: s () int
   public int method_251() {
      return this.field_21;
   }

   // $FF: renamed from: t () com.google.android.gms.games.Game
   public Game method_252() {
      return this;
   }

   public String toString() {
      return method_249(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      byte var3 = 1;
      Object var5 = null;
      if (!this.x()) {
         class_116.method_361(this, var1, var2);
      } else {
         var1.writeString(this.field_22);
         var1.writeString(this.field_23);
         var1.writeString(this.field_24);
         var1.writeString(this.field_25);
         var1.writeString(this.field_26);
         var1.writeString(this.field_27);
         String var4;
         if (this.field_28 == null) {
            var4 = null;
         } else {
            var4 = this.field_28.toString();
         }

         var1.writeString(var4);
         if (this.field_29 == null) {
            var4 = null;
         } else {
            var4 = this.field_29.toString();
         }

         var1.writeString(var4);
         if (this.field_30 == null) {
            var4 = (String)var5;
         } else {
            var4 = this.field_30.toString();
         }

         var1.writeString(var4);
         byte var6;
         if (this.field_31) {
            var6 = 1;
         } else {
            var6 = 0;
         }

         var1.writeInt(var6);
         if (this.field_32) {
            var6 = var3;
         } else {
            var6 = 0;
         }

         var1.writeInt(var6);
         var1.writeString(this.field_33);
         var1.writeInt(this.field_34);
         var1.writeInt(this.field_35);
         var1.writeInt(this.field_36);
      }
   }
}
