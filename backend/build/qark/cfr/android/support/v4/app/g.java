/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.a;
import android.support.v4.app.h;
import android.support.v4.app.i;
import android.support.v4.app.j;
import android.support.v4.app.k;
import android.support.v4.app.m;
import android.support.v4.app.y;
import android.support.v4.c.c;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class g
extends Activity {
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

    y a(int n2, boolean bl2, boolean bl3) {
        y y2;
        if (this.k == null) {
            this.k = new c();
        }
        if ((y2 = (y)this.k.a(n2)) == null) {
            if (bl3) {
                y2 = new y(this, bl2);
                this.k.b(n2, y2);
            }
            return y2;
        }
        y2.a(this);
        return y2;
    }

    void a(int n2) {
        y y2;
        if (this.k != null && (y2 = (y)this.k.a(n2)) != null && !y2.f) {
            y2.h();
            this.k.c(n2);
        }
    }

    public void a(Fragment fragment) {
    }

    public void a(Fragment fragment, Intent intent, int n2) {
        if (n2 == -1) {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((-65536 & n2) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, (fragment.f + 1 << 16) + (65535 & n2));
    }

    void a(boolean bl2) {
        if (!this.f) {
            this.f = true;
            this.g = bl2;
            this.a.removeMessages(1);
            this.d();
        }
    }

    protected void b_() {
        this.b.n();
    }

    public void c() {
        if (Build.VERSION.SDK_INT >= 11) {
            a.a(this);
            return;
        }
        this.h = true;
    }

    public Object c_() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    void d() {
        if (this.j) {
            this.j = false;
            if (this.l != null) {
                if (!this.g) {
                    this.l.c();
                } else {
                    this.l.d();
                }
            }
        }
        this.b.q();
    }

    public void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        if (Build.VERSION.SDK_INT >= 11) {
            // empty if block
        }
        printWriter.print(string);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)((Object)this))));
        printWriter.println(" State:");
        String string2 = string + "  ";
        printWriter.print(string2);
        printWriter.print("mCreated=");
        printWriter.print(this.c);
        printWriter.print("mResumed=");
        printWriter.print(this.d);
        printWriter.print(" mStopped=");
        printWriter.print(this.e);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f);
        printWriter.print(string2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.l != null) {
            printWriter.print(string);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)this.l)));
            printWriter.println(":");
            this.l.a(string + "  ", fileDescriptor, printWriter, arrstring);
        }
        this.b.a(string, fileDescriptor, printWriter, arrstring);
    }

    public k e() {
        return this.b;
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        int n4 = n2 >> 16;
        if (n4 != 0) {
            if (this.b.f == null || n4 < 0 || --n4 >= this.b.f.size()) {
                Log.w((String)"FragmentActivity", (String)("Activity result fragment index out of range: 0x" + Integer.toHexString((int)n2)));
                return;
            }
            Fragment fragment = (Fragment)this.b.f.get(n4);
            if (fragment == null) {
                Log.w((String)"FragmentActivity", (String)("Activity result no fragment exists for index: 0x" + Integer.toHexString((int)n2)));
                return;
            }
            fragment.a(65535 & n2, n3, intent);
            return;
        }
        super.onActivityResult(n2, n3, intent);
    }

    public void onBackPressed() {
        if (!this.b.c()) {
            this.finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onCreate(Bundle bundle) {
        this.b.a(this);
        if (this.getLayoutInflater().getFactory() == null) {
            this.getLayoutInflater().setFactory((LayoutInflater.Factory)this);
        }
        super.onCreate(bundle);
        j j2 = (j)this.getLastNonConfigurationInstance();
        if (j2 != null) {
            this.k = j2.e;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            m m2 = this.b;
            bundle = j2 != null ? j2.d : null;
            m2.a(parcelable, (ArrayList)bundle);
        }
        this.b.k();
    }

    public boolean onCreatePanelMenu(int n2, Menu menu) {
        if (n2 == 0) {
            boolean bl2 = super.onCreatePanelMenu(n2, menu);
            boolean bl3 = this.b.a(menu, this.getMenuInflater());
            if (Build.VERSION.SDK_INT >= 11) {
                return bl2 | bl3;
            }
            return true;
        }
        return super.onCreatePanelMenu(n2, menu);
    }

    /*
     * Enabled aggressive block sorting
     */
    public View onCreateView(String object, Context object2, AttributeSet attributeSet) {
        Object var7_4 = null;
        if (!"fragment".equals(object)) {
            return super.onCreateView((String)object, (Context)object2, attributeSet);
        }
        object = attributeSet.getAttributeValue(null, "class");
        object2 = object2.obtainStyledAttributes(attributeSet, i.a);
        Object object3 = object;
        if (object == null) {
            object3 = object2.getString(0);
        }
        int n2 = object2.getResourceId(1, -1);
        String string = object2.getString(2);
        object2.recycle();
        if (false) {
            throw new NullPointerException();
        }
        if (-1 == 0 && n2 == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + (String)object3);
        }
        object2 = var7_4;
        if (n2 != -1) {
            object2 = this.b.a(n2);
        }
        object = object2;
        if (object2 == null) {
            object = object2;
            if (string != null) {
                object = this.b.a(string);
            }
        }
        object2 = object;
        if (object == null) {
            object2 = object;
            if (-1 != 0) {
                object2 = this.b.a(0);
            }
        }
        if (m.a) {
            Log.v((String)"FragmentActivity", (String)("onCreateView: id=0x" + Integer.toHexString((int)n2) + " fname=" + (String)object3 + " existing=" + object2));
        }
        if (object2 == null) {
            object = Fragment.a((Context)this, (String)object3);
            object.o = true;
            int n3 = n2 != 0 ? n2 : 0;
            object.u = n3;
            object.v = 0;
            object.w = string;
            object.p = true;
            object.s = this.b;
            object.a(this, attributeSet, object.d);
            this.b.a((Fragment)object, true);
        } else {
            if (object2.p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString((int)n2) + ", tag " + string + ", or parent id 0x" + Integer.toHexString((int)0) + " with another fragment for " + (String)object3);
            }
            object2.p = true;
            if (!object2.A) {
                object2.a(this, attributeSet, object2.d);
            }
            this.b.b((Fragment)object2);
            object = object2;
        }
        if (object.G == null) {
            throw new IllegalStateException("Fragment " + (String)object3 + " did not create a view.");
        }
        if (n2 != 0) {
            object.G.setId(n2);
        }
        if (object.G.getTag() == null) {
            object.G.setTag((Object)string);
        }
        return object.G;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.a(false);
        this.b.r();
        if (this.l != null) {
            this.l.h();
        }
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 5 && n2 == 4 && keyEvent.getRepeatCount() == 0) {
            this.onBackPressed();
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.s();
    }

    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        switch (n2) {
            default: {
                return false;
            }
            case 0: {
                return this.b.a(menuItem);
            }
            case 6: 
        }
        return this.b.b(menuItem);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onPanelClosed(int n2, Menu menu) {
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                this.b.b(menu);
            }
        }
        super.onPanelClosed(n2, menu);
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

    public boolean onPreparePanel(int n2, View view, Menu menu) {
        boolean bl2 = false;
        if (n2 == 0 && menu != null) {
            if (this.h) {
                this.h = false;
                menu.clear();
                this.onCreatePanelMenu(n2, menu);
            }
            boolean bl3 = bl2;
            if (super.onPreparePanel(n2, view, menu) | this.b.a(menu)) {
                bl3 = bl2;
                if (menu.hasVisibleItems()) {
                    bl3 = true;
                }
            }
            return bl3;
        }
        return super.onPreparePanel(n2, view, menu);
    }

    protected void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.d = true;
        this.b.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object onRetainNonConfigurationInstance() {
        Object object;
        if (this.e) {
            this.a(true);
        }
        Object object2 = this.c_();
        ArrayList arrayList = this.b.h();
        boolean bl2 = false;
        boolean bl3 = false;
        if (this.k != null) {
            int n2 = this.k.a() - 1;
            do {
                bl2 = bl3;
                if (n2 < 0) break;
                object = (y)this.k.f(n2);
                if (object.f) {
                    bl3 = true;
                } else {
                    object.h();
                    this.k.d(n2);
                }
                --n2;
            } while (true);
        }
        if (arrayList == null && !bl2 && object2 == null) {
            return null;
        }
        object = new j();
        object.a = null;
        object.b = object2;
        object.c = null;
        object.d = arrayList;
        object.e = this.k;
        return object;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable parcelable = this.b.i();
        if (parcelable != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
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
            } else if (!this.i) {
                this.l = this.a(-1, this.j, false);
            }
            this.i = true;
        }
        this.b.m();
        if (this.k != null) {
            for (int i2 = this.k.a() - 1; i2 >= 0; --i2) {
                y y2 = (y)this.k.f(i2);
                y2.e();
                y2.g();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        this.e = true;
        this.a.sendEmptyMessage(1);
        this.b.p();
    }

    public void startActivityForResult(Intent intent, int n2) {
        if (n2 != -1 && (-65536 & n2) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, n2);
    }
}

