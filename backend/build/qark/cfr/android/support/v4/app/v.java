/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListView
 *  java.lang.Object
 */
package android.support.v4.app;

import android.support.v4.app.t;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

class v
implements AdapterView.OnItemClickListener {
    final /* synthetic */ t a;

    v(t t2) {
        this.a = t2;
    }

    public void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        this.a.a((ListView)adapterView, view, n2, l2);
    }
}

