package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

// $FF: renamed from: com.google.android.gms.internal.by
public final class class_565 {
   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.bj, com.google.android.gms.internal.cm) boolean
   public static boolean method_1854(Context var0, class_559 var1, class_48 var2) {
      if (var1 == null) {
         class_467.method_1610("No intent data for launcher overlay.");
         return false;
      } else {
         Intent var3 = new Intent();
         if (TextUtils.isEmpty(var1.field_1900)) {
            class_467.method_1610("Open GMSG did not contain a URL.");
            return false;
         } else {
            if (!TextUtils.isEmpty(var1.field_1901)) {
               var3.setDataAndType(Uri.parse(var1.field_1900), var1.field_1901);
            } else {
               var3.setData(Uri.parse(var1.field_1900));
            }

            var3.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(var1.field_1902)) {
               var3.setPackage(var1.field_1902);
            }

            if (!TextUtils.isEmpty(var1.field_1903)) {
               String[] var4 = var1.field_1903.split("/", 2);
               if (var4.length < 2) {
                  class_467.method_1610("Could not parse component name from open GMSG: " + var1.field_1903);
                  return false;
               }

               var3.setClassName(var4[0], var4[1]);
            }

            try {
               class_467.method_1609("Launching an intent: " + var3);
               var0.startActivity(var3);
               var2.method_140();
               return true;
            } catch (ActivityNotFoundException var5) {
               class_467.method_1610(var5.getMessage());
               return false;
            }
         }
      }
   }
}
