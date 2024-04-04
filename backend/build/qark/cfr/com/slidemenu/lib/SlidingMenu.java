/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.Display
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.WindowManager
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package com.slidemenu.lib;

import a.a.a.b;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.slidemenu.lib.SlidingMenu$SavedState;
import com.slidemenu.lib.a;
import com.slidemenu.lib.d;
import com.slidemenu.lib.f;
import com.slidemenu.lib.j;
import com.slidemenu.lib.k;
import com.slidemenu.lib.l;
import com.slidemenu.lib.m;
import com.slidemenu.lib.n;
import com.slidemenu.lib.o;
import com.slidemenu.lib.p;
import java.lang.reflect.Method;

public class SlidingMenu
extends RelativeLayout {
    private boolean a = false;
    private a b;
    private f c;
    private o d;
    private o e;
    private m f;
    private Handler g = new Handler();

    public SlidingMenu(Activity activity, int n2) {
        this((Context)activity, null);
        this.a(activity, n2);
    }

    public SlidingMenu(Context context) {
        this(context, null);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public SlidingMenu(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.c = new f(context);
        this.addView((View)this.c, (ViewGroup.LayoutParams)layoutParams);
        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.b = new a(context);
        this.addView((View)this.b, (ViewGroup.LayoutParams)layoutParams);
        this.b.setCustomViewBehind(this.c);
        this.c.setCustomViewAbove(this.b);
        this.b.setOnPageChangeListener(new j(this));
        attributeSet = context.obtainStyledAttributes(attributeSet, b.SlidingMenu);
        this.setMode(attributeSet.getInt(0, 0));
        n2 = attributeSet.getResourceId(1, -1);
        if (n2 != -1) {
            this.setContent(n2);
        } else {
            this.setContent((View)new FrameLayout(context));
        }
        if ((n2 = attributeSet.getResourceId(2, -1)) != -1) {
            this.setMenu(n2);
        } else {
            this.setMenu((View)new FrameLayout(context));
        }
        this.setTouchModeAbove(attributeSet.getInt(6, 0));
        this.setTouchModeBehind(attributeSet.getInt(7, 0));
        n2 = (int)attributeSet.getDimension(3, -1.0f);
        int n3 = (int)attributeSet.getDimension(4, -1.0f);
        if (n2 != -1 && n3 != -1) {
            throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
        }
        if (n2 != -1) {
            this.setBehindOffset(n2);
        } else if (n3 != -1) {
            this.setBehindWidth(n3);
        } else {
            this.setBehindOffset(0);
        }
        this.setBehindScrollScale(attributeSet.getFloat(5, 0.33f));
        n2 = attributeSet.getResourceId(8, -1);
        if (n2 != -1) {
            this.setShadowDrawable(n2);
        }
        this.setShadowWidth((int)attributeSet.getDimension(9, 0.0f));
        this.setFadeEnabled(attributeSet.getBoolean(10, true));
        this.setFadeDegree(attributeSet.getFloat(11, 0.33f));
        this.setSelectorEnabled(attributeSet.getBoolean(12, false));
        n2 = attributeSet.getResourceId(13, -1);
        if (n2 != -1) {
            this.setSelectorDrawable(n2);
        }
        attributeSet.recycle();
    }

    static /* synthetic */ o a(SlidingMenu slidingMenu) {
        return slidingMenu.d;
    }

    static /* synthetic */ m b(SlidingMenu slidingMenu) {
        return slidingMenu.f;
    }

    static /* synthetic */ o c(SlidingMenu slidingMenu) {
        return slidingMenu.e;
    }

    public void a() {
        this.a(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @TargetApi(value=11)
    public void a(float f2) {
        int n2 = 0;
        if (Build.VERSION.SDK_INT < 11) {
            return;
        }
        boolean bl2 = f2 > 0.0f && f2 < 1.0f;
        if (bl2) {
            n2 = 2;
        }
        if (n2 == this.getContent().getLayerType()) return;
        this.g.post((Runnable)new k(this, n2));
    }

    public void a(Activity activity, int n2) {
        this.a(activity, n2, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(Activity activity, int n2, boolean bl2) {
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException("slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT");
        }
        if (this.getParent() != null) {
            throw new IllegalStateException("This SlidingMenu appears to already be attached");
        }
        TypedArray typedArray = activity.getTheme().obtainStyledAttributes(new int[]{16842836});
        int n3 = typedArray.getResourceId(0, 0);
        typedArray.recycle();
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                this.a = false;
                activity = (ViewGroup)activity.getWindow().getDecorView();
                typedArray = (ViewGroup)activity.getChildAt(0);
                typedArray.setBackgroundResource(n3);
                activity.removeView((View)typedArray);
                activity.addView((View)this);
                this.setContent((View)typedArray);
                return;
            }
            case 1: {
                this.a = bl2;
                activity = (ViewGroup)activity.findViewById(16908290);
                typedArray = activity.getChildAt(0);
                activity.removeView((View)typedArray);
                activity.addView((View)this);
                this.setContent((View)typedArray);
                if (typedArray.getBackground() != null) return;
                typedArray.setBackgroundResource(n3);
                return;
            }
        }
    }

    public void a(boolean bl2) {
        this.b.a(0, bl2);
    }

    public void b() {
        this.c(true);
    }

    public void b(boolean bl2) {
        this.b.a(2, bl2);
    }

    public void c(boolean bl2) {
        this.b.a(1, bl2);
    }

    public boolean c() {
        if (this.b.getCurrentItem() != 0 && this.b.getCurrentItem() != 2) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (this.b.getCurrentItem() == 2) {
            return true;
        }
        return false;
    }

    @SuppressLint(value={"NewApi"})
    protected boolean fitSystemWindows(Rect rect) {
        int n2 = rect.left;
        int n3 = rect.right;
        int n4 = rect.top;
        int n5 = rect.bottom;
        if (!this.a) {
            Log.v((String)"SlidingMenu", (String)"setting padding!");
            this.setPadding(n2, n4, n3, n5);
        }
        return true;
    }

    public int getBehindOffset() {
        return ((RelativeLayout.LayoutParams)this.c.getLayoutParams()).rightMargin;
    }

    public float getBehindScrollScale() {
        return this.c.getScrollScale();
    }

    public View getContent() {
        return this.b.getContent();
    }

    public View getMenu() {
        return this.c.getContent();
    }

    public int getMode() {
        return this.c.getMode();
    }

    public View getSecondaryMenu() {
        return this.c.getSecondaryContent();
    }

    public int getTouchModeAbove() {
        return this.b.getTouchMode();
    }

    public int getTouchmodeMarginThreshold() {
        return this.c.getMarginThreshold();
    }

    protected void onRestoreInstanceState(Parcelable object) {
        object = (SlidingMenu$SavedState)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.b.setCurrentItem(object.a());
    }

    protected Parcelable onSaveInstanceState() {
        return new SlidingMenu$SavedState(super.onSaveInstanceState(), this.b.getCurrentItem());
    }

    public void setAboveOffset(int n2) {
        this.b.setAboveOffset(n2);
    }

    public void setAboveOffsetRes(int n2) {
        this.setAboveOffset((int)this.getContext().getResources().getDimension(n2));
    }

    public void setBehindCanvasTransformer(l l2) {
        this.c.setCanvasTransformer(l2);
    }

    public void setBehindOffset(int n2) {
        this.c.setWidthOffset(n2);
    }

    public void setBehindOffsetRes(int n2) {
        this.setBehindOffset((int)this.getContext().getResources().getDimension(n2));
    }

    public void setBehindScrollScale(float f2) {
        if (f2 < 0.0f && f2 > 1.0f) {
            throw new IllegalStateException("ScrollScale must be between 0 and 1");
        }
        this.c.setScrollScale(f2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBehindWidth(int n2) {
        int n3;
        Display display = ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay();
        try {
            Point point = new Point();
            Display.class.getMethod("getSize", new Class[]{Point.class}).invoke((Object)display, new Object[]{point});
            n3 = point.x;
        }
        catch (Exception exception) {
            n3 = display.getWidth();
        }
        this.setBehindOffset(n3 - n2);
    }

    public void setBehindWidthRes(int n2) {
        this.setBehindWidth((int)this.getContext().getResources().getDimension(n2));
    }

    public void setContent(int n2) {
        this.setContent(LayoutInflater.from((Context)this.getContext()).inflate(n2, null));
    }

    public void setContent(View view) {
        this.b.setContent(view);
        this.b();
    }

    public void setFadeDegree(float f2) {
        this.c.setFadeDegree(f2);
    }

    public void setFadeEnabled(boolean bl2) {
        this.c.setFadeEnabled(bl2);
    }

    public void setMenu(int n2) {
        this.setMenu(LayoutInflater.from((Context)this.getContext()).inflate(n2, null));
    }

    public void setMenu(View view) {
        this.c.setContent(view);
    }

    public void setMode(int n2) {
        if (n2 != 0 && n2 != 1 && n2 != 2) {
            throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
        }
        this.c.setMode(n2);
    }

    public void setOnCloseListener(m m2) {
        this.f = m2;
    }

    public void setOnClosedListener(n n2) {
        this.b.setOnClosedListener(n2);
    }

    public void setOnOpenListener(o o2) {
        this.d = o2;
    }

    public void setOnOpenedListener(p p2) {
        this.b.setOnOpenedListener(p2);
    }

    public void setSecondaryMenu(int n2) {
        this.setSecondaryMenu(LayoutInflater.from((Context)this.getContext()).inflate(n2, null));
    }

    public void setSecondaryMenu(View view) {
        this.c.setSecondaryContent(view);
    }

    public void setSecondaryOnOpenListner(o o2) {
        this.e = o2;
    }

    public void setSecondaryShadowDrawable(int n2) {
        this.setSecondaryShadowDrawable(this.getContext().getResources().getDrawable(n2));
    }

    public void setSecondaryShadowDrawable(Drawable drawable) {
        this.c.setSecondaryShadowDrawable(drawable);
    }

    public void setSelectedView(View view) {
        this.c.setSelectedView(view);
    }

    public void setSelectorBitmap(Bitmap bitmap) {
        this.c.setSelectorBitmap(bitmap);
    }

    public void setSelectorDrawable(int n2) {
        this.c.setSelectorBitmap(BitmapFactory.decodeResource((Resources)this.getResources(), (int)n2));
    }

    public void setSelectorEnabled(boolean bl2) {
        this.c.setSelectorEnabled(true);
    }

    public void setShadowDrawable(int n2) {
        this.setShadowDrawable(this.getContext().getResources().getDrawable(n2));
    }

    public void setShadowDrawable(Drawable drawable) {
        this.c.setShadowDrawable(drawable);
    }

    public void setShadowWidth(int n2) {
        this.c.setShadowWidth(n2);
    }

    public void setShadowWidthRes(int n2) {
        this.setShadowWidth((int)this.getResources().getDimension(n2));
    }

    public void setSlidingEnabled(boolean bl2) {
        this.b.setSlidingEnabled(bl2);
    }

    public void setStatic(boolean bl2) {
        if (bl2) {
            this.setSlidingEnabled(false);
            this.b.setCustomViewBehind(null);
            this.b.setCurrentItem(1);
            return;
        }
        this.b.setCurrentItem(1);
        this.b.setCustomViewBehind(this.c);
        this.setSlidingEnabled(true);
    }

    public void setTouchModeAbove(int n2) {
        if (n2 != 1 && n2 != 0 && n2 != 2) {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        this.b.setTouchMode(n2);
    }

    public void setTouchModeBehind(int n2) {
        if (n2 != 1 && n2 != 0 && n2 != 2) {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        this.c.setTouchMode(n2);
    }

    public void setTouchmodeMarginThreshold(int n2) {
        this.c.setMarginThreshold(n2);
    }
}

