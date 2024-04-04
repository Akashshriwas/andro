// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Process;

final class ej implements Runnable
{
    final /* synthetic */ Runnable a;
    
    ej(final Runnable a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
