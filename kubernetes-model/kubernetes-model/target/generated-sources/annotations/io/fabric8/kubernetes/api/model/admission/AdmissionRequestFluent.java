package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.Node;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import java.lang.String;
import io.fabric8.kubernetes.api.model.NodeBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluent;
import io.fabric8.openshift.api.model.IdentityFluent;
import io.fabric8.kubernetes.api.model.SecretBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.kubernetes.api.model.ConfigMapFluent;
import io.fabric8.kubernetes.api.model.ReplicationController;
import io.fabric8.kubernetes.api.model.EventFluent;
import io.fabric8.kubernetes.api.model.GroupVersionResourceFluent;
import io.fabric8.openshift.api.model.ImageStreamTagFluent;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.kubernetes.api.model.PodBuilder;
import io.fabric8.kubernetes.api.model.GroupVersionResourceBuilder;
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
import io.fabric8.kubernetes.api.model.EndpointsBuilder;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.openshift.api.model.ImageStreamImportFluent;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.kubernetes.api.model.GroupVersionKindBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluent;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluent;
import io.fabric8.openshift.api.model.ImageSignatureBuilder;
import io.fabric8.kubernetes.api.model.EventBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.SecretFluent;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.PodTemplateBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluent;
import io.fabric8.openshift.api.model.ProjectRequestFluent;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluent;
import io.fabric8.kubernetes.api.model.PersistentVolumeFluent;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.kubernetes.api.model.PodTemplate;
import io.fabric8.kubernetes.api.model.Binding;
import io.fabric8.kubernetes.api.model.LimitRangeBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluent;
import io.fabric8.kubernetes.api.model.NodeFluent;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluent;
import io.fabric8.kubernetes.api.model.GroupVersionResource;
import io.fabric8.openshift.api.model.OAuthClientFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluent;
import io.fabric8.kubernetes.api.model.authentication.UserInfo;
import io.fabric8.kubernetes.api.model.GroupVersionKind;
import io.fabric8.kubernetes.api.model.ServiceFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluent;
import io.fabric8.kubernetes.api.model.authentication.UserInfoBuilder;
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
import io.fabric8.kubernetes.api.model.EndpointsFluent;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.openshift.api.model.DeploymentConfigFluent;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluent;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimFluent;
import io.fabric8.openshift.api.model.Image;
import io.fabric8.kubernetes.api.model.ComponentStatusFluent;
import io.fabric8.openshift.api.model.ImageStreamBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluent;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.openshift.api.model.Identity;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.NamespaceFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.openshift.api.model.OpenshiftRoleFluent;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.openshift.api.model.BuildFluent;
import io.fabric8.openshift.api.model.BuildConfigFluent;
import io.fabric8.kubernetes.api.model.PodTemplateFluent;
import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.openshift.api.model.BuildBuilder;
import io.fabric8.kubernetes.api.model.PodFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.ComponentStatus;
import io.fabric8.openshift.api.model.ProjectRequest;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.openshift.api.model.ImageFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.kubernetes.api.model.BindingFluent;
import io.fabric8.kubernetes.api.model.ServiceAccountFluent;
import io.fabric8.kubernetes.api.model.ResourceQuotaFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.openshift.api.model.GroupFluent;
import io.fabric8.kubernetes.api.model.authentication.UserInfoFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluent;
import io.fabric8.kubernetes.api.model.LimitRangeFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluent;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobFluent;
import io.fabric8.openshift.api.model.ImageSignature;
import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluent;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.openshift.api.model.RouteFluent;
import io.fabric8.kubernetes.api.model.PersistentVolumeBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressFluent;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.openshift.api.model.BuildConfigBuilder;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ResourceQuotaBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerFluent;
import io.fabric8.kubernetes.api.model.ServiceAccountBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.api.model.LimitRange;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.NetNamespaceFluent;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.BindingBuilder;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.kubernetes.api.model.ComponentStatusBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerBuilder;
import io.fabric8.openshift.api.model.ImageSignatureFluent;
import io.fabric8.kubernetes.api.model.ServiceBuilder;
import io.fabric8.kubernetes.api.model.Endpoints;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluent;
import io.fabric8.kubernetes.api.model.GroupVersionKindFluent;
import io.fabric8.openshift.api.model.TemplateFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.openshift.api.model.ImageStreamFluent;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

public interface AdmissionRequestFluent<A extends AdmissionRequestFluent<A>> extends Fluent<A>{


