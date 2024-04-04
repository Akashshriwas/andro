/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.fx;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gr;

public class dk
extends fx {
    private final int e;

    public dk(Context context, c c2, d d2, int n2) {
        super(context, c2, d2, new String[0]);
        this.e = n2;
    }

    protected dp a(IBinder iBinder) {
        return dq.a(iBinder);
    }

    @Override
    protected String a() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override
    protected void a(gr gr2, gc gc2) {
        Bundle bundle = new Bundle();
        gr2.g(gc2, this.e, this.h().getPackageName(), bundle);
    }

    @Override
    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return this.a(iBinder);
    }

    @Override
    protected String b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public dp c() {
        return (dp)super.k();
    }
}

