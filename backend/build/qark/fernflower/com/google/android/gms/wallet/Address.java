package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Address implements SafeParcelable {
   public static final Creator CREATOR = new class_107();
   // $FF: renamed from: a java.lang.String
   String field_963;
   // $FF: renamed from: b java.lang.String
   String field_964;
   // $FF: renamed from: c java.lang.String
   String field_965;
   // $FF: renamed from: d java.lang.String
   String field_966;
   // $FF: renamed from: e java.lang.String
   String field_967;
   // $FF: renamed from: f java.lang.String
   String field_968;
   // $FF: renamed from: g java.lang.String
   String field_969;
   // $FF: renamed from: h java.lang.String
   String field_970;
   // $FF: renamed from: i java.lang.String
   String field_971;
   // $FF: renamed from: j boolean
   boolean field_972;
   // $FF: renamed from: k java.lang.String
   String field_973;
   // $FF: renamed from: l int
   private final int field_974;

   Address() {
      this.field_974 = 1;
   }

   Address(int var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, boolean var11, String var12) {
      this.field_974 = var1;
      this.field_963 = var2;
      this.field_964 = var3;
      this.field_965 = var4;
      this.field_966 = var5;
      this.field_967 = var6;
      this.field_968 = var7;
      this.field_969 = var8;
      this.field_970 = var9;
      this.field_971 = var10;
      this.field_972 = var11;
      this.field_973 = var12;
   }

   // $FF: renamed from: a () int
   public int method_1188() {
      return this.field_974;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_107.method_337(this, var1, var2);
   }
}
