package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;

public final class CircleOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.c
   public static final class_229 field_1969 = new class_229();
   // $FF: renamed from: b int
   private final int field_1970;
   // $FF: renamed from: c com.google.android.gms.maps.model.LatLng
   private LatLng field_1971 = null;
   // $FF: renamed from: d double
   private double field_1972 = 0.0D;
   // $FF: renamed from: e float
   private float field_1973 = 10.0F;
   // $FF: renamed from: f int
   private int field_1974 = -16777216;
   // $FF: renamed from: g int
   private int field_1975 = 0;
   // $FF: renamed from: h float
   private float field_1976 = 0.0F;
   // $FF: renamed from: i boolean
   private boolean field_1977 = true;

   public CircleOptions() {
      this.field_1970 = 1;
   }

   CircleOptions(int var1, LatLng var2, double var3, float var5, int var6, int var7, float var8, boolean var9) {
      this.field_1970 = var1;
      this.field_1971 = var2;
      this.field_1972 = var3;
      this.field_1973 = var5;
      this.field_1974 = var6;
      this.field_1975 = var7;
      this.field_1976 = var8;
      this.field_1977 = var9;
   }

   // $FF: renamed from: a () int
   int method_1919() {
      return this.field_1970;
   }

   // $FF: renamed from: b () com.google.android.gms.maps.model.LatLng
   public LatLng method_1920() {
      return this.field_1971;
   }

   // $FF: renamed from: c () double
   public double method_1921() {
      return this.field_1972;
   }

   // $FF: renamed from: d () float
   public float method_1922() {
      return this.field_1973;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () int
   public int method_1923() {
      return this.field_1974;
   }

   // $FF: renamed from: f () int
   public int method_1924() {
      return this.field_1975;
   }

   // $FF: renamed from: g () float
   public float method_1925() {
      return this.field_1976;
   }

   // $FF: renamed from: h () boolean
   public boolean method_1926() {
      return this.field_1977;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_234.method_876(this, var1, var2);
      } else {
         class_229.method_849(this, var1, var2);
      }
   }
}
