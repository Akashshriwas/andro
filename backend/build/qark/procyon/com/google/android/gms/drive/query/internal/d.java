// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import java.util.Set;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

class d
{
    static b a(final MetadataBundle metadataBundle) {
        final Set a = metadataBundle.a();
        if (a.size() != 1) {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        }
        return a.iterator().next();
    }
}
