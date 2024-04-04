// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.view.MotionEvent;
import android.graphics.Color;
import android.graphics.Canvas;
import android.util.Log;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

public class f extends ViewGroup
{
    private int a;
    private a b;
    private View c;
    private View d;
    private int e;
    private int f;
    private l g;
    private boolean h;
    private int i;
    private boolean j;
    private final Paint k;
    private float l;
    private Drawable m;
    private Drawable n;
    private int o;
    private float p;
    private boolean q;
    private Bitmap r;
    private View s;
    
    public f(final Context context) {
        this(context, null);
    }
    
    public f(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.k = new Paint();
        this.q = true;
        this.e = (int)TypedValue.applyDimension(1, 48.0f, this.getResources().getDisplayMetrics());
    }
    
    private int getSelectorTop() {
        return this.s.getTop() + (this.s.getHeight() - this.r.getHeight()) / 2;
    }
    
    public int a(final int n) {
        int n2;
        if (n > 1) {
            n2 = 2;
        }
        else if ((n2 = n) < 1) {
            n2 = 0;
        }
        if (this.i == 0 && n2 > 1) {
            return 0;
        }
        if (this.i == 1 && n2 < 1) {
            return 2;
        }
        return n2;
    }
    
    public int a(final View view) {
        if (this.i == 0 || this.i == 2) {
            return view.getLeft() - this.getBehindWidth();
        }
        if (this.i == 1) {
            return view.getLeft();
        }
        return 0;
    }
    
    public int a(final View view, final int n) {
        if (this.i == 0) {
            switch (n) {
                case 0: {
                    return view.getLeft() - this.getBehindWidth();
                }
                case 2: {
                    return view.getLeft();
                }
            }
        }
        else if (this.i == 1) {
            switch (n) {
                case 0: {
                    return view.getLeft();
                }
                case 2: {
                    return view.getLeft() + this.getBehindWidth();
                }
            }
        }
        else if (this.i == 2) {
            switch (n) {
                case 0: {
                    return view.getLeft() - this.getBehindWidth();
                }
                case 2: {
                    return view.getLeft() + this.getBehindWidth();
                }
            }
        }
        return view.getLeft();
    }
    
    public void a(final View view, final int n, final int n2) {
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        int visibility = 0;
        if (this.i == 0) {
            if (n >= view.getLeft()) {
                visibility = 4;
            }
            this.scrollTo((int)((this.getBehindWidth() + n) * this.l), n2);
        }
        else if (this.i == 1) {
            visibility = n4;
            if (n <= view.getLeft()) {
                visibility = 4;
            }
            this.scrollTo((int)(this.getBehindWidth() - this.getWidth() + (n - this.getBehindWidth()) * this.l), n2);
        }
        else {
            visibility = n3;
            if (this.i == 2) {
                final View c = this.c;
                int visibility2;
                if (n >= view.getLeft()) {
                    visibility2 = 4;
                }
                else {
                    visibility2 = 0;
                }
                c.setVisibility(visibility2);
                final View d = this.d;
                int visibility3;
                if (n <= view.getLeft()) {
                    visibility3 = 4;
                }
                else {
                    visibility3 = 0;
                }
                d.setVisibility(visibility3);
                visibility = n5;
                if (n == 0) {
                    visibility = 4;
                }
                if (n <= view.getLeft()) {
                    this.scrollTo((int)((this.getBehindWidth() + n) * this.l), n2);
                }
                else {
                    this.scrollTo((int)(this.getBehindWidth() - this.getWidth() + (n - this.getBehindWidth()) * this.l), n2);
                }
            }
        }
        if (visibility == 4) {
            Log.v("CustomViewBehind", "behind INVISIBLE");
        }
        this.setVisibility(visibility);
    }
    
