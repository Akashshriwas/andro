// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

final class fr extends Drawable$ConstantState
{
    int a;
    int b;
    
    fr(final fr fr) {
        if (fr != null) {
            this.a = fr.a;
            this.b = fr.b;
        }
    }
    
    public int getChangingConfigurations() {
        return this.a;
    }
    
    public Drawable newDrawable() {
        return new fm(this);
    }
}
