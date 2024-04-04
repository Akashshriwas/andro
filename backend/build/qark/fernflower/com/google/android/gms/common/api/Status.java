package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_310;

public final class Status implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.common.api.Status
   public static final Status field_1312 = new Status(0, (String)null, (PendingIntent)null);
   // $FF: renamed from: b com.google.android.gms.common.api.Status
   public static final Status field_1313 = new Status(14, (String)null, (PendingIntent)null);
   // $FF: renamed from: c com.google.android.gms.common.api.Status
   public static final Status field_1314 = new Status(15, (String)null, (PendingIntent)null);
   // $FF: renamed from: d com.google.android.gms.common.api.a
   public static final class_518 field_1315 = new class_518();
   // $FF: renamed from: e int
   private final int field_1316;
   // $FF: renamed from: f int
   private final int field_1317;
   // $FF: renamed from: g java.lang.String
   private final String field_1318;
   // $FF: renamed from: h android.app.PendingIntent
   private final PendingIntent field_1319;

   Status(int var1, int var2, String var3, PendingIntent var4) {
      this.field_1316 = var1;
      this.field_1317 = var2;
      this.field_1318 = var3;
      this.field_1319 = var4;
   }

   public Status(int var1, String var2, PendingIntent var3) {
      this(1, var1, var2, var3);
   }

   // $FF: renamed from: e () java.lang.String
   private String method_1657() {
      if (this.field_1318 != null) {
         return this.field_1318;
      } else {
         switch(this.field_1317) {
         case -1:
            return "SUCCESS_CACHE";
         case 0:
            return "SUCCESS";
         case 1:
            return "SERVICE_MISSING";
         case 2:
            return "SERVICE_VERSION_UPDATE_REQUIRED";
         case 3:
            return "SERVICE_DISABLED";
         case 4:
            return "SIGN_IN_REQUIRED";
         case 5:
            return "INVALID_ACCOUNT";
         case 6:
            return "RESOLUTION_REQUIRED";
         case 7:
            return "NETWORK_ERROR";
         case 8:
            return "INTERNAL_ERROR";
         case 9:
            return "SERVICE_INVALID";
         case 10:
            return "DEVELOPER_ERROR";
         case 11:
            return "LICENSE_CHECK_FAILED";
         default:
            return "unknown status code " + this.field_1317;
         }
      }
   }

   // $FF: renamed from: a () android.app.PendingIntent
   PendingIntent method_1658() {
      return this.field_1319;
   }

   // $FF: renamed from: b () java.lang.String
   String method_1659() {
      return this.field_1318;
   }

   // $FF: renamed from: c () int
   int method_1660() {
      return this.field_1316;
   }

   // $FF: renamed from: d () int
   public int method_1661() {
      return this.field_1317;
   }

   public int describeContents() {
      return 0;
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("statusCode", this.method_1657()).method_1032("resolution", this.field_1319).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_518.method_1767(this, var1, var2);
   }
}
