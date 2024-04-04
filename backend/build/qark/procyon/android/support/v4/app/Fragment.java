// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.support.v4.c.a;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.content.res.Configuration;
import android.view.MenuItem;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.MenuInflater;
import android.view.Menu;
import android.util.AttributeSet;
import android.app.Activity;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.LayoutInflater;
import android.content.Context;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener
{
    private static final HashMap N;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    int E;
    ViewGroup F;
    View G;
    View H;
    boolean I;
    boolean J;
    y K;
    boolean L;
    boolean M;
    int a;
    View b;
    int c;
    Bundle d;
    SparseArray e;
    int f;
    String g;
    Bundle h;
    Fragment i;
    int j;
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
    
    static {
        N = new HashMap();
    }
    
    public Fragment() {
        this.a = 0;
        this.f = -1;
        this.j = -1;
        this.C = true;
        this.J = true;
    }
    
    public static Fragment a(final Context context, final String s) {
        return a(context, s, null);
    }
    
    public static Fragment a(final Context context, final String s, final Bundle h) {
        try {
            Class<?> loadClass;
            if ((loadClass = Fragment.N.get(s)) == null) {
                loadClass = context.getClassLoader().loadClass(s);
                Fragment.N.put(s, loadClass);
            }
            final Fragment fragment = loadClass.newInstance();
            if (h != null) {
                h.setClassLoader(fragment.getClass().getClassLoader());
                fragment.h = h;
            }
            return fragment;
        }
        catch (ClassNotFoundException ex) {
            throw new e("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an" + " empty constructor that is public", ex);
        }
        catch (InstantiationException ex2) {
            throw new e("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an" + " empty constructor that is public", ex2);
        }
        catch (IllegalAccessException ex3) {
            throw new e("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an" + " empty constructor that is public", ex3);
        }
    }
    
    public LayoutInflater a(final Bundle bundle) {
        return this.t.getLayoutInflater();
    }
    
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return null;
    }
    
    public Animation a(final int n, final boolean b, final int n2) {
        return null;
    }
    
    final void a() {
        if (this.e != null) {
            this.H.restoreHierarchyState(this.e);
            this.e = null;
        }
    }
    
    final void a(final int f) {
        this.f = f;
        this.g = "android:fragment:" + this.f;
    }
    
    public void a(final int n, final int n2, final Intent intent) {
    }
    
    public void a(final Activity activity) {
        this.D = true;
    }
    
    public void a(final Activity activity, final AttributeSet set, final Bundle bundle) {
        this.D = true;
    }
    
    public void a(final Intent intent) {
        if (this.t == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.t.a(this, intent, -1);
    }
    
    public void a(final Menu menu) {
    }
    
    public void a(final Menu menu, final MenuInflater menuInflater) {
    }
    
    public void a(final View view, final Bundle bundle) {
    }
    
    public void a(final String str, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.u));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.v));
        printWriter.print(" mTag=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
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
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.x);
        printWriter.print(" mDetached=");
        printWriter.print(this.y);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.C);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.z);
        printWriter.print(" mRetaining=");
        printWriter.print(this.A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.t);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.h);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (this.E != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.G);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.b);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.c);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.K.a(str + "  ", fileDescriptor, printWriter, array);
        }
    }
    
    public void a(final boolean b) {
    }
    
    public boolean a(final MenuItem menuItem) {
        return false;
    }
    
    public void b(final Bundle bundle) {
        this.D = true;
    }
    
    public void b(final Menu menu) {
    }
    
    public void b(final boolean z) {
        this.z = z;
    }
    
    final boolean b() {
        return this.r > 0;
    }
    
    public boolean b(final MenuItem menuItem) {
        return false;
    }
    
    public final g c() {
        return this.t;
    }
    
    public void c(final Bundle bundle) {
        this.D = true;
    }
    
    public View d() {
        return this.G;
    }
    
    public void d(final Bundle bundle) {
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
    
    @Override
    public final boolean equals(final Object obj) {
        return super.equals(obj);
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
    
    @Override
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
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.D = true;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.c().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public void onLowMemory() {
        this.D = true;
    }
    
    void p() {
        if (this.L) {
            this.L = false;
            if (!this.M) {
                this.M = true;
                this.K = this.t.a(this.f, this.L, false);
            }
            if (this.K != null) {
                if (this.t.g) {
                    this.K.d();
                    return;
                }
                this.K.c();
            }
        }
    }
    
    void q() {
        this.i();
        if (this.K != null) {
            this.K.f();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        android.support.v4.c.a.a(this, sb);
        if (this.f >= 0) {
            sb.append(" #");
            sb.append(this.f);
        }
        if (this.u != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.u));
        }
        if (this.w != null) {
            sb.append(" ");
            sb.append(this.w);
        }
        sb.append('}');
        return sb.toString();
    }
}
