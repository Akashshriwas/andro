// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

class b implements Runnable
{
    final /* synthetic */ a a;
    
    b(final a a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.Q != null && this.a.Q.size() > 0) {
            this.a.O.a(this.a.Q);
            this.a.O.notifyDataSetChanged();
            this.a.P.smoothScrollToPosition(0);
            return;
        }
        this.a.O.b().clear();
        this.a.O.notifyDataSetChanged();
    }
}
