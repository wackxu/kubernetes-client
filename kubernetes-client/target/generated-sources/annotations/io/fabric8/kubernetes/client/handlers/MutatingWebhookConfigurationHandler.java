
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
import io.fabric8.kubernetes.client.dsl.internal.MutatingWebhookConfigurationOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class MutatingWebhookConfigurationHandler implements ResourceHandler<MutatingWebhookConfiguration, MutatingWebhookConfigurationBuilder> {
  @Override
  public String getKind() {
    return MutatingWebhookConfiguration.class.getSimpleName();
  }

  @Override
  public MutatingWebhookConfiguration create(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public MutatingWebhookConfiguration replace(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public MutatingWebhookConfiguration reload(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public MutatingWebhookConfigurationBuilder edit(MutatingWebhookConfiguration item) {
    return new MutatingWebhookConfigurationBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item, Watcher<MutatingWebhookConfiguration> watcher) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item, String resourceVersion, Watcher<MutatingWebhookConfiguration> watcher) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public MutatingWebhookConfiguration waitUntilReady(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public MutatingWebhookConfiguration waitUntilCondition(OkHttpClient client, Config config, String namespace, MutatingWebhookConfiguration item, Predicate<MutatingWebhookConfiguration> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
