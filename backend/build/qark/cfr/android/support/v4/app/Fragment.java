/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.e;
import android.support.v4.app.g;
import android.support.v4.app.m;
import android.support.v4.app.y;
import android.support.v4.c.a;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;

public class Fragment
implements ComponentCallbacks,
View.OnCreateContextMenuListener {
    private static final HashMap N = new HashMap();
    boolean A;
    boolean B;
    boolean C = true;
    boolean D;
    int E;
    ViewGroup F;
    View G;
    View H;
    boolean I;
    boolean J = true;
    y K;
    boolean L;
    boolean M;
    int a = 0;
    View b;
    int c;
    Bundle d;
    SparseArray e;
    int f = -1;
    String g;
    Bundle h;
    Fragment i;
    int j = -1;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    m s;
    g t;
    int u;
    int v;
    String w;
    boolean x;
    boolean y;
    boolean z;

    public static Fragment a(Context context, String string) {
        return Fragment.a(context, string, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Fragment a(Context object, String string, Bundle bundle) {
        try {
            Class class_;
            Class class_2 = class_ = (Class)N.get((Object)string);
            if (class_ == null) {
                class_2 = object.getClassLoader().loadClass(string);
                N.put((Object)string, (Object)class_2);
            }
            object = (Fragment)class_2.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(object.getClass().getClassLoader());
                object.h = bundle;
            }
            return object;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new e("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an" + " empty constructor that is public", (Exception)classNotFoundException);
        }
        catch (InstantiationException instantiationException) {
            throw new e("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an" + " empty constructor that is public", (Exception)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new e("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an" + " empty constructor that is public", (Exception)illegalAccessException);
        }
    }

    public LayoutInflater a(Bundle bundle) {
        return this.t.getLayoutInflater();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation a(int n2, boolean bl2, int n3) {
        return null;
    }

    final void a() {
        if (this.e != null) {
            this.H.restoreHierarchyState(this.e);
            this.e = null;
        }
    }

    final void a(int n2) {
        this.f = n2;
        this.g = "android:fragment:" + this.f;
    }

    public void a(int n2, int n3, Intent intent) {
    }

    public void a(Activity activity) {
        this.D = true;
    }

    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.D = true;
    }

    public void a(Intent intent) {
        if (this.t == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.t.a(this, intent, -1);
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        printWriter.print(string);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString((int)this.u));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString((int)this.v));
        printWriter.print(" mTag=");
        printWriter.println(this.w);
        printWriter.print(string);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(string);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(string);
        printWriter.print("mHidden=");
        printWriter.print(this.x);
        printWriter.print(" mDetached=");
        printWriter.print(this.y);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.C);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.B);
        printWriter.print(string);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.z);
        printWriter.print(" mRetaining=");
        printWriter.print(this.A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.s != null) {
            printWriter.print(string);
            printWriter.print("mFragmentManager=");
            printWriter.println((Object)this.s);
        }
        if (this.t != null) {
            printWriter.print(string);
            printWriter.print("mActivity=");
            printWriter.println((Object)this.t);
        }
        if (this.h != null) {
            printWriter.print(string);
            printWriter.print("mArguments=");
            printWriter.println((Object)this.h);
        }
        if (this.d != null) {
            printWriter.print(string);
            printWriter.print("mSavedFragmentState=");
            printWriter.println((Object)this.d);
        }
        if (this.e != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewState=");
            printWriter.println((Object)this.e);
        }
        if (this.i != null) {
            printWriter.print(string);
            printWriter.print("mTarget=");
            printWriter.print((Object)this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (this.E != 0) {
            printWriter.print(string);
            printWriter.print("mNextAnim=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(string);
            printWriter.print("mContainer=");
            printWriter.println((Object)this.F);
        }
        if (this.G != null) {
            printWriter.print(string);
            printWriter.print("mView=");
            printWriter.println((Object)this.G);
        }
        if (this.H != null) {
            printWriter.print(string);
            printWriter.print("mInnerView=");
            printWriter.println((Object)this.G);
        }
        if (this.b != null) {
            printWriter.print(string);
            printWriter.print("mAnimatingAway=");
            printWriter.println((Object)this.b);
            printWriter.print(string);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.c);
        }
        if (this.K != null) {
            printWriter.print(string);
            printWriter.println("Loader Manager:");
            this.K.a(string + "  ", fileDescriptor, printWriter, arrstring);
        }
    }

    public void a(boolean bl2) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public void b(Bundle bundle) {
        this.D = true;
    }

    public void b(Menu menu) {
    }

    public void b(boolean bl2) {
        this.z = bl2;
    }

    final boolean b() {
        if (this.r > 0) {
            return true;
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public final g c() {
        return this.t;
    }

    public void c(Bundle bundle) {
        this.D = true;
    }

    public View d() {
        return this.G;
    }

    public void d(Bundle bundle) {
    }

    public void e() {
        this.D = true;
        if (!this.L) {
            this.L = true;
            if (!this.M) {
                this.M = true;
                this.K = this.t.a(this.f, this.L, false);
            }
            if (this.K != null) {
                this.K.b();
            }
        }
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public void f() {
        this.D = true;
    }

    public void g() {
        this.D = true;
    }

    public void h() {
        this.D = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i() {
        this.D = true;
    }

    public void j() {
        this.D = true;
        if (!this.M) {
            this.M = true;
            this.K = this.t.a(this.f, this.L, false);
        }
        if (this.K != null) {
            this.K.h();
        }
    }

    void k() {
        this.f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = null;
        this.t = null;
        this.u = 0;
        this.v = 0;
        this.w = null;
        this.x = false;
        this.y = false;
        this.A = false;
        this.K = null;
        this.L = false;
        this.M = false;
    }

    public void l() {
        this.D = true;
    }

    public void m() {
    }

    void n() {
        this.e();
        if (this.K != null) {
            this.K.g();
        }
    }

    void o() {
        this.h();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.c().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.D = true;
    }

    void p() {
        block5 : {
            block4 : {
                if (!this.L) break block4;
                this.L = false;
                if (!this.M) {
                    this.M = true;
                    this.K = this.t.a(this.f, this.L, false);
                }
                if (this.K == null) break block4;
                if (this.t.g) break block5;
                this.K.c();
            }
            return;
        }
        this.K.d();
    }

    void q() {
        this.i();
        if (this.K != null) {
            this.K.f();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        a.a(this, stringBuilder);
        if (this.f >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f);
        }
        if (this.u != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString((int)this.u));
        }
        if (this.w != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.w);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

