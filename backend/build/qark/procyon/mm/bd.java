// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

class bd extends AsyncTask
{
    final /* synthetic */ sp a;
    
    bd(final sp a) {
        this.a = a;
    }
    
    protected Boolean a(final Boolean... array) {
        return this.a.b();
    }
    
    protected void a(final Boolean b) {
        final Intent intent = new Intent((Context)this.a.getApplication(), (Class)m.class);
        intent.setFlags(67108864);
        this.a.startActivity(intent);
        this.a.finish();
    }
    
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
