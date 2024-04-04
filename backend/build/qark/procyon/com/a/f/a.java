// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.f;

import android.util.Log;
import android.widget.ListAdapter;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import com.a.e.b;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;
import android.support.v4.app.g;

public abstract class a extends g implements AdapterView$OnItemClickListener
{
    protected e m;
    public ListView n;
    public b o;
    private ArrayList p;
    private Thread.UncaughtExceptionHandler q;
    
    public a() {
        this.q = new com.a.f.b(this);
        this.o = new c(this);
    }
    
    protected void a(final AdapterView adapterView, final View view, final int n) {
        this.startActivity(new Intent(view.getContext(), this.j()));
    }
    
    public void a(final ArrayList p) {
        this.p = p;
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
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        Thread.setDefaultUncaughtExceptionHandler(this.q);
        if (this.g() != -1) {
            this.setContentView(this.g());
        }
        this.f();
        this.n = (ListView)this.findViewById(2131165194);
        if (this.n != null) {
            this.n.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        }
        if (this.n != null && this.h() != null) {
            this.m = this.h();
            this.n.setAdapter((ListAdapter)this.m);
        }
        if (this.n != null && this.m != null) {
            new d(this, null).execute((Object[])new Void[0]);
        }
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        try {
            this.a(adapterView, view, n);
        }
        catch (Exception ex) {
            Log.w("onItemClick", "Has error");
        }
    }
}
