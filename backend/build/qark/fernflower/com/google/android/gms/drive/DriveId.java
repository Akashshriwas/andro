package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.class_409;
import com.google.android.gms.internal.class_343;
import com.google.android.gms.internal.class_408;

public class DriveId implements SafeParcelable {
   public static final Creator CREATOR = new class_328();
   // $FF: renamed from: a int
   final int field_2014;
   // $FF: renamed from: b java.lang.String
   final String field_2015;
   // $FF: renamed from: c long
   final long field_2016;
   // $FF: renamed from: d long
   final long field_2017;
   // $FF: renamed from: e java.lang.String
   private volatile String field_2018 = null;

   DriveId(int var1, String var2, long var3, long var5) {
      this.field_2014 = var1;
      this.field_2015 = var2;
      boolean var7;
      if (!"".equals(var2)) {
         var7 = true;
      } else {
         var7 = false;
      }

      class_343.method_1196(var7);
      this.field_2016 = var3;
      this.field_2017 = var5;
   }

   // $FF: renamed from: a () java.lang.String
   public final String method_1940() {
      if (this.field_2018 == null) {
         String var1 = Base64.encodeToString(this.method_1941(), 10);
         this.field_2018 = "DriveId:" + var1;
      }

      return this.field_2018;
   }

   // $FF: renamed from: b () byte[]
   final byte[] method_1941() {
      class_409 var2 = new class_409();
      var2.field_1093 = this.field_2014;
      String var1;
      if (this.field_2015 == null) {
         var1 = "";
      } else {
         var1 = this.field_2015;
      }

      var2.field_1094 = var1;
      var2.field_1095 = this.field_2016;
      var2.field_1096 = this.field_2017;
      return class_408.method_1415(var2);
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DriveId)) {
         return false;
      } else {
         DriveId var2 = (DriveId)var1;
         return this.method_1940().equals(var2.method_1940());
      }
   }

   public int hashCode() {
      return this.method_1940().hashCode();
   }

   public String toString() {
      return this.method_1940();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_328.method_1127(this, var1, var2);
   }
}
