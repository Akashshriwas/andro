.class Lde/ecspride/Button2$2;
.super Ljava/lang/Object;
.source "Button2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/ecspride/Button2;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lde/ecspride/Button2;


# direct methods
.method constructor <init>(Lde/ecspride/Button2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lde/ecspride/Button2$2;->this$0:Lde/ecspride/Button2;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 47
    iget-object v0, p0, Lde/ecspride/Button2$2;->this$0:Lde/ecspride/Button2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lde/ecspride/Button2;->access$1(Lde/ecspride/Button2;Ljava/lang/String;)V

    .line 48
    const-string v0, "TAG"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Button 2: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lde/ecspride/Button2$2;->this$0:Lde/ecspride/Button2;

    invoke-static {v2}, Lde/ecspride/Button2;->access$0(Lde/ecspride/Button2;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    return-void
.end method
