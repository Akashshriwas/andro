// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.f;

import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.ArrayList;
import android.widget.BaseAdapter;

public abstract class e extends BaseAdapter
{
    ArrayList a;
    Context b;
    protected LayoutInflater c;
    
    public e(Context c) {
        this.b = c;
        c = this.c();
        this.c();
        this.c = (LayoutInflater)c.getSystemService("layout_inflater");
        if (this.b() == null) {
            this.a = this.a();
        }
    }
    
    public abstract View a(final Object p0, final View p1, final int p2);
    
    public ArrayList a() {
        return new ArrayList();
    }
    
    public void a(final ArrayList a) {
        this.a = a;
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
    
    public Object getItem(final int index) {
        return this.a.get(index);
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public View getView(final int index, final View view, final ViewGroup viewGroup) {
        try {
            return this.a(this.a.get(index), view, index);
        }
        catch (Exception ex) {
            return view;
        }
    }
}
