// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.os.SystemClock;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public final class fm extends Drawable implements Drawable$Callback
{
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private fr j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    
    public fm(Drawable a, final Drawable drawable) {
        this(null);
        Drawable a2 = a;
        if (a == null) {
            a2 = fp.a;
        }
        (this.k = a2).setCallback((Drawable$Callback)this);
        final fr j = this.j;
        j.b |= a2.getChangingConfigurations();
        if ((a = drawable) == null) {
            a = fp.a;
        }
        (this.l = a).setCallback((Drawable$Callback)this);
        final fr i = this.j;
        i.b |= a.getChangingConfigurations();
    }
    
    fm(final fr fr) {
        this.a = 0;
        this.e = 255;
        this.g = 0;
        this.h = true;
        this.j = new fr(fr);
    }
    
    public void a(final int f) {
        this.c = 0;
        this.d = this.e;
        this.g = 0;
        this.f = f;
        this.a = 1;
        this.invalidateSelf();
    }
    
    public boolean a() {
        if (!this.m) {
            this.n = (this.k.getConstantState() != null && this.l.getConstantState() != null);
            this.m = true;
        }
        return this.n;
    }
    
    public Drawable b() {
        return this.l;
    }
    
    public void draw(final Canvas canvas) {
        final boolean b = true;
        boolean b2 = true;
        final boolean b3 = false;
        switch (this.a) {
            case 1: {
                this.b = SystemClock.uptimeMillis();
                this.a = 2;
                b2 = b3;
                break;
            }
            case 2: {
                if (this.b >= 0L) {
                    final float a = (SystemClock.uptimeMillis() - this.b) / (float)this.f;
                    b2 = (a >= 1.0f && b);
                    if (b2) {
                        this.a = 0;
                    }
                    this.g = (int)(Math.min(a, 1.0f) * (this.d - this.c) + this.c);
                    break;
                }
                break;
            }
        }
        final int g = this.g;
        final boolean h = this.h;
        final Drawable k = this.k;
        final Drawable l = this.l;
        if (b2) {
            if (!h || g == 0) {
                k.draw(canvas);
            }
            if (g == this.e) {
                l.setAlpha(this.e);
                l.draw(canvas);
            }
            return;
        }
        if (h) {
            k.setAlpha(this.e - g);
        }
        k.draw(canvas);
        if (h) {
            k.setAlpha(this.e);
        }
        if (g > 0) {
            l.setAlpha(g);
            l.draw(canvas);
            l.setAlpha(this.e);
        }
        this.invalidateSelf();
    }
    
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.j.a | this.j.b;
    }
    
    public Drawable$ConstantState getConstantState() {
        if (this.a()) {
            this.j.a = this.getChangingConfigurations();
            return this.j;
        }
        return null;
    }
    
    public int getIntrinsicHeight() {
        return Math.max(this.k.getIntrinsicHeight(), this.l.getIntrinsicHeight());
    }
    
    public int getIntrinsicWidth() {
        return Math.max(this.k.getIntrinsicWidth(), this.l.getIntrinsicWidth());
    }
    
    public int getOpacity() {
        if (!this.o) {
            this.p = Drawable.resolveOpacity(this.k.getOpacity(), this.l.getOpacity());
            this.o = true;
        }
        return this.p;
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (ht.a()) {
            final Drawable$Callback callback = this.getCallback();
            if (callback != null) {
                callback.invalidateDrawable((Drawable)this);
            }
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
    
    protected void onBoundsChange(final Rect rect) {
        this.k.setBounds(rect);
        this.l.setBounds(rect);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        if (ht.a()) {
            final Drawable$Callback callback = this.getCallback();
            if (callback != null) {
                callback.scheduleDrawable((Drawable)this, runnable, n);
            }
        }
    }
    
    public void setAlpha(final int n) {
        if (this.g == this.e) {
            this.g = n;
        }
        this.e = n;
        this.invalidateSelf();
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        this.l.setColorFilter(colorFilter);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        if (ht.a()) {
            final Drawable$Callback callback = this.getCallback();
            if (callback != null) {
                callback.unscheduleDrawable((Drawable)this, runnable);
            }
        }
    }
}
