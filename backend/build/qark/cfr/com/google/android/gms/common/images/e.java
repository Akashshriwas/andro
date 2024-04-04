/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.images.a;
import com.google.android.gms.common.images.f;
import com.google.android.gms.internal.fm;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.ht;
import java.lang.ref.WeakReference;

public final class e {
    final f a;
    int b;
    private int c;
    private int d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private int h;
    private boolean i;
    private boolean j;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private fm a(Drawable drawable, Drawable drawable2) {
        Drawable drawable3;
        if (drawable != null) {
            drawable3 = drawable;
            if (drawable instanceof fm) {
                drawable3 = ((fm)drawable).b();
            }
            do {
                return new fm(drawable3, drawable2);
                break;
            } while (true);
        }
        drawable3 = null;
        return new fm(drawable3, drawable2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Drawable drawable, boolean bl2, boolean bl3, boolean bl4) {
        switch (this.b) {
            case 1: {
                a a2;
                if (bl3 || (a2 = (a)this.e.get()) == null) return;
                {
                    a2.a(this.a.a, drawable, bl4);
                    return;
                }
            }
            case 2: {
                ImageView imageView = (ImageView)this.f.get();
                if (imageView == null) return;
                {
                    this.a(imageView, drawable, bl2, bl3, bl4);
                    return;
                }
            }
            default: {
                return;
            }
            case 3: 
        }
        TextView textView = (TextView)this.g.get();
        if (textView == null) return;
        {
            this.a(textView, this.h, drawable, bl2, bl3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(ImageView imageView, Drawable drawable, boolean bl2, boolean bl3, boolean bl4) {
        block7 : {
            block6 : {
                int n2;
                block5 : {
                    n2 = !bl3 && !bl4 ? 1 : 0;
                    if (n2 == 0 || !(imageView instanceof ft)) break block5;
                    int n3 = ((ft)imageView).a();
                    if (this.c != 0 && n3 == this.c) break block6;
                }
                if (bl2 = this.a(bl2, bl3)) {
                    drawable = this.a(imageView.getDrawable(), drawable);
                }
                imageView.setImageDrawable(drawable);
                if (imageView instanceof ft) {
                    ft ft2 = (ft)imageView;
                    imageView = bl4 ? this.a.a : null;
                    ft2.a((Uri)imageView);
                    n2 = n2 != 0 ? this.c : 0;
                    ft2.a(n2);
                }
                if (bl2) break block7;
            }
            return;
        }
        ((fm)drawable).a(250);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(TextView textView, int n2, Drawable drawable, boolean bl2, boolean bl3) {
        bl2 = this.a(bl2, bl3);
        Drawable drawable2 = ht.b() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable drawable3 = drawable2[n2];
        if (bl2) {
            drawable = this.a(drawable3, drawable);
        }
        drawable3 = n2 == 0 ? drawable : drawable2[0];
        Drawable drawable4 = n2 == 1 ? drawable : drawable2[1];
        Drawable drawable5 = n2 == 2 ? drawable : drawable2[2];
        drawable2 = n2 == 3 ? drawable : drawable2[3];
        if (ht.b()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable3, drawable4, drawable5, drawable2);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable3, drawable4, drawable5, drawable2);
        }
        if (bl2) {
            ((fm)drawable).a(250);
        }
    }

    private boolean a(boolean bl2, boolean bl3) {
        if (this.i && !bl3 && (!bl2 || this.j)) {
            return true;
        }
        return false;
    }

    void a(Context context, Bitmap bitmap, boolean bl2) {
        fv.a((Object)bitmap);
        this.a((Drawable)new BitmapDrawable(context.getResources(), bitmap), bl2, false, true);
    }

    void a(Context context, boolean bl2) {
        Drawable drawable = null;
        if (this.c != 0) {
            drawable = context.getResources().getDrawable(this.c);
        }
        this.a(drawable, bl2, false, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = true;
        if (!(object instanceof e)) {
            return false;
        }
        boolean bl3 = bl2;
        if (this == object) return bl3;
        bl3 = bl2;
        if (((e)object).hashCode() == this.hashCode()) return bl3;
        return false;
    }

    public int hashCode() {
        return this.d;
    }
}

