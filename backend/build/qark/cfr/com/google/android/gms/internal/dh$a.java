/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dh$a
implements SafeParcelable {
    public static final hb a = new hb();
    private final int b;
    private final String c;
    private final List d = new ArrayList();
    private final int e;
    private final String f;

    dh$a(int n2, String string, List list, int n3, String string2) {
        this.b = n2;
        this.c = string;
        this.d.addAll((Collection)list);
        this.e = n3;
        this.f = string2;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public List d() {
        return new ArrayList((Collection)this.d);
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hb.a(this, parcel, n2);
    }
}

