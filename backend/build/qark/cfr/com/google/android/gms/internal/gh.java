/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.hc;
import java.util.ArrayList;
import java.util.Collection;

public final class gh {
    final ArrayList a = new ArrayList();
    private final gj b;
    private ArrayList c;
    private boolean d = false;
    private ArrayList e;
    private final Handler f;
    private boolean g = false;

    gh(Context object, gj gj2, Handler handler) {
        object = handler;
        if (handler == null) {
            object = new gi(this, Looper.getMainLooper());
        }
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.b = gj2;
        this.f = object;
    }

    static /* synthetic */ ArrayList a(gh gh2) {
        return gh2.c;
    }

    static /* synthetic */ gj b(gh gh2) {
        return gh2.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void a() {
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            this.a(this.b.j());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Bundle bundle) {
        boolean bl2 = true;
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            boolean bl3 = !this.d;
            hc.a(bl3);
            this.f.removeMessages(1);
            this.d = true;
            bl3 = this.a.size() == 0 ? bl2 : false;
            hc.a(bl3);
            ArrayList arrayList2 = this.c;
            int n2 = arrayList2.size();
            int n3 = 0;
            do {
                if (n3 >= n2 || !this.b.l() || !this.b.e()) {
                    this.a.clear();
                    this.d = false;
                    return;
                }
                this.a.size();
                if (!this.a.contains(arrayList2.get(n3))) {
                    ((c)arrayList2.get(n3)).a(bundle);
                }
                ++n3;
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a a2) {
        this.f.removeMessages(1);
        ArrayList arrayList = this.e;
        synchronized (arrayList) {
            this.g = true;
            ArrayList arrayList2 = this.e;
            int n2 = arrayList2.size();
            int n3 = 0;
            do {
                if (n3 >= n2) {
                    this.g = false;
                    return;
                }
                if (!this.b.l()) {
                    return;
                }
                if (this.e.contains(arrayList2.get(n3))) {
                    ((d)arrayList2.get(n3)).a(a2);
                }
                ++n3;
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(c c2) {
        hc.a(c2);
        ArrayList arrayList = this.c;
        // MONITORENTER : arrayList
        if (this.c.contains((Object)c2)) {
            Log.w((String)"GmsClientEvents", (String)("registerConnectionCallbacks(): listener " + c2 + " is already registered"));
        } else {
            if (this.d) {
                this.c = new ArrayList((Collection)this.c);
            }
            this.c.add((Object)c2);
        }
        // MONITOREXIT : arrayList
        if (!this.b.e()) return;
        this.f.sendMessage(this.f.obtainMessage(1, (Object)c2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(d d2) {
        hc.a(d2);
        ArrayList arrayList = this.e;
        synchronized (arrayList) {
            if (this.e.contains((Object)d2)) {
                Log.w((String)"GmsClientEvents", (String)("registerConnectionFailedListener(): listener " + d2 + " is already registered"));
            } else {
                if (this.g) {
                    this.e = new ArrayList((Collection)this.e);
                }
                this.e.add((Object)d2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        this.f.removeMessages(1);
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            this.d = true;
            ArrayList arrayList2 = this.c;
            int n2 = arrayList2.size();
            int n3 = 0;
            do {
                if (n3 >= n2 || !this.b.l()) {
                    this.d = false;
                    return;
                }
                if (this.c.contains(arrayList2.get(n3))) {
                    ((c)arrayList2.get(n3)).a_();
                }
                ++n3;
            } while (true);
        }
    }
}

