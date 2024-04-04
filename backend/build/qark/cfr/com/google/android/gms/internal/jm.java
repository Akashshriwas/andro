/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.security.SecureRandom
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.BadPaddingException
 *  javax.crypto.Cipher
 *  javax.crypto.IllegalBlockSizeException
 *  javax.crypto.NoSuchPaddingException
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jn;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class jm {
    private final jk a;
    private final SecureRandom b;

    public jm(jk jk2, SecureRandom secureRandom) {
        this.a = jk2;
        this.b = secureRandom;
    }

    static void a(byte[] arrby) {
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)(arrby[i2] ^ 68);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] a(String byteBuffer) {
        try {
            byteBuffer = this.a.a((String)byteBuffer, false);
            if (byteBuffer.length != 32) {
                throw new jn(this);
            }
            byteBuffer = ByteBuffer.wrap((byte[])byteBuffer, (int)4, (int)16);
            byte[] arrby = new byte[16];
            byteBuffer.get(arrby);
            jm.a(arrby);
            return arrby;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new jn(this, (Throwable)illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] a(byte[] arrby, String arrby2) {
        if (arrby.length != 16) {
            throw new jn(this);
        }
        try {
            byte[] arrby3 = this.a.a((String)arrby2, false);
            if (arrby3.length <= 16) {
                throw new jn(this);
            }
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)arrby3.length);
            byteBuffer.put(arrby3);
            byteBuffer.flip();
            arrby2 = new byte[16];
            arrby3 = new byte[arrby3.length - 16];
            byteBuffer.get(arrby2);
            byteBuffer.get(arrby3);
            arrby = new byte[](arrby, "AES");
            byteBuffer = Cipher.getInstance((String)"AES/CBC/PKCS5Padding");
            byteBuffer.init(2, (Key)arrby, (AlgorithmParameterSpec)new IvParameterSpec(arrby2));
            return byteBuffer.doFinal(arrby3);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new jn(this, (Throwable)noSuchAlgorithmException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new jn(this, (Throwable)invalidKeyException);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new jn(this, (Throwable)illegalBlockSizeException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new jn(this, (Throwable)noSuchPaddingException);
        }
        catch (BadPaddingException badPaddingException) {
            throw new jn(this, (Throwable)badPaddingException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new jn(this, (Throwable)invalidAlgorithmParameterException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new jn(this, (Throwable)illegalArgumentException);
        }
    }
}

