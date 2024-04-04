package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.class_40;
import java.util.List;

public class LogicalFilter implements SafeParcelable, class_40 {
   public static final Creator CREATOR = new class_645();
   // $FF: renamed from: a com.google.android.gms.drive.query.internal.Operator
   final Operator field_524;
   // $FF: renamed from: b java.util.List
   final List field_525;
   // $FF: renamed from: c int
   final int field_526;

   LogicalFilter(int var1, Operator var2, List var3) {
      this.field_526 = var1;
      this.field_524 = var2;
      this.field_525 = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_645.method_2077(this, var1, var2);
   }
}
