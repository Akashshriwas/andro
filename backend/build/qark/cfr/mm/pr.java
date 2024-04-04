/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.util.ArrayList
 */
package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.d.a;
import com.a.f.e;
import com.a.h.g;
import dn.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import mm.af;
import mm.ag;
import mm.aj;
import mm.ak;
import mm.al;
import mm.am;
import mm.an;
import mm.ao;

public class pr
extends com.a.f.a {
    private MediaPlayer.OnPreparedListener A;
    private MediaPlayer.OnCompletionListener B;
    private View.OnClickListener C;
    int p;
    String q;
    LinearLayout r;
    TextView s;
    MediaPlayer t;
    boolean u;
    BroadcastReceiver v;
    BroadcastReceiver w;
    int x;
    private com.google.android.gms.ads.f y;
    private MediaPlayer.OnErrorListener z;

    public pr() {
        this.z = new af(this);
        this.A = new ag(this);
        this.B = new aj(this);
        this.v = new ak(this);
        this.w = new al(this);
        this.C = new am(this);
        this.x = 0;
    }

    static /* synthetic */ e a(pr pr2) {
        return pr2.m;
    }

    private String a(byte[] object) {
        try {
            this.a((Context)this);
            File file = File.createTempFile((String)"test", (String)"mp3", (File)this.getCacheDir());
            file.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write((byte[])object);
            fileOutputStream.close();
            object = file.getPath();
            return object;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private void a(String string) {
        this.t.reset();
        this.t.setAudioStreamType(3);
        try {
            this.t.setDataSource(string);
            this.t.setLooping(false);
            this.t.prepareAsync();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return;
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
            return;
        }
        catch (IllegalStateException illegalStateException) {
            illegalStateException.printStackTrace();
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            Log.w((String)"loadDataStream", (String)iOException.toString());
            return;
        }
    }

    static /* synthetic */ void b(pr pr2) {
        pr2.m();
    }

    static /* synthetic */ com.google.android.gms.ads.f c(pr pr2) {
        return pr2.y;
    }

    private void m() {
        if (this.t != null && !this.t.isPlaying()) {
            this.u = true;
            this.t.start();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Context context) {
        try {
            context = context.getCacheDir();
            if (context == null) return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        if (!context.isDirectory()) return;
        this.a((File)context);
    }

    @Override
    protected void a(AdapterView adapterView, View view, int n2) {
        try {
            if (this.m != null) {
                ((ao)this.m).a(n2);
                ((ao)this.m).notifyDataSetChanged();
            }
            this.a((g)this.m.getItem(n2));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(g object) {
        if (this.t != null) {
            this.t.reset();
            byte[] arrby = new a().b(object.b());
            Object var2_3 = null;
            if (arrby != null) {
                object = this.a(arrby);
            } else if (dn.a.b(object.e()).booleanValue()) {
                object = dn.a.a(object.e());
            } else if (dn.a.a()) {
                object = dn.a.c(object.e());
            } else {
                dn.a.a((Context)this, this.getString(2131230751));
                object = var2_3;
            }
            if (object != null) {
                this.a((String)object);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(File file) {
        boolean bl2 = false;
        if (file == null) return file.delete();
        if (!file.isDirectory()) return file.delete();
        String[] arrstring = file.list();
        int n2 = 0;
        while (n2 < arrstring.length) {
            boolean bl3 = bl2;
            if (!this.a(new File(file, arrstring[n2]))) return bl3;
            ++n2;
        }
        return file.delete();
    }

    @Override
    public void f() {
        this.p = this.getIntent().getExtras().getInt(f.c);
        this.q = this.getIntent().getExtras().getString(f.b);
        this.s = (TextView)this.findViewById(2131165211);
        this.s.setText((CharSequence)(String.valueOf((int)this.p) + ". " + this.q));
        this.r = (LinearLayout)this.findViewById(2131165208);
        this.r.setOnClickListener(this.C);
        this.t = new MediaPlayer();
        this.t.setOnCompletionListener(this.B);
        this.t.setOnPreparedListener(this.A);
        this.t.setOnErrorListener(this.z);
        this.l();
    }

    @Override
    public int g() {
        return 2130903047;
    }

    @Override
    public e h() {
        return new ao(this, (Context)this);
    }

    @Override
    public ArrayList i() {
        return new a().c(this.getIntent().getExtras().getInt(f.c));
    }

    @Override
    public Class j() {
        return null;
    }

    void l() {
        try {
            this.y = new com.google.android.gms.ads.f((Context)this);
            this.y.setAdUnitId(f.j);
            this.y.setAdSize(com.google.android.gms.ads.e.f);
            RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131165212);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout.addView((View)this.y, (ViewGroup.LayoutParams)layoutParams);
            this.y.setAdListener(new an(this, relativeLayout));
            this.registerReceiver(this.w, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.registerReceiver(this.v, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.overridePendingTransition(2130968579, 2130968580);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    protected void onDestroy() {
        if (this.t != null) {
            this.t.release();
            this.t = null;
        }
        if (this.w != null && this.y != null) {
            this.unregisterReceiver(this.w);
        }
        if (this.v != null && this.y != null) {
            this.unregisterReceiver(this.v);
        }
        super.onDestroy();
    }
}

