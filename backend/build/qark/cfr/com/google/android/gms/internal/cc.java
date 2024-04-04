/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.cd;
import com.google.android.gms.internal.ce;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.cl;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.ep;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.x;

public final class cc
extends cq {
    private final Activity a;
    private bm b;
    private ci c;
    private ev d;
    private cf e;
    private cl f;
    private FrameLayout g;
    private WebChromeClient.CustomViewCallback h;
    private boolean i = false;
    private boolean j = false;
    private RelativeLayout k;

    public cc(Activity activity) {
        this.a = activity;
    }

    public static void a(Context context, bm bm2) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bm2.o.f);
        bm.a(intent, bm2);
        intent.addFlags(524288);
        context.startActivity(intent);
    }

    private static RelativeLayout.LayoutParams c(int n2, int n3, int n4, int n5) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n4, n5);
        layoutParams.setMargins(n2, n3, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(boolean bl2) {
        this.a.requestWindowFeature(1);
        Window window = this.a.getWindow();
        window.setFlags(1024, 1024);
        this.a(this.b.l);
        if (Build.VERSION.SDK_INT >= 11) {
            et.a("Enabling hardware acceleration on the AdActivity window.");
            ep.a(window);
        }
        this.k = new RelativeLayout((Context)this.a);
        this.k.setBackgroundColor(-16777216);
        this.a.setContentView((View)this.k);
        boolean bl3 = this.b.f.e().a();
        if (bl2) {
            this.d = ev.a((Context)this.a, this.b.f.d(), true, bl3, null, this.b.o);
            this.d.e().a(null, null, this.b.g, this.b.k, true);
            this.d.e().a(new cd(this));
            if (this.b.n != null) {
                this.d.loadUrl(this.b.n);
            } else {
                if (this.b.j == null) {
                    throw new ce("No URL or HTML to display in ad overlay.");
                }
                this.d.loadDataWithBaseURL(this.b.h, this.b.j, "text/html", "UTF-8", null);
            }
        } else {
            this.d = this.b.f;
            this.d.setContext((Context)this.a);
        }
        this.d.a(this);
        this.k.addView((View)this.d, -1, -1);
        if (!bl2) {
            this.d.b();
        }
        this.a(bl3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void k() {
        block6 : {
            block5 : {
                if (!this.a.isFinishing() || this.j) break block5;
                this.j = true;
                if (!this.a.isFinishing()) break block5;
                if (this.d != null) {
                    this.d.a();
                    this.k.removeView((View)this.d);
                    if (this.e != null) {
                        this.d.a(false);
                        this.e.c.addView((View)this.d, this.e.a, this.e.b);
                    }
                }
                if (this.b != null && this.b.e != null) break block6;
            }
            return;
        }
        this.b.e.o();
    }

    public void a() {
        this.a.finish();
    }

    public void a(int n2) {
        this.a.setRequestedOrientation(n2);
    }

    public void a(int n2, int n3, int n4, int n5) {
        if (this.c != null) {
            this.c.setLayoutParams((ViewGroup.LayoutParams)cc.c(n2, n3, n4, n5));
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(Bundle var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:366)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.g = new FrameLayout((Context)this.a);
        this.g.setBackgroundColor(-16777216);
        this.g.addView(view, -1, -1);
        this.a.setContentView((View)this.g);
        this.h = customViewCallback;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(boolean bl2) {
        int n2 = bl2 ? 50 : 32;
        this.f = new cl(this.a, n2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        n2 = bl2 ? 11 : 9;
        layoutParams.addRule(n2);
        this.f.a(this.b.i);
        this.k.addView((View)this.f, (ViewGroup.LayoutParams)layoutParams);
    }

    public ci b() {
        return this.c;
    }

    public void b(int n2, int n3, int n4, int n5) {
        if (this.c == null) {
            this.c = new ci((Context)this.a, this.d);
            this.k.addView((View)this.c, 0, (ViewGroup.LayoutParams)cc.c(n2, n3, n4, n5));
            this.d.e().a(false);
        }
    }

    @Override
    public void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    public void b(boolean bl2) {
        if (this.f != null) {
            this.f.a(bl2);
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

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f() {
        if (this.b != null && this.b.m == 4) {
            if (this.i) {
                this.a.finish();
            } else {
                this.i = true;
            }
        }
        if (this.d != null) {
            em.b(this.d);
        }
    }

    @Override
    public void g() {
        if (this.c != null) {
            this.c.c();
        }
        this.c();
        if (!(this.d == null || this.a.isFinishing() && this.e != null)) {
            em.a(this.d);
        }
        this.k();
    }

    @Override
    public void h() {
        this.k();
    }

    @Override
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

