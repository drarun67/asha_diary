package com.upgovt.ashadiary.utils.voice;

/**
 * Voice input callback interface
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/upgovt/ashadiary/utils/voice/VoiceInputCallback;", "", "onBeginningOfSpeech", "", "onEndOfSpeech", "onError", "error", "", "onPartialResult", "text", "onReadyForSpeech", "onResult", "app_release"})
public abstract interface VoiceInputCallback {
    
    public abstract void onReadyForSpeech();
    
    public abstract void onBeginningOfSpeech();
    
    public abstract void onEndOfSpeech();
    
    public abstract void onResult(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    public abstract void onPartialResult(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String error);
    
    /**
     * Voice input callback interface
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onReadyForSpeech(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.utils.voice.VoiceInputCallback $this) {
        }
        
        public static void onBeginningOfSpeech(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.utils.voice.VoiceInputCallback $this) {
        }
        
        public static void onEndOfSpeech(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.utils.voice.VoiceInputCallback $this) {
        }
        
        public static void onPartialResult(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.utils.voice.VoiceInputCallback $this, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
    }
}