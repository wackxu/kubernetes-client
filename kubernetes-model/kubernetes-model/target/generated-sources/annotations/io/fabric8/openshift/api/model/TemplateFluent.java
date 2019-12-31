package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import javax.validation.constraints.Size;
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
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
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
import io.fabric8.kubernetes.api.model.ObjectMeta;
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
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
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
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressFluent;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
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

public interface TemplateFluent<A extends TemplateFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public A addToLabels(String key,String value);
    public A addToLabels(Map<String,String> map);
    public A removeFromLabels(String key);
    public A removeFromLabels(Map<String,String> map);
    public Map<String,String> getLabels();
    public A withLabels(Map<String,String> labels);
    public Boolean hasLabels();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public TemplateFluent.MetadataNested<A> withNewMetadata();
    public TemplateFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public TemplateFluent.MetadataNested<A> editMetadata();
    public TemplateFluent.MetadataNested<A> editOrNewMetadata();
    public TemplateFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToObjects(VisitableBuilder<? extends HasMetadata,?> builder);
    public A addToObjects(int index,VisitableBuilder<? extends HasMetadata,?> builder);
    public A addToObjects(int index,HasMetadata item);
    public A setToObjects(int index,HasMetadata item);
    public A addToObjects(HasMetadata... items);
    public A addAllToObjects(Collection<HasMetadata> items);
    public A removeFromObjects(VisitableBuilder<? extends HasMetadata,?> builder);
    public A removeFromObjects(HasMetadata... items);
    public A removeAllFromObjects(Collection<HasMetadata> items);
    
/**
 * This method has been deprecated, please use method buildObjects instead.
 * @return The buildable object.
 */
