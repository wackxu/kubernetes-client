package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import java.lang.String;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluent;
import io.fabric8.openshift.api.model.IdentityFluent;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagFluent;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.batch.JobFluent;
import io.fabric8.openshift.api.model.BuildRequestFluent;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluent;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluent;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.openshift.api.model.ImageStreamImportFluent;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluent;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluent;
import io.fabric8.openshift.api.model.ImageSignatureBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluent;
import io.fabric8.openshift.api.model.ProjectRequestFluent;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluent;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluent;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluent;
import io.fabric8.openshift.api.model.OAuthClientFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluent;
import io.fabric8.openshift.api.model.ProjectFluent;
import io.fabric8.openshift.api.model.ImageBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluent;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.openshift.api.model.UserFluent;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.openshift.api.model.DeploymentConfigFluent;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluent;
import io.fabric8.openshift.api.model.Image;
import io.fabric8.openshift.api.model.ImageStreamBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluent;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.openshift.api.model.Identity;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.openshift.api.model.OpenshiftRoleFluent;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.openshift.api.model.BuildFluent;
import io.fabric8.openshift.api.model.BuildConfigFluent;
import io.fabric8.openshift.api.model.BuildBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.openshift.api.model.ProjectRequest;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.openshift.api.model.ImageFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.openshift.api.model.GroupFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluent;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobFluent;
import io.fabric8.openshift.api.model.ImageSignature;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluent;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.openshift.api.model.RouteFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressFluent;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.openshift.api.model.BuildConfigBuilder;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.NetNamespaceFluent;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.openshift.api.model.ImageSignatureFluent;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluent;
import io.fabric8.openshift.api.model.TemplateFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.openshift.api.model.ImageStreamFluent;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

