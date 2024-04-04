/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.f.e;
import com.a.h.f;

public class t
extends e {
    TextView d;
    TextView e;
    ImageView f;

    public t(Context context) {
        super(context);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public View a(Object object, View view, int n2) {
        f f2 = (f)object;
        object = view;
        if (view == null) {
            object = this.c.inflate(2130903062, null);
        }
        if (n2 % 2 == 0) {
            object.setBackgroundResource(2130837563);
        } else {
            object.setBackgroundResource(2130837562);
        }
        this.d = (TextView)object.findViewById(2131165198);
        this.e = (TextView)object.findViewById(2131165197);
        this.f = (ImageView)object.findViewById(2131165196);
        if (n2 % 2 == 0) {
            this.f.setImageResource(2130837610);
        } else {
            this.f.setImageResource(2130837612);
        }
        this.d.setText((CharSequence)f2.c());
        this.e.setText((CharSequence)f2.d());
        if (f2.b()) {
            this.d.setTextColor(this.c().getResources().getColor(2131099677));
            this.e.setTextColor(this.c().getResources().getColor(2131099677));
            return object;
        }
        this.d.setTextColor(this.c().getResources().getColor(2131099674));
        this.e.setTextColor(this.c().getResources().getColor(2131099658));
        return object;
    }
}

