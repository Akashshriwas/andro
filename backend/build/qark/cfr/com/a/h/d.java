/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.a.h;

import android.content.Context;
import com.a.h.b;
import com.a.h.c;

class d
implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ Context b;

    d(c c2, Context context) {
        this.a = c2;
        this.b = context;
    }

    public void run() {
        b.b(this.b);
    }
}

