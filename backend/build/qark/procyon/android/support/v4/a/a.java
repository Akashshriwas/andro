// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.a;

import java.io.PrintWriter;
import java.io.FileDescriptor;

public class a
{
    int a;
    b b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    
    public String a(final Object o) {
        final StringBuilder sb = new StringBuilder(64);
        android.support.v4.c.a.a(o, sb);
        sb.append("}");
        return sb.toString();
    }
    
    public final void a() {
        this.c = true;
        this.e = false;
        this.d = false;
        this.b();
    }
    
    public void a(final int a, final b b) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = b;
        this.a = a;
    }
    
    public void a(final b b) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.b != b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        printWriter.print(s);
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        android.support.v4.c.a.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
