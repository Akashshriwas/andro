// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.util.Base64;

class a implements jk
{
    @Override
    public String a(final byte[] array, final boolean b) {
        int n;
        if (b) {
            n = 11;
        }
        else {
            n = 2;
        }
        return Base64.encodeToString(array, n);
    }
    
    @Override
    public byte[] a(final String s, final boolean b) {
        int n;
        if (b) {
            n = 11;
        }
        else {
            n = 2;
        }
        return Base64.decode(s, n);
    }
}
