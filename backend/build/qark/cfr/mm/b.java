/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.widget.ListView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 */
package mm;

import android.widget.ListView;
import com.a.f.e;
import java.util.ArrayList;
import mm.a;

class b
implements Runnable {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    public void run() {
        if (a.a(this.a) != null && a.a(this.a).size() > 0) {
            this.a.O.a(a.a(this.a));
            this.a.O.notifyDataSetChanged();
            this.a.P.smoothScrollToPosition(0);
            return;
        }
        this.a.O.b().clear();
        this.a.O.notifyDataSetChanged();
    }
}

