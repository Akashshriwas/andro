// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.support.v4.view.l;
import android.graphics.Canvas;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.support.v4.view.ab;
import android.view.ViewConfiguration;
import android.util.FloatMath;
import java.util.Iterator;
import android.graphics.Rect;
import android.view.MotionEvent;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.widget.Scroller;
import android.view.View;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

public class a extends ViewGroup
{
    private static final Interpolator e;
    private float A;
    protected int a;
    protected VelocityTracker b;
    protected int c;
    protected int d;
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
    private boolean t;
    private d u;
    private d v;
    private n w;
    private p x;
    private List y;
    private boolean z;
    
    static {
        e = (Interpolator)new b();
    }
    
    public a(final Context context) {
        this(context, null);
    }
    
    public a(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = -1;
        this.t = true;
        this.y = new ArrayList();
        this.d = 0;
        this.z = false;
        this.A = 0.0f;
        this.a();
    }
    
    private int a(final float n, final int a, final int a2) {
        final int g = this.g;
        if (Math.abs(a2) > this.r && Math.abs(a) > this.q) {
            int n2;
            if (a > 0 && a2 > 0) {
                n2 = g - 1;
            }
            else {
                n2 = g;
                if (a < 0) {
                    n2 = g;
                    if (a2 < 0) {
                        return g + 1;
                    }
                }
            }
            return n2;
        }
        return Math.round(this.g + n);
    }
    
    private int a(final MotionEvent motionEvent, int a) {
        a = android.support.v4.view.f.a(motionEvent, a);
        if (a == -1) {
            this.a = -1;
        }
        return a;
    }
    
