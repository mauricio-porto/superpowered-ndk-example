package com.braintech.plugjni;

public final class PlugSuperpowered {

   static {
    System.loadLibrary("SuperpoweredExample");
   }

   public void createSuperpoweredInstance(int samplerate, int buffersize, String apkPath, int fileOffset, int fileLength) {
        SuperpoweredExample(samplerate, buffersize, apkPath, fileOffset, fileLength);
    }

    public void setOnPlayPause(boolean play) {
        onPlayPause(play);
    }

    public void setSeekTo(double positionPercent) {
        seekTo(positionPercent);
    }

    public void setOnPitchChanged(int pitchValue) {
        onPitchChanged(pitchValue);
    }

    public void setOnTempoSelected(int tempoValue) {
        onTempoSelected(tempoValue);
    }

    private native void SuperpoweredExample(int samplerate, int buffersize, String apkPath, int fileOffset, int fileLength);

    private native void onPlayPause(boolean play);

    private native void seekTo(double positionPercent);

    private native void onPitchChanged(int pitchValue);

    private native void onTempoSelected(int tempoValue);
}

