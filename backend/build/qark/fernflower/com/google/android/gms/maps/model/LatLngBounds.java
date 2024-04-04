package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_343;
import com.google.android.gms.maps.a.class_294;

public final class LatLngBounds implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.e
   public static final class_246 field_1406 = new class_246();
   // $FF: renamed from: b com.google.android.gms.maps.model.LatLng
   public final LatLng field_1407;
   // $FF: renamed from: c com.google.android.gms.maps.model.LatLng
   public final LatLng field_1408;
   // $FF: renamed from: d int
   private final int field_1409;

   LatLngBounds(int var1, LatLng var2, LatLng var3) {
      class_343.method_1190(var2, "null southwest");
      class_343.method_1190(var3, "null northeast");
      boolean var4;
      if (var3.field_649 >= var2.field_649) {
         var4 = true;
      } else {
         var4 = false;
      }

      class_343.method_1194(var4, "southern latitude exceeds northern latitude (%s > %s)", var2.field_649, var3.field_649);
      this.field_1409 = var1;
      this.field_1407 = var2;
      this.field_1408 = var3;
   }

   // $FF: renamed from: a () int
   int method_1703() {
      return this.field_1409;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof LatLngBounds)) {
            return false;
         }

         LatLngBounds var2 = (LatLngBounds)var1;
         if (!this.field_1407.equals(var2.field_1407) || !this.field_1408.equals(var2.field_1408)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_1407, this.field_1408);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("southwest", this.field_1407).method_1032("northeast", this.field_1408).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_232.method_874(this, var1, var2);
      } else {
         class_246.method_903(this, var1, var2);
      }
   }
}
