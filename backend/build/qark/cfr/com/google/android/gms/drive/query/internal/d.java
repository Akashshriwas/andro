/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Set
 */
package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

class d {
    static b a(MetadataBundle metadataBundle) {
        if ((metadataBundle = metadataBundle.a()).size() != 1) {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        }
        return (b)metadataBundle.iterator().next();
    }
}

