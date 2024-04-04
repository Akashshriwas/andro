// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.webkit.WebView;
import java.util.List;
import android.os.SystemClock;
import org.json.JSONException;
import android.text.TextUtils;
import android.content.Context;

public final class cy extends ef implements de, fa
{
    private final bl a;
    private final cx b;
    private final ev c;
    private final Context d;
    private final Object e;
    private final dl f;
    private final is g;
    private ef h;
    private cb i;
    private boolean j;
    private aj k;
    private am l;
    private ar m;
    
    public cy(final Context d, final dl f, final is g, final ev c, final bl a, final cx b) {
        this.e = new Object();
        this.j = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
    }
    
    private x a(final bz bz) {
        if (this.i.n == null) {
            throw new dc("The ad response must specify one of the supported ad sizes.", 0);
        }
        final String[] split = this.i.n.split("x");
        if (split.length != 2) {
            throw new dc("Could not parse the ad size from the ad response: " + this.i.n, 0);
        }
        while (true) {
            int int1;
            int int2;
            x[] i;
            int length;
            int n = 0;
            x x = null;
            float density;
            int g;
            int d;
            Label_0156_Outer:Label_0177_Outer:
            while (true) {
            Label_0263:
                while (true) {
                Label_0253:
                    while (true) {
                        try {
                            int1 = Integer.parseInt(split[0]);
                            int2 = Integer.parseInt(split[1]);
                            i = bz.e.i;
                            length = i.length;
                            n = 0;
                            if (n >= length) {
                                break;
                            }
                            x = i[n];
                            density = this.d.getResources().getDisplayMetrics().density;
                            if (x.g == -1) {
                                g = (int)(x.h / density);
                                if (x.d != -2) {
                                    break Label_0253;
                                }
                                d = (int)(x.e / density);
                                if (int1 == g && int2 == d) {
                                    return new x(x, bz.e.i);
                                }
                                break Label_0263;
                            }
                        }
                        catch (NumberFormatException ex) {
                            throw new dc("Could not parse the ad size from the ad response: " + this.i.n, 0);
                        }
                        g = x.g;
                        continue Label_0177_Outer;
                    }
                    d = x.d;
                    continue;
                }
                ++n;
                continue Label_0156_Outer;
            }
        }
        throw new dc("The ad size from the ad response was not one of the requested sizes: " + this.i.n, 0);
    }
    
    private void a(final long n) {
        es.a.post((Runnable)new db(this));
        this.c(n);
    }
    
    private void a(final bz bz, final long n) {
        this.k = new aj(this.d, bz, this.a, this.l);
        this.m = this.k.a(n, 60000L);
        switch (this.m.a) {
            default: {
                throw new dc("Unexpected mediation result: " + this.m.a, 0);
            }
            case 1: {
                throw new dc("No fill from any mediation ad networks.", 3);
            }
            case 0: {}
        }
    }
    
    private void b(final long n) {
        while (this.d(n)) {
            if (this.i != null) {
                this.h = null;
                if (this.i.f != -2 && this.i.f != -3) {
                    throw new dc("There was a problem getting an ad response. ErrorCode: " + this.i.f, this.i.f);
                }
                return;
            }
        }
        throw new dc("Timed out waiting for ad response.", 2);
    }
    
    private void c() {
        if (this.i.f != -3) {
            if (TextUtils.isEmpty((CharSequence)this.i.d)) {
                throw new dc("No fill from ad server.", 3);
            }
            if (this.i.i) {
                try {
                    this.l = new am(this.i.d);
                }
                catch (JSONException ex) {
                    throw new dc("Could not parse mediation config: " + this.i.d, 0);
                }
            }
        }
    }
    
    private void c(final long n) {
        while (this.d(n)) {
            if (this.j) {
                return;
            }
        }
        throw new dc("Timed out waiting for WebView to finish loading.", 2);
    }
    
    private boolean d(long n) {
        n = 60000L - (SystemClock.elapsedRealtime() - n);
        if (n <= 0L) {
            return false;
        }
        try {
            this.e.wait(n);
            return true;
        }
        catch (InterruptedException ex) {
            throw new dc("Ad request cancelled.", -1);
        }
    }
    
