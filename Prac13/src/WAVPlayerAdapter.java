class WAVPlayerAdapter implements MediaPlayer {
    private WAVPlayer wavPlayer;

    public WAVPlayerAdapter(WAVPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Адаптер конвертирует вызов для WAV плеера");
        wavPlayer.play(fileName);
    }
}