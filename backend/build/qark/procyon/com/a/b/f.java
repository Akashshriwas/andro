// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.b;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class f implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ d a;
    
    f(final d a) {
        this.a = a;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        this.a.g.setStreamVolume(3, n, 0);
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
