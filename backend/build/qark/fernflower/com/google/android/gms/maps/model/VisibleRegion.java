package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.maps.a.class_294;

public final class VisibleRegion implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.n
   public static final class_236 field_1271 = new class_236();
   // $FF: renamed from: b com.google.android.gms.maps.model.LatLng
   public final LatLng field_1272;
   // $FF: renamed from: c com.google.android.gms.maps.model.LatLng
   public final LatLng field_1273;
   // $FF: renamed from: d com.google.android.gms.maps.model.LatLng
   public final LatLng field_1274;
   // $FF: renamed from: e com.google.android.gms.maps.model.LatLng
   public final LatLng field_1275;
   // $FF: renamed from: f com.google.android.gms.maps.model.LatLngBounds
   public final LatLngBounds field_1276;
   // $FF: renamed from: g int
   private final int field_1277;

   VisibleRegion(int var1, LatLng var2, LatLng var3, LatLng var4, LatLng var5, LatLngBounds var6) {
      this.field_1277 = var1;
      this.field_1272 = var2;
      this.field_1273 = var3;
      this.field_1274 = var4;
      this.field_1275 = var5;
      this.field_1276 = var6;
   }

   // $FF: renamed from: a () int
   int method_1577() {
      return this.field_1277;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof VisibleRegion)) {
            return false;
         }

         VisibleRegion var2 = (VisibleRegion)var1;
         if (!this.field_1272.equals(var2.field_1272) || !this.field_1273.equals(var2.field_1273) || !this.field_1274.equals(var2.field_1274) || !this.field_1275.equals(var2.field_1275) || !this.field_1276.equals(var2.field_1276)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_1272, this.field_1273, this.field_1274, this.field_1275, this.field_1276);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("nearLeft", this.field_1272).method_1032("nearRight", this.field_1273).method_1032("farLeft", this.field_1274).method_1032("farRight", this.field_1275).method_1032("latLngBounds", this.field_1276).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_192.method_807(this, var1, var2);
      } else {
         class_236.method_878(this, var1, var2);
      }
   }
}
