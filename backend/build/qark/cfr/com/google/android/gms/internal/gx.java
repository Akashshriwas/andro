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
import com.google.android.gms.b.a.a.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.gv;
import com.google.android.gms.internal.ir;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gx
extends ee
implements b,
SafeParcelable {
    public static final ir a = new ir();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private String e;
    private gv f;
    private String g;
    private gv h;
    private String i;

    static {
        b.put((Object)"id", (Object)ee$a.d("id", 2));
        b.put((Object)"result", (Object)ee$a.a("result", 4, gv.class));
        b.put((Object)"startDate", (Object)ee$a.d("startDate", 5));
        b.put((Object)"target", (Object)ee$a.a("target", 6, gv.class));
        b.put((Object)"type", (Object)ee$a.d("type", 7));
    }

    public gx() {
        this.d = 1;
        this.c = new HashSet();
    }

    gx(Set set, int n2, String string, gv gv2, String string2, gv gv3, String string3) {
        this.c = set;
        this.d = n2;
        this.e = string;
        this.f = gv2;
        this.g = string2;
        this.h = gv3;
        this.i = string3;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.l();
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
            case 4: {
                return this.f;
            }
            case 5: {
                return this.g;
            }
            case 6: {
                return this.h;
            }
            case 7: 
        }
        return this.i;
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
        ir ir2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof gx)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (gx)object;
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

    public String g() {
        return this.e;
    }

    gv h() {
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

    public String i() {
        return this.g;
    }

    gv j() {
        return this.h;
    }

    public String k() {
        return this.i;
    }

    public gx l() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ir ir2 = a;
        ir.a(this, parcel, n2);
    }
}