    public void a(final View view, final Canvas canvas) {
        if (this.m == null || this.o <= 0) {
            return;
        }
        int right;
        if (this.i == 0) {
            right = view.getLeft() - this.o;
        }
        else if (this.i == 1) {
            right = view.getRight();
        }
        else if (this.i == 2) {
            if (this.n != null) {
                final int right2 = view.getRight();
                this.n.setBounds(right2, 0, this.o + right2, this.getHeight());
                this.n.draw(canvas);
            }
            right = view.getLeft() - this.o;
        }
        else {
            right = 0;
        }
        this.m.setBounds(right, 0, this.o + right, this.getHeight());
        this.m.draw(canvas);
    }
    
    public void a(final View view, final Canvas canvas, final float n) {
        int left = 0;
        if (!this.j) {
            return;
        }
        this.k.setColor(Color.argb((int)(this.p * 255.0f * Math.abs(1.0f - n)), 0, 0, 0));
        int n2;
        if (this.i == 0) {
            n2 = view.getLeft() - this.getBehindWidth();
            left = view.getLeft();
        }
        else if (this.i == 1) {
            n2 = view.getRight();
            left = view.getRight() + this.getBehindWidth();
        }
        else if (this.i == 2) {
            canvas.drawRect((float)(view.getLeft() - this.getBehindWidth()), 0.0f, (float)view.getLeft(), (float)this.getHeight(), this.k);
            n2 = view.getRight();
            left = view.getRight() + this.getBehindWidth();
        }
        else {
            n2 = 0;
        }
        canvas.drawRect((float)n2, 0.0f, (float)left, (float)this.getHeight(), this.k);
    }
    
    public boolean a(final float n) {
        if (this.i == 0) {
            if (n <= 0.0f) {
                return false;
            }
        }
        else if (this.i == 1) {
            if (n >= 0.0f) {
                return false;
            }
        }
        else if (this.i != 2) {
            return false;
        }
        return true;
    }
    
    public boolean a(final View view, final int n, final float n2) {
        switch (this.a) {
            default: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: {
                return this.b(view, n, n2);
            }
        }
    }
    
    public int b(final View view) {
        if (this.i == 0) {
            return view.getLeft();
        }
        if (this.i == 1 || this.i == 2) {
            return view.getLeft() + this.getBehindWidth();
        }
        return 0;
    }
    
