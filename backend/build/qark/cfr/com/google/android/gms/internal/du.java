/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.location.Location
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Locale
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.ea;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class du {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static cb a(Context var0, bz var1_2, String var2_3) {
        block26 : {
            block25 : {
                try {
                    block27 : {
                        var14_4 = new JSONObject(var2_3);
                        var2_3 = var14_4.optString("ad_base_url", null);
                        var10_5 = var14_4.optString("ad_url", null);
                        var13_6 = var14_4.optString("ad_size", null);
                        var9_7 = var14_4.optString("ad_html", null);
                        var5_8 = var14_4.has("interstitial_timeout") != false ? (long)(var14_4.getDouble("interstitial_timeout") * 1000.0) : -1L;
                        var11_9 = var14_4.optString("orientation", null);
                        var3_10 = -1;
                        if ("portrait".equals(var11_9)) {
                            var3_10 = em.c();
                        } else if ("landscape".equals(var11_9)) {
                            var3_10 = em.b();
                        }
                        if (TextUtils.isEmpty((CharSequence)var9_7)) break block27;
                        if (TextUtils.isEmpty((CharSequence)var2_3)) {
                            et.e("Could not parse the mediation config: Missing required ad_base_url field");
                            return new cb(0);
                        }
                        ** GOTO lbl28
                    }
                    if (!TextUtils.isEmpty((CharSequence)var10_5)) {
                        var10_5 = ds.a((Context)var0, var1_2.l.c, (String)var10_5);
                        var2_3 = var10_5.c;
                        var9_7 = var10_5.d;
                    } else {
                        et.e("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                        return new cb(0);
lbl28: // 1 sources:
                        var10_5 = null;
                    }
                    var11_9 = var14_4.optJSONArray("click_urls");
                    var0 = var10_5 == null ? null : var10_5.e;
                    if (var11_9 == null) {
                        var11_9 = var0;
                    } else {
                        var1_2 = var0;
                        if (var0 == null) {
                            var1_2 = new LinkedList();
                        }
                        for (var4_11 = 0; var4_11 < var11_9.length(); ++var4_11) {
                            var1_2.add((Object)var11_9.getString(var4_11));
                        }
                        var11_9 = var1_2;
                    }
                    var12_12 = var14_4.optJSONArray("impression_urls");
                    if (var10_5 == null) {
                        var0 = null;
                    } else {
                        var0 = var10_5.g;
                    }
                    if (var12_12 != null) {
                        var1_2 = var0;
                        if (var0 == null) {
                            var1_2 = new LinkedList();
                        }
                        break block25;
                    }
                    var12_12 = var0;
                    break block26;
                }
                catch (JSONException var0_1) {
                    et.e("Could not parse the mediation config: " + var0_1.getMessage());
                    return new cb(0);
                }
            }
            for (var4_11 = 0; var4_11 < var12_12.length(); ++var4_11) {
                var1_2.add((Object)var12_12.getString(var4_11));
            }
            var12_12 = var1_2;
        }
        var14_4 = var14_4.optJSONArray("manual_impression_urls");
        var0 = var10_5 == null ? null : var10_5.k;
        {
            if (var14_4 != null) {
                var1_2 = var0;
                if (var0 == null) {
                    var1_2 = new LinkedList();
                }
                for (var4_11 = 0; var4_11 < var14_4.length(); ++var4_11) {
                    var1_2.add((Object)var14_4.getString(var4_11));
                }
                var0 = var1_2;
            }
            var7_13 = var5_8;
            var4_11 = var3_10;
            if (var10_5 == null) return new cb(var2_3, var9_7, (List)var11_9, (List)var12_12, var7_13, false, -1L, (List)var0, -1L, var4_11, var13_6);
            if (var10_5.m != -1) {
                var3_10 = var10_5.m;
            }
            var7_13 = var5_8;
            var4_11 = var3_10;
            if (var10_5.h <= 0L) return new cb(var2_3, var9_7, (List)var11_9, (List)var12_12, var7_13, false, -1L, (List)var0, -1L, var4_11, var13_6);
            var7_13 = var10_5.h;
            var4_11 = var3_10;
            return new cb(var2_3, var9_7, (List)var11_9, (List)var12_12, var7_13, false, -1L, (List)var0, -1L, var4_11, var13_6);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Integer a(boolean bl2) {
        int n2;
        if (bl2) {
            n2 = 1;
            do {
                return n2;
                break;
            } while (true);
        }
        n2 = 0;
        return n2;
    }

    private static String a(int n2) {
        return String.format((Locale)Locale.US, (String)"#%06x", (Object[])new Object[]{16777215 & n2});
    }

    /*
     * Exception decompiling
     */
    public static String a(bz var0, ea var1_2, Location var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 4[FORLOOP]], but top level block is 2[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a(HashMap hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        float f2 = location.getAccuracy();
        long l2 = location.getTime();
        long l3 = (long)(location.getLatitude() * 1.0E7);
        long l4 = (long)(location.getLongitude() * 1.0E7);
        hashMap2.put((Object)"radius", (Object)Float.valueOf((float)(f2 * 1000.0f)));
        hashMap2.put((Object)"lat", (Object)l3);
        hashMap2.put((Object)"long", (Object)l4);
        hashMap2.put((Object)"time", (Object)(l2 * 1000L));
        hashMap.put((Object)"uule", (Object)hashMap2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(HashMap hashMap, ai ai2) {
        String string;
        Object var3_2 = null;
        if (Color.alpha((int)ai2.c) != 0) {
            hashMap.put((Object)"acolor", (Object)du.a(ai2.c));
        }
        if (Color.alpha((int)ai2.d) != 0) {
            hashMap.put((Object)"bgcolor", (Object)du.a(ai2.d));
        }
        if (Color.alpha((int)ai2.e) != 0 && Color.alpha((int)ai2.f) != 0) {
            hashMap.put((Object)"gradientto", (Object)du.a(ai2.e));
            hashMap.put((Object)"gradientfrom", (Object)du.a(ai2.f));
        }
        if (Color.alpha((int)ai2.g) != 0) {
            hashMap.put((Object)"bcolor", (Object)du.a(ai2.g));
        }
        hashMap.put((Object)"bthick", (Object)Integer.toString((int)ai2.h));
        switch (ai2.i) {
            default: {
                string = null;
                break;
            }
            case 0: {
                string = "none";
                break;
            }
            case 1: {
                string = "dashed";
                break;
            }
            case 2: {
                string = "dotted";
                break;
            }
            case 3: {
                string = "solid";
            }
        }
        if (string != null) {
            hashMap.put((Object)"btype", (Object)string);
        }
        switch (ai2.j) {
            default: {
                string = var3_2;
                break;
            }
            case 2: {
                string = "dark";
                break;
            }
            case 0: {
                string = "light";
                break;
            }
            case 1: {
                string = "medium";
            }
        }
        if (string != null) {
            hashMap.put((Object)"callbuttoncolor", (Object)string);
        }
        if (ai2.k != null) {
            hashMap.put((Object)"channel", (Object)ai2.k);
        }
        if (Color.alpha((int)ai2.l) != 0) {
            hashMap.put((Object)"dcolor", (Object)du.a(ai2.l));
        }
        if (ai2.m != null) {
            hashMap.put((Object)"font", (Object)ai2.m);
        }
        if (Color.alpha((int)ai2.n) != 0) {
            hashMap.put((Object)"hcolor", (Object)du.a(ai2.n));
        }
        hashMap.put((Object)"headersize", (Object)Integer.toString((int)ai2.o));
        if (ai2.p != null) {
            hashMap.put((Object)"q", (Object)ai2.p);
        }
    }

    private static void a(HashMap hashMap, ea ea2) {
        hashMap.put((Object)"am", (Object)ea2.a);
        hashMap.put((Object)"cog", (Object)du.a(ea2.b));
        hashMap.put((Object)"coh", (Object)du.a(ea2.c));
        if (!TextUtils.isEmpty((CharSequence)ea2.d)) {
            hashMap.put((Object)"carrier", (Object)ea2.d);
        }
        hashMap.put((Object)"gl", (Object)ea2.e);
        if (ea2.f) {
            hashMap.put((Object)"simulator", (Object)1);
        }
        hashMap.put((Object)"ma", (Object)du.a(ea2.g));
        hashMap.put((Object)"sp", (Object)du.a(ea2.h));
        hashMap.put((Object)"hl", (Object)ea2.i);
        if (!TextUtils.isEmpty((CharSequence)ea2.j)) {
            hashMap.put((Object)"mv", (Object)ea2.j);
        }
        hashMap.put((Object)"muv", (Object)ea2.k);
        if (ea2.l != -2) {
            hashMap.put((Object)"cnt", (Object)ea2.l);
        }
        hashMap.put((Object)"gnt", (Object)ea2.m);
        hashMap.put((Object)"pt", (Object)ea2.n);
        hashMap.put((Object)"rm", (Object)ea2.o);
        hashMap.put((Object)"riv", (Object)ea2.p);
        hashMap.put((Object)"u_sd", (Object)Float.valueOf((float)ea2.q));
        hashMap.put((Object)"sh", (Object)ea2.s);
        hashMap.put((Object)"sw", (Object)ea2.r);
    }

    private static void a(HashMap hashMap, v v2) {
        if (v2.c != -1L) {
            hashMap.put((Object)"cust_age", (Object)a.format(new Date(v2.c)));
        }
        if (v2.d != null) {
            hashMap.put((Object)"extras", (Object)v2.d);
        }
        if (v2.e != -1) {
            hashMap.put((Object)"cust_gender", (Object)v2.e);
        }
        if (v2.f != null) {
            hashMap.put((Object)"kw", (Object)v2.f);
        }
        if (v2.h != -1) {
            hashMap.put((Object)"tag_for_child_directed_treatment", (Object)v2.h);
        }
        if (v2.g) {
            hashMap.put((Object)"adtest", (Object)"on");
        }
        if (v2.b >= 2) {
            if (v2.i) {
                hashMap.put((Object)"d_imp_hdr", (Object)1);
            }
            if (!TextUtils.isEmpty((CharSequence)v2.j)) {
                hashMap.put((Object)"ppid", (Object)v2.j);
            }
            if (v2.k != null) {
                du.a(hashMap, v2.k);
            }
        }
    }
}

