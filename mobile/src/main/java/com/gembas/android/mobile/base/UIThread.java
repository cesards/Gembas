/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 *
 * @author Fernando Cejas (the android10 coder)
 */
package com.gembas.android.mobile.base;

import com.gembas.android.domain.base.executor.PostExecutionThread;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

/**
 * MainThread (UI Thread) implementation based on a {@link rx.Scheduler} which will execute actions
 * on the Android UI thread
 */
public class UIThread implements PostExecutionThread {

  @Override
  public Scheduler getScheduler() {
    return AndroidSchedulers.mainThread();
  }
}
