// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Collection;
import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import android.os.Bundle;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

public final class gh
{
    final ArrayList a;
    private final gj b;
    private ArrayList c;
    private boolean d;
    private ArrayList e;
    private final Handler f;
    private boolean g;
    
    gh(final Context context, final gj b, final Handler handler) {
        this.a = new ArrayList();
        this.d = false;
        this.g = false;
        Handler f = handler;
        if (handler == null) {
            f = new gi(this, Looper.getMainLooper());
        }
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.b = b;
        this.f = f;
    }
    
    protected void a() {
        synchronized (this.c) {
            this.a(this.b.j());
        }
    }
    
    public void a(final Bundle bundle) {
        boolean b;
        boolean b2;
        boolean b3;
        ArrayList c;
        int size;
        int n = 0;
        Label_0054_Outer:Label_0073_Outer:
        while (true) {
            b = true;
            while (true) {
            Label_0178:
                while (true) {
                Label_0172:
                    while (true) {
                        synchronized (this.c) {
                            if (!this.d) {
                                b2 = true;
                                hc.a(b2);
                                this.f.removeMessages(1);
                                this.d = true;
                                if (this.a.size() != 0) {
                                    break Label_0172;
                                }
                                b3 = b;
                                hc.a(b3);
                                c = this.c;
                                size = c.size();
                                n = 0;
                                if (n >= size || !this.b.l() || !this.b.e()) {
                                    this.a.clear();
                                    this.d = false;
                                    return;
                                }
                                this.a.size();
                                if (!this.a.contains(c.get(n))) {
                                    c.get(n).a(bundle);
                                }
                                break Label_0178;
                            }
                        }
                        b2 = false;
                        continue Label_0054_Outer;
                    }
                    b3 = false;
                    continue Label_0073_Outer;
                }
                ++n;
                continue;
            }
        }
    }
    
    public void a(final a a) {
        while (true) {
            this.f.removeMessages(1);
            while (true) {
                int n;
                synchronized (this.e) {
                    this.g = true;
                    final ArrayList e = this.e;
                    final int size = e.size();
                    n = 0;
                    if (n >= size) {
                        this.g = false;
                        return;
                    }
                    if (!this.b.l()) {
                        return;
                    }
                    if (this.e.contains(e.get(n))) {
                        e.get(n).a(a);
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    public void a(final c e) {
        hc.a(e);
        synchronized (this.c) {
            if (this.c.contains(e)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + e + " is already registered");
            }
            else {
                if (this.d) {
                    this.c = new ArrayList(this.c);
                }
                this.c.add(e);
            }
            // monitorexit(this.c)
            if (this.b.e()) {
                this.f.sendMessage(this.f.obtainMessage(1, (Object)e));
            }
        }
    }
    
    public void a(final d e) {
        hc.a(e);
        synchronized (this.e) {
            if (this.e.contains(e)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + e + " is already registered");
            }
            else {
                if (this.g) {
                    this.e = new ArrayList(this.e);
                }
                this.e.add(e);
            }
        }
    }
    
    public void b() {
        while (true) {
            this.f.removeMessages(1);
            while (true) {
                int n;
                synchronized (this.c) {
                    this.d = true;
                    final ArrayList c = this.c;
                    final int size = c.size();
                    n = 0;
                    if (n >= size || !this.b.l()) {
                        this.d = false;
                        return;
                    }
                    if (this.c.contains(c.get(n))) {
                        c.get(n).a_();
                    }
                }
                ++n;
                continue;
            }
        }
    }
}
