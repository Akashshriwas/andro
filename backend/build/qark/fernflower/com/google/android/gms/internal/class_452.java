package com.google.android.gms.internal;

import android.content.Context;

// $FF: renamed from: com.google.android.gms.internal.dt
final class class_452 implements Runnable {
   // $FF: renamed from: a android.content.Context
   // $FF: synthetic field
   final Context field_1218;
   // $FF: renamed from: b com.google.android.gms.internal.bz
   // $FF: synthetic field
   final class_433 field_1219;
   // $FF: renamed from: c com.google.android.gms.internal.dv
   // $FF: synthetic field
   final class_450 field_1220;
   // $FF: renamed from: d java.lang.String
   // $FF: synthetic field
   final String field_1221;

   class_452(Context var1, class_433 var2, class_450 var3, String var4) {
      this.field_1218 = var1;
      this.field_1219 = var2;
      this.field_1220 = var3;
      this.field_1221 = var4;
   }

   public void run() {
      class_473 var1 = class_473.method_1636(this.field_1218, new class_607(), false, false, (class_355)null, this.field_1219.field_1167);
      var1.setWillNotDraw(true);
      this.field_1220.method_1509(var1);
      class_470 var2 = var1.method_1649();
      var2.method_1627("/invalidRequest", this.field_1220.field_1209);
      var2.method_1627("/loadAdURL", this.field_1220.field_1210);
      var2.method_1627("/log", class_599.field_2000);
      class_467.method_1603("Getting the ad request URL.");
      var1.loadDataWithBaseURL("http://googleads.g.doubleclick.net", "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + this.field_1221 + ");</script></head><body></body></html>", "text/html", "UTF-8", (String)null);
   }
}
