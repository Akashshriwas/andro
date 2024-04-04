/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 */
package mm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.k;
import android.support.v4.app.s;
import android.support.v4.app.t;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.a.a;
import com.slidemenu.lib.SlidingMenu;
import com.slidemenu.lib.i;
import com.slidemenu.lib.m;
import com.slidemenu.lib.o;
import mm.e;
import mm.f;
import mm.l;
import mm.p;

public abstract class d
extends i
implements m,
o,
p {
    protected Boolean m = false;
    protected LinearLayout n;
    protected ImageView o;
    dn.f p;
    private t q;
    private TextView r;
    private Thread.UncaughtExceptionHandler s;
    private View.OnClickListener t;

    public d() {
        this.s = new e(this);
        this.t = new f(this);
    }

    private boolean a(String string, Context context) {
        context = context.getPackageManager();
        try {
            context.getPackageInfo(string, 1);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    private void b(String string) {
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
    }

    private void o() {
        SlidingMenu slidingMenu = this.f();
        slidingMenu.setMode(0);
        slidingMenu.setShadowWidthRes(2131427330);
        slidingMenu.setShadowDrawable(2130837603);
        slidingMenu.setBehindOffsetRes(2131427328);
        slidingMenu.setFadeDegree(0.35f);
        slidingMenu.setBehindScrollScale(1.0f);
        slidingMenu.setAnimationCacheEnabled(true);
        slidingMenu.setTouchModeAbove(1);
    }

    @Override
    public void a() {
        this.m = false;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(a var1_1, View var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CASE]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(String string) {
        if (this.r != null && string != null) {
            this.r.setText((CharSequence)string);
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
        String string;
        if (this.r == null) {
            this.r = (TextView)this.findViewById(2131165211);
        }
        if ((string = this.p.a(dn.f.b)) != null) {
            this.r.setText((CharSequence)string);
        }
    }

    public void n() {
        if (this.m.booleanValue()) {
            this.g();
            return;
        }
        this.h();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.requestWindowFeature(1);
        this.getWindow().addFlags(128);
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.s);
        this.p = dn.f.a();
        this.b(2130903055);
        if (object == null) {
            object = this.e().a();
            this.q = new l();
            ((l)this.q).V = this;
            object.b(2131165227, this.q);
            object.a();
        } else {
            this.q = (t)this.e().a(2131165227);
            ((l)this.q).V = this;
        }
        this.o();
        if (this.j() != -1) {
            this.setContentView(this.j());
            this.n = (LinearLayout)this.findViewById(2131165213);
            this.n.setOnClickListener(this.t);
            this.o = (ImageView)this.findViewById(2131165209);
            this.i();
            this.m();
            this.k();
        }
    }
}

