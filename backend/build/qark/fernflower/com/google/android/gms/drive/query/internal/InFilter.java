package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.class_217;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.class_40;

public class InFilter implements SafeParcelable, class_40 {
   // $FF: renamed from: a com.google.android.gms.drive.query.internal.e
   public static final class_642 field_728 = new class_642();
   // $FF: renamed from: b com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_729;
   // $FF: renamed from: c int
   final int field_730;
   // $FF: renamed from: d com.google.android.gms.drive.metadata.a
   private final class_217 field_731;

   InFilter(int var1, MetadataBundle var2) {
      this.field_730 = var1;
      this.field_729 = var2;
      this.field_731 = (class_217)class_643.method_2073(var2);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_642.method_2070(this, var1, var2);
   }
}
