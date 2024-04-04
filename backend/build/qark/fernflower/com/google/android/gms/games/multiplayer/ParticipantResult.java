package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_343;
import com.google.android.gms.internal.class_368;

public final class ParticipantResult implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.games.multiplayer.d
   public static final class_500 field_1237 = new class_500();
   // $FF: renamed from: b int
   private final int field_1238;
   // $FF: renamed from: c java.lang.String
   private final String field_1239;
   // $FF: renamed from: d int
   private final int field_1240;
   // $FF: renamed from: e int
   private final int field_1241;

   public ParticipantResult(int var1, String var2, int var3, int var4) {
      this.field_1238 = var1;
      this.field_1239 = (String)class_343.method_1189(var2);
      class_343.method_1192(class_368.method_1275(var3));
      this.field_1240 = var3;
      this.field_1241 = var4;
   }

   public ParticipantResult(String var1, int var2, int var3) {
      this(1, var1, var2, var3);
   }

   // $FF: renamed from: a () int
   public int method_1536() {
      return this.field_1238;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1537() {
      return this.field_1239;
   }

   // $FF: renamed from: c () int
   public int method_1538() {
      return this.field_1240;
   }

   // $FF: renamed from: d () int
   public int method_1539() {
      return this.field_1241;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_500.method_1715(this, var1, var2);
   }
}
