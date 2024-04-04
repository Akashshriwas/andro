/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.f.e;
import com.a.h.f;
import mm.h;
import mm.i;

public class g
extends e {
    TextView d;
    TextView e;
    TextView f;
    ImageView g;
    LinearLayout h;
    i i;
    private View.OnClickListener j;

    public g(Context context, i i2) {
        super(context);
        this.j = new h(this);
        this.i = i2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public View a(Object object, View view, int n2) {
        f f2 = (f)object;
        object = view;
        if (view == null) {
            object = this.c.inflate(2130903041, null);
        }
        if (n2 % 2 == 0) {
            object.setBackgroundResource(2130837563);
        } else {
            object.setBackgroundResource(2130837562);
        }
        this.d = (TextView)object.findViewById(2131165198);
        this.e = (TextView)object.findViewById(2131165199);
        this.f = (TextView)object.findViewById(2131165197);
        this.h = (LinearLayout)object.findViewById(2131165200);
        this.h.setTag((Object)n2);
        this.h.setOnClickListener(this.j);
        this.g = (ImageView)object.findViewById(2131165196);
        if (n2 % 2 == 0) {
            this.g.setImageResource(2130837610);
        } else {
            this.g.setImageResource(2130837612);
        }
        this.d.setText((CharSequence)f2.c());
        this.e.setText((CharSequence)f2.f());
        this.f.setText((CharSequence)f2.d());
        if (f2.b()) {
            this.d.setTextColor(this.c().getResources().getColor(2131099677));
        } else {
            this.d.setTextColor(this.c().getResources().getColor(2131099674));
        }
        if (f2.a()) {
            this.e.setVisibility(0);
            return object;
        }
        this.e.setVisibility(8);
        return object;
    }
}