    public Boolean isDryRun();
    public A withDryRun(Boolean dryRun);
    public Boolean hasDryRun();
    public A withNewDryRun(String arg1);
    public A withNewDryRun(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildKind instead.
 * @return The buildable object.
 */
@Deprecated public GroupVersionKind getKind();
    public GroupVersionKind buildKind();
    public A withKind(GroupVersionKind kind);
    public Boolean hasKind();
    public A withNewKind(String group,String kind,String version);
    public AdmissionRequestFluent.KindNested<A> withNewKind();
    public AdmissionRequestFluent.KindNested<A> withNewKindLike(GroupVersionKind item);
    public AdmissionRequestFluent.KindNested<A> editKind();
    public AdmissionRequestFluent.KindNested<A> editOrNewKind();
    public AdmissionRequestFluent.KindNested<A> editOrNewKindLike(GroupVersionKind item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getObject();
    public HasMetadata buildObject();
    public A withObject(HasMetadata object);
    public Boolean hasObject();
    public A withValidatingWebhookConfigurationObject(ValidatingWebhookConfiguration validatingWebhookConfigurationObject);
    public AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObject();
    public AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObjectLike(ValidatingWebhookConfiguration item);
    public A withStorageClassObject(StorageClass storageClassObject);
    public AdmissionRequestFluent.StorageClassObjectNested<A> withNewStorageClassObject();
    public AdmissionRequestFluent.StorageClassObjectNested<A> withNewStorageClassObjectLike(StorageClass item);
    public A withClusterRoleBindingObject(ClusterRoleBinding clusterRoleBindingObject);
    public AdmissionRequestFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObject();
    public AdmissionRequestFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObjectLike(ClusterRoleBinding item);
    public A withOpenshiftRoleBindingObject(OpenshiftRoleBinding openshiftRoleBindingObject);
    public AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObject();
    public AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObjectLike(OpenshiftRoleBinding item);
    public A withPodDisruptionBudgetObject(PodDisruptionBudget podDisruptionBudgetObject);
    public AdmissionRequestFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObject();
    public AdmissionRequestFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObjectLike(PodDisruptionBudget item);
    public A withNetworkPolicyObject(NetworkPolicy networkPolicyObject);
    public AdmissionRequestFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObject();
    public AdmissionRequestFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObjectLike(NetworkPolicy item);
    public A withOpenshiftClusterRoleBindingObject(OpenshiftClusterRoleBinding openshiftClusterRoleBindingObject);
    public AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObject();
    public AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObjectLike(OpenshiftClusterRoleBinding item);
    public A withRouteObject(Route routeObject);
    public AdmissionRequestFluent.RouteObjectNested<A> withNewRouteObject();
    public AdmissionRequestFluent.RouteObjectNested<A> withNewRouteObjectLike(Route item);
    public A withNamespaceObject(Namespace namespaceObject);
    public AdmissionRequestFluent.NamespaceObjectNested<A> withNewNamespaceObject();
    public AdmissionRequestFluent.NamespaceObjectNested<A> withNewNamespaceObjectLike(Namespace item);
    public A withLocalSubjectAccessReviewObject(LocalSubjectAccessReview localSubjectAccessReviewObject);
    public AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObject();
    public AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObjectLike(LocalSubjectAccessReview item);
    public A withServiceObject(Service serviceObject);
    public AdmissionRequestFluent.ServiceObjectNested<A> withNewServiceObject();
    public AdmissionRequestFluent.ServiceObjectNested<A> withNewServiceObjectLike(Service item);
    public A withReplicationControllerObject(ReplicationController replicationControllerObject);
    public AdmissionRequestFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObject();
    public AdmissionRequestFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObjectLike(ReplicationController item);
    public A withSubjectAccessReviewObject(SubjectAccessReview subjectAccessReviewObject);
    public AdmissionRequestFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObject();
    public AdmissionRequestFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObjectLike(SubjectAccessReview item);
    public A withMutatingWebhookConfigurationObject(MutatingWebhookConfiguration mutatingWebhookConfigurationObject);
    public AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObject();
    public AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObjectLike(MutatingWebhookConfiguration item);
    public A withHorizontalPodAutoscalerObject(HorizontalPodAutoscaler horizontalPodAutoscalerObject);
    public AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObject();
    public AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObjectLike(HorizontalPodAutoscaler item);
    public A withScaleObject(Scale scaleObject);
    public AdmissionRequestFluent.ScaleObjectNested<A> withNewScaleObject();
    public AdmissionRequestFluent.ScaleObjectNested<A> withNewScaleObjectLike(Scale item);
    public A withImageObject(Image imageObject);
    public AdmissionRequestFluent.ImageObjectNested<A> withNewImageObject();
    public AdmissionRequestFluent.ImageObjectNested<A> withNewImageObjectLike(Image item);
    public A withReplicaSetObject(ReplicaSet replicaSetObject);
    public AdmissionRequestFluent.ReplicaSetObjectNested<A> withNewReplicaSetObject();
    public AdmissionRequestFluent.ReplicaSetObjectNested<A> withNewReplicaSetObjectLike(ReplicaSet item);
    public A withPodSecurityPolicyObject(PodSecurityPolicy podSecurityPolicyObject);
    public AdmissionRequestFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObject();
    public AdmissionRequestFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObjectLike(PodSecurityPolicy item);
    public A withCronJobObject(CronJob cronJobObject);
    public AdmissionRequestFluent.CronJobObjectNested<A> withNewCronJobObject();
    public AdmissionRequestFluent.CronJobObjectNested<A> withNewCronJobObjectLike(CronJob item);
    public A withEndpointsObject(Endpoints endpointsObject);
    public AdmissionRequestFluent.EndpointsObjectNested<A> withNewEndpointsObject();
    public AdmissionRequestFluent.EndpointsObjectNested<A> withNewEndpointsObjectLike(Endpoints item);
    public A withPodObject(Pod podObject);
    public AdmissionRequestFluent.PodObjectNested<A> withNewPodObject();
    public AdmissionRequestFluent.PodObjectNested<A> withNewPodObjectLike(Pod item);
    public A withConfigMapObject(ConfigMap configMapObject);
    public AdmissionRequestFluent.ConfigMapObjectNested<A> withNewConfigMapObject();
    public AdmissionRequestFluent.ConfigMapObjectNested<A> withNewConfigMapObjectLike(ConfigMap item);
    public A withCustomResourceDefinitionObject(CustomResourceDefinition customResourceDefinitionObject);
    public AdmissionRequestFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObject();
    public AdmissionRequestFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObjectLike(CustomResourceDefinition item);
    public A withBuildObject(Build buildObject);
    public AdmissionRequestFluent.BuildObjectNested<A> withNewBuildObject();
    public AdmissionRequestFluent.BuildObjectNested<A> withNewBuildObjectLike(Build item);
    public A withImageStreamTagObject(ImageStreamTag imageStreamTagObject);
    public AdmissionRequestFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObject();
    public AdmissionRequestFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObjectLike(ImageStreamTag item);
    public A withGroupObject(Group groupObject);
    public AdmissionRequestFluent.GroupObjectNested<A> withNewGroupObject();
    public AdmissionRequestFluent.GroupObjectNested<A> withNewGroupObjectLike(Group item);
    public A withImageSignatureObject(ImageSignature imageSignatureObject);
    public AdmissionRequestFluent.ImageSignatureObjectNested<A> withNewImageSignatureObject();
    public AdmissionRequestFluent.ImageSignatureObjectNested<A> withNewImageSignatureObjectLike(ImageSignature item);
    public A withResourceQuotaObject(ResourceQuota resourceQuotaObject);
    public AdmissionRequestFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObject();
    public AdmissionRequestFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObjectLike(ResourceQuota item);
    public A withBuildRequestObject(BuildRequest buildRequestObject);
    public AdmissionRequestFluent.BuildRequestObjectNested<A> withNewBuildRequestObject();
    public AdmissionRequestFluent.BuildRequestObjectNested<A> withNewBuildRequestObjectLike(BuildRequest item);
    public A withDaemonSetObject(DaemonSet daemonSetObject);
    public AdmissionRequestFluent.DaemonSetObjectNested<A> withNewDaemonSetObject();
    public AdmissionRequestFluent.DaemonSetObjectNested<A> withNewDaemonSetObjectLike(DaemonSet item);
    public A withImageStreamObject(ImageStream imageStreamObject);
    public AdmissionRequestFluent.ImageStreamObjectNested<A> withNewImageStreamObject();
    public AdmissionRequestFluent.ImageStreamObjectNested<A> withNewImageStreamObjectLike(ImageStream item);
    public A withOpenshiftRoleObject(OpenshiftRole openshiftRoleObject);
    public AdmissionRequestFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObject();
    public AdmissionRequestFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObjectLike(OpenshiftRole item);
    public A withOAuthClientObject(OAuthClient oAuthClientObject);
    public AdmissionRequestFluent.OAuthClientObjectNested<A> withNewOAuthClientObject();
    public AdmissionRequestFluent.OAuthClientObjectNested<A> withNewOAuthClientObjectLike(OAuthClient item);
    public A withIdentityObject(Identity identityObject);
    public AdmissionRequestFluent.IdentityObjectNested<A> withNewIdentityObject();
    public AdmissionRequestFluent.IdentityObjectNested<A> withNewIdentityObjectLike(Identity item);
    public A withLimitRangeObject(LimitRange limitRangeObject);
    public AdmissionRequestFluent.LimitRangeObjectNested<A> withNewLimitRangeObject();
    public AdmissionRequestFluent.LimitRangeObjectNested<A> withNewLimitRangeObjectLike(LimitRange item);
    public A withImageStreamImportObject(ImageStreamImport imageStreamImportObject);
    public AdmissionRequestFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObject();
    public AdmissionRequestFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObjectLike(ImageStreamImport item);
    public A withOpenshiftRoleBindingRestrictionObject(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionObject);
    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObject();
    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObjectLike(OpenshiftRoleBindingRestriction item);
    public A withRoleBindingObject(RoleBinding roleBindingObject);
    public AdmissionRequestFluent.RoleBindingObjectNested<A> withNewRoleBindingObject();
    public AdmissionRequestFluent.RoleBindingObjectNested<A> withNewRoleBindingObjectLike(RoleBinding item);
    public A withPodPresetObject(PodPreset podPresetObject);
    public AdmissionRequestFluent.PodPresetObjectNested<A> withNewPodPresetObject();
    public AdmissionRequestFluent.PodPresetObjectNested<A> withNewPodPresetObjectLike(PodPreset item);
    public A withProjectObject(Project projectObject);
    public AdmissionRequestFluent.ProjectObjectNested<A> withNewProjectObject();
    public AdmissionRequestFluent.ProjectObjectNested<A> withNewProjectObjectLike(Project item);
    public A withBuildConfigObject(BuildConfig buildConfigObject);
    public AdmissionRequestFluent.BuildConfigObjectNested<A> withNewBuildConfigObject();
    public AdmissionRequestFluent.BuildConfigObjectNested<A> withNewBuildConfigObjectLike(BuildConfig item);
    public A withClusterRoleObject(ClusterRole clusterRoleObject);
    public AdmissionRequestFluent.ClusterRoleObjectNested<A> withNewClusterRoleObject();
    public AdmissionRequestFluent.ClusterRoleObjectNested<A> withNewClusterRoleObjectLike(ClusterRole item);
    public A withOAuthAuthorizeTokenObject(OAuthAuthorizeToken oAuthAuthorizeTokenObject);
    public AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObject();
    public AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObjectLike(OAuthAuthorizeToken item);
    public A withProjectRequestObject(ProjectRequest projectRequestObject);
    public AdmissionRequestFluent.ProjectRequestObjectNested<A> withNewProjectRequestObject();
    public AdmissionRequestFluent.ProjectRequestObjectNested<A> withNewProjectRequestObjectLike(ProjectRequest item);
    public A withPriorityClassObject(PriorityClass priorityClassObject);
    public AdmissionRequestFluent.PriorityClassObjectNested<A> withNewPriorityClassObject();
    public AdmissionRequestFluent.PriorityClassObjectNested<A> withNewPriorityClassObjectLike(PriorityClass item);
    public A withTemplateObject(Template templateObject);
    public AdmissionRequestFluent.TemplateObjectNested<A> withNewTemplateObject();
    public AdmissionRequestFluent.TemplateObjectNested<A> withNewTemplateObjectLike(Template item);
    public A withOAuthClientAuthorizationObject(OAuthClientAuthorization oAuthClientAuthorizationObject);
    public AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObject();
    public AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObjectLike(OAuthClientAuthorization item);
    public A withDeploymentObject(Deployment deploymentObject);
    public AdmissionRequestFluent.DeploymentObjectNested<A> withNewDeploymentObject();
    public AdmissionRequestFluent.DeploymentObjectNested<A> withNewDeploymentObjectLike(Deployment item);
    public A withPodTemplateObject(PodTemplate podTemplateObject);
    public AdmissionRequestFluent.PodTemplateObjectNested<A> withNewPodTemplateObject();
    public AdmissionRequestFluent.PodTemplateObjectNested<A> withNewPodTemplateObjectLike(PodTemplate item);
    public A withEventObject(Event eventObject);
    public AdmissionRequestFluent.EventObjectNested<A> withNewEventObject();
    public AdmissionRequestFluent.EventObjectNested<A> withNewEventObjectLike(Event item);
    public A withIngressObject(Ingress ingressObject);
    public AdmissionRequestFluent.IngressObjectNested<A> withNewIngressObject();
    public AdmissionRequestFluent.IngressObjectNested<A> withNewIngressObjectLike(Ingress item);
    public A withDeploymentConfigObject(DeploymentConfig deploymentConfigObject);
    public AdmissionRequestFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObject();
    public AdmissionRequestFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObjectLike(DeploymentConfig item);
    public A withOAuthAccessTokenObject(OAuthAccessToken oAuthAccessTokenObject);
    public AdmissionRequestFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObject();
    public AdmissionRequestFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObjectLike(OAuthAccessToken item);
    public A withPersistentVolumeObject(PersistentVolume persistentVolumeObject);
    public AdmissionRequestFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObject();
    public AdmissionRequestFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObjectLike(PersistentVolume item);
    public A withPersistentVolumeClaimObject(PersistentVolumeClaim persistentVolumeClaimObject);
    public AdmissionRequestFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObject();
    public AdmissionRequestFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObjectLike(PersistentVolumeClaim item);
    public A withEventObject(io.fabric8.kubernetes.api.model.events.Event eventObject);
    public AdmissionRequestFluent.EventsEventObjectNested<A> withNewEventsEventObject();
    public AdmissionRequestFluent.EventsEventObjectNested<A> withNewEventObjectLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withStatefulSetObject(StatefulSet statefulSetObject);
    public AdmissionRequestFluent.StatefulSetObjectNested<A> withNewStatefulSetObject();
    public AdmissionRequestFluent.StatefulSetObjectNested<A> withNewStatefulSetObjectLike(StatefulSet item);
    public A withOpenshiftClusterRoleObject(OpenshiftClusterRole openshiftClusterRoleObject);
    public AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObject();
    public AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObjectLike(OpenshiftClusterRole item);
    public A withRoleObject(Role roleObject);
    public AdmissionRequestFluent.RoleObjectNested<A> withNewRoleObject();
    public AdmissionRequestFluent.RoleObjectNested<A> withNewRoleObjectLike(Role item);
    public A withUserObject(User userObject);
    public AdmissionRequestFluent.UserObjectNested<A> withNewUserObject();
    public AdmissionRequestFluent.UserObjectNested<A> withNewUserObjectLike(User item);
    public A withComponentStatusObject(ComponentStatus componentStatusObject);
    public AdmissionRequestFluent.ComponentStatusObjectNested<A> withNewComponentStatusObject();
    public AdmissionRequestFluent.ComponentStatusObjectNested<A> withNewComponentStatusObjectLike(ComponentStatus item);
    public A withTokenReviewObject(TokenReview tokenReviewObject);
    public AdmissionRequestFluent.TokenReviewObjectNested<A> withNewTokenReviewObject();
    public AdmissionRequestFluent.TokenReviewObjectNested<A> withNewTokenReviewObjectLike(TokenReview item);
    public A withBindingObject(Binding bindingObject);
    public AdmissionRequestFluent.BindingObjectNested<A> withNewBindingObject();
    public AdmissionRequestFluent.BindingObjectNested<A> withNewBindingObjectLike(Binding item);
    public A withSecretObject(Secret secretObject);
    public AdmissionRequestFluent.SecretObjectNested<A> withNewSecretObject();
    public AdmissionRequestFluent.SecretObjectNested<A> withNewSecretObjectLike(Secret item);
    public A withSecurityContextConstraintsObject(SecurityContextConstraints securityContextConstraintsObject);
    public AdmissionRequestFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObject();
    public AdmissionRequestFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObjectLike(SecurityContextConstraints item);
    public A withNetNamespaceObject(NetNamespace netNamespaceObject);
    public AdmissionRequestFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObject();
    public AdmissionRequestFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObjectLike(NetNamespace item);
    public A withNodeObject(Node nodeObject);
    public AdmissionRequestFluent.NodeObjectNested<A> withNewNodeObject();
    public AdmissionRequestFluent.NodeObjectNested<A> withNewNodeObjectLike(Node item);
    public A withJobObject(Job jobObject);
    public AdmissionRequestFluent.JobObjectNested<A> withNewJobObject();
    public AdmissionRequestFluent.JobObjectNested<A> withNewJobObjectLike(Job item);
    public A withCertificateSigningRequestObject(CertificateSigningRequest certificateSigningRequestObject);
    public AdmissionRequestFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObject();
    public AdmissionRequestFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObjectLike(CertificateSigningRequest item);
    public A withServiceAccountObject(ServiceAccount serviceAccountObject);
    public AdmissionRequestFluent.ServiceAccountObjectNested<A> withNewServiceAccountObject();
    public AdmissionRequestFluent.ServiceAccountObjectNested<A> withNewServiceAccountObjectLike(ServiceAccount item);
    
/**
 * This method has been deprecated, please use method buildOldObject instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getOldObject();
    public HasMetadata buildOldObject();
    public A withOldObject(HasMetadata oldObject);
    public Boolean hasOldObject();
    public A withValidatingWebhookConfigurationOldObject(ValidatingWebhookConfiguration validatingWebhookConfigurationOldObject);
    public AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<A> withNewValidatingWebhookConfigurationOldObject();
    public AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<A> withNewValidatingWebhookConfigurationOldObjectLike(ValidatingWebhookConfiguration item);
    public A withStorageClassOldObject(StorageClass storageClassOldObject);
    public AdmissionRequestFluent.StorageClassOldObjectNested<A> withNewStorageClassOldObject();
    public AdmissionRequestFluent.StorageClassOldObjectNested<A> withNewStorageClassOldObjectLike(StorageClass item);
    public A withClusterRoleBindingOldObject(ClusterRoleBinding clusterRoleBindingOldObject);
    public AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<A> withNewClusterRoleBindingOldObject();
    public AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<A> withNewClusterRoleBindingOldObjectLike(ClusterRoleBinding item);
    public A withOpenshiftRoleBindingOldObject(OpenshiftRoleBinding openshiftRoleBindingOldObject);
    public AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<A> withNewOpenshiftRoleBindingOldObject();
    public AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<A> withNewOpenshiftRoleBindingOldObjectLike(OpenshiftRoleBinding item);
    public A withPodDisruptionBudgetOldObject(PodDisruptionBudget podDisruptionBudgetOldObject);
    public AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<A> withNewPodDisruptionBudgetOldObject();
    public AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<A> withNewPodDisruptionBudgetOldObjectLike(PodDisruptionBudget item);
    public A withNetworkPolicyOldObject(NetworkPolicy networkPolicyOldObject);
    public AdmissionRequestFluent.NetworkPolicyOldObjectNested<A> withNewNetworkPolicyOldObject();
    public AdmissionRequestFluent.NetworkPolicyOldObjectNested<A> withNewNetworkPolicyOldObjectLike(NetworkPolicy item);
    public A withOpenshiftClusterRoleBindingOldObject(OpenshiftClusterRoleBinding openshiftClusterRoleBindingOldObject);
    public AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<A> withNewOpenshiftClusterRoleBindingOldObject();
    public AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<A> withNewOpenshiftClusterRoleBindingOldObjectLike(OpenshiftClusterRoleBinding item);
    public A withRouteOldObject(Route routeOldObject);
    public AdmissionRequestFluent.RouteOldObjectNested<A> withNewRouteOldObject();
    public AdmissionRequestFluent.RouteOldObjectNested<A> withNewRouteOldObjectLike(Route item);
    public A withNamespaceOldObject(Namespace namespaceOldObject);
    public AdmissionRequestFluent.NamespaceOldObjectNested<A> withNewNamespaceOldObject();
    public AdmissionRequestFluent.NamespaceOldObjectNested<A> withNewNamespaceOldObjectLike(Namespace item);
    public A withLocalSubjectAccessReviewOldObject(LocalSubjectAccessReview localSubjectAccessReviewOldObject);
    public AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<A> withNewLocalSubjectAccessReviewOldObject();
    public AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<A> withNewLocalSubjectAccessReviewOldObjectLike(LocalSubjectAccessReview item);
    public A withServiceOldObject(Service serviceOldObject);
    public AdmissionRequestFluent.ServiceOldObjectNested<A> withNewServiceOldObject();
    public AdmissionRequestFluent.ServiceOldObjectNested<A> withNewServiceOldObjectLike(Service item);
    public A withReplicationControllerOldObject(ReplicationController replicationControllerOldObject);
    public AdmissionRequestFluent.ReplicationControllerOldObjectNested<A> withNewReplicationControllerOldObject();
    public AdmissionRequestFluent.ReplicationControllerOldObjectNested<A> withNewReplicationControllerOldObjectLike(ReplicationController item);
    public A withSubjectAccessReviewOldObject(SubjectAccessReview subjectAccessReviewOldObject);
    public AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<A> withNewSubjectAccessReviewOldObject();
    public AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<A> withNewSubjectAccessReviewOldObjectLike(SubjectAccessReview item);
    public A withMutatingWebhookConfigurationOldObject(MutatingWebhookConfiguration mutatingWebhookConfigurationOldObject);
    public AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<A> withNewMutatingWebhookConfigurationOldObject();
    public AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<A> withNewMutatingWebhookConfigurationOldObjectLike(MutatingWebhookConfiguration item);
    public A withHorizontalPodAutoscalerOldObject(HorizontalPodAutoscaler horizontalPodAutoscalerOldObject);
    public AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<A> withNewHorizontalPodAutoscalerOldObject();
    public AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<A> withNewHorizontalPodAutoscalerOldObjectLike(HorizontalPodAutoscaler item);
    public A withScaleOldObject(Scale scaleOldObject);
    public AdmissionRequestFluent.ScaleOldObjectNested<A> withNewScaleOldObject();
    public AdmissionRequestFluent.ScaleOldObjectNested<A> withNewScaleOldObjectLike(Scale item);
    public A withImageOldObject(Image imageOldObject);
    public AdmissionRequestFluent.ImageOldObjectNested<A> withNewImageOldObject();
    public AdmissionRequestFluent.ImageOldObjectNested<A> withNewImageOldObjectLike(Image item);
    public A withReplicaSetOldObject(ReplicaSet replicaSetOldObject);
    public AdmissionRequestFluent.ReplicaSetOldObjectNested<A> withNewReplicaSetOldObject();
    public AdmissionRequestFluent.ReplicaSetOldObjectNested<A> withNewReplicaSetOldObjectLike(ReplicaSet item);
    public A withPodSecurityPolicyOldObject(PodSecurityPolicy podSecurityPolicyOldObject);
    public AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<A> withNewPodSecurityPolicyOldObject();
    public AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<A> withNewPodSecurityPolicyOldObjectLike(PodSecurityPolicy item);
    public A withCronJobOldObject(CronJob cronJobOldObject);
    public AdmissionRequestFluent.CronJobOldObjectNested<A> withNewCronJobOldObject();
    public AdmissionRequestFluent.CronJobOldObjectNested<A> withNewCronJobOldObjectLike(CronJob item);
    public A withEndpointsOldObject(Endpoints endpointsOldObject);
    public AdmissionRequestFluent.EndpointsOldObjectNested<A> withNewEndpointsOldObject();
    public AdmissionRequestFluent.EndpointsOldObjectNested<A> withNewEndpointsOldObjectLike(Endpoints item);
    public A withPodOldObject(Pod podOldObject);
    public AdmissionRequestFluent.PodOldObjectNested<A> withNewPodOldObject();
    public AdmissionRequestFluent.PodOldObjectNested<A> withNewPodOldObjectLike(Pod item);
    public A withConfigMapOldObject(ConfigMap configMapOldObject);
    public AdmissionRequestFluent.ConfigMapOldObjectNested<A> withNewConfigMapOldObject();
    public AdmissionRequestFluent.ConfigMapOldObjectNested<A> withNewConfigMapOldObjectLike(ConfigMap item);
    public A withCustomResourceDefinitionOldObject(CustomResourceDefinition customResourceDefinitionOldObject);
    public AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<A> withNewCustomResourceDefinitionOldObject();
    public AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<A> withNewCustomResourceDefinitionOldObjectLike(CustomResourceDefinition item);
    public A withBuildOldObject(Build buildOldObject);
    public AdmissionRequestFluent.BuildOldObjectNested<A> withNewBuildOldObject();
    public AdmissionRequestFluent.BuildOldObjectNested<A> withNewBuildOldObjectLike(Build item);
    public A withImageStreamTagOldObject(ImageStreamTag imageStreamTagOldObject);
    public AdmissionRequestFluent.ImageStreamTagOldObjectNested<A> withNewImageStreamTagOldObject();
    public AdmissionRequestFluent.ImageStreamTagOldObjectNested<A> withNewImageStreamTagOldObjectLike(ImageStreamTag item);
    public A withGroupOldObject(Group groupOldObject);
    public AdmissionRequestFluent.GroupOldObjectNested<A> withNewGroupOldObject();
    public AdmissionRequestFluent.GroupOldObjectNested<A> withNewGroupOldObjectLike(Group item);
    public A withImageSignatureOldObject(ImageSignature imageSignatureOldObject);
    public AdmissionRequestFluent.ImageSignatureOldObjectNested<A> withNewImageSignatureOldObject();
    public AdmissionRequestFluent.ImageSignatureOldObjectNested<A> withNewImageSignatureOldObjectLike(ImageSignature item);
    public A withResourceQuotaOldObject(ResourceQuota resourceQuotaOldObject);
    public AdmissionRequestFluent.ResourceQuotaOldObjectNested<A> withNewResourceQuotaOldObject();
    public AdmissionRequestFluent.ResourceQuotaOldObjectNested<A> withNewResourceQuotaOldObjectLike(ResourceQuota item);
    public A withBuildRequestOldObject(BuildRequest buildRequestOldObject);
    public AdmissionRequestFluent.BuildRequestOldObjectNested<A> withNewBuildRequestOldObject();
    public AdmissionRequestFluent.BuildRequestOldObjectNested<A> withNewBuildRequestOldObjectLike(BuildRequest item);
    public A withDaemonSetOldObject(DaemonSet daemonSetOldObject);
    public AdmissionRequestFluent.DaemonSetOldObjectNested<A> withNewDaemonSetOldObject();
    public AdmissionRequestFluent.DaemonSetOldObjectNested<A> withNewDaemonSetOldObjectLike(DaemonSet item);
    public A withImageStreamOldObject(ImageStream imageStreamOldObject);
    public AdmissionRequestFluent.ImageStreamOldObjectNested<A> withNewImageStreamOldObject();
    public AdmissionRequestFluent.ImageStreamOldObjectNested<A> withNewImageStreamOldObjectLike(ImageStream item);
    public A withOpenshiftRoleOldObject(OpenshiftRole openshiftRoleOldObject);
    public AdmissionRequestFluent.OpenshiftRoleOldObjectNested<A> withNewOpenshiftRoleOldObject();
    public AdmissionRequestFluent.OpenshiftRoleOldObjectNested<A> withNewOpenshiftRoleOldObjectLike(OpenshiftRole item);
    public A withOAuthClientOldObject(OAuthClient oAuthClientOldObject);
    public AdmissionRequestFluent.OAuthClientOldObjectNested<A> withNewOAuthClientOldObject();
    public AdmissionRequestFluent.OAuthClientOldObjectNested<A> withNewOAuthClientOldObjectLike(OAuthClient item);
    public A withIdentityOldObject(Identity identityOldObject);
    public AdmissionRequestFluent.IdentityOldObjectNested<A> withNewIdentityOldObject();
    public AdmissionRequestFluent.IdentityOldObjectNested<A> withNewIdentityOldObjectLike(Identity item);
    public A withLimitRangeOldObject(LimitRange limitRangeOldObject);
    public AdmissionRequestFluent.LimitRangeOldObjectNested<A> withNewLimitRangeOldObject();
    public AdmissionRequestFluent.LimitRangeOldObjectNested<A> withNewLimitRangeOldObjectLike(LimitRange item);
    public A withImageStreamImportOldObject(ImageStreamImport imageStreamImportOldObject);
    public AdmissionRequestFluent.ImageStreamImportOldObjectNested<A> withNewImageStreamImportOldObject();
    public AdmissionRequestFluent.ImageStreamImportOldObjectNested<A> withNewImageStreamImportOldObjectLike(ImageStreamImport item);
    public A withOpenshiftRoleBindingRestrictionOldObject(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionOldObject);
    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<A> withNewOpenshiftRoleBindingRestrictionOldObject();
    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<A> withNewOpenshiftRoleBindingRestrictionOldObjectLike(OpenshiftRoleBindingRestriction item);
    public A withRoleBindingOldObject(RoleBinding roleBindingOldObject);
    public AdmissionRequestFluent.RoleBindingOldObjectNested<A> withNewRoleBindingOldObject();
    public AdmissionRequestFluent.RoleBindingOldObjectNested<A> withNewRoleBindingOldObjectLike(RoleBinding item);
    public A withPodPresetOldObject(PodPreset podPresetOldObject);
    public AdmissionRequestFluent.PodPresetOldObjectNested<A> withNewPodPresetOldObject();
    public AdmissionRequestFluent.PodPresetOldObjectNested<A> withNewPodPresetOldObjectLike(PodPreset item);
    public A withProjectOldObject(Project projectOldObject);
    public AdmissionRequestFluent.ProjectOldObjectNested<A> withNewProjectOldObject();
    public AdmissionRequestFluent.ProjectOldObjectNested<A> withNewProjectOldObjectLike(Project item);
    public A withBuildConfigOldObject(BuildConfig buildConfigOldObject);
    public AdmissionRequestFluent.BuildConfigOldObjectNested<A> withNewBuildConfigOldObject();
    public AdmissionRequestFluent.BuildConfigOldObjectNested<A> withNewBuildConfigOldObjectLike(BuildConfig item);
    public A withClusterRoleOldObject(ClusterRole clusterRoleOldObject);
    public AdmissionRequestFluent.ClusterRoleOldObjectNested<A> withNewClusterRoleOldObject();
    public AdmissionRequestFluent.ClusterRoleOldObjectNested<A> withNewClusterRoleOldObjectLike(ClusterRole item);
    public A withOAuthAuthorizeTokenOldObject(OAuthAuthorizeToken oAuthAuthorizeTokenOldObject);
    public AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<A> withNewOAuthAuthorizeTokenOldObject();
    public AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<A> withNewOAuthAuthorizeTokenOldObjectLike(OAuthAuthorizeToken item);
    public A withProjectRequestOldObject(ProjectRequest projectRequestOldObject);
    public AdmissionRequestFluent.ProjectRequestOldObjectNested<A> withNewProjectRequestOldObject();
    public AdmissionRequestFluent.ProjectRequestOldObjectNested<A> withNewProjectRequestOldObjectLike(ProjectRequest item);
    public A withPriorityClassOldObject(PriorityClass priorityClassOldObject);
    public AdmissionRequestFluent.PriorityClassOldObjectNested<A> withNewPriorityClassOldObject();
    public AdmissionRequestFluent.PriorityClassOldObjectNested<A> withNewPriorityClassOldObjectLike(PriorityClass item);
    public A withTemplateOldObject(Template templateOldObject);
    public AdmissionRequestFluent.TemplateOldObjectNested<A> withNewTemplateOldObject();
    public AdmissionRequestFluent.TemplateOldObjectNested<A> withNewTemplateOldObjectLike(Template item);
    public A withOAuthClientAuthorizationOldObject(OAuthClientAuthorization oAuthClientAuthorizationOldObject);
    public AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<A> withNewOAuthClientAuthorizationOldObject();
    public AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<A> withNewOAuthClientAuthorizationOldObjectLike(OAuthClientAuthorization item);
    public A withDeploymentOldObject(Deployment deploymentOldObject);
    public AdmissionRequestFluent.DeploymentOldObjectNested<A> withNewDeploymentOldObject();
    public AdmissionRequestFluent.DeploymentOldObjectNested<A> withNewDeploymentOldObjectLike(Deployment item);
    public A withPodTemplateOldObject(PodTemplate podTemplateOldObject);
    public AdmissionRequestFluent.PodTemplateOldObjectNested<A> withNewPodTemplateOldObject();
    public AdmissionRequestFluent.PodTemplateOldObjectNested<A> withNewPodTemplateOldObjectLike(PodTemplate item);
    public A withEventOldObject(Event eventOldObject);
    public AdmissionRequestFluent.EventOldObjectNested<A> withNewEventOldObject();
    public AdmissionRequestFluent.EventOldObjectNested<A> withNewEventOldObjectLike(Event item);
    public A withIngressOldObject(Ingress ingressOldObject);
    public AdmissionRequestFluent.IngressOldObjectNested<A> withNewIngressOldObject();
    public AdmissionRequestFluent.IngressOldObjectNested<A> withNewIngressOldObjectLike(Ingress item);
    public A withDeploymentConfigOldObject(DeploymentConfig deploymentConfigOldObject);
    public AdmissionRequestFluent.DeploymentConfigOldObjectNested<A> withNewDeploymentConfigOldObject();
    public AdmissionRequestFluent.DeploymentConfigOldObjectNested<A> withNewDeploymentConfigOldObjectLike(DeploymentConfig item);
    public A withOAuthAccessTokenOldObject(OAuthAccessToken oAuthAccessTokenOldObject);
    public AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<A> withNewOAuthAccessTokenOldObject();
    public AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<A> withNewOAuthAccessTokenOldObjectLike(OAuthAccessToken item);
    public A withPersistentVolumeOldObject(PersistentVolume persistentVolumeOldObject);
    public AdmissionRequestFluent.PersistentVolumeOldObjectNested<A> withNewPersistentVolumeOldObject();
    public AdmissionRequestFluent.PersistentVolumeOldObjectNested<A> withNewPersistentVolumeOldObjectLike(PersistentVolume item);
    public A withPersistentVolumeClaimOldObject(PersistentVolumeClaim persistentVolumeClaimOldObject);
    public AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<A> withNewPersistentVolumeClaimOldObject();
    public AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<A> withNewPersistentVolumeClaimOldObjectLike(PersistentVolumeClaim item);
    public A withEventOldObject(io.fabric8.kubernetes.api.model.events.Event eventOldObject);
    public AdmissionRequestFluent.EventsEventOldObjectNested<A> withNewEventsEventOldObject();
    public AdmissionRequestFluent.EventsEventOldObjectNested<A> withNewEventOldObjectLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withStatefulSetOldObject(StatefulSet statefulSetOldObject);
    public AdmissionRequestFluent.StatefulSetOldObjectNested<A> withNewStatefulSetOldObject();
    public AdmissionRequestFluent.StatefulSetOldObjectNested<A> withNewStatefulSetOldObjectLike(StatefulSet item);
    public A withOpenshiftClusterRoleOldObject(OpenshiftClusterRole openshiftClusterRoleOldObject);
    public AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<A> withNewOpenshiftClusterRoleOldObject();
    public AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<A> withNewOpenshiftClusterRoleOldObjectLike(OpenshiftClusterRole item);
    public A withRoleOldObject(Role roleOldObject);
    public AdmissionRequestFluent.RoleOldObjectNested<A> withNewRoleOldObject();
    public AdmissionRequestFluent.RoleOldObjectNested<A> withNewRoleOldObjectLike(Role item);
    public A withUserOldObject(User userOldObject);
    public AdmissionRequestFluent.UserOldObjectNested<A> withNewUserOldObject();
    public AdmissionRequestFluent.UserOldObjectNested<A> withNewUserOldObjectLike(User item);
    public A withComponentStatusOldObject(ComponentStatus componentStatusOldObject);
    public AdmissionRequestFluent.ComponentStatusOldObjectNested<A> withNewComponentStatusOldObject();
    public AdmissionRequestFluent.ComponentStatusOldObjectNested<A> withNewComponentStatusOldObjectLike(ComponentStatus item);
    public A withTokenReviewOldObject(TokenReview tokenReviewOldObject);
    public AdmissionRequestFluent.TokenReviewOldObjectNested<A> withNewTokenReviewOldObject();
    public AdmissionRequestFluent.TokenReviewOldObjectNested<A> withNewTokenReviewOldObjectLike(TokenReview item);
    public A withBindingOldObject(Binding bindingOldObject);
    public AdmissionRequestFluent.BindingOldObjectNested<A> withNewBindingOldObject();
    public AdmissionRequestFluent.BindingOldObjectNested<A> withNewBindingOldObjectLike(Binding item);
    public A withSecretOldObject(Secret secretOldObject);
    public AdmissionRequestFluent.SecretOldObjectNested<A> withNewSecretOldObject();
    public AdmissionRequestFluent.SecretOldObjectNested<A> withNewSecretOldObjectLike(Secret item);
    public A withSecurityContextConstraintsOldObject(SecurityContextConstraints securityContextConstraintsOldObject);
    public AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<A> withNewSecurityContextConstraintsOldObject();
    public AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<A> withNewSecurityContextConstraintsOldObjectLike(SecurityContextConstraints item);
    public A withNetNamespaceOldObject(NetNamespace netNamespaceOldObject);
    public AdmissionRequestFluent.NetNamespaceOldObjectNested<A> withNewNetNamespaceOldObject();
    public AdmissionRequestFluent.NetNamespaceOldObjectNested<A> withNewNetNamespaceOldObjectLike(NetNamespace item);
    public A withNodeOldObject(Node nodeOldObject);
    public AdmissionRequestFluent.NodeOldObjectNested<A> withNewNodeOldObject();
    public AdmissionRequestFluent.NodeOldObjectNested<A> withNewNodeOldObjectLike(Node item);
    public A withJobOldObject(Job jobOldObject);
    public AdmissionRequestFluent.JobOldObjectNested<A> withNewJobOldObject();
    public AdmissionRequestFluent.JobOldObjectNested<A> withNewJobOldObjectLike(Job item);
    public A withCertificateSigningRequestOldObject(CertificateSigningRequest certificateSigningRequestOldObject);
    public AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<A> withNewCertificateSigningRequestOldObject();
    public AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<A> withNewCertificateSigningRequestOldObjectLike(CertificateSigningRequest item);
    public A withServiceAccountOldObject(ServiceAccount serviceAccountOldObject);
    public AdmissionRequestFluent.ServiceAccountOldObjectNested<A> withNewServiceAccountOldObject();
    public AdmissionRequestFluent.ServiceAccountOldObjectNested<A> withNewServiceAccountOldObjectLike(ServiceAccount item);
    public String getOperation();
    public A withOperation(String operation);
    public Boolean hasOperation();
    
/**
 * This method has been deprecated, please use method buildResource instead.
 * @return The buildable object.
 */
@Deprecated public GroupVersionResource getResource();
    public GroupVersionResource buildResource();
    public A withResource(GroupVersionResource resource);
    public Boolean hasResource();
    public A withNewResource(String group,String resource,String version);
    public AdmissionRequestFluent.ResourceNested<A> withNewResource();
    public AdmissionRequestFluent.ResourceNested<A> withNewResourceLike(GroupVersionResource item);
    public AdmissionRequestFluent.ResourceNested<A> editResource();
    public AdmissionRequestFluent.ResourceNested<A> editOrNewResource();
    public AdmissionRequestFluent.ResourceNested<A> editOrNewResourceLike(GroupVersionResource item);
    public String getSubResource();
    public A withSubResource(String subResource);
    public Boolean hasSubResource();
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();
    
/**
 * This method has been deprecated, please use method buildUserInfo instead.
 * @return The buildable object.
 */
@Deprecated public UserInfo getUserInfo();
    public UserInfo buildUserInfo();
    public A withUserInfo(UserInfo userInfo);
    public Boolean hasUserInfo();
    public AdmissionRequestFluent.UserInfoNested<A> withNewUserInfo();
    public AdmissionRequestFluent.UserInfoNested<A> withNewUserInfoLike(UserInfo item);
    public AdmissionRequestFluent.UserInfoNested<A> editUserInfo();
    public AdmissionRequestFluent.UserInfoNested<A> editOrNewUserInfo();
    public AdmissionRequestFluent.UserInfoNested<A> editOrNewUserInfoLike(UserInfo item);

    public interface KindNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupVersionKindFluent<AdmissionRequestFluent.KindNested<N>>{

        
    public N and();    public N endKind();
}
    public interface ValidatingWebhookConfigurationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationObject();
}
    public interface StorageClassObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<AdmissionRequestFluent.StorageClassObjectNested<N>>{

        
    public N and();    public N endStorageClassObject();
}
    public interface ClusterRoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<AdmissionRequestFluent.ClusterRoleBindingObjectNested<N>>{

        
    public N and();    public N endClusterRoleBindingObject();
}
    public interface OpenshiftRoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingObject();
}
    public interface PodDisruptionBudgetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<AdmissionRequestFluent.PodDisruptionBudgetObjectNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetObject();
}
    public interface NetworkPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<AdmissionRequestFluent.NetworkPolicyObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyObject();
}
    public interface OpenshiftClusterRoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingObject();
}
    public interface RouteObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<AdmissionRequestFluent.RouteObjectNested<N>>{

        
    public N and();    public N endRouteObject();
}
    public interface NamespaceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<AdmissionRequestFluent.NamespaceObjectNested<N>>{

        
    public N and();    public N endNamespaceObject();
}
    public interface LocalSubjectAccessReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewObject();
}
    public interface ServiceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<AdmissionRequestFluent.ServiceObjectNested<N>>{

        
    public N and();    public N endServiceObject();
}
    public interface ReplicationControllerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<AdmissionRequestFluent.ReplicationControllerObjectNested<N>>{

        
    public N and();    public N endReplicationControllerObject();
}
    public interface SubjectAccessReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewFluent<AdmissionRequestFluent.SubjectAccessReviewObjectNested<N>>{

        
    public N and();    public N endSubjectAccessReviewObject();
}
    public interface MutatingWebhookConfigurationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationObject();
}
    public interface HorizontalPodAutoscalerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerObject();
}
    public interface ScaleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<AdmissionRequestFluent.ScaleObjectNested<N>>{

        
    public N and();    public N endScaleObject();
}
    public interface ImageObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<AdmissionRequestFluent.ImageObjectNested<N>>{

        
    public N and();    public N endImageObject();
}
    public interface ReplicaSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<AdmissionRequestFluent.ReplicaSetObjectNested<N>>{

        
    public N and();    public N endReplicaSetObject();
}
    public interface PodSecurityPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<AdmissionRequestFluent.PodSecurityPolicyObjectNested<N>>{

        
    public N and();    public N endPodSecurityPolicyObject();
}
    public interface CronJobObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<AdmissionRequestFluent.CronJobObjectNested<N>>{

        
    public N and();    public N endCronJobObject();
}
    public interface EndpointsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<AdmissionRequestFluent.EndpointsObjectNested<N>>{

        
    public N and();    public N endEndpointsObject();
}
    public interface PodObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<AdmissionRequestFluent.PodObjectNested<N>>{

        
    public N and();    public N endPodObject();
}
    public interface ConfigMapObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<AdmissionRequestFluent.ConfigMapObjectNested<N>>{

        
    public N and();    public N endConfigMapObject();
}
    public interface CustomResourceDefinitionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<AdmissionRequestFluent.CustomResourceDefinitionObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionObject();
}
    public interface BuildObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<AdmissionRequestFluent.BuildObjectNested<N>>{

        
    public N and();    public N endBuildObject();
}
    public interface ImageStreamTagObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<AdmissionRequestFluent.ImageStreamTagObjectNested<N>>{

        
    public N and();    public N endImageStreamTagObject();
}
    public interface GroupObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<AdmissionRequestFluent.GroupObjectNested<N>>{

        
    public N and();    public N endGroupObject();
}
    public interface ImageSignatureObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<AdmissionRequestFluent.ImageSignatureObjectNested<N>>{

        
    public N and();    public N endImageSignatureObject();
}
    public interface ResourceQuotaObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<AdmissionRequestFluent.ResourceQuotaObjectNested<N>>{

        
    public N and();    public N endResourceQuotaObject();
}
    public interface BuildRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<AdmissionRequestFluent.BuildRequestObjectNested<N>>{

        
    public N and();    public N endBuildRequestObject();
}
    public interface DaemonSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<AdmissionRequestFluent.DaemonSetObjectNested<N>>{

        
    public N and();    public N endDaemonSetObject();
}
    public interface ImageStreamObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<AdmissionRequestFluent.ImageStreamObjectNested<N>>{

        
    public N and();    public N endImageStreamObject();
}
    public interface OpenshiftRoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<AdmissionRequestFluent.OpenshiftRoleObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleObject();
}
    public interface OAuthClientObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<AdmissionRequestFluent.OAuthClientObjectNested<N>>{

        
    public N and();    public N endOAuthClientObject();
}
    public interface IdentityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<AdmissionRequestFluent.IdentityObjectNested<N>>{

        
    public N and();    public N endIdentityObject();
}
    public interface LimitRangeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<AdmissionRequestFluent.LimitRangeObjectNested<N>>{

        
    public N and();    public N endLimitRangeObject();
}
    public interface ImageStreamImportObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<AdmissionRequestFluent.ImageStreamImportObjectNested<N>>{

        
    public N and();    public N endImageStreamImportObject();
}
    public interface OpenshiftRoleBindingRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionObject();
}
    public interface RoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<AdmissionRequestFluent.RoleBindingObjectNested<N>>{

        
    public N and();    public N endRoleBindingObject();
}
    public interface PodPresetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<AdmissionRequestFluent.PodPresetObjectNested<N>>{

        
    public N and();    public N endPodPresetObject();
}
    public interface ProjectObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<AdmissionRequestFluent.ProjectObjectNested<N>>{

        
    public N and();    public N endProjectObject();
}
    public interface BuildConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<AdmissionRequestFluent.BuildConfigObjectNested<N>>{

        
    public N and();    public N endBuildConfigObject();
}
    public interface ClusterRoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<AdmissionRequestFluent.ClusterRoleObjectNested<N>>{

        
    public N and();    public N endClusterRoleObject();
}
    public interface OAuthAuthorizeTokenObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenObject();
}
    public interface ProjectRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<AdmissionRequestFluent.ProjectRequestObjectNested<N>>{

        
    public N and();    public N endProjectRequestObject();
}
    public interface PriorityClassObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<AdmissionRequestFluent.PriorityClassObjectNested<N>>{

        
    public N and();    public N endPriorityClassObject();
}
    public interface TemplateObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<AdmissionRequestFluent.TemplateObjectNested<N>>{

        
    public N and();    public N endTemplateObject();
}
    public interface OAuthClientAuthorizationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationObject();
}
    public interface DeploymentObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<AdmissionRequestFluent.DeploymentObjectNested<N>>{

        
    public N and();    public N endDeploymentObject();
}
    public interface PodTemplateObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<AdmissionRequestFluent.PodTemplateObjectNested<N>>{

        
    public N and();    public N endPodTemplateObject();
}
    public interface EventObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<AdmissionRequestFluent.EventObjectNested<N>>{

        
    public N and();    public N endEventObject();
}
    public interface IngressObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<AdmissionRequestFluent.IngressObjectNested<N>>{

        
    public N and();    public N endIngressObject();
}
    public interface DeploymentConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<AdmissionRequestFluent.DeploymentConfigObjectNested<N>>{

        
    public N and();    public N endDeploymentConfigObject();
}
    public interface OAuthAccessTokenObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<AdmissionRequestFluent.OAuthAccessTokenObjectNested<N>>{

        
    public N and();    public N endOAuthAccessTokenObject();
}
    public interface PersistentVolumeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<AdmissionRequestFluent.PersistentVolumeObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeObject();
}
    public interface PersistentVolumeClaimObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<AdmissionRequestFluent.PersistentVolumeClaimObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimObject();
}
    public interface EventsEventObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<AdmissionRequestFluent.EventsEventObjectNested<N>>{

        
    public N and();    public N endEventsEventObject();
}
    public interface StatefulSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<AdmissionRequestFluent.StatefulSetObjectNested<N>>{

        
    public N and();    public N endStatefulSetObject();
}
    public interface OpenshiftClusterRoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleObject();
}
    public interface RoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<AdmissionRequestFluent.RoleObjectNested<N>>{

        
    public N and();    public N endRoleObject();
}
    public interface UserObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<AdmissionRequestFluent.UserObjectNested<N>>{

        
    public N and();    public N endUserObject();
}
    public interface ComponentStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<AdmissionRequestFluent.ComponentStatusObjectNested<N>>{

        
    public N and();    public N endComponentStatusObject();
}
    public interface TokenReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<AdmissionRequestFluent.TokenReviewObjectNested<N>>{

        
    public N and();    public N endTokenReviewObject();
}
    public interface BindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<AdmissionRequestFluent.BindingObjectNested<N>>{

        
    public N and();    public N endBindingObject();
}
    public interface SecretObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<AdmissionRequestFluent.SecretObjectNested<N>>{

        
    public N and();    public N endSecretObject();
}
    public interface SecurityContextConstraintsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<AdmissionRequestFluent.SecurityContextConstraintsObjectNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsObject();
}
    public interface NetNamespaceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<AdmissionRequestFluent.NetNamespaceObjectNested<N>>{

        
    public N and();    public N endNetNamespaceObject();
}
    public interface NodeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<AdmissionRequestFluent.NodeObjectNested<N>>{

        
    public N and();    public N endNodeObject();
}
    public interface JobObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<AdmissionRequestFluent.JobObjectNested<N>>{

        
    public N and();    public N endJobObject();
}
    public interface CertificateSigningRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<AdmissionRequestFluent.CertificateSigningRequestObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestObject();
}
    public interface ServiceAccountObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<AdmissionRequestFluent.ServiceAccountObjectNested<N>>{

        
    public N and();    public N endServiceAccountObject();
}
    public interface ValidatingWebhookConfigurationOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationOldObject();
}
    public interface StorageClassOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<AdmissionRequestFluent.StorageClassOldObjectNested<N>>{

        
    public N and();    public N endStorageClassOldObject();
}
    public interface ClusterRoleBindingOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<N>>{

        
    public N and();    public N endClusterRoleBindingOldObject();
}
    public interface OpenshiftRoleBindingOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingOldObject();
}
    public interface PodDisruptionBudgetOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetOldObject();
}
    public interface NetworkPolicyOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<AdmissionRequestFluent.NetworkPolicyOldObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyOldObject();
}
    public interface OpenshiftClusterRoleBindingOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingOldObject();
}
    public interface RouteOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<AdmissionRequestFluent.RouteOldObjectNested<N>>{

        
    public N and();    public N endRouteOldObject();
}
    public interface NamespaceOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<AdmissionRequestFluent.NamespaceOldObjectNested<N>>{

        
    public N and();    public N endNamespaceOldObject();
}
    public interface LocalSubjectAccessReviewOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewOldObject();
}
    public interface ServiceOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<AdmissionRequestFluent.ServiceOldObjectNested<N>>{

        
    public N and();    public N endServiceOldObject();
}
    public interface ReplicationControllerOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<AdmissionRequestFluent.ReplicationControllerOldObjectNested<N>>{

        
    public N and();    public N endReplicationControllerOldObject();
}
    public interface SubjectAccessReviewOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewFluent<AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<N>>{

        
    public N and();    public N endSubjectAccessReviewOldObject();
}
    public interface MutatingWebhookConfigurationOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationOldObject();
}
    public interface HorizontalPodAutoscalerOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerOldObject();
}
    public interface ScaleOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<AdmissionRequestFluent.ScaleOldObjectNested<N>>{

        
    public N and();    public N endScaleOldObject();
}
    public interface ImageOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<AdmissionRequestFluent.ImageOldObjectNested<N>>{

        
    public N and();    public N endImageOldObject();
}
    public interface ReplicaSetOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<AdmissionRequestFluent.ReplicaSetOldObjectNested<N>>{

        
    public N and();    public N endReplicaSetOldObject();
}
    public interface PodSecurityPolicyOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<N>>{

        
    public N and();    public N endPodSecurityPolicyOldObject();
}
    public interface CronJobOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<AdmissionRequestFluent.CronJobOldObjectNested<N>>{

        
    public N and();    public N endCronJobOldObject();
}
    public interface EndpointsOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<AdmissionRequestFluent.EndpointsOldObjectNested<N>>{

        
    public N and();    public N endEndpointsOldObject();
}
    public interface PodOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<AdmissionRequestFluent.PodOldObjectNested<N>>{

        
    public N and();    public N endPodOldObject();
}
    public interface ConfigMapOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<AdmissionRequestFluent.ConfigMapOldObjectNested<N>>{

        
    public N and();    public N endConfigMapOldObject();
}
    public interface CustomResourceDefinitionOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionOldObject();
}
    public interface BuildOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<AdmissionRequestFluent.BuildOldObjectNested<N>>{

        
    public N and();    public N endBuildOldObject();
}
    public interface ImageStreamTagOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<AdmissionRequestFluent.ImageStreamTagOldObjectNested<N>>{

        
    public N and();    public N endImageStreamTagOldObject();
}
    public interface GroupOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<AdmissionRequestFluent.GroupOldObjectNested<N>>{

        
    public N and();    public N endGroupOldObject();
}
    public interface ImageSignatureOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<AdmissionRequestFluent.ImageSignatureOldObjectNested<N>>{

        
    public N and();    public N endImageSignatureOldObject();
}
    public interface ResourceQuotaOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<AdmissionRequestFluent.ResourceQuotaOldObjectNested<N>>{

        
    public N and();    public N endResourceQuotaOldObject();
}
    public interface BuildRequestOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<AdmissionRequestFluent.BuildRequestOldObjectNested<N>>{

        
    public N and();    public N endBuildRequestOldObject();
}
    public interface DaemonSetOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<AdmissionRequestFluent.DaemonSetOldObjectNested<N>>{

        
    public N and();    public N endDaemonSetOldObject();
}
    public interface ImageStreamOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<AdmissionRequestFluent.ImageStreamOldObjectNested<N>>{

        
    public N and();    public N endImageStreamOldObject();
}
    public interface OpenshiftRoleOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<AdmissionRequestFluent.OpenshiftRoleOldObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleOldObject();
}
    public interface OAuthClientOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<AdmissionRequestFluent.OAuthClientOldObjectNested<N>>{

        
    public N and();    public N endOAuthClientOldObject();
}
    public interface IdentityOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<AdmissionRequestFluent.IdentityOldObjectNested<N>>{

        
    public N and();    public N endIdentityOldObject();
}
    public interface LimitRangeOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<AdmissionRequestFluent.LimitRangeOldObjectNested<N>>{

        
    public N and();    public N endLimitRangeOldObject();
}
    public interface ImageStreamImportOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<AdmissionRequestFluent.ImageStreamImportOldObjectNested<N>>{

        
    public N and();    public N endImageStreamImportOldObject();
}
    public interface OpenshiftRoleBindingRestrictionOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionOldObject();
}
    public interface RoleBindingOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<AdmissionRequestFluent.RoleBindingOldObjectNested<N>>{

        
    public N and();    public N endRoleBindingOldObject();
}
    public interface PodPresetOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<AdmissionRequestFluent.PodPresetOldObjectNested<N>>{

        
    public N and();    public N endPodPresetOldObject();
}
    public interface ProjectOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<AdmissionRequestFluent.ProjectOldObjectNested<N>>{

        
    public N and();    public N endProjectOldObject();
}
    public interface BuildConfigOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<AdmissionRequestFluent.BuildConfigOldObjectNested<N>>{

        
    public N and();    public N endBuildConfigOldObject();
}
    public interface ClusterRoleOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<AdmissionRequestFluent.ClusterRoleOldObjectNested<N>>{

        
    public N and();    public N endClusterRoleOldObject();
}
    public interface OAuthAuthorizeTokenOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenOldObject();
}
    public interface ProjectRequestOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<AdmissionRequestFluent.ProjectRequestOldObjectNested<N>>{

        
    public N and();    public N endProjectRequestOldObject();
}
    public interface PriorityClassOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<AdmissionRequestFluent.PriorityClassOldObjectNested<N>>{

        
    public N and();    public N endPriorityClassOldObject();
}
    public interface TemplateOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<AdmissionRequestFluent.TemplateOldObjectNested<N>>{

        
    public N and();    public N endTemplateOldObject();
}
    public interface OAuthClientAuthorizationOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationOldObject();
}
    public interface DeploymentOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<AdmissionRequestFluent.DeploymentOldObjectNested<N>>{

        
    public N and();    public N endDeploymentOldObject();
}
    public interface PodTemplateOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<AdmissionRequestFluent.PodTemplateOldObjectNested<N>>{

        
    public N and();    public N endPodTemplateOldObject();
}
    public interface EventOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<AdmissionRequestFluent.EventOldObjectNested<N>>{

        
    public N and();    public N endEventOldObject();
}
    public interface IngressOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<AdmissionRequestFluent.IngressOldObjectNested<N>>{

        
    public N and();    public N endIngressOldObject();
}
    public interface DeploymentConfigOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<AdmissionRequestFluent.DeploymentConfigOldObjectNested<N>>{

        
    public N and();    public N endDeploymentConfigOldObject();
}
    public interface OAuthAccessTokenOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<N>>{

        
    public N and();    public N endOAuthAccessTokenOldObject();
}
    public interface PersistentVolumeOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<AdmissionRequestFluent.PersistentVolumeOldObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeOldObject();
}
    public interface PersistentVolumeClaimOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimOldObject();
}
    public interface EventsEventOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<AdmissionRequestFluent.EventsEventOldObjectNested<N>>{

        
    public N and();    public N endEventsEventOldObject();
}
    public interface StatefulSetOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<AdmissionRequestFluent.StatefulSetOldObjectNested<N>>{

        
    public N and();    public N endStatefulSetOldObject();
}
    public interface OpenshiftClusterRoleOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleOldObject();
}
    public interface RoleOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<AdmissionRequestFluent.RoleOldObjectNested<N>>{

        
    public N and();    public N endRoleOldObject();
}
    public interface UserOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<AdmissionRequestFluent.UserOldObjectNested<N>>{

        
    public N and();    public N endUserOldObject();
}
    public interface ComponentStatusOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<AdmissionRequestFluent.ComponentStatusOldObjectNested<N>>{

        
    public N and();    public N endComponentStatusOldObject();
}
    public interface TokenReviewOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<AdmissionRequestFluent.TokenReviewOldObjectNested<N>>{

        
    public N and();    public N endTokenReviewOldObject();
}
    public interface BindingOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<AdmissionRequestFluent.BindingOldObjectNested<N>>{

        
    public N and();    public N endBindingOldObject();
}
    public interface SecretOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<AdmissionRequestFluent.SecretOldObjectNested<N>>{

        
    public N and();    public N endSecretOldObject();
}
    public interface SecurityContextConstraintsOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsOldObject();
}
    public interface NetNamespaceOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<AdmissionRequestFluent.NetNamespaceOldObjectNested<N>>{

        
    public N and();    public N endNetNamespaceOldObject();
}
    public interface NodeOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<AdmissionRequestFluent.NodeOldObjectNested<N>>{

        
    public N and();    public N endNodeOldObject();
}
    public interface JobOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<AdmissionRequestFluent.JobOldObjectNested<N>>{

        
    public N and();    public N endJobOldObject();
}
    public interface CertificateSigningRequestOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestOldObject();
}
    public interface ServiceAccountOldObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<AdmissionRequestFluent.ServiceAccountOldObjectNested<N>>{

        
    public N and();    public N endServiceAccountOldObject();
}
    public interface ResourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupVersionResourceFluent<AdmissionRequestFluent.ResourceNested<N>>{

        
    public N and();    public N endResource();
}
    public interface UserInfoNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserInfoFluent<AdmissionRequestFluent.UserInfoNested<N>>{

        
    public N and();    public N endUserInfo();
}


}
