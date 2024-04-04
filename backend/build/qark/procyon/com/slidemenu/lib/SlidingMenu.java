// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import android.os.Parcelable;
import android.annotation.SuppressLint;
import android.util.Log;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import a.a.a.b;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;
import android.widget.RelativeLayout;

public class SlidingMenu extends RelativeLayout
{
    private boolean a;
    private a b;
    private f c;
    private o d;
    private o e;
    private m f;
    private Handler g;
    
    public SlidingMenu(final Activity activity, final int n) {
        this((Context)activity, null);
        this.a(activity, n);
    }
    
    public SlidingMenu(final Context context) {
        this(context, null);
    }
    
    public SlidingMenu(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SlidingMenu(final Context context, final AttributeSet set, int selectorDrawable) {
        super(context, set, selectorDrawable);
        this.a = false;
        this.g = new Handler();
        this.addView((View)(this.c = new f(context)), (ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -1));
        this.addView((View)(this.b = new a(context)), (ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -1));
        this.b.setCustomViewBehind(this.c);
        this.c.setCustomViewAbove(this.b);
        this.b.setOnPageChangeListener(new j(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.a.a.b.SlidingMenu);
        this.setMode(obtainStyledAttributes.getInt(0, 0));
        selectorDrawable = obtainStyledAttributes.getResourceId(1, -1);
        if (selectorDrawable != -1) {
            this.setContent(selectorDrawable);
        }
        else {
            this.setContent((View)new FrameLayout(context));
        }
        selectorDrawable = obtainStyledAttributes.getResourceId(2, -1);
        if (selectorDrawable != -1) {
            this.setMenu(selectorDrawable);
        }
        else {
            this.setMenu((View)new FrameLayout(context));
        }
        this.setTouchModeAbove(obtainStyledAttributes.getInt(6, 0));
        this.setTouchModeBehind(obtainStyledAttributes.getInt(7, 0));
        selectorDrawable = (int)obtainStyledAttributes.getDimension(3, -1.0f);
        final int behindWidth = (int)obtainStyledAttributes.getDimension(4, -1.0f);
        if (selectorDrawable != -1 && behindWidth != -1) {
            throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
        }
        if (selectorDrawable != -1) {
            this.setBehindOffset(selectorDrawable);
        }
        else if (behindWidth != -1) {
            this.setBehindWidth(behindWidth);
        }
        else {
            this.setBehindOffset(0);
        }
        this.setBehindScrollScale(obtainStyledAttributes.getFloat(5, 0.33f));
        selectorDrawable = obtainStyledAttributes.getResourceId(8, -1);
        if (selectorDrawable != -1) {
            this.setShadowDrawable(selectorDrawable);
        }
        this.setShadowWidth((int)obtainStyledAttributes.getDimension(9, 0.0f));
        this.setFadeEnabled(obtainStyledAttributes.getBoolean(10, true));
        this.setFadeDegree(obtainStyledAttributes.getFloat(11, 0.33f));
        this.setSelectorEnabled(obtainStyledAttributes.getBoolean(12, false));
        selectorDrawable = obtainStyledAttributes.getResourceId(13, -1);
        if (selectorDrawable != -1) {
            this.setSelectorDrawable(selectorDrawable);
        }
        obtainStyledAttributes.recycle();
    }
    
    public void a() {
        this.a(true);
    }
    
    @TargetApi(11)
    public void a(final float n) {
        int n2 = 0;
        if (Build$VERSION.SDK_INT >= 11) {
            int n3;
            if (n > 0.0f && n < 1.0f) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            if (n3 != 0) {
                n2 = 2;
            }
            if (n2 != this.getContent().getLayerType()) {
                this.g.post((Runnable)new k(this, n2));
            }
        }
    }
    
    public void a(final Activity activity, final int n) {
        this.a(activity, n, false);
    }
    
    public void a(final Activity activity, final int n, final boolean a) {
        if (n != 0 && n != 1) {
            throw new IllegalArgumentException("slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT");
        }
        if (this.getParent() != null) {
            throw new IllegalStateException("This SlidingMenu appears to already be attached");
        }
        final TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[] { 16842836 });
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        switch (n) {
            case 0: {
                this.a = false;
                final ViewGroup viewGroup = (ViewGroup)activity.getWindow().getDecorView();
                final ViewGroup content = (ViewGroup)viewGroup.getChildAt(0);
                content.setBackgroundResource(resourceId);
                viewGroup.removeView((View)content);
                viewGroup.addView((View)this);
                this.setContent((View)content);
            }
            case 1: {
                this.a = a;
                final ViewGroup viewGroup2 = (ViewGroup)activity.findViewById(16908290);
                final View child = viewGroup2.getChildAt(0);
                viewGroup2.removeView(child);
                viewGroup2.addView((View)this);
                this.setContent(child);
                if (child.getBackground() == null) {
                    child.setBackgroundResource(resourceId);
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final boolean b) {
        this.b.a(0, b);
    }
    
    public void b() {
        this.c(true);
    }
    
    public void b(final boolean b) {
        this.b.a(2, b);
    }
    
    public void c(final boolean b) {
        this.b.a(1, b);
    }
    
    public boolean c() {
        return this.b.getCurrentItem() == 0 || this.b.getCurrentItem() == 2;
    }
    
    public boolean d() {
        return this.b.getCurrentItem() == 2;
    }
    
    @SuppressLint({ "NewApi" })
    protected boolean fitSystemWindows(final Rect rect) {
        final int left = rect.left;
        final int right = rect.right;
        final int top = rect.top;
        final int bottom = rect.bottom;
        if (!this.a) {
            Log.v("SlidingMenu", "setting padding!");
            this.setPadding(left, top, right, bottom);
        }
        return true;
    }
    
    public int getBehindOffset() {
        return ((RelativeLayout$LayoutParams)this.c.getLayoutParams()).rightMargin;
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
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final SlidingMenu$SavedState slidingMenu$SavedState = (SlidingMenu$SavedState)parcelable;
        super.onRestoreInstanceState(slidingMenu$SavedState.getSuperState());
        this.b.setCurrentItem(slidingMenu$SavedState.a());
    }
    
    protected Parcelable onSaveInstanceState() {
        return (Parcelable)new SlidingMenu$SavedState(super.onSaveInstanceState(), this.b.getCurrentItem());
    }
    
    public void setAboveOffset(final int aboveOffset) {
        this.b.setAboveOffset(aboveOffset);
    }
    
    public void setAboveOffsetRes(final int n) {
        this.setAboveOffset((int)this.getContext().getResources().getDimension(n));
    }
    
    public void setBehindCanvasTransformer(final l canvasTransformer) {
        this.c.setCanvasTransformer(canvasTransformer);
    }
    
    public void setBehindOffset(final int widthOffset) {
        this.c.setWidthOffset(widthOffset);
    }
    
    public void setBehindOffsetRes(final int n) {
        this.setBehindOffset((int)this.getContext().getResources().getDimension(n));
    }
    
    public void setBehindScrollScale(final float scrollScale) {
        if (scrollScale < 0.0f && scrollScale > 1.0f) {
            throw new IllegalStateException("ScrollScale must be between 0 and 1");
        }
        this.c.setScrollScale(scrollScale);
    }
    
    public void setBehindWidth(final int n) {
        final Display defaultDisplay = ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay();
        while (true) {
            try {
                final Point point = new Point();
                Display.class.getMethod("getSize", Point.class).invoke(defaultDisplay, point);
                final int n2 = point.x;
                this.setBehindOffset(n2 - n);
            }
            catch (Exception ex) {
                final int n2 = defaultDisplay.getWidth();
                continue;
            }
            break;
        }
    }
    
    public void setBehindWidthRes(final int n) {
        this.setBehindWidth((int)this.getContext().getResources().getDimension(n));
    }
    
    public void setContent(final int n) {
        this.setContent(LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)null));
    }
    
    public void setContent(final View content) {
        this.b.setContent(content);
        this.b();
    }
    
    public void setFadeDegree(final float fadeDegree) {
        this.c.setFadeDegree(fadeDegree);
    }
    
    public void setFadeEnabled(final boolean fadeEnabled) {
        this.c.setFadeEnabled(fadeEnabled);
    }
    
    public void setMenu(final int n) {
        this.setMenu(LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)null));
    }
    
