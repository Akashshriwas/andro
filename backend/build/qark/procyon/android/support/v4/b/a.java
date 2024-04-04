// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.b;

import android.os.Build$VERSION;
import android.os.Parcelable$Creator;

public class a
{
    public static Parcelable$Creator a(final c c) {
        if (Build$VERSION.SDK_INT >= 13) {
            e.a(c);
        }
        return (Parcelable$Creator)new b(c);
    }
}
