/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package mm;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.a;
import com.a.f.e;
import dn.f;
import java.util.ArrayList;

public class k
extends e {
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    RelativeLayout h;

    public k(Context context) {
        super(context);
    }

    private int a(int n2) {
        int n3 = 2130837578;
        switch (n2) {
            default: {
                n3 = 2130837516;
            }
            case 4: 
            case 5: 
            case 6: {
                return n3;
            }
            case 1: {
                return 2130837517;
            }
            case 2: {
                return 2130837518;
            }
            case 3: {
                return 2130837519;
            }
            case 7: {
                return 2130837592;
            }
            case 8: {
                return 2130837605;
            }
            case 9: 
        }
        return 2130837548;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public View a(Object object, View view, int n2) {
        View view2 = view;
        if (view == null) {
            view2 = this.c.inflate(2130903045, null);
        }
        this.d = (TextView)view2.findViewById(2131165198);
        this.g = (TextView)view2.findViewById(2131165204);
        this.e = (TextView)view2.findViewById(2131165206);
        this.h = (RelativeLayout)view2.findViewById(2131165203);
        this.f = (TextView)view2.findViewById(2131165205);
        object = (a)object;
        this.d.setText((CharSequence)object.b());
        view2.setTag((Object)object.c());
        this.g.setBackgroundResource(object.a());
        switch (n2) {
            default: {
                this.g.setText((CharSequence)"");
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                this.g.setText((CharSequence)String.valueOf((int)(n2 + 1)));
                break;
            }
        }
        switch (n2) {
            default: {
                this.e.setVisibility(8);
                break;
            }
            case 3: {
                this.e.setVisibility(0);
                this.e.setText((CharSequence)this.c().getString(2131230784));
                break;
            }
            case 6: {
                this.e.setVisibility(0);
                this.e.setText((CharSequence)this.c().getString(2131230785));
            }
        }
        this.d.getLayoutParams().height = n2 = (int)TypedValue.applyDimension((int)1, (float)46.0f, (DisplayMetrics)this.c().getResources().getDisplayMetrics());
        this.f.setVisibility(8);
        if (object.c() == f.a().b(f.a)) {
            view2.setBackgroundColor(view2.getResources().getColor(2131099679));
            return view2;
        }
        view2.setBackgroundResource(2130903043);
        return view2;
    }

    @Override
    public ArrayList a() {
        ArrayList arrayList = new ArrayList();
        String[] arrstring = this.c().getResources().getStringArray(2131361792);
        int n2 = 0;
        while (n2 < arrstring.length) {
            arrayList.add((Object)new a(arrstring[n2], n2, this.a(n2), ""));
            ++n2;
        }
        return arrayList;
    }
}

