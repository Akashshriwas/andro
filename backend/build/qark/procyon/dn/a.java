// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.net.Uri;
import java.io.IOException;
import com.a.a.b;
import android.content.pm.ActivityInfo;
import android.content.ComponentName;
import java.io.File;
import android.net.NetworkInfo;
import android.net.NetworkInfo$State;
import android.net.ConnectivityManager;
import android.widget.Toast;
import android.content.Context;
import android.os.Environment;
import java.util.Iterator;
import java.util.List;
import android.os.Parcelable;
import android.content.pm.ResolveInfo;
import java.util.HashMap;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;

public class a
{
    public static Intent a(Intent chooser, final Activity activity) {
        final ArrayList<Object> list = new ArrayList<Object>();
        final ArrayList<HashMap<K, String>> list2 = new ArrayList<HashMap<K, String>>();
        final Intent intent = new Intent(chooser.getAction());
        intent.setType(chooser.getType());
        final List queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        final ArrayList<String> list3 = new ArrayList<String>();
        list3.add("com.facebook.katana");
        list3.add("com.google.android.apps.plus");
        list3.add("com.twitter.android");
        list3.add("com.google.android.gm");
        if (!queryIntentActivities.isEmpty()) {
            for (final ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && list3.contains(resolveInfo.activityInfo.packageName)) {
                    final HashMap<String, String> hashMap = new HashMap<String, String>();
                    hashMap.put("packageName", resolveInfo.activityInfo.packageName);
                    hashMap.put("className", resolveInfo.activityInfo.name);
                    hashMap.put("simpleName", String.valueOf(resolveInfo.activityInfo.loadLabel(activity.getPackageManager())));
                    list2.add((HashMap<K, String>)hashMap);
                }
            }
            if (!list2.isEmpty()) {
                for (final HashMap<K, String> hashMap2 : list2) {
                    final Intent intent2 = (Intent)chooser.clone();
                    intent2.setPackage((String)hashMap2.get("packageName"));
                    intent2.setClassName((String)hashMap2.get("packageName"), (String)hashMap2.get("className"));
                    list.add(intent2);
                }
                chooser = Intent.createChooser((Intent)list.remove(list.size() - 1), (CharSequence)activity.getResources().getString(2131230772));
                chooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray(new Parcelable[0]));
                return chooser;
            }
        }
        return Intent.createChooser(chooser, (CharSequence)activity.getResources().getString(2131230772));
    }
    
    public static String a(final int i) {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/" + i + "11.mp3";
    }
    
    public static String a(final String str) {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/" + str;
    }
    
    public static void a(final Context context) {
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
    
    public static void a(final Context context, final String s) {
        final Toast text = Toast.makeText(context, (CharSequence)s, 0);
        text.setGravity(17, 0, 0);
        text.show();
    }
    
    public static boolean a() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)hs.a().getSystemService("connectivity");
        if (connectivityManager != null) {
            final NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                for (int i = 0; i < allNetworkInfo.length; ++i) {
                    if (allNetworkInfo[i].getState() == NetworkInfo$State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static Boolean b(final int i) {
        if (new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/", String.valueOf(i) + "11.mp3").exists()) {
            return true;
        }
        return false;
    }
    
    public static Boolean b(final String child) {
        if (new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/", child).exists()) {
            return true;
        }
        return false;
    }
    
    public static void b() {
        final File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation");
        if (!file.exists()) {
            file.mkdirs();
        }
    }
    
    public static void b(final Context context) {
        if (context != null) {
            final Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + context.getPackageName());
            final List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            while (true) {
                for (final ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo.activityInfo.name.contains("com.facebook.composer")) {
                        final ActivityInfo activityInfo = resolveInfo.activityInfo;
                        final ComponentName component = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setFlags(270532608);
                        intent.setComponent(component);
                        context.startActivity(intent);
                        final int n = 1;
                        if (n == 0) {
                            for (final ResolveInfo resolveInfo2 : queryIntentActivities) {
                                if (resolveInfo2.activityInfo.name.contains("facebook")) {
                                    final ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                                    final ComponentName component2 = new ComponentName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                                    intent.addCategory("android.intent.category.LAUNCHER");
                                    intent.setFlags(270532608);
                                    intent.setComponent(component2);
                                    context.startActivity(intent);
                                }
                            }
                        }
                        return;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public static Boolean c(final int i) {
        if (new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/", "reg" + i + ".3gp").exists()) {
            return true;
        }
        return false;
    }
    
    public static String c(final String str) {
        String obj;
        if ((obj = f.a().a(f.e)) == null) {
            obj = String.valueOf(g.a) + b.a + ".info/conversation/";
        }
        return String.valueOf(obj) + str;
    }
    
    public static void c() {
        try {
            b();
            final File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation" + "/.nomedia");
            if (file.exists() || file.createNewFile()) {}
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void c(final Context context) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[] { "phamkeit@gmail.com" });
        intent.putExtra("android.intent.extra.SUBJECT", context.getResources().getString(2131230770));
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.setType("message/rfc822");
        context.startActivity(Intent.createChooser(intent, (CharSequence)"Email"));
    }
    
    public static String d(final int i) {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/" + "reg" + i + ".3gp";
    }
    
    public static String e(final int i) {
        String obj;
        if ((obj = f.a().a(f.e)) == null) {
            obj = String.valueOf(g.a) + b.a + ".info/conversation/";
        }
        return String.valueOf(obj) + i + "11.mp3";
    }
}
