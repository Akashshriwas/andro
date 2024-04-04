package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;

public final class LatLng implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.f
   public static final class_243 field_648 = new class_243();
   // $FF: renamed from: b double
   public final double field_649;
   // $FF: renamed from: c double
   public final double field_650;
   // $FF: renamed from: d int
   private final int field_651;

   LatLng(int var1, double var2, double var4) {
      this.field_651 = var1;
      if (-180.0D <= var4 && var4 < 180.0D) {
         this.field_650 = var4;
      } else {
         this.field_650 = ((var4 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D;
      }

      this.field_649 = Math.max(-90.0D, Math.min(90.0D, var2));
   }

   // $FF: renamed from: a () int
   int method_816() {
      return this.field_651;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof LatLng)) {
            return false;
         }

         LatLng var2 = (LatLng)var1;
         if (Double.doubleToLongBits(this.field_649) != Double.doubleToLongBits(var2.field_649) || Double.doubleToLongBits(this.field_650) != Double.doubleToLongBits(var2.field_650)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      long var2 = Double.doubleToLongBits(this.field_649);
      int var1 = (int)(var2 ^ var2 >>> 32);
      var2 = Double.doubleToLongBits(this.field_650);
      return (var1 + 31) * 31 + (int)(var2 ^ var2 >>> 32);
   }

   public String toString() {
      return "lat/lng: (" + this.field_649 + "," + this.field_650 + ")";
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_233.method_875(this, var1, var2);
      } else {
         class_243.method_894(this, var1, var2);
      }
   }
}
