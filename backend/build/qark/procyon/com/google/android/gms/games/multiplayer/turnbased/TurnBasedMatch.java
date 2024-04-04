// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.f;
import com.google.android.gms.common.data.d;
import android.os.Parcelable;

public interface TurnBasedMatch extends Parcelable, d, f
{
    public static final int[] a_ = { 0, 1, 2, 3 };
    
    Game b();
    
    String c();
    
    String d();
    
    long e();
    
    int f();
    
    int g();
    
    int h();
    
    String j();
    
    long k();
    
    String l();
    
    byte[] m();
    
    int n();
    
    String o();
    
    byte[] p();
    
    int q();
    
    Bundle r();
    
    int s();
    
    boolean t();
}
