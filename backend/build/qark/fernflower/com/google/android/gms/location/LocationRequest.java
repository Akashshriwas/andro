package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_310;

public final class LocationRequest implements SafeParcelable {
   // $FF: renamed from: h com.google.android.gms.location.c
   public static final class_289 field_836 = new class_289();
   // $FF: renamed from: a int
   int field_837;
   // $FF: renamed from: b long
   long field_838;
   // $FF: renamed from: c long
   long field_839;
   // $FF: renamed from: d boolean
   boolean field_840;
   // $FF: renamed from: e long
   long field_841;
   // $FF: renamed from: f int
   int field_842;
   // $FF: renamed from: g float
   float field_843;
   // $FF: renamed from: i int
   private final int field_844;

   public LocationRequest() {
      this.field_844 = 1;
      this.field_837 = 102;
      this.field_838 = 3600000L;
      this.field_839 = 600000L;
      this.field_840 = false;
      this.field_841 = Long.MAX_VALUE;
      this.field_842 = Integer.MAX_VALUE;
      this.field_843 = 0.0F;
   }

   LocationRequest(int var1, int var2, long var3, long var5, boolean var7, long var8, int var10, float var11) {
      this.field_844 = var1;
      this.field_837 = var2;
      this.field_838 = var3;
      this.field_839 = var5;
      this.field_840 = var7;
      this.field_841 = var8;
      this.field_842 = var10;
      this.field_843 = var11;
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_1019(int var0) {
      switch(var0) {
      case 100:
         return "PRIORITY_HIGH_ACCURACY";
      case 101:
      case 103:
      default:
         return "???";
      case 102:
         return "PRIORITY_BALANCED_POWER_ACCURACY";
      case 104:
         return "PRIORITY_LOW_POWER";
      case 105:
         return "PRIORITY_NO_POWER";
      }
   }

   // $FF: renamed from: a () int
   int method_1020() {
      return this.field_844;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof LocationRequest)) {
            return false;
         }

         LocationRequest var2 = (LocationRequest)var1;
         if (this.field_837 != var2.field_837 || this.field_838 != var2.field_838 || this.field_839 != var2.field_839 || this.field_840 != var2.field_840 || this.field_841 != var2.field_841 || this.field_842 != var2.field_842 || this.field_843 != var2.field_843) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_837, this.field_838, this.field_839, this.field_840, this.field_841, this.field_842, this.field_843);
   }

   public String toString() {
      StringBuilder var5 = new StringBuilder();
      var5.append("Request[").append(method_1019(this.field_837));
      if (this.field_837 != 105) {
         var5.append(" requested=");
         var5.append(this.field_838 + "ms");
      }

      var5.append(" fastest=");
      var5.append(this.field_839 + "ms");
      if (this.field_841 != Long.MAX_VALUE) {
         long var1 = this.field_841;
         long var3 = SystemClock.elapsedRealtime();
         var5.append(" expireIn=");
         var5.append(var1 - var3 + "ms");
      }

      if (this.field_842 != Integer.MAX_VALUE) {
         var5.append(" num=").append(this.field_842);
      }

      var5.append(']');
      return var5.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_289.method_990(this, var1, var2);
   }
}
