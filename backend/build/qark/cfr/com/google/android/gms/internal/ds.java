/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.dt;
import com.google.android.gms.internal.du;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.ea;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.v;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ds
extends dq {
    private static final Object a = new Object();
    private static ds b;
    private final Context c;
    private final ag d;

    private ds(Context context, ag ag2) {
        this.c = context;
        this.d = ag2;
    }

    private static cb a(Context context, ag object, bz bz2) {
        String string;
        et.a("Starting ad request from service.");
        object.a();
        ea ea2 = new ea(context);
        if (ea2.l == -1) {
            et.a("Device is offline.");
            return new cb(2);
        }
        dv dv2 = new dv();
        if (bz2.d.d != null && (string = bz2.d.d.getString("_ad")) != null) {
            return du.a(context, bz2, string);
        }
        if ((object = du.a(bz2, ea2, object.a(250L))) == null) {
            return new cb(0);
        }
        es.a.post((Runnable)new dt(context, bz2, dv2, (String)object));
        object = dv2.b();
        if (TextUtils.isEmpty((CharSequence)object)) {
            return new cb(dv2.a());
        }
        return ds.a(context, bz2.l.c, (String)object);
    }

    /*
     * Exception decompiling
     */
    public static cb a(Context var0, String var1_3, String var2_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 17[UNCONDITIONALDOLOOP]
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ds a(Context object, ag ag2) {
        Object object2 = a;
        synchronized (object2) {
            if (b != null) return b;
            b = new ds(object.getApplicationContext(), ag2);
            return b;
        }
    }

    private static void a(String string, Map map, String string2, int n2) {
        if (et.a(2)) {
            et.d("Http Response: {\n  URL:\n    " + string + "\n  Headers:");
            if (map != null) {
                string = map.keySet().iterator();
                while (string.hasNext()) {
                    String string3 = (String)string.next();
                    et.d("    " + string3 + ":");
                    for (String string4 : (List)map.get((Object)string3)) {
                        et.d("      " + string4);
                    }
                }
            }
            et.d("  Body:");
            if (string2 != null) {
                for (int i2 = 0; i2 < Math.min((int)string2.length(), (int)100000); i2 += 1000) {
                    et.d(string2.substring(i2, Math.min((int)string2.length(), (int)(i2 + 1000))));
                }
            } else {
                et.d("    null");
            }
            et.d("  Response Code:\n    " + n2 + "\n}");
        }
    }

    @Override
    public cb a(bz bz2) {
        return ds.a(this.c, this.d, bz2);
    }
}

