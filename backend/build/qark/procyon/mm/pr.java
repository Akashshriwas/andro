// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.os.Bundle;
import android.content.IntentFilter;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import com.a.h.g;
import android.view.View;
import android.widget.AdapterView;
import android.util.Log;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import android.content.Context;
import com.a.f.e;
import android.media.MediaPlayer$OnErrorListener;
import com.google.android.gms.ads.f;
import android.content.BroadcastReceiver;
import android.media.MediaPlayer;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import com.a.f.a;

public class pr extends a
{
    private MediaPlayer$OnPreparedListener A;
    private MediaPlayer$OnCompletionListener B;
    private View$OnClickListener C;
    int p;
    String q;
    LinearLayout r;
    TextView s;
    MediaPlayer t;
    boolean u;
    BroadcastReceiver v;
    BroadcastReceiver w;
    int x;
    private f y;
    private MediaPlayer$OnErrorListener z;
    
    public pr() {
        this.z = (MediaPlayer$OnErrorListener)new af(this);
        this.A = (MediaPlayer$OnPreparedListener)new ag(this);
        this.B = (MediaPlayer$OnCompletionListener)new aj(this);
        this.v = new ak(this);
        this.w = new al(this);
        this.C = (View$OnClickListener)new am(this);
        this.x = 0;
    }
    
    private String a(final byte[] b) {
        try {
            this.a((Context)this);
            final File tempFile = File.createTempFile("test", "mp3", this.getCacheDir());
            tempFile.deleteOnExit();
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            fileOutputStream.write(b);
            fileOutputStream.close();
            return tempFile.getPath();
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private void a(final String dataSource) {
        this.t.reset();
        this.t.setAudioStreamType(3);
        try {
            this.t.setDataSource(dataSource);
            this.t.setLooping(false);
            this.t.prepareAsync();
        }
        catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        catch (SecurityException ex2) {
            ex2.printStackTrace();
        }
        catch (IllegalStateException ex3) {
            ex3.printStackTrace();
        }
        catch (IOException ex4) {
            ex4.printStackTrace();
            Log.w("loadDataStream", ex4.toString());
        }
    }
    
    private void m() {
        if (this.t != null && !this.t.isPlaying()) {
            this.u = true;
            this.t.start();
        }
    }
    
    public void a(final Context context) {
        try {
            final File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.isDirectory()) {
                this.a(cacheDir);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void a(final AdapterView adapterView, final View view, final int n) {
        try {
            if (this.m != null) {
                ((ao)this.m).a(n);
                ((ao)this.m).notifyDataSetChanged();
            }
            this.a((com.a.h.g)this.m.getItem(n));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void a(final com.a.h.g g) {
        if (this.t != null) {
            this.t.reset();
            final byte[] b = new com.a.d.a().b(g.b());
            final String s = null;
            String s2;
            if (b != null) {
                s2 = this.a(b);
            }
            else if (dn.a.b(g.e())) {
                s2 = dn.a.a(g.e());
            }
            else if (dn.a.a()) {
                s2 = dn.a.c(g.e());
            }
            else {
                dn.a.a((Context)this, this.getString(2131230751));
                s2 = s;
            }
            if (s2 != null) {
                this.a(s2);
            }
        }
    }
    
    public boolean a(final File parent) {
        final boolean b = false;
        if (parent != null && parent.isDirectory()) {
            final String[] list = parent.list();
            for (int i = 0; i < list.length; ++i) {
                final boolean delete = b;
                if (!this.a(new File(parent, list[i]))) {
                    return delete;
                }
            }
        }
        return parent.delete();
    }
    
    @Override
    public void f() {
        this.p = this.getIntent().getExtras().getInt(dn.f.c);
        this.q = this.getIntent().getExtras().getString(dn.f.b);
        (this.s = (TextView)this.findViewById(2131165211)).setText((CharSequence)(String.valueOf(this.p) + ". " + this.q));
        (this.r = (LinearLayout)this.findViewById(2131165208)).setOnClickListener(this.C);
        (this.t = new MediaPlayer()).setOnCompletionListener(this.B);
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
        return new com.a.d.a().c(this.getIntent().getExtras().getInt(dn.f.c));
    }
    
    @Override
    public Class j() {
        return null;
    }
    
    void l() {
        try {
            (this.y = new f((Context)this)).setAdUnitId(dn.f.j);
            this.y.setAdSize(com.google.android.gms.ads.e.f);
            final RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131165212);
            relativeLayout.addView((View)this.y, (ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -2));
            this.y.setAdListener(new an(this, relativeLayout));
            this.registerReceiver(this.w, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.registerReceiver(this.v, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.overridePendingTransition(2130968579, 2130968580);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
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
