
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
import io.fabric8.kubernetes.client.dsl.internal.StorageClassOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class StorageClassHandler implements ResourceHandler<StorageClass, StorageClassBuilder> {
  @Override
  public String getKind() {
    return StorageClass.class.getSimpleName();
  }

  @Override
  public StorageClass create(OkHttpClient client, Config config, String namespace, StorageClass item) {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public StorageClass replace(OkHttpClient client, Config config, String namespace, StorageClass item) {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public StorageClass reload(OkHttpClient client, Config config, String namespace, StorageClass item) {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public StorageClassBuilder edit(StorageClass item) {
    return new StorageClassBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, StorageClass item) {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, StorageClass item, Watcher<StorageClass> watcher) {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, StorageClass item, String resourceVersion, Watcher<StorageClass> watcher) {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public StorageClass waitUntilReady(OkHttpClient client, Config config, String namespace, StorageClass item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public StorageClass waitUntilCondition(OkHttpClient client, Config config, String namespace, StorageClass item, Predicate<StorageClass> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new StorageClassOperationsImpl(client, config, "storage.k8s.io", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
