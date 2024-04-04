// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.view.ViewParent;
import android.webkit.WebView;
import com.google.android.gms.a.d;
import com.google.android.gms.a.a;
import android.view.ViewGroup;
import android.util.DisplayMetrics;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.os.RemoteException;
import android.content.Context;

public final class ju extends f implements an, ch, cm, cx, jt, s
{
    private final bl a;
    private final jv b;
    private final jw c;
    
    public ju(final Context context, final x x, final String s, final bl a, final ct ct) {
        this.b = new jv(context, x, s, ct);
        this.a = a;
        this.c = new jw(this);
        et.c("Use AdRequest.Builder.addTestDevice(\"" + es.a(context) + "\") to get test ads on this device.");
        em.b(context);
    }
    
    private void a(final int i) {
        et.e("Failed to load ad: " + i);
        if (this.b.f == null) {
            return;
        }
        try {
            this.b.f.a(i);
        }
        catch (RemoteException ex) {
            et.b("Could not call AdListener.onAdFailedToLoad().", (Throwable)ex);
        }
    }
    
    private void a(final View view) {
        this.b.a.addView(view, new ViewGroup$LayoutParams(-2, -2));
    }
    
    private void a(final boolean b) {
        if (this.b.i == null) {
            et.e("Ad state was null when trying to ping impression URLs.");
        }
        else {
            et.a("Pinging Impression URLs.");
            if (this.b.i.e != null) {
                em.a(this.b.c, this.b.e.c, this.b.i.e);
            }
            if (this.b.i.n != null && this.b.i.n.d != null) {
                at.a(this.b.c, this.b.e.c, this.b.i, this.b.b, b, this.b.i.n.d);
            }
            if (this.b.i.k != null && this.b.i.k.e != null) {
                at.a(this.b.c, this.b.e.c, this.b.i, this.b.b, b, this.b.i.k.e);
            }
        }
    }
    
