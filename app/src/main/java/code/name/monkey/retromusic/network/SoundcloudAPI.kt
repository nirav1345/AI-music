package code.name.monkey.retromusic.network

import code.name.monkey.retromusic.model.TrackResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SoundcloudAPI {
    @GET("search/tracks")
    fun searchTracks(
        @Query("q") query: String,
        @Query("client_id") clientId: String,
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 0
    ): Call<TrackResponse>
}