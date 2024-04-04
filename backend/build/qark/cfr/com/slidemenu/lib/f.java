/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.slidemenu.lib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.slidemenu.lib.a;
import com.slidemenu.lib.l;

public class f
extends ViewGroup {
    private int a = 0;
    private a b;
    private View c;
    private View d;
    private int e;
    private int f;
    private l g;
    private boolean h;
    private int i;
    private boolean j;
    private final Paint k = new Paint();
    private float l;
    private Drawable m;
    private Drawable n;
    private int o;
    private float p;
    private boolean q = true;
    private Bitmap r;
    private View s;

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = (int)TypedValue.applyDimension((int)1, (float)48.0f, (DisplayMetrics)this.getResources().getDisplayMetrics());
    }

    private int getSelectorTop() {
        return this.s.getTop() + (this.s.getHeight() - this.r.getHeight()) / 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2) {
        int n3;
        if (n2 > 1) {
            n3 = 2;
        } else {
            n3 = n2;
            if (n2 < 1) {
                n3 = 0;
            }
        }
        if (this.i == 0 && n3 > 1) {
            return 0;
        }
        if (this.i == 1 && n3 < 1) {
            return 2;
        }
        return n3;
    }

    public int a(View view) {
        if (this.i == 0 || this.i == 2) {
            return view.getLeft() - this.getBehindWidth();
        }
        if (this.i == 1) {
            return view.getLeft();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(View view, int n2) {
        if (this.i == 0) {
            switch (n2) {
                default: {
                    return view.getLeft();
                }
                case 0: {
                    return view.getLeft() - this.getBehindWidth();
                }
                case 2: 
            }
            return view.getLeft();
        }
        if (this.i == 1) {
            switch (n2) {
                default: {
                    return view.getLeft();
                }
                case 0: {
                    return view.getLeft();
                }
                case 2: 
            }
            return view.getLeft() + this.getBehindWidth();
        }
        if (this.i != 2) return view.getLeft();
        switch (n2) {
            default: {
                return view.getLeft();
            }
            case 0: {
                return view.getLeft() - this.getBehindWidth();
            }
            case 2: 
        }
        return view.getLeft() + this.getBehindWidth();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(View view, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        if (this.i == 0) {
            if (n2 >= view.getLeft()) {
                n7 = 4;
            }
            this.scrollTo((int)((float)(this.getBehindWidth() + n2) * this.l), n3);
        } else if (this.i == 1) {
            n7 = n5;
            if (n2 <= view.getLeft()) {
                n7 = 4;
            }
            this.scrollTo((int)((float)(this.getBehindWidth() - this.getWidth()) + (float)(n2 - this.getBehindWidth()) * this.l), n3);
        } else {
            n7 = n4;
            if (this.i == 2) {
                View view2 = this.c;
                n7 = n2 >= view.getLeft() ? 4 : 0;
                view2.setVisibility(n7);
                view2 = this.d;
                n7 = n2 <= view.getLeft() ? 4 : 0;
                view2.setVisibility(n7);
                n7 = n6;
                if (n2 == 0) {
                    n7 = 4;
                }
                if (n2 <= view.getLeft()) {
                    this.scrollTo((int)((float)(this.getBehindWidth() + n2) * this.l), n3);
                } else {
                    this.scrollTo((int)((float)(this.getBehindWidth() - this.getWidth()) + (float)(n2 - this.getBehindWidth()) * this.l), n3);
                }
            }
        }
        if (n7 == 4) {
            Log.v((String)"CustomViewBehind", (String)"behind INVISIBLE");
        }
        this.setVisibility(n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(View view, Canvas canvas) {
        int n2;
        if (this.m == null || this.o <= 0) {
            return;
        }
        if (this.i == 0) {
            n2 = view.getLeft() - this.o;
        } else if (this.i == 1) {
            n2 = view.getRight();
        } else if (this.i == 2) {
            if (this.n != null) {
                n2 = view.getRight();
                this.n.setBounds(n2, 0, this.o + n2, this.getHeight());
                this.n.draw(canvas);
            }
            n2 = view.getLeft() - this.o;
        } else {
            n2 = 0;
        }
        this.m.setBounds(n2, 0, this.o + n2, this.getHeight());
        this.m.draw(canvas);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(View view, Canvas canvas, float f2) {
        int n2 = 0;
        if (!this.j) {
            return;
        }
        int n3 = (int)(this.p * 255.0f * Math.abs((float)(1.0f - f2)));
        this.k.setColor(Color.argb((int)n3, (int)0, (int)0, (int)0));
        if (this.i == 0) {
            n3 = view.getLeft() - this.getBehindWidth();
            n2 = view.getLeft();
        } else if (this.i == 1) {
            n3 = view.getRight();
            n2 = view.getRight() + this.getBehindWidth();
        } else if (this.i == 2) {
            n2 = view.getLeft();
            n3 = this.getBehindWidth();
            int n4 = view.getLeft();
            canvas.drawRect((float)(n2 - n3), 0.0f, (float)n4, (float)this.getHeight(), this.k);
            n3 = view.getRight();
            n2 = view.getRight() + this.getBehindWidth();
        } else {
            n3 = 0;
        }
        canvas.drawRect((float)n3, 0.0f, (float)n2, (float)this.getHeight(), this.k);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(float f2) {
        if (this.i == 0) {
            if (f2 > 0.0f) return true;
            return false;
        }
        if (this.i == 1) {
            if (f2 < 0.0f) return true;
            return false;
        }
        if (this.i != 2) return false;
        return true;
    }

    public boolean a(View view, int n2, float f2) {
        switch (this.a) {
            default: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: 
        }
        return this.b(view, n2, f2);
    }

    public int b(View view) {
        if (this.i == 0) {
            return view.getLeft();
        }
        if (this.i == 1 || this.i == 2) {
            return view.getLeft() + this.getBehindWidth();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(View view, Canvas canvas, float f2) {
        if (!this.q || this.r == null || this.s == null || !((String)this.s.getTag(2131165193)).equals((Object)"CustomViewBehindSelectedView")) {
            return;
        }
        canvas.save();
        int n2 = (int)((float)this.r.getWidth() * f2);
        if (this.i == 0) {
            int n3 = view.getLeft();
            n2 = n3 - n2;
            canvas.clipRect(n2, 0, n3, this.getHeight());
            canvas.drawBitmap(this.r, (float)n2, (float)this.getSelectorTop(), null);
        } else if (this.i == 1) {
            int n4 = view.getRight();
            canvas.clipRect(n4, 0, n2 += n4, this.getHeight());
            canvas.drawBitmap(this.r, (float)(n2 - this.r.getWidth()), (float)this.getSelectorTop(), null);
        }
        canvas.restore();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(float f2) {
        if (this.i == 0) {
            if (f2 < 0.0f) return true;
            return false;
        }
        if (this.i == 1) {
            if (f2 > 0.0f) return true;
            return false;
        }
        if (this.i != 2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(View view, int n2) {
        int n3 = view.getLeft();
        int n4 = view.getRight();
        if (this.i == 0) {
            if (n2 >= n3 && n2 <= n3 + this.e) return true;
            return false;
        }
        if (this.i == 1) {
            if (n2 <= n4 && n2 >= n4 - this.e) return true;
            return false;
        }
        if (this.i != 2) {
            return false;
        }
        if ((n2 < n3 || n2 > n3 + this.e) && (n2 > n4 || n2 < n4 - this.e)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(View view, int n2, float f2) {
        boolean bl2;
        boolean bl3 = false;
        if (this.i == 0 || this.i == 2 && n2 == 0) {
            bl2 = bl3;
            if (f2 < (float)view.getLeft()) return bl2;
            return true;
        }
        if (this.i != 1) {
            bl2 = bl3;
            if (this.i != 2) return bl2;
            bl2 = bl3;
            if (n2 != 2) return bl2;
        }
        bl2 = bl3;
        if (f2 > (float)view.getRight()) return bl2;
        return true;
    }

    protected void dispatchDraw(Canvas canvas) {
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h) {
            return false;
        }
        return true;
    }

    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        n2 = n4 - n2;
        n3 = n5 - n3;
        this.c.layout(0, 0, n2 - this.f, n3);
        if (this.d != null) {
            this.d.layout(0, 0, n2 - this.f, n3);
        }
    }

    protected void onMeasure(int n2, int n3) {
        int n4 = f.getDefaultSize((int)0, (int)n2);
        int n5 = f.getDefaultSize((int)0, (int)n3);
        this.setMeasuredDimension(n4, n5);
        n2 = f.getChildMeasureSpec((int)n2, (int)0, (int)(n4 - this.f));
        n3 = f.getChildMeasureSpec((int)n3, (int)0, (int)n5);
        this.c.measure(n2, n3);
        if (this.d != null) {
            this.d.measure(n2, n3);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h) {
            return false;
        }
        return true;
    }

    public void scrollTo(int n2, int n3) {
        super.scrollTo(n2, n3);
        if (this.g != null) {
            this.invalidate();
        }
    }

    public void setCanvasTransformer(l l2) {
        this.g = l2;
    }

    public void setChildrenEnabled(boolean bl2) {
        this.h = bl2;
    }

    public void setContent(View view) {
        if (this.c != null) {
            this.removeView(this.c);
        }
        this.c = view;
        this.addView(this.c);
    }

    public void setCustomViewAbove(a a2) {
        this.b = a2;
    }

    public void setFadeDegree(float f2) {
        if (f2 > 1.0f || f2 < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.p = f2;
    }

    public void setFadeEnabled(boolean bl2) {
        this.j = bl2;
    }

    public void setMarginThreshold(int n2) {
        this.e = n2;
    }

    public void setMode(int n2) {
        if (n2 == 0 || n2 == 1) {
            if (this.c != null) {
                this.c.setVisibility(0);
            }
            if (this.d != null) {
                this.d.setVisibility(4);
            }
        }
        this.i = n2;
    }

    public void setScrollScale(float f2) {
        this.l = f2;
    }

    public void setSecondaryContent(View view) {
        if (this.d != null) {
            this.removeView(this.d);
        }
        this.d = view;
        this.addView(this.d);
    }

    public void setSecondaryShadowDrawable(Drawable drawable) {
        this.n = drawable;
        this.invalidate();
    }

    public void setSelectedView(View view) {
        if (this.s != null) {
            this.s.setTag(2131165193, (Object)null);
            this.s = null;
        }
        if (view != null && view.getParent() != null) {
            this.s = view;
            this.s.setTag(2131165193, (Object)"CustomViewBehindSelectedView");
            this.invalidate();
        }
    }

    public void setSelectorBitmap(Bitmap bitmap) {
        this.r = bitmap;
        this.refreshDrawableState();
    }

    public void setSelectorEnabled(boolean bl2) {
        this.q = bl2;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.m = drawable;
        this.invalidate();
    }

    public void setShadowWidth(int n2) {
        this.o = n2;
        this.invalidate();
    }

    public void setTouchMode(int n2) {
        this.a = n2;
    }

    public void setWidthOffset(int n2) {
        this.f = n2;
        this.requestLayout();
    }
}

