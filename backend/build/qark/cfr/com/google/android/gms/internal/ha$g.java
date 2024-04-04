/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.jb;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$g
extends ee
implements i,
SafeParcelable {
    public static final jb a = new jb();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private boolean e;
    private String f;

    static {
        b.put((Object)"primary", (Object)ee$a.c("primary", 2));
        b.put((Object)"value", (Object)ee$a.d("value", 3));
    }

    public ha$g() {
        this.d = 1;
        this.c = new HashSet();
    }

    ha$g(Set set, int n2, boolean bl2, String string) {
        this.c = set;
        this.d = n2;
        this.e = bl2;
        this.f = string;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.i();
    }

    @Override
    protected Object a(String string) {
        return null;
    }

    @Override
    protected boolean a(ee$a ee$a) {
        return this.c.contains((Object)ee$a.g());
    }

    @Override
    protected Object b(ee$a ee$a) {
        switch (ee$a.g()) {
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + ee$a.g());
            }
            case 2: {
                return this.e;
            }
            case 3: 
        }
        return this.f;
    }

    @Override
    public HashMap b() {
        return b;
    }

    @Override
    protected boolean b(String string) {
        return false;
    }

    public int describeContents() {
        jb jb2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha$g)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha$g)object;
        for (ee$a ee$a : b.values()) {
            if (this.a(ee$a)) {
                if (object.a(ee$a)) {
                    if (this.b(ee$a).equals(object.b(ee$a))) continue;
                    return false;
                }
                return false;
            }
            if (!object.a(ee$a)) continue;
            return false;
        }
        return true;
    }

    int f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        Iterator iterator = b.values().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            ee$a ee$a = (ee$a)iterator.next();
            if (!this.a(ee$a)) continue;
            int n3 = ee$a.g();
            n2 = this.b(ee$a).hashCode() + (n2 + n3);
        }
        return n2;
    }

    public ha$g i() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        jb jb2 = a;
        jb.a(this, parcel, n2);
    }
}