    @Override
    public void a() {
    Label_0166_Outer:
        while (true) {
            Object d;
            Object a;
            bp c;
            int a2;
            Object b;
            long n;
            x x = null;
            v d2;
            ev c2;
            List e;
            List g;
            List k;
            int m;
            String j;
            boolean i;
            am l;
            ao e2;
            Label_0254_Outer:Label_0270_Outer:Label_0286_Outer:Label_0308_Outer:
            while (true) {
            Label_0508:
                while (true) {
                Label_0502:
                    while (true) {
                    Label_0496:
                        while (true) {
                        Label_0490:
                            while (true) {
                            Label_0484:
                                while (true) {
                                    Label_0473: {
                                        synchronized (this.e) {
                                            et.a("AdLoaderBackgroundTask started.");
                                            d = new bz(this.f, this.g.a().a(this.d));
                                            a = null;
                                            c = null;
                                            a2 = -2;
                                            b = c;
                                            Label_0381: {
                                                try {
                                                    n = SystemClock.elapsedRealtime();
                                                    b = c;
                                                    this.h = dd.a(this.d, (bz)d, this);
                                                    b = c;
                                                    if (this.h == null) {
                                                        b = c;
                                                        throw new dc("Could not start the ad request service.", 0);
                                                    }
                                                    break Label_0381;
                                                }
                                                catch (dc dc) {
                                                    a2 = dc.a();
                                                    if (a2 != 3 && a2 != -1) {
                                                        break Label_0473;
                                                    }
                                                    et.c(dc.getMessage());
                                                    this.i = new cb(a2);
                                                    es.a.post((Runnable)new cz(this));
                                                    x = (x)b;
                                                    d2 = ((bz)d).d;
                                                    c2 = this.c;
                                                    e = this.i.e;
                                                    g = this.i.g;
                                                    k = this.i.k;
                                                    m = this.i.m;
                                                    n = this.i.l;
                                                    j = ((bz)d).j;
                                                    i = this.i.i;
                                                    if (this.m == null) {
                                                        break Label_0484;
                                                    }
                                                    b = this.m.b;
                                                    if (this.m == null) {
                                                        break Label_0490;
                                                    }
                                                    c = this.m.c;
                                                    if (this.m == null) {
                                                        break Label_0496;
                                                    }
                                                    d = this.m.d;
                                                    l = this.l;
                                                    if (this.m != null) {
                                                        e2 = this.m.e;
                                                        es.a.post((Runnable)new da(this, new ec(d2, c2, e, a2, g, k, m, n, j, i, (al)b, c, (String)d, l, e2, this.i.j, x, this.i.h)));
                                                        return;
                                                    }
                                                    break Label_0502;
                                                    // iftrue(Label_0425:, d.e.i == null)
                                                    // iftrue(Label_0453:, !this.i.i)
                                                Block_12:
                                                    while (true) {
                                                        b = a;
                                                        this.a((bz)d, n);
                                                        break Label_0508;
                                                        Label_0453: {
                                                            b = a;
                                                        }
                                                        this.a(n);
                                                        break Label_0508;
                                                        b = c;
                                                        this.b(n);
                                                        b = c;
                                                        this.c();
                                                        b = c;
                                                        break Block_12;
                                                        Label_0425:
                                                        b = a;
                                                        continue;
                                                    }
                                                    b = c;
                                                    a = this.a((bz)d);
                                                }
                                            }
                                        }
                                    }
                                    et.e(((Throwable)x).getMessage());
                                    continue Label_0166_Outer;
                                }
                                b = null;
                                continue Label_0270_Outer;
                            }
                            c = null;
                            continue Label_0286_Outer;
                        }
                        d = null;
                        continue Label_0308_Outer;
                    }
                    e2 = null;
                    continue;
                }
                continue Label_0254_Outer;
            }
        }
    }
    
    @Override
    public void a(final cb i) {
        synchronized (this.e) {
            et.a("Received ad response.");
            this.i = i;
            this.e.notify();
        }
    }
    
    @Override
    public void a(final ev ev) {
        synchronized (this.e) {
            et.a("WebView finished loading.");
            this.j = true;
            this.e.notify();
        }
    }
    
    @Override
    public void b() {
        synchronized (this.e) {
            if (this.h != null) {
                this.h.f();
            }
            this.c.stopLoading();
            em.a(this.c);
            if (this.k != null) {
                this.k.a();
            }
        }
    }
}
