// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import android.content.Context;
import java.lang.reflect.Method;

public abstract class hy extends he
{
    static boolean d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static String k;
    private static long l;
    private static jm m;
    
    static {
        hy.l = 0L;
        hy.d = false;
    }
    
    protected hy(final Context context, final jk jk, final jl jl) {
        super(context, jk, jl);
    }
    
    static String a() {
        if (hy.k == null) {
            throw new hz();
        }
        return hy.k;
    }
    
    static String a(final Context context, final jk jk) {
        if (hy.g == null) {
            throw new hz();
        }
        try {
            if (hy.g.invoke(null, context) == null) {
                throw new hz();
            }
            goto Label_0055;
        }
        catch (IllegalAccessException ex) {
            throw new hz(ex);
        }
        catch (InvocationTargetException ex2) {
            throw new hz(ex2);
        }
    }
    
    static ArrayList a(final MotionEvent motionEvent, final DisplayMetrics displayMetrics) {
        if (hy.h == null || motionEvent == null) {
            throw new hz();
        }
        try {
            return (ArrayList)hy.h.invoke(null, motionEvent, displayMetrics);
        }
        catch (IllegalAccessException ex) {
            throw new hz(ex);
        }
        catch (InvocationTargetException ex2) {
            throw new hz(ex2);
        }
    }
    
    protected static void a(final String p0, final Context p1, final jk p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/internal/hy.d:Z
        //     6: istore_3       
        //     7: iload_3        
        //     8: ifne            44
        //    11: new             Lcom/google/android/gms/internal/jm;
        //    14: dup            
        //    15: aload_2        
        //    16: aconst_null    
        //    17: invokespecial   com/google/android/gms/internal/jm.<init>:(Lcom/google/android/gms/internal/jk;Ljava/security/SecureRandom;)V
        //    20: putstatic       com/google/android/gms/internal/hy.m:Lcom/google/android/gms/internal/jm;
        //    23: aload_0        
        //    24: putstatic       com/google/android/gms/internal/hy.k:Ljava/lang/String;
        //    27: aload_1        
        //    28: invokestatic    com/google/android/gms/internal/hy.e:(Landroid/content/Context;)V
        //    31: invokestatic    com/google/android/gms/internal/hy.b:()Ljava/lang/Long;
        //    34: invokevirtual   java/lang/Long.longValue:()J
        //    37: putstatic       com/google/android/gms/internal/hy.l:J
        //    40: iconst_1       
        //    41: putstatic       com/google/android/gms/internal/hy.d:Z
        //    44: ldc             Lcom/google/android/gms/internal/hy;.class
        //    46: monitorexit    
        //    47: return         
        //    48: astore_0       
        //    49: ldc             Lcom/google/android/gms/internal/hy;.class
        //    51: monitorexit    
        //    52: aload_0        
        //    53: athrow         
        //    54: astore_0       
        //    55: goto            44
        //    58: astore_0       
        //    59: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  3      7      48     54     Any
        //  11     44     58     62     Lcom/google/android/gms/internal/hz;
        //  11     44     54     58     Ljava/lang/UnsupportedOperationException;
        //  11     44     48     54     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    static Long b() {
        if (hy.e == null) {
            throw new hz();
        }
        try {
            return (Long)hy.e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException ex) {
            throw new hz(ex);
        }
        catch (InvocationTargetException ex2) {
            throw new hz(ex2);
        }
    }
    
    static String b(final Context context, final jk jk) {
        if (hy.j == null) {
            throw new hz();
        }
        try {
            if (hy.j.invoke(null, context) == null) {
                throw new hz();
            }
            goto Label_0055;
        }
        catch (IllegalAccessException ex) {
            throw new hz(ex);
        }
        catch (InvocationTargetException ex2) {
            throw new hz(ex2);
        }
    }
    
