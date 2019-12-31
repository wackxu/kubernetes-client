
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
import io.fabric8.kubernetes.client.dsl.internal.StatefulSetOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class StatefulSetHandler implements ResourceHandler<StatefulSet, StatefulSetBuilder> {
  @Override
  public String getKind() {
    return StatefulSet.class.getSimpleName();
  }

  @Override
  public StatefulSet create(OkHttpClient client, Config config, String namespace, StatefulSet item) {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public StatefulSet replace(OkHttpClient client, Config config, String namespace, StatefulSet item) {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public StatefulSet reload(OkHttpClient client, Config config, String namespace, StatefulSet item) {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public StatefulSetBuilder edit(StatefulSet item) {
    return new StatefulSetBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, StatefulSet item) {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, StatefulSet item, Watcher<StatefulSet> watcher) {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, StatefulSet item, String resourceVersion, Watcher<StatefulSet> watcher) {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public StatefulSet waitUntilReady(OkHttpClient client, Config config, String namespace, StatefulSet item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public StatefulSet waitUntilCondition(OkHttpClient client, Config config, String namespace, StatefulSet item, Predicate<StatefulSet> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new StatefulSetOperationsImpl(client, config, "apps", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
