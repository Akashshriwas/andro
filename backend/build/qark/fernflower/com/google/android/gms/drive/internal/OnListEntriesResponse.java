package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnListEntriesResponse implements SafeParcelable {
   public static final Creator CREATOR = new class_538();
   // $FF: renamed from: a int
   final int field_2154;
   // $FF: renamed from: b com.google.android.gms.common.data.DataHolder
   final DataHolder field_2155;

   OnListEntriesResponse(int var1, DataHolder var2) {
      this.field_2154 = var1;
      this.field_2155 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_538.method_1818(this, var1, var2);
   }
}
