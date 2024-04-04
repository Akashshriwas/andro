// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import org.json.JSONArray;
import java.util.Collections;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.List;

public final class am
{
    public final List a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final long g;
    
    public am(final String s) {
        final JSONObject jsonObject = new JSONObject(s);
        if (et.a(2)) {
            et.d("Mediation Response JSON: " + jsonObject.toString(2));
        }
        final JSONArray jsonArray = jsonObject.getJSONArray("ad_networks");
        final ArrayList list = new ArrayList<al>(jsonArray.length());
        for (int i = 0; i < jsonArray.length(); ++i) {
            list.add(new al(jsonArray.getJSONObject(i)));
        }
        this.a = Collections.unmodifiableList((List<?>)list);
        this.f = jsonObject.getString("qdata");
        final JSONObject optJSONObject = jsonObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.b = optJSONObject.optLong("ad_network_timeout_millis", -1L);
            this.c = at.a(optJSONObject, "click_urls");
            this.d = at.a(optJSONObject, "imp_urls");
            this.e = at.a(optJSONObject, "nofill_urls");
            final long optLong = optJSONObject.optLong("refresh", -1L);
            long g;
            if (optLong > 0L) {
                g = 1000L * optLong;
            }
            else {
                g = -1L;
            }
            this.g = g;
            return;
        }
        this.b = -1L;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = -1L;
    }
}
