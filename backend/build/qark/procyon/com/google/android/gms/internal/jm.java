// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.security.InvalidAlgorithmParameterException;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

public class jm
{
    private final jk a;
    private final SecureRandom b;
    
    public jm(final jk a, final SecureRandom b) {
        this.a = a;
        this.b = b;
    }
    
    static void a(final byte[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] ^= 0x44;
        }
    }
    
    public byte[] a(final String s) {
        byte[] a;
        try {
            a = this.a.a(s, false);
            if (a.length != 32) {
                throw new jn(this);
            }
        }
        catch (IllegalArgumentException ex) {
            throw new jn(this, ex);
        }
        final ByteBuffer wrap = ByteBuffer.wrap(a, 4, 16);
        final byte[] dst = new byte[16];
        wrap.get(dst);
        a(dst);
        return dst;
    }
    
    public byte[] a(final byte[] array, final String s) {
        if (array.length != 16) {
            throw new jn(this);
        }
        try {
            if (this.a.a(s, false).length <= 16) {
                throw new jn(this);
            }
            goto Label_0055;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new jn(this, ex);
        }
        catch (InvalidKeyException ex2) {
            throw new jn(this, ex2);
        }
        catch (IllegalBlockSizeException ex3) {
            throw new jn(this, ex3);
        }
        catch (NoSuchPaddingException ex4) {
            throw new jn(this, ex4);
        }
        catch (BadPaddingException ex5) {
            throw new jn(this, ex5);
        }
        catch (InvalidAlgorithmParameterException ex6) {
            throw new jn(this, ex6);
        }
        catch (IllegalArgumentException ex7) {
            throw new jn(this, ex7);
        }
    }
}
