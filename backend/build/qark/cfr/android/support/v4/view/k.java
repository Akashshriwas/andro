/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObservable
 *  android.database.DataSetObserver
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class k {
    private DataSetObservable a;

    public float a(int n2) {
        return 1.0f;
    }

    public abstract int a();

    public int a(Object object) {
        return -1;
    }

    public Object a(View view, int n2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object a(ViewGroup viewGroup, int n2) {
        return this.a((View)viewGroup, n2);
    }

    void a(DataSetObserver dataSetObserver) {
        this.a.registerObserver((Object)dataSetObserver);
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void a(View view) {
    }

    public void a(View view, int n2, Object object) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void a(ViewGroup viewGroup) {
        this.a((View)viewGroup);
    }

    public void a(ViewGroup viewGroup, int n2, Object object) {
        this.a((View)viewGroup, n2, object);
    }

    public abstract boolean a(View var1, Object var2);

    public Parcelable b() {
        return null;
    }

    void b(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver((Object)dataSetObserver);
    }

    public void b(View view) {
    }

    public void b(View view, int n2, Object object) {
    }

    public void b(ViewGroup viewGroup) {
        this.b((View)viewGroup);
    }

    public void b(ViewGroup viewGroup, int n2, Object object) {
        this.b((View)viewGroup, n2, object);
    }
}

