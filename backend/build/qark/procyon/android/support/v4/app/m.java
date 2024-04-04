// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.support.v4.c.a;
import java.io.Writer;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.os.Handler;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewGroup;
import android.app.Activity;
import android.os.Parcelable;
import android.content.res.Configuration;
import android.view.animation.AnimationUtils;
import android.util.Log;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.os.Build$VERSION;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.animation.Interpolator;

final class m extends k
{
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
    int n;
    g o;
    boolean p;
    boolean q;
    boolean r;
    String s;
    boolean t;
    Bundle u;
    SparseArray v;
    Runnable w;
    
    static {
        boolean b2 = false;
        m.a = false;
        if (Build$VERSION.SDK_INT >= 11) {
            b2 = true;
        }
        b = b2;
        x = (Interpolator)new DecelerateInterpolator(2.5f);
        y = (Interpolator)new DecelerateInterpolator(1.5f);
        z = (Interpolator)new AccelerateInterpolator(2.5f);
        A = (Interpolator)new AccelerateInterpolator(1.5f);
    }
    
    m() {
        this.n = 0;
        this.u = null;
        this.v = null;
        this.w = new n(this);
    }
    
    static Animation a(final Context context, final float n, final float n2) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n, n2);
        alphaAnimation.setInterpolator(m.y);
        alphaAnimation.setDuration(220L);
        return (Animation)alphaAnimation;
    }
    
    static Animation a(final Context context, final float n, final float n2, final float n3, final float n4) {
        final AnimationSet set = new AnimationSet(false);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(n, n2, n, n2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(m.x);
        scaleAnimation.setDuration(220L);
        set.addAnimation((Animation)scaleAnimation);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n3, n4);
        alphaAnimation.setInterpolator(m.y);
        alphaAnimation.setDuration(220L);
        set.addAnimation((Animation)alphaAnimation);
        return (Animation)set;
    }
    
    public static int b(final int n, final boolean b) {
        switch (n) {
            default: {
                return -1;
            }
            case 4097: {
                if (b) {
                    return 1;
                }
                return 2;
            }
            case 8194: {
                if (b) {
                    return 3;
                }
                return 4;
            }
            case 4099: {
                if (b) {
                    return 5;
                }
                return 6;
            }
        }
    }
    
    public static int c(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 4097: {
                return 8194;
            }
            case 8194: {
                return 4097;
            }
            case 4099: {
                return 4099;
            }
        }
    }
    
    private void t() {
        if (this.q) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.s != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.s);
        }
    }
    
    public int a(final b b) {
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                final int size = this.k.size();
                if (android.support.v4.app.m.a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + b);
                }
                this.k.add(b);
                return size;
            }
            final int intValue = this.l.remove(this.l.size() - 1);
            if (android.support.v4.app.m.a) {
                Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + b);
            }
            this.k.set(intValue, b);
            return intValue;
        }
    }
    
    @Override
    public Fragment a(final int n) {
        if (this.g != null) {
            for (int i = this.g.size() - 1; i >= 0; --i) {
                final Fragment fragment = this.g.get(i);
                if (fragment != null && fragment.u == n) {
                    return fragment;
                }
            }
        }
        Label_0054: {
            break Label_0054;
        }
        if (this.f != null) {
            for (int j = this.f.size() - 1; j >= 0; --j) {
                final Fragment fragment2 = this.f.get(j);
                if (fragment2 != null) {
                    final Fragment fragment = fragment2;
                    if (fragment2.u == n) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }
    
    public Fragment a(final Bundle bundle, final String s) {
        final int int1 = bundle.getInt(s, -1);
        Fragment fragment;
        if (int1 == -1) {
            fragment = null;
        }
        else {
            if (int1 >= this.f.size()) {
                throw new IllegalStateException("Fragement no longer exists for key " + s + ": index " + int1);
            }
            if ((fragment = this.f.get(int1)) == null) {
                throw new IllegalStateException("Fragement no longer exists for key " + s + ": index " + int1);
            }
        }
        return fragment;
    }
    
    public Fragment a(final String s) {
        if (this.g != null && s != null) {
            for (int i = this.g.size() - 1; i >= 0; --i) {
                final Fragment fragment = this.g.get(i);
                if (fragment != null && s.equals(fragment.w)) {
                    return fragment;
                }
            }
        }
        Label_0061: {
            break Label_0061;
        }
        if (this.f != null && s != null) {
            for (int j = this.f.size() - 1; j >= 0; --j) {
                final Fragment fragment2 = this.f.get(j);
                if (fragment2 != null) {
                    final Fragment fragment = fragment2;
                    if (s.equals(fragment2.w)) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    public s a() {
        return new b(this);
    }
    
    Animation a(final Fragment fragment, int n, final boolean b, final int n2) {
        final Animation a = fragment.a(n, b, fragment.E);
        Animation loadAnimation;
        if (a != null) {
            loadAnimation = a;
        }
        else if (fragment.E == 0 || (loadAnimation = AnimationUtils.loadAnimation((Context)this.o, fragment.E)) == null) {
            if (n == 0) {
                return null;
            }
            n = b(n, b);
            if (n < 0) {
                return null;
            }
            switch (n) {
                default: {
                    n = n2;
                    if (n2 == 0) {
                        n = n2;
                        if (this.o.getWindow() != null) {
                            n = this.o.getWindow().getAttributes().windowAnimations;
                        }
                    }
                    if (n == 0) {
                        return null;
                    }
                    return null;
                }
                case 1: {
                    return a((Context)this.o, 1.125f, 1.0f, 0.0f, 1.0f);
                }
                case 2: {
                    return a((Context)this.o, 1.0f, 0.975f, 1.0f, 0.0f);
                }
                case 3: {
                    return a((Context)this.o, 0.975f, 1.0f, 0.0f, 1.0f);
                }
                case 4: {
                    return a((Context)this.o, 1.0f, 1.075f, 1.0f, 0.0f);
                }
                case 5: {
                    return a((Context)this.o, 0.0f, 1.0f);
                }
                case 6: {
                    return a((Context)this.o, 1.0f, 0.0f);
                }
            }
        }
        return loadAnimation;
    }
    
    void a(final int n, final int n2, final int n3, final boolean b) {
        if (this.o == null && n != 0) {
            throw new IllegalStateException("No activity");
        }
        if (b || this.n != n) {
            this.n = n;
            if (this.f != null) {
                int i = 0;
                boolean b2 = false;
            Label_0116_Outer:
                while (i < this.f.size()) {
                    final Fragment fragment = this.f.get(i);
                    if (fragment != null) {
                        this.a(fragment, n, n2, n3, false);
                        if (fragment.K != null) {
                            b2 |= fragment.K.a();
                        }
                    }
                    while (true) {
                        ++i;
                        continue Label_0116_Outer;
                        continue;
                    }
                }
                if (!b2) {
                    this.e();
                }
                if (this.p && this.o != null && this.n == 5) {
                    this.o.c();
                    this.p = false;
                }
            }
        }
    }
    
    public void a(final int i, final b b) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            int j;
            if (i < (j = this.k.size())) {
                if (android.support.v4.app.m.a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + b);
                }
                this.k.set(i, b);
            }
            else {
                while (j < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList();
                    }
                    if (android.support.v4.app.m.a) {
                        Log.v("FragmentManager", "Adding available back stack index " + j);
                    }
                    this.l.add(j);
                    ++j;
                }
                if (android.support.v4.app.m.a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + b);
                }
                this.k.add(b);
            }
        }
    }
    
    void a(final int n, final boolean b) {
        this.a(n, 0, 0, b);
    }
    
    public void a(final Configuration configuration) {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); ++i) {
                final Fragment fragment = this.g.get(i);
                if (fragment != null) {
                    fragment.onConfigurationChanged(configuration);
                }
            }
        }
    }
    
    public void a(final Bundle bundle, final String s, final Fragment obj) {
        if (obj.f < 0) {
            throw new IllegalStateException("Fragment " + obj + " is not currently in the FragmentManager");
        }
        bundle.putInt(s, obj.f);
    }
    
    void a(final Parcelable parcelable, final ArrayList list) {
        final int n = 0;
        if (parcelable != null) {
            final FragmentManagerState fragmentManagerState = (FragmentManagerState)parcelable;
            if (fragmentManagerState.a != null) {
                if (list != null) {
                    for (int i = 0; i < list.size(); ++i) {
                        final Fragment fragment = list.get(i);
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        final FragmentState fragmentState = fragmentManagerState.a[fragment.f];
                        fragmentState.k = fragment;
                        fragment.e = null;
                        fragment.r = 0;
                        fragment.p = false;
                        fragment.l = false;
                        fragment.i = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            fragment.e = fragmentState.j.getSparseParcelableArray("android:view_state");
                        }
                    }
                }
                this.f = new ArrayList(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int j = 0; j < fragmentManagerState.a.length; ++j) {
                    final FragmentState fragmentState2 = fragmentManagerState.a[j];
                    if (fragmentState2 != null) {
                        final Fragment a = fragmentState2.a(this.o);
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "restoreAllState: adding #" + j + ": " + a);
                        }
                        this.f.add(a);
                        fragmentState2.k = null;
                    }
                    else {
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "restoreAllState: adding #" + j + ": (null)");
                        }
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "restoreAllState: adding avail #" + j);
                        }
                        this.h.add(j);
                    }
                }
                if (list != null) {
                    for (int k = 0; k < list.size(); ++k) {
                        final Fragment obj = list.get(k);
                        if (obj.j >= 0) {
                            if (obj.j < this.f.size()) {
                                obj.i = (Fragment)this.f.get(obj.j);
                            }
                            else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + obj + " target no longer exists: " + obj.j);
                                obj.i = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList(fragmentManagerState.b.length);
                    for (int l = 0; l < fragmentManagerState.b.length; ++l) {
                        final Fragment fragment2 = this.f.get(fragmentManagerState.b[l]);
                        if (fragment2 == null) {
                            throw new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.b[l]);
                        }
                        fragment2.l = true;
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "restoreAllState: making added #" + l + ": " + fragment2);
                        }
                        this.g.add(fragment2);
                    }
                }
                else {
                    this.g = null;
                }
                if (fragmentManagerState.c == null) {
                    this.i = null;
                    return;
                }
                this.i = new ArrayList(fragmentManagerState.c.length);
                for (int m = n; m < fragmentManagerState.c.length; ++m) {
                    final b a2 = fragmentManagerState.c[m].a(this);
                    if (android.support.v4.app.m.a) {
                        Log.v("FragmentManager", "restoreAllState: adding bse #" + m + " (index " + a2.o + "): " + a2);
                    }
                    this.i.add(a2);
                    if (a2.o >= 0) {
                        this.a(a2.o, a2);
                    }
                }
            }
        }
    }
    
    public void a(final Fragment fragment) {
        if (fragment.I) {
            if (!this.e) {
                fragment.I = false;
                this.a(fragment, this.n, 0, 0, false);
                return;
            }
            this.t = true;
        }
    }
    
    public void a(final Fragment fragment, final int n, final int n2) {
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean b;
        if (!fragment.b()) {
            b = true;
        }
        else {
            b = false;
        }
        if (!fragment.y || b) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.B && fragment.C) {
                this.p = true;
            }
            fragment.l = false;
            fragment.m = true;
            int n3;
            if (b) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            this.a(fragment, n3, n, n2, false);
        }
    }
    
    void a(final Fragment fragment, int n, final int n2, final int n3, final boolean b) {
        int n4 = n;
        if (!fragment.l && (n4 = n) > 1) {
            n4 = 1;
        }
        int a = n4;
        if (fragment.m && (a = n4) > fragment.a) {
            a = fragment.a;
        }
        n = a;
        if (fragment.I) {
            n = a;
            if (fragment.a < 4 && (n = a) > 3) {
                n = 3;
            }
        }
        int a2 = 0;
        if (fragment.a < n) {
            if (fragment.o && !fragment.p) {
                return;
            }
            if (fragment.b != null) {
                fragment.b = null;
                this.a(fragment, fragment.c, 0, 0, true);
            }
            int n5 = n;
            int n6 = n;
            int n7 = n;
            Label_1007: {
                switch (fragment.a) {
                    default: {
                        a2 = n;
                        break;
                    }
                    case 0: {
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "moveto CREATED: " + fragment);
                        }
                        int n8 = n;
                        if (fragment.d != null) {
                            fragment.e = fragment.d.getSparseParcelableArray("android:view_state");
                            fragment.i = this.a(fragment.d, "android:target_state");
                            if (fragment.i != null) {
                                fragment.k = fragment.d.getInt("android:target_req_state", 0);
                            }
                            fragment.J = fragment.d.getBoolean("android:user_visible_hint", true);
                            n8 = n;
                            if (!fragment.J) {
                                fragment.I = true;
                                if ((n8 = n) > 3) {
                                    n8 = 3;
                                }
                            }
                        }
                        fragment.t = this.o;
                        fragment.s = this.o.b;
                        fragment.D = false;
                        fragment.a(this.o);
                        if (!fragment.D) {
                            throw new ab("Fragment " + fragment + " did not call through to super.onAttach()");
                        }
                        this.o.a(fragment);
                        if (!fragment.A) {
                            fragment.D = false;
                            fragment.b(fragment.d);
                            if (!fragment.D) {
                                throw new ab("Fragment " + fragment + " did not call through to super.onCreate()");
                            }
                        }
                        fragment.A = false;
                        n5 = n8;
                        if (!fragment.o) {
                            break Label_1007;
                        }
                        fragment.G = fragment.a(fragment.a(fragment.d), null, fragment.d);
                        if (fragment.G != null) {
                            fragment.H = fragment.G;
                            fragment.G = (View)aa.a(fragment.G);
                            if (fragment.x) {
                                fragment.G.setVisibility(8);
                            }
                            fragment.a(fragment.G, fragment.d);
                            n5 = n8;
                            break Label_1007;
                        }
                        fragment.H = null;
                        n5 = n8;
                        break Label_1007;
                    }
                    case 1: {
                        if ((n6 = n5) <= 1) {
                            break Label_1007;
                        }
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                        }
                        if (!fragment.o) {
                            ViewGroup f;
                            if (fragment.v != 0) {
                                final ViewGroup viewGroup = (ViewGroup)this.o.findViewById(fragment.v);
                                if ((f = viewGroup) == null) {
                                    f = viewGroup;
                                    if (!fragment.q) {
                                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.v) + " for fragment " + fragment);
                                    }
                                }
                            }
                            else {
                                f = null;
                            }
                            fragment.F = f;
                            fragment.G = fragment.a(fragment.a(fragment.d), f, fragment.d);
                            if (fragment.G != null) {
                                fragment.H = fragment.G;
                                fragment.G = (View)aa.a(fragment.G);
                                if (f != null) {
                                    final Animation a3 = this.a(fragment, n2, true, n3);
                                    if (a3 != null) {
                                        fragment.G.startAnimation(a3);
                                    }
                                    f.addView(fragment.G);
                                }
                                if (fragment.x) {
                                    fragment.G.setVisibility(8);
                                }
                                fragment.a(fragment.G, fragment.d);
                            }
                            else {
                                fragment.H = null;
                            }
                        }
                        fragment.D = false;
                        fragment.c(fragment.d);
                        if (!fragment.D) {
                            throw new ab("Fragment " + fragment + " did not call through to super.onActivityCreated()");
                        }
                        if (fragment.G != null) {
                            fragment.a();
                        }
                        fragment.d = null;
                        n6 = n5;
                        break Label_1007;
                    }
                    case 2:
                    case 3: {
                        if ((n7 = n6) <= 3) {
                            break Label_1007;
                        }
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "moveto STARTED: " + fragment);
                        }
                        fragment.D = false;
                        fragment.n();
                        n7 = n6;
                        if (!fragment.D) {
                            throw new ab("Fragment " + fragment + " did not call through to super.onStart()");
                        }
                        break Label_1007;
                    }
                    case 4: {
                        if ((a2 = n7) <= 4) {
                            break;
                        }
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "moveto RESUMED: " + fragment);
                        }
                        fragment.D = false;
                        fragment.n = true;
                        fragment.f();
                        if (!fragment.D) {
                            throw new ab("Fragment " + fragment + " did not call through to super.onResume()");
                        }
                        fragment.d = null;
                        fragment.e = null;
                        a2 = n7;
                        break;
                    }
                }
            }
        }
        else if (fragment.a > (a2 = n)) {
            while (true) {
                Label_1413: {
                    switch (fragment.a) {
                        default: {
                            a2 = n;
                            break;
                        }
                        case 1: {
                            if ((a2 = n) >= 1) {
                                break;
                            }
                            if (this.r && fragment.b != null) {
                                final View b2 = fragment.b;
                                fragment.b = null;
                                b2.clearAnimation();
                            }
                            if (fragment.b != null) {
                                fragment.c = n;
                                a2 = 1;
                                break;
                            }
                            if (android.support.v4.app.m.a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.A) {
                                fragment.D = false;
                                fragment.j();
                                if (!fragment.D) {
                                    throw new ab("Fragment " + fragment + " did not call through to super.onDestroy()");
                                }
                            }
                            fragment.D = false;
                            fragment.l();
                            if (!fragment.D) {
                                throw new ab("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            a2 = n;
                            if (b) {
                                break;
                            }
                            if (!fragment.A) {
                                this.d(fragment);
                                a2 = n;
                                break;
                            }
                            fragment.t = null;
                            fragment.s = null;
                            a2 = n;
                            break;
                        }
                        case 5: {
                            if (n >= 5) {
                                break Label_1413;
                            }
                            if (android.support.v4.app.m.a) {
                                Log.v("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.D = false;
                            fragment.g();
                            if (!fragment.D) {
                                throw new ab("Fragment " + fragment + " did not call through to super.onPause()");
                            }
                            fragment.n = false;
                            break Label_1413;
                        }
                        case 4: {
                            if (n >= 4) {
                                break Label_1413;
                            }
                            if (android.support.v4.app.m.a) {
                                Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.D = false;
                            fragment.o();
                            if (!fragment.D) {
                                throw new ab("Fragment " + fragment + " did not call through to super.onStop()");
                            }
                            break Label_1413;
                        }
                        case 3: {
                            if (n < 3) {
                                if (android.support.v4.app.m.a) {
                                    Log.v("FragmentManager", "movefrom STOPPED: " + fragment);
                                }
                                fragment.p();
                            }
                        }
                        case 2: {
                            if (n >= 2) {
                                continue;
                            }
                            if (android.support.v4.app.m.a) {
                                Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.G != null && !this.o.isFinishing() && fragment.e == null) {
                                this.e(fragment);
                            }
                            fragment.D = false;
                            fragment.q();
                            if (!fragment.D) {
                                throw new ab("Fragment " + fragment + " did not call through to super.onDestroyView()");
                            }
                            if (fragment.G != null && fragment.F != null) {
                                Animation a4;
                                if (this.n > 0 && !this.r) {
                                    a4 = this.a(fragment, n2, false, n3);
                                }
                                else {
                                    a4 = null;
                                }
                                if (a4 != null) {
                                    fragment.b = fragment.G;
                                    fragment.c = n;
                                    a4.setAnimationListener((Animation$AnimationListener)new p(this, fragment));
                                    fragment.G.startAnimation(a4);
                                }
                                fragment.F.removeView(fragment.G);
                            }
                            fragment.F = null;
                            fragment.G = null;
                            fragment.H = null;
                            continue;
                        }
                    }
                }
                break;
            }
        }
        fragment.a = a2;
    }
    
    public void a(final Fragment fragment, final boolean b) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        this.c(fragment);
        if (!fragment.y) {
            this.g.add(fragment);
            fragment.l = true;
            fragment.m = false;
            if (fragment.B && fragment.C) {
                this.p = true;
            }
            if (b) {
                this.b(fragment);
            }
        }
    }
    
    public void a(final g o) {
        if (this.o != null) {
            throw new IllegalStateException();
        }
        this.o = o;
    }
    
    public void a(final Runnable runnable, final boolean b) {
        if (!b) {
            this.t();
        }
        synchronized (this) {
            if (this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        final Throwable e;
        this.c.add(e);
        if (this.c.size() == 1) {
            this.o.a.removeCallbacks(this.w);
            this.o.a.post(this.w);
        }
    }
    // monitorexit(this)
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final int n = 0;
        final String string = s + "    ";
        if (this.f != null) {
            final int size = this.f.size();
            if (size > 0) {
                printWriter.print(s);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; ++i) {
                    final Fragment x = this.f.get(i);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(x);
                    if (x != null) {
                        x.a(string, fileDescriptor, printWriter, array);
                    }
                }
            }
        }
        if (this.g != null) {
            final int size2 = this.g.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Added Fragments:");
                for (int j = 0; j < size2; ++j) {
                    final Fragment fragment = this.g.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.j != null) {
            final int size3 = this.j.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int k = 0; k < size3; ++k) {
                    final Fragment fragment2 = this.j.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(fragment2.toString());
                }
            }
        }
        if (this.i != null) {
            final int size4 = this.i.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int l = 0; l < size4; ++l) {
                    final b b = this.i.get(l);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(l);
                    printWriter.print(": ");
                    printWriter.println(b.toString());
                    b.a(string, fileDescriptor, printWriter, array);
                }
            }
        }
        synchronized (this) {
            if (this.k != null) {
                final int size5 = this.k.size();
                if (size5 > 0) {
                    printWriter.print(s);
                    printWriter.println("Back Stack Indices:");
                    for (int n2 = 0; n2 < size5; ++n2) {
                        final b x2 = this.k.get(n2);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n2);
                        printWriter.print(": ");
                        printWriter.println(x2);
                    }
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(s);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
            // monitorexit(this)
            if (this.c != null) {
                final int size6 = this.c.size();
                if (size6 > 0) {
                    printWriter.print(s);
                    printWriter.println("Pending Actions:");
                    for (int n3 = n; n3 < size6; ++n3) {
                        final Runnable x3 = this.c.get(n3);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n3);
                        printWriter.print(": ");
                        printWriter.println(x3);
                    }
                }
            }
        }
        final String s2;
        printWriter.print(s2);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(s2);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.q);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.r);
        if (this.p) {
            printWriter.print(s2);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.p);
        }
        if (this.s != null) {
            printWriter.print(s2);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.s);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(s2);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }
    
    boolean a(final Handler handler, final String s, int i, int index) {
        if (this.i != null) {
            if (s == null && i < 0 && (index & 0x1) == 0x0) {
                i = this.i.size() - 1;
                if (i < 0) {
                    return false;
                }
                this.i.remove(i).b(true);
                this.g();
            }
            else {
                int n = -1;
                if (s != null || i >= 0) {
                    int j;
                    for (j = this.i.size() - 1; j >= 0; --j) {
                        final b b = this.i.get(j);
                        if ((s != null && s.equals(b.b())) || (i >= 0 && i == b.o)) {
                            break;
                        }
                    }
                    if (j < 0) {
                        return false;
                    }
                    n = j;
                    if ((index & 0x1) != 0x0) {
                        index = j - 1;
                        while (true) {
                            n = index;
                            if (index < 0) {
                                break;
                            }
                            final b b2 = this.i.get(index);
                            if (s == null || !s.equals(b2.b())) {
                                n = index;
                                if (i < 0) {
                                    break;
                                }
                                n = index;
                                if (i != b2.o) {
                                    break;
                                }
                            }
                            --index;
                        }
                    }
                }
                if (n == this.i.size() - 1) {
                    return false;
                }
                final ArrayList<b> list = new ArrayList<b>();
                for (i = this.i.size() - 1; i > n; --i) {
                    list.add(this.i.remove(i));
                }
                for (index = list.size() - 1, i = 0; i <= index; ++i) {
                    if (android.support.v4.app.m.a) {
                        Log.v("FragmentManager", "Popping back stack state: " + list.get(i));
                    }
                    list.get(i).b(i == index);
                }
                this.g();
            }
            return true;
        }
        return false;
    }
    
    public boolean a(final Menu menu) {
        boolean b2;
        if (this.g != null) {
            int index = 0;
            boolean b = false;
            while (true) {
                b2 = b;
                if (index >= this.g.size()) {
                    break;
                }
                final Fragment fragment = this.g.get(index);
                boolean b3 = b;
                if (fragment != null) {
                    b3 = b;
                    if (!fragment.x) {
                        b3 = b;
                        if (fragment.B) {
                            b3 = b;
                            if (fragment.C) {
                                b3 = true;
                                fragment.a(menu);
                            }
                        }
                    }
                }
                ++index;
                b = b3;
            }
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public boolean a(final Menu menu, final MenuInflater menuInflater) {
        final int n = 0;
        ArrayList<Fragment> j = null;
        ArrayList<Fragment> list = null;
        boolean b2;
        if (this.g != null) {
            int index = 0;
            boolean b = false;
            while (true) {
                j = list;
                b2 = b;
                if (index >= this.g.size()) {
                    break;
                }
                final Fragment e = this.g.get(index);
                ArrayList<Fragment> list2 = list;
                boolean b3 = b;
                if (e != null) {
                    list2 = list;
                    b3 = b;
                    if (!e.x) {
                        list2 = list;
                        b3 = b;
                        if (e.B) {
                            list2 = list;
                            b3 = b;
                            if (e.C) {
                                b3 = true;
                                e.a(menu, menuInflater);
                                if ((list2 = list) == null) {
                                    list2 = new ArrayList<Fragment>();
                                }
                                list2.add(e);
                            }
                        }
                    }
                }
                ++index;
                b = b3;
                list = list2;
            }
        }
        else {
            b2 = false;
        }
        if (this.j != null) {
            for (int i = n; i < this.j.size(); ++i) {
                final Fragment o = this.j.get(i);
                if (j == null || !j.contains(o)) {
                    o.m();
                }
            }
        }
        this.j = j;
        return b2;
    }
    
    public boolean a(final MenuItem menuItem) {
        boolean b = false;
        if (this.g != null) {
            int index = 0;
            while (true) {
                b = b;
                if (index >= this.g.size()) {
                    break;
                }
                final Fragment fragment = this.g.get(index);
                if (fragment != null && !fragment.x && fragment.B && fragment.C && fragment.a(menuItem)) {
                    b = true;
                    break;
                }
                ++index;
            }
        }
        return b;
    }
    
    @Override
    public void b() {
        this.a(new o(this), false);
    }
    
    public void b(final int i) {
        synchronized (this) {
            this.k.set(i, null);
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (android.support.v4.app.m.a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.l.add(i);
        }
    }
    
    void b(final Fragment fragment) {
        this.a(fragment, this.n, 0, 0, false);
    }
    
    public void b(final Fragment obj, final int n, final int n2) {
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "hide: " + obj);
        }
        if (!obj.x) {
            obj.x = true;
            if (obj.G != null) {
                final Animation a = this.a(obj, n, true, n2);
                if (a != null) {
                    obj.G.startAnimation(a);
                }
                obj.G.setVisibility(8);
            }
            if (obj.l && obj.B && obj.C) {
                this.p = true;
            }
            obj.a(true);
        }
    }
    
    void b(final b e) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(e);
        this.g();
    }
    
    public void b(final Menu menu) {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); ++i) {
                final Fragment fragment = this.g.get(i);
                if (fragment != null && !fragment.x && fragment.B && fragment.C) {
                    fragment.b(menu);
                }
            }
        }
    }
    
    public boolean b(final MenuItem menuItem) {
        boolean b = false;
        if (this.g != null) {
            int index = 0;
            while (true) {
                b = b;
                if (index >= this.g.size()) {
                    break;
                }
                final Fragment fragment = this.g.get(index);
                if (fragment != null && !fragment.x && fragment.J && fragment.b(menuItem)) {
                    b = true;
                    break;
                }
                ++index;
            }
        }
        return b;
    }
    
    void c(final Fragment obj) {
        if (obj.f < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                obj.a(this.f.size());
                this.f.add(obj);
            }
            else {
                obj.a(this.h.remove(this.h.size() - 1));
                this.f.set(obj.f, obj);
            }
            if (android.support.v4.app.m.a) {
                Log.v("FragmentManager", "Allocated fragment index " + obj);
            }
        }
    }
    
    public void c(final Fragment obj, final int n, final int n2) {
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "show: " + obj);
        }
        if (obj.x) {
            obj.x = false;
            if (obj.G != null) {
                final Animation a = this.a(obj, n, true, n2);
                if (a != null) {
                    obj.G.startAnimation(a);
                }
                obj.G.setVisibility(0);
            }
            if (obj.l && obj.B && obj.C) {
                this.p = true;
            }
            obj.a(false);
        }
    }
    
    @Override
    public boolean c() {
        this.t();
        this.d();
        return this.a(this.o.a, null, -1, 0);
    }
    
    void d(final Fragment obj) {
        if (obj.f < 0) {
            return;
        }
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "Freeing fragment index " + obj);
        }
        this.f.set(obj.f, null);
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(obj.f);
        this.o.a(obj.f);
        obj.k();
    }
    
    public void d(final Fragment fragment, final int n, final int n2) {
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.y) {
            fragment.y = true;
            if (fragment.l) {
                if (this.g != null) {
                    this.g.remove(fragment);
                }
                if (fragment.B && fragment.C) {
                    this.p = true;
                }
                this.a(fragment, 1, n, n2, fragment.l = false);
            }
        }
    }
    
    public boolean d() {
        return this.f();
    }
    
    void e() {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); ++i) {
                final Fragment fragment = this.f.get(i);
                if (fragment != null) {
                    this.a(fragment);
                }
            }
        }
    }
    
    void e(final Fragment fragment) {
        if (fragment.H != null) {
            if (this.v == null) {
                this.v = new SparseArray();
            }
            else {
                this.v.clear();
            }
            fragment.H.saveHierarchyState(this.v);
            if (this.v.size() > 0) {
                fragment.e = this.v;
                this.v = null;
            }
        }
    }
    
    public void e(final Fragment fragment, final int n, final int n2) {
        if (android.support.v4.app.m.a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.y) {
            fragment.y = false;
            if (!fragment.l) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(fragment);
                fragment.l = true;
                if (fragment.B && fragment.C) {
                    this.p = true;
                }
                this.a(fragment, this.n, n, n2, false);
            }
        }
    }
    
    Bundle f(final Fragment fragment) {
        if (this.u == null) {
            this.u = new Bundle();
        }
        fragment.d(this.u);
        Bundle u;
        if (!this.u.isEmpty()) {
            u = this.u;
            this.u = null;
        }
        else {
            u = null;
        }
        if (fragment.G != null) {
            this.e(fragment);
        }
        Bundle bundle = u;
        if (fragment.e != null) {
            if ((bundle = u) == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.e);
        }
        Bundle bundle2 = bundle;
        if (!fragment.J) {
            if ((bundle2 = bundle) == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android:user_visible_hint", fragment.J);
        }
        return bundle2;
    }
    
    public boolean f() {
        if (this.e) {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != this.o.a.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean b = false;
        while (true) {
            int size = 0;
            Label_0263: {
                synchronized (this) {
                    if (this.c == null || this.c.size() == 0) {
                        // monitorexit(this)
                        if (this.t) {
                            int i = 0;
                            size = 0;
                            while (i < this.f.size()) {
                                final Fragment fragment = this.f.get(i);
                                int n = size;
                                if (fragment != null) {
                                    n = size;
                                    if (fragment.K != null) {
                                        n = (size | (fragment.K.a() ? 1 : 0));
                                    }
                                }
                                ++i;
                                size = n;
                            }
                            break Label_0263;
                        }
                        break;
                    }
                    else {
                        size = this.c.size();
                        if (this.d == null || this.d.length < size) {
                            this.d = new Runnable[size];
                        }
                        this.c.toArray(this.d);
                        this.c.clear();
                        this.o.a.removeCallbacks(this.w);
                        // monitorexit(this)
                        this.e = true;
                        for (int j = 0; j < size; ++j) {
                            this.d[j].run();
                            this.d[j] = null;
                        }
                    }
                }
                this.e = false;
                b = true;
                continue;
            }
            if (size == 0) {
                this.t = false;
                this.e();
                break;
            }
            break;
        }
        return b;
    }
    
    void g() {
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); ++i) {
                ((l)this.m.get(i)).a();
            }
        }
    }
    
    ArrayList h() {
        ArrayList<Fragment> list = null;
        ArrayList<Fragment> list2 = null;
        if (this.f != null) {
            int index = 0;
            while (true) {
                list = list2;
                if (index >= this.f.size()) {
                    break;
                }
                final Fragment fragment = this.f.get(index);
                ArrayList<Fragment> list3 = list2;
                if (fragment != null) {
                    list3 = list2;
                    if (fragment.z) {
                        ArrayList<Fragment> list4;
                        if ((list4 = list2) == null) {
                            list4 = new ArrayList<Fragment>();
                        }
                        list4.add(fragment);
                        fragment.A = true;
                        int f;
                        if (fragment.i != null) {
                            f = fragment.i.f;
                        }
                        else {
                            f = -1;
                        }
                        fragment.j = f;
                        list3 = list4;
                        if (android.support.v4.app.m.a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                            list3 = list4;
                        }
                    }
                }
                ++index;
                list2 = list3;
            }
        }
        return list;
    }
    
    Parcelable i() {
        final BackStackState[] array = null;
        this.f();
        if (android.support.v4.app.m.b) {
            this.q = true;
        }
        if (this.f != null && this.f.size() > 0) {
            final int size = this.f.size();
            final FragmentState[] a = new FragmentState[size];
            int i = 0;
            boolean b = false;
            while (i < size) {
                final Fragment obj = this.f.get(i);
                if (obj != null) {
                    if (obj.f < 0) {
                        final String string = "Failure saving state: active " + obj + " has cleared index: " + obj.f;
                        Log.e("FragmentManager", string);
                        this.a("  ", null, new PrintWriter(new android.support.v4.c.b("FragmentManager")), new String[0]);
                        throw new IllegalStateException(string);
                    }
                    final FragmentState fragmentState = new FragmentState(obj);
                    a[i] = fragmentState;
                    if (obj.a > 0 && fragmentState.j == null) {
                        fragmentState.j = this.f(obj);
                        if (obj.i != null) {
                            if (obj.i.f < 0) {
                                final String string2 = "Failure saving state: " + obj + " has target not in fragment manager: " + obj.i;
                                Log.e("FragmentManager", string2);
                                this.a("  ", null, new PrintWriter(new android.support.v4.c.b("FragmentManager")), new String[0]);
                                throw new IllegalStateException(string2);
                            }
                            if (fragmentState.j == null) {
                                fragmentState.j = new Bundle();
                            }
                            this.a(fragmentState.j, "android:target_state", obj.i);
                            if (obj.k != 0) {
                                fragmentState.j.putInt("android:target_req_state", obj.k);
                            }
                        }
                    }
                    else {
                        fragmentState.j = obj.d;
                    }
                    if (android.support.v4.app.m.a) {
                        Log.v("FragmentManager", "Saved state of " + obj + ": " + fragmentState.j);
                    }
                    b = true;
                }
                ++i;
            }
            if (b) {
                int[] b2 = null;
                Label_0674: {
                    if (this.g != null) {
                        final int size2 = this.g.size();
                        if (size2 > 0) {
                            final int[] array2 = new int[size2];
                            int n = 0;
                            while (true) {
                                b2 = array2;
                                if (n >= size2) {
                                    break Label_0674;
                                }
                                array2[n] = ((Fragment)this.g.get(n)).f;
                                if (array2[n] < 0) {
                                    final String string3 = "Failure saving state: active " + this.g.get(n) + " has cleared index: " + array2[n];
                                    Log.e("FragmentManager", string3);
                                    this.a("  ", null, new PrintWriter(new android.support.v4.c.b("FragmentManager")), new String[0]);
                                    throw new IllegalStateException(string3);
                                }
                                if (android.support.v4.app.m.a) {
                                    Log.v("FragmentManager", "saveAllState: adding fragment #" + n + ": " + this.g.get(n));
                                }
                                ++n;
                            }
                        }
                    }
                    b2 = null;
                }
                BackStackState[] c = array;
                if (this.i != null) {
                    final int size3 = this.i.size();
                    c = array;
                    if (size3 > 0) {
                        final BackStackState[] array3 = new BackStackState[size3];
                        int index = 0;
                        while (true) {
                            c = array3;
                            if (index >= size3) {
                                break;
                            }
                            array3[index] = new BackStackState(this, (b)this.i.get(index));
                            if (android.support.v4.app.m.a) {
                                Log.v("FragmentManager", "saveAllState: adding back stack #" + index + ": " + this.i.get(index));
                            }
                            ++index;
                        }
                    }
                }
                final FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.a = a;
                fragmentManagerState.b = b2;
                fragmentManagerState.c = c;
                return (Parcelable)fragmentManagerState;
            }
            if (android.support.v4.app.m.a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return null;
            }
        }
        return null;
    }
    
    public void j() {
        this.q = false;
    }
    
    public void k() {
        this.a(1, this.q = false);
    }
    
    public void l() {
        this.a(2, this.q = false);
    }
    
    public void m() {
        this.a(4, this.q = false);
    }
    
    public void n() {
        this.a(5, this.q = false);
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
            for (int i = 0; i < this.g.size(); ++i) {
                final Fragment fragment = this.g.get(i);
                if (fragment != null) {
                    fragment.onLowMemory();
                }
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.c.a.a(this.o, sb);
        sb.append("}}");
        return sb.toString();
    }
}
