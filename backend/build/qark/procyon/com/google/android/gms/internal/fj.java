// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.net.URLConnection;
import java.io.IOException;
import java.io.File;
import android.webkit.WebView;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import android.webkit.WebResourceResponse;
import android.content.Context;

public final class fj extends ex
{
    public fj(final ev ev, final boolean b) {
        super(ev, b);
    }
    
    private static WebResourceResponse a(final Context context, final String s, String spec) {
        spec = (String)new URL(spec).openConnection();
        try {
            em.a(context, s, true, (HttpURLConnection)spec);
            ((URLConnection)spec).connect();
            return new WebResourceResponse("application/javascript", "UTF-8", (InputStream)new ByteArrayInputStream(em.a(new InputStreamReader(((URLConnection)spec).getInputStream())).getBytes("UTF-8")));
        }
        finally {
            ((HttpURLConnection)spec).disconnect();
        }
    }
    
    public WebResourceResponse shouldInterceptRequest(final WebView webView, final String pathname) {
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(pathname).getName())) {
                return super.shouldInterceptRequest(webView, pathname);
            }
            if (!(webView instanceof ev)) {
                et.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webView, pathname);
            }
            final ev ev = (ev)webView;
            ev.e().c();
            if (ev.d().f) {
                et.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return a(ev.getContext(), this.a.g().c, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (ev.h()) {
                et.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return a(ev.getContext(), this.a.g().c, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            et.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            return a(ev.getContext(), this.a.g().c, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ex) {
            et.e("Could not fetching MRAID JS. " + ex.getMessage());
            return super.shouldInterceptRequest(webView, pathname);
        }
    }
}
