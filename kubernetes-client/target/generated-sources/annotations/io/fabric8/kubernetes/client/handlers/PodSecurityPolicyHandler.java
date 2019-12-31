
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
import io.fabric8.kubernetes.client.dsl.internal.PodSecurityPolicyOperationsImpl;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class PodSecurityPolicyHandler implements ResourceHandler<PodSecurityPolicy, PodSecurityPolicyBuilder> {
  @Override
  public String getKind() {
    return PodSecurityPolicy.class.getSimpleName();
  }

  @Override
  public PodSecurityPolicy create(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item) {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public PodSecurityPolicy replace(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item) {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public PodSecurityPolicy reload(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item) {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public PodSecurityPolicyBuilder edit(PodSecurityPolicy item) {
    return new PodSecurityPolicyBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item) {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item, Watcher<PodSecurityPolicy> watcher) {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item, String resourceVersion, Watcher<PodSecurityPolicy> watcher) {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public PodSecurityPolicy waitUntilReady(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public PodSecurityPolicy waitUntilCondition(OkHttpClient client, Config config, String namespace, PodSecurityPolicy item, Predicate<PodSecurityPolicy> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new PodSecurityPolicyOperationsImpl(client, config, "extensions", "v1beta1", namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
