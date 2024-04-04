package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWalletRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_95();
   // $FF: renamed from: a java.lang.String
   String field_988;
   // $FF: renamed from: b boolean
   boolean field_989;
   // $FF: renamed from: c boolean
   boolean field_990;
   // $FF: renamed from: d boolean
   boolean field_991;
   // $FF: renamed from: e java.lang.String
   String field_992;
   // $FF: renamed from: f java.lang.String
   String field_993;
   // $FF: renamed from: g java.lang.String
   String field_994;
   // $FF: renamed from: h com.google.android.gms.wallet.Cart
   Cart field_995;
   // $FF: renamed from: i boolean
   boolean field_996;
   // $FF: renamed from: j boolean
   boolean field_997;
   // $FF: renamed from: k com.google.android.gms.wallet.CountrySpecification[]
   CountrySpecification[] field_998;
   // $FF: renamed from: l boolean
   boolean field_999;
   // $FF: renamed from: m boolean
   boolean field_1000;
   // $FF: renamed from: n int
   private final int field_1001;

   MaskedWalletRequest() {
      this.field_1001 = 3;
      this.field_999 = true;
      this.field_1000 = true;
   }

   MaskedWalletRequest(int var1, String var2, boolean var3, boolean var4, boolean var5, String var6, String var7, String var8, Cart var9, boolean var10, boolean var11, CountrySpecification[] var12, boolean var13, boolean var14) {
      this.field_1001 = var1;
      this.field_988 = var2;
      this.field_989 = var3;
      this.field_990 = var4;
      this.field_991 = var5;
      this.field_992 = var6;
      this.field_993 = var7;
      this.field_994 = var8;
      this.field_995 = var9;
      this.field_996 = var10;
      this.field_997 = var11;
      this.field_998 = var12;
      this.field_999 = var13;
      this.field_1000 = var14;
   }

   // $FF: renamed from: a () int
   public int method_1276() {
      return this.field_1001;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_95.method_295(this, var1, var2);
   }
}