    public void setMenu(final View content) {
        this.c.setContent(content);
    }
    
    public void setMode(final int mode) {
        if (mode != 0 && mode != 1 && mode != 2) {
            throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
        }
        this.c.setMode(mode);
    }
    
    public void setOnCloseListener(final m f) {
        this.f = f;
    }
    
    public void setOnClosedListener(final n onClosedListener) {
        this.b.setOnClosedListener(onClosedListener);
    }
    
    public void setOnOpenListener(final o d) {
        this.d = d;
    }
    
    public void setOnOpenedListener(final p onOpenedListener) {
        this.b.setOnOpenedListener(onOpenedListener);
    }
    
    public void setSecondaryMenu(final int n) {
        this.setSecondaryMenu(LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)null));
    }
    
    public void setSecondaryMenu(final View secondaryContent) {
        this.c.setSecondaryContent(secondaryContent);
    }
    
    public void setSecondaryOnOpenListner(final o e) {
        this.e = e;
    }
    
    public void setSecondaryShadowDrawable(final int n) {
        this.setSecondaryShadowDrawable(this.getContext().getResources().getDrawable(n));
    }
    
    public void setSecondaryShadowDrawable(final Drawable secondaryShadowDrawable) {
        this.c.setSecondaryShadowDrawable(secondaryShadowDrawable);
    }
    
    public void setSelectedView(final View selectedView) {
        this.c.setSelectedView(selectedView);
    }
    
    public void setSelectorBitmap(final Bitmap selectorBitmap) {
        this.c.setSelectorBitmap(selectorBitmap);
    }
    
    public void setSelectorDrawable(final int n) {
        this.c.setSelectorBitmap(BitmapFactory.decodeResource(this.getResources(), n));
    }
    
    public void setSelectorEnabled(final boolean b) {
        this.c.setSelectorEnabled(true);
    }
    
    public void setShadowDrawable(final int n) {
        this.setShadowDrawable(this.getContext().getResources().getDrawable(n));
    }
    
    public void setShadowDrawable(final Drawable shadowDrawable) {
        this.c.setShadowDrawable(shadowDrawable);
    }
    
    public void setShadowWidth(final int shadowWidth) {
        this.c.setShadowWidth(shadowWidth);
    }
    
    public void setShadowWidthRes(final int n) {
        this.setShadowWidth((int)this.getResources().getDimension(n));
    }
    
    public void setSlidingEnabled(final boolean slidingEnabled) {
        this.b.setSlidingEnabled(slidingEnabled);
    }
    
    public void setStatic(final boolean b) {
        if (b) {
            this.setSlidingEnabled(false);
            this.b.setCustomViewBehind(null);
            this.b.setCurrentItem(1);
            return;
        }
        this.b.setCurrentItem(1);
        this.b.setCustomViewBehind(this.c);
        this.setSlidingEnabled(true);
    }
    
    public void setTouchModeAbove(final int touchMode) {
        if (touchMode != 1 && touchMode != 0 && touchMode != 2) {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        this.b.setTouchMode(touchMode);
    }
    
    public void setTouchModeBehind(final int touchMode) {
        if (touchMode != 1 && touchMode != 0 && touchMode != 2) {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        this.c.setTouchMode(touchMode);
    }
    
    public void setTouchmodeMarginThreshold(final int marginThreshold) {
        this.c.setMarginThreshold(marginThreshold);
    }
}
