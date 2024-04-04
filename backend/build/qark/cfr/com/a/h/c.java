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
import android.support.v4.app.g;
import com.a.h.b;
import com.a.h.d;

class c
implements Runnable {
    private final /* synthetic */ Context a;

    c(Context context) {
        this.a = context;
    }

    public void run() {
        if (b.a()) {
            ((g)this.a).runOnUiThread((Runnable)new d(this, this.a));
        }
    }
}

