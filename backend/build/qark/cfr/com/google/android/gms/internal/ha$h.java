/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Deprecated
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
import com.google.android.gms.b.a.b.j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.jc;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$h
extends ee
implements j,
SafeParcelable {
    public static final jc a = new jc();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private String e;
    private final int f = 4;
    private int g;
    private String h;

    static {
        b.put((Object)"label", (Object)ee$a.d("label", 5));
        b.put((Object)"type", (Object)ee$a.a("type", 6, new eb().a("home", 0).a("work", 1).a("blog", 2).a("profile", 3).a("other", 4).a("otherProfile", 5).a("contributor", 6).a("website", 7), false));
        b.put((Object)"value", (Object)ee$a.d("value", 4));
    }

    public ha$h() {
        this.d = 2;
        this.c = new HashSet();
    }

    ha$h(Set set, int n2, String string, int n3, String string2, int n4) {
        this.c = set;
        this.d = n2;
        this.e = string;
        this.g = n3;
        this.h = string2;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.k();
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
            case 5: {
                return this.e;
            }
            case 6: {
                return this.g;
            }
            case 4: 
        }
        return this.h;
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
        jc jc2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha$h)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha$h)object;
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

    @Deprecated
    public int h() {
        return 4;
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

    public String j() {
        return this.h;
    }

    public ha$h k() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        jc jc2 = a;
        jc.a(this, parcel, n2);
    }
}

