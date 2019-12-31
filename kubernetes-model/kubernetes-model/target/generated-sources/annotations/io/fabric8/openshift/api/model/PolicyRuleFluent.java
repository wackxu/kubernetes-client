package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.Node;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.NodeBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluent;
import io.fabric8.kubernetes.api.model.SecretBuilder;
import io.fabric8.kubernetes.api.model.ConfigMapFluent;
import io.fabric8.kubernetes.api.model.ReplicationController;
import io.fabric8.kubernetes.api.model.EventFluent;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.PodBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.batch.JobFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.EndpointsBuilder;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluent;
import io.fabric8.kubernetes.api.model.EventBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.SecretFluent;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.PodTemplateBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluent;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluent;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.PersistentVolumeFluent;
import java.util.List;
import io.fabric8.kubernetes.api.model.PodTemplate;
import io.fabric8.kubernetes.api.model.Binding;
import io.fabric8.kubernetes.api.model.LimitRangeBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluent;
import io.fabric8.kubernetes.api.model.NodeFluent;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluent;
import io.fabric8.kubernetes.api.model.ServiceFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluent;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.kubernetes.api.model.EndpointsFluent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluent;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimFluent;
import io.fabric8.kubernetes.api.model.ComponentStatusFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.NamespaceFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.kubernetes.api.model.PodTemplateFluent;
import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.PodFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.ComponentStatus;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluent;
import io.fabric8.kubernetes.api.model.BindingFluent;
import io.fabric8.kubernetes.api.model.ServiceAccountFluent;
import io.fabric8.kubernetes.api.model.ResourceQuotaFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluent;
import io.fabric8.kubernetes.api.model.LimitRangeFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobFluent;
import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluent;
import io.fabric8.kubernetes.api.model.PersistentVolumeBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressFluent;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ResourceQuotaBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerFluent;
import io.fabric8.kubernetes.api.model.ServiceAccountBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.api.model.LimitRange;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.BindingBuilder;
import io.fabric8.kubernetes.api.model.ComponentStatusBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerBuilder;
import io.fabric8.kubernetes.api.model.ServiceBuilder;
import io.fabric8.kubernetes.api.model.Endpoints;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

public interface PolicyRuleFluent<A extends io.fabric8.openshift.api.model.PolicyRuleFluent<A>> extends Fluent<A>{


