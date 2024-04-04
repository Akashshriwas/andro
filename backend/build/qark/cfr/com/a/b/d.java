/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.media.AudioManager
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.Button
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.a.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.SeekBar;
import com.a.b.e;
import com.a.b.f;

public class d {
    Context a;
    AlertDialog.Builder b;
    public Button c;
    View d;
    AlertDialog e;
    private SeekBar f;
    private AudioManager g;
    private View.OnClickListener h;

    public d(Context context) {
        this.h = new e(this);
        this.a = context;
        this.b = new AlertDialog.Builder(context);
        this.d = View.inflate((Context)context, (int)2130903068, (ViewGroup)null);
        this.c = (Button)this.d.findViewById(2131165231);
        this.c.setOnClickListener(this.h);
        this.b.setView(this.d);
        this.e = this.b.create();
        this.e.setCanceledOnTouchOutside(false);
        this.b.setInverseBackgroundForced(true);
        this.f = (SeekBar)this.d.findViewById(2131165248);
        this.g = (AudioManager)context.getSystemService("audio");
        ((Activity)context).setVolumeControlStream(3);
        this.b();
    }

    static /* synthetic */ AudioManager a(d d2) {
        return d2.g;
    }

    private void b() {
        try {
            this.f.setMax(this.g.getStreamMaxVolume(3));
            this.f.setProgress(this.g.getStreamVolume(3));
            this.f.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)new f(this));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void a() {
        this.e.show();
        ViewGroup viewGroup = (ViewGroup)this.d.getParent();
        viewGroup.setPadding(0, 0, 0, 0);
        viewGroup.setBackgroundDrawable((Drawable)new ColorDrawable(0));
    }
}

