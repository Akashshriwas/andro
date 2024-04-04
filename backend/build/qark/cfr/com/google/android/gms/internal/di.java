/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.df;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.et;

public final class di
extends df
implements c,
d {
    private final de a;
    private final dk b;
    private final Object c = new Object();

    public di(Context context, bz bz2, de de2) {
        super(bz2, de2);
        this.a = de2;
        this.b = new dk(context, this, this, bz2.l.e);
        this.b.d();
    }

    @Override
    public void a(Bundle bundle) {
        this.e();
    }

    @Override
    public void a(a a2) {
        this.a.a(new cb(0));
    }

    @Override
    public void a_() {
        et.a("Disconnected from remote ad request service.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c() {
        Object object = this.c;
        synchronized (object) {
            if (this.b.e() || this.b.f()) {
                this.b.g();
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
    public dp d() {
        Object object = this.c;
        synchronized (object) {
            try {
                return this.b.c();
            }
            catch (IllegalStateException illegalStateException) {
                return null;
            }
        }
    }
}

