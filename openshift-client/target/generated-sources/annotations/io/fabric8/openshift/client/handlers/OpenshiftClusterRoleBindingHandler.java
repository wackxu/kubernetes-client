
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
import io.fabric8.openshift.client.dsl.internal.OpenshiftClusterRoleBindingOperationsImpl;
import io.fabric8.kubernetes.client.utils.ApiVersionUtil;

import okhttp3.OkHttpClient;

import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class OpenshiftClusterRoleBindingHandler implements ResourceHandler<OpenshiftClusterRoleBinding, OpenshiftClusterRoleBindingBuilder> {
  @Override
  public String getKind() {
    return OpenshiftClusterRoleBinding.class.getSimpleName();
  }

  @Override
  public OpenshiftClusterRoleBinding create(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item) {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public OpenshiftClusterRoleBinding replace(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item) {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public OpenshiftClusterRoleBinding reload(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item) {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public OpenshiftClusterRoleBindingBuilder edit(OpenshiftClusterRoleBinding item) {
    return new OpenshiftClusterRoleBindingBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item) {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config),ApiVersionUtil. apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item, Watcher<OpenshiftClusterRoleBinding> watcher) {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item, String resourceVersion, Watcher<OpenshiftClusterRoleBinding> watcher) {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public OpenshiftClusterRoleBinding waitUntilReady(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public OpenshiftClusterRoleBinding waitUntilCondition(OkHttpClient client, Config config, String namespace, OpenshiftClusterRoleBinding item, Predicate<OpenshiftClusterRoleBinding> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new OpenshiftClusterRoleBindingOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "authorization.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
