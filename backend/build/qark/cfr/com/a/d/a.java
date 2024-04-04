/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.util.Base64
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.a.d;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.a.h.e;
import com.a.h.f;
import com.a.h.g;
import java.util.ArrayList;

public class a
extends com.a.c.a {
    String c = "aGorPS5tw6BsIGnEkSBu4bqhYiBhxrD";

    private String a(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        int n2 = string.length();
        String string2 = "";
        --n2;
        while (n2 >= 0) {
            string2 = String.valueOf((Object)string2) + string.charAt(n2);
            --n2;
        }
        return string2;
    }

    /*
     * Exception decompiling
     */
    public e a(e var1_1, Boolean var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[CATCHBLOCK]
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public ArrayList a(int n2, int n3) {
        ArrayList arrayList = new ArrayList();
        try {
            this.c();
            SQLiteDatabase sQLiteDatabase = this.b;
            Object object = "id>=" + n2 + " and id<=" + n3;
            sQLiteDatabase = sQLiteDatabase.query("ls", new String[]{"id", "gb", "lc"}, (String)object, null, null, null, null);
            n2 = 1;
            do {
                if (!sQLiteDatabase.moveToNext()) {
                    sQLiteDatabase.close();
                    return arrayList;
                }
                object = new e();
                object.a(sQLiteDatabase.getInt(0));
                String string = sQLiteDatabase.getString(1);
                string = new String(Base64.decode((String)string.substring(4, string.length() - 2), (int)0));
                object.a(this.a(string.substring(6, string.length() - 4)));
                string = sQLiteDatabase.getString(2);
                string = new String(Base64.decode((String)string.substring(6, string.length() - 2), (int)0));
                object.b(this.a(string.substring(4, string.length() - 6)));
                object.b(n2);
                ++n2;
                arrayList.add(object);
                continue;
                break;
            } while (true);
            catch (Exception exception) {
                exception.printStackTrace();
                return arrayList;
            }
        }
        finally {
            this.close();
        }
    }

    /*
     * Exception decompiling
     */
    public byte[] a(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
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

    /*
     * Exception decompiling
     */
    public byte[] b(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
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

    public ArrayList c(int n2) {
        ArrayList arrayList = new ArrayList();
        try {
            this.c();
            SQLiteDatabase sQLiteDatabase = this.b;
            Object object = "pr=" + n2;
            sQLiteDatabase = sQLiteDatabase.query("pd", new String[]{"id", "gb", "lc", "m"}, (String)object, null, null, null, "id asc");
            do {
                if (!sQLiteDatabase.moveToNext()) {
                    sQLiteDatabase.close();
                    return arrayList;
                }
                object = new g();
                object.a(sQLiteDatabase.getInt(0));
                String string = sQLiteDatabase.getString(1);
                string = new String(Base64.decode((String)string.substring(4, string.length() - 2), (int)0));
                object.a(this.a(string.substring(6, string.length() - 4)));
                string = sQLiteDatabase.getString(2);
                string = new String(Base64.decode((String)string.substring(6, string.length() - 2), (int)0));
                object.b(this.a(string.substring(4, string.length() - 6)));
                object.c(new String(Base64.decode((String)this.a(sQLiteDatabase.getString(3)).substring(1), (int)0)));
                object.a(false);
                arrayList.add(object);
            } while (true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        finally {
            this.close();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        try {
            this.c();
            Cursor cursor = this.b.query("p", new String[]{"id", "gb", "lc"}, null, null, null, null, "id ASC");
            int n2 = 1;
            do {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return arrayList;
                }
                e e2 = new e();
                e2.a(cursor.getInt(0));
                String string = cursor.getString(1);
                string = new String(Base64.decode((String)string.substring(4, string.length() - 2), (int)0));
                e2.a(this.a(string.substring(6, string.length() - 4)));
                string = cursor.getString(2);
                string = new String(Base64.decode((String)string.substring(6, string.length() - 2), (int)0));
                e2.b(this.a(string.substring(4, string.length() - 6)));
                e2.b(n2);
                ++n2;
                arrayList.add((Object)e2);
                continue;
                break;
            } while (true);
            catch (Exception exception) {
                exception.printStackTrace();
                return arrayList;
            }
        }
        finally {
            this.close();
        }
    }

    public ArrayList d(int n2) {
        ArrayList arrayList = new ArrayList();
        try {
            this.c();
            SQLiteDatabase sQLiteDatabase = this.b;
            Object object = "pr=" + n2;
            sQLiteDatabase = sQLiteDatabase.query("lsd", new String[]{"id", "gb", "lc", "act", "t"}, (String)object, null, null, null, "id asc");
            do {
                if (!sQLiteDatabase.moveToNext()) {
                    sQLiteDatabase.close();
                    return arrayList;
                }
                object = new f();
                object.a(sQLiteDatabase.getInt(0));
                String string = sQLiteDatabase.getString(1);
                string = new String(Base64.decode((String)string.substring(4, string.length() - 2), (int)0));
                object.a(this.a(string.substring(6, string.length() - 4)));
                string = sQLiteDatabase.getString(2);
                string = new String(Base64.decode((String)string.substring(6, string.length() - 2), (int)0));
                object.d(this.a(string.substring(4, string.length() - 6)));
                object.b(sQLiteDatabase.getString(3));
                object.c(new String(Base64.decode((String)this.a(sQLiteDatabase.getString(4)).substring(1), (int)0)));
                object.b(false);
                arrayList.add(object);
            } while (true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        finally {
            this.close();
        }
    }
}

