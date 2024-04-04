/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.dx;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;

public final class dv {
    public final ad a;
    public final ad b;
    private final Object c = new Object();
    private ev d;
    private int e = -2;
    private String f;

    public dv() {
        this.a = new dw(this);
        this.b = new dx(this);
    }

    static /* synthetic */ int a(dv dv2, int n2) {
        dv2.e = n2;
        return n2;
    }

    static /* synthetic */ Object a(dv dv2) {
        return dv2.c;
    }

    static /* synthetic */ String a(dv dv2, String string) {
        dv2.f = string;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a() {
        Object object = this.c;
        synchronized (object) {
            return this.e;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(ev ev2) {
        Object object = this.c;
        synchronized (object) {
            this.d = ev2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String b() {
        Object object = this.c;
        synchronized (object) {
            while (this.f == null) {
                int n2 = this.e;
                if (n2 != -2) return this.f;
                try {
                    this.c.wait();
                }
                catch (InterruptedException interruptedException) {
                    et.e("Ad request service was interrupted.");
                    return null;
                }
            }
            return this.f;
        }
    }
}

