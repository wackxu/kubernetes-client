package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import java.util.ArrayList;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluentImpl;
import java.lang.String;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluentImpl;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluentImpl;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.openshift.api.model.BuildRequestFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.openshift.api.model.IdentityFluentImpl;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.openshift.api.model.BuildConfigFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.openshift.api.model.ImageSignatureBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.openshift.api.model.ImageSignatureFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluentImpl;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.List;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.openshift.api.model.RouteFluentImpl;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.openshift.api.model.ProjectRequestFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.openshift.api.model.ImageStreamImportFluentImpl;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.ImageFluentImpl;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.batch.JobFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.openshift.api.model.ProjectFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluentImpl;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluentImpl;
import io.fabric8.openshift.api.model.ImageBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.openshift.api.model.UserFluentImpl;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.openshift.api.model.Image;
import io.fabric8.openshift.api.model.ImageStreamBuilder;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.openshift.api.model.Identity;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluentImpl;
import io.fabric8.openshift.api.model.BuildBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.openshift.api.model.ProjectRequest;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluentImpl;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleFluentImpl;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.openshift.api.model.TemplateFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.kubernetes.api.model.rbac.RoleFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluentImpl;
import io.fabric8.openshift.api.model.ImageSignature;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluentImpl;
import io.fabric8.openshift.api.model.GroupFluentImpl;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.openshift.api.model.BuildConfigBuilder;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.openshift.api.model.BuildFluentImpl;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.openshift.api.model.OAuthClientFluentImpl;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.ImageStreamFluentImpl;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.openshift.api.model.NetNamespaceFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;

public class BaseKubernetesListFluentImpl<A extends BaseKubernetesListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BaseKubernetesListFluent<A>{

    private String apiVersion;
    private List<VisitableBuilder<? extends HasMetadata,?>> items;
    private String kind;
    private ListMetaBuilder metadata;

