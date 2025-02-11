public class Main {
    public static void main(String[] args) {
        MediaPlayer mp3Player = new MP3Player();
        mp3Player.play("song.mp3");

        WAVPlayer wavPlayer = new WAVPlayer();
        MediaPlayer wavAdapter = new WAVPlayerAdapter(wavPlayer);
        wavAdapter.play("sound.wav");
    }
}