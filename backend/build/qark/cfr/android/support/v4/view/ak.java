/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class ak
extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c = 0.0f;
    public boolean d;

    public ak() {
        super(-1, -1);
    }

    public ak(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, ViewPager.e());
        this.b = context.getInteger(0, 48);
        context.recycle();
    }
}

