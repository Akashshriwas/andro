// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import org.json.JSONArray;
import java.util.Collections;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.List;

public final class al
{
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;
    
    public al(final JSONObject jsonObject) {
        final String s = null;
        this.b = jsonObject.getString("id");
        final JSONArray jsonArray = jsonObject.getJSONArray("adapters");
        final ArrayList list = new ArrayList<String>(jsonArray.length());
        for (int i = 0; i < jsonArray.length(); ++i) {
            list.add(jsonArray.getString(i));
        }
        this.c = Collections.unmodifiableList((List<?>)list);
        this.d = jsonObject.optString("allocation_id", (String)null);
        this.e = at.a(jsonObject, "imp_urls");
        final JSONObject optJSONObject = jsonObject.optJSONObject("ad");
        String string;
        if (optJSONObject != null) {
            string = optJSONObject.toString();
        }
        else {
            string = null;
        }
        this.a = string;
        final JSONObject optJSONObject2 = jsonObject.optJSONObject("data");
        String string2 = s;
        if (optJSONObject2 != null) {
            string2 = optJSONObject2.toString();
        }
        this.f = string2;
    }
}
