/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Locale
 */
package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.x;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class es {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static int a(Context context, int n2) {
        return es.a(context.getResources().getDisplayMetrics(), n2);
    }

    public static int a(DisplayMetrics displayMetrics, int n2) {
        return (int)TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)displayMetrics);
    }

    public static String a(Context object) {
        if ((object = Settings.Secure.getString((ContentResolver)object.getContentResolver(), (String)"android_id")) == null || es.a()) {
            object = "emulator";
        }
        return es.a((String)object);
    }

    public static String a(String string) {
        for (int i2 = 0; i2 < 2; ++i2) {
            try {
                Object object = MessageDigest.getInstance((String)"MD5");
                object.update(string.getBytes());
                object = String.format((Locale)Locale.US, (String)"%032X", (Object[])new Object[]{new BigInteger(1, object.digest())});
                return object;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                continue;
            }
        }
        return null;
    }

    private static void a(ViewGroup viewGroup, x x2, String string, int n2, int n3) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText((CharSequence)string);
        textView.setTextColor(n2);
        textView.setBackgroundColor(n3);
        string = new FrameLayout(context);
        string.setBackgroundColor(n2);
        n2 = es.a(context, 3);
        string.addView((View)textView, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(x2.h - n2, x2.e - n2, 17));
        viewGroup.addView((View)string, x2.h, x2.e);
    }

    public static void a(ViewGroup viewGroup, x x2, String string, String string2) {
        et.e(string2);
        es.a(viewGroup, x2, string, -65536, -16777216);
    }

    public static boolean a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}

