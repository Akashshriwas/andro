// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import android.net.UrlQuerySanitizer$ParameterValuePair;
import android.net.UrlQuerySanitizer;
import android.net.Uri;
import java.util.HashMap;
import android.webkit.WebViewClient;

public class ex extends WebViewClient
{
    protected final ev a;
    private final HashMap b;
    private final Object c;
    private jt d;
    private ch e;
    private fa f;
    private s g;
    private boolean h;
    private boolean i;
    private cm j;
    
    public ex(final ev a, final boolean i) {
        this.b = new HashMap();
        this.c = new Object();
        this.h = false;
        this.a = a;
        this.i = i;
    }
    
    private void a(final bm bm) {
        cc.a(this.a.getContext(), bm);
    }
    
    private static boolean a(final Uri uri) {
        final String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }
    
    private void b(final Uri obj) {
        final String path = obj.getPath();
        final ad ad = this.b.get(path);
        if (ad != null) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(obj.toString());
            for (final UrlQuerySanitizer$ParameterValuePair urlQuerySanitizer$ParameterValuePair : urlQuerySanitizer.getParameterList()) {
                hashMap.put(urlQuerySanitizer$ParameterValuePair.mParameter, urlQuerySanitizer$ParameterValuePair.mValue);
            }
            if (et.a(2)) {
                et.d("Received GMSG: " + path);
                for (final String s : hashMap.keySet()) {
                    et.d("  " + s + ": " + hashMap.get(s));
                }
            }
            ad.a(this.a, hashMap);
            return;
        }
        et.e("No GMSG handler found for GMSG: " + obj);
    }
    
    public final void a(final bj bj) {
        ch e = null;
        final boolean h = this.a.h();
        jt d;
        if (h && !this.a.d().f) {
            d = null;
        }
        else {
            d = this.d;
        }
        if (!h) {
            e = this.e;
        }
        this.a(new bm(bj, d, e, this.j, this.a.g()));
    }
    
    public final void a(final fa f) {
        this.f = f;
    }
    
    public void a(final jt d, final ch e, final s g, final cm j, final boolean b) {
        this.a("/appEvent", new r(g));
        this.a("/canOpenURLs", t.a);
        this.a("/click", t.b);
        this.a("/close", t.c);
        this.a("/customClose", t.d);
        this.a("/httpTrack", t.e);
        this.a("/log", t.f);
        this.a("/open", t.g);
        this.a("/touch", t.h);
        this.a("/video", t.i);
        this.d = d;
        this.e = e;
        this.g = g;
        this.j = j;
        this.a(b);
    }
    
    public final void a(final String key, final ad value) {
        this.b.put(key, value);
    }
    
    public final void a(final boolean h) {
        this.h = h;
    }
    
    public final void a(final boolean b, final int n) {
        jt d;
        if (this.a.h() && !this.a.d().f) {
            d = null;
        }
        else {
            d = this.d;
        }
        this.a(new bm(d, this.e, this.j, this.a, b, n, this.a.g()));
    }
    
    public final void a(final boolean b, final int n, final String s) {
        ch e = null;
        final boolean h = this.a.h();
        jt d;
        if (h && !this.a.d().f) {
            d = null;
        }
        else {
            d = this.d;
        }
        if (!h) {
            e = this.e;
        }
        this.a(new bm(d, e, this.g, this.j, this.a, b, n, s, this.a.g()));
    }
    
    public final void a(final boolean b, final int n, final String s, final String s2) {
        ch e = null;
        final boolean h = this.a.h();
        jt d;
        if (h && !this.a.d().f) {
            d = null;
        }
        else {
            d = this.d;
        }
        if (!h) {
            e = this.e;
        }
        this.a(new bm(d, e, this.g, this.j, this.a, b, n, s, s2, this.a.g()));
    }
    
    public boolean a() {
        synchronized (this.c) {
            return this.i;
        }
    }
    
    public final void b() {
        synchronized (this.c) {
            this.b.clear();
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            this.i = false;
            this.j = null;
        }
    }
    
    public final void c() {
        synchronized (this.c) {
            this.h = false;
            this.i = true;
            final cc c = this.a.c();
            if (c != null) {
                if (!es.b()) {
                    es.a.post((Runnable)new ez(this, c));
                }
                else {
                    c.j();
                }
            }
        }
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        if (this.f != null) {
            this.f.a(this.a);
            this.f = null;
        }
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String str) {
        et.d("AdWebView shouldOverrideUrlLoading: " + str);
        final Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            this.b(parse);
        }
        else {
            if (this.h && webView == this.a && a(parse)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!this.a.willNotDraw()) {
                while (true) {
                    try {
                        final is f = this.a.f();
                        Uri a = parse;
                        if (f != null) {
                            a = parse;
                            if (f.a(parse)) {
                                a = f.a(parse, this.a.getContext());
                            }
                        }
                        this.a(new bj("android.intent.action.VIEW", a.toString(), null, null, null, null, null));
                        return true;
                    }
                    catch (jj jj) {
                        et.e("Unable to append parameter to URL: " + str);
                        final Uri a = parse;
                        continue;
                    }
                    break;
                }
            }
            et.e("AdWebView unable to handle URL: " + str);
        }
        return true;
    }
}
