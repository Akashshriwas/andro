/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.FloatMath
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SoundEffectConstants
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.animation.Interpolator
 *  android.widget.Scroller
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.slidemenu.lib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ab;
import android.support.v4.view.l;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.slidemenu.lib.SlidingMenu;
import com.slidemenu.lib.b;
import com.slidemenu.lib.c;
import com.slidemenu.lib.d;
import com.slidemenu.lib.f;
import com.slidemenu.lib.n;
import com.slidemenu.lib.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
extends ViewGroup {
    private static final Interpolator e = new b();
    private float A = 0.0f;
    protected int a = -1;
    protected VelocityTracker b;
    protected int c;
    protected int d = 0;
    private View f;
    private int g;
    private Scroller h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private f s;
    private boolean t = true;
    private d u;
    private d v;
    private n w;
    private p x;
    private List y = new ArrayList();
    private boolean z = false;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(float f2, int n2, int n3) {
        int n4 = this.g;
        if (Math.abs((int)n3) <= this.r) return Math.round((float)((float)this.g + f2));
        if (Math.abs((int)n2) <= this.q) return Math.round((float)((float)this.g + f2));
        if (n2 > 0 && n3 > 0) {
            return n4 - 1;
        }
        int n5 = n4;
        if (n2 >= 0) return n5;
        n5 = n4;
        if (n3 >= 0) return n5;
        return n4 + 1;
    }

    private int a(MotionEvent motionEvent, int n2) {
        if ((n2 = android.support.v4.view.f.a(motionEvent, n2)) == -1) {
            this.a = -1;
        }
        return n2;
    }

    static /* synthetic */ f a(a a2) {
        return a2.s;
    }

    private boolean a(MotionEvent motionEvent) {
        Rect rect = new Rect();
        Iterator iterator = this.y.iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            ((View)iterator.next()).getHitRect(rect);
        } while (!rect.contains((int)motionEvent.getX(), (int)motionEvent.getY()));
        return true;
    }

    private boolean b(float f2) {
        if (this.b()) {
            return this.s.b(f2);
        }
        return this.s.a(f2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(MotionEvent motionEvent) {
        boolean bl2 = false;
        int n2 = (int)(motionEvent.getX() + this.A);
        if (this.b()) {
            return this.s.a(this.f, this.g, (float)n2);
        }
        boolean bl3 = bl2;
        switch (this.d) {
            case 2: {
                return bl3;
            }
            default: {
                return false;
            }
            case 0: {
                return this.s.b(this.f, n2);
            }
            case 1: 
        }
        bl3 = bl2;
        if (this.a(motionEvent)) return bl3;
        return true;
    }

    private void c(int n2) {
        int n3 = this.getWidth();
        int n4 = n2 / n3;
        this.a(n4, (float)n2 / (float)n3, n2 %= n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(MotionEvent motionEvent) {
        block5 : {
            block4 : {
                int n2 = this.a;
                int n3 = this.a(motionEvent, n2);
                if (n2 == -1) break block4;
                float f2 = android.support.v4.view.f.c(motionEvent, n3);
                float f3 = f2 - this.o;
                float f4 = Math.abs((float)f3);
                float f5 = android.support.v4.view.f.d(motionEvent, n3);
                float f6 = Math.abs((float)(f5 - this.p));
                n2 = this.b() ? this.m / 2 : this.m;
                if (f4 > (float)n2 && f4 > f6 && this.b(f3)) {
                    this.f();
                    this.o = f2;
                    this.p = f5;
                    this.setScrollingCacheEnabled(true);
                    return;
                }
                if (f4 > (float)this.m) break block5;
            }
            return;
        }
        this.l = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d(MotionEvent motionEvent) {
        int n2 = android.support.v4.view.f.a(motionEvent);
        if (android.support.v4.view.f.b(motionEvent, n2) == this.a) {
            n2 = n2 == 0 ? 1 : 0;
            this.o = android.support.v4.view.f.c(motionEvent, n2);
            this.a = android.support.v4.view.f.b(motionEvent, n2);
            if (this.b != null) {
                this.b.clear();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e() {
        if (this.j) {
            this.setScrollingCacheEnabled(false);
            this.h.abortAnimation();
            int n2 = this.getScrollX();
            int n3 = this.getScrollY();
            int n4 = this.h.getCurrX();
            int n5 = this.h.getCurrY();
            if (n2 != n4 || n3 != n5) {
                this.scrollTo(n4, n5);
            }
            if (this.b()) {
                if (this.x != null) {
                    this.x.a();
                }
            } else if (this.w != null) {
                this.w.a();
            }
        }
        this.j = false;
    }

    private void f() {
        this.k = true;
        this.z = false;
    }

    private void g() {
        this.z = false;
        this.k = false;
        this.l = false;
        this.a = -1;
        if (this.b != null) {
            this.b.recycle();
            this.b = null;
        }
    }

    private int getLeftBound() {
        return this.s.a(this.f);
    }

    private int getRightBound() {
        return this.s.b(this.f);
    }

    private void setScrollingCacheEnabled(boolean bl2) {
        if (this.i != bl2) {
            this.i = bl2;
        }
    }

    float a(float f2) {
        return FloatMath.sin((float)((float)((double)(f2 - 0.5f) * 0.4712389167638204)));
    }

    public int a(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 0: 
            case 2: {
                return this.s.a(this.f, n2);
            }
            case 1: 
        }
        return this.f.getLeft();
    }

    d a(d d2) {
        d d3 = this.v;
        this.v = d2;
        return d3;
    }

    void a() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        Context context = this.getContext();
        this.h = new Scroller(context, e);
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)context);
        this.m = ab.a(viewConfiguration);
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a(new c(this));
        this.r = (int)(context.getResources().getDisplayMetrics().density * 25.0f);
    }

    protected void a(int n2, float f2, int n3) {
        if (this.u != null) {
            this.u.a(n2, f2, n3);
        }
        if (this.v != null) {
            this.v.a(n2, f2, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int n2, int n3, int n4) {
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        int n5 = this.getScrollX();
        int n6 = this.getScrollY();
        int n7 = n2 - n5;
        if (n7 == 0 && (n3 -= n6) == 0) {
            this.e();
            if (this.b()) {
                if (this.x == null) return;
                {
                    this.x.a();
                    return;
                }
            } else {
                if (this.w == null) return;
                {
                    this.w.a();
                    return;
                }
            }
        }
        this.setScrollingCacheEnabled(true);
        this.j = true;
        n2 = this.getBehindWidth();
        int n8 = n2 / 2;
        float f2 = Math.min((float)1.0f, (float)((float)Math.abs((int)n7) * 1.0f / (float)n2));
        float f3 = n8;
        float f4 = n8;
        f2 = this.a(f2);
        n4 = Math.abs((int)n4);
        if (n4 > 0) {
            n2 = Math.round((float)(1000.0f * Math.abs((float)((f4 * f2 + f3) / (float)n4)))) * 4;
        } else {
            n2 = (int)(((float)Math.abs((int)n7) / (float)n2 + 1.0f) * 100.0f);
            n2 = 600;
        }
        n2 = Math.min((int)n2, (int)600);
        this.h.startScroll(n5, n6, n7, n3, n2);
        this.invalidate();
    }

    public void a(int n2, boolean bl2) {
        this.a(n2, bl2, false);
    }

    void a(int n2, boolean bl2, boolean bl3) {
        this.a(n2, bl2, bl3, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int n2, boolean bl2, boolean bl3, int n3) {
        if (!bl3 && this.g == n2) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        int n4 = this.s.a(n2);
        n2 = this.g != n4 ? 1 : 0;
        this.g = n4;
        int n5 = this.a(this.g);
        if (n2 != 0 && this.u != null) {
            this.u.a(n4);
        }
        if (n2 != 0 && this.v != null) {
            this.v.a(n4);
        }
        if (bl2) {
            this.a(n5, 0, n3);
            return;
        }
        this.e();
        this.scrollTo(n5, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) return false;
        {
            switch (keyEvent.getKeyCode()) {
                default: {
                    return false;
                }
                case 21: {
                    return this.b(17);
                }
                case 22: {
                    return this.b(66);
                }
                case 61: {
                    if (Build.VERSION.SDK_INT < 11) return false;
                    if (android.support.v4.view.a.a(keyEvent)) {
                        return this.b(2);
                    }
                    if (!android.support.v4.view.a.a(keyEvent, 1)) return false;
                    return this.b(1);
                }
            }
        }
    }

    public boolean b() {
        if (this.g != 0 && this.g != 2) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(int n2) {
        boolean bl2;
        View view;
        View view2 = view = this.findFocus();
        if (view == this) {
            view2 = null;
        }
        if ((view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view2, n2)) != null && view != view2) {
            if (n2 == 17) {
                bl2 = view.requestFocus();
            } else {
                if (n2 != 66) return false;
                bl2 = view2 != null && view.getLeft() <= view2.getLeft() ? this.d() : view.requestFocus();
            }
        } else if (n2 == 17 || n2 == 1) {
            bl2 = this.c();
        } else {
            if (n2 != 66) {
                if (n2 != 2) return false;
            }
            bl2 = this.d();
        }
        if (!bl2) return bl2;
        this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection((int)n2));
        return bl2;
    }

    boolean c() {
        if (this.g > 0) {
            this.a(this.g - 1, true);
            return true;
        }
        return false;
    }

    public void computeScroll() {
        if (!this.h.isFinished() && this.h.computeScrollOffset()) {
            int n2 = this.getScrollX();
            int n3 = this.getScrollY();
            int n4 = this.h.getCurrX();
            int n5 = this.h.getCurrY();
            if (n2 != n4 || n3 != n5) {
                this.scrollTo(n4, n5);
                this.c(n4);
            }
            this.invalidate();
            return;
        }
        this.e();
    }

    boolean d() {
        if (this.g < 1) {
            this.a(this.g + 1, true);
            return true;
        }
        return false;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.s.a(this.f, canvas);
        this.s.a(this.f, canvas, this.getPercentOpen());
        this.s.b(this.f, canvas, this.getPercentOpen());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !this.a(keyEvent)) {
            return false;
        }
        return true;
    }

    public int getBehindWidth() {
        if (this.s == null) {
            return 0;
        }
        return this.s.getBehindWidth();
    }

    public View getContent() {
        return this.f;
    }

    public int getContentLeft() {
        return this.f.getLeft() + this.f.getPaddingLeft();
    }

    public int getCurrentItem() {
        return this.g;
    }

    protected float getPercentOpen() {
        return Math.abs((float)(this.A - (float)this.f.getLeft())) / (float)this.getBehindWidth();
    }

    public int getTouchMode() {
        return this.d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent var1_1) {
        block10 : {
            if (!this.t) {
                return false;
            }
            var3_2 = var1_1.getAction() & 255;
            if (var3_2 == 3 || var3_2 == 1 || var3_2 != 0 && this.l) {
                this.g();
                return false;
            }
            switch (var3_2) {
                case 2: {
                    this.c(var1_1);
                    ** break;
                }
                case 0: {
                    var3_2 = android.support.v4.view.f.a(var1_1);
                    this.a = android.support.v4.view.f.b(var1_1, var3_2);
                    if (this.a == -1) ** GOTO lbl26
                    this.n = var2_3 = android.support.v4.view.f.c(var1_1, var3_2);
                    this.o = var2_3;
                    this.p = android.support.v4.view.f.d(var1_1, var3_2);
                    if (!this.b(var1_1)) ** GOTO lbl25
                    this.k = false;
                    this.l = false;
                    if (this.b() && this.s.b(this.f, this.g, var1_1.getX() + this.A)) {
                        this.z = true;
                        ** break;
                    }
                    ** GOTO lbl26
lbl25: // 1 sources:
                    this.l = true;
                }
lbl26: // 6 sources:
                default: {
                    break block10;
                }
                case 6: 
            }
            this.d(var1_1);
        }
        if (!this.k) {
            if (this.b == null) {
                this.b = VelocityTracker.obtain();
            }
            this.b.addMovement(var1_1);
        }
        if (this.k != false) return true;
        if (this.z == false) return false;
        return true;
    }

    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        this.f.layout(0, 0, n4 - n2, n5 - n3);
    }

    protected void onMeasure(int n2, int n3) {
        int n4 = a.getDefaultSize((int)0, (int)n2);
        int n5 = a.getDefaultSize((int)0, (int)n3);
        this.setMeasuredDimension(n4, n5);
        n2 = a.getChildMeasureSpec((int)n2, (int)0, (int)n4);
        n3 = a.getChildMeasureSpec((int)n3, (int)0, (int)n5);
        this.f.measure(n2, n3);
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        if (n2 != n4) {
            this.e();
            this.scrollTo(this.a(this.g), this.getScrollY());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        if (!this.t) {
            return false;
        }
        if (!this.k) {
            if (this.b(var1_1) == false) return false;
        }
        var5_2 = var1_1.getAction();
        if (this.b == null) {
            this.b = VelocityTracker.obtain();
        }
        this.b.addMovement(var1_1);
        switch (var5_2 & 255) {
            case 0: {
                this.e();
                this.a = android.support.v4.view.f.b(var1_1, android.support.v4.view.f.a(var1_1));
                this.n = var2_3 = var1_1.getX();
                this.o = var2_3;
                ** break;
            }
            case 2: {
                if (!this.k) {
                    this.c(var1_1);
                    if (this.l != false) return false;
                }
                if (this.k == false) return true;
                var5_2 = this.a(var1_1, this.a);
                if (this.a == -1) return true;
                var2_4 = android.support.v4.view.f.c(var1_1, var5_2);
                var3_6 = this.o;
                this.o = var2_4;
                var2_4 = (float)this.getScrollX() + (var3_6 - var2_4);
                var3_6 = this.getLeftBound();
                var4_7 = this.getRightBound();
                if (var2_4 < var3_6) {
                    var2_4 = var3_6;
                } else if (var2_4 > var4_7) {
                    var2_4 = var4_7;
                }
                this.o += var2_4 - (float)((int)var2_4);
                this.scrollTo((int)var2_4, this.getScrollY());
                this.c((int)var2_4);
                ** break;
            }
            case 1: {
                if (this.k) {
                    var7_8 = this.b;
                    var7_8.computeCurrentVelocity(1000, (float)this.c);
                    var5_2 = (int)l.a(var7_8, this.a);
                    var2_5 = (float)(this.getScrollX() - this.a(this.g)) / (float)this.getBehindWidth();
                    var6_9 = this.a(var1_1, this.a);
                    if (this.a != -1) {
                        this.a(this.a(var2_5, var5_2, (int)(android.support.v4.view.f.c(var1_1, var6_9) - this.n)), true, true, var5_2);
                    } else {
                        this.a(this.g, true, true, var5_2);
                    }
                    this.a = -1;
                    this.g();
                    ** break;
                }
                if (this.z == false) return true;
                if (this.s.b(this.f, this.g, var1_1.getX() + this.A) == false) return true;
                this.setCurrentItem(1);
                this.g();
                ** break;
            }
            case 3: {
                if (this.k == false) return true;
                this.a(this.g, true, true);
                this.a = -1;
                this.g();
                ** break;
            }
            case 5: {
                var5_2 = android.support.v4.view.f.a(var1_1);
                this.o = android.support.v4.view.f.c(var1_1, var5_2);
                this.a = android.support.v4.view.f.b(var1_1, var5_2);
            }
lbl67: // 7 sources:
            default: {
                return true;
            }
            case 6: 
        }
        this.d(var1_1);
        var5_2 = this.a(var1_1, this.a);
        if (this.a == -1) return true;
        this.o = android.support.v4.view.f.c(var1_1, var5_2);
        return true;
    }

    public void scrollTo(int n2, int n3) {
        super.scrollTo(n2, n3);
        this.A = n2;
        this.s.a(this.f, n2, n3);
        ((SlidingMenu)this.getParent()).a(this.getPercentOpen());
    }

    public void setAboveOffset(int n2) {
        this.f.setPadding(n2, this.f.getPaddingTop(), this.f.getPaddingRight(), this.f.getPaddingBottom());
    }

    public void setContent(View view) {
        if (this.f != null) {
            this.removeView(this.f);
        }
        this.f = view;
        this.addView(this.f);
    }

    public void setCurrentItem(int n2) {
        this.a(n2, true, false);
    }

    public void setCustomViewBehind(f f2) {
        this.s = f2;
    }

    public void setOnClosedListener(n n2) {
        this.w = n2;
    }

    public void setOnOpenedListener(p p2) {
        this.x = p2;
    }

    public void setOnPageChangeListener(d d2) {
        this.u = d2;
    }

    public void setSlidingEnabled(boolean bl2) {
        this.t = bl2;
    }

    public void setTouchMode(int n2) {
        this.d = n2;
    }
}

