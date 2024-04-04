/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.do;
import java.util.Collections;
import java.util.List;

public final class cb
implements SafeParcelable {
    public static final do a = new do();
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final List g;
    public final long h;
    public final boolean i;
    public final long j;
    public final List k;
    public final long l;
    public final int m;
    public final String n;

    public cb(int n2) {
        this(2, null, null, null, n2, null, -1L, false, -1L, null, -1L, -1, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    cb(int n2, String string, String string2, List list, int n3, List list2, long l2, boolean bl2, long l3, List list3, long l4, int n4, String string3) {
        this.b = n2;
        this.c = string;
        this.d = string2;
        string = list != null ? Collections.unmodifiableList((List)list) : null;
        this.e = string;
        this.f = n3;
        string = list2 != null ? Collections.unmodifiableList((List)list2) : null;
        this.g = string;
        this.h = l2;
        this.i = bl2;
        this.j = l3;
        string = list3 != null ? Collections.unmodifiableList((List)list3) : null;
        this.k = string;
        this.l = l4;
        this.m = n4;
        this.n = string3;
    }

    public cb(String string, String string2, List list, List list2, long l2, boolean bl2, long l3, List list3, long l4, int n2, String string3) {
        this(2, string, string2, list, -2, list2, l2, bl2, l3, list3, l4, n2, string3);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        do.a(this, parcel, n2);
    }
}

