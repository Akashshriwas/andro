/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.SystemClock
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.internal.fp;
import com.google.android.gms.internal.fr;
import com.google.android.gms.internal.ht;

public final class fm
extends Drawable
implements Drawable.Callback {
    private int a = 0;
    private long b;
    private int c;
    private int d;
    private int e = 255;
    private int f;
    private int g = 0;
    private boolean h = true;
    private boolean i;
    private fr j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    public fm(Drawable object, Drawable object2) {
        this(null);
        Drawable drawable = object;
        if (object == null) {
            drawable = fp.a();
        }
        this.k = drawable;
        drawable.setCallback((Drawable.Callback)this);
        object = this.j;
        object.b |= drawable.getChangingConfigurations();
        object = object2;
        if (object2 == null) {
            object = fp.a();
        }
        this.l = object;
        object.setCallback((Drawable.Callback)this);
        object2 = this.j;
        object2.b |= object.getChangingConfigurations();
    }

    fm(fr fr2) {
        this.j = new fr(fr2);
    }

    public void a(int n2) {
        this.c = 0;
        this.d = this.e;
        this.g = 0;
        this.f = n2;
        this.a = 1;
        this.invalidateSelf();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a() {
        if (!this.m) {
            boolean bl2 = this.k.getConstantState() != null && this.l.getConstantState() != null;
            this.n = bl2;
            this.m = true;
        }
        return this.n;
    }

    public Drawable b() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        switch (this.a) {
            case 1: {
                this.b = SystemClock.uptimeMillis();
                this.a = 2;
                n3 = n4;
                break;
            }
            case 2: {
                if (this.b < 0L) break;
                float f2 = (float)(SystemClock.uptimeMillis() - this.b) / (float)this.f;
                n3 = f2 >= 1.0f ? n2 : 0;
                if (n3 != 0) {
                    this.a = 0;
                }
                f2 = Math.min((float)f2, (float)1.0f);
                float f3 = this.c;
                this.g = (int)(f2 * (float)(this.d - this.c) + f3);
            }
        }
        n2 = this.g;
        boolean bl2 = this.h;
        Drawable drawable = this.k;
        Drawable drawable2 = this.l;
        if (n3 != 0) {
            if (!bl2 || n2 == 0) {
                drawable.draw(canvas);
            }
            if (n2 == this.e) {
                drawable2.setAlpha(this.e);
                drawable2.draw(canvas);
            }
            return;
        }
        if (bl2) {
            drawable.setAlpha(this.e - n2);
        }
        drawable.draw(canvas);
        if (bl2) {
            drawable.setAlpha(this.e);
        }
        if (n2 > 0) {
            drawable2.setAlpha(n2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.e);
        }
        this.invalidateSelf();
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.j.a | this.j.b;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a()) {
            this.j.a = this.getChangingConfigurations();
            return this.j;
        }
        return null;
    }

    public int getIntrinsicHeight() {
        return Math.max((int)this.k.getIntrinsicHeight(), (int)this.l.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max((int)this.k.getIntrinsicWidth(), (int)this.l.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.o) {
            this.p = Drawable.resolveOpacity((int)this.k.getOpacity(), (int)this.l.getOpacity());
            this.o = true;
        }
        return this.p;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (ht.a() && (drawable = this.getCallback()) != null) {
            drawable.invalidateDrawable((Drawable)this);
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            if (!this.a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.k.mutate();
            this.l.mutate();
            this.i = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        this.k.setBounds(rect);
        this.l.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        if (ht.a() && (drawable = this.getCallback()) != null) {
            drawable.scheduleDrawable((Drawable)this, runnable, l2);
        }
    }

    public void setAlpha(int n2) {
        if (this.g == this.e) {
            this.g = n2;
        }
        this.e = n2;
        this.invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        this.l.setColorFilter(colorFilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (ht.a() && (drawable = this.getCallback()) != null) {
            drawable.unscheduleDrawable((Drawable)this, runnable);
        }
    }
}

