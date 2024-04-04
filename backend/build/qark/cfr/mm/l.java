/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
package mm;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import mm.k;
import mm.n;
import mm.o;
import mm.p;

public class l
extends t {
    public p V;
    public k W;
    int X = 0;
    private ImageView Y;
    private View.OnClickListener Z;
    private AdapterView.OnItemClickListener aa;

    public l() {
        this.Z = new n(this);
        this.aa = new o(this);
    }

    @Override
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2130903044, null);
    }

    @Override
    public void c(Bundle bundle) {
        super.c(bundle);
        this.r().setOnItemClickListener(this.aa);
        this.W = new k((Context)this.c());
        this.a((ListAdapter)this.W);
        this.Y = (ImageView)this.c().findViewById(2131165201);
        this.Y.setOnClickListener(this.Z);
    }
}

