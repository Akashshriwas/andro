// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.h;

import java.util.Locale;
import dn.f;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
    private static a a(final String s) {
        a a = null;
        try {
            a = new a();
            final String s2 = s;
            final JSONObject jsonObject = new JSONObject(s2);
            final a a2 = a;
            final JSONObject jsonObject2 = jsonObject;
            final String s3 = "adsLinkEN";
            final String s4 = jsonObject2.getString(s3);
            a2.d(s4);
            final a a3 = a;
            final JSONObject jsonObject3 = jsonObject;
            final String s5 = "adsLinkVN";
            final String s6 = jsonObject3.getString(s5);
            a3.c(s6);
            final a a4 = a;
            final JSONObject jsonObject4 = jsonObject;
            final String s7 = "adsTitleEN";
            final String s8 = jsonObject4.getString(s7);
            a4.f(s8);
            final a a5 = a;
            final JSONObject jsonObject5 = jsonObject;
            final String s9 = "adsTitleVI";
            final String s10 = jsonObject5.getString(s9);
            a5.e(s10);
            final a a6 = a;
            final JSONObject jsonObject6 = jsonObject;
            final String s11 = "adsVersion";
            final int n = jsonObject6.getInt(s11);
            a6.b(n);
            final a a7 = a;
            final JSONObject jsonObject7 = jsonObject;
            final String s12 = "appVersion";
            final int n2 = jsonObject7.getInt(s12);
            a7.a(n2);
            final a a8 = a;
            final JSONObject jsonObject8 = jsonObject;
            final String s13 = "appVersionTitleEN";
            final String s14 = jsonObject8.getString(s13);
            a8.b(s14);
            final a a9 = a;
            final JSONObject jsonObject9 = jsonObject;
            final String s15 = "appVersionTitleVI";
            final String s16 = jsonObject9.getString(s15);
            a9.a(s16);
            final a a10 = a;
            final JSONObject jsonObject10 = jsonObject;
            final String s17 = "notified";
            final boolean b = jsonObject10.getBoolean(s17);
            a10.a(b);
            final a a11 = a;
            final JSONObject jsonObject11 = jsonObject;
            final String s18 = "serverLink";
            final String s19 = jsonObject11.getString(s18);
            a11.g(s19);
            return a;
        }
        catch (JSONException a) {
            final a a13 = null;
        }
        while (true) {
            try {
                final String s2 = s;
                final JSONObject jsonObject = new JSONObject(s2);
                final a a2 = a;
                final JSONObject jsonObject2 = jsonObject;
                final String s3 = "adsLinkEN";
                final String s4 = jsonObject2.getString(s3);
                a2.d(s4);
                final a a3 = a;
                final JSONObject jsonObject3 = jsonObject;
                final String s5 = "adsLinkVN";
                final String s6 = jsonObject3.getString(s5);
                a3.c(s6);
                final a a4 = a;
                final JSONObject jsonObject4 = jsonObject;
                final String s7 = "adsTitleEN";
                final String s8 = jsonObject4.getString(s7);
                a4.f(s8);
                final a a5 = a;
                final JSONObject jsonObject5 = jsonObject;
                final String s9 = "adsTitleVI";
                final String s10 = jsonObject5.getString(s9);
                a5.e(s10);
                final a a6 = a;
                final JSONObject jsonObject6 = jsonObject;
                final String s11 = "adsVersion";
                final int n = jsonObject6.getInt(s11);
                a6.b(n);
                final a a7 = a;
                final JSONObject jsonObject7 = jsonObject;
                final String s12 = "appVersion";
                final int n2 = jsonObject7.getInt(s12);
                a7.a(n2);
                final a a8 = a;
                final JSONObject jsonObject8 = jsonObject;
                final String s13 = "appVersionTitleEN";
                final String s14 = jsonObject8.getString(s13);
                a8.b(s14);
                final a a9 = a;
                final JSONObject jsonObject9 = jsonObject;
                final String s15 = "appVersionTitleVI";
                final String s16 = jsonObject9.getString(s15);
                a9.a(s16);
                final a a10 = a;
                final JSONObject jsonObject10 = jsonObject;
                final String s17 = "notified";
                final boolean b = jsonObject10.getBoolean(s17);
                a10.a(b);
                final a a11 = a;
                final JSONObject jsonObject11 = jsonObject;
                final String s18 = "serverLink";
                final String s19 = jsonObject11.getString(s18);
                a11.g(s19);
                return a;
                ((JSONException)a).printStackTrace();
                return;
            }
            catch (JSONException ex) {
                final a a13 = a;
                a = (a)ex;
                continue;
            }
            break;
        }
    }
    
    private static String a(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: new             Ljava/io/InputStreamReader;
        //     7: dup            
        //     8: aload_0        
        //     9: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    12: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    15: astore_2       
        //    16: ldc             ""
        //    18: astore_0       
        //    19: aload_2        
        //    20: astore_1       
        //    21: aload_2        
        //    22: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    25: astore_3       
        //    26: aload_3        
        //    27: ifnonnull       44
        //    30: aload_0        
        //    31: astore_1       
        //    32: aload_2        
        //    33: ifnull          42
        //    36: aload_2        
        //    37: invokevirtual   java/io/BufferedReader.close:()V
        //    40: aload_0        
        //    41: astore_1       
        //    42: aload_1        
        //    43: areturn        
        //    44: aload_2        
        //    45: astore_1       
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: aload_0        
        //    51: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    54: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    57: aload_3        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: astore_3       
        //    65: aload_3        
        //    66: astore_0       
        //    67: goto            19
        //    70: astore_3       
        //    71: aconst_null    
        //    72: astore_2       
        //    73: ldc             ""
        //    75: astore_0       
        //    76: aload_2        
        //    77: astore_1       
        //    78: aload_3        
        //    79: invokevirtual   java/lang/Exception.printStackTrace:()V
        //    82: aload_0        
        //    83: astore_1       
        //    84: aload_2        
        //    85: ifnull          42
        //    88: aload_2        
        //    89: invokevirtual   java/io/BufferedReader.close:()V
        //    92: aload_0        
        //    93: areturn        
        //    94: astore_1       
        //    95: aload_1        
        //    96: invokevirtual   java/io/IOException.printStackTrace:()V
        //    99: aload_0        
        //   100: areturn        
        //   101: astore_0       
        //   102: aconst_null    
        //   103: astore_1       
        //   104: aload_1        
        //   105: ifnull          112
        //   108: aload_1        
        //   109: invokevirtual   java/io/BufferedReader.close:()V
        //   112: aload_0        
        //   113: athrow         
        //   114: astore_1       
        //   115: aload_1        
        //   116: invokevirtual   java/io/IOException.printStackTrace:()V
        //   119: goto            112
        //   122: astore_1       
        //   123: aload_1        
        //   124: invokevirtual   java/io/IOException.printStackTrace:()V
        //   127: aload_0        
        //   128: areturn        
        //   129: astore_0       
        //   130: goto            104
        //   133: astore_3       
        //   134: goto            76
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      16     70     76     Ljava/lang/Exception;
        //  0      16     101    104    Any
        //  21     26     133    137    Ljava/lang/Exception;
        //  21     26     129    133    Any
        //  36     40     122    129    Ljava/io/IOException;
        //  46     65     133    137    Ljava/lang/Exception;
        //  46     65     129    133    Any
        //  78     82     129    133    Any
        //  88     92     94     101    Ljava/io/IOException;
        //  108    112    114    122    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public static void a(final Context context) {
        if (dn.a.a() && context != null) {
            new Thread(new c(context)).start();
        }
    }
    
    private static boolean a(final String s, final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo(s, 1);
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    private static boolean b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: new             Ljava/net/URL;
        //     5: dup            
        //     6: ldc             "%s%s%s"
        //     8: iconst_3       
        //     9: anewarray       Ljava/lang/Object;
        //    12: dup            
        //    13: iconst_0       
        //    14: getstatic       dn/g.a:Ljava/lang/String;
        //    17: aastore        
        //    18: dup            
        //    19: iconst_1       
        //    20: getstatic       com/a/a/b.a:Ljava/lang/String;
        //    23: aastore        
        //    24: dup            
        //    25: iconst_2       
        //    26: getstatic       dn/f.k:Ljava/lang/String;
        //    29: aastore        
        //    30: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    33: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    36: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    39: checkcast       Ljava/net/HttpURLConnection;
        //    42: astore_0       
        //    43: new             Ljava/io/BufferedInputStream;
        //    46: dup            
        //    47: aload_0        
        //    48: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //    51: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    54: invokestatic    com/a/h/b.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    57: astore_1       
        //    58: aload_1        
        //    59: ifnull          80
        //    62: aload_1        
        //    63: invokevirtual   java/lang/String.length:()I
        //    66: ifle            80
        //    69: invokestatic    dn/f.a:()Ldn/f;
        //    72: getstatic       dn/f.f:Ljava/lang/String;
        //    75: aload_1        
        //    76: invokevirtual   dn/f.a:(Ljava/lang/String;Ljava/lang/String;)Ldn/f;
        //    79: pop            
        //    80: aload_0        
        //    81: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    84: iconst_1       
        //    85: ireturn        
        //    86: astore_1       
        //    87: aconst_null    
        //    88: astore_0       
        //    89: aload_1        
        //    90: invokevirtual   java/lang/Exception.printStackTrace:()V
        //    93: aload_0        
        //    94: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    97: iconst_0       
        //    98: ireturn        
        //    99: astore_0       
        //   100: aload_1        
        //   101: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   104: aload_0        
        //   105: athrow         
        //   106: astore_2       
        //   107: aload_0        
        //   108: astore_1       
        //   109: aload_2        
        //   110: astore_0       
        //   111: goto            100
        //   114: astore_2       
        //   115: aload_0        
        //   116: astore_1       
        //   117: aload_2        
        //   118: astore_0       
        //   119: goto            100
        //   122: astore_1       
        //   123: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      43     86     89     Ljava/lang/Exception;
        //  2      43     99     100    Any
        //  43     58     122    126    Ljava/lang/Exception;
        //  43     58     106    114    Any
        //  62     80     122    126    Ljava/lang/Exception;
        //  62     80     106    114    Any
        //  89     93     114    122    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 73 out of bounds for length 73
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
    
    private static void c(final Context context) {
        while (true) {
            while (true) {
                Label_0316: {
                    while (true) {
                        a a2 = null;
                        Label_0299: {
                            try {
                                final String a = f.a().a(f.f);
                                if (!dn.a.a() || a == null) {
                                    break;
                                }
                                a2 = a(a);
                                if (a2 == null) {
                                    break;
                                }
                                int b = f.a().b(f.m);
                                final int a3 = a2.a();
                                if (b != -1) {
                                    break Label_0316;
                                }
                                b = a3;
                                final com.a.b.b b2 = null;
                                if (a2.i() != null) {
                                    f.a().a(f.e, a2.i());
                                }
                                if (!a2.d) {
                                    break;
                                }
                                com.a.b.b b3;
                                if (a3 > b) {
                                    String s;
                                    if (Locale.getDefault().getLanguage().equalsIgnoreCase("en")) {
                                        s = a2.c();
                                    }
                                    else {
                                        s = a2.b();
                                    }
                                    b3 = new com.a.b.b(context, s, context.getPackageName());
                                }
                                else {
                                    int n;
                                    if ((n = f.a().b(f.n)) == -1) {
                                        n = a2.h();
                                    }
                                    b3 = b2;
                                    if (a2.h() > n) {
                                        b3 = b2;
                                        if (!a(a2.e(), context)) {
                                            b3 = b2;
                                            if (!a(a2.d(), context)) {
                                                if (!Locale.getDefault().getLanguage().equalsIgnoreCase("en")) {
                                                    break Label_0299;
                                                }
                                                final String s2 = a2.g();
                                                final String s3 = a2.e();
                                                b3 = new com.a.b.b(context, s2, s3);
                                            }
                                        }
                                    }
                                }
                                f.a().a(f.m, a3);
                                f.a().a(f.n, a2.h());
                                if (b3 != null) {
                                    b3.a();
                                    return;
                                }
                                break;
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                                return;
                            }
                        }
                        final String s2 = a2.f();
                        final String s3 = a2.d();
                        continue;
                    }
                }
                continue;
            }
        }
    }
}
