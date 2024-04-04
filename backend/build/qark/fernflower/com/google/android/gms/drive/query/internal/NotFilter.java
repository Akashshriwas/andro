package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.class_40;

public class NotFilter implements SafeParcelable, class_40 {
   public static final Creator CREATOR = new class_644();
   // $FF: renamed from: a com.google.android.gms.drive.query.internal.FilterHolder
   final FilterHolder field_117;
   // $FF: renamed from: b int
   final int field_118;

   NotFilter(int var1, FilterHolder var2) {
      this.field_118 = var1;
      this.field_117 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_644.method_2074(this, var1, var2);
   }
}
