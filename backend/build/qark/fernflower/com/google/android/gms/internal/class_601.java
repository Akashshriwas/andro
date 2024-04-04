package com.google.android.gms.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.u
final class class_601 implements class_60 {
   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var11 = (String)var2.get("urls");
      if (var11 == null) {
         class_467.method_1610("URLs missing in canOpenURLs GMSG.");
      } else {
         String[] var6 = var11.split(",");
         HashMap var7 = new HashMap();
         PackageManager var8 = var1.getContext().getPackageManager();
         int var4 = var6.length;

         for(int var3 = 0; var3 < var4; ++var3) {
            String var9 = var6[var3];
            String[] var12 = var9.split(";", 2);
            String var10 = var12[0].trim();
            if (var12.length > 1) {
               var11 = var12[1].trim();
            } else {
               var11 = "android.intent.action.VIEW";
            }

            boolean var5;
            if (var8.resolveActivity(new Intent(var11, Uri.parse(var10)), 65536) != null) {
               var5 = true;
            } else {
               var5 = false;
            }

            var7.put(var9, var5);
         }

         var1.method_1644("openableURLs", var7);
      }
   }
}
