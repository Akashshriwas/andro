package com.google.android.gms.common;

import android.app.PendingIntent;
import com.google.android.gms.internal.class_310;

// $FF: renamed from: com.google.android.gms.common.a
public final class class_174 {
   // $FF: renamed from: a com.google.android.gms.common.a
   public static final class_174 field_527 = new class_174(0, (PendingIntent)null);
   // $FF: renamed from: b android.app.PendingIntent
   private final PendingIntent field_528;
   // $FF: renamed from: c int
   private final int field_529;

   public class_174(int var1, PendingIntent var2) {
      this.field_529 = var1;
      this.field_528 = var2;
   }

   // $FF: renamed from: a () java.lang.String
   private String method_690() {
      switch(this.field_529) {
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
         return "unknown status code " + this.field_529;
      }
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("statusCode", this.method_690()).method_1032("resolution", this.field_528).toString();
   }
}
