// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.internal.gw;
import com.google.android.gms.drive.metadata.b;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import android.util.Log;
import com.google.android.gms.internal.hc;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MetadataBundle implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final Bundle b;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    MetadataBundle(final int a, final Bundle bundle) {
        this.a = a;
        (this.b = (Bundle)hc.a(bundle)).setClassLoader(this.getClass().getClassLoader());
        for (final String str : this.b.keySet()) {
            if (c.a(str) == null) {
                this.b.remove(str);
                Log.w("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
            }
        }
    }
    
    public Set a() {
        final HashSet<b> set = new HashSet<b>();
        final Iterator<String> iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            set.add(c.a(iterator.next()));
        }
        return set;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetadataBundle)) {
            return false;
        }
        final MetadataBundle metadataBundle = (MetadataBundle)o;
        final Set keySet = this.b.keySet();
        if (!keySet.equals(metadataBundle.b.keySet())) {
            return false;
        }
        for (final String s : keySet) {
            if (!gw.a(this.b.get(s), metadataBundle.b.get(s))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final Iterator<String> iterator = this.b.keySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            n = this.b.get((String)iterator.next()).hashCode() + n * 31;
        }
        return n;
    }
    
    @Override
    public String toString() {
        return "MetadataBundle [values=" + this.b + "]";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        d.a(this, parcel, n);
    }
}
