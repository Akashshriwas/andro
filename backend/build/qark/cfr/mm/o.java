/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import dn.a;
import mm.k;
import mm.l;
import mm.p;

class o
implements AdapterView.OnItemClickListener {
    final /* synthetic */ l a;

    o(l l2) {
        this.a = l2;
    }

    public void onItemClick(AdapterView object, View view, int n2, long l2) {
        try {
            this.a.X = n2;
            object = (com.a.a.a)this.a.W.getItem(n2);
            this.a.V.a((com.a.a.a)object, view);
            return;
        }
        catch (Exception exception) {
            a.a(view.getContext(), view.getResources().getString(2131230758));
            return;
        }
    }
}

