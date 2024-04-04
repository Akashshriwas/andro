package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

// $FF: renamed from: com.google.android.gms.internal.gn
public class class_323 {
   // $FF: renamed from: a android.net.Uri
   private static final Uri field_919 = Uri.parse("http://plus.google.com/");
   // $FF: renamed from: b android.net.Uri
   private static final Uri field_920;

   static {
      field_920 = field_919.buildUpon().appendPath("circles").appendPath("find").build();
   }

   // $FF: renamed from: a () android.content.Intent
   public static Intent method_1067() {
      return new Intent("android.settings.DATE_SETTINGS");
   }

   // $FF: renamed from: a (java.lang.String) android.content.Intent
   public static Intent method_1068(String var0) {
      Uri var2 = Uri.fromParts("package", var0, (String)null);
      Intent var1 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
      var1.setData(var2);
      return var1;
   }

   // $FF: renamed from: b (java.lang.String) android.content.Intent
   public static Intent method_1069(String var0) {
      Intent var1 = new Intent("android.intent.action.VIEW");
      var1.setData(method_1071(var0));
      var1.setPackage("com.android.vending");
      var1.addFlags(524288);
      return var1;
   }

   // $FF: renamed from: c (java.lang.String) android.content.Intent
   public static Intent method_1070(String var0) {
      Uri var2 = Uri.parse("bazaar://search?q=pname:" + var0);
      Intent var1 = new Intent("android.intent.action.VIEW");
      var1.setData(var2);
      var1.setFlags(524288);
      return var1;
   }

   // $FF: renamed from: d (java.lang.String) android.net.Uri
   private static Uri method_1071(String var0) {
      return Uri.parse("market://details").buildUpon().appendQueryParameter("id", var0).build();
   }
}
