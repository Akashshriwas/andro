/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  dalvik.system.DexClassLoader
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.Long
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.security.SecureRandom
 *  java.util.ArrayList
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.he;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jn;
import com.google.android.gms.internal.jp;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;

public abstract class hy
extends he {
    static boolean d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static String k;
    private static long l;
    private static jm m;

    static {
        l = 0L;
        d = false;
    }

    protected hy(Context context, jk jk2, jl jl2) {
        super(context, jk2, jl2);
    }

    static String a() {
        if (k == null) {
            throw new hz();
        }
        return k;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String a(Context object, jk jk2) {
        if (g == null) {
            throw new hz();
        }
        try {
            object = (ByteBuffer)g.invoke((Object)null, new Object[]{object});
            if (object != null) return jk2.a(object.array(), true);
            throw new hz();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new hz((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new hz((Throwable)invocationTargetException);
        }
    }

    static ArrayList a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (h == null || motionEvent == null) {
            throw new hz();
        }
        try {
            motionEvent = (ArrayList)h.invoke((Object)null, new Object[]{motionEvent, displayMetrics});
            return motionEvent;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new hz((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new hz((Throwable)invocationTargetException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static void a(String string, Context context, jk jk2) {
        synchronized (hy.class) {
            boolean bl2 = d;
            if (!bl2) {
                try {
                    void var1_3;
                    void var2_4;
                    m = new jm((jk)var2_4, null);
                    k = string;
                    hy.e((Context)var1_3);
                    l = hy.b();
                    d = true;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                }
                catch (hz hz2) {}
            }
            return;
        }
    }

    static Long b() {
        if (e == null) {
            throw new hz();
        }
        try {
            Long l2 = (Long)e.invoke((Object)null, new Object[0]);
            return l2;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new hz((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new hz((Throwable)invocationTargetException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String b(Context object, jk jk2) {
        if (j == null) {
            throw new hz();
        }
        try {
            object = (ByteBuffer)j.invoke((Object)null, new Object[]{object});
            if (object != null) return jk2.a(object.array(), true);
            throw new hz();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new hz((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new hz((Throwable)invocationTargetException);
        }
    }

    private static String b(byte[] object, String string) {
        try {
            object = new String(m.a((byte[])object, string), "UTF-8");
            return object;
        }
        catch (jn jn2) {
            throw new hz((Throwable)jn2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new hz((Throwable)unsupportedEncodingException);
        }
    }

    static String c() {
        if (f == null) {
            throw new hz();
        }
        try {
            String string = (String)f.invoke((Object)null, new Object[0]);
            return string;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new hz((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new hz((Throwable)invocationTargetException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static String d(Context object) {
        if (i == null) {
            throw new hz();
        }
        object = (String)i.invoke((Object)null, new Object[]{object});
        if (object != null) return object;
        try {
            throw new hz();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new hz((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new hz((Throwable)invocationTargetException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void e(Context object) {
        try {
            File file;
            byte[] arrby = m.a(jp.a());
            Class class_ = m.a(arrby, jp.b());
            File file2 = file = object.getCacheDir();
            if (file == null) {
                file2 = file = object.getDir("dex", 0);
                if (file == null) {
                    throw new hz();
                }
            }
            file = File.createTempFile((String)"ads", (String)".jar", (File)file2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write((byte[])class_, 0, class_.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(file.getAbsolutePath(), file2.getAbsolutePath(), null, object.getClassLoader());
            object = dexClassLoader.loadClass(hy.b(arrby, jp.c()));
            class_ = dexClassLoader.loadClass(hy.b(arrby, jp.i()));
            fileOutputStream = dexClassLoader.loadClass(hy.b(arrby, jp.g()));
            Class class_2 = dexClassLoader.loadClass(hy.b(arrby, jp.m()));
            Class class_3 = dexClassLoader.loadClass(hy.b(arrby, jp.e()));
            dexClassLoader = dexClassLoader.loadClass(hy.b(arrby, jp.k()));
            e = object.getMethod(hy.b(arrby, jp.d()), new Class[0]);
            f = class_.getMethod(hy.b(arrby, jp.j()), new Class[0]);
            g = fileOutputStream.getMethod(hy.b(arrby, jp.h()), new Class[]{Context.class});
            h = class_2.getMethod(hy.b(arrby, jp.n()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            i = class_3.getMethod(hy.b(arrby, jp.f()), new Class[]{Context.class});
            j = dexClassLoader.getMethod(hy.b(arrby, jp.l()), new Class[]{Context.class});
            object = file.getName();
            file.delete();
            new File(file2, object.replace((CharSequence)".jar", (CharSequence)".dex")).delete();
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new hz((Throwable)fileNotFoundException);
        }
        catch (IOException iOException) {
            throw new hz((Throwable)iOException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new hz((Throwable)classNotFoundException);
        }
        catch (jn jn2) {
            throw new hz((Throwable)jn2);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new hz((Throwable)noSuchMethodException);
        }
        catch (NullPointerException nullPointerException) {
            throw new hz((Throwable)nullPointerException);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void b(Context context) {
        block10 : {
            try {
                this.a(1, hy.c());
                break block10;
            }
            catch (IOException iOException) {
                return;
            }
            catch (hz hz2) {}
        }
        try {
            this.a(2, hy.a());
        }
        catch (hz hz3) {}
        try {
            this.a(25, hy.b());
        }
        catch (hz hz4) {}
        try {
            this.a(24, hy.d(context));
            return;
        }
        catch (hz hz5) {
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void c(Context context) {
        block16 : {
            try {
                this.a(2, hy.a());
                break block16;
            }
            catch (IOException iOException) {
                return;
            }
            catch (hz hz2) {}
        }
        try {
            this.a(1, hy.c());
        }
        catch (hz hz3) {}
        try {
            long l2 = hy.b();
            this.a(25, l2);
            if (l != 0L) {
                this.a(17, l2 - l);
                this.a(23, l);
            }
        }
        catch (hz hz4) {}
        try {
            ArrayList arrayList = hy.a(this.a, this.b);
            this.a(14, (Long)arrayList.get(0));
            this.a(15, (Long)arrayList.get(1));
            if (arrayList.size() >= 3) {
                this.a(16, (Long)arrayList.get(2));
            }
        }
        catch (hz hz5) {}
        try {
            this.a(27, hy.a(context, this.c));
        }
        catch (hz hz6) {}
        try {
            this.a(29, hy.b(context, this.c));
            return;
        }
        catch (hz hz7) {
            return;
        }
    }
}

