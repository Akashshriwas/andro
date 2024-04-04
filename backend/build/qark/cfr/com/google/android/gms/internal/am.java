/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.al;
import com.google.android.gms.internal.at;
import com.google.android.gms.internal.et;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class am {
    public final List a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final long g;

    /*
     * Enabled aggressive block sorting
     */
    public am(String string) {
        string = new JSONObject(string);
        if (et.a(2)) {
            et.d("Mediation Response JSON: " + string.toString(2));
        }
        JSONArray jSONArray = string.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            arrayList.add((Object)new al(jSONArray.getJSONObject(i2)));
        }
        this.a = Collections.unmodifiableList((List)arrayList);
        this.f = string.getString("qdata");
        if ((string = string.optJSONObject("settings")) == null) {
            this.b = -1L;
            this.c = null;
            this.d = null;
            this.e = null;
            this.g = -1L;
            return;
        }
        this.b = string.optLong("ad_network_timeout_millis", -1L);
        this.c = at.a((JSONObject)string, "click_urls");
        this.d = at.a((JSONObject)string, "imp_urls");
        this.e = at.a((JSONObject)string, "nofill_urls");
        long l2 = string.optLong("refresh", -1L);
        l2 = l2 > 0L ? 1000L * l2 : -1L;
        this.g = l2;
    }
}

