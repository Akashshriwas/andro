package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class OfferWalletObject implements SafeParcelable {
   public static final Creator CREATOR = new class_99();
   // $FF: renamed from: a java.lang.String
   String field_975;
   // $FF: renamed from: b java.lang.String
   String field_976;
   // $FF: renamed from: c int
   private final int field_977;

   OfferWalletObject() {
      this.field_977 = 2;
   }

   OfferWalletObject(int var1, String var2, String var3) {
      this.field_977 = var1;
      this.field_975 = var2;
      this.field_976 = var3;
   }

   // $FF: renamed from: a () int
   public int method_1211() {
      return this.field_977;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_99.method_304(this, var1, var2);
   }
}
