
/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

                        

package io.fabric8.kubernetes.client.handlers;

import java.util.function.Predicate;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ResourceHandler;
import io.fabric8.kubernetes.client.Watch;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.kubernetes.client.dsl.internal.ComponentStatusOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.ComponentStatus;
import io.fabric8.kubernetes.api.model.ComponentStatusBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class ComponentStatusHandler implements ResourceHandler<ComponentStatus, ComponentStatusBuilder> {
  @Override
  public String getKind() {
    return ComponentStatus.class.getSimpleName();
  }

  @Override
  public ComponentStatus create(OkHttpClient client, Config config, String namespace, ComponentStatus item) {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public ComponentStatus replace(OkHttpClient client, Config config, String namespace, ComponentStatus item) {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public ComponentStatus reload(OkHttpClient client, Config config, String namespace, ComponentStatus item) {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public ComponentStatusBuilder edit(ComponentStatus item) {
    return new ComponentStatusBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, ComponentStatus item) {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, ComponentStatus item, Watcher<ComponentStatus> watcher) {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, ComponentStatus item, String resourceVersion, Watcher<ComponentStatus> watcher) {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public ComponentStatus waitUntilReady(OkHttpClient client, Config config, String namespace, ComponentStatus item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public ComponentStatus waitUntilCondition(OkHttpClient client, Config config, String namespace, ComponentStatus item, Predicate<ComponentStatus> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new ComponentStatusOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
