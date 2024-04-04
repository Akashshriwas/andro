// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.telephony.PhoneStateListener;
import android.content.IntentFilter;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.k;
import android.content.Intent;
import android.util.Log;
import com.a.d.a;
import android.support.v4.app.s;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;
import dn.b;
import android.support.v4.app.Fragment;
import com.a.h.e;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.View$OnClickListener;
import com.google.android.gms.ads.f;
import android.content.BroadcastReceiver;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.media.MediaPlayer;

public class m extends d
{
    boolean A;
    boolean B;
    public MediaPlayer C;
    ProgressBar D;
    ImageButton E;
    Thread F;
    BroadcastReceiver G;
    BroadcastReceiver H;
    int I;
    private f J;
    private View$OnClickListener K;
    private MediaPlayer$OnErrorListener L;
    private MediaPlayer$OnPreparedListener M;
    private MediaPlayer$OnCompletionListener N;
    private TelephonyManager O;
    private ae P;
    Handler q;
    LinearLayout r;
    LinearLayout s;
    LinearLayout t;
    ImageView u;
    TextView v;
    Button w;
    Button x;
    Button y;
    e z;
    
    public m() {
        this.K = (View$OnClickListener)new u(this);
        this.L = (MediaPlayer$OnErrorListener)new v(this);
        this.M = (MediaPlayer$OnPreparedListener)new w(this);
        this.N = (MediaPlayer$OnCompletionListener)new z(this);
        this.G = new aa(this);
        this.H = new ab(this);
        this.I = 0;
    }
    
    private void A() {
        if (this.C != null) {
            final Fragment a = this.e().a(2131165217);
            if (a instanceof j) {
                ((j)a).b(this.C.getCurrentPosition());
            }
            if (this.C.isPlaying()) {
                this.q.postDelayed((Runnable)new ac(this), 500L);
            }
        }
    }
    
