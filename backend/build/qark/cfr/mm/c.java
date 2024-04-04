/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 */
package mm;

import android.support.v4.app.g;
import java.util.ArrayList;
import mm.a;

class c
implements Runnable {
    final /* synthetic */ a a;

    c(a a2) {
        this.a = a2;
    }

    public void run() {
        try {
            new ArrayList();
            ArrayList arrayList = this.a.t();
            this.a.a(arrayList);
            this.a.c().runOnUiThread(a.b(this.a));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

