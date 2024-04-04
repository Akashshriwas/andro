// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Date;
import android.graphics.Color;
import java.util.Map;
import android.os.Bundle;
import java.util.HashMap;
import android.location.Location;
import java.util.Locale;
import org.json.JSONArray;
import java.util.List;
import org.json.JSONException;
import java.util.LinkedList;
import android.text.TextUtils;
import org.json.JSONObject;
import android.content.Context;
import java.text.SimpleDateFormat;

public final class du
{
    private static final SimpleDateFormat a;
    
    static {
        a = new SimpleDateFormat("yyyyMMdd");
    }
    
    public static cb a(final Context context, final bz bz, String s) {
        JSONObject jsonObject = null;
        String optString2 = null;
        String s2 = null;
        long n = 0L;
        int n2 = 0;
        cb a = null;
        List<String> list2 = null;
    Label_0219_Outer:
        while (true) {
            List<String> e = null;
        Label_0219:
            while (true) {
            Label_0586:
                while (true) {
                    Label_0578: {
                        while (true) {
                            Label_0572: {
                                while (true) {
                                    Label_0303: {
                                        try {
                                            jsonObject = new JSONObject(s);
                                            s = jsonObject.optString("ad_base_url", (String)null);
                                            final String optString = jsonObject.optString("ad_url", (String)null);
                                            optString2 = jsonObject.optString("ad_size", (String)null);
                                            s2 = jsonObject.optString("ad_html", (String)null);
                                            if (!jsonObject.has("interstitial_timeout")) {
                                                break Label_0578;
                                            }
                                            n = (long)(jsonObject.getDouble("interstitial_timeout") * 1000.0);
                                            final String optString3 = jsonObject.optString("orientation", (String)null);
                                            n2 = -1;
                                            if ("portrait".equals(optString3)) {
                                                n2 = em.c();
                                            }
                                            else if ("landscape".equals(optString3)) {
                                                n2 = em.b();
                                            }
                                            JSONArray optJSONArray;
                                            List<String> list;
                                            if (!TextUtils.isEmpty((CharSequence)s2)) {
                                                if (TextUtils.isEmpty((CharSequence)s)) {
                                                    et.e("Could not parse the mediation config: Missing required ad_base_url field");
                                                    return new cb(0);
                                                }
                                                break Label_0572;
                                            }
                                            else {
                                                if (TextUtils.isEmpty((CharSequence)optString)) {
                                                    et.e("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                                                    return new cb(0);
                                                }
                                                a = ds.a(context, bz.l.c, optString);
                                                s = a.c;
                                                s2 = a.d;
                                                optJSONArray = jsonObject.optJSONArray("click_urls");
                                                if (a != null) {
                                                    break Label_0303;
                                                }
                                                e = null;
                                                if (optJSONArray == null) {
                                                    break Label_0219;
                                                }
                                                if ((list = e) == null) {
                                                    list = new LinkedList<String>();
                                                }
                                                break Label_0586;
                                            }
                                            // iftrue(Label_0592:, n3 >= optJSONArray.length())
                                            final int n3;
                                            list.add(optJSONArray.getString(n3));
                                            ++n3;
                                            continue Label_0219;
                                        }
                                        catch (JSONException ex) {
                                            et.e("Could not parse the mediation config: " + ex.getMessage());
                                            return new cb(0);
                                        }
                                    }
                                    e = (List<String>)a.e;
                                    continue Label_0219_Outer;
                                }
                            }
                            a = null;
                            continue Label_0219_Outer;
                        }
                    }
                    n = -1L;
                    continue Label_0219_Outer;
                }
                int n3 = 0;
                continue Label_0219;
            }
            list2 = e;
            break;
            Label_0592: {
                final List<String> list;
                list2 = list;
            }
            break;
        }
        final JSONArray optJSONArray2 = jsonObject.optJSONArray("impression_urls");
        List<String> g;
        if (a == null) {
            g = null;
        }
        else {
            g = (List<String>)a.g;
        }
        List<String> list4;
        if (optJSONArray2 != null) {
            List<String> list3;
            if ((list3 = g) == null) {
                list3 = new LinkedList<String>();
            }
            for (int i = 0; i < optJSONArray2.length(); ++i) {
                list3.add(optJSONArray2.getString(i));
            }
            list4 = list3;
        }
        else {
            list4 = g;
        }
        final JSONArray optJSONArray3 = jsonObject.optJSONArray("manual_impression_urls");
        List<String> k;
        if (a == null) {
            k = null;
        }
        else {
            k = (List<String>)a.k;
        }
        if (optJSONArray3 != null) {
            List<String> list5;
            if ((list5 = k) == null) {
                list5 = new LinkedList<String>();
            }
            for (int j = 0; j < optJSONArray3.length(); ++j) {
                list5.add(optJSONArray3.getString(j));
            }
            k = list5;
        }
        long h = n;
        int n4 = n2;
        if (a != null) {
            if (a.m != -1) {
                n2 = a.m;
            }
            h = n;
            n4 = n2;
            if (a.h > 0L) {
                h = a.h;
                n4 = n2;
            }
        }
        return new cb(s, s2, list2, list4, h, false, -1L, k, -1L, n4, optString2);
    }
    
    private static Integer a(final boolean b) {
        int i;
        if (b) {
            i = 1;
        }
        else {
            i = 0;
        }
        return i;
    }
    
    private static String a(final int n) {
        return String.format(Locale.US, "#%06x", 0xFFFFFF & n);
    }
    
    public static String a(final bz bz, final ea ea, final Location location) {
        try {
            final HashMap<String, Bundle> hashMap = new HashMap<String, Bundle>();
            if (bz.c != null) {
                hashMap.put("ad_pos", bz.c);
            }
            a(hashMap, bz.d);
            hashMap.put("format", (Bundle)bz.e.c);
            if (bz.e.g == -1) {
                hashMap.put("smart_w", (Bundle)"full");
            }
            if (bz.e.d == -2) {
                hashMap.put("smart_h", (Bundle)"auto");
            }
            if (bz.e.i != null) {
                final StringBuilder value = new StringBuilder();
                final x[] i = bz.e.i;
                for (int length = i.length, j = 0; j < length; ++j) {
                    final x x = i[j];
                    if (value.length() != 0) {
                        value.append("|");
                    }
                    int g;
                    if (x.g == -1) {
                        g = (int)(x.h / ea.q);
                    }
                    else {
                        g = x.g;
                    }
                    value.append(g);
                    value.append("x");
                    int d;
                    if (x.d == -2) {
                        d = (int)(x.e / ea.q);
                    }
                    else {
                        d = x.d;
                    }
                    value.append(d);
                }
                hashMap.put("sz", (Bundle)value);
            }
            hashMap.put("slotname", (Bundle)bz.f);
            hashMap.put("pn", (Bundle)bz.g.packageName);
            if (bz.h != null) {
                hashMap.put("vc", (Bundle)bz.h.versionCode);
            }
            hashMap.put("ms", (Bundle)bz.i);
            hashMap.put("seq_num", (Bundle)bz.j);
            hashMap.put("session_id", (Bundle)bz.k);
            hashMap.put("js", (Bundle)bz.l.c);
            a(hashMap, ea);
            if (bz.d.b >= 2 && bz.d.l != null) {
                a(hashMap, bz.d.l);
            }
            if (et.a(2)) {
                et.d("Ad Request JSON: " + em.a(hashMap).toString(2));
            }
            return em.a(hashMap).toString();
        }
        catch (JSONException ex) {
            et.e("Problem serializing ad request to JSON: " + ex.getMessage());
            return null;
        }
    }
    
    private static void a(final HashMap hashMap, final Location location) {
        final HashMap<String, Float> value = new HashMap<String, Float>();
        final float accuracy = location.getAccuracy();
        final long time = location.getTime();
        final long l = (long)(location.getLatitude() * 1.0E7);
        final long i = (long)(location.getLongitude() * 1.0E7);
        value.put("radius", accuracy * 1000.0f);
        value.put("lat", Float.valueOf(l));
        value.put("long", Float.valueOf(i));
        value.put("time", Float.valueOf(time * 1000L));
        hashMap.put("uule", value);
    }
    
    private static void a(final HashMap hashMap, final ai ai) {
        final String s = null;
        if (Color.alpha(ai.c) != 0) {
            hashMap.put("acolor", a(ai.c));
        }
        if (Color.alpha(ai.d) != 0) {
            hashMap.put("bgcolor", a(ai.d));
        }
        if (Color.alpha(ai.e) != 0 && Color.alpha(ai.f) != 0) {
            hashMap.put("gradientto", a(ai.e));
            hashMap.put("gradientfrom", a(ai.f));
        }
        if (Color.alpha(ai.g) != 0) {
            hashMap.put("bcolor", a(ai.g));
        }
        hashMap.put("bthick", Integer.toString(ai.h));
        String value = null;
        switch (ai.i) {
            default: {
                value = null;
                break;
            }
            case 0: {
                value = "none";
                break;
            }
            case 1: {
                value = "dashed";
                break;
            }
            case 2: {
                value = "dotted";
                break;
            }
            case 3: {
                value = "solid";
                break;
            }
        }
        if (value != null) {
            hashMap.put("btype", value);
        }
        String value2 = null;
        switch (ai.j) {
            default: {
                value2 = s;
                break;
            }
            case 2: {
                value2 = "dark";
                break;
            }
            case 0: {
                value2 = "light";
                break;
            }
            case 1: {
                value2 = "medium";
                break;
            }
        }
        if (value2 != null) {
            hashMap.put("callbuttoncolor", value2);
        }
        if (ai.k != null) {
            hashMap.put("channel", ai.k);
        }
        if (Color.alpha(ai.l) != 0) {
            hashMap.put("dcolor", a(ai.l));
        }
        if (ai.m != null) {
            hashMap.put("font", ai.m);
        }
        if (Color.alpha(ai.n) != 0) {
            hashMap.put("hcolor", a(ai.n));
        }
        hashMap.put("headersize", Integer.toString(ai.o));
        if (ai.p != null) {
            hashMap.put("q", ai.p);
        }
    }
    
    private static void a(final HashMap hashMap, final ea ea) {
        hashMap.put("am", ea.a);
        hashMap.put("cog", a(ea.b));
        hashMap.put("coh", a(ea.c));
        if (!TextUtils.isEmpty((CharSequence)ea.d)) {
            hashMap.put("carrier", ea.d);
        }
        hashMap.put("gl", ea.e);
        if (ea.f) {
            hashMap.put("simulator", 1);
        }
        hashMap.put("ma", a(ea.g));
        hashMap.put("sp", a(ea.h));
        hashMap.put("hl", ea.i);
        if (!TextUtils.isEmpty((CharSequence)ea.j)) {
            hashMap.put("mv", ea.j);
        }
        hashMap.put("muv", ea.k);
        if (ea.l != -2) {
            hashMap.put("cnt", ea.l);
        }
        hashMap.put("gnt", ea.m);
        hashMap.put("pt", ea.n);
        hashMap.put("rm", ea.o);
        hashMap.put("riv", ea.p);
        hashMap.put("u_sd", ea.q);
        hashMap.put("sh", ea.s);
        hashMap.put("sw", ea.r);
    }
    
    private static void a(final HashMap hashMap, final v v) {
        if (v.c != -1L) {
            hashMap.put("cust_age", du.a.format(new Date(v.c)));
        }
        if (v.d != null) {
            hashMap.put("extras", v.d);
        }
        if (v.e != -1) {
            hashMap.put("cust_gender", v.e);
        }
        if (v.f != null) {
            hashMap.put("kw", v.f);
        }
        if (v.h != -1) {
            hashMap.put("tag_for_child_directed_treatment", v.h);
        }
        if (v.g) {
            hashMap.put("adtest", "on");
        }
        if (v.b >= 2) {
            if (v.i) {
                hashMap.put("d_imp_hdr", 1);
            }
            if (!TextUtils.isEmpty((CharSequence)v.j)) {
                hashMap.put("ppid", v.j);
            }
            if (v.k != null) {
                a(hashMap, v.k);
            }
        }
    }
}
