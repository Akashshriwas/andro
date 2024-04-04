package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;

// $FF: renamed from: com.google.android.gms.internal.fu
public final class class_489 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.if
   public static final class_370 field_1388 = new class_370();
   // $FF: renamed from: b int
   final int field_1389;
   // $FF: renamed from: c com.google.android.gms.location.LocationRequest
   private final LocationRequest field_1390;
   // $FF: renamed from: d com.google.android.gms.internal.fs
   private final class_491 field_1391;

   public class_489(int var1, LocationRequest var2, class_491 var3) {
      this.field_1389 = var1;
      this.field_1390 = var2;
      this.field_1391 = var3;
   }

   // $FF: renamed from: a () com.google.android.gms.location.LocationRequest
   public LocationRequest method_1694() {
      return this.field_1390;
   }

   // $FF: renamed from: b () com.google.android.gms.internal.fs
   public class_491 method_1695() {
      return this.field_1391;
   }

   public int describeContents() {
      class_370 var1 = field_1388;
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_489)) {
            return false;
         }

         class_489 var2 = (class_489)var1;
         if (!this.field_1390.equals(var2.field_1390) || !this.field_1391.equals(var2.field_1391)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_1390, this.field_1391);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("locationRequest", this.field_1390).method_1032("filter", this.field_1391).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_370 var3 = field_1388;
      class_370.method_1280(this, var1, var2);
   }
}
