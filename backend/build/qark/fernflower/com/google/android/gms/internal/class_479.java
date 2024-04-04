package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

// $FF: renamed from: com.google.android.gms.internal.ea
public final class class_479 {
   // $FF: renamed from: a int
   public final int field_1346;
   // $FF: renamed from: b boolean
   public final boolean field_1347;
   // $FF: renamed from: c boolean
   public final boolean field_1348;
   // $FF: renamed from: d java.lang.String
   public final String field_1349;
   // $FF: renamed from: e java.lang.String
   public final String field_1350;
   // $FF: renamed from: f boolean
   public final boolean field_1351;
   // $FF: renamed from: g boolean
   public final boolean field_1352;
   // $FF: renamed from: h boolean
   public final boolean field_1353;
   // $FF: renamed from: i java.lang.String
   public final String field_1354;
   // $FF: renamed from: j java.lang.String
   public final String field_1355;
   // $FF: renamed from: k int
   public final int field_1356;
   // $FF: renamed from: l int
   public final int field_1357;
   // $FF: renamed from: m int
   public final int field_1358;
   // $FF: renamed from: n int
   public final int field_1359;
   // $FF: renamed from: o int
   public final int field_1360;
   // $FF: renamed from: p int
   public final int field_1361;
   // $FF: renamed from: q float
   public final float field_1362;
   // $FF: renamed from: r int
   public final int field_1363;
   // $FF: renamed from: s int
   public final int field_1364;

   public class_479(Context var1) {
      boolean var3 = true;
      super();
      AudioManager var4 = (AudioManager)var1.getSystemService("audio");
      ConnectivityManager var5 = (ConnectivityManager)var1.getSystemService("connectivity");
      DisplayMetrics var6 = var1.getResources().getDisplayMetrics();
      Locale var7 = Locale.getDefault();
      PackageManager var8 = var1.getPackageManager();
      TelephonyManager var9 = (TelephonyManager)var1.getSystemService("phone");
      this.field_1346 = var4.getMode();
      boolean var2;
      if (method_1669(var8, "geo:0,0?q=donuts") != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.field_1347 = var2;
      if (method_1669(var8, "http://www.google.com") != null) {
         var2 = var3;
      } else {
         var2 = false;
      }

      this.field_1348 = var2;
      this.field_1349 = var9.getNetworkOperator();
      this.field_1350 = var7.getCountry();
      this.field_1351 = class_468.method_1617();
      this.field_1352 = var4.isMusicActive();
      this.field_1353 = var4.isSpeakerphoneOn();
      this.field_1354 = var7.getLanguage();
      this.field_1355 = method_1670(var8);
      this.field_1356 = var4.getStreamVolume(3);
      this.field_1357 = method_1668(var1, var5, var8);
      this.field_1358 = var9.getNetworkType();
      this.field_1359 = var9.getPhoneType();
      this.field_1360 = var4.getRingerMode();
      this.field_1361 = var4.getStreamVolume(2);
      this.field_1362 = var6.density;
      this.field_1363 = var6.widthPixels;
      this.field_1364 = var6.heightPixels;
   }

   // $FF: renamed from: a (android.content.Context, android.net.ConnectivityManager, android.content.pm.PackageManager) int
   private static int method_1668(Context var0, ConnectivityManager var1, PackageManager var2) {
      int var3 = -2;
      if (class_466.method_1593(var2, var0.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
         NetworkInfo var4 = var1.getActiveNetworkInfo();
         if (var4 == null) {
            return -1;
         }

         var3 = var4.getType();
      }

      return var3;
   }

   // $FF: renamed from: a (android.content.pm.PackageManager, java.lang.String) android.content.pm.ResolveInfo
   private static ResolveInfo method_1669(PackageManager var0, String var1) {
      return var0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(var1)), 65536);
   }

   // $FF: renamed from: a (android.content.pm.PackageManager) java.lang.String
   private static String method_1670(PackageManager var0) {
      ResolveInfo var1 = method_1669(var0, "market://details?id=com.google.android.gms.ads");
      if (var1 != null) {
         ActivityInfo var6 = var1.activityInfo;
         if (var6 != null) {
            boolean var10001;
            PackageInfo var4;
            try {
               var4 = var0.getPackageInfo(var6.packageName, 0);
            } catch (NameNotFoundException var3) {
               var10001 = false;
               return null;
            }

            if (var4 == null) {
               return null;
            }

            try {
               String var5 = var4.versionCode + "." + var6.packageName;
               return var5;
            } catch (NameNotFoundException var2) {
               var10001 = false;
               return null;
            }
         }
      }

      return null;
   }
}
