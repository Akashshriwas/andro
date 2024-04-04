/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package mm;

import mm.m;
import mm.w;
import mm.y;

class x
implements Runnable {
    final /* synthetic */ w a;

    x(w w2) {
        this.a = w2;
    }

    static /* synthetic */ w a(x x2) {
        return x2.a;
    }

    public void run() {
        m.f(w.a(this.a));
        w.a(this.a).runOnUiThread((Runnable)new y(this));
    }
}

