// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class ft extends ImageView
{
    private Uri a;
    private int b;
    private int c;
    
    public int a() {
        return this.b;
    }
    
    public void a(final int b) {
        this.b = b;
    }
    
    public void a(final Uri a) {
        this.a = a;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != 0) {
            canvas.drawColor(this.c);
        }
    }
}
