// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.support.v4.c.a;
import android.util.Log;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.support.v4.c.c;

class y extends w
{
    static boolean a;
    final c b;
    final c c;
    g d;
    boolean e;
    boolean f;
    
    static {
        y.a = false;
    }
    
    y(final g d, final boolean e) {
        this.b = new c();
        this.c = new c();
        this.d = d;
        this.e = e;
    }
    
    void a(final g d) {
        this.d = d;
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final int n = 0;
        if (this.b.a() > 0) {
            printWriter.print(s);
            printWriter.println("Active Loaders:");
            final String string = s + "    ";
            for (int i = 0; i < this.b.a(); ++i) {
                final z z = (z)this.b.f(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(this.b.e(i));
                printWriter.print(": ");
                printWriter.println(z.toString());
                z.a(string, fileDescriptor, printWriter, array);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(s);
            printWriter.println("Inactive Loaders:");
            final String string2 = s + "    ";
            for (int j = n; j < this.c.a(); ++j) {
                final z z2 = (z)this.c.f(j);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(this.c.e(j));
                printWriter.print(": ");
                printWriter.println(z2.toString());
                z2.a(string2, fileDescriptor, printWriter, array);
            }
        }
    }
    
    @Override
    public boolean a() {
        final int a = this.b.a();
        int i = 0;
        boolean b = false;
        while (i < a) {
            final z z = (z)this.b.f(i);
            b |= (z.h && !z.f);
            ++i;
        }
        return b;
    }
    
    void b() {
        if (y.a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.e) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, (Throwable)ex);
        }
        else {
            this.e = true;
            for (int i = this.b.a() - 1; i >= 0; --i) {
                ((z)this.b.f(i)).a();
            }
        }
    }
    
    void c() {
        if (y.a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.e) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, (Throwable)ex);
            return;
        }
        for (int i = this.b.a() - 1; i >= 0; --i) {
            ((z)this.b.f(i)).e();
        }
        this.e = false;
    }
    
    void d() {
        if (y.a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.e) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, (Throwable)ex);
        }
        else {
            this.f = true;
            this.e = false;
            for (int i = this.b.a() - 1; i >= 0; --i) {
                ((z)this.b.f(i)).b();
            }
        }
    }
    
    void e() {
        if (this.f) {
            if (y.a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f = false;
            for (int i = this.b.a() - 1; i >= 0; --i) {
                ((z)this.b.f(i)).c();
            }
        }
    }
    
    void f() {
        for (int i = this.b.a() - 1; i >= 0; --i) {
            ((z)this.b.f(i)).k = true;
        }
    }
    
    void g() {
        for (int i = this.b.a() - 1; i >= 0; --i) {
            ((z)this.b.f(i)).d();
        }
    }
    
    void h() {
        if (!this.f) {
            if (y.a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int i = this.b.a() - 1; i >= 0; --i) {
                ((z)this.b.f(i)).f();
            }
        }
        if (y.a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int j = this.c.a() - 1; j >= 0; --j) {
            ((z)this.c.f(j)).f();
        }
        this.c.b();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.c.a.a(this.d, sb);
        sb.append("}}");
        return sb.toString();
    }
}
