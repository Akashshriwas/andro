// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.d;

import com.a.h.f;
import com.a.h.g;
import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import com.a.h.e;

public class a extends com.a.c.a
{
    String c;
    
    public a() {
        this.c = "aGorPS5tw6BsIGnEkSBu4bqhYiBhxrD";
    }
    
    private String a(final String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        final int length = s.length();
        String string = "";
        for (int i = length - 1; i >= 0; --i) {
            string = String.valueOf(string) + s.charAt(i);
        }
        return string;
    }
    
    public e a(final e p0, final Boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/a/h/e.d:()I
        //     4: istore          4
        //     6: aload_1        
        //     7: invokevirtual   com/a/h/e.a:()I
        //    10: istore          5
        //    12: invokestatic    dn/f.a:()Ldn/f;
        //    15: getstatic       dn/f.a:Ljava/lang/String;
        //    18: invokevirtual   dn/f.b:(Ljava/lang/String;)I
        //    21: tableswitch {
        //                2: 75
        //                3: 81
        //          default: 44
        //        }
        //    44: bipush          34
        //    46: istore_3       
        //    47: iload           4
        //    49: iconst_1       
        //    50: if_icmpne       60
        //    53: aload_2        
        //    54: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    57: ifeq            73
        //    60: iload           4
        //    62: iload_3        
        //    63: if_icmpne       87
        //    66: aload_2        
        //    67: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    70: ifeq            87
        //    73: aload_1        
        //    74: areturn        
        //    75: bipush          68
        //    77: istore_3       
        //    78: goto            47
        //    81: bipush          100
        //    83: istore_3       
        //    84: goto            47
        //    87: aload_2        
        //    88: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    91: ifeq            323
        //    94: iload           5
        //    96: iconst_1       
        //    97: iadd           
        //    98: istore_3       
        //    99: iload           4
        //   101: iconst_1       
        //   102: iadd           
        //   103: istore          4
        //   105: aload_0        
        //   106: invokevirtual   com/a/d/a.c:()V
        //   109: aload_0        
        //   110: getfield        com/a/d/a.b:Landroid/database/sqlite/SQLiteDatabase;
        //   113: astore_1       
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: ldc             "id="
        //   120: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   123: iload_3        
        //   124: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   127: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   130: astore_2       
        //   131: aload_1        
        //   132: ldc             "ls"
        //   134: iconst_3       
        //   135: anewarray       Ljava/lang/String;
        //   138: dup            
        //   139: iconst_0       
        //   140: ldc             "id"
        //   142: aastore        
        //   143: dup            
        //   144: iconst_1       
        //   145: ldc             "gb"
        //   147: aastore        
        //   148: dup            
        //   149: iconst_2       
        //   150: ldc             "lc"
        //   152: aastore        
        //   153: aload_2        
        //   154: aconst_null    
        //   155: aconst_null    
        //   156: aconst_null    
        //   157: aconst_null    
        //   158: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   161: astore_2       
        //   162: aload_2        
        //   163: invokeinterface android/database/Cursor.moveToNext:()Z
        //   168: ifeq            366
        //   171: new             Lcom/a/h/e;
        //   174: dup            
        //   175: invokespecial   com/a/h/e.<init>:()V
        //   178: astore_1       
        //   179: aload_1        
        //   180: aload_2        
        //   181: iconst_0       
        //   182: invokeinterface android/database/Cursor.getInt:(I)I
        //   187: invokevirtual   com/a/h/e.a:(I)V
        //   190: aload_2        
        //   191: iconst_1       
        //   192: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   197: astore          6
        //   199: new             Ljava/lang/String;
        //   202: dup            
        //   203: aload           6
        //   205: iconst_4       
        //   206: aload           6
        //   208: invokevirtual   java/lang/String.length:()I
        //   211: iconst_2       
        //   212: isub           
        //   213: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   216: iconst_0       
        //   217: invokestatic    android/util/Base64.decode:(Ljava/lang/String;I)[B
        //   220: invokespecial   java/lang/String.<init>:([B)V
        //   223: astore          6
        //   225: aload_1        
        //   226: aload_0        
        //   227: aload           6
        //   229: bipush          6
        //   231: aload           6
        //   233: invokevirtual   java/lang/String.length:()I
        //   236: iconst_4       
        //   237: isub           
        //   238: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   241: invokespecial   com/a/d/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   244: invokevirtual   com/a/h/e.a:(Ljava/lang/String;)V
        //   247: aload_2        
        //   248: iconst_2       
        //   249: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   254: astore          6
        //   256: new             Ljava/lang/String;
        //   259: dup            
        //   260: aload           6
        //   262: bipush          6
        //   264: aload           6
        //   266: invokevirtual   java/lang/String.length:()I
        //   269: iconst_2       
        //   270: isub           
        //   271: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   274: iconst_0       
        //   275: invokestatic    android/util/Base64.decode:(Ljava/lang/String;I)[B
        //   278: invokespecial   java/lang/String.<init>:([B)V
        //   281: astore          6
        //   283: aload_1        
        //   284: aload_0        
        //   285: aload           6
        //   287: iconst_4       
        //   288: aload           6
        //   290: invokevirtual   java/lang/String.length:()I
        //   293: bipush          6
        //   295: isub           
        //   296: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   299: invokespecial   com/a/d/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   302: invokevirtual   com/a/h/e.b:(Ljava/lang/String;)V
        //   305: aload_1        
        //   306: iload           4
        //   308: invokevirtual   com/a/h/e.b:(I)V
        //   311: aload_2        
        //   312: invokeinterface android/database/Cursor.close:()V
        //   317: aload_0        
        //   318: invokevirtual   com/a/d/a.close:()V
        //   321: aload_1        
        //   322: areturn        
        //   323: iload           5
        //   325: iconst_1       
        //   326: isub           
        //   327: istore_3       
        //   328: iload           4
        //   330: iconst_1       
        //   331: isub           
        //   332: istore          4
        //   334: goto            105
        //   337: astore_2       
        //   338: aconst_null    
        //   339: astore_1       
        //   340: aload_2        
        //   341: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   344: aload_0        
        //   345: invokevirtual   com/a/d/a.close:()V
        //   348: goto            321
        //   351: astore_1       
        //   352: aload_0        
        //   353: invokevirtual   com/a/d/a.close:()V
        //   356: aload_1        
        //   357: athrow         
        //   358: astore_2       
        //   359: goto            340
        //   362: astore_2       
        //   363: goto            340
        //   366: aconst_null    
        //   367: astore_1       
        //   368: goto            311
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  105    179    337    340    Ljava/lang/Exception;
        //  105    179    351    358    Any
        //  179    311    358    362    Ljava/lang/Exception;
        //  179    311    351    358    Any
        //  311    317    362    366    Ljava/lang/Exception;
        //  311    317    351    358    Any
        //  340    344    351    358    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 185 out of bounds for length 185
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:359)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:427)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ArrayList a(int i, final int j) {
        final ArrayList<e> list = new ArrayList<e>();
        try {
            this.c();
            final Cursor query = this.b.query("ls", new String[] { "id", "gb", "lc" }, "id>=" + i + " and id<=" + j, (String[])null, (String)null, (String)null, (String)null);
            i = 1;
            while (query.moveToNext()) {
                final e e = new e();
                e.a(query.getInt(0));
                final String string = query.getString(1);
                final String s = new String(Base64.decode(string.substring(4, string.length() - 2), 0));
                e.a(this.a(s.substring(6, s.length() - 4)));
                final String string2 = query.getString(2);
                final String s2 = new String(Base64.decode(string2.substring(6, string2.length() - 2), 0));
                e.b(this.a(s2.substring(4, s2.length() - 6)));
                e.b(i);
                ++i;
                list.add(e);
            }
            query.close();
            return list;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return list;
        }
        finally {
            this.close();
        }
    }
    
    public byte[] a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/a/d/a.c:()V
        //     4: aload_0        
        //     5: getfield        com/a/d/a.b:Landroid/database/sqlite/SQLiteDatabase;
        //     8: astore_2       
        //     9: new             Ljava/lang/StringBuilder;
        //    12: dup            
        //    13: ldc             "id = "
        //    15: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    18: iload_1        
        //    19: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    22: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    25: astore_3       
        //    26: aload_2        
        //    27: ldc             "ls"
        //    29: iconst_1       
        //    30: anewarray       Ljava/lang/String;
        //    33: dup            
        //    34: iconst_0       
        //    35: ldc             "au"
        //    37: aastore        
        //    38: aload_3        
        //    39: aconst_null    
        //    40: aconst_null    
        //    41: aconst_null    
        //    42: aconst_null    
        //    43: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    46: astore_3       
        //    47: aload_3        
        //    48: invokeinterface android/database/Cursor.moveToNext:()Z
        //    53: ifeq            100
        //    56: aload_3        
        //    57: iconst_0       
        //    58: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    63: astore_2       
        //    64: aload_3        
        //    65: invokeinterface android/database/Cursor.close:()V
        //    70: aload_0        
        //    71: invokevirtual   com/a/d/a.close:()V
        //    74: aload_2        
        //    75: areturn        
        //    76: astore_3       
        //    77: aconst_null    
        //    78: astore_2       
        //    79: aload_3        
        //    80: invokevirtual   java/lang/Exception.printStackTrace:()V
        //    83: aload_0        
        //    84: invokevirtual   com/a/d/a.close:()V
        //    87: aload_2        
        //    88: areturn        
        //    89: astore_2       
        //    90: aload_0        
        //    91: invokevirtual   com/a/d/a.close:()V
        //    94: aload_2        
        //    95: athrow         
        //    96: astore_3       
        //    97: goto            79
        //   100: aconst_null    
        //   101: astore_2       
        //   102: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      64     76     79     Ljava/lang/Exception;
        //  0      64     89     96     Any
        //  64     70     96     100    Ljava/lang/Exception;
        //  64     70     89     96     Any
        //  79     83     89     96     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public byte[] b(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/a/d/a.c:()V
        //     4: aload_0        
        //     5: getfield        com/a/d/a.b:Landroid/database/sqlite/SQLiteDatabase;
        //     8: astore_2       
        //     9: new             Ljava/lang/StringBuilder;
        //    12: dup            
        //    13: ldc             "id = "
        //    15: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    18: iload_1        
        //    19: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    22: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    25: astore_3       
        //    26: aload_2        
        //    27: ldc             "pd"
        //    29: iconst_1       
        //    30: anewarray       Ljava/lang/String;
        //    33: dup            
        //    34: iconst_0       
        //    35: ldc             "au"
        //    37: aastore        
        //    38: aload_3        
        //    39: aconst_null    
        //    40: aconst_null    
        //    41: aconst_null    
        //    42: aconst_null    
        //    43: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    46: astore_3       
        //    47: aload_3        
        //    48: invokeinterface android/database/Cursor.moveToNext:()Z
        //    53: ifeq            100
        //    56: aload_3        
        //    57: iconst_0       
        //    58: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    63: astore_2       
        //    64: aload_3        
        //    65: invokeinterface android/database/Cursor.close:()V
        //    70: aload_0        
        //    71: invokevirtual   com/a/d/a.close:()V
        //    74: aload_2        
        //    75: areturn        
        //    76: astore_3       
        //    77: aconst_null    
        //    78: astore_2       
        //    79: aload_3        
        //    80: invokevirtual   java/lang/Exception.printStackTrace:()V
        //    83: aload_0        
        //    84: invokevirtual   com/a/d/a.close:()V
        //    87: aload_2        
        //    88: areturn        
        //    89: astore_2       
        //    90: aload_0        
        //    91: invokevirtual   com/a/d/a.close:()V
        //    94: aload_2        
        //    95: athrow         
        //    96: astore_3       
        //    97: goto            79
        //   100: aconst_null    
        //   101: astore_2       
        //   102: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      64     76     79     Ljava/lang/Exception;
        //  0      64     89     96     Any
        //  64     70     96     100    Ljava/lang/Exception;
        //  64     70     89     96     Any
        //  79     83     89     96     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ArrayList c(final int i) {
        final ArrayList<g> list = new ArrayList<g>();
        try {
            this.c();
            final Cursor query = this.b.query("pd", new String[] { "id", "gb", "lc", "m" }, "pr=" + i, (String[])null, (String)null, (String)null, "id asc");
            while (query.moveToNext()) {
                final g e = new g();
                e.a(query.getInt(0));
                final String string = query.getString(1);
                final String s = new String(Base64.decode(string.substring(4, string.length() - 2), 0));
                e.a(this.a(s.substring(6, s.length() - 4)));
                final String string2 = query.getString(2);
                final String s2 = new String(Base64.decode(string2.substring(6, string2.length() - 2), 0));
                e.b(this.a(s2.substring(4, s2.length() - 6)));
                e.c(new String(Base64.decode(this.a(query.getString(3)).substring(1), 0)));
                e.a(false);
                list.add(e);
            }
            query.close();
            return list;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        finally {
            this.close();
        }
    }
    
    public ArrayList d() {
        final ArrayList<e> list = new ArrayList<e>();
        try {
            this.c();
            final Cursor query = this.b.query("p", new String[] { "id", "gb", "lc" }, (String)null, (String[])null, (String)null, (String)null, "id ASC");
            int n = 1;
            while (query.moveToNext()) {
                final e e = new e();
                e.a(query.getInt(0));
                final String string = query.getString(1);
                final String s = new String(Base64.decode(string.substring(4, string.length() - 2), 0));
                e.a(this.a(s.substring(6, s.length() - 4)));
                final String string2 = query.getString(2);
                final String s2 = new String(Base64.decode(string2.substring(6, string2.length() - 2), 0));
                e.b(this.a(s2.substring(4, s2.length() - 6)));
                e.b(n);
                ++n;
                list.add(e);
            }
            query.close();
            return list;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return list;
        }
        finally {
            this.close();
        }
    }
    
    public ArrayList d(final int i) {
        final ArrayList<f> list = new ArrayList<f>();
        try {
            this.c();
            final Cursor query = this.b.query("lsd", new String[] { "id", "gb", "lc", "act", "t" }, "pr=" + i, (String[])null, (String)null, (String)null, "id asc");
            while (query.moveToNext()) {
                final f e = new f();
                e.a(query.getInt(0));
                final String string = query.getString(1);
                final String s = new String(Base64.decode(string.substring(4, string.length() - 2), 0));
                e.a(this.a(s.substring(6, s.length() - 4)));
                final String string2 = query.getString(2);
                final String s2 = new String(Base64.decode(string2.substring(6, string2.length() - 2), 0));
                e.d(this.a(s2.substring(4, s2.length() - 6)));
                e.b(query.getString(3));
                e.c(new String(Base64.decode(this.a(query.getString(4)).substring(1), 0)));
                e.b(false);
                list.add(e);
            }
            query.close();
            return list;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        finally {
            this.close();
        }
    }
}
