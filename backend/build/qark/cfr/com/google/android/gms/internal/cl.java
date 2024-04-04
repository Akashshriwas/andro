/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageButton
 */
package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.es;

public final class cl
extends FrameLayout
implements View.OnClickListener {
    private final Activity a;
    private final ImageButton b;

    public cl(Activity activity, int n2) {
        super((Context)activity);
        this.a = activity;
        this.setOnClickListener((View.OnClickListener)this);
        this.b = new ImageButton((Context)activity);
        this.b.setImageResource(17301527);
        this.b.setBackgroundColor(0);
        this.b.setOnClickListener((View.OnClickListener)this);
        this.b.setPadding(0, 0, 0, 0);
        n2 = es.a((Context)activity, n2);
        this.addView((View)this.b, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(n2, n2, 17));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(boolean bl2) {
        ImageButton imageButton = this.b;
        int n2 = bl2 ? 4 : 0;
        imageButton.setVisibility(n2);
    }

    public void onClick(View view) {
        this.a.finish();
    }
}

