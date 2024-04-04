/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Void
 *  java.util.ArrayList
 */
package com.a.f;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.g;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.a.f.b;
import com.a.f.c;
import com.a.f.d;
import com.a.f.e;
import java.util.ArrayList;

public abstract class a
extends g
implements AdapterView.OnItemClickListener {
    protected e m;
    public ListView n;
    public com.a.e.b o;
    private ArrayList p;
    private Thread.UncaughtExceptionHandler q;

    public a() {
        this.q = new b(this);
        this.o = new c(this);
    }

    static /* synthetic */ ArrayList a(a a2) {
        return a2.p;
    }

    protected void a(AdapterView adapterView, View view, int n2) {
        this.startActivity(new Intent(view.getContext(), this.j()));
    }

    public void a(ArrayList arrayList) {
        this.p = arrayList;
    }

    public abstract void f();

    public abstract int g();

    public abstract e h();

    public abstract ArrayList i();

    public abstract Class j();

    public ArrayList k() {
        return this.p;
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.q);
        if (this.g() != -1) {
            this.setContentView(this.g());
        }
        this.f();
        this.n = (ListView)this.findViewById(2131165194);
        if (this.n != null) {
            this.n.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        }
        if (this.n != null && this.h() != null) {
            this.m = this.h();
            this.n.setAdapter((ListAdapter)this.m);
        }
        if (this.n != null && this.m != null) {
            new d(this, null).execute((Object[])new Void[0]);
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        try {
            this.a(adapterView, view, n2);
            return;
        }
        catch (Exception exception) {
            Log.w((String)"onItemClick", (String)"Has error");
            return;
        }
    }
}

