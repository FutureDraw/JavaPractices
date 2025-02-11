class WAVPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Воспроизведение WAV файла: " + fileName);
    }
}