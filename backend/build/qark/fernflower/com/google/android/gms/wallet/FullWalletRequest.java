package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_102();
   // $FF: renamed from: a java.lang.String
   String field_2219;
   // $FF: renamed from: b java.lang.String
   String field_2220;
   // $FF: renamed from: c com.google.android.gms.wallet.Cart
   Cart field_2221;
   // $FF: renamed from: d int
   private final int field_2222;

   FullWalletRequest() {
      this.field_2222 = 1;
   }

   FullWalletRequest(int var1, String var2, String var3, Cart var4) {
      this.field_2222 = var1;
      this.field_2219 = var2;
      this.field_2220 = var3;
      this.field_2221 = var4;
   }

   // $FF: renamed from: a () int
   public int method_2154() {
      return this.field_2222;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_102.method_326(this, var1, var2);
   }
}
