// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Fragment$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final Bundle a;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    Fragment$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        this.a = parcel.readBundle();
        if (classLoader != null && this.a != null) {
            this.a.setClassLoader(classLoader);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.a);
    }
}
