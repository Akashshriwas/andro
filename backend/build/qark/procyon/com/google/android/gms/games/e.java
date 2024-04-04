// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games;

import android.os.Parcel;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;

public final class e extends com.google.android.gms.common.data.e implements Player
{
    public e(final DataHolder dataHolder, final int n) {
        super(dataHolder, n);
    }
    
    @Override
    public String b() {
        return this.d("external_player_id");
    }
    
    @Override
    public String c() {
        return this.d("profile_name");
    }
    
    @Override
    public Uri d() {
        return this.f("profile_icon_image_uri");
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public Uri e() {
        return this.f("profile_hi_res_image_uri");
    }
    
    @Override
    public boolean equals(final Object o) {
        return PlayerEntity.a(this, o);
    }
    
    @Override
    public long f() {
        return this.a("last_updated");
    }
    
    public Player g() {
        return new PlayerEntity(this);
    }
    
    @Override
    public int hashCode() {
        return PlayerEntity.a(this);
    }
    
    @Override
    public String toString() {
        return PlayerEntity.b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ((PlayerEntity)this.g()).writeToParcel(parcel, n);
    }
}
