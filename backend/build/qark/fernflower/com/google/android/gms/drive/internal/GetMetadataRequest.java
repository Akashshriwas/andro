package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_532();
   // $FF: renamed from: a int
   final int field_2028;
   // $FF: renamed from: b com.google.android.gms.drive.DriveId
   final DriveId field_2029;

   GetMetadataRequest(int var1, DriveId var2) {
      this.field_2028 = var1;
      this.field_2029 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_532.method_1806(this, var1, var2);
   }
}
