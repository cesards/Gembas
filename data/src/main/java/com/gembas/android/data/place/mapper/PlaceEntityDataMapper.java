package com.gembas.android.data.place.mapper;

import com.gembas.android.data.place.entity.PlaceEntity;
import com.gembas.android.domain.place.Place;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceEntityDataMapper {

  /**
   * Transform a {@link PlaceEntity} into an {@link Place}.
   *
   * @param placeEntity Object to be transformed.
   *
   * @return {@link Place} if valid {@link PlaceEntity} otherwise null.
   */
  public Place transform(PlaceEntity placeEntity) {
    Place place = null;
    if (placeEntity != null) {
      place = new Place(placeEntity.id, placeEntity.title, placeEntity.latitude, placeEntity.longitude);
      place.description = placeEntity.description;
      place.photos = placeEntity.photos;
      place.tags = placeEntity.tags;
    }

    return place;
  }

  /**
   * Transform a List of {@link PlaceEntity} into a Collection of {@link Place}.
   *
   * @param placeEntityCollection Object Collection to be transformed.
   *
   * @return {@link Place} if valid {@link PlaceEntity} otherwise null.
   */
  public Collection<Place> transform(Collection<PlaceEntity> placeEntityCollection) {
    Collection<Place> worldTours = new ArrayList<>(20);
    for (PlaceEntity userEntity : placeEntityCollection) {
      final Place place = transform(userEntity);
      if (place != null) {
        worldTours.add(place);
      }
    }

    return worldTours;
  }
}
