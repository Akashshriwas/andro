package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.class_40;

public class FilterHolder implements SafeParcelable {
   public static final Creator CREATOR = new class_651();
   // $FF: renamed from: a int
   final int field_366;
   // $FF: renamed from: b com.google.android.gms.drive.query.internal.ComparisonFilter
   final ComparisonFilter field_367;
   // $FF: renamed from: c com.google.android.gms.drive.query.internal.FieldOnlyFilter
   final FieldOnlyFilter field_368;
   // $FF: renamed from: d com.google.android.gms.drive.query.internal.LogicalFilter
   final LogicalFilter field_369;
   // $FF: renamed from: e com.google.android.gms.drive.query.internal.NotFilter
   final NotFilter field_370;
   // $FF: renamed from: f com.google.android.gms.drive.query.internal.InFilter
   final InFilter field_371;
   // $FF: renamed from: g com.google.android.gms.drive.query.a
   private final class_40 field_372;

   FilterHolder(int var1, ComparisonFilter var2, FieldOnlyFilter var3, LogicalFilter var4, NotFilter var5, InFilter var6) {
      this.field_366 = var1;
      this.field_367 = var2;
      this.field_368 = var3;
      this.field_369 = var4;
      this.field_370 = var5;
      this.field_371 = var6;
      if (this.field_367 != null) {
         this.field_372 = this.field_367;
      } else if (this.field_368 != null) {
         this.field_372 = this.field_368;
      } else if (this.field_369 != null) {
         this.field_372 = this.field_369;
      } else if (this.field_370 != null) {
         this.field_372 = this.field_370;
      } else if (this.field_371 != null) {
         this.field_372 = this.field_371;
      } else {
         throw new IllegalArgumentException("At least one filter must be set.");
      }
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_651.method_2122(this, var1, var2);
   }
}
