package 뮤직비디오;

// 인터페이스
// 인터페이스
interface Playable {
    void music(); // 음악을 재생하는 메서드
    void videos(); // 비디오를 재생하는 메서드
}

// MusicVideos 클래스
class MusicVideos implements Playable {
    private String musicTitle;
    private String videoTitle;

    public MusicVideos(String musicTitle, String videoTitle) {
        this.musicTitle = musicTitle;
        this.videoTitle = videoTitle;
    }

    @Override
    public void music() {
        System.out.println("음악을 재생합니다: " + musicTitle);
    }

    @Override
    public void videos() {
        System.out.println("영상을 재생합니다: " + videoTitle);
    }
}

public class Main {
    public static void main(String[] args) {
        // MusicVideos 클래스의 인스턴스 생성
        MusicVideos musicVideo = new MusicVideos("Best Song Ever", "Best Video Ever");

        // 인터페이스의 메서드를 호출하여 동작 수행
        musicVideo.music();  // Playing music: Best Song Ever
    }
}
