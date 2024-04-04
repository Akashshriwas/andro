package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.class_343;

public class CreateFolderRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_527();
   // $FF: renamed from: a int
   final int field_783;
   // $FF: renamed from: b com.google.android.gms.drive.DriveId
   final DriveId field_784;
   // $FF: renamed from: c com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_785;

   CreateFolderRequest(int var1, DriveId var2, MetadataBundle var3) {
      this.field_783 = var1;
      this.field_784 = (DriveId)class_343.method_1189(var2);
      this.field_785 = (MetadataBundle)class_343.method_1189(var3);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_527.method_1786(this, var1, var2);
   }
}
