
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
import io.fabric8.openshift.client.dsl.internal.ImageOperationsImpl;
import io.fabric8.kubernetes.client.utils.ApiVersionUtil;

import okhttp3.OkHttpClient;

import io.fabric8.openshift.api.model.Image;
import io.fabric8.openshift.api.model.ImageBuilder;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class ImageHandler implements ResourceHandler<Image, ImageBuilder> {
  @Override
  public String getKind() {
    return Image.class.getSimpleName();
  }

  @Override
  public Image create(OkHttpClient client, Config config, String namespace, Image item) {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).create();
  }

  @Override
  public Image replace(OkHttpClient client, Config config, String namespace, Image item) {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, true, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).replace(item);
  }

  @Override
  public Image reload(OkHttpClient client, Config config, String namespace, Image item) {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).fromServer().get();
  }

  @Override
  public ImageBuilder edit(Image item) {
    return new ImageBuilder(item);
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, Image item) {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config),ApiVersionUtil. apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).delete(item);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, Image item, Watcher<Image> watcher) {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(watcher);
  }

  @Override
  public Watch watch(OkHttpClient client, Config config, String namespace, Image item, String resourceVersion, Watcher<Image> watcher) {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).watch(resourceVersion, watcher);
  }

  @Override
  public Image waitUntilReady(OkHttpClient client, Config config, String namespace, Image item, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilReady(amount, timeUnit);
  }

  @Override
  public Image waitUntilCondition(OkHttpClient client, Config config, String namespace, Image item, Predicate<Image> condition, long amount, TimeUnit timeUnit) throws InterruptedException {
    return new ImageOperationsImpl(client, OpenShiftConfig.wrap(config), ApiVersionUtil.apiGroup(item, "image.openshift.io"), ApiVersionUtil.apiVersion(item, "v1"), namespace, null, true, item, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>()).waitUntilCondition(condition, amount, timeUnit);
  }
}
