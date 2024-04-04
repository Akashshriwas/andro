/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  java.io.IOException
 *  java.io.UnsupportedEncodingException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.security.SecureRandom
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.jd;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jl;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class he
implements fl {
    protected MotionEvent a;
    protected DisplayMetrics b;
    protected jk c;
    private jl d;

    protected he(Context context, jk jk2, jl jl2) {
        this.c = jk2;
        this.d = jl2;
        try {
            this.b = context.getResources().getDisplayMetrics();
            return;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            this.b = new DisplayMetrics();
            this.b.density = 1.0f;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private String a(Context object, String string, boolean bl2) {
        block12 : {
            this.a();
            if (bl2) {
                this.c((Context)object);
            } else {
                this.b((Context)object);
            }
            object = this.b();
            // MONITOREXIT : this
            if (object.length != 0) break block12;
            return Integer.toString((int)5);
        }
        try {
            return this.a((byte[])object, string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return Integer.toString((int)7);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return Integer.toString((int)7);
        }
        catch (IOException iOException) {
            return Integer.toString((int)3);
        }
    }

    private void a() {
        this.d.a();
    }

    private byte[] b() {
        return this.d.b();
    }

    @Override
    public String a(Context context) {
        return this.a(context, null, false);
    }

    @Override
    public String a(Context context, String string) {
        return this.a(context, string, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    String a(byte[] arrby, String string) {
        byte[] arrby2 = arrby;
        if (arrby.length > 239) {
            this.a();
            this.a(20, 1L);
            arrby2 = this.b();
        }
        if (arrby2.length < 239) {
            arrby = new byte[239 - arrby2.length];
            new SecureRandom().nextBytes(arrby);
            arrby = ByteBuffer.allocate((int)240).put((byte)arrby2.length).put(arrby2).put(arrby).array();
        } else {
            arrby = ByteBuffer.allocate((int)240).put((byte)arrby2.length).put(arrby2).array();
        }
        arrby2 = MessageDigest.getInstance((String)"MD5");
        arrby2.update(arrby);
        arrby2 = arrby2.digest();
        arrby = ByteBuffer.allocate((int)256).put(arrby2).put(arrby).array();
        arrby2 = new byte[256];
        new au().a(arrby, arrby2);
        if (string != null && string.length() > 0) {
            this.a(string, arrby2);
        }
        return this.c.a(arrby2, true);
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (this.a != null) {
            this.a.recycle();
        }
        this.a = MotionEvent.obtain((long)0L, (long)n4, (int)1, (float)((float)n2 * this.b.density), (float)((float)n3 * this.b.density), (float)0.0f, (float)0.0f, (int)0, (float)0.0f, (float)0.0f, (int)0, (int)0);
    }

    protected void a(int n2, long l2) {
        this.d.a(n2, l2);
    }

    protected void a(int n2, String string) {
        this.d.a(n2, string);
    }

    @Override
    public void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.a != null) {
                this.a.recycle();
            }
            this.a = MotionEvent.obtain((MotionEvent)motionEvent);
        }
    }

    void a(String string, byte[] arrby) {
        String string2 = string;
        if (string.length() > 32) {
            string2 = string.substring(0, 32);
        }
        new jd(string2.getBytes("UTF-8")).a(arrby);
    }

    protected abstract void b(Context var1);

    protected abstract void c(Context var1);
}

