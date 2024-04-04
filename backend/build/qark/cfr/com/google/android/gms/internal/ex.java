/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.UrlQuerySanitizer
 *  android.net.UrlQuerySanitizer$ParameterValuePair
 *  android.net.UrlQuerySanitizer$ValueSanitizer
 *  android.os.Handler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.jj;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.r;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ex
extends WebViewClient {
    protected final ev a;
    private final HashMap b = new HashMap();
    private final Object c = new Object();
    private jt d;
    private ch e;
    private fa f;
    private s g;
    private boolean h = false;
    private boolean i;
    private cm j;

    public ex(ev ev2, boolean bl2) {
        this.a = ev2;
        this.i = bl2;
    }

    private void a(bm bm2) {
        cc.a(this.a.getContext(), bm2);
    }

    private static boolean a(Uri object) {
        if ("http".equalsIgnoreCase((String)(object = object.getScheme())) || "https".equalsIgnoreCase((String)object)) {
            return true;
        }
        return false;
    }

    private void b(Uri uri) {
        String string2 = uri.getPath();
        ad ad2 = (ad)this.b.get((Object)string2);
        if (ad2 != null) {
            HashMap hashMap = new HashMap();
            UrlQuerySanitizer urlQuerySanitizer2 = new UrlQuerySanitizer();
            urlQuerySanitizer2.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer2.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer2.parseUrl(uri.toString());
            for (UrlQuerySanitizer urlQuerySanitizer2 : urlQuerySanitizer2.getParameterList()) {
                hashMap.put((Object)urlQuerySanitizer2.mParameter, (Object)urlQuerySanitizer2.mValue);
            }
            if (et.a(2)) {
                et.d("Received GMSG: " + string2);
                for (String string2 : hashMap.keySet()) {
                    et.d("  " + string2 + ": " + (String)hashMap.get((Object)string2));
                }
            }
            ad2.a(this.a, (Map)hashMap);
            return;
        }
        et.e("No GMSG handler found for GMSG: " + (Object)uri);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(bj bj2) {
        ch ch2 = null;
        boolean bl2 = this.a.h();
        jt jt2 = bl2 && !this.a.d().f ? null : this.d;
        if (!bl2) {
            ch2 = this.e;
        }
        this.a(new bm(bj2, jt2, ch2, this.j, this.a.g()));
    }

    public final void a(fa fa2) {
        this.f = fa2;
    }

    public void a(jt jt2, ch ch2, s s2, cm cm2, boolean bl2) {
        this.a("/appEvent", new r(s2));
        this.a("/canOpenURLs", t.a);
        this.a("/click", t.b);
        this.a("/close", t.c);
        this.a("/customClose", t.d);
        this.a("/httpTrack", t.e);
        this.a("/log", t.f);
        this.a("/open", t.g);
        this.a("/touch", t.h);
        this.a("/video", t.i);
        this.d = jt2;
        this.e = ch2;
        this.g = s2;
        this.j = cm2;
        this.a(bl2);
    }

    public final void a(String string, ad ad2) {
        this.b.put((Object)string, (Object)ad2);
    }

    public final void a(boolean bl2) {
        this.h = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl2, int n2) {
        jt jt2 = this.a.h() && !this.a.d().f ? null : this.d;
        this.a(new bm(jt2, this.e, this.j, this.a, bl2, n2, this.a.g()));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl2, int n2, String string) {
        ch ch2 = null;
        boolean bl3 = this.a.h();
        jt jt2 = bl3 && !this.a.d().f ? null : this.d;
        if (!bl3) {
            ch2 = this.e;
        }
        this.a(new bm(jt2, ch2, this.g, this.j, this.a, bl2, n2, string, this.a.g()));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl2, int n2, String string, String string2) {
        ch ch2 = null;
        boolean bl3 = this.a.h();
        jt jt2 = bl3 && !this.a.d().f ? null : this.d;
        if (!bl3) {
            ch2 = this.e;
        }
        this.a(new bm(jt2, ch2, this.g, this.j, this.a, bl2, n2, string, string2, this.a.g()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        Object object = this.c;
        synchronized (object) {
            return this.i;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.c;
        synchronized (object) {
            this.b.clear();
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            this.i = false;
            this.j = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.c;
        synchronized (object) {
            this.h = false;
            this.i = true;
            cc cc2 = this.a.c();
            if (cc2 != null) {
                if (!es.b()) {
                    es.a.post((Runnable)new ez(this, cc2));
                } else {
                    cc2.j();
                }
            }
            return;
        }
    }

    public final void onPageFinished(WebView webView, String string) {
        if (this.f != null) {
            this.f.a(this.a);
            this.f = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
        et.d("AdWebView shouldOverrideUrlLoading: " + string);
        Uri uri = Uri.parse((String)string);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            this.b(uri);
            return true;
        }
        if (this.h && webView == this.a && ex.a(uri)) {
            return super.shouldOverrideUrlLoading(webView, string);
        }
        if (this.a.willNotDraw()) {
            et.e("AdWebView unable to handle URL: " + string);
            return true;
        }
        try {
            is is2 = this.a.f();
            webView = uri;
            if (is2 != null) {
                webView = uri;
                if (is2.a(uri)) {
                    webView = is2.a(uri, this.a.getContext());
                }
            }
        }
        catch (jj jj2) {
            et.e("Unable to append parameter to URL: " + string);
            webView = uri;
        }
        this.a(new bj("android.intent.action.VIEW", webView.toString(), null, null, null, null, null));
        return true;
    }
}

