package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_86;
import java.util.ArrayList;

public final class RoomEntity extends class_86 implements Room {
   public static final Creator CREATOR = new class_586();
   // $FF: renamed from: a int
   private final int field_39;
   // $FF: renamed from: b java.lang.String
   private final String field_40;
   // $FF: renamed from: c java.lang.String
   private final String field_41;
   // $FF: renamed from: d long
   private final long field_42;
   // $FF: renamed from: e int
   private final int field_43;
   // $FF: renamed from: f java.lang.String
   private final String field_44;
   // $FF: renamed from: g int
   private final int field_45;
   // $FF: renamed from: h android.os.Bundle
   private final Bundle field_46;
   // $FF: renamed from: i java.util.ArrayList
   private final ArrayList field_47;
   // $FF: renamed from: j int
   private final int field_48;

   RoomEntity(int var1, String var2, String var3, long var4, int var6, String var7, int var8, Bundle var9, ArrayList var10, int var11) {
      this.field_39 = var1;
      this.field_40 = var2;
      this.field_41 = var3;
      this.field_42 = var4;
      this.field_43 = var6;
      this.field_44 = var7;
      this.field_45 = var8;
      this.field_46 = var9;
      this.field_47 = var10;
      this.field_48 = var11;
   }

   public RoomEntity(Room var1) {
      this.field_39 = 2;
      this.field_40 = var1.method_37();
      this.field_41 = var1.method_38();
      this.field_42 = var1.method_39();
      this.field_43 = var1.method_40();
      this.field_44 = var1.method_41();
      this.field_45 = var1.method_42();
      this.field_46 = var1.method_43();
      ArrayList var4 = var1.i();
      int var3 = var4.size();
      this.field_47 = new ArrayList(var3);

      for(int var2 = 0; var2 < var3; ++var2) {
         this.field_47.add((ParticipantEntity)((Participant)var4.get(var2)).a());
      }

      this.field_48 = var1.method_44();
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.realtime.Room) int
   static int method_253(Room var0) {
      return class_310.method_1033(var0.method_37(), var0.method_38(), var0.method_39(), var0.method_40(), var0.method_41(), var0.method_42(), var0.method_43(), var0.i(), var0.method_44());
   }

   // $FF: renamed from: a (com.google.android.gms.games.multiplayer.realtime.Room, java.lang.Object) boolean
   static boolean method_254(Room var0, Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof Room)) {
         var2 = false;
      } else {
         var2 = var3;
         if (var0 != var1) {
            Room var4 = (Room)var1;
            if (class_310.method_1035(var4.method_37(), var0.method_37()) && class_310.method_1035(var4.method_38(), var0.method_38()) && class_310.method_1035(var4.method_39(), var0.method_39()) && class_310.method_1035(var4.method_40(), var0.method_40()) && class_310.method_1035(var4.method_41(), var0.method_41()) && class_310.method_1035(var4.method_42(), var0.method_42()) && class_310.method_1035(var4.method_43(), var0.method_43()) && class_310.method_1035(var4.i(), var0.i())) {
               var2 = var3;
               if (class_310.method_1035(var4.method_44(), var0.method_44())) {
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
   static boolean method_255(Integer var0) {
      return b(var0);
   }

   // $FF: renamed from: a (java.lang.String) boolean
   // $FF: synthetic method
   static boolean method_256(String var0) {
      return b(var0);
   }

   // $FF: renamed from: b (com.google.android.gms.games.multiplayer.realtime.Room) java.lang.String
   static String method_257(Room var0) {
      return class_310.method_1034(var0).method_1032("RoomId", var0.method_37()).method_1032("CreatorId", var0.method_38()).method_1032("CreationTimestamp", var0.method_39()).method_1032("RoomStatus", var0.method_40()).method_1032("Description", var0.method_41()).method_1032("Variant", var0.method_42()).method_1032("AutoMatchCriteria", var0.method_43()).method_1032("Participants", var0.i()).method_1032("AutoMatchWaitEstimateSeconds", var0.method_44()).toString();
   }

   // $FF: renamed from: m () java.lang.Integer
   // $FF: synthetic method
   static Integer method_258() {
      return w();
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_261();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_37() {
      return this.field_40;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_38() {
      return this.field_41;
   }

   // $FF: renamed from: d () long
   public long method_39() {
      return this.field_42;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () int
   public int method_40() {
      return this.field_43;
   }

   public boolean equals(Object var1) {
      return method_254(this, var1);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_41() {
      return this.field_44;
   }

   // $FF: renamed from: g () int
   public int method_42() {
      return this.field_45;
   }

   // $FF: renamed from: h () android.os.Bundle
   public Bundle method_43() {
      return this.field_46;
   }

   public int hashCode() {
      return method_253(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_259() {
      return new ArrayList(this.field_47);
   }

   // $FF: renamed from: j () int
   public int method_44() {
      return this.field_48;
   }

   // $FF: renamed from: k () int
   public int method_260() {
      return this.field_39;
   }

   // $FF: renamed from: l () com.google.android.gms.games.multiplayer.realtime.Room
   public Room method_261() {
      return this;
   }

   public String toString() {
      return method_257(this);
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (!this.x()) {
         class_585.method_1903(this, var1, var2);
      } else {
         var1.writeString(this.field_40);
         var1.writeString(this.field_41);
         var1.writeLong(this.field_42);
         var1.writeInt(this.field_43);
         var1.writeString(this.field_44);
         var1.writeInt(this.field_45);
         var1.writeBundle(this.field_46);
         int var4 = this.field_47.size();
         var1.writeInt(var4);

         for(int var3 = 0; var3 < var4; ++var3) {
            ((ParticipantEntity)this.field_47.get(var3)).writeToParcel(var1, var2);
         }
      }

   }
}
