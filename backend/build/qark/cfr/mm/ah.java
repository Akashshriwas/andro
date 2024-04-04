/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package mm;

import mm.ag;
import mm.ai;

class ah
implements Runnable {
    final /* synthetic */ ag a;

    ah(ag ag2) {
        this.a = ag2;
    }

    static /* synthetic */ ag a(ah ah2) {
        return ah2.a;
    }

    public void run() {
        ag.a(this.a).runOnUiThread((Runnable)new ai(this));
    }
}

