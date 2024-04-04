// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class fp extends Drawable
{
    private static final fp a;
    private static final fq b;
    
    static {
        a = new fp();
        b = new fq(null);
    }
    
    private fp() {
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public Drawable$ConstantState getConstantState() {
        return fp.b;
    }
    
    public int getOpacity() {
        return -2;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
