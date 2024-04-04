// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.images;

import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.internal.fv;
import android.graphics.Bitmap;
import android.content.Context;
import com.google.android.gms.internal.ht;
import android.net.Uri;
import com.google.android.gms.internal.ft;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.gms.internal.fm;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public final class e
{
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
    
    private fm a(final Drawable drawable, final Drawable drawable2) {
        Drawable b;
        if (drawable != null) {
            b = drawable;
            if (drawable instanceof fm) {
                b = ((fm)drawable).b();
            }
        }
        else {
            b = null;
        }
        return new fm(b, drawable2);
    }
    
    private void a(final Drawable drawable, final boolean b, final boolean b2, final boolean b3) {
        switch (this.b) {
            case 1: {
                if (b2) {
                    break;
                }
                final a a = (a)this.e.get();
                if (a != null) {
                    a.a(this.a.a, drawable, b3);
                    return;
                }
                break;
            }
            case 2: {
                final ImageView imageView = (ImageView)this.f.get();
                if (imageView != null) {
                    this.a(imageView, drawable, b, b2, b3);
                    return;
                }
                break;
            }
            case 3: {
                final TextView textView = (TextView)this.g.get();
                if (textView != null) {
                    this.a(textView, this.h, drawable, b, b2);
                    return;
                }
                break;
            }
        }
    }
    
    private void a(final ImageView imageView, Drawable a, final boolean b, final boolean b2, final boolean b3) {
        boolean b4;
        if (!b2 && !b3) {
            b4 = true;
        }
        else {
            b4 = false;
        }
        Label_0057: {
            if (!b4 || !(imageView instanceof ft)) {
                break Label_0057;
            }
            final int a2 = ((ft)imageView).a();
            if (this.c == 0 || a2 != this.c) {
                break Label_0057;
            }
            return;
        }
        final boolean a3 = this.a(b, b2);
        if (a3) {
            a = this.a(imageView.getDrawable(), a);
        }
        imageView.setImageDrawable(a);
        if (imageView instanceof ft) {
            final ft ft = (ft)imageView;
            Uri a4;
            if (b3) {
                a4 = this.a.a;
            }
            else {
                a4 = null;
            }
            ft.a(a4);
            int c;
            if (b4) {
                c = this.c;
            }
            else {
                c = 0;
            }
            ft.a(c);
        }
        if (a3) {
            ((fm)a).a(250);
        }
    }
    
    private void a(final TextView textView, final int n, Drawable a, final boolean b, final boolean b2) {
        final boolean a2 = this.a(b, b2);
        Drawable[] array;
        if (ht.b()) {
            array = textView.getCompoundDrawablesRelative();
        }
        else {
            array = textView.getCompoundDrawables();
        }
        final Drawable drawable = array[n];
        if (a2) {
            a = this.a(drawable, a);
        }
        Drawable drawable2;
        if (n == 0) {
            drawable2 = a;
        }
        else {
            drawable2 = array[0];
        }
        Drawable drawable3;
        if (n == 1) {
            drawable3 = a;
        }
        else {
            drawable3 = array[1];
        }
        Drawable drawable4;
        if (n == 2) {
            drawable4 = a;
        }
        else {
            drawable4 = array[2];
        }
        Drawable drawable5;
        if (n == 3) {
            drawable5 = a;
        }
        else {
            drawable5 = array[3];
        }
        if (ht.b()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        if (a2) {
            ((fm)a).a(250);
        }
    }
    
    private boolean a(final boolean b, final boolean b2) {
        return this.i && !b2 && (!b || this.j);
    }
    
    void a(final Context context, final Bitmap bitmap, final boolean b) {
        fv.a(bitmap);
        this.a((Drawable)new BitmapDrawable(context.getResources(), bitmap), b, false, true);
    }
    
    void a(final Context context, final boolean b) {
        Drawable drawable = null;
        if (this.c != 0) {
            drawable = context.getResources().getDrawable(this.c);
        }
        this.a(drawable, b, false, false);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof e)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (this != o) {
                b2 = b;
                if (((e)o).hashCode() != this.hashCode()) {
                    return false;
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return this.d;
    }
}