    private boolean b(final ec p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/internal/ec.j:Z
        //     4: ifeq            186
        //     7: aload_1        
        //     8: getfield        com/google/android/gms/internal/ec.l:Lcom/google/android/gms/internal/bp;
        //    11: invokeinterface com/google/android/gms/internal/bp.a:()Lcom/google/android/gms/a/a;
        //    16: invokestatic    com/google/android/gms/a/d.a:(Lcom/google/android/gms/a/a;)Ljava/lang/Object;
        //    19: checkcast       Landroid/view/View;
        //    22: astore_1       
        //    23: aload_0        
        //    24: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //    27: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //    30: invokevirtual   android/widget/ViewSwitcher.getNextView:()Landroid/view/View;
        //    33: astore_2       
        //    34: aload_2        
        //    35: ifnull          49
        //    38: aload_0        
        //    39: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //    42: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //    45: aload_2        
        //    46: invokevirtual   android/widget/ViewSwitcher.removeView:(Landroid/view/View;)V
        //    49: aload_0        
        //    50: aload_1        
        //    51: invokespecial   com/google/android/gms/internal/ju.a:(Landroid/view/View;)V
        //    54: aload_0        
        //    55: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //    58: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //    61: invokevirtual   android/widget/ViewSwitcher.getChildCount:()I
        //    64: iconst_1       
        //    65: if_icmple       78
        //    68: aload_0        
        //    69: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //    72: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //    75: invokevirtual   android/widget/ViewSwitcher.showNext:()V
        //    78: aload_0        
        //    79: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //    82: getfield        com/google/android/gms/internal/jv.i:Lcom/google/android/gms/internal/ec;
        //    85: ifnull          155
        //    88: aload_0        
        //    89: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //    92: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //    95: invokevirtual   android/widget/ViewSwitcher.getNextView:()Landroid/view/View;
        //    98: astore_1       
        //    99: aload_1        
        //   100: instanceof      Lcom/google/android/gms/internal/ev;
        //   103: ifeq            259
        //   106: aload_1        
        //   107: checkcast       Lcom/google/android/gms/internal/ev;
        //   110: aload_0        
        //   111: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   114: getfield        com/google/android/gms/internal/jv.c:Landroid/content/Context;
        //   117: aload_0        
        //   118: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   121: getfield        com/google/android/gms/internal/jv.h:Lcom/google/android/gms/internal/x;
        //   124: invokevirtual   com/google/android/gms/internal/ev.a:(Landroid/content/Context;Lcom/google/android/gms/internal/x;)V
        //   127: aload_0        
        //   128: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   131: getfield        com/google/android/gms/internal/jv.i:Lcom/google/android/gms/internal/ec;
        //   134: getfield        com/google/android/gms/internal/ec.l:Lcom/google/android/gms/internal/bp;
        //   137: ifnull          155
        //   140: aload_0        
        //   141: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   144: getfield        com/google/android/gms/internal/jv.i:Lcom/google/android/gms/internal/ec;
        //   147: getfield        com/google/android/gms/internal/ec.l:Lcom/google/android/gms/internal/bp;
        //   150: invokeinterface com/google/android/gms/internal/bp.c:()V
        //   155: aload_0        
        //   156: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   159: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //   162: iconst_0       
        //   163: invokevirtual   android/widget/ViewSwitcher.setVisibility:(I)V
        //   166: iconst_1       
        //   167: ireturn        
        //   168: astore_1       
        //   169: ldc             "Could not get View from mediation adapter."
        //   171: aload_1        
        //   172: invokestatic    com/google/android/gms/internal/et.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   175: iconst_0       
        //   176: ireturn        
        //   177: astore_1       
        //   178: ldc             "Could not add mediation view to view hierarchy."
        //   180: aload_1        
        //   181: invokestatic    com/google/android/gms/internal/et.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   184: iconst_0       
        //   185: ireturn        
        //   186: aload_1        
        //   187: getfield        com/google/android/gms/internal/ec.q:Lcom/google/android/gms/internal/x;
        //   190: ifnull          54
        //   193: aload_1        
        //   194: getfield        com/google/android/gms/internal/ec.b:Lcom/google/android/gms/internal/ev;
        //   197: aload_1        
        //   198: getfield        com/google/android/gms/internal/ec.q:Lcom/google/android/gms/internal/x;
        //   201: invokevirtual   com/google/android/gms/internal/ev.a:(Lcom/google/android/gms/internal/x;)V
        //   204: aload_0        
        //   205: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   208: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //   211: invokevirtual   android/widget/ViewSwitcher.removeAllViews:()V
        //   214: aload_0        
        //   215: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   218: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //   221: aload_1        
        //   222: getfield        com/google/android/gms/internal/ec.q:Lcom/google/android/gms/internal/x;
        //   225: getfield        com/google/android/gms/internal/x.h:I
        //   228: invokevirtual   android/widget/ViewSwitcher.setMinimumWidth:(I)V
        //   231: aload_0        
        //   232: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   235: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //   238: aload_1        
        //   239: getfield        com/google/android/gms/internal/ec.q:Lcom/google/android/gms/internal/x;
        //   242: getfield        com/google/android/gms/internal/x.e:I
        //   245: invokevirtual   android/widget/ViewSwitcher.setMinimumHeight:(I)V
        //   248: aload_0        
        //   249: aload_1        
        //   250: getfield        com/google/android/gms/internal/ec.b:Lcom/google/android/gms/internal/ev;
        //   253: invokespecial   com/google/android/gms/internal/ju.a:(Landroid/view/View;)V
        //   256: goto            54
        //   259: aload_1        
        //   260: ifnull          127
        //   263: aload_0        
        //   264: getfield        com/google/android/gms/internal/ju.b:Lcom/google/android/gms/internal/jv;
        //   267: getfield        com/google/android/gms/internal/jv.a:Landroid/widget/ViewSwitcher;
        //   270: aload_1        
        //   271: invokevirtual   android/widget/ViewSwitcher.removeView:(Landroid/view/View;)V
        //   274: goto            127
        //   277: astore_1       
        //   278: ldc             "Could not destroy previous mediation adapter."
        //   280: invokestatic    com/google/android/gms/internal/et.e:(Ljava/lang/String;)V
        //   283: goto            155
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      23     168    177    Landroid/os/RemoteException;
        //  49     54     177    186    Ljava/lang/Throwable;
        //  140    155    277    286    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 127 out of bounds for length 127
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:359)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:427)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private dl c(final v v) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        int[] array;
        int n;
        int n2;
        DisplayMetrics displayMetrics;
        int width;
        int height;
        int n3;
        Bundle bundle;
        Label_0175_Outer:Label_0233_Outer:
        while (true) {
            applicationInfo = this.b.c.getApplicationInfo();
            while (true) {
                Label_0288: {
                    while (true) {
                        while (true) {
                            try {
                                packageInfo = this.b.c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
                                if (this.b.h.f || this.b.a.getParent() == null) {
                                    break Label_0288;
                                }
                                array = new int[2];
                                this.b.a.getLocationOnScreen(array);
                                n = array[0];
                                n2 = array[1];
                                displayMetrics = this.b.c.getResources().getDisplayMetrics();
                                width = this.b.a.getWidth();
                                height = this.b.a.getHeight();
                                if (this.b.a.isShown() && n + width > 0 && n2 + height > 0 && n <= displayMetrics.widthPixels && n2 <= displayMetrics.heightPixels) {
                                    n3 = 1;
                                    bundle = new Bundle(5);
                                    bundle.putInt("x", n);
                                    bundle.putInt("y", n2);
                                    bundle.putInt("width", width);
                                    bundle.putInt("height", height);
                                    bundle.putInt("visible", n3);
                                    return new dl(bundle, v, this.b.h, this.b.b, applicationInfo, packageInfo, ed.a(), ed.a, this.b.e);
                                }
                            }
                            catch (PackageManager$NameNotFoundException ex) {
                                packageInfo = null;
                                continue Label_0175_Outer;
                            }
                            break;
                        }
                        n3 = 0;
                        continue Label_0233_Outer;
                    }
                }
                bundle = null;
                continue;
            }
        }
    }
    
    private void s() {
        et.c("Ad closing.");
        if (this.b.f == null) {
            return;
        }
        try {
            this.b.f.a();
        }
        catch (RemoteException ex) {
            et.b("Could not call AdListener.onAdClosed().", (Throwable)ex);
        }
    }
    
    private void t() {
        et.c("Ad leaving application.");
        if (this.b.f == null) {
            return;
        }
        try {
            this.b.f.b();
        }
        catch (RemoteException ex) {
            et.b("Could not call AdListener.onAdLeftApplication().", (Throwable)ex);
        }
    }
    
    private void u() {
        et.c("Ad opening.");
        if (this.b.f == null) {
            return;
        }
        try {
            this.b.f.d();
        }
        catch (RemoteException ex) {
            et.b("Could not call AdListener.onAdOpened().", (Throwable)ex);
        }
    }
    
    private void v() {
        et.c("Ad finished loading.");
        if (this.b.f == null) {
            return;
        }
        try {
            this.b.f.c();
        }
        catch (RemoteException ex) {
            et.b("Could not call AdListener.onAdLoaded().", (Throwable)ex);
        }
    }
    
    private boolean w() {
        boolean b = true;
        if (!em.a(this.b.c.getPackageManager(), this.b.c.getPackageName(), "android.permission.INTERNET")) {
            if (!this.b.h.f) {
                es.a((ViewGroup)this.b.a, this.b.h, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            b = false;
        }
        if (!em.a(this.b.c)) {
            if (!this.b.h.f) {
                es.a((ViewGroup)this.b.a, this.b.h, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            b = false;
        }
        if (!b && !this.b.h.f) {
            this.b.a.setVisibility(0);
        }
        return b;
    }
    
    private void x() {
        if (this.b.i == null) {
            et.e("Ad state was null when trying to ping click URLs.");
        }
        else {
            et.a("Pinging click URLs.");
            if (this.b.i.c != null) {
                em.a(this.b.c, this.b.e.c, this.b.i.c);
            }
            if (this.b.i.n != null && this.b.i.n.c != null) {
                at.a(this.b.c, this.b.e.c, this.b.i, this.b.b, false, this.b.i.n.c);
            }
        }
    }
    
    private void y() {
        if (this.b.i != null) {
            this.b.i.b.destroy();
            this.b.i = null;
        }
    }
    
    public a a() {
        hc.b("getAdFrame must be called on the main UI thread.");
        return d.a(this.b.a);
    }
    
    public void a(final b f) {
        hc.b("setAdListener must be called on the main UI thread.");
        this.b.f = f;
    }
    
    @Override
    public void a(final ec i) {
        this.b.g = null;
        if (i.d == -1) {
            return;
        }
        final boolean b = i.a.d != null && i.a.d.getBoolean("_noRefresh", false);
        if (this.b.h.f) {
            em.a(i.b);
        }
        else if (!b) {
            if (i.h > 0L) {
                this.c.a(i.a, i.h);
            }
            else if (i.n != null && i.n.g > 0L) {
                this.c.a(i.a, i.n.g);
            }
            else if (!i.j && i.d == 2) {
                this.c.a(i.a);
            }
        }
        if (i.d == 3 && i.n != null && i.n.e != null) {
            et.a("Pinging no fill URLs.");
            at.a(this.b.c, this.b.e.c, i, this.b.b, false, i.n.e);
        }
        if (i.d != -2) {
            this.a(i.d);
            return;
        }
        if (!this.b.h.f && !this.b(i)) {
            this.a(0);
            return;
        }
        if (this.b.i != null && this.b.i.o != null) {
            this.b.i.o.a((an)null);
        }
        if (i.o != null) {
            i.o.a(this);
        }
        this.b.i = i;
        if (i.q != null) {
            this.b.h = i.q;
        }
        if (!this.b.h.f) {
            this.a(false);
        }
        this.v();
    }
    
    public void a(final k j) {
        hc.b("setAppEventListener must be called on the main UI thread.");
        this.b.j = j;
    }
    
    public void a(final x h) {
        hc.b("setAdSize must be called on the main UI thread.");
        this.b.h = h;
        if (this.b.i != null) {
            this.b.i.b.a(h);
        }
        if (this.b.a.getChildCount() > 1) {
            this.b.a.removeView(this.b.a.getNextView());
        }
        this.b.a.setMinimumWidth(h.h);
        this.b.a.setMinimumHeight(h.e);
        this.b.a.requestLayout();
    }
    
    @Override
    public void a(final String s, final String s2) {
        if (this.b.j == null) {
            return;
        }
        try {
            this.b.j.a(s, s2);
        }
        catch (RemoteException ex) {
            et.b("Could not call the AppEventListener.", (Throwable)ex);
        }
    }
    
    public boolean a(final v v) {
        hc.b("loadAd must be called on the main UI thread.");
        if (this.b.g != null) {
            et.e("An ad request is already in progress. Aborting.");
        }
        else {
            if (this.b.h.f && this.b.i != null) {
                et.e("An interstitial is already loading. Aborting.");
                return false;
            }
            if (this.w()) {
                et.c("Starting ad request.");
                this.c.a();
                final dl c = this.c(v);
                Object o;
                if (this.b.h.f) {
                    o = ev.a(this.b.c, this.b.h, false, false, this.b.d, this.b.e);
                    ((ev)o).e().a(this, null, this, this, true);
                }
                else {
                    final View nextView = this.b.a.getNextView();
                    if (nextView instanceof ev) {
                        o = nextView;
                        ((ev)o).a(this.b.c, this.b.h);
                    }
                    else {
                        if (nextView != null) {
                            this.b.a.removeView(nextView);
                        }
                        final ev ev = (ev)(o = com.google.android.gms.internal.ev.a(this.b.c, this.b.h, (boolean)(0 != 0), (boolean)(0 != 0), this.b.d, this.b.e));
                        if (this.b.h.i == null) {
                            this.a((View)ev);
                            o = ev;
                        }
                    }
                    ((ev)o).e().a(this, this, this, this, false);
                }
                this.b.g = cw.a(this.b.c, c, this.b.d, (ev)o, this.a, this);
                return true;
            }
        }
        return false;
    }
    
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
    
    public void b(final v v) {
        final ViewParent parent = this.b.a.getParent();
        if (parent instanceof View && ((View)parent).isShown() && em.a()) {
            this.a(v);
            return;
        }
        et.c("Ad is not visible. Not refreshing ad.");
        this.c.a(v);
    }
    
    public boolean c() {
        hc.b("isLoaded must be called on the main UI thread.");
        return this.b.g == null && this.b.i != null;
    }
    
    public void d() {
        hc.b("pause must be called on the main UI thread.");
        if (this.b.i != null) {
            em.a(this.b.i.b);
        }
    }
    
    public void e() {
        hc.b("resume must be called on the main UI thread.");
        if (this.b.i != null) {
            em.b(this.b.i.b);
        }
    }
    
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
            catch (RemoteException ex) {
                et.b("Could not show interstitial.", (Throwable)ex);
                this.y();
                return;
            }
        }
        cc.a(this.b.c, new bm(this, this, this, this.b.i.b, this.b.i.g, this.b.e));
    }
    
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
    
    public void h() {
        hc.b("recordManualImpression must be called on the main UI thread.");
        if (this.b.i == null) {
            et.e("Ad state was null when trying to ping manual tracking URLs.");
        }
        else {
            et.a("Pinging manual tracking URLs.");
            if (this.b.i.f != null) {
                em.a(this.b.c, this.b.e.c, this.b.i.f);
            }
        }
    }
    
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
