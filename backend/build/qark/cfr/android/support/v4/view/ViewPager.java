/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.database.DataSetObserver
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SoundEffectConstants
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.animation.Interpolator
 *  android.widget.Scroller
 *  java.lang.ClassLoader
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v4.view.ViewPager$SavedState;
import android.support.v4.view.a;
import android.support.v4.view.ag;
import android.support.v4.view.ah;
import android.support.v4.view.ai;
import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.support.v4.view.al;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.f;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.q;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
extends ViewGroup {
    private static final int[] a = new int[]{16842931};
    private static final Comparator b = new ag();
    private static final Interpolator c = new ah();
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private int H;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private android.support.v4.d.a O;
    private android.support.v4.d.a P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private am U;
    private am V;
    private al W;
    private int Z;
    private final ArrayList d;
    private final aj e;
    private final Rect f;
    private k g;
    private int h;
    private int i;
    private Parcelable j;
    private ClassLoader k;
    private Scroller l;
    private an m;
    private int n;
    private Drawable o;
    private int p;
    private int q;
    private float r;
    private float s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    /*
     * Enabled aggressive block sorting
     */
    private int a(int n2, float f2, int n3, int n4) {
        if (Math.abs((int)n4) > this.L && Math.abs((int)n3) > this.J) {
            if (n3 <= 0) {
                ++n2;
            }
        } else {
            n2 = (int)((float)n2 + f2 + 0.5f);
        }
        n3 = n2;
        if (this.d.size() <= 0) return n3;
        aj aj2 = (aj)this.d.get(0);
        aj aj3 = (aj)this.d.get(this.d.size() - 1);
        return Math.max((int)aj2.b, (int)Math.min((int)n2, (int)aj3.b));
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); view instanceof ViewGroup && view != this; view = view.getParent()) {
            view = (ViewGroup)view;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            rect.bottom += view.getBottom();
        }
        return rect;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, int n3, int n4, int n5) {
        if (n3 > 0 && !this.d.isEmpty()) {
            float f2 = (float)this.getScrollX() / (float)(n3 + n5);
            n3 = (int)((float)(n2 + n4) * f2);
            this.scrollTo(n3, this.getScrollY());
            if (!this.l.isFinished()) {
                n4 = this.l.getDuration();
                n5 = this.l.timePassed();
                aj aj2 = this.b(this.h);
                this.l.startScroll(n3, 0, (int)(aj2.e * (float)n2), 0, n4 - n5);
            }
            return;
        }
        aj aj3 = this.b(this.h);
        float f3 = aj3 != null ? Math.min((float)aj3.e, (float)this.s) : 0.0f;
        if ((n2 = (int)(f3 * (float)n2)) == this.getScrollX()) return;
        this.g();
        this.scrollTo(n2, this.getScrollY());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(aj aj2, int n2, aj aj3) {
        float f2;
        float f3;
        float f4;
        int n3;
        int n4;
        int n5;
        int n6;
        block12 : {
            block15 : {
                block14 : {
                    block13 : {
                        n6 = this.g.a();
                        n3 = this.getWidth();
                        f4 = n3 > 0 ? (float)this.n / (float)n3 : 0.0f;
                        if (aj3 == null) break block12;
                        n3 = aj3.b;
                        if (n3 >= aj2.b) break block13;
                        f3 = aj3.e + aj3.d + f4;
                        ++n3;
                        n5 = 0;
                        break block14;
                    }
                    if (n3 <= aj2.b) break block12;
                    n5 = this.d.size() - 1;
                    f3 = aj3.e;
                    --n3;
                    break block15;
                }
                while (n3 <= aj2.b && n5 < this.d.size()) {
                    aj3 = (aj)this.d.get(n5);
                    do {
                        n4 = n3;
                        f2 = f3;
                        if (n3 <= aj3.b) break;
                        n4 = n3;
                        f2 = f3;
                        if (n5 >= this.d.size() - 1) break;
                        aj3 = (aj)this.d.get(++n5);
                    } while (true);
                    while (n4 < aj3.b) {
                        f2 += this.g.a(n4) + f4;
                        ++n4;
                    }
                    aj3.e = f2;
                    f3 = f2 + (aj3.d + f4);
                    n3 = n4 + 1;
                }
                break block12;
            }
            while (n3 >= aj2.b && n5 >= 0) {
                aj3 = (aj)this.d.get(n5);
                do {
                    n4 = n3;
                    f2 = f3;
                    if (n3 >= aj3.b) break;
                    n4 = n3;
                    f2 = f3;
                    if (n5 <= 0) break;
                    aj3 = (aj)this.d.get(--n5);
                } while (true);
                while (n4 > aj3.b) {
                    f2 -= this.g.a(n4) + f4;
                    --n4;
                }
                aj3.e = f3 = f2 - (aj3.d + f4);
                n3 = n4 - 1;
            }
        }
        n4 = this.d.size();
        f2 = aj2.e;
        n3 = aj2.b - 1;
        f3 = aj2.b == 0 ? aj2.e : -3.4028235E38f;
        this.r = f3;
        f3 = aj2.b == n6 - 1 ? aj2.e + aj2.d - 1.0f : Float.MAX_VALUE;
        this.s = f3;
        f3 = f2;
        for (n5 = n2 - 1; n5 >= 0; --n3, --n5) {
            aj3 = (aj)this.d.get(n5);
            while (n3 > aj3.b) {
                f3 -= this.g.a(n3) + f4;
                --n3;
            }
            aj3.e = f3 -= aj3.d + f4;
            if (aj3.b != 0) continue;
            this.r = f3;
        }
        f3 = aj2.e + aj2.d + f4;
        n5 = aj2.b + 1;
        n3 = n2 + 1;
        n2 = n5;
        do {
            if (n3 >= n4) {
                this.R = false;
                return;
            }
            aj2 = (aj)this.d.get(n3);
            while (n2 < aj2.b) {
                f3 = this.g.a(n2) + f4 + f3;
                ++n2;
            }
            if (aj2.b == n6 - 1) {
                this.s = aj2.d + f3 - 1.0f;
            }
            aj2.e = f3;
            f3 += aj2.d + f4;
            ++n2;
            ++n3;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(MotionEvent motionEvent) {
        int n2 = f.a(motionEvent);
        if (f.b(motionEvent, n2) == this.H) {
            n2 = n2 == 0 ? 1 : 0;
            this.F = f.c(motionEvent, n2);
            this.H = f.b(motionEvent, n2);
            if (this.I != null) {
                this.I.clear();
            }
        }
    }

    private boolean a(float f2, float f3) {
        if (f2 < (float)this.C && f3 > 0.0f || f2 > (float)(this.getWidth() - this.C) && f3 < 0.0f) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean b(float f2) {
        boolean bl2;
        boolean bl3 = true;
        boolean bl4 = false;
        boolean bl5 = false;
        float f3 = this.F;
        this.F = f2;
        float f4 = (float)this.getScrollX() + (f3 - f2);
        int n2 = this.getWidth();
        f2 = (float)n2 * this.r;
        f3 = n2;
        float f5 = this.s;
        aj aj2 = (aj)this.d.get(0);
        aj aj3 = (aj)this.d.get(this.d.size() - 1);
        if (aj2.b != 0) {
            f2 = aj2.e * (float)n2;
            bl2 = false;
        } else {
            bl2 = true;
        }
        if (aj3.b != this.g.a() - 1) {
            f3 = aj3.e * (float)n2;
            bl3 = false;
        } else {
            f3 *= f5;
        }
        if (f4 < f2) {
            f3 = f2;
            if (bl2) {
                bl5 = this.O.a(Math.abs((float)(f2 - f4)) / (float)n2);
                f3 = f2;
            }
        } else if (f4 > f3) {
            bl5 = bl4;
            if (bl3) {
                bl5 = this.P.a(Math.abs((float)(f4 - f3)) / (float)n2);
            }
        } else {
            f3 = f4;
        }
        this.F += f3 - (float)((int)f3);
        this.scrollTo((int)f3, this.getScrollY());
        this.d((int)f3);
        return bl5;
    }

    private boolean d(int n2) {
        boolean bl2 = false;
        if (this.d.size() == 0) {
            this.S = false;
            this.a(0, 0.0f, 0);
            if (!this.S) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else {
            aj aj2 = this.h();
            int n3 = this.getWidth();
            int n4 = this.n;
            float f2 = (float)this.n / (float)n3;
            int n5 = aj2.b;
            f2 = ((float)n2 / (float)n3 - aj2.e) / (aj2.d + f2);
            n2 = (int)((float)(n4 + n3) * f2);
            this.S = false;
            this.a(n5, f2, n2);
            if (!this.S) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            bl2 = true;
        }
        return bl2;
    }

    static /* synthetic */ int[] e() {
        return a;
    }

    private void f() {
        int n2 = 0;
        while (n2 < this.getChildCount()) {
            int n3 = n2;
            if (!((ak)this.getChildAt((int)n2).getLayoutParams()).a) {
                this.removeViewAt(n2);
                n3 = n2 - 1;
            }
            n2 = n3 + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void g() {
        int n2;
        int n3;
        int n4 = this.Z == 2 ? 1 : 0;
        if (n4 != 0) {
            this.setScrollingCacheEnabled(false);
            this.l.abortAnimation();
            n2 = this.getScrollX();
            n3 = this.getScrollY();
            int n5 = this.l.getCurrX();
            int n6 = this.l.getCurrY();
            if (n2 != n5 || n3 != n6) {
                this.scrollTo(n5, n6);
            }
            this.setScrollState(0);
        }
        this.x = false;
        n3 = 0;
        n2 = n4;
        for (n4 = n3; n4 < this.d.size(); ++n4) {
            aj aj2 = (aj)this.d.get(n4);
            if (!aj2.c) continue;
            aj2.c = false;
            n2 = 1;
        }
        if (n2 != 0) {
            this.b();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private aj h() {
        int n2 = this.getWidth();
        float f2 = n2 > 0 ? (float)this.getScrollX() / (float)n2 : 0.0f;
        float f3 = n2 > 0 ? (float)this.n / (float)n2 : 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int n3 = -1;
        n2 = 0;
        boolean bl2 = true;
        aj aj2 = null;
        do {
            aj aj3 = aj2;
            if (n2 >= this.d.size()) return aj3;
            aj aj4 = (aj)this.d.get(n2);
            if (!bl2 && aj4.b != n3 + 1) {
                aj4 = this.e;
                aj4.e = f4 + f5 + f3;
                aj4.b = n3 + 1;
                aj4.d = this.g.a(aj4.b);
                --n2;
            }
            f5 = aj4.e;
            f4 = aj4.d;
            if (!bl2) {
                aj3 = aj2;
                if (f2 < f5) return aj3;
            }
            if (f2 < f4 + f5 + f3) return aj4;
            if (n2 == this.d.size() - 1) {
                return aj4;
            }
            n3 = aj4.b;
            f4 = aj4.d;
            bl2 = false;
            ++n2;
            aj2 = aj4;
        } while (true);
    }

    private void i() {
        this.z = false;
        this.A = false;
        if (this.I != null) {
            this.I.recycle();
            this.I = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setScrollState(int n2) {
        block3 : {
            block2 : {
                if (this.Z == n2) break block2;
                this.Z = n2;
                if (this.U != null) break block3;
            }
            return;
        }
        this.U.b(n2);
    }

    private void setScrollingCacheEnabled(boolean bl2) {
        if (this.w != bl2) {
            this.w = bl2;
        }
    }

    float a(float f2) {
        return (float)Math.sin((double)((float)((double)(f2 - 0.5f) * 0.4712389167638204)));
    }

    aj a(int n2, int n3) {
        aj aj2 = new aj();
        aj2.b = n2;
        aj2.a = this.g.a(this, n2);
        aj2.d = this.g.a(n2);
        if (n3 < 0 || n3 >= this.d.size()) {
            this.d.add((Object)aj2);
            return aj2;
        }
        this.d.add(n3, (Object)aj2);
        return aj2;
    }

    aj a(View view) {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            aj aj2 = (aj)this.d.get(i2);
            if (!this.g.a(view, aj2.a)) continue;
            return aj2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    void a() {
        int n2 = this.d.size() < this.y * 2 + 1 && this.d.size() < this.g.a() ? 1 : 0;
        int n3 = this.h;
        int n4 = 0;
        int n5 = 0;
        int n6 = n2;
        n2 = n3;
        n3 = n4;
        n4 = n5;
        do {
            int n7;
            block8 : {
                block10 : {
                    block11 : {
                        Object object;
                        block6 : {
                            block9 : {
                                block7 : {
                                    if (n4 >= this.d.size()) break block6;
                                    object = (aj)this.d.get(n4);
                                    n5 = this.g.a(object.a);
                                    if (n5 != -1) break block7;
                                    n5 = n4;
                                    n7 = n3;
                                    n4 = n6;
                                    n3 = n2;
                                    n2 = n7;
                                    n6 = n5;
                                    break block8;
                                }
                                if (n5 != -2) break block9;
                                this.d.remove(n4);
                                n6 = n4 - 1;
                                n4 = n3;
                                if (n3 == 0) {
                                    this.g.a(this);
                                    n4 = 1;
                                }
                                this.g.a(this, object.b, object.a);
                                if (this.h != object.b) break block10;
                                n3 = Math.max((int)0, (int)Math.min((int)this.h, (int)(this.g.a() - 1)));
                                n2 = n4;
                                n4 = 1;
                                break block8;
                            }
                            if (object.b == n5) break block11;
                            if (object.b == this.h) {
                                n2 = n5;
                            }
                            object.b = n5;
                            n5 = n2;
                            n7 = 1;
                            n6 = n4;
                            n2 = n3;
                            n3 = n5;
                            n4 = n7;
                            break block8;
                        }
                        if (n3 != 0) {
                            this.g.b(this);
                        }
                        Collections.sort((List)this.d, (Comparator)b);
                        if (n6 != 0) {
                            n4 = this.getChildCount();
                            for (n3 = 0; n3 < n4; ++n3) {
                                object = (ak)this.getChildAt(n3).getLayoutParams();
                                if (object.a) continue;
                                object.c = 0.0f;
                            }
                            this.a(n2, false, true);
                            this.requestLayout();
                        }
                        return;
                    }
                    n5 = n2;
                    n7 = n6;
                    n6 = n4;
                    n2 = n3;
                    n3 = n5;
                    n4 = n7;
                    break block8;
                }
                n3 = n2;
                n5 = 1;
                n2 = n4;
                n4 = n5;
            }
            n5 = n4;
            n7 = n3;
            n4 = n6 + 1;
            n3 = n2;
            n2 = n7;
            n6 = n5;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    void a(int n2) {
        int n3;
        aj aj2;
        Object object;
        Object object2;
        block29 : {
            int n4;
            block28 : {
                int n5;
                float f2;
                int n6;
                int n7;
                block27 : {
                    if (this.h != n2) {
                        object = this.b(this.h);
                        this.h = n2;
                    } else {
                        object = null;
                    }
                    if (this.g == null) {
                        return;
                    }
                    if (this.x) return;
                    if (this.getWindowToken() == null) return;
                    this.g.a(this);
                    n2 = this.y;
                    n7 = Math.max((int)0, (int)(this.h - n2));
                    n6 = this.g.a();
                    n5 = Math.min((int)(n6 - 1), (int)(n2 + this.h));
                    for (n2 = 0; n2 < this.d.size(); ++n2) {
                        object2 = (aj)this.d.get(n2);
                        if (object2.b < this.h) continue;
                        if (object2.b != this.h) break;
                        break block27;
                    }
                    object2 = null;
                }
                aj2 = object2 == null && n6 > 0 ? this.a(this.h, n2) : object2;
                if (aj2 == null) break block29;
                int n8 = n2 - 1;
                object2 = n8 >= 0 ? (aj)this.d.get(n8) : null;
                float f3 = aj2.d;
                n3 = this.h;
                float f4 = 0.0f;
                int n9 = n3 - 1;
                n4 = n2;
                Object object3 = object2;
                do {
                    block33 : {
                        block31 : {
                            block32 : {
                                block30 : {
                                    if (n9 < 0) break block30;
                                    if (f4 < 2.0f - f3 || n9 >= n7) break block31;
                                    if (object3 != null) break block32;
                                }
                                f2 = aj2.d;
                                n2 = n4 + 1;
                                if (f2 < 2.0f) {
                                    object2 = n2 < this.d.size() ? (aj)this.d.get(n2) : null;
                                    n3 = this.h;
                                    ++n3;
                                    break;
                                }
                                break block28;
                            }
                            object2 = object3;
                            n2 = n8;
                            f2 = f4;
                            n3 = n4;
                            if (n9 == object3.b) {
                                object2 = object3;
                                n2 = n8;
                                f2 = f4;
                                n3 = n4;
                                if (!object3.c) {
                                    this.d.remove(n8);
                                    this.g.a(this, n9, object3.a);
                                    n2 = n8 - 1;
                                    n3 = n4 - 1;
                                    if (n2 >= 0) {
                                        object2 = (aj)this.d.get(n2);
                                        f2 = f4;
                                    } else {
                                        object2 = null;
                                        f2 = f4;
                                    }
                                }
                            }
                            break block33;
                        }
                        if (object3 != null && n9 == object3.b) {
                            f2 = f4 + object3.d;
                            n2 = n8 - 1;
                            if (n2 >= 0) {
                                object2 = (aj)this.d.get(n2);
                                n3 = n4;
                            } else {
                                object2 = null;
                                n3 = n4;
                            }
                        } else {
                            f2 = f4 + this.a((int)n9, (int)(n8 + 1)).d;
                            n3 = n4 + 1;
                            if (n8 >= 0) {
                                object2 = (aj)this.d.get(n8);
                                n2 = n8;
                            } else {
                                object2 = null;
                                n2 = n8;
                            }
                        }
                    }
                    --n9;
                    object3 = object2;
                    n8 = n2;
                    f4 = f2;
                    n4 = n3;
                } while (true);
                while (n3 < n6) {
                    if (f2 >= 2.0f && n3 > n5) {
                        if (object2 == null) break;
                        if (n3 == object2.b && !object2.c) {
                            this.d.remove(n2);
                            this.g.a(this, n3, object2.a);
                            object2 = n2 < this.d.size() ? (aj)this.d.get(n2) : null;
                        }
                    } else if (object2 != null && n3 == object2.b) {
                        f4 = object2.d;
                        object2 = ++n2 < this.d.size() ? (aj)this.d.get(n2) : null;
                        f2 += f4;
                    } else {
                        object2 = this.a(n3, n2);
                        f4 = object2.d;
                        object2 = ++n2 < this.d.size() ? (aj)this.d.get(n2) : null;
                        f2 += f4;
                    }
                    ++n3;
                }
            }
            this.a(aj2, n4, (aj)object);
        }
        object = this.g;
        n2 = this.h;
        object2 = aj2 != null ? aj2.a : null;
        object.b(this, n2, object2);
        this.g.b(this);
        n3 = this.getChildCount();
        for (n2 = 0; n2 < n3; ++n2) {
            object = this.getChildAt(n2);
            object2 = (ak)object.getLayoutParams();
            if (object2.a || object2.c != 0.0f || (object = this.a((View)object)) == null) continue;
            object2.c = object.d;
        }
        if (!this.hasFocus()) return;
        object2 = this.findFocus();
        object2 = object2 != null ? this.b((View)object2) : null;
        if (object2 != null) {
            if (object2.b == this.h) return;
        }
        n2 = 0;
        while (n2 < this.getChildCount()) {
            object2 = this.getChildAt(n2);
            object = this.a((View)object2);
            if (object != null && object.b == this.h) {
                if (object2.requestFocus(2)) return;
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void a(int n2, float f2, int n3) {
        if (this.T > 0) {
            int n4 = this.getScrollX();
            int n5 = this.getPaddingLeft();
            int n6 = this.getPaddingRight();
            int n7 = this.getWidth();
            int n8 = this.getChildCount();
            for (int i2 = 0; i2 < n8; ++i2) {
                int n9;
                int n10;
                View view = this.getChildAt(i2);
                ak ak2 = (ak)view.getLayoutParams();
                if (!ak2.a) {
                    n10 = n5;
                    n9 = n6;
                } else {
                    int n11;
                    switch (ak2.b & 7) {
                        default: {
                            n9 = n5;
                            n10 = n6;
                            n6 = n5;
                            n5 = n10;
                            break;
                        }
                        case 3: {
                            n9 = view.getWidth();
                            n10 = n9 + n5;
                            n9 = n5;
                            n5 = n6;
                            n6 = n10;
                            break;
                        }
                        case 1: {
                            n9 = Math.max((int)((n7 - view.getMeasuredWidth()) / 2), (int)n5);
                            n10 = n5;
                            n5 = n6;
                            n6 = n10;
                            break;
                        }
                        case 5: {
                            n9 = n7 - n6 - view.getMeasuredWidth();
                            n11 = view.getMeasuredWidth();
                            n10 = n5;
                            n5 = n6 + n11;
                            n6 = n10;
                        }
                    }
                    n11 = n9 + n4 - view.getLeft();
                    n9 = n5;
                    n10 = n6;
                    if (n11 != 0) {
                        view.offsetLeftAndRight(n11);
                        n9 = n5;
                        n10 = n6;
                    }
                }
                n5 = n10;
                n6 = n9;
            }
        }
        if (this.U != null) {
            this.U.a(n2, f2, n3);
        }
        if (this.V != null) {
            this.V.a(n2, f2, n3);
        }
        this.S = true;
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
            this.g();
            this.b();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        n2 = this.getWidth();
        int n8 = n2 / 2;
        float f2 = Math.min((float)1.0f, (float)((float)Math.abs((int)n7) * 1.0f / (float)n2));
        float f3 = n8;
        float f4 = n8;
        f2 = this.a(f2);
        n4 = Math.abs((int)n4);
        if (n4 > 0) {
            n2 = Math.round((float)(1000.0f * Math.abs((float)((f4 * f2 + f3) / (float)n4)))) * 4;
        } else {
            f3 = n2;
            f4 = this.g.a(this.h);
            n2 = (int)(((float)Math.abs((int)n7) / (f3 * f4 + (float)this.n) + 1.0f) * 100.0f);
        }
        n2 = Math.min((int)n2, (int)600);
        this.l.startScroll(n5, n6, n7, n3, n2);
        q.b((View)this);
    }

    public void a(int n2, boolean bl2) {
        this.x = false;
        this.a(n2, bl2, false);
    }

    void a(int n2, boolean bl2, boolean bl3) {
        this.a(n2, bl2, bl3, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int n2, boolean bl2, boolean bl3, int n3) {
        int n4;
        int n5;
        if (this.g == null || this.g.a() <= 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (!bl3 && this.h == n2 && this.d.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (n2 < 0) {
            n4 = 0;
        } else {
            n4 = n2;
            if (n2 >= this.g.a()) {
                n4 = this.g.a() - 1;
            }
        }
        if (n4 > this.h + (n2 = this.y) || n4 < this.h - n2) {
            for (n2 = 0; n2 < this.d.size(); ++n2) {
                ((aj)this.d.get((int)n2)).c = true;
            }
        }
        n2 = this.h != n4 ? 1 : 0;
        this.a(n4);
        aj aj2 = this.b(n4);
        if (aj2 != null) {
            float f2 = this.getWidth();
            n5 = (int)(Math.max((float)this.r, (float)Math.min((float)aj2.e, (float)this.s)) * f2);
        } else {
            n5 = 0;
        }
        if (bl2) {
            this.a(n5, 0, n3);
            if (n2 != 0 && this.U != null) {
                this.U.a(n4);
            }
            if (n2 == 0 || this.V == null) return;
            {
                this.V.a(n4);
                return;
            }
        }
        if (n2 != 0 && this.U != null) {
            this.U.a(n4);
        }
        if (n2 != 0 && this.V != null) {
            this.V.a(n4);
        }
        this.g();
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
                    return this.c(17);
                }
                case 22: {
                    return this.c(66);
                }
                case 61: {
                    if (Build.VERSION.SDK_INT < 11) return false;
                    if (a.a(keyEvent)) {
                        return this.c(2);
                    }
                    if (!a.a(keyEvent, 1)) return false;
                    return this.c(1);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean a(View view, boolean bl2, int n2, int n3, int n4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n5 = view.getScrollX();
            int n6 = view.getScrollY();
            for (int i2 = viewGroup.getChildCount() - 1; i2 >= 0; --i2) {
                View view2 = viewGroup.getChildAt(i2);
                if (n3 + n5 >= view2.getLeft() && n3 + n5 < view2.getRight() && n4 + n6 >= view2.getTop() && n4 + n6 < view2.getBottom() && this.a(view2, true, n2, n3 + n5 - view2.getLeft(), n4 + n6 - view2.getTop())) return true;
                {
                    continue;
                }
            }
        }
        if (!bl2 || !q.a(view, - n2)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void addFocusables(ArrayList arrayList, int n2, int n3) {
        int n4 = arrayList.size();
        int n5 = this.getDescendantFocusability();
        if (n5 != 393216) {
            for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
                aj aj2;
                View view = this.getChildAt(i2);
                if (view.getVisibility() != 0 || (aj2 = this.a(view)) == null || aj2.b != this.h) continue;
                view.addFocusables(arrayList, n2, n3);
            }
        }
        if (n5 == 262144 && n4 != arrayList.size() || !this.isFocusable() || (n3 & 1) == 1 && this.isInTouchMode() && !this.isFocusableInTouchMode() || arrayList == null) {
            return;
        }
        arrayList.add((Object)this);
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            aj aj2;
            View view = this.getChildAt(i2);
            if (view.getVisibility() != 0 || (aj2 = this.a(view)) == null || aj2.b != this.h) continue;
            view.addTouchables(arrayList);
        }
    }

    public void addView(View view, int n2, ViewGroup.LayoutParams layoutParams) {
        if (!this.checkLayoutParams(layoutParams)) {
            layoutParams = this.generateLayoutParams(layoutParams);
        }
        ak ak2 = (ak)layoutParams;
        ak2.a |= view instanceof ai;
        if (this.v) {
            if (ak2 != null && ak2.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            ak2.d = true;
            this.addViewInLayout(view, n2, layoutParams);
            return;
        }
        super.addView(view, n2, layoutParams);
    }

    aj b(int n2) {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            aj aj2 = (aj)this.d.get(i2);
            if (aj2.b != n2) continue;
            return aj2;
        }
        return null;
    }

    aj b(View view) {
        ViewParent viewParent;
        while ((viewParent = view.getParent()) != this) {
            if (viewParent == null || !(viewParent instanceof View)) {
                return null;
            }
            view = (View)viewParent;
        }
        return this.a(view);
    }

    void b() {
        this.a(this.h);
    }

    boolean c() {
        if (this.h > 0) {
            this.a(this.h - 1, true);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean c(int n2) {
        boolean bl2;
        View view;
        View view2 = view = this.findFocus();
        if (view == this) {
            view2 = null;
        }
        if ((view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view2, n2)) != null && view != view2) {
            if (n2 == 17) {
                int n3 = this.a((Rect)this.f, (View)view).left;
                int n4 = this.a((Rect)this.f, (View)view2).left;
                bl2 = view2 != null && n3 >= n4 ? this.c() : view.requestFocus();
            } else {
                if (n2 != 66) return false;
                int n5 = this.a((Rect)this.f, (View)view).left;
                int n6 = this.a((Rect)this.f, (View)view2).left;
                bl2 = view2 != null && n5 <= n6 ? this.d() : view.requestFocus();
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

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ak && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void computeScroll() {
        if (!this.l.isFinished() && this.l.computeScrollOffset()) {
            int n2 = this.getScrollX();
            int n3 = this.getScrollY();
            int n4 = this.l.getCurrX();
            int n5 = this.l.getCurrY();
            if (n2 != n4 || n3 != n5) {
                this.scrollTo(n4, n5);
                if (!this.d(n4)) {
                    this.l.abortAnimation();
                    this.scrollTo(0, n5);
                }
            }
            q.b((View)this);
            return;
        }
        this.g();
    }

    boolean d() {
        if (this.g != null && this.h < this.g.a() - 1) {
            this.a(this.h + 1, true);
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || this.a(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean bl2 = false;
        int n2 = this.getChildCount();
        int n3 = 0;
        do {
            block4 : {
                boolean bl3;
                block3 : {
                    aj aj2;
                    bl3 = bl2;
                    if (n3 >= n2) break block3;
                    View view = this.getChildAt(n3);
                    if (view.getVisibility() != 0 || (aj2 = this.a(view)) == null || aj2.b != this.h || !view.dispatchPopulateAccessibilityEvent(accessibilityEvent)) break block4;
                    bl3 = true;
                }
                return bl3;
            }
            ++n3;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int n2 = 0;
        int n3 = 0;
        int n4 = q.a((View)this);
        if (n4 == 0 || n4 == 1 && this.g != null && this.g.a() > 1) {
            if (!this.O.a()) {
                n2 = canvas.save();
                n3 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                n4 = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(- n3 + this.getPaddingTop()), this.r * (float)n4);
                this.O.a(n3, n4);
                n3 = false | this.O.a(canvas);
                canvas.restoreToCount(n2);
            }
            n2 = n3;
            if (!this.P.a()) {
                n4 = canvas.save();
                n2 = this.getWidth();
                int n5 = this.getHeight();
                int n6 = this.getPaddingTop();
                int n7 = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(- this.getPaddingTop()), (- this.s + 1.0f) * (float)n2);
                this.P.a(n5 - n6 - n7, n2);
                n2 = n3 | this.P.a(canvas);
                canvas.restoreToCount(n4);
            }
        } else {
            this.O.b();
            this.P.b();
        }
        if (n2 != 0) {
            q.b((View)this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(this.getDrawableState());
        }
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ak();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ak(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return this.generateDefaultLayoutParams();
    }

    public k getAdapter() {
        return this.g;
    }

    public int getCurrentItem() {
        return this.h;
    }

    public int getOffscreenPageLimit() {
        return this.y;
    }

    public int getPageMargin() {
        return this.n;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n <= 0) return;
        if (this.o == null) return;
        if (this.d.size() <= 0) return;
        if (this.g == null) return;
        int n2 = this.getScrollX();
        int n3 = this.getWidth();
        float f2 = (float)this.n / (float)n3;
        aj aj2 = (aj)this.d.get(0);
        float f3 = aj2.e;
        int n4 = this.d.size();
        int n5 = aj2.b;
        int n6 = ((aj)this.d.get((int)(n4 - 1))).b;
        int n7 = 0;
        while (n5 < n6) {
            float f4;
            while (n5 > aj2.b && n7 < n4) {
                aj2 = this.d;
                aj2 = (aj)aj2.get(++n7);
            }
            if (n5 == aj2.b) {
                f4 = (aj2.e + aj2.d) * (float)n3;
                f3 = aj2.e + aj2.d + f2;
            } else {
                float f5 = this.g.a(n5);
                f4 = (f3 + f5) * (float)n3;
                f3 += f5 + f2;
            }
            if ((float)this.n + f4 > (float)n2) {
                this.o.setBounds((int)f4, this.p, (int)((float)this.n + f4 + 0.5f), this.q);
                this.o.draw(canvas);
            }
            if (f4 > (float)(n2 + n3)) {
                return;
            }
            ++n5;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent var1_1) {
        block16 : {
            var7_2 = var1_1.getAction() & 255;
            if (var7_2 == 3 || var7_2 == 1) {
                this.z = false;
                this.A = false;
                this.H = -1;
                if (this.I == null) return false;
                this.I.recycle();
                this.I = null;
                return false;
            }
            if (var7_2 != 0) {
                if (this.z) {
                    return true;
                }
                if (this.A != false) return false;
            }
            switch (var7_2) {
                case 2: {
                    var7_2 = this.H;
                    if (var7_2 != -1) {
                        var7_2 = f.a(var1_1, var7_2);
                        var3_3 = f.c(var1_1, var7_2);
                        var2_4 = var3_3 - this.F;
                        var4_6 = Math.abs((float)var2_4);
                        var5_7 = f.d(var1_1, var7_2);
                        var6_8 = Math.abs((float)(var5_7 - this.G));
                        if (var2_4 != 0.0f && !this.a(this.F, var2_4) && this.a((View)this, false, (int)var2_4, (int)var3_3, (int)var5_7)) {
                            this.F = var3_3;
                            this.E = var3_3;
                            this.G = var5_7;
                            this.A = true;
                            return false;
                        }
                        if (var4_6 > (float)this.D && var4_6 > var6_8) {
                            this.z = true;
                            this.setScrollState(1);
                            var2_4 = var2_4 > 0.0f ? this.E + (float)this.D : this.E - (float)this.D;
                            this.F = var2_4;
                            this.setScrollingCacheEnabled(true);
                        } else if (var6_8 > (float)this.D) {
                            this.A = true;
                        }
                        if (this.z && this.b(var3_3)) {
                            q.b((View)this);
                            ** break;
                        }
                    }
                    ** GOTO lbl59
                }
                case 0: {
                    this.E = var2_5 = var1_1.getX();
                    this.F = var2_5;
                    this.G = var1_1.getY();
                    this.H = f.b(var1_1, 0);
                    this.A = false;
                    this.l.computeScrollOffset();
                    if (this.Z == 2 && Math.abs((int)(this.l.getFinalX() - this.l.getCurrX())) > this.M) {
                        this.l.abortAnimation();
                        this.x = false;
                        this.b();
                        this.z = true;
                        this.setScrollState(1);
                        ** break;
                    }
                    this.g();
                    this.z = false;
                }
lbl59: // 5 sources:
                default: {
                    break block16;
                }
                case 6: 
            }
            this.a(var1_1);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(var1_1);
        return this.z;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        this.v = true;
        this.b();
        this.v = false;
        int n6 = this.getChildCount();
        int n7 = n4 - n2;
        int n8 = n5 - n3;
        n3 = this.getPaddingLeft();
        n2 = this.getPaddingTop();
        n5 = this.getPaddingRight();
        n4 = this.getPaddingBottom();
        int n9 = this.getScrollX();
        int n10 = 0;
        int n11 = 0;
        do {
            int n12;
            int n13;
            block18 : {
                block17 : {
                    ak ak2;
                    View view;
                    block16 : {
                        int n14;
                        if (n11 >= n6) break block16;
                        view = this.getChildAt(n11);
                        if (view.getVisibility() == 8) break block17;
                        ak2 = (ak)view.getLayoutParams();
                        if (!ak2.a) break block17;
                        n13 = ak2.b;
                        int n15 = ak2.b;
                        switch (n13 & 7) {
                            default: {
                                n13 = n3;
                                n12 = n3;
                                break;
                            }
                            case 3: {
                                n12 = view.getMeasuredWidth();
                                n13 = n3;
                                n12 += n3;
                                break;
                            }
                            case 1: {
                                n13 = Math.max((int)((n7 - view.getMeasuredWidth()) / 2), (int)n3);
                                n12 = n3;
                                break;
                            }
                            case 5: {
                                n12 = view.getMeasuredWidth();
                                n13 = n5 + view.getMeasuredWidth();
                                n14 = n7 - n5 - n12;
                                n5 = n13;
                                n12 = n3;
                                n13 = n14;
                            }
                        }
                        switch (n15 & 112) {
                            default: {
                                n14 = n2;
                                n3 = n2;
                                n2 = n4;
                                n4 = n14;
                                break;
                            }
                            case 48: {
                                n14 = view.getMeasuredHeight();
                                n3 = n4;
                                n4 = n2;
                                n2 = n3;
                                n3 = n14 += n2;
                                break;
                            }
                            case 16: {
                                n14 = Math.max((int)((n8 - view.getMeasuredHeight()) / 2), (int)n2);
                                n3 = n2;
                                n2 = n4;
                                n4 = n14;
                                break;
                            }
                            case 80: {
                                n14 = n8 - n4 - view.getMeasuredHeight();
                                n15 = view.getMeasuredHeight();
                                n3 = n2;
                                n2 = n4 + n15;
                                n4 = n14;
                            }
                        }
                        view.layout(n13, n4, view.getMeasuredWidth() + (n13 += n9), view.getMeasuredHeight() + n4);
                        n4 = n12;
                        n13 = n2;
                        n2 = ++n10;
                        break block18;
                    }
                    n13 = 0;
                    do {
                        if (n13 >= n6) {
                            this.p = n2;
                            this.q = n8 - n4;
                            this.T = n10;
                            this.Q = false;
                            return;
                        }
                        view = this.getChildAt(n13);
                        if (view.getVisibility() != 8) {
                            aj aj2;
                            ak2 = (ak)view.getLayoutParams();
                            if (!ak2.a && (aj2 = this.a(view)) != null) {
                                float f2 = n7;
                                n12 = (int)(aj2.e * f2) + n3;
                                if (ak2.d) {
                                    ak2.d = false;
                                    f2 = n7 - n3 - n5;
                                    view.measure(View.MeasureSpec.makeMeasureSpec((int)((int)(ak2.c * f2)), (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)(n8 - n2 - n4), (int)1073741824));
                                }
                                view.layout(n12, n2, view.getMeasuredWidth() + n12, view.getMeasuredHeight() + n2);
                            }
                        }
                        ++n13;
                    } while (true);
                }
                n13 = n10;
                n10 = n2;
                n12 = n3;
                n2 = n13;
                n13 = n4;
                n3 = n10;
                n4 = n12;
            }
            ++n11;
            n12 = n4;
            n10 = n2;
            n2 = n3;
            n4 = n13;
            n3 = n12;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void onMeasure(int var1_1, int var2_2) {
        this.setMeasuredDimension(ViewPager.getDefaultSize((int)0, (int)var1_1), ViewPager.getDefaultSize((int)0, (int)var2_2));
        var1_1 = this.getMeasuredWidth();
        this.C = Math.min((int)(var1_1 / 10), (int)this.B);
        var1_1 = var1_1 - this.getPaddingLeft() - this.getPaddingRight();
        var2_2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        var12_3 = this.getChildCount();
        var6_4 = 0;
        do {
            block12 : {
                block14 : {
                    block13 : {
                        block11 : {
                            if (var6_4 >= var12_3) break block11;
                            var13_12 = this.getChildAt(var6_4);
                            var4_5 = var1_1;
                            var5_6 = var2_2;
                            if (var13_12.getVisibility() == 8) break block12;
                            var14_13 = (ak)var13_12.getLayoutParams();
                            var4_5 = var1_1;
                            var5_6 = var2_2;
                            if (var14_13 == null) break block12;
                            var4_5 = var1_1;
                            var5_6 = var2_2;
                            if (!var14_13.a) break block12;
                            var4_5 = var14_13.b & 7;
                            var7_7 = var14_13.b & 112;
                            var9_9 = Integer.MIN_VALUE;
                            var5_6 = Integer.MIN_VALUE;
                            var7_7 = var7_7 == 48 || var7_7 == 80 ? 1 : 0;
                            var8_8 = var4_5 == 3 || var4_5 == 5;
                            if (var7_7 != 0) {
                                var4_5 = 1073741824;
                            } else {
                                var4_5 = var9_9;
                                if (var8_8) {
                                    var5_6 = 1073741824;
                                    var4_5 = var9_9;
                                }
                            }
                            if (var14_13.width == -2) break block13;
                            var9_9 = 1073741824;
                            var4_5 = var14_13.width != -1 ? var14_13.width : var1_1;
                            break block14;
                        }
                        this.t = View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)1073741824);
                        this.u = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)1073741824);
                        this.v = true;
                        this.b();
                        this.v = false;
                        var4_5 = this.getChildCount();
                        var2_2 = 0;
                        while (var2_2 < var4_5) {
                            var13_12 = this.getChildAt(var2_2);
                            if (!(var13_12.getVisibility() == 8 || (var14_13 = (ak)var13_12.getLayoutParams()) != null && var14_13.a)) {
                                var3_14 = var1_1;
                                var13_12.measure(View.MeasureSpec.makeMeasureSpec((int)((int)(var14_13.c * var3_14)), (int)1073741824), this.u);
                            }
                            ++var2_2;
                        }
                        return;
                    }
                    var9_9 = var4_5;
                    var4_5 = var1_1;
                }
                if (var14_13.height == -2) ** GOTO lbl-1000
                var5_6 = var10_10 = 1073741824;
                if (var14_13.height != -1) {
                    var11_11 = var14_13.height;
                    var5_6 = var10_10;
                    var10_10 = var11_11;
                } else lbl-1000: // 2 sources:
                {
                    var10_10 = var2_2;
                }
                var13_12.measure(View.MeasureSpec.makeMeasureSpec((int)var4_5, (int)var9_9), View.MeasureSpec.makeMeasureSpec((int)var10_10, (int)var5_6));
                if (var7_7 != 0) {
                    var5_6 = var2_2 - var13_12.getMeasuredHeight();
                    var4_5 = var1_1;
                } else {
                    var4_5 = var1_1;
                    var5_6 = var2_2;
                    if (var8_8) {
                        var4_5 = var1_1 - var13_12.getMeasuredWidth();
                        var5_6 = var2_2;
                    }
                }
            }
            ++var6_4;
            var1_1 = var4_5;
            var2_2 = var5_6;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onRequestFocusInDescendants(int n2, Rect rect) {
        int n3;
        int n4 = -1;
        int n5 = this.getChildCount();
        if ((n2 & 2) != 0) {
            n4 = 1;
            n3 = 0;
        } else {
            n3 = n5 - 1;
            n5 = -1;
        }
        while (n3 != n5) {
            aj aj2;
            View view = this.getChildAt(n3);
            if (view.getVisibility() == 0 && (aj2 = this.a(view)) != null && aj2.b == this.h && view.requestFocus(n2, rect)) {
                return true;
            }
            n3 += n4;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState((Parcelable)object);
            return;
        }
        object = (ViewPager$SavedState)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        if (this.g != null) {
            this.g.a(object.b, object.c);
            this.a(object.a, false, true);
            return;
        }
        this.i = object.a;
        this.j = object.b;
        this.k = object.c;
    }

    public Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.a = this.h;
        if (this.g != null) {
            viewPager$SavedState.b = this.g.b();
        }
        return viewPager$SavedState;
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        if (n2 != n4) {
            this.a(n2, n4, this.n, this.n);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        var6_2 = 0;
        if (this.N) {
            return true;
        }
        if (var1_1.getAction() == 0 && var1_1.getEdgeFlags() != 0) {
            return false;
        }
        if (this.g == null) return false;
        if (this.g.a() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(var1_1);
        var5_3 = var6_2;
        switch (var1_1.getAction() & 255) {
            default: {
                var5_3 = var6_2;
                break;
            }
            case 0: {
                this.l.abortAnimation();
                this.x = false;
                this.b();
                this.z = true;
                this.setScrollState(1);
                this.E = var2_4 = var1_1.getX();
                this.F = var2_4;
                this.H = f.b(var1_1, 0);
                var5_3 = var6_2;
                break;
            }
            case 2: {
                if (!this.z) {
                    var5_3 = f.a(var1_1, this.H);
                    var2_5 = f.c(var1_1, var5_3);
                    var3_6 = Math.abs((float)(var2_5 - this.F));
                    var4_7 = Math.abs((float)(f.d(var1_1, var5_3) - this.G));
                    if (var3_6 > (float)this.D && var3_6 > var4_7) {
                        this.z = true;
                        var2_5 = var2_5 - this.E > 0.0f ? this.E + (float)this.D : this.E - (float)this.D;
                        this.F = var2_5;
                        this.setScrollState(1);
                        this.setScrollingCacheEnabled(true);
                    }
                }
                var5_3 = var6_2;
                if (this.z) {
                    var5_3 = false | this.b(f.c(var1_1, f.a(var1_1, this.H)));
                    break;
                }
                ** GOTO lbl77
            }
            case 1: {
                var5_3 = var6_2;
                if (this.z) {
                    var9_8 = this.I;
                    var9_8.computeCurrentVelocity(1000, (float)this.K);
                    var5_3 = (int)l.a((VelocityTracker)var9_8, this.H);
                    this.x = true;
                    var6_2 = this.getWidth();
                    var7_9 = this.getScrollX();
                    var9_8 = this.h();
                    this.a(this.a(var9_8.b, ((float)var7_9 / (float)var6_2 - var9_8.e) / var9_8.d, var5_3, (int)(f.c(var1_1, f.a(var1_1, this.H)) - this.E)), true, true, var5_3);
                    this.H = -1;
                    this.i();
                    var8_10 = this.O.c();
                    var5_3 = this.P.c() | var8_10;
                    break;
                }
                ** GOTO lbl77
            }
            case 3: {
                var5_3 = var6_2;
                if (this.z) {
                    this.a(this.h, true, true);
                    this.H = -1;
                    this.i();
                    var8_11 = this.O.c();
                    var5_3 = this.P.c() | var8_11;
                    break;
                }
                ** GOTO lbl77
            }
            case 5: {
                var5_3 = f.a(var1_1);
                this.F = f.c(var1_1, var5_3);
                this.H = f.b(var1_1, var5_3);
                var5_3 = var6_2;
            }
lbl77: // 5 sources:
            case 4: {
                break;
            }
            case 6: {
                this.a(var1_1);
                this.F = f.c(var1_1, f.a(var1_1, this.H));
                var5_3 = var6_2;
            }
        }
        if (var5_3 == 0) return true;
        q.b((View)this);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setAdapter(k k2) {
        Object object;
        if (this.g != null) {
            this.g.b(this.m);
            this.g.a(this);
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                object = (aj)this.d.get(i2);
                this.g.a(this, object.b, object.a);
            }
            this.g.b(this);
            this.d.clear();
            this.f();
            this.h = 0;
            this.scrollTo(0, 0);
        }
        object = this.g;
        this.g = k2;
        if (this.g != null) {
            if (this.m == null) {
                this.m = new an(this, null);
            }
            this.g.a(this.m);
            this.x = false;
            this.Q = true;
            if (this.i >= 0) {
                this.g.a(this.j, this.k);
                this.a(this.i, false, true);
                this.i = -1;
                this.j = null;
                this.k = null;
            } else {
                this.b();
            }
        }
        if (this.W != null && object != k2) {
            this.W.a((k)object, k2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setCurrentItem(int n2) {
        this.x = false;
        boolean bl2 = !this.Q;
        this.a(n2, bl2, false);
    }

    public void setOffscreenPageLimit(int n2) {
        int n3 = n2;
        if (n2 < 1) {
            Log.w((String)"ViewPager", (String)("Requested offscreen page limit " + n2 + " too small; defaulting to " + 1));
            n3 = 1;
        }
        if (n3 != this.y) {
            this.y = n3;
            this.b();
        }
    }

    void setOnAdapterChangeListener(al al2) {
        this.W = al2;
    }

    public void setOnPageChangeListener(am am2) {
        this.U = am2;
    }

    public void setPageMargin(int n2) {
        int n3 = this.n;
        this.n = n2;
        int n4 = this.getWidth();
        this.a(n4, n4, n2, n3);
        this.requestLayout();
    }

    public void setPageMarginDrawable(int n2) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPageMarginDrawable(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            this.refreshDrawableState();
        }
        boolean bl2 = drawable == null;
        this.setWillNotDraw(bl2);
        this.invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.o) {
            return true;
        }
        return false;
    }
}

