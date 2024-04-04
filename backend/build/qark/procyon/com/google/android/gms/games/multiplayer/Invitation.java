// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Game;
import com.google.android.gms.common.data.d;
import android.os.Parcelable;

public interface Invitation extends Parcelable, d, f
{
    Game b();
    
    String c();
    
    Participant d();
    
    long e();
    
    int f();
    
    int g();
}
