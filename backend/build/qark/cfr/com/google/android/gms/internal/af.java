/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import java.util.Map;

public final class af
implements ad {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(DisplayMetrics displayMetrics, Map object, String string, int n2) {
        object = (String)object.get((Object)string);
        int n3 = n2;
        if (object == null) return n3;
        try {
            return es.a(displayMetrics, Integer.parseInt((String)object));
        }
        catch (NumberFormatException numberFormatException) {
            et.e("Could not parse " + string + " in a video GMSG: " + (String)object);
            return n2;
        }
    }

    @Override
    public void a(ev object, Map map) {
        String string = (String)map.get((Object)"action");
        if (string == null) {
            et.e("Action missing from video GMSG.");
            return;
        }
        Object object2 = object.c();
        if (object2 == null) {
            et.e("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean bl2 = "new".equalsIgnoreCase(string);
        boolean bl3 = "position".equalsIgnoreCase(string);
        if (bl2 || bl3) {
            object = object.getContext().getResources().getDisplayMetrics();
            int n2 = af.a((DisplayMetrics)object, map, "x", 0);
            int n3 = af.a((DisplayMetrics)object, map, "y", 0);
            int n4 = af.a((DisplayMetrics)object, map, "w", -1);
            int n5 = af.a((DisplayMetrics)object, map, "h", -1);
            if (bl2 && object2.b() == null) {
                object2.b(n2, n3, n4, n5);
                return;
            }
            object2.a(n2, n3, n4, n5);
            return;
        }
        if ((object2 = object2.b()) == null) {
            ci.a((ev)((Object)object), "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(string)) {
            object = object.getContext().getResources().getDisplayMetrics();
            int n6 = af.a((DisplayMetrics)object, map, "x", 0);
            int n7 = af.a((DisplayMetrics)object, map, "y", 0);
            long l2 = SystemClock.uptimeMillis();
            object = MotionEvent.obtain((long)l2, (long)l2, (int)0, (float)n6, (float)n7, (int)0);
            object2.a((MotionEvent)object);
            object.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(string)) {
            object = (String)map.get((Object)"enabled");
            if (object == null) {
                et.e("Enabled parameter missing from controls video GMSG.");
                return;
            }
            object2.a(Boolean.parseBoolean((String)object));
            return;
        }
        if ("currentTime".equalsIgnoreCase(string)) {
            object = (String)map.get((Object)"time");
            if (object == null) {
                et.e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                object2.a((int)(Float.parseFloat((String)object) * 1000.0f));
                return;
            }
            catch (NumberFormatException numberFormatException) {
                et.e("Could not parse time parameter from currentTime video GMSG: " + (String)object);
                return;
            }
        }
        if ("hide".equalsIgnoreCase(string)) {
            object2.setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(string)) {
            object2.b();
            return;
        }
        if ("pause".equalsIgnoreCase(string)) {
            object2.c();
            return;
        }
        if ("play".equalsIgnoreCase(string)) {
            object2.d();
            return;
        }
        if ("show".equalsIgnoreCase(string)) {
            object2.setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(string)) {
            object2.a((String)map.get((Object)"src"));
            return;
        }
        et.e("Unknown video action: " + string);
    }
}

