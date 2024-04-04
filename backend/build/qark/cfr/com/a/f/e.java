/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.a.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public abstract class e
extends BaseAdapter {
    ArrayList a;
    Context b;
    protected LayoutInflater c;

    public e(Context context) {
        this.b = context;
        context = this.c();
        this.c();
        this.c = (LayoutInflater)context.getSystemService("layout_inflater");
        if (this.b() == null) {
            this.a = this.a();
        }
    }

    public abstract View a(Object var1, View var2, int var3);

    public ArrayList a() {
        return new ArrayList();
    }

    public void a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public ArrayList b() {
        return this.a;
    }

    public Context c() {
        return this.b;
    }

    public int getCount() {
        if (this.a != null) {
            return this.a.size();
        }
        return 0;
    }

    public Object getItem(int n2) {
        return this.a.get(n2);
    }

    public long getItemId(int n2) {
        return 0L;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        try {
            viewGroup = this.a(this.a.get(n2), view, n2);
            return viewGroup;
        }
        catch (Exception exception) {
            return view;
        }
    }
}

