/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.AnimationSet
 *  android.view.animation.AnimationUtils
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.ScaleAnimation
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.ClassLoader
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 */
package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.support.v4.app.b;
import android.support.v4.app.g;
import android.support.v4.app.k;
import android.support.v4.app.l;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.support.v4.app.s;
import android.support.v4.app.y;
import android.support.v4.c.a;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

final class m
extends k {
    static final Interpolator A;
    static boolean a;
    static final boolean b;
    static final Interpolator x;
    static final Interpolator y;
    static final Interpolator z;
    ArrayList c;
    Runnable[] d;
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    int n = 0;
    g o;
    boolean p;
    boolean q;
    boolean r;
    String s;
    boolean t;
    Bundle u = null;
    SparseArray v = null;
    Runnable w;

    static {
        boolean bl2 = false;
        a = false;
        if (Build.VERSION.SDK_INT >= 11) {
            bl2 = true;
        }
        b = bl2;
        x = new DecelerateInterpolator(2.5f);
        y = new DecelerateInterpolator(1.5f);
        z = new AccelerateInterpolator(2.5f);
        A = new AccelerateInterpolator(1.5f);
    }

    m() {
        this.w = new n(this);
    }

    static Animation a(Context context, float f2, float f3) {
        context = new AlphaAnimation(f2, f3);
        context.setInterpolator(y);
        context.setDuration(220L);
        return context;
    }

    static Animation a(Context context, float f2, float f3, float f4, float f5) {
        context = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(x);
        scaleAnimation.setDuration(220L);
        context.addAnimation((Animation)scaleAnimation);
        scaleAnimation = new AlphaAnimation(f4, f5);
        scaleAnimation.setInterpolator(y);
        scaleAnimation.setDuration(220L);
        context.addAnimation((Animation)scaleAnimation);
        return context;
    }

    public static int b(int n2, boolean bl2) {
        switch (n2) {
            default: {
                return -1;
            }
            case 4097: {
                if (bl2) {
                    return 1;
                }
                return 2;
            }
            case 8194: {
                if (bl2) {
                    return 3;
                }
                return 4;
            }
            case 4099: 
        }
        if (bl2) {
            return 5;
        }
        return 6;
    }

    public static int c(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 4097: {
                return 8194;
            }
            case 8194: {
                return 4097;
            }
            case 4099: 
        }
        return 4099;
    }

    private void t() {
        if (this.q) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.s != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.s);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(b b2) {
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                int n2 = this.k.size();
                if (a) {
                    Log.v((String)"FragmentManager", (String)("Setting back stack index " + n2 + " to " + b2));
                }
                this.k.add((Object)b2);
                return n2;
            }
            int n3 = (Integer)this.l.remove(this.l.size() - 1);
            if (a) {
                Log.v((String)"FragmentManager", (String)("Adding back stack index " + n3 + " with " + b2));
            }
            this.k.set(n3, (Object)b2);
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Fragment a(int n2) {
        int n3;
        Fragment fragment;
        if (this.g != null) {
            for (n3 = this.g.size() - 1; n3 >= 0; --n3) {
                fragment = (Fragment)this.g.get(n3);
                if (fragment != null && fragment.u == n2) return fragment;
                {
                    continue;
                }
            }
        } else {
            if (this.f == null) return null;
            {
                for (n3 = this.f.size() - 1; n3 >= 0; --n3) {
                    Fragment fragment2 = (Fragment)this.f.get(n3);
                    if (fragment2 == null) continue;
                    fragment = fragment2;
                    if (fragment2.u == n2) return fragment;
                    {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Fragment a(Bundle object, String string) {
        int n2 = object.getInt(string, -1);
        if (n2 == -1) {
            return null;
        }
        if (n2 >= this.f.size()) {
            throw new IllegalStateException("Fragement no longer exists for key " + string + ": index " + n2);
        }
        Fragment fragment = (Fragment)this.f.get(n2);
        object = fragment;
        if (fragment != null) return object;
        throw new IllegalStateException("Fragement no longer exists for key " + string + ": index " + n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Fragment a(String string) {
        int n2;
        Fragment fragment;
        if (this.g != null && string != null) {
            for (n2 = this.g.size() - 1; n2 >= 0; --n2) {
                fragment = (Fragment)this.g.get(n2);
                if (fragment != null && string.equals((Object)fragment.w)) return fragment;
                {
                    continue;
                }
            }
        } else {
            if (this.f == null || string == null) return null;
            {
                for (n2 = this.f.size() - 1; n2 >= 0; --n2) {
                    Fragment fragment2 = (Fragment)this.f.get(n2);
                    if (fragment2 == null) continue;
                    fragment = fragment2;
                    if (string.equals((Object)fragment2.w)) return fragment;
                    {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    @Override
    public s a() {
        return new b(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    Animation a(Fragment fragment, int n2, boolean bl2, int n3) {
        Animation animation = fragment.a(n2, bl2, fragment.E);
        if (animation != null) {
            return animation;
        }
        if (fragment.E != 0) {
            animation = AnimationUtils.loadAnimation((Context)this.o, (int)fragment.E);
            fragment = animation;
            if (animation != null) return fragment;
        }
        if (n2 == 0) {
            return null;
        }
        if ((n2 = m.b(n2, bl2)) < 0) {
            return null;
        }
        switch (n2) {
            default: {
                n2 = n3;
                if (n3 == 0) {
                    n2 = n3;
                    if (this.o.getWindow() != null) {
                        n2 = this.o.getWindow().getAttributes().windowAnimations;
                    }
                }
                if (n2 != 0) return null;
                return null;
            }
            case 1: {
                return m.a((Context)this.o, 1.125f, 1.0f, 0.0f, 1.0f);
            }
            case 2: {
                return m.a((Context)this.o, 1.0f, 0.975f, 1.0f, 0.0f);
            }
            case 3: {
                return m.a((Context)this.o, 0.975f, 1.0f, 0.0f, 1.0f);
            }
            case 4: {
                return m.a((Context)this.o, 1.0f, 1.075f, 1.0f, 0.0f);
            }
            case 5: {
                return m.a((Context)this.o, 0.0f, 1.0f);
            }
            case 6: {
                return m.a((Context)this.o, 1.0f, 0.0f);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int n2, int n3, int n4, boolean bl2) {
        block6 : {
            block5 : {
                if (this.o == null && n2 != 0) {
                    throw new IllegalStateException("No activity");
                }
                if (!bl2 && this.n == n2) break block5;
                this.n = n2;
                if (this.f == null) break block5;
                boolean bl3 = false;
                for (int i2 = 0; i2 < this.f.size(); ++i2) {
                    Fragment fragment = (Fragment)this.f.get(i2);
                    if (fragment == null) continue;
                    this.a(fragment, n2, n3, n4, false);
                    if (fragment.K == null) continue;
                    bl3 |= fragment.K.a();
                }
                this.e();
                if (this.p && this.o != null && this.n == 5) break block6;
            }
            return;
        }
        this.o.c();
        this.p = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2, b b2) {
        synchronized (this) {
            int n3;
            if (this.k == null) {
                this.k = new ArrayList();
            }
            if (n2 < n3) {
                if (a) {
                    Log.v((String)"FragmentManager", (String)("Setting back stack index " + n2 + " to " + b2));
                }
                this.k.set(n2, (Object)b2);
            } else {
                for (int i2 = n3 = this.k.size(); i2 < n2; ++i2) {
                    this.k.add((Object)null);
                    if (this.l == null) {
                        this.l = new ArrayList();
                    }
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("Adding available back stack index " + i2));
                    }
                    this.l.add((Object)i2);
                }
                if (a) {
                    Log.v((String)"FragmentManager", (String)("Adding back stack index " + n2 + " with " + b2));
                }
                this.k.add((Object)b2);
            }
            return;
        }
    }

    void a(int n2, boolean bl2) {
        this.a(n2, 0, 0, bl2);
    }

    public void a(Configuration configuration) {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                Fragment fragment = (Fragment)this.g.get(i2);
                if (fragment == null) continue;
                fragment.onConfigurationChanged(configuration);
            }
        }
    }

    public void a(Bundle bundle, String string, Fragment fragment) {
        if (fragment.f < 0) {
            throw new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager");
        }
        bundle.putInt(string, fragment.f);
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(Parcelable parcelable, ArrayList object) {
        int n2 = 0;
        if (parcelable != null) {
            parcelable = (FragmentManagerState)parcelable;
            if (parcelable.a != null) {
                int n3;
                Object object2;
                Object object3;
                if (object != null) {
                    for (n3 = 0; n3 < object.size(); ++n3) {
                        object3 = (Fragment)object.get(n3);
                        if (a) {
                            Log.v((String)"FragmentManager", (String)("restoreAllState: re-attaching retained " + object3));
                        }
                        object2 = parcelable.a[object3.f];
                        object2.k = object3;
                        object3.e = null;
                        object3.r = 0;
                        object3.p = false;
                        object3.l = false;
                        object3.i = null;
                        if (object2.j == null) continue;
                        object2.j.setClassLoader(this.o.getClassLoader());
                        object3.e = object2.j.getSparseParcelableArray("android:view_state");
                    }
                }
                this.f = new ArrayList(parcelable.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (n3 = 0; n3 < parcelable.a.length; ++n3) {
                    object3 = parcelable.a[n3];
                    if (object3 != null) {
                        object2 = object3.a(this.o);
                        if (a) {
                            Log.v((String)"FragmentManager", (String)("restoreAllState: adding #" + n3 + ": " + object2));
                        }
                        this.f.add(object2);
                        object3.k = null;
                        continue;
                    }
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("restoreAllState: adding #" + n3 + ": (null)"));
                    }
                    this.f.add((Object)null);
                    if (this.h == null) {
                        this.h = new ArrayList();
                    }
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("restoreAllState: adding avail #" + n3));
                    }
                    this.h.add((Object)n3);
                }
                if (object != null) {
                    for (n3 = 0; n3 < object.size(); ++n3) {
                        object3 = (Fragment)object.get(n3);
                        if (object3.j < 0) continue;
                        if (object3.j < this.f.size()) {
                            object3.i = (Fragment)this.f.get(object3.j);
                            continue;
                        }
                        Log.w((String)"FragmentManager", (String)("Re-attaching retained fragment " + object3 + " target no longer exists: " + object3.j));
                        object3.i = null;
                    }
                }
                if (parcelable.b == null) {
                    this.g = null;
                } else {
                    this.g = new ArrayList(parcelable.b.length);
                    for (n3 = 0; n3 < parcelable.b.length; ++n3) {
                        object = (Fragment)this.f.get(parcelable.b[n3]);
                        if (object == null) {
                            throw new IllegalStateException("No instantiated fragment for index #" + parcelable.b[n3]);
                        }
                        object.l = true;
                        if (a) {
                            Log.v((String)"FragmentManager", (String)("restoreAllState: making added #" + n3 + ": " + object));
                        }
                        this.g.add(object);
                    }
                }
                if (parcelable.c == null) {
                    this.i = null;
                    return;
                }
                this.i = new ArrayList(parcelable.c.length);
                for (n3 = n2; n3 < parcelable.c.length; ++n3) {
                    object = parcelable.c[n3].a(this);
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("restoreAllState: adding bse #" + n3 + " (index " + object.o + "): " + object));
                    }
                    this.i.add(object);
                    if (object.o < 0) continue;
                    this.a(object.o, (b)object);
                }
            }
        }
    }

    public void a(Fragment fragment) {
        block3 : {
            block2 : {
                if (!fragment.I) break block2;
                if (!this.e) break block3;
                this.t = true;
            }
            return;
        }
        fragment.I = false;
        this.a(fragment, this.n, 0, 0, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(Fragment fragment, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("remove: " + fragment + " nesting=" + fragment.r));
        }
        int n4 = !fragment.b() ? 1 : 0;
        if (!fragment.y || n4 != 0) {
            if (this.g != null) {
                this.g.remove((Object)fragment);
            }
            if (fragment.B && fragment.C) {
                this.p = true;
            }
            fragment.l = false;
            fragment.m = true;
            n4 = n4 != 0 ? 0 : 1;
            this.a(fragment, n4, n2, n3, false);
        }
    }

    /*
     * Exception decompiling
     */
    void a(Fragment var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(Fragment fragment, boolean bl2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            Log.v((String)"FragmentManager", (String)("add: " + fragment));
        }
        this.c(fragment);
        if (!fragment.y) {
            this.g.add((Object)fragment);
            fragment.l = true;
            fragment.m = false;
            if (fragment.B && fragment.C) {
                this.p = true;
            }
            if (bl2) {
                this.b(fragment);
            }
        }
    }

    public void a(g g2) {
        if (this.o != null) {
            throw new IllegalStateException();
        }
        this.o = g2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Runnable runnable, boolean bl2) {
        if (!bl2) {
            this.t();
        }
        synchronized (this) {
            if (this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add((Object)runnable);
            if (this.c.size() == 1) {
                this.o.a.removeCallbacks(this.w);
                this.o.a.post(this.w);
            }
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
    public void a(String string, FileDescriptor object, PrintWriter printWriter, String[] arrstring) {
        Object object2;
        int n2;
        int n3;
        int n4 = 0;
        String string2 = string + "    ";
        if (this.f != null && (n3 = this.f.size()) > 0) {
            printWriter.print(string);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)this)));
            printWriter.println(":");
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = (Fragment)this.f.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object2);
                if (object2 == null) continue;
                object2.a(string2, (FileDescriptor)object, printWriter, arrstring);
            }
        }
        if (this.g != null && (n3 = this.g.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Added Fragments:");
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = (Fragment)this.g.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object2.toString());
            }
        }
        if (this.j != null && (n3 = this.j.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Fragments Created Menus:");
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = (Fragment)this.j.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object2.toString());
            }
        }
        if (this.i != null && (n3 = this.i.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack:");
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = (b)this.i.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object2.toString());
                object2.a(string2, (FileDescriptor)object, printWriter, arrstring);
            }
        }
        // MONITORENTER : this
        if (this.k != null && (n3 = this.k.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack Indices:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = (b)this.k.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object);
            }
        }
        if (this.l != null && this.l.size() > 0) {
            printWriter.print(string);
            printWriter.print("mAvailBackStackIndices: ");
            printWriter.println(Arrays.toString((Object[])this.l.toArray()));
        }
        // MONITOREXIT : this
        if (this.c != null && (n3 = this.c.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Pending Actions:");
            for (n2 = n4; n2 < n3; ++n2) {
                object = (Runnable)this.c.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object);
            }
        }
        printWriter.print(string);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(string);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.q);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.r);
        if (this.p) {
            printWriter.print(string);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.p);
        }
        if (this.s != null) {
            printWriter.print(string);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.s);
        }
        if (this.h == null) return;
        if (this.h.size() <= 0) return;
        printWriter.print(string);
        printWriter.print("  mAvailIndices: ");
        printWriter.println(Arrays.toString((Object[])this.h.toArray()));
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean a(Handler object, String object2, int n2, int n3) {
        if (this.i == null) {
            return false;
        }
        if (object2 == null && n2 < 0 && (n3 & 1) == 0) {
            n2 = this.i.size() - 1;
            if (n2 < 0) return false;
            ((b)this.i.remove(n2)).b(true);
            this.g();
            return true;
        }
        int n4 = -1;
        if (object2 != null || n2 >= 0) {
            int n5;
            for (n5 = this.i.size() - 1; n5 >= 0; --n5) {
                object = (b)this.i.get(n5);
                if (object2 != null && object2.equals((Object)object.b()) || n2 >= 0 && n2 == object.o) break;
            }
            if (n5 < 0) return false;
            n4 = n5;
            if ((n3 & 1) != 0) {
                n3 = n5 - 1;
                do {
                    n4 = n3;
                    if (n3 < 0) break;
                    object = (b)this.i.get(n3);
                    if (object2 == null || !object2.equals((Object)object.b())) {
                        n4 = n3;
                        if (n2 < 0) break;
                        n4 = n3;
                        if (n2 != object.o) break;
                    }
                    --n3;
                } while (true);
            }
        }
        if (n4 == this.i.size() - 1) return false;
        object = new ArrayList();
        for (n2 = this.i.size() - 1; n2 > n4; --n2) {
            object.add(this.i.remove(n2));
        }
        n3 = object.size() - 1;
        n2 = 0;
        do {
            if (n2 > n3) {
                this.g();
                return true;
            }
            if (a) {
                Log.v((String)"FragmentManager", (String)("Popping back stack state: " + object.get(n2)));
            }
            object2 = (b)object.get(n2);
            boolean bl2 = n2 == n3;
            object2.b(bl2);
            ++n2;
        } while (true);
    }

    public boolean a(Menu menu) {
        boolean bl2;
        if (this.g != null) {
            int n2 = 0;
            boolean bl3 = false;
            do {
                bl2 = bl3;
                if (n2 < this.g.size()) {
                    Fragment fragment = (Fragment)this.g.get(n2);
                    bl2 = bl3;
                    if (fragment != null) {
                        bl2 = bl3;
                        if (!fragment.x) {
                            bl2 = bl3;
                            if (fragment.B) {
                                bl2 = bl3;
                                if (fragment.C) {
                                    bl2 = true;
                                    fragment.a(menu);
                                }
                            }
                        }
                    }
                    ++n2;
                    bl3 = bl2;
                    continue;
                }
                break;
            } while (true);
        } else {
            bl2 = false;
        }
        return bl2;
    }

    public boolean a(Menu object, MenuInflater menuInflater) {
        boolean bl2;
        int n2;
        int n3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        if (this.g != null) {
            n2 = 0;
            boolean bl3 = false;
            do {
                arrayList = arrayList2;
                bl2 = bl3;
                if (n2 < this.g.size()) {
                    Fragment fragment = (Fragment)this.g.get(n2);
                    arrayList = arrayList2;
                    bl2 = bl3;
                    if (fragment != null) {
                        arrayList = arrayList2;
                        bl2 = bl3;
                        if (!fragment.x) {
                            arrayList = arrayList2;
                            bl2 = bl3;
                            if (fragment.B) {
                                arrayList = arrayList2;
                                bl2 = bl3;
                                if (fragment.C) {
                                    bl2 = true;
                                    fragment.a((Menu)object, menuInflater);
                                    arrayList = arrayList2;
                                    if (arrayList2 == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add((Object)fragment);
                                }
                            }
                        }
                    }
                    ++n2;
                    bl3 = bl2;
                    arrayList2 = arrayList;
                    continue;
                }
                break;
            } while (true);
        } else {
            bl2 = false;
        }
        if (this.j != null) {
            for (n2 = n3; n2 < this.j.size(); ++n2) {
                object = (Fragment)this.j.get(n2);
                if (arrayList != null && arrayList.contains(object)) continue;
                object.m();
            }
        }
        this.j = arrayList;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(MenuItem menuItem) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (this.g == null) return bl3;
        int n2 = 0;
        do {
            bl3 = bl2;
            if (n2 >= this.g.size()) return bl3;
            Fragment fragment = (Fragment)this.g.get(n2);
            if (fragment != null && !fragment.x && fragment.B && fragment.C && fragment.a(menuItem)) {
                return true;
            }
            ++n2;
        } while (true);
    }

    @Override
    public void b() {
        this.a(new o(this), false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(int n2) {
        synchronized (this) {
            this.k.set(n2, (Object)null);
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (a) {
                Log.v((String)"FragmentManager", (String)("Freeing back stack index " + n2));
            }
            this.l.add((Object)n2);
            return;
        }
    }

    void b(Fragment fragment) {
        this.a(fragment, this.n, 0, 0, false);
    }

    public void b(Fragment fragment, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("hide: " + fragment));
        }
        if (!fragment.x) {
            fragment.x = true;
            if (fragment.G != null) {
                Animation animation = this.a(fragment, n2, true, n3);
                if (animation != null) {
                    fragment.G.startAnimation(animation);
                }
                fragment.G.setVisibility(8);
            }
            if (fragment.l && fragment.B && fragment.C) {
                this.p = true;
            }
            fragment.a(true);
        }
    }

    void b(b b2) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add((Object)b2);
        this.g();
    }

    public void b(Menu menu) {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                Fragment fragment = (Fragment)this.g.get(i2);
                if (fragment == null || fragment.x || !fragment.B || !fragment.C) continue;
                fragment.b(menu);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(MenuItem menuItem) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (this.g == null) return bl3;
        int n2 = 0;
        do {
            bl3 = bl2;
            if (n2 >= this.g.size()) return bl3;
            Fragment fragment = (Fragment)this.g.get(n2);
            if (fragment != null && !fragment.x && fragment.J && fragment.b(menuItem)) {
                return true;
            }
            ++n2;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    void c(Fragment fragment) {
        block7 : {
            block6 : {
                if (fragment.f >= 0) break block6;
                if (this.h == null || this.h.size() <= 0) {
                    if (this.f == null) {
                        this.f = new ArrayList();
                    }
                    fragment.a(this.f.size());
                    this.f.add((Object)fragment);
                } else {
                    fragment.a((Integer)this.h.remove(this.h.size() - 1));
                    this.f.set(fragment.f, (Object)fragment);
                }
                if (a) break block7;
            }
            return;
        }
        Log.v((String)"FragmentManager", (String)("Allocated fragment index " + fragment));
    }

    public void c(Fragment fragment, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("show: " + fragment));
        }
        if (fragment.x) {
            fragment.x = false;
            if (fragment.G != null) {
                Animation animation = this.a(fragment, n2, true, n3);
                if (animation != null) {
                    fragment.G.startAnimation(animation);
                }
                fragment.G.setVisibility(0);
            }
            if (fragment.l && fragment.B && fragment.C) {
                this.p = true;
            }
            fragment.a(false);
        }
    }

    @Override
    public boolean c() {
        this.t();
        this.d();
        return this.a(this.o.a, null, -1, 0);
    }

    void d(Fragment fragment) {
        if (fragment.f < 0) {
            return;
        }
        if (a) {
            Log.v((String)"FragmentManager", (String)("Freeing fragment index " + fragment));
        }
        this.f.set(fragment.f, (Object)null);
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add((Object)fragment.f);
        this.o.a(fragment.f);
        fragment.k();
    }

    public void d(Fragment fragment, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("detach: " + fragment));
        }
        if (!fragment.y) {
            fragment.y = true;
            if (fragment.l) {
                if (this.g != null) {
                    this.g.remove((Object)fragment);
                }
                if (fragment.B && fragment.C) {
                    this.p = true;
                }
                fragment.l = false;
                this.a(fragment, 1, n2, n3, false);
            }
        }
    }

    public boolean d() {
        return this.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void e() {
        if (this.f == null) {
            return;
        }
        int n2 = 0;
        while (n2 < this.f.size()) {
            Fragment fragment = (Fragment)this.f.get(n2);
            if (fragment != null) {
                this.a(fragment);
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void e(Fragment fragment) {
        block6 : {
            block5 : {
                if (fragment.H == null) break block5;
                if (this.v == null) {
                    this.v = new SparseArray();
                } else {
                    this.v.clear();
                }
                fragment.H.saveHierarchyState(this.v);
                if (this.v.size() > 0) break block6;
            }
            return;
        }
        fragment.e = this.v;
        this.v = null;
    }

    public void e(Fragment fragment, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("attach: " + fragment));
        }
        if (fragment.y) {
            fragment.y = false;
            if (!fragment.l) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add((Object)fragment);
                fragment.l = true;
                if (fragment.B && fragment.C) {
                    this.p = true;
                }
                this.a(fragment, this.n, n2, n3, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    Bundle f(Fragment fragment) {
        Bundle bundle;
        if (this.u == null) {
            this.u = new Bundle();
        }
        fragment.d(this.u);
        if (!this.u.isEmpty()) {
            bundle = this.u;
            this.u = null;
        } else {
            bundle = null;
        }
        if (fragment.G != null) {
            this.e(fragment);
        }
        Bundle bundle2 = bundle;
        if (fragment.e != null) {
            bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putSparseParcelableArray("android:view_state", fragment.e);
        }
        bundle = bundle2;
        if (!fragment.J) {
            bundle = bundle2;
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.J);
        }
        return bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f() {
        boolean bl2;
        block13 : {
            if (this.e) {
                throw new IllegalStateException("Recursive entry to executePendingTransactions");
            }
            if (Looper.myLooper() != this.o.a.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of process");
            }
            bl2 = false;
            do {
                int n2;
                int n3;
                synchronized (this) {
                    if (this.c == null || this.c.size() == 0) {
                        // MONITOREXIT [3, 4, 12] lbl9 : MonitorExitStatement: MONITOREXIT : this
                        if (!this.t) break block13;
                        n2 = 0;
                        for (n3 = 0; n3 < this.f.size(); ++n3) {
                            Fragment fragment = (Fragment)this.f.get(n3);
                            int n4 = n2;
                            if (fragment != null) {
                                n4 = n2;
                                if (fragment.K != null) {
                                    n4 = n2 | fragment.K.a();
                                }
                            }
                            n2 = n4;
                        }
                        break;
                    }
                    n2 = this.c.size();
                    if (this.d == null || this.d.length < n2) {
                        this.d = new Runnable[n2];
                    }
                    this.c.toArray((Object[])this.d);
                    this.c.clear();
                    this.o.a.removeCallbacks(this.w);
                }
                this.e = true;
                for (n3 = 0; n3 < n2; ++n3) {
                    this.d[n3].run();
                    this.d[n3] = null;
                }
                this.e = false;
                bl2 = true;
            } while (true);
            this.t = false;
            this.e();
        }
        return bl2;
    }

    void g() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                ((l)this.m.get(i2)).a();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    ArrayList h() {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        if (this.f == null) return arrayList;
        int n2 = 0;
        do {
            arrayList = arrayList2;
            if (n2 >= this.f.size()) {
                return arrayList;
            }
            Fragment fragment = (Fragment)this.f.get(n2);
            ArrayList arrayList3 = arrayList2;
            if (fragment != null) {
                arrayList3 = arrayList2;
                if (fragment.z) {
                    arrayList = arrayList2;
                    if (arrayList2 == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((Object)fragment);
                    fragment.A = true;
                    int n3 = fragment.i != null ? fragment.i.f : -1;
                    fragment.j = n3;
                    arrayList3 = arrayList;
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("retainNonConfig: keeping retained " + fragment));
                        arrayList3 = arrayList;
                    }
                }
            }
            ++n2;
            arrayList2 = arrayList3;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    Parcelable i() {
        block15 : {
            block14 : {
                BackStackState[] arrbackStackState = null;
                this.f();
                if (b) {
                    this.q = true;
                }
                if (this.f == null || this.f.size() <= 0) break block14;
                int n2 = this.f.size();
                FragmentState[] arrfragmentState = new FragmentState[n2];
                int n3 = 0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    Object object = (Fragment)this.f.get(i2);
                    if (object == null) continue;
                    if (object.f < 0) {
                        object = "Failure saving state: active " + object + " has cleared index: " + object.f;
                        Log.e((String)"FragmentManager", (String)object);
                        this.a("  ", null, new PrintWriter((Writer)new android.support.v4.c.b("FragmentManager")), new String[0]);
                        throw new IllegalStateException((String)object);
                    }
                    BackStackState[] arrbackStackState2 = new FragmentState((Fragment)object);
                    arrfragmentState[i2] = arrbackStackState2;
                    if (object.a > 0 && arrbackStackState2.j == null) {
                        arrbackStackState2.j = this.f((Fragment)object);
                        if (object.i != null) {
                            if (object.i.f < 0) {
                                object = "Failure saving state: " + object + " has target not in fragment manager: " + object.i;
                                Log.e((String)"FragmentManager", (String)object);
                                this.a("  ", null, new PrintWriter((Writer)new android.support.v4.c.b("FragmentManager")), new String[0]);
                                throw new IllegalStateException((String)object);
                            }
                            if (arrbackStackState2.j == null) {
                                arrbackStackState2.j = new Bundle();
                            }
                            this.a(arrbackStackState2.j, "android:target_state", object.i);
                            if (object.k != 0) {
                                arrbackStackState2.j.putInt("android:target_req_state", object.k);
                            }
                        }
                    } else {
                        arrbackStackState2.j = object.d;
                    }
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("Saved state of " + object + ": " + (Object)arrbackStackState2.j));
                    }
                    n3 = 1;
                }
                if (a) break block15;
            }
            return null;
        }
        Log.v((String)"FragmentManager", (String)"saveAllState: no fragments!");
        return null;
    }

    public void j() {
        this.q = false;
    }

    public void k() {
        this.q = false;
        this.a(1, false);
    }

    public void l() {
        this.q = false;
        this.a(2, false);
    }

    public void m() {
        this.q = false;
        this.a(4, false);
    }

    public void n() {
        this.q = false;
        this.a(5, false);
    }

    public void o() {
        this.a(4, false);
    }

    public void p() {
        this.q = true;
        this.a(3, false);
    }

    public void q() {
        this.a(2, false);
    }

    public void r() {
        this.r = true;
        this.f();
        this.a(0, false);
        this.o = null;
    }

    public void s() {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                Fragment fragment = (Fragment)this.g.get(i2);
                if (fragment == null) continue;
                fragment.onLowMemory();
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" in ");
        a.a((Object)this.o, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

