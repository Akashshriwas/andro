/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.ListView
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package mm;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.a.h.e;
import com.a.h.f;
import java.util.ArrayList;
import mm.a;
import mm.g;
import mm.i;
import mm.m;

public class j
extends a
implements i {
    e Q;
    int R;
    int S;

    public int a(String arrstring) {
        arrstring = arrstring.split(":");
        int n2 = Integer.parseInt((String)arrstring[1].substring(0, 2));
        return Integer.parseInt((String)arrstring[1].substring(3, 5)) + n2 * 1000;
    }

    @Override
    public void a(View view) {
    }

    public void a(e e2) {
        this.Q = e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a_(int n2) {
        try {
            if (this.u() != null && this.u().size() > n2) {
                f f2 = (f)this.u().get(n2);
                boolean bl2 = !f2.a();
                f2.a(bl2);
                this.O.notifyDataSetChanged();
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public void b(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[FORLOOP]], but top level block is 2[TRYBLOCK]
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

    @Override
    public void b(Bundle bundle) {
        super.b(bundle);
    }

    @Override
    public void d(Bundle bundle) {
        super.d(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onItemClick(AdapterView object, View object2, int n2, long l2) {
        int n3;
        block7 : {
            try {
                object2 = (m)this.c();
                if (object2 != null && object2.C != null && object2.C.isPlaying()) {
                    n3 = n2;
                    break block7;
                }
                if (object2 == null) return;
                if (object2.C == null) return;
                if (object2.C.isPlaying()) return;
                object2.p();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return;
        }
        do {
            if (n3 < 0) {
                this.O.notifyDataSetChanged();
                object = ((f)this.O.getItem(n2)).e();
                if (n2 == 0) {
                    object = "00:00.00";
                }
                object2.b((String)object);
                return;
            }
            ((f)this.u().get(n3)).b(true);
            --n3;
        } while (true);
    }

    @Override
    public int r() {
        return 2130903040;
    }

    @Override
    public com.a.f.e s() {
        return new g((Context)this.c(), this);
    }

    @Override
    public ArrayList t() {
        ArrayList arrayList = new com.a.d.a().d(this.Q.a());
        if (arrayList != null) {
            this.R = arrayList.size() - 1;
            this.S = 0;
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void w() {
        if (this.u() == null) return;
        int n2 = 1;
        do {
            if (n2 > this.R) {
                this.O.notifyDataSetChanged();
                this.x();
                return;
            }
            ((f)this.u().get(n2)).b(false);
            ++n2;
        } while (true);
    }

    public void x() {
        if (this.P != null) {
            this.P.smoothScrollToPosition(0);
        }
    }
}

