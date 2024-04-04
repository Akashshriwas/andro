/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ep;

public final class eq {
    public static String a(Context context) {
        return WebSettings.getDefaultUserAgent((Context)context);
    }

    public static void a(Context context, WebSettings webSettings) {
        ep.a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}

