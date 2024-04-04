// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.support.v4.app.s;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import java.util.Locale;
import android.view.View;
import com.a.a.a;
import com.slidemenu.lib.SlidingMenu;
import android.content.Intent;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.support.v4.app.t;
import dn.f;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.slidemenu.lib.o;
import com.slidemenu.lib.m;
import com.slidemenu.lib.i;

public abstract class d extends i implements m, o, p
{
    protected Boolean m;
    protected LinearLayout n;
    protected ImageView o;
    f p;
    private t q;
    private TextView r;
    private Thread.UncaughtExceptionHandler s;
    private View$OnClickListener t;
    
    public d() {
        this.m = false;
        this.s = new e(this);
        this.t = (View$OnClickListener)new mm.f(this);
    }
    
    private boolean a(final String s, final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo(s, 1);
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    private void b(final String s) {
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
    
    private void o() {
        final SlidingMenu f = this.f();
        f.setMode(0);
        f.setShadowWidthRes(2131427330);
        f.setShadowDrawable(2130837603);
        f.setBehindOffsetRes(2131427328);
        f.setFadeDegree(0.35f);
        f.setBehindScrollScale(1.0f);
        f.setAnimationCacheEnabled(true);
        f.setTouchModeAbove(1);
    }
    
    @Override
    public void a() {
        this.m = false;
    }
    
    @Override
    public void a(final a a, final View view) {
        if (a != null) {
            Label_0308: {
                Label_0300: {
                    Label_0273: {
                        Label_0239: {
                            Label_0205: {
                                try {
                                    switch (a.c()) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3: {
                                            this.p.a(dn.f.a, a.c());
                                            ((l)this.q).W.notifyDataSetChanged();
                                            this.p.a(dn.f.b, a.b());
                                            this.r.setText((CharSequence)a.b());
                                            super.g();
                                            return;
                                        }
                                        case 4: {
                                            break;
                                        }
                                        case 5: {
                                            break Label_0205;
                                        }
                                        case 6: {
                                            break Label_0239;
                                        }
                                        case 7: {
                                            break Label_0273;
                                        }
                                        case 8: {
                                            break Label_0300;
                                        }
                                        case 9: {
                                            break Label_0308;
                                        }
                                        default: {
                                            return;
                                        }
                                    }
                                }
                                catch (Exception ex) {
                                    ex.printStackTrace();
                                    return;
                                }
                                String str;
                                final String s = str = "com.study.english.pronunciation";
                                if (Locale.getDefault() != null) {
                                    str = s;
                                    if (Locale.getDefault().toString().contains("vi")) {
                                        str = "pronunciation.phat.am.tieng.anh";
                                    }
                                }
                                if (this.a(str, view.getContext())) {
                                    this.startActivity(this.getPackageManager().getLaunchIntentForPackage(str));
                                    return;
                                }
                                this.b("market://details?id=" + str);
                                return;
                            }
                            if (this.a("com.study.english.voa", view.getContext())) {
                                this.startActivity(this.getPackageManager().getLaunchIntentForPackage("com.study.english.voa"));
                                return;
                            }
                            this.b("market://details?id=com.study.english.voa&hl=vi");
                            return;
                        }
                        if (this.a("com.hake.english.vn", view.getContext())) {
                            this.startActivity(this.getPackageManager().getLaunchIntentForPackage("com.hake.english.vn"));
                            return;
                        }
                        this.b("market://details?id=com.hake.english.vn&hl=vi");
                        return;
                    }
                    this.b("market://details?id=" + this.getApplicationContext().getPackageName());
                    return;
                }
                dn.a.b(view.getContext());
                return;
            }
            dn.a.c((Context)this);
        }
    }
    
    public void a(final String text) {
        if (this.r != null && text != null) {
            this.r.setText((CharSequence)text);
        }
    }
    
    @Override
    public void b() {
        this.m = true;
    }
    
    public abstract void i();
    
    public abstract int j();
    
    public void k() {
        if (this.o != null) {
            this.o.setImageResource(2130837569);
        }
    }
    
    public void l() {
        if (this.o != null) {
            this.o.setImageResource(2130837573);
        }
    }
    
    public void m() {
        if (this.r == null) {
            this.r = (TextView)this.findViewById(2131165211);
        }
        final String a = this.p.a(dn.f.b);
        if (a != null) {
            this.r.setText((CharSequence)a);
        }
    }
    
    public void n() {
        if (this.m) {
            this.g();
            return;
        }
        this.h();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        this.getWindow().addFlags(128);
        Thread.setDefaultUncaughtExceptionHandler(this.s);
        this.p = dn.f.a();
        this.b(2130903055);
        if (bundle == null) {
            final s a = this.e().a();
            this.q = new l();
            ((l)this.q).V = this;
            a.b(2131165227, this.q);
            a.a();
        }
        else {
            this.q = (t)this.e().a(2131165227);
            ((l)this.q).V = this;
        }
        this.o();
        if (this.j() != -1) {
            this.setContentView(this.j());
            (this.n = (LinearLayout)this.findViewById(2131165213)).setOnClickListener(this.t);
            this.o = (ImageView)this.findViewById(2131165209);
            this.i();
            this.m();
            this.k();
        }
    }
}