public interface NamedExtensionFluent<A extends NamedExtensionFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildExtension instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getExtension();
    public HasMetadata buildExtension();
    public A withExtension(HasMetadata extension);
    public Boolean hasExtension();
    public A withValidatingWebhookConfigurationExtension(ValidatingWebhookConfiguration validatingWebhookConfigurationExtension);
    public NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<A> withNewValidatingWebhookConfigurationExtension();
    public NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<A> withNewValidatingWebhookConfigurationExtensionLike(ValidatingWebhookConfiguration item);
    public A withStorageClassExtension(StorageClass storageClassExtension);
    public NamedExtensionFluent.StorageClassExtensionNested<A> withNewStorageClassExtension();
    public NamedExtensionFluent.StorageClassExtensionNested<A> withNewStorageClassExtensionLike(StorageClass item);
    public A withClusterRoleBindingExtension(ClusterRoleBinding clusterRoleBindingExtension);
    public NamedExtensionFluent.ClusterRoleBindingExtensionNested<A> withNewClusterRoleBindingExtension();
    public NamedExtensionFluent.ClusterRoleBindingExtensionNested<A> withNewClusterRoleBindingExtensionLike(ClusterRoleBinding item);
    public A withOpenshiftRoleBindingExtension(OpenshiftRoleBinding openshiftRoleBindingExtension);
    public NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<A> withNewOpenshiftRoleBindingExtension();
    public NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<A> withNewOpenshiftRoleBindingExtensionLike(OpenshiftRoleBinding item);
    public A withPodDisruptionBudgetExtension(PodDisruptionBudget podDisruptionBudgetExtension);
    public NamedExtensionFluent.PodDisruptionBudgetExtensionNested<A> withNewPodDisruptionBudgetExtension();
    public NamedExtensionFluent.PodDisruptionBudgetExtensionNested<A> withNewPodDisruptionBudgetExtensionLike(PodDisruptionBudget item);
    public A withNetworkPolicyExtension(NetworkPolicy networkPolicyExtension);
    public NamedExtensionFluent.NetworkPolicyExtensionNested<A> withNewNetworkPolicyExtension();
    public NamedExtensionFluent.NetworkPolicyExtensionNested<A> withNewNetworkPolicyExtensionLike(NetworkPolicy item);
    public A withOpenshiftClusterRoleBindingExtension(OpenshiftClusterRoleBinding openshiftClusterRoleBindingExtension);
    public NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<A> withNewOpenshiftClusterRoleBindingExtension();
    public NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<A> withNewOpenshiftClusterRoleBindingExtensionLike(OpenshiftClusterRoleBinding item);
    public A withRouteExtension(Route routeExtension);
    public NamedExtensionFluent.RouteExtensionNested<A> withNewRouteExtension();
    public NamedExtensionFluent.RouteExtensionNested<A> withNewRouteExtensionLike(Route item);
    public A withNamespaceExtension(Namespace namespaceExtension);
    public NamedExtensionFluent.NamespaceExtensionNested<A> withNewNamespaceExtension();
    public NamedExtensionFluent.NamespaceExtensionNested<A> withNewNamespaceExtensionLike(Namespace item);
    public A withLocalSubjectAccessReviewExtension(LocalSubjectAccessReview localSubjectAccessReviewExtension);
    public NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<A> withNewLocalSubjectAccessReviewExtension();
    public NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<A> withNewLocalSubjectAccessReviewExtensionLike(LocalSubjectAccessReview item);
    public A withServiceExtension(Service serviceExtension);
    public NamedExtensionFluent.ServiceExtensionNested<A> withNewServiceExtension();
    public NamedExtensionFluent.ServiceExtensionNested<A> withNewServiceExtensionLike(Service item);
    public A withReplicationControllerExtension(ReplicationController replicationControllerExtension);
    public NamedExtensionFluent.ReplicationControllerExtensionNested<A> withNewReplicationControllerExtension();
    public NamedExtensionFluent.ReplicationControllerExtensionNested<A> withNewReplicationControllerExtensionLike(ReplicationController item);
    public A withSubjectAccessReviewExtension(SubjectAccessReview subjectAccessReviewExtension);
    public NamedExtensionFluent.SubjectAccessReviewExtensionNested<A> withNewSubjectAccessReviewExtension();
    public NamedExtensionFluent.SubjectAccessReviewExtensionNested<A> withNewSubjectAccessReviewExtensionLike(SubjectAccessReview item);
    public A withMutatingWebhookConfigurationExtension(MutatingWebhookConfiguration mutatingWebhookConfigurationExtension);
    public NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<A> withNewMutatingWebhookConfigurationExtension();
    public NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<A> withNewMutatingWebhookConfigurationExtensionLike(MutatingWebhookConfiguration item);
    public A withHorizontalPodAutoscalerExtension(HorizontalPodAutoscaler horizontalPodAutoscalerExtension);
    public NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<A> withNewHorizontalPodAutoscalerExtension();
    public NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<A> withNewHorizontalPodAutoscalerExtensionLike(HorizontalPodAutoscaler item);
    public A withScaleExtension(Scale scaleExtension);
    public NamedExtensionFluent.ScaleExtensionNested<A> withNewScaleExtension();
    public NamedExtensionFluent.ScaleExtensionNested<A> withNewScaleExtensionLike(Scale item);
    public A withImageExtension(Image imageExtension);
    public NamedExtensionFluent.ImageExtensionNested<A> withNewImageExtension();
    public NamedExtensionFluent.ImageExtensionNested<A> withNewImageExtensionLike(Image item);
    public A withReplicaSetExtension(ReplicaSet replicaSetExtension);
    public NamedExtensionFluent.ReplicaSetExtensionNested<A> withNewReplicaSetExtension();
    public NamedExtensionFluent.ReplicaSetExtensionNested<A> withNewReplicaSetExtensionLike(ReplicaSet item);
    public A withPodSecurityPolicyExtension(PodSecurityPolicy podSecurityPolicyExtension);
    public NamedExtensionFluent.PodSecurityPolicyExtensionNested<A> withNewPodSecurityPolicyExtension();
    public NamedExtensionFluent.PodSecurityPolicyExtensionNested<A> withNewPodSecurityPolicyExtensionLike(PodSecurityPolicy item);
    public A withCronJobExtension(CronJob cronJobExtension);
    public NamedExtensionFluent.CronJobExtensionNested<A> withNewCronJobExtension();
    public NamedExtensionFluent.CronJobExtensionNested<A> withNewCronJobExtensionLike(CronJob item);
    public A withEndpointsExtension(Endpoints endpointsExtension);
    public NamedExtensionFluent.EndpointsExtensionNested<A> withNewEndpointsExtension();
    public NamedExtensionFluent.EndpointsExtensionNested<A> withNewEndpointsExtensionLike(Endpoints item);
    public A withPodExtension(Pod podExtension);
    public NamedExtensionFluent.PodExtensionNested<A> withNewPodExtension();
    public NamedExtensionFluent.PodExtensionNested<A> withNewPodExtensionLike(Pod item);
    public A withConfigMapExtension(ConfigMap configMapExtension);
    public NamedExtensionFluent.ConfigMapExtensionNested<A> withNewConfigMapExtension();
    public NamedExtensionFluent.ConfigMapExtensionNested<A> withNewConfigMapExtensionLike(ConfigMap item);
    public A withCustomResourceDefinitionExtension(CustomResourceDefinition customResourceDefinitionExtension);
    public NamedExtensionFluent.CustomResourceDefinitionExtensionNested<A> withNewCustomResourceDefinitionExtension();
    public NamedExtensionFluent.CustomResourceDefinitionExtensionNested<A> withNewCustomResourceDefinitionExtensionLike(CustomResourceDefinition item);
    public A withBuildExtension(Build buildExtension);
    public NamedExtensionFluent.BuildExtensionNested<A> withNewBuildExtension();
    public NamedExtensionFluent.BuildExtensionNested<A> withNewBuildExtensionLike(Build item);
    public A withImageStreamTagExtension(ImageStreamTag imageStreamTagExtension);
    public NamedExtensionFluent.ImageStreamTagExtensionNested<A> withNewImageStreamTagExtension();
    public NamedExtensionFluent.ImageStreamTagExtensionNested<A> withNewImageStreamTagExtensionLike(ImageStreamTag item);
    public A withGroupExtension(Group groupExtension);
    public NamedExtensionFluent.GroupExtensionNested<A> withNewGroupExtension();
    public NamedExtensionFluent.GroupExtensionNested<A> withNewGroupExtensionLike(Group item);
    public A withImageSignatureExtension(ImageSignature imageSignatureExtension);
    public NamedExtensionFluent.ImageSignatureExtensionNested<A> withNewImageSignatureExtension();
    public NamedExtensionFluent.ImageSignatureExtensionNested<A> withNewImageSignatureExtensionLike(ImageSignature item);
    public A withResourceQuotaExtension(ResourceQuota resourceQuotaExtension);
    public NamedExtensionFluent.ResourceQuotaExtensionNested<A> withNewResourceQuotaExtension();
    public NamedExtensionFluent.ResourceQuotaExtensionNested<A> withNewResourceQuotaExtensionLike(ResourceQuota item);
    public A withBuildRequestExtension(BuildRequest buildRequestExtension);
    public NamedExtensionFluent.BuildRequestExtensionNested<A> withNewBuildRequestExtension();
    public NamedExtensionFluent.BuildRequestExtensionNested<A> withNewBuildRequestExtensionLike(BuildRequest item);
    public A withDaemonSetExtension(DaemonSet daemonSetExtension);
    public NamedExtensionFluent.DaemonSetExtensionNested<A> withNewDaemonSetExtension();
    public NamedExtensionFluent.DaemonSetExtensionNested<A> withNewDaemonSetExtensionLike(DaemonSet item);
    public A withImageStreamExtension(ImageStream imageStreamExtension);
    public NamedExtensionFluent.ImageStreamExtensionNested<A> withNewImageStreamExtension();
    public NamedExtensionFluent.ImageStreamExtensionNested<A> withNewImageStreamExtensionLike(ImageStream item);
    public A withOpenshiftRoleExtension(OpenshiftRole openshiftRoleExtension);
    public NamedExtensionFluent.OpenshiftRoleExtensionNested<A> withNewOpenshiftRoleExtension();
    public NamedExtensionFluent.OpenshiftRoleExtensionNested<A> withNewOpenshiftRoleExtensionLike(OpenshiftRole item);
    public A withOAuthClientExtension(OAuthClient oAuthClientExtension);
    public NamedExtensionFluent.OAuthClientExtensionNested<A> withNewOAuthClientExtension();
    public NamedExtensionFluent.OAuthClientExtensionNested<A> withNewOAuthClientExtensionLike(OAuthClient item);
    public A withIdentityExtension(Identity identityExtension);
    public NamedExtensionFluent.IdentityExtensionNested<A> withNewIdentityExtension();
    public NamedExtensionFluent.IdentityExtensionNested<A> withNewIdentityExtensionLike(Identity item);
    public A withLimitRangeExtension(LimitRange limitRangeExtension);
    public NamedExtensionFluent.LimitRangeExtensionNested<A> withNewLimitRangeExtension();
    public NamedExtensionFluent.LimitRangeExtensionNested<A> withNewLimitRangeExtensionLike(LimitRange item);
    public A withImageStreamImportExtension(ImageStreamImport imageStreamImportExtension);
    public NamedExtensionFluent.ImageStreamImportExtensionNested<A> withNewImageStreamImportExtension();
    public NamedExtensionFluent.ImageStreamImportExtensionNested<A> withNewImageStreamImportExtensionLike(ImageStreamImport item);
    public A withOpenshiftRoleBindingRestrictionExtension(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionExtension);
    public NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<A> withNewOpenshiftRoleBindingRestrictionExtension();
    public NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<A> withNewOpenshiftRoleBindingRestrictionExtensionLike(OpenshiftRoleBindingRestriction item);
    public A withRoleBindingExtension(RoleBinding roleBindingExtension);
    public NamedExtensionFluent.RoleBindingExtensionNested<A> withNewRoleBindingExtension();
    public NamedExtensionFluent.RoleBindingExtensionNested<A> withNewRoleBindingExtensionLike(RoleBinding item);
    public A withPodPresetExtension(PodPreset podPresetExtension);
    public NamedExtensionFluent.PodPresetExtensionNested<A> withNewPodPresetExtension();
    public NamedExtensionFluent.PodPresetExtensionNested<A> withNewPodPresetExtensionLike(PodPreset item);
    public A withProjectExtension(Project projectExtension);
    public NamedExtensionFluent.ProjectExtensionNested<A> withNewProjectExtension();
    public NamedExtensionFluent.ProjectExtensionNested<A> withNewProjectExtensionLike(Project item);
    public A withBuildConfigExtension(BuildConfig buildConfigExtension);
    public NamedExtensionFluent.BuildConfigExtensionNested<A> withNewBuildConfigExtension();
    public NamedExtensionFluent.BuildConfigExtensionNested<A> withNewBuildConfigExtensionLike(BuildConfig item);
    public A withClusterRoleExtension(ClusterRole clusterRoleExtension);
    public NamedExtensionFluent.ClusterRoleExtensionNested<A> withNewClusterRoleExtension();
    public NamedExtensionFluent.ClusterRoleExtensionNested<A> withNewClusterRoleExtensionLike(ClusterRole item);
    public A withOAuthAuthorizeTokenExtension(OAuthAuthorizeToken oAuthAuthorizeTokenExtension);
    public NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<A> withNewOAuthAuthorizeTokenExtension();
    public NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<A> withNewOAuthAuthorizeTokenExtensionLike(OAuthAuthorizeToken item);
    public A withProjectRequestExtension(ProjectRequest projectRequestExtension);
    public NamedExtensionFluent.ProjectRequestExtensionNested<A> withNewProjectRequestExtension();
    public NamedExtensionFluent.ProjectRequestExtensionNested<A> withNewProjectRequestExtensionLike(ProjectRequest item);
    public A withPriorityClassExtension(PriorityClass priorityClassExtension);
    public NamedExtensionFluent.PriorityClassExtensionNested<A> withNewPriorityClassExtension();
    public NamedExtensionFluent.PriorityClassExtensionNested<A> withNewPriorityClassExtensionLike(PriorityClass item);
    public A withTemplateExtension(Template templateExtension);
    public NamedExtensionFluent.TemplateExtensionNested<A> withNewTemplateExtension();
    public NamedExtensionFluent.TemplateExtensionNested<A> withNewTemplateExtensionLike(Template item);
    public A withOAuthClientAuthorizationExtension(OAuthClientAuthorization oAuthClientAuthorizationExtension);
    public NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<A> withNewOAuthClientAuthorizationExtension();
    public NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<A> withNewOAuthClientAuthorizationExtensionLike(OAuthClientAuthorization item);
    public A withDeploymentExtension(Deployment deploymentExtension);
    public NamedExtensionFluent.DeploymentExtensionNested<A> withNewDeploymentExtension();
    public NamedExtensionFluent.DeploymentExtensionNested<A> withNewDeploymentExtensionLike(Deployment item);
    public A withPodTemplateExtension(PodTemplate podTemplateExtension);
    public NamedExtensionFluent.PodTemplateExtensionNested<A> withNewPodTemplateExtension();
    public NamedExtensionFluent.PodTemplateExtensionNested<A> withNewPodTemplateExtensionLike(PodTemplate item);
    public A withEventExtension(Event eventExtension);
    public NamedExtensionFluent.EventExtensionNested<A> withNewEventExtension();
    public NamedExtensionFluent.EventExtensionNested<A> withNewEventExtensionLike(Event item);
    public A withIngressExtension(Ingress ingressExtension);
    public NamedExtensionFluent.IngressExtensionNested<A> withNewIngressExtension();
    public NamedExtensionFluent.IngressExtensionNested<A> withNewIngressExtensionLike(Ingress item);
    public A withDeploymentConfigExtension(DeploymentConfig deploymentConfigExtension);
    public NamedExtensionFluent.DeploymentConfigExtensionNested<A> withNewDeploymentConfigExtension();
    public NamedExtensionFluent.DeploymentConfigExtensionNested<A> withNewDeploymentConfigExtensionLike(DeploymentConfig item);
    public A withOAuthAccessTokenExtension(OAuthAccessToken oAuthAccessTokenExtension);
    public NamedExtensionFluent.OAuthAccessTokenExtensionNested<A> withNewOAuthAccessTokenExtension();
    public NamedExtensionFluent.OAuthAccessTokenExtensionNested<A> withNewOAuthAccessTokenExtensionLike(OAuthAccessToken item);
    public A withPersistentVolumeExtension(PersistentVolume persistentVolumeExtension);
    public NamedExtensionFluent.PersistentVolumeExtensionNested<A> withNewPersistentVolumeExtension();
    public NamedExtensionFluent.PersistentVolumeExtensionNested<A> withNewPersistentVolumeExtensionLike(PersistentVolume item);
    public A withPersistentVolumeClaimExtension(PersistentVolumeClaim persistentVolumeClaimExtension);
    public NamedExtensionFluent.PersistentVolumeClaimExtensionNested<A> withNewPersistentVolumeClaimExtension();
    public NamedExtensionFluent.PersistentVolumeClaimExtensionNested<A> withNewPersistentVolumeClaimExtensionLike(PersistentVolumeClaim item);
    public A withEventExtension(io.fabric8.kubernetes.api.model.events.Event eventExtension);
    public NamedExtensionFluent.EventsEventExtensionNested<A> withNewEventsEventExtension();
    public NamedExtensionFluent.EventsEventExtensionNested<A> withNewEventExtensionLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withStatefulSetExtension(StatefulSet statefulSetExtension);
    public NamedExtensionFluent.StatefulSetExtensionNested<A> withNewStatefulSetExtension();
    public NamedExtensionFluent.StatefulSetExtensionNested<A> withNewStatefulSetExtensionLike(StatefulSet item);
    public A withOpenshiftClusterRoleExtension(OpenshiftClusterRole openshiftClusterRoleExtension);
    public NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<A> withNewOpenshiftClusterRoleExtension();
    public NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<A> withNewOpenshiftClusterRoleExtensionLike(OpenshiftClusterRole item);
    public A withRoleExtension(Role roleExtension);
    public NamedExtensionFluent.RoleExtensionNested<A> withNewRoleExtension();
    public NamedExtensionFluent.RoleExtensionNested<A> withNewRoleExtensionLike(Role item);
    public A withUserExtension(User userExtension);
    public NamedExtensionFluent.UserExtensionNested<A> withNewUserExtension();
    public NamedExtensionFluent.UserExtensionNested<A> withNewUserExtensionLike(User item);
    public A withComponentStatusExtension(ComponentStatus componentStatusExtension);
    public NamedExtensionFluent.ComponentStatusExtensionNested<A> withNewComponentStatusExtension();
    public NamedExtensionFluent.ComponentStatusExtensionNested<A> withNewComponentStatusExtensionLike(ComponentStatus item);
    public A withTokenReviewExtension(TokenReview tokenReviewExtension);
    public NamedExtensionFluent.TokenReviewExtensionNested<A> withNewTokenReviewExtension();
    public NamedExtensionFluent.TokenReviewExtensionNested<A> withNewTokenReviewExtensionLike(TokenReview item);
    public A withBindingExtension(Binding bindingExtension);
    public NamedExtensionFluent.BindingExtensionNested<A> withNewBindingExtension();
    public NamedExtensionFluent.BindingExtensionNested<A> withNewBindingExtensionLike(Binding item);
    public A withSecretExtension(Secret secretExtension);
    public NamedExtensionFluent.SecretExtensionNested<A> withNewSecretExtension();
    public NamedExtensionFluent.SecretExtensionNested<A> withNewSecretExtensionLike(Secret item);
    public A withSecurityContextConstraintsExtension(SecurityContextConstraints securityContextConstraintsExtension);
    public NamedExtensionFluent.SecurityContextConstraintsExtensionNested<A> withNewSecurityContextConstraintsExtension();
    public NamedExtensionFluent.SecurityContextConstraintsExtensionNested<A> withNewSecurityContextConstraintsExtensionLike(SecurityContextConstraints item);
    public A withNetNamespaceExtension(NetNamespace netNamespaceExtension);
    public NamedExtensionFluent.NetNamespaceExtensionNested<A> withNewNetNamespaceExtension();
    public NamedExtensionFluent.NetNamespaceExtensionNested<A> withNewNetNamespaceExtensionLike(NetNamespace item);
    public A withNodeExtension(Node nodeExtension);
    public NamedExtensionFluent.NodeExtensionNested<A> withNewNodeExtension();
    public NamedExtensionFluent.NodeExtensionNested<A> withNewNodeExtensionLike(Node item);
    public A withJobExtension(Job jobExtension);
    public NamedExtensionFluent.JobExtensionNested<A> withNewJobExtension();
    public NamedExtensionFluent.JobExtensionNested<A> withNewJobExtensionLike(Job item);
    public A withCertificateSigningRequestExtension(CertificateSigningRequest certificateSigningRequestExtension);
    public NamedExtensionFluent.CertificateSigningRequestExtensionNested<A> withNewCertificateSigningRequestExtension();
    public NamedExtensionFluent.CertificateSigningRequestExtensionNested<A> withNewCertificateSigningRequestExtensionLike(CertificateSigningRequest item);
    public A withServiceAccountExtension(ServiceAccount serviceAccountExtension);
    public NamedExtensionFluent.ServiceAccountExtensionNested<A> withNewServiceAccountExtension();
    public NamedExtensionFluent.ServiceAccountExtensionNested<A> withNewServiceAccountExtensionLike(ServiceAccount item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();

    public interface ValidatingWebhookConfigurationExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationExtension();
}
    public interface StorageClassExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<NamedExtensionFluent.StorageClassExtensionNested<N>>{

        
    public N and();    public N endStorageClassExtension();
}
    public interface ClusterRoleBindingExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<NamedExtensionFluent.ClusterRoleBindingExtensionNested<N>>{

        
    public N and();    public N endClusterRoleBindingExtension();
}
    public interface OpenshiftRoleBindingExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingExtension();
}
    public interface PodDisruptionBudgetExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<NamedExtensionFluent.PodDisruptionBudgetExtensionNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetExtension();
}
    public interface NetworkPolicyExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<NamedExtensionFluent.NetworkPolicyExtensionNested<N>>{

        
    public N and();    public N endNetworkPolicyExtension();
}
    public interface OpenshiftClusterRoleBindingExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingExtension();
}
    public interface RouteExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<NamedExtensionFluent.RouteExtensionNested<N>>{

        
    public N and();    public N endRouteExtension();
}
    public interface NamespaceExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<NamedExtensionFluent.NamespaceExtensionNested<N>>{

        
    public N and();    public N endNamespaceExtension();
}
    public interface LocalSubjectAccessReviewExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewExtension();
}
    public interface ServiceExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<NamedExtensionFluent.ServiceExtensionNested<N>>{

        
    public N and();    public N endServiceExtension();
}
    public interface ReplicationControllerExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<NamedExtensionFluent.ReplicationControllerExtensionNested<N>>{

        
    public N and();    public N endReplicationControllerExtension();
}
    public interface SubjectAccessReviewExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewFluent<NamedExtensionFluent.SubjectAccessReviewExtensionNested<N>>{

        
    public N and();    public N endSubjectAccessReviewExtension();
}
    public interface MutatingWebhookConfigurationExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationExtension();
}
    public interface HorizontalPodAutoscalerExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerExtension();
}
    public interface ScaleExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<NamedExtensionFluent.ScaleExtensionNested<N>>{

        
    public N and();    public N endScaleExtension();
}
    public interface ImageExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<NamedExtensionFluent.ImageExtensionNested<N>>{

        
    public N and();    public N endImageExtension();
}
    public interface ReplicaSetExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<NamedExtensionFluent.ReplicaSetExtensionNested<N>>{

        
    public N and();    public N endReplicaSetExtension();
}
    public interface PodSecurityPolicyExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<NamedExtensionFluent.PodSecurityPolicyExtensionNested<N>>{

        
    public N and();    public N endPodSecurityPolicyExtension();
}
    public interface CronJobExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<NamedExtensionFluent.CronJobExtensionNested<N>>{

        
    public N and();    public N endCronJobExtension();
}
    public interface EndpointsExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<NamedExtensionFluent.EndpointsExtensionNested<N>>{

        
    public N and();    public N endEndpointsExtension();
}
    public interface PodExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<NamedExtensionFluent.PodExtensionNested<N>>{

        
    public N and();    public N endPodExtension();
}
    public interface ConfigMapExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<NamedExtensionFluent.ConfigMapExtensionNested<N>>{

        
    public N and();    public N endConfigMapExtension();
}
    public interface CustomResourceDefinitionExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<NamedExtensionFluent.CustomResourceDefinitionExtensionNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionExtension();
}
    public interface BuildExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<NamedExtensionFluent.BuildExtensionNested<N>>{

        
    public N and();    public N endBuildExtension();
}
    public interface ImageStreamTagExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<NamedExtensionFluent.ImageStreamTagExtensionNested<N>>{

        
    public N and();    public N endImageStreamTagExtension();
}
    public interface GroupExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<NamedExtensionFluent.GroupExtensionNested<N>>{

        
    public N and();    public N endGroupExtension();
}
    public interface ImageSignatureExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<NamedExtensionFluent.ImageSignatureExtensionNested<N>>{

        
    public N and();    public N endImageSignatureExtension();
}
    public interface ResourceQuotaExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<NamedExtensionFluent.ResourceQuotaExtensionNested<N>>{

        
    public N and();    public N endResourceQuotaExtension();
}
    public interface BuildRequestExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<NamedExtensionFluent.BuildRequestExtensionNested<N>>{

        
    public N and();    public N endBuildRequestExtension();
}
    public interface DaemonSetExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<NamedExtensionFluent.DaemonSetExtensionNested<N>>{

        
    public N and();    public N endDaemonSetExtension();
}
    public interface ImageStreamExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<NamedExtensionFluent.ImageStreamExtensionNested<N>>{

        
    public N and();    public N endImageStreamExtension();
}
    public interface OpenshiftRoleExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<NamedExtensionFluent.OpenshiftRoleExtensionNested<N>>{

        
    public N and();    public N endOpenshiftRoleExtension();
}
    public interface OAuthClientExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<NamedExtensionFluent.OAuthClientExtensionNested<N>>{

        
    public N and();    public N endOAuthClientExtension();
}
    public interface IdentityExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<NamedExtensionFluent.IdentityExtensionNested<N>>{

        
    public N and();    public N endIdentityExtension();
}
    public interface LimitRangeExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<NamedExtensionFluent.LimitRangeExtensionNested<N>>{

        
    public N and();    public N endLimitRangeExtension();
}
    public interface ImageStreamImportExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<NamedExtensionFluent.ImageStreamImportExtensionNested<N>>{

        
    public N and();    public N endImageStreamImportExtension();
}
    public interface OpenshiftRoleBindingRestrictionExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionExtension();
}
    public interface RoleBindingExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<NamedExtensionFluent.RoleBindingExtensionNested<N>>{

        
    public N and();    public N endRoleBindingExtension();
}
    public interface PodPresetExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<NamedExtensionFluent.PodPresetExtensionNested<N>>{

        
    public N and();    public N endPodPresetExtension();
}
    public interface ProjectExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<NamedExtensionFluent.ProjectExtensionNested<N>>{

        
    public N and();    public N endProjectExtension();
}
    public interface BuildConfigExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<NamedExtensionFluent.BuildConfigExtensionNested<N>>{

        
    public N and();    public N endBuildConfigExtension();
}
    public interface ClusterRoleExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<NamedExtensionFluent.ClusterRoleExtensionNested<N>>{

        
    public N and();    public N endClusterRoleExtension();
}
    public interface OAuthAuthorizeTokenExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenExtension();
}
    public interface ProjectRequestExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<NamedExtensionFluent.ProjectRequestExtensionNested<N>>{

        
    public N and();    public N endProjectRequestExtension();
}
    public interface PriorityClassExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<NamedExtensionFluent.PriorityClassExtensionNested<N>>{

        
    public N and();    public N endPriorityClassExtension();
}
    public interface TemplateExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<NamedExtensionFluent.TemplateExtensionNested<N>>{

        
    public N and();    public N endTemplateExtension();
}
    public interface OAuthClientAuthorizationExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationExtension();
}
    public interface DeploymentExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<NamedExtensionFluent.DeploymentExtensionNested<N>>{

        
    public N and();    public N endDeploymentExtension();
}
    public interface PodTemplateExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<NamedExtensionFluent.PodTemplateExtensionNested<N>>{

        
    public N and();    public N endPodTemplateExtension();
}
    public interface EventExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<NamedExtensionFluent.EventExtensionNested<N>>{

        
    public N and();    public N endEventExtension();
}
    public interface IngressExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<NamedExtensionFluent.IngressExtensionNested<N>>{

        
    public N and();    public N endIngressExtension();
}
    public interface DeploymentConfigExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<NamedExtensionFluent.DeploymentConfigExtensionNested<N>>{

        
    public N and();    public N endDeploymentConfigExtension();
}
    public interface OAuthAccessTokenExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<NamedExtensionFluent.OAuthAccessTokenExtensionNested<N>>{

        
    public N and();    public N endOAuthAccessTokenExtension();
}
    public interface PersistentVolumeExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<NamedExtensionFluent.PersistentVolumeExtensionNested<N>>{

        
    public N and();    public N endPersistentVolumeExtension();
}
    public interface PersistentVolumeClaimExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<NamedExtensionFluent.PersistentVolumeClaimExtensionNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimExtension();
}
    public interface EventsEventExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<NamedExtensionFluent.EventsEventExtensionNested<N>>{

        
    public N and();    public N endEventsEventExtension();
}
    public interface StatefulSetExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<NamedExtensionFluent.StatefulSetExtensionNested<N>>{

        
    public N and();    public N endStatefulSetExtension();
}
    public interface OpenshiftClusterRoleExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleExtension();
}
    public interface RoleExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<NamedExtensionFluent.RoleExtensionNested<N>>{

        
    public N and();    public N endRoleExtension();
}
    public interface UserExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<NamedExtensionFluent.UserExtensionNested<N>>{

        
    public N and();    public N endUserExtension();
}
    public interface ComponentStatusExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<NamedExtensionFluent.ComponentStatusExtensionNested<N>>{

        
    public N and();    public N endComponentStatusExtension();
}
    public interface TokenReviewExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<NamedExtensionFluent.TokenReviewExtensionNested<N>>{

        
    public N and();    public N endTokenReviewExtension();
}
    public interface BindingExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<NamedExtensionFluent.BindingExtensionNested<N>>{

        
    public N and();    public N endBindingExtension();
}
    public interface SecretExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<NamedExtensionFluent.SecretExtensionNested<N>>{

        
    public N and();    public N endSecretExtension();
}
    public interface SecurityContextConstraintsExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<NamedExtensionFluent.SecurityContextConstraintsExtensionNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsExtension();
}
    public interface NetNamespaceExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<NamedExtensionFluent.NetNamespaceExtensionNested<N>>{

        
    public N and();    public N endNetNamespaceExtension();
}
    public interface NodeExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<NamedExtensionFluent.NodeExtensionNested<N>>{

        
    public N and();    public N endNodeExtension();
}
    public interface JobExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<NamedExtensionFluent.JobExtensionNested<N>>{

        
    public N and();    public N endJobExtension();
}
    public interface CertificateSigningRequestExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<NamedExtensionFluent.CertificateSigningRequestExtensionNested<N>>{

        
    public N and();    public N endCertificateSigningRequestExtension();
}
    public interface ServiceAccountExtensionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<NamedExtensionFluent.ServiceAccountExtensionNested<N>>{

        
    public N and();    public N endServiceAccountExtension();
}


}
