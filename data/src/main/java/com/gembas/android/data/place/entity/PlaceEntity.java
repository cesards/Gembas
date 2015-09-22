package com.gembas.android.data.place.entity;

import com.gembas.android.domain.place.Photo;
import com.gembas.android.domain.tag.Tag;

import java.util.Collection;

public class PlaceEntity {

    public final int id;
    public final String title;
    public final String description;
    public final long latitude;
    public final long longitude;
    public final Collection<Tag> tags;
    public final Collection<Photo> photos;
    public final String createdTime;

    public PlaceEntity(int id,
                       String title,
                       String description,
                       long latitude,
                       long longitude,
                       Collection<Tag> tags,
                       Collection<Photo> photos,
                       String createdTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
        this.photos = photos;
        this.createdTime = createdTime;
    }
}
