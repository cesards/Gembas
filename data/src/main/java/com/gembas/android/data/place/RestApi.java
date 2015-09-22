package com.gembas.android.data.place;

import com.gembas.android.data.place.entity.PlaceEntity;

import java.util.Collection;

import retrofit.Call;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

public interface RestApi {

    @POST("/places")
    Call<Collection<PlaceEntity>> nearestPlaces(@Query("latitude") long latitude,
                                                 @Query("longitude") long longitude);

    @POST("/places")
    Call<Collection<PlaceEntity>> nearestPlaces(@Query("latitude") long latitude,
                                                 @Query("longitude") long longitude,
                                                 @Query("maxDistance") int maxDistance);

    @POST("/places/tag/{tag}")
    Call<Collection<PlaceEntity>> placesByTag(@Path("tagId") String tagId);

    @POST("/places/user/{userId}")
    Call<Collection<PlaceEntity>> favoritePlaces(@Path("userdId") String userdId);
}
