package guru.refactoring.some_cool_media_library;

import java.util.HashMap;

/**
 * Service Interface
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
