/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  java.lang.Object
 */
package com.a.b;

import android.widget.SeekBar;
import com.a.b.d;

class f
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ d a;

    f(d d2) {
        this.a = d2;
    }

    public void onProgressChanged(SeekBar seekBar, int n2, boolean bl2) {
        d.a(this.a).setStreamVolume(3, n2, 0);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}