    private static String b(final byte[] array, final String s) {
        try {
            return new String(hy.m.a(array, s), "UTF-8");
        }
        catch (jn jn) {
            throw new hz(jn);
        }
        catch (UnsupportedEncodingException ex) {
            throw new hz(ex);
        }
    }
    
    static String c() {
        if (hy.f == null) {
            throw new hz();
        }
        try {
            return (String)hy.f.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException ex) {
            throw new hz(ex);
        }
        catch (InvocationTargetException ex2) {
            throw new hz(ex2);
        }
    }
    
    static String d(final Context context) {
        if (hy.i == null) {
            throw new hz();
        }
        String s;
        try {
            s = (String)hy.i.invoke(null, context);
            if (s == null) {
                throw new hz();
            }
        }
        catch (IllegalAccessException ex) {
            throw new hz(ex);
        }
        catch (InvocationTargetException ex2) {
            throw new hz(ex2);
        }
        return s;
    }
    
    private static void e(final Context context) {
        try {
            hy.m.a(hy.m.a(jp.a()), jp.b());
            final File dir;
            if (context.getCacheDir() == null && (dir = context.getDir("dex", 0)) == null) {
                throw new hz();
            }
            goto Label_0065;
        }
        catch (FileNotFoundException ex) {
            throw new hz(ex);
        }
        catch (IOException ex2) {
            throw new hz(ex2);
        }
        catch (ClassNotFoundException ex3) {
            throw new hz(ex3);
        }
        catch (jn jn) {
            throw new hz(jn);
        }
        catch (NoSuchMethodException ex4) {
            throw new hz(ex4);
        }
        catch (NullPointerException ex5) {
            throw new hz(ex5);
        }
    }
    
    @Override
    protected void b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_1       
        //     2: invokestatic    com/google/android/gms/internal/hy.c:()Ljava/lang/String;
        //     5: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //     8: aload_0        
        //     9: iconst_2       
        //    10: invokestatic    com/google/android/gms/internal/hy.a:()Ljava/lang/String;
        //    13: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //    16: aload_0        
        //    17: bipush          25
        //    19: invokestatic    com/google/android/gms/internal/hy.b:()Ljava/lang/Long;
        //    22: invokevirtual   java/lang/Long.longValue:()J
        //    25: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //    28: aload_0        
        //    29: bipush          24
        //    31: aload_1        
        //    32: invokestatic    com/google/android/gms/internal/hy.d:(Landroid/content/Context;)Ljava/lang/String;
        //    35: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //    38: return         
        //    39: astore_1       
        //    40: return         
        //    41: astore_1       
        //    42: return         
        //    43: astore_2       
        //    44: goto            28
        //    47: astore_2       
        //    48: goto            16
        //    51: astore_2       
        //    52: goto            8
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      8      51     55     Lcom/google/android/gms/internal/hz;
        //  0      8      39     41     Ljava/io/IOException;
        //  8      16     47     51     Lcom/google/android/gms/internal/hz;
        //  8      16     39     41     Ljava/io/IOException;
        //  16     28     43     47     Lcom/google/android/gms/internal/hz;
        //  16     28     39     41     Ljava/io/IOException;
        //  28     38     41     43     Lcom/google/android/gms/internal/hz;
        //  28     38     39     41     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0008:
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
    
