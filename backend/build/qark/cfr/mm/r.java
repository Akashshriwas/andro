/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.a.g.a;
import com.a.h.e;
import mm.s;

public class r
extends com.a.f.e {
    a d;

    public r(Context context) {
        super(context);
        this.d = new a(context);
    }

    private boolean a(e e2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (dn.a.a()) {
            bl3 = bl2;
            if (e2.a() > 5) {
                bl3 = bl2;
                if (!dn.a.b(e2.a()).booleanValue()) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public View a(Object object, View object2, int n2) {
        e e2 = (e)object;
        object = object2;
        if (object2 == null) {
            object = this.c.inflate(2130903050, null);
        }
        object2 = new s(this);
        if (object.getTag() == null) {
            object2.a = (TextView)object.findViewById(2131165198);
            object2.b = (TextView)object.findViewById(2131165199);
            object2.c = (TextView)object.findViewById(2131165226);
            object.setTag(object2);
        } else {
            object2 = (s)object.getTag();
        }
        if (n2 % 2 == 0) {
            object.setBackgroundResource(2130837563);
        } else {
            object.setBackgroundResource(2130837562);
        }
        object2.a.setText((CharSequence)e2.b());
        object2.b.setText((CharSequence)e2.c());
        object2.c.setText((CharSequence)String.valueOf((int)e2.d()));
        if (this.a(e2)) {
            this.d.a(dn.a.e(e2.a()), e2.a());
        }
        return object;
    }
}

