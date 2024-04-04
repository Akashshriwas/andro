// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

class ah implements Runnable
{
    final /* synthetic */ ag a;
    
    ah(final ag a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a.runOnUiThread((Runnable)new ai(this));
    }
}
