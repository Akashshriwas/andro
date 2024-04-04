// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class cb implements SafeParcelable
{
    public static final do a;
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
    
    static {
        a = new do();
    }
    
    public cb(final int n) {
        this(2, null, null, null, n, null, -1L, false, -1L, null, -1L, -1, null);
    }
    
    cb(final int b, final String c, final String d, final List list, final int f, final List list2, final long h, final boolean i, final long j, final List list3, final long l, final int m, final String n) {
        this.b = b;
        this.c = c;
        this.d = d;
        List<Object> unmodifiableList;
        if (list != null) {
            unmodifiableList = Collections.unmodifiableList((List<?>)list);
        }
        else {
            unmodifiableList = null;
        }
        this.e = unmodifiableList;
        this.f = f;
        List<Object> unmodifiableList2;
        if (list2 != null) {
            unmodifiableList2 = Collections.unmodifiableList((List<?>)list2);
        }
        else {
            unmodifiableList2 = null;
        }
        this.g = unmodifiableList2;
        this.h = h;
        this.i = i;
        this.j = j;
        List<Object> unmodifiableList3;
        if (list3 != null) {
            unmodifiableList3 = Collections.unmodifiableList((List<?>)list3);
        }
        else {
            unmodifiableList3 = null;
        }
        this.k = unmodifiableList3;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public cb(final String s, final String s2, final List list, final List list2, final long n, final boolean b, final long n2, final List list3, final long n3, final int n4, final String s3) {
        this(2, s, s2, list, -2, list2, n, b, n2, list3, n3, n4, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        do.a(this, parcel, n);
    }
}
