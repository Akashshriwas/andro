package com.a.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import dn.class_190;
import dn.class_91;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

// $FF: renamed from: com.a.c.a
public class class_110 extends SQLiteOpenHelper {
   // $FF: renamed from: a java.lang.String
   @SuppressLint({"SdCardPath"})
   public static String field_111 = "/data/data/global.english.conversation/databases/";
   // $FF: renamed from: c java.lang.String
   private static String field_112 = "dt.sqlite";
   // $FF: renamed from: b android.database.sqlite.SQLiteDatabase
   public SQLiteDatabase field_113;
   // $FF: renamed from: d android.content.Context
   private final Context field_114 = class_190.method_805();

   public class_110() {
      super(class_190.method_805(), field_112, (CursorFactory)null, class_91.field_88);
   }

   // $FF: renamed from: d () boolean
   private boolean method_343() {
      IOException var10000;
      label49: {
         ZipInputStream var2;
         boolean var10001;
         try {
            var2 = new ZipInputStream(this.field_114.getResources().openRawResource(2131034112));
         } catch (IOException var11) {
            var10000 = var11;
            var10001 = false;
            break label49;
         }

         label46:
         while(true) {
            try {
               if (var2.getNextEntry() == null) {
                  var2.close();
                  return true;
               }
            } catch (IOException var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }

            ByteArrayOutputStream var3;
            byte[] var4;
            FileOutputStream var5;
            try {
               var3 = new ByteArrayOutputStream();
               var4 = new byte[1024];
               var5 = new FileOutputStream(field_111 + field_112);
            } catch (IOException var9) {
               var10000 = var9;
               var10001 = false;
               break;
            }

            while(true) {
               int var1;
               try {
                  var1 = var2.read(var4);
               } catch (IOException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label46;
               }

               if (var1 == -1) {
                  try {
                     var5.close();
                     var2.closeEntry();
                     break;
                  } catch (IOException var6) {
                     var10000 = var6;
                     var10001 = false;
                     break label46;
                  }
               }

               try {
                  var3.write(var4, 0, var1);
                  var5.write(var3.toByteArray());
                  var3.reset();
               } catch (IOException var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label46;
               }
            }
         }
      }

      IOException var12 = var10000;
      var12.printStackTrace();
      return false;
   }

   // $FF: renamed from: e () boolean
   private boolean method_344() {
      boolean var1 = false;

      boolean var2;
      try {
         var2 = (new File(field_111 + field_112)).exists();
      } catch (Exception var4) {
         return false;
      }

      if (var2) {
         var1 = true;
      }

      return var1;
   }

   // $FF: renamed from: a () boolean
   public boolean method_345() {
      boolean var1 = true;
      if (!this.method_344()) {
         this.getReadableDatabase();

         try {
            this.method_343();
         } catch (Exception var3) {
            throw new Error("Error copying database");
         }

         var1 = false;
      }

      return var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_346() {
      return (new File(field_111 + field_112)).delete();
   }

   // $FF: renamed from: c () void
   public void method_347() {
      this.field_113 = SQLiteDatabase.openDatabase(field_111 + field_112, (CursorFactory)null, 0);
   }

   public void close() {
      synchronized(this){}

      try {
         if (this.field_113 != null) {
            this.field_113.close();
         }

         super.close();
      } finally {
         ;
      }

   }

   public void onCreate(SQLiteDatabase var1) {
   }

   public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
   }
}
