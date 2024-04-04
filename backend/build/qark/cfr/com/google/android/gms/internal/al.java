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

import com.google.android.gms.internal.at;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class al {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;

    /*
     * Enabled aggressive block sorting
     */
    public al(JSONObject object) {
        Object var4_2 = null;
        this.b = object.getString("id");
        Object object2 = object.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(object2.length());
        for (int i2 = 0; i2 < object2.length(); ++i2) {
            arrayList.add((Object)object2.getString(i2));
        }
        this.c = Collections.unmodifiableList((List)arrayList);
        this.d = object.optString("allocation_id", null);
        this.e = at.a((JSONObject)object, "imp_urls");
        object2 = object.optJSONObject("ad");
        object2 = object2 != null ? object2.toString() : null;
        this.a = object2;
        object2 = object.optJSONObject("data");
        object = var4_2;
        if (object2 != null) {
            object = object2.toString();
        }
        this.f = object;
    }
}

