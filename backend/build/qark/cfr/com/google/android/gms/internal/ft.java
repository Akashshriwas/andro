/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.net.Uri
 *  android.widget.ImageView
 */
package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class ft
extends ImageView {
    private Uri a;
    private int b;
    private int c;

    public int a() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void a(Uri uri) {
        this.a = uri;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != 0) {
            canvas.drawColor(this.c);
        }
    }
}

