.class public Lde/ecspride/Button2;
.super Landroid/app/Activity;
.source "Button2.java"


# instance fields
.field private imei:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lde/ecspride/Button2;->imei:Ljava/lang/String;

    .line 20
    return-void
.end method

.method static synthetic access$0(Lde/ecspride/Button2;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lde/ecspride/Button2;->imei:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1(Lde/ecspride/Button2;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lde/ecspride/Button2;->imei:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public clickOnButton3(Landroid/view/View;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 54
    const-string v1, "phone"

    invoke-virtual {p0, v1}, Lde/ecspride/Button2;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 55
    .local v0, "telephonyManager":Landroid/telephony/TelephonyManager;
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lde/ecspride/Button2;->imei:Ljava/lang/String;

    .line 56
    const-string v1, "TAG"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Button3: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lde/ecspride/Button2;->imei:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 25
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const/high16 v2, 0x7f030000

    invoke-virtual {p0, v2}, Lde/ecspride/Button2;->setContentView(I)V

    .line 28
    const/high16 v2, 0x7f070000

    invoke-virtual {p0, v2}, Lde/ecspride/Button2;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 29
    .local v0, "button1":Landroid/widget/Button;
    new-instance v2, Lde/ecspride/Button2$1;

    invoke-direct {v2, p0}, Lde/ecspride/Button2$1;-><init>(Lde/ecspride/Button2;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    const v2, 0x7f070001

    invoke-virtual {p0, v2}, Lde/ecspride/Button2;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 44
    .local v1, "button2":Landroid/widget/Button;
    new-instance v2, Lde/ecspride/Button2$2;

    invoke-direct {v2, p0}, Lde/ecspride/Button2$2;-><init>(Lde/ecspride/Button2;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    return-void
.end method
