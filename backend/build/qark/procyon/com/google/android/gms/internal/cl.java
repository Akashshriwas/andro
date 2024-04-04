// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.widget.ImageButton;
import android.app.Activity;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class cl extends FrameLayout implements View$OnClickListener
{
    private final Activity a;
    private final ImageButton b;
    
    public cl(final Activity a, int a2) {
        super((Context)a);
        this.a = a;
        this.setOnClickListener((View$OnClickListener)this);
        (this.b = new ImageButton((Context)a)).setImageResource(17301527);
        this.b.setBackgroundColor(0);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.b.setPadding(0, 0, 0, 0);
        a2 = es.a((Context)a, a2);
        this.addView((View)this.b, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(a2, a2, 17));
    }
    
    public void a(final boolean b) {
        final ImageButton b2 = this.b;
        int visibility;
        if (b) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        b2.setVisibility(visibility);
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
