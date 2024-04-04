/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Modifier
 */
package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.a.a;
import android.support.v4.a.b;
import android.support.v4.app.g;
import android.support.v4.app.m;
import android.support.v4.app.x;
import android.support.v4.app.y;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class z
implements b {
    final int a;
    final Bundle b;
    x c;
    a d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    z n;
    final /* synthetic */ y o;

    /*
     * Enabled aggressive block sorting
     */
    void a() {
        if (this.i && this.j) {
            this.h = true;
            return;
        }
        if (this.h) return;
        this.h = true;
        if (y.a) {
            Log.v((String)"LoaderManager", (String)("  Starting: " + this));
        }
        if (this.d == null && this.c != null) {
            this.d = this.c.a(this.a, this.b);
        }
        if (this.d == null) return;
        {
            if (this.d.getClass().isMemberClass() && !Modifier.isStatic((int)this.d.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
            }
        }
        if (!this.m) {
            this.d.a(this.a, this);
            this.m = true;
        }
        this.d.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(a a2, Object object) {
        String string;
        if (this.c != null) {
            if (this.o.d != null) {
                string = this.o.d.b.s;
                this.o.d.b.s = "onLoadFinished";
            } else {
                string = null;
            }
            if (y.a) {
                Log.v((String)"LoaderManager", (String)("  onLoadFinished in " + a2 + ": " + a2.a(object)));
            }
            this.c.a(a2, object);
            this.f = true;
        }
        return;
        finally {
            if (this.o.d != null) {
                this.o.d.b.s = string;
            }
        }
    }

    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        printWriter.print(string);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mArgs=");
        printWriter.println((Object)this.b);
        printWriter.print(string);
        printWriter.print("mCallbacks=");
        printWriter.println((Object)this.c);
        printWriter.print(string);
        printWriter.print("mLoader=");
        printWriter.println((Object)this.d);
        if (this.d != null) {
            this.d.a(string + "  ", fileDescriptor, printWriter, arrstring);
        }
        if (this.e || this.f) {
            printWriter.print(string);
            printWriter.print("mHaveData=");
            printWriter.print(this.e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f);
            printWriter.print(string);
            printWriter.print("mData=");
            printWriter.println(this.g);
        }
        printWriter.print(string);
        printWriter.print("mStarted=");
        printWriter.print(this.h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.l);
        printWriter.print(string);
        printWriter.print("mRetaining=");
        printWriter.print(this.i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(string);
            printWriter.println("Pending Loader ");
            printWriter.print((Object)this.n);
            printWriter.println(":");
            this.n.a(string + "  ", fileDescriptor, printWriter, arrstring);
        }
    }

    void b() {
        if (y.a) {
            Log.v((String)"LoaderManager", (String)("  Retaining: " + this));
        }
        this.i = true;
        this.j = this.h;
        this.h = false;
        this.c = null;
    }

    void c() {
        if (this.i) {
            if (y.a) {
                Log.v((String)"LoaderManager", (String)("  Finished Retaining: " + this));
            }
            this.i = false;
            if (this.h != this.j && !this.h) {
                this.e();
            }
        }
        if (this.h && this.e && !this.k) {
            this.a(this.d, this.g);
        }
    }

    void d() {
        if (this.h && this.k) {
            this.k = false;
            if (this.e) {
                this.a(this.d, this.g);
            }
        }
    }

    void e() {
        if (y.a) {
            Log.v((String)"LoaderManager", (String)("  Stopping: " + this));
        }
        this.h = false;
        if (!this.i && this.d != null && this.m) {
            this.m = false;
            this.d.a(this);
            this.d.c();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void f() {
        String string;
        if (y.a) {
            Log.v((String)"LoaderManager", (String)("  Destroying: " + this));
        }
        this.l = true;
        boolean bl2 = this.f;
        this.f = false;
        if (this.c != null && this.d != null && this.e && bl2) {
            if (y.a) {
                Log.v((String)"LoaderManager", (String)("  Reseting: " + this));
            }
            if (this.o.d != null) {
                string = this.o.d.b.s;
                this.o.d.b.s = "onLoaderReset";
            } else {
                string = null;
            }
            this.c.a(this.d);
        }
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null) {
            if (this.m) {
                this.m = false;
                this.d.a(this);
            }
            this.d.e();
        }
        if (this.n != null) {
            this.n.f();
        }
        return;
        finally {
            if (this.o.d != null) {
                this.o.d.b.s = string;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.a);
        stringBuilder.append(" : ");
        android.support.v4.c.a.a(this.d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

