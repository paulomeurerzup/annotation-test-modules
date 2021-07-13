package br.com.zup.beagle.sample.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\rH\u0002J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tJ-\u0010\u001b\u001a\u00020\r2%\u0010\u0007\u001a!\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R1\u0010\u0007\u001a%\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/beagle/sample/components/CustomPageIndicatorView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lbr/com/zup/beagle/sample/databinding/CustomPageIndicatorBinding;", "onIndexChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "Lbr/com/zup/beagle/sample/components/OnIndexChanged;", "pagesCount", "selectedColor", "selectedItem", "unselectedColor", "bind", "setBackButtonVisibility", "visibility", "setContinueButtonVisibility", "setCount", "pages", "setCurrentIndex", "newIndex", "setIndexChangedListener", "sample_debug"})
public final class CustomPageIndicatorView extends android.widget.RelativeLayout {
    private final int selectedColor = android.graphics.Color.WHITE;
    private final int unselectedColor = android.graphics.Color.GRAY;
    private int selectedItem = 0;
    private int pagesCount = 0;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onIndexChanged;
    private final br.com.zup.beagle.sample.databinding.CustomPageIndicatorBinding binding = null;
    
    public CustomPageIndicatorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final void bind() {
    }
    
    public final void setCount(int pages) {
    }
    
    public final void setCurrentIndex(int newIndex) {
    }
    
    public final void setIndexChangedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onIndexChanged) {
    }
    
    public final void setContinueButtonVisibility(int visibility) {
    }
    
    public final void setBackButtonVisibility(int visibility) {
    }
}