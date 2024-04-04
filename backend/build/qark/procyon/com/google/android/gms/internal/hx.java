// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Arrays;
import com.google.android.gms.drive.metadata.internal.f;

public class hx extends f
{
    public static final hx a;
    
    static {
        a = new hx();
    }
    
    private hx() {
        super("driveId", Arrays.asList("sqlId", "resourceId"));
    }
}
