
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
import io.fabric8.openshift.client.dsl.internal.BuildConfigOperationsImpl;
import io.fabric8.kubernetes.client.utils.ApiVersionUtil;

import okhttp3.OkHttpClient;

import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.BuildConfigBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class BuildConfigHandler implements ResourceHandler<BuildConfig, BuildConfigBuilder> {
  @Override
  public String getKind() {
    return BuildConfig.class.getSimpleName();
  }

  @Override
  public BuildConfig create(OkHttpClient client, Config config, String namespace, BuildConfig item) {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public BuildConfig replace(OkHttpClient client, Config config, String namespace, BuildConfig item) {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public BuildConfig reload(OkHttpClient client, Config config, String namespace, BuildConfig item) {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public BuildConfigBuilder edit(BuildConfig item) {
    return new BuildConfigBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, BuildConfig item) {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config),ApiVersionUtil. apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, BuildConfig item, Watcher<BuildConfig> watcher) {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, BuildConfig item, String resourceVersion, Watcher<BuildConfig> watcher) {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public BuildConfig waitUntilReady(OkHttpClient client, Config config, String namespace, BuildConfig item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public BuildConfig waitUntilCondition(OkHttpClient client, Config config, String namespace, BuildConfig item, Predicate<BuildConfig> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new BuildConfigOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "build.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
