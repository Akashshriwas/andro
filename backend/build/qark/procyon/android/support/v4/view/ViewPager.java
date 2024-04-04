// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.util.Log;
import android.database.DataSetObserver;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import java.util.List;
import java.util.Collections;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.Rect;
import java.util.ArrayList;
import android.support.v4.d.a;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    private static final int[] a;
    private static final Comparator b;
    private static final Interpolator c;
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
    private a O;
    private a P;
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
    
    static {
        a = new int[] { 16842931 };
        b = new ag();
        c = (Interpolator)new ah();
    }
    
    private int a(int a, final float n, int max, final int a2) {
        if (Math.abs(a2) > this.L && Math.abs(max) > this.J) {
            if (max <= 0) {
                ++a;
            }
        }
        else {
            a = (int)(a + n + 0.5f);
        }
        max = a;
        if (this.d.size() > 0) {
            max = Math.max(this.d.get(0).b, Math.min(a, this.d.get(this.d.size() - 1).b));
        }
        return max;
    }
    
    private Rect a(Rect rect, final View view) {
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
        ViewPager viewPager;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = viewPager.getParent()) {
            viewPager = (ViewPager)viewParent;
            rect.left += viewPager.getLeft();
            rect.right += viewPager.getRight();
            rect.top += viewPager.getTop();
            rect.bottom += viewPager.getBottom();
        }
        return rect;
    }
    
    private void a(int n, int n2, int duration, int timePassed) {
        if (n2 > 0 && !this.d.isEmpty()) {
            n2 = (int)((n + duration) * (this.getScrollX() / (float)(n2 + timePassed)));
            this.scrollTo(n2, this.getScrollY());
            if (!this.l.isFinished()) {
                duration = this.l.getDuration();
                timePassed = this.l.timePassed();
                this.l.startScroll(n2, 0, (int)(this.b(this.h).e * n), 0, duration - timePassed);
            }
        }
        else {
            final aj b = this.b(this.h);
            float min;
            if (b != null) {
                min = Math.min(b.e, this.s);
            }
            else {
                min = 0.0f;
            }
            n *= (int)min;
            if (n != this.getScrollX()) {
                this.g();
                this.scrollTo(n, this.getScrollY());
            }
        }
    }
    
    private void a(aj aj, int i, aj aj2) {
        final int a = this.g.a();
        final int width = this.getWidth();
        float n;
        if (width > 0) {
            n = this.n / (float)width;
        }
        else {
            n = 0.0f;
        }
        if (aj2 != null) {
            final int b = aj2.b;
            if (b < aj.b) {
                float n2 = aj2.e + aj2.d + n;
                int j;
                for (int n3 = b + 1, n4 = 0; n3 <= aj.b && n4 < this.d.size(); n3 = j + 1) {
                    aj2 = (aj)this.d.get(n4);
                    float e;
                    while (true) {
                        j = n3;
                        e = n2;
                        if (n3 <= aj2.b) {
                            break;
                        }
                        j = n3;
                        e = n2;
                        if (n4 >= this.d.size() - 1) {
                            break;
                        }
                        ++n4;
                        aj2 = (aj)this.d.get(n4);
                    }
                    while (j < aj2.b) {
                        e += this.g.a(j) + n;
                        ++j;
                    }
                    aj2.e = e;
                    n2 = e + (aj2.d + n);
                }
            }
            else if (b > aj.b) {
                int n5 = this.d.size() - 1;
                float e2 = aj2.e;
                int k;
                for (int n6 = b - 1; n6 >= aj.b && n5 >= 0; n6 = k - 1) {
                    aj2 = (aj)this.d.get(n5);
                    float n7;
                    while (true) {
                        k = n6;
                        n7 = e2;
                        if (n6 >= aj2.b) {
                            break;
                        }
                        k = n6;
                        n7 = e2;
                        if (n5 <= 0) {
                            break;
                        }
                        --n5;
                        aj2 = (aj)this.d.get(n5);
                    }
                    while (k > aj2.b) {
                        n7 -= this.g.a(k) + n;
                        --k;
                    }
                    e2 = n7 - (aj2.d + n);
                    aj2.e = e2;
                }
            }
        }
        final int size = this.d.size();
        final float e3 = aj.e;
        int l = aj.b - 1;
        float e4;
        if (aj.b == 0) {
            e4 = aj.e;
        }
        else {
            e4 = -3.4028235E38f;
        }
        this.r = e4;
        float s;
        if (aj.b == a - 1) {
            s = aj.e + aj.d - 1.0f;
        }
        else {
            s = Float.MAX_VALUE;
        }
        this.s = s;
        int index = i - 1;
        float n8 = e3;
        while (index >= 0) {
            for (aj2 = (aj)this.d.get(index); l > aj2.b; --l) {
                n8 -= this.g.a(l) + n;
            }
            n8 -= aj2.d + n;
            aj2.e = n8;
            if (aj2.b == 0) {
                this.r = n8;
            }
            --l;
            --index;
        }
        float e5 = aj.e + aj.d + n;
        final int n9 = aj.b + 1;
        int index2 = i + 1;
        i = n9;
        while (index2 < size) {
            for (aj = (aj)this.d.get(index2); i < aj.b; ++i) {
                e5 += this.g.a(i) + n;
            }
            if (aj.b == a - 1) {
                this.s = aj.d + e5 - 1.0f;
            }
            aj.e = e5;
            e5 += aj.d + n;
            ++i;
            ++index2;
        }
        this.R = false;
    }
    
    private void a(final MotionEvent motionEvent) {
        final int a = android.support.v4.view.f.a(motionEvent);
        if (android.support.v4.view.f.b(motionEvent, a) == this.H) {
            int n;
            if (a == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.F = android.support.v4.view.f.c(motionEvent, n);
            this.H = android.support.v4.view.f.b(motionEvent, n);
            if (this.I != null) {
                this.I.clear();
            }
        }
    }
    
    private boolean a(final float n, final float n2) {
        return (n < this.C && n2 > 0.0f) || (n > this.getWidth() - this.C && n2 < 0.0f);
    }
    
    private boolean b(float f) {
        boolean b = true;
        final boolean b2 = false;
        boolean b3 = false;
        final float f2 = this.F;
        this.F = f;
        final float n = this.getScrollX() + (f2 - f);
        final int width = this.getWidth();
        f = width * this.r;
        final float n2 = (float)width;
        final float s = this.s;
        final aj aj = this.d.get(0);
        final aj aj2 = this.d.get(this.d.size() - 1);
        int n3;
        if (aj.b != 0) {
            f = aj.e * width;
            n3 = 0;
        }
        else {
            n3 = 1;
        }
        float n4;
        if (aj2.b != this.g.a() - 1) {
            n4 = aj2.e * width;
            b = false;
        }
        else {
            n4 = n2 * s;
        }
        if (n < f) {
            n4 = f;
            if (n3 != 0) {
                b3 = this.O.a(Math.abs(f - n) / width);
                n4 = f;
            }
        }
        else if (n > n4) {
            b3 = b2;
            if (b) {
                b3 = this.P.a(Math.abs(n - n4) / width);
            }
        }
        else {
            n4 = n;
        }
        this.F += n4 - (int)n4;
        this.scrollTo((int)n4, this.getScrollY());
        this.d((int)n4);
        return b3;
    }
    
    private boolean d(int n) {
        boolean b = false;
        if (this.d.size() == 0) {
            this.S = false;
            this.a(0, 0.0f, 0);
            if (!this.S) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        }
        else {
            final aj h = this.h();
            final int width = this.getWidth();
            final int n2 = this.n;
            final float n3 = this.n / (float)width;
            final int b2 = h.b;
            final float n4 = (n / (float)width - h.e) / (h.d + n3);
            n = (int)((n2 + width) * n4);
            this.S = false;
            this.a(b2, n4, n);
            if (!this.S) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            b = true;
        }
        return b;
    }
    
    private void f() {
        int n;
        for (int i = 0; i < this.getChildCount(); i = n + 1) {
            n = i;
            if (!((ak)this.getChildAt(i).getLayoutParams()).a) {
                this.removeViewAt(i);
                n = i - 1;
            }
        }
    }
    
    private void g() {
        boolean b;
        if (this.Z == 2) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            this.setScrollingCacheEnabled(false);
            this.l.abortAnimation();
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.l.getCurrX();
            final int currY = this.l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
            }
            this.setScrollState(0);
        }
        this.x = false;
        final int n = 0;
        int n2 = b ? 1 : 0;
        for (int i = n; i < this.d.size(); ++i) {
            final aj aj = this.d.get(i);
            if (aj.c) {
                aj.c = false;
                n2 = 1;
            }
        }
        if (n2 != 0) {
            this.b();
        }
    }
    
    private aj h() {
        final int width = this.getWidth();
        float n;
        if (width > 0) {
            n = this.getScrollX() / (float)width;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (width > 0) {
            n2 = this.n / (float)width;
        }
        else {
            n2 = 0.0f;
        }
        float d = 0.0f;
        float e = 0.0f;
        int b = -1;
        int index = 0;
        int n3 = 1;
        aj aj = null;
        aj aj2;
        while (true) {
            aj2 = aj;
            if (index >= this.d.size()) {
                break;
            }
            aj e2 = this.d.get(index);
            if (n3 == 0 && e2.b != b + 1) {
                e2 = this.e;
                e2.e = d + e + n2;
                e2.b = b + 1;
                e2.d = this.g.a(e2.b);
                --index;
            }
            e = e2.e;
            final float d2 = e2.d;
            if (n3 == 0) {
                aj2 = aj;
                if (n < e) {
                    break;
                }
            }
            if (n < d2 + e + n2 || index == this.d.size() - 1) {
                aj2 = e2;
                break;
            }
            b = e2.b;
            d = e2.d;
            n3 = 0;
            ++index;
            aj = e2;
        }
        return aj2;
    }
    
    private void i() {
        this.z = false;
        this.A = false;
        if (this.I != null) {
            this.I.recycle();
            this.I = null;
        }
    }
    
    private void setScrollState(final int z) {
        if (this.Z != z) {
            this.Z = z;
            if (this.U != null) {
                this.U.b(z);
            }
        }
    }
    
    private void setScrollingCacheEnabled(final boolean w) {
        if (this.w != w) {
            this.w = w;
        }
    }
    
    float a(final float n) {
        return (float)Math.sin((float)((n - 0.5f) * 0.4712389167638204));
    }
    
    aj a(final int b, final int index) {
        final aj aj = new aj();
        aj.b = b;
        aj.a = this.g.a(this, b);
        aj.d = this.g.a(b);
        if (index < 0 || index >= this.d.size()) {
            this.d.add(aj);
            return aj;
        }
        this.d.add(index, aj);
        return aj;
    }
    
    aj a(final View view) {
        for (int i = 0; i < this.d.size(); ++i) {
            final aj aj = this.d.get(i);
            if (this.g.a(view, aj.a)) {
                return aj;
            }
        }
        return null;
    }
    
    void a() {
        int n;
        if (this.d.size() < this.y * 2 + 1 && this.d.size() < this.g.a()) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int h = this.h;
        final boolean b = false;
        final int n2 = 0;
        int n3 = n;
        int n4 = h;
        int n5 = b ? 1 : 0;
        int n9;
        int n10;
        int n15;
        int n16;
        for (int i = n2; i < this.d.size(); i = n10 + 1, n5 = n9, n4 = n16, n3 = n15) {
            final aj aj = this.d.get(i);
            final int a = this.g.a(aj.a);
            int n8;
            int max;
            if (a == -1) {
                final int n6 = i;
                final int n7 = n5;
                n8 = n3;
                max = n4;
                n9 = n7;
                n10 = n6;
            }
            else if (a == -2) {
                this.d.remove(i);
                n10 = i - 1;
                int n11;
                if ((n11 = n5) == 0) {
                    this.g.a(this);
                    n11 = 1;
                }
                this.g.a(this, aj.b, aj.a);
                if (this.h == aj.b) {
                    max = Math.max(0, Math.min(this.h, this.g.a() - 1));
                    n9 = n11;
                    n8 = 1;
                }
                else {
                    max = n4;
                    final boolean b2 = true;
                    n9 = n11;
                    n8 = (b2 ? 1 : 0);
                }
            }
            else if (aj.b != a) {
                if (aj.b == this.h) {
                    n4 = a;
                }
                aj.b = a;
                final int n12 = n4;
                final boolean b3 = true;
                n10 = i;
                n9 = n5;
                max = n12;
                n8 = (b3 ? 1 : 0);
            }
            else {
                final int n13 = n4;
                final int n14 = n3;
                n10 = i;
                n9 = n5;
                max = n13;
                n8 = n14;
            }
            n15 = n8;
            n16 = max;
        }
        if (n5 != 0) {
            this.g.b(this);
        }
        Collections.sort((List<Object>)this.d, ViewPager.b);
        if (n3 != 0) {
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final ak ak = (ak)this.getChildAt(j).getLayoutParams();
                if (!ak.a) {
                    ak.c = 0.0f;
                }
            }
            this.a(n4, false, true);
            this.requestLayout();
        }
    }
    
    void a(int i) {
        aj b;
        if (this.h != i) {
            b = this.b(this.h);
            this.h = i;
        }
        else {
            b = null;
        }
        if (this.g != null && !this.x && this.getWindowToken() != null) {
            this.g.a(this);
            i = this.y;
            final int max = Math.max(0, this.h - i);
            final int a = this.g.a();
            final int min = Math.min(a - 1, i + this.h);
            i = 0;
            while (true) {
                while (i < this.d.size()) {
                    final aj aj = this.d.get(i);
                    if (aj.b >= this.h) {
                        if (aj.b != this.h) {
                            break;
                        }
                        aj a2;
                        if (aj == null && a > 0) {
                            a2 = this.a(this.h, i);
                        }
                        else {
                            a2 = aj;
                        }
                        if (a2 != null) {
                            int index = i - 1;
                            aj aj2;
                            if (index >= 0) {
                                aj2 = this.d.get(index);
                            }
                            else {
                                aj2 = null;
                            }
                            final float d = a2.d;
                            final int h = this.h;
                            float n = 0.0f;
                            int j = h - 1;
                            int n2 = i;
                            aj aj3 = aj2;
                            while (j >= 0) {
                                aj aj4;
                                float n3;
                                int n4;
                                if (n >= 2.0f - d && j < max) {
                                    if (aj3 == null) {
                                        break;
                                    }
                                    aj4 = aj3;
                                    i = index;
                                    n3 = n;
                                    n4 = n2;
                                    if (j == aj3.b) {
                                        aj4 = aj3;
                                        i = index;
                                        n3 = n;
                                        n4 = n2;
                                        if (!aj3.c) {
                                            this.d.remove(index);
                                            this.g.a(this, j, aj3.a);
                                            i = index - 1;
                                            n4 = n2 - 1;
                                            if (i >= 0) {
                                                aj4 = this.d.get(i);
                                                n3 = n;
                                            }
                                            else {
                                                aj4 = null;
                                                n3 = n;
                                            }
                                        }
                                    }
                                }
                                else if (aj3 != null && j == aj3.b) {
                                    n3 = n + aj3.d;
                                    i = index - 1;
                                    if (i >= 0) {
                                        aj4 = this.d.get(i);
                                        n4 = n2;
                                    }
                                    else {
                                        aj4 = null;
                                        n4 = n2;
                                    }
                                }
                                else {
                                    n3 = n + this.a(j, index + 1).d;
                                    n4 = n2 + 1;
                                    if (index >= 0) {
                                        aj4 = this.d.get(index);
                                        i = index;
                                    }
                                    else {
                                        aj4 = null;
                                        i = index;
                                    }
                                }
                                --j;
                                aj3 = aj4;
                                index = i;
                                n = n3;
                                n2 = n4;
                            }
                            float d2 = a2.d;
                            i = n2 + 1;
                            if (d2 < 2.0f) {
                                aj aj5;
                                if (i < this.d.size()) {
                                    aj5 = this.d.get(i);
                                }
                                else {
                                    aj5 = null;
                                }
                                for (int k = this.h + 1; k < a; ++k) {
                                    if (d2 >= 2.0f && k > min) {
                                        if (aj5 == null) {
                                            break;
                                        }
                                        if (k == aj5.b && !aj5.c) {
                                            this.d.remove(i);
                                            this.g.a(this, k, aj5.a);
                                            if (i < this.d.size()) {
                                                aj5 = this.d.get(i);
                                            }
                                            else {
                                                aj5 = null;
                                            }
                                        }
                                    }
                                    else if (aj5 != null && k == aj5.b) {
                                        final float d3 = aj5.d;
                                        ++i;
                                        if (i < this.d.size()) {
                                            aj5 = this.d.get(i);
                                        }
                                        else {
                                            aj5 = null;
                                        }
                                        d2 += d3;
                                    }
                                    else {
                                        final aj a3 = this.a(k, i);
                                        ++i;
                                        final float d4 = a3.d;
                                        if (i < this.d.size()) {
                                            aj5 = this.d.get(i);
                                        }
                                        else {
                                            aj5 = null;
                                        }
                                        d2 += d4;
                                    }
                                }
                            }
                            this.a(a2, n2, b);
                        }
                        final k g = this.g;
                        i = this.h;
                        Object a4;
                        if (a2 != null) {
                            a4 = a2.a;
                        }
                        else {
                            a4 = null;
                        }
                        g.b(this, i, a4);
                        this.g.b(this);
                        int childCount;
                        View child;
                        ak ak;
                        aj a5;
                        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                            child = this.getChildAt(i);
                            ak = (ak)child.getLayoutParams();
                            if (!ak.a && ak.c == 0.0f) {
                                a5 = this.a(child);
                                if (a5 != null) {
                                    ak.c = a5.d;
                                }
                            }
                        }
                        if (!this.hasFocus()) {
                            return;
                        }
                        final View focus = this.findFocus();
                        aj b2;
                        if (focus != null) {
                            b2 = this.b(focus);
                        }
                        else {
                            b2 = null;
                        }
                        if (b2 == null || b2.b != this.h) {
                            View child2;
                            aj a6;
                            for (i = 0; i < this.getChildCount(); ++i) {
                                child2 = this.getChildAt(i);
                                a6 = this.a(child2);
                                if (a6 != null && a6.b == this.h && child2.requestFocus(2)) {
                                    break;
                                }
                            }
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final aj aj = null;
                continue;
            }
        }
    }
    
    protected void a(final int n, final float n2, final int n3) {
        if (this.T > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            int n4;
            int n5;
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i, paddingLeft = n4, paddingRight = n5) {
                final View child = this.getChildAt(i);
                final ak ak = (ak)child.getLayoutParams();
                if (!ak.a) {
                    n4 = paddingLeft;
                    n5 = paddingRight;
                }
                else {
                    int max = 0;
                    int n7 = 0;
                    int n8 = 0;
                    switch (ak.b & 0x7) {
                        default: {
                            max = paddingLeft;
                            final int n6 = paddingRight;
                            n7 = paddingLeft;
                            n8 = n6;
                            break;
                        }
                        case 3: {
                            final int n9 = child.getWidth() + paddingLeft;
                            max = paddingLeft;
                            n8 = paddingRight;
                            n7 = n9;
                            break;
                        }
                        case 1: {
                            max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                            final int n10 = paddingLeft;
                            n8 = paddingRight;
                            n7 = n10;
                            break;
                        }
                        case 5: {
                            max = width - paddingRight - child.getMeasuredWidth();
                            final int measuredWidth = child.getMeasuredWidth();
                            final int n11 = paddingLeft;
                            n8 = paddingRight + measuredWidth;
                            n7 = n11;
                            break;
                        }
                    }
                    final int n12 = max + scrollX - child.getLeft();
                    n5 = n8;
                    n4 = n7;
                    if (n12 != 0) {
                        child.offsetLeftAndRight(n12);
                        n5 = n8;
                        n4 = n7;
                    }
                }
            }
        }
        if (this.U != null) {
            this.U.a(n, n2, n3);
        }
        if (this.V != null) {
            this.V.a(n, n2, n3);
        }
        this.S = true;
    }
    
    void a(int a, int n, int abs) {
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        final int n2 = a - scrollX;
        n -= scrollY;
        if (n2 == 0 && n == 0) {
            this.g();
            this.b();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        a = this.getWidth();
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
            a = (int)((Math.abs(n2) / (a * this.g.a(this.h) + this.n) + 1.0f) * 100.0f);
        }
        a = Math.min(a, 600);
        this.l.startScroll(scrollX, scrollY, n2, n, a);
        android.support.v4.view.q.b((View)this);
    }
    
    public void a(final int n, final boolean b) {
        this.a(n, b, this.x = false);
    }
    
    void a(final int n, final boolean b, final boolean b2) {
        this.a(n, b, b2, 0);
    }
    
    void a(int i, final boolean b, final boolean b2, final int n) {
        if (this.g == null || this.g.a() <= 0) {
            this.setScrollingCacheEnabled(false);
        }
        else {
            if (!b2 && this.h == i && this.d.size() != 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
            int n2;
            if (i < 0) {
                n2 = 0;
            }
            else if ((n2 = i) >= this.g.a()) {
                n2 = this.g.a() - 1;
            }
            i = this.y;
            if (n2 > this.h + i || n2 < this.h - i) {
                for (i = 0; i < this.d.size(); ++i) {
                    this.d.get(i).c = true;
                }
            }
            if (this.h != n2) {
                i = 1;
            }
            else {
                i = 0;
            }
            this.a(n2);
            final aj b3 = this.b(n2);
            int n3;
            if (b3 != null) {
                n3 = (int)(Math.max(this.r, Math.min(b3.e, this.s)) * this.getWidth());
            }
            else {
                n3 = 0;
            }
            if (!b) {
                if (i != 0 && this.U != null) {
                    this.U.a(n2);
                }
                if (i != 0 && this.V != null) {
                    this.V.a(n2);
                }
                this.g();
                this.scrollTo(n3, 0);
                return;
            }
            this.a(n3, 0, n);
            if (i != 0 && this.U != null) {
                this.U.a(n2);
            }
            if (i != 0 && this.V != null) {
                this.V.a(n2);
            }
        }
    }
    
    public boolean a(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 21: {
                    return this.c(17);
                }
                case 22: {
                    return this.c(66);
                }
                case 61: {
                    if (Build$VERSION.SDK_INT < 11) {
                        break;
                    }
                    if (android.support.v4.view.a.a(keyEvent)) {
                        return this.c(2);
                    }
                    if (android.support.v4.view.a.a(keyEvent, 1)) {
                        return this.c(1);
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    protected boolean a(final View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom() && this.a(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop())) {
                    return true;
                }
            }
        }
        Label_0144: {
            break Label_0144;
        }
        if (!b || !android.support.v4.view.q.a(view, -n)) {
            return false;
        }
        return true;
    }
    
    public void addFocusables(final ArrayList list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final aj a = this.a(child);
                    if (a != null && a.b == this.h) {
                        child.addFocusables(list, n, n2);
                    }
                }
            }
        }
        if ((descendantFocusability != 262144 || size == list.size()) && this.isFocusable() && ((n2 & 0x1) != 0x1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && list != null) {
            list.add(this);
        }
    }
    
    public void addTouchables(final ArrayList list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final aj a = this.a(child);
                if (a != null && a.b == this.h) {
                    child.addTouchables(list);
                }
            }
        }
    }
    
    public void addView(final View view, final int n, ViewGroup$LayoutParams generateLayoutParams) {
        if (!this.checkLayoutParams(generateLayoutParams)) {
            generateLayoutParams = this.generateLayoutParams(generateLayoutParams);
        }
        final ak ak = (ak)generateLayoutParams;
        ak.a |= (view instanceof ai);
        if (!this.v) {
            super.addView(view, n, generateLayoutParams);
            return;
        }
        if (ak != null && ak.a) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        ak.d = true;
        this.addViewInLayout(view, n, generateLayoutParams);
    }
    
    aj b(final int n) {
        for (int i = 0; i < this.d.size(); ++i) {
            final aj aj = this.d.get(i);
            if (aj.b == n) {
                return aj;
            }
        }
        return null;
    }
    
    aj b(View view) {
        while (true) {
            final ViewParent parent = view.getParent();
            if (parent == this) {
                return this.a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View)parent;
        }
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
    
    public boolean c(final int n) {
        View focus;
        if ((focus = this.findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, n);
        while (true) {
            Label_0222: {
                boolean b;
                if (nextFocus != null && nextFocus != focus) {
                    if (n == 17) {
                        final int left = this.a(this.f, nextFocus).left;
                        final int left2 = this.a(this.f, focus).left;
                        if (focus != null && left >= left2) {
                            b = this.c();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                    else {
                        if (n != 66) {
                            break Label_0222;
                        }
                        final int left3 = this.a(this.f, nextFocus).left;
                        final int left4 = this.a(this.f, focus).left;
                        if (focus != null && left3 <= left4) {
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
                        break Label_0222;
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
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ak && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (!this.l.isFinished() && this.l.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.l.getCurrX();
            final int currY = this.l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.d(currX)) {
                    this.l.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            android.support.v4.view.q.b((View)this);
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
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.a(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        final boolean b = false;
        final int childCount = this.getChildCount();
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            if (child.getVisibility() == 0) {
                final aj a = this.a(child);
                if (a != null && a.b == this.h && child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    b2 = true;
                    break;
                }
            }
            ++n;
        }
        return b2;
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        boolean b = false;
        boolean b2 = false;
        final int a = android.support.v4.view.q.a((View)this);
        if (a == 0 || (a == 1 && this.g != null && this.g.a() > 1)) {
            if (!this.O.a()) {
                final int save = canvas.save();
                final int n = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                final int width = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n + this.getPaddingTop()), this.r * width);
                this.O.a(n, width);
                b2 = (false | this.O.a(canvas));
                canvas.restoreToCount(save);
            }
            b = b2;
            if (!this.P.a()) {
                final int save2 = canvas.save();
                final int width2 = this.getWidth();
                final int height = this.getHeight();
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(this.s + 1.0f) * width2);
                this.P.a(height - paddingTop - paddingBottom, width2);
                b = (b2 | this.P.a(canvas));
                canvas.restoreToCount(save2);
            }
        }
        else {
            this.O.b();
            this.P.b();
        }
        if (b) {
            android.support.v4.view.q.b((View)this);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable o = this.o;
        if (o != null && o.isStateful()) {
            o.setState(this.getDrawableState());
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new ak();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new ak(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
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
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.n > 0 && this.o != null && this.d.size() > 0 && this.g != null) {
            final int scrollX = this.getScrollX();
            final int width = this.getWidth();
            final float n = this.n / (float)width;
            aj aj = this.d.get(0);
            float e = aj.e;
            final int size = this.d.size();
            int i = aj.b;
            final int b = this.d.get(size - 1).b;
            int index = 0;
            while (i < b) {
                while (i > aj.b && index < size) {
                    final ArrayList d = this.d;
                    ++index;
                    aj = d.get(index);
                }
                float n2;
                if (i == aj.b) {
                    n2 = (aj.e + aj.d) * width;
                    e = aj.e + aj.d + n;
                }
                else {
                    final float a = this.g.a(i);
                    n2 = (e + a) * width;
                    e += a + n;
                }
                if (this.n + n2 > scrollX) {
                    this.o.setBounds((int)n2, this.p, (int)(this.n + n2 + 0.5f), this.q);
                    this.o.draw(canvas);
                }
                if (n2 > scrollX + width) {
                    break;
                }
                ++i;
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 3 && n != 1) {
            if (n != 0) {
                if (this.z) {
                    return true;
                }
                if (this.A) {
                    return false;
                }
            }
            switch (n) {
                case 2: {
                    final int h = this.H;
                    if (h == -1) {
                        break;
                    }
                    final int a = android.support.v4.view.f.a(motionEvent, h);
                    final float c = android.support.v4.view.f.c(motionEvent, a);
                    final float a2 = c - this.F;
                    final float abs = Math.abs(a2);
                    final float d = android.support.v4.view.f.d(motionEvent, a);
                    final float abs2 = Math.abs(d - this.G);
                    if (a2 != 0.0f && !this.a(this.F, a2) && this.a((View)this, false, (int)a2, (int)c, (int)d)) {
                        this.F = c;
                        this.E = c;
                        this.G = d;
                        this.A = true;
                        return false;
                    }
                    if (abs > this.D && abs > abs2) {
                        this.z = true;
                        this.setScrollState(1);
                        float f;
                        if (a2 > 0.0f) {
                            f = this.E + this.D;
                        }
                        else {
                            f = this.E - this.D;
                        }
                        this.F = f;
                        this.setScrollingCacheEnabled(true);
                    }
                    else if (abs2 > this.D) {
                        this.A = true;
                    }
                    if (this.z && this.b(c)) {
                        android.support.v4.view.q.b((View)this);
                        break;
                    }
                    break;
                }
                case 0: {
                    final float x = motionEvent.getX();
                    this.E = x;
                    this.F = x;
                    this.G = motionEvent.getY();
                    this.H = android.support.v4.view.f.b(motionEvent, 0);
                    this.A = false;
                    this.l.computeScrollOffset();
                    if (this.Z == 2 && Math.abs(this.l.getFinalX() - this.l.getCurrX()) > this.M) {
                        this.l.abortAnimation();
                        this.x = false;
                        this.b();
                        this.z = true;
                        this.setScrollState(1);
                        break;
                    }
                    this.g();
                    this.z = false;
                    break;
                }
                case 6: {
                    this.a(motionEvent);
                    break;
                }
            }
            if (this.I == null) {
                this.I = VelocityTracker.obtain();
            }
            this.I.addMovement(motionEvent);
            return this.z;
        }
        this.z = false;
        this.A = false;
        this.H = -1;
        if (this.I != null) {
            this.I.recycle();
            this.I = null;
        }
        return false;
    }
    
    protected void onLayout(final boolean b, int paddingTop, int paddingLeft, int paddingBottom, int paddingRight) {
        this.v = true;
        this.b();
        this.v = false;
        final int childCount = this.getChildCount();
        final int n = paddingBottom - paddingTop;
        final int n2 = paddingRight - paddingLeft;
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int t = 0;
        int i = 0;
    Label_0268_Outer:
        while (i < childCount) {
            final View child = this.getChildAt(i);
            while (true) {
                Label_0657: {
                    if (child.getVisibility() == 8) {
                        break Label_0657;
                    }
                    final ak ak = (ak)child.getLayoutParams();
                    if (!ak.a) {
                        break Label_0657;
                    }
                    final int b2 = ak.b;
                    final int b3 = ak.b;
                    int max = 0;
                    int n3 = 0;
                    switch (b2 & 0x7) {
                        default: {
                            max = paddingLeft;
                            n3 = paddingLeft;
                            break;
                        }
                        case 3: {
                            final int measuredWidth = child.getMeasuredWidth();
                            max = paddingLeft;
                            n3 = measuredWidth + paddingLeft;
                            break;
                        }
                        case 1: {
                            max = Math.max((n - child.getMeasuredWidth()) / 2, paddingLeft);
                            n3 = paddingLeft;
                            break;
                        }
                        case 5: {
                            final int measuredWidth2 = child.getMeasuredWidth();
                            final int n4 = paddingRight + child.getMeasuredWidth();
                            final int n5 = n - paddingRight - measuredWidth2;
                            paddingRight = n4;
                            n3 = paddingLeft;
                            max = n5;
                            break;
                        }
                    }
                    switch (b3 & 0x70) {
                        default: {
                            final int n6 = paddingTop;
                            paddingLeft = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = n6;
                            break;
                        }
                        case 48: {
                            final int measuredHeight = child.getMeasuredHeight();
                            paddingLeft = paddingBottom;
                            final int n7 = measuredHeight + paddingTop;
                            paddingBottom = paddingTop;
                            paddingTop = paddingLeft;
                            paddingLeft = n7;
                            break;
                        }
                        case 16: {
                            final int max2 = Math.max((n2 - child.getMeasuredHeight()) / 2, paddingTop);
                            paddingLeft = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = max2;
                            break;
                        }
                        case 80: {
                            final int n8 = n2 - paddingBottom - child.getMeasuredHeight();
                            final int measuredHeight2 = child.getMeasuredHeight();
                            paddingLeft = paddingTop;
                            paddingTop = paddingBottom + measuredHeight2;
                            paddingBottom = n8;
                            break;
                        }
                    }
                    final int n9 = max + scrollX;
                    child.layout(n9, paddingBottom, child.getMeasuredWidth() + n9, child.getMeasuredHeight() + paddingBottom);
                    final int n10 = t + 1;
                    paddingBottom = n3;
                    final int n11 = paddingTop;
                    paddingTop = n10;
                    ++i;
                    final int n12 = paddingBottom;
                    t = paddingTop;
                    paddingTop = paddingLeft;
                    paddingBottom = n11;
                    paddingLeft = n12;
                    continue Label_0268_Outer;
                }
                final int n13 = t;
                final int n14 = paddingTop;
                final int n15 = paddingLeft;
                paddingTop = n13;
                final int n11 = paddingBottom;
                paddingLeft = n14;
                paddingBottom = n15;
                continue;
            }
        }
        for (int j = 0; j < childCount; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final ak ak2 = (ak)child2.getLayoutParams();
                if (!ak2.a) {
                    final aj a = this.a(child2);
                    if (a != null) {
                        final int n16 = (int)(a.e * n) + paddingLeft;
                        if (ak2.d) {
                            ak2.d = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(ak2.c * (n - paddingLeft - paddingRight)), 1073741824), View$MeasureSpec.makeMeasureSpec(n2 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n16, paddingTop, child2.getMeasuredWidth() + n16, child2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.p = paddingTop;
        this.q = n2 - paddingBottom;
        this.T = t;
        this.Q = false;
    }
    
    protected void onMeasure(int measuredWidth, int i) {
        this.setMeasuredDimension(getDefaultSize(0, measuredWidth), getDefaultSize(0, i));
        measuredWidth = this.getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        measuredWidth = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        i = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        int n;
        int n2;
    Label_0318:
        for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j, measuredWidth = n, i = n2) {
            final View child = this.getChildAt(j);
            n = measuredWidth;
            n2 = i;
            if (child.getVisibility() != 8) {
                final ak ak = (ak)child.getLayoutParams();
                n = measuredWidth;
                n2 = i;
                if (ak != null) {
                    n = measuredWidth;
                    n2 = i;
                    if (ak.a) {
                        final int n3 = ak.b & 0x7;
                        final int n4 = ak.b & 0x70;
                        final int n5 = Integer.MIN_VALUE;
                        int n6 = Integer.MIN_VALUE;
                        boolean b;
                        if (n4 == 48 || n4 == 80) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        final boolean b2 = n3 == 3 || n3 == 5;
                        int n7;
                        if (b) {
                            n7 = 1073741824;
                        }
                        else {
                            n7 = n5;
                            if (b2) {
                                n6 = 1073741824;
                                n7 = n5;
                            }
                        }
                        int n8;
                        int width;
                        if (ak.width != -2) {
                            n8 = 1073741824;
                            if (ak.width != -1) {
                                width = ak.width;
                            }
                            else {
                                width = measuredWidth;
                            }
                        }
                        else {
                            n8 = n7;
                            width = measuredWidth;
                        }
                        while (true) {
                            Label_0516: {
                                if (ak.height == -2) {
                                    break Label_0516;
                                }
                                n6 = 1073741824;
                                if (ak.height == -1) {
                                    break Label_0516;
                                }
                                final int height = ak.height;
                                n6 = n6;
                                final int n9 = height;
                                child.measure(View$MeasureSpec.makeMeasureSpec(width, n8), View$MeasureSpec.makeMeasureSpec(n9, n6));
                                if (b) {
                                    n2 = i - child.getMeasuredHeight();
                                    n = measuredWidth;
                                    continue Label_0318;
                                }
                                n = measuredWidth;
                                n2 = i;
                                if (b2) {
                                    n = measuredWidth - child.getMeasuredWidth();
                                    n2 = i;
                                }
                                continue Label_0318;
                            }
                            final int n9 = i;
                            continue;
                        }
                    }
                }
            }
        }
        this.t = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.u = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.v = true;
        this.b();
        this.v = false;
        int childCount2;
        View child2;
        ak ak2;
        for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                ak2 = (ak)child2.getLayoutParams();
                if (ak2 == null || !ak2.a) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(ak2.c * measuredWidth), 1073741824), this.u);
                }
            }
        }
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2 = -1;
        int childCount = this.getChildCount();
        int i;
        if ((n & 0x2) != 0x0) {
            n2 = 1;
            i = 0;
        }
        else {
            i = childCount - 1;
            childCount = -1;
        }
        while (i != childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final aj a = this.a(child);
                if (a != null && a.b == this.h && child.requestFocus(n, rect)) {
                    return true;
                }
            }
            i += n2;
        }
        return false;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState)parcelable;
        super.onRestoreInstanceState(viewPager$SavedState.getSuperState());
        if (this.g != null) {
            this.g.a(viewPager$SavedState.b, viewPager$SavedState.c);
            this.a(viewPager$SavedState.a, false, true);
            return;
        }
        this.i = viewPager$SavedState.a;
        this.j = viewPager$SavedState.b;
        this.k = viewPager$SavedState.c;
    }
    
    public Parcelable onSaveInstanceState() {
        final ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.a = this.h;
        if (this.g != null) {
            viewPager$SavedState.b = this.g.b();
        }
        return (Parcelable)viewPager$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.a(n, n3, this.n, this.n);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean b = false;
        if (this.N) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.g == null || this.g.a() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        boolean b2 = b;
        while (true) {
            switch (motionEvent.getAction() & 0xFF) {
                default: {
                    b2 = b;
                    break Label_0128;
                }
                case 6: {
                    this.a(motionEvent);
                    this.F = android.support.v4.view.f.c(motionEvent, android.support.v4.view.f.a(motionEvent, this.H));
                    b2 = b;
                    break Label_0128;
                }
                case 5: {
                    final int a = android.support.v4.view.f.a(motionEvent);
                    this.F = android.support.v4.view.f.c(motionEvent, a);
                    this.H = android.support.v4.view.f.b(motionEvent, a);
                    b2 = b;
                    break Label_0128;
                }
                case 0: {
                    this.l.abortAnimation();
                    this.x = false;
                    this.b();
                    this.z = true;
                    this.setScrollState(1);
                    final float x = motionEvent.getX();
                    this.E = x;
                    this.F = x;
                    this.H = android.support.v4.view.f.b(motionEvent, 0);
                    b2 = b;
                }
                case 4: {
                    if (b2) {
                        android.support.v4.view.q.b((View)this);
                    }
                    return true;
                }
                case 2: {
                    if (!this.z) {
                        final int a2 = android.support.v4.view.f.a(motionEvent, this.H);
                        final float c = android.support.v4.view.f.c(motionEvent, a2);
                        final float abs = Math.abs(c - this.F);
                        final float abs2 = Math.abs(android.support.v4.view.f.d(motionEvent, a2) - this.G);
                        if (abs > this.D && abs > abs2) {
                            this.z = true;
                            float f;
                            if (c - this.E > 0.0f) {
                                f = this.E + this.D;
                            }
                            else {
                                f = this.E - this.D;
                            }
                            this.F = f;
                            this.setScrollState(1);
                            this.setScrollingCacheEnabled(true);
                        }
                    }
                    b2 = b;
                    if (this.z) {
                        b2 = (false | this.b(android.support.v4.view.f.c(motionEvent, android.support.v4.view.f.a(motionEvent, this.H))));
                    }
                    continue;
                }
                case 1: {
                    b2 = b;
                    if (this.z) {
                        final VelocityTracker i = this.I;
                        i.computeCurrentVelocity(1000, (float)this.K);
                        final int n = (int)android.support.v4.view.l.a(i, this.H);
                        this.x = true;
                        final int width = this.getWidth();
                        final int scrollX = this.getScrollX();
                        final aj h = this.h();
                        this.a(this.a(h.b, (scrollX / (float)width - h.e) / h.d, n, (int)(android.support.v4.view.f.c(motionEvent, android.support.v4.view.f.a(motionEvent, this.H)) - this.E)), true, true, n);
                        this.H = -1;
                        this.i();
                        b2 = (this.P.c() | this.O.c());
                    }
                    continue;
                }
                case 3: {
                    b2 = b;
                    if (this.z) {
                        this.a(this.h, true, true);
                        this.H = -1;
                        this.i();
                        b2 = (this.P.c() | this.O.c());
                    }
                    continue;
                }
            }
            break;
        }
    }
    
    public void setAdapter(final k g) {
        if (this.g != null) {
            this.g.b(this.m);
            this.g.a(this);
            for (int i = 0; i < this.d.size(); ++i) {
                final aj aj = this.d.get(i);
                this.g.a(this, aj.b, aj.a);
            }
            this.g.b(this);
            this.d.clear();
            this.f();
            this.scrollTo(this.h = 0, 0);
        }
        final k g2 = this.g;
        this.g = g;
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
            }
            else {
                this.b();
            }
        }
        if (this.W != null && g2 != g) {
            this.W.a(g2, g);
        }
    }
    
    public void setCurrentItem(final int n) {
        this.x = false;
        this.a(n, !this.Q, false);
    }
    
    public void setOffscreenPageLimit(final int i) {
        int y = i;
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            y = 1;
        }
        if (y != this.y) {
            this.y = y;
            this.b();
        }
    }
    
    void setOnAdapterChangeListener(final al w) {
        this.W = w;
    }
    
    public void setOnPageChangeListener(final am u) {
        this.U = u;
    }
    
    public void setPageMargin(final int n) {
        final int n2 = this.n;
        this.n = n;
        final int width = this.getWidth();
        this.a(width, width, n, n2);
        this.requestLayout();
    }
    
    public void setPageMarginDrawable(final int n) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(n));
    }
    
    public void setPageMarginDrawable(final Drawable o) {
        this.o = o;
        if (o != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(o == null);
        this.invalidate();
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }
}
