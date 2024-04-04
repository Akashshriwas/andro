/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ListView
 *  java.lang.Object
 *  java.lang.Runnable
 */
package android.support.v4.app;

import android.support.v4.app.t;
import android.view.View;
import android.widget.ListView;

class u
implements Runnable {
    final /* synthetic */ t a;

    u(t t2) {
        this.a = t2;
    }

    public void run() {
        this.a.O.focusableViewAvailable((View)this.a.O);
    }
}

