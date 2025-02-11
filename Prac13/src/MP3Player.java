class MP3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Воспроизведение MP3 файла: " + fileName);
    }
}