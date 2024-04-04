package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_545();
   // $FF: renamed from: a int
   final int field_1215;
   // $FF: renamed from: b com.google.android.gms.drive.query.Query
   final Query field_1216;

   QueryRequest(int var1, Query var2) {
      this.field_1215 = var1;
      this.field_1216 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_545.method_1832(this, var1, var2);
   }
}
