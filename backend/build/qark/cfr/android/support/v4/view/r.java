/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 */
package android.support.v4.view;

import android.support.v4.view.w;
import android.view.View;

class r
implements w {
    r() {
    }

    @Override
    public int a(View view) {
        return 2;
    }

    long a() {
        return 10L;
    }

    @Override
    public boolean a(View view, int n2) {
        return false;
    }

    @Override
    public void b(View view) {
        view.postInvalidateDelayed(this.a());
    }
}