    public A addToApiGroups(int index,String item);
    public A setToApiGroups(int index,String item);
    public A addToApiGroups(String... items);
    public A addAllToApiGroups(Collection<String> items);
    public A removeFromApiGroups(String... items);
    public A removeAllFromApiGroups(Collection<String> items);
    public List<String> getApiGroups();
    public String getApiGroup(int index);
    public String getFirstApiGroup();
    public String getLastApiGroup();
    public String getMatchingApiGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withApiGroups(List<String> apiGroups);
    public A withApiGroups(String... apiGroups);
    public Boolean hasApiGroups();
    
/**
 * This method has been deprecated, please use method buildAttributeRestrictions instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getAttributeRestrictions();
    public HasMetadata buildAttributeRestrictions();
    public A withAttributeRestrictions(HasMetadata attributeRestrictions);
    public Boolean hasAttributeRestrictions();
    public A withValidatingWebhookConfigurationAttributeRestrictions(ValidatingWebhookConfiguration validatingWebhookConfigurationAttributeRestrictions);
    public PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<A> withNewValidatingWebhookConfigurationAttributeRestrictions();
    public PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<A> withNewValidatingWebhookConfigurationAttributeRestrictionsLike(ValidatingWebhookConfiguration item);
    public A withStorageClassAttributeRestrictions(StorageClass storageClassAttributeRestrictions);
    public PolicyRuleFluent.StorageClassAttributeRestrictionsNested<A> withNewStorageClassAttributeRestrictions();
    public PolicyRuleFluent.StorageClassAttributeRestrictionsNested<A> withNewStorageClassAttributeRestrictionsLike(StorageClass item);
    public A withClusterRoleBindingAttributeRestrictions(ClusterRoleBinding clusterRoleBindingAttributeRestrictions);
    public PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<A> withNewClusterRoleBindingAttributeRestrictions();
    public PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<A> withNewClusterRoleBindingAttributeRestrictionsLike(ClusterRoleBinding item);
    public A withOpenshiftRoleBindingAttributeRestrictions(OpenshiftRoleBinding openshiftRoleBindingAttributeRestrictions);
    public PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingAttributeRestrictions();
    public PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingAttributeRestrictionsLike(OpenshiftRoleBinding item);
    public A withPodDisruptionBudgetAttributeRestrictions(PodDisruptionBudget podDisruptionBudgetAttributeRestrictions);
    public PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<A> withNewPodDisruptionBudgetAttributeRestrictions();
    public PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<A> withNewPodDisruptionBudgetAttributeRestrictionsLike(PodDisruptionBudget item);
    public A withNetworkPolicyAttributeRestrictions(NetworkPolicy networkPolicyAttributeRestrictions);
    public PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<A> withNewNetworkPolicyAttributeRestrictions();
    public PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<A> withNewNetworkPolicyAttributeRestrictionsLike(NetworkPolicy item);
    public A withOpenshiftClusterRoleBindingAttributeRestrictions(OpenshiftClusterRoleBinding openshiftClusterRoleBindingAttributeRestrictions);
    public PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleBindingAttributeRestrictions();
    public PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleBindingAttributeRestrictionsLike(OpenshiftClusterRoleBinding item);
    public A withRouteAttributeRestrictions(Route routeAttributeRestrictions);
    public PolicyRuleFluent.RouteAttributeRestrictionsNested<A> withNewRouteAttributeRestrictions();
    public PolicyRuleFluent.RouteAttributeRestrictionsNested<A> withNewRouteAttributeRestrictionsLike(Route item);
    public A withNamespaceAttributeRestrictions(Namespace namespaceAttributeRestrictions);
    public PolicyRuleFluent.NamespaceAttributeRestrictionsNested<A> withNewNamespaceAttributeRestrictions();
    public PolicyRuleFluent.NamespaceAttributeRestrictionsNested<A> withNewNamespaceAttributeRestrictionsLike(Namespace item);
    public A withLocalSubjectAccessReviewAttributeRestrictions(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview localSubjectAccessReviewAttributeRestrictions);
    public PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<A> withNewLocalSubjectAccessReviewAttributeRestrictions();
    public PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<A> withNewLocalSubjectAccessReviewAttributeRestrictionsLike(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item);
    public A withServiceAttributeRestrictions(Service serviceAttributeRestrictions);
    public PolicyRuleFluent.ServiceAttributeRestrictionsNested<A> withNewServiceAttributeRestrictions();
    public PolicyRuleFluent.ServiceAttributeRestrictionsNested<A> withNewServiceAttributeRestrictionsLike(Service item);
    public A withReplicationControllerAttributeRestrictions(ReplicationController replicationControllerAttributeRestrictions);
    public PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<A> withNewReplicationControllerAttributeRestrictions();
    public PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<A> withNewReplicationControllerAttributeRestrictionsLike(ReplicationController item);
    public A withSubjectAccessReviewAttributeRestrictions(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview subjectAccessReviewAttributeRestrictions);
    public PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<A> withNewSubjectAccessReviewAttributeRestrictions();
    public PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<A> withNewSubjectAccessReviewAttributeRestrictionsLike(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item);
    public A withMutatingWebhookConfigurationAttributeRestrictions(MutatingWebhookConfiguration mutatingWebhookConfigurationAttributeRestrictions);
    public PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<A> withNewMutatingWebhookConfigurationAttributeRestrictions();
    public PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<A> withNewMutatingWebhookConfigurationAttributeRestrictionsLike(MutatingWebhookConfiguration item);
    public A withHorizontalPodAutoscalerAttributeRestrictions(HorizontalPodAutoscaler horizontalPodAutoscalerAttributeRestrictions);
    public PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<A> withNewHorizontalPodAutoscalerAttributeRestrictions();
    public PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<A> withNewHorizontalPodAutoscalerAttributeRestrictionsLike(HorizontalPodAutoscaler item);
    public A withScaleAttributeRestrictions(Scale scaleAttributeRestrictions);
    public PolicyRuleFluent.ScaleAttributeRestrictionsNested<A> withNewScaleAttributeRestrictions();
    public PolicyRuleFluent.ScaleAttributeRestrictionsNested<A> withNewScaleAttributeRestrictionsLike(Scale item);
    public A withImageAttributeRestrictions(Image imageAttributeRestrictions);
    public PolicyRuleFluent.ImageAttributeRestrictionsNested<A> withNewImageAttributeRestrictions();
    public PolicyRuleFluent.ImageAttributeRestrictionsNested<A> withNewImageAttributeRestrictionsLike(Image item);
    public A withReplicaSetAttributeRestrictions(ReplicaSet replicaSetAttributeRestrictions);
    public PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<A> withNewReplicaSetAttributeRestrictions();
    public PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<A> withNewReplicaSetAttributeRestrictionsLike(ReplicaSet item);
    public A withPodSecurityPolicyAttributeRestrictions(PodSecurityPolicy podSecurityPolicyAttributeRestrictions);
    public PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<A> withNewPodSecurityPolicyAttributeRestrictions();
    public PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<A> withNewPodSecurityPolicyAttributeRestrictionsLike(PodSecurityPolicy item);
    public A withCronJobAttributeRestrictions(CronJob cronJobAttributeRestrictions);
    public PolicyRuleFluent.CronJobAttributeRestrictionsNested<A> withNewCronJobAttributeRestrictions();
    public PolicyRuleFluent.CronJobAttributeRestrictionsNested<A> withNewCronJobAttributeRestrictionsLike(CronJob item);
    public A withEndpointsAttributeRestrictions(Endpoints endpointsAttributeRestrictions);
    public PolicyRuleFluent.EndpointsAttributeRestrictionsNested<A> withNewEndpointsAttributeRestrictions();
    public PolicyRuleFluent.EndpointsAttributeRestrictionsNested<A> withNewEndpointsAttributeRestrictionsLike(Endpoints item);
    public A withPodAttributeRestrictions(Pod podAttributeRestrictions);
    public PolicyRuleFluent.PodAttributeRestrictionsNested<A> withNewPodAttributeRestrictions();
    public PolicyRuleFluent.PodAttributeRestrictionsNested<A> withNewPodAttributeRestrictionsLike(Pod item);
    public A withConfigMapAttributeRestrictions(ConfigMap configMapAttributeRestrictions);
    public PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<A> withNewConfigMapAttributeRestrictions();
    public PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<A> withNewConfigMapAttributeRestrictionsLike(ConfigMap item);
    public A withCustomResourceDefinitionAttributeRestrictions(CustomResourceDefinition customResourceDefinitionAttributeRestrictions);
    public PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<A> withNewCustomResourceDefinitionAttributeRestrictions();
    public PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<A> withNewCustomResourceDefinitionAttributeRestrictionsLike(CustomResourceDefinition item);
    public A withBuildAttributeRestrictions(Build buildAttributeRestrictions);
    public PolicyRuleFluent.BuildAttributeRestrictionsNested<A> withNewBuildAttributeRestrictions();
    public PolicyRuleFluent.BuildAttributeRestrictionsNested<A> withNewBuildAttributeRestrictionsLike(Build item);
    public A withImageStreamTagAttributeRestrictions(ImageStreamTag imageStreamTagAttributeRestrictions);
    public PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<A> withNewImageStreamTagAttributeRestrictions();
    public PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<A> withNewImageStreamTagAttributeRestrictionsLike(ImageStreamTag item);
    public A withGroupAttributeRestrictions(Group groupAttributeRestrictions);
    public PolicyRuleFluent.GroupAttributeRestrictionsNested<A> withNewGroupAttributeRestrictions();
    public PolicyRuleFluent.GroupAttributeRestrictionsNested<A> withNewGroupAttributeRestrictionsLike(Group item);
    public A withImageSignatureAttributeRestrictions(ImageSignature imageSignatureAttributeRestrictions);
    public PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<A> withNewImageSignatureAttributeRestrictions();
    public PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<A> withNewImageSignatureAttributeRestrictionsLike(ImageSignature item);
    public A withResourceQuotaAttributeRestrictions(ResourceQuota resourceQuotaAttributeRestrictions);
    public PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<A> withNewResourceQuotaAttributeRestrictions();
    public PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<A> withNewResourceQuotaAttributeRestrictionsLike(ResourceQuota item);
    public A withBuildRequestAttributeRestrictions(BuildRequest buildRequestAttributeRestrictions);
    public PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<A> withNewBuildRequestAttributeRestrictions();
    public PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<A> withNewBuildRequestAttributeRestrictionsLike(BuildRequest item);
    public A withDaemonSetAttributeRestrictions(DaemonSet daemonSetAttributeRestrictions);
    public PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<A> withNewDaemonSetAttributeRestrictions();
    public PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<A> withNewDaemonSetAttributeRestrictionsLike(DaemonSet item);
    public A withImageStreamAttributeRestrictions(ImageStream imageStreamAttributeRestrictions);
    public PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<A> withNewImageStreamAttributeRestrictions();
    public PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<A> withNewImageStreamAttributeRestrictionsLike(ImageStream item);
    public A withOpenshiftRoleAttributeRestrictions(OpenshiftRole openshiftRoleAttributeRestrictions);
    public PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<A> withNewOpenshiftRoleAttributeRestrictions();
    public PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<A> withNewOpenshiftRoleAttributeRestrictionsLike(OpenshiftRole item);
    public A withOAuthClientAttributeRestrictions(OAuthClient oAuthClientAttributeRestrictions);
    public PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<A> withNewOAuthClientAttributeRestrictions();
    public PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<A> withNewOAuthClientAttributeRestrictionsLike(OAuthClient item);
    public A withIdentityAttributeRestrictions(Identity identityAttributeRestrictions);
    public PolicyRuleFluent.IdentityAttributeRestrictionsNested<A> withNewIdentityAttributeRestrictions();
    public PolicyRuleFluent.IdentityAttributeRestrictionsNested<A> withNewIdentityAttributeRestrictionsLike(Identity item);
    public A withLimitRangeAttributeRestrictions(LimitRange limitRangeAttributeRestrictions);
    public PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<A> withNewLimitRangeAttributeRestrictions();
    public PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<A> withNewLimitRangeAttributeRestrictionsLike(LimitRange item);
    public A withImageStreamImportAttributeRestrictions(ImageStreamImport imageStreamImportAttributeRestrictions);
    public PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<A> withNewImageStreamImportAttributeRestrictions();
    public PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<A> withNewImageStreamImportAttributeRestrictionsLike(ImageStreamImport item);
    public A withOpenshiftRoleBindingRestrictionAttributeRestrictions(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionAttributeRestrictions);
    public PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingRestrictionAttributeRestrictions();
    public PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingRestrictionAttributeRestrictionsLike(OpenshiftRoleBindingRestriction item);
    public A withRoleBindingAttributeRestrictions(RoleBinding roleBindingAttributeRestrictions);
    public PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<A> withNewRoleBindingAttributeRestrictions();
    public PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<A> withNewRoleBindingAttributeRestrictionsLike(RoleBinding item);
    public A withPodPresetAttributeRestrictions(PodPreset podPresetAttributeRestrictions);
    public PolicyRuleFluent.PodPresetAttributeRestrictionsNested<A> withNewPodPresetAttributeRestrictions();
    public PolicyRuleFluent.PodPresetAttributeRestrictionsNested<A> withNewPodPresetAttributeRestrictionsLike(PodPreset item);
    public A withProjectAttributeRestrictions(Project projectAttributeRestrictions);
    public PolicyRuleFluent.ProjectAttributeRestrictionsNested<A> withNewProjectAttributeRestrictions();
    public PolicyRuleFluent.ProjectAttributeRestrictionsNested<A> withNewProjectAttributeRestrictionsLike(Project item);
    public A withBuildConfigAttributeRestrictions(BuildConfig buildConfigAttributeRestrictions);
    public PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<A> withNewBuildConfigAttributeRestrictions();
    public PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<A> withNewBuildConfigAttributeRestrictionsLike(BuildConfig item);
    public A withClusterRoleAttributeRestrictions(ClusterRole clusterRoleAttributeRestrictions);
    public PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<A> withNewClusterRoleAttributeRestrictions();
    public PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<A> withNewClusterRoleAttributeRestrictionsLike(ClusterRole item);
    public A withOAuthAuthorizeTokenAttributeRestrictions(OAuthAuthorizeToken oAuthAuthorizeTokenAttributeRestrictions);
    public PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<A> withNewOAuthAuthorizeTokenAttributeRestrictions();
    public PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<A> withNewOAuthAuthorizeTokenAttributeRestrictionsLike(OAuthAuthorizeToken item);
    public A withProjectRequestAttributeRestrictions(ProjectRequest projectRequestAttributeRestrictions);
    public PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<A> withNewProjectRequestAttributeRestrictions();
    public PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<A> withNewProjectRequestAttributeRestrictionsLike(ProjectRequest item);
    public A withPriorityClassAttributeRestrictions(PriorityClass priorityClassAttributeRestrictions);
    public PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<A> withNewPriorityClassAttributeRestrictions();
    public PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<A> withNewPriorityClassAttributeRestrictionsLike(PriorityClass item);
    public A withTemplateAttributeRestrictions(Template templateAttributeRestrictions);
    public PolicyRuleFluent.TemplateAttributeRestrictionsNested<A> withNewTemplateAttributeRestrictions();
    public PolicyRuleFluent.TemplateAttributeRestrictionsNested<A> withNewTemplateAttributeRestrictionsLike(Template item);
    public A withOAuthClientAuthorizationAttributeRestrictions(OAuthClientAuthorization oAuthClientAuthorizationAttributeRestrictions);
    public PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<A> withNewOAuthClientAuthorizationAttributeRestrictions();
    public PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<A> withNewOAuthClientAuthorizationAttributeRestrictionsLike(OAuthClientAuthorization item);
    public A withDeploymentAttributeRestrictions(Deployment deploymentAttributeRestrictions);
    public PolicyRuleFluent.DeploymentAttributeRestrictionsNested<A> withNewDeploymentAttributeRestrictions();
    public PolicyRuleFluent.DeploymentAttributeRestrictionsNested<A> withNewDeploymentAttributeRestrictionsLike(Deployment item);
    public A withPodTemplateAttributeRestrictions(PodTemplate podTemplateAttributeRestrictions);
    public PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<A> withNewPodTemplateAttributeRestrictions();
    public PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<A> withNewPodTemplateAttributeRestrictionsLike(PodTemplate item);
    public A withEventAttributeRestrictions(Event eventAttributeRestrictions);
    public PolicyRuleFluent.EventAttributeRestrictionsNested<A> withNewEventAttributeRestrictions();
    public PolicyRuleFluent.EventAttributeRestrictionsNested<A> withNewEventAttributeRestrictionsLike(Event item);
    public A withIngressAttributeRestrictions(Ingress ingressAttributeRestrictions);
    public PolicyRuleFluent.IngressAttributeRestrictionsNested<A> withNewIngressAttributeRestrictions();
    public PolicyRuleFluent.IngressAttributeRestrictionsNested<A> withNewIngressAttributeRestrictionsLike(Ingress item);
    public A withDeploymentConfigAttributeRestrictions(DeploymentConfig deploymentConfigAttributeRestrictions);
    public PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<A> withNewDeploymentConfigAttributeRestrictions();
    public PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<A> withNewDeploymentConfigAttributeRestrictionsLike(DeploymentConfig item);
    public A withOAuthAccessTokenAttributeRestrictions(OAuthAccessToken oAuthAccessTokenAttributeRestrictions);
    public PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<A> withNewOAuthAccessTokenAttributeRestrictions();
    public PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<A> withNewOAuthAccessTokenAttributeRestrictionsLike(OAuthAccessToken item);
    public A withPersistentVolumeAttributeRestrictions(PersistentVolume persistentVolumeAttributeRestrictions);
    public PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<A> withNewPersistentVolumeAttributeRestrictions();
    public PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<A> withNewPersistentVolumeAttributeRestrictionsLike(PersistentVolume item);
    public A withPersistentVolumeClaimAttributeRestrictions(PersistentVolumeClaim persistentVolumeClaimAttributeRestrictions);
    public PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<A> withNewPersistentVolumeClaimAttributeRestrictions();
    public PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<A> withNewPersistentVolumeClaimAttributeRestrictionsLike(PersistentVolumeClaim item);
    public A withEventAttributeRestrictions(io.fabric8.kubernetes.api.model.events.Event eventAttributeRestrictions);
    public PolicyRuleFluent.EventsEventAttributeRestrictionsNested<A> withNewEventsEventAttributeRestrictions();
    public PolicyRuleFluent.EventsEventAttributeRestrictionsNested<A> withNewEventAttributeRestrictionsLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withStatefulSetAttributeRestrictions(StatefulSet statefulSetAttributeRestrictions);
    public PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<A> withNewStatefulSetAttributeRestrictions();
    public PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<A> withNewStatefulSetAttributeRestrictionsLike(StatefulSet item);
    public A withOpenshiftClusterRoleAttributeRestrictions(OpenshiftClusterRole openshiftClusterRoleAttributeRestrictions);
    public PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleAttributeRestrictions();
    public PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleAttributeRestrictionsLike(OpenshiftClusterRole item);
    public A withRoleAttributeRestrictions(Role roleAttributeRestrictions);
    public PolicyRuleFluent.RoleAttributeRestrictionsNested<A> withNewRoleAttributeRestrictions();
    public PolicyRuleFluent.RoleAttributeRestrictionsNested<A> withNewRoleAttributeRestrictionsLike(Role item);
    public A withUserAttributeRestrictions(User userAttributeRestrictions);
    public PolicyRuleFluent.UserAttributeRestrictionsNested<A> withNewUserAttributeRestrictions();
    public PolicyRuleFluent.UserAttributeRestrictionsNested<A> withNewUserAttributeRestrictionsLike(User item);
    public A withComponentStatusAttributeRestrictions(ComponentStatus componentStatusAttributeRestrictions);
    public PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<A> withNewComponentStatusAttributeRestrictions();
    public PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<A> withNewComponentStatusAttributeRestrictionsLike(ComponentStatus item);
    public A withTokenReviewAttributeRestrictions(TokenReview tokenReviewAttributeRestrictions);
    public PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<A> withNewTokenReviewAttributeRestrictions();
    public PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<A> withNewTokenReviewAttributeRestrictionsLike(TokenReview item);
    public A withBindingAttributeRestrictions(Binding bindingAttributeRestrictions);
    public PolicyRuleFluent.BindingAttributeRestrictionsNested<A> withNewBindingAttributeRestrictions();
    public PolicyRuleFluent.BindingAttributeRestrictionsNested<A> withNewBindingAttributeRestrictionsLike(Binding item);
    public A withSecretAttributeRestrictions(Secret secretAttributeRestrictions);
    public PolicyRuleFluent.SecretAttributeRestrictionsNested<A> withNewSecretAttributeRestrictions();
    public PolicyRuleFluent.SecretAttributeRestrictionsNested<A> withNewSecretAttributeRestrictionsLike(Secret item);
    public A withSecurityContextConstraintsAttributeRestrictions(SecurityContextConstraints securityContextConstraintsAttributeRestrictions);
    public PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<A> withNewSecurityContextConstraintsAttributeRestrictions();
    public PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<A> withNewSecurityContextConstraintsAttributeRestrictionsLike(SecurityContextConstraints item);
    public A withNetNamespaceAttributeRestrictions(NetNamespace netNamespaceAttributeRestrictions);
    public PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<A> withNewNetNamespaceAttributeRestrictions();
    public PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<A> withNewNetNamespaceAttributeRestrictionsLike(NetNamespace item);
    public A withNodeAttributeRestrictions(Node nodeAttributeRestrictions);
    public PolicyRuleFluent.NodeAttributeRestrictionsNested<A> withNewNodeAttributeRestrictions();
    public PolicyRuleFluent.NodeAttributeRestrictionsNested<A> withNewNodeAttributeRestrictionsLike(Node item);
    public A withJobAttributeRestrictions(Job jobAttributeRestrictions);
    public PolicyRuleFluent.JobAttributeRestrictionsNested<A> withNewJobAttributeRestrictions();
    public PolicyRuleFluent.JobAttributeRestrictionsNested<A> withNewJobAttributeRestrictionsLike(Job item);
    public A withCertificateSigningRequestAttributeRestrictions(CertificateSigningRequest certificateSigningRequestAttributeRestrictions);
    public PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<A> withNewCertificateSigningRequestAttributeRestrictions();
    public PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<A> withNewCertificateSigningRequestAttributeRestrictionsLike(CertificateSigningRequest item);
    public A withServiceAccountAttributeRestrictions(ServiceAccount serviceAccountAttributeRestrictions);
    public PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<A> withNewServiceAccountAttributeRestrictions();
    public PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<A> withNewServiceAccountAttributeRestrictionsLike(ServiceAccount item);
    public A addToNonResourceURLs(int index,String item);
    public A setToNonResourceURLs(int index,String item);
    public A addToNonResourceURLs(String... items);
    public A addAllToNonResourceURLs(Collection<String> items);
    public A removeFromNonResourceURLs(String... items);
    public A removeAllFromNonResourceURLs(Collection<String> items);
    public List<String> getNonResourceURLs();
    public String getNonResourceURL(int index);
    public String getFirstNonResourceURL();
    public String getLastNonResourceURL();
    public String getMatchingNonResourceURL(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNonResourceURLs(List<String> nonResourceURLs);
    public A withNonResourceURLs(String... nonResourceURLs);
    public Boolean hasNonResourceURLs();
    public A addToResourceNames(int index,String item);
    public A setToResourceNames(int index,String item);
    public A addToResourceNames(String... items);
    public A addAllToResourceNames(Collection<String> items);
    public A removeFromResourceNames(String... items);
    public A removeAllFromResourceNames(Collection<String> items);
    public List<String> getResourceNames();
    public String getResourceName(int index);
    public String getFirstResourceName();
    public String getLastResourceName();
    public String getMatchingResourceName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withResourceNames(List<String> resourceNames);
    public A withResourceNames(String... resourceNames);
    public Boolean hasResourceNames();
    public A addToResources(int index,String item);
    public A setToResources(int index,String item);
    public A addToResources(String... items);
    public A addAllToResources(Collection<String> items);
    public A removeFromResources(String... items);
    public A removeAllFromResources(Collection<String> items);
    public List<String> getResources();
    public String getResource(int index);
    public String getFirstResource();
    public String getLastResource();
    public String getMatchingResource(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withResources(List<String> resources);
    public A withResources(String... resources);
    public Boolean hasResources();
    public A addToVerbs(int index,String item);
    public A setToVerbs(int index,String item);
    public A addToVerbs(String... items);
    public A addAllToVerbs(Collection<String> items);
    public A removeFromVerbs(String... items);
    public A removeAllFromVerbs(Collection<String> items);
    public List<String> getVerbs();
    public String getVerb(int index);
    public String getFirstVerb();
    public String getLastVerb();
    public String getMatchingVerb(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withVerbs(List<String> verbs);
    public A withVerbs(String... verbs);
    public Boolean hasVerbs();

    public interface ValidatingWebhookConfigurationAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationAttributeRestrictions();
}
    public interface StorageClassAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<PolicyRuleFluent.StorageClassAttributeRestrictionsNested<N>>{

        
    public N and();    public N endStorageClassAttributeRestrictions();
}
    public interface ClusterRoleBindingAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<N>>{

        
    public N and();    public N endClusterRoleBindingAttributeRestrictions();
}
    public interface OpenshiftRoleBindingAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingAttributeRestrictions();
}
    public interface PodDisruptionBudgetAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetAttributeRestrictions();
}
    public interface NetworkPolicyAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<N>>{

        
    public N and();    public N endNetworkPolicyAttributeRestrictions();
}
    public interface OpenshiftClusterRoleBindingAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingAttributeRestrictions();
}
    public interface RouteAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<PolicyRuleFluent.RouteAttributeRestrictionsNested<N>>{

        
    public N and();    public N endRouteAttributeRestrictions();
}
    public interface NamespaceAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<PolicyRuleFluent.NamespaceAttributeRestrictionsNested<N>>{

        
    public N and();    public N endNamespaceAttributeRestrictions();
}
    public interface LocalSubjectAccessReviewAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent<PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewAttributeRestrictions();
}
    public interface ServiceAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<PolicyRuleFluent.ServiceAttributeRestrictionsNested<N>>{

        
    public N and();    public N endServiceAttributeRestrictions();
}
    public interface ReplicationControllerAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<N>>{

        
    public N and();    public N endReplicationControllerAttributeRestrictions();
}
    public interface SubjectAccessReviewAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent<PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<N>>{

        
    public N and();    public N endSubjectAccessReviewAttributeRestrictions();
}
    public interface MutatingWebhookConfigurationAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationAttributeRestrictions();
}
    public interface HorizontalPodAutoscalerAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerAttributeRestrictions();
}
    public interface ScaleAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<PolicyRuleFluent.ScaleAttributeRestrictionsNested<N>>{

        
    public N and();    public N endScaleAttributeRestrictions();
}
    public interface ImageAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<PolicyRuleFluent.ImageAttributeRestrictionsNested<N>>{

        
    public N and();    public N endImageAttributeRestrictions();
}
    public interface ReplicaSetAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<N>>{

        
    public N and();    public N endReplicaSetAttributeRestrictions();
}
    public interface PodSecurityPolicyAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPodSecurityPolicyAttributeRestrictions();
}
    public interface CronJobAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<PolicyRuleFluent.CronJobAttributeRestrictionsNested<N>>{

        
    public N and();    public N endCronJobAttributeRestrictions();
}
    public interface EndpointsAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<PolicyRuleFluent.EndpointsAttributeRestrictionsNested<N>>{

        
    public N and();    public N endEndpointsAttributeRestrictions();
}
    public interface PodAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<PolicyRuleFluent.PodAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPodAttributeRestrictions();
}
    public interface ConfigMapAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<N>>{

        
    public N and();    public N endConfigMapAttributeRestrictions();
}
    public interface CustomResourceDefinitionAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionAttributeRestrictions();
}
    public interface BuildAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<PolicyRuleFluent.BuildAttributeRestrictionsNested<N>>{

        
    public N and();    public N endBuildAttributeRestrictions();
}
    public interface ImageStreamTagAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<N>>{

        
    public N and();    public N endImageStreamTagAttributeRestrictions();
}
    public interface GroupAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<PolicyRuleFluent.GroupAttributeRestrictionsNested<N>>{

        
    public N and();    public N endGroupAttributeRestrictions();
}
    public interface ImageSignatureAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<N>>{

        
    public N and();    public N endImageSignatureAttributeRestrictions();
}
    public interface ResourceQuotaAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<N>>{

        
    public N and();    public N endResourceQuotaAttributeRestrictions();
}
    public interface BuildRequestAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<N>>{

        
    public N and();    public N endBuildRequestAttributeRestrictions();
}
    public interface DaemonSetAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<N>>{

        
    public N and();    public N endDaemonSetAttributeRestrictions();
}
    public interface ImageStreamAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<N>>{

        
    public N and();    public N endImageStreamAttributeRestrictions();
}
    public interface OpenshiftRoleAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOpenshiftRoleAttributeRestrictions();
}
    public interface OAuthClientAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOAuthClientAttributeRestrictions();
}
    public interface IdentityAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<PolicyRuleFluent.IdentityAttributeRestrictionsNested<N>>{

        
    public N and();    public N endIdentityAttributeRestrictions();
}
    public interface LimitRangeAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<N>>{

        
    public N and();    public N endLimitRangeAttributeRestrictions();
}
    public interface ImageStreamImportAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<N>>{

        
    public N and();    public N endImageStreamImportAttributeRestrictions();
}
    public interface OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionAttributeRestrictions();
}
    public interface RoleBindingAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<N>>{

        
    public N and();    public N endRoleBindingAttributeRestrictions();
}
    public interface PodPresetAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<PolicyRuleFluent.PodPresetAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPodPresetAttributeRestrictions();
}
    public interface ProjectAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<PolicyRuleFluent.ProjectAttributeRestrictionsNested<N>>{

        
    public N and();    public N endProjectAttributeRestrictions();
}
    public interface BuildConfigAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<N>>{

        
    public N and();    public N endBuildConfigAttributeRestrictions();
}
    public interface ClusterRoleAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<N>>{

        
    public N and();    public N endClusterRoleAttributeRestrictions();
}
    public interface OAuthAuthorizeTokenAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenAttributeRestrictions();
}
    public interface ProjectRequestAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<N>>{

        
    public N and();    public N endProjectRequestAttributeRestrictions();
}
    public interface PriorityClassAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPriorityClassAttributeRestrictions();
}
    public interface TemplateAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<PolicyRuleFluent.TemplateAttributeRestrictionsNested<N>>{

        
    public N and();    public N endTemplateAttributeRestrictions();
}
    public interface OAuthClientAuthorizationAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationAttributeRestrictions();
}
    public interface DeploymentAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<PolicyRuleFluent.DeploymentAttributeRestrictionsNested<N>>{

        
    public N and();    public N endDeploymentAttributeRestrictions();
}
    public interface PodTemplateAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPodTemplateAttributeRestrictions();
}
    public interface EventAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<PolicyRuleFluent.EventAttributeRestrictionsNested<N>>{

        
    public N and();    public N endEventAttributeRestrictions();
}
    public interface IngressAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<PolicyRuleFluent.IngressAttributeRestrictionsNested<N>>{

        
    public N and();    public N endIngressAttributeRestrictions();
}
    public interface DeploymentConfigAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<N>>{

        
    public N and();    public N endDeploymentConfigAttributeRestrictions();
}
    public interface OAuthAccessTokenAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOAuthAccessTokenAttributeRestrictions();
}
    public interface PersistentVolumeAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPersistentVolumeAttributeRestrictions();
}
    public interface PersistentVolumeClaimAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimAttributeRestrictions();
}
    public interface EventsEventAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<PolicyRuleFluent.EventsEventAttributeRestrictionsNested<N>>{

        
    public N and();    public N endEventsEventAttributeRestrictions();
}
    public interface StatefulSetAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<N>>{

        
    public N and();    public N endStatefulSetAttributeRestrictions();
}
    public interface OpenshiftClusterRoleAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleAttributeRestrictions();
}
    public interface RoleAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<PolicyRuleFluent.RoleAttributeRestrictionsNested<N>>{

        
    public N and();    public N endRoleAttributeRestrictions();
}
    public interface UserAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<PolicyRuleFluent.UserAttributeRestrictionsNested<N>>{

        
    public N and();    public N endUserAttributeRestrictions();
}
    public interface ComponentStatusAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<N>>{

        
    public N and();    public N endComponentStatusAttributeRestrictions();
}
    public interface TokenReviewAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<N>>{

        
    public N and();    public N endTokenReviewAttributeRestrictions();
}
    public interface BindingAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<PolicyRuleFluent.BindingAttributeRestrictionsNested<N>>{

        
    public N and();    public N endBindingAttributeRestrictions();
}
    public interface SecretAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<PolicyRuleFluent.SecretAttributeRestrictionsNested<N>>{

        
    public N and();    public N endSecretAttributeRestrictions();
}
    public interface SecurityContextConstraintsAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsAttributeRestrictions();
}
    public interface NetNamespaceAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<N>>{

        
    public N and();    public N endNetNamespaceAttributeRestrictions();
}
    public interface NodeAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<PolicyRuleFluent.NodeAttributeRestrictionsNested<N>>{

        
    public N and();    public N endNodeAttributeRestrictions();
}
    public interface JobAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<PolicyRuleFluent.JobAttributeRestrictionsNested<N>>{

        
    public N and();    public N endJobAttributeRestrictions();
}
    public interface CertificateSigningRequestAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<N>>{

        
    public N and();    public N endCertificateSigningRequestAttributeRestrictions();
}
    public interface ServiceAccountAttributeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<N>>{

        
    public N and();    public N endServiceAccountAttributeRestrictions();
}


}
