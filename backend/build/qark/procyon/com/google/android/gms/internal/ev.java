// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.content.Intent;
import org.json.JSONException;
import java.util.Map;
import java.util.HashMap;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.os.Build$VERSION;
import android.content.Context;
import android.webkit.DownloadListener;
import android.webkit.WebView;

public final class ev extends WebView implements DownloadListener
{
    private final ex a;
    private final ew b;
    private final Object c;
    private final is d;
    private final ct e;
    private cc f;
    private x g;
    private boolean h;
    private boolean i;
    
    private ev(final ew b, final x g, final boolean h, final boolean b2, final is d, final ct e) {
        super((Context)b);
        this.c = new Object();
        this.b = b;
        this.g = g;
        this.h = h;
        this.d = d;
        this.e = e;
        this.setBackgroundColor(0);
        final WebSettings settings = this.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        em.a((Context)b, e.c, settings);
        if (Build$VERSION.SDK_INT >= 17) {
            eq.a(this.getContext(), settings);
        }
        else if (Build$VERSION.SDK_INT >= 11) {
            ep.a(this.getContext(), settings);
        }
        this.setDownloadListener((DownloadListener)this);
        if (Build$VERSION.SDK_INT >= 11) {
            this.a = new fj(this, b2);
        }
        else {
            this.a = new ex(this, b2);
        }
        this.setWebViewClient((WebViewClient)this.a);
        if (Build$VERSION.SDK_INT >= 14) {
            this.setWebChromeClient((WebChromeClient)new fk(this));
        }
        else if (Build$VERSION.SDK_INT >= 11) {
            this.setWebChromeClient((WebChromeClient)new fb(this));
        }
        this.i();
    }
    
    public static ev a(final Context context, final x x, final boolean b, final boolean b2, final is is, final ct ct) {
        return new ev(new ew(context), x, b, b2, is, ct);
    }
    
    private void i() {
        while (true) {
            synchronized (this.c) {
                if (this.h || this.g.f) {
                    if (Build$VERSION.SDK_INT < 14) {
                        et.a("Disabling hardware acceleration on an overlay.");
                        this.j();
                    }
                    else {
                        et.a("Enabling hardware acceleration on an overlay.");
                        this.k();
                    }
                    return;
                }
            }
            if (Build$VERSION.SDK_INT < 18) {
                et.a("Disabling hardware acceleration on an AdView.");
                this.j();
                return;
            }
            et.a("Enabling hardware acceleration on an AdView.");
            this.k();
        }
    }
    
    private void j() {
        synchronized (this.c) {
            if (!this.i && Build$VERSION.SDK_INT >= 11) {
                ep.a((View)this);
            }
            this.i = true;
        }
    }
    
    private void k() {
        synchronized (this.c) {
            if (this.i && Build$VERSION.SDK_INT >= 11) {
                ep.b((View)this);
            }
            this.i = false;
        }
    }
    
    public void a() {
        final HashMap<String, String> hashMap = new HashMap<String, String>(1);
        hashMap.put("version", this.e.c);
        this.a("onhide", hashMap);
    }
    
    public void a(final Context baseContext, final x g) {
        synchronized (this.c) {
            this.b.setBaseContext(baseContext);
            this.f = null;
            this.g = g;
            this.h = false;
            em.b(this);
            this.loadUrl("about:blank");
            this.a.b();
        }
    }
    
    public void a(final cc f) {
        synchronized (this.c) {
            this.f = f;
        }
    }
    
    public void a(final x g) {
        synchronized (this.c) {
            this.g = g;
            this.requestLayout();
        }
    }
    
    public void a(String string, final Map map) {
        final StringBuilder obj = new StringBuilder();
        obj.append("javascript:AFMA_ReceiveMessage('");
        obj.append(string);
        obj.append("'");
        Label_0053: {
            if (map == null) {
                break Label_0053;
            }
            try {
                string = em.a(map).toString();
                obj.append(",");
                obj.append(string);
                obj.append(");");
                et.d("Dispatching AFMA event: " + (Object)obj);
                this.loadUrl(obj.toString());
            }
            catch (JSONException ex) {
                et.e("Could not convert AFMA event parameters to JSON.");
            }
        }
    }
    
    public void a(final boolean h) {
        synchronized (this.c) {
            this.h = h;
            this.i();
        }
    }
    
    public void b() {
        final HashMap<String, String> hashMap = new HashMap<String, String>(1);
        hashMap.put("version", this.e.c);
        this.a("onshow", hashMap);
    }
    
    public cc c() {
        synchronized (this.c) {
            return this.f;
        }
    }
    
    public x d() {
        synchronized (this.c) {
            return this.g;
        }
    }
    
    public ex e() {
        return this.a;
    }
    
    public is f() {
        return this.d;
    }
    
    public ct g() {
        return this.e;
    }
    
    public boolean h() {
        synchronized (this.c) {
            return this.h;
        }
    }
    
    public void onDownloadStart(final String str, final String s, final String s2, final String str2, final long n) {
        try {
            final Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str2);
            this.getContext().startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            et.a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str2);
        }
    }
    
    protected void onMeasure(int n, int n2) {
    Label_0080_Outer:
        while (true) {
            final int n3 = Integer.MAX_VALUE;
            while (true) {
                final int mode2;
                final int size2;
                Label_0250: {
                    final int size;
                    Label_0248: {
                        Label_0241: {
                            synchronized (this.c) {
                                if (this.isInEditMode() || this.h) {
                                    super.onMeasure(n, n2);
                                    return;
                                }
                                final int mode = View$MeasureSpec.getMode(n);
                                size = View$MeasureSpec.getSize(n);
                                mode2 = View$MeasureSpec.getMode(n2);
                                size2 = View$MeasureSpec.getSize(n2);
                                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                                    break Label_0241;
                                }
                                break Label_0248;
                                while (true) {
                                    this.setVisibility(4);
                                    Label_0188: {
                                        this.setMeasuredDimension(0, 0);
                                    }
                                    return;
                                    et.e("Not enough space to show ad. Needs " + this.g.h + "x" + this.g.e + " pixels, but only has " + size + "x" + size2 + " pixels.");
                                    continue Label_0080_Outer;
                                }
                            }
                            // iftrue(Label_0206:, this.g.h <= n && this.g.e <= n2)
                            // iftrue(Label_0188:, this.getVisibility() == 8)
                            Label_0206: {
                                if (this.getVisibility() != 8) {
                                    this.setVisibility(0);
                                }
                            }
                            this.setMeasuredDimension(this.g.h, this.g.e);
                            return;
                        }
                        n = Integer.MAX_VALUE;
                        break Label_0250;
                    }
                    n = size;
                }
                if (mode2 != Integer.MIN_VALUE) {
                    n2 = n3;
                    if (mode2 != 1073741824) {
                        continue;
                    }
                }
                n2 = size2;
                continue;
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setContext(final Context baseContext) {
        this.b.setBaseContext(baseContext);
    }
}
