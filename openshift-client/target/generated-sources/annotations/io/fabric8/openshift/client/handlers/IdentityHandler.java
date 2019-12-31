
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

                        

package io.fabric8.openshift.client.handlers;

import java.util.function.Predicate;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.openshift.client.OpenShiftConfig;
import io.fabric8.kubernetes.client.ResourceHandler;
import io.fabric8.kubernetes.client.Watch;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.openshift.client.dsl.internal.IdentityOperationsImpl;
import io.fabric8.kubernetes.client.utils.ApiVersionUtil;

import okhttp3.OkHttpClient;

import io.fabric8.openshift.api.model.Identity;
import io.fabric8.openshift.api.model.IdentityBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class IdentityHandler implements ResourceHandler<Identity, IdentityBuilder> {
  @Override
  public String getKind() {
    return Identity.class.getSimpleName();
  }

  @Override
  public Identity create(OkHttpClient client, Config config, String namespace, Identity item) {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public Identity replace(OkHttpClient client, Config config, String namespace, Identity item) {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public Identity reload(OkHttpClient client, Config config, String namespace, Identity item) {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public IdentityBuilder edit(Identity item) {
    return new IdentityBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, Identity item) {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config),ApiVersionUtil. apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, Identity item, Watcher<Identity> watcher) {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, Identity item, String resourceVersion, Watcher<Identity> watcher) {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public Identity waitUntilReady(OkHttpClient client, Config config, String namespace, Identity item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public Identity waitUntilCondition(OkHttpClient client, Config config, String namespace, Identity item, Predicate<Identity> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new IdentityOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
