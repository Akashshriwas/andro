package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class UpdateMetadataRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_581();
   // $FF: renamed from: a int
   final int field_1104;
   // $FF: renamed from: b com.google.android.gms.drive.DriveId
   final DriveId field_1105;
   // $FF: renamed from: c com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_1106;

   UpdateMetadataRequest(int var1, DriveId var2, MetadataBundle var3) {
      this.field_1104 = var1;
      this.field_1105 = var2;
      this.field_1106 = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_581.method_1889(this, var1, var2);
   }
}
