/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package android.support.v4.a;

import android.support.v4.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class a {
    int a;
    b b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;

    public String a(Object object) {
        StringBuilder stringBuilder = new StringBuilder(64);
        android.support.v4.c.a.a(object, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void a() {
        this.c = true;
        this.e = false;
        this.d = false;
        this.b();
    }

    public void a(int n2, b b2) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = b2;
        this.a = n2;
    }

    public void a(b b2) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.b != b2) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        printWriter.print(string);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println((Object)this.b);
        printWriter.print(string);
        printWriter.print("mStarted=");
        printWriter.print(this.c);
        printWriter.print(" mContentChanged=");
        printWriter.print(this.f);
        printWriter.print(" mAbandoned=");
        printWriter.print(this.d);
        printWriter.print(" mReset=");
        printWriter.println(this.e);
    }

    protected void b() {
    }

    public void c() {
        this.c = false;
        this.d();
    }

    protected void d() {
    }

    public void e() {
        this.f();
        this.e = true;
        this.c = false;
        this.d = false;
        this.f = false;
    }

    protected void f() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        android.support.v4.c.a.a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

