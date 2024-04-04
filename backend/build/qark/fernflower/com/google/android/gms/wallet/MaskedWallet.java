package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWallet implements SafeParcelable {
   public static final Creator CREATOR = new class_93();
   // $FF: renamed from: a java.lang.String
   String field_787;
   // $FF: renamed from: b java.lang.String
   String field_788;
   // $FF: renamed from: c java.lang.String[]
   String[] field_789;
   // $FF: renamed from: d java.lang.String
   String field_790;
   // $FF: renamed from: e com.google.android.gms.wallet.Address
   Address field_791;
   // $FF: renamed from: f com.google.android.gms.wallet.Address
   Address field_792;
   // $FF: renamed from: g com.google.android.gms.wallet.LoyaltyWalletObject[]
   LoyaltyWalletObject[] field_793;
   // $FF: renamed from: h com.google.android.gms.wallet.OfferWalletObject[]
   OfferWalletObject[] field_794;
   // $FF: renamed from: i int
   private final int field_795;

   MaskedWallet() {
      this.field_795 = 2;
   }

   MaskedWallet(int var1, String var2, String var3, String[] var4, String var5, Address var6, Address var7, LoyaltyWalletObject[] var8, OfferWalletObject[] var9) {
      this.field_795 = var1;
      this.field_787 = var2;
      this.field_788 = var3;
      this.field_789 = var4;
      this.field_790 = var5;
      this.field_791 = var6;
      this.field_792 = var7;
      this.field_793 = var8;
      this.field_794 = var9;
   }

   // $FF: renamed from: a () int
   public int method_993() {
      return this.field_795;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_93.method_292(this, var1, var2);
   }
}