@Deprecated public List<HasMetadata> getObjects();
    public List<HasMetadata> buildObjects();
    public HasMetadata buildObject(int index);
    public HasMetadata buildFirstObject();
    public HasMetadata buildLastObject();
    public HasMetadata buildMatchingObject(io.fabric8.kubernetes.api.builder.Predicate<VisitableBuilder<? extends HasMetadata,?>> predicate);
    public A withObjects(List<HasMetadata> objects);
    public A withObjects(HasMetadata... objects);
    public Boolean hasObjects();
    public A addToValidatingWebhookConfigurationObjects(int index,ValidatingWebhookConfiguration item);
    public A setToValidatingWebhookConfigurationObjects(int index,ValidatingWebhookConfiguration item);
    public A addToValidatingWebhookConfigurationObjects(ValidatingWebhookConfiguration... items);
    public A addAllToValidatingWebhookConfigurationObjects(Collection<ValidatingWebhookConfiguration> items);
    public A removeFromValidatingWebhookConfigurationObjects(ValidatingWebhookConfiguration... items);
    public A removeAllFromValidatingWebhookConfigurationObjects(Collection<ValidatingWebhookConfiguration> items);
    public TemplateFluent.ValidatingWebhookConfigurationObjectsNested<A> setNewValidatingWebhookConfigurationObjectLike(int index,ValidatingWebhookConfiguration item);
    public TemplateFluent.ValidatingWebhookConfigurationObjectsNested<A> addNewValidatingWebhookConfigurationObject();
    public TemplateFluent.ValidatingWebhookConfigurationObjectsNested<A> addNewValidatingWebhookConfigurationObjectLike(ValidatingWebhookConfiguration item);
    public A addToStorageClassObjects(int index,StorageClass item);
    public A setToStorageClassObjects(int index,StorageClass item);
    public A addToStorageClassObjects(StorageClass... items);
    public A addAllToStorageClassObjects(Collection<StorageClass> items);
    public A removeFromStorageClassObjects(StorageClass... items);
    public A removeAllFromStorageClassObjects(Collection<StorageClass> items);
    public TemplateFluent.StorageClassObjectsNested<A> setNewStorageClassObjectLike(int index,StorageClass item);
    public TemplateFluent.StorageClassObjectsNested<A> addNewStorageClassObject();
    public TemplateFluent.StorageClassObjectsNested<A> addNewStorageClassObjectLike(StorageClass item);
    public A addToClusterRoleBindingObjects(int index,ClusterRoleBinding item);
    public A setToClusterRoleBindingObjects(int index,ClusterRoleBinding item);
    public A addToClusterRoleBindingObjects(ClusterRoleBinding... items);
    public A addAllToClusterRoleBindingObjects(Collection<ClusterRoleBinding> items);
    public A removeFromClusterRoleBindingObjects(ClusterRoleBinding... items);
    public A removeAllFromClusterRoleBindingObjects(Collection<ClusterRoleBinding> items);
    public TemplateFluent.ClusterRoleBindingObjectsNested<A> setNewClusterRoleBindingObjectLike(int index,ClusterRoleBinding item);
    public TemplateFluent.ClusterRoleBindingObjectsNested<A> addNewClusterRoleBindingObject();
    public TemplateFluent.ClusterRoleBindingObjectsNested<A> addNewClusterRoleBindingObjectLike(ClusterRoleBinding item);
    public A addToOpenshiftRoleBindingObjects(int index,OpenshiftRoleBinding item);
    public A setToOpenshiftRoleBindingObjects(int index,OpenshiftRoleBinding item);
    public A addToOpenshiftRoleBindingObjects(OpenshiftRoleBinding... items);
    public A addAllToOpenshiftRoleBindingObjects(Collection<OpenshiftRoleBinding> items);
    public A removeFromOpenshiftRoleBindingObjects(OpenshiftRoleBinding... items);
    public A removeAllFromOpenshiftRoleBindingObjects(Collection<OpenshiftRoleBinding> items);
    public TemplateFluent.OpenshiftRoleBindingObjectsNested<A> setNewOpenshiftRoleBindingObjectLike(int index,OpenshiftRoleBinding item);
    public TemplateFluent.OpenshiftRoleBindingObjectsNested<A> addNewOpenshiftRoleBindingObject();
    public TemplateFluent.OpenshiftRoleBindingObjectsNested<A> addNewOpenshiftRoleBindingObjectLike(OpenshiftRoleBinding item);
    public A addToPodDisruptionBudgetObjects(int index,PodDisruptionBudget item);
    public A setToPodDisruptionBudgetObjects(int index,PodDisruptionBudget item);
    public A addToPodDisruptionBudgetObjects(PodDisruptionBudget... items);
    public A addAllToPodDisruptionBudgetObjects(Collection<PodDisruptionBudget> items);
    public A removeFromPodDisruptionBudgetObjects(PodDisruptionBudget... items);
    public A removeAllFromPodDisruptionBudgetObjects(Collection<PodDisruptionBudget> items);
    public TemplateFluent.PodDisruptionBudgetObjectsNested<A> setNewPodDisruptionBudgetObjectLike(int index,PodDisruptionBudget item);
    public TemplateFluent.PodDisruptionBudgetObjectsNested<A> addNewPodDisruptionBudgetObject();
    public TemplateFluent.PodDisruptionBudgetObjectsNested<A> addNewPodDisruptionBudgetObjectLike(PodDisruptionBudget item);
    public A addToNetworkPolicyObjects(int index,NetworkPolicy item);
    public A setToNetworkPolicyObjects(int index,NetworkPolicy item);
    public A addToNetworkPolicyObjects(NetworkPolicy... items);
    public A addAllToNetworkPolicyObjects(Collection<NetworkPolicy> items);
    public A removeFromNetworkPolicyObjects(NetworkPolicy... items);
    public A removeAllFromNetworkPolicyObjects(Collection<NetworkPolicy> items);
    public TemplateFluent.NetworkPolicyObjectsNested<A> setNewNetworkPolicyObjectLike(int index,NetworkPolicy item);
    public TemplateFluent.NetworkPolicyObjectsNested<A> addNewNetworkPolicyObject();
    public TemplateFluent.NetworkPolicyObjectsNested<A> addNewNetworkPolicyObjectLike(NetworkPolicy item);
    public A addToOpenshiftClusterRoleBindingObjects(int index,OpenshiftClusterRoleBinding item);
    public A setToOpenshiftClusterRoleBindingObjects(int index,OpenshiftClusterRoleBinding item);
    public A addToOpenshiftClusterRoleBindingObjects(OpenshiftClusterRoleBinding... items);
    public A addAllToOpenshiftClusterRoleBindingObjects(Collection<OpenshiftClusterRoleBinding> items);
    public A removeFromOpenshiftClusterRoleBindingObjects(OpenshiftClusterRoleBinding... items);
    public A removeAllFromOpenshiftClusterRoleBindingObjects(Collection<OpenshiftClusterRoleBinding> items);
    public TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<A> setNewOpenshiftClusterRoleBindingObjectLike(int index,OpenshiftClusterRoleBinding item);
    public TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<A> addNewOpenshiftClusterRoleBindingObject();
    public TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<A> addNewOpenshiftClusterRoleBindingObjectLike(OpenshiftClusterRoleBinding item);
    public A addToRouteObjects(int index,Route item);
    public A setToRouteObjects(int index,Route item);
    public A addToRouteObjects(Route... items);
    public A addAllToRouteObjects(Collection<Route> items);
    public A removeFromRouteObjects(Route... items);
    public A removeAllFromRouteObjects(Collection<Route> items);
    public TemplateFluent.RouteObjectsNested<A> setNewRouteObjectLike(int index,Route item);
    public TemplateFluent.RouteObjectsNested<A> addNewRouteObject();
    public TemplateFluent.RouteObjectsNested<A> addNewRouteObjectLike(Route item);
    public A addToNamespaceObjects(int index,Namespace item);
    public A setToNamespaceObjects(int index,Namespace item);
    public A addToNamespaceObjects(Namespace... items);
    public A addAllToNamespaceObjects(Collection<Namespace> items);
    public A removeFromNamespaceObjects(Namespace... items);
    public A removeAllFromNamespaceObjects(Collection<Namespace> items);
    public TemplateFluent.NamespaceObjectsNested<A> setNewNamespaceObjectLike(int index,Namespace item);
    public TemplateFluent.NamespaceObjectsNested<A> addNewNamespaceObject();
    public TemplateFluent.NamespaceObjectsNested<A> addNewNamespaceObjectLike(Namespace item);
    public A addToLocalSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item);
    public A setToLocalSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item);
    public A addToLocalSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview... items);
    public A addAllToLocalSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview> items);
    public A removeFromLocalSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview... items);
    public A removeAllFromLocalSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview> items);
    public TemplateFluent.LocalSubjectAccessReviewObjectsNested<A> setNewLocalSubjectAccessReviewObjectLike(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item);
    public TemplateFluent.LocalSubjectAccessReviewObjectsNested<A> addNewLocalSubjectAccessReviewObject();
    public TemplateFluent.LocalSubjectAccessReviewObjectsNested<A> addNewLocalSubjectAccessReviewObjectLike(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item);
    public A addToServiceObjects(int index,Service item);
    public A setToServiceObjects(int index,Service item);
    public A addToServiceObjects(Service... items);
    public A addAllToServiceObjects(Collection<Service> items);
    public A removeFromServiceObjects(Service... items);
    public A removeAllFromServiceObjects(Collection<Service> items);
    public TemplateFluent.ServiceObjectsNested<A> setNewServiceObjectLike(int index,Service item);
    public TemplateFluent.ServiceObjectsNested<A> addNewServiceObject();
    public TemplateFluent.ServiceObjectsNested<A> addNewServiceObjectLike(Service item);
    public A addToReplicationControllerObjects(int index,ReplicationController item);
    public A setToReplicationControllerObjects(int index,ReplicationController item);
    public A addToReplicationControllerObjects(ReplicationController... items);
    public A addAllToReplicationControllerObjects(Collection<ReplicationController> items);
    public A removeFromReplicationControllerObjects(ReplicationController... items);
    public A removeAllFromReplicationControllerObjects(Collection<ReplicationController> items);
    public TemplateFluent.ReplicationControllerObjectsNested<A> setNewReplicationControllerObjectLike(int index,ReplicationController item);
    public TemplateFluent.ReplicationControllerObjectsNested<A> addNewReplicationControllerObject();
    public TemplateFluent.ReplicationControllerObjectsNested<A> addNewReplicationControllerObjectLike(ReplicationController item);
    public A addToSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item);
    public A setToSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item);
    public A addToSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview... items);
    public A addAllToSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview> items);
    public A removeFromSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview... items);
    public A removeAllFromSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview> items);
    public TemplateFluent.SubjectAccessReviewObjectsNested<A> setNewSubjectAccessReviewObjectLike(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item);
    public TemplateFluent.SubjectAccessReviewObjectsNested<A> addNewSubjectAccessReviewObject();
    public TemplateFluent.SubjectAccessReviewObjectsNested<A> addNewSubjectAccessReviewObjectLike(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item);
    public A addToMutatingWebhookConfigurationObjects(int index,MutatingWebhookConfiguration item);
    public A setToMutatingWebhookConfigurationObjects(int index,MutatingWebhookConfiguration item);
    public A addToMutatingWebhookConfigurationObjects(MutatingWebhookConfiguration... items);
    public A addAllToMutatingWebhookConfigurationObjects(Collection<MutatingWebhookConfiguration> items);
    public A removeFromMutatingWebhookConfigurationObjects(MutatingWebhookConfiguration... items);
    public A removeAllFromMutatingWebhookConfigurationObjects(Collection<MutatingWebhookConfiguration> items);
    public TemplateFluent.MutatingWebhookConfigurationObjectsNested<A> setNewMutatingWebhookConfigurationObjectLike(int index,MutatingWebhookConfiguration item);
    public TemplateFluent.MutatingWebhookConfigurationObjectsNested<A> addNewMutatingWebhookConfigurationObject();
    public TemplateFluent.MutatingWebhookConfigurationObjectsNested<A> addNewMutatingWebhookConfigurationObjectLike(MutatingWebhookConfiguration item);
    public A addToHorizontalPodAutoscalerObjects(int index,HorizontalPodAutoscaler item);
    public A setToHorizontalPodAutoscalerObjects(int index,HorizontalPodAutoscaler item);
    public A addToHorizontalPodAutoscalerObjects(HorizontalPodAutoscaler... items);
    public A addAllToHorizontalPodAutoscalerObjects(Collection<HorizontalPodAutoscaler> items);
    public A removeFromHorizontalPodAutoscalerObjects(HorizontalPodAutoscaler... items);
    public A removeAllFromHorizontalPodAutoscalerObjects(Collection<HorizontalPodAutoscaler> items);
    public TemplateFluent.HorizontalPodAutoscalerObjectsNested<A> setNewHorizontalPodAutoscalerObjectLike(int index,HorizontalPodAutoscaler item);
    public TemplateFluent.HorizontalPodAutoscalerObjectsNested<A> addNewHorizontalPodAutoscalerObject();
    public TemplateFluent.HorizontalPodAutoscalerObjectsNested<A> addNewHorizontalPodAutoscalerObjectLike(HorizontalPodAutoscaler item);
    public A addToScaleObjects(int index,Scale item);
    public A setToScaleObjects(int index,Scale item);
    public A addToScaleObjects(Scale... items);
    public A addAllToScaleObjects(Collection<Scale> items);
    public A removeFromScaleObjects(Scale... items);
    public A removeAllFromScaleObjects(Collection<Scale> items);
    public TemplateFluent.ScaleObjectsNested<A> setNewScaleObjectLike(int index,Scale item);
    public TemplateFluent.ScaleObjectsNested<A> addNewScaleObject();
    public TemplateFluent.ScaleObjectsNested<A> addNewScaleObjectLike(Scale item);
    public A addToImageObjects(int index,Image item);
    public A setToImageObjects(int index,Image item);
    public A addToImageObjects(Image... items);
    public A addAllToImageObjects(Collection<Image> items);
    public A removeFromImageObjects(Image... items);
    public A removeAllFromImageObjects(Collection<Image> items);
    public TemplateFluent.ImageObjectsNested<A> setNewImageObjectLike(int index,Image item);
    public TemplateFluent.ImageObjectsNested<A> addNewImageObject();
    public TemplateFluent.ImageObjectsNested<A> addNewImageObjectLike(Image item);
    public A addToReplicaSetObjects(int index,ReplicaSet item);
    public A setToReplicaSetObjects(int index,ReplicaSet item);
    public A addToReplicaSetObjects(ReplicaSet... items);
    public A addAllToReplicaSetObjects(Collection<ReplicaSet> items);
    public A removeFromReplicaSetObjects(ReplicaSet... items);
    public A removeAllFromReplicaSetObjects(Collection<ReplicaSet> items);
    public TemplateFluent.ReplicaSetObjectsNested<A> setNewReplicaSetObjectLike(int index,ReplicaSet item);
    public TemplateFluent.ReplicaSetObjectsNested<A> addNewReplicaSetObject();
    public TemplateFluent.ReplicaSetObjectsNested<A> addNewReplicaSetObjectLike(ReplicaSet item);
    public A addToPodSecurityPolicyObjects(int index,PodSecurityPolicy item);
    public A setToPodSecurityPolicyObjects(int index,PodSecurityPolicy item);
    public A addToPodSecurityPolicyObjects(PodSecurityPolicy... items);
    public A addAllToPodSecurityPolicyObjects(Collection<PodSecurityPolicy> items);
    public A removeFromPodSecurityPolicyObjects(PodSecurityPolicy... items);
    public A removeAllFromPodSecurityPolicyObjects(Collection<PodSecurityPolicy> items);
    public TemplateFluent.PodSecurityPolicyObjectsNested<A> setNewPodSecurityPolicyObjectLike(int index,PodSecurityPolicy item);
    public TemplateFluent.PodSecurityPolicyObjectsNested<A> addNewPodSecurityPolicyObject();
    public TemplateFluent.PodSecurityPolicyObjectsNested<A> addNewPodSecurityPolicyObjectLike(PodSecurityPolicy item);
    public A addToCronJobObjects(int index,CronJob item);
    public A setToCronJobObjects(int index,CronJob item);
    public A addToCronJobObjects(CronJob... items);
    public A addAllToCronJobObjects(Collection<CronJob> items);
    public A removeFromCronJobObjects(CronJob... items);
    public A removeAllFromCronJobObjects(Collection<CronJob> items);
    public TemplateFluent.CronJobObjectsNested<A> setNewCronJobObjectLike(int index,CronJob item);
    public TemplateFluent.CronJobObjectsNested<A> addNewCronJobObject();
    public TemplateFluent.CronJobObjectsNested<A> addNewCronJobObjectLike(CronJob item);
    public A addToEndpointsObjects(int index,Endpoints item);
    public A setToEndpointsObjects(int index,Endpoints item);
    public A addToEndpointsObjects(Endpoints... items);
    public A addAllToEndpointsObjects(Collection<Endpoints> items);
    public A removeFromEndpointsObjects(Endpoints... items);
    public A removeAllFromEndpointsObjects(Collection<Endpoints> items);
    public TemplateFluent.EndpointsObjectsNested<A> setNewEndpointsObjectLike(int index,Endpoints item);
    public TemplateFluent.EndpointsObjectsNested<A> addNewEndpointsObject();
    public TemplateFluent.EndpointsObjectsNested<A> addNewEndpointsObjectLike(Endpoints item);
    public A addToPodObjects(int index,Pod item);
    public A setToPodObjects(int index,Pod item);
    public A addToPodObjects(Pod... items);
    public A addAllToPodObjects(Collection<Pod> items);
    public A removeFromPodObjects(Pod... items);
    public A removeAllFromPodObjects(Collection<Pod> items);
    public TemplateFluent.PodObjectsNested<A> setNewPodObjectLike(int index,Pod item);
    public TemplateFluent.PodObjectsNested<A> addNewPodObject();
    public TemplateFluent.PodObjectsNested<A> addNewPodObjectLike(Pod item);
    public A addToConfigMapObjects(int index,ConfigMap item);
    public A setToConfigMapObjects(int index,ConfigMap item);
    public A addToConfigMapObjects(ConfigMap... items);
    public A addAllToConfigMapObjects(Collection<ConfigMap> items);
    public A removeFromConfigMapObjects(ConfigMap... items);
    public A removeAllFromConfigMapObjects(Collection<ConfigMap> items);
    public TemplateFluent.ConfigMapObjectsNested<A> setNewConfigMapObjectLike(int index,ConfigMap item);
    public TemplateFluent.ConfigMapObjectsNested<A> addNewConfigMapObject();
    public TemplateFluent.ConfigMapObjectsNested<A> addNewConfigMapObjectLike(ConfigMap item);
    public A addToCustomResourceDefinitionObjects(int index,CustomResourceDefinition item);
    public A setToCustomResourceDefinitionObjects(int index,CustomResourceDefinition item);
    public A addToCustomResourceDefinitionObjects(CustomResourceDefinition... items);
    public A addAllToCustomResourceDefinitionObjects(Collection<CustomResourceDefinition> items);
    public A removeFromCustomResourceDefinitionObjects(CustomResourceDefinition... items);
    public A removeAllFromCustomResourceDefinitionObjects(Collection<CustomResourceDefinition> items);
    public TemplateFluent.CustomResourceDefinitionObjectsNested<A> setNewCustomResourceDefinitionObjectLike(int index,CustomResourceDefinition item);
    public TemplateFluent.CustomResourceDefinitionObjectsNested<A> addNewCustomResourceDefinitionObject();
    public TemplateFluent.CustomResourceDefinitionObjectsNested<A> addNewCustomResourceDefinitionObjectLike(CustomResourceDefinition item);
    public A addToBuildObjects(int index,Build item);
    public A setToBuildObjects(int index,Build item);
    public A addToBuildObjects(Build... items);
    public A addAllToBuildObjects(Collection<Build> items);
    public A removeFromBuildObjects(Build... items);
    public A removeAllFromBuildObjects(Collection<Build> items);
    public TemplateFluent.BuildObjectsNested<A> setNewBuildObjectLike(int index,Build item);
    public TemplateFluent.BuildObjectsNested<A> addNewBuildObject();
    public TemplateFluent.BuildObjectsNested<A> addNewBuildObjectLike(Build item);
    public A addToImageStreamTagObjects(int index,ImageStreamTag item);
    public A setToImageStreamTagObjects(int index,ImageStreamTag item);
    public A addToImageStreamTagObjects(ImageStreamTag... items);
    public A addAllToImageStreamTagObjects(Collection<ImageStreamTag> items);
    public A removeFromImageStreamTagObjects(ImageStreamTag... items);
    public A removeAllFromImageStreamTagObjects(Collection<ImageStreamTag> items);
    public TemplateFluent.ImageStreamTagObjectsNested<A> setNewImageStreamTagObjectLike(int index,ImageStreamTag item);
    public TemplateFluent.ImageStreamTagObjectsNested<A> addNewImageStreamTagObject();
    public TemplateFluent.ImageStreamTagObjectsNested<A> addNewImageStreamTagObjectLike(ImageStreamTag item);
    public A addToGroupObjects(int index,Group item);
    public A setToGroupObjects(int index,Group item);
    public A addToGroupObjects(Group... items);
    public A addAllToGroupObjects(Collection<Group> items);
    public A removeFromGroupObjects(Group... items);
    public A removeAllFromGroupObjects(Collection<Group> items);
    public TemplateFluent.GroupObjectsNested<A> setNewGroupObjectLike(int index,Group item);
    public TemplateFluent.GroupObjectsNested<A> addNewGroupObject();
    public TemplateFluent.GroupObjectsNested<A> addNewGroupObjectLike(Group item);
    public A addToImageSignatureObjects(int index,ImageSignature item);
    public A setToImageSignatureObjects(int index,ImageSignature item);
    public A addToImageSignatureObjects(ImageSignature... items);
    public A addAllToImageSignatureObjects(Collection<ImageSignature> items);
    public A removeFromImageSignatureObjects(ImageSignature... items);
    public A removeAllFromImageSignatureObjects(Collection<ImageSignature> items);
    public TemplateFluent.ImageSignatureObjectsNested<A> setNewImageSignatureObjectLike(int index,ImageSignature item);
    public TemplateFluent.ImageSignatureObjectsNested<A> addNewImageSignatureObject();
    public TemplateFluent.ImageSignatureObjectsNested<A> addNewImageSignatureObjectLike(ImageSignature item);
    public A addToResourceQuotaObjects(int index,ResourceQuota item);
    public A setToResourceQuotaObjects(int index,ResourceQuota item);
    public A addToResourceQuotaObjects(ResourceQuota... items);
    public A addAllToResourceQuotaObjects(Collection<ResourceQuota> items);
    public A removeFromResourceQuotaObjects(ResourceQuota... items);
    public A removeAllFromResourceQuotaObjects(Collection<ResourceQuota> items);
    public TemplateFluent.ResourceQuotaObjectsNested<A> setNewResourceQuotaObjectLike(int index,ResourceQuota item);
    public TemplateFluent.ResourceQuotaObjectsNested<A> addNewResourceQuotaObject();
    public TemplateFluent.ResourceQuotaObjectsNested<A> addNewResourceQuotaObjectLike(ResourceQuota item);
    public A addToBuildRequestObjects(int index,BuildRequest item);
    public A setToBuildRequestObjects(int index,BuildRequest item);
    public A addToBuildRequestObjects(BuildRequest... items);
    public A addAllToBuildRequestObjects(Collection<BuildRequest> items);
    public A removeFromBuildRequestObjects(BuildRequest... items);
    public A removeAllFromBuildRequestObjects(Collection<BuildRequest> items);
    public TemplateFluent.BuildRequestObjectsNested<A> setNewBuildRequestObjectLike(int index,BuildRequest item);
    public TemplateFluent.BuildRequestObjectsNested<A> addNewBuildRequestObject();
    public TemplateFluent.BuildRequestObjectsNested<A> addNewBuildRequestObjectLike(BuildRequest item);
    public A addToDaemonSetObjects(int index,DaemonSet item);
    public A setToDaemonSetObjects(int index,DaemonSet item);
    public A addToDaemonSetObjects(DaemonSet... items);
    public A addAllToDaemonSetObjects(Collection<DaemonSet> items);
    public A removeFromDaemonSetObjects(DaemonSet... items);
    public A removeAllFromDaemonSetObjects(Collection<DaemonSet> items);
    public TemplateFluent.DaemonSetObjectsNested<A> setNewDaemonSetObjectLike(int index,DaemonSet item);
    public TemplateFluent.DaemonSetObjectsNested<A> addNewDaemonSetObject();
    public TemplateFluent.DaemonSetObjectsNested<A> addNewDaemonSetObjectLike(DaemonSet item);
    public A addToImageStreamObjects(int index,ImageStream item);
    public A setToImageStreamObjects(int index,ImageStream item);
    public A addToImageStreamObjects(ImageStream... items);
    public A addAllToImageStreamObjects(Collection<ImageStream> items);
    public A removeFromImageStreamObjects(ImageStream... items);
    public A removeAllFromImageStreamObjects(Collection<ImageStream> items);
    public TemplateFluent.ImageStreamObjectsNested<A> setNewImageStreamObjectLike(int index,ImageStream item);
    public TemplateFluent.ImageStreamObjectsNested<A> addNewImageStreamObject();
    public TemplateFluent.ImageStreamObjectsNested<A> addNewImageStreamObjectLike(ImageStream item);
    public A addToOpenshiftRoleObjects(int index,OpenshiftRole item);
    public A setToOpenshiftRoleObjects(int index,OpenshiftRole item);
    public A addToOpenshiftRoleObjects(OpenshiftRole... items);
    public A addAllToOpenshiftRoleObjects(Collection<OpenshiftRole> items);
    public A removeFromOpenshiftRoleObjects(OpenshiftRole... items);
    public A removeAllFromOpenshiftRoleObjects(Collection<OpenshiftRole> items);
    public TemplateFluent.OpenshiftRoleObjectsNested<A> setNewOpenshiftRoleObjectLike(int index,OpenshiftRole item);
    public TemplateFluent.OpenshiftRoleObjectsNested<A> addNewOpenshiftRoleObject();
    public TemplateFluent.OpenshiftRoleObjectsNested<A> addNewOpenshiftRoleObjectLike(OpenshiftRole item);
    public A addToOAuthClientObjects(int index,OAuthClient item);
    public A setToOAuthClientObjects(int index,OAuthClient item);
    public A addToOAuthClientObjects(OAuthClient... items);
    public A addAllToOAuthClientObjects(Collection<OAuthClient> items);
    public A removeFromOAuthClientObjects(OAuthClient... items);
    public A removeAllFromOAuthClientObjects(Collection<OAuthClient> items);
    public TemplateFluent.OAuthClientObjectsNested<A> setNewOAuthClientObjectLike(int index,OAuthClient item);
    public TemplateFluent.OAuthClientObjectsNested<A> addNewOAuthClientObject();
    public TemplateFluent.OAuthClientObjectsNested<A> addNewOAuthClientObjectLike(OAuthClient item);
    public A addToIdentityObjects(int index,Identity item);
    public A setToIdentityObjects(int index,Identity item);
    public A addToIdentityObjects(Identity... items);
    public A addAllToIdentityObjects(Collection<Identity> items);
    public A removeFromIdentityObjects(Identity... items);
    public A removeAllFromIdentityObjects(Collection<Identity> items);
    public TemplateFluent.IdentityObjectsNested<A> setNewIdentityObjectLike(int index,Identity item);
    public TemplateFluent.IdentityObjectsNested<A> addNewIdentityObject();
    public TemplateFluent.IdentityObjectsNested<A> addNewIdentityObjectLike(Identity item);
    public A addToLimitRangeObjects(int index,LimitRange item);
    public A setToLimitRangeObjects(int index,LimitRange item);
    public A addToLimitRangeObjects(LimitRange... items);
    public A addAllToLimitRangeObjects(Collection<LimitRange> items);
    public A removeFromLimitRangeObjects(LimitRange... items);
    public A removeAllFromLimitRangeObjects(Collection<LimitRange> items);
    public TemplateFluent.LimitRangeObjectsNested<A> setNewLimitRangeObjectLike(int index,LimitRange item);
    public TemplateFluent.LimitRangeObjectsNested<A> addNewLimitRangeObject();
    public TemplateFluent.LimitRangeObjectsNested<A> addNewLimitRangeObjectLike(LimitRange item);
    public A addToImageStreamImportObjects(int index,ImageStreamImport item);
    public A setToImageStreamImportObjects(int index,ImageStreamImport item);
    public A addToImageStreamImportObjects(ImageStreamImport... items);
    public A addAllToImageStreamImportObjects(Collection<ImageStreamImport> items);
    public A removeFromImageStreamImportObjects(ImageStreamImport... items);
    public A removeAllFromImageStreamImportObjects(Collection<ImageStreamImport> items);
    public TemplateFluent.ImageStreamImportObjectsNested<A> setNewImageStreamImportObjectLike(int index,ImageStreamImport item);
    public TemplateFluent.ImageStreamImportObjectsNested<A> addNewImageStreamImportObject();
    public TemplateFluent.ImageStreamImportObjectsNested<A> addNewImageStreamImportObjectLike(ImageStreamImport item);
    public A addToOpenshiftRoleBindingRestrictionObjects(int index,OpenshiftRoleBindingRestriction item);
    public A setToOpenshiftRoleBindingRestrictionObjects(int index,OpenshiftRoleBindingRestriction item);
    public A addToOpenshiftRoleBindingRestrictionObjects(OpenshiftRoleBindingRestriction... items);
    public A addAllToOpenshiftRoleBindingRestrictionObjects(Collection<OpenshiftRoleBindingRestriction> items);
    public A removeFromOpenshiftRoleBindingRestrictionObjects(OpenshiftRoleBindingRestriction... items);
    public A removeAllFromOpenshiftRoleBindingRestrictionObjects(Collection<OpenshiftRoleBindingRestriction> items);
    public TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<A> setNewOpenshiftRoleBindingRestrictionObjectLike(int index,OpenshiftRoleBindingRestriction item);
    public TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<A> addNewOpenshiftRoleBindingRestrictionObject();
    public TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<A> addNewOpenshiftRoleBindingRestrictionObjectLike(OpenshiftRoleBindingRestriction item);
    public A addToRoleBindingObjects(int index,RoleBinding item);
    public A setToRoleBindingObjects(int index,RoleBinding item);
    public A addToRoleBindingObjects(RoleBinding... items);
    public A addAllToRoleBindingObjects(Collection<RoleBinding> items);
    public A removeFromRoleBindingObjects(RoleBinding... items);
    public A removeAllFromRoleBindingObjects(Collection<RoleBinding> items);
    public TemplateFluent.RoleBindingObjectsNested<A> setNewRoleBindingObjectLike(int index,RoleBinding item);
    public TemplateFluent.RoleBindingObjectsNested<A> addNewRoleBindingObject();
    public TemplateFluent.RoleBindingObjectsNested<A> addNewRoleBindingObjectLike(RoleBinding item);
    public A addToPodPresetObjects(int index,PodPreset item);
    public A setToPodPresetObjects(int index,PodPreset item);
    public A addToPodPresetObjects(PodPreset... items);
    public A addAllToPodPresetObjects(Collection<PodPreset> items);
    public A removeFromPodPresetObjects(PodPreset... items);
    public A removeAllFromPodPresetObjects(Collection<PodPreset> items);
    public TemplateFluent.PodPresetObjectsNested<A> setNewPodPresetObjectLike(int index,PodPreset item);
    public TemplateFluent.PodPresetObjectsNested<A> addNewPodPresetObject();
    public TemplateFluent.PodPresetObjectsNested<A> addNewPodPresetObjectLike(PodPreset item);
    public A addToProjectObjects(int index,Project item);
    public A setToProjectObjects(int index,Project item);
    public A addToProjectObjects(Project... items);
    public A addAllToProjectObjects(Collection<Project> items);
    public A removeFromProjectObjects(Project... items);
    public A removeAllFromProjectObjects(Collection<Project> items);
    public TemplateFluent.ProjectObjectsNested<A> setNewProjectObjectLike(int index,Project item);
    public TemplateFluent.ProjectObjectsNested<A> addNewProjectObject();
    public TemplateFluent.ProjectObjectsNested<A> addNewProjectObjectLike(Project item);
    public A addToBuildConfigObjects(int index,BuildConfig item);
    public A setToBuildConfigObjects(int index,BuildConfig item);
    public A addToBuildConfigObjects(BuildConfig... items);
    public A addAllToBuildConfigObjects(Collection<BuildConfig> items);
    public A removeFromBuildConfigObjects(BuildConfig... items);
    public A removeAllFromBuildConfigObjects(Collection<BuildConfig> items);
    public TemplateFluent.BuildConfigObjectsNested<A> setNewBuildConfigObjectLike(int index,BuildConfig item);
    public TemplateFluent.BuildConfigObjectsNested<A> addNewBuildConfigObject();
    public TemplateFluent.BuildConfigObjectsNested<A> addNewBuildConfigObjectLike(BuildConfig item);
    public A addToClusterRoleObjects(int index,ClusterRole item);
    public A setToClusterRoleObjects(int index,ClusterRole item);
    public A addToClusterRoleObjects(ClusterRole... items);
    public A addAllToClusterRoleObjects(Collection<ClusterRole> items);
    public A removeFromClusterRoleObjects(ClusterRole... items);
    public A removeAllFromClusterRoleObjects(Collection<ClusterRole> items);
    public TemplateFluent.ClusterRoleObjectsNested<A> setNewClusterRoleObjectLike(int index,ClusterRole item);
    public TemplateFluent.ClusterRoleObjectsNested<A> addNewClusterRoleObject();
    public TemplateFluent.ClusterRoleObjectsNested<A> addNewClusterRoleObjectLike(ClusterRole item);
    public A addToOAuthAuthorizeTokenObjects(int index,OAuthAuthorizeToken item);
    public A setToOAuthAuthorizeTokenObjects(int index,OAuthAuthorizeToken item);
    public A addToOAuthAuthorizeTokenObjects(OAuthAuthorizeToken... items);
    public A addAllToOAuthAuthorizeTokenObjects(Collection<OAuthAuthorizeToken> items);
    public A removeFromOAuthAuthorizeTokenObjects(OAuthAuthorizeToken... items);
    public A removeAllFromOAuthAuthorizeTokenObjects(Collection<OAuthAuthorizeToken> items);
    public TemplateFluent.OAuthAuthorizeTokenObjectsNested<A> setNewOAuthAuthorizeTokenObjectLike(int index,OAuthAuthorizeToken item);
    public TemplateFluent.OAuthAuthorizeTokenObjectsNested<A> addNewOAuthAuthorizeTokenObject();
    public TemplateFluent.OAuthAuthorizeTokenObjectsNested<A> addNewOAuthAuthorizeTokenObjectLike(OAuthAuthorizeToken item);
    public A addToProjectRequestObjects(int index,ProjectRequest item);
    public A setToProjectRequestObjects(int index,ProjectRequest item);
    public A addToProjectRequestObjects(ProjectRequest... items);
    public A addAllToProjectRequestObjects(Collection<ProjectRequest> items);
    public A removeFromProjectRequestObjects(ProjectRequest... items);
    public A removeAllFromProjectRequestObjects(Collection<ProjectRequest> items);
    public TemplateFluent.ProjectRequestObjectsNested<A> setNewProjectRequestObjectLike(int index,ProjectRequest item);
    public TemplateFluent.ProjectRequestObjectsNested<A> addNewProjectRequestObject();
    public TemplateFluent.ProjectRequestObjectsNested<A> addNewProjectRequestObjectLike(ProjectRequest item);
    public A addToPriorityClassObjects(int index,PriorityClass item);
    public A setToPriorityClassObjects(int index,PriorityClass item);
    public A addToPriorityClassObjects(PriorityClass... items);
    public A addAllToPriorityClassObjects(Collection<PriorityClass> items);
    public A removeFromPriorityClassObjects(PriorityClass... items);
    public A removeAllFromPriorityClassObjects(Collection<PriorityClass> items);
    public TemplateFluent.PriorityClassObjectsNested<A> setNewPriorityClassObjectLike(int index,PriorityClass item);
    public TemplateFluent.PriorityClassObjectsNested<A> addNewPriorityClassObject();
    public TemplateFluent.PriorityClassObjectsNested<A> addNewPriorityClassObjectLike(PriorityClass item);
    public A addToTemplateObjects(int index,Template item);
    public A setToTemplateObjects(int index,Template item);
    public A addToTemplateObjects(Template... items);
    public A addAllToTemplateObjects(Collection<Template> items);
    public A removeFromTemplateObjects(Template... items);
    public A removeAllFromTemplateObjects(Collection<Template> items);
    public TemplateFluent.TemplateObjectsNested<A> setNewTemplateObjectLike(int index,Template item);
    public TemplateFluent.TemplateObjectsNested<A> addNewTemplateObject();
    public TemplateFluent.TemplateObjectsNested<A> addNewTemplateObjectLike(Template item);
    public A addToOAuthClientAuthorizationObjects(int index,OAuthClientAuthorization item);
    public A setToOAuthClientAuthorizationObjects(int index,OAuthClientAuthorization item);
    public A addToOAuthClientAuthorizationObjects(OAuthClientAuthorization... items);
    public A addAllToOAuthClientAuthorizationObjects(Collection<OAuthClientAuthorization> items);
    public A removeFromOAuthClientAuthorizationObjects(OAuthClientAuthorization... items);
    public A removeAllFromOAuthClientAuthorizationObjects(Collection<OAuthClientAuthorization> items);
    public TemplateFluent.OAuthClientAuthorizationObjectsNested<A> setNewOAuthClientAuthorizationObjectLike(int index,OAuthClientAuthorization item);
    public TemplateFluent.OAuthClientAuthorizationObjectsNested<A> addNewOAuthClientAuthorizationObject();
    public TemplateFluent.OAuthClientAuthorizationObjectsNested<A> addNewOAuthClientAuthorizationObjectLike(OAuthClientAuthorization item);
    public A addToDeploymentObjects(int index,Deployment item);
    public A setToDeploymentObjects(int index,Deployment item);
    public A addToDeploymentObjects(Deployment... items);
    public A addAllToDeploymentObjects(Collection<Deployment> items);
    public A removeFromDeploymentObjects(Deployment... items);
    public A removeAllFromDeploymentObjects(Collection<Deployment> items);
    public TemplateFluent.DeploymentObjectsNested<A> setNewDeploymentObjectLike(int index,Deployment item);
    public TemplateFluent.DeploymentObjectsNested<A> addNewDeploymentObject();
    public TemplateFluent.DeploymentObjectsNested<A> addNewDeploymentObjectLike(Deployment item);
    public A addToPodTemplateObjects(int index,PodTemplate item);
    public A setToPodTemplateObjects(int index,PodTemplate item);
    public A addToPodTemplateObjects(PodTemplate... items);
    public A addAllToPodTemplateObjects(Collection<PodTemplate> items);
    public A removeFromPodTemplateObjects(PodTemplate... items);
    public A removeAllFromPodTemplateObjects(Collection<PodTemplate> items);
    public TemplateFluent.PodTemplateObjectsNested<A> setNewPodTemplateObjectLike(int index,PodTemplate item);
    public TemplateFluent.PodTemplateObjectsNested<A> addNewPodTemplateObject();
    public TemplateFluent.PodTemplateObjectsNested<A> addNewPodTemplateObjectLike(PodTemplate item);
    public A addToEventObjects(int index,Event item);
    public A setToEventObjects(int index,Event item);
    public A addToEventObjects(Event... items);
    public A addAllToEventObjects(Collection<Event> items);
    public A removeFromEventObjects(Event... items);
    public A removeAllFromEventObjects(Collection<Event> items);
    public TemplateFluent.EventObjectsNested<A> setNewEventObjectLike(int index,Event item);
    public TemplateFluent.EventObjectsNested<A> addNewEventObject();
    public TemplateFluent.EventObjectsNested<A> addNewEventObjectLike(Event item);
    public A addToIngressObjects(int index,Ingress item);
    public A setToIngressObjects(int index,Ingress item);
    public A addToIngressObjects(Ingress... items);
    public A addAllToIngressObjects(Collection<Ingress> items);
    public A removeFromIngressObjects(Ingress... items);
    public A removeAllFromIngressObjects(Collection<Ingress> items);
    public TemplateFluent.IngressObjectsNested<A> setNewIngressObjectLike(int index,Ingress item);
    public TemplateFluent.IngressObjectsNested<A> addNewIngressObject();
    public TemplateFluent.IngressObjectsNested<A> addNewIngressObjectLike(Ingress item);
    public A addToDeploymentConfigObjects(int index,DeploymentConfig item);
    public A setToDeploymentConfigObjects(int index,DeploymentConfig item);
    public A addToDeploymentConfigObjects(DeploymentConfig... items);
    public A addAllToDeploymentConfigObjects(Collection<DeploymentConfig> items);
    public A removeFromDeploymentConfigObjects(DeploymentConfig... items);
    public A removeAllFromDeploymentConfigObjects(Collection<DeploymentConfig> items);
    public TemplateFluent.DeploymentConfigObjectsNested<A> setNewDeploymentConfigObjectLike(int index,DeploymentConfig item);
    public TemplateFluent.DeploymentConfigObjectsNested<A> addNewDeploymentConfigObject();
    public TemplateFluent.DeploymentConfigObjectsNested<A> addNewDeploymentConfigObjectLike(DeploymentConfig item);
    public A addToOAuthAccessTokenObjects(int index,OAuthAccessToken item);
    public A setToOAuthAccessTokenObjects(int index,OAuthAccessToken item);
    public A addToOAuthAccessTokenObjects(OAuthAccessToken... items);
    public A addAllToOAuthAccessTokenObjects(Collection<OAuthAccessToken> items);
    public A removeFromOAuthAccessTokenObjects(OAuthAccessToken... items);
    public A removeAllFromOAuthAccessTokenObjects(Collection<OAuthAccessToken> items);
    public TemplateFluent.OAuthAccessTokenObjectsNested<A> setNewOAuthAccessTokenObjectLike(int index,OAuthAccessToken item);
    public TemplateFluent.OAuthAccessTokenObjectsNested<A> addNewOAuthAccessTokenObject();
    public TemplateFluent.OAuthAccessTokenObjectsNested<A> addNewOAuthAccessTokenObjectLike(OAuthAccessToken item);
    public A addToPersistentVolumeObjects(int index,PersistentVolume item);
    public A setToPersistentVolumeObjects(int index,PersistentVolume item);
    public A addToPersistentVolumeObjects(PersistentVolume... items);
    public A addAllToPersistentVolumeObjects(Collection<PersistentVolume> items);
    public A removeFromPersistentVolumeObjects(PersistentVolume... items);
    public A removeAllFromPersistentVolumeObjects(Collection<PersistentVolume> items);
    public TemplateFluent.PersistentVolumeObjectsNested<A> setNewPersistentVolumeObjectLike(int index,PersistentVolume item);
    public TemplateFluent.PersistentVolumeObjectsNested<A> addNewPersistentVolumeObject();
    public TemplateFluent.PersistentVolumeObjectsNested<A> addNewPersistentVolumeObjectLike(PersistentVolume item);
    public A addToPersistentVolumeClaimObjects(int index,PersistentVolumeClaim item);
    public A setToPersistentVolumeClaimObjects(int index,PersistentVolumeClaim item);
    public A addToPersistentVolumeClaimObjects(PersistentVolumeClaim... items);
    public A addAllToPersistentVolumeClaimObjects(Collection<PersistentVolumeClaim> items);
    public A removeFromPersistentVolumeClaimObjects(PersistentVolumeClaim... items);
    public A removeAllFromPersistentVolumeClaimObjects(Collection<PersistentVolumeClaim> items);
    public TemplateFluent.PersistentVolumeClaimObjectsNested<A> setNewPersistentVolumeClaimObjectLike(int index,PersistentVolumeClaim item);
    public TemplateFluent.PersistentVolumeClaimObjectsNested<A> addNewPersistentVolumeClaimObject();
    public TemplateFluent.PersistentVolumeClaimObjectsNested<A> addNewPersistentVolumeClaimObjectLike(PersistentVolumeClaim item);
    public A addToEventObjects(int index,io.fabric8.kubernetes.api.model.events.Event item);
    public A setToEventObjects(int index,io.fabric8.kubernetes.api.model.events.Event item);
    public A addToEventObjects(io.fabric8.kubernetes.api.model.events.Event... items);
    public A addAllToEventsEventObjects(Collection<io.fabric8.kubernetes.api.model.events.Event> items);
    public A removeFromEventObjects(io.fabric8.kubernetes.api.model.events.Event... items);
    public A removeAllFromEventsEventObjects(Collection<io.fabric8.kubernetes.api.model.events.Event> items);
    public TemplateFluent.EventsEventObjectsNested<A> setNewEventObjectLike(int index,io.fabric8.kubernetes.api.model.events.Event item);
    public TemplateFluent.EventsEventObjectsNested<A> addNewEventsEventObject();
    public TemplateFluent.EventsEventObjectsNested<A> addNewEventObjectLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A addToStatefulSetObjects(int index,StatefulSet item);
    public A setToStatefulSetObjects(int index,StatefulSet item);
    public A addToStatefulSetObjects(StatefulSet... items);
    public A addAllToStatefulSetObjects(Collection<StatefulSet> items);
    public A removeFromStatefulSetObjects(StatefulSet... items);
    public A removeAllFromStatefulSetObjects(Collection<StatefulSet> items);
    public TemplateFluent.StatefulSetObjectsNested<A> setNewStatefulSetObjectLike(int index,StatefulSet item);
    public TemplateFluent.StatefulSetObjectsNested<A> addNewStatefulSetObject();
    public TemplateFluent.StatefulSetObjectsNested<A> addNewStatefulSetObjectLike(StatefulSet item);
    public A addToOpenshiftClusterRoleObjects(int index,OpenshiftClusterRole item);
    public A setToOpenshiftClusterRoleObjects(int index,OpenshiftClusterRole item);
    public A addToOpenshiftClusterRoleObjects(OpenshiftClusterRole... items);
    public A addAllToOpenshiftClusterRoleObjects(Collection<OpenshiftClusterRole> items);
    public A removeFromOpenshiftClusterRoleObjects(OpenshiftClusterRole... items);
    public A removeAllFromOpenshiftClusterRoleObjects(Collection<OpenshiftClusterRole> items);
    public TemplateFluent.OpenshiftClusterRoleObjectsNested<A> setNewOpenshiftClusterRoleObjectLike(int index,OpenshiftClusterRole item);
    public TemplateFluent.OpenshiftClusterRoleObjectsNested<A> addNewOpenshiftClusterRoleObject();
    public TemplateFluent.OpenshiftClusterRoleObjectsNested<A> addNewOpenshiftClusterRoleObjectLike(OpenshiftClusterRole item);
    public A addToRoleObjects(int index,Role item);
    public A setToRoleObjects(int index,Role item);
    public A addToRoleObjects(Role... items);
    public A addAllToRoleObjects(Collection<Role> items);
    public A removeFromRoleObjects(Role... items);
    public A removeAllFromRoleObjects(Collection<Role> items);
    public TemplateFluent.RoleObjectsNested<A> setNewRoleObjectLike(int index,Role item);
    public TemplateFluent.RoleObjectsNested<A> addNewRoleObject();
    public TemplateFluent.RoleObjectsNested<A> addNewRoleObjectLike(Role item);
    public A addToUserObjects(int index,User item);
    public A setToUserObjects(int index,User item);
    public A addToUserObjects(User... items);
    public A addAllToUserObjects(Collection<User> items);
    public A removeFromUserObjects(User... items);
    public A removeAllFromUserObjects(Collection<User> items);
    public TemplateFluent.UserObjectsNested<A> setNewUserObjectLike(int index,User item);
    public TemplateFluent.UserObjectsNested<A> addNewUserObject();
    public TemplateFluent.UserObjectsNested<A> addNewUserObjectLike(User item);
    public A addToComponentStatusObjects(int index,ComponentStatus item);
    public A setToComponentStatusObjects(int index,ComponentStatus item);
    public A addToComponentStatusObjects(ComponentStatus... items);
    public A addAllToComponentStatusObjects(Collection<ComponentStatus> items);
    public A removeFromComponentStatusObjects(ComponentStatus... items);
    public A removeAllFromComponentStatusObjects(Collection<ComponentStatus> items);
    public TemplateFluent.ComponentStatusObjectsNested<A> setNewComponentStatusObjectLike(int index,ComponentStatus item);
    public TemplateFluent.ComponentStatusObjectsNested<A> addNewComponentStatusObject();
    public TemplateFluent.ComponentStatusObjectsNested<A> addNewComponentStatusObjectLike(ComponentStatus item);
    public A addToTokenReviewObjects(int index,TokenReview item);
    public A setToTokenReviewObjects(int index,TokenReview item);
    public A addToTokenReviewObjects(TokenReview... items);
    public A addAllToTokenReviewObjects(Collection<TokenReview> items);
    public A removeFromTokenReviewObjects(TokenReview... items);
    public A removeAllFromTokenReviewObjects(Collection<TokenReview> items);
    public TemplateFluent.TokenReviewObjectsNested<A> setNewTokenReviewObjectLike(int index,TokenReview item);
    public TemplateFluent.TokenReviewObjectsNested<A> addNewTokenReviewObject();
    public TemplateFluent.TokenReviewObjectsNested<A> addNewTokenReviewObjectLike(TokenReview item);
    public A addToBindingObjects(int index,Binding item);
    public A setToBindingObjects(int index,Binding item);
    public A addToBindingObjects(Binding... items);
    public A addAllToBindingObjects(Collection<Binding> items);
    public A removeFromBindingObjects(Binding... items);
    public A removeAllFromBindingObjects(Collection<Binding> items);
    public TemplateFluent.BindingObjectsNested<A> setNewBindingObjectLike(int index,Binding item);
    public TemplateFluent.BindingObjectsNested<A> addNewBindingObject();
    public TemplateFluent.BindingObjectsNested<A> addNewBindingObjectLike(Binding item);
    public A addToSecretObjects(int index,Secret item);
    public A setToSecretObjects(int index,Secret item);
    public A addToSecretObjects(Secret... items);
    public A addAllToSecretObjects(Collection<Secret> items);
    public A removeFromSecretObjects(Secret... items);
    public A removeAllFromSecretObjects(Collection<Secret> items);
    public TemplateFluent.SecretObjectsNested<A> setNewSecretObjectLike(int index,Secret item);
    public TemplateFluent.SecretObjectsNested<A> addNewSecretObject();
    public TemplateFluent.SecretObjectsNested<A> addNewSecretObjectLike(Secret item);
    public A addToSecurityContextConstraintsObjects(int index,SecurityContextConstraints item);
    public A setToSecurityContextConstraintsObjects(int index,SecurityContextConstraints item);
    public A addToSecurityContextConstraintsObjects(SecurityContextConstraints... items);
    public A addAllToSecurityContextConstraintsObjects(Collection<SecurityContextConstraints> items);
    public A removeFromSecurityContextConstraintsObjects(SecurityContextConstraints... items);
    public A removeAllFromSecurityContextConstraintsObjects(Collection<SecurityContextConstraints> items);
    public TemplateFluent.SecurityContextConstraintsObjectsNested<A> setNewSecurityContextConstraintsObjectLike(int index,SecurityContextConstraints item);
    public TemplateFluent.SecurityContextConstraintsObjectsNested<A> addNewSecurityContextConstraintsObject();
    public TemplateFluent.SecurityContextConstraintsObjectsNested<A> addNewSecurityContextConstraintsObjectLike(SecurityContextConstraints item);
    public A addToNetNamespaceObjects(int index,NetNamespace item);
    public A setToNetNamespaceObjects(int index,NetNamespace item);
    public A addToNetNamespaceObjects(NetNamespace... items);
    public A addAllToNetNamespaceObjects(Collection<NetNamespace> items);
    public A removeFromNetNamespaceObjects(NetNamespace... items);
    public A removeAllFromNetNamespaceObjects(Collection<NetNamespace> items);
    public TemplateFluent.NetNamespaceObjectsNested<A> setNewNetNamespaceObjectLike(int index,NetNamespace item);
    public TemplateFluent.NetNamespaceObjectsNested<A> addNewNetNamespaceObject();
    public TemplateFluent.NetNamespaceObjectsNested<A> addNewNetNamespaceObjectLike(NetNamespace item);
    public A addToNodeObjects(int index,Node item);
    public A setToNodeObjects(int index,Node item);
    public A addToNodeObjects(Node... items);
    public A addAllToNodeObjects(Collection<Node> items);
    public A removeFromNodeObjects(Node... items);
    public A removeAllFromNodeObjects(Collection<Node> items);
    public TemplateFluent.NodeObjectsNested<A> setNewNodeObjectLike(int index,Node item);
    public TemplateFluent.NodeObjectsNested<A> addNewNodeObject();
    public TemplateFluent.NodeObjectsNested<A> addNewNodeObjectLike(Node item);
    public A addToJobObjects(int index,Job item);
    public A setToJobObjects(int index,Job item);
    public A addToJobObjects(Job... items);
    public A addAllToJobObjects(Collection<Job> items);
    public A removeFromJobObjects(Job... items);
    public A removeAllFromJobObjects(Collection<Job> items);
    public TemplateFluent.JobObjectsNested<A> setNewJobObjectLike(int index,Job item);
    public TemplateFluent.JobObjectsNested<A> addNewJobObject();
    public TemplateFluent.JobObjectsNested<A> addNewJobObjectLike(Job item);
    public A addToCertificateSigningRequestObjects(int index,CertificateSigningRequest item);
    public A setToCertificateSigningRequestObjects(int index,CertificateSigningRequest item);
    public A addToCertificateSigningRequestObjects(CertificateSigningRequest... items);
    public A addAllToCertificateSigningRequestObjects(Collection<CertificateSigningRequest> items);
    public A removeFromCertificateSigningRequestObjects(CertificateSigningRequest... items);
    public A removeAllFromCertificateSigningRequestObjects(Collection<CertificateSigningRequest> items);
    public TemplateFluent.CertificateSigningRequestObjectsNested<A> setNewCertificateSigningRequestObjectLike(int index,CertificateSigningRequest item);
    public TemplateFluent.CertificateSigningRequestObjectsNested<A> addNewCertificateSigningRequestObject();
    public TemplateFluent.CertificateSigningRequestObjectsNested<A> addNewCertificateSigningRequestObjectLike(CertificateSigningRequest item);
    public A addToServiceAccountObjects(int index,ServiceAccount item);
    public A setToServiceAccountObjects(int index,ServiceAccount item);
    public A addToServiceAccountObjects(ServiceAccount... items);
    public A addAllToServiceAccountObjects(Collection<ServiceAccount> items);
    public A removeFromServiceAccountObjects(ServiceAccount... items);
    public A removeAllFromServiceAccountObjects(Collection<ServiceAccount> items);
    public TemplateFluent.ServiceAccountObjectsNested<A> setNewServiceAccountObjectLike(int index,ServiceAccount item);
    public TemplateFluent.ServiceAccountObjectsNested<A> addNewServiceAccountObject();
    public TemplateFluent.ServiceAccountObjectsNested<A> addNewServiceAccountObjectLike(ServiceAccount item);
    public A addToParameters(int index,Parameter item);
    public A setToParameters(int index,Parameter item);
    public A addToParameters(Parameter... items);
    public A addAllToParameters(Collection<Parameter> items);
    public A removeFromParameters(Parameter... items);
    public A removeAllFromParameters(Collection<Parameter> items);
    
