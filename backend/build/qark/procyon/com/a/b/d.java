// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.b;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.media.AudioManager;
import android.widget.SeekBar;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog$Builder;
import android.content.Context;

public class d
{
    Context a;
    AlertDialog$Builder b;
    public Button c;
    View d;
    AlertDialog e;
    private SeekBar f;
    private AudioManager g;
    private View$OnClickListener h;
    
    public d(final Context a) {
        this.h = (View$OnClickListener)new e(this);
        this.a = a;
        this.b = new AlertDialog$Builder(a);
        this.d = View.inflate(a, 2130903068, (ViewGroup)null);
        (this.c = (Button)this.d.findViewById(2131165231)).setOnClickListener(this.h);
        this.b.setView(this.d);
        (this.e = this.b.create()).setCanceledOnTouchOutside(false);
        this.b.setInverseBackgroundForced(true);
        this.f = (SeekBar)this.d.findViewById(2131165248);
        this.g = (AudioManager)a.getSystemService("audio");
        ((Activity)a).setVolumeControlStream(3);
        this.b();
    }
    
    private void b() {
        try {
            this.f.setMax(this.g.getStreamMaxVolume(3));
            this.f.setProgress(this.g.getStreamVolume(3));
            this.f.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new f(this));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void a() {
        this.e.show();
        final ViewGroup viewGroup = (ViewGroup)this.d.getParent();
        viewGroup.setPadding(0, 0, 0, 0);
        viewGroup.setBackgroundDrawable((Drawable)new ColorDrawable(0));
    }
}
