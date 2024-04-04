/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
package android.support.v4.view;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ag;

class an
extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    private an(ViewPager viewPager) {
        this.a = viewPager;
    }

    /* synthetic */ an(ViewPager viewPager, ag ag2) {
        this(viewPager);
    }

    public void onChanged() {
        this.a.a();
    }

    public void onInvalidated() {
        this.a.a();
    }
}

