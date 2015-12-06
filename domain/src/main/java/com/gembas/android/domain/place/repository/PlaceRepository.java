package com.gembas.android.domain.place.repository;

import com.gembas.android.domain.place.Place;

import java.util.Collection;

import rx.Observable;

/**
 * Interface that represents a Repository for getting {@link } data
 */
public interface PlaceRepository {

  /**
   * Get a {@link Observable} which will emit a List of {@link Place} near the given latitude and longitude
   *
   * @param latitude current latitude position of the user
   * @param longitude current longitude position of the user
   */
  Observable<Collection<Place>> nearestPlaces(long latitude, long longitude);

  /**
   * Get a {@link Observable} which will emit a List of {@link Place} near the given latitude and longitude
   *
   * @param latitude current latitude position of the user
   * @param longitude current longitude position of the user
   * @param maxDistance max distance user has selected (in meters)
   */
  Observable<Collection<Place>> nearestPlaces(long latitude, long longitude, int maxDistance);

  /**
   * Get a {@link Observable} which will emit a List of {@link Place} with the selected tag
   */
  Observable<Collection<Place>> placesByTag(String tagId);

  /**
   * Get a {@link Observable} which will emit a List of favorite {@link Place}
   */
  Observable<Collection<Place>> favoritePlaces(String userdId);
}
