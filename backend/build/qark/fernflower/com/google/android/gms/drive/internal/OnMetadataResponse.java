package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse implements SafeParcelable {
   public static final Creator CREATOR = new class_543();
   // $FF: renamed from: a int
   final int field_2037;
   // $FF: renamed from: b com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_2038;

   OnMetadataResponse(int var1, MetadataBundle var2) {
      this.field_2037 = var1;
      this.field_2038 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_543.method_1829(this, var1, var2);
   }
}
