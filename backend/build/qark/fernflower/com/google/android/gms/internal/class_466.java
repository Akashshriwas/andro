package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// $FF: renamed from: com.google.android.gms.internal.em
public final class class_466 {
   // $FF: renamed from: a java.lang.Object
   private static final Object field_1279 = new Object();
   // $FF: renamed from: b boolean
   private static boolean field_1280 = true;
   // $FF: renamed from: c java.lang.String
   private static String field_1281;
   // $FF: renamed from: d boolean
   private static boolean field_1282 = false;

   // $FF: renamed from: a (android.content.Context, java.lang.String) java.lang.String
   private static String method_1578(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.Readable) java.lang.String
   public static String method_1579(Readable var0) {
      StringBuilder var2 = new StringBuilder();
      CharBuffer var3 = CharBuffer.allocate(2048);

      while(true) {
         int var1 = var0.read(var3);
         if (var1 == -1) {
            return var2.toString();
         }

         var3.flip();
         var2.append(var3, 0, var1);
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1580(String var0) {
      return Uri.parse(var0).buildUpon().query((String)null).build().toString();
   }

   // $FF: renamed from: a (java.util.Collection) org.json.JSONArray
   private static JSONArray method_1581(Collection var0) {
      JSONArray var1 = new JSONArray();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         method_1589(var1, var2.next());
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.Object[]) org.json.JSONArray
   private static JSONArray method_1582(Object[] var0) {
      JSONArray var3 = new JSONArray();
      int var2 = var0.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         method_1589(var3, var0[var1]);
      }

      return var3;
   }

   // $FF: renamed from: a (android.os.Bundle) org.json.JSONObject
   private static JSONObject method_1583(Bundle var0) {
      JSONObject var1 = new JSONObject();
      Iterator var2 = var0.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         method_1590(var1, var3, var0.get(var3));
      }

      return var1;
   }

   // $FF: renamed from: a (java.util.Map) org.json.JSONObject
   public static JSONObject method_1584(Map param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, android.webkit.WebSettings) void
   public static void method_1585(Context var0, String var1, WebSettings var2) {
      var2.setUserAgentString(method_1578(var0, var1));
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, java.util.List) void
   public static void method_1586(Context var0, String var1, List var2) {
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         (new class_427(var0, var1, (String)var3.next())).e();
      }

   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, boolean, java.net.HttpURLConnection) void
   public static void method_1587(Context var0, String var1, boolean var2, HttpURLConnection var3) {
      var3.setConnectTimeout(60000);
      var3.setInstanceFollowRedirects(var2);
      var3.setReadTimeout(60000);
      var3.setRequestProperty("User-Agent", method_1578(var0, var1));
      var3.setUseCaches(false);
   }

   // $FF: renamed from: a (android.webkit.WebView) void
   public static void method_1588(WebView var0) {
      if (VERSION.SDK_INT >= 11) {
         class_463.method_1574(var0);
      }

   }

   // $FF: renamed from: a (org.json.JSONArray, java.lang.Object) void
   private static void method_1589(JSONArray var0, Object var1) {
      if (var1 instanceof Bundle) {
         var0.put(method_1583((Bundle)var1));
      } else if (var1 instanceof Map) {
         var0.put(method_1584((Map)var1));
      } else if (var1 instanceof Collection) {
         var0.put(method_1581((Collection)var1));
      } else if (var1 instanceof Object[]) {
         var0.put(method_1582((Object[])((Object[])var1)));
      } else {
         var0.put(var1);
      }
   }

   // $FF: renamed from: a (org.json.JSONObject, java.lang.String, java.lang.Object) void
   private static void method_1590(JSONObject var0, String var1, Object var2) {
      if (var2 instanceof Bundle) {
         var0.put(var1, method_1583((Bundle)var2));
      } else if (var2 instanceof Map) {
         var0.put(var1, method_1584((Map)var2));
      } else if (var2 instanceof Collection) {
         if (var1 == null) {
            var1 = "null";
         }

         var0.put(var1, method_1581((Collection)var2));
      } else if (var2 instanceof Object[]) {
         var0.put(var1, method_1581(Arrays.asList((Object[])((Object[])var2))));
      } else {
         var0.put(var1, var2);
      }
   }

   // $FF: renamed from: a () boolean
   public static boolean method_1591() {
      return field_1280;
   }

   // $FF: renamed from: a (android.content.Context) boolean
   public static boolean method_1592(Context var0) {
      Intent var2 = new Intent();
      var2.setClassName(var0, "com.google.android.gms.ads.AdActivity");
      ResolveInfo var3 = var0.getPackageManager().resolveActivity(var2, 65536);
      if (var3 != null && var3.activityInfo != null) {
         boolean var1;
         if ((var3.activityInfo.configChanges & 16) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboard"));
            var1 = false;
         } else {
            var1 = true;
         }

         if ((var3.activityInfo.configChanges & 32) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboardHidden"));
            var1 = false;
         }

         if ((var3.activityInfo.configChanges & 128) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "orientation"));
            var1 = false;
         }

         if ((var3.activityInfo.configChanges & 256) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenLayout"));
            var1 = false;
         }

         if ((var3.activityInfo.configChanges & 512) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "uiMode"));
            var1 = false;
         }

         if ((var3.activityInfo.configChanges & 1024) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenSize"));
            var1 = false;
         }

         if ((var3.activityInfo.configChanges & 2048) == 0) {
            class_467.method_1610(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "smallestScreenSize"));
            return false;
         } else {
            return var1;
         }
      } else {
         class_467.method_1610("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
         return false;
      }
   }

   // $FF: renamed from: a (android.content.pm.PackageManager, java.lang.String, java.lang.String) boolean
   public static boolean method_1593(PackageManager var0, String var1, String var2) {
      return var0.checkPermission(var2, var1) == 0;
   }

   // $FF: renamed from: a (boolean) boolean
   // $FF: synthetic method
   static boolean method_1594(boolean var0) {
      field_1280 = var0;
      return var0;
   }

   // $FF: renamed from: b () int
   public static int method_1595() {
      return VERSION.SDK_INT >= 9 ? 6 : 0;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   // $FF: synthetic method
   static String method_1596(String var0) {
      field_1281 = var0;
      return var0;
   }

   // $FF: renamed from: b (android.content.Context) void
   public static void method_1597(Context var0) {
      if (!field_1282) {
         IntentFilter var1 = new IntentFilter();
         var1.addAction("android.intent.action.USER_PRESENT");
         var1.addAction("android.intent.action.SCREEN_OFF");
         var0.getApplicationContext().registerReceiver(new class_464((class_465)null), var1);
         field_1282 = true;
      }
   }

   // $FF: renamed from: b (android.webkit.WebView) void
   public static void method_1598(WebView var0) {
      if (VERSION.SDK_INT >= 11) {
         class_463.method_1576(var0);
      }

   }

   // $FF: renamed from: c () int
   public static int method_1599() {
      return VERSION.SDK_INT >= 9 ? 7 : 1;
   }

   // $FF: renamed from: c (android.content.Context) java.lang.String
   // $FF: synthetic method
   static String method_1600(Context var0) {
      return method_1602(var0);
   }

   // $FF: renamed from: d () java.lang.Object
   // $FF: synthetic method
   static Object method_1601() {
      return field_1279;
   }

   // $FF: renamed from: d (android.content.Context) java.lang.String
   private static String method_1602(Context var0) {
      return (new WebView(var0)).getSettings().getUserAgentString();
   }
}
