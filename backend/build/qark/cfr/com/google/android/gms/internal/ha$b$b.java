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
import com.google.android.gms.b.a.b.e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.ix;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$b$b
extends ee
implements e,
SafeParcelable {
    public static final ix a = new ix();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private int e;
    private String f;
    private int g;

    static {
        b.put((Object)"height", (Object)ee$a.a("height", 2));
        b.put((Object)"url", (Object)ee$a.d("url", 3));
        b.put((Object)"width", (Object)ee$a.a("width", 4));
    }

    public ha$b$b() {
        this.d = 1;
        this.c = new HashSet();
    }

    ha$b$b(Set set, int n2, int n3, String string, int n4) {
        this.c = set;
        this.d = n2;
        this.e = n3;
        this.f = string;
        this.g = n4;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.j();
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
            case 3: {
                return this.f;
            }
            case 4: 
        }
        return this.g;
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
        ix ix2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha$b$b)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha$b$b)object;
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

    public int g() {
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

    public int i() {
        return this.g;
    }

    public ha$b$b j() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ix ix2 = a;
        ix.a(this, parcel, n2);
    }
}

