// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.util.Log;
import android.content.Context;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class FragmentState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    Fragment k;
    
    static {
        CREATOR = (Parcelable$Creator)new r();
    }
    
    public FragmentState(final Parcel parcel) {
        final boolean b = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = (parcel.readInt() != 0);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (parcel.readInt() != 0);
        this.h = (parcel.readInt() != 0 && b);
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }
    
    public FragmentState(final Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.f;
        this.c = fragment.o;
        this.d = fragment.u;
        this.e = fragment.v;
        this.f = fragment.w;
        this.g = fragment.z;
        this.h = fragment.y;
        this.i = fragment.h;
    }
    
    public Fragment a(final g g) {
        if (this.k != null) {
            return this.k;
        }
        if (this.i != null) {
            this.i.setClassLoader(g.getClassLoader());
        }
        this.k = Fragment.a((Context)g, this.a, this.i);
        if (this.j != null) {
            this.j.setClassLoader(g.getClassLoader());
            this.k.d = this.j;
        }
        this.k.a(this.b);
        this.k.o = this.c;
        this.k.q = true;
        this.k.u = this.d;
        this.k.v = this.e;
        this.k.w = this.f;
        this.k.z = this.g;
        this.k.y = this.h;
        this.k.s = g.b;
        if (m.a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.k);
        }
        return this.k;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int n) {
        final int n2 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        if (this.c) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        if (this.g) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        if (this.h) {
            n = n2;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}
