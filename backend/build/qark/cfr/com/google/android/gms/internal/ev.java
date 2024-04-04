/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.webkit.DownloadListener
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONException
 */
package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.ep;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public final class ev
extends WebView
implements DownloadListener {
    private final ex a;
    private final ew b;
    private final Object c = new Object();
    private final is d;
    private final ct e;
    private cc f;
    private x g;
    private boolean h;
    private boolean i;

    /*
     * Enabled aggressive block sorting
     */
    private ev(ew ew2, x x2, boolean bl2, boolean bl3, is is2, ct ct2) {
        super((Context)ew2);
        this.b = ew2;
        this.g = x2;
        this.h = bl2;
        this.d = is2;
        this.e = ct2;
        this.setBackgroundColor(0);
        x2 = this.getSettings();
        x2.setJavaScriptEnabled(true);
        x2.setSavePassword(false);
        x2.setSupportMultipleWindows(true);
        x2.setJavaScriptCanOpenWindowsAutomatically(true);
        em.a((Context)ew2, ct2.c, (WebSettings)x2);
        if (Build.VERSION.SDK_INT >= 17) {
            eq.a(this.getContext(), (WebSettings)x2);
        } else if (Build.VERSION.SDK_INT >= 11) {
            ep.a(this.getContext(), (WebSettings)x2);
        }
        this.setDownloadListener((DownloadListener)this);
        this.a = Build.VERSION.SDK_INT >= 11 ? new fj(this, bl3) : new ex(this, bl3);
        this.setWebViewClient((WebViewClient)this.a);
        if (Build.VERSION.SDK_INT >= 14) {
            this.setWebChromeClient((WebChromeClient)new fk(this));
        } else if (Build.VERSION.SDK_INT >= 11) {
            this.setWebChromeClient((WebChromeClient)new fb(this));
        }
        this.i();
    }

    public static ev a(Context context, x x2, boolean bl2, boolean bl3, is is2, ct ct2) {
        return new ev(new ew(context), x2, bl2, bl3, is2, ct2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i() {
        Object object = this.c;
        synchronized (object) {
            if (this.h || this.g.f) {
                if (Build.VERSION.SDK_INT < 14) {
                    et.a("Disabling hardware acceleration on an overlay.");
                    this.j();
                } else {
                    et.a("Enabling hardware acceleration on an overlay.");
                    this.k();
                }
            } else if (Build.VERSION.SDK_INT < 18) {
                et.a("Disabling hardware acceleration on an AdView.");
                this.j();
            } else {
                et.a("Enabling hardware acceleration on an AdView.");
                this.k();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j() {
        Object object = this.c;
        synchronized (object) {
            if (!this.i && Build.VERSION.SDK_INT >= 11) {
                ep.a((View)this);
            }
            this.i = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k() {
        Object object = this.c;
        synchronized (object) {
            if (this.i && Build.VERSION.SDK_INT >= 11) {
                ep.b((View)this);
            }
            this.i = false;
            return;
        }
    }

    public void a() {
        HashMap hashMap = new HashMap(1);
        hashMap.put((Object)"version", (Object)this.e.c);
        this.a("onhide", (Map)hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context context, x x2) {
        Object object = this.c;
        synchronized (object) {
            this.b.setBaseContext(context);
            this.f = null;
            this.g = x2;
            this.h = false;
            em.b(this);
            this.loadUrl("about:blank");
            this.a.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(cc cc2) {
        Object object = this.c;
        synchronized (object) {
            this.f = cc2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(x x2) {
        Object object = this.c;
        synchronized (object) {
            this.g = x2;
            this.requestLayout();
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(String string, Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:AFMA_ReceiveMessage('");
        stringBuilder.append(string);
        stringBuilder.append("'");
        if (map != null) {
            string = em.a(map).toString();
            stringBuilder.append(",");
            stringBuilder.append(string);
        }
        stringBuilder.append(");");
        et.d("Dispatching AFMA event: " + (Object)stringBuilder);
        this.loadUrl(stringBuilder.toString());
        return;
        catch (JSONException jSONException) {
            et.e("Could not convert AFMA event parameters to JSON.");
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(boolean bl2) {
        Object object = this.c;
        synchronized (object) {
            this.h = bl2;
            this.i();
            return;
        }
    }

    public void b() {
        HashMap hashMap = new HashMap(1);
        hashMap.put((Object)"version", (Object)this.e.c);
        this.a("onshow", (Map)hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public cc c() {
        Object object = this.c;
        synchronized (object) {
            return this.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public x d() {
        Object object = this.c;
        synchronized (object) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean h() {
        Object object = this.c;
        synchronized (object) {
            return this.h;
        }
    }

    public void onDownloadStart(String string, String string2, String string3, String string4, long l2) {
        try {
            string2 = new Intent("android.intent.action.VIEW");
            string2.setDataAndType(Uri.parse((String)string), string4);
            this.getContext().startActivity((Intent)string2);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            et.a("Couldn't find an Activity to view url/mimetype: " + string + " / " + string4);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onMeasure(int n2, int n3) {
        int n4 = Integer.MAX_VALUE;
        Object object = this.c;
        synchronized (object) {
            int n5;
            int n6;
            block12 : {
                block11 : {
                    if (this.isInEditMode() || this.h) {
                        super.onMeasure(n2, n3);
                        return;
                    }
                    int n7 = View.MeasureSpec.getMode((int)n2);
                    n5 = View.MeasureSpec.getSize((int)n2);
                    int n8 = View.MeasureSpec.getMode((int)n3);
                    n6 = View.MeasureSpec.getSize((int)n3);
                    n2 = n7 != Integer.MIN_VALUE && n7 != 1073741824 ? Integer.MAX_VALUE : n5;
                    if (n8 == Integer.MIN_VALUE) break block11;
                    n3 = n4;
                    if (n8 != 1073741824) break block12;
                }
                n3 = n6;
            }
            if (this.g.h > n2 || this.g.e > n3) {
                et.e("Not enough space to show ad. Needs " + this.g.h + "x" + this.g.e + " pixels, but only has " + n5 + "x" + n6 + " pixels.");
                if (this.getVisibility() != 8) {
                    this.setVisibility(4);
                }
                this.setMeasuredDimension(0, 0);
            } else {
                if (this.getVisibility() != 8) {
                    this.setVisibility(0);
                }
                this.setMeasuredDimension(this.g.h, this.g.e);
            }
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContext(Context context) {
        this.b.setBaseContext(context);
    }
}

