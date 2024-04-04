package dn;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.NetworkInfo.State;
import android.os.Environment;
import android.os.Parcelable;
import android.widget.Toast;
import com.a.a.class_290;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: dn.a
public class class_100 {
   // $FF: renamed from: a (android.content.Intent, android.app.Activity) android.content.Intent
   public static Intent method_307(Intent var0, Activity var1) {
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      Intent var4 = new Intent(var0.getAction());
      var4.setType(var0.getType());
      List var5 = var1.getPackageManager().queryIntentActivities(var4, 0);
      ArrayList var9 = new ArrayList();
      var9.add("com.facebook.katana");
      var9.add("com.google.android.apps.plus");
      var9.add("com.twitter.android");
      var9.add("com.google.android.gm");
      if (!var5.isEmpty()) {
         Iterator var11 = var5.iterator();

         while(var11.hasNext()) {
            ResolveInfo var6 = (ResolveInfo)var11.next();
            if (var6.activityInfo != null && var9.contains(var6.activityInfo.packageName)) {
               HashMap var7 = new HashMap();
               var7.put("packageName", var6.activityInfo.packageName);
               var7.put("className", var6.activityInfo.name);
               var7.put("simpleName", String.valueOf(var6.activityInfo.loadLabel(var1.getPackageManager())));
               var3.add(var7);
            }
         }

         if (!var3.isEmpty()) {
            Iterator var8 = var3.iterator();

            while(var8.hasNext()) {
               HashMap var10 = (HashMap)var8.next();
               Intent var12 = (Intent)var0.clone();
               var12.setPackage((String)var10.get("packageName"));
               var12.setClassName((String)var10.get("packageName"), (String)var10.get("className"));
               var2.add(var12);
            }

            var0 = Intent.createChooser((Intent)var2.remove(var2.size() - 1), var1.getResources().getString(2131230772));
            var0.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])var2.toArray(new Parcelable[0]));
            return var0;
         }
      }

      return Intent.createChooser(var0, var1.getResources().getString(2131230772));
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_308(int var0) {
      return Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation/" + var0 + "11.mp3";
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_309(String var0) {
      return Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation/" + var0;
   }

   // $FF: renamed from: a (android.content.Context) void
   public static void method_310(Context var0) {
      Intent var1 = new Intent("android.intent.action.MAIN");
      var1.addCategory("android.intent.category.HOME");
      var1.setFlags(268435456);
      var0.startActivity(var1);
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String) void
   public static void method_311(Context var0, String var1) {
      Toast var2 = Toast.makeText(var0, var1, 0);
      var2.setGravity(17, 0, 0);
      var2.show();
   }

   // $FF: renamed from: a () boolean
   public static boolean method_312() {
      ConnectivityManager var1 = (ConnectivityManager)class_190.method_805().getSystemService("connectivity");
      if (var1 != null) {
         NetworkInfo[] var2 = var1.getAllNetworkInfo();
         if (var2 != null) {
            for(int var0 = 0; var0 < var2.length; ++var0) {
               if (var2[var0].getState() == State.CONNECTED) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: b (int) java.lang.Boolean
   public static Boolean method_313(int var0) {
      return (new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation/", var0 + "11.mp3")).exists() ? true : false;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.Boolean
   public static Boolean method_314(String var0) {
      return (new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation/", var0)).exists() ? true : false;
   }

   // $FF: renamed from: b () void
   public static void method_315() {
      File var0 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation");
      if (!var0.exists()) {
         var0.mkdirs();
      }

   }

   // $FF: renamed from: b (android.content.Context) void
   public static void method_316(Context var0) {
      if (var0 != null) {
         Intent var2 = new Intent("android.intent.action.SEND");
         var2.setType("text/plain");
         var2.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + var0.getPackageName());
         List var3 = var0.getPackageManager().queryIntentActivities(var2, 0);
         Iterator var4 = var3.iterator();

         boolean var1;
         label29: {
            while(var4.hasNext()) {
               ResolveInfo var5 = (ResolveInfo)var4.next();
               if (var5.activityInfo.name.contains("com.facebook.composer")) {
                  ActivityInfo var9 = var5.activityInfo;
                  ComponentName var10 = new ComponentName(var9.applicationInfo.packageName, var9.name);
                  var2.addCategory("android.intent.category.LAUNCHER");
                  var2.setFlags(270532608);
                  var2.setComponent(var10);
                  var0.startActivity(var2);
                  var1 = true;
                  break label29;
               }
            }

            var1 = false;
         }

         if (!var1) {
            Iterator var6 = var3.iterator();

            while(var6.hasNext()) {
               ResolveInfo var11 = (ResolveInfo)var6.next();
               if (var11.activityInfo.name.contains("facebook")) {
                  ActivityInfo var7 = var11.activityInfo;
                  ComponentName var8 = new ComponentName(var7.applicationInfo.packageName, var7.name);
                  var2.addCategory("android.intent.category.LAUNCHER");
                  var2.setFlags(270532608);
                  var2.setComponent(var8);
                  var0.startActivity(var2);
                  return;
               }
            }
         }
      }

   }

   // $FF: renamed from: c (int) java.lang.Boolean
   public static Boolean method_317(int var0) {
      return (new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation/", "reg" + var0 + ".3gp")).exists() ? true : false;
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public static String method_318(String var0) {
      String var2 = class_91.method_281().method_284(class_91.field_86);
      String var1 = var2;
      if (var2 == null) {
         var1 = class_90.field_81 + class_290.field_786 + ".info/conversation/";
      }

      return var1 + var0;
   }

   // $FF: renamed from: c () void
   public static void method_319() {
      boolean var0;
      try {
         method_315();
         File var1 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation" + "/.nomedia");
         if (var1.exists()) {
            return;
         }

         var0 = var1.createNewFile();
      } catch (IOException var2) {
         var2.printStackTrace();
         return;
      }

      if (var0) {
      }

   }

   // $FF: renamed from: c (android.content.Context) void
   public static void method_320(Context var0) {
      Intent var1 = new Intent("android.intent.action.SEND");
      var1.setData(Uri.parse("mailto:"));
      var1.putExtra("android.intent.extra.EMAIL", new String[]{"phamkeit@gmail.com"});
      var1.putExtra("android.intent.extra.SUBJECT", var0.getResources().getString(2131230770));
      var1.putExtra("android.intent.extra.TEXT", "");
      var1.setType("message/rfc822");
      var0.startActivity(Intent.createChooser(var1, "Email"));
   }

   // $FF: renamed from: d (int) java.lang.String
   public static String method_321(int var0) {
      return Environment.getExternalStorageDirectory().getAbsolutePath() + "/conversation/" + "reg" + var0 + ".3gp";
   }

   // $FF: renamed from: e (int) java.lang.String
   public static String method_322(int var0) {
      String var2 = class_91.method_281().method_284(class_91.field_86);
      String var1 = var2;
      if (var2 == null) {
         var1 = class_90.field_81 + class_290.field_786 + ".info/conversation/";
      }

      return var1 + var0 + "11.mp3";
   }
}
