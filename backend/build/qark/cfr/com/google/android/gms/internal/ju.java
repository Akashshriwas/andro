/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.ViewSwitcher
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ViewSwitcher;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.an;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.at;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.cw;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ed;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.List;

public final class ju
extends f
implements an,
ch,
cm,
cx,
jt,
s {
    private final bl a;
    private final jv b;
    private final jw c;

    public ju(Context context, x x2, String string, bl bl2, ct ct2) {
        this.b = new jv(context, x2, string, ct2);
        this.a = bl2;
        this.c = new jw(this);
        et.c("Use AdRequest.Builder.addTestDevice(\"" + es.a(context) + "\") to get test ads on this device.");
        em.b(context);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(int n2) {
        et.e("Failed to load ad: " + n2);
        if (this.b.f == null) return;
        try {
            this.b.f.a(n2);
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not call AdListener.onAdFailedToLoad().", (Throwable)remoteException);
            return;
        }
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        this.b.a.addView(view, layoutParams);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(boolean bl2) {
        if (this.b.i == null) {
            et.e("Ad state was null when trying to ping impression URLs.");
            return;
        } else {
            et.a("Pinging Impression URLs.");
            if (this.b.i.e != null) {
                em.a(this.b.c, this.b.e.c, this.b.i.e);
            }
            if (this.b.i.n != null && this.b.i.n.d != null) {
                at.a(this.b.c, this.b.e.c, this.b.i, this.b.b, bl2, this.b.i.n.d);
            }
            if (this.b.i.k == null || this.b.i.k.e == null) return;
            {
                at.a(this.b.c, this.b.e.c, this.b.i, this.b.b, bl2, this.b.i.k.e);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(ec ec2) {
        if (ec2.j) {
            try {
                ec2 = (View)d.a(ec2.l.a());
            }
            catch (RemoteException remoteException) {
                et.b("Could not get View from mediation adapter.", (Throwable)remoteException);
                return false;
            }
            View view = this.b.a.getNextView();
            if (view != null) {
                this.b.a.removeView(view);
            }
            try {
                this.a((View)ec2);
            }
            catch (Throwable throwable) {
                et.b("Could not add mediation view to view hierarchy.", throwable);
                return false;
            }
        } else if (ec2.q != null) {
            ec2.b.a(ec2.q);
            this.b.a.removeAllViews();
            this.b.a.setMinimumWidth(ec2.q.h);
            this.b.a.setMinimumHeight(ec2.q.e);
            this.a((View)ec2.b);
        }
        if (this.b.a.getChildCount() > 1) {
            this.b.a.showNext();
        }
        if (this.b.i != null) {
            ec2 = this.b.a.getNextView();
            if (ec2 instanceof ev) {
                ((ev)((Object)ec2)).a(this.b.c, this.b.h);
            } else if (ec2 != null) {
                this.b.a.removeView((View)ec2);
            }
            if (this.b.i.l != null) {
                try {
                    this.b.i.l.c();
                }
                catch (RemoteException remoteException) {
                    et.e("Could not destroy previous mediation adapter.");
                }
            }
        }
        this.b.a.setVisibility(0);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private dl c(v v2) {
        DisplayMetrics displayMetrics;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.b.c.getApplicationInfo();
        try {
            packageInfo = this.b.c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            packageInfo = null;
        }
        if (!this.b.h.f && this.b.a.getParent() != null) {
            displayMetrics = new int[2];
            this.b.a.getLocationOnScreen((int[])displayMetrics);
            int n2 = displayMetrics[0];
            int n3 = displayMetrics[1];
            displayMetrics = this.b.c.getResources().getDisplayMetrics();
            int n4 = this.b.a.getWidth();
            int n5 = this.b.a.getHeight();
            int n6 = this.b.a.isShown() && n2 + n4 > 0 && n3 + n5 > 0 && n2 <= displayMetrics.widthPixels && n3 <= displayMetrics.heightPixels ? 1 : 0;
            displayMetrics = new Bundle(5);
            displayMetrics.putInt("x", n2);
            displayMetrics.putInt("y", n3);
            displayMetrics.putInt("width", n4);
            displayMetrics.putInt("height", n5);
            displayMetrics.putInt("visible", n6);
            return new dl((Bundle)displayMetrics, v2, this.b.h, this.b.b, applicationInfo, packageInfo, ed.a(), ed.a, this.b.e);
        }
        displayMetrics = null;
        return new dl((Bundle)displayMetrics, v2, this.b.h, this.b.b, applicationInfo, packageInfo, ed.a(), ed.a, this.b.e);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void s() {
        et.c("Ad closing.");
        if (this.b.f == null) return;
        try {
            this.b.f.a();
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not call AdListener.onAdClosed().", (Throwable)remoteException);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void t() {
        et.c("Ad leaving application.");
        if (this.b.f == null) return;
        try {
            this.b.f.b();
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not call AdListener.onAdLeftApplication().", (Throwable)remoteException);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void u() {
        et.c("Ad opening.");
        if (this.b.f == null) return;
        try {
            this.b.f.d();
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not call AdListener.onAdOpened().", (Throwable)remoteException);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void v() {
        et.c("Ad finished loading.");
        if (this.b.f == null) return;
        try {
            this.b.f.c();
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not call AdListener.onAdLoaded().", (Throwable)remoteException);
            return;
        }
    }

    private boolean w() {
        boolean bl2 = true;
        if (!em.a(this.b.c.getPackageManager(), this.b.c.getPackageName(), "android.permission.INTERNET")) {
            if (!this.b.h.f) {
                es.a((ViewGroup)this.b.a, this.b.h, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            bl2 = false;
        }
        if (!em.a(this.b.c)) {
            if (!this.b.h.f) {
                es.a((ViewGroup)this.b.a, this.b.h, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            bl2 = false;
        }
        if (!bl2 && !this.b.h.f) {
            this.b.a.setVisibility(0);
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void x() {
        if (this.b.i == null) {
            et.e("Ad state was null when trying to ping click URLs.");
            return;
        } else {
            et.a("Pinging click URLs.");
            if (this.b.i.c != null) {
                em.a(this.b.c, this.b.e.c, this.b.i.c);
            }
            if (this.b.i.n == null || this.b.i.n.c == null) return;
            {
                at.a(this.b.c, this.b.e.c, this.b.i, this.b.b, false, this.b.i.n.c);
                return;
            }
        }
    }

    private void y() {
        if (this.b.i != null) {
            this.b.i.b.destroy();
            this.b.i = null;
        }
    }

    @Override
    public a a() {
        hc.b("getAdFrame must be called on the main UI thread.");
        return d.a((Object)this.b.a);
    }

    @Override
    public void a(b b2) {
        hc.b("setAdListener must be called on the main UI thread.");
        this.b.f = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(ec ec2) {
        this.b.g = null;
        if (ec2.d == -1) {
            return;
        }
        boolean bl2 = ec2.a.d != null ? ec2.a.d.getBoolean("_noRefresh", false) : false;
        if (this.b.h.f) {
            em.a(ec2.b);
        } else if (ec2.h > 0L) {
            this.c.a(ec2.a, ec2.h);
        } else if (ec2.n != null && ec2.n.g > 0L) {
            this.c.a(ec2.a, ec2.n.g);
        } else if (!ec2.j && ec2.d == 2) {
            this.c.a(ec2.a);
        }
        if (ec2.d == 3 && ec2.n != null && ec2.n.e != null) {
            et.a("Pinging no fill URLs.");
            at.a(this.b.c, this.b.e.c, ec2, this.b.b, false, ec2.n.e);
        }
        if (ec2.d != -2) {
            this.a(ec2.d);
            return;
        }
        if (!this.b.h.f && !this.b(ec2)) {
            this.a(0);
            return;
        }
        if (this.b.i != null && this.b.i.o != null) {
            this.b.i.o.a((an)null);
        }
        if (ec2.o != null) {
            ec2.o.a(this);
        }
        this.b.i = ec2;
        if (ec2.q != null) {
            this.b.h = ec2.q;
        }
        if (!this.b.h.f) {
            this.a(false);
        }
        this.v();
    }

    @Override
    public void a(k k2) {
        hc.b("setAppEventListener must be called on the main UI thread.");
        this.b.j = k2;
    }

    @Override
    public void a(x x2) {
        hc.b("setAdSize must be called on the main UI thread.");
        this.b.h = x2;
        if (this.b.i != null) {
            this.b.i.b.a(x2);
        }
        if (this.b.a.getChildCount() > 1) {
            this.b.a.removeView(this.b.a.getNextView());
        }
        this.b.a.setMinimumWidth(x2.h);
        this.b.a.setMinimumHeight(x2.e);
        this.b.a.requestLayout();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(String string, String string2) {
        if (this.b.j == null) return;
        try {
            this.b.j.a(string, string2);
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not call the AppEventListener.", (Throwable)remoteException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean a(v object) {
        hc.b("loadAd must be called on the main UI thread.");
        if (this.b.g != null) {
            et.e("An ad request is already in progress. Aborting.");
            return false;
        }
        if (this.b.h.f && this.b.i != null) {
            et.e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (!this.w()) return false;
        et.c("Starting ad request.");
        this.c.a();
        dl dl2 = this.c((v)object);
        if (this.b.h.f) {
            object = ev.a(this.b.c, this.b.h, false, false, this.b.d, this.b.e);
            object.e().a(this, null, this, this, true);
        } else {
            object = this.b.a.getNextView();
            if (object instanceof ev) {
                object = (ev)((Object)object);
                object.a(this.b.c, this.b.h);
            } else {
                if (object != null) {
                    this.b.a.removeView((View)object);
                }
                ev ev2 = ev.a(this.b.c, this.b.h, false, false, this.b.d, this.b.e);
                object = ev2;
                if (this.b.h.i == null) {
                    this.a((View)ev2);
                    object = ev2;
                }
            }
            object.e().a(this, this, this, this, false);
        }
        this.b.g = cw.a(this.b.c, dl2, this.b.d, (ev)((Object)object), this.a, this);
        return true;
    }

    @Override
    public void b() {
        hc.b("destroy must be called on the main UI thread.");
        this.b.f = null;
        this.b.j = null;
        this.c.a();
        this.g();
        if (this.b.a != null) {
            this.b.a.removeAllViews();
        }
        if (this.b.i != null && this.b.i.b != null) {
            this.b.i.b.destroy();
        }
    }

    public void b(v v2) {
        ViewParent viewParent = this.b.a.getParent();
        if (viewParent instanceof View && ((View)viewParent).isShown() && em.a()) {
            this.a(v2);
            return;
        }
        et.c("Ad is not visible. Not refreshing ad.");
        this.c.a(v2);
    }

    @Override
    public boolean c() {
        hc.b("isLoaded must be called on the main UI thread.");
        if (this.b.g == null && this.b.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void d() {
        hc.b("pause must be called on the main UI thread.");
        if (this.b.i != null) {
            em.a(this.b.i.b);
        }
    }

    @Override
    public void e() {
        hc.b("resume must be called on the main UI thread.");
        if (this.b.i != null) {
            em.b(this.b.i.b);
        }
    }

    @Override
    public void f() {
        hc.b("showInterstitial must be called on the main UI thread.");
        if (!this.b.h.f) {
            et.e("Cannot call showInterstitial on a banner ad.");
            return;
        }
        if (this.b.i == null) {
            et.e("The interstitial has not loaded.");
            return;
        }
        if (this.b.i.b.h()) {
            et.e("The interstitial is already showing.");
            return;
        }
        this.b.i.b.a(true);
        if (this.b.i.j) {
            try {
                this.b.i.l.b();
                return;
            }
            catch (RemoteException remoteException) {
                et.b("Could not show interstitial.", (Throwable)remoteException);
                this.y();
                return;
            }
        }
        bm bm2 = new bm(this, this, this, this.b.i.b, this.b.i.g, this.b.e);
        cc.a(this.b.c, bm2);
    }

    @Override
    public void g() {
        hc.b("stopLoading must be called on the main UI thread.");
        if (this.b.i != null) {
            this.b.i.b.stopLoading();
            this.b.i = null;
        }
        if (this.b.g != null) {
            this.b.g.f();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void h() {
        hc.b("recordManualImpression must be called on the main UI thread.");
        if (this.b.i == null) {
            et.e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        } else {
            et.a("Pinging manual tracking URLs.");
            if (this.b.i.f == null) return;
            {
                em.a(this.b.c, this.b.e.c, this.b.i.f);
                return;
            }
        }
    }

    @Override
    public x i() {
        hc.b("getAdSize must be called on the main UI thread.");
        return this.b.h;
    }

    @Override
    public void j() {
        this.r();
    }

    @Override
    public void k() {
        this.o();
    }

    @Override
    public void l() {
        this.q();
    }

    @Override
    public void m() {
        this.p();
    }

    @Override
    public void n() {
        if (this.b.i != null) {
            et.e("Mediation adapter " + this.b.i.m + " refreshed, but mediation adapters should never refresh.");
        }
        this.a(true);
        this.v();
    }

    @Override
    public void o() {
        if (this.b.h.f) {
            this.y();
        }
        this.s();
    }

    @Override
    public void p() {
        if (this.b.h.f) {
            this.a(false);
        }
        this.u();
    }

    @Override
    public void q() {
        this.t();
    }

    @Override
    public void r() {
        this.x();
    }
}

