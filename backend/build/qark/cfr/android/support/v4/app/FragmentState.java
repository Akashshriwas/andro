/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import android.support.v4.app.m;
import android.support.v4.app.r;
import android.util.Log;

final class FragmentState
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new r();
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

    /*
     * Enabled aggressive block sorting
     */
    public FragmentState(Parcel parcel) {
        boolean bl2 = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        boolean bl3 = parcel.readInt() != 0;
        this.c = bl3;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        bl3 = parcel.readInt() != 0;
        this.g = bl3;
        bl3 = parcel.readInt() != 0 ? bl2 : false;
        this.h = bl3;
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }

    public FragmentState(Fragment fragment) {
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

    public Fragment a(g g2) {
        if (this.k != null) {
            return this.k;
        }
        if (this.i != null) {
            this.i.setClassLoader(g2.getClassLoader());
        }
        this.k = Fragment.a((Context)g2, this.a, this.i);
        if (this.j != null) {
            this.j.setClassLoader(g2.getClassLoader());
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
        this.k.s = g2.b;
        if (m.a) {
            Log.v((String)"FragmentManager", (String)("Instantiated fragment " + this.k));
        }
        return this.k;
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        int n3 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        n2 = this.c ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        n2 = this.g ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.h ? n3 : 0;
        parcel.writeInt(n2);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}

