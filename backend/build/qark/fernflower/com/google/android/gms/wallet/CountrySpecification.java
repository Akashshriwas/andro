package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CountrySpecification implements SafeParcelable {
   public static final Creator CREATOR = new class_112();
   // $FF: renamed from: a java.lang.String
   String field_99;
   // $FF: renamed from: b int
   private final int field_100;

   CountrySpecification(int var1, String var2) {
      this.field_100 = var1;
      this.field_99 = var2;
   }

   // $FF: renamed from: a () int
   public int method_290() {
      return this.field_100;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_112.method_356(this, var1, var2);
   }
}