    public BaseKubernetesListFluentImpl(){
    }
    public BaseKubernetesListFluentImpl(BaseKubernetesList instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
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

    public A addToItems(VisitableBuilder<? extends HasMetadata,?> builder){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            _visitables.add(builder);this.items.add(builder); return (A)this;
    }

    public A addToItems(int index,VisitableBuilder<? extends HasMetadata,?> builder){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            _visitables.add(index, builder);this.items.add(index, builder); return (A)this;
    }

    public A addToItems(int index,HasMetadata item){
            if (item instanceof ValidatingWebhookConfiguration){addToValidatingWebhookConfigurationItems(index, (ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){addToStorageClassItems(index, (StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){addToClusterRoleBindingItems(index, (ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){addToOpenshiftRoleBindingItems(index, (OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){addToPodDisruptionBudgetItems(index, (PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){addToNetworkPolicyItems(index, (NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){addToOpenshiftClusterRoleBindingItems(index, (OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){addToRouteItems(index, (Route)item);}
 else if (item instanceof Namespace){addToNamespaceItems(index, (Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){addToLocalSubjectAccessReviewItems(index, (LocalSubjectAccessReview)item);}
 else if (item instanceof Service){addToServiceItems(index, (Service)item);}
 else if (item instanceof ReplicationController){addToReplicationControllerItems(index, (ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){addToSubjectAccessReviewItems(index, (SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){addToMutatingWebhookConfigurationItems(index, (MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){addToHorizontalPodAutoscalerItems(index, (HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){addToScaleItems(index, (Scale)item);}
 else if (item instanceof Image){addToImageItems(index, (Image)item);}
 else if (item instanceof ReplicaSet){addToReplicaSetItems(index, (ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){addToPodSecurityPolicyItems(index, (PodSecurityPolicy)item);}
 else if (item instanceof CronJob){addToCronJobItems(index, (CronJob)item);}
 else if (item instanceof Endpoints){addToEndpointsItems(index, (Endpoints)item);}
 else if (item instanceof Pod){addToPodItems(index, (Pod)item);}
 else if (item instanceof ConfigMap){addToConfigMapItems(index, (ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){addToCustomResourceDefinitionItems(index, (CustomResourceDefinition)item);}
 else if (item instanceof Build){addToBuildItems(index, (Build)item);}
 else if (item instanceof ImageStreamTag){addToImageStreamTagItems(index, (ImageStreamTag)item);}
 else if (item instanceof Group){addToGroupItems(index, (Group)item);}
 else if (item instanceof ImageSignature){addToImageSignatureItems(index, (ImageSignature)item);}
 else if (item instanceof ResourceQuota){addToResourceQuotaItems(index, (ResourceQuota)item);}
 else if (item instanceof BuildRequest){addToBuildRequestItems(index, (BuildRequest)item);}
 else if (item instanceof DaemonSet){addToDaemonSetItems(index, (DaemonSet)item);}
 else if (item instanceof ImageStream){addToImageStreamItems(index, (ImageStream)item);}
 else if (item instanceof OpenshiftRole){addToOpenshiftRoleItems(index, (OpenshiftRole)item);}
 else if (item instanceof OAuthClient){addToOAuthClientItems(index, (OAuthClient)item);}
 else if (item instanceof Identity){addToIdentityItems(index, (Identity)item);}
 else if (item instanceof LimitRange){addToLimitRangeItems(index, (LimitRange)item);}
 else if (item instanceof ImageStreamImport){addToImageStreamImportItems(index, (ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){addToOpenshiftRoleBindingRestrictionItems(index, (OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){addToRoleBindingItems(index, (RoleBinding)item);}
 else if (item instanceof PodPreset){addToPodPresetItems(index, (PodPreset)item);}
 else if (item instanceof Project){addToProjectItems(index, (Project)item);}
 else if (item instanceof BuildConfig){addToBuildConfigItems(index, (BuildConfig)item);}
 else if (item instanceof ClusterRole){addToClusterRoleItems(index, (ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){addToOAuthAuthorizeTokenItems(index, (OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){addToProjectRequestItems(index, (ProjectRequest)item);}
 else if (item instanceof PriorityClass){addToPriorityClassItems(index, (PriorityClass)item);}
 else if (item instanceof Template){addToTemplateItems(index, (Template)item);}
 else if (item instanceof OAuthClientAuthorization){addToOAuthClientAuthorizationItems(index, (OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){addToDeploymentItems(index, (Deployment)item);}
 else if (item instanceof PodTemplate){addToPodTemplateItems(index, (PodTemplate)item);}
 else if (item instanceof Event){addToEventItems(index, (Event)item);}
 else if (item instanceof Ingress){addToIngressItems(index, (Ingress)item);}
 else if (item instanceof DeploymentConfig){addToDeploymentConfigItems(index, (DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){addToOAuthAccessTokenItems(index, (OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){addToPersistentVolumeItems(index, (PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){addToPersistentVolumeClaimItems(index, (PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){addToEventItems(index, (io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){addToStatefulSetItems(index, (StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){addToOpenshiftClusterRoleItems(index, (OpenshiftClusterRole)item);}
 else if (item instanceof Role){addToRoleItems(index, (Role)item);}
 else if (item instanceof User){addToUserItems(index, (User)item);}
 else if (item instanceof ComponentStatus){addToComponentStatusItems(index, (ComponentStatus)item);}
 else if (item instanceof TokenReview){addToTokenReviewItems(index, (TokenReview)item);}
 else if (item instanceof Binding){addToBindingItems(index, (Binding)item);}
 else if (item instanceof Secret){addToSecretItems(index, (Secret)item);}
 else if (item instanceof SecurityContextConstraints){addToSecurityContextConstraintsItems(index, (SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){addToNetNamespaceItems(index, (NetNamespace)item);}
 else if (item instanceof Node){addToNodeItems(index, (Node)item);}
 else if (item instanceof Job){addToJobItems(index, (Job)item);}
 else if (item instanceof CertificateSigningRequest){addToCertificateSigningRequestItems(index, (CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){addToServiceAccountItems(index, (ServiceAccount)item);}

            return (A)this;
    }

    public A setToItems(int index,HasMetadata item){
            if (item instanceof ValidatingWebhookConfiguration){setToValidatingWebhookConfigurationItems(index, (ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){setToStorageClassItems(index, (StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){setToClusterRoleBindingItems(index, (ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){setToOpenshiftRoleBindingItems(index, (OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){setToPodDisruptionBudgetItems(index, (PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){setToNetworkPolicyItems(index, (NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){setToOpenshiftClusterRoleBindingItems(index, (OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){setToRouteItems(index, (Route)item);}
 else if (item instanceof Namespace){setToNamespaceItems(index, (Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){setToLocalSubjectAccessReviewItems(index, (LocalSubjectAccessReview)item);}
 else if (item instanceof Service){setToServiceItems(index, (Service)item);}
 else if (item instanceof ReplicationController){setToReplicationControllerItems(index, (ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){setToSubjectAccessReviewItems(index, (SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){setToMutatingWebhookConfigurationItems(index, (MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){setToHorizontalPodAutoscalerItems(index, (HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){setToScaleItems(index, (Scale)item);}
 else if (item instanceof Image){setToImageItems(index, (Image)item);}
 else if (item instanceof ReplicaSet){setToReplicaSetItems(index, (ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){setToPodSecurityPolicyItems(index, (PodSecurityPolicy)item);}
 else if (item instanceof CronJob){setToCronJobItems(index, (CronJob)item);}
 else if (item instanceof Endpoints){setToEndpointsItems(index, (Endpoints)item);}
 else if (item instanceof Pod){setToPodItems(index, (Pod)item);}
 else if (item instanceof ConfigMap){setToConfigMapItems(index, (ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){setToCustomResourceDefinitionItems(index, (CustomResourceDefinition)item);}
 else if (item instanceof Build){setToBuildItems(index, (Build)item);}
 else if (item instanceof ImageStreamTag){setToImageStreamTagItems(index, (ImageStreamTag)item);}
 else if (item instanceof Group){setToGroupItems(index, (Group)item);}
 else if (item instanceof ImageSignature){setToImageSignatureItems(index, (ImageSignature)item);}
 else if (item instanceof ResourceQuota){setToResourceQuotaItems(index, (ResourceQuota)item);}
 else if (item instanceof BuildRequest){setToBuildRequestItems(index, (BuildRequest)item);}
 else if (item instanceof DaemonSet){setToDaemonSetItems(index, (DaemonSet)item);}
 else if (item instanceof ImageStream){setToImageStreamItems(index, (ImageStream)item);}
 else if (item instanceof OpenshiftRole){setToOpenshiftRoleItems(index, (OpenshiftRole)item);}
 else if (item instanceof OAuthClient){setToOAuthClientItems(index, (OAuthClient)item);}
 else if (item instanceof Identity){setToIdentityItems(index, (Identity)item);}
 else if (item instanceof LimitRange){setToLimitRangeItems(index, (LimitRange)item);}
 else if (item instanceof ImageStreamImport){setToImageStreamImportItems(index, (ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){setToOpenshiftRoleBindingRestrictionItems(index, (OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){setToRoleBindingItems(index, (RoleBinding)item);}
 else if (item instanceof PodPreset){setToPodPresetItems(index, (PodPreset)item);}
 else if (item instanceof Project){setToProjectItems(index, (Project)item);}
 else if (item instanceof BuildConfig){setToBuildConfigItems(index, (BuildConfig)item);}
 else if (item instanceof ClusterRole){setToClusterRoleItems(index, (ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){setToOAuthAuthorizeTokenItems(index, (OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){setToProjectRequestItems(index, (ProjectRequest)item);}
 else if (item instanceof PriorityClass){setToPriorityClassItems(index, (PriorityClass)item);}
 else if (item instanceof Template){setToTemplateItems(index, (Template)item);}
 else if (item instanceof OAuthClientAuthorization){setToOAuthClientAuthorizationItems(index, (OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){setToDeploymentItems(index, (Deployment)item);}
 else if (item instanceof PodTemplate){setToPodTemplateItems(index, (PodTemplate)item);}
 else if (item instanceof Event){setToEventItems(index, (Event)item);}
 else if (item instanceof Ingress){setToIngressItems(index, (Ingress)item);}
 else if (item instanceof DeploymentConfig){setToDeploymentConfigItems(index, (DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){setToOAuthAccessTokenItems(index, (OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){setToPersistentVolumeItems(index, (PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){setToPersistentVolumeClaimItems(index, (PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){setToEventItems(index, (io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){setToStatefulSetItems(index, (StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){setToOpenshiftClusterRoleItems(index, (OpenshiftClusterRole)item);}
 else if (item instanceof Role){setToRoleItems(index, (Role)item);}
 else if (item instanceof User){setToUserItems(index, (User)item);}
 else if (item instanceof ComponentStatus){setToComponentStatusItems(index, (ComponentStatus)item);}
 else if (item instanceof TokenReview){setToTokenReviewItems(index, (TokenReview)item);}
 else if (item instanceof Binding){setToBindingItems(index, (Binding)item);}
 else if (item instanceof Secret){setToSecretItems(index, (Secret)item);}
 else if (item instanceof SecurityContextConstraints){setToSecurityContextConstraintsItems(index, (SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){setToNetNamespaceItems(index, (NetNamespace)item);}
 else if (item instanceof Node){setToNodeItems(index, (Node)item);}
 else if (item instanceof Job){setToJobItems(index, (Job)item);}
 else if (item instanceof CertificateSigningRequest){setToCertificateSigningRequestItems(index, (CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){setToServiceAccountItems(index, (ServiceAccount)item);}

            return (A)this;
    }

    public A addToItems(HasMetadata... items){
             if (items != null && items.length > 0 && this.items== null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HasMetadata item : items) { 
            if (item instanceof ValidatingWebhookConfiguration){addToValidatingWebhookConfigurationItems((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){addToStorageClassItems((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){addToClusterRoleBindingItems((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){addToOpenshiftRoleBindingItems((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){addToPodDisruptionBudgetItems((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){addToNetworkPolicyItems((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){addToOpenshiftClusterRoleBindingItems((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){addToRouteItems((Route)item);}
 else if (item instanceof Namespace){addToNamespaceItems((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){addToLocalSubjectAccessReviewItems((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){addToServiceItems((Service)item);}
 else if (item instanceof ReplicationController){addToReplicationControllerItems((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){addToSubjectAccessReviewItems((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){addToMutatingWebhookConfigurationItems((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){addToHorizontalPodAutoscalerItems((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){addToScaleItems((Scale)item);}
 else if (item instanceof Image){addToImageItems((Image)item);}
 else if (item instanceof ReplicaSet){addToReplicaSetItems((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){addToPodSecurityPolicyItems((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){addToCronJobItems((CronJob)item);}
 else if (item instanceof Endpoints){addToEndpointsItems((Endpoints)item);}
 else if (item instanceof Pod){addToPodItems((Pod)item);}
 else if (item instanceof ConfigMap){addToConfigMapItems((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){addToCustomResourceDefinitionItems((CustomResourceDefinition)item);}
 else if (item instanceof Build){addToBuildItems((Build)item);}
 else if (item instanceof ImageStreamTag){addToImageStreamTagItems((ImageStreamTag)item);}
 else if (item instanceof Group){addToGroupItems((Group)item);}
 else if (item instanceof ImageSignature){addToImageSignatureItems((ImageSignature)item);}
 else if (item instanceof ResourceQuota){addToResourceQuotaItems((ResourceQuota)item);}
 else if (item instanceof BuildRequest){addToBuildRequestItems((BuildRequest)item);}
 else if (item instanceof DaemonSet){addToDaemonSetItems((DaemonSet)item);}
 else if (item instanceof ImageStream){addToImageStreamItems((ImageStream)item);}
 else if (item instanceof OpenshiftRole){addToOpenshiftRoleItems((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){addToOAuthClientItems((OAuthClient)item);}
 else if (item instanceof Identity){addToIdentityItems((Identity)item);}
 else if (item instanceof LimitRange){addToLimitRangeItems((LimitRange)item);}
 else if (item instanceof ImageStreamImport){addToImageStreamImportItems((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){addToOpenshiftRoleBindingRestrictionItems((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){addToRoleBindingItems((RoleBinding)item);}
 else if (item instanceof PodPreset){addToPodPresetItems((PodPreset)item);}
 else if (item instanceof Project){addToProjectItems((Project)item);}
 else if (item instanceof BuildConfig){addToBuildConfigItems((BuildConfig)item);}
 else if (item instanceof ClusterRole){addToClusterRoleItems((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){addToOAuthAuthorizeTokenItems((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){addToProjectRequestItems((ProjectRequest)item);}
 else if (item instanceof PriorityClass){addToPriorityClassItems((PriorityClass)item);}
 else if (item instanceof Template){addToTemplateItems((Template)item);}
 else if (item instanceof OAuthClientAuthorization){addToOAuthClientAuthorizationItems((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){addToDeploymentItems((Deployment)item);}
 else if (item instanceof PodTemplate){addToPodTemplateItems((PodTemplate)item);}
 else if (item instanceof Event){addToEventItems((Event)item);}
 else if (item instanceof Ingress){addToIngressItems((Ingress)item);}
 else if (item instanceof DeploymentConfig){addToDeploymentConfigItems((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){addToOAuthAccessTokenItems((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){addToPersistentVolumeItems((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){addToPersistentVolumeClaimItems((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){addToEventItems((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){addToStatefulSetItems((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){addToOpenshiftClusterRoleItems((OpenshiftClusterRole)item);}
 else if (item instanceof Role){addToRoleItems((Role)item);}
 else if (item instanceof User){addToUserItems((User)item);}
 else if (item instanceof ComponentStatus){addToComponentStatusItems((ComponentStatus)item);}
 else if (item instanceof TokenReview){addToTokenReviewItems((TokenReview)item);}
 else if (item instanceof Binding){addToBindingItems((Binding)item);}
 else if (item instanceof Secret){addToSecretItems((Secret)item);}
 else if (item instanceof SecurityContextConstraints){addToSecurityContextConstraintsItems((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){addToNetNamespaceItems((NetNamespace)item);}
 else if (item instanceof Node){addToNodeItems((Node)item);}
 else if (item instanceof Job){addToJobItems((Job)item);}
 else if (item instanceof CertificateSigningRequest){addToCertificateSigningRequestItems((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){addToServiceAccountItems((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.add(builder);this.items.add(builder); }
            } return (A)this;
    }

    public A addAllToItems(Collection<HasMetadata> items){
             if (items != null && items.size() > 0 && this.items== null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HasMetadata item : items) { 
            if (item instanceof ValidatingWebhookConfiguration){addToValidatingWebhookConfigurationItems((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){addToStorageClassItems((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){addToClusterRoleBindingItems((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){addToOpenshiftRoleBindingItems((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){addToPodDisruptionBudgetItems((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){addToNetworkPolicyItems((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){addToOpenshiftClusterRoleBindingItems((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){addToRouteItems((Route)item);}
 else if (item instanceof Namespace){addToNamespaceItems((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){addToLocalSubjectAccessReviewItems((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){addToServiceItems((Service)item);}
 else if (item instanceof ReplicationController){addToReplicationControllerItems((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){addToSubjectAccessReviewItems((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){addToMutatingWebhookConfigurationItems((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){addToHorizontalPodAutoscalerItems((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){addToScaleItems((Scale)item);}
 else if (item instanceof Image){addToImageItems((Image)item);}
 else if (item instanceof ReplicaSet){addToReplicaSetItems((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){addToPodSecurityPolicyItems((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){addToCronJobItems((CronJob)item);}
 else if (item instanceof Endpoints){addToEndpointsItems((Endpoints)item);}
 else if (item instanceof Pod){addToPodItems((Pod)item);}
 else if (item instanceof ConfigMap){addToConfigMapItems((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){addToCustomResourceDefinitionItems((CustomResourceDefinition)item);}
 else if (item instanceof Build){addToBuildItems((Build)item);}
 else if (item instanceof ImageStreamTag){addToImageStreamTagItems((ImageStreamTag)item);}
 else if (item instanceof Group){addToGroupItems((Group)item);}
 else if (item instanceof ImageSignature){addToImageSignatureItems((ImageSignature)item);}
 else if (item instanceof ResourceQuota){addToResourceQuotaItems((ResourceQuota)item);}
 else if (item instanceof BuildRequest){addToBuildRequestItems((BuildRequest)item);}
 else if (item instanceof DaemonSet){addToDaemonSetItems((DaemonSet)item);}
 else if (item instanceof ImageStream){addToImageStreamItems((ImageStream)item);}
 else if (item instanceof OpenshiftRole){addToOpenshiftRoleItems((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){addToOAuthClientItems((OAuthClient)item);}
 else if (item instanceof Identity){addToIdentityItems((Identity)item);}
 else if (item instanceof LimitRange){addToLimitRangeItems((LimitRange)item);}
 else if (item instanceof ImageStreamImport){addToImageStreamImportItems((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){addToOpenshiftRoleBindingRestrictionItems((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){addToRoleBindingItems((RoleBinding)item);}
 else if (item instanceof PodPreset){addToPodPresetItems((PodPreset)item);}
 else if (item instanceof Project){addToProjectItems((Project)item);}
 else if (item instanceof BuildConfig){addToBuildConfigItems((BuildConfig)item);}
 else if (item instanceof ClusterRole){addToClusterRoleItems((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){addToOAuthAuthorizeTokenItems((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){addToProjectRequestItems((ProjectRequest)item);}
 else if (item instanceof PriorityClass){addToPriorityClassItems((PriorityClass)item);}
 else if (item instanceof Template){addToTemplateItems((Template)item);}
 else if (item instanceof OAuthClientAuthorization){addToOAuthClientAuthorizationItems((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){addToDeploymentItems((Deployment)item);}
 else if (item instanceof PodTemplate){addToPodTemplateItems((PodTemplate)item);}
 else if (item instanceof Event){addToEventItems((Event)item);}
 else if (item instanceof Ingress){addToIngressItems((Ingress)item);}
 else if (item instanceof DeploymentConfig){addToDeploymentConfigItems((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){addToOAuthAccessTokenItems((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){addToPersistentVolumeItems((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){addToPersistentVolumeClaimItems((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){addToEventItems((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){addToStatefulSetItems((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){addToOpenshiftClusterRoleItems((OpenshiftClusterRole)item);}
 else if (item instanceof Role){addToRoleItems((Role)item);}
 else if (item instanceof User){addToUserItems((User)item);}
 else if (item instanceof ComponentStatus){addToComponentStatusItems((ComponentStatus)item);}
 else if (item instanceof TokenReview){addToTokenReviewItems((TokenReview)item);}
 else if (item instanceof Binding){addToBindingItems((Binding)item);}
 else if (item instanceof Secret){addToSecretItems((Secret)item);}
 else if (item instanceof SecurityContextConstraints){addToSecurityContextConstraintsItems((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){addToNetNamespaceItems((NetNamespace)item);}
 else if (item instanceof Node){addToNodeItems((Node)item);}
 else if (item instanceof Job){addToJobItems((Job)item);}
 else if (item instanceof CertificateSigningRequest){addToCertificateSigningRequestItems((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){addToServiceAccountItems((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.add(builder);this.items.add(builder); }
            } return (A)this;
    }

    public A removeFromItems(VisitableBuilder<? extends HasMetadata,?> builder){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            _visitables.remove(builder);this.items.remove(builder); return (A)this;
    }

    public A removeFromItems(HasMetadata... items){
            for (HasMetadata item : items) {if (item instanceof ValidatingWebhookConfiguration){removeFromValidatingWebhookConfigurationItems((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){removeFromStorageClassItems((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){removeFromClusterRoleBindingItems((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){removeFromOpenshiftRoleBindingItems((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){removeFromPodDisruptionBudgetItems((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){removeFromNetworkPolicyItems((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){removeFromOpenshiftClusterRoleBindingItems((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){removeFromRouteItems((Route)item);}
 else if (item instanceof Namespace){removeFromNamespaceItems((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){removeFromLocalSubjectAccessReviewItems((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){removeFromServiceItems((Service)item);}
 else if (item instanceof ReplicationController){removeFromReplicationControllerItems((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){removeFromSubjectAccessReviewItems((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){removeFromMutatingWebhookConfigurationItems((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){removeFromHorizontalPodAutoscalerItems((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){removeFromScaleItems((Scale)item);}
 else if (item instanceof Image){removeFromImageItems((Image)item);}
 else if (item instanceof ReplicaSet){removeFromReplicaSetItems((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){removeFromPodSecurityPolicyItems((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){removeFromCronJobItems((CronJob)item);}
 else if (item instanceof Endpoints){removeFromEndpointsItems((Endpoints)item);}
 else if (item instanceof Pod){removeFromPodItems((Pod)item);}
 else if (item instanceof ConfigMap){removeFromConfigMapItems((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){removeFromCustomResourceDefinitionItems((CustomResourceDefinition)item);}
 else if (item instanceof Build){removeFromBuildItems((Build)item);}
 else if (item instanceof ImageStreamTag){removeFromImageStreamTagItems((ImageStreamTag)item);}
 else if (item instanceof Group){removeFromGroupItems((Group)item);}
 else if (item instanceof ImageSignature){removeFromImageSignatureItems((ImageSignature)item);}
 else if (item instanceof ResourceQuota){removeFromResourceQuotaItems((ResourceQuota)item);}
 else if (item instanceof BuildRequest){removeFromBuildRequestItems((BuildRequest)item);}
 else if (item instanceof DaemonSet){removeFromDaemonSetItems((DaemonSet)item);}
 else if (item instanceof ImageStream){removeFromImageStreamItems((ImageStream)item);}
 else if (item instanceof OpenshiftRole){removeFromOpenshiftRoleItems((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){removeFromOAuthClientItems((OAuthClient)item);}
 else if (item instanceof Identity){removeFromIdentityItems((Identity)item);}
 else if (item instanceof LimitRange){removeFromLimitRangeItems((LimitRange)item);}
 else if (item instanceof ImageStreamImport){removeFromImageStreamImportItems((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){removeFromOpenshiftRoleBindingRestrictionItems((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){removeFromRoleBindingItems((RoleBinding)item);}
 else if (item instanceof PodPreset){removeFromPodPresetItems((PodPreset)item);}
 else if (item instanceof Project){removeFromProjectItems((Project)item);}
 else if (item instanceof BuildConfig){removeFromBuildConfigItems((BuildConfig)item);}
 else if (item instanceof ClusterRole){removeFromClusterRoleItems((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){removeFromOAuthAuthorizeTokenItems((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){removeFromProjectRequestItems((ProjectRequest)item);}
 else if (item instanceof PriorityClass){removeFromPriorityClassItems((PriorityClass)item);}
 else if (item instanceof Template){removeFromTemplateItems((Template)item);}
 else if (item instanceof OAuthClientAuthorization){removeFromOAuthClientAuthorizationItems((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){removeFromDeploymentItems((Deployment)item);}
 else if (item instanceof PodTemplate){removeFromPodTemplateItems((PodTemplate)item);}
 else if (item instanceof Event){removeFromEventItems((Event)item);}
 else if (item instanceof Ingress){removeFromIngressItems((Ingress)item);}
 else if (item instanceof DeploymentConfig){removeFromDeploymentConfigItems((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){removeFromOAuthAccessTokenItems((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){removeFromPersistentVolumeItems((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){removeFromPersistentVolumeClaimItems((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){removeFromEventItems((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){removeFromStatefulSetItems((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){removeFromOpenshiftClusterRoleItems((OpenshiftClusterRole)item);}
 else if (item instanceof Role){removeFromRoleItems((Role)item);}
 else if (item instanceof User){removeFromUserItems((User)item);}
 else if (item instanceof ComponentStatus){removeFromComponentStatusItems((ComponentStatus)item);}
 else if (item instanceof TokenReview){removeFromTokenReviewItems((TokenReview)item);}
 else if (item instanceof Binding){removeFromBindingItems((Binding)item);}
 else if (item instanceof Secret){removeFromSecretItems((Secret)item);}
 else if (item instanceof SecurityContextConstraints){removeFromSecurityContextConstraintsItems((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){removeFromNetNamespaceItems((NetNamespace)item);}
 else if (item instanceof Node){removeFromNodeItems((Node)item);}
 else if (item instanceof Job){removeFromJobItems((Job)item);}
 else if (item instanceof CertificateSigningRequest){removeFromCertificateSigningRequestItems((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){removeFromServiceAccountItems((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.remove(builder);this.items.remove(builder); }
            } return (A)this;
    }

    public A removeAllFromItems(Collection<HasMetadata> items){
            for (HasMetadata item : items) {if (item instanceof ValidatingWebhookConfiguration){removeFromValidatingWebhookConfigurationItems((ValidatingWebhookConfiguration)item);}
 else if (item instanceof StorageClass){removeFromStorageClassItems((StorageClass)item);}
 else if (item instanceof ClusterRoleBinding){removeFromClusterRoleBindingItems((ClusterRoleBinding)item);}
 else if (item instanceof OpenshiftRoleBinding){removeFromOpenshiftRoleBindingItems((OpenshiftRoleBinding)item);}
 else if (item instanceof PodDisruptionBudget){removeFromPodDisruptionBudgetItems((PodDisruptionBudget)item);}
 else if (item instanceof NetworkPolicy){removeFromNetworkPolicyItems((NetworkPolicy)item);}
 else if (item instanceof OpenshiftClusterRoleBinding){removeFromOpenshiftClusterRoleBindingItems((OpenshiftClusterRoleBinding)item);}
 else if (item instanceof Route){removeFromRouteItems((Route)item);}
 else if (item instanceof Namespace){removeFromNamespaceItems((Namespace)item);}
 else if (item instanceof LocalSubjectAccessReview){removeFromLocalSubjectAccessReviewItems((LocalSubjectAccessReview)item);}
 else if (item instanceof Service){removeFromServiceItems((Service)item);}
 else if (item instanceof ReplicationController){removeFromReplicationControllerItems((ReplicationController)item);}
 else if (item instanceof SubjectAccessReview){removeFromSubjectAccessReviewItems((SubjectAccessReview)item);}
 else if (item instanceof MutatingWebhookConfiguration){removeFromMutatingWebhookConfigurationItems((MutatingWebhookConfiguration)item);}
 else if (item instanceof HorizontalPodAutoscaler){removeFromHorizontalPodAutoscalerItems((HorizontalPodAutoscaler)item);}
 else if (item instanceof Scale){removeFromScaleItems((Scale)item);}
 else if (item instanceof Image){removeFromImageItems((Image)item);}
 else if (item instanceof ReplicaSet){removeFromReplicaSetItems((ReplicaSet)item);}
 else if (item instanceof PodSecurityPolicy){removeFromPodSecurityPolicyItems((PodSecurityPolicy)item);}
 else if (item instanceof CronJob){removeFromCronJobItems((CronJob)item);}
 else if (item instanceof Endpoints){removeFromEndpointsItems((Endpoints)item);}
 else if (item instanceof Pod){removeFromPodItems((Pod)item);}
 else if (item instanceof ConfigMap){removeFromConfigMapItems((ConfigMap)item);}
 else if (item instanceof CustomResourceDefinition){removeFromCustomResourceDefinitionItems((CustomResourceDefinition)item);}
 else if (item instanceof Build){removeFromBuildItems((Build)item);}
 else if (item instanceof ImageStreamTag){removeFromImageStreamTagItems((ImageStreamTag)item);}
 else if (item instanceof Group){removeFromGroupItems((Group)item);}
 else if (item instanceof ImageSignature){removeFromImageSignatureItems((ImageSignature)item);}
 else if (item instanceof ResourceQuota){removeFromResourceQuotaItems((ResourceQuota)item);}
 else if (item instanceof BuildRequest){removeFromBuildRequestItems((BuildRequest)item);}
 else if (item instanceof DaemonSet){removeFromDaemonSetItems((DaemonSet)item);}
 else if (item instanceof ImageStream){removeFromImageStreamItems((ImageStream)item);}
 else if (item instanceof OpenshiftRole){removeFromOpenshiftRoleItems((OpenshiftRole)item);}
 else if (item instanceof OAuthClient){removeFromOAuthClientItems((OAuthClient)item);}
 else if (item instanceof Identity){removeFromIdentityItems((Identity)item);}
 else if (item instanceof LimitRange){removeFromLimitRangeItems((LimitRange)item);}
 else if (item instanceof ImageStreamImport){removeFromImageStreamImportItems((ImageStreamImport)item);}
 else if (item instanceof OpenshiftRoleBindingRestriction){removeFromOpenshiftRoleBindingRestrictionItems((OpenshiftRoleBindingRestriction)item);}
 else if (item instanceof RoleBinding){removeFromRoleBindingItems((RoleBinding)item);}
 else if (item instanceof PodPreset){removeFromPodPresetItems((PodPreset)item);}
 else if (item instanceof Project){removeFromProjectItems((Project)item);}
 else if (item instanceof BuildConfig){removeFromBuildConfigItems((BuildConfig)item);}
 else if (item instanceof ClusterRole){removeFromClusterRoleItems((ClusterRole)item);}
 else if (item instanceof OAuthAuthorizeToken){removeFromOAuthAuthorizeTokenItems((OAuthAuthorizeToken)item);}
 else if (item instanceof ProjectRequest){removeFromProjectRequestItems((ProjectRequest)item);}
 else if (item instanceof PriorityClass){removeFromPriorityClassItems((PriorityClass)item);}
 else if (item instanceof Template){removeFromTemplateItems((Template)item);}
 else if (item instanceof OAuthClientAuthorization){removeFromOAuthClientAuthorizationItems((OAuthClientAuthorization)item);}
 else if (item instanceof Deployment){removeFromDeploymentItems((Deployment)item);}
 else if (item instanceof PodTemplate){removeFromPodTemplateItems((PodTemplate)item);}
 else if (item instanceof Event){removeFromEventItems((Event)item);}
 else if (item instanceof Ingress){removeFromIngressItems((Ingress)item);}
 else if (item instanceof DeploymentConfig){removeFromDeploymentConfigItems((DeploymentConfig)item);}
 else if (item instanceof OAuthAccessToken){removeFromOAuthAccessTokenItems((OAuthAccessToken)item);}
 else if (item instanceof PersistentVolume){removeFromPersistentVolumeItems((PersistentVolume)item);}
 else if (item instanceof PersistentVolumeClaim){removeFromPersistentVolumeClaimItems((PersistentVolumeClaim)item);}
 else if (item instanceof io.fabric8.kubernetes.api.model.events.Event){removeFromEventItems((io.fabric8.kubernetes.api.model.events.Event)item);}
 else if (item instanceof StatefulSet){removeFromStatefulSetItems((StatefulSet)item);}
 else if (item instanceof OpenshiftClusterRole){removeFromOpenshiftClusterRoleItems((OpenshiftClusterRole)item);}
 else if (item instanceof Role){removeFromRoleItems((Role)item);}
 else if (item instanceof User){removeFromUserItems((User)item);}
 else if (item instanceof ComponentStatus){removeFromComponentStatusItems((ComponentStatus)item);}
 else if (item instanceof TokenReview){removeFromTokenReviewItems((TokenReview)item);}
 else if (item instanceof Binding){removeFromBindingItems((Binding)item);}
 else if (item instanceof Secret){removeFromSecretItems((Secret)item);}
 else if (item instanceof SecurityContextConstraints){removeFromSecurityContextConstraintsItems((SecurityContextConstraints)item);}
 else if (item instanceof NetNamespace){removeFromNetNamespaceItems((NetNamespace)item);}
 else if (item instanceof Node){removeFromNodeItems((Node)item);}
 else if (item instanceof Job){removeFromJobItems((Job)item);}
 else if (item instanceof CertificateSigningRequest){removeFromCertificateSigningRequestItems((CertificateSigningRequest)item);}
 else if (item instanceof ServiceAccount){removeFromServiceAccountItems((ServiceAccount)item);}

            else {  VisitableBuilder<? extends HasMetadata,?> builder = builderOf(item); _visitables.remove(builder);this.items.remove(builder); }
            } return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<HasMetadata> getItems(){
            return build(items);
    }

    public List<HasMetadata> buildItems(){
            return build(items);
    }

    public HasMetadata buildItem(int index){
            return this.items.get(index).build();
    }

    public HasMetadata buildFirstItem(){
            return this.items.get(0).build();
    }

    public HasMetadata buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public HasMetadata buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<VisitableBuilder<? extends HasMetadata,?>> predicate){
            for (VisitableBuilder<? extends HasMetadata,?> item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<HasMetadata> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>(); for (HasMetadata item : items){this.addToItems(item);}} else { this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();} return (A) this;
    }

    public A withItems(HasMetadata... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (HasMetadata item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public A addToValidatingWebhookConfigurationItems(int index,ValidatingWebhookConfiguration item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToValidatingWebhookConfigurationItems(int index,ValidatingWebhookConfiguration item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToValidatingWebhookConfigurationItems(ValidatingWebhookConfiguration... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToValidatingWebhookConfigurationItems(Collection<ValidatingWebhookConfiguration> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromValidatingWebhookConfigurationItems(ValidatingWebhookConfiguration... items){
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromValidatingWebhookConfigurationItems(Collection<ValidatingWebhookConfiguration> items){
            for (ValidatingWebhookConfiguration item : items) {ValidatingWebhookConfigurationBuilder builder = new ValidatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<A> addNewValidatingWebhookConfigurationItem(){
            return new ValidatingWebhookConfigurationItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<A> addNewValidatingWebhookConfigurationItemLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<A> setNewValidatingWebhookConfigurationItemLike(int index,ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationItemsNestedImpl(index, item);
    }

    public A addToStorageClassItems(int index,StorageClass item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToStorageClassItems(int index,StorageClass item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StorageClassBuilder builder = new StorageClassBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToStorageClassItems(StorageClass... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToStorageClassItems(Collection<StorageClass> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromStorageClassItems(StorageClass... items){
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromStorageClassItems(Collection<StorageClass> items){
            for (StorageClass item : items) {StorageClassBuilder builder = new StorageClassBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.StorageClassItemsNested<A> addNewStorageClassItem(){
            return new StorageClassItemsNestedImpl();
    }

    public BaseKubernetesListFluent.StorageClassItemsNested<A> addNewStorageClassItemLike(StorageClass item){
            return new StorageClassItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.StorageClassItemsNested<A> setNewStorageClassItemLike(int index,StorageClass item){
            return new StorageClassItemsNestedImpl(index, item);
    }

    public A addToClusterRoleBindingItems(int index,ClusterRoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToClusterRoleBindingItems(int index,ClusterRoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToClusterRoleBindingItems(ClusterRoleBinding... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToClusterRoleBindingItems(Collection<ClusterRoleBinding> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromClusterRoleBindingItems(ClusterRoleBinding... items){
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromClusterRoleBindingItems(Collection<ClusterRoleBinding> items){
            for (ClusterRoleBinding item : items) {ClusterRoleBindingBuilder builder = new ClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ClusterRoleBindingItemsNested<A> addNewClusterRoleBindingItem(){
            return new ClusterRoleBindingItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ClusterRoleBindingItemsNested<A> addNewClusterRoleBindingItemLike(ClusterRoleBinding item){
            return new ClusterRoleBindingItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ClusterRoleBindingItemsNested<A> setNewClusterRoleBindingItemLike(int index,ClusterRoleBinding item){
            return new ClusterRoleBindingItemsNestedImpl(index, item);
    }

    public A addToOpenshiftRoleBindingItems(int index,OpenshiftRoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOpenshiftRoleBindingItems(int index,OpenshiftRoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftRoleBindingItems(OpenshiftRoleBinding... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftRoleBindingItems(Collection<OpenshiftRoleBinding> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftRoleBindingItems(OpenshiftRoleBinding... items){
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftRoleBindingItems(Collection<OpenshiftRoleBinding> items){
            for (OpenshiftRoleBinding item : items) {OpenshiftRoleBindingBuilder builder = new OpenshiftRoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<A> addNewOpenshiftRoleBindingItem(){
            return new OpenshiftRoleBindingItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<A> addNewOpenshiftRoleBindingItemLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<A> setNewOpenshiftRoleBindingItemLike(int index,OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingItemsNestedImpl(index, item);
    }

    public A addToPodDisruptionBudgetItems(int index,PodDisruptionBudget item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPodDisruptionBudgetItems(int index,PodDisruptionBudget item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPodDisruptionBudgetItems(PodDisruptionBudget... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPodDisruptionBudgetItems(Collection<PodDisruptionBudget> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPodDisruptionBudgetItems(PodDisruptionBudget... items){
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodDisruptionBudgetItems(Collection<PodDisruptionBudget> items){
            for (PodDisruptionBudget item : items) {PodDisruptionBudgetBuilder builder = new PodDisruptionBudgetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<A> addNewPodDisruptionBudgetItem(){
            return new PodDisruptionBudgetItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<A> addNewPodDisruptionBudgetItemLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<A> setNewPodDisruptionBudgetItemLike(int index,PodDisruptionBudget item){
            return new PodDisruptionBudgetItemsNestedImpl(index, item);
    }

    public A addToNetworkPolicyItems(int index,NetworkPolicy item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToNetworkPolicyItems(int index,NetworkPolicy item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToNetworkPolicyItems(NetworkPolicy... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToNetworkPolicyItems(Collection<NetworkPolicy> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromNetworkPolicyItems(NetworkPolicy... items){
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromNetworkPolicyItems(Collection<NetworkPolicy> items){
            for (NetworkPolicy item : items) {NetworkPolicyBuilder builder = new NetworkPolicyBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.NetworkPolicyItemsNested<A> addNewNetworkPolicyItem(){
            return new NetworkPolicyItemsNestedImpl();
    }

    public BaseKubernetesListFluent.NetworkPolicyItemsNested<A> addNewNetworkPolicyItemLike(NetworkPolicy item){
            return new NetworkPolicyItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.NetworkPolicyItemsNested<A> setNewNetworkPolicyItemLike(int index,NetworkPolicy item){
            return new NetworkPolicyItemsNestedImpl(index, item);
    }

    public A addToOpenshiftClusterRoleBindingItems(int index,OpenshiftClusterRoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOpenshiftClusterRoleBindingItems(int index,OpenshiftClusterRoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftClusterRoleBindingItems(OpenshiftClusterRoleBinding... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftClusterRoleBindingItems(Collection<OpenshiftClusterRoleBinding> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftClusterRoleBindingItems(OpenshiftClusterRoleBinding... items){
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftClusterRoleBindingItems(Collection<OpenshiftClusterRoleBinding> items){
            for (OpenshiftClusterRoleBinding item : items) {OpenshiftClusterRoleBindingBuilder builder = new OpenshiftClusterRoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<A> addNewOpenshiftClusterRoleBindingItem(){
            return new OpenshiftClusterRoleBindingItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<A> addNewOpenshiftClusterRoleBindingItemLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<A> setNewOpenshiftClusterRoleBindingItemLike(int index,OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingItemsNestedImpl(index, item);
    }

    public A addToRouteItems(int index,Route item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RouteBuilder builder = new RouteBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToRouteItems(int index,Route item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RouteBuilder builder = new RouteBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToRouteItems(Route... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToRouteItems(Collection<Route> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromRouteItems(Route... items){
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromRouteItems(Collection<Route> items){
            for (Route item : items) {RouteBuilder builder = new RouteBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.RouteItemsNested<A> addNewRouteItem(){
            return new RouteItemsNestedImpl();
    }

    public BaseKubernetesListFluent.RouteItemsNested<A> addNewRouteItemLike(Route item){
            return new RouteItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.RouteItemsNested<A> setNewRouteItemLike(int index,Route item){
            return new RouteItemsNestedImpl(index, item);
    }

    public A addToNamespaceItems(int index,Namespace item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToNamespaceItems(int index,Namespace item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NamespaceBuilder builder = new NamespaceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToNamespaceItems(Namespace... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToNamespaceItems(Collection<Namespace> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromNamespaceItems(Namespace... items){
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromNamespaceItems(Collection<Namespace> items){
            for (Namespace item : items) {NamespaceBuilder builder = new NamespaceBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.NamespaceItemsNested<A> addNewNamespaceItem(){
            return new NamespaceItemsNestedImpl();
    }

    public BaseKubernetesListFluent.NamespaceItemsNested<A> addNewNamespaceItemLike(Namespace item){
            return new NamespaceItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.NamespaceItemsNested<A> setNewNamespaceItemLike(int index,Namespace item){
            return new NamespaceItemsNestedImpl(index, item);
    }

    public A addToLocalSubjectAccessReviewItems(int index,LocalSubjectAccessReview item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToLocalSubjectAccessReviewItems(int index,LocalSubjectAccessReview item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToLocalSubjectAccessReviewItems(LocalSubjectAccessReview... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToLocalSubjectAccessReviewItems(Collection<LocalSubjectAccessReview> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromLocalSubjectAccessReviewItems(LocalSubjectAccessReview... items){
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromLocalSubjectAccessReviewItems(Collection<LocalSubjectAccessReview> items){
            for (LocalSubjectAccessReview item : items) {LocalSubjectAccessReviewBuilder builder = new LocalSubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<A> addNewLocalSubjectAccessReviewItem(){
            return new LocalSubjectAccessReviewItemsNestedImpl();
    }

    public BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<A> addNewLocalSubjectAccessReviewItemLike(LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<A> setNewLocalSubjectAccessReviewItemLike(int index,LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewItemsNestedImpl(index, item);
    }

    public A addToServiceItems(int index,Service item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceBuilder builder = new ServiceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToServiceItems(int index,Service item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceBuilder builder = new ServiceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToServiceItems(Service... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToServiceItems(Collection<Service> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromServiceItems(Service... items){
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromServiceItems(Collection<Service> items){
            for (Service item : items) {ServiceBuilder builder = new ServiceBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ServiceItemsNested<A> addNewServiceItem(){
            return new ServiceItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ServiceItemsNested<A> addNewServiceItemLike(Service item){
            return new ServiceItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ServiceItemsNested<A> setNewServiceItemLike(int index,Service item){
            return new ServiceItemsNestedImpl(index, item);
    }

    public A addToReplicationControllerItems(int index,ReplicationController item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToReplicationControllerItems(int index,ReplicationController item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToReplicationControllerItems(ReplicationController... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToReplicationControllerItems(Collection<ReplicationController> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromReplicationControllerItems(ReplicationController... items){
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromReplicationControllerItems(Collection<ReplicationController> items){
            for (ReplicationController item : items) {ReplicationControllerBuilder builder = new ReplicationControllerBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ReplicationControllerItemsNested<A> addNewReplicationControllerItem(){
            return new ReplicationControllerItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ReplicationControllerItemsNested<A> addNewReplicationControllerItemLike(ReplicationController item){
            return new ReplicationControllerItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ReplicationControllerItemsNested<A> setNewReplicationControllerItemLike(int index,ReplicationController item){
            return new ReplicationControllerItemsNestedImpl(index, item);
    }

    public A addToSubjectAccessReviewItems(int index,SubjectAccessReview item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToSubjectAccessReviewItems(int index,SubjectAccessReview item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToSubjectAccessReviewItems(SubjectAccessReview... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToSubjectAccessReviewItems(Collection<SubjectAccessReview> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromSubjectAccessReviewItems(SubjectAccessReview... items){
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubjectAccessReviewItems(Collection<SubjectAccessReview> items){
            for (SubjectAccessReview item : items) {SubjectAccessReviewBuilder builder = new SubjectAccessReviewBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.SubjectAccessReviewItemsNested<A> addNewSubjectAccessReviewItem(){
            return new SubjectAccessReviewItemsNestedImpl();
    }

    public BaseKubernetesListFluent.SubjectAccessReviewItemsNested<A> addNewSubjectAccessReviewItemLike(SubjectAccessReview item){
            return new SubjectAccessReviewItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.SubjectAccessReviewItemsNested<A> setNewSubjectAccessReviewItemLike(int index,SubjectAccessReview item){
            return new SubjectAccessReviewItemsNestedImpl(index, item);
    }

    public A addToMutatingWebhookConfigurationItems(int index,MutatingWebhookConfiguration item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToMutatingWebhookConfigurationItems(int index,MutatingWebhookConfiguration item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToMutatingWebhookConfigurationItems(MutatingWebhookConfiguration... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToMutatingWebhookConfigurationItems(Collection<MutatingWebhookConfiguration> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromMutatingWebhookConfigurationItems(MutatingWebhookConfiguration... items){
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromMutatingWebhookConfigurationItems(Collection<MutatingWebhookConfiguration> items){
            for (MutatingWebhookConfiguration item : items) {MutatingWebhookConfigurationBuilder builder = new MutatingWebhookConfigurationBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<A> addNewMutatingWebhookConfigurationItem(){
            return new MutatingWebhookConfigurationItemsNestedImpl();
    }

    public BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<A> addNewMutatingWebhookConfigurationItemLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<A> setNewMutatingWebhookConfigurationItemLike(int index,MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationItemsNestedImpl(index, item);
    }

    public A addToHorizontalPodAutoscalerItems(int index,HorizontalPodAutoscaler item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToHorizontalPodAutoscalerItems(int index,HorizontalPodAutoscaler item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToHorizontalPodAutoscalerItems(HorizontalPodAutoscaler... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToHorizontalPodAutoscalerItems(Collection<HorizontalPodAutoscaler> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromHorizontalPodAutoscalerItems(HorizontalPodAutoscaler... items){
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromHorizontalPodAutoscalerItems(Collection<HorizontalPodAutoscaler> items){
            for (HorizontalPodAutoscaler item : items) {HorizontalPodAutoscalerBuilder builder = new HorizontalPodAutoscalerBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<A> addNewHorizontalPodAutoscalerItem(){
            return new HorizontalPodAutoscalerItemsNestedImpl();
    }

    public BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<A> addNewHorizontalPodAutoscalerItemLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<A> setNewHorizontalPodAutoscalerItemLike(int index,HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerItemsNestedImpl(index, item);
    }

    public A addToScaleItems(int index,Scale item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ScaleBuilder builder = new ScaleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToScaleItems(int index,Scale item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ScaleBuilder builder = new ScaleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToScaleItems(Scale... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToScaleItems(Collection<Scale> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromScaleItems(Scale... items){
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromScaleItems(Collection<Scale> items){
            for (Scale item : items) {ScaleBuilder builder = new ScaleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ScaleItemsNested<A> addNewScaleItem(){
            return new ScaleItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ScaleItemsNested<A> addNewScaleItemLike(Scale item){
            return new ScaleItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ScaleItemsNested<A> setNewScaleItemLike(int index,Scale item){
            return new ScaleItemsNestedImpl(index, item);
    }

    public A addToImageItems(int index,Image item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageBuilder builder = new ImageBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToImageItems(int index,Image item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageBuilder builder = new ImageBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToImageItems(Image... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToImageItems(Collection<Image> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromImageItems(Image... items){
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageItems(Collection<Image> items){
            for (Image item : items) {ImageBuilder builder = new ImageBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ImageItemsNested<A> addNewImageItem(){
            return new ImageItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ImageItemsNested<A> addNewImageItemLike(Image item){
            return new ImageItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ImageItemsNested<A> setNewImageItemLike(int index,Image item){
            return new ImageItemsNestedImpl(index, item);
    }

    public A addToReplicaSetItems(int index,ReplicaSet item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToReplicaSetItems(int index,ReplicaSet item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ReplicaSetBuilder builder = new ReplicaSetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToReplicaSetItems(ReplicaSet... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToReplicaSetItems(Collection<ReplicaSet> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromReplicaSetItems(ReplicaSet... items){
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromReplicaSetItems(Collection<ReplicaSet> items){
            for (ReplicaSet item : items) {ReplicaSetBuilder builder = new ReplicaSetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ReplicaSetItemsNested<A> addNewReplicaSetItem(){
            return new ReplicaSetItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ReplicaSetItemsNested<A> addNewReplicaSetItemLike(ReplicaSet item){
            return new ReplicaSetItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ReplicaSetItemsNested<A> setNewReplicaSetItemLike(int index,ReplicaSet item){
            return new ReplicaSetItemsNestedImpl(index, item);
    }

    public A addToPodSecurityPolicyItems(int index,PodSecurityPolicy item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPodSecurityPolicyItems(int index,PodSecurityPolicy item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPodSecurityPolicyItems(PodSecurityPolicy... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPodSecurityPolicyItems(Collection<PodSecurityPolicy> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPodSecurityPolicyItems(PodSecurityPolicy... items){
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodSecurityPolicyItems(Collection<PodSecurityPolicy> items){
            for (PodSecurityPolicy item : items) {PodSecurityPolicyBuilder builder = new PodSecurityPolicyBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PodSecurityPolicyItemsNested<A> addNewPodSecurityPolicyItem(){
            return new PodSecurityPolicyItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PodSecurityPolicyItemsNested<A> addNewPodSecurityPolicyItemLike(PodSecurityPolicy item){
            return new PodSecurityPolicyItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PodSecurityPolicyItemsNested<A> setNewPodSecurityPolicyItemLike(int index,PodSecurityPolicy item){
            return new PodSecurityPolicyItemsNestedImpl(index, item);
    }

    public A addToCronJobItems(int index,CronJob item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToCronJobItems(int index,CronJob item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CronJobBuilder builder = new CronJobBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToCronJobItems(CronJob... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToCronJobItems(Collection<CronJob> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromCronJobItems(CronJob... items){
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromCronJobItems(Collection<CronJob> items){
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.CronJobItemsNested<A> addNewCronJobItem(){
            return new CronJobItemsNestedImpl();
    }

    public BaseKubernetesListFluent.CronJobItemsNested<A> addNewCronJobItemLike(CronJob item){
            return new CronJobItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.CronJobItemsNested<A> setNewCronJobItemLike(int index,CronJob item){
            return new CronJobItemsNestedImpl(index, item);
    }

    public A addToEndpointsItems(int index,Endpoints item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToEndpointsItems(int index,Endpoints item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EndpointsBuilder builder = new EndpointsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToEndpointsItems(Endpoints... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToEndpointsItems(Collection<Endpoints> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromEndpointsItems(Endpoints... items){
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromEndpointsItems(Collection<Endpoints> items){
            for (Endpoints item : items) {EndpointsBuilder builder = new EndpointsBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.EndpointsItemsNested<A> addNewEndpointsItem(){
            return new EndpointsItemsNestedImpl();
    }

    public BaseKubernetesListFluent.EndpointsItemsNested<A> addNewEndpointsItemLike(Endpoints item){
            return new EndpointsItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.EndpointsItemsNested<A> setNewEndpointsItemLike(int index,Endpoints item){
            return new EndpointsItemsNestedImpl(index, item);
    }

    public A addToPodItems(int index,Pod item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodBuilder builder = new PodBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPodItems(int index,Pod item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodBuilder builder = new PodBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPodItems(Pod... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPodItems(Collection<Pod> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPodItems(Pod... items){
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodItems(Collection<Pod> items){
            for (Pod item : items) {PodBuilder builder = new PodBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PodItemsNested<A> addNewPodItem(){
            return new PodItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PodItemsNested<A> addNewPodItemLike(Pod item){
            return new PodItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PodItemsNested<A> setNewPodItemLike(int index,Pod item){
            return new PodItemsNestedImpl(index, item);
    }

    public A addToConfigMapItems(int index,ConfigMap item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToConfigMapItems(int index,ConfigMap item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ConfigMapBuilder builder = new ConfigMapBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToConfigMapItems(ConfigMap... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToConfigMapItems(Collection<ConfigMap> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromConfigMapItems(ConfigMap... items){
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromConfigMapItems(Collection<ConfigMap> items){
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ConfigMapItemsNested<A> addNewConfigMapItem(){
            return new ConfigMapItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ConfigMapItemsNested<A> addNewConfigMapItemLike(ConfigMap item){
            return new ConfigMapItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ConfigMapItemsNested<A> setNewConfigMapItemLike(int index,ConfigMap item){
            return new ConfigMapItemsNestedImpl(index, item);
    }

    public A addToCustomResourceDefinitionItems(int index,CustomResourceDefinition item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToCustomResourceDefinitionItems(int index,CustomResourceDefinition item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToCustomResourceDefinitionItems(CustomResourceDefinition... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToCustomResourceDefinitionItems(Collection<CustomResourceDefinition> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromCustomResourceDefinitionItems(CustomResourceDefinition... items){
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromCustomResourceDefinitionItems(Collection<CustomResourceDefinition> items){
            for (CustomResourceDefinition item : items) {CustomResourceDefinitionBuilder builder = new CustomResourceDefinitionBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<A> addNewCustomResourceDefinitionItem(){
            return new CustomResourceDefinitionItemsNestedImpl();
    }

    public BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<A> addNewCustomResourceDefinitionItemLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<A> setNewCustomResourceDefinitionItemLike(int index,CustomResourceDefinition item){
            return new CustomResourceDefinitionItemsNestedImpl(index, item);
    }

    public A addToBuildItems(int index,Build item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildBuilder builder = new BuildBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToBuildItems(int index,Build item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildBuilder builder = new BuildBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToBuildItems(Build... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToBuildItems(Collection<Build> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromBuildItems(Build... items){
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildItems(Collection<Build> items){
            for (Build item : items) {BuildBuilder builder = new BuildBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.BuildItemsNested<A> addNewBuildItem(){
            return new BuildItemsNestedImpl();
    }

    public BaseKubernetesListFluent.BuildItemsNested<A> addNewBuildItemLike(Build item){
            return new BuildItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.BuildItemsNested<A> setNewBuildItemLike(int index,Build item){
            return new BuildItemsNestedImpl(index, item);
    }

    public A addToImageStreamTagItems(int index,ImageStreamTag item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToImageStreamTagItems(int index,ImageStreamTag item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToImageStreamTagItems(ImageStreamTag... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToImageStreamTagItems(Collection<ImageStreamTag> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromImageStreamTagItems(ImageStreamTag... items){
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageStreamTagItems(Collection<ImageStreamTag> items){
            for (ImageStreamTag item : items) {ImageStreamTagBuilder builder = new ImageStreamTagBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ImageStreamTagItemsNested<A> addNewImageStreamTagItem(){
            return new ImageStreamTagItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ImageStreamTagItemsNested<A> addNewImageStreamTagItemLike(ImageStreamTag item){
            return new ImageStreamTagItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ImageStreamTagItemsNested<A> setNewImageStreamTagItemLike(int index,ImageStreamTag item){
            return new ImageStreamTagItemsNestedImpl(index, item);
    }

    public A addToGroupItems(int index,Group item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            GroupBuilder builder = new GroupBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToGroupItems(int index,Group item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            GroupBuilder builder = new GroupBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToGroupItems(Group... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToGroupItems(Collection<Group> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromGroupItems(Group... items){
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromGroupItems(Collection<Group> items){
            for (Group item : items) {GroupBuilder builder = new GroupBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.GroupItemsNested<A> addNewGroupItem(){
            return new GroupItemsNestedImpl();
    }

    public BaseKubernetesListFluent.GroupItemsNested<A> addNewGroupItemLike(Group item){
            return new GroupItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.GroupItemsNested<A> setNewGroupItemLike(int index,Group item){
            return new GroupItemsNestedImpl(index, item);
    }

    public A addToImageSignatureItems(int index,ImageSignature item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToImageSignatureItems(int index,ImageSignature item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageSignatureBuilder builder = new ImageSignatureBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToImageSignatureItems(ImageSignature... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToImageSignatureItems(Collection<ImageSignature> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromImageSignatureItems(ImageSignature... items){
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageSignatureItems(Collection<ImageSignature> items){
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ImageSignatureItemsNested<A> addNewImageSignatureItem(){
            return new ImageSignatureItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ImageSignatureItemsNested<A> addNewImageSignatureItemLike(ImageSignature item){
            return new ImageSignatureItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ImageSignatureItemsNested<A> setNewImageSignatureItemLike(int index,ImageSignature item){
            return new ImageSignatureItemsNestedImpl(index, item);
    }

    public A addToResourceQuotaItems(int index,ResourceQuota item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToResourceQuotaItems(int index,ResourceQuota item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToResourceQuotaItems(ResourceQuota... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToResourceQuotaItems(Collection<ResourceQuota> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromResourceQuotaItems(ResourceQuota... items){
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromResourceQuotaItems(Collection<ResourceQuota> items){
            for (ResourceQuota item : items) {ResourceQuotaBuilder builder = new ResourceQuotaBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ResourceQuotaItemsNested<A> addNewResourceQuotaItem(){
            return new ResourceQuotaItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ResourceQuotaItemsNested<A> addNewResourceQuotaItemLike(ResourceQuota item){
            return new ResourceQuotaItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ResourceQuotaItemsNested<A> setNewResourceQuotaItemLike(int index,ResourceQuota item){
            return new ResourceQuotaItemsNestedImpl(index, item);
    }

    public A addToBuildRequestItems(int index,BuildRequest item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToBuildRequestItems(int index,BuildRequest item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildRequestBuilder builder = new BuildRequestBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToBuildRequestItems(BuildRequest... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToBuildRequestItems(Collection<BuildRequest> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromBuildRequestItems(BuildRequest... items){
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildRequestItems(Collection<BuildRequest> items){
            for (BuildRequest item : items) {BuildRequestBuilder builder = new BuildRequestBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.BuildRequestItemsNested<A> addNewBuildRequestItem(){
            return new BuildRequestItemsNestedImpl();
    }

    public BaseKubernetesListFluent.BuildRequestItemsNested<A> addNewBuildRequestItemLike(BuildRequest item){
            return new BuildRequestItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.BuildRequestItemsNested<A> setNewBuildRequestItemLike(int index,BuildRequest item){
            return new BuildRequestItemsNestedImpl(index, item);
    }

    public A addToDaemonSetItems(int index,DaemonSet item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToDaemonSetItems(int index,DaemonSet item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DaemonSetBuilder builder = new DaemonSetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToDaemonSetItems(DaemonSet... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToDaemonSetItems(Collection<DaemonSet> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromDaemonSetItems(DaemonSet... items){
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromDaemonSetItems(Collection<DaemonSet> items){
            for (DaemonSet item : items) {DaemonSetBuilder builder = new DaemonSetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.DaemonSetItemsNested<A> addNewDaemonSetItem(){
            return new DaemonSetItemsNestedImpl();
    }

    public BaseKubernetesListFluent.DaemonSetItemsNested<A> addNewDaemonSetItemLike(DaemonSet item){
            return new DaemonSetItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.DaemonSetItemsNested<A> setNewDaemonSetItemLike(int index,DaemonSet item){
            return new DaemonSetItemsNestedImpl(index, item);
    }

    public A addToImageStreamItems(int index,ImageStream item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToImageStreamItems(int index,ImageStream item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamBuilder builder = new ImageStreamBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToImageStreamItems(ImageStream... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToImageStreamItems(Collection<ImageStream> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromImageStreamItems(ImageStream... items){
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageStreamItems(Collection<ImageStream> items){
            for (ImageStream item : items) {ImageStreamBuilder builder = new ImageStreamBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ImageStreamItemsNested<A> addNewImageStreamItem(){
            return new ImageStreamItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ImageStreamItemsNested<A> addNewImageStreamItemLike(ImageStream item){
            return new ImageStreamItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ImageStreamItemsNested<A> setNewImageStreamItemLike(int index,ImageStream item){
            return new ImageStreamItemsNestedImpl(index, item);
    }

    public A addToOpenshiftRoleItems(int index,OpenshiftRole item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOpenshiftRoleItems(int index,OpenshiftRole item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftRoleItems(OpenshiftRole... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftRoleItems(Collection<OpenshiftRole> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftRoleItems(OpenshiftRole... items){
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftRoleItems(Collection<OpenshiftRole> items){
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OpenshiftRoleItemsNested<A> addNewOpenshiftRoleItem(){
            return new OpenshiftRoleItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OpenshiftRoleItemsNested<A> addNewOpenshiftRoleItemLike(OpenshiftRole item){
            return new OpenshiftRoleItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OpenshiftRoleItemsNested<A> setNewOpenshiftRoleItemLike(int index,OpenshiftRole item){
            return new OpenshiftRoleItemsNestedImpl(index, item);
    }

    public A addToOAuthClientItems(int index,OAuthClient item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOAuthClientItems(int index,OAuthClient item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientBuilder builder = new OAuthClientBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthClientItems(OAuthClient... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOAuthClientItems(Collection<OAuthClient> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOAuthClientItems(OAuthClient... items){
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthClientItems(Collection<OAuthClient> items){
            for (OAuthClient item : items) {OAuthClientBuilder builder = new OAuthClientBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OAuthClientItemsNested<A> addNewOAuthClientItem(){
            return new OAuthClientItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OAuthClientItemsNested<A> addNewOAuthClientItemLike(OAuthClient item){
            return new OAuthClientItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OAuthClientItemsNested<A> setNewOAuthClientItemLike(int index,OAuthClient item){
            return new OAuthClientItemsNestedImpl(index, item);
    }

    public A addToIdentityItems(int index,Identity item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IdentityBuilder builder = new IdentityBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToIdentityItems(int index,Identity item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IdentityBuilder builder = new IdentityBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToIdentityItems(Identity... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToIdentityItems(Collection<Identity> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromIdentityItems(Identity... items){
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromIdentityItems(Collection<Identity> items){
            for (Identity item : items) {IdentityBuilder builder = new IdentityBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.IdentityItemsNested<A> addNewIdentityItem(){
            return new IdentityItemsNestedImpl();
    }

    public BaseKubernetesListFluent.IdentityItemsNested<A> addNewIdentityItemLike(Identity item){
            return new IdentityItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.IdentityItemsNested<A> setNewIdentityItemLike(int index,Identity item){
            return new IdentityItemsNestedImpl(index, item);
    }

    public A addToLimitRangeItems(int index,LimitRange item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToLimitRangeItems(int index,LimitRange item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            LimitRangeBuilder builder = new LimitRangeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToLimitRangeItems(LimitRange... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToLimitRangeItems(Collection<LimitRange> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromLimitRangeItems(LimitRange... items){
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromLimitRangeItems(Collection<LimitRange> items){
            for (LimitRange item : items) {LimitRangeBuilder builder = new LimitRangeBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.LimitRangeItemsNested<A> addNewLimitRangeItem(){
            return new LimitRangeItemsNestedImpl();
    }

    public BaseKubernetesListFluent.LimitRangeItemsNested<A> addNewLimitRangeItemLike(LimitRange item){
            return new LimitRangeItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.LimitRangeItemsNested<A> setNewLimitRangeItemLike(int index,LimitRange item){
            return new LimitRangeItemsNestedImpl(index, item);
    }

    public A addToImageStreamImportItems(int index,ImageStreamImport item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToImageStreamImportItems(int index,ImageStreamImport item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToImageStreamImportItems(ImageStreamImport... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToImageStreamImportItems(Collection<ImageStreamImport> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromImageStreamImportItems(ImageStreamImport... items){
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageStreamImportItems(Collection<ImageStreamImport> items){
            for (ImageStreamImport item : items) {ImageStreamImportBuilder builder = new ImageStreamImportBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ImageStreamImportItemsNested<A> addNewImageStreamImportItem(){
            return new ImageStreamImportItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ImageStreamImportItemsNested<A> addNewImageStreamImportItemLike(ImageStreamImport item){
            return new ImageStreamImportItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ImageStreamImportItemsNested<A> setNewImageStreamImportItemLike(int index,ImageStreamImport item){
            return new ImageStreamImportItemsNestedImpl(index, item);
    }

    public A addToOpenshiftRoleBindingRestrictionItems(int index,OpenshiftRoleBindingRestriction item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOpenshiftRoleBindingRestrictionItems(int index,OpenshiftRoleBindingRestriction item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftRoleBindingRestrictionItems(OpenshiftRoleBindingRestriction... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftRoleBindingRestrictionItems(Collection<OpenshiftRoleBindingRestriction> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftRoleBindingRestrictionItems(OpenshiftRoleBindingRestriction... items){
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftRoleBindingRestrictionItems(Collection<OpenshiftRoleBindingRestriction> items){
            for (OpenshiftRoleBindingRestriction item : items) {OpenshiftRoleBindingRestrictionBuilder builder = new OpenshiftRoleBindingRestrictionBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<A> addNewOpenshiftRoleBindingRestrictionItem(){
            return new OpenshiftRoleBindingRestrictionItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<A> addNewOpenshiftRoleBindingRestrictionItemLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<A> setNewOpenshiftRoleBindingRestrictionItemLike(int index,OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionItemsNestedImpl(index, item);
    }

    public A addToRoleBindingItems(int index,RoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToRoleBindingItems(int index,RoleBinding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBindingBuilder builder = new RoleBindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToRoleBindingItems(RoleBinding... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToRoleBindingItems(Collection<RoleBinding> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromRoleBindingItems(RoleBinding... items){
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromRoleBindingItems(Collection<RoleBinding> items){
            for (RoleBinding item : items) {RoleBindingBuilder builder = new RoleBindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.RoleBindingItemsNested<A> addNewRoleBindingItem(){
            return new RoleBindingItemsNestedImpl();
    }

    public BaseKubernetesListFluent.RoleBindingItemsNested<A> addNewRoleBindingItemLike(RoleBinding item){
            return new RoleBindingItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.RoleBindingItemsNested<A> setNewRoleBindingItemLike(int index,RoleBinding item){
            return new RoleBindingItemsNestedImpl(index, item);
    }

    public A addToPodPresetItems(int index,PodPreset item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPodPresetItems(int index,PodPreset item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodPresetBuilder builder = new PodPresetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPodPresetItems(PodPreset... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPodPresetItems(Collection<PodPreset> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPodPresetItems(PodPreset... items){
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodPresetItems(Collection<PodPreset> items){
            for (PodPreset item : items) {PodPresetBuilder builder = new PodPresetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PodPresetItemsNested<A> addNewPodPresetItem(){
            return new PodPresetItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PodPresetItemsNested<A> addNewPodPresetItemLike(PodPreset item){
            return new PodPresetItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PodPresetItemsNested<A> setNewPodPresetItemLike(int index,PodPreset item){
            return new PodPresetItemsNestedImpl(index, item);
    }

    public A addToProjectItems(int index,Project item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectBuilder builder = new ProjectBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToProjectItems(int index,Project item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectBuilder builder = new ProjectBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToProjectItems(Project... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToProjectItems(Collection<Project> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromProjectItems(Project... items){
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromProjectItems(Collection<Project> items){
            for (Project item : items) {ProjectBuilder builder = new ProjectBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ProjectItemsNested<A> addNewProjectItem(){
            return new ProjectItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ProjectItemsNested<A> addNewProjectItemLike(Project item){
            return new ProjectItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ProjectItemsNested<A> setNewProjectItemLike(int index,Project item){
            return new ProjectItemsNestedImpl(index, item);
    }

    public A addToBuildConfigItems(int index,BuildConfig item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToBuildConfigItems(int index,BuildConfig item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BuildConfigBuilder builder = new BuildConfigBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToBuildConfigItems(BuildConfig... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToBuildConfigItems(Collection<BuildConfig> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromBuildConfigItems(BuildConfig... items){
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildConfigItems(Collection<BuildConfig> items){
            for (BuildConfig item : items) {BuildConfigBuilder builder = new BuildConfigBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.BuildConfigItemsNested<A> addNewBuildConfigItem(){
            return new BuildConfigItemsNestedImpl();
    }

    public BaseKubernetesListFluent.BuildConfigItemsNested<A> addNewBuildConfigItemLike(BuildConfig item){
            return new BuildConfigItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.BuildConfigItemsNested<A> setNewBuildConfigItemLike(int index,BuildConfig item){
            return new BuildConfigItemsNestedImpl(index, item);
    }

    public A addToClusterRoleItems(int index,ClusterRole item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToClusterRoleItems(int index,ClusterRole item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ClusterRoleBuilder builder = new ClusterRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToClusterRoleItems(ClusterRole... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToClusterRoleItems(Collection<ClusterRole> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromClusterRoleItems(ClusterRole... items){
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromClusterRoleItems(Collection<ClusterRole> items){
            for (ClusterRole item : items) {ClusterRoleBuilder builder = new ClusterRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ClusterRoleItemsNested<A> addNewClusterRoleItem(){
            return new ClusterRoleItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ClusterRoleItemsNested<A> addNewClusterRoleItemLike(ClusterRole item){
            return new ClusterRoleItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ClusterRoleItemsNested<A> setNewClusterRoleItemLike(int index,ClusterRole item){
            return new ClusterRoleItemsNestedImpl(index, item);
    }

    public A addToOAuthAuthorizeTokenItems(int index,OAuthAuthorizeToken item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOAuthAuthorizeTokenItems(int index,OAuthAuthorizeToken item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthAuthorizeTokenItems(OAuthAuthorizeToken... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOAuthAuthorizeTokenItems(Collection<OAuthAuthorizeToken> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOAuthAuthorizeTokenItems(OAuthAuthorizeToken... items){
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthAuthorizeTokenItems(Collection<OAuthAuthorizeToken> items){
            for (OAuthAuthorizeToken item : items) {OAuthAuthorizeTokenBuilder builder = new OAuthAuthorizeTokenBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<A> addNewOAuthAuthorizeTokenItem(){
            return new OAuthAuthorizeTokenItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<A> addNewOAuthAuthorizeTokenItemLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<A> setNewOAuthAuthorizeTokenItemLike(int index,OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenItemsNestedImpl(index, item);
    }

    public A addToProjectRequestItems(int index,ProjectRequest item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToProjectRequestItems(int index,ProjectRequest item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ProjectRequestBuilder builder = new ProjectRequestBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToProjectRequestItems(ProjectRequest... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToProjectRequestItems(Collection<ProjectRequest> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromProjectRequestItems(ProjectRequest... items){
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromProjectRequestItems(Collection<ProjectRequest> items){
            for (ProjectRequest item : items) {ProjectRequestBuilder builder = new ProjectRequestBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ProjectRequestItemsNested<A> addNewProjectRequestItem(){
            return new ProjectRequestItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ProjectRequestItemsNested<A> addNewProjectRequestItemLike(ProjectRequest item){
            return new ProjectRequestItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ProjectRequestItemsNested<A> setNewProjectRequestItemLike(int index,ProjectRequest item){
            return new ProjectRequestItemsNestedImpl(index, item);
    }

    public A addToPriorityClassItems(int index,PriorityClass item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPriorityClassItems(int index,PriorityClass item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PriorityClassBuilder builder = new PriorityClassBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPriorityClassItems(PriorityClass... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPriorityClassItems(Collection<PriorityClass> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPriorityClassItems(PriorityClass... items){
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPriorityClassItems(Collection<PriorityClass> items){
            for (PriorityClass item : items) {PriorityClassBuilder builder = new PriorityClassBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PriorityClassItemsNested<A> addNewPriorityClassItem(){
            return new PriorityClassItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PriorityClassItemsNested<A> addNewPriorityClassItemLike(PriorityClass item){
            return new PriorityClassItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PriorityClassItemsNested<A> setNewPriorityClassItemLike(int index,PriorityClass item){
            return new PriorityClassItemsNestedImpl(index, item);
    }

    public A addToTemplateItems(int index,Template item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TemplateBuilder builder = new TemplateBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToTemplateItems(int index,Template item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TemplateBuilder builder = new TemplateBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToTemplateItems(Template... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToTemplateItems(Collection<Template> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromTemplateItems(Template... items){
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromTemplateItems(Collection<Template> items){
            for (Template item : items) {TemplateBuilder builder = new TemplateBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.TemplateItemsNested<A> addNewTemplateItem(){
            return new TemplateItemsNestedImpl();
    }

    public BaseKubernetesListFluent.TemplateItemsNested<A> addNewTemplateItemLike(Template item){
            return new TemplateItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.TemplateItemsNested<A> setNewTemplateItemLike(int index,Template item){
            return new TemplateItemsNestedImpl(index, item);
    }

    public A addToOAuthClientAuthorizationItems(int index,OAuthClientAuthorization item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOAuthClientAuthorizationItems(int index,OAuthClientAuthorization item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthClientAuthorizationItems(OAuthClientAuthorization... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOAuthClientAuthorizationItems(Collection<OAuthClientAuthorization> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOAuthClientAuthorizationItems(OAuthClientAuthorization... items){
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthClientAuthorizationItems(Collection<OAuthClientAuthorization> items){
            for (OAuthClientAuthorization item : items) {OAuthClientAuthorizationBuilder builder = new OAuthClientAuthorizationBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<A> addNewOAuthClientAuthorizationItem(){
            return new OAuthClientAuthorizationItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<A> addNewOAuthClientAuthorizationItemLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<A> setNewOAuthClientAuthorizationItemLike(int index,OAuthClientAuthorization item){
            return new OAuthClientAuthorizationItemsNestedImpl(index, item);
    }

    public A addToDeploymentItems(int index,Deployment item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToDeploymentItems(int index,Deployment item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentBuilder builder = new DeploymentBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToDeploymentItems(Deployment... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToDeploymentItems(Collection<Deployment> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromDeploymentItems(Deployment... items){
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromDeploymentItems(Collection<Deployment> items){
            for (Deployment item : items) {DeploymentBuilder builder = new DeploymentBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.DeploymentItemsNested<A> addNewDeploymentItem(){
            return new DeploymentItemsNestedImpl();
    }

    public BaseKubernetesListFluent.DeploymentItemsNested<A> addNewDeploymentItemLike(Deployment item){
            return new DeploymentItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.DeploymentItemsNested<A> setNewDeploymentItemLike(int index,Deployment item){
            return new DeploymentItemsNestedImpl(index, item);
    }

    public A addToPodTemplateItems(int index,PodTemplate item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPodTemplateItems(int index,PodTemplate item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PodTemplateBuilder builder = new PodTemplateBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPodTemplateItems(PodTemplate... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPodTemplateItems(Collection<PodTemplate> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPodTemplateItems(PodTemplate... items){
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodTemplateItems(Collection<PodTemplate> items){
            for (PodTemplate item : items) {PodTemplateBuilder builder = new PodTemplateBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PodTemplateItemsNested<A> addNewPodTemplateItem(){
            return new PodTemplateItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PodTemplateItemsNested<A> addNewPodTemplateItemLike(PodTemplate item){
            return new PodTemplateItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PodTemplateItemsNested<A> setNewPodTemplateItemLike(int index,PodTemplate item){
            return new PodTemplateItemsNestedImpl(index, item);
    }

    public A addToEventItems(int index,Event item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EventBuilder builder = new EventBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToEventItems(int index,Event item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            EventBuilder builder = new EventBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToEventItems(Event... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToEventItems(Collection<Event> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromEventItems(Event... items){
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromEventItems(Collection<Event> items){
            for (Event item : items) {EventBuilder builder = new EventBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.EventItemsNested<A> addNewEventItem(){
            return new EventItemsNestedImpl();
    }

    public BaseKubernetesListFluent.EventItemsNested<A> addNewEventItemLike(Event item){
            return new EventItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.EventItemsNested<A> setNewEventItemLike(int index,Event item){
            return new EventItemsNestedImpl(index, item);
    }

    public A addToIngressItems(int index,Ingress item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IngressBuilder builder = new IngressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToIngressItems(int index,Ingress item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            IngressBuilder builder = new IngressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToIngressItems(Ingress... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToIngressItems(Collection<Ingress> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromIngressItems(Ingress... items){
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromIngressItems(Collection<Ingress> items){
            for (Ingress item : items) {IngressBuilder builder = new IngressBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.IngressItemsNested<A> addNewIngressItem(){
            return new IngressItemsNestedImpl();
    }

    public BaseKubernetesListFluent.IngressItemsNested<A> addNewIngressItemLike(Ingress item){
            return new IngressItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.IngressItemsNested<A> setNewIngressItemLike(int index,Ingress item){
            return new IngressItemsNestedImpl(index, item);
    }

    public A addToDeploymentConfigItems(int index,DeploymentConfig item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToDeploymentConfigItems(int index,DeploymentConfig item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToDeploymentConfigItems(DeploymentConfig... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToDeploymentConfigItems(Collection<DeploymentConfig> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromDeploymentConfigItems(DeploymentConfig... items){
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromDeploymentConfigItems(Collection<DeploymentConfig> items){
            for (DeploymentConfig item : items) {DeploymentConfigBuilder builder = new DeploymentConfigBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.DeploymentConfigItemsNested<A> addNewDeploymentConfigItem(){
            return new DeploymentConfigItemsNestedImpl();
    }

    public BaseKubernetesListFluent.DeploymentConfigItemsNested<A> addNewDeploymentConfigItemLike(DeploymentConfig item){
            return new DeploymentConfigItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.DeploymentConfigItemsNested<A> setNewDeploymentConfigItemLike(int index,DeploymentConfig item){
            return new DeploymentConfigItemsNestedImpl(index, item);
    }

    public A addToOAuthAccessTokenItems(int index,OAuthAccessToken item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOAuthAccessTokenItems(int index,OAuthAccessToken item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOAuthAccessTokenItems(OAuthAccessToken... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOAuthAccessTokenItems(Collection<OAuthAccessToken> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOAuthAccessTokenItems(OAuthAccessToken... items){
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOAuthAccessTokenItems(Collection<OAuthAccessToken> items){
            for (OAuthAccessToken item : items) {OAuthAccessTokenBuilder builder = new OAuthAccessTokenBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OAuthAccessTokenItemsNested<A> addNewOAuthAccessTokenItem(){
            return new OAuthAccessTokenItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OAuthAccessTokenItemsNested<A> addNewOAuthAccessTokenItemLike(OAuthAccessToken item){
            return new OAuthAccessTokenItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OAuthAccessTokenItemsNested<A> setNewOAuthAccessTokenItemLike(int index,OAuthAccessToken item){
            return new OAuthAccessTokenItemsNestedImpl(index, item);
    }

    public A addToPersistentVolumeItems(int index,PersistentVolume item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPersistentVolumeItems(int index,PersistentVolume item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPersistentVolumeItems(PersistentVolume... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPersistentVolumeItems(Collection<PersistentVolume> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPersistentVolumeItems(PersistentVolume... items){
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPersistentVolumeItems(Collection<PersistentVolume> items){
            for (PersistentVolume item : items) {PersistentVolumeBuilder builder = new PersistentVolumeBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PersistentVolumeItemsNested<A> addNewPersistentVolumeItem(){
            return new PersistentVolumeItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PersistentVolumeItemsNested<A> addNewPersistentVolumeItemLike(PersistentVolume item){
            return new PersistentVolumeItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PersistentVolumeItemsNested<A> setNewPersistentVolumeItemLike(int index,PersistentVolume item){
            return new PersistentVolumeItemsNestedImpl(index, item);
    }

    public A addToPersistentVolumeClaimItems(int index,PersistentVolumeClaim item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToPersistentVolumeClaimItems(int index,PersistentVolumeClaim item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToPersistentVolumeClaimItems(PersistentVolumeClaim... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToPersistentVolumeClaimItems(Collection<PersistentVolumeClaim> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromPersistentVolumeClaimItems(PersistentVolumeClaim... items){
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromPersistentVolumeClaimItems(Collection<PersistentVolumeClaim> items){
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<A> addNewPersistentVolumeClaimItem(){
            return new PersistentVolumeClaimItemsNestedImpl();
    }

    public BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<A> addNewPersistentVolumeClaimItemLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<A> setNewPersistentVolumeClaimItemLike(int index,PersistentVolumeClaim item){
            return new PersistentVolumeClaimItemsNestedImpl(index, item);
    }

    public A addToEventItems(int index,io.fabric8.kubernetes.api.model.events.Event item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToEventItems(int index,io.fabric8.kubernetes.api.model.events.Event item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToEventItems(io.fabric8.kubernetes.api.model.events.Event... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToEventsEventItems(Collection<io.fabric8.kubernetes.api.model.events.Event> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromEventItems(io.fabric8.kubernetes.api.model.events.Event... items){
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromEventsEventItems(Collection<io.fabric8.kubernetes.api.model.events.Event> items){
            for (io.fabric8.kubernetes.api.model.events.Event item : items) {io.fabric8.kubernetes.api.model.events.EventBuilder builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.EventsEventItemsNested<A> addNewEventsEventItem(){
            return new EventsEventItemsNestedImpl();
    }

    public BaseKubernetesListFluent.EventsEventItemsNested<A> addNewEventItemLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.EventsEventItemsNested<A> setNewEventItemLike(int index,io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventItemsNestedImpl(index, item);
    }

    public A addToStatefulSetItems(int index,StatefulSet item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToStatefulSetItems(int index,StatefulSet item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            StatefulSetBuilder builder = new StatefulSetBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToStatefulSetItems(StatefulSet... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToStatefulSetItems(Collection<StatefulSet> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromStatefulSetItems(StatefulSet... items){
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromStatefulSetItems(Collection<StatefulSet> items){
            for (StatefulSet item : items) {StatefulSetBuilder builder = new StatefulSetBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.StatefulSetItemsNested<A> addNewStatefulSetItem(){
            return new StatefulSetItemsNestedImpl();
    }

    public BaseKubernetesListFluent.StatefulSetItemsNested<A> addNewStatefulSetItemLike(StatefulSet item){
            return new StatefulSetItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.StatefulSetItemsNested<A> setNewStatefulSetItemLike(int index,StatefulSet item){
            return new StatefulSetItemsNestedImpl(index, item);
    }

    public A addToOpenshiftClusterRoleItems(int index,OpenshiftClusterRole item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToOpenshiftClusterRoleItems(int index,OpenshiftClusterRole item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToOpenshiftClusterRoleItems(OpenshiftClusterRole... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToOpenshiftClusterRoleItems(Collection<OpenshiftClusterRole> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromOpenshiftClusterRoleItems(OpenshiftClusterRole... items){
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromOpenshiftClusterRoleItems(Collection<OpenshiftClusterRole> items){
            for (OpenshiftClusterRole item : items) {OpenshiftClusterRoleBuilder builder = new OpenshiftClusterRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<A> addNewOpenshiftClusterRoleItem(){
            return new OpenshiftClusterRoleItemsNestedImpl();
    }

    public BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<A> addNewOpenshiftClusterRoleItemLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<A> setNewOpenshiftClusterRoleItemLike(int index,OpenshiftClusterRole item){
            return new OpenshiftClusterRoleItemsNestedImpl(index, item);
    }

    public A addToRoleItems(int index,Role item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBuilder builder = new RoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToRoleItems(int index,Role item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            RoleBuilder builder = new RoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToRoleItems(Role... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToRoleItems(Collection<Role> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromRoleItems(Role... items){
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromRoleItems(Collection<Role> items){
            for (Role item : items) {RoleBuilder builder = new RoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.RoleItemsNested<A> addNewRoleItem(){
            return new RoleItemsNestedImpl();
    }

    public BaseKubernetesListFluent.RoleItemsNested<A> addNewRoleItemLike(Role item){
            return new RoleItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.RoleItemsNested<A> setNewRoleItemLike(int index,Role item){
            return new RoleItemsNestedImpl(index, item);
    }

    public A addToUserItems(int index,User item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            UserBuilder builder = new UserBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToUserItems(int index,User item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            UserBuilder builder = new UserBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToUserItems(User... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToUserItems(Collection<User> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromUserItems(User... items){
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromUserItems(Collection<User> items){
            for (User item : items) {UserBuilder builder = new UserBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.UserItemsNested<A> addNewUserItem(){
            return new UserItemsNestedImpl();
    }

    public BaseKubernetesListFluent.UserItemsNested<A> addNewUserItemLike(User item){
            return new UserItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.UserItemsNested<A> setNewUserItemLike(int index,User item){
            return new UserItemsNestedImpl(index, item);
    }

    public A addToComponentStatusItems(int index,ComponentStatus item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToComponentStatusItems(int index,ComponentStatus item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ComponentStatusBuilder builder = new ComponentStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToComponentStatusItems(ComponentStatus... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToComponentStatusItems(Collection<ComponentStatus> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromComponentStatusItems(ComponentStatus... items){
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromComponentStatusItems(Collection<ComponentStatus> items){
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ComponentStatusItemsNested<A> addNewComponentStatusItem(){
            return new ComponentStatusItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ComponentStatusItemsNested<A> addNewComponentStatusItemLike(ComponentStatus item){
            return new ComponentStatusItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ComponentStatusItemsNested<A> setNewComponentStatusItemLike(int index,ComponentStatus item){
            return new ComponentStatusItemsNestedImpl(index, item);
    }

    public A addToTokenReviewItems(int index,TokenReview item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToTokenReviewItems(int index,TokenReview item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            TokenReviewBuilder builder = new TokenReviewBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToTokenReviewItems(TokenReview... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToTokenReviewItems(Collection<TokenReview> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromTokenReviewItems(TokenReview... items){
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromTokenReviewItems(Collection<TokenReview> items){
            for (TokenReview item : items) {TokenReviewBuilder builder = new TokenReviewBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.TokenReviewItemsNested<A> addNewTokenReviewItem(){
            return new TokenReviewItemsNestedImpl();
    }

    public BaseKubernetesListFluent.TokenReviewItemsNested<A> addNewTokenReviewItemLike(TokenReview item){
            return new TokenReviewItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.TokenReviewItemsNested<A> setNewTokenReviewItemLike(int index,TokenReview item){
            return new TokenReviewItemsNestedImpl(index, item);
    }

    public A addToBindingItems(int index,Binding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BindingBuilder builder = new BindingBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToBindingItems(int index,Binding item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            BindingBuilder builder = new BindingBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToBindingItems(Binding... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToBindingItems(Collection<Binding> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromBindingItems(Binding... items){
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromBindingItems(Collection<Binding> items){
            for (Binding item : items) {BindingBuilder builder = new BindingBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.BindingItemsNested<A> addNewBindingItem(){
            return new BindingItemsNestedImpl();
    }

    public BaseKubernetesListFluent.BindingItemsNested<A> addNewBindingItemLike(Binding item){
            return new BindingItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.BindingItemsNested<A> setNewBindingItemLike(int index,Binding item){
            return new BindingItemsNestedImpl(index, item);
    }

    public A addToSecretItems(int index,Secret item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecretBuilder builder = new SecretBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToSecretItems(int index,Secret item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecretBuilder builder = new SecretBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToSecretItems(Secret... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToSecretItems(Collection<Secret> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromSecretItems(Secret... items){
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecretItems(Collection<Secret> items){
            for (Secret item : items) {SecretBuilder builder = new SecretBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.SecretItemsNested<A> addNewSecretItem(){
            return new SecretItemsNestedImpl();
    }

    public BaseKubernetesListFluent.SecretItemsNested<A> addNewSecretItemLike(Secret item){
            return new SecretItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.SecretItemsNested<A> setNewSecretItemLike(int index,Secret item){
            return new SecretItemsNestedImpl(index, item);
    }

    public A addToSecurityContextConstraintsItems(int index,SecurityContextConstraints item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToSecurityContextConstraintsItems(int index,SecurityContextConstraints item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToSecurityContextConstraintsItems(SecurityContextConstraints... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToSecurityContextConstraintsItems(Collection<SecurityContextConstraints> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromSecurityContextConstraintsItems(SecurityContextConstraints... items){
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecurityContextConstraintsItems(Collection<SecurityContextConstraints> items){
            for (SecurityContextConstraints item : items) {SecurityContextConstraintsBuilder builder = new SecurityContextConstraintsBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<A> addNewSecurityContextConstraintsItem(){
            return new SecurityContextConstraintsItemsNestedImpl();
    }

    public BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<A> addNewSecurityContextConstraintsItemLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<A> setNewSecurityContextConstraintsItemLike(int index,SecurityContextConstraints item){
            return new SecurityContextConstraintsItemsNestedImpl(index, item);
    }

    public A addToNetNamespaceItems(int index,NetNamespace item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToNetNamespaceItems(int index,NetNamespace item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NetNamespaceBuilder builder = new NetNamespaceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToNetNamespaceItems(NetNamespace... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToNetNamespaceItems(Collection<NetNamespace> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromNetNamespaceItems(NetNamespace... items){
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromNetNamespaceItems(Collection<NetNamespace> items){
            for (NetNamespace item : items) {NetNamespaceBuilder builder = new NetNamespaceBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.NetNamespaceItemsNested<A> addNewNetNamespaceItem(){
            return new NetNamespaceItemsNestedImpl();
    }

    public BaseKubernetesListFluent.NetNamespaceItemsNested<A> addNewNetNamespaceItemLike(NetNamespace item){
            return new NetNamespaceItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.NetNamespaceItemsNested<A> setNewNetNamespaceItemLike(int index,NetNamespace item){
            return new NetNamespaceItemsNestedImpl(index, item);
    }

    public A addToNodeItems(int index,Node item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NodeBuilder builder = new NodeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToNodeItems(int index,Node item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            NodeBuilder builder = new NodeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToNodeItems(Node... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToNodeItems(Collection<Node> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromNodeItems(Node... items){
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromNodeItems(Collection<Node> items){
            for (Node item : items) {NodeBuilder builder = new NodeBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.NodeItemsNested<A> addNewNodeItem(){
            return new NodeItemsNestedImpl();
    }

    public BaseKubernetesListFluent.NodeItemsNested<A> addNewNodeItemLike(Node item){
            return new NodeItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.NodeItemsNested<A> setNewNodeItemLike(int index,Node item){
            return new NodeItemsNestedImpl(index, item);
    }

    public A addToJobItems(int index,Job item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            JobBuilder builder = new JobBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToJobItems(int index,Job item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            JobBuilder builder = new JobBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToJobItems(Job... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToJobItems(Collection<Job> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromJobItems(Job... items){
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromJobItems(Collection<Job> items){
            for (Job item : items) {JobBuilder builder = new JobBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.JobItemsNested<A> addNewJobItem(){
            return new JobItemsNestedImpl();
    }

    public BaseKubernetesListFluent.JobItemsNested<A> addNewJobItemLike(Job item){
            return new JobItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.JobItemsNested<A> setNewJobItemLike(int index,Job item){
            return new JobItemsNestedImpl(index, item);
    }

    public A addToCertificateSigningRequestItems(int index,CertificateSigningRequest item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToCertificateSigningRequestItems(int index,CertificateSigningRequest item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToCertificateSigningRequestItems(CertificateSigningRequest... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToCertificateSigningRequestItems(Collection<CertificateSigningRequest> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromCertificateSigningRequestItems(CertificateSigningRequest... items){
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromCertificateSigningRequestItems(Collection<CertificateSigningRequest> items){
            for (CertificateSigningRequest item : items) {CertificateSigningRequestBuilder builder = new CertificateSigningRequestBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.CertificateSigningRequestItemsNested<A> addNewCertificateSigningRequestItem(){
            return new CertificateSigningRequestItemsNestedImpl();
    }

    public BaseKubernetesListFluent.CertificateSigningRequestItemsNested<A> addNewCertificateSigningRequestItemLike(CertificateSigningRequest item){
            return new CertificateSigningRequestItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.CertificateSigningRequestItemsNested<A> setNewCertificateSigningRequestItemLike(int index,CertificateSigningRequest item){
            return new CertificateSigningRequestItemsNestedImpl(index, item);
    }

    public A addToServiceAccountItems(int index,ServiceAccount item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToServiceAccountItems(int index,ServiceAccount item){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            ServiceAccountBuilder builder = new ServiceAccountBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToServiceAccountItems(ServiceAccount... items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToServiceAccountItems(Collection<ServiceAccount> items){
            if (this.items == null) {this.items = new ArrayList<VisitableBuilder<? extends HasMetadata,?>>();}
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromServiceAccountItems(ServiceAccount... items){
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromServiceAccountItems(Collection<ServiceAccount> items){
            for (ServiceAccount item : items) {ServiceAccountBuilder builder = new ServiceAccountBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public BaseKubernetesListFluent.ServiceAccountItemsNested<A> addNewServiceAccountItem(){
            return new ServiceAccountItemsNestedImpl();
    }

    public BaseKubernetesListFluent.ServiceAccountItemsNested<A> addNewServiceAccountItemLike(ServiceAccount item){
            return new ServiceAccountItemsNestedImpl(-1, item);
    }

    public BaseKubernetesListFluent.ServiceAccountItemsNested<A> setNewServiceAccountItemLike(int index,ServiceAccount item){
            return new ServiceAccountItemsNestedImpl(index, item);
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

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ListMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ListMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ListMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public A withNewMetadata(String _continue,String resourceVersion,String selfLink){
            return (A)withMetadata(new ListMeta(_continue, resourceVersion, selfLink));
    }

    public BaseKubernetesListFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public BaseKubernetesListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item){
            return new MetadataNestedImpl(item);
    }

    public BaseKubernetesListFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public BaseKubernetesListFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ListMetaBuilder().build());
    }

    public BaseKubernetesListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BaseKubernetesListFluentImpl that = (BaseKubernetesListFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class ValidatingWebhookConfigurationItemsNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<N>> implements BaseKubernetesListFluent.ValidatingWebhookConfigurationItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
        private final int index;
    
            ValidatingWebhookConfigurationItemsNestedImpl(int index,ValidatingWebhookConfiguration item){
                    this.index = index;
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToValidatingWebhookConfigurationItems(index, builder.build());
    }
    public N endValidatingWebhookConfigurationItem(){
            return and();
    }

}
    public class StorageClassItemsNestedImpl<N> extends StorageClassFluentImpl<BaseKubernetesListFluent.StorageClassItemsNested<N>> implements BaseKubernetesListFluent.StorageClassItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
        private final int index;
    
            StorageClassItemsNestedImpl(int index,StorageClass item){
                    this.index = index;
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToStorageClassItems(index, builder.build());
    }
    public N endStorageClassItem(){
            return and();
    }

}
    public class ClusterRoleBindingItemsNestedImpl<N> extends ClusterRoleBindingFluentImpl<BaseKubernetesListFluent.ClusterRoleBindingItemsNested<N>> implements BaseKubernetesListFluent.ClusterRoleBindingItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
        private final int index;
    
            ClusterRoleBindingItemsNestedImpl(int index,ClusterRoleBinding item){
                    this.index = index;
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToClusterRoleBindingItems(index, builder.build());
    }
    public N endClusterRoleBindingItem(){
            return and();
    }

}
    public class OpenshiftRoleBindingItemsNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<N>> implements BaseKubernetesListFluent.OpenshiftRoleBindingItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
        private final int index;
    
            OpenshiftRoleBindingItemsNestedImpl(int index,OpenshiftRoleBinding item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOpenshiftRoleBindingItems(index, builder.build());
    }
    public N endOpenshiftRoleBindingItem(){
            return and();
    }

}
    public class PodDisruptionBudgetItemsNestedImpl<N> extends PodDisruptionBudgetFluentImpl<BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<N>> implements BaseKubernetesListFluent.PodDisruptionBudgetItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
        private final int index;
    
            PodDisruptionBudgetItemsNestedImpl(int index,PodDisruptionBudget item){
                    this.index = index;
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPodDisruptionBudgetItems(index, builder.build());
    }
    public N endPodDisruptionBudgetItem(){
            return and();
    }

}
    public class NetworkPolicyItemsNestedImpl<N> extends NetworkPolicyFluentImpl<BaseKubernetesListFluent.NetworkPolicyItemsNested<N>> implements BaseKubernetesListFluent.NetworkPolicyItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
        private final int index;
    
            NetworkPolicyItemsNestedImpl(int index,NetworkPolicy item){
                    this.index = index;
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToNetworkPolicyItems(index, builder.build());
    }
    public N endNetworkPolicyItem(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingItemsNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<N>> implements BaseKubernetesListFluent.OpenshiftClusterRoleBindingItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
        private final int index;
    
            OpenshiftClusterRoleBindingItemsNestedImpl(int index,OpenshiftClusterRoleBinding item){
                    this.index = index;
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOpenshiftClusterRoleBindingItems(index, builder.build());
    }
    public N endOpenshiftClusterRoleBindingItem(){
            return and();
    }

}
    public class RouteItemsNestedImpl<N> extends RouteFluentImpl<BaseKubernetesListFluent.RouteItemsNested<N>> implements BaseKubernetesListFluent.RouteItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
        private final int index;
    
            RouteItemsNestedImpl(int index,Route item){
                    this.index = index;
                    this.builder = new RouteBuilder(this, item);
            }
            RouteItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToRouteItems(index, builder.build());
    }
    public N endRouteItem(){
            return and();
    }

}
    public class NamespaceItemsNestedImpl<N> extends NamespaceFluentImpl<BaseKubernetesListFluent.NamespaceItemsNested<N>> implements BaseKubernetesListFluent.NamespaceItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
        private final int index;
    
            NamespaceItemsNestedImpl(int index,Namespace item){
                    this.index = index;
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToNamespaceItems(index, builder.build());
    }
    public N endNamespaceItem(){
            return and();
    }

}
    public class LocalSubjectAccessReviewItemsNestedImpl<N> extends LocalSubjectAccessReviewFluentImpl<BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<N>> implements BaseKubernetesListFluent.LocalSubjectAccessReviewItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalSubjectAccessReviewBuilder builder;
        private final int index;
    
            LocalSubjectAccessReviewItemsNestedImpl(int index,LocalSubjectAccessReview item){
                    this.index = index;
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToLocalSubjectAccessReviewItems(index, builder.build());
    }
    public N endLocalSubjectAccessReviewItem(){
            return and();
    }

}
    public class ServiceItemsNestedImpl<N> extends ServiceFluentImpl<BaseKubernetesListFluent.ServiceItemsNested<N>> implements BaseKubernetesListFluent.ServiceItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
        private final int index;
    
            ServiceItemsNestedImpl(int index,Service item){
                    this.index = index;
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToServiceItems(index, builder.build());
    }
    public N endServiceItem(){
            return and();
    }

}
    public class ReplicationControllerItemsNestedImpl<N> extends ReplicationControllerFluentImpl<BaseKubernetesListFluent.ReplicationControllerItemsNested<N>> implements BaseKubernetesListFluent.ReplicationControllerItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
        private final int index;
    
            ReplicationControllerItemsNestedImpl(int index,ReplicationController item){
                    this.index = index;
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToReplicationControllerItems(index, builder.build());
    }
    public N endReplicationControllerItem(){
            return and();
    }

}
    public class SubjectAccessReviewItemsNestedImpl<N> extends SubjectAccessReviewFluentImpl<BaseKubernetesListFluent.SubjectAccessReviewItemsNested<N>> implements BaseKubernetesListFluent.SubjectAccessReviewItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewBuilder builder;
        private final int index;
    
            SubjectAccessReviewItemsNestedImpl(int index,SubjectAccessReview item){
                    this.index = index;
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToSubjectAccessReviewItems(index, builder.build());
    }
    public N endSubjectAccessReviewItem(){
            return and();
    }

}
    public class MutatingWebhookConfigurationItemsNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<N>> implements BaseKubernetesListFluent.MutatingWebhookConfigurationItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
        private final int index;
    
            MutatingWebhookConfigurationItemsNestedImpl(int index,MutatingWebhookConfiguration item){
                    this.index = index;
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToMutatingWebhookConfigurationItems(index, builder.build());
    }
    public N endMutatingWebhookConfigurationItem(){
            return and();
    }

}
    public class HorizontalPodAutoscalerItemsNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<N>> implements BaseKubernetesListFluent.HorizontalPodAutoscalerItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
        private final int index;
    
            HorizontalPodAutoscalerItemsNestedImpl(int index,HorizontalPodAutoscaler item){
                    this.index = index;
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToHorizontalPodAutoscalerItems(index, builder.build());
    }
    public N endHorizontalPodAutoscalerItem(){
            return and();
    }

}
    public class ScaleItemsNestedImpl<N> extends ScaleFluentImpl<BaseKubernetesListFluent.ScaleItemsNested<N>> implements BaseKubernetesListFluent.ScaleItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
        private final int index;
    
            ScaleItemsNestedImpl(int index,Scale item){
                    this.index = index;
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToScaleItems(index, builder.build());
    }
    public N endScaleItem(){
            return and();
    }

}
    public class ImageItemsNestedImpl<N> extends ImageFluentImpl<BaseKubernetesListFluent.ImageItemsNested<N>> implements BaseKubernetesListFluent.ImageItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
        private final int index;
    
            ImageItemsNestedImpl(int index,Image item){
                    this.index = index;
                    this.builder = new ImageBuilder(this, item);
            }
            ImageItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToImageItems(index, builder.build());
    }
    public N endImageItem(){
            return and();
    }

}
    public class ReplicaSetItemsNestedImpl<N> extends ReplicaSetFluentImpl<BaseKubernetesListFluent.ReplicaSetItemsNested<N>> implements BaseKubernetesListFluent.ReplicaSetItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
        private final int index;
    
            ReplicaSetItemsNestedImpl(int index,ReplicaSet item){
                    this.index = index;
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToReplicaSetItems(index, builder.build());
    }
    public N endReplicaSetItem(){
            return and();
    }

}
    public class PodSecurityPolicyItemsNestedImpl<N> extends PodSecurityPolicyFluentImpl<BaseKubernetesListFluent.PodSecurityPolicyItemsNested<N>> implements BaseKubernetesListFluent.PodSecurityPolicyItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
        private final int index;
    
            PodSecurityPolicyItemsNestedImpl(int index,PodSecurityPolicy item){
                    this.index = index;
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPodSecurityPolicyItems(index, builder.build());
    }
    public N endPodSecurityPolicyItem(){
            return and();
    }

}
    public class CronJobItemsNestedImpl<N> extends CronJobFluentImpl<BaseKubernetesListFluent.CronJobItemsNested<N>> implements BaseKubernetesListFluent.CronJobItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
        private final int index;
    
            CronJobItemsNestedImpl(int index,CronJob item){
                    this.index = index;
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToCronJobItems(index, builder.build());
    }
    public N endCronJobItem(){
            return and();
    }

}
    public class EndpointsItemsNestedImpl<N> extends EndpointsFluentImpl<BaseKubernetesListFluent.EndpointsItemsNested<N>> implements BaseKubernetesListFluent.EndpointsItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
        private final int index;
    
            EndpointsItemsNestedImpl(int index,Endpoints item){
                    this.index = index;
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToEndpointsItems(index, builder.build());
    }
    public N endEndpointsItem(){
            return and();
    }

}
    public class PodItemsNestedImpl<N> extends PodFluentImpl<BaseKubernetesListFluent.PodItemsNested<N>> implements BaseKubernetesListFluent.PodItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
        private final int index;
    
            PodItemsNestedImpl(int index,Pod item){
                    this.index = index;
                    this.builder = new PodBuilder(this, item);
            }
            PodItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPodItems(index, builder.build());
    }
    public N endPodItem(){
            return and();
    }

}
    public class ConfigMapItemsNestedImpl<N> extends ConfigMapFluentImpl<BaseKubernetesListFluent.ConfigMapItemsNested<N>> implements BaseKubernetesListFluent.ConfigMapItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
        private final int index;
    
            ConfigMapItemsNestedImpl(int index,ConfigMap item){
                    this.index = index;
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToConfigMapItems(index, builder.build());
    }
    public N endConfigMapItem(){
            return and();
    }

}
    public class CustomResourceDefinitionItemsNestedImpl<N> extends CustomResourceDefinitionFluentImpl<BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<N>> implements BaseKubernetesListFluent.CustomResourceDefinitionItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
        private final int index;
    
            CustomResourceDefinitionItemsNestedImpl(int index,CustomResourceDefinition item){
                    this.index = index;
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToCustomResourceDefinitionItems(index, builder.build());
    }
    public N endCustomResourceDefinitionItem(){
            return and();
    }

}
    public class BuildItemsNestedImpl<N> extends BuildFluentImpl<BaseKubernetesListFluent.BuildItemsNested<N>> implements BaseKubernetesListFluent.BuildItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
        private final int index;
    
            BuildItemsNestedImpl(int index,Build item){
                    this.index = index;
                    this.builder = new BuildBuilder(this, item);
            }
            BuildItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToBuildItems(index, builder.build());
    }
    public N endBuildItem(){
            return and();
    }

}
    public class ImageStreamTagItemsNestedImpl<N> extends ImageStreamTagFluentImpl<BaseKubernetesListFluent.ImageStreamTagItemsNested<N>> implements BaseKubernetesListFluent.ImageStreamTagItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
        private final int index;
    
            ImageStreamTagItemsNestedImpl(int index,ImageStreamTag item){
                    this.index = index;
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToImageStreamTagItems(index, builder.build());
    }
    public N endImageStreamTagItem(){
            return and();
    }

}
    public class GroupItemsNestedImpl<N> extends GroupFluentImpl<BaseKubernetesListFluent.GroupItemsNested<N>> implements BaseKubernetesListFluent.GroupItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
        private final int index;
    
            GroupItemsNestedImpl(int index,Group item){
                    this.index = index;
                    this.builder = new GroupBuilder(this, item);
            }
            GroupItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToGroupItems(index, builder.build());
    }
    public N endGroupItem(){
            return and();
    }

}
    public class ImageSignatureItemsNestedImpl<N> extends ImageSignatureFluentImpl<BaseKubernetesListFluent.ImageSignatureItemsNested<N>> implements BaseKubernetesListFluent.ImageSignatureItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
        private final int index;
    
            ImageSignatureItemsNestedImpl(int index,ImageSignature item){
                    this.index = index;
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToImageSignatureItems(index, builder.build());
    }
    public N endImageSignatureItem(){
            return and();
    }

}
    public class ResourceQuotaItemsNestedImpl<N> extends ResourceQuotaFluentImpl<BaseKubernetesListFluent.ResourceQuotaItemsNested<N>> implements BaseKubernetesListFluent.ResourceQuotaItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
        private final int index;
    
            ResourceQuotaItemsNestedImpl(int index,ResourceQuota item){
                    this.index = index;
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToResourceQuotaItems(index, builder.build());
    }
    public N endResourceQuotaItem(){
            return and();
    }

}
    public class BuildRequestItemsNestedImpl<N> extends BuildRequestFluentImpl<BaseKubernetesListFluent.BuildRequestItemsNested<N>> implements BaseKubernetesListFluent.BuildRequestItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
        private final int index;
    
            BuildRequestItemsNestedImpl(int index,BuildRequest item){
                    this.index = index;
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToBuildRequestItems(index, builder.build());
    }
    public N endBuildRequestItem(){
            return and();
    }

}
    public class DaemonSetItemsNestedImpl<N> extends DaemonSetFluentImpl<BaseKubernetesListFluent.DaemonSetItemsNested<N>> implements BaseKubernetesListFluent.DaemonSetItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
        private final int index;
    
            DaemonSetItemsNestedImpl(int index,DaemonSet item){
                    this.index = index;
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToDaemonSetItems(index, builder.build());
    }
    public N endDaemonSetItem(){
            return and();
    }

}
    public class ImageStreamItemsNestedImpl<N> extends ImageStreamFluentImpl<BaseKubernetesListFluent.ImageStreamItemsNested<N>> implements BaseKubernetesListFluent.ImageStreamItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
        private final int index;
    
            ImageStreamItemsNestedImpl(int index,ImageStream item){
                    this.index = index;
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToImageStreamItems(index, builder.build());
    }
    public N endImageStreamItem(){
            return and();
    }

}
    public class OpenshiftRoleItemsNestedImpl<N> extends OpenshiftRoleFluentImpl<BaseKubernetesListFluent.OpenshiftRoleItemsNested<N>> implements BaseKubernetesListFluent.OpenshiftRoleItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
        private final int index;
    
            OpenshiftRoleItemsNestedImpl(int index,OpenshiftRole item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOpenshiftRoleItems(index, builder.build());
    }
    public N endOpenshiftRoleItem(){
            return and();
    }

}
    public class OAuthClientItemsNestedImpl<N> extends OAuthClientFluentImpl<BaseKubernetesListFluent.OAuthClientItemsNested<N>> implements BaseKubernetesListFluent.OAuthClientItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
        private final int index;
    
            OAuthClientItemsNestedImpl(int index,OAuthClient item){
                    this.index = index;
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOAuthClientItems(index, builder.build());
    }
    public N endOAuthClientItem(){
            return and();
    }

}
    public class IdentityItemsNestedImpl<N> extends IdentityFluentImpl<BaseKubernetesListFluent.IdentityItemsNested<N>> implements BaseKubernetesListFluent.IdentityItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
        private final int index;
    
            IdentityItemsNestedImpl(int index,Identity item){
                    this.index = index;
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToIdentityItems(index, builder.build());
    }
    public N endIdentityItem(){
            return and();
    }

}
    public class LimitRangeItemsNestedImpl<N> extends LimitRangeFluentImpl<BaseKubernetesListFluent.LimitRangeItemsNested<N>> implements BaseKubernetesListFluent.LimitRangeItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
        private final int index;
    
            LimitRangeItemsNestedImpl(int index,LimitRange item){
                    this.index = index;
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToLimitRangeItems(index, builder.build());
    }
    public N endLimitRangeItem(){
            return and();
    }

}
    public class ImageStreamImportItemsNestedImpl<N> extends ImageStreamImportFluentImpl<BaseKubernetesListFluent.ImageStreamImportItemsNested<N>> implements BaseKubernetesListFluent.ImageStreamImportItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
        private final int index;
    
            ImageStreamImportItemsNestedImpl(int index,ImageStreamImport item){
                    this.index = index;
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToImageStreamImportItems(index, builder.build());
    }
    public N endImageStreamImportItem(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionItemsNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<N>> implements BaseKubernetesListFluent.OpenshiftRoleBindingRestrictionItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
        private final int index;
    
            OpenshiftRoleBindingRestrictionItemsNestedImpl(int index,OpenshiftRoleBindingRestriction item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOpenshiftRoleBindingRestrictionItems(index, builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionItem(){
            return and();
    }

}
    public class RoleBindingItemsNestedImpl<N> extends RoleBindingFluentImpl<BaseKubernetesListFluent.RoleBindingItemsNested<N>> implements BaseKubernetesListFluent.RoleBindingItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
        private final int index;
    
            RoleBindingItemsNestedImpl(int index,RoleBinding item){
                    this.index = index;
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToRoleBindingItems(index, builder.build());
    }
    public N endRoleBindingItem(){
            return and();
    }

}
    public class PodPresetItemsNestedImpl<N> extends PodPresetFluentImpl<BaseKubernetesListFluent.PodPresetItemsNested<N>> implements BaseKubernetesListFluent.PodPresetItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
        private final int index;
    
            PodPresetItemsNestedImpl(int index,PodPreset item){
                    this.index = index;
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPodPresetItems(index, builder.build());
    }
    public N endPodPresetItem(){
            return and();
    }

}
    public class ProjectItemsNestedImpl<N> extends ProjectFluentImpl<BaseKubernetesListFluent.ProjectItemsNested<N>> implements BaseKubernetesListFluent.ProjectItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
        private final int index;
    
            ProjectItemsNestedImpl(int index,Project item){
                    this.index = index;
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToProjectItems(index, builder.build());
    }
    public N endProjectItem(){
            return and();
    }

}
    public class BuildConfigItemsNestedImpl<N> extends BuildConfigFluentImpl<BaseKubernetesListFluent.BuildConfigItemsNested<N>> implements BaseKubernetesListFluent.BuildConfigItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
        private final int index;
    
            BuildConfigItemsNestedImpl(int index,BuildConfig item){
                    this.index = index;
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToBuildConfigItems(index, builder.build());
    }
    public N endBuildConfigItem(){
            return and();
    }

}
    public class ClusterRoleItemsNestedImpl<N> extends ClusterRoleFluentImpl<BaseKubernetesListFluent.ClusterRoleItemsNested<N>> implements BaseKubernetesListFluent.ClusterRoleItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
        private final int index;
    
            ClusterRoleItemsNestedImpl(int index,ClusterRole item){
                    this.index = index;
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToClusterRoleItems(index, builder.build());
    }
    public N endClusterRoleItem(){
            return and();
    }

}
    public class OAuthAuthorizeTokenItemsNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<N>> implements BaseKubernetesListFluent.OAuthAuthorizeTokenItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
        private final int index;
    
            OAuthAuthorizeTokenItemsNestedImpl(int index,OAuthAuthorizeToken item){
                    this.index = index;
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOAuthAuthorizeTokenItems(index, builder.build());
    }
    public N endOAuthAuthorizeTokenItem(){
            return and();
    }

}
    public class ProjectRequestItemsNestedImpl<N> extends ProjectRequestFluentImpl<BaseKubernetesListFluent.ProjectRequestItemsNested<N>> implements BaseKubernetesListFluent.ProjectRequestItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
        private final int index;
    
            ProjectRequestItemsNestedImpl(int index,ProjectRequest item){
                    this.index = index;
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToProjectRequestItems(index, builder.build());
    }
    public N endProjectRequestItem(){
            return and();
    }

}
    public class PriorityClassItemsNestedImpl<N> extends PriorityClassFluentImpl<BaseKubernetesListFluent.PriorityClassItemsNested<N>> implements BaseKubernetesListFluent.PriorityClassItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
        private final int index;
    
            PriorityClassItemsNestedImpl(int index,PriorityClass item){
                    this.index = index;
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPriorityClassItems(index, builder.build());
    }
    public N endPriorityClassItem(){
            return and();
    }

}
    public class TemplateItemsNestedImpl<N> extends TemplateFluentImpl<BaseKubernetesListFluent.TemplateItemsNested<N>> implements BaseKubernetesListFluent.TemplateItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
        private final int index;
    
            TemplateItemsNestedImpl(int index,Template item){
                    this.index = index;
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToTemplateItems(index, builder.build());
    }
    public N endTemplateItem(){
            return and();
    }

}
    public class OAuthClientAuthorizationItemsNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<N>> implements BaseKubernetesListFluent.OAuthClientAuthorizationItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
        private final int index;
    
            OAuthClientAuthorizationItemsNestedImpl(int index,OAuthClientAuthorization item){
                    this.index = index;
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOAuthClientAuthorizationItems(index, builder.build());
    }
    public N endOAuthClientAuthorizationItem(){
            return and();
    }

}
    public class DeploymentItemsNestedImpl<N> extends DeploymentFluentImpl<BaseKubernetesListFluent.DeploymentItemsNested<N>> implements BaseKubernetesListFluent.DeploymentItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
        private final int index;
    
            DeploymentItemsNestedImpl(int index,Deployment item){
                    this.index = index;
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToDeploymentItems(index, builder.build());
    }
    public N endDeploymentItem(){
            return and();
    }

}
    public class PodTemplateItemsNestedImpl<N> extends PodTemplateFluentImpl<BaseKubernetesListFluent.PodTemplateItemsNested<N>> implements BaseKubernetesListFluent.PodTemplateItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
        private final int index;
    
            PodTemplateItemsNestedImpl(int index,PodTemplate item){
                    this.index = index;
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPodTemplateItems(index, builder.build());
    }
    public N endPodTemplateItem(){
            return and();
    }

}
    public class EventItemsNestedImpl<N> extends EventFluentImpl<BaseKubernetesListFluent.EventItemsNested<N>> implements BaseKubernetesListFluent.EventItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
        private final int index;
    
            EventItemsNestedImpl(int index,Event item){
                    this.index = index;
                    this.builder = new EventBuilder(this, item);
            }
            EventItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToEventItems(index, builder.build());
    }
    public N endEventItem(){
            return and();
    }

}
    public class IngressItemsNestedImpl<N> extends IngressFluentImpl<BaseKubernetesListFluent.IngressItemsNested<N>> implements BaseKubernetesListFluent.IngressItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
        private final int index;
    
            IngressItemsNestedImpl(int index,Ingress item){
                    this.index = index;
                    this.builder = new IngressBuilder(this, item);
            }
            IngressItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToIngressItems(index, builder.build());
    }
    public N endIngressItem(){
            return and();
    }

}
    public class DeploymentConfigItemsNestedImpl<N> extends DeploymentConfigFluentImpl<BaseKubernetesListFluent.DeploymentConfigItemsNested<N>> implements BaseKubernetesListFluent.DeploymentConfigItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
        private final int index;
    
            DeploymentConfigItemsNestedImpl(int index,DeploymentConfig item){
                    this.index = index;
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToDeploymentConfigItems(index, builder.build());
    }
    public N endDeploymentConfigItem(){
            return and();
    }

}
    public class OAuthAccessTokenItemsNestedImpl<N> extends OAuthAccessTokenFluentImpl<BaseKubernetesListFluent.OAuthAccessTokenItemsNested<N>> implements BaseKubernetesListFluent.OAuthAccessTokenItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
        private final int index;
    
            OAuthAccessTokenItemsNestedImpl(int index,OAuthAccessToken item){
                    this.index = index;
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOAuthAccessTokenItems(index, builder.build());
    }
    public N endOAuthAccessTokenItem(){
            return and();
    }

}
    public class PersistentVolumeItemsNestedImpl<N> extends PersistentVolumeFluentImpl<BaseKubernetesListFluent.PersistentVolumeItemsNested<N>> implements BaseKubernetesListFluent.PersistentVolumeItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
        private final int index;
    
            PersistentVolumeItemsNestedImpl(int index,PersistentVolume item){
                    this.index = index;
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPersistentVolumeItems(index, builder.build());
    }
    public N endPersistentVolumeItem(){
            return and();
    }

}
    public class PersistentVolumeClaimItemsNestedImpl<N> extends PersistentVolumeClaimFluentImpl<BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<N>> implements BaseKubernetesListFluent.PersistentVolumeClaimItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
        private final int index;
    
            PersistentVolumeClaimItemsNestedImpl(int index,PersistentVolumeClaim item){
                    this.index = index;
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToPersistentVolumeClaimItems(index, builder.build());
    }
    public N endPersistentVolumeClaimItem(){
            return and();
    }

}
    public class EventsEventItemsNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<BaseKubernetesListFluent.EventsEventItemsNested<N>> implements BaseKubernetesListFluent.EventsEventItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
        private final int index;
    
            EventsEventItemsNestedImpl(int index,io.fabric8.kubernetes.api.model.events.Event item){
                    this.index = index;
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToEventItems(index, builder.build());
    }
    public N endEventsEventItem(){
            return and();
    }

}
    public class StatefulSetItemsNestedImpl<N> extends StatefulSetFluentImpl<BaseKubernetesListFluent.StatefulSetItemsNested<N>> implements BaseKubernetesListFluent.StatefulSetItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
        private final int index;
    
            StatefulSetItemsNestedImpl(int index,StatefulSet item){
                    this.index = index;
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToStatefulSetItems(index, builder.build());
    }
    public N endStatefulSetItem(){
            return and();
    }

}
    public class OpenshiftClusterRoleItemsNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<N>> implements BaseKubernetesListFluent.OpenshiftClusterRoleItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
        private final int index;
    
            OpenshiftClusterRoleItemsNestedImpl(int index,OpenshiftClusterRole item){
                    this.index = index;
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToOpenshiftClusterRoleItems(index, builder.build());
    }
    public N endOpenshiftClusterRoleItem(){
            return and();
    }

}
    public class RoleItemsNestedImpl<N> extends RoleFluentImpl<BaseKubernetesListFluent.RoleItemsNested<N>> implements BaseKubernetesListFluent.RoleItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
        private final int index;
    
            RoleItemsNestedImpl(int index,Role item){
                    this.index = index;
                    this.builder = new RoleBuilder(this, item);
            }
            RoleItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToRoleItems(index, builder.build());
    }
    public N endRoleItem(){
            return and();
    }

}
    public class UserItemsNestedImpl<N> extends UserFluentImpl<BaseKubernetesListFluent.UserItemsNested<N>> implements BaseKubernetesListFluent.UserItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
        private final int index;
    
            UserItemsNestedImpl(int index,User item){
                    this.index = index;
                    this.builder = new UserBuilder(this, item);
            }
            UserItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToUserItems(index, builder.build());
    }
    public N endUserItem(){
            return and();
    }

}
    public class ComponentStatusItemsNestedImpl<N> extends ComponentStatusFluentImpl<BaseKubernetesListFluent.ComponentStatusItemsNested<N>> implements BaseKubernetesListFluent.ComponentStatusItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
        private final int index;
    
            ComponentStatusItemsNestedImpl(int index,ComponentStatus item){
                    this.index = index;
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToComponentStatusItems(index, builder.build());
    }
    public N endComponentStatusItem(){
            return and();
    }

}
    public class TokenReviewItemsNestedImpl<N> extends TokenReviewFluentImpl<BaseKubernetesListFluent.TokenReviewItemsNested<N>> implements BaseKubernetesListFluent.TokenReviewItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
        private final int index;
    
            TokenReviewItemsNestedImpl(int index,TokenReview item){
                    this.index = index;
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToTokenReviewItems(index, builder.build());
    }
    public N endTokenReviewItem(){
            return and();
    }

}
    public class BindingItemsNestedImpl<N> extends BindingFluentImpl<BaseKubernetesListFluent.BindingItemsNested<N>> implements BaseKubernetesListFluent.BindingItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
        private final int index;
    
            BindingItemsNestedImpl(int index,Binding item){
                    this.index = index;
                    this.builder = new BindingBuilder(this, item);
            }
            BindingItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToBindingItems(index, builder.build());
    }
    public N endBindingItem(){
            return and();
    }

}
    public class SecretItemsNestedImpl<N> extends SecretFluentImpl<BaseKubernetesListFluent.SecretItemsNested<N>> implements BaseKubernetesListFluent.SecretItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
        private final int index;
    
            SecretItemsNestedImpl(int index,Secret item){
                    this.index = index;
                    this.builder = new SecretBuilder(this, item);
            }
            SecretItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToSecretItems(index, builder.build());
    }
    public N endSecretItem(){
            return and();
    }

}
    public class SecurityContextConstraintsItemsNestedImpl<N> extends SecurityContextConstraintsFluentImpl<BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<N>> implements BaseKubernetesListFluent.SecurityContextConstraintsItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
        private final int index;
    
            SecurityContextConstraintsItemsNestedImpl(int index,SecurityContextConstraints item){
                    this.index = index;
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToSecurityContextConstraintsItems(index, builder.build());
    }
    public N endSecurityContextConstraintsItem(){
            return and();
    }

}
    public class NetNamespaceItemsNestedImpl<N> extends NetNamespaceFluentImpl<BaseKubernetesListFluent.NetNamespaceItemsNested<N>> implements BaseKubernetesListFluent.NetNamespaceItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
        private final int index;
    
            NetNamespaceItemsNestedImpl(int index,NetNamespace item){
                    this.index = index;
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToNetNamespaceItems(index, builder.build());
    }
    public N endNetNamespaceItem(){
            return and();
    }

}
    public class NodeItemsNestedImpl<N> extends NodeFluentImpl<BaseKubernetesListFluent.NodeItemsNested<N>> implements BaseKubernetesListFluent.NodeItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
        private final int index;
    
            NodeItemsNestedImpl(int index,Node item){
                    this.index = index;
                    this.builder = new NodeBuilder(this, item);
            }
            NodeItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToNodeItems(index, builder.build());
    }
    public N endNodeItem(){
            return and();
    }

}
    public class JobItemsNestedImpl<N> extends JobFluentImpl<BaseKubernetesListFluent.JobItemsNested<N>> implements BaseKubernetesListFluent.JobItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
        private final int index;
    
            JobItemsNestedImpl(int index,Job item){
                    this.index = index;
                    this.builder = new JobBuilder(this, item);
            }
            JobItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToJobItems(index, builder.build());
    }
    public N endJobItem(){
            return and();
    }

}
    public class CertificateSigningRequestItemsNestedImpl<N> extends CertificateSigningRequestFluentImpl<BaseKubernetesListFluent.CertificateSigningRequestItemsNested<N>> implements BaseKubernetesListFluent.CertificateSigningRequestItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
        private final int index;
    
            CertificateSigningRequestItemsNestedImpl(int index,CertificateSigningRequest item){
                    this.index = index;
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToCertificateSigningRequestItems(index, builder.build());
    }
    public N endCertificateSigningRequestItem(){
            return and();
    }

}
    public class ServiceAccountItemsNestedImpl<N> extends ServiceAccountFluentImpl<BaseKubernetesListFluent.ServiceAccountItemsNested<N>> implements BaseKubernetesListFluent.ServiceAccountItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
        private final int index;
    
            ServiceAccountItemsNestedImpl(int index,ServiceAccount item){
                    this.index = index;
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.setToServiceAccountItems(index, builder.build());
    }
    public N endServiceAccountItem(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ListMetaFluentImpl<BaseKubernetesListFluent.MetadataNested<N>> implements BaseKubernetesListFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            MetadataNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) BaseKubernetesListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
