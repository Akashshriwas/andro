/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package android.support.v4.app;

import android.support.v4.app.g;
import android.support.v4.app.w;
import android.support.v4.app.z;
import android.support.v4.c.a;
import android.support.v4.c.c;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class y
extends w {
    static boolean a = false;
    final c b = new c();
    final c c = new c();
    g d;
    boolean e;
    boolean f;

    y(g g2, boolean bl2) {
        this.d = g2;
        this.e = bl2;
    }

    void a(g g2) {
        this.d = g2;
    }

    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        int n2;
        String string2;
        z z2;
        int n3 = 0;
        if (this.b.a() > 0) {
            printWriter.print(string);
            printWriter.println("Active Loaders:");
            string2 = string + "    ";
            for (n2 = 0; n2 < this.b.a(); ++n2) {
                z2 = (z)this.b.f(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(this.b.e(n2));
                printWriter.print(": ");
                printWriter.println(z2.toString());
                z2.a(string2, fileDescriptor, printWriter, arrstring);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(string);
            printWriter.println("Inactive Loaders:");
            string2 = string + "    ";
            for (n2 = n3; n2 < this.c.a(); ++n2) {
                z2 = (z)this.c.f(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(this.c.e(n2));
                printWriter.print(": ");
                printWriter.println(z2.toString());
                z2.a(string2, fileDescriptor, printWriter, arrstring);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean a() {
        int n2 = this.b.a();
        int n3 = 0;
        boolean bl2 = false;
        while (n3 < n2) {
            z z2 = (z)this.b.f(n3);
            boolean bl3 = z2.h && !z2.f;
            bl2 |= bl3;
            ++n3;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    void b() {
        if (a) {
            Log.v((String)"LoaderManager", (String)("Starting in " + this));
        }
        if (this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w((String)"LoaderManager", (String)("Called doStart when already started: " + this), (Throwable)runtimeException);
            return;
        } else {
            this.e = true;
            for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
                ((z)this.b.f(i2)).a();
            }
        }
    }

    void c() {
        if (a) {
            Log.v((String)"LoaderManager", (String)("Stopping in " + this));
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w((String)"LoaderManager", (String)("Called doStop when not started: " + this), (Throwable)runtimeException);
            return;
        }
        for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
            ((z)this.b.f(i2)).e();
        }
        this.e = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    void d() {
        if (a) {
            Log.v((String)"LoaderManager", (String)("Retaining in " + this));
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w((String)"LoaderManager", (String)("Called doRetain when not started: " + this), (Throwable)runtimeException);
            return;
        } else {
            this.f = true;
            this.e = false;
            for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
                ((z)this.b.f(i2)).b();
            }
        }
    }

    void e() {
        if (this.f) {
            if (a) {
                Log.v((String)"LoaderManager", (String)("Finished Retaining in " + this));
            }
            this.f = false;
            for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
                ((z)this.b.f(i2)).c();
            }
        }
    }

    void f() {
        for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
            ((z)this.b.f((int)i2)).k = true;
        }
    }

    void g() {
        for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
            ((z)this.b.f(i2)).d();
        }
    }

    void h() {
        int n2;
        if (!this.f) {
            if (a) {
                Log.v((String)"LoaderManager", (String)("Destroying Active in " + this));
            }
            for (n2 = this.b.a() - 1; n2 >= 0; --n2) {
                ((z)this.b.f(n2)).f();
            }
        }
        if (a) {
            Log.v((String)"LoaderManager", (String)("Destroying Inactive in " + this));
        }
        for (n2 = this.c.a() - 1; n2 >= 0; --n2) {
            ((z)this.c.f(n2)).f();
        }
        this.c.b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" in ");
        a.a((Object)this.d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

