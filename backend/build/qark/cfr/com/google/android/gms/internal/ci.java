/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.MediaController
 *  android.widget.VideoView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.android.gms.internal.cj;
import com.google.android.gms.internal.ev;
import java.util.HashMap;
import java.util.Map;

public final class ci
extends FrameLayout
implements MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener,
MediaPlayer.OnPreparedListener {
    private final ev a;
    private final MediaController b;
    private final cj c;
    private final VideoView d;
    private long e;
    private String f;

    public ci(Context context, ev ev2) {
        super(context);
        this.a = ev2;
        this.d = new VideoView(context);
        ev2 = new FrameLayout.LayoutParams(-1, -1, 17);
        this.addView((View)this.d, (ViewGroup.LayoutParams)ev2);
        this.b = new MediaController(context);
        this.c = new cj(this);
        this.c.b();
        this.d.setOnCompletionListener((MediaPlayer.OnCompletionListener)this);
        this.d.setOnPreparedListener((MediaPlayer.OnPreparedListener)this);
        this.d.setOnErrorListener((MediaPlayer.OnErrorListener)this);
    }

    private static void a(ev ev2, String string) {
        ci.a(ev2, string, (Map)new HashMap(1));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(ev ev2, String string, String string2) {
        boolean bl2 = string2 == null;
        int n2 = bl2 ? 2 : 3;
        HashMap hashMap = new HashMap(n2);
        hashMap.put((Object)"what", (Object)string);
        if (!bl2) {
            hashMap.put((Object)"extra", (Object)string2);
        }
        ci.a(ev2, "error", (Map)hashMap);
    }

    private static void a(ev ev2, String string, String string2, String string3) {
        HashMap hashMap = new HashMap(2);
        hashMap.put((Object)string2, (Object)string3);
        ci.a(ev2, string, (Map)hashMap);
    }

    private static void a(ev ev2, String string, Map map) {
        map.put((Object)"event", (Object)string);
        ev2.a("onVideoEvent", map);
    }

    public void a() {
        this.c.a();
        this.d.stopPlayback();
    }

    public void a(int n2) {
        this.d.seekTo(n2);
    }

    public void a(MotionEvent motionEvent) {
        this.d.dispatchTouchEvent(motionEvent);
    }

    public void a(String string) {
        this.f = string;
    }

    public void a(boolean bl2) {
        if (bl2) {
            this.d.setMediaController(this.b);
            return;
        }
        this.b.hide();
        this.d.setMediaController(null);
    }

    public void b() {
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            this.d.setVideoPath(this.f);
            return;
        }
        ci.a(this.a, "no_src", null);
    }

    public void c() {
        this.d.pause();
    }

    public void d() {
        this.d.start();
    }

    public void e() {
        long l2 = this.d.getCurrentPosition();
        if (this.e != l2) {
            float f2 = (float)l2 / 1000.0f;
            ci.a(this.a, "timeupdate", "time", String.valueOf((float)f2));
            this.e = l2;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        ci.a(this.a, "ended");
    }

    public boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        ci.a(this.a, String.valueOf((int)n2), String.valueOf((int)n3));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        float f2 = (float)this.d.getDuration() / 1000.0f;
        ci.a(this.a, "canplaythrough", "duration", String.valueOf((float)f2));
    }
}

