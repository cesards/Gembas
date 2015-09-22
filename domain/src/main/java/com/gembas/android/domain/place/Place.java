package com.gembas.android.domain.place;


import com.gembas.android.domain.tag.Tag;

import java.util.Collection;

public class Place {

    public final int id;
    public final String title;
    public final long latitude;
    public final long longitude;
    public String description;
    public Collection<Tag> tags;
    public Collection<Photo> photos;

    public Place(int id, String title, long latitude, long longitude) {
        this.id = id;
        this.title = title;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static class Builder {
        private int id;
        private String title;
        private long latitude;
        private long longitude;
        private String description;
        private Collection<Tag> tags;
        private Collection<Photo> photos;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder latitude(long latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder longitude(long longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder tags(Collection<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder photos(Collection<Photo> photos) {
            this.photos = photos;
            return this;
        }

        public Place build() {
            final Place place = new Place(id, title, latitude, longitude);
            place.description = description;
            place.tags = tags;
            place.photos = photos;
            return place;
        }

    }
}
