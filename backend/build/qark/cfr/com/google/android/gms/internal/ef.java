/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.ei;

public abstract class ef {
    private final Runnable a;
    private volatile Thread b;

    public ef() {
        this.a = new eg(this);
    }

    static /* synthetic */ Thread a(ef ef2, Thread thread) {
        ef2.b = thread;
        return thread;
    }

    public abstract void a();

    public abstract void b();

    public final void e() {
        ei.a(this.a);
    }

    public final void f() {
        this.b();
        if (this.b != null) {
            this.b.interrupt();
        }
    }
}

