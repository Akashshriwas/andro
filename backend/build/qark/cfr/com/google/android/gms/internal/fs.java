/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.ie;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class fs
implements SafeParcelable {
    public static final ie a = new ie();
    final int b;
    final List c;
    private final int d;
    private final String e;
    private final String f;
    private final boolean g;
    private final Set h;

    /*
     * Enabled aggressive block sorting
     */
    fs(int n2, int n3, List object, String string, String string2, boolean bl2) {
        this.b = n2;
        this.d = n3;
        object = object == null ? Collections.emptyList() : Collections.unmodifiableList((List)object);
        this.c = object;
        object = string;
        if (string == null) {
            object = "";
        }
        this.e = object;
        object = string2;
        if (string2 == null) {
            object = "";
        }
        this.f = object;
        this.g = bl2;
        if (this.c.isEmpty()) {
            this.h = Collections.emptySet();
            return;
        }
        this.h = Collections.unmodifiableSet((Set)new HashSet((Collection)this.c));
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public boolean d() {
        return this.g;
    }

    public int describeContents() {
        ie ie2 = a;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (!(object instanceof fs)) {
                    return false;
                }
                object = (fs)object;
                if (this.d != object.d || !this.h.equals((Object)object.h) || this.e != object.e || this.f != object.f || this.g != object.g) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.d, this.h, this.e, this.f, this.g});
    }

    public String toString() {
        return gw.a((Object)this).a("maxResults", this.d).a("types", (Object)this.h).a("nameQuery", this.e).a("textQuery", this.f).a("isOpenNowRequired", this.g).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ie ie2 = a;
        ie.a(this, parcel, n2);
    }
}

