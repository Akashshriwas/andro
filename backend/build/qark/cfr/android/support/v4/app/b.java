/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 */
package android.support.v4.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.c;
import android.support.v4.app.m;
import android.support.v4.app.s;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class b
extends s
implements Runnable {
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
    boolean l = true;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;

    public b(m m2) {
        this.a = m2;
    }

    private void a(int n2, Fragment fragment, String object, int n3) {
        fragment.s = this.a;
        if (object != null) {
            if (fragment.w != null && !object.equals((Object)fragment.w)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.w + " now " + (String)object);
            }
            fragment.w = object;
        }
        if (n2 != 0) {
            if (fragment.u != 0 && fragment.u != n2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.u + " now " + n2);
            }
            fragment.u = n2;
            fragment.v = n2;
        }
        object = new c();
        object.c = n3;
        object.d = fragment;
        this.a((c)object);
    }

    @Override
    public int a() {
        return this.a(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    int a(boolean bl2) {
        if (this.n) {
            throw new IllegalStateException("commit already called");
        }
        if (m.a) {
            Log.v((String)"BackStackEntry", (String)("Commit: " + this));
        }
        this.n = true;
        this.o = this.k ? this.a.a(this) : -1;
        this.a.a(this, bl2);
        return this.o;
    }

    @Override
    public s a(int n2, int n3, int n4, int n5) {
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.h = n5;
        return this;
    }

    @Override
    public s a(int n2, Fragment fragment) {
        this.a(n2, fragment, null, 1);
        return this;
    }

    public s a(int n2, Fragment fragment, String string) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        this.a(n2, fragment, string, 2);
        return this;
    }

    @Override
    public s a(Fragment fragment) {
        c c2 = new c();
        c2.c = 4;
        c2.d = fragment;
        this.a(c2);
        return this;
    }

    @Override
    public s a(String string) {
        if (!this.l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = string;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int n2) {
        if (this.k) {
            if (m.a) {
                Log.v((String)"BackStackEntry", (String)("Bump nesting in " + this + " by " + n2));
            }
            c c2 = this.b;
            while (c2 != null) {
                Fragment fragment;
                if (c2.d != null) {
                    fragment = c2.d;
                    fragment.r += n2;
                    if (m.a) {
                        Log.v((String)"BackStackEntry", (String)("Bump nesting of " + c2.d + " to " + c2.d.r));
                    }
                }
                if (c2.i != null) {
                    for (int i2 = c2.i.size() - 1; i2 >= 0; --i2) {
                        fragment = (Fragment)c2.i.get(i2);
                        fragment.r += n2;
                        if (!m.a) continue;
                        Log.v((String)"BackStackEntry", (String)("Bump nesting of " + fragment + " to " + fragment.r));
                    }
                }
                c2 = c2.a;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(c c2) {
        if (this.b == null) {
            this.c = c2;
            this.b = c2;
        } else {
            c2.b = this.c;
            this.c.a = c2;
            this.c = c2;
        }
        c2.e = this.e;
        c2.f = this.f;
        c2.g = this.g;
        c2.h = this.h;
        ++this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, FileDescriptor object, PrintWriter printWriter, String[] object2) {
        printWriter.print(string);
        printWriter.print("mName=");
        printWriter.print(this.m);
        printWriter.print(" mIndex=");
        printWriter.print(this.o);
        printWriter.print(" mCommitted=");
        printWriter.println(this.n);
        if (this.i != 0) {
            printWriter.print(string);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString((int)this.i));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString((int)this.j));
        }
        if (this.e != 0 || this.f != 0) {
            printWriter.print(string);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString((int)this.e));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString((int)this.f));
        }
        if (this.g != 0 || this.h != 0) {
            printWriter.print(string);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString((int)this.g));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString((int)this.h));
        }
        if (this.p != 0 || this.q != null) {
            printWriter.print(string);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString((int)this.p));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println((Object)this.q);
        }
        if (this.r != 0 || this.s != null) {
            printWriter.print(string);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString((int)this.r));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println((Object)this.s);
        }
        if (this.b != null) {
            printWriter.print(string);
            printWriter.println("Operations:");
            object2 = string + "    ";
            object = this.b;
            while (object != null) {
                printWriter.print(string);
                printWriter.print("  Op #");
                printWriter.print(0);
                printWriter.println(":");
                printWriter.print((String)object2);
                printWriter.print("cmd=");
                printWriter.print(object.c);
                printWriter.print(" fragment=");
                printWriter.println((Object)object.d);
                if (object.e != 0 || object.f != 0) {
                    printWriter.print(string);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString((int)object.e));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString((int)object.f));
                }
                if (object.g != 0 || object.h != 0) {
                    printWriter.print(string);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString((int)object.g));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString((int)object.h));
                }
                if (object.i != null && object.i.size() > 0) {
                    for (int i2 = 0; i2 < object.i.size(); ++i2) {
                        printWriter.print((String)object2);
                        if (object.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            printWriter.println("Removed:");
                            printWriter.print((String)object2);
                            printWriter.print("  #");
                            printWriter.print(0);
                            printWriter.print(": ");
                        }
                        printWriter.println(object.i.get(i2));
                    }
                }
                object = object.a;
            }
        }
    }

    @Override
    public s b(int n2, Fragment fragment) {
        return this.a(n2, fragment, null);
    }

    public String b() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(boolean bl2) {
        if (m.a) {
            Log.v((String)"BackStackEntry", (String)("popFromBackStack: " + this));
        }
        this.a(-1);
        c c2 = this.c;
        while (c2 != null) {
            switch (c2.c) {
                Fragment fragment;
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + c2.c);
                }
                case 1: {
                    fragment = c2.d;
                    fragment.E = c2.h;
                    this.a.a(fragment, m.c(this.i), this.j);
                    break;
                }
                case 2: {
                    fragment = c2.d;
                    if (fragment != null) {
                        fragment.E = c2.h;
                        this.a.a(fragment, m.c(this.i), this.j);
                    }
                    if (c2.i == null) break;
                    for (int i2 = 0; i2 < c2.i.size(); ++i2) {
                        fragment = (Fragment)c2.i.get(i2);
                        fragment.E = c2.g;
                        this.a.a(fragment, false);
                    }
                    break;
                }
                case 3: {
                    fragment = c2.d;
                    fragment.E = c2.g;
                    this.a.a(fragment, false);
                    break;
                }
                case 4: {
                    fragment = c2.d;
                    fragment.E = c2.g;
                    this.a.c(fragment, m.c(this.i), this.j);
                    break;
                }
                case 5: {
                    fragment = c2.d;
                    fragment.E = c2.h;
                    this.a.b(fragment, m.c(this.i), this.j);
                    break;
                }
                case 6: {
                    fragment = c2.d;
                    fragment.E = c2.g;
                    this.a.e(fragment, m.c(this.i), this.j);
                    break;
                }
                case 7: {
                    fragment = c2.d;
                    fragment.E = c2.g;
                    this.a.d(fragment, m.c(this.i), this.j);
                }
            }
            c2 = c2.b;
        }
        if (bl2) {
            this.a.a(this.a.n, m.c(this.i), this.j, true);
        }
        if (this.o >= 0) {
            this.a.b(this.o);
            this.o = -1;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void run() {
        if (m.a) {
            Log.v((String)"BackStackEntry", (String)("Run: " + this));
        }
        if (this.k && this.o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        this.a(1);
        var3_1 = this.b;
        block9 : do {
            if (var3_1 == null) {
                this.a.a(this.a.n, this.i, this.j, true);
                if (this.k == false) return;
                this.a.b(this);
                return;
            }
            switch (var3_1.c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + var3_1.c);
                }
                case 1: {
                    var2_3 = var3_1.d;
                    var2_3.E = var3_1.e;
                    this.a.a(var2_3, false);
                    break;
                }
                case 2: {
                    var2_3 = var3_1.d;
                    if (this.a.g != null) {
                        var1_2 = 0;
                        break block9;
                    }
                    var4_4 = var2_3;
lbl27: // 2 sources:
                    if (var4_4 == null) break;
                    var4_4.E = var3_1.e;
                    this.a.a(var4_4, false);
                    break;
                }
                case 3: {
                    var2_3 = var3_1.d;
                    var2_3.E = var3_1.f;
                    this.a.a(var2_3, this.i, this.j);
                    break;
                }
                case 4: {
                    var2_3 = var3_1.d;
                    var2_3.E = var3_1.f;
                    this.a.b(var2_3, this.i, this.j);
                    break;
                }
                case 5: {
                    var2_3 = var3_1.d;
                    var2_3.E = var3_1.e;
                    this.a.c(var2_3, this.i, this.j);
                    break;
                }
                case 6: {
                    var2_3 = var3_1.d;
                    var2_3.E = var3_1.f;
                    this.a.d(var2_3, this.i, this.j);
                    break;
                }
                case 7: {
                    var2_3 = var3_1.d;
                    var2_3.E = var3_1.e;
                    this.a.e(var2_3, this.i, this.j);
                }
            }
            var3_1 = var3_1.a;
        } while (true);
        do {
            block26 : {
                block25 : {
                    var4_4 = var2_3;
                    if (var1_2 >= this.a.g.size()) ** GOTO lbl27
                    var5_5 = (Fragment)this.a.g.get(var1_2);
                    if (m.a) {
                        Log.v((String)"BackStackEntry", (String)("OP_REPLACE: adding=" + var2_3 + " old=" + var5_5));
                    }
                    if (var2_3 == null) break block25;
                    var4_4 = var2_3;
                    if (var5_5.v != var2_3.v) break block26;
                }
                if (var5_5 == var2_3) {
                    var4_4 = null;
                    var3_1.d = null;
                } else {
                    if (var3_1.i == null) {
                        var3_1.i = new ArrayList();
                    }
                    var3_1.i.add((Object)var5_5);
                    var5_5.E = var3_1.f;
                    if (this.k) {
                        ++var5_5.r;
                        if (m.a) {
                            Log.v((String)"BackStackEntry", (String)("Bump nesting of " + var5_5 + " to " + var5_5.r));
                        }
                    }
                    this.a.a(var5_5, this.i, this.j);
                    var4_4 = var2_3;
                }
            }
            ++var1_2;
            var2_3 = var4_4;
        } while (true);
    }
}

