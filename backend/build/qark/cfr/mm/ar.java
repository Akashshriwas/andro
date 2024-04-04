/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package mm;

import mm.rc;

class ar
implements Runnable {
    final /* synthetic */ rc a;
    private final /* synthetic */ long b;

    ar(rc rc2, long l2) {
        this.a = rc2;
        this.b = l2;
    }

    public void run() {
        long l2 = this.b;
        rc.a(this.a, l2 + 1000L);
    }
}

