package com.upgovt.ashadiary.utils.voice;

/**
 * VoiceInputHelper - Hindi voice input using SpeechRecognizer
 * No-keyboard policy - all text input via voice
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/upgovt/ashadiary/utils/voice/VoiceInputHelper;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "callback", "Lcom/upgovt/ashadiary/utils/voice/VoiceInputCallback;", "(Landroidx/fragment/app/Fragment;Lcom/upgovt/ashadiary/utils/voice/VoiceInputCallback;)V", "isListening", "", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "getErrorMessage", "", "error", "", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "startListening", "stopListening", "Companion", "app_debug"})
public final class VoiceInputHelper implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.utils.voice.VoiceInputCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "VoiceInputHelper";
    @org.jetbrains.annotations.Nullable()
    private android.speech.SpeechRecognizer speechRecognizer;
    private boolean isListening = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.utils.voice.VoiceInputHelper.Companion Companion = null;
    
    public VoiceInputHelper(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.utils.voice.VoiceInputCallback callback) {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    /**
     * Start listening for voice input
     */
    public final void startListening() {
    }
    
    /**
     * Stop listening
     */
    public final void stopListening() {
    }
    
    @java.lang.Override()
    public void onDestroy(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    /**
     * Get error message in Hindi
     */
    private final java.lang.String getErrorMessage(int error) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/upgovt/ashadiary/utils/voice/VoiceInputHelper$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}