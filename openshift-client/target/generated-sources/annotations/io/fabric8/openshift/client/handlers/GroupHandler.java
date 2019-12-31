
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
import io.fabric8.openshift.client.dsl.internal.GroupOperationsImpl;
import io.fabric8.kubernetes.client.utils.ApiVersionUtil;

import okhttp3.OkHttpClient;

import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.GroupBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class GroupHandler implements ResourceHandler<Group, GroupBuilder> {
  @Override
  public String getKind() {
    return Group.class.getSimpleName();
  }

  @Override
  public Group create(OkHttpClient client, Config config, String namespace, Group item) {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public Group replace(OkHttpClient client, Config config, String namespace, Group item) {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public Group reload(OkHttpClient client, Config config, String namespace, Group item) {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public GroupBuilder edit(Group item) {
    return new GroupBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, Group item) {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config),ApiVersionUtil. apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, Group item, Watcher<Group> watcher) {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, Group item, String resourceVersion, Watcher<Group> watcher) {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public Group waitUntilReady(OkHttpClient client, Config config, String namespace, Group item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public Group waitUntilCondition(OkHttpClient client, Config config, String namespace, Group item, Predicate<Group> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new GroupOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "user.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
