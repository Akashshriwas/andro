// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.Arrays;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.util.List;
import android.webkit.WebSettings;
import org.json.JSONException;
import java.util.Map;
import org.json.JSONObject;
import android.os.Bundle;
import java.util.Iterator;
import org.json.JSONArray;
import java.util.Collection;
import android.net.Uri;
import java.nio.CharBuffer;
import android.os.Build$VERSION;
import android.content.Context;

public final class em
{
    private static final Object a;
    private static boolean b;
    private static String c;
    private static boolean d;
    
    static {
        a = new Object();
        em.b = true;
        em.d = false;
    }
    
    private static String a(final Context context, final String str) {
    Label_0035_Outer:
        while (true) {
            while (true) {
                synchronized (em.a) {
                    if (em.c != null) {
                        return em.c;
                    }
                    if (Build$VERSION.SDK_INT >= 17) {
                        em.c = eq.a(context);
                        return em.c = em.c + " (Mobile; " + str + ")";
                    }
                }
                final Context context2;
                Label_0128: {
                    if (!es.b()) {
                        es.a.post((Runnable)new en(context2));
                        while (em.c == null) {
                            try {
                                em.a.wait();
                                continue Label_0035_Outer;
                            }
                            catch (InterruptedException ex) {
                                // monitorexit(o)
                                return em.c;
                            }
                            break Label_0128;
                        }
                        continue;
                    }
                }
                em.c = d(context2);
                continue;
            }
        }
    }
    
    public static String a(final Readable readable) {
        final StringBuilder sb = new StringBuilder();
        final CharBuffer allocate = CharBuffer.allocate(2048);
        while (true) {
            final int read = readable.read(allocate);
            if (read == -1) {
                break;
            }
            allocate.flip();
            sb.append(allocate, 0, read);
        }
        return sb.toString();
    }
    
    public static String a(final String s) {
        return Uri.parse(s).buildUpon().query((String)null).build().toString();
    }
    
    private static JSONArray a(final Collection collection) {
        final JSONArray jsonArray = new JSONArray();
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            a(jsonArray, iterator.next());
        }
        return jsonArray;
    }
    
    private static JSONArray a(final Object[] array) {
        final JSONArray jsonArray = new JSONArray();
        for (int length = array.length, i = 0; i < length; ++i) {
            a(jsonArray, array[i]);
        }
        return jsonArray;
    }
    
    private static JSONObject a(final Bundle bundle) {
        final JSONObject jsonObject = new JSONObject();
        for (final String s : bundle.keySet()) {
            a(jsonObject, s, bundle.get(s));
        }
        return jsonObject;
    }
    
    public static JSONObject a(final Map map) {
        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject();
            for (final String s : map.keySet()) {
                a(jsonObject, s, map.get(s));
            }
        }
        catch (ClassCastException ex) {
            throw new JSONException("Could not convert map to JSON: " + ex.getMessage());
        }
        return jsonObject;
    }
    
    public static void a(final Context context, final String s, final WebSettings webSettings) {
        webSettings.setUserAgentString(a(context, s));
    }
    
    public static void a(final Context context, final String s, final List list) {
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            new er(context, s, iterator.next()).e();
        }
    }
    
    public static void a(final Context context, final String s, final boolean instanceFollowRedirects, final HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(instanceFollowRedirects);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", a(context, s));
        httpURLConnection.setUseCaches(false);
    }
    
    public static void a(final WebView webView) {
        if (Build$VERSION.SDK_INT >= 11) {
            ep.a(webView);
        }
    }
    
    private static void a(final JSONArray jsonArray, final Object o) {
        if (o instanceof Bundle) {
            jsonArray.put((Object)a((Bundle)o));
            return;
        }
        if (o instanceof Map) {
            jsonArray.put((Object)a((Map)o));
            return;
        }
        if (o instanceof Collection) {
            jsonArray.put((Object)a((Collection)o));
            return;
        }
        if (o instanceof Object[]) {
            jsonArray.put((Object)a((Object[])o));
            return;
        }
        jsonArray.put(o);
    }
    
    private static void a(final JSONObject jsonObject, String s, final Object o) {
        if (o instanceof Bundle) {
            jsonObject.put(s, (Object)a((Bundle)o));
            return;
        }
        if (o instanceof Map) {
            jsonObject.put(s, (Object)a((Map)o));
            return;
        }
        if (o instanceof Collection) {
            if (s == null) {
                s = "null";
            }
            jsonObject.put(s, (Object)a((Collection)o));
            return;
        }
        if (o instanceof Object[]) {
            jsonObject.put(s, (Object)a(Arrays.asList((Object[])o)));
            return;
        }
        jsonObject.put(s, o);
    }
    
    public static boolean a() {
        return em.b;
    }
    
    public static boolean a(final Context context) {
        final Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        final ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            et.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean b;
        if ((resolveActivity.activityInfo.configChanges & 0x10) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboard"));
            b = false;
        }
        else {
            b = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 0x20) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboardHidden"));
            b = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 0x80) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "orientation"));
            b = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 0x100) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenLayout"));
            b = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 0x200) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "uiMode"));
            b = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 0x400) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenSize"));
            b = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 0x800) == 0x0) {
            et.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "smallestScreenSize"));
            return false;
        }
        return b;
    }
    
    public static boolean a(final PackageManager packageManager, final String s, final String s2) {
        return packageManager.checkPermission(s2, s) == 0;
    }
    
    public static int b() {
        if (Build$VERSION.SDK_INT >= 9) {
            return 6;
        }
        return 0;
    }
    
    public static void b(final Context context) {
        if (em.d) {
            return;
        }
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver((BroadcastReceiver)new eo(null), intentFilter);
        em.d = true;
    }
    
    public static void b(final WebView webView) {
        if (Build$VERSION.SDK_INT >= 11) {
            ep.b(webView);
        }
    }
    
    public static int c() {
        if (Build$VERSION.SDK_INT >= 9) {
            return 7;
        }
        return 1;
    }
    
    private static String d(final Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }
}
