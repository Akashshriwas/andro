// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

final class w implements ad
{
    @Override
    public void a(final ev ev, Map o) {
        final String str = ((Map<K, String>)o).get("u");
        if (str == null) {
            et.e("URL missing from click GMSG.");
            return;
        }
        while (true) {
            o = Uri.parse(str);
            while (true) {
                Label_0111: {
                    try {
                        final is f = ev.f();
                        if (f != null && f.a((Uri)o)) {
                            o = f.a((Uri)o, ev.getContext());
                            o = ((Uri)o).toString();
                            new er(ev.getContext(), ev.g().c, (String)o).e();
                            return;
                        }
                        break Label_0111;
                    }
                    catch (jj jj) {
                        et.e("Unable to append parameter to URL: " + str);
                    }
                }
                continue;
            }
        }
    }
}
