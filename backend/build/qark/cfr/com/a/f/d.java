/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.widget.ListView
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Void
 *  java.util.ArrayList
 */
package com.a.f;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import com.a.f.a;
import com.a.f.e;
import java.util.ArrayList;

class d
extends AsyncTask {
    com.a.b.a a;
    final /* synthetic */ a b;

    private d(a a2) {
        this.b = a2;
    }

    /* synthetic */ d(a a2, d d2) {
        this(a2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected /* varargs */ Void a(Void ... arrayList) {
        try {
            new ArrayList();
            arrayList = this.b.i();
            this.b.a(arrayList);
            do {
                return null;
                break;
            } while (true);
        }
        catch (Exception exception) {
            this.a.dismiss();
            return null;
        }
    }

    protected void a(Void void_) {
        this.a.dismiss();
        if (a.a(this.b) != null && a.a(this.b).size() > 0) {
            this.b.m.a(this.b.k());
            this.b.m.notifyDataSetChanged();
            return;
        }
        this.b.m.b().clear();
        this.b.m.notifyDataSetChanged();
    }

    protected /* varargs */ /* synthetic */ Object doInBackground(Object ... arrobject) {
        return this.a((Void[])arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Void)object);
    }

    protected void onPreExecute() {
        this.a = new com.a.b.a(this.b.n.getContext());
        this.a.show();
    }
}

