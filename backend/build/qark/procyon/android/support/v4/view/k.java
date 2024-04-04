// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.os.Parcelable;
import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObservable;

public abstract class k
{
    private DataSetObservable a;
    
    public float a(final int n) {
        return 1.0f;
    }
    
    public abstract int a();
    
    public int a(final Object o) {
        return -1;
    }
    
    public Object a(final View view, final int n) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
    
    public Object a(final ViewGroup viewGroup, final int n) {
        return this.a((View)viewGroup, n);
    }
    
    void a(final DataSetObserver dataSetObserver) {
        this.a.registerObserver((Object)dataSetObserver);
    }
    
    public void a(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    public void a(final View view) {
    }
    
    public void a(final View view, final int n, final Object o) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
    
    public void a(final ViewGroup viewGroup) {
        this.a((View)viewGroup);
    }
    
    public void a(final ViewGroup viewGroup, final int n, final Object o) {
        this.a((View)viewGroup, n, o);
    }
    
    public abstract boolean a(final View p0, final Object p1);
    
    public Parcelable b() {
        return null;
    }
    
    void b(final DataSetObserver dataSetObserver) {
        this.a.unregisterObserver((Object)dataSetObserver);
    }
    
    public void b(final View view) {
    }
    
    public void b(final View view, final int n, final Object o) {
    }
    
    public void b(final ViewGroup viewGroup) {
        this.b((View)viewGroup);
    }
    
    public void b(final ViewGroup viewGroup, final int n, final Object o) {
        this.b((View)viewGroup, n, o);
    }
}
