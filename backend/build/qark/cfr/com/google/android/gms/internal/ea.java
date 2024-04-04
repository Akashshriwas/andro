/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.res.Resources
 *  android.media.AudioManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.Uri
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.es;
import java.util.Locale;

public final class ea {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final int s;

    /*
     * Enabled aggressive block sorting
     */
    public ea(Context context) {
        boolean bl2 = true;
        AudioManager audioManager = (AudioManager)context.getSystemService("audio");
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packageManager = context.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        this.a = audioManager.getMode();
        boolean bl3 = ea.a(packageManager, "geo:0,0?q=donuts") != null;
        this.b = bl3;
        bl3 = ea.a(packageManager, "http://www.google.com") != null ? bl2 : false;
        this.c = bl3;
        this.d = telephonyManager.getNetworkOperator();
        this.e = locale.getCountry();
        this.f = es.a();
        this.g = audioManager.isMusicActive();
        this.h = audioManager.isSpeakerphoneOn();
        this.i = locale.getLanguage();
        this.j = ea.a(packageManager);
        this.k = audioManager.getStreamVolume(3);
        this.l = ea.a(context, connectivityManager, packageManager);
        this.m = telephonyManager.getNetworkType();
        this.n = telephonyManager.getPhoneType();
        this.o = audioManager.getRingerMode();
        this.p = audioManager.getStreamVolume(2);
        this.q = displayMetrics.density;
        this.r = displayMetrics.widthPixels;
        this.s = displayMetrics.heightPixels;
    }

    private static int a(Context context, ConnectivityManager connectivityManager, PackageManager packageManager) {
        block3 : {
            int n2;
            block2 : {
                n2 = -2;
                if (!em.a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) break block2;
                context = connectivityManager.getActiveNetworkInfo();
                if (context == null) break block3;
                n2 = context.getType();
            }
            return n2;
        }
        return -1;
    }

    private static ResolveInfo a(PackageManager packageManager, String string) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)), 65536);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(PackageManager object) {
        ResolveInfo resolveInfo = ea.a((PackageManager)object, "market://details?id=com.google.android.gms.ads");
        if (resolveInfo == null) {
            return null;
        }
        resolveInfo = resolveInfo.activityInfo;
        if (resolveInfo == null) return null;
        try {
            if ((object = object.getPackageInfo(resolveInfo.packageName, 0)) == null) return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
        return "" + object.versionCode + "." + resolveInfo.packageName;
    }
}

