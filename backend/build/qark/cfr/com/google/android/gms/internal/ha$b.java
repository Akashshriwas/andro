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
import com.google.android.gms.b.a.b.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.ha$b$a;
import com.google.android.gms.internal.ha$b$b;
import com.google.android.gms.internal.iv;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$b
extends ee
implements c,
SafeParcelable {
    public static final iv a = new iv();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private ha$b$a e;
    private ha$b$b f;
    private int g;

    static {
        b.put((Object)"coverInfo", (Object)ee$a.a("coverInfo", 2, ha$b$a.class));
        b.put((Object)"coverPhoto", (Object)ee$a.a("coverPhoto", 3, ha$b$b.class));
        b.put((Object)"layout", (Object)ee$a.a("layout", 4, new eb().a("banner", 0), false));
    }

    public ha$b() {
        this.d = 1;
        this.c = new HashSet();
    }

    ha$b(Set set, int n2, ha$b$a ha$b$a, ha$b$b ha$b$b, int n3) {
        this.c = set;
        this.d = n2;
        this.e = ha$b$a;
        this.f = ha$b$b;
        this.g = n3;
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
        iv iv2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha$b)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha$b)object;
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

    ha$b$a g() {
        return this.e;
    }

    ha$b$b h() {
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

    public ha$b j() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        iv iv2 = a;
        iv.a(this, parcel, n2);
    }
}

