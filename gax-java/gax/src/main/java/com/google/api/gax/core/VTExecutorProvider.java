package com.google.api.gax.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class VTExecutorProvider implements ExecutorProvider {
  ExecutorService executor;

  public VTExecutorProvider(ExecutorService executor) {
    this.executor = executor;
  }

  @Override
  public boolean shouldAutoClose() {
    return false;
  }

  @Override
  public ScheduledExecutorService getExecutor() {
    return null;
  }

  @Override
  public ExecutorService getVTExecutor() {
    return executor;
  }
}
