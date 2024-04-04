package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWallet implements SafeParcelable {
   public static final Creator CREATOR = new class_101();
   // $FF: renamed from: a java.lang.String
   String field_678;
   // $FF: renamed from: b java.lang.String
   String field_679;
   // $FF: renamed from: c com.google.android.gms.wallet.ProxyCard
   ProxyCard field_680;
   // $FF: renamed from: d java.lang.String
   String field_681;
   // $FF: renamed from: e com.google.android.gms.wallet.Address
   Address field_682;
   // $FF: renamed from: f com.google.android.gms.wallet.Address
   Address field_683;
   // $FF: renamed from: g java.lang.String[]
   String[] field_684;
   // $FF: renamed from: h int
   private final int field_685;

   FullWallet() {
      this.field_685 = 1;
   }

   FullWallet(int var1, String var2, String var3, ProxyCard var4, String var5, Address var6, Address var7, String[] var8) {
      this.field_685 = var1;
      this.field_678 = var2;
      this.field_679 = var3;
      this.field_680 = var4;
      this.field_681 = var5;
      this.field_682 = var6;
      this.field_683 = var7;
      this.field_684 = var8;
   }

   // $FF: renamed from: a () int
   public int method_824() {
      return this.field_685;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_101.method_323(this, var1, var2);
   }
}
