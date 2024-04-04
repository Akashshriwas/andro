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
 *  android.widget.ProgressBar
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
import android.widget.ProgressBar;
import android.widget.TextView;
import com.a.f.e;
import com.a.g.d;
import com.a.h.g;
import dn.a;
import mm.pr;

class ao
extends e {
    TextView d;
    TextView e;
    ImageView f;
    ImageView g;
    ProgressBar h;
    int i;
    d j;
    final /* synthetic */ pr k;

    public ao(pr pr2, Context context) {
        this.k = pr2;
        super(context);
        this.i = -1;
        this.j = new d(context);
    }

    private boolean a(g g2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (a.a()) {
            bl3 = bl2;
            if (!a.b(g2.e()).booleanValue()) {
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public View a(Object object, View view, int n2) {
        g g2 = (g)object;
        object = view;
        if (view == null) {
            object = this.c.inflate(2130903059, null);
        }
        if (n2 % 2 == 0) {
            object.setBackgroundResource(2130837563);
        } else {
            object.setBackgroundResource(2130837562);
        }
        this.d = (TextView)object.findViewById(2131165198);
        this.e = (TextView)object.findViewById(2131165199);
        this.f = (ImageView)object.findViewById(2131165196);
        this.g = (ImageView)object.findViewById(2131165234);
        this.h = (ProgressBar)object.findViewById(2131165221);
        if (n2 == this.d()) {
            this.g.setVisibility(8);
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
            this.g.setVisibility(0);
        }
        if (n2 % 2 == 0) {
            this.f.setImageResource(2130837610);
        } else {
            this.f.setImageResource(2130837612);
        }
        this.d.setText((CharSequence)g2.c());
        this.e.setText((CharSequence)g2.d());
        if (g2.a()) {
            this.d.setTextColor(this.c().getResources().getColor(2131099677));
        } else {
            this.d.setTextColor(this.c().getResources().getColor(2131099674));
        }
        if (this.a(g2)) {
            this.j.a(a.c(g2.e()), g2.e());
        }
        return object;
    }

    public void a(int n2) {
        this.i = n2;
    }

    public int d() {
        return this.i;
    }
}

