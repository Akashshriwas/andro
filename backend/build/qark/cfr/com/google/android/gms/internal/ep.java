/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.view.View
 *  android.view.Window
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

public final class ep {
    public static void a(Context context, WebSettings webSettings) {
        webSettings.setAppCachePath(new File(context.getCacheDir(), "com.google.android.gms.ads.appcache").getAbsolutePath());
        webSettings.setAppCacheMaxSize(0L);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
    }

    public static void a(View view) {
        view.setLayerType(1, null);
    }

    public static void a(Window window) {
        window.setFlags(16777216, 16777216);
    }

    public static void a(WebView webView) {
        webView.onPause();
    }

    public static void b(View view) {
        view.setLayerType(0, null);
    }

    public static void b(WebView webView) {
        webView.onResume();
    }
}

