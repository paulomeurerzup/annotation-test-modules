package br.com.zup.beagle.sample.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006!"}, d2 = {"Lbr/com/zup/beagle/sample/widgets/CustomPageIndicator;", "Lbr/com/zup/beagle/android/components/page/PageIndicatorComponent;", "showContinue", "", "showSkip", "(ZZ)V", "customPageIndicatorView", "Lbr/com/zup/beagle/sample/components/CustomPageIndicatorView;", "output", "Lbr/com/zup/beagle/android/components/page/PageIndicatorOutput;", "getShowContinue", "()Z", "getShowSkip", "buildView", "rootView", "Lbr/com/zup/beagle/android/widget/RootView;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "initPageView", "", "pageIndicatorOutput", "onItemUpdated", "newIndex", "setCount", "pages", "toString", "", "sample_debug"})
@br.com.zup.beagle.annotation.RegisterWidget(name = "customPageIndicator")
public final class CustomPageIndicator implements br.com.zup.beagle.android.components.page.PageIndicatorComponent {
    private final boolean showContinue = false;
    private final boolean showSkip = false;
    @kotlin.jvm.Transient()
    private transient br.com.zup.beagle.sample.components.CustomPageIndicatorView customPageIndicatorView;
    @kotlin.jvm.Transient()
    private transient br.com.zup.beagle.android.components.page.PageIndicatorOutput output;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.beagle.sample.widgets.CustomPageIndicator copy(boolean showContinue, boolean showSkip) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CustomPageIndicator(boolean showContinue, boolean showSkip) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getShowContinue() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getShowSkip() {
        return false;
    }
    
    @java.lang.Override()
    public void initPageView(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.components.page.PageIndicatorOutput pageIndicatorOutput) {
    }
    
    @java.lang.Override()
    public void onItemUpdated(int newIndex) {
    }
    
    @java.lang.Override()
    public void setCount(int pages) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.sample.components.CustomPageIndicatorView buildView(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.widget.RootView rootView) {
        return null;
    }
}