/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.b;
import android.support.v4.app.c;
import android.support.v4.app.d;
import android.support.v4.app.m;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;

    public BackStackState(Parcel parcel) {
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

    /*
     * Enabled aggressive block sorting
     */
    public BackStackState(m object, b b2) {
        int n2;
        object = b2.b;
        int n3 = 0;
        while (object != null) {
            n2 = n3;
            if (object.i != null) {
                n2 = n3 + object.i.size();
            }
            object = object.a;
            n3 = n2;
        }
        this.a = new int[n3 + b2.d * 7];
        if (!b2.k) {
            throw new IllegalStateException("Not on back stack");
        }
        object = b2.b;
        n3 = 0;
        do {
            if (object == null) {
                this.b = b2.i;
                this.c = b2.j;
                this.d = b2.m;
                this.e = b2.o;
                this.f = b2.p;
                this.g = b2.q;
                this.h = b2.r;
                this.i = b2.s;
                return;
            }
            int[] arrn = this.a;
            n2 = n3 + 1;
            arrn[n3] = object.c;
            arrn = this.a;
            int n4 = n2 + 1;
            n3 = object.d != null ? object.d.f : -1;
            arrn[n2] = n3;
            arrn = this.a;
            n3 = n4 + 1;
            arrn[n4] = object.e;
            arrn = this.a;
            n2 = n3 + 1;
            arrn[n3] = object.f;
            arrn = this.a;
            n3 = n2 + 1;
            arrn[n2] = object.g;
            arrn = this.a;
            n2 = n3 + 1;
            arrn[n3] = object.h;
            if (object.i != null) {
                n4 = object.i.size();
                arrn = this.a;
                n3 = n2 + 1;
                arrn[n2] = n4;
                for (n2 = 0; n2 < n4; ++n2, ++n3) {
                    this.a[n3] = ((Fragment)object.i.get((int)n2)).f;
                }
            } else {
                arrn = this.a;
                n3 = n2 + 1;
                arrn[n2] = 0;
            }
            object = object.a;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public b a(m m2) {
        b b2 = new b(m2);
        int n2 = 0;
        do {
            if (n2 >= this.a.length) {
                b2.i = this.b;
                b2.j = this.c;
                b2.m = this.d;
                b2.o = this.e;
                b2.k = true;
                b2.p = this.f;
                b2.q = this.g;
                b2.r = this.h;
                b2.s = this.i;
                b2.a(1);
                return b2;
            }
            c c2 = new c();
            Object object = this.a;
            int n3 = n2 + 1;
            c2.c = object[n2];
            if (m.a) {
                Log.v((String)"FragmentManager", (String)("BSE " + b2 + " set base fragment #" + this.a[n3]));
            }
            object = this.a;
            int n4 = n3 + 1;
            n2 = object[n3];
            c2.d = n2 >= 0 ? (Fragment)m2.f.get(n2) : null;
            object = this.a;
            n2 = n4 + 1;
            c2.e = object[n4];
            object = this.a;
            n4 = n2 + 1;
            c2.f = object[n2];
            object = this.a;
            n2 = n4 + 1;
            c2.g = object[n4];
            object = this.a;
            n3 = n2 + 1;
            c2.h = object[n2];
            object = this.a;
            n4 = n3 + 1;
            int n5 = object[n3];
            n2 = n4;
            if (n5 > 0) {
                c2.i = new ArrayList(n5);
                n3 = 0;
                do {
                    n2 = n4;
                    if (n3 >= n5) break;
                    if (m.a) {
                        Log.v((String)"FragmentManager", (String)("BSE " + b2 + " set remove fragment #" + this.a[n4]));
                    }
                    object = (Fragment)m2.f.get(this.a[n4]);
                    c2.i.add(object);
                    ++n3;
                    ++n4;
                } while (true);
            }
            b2.a(c2);
        } while (true);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel((CharSequence)this.g, (Parcel)parcel, (int)0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel((CharSequence)this.i, (Parcel)parcel, (int)0);
    }
}

