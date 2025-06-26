package code.name.monkey.retromusic.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TrackResponse {
    @SerializedName("collection")
    public List<Track> collection;
}