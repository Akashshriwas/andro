// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import java.util.ArrayList;
import android.util.Log;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class BackStackState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public BackStackState(final Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }
    
    public BackStackState(final m m, final b b) {
        c c = b.b;
        int n = 0;
        while (c != null) {
            int n2 = n;
            if (c.i != null) {
                n2 = n + c.i.size();
            }
            c = c.a;
            n = n2;
        }
        this.a = new int[n + b.d * 7];
        if (!b.k) {
            throw new IllegalStateException("Not on back stack");
        }
        c c2 = b.b;
        int n3 = 0;
        while (c2 != null) {
            final int[] a = this.a;
            final int n4 = n3 + 1;
            a[n3] = c2.c;
            final int[] a2 = this.a;
            final int n5 = n4 + 1;
            int f;
            if (c2.d != null) {
                f = c2.d.f;
            }
            else {
                f = -1;
            }
            a2[n4] = f;
            final int[] a3 = this.a;
            final int n6 = n5 + 1;
            a3[n5] = c2.e;
            final int[] a4 = this.a;
            final int n7 = n6 + 1;
            a4[n6] = c2.f;
            final int[] a5 = this.a;
            final int n8 = n7 + 1;
            a5[n7] = c2.g;
            final int[] a6 = this.a;
            final int n9 = n8 + 1;
            a6[n8] = c2.h;
            if (c2.i != null) {
                final int size = c2.i.size();
                final int[] a7 = this.a;
                n3 = n9 + 1;
                a7[n9] = size;
                for (int i = 0; i < size; ++i, ++n3) {
                    this.a[n3] = ((Fragment)c2.i.get(i)).f;
                }
            }
            else {
                final int[] a8 = this.a;
                n3 = n9 + 1;
                a8[n9] = 0;
            }
            c2 = c2.a;
        }
        this.b = b.i;
        this.c = b.j;
        this.d = b.m;
        this.e = b.o;
        this.f = b.p;
        this.g = b.q;
        this.h = b.r;
        this.i = b.s;
    }
    
    public b a(final m m) {
        final b b = new b(m);
        int i = 0;
        while (i < this.a.length) {
            final c c = new c();
            final int[] a = this.a;
            final int n = i + 1;
            c.c = a[i];
            if (m.a) {
                Log.v("FragmentManager", "BSE " + b + " set base fragment #" + this.a[n]);
            }
            final int[] a2 = this.a;
            final int n2 = n + 1;
            final int index = a2[n];
            if (index >= 0) {
                c.d = (Fragment)m.f.get(index);
            }
            else {
                c.d = null;
            }
            final int[] a3 = this.a;
            final int n3 = n2 + 1;
            c.e = a3[n2];
            final int[] a4 = this.a;
            final int n4 = n3 + 1;
            c.f = a4[n3];
            final int[] a5 = this.a;
            final int n5 = n4 + 1;
            c.g = a5[n4];
            final int[] a6 = this.a;
            final int n6 = n5 + 1;
            c.h = a6[n5];
            final int[] a7 = this.a;
            int n7 = n6 + 1;
            final int initialCapacity = a7[n6];
            i = n7;
            if (initialCapacity > 0) {
                c.i = new ArrayList(initialCapacity);
                int n8 = 0;
                while (true) {
                    i = n7;
                    if (n8 >= initialCapacity) {
                        break;
                    }
                    if (m.a) {
                        Log.v("FragmentManager", "BSE " + b + " set remove fragment #" + this.a[n7]);
                    }
                    c.i.add(m.f.get(this.a[n7]));
                    ++n8;
                    ++n7;
                }
            }
            b.a(c);
        }
        b.i = this.b;
        b.j = this.c;
        b.m = this.d;
        b.o = this.e;
        b.k = true;
        b.p = this.f;
        b.q = this.g;
        b.r = this.h;
        b.s = this.i;
        b.a(1);
        return b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
    }
}
