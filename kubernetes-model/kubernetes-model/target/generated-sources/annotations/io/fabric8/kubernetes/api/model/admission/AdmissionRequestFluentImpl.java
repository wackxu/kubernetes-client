package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluentImpl;
import java.lang.String;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluentImpl;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluentImpl;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.PodBuilder;
import io.fabric8.kubernetes.api.model.GroupVersionResourceBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.openshift.api.model.BuildRequestFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.kubernetes.api.model.GroupVersionKindBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.openshift.api.model.ImageSignatureBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluentImpl;
import io.fabric8.kubernetes.api.model.PodTemplateBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluentImpl;
import io.fabric8.kubernetes.api.model.LimitRangeBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimBuilder;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimFluentImpl;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.ImageFluentImpl;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.openshift.api.model.ProjectFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.UserInfo;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.SecretFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.UserInfoBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.openshift.api.model.Image;
import io.fabric8.openshift.api.model.ImageStreamBuilder;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.kubernetes.api.model.authentication.UserInfoFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.openshift.api.model.BuildBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluentImpl;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.openshift.api.model.OpenshiftRoleFluentImpl;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.openshift.api.model.ImageSignature;
import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.openshift.api.model.GroupFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.ServiceAccountBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.kubernetes.api.model.ResourceQuotaFluentImpl;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.kubernetes.api.model.ComponentStatusBuilder;
import io.fabric8.openshift.api.model.NetNamespaceFluentImpl;
import io.fabric8.kubernetes.api.model.Endpoints;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluentImpl;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;
import io.fabric8.kubernetes.api.model.NodeFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolumeFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.Node;
import io.fabric8.kubernetes.api.model.NodeBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.SecretBuilder;
import io.fabric8.kubernetes.api.model.ReplicationController;
import io.fabric8.kubernetes.api.model.PodTemplateFluentImpl;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.GroupVersionResourceFluentImpl;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.kubernetes.api.model.ReplicationControllerFluentImpl;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.kubernetes.api.model.EndpointsBuilder;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.openshift.api.model.IdentityFluentImpl;
import io.fabric8.kubernetes.api.model.PodFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.openshift.api.model.BuildConfigFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.EventBuilder;
import io.fabric8.kubernetes.api.model.ConfigMapFluentImpl;
import io.fabric8.openshift.api.model.ImageSignatureFluentImpl;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluentImpl;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.openshift.api.model.RouteFluentImpl;
import io.fabric8.kubernetes.api.model.PodTemplate;
import io.fabric8.kubernetes.api.model.Binding;
import io.fabric8.openshift.api.model.ProjectRequestFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportFluentImpl;
import io.fabric8.kubernetes.api.model.batch.JobFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.GroupVersionResource;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluentImpl;
import io.fabric8.kubernetes.api.model.GroupVersionKind;
import io.fabric8.openshift.api.model.ImageBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.openshift.api.model.UserFluentImpl;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluentImpl;
import io.fabric8.kubernetes.api.model.EndpointsFluentImpl;
import io.fabric8.kubernetes.api.model.ServiceAccountFluentImpl;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerFluentImpl;
import io.fabric8.openshift.api.model.Identity;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.GroupVersionKindFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluentImpl;
import io.fabric8.kubernetes.api.model.BindingFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluentImpl;
import io.fabric8.kubernetes.api.model.Namespace;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.ComponentStatus;
import io.fabric8.openshift.api.model.ProjectRequest;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluentImpl;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagFluentImpl;
import io.fabric8.kubernetes.api.model.ComponentStatusFluentImpl;
import io.fabric8.openshift.api.model.TemplateFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigFluentImpl;
import io.fabric8.kubernetes.api.model.LimitRangeFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.kubernetes.api.model.rbac.RoleFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolumeBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluentImpl;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.EventFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluentImpl;
import io.fabric8.openshift.api.model.BuildConfigBuilder;
import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.model.ReplicationControllerBuilder;
import io.fabric8.kubernetes.api.model.ResourceQuotaBuilder;
import io.fabric8.openshift.api.model.BuildFluentImpl;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.openshift.api.model.OAuthClientFluentImpl;
import io.fabric8.kubernetes.api.model.LimitRange;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.ImageStreamFluentImpl;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.BindingBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerBuilder;
import io.fabric8.kubernetes.api.model.ServiceBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobFluentImpl;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.NamespaceFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.ServiceFluentImpl;

public class AdmissionRequestFluentImpl<A extends AdmissionRequestFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AdmissionRequestFluent<A>{

    private Boolean dryRun;
    private GroupVersionKindBuilder kind;
    private String name;
    private String namespace;
    private VisitableBuilder<? extends HasMetadata,?> object;
    private VisitableBuilder<? extends HasMetadata,?> oldObject;
    private String operation;
    private GroupVersionResourceBuilder resource;
    private String subResource;
    private String uid;
    private UserInfoBuilder userInfo;

