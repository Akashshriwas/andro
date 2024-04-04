/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Readable
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.HttpURLConnection
 *  java.nio.Buffer
 *  java.nio.CharBuffer
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.ep;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import java.net.HttpURLConnection;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class em {
    private static final Object a = new Object();
    private static boolean b = true;
    private static String c;
    private static boolean d;

    static {
        d = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String a(Context var0, String var1_3) {
        var2_4 = em.a;
        synchronized (var2_4) {
            block10 : {
                if (em.c != null) {
                    return em.c;
                }
                if (Build.VERSION.SDK_INT < 17) break block10;
                em.c = eq.a((Context)var0);
                ** GOTO lbl13
            }
            if (!es.b()) {
                es.a.post((Runnable)new en((Context)var0));
            } else {
                em.c = em.d((Context)var0);
lbl13: // 3 sources:
                do {
                    em.c = em.c + " (Mobile; " + var1_3 + ")";
                    return em.c;
                    break;
                } while (true);
            }
            do {
                if ((var0 = em.c) != null) ** continue;
                try {
                    em.a.wait();
                    continue;
                }
                catch (InterruptedException var0_1) {}
                return em.c;
            } while (true);
        }
    }

    public static String a(Readable readable) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        CharBuffer charBuffer = CharBuffer.allocate((int)2048);
        while ((n2 = readable.read(charBuffer)) != -1) {
            charBuffer.flip();
            stringBuilder.append((CharSequence)charBuffer, 0, n2);
        }
        return stringBuilder.toString();
    }

    public static String a(String string) {
        return Uri.parse((String)string).buildUpon().query(null).build().toString();
    }

    private static JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        collection = collection.iterator();
        while (collection.hasNext()) {
            em.a(jSONArray, collection.next());
        }
        return jSONArray;
    }

    private static JSONArray a(Object[] arrobject) {
        JSONArray jSONArray = new JSONArray();
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            em.a(jSONArray, arrobject[i2]);
        }
        return jSONArray;
    }

    private static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String string : bundle.keySet()) {
            em.a(jSONObject, string, bundle.get(string));
        }
        return jSONObject;
    }

    public static JSONObject a(Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (String string : map.keySet()) {
                em.a(jSONObject, string, map.get((Object)string));
            }
        }
        catch (ClassCastException classCastException) {
            throw new JSONException("Could not convert map to JSON: " + classCastException.getMessage());
        }
        return jSONObject;
    }

    public static void a(Context context, String string, WebSettings webSettings) {
        webSettings.setUserAgentString(em.a(context, string));
    }

    public static void a(Context context, String string, List list) {
        list = list.iterator();
        while (list.hasNext()) {
            new er(context, string, (String)list.next()).e();
        }
    }

    public static void a(Context context, String string, boolean bl2, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(bl2);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", em.a(context, string));
        httpURLConnection.setUseCaches(false);
    }

    public static void a(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            ep.a(webView);
        }
    }

    private static void a(JSONArray jSONArray, Object object) {
        if (object instanceof Bundle) {
            jSONArray.put((Object)em.a((Bundle)object));
            return;
        }
        if (object instanceof Map) {
            jSONArray.put((Object)em.a((Map)object));
            return;
        }
        if (object instanceof Collection) {
            jSONArray.put((Object)em.a((Collection)object));
            return;
        }
        if (object instanceof Object[]) {
            jSONArray.put((Object)em.a((Object[])object));
            return;
        }
        jSONArray.put(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(JSONObject jSONObject, String string, Object object) {
        if (object instanceof Bundle) {
            jSONObject.put(string, (Object)em.a((Bundle)object));
            return;
        }
        if (object instanceof Map) {
            jSONObject.put(string, (Object)em.a((Map)object));
            return;
        }
        if (object instanceof Collection) {
            if (string == null) {
                string = "null";
            }
            jSONObject.put(string, (Object)em.a((Collection)object));
            return;
        }
        if (object instanceof Object[]) {
            jSONObject.put(string, (Object)em.a((Collection)Arrays.asList((Object[])((Object[])object))));
            return;
        }
        jSONObject.put(string, object);
    }

    public static boolean a() {
        return b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(Context context) {
        boolean bl2;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 65536);
        if (context == null || context.activityInfo == null) {
            et.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        if ((context.activityInfo.configChanges & 16) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"keyboard"}));
            bl2 = false;
        } else {
            bl2 = true;
        }
        if ((context.activityInfo.configChanges & 32) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"keyboardHidden"}));
            bl2 = false;
        }
        if ((context.activityInfo.configChanges & 128) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"orientation"}));
            bl2 = false;
        }
        if ((context.activityInfo.configChanges & 256) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"screenLayout"}));
            bl2 = false;
        }
        if ((context.activityInfo.configChanges & 512) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"uiMode"}));
            bl2 = false;
        }
        if ((context.activityInfo.configChanges & 1024) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"screenSize"}));
            bl2 = false;
        }
        if ((context.activityInfo.configChanges & 2048) == 0) {
            et.e(String.format((String)"com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", (Object[])new Object[]{"smallestScreenSize"}));
            return false;
        }
        return bl2;
    }

    public static boolean a(PackageManager packageManager, String string, String string2) {
        if (packageManager.checkPermission(string2, string) == 0) {
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean a(boolean bl2) {
        b = bl2;
        return bl2;
    }

    public static int b() {
        if (Build.VERSION.SDK_INT >= 9) {
            return 6;
        }
        return 0;
    }

    static /* synthetic */ String b(String string) {
        c = string;
        return string;
    }

    public static void b(Context context) {
        if (d) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver((BroadcastReceiver)new eo(null), intentFilter);
        d = true;
    }

    public static void b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            ep.b(webView);
        }
    }

    public static int c() {
        if (Build.VERSION.SDK_INT >= 9) {
            return 7;
        }
        return 1;
    }

    static /* synthetic */ String c(Context context) {
        return em.d(context);
    }

    static /* synthetic */ Object d() {
        return a;
    }

    private static String d(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }
}

