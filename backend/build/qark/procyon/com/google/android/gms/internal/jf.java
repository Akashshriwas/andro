// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.io.IOException;

public class jf extends IOException
{
    jf(final int i, final int j) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + j + ").");
    }
}
