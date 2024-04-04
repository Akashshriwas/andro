/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Resources
 *  android.net.NetworkInfo
 *  android.net.NetworkInfo$State
 *  android.net.Uri
 *  android.os.Environment
 *  android.os.Parcelable
 *  android.widget.Toast
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package dn;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.widget.Toast;
import com.a.a.b;
import dn.f;
import dn.g;
import dn.hs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class a {
    /*
     * Enabled aggressive block sorting
     */
    public static Intent a(Intent intent, Activity activity) {
        List list;
        Intent intent2;
        ArrayList arrayList;
        ArrayList arrayList2;
        block5 : {
            arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            intent2 = new Intent(intent.getAction());
            intent2.setType(intent.getType());
            list = activity.getPackageManager().queryIntentActivities(intent2, 0);
            intent2 = new ArrayList();
            intent2.add((Object)"com.facebook.katana");
            intent2.add((Object)"com.google.android.apps.plus");
            intent2.add((Object)"com.twitter.android");
            intent2.add((Object)"com.google.android.gm");
            if (!list.isEmpty()) {
                list = list.iterator();
                do {
                    if (!list.hasNext()) {
                        if (arrayList.isEmpty()) break;
                        break block5;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo)list.next();
                    if (resolveInfo.activityInfo == null || !intent2.contains((Object)resolveInfo.activityInfo.packageName)) continue;
                    HashMap hashMap = new HashMap();
                    hashMap.put((Object)"packageName", (Object)resolveInfo.activityInfo.packageName);
                    hashMap.put((Object)"className", (Object)resolveInfo.activityInfo.name);
                    hashMap.put((Object)"simpleName", (Object)String.valueOf((Object)resolveInfo.activityInfo.loadLabel(activity.getPackageManager())));
                    arrayList.add((Object)hashMap);
                } while (true);
            }
            return Intent.createChooser((Intent)intent, (CharSequence)activity.getResources().getString(2131230772));
        }
        arrayList = arrayList.iterator();
        do {
            if (!arrayList.hasNext()) {
                intent = Intent.createChooser((Intent)((Intent)arrayList2.remove(arrayList2.size() - 1)), (CharSequence)activity.getResources().getString(2131230772));
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])arrayList2.toArray((Object[])new Parcelable[0]));
                return intent;
            }
            intent2 = (HashMap)arrayList.next();
            list = (Intent)intent.clone();
            list.setPackage((String)intent2.get((Object)"packageName"));
            list.setClassName((String)intent2.get((Object)"packageName"), (String)intent2.get((Object)"className"));
            arrayList2.add((Object)list);
        } while (true);
    }

    public static String a(int n2) {
        return String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/" + n2 + "11.mp3";
    }

    public static String a(String string) {
        return String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/" + string;
    }

    public static void a(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void a(Context context, String string) {
        context = Toast.makeText((Context)context, (CharSequence)string, (int)0);
        context.setGravity(17, 0, 0);
        context.show();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a() {
        NetworkInfo[] arrnetworkInfo = (NetworkInfo[])hs.a().getSystemService("connectivity");
        if (arrnetworkInfo == null || (arrnetworkInfo = arrnetworkInfo.getAllNetworkInfo()) == null) {
            return false;
        }
        int n2 = 0;
        while (n2 < arrnetworkInfo.length) {
            if (arrnetworkInfo[n2].getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static Boolean b(int n2) {
        if (new File(String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/", String.valueOf((int)n2) + "11.mp3").exists()) {
            return true;
        }
        return false;
    }

    public static Boolean b(String string) {
        if (new File(String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/", string).exists()) {
            return true;
        }
        return false;
    }

    public static void b() {
        File file = new File(String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b(Context context) {
        Iterator iterator;
        List list;
        Intent intent;
        block3 : {
            if (context == null) return;
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + context.getPackageName());
            list = context.getPackageManager().queryIntentActivities(intent, 0);
            iterator = list.iterator();
            do {
                if (!iterator.hasNext()) break block3;
                ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
            } while (!resolveInfo.activityInfo.name.contains((CharSequence)"com.facebook.composer"));
            iterator = resolveInfo.activityInfo;
            iterator = new ComponentName(iterator.applicationInfo.packageName, iterator.name);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(270532608);
            intent.setComponent((ComponentName)iterator);
            context.startActivity(intent);
            return;
        }
        boolean bl2 = false;
        if (bl2) return;
        list = list.iterator();
        do {
            if (!list.hasNext()) {
                return;
            }
            iterator = (ResolveInfo)list.next();
        } while (!iterator.activityInfo.name.contains((CharSequence)"facebook"));
        list = iterator.activityInfo;
        list = new ComponentName(list.applicationInfo.packageName, list.name);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(270532608);
        intent.setComponent((ComponentName)list);
        context.startActivity(intent);
    }

    public static Boolean c(int n2) {
        if (new File(String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/", "reg" + n2 + ".3gp").exists()) {
            return true;
        }
        return false;
    }

    public static String c(String string) {
        String string2;
        String string3 = string2 = f.a().a(f.e);
        if (string2 == null) {
            string3 = String.valueOf((Object)g.a) + b.a + ".info/conversation/";
        }
        return String.valueOf((Object)string3) + string;
    }

    public static void c() {
        try {
            boolean bl2;
            a.b();
            File file = new File(String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation" + "/.nomedia");
            if (file.exists() || (bl2 = file.createNewFile())) {
                // empty if block
            }
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public static void c(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse((String)"mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"phamkeit@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", context.getResources().getString(2131230770));
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.setType("message/rfc822");
        context.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Email"));
    }

    public static String d(int n2) {
        return String.valueOf((Object)Environment.getExternalStorageDirectory().getAbsolutePath()) + "/conversation/" + "reg" + n2 + ".3gp";
    }

    public static String e(int n2) {
        String string;
        String string2 = string = f.a().a(f.e);
        if (string == null) {
            string2 = String.valueOf((Object)g.a) + b.a + ".info/conversation/";
        }
        return String.valueOf((Object)string2) + n2 + "11.mp3";
    }
}

