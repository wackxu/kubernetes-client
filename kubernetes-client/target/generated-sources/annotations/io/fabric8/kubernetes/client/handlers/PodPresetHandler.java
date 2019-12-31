
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
import io.fabric8.kubernetes.client.dsl.internal.PodPresetOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class PodPresetHandler implements ResourceHandler<PodPreset, PodPresetBuilder> {
  @Override
  public String getKind() {
    return PodPreset.class.getSimpleName();
  }

  @Override
  public PodPreset create(OkHttpClient client, Config config, String namespace, PodPreset item) {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public PodPreset replace(OkHttpClient client, Config config, String namespace, PodPreset item) {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public PodPreset reload(OkHttpClient client, Config config, String namespace, PodPreset item) {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public PodPresetBuilder edit(PodPreset item) {
    return new PodPresetBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, PodPreset item) {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, PodPreset item, Watcher<PodPreset> watcher) {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, PodPreset item, String resourceVersion, Watcher<PodPreset> watcher) {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public PodPreset waitUntilReady(OkHttpClient client, Config config, String namespace, PodPreset item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public PodPreset waitUntilCondition(OkHttpClient client, Config config, String namespace, PodPreset item, Predicate<PodPreset> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new PodPresetOperationsImpl(client, config, "settings.k8s.io", "v1alpha1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
