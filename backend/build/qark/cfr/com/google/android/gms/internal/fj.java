/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  java.io.ByteArrayInputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.lang.Readable
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.x;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class fj
extends ex {
    public fj(ev ev2, boolean bl2) {
        super(ev2, bl2);
    }

    private static WebResourceResponse a(Context context, String string, String string2) {
        string2 = (HttpURLConnection)new URL(string2).openConnection();
        try {
            em.a(context, string, true, (HttpURLConnection)string2);
            string2.connect();
            context = new WebResourceResponse("application/javascript", "UTF-8", (InputStream)new ByteArrayInputStream(em.a((Readable)new InputStreamReader(string2.getInputStream())).getBytes("UTF-8")));
            return context;
        }
        finally {
            string2.disconnect();
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String string) {
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                return super.shouldInterceptRequest(webView, string);
            }
            if (!(webView instanceof ev)) {
                et.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webView, string);
            }
            ev ev2 = (ev)webView;
            ev2.e().c();
            if (ev2.d().f) {
                et.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return fj.a(ev2.getContext(), this.a.g().c, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (ev2.h()) {
                et.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return fj.a(ev2.getContext(), this.a.g().c, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            et.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            ev2 = fj.a(ev2.getContext(), this.a.g().c, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
            return ev2;
        }
        catch (IOException iOException) {
            et.e("Could not fetching MRAID JS. " + iOException.getMessage());
            return super.shouldInterceptRequest(webView, string);
        }
    }
}

