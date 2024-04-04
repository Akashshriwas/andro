/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package mm;

import mm.ag;
import mm.ah;
import mm.ao;
import mm.pr;

class ai
implements Runnable {
    final /* synthetic */ ah a;

    ai(ah ah2) {
        this.a = ah2;
    }

    public void run() {
        pr.b(ag.a(ah.a(this.a)));
        if (pr.a(ag.a(ah.a(this.a))) != null) {
            ((ao)pr.a(ag.a(ah.a(this.a)))).a(-1);
            ((ao)pr.a(ag.a(ah.a(this.a)))).notifyDataSetChanged();
        }
    }
}

