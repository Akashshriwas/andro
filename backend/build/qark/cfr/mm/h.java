/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.view.View;
import mm.g;
import mm.i;

class h
implements View.OnClickListener {
    final /* synthetic */ g a;

    h(g g2) {
        this.a = g2;
    }

    public void onClick(View view) {
        try {
            if (this.a.i != null) {
                this.a.i.a_(Integer.parseInt((String)view.getTag().toString()));
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

