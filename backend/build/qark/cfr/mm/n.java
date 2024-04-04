/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.g;
import android.view.View;
import dn.a;
import mm.l;

class n
implements View.OnClickListener {
    final /* synthetic */ l a;

    n(l l2) {
        this.a = l2;
    }

    public void onClick(View view) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", view.getResources().getString(2131230746));
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + view.getContext().getPackageName());
            this.a.a(a.a(intent, this.a.c()));
            return;
        }
        catch (Exception exception) {
            a.a(view.getContext(), view.getResources().getString(2131230758));
            return;
        }
    }
}

