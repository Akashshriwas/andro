/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.an;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.bt;

public final class ao
extends bt {
    private final Object a = new Object();
    private as b;
    private an c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        Object object = this.a;
        synchronized (object) {
            if (this.c != null) {
                this.c.j();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(int n2) {
        Object object = this.a;
        synchronized (object) {
            if (this.b != null) {
                n2 = n2 == 3 ? 1 : 2;
                this.b.a(n2);
                this.b = null;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(an an2) {
        Object object = this.a;
        synchronized (object) {
            this.c = an2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(as as2) {
        Object object = this.a;
        synchronized (object) {
            this.b = as2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        Object object = this.a;
        synchronized (object) {
            if (this.c != null) {
                this.c.k();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c() {
        Object object = this.a;
        synchronized (object) {
            if (this.c != null) {
                this.c.l();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        Object object = this.a;
        synchronized (object) {
            if (this.c != null) {
                this.c.m();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e() {
        Object object = this.a;
        synchronized (object) {
            if (this.b != null) {
                this.b.a(0);
                this.b = null;
                return;
            }
            if (this.c != null) {
                this.c.n();
            }
            return;
        }
    }
}