    private boolean a(final MotionEvent motionEvent) {
        final Rect rect = new Rect();
        final Iterator<View> iterator = this.y.iterator();
        while (iterator.hasNext()) {
            iterator.next().getHitRect(rect);
            if (rect.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }
    
    private boolean b(final float n) {
        if (this.b()) {
            return this.s.b(n);
        }
        return this.s.a(n);
    }
    
    private boolean b(final MotionEvent motionEvent) {
        final boolean b = false;
        final int n = (int)(motionEvent.getX() + this.A);
        boolean a;
        if (this.b()) {
            a = this.s.a(this.f, this.g, (float)n);
        }
        else {
            a = b;
            switch (this.d) {
                case 2: {
                    break;
                }
                default: {
                    return false;
                }
                case 0: {
                    return this.s.b(this.f, n);
                }
                case 1: {
                    a = b;
                    if (!this.a(motionEvent)) {
                        return true;
                    }
                    break;
                }
            }
        }
        return a;
    }
    
    private void c(int n) {
        final int width = this.getWidth();
        final int n2 = n / width;
        n %= width;
        this.a(n2, n / (float)width, n);
    }
    
    private void c(final MotionEvent motionEvent) {
        final int a = this.a;
        final int a2 = this.a(motionEvent, a);
        if (a != -1) {
            final float c = android.support.v4.view.f.c(motionEvent, a2);
            final float a3 = c - this.o;
            final float abs = Math.abs(a3);
            final float d = android.support.v4.view.f.d(motionEvent, a2);
            final float abs2 = Math.abs(d - this.p);
            int m;
            if (this.b()) {
                m = this.m / 2;
            }
            else {
                m = this.m;
            }
            if (abs > m && abs > abs2 && this.b(a3)) {
                this.f();
                this.o = c;
                this.p = d;
                this.setScrollingCacheEnabled(true);
                return;
            }
            if (abs > this.m) {
                this.l = true;
            }
        }
    }
    
    private void d(final MotionEvent motionEvent) {
        final int a = android.support.v4.view.f.a(motionEvent);
        if (android.support.v4.view.f.b(motionEvent, a) == this.a) {
            int n;
            if (a == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.o = android.support.v4.view.f.c(motionEvent, n);
            this.a = android.support.v4.view.f.b(motionEvent, n);
            if (this.b != null) {
                this.b.clear();
            }
        }
    }
    
    private void e() {
        if (this.j) {
            this.setScrollingCacheEnabled(false);
            this.h.abortAnimation();
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.h.getCurrX();
            final int currY = this.h.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
            }
            if (this.b()) {
                if (this.x != null) {
                    this.x.a();
                }
            }
            else if (this.w != null) {
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
    
    private void setScrollingCacheEnabled(final boolean i) {
        if (this.i != i) {
            this.i = i;
        }
    }
    
    float a(final float n) {
        return FloatMath.sin((float)((n - 0.5f) * 0.4712389167638204));
    }
    
    public int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 0:
            case 2: {
                return this.s.a(this.f, n);
            }
            case 1: {
                return this.f.getLeft();
            }
        }
    }
    
    d a(final d v) {
        final d v2 = this.v;
        this.v = v;
        return v2;
    }
    
    void a() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        final Context context = this.getContext();
        this.h = new Scroller(context, com.slidemenu.lib.a.e);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.m = ab.a(value);
        this.q = value.getScaledMinimumFlingVelocity();
        this.c = value.getScaledMaximumFlingVelocity();
        this.a(new c(this));
        this.r = (int)(context.getResources().getDisplayMetrics().density * 25.0f);
    }
    
    protected void a(final int n, final float n2, final int n3) {
        if (this.u != null) {
            this.u.a(n, n2, n3);
        }
        if (this.v != null) {
            this.v.a(n, n2, n3);
        }
    }
    
    void a(int a, int n, int abs) {
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
        }
        else {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int n2 = a - scrollX;
            n -= scrollY;
            if (n2 != 0 || n != 0) {
                this.setScrollingCacheEnabled(true);
                this.j = true;
                a = this.getBehindWidth();
                final int n3 = a / 2;
                final float min = Math.min(1.0f, Math.abs(n2) * 1.0f / a);
                final float n4 = (float)n3;
                final float n5 = (float)n3;
                final float a2 = this.a(min);
                abs = Math.abs(abs);
                if (abs > 0) {
                    a = Math.round(1000.0f * Math.abs((n5 * a2 + n4) / abs)) * 4;
                }
                else {
                    a = (int)((Math.abs(n2) / (float)a + 1.0f) * 100.0f);
                    a = 600;
                }
                a = Math.min(a, 600);
                this.h.startScroll(scrollX, scrollY, n2, n, a);
                this.invalidate();
                return;
            }
            this.e();
            if (this.b()) {
                if (this.x != null) {
                    this.x.a();
                }
            }
            else if (this.w != null) {
                this.w.a();
            }
        }
    }
    
    public void a(final int n, final boolean b) {
        this.a(n, b, false);
    }
    
    void a(final int n, final boolean b, final boolean b2) {
        this.a(n, b, b2, 0);
    }
    
    void a(int n, final boolean b, final boolean b2, final int n2) {
        if (!b2 && this.g == n) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        final int a = this.s.a(n);
        if (this.g != a) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.g = a;
        final int a2 = this.a(this.g);
        if (n != 0 && this.u != null) {
            this.u.a(a);
        }
        if (n != 0 && this.v != null) {
            this.v.a(a);
        }
        if (b) {
            this.a(a2, 0, n2);
            return;
        }
        this.e();
        this.scrollTo(a2, 0);
    }
    
    public boolean a(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 21: {
                    return this.b(17);
                }
                case 22: {
                    return this.b(66);
                }
                case 61: {
                    if (Build$VERSION.SDK_INT < 11) {
                        break;
                    }
                    if (android.support.v4.view.a.a(keyEvent)) {
                        return this.b(2);
                    }
                    if (android.support.v4.view.a.a(keyEvent, 1)) {
                        return this.b(1);
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public boolean b() {
        return this.g == 0 || this.g == 2;
    }
    
    public boolean b(final int n) {
        View focus;
        if ((focus = this.findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, n);
        while (true) {
            Label_0142: {
                boolean b;
                if (nextFocus != null && nextFocus != focus) {
                    if (n == 17) {
                        b = nextFocus.requestFocus();
                    }
                    else {
                        if (n != 66) {
                            break Label_0142;
                        }
                        if (focus != null && nextFocus.getLeft() <= focus.getLeft()) {
                            b = this.d();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                }
                else if (n == 17 || n == 1) {
                    b = this.c();
                }
                else {
                    if (n != 66 && n != 2) {
                        break Label_0142;
                    }
                    b = this.d();
                }
                if (b) {
                    this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
                }
                return b;
            }
            boolean b = false;
            continue;
        }
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
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.h.getCurrX();
            final int currY = this.h.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                this.c(currX);
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
    
    protected void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        this.s.a(this.f, canvas);
        this.s.a(this.f, canvas, this.getPercentOpen());
        this.s.b(this.f, canvas, this.getPercentOpen());
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.a(keyEvent);
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
        return Math.abs(this.A - this.f.getLeft()) / this.getBehindWidth();
    }
    
    public int getTouchMode() {
        return this.d;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.t) {
            final int n = motionEvent.getAction() & 0xFF;
            if (n == 3 || n == 1 || (n != 0 && this.l)) {
                this.g();
                return false;
            }
            switch (n) {
                case 2: {
                    this.c(motionEvent);
                    break;
                }
                case 0: {
                    final int a = android.support.v4.view.f.a(motionEvent);
                    this.a = android.support.v4.view.f.b(motionEvent, a);
                    if (this.a == -1) {
                        break;
                    }
                    final float c = android.support.v4.view.f.c(motionEvent, a);
                    this.n = c;
                    this.o = c;
                    this.p = android.support.v4.view.f.d(motionEvent, a);
                    if (!this.b(motionEvent)) {
                        this.l = true;
                        break;
                    }
                    this.k = false;
                    this.l = false;
                    if (this.b() && this.s.b(this.f, this.g, motionEvent.getX() + this.A)) {
                        this.z = true;
                        break;
                    }
                    break;
                }
                case 6: {
                    this.d(motionEvent);
                    break;
                }
            }
            if (!this.k) {
                if (this.b == null) {
                    this.b = VelocityTracker.obtain();
                }
                this.b.addMovement(motionEvent);
            }
            if (this.k || this.z) {
                return true;
            }
        }
        return false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.f.layout(0, 0, n3 - n, n4 - n2);
    }
    
    protected void onMeasure(int childMeasureSpec, int childMeasureSpec2) {
        final int defaultSize = getDefaultSize(0, childMeasureSpec);
        final int defaultSize2 = getDefaultSize(0, childMeasureSpec2);
        this.setMeasuredDimension(defaultSize, defaultSize2);
        childMeasureSpec = getChildMeasureSpec(childMeasureSpec, 0, defaultSize);
        childMeasureSpec2 = getChildMeasureSpec(childMeasureSpec2, 0, defaultSize2);
        this.f.measure(childMeasureSpec, childMeasureSpec2);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.e();
            this.scrollTo(this.a(this.g), this.getScrollY());
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.t && (this.k || this.b(motionEvent))) {
            final int action = motionEvent.getAction();
            if (this.b == null) {
                this.b = VelocityTracker.obtain();
            }
            this.b.addMovement(motionEvent);
            switch (action & 0xFF) {
                case 0: {
                    this.e();
                    this.a = android.support.v4.view.f.b(motionEvent, android.support.v4.view.f.a(motionEvent));
                    final float x = motionEvent.getX();
                    this.n = x;
                    this.o = x;
                    break;
                }
                case 2: {
                    if (!this.k) {
                        this.c(motionEvent);
                        if (this.l) {
                            return false;
                        }
                    }
                    if (!this.k) {
                        break;
                    }
                    final int a = this.a(motionEvent, this.a);
                    if (this.a != -1) {
                        final float c = android.support.v4.view.f.c(motionEvent, a);
                        final float o = this.o;
                        this.o = c;
                        float n = this.getScrollX() + (o - c);
                        final float n2 = (float)this.getLeftBound();
                        final float n3 = (float)this.getRightBound();
                        if (n < n2) {
                            n = n2;
                        }
                        else if (n > n3) {
                            n = n3;
                        }
                        this.o += n - (int)n;
                        this.scrollTo((int)n, this.getScrollY());
                        this.c((int)n);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.k) {
                        final VelocityTracker b = this.b;
                        b.computeCurrentVelocity(1000, (float)this.c);
                        final int n4 = (int)android.support.v4.view.l.a(b, this.a);
                        final float n5 = (this.getScrollX() - this.a(this.g)) / (float)this.getBehindWidth();
                        final int a2 = this.a(motionEvent, this.a);
                        if (this.a != -1) {
                            this.a(this.a(n5, n4, (int)(android.support.v4.view.f.c(motionEvent, a2) - this.n)), true, true, n4);
                        }
                        else {
                            this.a(this.g, true, true, n4);
                        }
                        this.a = -1;
                        this.g();
                        break;
                    }
                    if (this.z && this.s.b(this.f, this.g, motionEvent.getX() + this.A)) {
                        this.setCurrentItem(1);
                        this.g();
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.k) {
                        this.a(this.g, true, true);
                        this.a = -1;
                        this.g();
                        break;
                    }
                    break;
                }
                case 5: {
                    final int a3 = android.support.v4.view.f.a(motionEvent);
                    this.o = android.support.v4.view.f.c(motionEvent, a3);
                    this.a = android.support.v4.view.f.b(motionEvent, a3);
                    break;
                }
                case 6: {
                    this.d(motionEvent);
                    final int a4 = this.a(motionEvent, this.a);
                    if (this.a != -1) {
                        this.o = android.support.v4.view.f.c(motionEvent, a4);
                        break;
                    }
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    public void scrollTo(final int n, final int n2) {
        super.scrollTo(n, n2);
        this.A = (float)n;
        this.s.a(this.f, n, n2);
        ((SlidingMenu)this.getParent()).a(this.getPercentOpen());
    }
    
    public void setAboveOffset(final int n) {
        this.f.setPadding(n, this.f.getPaddingTop(), this.f.getPaddingRight(), this.f.getPaddingBottom());
    }
    
    public void setContent(final View f) {
        if (this.f != null) {
            this.removeView(this.f);
        }
        this.addView(this.f = f);
    }
    
    public void setCurrentItem(final int n) {
        this.a(n, true, false);
    }
    
    public void setCustomViewBehind(final f s) {
        this.s = s;
    }
    
    public void setOnClosedListener(final n w) {
        this.w = w;
    }
    
    public void setOnOpenedListener(final p x) {
        this.x = x;
    }
    
    public void setOnPageChangeListener(final d u) {
        this.u = u;
    }
    
    public void setSlidingEnabled(final boolean t) {
        this.t = t;
    }
    
    public void setTouchMode(final int d) {
        this.d = d;
    }
}
