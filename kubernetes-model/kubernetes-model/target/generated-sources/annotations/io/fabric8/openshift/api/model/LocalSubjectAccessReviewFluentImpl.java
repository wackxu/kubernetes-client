package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
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
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.ComponentStatusFluentImpl;
import io.fabric8.kubernetes.api.model.LimitRangeFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.PersistentVolumeBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.model.EventFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
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

public class LocalSubjectAccessReviewFluentImpl<A extends io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluent<A>{

    private String apiVersion;
    private VisitableBuilder<? extends HasMetadata,?> content;
    private List<String> groups;
    private Boolean isNonResourceURL;
    private String kind;
    private String namespace;
    private String path;
    private String resource;
    private String resourceAPIGroup;
    private String resourceAPIVersion;
    private String resourceName;
    private List<String> scopes;
    private String user;
    private String verb;

    public LocalSubjectAccessReviewFluentImpl(){
    }
    public LocalSubjectAccessReviewFluentImpl(io.fabric8.openshift.api.model.LocalSubjectAccessReview instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withContent(instance.getContent()); 
            this.withGroups(instance.getGroups()); 
            this.withIsNonResourceURL(instance.getIsNonResourceURL()); 
            this.withKind(instance.getKind()); 
            this.withNamespace(instance.getNamespace()); 
            this.withPath(instance.getPath()); 
            this.withResource(instance.getResource()); 
            this.withResourceAPIGroup(instance.getResourceAPIGroup()); 
            this.withResourceAPIVersion(instance.getResourceAPIVersion()); 
            this.withResourceName(instance.getResourceName()); 
            this.withScopes(instance.getScopes()); 
            this.withUser(instance.getUser()); 
            this.withVerb(instance.getVerb()); 
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

    
/**
 * This method has been deprecated, please use method buildContent instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getContent(){
            return this.content!=null?this.content.build():null;
    }

    public HasMetadata buildContent(){
            return this.content!=null?this.content.build():null;
    }

    public A withContent(HasMetadata content){
            if (content instanceof ValidatingWebhookConfiguration){ this.content= new ValidatingWebhookConfigurationBuilder((ValidatingWebhookConfiguration)content); _visitables.add(this.content);}
            if (content instanceof StorageClass){ this.content= new StorageClassBuilder((StorageClass)content); _visitables.add(this.content);}
            if (content instanceof ClusterRoleBinding){ this.content= new ClusterRoleBindingBuilder((ClusterRoleBinding)content); _visitables.add(this.content);}
            if (content instanceof OpenshiftRoleBinding){ this.content= new OpenshiftRoleBindingBuilder((OpenshiftRoleBinding)content); _visitables.add(this.content);}
            if (content instanceof PodDisruptionBudget){ this.content= new PodDisruptionBudgetBuilder((PodDisruptionBudget)content); _visitables.add(this.content);}
            if (content instanceof NetworkPolicy){ this.content= new NetworkPolicyBuilder((NetworkPolicy)content); _visitables.add(this.content);}
            if (content instanceof OpenshiftClusterRoleBinding){ this.content= new OpenshiftClusterRoleBindingBuilder((OpenshiftClusterRoleBinding)content); _visitables.add(this.content);}
            if (content instanceof Route){ this.content= new RouteBuilder((Route)content); _visitables.add(this.content);}
            if (content instanceof Namespace){ this.content= new NamespaceBuilder((Namespace)content); _visitables.add(this.content);}
            if (content instanceof LocalSubjectAccessReview){ this.content= new LocalSubjectAccessReviewBuilder((LocalSubjectAccessReview)content); _visitables.add(this.content);}
            if (content instanceof Service){ this.content= new ServiceBuilder((Service)content); _visitables.add(this.content);}
            if (content instanceof ReplicationController){ this.content= new ReplicationControllerBuilder((ReplicationController)content); _visitables.add(this.content);}
            if (content instanceof MutatingWebhookConfiguration){ this.content= new MutatingWebhookConfigurationBuilder((MutatingWebhookConfiguration)content); _visitables.add(this.content);}
            if (content instanceof HorizontalPodAutoscaler){ this.content= new HorizontalPodAutoscalerBuilder((HorizontalPodAutoscaler)content); _visitables.add(this.content);}
            if (content instanceof Scale){ this.content= new ScaleBuilder((Scale)content); _visitables.add(this.content);}
            if (content instanceof Image){ this.content= new ImageBuilder((Image)content); _visitables.add(this.content);}
            if (content instanceof ReplicaSet){ this.content= new ReplicaSetBuilder((ReplicaSet)content); _visitables.add(this.content);}
            if (content instanceof PodSecurityPolicy){ this.content= new PodSecurityPolicyBuilder((PodSecurityPolicy)content); _visitables.add(this.content);}
            if (content instanceof CronJob){ this.content= new CronJobBuilder((CronJob)content); _visitables.add(this.content);}
            if (content instanceof Endpoints){ this.content= new EndpointsBuilder((Endpoints)content); _visitables.add(this.content);}
            if (content instanceof Pod){ this.content= new PodBuilder((Pod)content); _visitables.add(this.content);}
            if (content instanceof ConfigMap){ this.content= new ConfigMapBuilder((ConfigMap)content); _visitables.add(this.content);}
            if (content instanceof CustomResourceDefinition){ this.content= new CustomResourceDefinitionBuilder((CustomResourceDefinition)content); _visitables.add(this.content);}
            if (content instanceof Build){ this.content= new BuildBuilder((Build)content); _visitables.add(this.content);}
            if (content instanceof ImageStreamTag){ this.content= new ImageStreamTagBuilder((ImageStreamTag)content); _visitables.add(this.content);}
            if (content instanceof Group){ this.content= new GroupBuilder((Group)content); _visitables.add(this.content);}
            if (content instanceof ImageSignature){ this.content= new ImageSignatureBuilder((ImageSignature)content); _visitables.add(this.content);}
            if (content instanceof ResourceQuota){ this.content= new ResourceQuotaBuilder((ResourceQuota)content); _visitables.add(this.content);}
            if (content instanceof BuildRequest){ this.content= new BuildRequestBuilder((BuildRequest)content); _visitables.add(this.content);}
            if (content instanceof DaemonSet){ this.content= new DaemonSetBuilder((DaemonSet)content); _visitables.add(this.content);}
            if (content instanceof ImageStream){ this.content= new ImageStreamBuilder((ImageStream)content); _visitables.add(this.content);}
            if (content instanceof OpenshiftRole){ this.content= new OpenshiftRoleBuilder((OpenshiftRole)content); _visitables.add(this.content);}
            if (content instanceof OAuthClient){ this.content= new OAuthClientBuilder((OAuthClient)content); _visitables.add(this.content);}
            if (content instanceof Identity){ this.content= new IdentityBuilder((Identity)content); _visitables.add(this.content);}
            if (content instanceof LimitRange){ this.content= new LimitRangeBuilder((LimitRange)content); _visitables.add(this.content);}
            if (content instanceof ImageStreamImport){ this.content= new ImageStreamImportBuilder((ImageStreamImport)content); _visitables.add(this.content);}
            if (content instanceof OpenshiftRoleBindingRestriction){ this.content= new OpenshiftRoleBindingRestrictionBuilder((OpenshiftRoleBindingRestriction)content); _visitables.add(this.content);}
            if (content instanceof RoleBinding){ this.content= new RoleBindingBuilder((RoleBinding)content); _visitables.add(this.content);}
            if (content instanceof PodPreset){ this.content= new PodPresetBuilder((PodPreset)content); _visitables.add(this.content);}
            if (content instanceof Project){ this.content= new ProjectBuilder((Project)content); _visitables.add(this.content);}
            if (content instanceof BuildConfig){ this.content= new BuildConfigBuilder((BuildConfig)content); _visitables.add(this.content);}
            if (content instanceof ClusterRole){ this.content= new ClusterRoleBuilder((ClusterRole)content); _visitables.add(this.content);}
            if (content instanceof OAuthAuthorizeToken){ this.content= new OAuthAuthorizeTokenBuilder((OAuthAuthorizeToken)content); _visitables.add(this.content);}
            if (content instanceof ProjectRequest){ this.content= new ProjectRequestBuilder((ProjectRequest)content); _visitables.add(this.content);}
            if (content instanceof PriorityClass){ this.content= new PriorityClassBuilder((PriorityClass)content); _visitables.add(this.content);}
            if (content instanceof Template){ this.content= new TemplateBuilder((Template)content); _visitables.add(this.content);}
            if (content instanceof OAuthClientAuthorization){ this.content= new OAuthClientAuthorizationBuilder((OAuthClientAuthorization)content); _visitables.add(this.content);}
            if (content instanceof Deployment){ this.content= new DeploymentBuilder((Deployment)content); _visitables.add(this.content);}
            if (content instanceof PodTemplate){ this.content= new PodTemplateBuilder((PodTemplate)content); _visitables.add(this.content);}
            if (content instanceof Event){ this.content= new EventBuilder((Event)content); _visitables.add(this.content);}
            if (content instanceof Ingress){ this.content= new IngressBuilder((Ingress)content); _visitables.add(this.content);}
            if (content instanceof DeploymentConfig){ this.content= new DeploymentConfigBuilder((DeploymentConfig)content); _visitables.add(this.content);}
            if (content instanceof OAuthAccessToken){ this.content= new OAuthAccessTokenBuilder((OAuthAccessToken)content); _visitables.add(this.content);}
            if (content instanceof PersistentVolume){ this.content= new PersistentVolumeBuilder((PersistentVolume)content); _visitables.add(this.content);}
            if (content instanceof PersistentVolumeClaim){ this.content= new PersistentVolumeClaimBuilder((PersistentVolumeClaim)content); _visitables.add(this.content);}
            if (content instanceof io.fabric8.kubernetes.api.model.events.Event){ this.content= new io.fabric8.kubernetes.api.model.events.EventBuilder((io.fabric8.kubernetes.api.model.events.Event)content); _visitables.add(this.content);}
            if (content instanceof StatefulSet){ this.content= new StatefulSetBuilder((StatefulSet)content); _visitables.add(this.content);}
            if (content instanceof OpenshiftClusterRole){ this.content= new OpenshiftClusterRoleBuilder((OpenshiftClusterRole)content); _visitables.add(this.content);}
            if (content instanceof Role){ this.content= new RoleBuilder((Role)content); _visitables.add(this.content);}
            if (content instanceof User){ this.content= new UserBuilder((User)content); _visitables.add(this.content);}
            if (content instanceof ComponentStatus){ this.content= new ComponentStatusBuilder((ComponentStatus)content); _visitables.add(this.content);}
            if (content instanceof TokenReview){ this.content= new TokenReviewBuilder((TokenReview)content); _visitables.add(this.content);}
            if (content instanceof Binding){ this.content= new BindingBuilder((Binding)content); _visitables.add(this.content);}
            if (content instanceof Secret){ this.content= new SecretBuilder((Secret)content); _visitables.add(this.content);}
            if (content instanceof SecurityContextConstraints){ this.content= new SecurityContextConstraintsBuilder((SecurityContextConstraints)content); _visitables.add(this.content);}
            if (content instanceof NetNamespace){ this.content= new NetNamespaceBuilder((NetNamespace)content); _visitables.add(this.content);}
            if (content instanceof Node){ this.content= new NodeBuilder((Node)content); _visitables.add(this.content);}
            if (content instanceof Job){ this.content= new JobBuilder((Job)content); _visitables.add(this.content);}
            if (content instanceof CertificateSigningRequest){ this.content= new CertificateSigningRequestBuilder((CertificateSigningRequest)content); _visitables.add(this.content);}
            if (content instanceof ServiceAccount){ this.content= new ServiceAccountBuilder((ServiceAccount)content); _visitables.add(this.content);}
            return (A) this;
    }

    public Boolean hasContent(){
            return this.content != null;
    }

    public A withValidatingWebhookConfigurationContent(ValidatingWebhookConfiguration validatingWebhookConfigurationContent){
            _visitables.remove(this.content);
            if (validatingWebhookConfigurationContent!=null){ this.content= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfigurationContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<A> withNewValidatingWebhookConfigurationContent(){
            return new ValidatingWebhookConfigurationContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<A> withNewValidatingWebhookConfigurationContentLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationContentNestedImpl(item);
    }

    public A withStorageClassContent(StorageClass storageClassContent){
            _visitables.remove(this.content);
            if (storageClassContent!=null){ this.content= new StorageClassBuilder(storageClassContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.StorageClassContentNested<A> withNewStorageClassContent(){
            return new StorageClassContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.StorageClassContentNested<A> withNewStorageClassContentLike(StorageClass item){
            return new StorageClassContentNestedImpl(item);
    }

    public A withClusterRoleBindingContent(ClusterRoleBinding clusterRoleBindingContent){
            _visitables.remove(this.content);
            if (clusterRoleBindingContent!=null){ this.content= new ClusterRoleBindingBuilder(clusterRoleBindingContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<A> withNewClusterRoleBindingContent(){
            return new ClusterRoleBindingContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<A> withNewClusterRoleBindingContentLike(ClusterRoleBinding item){
            return new ClusterRoleBindingContentNestedImpl(item);
    }

    public A withOpenshiftRoleBindingContent(OpenshiftRoleBinding openshiftRoleBindingContent){
            _visitables.remove(this.content);
            if (openshiftRoleBindingContent!=null){ this.content= new OpenshiftRoleBindingBuilder(openshiftRoleBindingContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<A> withNewOpenshiftRoleBindingContent(){
            return new OpenshiftRoleBindingContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<A> withNewOpenshiftRoleBindingContentLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingContentNestedImpl(item);
    }

    public A withPodDisruptionBudgetContent(PodDisruptionBudget podDisruptionBudgetContent){
            _visitables.remove(this.content);
            if (podDisruptionBudgetContent!=null){ this.content= new PodDisruptionBudgetBuilder(podDisruptionBudgetContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<A> withNewPodDisruptionBudgetContent(){
            return new PodDisruptionBudgetContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<A> withNewPodDisruptionBudgetContentLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetContentNestedImpl(item);
    }

    public A withNetworkPolicyContent(NetworkPolicy networkPolicyContent){
            _visitables.remove(this.content);
            if (networkPolicyContent!=null){ this.content= new NetworkPolicyBuilder(networkPolicyContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<A> withNewNetworkPolicyContent(){
            return new NetworkPolicyContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<A> withNewNetworkPolicyContentLike(NetworkPolicy item){
            return new NetworkPolicyContentNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingContent(OpenshiftClusterRoleBinding openshiftClusterRoleBindingContent){
            _visitables.remove(this.content);
            if (openshiftClusterRoleBindingContent!=null){ this.content= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBindingContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<A> withNewOpenshiftClusterRoleBindingContent(){
            return new OpenshiftClusterRoleBindingContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<A> withNewOpenshiftClusterRoleBindingContentLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingContentNestedImpl(item);
    }

    public A withRouteContent(Route routeContent){
            _visitables.remove(this.content);
            if (routeContent!=null){ this.content= new RouteBuilder(routeContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.RouteContentNested<A> withNewRouteContent(){
            return new RouteContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.RouteContentNested<A> withNewRouteContentLike(Route item){
            return new RouteContentNestedImpl(item);
    }

    public A withNamespaceContent(Namespace namespaceContent){
            _visitables.remove(this.content);
            if (namespaceContent!=null){ this.content= new NamespaceBuilder(namespaceContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.NamespaceContentNested<A> withNewNamespaceContent(){
            return new NamespaceContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.NamespaceContentNested<A> withNewNamespaceContentLike(Namespace item){
            return new NamespaceContentNestedImpl(item);
    }

    public A withServiceContent(Service serviceContent){
            _visitables.remove(this.content);
            if (serviceContent!=null){ this.content= new ServiceBuilder(serviceContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ServiceContentNested<A> withNewServiceContent(){
            return new ServiceContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ServiceContentNested<A> withNewServiceContentLike(Service item){
            return new ServiceContentNestedImpl(item);
    }

    public A withReplicationControllerContent(ReplicationController replicationControllerContent){
            _visitables.remove(this.content);
            if (replicationControllerContent!=null){ this.content= new ReplicationControllerBuilder(replicationControllerContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<A> withNewReplicationControllerContent(){
            return new ReplicationControllerContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<A> withNewReplicationControllerContentLike(ReplicationController item){
            return new ReplicationControllerContentNestedImpl(item);
    }

    public A withSubjectAccessReviewContent(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview subjectAccessReviewContent){
            _visitables.remove(this.content);
            if (subjectAccessReviewContent!=null){ this.content= new SubjectAccessReviewBuilder(subjectAccessReviewContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<A> withNewSubjectAccessReviewContent(){
            return new SubjectAccessReviewContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<A> withNewSubjectAccessReviewContentLike(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
            return new SubjectAccessReviewContentNestedImpl(item);
    }

    public A withMutatingWebhookConfigurationContent(MutatingWebhookConfiguration mutatingWebhookConfigurationContent){
            _visitables.remove(this.content);
            if (mutatingWebhookConfigurationContent!=null){ this.content= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfigurationContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<A> withNewMutatingWebhookConfigurationContent(){
            return new MutatingWebhookConfigurationContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<A> withNewMutatingWebhookConfigurationContentLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationContentNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerContent(HorizontalPodAutoscaler horizontalPodAutoscalerContent){
            _visitables.remove(this.content);
            if (horizontalPodAutoscalerContent!=null){ this.content= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscalerContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<A> withNewHorizontalPodAutoscalerContent(){
            return new HorizontalPodAutoscalerContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<A> withNewHorizontalPodAutoscalerContentLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerContentNestedImpl(item);
    }

    public A withScaleContent(Scale scaleContent){
            _visitables.remove(this.content);
            if (scaleContent!=null){ this.content= new ScaleBuilder(scaleContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ScaleContentNested<A> withNewScaleContent(){
            return new ScaleContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ScaleContentNested<A> withNewScaleContentLike(Scale item){
            return new ScaleContentNestedImpl(item);
    }

    public A withImageContent(Image imageContent){
            _visitables.remove(this.content);
            if (imageContent!=null){ this.content= new ImageBuilder(imageContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ImageContentNested<A> withNewImageContent(){
            return new ImageContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ImageContentNested<A> withNewImageContentLike(Image item){
            return new ImageContentNestedImpl(item);
    }

    public A withReplicaSetContent(ReplicaSet replicaSetContent){
            _visitables.remove(this.content);
            if (replicaSetContent!=null){ this.content= new ReplicaSetBuilder(replicaSetContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ReplicaSetContentNested<A> withNewReplicaSetContent(){
            return new ReplicaSetContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ReplicaSetContentNested<A> withNewReplicaSetContentLike(ReplicaSet item){
            return new ReplicaSetContentNestedImpl(item);
    }

    public A withPodSecurityPolicyContent(PodSecurityPolicy podSecurityPolicyContent){
            _visitables.remove(this.content);
            if (podSecurityPolicyContent!=null){ this.content= new PodSecurityPolicyBuilder(podSecurityPolicyContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<A> withNewPodSecurityPolicyContent(){
            return new PodSecurityPolicyContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<A> withNewPodSecurityPolicyContentLike(PodSecurityPolicy item){
            return new PodSecurityPolicyContentNestedImpl(item);
    }

    public A withCronJobContent(CronJob cronJobContent){
            _visitables.remove(this.content);
            if (cronJobContent!=null){ this.content= new CronJobBuilder(cronJobContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.CronJobContentNested<A> withNewCronJobContent(){
            return new CronJobContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.CronJobContentNested<A> withNewCronJobContentLike(CronJob item){
            return new CronJobContentNestedImpl(item);
    }

    public A withEndpointsContent(Endpoints endpointsContent){
            _visitables.remove(this.content);
            if (endpointsContent!=null){ this.content= new EndpointsBuilder(endpointsContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.EndpointsContentNested<A> withNewEndpointsContent(){
            return new EndpointsContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.EndpointsContentNested<A> withNewEndpointsContentLike(Endpoints item){
            return new EndpointsContentNestedImpl(item);
    }

    public A withPodContent(Pod podContent){
            _visitables.remove(this.content);
            if (podContent!=null){ this.content= new PodBuilder(podContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PodContentNested<A> withNewPodContent(){
            return new PodContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PodContentNested<A> withNewPodContentLike(Pod item){
            return new PodContentNestedImpl(item);
    }

    public A withConfigMapContent(ConfigMap configMapContent){
            _visitables.remove(this.content);
            if (configMapContent!=null){ this.content= new ConfigMapBuilder(configMapContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ConfigMapContentNested<A> withNewConfigMapContent(){
            return new ConfigMapContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ConfigMapContentNested<A> withNewConfigMapContentLike(ConfigMap item){
            return new ConfigMapContentNestedImpl(item);
    }

    public A withCustomResourceDefinitionContent(CustomResourceDefinition customResourceDefinitionContent){
            _visitables.remove(this.content);
            if (customResourceDefinitionContent!=null){ this.content= new CustomResourceDefinitionBuilder(customResourceDefinitionContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<A> withNewCustomResourceDefinitionContent(){
            return new CustomResourceDefinitionContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<A> withNewCustomResourceDefinitionContentLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionContentNestedImpl(item);
    }

    public A withBuildContent(Build buildContent){
            _visitables.remove(this.content);
            if (buildContent!=null){ this.content= new BuildBuilder(buildContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.BuildContentNested<A> withNewBuildContent(){
            return new BuildContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.BuildContentNested<A> withNewBuildContentLike(Build item){
            return new BuildContentNestedImpl(item);
    }

    public A withImageStreamTagContent(ImageStreamTag imageStreamTagContent){
            _visitables.remove(this.content);
            if (imageStreamTagContent!=null){ this.content= new ImageStreamTagBuilder(imageStreamTagContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<A> withNewImageStreamTagContent(){
            return new ImageStreamTagContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<A> withNewImageStreamTagContentLike(ImageStreamTag item){
            return new ImageStreamTagContentNestedImpl(item);
    }

    public A withGroupContent(Group groupContent){
            _visitables.remove(this.content);
            if (groupContent!=null){ this.content= new GroupBuilder(groupContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.GroupContentNested<A> withNewGroupContent(){
            return new GroupContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.GroupContentNested<A> withNewGroupContentLike(Group item){
            return new GroupContentNestedImpl(item);
    }

    public A withImageSignatureContent(ImageSignature imageSignatureContent){
            _visitables.remove(this.content);
            if (imageSignatureContent!=null){ this.content= new ImageSignatureBuilder(imageSignatureContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ImageSignatureContentNested<A> withNewImageSignatureContent(){
            return new ImageSignatureContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ImageSignatureContentNested<A> withNewImageSignatureContentLike(ImageSignature item){
            return new ImageSignatureContentNestedImpl(item);
    }

    public A withResourceQuotaContent(ResourceQuota resourceQuotaContent){
            _visitables.remove(this.content);
            if (resourceQuotaContent!=null){ this.content= new ResourceQuotaBuilder(resourceQuotaContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<A> withNewResourceQuotaContent(){
            return new ResourceQuotaContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<A> withNewResourceQuotaContentLike(ResourceQuota item){
            return new ResourceQuotaContentNestedImpl(item);
    }

    public A withBuildRequestContent(BuildRequest buildRequestContent){
            _visitables.remove(this.content);
            if (buildRequestContent!=null){ this.content= new BuildRequestBuilder(buildRequestContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.BuildRequestContentNested<A> withNewBuildRequestContent(){
            return new BuildRequestContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.BuildRequestContentNested<A> withNewBuildRequestContentLike(BuildRequest item){
            return new BuildRequestContentNestedImpl(item);
    }

    public A withDaemonSetContent(DaemonSet daemonSetContent){
            _visitables.remove(this.content);
            if (daemonSetContent!=null){ this.content= new DaemonSetBuilder(daemonSetContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.DaemonSetContentNested<A> withNewDaemonSetContent(){
            return new DaemonSetContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.DaemonSetContentNested<A> withNewDaemonSetContentLike(DaemonSet item){
            return new DaemonSetContentNestedImpl(item);
    }

    public A withImageStreamContent(ImageStream imageStreamContent){
            _visitables.remove(this.content);
            if (imageStreamContent!=null){ this.content= new ImageStreamBuilder(imageStreamContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ImageStreamContentNested<A> withNewImageStreamContent(){
            return new ImageStreamContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ImageStreamContentNested<A> withNewImageStreamContentLike(ImageStream item){
            return new ImageStreamContentNestedImpl(item);
    }

    public A withOpenshiftRoleContent(OpenshiftRole openshiftRoleContent){
            _visitables.remove(this.content);
            if (openshiftRoleContent!=null){ this.content= new OpenshiftRoleBuilder(openshiftRoleContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<A> withNewOpenshiftRoleContent(){
            return new OpenshiftRoleContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<A> withNewOpenshiftRoleContentLike(OpenshiftRole item){
            return new OpenshiftRoleContentNestedImpl(item);
    }

    public A withOAuthClientContent(OAuthClient oAuthClientContent){
            _visitables.remove(this.content);
            if (oAuthClientContent!=null){ this.content= new OAuthClientBuilder(oAuthClientContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OAuthClientContentNested<A> withNewOAuthClientContent(){
            return new OAuthClientContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OAuthClientContentNested<A> withNewOAuthClientContentLike(OAuthClient item){
            return new OAuthClientContentNestedImpl(item);
    }

    public A withIdentityContent(Identity identityContent){
            _visitables.remove(this.content);
            if (identityContent!=null){ this.content= new IdentityBuilder(identityContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.IdentityContentNested<A> withNewIdentityContent(){
            return new IdentityContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.IdentityContentNested<A> withNewIdentityContentLike(Identity item){
            return new IdentityContentNestedImpl(item);
    }

    public A withLimitRangeContent(LimitRange limitRangeContent){
            _visitables.remove(this.content);
            if (limitRangeContent!=null){ this.content= new LimitRangeBuilder(limitRangeContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.LimitRangeContentNested<A> withNewLimitRangeContent(){
            return new LimitRangeContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.LimitRangeContentNested<A> withNewLimitRangeContentLike(LimitRange item){
            return new LimitRangeContentNestedImpl(item);
    }

    public A withImageStreamImportContent(ImageStreamImport imageStreamImportContent){
            _visitables.remove(this.content);
            if (imageStreamImportContent!=null){ this.content= new ImageStreamImportBuilder(imageStreamImportContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<A> withNewImageStreamImportContent(){
            return new ImageStreamImportContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<A> withNewImageStreamImportContentLike(ImageStreamImport item){
            return new ImageStreamImportContentNestedImpl(item);
    }

    public A withOpenshiftRoleBindingRestrictionContent(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionContent){
            _visitables.remove(this.content);
            if (openshiftRoleBindingRestrictionContent!=null){ this.content= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestrictionContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<A> withNewOpenshiftRoleBindingRestrictionContent(){
            return new OpenshiftRoleBindingRestrictionContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<A> withNewOpenshiftRoleBindingRestrictionContentLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionContentNestedImpl(item);
    }

    public A withRoleBindingContent(RoleBinding roleBindingContent){
            _visitables.remove(this.content);
            if (roleBindingContent!=null){ this.content= new RoleBindingBuilder(roleBindingContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.RoleBindingContentNested<A> withNewRoleBindingContent(){
            return new RoleBindingContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.RoleBindingContentNested<A> withNewRoleBindingContentLike(RoleBinding item){
            return new RoleBindingContentNestedImpl(item);
    }

    public A withPodPresetContent(PodPreset podPresetContent){
            _visitables.remove(this.content);
            if (podPresetContent!=null){ this.content= new PodPresetBuilder(podPresetContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PodPresetContentNested<A> withNewPodPresetContent(){
            return new PodPresetContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PodPresetContentNested<A> withNewPodPresetContentLike(PodPreset item){
            return new PodPresetContentNestedImpl(item);
    }

    public A withProjectContent(Project projectContent){
            _visitables.remove(this.content);
            if (projectContent!=null){ this.content= new ProjectBuilder(projectContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ProjectContentNested<A> withNewProjectContent(){
            return new ProjectContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ProjectContentNested<A> withNewProjectContentLike(Project item){
            return new ProjectContentNestedImpl(item);
    }

    public A withBuildConfigContent(BuildConfig buildConfigContent){
            _visitables.remove(this.content);
            if (buildConfigContent!=null){ this.content= new BuildConfigBuilder(buildConfigContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.BuildConfigContentNested<A> withNewBuildConfigContent(){
            return new BuildConfigContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.BuildConfigContentNested<A> withNewBuildConfigContentLike(BuildConfig item){
            return new BuildConfigContentNestedImpl(item);
    }

    public A withClusterRoleContent(ClusterRole clusterRoleContent){
            _visitables.remove(this.content);
            if (clusterRoleContent!=null){ this.content= new ClusterRoleBuilder(clusterRoleContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ClusterRoleContentNested<A> withNewClusterRoleContent(){
            return new ClusterRoleContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ClusterRoleContentNested<A> withNewClusterRoleContentLike(ClusterRole item){
            return new ClusterRoleContentNestedImpl(item);
    }

    public A withOAuthAuthorizeTokenContent(OAuthAuthorizeToken oAuthAuthorizeTokenContent){
            _visitables.remove(this.content);
            if (oAuthAuthorizeTokenContent!=null){ this.content= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeTokenContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<A> withNewOAuthAuthorizeTokenContent(){
            return new OAuthAuthorizeTokenContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<A> withNewOAuthAuthorizeTokenContentLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenContentNestedImpl(item);
    }

    public A withProjectRequestContent(ProjectRequest projectRequestContent){
            _visitables.remove(this.content);
            if (projectRequestContent!=null){ this.content= new ProjectRequestBuilder(projectRequestContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ProjectRequestContentNested<A> withNewProjectRequestContent(){
            return new ProjectRequestContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ProjectRequestContentNested<A> withNewProjectRequestContentLike(ProjectRequest item){
            return new ProjectRequestContentNestedImpl(item);
    }

    public A withPriorityClassContent(PriorityClass priorityClassContent){
            _visitables.remove(this.content);
            if (priorityClassContent!=null){ this.content= new PriorityClassBuilder(priorityClassContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PriorityClassContentNested<A> withNewPriorityClassContent(){
            return new PriorityClassContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PriorityClassContentNested<A> withNewPriorityClassContentLike(PriorityClass item){
            return new PriorityClassContentNestedImpl(item);
    }

    public A withTemplateContent(Template templateContent){
            _visitables.remove(this.content);
            if (templateContent!=null){ this.content= new TemplateBuilder(templateContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.TemplateContentNested<A> withNewTemplateContent(){
            return new TemplateContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.TemplateContentNested<A> withNewTemplateContentLike(Template item){
            return new TemplateContentNestedImpl(item);
    }

    public A withOAuthClientAuthorizationContent(OAuthClientAuthorization oAuthClientAuthorizationContent){
            _visitables.remove(this.content);
            if (oAuthClientAuthorizationContent!=null){ this.content= new OAuthClientAuthorizationBuilder(oAuthClientAuthorizationContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<A> withNewOAuthClientAuthorizationContent(){
            return new OAuthClientAuthorizationContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<A> withNewOAuthClientAuthorizationContentLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationContentNestedImpl(item);
    }

    public A withDeploymentContent(Deployment deploymentContent){
            _visitables.remove(this.content);
            if (deploymentContent!=null){ this.content= new DeploymentBuilder(deploymentContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.DeploymentContentNested<A> withNewDeploymentContent(){
            return new DeploymentContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.DeploymentContentNested<A> withNewDeploymentContentLike(Deployment item){
            return new DeploymentContentNestedImpl(item);
    }

    public A withPodTemplateContent(PodTemplate podTemplateContent){
            _visitables.remove(this.content);
            if (podTemplateContent!=null){ this.content= new PodTemplateBuilder(podTemplateContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PodTemplateContentNested<A> withNewPodTemplateContent(){
            return new PodTemplateContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PodTemplateContentNested<A> withNewPodTemplateContentLike(PodTemplate item){
            return new PodTemplateContentNestedImpl(item);
    }

    public A withEventContent(Event eventContent){
            _visitables.remove(this.content);
            if (eventContent!=null){ this.content= new EventBuilder(eventContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.EventContentNested<A> withNewEventContent(){
            return new EventContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.EventContentNested<A> withNewEventContentLike(Event item){
            return new EventContentNestedImpl(item);
    }

    public A withIngressContent(Ingress ingressContent){
            _visitables.remove(this.content);
            if (ingressContent!=null){ this.content= new IngressBuilder(ingressContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.IngressContentNested<A> withNewIngressContent(){
            return new IngressContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.IngressContentNested<A> withNewIngressContentLike(Ingress item){
            return new IngressContentNestedImpl(item);
    }

    public A withDeploymentConfigContent(DeploymentConfig deploymentConfigContent){
            _visitables.remove(this.content);
            if (deploymentConfigContent!=null){ this.content= new DeploymentConfigBuilder(deploymentConfigContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<A> withNewDeploymentConfigContent(){
            return new DeploymentConfigContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<A> withNewDeploymentConfigContentLike(DeploymentConfig item){
            return new DeploymentConfigContentNestedImpl(item);
    }

    public A withOAuthAccessTokenContent(OAuthAccessToken oAuthAccessTokenContent){
            _visitables.remove(this.content);
            if (oAuthAccessTokenContent!=null){ this.content= new OAuthAccessTokenBuilder(oAuthAccessTokenContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<A> withNewOAuthAccessTokenContent(){
            return new OAuthAccessTokenContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<A> withNewOAuthAccessTokenContentLike(OAuthAccessToken item){
            return new OAuthAccessTokenContentNestedImpl(item);
    }

    public A withPersistentVolumeContent(PersistentVolume persistentVolumeContent){
            _visitables.remove(this.content);
            if (persistentVolumeContent!=null){ this.content= new PersistentVolumeBuilder(persistentVolumeContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<A> withNewPersistentVolumeContent(){
            return new PersistentVolumeContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<A> withNewPersistentVolumeContentLike(PersistentVolume item){
            return new PersistentVolumeContentNestedImpl(item);
    }

    public A withPersistentVolumeClaimContent(PersistentVolumeClaim persistentVolumeClaimContent){
            _visitables.remove(this.content);
            if (persistentVolumeClaimContent!=null){ this.content= new PersistentVolumeClaimBuilder(persistentVolumeClaimContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<A> withNewPersistentVolumeClaimContent(){
            return new PersistentVolumeClaimContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<A> withNewPersistentVolumeClaimContentLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimContentNestedImpl(item);
    }

    public A withEventContent(io.fabric8.kubernetes.api.model.events.Event eventContent){
            _visitables.remove(this.content);
            if (eventContent!=null){ this.content= new io.fabric8.kubernetes.api.model.events.EventBuilder(eventContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.EventsEventContentNested<A> withNewEventsEventContent(){
            return new EventsEventContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.EventsEventContentNested<A> withNewEventContentLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventContentNestedImpl(item);
    }

    public A withStatefulSetContent(StatefulSet statefulSetContent){
            _visitables.remove(this.content);
            if (statefulSetContent!=null){ this.content= new StatefulSetBuilder(statefulSetContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.StatefulSetContentNested<A> withNewStatefulSetContent(){
            return new StatefulSetContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.StatefulSetContentNested<A> withNewStatefulSetContentLike(StatefulSet item){
            return new StatefulSetContentNestedImpl(item);
    }

    public A withOpenshiftClusterRoleContent(OpenshiftClusterRole openshiftClusterRoleContent){
            _visitables.remove(this.content);
            if (openshiftClusterRoleContent!=null){ this.content= new OpenshiftClusterRoleBuilder(openshiftClusterRoleContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<A> withNewOpenshiftClusterRoleContent(){
            return new OpenshiftClusterRoleContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<A> withNewOpenshiftClusterRoleContentLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleContentNestedImpl(item);
    }

    public A withRoleContent(Role roleContent){
            _visitables.remove(this.content);
            if (roleContent!=null){ this.content= new RoleBuilder(roleContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.RoleContentNested<A> withNewRoleContent(){
            return new RoleContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.RoleContentNested<A> withNewRoleContentLike(Role item){
            return new RoleContentNestedImpl(item);
    }

    public A withUserContent(User userContent){
            _visitables.remove(this.content);
            if (userContent!=null){ this.content= new UserBuilder(userContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.UserContentNested<A> withNewUserContent(){
            return new UserContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.UserContentNested<A> withNewUserContentLike(User item){
            return new UserContentNestedImpl(item);
    }

    public A withComponentStatusContent(ComponentStatus componentStatusContent){
            _visitables.remove(this.content);
            if (componentStatusContent!=null){ this.content= new ComponentStatusBuilder(componentStatusContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ComponentStatusContentNested<A> withNewComponentStatusContent(){
            return new ComponentStatusContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ComponentStatusContentNested<A> withNewComponentStatusContentLike(ComponentStatus item){
            return new ComponentStatusContentNestedImpl(item);
    }

    public A withTokenReviewContent(TokenReview tokenReviewContent){
            _visitables.remove(this.content);
            if (tokenReviewContent!=null){ this.content= new TokenReviewBuilder(tokenReviewContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.TokenReviewContentNested<A> withNewTokenReviewContent(){
            return new TokenReviewContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.TokenReviewContentNested<A> withNewTokenReviewContentLike(TokenReview item){
            return new TokenReviewContentNestedImpl(item);
    }

    public A withBindingContent(Binding bindingContent){
            _visitables.remove(this.content);
            if (bindingContent!=null){ this.content= new BindingBuilder(bindingContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.BindingContentNested<A> withNewBindingContent(){
            return new BindingContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.BindingContentNested<A> withNewBindingContentLike(Binding item){
            return new BindingContentNestedImpl(item);
    }

    public A withSecretContent(Secret secretContent){
            _visitables.remove(this.content);
            if (secretContent!=null){ this.content= new SecretBuilder(secretContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.SecretContentNested<A> withNewSecretContent(){
            return new SecretContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.SecretContentNested<A> withNewSecretContentLike(Secret item){
            return new SecretContentNestedImpl(item);
    }

    public A withSecurityContextConstraintsContent(SecurityContextConstraints securityContextConstraintsContent){
            _visitables.remove(this.content);
            if (securityContextConstraintsContent!=null){ this.content= new SecurityContextConstraintsBuilder(securityContextConstraintsContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<A> withNewSecurityContextConstraintsContent(){
            return new SecurityContextConstraintsContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<A> withNewSecurityContextConstraintsContentLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsContentNestedImpl(item);
    }

    public A withNetNamespaceContent(NetNamespace netNamespaceContent){
            _visitables.remove(this.content);
            if (netNamespaceContent!=null){ this.content= new NetNamespaceBuilder(netNamespaceContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.NetNamespaceContentNested<A> withNewNetNamespaceContent(){
            return new NetNamespaceContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.NetNamespaceContentNested<A> withNewNetNamespaceContentLike(NetNamespace item){
            return new NetNamespaceContentNestedImpl(item);
    }

    public A withNodeContent(Node nodeContent){
            _visitables.remove(this.content);
            if (nodeContent!=null){ this.content= new NodeBuilder(nodeContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.NodeContentNested<A> withNewNodeContent(){
            return new NodeContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.NodeContentNested<A> withNewNodeContentLike(Node item){
            return new NodeContentNestedImpl(item);
    }

    public A withJobContent(Job jobContent){
            _visitables.remove(this.content);
            if (jobContent!=null){ this.content= new JobBuilder(jobContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.JobContentNested<A> withNewJobContent(){
            return new JobContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.JobContentNested<A> withNewJobContentLike(Job item){
            return new JobContentNestedImpl(item);
    }

    public A withCertificateSigningRequestContent(CertificateSigningRequest certificateSigningRequestContent){
            _visitables.remove(this.content);
            if (certificateSigningRequestContent!=null){ this.content= new CertificateSigningRequestBuilder(certificateSigningRequestContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<A> withNewCertificateSigningRequestContent(){
            return new CertificateSigningRequestContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<A> withNewCertificateSigningRequestContentLike(CertificateSigningRequest item){
            return new CertificateSigningRequestContentNestedImpl(item);
    }

    public A withServiceAccountContent(ServiceAccount serviceAccountContent){
            _visitables.remove(this.content);
            if (serviceAccountContent!=null){ this.content= new ServiceAccountBuilder(serviceAccountContent); _visitables.add(this.content);} return (A) this;
    }

    public LocalSubjectAccessReviewFluent.ServiceAccountContentNested<A> withNewServiceAccountContent(){
            return new ServiceAccountContentNestedImpl();
    }

    public LocalSubjectAccessReviewFluent.ServiceAccountContentNested<A> withNewServiceAccountContentLike(ServiceAccount item){
            return new ServiceAccountContentNestedImpl(item);
    }

    public A addToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.add(index, item);
            return (A)this;
    }

    public A setToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.set(index, item); return (A)this;
    }

    public A addToGroups(String... items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A addAllToGroups(Collection<String> items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A removeFromGroups(String... items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public A removeAllFromGroups(Collection<String> items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public List<String> getGroups(){
            return this.groups;
    }

    public String getGroup(int index){
            return this.groups.get(index);
    }

    public String getFirstGroup(){
            return this.groups.get(0);
    }

    public String getLastGroup(){
            return this.groups.get(groups.size() - 1);
    }

    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: groups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withGroups(List<String> groups){
            if (this.groups != null) { _visitables.removeAll(this.groups);}
            if (groups != null) {this.groups = new ArrayList<String>(); for (String item : groups){this.addToGroups(item);}} else { this.groups = new ArrayList<String>();} return (A) this;
    }

    public A withGroups(String... groups){
            if (this.groups != null) {this.groups.clear();}
            if (groups != null) {for (String item :groups){ this.addToGroups(item);}} return (A) this;
    }

    public Boolean hasGroups(){
            return groups != null && !groups.isEmpty();
    }

    public Boolean isIsNonResourceURL(){
            return this.isNonResourceURL;
    }

    public A withIsNonResourceURL(Boolean isNonResourceURL){
            this.isNonResourceURL=isNonResourceURL; return (A) this;
    }

    public Boolean hasIsNonResourceURL(){
            return this.isNonResourceURL != null;
    }

    public A withNewIsNonResourceURL(String arg1){
            return (A)withIsNonResourceURL(new Boolean(arg1));
    }

    public A withNewIsNonResourceURL(boolean arg1){
            return (A)withIsNonResourceURL(new Boolean(arg1));
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

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    public String getResource(){
            return this.resource;
    }

    public A withResource(String resource){
            this.resource=resource; return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
    }

    public String getResourceAPIGroup(){
            return this.resourceAPIGroup;
    }

    public A withResourceAPIGroup(String resourceAPIGroup){
            this.resourceAPIGroup=resourceAPIGroup; return (A) this;
    }

    public Boolean hasResourceAPIGroup(){
            return this.resourceAPIGroup != null;
    }

    public String getResourceAPIVersion(){
            return this.resourceAPIVersion;
    }

    public A withResourceAPIVersion(String resourceAPIVersion){
            this.resourceAPIVersion=resourceAPIVersion; return (A) this;
    }

    public Boolean hasResourceAPIVersion(){
            return this.resourceAPIVersion != null;
    }

    public String getResourceName(){
            return this.resourceName;
    }

    public A withResourceName(String resourceName){
            this.resourceName=resourceName; return (A) this;
    }

    public Boolean hasResourceName(){
            return this.resourceName != null;
    }

    public A addToScopes(int index,String item){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            this.scopes.add(index, item);
            return (A)this;
    }

    public A setToScopes(int index,String item){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            this.scopes.set(index, item); return (A)this;
    }

    public A addToScopes(String... items){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            for (String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A addAllToScopes(Collection<String> items){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            for (String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A removeFromScopes(String... items){
            for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public A removeAllFromScopes(Collection<String> items){
            for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public List<String> getScopes(){
            return this.scopes;
    }

    public String getScope(int index){
            return this.scopes.get(index);
    }

    public String getFirstScope(){
            return this.scopes.get(0);
    }

    public String getLastScope(){
            return this.scopes.get(scopes.size() - 1);
    }

    public String getMatchingScope(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: scopes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withScopes(List<String> scopes){
            if (this.scopes != null) { _visitables.removeAll(this.scopes);}
            if (scopes != null) {this.scopes = new ArrayList<String>(); for (String item : scopes){this.addToScopes(item);}} else { this.scopes = new ArrayList<String>();} return (A) this;
    }

    public A withScopes(String... scopes){
            if (this.scopes != null) {this.scopes.clear();}
            if (scopes != null) {for (String item :scopes){ this.addToScopes(item);}} return (A) this;
    }

    public Boolean hasScopes(){
            return scopes != null && !scopes.isEmpty();
    }

    public String getUser(){
            return this.user;
    }

    public A withUser(String user){
            this.user=user; return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public String getVerb(){
            return this.verb;
    }

    public A withVerb(String verb){
            this.verb=verb; return (A) this;
    }

    public Boolean hasVerb(){
            return this.verb != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LocalSubjectAccessReviewFluentImpl that = (LocalSubjectAccessReviewFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (content != null ? !content.equals(that.content) :that.content != null) return false;
            if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
            if (isNonResourceURL != null ? !isNonResourceURL.equals(that.isNonResourceURL) :that.isNonResourceURL != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            if (resourceAPIGroup != null ? !resourceAPIGroup.equals(that.resourceAPIGroup) :that.resourceAPIGroup != null) return false;
            if (resourceAPIVersion != null ? !resourceAPIVersion.equals(that.resourceAPIVersion) :that.resourceAPIVersion != null) return false;
            if (resourceName != null ? !resourceName.equals(that.resourceName) :that.resourceName != null) return false;
            if (scopes != null ? !scopes.equals(that.scopes) :that.scopes != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            if (verb != null ? !verb.equals(that.verb) :that.verb != null) return false;
            return true;
    }


    public class ValidatingWebhookConfigurationContentNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<N>> implements LocalSubjectAccessReviewFluent.ValidatingWebhookConfigurationContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationContentNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationContentNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withValidatingWebhookConfigurationContent(builder.build());
    }
    public N endValidatingWebhookConfigurationContent(){
            return and();
    }

}
    public class StorageClassContentNestedImpl<N> extends StorageClassFluentImpl<LocalSubjectAccessReviewFluent.StorageClassContentNested<N>> implements LocalSubjectAccessReviewFluent.StorageClassContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassContentNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassContentNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withStorageClassContent(builder.build());
    }
    public N endStorageClassContent(){
            return and();
    }

}
    public class ClusterRoleBindingContentNestedImpl<N> extends ClusterRoleBindingFluentImpl<LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<N>> implements LocalSubjectAccessReviewFluent.ClusterRoleBindingContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingContentNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingContentNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withClusterRoleBindingContent(builder.build());
    }
    public N endClusterRoleBindingContent(){
            return and();
    }

}
    public class OpenshiftRoleBindingContentNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<N>> implements LocalSubjectAccessReviewFluent.OpenshiftRoleBindingContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingContentNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingContentNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOpenshiftRoleBindingContent(builder.build());
    }
    public N endOpenshiftRoleBindingContent(){
            return and();
    }

}
    public class PodDisruptionBudgetContentNestedImpl<N> extends PodDisruptionBudgetFluentImpl<LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<N>> implements LocalSubjectAccessReviewFluent.PodDisruptionBudgetContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetContentNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetContentNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPodDisruptionBudgetContent(builder.build());
    }
    public N endPodDisruptionBudgetContent(){
            return and();
    }

}
    public class NetworkPolicyContentNestedImpl<N> extends NetworkPolicyFluentImpl<LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<N>> implements LocalSubjectAccessReviewFluent.NetworkPolicyContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyContentNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyContentNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withNetworkPolicyContent(builder.build());
    }
    public N endNetworkPolicyContent(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingContentNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<N>> implements LocalSubjectAccessReviewFluent.OpenshiftClusterRoleBindingContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingContentNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingContentNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOpenshiftClusterRoleBindingContent(builder.build());
    }
    public N endOpenshiftClusterRoleBindingContent(){
            return and();
    }

}
    public class RouteContentNestedImpl<N> extends RouteFluentImpl<LocalSubjectAccessReviewFluent.RouteContentNested<N>> implements LocalSubjectAccessReviewFluent.RouteContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteContentNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteContentNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withRouteContent(builder.build());
    }
    public N endRouteContent(){
            return and();
    }

}
    public class NamespaceContentNestedImpl<N> extends NamespaceFluentImpl<LocalSubjectAccessReviewFluent.NamespaceContentNested<N>> implements LocalSubjectAccessReviewFluent.NamespaceContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceContentNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceContentNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withNamespaceContent(builder.build());
    }
    public N endNamespaceContent(){
            return and();
    }

}
    public class ServiceContentNestedImpl<N> extends ServiceFluentImpl<LocalSubjectAccessReviewFluent.ServiceContentNested<N>> implements LocalSubjectAccessReviewFluent.ServiceContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
    
            ServiceContentNestedImpl(Service item){
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceContentNestedImpl(){
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withServiceContent(builder.build());
    }
    public N endServiceContent(){
            return and();
    }

}
    public class ReplicationControllerContentNestedImpl<N> extends ReplicationControllerFluentImpl<LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<N>> implements LocalSubjectAccessReviewFluent.ReplicationControllerContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
    
            ReplicationControllerContentNestedImpl(ReplicationController item){
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerContentNestedImpl(){
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withReplicationControllerContent(builder.build());
    }
    public N endReplicationControllerContent(){
            return and();
    }

}
    public class SubjectAccessReviewContentNestedImpl<N> extends io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl<LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<N>> implements LocalSubjectAccessReviewFluent.SubjectAccessReviewContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder builder;
    
            SubjectAccessReviewContentNestedImpl(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewContentNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withSubjectAccessReviewContent(builder.build());
    }
    public N endSubjectAccessReviewContent(){
            return and();
    }

}
    public class MutatingWebhookConfigurationContentNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<N>> implements LocalSubjectAccessReviewFluent.MutatingWebhookConfigurationContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationContentNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationContentNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withMutatingWebhookConfigurationContent(builder.build());
    }
    public N endMutatingWebhookConfigurationContent(){
            return and();
    }

}
    public class HorizontalPodAutoscalerContentNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<N>> implements LocalSubjectAccessReviewFluent.HorizontalPodAutoscalerContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerContentNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerContentNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withHorizontalPodAutoscalerContent(builder.build());
    }
    public N endHorizontalPodAutoscalerContent(){
            return and();
    }

}
    public class ScaleContentNestedImpl<N> extends ScaleFluentImpl<LocalSubjectAccessReviewFluent.ScaleContentNested<N>> implements LocalSubjectAccessReviewFluent.ScaleContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleContentNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleContentNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withScaleContent(builder.build());
    }
    public N endScaleContent(){
            return and();
    }

}
    public class ImageContentNestedImpl<N> extends ImageFluentImpl<LocalSubjectAccessReviewFluent.ImageContentNested<N>> implements LocalSubjectAccessReviewFluent.ImageContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageContentNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageContentNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withImageContent(builder.build());
    }
    public N endImageContent(){
            return and();
    }

}
    public class ReplicaSetContentNestedImpl<N> extends ReplicaSetFluentImpl<LocalSubjectAccessReviewFluent.ReplicaSetContentNested<N>> implements LocalSubjectAccessReviewFluent.ReplicaSetContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetContentNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetContentNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withReplicaSetContent(builder.build());
    }
    public N endReplicaSetContent(){
            return and();
    }

}
    public class PodSecurityPolicyContentNestedImpl<N> extends PodSecurityPolicyFluentImpl<LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<N>> implements LocalSubjectAccessReviewFluent.PodSecurityPolicyContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyContentNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyContentNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPodSecurityPolicyContent(builder.build());
    }
    public N endPodSecurityPolicyContent(){
            return and();
    }

}
    public class CronJobContentNestedImpl<N> extends CronJobFluentImpl<LocalSubjectAccessReviewFluent.CronJobContentNested<N>> implements LocalSubjectAccessReviewFluent.CronJobContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobContentNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobContentNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withCronJobContent(builder.build());
    }
    public N endCronJobContent(){
            return and();
    }

}
    public class EndpointsContentNestedImpl<N> extends EndpointsFluentImpl<LocalSubjectAccessReviewFluent.EndpointsContentNested<N>> implements LocalSubjectAccessReviewFluent.EndpointsContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsContentNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsContentNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withEndpointsContent(builder.build());
    }
    public N endEndpointsContent(){
            return and();
    }

}
    public class PodContentNestedImpl<N> extends PodFluentImpl<LocalSubjectAccessReviewFluent.PodContentNested<N>> implements LocalSubjectAccessReviewFluent.PodContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
    
            PodContentNestedImpl(Pod item){
                    this.builder = new PodBuilder(this, item);
            }
            PodContentNestedImpl(){
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPodContent(builder.build());
    }
    public N endPodContent(){
            return and();
    }

}
    public class ConfigMapContentNestedImpl<N> extends ConfigMapFluentImpl<LocalSubjectAccessReviewFluent.ConfigMapContentNested<N>> implements LocalSubjectAccessReviewFluent.ConfigMapContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapContentNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapContentNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withConfigMapContent(builder.build());
    }
    public N endConfigMapContent(){
            return and();
    }

}
    public class CustomResourceDefinitionContentNestedImpl<N> extends CustomResourceDefinitionFluentImpl<LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<N>> implements LocalSubjectAccessReviewFluent.CustomResourceDefinitionContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionContentNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionContentNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withCustomResourceDefinitionContent(builder.build());
    }
    public N endCustomResourceDefinitionContent(){
            return and();
    }

}
    public class BuildContentNestedImpl<N> extends BuildFluentImpl<LocalSubjectAccessReviewFluent.BuildContentNested<N>> implements LocalSubjectAccessReviewFluent.BuildContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
    
            BuildContentNestedImpl(Build item){
                    this.builder = new BuildBuilder(this, item);
            }
            BuildContentNestedImpl(){
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withBuildContent(builder.build());
    }
    public N endBuildContent(){
            return and();
    }

}
    public class ImageStreamTagContentNestedImpl<N> extends ImageStreamTagFluentImpl<LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<N>> implements LocalSubjectAccessReviewFluent.ImageStreamTagContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
    
            ImageStreamTagContentNestedImpl(ImageStreamTag item){
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagContentNestedImpl(){
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withImageStreamTagContent(builder.build());
    }
    public N endImageStreamTagContent(){
            return and();
    }

}
    public class GroupContentNestedImpl<N> extends GroupFluentImpl<LocalSubjectAccessReviewFluent.GroupContentNested<N>> implements LocalSubjectAccessReviewFluent.GroupContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupContentNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupContentNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withGroupContent(builder.build());
    }
    public N endGroupContent(){
            return and();
    }

}
    public class ImageSignatureContentNestedImpl<N> extends ImageSignatureFluentImpl<LocalSubjectAccessReviewFluent.ImageSignatureContentNested<N>> implements LocalSubjectAccessReviewFluent.ImageSignatureContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
    
            ImageSignatureContentNestedImpl(ImageSignature item){
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureContentNestedImpl(){
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withImageSignatureContent(builder.build());
    }
    public N endImageSignatureContent(){
            return and();
    }

}
    public class ResourceQuotaContentNestedImpl<N> extends ResourceQuotaFluentImpl<LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<N>> implements LocalSubjectAccessReviewFluent.ResourceQuotaContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaContentNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaContentNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withResourceQuotaContent(builder.build());
    }
    public N endResourceQuotaContent(){
            return and();
    }

}
    public class BuildRequestContentNestedImpl<N> extends BuildRequestFluentImpl<LocalSubjectAccessReviewFluent.BuildRequestContentNested<N>> implements LocalSubjectAccessReviewFluent.BuildRequestContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestContentNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestContentNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withBuildRequestContent(builder.build());
    }
    public N endBuildRequestContent(){
            return and();
    }

}
    public class DaemonSetContentNestedImpl<N> extends DaemonSetFluentImpl<LocalSubjectAccessReviewFluent.DaemonSetContentNested<N>> implements LocalSubjectAccessReviewFluent.DaemonSetContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetContentNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetContentNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withDaemonSetContent(builder.build());
    }
    public N endDaemonSetContent(){
            return and();
    }

}
    public class ImageStreamContentNestedImpl<N> extends ImageStreamFluentImpl<LocalSubjectAccessReviewFluent.ImageStreamContentNested<N>> implements LocalSubjectAccessReviewFluent.ImageStreamContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImageStreamContentNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamContentNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withImageStreamContent(builder.build());
    }
    public N endImageStreamContent(){
            return and();
    }

}
    public class OpenshiftRoleContentNestedImpl<N> extends OpenshiftRoleFluentImpl<LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<N>> implements LocalSubjectAccessReviewFluent.OpenshiftRoleContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleContentNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleContentNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOpenshiftRoleContent(builder.build());
    }
    public N endOpenshiftRoleContent(){
            return and();
    }

}
    public class OAuthClientContentNestedImpl<N> extends OAuthClientFluentImpl<LocalSubjectAccessReviewFluent.OAuthClientContentNested<N>> implements LocalSubjectAccessReviewFluent.OAuthClientContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientContentNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientContentNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOAuthClientContent(builder.build());
    }
    public N endOAuthClientContent(){
            return and();
    }

}
    public class IdentityContentNestedImpl<N> extends IdentityFluentImpl<LocalSubjectAccessReviewFluent.IdentityContentNested<N>> implements LocalSubjectAccessReviewFluent.IdentityContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityContentNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityContentNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withIdentityContent(builder.build());
    }
    public N endIdentityContent(){
            return and();
    }

}
    public class LimitRangeContentNestedImpl<N> extends LimitRangeFluentImpl<LocalSubjectAccessReviewFluent.LimitRangeContentNested<N>> implements LocalSubjectAccessReviewFluent.LimitRangeContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
    
            LimitRangeContentNestedImpl(LimitRange item){
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeContentNestedImpl(){
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withLimitRangeContent(builder.build());
    }
    public N endLimitRangeContent(){
            return and();
    }

}
    public class ImageStreamImportContentNestedImpl<N> extends ImageStreamImportFluentImpl<LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<N>> implements LocalSubjectAccessReviewFluent.ImageStreamImportContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportContentNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportContentNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withImageStreamImportContent(builder.build());
    }
    public N endImageStreamImportContent(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionContentNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<N>> implements LocalSubjectAccessReviewFluent.OpenshiftRoleBindingRestrictionContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionContentNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionContentNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOpenshiftRoleBindingRestrictionContent(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionContent(){
            return and();
    }

}
    public class RoleBindingContentNestedImpl<N> extends RoleBindingFluentImpl<LocalSubjectAccessReviewFluent.RoleBindingContentNested<N>> implements LocalSubjectAccessReviewFluent.RoleBindingContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingContentNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingContentNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withRoleBindingContent(builder.build());
    }
    public N endRoleBindingContent(){
            return and();
    }

}
    public class PodPresetContentNestedImpl<N> extends PodPresetFluentImpl<LocalSubjectAccessReviewFluent.PodPresetContentNested<N>> implements LocalSubjectAccessReviewFluent.PodPresetContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetContentNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetContentNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPodPresetContent(builder.build());
    }
    public N endPodPresetContent(){
            return and();
    }

}
    public class ProjectContentNestedImpl<N> extends ProjectFluentImpl<LocalSubjectAccessReviewFluent.ProjectContentNested<N>> implements LocalSubjectAccessReviewFluent.ProjectContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectContentNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectContentNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withProjectContent(builder.build());
    }
    public N endProjectContent(){
            return and();
    }

}
    public class BuildConfigContentNestedImpl<N> extends BuildConfigFluentImpl<LocalSubjectAccessReviewFluent.BuildConfigContentNested<N>> implements LocalSubjectAccessReviewFluent.BuildConfigContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
    
            BuildConfigContentNestedImpl(BuildConfig item){
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigContentNestedImpl(){
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withBuildConfigContent(builder.build());
    }
    public N endBuildConfigContent(){
            return and();
    }

}
    public class ClusterRoleContentNestedImpl<N> extends ClusterRoleFluentImpl<LocalSubjectAccessReviewFluent.ClusterRoleContentNested<N>> implements LocalSubjectAccessReviewFluent.ClusterRoleContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleContentNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleContentNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withClusterRoleContent(builder.build());
    }
    public N endClusterRoleContent(){
            return and();
    }

}
    public class OAuthAuthorizeTokenContentNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<N>> implements LocalSubjectAccessReviewFluent.OAuthAuthorizeTokenContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenContentNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenContentNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOAuthAuthorizeTokenContent(builder.build());
    }
    public N endOAuthAuthorizeTokenContent(){
            return and();
    }

}
    public class ProjectRequestContentNestedImpl<N> extends ProjectRequestFluentImpl<LocalSubjectAccessReviewFluent.ProjectRequestContentNested<N>> implements LocalSubjectAccessReviewFluent.ProjectRequestContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestContentNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestContentNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withProjectRequestContent(builder.build());
    }
    public N endProjectRequestContent(){
            return and();
    }

}
    public class PriorityClassContentNestedImpl<N> extends PriorityClassFluentImpl<LocalSubjectAccessReviewFluent.PriorityClassContentNested<N>> implements LocalSubjectAccessReviewFluent.PriorityClassContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassContentNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassContentNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPriorityClassContent(builder.build());
    }
    public N endPriorityClassContent(){
            return and();
    }

}
    public class TemplateContentNestedImpl<N> extends TemplateFluentImpl<LocalSubjectAccessReviewFluent.TemplateContentNested<N>> implements LocalSubjectAccessReviewFluent.TemplateContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateContentNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateContentNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withTemplateContent(builder.build());
    }
    public N endTemplateContent(){
            return and();
    }

}
    public class OAuthClientAuthorizationContentNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<N>> implements LocalSubjectAccessReviewFluent.OAuthClientAuthorizationContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationContentNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationContentNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOAuthClientAuthorizationContent(builder.build());
    }
    public N endOAuthClientAuthorizationContent(){
            return and();
    }

}
    public class DeploymentContentNestedImpl<N> extends DeploymentFluentImpl<LocalSubjectAccessReviewFluent.DeploymentContentNested<N>> implements LocalSubjectAccessReviewFluent.DeploymentContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentContentNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentContentNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withDeploymentContent(builder.build());
    }
    public N endDeploymentContent(){
            return and();
    }

}
    public class PodTemplateContentNestedImpl<N> extends PodTemplateFluentImpl<LocalSubjectAccessReviewFluent.PodTemplateContentNested<N>> implements LocalSubjectAccessReviewFluent.PodTemplateContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
    
            PodTemplateContentNestedImpl(PodTemplate item){
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateContentNestedImpl(){
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPodTemplateContent(builder.build());
    }
    public N endPodTemplateContent(){
            return and();
    }

}
    public class EventContentNestedImpl<N> extends EventFluentImpl<LocalSubjectAccessReviewFluent.EventContentNested<N>> implements LocalSubjectAccessReviewFluent.EventContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
    
            EventContentNestedImpl(Event item){
                    this.builder = new EventBuilder(this, item);
            }
            EventContentNestedImpl(){
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withEventContent(builder.build());
    }
    public N endEventContent(){
            return and();
    }

}
    public class IngressContentNestedImpl<N> extends IngressFluentImpl<LocalSubjectAccessReviewFluent.IngressContentNested<N>> implements LocalSubjectAccessReviewFluent.IngressContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressContentNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressContentNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withIngressContent(builder.build());
    }
    public N endIngressContent(){
            return and();
    }

}
    public class DeploymentConfigContentNestedImpl<N> extends DeploymentConfigFluentImpl<LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<N>> implements LocalSubjectAccessReviewFluent.DeploymentConfigContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigContentNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigContentNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withDeploymentConfigContent(builder.build());
    }
    public N endDeploymentConfigContent(){
            return and();
    }

}
    public class OAuthAccessTokenContentNestedImpl<N> extends OAuthAccessTokenFluentImpl<LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<N>> implements LocalSubjectAccessReviewFluent.OAuthAccessTokenContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenContentNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenContentNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOAuthAccessTokenContent(builder.build());
    }
    public N endOAuthAccessTokenContent(){
            return and();
    }

}
    public class PersistentVolumeContentNestedImpl<N> extends PersistentVolumeFluentImpl<LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<N>> implements LocalSubjectAccessReviewFluent.PersistentVolumeContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeContentNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeContentNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPersistentVolumeContent(builder.build());
    }
    public N endPersistentVolumeContent(){
            return and();
    }

}
    public class PersistentVolumeClaimContentNestedImpl<N> extends PersistentVolumeClaimFluentImpl<LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<N>> implements LocalSubjectAccessReviewFluent.PersistentVolumeClaimContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimContentNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimContentNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withPersistentVolumeClaimContent(builder.build());
    }
    public N endPersistentVolumeClaimContent(){
            return and();
    }

}
    public class EventsEventContentNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<LocalSubjectAccessReviewFluent.EventsEventContentNested<N>> implements LocalSubjectAccessReviewFluent.EventsEventContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventContentNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventContentNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withEventContent(builder.build());
    }
    public N endEventsEventContent(){
            return and();
    }

}
    public class StatefulSetContentNestedImpl<N> extends StatefulSetFluentImpl<LocalSubjectAccessReviewFluent.StatefulSetContentNested<N>> implements LocalSubjectAccessReviewFluent.StatefulSetContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetContentNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetContentNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withStatefulSetContent(builder.build());
    }
    public N endStatefulSetContent(){
            return and();
    }

}
    public class OpenshiftClusterRoleContentNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<N>> implements LocalSubjectAccessReviewFluent.OpenshiftClusterRoleContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleContentNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleContentNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withOpenshiftClusterRoleContent(builder.build());
    }
    public N endOpenshiftClusterRoleContent(){
            return and();
    }

}
    public class RoleContentNestedImpl<N> extends RoleFluentImpl<LocalSubjectAccessReviewFluent.RoleContentNested<N>> implements LocalSubjectAccessReviewFluent.RoleContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleContentNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleContentNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withRoleContent(builder.build());
    }
    public N endRoleContent(){
            return and();
    }

}
    public class UserContentNestedImpl<N> extends UserFluentImpl<LocalSubjectAccessReviewFluent.UserContentNested<N>> implements LocalSubjectAccessReviewFluent.UserContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserContentNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserContentNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withUserContent(builder.build());
    }
    public N endUserContent(){
            return and();
    }

}
    public class ComponentStatusContentNestedImpl<N> extends ComponentStatusFluentImpl<LocalSubjectAccessReviewFluent.ComponentStatusContentNested<N>> implements LocalSubjectAccessReviewFluent.ComponentStatusContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
    
            ComponentStatusContentNestedImpl(ComponentStatus item){
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusContentNestedImpl(){
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withComponentStatusContent(builder.build());
    }
    public N endComponentStatusContent(){
            return and();
    }

}
    public class TokenReviewContentNestedImpl<N> extends TokenReviewFluentImpl<LocalSubjectAccessReviewFluent.TokenReviewContentNested<N>> implements LocalSubjectAccessReviewFluent.TokenReviewContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewContentNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewContentNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withTokenReviewContent(builder.build());
    }
    public N endTokenReviewContent(){
            return and();
    }

}
    public class BindingContentNestedImpl<N> extends BindingFluentImpl<LocalSubjectAccessReviewFluent.BindingContentNested<N>> implements LocalSubjectAccessReviewFluent.BindingContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingContentNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingContentNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withBindingContent(builder.build());
    }
    public N endBindingContent(){
            return and();
    }

}
    public class SecretContentNestedImpl<N> extends SecretFluentImpl<LocalSubjectAccessReviewFluent.SecretContentNested<N>> implements LocalSubjectAccessReviewFluent.SecretContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretContentNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretContentNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withSecretContent(builder.build());
    }
    public N endSecretContent(){
            return and();
    }

}
    public class SecurityContextConstraintsContentNestedImpl<N> extends SecurityContextConstraintsFluentImpl<LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<N>> implements LocalSubjectAccessReviewFluent.SecurityContextConstraintsContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsContentNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsContentNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withSecurityContextConstraintsContent(builder.build());
    }
    public N endSecurityContextConstraintsContent(){
            return and();
    }

}
    public class NetNamespaceContentNestedImpl<N> extends NetNamespaceFluentImpl<LocalSubjectAccessReviewFluent.NetNamespaceContentNested<N>> implements LocalSubjectAccessReviewFluent.NetNamespaceContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNamespaceContentNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceContentNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withNetNamespaceContent(builder.build());
    }
    public N endNetNamespaceContent(){
            return and();
    }

}
    public class NodeContentNestedImpl<N> extends NodeFluentImpl<LocalSubjectAccessReviewFluent.NodeContentNested<N>> implements LocalSubjectAccessReviewFluent.NodeContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeContentNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeContentNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withNodeContent(builder.build());
    }
    public N endNodeContent(){
            return and();
    }

}
    public class JobContentNestedImpl<N> extends JobFluentImpl<LocalSubjectAccessReviewFluent.JobContentNested<N>> implements LocalSubjectAccessReviewFluent.JobContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobContentNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobContentNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withJobContent(builder.build());
    }
    public N endJobContent(){
            return and();
    }

}
    public class CertificateSigningRequestContentNestedImpl<N> extends CertificateSigningRequestFluentImpl<LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<N>> implements LocalSubjectAccessReviewFluent.CertificateSigningRequestContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestContentNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestContentNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withCertificateSigningRequestContent(builder.build());
    }
    public N endCertificateSigningRequestContent(){
            return and();
    }

}
    public class ServiceAccountContentNestedImpl<N> extends ServiceAccountFluentImpl<LocalSubjectAccessReviewFluent.ServiceAccountContentNested<N>> implements LocalSubjectAccessReviewFluent.ServiceAccountContentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountContentNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountContentNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) LocalSubjectAccessReviewFluentImpl.this.withServiceAccountContent(builder.build());
    }
    public N endServiceAccountContent(){
            return and();
    }

}


}
