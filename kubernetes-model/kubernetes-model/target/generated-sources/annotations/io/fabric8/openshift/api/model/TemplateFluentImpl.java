package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.model.Node;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.NodeBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.SecretBuilder;
import io.fabric8.kubernetes.api.model.ReplicationController;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluentImpl;
import io.fabric8.kubernetes.api.model.PodTemplateFluentImpl;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.PodBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.EndpointsBuilder;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.PodFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.EventBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.ConfigMapFluentImpl;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluentImpl;
import io.fabric8.kubernetes.api.model.PodTemplateBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.List;
import io.fabric8.kubernetes.api.model.PodTemplate;
import io.fabric8.kubernetes.api.model.Binding;
import io.fabric8.kubernetes.api.model.LimitRangeBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimBuilder;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.batch.JobFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluentImpl;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.SecretFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluentImpl;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import io.fabric8.kubernetes.api.model.EndpointsFluentImpl;
import io.fabric8.kubernetes.api.model.ServiceAccountFluentImpl;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerFluentImpl;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.kubernetes.api.model.BindingFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluentImpl;
import io.fabric8.kubernetes.api.model.Namespace;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.ComponentStatus;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.ComponentStatusFluentImpl;
import io.fabric8.kubernetes.api.model.LimitRangeFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolumeBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.EventFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerBuilder;
import io.fabric8.kubernetes.api.model.ResourceQuotaBuilder;
import io.fabric8.kubernetes.api.model.ServiceAccountBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.kubernetes.api.model.ResourceQuotaFluentImpl;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.api.model.LimitRange;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.BindingBuilder;
import io.fabric8.kubernetes.api.model.ComponentStatusBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerBuilder;
import io.fabric8.kubernetes.api.model.ServiceBuilder;
import io.fabric8.kubernetes.api.model.Endpoints;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobFluentImpl;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.NamespaceFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluentImpl;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;
import io.fabric8.kubernetes.api.model.NodeFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolumeFluentImpl;
import io.fabric8.kubernetes.api.model.ServiceFluentImpl;

public class TemplateFluentImpl<A extends TemplateFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TemplateFluent<A>{

    private String apiVersion;
    private String kind;
    private Map<String,String> labels;
    private ObjectMetaBuilder metadata;
    private List<VisitableBuilder<? extends HasMetadata,?>> objects;
    private List<ParameterBuilder> parameters;

    public TemplateFluentImpl(){
    }
    public TemplateFluentImpl(Template instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withLabels(instance.getLabels()); 
            this.withMetadata(instance.getMetadata()); 
            this.withObjects(instance.getObjects()); 
            this.withParameters(instance.getParameters()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public A addToLabels(String key,String value){
            if(this.labels == null && key != null && value != null) { this.labels = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.labels.put(key, value);} return (A)this;
    }

    public A addToLabels(Map<String,String> map){
            if(this.labels == null && map != null) { this.labels = new LinkedHashMap<String,String>(); }
            if(map != null) { this.labels.putAll(map);} return (A)this;
    }

    public A removeFromLabels(String key){
            if(this.labels == null) { return (A) this; }
            if(key != null && this.labels != null) {this.labels.remove(key);} return (A)this;
    }

    public A removeFromLabels(Map<String,String> map){
            if(this.labels == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.labels != null){this.labels.remove(key);}}} return (A)this;
    }

    public Map<String,String> getLabels(){
            return this.labels;
    }

    public A withLabels(Map<String,String> labels){
            if (labels == null) { this.labels =  new LinkedHashMap<String,String>();} else {this.labels = new LinkedHashMap<String,String>(labels);} return (A) this;
    }

