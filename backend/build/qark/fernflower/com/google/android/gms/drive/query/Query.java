package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;

public class Query implements SafeParcelable {
   public static final Creator CREATOR = new class_315();
   // $FF: renamed from: a com.google.android.gms.drive.query.internal.LogicalFilter
   LogicalFilter field_655;
   // $FF: renamed from: b java.lang.String
   String field_656;
   // $FF: renamed from: c int
   final int field_657;

   Query(int var1, LogicalFilter var2, String var3) {
      this.field_657 = var1;
      this.field_655 = var2;
      this.field_656 = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_315.method_1050(this, var1, var2);
   }
}
