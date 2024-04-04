/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Boolean
 *  java.lang.Runnable
 *  java.lang.Thread
 *  java.util.ArrayList
 */
package mm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.a.f.e;
import java.util.ArrayList;
import mm.b;
import mm.c;

public abstract class a
extends Fragment
implements AdapterView.OnItemClickListener {
    protected Boolean N = false;
    protected e O;
    public ListView P;
    private ArrayList Q;
    private Runnable R;

    public a() {
        this.R = new b(this);
    }

    static /* synthetic */ ArrayList a(a a2) {
        return a2.Q;
    }

    static /* synthetic */ Runnable b(a a2) {
        return a2.R;
    }

    @Override
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if ((layoutInflater = layoutInflater.inflate(this.r(), viewGroup, false)) != null) {
            this.P = (ListView)layoutInflater.findViewById(2131165194);
            this.a((View)layoutInflater);
        }
        return layoutInflater;
    }

    public abstract void a(View var1);

    public void a(ArrayList arrayList) {
        this.Q = arrayList;
    }

    @Override
    public void b(Bundle bundle) {
        super.b(bundle);
        this.b(true);
    }

    @Override
    public void c(Bundle bundle) {
        super.c(bundle);
        if (this.P != null && this.s() != null) {
            this.P.setOnItemClickListener((AdapterView.OnItemClickListener)this);
            this.O = this.s();
            this.P.setAdapter((ListAdapter)this.O);
            this.v();
        }
    }

    public abstract int r();

    public abstract e s();

    public abstract ArrayList t();

    public ArrayList u() {
        return this.Q;
    }

    protected void v() {
        new Thread((Runnable)new c(this)).start();
    }
}

