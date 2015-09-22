package com.gembas.android.domain.place.interactor;

import com.gembas.android.domain.base.executor.PostExecutionThread;
import com.gembas.android.domain.base.executor.ThreadExecutor;
import com.gembas.android.domain.base.interactor.UseCase;
import com.gembas.android.domain.place.repository.PlaceRepository;

import rx.Observable;

public class GetNearestPlaces extends UseCase {

    private final PlaceRepository placeRepository;
    private final long latitude;
    private final long longitude;

    public GetNearestPlaces(ThreadExecutor threadExecutor,
                            PostExecutionThread postExecutionThread,
                            PlaceRepository placeRepository,
                            long latitude,
                            long longitude) {
        super(threadExecutor, postExecutionThread);

        this.placeRepository = placeRepository;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    @Override
    protected Observable buildUseCaseObservable() {
        return placeRepository.nearestPlaces(latitude, longitude);
    }
}
