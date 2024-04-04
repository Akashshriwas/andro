/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 */
package mm;

import android.view.View;
import mm.d;

class f
implements View.OnClickListener {
    final /* synthetic */ d a;

    f(d d2) {
        this.a = d2;
    }

    public void onClick(View view) {
        try {
            this.a.n();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

