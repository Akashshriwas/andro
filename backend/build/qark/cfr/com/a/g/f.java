/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.a.g;

import com.a.g.d;
import com.a.g.e;

class f
implements Runnable {
    e a;
    final /* synthetic */ d b;

    f(d d2, e e2) {
        this.b = d2;
        this.a = e2;
    }

    public void run() {
        try {
            d.a(this.b, this.a.a, this.a.b);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }
}

