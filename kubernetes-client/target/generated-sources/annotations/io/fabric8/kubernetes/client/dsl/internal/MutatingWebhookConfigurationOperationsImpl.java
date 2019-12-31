
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

                        

package io.fabric8.kubernetes.client.dsl.internal;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.base.HasMetadataOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.utils.ApiVersionUtil;

import okhttp3.OkHttpClient;

import io.fabric8.kubernetes.api.model.admissionregistration.DoneableMutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList;
import io.fabric8.kubernetes.api.model.admissionregistration.DoneableMutatingWebhookConfiguration;

import java.util.Map;
import java.util.TreeMap;


public class MutatingWebhookConfigurationOperationsImpl extends HasMetadataOperation<MutatingWebhookConfiguration, MutatingWebhookConfigurationList, DoneableMutatingWebhookConfiguration, Resource<MutatingWebhookConfiguration, DoneableMutatingWebhookConfiguration>> {

  public MutatingWebhookConfigurationOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(client, config, "admissionregistration.k8s.io", "v1beta1", namespace, null, true, null, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>());
  }

  public MutatingWebhookConfigurationOperationsImpl(OkHttpClient client, Config config, String apiGroupVersion, String namespace, String name, Boolean cascading, MutatingWebhookConfiguration item, String resourceVersion, Boolean reloadingFromServer, long gracePeriodSeconds, Map<String, String> labels, Map<String, String> labelsNot, Map<String, String[]> labelsIn, Map<String, String[]> labelsNotIn, Map<String, String> fields) {
    super(client, config, "admissionregistration.k8s.io", apiGroupVersion, "mutatingwebhookconfigurations", namespace, name, cascading, item, resourceVersion, reloadingFromServer, gracePeriodSeconds, labels, labelsNot, labelsIn, labelsNotIn, fields);
  }

  public MutatingWebhookConfigurationOperationsImpl(OkHttpClient client, Config config, String apiGroupName, String apiGroupVersion, String namespace, String name, Boolean cascading, MutatingWebhookConfiguration item, String resourceVersion, Boolean reloadingFromServer, long gracePeriodSeconds, Map<String, String> labels, Map<String, String> labelsNot, Map<String, String[]> labelsIn, Map<String, String[]> labelsNotIn, Map<String, String> fields) {
    super(client, config, apiGroupName, apiGroupVersion, "mutatingwebhookconfigurations", namespace, name, cascading, item, resourceVersion, reloadingFromServer, gracePeriodSeconds, labels, labelsNot, labelsIn, labelsNotIn, fields);
  }

  @Override
  public NonNamespaceOperation<MutatingWebhookConfiguration, MutatingWebhookConfigurationList, DoneableMutatingWebhookConfiguration, Resource<MutatingWebhookConfiguration, DoneableMutatingWebhookConfiguration>> inNamespace(String namespace) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, apiGroupName, apiGroupVersion, namespace, name, isCascading(), getItem(), getResourceVersion(), isReloadingFromServer(), getGracePeriodSeconds(), getLabels(), getLabelsNot(), getLabelsIn(), getLabelsNotIn(), getFields());
  }

  @Override
  public Resource<MutatingWebhookConfiguration, DoneableMutatingWebhookConfiguration> withName(String name) {
    return new MutatingWebhookConfigurationOperationsImpl(client, config, apiGroupName, apiGroupVersion, namespace, name, isCascading(), getItem(), getResourceVersion(), isReloadingFromServer(), getGracePeriodSeconds(), getLabels(), getLabelsNot(), getLabelsIn(), getLabelsNotIn(), getFields());
  }
}
