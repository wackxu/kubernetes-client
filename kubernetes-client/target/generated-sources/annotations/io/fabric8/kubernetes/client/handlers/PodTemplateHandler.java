
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
import io.fabric8.kubernetes.client.dsl.internal.PodTemplateOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.PodTemplate;
import io.fabric8.kubernetes.api.model.PodTemplateBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class PodTemplateHandler implements ResourceHandler<PodTemplate, PodTemplateBuilder> {
  @Override
  public String getKind() {
    return PodTemplate.class.getSimpleName();
  }

  @Override
  public PodTemplate create(OkHttpClient client, Config config, String namespace, PodTemplate item) {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public PodTemplate replace(OkHttpClient client, Config config, String namespace, PodTemplate item) {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public PodTemplate reload(OkHttpClient client, Config config, String namespace, PodTemplate item) {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public PodTemplateBuilder edit(PodTemplate item) {
    return new PodTemplateBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, PodTemplate item) {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, PodTemplate item, Watcher<PodTemplate> watcher) {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, PodTemplate item, String resourceVersion, Watcher<PodTemplate> watcher) {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public PodTemplate waitUntilReady(OkHttpClient client, Config config, String namespace, PodTemplate item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public PodTemplate waitUntilCondition(OkHttpClient client, Config config, String namespace, PodTemplate item, Predicate<PodTemplate> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new PodTemplateOperationsImpl(client, config, "", "v1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
