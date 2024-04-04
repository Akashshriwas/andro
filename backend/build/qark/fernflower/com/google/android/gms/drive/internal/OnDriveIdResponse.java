package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse implements SafeParcelable {
   public static final Creator CREATOR = new class_540();
   // $FF: renamed from: a int
   final int field_1609;
   // $FF: renamed from: b com.google.android.gms.drive.DriveId
   DriveId field_1610;

   OnDriveIdResponse(int var1, DriveId var2) {
      this.field_1609 = var1;
      this.field_1610 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_540.method_1823(this, var1, var2);
   }
}
