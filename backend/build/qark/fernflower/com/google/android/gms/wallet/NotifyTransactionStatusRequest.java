package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class NotifyTransactionStatusRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_97();
   // $FF: renamed from: a int
   final int field_1991;
   // $FF: renamed from: b java.lang.String
   String field_1992;
   // $FF: renamed from: c int
   int field_1993;
   // $FF: renamed from: d java.lang.String
   String field_1994;

   NotifyTransactionStatusRequest() {
      this.field_1991 = 1;
   }

   NotifyTransactionStatusRequest(int var1, String var2, int var3, String var4) {
      this.field_1991 = var1;
      this.field_1992 = var2;
      this.field_1993 = var3;
      this.field_1994 = var4;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_97.method_298(this, var1, var2);
   }
}
