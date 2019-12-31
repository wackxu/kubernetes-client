package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.Node;
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
import javax.validation.constraints.NotNull;
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
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

public interface LocalSubjectAccessReviewFluent<A extends io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    
/**
 * This method has been deprecated, please use method buildContent instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getContent();
    public HasMetadata buildContent();
    public A withContent(HasMetadata content);
    public Boolean hasContent();
    public A withValidatingWebhookConfigurationContent(ValidatingWebhookConfiguration validatingWebhookConfigurationContent);
    public LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<A> withNewValidatingWebhookConfigurationContent();
    public LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<A> withNewValidatingWebhookConfigurationContentLike(ValidatingWebhookConfiguration item);
    public A withStorageClassContent(StorageClass storageClassContent);
    public LocalSubjectAccessReviewFluent.StorageClassContentNested<A> withNewStorageClassContent();
    public LocalSubjectAccessReviewFluent.StorageClassContentNested<A> withNewStorageClassContentLike(StorageClass item);
    public A withClusterRoleBindingContent(ClusterRoleBinding clusterRoleBindingContent);
    public LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<A> withNewClusterRoleBindingContent();
    public LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<A> withNewClusterRoleBindingContentLike(ClusterRoleBinding item);
    public A withOpenshiftRoleBindingContent(OpenshiftRoleBinding openshiftRoleBindingContent);
    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<A> withNewOpenshiftRoleBindingContent();
    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<A> withNewOpenshiftRoleBindingContentLike(OpenshiftRoleBinding item);
    public A withPodDisruptionBudgetContent(PodDisruptionBudget podDisruptionBudgetContent);
    public LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<A> withNewPodDisruptionBudgetContent();
    public LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<A> withNewPodDisruptionBudgetContentLike(PodDisruptionBudget item);
    public A withNetworkPolicyContent(NetworkPolicy networkPolicyContent);
    public LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<A> withNewNetworkPolicyContent();
    public LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<A> withNewNetworkPolicyContentLike(NetworkPolicy item);
    public A withOpenshiftClusterRoleBindingContent(OpenshiftClusterRoleBinding openshiftClusterRoleBindingContent);
    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<A> withNewOpenshiftClusterRoleBindingContent();
    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<A> withNewOpenshiftClusterRoleBindingContentLike(OpenshiftClusterRoleBinding item);
    public A withRouteContent(Route routeContent);
    public LocalSubjectAccessReviewFluent.RouteContentNested<A> withNewRouteContent();
    public LocalSubjectAccessReviewFluent.RouteContentNested<A> withNewRouteContentLike(Route item);
    public A withNamespaceContent(Namespace namespaceContent);
    public LocalSubjectAccessReviewFluent.NamespaceContentNested<A> withNewNamespaceContent();
    public LocalSubjectAccessReviewFluent.NamespaceContentNested<A> withNewNamespaceContentLike(Namespace item);
    public A withServiceContent(Service serviceContent);
    public LocalSubjectAccessReviewFluent.ServiceContentNested<A> withNewServiceContent();
    public LocalSubjectAccessReviewFluent.ServiceContentNested<A> withNewServiceContentLike(Service item);
    public A withReplicationControllerContent(ReplicationController replicationControllerContent);
    public LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<A> withNewReplicationControllerContent();
    public LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<A> withNewReplicationControllerContentLike(ReplicationController item);
    public A withSubjectAccessReviewContent(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview subjectAccessReviewContent);
    public LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<A> withNewSubjectAccessReviewContent();
    public LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<A> withNewSubjectAccessReviewContentLike(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item);
    public A withMutatingWebhookConfigurationContent(MutatingWebhookConfiguration mutatingWebhookConfigurationContent);
    public LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<A> withNewMutatingWebhookConfigurationContent();
    public LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<A> withNewMutatingWebhookConfigurationContentLike(MutatingWebhookConfiguration item);
    public A withHorizontalPodAutoscalerContent(HorizontalPodAutoscaler horizontalPodAutoscalerContent);
    public LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<A> withNewHorizontalPodAutoscalerContent();
    public LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<A> withNewHorizontalPodAutoscalerContentLike(HorizontalPodAutoscaler item);
    public A withScaleContent(Scale scaleContent);
    public LocalSubjectAccessReviewFluent.ScaleContentNested<A> withNewScaleContent();
    public LocalSubjectAccessReviewFluent.ScaleContentNested<A> withNewScaleContentLike(Scale item);
    public A withImageContent(Image imageContent);
    public LocalSubjectAccessReviewFluent.ImageContentNested<A> withNewImageContent();
    public LocalSubjectAccessReviewFluent.ImageContentNested<A> withNewImageContentLike(Image item);
    public A withReplicaSetContent(ReplicaSet replicaSetContent);
    public LocalSubjectAccessReviewFluent.ReplicaSetContentNested<A> withNewReplicaSetContent();
    public LocalSubjectAccessReviewFluent.ReplicaSetContentNested<A> withNewReplicaSetContentLike(ReplicaSet item);
    public A withPodSecurityPolicyContent(PodSecurityPolicy podSecurityPolicyContent);
    public LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<A> withNewPodSecurityPolicyContent();
    public LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<A> withNewPodSecurityPolicyContentLike(PodSecurityPolicy item);
    public A withCronJobContent(CronJob cronJobContent);
    public LocalSubjectAccessReviewFluent.CronJobContentNested<A> withNewCronJobContent();
    public LocalSubjectAccessReviewFluent.CronJobContentNested<A> withNewCronJobContentLike(CronJob item);
    public A withEndpointsContent(Endpoints endpointsContent);
    public LocalSubjectAccessReviewFluent.EndpointsContentNested<A> withNewEndpointsContent();
    public LocalSubjectAccessReviewFluent.EndpointsContentNested<A> withNewEndpointsContentLike(Endpoints item);
    public A withPodContent(Pod podContent);
    public LocalSubjectAccessReviewFluent.PodContentNested<A> withNewPodContent();
    public LocalSubjectAccessReviewFluent.PodContentNested<A> withNewPodContentLike(Pod item);
    public A withConfigMapContent(ConfigMap configMapContent);
    public LocalSubjectAccessReviewFluent.ConfigMapContentNested<A> withNewConfigMapContent();
    public LocalSubjectAccessReviewFluent.ConfigMapContentNested<A> withNewConfigMapContentLike(ConfigMap item);
    public A withCustomResourceDefinitionContent(CustomResourceDefinition customResourceDefinitionContent);
    public LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<A> withNewCustomResourceDefinitionContent();
    public LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<A> withNewCustomResourceDefinitionContentLike(CustomResourceDefinition item);
    public A withBuildContent(Build buildContent);
    public LocalSubjectAccessReviewFluent.BuildContentNested<A> withNewBuildContent();
    public LocalSubjectAccessReviewFluent.BuildContentNested<A> withNewBuildContentLike(Build item);
    public A withImageStreamTagContent(ImageStreamTag imageStreamTagContent);
    public LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<A> withNewImageStreamTagContent();
    public LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<A> withNewImageStreamTagContentLike(ImageStreamTag item);
    public A withGroupContent(Group groupContent);
    public LocalSubjectAccessReviewFluent.GroupContentNested<A> withNewGroupContent();
    public LocalSubjectAccessReviewFluent.GroupContentNested<A> withNewGroupContentLike(Group item);
    public A withImageSignatureContent(ImageSignature imageSignatureContent);
    public LocalSubjectAccessReviewFluent.ImageSignatureContentNested<A> withNewImageSignatureContent();
    public LocalSubjectAccessReviewFluent.ImageSignatureContentNested<A> withNewImageSignatureContentLike(ImageSignature item);
    public A withResourceQuotaContent(ResourceQuota resourceQuotaContent);
    public LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<A> withNewResourceQuotaContent();
    public LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<A> withNewResourceQuotaContentLike(ResourceQuota item);
    public A withBuildRequestContent(BuildRequest buildRequestContent);
    public LocalSubjectAccessReviewFluent.BuildRequestContentNested<A> withNewBuildRequestContent();
    public LocalSubjectAccessReviewFluent.BuildRequestContentNested<A> withNewBuildRequestContentLike(BuildRequest item);
    public A withDaemonSetContent(DaemonSet daemonSetContent);
    public LocalSubjectAccessReviewFluent.DaemonSetContentNested<A> withNewDaemonSetContent();
    public LocalSubjectAccessReviewFluent.DaemonSetContentNested<A> withNewDaemonSetContentLike(DaemonSet item);
    public A withImageStreamContent(ImageStream imageStreamContent);
    public LocalSubjectAccessReviewFluent.ImageStreamContentNested<A> withNewImageStreamContent();
    public LocalSubjectAccessReviewFluent.ImageStreamContentNested<A> withNewImageStreamContentLike(ImageStream item);
    public A withOpenshiftRoleContent(OpenshiftRole openshiftRoleContent);
    public LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<A> withNewOpenshiftRoleContent();
    public LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<A> withNewOpenshiftRoleContentLike(OpenshiftRole item);
    public A withOAuthClientContent(OAuthClient oAuthClientContent);
    public LocalSubjectAccessReviewFluent.OAuthClientContentNested<A> withNewOAuthClientContent();
    public LocalSubjectAccessReviewFluent.OAuthClientContentNested<A> withNewOAuthClientContentLike(OAuthClient item);
    public A withIdentityContent(Identity identityContent);
    public LocalSubjectAccessReviewFluent.IdentityContentNested<A> withNewIdentityContent();
    public LocalSubjectAccessReviewFluent.IdentityContentNested<A> withNewIdentityContentLike(Identity item);
    public A withLimitRangeContent(LimitRange limitRangeContent);
    public LocalSubjectAccessReviewFluent.LimitRangeContentNested<A> withNewLimitRangeContent();
    public LocalSubjectAccessReviewFluent.LimitRangeContentNested<A> withNewLimitRangeContentLike(LimitRange item);
    public A withImageStreamImportContent(ImageStreamImport imageStreamImportContent);
    public LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<A> withNewImageStreamImportContent();
    public LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<A> withNewImageStreamImportContentLike(ImageStreamImport item);
    public A withOpenshiftRoleBindingRestrictionContent(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionContent);
    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<A> withNewOpenshiftRoleBindingRestrictionContent();
    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<A> withNewOpenshiftRoleBindingRestrictionContentLike(OpenshiftRoleBindingRestriction item);
    public A withRoleBindingContent(RoleBinding roleBindingContent);
    public LocalSubjectAccessReviewFluent.RoleBindingContentNested<A> withNewRoleBindingContent();
    public LocalSubjectAccessReviewFluent.RoleBindingContentNested<A> withNewRoleBindingContentLike(RoleBinding item);
    public A withPodPresetContent(PodPreset podPresetContent);
    public LocalSubjectAccessReviewFluent.PodPresetContentNested<A> withNewPodPresetContent();
    public LocalSubjectAccessReviewFluent.PodPresetContentNested<A> withNewPodPresetContentLike(PodPreset item);
    public A withProjectContent(Project projectContent);
    public LocalSubjectAccessReviewFluent.ProjectContentNested<A> withNewProjectContent();
    public LocalSubjectAccessReviewFluent.ProjectContentNested<A> withNewProjectContentLike(Project item);
    public A withBuildConfigContent(BuildConfig buildConfigContent);
    public LocalSubjectAccessReviewFluent.BuildConfigContentNested<A> withNewBuildConfigContent();
    public LocalSubjectAccessReviewFluent.BuildConfigContentNested<A> withNewBuildConfigContentLike(BuildConfig item);
    public A withClusterRoleContent(ClusterRole clusterRoleContent);
    public LocalSubjectAccessReviewFluent.ClusterRoleContentNested<A> withNewClusterRoleContent();
    public LocalSubjectAccessReviewFluent.ClusterRoleContentNested<A> withNewClusterRoleContentLike(ClusterRole item);
    public A withOAuthAuthorizeTokenContent(OAuthAuthorizeToken oAuthAuthorizeTokenContent);
    public LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<A> withNewOAuthAuthorizeTokenContent();
    public LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<A> withNewOAuthAuthorizeTokenContentLike(OAuthAuthorizeToken item);
    public A withProjectRequestContent(ProjectRequest projectRequestContent);
    public LocalSubjectAccessReviewFluent.ProjectRequestContentNested<A> withNewProjectRequestContent();
    public LocalSubjectAccessReviewFluent.ProjectRequestContentNested<A> withNewProjectRequestContentLike(ProjectRequest item);
    public A withPriorityClassContent(PriorityClass priorityClassContent);
    public LocalSubjectAccessReviewFluent.PriorityClassContentNested<A> withNewPriorityClassContent();
    public LocalSubjectAccessReviewFluent.PriorityClassContentNested<A> withNewPriorityClassContentLike(PriorityClass item);
    public A withTemplateContent(Template templateContent);
    public LocalSubjectAccessReviewFluent.TemplateContentNested<A> withNewTemplateContent();
    public LocalSubjectAccessReviewFluent.TemplateContentNested<A> withNewTemplateContentLike(Template item);
    public A withOAuthClientAuthorizationContent(OAuthClientAuthorization oAuthClientAuthorizationContent);
    public LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<A> withNewOAuthClientAuthorizationContent();
    public LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<A> withNewOAuthClientAuthorizationContentLike(OAuthClientAuthorization item);
    public A withDeploymentContent(Deployment deploymentContent);
    public LocalSubjectAccessReviewFluent.DeploymentContentNested<A> withNewDeploymentContent();
    public LocalSubjectAccessReviewFluent.DeploymentContentNested<A> withNewDeploymentContentLike(Deployment item);
    public A withPodTemplateContent(PodTemplate podTemplateContent);
    public LocalSubjectAccessReviewFluent.PodTemplateContentNested<A> withNewPodTemplateContent();
    public LocalSubjectAccessReviewFluent.PodTemplateContentNested<A> withNewPodTemplateContentLike(PodTemplate item);
    public A withEventContent(Event eventContent);
    public LocalSubjectAccessReviewFluent.EventContentNested<A> withNewEventContent();
    public LocalSubjectAccessReviewFluent.EventContentNested<A> withNewEventContentLike(Event item);
    public A withIngressContent(Ingress ingressContent);
    public LocalSubjectAccessReviewFluent.IngressContentNested<A> withNewIngressContent();
    public LocalSubjectAccessReviewFluent.IngressContentNested<A> withNewIngressContentLike(Ingress item);
    public A withDeploymentConfigContent(DeploymentConfig deploymentConfigContent);
    public LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<A> withNewDeploymentConfigContent();
    public LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<A> withNewDeploymentConfigContentLike(DeploymentConfig item);
    public A withOAuthAccessTokenContent(OAuthAccessToken oAuthAccessTokenContent);
    public LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<A> withNewOAuthAccessTokenContent();
    public LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<A> withNewOAuthAccessTokenContentLike(OAuthAccessToken item);
    public A withPersistentVolumeContent(PersistentVolume persistentVolumeContent);
    public LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<A> withNewPersistentVolumeContent();
    public LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<A> withNewPersistentVolumeContentLike(PersistentVolume item);
    public A withPersistentVolumeClaimContent(PersistentVolumeClaim persistentVolumeClaimContent);
    public LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<A> withNewPersistentVolumeClaimContent();
    public LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<A> withNewPersistentVolumeClaimContentLike(PersistentVolumeClaim item);
    public A withEventContent(io.fabric8.kubernetes.api.model.events.Event eventContent);
    public LocalSubjectAccessReviewFluent.EventsEventContentNested<A> withNewEventsEventContent();
    public LocalSubjectAccessReviewFluent.EventsEventContentNested<A> withNewEventContentLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withStatefulSetContent(StatefulSet statefulSetContent);
    public LocalSubjectAccessReviewFluent.StatefulSetContentNested<A> withNewStatefulSetContent();
    public LocalSubjectAccessReviewFluent.StatefulSetContentNested<A> withNewStatefulSetContentLike(StatefulSet item);
    public A withOpenshiftClusterRoleContent(OpenshiftClusterRole openshiftClusterRoleContent);
    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<A> withNewOpenshiftClusterRoleContent();
    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<A> withNewOpenshiftClusterRoleContentLike(OpenshiftClusterRole item);
    public A withRoleContent(Role roleContent);
    public LocalSubjectAccessReviewFluent.RoleContentNested<A> withNewRoleContent();
    public LocalSubjectAccessReviewFluent.RoleContentNested<A> withNewRoleContentLike(Role item);
    public A withUserContent(User userContent);
    public LocalSubjectAccessReviewFluent.UserContentNested<A> withNewUserContent();
    public LocalSubjectAccessReviewFluent.UserContentNested<A> withNewUserContentLike(User item);
    public A withComponentStatusContent(ComponentStatus componentStatusContent);
    public LocalSubjectAccessReviewFluent.ComponentStatusContentNested<A> withNewComponentStatusContent();
    public LocalSubjectAccessReviewFluent.ComponentStatusContentNested<A> withNewComponentStatusContentLike(ComponentStatus item);
    public A withTokenReviewContent(TokenReview tokenReviewContent);
    public LocalSubjectAccessReviewFluent.TokenReviewContentNested<A> withNewTokenReviewContent();
    public LocalSubjectAccessReviewFluent.TokenReviewContentNested<A> withNewTokenReviewContentLike(TokenReview item);
    public A withBindingContent(Binding bindingContent);
    public LocalSubjectAccessReviewFluent.BindingContentNested<A> withNewBindingContent();
    public LocalSubjectAccessReviewFluent.BindingContentNested<A> withNewBindingContentLike(Binding item);
    public A withSecretContent(Secret secretContent);
    public LocalSubjectAccessReviewFluent.SecretContentNested<A> withNewSecretContent();
    public LocalSubjectAccessReviewFluent.SecretContentNested<A> withNewSecretContentLike(Secret item);
    public A withSecurityContextConstraintsContent(SecurityContextConstraints securityContextConstraintsContent);
    public LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<A> withNewSecurityContextConstraintsContent();
    public LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<A> withNewSecurityContextConstraintsContentLike(SecurityContextConstraints item);
    public A withNetNamespaceContent(NetNamespace netNamespaceContent);
    public LocalSubjectAccessReviewFluent.NetNamespaceContentNested<A> withNewNetNamespaceContent();
    public LocalSubjectAccessReviewFluent.NetNamespaceContentNested<A> withNewNetNamespaceContentLike(NetNamespace item);
    public A withNodeContent(Node nodeContent);
    public LocalSubjectAccessReviewFluent.NodeContentNested<A> withNewNodeContent();
    public LocalSubjectAccessReviewFluent.NodeContentNested<A> withNewNodeContentLike(Node item);
    public A withJobContent(Job jobContent);
    public LocalSubjectAccessReviewFluent.JobContentNested<A> withNewJobContent();
    public LocalSubjectAccessReviewFluent.JobContentNested<A> withNewJobContentLike(Job item);
    public A withCertificateSigningRequestContent(CertificateSigningRequest certificateSigningRequestContent);
    public LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<A> withNewCertificateSigningRequestContent();
    public LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<A> withNewCertificateSigningRequestContentLike(CertificateSigningRequest item);
    public A withServiceAccountContent(ServiceAccount serviceAccountContent);
    public LocalSubjectAccessReviewFluent.ServiceAccountContentNested<A> withNewServiceAccountContent();
    public LocalSubjectAccessReviewFluent.ServiceAccountContentNested<A> withNewServiceAccountContentLike(ServiceAccount item);
    public A addToGroups(int index,String item);
    public A setToGroups(int index,String item);
    public A addToGroups(String... items);
    public A addAllToGroups(Collection<String> items);
    public A removeFromGroups(String... items);
    public A removeAllFromGroups(Collection<String> items);
    public List<String> getGroups();
    public String getGroup(int index);
    public String getFirstGroup();
    public String getLastGroup();
    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withGroups(List<String> groups);
    public A withGroups(String... groups);
    public Boolean hasGroups();
    public Boolean isIsNonResourceURL();
    public A withIsNonResourceURL(Boolean isNonResourceURL);
    public Boolean hasIsNonResourceURL();
    public A withNewIsNonResourceURL(String arg1);
    public A withNewIsNonResourceURL(boolean arg1);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();
    public String getResource();
    public A withResource(String resource);
    public Boolean hasResource();
    public String getResourceAPIGroup();
    public A withResourceAPIGroup(String resourceAPIGroup);
    public Boolean hasResourceAPIGroup();
    public String getResourceAPIVersion();
    public A withResourceAPIVersion(String resourceAPIVersion);
    public Boolean hasResourceAPIVersion();
    public String getResourceName();
    public A withResourceName(String resourceName);
    public Boolean hasResourceName();
    public A addToScopes(int index,String item);
    public A setToScopes(int index,String item);
    public A addToScopes(String... items);
    public A addAllToScopes(Collection<String> items);
    public A removeFromScopes(String... items);
    public A removeAllFromScopes(Collection<String> items);
    public List<String> getScopes();
    public String getScope(int index);
    public String getFirstScope();
    public String getLastScope();
    public String getMatchingScope(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withScopes(List<String> scopes);
    public A withScopes(String... scopes);
    public Boolean hasScopes();
    public String getUser();
    public A withUser(String user);
    public Boolean hasUser();
    public String getVerb();
    public A withVerb(String verb);
    public Boolean hasVerb();

    public interface ValidatingWebhookConfigurationContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationContent();
}
    public interface StorageClassContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<LocalSubjectAccessReviewFluent.StorageClassContentNested<N>>{

        
    public N and();    public N endStorageClassContent();
}
    public interface ClusterRoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<N>>{

        
    public N and();    public N endClusterRoleBindingContent();
}
    public interface OpenshiftRoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingContent();
}
    public interface PodDisruptionBudgetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetContent();
}
    public interface NetworkPolicyContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<N>>{

        
    public N and();    public N endNetworkPolicyContent();
}
    public interface OpenshiftClusterRoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingContent();
}
    public interface RouteContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<LocalSubjectAccessReviewFluent.RouteContentNested<N>>{

        
    public N and();    public N endRouteContent();
}
    public interface NamespaceContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<LocalSubjectAccessReviewFluent.NamespaceContentNested<N>>{

        
    public N and();    public N endNamespaceContent();
}
    public interface ServiceContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<LocalSubjectAccessReviewFluent.ServiceContentNested<N>>{

        
    public N and();    public N endServiceContent();
}
    public interface ReplicationControllerContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<N>>{

        
    public N and();    public N endReplicationControllerContent();
}
    public interface SubjectAccessReviewContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent<LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<N>>{

        
    public N and();    public N endSubjectAccessReviewContent();
}
    public interface MutatingWebhookConfigurationContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationContent();
}
    public interface HorizontalPodAutoscalerContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerContent();
}
    public interface ScaleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<LocalSubjectAccessReviewFluent.ScaleContentNested<N>>{

        
    public N and();    public N endScaleContent();
}
    public interface ImageContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<LocalSubjectAccessReviewFluent.ImageContentNested<N>>{

        
    public N and();    public N endImageContent();
}
    public interface ReplicaSetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<LocalSubjectAccessReviewFluent.ReplicaSetContentNested<N>>{

        
    public N and();    public N endReplicaSetContent();
}
    public interface PodSecurityPolicyContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<N>>{

        
    public N and();    public N endPodSecurityPolicyContent();
}
    public interface CronJobContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<LocalSubjectAccessReviewFluent.CronJobContentNested<N>>{

        
    public N and();    public N endCronJobContent();
}
    public interface EndpointsContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<LocalSubjectAccessReviewFluent.EndpointsContentNested<N>>{

        
    public N and();    public N endEndpointsContent();
}
    public interface PodContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<LocalSubjectAccessReviewFluent.PodContentNested<N>>{

        
    public N and();    public N endPodContent();
}
    public interface ConfigMapContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<LocalSubjectAccessReviewFluent.ConfigMapContentNested<N>>{

        
    public N and();    public N endConfigMapContent();
}
    public interface CustomResourceDefinitionContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionContent();
}
    public interface BuildContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<LocalSubjectAccessReviewFluent.BuildContentNested<N>>{

        
    public N and();    public N endBuildContent();
}
    public interface ImageStreamTagContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<N>>{

        
    public N and();    public N endImageStreamTagContent();
}
    public interface GroupContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<LocalSubjectAccessReviewFluent.GroupContentNested<N>>{

        
    public N and();    public N endGroupContent();
}
    public interface ImageSignatureContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<LocalSubjectAccessReviewFluent.ImageSignatureContentNested<N>>{

        
    public N and();    public N endImageSignatureContent();
}
    public interface ResourceQuotaContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<N>>{

        
    public N and();    public N endResourceQuotaContent();
}
    public interface BuildRequestContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<LocalSubjectAccessReviewFluent.BuildRequestContentNested<N>>{

        
    public N and();    public N endBuildRequestContent();
}
    public interface DaemonSetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<LocalSubjectAccessReviewFluent.DaemonSetContentNested<N>>{

        
    public N and();    public N endDaemonSetContent();
}
    public interface ImageStreamContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<LocalSubjectAccessReviewFluent.ImageStreamContentNested<N>>{

        
    public N and();    public N endImageStreamContent();
}
    public interface OpenshiftRoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<N>>{

        
    public N and();    public N endOpenshiftRoleContent();
}
    public interface OAuthClientContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<LocalSubjectAccessReviewFluent.OAuthClientContentNested<N>>{

        
    public N and();    public N endOAuthClientContent();
}
    public interface IdentityContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<LocalSubjectAccessReviewFluent.IdentityContentNested<N>>{

        
    public N and();    public N endIdentityContent();
}
    public interface LimitRangeContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<LocalSubjectAccessReviewFluent.LimitRangeContentNested<N>>{

        
    public N and();    public N endLimitRangeContent();
}
    public interface ImageStreamImportContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<N>>{

        
    public N and();    public N endImageStreamImportContent();
}
    public interface OpenshiftRoleBindingRestrictionContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionContent();
}
    public interface RoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<LocalSubjectAccessReviewFluent.RoleBindingContentNested<N>>{

        
    public N and();    public N endRoleBindingContent();
}
    public interface PodPresetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<LocalSubjectAccessReviewFluent.PodPresetContentNested<N>>{

        
    public N and();    public N endPodPresetContent();
}
    public interface ProjectContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<LocalSubjectAccessReviewFluent.ProjectContentNested<N>>{

        
    public N and();    public N endProjectContent();
}
    public interface BuildConfigContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<LocalSubjectAccessReviewFluent.BuildConfigContentNested<N>>{

        
    public N and();    public N endBuildConfigContent();
}
    public interface ClusterRoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<LocalSubjectAccessReviewFluent.ClusterRoleContentNested<N>>{

        
    public N and();    public N endClusterRoleContent();
}
    public interface OAuthAuthorizeTokenContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenContent();
}
    public interface ProjectRequestContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<LocalSubjectAccessReviewFluent.ProjectRequestContentNested<N>>{

        
    public N and();    public N endProjectRequestContent();
}
    public interface PriorityClassContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<LocalSubjectAccessReviewFluent.PriorityClassContentNested<N>>{

        
    public N and();    public N endPriorityClassContent();
}
    public interface TemplateContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<LocalSubjectAccessReviewFluent.TemplateContentNested<N>>{

        
    public N and();    public N endTemplateContent();
}
    public interface OAuthClientAuthorizationContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationContent();
}
    public interface DeploymentContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<LocalSubjectAccessReviewFluent.DeploymentContentNested<N>>{

        
    public N and();    public N endDeploymentContent();
}
    public interface PodTemplateContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<LocalSubjectAccessReviewFluent.PodTemplateContentNested<N>>{

        
    public N and();    public N endPodTemplateContent();
}
    public interface EventContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<LocalSubjectAccessReviewFluent.EventContentNested<N>>{

        
    public N and();    public N endEventContent();
}
    public interface IngressContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<LocalSubjectAccessReviewFluent.IngressContentNested<N>>{

        
    public N and();    public N endIngressContent();
}
    public interface DeploymentConfigContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<N>>{

        
    public N and();    public N endDeploymentConfigContent();
}
    public interface OAuthAccessTokenContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<N>>{

        
    public N and();    public N endOAuthAccessTokenContent();
}
    public interface PersistentVolumeContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<N>>{

        
    public N and();    public N endPersistentVolumeContent();
}
    public interface PersistentVolumeClaimContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimContent();
}
    public interface EventsEventContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<LocalSubjectAccessReviewFluent.EventsEventContentNested<N>>{

        
    public N and();    public N endEventsEventContent();
}
    public interface StatefulSetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<LocalSubjectAccessReviewFluent.StatefulSetContentNested<N>>{

        
    public N and();    public N endStatefulSetContent();
}
    public interface OpenshiftClusterRoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleContent();
}
    public interface RoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<LocalSubjectAccessReviewFluent.RoleContentNested<N>>{

        
    public N and();    public N endRoleContent();
}
    public interface UserContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<LocalSubjectAccessReviewFluent.UserContentNested<N>>{

        
    public N and();    public N endUserContent();
}
    public interface ComponentStatusContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<LocalSubjectAccessReviewFluent.ComponentStatusContentNested<N>>{

        
    public N and();    public N endComponentStatusContent();
}
    public interface TokenReviewContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<LocalSubjectAccessReviewFluent.TokenReviewContentNested<N>>{

        
    public N and();    public N endTokenReviewContent();
}
    public interface BindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<LocalSubjectAccessReviewFluent.BindingContentNested<N>>{

        
    public N and();    public N endBindingContent();
}
    public interface SecretContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<LocalSubjectAccessReviewFluent.SecretContentNested<N>>{

        
    public N and();    public N endSecretContent();
}
    public interface SecurityContextConstraintsContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsContent();
}
    public interface NetNamespaceContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<LocalSubjectAccessReviewFluent.NetNamespaceContentNested<N>>{

        
    public N and();    public N endNetNamespaceContent();
}
    public interface NodeContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<LocalSubjectAccessReviewFluent.NodeContentNested<N>>{

        
    public N and();    public N endNodeContent();
}
    public interface JobContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<LocalSubjectAccessReviewFluent.JobContentNested<N>>{

        
    public N and();    public N endJobContent();
}
    public interface CertificateSigningRequestContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<N>>{

        
    public N and();    public N endCertificateSigningRequestContent();
}
    public interface ServiceAccountContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<LocalSubjectAccessReviewFluent.ServiceAccountContentNested<N>>{

        
    public N and();    public N endServiceAccountContent();
}


}
