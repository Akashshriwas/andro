// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import android.view.View;
import android.os.Build$VERSION;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Intent;
import android.content.Context;
import android.widget.RelativeLayout;
import android.webkit.WebChromeClient$CustomViewCallback;
import android.widget.FrameLayout;
import android.app.Activity;

public final class cc extends cq
{
    private final Activity a;
    private bm b;
    private ci c;
    private ev d;
    private cf e;
    private cl f;
    private FrameLayout g;
    private WebChromeClient$CustomViewCallback h;
    private boolean i;
    private boolean j;
    private RelativeLayout k;
    
    public cc(final Activity a) {
        this.i = false;
        this.j = false;
        this.a = a;
    }
    
    public static void a(final Context context, final bm bm) {
        final Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bm.o.f);
        bm.a(intent, bm);
        intent.addFlags(524288);
        context.startActivity(intent);
    }
    
    private static RelativeLayout$LayoutParams c(final int n, final int n2, final int n3, final int n4) {
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(n3, n4);
        relativeLayout$LayoutParams.setMargins(n, n2, 0, 0);
        relativeLayout$LayoutParams.addRule(10);
        relativeLayout$LayoutParams.addRule(9);
        return relativeLayout$LayoutParams;
    }
    
    private void c(final boolean b) {
        this.a.requestWindowFeature(1);
        final Window window = this.a.getWindow();
        window.setFlags(1024, 1024);
        this.a(this.b.l);
        if (Build$VERSION.SDK_INT >= 11) {
            et.a("Enabling hardware acceleration on the AdActivity window.");
            ep.a(window);
        }
        (this.k = new RelativeLayout((Context)this.a)).setBackgroundColor(-16777216);
        this.a.setContentView((View)this.k);
        final boolean a = this.b.f.e().a();
        if (b) {
            this.d = ev.a((Context)this.a, this.b.f.d(), true, a, null, this.b.o);
            this.d.e().a(null, null, this.b.g, this.b.k, true);
            this.d.e().a(new cd(this));
            if (this.b.n != null) {
                this.d.loadUrl(this.b.n);
            }
            else {
                if (this.b.j == null) {
                    throw new ce("No URL or HTML to display in ad overlay.");
                }
                this.d.loadDataWithBaseURL(this.b.h, this.b.j, "text/html", "UTF-8", (String)null);
            }
        }
        else {
            (this.d = this.b.f).setContext((Context)this.a);
        }
        this.d.a(this);
        this.k.addView((View)this.d, -1, -1);
        if (!b) {
            this.d.b();
        }
        this.a(a);
    }
    
    private void k() {
        if (this.a.isFinishing() && !this.j) {
            this.j = true;
            if (this.a.isFinishing()) {
                if (this.d != null) {
                    this.d.a();
                    this.k.removeView((View)this.d);
                    if (this.e != null) {
                        this.d.a(false);
                        this.e.c.addView((View)this.d, this.e.a, this.e.b);
                    }
                }
                if (this.b != null && this.b.e != null) {
                    this.b.e.o();
                }
            }
        }
    }
    
    public void a() {
        this.a.finish();
    }
    
    public void a(final int requestedOrientation) {
        this.a.setRequestedOrientation(requestedOrientation);
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
        if (this.c != null) {
            this.c.setLayoutParams((ViewGroup$LayoutParams)c(n, n2, n3, n4));
        }
    }
    
    public void a(final Bundle bundle) {
        boolean boolean1 = false;
        if (bundle != null) {
            boolean1 = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.i = boolean1;
        Label_0068: {
            try {
                this.b = bm.a(this.a.getIntent());
                if (this.b == null) {
                    throw new ce("Could not get info for ad overlay.");
                }
                break Label_0068;
            }
            catch (ce ce) {
                et.e(ce.getMessage());
                this.a.finish();
            }
            return;
        }
        if (bundle == null) {
            if (this.b.e != null) {
                this.b.e.p();
            }
            if (this.b.m != 1 && this.b.d != null) {
                this.b.d.r();
            }
        }
        switch (this.b.m) {
            case 1: {
                this.c(false);
            }
            case 2: {
                this.e = new cf(this.b.f);
                this.c(false);
            }
            case 3: {
                this.c(true);
            }
            case 4: {
                if (this.i) {
                    this.a.finish();
                    return;
                }
                if (!by.a((Context)this.a, this.b.c, this.b.k)) {
                    this.a.finish();
                }
            }
            default: {
                throw new ce("Could not determine ad overlay type.");
            }
        }
    }
    
    public void a(final View view, final WebChromeClient$CustomViewCallback h) {
        (this.g = new FrameLayout((Context)this.a)).setBackgroundColor(-16777216);
        this.g.addView(view, -1, -1);
        this.a.setContentView((View)this.g);
        this.h = h;
    }
    
    public void a(final boolean b) {
        int n;
        if (b) {
            n = 50;
        }
        else {
            n = 32;
        }
        this.f = new cl(this.a, n);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-2, -2);
        relativeLayout$LayoutParams.addRule(10);
        int n2;
        if (b) {
            n2 = 11;
        }
        else {
            n2 = 9;
        }
        relativeLayout$LayoutParams.addRule(n2);
        this.f.a(this.b.i);
        this.k.addView((View)this.f, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
    }
    
    public ci b() {
        return this.c;
    }
    
    public void b(final int n, final int n2, final int n3, final int n4) {
        if (this.c == null) {
            this.c = new ci((Context)this.a, this.d);
            this.k.addView((View)this.c, 0, (ViewGroup$LayoutParams)c(n, n2, n3, n4));
            this.d.e().a(false);
        }
    }
    
    public void b(final Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }
    
    public void b(final boolean b) {
        if (this.f != null) {
            this.f.a(b);
        }
    }
    
    public void c() {
        if (this.b != null) {
            this.a(this.b.l);
        }
        if (this.g != null) {
            this.a.setContentView((View)this.k);
            this.g.removeAllViews();
            this.g = null;
        }
        if (this.h != null) {
            this.h.onCustomViewHidden();
            this.h = null;
        }
    }
    
    public void d() {
    }
    
    public void e() {
    }
    
    public void f() {
        if (this.b != null && this.b.m == 4) {
            if (this.i) {
                this.a.finish();
            }
            else {
                this.i = true;
            }
        }
        if (this.d != null) {
            em.b(this.d);
        }
    }
    
    public void g() {
        if (this.c != null) {
            this.c.c();
        }
        this.c();
        if (this.d != null && (!this.a.isFinishing() || this.e == null)) {
            em.a(this.d);
        }
        this.k();
    }
    
    public void h() {
        this.k();
    }
    
    public void i() {
        if (this.c != null) {
            this.c.a();
        }
        if (this.d != null) {
            this.k.removeView((View)this.d);
        }
        this.k();
    }
    
    public void j() {
        this.k.removeView((View)this.f);
        this.a(true);
    }
}
