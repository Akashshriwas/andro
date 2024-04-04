// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable$Creator;

class b implements Parcelable$Creator
{
    final c a;
    
    public b(final c a) {
        this.a = a;
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a.a(parcel, null);
    }
    
    public Object[] newArray(final int n) {
        return this.a.a(n);
    }
}
