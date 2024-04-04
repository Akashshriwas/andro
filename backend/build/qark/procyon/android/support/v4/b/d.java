// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

class d implements Parcelable$ClassLoaderCreator
{
    private final c a;
    
    public d(final c a) {
        this.a = a;
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a.a(parcel, null);
    }
    
    public Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        return this.a.a(parcel, classLoader);
    }
    
    public Object[] newArray(final int n) {
        return this.a.a(n);
    }
}
