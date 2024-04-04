// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.view.MenuItem;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Menu;
import java.util.ArrayList;
import android.os.Parcelable;
import android.view.LayoutInflater$Factory;
import android.os.Bundle;
import android.content.res.Configuration;
import android.util.Log;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Build$VERSION;
import android.content.Intent;
import android.support.v4.c.c;
import android.os.Handler;
import android.app.Activity;

public class g extends Activity
{
    final Handler a;
    final m b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    c k;
    y l;
    
    public g() {
        this.a = new h(this);
        this.b = new m();
    }
    
    y a(final int n, final boolean b, final boolean b2) {
        if (this.k == null) {
            this.k = new c();
        }
        y y = (y)this.k.a(n);
        if (y == null) {
            if (b2) {
                y = new y(this, b);
                this.k.b(n, y);
            }
            return y;
        }
        y.a(this);
        return y;
    }
    
    void a(final int n) {
        if (this.k != null) {
            final y y = (y)this.k.a(n);
            if (y != null && !y.f) {
                y.h();
                this.k.c(n);
            }
        }
    }
    
    public void a(final Fragment fragment) {
    }
    
    public void a(final Fragment fragment, final Intent intent, final int n) {
        if (n == -1) {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((0xFFFF0000 & n) != 0x0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, (fragment.f + 1 << 16) + (0xFFFF & n));
    }
    
    void a(final boolean g) {
        if (!this.f) {
            this.f = true;
            this.g = g;
            this.a.removeMessages(1);
            this.d();
        }
    }
    
    protected void b_() {
        this.b.n();
    }
    
    public void c() {
        if (Build$VERSION.SDK_INT >= 11) {
            android.support.v4.app.a.a(this);
            return;
        }
        this.h = true;
    }
    
    public Object c_() {
        return null;
    }
    
    void d() {
        if (this.j) {
            this.j = false;
            if (this.l != null) {
                if (!this.g) {
                    this.l.c();
                }
                else {
                    this.l.d();
                }
            }
        }
        this.b.q();
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        if (Build$VERSION.SDK_INT >= 11) {}
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final String string = s + "  ";
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.c);
        printWriter.print("mResumed=");
        printWriter.print(this.d);
        printWriter.print(" mStopped=");
        printWriter.print(this.e);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f);
        printWriter.print(string);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.l != null) {
            printWriter.print(s);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.l)));
            printWriter.println(":");
            this.l.a(s + "  ", fileDescriptor, printWriter, array);
        }
        this.b.a(s, fileDescriptor, printWriter, array);
    }
    
    public k e() {
        return this.b;
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final int n3 = n >> 16;
        if (n3 == 0) {
            super.onActivityResult(n, n2, intent);
            return;
        }
        final int index = n3 - 1;
        if (this.b.f == null || index < 0 || index >= this.b.f.size()) {
            Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(n));
            return;
        }
        final Fragment fragment = this.b.f.get(index);
        if (fragment == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(n));
            return;
        }
        fragment.a(0xFFFF & n, n2, intent);
    }
    
    public void onBackPressed() {
        if (!this.b.c()) {
            this.finish();
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }
    
    protected void onCreate(final Bundle bundle) {
        this.b.a(this);
        if (this.getLayoutInflater().getFactory() == null) {
            this.getLayoutInflater().setFactory((LayoutInflater$Factory)this);
        }
        super.onCreate(bundle);
        final j j = (j)this.getLastNonConfigurationInstance();
        if (j != null) {
            this.k = j.e;
        }
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            final m b = this.b;
            ArrayList d;
            if (j != null) {
                d = j.d;
            }
            else {
                d = null;
            }
            b.a(parcelable, d);
        }
        this.b.k();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            final boolean onCreatePanelMenu = super.onCreatePanelMenu(n, menu);
            final boolean a = this.b.a(menu, this.getMenuInflater());
            return Build$VERSION.SDK_INT < 11 || (onCreatePanelMenu | a);
        }
        return super.onCreatePanelMenu(n, menu);
    }
    
    public View onCreateView(String attributeValue, final Context context, final AttributeSet set) {
        final Fragment fragment = null;
        if (!"fragment".equals(attributeValue)) {
            return super.onCreateView(attributeValue, context, set);
        }
        attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v4.app.i.a);
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        final String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (false) {
            throw new NullPointerException();
        }
        if (-1 == 0 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(set.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        Fragment a = fragment;
        if (resourceId != -1) {
            a = this.b.a(resourceId);
        }
        Fragment a2;
        if ((a2 = a) == null) {
            a2 = a;
            if (string2 != null) {
                a2 = this.b.a(string2);
            }
        }
        Fragment a3;
        if ((a3 = a2) == null) {
            a3 = a2;
            if (-1 != 0) {
                a3 = this.b.a(0);
            }
        }
        if (m.a) {
            Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a3);
        }
        Fragment a4;
        if (a3 == null) {
            a4 = Fragment.a((Context)this, string);
            a4.o = true;
            int u;
            if (resourceId != 0) {
                u = resourceId;
            }
            else {
                u = 0;
            }
            a4.u = u;
            a4.v = 0;
            a4.w = string2;
            a4.p = true;
            a4.s = this.b;
            a4.a(this, set, a4.d);
            this.b.a(a4, true);
        }
        else {
            if (a3.p) {
                throw new IllegalArgumentException(set.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + string);
            }
            a3.p = true;
            if (!a3.A) {
                a3.a(this, set, a3.d);
            }
            this.b.b(a3);
            a4 = a3;
        }
        if (a4.G == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            a4.G.setId(resourceId);
        }
        if (a4.G.getTag() == null) {
            a4.G.setTag((Object)string2);
        }
        return a4.G;
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.a(false);
        this.b.r();
        if (this.l != null) {
            this.l.h();
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT < 5 && n == 4 && keyEvent.getRepeatCount() == 0) {
            this.onBackPressed();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.b.s();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        switch (n) {
            default: {
                return false;
            }
            case 0: {
                return this.b.a(menuItem);
            }
            case 6: {
                return this.b.b(menuItem);
            }
        }
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        switch (n) {
            case 0: {
                this.b.b(menu);
                break;
            }
        }
        super.onPanelClosed(n, menu);
    }
    
    protected void onPause() {
        super.onPause();
        this.d = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            this.b_();
        }
        this.b.o();
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        this.b_();
        this.b.f();
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        final boolean b = false;
        if (n == 0 && menu != null) {
            if (this.h) {
                this.h = false;
                menu.clear();
                this.onCreatePanelMenu(n, menu);
            }
            boolean b2 = b;
            if (super.onPreparePanel(n, view, menu) | this.b.a(menu)) {
                b2 = b;
                if (menu.hasVisibleItems()) {
                    b2 = true;
                }
            }
            return b2;
        }
        return super.onPreparePanel(n, view, menu);
    }
    
    protected void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.d = true;
        this.b.f();
    }
    
    public final Object onRetainNonConfigurationInstance() {
        if (this.e) {
            this.a(true);
        }
        final Object c_ = this.c_();
        final ArrayList h = this.b.h();
        int n = 0;
        int n2 = 0;
        if (this.k != null) {
            int n3 = this.k.a() - 1;
            while (true) {
                n = n2;
                if (n3 < 0) {
                    break;
                }
                final y y = (y)this.k.f(n3);
                if (y.f) {
                    n2 = 1;
                }
                else {
                    y.h();
                    this.k.d(n3);
                }
                --n3;
            }
        }
        if (h == null && n == 0 && c_ == null) {
            return null;
        }
        final j j = new j();
        j.a = null;
        j.b = c_;
        j.c = null;
        j.d = h;
        j.e = this.k;
        return j;
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Parcelable i = this.b.i();
        if (i != null) {
            bundle.putParcelable("android:support:fragments", i);
        }
    }
    
    protected void onStart() {
        super.onStart();
        this.e = false;
        this.f = false;
        this.a.removeMessages(1);
        if (!this.c) {
            this.c = true;
            this.b.l();
        }
        this.b.j();
        this.b.f();
        if (!this.j) {
            this.j = true;
            if (this.l != null) {
                this.l.b();
            }
            else if (!this.i) {
                this.l = this.a(-1, this.j, false);
            }
            this.i = true;
        }
        this.b.m();
        if (this.k != null) {
            for (int i = this.k.a() - 1; i >= 0; --i) {
                final y y = (y)this.k.f(i);
                y.e();
                y.g();
            }
        }
    }
    
    protected void onStop() {
        super.onStop();
        this.e = true;
        this.a.sendEmptyMessage(1);
        this.b.p();
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        if (n != -1 && (0xFFFF0000 & n) != 0x0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, n);
    }
}