    public Boolean hasLabels(){
            return this.labels != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public TemplateFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public TemplateFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public TemplateFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public TemplateFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public TemplateFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToObjects(VisitableBuilder<? extends HasMetadata,?> builder){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            _visitables.add(builder);this.objects.add(builder); return (A)this;
    }

    public A addToObjects(int index,VisitableBuilder<? extends HasMetadata,?> builder){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            _visitables.add(index, builder);this.objects.add(index, builder); return (A)this;
    }

    public A addToObjects(int index,HasMetadata item){
            if (item instanceof ValidatingWebhookConfiguration){addToValidatingWebhookConfigurationObjects(index, (ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){addToStorageClassObjects(index, (StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){addToClusterRoleBindingObjects(index, (ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){addToOpenshiftRoleBindingObjects(index, (OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){addToPodDisruptionBudgetObjects(index, (PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){addToNetworkPolicyObjects(index, (NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){addToOpenshiftClusterRoleBindingObjects(index, (OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){addToRouteObjects(index, (Route)item);}
 else if (item instanceof Namespace){addToNamespaceObjects(index, (Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){addToLocalSubjectAccessReviewObjects(index, (LocalSubjectAccessReview)item);}
 else if (item instanceof Service){addToServiceObjects(index, (Service)item);}
 else if (item instanceof ReplicationController){addToReplicationControllerObjects(index, (ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){addToSubjectAccessReviewObjects(index, (SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){addToMutatingWebhookConfigurationObjects(index, (MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){addToHorizontalPodAutoscalerObjects(index, (HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){addToScaleObjects(index, (Scale)item);}
 else if (item instanceof Image){addToImageObjects(index, (Image)item);}
 else if (item instanceof ReplicaSet){addToReplicaSetObjects(index, (ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){addToPodSecurityPolicyObjects(index, (PodSecurityPolicy)item);}
 else if (item instanceof CronJob){addToCronJobObjects(index, (CronJob)item);}
 else if (item instanceof Endpoints){addToEndpointsObjects(index, (Endpoints)item);}
 else if (item instanceof Pod){addToPodObjects(index, (Pod)item);}
 else if (item instanceof ConfigMap){addToConfigMapObjects(index, (ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){addToCustomResourceDefinitionObjects(index, (CustomResourceDefinition)item);}
 else if (item instanceof Build){addToBuildObjects(index, (Build)item);}
 else if (item instanceof ImageStreamTag){addToImageStreamTagObjects(index, (ImageStreamTag)item);}
 else if (item instanceof Group){addToGroupObjects(index, (Group)item);}
 else if (item instanceof ImageSignature){addToImageSignatureObjects(index, (ImageSignature)item);}
 else if (item instanceof ResourceQuota){addToResourceQuotaObjects(index, (ResourceQuota)item);}
 else if (item instanceof BuildRequest){addToBuildRequestObjects(index, (BuildRequest)item);}
 else if (item instanceof DaemonSet){addToDaemonSetObjects(index, (DaemonSet)item);}
 else if (item instanceof ImageStream){addToImageStreamObjects(index, (ImageStream)item);}
 else if (item instanceof OpenshiftRole){addToOpenshiftRoleObjects(index, (OpenshiftRole)item);}
 else if (item instanceof OAuthClient){addToOAuthClientObjects(index, (OAuthClient)item);}
 else if (item instanceof Identity){addToIdentityObjects(index, (Identity)item);}
 else if (item instanceof LimitRange){addToLimitRangeObjects(index, (LimitRange)item);}
 else if (item instanceof ImageStreamImport){addToImageStreamImportObjects(index, (ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){addToOpenshiftRoleBindingRestrictionObjects(index, (OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){addToRoleBindingObjects(index, (RoleBinding)item);}
 else if (item instanceof PodPreset){addToPodPresetObjects(index, (PodPreset)item);}
 else if (item instanceof Project){addToProjectObjects(index, (Project)item);}
 else if (item instanceof BuildConfig){addToBuildConfigObjects(index, (BuildConfig)item);}
 else if (item instanceof ClusterRole){addToClusterRoleObjects(index, (ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){addToOAuthAuthorizeTokenObjects(index, (OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){addToProjectRequestObjects(index, (ProjectRequest)item);}
 else if (item instanceof PriorityClass){addToPriorityClassObjects(index, (PriorityClass)item);}
 else if (item instanceof Template){addToTemplateObjects(index, (Template)item);}
 else if (item instanceof OAuthClientAuthorization){addToOAuthClientAuthorizationObjects(index, (OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){addToDeploymentObjects(index, (Deployment)item);}
 else if (item instanceof PodTemplate){addToPodTemplateObjects(index, (PodTemplate)item);}
 else if (item instanceof Event){addToEventObjects(index, (Event)item);}
 else if (item instanceof Ingress){addToIngressObjects(index, (Ingress)item);}
 else if (item instanceof DeploymentConfig){addToDeploymentConfigObjects(index, (DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){addToOAuthAccessTokenObjects(index, (OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){addToPersistentVolumeObjects(index, (PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){addToPersistentVolumeClaimObjects(index, (PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){addToEventObjects(index, (io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){addToStatefulSetObjects(index, (StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){addToOpenshiftClusterRoleObjects(index, (OpenshiftClusterRole)item);}
 else if (item instanceof Role){addToRoleObjects(index, (Role)item);}
 else if (item instanceof User){addToUserObjects(index, (User)item);}
 else if (item instanceof ComponentStatus){addToComponentStatusObjects(index, (ComponentStatus)item);}
 else if (item instanceof TokenReview){addToTokenReviewObjects(index, (TokenReview)item);}
 else if (item instanceof Binding){addToBindingObjects(index, (Binding)item);}
 else if (item instanceof Secret){addToSecretObjects(index, (Secret)item);}
 else if (item instanceof SecurityContextConstraints){addToSecurityContextConstraintsObjects(index, (SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){addToNetNamespaceObjects(index, (NetNamespace)item);}
 else if (item instanceof Node){addToNodeObjects(index, (Node)item);}
 else if (item instanceof Job){addToJobObjects(index, (Job)item);}
 else if (item instanceof CertificateSigningRequest){addToCertificateSigningRequestObjects(index, (CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){addToServiceAccountObjects(index, (ServiceAccount)item);}

            return (A)this;
    }

    public A setToObjects(int index,HasMetadata item){
            if (item instanceof ValidatingWebhookConfiguration){setToValidatingWebhookConfigurationObjects(index, (ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){setToStorageClassObjects(index, (StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){setToClusterRoleBindingObjects(index, (ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){setToOpenshiftRoleBindingObjects(index, (OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){setToPodDisruptionBudgetObjects(index, (PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){setToNetworkPolicyObjects(index, (NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){setToOpenshiftClusterRoleBindingObjects(index, (OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){setToRouteObjects(index, (Route)item);}
 else if (item instanceof Namespace){setToNamespaceObjects(index, (Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){setToLocalSubjectAccessReviewObjects(index, (LocalSubjectAccessReview)item);}
 else if (item instanceof Service){setToServiceObjects(index, (Service)item);}
 else if (item instanceof ReplicationController){setToReplicationControllerObjects(index, (ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){setToSubjectAccessReviewObjects(index, (SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){setToMutatingWebhookConfigurationObjects(index, (MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){setToHorizontalPodAutoscalerObjects(index, (HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){setToScaleObjects(index, (Scale)item);}
 else if (item instanceof Image){setToImageObjects(index, (Image)item);}
 else if (item instanceof ReplicaSet){setToReplicaSetObjects(index, (ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){setToPodSecurityPolicyObjects(index, (PodSecurityPolicy)item);}
 else if (item instanceof CronJob){setToCronJobObjects(index, (CronJob)item);}
 else if (item instanceof Endpoints){setToEndpointsObjects(index, (Endpoints)item);}
 else if (item instanceof Pod){setToPodObjects(index, (Pod)item);}
 else if (item instanceof ConfigMap){setToConfigMapObjects(index, (ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){setToCustomResourceDefinitionObjects(index, (CustomResourceDefinition)item);}
 else if (item instanceof Build){setToBuildObjects(index, (Build)item);}
 else if (item instanceof ImageStreamTag){setToImageStreamTagObjects(index, (ImageStreamTag)item);}
 else if (item instanceof Group){setToGroupObjects(index, (Group)item);}
 else if (item instanceof ImageSignature){setToImageSignatureObjects(index, (ImageSignature)item);}
 else if (item instanceof ResourceQuota){setToResourceQuotaObjects(index, (ResourceQuota)item);}
 else if (item instanceof BuildRequest){setToBuildRequestObjects(index, (BuildRequest)item);}
 else if (item instanceof DaemonSet){setToDaemonSetObjects(index, (DaemonSet)item);}
 else if (item instanceof ImageStream){setToImageStreamObjects(index, (ImageStream)item);}
 else if (item instanceof OpenshiftRole){setToOpenshiftRoleObjects(index, (OpenshiftRole)item);}
 else if (item instanceof OAuthClient){setToOAuthClientObjects(index, (OAuthClient)item);}
 else if (item instanceof Identity){setToIdentityObjects(index, (Identity)item);}
 else if (item instanceof LimitRange){setToLimitRangeObjects(index, (LimitRange)item);}
 else if (item instanceof ImageStreamImport){setToImageStreamImportObjects(index, (ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){setToOpenshiftRoleBindingRestrictionObjects(index, (OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){setToRoleBindingObjects(index, (RoleBinding)item);}
 else if (item instanceof PodPreset){setToPodPresetObjects(index, (PodPreset)item);}
 else if (item instanceof Project){setToProjectObjects(index, (Project)item);}
 else if (item instanceof BuildConfig){setToBuildConfigObjects(index, (BuildConfig)item);}
 else if (item instanceof ClusterRole){setToClusterRoleObjects(index, (ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){setToOAuthAuthorizeTokenObjects(index, (OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){setToProjectRequestObjects(index, (ProjectRequest)item);}
 else if (item instanceof PriorityClass){setToPriorityClassObjects(index, (PriorityClass)item);}
 else if (item instanceof Template){setToTemplateObjects(index, (Template)item);}
 else if (item instanceof OAuthClientAuthorization){setToOAuthClientAuthorizationObjects(index, (OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){setToDeploymentObjects(index, (Deployment)item);}
 else if (item instanceof PodTemplate){setToPodTemplateObjects(index, (PodTemplate)item);}
 else if (item instanceof Event){setToEventObjects(index, (Event)item);}
 else if (item instanceof Ingress){setToIngressObjects(index, (Ingress)item);}
 else if (item instanceof DeploymentConfig){setToDeploymentConfigObjects(index, (DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){setToOAuthAccessTokenObjects(index, (OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){setToPersistentVolumeObjects(index, (PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){setToPersistentVolumeClaimObjects(index, (PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){setToEventObjects(index, (io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){setToStatefulSetObjects(index, (StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){setToOpenshiftClusterRoleObjects(index, (OpenshiftClusterRole)item);}
 else if (item instanceof Role){setToRoleObjects(index, (Role)item);}
 else if (item instanceof User){setToUserObjects(index, (User)item);}
 else if (item instanceof ComponentStatus){setToComponentStatusObjects(index, (ComponentStatus)item);}
 else if (item instanceof TokenReview){setToTokenReviewObjects(index, (TokenReview)item);}
 else if (item instanceof Binding){setToBindingObjects(index, (Binding)item);}
 else if (item instanceof Secret){setToSecretObjects(index, (Secret)item);}
 else if (item instanceof SecurityContextConstraints){setToSecurityContextConstraintsObjects(index, (SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){setToNetNamespaceObjects(index, (NetNamespace)item);}
 else if (item instanceof Node){setToNodeObjects(index, (Node)item);}
 else if (item instanceof Job){setToJobObjects(index, (Job)item);}
 else if (item instanceof CertificateSigningRequest){setToCertificateSigningRequestObjects(index, (CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){setToServiceAccountObjects(index, (ServiceAccount)item);}

            return (A)this;
    }

    public A addToObjects(HasMetadata... items){
             if (items != null && items.length > 0 && this.objects== null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HasMetadata item : items) { 
            if (item instanceof ValidatingWebhookConfiguration){addToValidatingWebhookConfigurationObjects((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){addToStorageClassObjects((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){addToClusterRoleBindingObjects((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){addToOpenshiftRoleBindingObjects((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){addToPodDisruptionBudgetObjects((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){addToNetworkPolicyObjects((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){addToOpenshiftClusterRoleBindingObjects((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){addToRouteObjects((Route)item);}
 else if (item instanceof Namespace){addToNamespaceObjects((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){addToLocalSubjectAccessReviewObjects((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){addToServiceObjects((Service)item);}
 else if (item instanceof ReplicationController){addToReplicationControllerObjects((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){addToSubjectAccessReviewObjects((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){addToMutatingWebhookConfigurationObjects((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){addToHorizontalPodAutoscalerObjects((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){addToScaleObjects((Scale)item);}
 else if (item instanceof Image){addToImageObjects((Image)item);}
 else if (item instanceof ReplicaSet){addToReplicaSetObjects((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){addToPodSecurityPolicyObjects((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){addToCronJobObjects((CronJob)item);}
 else if (item instanceof Endpoints){addToEndpointsObjects((Endpoints)item);}
 else if (item instanceof Pod){addToPodObjects((Pod)item);}
 else if (item instanceof ConfigMap){addToConfigMapObjects((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){addToCustomResourceDefinitionObjects((CustomResourceDefinition)item);}
 else if (item instanceof Build){addToBuildObjects((Build)item);}
 else if (item instanceof ImageStreamTag){addToImageStreamTagObjects((ImageStreamTag)item);}
 else if (item instanceof Group){addToGroupObjects((Group)item);}
 else if (item instanceof ImageSignature){addToImageSignatureObjects((ImageSignature)item);}
 else if (item instanceof ResourceQuota){addToResourceQuotaObjects((ResourceQuota)item);}
 else if (item instanceof BuildRequest){addToBuildRequestObjects((BuildRequest)item);}
 else if (item instanceof DaemonSet){addToDaemonSetObjects((DaemonSet)item);}
 else if (item instanceof ImageStream){addToImageStreamObjects((ImageStream)item);}
 else if (item instanceof OpenshiftRole){addToOpenshiftRoleObjects((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){addToOAuthClientObjects((OAuthClient)item);}
 else if (item instanceof Identity){addToIdentityObjects((Identity)item);}
 else if (item instanceof LimitRange){addToLimitRangeObjects((LimitRange)item);}
 else if (item instanceof ImageStreamImport){addToImageStreamImportObjects((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){addToOpenshiftRoleBindingRestrictionObjects((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){addToRoleBindingObjects((RoleBinding)item);}
 else if (item instanceof PodPreset){addToPodPresetObjects((PodPreset)item);}
 else if (item instanceof Project){addToProjectObjects((Project)item);}
 else if (item instanceof BuildConfig){addToBuildConfigObjects((BuildConfig)item);}
 else if (item instanceof ClusterRole){addToClusterRoleObjects((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){addToOAuthAuthorizeTokenObjects((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){addToProjectRequestObjects((ProjectRequest)item);}
 else if (item instanceof PriorityClass){addToPriorityClassObjects((PriorityClass)item);}
 else if (item instanceof Template){addToTemplateObjects((Template)item);}
 else if (item instanceof OAuthClientAuthorization){addToOAuthClientAuthorizationObjects((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){addToDeploymentObjects((Deployment)item);}
 else if (item instanceof PodTemplate){addToPodTemplateObjects((PodTemplate)item);}
 else if (item instanceof Event){addToEventObjects((Event)item);}
 else if (item instanceof Ingress){addToIngressObjects((Ingress)item);}
 else if (item instanceof DeploymentConfig){addToDeploymentConfigObjects((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){addToOAuthAccessTokenObjects((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){addToPersistentVolumeObjects((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){addToPersistentVolumeClaimObjects((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){addToEventObjects((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){addToStatefulSetObjects((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){addToOpenshiftClusterRoleObjects((OpenshiftClusterRole)item);}
 else if (item instanceof Role){addToRoleObjects((Role)item);}
 else if (item instanceof User){addToUserObjects((User)item);}
 else if (item instanceof ComponentStatus){addToComponentStatusObjects((ComponentStatus)item);}
 else if (item instanceof TokenReview){addToTokenReviewObjects((TokenReview)item);}
 else if (item instanceof Binding){addToBindingObjects((Binding)item);}
 else if (item instanceof Secret){addToSecretObjects((Secret)item);}
 else if (item instanceof SecurityContextConstraints){addToSecurityContextConstraintsObjects((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){addToNetNamespaceObjects((NetNamespace)item);}
 else if (item instanceof Node){addToNodeObjects((Node)item);}
 else if (item instanceof Job){addToJobObjects((Job)item);}
 else if (item instanceof CertificateSigningRequest){addToCertificateSigningRequestObjects((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){addToServiceAccountObjects((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.add(builder);this.objects.add(builder); }
            } return (A)this;
    }

    public A addAllToObjects(Collection<HasMetadata> items){
             if (items != null && items.size() > 0 && this.objects== null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HasMetadata item : items) { 
            if (item instanceof ValidatingWebhookConfiguration){addToValidatingWebhookConfigurationObjects((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){addToStorageClassObjects((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){addToClusterRoleBindingObjects((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){addToOpenshiftRoleBindingObjects((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){addToPodDisruptionBudgetObjects((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){addToNetworkPolicyObjects((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){addToOpenshiftClusterRoleBindingObjects((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){addToRouteObjects((Route)item);}
 else if (item instanceof Namespace){addToNamespaceObjects((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){addToLocalSubjectAccessReviewObjects((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){addToServiceObjects((Service)item);}
 else if (item instanceof ReplicationController){addToReplicationControllerObjects((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){addToSubjectAccessReviewObjects((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){addToMutatingWebhookConfigurationObjects((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){addToHorizontalPodAutoscalerObjects((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){addToScaleObjects((Scale)item);}
 else if (item instanceof Image){addToImageObjects((Image)item);}
 else if (item instanceof ReplicaSet){addToReplicaSetObjects((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){addToPodSecurityPolicyObjects((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){addToCronJobObjects((CronJob)item);}
 else if (item instanceof Endpoints){addToEndpointsObjects((Endpoints)item);}
 else if (item instanceof Pod){addToPodObjects((Pod)item);}
 else if (item instanceof ConfigMap){addToConfigMapObjects((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){addToCustomResourceDefinitionObjects((CustomResourceDefinition)item);}
 else if (item instanceof Build){addToBuildObjects((Build)item);}
 else if (item instanceof ImageStreamTag){addToImageStreamTagObjects((ImageStreamTag)item);}
 else if (item instanceof Group){addToGroupObjects((Group)item);}
 else if (item instanceof ImageSignature){addToImageSignatureObjects((ImageSignature)item);}
 else if (item instanceof ResourceQuota){addToResourceQuotaObjects((ResourceQuota)item);}
 else if (item instanceof BuildRequest){addToBuildRequestObjects((BuildRequest)item);}
 else if (item instanceof DaemonSet){addToDaemonSetObjects((DaemonSet)item);}
 else if (item instanceof ImageStream){addToImageStreamObjects((ImageStream)item);}
 else if (item instanceof OpenshiftRole){addToOpenshiftRoleObjects((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){addToOAuthClientObjects((OAuthClient)item);}
 else if (item instanceof Identity){addToIdentityObjects((Identity)item);}
 else if (item instanceof LimitRange){addToLimitRangeObjects((LimitRange)item);}
 else if (item instanceof ImageStreamImport){addToImageStreamImportObjects((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){addToOpenshiftRoleBindingRestrictionObjects((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){addToRoleBindingObjects((RoleBinding)item);}
 else if (item instanceof PodPreset){addToPodPresetObjects((PodPreset)item);}
 else if (item instanceof Project){addToProjectObjects((Project)item);}
 else if (item instanceof BuildConfig){addToBuildConfigObjects((BuildConfig)item);}
 else if (item instanceof ClusterRole){addToClusterRoleObjects((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){addToOAuthAuthorizeTokenObjects((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){addToProjectRequestObjects((ProjectRequest)item);}
 else if (item instanceof PriorityClass){addToPriorityClassObjects((PriorityClass)item);}
 else if (item instanceof Template){addToTemplateObjects((Template)item);}
 else if (item instanceof OAuthClientAuthorization){addToOAuthClientAuthorizationObjects((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){addToDeploymentObjects((Deployment)item);}
 else if (item instanceof PodTemplate){addToPodTemplateObjects((PodTemplate)item);}
 else if (item instanceof Event){addToEventObjects((Event)item);}
 else if (item instanceof Ingress){addToIngressObjects((Ingress)item);}
 else if (item instanceof DeploymentConfig){addToDeploymentConfigObjects((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){addToOAuthAccessTokenObjects((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){addToPersistentVolumeObjects((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){addToPersistentVolumeClaimObjects((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){addToEventObjects((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){addToStatefulSetObjects((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){addToOpenshiftClusterRoleObjects((OpenshiftClusterRole)item);}
 else if (item instanceof Role){addToRoleObjects((Role)item);}
 else if (item instanceof User){addToUserObjects((User)item);}
 else if (item instanceof ComponentStatus){addToComponentStatusObjects((ComponentStatus)item);}
 else if (item instanceof TokenReview){addToTokenReviewObjects((TokenReview)item);}
 else if (item instanceof Binding){addToBindingObjects((Binding)item);}
 else if (item instanceof Secret){addToSecretObjects((Secret)item);}
 else if (item instanceof SecurityContextConstraints){addToSecurityContextConstraintsObjects((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){addToNetNamespaceObjects((NetNamespace)item);}
 else if (item instanceof Node){addToNodeObjects((Node)item);}
 else if (item instanceof Job){addToJobObjects((Job)item);}
 else if (item instanceof CertificateSigningRequest){addToCertificateSigningRequestObjects((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){addToServiceAccountObjects((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.add(builder);this.objects.add(builder); }
            } return (A)this;
    }

    public A removeFromObjects(VisitableBuilder<? extends HasMetadata,?> builder){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            _visitables.remove(builder);this.objects.remove(builder); return (A)this;
    }

    public A removeFromObjects(HasMetadata... items){
            for (HasMetadata item : items) {if (item instanceof ValidatingWebhookConfiguration){removeFromValidatingWebhookConfigurationObjects((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){removeFromStorageClassObjects((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){removeFromClusterRoleBindingObjects((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){removeFromOpenshiftRoleBindingObjects((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){removeFromPodDisruptionBudgetObjects((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){removeFromNetworkPolicyObjects((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){removeFromOpenshiftClusterRoleBindingObjects((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){removeFromRouteObjects((Route)item);}
 else if (item instanceof Namespace){removeFromNamespaceObjects((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){removeFromLocalSubjectAccessReviewObjects((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){removeFromServiceObjects((Service)item);}
 else if (item instanceof ReplicationController){removeFromReplicationControllerObjects((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){removeFromSubjectAccessReviewObjects((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){removeFromMutatingWebhookConfigurationObjects((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){removeFromHorizontalPodAutoscalerObjects((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){removeFromScaleObjects((Scale)item);}
 else if (item instanceof Image){removeFromImageObjects((Image)item);}
 else if (item instanceof ReplicaSet){removeFromReplicaSetObjects((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){removeFromPodSecurityPolicyObjects((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){removeFromCronJobObjects((CronJob)item);}
 else if (item instanceof Endpoints){removeFromEndpointsObjects((Endpoints)item);}
 else if (item instanceof Pod){removeFromPodObjects((Pod)item);}
 else if (item instanceof ConfigMap){removeFromConfigMapObjects((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){removeFromCustomResourceDefinitionObjects((CustomResourceDefinition)item);}
 else if (item instanceof Build){removeFromBuildObjects((Build)item);}
 else if (item instanceof ImageStreamTag){removeFromImageStreamTagObjects((ImageStreamTag)item);}
 else if (item instanceof Group){removeFromGroupObjects((Group)item);}
 else if (item instanceof ImageSignature){removeFromImageSignatureObjects((ImageSignature)item);}
 else if (item instanceof ResourceQuota){removeFromResourceQuotaObjects((ResourceQuota)item);}
 else if (item instanceof BuildRequest){removeFromBuildRequestObjects((BuildRequest)item);}
 else if (item instanceof DaemonSet){removeFromDaemonSetObjects((DaemonSet)item);}
 else if (item instanceof ImageStream){removeFromImageStreamObjects((ImageStream)item);}
 else if (item instanceof OpenshiftRole){removeFromOpenshiftRoleObjects((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){removeFromOAuthClientObjects((OAuthClient)item);}
 else if (item instanceof Identity){removeFromIdentityObjects((Identity)item);}
 else if (item instanceof LimitRange){removeFromLimitRangeObjects((LimitRange)item);}
 else if (item instanceof ImageStreamImport){removeFromImageStreamImportObjects((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){removeFromOpenshiftRoleBindingRestrictionObjects((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){removeFromRoleBindingObjects((RoleBinding)item);}
 else if (item instanceof PodPreset){removeFromPodPresetObjects((PodPreset)item);}
 else if (item instanceof Project){removeFromProjectObjects((Project)item);}
 else if (item instanceof BuildConfig){removeFromBuildConfigObjects((BuildConfig)item);}
 else if (item instanceof ClusterRole){removeFromClusterRoleObjects((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){removeFromOAuthAuthorizeTokenObjects((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){removeFromProjectRequestObjects((ProjectRequest)item);}
 else if (item instanceof PriorityClass){removeFromPriorityClassObjects((PriorityClass)item);}
 else if (item instanceof Template){removeFromTemplateObjects((Template)item);}
 else if (item instanceof OAuthClientAuthorization){removeFromOAuthClientAuthorizationObjects((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){removeFromDeploymentObjects((Deployment)item);}
 else if (item instanceof PodTemplate){removeFromPodTemplateObjects((PodTemplate)item);}
 else if (item instanceof Event){removeFromEventObjects((Event)item);}
 else if (item instanceof Ingress){removeFromIngressObjects((Ingress)item);}
 else if (item instanceof DeploymentConfig){removeFromDeploymentConfigObjects((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){removeFromOAuthAccessTokenObjects((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){removeFromPersistentVolumeObjects((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){removeFromPersistentVolumeClaimObjects((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){removeFromEventObjects((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){removeFromStatefulSetObjects((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){removeFromOpenshiftClusterRoleObjects((OpenshiftClusterRole)item);}
 else if (item instanceof Role){removeFromRoleObjects((Role)item);}
 else if (item instanceof User){removeFromUserObjects((User)item);}
 else if (item instanceof ComponentStatus){removeFromComponentStatusObjects((ComponentStatus)item);}
 else if (item instanceof TokenReview){removeFromTokenReviewObjects((TokenReview)item);}
 else if (item instanceof Binding){removeFromBindingObjects((Binding)item);}
 else if (item instanceof Secret){removeFromSecretObjects((Secret)item);}
 else if (item instanceof SecurityContextConstraints){removeFromSecurityContextConstraintsObjects((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){removeFromNetNamespaceObjects((NetNamespace)item);}
 else if (item instanceof Node){removeFromNodeObjects((Node)item);}
 else if (item instanceof Job){removeFromJobObjects((Job)item);}
 else if (item instanceof CertificateSigningRequest){removeFromCertificateSigningRequestObjects((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){removeFromServiceAccountObjects((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.remove(builder);this.objects.remove(builder); }
            } return (A)this;
    }

    public A removeAllFromObjects(Collection<HasMetadata> items){
            for (HasMetadata item : items) {if (item instanceof ValidatingWebhookConfiguration){removeFromValidatingWebhookConfigurationObjects((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){removeFromStorageClassObjects((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){removeFromClusterRoleBindingObjects((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){removeFromOpenshiftRoleBindingObjects((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){removeFromPodDisruptionBudgetObjects((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){removeFromNetworkPolicyObjects((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){removeFromOpenshiftClusterRoleBindingObjects((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){removeFromRouteObjects((Route)item);}
 else if (item instanceof Namespace){removeFromNamespaceObjects((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){removeFromLocalSubjectAccessReviewObjects((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){removeFromServiceObjects((Service)item);}
 else if (item instanceof ReplicationController){removeFromReplicationControllerObjects((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){removeFromSubjectAccessReviewObjects((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){removeFromMutatingWebhookConfigurationObjects((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){removeFromHorizontalPodAutoscalerObjects((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){removeFromScaleObjects((Scale)item);}
 else if (item instanceof Image){removeFromImageObjects((Image)item);}
 else if (item instanceof ReplicaSet){removeFromReplicaSetObjects((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){removeFromPodSecurityPolicyObjects((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){removeFromCronJobObjects((CronJob)item);}
 else if (item instanceof Endpoints){removeFromEndpointsObjects((Endpoints)item);}
 else if (item instanceof Pod){removeFromPodObjects((Pod)item);}
 else if (item instanceof ConfigMap){removeFromConfigMapObjects((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){removeFromCustomResourceDefinitionObjects((CustomResourceDefinition)item);}
 else if (item instanceof Build){removeFromBuildObjects((Build)item);}
 else if (item instanceof ImageStreamTag){removeFromImageStreamTagObjects((ImageStreamTag)item);}
 else if (item instanceof Group){removeFromGroupObjects((Group)item);}
 else if (item instanceof ImageSignature){removeFromImageSignatureObjects((ImageSignature)item);}
 else if (item instanceof ResourceQuota){removeFromResourceQuotaObjects((ResourceQuota)item);}
 else if (item instanceof BuildRequest){removeFromBuildRequestObjects((BuildRequest)item);}
 else if (item instanceof DaemonSet){removeFromDaemonSetObjects((DaemonSet)item);}
 else if (item instanceof ImageStream){removeFromImageStreamObjects((ImageStream)item);}
 else if (item instanceof OpenshiftRole){removeFromOpenshiftRoleObjects((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){removeFromOAuthClientObjects((OAuthClient)item);}
 else if (item instanceof Identity){removeFromIdentityObjects((Identity)item);}
 else if (item instanceof LimitRange){removeFromLimitRangeObjects((LimitRange)item);}
 else if (item instanceof ImageStreamImport){removeFromImageStreamImportObjects((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){removeFromOpenshiftRoleBindingRestrictionObjects((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){removeFromRoleBindingObjects((RoleBinding)item);}
 else if (item instanceof PodPreset){removeFromPodPresetObjects((PodPreset)item);}
 else if (item instanceof Project){removeFromProjectObjects((Project)item);}
 else if (item instanceof BuildConfig){removeFromBuildConfigObjects((BuildConfig)item);}
 else if (item instanceof ClusterRole){removeFromClusterRoleObjects((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){removeFromOAuthAuthorizeTokenObjects((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){removeFromProjectRequestObjects((ProjectRequest)item);}
 else if (item instanceof PriorityClass){removeFromPriorityClassObjects((PriorityClass)item);}
 else if (item instanceof Template){removeFromTemplateObjects((Template)item);}
 else if (item instanceof OAuthClientAuthorization){removeFromOAuthClientAuthorizationObjects((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){removeFromDeploymentObjects((Deployment)item);}
 else if (item instanceof PodTemplate){removeFromPodTemplateObjects((PodTemplate)item);}
 else if (item instanceof Event){removeFromEventObjects((Event)item);}
 else if (item instanceof Ingress){removeFromIngressObjects((Ingress)item);}
 else if (item instanceof DeploymentConfig){removeFromDeploymentConfigObjects((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){removeFromOAuthAccessTokenObjects((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){removeFromPersistentVolumeObjects((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){removeFromPersistentVolumeClaimObjects((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){removeFromEventObjects((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){removeFromStatefulSetObjects((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){removeFromOpenshiftClusterRoleObjects((OpenshiftClusterRole)item);}
 else if (item instanceof Role){removeFromRoleObjects((Role)item);}
 else if (item instanceof User){removeFromUserObjects((User)item);}
 else if (item instanceof ComponentStatus){removeFromComponentStatusObjects((ComponentStatus)item);}
 else if (item instanceof TokenReview){removeFromTokenReviewObjects((TokenReview)item);}
 else if (item instanceof Binding){removeFromBindingObjects((Binding)item);}
 else if (item instanceof Secret){removeFromSecretObjects((Secret)item);}
 else if (item instanceof SecurityContextConstraints){removeFromSecurityContextConstraintsObjects((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){removeFromNetNamespaceObjects((NetNamespace)item);}
 else if (item instanceof Node){removeFromNodeObjects((Node)item);}
 else if (item instanceof Job){removeFromJobObjects((Job)item);}
 else if (item instanceof CertificateSigningRequest){removeFromCertificateSigningRequestObjects((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){removeFromServiceAccountObjects((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.remove(builder);this.objects.remove(builder); }
            } return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildObjects instead.
 * @return The buildable object.
 */
@Deprecated public List<HasMetadata> getObjects(){
            return build(objects);
    }

    public List<HasMetadata> buildObjects(){
            return build(objects);
    }

    public HasMetadata buildObject(int index){
            return this.objects.get(index).build();
    }

    public HasMetadata buildFirstObject(){
            return this.objects.get(0).build();
    }

    public HasMetadata buildLastObject(){
            return this.objects.get(objects.size() - 1).build();
    }

    public HasMetadata buildMatchingObject(io.fabric8.kubernetes.api.builder.Predicate<VisitableBuilder<? extends HasMetadata,?>> predicate){
            for (VisitableBuilder<? extends HasMetadata,?> item: objects) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withObjects(List<HasMetadata> objects){
            if (this.objects != null) { _visitables.removeAll(this.objects);}
            if (objects != null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>(); for (HasMetadata item : objects){this.addToObjects(item);}} else { this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();} return (A) this;
    }

    public A withObjects(HasMetadata... objects){
            if (this.objects != null) {this.objects.clear();}
            if (objects != null) {for (HasMetadata item :objects){ this.addToObjects(item);}} return (A) this;
    }

    public Boolean hasObjects(){
            return objects != null && !objects.isEmpty();
    }

    public A addToValidatingWebhookConfigurationObjects(int index,ValidatingWebhookConfiguration item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToValidatingWebhookConfigurationObjects(int index,ValidatingWebhookConfiguration item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToValidatingWebhookConfigurationObjects(ValidatingWebhookConfiguration... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToValidatingWebhookConfigurationObjects(Collection<ValidatingWebhookConfiguration> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromValidatingWebhookConfigurationObjects(ValidatingWebhookConfiguration... items){
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromValidatingWebhookConfigurationObjects(Collection<ValidatingWebhookConfiguration> items){
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ValidatingWebhookConfigurationObjectsNested<A> addNewValidatingWebhookConfigurationObject(){
            return new ValidatingWebhookConfigurationObjectsNestedImpl();
    }

    public TemplateFluent.ValidatingWebhookConfigurationObjectsNested<A> addNewValidatingWebhookConfigurationObjectLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ValidatingWebhookConfigurationObjectsNested<A> setNewValidatingWebhookConfigurationObjectLike(int index,ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationObjectsNestedImpl(index, item);
    }

    public A addToStorageClassObjects(int index,StorageClass item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToStorageClassObjects(int index,StorageClass item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StorageClassBuilder builder = new StorageClassBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToStorageClassObjects(StorageClass... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToStorageClassObjects(Collection<StorageClass> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromStorageClassObjects(StorageClass... items){
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromStorageClassObjects(Collection<StorageClass> items){
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.StorageClassObjectsNested<A> addNewStorageClassObject(){
            return new StorageClassObjectsNestedImpl();
    }

    public TemplateFluent.StorageClassObjectsNested<A> addNewStorageClassObjectLike(StorageClass item){
            return new StorageClassObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.StorageClassObjectsNested<A> setNewStorageClassObjectLike(int index,StorageClass item){
            return new StorageClassObjectsNestedImpl(index, item);
    }

    public A addToClusterRoleBindingObjects(int index,ClusterRoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToClusterRoleBindingObjects(int index,ClusterRoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToClusterRoleBindingObjects(ClusterRoleBinding... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToClusterRoleBindingObjects(Collection<ClusterRoleBinding> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromClusterRoleBindingObjects(ClusterRoleBinding... items){
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromClusterRoleBindingObjects(Collection<ClusterRoleBinding> items){
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ClusterRoleBindingObjectsNested<A> addNewClusterRoleBindingObject(){
            return new ClusterRoleBindingObjectsNestedImpl();
    }

    public TemplateFluent.ClusterRoleBindingObjectsNested<A> addNewClusterRoleBindingObjectLike(ClusterRoleBinding item){
            return new ClusterRoleBindingObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ClusterRoleBindingObjectsNested<A> setNewClusterRoleBindingObjectLike(int index,ClusterRoleBinding item){
            return new ClusterRoleBindingObjectsNestedImpl(index, item);
    }

    public A addToOpenshiftRoleBindingObjects(int index,OpenshiftRoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOpenshiftRoleBindingObjects(int index,OpenshiftRoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftRoleBindingObjects(OpenshiftRoleBinding... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftRoleBindingObjects(Collection<OpenshiftRoleBinding> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftRoleBindingObjects(OpenshiftRoleBinding... items){
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftRoleBindingObjects(Collection<OpenshiftRoleBinding> items){
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OpenshiftRoleBindingObjectsNested<A> addNewOpenshiftRoleBindingObject(){
            return new OpenshiftRoleBindingObjectsNestedImpl();
    }

    public TemplateFluent.OpenshiftRoleBindingObjectsNested<A> addNewOpenshiftRoleBindingObjectLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OpenshiftRoleBindingObjectsNested<A> setNewOpenshiftRoleBindingObjectLike(int index,OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingObjectsNestedImpl(index, item);
    }

    public A addToPodDisruptionBudgetObjects(int index,PodDisruptionBudget item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPodDisruptionBudgetObjects(int index,PodDisruptionBudget item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPodDisruptionBudgetObjects(PodDisruptionBudget... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPodDisruptionBudgetObjects(Collection<PodDisruptionBudget> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPodDisruptionBudgetObjects(PodDisruptionBudget... items){
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodDisruptionBudgetObjects(Collection<PodDisruptionBudget> items){
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PodDisruptionBudgetObjectsNested<A> addNewPodDisruptionBudgetObject(){
            return new PodDisruptionBudgetObjectsNestedImpl();
    }

    public TemplateFluent.PodDisruptionBudgetObjectsNested<A> addNewPodDisruptionBudgetObjectLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PodDisruptionBudgetObjectsNested<A> setNewPodDisruptionBudgetObjectLike(int index,PodDisruptionBudget item){
            return new PodDisruptionBudgetObjectsNestedImpl(index, item);
    }

    public A addToNetworkPolicyObjects(int index,NetworkPolicy item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToNetworkPolicyObjects(int index,NetworkPolicy item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToNetworkPolicyObjects(NetworkPolicy... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToNetworkPolicyObjects(Collection<NetworkPolicy> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromNetworkPolicyObjects(NetworkPolicy... items){
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromNetworkPolicyObjects(Collection<NetworkPolicy> items){
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.NetworkPolicyObjectsNested<A> addNewNetworkPolicyObject(){
            return new NetworkPolicyObjectsNestedImpl();
    }

    public TemplateFluent.NetworkPolicyObjectsNested<A> addNewNetworkPolicyObjectLike(NetworkPolicy item){
            return new NetworkPolicyObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.NetworkPolicyObjectsNested<A> setNewNetworkPolicyObjectLike(int index,NetworkPolicy item){
            return new NetworkPolicyObjectsNestedImpl(index, item);
    }

    public A addToOpenshiftClusterRoleBindingObjects(int index,OpenshiftClusterRoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOpenshiftClusterRoleBindingObjects(int index,OpenshiftClusterRoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftClusterRoleBindingObjects(OpenshiftClusterRoleBinding... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftClusterRoleBindingObjects(Collection<OpenshiftClusterRoleBinding> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftClusterRoleBindingObjects(OpenshiftClusterRoleBinding... items){
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftClusterRoleBindingObjects(Collection<OpenshiftClusterRoleBinding> items){
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<A> addNewOpenshiftClusterRoleBindingObject(){
            return new OpenshiftClusterRoleBindingObjectsNestedImpl();
    }

    public TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<A> addNewOpenshiftClusterRoleBindingObjectLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<A> setNewOpenshiftClusterRoleBindingObjectLike(int index,OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingObjectsNestedImpl(index, item);
    }

    public A addToRouteObjects(int index,Route item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RouteBuilder builder = new RouteBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToRouteObjects(int index,Route item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RouteBuilder builder = new RouteBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToRouteObjects(Route... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToRouteObjects(Collection<Route> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromRouteObjects(Route... items){
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromRouteObjects(Collection<Route> items){
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.RouteObjectsNested<A> addNewRouteObject(){
            return new RouteObjectsNestedImpl();
    }

    public TemplateFluent.RouteObjectsNested<A> addNewRouteObjectLike(Route item){
            return new RouteObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.RouteObjectsNested<A> setNewRouteObjectLike(int index,Route item){
            return new RouteObjectsNestedImpl(index, item);
    }

    public A addToNamespaceObjects(int index,Namespace item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToNamespaceObjects(int index,Namespace item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NamespaceBuilder builder = new NamespaceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToNamespaceObjects(Namespace... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToNamespaceObjects(Collection<Namespace> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromNamespaceObjects(Namespace... items){
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromNamespaceObjects(Collection<Namespace> items){
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.NamespaceObjectsNested<A> addNewNamespaceObject(){
            return new NamespaceObjectsNestedImpl();
    }

    public TemplateFluent.NamespaceObjectsNested<A> addNewNamespaceObjectLike(Namespace item){
            return new NamespaceObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.NamespaceObjectsNested<A> setNewNamespaceObjectLike(int index,Namespace item){
            return new NamespaceObjectsNestedImpl(index, item);
    }

    public A addToLocalSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToLocalSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToLocalSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToLocalSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromLocalSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview... items){
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromLocalSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview> items){
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.LocalSubjectAccessReviewObjectsNested<A> addNewLocalSubjectAccessReviewObject(){
            return new LocalSubjectAccessReviewObjectsNestedImpl();
    }

    public TemplateFluent.LocalSubjectAccessReviewObjectsNested<A> addNewLocalSubjectAccessReviewObjectLike(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.LocalSubjectAccessReviewObjectsNested<A> setNewLocalSubjectAccessReviewObjectLike(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewObjectsNestedImpl(index, item);
    }

    public A addToServiceObjects(int index,Service item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceBuilder builder = new ServiceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToServiceObjects(int index,Service item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceBuilder builder = new ServiceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToServiceObjects(Service... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToServiceObjects(Collection<Service> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromServiceObjects(Service... items){
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromServiceObjects(Collection<Service> items){
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ServiceObjectsNested<A> addNewServiceObject(){
            return new ServiceObjectsNestedImpl();
    }

    public TemplateFluent.ServiceObjectsNested<A> addNewServiceObjectLike(Service item){
            return new ServiceObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ServiceObjectsNested<A> setNewServiceObjectLike(int index,Service item){
            return new ServiceObjectsNestedImpl(index, item);
    }

    public A addToReplicationControllerObjects(int index,ReplicationController item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToReplicationControllerObjects(int index,ReplicationController item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToReplicationControllerObjects(ReplicationController... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToReplicationControllerObjects(Collection<ReplicationController> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromReplicationControllerObjects(ReplicationController... items){
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromReplicationControllerObjects(Collection<ReplicationController> items){
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ReplicationControllerObjectsNested<A> addNewReplicationControllerObject(){
            return new ReplicationControllerObjectsNestedImpl();
    }

    public TemplateFluent.ReplicationControllerObjectsNested<A> addNewReplicationControllerObjectLike(ReplicationController item){
            return new ReplicationControllerObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ReplicationControllerObjectsNested<A> setNewReplicationControllerObjectLike(int index,ReplicationController item){
            return new ReplicationControllerObjectsNestedImpl(index, item);
    }

    public A addToSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToSubjectAccessReviewObjects(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromSubjectAccessReviewObjects(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview... items){
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubjectAccessReviewObjects(Collection<io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview> items){
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.SubjectAccessReviewObjectsNested<A> addNewSubjectAccessReviewObject(){
            return new SubjectAccessReviewObjectsNestedImpl();
    }

    public TemplateFluent.SubjectAccessReviewObjectsNested<A> addNewSubjectAccessReviewObjectLike(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
            return new SubjectAccessReviewObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.SubjectAccessReviewObjectsNested<A> setNewSubjectAccessReviewObjectLike(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
            return new SubjectAccessReviewObjectsNestedImpl(index, item);
    }

    public A addToMutatingWebhookConfigurationObjects(int index,MutatingWebhookConfiguration item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToMutatingWebhookConfigurationObjects(int index,MutatingWebhookConfiguration item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToMutatingWebhookConfigurationObjects(MutatingWebhookConfiguration... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToMutatingWebhookConfigurationObjects(Collection<MutatingWebhookConfiguration> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromMutatingWebhookConfigurationObjects(MutatingWebhookConfiguration... items){
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromMutatingWebhookConfigurationObjects(Collection<MutatingWebhookConfiguration> items){
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.MutatingWebhookConfigurationObjectsNested<A> addNewMutatingWebhookConfigurationObject(){
            return new MutatingWebhookConfigurationObjectsNestedImpl();
    }

    public TemplateFluent.MutatingWebhookConfigurationObjectsNested<A> addNewMutatingWebhookConfigurationObjectLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.MutatingWebhookConfigurationObjectsNested<A> setNewMutatingWebhookConfigurationObjectLike(int index,MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationObjectsNestedImpl(index, item);
    }

    public A addToHorizontalPodAutoscalerObjects(int index,HorizontalPodAutoscaler item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToHorizontalPodAutoscalerObjects(int index,HorizontalPodAutoscaler item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToHorizontalPodAutoscalerObjects(HorizontalPodAutoscaler... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToHorizontalPodAutoscalerObjects(Collection<HorizontalPodAutoscaler> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromHorizontalPodAutoscalerObjects(HorizontalPodAutoscaler... items){
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromHorizontalPodAutoscalerObjects(Collection<HorizontalPodAutoscaler> items){
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.HorizontalPodAutoscalerObjectsNested<A> addNewHorizontalPodAutoscalerObject(){
            return new HorizontalPodAutoscalerObjectsNestedImpl();
    }

    public TemplateFluent.HorizontalPodAutoscalerObjectsNested<A> addNewHorizontalPodAutoscalerObjectLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.HorizontalPodAutoscalerObjectsNested<A> setNewHorizontalPodAutoscalerObjectLike(int index,HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerObjectsNestedImpl(index, item);
    }

    public A addToScaleObjects(int index,Scale item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ScaleBuilder builder = new ScaleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToScaleObjects(int index,Scale item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ScaleBuilder builder = new ScaleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToScaleObjects(Scale... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToScaleObjects(Collection<Scale> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromScaleObjects(Scale... items){
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromScaleObjects(Collection<Scale> items){
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ScaleObjectsNested<A> addNewScaleObject(){
            return new ScaleObjectsNestedImpl();
    }

    public TemplateFluent.ScaleObjectsNested<A> addNewScaleObjectLike(Scale item){
            return new ScaleObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ScaleObjectsNested<A> setNewScaleObjectLike(int index,Scale item){
            return new ScaleObjectsNestedImpl(index, item);
    }

    public A addToImageObjects(int index,Image item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageBuilder builder = new ImageBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToImageObjects(int index,Image item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageBuilder builder = new ImageBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToImageObjects(Image... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToImageObjects(Collection<Image> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromImageObjects(Image... items){
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageObjects(Collection<Image> items){
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ImageObjectsNested<A> addNewImageObject(){
            return new ImageObjectsNestedImpl();
    }

    public TemplateFluent.ImageObjectsNested<A> addNewImageObjectLike(Image item){
            return new ImageObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ImageObjectsNested<A> setNewImageObjectLike(int index,Image item){
            return new ImageObjectsNestedImpl(index, item);
    }

    public A addToReplicaSetObjects(int index,ReplicaSet item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToReplicaSetObjects(int index,ReplicaSet item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicaSetBuilder builder = new ReplicaSetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToReplicaSetObjects(ReplicaSet... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToReplicaSetObjects(Collection<ReplicaSet> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromReplicaSetObjects(ReplicaSet... items){
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromReplicaSetObjects(Collection<ReplicaSet> items){
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ReplicaSetObjectsNested<A> addNewReplicaSetObject(){
            return new ReplicaSetObjectsNestedImpl();
    }

    public TemplateFluent.ReplicaSetObjectsNested<A> addNewReplicaSetObjectLike(ReplicaSet item){
            return new ReplicaSetObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ReplicaSetObjectsNested<A> setNewReplicaSetObjectLike(int index,ReplicaSet item){
            return new ReplicaSetObjectsNestedImpl(index, item);
    }

    public A addToPodSecurityPolicyObjects(int index,PodSecurityPolicy item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPodSecurityPolicyObjects(int index,PodSecurityPolicy item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPodSecurityPolicyObjects(PodSecurityPolicy... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPodSecurityPolicyObjects(Collection<PodSecurityPolicy> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPodSecurityPolicyObjects(PodSecurityPolicy... items){
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodSecurityPolicyObjects(Collection<PodSecurityPolicy> items){
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PodSecurityPolicyObjectsNested<A> addNewPodSecurityPolicyObject(){
            return new PodSecurityPolicyObjectsNestedImpl();
    }

    public TemplateFluent.PodSecurityPolicyObjectsNested<A> addNewPodSecurityPolicyObjectLike(PodSecurityPolicy item){
            return new PodSecurityPolicyObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PodSecurityPolicyObjectsNested<A> setNewPodSecurityPolicyObjectLike(int index,PodSecurityPolicy item){
            return new PodSecurityPolicyObjectsNestedImpl(index, item);
    }

    public A addToCronJobObjects(int index,CronJob item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToCronJobObjects(int index,CronJob item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CronJobBuilder builder = new CronJobBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToCronJobObjects(CronJob... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToCronJobObjects(Collection<CronJob> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromCronJobObjects(CronJob... items){
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromCronJobObjects(Collection<CronJob> items){
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.CronJobObjectsNested<A> addNewCronJobObject(){
            return new CronJobObjectsNestedImpl();
    }

    public TemplateFluent.CronJobObjectsNested<A> addNewCronJobObjectLike(CronJob item){
            return new CronJobObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.CronJobObjectsNested<A> setNewCronJobObjectLike(int index,CronJob item){
            return new CronJobObjectsNestedImpl(index, item);
    }

    public A addToEndpointsObjects(int index,Endpoints item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToEndpointsObjects(int index,Endpoints item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EndpointsBuilder builder = new EndpointsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToEndpointsObjects(Endpoints... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToEndpointsObjects(Collection<Endpoints> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromEndpointsObjects(Endpoints... items){
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromEndpointsObjects(Collection<Endpoints> items){
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.EndpointsObjectsNested<A> addNewEndpointsObject(){
            return new EndpointsObjectsNestedImpl();
    }

    public TemplateFluent.EndpointsObjectsNested<A> addNewEndpointsObjectLike(Endpoints item){
            return new EndpointsObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.EndpointsObjectsNested<A> setNewEndpointsObjectLike(int index,Endpoints item){
            return new EndpointsObjectsNestedImpl(index, item);
    }

    public A addToPodObjects(int index,Pod item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodBuilder builder = new PodBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPodObjects(int index,Pod item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodBuilder builder = new PodBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPodObjects(Pod... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPodObjects(Collection<Pod> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPodObjects(Pod... items){
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodObjects(Collection<Pod> items){
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PodObjectsNested<A> addNewPodObject(){
            return new PodObjectsNestedImpl();
    }

    public TemplateFluent.PodObjectsNested<A> addNewPodObjectLike(Pod item){
            return new PodObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PodObjectsNested<A> setNewPodObjectLike(int index,Pod item){
            return new PodObjectsNestedImpl(index, item);
    }

    public A addToConfigMapObjects(int index,ConfigMap item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToConfigMapObjects(int index,ConfigMap item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ConfigMapBuilder builder = new ConfigMapBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToConfigMapObjects(ConfigMap... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToConfigMapObjects(Collection<ConfigMap> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromConfigMapObjects(ConfigMap... items){
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromConfigMapObjects(Collection<ConfigMap> items){
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ConfigMapObjectsNested<A> addNewConfigMapObject(){
            return new ConfigMapObjectsNestedImpl();
    }

    public TemplateFluent.ConfigMapObjectsNested<A> addNewConfigMapObjectLike(ConfigMap item){
            return new ConfigMapObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ConfigMapObjectsNested<A> setNewConfigMapObjectLike(int index,ConfigMap item){
            return new ConfigMapObjectsNestedImpl(index, item);
    }

    public A addToCustomResourceDefinitionObjects(int index,CustomResourceDefinition item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToCustomResourceDefinitionObjects(int index,CustomResourceDefinition item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToCustomResourceDefinitionObjects(CustomResourceDefinition... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToCustomResourceDefinitionObjects(Collection<CustomResourceDefinition> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromCustomResourceDefinitionObjects(CustomResourceDefinition... items){
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromCustomResourceDefinitionObjects(Collection<CustomResourceDefinition> items){
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.CustomResourceDefinitionObjectsNested<A> addNewCustomResourceDefinitionObject(){
            return new CustomResourceDefinitionObjectsNestedImpl();
    }

    public TemplateFluent.CustomResourceDefinitionObjectsNested<A> addNewCustomResourceDefinitionObjectLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.CustomResourceDefinitionObjectsNested<A> setNewCustomResourceDefinitionObjectLike(int index,CustomResourceDefinition item){
            return new CustomResourceDefinitionObjectsNestedImpl(index, item);
    }

    public A addToBuildObjects(int index,Build item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildBuilder builder = new BuildBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToBuildObjects(int index,Build item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildBuilder builder = new BuildBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToBuildObjects(Build... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToBuildObjects(Collection<Build> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromBuildObjects(Build... items){
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildObjects(Collection<Build> items){
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.BuildObjectsNested<A> addNewBuildObject(){
            return new BuildObjectsNestedImpl();
    }

    public TemplateFluent.BuildObjectsNested<A> addNewBuildObjectLike(Build item){
            return new BuildObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.BuildObjectsNested<A> setNewBuildObjectLike(int index,Build item){
            return new BuildObjectsNestedImpl(index, item);
    }

    public A addToImageStreamTagObjects(int index,ImageStreamTag item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToImageStreamTagObjects(int index,ImageStreamTag item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToImageStreamTagObjects(ImageStreamTag... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToImageStreamTagObjects(Collection<ImageStreamTag> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromImageStreamTagObjects(ImageStreamTag... items){
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageStreamTagObjects(Collection<ImageStreamTag> items){
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ImageStreamTagObjectsNested<A> addNewImageStreamTagObject(){
            return new ImageStreamTagObjectsNestedImpl();
    }

    public TemplateFluent.ImageStreamTagObjectsNested<A> addNewImageStreamTagObjectLike(ImageStreamTag item){
            return new ImageStreamTagObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ImageStreamTagObjectsNested<A> setNewImageStreamTagObjectLike(int index,ImageStreamTag item){
            return new ImageStreamTagObjectsNestedImpl(index, item);
    }

    public A addToGroupObjects(int index,Group item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            GroupBuilder builder = new GroupBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToGroupObjects(int index,Group item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            GroupBuilder builder = new GroupBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToGroupObjects(Group... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToGroupObjects(Collection<Group> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromGroupObjects(Group... items){
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromGroupObjects(Collection<Group> items){
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.GroupObjectsNested<A> addNewGroupObject(){
            return new GroupObjectsNestedImpl();
    }

    public TemplateFluent.GroupObjectsNested<A> addNewGroupObjectLike(Group item){
            return new GroupObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.GroupObjectsNested<A> setNewGroupObjectLike(int index,Group item){
            return new GroupObjectsNestedImpl(index, item);
    }

    public A addToImageSignatureObjects(int index,ImageSignature item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToImageSignatureObjects(int index,ImageSignature item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageSignatureBuilder builder = new ImageSignatureBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToImageSignatureObjects(ImageSignature... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToImageSignatureObjects(Collection<ImageSignature> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromImageSignatureObjects(ImageSignature... items){
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageSignatureObjects(Collection<ImageSignature> items){
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ImageSignatureObjectsNested<A> addNewImageSignatureObject(){
            return new ImageSignatureObjectsNestedImpl();
    }

    public TemplateFluent.ImageSignatureObjectsNested<A> addNewImageSignatureObjectLike(ImageSignature item){
            return new ImageSignatureObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ImageSignatureObjectsNested<A> setNewImageSignatureObjectLike(int index,ImageSignature item){
            return new ImageSignatureObjectsNestedImpl(index, item);
    }

    public A addToResourceQuotaObjects(int index,ResourceQuota item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToResourceQuotaObjects(int index,ResourceQuota item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToResourceQuotaObjects(ResourceQuota... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToResourceQuotaObjects(Collection<ResourceQuota> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromResourceQuotaObjects(ResourceQuota... items){
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromResourceQuotaObjects(Collection<ResourceQuota> items){
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ResourceQuotaObjectsNested<A> addNewResourceQuotaObject(){
            return new ResourceQuotaObjectsNestedImpl();
    }

    public TemplateFluent.ResourceQuotaObjectsNested<A> addNewResourceQuotaObjectLike(ResourceQuota item){
            return new ResourceQuotaObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ResourceQuotaObjectsNested<A> setNewResourceQuotaObjectLike(int index,ResourceQuota item){
            return new ResourceQuotaObjectsNestedImpl(index, item);
    }

    public A addToBuildRequestObjects(int index,BuildRequest item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToBuildRequestObjects(int index,BuildRequest item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildRequestBuilder builder = new BuildRequestBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToBuildRequestObjects(BuildRequest... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToBuildRequestObjects(Collection<BuildRequest> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromBuildRequestObjects(BuildRequest... items){
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildRequestObjects(Collection<BuildRequest> items){
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.BuildRequestObjectsNested<A> addNewBuildRequestObject(){
            return new BuildRequestObjectsNestedImpl();
    }

    public TemplateFluent.BuildRequestObjectsNested<A> addNewBuildRequestObjectLike(BuildRequest item){
            return new BuildRequestObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.BuildRequestObjectsNested<A> setNewBuildRequestObjectLike(int index,BuildRequest item){
            return new BuildRequestObjectsNestedImpl(index, item);
    }

    public A addToDaemonSetObjects(int index,DaemonSet item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToDaemonSetObjects(int index,DaemonSet item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DaemonSetBuilder builder = new DaemonSetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToDaemonSetObjects(DaemonSet... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToDaemonSetObjects(Collection<DaemonSet> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromDaemonSetObjects(DaemonSet... items){
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromDaemonSetObjects(Collection<DaemonSet> items){
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.DaemonSetObjectsNested<A> addNewDaemonSetObject(){
            return new DaemonSetObjectsNestedImpl();
    }

    public TemplateFluent.DaemonSetObjectsNested<A> addNewDaemonSetObjectLike(DaemonSet item){
            return new DaemonSetObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.DaemonSetObjectsNested<A> setNewDaemonSetObjectLike(int index,DaemonSet item){
            return new DaemonSetObjectsNestedImpl(index, item);
    }

    public A addToImageStreamObjects(int index,ImageStream item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToImageStreamObjects(int index,ImageStream item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamBuilder builder = new ImageStreamBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToImageStreamObjects(ImageStream... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToImageStreamObjects(Collection<ImageStream> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromImageStreamObjects(ImageStream... items){
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageStreamObjects(Collection<ImageStream> items){
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ImageStreamObjectsNested<A> addNewImageStreamObject(){
            return new ImageStreamObjectsNestedImpl();
    }

    public TemplateFluent.ImageStreamObjectsNested<A> addNewImageStreamObjectLike(ImageStream item){
            return new ImageStreamObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ImageStreamObjectsNested<A> setNewImageStreamObjectLike(int index,ImageStream item){
            return new ImageStreamObjectsNestedImpl(index, item);
    }

    public A addToOpenshiftRoleObjects(int index,OpenshiftRole item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOpenshiftRoleObjects(int index,OpenshiftRole item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftRoleObjects(OpenshiftRole... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftRoleObjects(Collection<OpenshiftRole> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftRoleObjects(OpenshiftRole... items){
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftRoleObjects(Collection<OpenshiftRole> items){
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OpenshiftRoleObjectsNested<A> addNewOpenshiftRoleObject(){
            return new OpenshiftRoleObjectsNestedImpl();
    }

    public TemplateFluent.OpenshiftRoleObjectsNested<A> addNewOpenshiftRoleObjectLike(OpenshiftRole item){
            return new OpenshiftRoleObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OpenshiftRoleObjectsNested<A> setNewOpenshiftRoleObjectLike(int index,OpenshiftRole item){
            return new OpenshiftRoleObjectsNestedImpl(index, item);
    }

    public A addToOAuthClientObjects(int index,OAuthClient item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOAuthClientObjects(int index,OAuthClient item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientBuilder builder = new OAuthClientBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthClientObjects(OAuthClient... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOAuthClientObjects(Collection<OAuthClient> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOAuthClientObjects(OAuthClient... items){
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthClientObjects(Collection<OAuthClient> items){
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OAuthClientObjectsNested<A> addNewOAuthClientObject(){
            return new OAuthClientObjectsNestedImpl();
    }

    public TemplateFluent.OAuthClientObjectsNested<A> addNewOAuthClientObjectLike(OAuthClient item){
            return new OAuthClientObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OAuthClientObjectsNested<A> setNewOAuthClientObjectLike(int index,OAuthClient item){
            return new OAuthClientObjectsNestedImpl(index, item);
    }

    public A addToIdentityObjects(int index,Identity item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IdentityBuilder builder = new IdentityBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToIdentityObjects(int index,Identity item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IdentityBuilder builder = new IdentityBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToIdentityObjects(Identity... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToIdentityObjects(Collection<Identity> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromIdentityObjects(Identity... items){
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromIdentityObjects(Collection<Identity> items){
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.IdentityObjectsNested<A> addNewIdentityObject(){
            return new IdentityObjectsNestedImpl();
    }

    public TemplateFluent.IdentityObjectsNested<A> addNewIdentityObjectLike(Identity item){
            return new IdentityObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.IdentityObjectsNested<A> setNewIdentityObjectLike(int index,Identity item){
            return new IdentityObjectsNestedImpl(index, item);
    }

    public A addToLimitRangeObjects(int index,LimitRange item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToLimitRangeObjects(int index,LimitRange item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LimitRangeBuilder builder = new LimitRangeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToLimitRangeObjects(LimitRange... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToLimitRangeObjects(Collection<LimitRange> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromLimitRangeObjects(LimitRange... items){
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromLimitRangeObjects(Collection<LimitRange> items){
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.LimitRangeObjectsNested<A> addNewLimitRangeObject(){
            return new LimitRangeObjectsNestedImpl();
    }

    public TemplateFluent.LimitRangeObjectsNested<A> addNewLimitRangeObjectLike(LimitRange item){
            return new LimitRangeObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.LimitRangeObjectsNested<A> setNewLimitRangeObjectLike(int index,LimitRange item){
            return new LimitRangeObjectsNestedImpl(index, item);
    }

    public A addToImageStreamImportObjects(int index,ImageStreamImport item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToImageStreamImportObjects(int index,ImageStreamImport item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToImageStreamImportObjects(ImageStreamImport... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToImageStreamImportObjects(Collection<ImageStreamImport> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromImageStreamImportObjects(ImageStreamImport... items){
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageStreamImportObjects(Collection<ImageStreamImport> items){
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ImageStreamImportObjectsNested<A> addNewImageStreamImportObject(){
            return new ImageStreamImportObjectsNestedImpl();
    }

    public TemplateFluent.ImageStreamImportObjectsNested<A> addNewImageStreamImportObjectLike(ImageStreamImport item){
            return new ImageStreamImportObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ImageStreamImportObjectsNested<A> setNewImageStreamImportObjectLike(int index,ImageStreamImport item){
            return new ImageStreamImportObjectsNestedImpl(index, item);
    }

    public A addToOpenshiftRoleBindingRestrictionObjects(int index,OpenshiftRoleBindingRestriction item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOpenshiftRoleBindingRestrictionObjects(int index,OpenshiftRoleBindingRestriction item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftRoleBindingRestrictionObjects(OpenshiftRoleBindingRestriction... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftRoleBindingRestrictionObjects(Collection<OpenshiftRoleBindingRestriction> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftRoleBindingRestrictionObjects(OpenshiftRoleBindingRestriction... items){
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftRoleBindingRestrictionObjects(Collection<OpenshiftRoleBindingRestriction> items){
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<A> addNewOpenshiftRoleBindingRestrictionObject(){
            return new OpenshiftRoleBindingRestrictionObjectsNestedImpl();
    }

    public TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<A> addNewOpenshiftRoleBindingRestrictionObjectLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<A> setNewOpenshiftRoleBindingRestrictionObjectLike(int index,OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionObjectsNestedImpl(index, item);
    }

    public A addToRoleBindingObjects(int index,RoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToRoleBindingObjects(int index,RoleBinding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBindingBuilder builder = new RoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToRoleBindingObjects(RoleBinding... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToRoleBindingObjects(Collection<RoleBinding> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromRoleBindingObjects(RoleBinding... items){
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromRoleBindingObjects(Collection<RoleBinding> items){
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.RoleBindingObjectsNested<A> addNewRoleBindingObject(){
            return new RoleBindingObjectsNestedImpl();
    }

    public TemplateFluent.RoleBindingObjectsNested<A> addNewRoleBindingObjectLike(RoleBinding item){
            return new RoleBindingObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.RoleBindingObjectsNested<A> setNewRoleBindingObjectLike(int index,RoleBinding item){
            return new RoleBindingObjectsNestedImpl(index, item);
    }

    public A addToPodPresetObjects(int index,PodPreset item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPodPresetObjects(int index,PodPreset item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodPresetBuilder builder = new PodPresetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPodPresetObjects(PodPreset... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPodPresetObjects(Collection<PodPreset> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPodPresetObjects(PodPreset... items){
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodPresetObjects(Collection<PodPreset> items){
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PodPresetObjectsNested<A> addNewPodPresetObject(){
            return new PodPresetObjectsNestedImpl();
    }

    public TemplateFluent.PodPresetObjectsNested<A> addNewPodPresetObjectLike(PodPreset item){
            return new PodPresetObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PodPresetObjectsNested<A> setNewPodPresetObjectLike(int index,PodPreset item){
            return new PodPresetObjectsNestedImpl(index, item);
    }

    public A addToProjectObjects(int index,Project item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectBuilder builder = new ProjectBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToProjectObjects(int index,Project item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectBuilder builder = new ProjectBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToProjectObjects(Project... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToProjectObjects(Collection<Project> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromProjectObjects(Project... items){
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromProjectObjects(Collection<Project> items){
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ProjectObjectsNested<A> addNewProjectObject(){
            return new ProjectObjectsNestedImpl();
    }

    public TemplateFluent.ProjectObjectsNested<A> addNewProjectObjectLike(Project item){
            return new ProjectObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ProjectObjectsNested<A> setNewProjectObjectLike(int index,Project item){
            return new ProjectObjectsNestedImpl(index, item);
    }

    public A addToBuildConfigObjects(int index,BuildConfig item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToBuildConfigObjects(int index,BuildConfig item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildConfigBuilder builder = new BuildConfigBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToBuildConfigObjects(BuildConfig... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToBuildConfigObjects(Collection<BuildConfig> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromBuildConfigObjects(BuildConfig... items){
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildConfigObjects(Collection<BuildConfig> items){
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.BuildConfigObjectsNested<A> addNewBuildConfigObject(){
            return new BuildConfigObjectsNestedImpl();
    }

    public TemplateFluent.BuildConfigObjectsNested<A> addNewBuildConfigObjectLike(BuildConfig item){
            return new BuildConfigObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.BuildConfigObjectsNested<A> setNewBuildConfigObjectLike(int index,BuildConfig item){
            return new BuildConfigObjectsNestedImpl(index, item);
    }

    public A addToClusterRoleObjects(int index,ClusterRole item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToClusterRoleObjects(int index,ClusterRole item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBuilder builder = new ClusterRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToClusterRoleObjects(ClusterRole... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToClusterRoleObjects(Collection<ClusterRole> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromClusterRoleObjects(ClusterRole... items){
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromClusterRoleObjects(Collection<ClusterRole> items){
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ClusterRoleObjectsNested<A> addNewClusterRoleObject(){
            return new ClusterRoleObjectsNestedImpl();
    }

    public TemplateFluent.ClusterRoleObjectsNested<A> addNewClusterRoleObjectLike(ClusterRole item){
            return new ClusterRoleObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ClusterRoleObjectsNested<A> setNewClusterRoleObjectLike(int index,ClusterRole item){
            return new ClusterRoleObjectsNestedImpl(index, item);
    }

    public A addToOAuthAuthorizeTokenObjects(int index,OAuthAuthorizeToken item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOAuthAuthorizeTokenObjects(int index,OAuthAuthorizeToken item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthAuthorizeTokenObjects(OAuthAuthorizeToken... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOAuthAuthorizeTokenObjects(Collection<OAuthAuthorizeToken> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOAuthAuthorizeTokenObjects(OAuthAuthorizeToken... items){
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthAuthorizeTokenObjects(Collection<OAuthAuthorizeToken> items){
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OAuthAuthorizeTokenObjectsNested<A> addNewOAuthAuthorizeTokenObject(){
            return new OAuthAuthorizeTokenObjectsNestedImpl();
    }

    public TemplateFluent.OAuthAuthorizeTokenObjectsNested<A> addNewOAuthAuthorizeTokenObjectLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OAuthAuthorizeTokenObjectsNested<A> setNewOAuthAuthorizeTokenObjectLike(int index,OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenObjectsNestedImpl(index, item);
    }

    public A addToProjectRequestObjects(int index,ProjectRequest item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToProjectRequestObjects(int index,ProjectRequest item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectRequestBuilder builder = new ProjectRequestBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToProjectRequestObjects(ProjectRequest... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToProjectRequestObjects(Collection<ProjectRequest> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromProjectRequestObjects(ProjectRequest... items){
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromProjectRequestObjects(Collection<ProjectRequest> items){
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ProjectRequestObjectsNested<A> addNewProjectRequestObject(){
            return new ProjectRequestObjectsNestedImpl();
    }

    public TemplateFluent.ProjectRequestObjectsNested<A> addNewProjectRequestObjectLike(ProjectRequest item){
            return new ProjectRequestObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ProjectRequestObjectsNested<A> setNewProjectRequestObjectLike(int index,ProjectRequest item){
            return new ProjectRequestObjectsNestedImpl(index, item);
    }

    public A addToPriorityClassObjects(int index,PriorityClass item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPriorityClassObjects(int index,PriorityClass item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PriorityClassBuilder builder = new PriorityClassBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPriorityClassObjects(PriorityClass... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPriorityClassObjects(Collection<PriorityClass> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPriorityClassObjects(PriorityClass... items){
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPriorityClassObjects(Collection<PriorityClass> items){
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PriorityClassObjectsNested<A> addNewPriorityClassObject(){
            return new PriorityClassObjectsNestedImpl();
    }

    public TemplateFluent.PriorityClassObjectsNested<A> addNewPriorityClassObjectLike(PriorityClass item){
            return new PriorityClassObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PriorityClassObjectsNested<A> setNewPriorityClassObjectLike(int index,PriorityClass item){
            return new PriorityClassObjectsNestedImpl(index, item);
    }

    public A addToTemplateObjects(int index,Template item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TemplateBuilder builder = new TemplateBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToTemplateObjects(int index,Template item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TemplateBuilder builder = new TemplateBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToTemplateObjects(Template... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToTemplateObjects(Collection<Template> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromTemplateObjects(Template... items){
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromTemplateObjects(Collection<Template> items){
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.TemplateObjectsNested<A> addNewTemplateObject(){
            return new TemplateObjectsNestedImpl();
    }

    public TemplateFluent.TemplateObjectsNested<A> addNewTemplateObjectLike(Template item){
            return new TemplateObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.TemplateObjectsNested<A> setNewTemplateObjectLike(int index,Template item){
            return new TemplateObjectsNestedImpl(index, item);
    }

    public A addToOAuthClientAuthorizationObjects(int index,OAuthClientAuthorization item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOAuthClientAuthorizationObjects(int index,OAuthClientAuthorization item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthClientAuthorizationObjects(OAuthClientAuthorization... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOAuthClientAuthorizationObjects(Collection<OAuthClientAuthorization> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOAuthClientAuthorizationObjects(OAuthClientAuthorization... items){
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthClientAuthorizationObjects(Collection<OAuthClientAuthorization> items){
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OAuthClientAuthorizationObjectsNested<A> addNewOAuthClientAuthorizationObject(){
            return new OAuthClientAuthorizationObjectsNestedImpl();
    }

    public TemplateFluent.OAuthClientAuthorizationObjectsNested<A> addNewOAuthClientAuthorizationObjectLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OAuthClientAuthorizationObjectsNested<A> setNewOAuthClientAuthorizationObjectLike(int index,OAuthClientAuthorization item){
            return new OAuthClientAuthorizationObjectsNestedImpl(index, item);
    }

    public A addToDeploymentObjects(int index,Deployment item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToDeploymentObjects(int index,Deployment item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentBuilder builder = new DeploymentBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToDeploymentObjects(Deployment... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToDeploymentObjects(Collection<Deployment> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromDeploymentObjects(Deployment... items){
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromDeploymentObjects(Collection<Deployment> items){
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.DeploymentObjectsNested<A> addNewDeploymentObject(){
            return new DeploymentObjectsNestedImpl();
    }

    public TemplateFluent.DeploymentObjectsNested<A> addNewDeploymentObjectLike(Deployment item){
            return new DeploymentObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.DeploymentObjectsNested<A> setNewDeploymentObjectLike(int index,Deployment item){
            return new DeploymentObjectsNestedImpl(index, item);
    }

    public A addToPodTemplateObjects(int index,PodTemplate item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPodTemplateObjects(int index,PodTemplate item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodTemplateBuilder builder = new PodTemplateBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPodTemplateObjects(PodTemplate... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPodTemplateObjects(Collection<PodTemplate> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPodTemplateObjects(PodTemplate... items){
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodTemplateObjects(Collection<PodTemplate> items){
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PodTemplateObjectsNested<A> addNewPodTemplateObject(){
            return new PodTemplateObjectsNestedImpl();
    }

    public TemplateFluent.PodTemplateObjectsNested<A> addNewPodTemplateObjectLike(PodTemplate item){
            return new PodTemplateObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PodTemplateObjectsNested<A> setNewPodTemplateObjectLike(int index,PodTemplate item){
            return new PodTemplateObjectsNestedImpl(index, item);
    }

    public A addToEventObjects(int index,Event item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EventBuilder builder = new EventBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToEventObjects(int index,Event item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EventBuilder builder = new EventBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToEventObjects(Event... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToEventObjects(Collection<Event> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromEventObjects(Event... items){
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromEventObjects(Collection<Event> items){
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.EventObjectsNested<A> addNewEventObject(){
            return new EventObjectsNestedImpl();
    }

    public TemplateFluent.EventObjectsNested<A> addNewEventObjectLike(Event item){
            return new EventObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.EventObjectsNested<A> setNewEventObjectLike(int index,Event item){
            return new EventObjectsNestedImpl(index, item);
    }

    public A addToIngressObjects(int index,Ingress item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IngressBuilder builder = new IngressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToIngressObjects(int index,Ingress item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IngressBuilder builder = new IngressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToIngressObjects(Ingress... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToIngressObjects(Collection<Ingress> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromIngressObjects(Ingress... items){
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromIngressObjects(Collection<Ingress> items){
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.IngressObjectsNested<A> addNewIngressObject(){
            return new IngressObjectsNestedImpl();
    }

    public TemplateFluent.IngressObjectsNested<A> addNewIngressObjectLike(Ingress item){
            return new IngressObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.IngressObjectsNested<A> setNewIngressObjectLike(int index,Ingress item){
            return new IngressObjectsNestedImpl(index, item);
    }

    public A addToDeploymentConfigObjects(int index,DeploymentConfig item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToDeploymentConfigObjects(int index,DeploymentConfig item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToDeploymentConfigObjects(DeploymentConfig... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToDeploymentConfigObjects(Collection<DeploymentConfig> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromDeploymentConfigObjects(DeploymentConfig... items){
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromDeploymentConfigObjects(Collection<DeploymentConfig> items){
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.DeploymentConfigObjectsNested<A> addNewDeploymentConfigObject(){
            return new DeploymentConfigObjectsNestedImpl();
    }

    public TemplateFluent.DeploymentConfigObjectsNested<A> addNewDeploymentConfigObjectLike(DeploymentConfig item){
            return new DeploymentConfigObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.DeploymentConfigObjectsNested<A> setNewDeploymentConfigObjectLike(int index,DeploymentConfig item){
            return new DeploymentConfigObjectsNestedImpl(index, item);
    }

    public A addToOAuthAccessTokenObjects(int index,OAuthAccessToken item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOAuthAccessTokenObjects(int index,OAuthAccessToken item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthAccessTokenObjects(OAuthAccessToken... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOAuthAccessTokenObjects(Collection<OAuthAccessToken> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOAuthAccessTokenObjects(OAuthAccessToken... items){
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthAccessTokenObjects(Collection<OAuthAccessToken> items){
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OAuthAccessTokenObjectsNested<A> addNewOAuthAccessTokenObject(){
            return new OAuthAccessTokenObjectsNestedImpl();
    }

    public TemplateFluent.OAuthAccessTokenObjectsNested<A> addNewOAuthAccessTokenObjectLike(OAuthAccessToken item){
            return new OAuthAccessTokenObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OAuthAccessTokenObjectsNested<A> setNewOAuthAccessTokenObjectLike(int index,OAuthAccessToken item){
            return new OAuthAccessTokenObjectsNestedImpl(index, item);
    }

    public A addToPersistentVolumeObjects(int index,PersistentVolume item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPersistentVolumeObjects(int index,PersistentVolume item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPersistentVolumeObjects(PersistentVolume... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPersistentVolumeObjects(Collection<PersistentVolume> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPersistentVolumeObjects(PersistentVolume... items){
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPersistentVolumeObjects(Collection<PersistentVolume> items){
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PersistentVolumeObjectsNested<A> addNewPersistentVolumeObject(){
            return new PersistentVolumeObjectsNestedImpl();
    }

    public TemplateFluent.PersistentVolumeObjectsNested<A> addNewPersistentVolumeObjectLike(PersistentVolume item){
            return new PersistentVolumeObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PersistentVolumeObjectsNested<A> setNewPersistentVolumeObjectLike(int index,PersistentVolume item){
            return new PersistentVolumeObjectsNestedImpl(index, item);
    }

    public A addToPersistentVolumeClaimObjects(int index,PersistentVolumeClaim item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToPersistentVolumeClaimObjects(int index,PersistentVolumeClaim item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToPersistentVolumeClaimObjects(PersistentVolumeClaim... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToPersistentVolumeClaimObjects(Collection<PersistentVolumeClaim> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromPersistentVolumeClaimObjects(PersistentVolumeClaim... items){
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromPersistentVolumeClaimObjects(Collection<PersistentVolumeClaim> items){
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.PersistentVolumeClaimObjectsNested<A> addNewPersistentVolumeClaimObject(){
            return new PersistentVolumeClaimObjectsNestedImpl();
    }

    public TemplateFluent.PersistentVolumeClaimObjectsNested<A> addNewPersistentVolumeClaimObjectLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.PersistentVolumeClaimObjectsNested<A> setNewPersistentVolumeClaimObjectLike(int index,PersistentVolumeClaim item){
            return new PersistentVolumeClaimObjectsNestedImpl(index, item);
    }

    public A addToEventObjects(int index,io.fabric8.kubernetes.api.model.events.Event item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToEventObjects(int index,io.fabric8.kubernetes.api.model.events.Event item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToEventObjects(io.fabric8.kubernetes.api.model.events.Event... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToEventsEventObjects(Collection<io.fabric8.kubernetes.api.model.events.Event> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromEventObjects(io.fabric8.kubernetes.api.model.events.Event... items){
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromEventsEventObjects(Collection<io.fabric8.kubernetes.api.model.events.Event> items){
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.EventsEventObjectsNested<A> addNewEventsEventObject(){
            return new EventsEventObjectsNestedImpl();
    }

    public TemplateFluent.EventsEventObjectsNested<A> addNewEventObjectLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.EventsEventObjectsNested<A> setNewEventObjectLike(int index,io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventObjectsNestedImpl(index, item);
    }

    public A addToStatefulSetObjects(int index,StatefulSet item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToStatefulSetObjects(int index,StatefulSet item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StatefulSetBuilder builder = new StatefulSetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToStatefulSetObjects(StatefulSet... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToStatefulSetObjects(Collection<StatefulSet> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromStatefulSetObjects(StatefulSet... items){
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromStatefulSetObjects(Collection<StatefulSet> items){
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.StatefulSetObjectsNested<A> addNewStatefulSetObject(){
            return new StatefulSetObjectsNestedImpl();
    }

    public TemplateFluent.StatefulSetObjectsNested<A> addNewStatefulSetObjectLike(StatefulSet item){
            return new StatefulSetObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.StatefulSetObjectsNested<A> setNewStatefulSetObjectLike(int index,StatefulSet item){
            return new StatefulSetObjectsNestedImpl(index, item);
    }

    public A addToOpenshiftClusterRoleObjects(int index,OpenshiftClusterRole item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToOpenshiftClusterRoleObjects(int index,OpenshiftClusterRole item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftClusterRoleObjects(OpenshiftClusterRole... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftClusterRoleObjects(Collection<OpenshiftClusterRole> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftClusterRoleObjects(OpenshiftClusterRole... items){
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftClusterRoleObjects(Collection<OpenshiftClusterRole> items){
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.OpenshiftClusterRoleObjectsNested<A> addNewOpenshiftClusterRoleObject(){
            return new OpenshiftClusterRoleObjectsNestedImpl();
    }

    public TemplateFluent.OpenshiftClusterRoleObjectsNested<A> addNewOpenshiftClusterRoleObjectLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.OpenshiftClusterRoleObjectsNested<A> setNewOpenshiftClusterRoleObjectLike(int index,OpenshiftClusterRole item){
            return new OpenshiftClusterRoleObjectsNestedImpl(index, item);
    }

    public A addToRoleObjects(int index,Role item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBuilder builder = new RoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToRoleObjects(int index,Role item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBuilder builder = new RoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToRoleObjects(Role... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToRoleObjects(Collection<Role> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromRoleObjects(Role... items){
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromRoleObjects(Collection<Role> items){
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.RoleObjectsNested<A> addNewRoleObject(){
            return new RoleObjectsNestedImpl();
    }

    public TemplateFluent.RoleObjectsNested<A> addNewRoleObjectLike(Role item){
            return new RoleObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.RoleObjectsNested<A> setNewRoleObjectLike(int index,Role item){
            return new RoleObjectsNestedImpl(index, item);
    }

    public A addToUserObjects(int index,User item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            UserBuilder builder = new UserBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToUserObjects(int index,User item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            UserBuilder builder = new UserBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToUserObjects(User... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToUserObjects(Collection<User> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromUserObjects(User... items){
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromUserObjects(Collection<User> items){
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.UserObjectsNested<A> addNewUserObject(){
            return new UserObjectsNestedImpl();
    }

    public TemplateFluent.UserObjectsNested<A> addNewUserObjectLike(User item){
            return new UserObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.UserObjectsNested<A> setNewUserObjectLike(int index,User item){
            return new UserObjectsNestedImpl(index, item);
    }

    public A addToComponentStatusObjects(int index,ComponentStatus item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToComponentStatusObjects(int index,ComponentStatus item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ComponentStatusBuilder builder = new ComponentStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToComponentStatusObjects(ComponentStatus... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToComponentStatusObjects(Collection<ComponentStatus> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromComponentStatusObjects(ComponentStatus... items){
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromComponentStatusObjects(Collection<ComponentStatus> items){
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ComponentStatusObjectsNested<A> addNewComponentStatusObject(){
            return new ComponentStatusObjectsNestedImpl();
    }

    public TemplateFluent.ComponentStatusObjectsNested<A> addNewComponentStatusObjectLike(ComponentStatus item){
            return new ComponentStatusObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ComponentStatusObjectsNested<A> setNewComponentStatusObjectLike(int index,ComponentStatus item){
            return new ComponentStatusObjectsNestedImpl(index, item);
    }

    public A addToTokenReviewObjects(int index,TokenReview item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToTokenReviewObjects(int index,TokenReview item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TokenReviewBuilder builder = new TokenReviewBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToTokenReviewObjects(TokenReview... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToTokenReviewObjects(Collection<TokenReview> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromTokenReviewObjects(TokenReview... items){
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromTokenReviewObjects(Collection<TokenReview> items){
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.TokenReviewObjectsNested<A> addNewTokenReviewObject(){
            return new TokenReviewObjectsNestedImpl();
    }

    public TemplateFluent.TokenReviewObjectsNested<A> addNewTokenReviewObjectLike(TokenReview item){
            return new TokenReviewObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.TokenReviewObjectsNested<A> setNewTokenReviewObjectLike(int index,TokenReview item){
            return new TokenReviewObjectsNestedImpl(index, item);
    }

    public A addToBindingObjects(int index,Binding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BindingBuilder builder = new BindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToBindingObjects(int index,Binding item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BindingBuilder builder = new BindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToBindingObjects(Binding... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToBindingObjects(Collection<Binding> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromBindingObjects(Binding... items){
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromBindingObjects(Collection<Binding> items){
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.BindingObjectsNested<A> addNewBindingObject(){
            return new BindingObjectsNestedImpl();
    }

    public TemplateFluent.BindingObjectsNested<A> addNewBindingObjectLike(Binding item){
            return new BindingObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.BindingObjectsNested<A> setNewBindingObjectLike(int index,Binding item){
            return new BindingObjectsNestedImpl(index, item);
    }

    public A addToSecretObjects(int index,Secret item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecretBuilder builder = new SecretBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToSecretObjects(int index,Secret item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecretBuilder builder = new SecretBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToSecretObjects(Secret... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToSecretObjects(Collection<Secret> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromSecretObjects(Secret... items){
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecretObjects(Collection<Secret> items){
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.SecretObjectsNested<A> addNewSecretObject(){
            return new SecretObjectsNestedImpl();
    }

    public TemplateFluent.SecretObjectsNested<A> addNewSecretObjectLike(Secret item){
            return new SecretObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.SecretObjectsNested<A> setNewSecretObjectLike(int index,Secret item){
            return new SecretObjectsNestedImpl(index, item);
    }

    public A addToSecurityContextConstraintsObjects(int index,SecurityContextConstraints item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToSecurityContextConstraintsObjects(int index,SecurityContextConstraints item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToSecurityContextConstraintsObjects(SecurityContextConstraints... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToSecurityContextConstraintsObjects(Collection<SecurityContextConstraints> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromSecurityContextConstraintsObjects(SecurityContextConstraints... items){
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecurityContextConstraintsObjects(Collection<SecurityContextConstraints> items){
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.SecurityContextConstraintsObjectsNested<A> addNewSecurityContextConstraintsObject(){
            return new SecurityContextConstraintsObjectsNestedImpl();
    }

    public TemplateFluent.SecurityContextConstraintsObjectsNested<A> addNewSecurityContextConstraintsObjectLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.SecurityContextConstraintsObjectsNested<A> setNewSecurityContextConstraintsObjectLike(int index,SecurityContextConstraints item){
            return new SecurityContextConstraintsObjectsNestedImpl(index, item);
    }

    public A addToNetNamespaceObjects(int index,NetNamespace item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToNetNamespaceObjects(int index,NetNamespace item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetNamespaceBuilder builder = new NetNamespaceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToNetNamespaceObjects(NetNamespace... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToNetNamespaceObjects(Collection<NetNamespace> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromNetNamespaceObjects(NetNamespace... items){
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromNetNamespaceObjects(Collection<NetNamespace> items){
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.NetNamespaceObjectsNested<A> addNewNetNamespaceObject(){
            return new NetNamespaceObjectsNestedImpl();
    }

    public TemplateFluent.NetNamespaceObjectsNested<A> addNewNetNamespaceObjectLike(NetNamespace item){
            return new NetNamespaceObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.NetNamespaceObjectsNested<A> setNewNetNamespaceObjectLike(int index,NetNamespace item){
            return new NetNamespaceObjectsNestedImpl(index, item);
    }

    public A addToNodeObjects(int index,Node item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NodeBuilder builder = new NodeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToNodeObjects(int index,Node item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NodeBuilder builder = new NodeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToNodeObjects(Node... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToNodeObjects(Collection<Node> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromNodeObjects(Node... items){
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromNodeObjects(Collection<Node> items){
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.NodeObjectsNested<A> addNewNodeObject(){
            return new NodeObjectsNestedImpl();
    }

    public TemplateFluent.NodeObjectsNested<A> addNewNodeObjectLike(Node item){
            return new NodeObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.NodeObjectsNested<A> setNewNodeObjectLike(int index,Node item){
            return new NodeObjectsNestedImpl(index, item);
    }

    public A addToJobObjects(int index,Job item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            JobBuilder builder = new JobBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToJobObjects(int index,Job item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            JobBuilder builder = new JobBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToJobObjects(Job... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToJobObjects(Collection<Job> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromJobObjects(Job... items){
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromJobObjects(Collection<Job> items){
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.JobObjectsNested<A> addNewJobObject(){
            return new JobObjectsNestedImpl();
    }

    public TemplateFluent.JobObjectsNested<A> addNewJobObjectLike(Job item){
            return new JobObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.JobObjectsNested<A> setNewJobObjectLike(int index,Job item){
            return new JobObjectsNestedImpl(index, item);
    }

    public A addToCertificateSigningRequestObjects(int index,CertificateSigningRequest item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToCertificateSigningRequestObjects(int index,CertificateSigningRequest item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToCertificateSigningRequestObjects(CertificateSigningRequest... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToCertificateSigningRequestObjects(Collection<CertificateSigningRequest> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromCertificateSigningRequestObjects(CertificateSigningRequest... items){
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromCertificateSigningRequestObjects(Collection<CertificateSigningRequest> items){
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.CertificateSigningRequestObjectsNested<A> addNewCertificateSigningRequestObject(){
            return new CertificateSigningRequestObjectsNestedImpl();
    }

    public TemplateFluent.CertificateSigningRequestObjectsNested<A> addNewCertificateSigningRequestObjectLike(CertificateSigningRequest item){
            return new CertificateSigningRequestObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.CertificateSigningRequestObjectsNested<A> setNewCertificateSigningRequestObjectLike(int index,CertificateSigningRequest item){
            return new CertificateSigningRequestObjectsNestedImpl(index, item);
    }

    public A addToServiceAccountObjects(int index,ServiceAccount item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.objects.add(index >= 0 ? index : objects.size(), builder); return (A)this;
    }

    public A setToServiceAccountObjects(int index,ServiceAccount item){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceAccountBuilder builder = new ServiceAccountBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= objects.size()) { objects.add(builder); } else { objects.set(index, builder);}
             return (A)this;
    }

    public A addToServiceAccountObjects(ServiceAccount... items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A addAllToServiceAccountObjects(Collection<ServiceAccount> items){
            if (this.objects == null) {this.objects = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.add(builder);this.objects.add(builder);} return (A)this;
    }

    public A removeFromServiceAccountObjects(ServiceAccount... items){
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public A removeAllFromServiceAccountObjects(Collection<ServiceAccount> items){
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.remove(builder);if (this.objects != null) {this.objects.remove(builder);}} return (A)this;
    }

    public TemplateFluent.ServiceAccountObjectsNested<A> addNewServiceAccountObject(){
            return new ServiceAccountObjectsNestedImpl();
    }

    public TemplateFluent.ServiceAccountObjectsNested<A> addNewServiceAccountObjectLike(ServiceAccount item){
            return new ServiceAccountObjectsNestedImpl(-1, item);
    }

    public TemplateFluent.ServiceAccountObjectsNested<A> setNewServiceAccountObjectLike(int index,ServiceAccount item){
            return new ServiceAccountObjectsNestedImpl(index, item);
    }

    public A addToParameters(int index,Parameter item){
            if (this.parameters == null) {this.parameters = new ArrayList<ParameterBuilder>();}
            ParameterBuilder builder = new ParameterBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.parameters.add(index >= 0 ? index : parameters.size(), builder); return (A)this;
    }

    public A setToParameters(int index,Parameter item){
            if (this.parameters == null) {this.parameters = new ArrayList<ParameterBuilder>();}
            ParameterBuilder builder = new ParameterBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= parameters.size()) { parameters.add(builder); } else { parameters.set(index, builder);}
             return (A)this;
    }

    public A addToParameters(Parameter... items){
            if (this.parameters == null) {this.parameters = new ArrayList<ParameterBuilder>();}
            for (Parameter item : items) {ParameterBuilder builder = new ParameterBuilder(item);_visitables.add(builder);this.parameters.add(builder);} return (A)this;
    }

    public A addAllToParameters(Collection<Parameter> items){
            if (this.parameters == null) {this.parameters = new ArrayList<ParameterBuilder>();}
            for (Parameter item : items) {ParameterBuilder builder = new ParameterBuilder(item);_visitables.add(builder);this.parameters.add(builder);} return (A)this;
    }

    public A removeFromParameters(Parameter... items){
            for (Parameter item : items) {ParameterBuilder builder = new ParameterBuilder(item);_visitables.remove(builder);if (this.parameters != null) {this.parameters.remove(builder);}} return (A)this;
    }

    public A removeAllFromParameters(Collection<Parameter> items){
            for (Parameter item : items) {ParameterBuilder builder = new ParameterBuilder(item);_visitables.remove(builder);if (this.parameters != null) {this.parameters.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildParameters instead.
 * @return The buildable object.
 */
@Deprecated public List<Parameter> getParameters(){
            return build(parameters);
    }

    public List<Parameter> buildParameters(){
            return build(parameters);
    }

    public Parameter buildParameter(int index){
            return this.parameters.get(index).build();
    }

    public Parameter buildFirstParameter(){
            return this.parameters.get(0).build();
    }

    public Parameter buildLastParameter(){
            return this.parameters.get(parameters.size() - 1).build();
    }

    public Parameter buildMatchingParameter(io.fabric8.kubernetes.api.builder.Predicate<ParameterBuilder> predicate){
            for (ParameterBuilder item: parameters) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withParameters(List<Parameter> parameters){
            if (this.parameters != null) { _visitables.removeAll(this.parameters);}
            if (parameters != null) {this.parameters = new ArrayList<ParameterBuilder>(); for (Parameter item : parameters){this.addToParameters(item);}} else { this.parameters = new ArrayList<ParameterBuilder>();} return (A) this;
    }

    public A withParameters(Parameter... parameters){
            if (this.parameters != null) {this.parameters.clear();}
            if (parameters != null) {for (Parameter item :parameters){ this.addToParameters(item);}} return (A) this;
    }

    public Boolean hasParameters(){
            return parameters != null && !parameters.isEmpty();
    }

    public TemplateFluent.ParametersNested<A> addNewParameter(){
            return new ParametersNestedImpl();
    }

    public TemplateFluent.ParametersNested<A> addNewParameterLike(Parameter item){
            return new ParametersNestedImpl(-1, item);
    }

    public TemplateFluent.ParametersNested<A> setNewParameterLike(int index,Parameter item){
            return new ParametersNestedImpl(index, item);
    }

    public TemplateFluent.ParametersNested<A> editParameter(int index){
            if (parameters.size() <= index) throw new RuntimeException("Can't edit parameters. Index exceeds size.");
            return setNewParameterLike(index, buildParameter(index));
    }

    public TemplateFluent.ParametersNested<A> editFirstParameter(){
            if (parameters.size() == 0) throw new RuntimeException("Can't edit first parameters. The list is empty.");
            return setNewParameterLike(0, buildParameter(0));
    }

    public TemplateFluent.ParametersNested<A> editLastParameter(){
            int index = parameters.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last parameters. The list is empty.");
            return setNewParameterLike(index, buildParameter(index));
    }

    public TemplateFluent.ParametersNested<A> editMatchingParameter(io.fabric8.kubernetes.api.builder.Predicate<ParameterBuilder> predicate){
            int index = -1;
            for (int i=0;i<parameters.size();i++) { 
            if (predicate.apply(parameters.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching parameters. No match found.");
            return setNewParameterLike(index, buildParameter(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TemplateFluentImpl that = (TemplateFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (labels != null ? !labels.equals(that.labels) :that.labels != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (objects != null ? !objects.equals(that.objects) :that.objects != null) return false;
            if (parameters != null ? !parameters.equals(that.parameters) :that.parameters != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<TemplateFluent.MetadataNested<N>> implements TemplateFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationObjectsNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<TemplateFluent.ValidatingWebhookConfigurationObjectsNested<N>> implements TemplateFluent.ValidatingWebhookConfigurationObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
        private final int index;
    
            ValidatingWebhookConfigurationObjectsNestedImpl(int index,ValidatingWebhookConfiguration item){
                    this.index = index;
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToValidatingWebhookConfigurationObjects(index, builder.build());
    }
    public N endValidatingWebhookConfigurationObject(){
            return and();
    }

}
    public class StorageClassObjectsNestedImpl<N> extends StorageClassFluentImpl<TemplateFluent.StorageClassObjectsNested<N>> implements TemplateFluent.StorageClassObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
        private final int index;
    
            StorageClassObjectsNestedImpl(int index,StorageClass item){
                    this.index = index;
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToStorageClassObjects(index, builder.build());
    }
    public N endStorageClassObject(){
            return and();
    }

}
    public class ClusterRoleBindingObjectsNestedImpl<N> extends ClusterRoleBindingFluentImpl<TemplateFluent.ClusterRoleBindingObjectsNested<N>> implements TemplateFluent.ClusterRoleBindingObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
        private final int index;
    
            ClusterRoleBindingObjectsNestedImpl(int index,ClusterRoleBinding item){
                    this.index = index;
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToClusterRoleBindingObjects(index, builder.build());
    }
    public N endClusterRoleBindingObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingObjectsNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<TemplateFluent.OpenshiftRoleBindingObjectsNested<N>> implements TemplateFluent.OpenshiftRoleBindingObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
        private final int index;
    
            OpenshiftRoleBindingObjectsNestedImpl(int index,OpenshiftRoleBinding item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOpenshiftRoleBindingObjects(index, builder.build());
    }
    public N endOpenshiftRoleBindingObject(){
            return and();
    }

}
    public class PodDisruptionBudgetObjectsNestedImpl<N> extends PodDisruptionBudgetFluentImpl<TemplateFluent.PodDisruptionBudgetObjectsNested<N>> implements TemplateFluent.PodDisruptionBudgetObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
        private final int index;
    
            PodDisruptionBudgetObjectsNestedImpl(int index,PodDisruptionBudget item){
                    this.index = index;
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPodDisruptionBudgetObjects(index, builder.build());
    }
    public N endPodDisruptionBudgetObject(){
            return and();
    }

}
    public class NetworkPolicyObjectsNestedImpl<N> extends NetworkPolicyFluentImpl<TemplateFluent.NetworkPolicyObjectsNested<N>> implements TemplateFluent.NetworkPolicyObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
        private final int index;
    
            NetworkPolicyObjectsNestedImpl(int index,NetworkPolicy item){
                    this.index = index;
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToNetworkPolicyObjects(index, builder.build());
    }
    public N endNetworkPolicyObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingObjectsNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<N>> implements TemplateFluent.OpenshiftClusterRoleBindingObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
        private final int index;
    
            OpenshiftClusterRoleBindingObjectsNestedImpl(int index,OpenshiftClusterRoleBinding item){
                    this.index = index;
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOpenshiftClusterRoleBindingObjects(index, builder.build());
    }
    public N endOpenshiftClusterRoleBindingObject(){
            return and();
    }

}
    public class RouteObjectsNestedImpl<N> extends RouteFluentImpl<TemplateFluent.RouteObjectsNested<N>> implements TemplateFluent.RouteObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
        private final int index;
    
            RouteObjectsNestedImpl(int index,Route item){
                    this.index = index;
                    this.builder = new RouteBuilder(this, item);
            }
            RouteObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToRouteObjects(index, builder.build());
    }
    public N endRouteObject(){
            return and();
    }

}
    public class NamespaceObjectsNestedImpl<N> extends NamespaceFluentImpl<TemplateFluent.NamespaceObjectsNested<N>> implements TemplateFluent.NamespaceObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
        private final int index;
    
            NamespaceObjectsNestedImpl(int index,Namespace item){
                    this.index = index;
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToNamespaceObjects(index, builder.build());
    }
    public N endNamespaceObject(){
            return and();
    }

}
    public class LocalSubjectAccessReviewObjectsNestedImpl<N> extends io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl<TemplateFluent.LocalSubjectAccessReviewObjectsNested<N>> implements TemplateFluent.LocalSubjectAccessReviewObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder builder;
        private final int index;
    
            LocalSubjectAccessReviewObjectsNestedImpl(int index,io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
                    this.index = index;
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToLocalSubjectAccessReviewObjects(index, builder.build());
    }
    public N endLocalSubjectAccessReviewObject(){
            return and();
    }

}
    public class ServiceObjectsNestedImpl<N> extends ServiceFluentImpl<TemplateFluent.ServiceObjectsNested<N>> implements TemplateFluent.ServiceObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
        private final int index;
    
            ServiceObjectsNestedImpl(int index,Service item){
                    this.index = index;
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToServiceObjects(index, builder.build());
    }
    public N endServiceObject(){
            return and();
    }

}
    public class ReplicationControllerObjectsNestedImpl<N> extends ReplicationControllerFluentImpl<TemplateFluent.ReplicationControllerObjectsNested<N>> implements TemplateFluent.ReplicationControllerObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
        private final int index;
    
            ReplicationControllerObjectsNestedImpl(int index,ReplicationController item){
                    this.index = index;
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToReplicationControllerObjects(index, builder.build());
    }
    public N endReplicationControllerObject(){
            return and();
    }

}
    public class SubjectAccessReviewObjectsNestedImpl<N> extends io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl<TemplateFluent.SubjectAccessReviewObjectsNested<N>> implements TemplateFluent.SubjectAccessReviewObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder builder;
        private final int index;
    
            SubjectAccessReviewObjectsNestedImpl(int index,io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
                    this.index = index;
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToSubjectAccessReviewObjects(index, builder.build());
    }
    public N endSubjectAccessReviewObject(){
            return and();
    }

}
    public class MutatingWebhookConfigurationObjectsNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<TemplateFluent.MutatingWebhookConfigurationObjectsNested<N>> implements TemplateFluent.MutatingWebhookConfigurationObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
        private final int index;
    
            MutatingWebhookConfigurationObjectsNestedImpl(int index,MutatingWebhookConfiguration item){
                    this.index = index;
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToMutatingWebhookConfigurationObjects(index, builder.build());
    }
    public N endMutatingWebhookConfigurationObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerObjectsNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<TemplateFluent.HorizontalPodAutoscalerObjectsNested<N>> implements TemplateFluent.HorizontalPodAutoscalerObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
        private final int index;
    
            HorizontalPodAutoscalerObjectsNestedImpl(int index,HorizontalPodAutoscaler item){
                    this.index = index;
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToHorizontalPodAutoscalerObjects(index, builder.build());
    }
    public N endHorizontalPodAutoscalerObject(){
            return and();
    }

}
    public class ScaleObjectsNestedImpl<N> extends ScaleFluentImpl<TemplateFluent.ScaleObjectsNested<N>> implements TemplateFluent.ScaleObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
        private final int index;
    
            ScaleObjectsNestedImpl(int index,Scale item){
                    this.index = index;
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToScaleObjects(index, builder.build());
    }
    public N endScaleObject(){
            return and();
    }

}
    public class ImageObjectsNestedImpl<N> extends ImageFluentImpl<TemplateFluent.ImageObjectsNested<N>> implements TemplateFluent.ImageObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
        private final int index;
    
            ImageObjectsNestedImpl(int index,Image item){
                    this.index = index;
                    this.builder = new ImageBuilder(this, item);
            }
            ImageObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToImageObjects(index, builder.build());
    }
    public N endImageObject(){
            return and();
    }

}
    public class ReplicaSetObjectsNestedImpl<N> extends ReplicaSetFluentImpl<TemplateFluent.ReplicaSetObjectsNested<N>> implements TemplateFluent.ReplicaSetObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
        private final int index;
    
            ReplicaSetObjectsNestedImpl(int index,ReplicaSet item){
                    this.index = index;
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToReplicaSetObjects(index, builder.build());
    }
    public N endReplicaSetObject(){
            return and();
    }

}
    public class PodSecurityPolicyObjectsNestedImpl<N> extends PodSecurityPolicyFluentImpl<TemplateFluent.PodSecurityPolicyObjectsNested<N>> implements TemplateFluent.PodSecurityPolicyObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
        private final int index;
    
            PodSecurityPolicyObjectsNestedImpl(int index,PodSecurityPolicy item){
                    this.index = index;
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPodSecurityPolicyObjects(index, builder.build());
    }
    public N endPodSecurityPolicyObject(){
            return and();
    }

}
    public class CronJobObjectsNestedImpl<N> extends CronJobFluentImpl<TemplateFluent.CronJobObjectsNested<N>> implements TemplateFluent.CronJobObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
        private final int index;
    
            CronJobObjectsNestedImpl(int index,CronJob item){
                    this.index = index;
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToCronJobObjects(index, builder.build());
    }
    public N endCronJobObject(){
            return and();
    }

}
    public class EndpointsObjectsNestedImpl<N> extends EndpointsFluentImpl<TemplateFluent.EndpointsObjectsNested<N>> implements TemplateFluent.EndpointsObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
        private final int index;
    
            EndpointsObjectsNestedImpl(int index,Endpoints item){
                    this.index = index;
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToEndpointsObjects(index, builder.build());
    }
    public N endEndpointsObject(){
            return and();
    }

}
    public class PodObjectsNestedImpl<N> extends PodFluentImpl<TemplateFluent.PodObjectsNested<N>> implements TemplateFluent.PodObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
        private final int index;
    
            PodObjectsNestedImpl(int index,Pod item){
                    this.index = index;
                    this.builder = new PodBuilder(this, item);
            }
            PodObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPodObjects(index, builder.build());
    }
    public N endPodObject(){
            return and();
    }

}
    public class ConfigMapObjectsNestedImpl<N> extends ConfigMapFluentImpl<TemplateFluent.ConfigMapObjectsNested<N>> implements TemplateFluent.ConfigMapObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
        private final int index;
    
            ConfigMapObjectsNestedImpl(int index,ConfigMap item){
                    this.index = index;
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToConfigMapObjects(index, builder.build());
    }
    public N endConfigMapObject(){
            return and();
    }

}
    public class CustomResourceDefinitionObjectsNestedImpl<N> extends CustomResourceDefinitionFluentImpl<TemplateFluent.CustomResourceDefinitionObjectsNested<N>> implements TemplateFluent.CustomResourceDefinitionObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
        private final int index;
    
            CustomResourceDefinitionObjectsNestedImpl(int index,CustomResourceDefinition item){
                    this.index = index;
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToCustomResourceDefinitionObjects(index, builder.build());
    }
    public N endCustomResourceDefinitionObject(){
            return and();
    }

}
    public class BuildObjectsNestedImpl<N> extends BuildFluentImpl<TemplateFluent.BuildObjectsNested<N>> implements TemplateFluent.BuildObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
        private final int index;
    
            BuildObjectsNestedImpl(int index,Build item){
                    this.index = index;
                    this.builder = new BuildBuilder(this, item);
            }
            BuildObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToBuildObjects(index, builder.build());
    }
    public N endBuildObject(){
            return and();
    }

}
    public class ImageStreamTagObjectsNestedImpl<N> extends ImageStreamTagFluentImpl<TemplateFluent.ImageStreamTagObjectsNested<N>> implements TemplateFluent.ImageStreamTagObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
        private final int index;
    
            ImageStreamTagObjectsNestedImpl(int index,ImageStreamTag item){
                    this.index = index;
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToImageStreamTagObjects(index, builder.build());
    }
    public N endImageStreamTagObject(){
            return and();
    }

}
    public class GroupObjectsNestedImpl<N> extends GroupFluentImpl<TemplateFluent.GroupObjectsNested<N>> implements TemplateFluent.GroupObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
        private final int index;
    
            GroupObjectsNestedImpl(int index,Group item){
                    this.index = index;
                    this.builder = new GroupBuilder(this, item);
            }
            GroupObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToGroupObjects(index, builder.build());
    }
    public N endGroupObject(){
            return and();
    }

}
    public class ImageSignatureObjectsNestedImpl<N> extends ImageSignatureFluentImpl<TemplateFluent.ImageSignatureObjectsNested<N>> implements TemplateFluent.ImageSignatureObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
        private final int index;
    
            ImageSignatureObjectsNestedImpl(int index,ImageSignature item){
                    this.index = index;
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToImageSignatureObjects(index, builder.build());
    }
    public N endImageSignatureObject(){
            return and();
    }

}
    public class ResourceQuotaObjectsNestedImpl<N> extends ResourceQuotaFluentImpl<TemplateFluent.ResourceQuotaObjectsNested<N>> implements TemplateFluent.ResourceQuotaObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
        private final int index;
    
            ResourceQuotaObjectsNestedImpl(int index,ResourceQuota item){
                    this.index = index;
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToResourceQuotaObjects(index, builder.build());
    }
    public N endResourceQuotaObject(){
            return and();
    }

}
    public class BuildRequestObjectsNestedImpl<N> extends BuildRequestFluentImpl<TemplateFluent.BuildRequestObjectsNested<N>> implements TemplateFluent.BuildRequestObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
        private final int index;
    
            BuildRequestObjectsNestedImpl(int index,BuildRequest item){
                    this.index = index;
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToBuildRequestObjects(index, builder.build());
    }
    public N endBuildRequestObject(){
            return and();
    }

}
    public class DaemonSetObjectsNestedImpl<N> extends DaemonSetFluentImpl<TemplateFluent.DaemonSetObjectsNested<N>> implements TemplateFluent.DaemonSetObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
        private final int index;
    
            DaemonSetObjectsNestedImpl(int index,DaemonSet item){
                    this.index = index;
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToDaemonSetObjects(index, builder.build());
    }
    public N endDaemonSetObject(){
            return and();
    }

}
    public class ImageStreamObjectsNestedImpl<N> extends ImageStreamFluentImpl<TemplateFluent.ImageStreamObjectsNested<N>> implements TemplateFluent.ImageStreamObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
        private final int index;
    
            ImageStreamObjectsNestedImpl(int index,ImageStream item){
                    this.index = index;
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToImageStreamObjects(index, builder.build());
    }
    public N endImageStreamObject(){
            return and();
    }

}
    public class OpenshiftRoleObjectsNestedImpl<N> extends OpenshiftRoleFluentImpl<TemplateFluent.OpenshiftRoleObjectsNested<N>> implements TemplateFluent.OpenshiftRoleObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
        private final int index;
    
            OpenshiftRoleObjectsNestedImpl(int index,OpenshiftRole item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOpenshiftRoleObjects(index, builder.build());
    }
    public N endOpenshiftRoleObject(){
            return and();
    }

}
    public class OAuthClientObjectsNestedImpl<N> extends OAuthClientFluentImpl<TemplateFluent.OAuthClientObjectsNested<N>> implements TemplateFluent.OAuthClientObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
        private final int index;
    
            OAuthClientObjectsNestedImpl(int index,OAuthClient item){
                    this.index = index;
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOAuthClientObjects(index, builder.build());
    }
    public N endOAuthClientObject(){
            return and();
    }

}
    public class IdentityObjectsNestedImpl<N> extends IdentityFluentImpl<TemplateFluent.IdentityObjectsNested<N>> implements TemplateFluent.IdentityObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
        private final int index;
    
            IdentityObjectsNestedImpl(int index,Identity item){
                    this.index = index;
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToIdentityObjects(index, builder.build());
    }
    public N endIdentityObject(){
            return and();
    }

}
    public class LimitRangeObjectsNestedImpl<N> extends LimitRangeFluentImpl<TemplateFluent.LimitRangeObjectsNested<N>> implements TemplateFluent.LimitRangeObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
        private final int index;
    
            LimitRangeObjectsNestedImpl(int index,LimitRange item){
                    this.index = index;
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToLimitRangeObjects(index, builder.build());
    }
    public N endLimitRangeObject(){
            return and();
    }

}
    public class ImageStreamImportObjectsNestedImpl<N> extends ImageStreamImportFluentImpl<TemplateFluent.ImageStreamImportObjectsNested<N>> implements TemplateFluent.ImageStreamImportObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
        private final int index;
    
            ImageStreamImportObjectsNestedImpl(int index,ImageStreamImport item){
                    this.index = index;
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToImageStreamImportObjects(index, builder.build());
    }
    public N endImageStreamImportObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionObjectsNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<N>> implements TemplateFluent.OpenshiftRoleBindingRestrictionObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
        private final int index;
    
            OpenshiftRoleBindingRestrictionObjectsNestedImpl(int index,OpenshiftRoleBindingRestriction item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOpenshiftRoleBindingRestrictionObjects(index, builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionObject(){
            return and();
    }

}
    public class RoleBindingObjectsNestedImpl<N> extends RoleBindingFluentImpl<TemplateFluent.RoleBindingObjectsNested<N>> implements TemplateFluent.RoleBindingObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
        private final int index;
    
            RoleBindingObjectsNestedImpl(int index,RoleBinding item){
                    this.index = index;
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToRoleBindingObjects(index, builder.build());
    }
    public N endRoleBindingObject(){
            return and();
    }

}
    public class PodPresetObjectsNestedImpl<N> extends PodPresetFluentImpl<TemplateFluent.PodPresetObjectsNested<N>> implements TemplateFluent.PodPresetObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
        private final int index;
    
            PodPresetObjectsNestedImpl(int index,PodPreset item){
                    this.index = index;
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPodPresetObjects(index, builder.build());
    }
    public N endPodPresetObject(){
            return and();
    }

}
    public class ProjectObjectsNestedImpl<N> extends ProjectFluentImpl<TemplateFluent.ProjectObjectsNested<N>> implements TemplateFluent.ProjectObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
        private final int index;
    
            ProjectObjectsNestedImpl(int index,Project item){
                    this.index = index;
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToProjectObjects(index, builder.build());
    }
    public N endProjectObject(){
            return and();
    }

}
    public class BuildConfigObjectsNestedImpl<N> extends BuildConfigFluentImpl<TemplateFluent.BuildConfigObjectsNested<N>> implements TemplateFluent.BuildConfigObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
        private final int index;
    
            BuildConfigObjectsNestedImpl(int index,BuildConfig item){
                    this.index = index;
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToBuildConfigObjects(index, builder.build());
    }
    public N endBuildConfigObject(){
            return and();
    }

}
    public class ClusterRoleObjectsNestedImpl<N> extends ClusterRoleFluentImpl<TemplateFluent.ClusterRoleObjectsNested<N>> implements TemplateFluent.ClusterRoleObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
        private final int index;
    
            ClusterRoleObjectsNestedImpl(int index,ClusterRole item){
                    this.index = index;
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToClusterRoleObjects(index, builder.build());
    }
    public N endClusterRoleObject(){
            return and();
    }

}
    public class OAuthAuthorizeTokenObjectsNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<TemplateFluent.OAuthAuthorizeTokenObjectsNested<N>> implements TemplateFluent.OAuthAuthorizeTokenObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
        private final int index;
    
            OAuthAuthorizeTokenObjectsNestedImpl(int index,OAuthAuthorizeToken item){
                    this.index = index;
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOAuthAuthorizeTokenObjects(index, builder.build());
    }
    public N endOAuthAuthorizeTokenObject(){
            return and();
    }

}
    public class ProjectRequestObjectsNestedImpl<N> extends ProjectRequestFluentImpl<TemplateFluent.ProjectRequestObjectsNested<N>> implements TemplateFluent.ProjectRequestObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
        private final int index;
    
            ProjectRequestObjectsNestedImpl(int index,ProjectRequest item){
                    this.index = index;
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToProjectRequestObjects(index, builder.build());
    }
    public N endProjectRequestObject(){
            return and();
    }

}
    public class PriorityClassObjectsNestedImpl<N> extends PriorityClassFluentImpl<TemplateFluent.PriorityClassObjectsNested<N>> implements TemplateFluent.PriorityClassObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
        private final int index;
    
            PriorityClassObjectsNestedImpl(int index,PriorityClass item){
                    this.index = index;
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPriorityClassObjects(index, builder.build());
    }
    public N endPriorityClassObject(){
            return and();
    }

}
    public class TemplateObjectsNestedImpl<N> extends TemplateFluentImpl<TemplateFluent.TemplateObjectsNested<N>> implements TemplateFluent.TemplateObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
        private final int index;
    
            TemplateObjectsNestedImpl(int index,Template item){
                    this.index = index;
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToTemplateObjects(index, builder.build());
    }
    public N endTemplateObject(){
            return and();
    }

}
    public class OAuthClientAuthorizationObjectsNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<TemplateFluent.OAuthClientAuthorizationObjectsNested<N>> implements TemplateFluent.OAuthClientAuthorizationObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
        private final int index;
    
            OAuthClientAuthorizationObjectsNestedImpl(int index,OAuthClientAuthorization item){
                    this.index = index;
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOAuthClientAuthorizationObjects(index, builder.build());
    }
    public N endOAuthClientAuthorizationObject(){
            return and();
    }

}
    public class DeploymentObjectsNestedImpl<N> extends DeploymentFluentImpl<TemplateFluent.DeploymentObjectsNested<N>> implements TemplateFluent.DeploymentObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
        private final int index;
    
            DeploymentObjectsNestedImpl(int index,Deployment item){
                    this.index = index;
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToDeploymentObjects(index, builder.build());
    }
    public N endDeploymentObject(){
            return and();
    }

}
    public class PodTemplateObjectsNestedImpl<N> extends PodTemplateFluentImpl<TemplateFluent.PodTemplateObjectsNested<N>> implements TemplateFluent.PodTemplateObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
        private final int index;
    
            PodTemplateObjectsNestedImpl(int index,PodTemplate item){
                    this.index = index;
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPodTemplateObjects(index, builder.build());
    }
    public N endPodTemplateObject(){
            return and();
    }

}
    public class EventObjectsNestedImpl<N> extends EventFluentImpl<TemplateFluent.EventObjectsNested<N>> implements TemplateFluent.EventObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
        private final int index;
    
            EventObjectsNestedImpl(int index,Event item){
                    this.index = index;
                    this.builder = new EventBuilder(this, item);
            }
            EventObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToEventObjects(index, builder.build());
    }
    public N endEventObject(){
            return and();
    }

}
    public class IngressObjectsNestedImpl<N> extends IngressFluentImpl<TemplateFluent.IngressObjectsNested<N>> implements TemplateFluent.IngressObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
        private final int index;
    
            IngressObjectsNestedImpl(int index,Ingress item){
                    this.index = index;
                    this.builder = new IngressBuilder(this, item);
            }
            IngressObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToIngressObjects(index, builder.build());
    }
    public N endIngressObject(){
            return and();
    }

}
    public class DeploymentConfigObjectsNestedImpl<N> extends DeploymentConfigFluentImpl<TemplateFluent.DeploymentConfigObjectsNested<N>> implements TemplateFluent.DeploymentConfigObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
        private final int index;
    
            DeploymentConfigObjectsNestedImpl(int index,DeploymentConfig item){
                    this.index = index;
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToDeploymentConfigObjects(index, builder.build());
    }
    public N endDeploymentConfigObject(){
            return and();
    }

}
    public class OAuthAccessTokenObjectsNestedImpl<N> extends OAuthAccessTokenFluentImpl<TemplateFluent.OAuthAccessTokenObjectsNested<N>> implements TemplateFluent.OAuthAccessTokenObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
        private final int index;
    
            OAuthAccessTokenObjectsNestedImpl(int index,OAuthAccessToken item){
                    this.index = index;
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOAuthAccessTokenObjects(index, builder.build());
    }
    public N endOAuthAccessTokenObject(){
            return and();
    }

}
    public class PersistentVolumeObjectsNestedImpl<N> extends PersistentVolumeFluentImpl<TemplateFluent.PersistentVolumeObjectsNested<N>> implements TemplateFluent.PersistentVolumeObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
        private final int index;
    
            PersistentVolumeObjectsNestedImpl(int index,PersistentVolume item){
                    this.index = index;
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPersistentVolumeObjects(index, builder.build());
    }
    public N endPersistentVolumeObject(){
            return and();
    }

}
    public class PersistentVolumeClaimObjectsNestedImpl<N> extends PersistentVolumeClaimFluentImpl<TemplateFluent.PersistentVolumeClaimObjectsNested<N>> implements TemplateFluent.PersistentVolumeClaimObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
        private final int index;
    
            PersistentVolumeClaimObjectsNestedImpl(int index,PersistentVolumeClaim item){
                    this.index = index;
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToPersistentVolumeClaimObjects(index, builder.build());
    }
    public N endPersistentVolumeClaimObject(){
            return and();
    }

}
    public class EventsEventObjectsNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<TemplateFluent.EventsEventObjectsNested<N>> implements TemplateFluent.EventsEventObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
        private final int index;
    
            EventsEventObjectsNestedImpl(int index,io.fabric8.kubernetes.api.model.events.Event item){
                    this.index = index;
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToEventObjects(index, builder.build());
    }
    public N endEventsEventObject(){
            return and();
    }

}
    public class StatefulSetObjectsNestedImpl<N> extends StatefulSetFluentImpl<TemplateFluent.StatefulSetObjectsNested<N>> implements TemplateFluent.StatefulSetObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
        private final int index;
    
            StatefulSetObjectsNestedImpl(int index,StatefulSet item){
                    this.index = index;
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToStatefulSetObjects(index, builder.build());
    }
    public N endStatefulSetObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleObjectsNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<TemplateFluent.OpenshiftClusterRoleObjectsNested<N>> implements TemplateFluent.OpenshiftClusterRoleObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
        private final int index;
    
            OpenshiftClusterRoleObjectsNestedImpl(int index,OpenshiftClusterRole item){
                    this.index = index;
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToOpenshiftClusterRoleObjects(index, builder.build());
    }
    public N endOpenshiftClusterRoleObject(){
            return and();
    }

}
    public class RoleObjectsNestedImpl<N> extends RoleFluentImpl<TemplateFluent.RoleObjectsNested<N>> implements TemplateFluent.RoleObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
        private final int index;
    
            RoleObjectsNestedImpl(int index,Role item){
                    this.index = index;
                    this.builder = new RoleBuilder(this, item);
            }
            RoleObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToRoleObjects(index, builder.build());
    }
    public N endRoleObject(){
            return and();
    }

}
    public class UserObjectsNestedImpl<N> extends UserFluentImpl<TemplateFluent.UserObjectsNested<N>> implements TemplateFluent.UserObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
        private final int index;
    
            UserObjectsNestedImpl(int index,User item){
                    this.index = index;
                    this.builder = new UserBuilder(this, item);
            }
            UserObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToUserObjects(index, builder.build());
    }
    public N endUserObject(){
            return and();
    }

}
    public class ComponentStatusObjectsNestedImpl<N> extends ComponentStatusFluentImpl<TemplateFluent.ComponentStatusObjectsNested<N>> implements TemplateFluent.ComponentStatusObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
        private final int index;
    
            ComponentStatusObjectsNestedImpl(int index,ComponentStatus item){
                    this.index = index;
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToComponentStatusObjects(index, builder.build());
    }
    public N endComponentStatusObject(){
            return and();
    }

}
    public class TokenReviewObjectsNestedImpl<N> extends TokenReviewFluentImpl<TemplateFluent.TokenReviewObjectsNested<N>> implements TemplateFluent.TokenReviewObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
        private final int index;
    
            TokenReviewObjectsNestedImpl(int index,TokenReview item){
                    this.index = index;
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToTokenReviewObjects(index, builder.build());
    }
    public N endTokenReviewObject(){
            return and();
    }

}
    public class BindingObjectsNestedImpl<N> extends BindingFluentImpl<TemplateFluent.BindingObjectsNested<N>> implements TemplateFluent.BindingObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
        private final int index;
    
            BindingObjectsNestedImpl(int index,Binding item){
                    this.index = index;
                    this.builder = new BindingBuilder(this, item);
            }
            BindingObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToBindingObjects(index, builder.build());
    }
    public N endBindingObject(){
            return and();
    }

}
    public class SecretObjectsNestedImpl<N> extends SecretFluentImpl<TemplateFluent.SecretObjectsNested<N>> implements TemplateFluent.SecretObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
        private final int index;
    
            SecretObjectsNestedImpl(int index,Secret item){
                    this.index = index;
                    this.builder = new SecretBuilder(this, item);
            }
            SecretObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToSecretObjects(index, builder.build());
    }
    public N endSecretObject(){
            return and();
    }

}
    public class SecurityContextConstraintsObjectsNestedImpl<N> extends SecurityContextConstraintsFluentImpl<TemplateFluent.SecurityContextConstraintsObjectsNested<N>> implements TemplateFluent.SecurityContextConstraintsObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
        private final int index;
    
            SecurityContextConstraintsObjectsNestedImpl(int index,SecurityContextConstraints item){
                    this.index = index;
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToSecurityContextConstraintsObjects(index, builder.build());
    }
    public N endSecurityContextConstraintsObject(){
            return and();
    }

}
    public class NetNamespaceObjectsNestedImpl<N> extends NetNamespaceFluentImpl<TemplateFluent.NetNamespaceObjectsNested<N>> implements TemplateFluent.NetNamespaceObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
        private final int index;
    
            NetNamespaceObjectsNestedImpl(int index,NetNamespace item){
                    this.index = index;
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToNetNamespaceObjects(index, builder.build());
    }
    public N endNetNamespaceObject(){
            return and();
    }

}
    public class NodeObjectsNestedImpl<N> extends NodeFluentImpl<TemplateFluent.NodeObjectsNested<N>> implements TemplateFluent.NodeObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
        private final int index;
    
            NodeObjectsNestedImpl(int index,Node item){
                    this.index = index;
                    this.builder = new NodeBuilder(this, item);
            }
            NodeObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToNodeObjects(index, builder.build());
    }
    public N endNodeObject(){
            return and();
    }

}
    public class JobObjectsNestedImpl<N> extends JobFluentImpl<TemplateFluent.JobObjectsNested<N>> implements TemplateFluent.JobObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
        private final int index;
    
            JobObjectsNestedImpl(int index,Job item){
                    this.index = index;
                    this.builder = new JobBuilder(this, item);
            }
            JobObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToJobObjects(index, builder.build());
    }
    public N endJobObject(){
            return and();
    }

}
    public class CertificateSigningRequestObjectsNestedImpl<N> extends CertificateSigningRequestFluentImpl<TemplateFluent.CertificateSigningRequestObjectsNested<N>> implements TemplateFluent.CertificateSigningRequestObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
        private final int index;
    
            CertificateSigningRequestObjectsNestedImpl(int index,CertificateSigningRequest item){
                    this.index = index;
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToCertificateSigningRequestObjects(index, builder.build());
    }
    public N endCertificateSigningRequestObject(){
            return and();
    }

}
    public class ServiceAccountObjectsNestedImpl<N> extends ServiceAccountFluentImpl<TemplateFluent.ServiceAccountObjectsNested<N>> implements TemplateFluent.ServiceAccountObjectsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
        private final int index;
    
            ServiceAccountObjectsNestedImpl(int index,ServiceAccount item){
                    this.index = index;
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountObjectsNestedImpl(){
                    this.index = -1;
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToServiceAccountObjects(index, builder.build());
    }
    public N endServiceAccountObject(){
            return and();
    }

}
    public class ParametersNestedImpl<N> extends ParameterFluentImpl<TemplateFluent.ParametersNested<N>> implements TemplateFluent.ParametersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ParameterBuilder builder;
        private final int index;
    
            ParametersNestedImpl(int index,Parameter item){
                    this.index = index;
                    this.builder = new ParameterBuilder(this, item);
            }
            ParametersNestedImpl(){
                    this.index = -1;
                    this.builder = new ParameterBuilder(this);
            }
    
    public N and(){
            return (N) TemplateFluentImpl.this.setToParameters(index, builder.build());
    }
    public N endParameter(){
            return and();
    }

}


}