    public void b(final View view, final Canvas canvas, final float n) {
        if (this.q && this.r != null && this.s != null && ((String)this.s.getTag(2131165193)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            final int n2 = (int)(this.r.getWidth() * n);
            if (this.i == 0) {
                final int left = view.getLeft();
                final int n3 = left - n2;
                canvas.clipRect(n3, 0, left, this.getHeight());
                canvas.drawBitmap(this.r, (float)n3, (float)this.getSelectorTop(), (Paint)null);
            }
            else if (this.i == 1) {
                final int right = view.getRight();
                final int n4 = n2 + right;
                canvas.clipRect(right, 0, n4, this.getHeight());
                canvas.drawBitmap(this.r, (float)(n4 - this.r.getWidth()), (float)this.getSelectorTop(), (Paint)null);
            }
            canvas.restore();
        }
    }
    
    public boolean b(final float n) {
        if (this.i == 0) {
            if (n >= 0.0f) {
                return false;
            }
        }
        else if (this.i == 1) {
            if (n <= 0.0f) {
                return false;
            }
        }
        else if (this.i != 2) {
            return false;
        }
        return true;
    }
    
    public boolean b(final View view, final int n) {
        final int left = view.getLeft();
        final int right = view.getRight();
        if (this.i == 0) {
            if (n < left || n > left + this.e) {
                return false;
            }
        }
        else if (this.i == 1) {
            if (n > right || n < right - this.e) {
                return false;
            }
        }
        else {
            if (this.i != 2) {
                return false;
            }
            if ((n < left || n > left + this.e) && (n > right || n < right - this.e)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean b(final View view, final int n, final float n2) {
        final boolean b = false;
        boolean b2;
        if (this.i == 0 || (this.i == 2 && n == 0)) {
            b2 = b;
            if (n2 >= view.getLeft()) {
                b2 = true;
            }
        }
        else {
            if (this.i != 1) {
                b2 = b;
                if (this.i != 2) {
                    return b2;
                }
                b2 = b;
                if (n != 2) {
                    return b2;
                }
            }
            b2 = b;
            if (n2 <= view.getRight()) {
                return true;
            }
        }
        return b2;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        if (this.g != null) {
            canvas.save();
            this.g.a(canvas, this.b.getPercentOpen());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }
    
    public int getBehindWidth() {
        return this.c.getWidth();
    }
    
    public View getContent() {
        return this.c;
    }
    
    public int getMarginThreshold() {
        return this.e;
    }
    
    public int getMode() {
        return this.i;
    }
    
    public float getScrollScale() {
        return this.l;
    }
    
    public View getSecondaryContent() {
        return this.d;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return !this.h;
    }
    
    protected void onLayout(final boolean b, int n, int n2, final int n3, final int n4) {
        n = n3 - n;
        n2 = n4 - n2;
        this.c.layout(0, 0, n - this.f, n2);
        if (this.d != null) {
            this.d.layout(0, 0, n - this.f, n2);
        }
    }
    
    protected void onMeasure(int childMeasureSpec, int childMeasureSpec2) {
        final int defaultSize = getDefaultSize(0, childMeasureSpec);
        final int defaultSize2 = getDefaultSize(0, childMeasureSpec2);
        this.setMeasuredDimension(defaultSize, defaultSize2);
        childMeasureSpec = getChildMeasureSpec(childMeasureSpec, 0, defaultSize - this.f);
        childMeasureSpec2 = getChildMeasureSpec(childMeasureSpec2, 0, defaultSize2);
        this.c.measure(childMeasureSpec, childMeasureSpec2);
        if (this.d != null) {
            this.d.measure(childMeasureSpec, childMeasureSpec2);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return !this.h;
    }
    
    public void scrollTo(final int n, final int n2) {
        super.scrollTo(n, n2);
        if (this.g != null) {
            this.invalidate();
        }
    }
    
    public void setCanvasTransformer(final l g) {
        this.g = g;
    }
    
    public void setChildrenEnabled(final boolean h) {
        this.h = h;
    }
    
    public void setContent(final View c) {
        if (this.c != null) {
            this.removeView(this.c);
        }
        this.addView(this.c = c);
    }
    
    public void setCustomViewAbove(final a b) {
        this.b = b;
    }
    
    public void setFadeDegree(final float p) {
        if (p > 1.0f || p < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.p = p;
    }
    
    public void setFadeEnabled(final boolean j) {
        this.j = j;
    }
    
    public void setMarginThreshold(final int e) {
        this.e = e;
    }
    
    public void setMode(final int i) {
        if (i == 0 || i == 1) {
            if (this.c != null) {
                this.c.setVisibility(0);
            }
            if (this.d != null) {
                this.d.setVisibility(4);
            }
        }
        this.i = i;
    }
    
    public void setScrollScale(final float l) {
        this.l = l;
    }
    
    public void setSecondaryContent(final View d) {
        if (this.d != null) {
            this.removeView(this.d);
        }
        this.addView(this.d = d);
    }
    
    public void setSecondaryShadowDrawable(final Drawable n) {
        this.n = n;
        this.invalidate();
    }
    
    public void setSelectedView(final View s) {
        if (this.s != null) {
            this.s.setTag(2131165193, (Object)null);
            this.s = null;
        }
        if (s != null && s.getParent() != null) {
            (this.s = s).setTag(2131165193, (Object)"CustomViewBehindSelectedView");
            this.invalidate();
        }
    }
    
    public void setSelectorBitmap(final Bitmap r) {
        this.r = r;
        this.refreshDrawableState();
    }
    
    public void setSelectorEnabled(final boolean q) {
        this.q = q;
    }
    
    public void setShadowDrawable(final Drawable m) {
        this.m = m;
        this.invalidate();
    }
    
    public void setShadowWidth(final int o) {
        this.o = o;
        this.invalidate();
    }
    
    public void setTouchMode(final int a) {
        this.a = a;
    }
    
    public void setWidthOffset(final int f) {
        this.f = f;
        this.requestLayout();
    }
}
