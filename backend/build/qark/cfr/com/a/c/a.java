/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipInputStream
 */
package com.a.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import dn.f;
import dn.hs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class a
extends SQLiteOpenHelper {
    @SuppressLint(value={"SdCardPath"})
    public static String a = "/data/data/global.english.conversation/databases/";
    private static String c = "dt.sqlite";
    public SQLiteDatabase b;
    private final Context d = hs.a();

    public a() {
        super(hs.a(), c, null, f.g);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean d() {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(this.d.getResources().openRawResource(2131034112));
            block3 : do {
                if (zipInputStream.getNextEntry() == null) {
                    zipInputStream.close();
                    return true;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] arrby = new byte[1024];
                FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf((Object)a) + c);
                do {
                    int n2;
                    if ((n2 = zipInputStream.read(arrby)) == -1) {
                        fileOutputStream.close();
                        zipInputStream.closeEntry();
                        continue block3;
                    }
                    byteArrayOutputStream.write(arrby, 0, n2);
                    fileOutputStream.write(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                } while (true);
                break;
            } while (true);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }

    private boolean e() {
        boolean bl2 = false;
        try {
            boolean bl3 = new File(String.valueOf((Object)a) + c).exists();
            if (bl3) {
                bl2 = true;
            }
            return bl2;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        boolean bl2 = true;
        if (this.e()) return bl2;
        this.getReadableDatabase();
        try {
            this.d();
            return false;
        }
        catch (Exception exception) {
            throw new Error("Error copying database");
        }
    }

    public boolean b() {
        return new File(String.valueOf((Object)a) + c).delete();
    }

    public void c() {
        this.b = SQLiteDatabase.openDatabase((String)(String.valueOf((Object)a) + c), (SQLiteDatabase.CursorFactory)null, (int)0);
    }

    public void close() {
        synchronized (this) {
            if (this.b != null) {
                this.b.close();
            }
            super.close();
            return;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
    }
}

