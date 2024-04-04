/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.lang.Object
 */
package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.common.images.f;
import com.google.android.gms.internal.hd;

final class b
extends hd {
    protected int a(f f2, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    @Override
    protected /* synthetic */ int a(Object object, Object object2) {
        return this.a((f)object, (Bitmap)object2);
    }

    protected void a(boolean bl2, f f2, Bitmap bitmap, Bitmap bitmap2) {
        super.a(bl2, f2, (Object)bitmap, (Object)bitmap2);
    }

    @Override
    protected /* synthetic */ void a(boolean bl2, Object object, Object object2, Object object3) {
        this.a(bl2, (f)object, (Bitmap)object2, (Bitmap)object3);
    }
}

