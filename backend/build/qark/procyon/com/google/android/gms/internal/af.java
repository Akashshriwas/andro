// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.os.SystemClock;
import java.util.Map;
import android.util.DisplayMetrics;

public final class af implements ad
{
    private static int a(final DisplayMetrics displayMetrics, Map s, final String str, final int n) {
        s = ((Map<K, String>)s).get(str);
        int a = n;
        if (s == null) {
            return a;
        }
        try {
            a = es.a(displayMetrics, Integer.parseInt(s));
            return a;
        }
        catch (NumberFormatException ex) {
            et.e("Could not parse " + str + " in a video GMSG: " + s);
            return n;
        }
    }
    
    @Override
    public void a(ev ev, final Map map) {
        final String s = map.get("action");
        if (s == null) {
            et.e("Action missing from video GMSG.");
            return;
        }
        final cc c = ev.c();
        if (c == null) {
            et.e("Could not get ad overlay for a video GMSG.");
            return;
        }
        final boolean equalsIgnoreCase = "new".equalsIgnoreCase(s);
        final boolean equalsIgnoreCase2 = "position".equalsIgnoreCase(s);
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            final DisplayMetrics displayMetrics = ev.getContext().getResources().getDisplayMetrics();
            final int a = a(displayMetrics, map, "x", 0);
            final int a2 = a(displayMetrics, map, "y", 0);
            final int a3 = a(displayMetrics, map, "w", -1);
            final int a4 = a(displayMetrics, map, "h", -1);
            if (equalsIgnoreCase && c.b() == null) {
                c.b(a, a2, a3, a4);
                return;
            }
            c.a(a, a2, a3, a4);
        }
        else {
            final ci b = c.b();
            if (b == null) {
                ci.a(ev, "no_video_view", (String)null);
                return;
            }
            if ("click".equalsIgnoreCase(s)) {
                final DisplayMetrics displayMetrics2 = ev.getContext().getResources().getDisplayMetrics();
                final int a5 = a(displayMetrics2, map, "x", 0);
                final int a6 = a(displayMetrics2, map, "y", 0);
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float)a5, (float)a6, 0);
                b.a(obtain);
                obtain.recycle();
                return;
            }
            if ("controls".equalsIgnoreCase(s)) {
                final String s2 = map.get("enabled");
                if (s2 == null) {
                    et.e("Enabled parameter missing from controls video GMSG.");
                    return;
                }
                b.a(Boolean.parseBoolean(s2));
            }
            else {
                if ("currentTime".equalsIgnoreCase(s)) {
                    ev = (ev)map.get("time");
                    if (ev == null) {
                        et.e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        b.a((int)(Float.parseFloat((String)ev) * 1000.0f));
                        return;
                    }
                    catch (NumberFormatException ex) {
                        et.e("Could not parse time parameter from currentTime video GMSG: " + (String)ev);
                        return;
                    }
                }
                if ("hide".equalsIgnoreCase(s)) {
                    b.setVisibility(4);
                    return;
                }
                if ("load".equalsIgnoreCase(s)) {
                    b.b();
                    return;
                }
                if ("pause".equalsIgnoreCase(s)) {
                    b.c();
                    return;
                }
                if ("play".equalsIgnoreCase(s)) {
                    b.d();
                    return;
                }
                if ("show".equalsIgnoreCase(s)) {
                    b.setVisibility(0);
                    return;
                }
                if ("src".equalsIgnoreCase(s)) {
                    b.a(map.get("src"));
                    return;
                }
                et.e("Unknown video action: " + s);
            }
        }
    }
}
