package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LoyaltyWalletObject implements SafeParcelable {
   public static final Creator CREATOR = new class_104();
   // $FF: renamed from: a java.lang.String
   String field_494;
   // $FF: renamed from: b java.lang.String
   String field_495;
   // $FF: renamed from: c java.lang.String
   String field_496;
   // $FF: renamed from: d java.lang.String
   String field_497;
   // $FF: renamed from: e java.lang.String
   String field_498;
   // $FF: renamed from: f java.lang.String
   String field_499;
   // $FF: renamed from: g java.lang.String
   String field_500;
   // $FF: renamed from: h java.lang.String
   String field_501;
   // $FF: renamed from: i int
   private final int field_502;

   LoyaltyWalletObject() {
      this.field_502 = 3;
   }

   LoyaltyWalletObject(int var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9) {
      this.field_502 = var1;
      this.field_494 = var2;
      this.field_495 = var3;
      this.field_496 = var4;
      this.field_497 = var5;
      this.field_498 = var6;
      this.field_499 = var7;
      this.field_500 = var8;
      this.field_501 = var9;
   }

   // $FF: renamed from: a () int
   public int method_669() {
      return this.field_502;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_104.method_332(this, var1, var2);
   }
}
