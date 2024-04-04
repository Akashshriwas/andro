// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.images;

import com.google.android.gms.internal.gw;
import android.net.Uri;

public final class f
{
    public final Uri a;
    
    public f(final Uri a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof f)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (this != o) {
                b2 = b;
                if (((f)o).hashCode() != this.hashCode()) {
                    return false;
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return gw.a(new Object[] { this.a });
    }
}
