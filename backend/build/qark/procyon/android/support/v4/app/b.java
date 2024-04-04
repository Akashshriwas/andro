// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;

final class b extends s implements Runnable
{
    final m a;
    c b;
    c c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;
    
    public b(final m a) {
        this.l = true;
        this.a = a;
    }
    
    private void a(final int v, final Fragment d, final String s, final int c) {
        d.s = this.a;
        if (s != null) {
            if (d.w != null && !s.equals(d.w)) {
                throw new IllegalStateException("Can't change tag of fragment " + d + ": was " + d.w + " now " + s);
            }
            d.w = s;
        }
        if (v != 0) {
            if (d.u != 0 && d.u != v) {
                throw new IllegalStateException("Can't change container ID of fragment " + d + ": was " + d.u + " now " + v);
            }
            d.u = v;
            d.v = v;
        }
        final c c2 = new c();
        c2.c = c;
        c2.d = d;
        this.a(c2);
    }
    
    @Override
    public int a() {
        return this.a(false);
    }
    
    int a(final boolean b) {
        if (this.n) {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.m.a) {
            Log.v("BackStackEntry", "Commit: " + this);
        }
        this.n = true;
        if (this.k) {
            this.o = this.a.a(this);
        }
        else {
            this.o = -1;
        }
        this.a.a(this, b);
        return this.o;
    }
    
    @Override
    public s a(final int e, final int f, final int g, final int h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        return this;
    }
    
    @Override
    public s a(final int n, final Fragment fragment) {
        this.a(n, fragment, null, 1);
        return this;
    }
    
