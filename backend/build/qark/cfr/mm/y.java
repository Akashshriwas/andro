/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.widget.ProgressBar
 *  java.lang.Object
 *  java.lang.Runnable
 */
package mm;

import android.widget.ProgressBar;
import mm.m;
import mm.w;
import mm.x;

class y
implements Runnable {
    final /* synthetic */ x a;

    y(x x2) {
        this.a = x2;
    }

    public void run() {
        w.a((w)x.a((x)this.a)).D.setVisibility(8);
        m.g(w.a(x.a(this.a)));
    }
}

