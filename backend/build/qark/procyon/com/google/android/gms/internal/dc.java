// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

final class dc extends Exception
{
    private final int a;
    
    public dc(final String message, final int a) {
        super(message);
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
}