    public s a(final int n, final Fragment fragment, final String s) {
        if (n == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        this.a(n, fragment, s, 2);
        return this;
    }
    
    @Override
    public s a(final Fragment d) {
        final c c = new c();
        c.c = 4;
        c.d = d;
        this.a(c);
        return this;
    }
    
    @Override
    public s a(final String m) {
        if (!this.l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = m;
        return this;
    }
    
    void a(final int i) {
        if (this.k) {
            if (android.support.v4.app.m.a) {
                Log.v("BackStackEntry", "Bump nesting in " + this + " by " + i);
            }
            for (c c = this.b; c != null; c = c.a) {
                if (c.d != null) {
                    final Fragment d = c.d;
                    d.r += i;
                    if (android.support.v4.app.m.a) {
                        Log.v("BackStackEntry", "Bump nesting of " + c.d + " to " + c.d.r);
                    }
                }
                if (c.i != null) {
                    for (int j = c.i.size() - 1; j >= 0; --j) {
                        final Fragment obj = c.i.get(j);
                        obj.r += i;
                        if (android.support.v4.app.m.a) {
                            Log.v("BackStackEntry", "Bump nesting of " + obj + " to " + obj.r);
                        }
                    }
                }
            }
        }
    }
    
    void a(final c c) {
        if (this.b == null) {
            this.c = c;
            this.b = c;
        }
        else {
            c.b = this.c;
            this.c.a = c;
            this.c = c;
        }
        c.e = this.e;
        c.f = this.f;
        c.g = this.g;
        c.h = this.h;
        ++this.d;
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mName=");
        printWriter.print(this.m);
        printWriter.print(" mIndex=");
        printWriter.print(this.o);
        printWriter.print(" mCommitted=");
        printWriter.println(this.n);
        if (this.i != 0) {
            printWriter.print(s);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.i));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString(this.j));
        }
        if (this.e != 0 || this.f != 0) {
            printWriter.print(s);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.e));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.f));
        }
        if (this.g != 0 || this.h != 0) {
            printWriter.print(s);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.g));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.h));
        }
        if (this.p != 0 || this.q != null) {
            printWriter.print(s);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.p));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.q);
        }
        if (this.r != 0 || this.s != null) {
            printWriter.print(s);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.r));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.s);
        }
        if (this.b != null) {
            printWriter.print(s);
            printWriter.println("Operations:");
            final String string = s + "    ";
            for (c c = this.b; c != null; c = c.a) {
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(0);
                printWriter.println(":");
                printWriter.print(string);
                printWriter.print("cmd=");
                printWriter.print(c.c);
                printWriter.print(" fragment=");
                printWriter.println(c.d);
                if (c.e != 0 || c.f != 0) {
                    printWriter.print(s);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c.e));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c.f));
                }
                if (c.g != 0 || c.h != 0) {
                    printWriter.print(s);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c.g));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c.h));
                }
                if (c.i != null && c.i.size() > 0) {
                    for (int i = 0; i < c.i.size(); ++i) {
                        printWriter.print(string);
                        if (c.i.size() == 1) {
                            printWriter.print("Removed: ");
                        }
                        else {
                            printWriter.println("Removed:");
                            printWriter.print(string);
                            printWriter.print("  #");
                            printWriter.print(0);
                            printWriter.print(": ");
                        }
                        printWriter.println(c.i.get(i));
                    }
                }
            }
        }
    }
    
    @Override
    public s b(final int n, final Fragment fragment) {
        return this.a(n, fragment, null);
    }
    
    public String b() {
        return this.m;
    }
    
    public void b(final boolean b) {
        if (android.support.v4.app.m.a) {
            Log.v("BackStackEntry", "popFromBackStack: " + this);
        }
        this.a(-1);
        for (c c = this.c; c != null; c = c.b) {
            switch (c.c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + c.c);
                }
                case 1: {
                    final Fragment d = c.d;
                    d.E = c.h;
                    this.a.a(d, android.support.v4.app.m.c(this.i), this.j);
                    break;
                }
                case 2: {
                    final Fragment d2 = c.d;
                    if (d2 != null) {
                        d2.E = c.h;
                        this.a.a(d2, android.support.v4.app.m.c(this.i), this.j);
                    }
                    if (c.i != null) {
                        for (int i = 0; i < c.i.size(); ++i) {
                            final Fragment fragment = c.i.get(i);
                            fragment.E = c.g;
                            this.a.a(fragment, false);
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    final Fragment d3 = c.d;
                    d3.E = c.g;
                    this.a.a(d3, false);
                    break;
                }
                case 4: {
                    final Fragment d4 = c.d;
                    d4.E = c.g;
                    this.a.c(d4, android.support.v4.app.m.c(this.i), this.j);
                    break;
                }
                case 5: {
                    final Fragment d5 = c.d;
                    d5.E = c.h;
                    this.a.b(d5, android.support.v4.app.m.c(this.i), this.j);
                    break;
                }
                case 6: {
                    final Fragment d6 = c.d;
                    d6.E = c.g;
                    this.a.e(d6, android.support.v4.app.m.c(this.i), this.j);
                    break;
                }
                case 7: {
                    final Fragment d7 = c.d;
                    d7.E = c.g;
                    this.a.d(d7, android.support.v4.app.m.c(this.i), this.j);
                    break;
                }
            }
        }
        if (b) {
            this.a.a(this.a.n, android.support.v4.app.m.c(this.i), this.j, true);
        }
        if (this.o >= 0) {
            this.a.b(this.o);
            this.o = -1;
        }
    }
    
    @Override
    public void run() {
        if (android.support.v4.app.m.a) {
            Log.v("BackStackEntry", "Run: " + this);
        }
        if (this.k && this.o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        this.a(1);
        for (c c = this.b; c != null; c = c.a) {
            switch (c.c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + c.c);
                }
                case 1: {
                    final Fragment d = c.d;
                    d.E = c.e;
                    this.a.a(d, false);
                    break;
                }
                case 2: {
                    Fragment d2 = c.d;
                    Fragment fragment;
                    if (this.a.g != null) {
                        int index = 0;
                        while (true) {
                            fragment = d2;
                            if (index >= this.a.g.size()) {
                                break;
                            }
                            final Fragment obj = this.a.g.get(index);
                            if (android.support.v4.app.m.a) {
                                Log.v("BackStackEntry", "OP_REPLACE: adding=" + d2 + " old=" + obj);
                            }
                            Fragment fragment2 = null;
                            Label_0303: {
                                if (d2 != null) {
                                    fragment2 = d2;
                                    if (obj.v != d2.v) {
                                        break Label_0303;
                                    }
                                }
                                if (obj == d2) {
                                    fragment2 = null;
                                    c.d = null;
                                }
                                else {
                                    if (c.i == null) {
                                        c.i = new ArrayList();
                                    }
                                    c.i.add(obj);
                                    obj.E = c.f;
                                    if (this.k) {
                                        ++obj.r;
                                        if (android.support.v4.app.m.a) {
                                            Log.v("BackStackEntry", "Bump nesting of " + obj + " to " + obj.r);
                                        }
                                    }
                                    this.a.a(obj, this.i, this.j);
                                    fragment2 = d2;
                                }
                            }
                            ++index;
                            d2 = fragment2;
                        }
                    }
                    else {
                        fragment = d2;
                    }
                    if (fragment != null) {
                        fragment.E = c.e;
                        this.a.a(fragment, false);
                        break;
                    }
                    break;
                }
                case 3: {
                    final Fragment d3 = c.d;
                    d3.E = c.f;
                    this.a.a(d3, this.i, this.j);
                    break;
                }
                case 4: {
                    final Fragment d4 = c.d;
                    d4.E = c.f;
                    this.a.b(d4, this.i, this.j);
                    break;
                }
                case 5: {
                    final Fragment d5 = c.d;
                    d5.E = c.e;
                    this.a.c(d5, this.i, this.j);
                    break;
                }
                case 6: {
                    final Fragment d6 = c.d;
                    d6.E = c.f;
                    this.a.d(d6, this.i, this.j);
                    break;
                }
                case 7: {
                    final Fragment d7 = c.d;
                    d7.E = c.e;
                    this.a.e(d7, this.i, this.j);
                    break;
                }
            }
        }
        this.a.a(this.a.n, this.i, this.j, true);
        if (this.k) {
            this.a.b(this);
        }
    }
}
