package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.class_343;

public class CreateFileRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_529();
   // $FF: renamed from: a int
   final int field_1598;
   // $FF: renamed from: b com.google.android.gms.drive.DriveId
   final DriveId field_1599;
   // $FF: renamed from: c com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_1600;
   // $FF: renamed from: d com.google.android.gms.drive.Contents
   final Contents field_1601;

   CreateFileRequest(int var1, DriveId var2, MetadataBundle var3, Contents var4) {
      this.field_1598 = var1;
      this.field_1599 = (DriveId)class_343.method_1189(var2);
      this.field_1600 = (MetadataBundle)class_343.method_1189(var3);
      this.field_1601 = (Contents)class_343.method_1189(var4);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_529.method_1791(this, var1, var2);
   }
}
