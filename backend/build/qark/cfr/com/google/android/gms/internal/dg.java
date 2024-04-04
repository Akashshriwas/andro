/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.df;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.ds;

public final class dg
extends df {
    private final Context a;

    public dg(Context context, bz bz2, de de2) {
        super(bz2, de2);
        this.a = context;
    }

    @Override
    public void c() {
    }

    @Override
    public dp d() {
        return ds.a(this.a, new ah());
    }
}

