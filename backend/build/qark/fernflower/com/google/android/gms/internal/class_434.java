package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// $FF: renamed from: com.google.android.gms.internal.cb
public final class class_434 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.do
   public static final class_442 field_1168 = new class_442();
   // $FF: renamed from: b int
   public final int field_1169;
   // $FF: renamed from: c java.lang.String
   public final String field_1170;
   // $FF: renamed from: d java.lang.String
   public final String field_1171;
   // $FF: renamed from: e java.util.List
   public final List field_1172;
   // $FF: renamed from: f int
   public final int field_1173;
   // $FF: renamed from: g java.util.List
   public final List field_1174;
   // $FF: renamed from: h long
   public final long field_1175;
   // $FF: renamed from: i boolean
   public final boolean field_1176;
   // $FF: renamed from: j long
   public final long field_1177;
   // $FF: renamed from: k java.util.List
   public final List field_1178;
   // $FF: renamed from: l long
   public final long field_1179;
   // $FF: renamed from: m int
   public final int field_1180;
   // $FF: renamed from: n java.lang.String
   public final String field_1181;

   public class_434(int var1) {
      this(2, (String)null, (String)null, (List)null, var1, (List)null, -1L, false, -1L, (List)null, -1L, -1, (String)null);
   }

   class_434(int var1, String var2, String var3, List var4, int var5, List var6, long var7, boolean var9, long var10, List var12, long var13, int var15, String var16) {
      this.field_1169 = var1;
      this.field_1170 = var2;
      this.field_1171 = var3;
      List var17;
      if (var4 != null) {
         var17 = Collections.unmodifiableList(var4);
      } else {
         var17 = null;
      }

      this.field_1172 = var17;
      this.field_1173 = var5;
      if (var6 != null) {
         var17 = Collections.unmodifiableList(var6);
      } else {
         var17 = null;
      }

      this.field_1174 = var17;
      this.field_1175 = var7;
      this.field_1176 = var9;
      this.field_1177 = var10;
      if (var12 != null) {
         var17 = Collections.unmodifiableList(var12);
      } else {
         var17 = null;
      }

      this.field_1178 = var17;
      this.field_1179 = var13;
      this.field_1180 = var15;
      this.field_1181 = var16;
   }

   public class_434(String var1, String var2, List var3, List var4, long var5, boolean var7, long var8, List var10, long var11, int var13, String var14) {
      this(2, var1, var2, var3, -2, var4, var5, var7, var8, var10, var11, var13, var14);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_442.method_1494(this, var1, var2);
   }
}
