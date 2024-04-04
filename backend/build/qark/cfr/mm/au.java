/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import dn.a;
import mm.rc;

class au
implements View.OnClickListener {
    final /* synthetic */ rc a;

    au(rc rc2) {
        this.a = rc2;
    }

    public void onClick(View view) {
        try {
            this.a.onBackPressed();
            return;
        }
        catch (Exception exception) {
            a.a(view.getContext(), view.getResources().getString(2131230758));
            return;
        }
    }
}

