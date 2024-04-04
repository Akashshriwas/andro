/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.c;
import com.google.android.gms.drive.metadata.internal.d;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MetadataBundle
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int a;
    final Bundle b;

    MetadataBundle(int n2, Bundle bundle) {
        this.a = n2;
        this.b = (Bundle)hc.a((Object)bundle);
        this.b.setClassLoader(this.getClass().getClassLoader());
        for (String string : this.b.keySet()) {
            if (c.a(string) != null) continue;
            this.b.remove(string);
            Log.w((String)"MetadataBundle", (String)("Ignored unknown metadata field in bundle: " + string));
        }
    }

    public Set a() {
        HashSet hashSet = new HashSet();
        Iterator iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            hashSet.add((Object)c.a((String)iterator.next()));
        }
        return hashSet;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MetadataBundle)) {
            return false;
        }
        object = (MetadataBundle)object;
        Set set = this.b.keySet();
        if (!set.equals((Object)object.b.keySet())) {
            return false;
        }
        for (String string : set) {
            if (gw.a(this.b.get(string), object.b.get(string))) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        Iterator iterator = this.b.keySet().iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            n2 = this.b.get(string).hashCode() + n2 * 31;
        }
        return n2;
    }

    public String toString() {
        return "MetadataBundle [values=" + (Object)this.b + "]";
    }

    public void writeToParcel(Parcel parcel, int n2) {
        d.a(this, parcel, n2);
    }
}