    private void B() {
        SharedPreferences sharedPreferences;
        SharedPreferences$Editor edit;
        try {
            sharedPreferences = this.getSharedPreferences("apprater", 0);
            edit = sharedPreferences.edit();
            final boolean boolean1 = this.getResources().getBoolean(2131492864);
            if (!boolean1) {
                if (sharedPreferences.getBoolean("dontshow", false)) {
                    return;
                }
                if (sharedPreferences.getBoolean("rateclicked", false)) {
                    return;
                }
            }
            if (boolean1) {
                dn.b.a((Context)this, edit);
                return;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        final long long1 = sharedPreferences.getLong("launch_count", 0L);
        final long long2 = sharedPreferences.getLong("event_count", 0L);
        final long long3 = sharedPreferences.getLong("date_firstlaunch", 0L);
        final long long4 = sharedPreferences.getLong("date_reminder_pressed", 0L);
        long n = long2;
        long currentTimeMillis = long1;
        while (true) {
            try {
                final int versionCode = this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionCode;
                long n2 = long2;
                long n3 = long1;
                n = long2;
                currentTimeMillis = long1;
                if (sharedPreferences.getInt("versioncode", 0) != versionCode) {
                    n3 = 0L;
                    n2 = (n = 0L);
                    currentTimeMillis = n3;
                    edit.putLong("event_count", 0L);
                }
                n = n2;
                currentTimeMillis = n3;
                edit.putInt("versioncode", versionCode);
                n = n2;
                final long n4 = 1L + n3;
                edit.putLong("launch_count", n4);
                if (long3 == 0L) {
                    currentTimeMillis = System.currentTimeMillis();
                    edit.putLong("date_firstlaunch", currentTimeMillis);
                }
                else {
                    currentTimeMillis = long3;
                }
                if (n4 >= this.getResources().getInteger(2131296259) && (System.currentTimeMillis() >= currentTimeMillis + this.getResources().getInteger(2131296258) * 24 * 60 * 60 * 1000L || n >= this.getResources().getInteger(2131296260))) {
                    if (long4 == 0L) {
                        dn.b.a((Context)this, edit);
                    }
                    else {
                        n = this.getResources().getInteger(2131296261) * 24 * 60 * 60;
                        if (System.currentTimeMillis() >= n * 1000L + long4) {
                            dn.b.a((Context)this, edit);
                        }
                    }
                }
                edit.commit();
            }
            catch (Exception ex2) {
                final long n3 = currentTimeMillis;
                continue;
            }
            break;
        }
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
    
    private void b(final Fragment fragment) {
        final s a = this.e().a();
        a.b(2131165217, fragment);
        a.a();
    }
    
    private void b(final Boolean b) {
        this.q.removeCallbacksAndMessages((Object)null);
        final Fragment a = this.e().a(2131165217);
        final e a2 = new a().a(this.o(), b);
        if (a != null && a2 != null) {
            this.a(a2);
            this.c(a2);
            if (!(a instanceof q) && a instanceof j) {
                this.a(String.valueOf(a2.d()) + ". " + a2.b());
                ((j)a).a(a2);
                ((j)a).v();
            }
            this.b(this.o());
        }
    }
    
    private void c(final String dataSource) {
        this.C.reset();
        this.C.setAudioStreamType(3);
        try {
            this.C.setDataSource(dataSource);
            this.C.setLooping(false);
            this.C.prepareAsync();
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
    
    private void t() {
        final Fragment a = this.e().a(2131165217);
        if (a != null) {
            if (a instanceof j) {
                if (this.C.isPlaying()) {
                    this.C.pause();
                    this.w.setBackgroundResource(2130837586);
                }
                final Intent intent = new Intent((Context)this, (Class)rc.class);
                intent.putExtra(dn.f.c, this.o().d());
                intent.putExtra(dn.f.b, this.o().b());
                this.startActivity(intent);
                this.overridePendingTransition(2130968576, 2130968577);
            }
            else if (a instanceof q) {
                new com.a.b.d((Context)this).a();
            }
        }
    }
    
    private void u() {
        boolean b = false;
        final boolean a = dn.f.a().a("RepeatPlayAll", false);
        if (a) {
            this.E.setBackgroundResource(2130837585);
        }
        else {
            this.E.setBackgroundResource(2130837600);
        }
        if (!a) {
            b = true;
        }
        dn.f.a().b("RepeatPlayAll", b);
    }
    
    private void v() {
        final boolean a = dn.f.a().a("RepeatPlayAll", false);
        this.B = a;
        if (a) {
            this.E.setBackgroundResource(2130837600);
            return;
        }
        this.E.setBackgroundResource(2130837585);
    }
    
    private void w() {
        if (this.C != null && !this.C.isPlaying()) {
            this.A = true;
            this.C.start();
        }
    }
    
    private void x() {
        this.B = true;
        this.b(Boolean.valueOf(true));
    }
    
    private void y() {
        this.B = true;
        this.b(Boolean.valueOf(false));
    }
    
    private void z() {
        if (this.o() != null) {
            this.c(true);
            if (this.e().a(2131165217) instanceof q) {
                final j j = new j();
                this.l();
                this.a(String.valueOf(this.o().d()) + ". " + this.o().b());
                j.a(this.o());
                this.a(j, true);
            }
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
    
    public void a(final Fragment fragment, final Boolean b) {
        final k e = this.e();
        final s a = e.a();
        a.a(2130968576, 2130968577, 2130968579, 2130968580);
        a.a(e.a(2131165217));
        a.a(2131165217, fragment);
        a.a((String)null);
        a.a();
    }
    
    @Override
    public void a(final com.a.a.a a, final View view) {
        super.a(a, view);
        if (a != null && a.c() <= 3) {
            this.k();
            this.c(false);
            final k e = this.e();
            final Fragment a2 = e.a(2131165217);
            if (a2 != null && a2 instanceof j) {
                e.c();
            }
            if (this.C != null) {
                this.C.reset();
                this.w.setBackgroundResource(2130837586);
            }
            this.a(Boolean.valueOf(false));
            final Fragment a3 = e.a(2131165217);
            if (a3 instanceof q) {
                ((q)a3).v();
            }
        }
    }
    
    public void a(final e z) {
        this.z = z;
    }
    
    public void a(final Boolean b) {
        if (!b) {
            this.r.setVisibility(8);
            return;
        }
        this.r.setVisibility(0);
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
    
    public void b(final e e) {
        if (e != null && this.C != null) {
            if (this.C.isPlaying()) {
                this.C.reset();
                this.A = false;
                this.p();
            }
            else {
                this.C.reset();
                this.A = false;
                if (this.B) {
                    this.p();
                }
            }
        }
    }
    
    public void b(final String s) {
        if (this.C != null && this.C.isPlaying()) {
            final String[] split = s.split(":");
            this.C.seekTo(Integer.parseInt(split[1].substring(3, 5)) + Integer.parseInt(split[1].substring(0, 2)) * 1000);
        }
    }
    
    public void b(final boolean b) {
        this.B = b;
    }
    
    public void c(final e e) {
        if (e != null && this.v != null) {
            this.v.setText((CharSequence)(String.valueOf(e.d()) + ". " + e.b()));
        }
    }
    
    public void c(final boolean b) {
        if (b) {
            this.u.setImageResource(2130837560);
            return;
        }
        this.u.setImageResource(2130837552);
    }
    
    @Override
    public void i() {
        this.q = new Handler();
        this.r = (LinearLayout)this.findViewById(2131165218);
        this.t = (LinearLayout)this.findViewById(2131165215);
        this.u = (ImageView)this.findViewById(2131165216);
        this.s = (LinearLayout)this.findViewById(2131165219);
        this.v = (TextView)this.findViewById(2131165220);
        this.x = (Button)this.findViewById(2131165224);
        this.w = (Button)this.findViewById(2131165223);
        this.y = (Button)this.findViewById(2131165222);
        this.E = (ImageButton)this.findViewById(2131165225);
        this.x.setOnClickListener(this.K);
        this.w.setOnClickListener(this.K);
        this.y.setOnClickListener(this.K);
        this.E.setOnClickListener(this.K);
        this.s.setOnClickListener(this.K);
        this.t.setOnClickListener(this.K);
        this.D = (ProgressBar)this.findViewById(2131165221);
        this.a(Boolean.valueOf(false));
        this.A = false;
        (this.C = new MediaPlayer()).setOnCompletionListener(this.N);
        this.C.setOnPreparedListener(this.M);
        this.C.setOnErrorListener(this.L);
        this.v();
        this.c(false);
        this.r();
        this.q();
    }
    
    @Override
    public int j() {
        return 2130903049;
    }
    
    @Override
    public void n() {
        final k e = this.e();
        final Fragment a = e.a(2131165217);
        if (a != null && a instanceof j) {
            e.b();
            this.k();
            this.c(false);
            this.a(this.p.a(dn.f.b));
            return;
        }
        super.n();
    }
    
    public e o() {
        return this.z;
    }
    
    @Override
    public void onBackPressed() {
        final Fragment a = this.e().a(2131165217);
        if (a != null && a instanceof j) {
            this.k();
            this.m();
            this.c(false);
            super.onBackPressed();
            return;
        }
        dn.a.a((Context)this);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(null);
        this.b(new q());
        com.a.h.b.a((Context)this);
    }
    
    @Override
    protected void onDestroy() {
        if (this.C != null) {
            this.C.release();
            this.C = null;
        }
        if (this.H != null && this.J != null) {
            this.unregisterReceiver(this.H);
        }
        if (this.G != null && this.J != null) {
            this.unregisterReceiver(this.G);
        }
        this.s();
        super.onDestroy();
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        bundle.getInt("maxItem");
        super.onRestoreInstanceState(bundle);
    }
    
    @Override
    protected void onResume() {
        try {
            super.onResume();
            if (dn.a.a()) {
                this.B();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void p() {
        if (this.C.isPlaying()) {
            this.C.pause();
            this.w.setBackgroundResource(2130837586);
        }
        else {
            this.w.setBackgroundResource(2130837581);
            if (this.A) {
                this.w();
                this.A();
                return;
            }
            final byte[] a = new a().a(this.o().a());
            String s = null;
            if (a != null) {
                s = this.a(a);
            }
            else if (dn.a.b(this.o().a())) {
                s = dn.a.a(this.o().a());
            }
            else if (dn.a.a()) {
                this.D.setVisibility(0);
                s = dn.a.e(this.o().a());
            }
            else {
                this.w.setBackgroundResource(2130837586);
                dn.a.a((Context)this, this.getString(2131230751));
            }
            if (s != null) {
                this.c(s);
            }
        }
    }
    
    void q() {
        try {
            (this.J = new f((Context)this)).setAdUnitId(dn.f.i);
            this.J.setAdSize(com.google.android.gms.ads.e.f);
            final RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131165212);
            relativeLayout.addView((View)this.J, (ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -2));
            this.J.setAdListener(new ad(this, relativeLayout));
            this.registerReceiver(this.H, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.registerReceiver(this.G, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void r() {
        this.P = new ae(this, null);
        (this.O = (TelephonyManager)this.getSystemService("phone")).listen((PhoneStateListener)this.P, 32);
    }
    
    public void s() {
        if (this.O != null) {
            this.O.listen((PhoneStateListener)this.P, 0);
        }
    }
}