    public AdmissionRequestFluentImpl(){
    }
    public AdmissionRequestFluentImpl(AdmissionRequest instance){
            this.withDryRun(instance.getDryRun()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withObject(instance.getObject()); 
            this.withOldObject(instance.getOldObject()); 
            this.withOperation(instance.getOperation()); 
            this.withResource(instance.getResource()); 
            this.withSubResource(instance.getSubResource()); 
            this.withUid(instance.getUid()); 
            this.withUserInfo(instance.getUserInfo()); 
    }

    public Boolean isDryRun(){
            return this.dryRun;
    }

    public A withDryRun(Boolean dryRun){
            this.dryRun=dryRun; return (A) this;
    }

    public Boolean hasDryRun(){
            return this.dryRun != null;
    }

    public A withNewDryRun(String arg1){
            return (A)withDryRun(new Boolean(arg1));
    }

    public A withNewDryRun(boolean arg1){
            return (A)withDryRun(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildKind instead.
 * @return The buildable object.
 */
@Deprecated public GroupVersionKind getKind(){
            return this.kind!=null?this.kind.build():null;
    }

    public GroupVersionKind buildKind(){
            return this.kind!=null?this.kind.build():null;
    }

    public A withKind(GroupVersionKind kind){
            _visitables.remove(this.kind);
            if (kind!=null){ this.kind= new GroupVersionKindBuilder(kind); _visitables.add(this.kind);} return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public A withNewKind(String group,String kind,String version){
            return (A)withKind(new GroupVersionKind(group, kind, version));
    }

    public AdmissionRequestFluent.KindNested<A> withNewKind(){
            return new KindNestedImpl();
    }

    public AdmissionRequestFluent.KindNested<A> withNewKindLike(GroupVersionKind item){
            return new KindNestedImpl(item);
    }

    public AdmissionRequestFluent.KindNested<A> editKind(){
            return withNewKindLike(getKind());
    }

    public AdmissionRequestFluent.KindNested<A> editOrNewKind(){
            return withNewKindLike(getKind() != null ? getKind(): new GroupVersionKindBuilder().build());
    }

    public AdmissionRequestFluent.KindNested<A> editOrNewKindLike(GroupVersionKind item){
            return withNewKindLike(getKind() != null ? getKind(): item);
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getObject(){
            return this.object!=null?this.object.build():null;
    }

    public HasMetadata buildObject(){
            return this.object!=null?this.object.build():null;
    }

    public A withObject(HasMetadata object){
            if (object instanceof ValidatingWebhookConfiguration){ this.object= new ValidatingWebhookConfigurationBuilder((ValidatingWebhookConfiguration)object); _visitables.add(this.object);}
            if (object instanceof StorageClass){ this.object= new StorageClassBuilder((StorageClass)object); _visitables.add(this.object);}
            if (object instanceof ClusterRoleBinding){ this.object= new ClusterRoleBindingBuilder((ClusterRoleBinding)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleBinding){ this.object= new OpenshiftRoleBindingBuilder((OpenshiftRoleBinding)object); _visitables.add(this.object);}
            if (object instanceof PodDisruptionBudget){ this.object= new PodDisruptionBudgetBuilder((PodDisruptionBudget)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicy){ this.object= new NetworkPolicyBuilder((NetworkPolicy)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftClusterRoleBinding){ this.object= new OpenshiftClusterRoleBindingBuilder((OpenshiftClusterRoleBinding)object); _visitables.add(this.object);}
            if (object instanceof Route){ this.object= new RouteBuilder((Route)object); _visitables.add(this.object);}
            if (object instanceof Namespace){ this.object= new NamespaceBuilder((Namespace)object); _visitables.add(this.object);}
            if (object instanceof LocalSubjectAccessReview){ this.object= new LocalSubjectAccessReviewBuilder((LocalSubjectAccessReview)object); _visitables.add(this.object);}
            if (object instanceof Service){ this.object= new ServiceBuilder((Service)object); _visitables.add(this.object);}
            if (object instanceof ReplicationController){ this.object= new ReplicationControllerBuilder((ReplicationController)object); _visitables.add(this.object);}
            if (object instanceof SubjectAccessReview){ this.object= new SubjectAccessReviewBuilder((SubjectAccessReview)object); _visitables.add(this.object);}
            if (object instanceof MutatingWebhookConfiguration){ this.object= new MutatingWebhookConfigurationBuilder((MutatingWebhookConfiguration)object); _visitables.add(this.object);}
            if (object instanceof HorizontalPodAutoscaler){ this.object= new HorizontalPodAutoscalerBuilder((HorizontalPodAutoscaler)object); _visitables.add(this.object);}
            if (object instanceof Scale){ this.object= new ScaleBuilder((Scale)object); _visitables.add(this.object);}
            if (object instanceof Image){ this.object= new ImageBuilder((Image)object); _visitables.add(this.object);}
            if (object instanceof ReplicaSet){ this.object= new ReplicaSetBuilder((ReplicaSet)object); _visitables.add(this.object);}
            if (object instanceof PodSecurityPolicy){ this.object= new PodSecurityPolicyBuilder((PodSecurityPolicy)object); _visitables.add(this.object);}
            if (object instanceof CronJob){ this.object= new CronJobBuilder((CronJob)object); _visitables.add(this.object);}
            if (object instanceof Endpoints){ this.object= new EndpointsBuilder((Endpoints)object); _visitables.add(this.object);}
            if (object instanceof Pod){ this.object= new PodBuilder((Pod)object); _visitables.add(this.object);}
            if (object instanceof ConfigMap){ this.object= new ConfigMapBuilder((ConfigMap)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinition){ this.object= new CustomResourceDefinitionBuilder((CustomResourceDefinition)object); _visitables.add(this.object);}
            if (object instanceof Build){ this.object= new BuildBuilder((Build)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamTag){ this.object= new ImageStreamTagBuilder((ImageStreamTag)object); _visitables.add(this.object);}
            if (object instanceof Group){ this.object= new GroupBuilder((Group)object); _visitables.add(this.object);}
            if (object instanceof ImageSignature){ this.object= new ImageSignatureBuilder((ImageSignature)object); _visitables.add(this.object);}
            if (object instanceof ResourceQuota){ this.object= new ResourceQuotaBuilder((ResourceQuota)object); _visitables.add(this.object);}
            if (object instanceof BuildRequest){ this.object= new BuildRequestBuilder((BuildRequest)object); _visitables.add(this.object);}
            if (object instanceof DaemonSet){ this.object= new DaemonSetBuilder((DaemonSet)object); _visitables.add(this.object);}
            if (object instanceof ImageStream){ this.object= new ImageStreamBuilder((ImageStream)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRole){ this.object= new OpenshiftRoleBuilder((OpenshiftRole)object); _visitables.add(this.object);}
            if (object instanceof OAuthClient){ this.object= new OAuthClientBuilder((OAuthClient)object); _visitables.add(this.object);}
            if (object instanceof Identity){ this.object= new IdentityBuilder((Identity)object); _visitables.add(this.object);}
            if (object instanceof LimitRange){ this.object= new LimitRangeBuilder((LimitRange)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamImport){ this.object= new ImageStreamImportBuilder((ImageStreamImport)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleBindingRestriction){ this.object= new OpenshiftRoleBindingRestrictionBuilder((OpenshiftRoleBindingRestriction)object); _visitables.add(this.object);}
            if (object instanceof RoleBinding){ this.object= new RoleBindingBuilder((RoleBinding)object); _visitables.add(this.object);}
            if (object instanceof PodPreset){ this.object= new PodPresetBuilder((PodPreset)object); _visitables.add(this.object);}
            if (object instanceof Project){ this.object= new ProjectBuilder((Project)object); _visitables.add(this.object);}
            if (object instanceof BuildConfig){ this.object= new BuildConfigBuilder((BuildConfig)object); _visitables.add(this.object);}
            if (object instanceof ClusterRole){ this.object= new ClusterRoleBuilder((ClusterRole)object); _visitables.add(this.object);}
            if (object instanceof OAuthAuthorizeToken){ this.object= new OAuthAuthorizeTokenBuilder((OAuthAuthorizeToken)object); _visitables.add(this.object);}
            if (object instanceof ProjectRequest){ this.object= new ProjectRequestBuilder((ProjectRequest)object); _visitables.add(this.object);}
            if (object instanceof PriorityClass){ this.object= new PriorityClassBuilder((PriorityClass)object); _visitables.add(this.object);}
            if (object instanceof Template){ this.object= new TemplateBuilder((Template)object); _visitables.add(this.object);}
            if (object instanceof OAuthClientAuthorization){ this.object= new OAuthClientAuthorizationBuilder((OAuthClientAuthorization)object); _visitables.add(this.object);}
            if (object instanceof Deployment){ this.object= new DeploymentBuilder((Deployment)object); _visitables.add(this.object);}
            if (object instanceof PodTemplate){ this.object= new PodTemplateBuilder((PodTemplate)object); _visitables.add(this.object);}
            if (object instanceof Event){ this.object= new EventBuilder((Event)object); _visitables.add(this.object);}
            if (object instanceof Ingress){ this.object= new IngressBuilder((Ingress)object); _visitables.add(this.object);}
            if (object instanceof DeploymentConfig){ this.object= new DeploymentConfigBuilder((DeploymentConfig)object); _visitables.add(this.object);}
            if (object instanceof OAuthAccessToken){ this.object= new OAuthAccessTokenBuilder((OAuthAccessToken)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolume){ this.object= new PersistentVolumeBuilder((PersistentVolume)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaim){ this.object= new PersistentVolumeClaimBuilder((PersistentVolumeClaim)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.kubernetes.api.model.events.Event){ this.object= new io.fabric8.kubernetes.api.model.events.EventBuilder((io.fabric8.kubernetes.api.model.events.Event)object); _visitables.add(this.object);}
            if (object instanceof StatefulSet){ this.object= new StatefulSetBuilder((StatefulSet)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftClusterRole){ this.object= new OpenshiftClusterRoleBuilder((OpenshiftClusterRole)object); _visitables.add(this.object);}
            if (object instanceof Role){ this.object= new RoleBuilder((Role)object); _visitables.add(this.object);}
            if (object instanceof User){ this.object= new UserBuilder((User)object); _visitables.add(this.object);}
            if (object instanceof ComponentStatus){ this.object= new ComponentStatusBuilder((ComponentStatus)object); _visitables.add(this.object);}
            if (object instanceof TokenReview){ this.object= new TokenReviewBuilder((TokenReview)object); _visitables.add(this.object);}
            if (object instanceof Binding){ this.object= new BindingBuilder((Binding)object); _visitables.add(this.object);}
            if (object instanceof Secret){ this.object= new SecretBuilder((Secret)object); _visitables.add(this.object);}
            if (object instanceof SecurityContextConstraints){ this.object= new SecurityContextConstraintsBuilder((SecurityContextConstraints)object); _visitables.add(this.object);}
            if (object instanceof NetNamespace){ this.object= new NetNamespaceBuilder((NetNamespace)object); _visitables.add(this.object);}
            if (object instanceof Node){ this.object= new NodeBuilder((Node)object); _visitables.add(this.object);}
            if (object instanceof Job){ this.object= new JobBuilder((Job)object); _visitables.add(this.object);}
            if (object instanceof CertificateSigningRequest){ this.object= new CertificateSigningRequestBuilder((CertificateSigningRequest)object); _visitables.add(this.object);}
            if (object instanceof ServiceAccount){ this.object= new ServiceAccountBuilder((ServiceAccount)object); _visitables.add(this.object);}
            return (A) this;
    }

    public Boolean hasObject(){
            return this.object != null;
    }

    public A withValidatingWebhookConfigurationObject(ValidatingWebhookConfiguration validatingWebhookConfigurationObject){
            _visitables.remove(this.object);
            if (validatingWebhookConfigurationObject!=null){ this.object= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfigurationObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObject(){
            return new ValidatingWebhookConfigurationObjectNestedImpl();
    }

    public AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObjectLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationObjectNestedImpl(item);
    }

    public A withStorageClassObject(StorageClass storageClassObject){
            _visitables.remove(this.object);
            if (storageClassObject!=null){ this.object= new StorageClassBuilder(storageClassObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.StorageClassObjectNested<A> withNewStorageClassObject(){
            return new StorageClassObjectNestedImpl();
    }

    public AdmissionRequestFluent.StorageClassObjectNested<A> withNewStorageClassObjectLike(StorageClass item){
            return new StorageClassObjectNestedImpl(item);
    }

    public A withClusterRoleBindingObject(ClusterRoleBinding clusterRoleBindingObject){
            _visitables.remove(this.object);
            if (clusterRoleBindingObject!=null){ this.object= new ClusterRoleBindingBuilder(clusterRoleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObject(){
            return new ClusterRoleBindingObjectNestedImpl();
    }

    public AdmissionRequestFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObjectLike(ClusterRoleBinding item){
            return new ClusterRoleBindingObjectNestedImpl(item);
    }

    public A withOpenshiftRoleBindingObject(OpenshiftRoleBinding openshiftRoleBindingObject){
            _visitables.remove(this.object);
            if (openshiftRoleBindingObject!=null){ this.object= new OpenshiftRoleBindingBuilder(openshiftRoleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObject(){
            return new OpenshiftRoleBindingObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObjectLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingObjectNestedImpl(item);
    }

    public A withPodDisruptionBudgetObject(PodDisruptionBudget podDisruptionBudgetObject){
            _visitables.remove(this.object);
            if (podDisruptionBudgetObject!=null){ this.object= new PodDisruptionBudgetBuilder(podDisruptionBudgetObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObject(){
            return new PodDisruptionBudgetObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObjectLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetObjectNestedImpl(item);
    }

    public A withNetworkPolicyObject(NetworkPolicy networkPolicyObject){
            _visitables.remove(this.object);
            if (networkPolicyObject!=null){ this.object= new NetworkPolicyBuilder(networkPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObject(){
            return new NetworkPolicyObjectNestedImpl();
    }

    public AdmissionRequestFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObjectLike(NetworkPolicy item){
            return new NetworkPolicyObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingObject(OpenshiftClusterRoleBinding openshiftClusterRoleBindingObject){
            _visitables.remove(this.object);
            if (openshiftClusterRoleBindingObject!=null){ this.object= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObject(){
            return new OpenshiftClusterRoleBindingObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObjectLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingObjectNestedImpl(item);
    }

    public A withRouteObject(Route routeObject){
            _visitables.remove(this.object);
            if (routeObject!=null){ this.object= new RouteBuilder(routeObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.RouteObjectNested<A> withNewRouteObject(){
            return new RouteObjectNestedImpl();
    }

    public AdmissionRequestFluent.RouteObjectNested<A> withNewRouteObjectLike(Route item){
            return new RouteObjectNestedImpl(item);
    }

    public A withNamespaceObject(Namespace namespaceObject){
            _visitables.remove(this.object);
            if (namespaceObject!=null){ this.object= new NamespaceBuilder(namespaceObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.NamespaceObjectNested<A> withNewNamespaceObject(){
            return new NamespaceObjectNestedImpl();
    }

    public AdmissionRequestFluent.NamespaceObjectNested<A> withNewNamespaceObjectLike(Namespace item){
            return new NamespaceObjectNestedImpl(item);
    }

    public A withLocalSubjectAccessReviewObject(LocalSubjectAccessReview localSubjectAccessReviewObject){
            _visitables.remove(this.object);
            if (localSubjectAccessReviewObject!=null){ this.object= new LocalSubjectAccessReviewBuilder(localSubjectAccessReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObject(){
            return new LocalSubjectAccessReviewObjectNestedImpl();
    }

    public AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObjectLike(LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewObjectNestedImpl(item);
    }

    public A withServiceObject(Service serviceObject){
            _visitables.remove(this.object);
            if (serviceObject!=null){ this.object= new ServiceBuilder(serviceObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ServiceObjectNested<A> withNewServiceObject(){
            return new ServiceObjectNestedImpl();
    }

    public AdmissionRequestFluent.ServiceObjectNested<A> withNewServiceObjectLike(Service item){
            return new ServiceObjectNestedImpl(item);
    }

    public A withReplicationControllerObject(ReplicationController replicationControllerObject){
            _visitables.remove(this.object);
            if (replicationControllerObject!=null){ this.object= new ReplicationControllerBuilder(replicationControllerObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObject(){
            return new ReplicationControllerObjectNestedImpl();
    }

    public AdmissionRequestFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObjectLike(ReplicationController item){
            return new ReplicationControllerObjectNestedImpl(item);
    }

    public A withSubjectAccessReviewObject(SubjectAccessReview subjectAccessReviewObject){
            _visitables.remove(this.object);
            if (subjectAccessReviewObject!=null){ this.object= new SubjectAccessReviewBuilder(subjectAccessReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObject(){
            return new SubjectAccessReviewObjectNestedImpl();
    }

    public AdmissionRequestFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObjectLike(SubjectAccessReview item){
            return new SubjectAccessReviewObjectNestedImpl(item);
    }

    public A withMutatingWebhookConfigurationObject(MutatingWebhookConfiguration mutatingWebhookConfigurationObject){
            _visitables.remove(this.object);
            if (mutatingWebhookConfigurationObject!=null){ this.object= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfigurationObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObject(){
            return new MutatingWebhookConfigurationObjectNestedImpl();
    }

    public AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObjectLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationObjectNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerObject(HorizontalPodAutoscaler horizontalPodAutoscalerObject){
            _visitables.remove(this.object);
            if (horizontalPodAutoscalerObject!=null){ this.object= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscalerObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObject(){
            return new HorizontalPodAutoscalerObjectNestedImpl();
    }

    public AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObjectLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerObjectNestedImpl(item);
    }

    public A withScaleObject(Scale scaleObject){
            _visitables.remove(this.object);
            if (scaleObject!=null){ this.object= new ScaleBuilder(scaleObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ScaleObjectNested<A> withNewScaleObject(){
            return new ScaleObjectNestedImpl();
    }

    public AdmissionRequestFluent.ScaleObjectNested<A> withNewScaleObjectLike(Scale item){
            return new ScaleObjectNestedImpl(item);
    }

    public A withImageObject(Image imageObject){
            _visitables.remove(this.object);
            if (imageObject!=null){ this.object= new ImageBuilder(imageObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ImageObjectNested<A> withNewImageObject(){
            return new ImageObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageObjectNested<A> withNewImageObjectLike(Image item){
            return new ImageObjectNestedImpl(item);
    }

    public A withReplicaSetObject(ReplicaSet replicaSetObject){
            _visitables.remove(this.object);
            if (replicaSetObject!=null){ this.object= new ReplicaSetBuilder(replicaSetObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ReplicaSetObjectNested<A> withNewReplicaSetObject(){
            return new ReplicaSetObjectNestedImpl();
    }

    public AdmissionRequestFluent.ReplicaSetObjectNested<A> withNewReplicaSetObjectLike(ReplicaSet item){
            return new ReplicaSetObjectNestedImpl(item);
    }

    public A withPodSecurityPolicyObject(PodSecurityPolicy podSecurityPolicyObject){
            _visitables.remove(this.object);
            if (podSecurityPolicyObject!=null){ this.object= new PodSecurityPolicyBuilder(podSecurityPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObject(){
            return new PodSecurityPolicyObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObjectLike(PodSecurityPolicy item){
            return new PodSecurityPolicyObjectNestedImpl(item);
    }

    public A withCronJobObject(CronJob cronJobObject){
            _visitables.remove(this.object);
            if (cronJobObject!=null){ this.object= new CronJobBuilder(cronJobObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.CronJobObjectNested<A> withNewCronJobObject(){
            return new CronJobObjectNestedImpl();
    }

    public AdmissionRequestFluent.CronJobObjectNested<A> withNewCronJobObjectLike(CronJob item){
            return new CronJobObjectNestedImpl(item);
    }

    public A withEndpointsObject(Endpoints endpointsObject){
            _visitables.remove(this.object);
            if (endpointsObject!=null){ this.object= new EndpointsBuilder(endpointsObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.EndpointsObjectNested<A> withNewEndpointsObject(){
            return new EndpointsObjectNestedImpl();
    }

    public AdmissionRequestFluent.EndpointsObjectNested<A> withNewEndpointsObjectLike(Endpoints item){
            return new EndpointsObjectNestedImpl(item);
    }

    public A withPodObject(Pod podObject){
            _visitables.remove(this.object);
            if (podObject!=null){ this.object= new PodBuilder(podObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PodObjectNested<A> withNewPodObject(){
            return new PodObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodObjectNested<A> withNewPodObjectLike(Pod item){
            return new PodObjectNestedImpl(item);
    }

    public A withConfigMapObject(ConfigMap configMapObject){
            _visitables.remove(this.object);
            if (configMapObject!=null){ this.object= new ConfigMapBuilder(configMapObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ConfigMapObjectNested<A> withNewConfigMapObject(){
            return new ConfigMapObjectNestedImpl();
    }

    public AdmissionRequestFluent.ConfigMapObjectNested<A> withNewConfigMapObjectLike(ConfigMap item){
            return new ConfigMapObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionObject(CustomResourceDefinition customResourceDefinitionObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionObject!=null){ this.object= new CustomResourceDefinitionBuilder(customResourceDefinitionObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObject(){
            return new CustomResourceDefinitionObjectNestedImpl();
    }

    public AdmissionRequestFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObjectLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionObjectNestedImpl(item);
    }

    public A withBuildObject(Build buildObject){
            _visitables.remove(this.object);
            if (buildObject!=null){ this.object= new BuildBuilder(buildObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.BuildObjectNested<A> withNewBuildObject(){
            return new BuildObjectNestedImpl();
    }

    public AdmissionRequestFluent.BuildObjectNested<A> withNewBuildObjectLike(Build item){
            return new BuildObjectNestedImpl(item);
    }

    public A withImageStreamTagObject(ImageStreamTag imageStreamTagObject){
            _visitables.remove(this.object);
            if (imageStreamTagObject!=null){ this.object= new ImageStreamTagBuilder(imageStreamTagObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObject(){
            return new ImageStreamTagObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObjectLike(ImageStreamTag item){
            return new ImageStreamTagObjectNestedImpl(item);
    }

    public A withGroupObject(Group groupObject){
            _visitables.remove(this.object);
            if (groupObject!=null){ this.object= new GroupBuilder(groupObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.GroupObjectNested<A> withNewGroupObject(){
            return new GroupObjectNestedImpl();
    }

    public AdmissionRequestFluent.GroupObjectNested<A> withNewGroupObjectLike(Group item){
            return new GroupObjectNestedImpl(item);
    }

    public A withImageSignatureObject(ImageSignature imageSignatureObject){
            _visitables.remove(this.object);
            if (imageSignatureObject!=null){ this.object= new ImageSignatureBuilder(imageSignatureObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ImageSignatureObjectNested<A> withNewImageSignatureObject(){
            return new ImageSignatureObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageSignatureObjectNested<A> withNewImageSignatureObjectLike(ImageSignature item){
            return new ImageSignatureObjectNestedImpl(item);
    }

    public A withResourceQuotaObject(ResourceQuota resourceQuotaObject){
            _visitables.remove(this.object);
            if (resourceQuotaObject!=null){ this.object= new ResourceQuotaBuilder(resourceQuotaObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObject(){
            return new ResourceQuotaObjectNestedImpl();
    }

    public AdmissionRequestFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObjectLike(ResourceQuota item){
            return new ResourceQuotaObjectNestedImpl(item);
    }

    public A withBuildRequestObject(BuildRequest buildRequestObject){
            _visitables.remove(this.object);
            if (buildRequestObject!=null){ this.object= new BuildRequestBuilder(buildRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.BuildRequestObjectNested<A> withNewBuildRequestObject(){
            return new BuildRequestObjectNestedImpl();
    }

    public AdmissionRequestFluent.BuildRequestObjectNested<A> withNewBuildRequestObjectLike(BuildRequest item){
            return new BuildRequestObjectNestedImpl(item);
    }

    public A withDaemonSetObject(DaemonSet daemonSetObject){
            _visitables.remove(this.object);
            if (daemonSetObject!=null){ this.object= new DaemonSetBuilder(daemonSetObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.DaemonSetObjectNested<A> withNewDaemonSetObject(){
            return new DaemonSetObjectNestedImpl();
    }

    public AdmissionRequestFluent.DaemonSetObjectNested<A> withNewDaemonSetObjectLike(DaemonSet item){
            return new DaemonSetObjectNestedImpl(item);
    }

    public A withImageStreamObject(ImageStream imageStreamObject){
            _visitables.remove(this.object);
            if (imageStreamObject!=null){ this.object= new ImageStreamBuilder(imageStreamObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ImageStreamObjectNested<A> withNewImageStreamObject(){
            return new ImageStreamObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageStreamObjectNested<A> withNewImageStreamObjectLike(ImageStream item){
            return new ImageStreamObjectNestedImpl(item);
    }

    public A withOpenshiftRoleObject(OpenshiftRole openshiftRoleObject){
            _visitables.remove(this.object);
            if (openshiftRoleObject!=null){ this.object= new OpenshiftRoleBuilder(openshiftRoleObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObject(){
            return new OpenshiftRoleObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObjectLike(OpenshiftRole item){
            return new OpenshiftRoleObjectNestedImpl(item);
    }

    public A withOAuthClientObject(OAuthClient oAuthClientObject){
            _visitables.remove(this.object);
            if (oAuthClientObject!=null){ this.object= new OAuthClientBuilder(oAuthClientObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthClientObjectNested<A> withNewOAuthClientObject(){
            return new OAuthClientObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthClientObjectNested<A> withNewOAuthClientObjectLike(OAuthClient item){
            return new OAuthClientObjectNestedImpl(item);
    }

    public A withIdentityObject(Identity identityObject){
            _visitables.remove(this.object);
            if (identityObject!=null){ this.object= new IdentityBuilder(identityObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.IdentityObjectNested<A> withNewIdentityObject(){
            return new IdentityObjectNestedImpl();
    }

    public AdmissionRequestFluent.IdentityObjectNested<A> withNewIdentityObjectLike(Identity item){
            return new IdentityObjectNestedImpl(item);
    }

    public A withLimitRangeObject(LimitRange limitRangeObject){
            _visitables.remove(this.object);
            if (limitRangeObject!=null){ this.object= new LimitRangeBuilder(limitRangeObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.LimitRangeObjectNested<A> withNewLimitRangeObject(){
            return new LimitRangeObjectNestedImpl();
    }

    public AdmissionRequestFluent.LimitRangeObjectNested<A> withNewLimitRangeObjectLike(LimitRange item){
            return new LimitRangeObjectNestedImpl(item);
    }

    public A withImageStreamImportObject(ImageStreamImport imageStreamImportObject){
            _visitables.remove(this.object);
            if (imageStreamImportObject!=null){ this.object= new ImageStreamImportBuilder(imageStreamImportObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObject(){
            return new ImageStreamImportObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObjectLike(ImageStreamImport item){
            return new ImageStreamImportObjectNestedImpl(item);
    }

    public A withOpenshiftRoleBindingRestrictionObject(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionObject){
            _visitables.remove(this.object);
            if (openshiftRoleBindingRestrictionObject!=null){ this.object= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObject(){
            return new OpenshiftRoleBindingRestrictionObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObjectLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionObjectNestedImpl(item);
    }

    public A withRoleBindingObject(RoleBinding roleBindingObject){
            _visitables.remove(this.object);
            if (roleBindingObject!=null){ this.object= new RoleBindingBuilder(roleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.RoleBindingObjectNested<A> withNewRoleBindingObject(){
            return new RoleBindingObjectNestedImpl();
    }

    public AdmissionRequestFluent.RoleBindingObjectNested<A> withNewRoleBindingObjectLike(RoleBinding item){
            return new RoleBindingObjectNestedImpl(item);
    }

    public A withPodPresetObject(PodPreset podPresetObject){
            _visitables.remove(this.object);
            if (podPresetObject!=null){ this.object= new PodPresetBuilder(podPresetObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PodPresetObjectNested<A> withNewPodPresetObject(){
            return new PodPresetObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodPresetObjectNested<A> withNewPodPresetObjectLike(PodPreset item){
            return new PodPresetObjectNestedImpl(item);
    }

    public A withProjectObject(Project projectObject){
            _visitables.remove(this.object);
            if (projectObject!=null){ this.object= new ProjectBuilder(projectObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ProjectObjectNested<A> withNewProjectObject(){
            return new ProjectObjectNestedImpl();
    }

    public AdmissionRequestFluent.ProjectObjectNested<A> withNewProjectObjectLike(Project item){
            return new ProjectObjectNestedImpl(item);
    }

    public A withBuildConfigObject(BuildConfig buildConfigObject){
            _visitables.remove(this.object);
            if (buildConfigObject!=null){ this.object= new BuildConfigBuilder(buildConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.BuildConfigObjectNested<A> withNewBuildConfigObject(){
            return new BuildConfigObjectNestedImpl();
    }

    public AdmissionRequestFluent.BuildConfigObjectNested<A> withNewBuildConfigObjectLike(BuildConfig item){
            return new BuildConfigObjectNestedImpl(item);
    }

    public A withClusterRoleObject(ClusterRole clusterRoleObject){
            _visitables.remove(this.object);
            if (clusterRoleObject!=null){ this.object= new ClusterRoleBuilder(clusterRoleObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ClusterRoleObjectNested<A> withNewClusterRoleObject(){
            return new ClusterRoleObjectNestedImpl();
    }

    public AdmissionRequestFluent.ClusterRoleObjectNested<A> withNewClusterRoleObjectLike(ClusterRole item){
            return new ClusterRoleObjectNestedImpl(item);
    }

    public A withOAuthAuthorizeTokenObject(OAuthAuthorizeToken oAuthAuthorizeTokenObject){
            _visitables.remove(this.object);
            if (oAuthAuthorizeTokenObject!=null){ this.object= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeTokenObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObject(){
            return new OAuthAuthorizeTokenObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObjectLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenObjectNestedImpl(item);
    }

    public A withProjectRequestObject(ProjectRequest projectRequestObject){
            _visitables.remove(this.object);
            if (projectRequestObject!=null){ this.object= new ProjectRequestBuilder(projectRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ProjectRequestObjectNested<A> withNewProjectRequestObject(){
            return new ProjectRequestObjectNestedImpl();
    }

    public AdmissionRequestFluent.ProjectRequestObjectNested<A> withNewProjectRequestObjectLike(ProjectRequest item){
            return new ProjectRequestObjectNestedImpl(item);
    }

    public A withPriorityClassObject(PriorityClass priorityClassObject){
            _visitables.remove(this.object);
            if (priorityClassObject!=null){ this.object= new PriorityClassBuilder(priorityClassObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PriorityClassObjectNested<A> withNewPriorityClassObject(){
            return new PriorityClassObjectNestedImpl();
    }

    public AdmissionRequestFluent.PriorityClassObjectNested<A> withNewPriorityClassObjectLike(PriorityClass item){
            return new PriorityClassObjectNestedImpl(item);
    }

    public A withTemplateObject(Template templateObject){
            _visitables.remove(this.object);
            if (templateObject!=null){ this.object= new TemplateBuilder(templateObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.TemplateObjectNested<A> withNewTemplateObject(){
            return new TemplateObjectNestedImpl();
    }

    public AdmissionRequestFluent.TemplateObjectNested<A> withNewTemplateObjectLike(Template item){
            return new TemplateObjectNestedImpl(item);
    }

    public A withOAuthClientAuthorizationObject(OAuthClientAuthorization oAuthClientAuthorizationObject){
            _visitables.remove(this.object);
            if (oAuthClientAuthorizationObject!=null){ this.object= new OAuthClientAuthorizationBuilder(oAuthClientAuthorizationObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObject(){
            return new OAuthClientAuthorizationObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObjectLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationObjectNestedImpl(item);
    }

    public A withDeploymentObject(Deployment deploymentObject){
            _visitables.remove(this.object);
            if (deploymentObject!=null){ this.object= new DeploymentBuilder(deploymentObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.DeploymentObjectNested<A> withNewDeploymentObject(){
            return new DeploymentObjectNestedImpl();
    }

    public AdmissionRequestFluent.DeploymentObjectNested<A> withNewDeploymentObjectLike(Deployment item){
            return new DeploymentObjectNestedImpl(item);
    }

    public A withPodTemplateObject(PodTemplate podTemplateObject){
            _visitables.remove(this.object);
            if (podTemplateObject!=null){ this.object= new PodTemplateBuilder(podTemplateObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PodTemplateObjectNested<A> withNewPodTemplateObject(){
            return new PodTemplateObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodTemplateObjectNested<A> withNewPodTemplateObjectLike(PodTemplate item){
            return new PodTemplateObjectNestedImpl(item);
    }

    public A withEventObject(Event eventObject){
            _visitables.remove(this.object);
            if (eventObject!=null){ this.object= new EventBuilder(eventObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.EventObjectNested<A> withNewEventObject(){
            return new EventObjectNestedImpl();
    }

    public AdmissionRequestFluent.EventObjectNested<A> withNewEventObjectLike(Event item){
            return new EventObjectNestedImpl(item);
    }

    public A withIngressObject(Ingress ingressObject){
            _visitables.remove(this.object);
            if (ingressObject!=null){ this.object= new IngressBuilder(ingressObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.IngressObjectNested<A> withNewIngressObject(){
            return new IngressObjectNestedImpl();
    }

    public AdmissionRequestFluent.IngressObjectNested<A> withNewIngressObjectLike(Ingress item){
            return new IngressObjectNestedImpl(item);
    }

    public A withDeploymentConfigObject(DeploymentConfig deploymentConfigObject){
            _visitables.remove(this.object);
            if (deploymentConfigObject!=null){ this.object= new DeploymentConfigBuilder(deploymentConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObject(){
            return new DeploymentConfigObjectNestedImpl();
    }

    public AdmissionRequestFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObjectLike(DeploymentConfig item){
            return new DeploymentConfigObjectNestedImpl(item);
    }

    public A withOAuthAccessTokenObject(OAuthAccessToken oAuthAccessTokenObject){
            _visitables.remove(this.object);
            if (oAuthAccessTokenObject!=null){ this.object= new OAuthAccessTokenBuilder(oAuthAccessTokenObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObject(){
            return new OAuthAccessTokenObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObjectLike(OAuthAccessToken item){
            return new OAuthAccessTokenObjectNestedImpl(item);
    }

    public A withPersistentVolumeObject(PersistentVolume persistentVolumeObject){
            _visitables.remove(this.object);
            if (persistentVolumeObject!=null){ this.object= new PersistentVolumeBuilder(persistentVolumeObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObject(){
            return new PersistentVolumeObjectNestedImpl();
    }

    public AdmissionRequestFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObjectLike(PersistentVolume item){
            return new PersistentVolumeObjectNestedImpl(item);
    }

    public A withPersistentVolumeClaimObject(PersistentVolumeClaim persistentVolumeClaimObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimObject!=null){ this.object= new PersistentVolumeClaimBuilder(persistentVolumeClaimObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObject(){
            return new PersistentVolumeClaimObjectNestedImpl();
    }

    public AdmissionRequestFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObjectLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimObjectNestedImpl(item);
    }

    public A withEventObject(io.fabric8.kubernetes.api.model.events.Event eventObject){
            _visitables.remove(this.object);
            if (eventObject!=null){ this.object= new io.fabric8.kubernetes.api.model.events.EventBuilder(eventObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.EventsEventObjectNested<A> withNewEventsEventObject(){
            return new EventsEventObjectNestedImpl();
    }

    public AdmissionRequestFluent.EventsEventObjectNested<A> withNewEventObjectLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventObjectNestedImpl(item);
    }

    public A withStatefulSetObject(StatefulSet statefulSetObject){
            _visitables.remove(this.object);
            if (statefulSetObject!=null){ this.object= new StatefulSetBuilder(statefulSetObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.StatefulSetObjectNested<A> withNewStatefulSetObject(){
            return new StatefulSetObjectNestedImpl();
    }

    public AdmissionRequestFluent.StatefulSetObjectNested<A> withNewStatefulSetObjectLike(StatefulSet item){
            return new StatefulSetObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleObject(OpenshiftClusterRole openshiftClusterRoleObject){
            _visitables.remove(this.object);
            if (openshiftClusterRoleObject!=null){ this.object= new OpenshiftClusterRoleBuilder(openshiftClusterRoleObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObject(){
            return new OpenshiftClusterRoleObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObjectLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleObjectNestedImpl(item);
    }

    public A withRoleObject(Role roleObject){
            _visitables.remove(this.object);
            if (roleObject!=null){ this.object= new RoleBuilder(roleObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.RoleObjectNested<A> withNewRoleObject(){
            return new RoleObjectNestedImpl();
    }

    public AdmissionRequestFluent.RoleObjectNested<A> withNewRoleObjectLike(Role item){
            return new RoleObjectNestedImpl(item);
    }

    public A withUserObject(User userObject){
            _visitables.remove(this.object);
            if (userObject!=null){ this.object= new UserBuilder(userObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.UserObjectNested<A> withNewUserObject(){
            return new UserObjectNestedImpl();
    }

    public AdmissionRequestFluent.UserObjectNested<A> withNewUserObjectLike(User item){
            return new UserObjectNestedImpl(item);
    }

    public A withComponentStatusObject(ComponentStatus componentStatusObject){
            _visitables.remove(this.object);
            if (componentStatusObject!=null){ this.object= new ComponentStatusBuilder(componentStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ComponentStatusObjectNested<A> withNewComponentStatusObject(){
            return new ComponentStatusObjectNestedImpl();
    }

    public AdmissionRequestFluent.ComponentStatusObjectNested<A> withNewComponentStatusObjectLike(ComponentStatus item){
            return new ComponentStatusObjectNestedImpl(item);
    }

    public A withTokenReviewObject(TokenReview tokenReviewObject){
            _visitables.remove(this.object);
            if (tokenReviewObject!=null){ this.object= new TokenReviewBuilder(tokenReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.TokenReviewObjectNested<A> withNewTokenReviewObject(){
            return new TokenReviewObjectNestedImpl();
    }

    public AdmissionRequestFluent.TokenReviewObjectNested<A> withNewTokenReviewObjectLike(TokenReview item){
            return new TokenReviewObjectNestedImpl(item);
    }

    public A withBindingObject(Binding bindingObject){
            _visitables.remove(this.object);
            if (bindingObject!=null){ this.object= new BindingBuilder(bindingObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.BindingObjectNested<A> withNewBindingObject(){
            return new BindingObjectNestedImpl();
    }

    public AdmissionRequestFluent.BindingObjectNested<A> withNewBindingObjectLike(Binding item){
            return new BindingObjectNestedImpl(item);
    }

    public A withSecretObject(Secret secretObject){
            _visitables.remove(this.object);
            if (secretObject!=null){ this.object= new SecretBuilder(secretObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.SecretObjectNested<A> withNewSecretObject(){
            return new SecretObjectNestedImpl();
    }

    public AdmissionRequestFluent.SecretObjectNested<A> withNewSecretObjectLike(Secret item){
            return new SecretObjectNestedImpl(item);
    }

    public A withSecurityContextConstraintsObject(SecurityContextConstraints securityContextConstraintsObject){
            _visitables.remove(this.object);
            if (securityContextConstraintsObject!=null){ this.object= new SecurityContextConstraintsBuilder(securityContextConstraintsObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObject(){
            return new SecurityContextConstraintsObjectNestedImpl();
    }

    public AdmissionRequestFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObjectLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsObjectNestedImpl(item);
    }

    public A withNetNamespaceObject(NetNamespace netNamespaceObject){
            _visitables.remove(this.object);
            if (netNamespaceObject!=null){ this.object= new NetNamespaceBuilder(netNamespaceObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObject(){
            return new NetNamespaceObjectNestedImpl();
    }

    public AdmissionRequestFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObjectLike(NetNamespace item){
            return new NetNamespaceObjectNestedImpl(item);
    }

    public A withNodeObject(Node nodeObject){
            _visitables.remove(this.object);
            if (nodeObject!=null){ this.object= new NodeBuilder(nodeObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.NodeObjectNested<A> withNewNodeObject(){
            return new NodeObjectNestedImpl();
    }

    public AdmissionRequestFluent.NodeObjectNested<A> withNewNodeObjectLike(Node item){
            return new NodeObjectNestedImpl(item);
    }

    public A withJobObject(Job jobObject){
            _visitables.remove(this.object);
            if (jobObject!=null){ this.object= new JobBuilder(jobObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.JobObjectNested<A> withNewJobObject(){
            return new JobObjectNestedImpl();
    }

    public AdmissionRequestFluent.JobObjectNested<A> withNewJobObjectLike(Job item){
            return new JobObjectNestedImpl(item);
    }

    public A withCertificateSigningRequestObject(CertificateSigningRequest certificateSigningRequestObject){
            _visitables.remove(this.object);
            if (certificateSigningRequestObject!=null){ this.object= new CertificateSigningRequestBuilder(certificateSigningRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObject(){
            return new CertificateSigningRequestObjectNestedImpl();
    }

    public AdmissionRequestFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObjectLike(CertificateSigningRequest item){
            return new CertificateSigningRequestObjectNestedImpl(item);
    }

    public A withServiceAccountObject(ServiceAccount serviceAccountObject){
            _visitables.remove(this.object);
            if (serviceAccountObject!=null){ this.object= new ServiceAccountBuilder(serviceAccountObject); _visitables.add(this.object);} return (A) this;
    }

    public AdmissionRequestFluent.ServiceAccountObjectNested<A> withNewServiceAccountObject(){
            return new ServiceAccountObjectNestedImpl();
    }

    public AdmissionRequestFluent.ServiceAccountObjectNested<A> withNewServiceAccountObjectLike(ServiceAccount item){
            return new ServiceAccountObjectNestedImpl(item);
    }

    
/**
 * This method has been deprecated, please use method buildOldObject instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getOldObject(){
            return this.oldObject!=null?this.oldObject.build():null;
    }

    public HasMetadata buildOldObject(){
            return this.oldObject!=null?this.oldObject.build():null;
    }

    public A withOldObject(HasMetadata oldObject){
            if (oldObject instanceof ValidatingWebhookConfiguration){ this.oldObject= new ValidatingWebhookConfigurationBuilder((ValidatingWebhookConfiguration)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof StorageClass){ this.oldObject= new StorageClassBuilder((StorageClass)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ClusterRoleBinding){ this.oldObject= new ClusterRoleBindingBuilder((ClusterRoleBinding)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OpenshiftRoleBinding){ this.oldObject= new OpenshiftRoleBindingBuilder((OpenshiftRoleBinding)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PodDisruptionBudget){ this.oldObject= new PodDisruptionBudgetBuilder((PodDisruptionBudget)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof NetworkPolicy){ this.oldObject= new NetworkPolicyBuilder((NetworkPolicy)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OpenshiftClusterRoleBinding){ this.oldObject= new OpenshiftClusterRoleBindingBuilder((OpenshiftClusterRoleBinding)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Route){ this.oldObject= new RouteBuilder((Route)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Namespace){ this.oldObject= new NamespaceBuilder((Namespace)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof LocalSubjectAccessReview){ this.oldObject= new LocalSubjectAccessReviewBuilder((LocalSubjectAccessReview)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Service){ this.oldObject= new ServiceBuilder((Service)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ReplicationController){ this.oldObject= new ReplicationControllerBuilder((ReplicationController)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof SubjectAccessReview){ this.oldObject= new SubjectAccessReviewBuilder((SubjectAccessReview)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof MutatingWebhookConfiguration){ this.oldObject= new MutatingWebhookConfigurationBuilder((MutatingWebhookConfiguration)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof HorizontalPodAutoscaler){ this.oldObject= new HorizontalPodAutoscalerBuilder((HorizontalPodAutoscaler)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Scale){ this.oldObject= new ScaleBuilder((Scale)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Image){ this.oldObject= new ImageBuilder((Image)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ReplicaSet){ this.oldObject= new ReplicaSetBuilder((ReplicaSet)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PodSecurityPolicy){ this.oldObject= new PodSecurityPolicyBuilder((PodSecurityPolicy)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof CronJob){ this.oldObject= new CronJobBuilder((CronJob)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Endpoints){ this.oldObject= new EndpointsBuilder((Endpoints)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Pod){ this.oldObject= new PodBuilder((Pod)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ConfigMap){ this.oldObject= new ConfigMapBuilder((ConfigMap)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof CustomResourceDefinition){ this.oldObject= new CustomResourceDefinitionBuilder((CustomResourceDefinition)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Build){ this.oldObject= new BuildBuilder((Build)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ImageStreamTag){ this.oldObject= new ImageStreamTagBuilder((ImageStreamTag)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Group){ this.oldObject= new GroupBuilder((Group)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ImageSignature){ this.oldObject= new ImageSignatureBuilder((ImageSignature)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ResourceQuota){ this.oldObject= new ResourceQuotaBuilder((ResourceQuota)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof BuildRequest){ this.oldObject= new BuildRequestBuilder((BuildRequest)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof DaemonSet){ this.oldObject= new DaemonSetBuilder((DaemonSet)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ImageStream){ this.oldObject= new ImageStreamBuilder((ImageStream)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OpenshiftRole){ this.oldObject= new OpenshiftRoleBuilder((OpenshiftRole)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OAuthClient){ this.oldObject= new OAuthClientBuilder((OAuthClient)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Identity){ this.oldObject= new IdentityBuilder((Identity)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof LimitRange){ this.oldObject= new LimitRangeBuilder((LimitRange)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ImageStreamImport){ this.oldObject= new ImageStreamImportBuilder((ImageStreamImport)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OpenshiftRoleBindingRestriction){ this.oldObject= new OpenshiftRoleBindingRestrictionBuilder((OpenshiftRoleBindingRestriction)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof RoleBinding){ this.oldObject= new RoleBindingBuilder((RoleBinding)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PodPreset){ this.oldObject= new PodPresetBuilder((PodPreset)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Project){ this.oldObject= new ProjectBuilder((Project)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof BuildConfig){ this.oldObject= new BuildConfigBuilder((BuildConfig)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ClusterRole){ this.oldObject= new ClusterRoleBuilder((ClusterRole)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OAuthAuthorizeToken){ this.oldObject= new OAuthAuthorizeTokenBuilder((OAuthAuthorizeToken)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ProjectRequest){ this.oldObject= new ProjectRequestBuilder((ProjectRequest)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PriorityClass){ this.oldObject= new PriorityClassBuilder((PriorityClass)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Template){ this.oldObject= new TemplateBuilder((Template)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OAuthClientAuthorization){ this.oldObject= new OAuthClientAuthorizationBuilder((OAuthClientAuthorization)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Deployment){ this.oldObject= new DeploymentBuilder((Deployment)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PodTemplate){ this.oldObject= new PodTemplateBuilder((PodTemplate)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Event){ this.oldObject= new EventBuilder((Event)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Ingress){ this.oldObject= new IngressBuilder((Ingress)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof DeploymentConfig){ this.oldObject= new DeploymentConfigBuilder((DeploymentConfig)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OAuthAccessToken){ this.oldObject= new OAuthAccessTokenBuilder((OAuthAccessToken)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PersistentVolume){ this.oldObject= new PersistentVolumeBuilder((PersistentVolume)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof PersistentVolumeClaim){ this.oldObject= new PersistentVolumeClaimBuilder((PersistentVolumeClaim)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof io.fabric8.kubernetes.api.model.events.Event){ this.oldObject= new io.fabric8.kubernetes.api.model.events.EventBuilder((io.fabric8.kubernetes.api.model.events.Event)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof StatefulSet){ this.oldObject= new StatefulSetBuilder((StatefulSet)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof OpenshiftClusterRole){ this.oldObject= new OpenshiftClusterRoleBuilder((OpenshiftClusterRole)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Role){ this.oldObject= new RoleBuilder((Role)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof User){ this.oldObject= new UserBuilder((User)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ComponentStatus){ this.oldObject= new ComponentStatusBuilder((ComponentStatus)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof TokenReview){ this.oldObject= new TokenReviewBuilder((TokenReview)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Binding){ this.oldObject= new BindingBuilder((Binding)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Secret){ this.oldObject= new SecretBuilder((Secret)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof SecurityContextConstraints){ this.oldObject= new SecurityContextConstraintsBuilder((SecurityContextConstraints)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof NetNamespace){ this.oldObject= new NetNamespaceBuilder((NetNamespace)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Node){ this.oldObject= new NodeBuilder((Node)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof Job){ this.oldObject= new JobBuilder((Job)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof CertificateSigningRequest){ this.oldObject= new CertificateSigningRequestBuilder((CertificateSigningRequest)oldObject); _visitables.add(this.oldObject);}
            if (oldObject instanceof ServiceAccount){ this.oldObject= new ServiceAccountBuilder((ServiceAccount)oldObject); _visitables.add(this.oldObject);}
            return (A) this;
    }

    public Boolean hasOldObject(){
            return this.oldObject != null;
    }

    public A withValidatingWebhookConfigurationOldObject(ValidatingWebhookConfiguration validatingWebhookConfigurationOldObject){
            _visitables.remove(this.oldObject);
            if (validatingWebhookConfigurationOldObject!=null){ this.oldObject= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfigurationOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<A> withNewValidatingWebhookConfigurationOldObject(){
            return new ValidatingWebhookConfigurationOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<A> withNewValidatingWebhookConfigurationOldObjectLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationOldObjectNestedImpl(item);
    }

    public A withStorageClassOldObject(StorageClass storageClassOldObject){
            _visitables.remove(this.oldObject);
            if (storageClassOldObject!=null){ this.oldObject= new StorageClassBuilder(storageClassOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.StorageClassOldObjectNested<A> withNewStorageClassOldObject(){
            return new StorageClassOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.StorageClassOldObjectNested<A> withNewStorageClassOldObjectLike(StorageClass item){
            return new StorageClassOldObjectNestedImpl(item);
    }

    public A withClusterRoleBindingOldObject(ClusterRoleBinding clusterRoleBindingOldObject){
            _visitables.remove(this.oldObject);
            if (clusterRoleBindingOldObject!=null){ this.oldObject= new ClusterRoleBindingBuilder(clusterRoleBindingOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<A> withNewClusterRoleBindingOldObject(){
            return new ClusterRoleBindingOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<A> withNewClusterRoleBindingOldObjectLike(ClusterRoleBinding item){
            return new ClusterRoleBindingOldObjectNestedImpl(item);
    }

    public A withOpenshiftRoleBindingOldObject(OpenshiftRoleBinding openshiftRoleBindingOldObject){
            _visitables.remove(this.oldObject);
            if (openshiftRoleBindingOldObject!=null){ this.oldObject= new OpenshiftRoleBindingBuilder(openshiftRoleBindingOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<A> withNewOpenshiftRoleBindingOldObject(){
            return new OpenshiftRoleBindingOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<A> withNewOpenshiftRoleBindingOldObjectLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingOldObjectNestedImpl(item);
    }

    public A withPodDisruptionBudgetOldObject(PodDisruptionBudget podDisruptionBudgetOldObject){
            _visitables.remove(this.oldObject);
            if (podDisruptionBudgetOldObject!=null){ this.oldObject= new PodDisruptionBudgetBuilder(podDisruptionBudgetOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<A> withNewPodDisruptionBudgetOldObject(){
            return new PodDisruptionBudgetOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<A> withNewPodDisruptionBudgetOldObjectLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetOldObjectNestedImpl(item);
    }

    public A withNetworkPolicyOldObject(NetworkPolicy networkPolicyOldObject){
            _visitables.remove(this.oldObject);
            if (networkPolicyOldObject!=null){ this.oldObject= new NetworkPolicyBuilder(networkPolicyOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.NetworkPolicyOldObjectNested<A> withNewNetworkPolicyOldObject(){
            return new NetworkPolicyOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.NetworkPolicyOldObjectNested<A> withNewNetworkPolicyOldObjectLike(NetworkPolicy item){
            return new NetworkPolicyOldObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingOldObject(OpenshiftClusterRoleBinding openshiftClusterRoleBindingOldObject){
            _visitables.remove(this.oldObject);
            if (openshiftClusterRoleBindingOldObject!=null){ this.oldObject= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBindingOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<A> withNewOpenshiftClusterRoleBindingOldObject(){
            return new OpenshiftClusterRoleBindingOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<A> withNewOpenshiftClusterRoleBindingOldObjectLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingOldObjectNestedImpl(item);
    }

    public A withRouteOldObject(Route routeOldObject){
            _visitables.remove(this.oldObject);
            if (routeOldObject!=null){ this.oldObject= new RouteBuilder(routeOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.RouteOldObjectNested<A> withNewRouteOldObject(){
            return new RouteOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.RouteOldObjectNested<A> withNewRouteOldObjectLike(Route item){
            return new RouteOldObjectNestedImpl(item);
    }

    public A withNamespaceOldObject(Namespace namespaceOldObject){
            _visitables.remove(this.oldObject);
            if (namespaceOldObject!=null){ this.oldObject= new NamespaceBuilder(namespaceOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.NamespaceOldObjectNested<A> withNewNamespaceOldObject(){
            return new NamespaceOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.NamespaceOldObjectNested<A> withNewNamespaceOldObjectLike(Namespace item){
            return new NamespaceOldObjectNestedImpl(item);
    }

    public A withLocalSubjectAccessReviewOldObject(LocalSubjectAccessReview localSubjectAccessReviewOldObject){
            _visitables.remove(this.oldObject);
            if (localSubjectAccessReviewOldObject!=null){ this.oldObject= new LocalSubjectAccessReviewBuilder(localSubjectAccessReviewOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<A> withNewLocalSubjectAccessReviewOldObject(){
            return new LocalSubjectAccessReviewOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<A> withNewLocalSubjectAccessReviewOldObjectLike(LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewOldObjectNestedImpl(item);
    }

    public A withServiceOldObject(Service serviceOldObject){
            _visitables.remove(this.oldObject);
            if (serviceOldObject!=null){ this.oldObject= new ServiceBuilder(serviceOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ServiceOldObjectNested<A> withNewServiceOldObject(){
            return new ServiceOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ServiceOldObjectNested<A> withNewServiceOldObjectLike(Service item){
            return new ServiceOldObjectNestedImpl(item);
    }

    public A withReplicationControllerOldObject(ReplicationController replicationControllerOldObject){
            _visitables.remove(this.oldObject);
            if (replicationControllerOldObject!=null){ this.oldObject= new ReplicationControllerBuilder(replicationControllerOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ReplicationControllerOldObjectNested<A> withNewReplicationControllerOldObject(){
            return new ReplicationControllerOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ReplicationControllerOldObjectNested<A> withNewReplicationControllerOldObjectLike(ReplicationController item){
            return new ReplicationControllerOldObjectNestedImpl(item);
    }

    public A withSubjectAccessReviewOldObject(SubjectAccessReview subjectAccessReviewOldObject){
            _visitables.remove(this.oldObject);
            if (subjectAccessReviewOldObject!=null){ this.oldObject= new SubjectAccessReviewBuilder(subjectAccessReviewOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<A> withNewSubjectAccessReviewOldObject(){
            return new SubjectAccessReviewOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<A> withNewSubjectAccessReviewOldObjectLike(SubjectAccessReview item){
            return new SubjectAccessReviewOldObjectNestedImpl(item);
    }

    public A withMutatingWebhookConfigurationOldObject(MutatingWebhookConfiguration mutatingWebhookConfigurationOldObject){
            _visitables.remove(this.oldObject);
            if (mutatingWebhookConfigurationOldObject!=null){ this.oldObject= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfigurationOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<A> withNewMutatingWebhookConfigurationOldObject(){
            return new MutatingWebhookConfigurationOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<A> withNewMutatingWebhookConfigurationOldObjectLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationOldObjectNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerOldObject(HorizontalPodAutoscaler horizontalPodAutoscalerOldObject){
            _visitables.remove(this.oldObject);
            if (horizontalPodAutoscalerOldObject!=null){ this.oldObject= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscalerOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<A> withNewHorizontalPodAutoscalerOldObject(){
            return new HorizontalPodAutoscalerOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<A> withNewHorizontalPodAutoscalerOldObjectLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerOldObjectNestedImpl(item);
    }

    public A withScaleOldObject(Scale scaleOldObject){
            _visitables.remove(this.oldObject);
            if (scaleOldObject!=null){ this.oldObject= new ScaleBuilder(scaleOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ScaleOldObjectNested<A> withNewScaleOldObject(){
            return new ScaleOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ScaleOldObjectNested<A> withNewScaleOldObjectLike(Scale item){
            return new ScaleOldObjectNestedImpl(item);
    }

    public A withImageOldObject(Image imageOldObject){
            _visitables.remove(this.oldObject);
            if (imageOldObject!=null){ this.oldObject= new ImageBuilder(imageOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ImageOldObjectNested<A> withNewImageOldObject(){
            return new ImageOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageOldObjectNested<A> withNewImageOldObjectLike(Image item){
            return new ImageOldObjectNestedImpl(item);
    }

    public A withReplicaSetOldObject(ReplicaSet replicaSetOldObject){
            _visitables.remove(this.oldObject);
            if (replicaSetOldObject!=null){ this.oldObject= new ReplicaSetBuilder(replicaSetOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ReplicaSetOldObjectNested<A> withNewReplicaSetOldObject(){
            return new ReplicaSetOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ReplicaSetOldObjectNested<A> withNewReplicaSetOldObjectLike(ReplicaSet item){
            return new ReplicaSetOldObjectNestedImpl(item);
    }

    public A withPodSecurityPolicyOldObject(PodSecurityPolicy podSecurityPolicyOldObject){
            _visitables.remove(this.oldObject);
            if (podSecurityPolicyOldObject!=null){ this.oldObject= new PodSecurityPolicyBuilder(podSecurityPolicyOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<A> withNewPodSecurityPolicyOldObject(){
            return new PodSecurityPolicyOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<A> withNewPodSecurityPolicyOldObjectLike(PodSecurityPolicy item){
            return new PodSecurityPolicyOldObjectNestedImpl(item);
    }

    public A withCronJobOldObject(CronJob cronJobOldObject){
            _visitables.remove(this.oldObject);
            if (cronJobOldObject!=null){ this.oldObject= new CronJobBuilder(cronJobOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.CronJobOldObjectNested<A> withNewCronJobOldObject(){
            return new CronJobOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.CronJobOldObjectNested<A> withNewCronJobOldObjectLike(CronJob item){
            return new CronJobOldObjectNestedImpl(item);
    }

    public A withEndpointsOldObject(Endpoints endpointsOldObject){
            _visitables.remove(this.oldObject);
            if (endpointsOldObject!=null){ this.oldObject= new EndpointsBuilder(endpointsOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.EndpointsOldObjectNested<A> withNewEndpointsOldObject(){
            return new EndpointsOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.EndpointsOldObjectNested<A> withNewEndpointsOldObjectLike(Endpoints item){
            return new EndpointsOldObjectNestedImpl(item);
    }

    public A withPodOldObject(Pod podOldObject){
            _visitables.remove(this.oldObject);
            if (podOldObject!=null){ this.oldObject= new PodBuilder(podOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PodOldObjectNested<A> withNewPodOldObject(){
            return new PodOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodOldObjectNested<A> withNewPodOldObjectLike(Pod item){
            return new PodOldObjectNestedImpl(item);
    }

    public A withConfigMapOldObject(ConfigMap configMapOldObject){
            _visitables.remove(this.oldObject);
            if (configMapOldObject!=null){ this.oldObject= new ConfigMapBuilder(configMapOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ConfigMapOldObjectNested<A> withNewConfigMapOldObject(){
            return new ConfigMapOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ConfigMapOldObjectNested<A> withNewConfigMapOldObjectLike(ConfigMap item){
            return new ConfigMapOldObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionOldObject(CustomResourceDefinition customResourceDefinitionOldObject){
            _visitables.remove(this.oldObject);
            if (customResourceDefinitionOldObject!=null){ this.oldObject= new CustomResourceDefinitionBuilder(customResourceDefinitionOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<A> withNewCustomResourceDefinitionOldObject(){
            return new CustomResourceDefinitionOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<A> withNewCustomResourceDefinitionOldObjectLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionOldObjectNestedImpl(item);
    }

    public A withBuildOldObject(Build buildOldObject){
            _visitables.remove(this.oldObject);
            if (buildOldObject!=null){ this.oldObject= new BuildBuilder(buildOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.BuildOldObjectNested<A> withNewBuildOldObject(){
            return new BuildOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.BuildOldObjectNested<A> withNewBuildOldObjectLike(Build item){
            return new BuildOldObjectNestedImpl(item);
    }

    public A withImageStreamTagOldObject(ImageStreamTag imageStreamTagOldObject){
            _visitables.remove(this.oldObject);
            if (imageStreamTagOldObject!=null){ this.oldObject= new ImageStreamTagBuilder(imageStreamTagOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ImageStreamTagOldObjectNested<A> withNewImageStreamTagOldObject(){
            return new ImageStreamTagOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageStreamTagOldObjectNested<A> withNewImageStreamTagOldObjectLike(ImageStreamTag item){
            return new ImageStreamTagOldObjectNestedImpl(item);
    }

    public A withGroupOldObject(Group groupOldObject){
            _visitables.remove(this.oldObject);
            if (groupOldObject!=null){ this.oldObject= new GroupBuilder(groupOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.GroupOldObjectNested<A> withNewGroupOldObject(){
            return new GroupOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.GroupOldObjectNested<A> withNewGroupOldObjectLike(Group item){
            return new GroupOldObjectNestedImpl(item);
    }

    public A withImageSignatureOldObject(ImageSignature imageSignatureOldObject){
            _visitables.remove(this.oldObject);
            if (imageSignatureOldObject!=null){ this.oldObject= new ImageSignatureBuilder(imageSignatureOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ImageSignatureOldObjectNested<A> withNewImageSignatureOldObject(){
            return new ImageSignatureOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageSignatureOldObjectNested<A> withNewImageSignatureOldObjectLike(ImageSignature item){
            return new ImageSignatureOldObjectNestedImpl(item);
    }

    public A withResourceQuotaOldObject(ResourceQuota resourceQuotaOldObject){
            _visitables.remove(this.oldObject);
            if (resourceQuotaOldObject!=null){ this.oldObject= new ResourceQuotaBuilder(resourceQuotaOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ResourceQuotaOldObjectNested<A> withNewResourceQuotaOldObject(){
            return new ResourceQuotaOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ResourceQuotaOldObjectNested<A> withNewResourceQuotaOldObjectLike(ResourceQuota item){
            return new ResourceQuotaOldObjectNestedImpl(item);
    }

    public A withBuildRequestOldObject(BuildRequest buildRequestOldObject){
            _visitables.remove(this.oldObject);
            if (buildRequestOldObject!=null){ this.oldObject= new BuildRequestBuilder(buildRequestOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.BuildRequestOldObjectNested<A> withNewBuildRequestOldObject(){
            return new BuildRequestOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.BuildRequestOldObjectNested<A> withNewBuildRequestOldObjectLike(BuildRequest item){
            return new BuildRequestOldObjectNestedImpl(item);
    }

    public A withDaemonSetOldObject(DaemonSet daemonSetOldObject){
            _visitables.remove(this.oldObject);
            if (daemonSetOldObject!=null){ this.oldObject= new DaemonSetBuilder(daemonSetOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.DaemonSetOldObjectNested<A> withNewDaemonSetOldObject(){
            return new DaemonSetOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.DaemonSetOldObjectNested<A> withNewDaemonSetOldObjectLike(DaemonSet item){
            return new DaemonSetOldObjectNestedImpl(item);
    }

    public A withImageStreamOldObject(ImageStream imageStreamOldObject){
            _visitables.remove(this.oldObject);
            if (imageStreamOldObject!=null){ this.oldObject= new ImageStreamBuilder(imageStreamOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ImageStreamOldObjectNested<A> withNewImageStreamOldObject(){
            return new ImageStreamOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageStreamOldObjectNested<A> withNewImageStreamOldObjectLike(ImageStream item){
            return new ImageStreamOldObjectNestedImpl(item);
    }

    public A withOpenshiftRoleOldObject(OpenshiftRole openshiftRoleOldObject){
            _visitables.remove(this.oldObject);
            if (openshiftRoleOldObject!=null){ this.oldObject= new OpenshiftRoleBuilder(openshiftRoleOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftRoleOldObjectNested<A> withNewOpenshiftRoleOldObject(){
            return new OpenshiftRoleOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftRoleOldObjectNested<A> withNewOpenshiftRoleOldObjectLike(OpenshiftRole item){
            return new OpenshiftRoleOldObjectNestedImpl(item);
    }

    public A withOAuthClientOldObject(OAuthClient oAuthClientOldObject){
            _visitables.remove(this.oldObject);
            if (oAuthClientOldObject!=null){ this.oldObject= new OAuthClientBuilder(oAuthClientOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthClientOldObjectNested<A> withNewOAuthClientOldObject(){
            return new OAuthClientOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthClientOldObjectNested<A> withNewOAuthClientOldObjectLike(OAuthClient item){
            return new OAuthClientOldObjectNestedImpl(item);
    }

    public A withIdentityOldObject(Identity identityOldObject){
            _visitables.remove(this.oldObject);
            if (identityOldObject!=null){ this.oldObject= new IdentityBuilder(identityOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.IdentityOldObjectNested<A> withNewIdentityOldObject(){
            return new IdentityOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.IdentityOldObjectNested<A> withNewIdentityOldObjectLike(Identity item){
            return new IdentityOldObjectNestedImpl(item);
    }

    public A withLimitRangeOldObject(LimitRange limitRangeOldObject){
            _visitables.remove(this.oldObject);
            if (limitRangeOldObject!=null){ this.oldObject= new LimitRangeBuilder(limitRangeOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.LimitRangeOldObjectNested<A> withNewLimitRangeOldObject(){
            return new LimitRangeOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.LimitRangeOldObjectNested<A> withNewLimitRangeOldObjectLike(LimitRange item){
            return new LimitRangeOldObjectNestedImpl(item);
    }

    public A withImageStreamImportOldObject(ImageStreamImport imageStreamImportOldObject){
            _visitables.remove(this.oldObject);
            if (imageStreamImportOldObject!=null){ this.oldObject= new ImageStreamImportBuilder(imageStreamImportOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ImageStreamImportOldObjectNested<A> withNewImageStreamImportOldObject(){
            return new ImageStreamImportOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ImageStreamImportOldObjectNested<A> withNewImageStreamImportOldObjectLike(ImageStreamImport item){
            return new ImageStreamImportOldObjectNestedImpl(item);
    }

    public A withOpenshiftRoleBindingRestrictionOldObject(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionOldObject){
            _visitables.remove(this.oldObject);
            if (openshiftRoleBindingRestrictionOldObject!=null){ this.oldObject= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestrictionOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<A> withNewOpenshiftRoleBindingRestrictionOldObject(){
            return new OpenshiftRoleBindingRestrictionOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<A> withNewOpenshiftRoleBindingRestrictionOldObjectLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionOldObjectNestedImpl(item);
    }

    public A withRoleBindingOldObject(RoleBinding roleBindingOldObject){
            _visitables.remove(this.oldObject);
            if (roleBindingOldObject!=null){ this.oldObject= new RoleBindingBuilder(roleBindingOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.RoleBindingOldObjectNested<A> withNewRoleBindingOldObject(){
            return new RoleBindingOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.RoleBindingOldObjectNested<A> withNewRoleBindingOldObjectLike(RoleBinding item){
            return new RoleBindingOldObjectNestedImpl(item);
    }

    public A withPodPresetOldObject(PodPreset podPresetOldObject){
            _visitables.remove(this.oldObject);
            if (podPresetOldObject!=null){ this.oldObject= new PodPresetBuilder(podPresetOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PodPresetOldObjectNested<A> withNewPodPresetOldObject(){
            return new PodPresetOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodPresetOldObjectNested<A> withNewPodPresetOldObjectLike(PodPreset item){
            return new PodPresetOldObjectNestedImpl(item);
    }

    public A withProjectOldObject(Project projectOldObject){
            _visitables.remove(this.oldObject);
            if (projectOldObject!=null){ this.oldObject= new ProjectBuilder(projectOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ProjectOldObjectNested<A> withNewProjectOldObject(){
            return new ProjectOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ProjectOldObjectNested<A> withNewProjectOldObjectLike(Project item){
            return new ProjectOldObjectNestedImpl(item);
    }

    public A withBuildConfigOldObject(BuildConfig buildConfigOldObject){
            _visitables.remove(this.oldObject);
            if (buildConfigOldObject!=null){ this.oldObject= new BuildConfigBuilder(buildConfigOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.BuildConfigOldObjectNested<A> withNewBuildConfigOldObject(){
            return new BuildConfigOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.BuildConfigOldObjectNested<A> withNewBuildConfigOldObjectLike(BuildConfig item){
            return new BuildConfigOldObjectNestedImpl(item);
    }

    public A withClusterRoleOldObject(ClusterRole clusterRoleOldObject){
            _visitables.remove(this.oldObject);
            if (clusterRoleOldObject!=null){ this.oldObject= new ClusterRoleBuilder(clusterRoleOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ClusterRoleOldObjectNested<A> withNewClusterRoleOldObject(){
            return new ClusterRoleOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ClusterRoleOldObjectNested<A> withNewClusterRoleOldObjectLike(ClusterRole item){
            return new ClusterRoleOldObjectNestedImpl(item);
    }

    public A withOAuthAuthorizeTokenOldObject(OAuthAuthorizeToken oAuthAuthorizeTokenOldObject){
            _visitables.remove(this.oldObject);
            if (oAuthAuthorizeTokenOldObject!=null){ this.oldObject= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeTokenOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<A> withNewOAuthAuthorizeTokenOldObject(){
            return new OAuthAuthorizeTokenOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<A> withNewOAuthAuthorizeTokenOldObjectLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenOldObjectNestedImpl(item);
    }

    public A withProjectRequestOldObject(ProjectRequest projectRequestOldObject){
            _visitables.remove(this.oldObject);
            if (projectRequestOldObject!=null){ this.oldObject= new ProjectRequestBuilder(projectRequestOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ProjectRequestOldObjectNested<A> withNewProjectRequestOldObject(){
            return new ProjectRequestOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ProjectRequestOldObjectNested<A> withNewProjectRequestOldObjectLike(ProjectRequest item){
            return new ProjectRequestOldObjectNestedImpl(item);
    }

    public A withPriorityClassOldObject(PriorityClass priorityClassOldObject){
            _visitables.remove(this.oldObject);
            if (priorityClassOldObject!=null){ this.oldObject= new PriorityClassBuilder(priorityClassOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PriorityClassOldObjectNested<A> withNewPriorityClassOldObject(){
            return new PriorityClassOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PriorityClassOldObjectNested<A> withNewPriorityClassOldObjectLike(PriorityClass item){
            return new PriorityClassOldObjectNestedImpl(item);
    }

    public A withTemplateOldObject(Template templateOldObject){
            _visitables.remove(this.oldObject);
            if (templateOldObject!=null){ this.oldObject= new TemplateBuilder(templateOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.TemplateOldObjectNested<A> withNewTemplateOldObject(){
            return new TemplateOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.TemplateOldObjectNested<A> withNewTemplateOldObjectLike(Template item){
            return new TemplateOldObjectNestedImpl(item);
    }

    public A withOAuthClientAuthorizationOldObject(OAuthClientAuthorization oAuthClientAuthorizationOldObject){
            _visitables.remove(this.oldObject);
            if (oAuthClientAuthorizationOldObject!=null){ this.oldObject= new OAuthClientAuthorizationBuilder(oAuthClientAuthorizationOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<A> withNewOAuthClientAuthorizationOldObject(){
            return new OAuthClientAuthorizationOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<A> withNewOAuthClientAuthorizationOldObjectLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationOldObjectNestedImpl(item);
    }

    public A withDeploymentOldObject(Deployment deploymentOldObject){
            _visitables.remove(this.oldObject);
            if (deploymentOldObject!=null){ this.oldObject= new DeploymentBuilder(deploymentOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.DeploymentOldObjectNested<A> withNewDeploymentOldObject(){
            return new DeploymentOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.DeploymentOldObjectNested<A> withNewDeploymentOldObjectLike(Deployment item){
            return new DeploymentOldObjectNestedImpl(item);
    }

    public A withPodTemplateOldObject(PodTemplate podTemplateOldObject){
            _visitables.remove(this.oldObject);
            if (podTemplateOldObject!=null){ this.oldObject= new PodTemplateBuilder(podTemplateOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PodTemplateOldObjectNested<A> withNewPodTemplateOldObject(){
            return new PodTemplateOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PodTemplateOldObjectNested<A> withNewPodTemplateOldObjectLike(PodTemplate item){
            return new PodTemplateOldObjectNestedImpl(item);
    }

    public A withEventOldObject(Event eventOldObject){
            _visitables.remove(this.oldObject);
            if (eventOldObject!=null){ this.oldObject= new EventBuilder(eventOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.EventOldObjectNested<A> withNewEventOldObject(){
            return new EventOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.EventOldObjectNested<A> withNewEventOldObjectLike(Event item){
            return new EventOldObjectNestedImpl(item);
    }

    public A withIngressOldObject(Ingress ingressOldObject){
            _visitables.remove(this.oldObject);
            if (ingressOldObject!=null){ this.oldObject= new IngressBuilder(ingressOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.IngressOldObjectNested<A> withNewIngressOldObject(){
            return new IngressOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.IngressOldObjectNested<A> withNewIngressOldObjectLike(Ingress item){
            return new IngressOldObjectNestedImpl(item);
    }

    public A withDeploymentConfigOldObject(DeploymentConfig deploymentConfigOldObject){
            _visitables.remove(this.oldObject);
            if (deploymentConfigOldObject!=null){ this.oldObject= new DeploymentConfigBuilder(deploymentConfigOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.DeploymentConfigOldObjectNested<A> withNewDeploymentConfigOldObject(){
            return new DeploymentConfigOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.DeploymentConfigOldObjectNested<A> withNewDeploymentConfigOldObjectLike(DeploymentConfig item){
            return new DeploymentConfigOldObjectNestedImpl(item);
    }

    public A withOAuthAccessTokenOldObject(OAuthAccessToken oAuthAccessTokenOldObject){
            _visitables.remove(this.oldObject);
            if (oAuthAccessTokenOldObject!=null){ this.oldObject= new OAuthAccessTokenBuilder(oAuthAccessTokenOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<A> withNewOAuthAccessTokenOldObject(){
            return new OAuthAccessTokenOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<A> withNewOAuthAccessTokenOldObjectLike(OAuthAccessToken item){
            return new OAuthAccessTokenOldObjectNestedImpl(item);
    }

    public A withPersistentVolumeOldObject(PersistentVolume persistentVolumeOldObject){
            _visitables.remove(this.oldObject);
            if (persistentVolumeOldObject!=null){ this.oldObject= new PersistentVolumeBuilder(persistentVolumeOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PersistentVolumeOldObjectNested<A> withNewPersistentVolumeOldObject(){
            return new PersistentVolumeOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PersistentVolumeOldObjectNested<A> withNewPersistentVolumeOldObjectLike(PersistentVolume item){
            return new PersistentVolumeOldObjectNestedImpl(item);
    }

    public A withPersistentVolumeClaimOldObject(PersistentVolumeClaim persistentVolumeClaimOldObject){
            _visitables.remove(this.oldObject);
            if (persistentVolumeClaimOldObject!=null){ this.oldObject= new PersistentVolumeClaimBuilder(persistentVolumeClaimOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<A> withNewPersistentVolumeClaimOldObject(){
            return new PersistentVolumeClaimOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<A> withNewPersistentVolumeClaimOldObjectLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimOldObjectNestedImpl(item);
    }

    public A withEventOldObject(io.fabric8.kubernetes.api.model.events.Event eventOldObject){
            _visitables.remove(this.oldObject);
            if (eventOldObject!=null){ this.oldObject= new io.fabric8.kubernetes.api.model.events.EventBuilder(eventOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.EventsEventOldObjectNested<A> withNewEventsEventOldObject(){
            return new EventsEventOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.EventsEventOldObjectNested<A> withNewEventOldObjectLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventOldObjectNestedImpl(item);
    }

    public A withStatefulSetOldObject(StatefulSet statefulSetOldObject){
            _visitables.remove(this.oldObject);
            if (statefulSetOldObject!=null){ this.oldObject= new StatefulSetBuilder(statefulSetOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.StatefulSetOldObjectNested<A> withNewStatefulSetOldObject(){
            return new StatefulSetOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.StatefulSetOldObjectNested<A> withNewStatefulSetOldObjectLike(StatefulSet item){
            return new StatefulSetOldObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleOldObject(OpenshiftClusterRole openshiftClusterRoleOldObject){
            _visitables.remove(this.oldObject);
            if (openshiftClusterRoleOldObject!=null){ this.oldObject= new OpenshiftClusterRoleBuilder(openshiftClusterRoleOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<A> withNewOpenshiftClusterRoleOldObject(){
            return new OpenshiftClusterRoleOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<A> withNewOpenshiftClusterRoleOldObjectLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleOldObjectNestedImpl(item);
    }

    public A withRoleOldObject(Role roleOldObject){
            _visitables.remove(this.oldObject);
            if (roleOldObject!=null){ this.oldObject= new RoleBuilder(roleOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.RoleOldObjectNested<A> withNewRoleOldObject(){
            return new RoleOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.RoleOldObjectNested<A> withNewRoleOldObjectLike(Role item){
            return new RoleOldObjectNestedImpl(item);
    }

    public A withUserOldObject(User userOldObject){
            _visitables.remove(this.oldObject);
            if (userOldObject!=null){ this.oldObject= new UserBuilder(userOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.UserOldObjectNested<A> withNewUserOldObject(){
            return new UserOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.UserOldObjectNested<A> withNewUserOldObjectLike(User item){
            return new UserOldObjectNestedImpl(item);
    }

    public A withComponentStatusOldObject(ComponentStatus componentStatusOldObject){
            _visitables.remove(this.oldObject);
            if (componentStatusOldObject!=null){ this.oldObject= new ComponentStatusBuilder(componentStatusOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ComponentStatusOldObjectNested<A> withNewComponentStatusOldObject(){
            return new ComponentStatusOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ComponentStatusOldObjectNested<A> withNewComponentStatusOldObjectLike(ComponentStatus item){
            return new ComponentStatusOldObjectNestedImpl(item);
    }

    public A withTokenReviewOldObject(TokenReview tokenReviewOldObject){
            _visitables.remove(this.oldObject);
            if (tokenReviewOldObject!=null){ this.oldObject= new TokenReviewBuilder(tokenReviewOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.TokenReviewOldObjectNested<A> withNewTokenReviewOldObject(){
            return new TokenReviewOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.TokenReviewOldObjectNested<A> withNewTokenReviewOldObjectLike(TokenReview item){
            return new TokenReviewOldObjectNestedImpl(item);
    }

    public A withBindingOldObject(Binding bindingOldObject){
            _visitables.remove(this.oldObject);
            if (bindingOldObject!=null){ this.oldObject= new BindingBuilder(bindingOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.BindingOldObjectNested<A> withNewBindingOldObject(){
            return new BindingOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.BindingOldObjectNested<A> withNewBindingOldObjectLike(Binding item){
            return new BindingOldObjectNestedImpl(item);
    }

    public A withSecretOldObject(Secret secretOldObject){
            _visitables.remove(this.oldObject);
            if (secretOldObject!=null){ this.oldObject= new SecretBuilder(secretOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.SecretOldObjectNested<A> withNewSecretOldObject(){
            return new SecretOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.SecretOldObjectNested<A> withNewSecretOldObjectLike(Secret item){
            return new SecretOldObjectNestedImpl(item);
    }

    public A withSecurityContextConstraintsOldObject(SecurityContextConstraints securityContextConstraintsOldObject){
            _visitables.remove(this.oldObject);
            if (securityContextConstraintsOldObject!=null){ this.oldObject= new SecurityContextConstraintsBuilder(securityContextConstraintsOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<A> withNewSecurityContextConstraintsOldObject(){
            return new SecurityContextConstraintsOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<A> withNewSecurityContextConstraintsOldObjectLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsOldObjectNestedImpl(item);
    }

    public A withNetNamespaceOldObject(NetNamespace netNamespaceOldObject){
            _visitables.remove(this.oldObject);
            if (netNamespaceOldObject!=null){ this.oldObject= new NetNamespaceBuilder(netNamespaceOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.NetNamespaceOldObjectNested<A> withNewNetNamespaceOldObject(){
            return new NetNamespaceOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.NetNamespaceOldObjectNested<A> withNewNetNamespaceOldObjectLike(NetNamespace item){
            return new NetNamespaceOldObjectNestedImpl(item);
    }

    public A withNodeOldObject(Node nodeOldObject){
            _visitables.remove(this.oldObject);
            if (nodeOldObject!=null){ this.oldObject= new NodeBuilder(nodeOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.NodeOldObjectNested<A> withNewNodeOldObject(){
            return new NodeOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.NodeOldObjectNested<A> withNewNodeOldObjectLike(Node item){
            return new NodeOldObjectNestedImpl(item);
    }

    public A withJobOldObject(Job jobOldObject){
            _visitables.remove(this.oldObject);
            if (jobOldObject!=null){ this.oldObject= new JobBuilder(jobOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.JobOldObjectNested<A> withNewJobOldObject(){
            return new JobOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.JobOldObjectNested<A> withNewJobOldObjectLike(Job item){
            return new JobOldObjectNestedImpl(item);
    }

    public A withCertificateSigningRequestOldObject(CertificateSigningRequest certificateSigningRequestOldObject){
            _visitables.remove(this.oldObject);
            if (certificateSigningRequestOldObject!=null){ this.oldObject= new CertificateSigningRequestBuilder(certificateSigningRequestOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<A> withNewCertificateSigningRequestOldObject(){
            return new CertificateSigningRequestOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<A> withNewCertificateSigningRequestOldObjectLike(CertificateSigningRequest item){
            return new CertificateSigningRequestOldObjectNestedImpl(item);
    }

    public A withServiceAccountOldObject(ServiceAccount serviceAccountOldObject){
            _visitables.remove(this.oldObject);
            if (serviceAccountOldObject!=null){ this.oldObject= new ServiceAccountBuilder(serviceAccountOldObject); _visitables.add(this.oldObject);} return (A) this;
    }

    public AdmissionRequestFluent.ServiceAccountOldObjectNested<A> withNewServiceAccountOldObject(){
            return new ServiceAccountOldObjectNestedImpl();
    }

    public AdmissionRequestFluent.ServiceAccountOldObjectNested<A> withNewServiceAccountOldObjectLike(ServiceAccount item){
            return new ServiceAccountOldObjectNestedImpl(item);
    }

    public String getOperation(){
            return this.operation;
    }

    public A withOperation(String operation){
            this.operation=operation; return (A) this;
    }

    public Boolean hasOperation(){
            return this.operation != null;
    }

    
/**
 * This method has been deprecated, please use method buildResource instead.
 * @return The buildable object.
 */
@Deprecated public GroupVersionResource getResource(){
            return this.resource!=null?this.resource.build():null;
    }

    public GroupVersionResource buildResource(){
            return this.resource!=null?this.resource.build():null;
    }

    public A withResource(GroupVersionResource resource){
            _visitables.remove(this.resource);
            if (resource!=null){ this.resource= new GroupVersionResourceBuilder(resource); _visitables.add(this.resource);} return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
    }

    public A withNewResource(String group,String resource,String version){
            return (A)withResource(new GroupVersionResource(group, resource, version));
    }

    public AdmissionRequestFluent.ResourceNested<A> withNewResource(){
            return new ResourceNestedImpl();
    }

    public AdmissionRequestFluent.ResourceNested<A> withNewResourceLike(GroupVersionResource item){
            return new ResourceNestedImpl(item);
    }

    public AdmissionRequestFluent.ResourceNested<A> editResource(){
            return withNewResourceLike(getResource());
    }

    public AdmissionRequestFluent.ResourceNested<A> editOrNewResource(){
            return withNewResourceLike(getResource() != null ? getResource(): new GroupVersionResourceBuilder().build());
    }

    public AdmissionRequestFluent.ResourceNested<A> editOrNewResourceLike(GroupVersionResource item){
            return withNewResourceLike(getResource() != null ? getResource(): item);
    }

    public String getSubResource(){
            return this.subResource;
    }

    public A withSubResource(String subResource){
            this.subResource=subResource; return (A) this;
    }

    public Boolean hasSubResource(){
            return this.subResource != null;
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    
/**
 * This method has been deprecated, please use method buildUserInfo instead.
 * @return The buildable object.
 */
@Deprecated public UserInfo getUserInfo(){
            return this.userInfo!=null?this.userInfo.build():null;
    }

    public UserInfo buildUserInfo(){
            return this.userInfo!=null?this.userInfo.build():null;
    }

    public A withUserInfo(UserInfo userInfo){
            _visitables.remove(this.userInfo);
            if (userInfo!=null){ this.userInfo= new UserInfoBuilder(userInfo); _visitables.add(this.userInfo);} return (A) this;
    }

    public Boolean hasUserInfo(){
            return this.userInfo != null;
    }

    public AdmissionRequestFluent.UserInfoNested<A> withNewUserInfo(){
            return new UserInfoNestedImpl();
    }

    public AdmissionRequestFluent.UserInfoNested<A> withNewUserInfoLike(UserInfo item){
            return new UserInfoNestedImpl(item);
    }

    public AdmissionRequestFluent.UserInfoNested<A> editUserInfo(){
            return withNewUserInfoLike(getUserInfo());
    }

    public AdmissionRequestFluent.UserInfoNested<A> editOrNewUserInfo(){
            return withNewUserInfoLike(getUserInfo() != null ? getUserInfo(): new UserInfoBuilder().build());
    }

    public AdmissionRequestFluent.UserInfoNested<A> editOrNewUserInfoLike(UserInfo item){
            return withNewUserInfoLike(getUserInfo() != null ? getUserInfo(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AdmissionRequestFluentImpl that = (AdmissionRequestFluentImpl) o;
            if (dryRun != null ? !dryRun.equals(that.dryRun) :that.dryRun != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (object != null ? !object.equals(that.object) :that.object != null) return false;
            if (oldObject != null ? !oldObject.equals(that.oldObject) :that.oldObject != null) return false;
            if (operation != null ? !operation.equals(that.operation) :that.operation != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            if (subResource != null ? !subResource.equals(that.subResource) :that.subResource != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            if (userInfo != null ? !userInfo.equals(that.userInfo) :that.userInfo != null) return false;
            return true;
    }


    public class KindNestedImpl<N> extends GroupVersionKindFluentImpl<AdmissionRequestFluent.KindNested<N>> implements AdmissionRequestFluent.KindNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupVersionKindBuilder builder;
    
            KindNestedImpl(GroupVersionKind item){
                    this.builder = new GroupVersionKindBuilder(this, item);
            }
            KindNestedImpl(){
                    this.builder = new GroupVersionKindBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withKind(builder.build());
    }
    public N endKind(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationObjectNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<N>> implements AdmissionRequestFluent.ValidatingWebhookConfigurationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationObjectNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationObjectNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withValidatingWebhookConfigurationObject(builder.build());
    }
    public N endValidatingWebhookConfigurationObject(){
            return and();
    }

}
    public class StorageClassObjectNestedImpl<N> extends StorageClassFluentImpl<AdmissionRequestFluent.StorageClassObjectNested<N>> implements AdmissionRequestFluent.StorageClassObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassObjectNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassObjectNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withStorageClassObject(builder.build());
    }
    public N endStorageClassObject(){
            return and();
    }

}
    public class ClusterRoleBindingObjectNestedImpl<N> extends ClusterRoleBindingFluentImpl<AdmissionRequestFluent.ClusterRoleBindingObjectNested<N>> implements AdmissionRequestFluent.ClusterRoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingObjectNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingObjectNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withClusterRoleBindingObject(builder.build());
    }
    public N endClusterRoleBindingObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingObjectNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<N>> implements AdmissionRequestFluent.OpenshiftRoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingObjectNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftRoleBindingObject(builder.build());
    }
    public N endOpenshiftRoleBindingObject(){
            return and();
    }

}
    public class PodDisruptionBudgetObjectNestedImpl<N> extends PodDisruptionBudgetFluentImpl<AdmissionRequestFluent.PodDisruptionBudgetObjectNested<N>> implements AdmissionRequestFluent.PodDisruptionBudgetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetObjectNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetObjectNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodDisruptionBudgetObject(builder.build());
    }
    public N endPodDisruptionBudgetObject(){
            return and();
    }

}
    public class NetworkPolicyObjectNestedImpl<N> extends NetworkPolicyFluentImpl<AdmissionRequestFluent.NetworkPolicyObjectNested<N>> implements AdmissionRequestFluent.NetworkPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyObjectNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyObjectNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNetworkPolicyObject(builder.build());
    }
    public N endNetworkPolicyObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingObjectNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<N>> implements AdmissionRequestFluent.OpenshiftClusterRoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingObjectNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftClusterRoleBindingObject(builder.build());
    }
    public N endOpenshiftClusterRoleBindingObject(){
            return and();
    }

}
    public class RouteObjectNestedImpl<N> extends RouteFluentImpl<AdmissionRequestFluent.RouteObjectNested<N>> implements AdmissionRequestFluent.RouteObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteObjectNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteObjectNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withRouteObject(builder.build());
    }
    public N endRouteObject(){
            return and();
    }

}
    public class NamespaceObjectNestedImpl<N> extends NamespaceFluentImpl<AdmissionRequestFluent.NamespaceObjectNested<N>> implements AdmissionRequestFluent.NamespaceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceObjectNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceObjectNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNamespaceObject(builder.build());
    }
    public N endNamespaceObject(){
            return and();
    }

}
    public class LocalSubjectAccessReviewObjectNestedImpl<N> extends LocalSubjectAccessReviewFluentImpl<AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<N>> implements AdmissionRequestFluent.LocalSubjectAccessReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalSubjectAccessReviewBuilder builder;
    
            LocalSubjectAccessReviewObjectNestedImpl(LocalSubjectAccessReview item){
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewObjectNestedImpl(){
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withLocalSubjectAccessReviewObject(builder.build());
    }
    public N endLocalSubjectAccessReviewObject(){
            return and();
    }

}
    public class ServiceObjectNestedImpl<N> extends ServiceFluentImpl<AdmissionRequestFluent.ServiceObjectNested<N>> implements AdmissionRequestFluent.ServiceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
    
            ServiceObjectNestedImpl(Service item){
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceObjectNestedImpl(){
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withServiceObject(builder.build());
    }
    public N endServiceObject(){
            return and();
    }

}
    public class ReplicationControllerObjectNestedImpl<N> extends ReplicationControllerFluentImpl<AdmissionRequestFluent.ReplicationControllerObjectNested<N>> implements AdmissionRequestFluent.ReplicationControllerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
    
            ReplicationControllerObjectNestedImpl(ReplicationController item){
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerObjectNestedImpl(){
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withReplicationControllerObject(builder.build());
    }
    public N endReplicationControllerObject(){
            return and();
    }

}
    public class SubjectAccessReviewObjectNestedImpl<N> extends SubjectAccessReviewFluentImpl<AdmissionRequestFluent.SubjectAccessReviewObjectNested<N>> implements AdmissionRequestFluent.SubjectAccessReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewBuilder builder;
    
            SubjectAccessReviewObjectNestedImpl(SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewObjectNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withSubjectAccessReviewObject(builder.build());
    }
    public N endSubjectAccessReviewObject(){
            return and();
    }

}
    public class MutatingWebhookConfigurationObjectNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<N>> implements AdmissionRequestFluent.MutatingWebhookConfigurationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationObjectNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationObjectNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withMutatingWebhookConfigurationObject(builder.build());
    }
    public N endMutatingWebhookConfigurationObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerObjectNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<N>> implements AdmissionRequestFluent.HorizontalPodAutoscalerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerObjectNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withHorizontalPodAutoscalerObject(builder.build());
    }
    public N endHorizontalPodAutoscalerObject(){
            return and();
    }

}
    public class ScaleObjectNestedImpl<N> extends ScaleFluentImpl<AdmissionRequestFluent.ScaleObjectNested<N>> implements AdmissionRequestFluent.ScaleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleObjectNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleObjectNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withScaleObject(builder.build());
    }
    public N endScaleObject(){
            return and();
    }

}
    public class ImageObjectNestedImpl<N> extends ImageFluentImpl<AdmissionRequestFluent.ImageObjectNested<N>> implements AdmissionRequestFluent.ImageObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageObjectNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageObjectNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageObject(builder.build());
    }
    public N endImageObject(){
            return and();
    }

}
    public class ReplicaSetObjectNestedImpl<N> extends ReplicaSetFluentImpl<AdmissionRequestFluent.ReplicaSetObjectNested<N>> implements AdmissionRequestFluent.ReplicaSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetObjectNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetObjectNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withReplicaSetObject(builder.build());
    }
    public N endReplicaSetObject(){
            return and();
    }

}
    public class PodSecurityPolicyObjectNestedImpl<N> extends PodSecurityPolicyFluentImpl<AdmissionRequestFluent.PodSecurityPolicyObjectNested<N>> implements AdmissionRequestFluent.PodSecurityPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyObjectNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyObjectNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodSecurityPolicyObject(builder.build());
    }
    public N endPodSecurityPolicyObject(){
            return and();
    }

}
    public class CronJobObjectNestedImpl<N> extends CronJobFluentImpl<AdmissionRequestFluent.CronJobObjectNested<N>> implements AdmissionRequestFluent.CronJobObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobObjectNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobObjectNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withCronJobObject(builder.build());
    }
    public N endCronJobObject(){
            return and();
    }

}
    public class EndpointsObjectNestedImpl<N> extends EndpointsFluentImpl<AdmissionRequestFluent.EndpointsObjectNested<N>> implements AdmissionRequestFluent.EndpointsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsObjectNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsObjectNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withEndpointsObject(builder.build());
    }
    public N endEndpointsObject(){
            return and();
    }

}
    public class PodObjectNestedImpl<N> extends PodFluentImpl<AdmissionRequestFluent.PodObjectNested<N>> implements AdmissionRequestFluent.PodObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
    
            PodObjectNestedImpl(Pod item){
                    this.builder = new PodBuilder(this, item);
            }
            PodObjectNestedImpl(){
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodObject(builder.build());
    }
    public N endPodObject(){
            return and();
    }

}
    public class ConfigMapObjectNestedImpl<N> extends ConfigMapFluentImpl<AdmissionRequestFluent.ConfigMapObjectNested<N>> implements AdmissionRequestFluent.ConfigMapObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapObjectNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapObjectNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withConfigMapObject(builder.build());
    }
    public N endConfigMapObject(){
            return and();
    }

}
    public class CustomResourceDefinitionObjectNestedImpl<N> extends CustomResourceDefinitionFluentImpl<AdmissionRequestFluent.CustomResourceDefinitionObjectNested<N>> implements AdmissionRequestFluent.CustomResourceDefinitionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionObjectNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withCustomResourceDefinitionObject(builder.build());
    }
    public N endCustomResourceDefinitionObject(){
            return and();
    }

}
    public class BuildObjectNestedImpl<N> extends BuildFluentImpl<AdmissionRequestFluent.BuildObjectNested<N>> implements AdmissionRequestFluent.BuildObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
    
            BuildObjectNestedImpl(Build item){
                    this.builder = new BuildBuilder(this, item);
            }
            BuildObjectNestedImpl(){
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBuildObject(builder.build());
    }
    public N endBuildObject(){
            return and();
    }

}
    public class ImageStreamTagObjectNestedImpl<N> extends ImageStreamTagFluentImpl<AdmissionRequestFluent.ImageStreamTagObjectNested<N>> implements AdmissionRequestFluent.ImageStreamTagObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
    
            ImageStreamTagObjectNestedImpl(ImageStreamTag item){
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagObjectNestedImpl(){
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageStreamTagObject(builder.build());
    }
    public N endImageStreamTagObject(){
            return and();
    }

}
    public class GroupObjectNestedImpl<N> extends GroupFluentImpl<AdmissionRequestFluent.GroupObjectNested<N>> implements AdmissionRequestFluent.GroupObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupObjectNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupObjectNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withGroupObject(builder.build());
    }
    public N endGroupObject(){
            return and();
    }

}
    public class ImageSignatureObjectNestedImpl<N> extends ImageSignatureFluentImpl<AdmissionRequestFluent.ImageSignatureObjectNested<N>> implements AdmissionRequestFluent.ImageSignatureObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
    
            ImageSignatureObjectNestedImpl(ImageSignature item){
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureObjectNestedImpl(){
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageSignatureObject(builder.build());
    }
    public N endImageSignatureObject(){
            return and();
    }

}
    public class ResourceQuotaObjectNestedImpl<N> extends ResourceQuotaFluentImpl<AdmissionRequestFluent.ResourceQuotaObjectNested<N>> implements AdmissionRequestFluent.ResourceQuotaObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaObjectNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaObjectNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withResourceQuotaObject(builder.build());
    }
    public N endResourceQuotaObject(){
            return and();
    }

}
    public class BuildRequestObjectNestedImpl<N> extends BuildRequestFluentImpl<AdmissionRequestFluent.BuildRequestObjectNested<N>> implements AdmissionRequestFluent.BuildRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestObjectNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestObjectNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBuildRequestObject(builder.build());
    }
    public N endBuildRequestObject(){
            return and();
    }

}
    public class DaemonSetObjectNestedImpl<N> extends DaemonSetFluentImpl<AdmissionRequestFluent.DaemonSetObjectNested<N>> implements AdmissionRequestFluent.DaemonSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetObjectNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetObjectNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withDaemonSetObject(builder.build());
    }
    public N endDaemonSetObject(){
            return and();
    }

}
    public class ImageStreamObjectNestedImpl<N> extends ImageStreamFluentImpl<AdmissionRequestFluent.ImageStreamObjectNested<N>> implements AdmissionRequestFluent.ImageStreamObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImageStreamObjectNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamObjectNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageStreamObject(builder.build());
    }
    public N endImageStreamObject(){
            return and();
    }

}
    public class OpenshiftRoleObjectNestedImpl<N> extends OpenshiftRoleFluentImpl<AdmissionRequestFluent.OpenshiftRoleObjectNested<N>> implements AdmissionRequestFluent.OpenshiftRoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleObjectNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftRoleObject(builder.build());
    }
    public N endOpenshiftRoleObject(){
            return and();
    }

}
    public class OAuthClientObjectNestedImpl<N> extends OAuthClientFluentImpl<AdmissionRequestFluent.OAuthClientObjectNested<N>> implements AdmissionRequestFluent.OAuthClientObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientObjectNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientObjectNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthClientObject(builder.build());
    }
    public N endOAuthClientObject(){
            return and();
    }

}
    public class IdentityObjectNestedImpl<N> extends IdentityFluentImpl<AdmissionRequestFluent.IdentityObjectNested<N>> implements AdmissionRequestFluent.IdentityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityObjectNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityObjectNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withIdentityObject(builder.build());
    }
    public N endIdentityObject(){
            return and();
    }

}
    public class LimitRangeObjectNestedImpl<N> extends LimitRangeFluentImpl<AdmissionRequestFluent.LimitRangeObjectNested<N>> implements AdmissionRequestFluent.LimitRangeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
    
            LimitRangeObjectNestedImpl(LimitRange item){
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeObjectNestedImpl(){
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withLimitRangeObject(builder.build());
    }
    public N endLimitRangeObject(){
            return and();
    }

}
    public class ImageStreamImportObjectNestedImpl<N> extends ImageStreamImportFluentImpl<AdmissionRequestFluent.ImageStreamImportObjectNested<N>> implements AdmissionRequestFluent.ImageStreamImportObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportObjectNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportObjectNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageStreamImportObject(builder.build());
    }
    public N endImageStreamImportObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionObjectNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<N>> implements AdmissionRequestFluent.OpenshiftRoleBindingRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionObjectNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftRoleBindingRestrictionObject(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionObject(){
            return and();
    }

}
    public class RoleBindingObjectNestedImpl<N> extends RoleBindingFluentImpl<AdmissionRequestFluent.RoleBindingObjectNested<N>> implements AdmissionRequestFluent.RoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingObjectNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingObjectNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withRoleBindingObject(builder.build());
    }
    public N endRoleBindingObject(){
            return and();
    }

}
    public class PodPresetObjectNestedImpl<N> extends PodPresetFluentImpl<AdmissionRequestFluent.PodPresetObjectNested<N>> implements AdmissionRequestFluent.PodPresetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetObjectNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetObjectNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodPresetObject(builder.build());
    }
    public N endPodPresetObject(){
            return and();
    }

}
    public class ProjectObjectNestedImpl<N> extends ProjectFluentImpl<AdmissionRequestFluent.ProjectObjectNested<N>> implements AdmissionRequestFluent.ProjectObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectObjectNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectObjectNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withProjectObject(builder.build());
    }
    public N endProjectObject(){
            return and();
    }

}
    public class BuildConfigObjectNestedImpl<N> extends BuildConfigFluentImpl<AdmissionRequestFluent.BuildConfigObjectNested<N>> implements AdmissionRequestFluent.BuildConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
    
            BuildConfigObjectNestedImpl(BuildConfig item){
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigObjectNestedImpl(){
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBuildConfigObject(builder.build());
    }
    public N endBuildConfigObject(){
            return and();
    }

}
    public class ClusterRoleObjectNestedImpl<N> extends ClusterRoleFluentImpl<AdmissionRequestFluent.ClusterRoleObjectNested<N>> implements AdmissionRequestFluent.ClusterRoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleObjectNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleObjectNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withClusterRoleObject(builder.build());
    }
    public N endClusterRoleObject(){
            return and();
    }

}
    public class OAuthAuthorizeTokenObjectNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<N>> implements AdmissionRequestFluent.OAuthAuthorizeTokenObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenObjectNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenObjectNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthAuthorizeTokenObject(builder.build());
    }
    public N endOAuthAuthorizeTokenObject(){
            return and();
    }

}
    public class ProjectRequestObjectNestedImpl<N> extends ProjectRequestFluentImpl<AdmissionRequestFluent.ProjectRequestObjectNested<N>> implements AdmissionRequestFluent.ProjectRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestObjectNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestObjectNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withProjectRequestObject(builder.build());
    }
    public N endProjectRequestObject(){
            return and();
    }

}
    public class PriorityClassObjectNestedImpl<N> extends PriorityClassFluentImpl<AdmissionRequestFluent.PriorityClassObjectNested<N>> implements AdmissionRequestFluent.PriorityClassObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassObjectNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassObjectNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPriorityClassObject(builder.build());
    }
    public N endPriorityClassObject(){
            return and();
    }

}
    public class TemplateObjectNestedImpl<N> extends TemplateFluentImpl<AdmissionRequestFluent.TemplateObjectNested<N>> implements AdmissionRequestFluent.TemplateObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateObjectNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateObjectNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withTemplateObject(builder.build());
    }
    public N endTemplateObject(){
            return and();
    }

}
    public class OAuthClientAuthorizationObjectNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<N>> implements AdmissionRequestFluent.OAuthClientAuthorizationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationObjectNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationObjectNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthClientAuthorizationObject(builder.build());
    }
    public N endOAuthClientAuthorizationObject(){
            return and();
    }

}
    public class DeploymentObjectNestedImpl<N> extends DeploymentFluentImpl<AdmissionRequestFluent.DeploymentObjectNested<N>> implements AdmissionRequestFluent.DeploymentObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentObjectNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentObjectNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withDeploymentObject(builder.build());
    }
    public N endDeploymentObject(){
            return and();
    }

}
    public class PodTemplateObjectNestedImpl<N> extends PodTemplateFluentImpl<AdmissionRequestFluent.PodTemplateObjectNested<N>> implements AdmissionRequestFluent.PodTemplateObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
    
            PodTemplateObjectNestedImpl(PodTemplate item){
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateObjectNestedImpl(){
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodTemplateObject(builder.build());
    }
    public N endPodTemplateObject(){
            return and();
    }

}
    public class EventObjectNestedImpl<N> extends EventFluentImpl<AdmissionRequestFluent.EventObjectNested<N>> implements AdmissionRequestFluent.EventObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
    
            EventObjectNestedImpl(Event item){
                    this.builder = new EventBuilder(this, item);
            }
            EventObjectNestedImpl(){
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withEventObject(builder.build());
    }
    public N endEventObject(){
            return and();
    }

}
    public class IngressObjectNestedImpl<N> extends IngressFluentImpl<AdmissionRequestFluent.IngressObjectNested<N>> implements AdmissionRequestFluent.IngressObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressObjectNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressObjectNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withIngressObject(builder.build());
    }
    public N endIngressObject(){
            return and();
    }

}
    public class DeploymentConfigObjectNestedImpl<N> extends DeploymentConfigFluentImpl<AdmissionRequestFluent.DeploymentConfigObjectNested<N>> implements AdmissionRequestFluent.DeploymentConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigObjectNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigObjectNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withDeploymentConfigObject(builder.build());
    }
    public N endDeploymentConfigObject(){
            return and();
    }

}
    public class OAuthAccessTokenObjectNestedImpl<N> extends OAuthAccessTokenFluentImpl<AdmissionRequestFluent.OAuthAccessTokenObjectNested<N>> implements AdmissionRequestFluent.OAuthAccessTokenObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenObjectNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenObjectNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthAccessTokenObject(builder.build());
    }
    public N endOAuthAccessTokenObject(){
            return and();
    }

}
    public class PersistentVolumeObjectNestedImpl<N> extends PersistentVolumeFluentImpl<AdmissionRequestFluent.PersistentVolumeObjectNested<N>> implements AdmissionRequestFluent.PersistentVolumeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeObjectNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeObjectNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPersistentVolumeObject(builder.build());
    }
    public N endPersistentVolumeObject(){
            return and();
    }

}
    public class PersistentVolumeClaimObjectNestedImpl<N> extends PersistentVolumeClaimFluentImpl<AdmissionRequestFluent.PersistentVolumeClaimObjectNested<N>> implements AdmissionRequestFluent.PersistentVolumeClaimObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimObjectNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPersistentVolumeClaimObject(builder.build());
    }
    public N endPersistentVolumeClaimObject(){
            return and();
    }

}
    public class EventsEventObjectNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<AdmissionRequestFluent.EventsEventObjectNested<N>> implements AdmissionRequestFluent.EventsEventObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventObjectNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventObjectNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withEventObject(builder.build());
    }
    public N endEventsEventObject(){
            return and();
    }

}
    public class StatefulSetObjectNestedImpl<N> extends StatefulSetFluentImpl<AdmissionRequestFluent.StatefulSetObjectNested<N>> implements AdmissionRequestFluent.StatefulSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetObjectNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetObjectNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withStatefulSetObject(builder.build());
    }
    public N endStatefulSetObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleObjectNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<N>> implements AdmissionRequestFluent.OpenshiftClusterRoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleObjectNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftClusterRoleObject(builder.build());
    }
    public N endOpenshiftClusterRoleObject(){
            return and();
    }

}
    public class RoleObjectNestedImpl<N> extends RoleFluentImpl<AdmissionRequestFluent.RoleObjectNested<N>> implements AdmissionRequestFluent.RoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleObjectNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleObjectNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withRoleObject(builder.build());
    }
    public N endRoleObject(){
            return and();
    }

}
    public class UserObjectNestedImpl<N> extends UserFluentImpl<AdmissionRequestFluent.UserObjectNested<N>> implements AdmissionRequestFluent.UserObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserObjectNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserObjectNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withUserObject(builder.build());
    }
    public N endUserObject(){
            return and();
    }

}
    public class ComponentStatusObjectNestedImpl<N> extends ComponentStatusFluentImpl<AdmissionRequestFluent.ComponentStatusObjectNested<N>> implements AdmissionRequestFluent.ComponentStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
    
            ComponentStatusObjectNestedImpl(ComponentStatus item){
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusObjectNestedImpl(){
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withComponentStatusObject(builder.build());
    }
    public N endComponentStatusObject(){
            return and();
    }

}
    public class TokenReviewObjectNestedImpl<N> extends TokenReviewFluentImpl<AdmissionRequestFluent.TokenReviewObjectNested<N>> implements AdmissionRequestFluent.TokenReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewObjectNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewObjectNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withTokenReviewObject(builder.build());
    }
    public N endTokenReviewObject(){
            return and();
    }

}
    public class BindingObjectNestedImpl<N> extends BindingFluentImpl<AdmissionRequestFluent.BindingObjectNested<N>> implements AdmissionRequestFluent.BindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingObjectNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingObjectNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBindingObject(builder.build());
    }
    public N endBindingObject(){
            return and();
    }

}
    public class SecretObjectNestedImpl<N> extends SecretFluentImpl<AdmissionRequestFluent.SecretObjectNested<N>> implements AdmissionRequestFluent.SecretObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretObjectNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretObjectNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withSecretObject(builder.build());
    }
    public N endSecretObject(){
            return and();
    }

}
    public class SecurityContextConstraintsObjectNestedImpl<N> extends SecurityContextConstraintsFluentImpl<AdmissionRequestFluent.SecurityContextConstraintsObjectNested<N>> implements AdmissionRequestFluent.SecurityContextConstraintsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsObjectNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsObjectNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withSecurityContextConstraintsObject(builder.build());
    }
    public N endSecurityContextConstraintsObject(){
            return and();
    }

}
    public class NetNamespaceObjectNestedImpl<N> extends NetNamespaceFluentImpl<AdmissionRequestFluent.NetNamespaceObjectNested<N>> implements AdmissionRequestFluent.NetNamespaceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNamespaceObjectNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceObjectNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNetNamespaceObject(builder.build());
    }
    public N endNetNamespaceObject(){
            return and();
    }

}
    public class NodeObjectNestedImpl<N> extends NodeFluentImpl<AdmissionRequestFluent.NodeObjectNested<N>> implements AdmissionRequestFluent.NodeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeObjectNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeObjectNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNodeObject(builder.build());
    }
    public N endNodeObject(){
            return and();
    }

}
    public class JobObjectNestedImpl<N> extends JobFluentImpl<AdmissionRequestFluent.JobObjectNested<N>> implements AdmissionRequestFluent.JobObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobObjectNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobObjectNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withJobObject(builder.build());
    }
    public N endJobObject(){
            return and();
    }

}
    public class CertificateSigningRequestObjectNestedImpl<N> extends CertificateSigningRequestFluentImpl<AdmissionRequestFluent.CertificateSigningRequestObjectNested<N>> implements AdmissionRequestFluent.CertificateSigningRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestObjectNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withCertificateSigningRequestObject(builder.build());
    }
    public N endCertificateSigningRequestObject(){
            return and();
    }

}
    public class ServiceAccountObjectNestedImpl<N> extends ServiceAccountFluentImpl<AdmissionRequestFluent.ServiceAccountObjectNested<N>> implements AdmissionRequestFluent.ServiceAccountObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountObjectNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountObjectNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withServiceAccountObject(builder.build());
    }
    public N endServiceAccountObject(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationOldObjectNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<N>> implements AdmissionRequestFluent.ValidatingWebhookConfigurationOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationOldObjectNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationOldObjectNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withValidatingWebhookConfigurationOldObject(builder.build());
    }
    public N endValidatingWebhookConfigurationOldObject(){
            return and();
    }

}
    public class StorageClassOldObjectNestedImpl<N> extends StorageClassFluentImpl<AdmissionRequestFluent.StorageClassOldObjectNested<N>> implements AdmissionRequestFluent.StorageClassOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassOldObjectNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassOldObjectNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withStorageClassOldObject(builder.build());
    }
    public N endStorageClassOldObject(){
            return and();
    }

}
    public class ClusterRoleBindingOldObjectNestedImpl<N> extends ClusterRoleBindingFluentImpl<AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<N>> implements AdmissionRequestFluent.ClusterRoleBindingOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingOldObjectNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingOldObjectNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withClusterRoleBindingOldObject(builder.build());
    }
    public N endClusterRoleBindingOldObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingOldObjectNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<N>> implements AdmissionRequestFluent.OpenshiftRoleBindingOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingOldObjectNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingOldObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftRoleBindingOldObject(builder.build());
    }
    public N endOpenshiftRoleBindingOldObject(){
            return and();
    }

}
    public class PodDisruptionBudgetOldObjectNestedImpl<N> extends PodDisruptionBudgetFluentImpl<AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<N>> implements AdmissionRequestFluent.PodDisruptionBudgetOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetOldObjectNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetOldObjectNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodDisruptionBudgetOldObject(builder.build());
    }
    public N endPodDisruptionBudgetOldObject(){
            return and();
    }

}
    public class NetworkPolicyOldObjectNestedImpl<N> extends NetworkPolicyFluentImpl<AdmissionRequestFluent.NetworkPolicyOldObjectNested<N>> implements AdmissionRequestFluent.NetworkPolicyOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyOldObjectNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyOldObjectNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNetworkPolicyOldObject(builder.build());
    }
    public N endNetworkPolicyOldObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingOldObjectNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<N>> implements AdmissionRequestFluent.OpenshiftClusterRoleBindingOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingOldObjectNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingOldObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftClusterRoleBindingOldObject(builder.build());
    }
    public N endOpenshiftClusterRoleBindingOldObject(){
            return and();
    }

}
    public class RouteOldObjectNestedImpl<N> extends RouteFluentImpl<AdmissionRequestFluent.RouteOldObjectNested<N>> implements AdmissionRequestFluent.RouteOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteOldObjectNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteOldObjectNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withRouteOldObject(builder.build());
    }
    public N endRouteOldObject(){
            return and();
    }

}
    public class NamespaceOldObjectNestedImpl<N> extends NamespaceFluentImpl<AdmissionRequestFluent.NamespaceOldObjectNested<N>> implements AdmissionRequestFluent.NamespaceOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceOldObjectNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceOldObjectNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNamespaceOldObject(builder.build());
    }
    public N endNamespaceOldObject(){
            return and();
    }

}
    public class LocalSubjectAccessReviewOldObjectNestedImpl<N> extends LocalSubjectAccessReviewFluentImpl<AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<N>> implements AdmissionRequestFluent.LocalSubjectAccessReviewOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalSubjectAccessReviewBuilder builder;
    
            LocalSubjectAccessReviewOldObjectNestedImpl(LocalSubjectAccessReview item){
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewOldObjectNestedImpl(){
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withLocalSubjectAccessReviewOldObject(builder.build());
    }
    public N endLocalSubjectAccessReviewOldObject(){
            return and();
    }

}
    public class ServiceOldObjectNestedImpl<N> extends ServiceFluentImpl<AdmissionRequestFluent.ServiceOldObjectNested<N>> implements AdmissionRequestFluent.ServiceOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
    
            ServiceOldObjectNestedImpl(Service item){
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceOldObjectNestedImpl(){
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withServiceOldObject(builder.build());
    }
    public N endServiceOldObject(){
            return and();
    }

}
    public class ReplicationControllerOldObjectNestedImpl<N> extends ReplicationControllerFluentImpl<AdmissionRequestFluent.ReplicationControllerOldObjectNested<N>> implements AdmissionRequestFluent.ReplicationControllerOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
    
            ReplicationControllerOldObjectNestedImpl(ReplicationController item){
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerOldObjectNestedImpl(){
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withReplicationControllerOldObject(builder.build());
    }
    public N endReplicationControllerOldObject(){
            return and();
    }

}
    public class SubjectAccessReviewOldObjectNestedImpl<N> extends SubjectAccessReviewFluentImpl<AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<N>> implements AdmissionRequestFluent.SubjectAccessReviewOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewBuilder builder;
    
            SubjectAccessReviewOldObjectNestedImpl(SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewOldObjectNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withSubjectAccessReviewOldObject(builder.build());
    }
    public N endSubjectAccessReviewOldObject(){
            return and();
    }

}
    public class MutatingWebhookConfigurationOldObjectNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<N>> implements AdmissionRequestFluent.MutatingWebhookConfigurationOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationOldObjectNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationOldObjectNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withMutatingWebhookConfigurationOldObject(builder.build());
    }
    public N endMutatingWebhookConfigurationOldObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerOldObjectNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<N>> implements AdmissionRequestFluent.HorizontalPodAutoscalerOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerOldObjectNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerOldObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withHorizontalPodAutoscalerOldObject(builder.build());
    }
    public N endHorizontalPodAutoscalerOldObject(){
            return and();
    }

}
    public class ScaleOldObjectNestedImpl<N> extends ScaleFluentImpl<AdmissionRequestFluent.ScaleOldObjectNested<N>> implements AdmissionRequestFluent.ScaleOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleOldObjectNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleOldObjectNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withScaleOldObject(builder.build());
    }
    public N endScaleOldObject(){
            return and();
    }

}
    public class ImageOldObjectNestedImpl<N> extends ImageFluentImpl<AdmissionRequestFluent.ImageOldObjectNested<N>> implements AdmissionRequestFluent.ImageOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageOldObjectNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageOldObjectNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageOldObject(builder.build());
    }
    public N endImageOldObject(){
            return and();
    }

}
    public class ReplicaSetOldObjectNestedImpl<N> extends ReplicaSetFluentImpl<AdmissionRequestFluent.ReplicaSetOldObjectNested<N>> implements AdmissionRequestFluent.ReplicaSetOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetOldObjectNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetOldObjectNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withReplicaSetOldObject(builder.build());
    }
    public N endReplicaSetOldObject(){
            return and();
    }

}
    public class PodSecurityPolicyOldObjectNestedImpl<N> extends PodSecurityPolicyFluentImpl<AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<N>> implements AdmissionRequestFluent.PodSecurityPolicyOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyOldObjectNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyOldObjectNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodSecurityPolicyOldObject(builder.build());
    }
    public N endPodSecurityPolicyOldObject(){
            return and();
    }

}
    public class CronJobOldObjectNestedImpl<N> extends CronJobFluentImpl<AdmissionRequestFluent.CronJobOldObjectNested<N>> implements AdmissionRequestFluent.CronJobOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobOldObjectNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobOldObjectNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withCronJobOldObject(builder.build());
    }
    public N endCronJobOldObject(){
            return and();
    }

}
    public class EndpointsOldObjectNestedImpl<N> extends EndpointsFluentImpl<AdmissionRequestFluent.EndpointsOldObjectNested<N>> implements AdmissionRequestFluent.EndpointsOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsOldObjectNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsOldObjectNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withEndpointsOldObject(builder.build());
    }
    public N endEndpointsOldObject(){
            return and();
    }

}
    public class PodOldObjectNestedImpl<N> extends PodFluentImpl<AdmissionRequestFluent.PodOldObjectNested<N>> implements AdmissionRequestFluent.PodOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
    
            PodOldObjectNestedImpl(Pod item){
                    this.builder = new PodBuilder(this, item);
            }
            PodOldObjectNestedImpl(){
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodOldObject(builder.build());
    }
    public N endPodOldObject(){
            return and();
    }

}
    public class ConfigMapOldObjectNestedImpl<N> extends ConfigMapFluentImpl<AdmissionRequestFluent.ConfigMapOldObjectNested<N>> implements AdmissionRequestFluent.ConfigMapOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapOldObjectNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapOldObjectNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withConfigMapOldObject(builder.build());
    }
    public N endConfigMapOldObject(){
            return and();
    }

}
    public class CustomResourceDefinitionOldObjectNestedImpl<N> extends CustomResourceDefinitionFluentImpl<AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<N>> implements AdmissionRequestFluent.CustomResourceDefinitionOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionOldObjectNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionOldObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withCustomResourceDefinitionOldObject(builder.build());
    }
    public N endCustomResourceDefinitionOldObject(){
            return and();
    }

}
    public class BuildOldObjectNestedImpl<N> extends BuildFluentImpl<AdmissionRequestFluent.BuildOldObjectNested<N>> implements AdmissionRequestFluent.BuildOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
    
            BuildOldObjectNestedImpl(Build item){
                    this.builder = new BuildBuilder(this, item);
            }
            BuildOldObjectNestedImpl(){
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBuildOldObject(builder.build());
    }
    public N endBuildOldObject(){
            return and();
    }

}
    public class ImageStreamTagOldObjectNestedImpl<N> extends ImageStreamTagFluentImpl<AdmissionRequestFluent.ImageStreamTagOldObjectNested<N>> implements AdmissionRequestFluent.ImageStreamTagOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
    
            ImageStreamTagOldObjectNestedImpl(ImageStreamTag item){
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagOldObjectNestedImpl(){
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageStreamTagOldObject(builder.build());
    }
    public N endImageStreamTagOldObject(){
            return and();
    }

}
    public class GroupOldObjectNestedImpl<N> extends GroupFluentImpl<AdmissionRequestFluent.GroupOldObjectNested<N>> implements AdmissionRequestFluent.GroupOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupOldObjectNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupOldObjectNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withGroupOldObject(builder.build());
    }
    public N endGroupOldObject(){
            return and();
    }

}
    public class ImageSignatureOldObjectNestedImpl<N> extends ImageSignatureFluentImpl<AdmissionRequestFluent.ImageSignatureOldObjectNested<N>> implements AdmissionRequestFluent.ImageSignatureOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
    
            ImageSignatureOldObjectNestedImpl(ImageSignature item){
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureOldObjectNestedImpl(){
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageSignatureOldObject(builder.build());
    }
    public N endImageSignatureOldObject(){
            return and();
    }

}
    public class ResourceQuotaOldObjectNestedImpl<N> extends ResourceQuotaFluentImpl<AdmissionRequestFluent.ResourceQuotaOldObjectNested<N>> implements AdmissionRequestFluent.ResourceQuotaOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaOldObjectNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaOldObjectNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withResourceQuotaOldObject(builder.build());
    }
    public N endResourceQuotaOldObject(){
            return and();
    }

}
    public class BuildRequestOldObjectNestedImpl<N> extends BuildRequestFluentImpl<AdmissionRequestFluent.BuildRequestOldObjectNested<N>> implements AdmissionRequestFluent.BuildRequestOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestOldObjectNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestOldObjectNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBuildRequestOldObject(builder.build());
    }
    public N endBuildRequestOldObject(){
            return and();
    }

}
    public class DaemonSetOldObjectNestedImpl<N> extends DaemonSetFluentImpl<AdmissionRequestFluent.DaemonSetOldObjectNested<N>> implements AdmissionRequestFluent.DaemonSetOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetOldObjectNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetOldObjectNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withDaemonSetOldObject(builder.build());
    }
    public N endDaemonSetOldObject(){
            return and();
    }

}
    public class ImageStreamOldObjectNestedImpl<N> extends ImageStreamFluentImpl<AdmissionRequestFluent.ImageStreamOldObjectNested<N>> implements AdmissionRequestFluent.ImageStreamOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImageStreamOldObjectNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamOldObjectNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageStreamOldObject(builder.build());
    }
    public N endImageStreamOldObject(){
            return and();
    }

}
    public class OpenshiftRoleOldObjectNestedImpl<N> extends OpenshiftRoleFluentImpl<AdmissionRequestFluent.OpenshiftRoleOldObjectNested<N>> implements AdmissionRequestFluent.OpenshiftRoleOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleOldObjectNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleOldObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftRoleOldObject(builder.build());
    }
    public N endOpenshiftRoleOldObject(){
            return and();
    }

}
    public class OAuthClientOldObjectNestedImpl<N> extends OAuthClientFluentImpl<AdmissionRequestFluent.OAuthClientOldObjectNested<N>> implements AdmissionRequestFluent.OAuthClientOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientOldObjectNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientOldObjectNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthClientOldObject(builder.build());
    }
    public N endOAuthClientOldObject(){
            return and();
    }

}
    public class IdentityOldObjectNestedImpl<N> extends IdentityFluentImpl<AdmissionRequestFluent.IdentityOldObjectNested<N>> implements AdmissionRequestFluent.IdentityOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityOldObjectNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityOldObjectNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withIdentityOldObject(builder.build());
    }
    public N endIdentityOldObject(){
            return and();
    }

}
    public class LimitRangeOldObjectNestedImpl<N> extends LimitRangeFluentImpl<AdmissionRequestFluent.LimitRangeOldObjectNested<N>> implements AdmissionRequestFluent.LimitRangeOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
    
            LimitRangeOldObjectNestedImpl(LimitRange item){
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeOldObjectNestedImpl(){
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withLimitRangeOldObject(builder.build());
    }
    public N endLimitRangeOldObject(){
            return and();
    }

}
    public class ImageStreamImportOldObjectNestedImpl<N> extends ImageStreamImportFluentImpl<AdmissionRequestFluent.ImageStreamImportOldObjectNested<N>> implements AdmissionRequestFluent.ImageStreamImportOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportOldObjectNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportOldObjectNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withImageStreamImportOldObject(builder.build());
    }
    public N endImageStreamImportOldObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionOldObjectNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<N>> implements AdmissionRequestFluent.OpenshiftRoleBindingRestrictionOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionOldObjectNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionOldObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftRoleBindingRestrictionOldObject(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionOldObject(){
            return and();
    }

}
    public class RoleBindingOldObjectNestedImpl<N> extends RoleBindingFluentImpl<AdmissionRequestFluent.RoleBindingOldObjectNested<N>> implements AdmissionRequestFluent.RoleBindingOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingOldObjectNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingOldObjectNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withRoleBindingOldObject(builder.build());
    }
    public N endRoleBindingOldObject(){
            return and();
    }

}
    public class PodPresetOldObjectNestedImpl<N> extends PodPresetFluentImpl<AdmissionRequestFluent.PodPresetOldObjectNested<N>> implements AdmissionRequestFluent.PodPresetOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetOldObjectNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetOldObjectNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodPresetOldObject(builder.build());
    }
    public N endPodPresetOldObject(){
            return and();
    }

}
    public class ProjectOldObjectNestedImpl<N> extends ProjectFluentImpl<AdmissionRequestFluent.ProjectOldObjectNested<N>> implements AdmissionRequestFluent.ProjectOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectOldObjectNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectOldObjectNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withProjectOldObject(builder.build());
    }
    public N endProjectOldObject(){
            return and();
    }

}
    public class BuildConfigOldObjectNestedImpl<N> extends BuildConfigFluentImpl<AdmissionRequestFluent.BuildConfigOldObjectNested<N>> implements AdmissionRequestFluent.BuildConfigOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
    
            BuildConfigOldObjectNestedImpl(BuildConfig item){
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigOldObjectNestedImpl(){
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBuildConfigOldObject(builder.build());
    }
    public N endBuildConfigOldObject(){
            return and();
    }

}
    public class ClusterRoleOldObjectNestedImpl<N> extends ClusterRoleFluentImpl<AdmissionRequestFluent.ClusterRoleOldObjectNested<N>> implements AdmissionRequestFluent.ClusterRoleOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleOldObjectNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleOldObjectNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withClusterRoleOldObject(builder.build());
    }
    public N endClusterRoleOldObject(){
            return and();
    }

}
    public class OAuthAuthorizeTokenOldObjectNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<N>> implements AdmissionRequestFluent.OAuthAuthorizeTokenOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenOldObjectNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenOldObjectNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthAuthorizeTokenOldObject(builder.build());
    }
    public N endOAuthAuthorizeTokenOldObject(){
            return and();
    }

}
    public class ProjectRequestOldObjectNestedImpl<N> extends ProjectRequestFluentImpl<AdmissionRequestFluent.ProjectRequestOldObjectNested<N>> implements AdmissionRequestFluent.ProjectRequestOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestOldObjectNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestOldObjectNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withProjectRequestOldObject(builder.build());
    }
    public N endProjectRequestOldObject(){
            return and();
    }

}
    public class PriorityClassOldObjectNestedImpl<N> extends PriorityClassFluentImpl<AdmissionRequestFluent.PriorityClassOldObjectNested<N>> implements AdmissionRequestFluent.PriorityClassOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassOldObjectNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassOldObjectNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPriorityClassOldObject(builder.build());
    }
    public N endPriorityClassOldObject(){
            return and();
    }

}
    public class TemplateOldObjectNestedImpl<N> extends TemplateFluentImpl<AdmissionRequestFluent.TemplateOldObjectNested<N>> implements AdmissionRequestFluent.TemplateOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateOldObjectNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateOldObjectNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withTemplateOldObject(builder.build());
    }
    public N endTemplateOldObject(){
            return and();
    }

}
    public class OAuthClientAuthorizationOldObjectNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<N>> implements AdmissionRequestFluent.OAuthClientAuthorizationOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationOldObjectNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationOldObjectNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthClientAuthorizationOldObject(builder.build());
    }
    public N endOAuthClientAuthorizationOldObject(){
            return and();
    }

}
    public class DeploymentOldObjectNestedImpl<N> extends DeploymentFluentImpl<AdmissionRequestFluent.DeploymentOldObjectNested<N>> implements AdmissionRequestFluent.DeploymentOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentOldObjectNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentOldObjectNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withDeploymentOldObject(builder.build());
    }
    public N endDeploymentOldObject(){
            return and();
    }

}
    public class PodTemplateOldObjectNestedImpl<N> extends PodTemplateFluentImpl<AdmissionRequestFluent.PodTemplateOldObjectNested<N>> implements AdmissionRequestFluent.PodTemplateOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
    
            PodTemplateOldObjectNestedImpl(PodTemplate item){
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateOldObjectNestedImpl(){
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPodTemplateOldObject(builder.build());
    }
    public N endPodTemplateOldObject(){
            return and();
    }

}
    public class EventOldObjectNestedImpl<N> extends EventFluentImpl<AdmissionRequestFluent.EventOldObjectNested<N>> implements AdmissionRequestFluent.EventOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
    
            EventOldObjectNestedImpl(Event item){
                    this.builder = new EventBuilder(this, item);
            }
            EventOldObjectNestedImpl(){
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withEventOldObject(builder.build());
    }
    public N endEventOldObject(){
            return and();
    }

}
    public class IngressOldObjectNestedImpl<N> extends IngressFluentImpl<AdmissionRequestFluent.IngressOldObjectNested<N>> implements AdmissionRequestFluent.IngressOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressOldObjectNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressOldObjectNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withIngressOldObject(builder.build());
    }
    public N endIngressOldObject(){
            return and();
    }

}
    public class DeploymentConfigOldObjectNestedImpl<N> extends DeploymentConfigFluentImpl<AdmissionRequestFluent.DeploymentConfigOldObjectNested<N>> implements AdmissionRequestFluent.DeploymentConfigOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigOldObjectNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigOldObjectNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withDeploymentConfigOldObject(builder.build());
    }
    public N endDeploymentConfigOldObject(){
            return and();
    }

}
    public class OAuthAccessTokenOldObjectNestedImpl<N> extends OAuthAccessTokenFluentImpl<AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<N>> implements AdmissionRequestFluent.OAuthAccessTokenOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenOldObjectNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenOldObjectNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOAuthAccessTokenOldObject(builder.build());
    }
    public N endOAuthAccessTokenOldObject(){
            return and();
    }

}
    public class PersistentVolumeOldObjectNestedImpl<N> extends PersistentVolumeFluentImpl<AdmissionRequestFluent.PersistentVolumeOldObjectNested<N>> implements AdmissionRequestFluent.PersistentVolumeOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeOldObjectNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeOldObjectNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPersistentVolumeOldObject(builder.build());
    }
    public N endPersistentVolumeOldObject(){
            return and();
    }

}
    public class PersistentVolumeClaimOldObjectNestedImpl<N> extends PersistentVolumeClaimFluentImpl<AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<N>> implements AdmissionRequestFluent.PersistentVolumeClaimOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimOldObjectNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimOldObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withPersistentVolumeClaimOldObject(builder.build());
    }
    public N endPersistentVolumeClaimOldObject(){
            return and();
    }

}
    public class EventsEventOldObjectNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<AdmissionRequestFluent.EventsEventOldObjectNested<N>> implements AdmissionRequestFluent.EventsEventOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventOldObjectNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventOldObjectNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withEventOldObject(builder.build());
    }
    public N endEventsEventOldObject(){
            return and();
    }

}
    public class StatefulSetOldObjectNestedImpl<N> extends StatefulSetFluentImpl<AdmissionRequestFluent.StatefulSetOldObjectNested<N>> implements AdmissionRequestFluent.StatefulSetOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetOldObjectNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetOldObjectNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withStatefulSetOldObject(builder.build());
    }
    public N endStatefulSetOldObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleOldObjectNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<N>> implements AdmissionRequestFluent.OpenshiftClusterRoleOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleOldObjectNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleOldObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withOpenshiftClusterRoleOldObject(builder.build());
    }
    public N endOpenshiftClusterRoleOldObject(){
            return and();
    }

}
    public class RoleOldObjectNestedImpl<N> extends RoleFluentImpl<AdmissionRequestFluent.RoleOldObjectNested<N>> implements AdmissionRequestFluent.RoleOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleOldObjectNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleOldObjectNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withRoleOldObject(builder.build());
    }
    public N endRoleOldObject(){
            return and();
    }

}
    public class UserOldObjectNestedImpl<N> extends UserFluentImpl<AdmissionRequestFluent.UserOldObjectNested<N>> implements AdmissionRequestFluent.UserOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserOldObjectNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserOldObjectNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withUserOldObject(builder.build());
    }
    public N endUserOldObject(){
            return and();
    }

}
    public class ComponentStatusOldObjectNestedImpl<N> extends ComponentStatusFluentImpl<AdmissionRequestFluent.ComponentStatusOldObjectNested<N>> implements AdmissionRequestFluent.ComponentStatusOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
    
            ComponentStatusOldObjectNestedImpl(ComponentStatus item){
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusOldObjectNestedImpl(){
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withComponentStatusOldObject(builder.build());
    }
    public N endComponentStatusOldObject(){
            return and();
    }

}
    public class TokenReviewOldObjectNestedImpl<N> extends TokenReviewFluentImpl<AdmissionRequestFluent.TokenReviewOldObjectNested<N>> implements AdmissionRequestFluent.TokenReviewOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewOldObjectNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewOldObjectNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withTokenReviewOldObject(builder.build());
    }
    public N endTokenReviewOldObject(){
            return and();
    }

}
    public class BindingOldObjectNestedImpl<N> extends BindingFluentImpl<AdmissionRequestFluent.BindingOldObjectNested<N>> implements AdmissionRequestFluent.BindingOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingOldObjectNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingOldObjectNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withBindingOldObject(builder.build());
    }
    public N endBindingOldObject(){
            return and();
    }

}
    public class SecretOldObjectNestedImpl<N> extends SecretFluentImpl<AdmissionRequestFluent.SecretOldObjectNested<N>> implements AdmissionRequestFluent.SecretOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretOldObjectNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretOldObjectNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withSecretOldObject(builder.build());
    }
    public N endSecretOldObject(){
            return and();
    }

}
    public class SecurityContextConstraintsOldObjectNestedImpl<N> extends SecurityContextConstraintsFluentImpl<AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<N>> implements AdmissionRequestFluent.SecurityContextConstraintsOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsOldObjectNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsOldObjectNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withSecurityContextConstraintsOldObject(builder.build());
    }
    public N endSecurityContextConstraintsOldObject(){
            return and();
    }

}
    public class NetNamespaceOldObjectNestedImpl<N> extends NetNamespaceFluentImpl<AdmissionRequestFluent.NetNamespaceOldObjectNested<N>> implements AdmissionRequestFluent.NetNamespaceOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNamespaceOldObjectNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceOldObjectNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNetNamespaceOldObject(builder.build());
    }
    public N endNetNamespaceOldObject(){
            return and();
    }

}
    public class NodeOldObjectNestedImpl<N> extends NodeFluentImpl<AdmissionRequestFluent.NodeOldObjectNested<N>> implements AdmissionRequestFluent.NodeOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeOldObjectNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeOldObjectNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withNodeOldObject(builder.build());
    }
    public N endNodeOldObject(){
            return and();
    }

}
    public class JobOldObjectNestedImpl<N> extends JobFluentImpl<AdmissionRequestFluent.JobOldObjectNested<N>> implements AdmissionRequestFluent.JobOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobOldObjectNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobOldObjectNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withJobOldObject(builder.build());
    }
    public N endJobOldObject(){
            return and();
    }

}
    public class CertificateSigningRequestOldObjectNestedImpl<N> extends CertificateSigningRequestFluentImpl<AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<N>> implements AdmissionRequestFluent.CertificateSigningRequestOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestOldObjectNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestOldObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withCertificateSigningRequestOldObject(builder.build());
    }
    public N endCertificateSigningRequestOldObject(){
            return and();
    }

}
    public class ServiceAccountOldObjectNestedImpl<N> extends ServiceAccountFluentImpl<AdmissionRequestFluent.ServiceAccountOldObjectNested<N>> implements AdmissionRequestFluent.ServiceAccountOldObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountOldObjectNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountOldObjectNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withServiceAccountOldObject(builder.build());
    }
    public N endServiceAccountOldObject(){
            return and();
    }

}
    public class ResourceNestedImpl<N> extends GroupVersionResourceFluentImpl<AdmissionRequestFluent.ResourceNested<N>> implements AdmissionRequestFluent.ResourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupVersionResourceBuilder builder;
    
            ResourceNestedImpl(GroupVersionResource item){
                    this.builder = new GroupVersionResourceBuilder(this, item);
            }
            ResourceNestedImpl(){
                    this.builder = new GroupVersionResourceBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withResource(builder.build());
    }
    public N endResource(){
            return and();
    }

}
    public class UserInfoNestedImpl<N> extends UserInfoFluentImpl<AdmissionRequestFluent.UserInfoNested<N>> implements AdmissionRequestFluent.UserInfoNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserInfoBuilder builder;
    
            UserInfoNestedImpl(UserInfo item){
                    this.builder = new UserInfoBuilder(this, item);
            }
            UserInfoNestedImpl(){
                    this.builder = new UserInfoBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionRequestFluentImpl.this.withUserInfo(builder.build());
    }
    public N endUserInfo(){
            return and();
    }

}


}