    @Override
    protected void c(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_2       
        //     2: invokestatic    com/google/android/gms/internal/hy.a:()Ljava/lang/String;
        //     5: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //     8: aload_0        
        //     9: iconst_1       
        //    10: invokestatic    com/google/android/gms/internal/hy.c:()Ljava/lang/String;
        //    13: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //    16: invokestatic    com/google/android/gms/internal/hy.b:()Ljava/lang/Long;
        //    19: invokevirtual   java/lang/Long.longValue:()J
        //    22: lstore_2       
        //    23: aload_0        
        //    24: bipush          25
        //    26: lload_2        
        //    27: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //    30: getstatic       com/google/android/gms/internal/hy.l:J
        //    33: lconst_0       
        //    34: lcmp           
        //    35: ifeq            58
        //    38: aload_0        
        //    39: bipush          17
        //    41: lload_2        
        //    42: getstatic       com/google/android/gms/internal/hy.l:J
        //    45: lsub           
        //    46: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //    49: aload_0        
        //    50: bipush          23
        //    52: getstatic       com/google/android/gms/internal/hy.l:J
        //    55: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //    58: aload_0        
        //    59: getfield        com/google/android/gms/internal/hy.a:Landroid/view/MotionEvent;
        //    62: aload_0        
        //    63: getfield        com/google/android/gms/internal/hy.b:Landroid/util/DisplayMetrics;
        //    66: invokestatic    com/google/android/gms/internal/hy.a:(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;
        //    69: astore          4
        //    71: aload_0        
        //    72: bipush          14
        //    74: aload           4
        //    76: iconst_0       
        //    77: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    80: checkcast       Ljava/lang/Long;
        //    83: invokevirtual   java/lang/Long.longValue:()J
        //    86: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //    89: aload_0        
        //    90: bipush          15
        //    92: aload           4
        //    94: iconst_1       
        //    95: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    98: checkcast       Ljava/lang/Long;
        //   101: invokevirtual   java/lang/Long.longValue:()J
        //   104: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //   107: aload           4
        //   109: invokevirtual   java/util/ArrayList.size:()I
        //   112: iconst_3       
        //   113: if_icmplt       134
        //   116: aload_0        
        //   117: bipush          16
        //   119: aload           4
        //   121: iconst_2       
        //   122: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   125: checkcast       Ljava/lang/Long;
        //   128: invokevirtual   java/lang/Long.longValue:()J
        //   131: invokevirtual   com/google/android/gms/internal/hy.a:(IJ)V
        //   134: aload_0        
        //   135: bipush          27
        //   137: aload_1        
        //   138: aload_0        
        //   139: getfield        com/google/android/gms/internal/hy.c:Lcom/google/android/gms/internal/jk;
        //   142: invokestatic    com/google/android/gms/internal/hy.a:(Landroid/content/Context;Lcom/google/android/gms/internal/jk;)Ljava/lang/String;
        //   145: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //   148: aload_0        
        //   149: bipush          29
        //   151: aload_1        
        //   152: aload_0        
        //   153: getfield        com/google/android/gms/internal/hy.c:Lcom/google/android/gms/internal/jk;
        //   156: invokestatic    com/google/android/gms/internal/hy.b:(Landroid/content/Context;Lcom/google/android/gms/internal/jk;)Ljava/lang/String;
        //   159: invokevirtual   com/google/android/gms/internal/hy.a:(ILjava/lang/String;)V
        //   162: return         
        //   163: astore_1       
        //   164: return         
        //   165: astore_1       
        //   166: return         
        //   167: astore          4
        //   169: goto            148
        //   172: astore          4
        //   174: goto            134
        //   177: astore          4
        //   179: goto            58
        //   182: astore          4
        //   184: goto            16
        //   187: astore          4
        //   189: goto            8
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      8      187    192    Lcom/google/android/gms/internal/hz;
        //  0      8      163    165    Ljava/io/IOException;
        //  8      16     182    187    Lcom/google/android/gms/internal/hz;
        //  8      16     163    165    Ljava/io/IOException;
        //  16     58     177    182    Lcom/google/android/gms/internal/hz;
        //  16     58     163    165    Ljava/io/IOException;
        //  58     134    172    177    Lcom/google/android/gms/internal/hz;
        //  58     134    163    165    Ljava/io/IOException;
        //  134    148    167    172    Lcom/google/android/gms/internal/hz;
        //  134    148    163    165    Ljava/io/IOException;
        //  148    162    165    167    Lcom/google/android/gms/internal/hz;
        //  148    162    163    165    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0008:
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
}
