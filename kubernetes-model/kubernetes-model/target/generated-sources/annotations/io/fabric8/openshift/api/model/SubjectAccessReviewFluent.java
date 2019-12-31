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
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.EndpointsBuilder;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
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
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

public interface SubjectAccessReviewFluent<A extends io.fabric8.openshift.api.model.SubjectAccessReviewFluent<A>> extends Fluent<A>{


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
    public SubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<A> withNewValidatingWebhookConfigurationContent();
    public SubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<A> withNewValidatingWebhookConfigurationContentLike(ValidatingWebhookConfiguration item);
    public A withStorageClassContent(StorageClass storageClassContent);
    public SubjectAccessReviewFluent.StorageClassContentNested<A> withNewStorageClassContent();
    public SubjectAccessReviewFluent.StorageClassContentNested<A> withNewStorageClassContentLike(StorageClass item);
    public A withClusterRoleBindingContent(ClusterRoleBinding clusterRoleBindingContent);
    public SubjectAccessReviewFluent.ClusterRoleBindingContentNested<A> withNewClusterRoleBindingContent();
    public SubjectAccessReviewFluent.ClusterRoleBindingContentNested<A> withNewClusterRoleBindingContentLike(ClusterRoleBinding item);
    public A withOpenshiftRoleBindingContent(OpenshiftRoleBinding openshiftRoleBindingContent);
    public SubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<A> withNewOpenshiftRoleBindingContent();
    public SubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<A> withNewOpenshiftRoleBindingContentLike(OpenshiftRoleBinding item);
    public A withPodDisruptionBudgetContent(PodDisruptionBudget podDisruptionBudgetContent);
    public SubjectAccessReviewFluent.PodDisruptionBudgetContentNested<A> withNewPodDisruptionBudgetContent();
    public SubjectAccessReviewFluent.PodDisruptionBudgetContentNested<A> withNewPodDisruptionBudgetContentLike(PodDisruptionBudget item);
    public A withNetworkPolicyContent(NetworkPolicy networkPolicyContent);
    public SubjectAccessReviewFluent.NetworkPolicyContentNested<A> withNewNetworkPolicyContent();
    public SubjectAccessReviewFluent.NetworkPolicyContentNested<A> withNewNetworkPolicyContentLike(NetworkPolicy item);
    public A withOpenshiftClusterRoleBindingContent(OpenshiftClusterRoleBinding openshiftClusterRoleBindingContent);
    public SubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<A> withNewOpenshiftClusterRoleBindingContent();
    public SubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<A> withNewOpenshiftClusterRoleBindingContentLike(OpenshiftClusterRoleBinding item);
    public A withRouteContent(Route routeContent);
    public SubjectAccessReviewFluent.RouteContentNested<A> withNewRouteContent();
    public SubjectAccessReviewFluent.RouteContentNested<A> withNewRouteContentLike(Route item);
    public A withNamespaceContent(Namespace namespaceContent);
    public SubjectAccessReviewFluent.NamespaceContentNested<A> withNewNamespaceContent();
    public SubjectAccessReviewFluent.NamespaceContentNested<A> withNewNamespaceContentLike(Namespace item);
    public A withLocalSubjectAccessReviewContent(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview localSubjectAccessReviewContent);
    public SubjectAccessReviewFluent.LocalSubjectAccessReviewContentNested<A> withNewLocalSubjectAccessReviewContent();
    public SubjectAccessReviewFluent.LocalSubjectAccessReviewContentNested<A> withNewLocalSubjectAccessReviewContentLike(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item);
    public A withServiceContent(Service serviceContent);
    public SubjectAccessReviewFluent.ServiceContentNested<A> withNewServiceContent();
    public SubjectAccessReviewFluent.ServiceContentNested<A> withNewServiceContentLike(Service item);
    public A withReplicationControllerContent(ReplicationController replicationControllerContent);
    public SubjectAccessReviewFluent.ReplicationControllerContentNested<A> withNewReplicationControllerContent();
    public SubjectAccessReviewFluent.ReplicationControllerContentNested<A> withNewReplicationControllerContentLike(ReplicationController item);
    public A withMutatingWebhookConfigurationContent(MutatingWebhookConfiguration mutatingWebhookConfigurationContent);
    public SubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<A> withNewMutatingWebhookConfigurationContent();
    public SubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<A> withNewMutatingWebhookConfigurationContentLike(MutatingWebhookConfiguration item);
    public A withHorizontalPodAutoscalerContent(HorizontalPodAutoscaler horizontalPodAutoscalerContent);
    public SubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<A> withNewHorizontalPodAutoscalerContent();
    public SubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<A> withNewHorizontalPodAutoscalerContentLike(HorizontalPodAutoscaler item);
    public A withScaleContent(Scale scaleContent);
    public SubjectAccessReviewFluent.ScaleContentNested<A> withNewScaleContent();
    public SubjectAccessReviewFluent.ScaleContentNested<A> withNewScaleContentLike(Scale item);
    public A withImageContent(Image imageContent);
    public SubjectAccessReviewFluent.ImageContentNested<A> withNewImageContent();
    public SubjectAccessReviewFluent.ImageContentNested<A> withNewImageContentLike(Image item);
    public A withReplicaSetContent(ReplicaSet replicaSetContent);
    public SubjectAccessReviewFluent.ReplicaSetContentNested<A> withNewReplicaSetContent();
    public SubjectAccessReviewFluent.ReplicaSetContentNested<A> withNewReplicaSetContentLike(ReplicaSet item);
    public A withPodSecurityPolicyContent(PodSecurityPolicy podSecurityPolicyContent);
    public SubjectAccessReviewFluent.PodSecurityPolicyContentNested<A> withNewPodSecurityPolicyContent();
    public SubjectAccessReviewFluent.PodSecurityPolicyContentNested<A> withNewPodSecurityPolicyContentLike(PodSecurityPolicy item);
    public A withCronJobContent(CronJob cronJobContent);
    public SubjectAccessReviewFluent.CronJobContentNested<A> withNewCronJobContent();
    public SubjectAccessReviewFluent.CronJobContentNested<A> withNewCronJobContentLike(CronJob item);
    public A withEndpointsContent(Endpoints endpointsContent);
    public SubjectAccessReviewFluent.EndpointsContentNested<A> withNewEndpointsContent();
    public SubjectAccessReviewFluent.EndpointsContentNested<A> withNewEndpointsContentLike(Endpoints item);
    public A withPodContent(Pod podContent);
    public SubjectAccessReviewFluent.PodContentNested<A> withNewPodContent();
    public SubjectAccessReviewFluent.PodContentNested<A> withNewPodContentLike(Pod item);
    public A withConfigMapContent(ConfigMap configMapContent);
    public SubjectAccessReviewFluent.ConfigMapContentNested<A> withNewConfigMapContent();
    public SubjectAccessReviewFluent.ConfigMapContentNested<A> withNewConfigMapContentLike(ConfigMap item);
    public A withCustomResourceDefinitionContent(CustomResourceDefinition customResourceDefinitionContent);
    public SubjectAccessReviewFluent.CustomResourceDefinitionContentNested<A> withNewCustomResourceDefinitionContent();
    public SubjectAccessReviewFluent.CustomResourceDefinitionContentNested<A> withNewCustomResourceDefinitionContentLike(CustomResourceDefinition item);
    public A withBuildContent(Build buildContent);
    public SubjectAccessReviewFluent.BuildContentNested<A> withNewBuildContent();
    public SubjectAccessReviewFluent.BuildContentNested<A> withNewBuildContentLike(Build item);
    public A withImageStreamTagContent(ImageStreamTag imageStreamTagContent);
    public SubjectAccessReviewFluent.ImageStreamTagContentNested<A> withNewImageStreamTagContent();
    public SubjectAccessReviewFluent.ImageStreamTagContentNested<A> withNewImageStreamTagContentLike(ImageStreamTag item);
    public A withGroupContent(Group groupContent);
    public SubjectAccessReviewFluent.GroupContentNested<A> withNewGroupContent();
    public SubjectAccessReviewFluent.GroupContentNested<A> withNewGroupContentLike(Group item);
    public A withImageSignatureContent(ImageSignature imageSignatureContent);
    public SubjectAccessReviewFluent.ImageSignatureContentNested<A> withNewImageSignatureContent();
    public SubjectAccessReviewFluent.ImageSignatureContentNested<A> withNewImageSignatureContentLike(ImageSignature item);
    public A withResourceQuotaContent(ResourceQuota resourceQuotaContent);
    public SubjectAccessReviewFluent.ResourceQuotaContentNested<A> withNewResourceQuotaContent();
    public SubjectAccessReviewFluent.ResourceQuotaContentNested<A> withNewResourceQuotaContentLike(ResourceQuota item);
    public A withBuildRequestContent(BuildRequest buildRequestContent);
    public SubjectAccessReviewFluent.BuildRequestContentNested<A> withNewBuildRequestContent();
    public SubjectAccessReviewFluent.BuildRequestContentNested<A> withNewBuildRequestContentLike(BuildRequest item);
    public A withDaemonSetContent(DaemonSet daemonSetContent);
    public SubjectAccessReviewFluent.DaemonSetContentNested<A> withNewDaemonSetContent();
    public SubjectAccessReviewFluent.DaemonSetContentNested<A> withNewDaemonSetContentLike(DaemonSet item);
    public A withImageStreamContent(ImageStream imageStreamContent);
    public SubjectAccessReviewFluent.ImageStreamContentNested<A> withNewImageStreamContent();
    public SubjectAccessReviewFluent.ImageStreamContentNested<A> withNewImageStreamContentLike(ImageStream item);
    public A withOpenshiftRoleContent(OpenshiftRole openshiftRoleContent);
    public SubjectAccessReviewFluent.OpenshiftRoleContentNested<A> withNewOpenshiftRoleContent();
    public SubjectAccessReviewFluent.OpenshiftRoleContentNested<A> withNewOpenshiftRoleContentLike(OpenshiftRole item);
    public A withOAuthClientContent(OAuthClient oAuthClientContent);
    public SubjectAccessReviewFluent.OAuthClientContentNested<A> withNewOAuthClientContent();
    public SubjectAccessReviewFluent.OAuthClientContentNested<A> withNewOAuthClientContentLike(OAuthClient item);
    public A withIdentityContent(Identity identityContent);
    public SubjectAccessReviewFluent.IdentityContentNested<A> withNewIdentityContent();
    public SubjectAccessReviewFluent.IdentityContentNested<A> withNewIdentityContentLike(Identity item);
    public A withLimitRangeContent(LimitRange limitRangeContent);
    public SubjectAccessReviewFluent.LimitRangeContentNested<A> withNewLimitRangeContent();
    public SubjectAccessReviewFluent.LimitRangeContentNested<A> withNewLimitRangeContentLike(LimitRange item);
    public A withImageStreamImportContent(ImageStreamImport imageStreamImportContent);
    public SubjectAccessReviewFluent.ImageStreamImportContentNested<A> withNewImageStreamImportContent();
    public SubjectAccessReviewFluent.ImageStreamImportContentNested<A> withNewImageStreamImportContentLike(ImageStreamImport item);
    public A withOpenshiftRoleBindingRestrictionContent(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionContent);
    public SubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<A> withNewOpenshiftRoleBindingRestrictionContent();
    public SubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<A> withNewOpenshiftRoleBindingRestrictionContentLike(OpenshiftRoleBindingRestriction item);
    public A withRoleBindingContent(RoleBinding roleBindingContent);
    public SubjectAccessReviewFluent.RoleBindingContentNested<A> withNewRoleBindingContent();
    public SubjectAccessReviewFluent.RoleBindingContentNested<A> withNewRoleBindingContentLike(RoleBinding item);
    public A withPodPresetContent(PodPreset podPresetContent);
    public SubjectAccessReviewFluent.PodPresetContentNested<A> withNewPodPresetContent();
    public SubjectAccessReviewFluent.PodPresetContentNested<A> withNewPodPresetContentLike(PodPreset item);
    public A withProjectContent(Project projectContent);
    public SubjectAccessReviewFluent.ProjectContentNested<A> withNewProjectContent();
    public SubjectAccessReviewFluent.ProjectContentNested<A> withNewProjectContentLike(Project item);
    public A withBuildConfigContent(BuildConfig buildConfigContent);
    public SubjectAccessReviewFluent.BuildConfigContentNested<A> withNewBuildConfigContent();
    public SubjectAccessReviewFluent.BuildConfigContentNested<A> withNewBuildConfigContentLike(BuildConfig item);
    public A withClusterRoleContent(ClusterRole clusterRoleContent);
    public SubjectAccessReviewFluent.ClusterRoleContentNested<A> withNewClusterRoleContent();
    public SubjectAccessReviewFluent.ClusterRoleContentNested<A> withNewClusterRoleContentLike(ClusterRole item);
    public A withOAuthAuthorizeTokenContent(OAuthAuthorizeToken oAuthAuthorizeTokenContent);
    public SubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<A> withNewOAuthAuthorizeTokenContent();
    public SubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<A> withNewOAuthAuthorizeTokenContentLike(OAuthAuthorizeToken item);
    public A withProjectRequestContent(ProjectRequest projectRequestContent);
    public SubjectAccessReviewFluent.ProjectRequestContentNested<A> withNewProjectRequestContent();
    public SubjectAccessReviewFluent.ProjectRequestContentNested<A> withNewProjectRequestContentLike(ProjectRequest item);
    public A withPriorityClassContent(PriorityClass priorityClassContent);
    public SubjectAccessReviewFluent.PriorityClassContentNested<A> withNewPriorityClassContent();
    public SubjectAccessReviewFluent.PriorityClassContentNested<A> withNewPriorityClassContentLike(PriorityClass item);
    public A withTemplateContent(Template templateContent);
    public SubjectAccessReviewFluent.TemplateContentNested<A> withNewTemplateContent();
    public SubjectAccessReviewFluent.TemplateContentNested<A> withNewTemplateContentLike(Template item);
    public A withOAuthClientAuthorizationContent(OAuthClientAuthorization oAuthClientAuthorizationContent);
    public SubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<A> withNewOAuthClientAuthorizationContent();
    public SubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<A> withNewOAuthClientAuthorizationContentLike(OAuthClientAuthorization item);
    public A withDeploymentContent(Deployment deploymentContent);
    public SubjectAccessReviewFluent.DeploymentContentNested<A> withNewDeploymentContent();
    public SubjectAccessReviewFluent.DeploymentContentNested<A> withNewDeploymentContentLike(Deployment item);
    public A withPodTemplateContent(PodTemplate podTemplateContent);
    public SubjectAccessReviewFluent.PodTemplateContentNested<A> withNewPodTemplateContent();
    public SubjectAccessReviewFluent.PodTemplateContentNested<A> withNewPodTemplateContentLike(PodTemplate item);
    public A withEventContent(Event eventContent);
    public SubjectAccessReviewFluent.EventContentNested<A> withNewEventContent();
    public SubjectAccessReviewFluent.EventContentNested<A> withNewEventContentLike(Event item);
    public A withIngressContent(Ingress ingressContent);
    public SubjectAccessReviewFluent.IngressContentNested<A> withNewIngressContent();
    public SubjectAccessReviewFluent.IngressContentNested<A> withNewIngressContentLike(Ingress item);
    public A withDeploymentConfigContent(DeploymentConfig deploymentConfigContent);
    public SubjectAccessReviewFluent.DeploymentConfigContentNested<A> withNewDeploymentConfigContent();
    public SubjectAccessReviewFluent.DeploymentConfigContentNested<A> withNewDeploymentConfigContentLike(DeploymentConfig item);
    public A withOAuthAccessTokenContent(OAuthAccessToken oAuthAccessTokenContent);
    public SubjectAccessReviewFluent.OAuthAccessTokenContentNested<A> withNewOAuthAccessTokenContent();
    public SubjectAccessReviewFluent.OAuthAccessTokenContentNested<A> withNewOAuthAccessTokenContentLike(OAuthAccessToken item);
    public A withPersistentVolumeContent(PersistentVolume persistentVolumeContent);
    public SubjectAccessReviewFluent.PersistentVolumeContentNested<A> withNewPersistentVolumeContent();
    public SubjectAccessReviewFluent.PersistentVolumeContentNested<A> withNewPersistentVolumeContentLike(PersistentVolume item);
    public A withPersistentVolumeClaimContent(PersistentVolumeClaim persistentVolumeClaimContent);
    public SubjectAccessReviewFluent.PersistentVolumeClaimContentNested<A> withNewPersistentVolumeClaimContent();
    public SubjectAccessReviewFluent.PersistentVolumeClaimContentNested<A> withNewPersistentVolumeClaimContentLike(PersistentVolumeClaim item);
    public A withEventContent(io.fabric8.kubernetes.api.model.events.Event eventContent);
    public SubjectAccessReviewFluent.EventsEventContentNested<A> withNewEventsEventContent();
    public SubjectAccessReviewFluent.EventsEventContentNested<A> withNewEventContentLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withStatefulSetContent(StatefulSet statefulSetContent);
    public SubjectAccessReviewFluent.StatefulSetContentNested<A> withNewStatefulSetContent();
    public SubjectAccessReviewFluent.StatefulSetContentNested<A> withNewStatefulSetContentLike(StatefulSet item);
    public A withOpenshiftClusterRoleContent(OpenshiftClusterRole openshiftClusterRoleContent);
    public SubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<A> withNewOpenshiftClusterRoleContent();
    public SubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<A> withNewOpenshiftClusterRoleContentLike(OpenshiftClusterRole item);
    public A withRoleContent(Role roleContent);
    public SubjectAccessReviewFluent.RoleContentNested<A> withNewRoleContent();
    public SubjectAccessReviewFluent.RoleContentNested<A> withNewRoleContentLike(Role item);
    public A withUserContent(User userContent);
    public SubjectAccessReviewFluent.UserContentNested<A> withNewUserContent();
    public SubjectAccessReviewFluent.UserContentNested<A> withNewUserContentLike(User item);
    public A withComponentStatusContent(ComponentStatus componentStatusContent);
    public SubjectAccessReviewFluent.ComponentStatusContentNested<A> withNewComponentStatusContent();
    public SubjectAccessReviewFluent.ComponentStatusContentNested<A> withNewComponentStatusContentLike(ComponentStatus item);
    public A withTokenReviewContent(TokenReview tokenReviewContent);
    public SubjectAccessReviewFluent.TokenReviewContentNested<A> withNewTokenReviewContent();
    public SubjectAccessReviewFluent.TokenReviewContentNested<A> withNewTokenReviewContentLike(TokenReview item);
    public A withBindingContent(Binding bindingContent);
    public SubjectAccessReviewFluent.BindingContentNested<A> withNewBindingContent();
    public SubjectAccessReviewFluent.BindingContentNested<A> withNewBindingContentLike(Binding item);
    public A withSecretContent(Secret secretContent);
    public SubjectAccessReviewFluent.SecretContentNested<A> withNewSecretContent();
    public SubjectAccessReviewFluent.SecretContentNested<A> withNewSecretContentLike(Secret item);
    public A withSecurityContextConstraintsContent(SecurityContextConstraints securityContextConstraintsContent);
    public SubjectAccessReviewFluent.SecurityContextConstraintsContentNested<A> withNewSecurityContextConstraintsContent();
    public SubjectAccessReviewFluent.SecurityContextConstraintsContentNested<A> withNewSecurityContextConstraintsContentLike(SecurityContextConstraints item);
    public A withNetNamespaceContent(NetNamespace netNamespaceContent);
    public SubjectAccessReviewFluent.NetNamespaceContentNested<A> withNewNetNamespaceContent();
    public SubjectAccessReviewFluent.NetNamespaceContentNested<A> withNewNetNamespaceContentLike(NetNamespace item);
    public A withNodeContent(Node nodeContent);
    public SubjectAccessReviewFluent.NodeContentNested<A> withNewNodeContent();
    public SubjectAccessReviewFluent.NodeContentNested<A> withNewNodeContentLike(Node item);
    public A withJobContent(Job jobContent);
    public SubjectAccessReviewFluent.JobContentNested<A> withNewJobContent();
    public SubjectAccessReviewFluent.JobContentNested<A> withNewJobContentLike(Job item);
    public A withCertificateSigningRequestContent(CertificateSigningRequest certificateSigningRequestContent);
    public SubjectAccessReviewFluent.CertificateSigningRequestContentNested<A> withNewCertificateSigningRequestContent();
    public SubjectAccessReviewFluent.CertificateSigningRequestContentNested<A> withNewCertificateSigningRequestContentLike(CertificateSigningRequest item);
    public A withServiceAccountContent(ServiceAccount serviceAccountContent);
    public SubjectAccessReviewFluent.ServiceAccountContentNested<A> withNewServiceAccountContent();
    public SubjectAccessReviewFluent.ServiceAccountContentNested<A> withNewServiceAccountContentLike(ServiceAccount item);
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

    public interface ValidatingWebhookConfigurationContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<SubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationContent();
}
    public interface StorageClassContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<SubjectAccessReviewFluent.StorageClassContentNested<N>>{

        
    public N and();    public N endStorageClassContent();
}
    public interface ClusterRoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<SubjectAccessReviewFluent.ClusterRoleBindingContentNested<N>>{

        
    public N and();    public N endClusterRoleBindingContent();
}
    public interface OpenshiftRoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<SubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingContent();
}
    public interface PodDisruptionBudgetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<SubjectAccessReviewFluent.PodDisruptionBudgetContentNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetContent();
}
    public interface NetworkPolicyContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<SubjectAccessReviewFluent.NetworkPolicyContentNested<N>>{

        
    public N and();    public N endNetworkPolicyContent();
}
    public interface OpenshiftClusterRoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<SubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingContent();
}
    public interface RouteContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<SubjectAccessReviewFluent.RouteContentNested<N>>{

        
    public N and();    public N endRouteContent();
}
    public interface NamespaceContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<SubjectAccessReviewFluent.NamespaceContentNested<N>>{

        
    public N and();    public N endNamespaceContent();
}
    public interface LocalSubjectAccessReviewContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<SubjectAccessReviewFluent.LocalSubjectAccessReviewContentNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewContent();
}
    public interface ServiceContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<SubjectAccessReviewFluent.ServiceContentNested<N>>{

        
    public N and();    public N endServiceContent();
}
    public interface ReplicationControllerContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<SubjectAccessReviewFluent.ReplicationControllerContentNested<N>>{

        
    public N and();    public N endReplicationControllerContent();
}
    public interface MutatingWebhookConfigurationContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<SubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationContent();
}
    public interface HorizontalPodAutoscalerContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<SubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerContent();
}
    public interface ScaleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<SubjectAccessReviewFluent.ScaleContentNested<N>>{

        
    public N and();    public N endScaleContent();
}
    public interface ImageContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<SubjectAccessReviewFluent.ImageContentNested<N>>{

        
    public N and();    public N endImageContent();
}
    public interface ReplicaSetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<SubjectAccessReviewFluent.ReplicaSetContentNested<N>>{

        
    public N and();    public N endReplicaSetContent();
}
    public interface PodSecurityPolicyContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<SubjectAccessReviewFluent.PodSecurityPolicyContentNested<N>>{

        
    public N and();    public N endPodSecurityPolicyContent();
}
    public interface CronJobContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<SubjectAccessReviewFluent.CronJobContentNested<N>>{

        
    public N and();    public N endCronJobContent();
}
    public interface EndpointsContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<SubjectAccessReviewFluent.EndpointsContentNested<N>>{

        
    public N and();    public N endEndpointsContent();
}
    public interface PodContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<SubjectAccessReviewFluent.PodContentNested<N>>{

        
    public N and();    public N endPodContent();
}
    public interface ConfigMapContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<SubjectAccessReviewFluent.ConfigMapContentNested<N>>{

        
    public N and();    public N endConfigMapContent();
}
    public interface CustomResourceDefinitionContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<SubjectAccessReviewFluent.CustomResourceDefinitionContentNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionContent();
}
    public interface BuildContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<SubjectAccessReviewFluent.BuildContentNested<N>>{

        
    public N and();    public N endBuildContent();
}
    public interface ImageStreamTagContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<SubjectAccessReviewFluent.ImageStreamTagContentNested<N>>{

        
    public N and();    public N endImageStreamTagContent();
}
    public interface GroupContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<SubjectAccessReviewFluent.GroupContentNested<N>>{

        
    public N and();    public N endGroupContent();
}
    public interface ImageSignatureContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<SubjectAccessReviewFluent.ImageSignatureContentNested<N>>{

        
    public N and();    public N endImageSignatureContent();
}
    public interface ResourceQuotaContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<SubjectAccessReviewFluent.ResourceQuotaContentNested<N>>{

        
    public N and();    public N endResourceQuotaContent();
}
    public interface BuildRequestContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<SubjectAccessReviewFluent.BuildRequestContentNested<N>>{

        
    public N and();    public N endBuildRequestContent();
}
    public interface DaemonSetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<SubjectAccessReviewFluent.DaemonSetContentNested<N>>{

        
    public N and();    public N endDaemonSetContent();
}
    public interface ImageStreamContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<SubjectAccessReviewFluent.ImageStreamContentNested<N>>{

        
    public N and();    public N endImageStreamContent();
}
    public interface OpenshiftRoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<SubjectAccessReviewFluent.OpenshiftRoleContentNested<N>>{

        
    public N and();    public N endOpenshiftRoleContent();
}
    public interface OAuthClientContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<SubjectAccessReviewFluent.OAuthClientContentNested<N>>{

        
    public N and();    public N endOAuthClientContent();
}
    public interface IdentityContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<SubjectAccessReviewFluent.IdentityContentNested<N>>{

        
    public N and();    public N endIdentityContent();
}
    public interface LimitRangeContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<SubjectAccessReviewFluent.LimitRangeContentNested<N>>{

        
    public N and();    public N endLimitRangeContent();
}
    public interface ImageStreamImportContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<SubjectAccessReviewFluent.ImageStreamImportContentNested<N>>{

        
    public N and();    public N endImageStreamImportContent();
}
    public interface OpenshiftRoleBindingRestrictionContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<SubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionContent();
}
    public interface RoleBindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<SubjectAccessReviewFluent.RoleBindingContentNested<N>>{

        
    public N and();    public N endRoleBindingContent();
}
    public interface PodPresetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<SubjectAccessReviewFluent.PodPresetContentNested<N>>{

        
    public N and();    public N endPodPresetContent();
}
    public interface ProjectContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<SubjectAccessReviewFluent.ProjectContentNested<N>>{

        
    public N and();    public N endProjectContent();
}
    public interface BuildConfigContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<SubjectAccessReviewFluent.BuildConfigContentNested<N>>{

        
    public N and();    public N endBuildConfigContent();
}
    public interface ClusterRoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<SubjectAccessReviewFluent.ClusterRoleContentNested<N>>{

        
    public N and();    public N endClusterRoleContent();
}
    public interface OAuthAuthorizeTokenContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<SubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenContent();
}
    public interface ProjectRequestContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<SubjectAccessReviewFluent.ProjectRequestContentNested<N>>{

        
    public N and();    public N endProjectRequestContent();
}
    public interface PriorityClassContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<SubjectAccessReviewFluent.PriorityClassContentNested<N>>{

        
    public N and();    public N endPriorityClassContent();
}
    public interface TemplateContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<SubjectAccessReviewFluent.TemplateContentNested<N>>{

        
    public N and();    public N endTemplateContent();
}
    public interface OAuthClientAuthorizationContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<SubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationContent();
}
    public interface DeploymentContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<SubjectAccessReviewFluent.DeploymentContentNested<N>>{

        
    public N and();    public N endDeploymentContent();
}
    public interface PodTemplateContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<SubjectAccessReviewFluent.PodTemplateContentNested<N>>{

        
    public N and();    public N endPodTemplateContent();
}
    public interface EventContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<SubjectAccessReviewFluent.EventContentNested<N>>{

        
    public N and();    public N endEventContent();
}
    public interface IngressContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<SubjectAccessReviewFluent.IngressContentNested<N>>{

        
    public N and();    public N endIngressContent();
}
    public interface DeploymentConfigContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<SubjectAccessReviewFluent.DeploymentConfigContentNested<N>>{

        
    public N and();    public N endDeploymentConfigContent();
}
    public interface OAuthAccessTokenContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<SubjectAccessReviewFluent.OAuthAccessTokenContentNested<N>>{

        
    public N and();    public N endOAuthAccessTokenContent();
}
    public interface PersistentVolumeContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<SubjectAccessReviewFluent.PersistentVolumeContentNested<N>>{

        
    public N and();    public N endPersistentVolumeContent();
}
    public interface PersistentVolumeClaimContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<SubjectAccessReviewFluent.PersistentVolumeClaimContentNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimContent();
}
    public interface EventsEventContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<SubjectAccessReviewFluent.EventsEventContentNested<N>>{

        
    public N and();    public N endEventsEventContent();
}
    public interface StatefulSetContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<SubjectAccessReviewFluent.StatefulSetContentNested<N>>{

        
    public N and();    public N endStatefulSetContent();
}
    public interface OpenshiftClusterRoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<SubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleContent();
}
    public interface RoleContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<SubjectAccessReviewFluent.RoleContentNested<N>>{

        
    public N and();    public N endRoleContent();
}
    public interface UserContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<SubjectAccessReviewFluent.UserContentNested<N>>{

        
    public N and();    public N endUserContent();
}
    public interface ComponentStatusContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<SubjectAccessReviewFluent.ComponentStatusContentNested<N>>{

        
    public N and();    public N endComponentStatusContent();
}
    public interface TokenReviewContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<SubjectAccessReviewFluent.TokenReviewContentNested<N>>{

        
    public N and();    public N endTokenReviewContent();
}
    public interface BindingContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<SubjectAccessReviewFluent.BindingContentNested<N>>{

        
    public N and();    public N endBindingContent();
}
    public interface SecretContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<SubjectAccessReviewFluent.SecretContentNested<N>>{

        
    public N and();    public N endSecretContent();
}
    public interface SecurityContextConstraintsContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<SubjectAccessReviewFluent.SecurityContextConstraintsContentNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsContent();
}
    public interface NetNamespaceContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<SubjectAccessReviewFluent.NetNamespaceContentNested<N>>{

        
    public N and();    public N endNetNamespaceContent();
}
    public interface NodeContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<SubjectAccessReviewFluent.NodeContentNested<N>>{

        
    public N and();    public N endNodeContent();
}
    public interface JobContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<SubjectAccessReviewFluent.JobContentNested<N>>{

        
    public N and();    public N endJobContent();
}
    public interface CertificateSigningRequestContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<SubjectAccessReviewFluent.CertificateSigningRequestContentNested<N>>{

        
    public N and();    public N endCertificateSigningRequestContent();
}
    public interface ServiceAccountContentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<SubjectAccessReviewFluent.ServiceAccountContentNested<N>>{

        
    public N and();    public N endServiceAccountContent();
}


}
