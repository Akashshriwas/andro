package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_523();
   // $FF: renamed from: a int
   final int field_167;
   // $FF: renamed from: b com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_168;
   // $FF: renamed from: c int
   final int field_169;
   // $FF: renamed from: d java.lang.String
   final String field_170;
   // $FF: renamed from: e com.google.android.gms.drive.DriveId
   final DriveId field_171;

   CreateFileIntentSenderRequest(int var1, MetadataBundle var2, int var3, String var4, DriveId var5) {
      this.field_167 = var1;
      this.field_168 = var2;
      this.field_169 = var3;
      this.field_170 = var4;
      this.field_171 = var5;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_523.method_1777(this, var1, var2);
   }
}
