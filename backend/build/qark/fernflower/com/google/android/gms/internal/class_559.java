package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.bj
public final class class_559 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ca
   public static final class_435 field_1897 = new class_435();
   // $FF: renamed from: b int
   public final int field_1898;
   // $FF: renamed from: c java.lang.String
   public final String field_1899;
   // $FF: renamed from: d java.lang.String
   public final String field_1900;
   // $FF: renamed from: e java.lang.String
   public final String field_1901;
   // $FF: renamed from: f java.lang.String
   public final String field_1902;
   // $FF: renamed from: g java.lang.String
   public final String field_1903;
   // $FF: renamed from: h java.lang.String
   public final String field_1904;
   // $FF: renamed from: i java.lang.String
   public final String field_1905;

   public class_559(int var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      this.field_1898 = var1;
      this.field_1899 = var2;
      this.field_1900 = var3;
      this.field_1901 = var4;
      this.field_1902 = var5;
      this.field_1903 = var6;
      this.field_1904 = var7;
      this.field_1905 = var8;
   }

   public class_559(String var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      this(1, var1, var2, var3, var4, var5, var6, var7);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_435.method_1472(this, var1, var2);
   }
}
