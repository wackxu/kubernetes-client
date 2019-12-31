package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import java.util.ArrayList;
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
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.List;
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
import javax.validation.constraints.NotNull;
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
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
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
import java.util.Collection;
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

public interface BaseKubernetesListFluent<A extends BaseKubernetesListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(VisitableBuilder<? extends HasMetadata,?> builder);
    public A addToItems(int index,VisitableBuilder<? extends HasMetadata,?> builder);
    public A addToItems(int index,HasMetadata item);
    public A setToItems(int index,HasMetadata item);
    public A addToItems(HasMetadata... items);
    public A addAllToItems(Collection<HasMetadata> items);
    public A removeFromItems(VisitableBuilder<? extends HasMetadata,?> builder);
    public A removeFromItems(HasMetadata... items);
    public A removeAllFromItems(Collection<HasMetadata> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<HasMetadata> getItems();
    public List<HasMetadata> buildItems();
    public HasMetadata buildItem(int index);
    public HasMetadata buildFirstItem();
    public HasMetadata buildLastItem();
    public HasMetadata buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<VisitableBuilder<? extends HasMetadata,?>> predicate);
    public A withItems(List<HasMetadata> items);
    public A withItems(HasMetadata... items);
    public Boolean hasItems();
    public A addToValidatingWebhookConfigurationItems(int index,ValidatingWebhookConfiguration item);
    public A setToValidatingWebhookConfigurationItems(int index,ValidatingWebhookConfiguration item);
    public A addToValidatingWebhookConfigurationItems(ValidatingWebhookConfiguration... items);
    public A addAllToValidatingWebhookConfigurationItems(Collection<ValidatingWebhookConfiguration> items);
    public A removeFromValidatingWebhookConfigurationItems(ValidatingWebhookConfiguration... items);
    public A removeAllFromValidatingWebhookConfigurationItems(Collection<ValidatingWebhookConfiguration> items);
    public BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<A> setNewValidatingWebhookConfigurationItemLike(int index,ValidatingWebhookConfiguration item);
    public BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<A> addNewValidatingWebhookConfigurationItem();
    public BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<A> addNewValidatingWebhookConfigurationItemLike(ValidatingWebhookConfiguration item);
    public A addToStorageClassItems(int index,StorageClass item);
    public A setToStorageClassItems(int index,StorageClass item);
    public A addToStorageClassItems(StorageClass... items);
    public A addAllToStorageClassItems(Collection<StorageClass> items);
    public A removeFromStorageClassItems(StorageClass... items);
    public A removeAllFromStorageClassItems(Collection<StorageClass> items);
    public BaseKubernetesListFluent.StorageClassItemsNested<A> setNewStorageClassItemLike(int index,StorageClass item);
    public BaseKubernetesListFluent.StorageClassItemsNested<A> addNewStorageClassItem();
    public BaseKubernetesListFluent.StorageClassItemsNested<A> addNewStorageClassItemLike(StorageClass item);
    public A addToClusterRoleBindingItems(int index,ClusterRoleBinding item);
    public A setToClusterRoleBindingItems(int index,ClusterRoleBinding item);
    public A addToClusterRoleBindingItems(ClusterRoleBinding... items);
    public A addAllToClusterRoleBindingItems(Collection<ClusterRoleBinding> items);
    public A removeFromClusterRoleBindingItems(ClusterRoleBinding... items);
    public A removeAllFromClusterRoleBindingItems(Collection<ClusterRoleBinding> items);
    public BaseKubernetesListFluent.ClusterRoleBindingItemsNested<A> setNewClusterRoleBindingItemLike(int index,ClusterRoleBinding item);
    public BaseKubernetesListFluent.ClusterRoleBindingItemsNested<A> addNewClusterRoleBindingItem();
    public BaseKubernetesListFluent.ClusterRoleBindingItemsNested<A> addNewClusterRoleBindingItemLike(ClusterRoleBinding item);
    public A addToOpenshiftRoleBindingItems(int index,OpenshiftRoleBinding item);
    public A setToOpenshiftRoleBindingItems(int index,OpenshiftRoleBinding item);
    public A addToOpenshiftRoleBindingItems(OpenshiftRoleBinding... items);
    public A addAllToOpenshiftRoleBindingItems(Collection<OpenshiftRoleBinding> items);
    public A removeFromOpenshiftRoleBindingItems(OpenshiftRoleBinding... items);
    public A removeAllFromOpenshiftRoleBindingItems(Collection<OpenshiftRoleBinding> items);
    public BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<A> setNewOpenshiftRoleBindingItemLike(int index,OpenshiftRoleBinding item);
    public BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<A> addNewOpenshiftRoleBindingItem();
    public BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<A> addNewOpenshiftRoleBindingItemLike(OpenshiftRoleBinding item);
    public A addToPodDisruptionBudgetItems(int index,PodDisruptionBudget item);
    public A setToPodDisruptionBudgetItems(int index,PodDisruptionBudget item);
    public A addToPodDisruptionBudgetItems(PodDisruptionBudget... items);
    public A addAllToPodDisruptionBudgetItems(Collection<PodDisruptionBudget> items);
    public A removeFromPodDisruptionBudgetItems(PodDisruptionBudget... items);
    public A removeAllFromPodDisruptionBudgetItems(Collection<PodDisruptionBudget> items);
    public BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<A> setNewPodDisruptionBudgetItemLike(int index,PodDisruptionBudget item);
    public BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<A> addNewPodDisruptionBudgetItem();
    public BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<A> addNewPodDisruptionBudgetItemLike(PodDisruptionBudget item);
    public A addToNetworkPolicyItems(int index,NetworkPolicy item);
    public A setToNetworkPolicyItems(int index,NetworkPolicy item);
    public A addToNetworkPolicyItems(NetworkPolicy... items);
    public A addAllToNetworkPolicyItems(Collection<NetworkPolicy> items);
    public A removeFromNetworkPolicyItems(NetworkPolicy... items);
    public A removeAllFromNetworkPolicyItems(Collection<NetworkPolicy> items);
    public BaseKubernetesListFluent.NetworkPolicyItemsNested<A> setNewNetworkPolicyItemLike(int index,NetworkPolicy item);
    public BaseKubernetesListFluent.NetworkPolicyItemsNested<A> addNewNetworkPolicyItem();
    public BaseKubernetesListFluent.NetworkPolicyItemsNested<A> addNewNetworkPolicyItemLike(NetworkPolicy item);
    public A addToOpenshiftClusterRoleBindingItems(int index,OpenshiftClusterRoleBinding item);
    public A setToOpenshiftClusterRoleBindingItems(int index,OpenshiftClusterRoleBinding item);
    public A addToOpenshiftClusterRoleBindingItems(OpenshiftClusterRoleBinding... items);
    public A addAllToOpenshiftClusterRoleBindingItems(Collection<OpenshiftClusterRoleBinding> items);
    public A removeFromOpenshiftClusterRoleBindingItems(OpenshiftClusterRoleBinding... items);
    public A removeAllFromOpenshiftClusterRoleBindingItems(Collection<OpenshiftClusterRoleBinding> items);
    public BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<A> setNewOpenshiftClusterRoleBindingItemLike(int index,OpenshiftClusterRoleBinding item);
    public BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<A> addNewOpenshiftClusterRoleBindingItem();
    public BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<A> addNewOpenshiftClusterRoleBindingItemLike(OpenshiftClusterRoleBinding item);
    public A addToRouteItems(int index,Route item);
    public A setToRouteItems(int index,Route item);
    public A addToRouteItems(Route... items);
    public A addAllToRouteItems(Collection<Route> items);
    public A removeFromRouteItems(Route... items);
    public A removeAllFromRouteItems(Collection<Route> items);
    public BaseKubernetesListFluent.RouteItemsNested<A> setNewRouteItemLike(int index,Route item);
    public BaseKubernetesListFluent.RouteItemsNested<A> addNewRouteItem();
    public BaseKubernetesListFluent.RouteItemsNested<A> addNewRouteItemLike(Route item);
    public A addToNamespaceItems(int index,Namespace item);
    public A setToNamespaceItems(int index,Namespace item);
    public A addToNamespaceItems(Namespace... items);
    public A addAllToNamespaceItems(Collection<Namespace> items);
    public A removeFromNamespaceItems(Namespace... items);
    public A removeAllFromNamespaceItems(Collection<Namespace> items);
    public BaseKubernetesListFluent.NamespaceItemsNested<A> setNewNamespaceItemLike(int index,Namespace item);
    public BaseKubernetesListFluent.NamespaceItemsNested<A> addNewNamespaceItem();
    public BaseKubernetesListFluent.NamespaceItemsNested<A> addNewNamespaceItemLike(Namespace item);
    public A addToLocalSubjectAccessReviewItems(int index,LocalSubjectAccessReview item);
    public A setToLocalSubjectAccessReviewItems(int index,LocalSubjectAccessReview item);
    public A addToLocalSubjectAccessReviewItems(LocalSubjectAccessReview... items);
    public A addAllToLocalSubjectAccessReviewItems(Collection<LocalSubjectAccessReview> items);
    public A removeFromLocalSubjectAccessReviewItems(LocalSubjectAccessReview... items);
    public A removeAllFromLocalSubjectAccessReviewItems(Collection<LocalSubjectAccessReview> items);
    public BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<A> setNewLocalSubjectAccessReviewItemLike(int index,LocalSubjectAccessReview item);
    public BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<A> addNewLocalSubjectAccessReviewItem();
    public BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<A> addNewLocalSubjectAccessReviewItemLike(LocalSubjectAccessReview item);
    public A addToServiceItems(int index,Service item);
    public A setToServiceItems(int index,Service item);
    public A addToServiceItems(Service... items);
    public A addAllToServiceItems(Collection<Service> items);
    public A removeFromServiceItems(Service... items);
    public A removeAllFromServiceItems(Collection<Service> items);
    public BaseKubernetesListFluent.ServiceItemsNested<A> setNewServiceItemLike(int index,Service item);
    public BaseKubernetesListFluent.ServiceItemsNested<A> addNewServiceItem();
    public BaseKubernetesListFluent.ServiceItemsNested<A> addNewServiceItemLike(Service item);
    public A addToReplicationControllerItems(int index,ReplicationController item);
    public A setToReplicationControllerItems(int index,ReplicationController item);
    public A addToReplicationControllerItems(ReplicationController... items);
    public A addAllToReplicationControllerItems(Collection<ReplicationController> items);
    public A removeFromReplicationControllerItems(ReplicationController... items);
    public A removeAllFromReplicationControllerItems(Collection<ReplicationController> items);
    public BaseKubernetesListFluent.ReplicationControllerItemsNested<A> setNewReplicationControllerItemLike(int index,ReplicationController item);
    public BaseKubernetesListFluent.ReplicationControllerItemsNested<A> addNewReplicationControllerItem();
    public BaseKubernetesListFluent.ReplicationControllerItemsNested<A> addNewReplicationControllerItemLike(ReplicationController item);
    public A addToSubjectAccessReviewItems(int index,SubjectAccessReview item);
    public A setToSubjectAccessReviewItems(int index,SubjectAccessReview item);
    public A addToSubjectAccessReviewItems(SubjectAccessReview... items);
    public A addAllToSubjectAccessReviewItems(Collection<SubjectAccessReview> items);
    public A removeFromSubjectAccessReviewItems(SubjectAccessReview... items);
    public A removeAllFromSubjectAccessReviewItems(Collection<SubjectAccessReview> items);
    public BaseKubernetesListFluent.SubjectAccessReviewItemsNested<A> setNewSubjectAccessReviewItemLike(int index,SubjectAccessReview item);
    public BaseKubernetesListFluent.SubjectAccessReviewItemsNested<A> addNewSubjectAccessReviewItem();
    public BaseKubernetesListFluent.SubjectAccessReviewItemsNested<A> addNewSubjectAccessReviewItemLike(SubjectAccessReview item);
    public A addToMutatingWebhookConfigurationItems(int index,MutatingWebhookConfiguration item);
    public A setToMutatingWebhookConfigurationItems(int index,MutatingWebhookConfiguration item);
    public A addToMutatingWebhookConfigurationItems(MutatingWebhookConfiguration... items);
    public A addAllToMutatingWebhookConfigurationItems(Collection<MutatingWebhookConfiguration> items);
    public A removeFromMutatingWebhookConfigurationItems(MutatingWebhookConfiguration... items);
    public A removeAllFromMutatingWebhookConfigurationItems(Collection<MutatingWebhookConfiguration> items);
    public BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<A> setNewMutatingWebhookConfigurationItemLike(int index,MutatingWebhookConfiguration item);
    public BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<A> addNewMutatingWebhookConfigurationItem();
    public BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<A> addNewMutatingWebhookConfigurationItemLike(MutatingWebhookConfiguration item);
    public A addToHorizontalPodAutoscalerItems(int index,HorizontalPodAutoscaler item);
    public A setToHorizontalPodAutoscalerItems(int index,HorizontalPodAutoscaler item);
    public A addToHorizontalPodAutoscalerItems(HorizontalPodAutoscaler... items);
    public A addAllToHorizontalPodAutoscalerItems(Collection<HorizontalPodAutoscaler> items);
    public A removeFromHorizontalPodAutoscalerItems(HorizontalPodAutoscaler... items);
    public A removeAllFromHorizontalPodAutoscalerItems(Collection<HorizontalPodAutoscaler> items);
    public BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<A> setNewHorizontalPodAutoscalerItemLike(int index,HorizontalPodAutoscaler item);
    public BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<A> addNewHorizontalPodAutoscalerItem();
    public BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<A> addNewHorizontalPodAutoscalerItemLike(HorizontalPodAutoscaler item);
    public A addToScaleItems(int index,Scale item);
    public A setToScaleItems(int index,Scale item);
    public A addToScaleItems(Scale... items);
    public A addAllToScaleItems(Collection<Scale> items);
    public A removeFromScaleItems(Scale... items);
    public A removeAllFromScaleItems(Collection<Scale> items);
    public BaseKubernetesListFluent.ScaleItemsNested<A> setNewScaleItemLike(int index,Scale item);
    public BaseKubernetesListFluent.ScaleItemsNested<A> addNewScaleItem();
    public BaseKubernetesListFluent.ScaleItemsNested<A> addNewScaleItemLike(Scale item);
    public A addToImageItems(int index,Image item);
    public A setToImageItems(int index,Image item);
    public A addToImageItems(Image... items);
    public A addAllToImageItems(Collection<Image> items);
    public A removeFromImageItems(Image... items);
    public A removeAllFromImageItems(Collection<Image> items);
    public BaseKubernetesListFluent.ImageItemsNested<A> setNewImageItemLike(int index,Image item);
    public BaseKubernetesListFluent.ImageItemsNested<A> addNewImageItem();
    public BaseKubernetesListFluent.ImageItemsNested<A> addNewImageItemLike(Image item);
    public A addToReplicaSetItems(int index,ReplicaSet item);
    public A setToReplicaSetItems(int index,ReplicaSet item);
    public A addToReplicaSetItems(ReplicaSet... items);
    public A addAllToReplicaSetItems(Collection<ReplicaSet> items);
    public A removeFromReplicaSetItems(ReplicaSet... items);
    public A removeAllFromReplicaSetItems(Collection<ReplicaSet> items);
    public BaseKubernetesListFluent.ReplicaSetItemsNested<A> setNewReplicaSetItemLike(int index,ReplicaSet item);
    public BaseKubernetesListFluent.ReplicaSetItemsNested<A> addNewReplicaSetItem();
    public BaseKubernetesListFluent.ReplicaSetItemsNested<A> addNewReplicaSetItemLike(ReplicaSet item);
    public A addToPodSecurityPolicyItems(int index,PodSecurityPolicy item);
    public A setToPodSecurityPolicyItems(int index,PodSecurityPolicy item);
    public A addToPodSecurityPolicyItems(PodSecurityPolicy... items);
    public A addAllToPodSecurityPolicyItems(Collection<PodSecurityPolicy> items);
    public A removeFromPodSecurityPolicyItems(PodSecurityPolicy... items);
    public A removeAllFromPodSecurityPolicyItems(Collection<PodSecurityPolicy> items);
    public BaseKubernetesListFluent.PodSecurityPolicyItemsNested<A> setNewPodSecurityPolicyItemLike(int index,PodSecurityPolicy item);
    public BaseKubernetesListFluent.PodSecurityPolicyItemsNested<A> addNewPodSecurityPolicyItem();
    public BaseKubernetesListFluent.PodSecurityPolicyItemsNested<A> addNewPodSecurityPolicyItemLike(PodSecurityPolicy item);
    public A addToCronJobItems(int index,CronJob item);
    public A setToCronJobItems(int index,CronJob item);
    public A addToCronJobItems(CronJob... items);
    public A addAllToCronJobItems(Collection<CronJob> items);
    public A removeFromCronJobItems(CronJob... items);
    public A removeAllFromCronJobItems(Collection<CronJob> items);
    public BaseKubernetesListFluent.CronJobItemsNested<A> setNewCronJobItemLike(int index,CronJob item);
    public BaseKubernetesListFluent.CronJobItemsNested<A> addNewCronJobItem();
    public BaseKubernetesListFluent.CronJobItemsNested<A> addNewCronJobItemLike(CronJob item);
    public A addToEndpointsItems(int index,Endpoints item);
    public A setToEndpointsItems(int index,Endpoints item);
    public A addToEndpointsItems(Endpoints... items);
    public A addAllToEndpointsItems(Collection<Endpoints> items);
    public A removeFromEndpointsItems(Endpoints... items);
    public A removeAllFromEndpointsItems(Collection<Endpoints> items);
    public BaseKubernetesListFluent.EndpointsItemsNested<A> setNewEndpointsItemLike(int index,Endpoints item);
    public BaseKubernetesListFluent.EndpointsItemsNested<A> addNewEndpointsItem();
    public BaseKubernetesListFluent.EndpointsItemsNested<A> addNewEndpointsItemLike(Endpoints item);
    public A addToPodItems(int index,Pod item);
    public A setToPodItems(int index,Pod item);
    public A addToPodItems(Pod... items);
    public A addAllToPodItems(Collection<Pod> items);
    public A removeFromPodItems(Pod... items);
    public A removeAllFromPodItems(Collection<Pod> items);
    public BaseKubernetesListFluent.PodItemsNested<A> setNewPodItemLike(int index,Pod item);
    public BaseKubernetesListFluent.PodItemsNested<A> addNewPodItem();
    public BaseKubernetesListFluent.PodItemsNested<A> addNewPodItemLike(Pod item);
    public A addToConfigMapItems(int index,ConfigMap item);
    public A setToConfigMapItems(int index,ConfigMap item);
    public A addToConfigMapItems(ConfigMap... items);
    public A addAllToConfigMapItems(Collection<ConfigMap> items);
    public A removeFromConfigMapItems(ConfigMap... items);
    public A removeAllFromConfigMapItems(Collection<ConfigMap> items);
    public BaseKubernetesListFluent.ConfigMapItemsNested<A> setNewConfigMapItemLike(int index,ConfigMap item);
    public BaseKubernetesListFluent.ConfigMapItemsNested<A> addNewConfigMapItem();
    public BaseKubernetesListFluent.ConfigMapItemsNested<A> addNewConfigMapItemLike(ConfigMap item);
    public A addToCustomResourceDefinitionItems(int index,CustomResourceDefinition item);
    public A setToCustomResourceDefinitionItems(int index,CustomResourceDefinition item);
    public A addToCustomResourceDefinitionItems(CustomResourceDefinition... items);
    public A addAllToCustomResourceDefinitionItems(Collection<CustomResourceDefinition> items);
    public A removeFromCustomResourceDefinitionItems(CustomResourceDefinition... items);
    public A removeAllFromCustomResourceDefinitionItems(Collection<CustomResourceDefinition> items);
    public BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<A> setNewCustomResourceDefinitionItemLike(int index,CustomResourceDefinition item);
    public BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<A> addNewCustomResourceDefinitionItem();
    public BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<A> addNewCustomResourceDefinitionItemLike(CustomResourceDefinition item);
    public A addToBuildItems(int index,Build item);
    public A setToBuildItems(int index,Build item);
    public A addToBuildItems(Build... items);
    public A addAllToBuildItems(Collection<Build> items);
    public A removeFromBuildItems(Build... items);
    public A removeAllFromBuildItems(Collection<Build> items);
    public BaseKubernetesListFluent.BuildItemsNested<A> setNewBuildItemLike(int index,Build item);
    public BaseKubernetesListFluent.BuildItemsNested<A> addNewBuildItem();
    public BaseKubernetesListFluent.BuildItemsNested<A> addNewBuildItemLike(Build item);
    public A addToImageStreamTagItems(int index,ImageStreamTag item);
    public A setToImageStreamTagItems(int index,ImageStreamTag item);
    public A addToImageStreamTagItems(ImageStreamTag... items);
    public A addAllToImageStreamTagItems(Collection<ImageStreamTag> items);
    public A removeFromImageStreamTagItems(ImageStreamTag... items);
    public A removeAllFromImageStreamTagItems(Collection<ImageStreamTag> items);
    public BaseKubernetesListFluent.ImageStreamTagItemsNested<A> setNewImageStreamTagItemLike(int index,ImageStreamTag item);
    public BaseKubernetesListFluent.ImageStreamTagItemsNested<A> addNewImageStreamTagItem();
    public BaseKubernetesListFluent.ImageStreamTagItemsNested<A> addNewImageStreamTagItemLike(ImageStreamTag item);
    public A addToGroupItems(int index,Group item);
    public A setToGroupItems(int index,Group item);
    public A addToGroupItems(Group... items);
    public A addAllToGroupItems(Collection<Group> items);
    public A removeFromGroupItems(Group... items);
    public A removeAllFromGroupItems(Collection<Group> items);
    public BaseKubernetesListFluent.GroupItemsNested<A> setNewGroupItemLike(int index,Group item);
    public BaseKubernetesListFluent.GroupItemsNested<A> addNewGroupItem();
    public BaseKubernetesListFluent.GroupItemsNested<A> addNewGroupItemLike(Group item);
    public A addToImageSignatureItems(int index,ImageSignature item);
    public A setToImageSignatureItems(int index,ImageSignature item);
    public A addToImageSignatureItems(ImageSignature... items);
    public A addAllToImageSignatureItems(Collection<ImageSignature> items);
    public A removeFromImageSignatureItems(ImageSignature... items);
    public A removeAllFromImageSignatureItems(Collection<ImageSignature> items);
    public BaseKubernetesListFluent.ImageSignatureItemsNested<A> setNewImageSignatureItemLike(int index,ImageSignature item);
    public BaseKubernetesListFluent.ImageSignatureItemsNested<A> addNewImageSignatureItem();
    public BaseKubernetesListFluent.ImageSignatureItemsNested<A> addNewImageSignatureItemLike(ImageSignature item);
    public A addToResourceQuotaItems(int index,ResourceQuota item);
    public A setToResourceQuotaItems(int index,ResourceQuota item);
    public A addToResourceQuotaItems(ResourceQuota... items);
    public A addAllToResourceQuotaItems(Collection<ResourceQuota> items);
    public A removeFromResourceQuotaItems(ResourceQuota... items);
    public A removeAllFromResourceQuotaItems(Collection<ResourceQuota> items);
    public BaseKubernetesListFluent.ResourceQuotaItemsNested<A> setNewResourceQuotaItemLike(int index,ResourceQuota item);
    public BaseKubernetesListFluent.ResourceQuotaItemsNested<A> addNewResourceQuotaItem();
    public BaseKubernetesListFluent.ResourceQuotaItemsNested<A> addNewResourceQuotaItemLike(ResourceQuota item);
    public A addToBuildRequestItems(int index,BuildRequest item);
    public A setToBuildRequestItems(int index,BuildRequest item);
    public A addToBuildRequestItems(BuildRequest... items);
    public A addAllToBuildRequestItems(Collection<BuildRequest> items);
    public A removeFromBuildRequestItems(BuildRequest... items);
    public A removeAllFromBuildRequestItems(Collection<BuildRequest> items);
    public BaseKubernetesListFluent.BuildRequestItemsNested<A> setNewBuildRequestItemLike(int index,BuildRequest item);
    public BaseKubernetesListFluent.BuildRequestItemsNested<A> addNewBuildRequestItem();
    public BaseKubernetesListFluent.BuildRequestItemsNested<A> addNewBuildRequestItemLike(BuildRequest item);
    public A addToDaemonSetItems(int index,DaemonSet item);
    public A setToDaemonSetItems(int index,DaemonSet item);
    public A addToDaemonSetItems(DaemonSet... items);
    public A addAllToDaemonSetItems(Collection<DaemonSet> items);
    public A removeFromDaemonSetItems(DaemonSet... items);
    public A removeAllFromDaemonSetItems(Collection<DaemonSet> items);
    public BaseKubernetesListFluent.DaemonSetItemsNested<A> setNewDaemonSetItemLike(int index,DaemonSet item);
    public BaseKubernetesListFluent.DaemonSetItemsNested<A> addNewDaemonSetItem();
    public BaseKubernetesListFluent.DaemonSetItemsNested<A> addNewDaemonSetItemLike(DaemonSet item);
    public A addToImageStreamItems(int index,ImageStream item);
    public A setToImageStreamItems(int index,ImageStream item);
    public A addToImageStreamItems(ImageStream... items);
    public A addAllToImageStreamItems(Collection<ImageStream> items);
    public A removeFromImageStreamItems(ImageStream... items);
    public A removeAllFromImageStreamItems(Collection<ImageStream> items);
    public BaseKubernetesListFluent.ImageStreamItemsNested<A> setNewImageStreamItemLike(int index,ImageStream item);
    public BaseKubernetesListFluent.ImageStreamItemsNested<A> addNewImageStreamItem();
    public BaseKubernetesListFluent.ImageStreamItemsNested<A> addNewImageStreamItemLike(ImageStream item);
    public A addToOpenshiftRoleItems(int index,OpenshiftRole item);
    public A setToOpenshiftRoleItems(int index,OpenshiftRole item);
    public A addToOpenshiftRoleItems(OpenshiftRole... items);
    public A addAllToOpenshiftRoleItems(Collection<OpenshiftRole> items);
    public A removeFromOpenshiftRoleItems(OpenshiftRole... items);
    public A removeAllFromOpenshiftRoleItems(Collection<OpenshiftRole> items);
    public BaseKubernetesListFluent.OpenshiftRoleItemsNested<A> setNewOpenshiftRoleItemLike(int index,OpenshiftRole item);
    public BaseKubernetesListFluent.OpenshiftRoleItemsNested<A> addNewOpenshiftRoleItem();
    public BaseKubernetesListFluent.OpenshiftRoleItemsNested<A> addNewOpenshiftRoleItemLike(OpenshiftRole item);
    public A addToOAuthClientItems(int index,OAuthClient item);
    public A setToOAuthClientItems(int index,OAuthClient item);
    public A addToOAuthClientItems(OAuthClient... items);
    public A addAllToOAuthClientItems(Collection<OAuthClient> items);
    public A removeFromOAuthClientItems(OAuthClient... items);
    public A removeAllFromOAuthClientItems(Collection<OAuthClient> items);
    public BaseKubernetesListFluent.OAuthClientItemsNested<A> setNewOAuthClientItemLike(int index,OAuthClient item);
    public BaseKubernetesListFluent.OAuthClientItemsNested<A> addNewOAuthClientItem();
    public BaseKubernetesListFluent.OAuthClientItemsNested<A> addNewOAuthClientItemLike(OAuthClient item);
    public A addToIdentityItems(int index,Identity item);
    public A setToIdentityItems(int index,Identity item);
    public A addToIdentityItems(Identity... items);
    public A addAllToIdentityItems(Collection<Identity> items);
    public A removeFromIdentityItems(Identity... items);
    public A removeAllFromIdentityItems(Collection<Identity> items);
    public BaseKubernetesListFluent.IdentityItemsNested<A> setNewIdentityItemLike(int index,Identity item);
    public BaseKubernetesListFluent.IdentityItemsNested<A> addNewIdentityItem();
    public BaseKubernetesListFluent.IdentityItemsNested<A> addNewIdentityItemLike(Identity item);
    public A addToLimitRangeItems(int index,LimitRange item);
    public A setToLimitRangeItems(int index,LimitRange item);
    public A addToLimitRangeItems(LimitRange... items);
    public A addAllToLimitRangeItems(Collection<LimitRange> items);
    public A removeFromLimitRangeItems(LimitRange... items);
    public A removeAllFromLimitRangeItems(Collection<LimitRange> items);
    public BaseKubernetesListFluent.LimitRangeItemsNested<A> setNewLimitRangeItemLike(int index,LimitRange item);
    public BaseKubernetesListFluent.LimitRangeItemsNested<A> addNewLimitRangeItem();
    public BaseKubernetesListFluent.LimitRangeItemsNested<A> addNewLimitRangeItemLike(LimitRange item);
    public A addToImageStreamImportItems(int index,ImageStreamImport item);
    public A setToImageStreamImportItems(int index,ImageStreamImport item);
    public A addToImageStreamImportItems(ImageStreamImport... items);
    public A addAllToImageStreamImportItems(Collection<ImageStreamImport> items);
    public A removeFromImageStreamImportItems(ImageStreamImport... items);
    public A removeAllFromImageStreamImportItems(Collection<ImageStreamImport> items);
    public BaseKubernetesListFluent.ImageStreamImportItemsNested<A> setNewImageStreamImportItemLike(int index,ImageStreamImport item);
    public BaseKubernetesListFluent.ImageStreamImportItemsNested<A> addNewImageStreamImportItem();
    public BaseKubernetesListFluent.ImageStreamImportItemsNested<A> addNewImageStreamImportItemLike(ImageStreamImport item);
    public A addToOpenshiftRoleBindingRestrictionItems(int index,OpenshiftRoleBindingRestriction item);
    public A setToOpenshiftRoleBindingRestrictionItems(int index,OpenshiftRoleBindingRestriction item);
    public A addToOpenshiftRoleBindingRestrictionItems(OpenshiftRoleBindingRestriction... items);
    public A addAllToOpenshiftRoleBindingRestrictionItems(Collection<OpenshiftRoleBindingRestriction> items);
    public A removeFromOpenshiftRoleBindingRestrictionItems(OpenshiftRoleBindingRestriction... items);
    public A removeAllFromOpenshiftRoleBindingRestrictionItems(Collection<OpenshiftRoleBindingRestriction> items);
    public BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<A> setNewOpenshiftRoleBindingRestrictionItemLike(int index,OpenshiftRoleBindingRestriction item);
    public BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<A> addNewOpenshiftRoleBindingRestrictionItem();
    public BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<A> addNewOpenshiftRoleBindingRestrictionItemLike(OpenshiftRoleBindingRestriction item);
    public A addToRoleBindingItems(int index,RoleBinding item);
    public A setToRoleBindingItems(int index,RoleBinding item);
    public A addToRoleBindingItems(RoleBinding... items);
    public A addAllToRoleBindingItems(Collection<RoleBinding> items);
    public A removeFromRoleBindingItems(RoleBinding... items);
    public A removeAllFromRoleBindingItems(Collection<RoleBinding> items);
    public BaseKubernetesListFluent.RoleBindingItemsNested<A> setNewRoleBindingItemLike(int index,RoleBinding item);
    public BaseKubernetesListFluent.RoleBindingItemsNested<A> addNewRoleBindingItem();
    public BaseKubernetesListFluent.RoleBindingItemsNested<A> addNewRoleBindingItemLike(RoleBinding item);
    public A addToPodPresetItems(int index,PodPreset item);
    public A setToPodPresetItems(int index,PodPreset item);
    public A addToPodPresetItems(PodPreset... items);
    public A addAllToPodPresetItems(Collection<PodPreset> items);
    public A removeFromPodPresetItems(PodPreset... items);
    public A removeAllFromPodPresetItems(Collection<PodPreset> items);
    public BaseKubernetesListFluent.PodPresetItemsNested<A> setNewPodPresetItemLike(int index,PodPreset item);
    public BaseKubernetesListFluent.PodPresetItemsNested<A> addNewPodPresetItem();
    public BaseKubernetesListFluent.PodPresetItemsNested<A> addNewPodPresetItemLike(PodPreset item);
    public A addToProjectItems(int index,Project item);
    public A setToProjectItems(int index,Project item);
    public A addToProjectItems(Project... items);
    public A addAllToProjectItems(Collection<Project> items);
    public A removeFromProjectItems(Project... items);
    public A removeAllFromProjectItems(Collection<Project> items);
    public BaseKubernetesListFluent.ProjectItemsNested<A> setNewProjectItemLike(int index,Project item);
    public BaseKubernetesListFluent.ProjectItemsNested<A> addNewProjectItem();
    public BaseKubernetesListFluent.ProjectItemsNested<A> addNewProjectItemLike(Project item);
    public A addToBuildConfigItems(int index,BuildConfig item);
    public A setToBuildConfigItems(int index,BuildConfig item);
    public A addToBuildConfigItems(BuildConfig... items);
    public A addAllToBuildConfigItems(Collection<BuildConfig> items);
    public A removeFromBuildConfigItems(BuildConfig... items);
    public A removeAllFromBuildConfigItems(Collection<BuildConfig> items);
    public BaseKubernetesListFluent.BuildConfigItemsNested<A> setNewBuildConfigItemLike(int index,BuildConfig item);
    public BaseKubernetesListFluent.BuildConfigItemsNested<A> addNewBuildConfigItem();
    public BaseKubernetesListFluent.BuildConfigItemsNested<A> addNewBuildConfigItemLike(BuildConfig item);
    public A addToClusterRoleItems(int index,ClusterRole item);
    public A setToClusterRoleItems(int index,ClusterRole item);
    public A addToClusterRoleItems(ClusterRole... items);
    public A addAllToClusterRoleItems(Collection<ClusterRole> items);
    public A removeFromClusterRoleItems(ClusterRole... items);
    public A removeAllFromClusterRoleItems(Collection<ClusterRole> items);
    public BaseKubernetesListFluent.ClusterRoleItemsNested<A> setNewClusterRoleItemLike(int index,ClusterRole item);
    public BaseKubernetesListFluent.ClusterRoleItemsNested<A> addNewClusterRoleItem();
    public BaseKubernetesListFluent.ClusterRoleItemsNested<A> addNewClusterRoleItemLike(ClusterRole item);
    public A addToOAuthAuthorizeTokenItems(int index,OAuthAuthorizeToken item);
    public A setToOAuthAuthorizeTokenItems(int index,OAuthAuthorizeToken item);
    public A addToOAuthAuthorizeTokenItems(OAuthAuthorizeToken... items);
    public A addAllToOAuthAuthorizeTokenItems(Collection<OAuthAuthorizeToken> items);
    public A removeFromOAuthAuthorizeTokenItems(OAuthAuthorizeToken... items);
    public A removeAllFromOAuthAuthorizeTokenItems(Collection<OAuthAuthorizeToken> items);
    public BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<A> setNewOAuthAuthorizeTokenItemLike(int index,OAuthAuthorizeToken item);
    public BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<A> addNewOAuthAuthorizeTokenItem();
    public BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<A> addNewOAuthAuthorizeTokenItemLike(OAuthAuthorizeToken item);
    public A addToProjectRequestItems(int index,ProjectRequest item);
    public A setToProjectRequestItems(int index,ProjectRequest item);
    public A addToProjectRequestItems(ProjectRequest... items);
    public A addAllToProjectRequestItems(Collection<ProjectRequest> items);
    public A removeFromProjectRequestItems(ProjectRequest... items);
    public A removeAllFromProjectRequestItems(Collection<ProjectRequest> items);
    public BaseKubernetesListFluent.ProjectRequestItemsNested<A> setNewProjectRequestItemLike(int index,ProjectRequest item);
    public BaseKubernetesListFluent.ProjectRequestItemsNested<A> addNewProjectRequestItem();
    public BaseKubernetesListFluent.ProjectRequestItemsNested<A> addNewProjectRequestItemLike(ProjectRequest item);
    public A addToPriorityClassItems(int index,PriorityClass item);
    public A setToPriorityClassItems(int index,PriorityClass item);
    public A addToPriorityClassItems(PriorityClass... items);
    public A addAllToPriorityClassItems(Collection<PriorityClass> items);
    public A removeFromPriorityClassItems(PriorityClass... items);
    public A removeAllFromPriorityClassItems(Collection<PriorityClass> items);
    public BaseKubernetesListFluent.PriorityClassItemsNested<A> setNewPriorityClassItemLike(int index,PriorityClass item);
    public BaseKubernetesListFluent.PriorityClassItemsNested<A> addNewPriorityClassItem();
    public BaseKubernetesListFluent.PriorityClassItemsNested<A> addNewPriorityClassItemLike(PriorityClass item);
    public A addToTemplateItems(int index,Template item);
    public A setToTemplateItems(int index,Template item);
    public A addToTemplateItems(Template... items);
    public A addAllToTemplateItems(Collection<Template> items);
    public A removeFromTemplateItems(Template... items);
    public A removeAllFromTemplateItems(Collection<Template> items);
    public BaseKubernetesListFluent.TemplateItemsNested<A> setNewTemplateItemLike(int index,Template item);
    public BaseKubernetesListFluent.TemplateItemsNested<A> addNewTemplateItem();
    public BaseKubernetesListFluent.TemplateItemsNested<A> addNewTemplateItemLike(Template item);
    public A addToOAuthClientAuthorizationItems(int index,OAuthClientAuthorization item);
    public A setToOAuthClientAuthorizationItems(int index,OAuthClientAuthorization item);
    public A addToOAuthClientAuthorizationItems(OAuthClientAuthorization... items);
    public A addAllToOAuthClientAuthorizationItems(Collection<OAuthClientAuthorization> items);
    public A removeFromOAuthClientAuthorizationItems(OAuthClientAuthorization... items);
    public A removeAllFromOAuthClientAuthorizationItems(Collection<OAuthClientAuthorization> items);
    public BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<A> setNewOAuthClientAuthorizationItemLike(int index,OAuthClientAuthorization item);
    public BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<A> addNewOAuthClientAuthorizationItem();
    public BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<A> addNewOAuthClientAuthorizationItemLike(OAuthClientAuthorization item);
    public A addToDeploymentItems(int index,Deployment item);
    public A setToDeploymentItems(int index,Deployment item);
    public A addToDeploymentItems(Deployment... items);
    public A addAllToDeploymentItems(Collection<Deployment> items);
    public A removeFromDeploymentItems(Deployment... items);
    public A removeAllFromDeploymentItems(Collection<Deployment> items);
    public BaseKubernetesListFluent.DeploymentItemsNested<A> setNewDeploymentItemLike(int index,Deployment item);
    public BaseKubernetesListFluent.DeploymentItemsNested<A> addNewDeploymentItem();
    public BaseKubernetesListFluent.DeploymentItemsNested<A> addNewDeploymentItemLike(Deployment item);
    public A addToPodTemplateItems(int index,PodTemplate item);
    public A setToPodTemplateItems(int index,PodTemplate item);
    public A addToPodTemplateItems(PodTemplate... items);
    public A addAllToPodTemplateItems(Collection<PodTemplate> items);
    public A removeFromPodTemplateItems(PodTemplate... items);
    public A removeAllFromPodTemplateItems(Collection<PodTemplate> items);
    public BaseKubernetesListFluent.PodTemplateItemsNested<A> setNewPodTemplateItemLike(int index,PodTemplate item);
    public BaseKubernetesListFluent.PodTemplateItemsNested<A> addNewPodTemplateItem();
    public BaseKubernetesListFluent.PodTemplateItemsNested<A> addNewPodTemplateItemLike(PodTemplate item);
    public A addToEventItems(int index,Event item);
    public A setToEventItems(int index,Event item);
    public A addToEventItems(Event... items);
    public A addAllToEventItems(Collection<Event> items);
    public A removeFromEventItems(Event... items);
    public A removeAllFromEventItems(Collection<Event> items);
    public BaseKubernetesListFluent.EventItemsNested<A> setNewEventItemLike(int index,Event item);
    public BaseKubernetesListFluent.EventItemsNested<A> addNewEventItem();
    public BaseKubernetesListFluent.EventItemsNested<A> addNewEventItemLike(Event item);
    public A addToIngressItems(int index,Ingress item);
    public A setToIngressItems(int index,Ingress item);
    public A addToIngressItems(Ingress... items);
    public A addAllToIngressItems(Collection<Ingress> items);
    public A removeFromIngressItems(Ingress... items);
    public A removeAllFromIngressItems(Collection<Ingress> items);
    public BaseKubernetesListFluent.IngressItemsNested<A> setNewIngressItemLike(int index,Ingress item);
    public BaseKubernetesListFluent.IngressItemsNested<A> addNewIngressItem();
    public BaseKubernetesListFluent.IngressItemsNested<A> addNewIngressItemLike(Ingress item);
    public A addToDeploymentConfigItems(int index,DeploymentConfig item);
    public A setToDeploymentConfigItems(int index,DeploymentConfig item);
    public A addToDeploymentConfigItems(DeploymentConfig... items);
    public A addAllToDeploymentConfigItems(Collection<DeploymentConfig> items);
    public A removeFromDeploymentConfigItems(DeploymentConfig... items);
    public A removeAllFromDeploymentConfigItems(Collection<DeploymentConfig> items);
    public BaseKubernetesListFluent.DeploymentConfigItemsNested<A> setNewDeploymentConfigItemLike(int index,DeploymentConfig item);
    public BaseKubernetesListFluent.DeploymentConfigItemsNested<A> addNewDeploymentConfigItem();
    public BaseKubernetesListFluent.DeploymentConfigItemsNested<A> addNewDeploymentConfigItemLike(DeploymentConfig item);
    public A addToOAuthAccessTokenItems(int index,OAuthAccessToken item);
    public A setToOAuthAccessTokenItems(int index,OAuthAccessToken item);
    public A addToOAuthAccessTokenItems(OAuthAccessToken... items);
    public A addAllToOAuthAccessTokenItems(Collection<OAuthAccessToken> items);
    public A removeFromOAuthAccessTokenItems(OAuthAccessToken... items);
    public A removeAllFromOAuthAccessTokenItems(Collection<OAuthAccessToken> items);
    public BaseKubernetesListFluent.OAuthAccessTokenItemsNested<A> setNewOAuthAccessTokenItemLike(int index,OAuthAccessToken item);
    public BaseKubernetesListFluent.OAuthAccessTokenItemsNested<A> addNewOAuthAccessTokenItem();
    public BaseKubernetesListFluent.OAuthAccessTokenItemsNested<A> addNewOAuthAccessTokenItemLike(OAuthAccessToken item);
    public A addToPersistentVolumeItems(int index,PersistentVolume item);
    public A setToPersistentVolumeItems(int index,PersistentVolume item);
    public A addToPersistentVolumeItems(PersistentVolume... items);
    public A addAllToPersistentVolumeItems(Collection<PersistentVolume> items);
    public A removeFromPersistentVolumeItems(PersistentVolume... items);
    public A removeAllFromPersistentVolumeItems(Collection<PersistentVolume> items);
    public BaseKubernetesListFluent.PersistentVolumeItemsNested<A> setNewPersistentVolumeItemLike(int index,PersistentVolume item);
    public BaseKubernetesListFluent.PersistentVolumeItemsNested<A> addNewPersistentVolumeItem();
    public BaseKubernetesListFluent.PersistentVolumeItemsNested<A> addNewPersistentVolumeItemLike(PersistentVolume item);
    public A addToPersistentVolumeClaimItems(int index,PersistentVolumeClaim item);
    public A setToPersistentVolumeClaimItems(int index,PersistentVolumeClaim item);
    public A addToPersistentVolumeClaimItems(PersistentVolumeClaim... items);
    public A addAllToPersistentVolumeClaimItems(Collection<PersistentVolumeClaim> items);
    public A removeFromPersistentVolumeClaimItems(PersistentVolumeClaim... items);
    public A removeAllFromPersistentVolumeClaimItems(Collection<PersistentVolumeClaim> items);
    public BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<A> setNewPersistentVolumeClaimItemLike(int index,PersistentVolumeClaim item);
    public BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<A> addNewPersistentVolumeClaimItem();
    public BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<A> addNewPersistentVolumeClaimItemLike(PersistentVolumeClaim item);
    public A addToEventItems(int index,io.fabric8.kubernetes.api.model.events.Event item);
    public A setToEventItems(int index,io.fabric8.kubernetes.api.model.events.Event item);
    public A addToEventItems(io.fabric8.kubernetes.api.model.events.Event... items);
    public A addAllToEventsEventItems(Collection<io.fabric8.kubernetes.api.model.events.Event> items);
    public A removeFromEventItems(io.fabric8.kubernetes.api.model.events.Event... items);
    public A removeAllFromEventsEventItems(Collection<io.fabric8.kubernetes.api.model.events.Event> items);
    public BaseKubernetesListFluent.EventsEventItemsNested<A> setNewEventItemLike(int index,io.fabric8.kubernetes.api.model.events.Event item);
    public BaseKubernetesListFluent.EventsEventItemsNested<A> addNewEventsEventItem();
    public BaseKubernetesListFluent.EventsEventItemsNested<A> addNewEventItemLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A addToStatefulSetItems(int index,StatefulSet item);
    public A setToStatefulSetItems(int index,StatefulSet item);
    public A addToStatefulSetItems(StatefulSet... items);
    public A addAllToStatefulSetItems(Collection<StatefulSet> items);
    public A removeFromStatefulSetItems(StatefulSet... items);
    public A removeAllFromStatefulSetItems(Collection<StatefulSet> items);
    public BaseKubernetesListFluent.StatefulSetItemsNested<A> setNewStatefulSetItemLike(int index,StatefulSet item);
    public BaseKubernetesListFluent.StatefulSetItemsNested<A> addNewStatefulSetItem();
    public BaseKubernetesListFluent.StatefulSetItemsNested<A> addNewStatefulSetItemLike(StatefulSet item);
    public A addToOpenshiftClusterRoleItems(int index,OpenshiftClusterRole item);
    public A setToOpenshiftClusterRoleItems(int index,OpenshiftClusterRole item);
    public A addToOpenshiftClusterRoleItems(OpenshiftClusterRole... items);
    public A addAllToOpenshiftClusterRoleItems(Collection<OpenshiftClusterRole> items);
    public A removeFromOpenshiftClusterRoleItems(OpenshiftClusterRole... items);
    public A removeAllFromOpenshiftClusterRoleItems(Collection<OpenshiftClusterRole> items);
    public BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<A> setNewOpenshiftClusterRoleItemLike(int index,OpenshiftClusterRole item);
    public BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<A> addNewOpenshiftClusterRoleItem();
    public BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<A> addNewOpenshiftClusterRoleItemLike(OpenshiftClusterRole item);
    public A addToRoleItems(int index,Role item);
    public A setToRoleItems(int index,Role item);
    public A addToRoleItems(Role... items);
    public A addAllToRoleItems(Collection<Role> items);
    public A removeFromRoleItems(Role... items);
    public A removeAllFromRoleItems(Collection<Role> items);
    public BaseKubernetesListFluent.RoleItemsNested<A> setNewRoleItemLike(int index,Role item);
    public BaseKubernetesListFluent.RoleItemsNested<A> addNewRoleItem();
    public BaseKubernetesListFluent.RoleItemsNested<A> addNewRoleItemLike(Role item);
    public A addToUserItems(int index,User item);
    public A setToUserItems(int index,User item);
    public A addToUserItems(User... items);
    public A addAllToUserItems(Collection<User> items);
    public A removeFromUserItems(User... items);
    public A removeAllFromUserItems(Collection<User> items);
    public BaseKubernetesListFluent.UserItemsNested<A> setNewUserItemLike(int index,User item);
    public BaseKubernetesListFluent.UserItemsNested<A> addNewUserItem();
    public BaseKubernetesListFluent.UserItemsNested<A> addNewUserItemLike(User item);
    public A addToComponentStatusItems(int index,ComponentStatus item);
    public A setToComponentStatusItems(int index,ComponentStatus item);
    public A addToComponentStatusItems(ComponentStatus... items);
    public A addAllToComponentStatusItems(Collection<ComponentStatus> items);
    public A removeFromComponentStatusItems(ComponentStatus... items);
    public A removeAllFromComponentStatusItems(Collection<ComponentStatus> items);
    public BaseKubernetesListFluent.ComponentStatusItemsNested<A> setNewComponentStatusItemLike(int index,ComponentStatus item);
    public BaseKubernetesListFluent.ComponentStatusItemsNested<A> addNewComponentStatusItem();
    public BaseKubernetesListFluent.ComponentStatusItemsNested<A> addNewComponentStatusItemLike(ComponentStatus item);
    public A addToTokenReviewItems(int index,TokenReview item);
    public A setToTokenReviewItems(int index,TokenReview item);
    public A addToTokenReviewItems(TokenReview... items);
    public A addAllToTokenReviewItems(Collection<TokenReview> items);
    public A removeFromTokenReviewItems(TokenReview... items);
    public A removeAllFromTokenReviewItems(Collection<TokenReview> items);
    public BaseKubernetesListFluent.TokenReviewItemsNested<A> setNewTokenReviewItemLike(int index,TokenReview item);
    public BaseKubernetesListFluent.TokenReviewItemsNested<A> addNewTokenReviewItem();
    public BaseKubernetesListFluent.TokenReviewItemsNested<A> addNewTokenReviewItemLike(TokenReview item);
    public A addToBindingItems(int index,Binding item);
    public A setToBindingItems(int index,Binding item);
    public A addToBindingItems(Binding... items);
    public A addAllToBindingItems(Collection<Binding> items);
    public A removeFromBindingItems(Binding... items);
    public A removeAllFromBindingItems(Collection<Binding> items);
    public BaseKubernetesListFluent.BindingItemsNested<A> setNewBindingItemLike(int index,Binding item);
    public BaseKubernetesListFluent.BindingItemsNested<A> addNewBindingItem();
    public BaseKubernetesListFluent.BindingItemsNested<A> addNewBindingItemLike(Binding item);
    public A addToSecretItems(int index,Secret item);
    public A setToSecretItems(int index,Secret item);
    public A addToSecretItems(Secret... items);
    public A addAllToSecretItems(Collection<Secret> items);
    public A removeFromSecretItems(Secret... items);
    public A removeAllFromSecretItems(Collection<Secret> items);
    public BaseKubernetesListFluent.SecretItemsNested<A> setNewSecretItemLike(int index,Secret item);
    public BaseKubernetesListFluent.SecretItemsNested<A> addNewSecretItem();
    public BaseKubernetesListFluent.SecretItemsNested<A> addNewSecretItemLike(Secret item);
    public A addToSecurityContextConstraintsItems(int index,SecurityContextConstraints item);
    public A setToSecurityContextConstraintsItems(int index,SecurityContextConstraints item);
    public A addToSecurityContextConstraintsItems(SecurityContextConstraints... items);
    public A addAllToSecurityContextConstraintsItems(Collection<SecurityContextConstraints> items);
    public A removeFromSecurityContextConstraintsItems(SecurityContextConstraints... items);
    public A removeAllFromSecurityContextConstraintsItems(Collection<SecurityContextConstraints> items);
    public BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<A> setNewSecurityContextConstraintsItemLike(int index,SecurityContextConstraints item);
    public BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<A> addNewSecurityContextConstraintsItem();
    public BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<A> addNewSecurityContextConstraintsItemLike(SecurityContextConstraints item);
    public A addToNetNamespaceItems(int index,NetNamespace item);
    public A setToNetNamespaceItems(int index,NetNamespace item);
    public A addToNetNamespaceItems(NetNamespace... items);
    public A addAllToNetNamespaceItems(Collection<NetNamespace> items);
    public A removeFromNetNamespaceItems(NetNamespace... items);
    public A removeAllFromNetNamespaceItems(Collection<NetNamespace> items);
    public BaseKubernetesListFluent.NetNamespaceItemsNested<A> setNewNetNamespaceItemLike(int index,NetNamespace item);
    public BaseKubernetesListFluent.NetNamespaceItemsNested<A> addNewNetNamespaceItem();
    public BaseKubernetesListFluent.NetNamespaceItemsNested<A> addNewNetNamespaceItemLike(NetNamespace item);
    public A addToNodeItems(int index,Node item);
    public A setToNodeItems(int index,Node item);
    public A addToNodeItems(Node... items);
    public A addAllToNodeItems(Collection<Node> items);
    public A removeFromNodeItems(Node... items);
    public A removeAllFromNodeItems(Collection<Node> items);
    public BaseKubernetesListFluent.NodeItemsNested<A> setNewNodeItemLike(int index,Node item);
    public BaseKubernetesListFluent.NodeItemsNested<A> addNewNodeItem();
    public BaseKubernetesListFluent.NodeItemsNested<A> addNewNodeItemLike(Node item);
    public A addToJobItems(int index,Job item);
    public A setToJobItems(int index,Job item);
    public A addToJobItems(Job... items);
    public A addAllToJobItems(Collection<Job> items);
    public A removeFromJobItems(Job... items);
    public A removeAllFromJobItems(Collection<Job> items);
    public BaseKubernetesListFluent.JobItemsNested<A> setNewJobItemLike(int index,Job item);
    public BaseKubernetesListFluent.JobItemsNested<A> addNewJobItem();
    public BaseKubernetesListFluent.JobItemsNested<A> addNewJobItemLike(Job item);
    public A addToCertificateSigningRequestItems(int index,CertificateSigningRequest item);
    public A setToCertificateSigningRequestItems(int index,CertificateSigningRequest item);
    public A addToCertificateSigningRequestItems(CertificateSigningRequest... items);
    public A addAllToCertificateSigningRequestItems(Collection<CertificateSigningRequest> items);
    public A removeFromCertificateSigningRequestItems(CertificateSigningRequest... items);
    public A removeAllFromCertificateSigningRequestItems(Collection<CertificateSigningRequest> items);
    public BaseKubernetesListFluent.CertificateSigningRequestItemsNested<A> setNewCertificateSigningRequestItemLike(int index,CertificateSigningRequest item);
    public BaseKubernetesListFluent.CertificateSigningRequestItemsNested<A> addNewCertificateSigningRequestItem();
    public BaseKubernetesListFluent.CertificateSigningRequestItemsNested<A> addNewCertificateSigningRequestItemLike(CertificateSigningRequest item);
    public A addToServiceAccountItems(int index,ServiceAccount item);
    public A setToServiceAccountItems(int index,ServiceAccount item);
    public A addToServiceAccountItems(ServiceAccount... items);
    public A addAllToServiceAccountItems(Collection<ServiceAccount> items);
    public A removeFromServiceAccountItems(ServiceAccount... items);
    public A removeAllFromServiceAccountItems(Collection<ServiceAccount> items);
    public BaseKubernetesListFluent.ServiceAccountItemsNested<A> setNewServiceAccountItemLike(int index,ServiceAccount item);
    public BaseKubernetesListFluent.ServiceAccountItemsNested<A> addNewServiceAccountItem();
    public BaseKubernetesListFluent.ServiceAccountItemsNested<A> addNewServiceAccountItemLike(ServiceAccount item);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata();
    public ListMeta buildMetadata();
    public A withMetadata(ListMeta metadata);
    public Boolean hasMetadata();
    public A withNewMetadata(String _continue,String resourceVersion,String selfLink);
    public BaseKubernetesListFluent.MetadataNested<A> withNewMetadata();
    public BaseKubernetesListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public BaseKubernetesListFluent.MetadataNested<A> editMetadata();
    public BaseKubernetesListFluent.MetadataNested<A> editOrNewMetadata();
    public BaseKubernetesListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ValidatingWebhookConfigurationItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationItem();
}
    public interface StorageClassItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<BaseKubernetesListFluent.StorageClassItemsNested<N>>{

        
    public N and();    public N endStorageClassItem();
}
    public interface ClusterRoleBindingItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<BaseKubernetesListFluent.ClusterRoleBindingItemsNested<N>>{

        
    public N and();    public N endClusterRoleBindingItem();
}
    public interface OpenshiftRoleBindingItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingItem();
}
    public interface PodDisruptionBudgetItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetItem();
}
    public interface NetworkPolicyItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<BaseKubernetesListFluent.NetworkPolicyItemsNested<N>>{

        
    public N and();    public N endNetworkPolicyItem();
}
    public interface OpenshiftClusterRoleBindingItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingItem();
}
    public interface RouteItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<BaseKubernetesListFluent.RouteItemsNested<N>>{

        
    public N and();    public N endRouteItem();
}
    public interface NamespaceItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<BaseKubernetesListFluent.NamespaceItemsNested<N>>{

        
    public N and();    public N endNamespaceItem();
}
    public interface LocalSubjectAccessReviewItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewItem();
}
    public interface ServiceItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<BaseKubernetesListFluent.ServiceItemsNested<N>>{

        
    public N and();    public N endServiceItem();
}
    public interface ReplicationControllerItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<BaseKubernetesListFluent.ReplicationControllerItemsNested<N>>{

        
    public N and();    public N endReplicationControllerItem();
}
    public interface SubjectAccessReviewItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewFluent<BaseKubernetesListFluent.SubjectAccessReviewItemsNested<N>>{

        
    public N and();    public N endSubjectAccessReviewItem();
}
    public interface MutatingWebhookConfigurationItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationItem();
}
    public interface HorizontalPodAutoscalerItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerItem();
}
    public interface ScaleItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<BaseKubernetesListFluent.ScaleItemsNested<N>>{

        
    public N and();    public N endScaleItem();
}
    public interface ImageItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<BaseKubernetesListFluent.ImageItemsNested<N>>{

        
    public N and();    public N endImageItem();
}
    public interface ReplicaSetItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<BaseKubernetesListFluent.ReplicaSetItemsNested<N>>{

        
    public N and();    public N endReplicaSetItem();
}
    public interface PodSecurityPolicyItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<BaseKubernetesListFluent.PodSecurityPolicyItemsNested<N>>{

        
    public N and();    public N endPodSecurityPolicyItem();
}
    public interface CronJobItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<BaseKubernetesListFluent.CronJobItemsNested<N>>{

        
    public N and();    public N endCronJobItem();
}
    public interface EndpointsItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<BaseKubernetesListFluent.EndpointsItemsNested<N>>{

        
    public N and();    public N endEndpointsItem();
}
    public interface PodItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<BaseKubernetesListFluent.PodItemsNested<N>>{

        
    public N and();    public N endPodItem();
}
    public interface ConfigMapItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<BaseKubernetesListFluent.ConfigMapItemsNested<N>>{

        
    public N and();    public N endConfigMapItem();
}
    public interface CustomResourceDefinitionItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionItem();
}
    public interface BuildItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<BaseKubernetesListFluent.BuildItemsNested<N>>{

        
    public N and();    public N endBuildItem();
}
    public interface ImageStreamTagItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<BaseKubernetesListFluent.ImageStreamTagItemsNested<N>>{

        
    public N and();    public N endImageStreamTagItem();
}
    public interface GroupItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<BaseKubernetesListFluent.GroupItemsNested<N>>{

        
    public N and();    public N endGroupItem();
}
    public interface ImageSignatureItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<BaseKubernetesListFluent.ImageSignatureItemsNested<N>>{

        
    public N and();    public N endImageSignatureItem();
}
    public interface ResourceQuotaItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<BaseKubernetesListFluent.ResourceQuotaItemsNested<N>>{

        
    public N and();    public N endResourceQuotaItem();
}
    public interface BuildRequestItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<BaseKubernetesListFluent.BuildRequestItemsNested<N>>{

        
    public N and();    public N endBuildRequestItem();
}
    public interface DaemonSetItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<BaseKubernetesListFluent.DaemonSetItemsNested<N>>{

        
    public N and();    public N endDaemonSetItem();
}
    public interface ImageStreamItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<BaseKubernetesListFluent.ImageStreamItemsNested<N>>{

        
    public N and();    public N endImageStreamItem();
}
    public interface OpenshiftRoleItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<BaseKubernetesListFluent.OpenshiftRoleItemsNested<N>>{

        
    public N and();    public N endOpenshiftRoleItem();
}
    public interface OAuthClientItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<BaseKubernetesListFluent.OAuthClientItemsNested<N>>{

        
    public N and();    public N endOAuthClientItem();
}
    public interface IdentityItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<BaseKubernetesListFluent.IdentityItemsNested<N>>{

        
    public N and();    public N endIdentityItem();
}
    public interface LimitRangeItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<BaseKubernetesListFluent.LimitRangeItemsNested<N>>{

        
    public N and();    public N endLimitRangeItem();
}
    public interface ImageStreamImportItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<BaseKubernetesListFluent.ImageStreamImportItemsNested<N>>{

        
    public N and();    public N endImageStreamImportItem();
}
    public interface OpenshiftRoleBindingRestrictionItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionItem();
}
    public interface RoleBindingItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<BaseKubernetesListFluent.RoleBindingItemsNested<N>>{

        
    public N and();    public N endRoleBindingItem();
}
    public interface PodPresetItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<BaseKubernetesListFluent.PodPresetItemsNested<N>>{

        
    public N and();    public N endPodPresetItem();
}
    public interface ProjectItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<BaseKubernetesListFluent.ProjectItemsNested<N>>{

        
    public N and();    public N endProjectItem();
}
    public interface BuildConfigItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<BaseKubernetesListFluent.BuildConfigItemsNested<N>>{

        
    public N and();    public N endBuildConfigItem();
}
    public interface ClusterRoleItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<BaseKubernetesListFluent.ClusterRoleItemsNested<N>>{

        
    public N and();    public N endClusterRoleItem();
}
    public interface OAuthAuthorizeTokenItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenItem();
}
    public interface ProjectRequestItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<BaseKubernetesListFluent.ProjectRequestItemsNested<N>>{

        
    public N and();    public N endProjectRequestItem();
}
    public interface PriorityClassItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<BaseKubernetesListFluent.PriorityClassItemsNested<N>>{

        
    public N and();    public N endPriorityClassItem();
}
    public interface TemplateItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<BaseKubernetesListFluent.TemplateItemsNested<N>>{

        
    public N and();    public N endTemplateItem();
}
    public interface OAuthClientAuthorizationItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationItem();
}
    public interface DeploymentItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<BaseKubernetesListFluent.DeploymentItemsNested<N>>{

        
    public N and();    public N endDeploymentItem();
}
    public interface PodTemplateItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<BaseKubernetesListFluent.PodTemplateItemsNested<N>>{

        
    public N and();    public N endPodTemplateItem();
}
    public interface EventItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<BaseKubernetesListFluent.EventItemsNested<N>>{

        
    public N and();    public N endEventItem();
}
    public interface IngressItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<BaseKubernetesListFluent.IngressItemsNested<N>>{

        
    public N and();    public N endIngressItem();
}
    public interface DeploymentConfigItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<BaseKubernetesListFluent.DeploymentConfigItemsNested<N>>{

        
    public N and();    public N endDeploymentConfigItem();
}
    public interface OAuthAccessTokenItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<BaseKubernetesListFluent.OAuthAccessTokenItemsNested<N>>{

        
    public N and();    public N endOAuthAccessTokenItem();
}
    public interface PersistentVolumeItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<BaseKubernetesListFluent.PersistentVolumeItemsNested<N>>{

        
    public N and();    public N endPersistentVolumeItem();
}
    public interface PersistentVolumeClaimItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimItem();
}
    public interface EventsEventItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<BaseKubernetesListFluent.EventsEventItemsNested<N>>{

        
    public N and();    public N endEventsEventItem();
}
    public interface StatefulSetItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<BaseKubernetesListFluent.StatefulSetItemsNested<N>>{

        
    public N and();    public N endStatefulSetItem();
}
    public interface OpenshiftClusterRoleItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleItem();
}
    public interface RoleItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<BaseKubernetesListFluent.RoleItemsNested<N>>{

        
    public N and();    public N endRoleItem();
}
    public interface UserItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<BaseKubernetesListFluent.UserItemsNested<N>>{

        
    public N and();    public N endUserItem();
}
    public interface ComponentStatusItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<BaseKubernetesListFluent.ComponentStatusItemsNested<N>>{

        
    public N and();    public N endComponentStatusItem();
}
    public interface TokenReviewItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<BaseKubernetesListFluent.TokenReviewItemsNested<N>>{

        
    public N and();    public N endTokenReviewItem();
}
    public interface BindingItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<BaseKubernetesListFluent.BindingItemsNested<N>>{

        
    public N and();    public N endBindingItem();
}
    public interface SecretItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<BaseKubernetesListFluent.SecretItemsNested<N>>{

        
    public N and();    public N endSecretItem();
}
    public interface SecurityContextConstraintsItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsItem();
}
    public interface NetNamespaceItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<BaseKubernetesListFluent.NetNamespaceItemsNested<N>>{

        
    public N and();    public N endNetNamespaceItem();
}
    public interface NodeItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<BaseKubernetesListFluent.NodeItemsNested<N>>{

        
    public N and();    public N endNodeItem();
}
    public interface JobItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<BaseKubernetesListFluent.JobItemsNested<N>>{

        
    public N and();    public N endJobItem();
}
    public interface CertificateSigningRequestItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<BaseKubernetesListFluent.CertificateSigningRequestItemsNested<N>>{

        
    public N and();    public N endCertificateSigningRequestItem();
}
    public interface ServiceAccountItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<BaseKubernetesListFluent.ServiceAccountItemsNested<N>>{

        
    public N and();    public N endServiceAccountItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<BaseKubernetesListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
