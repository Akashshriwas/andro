package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_495;
import com.google.android.gms.internal.class_86;

public final class PlayerEntity extends class_86 implements Player {
   public static final Creator CREATOR = new class_126();
   // $FF: renamed from: a int
   private final int field_7;
   // $FF: renamed from: b java.lang.String
   private final String field_8;
   // $FF: renamed from: c java.lang.String
   private final String field_9;
   // $FF: renamed from: d android.net.Uri
   private final Uri field_10;
   // $FF: renamed from: e android.net.Uri
   private final Uri field_11;
   // $FF: renamed from: f long
   private final long field_12;

   PlayerEntity(int var1, String var2, String var3, Uri var4, Uri var5, long var6) {
      this.field_7 = var1;
      this.field_8 = var2;
      this.field_9 = var3;
      this.field_10 = var4;
      this.field_11 = var5;
      this.field_12 = var6;
   }

   public PlayerEntity(Player var1) {
      boolean var2 = true;
      super();
      this.field_7 = 1;
      this.field_8 = var1.method_55();
      this.field_9 = var1.method_56();
      this.field_10 = var1.method_57();
      this.field_11 = var1.method_58();
      this.field_12 = var1.method_59();
      class_495.method_1705(this.field_8);
      class_495.method_1705(this.field_9);
      if (this.field_12 <= 0L) {
         var2 = false;
      }

      class_495.method_1707(var2);
   }

   // $FF: renamed from: a (com.google.android.gms.games.Player) int
   static int method_228(Player var0) {
      return class_310.method_1033(var0.method_55(), var0.method_56(), var0.method_57(), var0.method_58(), var0.method_59());
   }

   // $FF: renamed from: a (com.google.android.gms.games.Player, java.lang.Object) boolean
   static boolean method_229(Player var0, Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof Player)) {
         var2 = false;
      } else {
         var2 = var3;
         if (var0 != var1) {
            Player var4 = (Player)var1;
            if (class_310.method_1035(var4.method_55(), var0.method_55()) && class_310.method_1035(var4.method_56(), var0.method_56()) && class_310.method_1035(var4.method_57(), var0.method_57()) && class_310.method_1035(var4.method_58(), var0.method_58())) {
               var2 = var3;
               if (class_310.method_1035(var4.method_59(), var0.method_59())) {
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
   static boolean method_230(Integer var0) {
      return b(var0);
   }

   // $FF: renamed from: a (java.lang.String) boolean
   // $FF: synthetic method
   static boolean method_231(String var0) {
      return b(var0);
   }

   // $FF: renamed from: b (com.google.android.gms.games.Player) java.lang.String
   static String method_232(Player var0) {
      return class_310.method_1034(var0).method_1032("PlayerId", var0.method_55()).method_1032("DisplayName", var0.method_56()).method_1032("IconImageUri", var0.method_57()).method_1032("HiResImageUri", var0.method_58()).method_1032("RetrievedTimestamp", var0.method_59()).toString();
   }

   // $FF: renamed from: i () java.lang.Integer
   // $FF: synthetic method
   static Integer method_233() {
      return w();
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_235();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_55() {
      return this.field_8;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_56() {
      return this.field_9;
   }

   // $FF: renamed from: d () android.net.Uri
   public Uri method_57() {
      return this.field_10;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () android.net.Uri
   public Uri method_58() {
      return this.field_11;
   }

   public boolean equals(Object var1) {
      return method_229(this, var1);
   }

   // $FF: renamed from: f () long
   public long method_59() {
      return this.field_12;
   }

   // $FF: renamed from: g () int
   public int method_234() {
      return this.field_7;
   }

   // $FF: renamed from: h () com.google.android.gms.games.Player
   public Player method_235() {
      return this;
   }

   public int hashCode() {
      return method_228(this);
   }

   public String toString() {
      return method_232(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      Object var4 = null;
      if (!this.x()) {
         class_125.method_379(this, var1, var2);
      } else {
         var1.writeString(this.field_8);
         var1.writeString(this.field_9);
         String var3;
         if (this.field_10 == null) {
            var3 = null;
         } else {
            var3 = this.field_10.toString();
         }

         var1.writeString(var3);
         if (this.field_11 == null) {
            var3 = (String)var4;
         } else {
            var3 = this.field_11.toString();
         }

         var1.writeString(var3);
         var1.writeLong(this.field_12);
      }
   }
}
