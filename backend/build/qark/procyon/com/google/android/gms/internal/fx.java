// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.g;
import android.os.RemoteException;
import android.util.Log;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.d;
import com.google.android.gms.common.c;
import java.util.ArrayList;
import android.os.IInterface;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.b;

public abstract class fx implements b, gj
{
    public static final String[] d;
    final Handler a;
    boolean b;
    boolean c;
    private final Context e;
    private IInterface f;
    private final ArrayList g;
    private ge h;
    private final String[] i;
    private final gh j;
    private final Object k;
    
    static {
        d = new String[] { "service_esmobile", "service_googleme" };
    }
    
    protected fx(final Context context, final c c, final d d, final String... i) {
        this.g = new ArrayList();
        this.b = false;
        this.c = false;
        this.k = new Object();
        this.e = (Context)hc.a(context);
        this.j = new gh(context, this, null);
        this.a = new fy(this, context.getMainLooper());
        this.a(i);
        this.i = i;
        this.a((c)hc.a(c));
        this.a((d)hc.a(d));
    }
    
    protected abstract String a();
    
    protected void a(final int n, final IBinder binder, final Bundle bundle) {
        this.a.sendMessage(this.a.obtainMessage(1, (Object)new gf(this, n, binder, bundle)));
    }
    
    public void a(final c c) {
        this.j.a(c);
    }
    
    public void a(final d d) {
        this.j.a(d);
    }
    
    protected abstract void a(final gr p0, final gc p1);
    
    protected void a(final String... array) {
    }
    
    protected abstract IInterface b(final IBinder p0);
    
    protected abstract String b();
    
    protected final void c(final IBinder binder) {
        try {
            this.a(gt.a(binder), new gc(this));
        }
        catch (RemoteException ex) {
            Log.w("GmsClient", "service died");
        }
    }
    
    public void d() {
        while (true) {
            this.b = true;
            synchronized (this.k) {
                this.c = true;
                // monitorexit(this.k)
                final int a = com.google.android.gms.common.g.a(this.e);
                if (a != 0) {
                    this.a.sendMessage(this.a.obtainMessage(3, (Object)a));
                    return;
                }
            }
            if (this.h != null) {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                this.f = null;
                gk.a(this.e).b(this.a(), this.h);
            }
            this.h = new ge(this);
            if (!gk.a(this.e).a(this.a(), this.h)) {
                break;
            }
            return;
        }
        Log.e("GmsClient", "unable to connect to service: " + this.a());
        this.a.sendMessage(this.a.obtainMessage(3, (Object)9));
    }
    
    @Override
    public boolean e() {
        return this.f != null;
    }
    
    public boolean f() {
        synchronized (this.k) {
            return this.c;
        }
    }
    
    public void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: putfield        com/google/android/gms/internal/fx.b:Z
        //     5: aload_0        
        //     6: getfield        com/google/android/gms/internal/fx.k:Ljava/lang/Object;
        //     9: astore_3       
        //    10: aload_3        
        //    11: monitorenter   
        //    12: aload_0        
        //    13: iconst_0       
        //    14: putfield        com/google/android/gms/internal/fx.c:Z
        //    17: aload_3        
        //    18: monitorexit    
        //    19: aload_0        
        //    20: getfield        com/google/android/gms/internal/fx.g:Ljava/util/ArrayList;
        //    23: astore_3       
        //    24: aload_3        
        //    25: monitorenter   
        //    26: aload_0        
        //    27: getfield        com/google/android/gms/internal/fx.g:Ljava/util/ArrayList;
        //    30: invokevirtual   java/util/ArrayList.size:()I
        //    33: istore_2       
        //    34: iconst_0       
        //    35: istore_1       
        //    36: iload_1        
        //    37: iload_2        
        //    38: if_icmpge       69
        //    41: aload_0        
        //    42: getfield        com/google/android/gms/internal/fx.g:Ljava/util/ArrayList;
        //    45: iload_1        
        //    46: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    49: checkcast       Lcom/google/android/gms/internal/ga;
        //    52: invokevirtual   com/google/android/gms/internal/ga.d:()V
        //    55: iload_1        
        //    56: iconst_1       
        //    57: iadd           
        //    58: istore_1       
        //    59: goto            36
        //    62: astore          4
        //    64: aload_3        
        //    65: monitorexit    
        //    66: aload           4
        //    68: athrow         
        //    69: aload_0        
        //    70: getfield        com/google/android/gms/internal/fx.g:Ljava/util/ArrayList;
        //    73: invokevirtual   java/util/ArrayList.clear:()V
        //    76: aload_3        
        //    77: monitorexit    
        //    78: aload_0        
        //    79: aconst_null    
        //    80: putfield        com/google/android/gms/internal/fx.f:Landroid/os/IInterface;
        //    83: aload_0        
        //    84: getfield        com/google/android/gms/internal/fx.h:Lcom/google/android/gms/internal/ge;
        //    87: ifnull          113
        //    90: aload_0        
        //    91: getfield        com/google/android/gms/internal/fx.e:Landroid/content/Context;
        //    94: invokestatic    com/google/android/gms/internal/gk.a:(Landroid/content/Context;)Lcom/google/android/gms/internal/gk;
        //    97: aload_0        
        //    98: invokevirtual   com/google/android/gms/internal/fx.a:()Ljava/lang/String;
        //   101: aload_0        
        //   102: getfield        com/google/android/gms/internal/fx.h:Lcom/google/android/gms/internal/ge;
        //   105: invokevirtual   com/google/android/gms/internal/gk.b:(Ljava/lang/String;Lcom/google/android/gms/internal/ge;)V
        //   108: aload_0        
        //   109: aconst_null    
        //   110: putfield        com/google/android/gms/internal/fx.h:Lcom/google/android/gms/internal/ge;
        //   113: return         
        //   114: astore          4
        //   116: aload_3        
        //   117: monitorexit    
        //   118: aload           4
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     19     62     69     Any
        //  26     34     114    121    Any
        //  41     55     114    121    Any
        //  64     66     62     69     Any
        //  69     78     114    121    Any
        //  116    118    114    121    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    public final Context h() {
        return this.e;
    }
    
    protected final void i() {
        if (!this.e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
    
    @Override
    public Bundle j() {
        return null;
    }
    
    protected final IInterface k() {
        this.i();
        return this.f;
    }
    
    @Override
    public boolean l() {
        return this.b;
    }
}
