// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.lang.reflect.Modifier;
import android.util.Log;
import android.support.v4.a.a;
import android.os.Bundle;
import android.support.v4.a.b;

final class z implements b
{
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
    
    void a() {
        if (this.i && this.j) {
            this.h = true;
        }
        else if (!this.h) {
            this.h = true;
            if (y.a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.d == null && this.c != null) {
                this.d = this.c.a(this.a, this.b);
            }
            if (this.d != null) {
                if (this.d.getClass().isMemberClass() && !Modifier.isStatic(this.d.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
                }
                if (!this.m) {
                    this.d.a(this.a, this);
                    this.m = true;
                }
                this.d.a();
            }
        }
    }
    
    void a(final a obj, final Object o) {
        if (this.c == null) {
            return;
        }
        while (true) {
            Label_0158: {
                if (this.o.d == null) {
                    break Label_0158;
                }
                final String s = this.o.d.b.s;
                this.o.d.b.s = "onLoadFinished";
                try {
                    if (y.a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + obj + ": " + obj.a(o));
                    }
                    this.c.a(obj, o);
                    if (this.o.d != null) {
                        this.o.d.b.s = s;
                    }
                    this.f = true;
                    return;
                }
                finally {
                    if (this.o.d != null) {
                        this.o.d.b.s = s;
                    }
                }
            }
            final String s = null;
            continue;
        }
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mArgs=");
        printWriter.println(this.b);
        printWriter.print(s);
        printWriter.print("mCallbacks=");
        printWriter.println(this.c);
        printWriter.print(s);
        printWriter.print("mLoader=");
        printWriter.println(this.d);
        if (this.d != null) {
            this.d.a(s + "  ", fileDescriptor, printWriter, array);
        }
        if (this.e || this.f) {
            printWriter.print(s);
            printWriter.print("mHaveData=");
            printWriter.print(this.e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f);
            printWriter.print(s);
            printWriter.print("mData=");
            printWriter.println(this.g);
        }
        printWriter.print(s);
        printWriter.print("mStarted=");
        printWriter.print(this.h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.l);
        printWriter.print(s);
        printWriter.print("mRetaining=");
        printWriter.print(this.i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(s);
            printWriter.println("Pending Loader ");
            printWriter.print(this.n);
            printWriter.println(":");
            this.n.a(s + "  ", fileDescriptor, printWriter, array);
        }
    }
    
    void b() {
        if (y.a) {
            Log.v("LoaderManager", "  Retaining: " + this);
        }
        this.i = true;
        this.j = this.h;
        this.h = false;
        this.c = null;
    }
    
    void c() {
        if (this.i) {
            if (y.a) {
                Log.v("LoaderManager", "  Finished Retaining: " + this);
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
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.h = false;
        if (!this.i && this.d != null && this.m) {
            this.m = false;
            this.d.a(this);
            this.d.c();
        }
    }
    
    void f() {
        if (y.a) {
            Log.v("LoaderManager", "  Destroying: " + this);
        }
        this.l = true;
        final boolean f = this.f;
        this.f = false;
        while (true) {
            Label_0178: {
                if (this.c == null || this.d == null || !this.e || !f) {
                    break Label_0178;
                }
                if (y.a) {
                    Log.v("LoaderManager", "  Reseting: " + this);
                }
                if (this.o.d == null) {
                    break Label_0178;
                }
                final String s = this.o.d.b.s;
                this.o.d.b.s = "onLoaderReset";
                try {
                    this.c.a(this.d);
                    if (this.o.d != null) {
                        this.o.d.b.s = s;
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
                }
                finally {
                    if (this.o.d != null) {
                        this.o.d.b.s = s;
                    }
                }
            }
            final String s = null;
            continue;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        android.support.v4.c.a.a(this.d, sb);
        sb.append("}}");
        return sb.toString();
    }
}
