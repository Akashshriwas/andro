// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.c;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.ZipInputStream;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import dn.f;
import dn.hs;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteOpenHelper;

public class a extends SQLiteOpenHelper
{
    @SuppressLint({ "SdCardPath" })
    public static String a;
    private static String c;
    public SQLiteDatabase b;
    private final Context d;
    
    static {
        com.a.c.a.a = "/data/data/global.english.conversation/databases/";
        com.a.c.a.c = "dt.sqlite";
    }
    
    public a() {
        super(hs.a(), com.a.c.a.c, (SQLiteDatabase$CursorFactory)null, f.g);
        this.d = hs.a();
    }
    
    private boolean d() {
        while (true) {
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = null;
                byte[] array = null;
                FileOutputStream fileOutputStream = null;
                int read = 0;
                Label_0110: {
                    try {
                        final ZipInputStream zipInputStream = new ZipInputStream(this.d.getResources().openRawResource(2131034112));
                        while (zipInputStream.getNextEntry() != null) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            array = new byte[1024];
                            fileOutputStream = new FileOutputStream(String.valueOf(com.a.c.a.a) + com.a.c.a.c);
                            read = zipInputStream.read(array);
                            if (read != -1) {
                                break Label_0110;
                            }
                            fileOutputStream.close();
                            zipInputStream.closeEntry();
                        }
                        zipInputStream.close();
                        return true;
                    }
                    catch (IOException ex) {
                        ex.printStackTrace();
                        return false;
                    }
                }
                byteArrayOutputStream.write(array, 0, read);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                continue;
            }
        }
    }
    
    private boolean e() {
        boolean b = false;
        try {
            if (new File(String.valueOf(com.a.c.a.a) + com.a.c.a.c).exists()) {
                b = true;
            }
            return b;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public boolean a() {
        boolean b = true;
        if (this.e()) {
            return b;
        }
        this.getReadableDatabase();
        try {
            this.d();
            b = false;
            return b;
        }
        catch (Exception ex) {
            throw new Error("Error copying database");
        }
    }
    
    public boolean b() {
        return new File(String.valueOf(com.a.c.a.a) + com.a.c.a.c).delete();
    }
    
    public void c() {
        this.b = SQLiteDatabase.openDatabase(String.valueOf(com.a.c.a.a) + com.a.c.a.c, (SQLiteDatabase$CursorFactory)null, 0);
    }
    
    public void close() {
        synchronized (this) {
            if (this.b != null) {
                this.b.close();
            }
            super.close();
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