/**
 * This method has been deprecated, please use method buildParameters instead.
 * @return The buildable object.
 */
@Deprecated public List<Parameter> getParameters();
    public List<Parameter> buildParameters();
    public Parameter buildParameter(int index);
    public Parameter buildFirstParameter();
    public Parameter buildLastParameter();
    public Parameter buildMatchingParameter(io.fabric8.kubernetes.api.builder.Predicate<ParameterBuilder> predicate);
    public A withParameters(List<Parameter> parameters);
    public A withParameters(Parameter... parameters);
    public Boolean hasParameters();
    public TemplateFluent.ParametersNested<A> addNewParameter();
    public TemplateFluent.ParametersNested<A> addNewParameterLike(Parameter item);
    public TemplateFluent.ParametersNested<A> setNewParameterLike(int index,Parameter item);
    public TemplateFluent.ParametersNested<A> editParameter(int index);
    public TemplateFluent.ParametersNested<A> editFirstParameter();
    public TemplateFluent.ParametersNested<A> editLastParameter();
    public TemplateFluent.ParametersNested<A> editMatchingParameter(io.fabric8.kubernetes.api.builder.Predicate<ParameterBuilder> predicate);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<TemplateFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface ValidatingWebhookConfigurationObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<TemplateFluent.ValidatingWebhookConfigurationObjectsNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationObject();
}
    public interface StorageClassObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<TemplateFluent.StorageClassObjectsNested<N>>{

        
    public N and();    public N endStorageClassObject();
}
    public interface ClusterRoleBindingObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<TemplateFluent.ClusterRoleBindingObjectsNested<N>>{

        
    public N and();    public N endClusterRoleBindingObject();
}
    public interface OpenshiftRoleBindingObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<TemplateFluent.OpenshiftRoleBindingObjectsNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingObject();
}
    public interface PodDisruptionBudgetObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<TemplateFluent.PodDisruptionBudgetObjectsNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetObject();
}
    public interface NetworkPolicyObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<TemplateFluent.NetworkPolicyObjectsNested<N>>{

        
    public N and();    public N endNetworkPolicyObject();
}
    public interface OpenshiftClusterRoleBindingObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingObject();
}
    public interface RouteObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<TemplateFluent.RouteObjectsNested<N>>{

        
    public N and();    public N endRouteObject();
}
    public interface NamespaceObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<TemplateFluent.NamespaceObjectsNested<N>>{

        
    public N and();    public N endNamespaceObject();
}
    public interface LocalSubjectAccessReviewObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent<TemplateFluent.LocalSubjectAccessReviewObjectsNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewObject();
}
    public interface ServiceObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<TemplateFluent.ServiceObjectsNested<N>>{

        
    public N and();    public N endServiceObject();
}
    public interface ReplicationControllerObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<TemplateFluent.ReplicationControllerObjectsNested<N>>{

        
    public N and();    public N endReplicationControllerObject();
}
    public interface SubjectAccessReviewObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent<TemplateFluent.SubjectAccessReviewObjectsNested<N>>{

        
    public N and();    public N endSubjectAccessReviewObject();
}
    public interface MutatingWebhookConfigurationObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<TemplateFluent.MutatingWebhookConfigurationObjectsNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationObject();
}
    public interface HorizontalPodAutoscalerObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<TemplateFluent.HorizontalPodAutoscalerObjectsNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerObject();
}
    public interface ScaleObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<TemplateFluent.ScaleObjectsNested<N>>{

        
    public N and();    public N endScaleObject();
}
    public interface ImageObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<TemplateFluent.ImageObjectsNested<N>>{

        
    public N and();    public N endImageObject();
}
    public interface ReplicaSetObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<TemplateFluent.ReplicaSetObjectsNested<N>>{

        
    public N and();    public N endReplicaSetObject();
}
    public interface PodSecurityPolicyObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<TemplateFluent.PodSecurityPolicyObjectsNested<N>>{

        
    public N and();    public N endPodSecurityPolicyObject();
}
    public interface CronJobObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<TemplateFluent.CronJobObjectsNested<N>>{

        
    public N and();    public N endCronJobObject();
}
    public interface EndpointsObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<TemplateFluent.EndpointsObjectsNested<N>>{

        
    public N and();    public N endEndpointsObject();
}
    public interface PodObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<TemplateFluent.PodObjectsNested<N>>{

        
    public N and();    public N endPodObject();
}
    public interface ConfigMapObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<TemplateFluent.ConfigMapObjectsNested<N>>{

        
    public N and();    public N endConfigMapObject();
}
    public interface CustomResourceDefinitionObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<TemplateFluent.CustomResourceDefinitionObjectsNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionObject();
}
    public interface BuildObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<TemplateFluent.BuildObjectsNested<N>>{

        
    public N and();    public N endBuildObject();
}
    public interface ImageStreamTagObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<TemplateFluent.ImageStreamTagObjectsNested<N>>{

        
    public N and();    public N endImageStreamTagObject();
}
    public interface GroupObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<TemplateFluent.GroupObjectsNested<N>>{

        
    public N and();    public N endGroupObject();
}
    public interface ImageSignatureObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<TemplateFluent.ImageSignatureObjectsNested<N>>{

        
    public N and();    public N endImageSignatureObject();
}
    public interface ResourceQuotaObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<TemplateFluent.ResourceQuotaObjectsNested<N>>{

        
    public N and();    public N endResourceQuotaObject();
}
    public interface BuildRequestObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<TemplateFluent.BuildRequestObjectsNested<N>>{

        
    public N and();    public N endBuildRequestObject();
}
    public interface DaemonSetObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<TemplateFluent.DaemonSetObjectsNested<N>>{

        
    public N and();    public N endDaemonSetObject();
}
    public interface ImageStreamObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<TemplateFluent.ImageStreamObjectsNested<N>>{

        
    public N and();    public N endImageStreamObject();
}
    public interface OpenshiftRoleObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<TemplateFluent.OpenshiftRoleObjectsNested<N>>{

        
    public N and();    public N endOpenshiftRoleObject();
}
    public interface OAuthClientObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<TemplateFluent.OAuthClientObjectsNested<N>>{

        
    public N and();    public N endOAuthClientObject();
}
    public interface IdentityObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<TemplateFluent.IdentityObjectsNested<N>>{

        
    public N and();    public N endIdentityObject();
}
    public interface LimitRangeObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<TemplateFluent.LimitRangeObjectsNested<N>>{

        
    public N and();    public N endLimitRangeObject();
}
    public interface ImageStreamImportObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<TemplateFluent.ImageStreamImportObjectsNested<N>>{

        
    public N and();    public N endImageStreamImportObject();
}
    public interface OpenshiftRoleBindingRestrictionObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionObject();
}
    public interface RoleBindingObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<TemplateFluent.RoleBindingObjectsNested<N>>{

        
    public N and();    public N endRoleBindingObject();
}
    public interface PodPresetObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<TemplateFluent.PodPresetObjectsNested<N>>{

        
    public N and();    public N endPodPresetObject();
}
    public interface ProjectObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<TemplateFluent.ProjectObjectsNested<N>>{

        
    public N and();    public N endProjectObject();
}
    public interface BuildConfigObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<TemplateFluent.BuildConfigObjectsNested<N>>{

        
    public N and();    public N endBuildConfigObject();
}
    public interface ClusterRoleObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<TemplateFluent.ClusterRoleObjectsNested<N>>{

        
    public N and();    public N endClusterRoleObject();
}
    public interface OAuthAuthorizeTokenObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<TemplateFluent.OAuthAuthorizeTokenObjectsNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenObject();
}
    public interface ProjectRequestObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<TemplateFluent.ProjectRequestObjectsNested<N>>{

        
    public N and();    public N endProjectRequestObject();
}
    public interface PriorityClassObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<TemplateFluent.PriorityClassObjectsNested<N>>{

        
    public N and();    public N endPriorityClassObject();
}
    public interface TemplateObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<TemplateFluent.TemplateObjectsNested<N>>{

        
    public N and();    public N endTemplateObject();
}
    public interface OAuthClientAuthorizationObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<TemplateFluent.OAuthClientAuthorizationObjectsNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationObject();
}
    public interface DeploymentObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<TemplateFluent.DeploymentObjectsNested<N>>{

        
    public N and();    public N endDeploymentObject();
}
    public interface PodTemplateObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<TemplateFluent.PodTemplateObjectsNested<N>>{

        
    public N and();    public N endPodTemplateObject();
}
    public interface EventObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<TemplateFluent.EventObjectsNested<N>>{

        
    public N and();    public N endEventObject();
}
    public interface IngressObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<TemplateFluent.IngressObjectsNested<N>>{

        
    public N and();    public N endIngressObject();
}
    public interface DeploymentConfigObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<TemplateFluent.DeploymentConfigObjectsNested<N>>{

        
    public N and();    public N endDeploymentConfigObject();
}
    public interface OAuthAccessTokenObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<TemplateFluent.OAuthAccessTokenObjectsNested<N>>{

        
    public N and();    public N endOAuthAccessTokenObject();
}
    public interface PersistentVolumeObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<TemplateFluent.PersistentVolumeObjectsNested<N>>{

        
    public N and();    public N endPersistentVolumeObject();
}
    public interface PersistentVolumeClaimObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<TemplateFluent.PersistentVolumeClaimObjectsNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimObject();
}
    public interface EventsEventObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<TemplateFluent.EventsEventObjectsNested<N>>{

        
    public N and();    public N endEventsEventObject();
}
    public interface StatefulSetObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<TemplateFluent.StatefulSetObjectsNested<N>>{

        
    public N and();    public N endStatefulSetObject();
}
    public interface OpenshiftClusterRoleObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<TemplateFluent.OpenshiftClusterRoleObjectsNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleObject();
}
    public interface RoleObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<TemplateFluent.RoleObjectsNested<N>>{

        
    public N and();    public N endRoleObject();
}
    public interface UserObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<TemplateFluent.UserObjectsNested<N>>{

        
    public N and();    public N endUserObject();
}
    public interface ComponentStatusObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<TemplateFluent.ComponentStatusObjectsNested<N>>{

        
    public N and();    public N endComponentStatusObject();
}
    public interface TokenReviewObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<TemplateFluent.TokenReviewObjectsNested<N>>{

        
    public N and();    public N endTokenReviewObject();
}
    public interface BindingObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<TemplateFluent.BindingObjectsNested<N>>{

        
    public N and();    public N endBindingObject();
}
    public interface SecretObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<TemplateFluent.SecretObjectsNested<N>>{

        
    public N and();    public N endSecretObject();
}
    public interface SecurityContextConstraintsObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<TemplateFluent.SecurityContextConstraintsObjectsNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsObject();
}
    public interface NetNamespaceObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<TemplateFluent.NetNamespaceObjectsNested<N>>{

        
    public N and();    public N endNetNamespaceObject();
}
    public interface NodeObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<TemplateFluent.NodeObjectsNested<N>>{

        
    public N and();    public N endNodeObject();
}
    public interface JobObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<TemplateFluent.JobObjectsNested<N>>{

        
    public N and();    public N endJobObject();
}
    public interface CertificateSigningRequestObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<TemplateFluent.CertificateSigningRequestObjectsNested<N>>{

        
    public N and();    public N endCertificateSigningRequestObject();
}
    public interface ServiceAccountObjectsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<TemplateFluent.ServiceAccountObjectsNested<N>>{

        
    public N and();    public N endServiceAccountObject();
}
    public interface ParametersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ParameterFluent<TemplateFluent.ParametersNested<N>>{

        
    public N and();    public N endParameter();
}


}
