package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.Node;
import com.fasterxml.jackson.annotation.JsonInclude;
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
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl;
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

public class PolicyRuleFluentImpl<A extends io.fabric8.openshift.api.model.PolicyRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.openshift.api.model.PolicyRuleFluent<A>{

    private List<String> apiGroups;
    private VisitableBuilder<? extends HasMetadata,?> attributeRestrictions;
    private List<String> nonResourceURLs;
    private List<String> resourceNames;
    private List<String> resources;
    private List<String> verbs;

    public PolicyRuleFluentImpl(){
    }
    public PolicyRuleFluentImpl(io.fabric8.openshift.api.model.PolicyRule instance){
            this.withApiGroups(instance.getApiGroups()); 
            this.withAttributeRestrictions(instance.getAttributeRestrictions()); 
            this.withNonResourceURLs(instance.getNonResourceURLs()); 
            this.withResourceNames(instance.getResourceNames()); 
            this.withResources(instance.getResources()); 
            this.withVerbs(instance.getVerbs()); 
    }

    public A addToApiGroups(int index,String item){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            this.apiGroups.add(index, item);
            return (A)this;
    }

    public A setToApiGroups(int index,String item){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            this.apiGroups.set(index, item); return (A)this;
    }

    public A addToApiGroups(String... items){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            for (String item : items) {this.apiGroups.add(item);} return (A)this;
    }

    public A addAllToApiGroups(Collection<String> items){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            for (String item : items) {this.apiGroups.add(item);} return (A)this;
    }

    public A removeFromApiGroups(String... items){
            for (String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
    }

    public A removeAllFromApiGroups(Collection<String> items){
            for (String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
    }

    public List<String> getApiGroups(){
            return this.apiGroups;
    }

    public String getApiGroup(int index){
            return this.apiGroups.get(index);
    }

    public String getFirstApiGroup(){
            return this.apiGroups.get(0);
    }

    public String getLastApiGroup(){
            return this.apiGroups.get(apiGroups.size() - 1);
    }

    public String getMatchingApiGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: apiGroups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withApiGroups(List<String> apiGroups){
            if (this.apiGroups != null) { _visitables.removeAll(this.apiGroups);}
            if (apiGroups != null) {this.apiGroups = new ArrayList<String>(); for (String item : apiGroups){this.addToApiGroups(item);}} else { this.apiGroups = new ArrayList<String>();} return (A) this;
    }

    public A withApiGroups(String... apiGroups){
            if (this.apiGroups != null) {this.apiGroups.clear();}
            if (apiGroups != null) {for (String item :apiGroups){ this.addToApiGroups(item);}} return (A) this;
    }

    public Boolean hasApiGroups(){
            return apiGroups != null && !apiGroups.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildAttributeRestrictions instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getAttributeRestrictions(){
            return this.attributeRestrictions!=null?this.attributeRestrictions.build():null;
    }

    public HasMetadata buildAttributeRestrictions(){
            return this.attributeRestrictions!=null?this.attributeRestrictions.build():null;
    }

    public A withAttributeRestrictions(HasMetadata attributeRestrictions){
            if (attributeRestrictions instanceof ValidatingWebhookConfiguration){ this.attributeRestrictions= new ValidatingWebhookConfigurationBuilder((ValidatingWebhookConfiguration)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof StorageClass){ this.attributeRestrictions= new StorageClassBuilder((StorageClass)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ClusterRoleBinding){ this.attributeRestrictions= new ClusterRoleBindingBuilder((ClusterRoleBinding)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OpenshiftRoleBinding){ this.attributeRestrictions= new OpenshiftRoleBindingBuilder((OpenshiftRoleBinding)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PodDisruptionBudget){ this.attributeRestrictions= new PodDisruptionBudgetBuilder((PodDisruptionBudget)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof NetworkPolicy){ this.attributeRestrictions= new NetworkPolicyBuilder((NetworkPolicy)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OpenshiftClusterRoleBinding){ this.attributeRestrictions= new OpenshiftClusterRoleBindingBuilder((OpenshiftClusterRoleBinding)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Route){ this.attributeRestrictions= new RouteBuilder((Route)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Namespace){ this.attributeRestrictions= new NamespaceBuilder((Namespace)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof LocalSubjectAccessReview){ this.attributeRestrictions= new LocalSubjectAccessReviewBuilder((LocalSubjectAccessReview)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Service){ this.attributeRestrictions= new ServiceBuilder((Service)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ReplicationController){ this.attributeRestrictions= new ReplicationControllerBuilder((ReplicationController)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof SubjectAccessReview){ this.attributeRestrictions= new SubjectAccessReviewBuilder((SubjectAccessReview)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof MutatingWebhookConfiguration){ this.attributeRestrictions= new MutatingWebhookConfigurationBuilder((MutatingWebhookConfiguration)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof HorizontalPodAutoscaler){ this.attributeRestrictions= new HorizontalPodAutoscalerBuilder((HorizontalPodAutoscaler)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Scale){ this.attributeRestrictions= new ScaleBuilder((Scale)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Image){ this.attributeRestrictions= new ImageBuilder((Image)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ReplicaSet){ this.attributeRestrictions= new ReplicaSetBuilder((ReplicaSet)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PodSecurityPolicy){ this.attributeRestrictions= new PodSecurityPolicyBuilder((PodSecurityPolicy)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof CronJob){ this.attributeRestrictions= new CronJobBuilder((CronJob)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Endpoints){ this.attributeRestrictions= new EndpointsBuilder((Endpoints)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Pod){ this.attributeRestrictions= new PodBuilder((Pod)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ConfigMap){ this.attributeRestrictions= new ConfigMapBuilder((ConfigMap)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof CustomResourceDefinition){ this.attributeRestrictions= new CustomResourceDefinitionBuilder((CustomResourceDefinition)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Build){ this.attributeRestrictions= new BuildBuilder((Build)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ImageStreamTag){ this.attributeRestrictions= new ImageStreamTagBuilder((ImageStreamTag)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Group){ this.attributeRestrictions= new GroupBuilder((Group)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ImageSignature){ this.attributeRestrictions= new ImageSignatureBuilder((ImageSignature)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ResourceQuota){ this.attributeRestrictions= new ResourceQuotaBuilder((ResourceQuota)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof BuildRequest){ this.attributeRestrictions= new BuildRequestBuilder((BuildRequest)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof DaemonSet){ this.attributeRestrictions= new DaemonSetBuilder((DaemonSet)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ImageStream){ this.attributeRestrictions= new ImageStreamBuilder((ImageStream)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OpenshiftRole){ this.attributeRestrictions= new OpenshiftRoleBuilder((OpenshiftRole)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OAuthClient){ this.attributeRestrictions= new OAuthClientBuilder((OAuthClient)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Identity){ this.attributeRestrictions= new IdentityBuilder((Identity)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof LimitRange){ this.attributeRestrictions= new LimitRangeBuilder((LimitRange)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ImageStreamImport){ this.attributeRestrictions= new ImageStreamImportBuilder((ImageStreamImport)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OpenshiftRoleBindingRestriction){ this.attributeRestrictions= new OpenshiftRoleBindingRestrictionBuilder((OpenshiftRoleBindingRestriction)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof RoleBinding){ this.attributeRestrictions= new RoleBindingBuilder((RoleBinding)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PodPreset){ this.attributeRestrictions= new PodPresetBuilder((PodPreset)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Project){ this.attributeRestrictions= new ProjectBuilder((Project)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof BuildConfig){ this.attributeRestrictions= new BuildConfigBuilder((BuildConfig)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ClusterRole){ this.attributeRestrictions= new ClusterRoleBuilder((ClusterRole)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OAuthAuthorizeToken){ this.attributeRestrictions= new OAuthAuthorizeTokenBuilder((OAuthAuthorizeToken)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ProjectRequest){ this.attributeRestrictions= new ProjectRequestBuilder((ProjectRequest)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PriorityClass){ this.attributeRestrictions= new PriorityClassBuilder((PriorityClass)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Template){ this.attributeRestrictions= new TemplateBuilder((Template)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OAuthClientAuthorization){ this.attributeRestrictions= new OAuthClientAuthorizationBuilder((OAuthClientAuthorization)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Deployment){ this.attributeRestrictions= new DeploymentBuilder((Deployment)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PodTemplate){ this.attributeRestrictions= new PodTemplateBuilder((PodTemplate)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Event){ this.attributeRestrictions= new EventBuilder((Event)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Ingress){ this.attributeRestrictions= new IngressBuilder((Ingress)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof DeploymentConfig){ this.attributeRestrictions= new DeploymentConfigBuilder((DeploymentConfig)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OAuthAccessToken){ this.attributeRestrictions= new OAuthAccessTokenBuilder((OAuthAccessToken)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PersistentVolume){ this.attributeRestrictions= new PersistentVolumeBuilder((PersistentVolume)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof PersistentVolumeClaim){ this.attributeRestrictions= new PersistentVolumeClaimBuilder((PersistentVolumeClaim)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof io.fabric8.kubernetes.api.model.events.Event){ this.attributeRestrictions= new io.fabric8.kubernetes.api.model.events.EventBuilder((io.fabric8.kubernetes.api.model.events.Event)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof StatefulSet){ this.attributeRestrictions= new StatefulSetBuilder((StatefulSet)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof OpenshiftClusterRole){ this.attributeRestrictions= new OpenshiftClusterRoleBuilder((OpenshiftClusterRole)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Role){ this.attributeRestrictions= new RoleBuilder((Role)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof User){ this.attributeRestrictions= new UserBuilder((User)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ComponentStatus){ this.attributeRestrictions= new ComponentStatusBuilder((ComponentStatus)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof TokenReview){ this.attributeRestrictions= new TokenReviewBuilder((TokenReview)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Binding){ this.attributeRestrictions= new BindingBuilder((Binding)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Secret){ this.attributeRestrictions= new SecretBuilder((Secret)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof SecurityContextConstraints){ this.attributeRestrictions= new SecurityContextConstraintsBuilder((SecurityContextConstraints)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof NetNamespace){ this.attributeRestrictions= new NetNamespaceBuilder((NetNamespace)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Node){ this.attributeRestrictions= new NodeBuilder((Node)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof Job){ this.attributeRestrictions= new JobBuilder((Job)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof CertificateSigningRequest){ this.attributeRestrictions= new CertificateSigningRequestBuilder((CertificateSigningRequest)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            if (attributeRestrictions instanceof ServiceAccount){ this.attributeRestrictions= new ServiceAccountBuilder((ServiceAccount)attributeRestrictions); _visitables.add(this.attributeRestrictions);}
            return (A) this;
    }

    public Boolean hasAttributeRestrictions(){
            return this.attributeRestrictions != null;
    }

    public A withValidatingWebhookConfigurationAttributeRestrictions(ValidatingWebhookConfiguration validatingWebhookConfigurationAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (validatingWebhookConfigurationAttributeRestrictions!=null){ this.attributeRestrictions= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfigurationAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<A> withNewValidatingWebhookConfigurationAttributeRestrictions(){
            return new ValidatingWebhookConfigurationAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<A> withNewValidatingWebhookConfigurationAttributeRestrictionsLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationAttributeRestrictionsNestedImpl(item);
    }

    public A withStorageClassAttributeRestrictions(StorageClass storageClassAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (storageClassAttributeRestrictions!=null){ this.attributeRestrictions= new StorageClassBuilder(storageClassAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.StorageClassAttributeRestrictionsNested<A> withNewStorageClassAttributeRestrictions(){
            return new StorageClassAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.StorageClassAttributeRestrictionsNested<A> withNewStorageClassAttributeRestrictionsLike(StorageClass item){
            return new StorageClassAttributeRestrictionsNestedImpl(item);
    }

    public A withClusterRoleBindingAttributeRestrictions(ClusterRoleBinding clusterRoleBindingAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (clusterRoleBindingAttributeRestrictions!=null){ this.attributeRestrictions= new ClusterRoleBindingBuilder(clusterRoleBindingAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<A> withNewClusterRoleBindingAttributeRestrictions(){
            return new ClusterRoleBindingAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<A> withNewClusterRoleBindingAttributeRestrictionsLike(ClusterRoleBinding item){
            return new ClusterRoleBindingAttributeRestrictionsNestedImpl(item);
    }

    public A withOpenshiftRoleBindingAttributeRestrictions(OpenshiftRoleBinding openshiftRoleBindingAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (openshiftRoleBindingAttributeRestrictions!=null){ this.attributeRestrictions= new OpenshiftRoleBindingBuilder(openshiftRoleBindingAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingAttributeRestrictions(){
            return new OpenshiftRoleBindingAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingAttributeRestrictionsLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingAttributeRestrictionsNestedImpl(item);
    }

    public A withPodDisruptionBudgetAttributeRestrictions(PodDisruptionBudget podDisruptionBudgetAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (podDisruptionBudgetAttributeRestrictions!=null){ this.attributeRestrictions= new PodDisruptionBudgetBuilder(podDisruptionBudgetAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<A> withNewPodDisruptionBudgetAttributeRestrictions(){
            return new PodDisruptionBudgetAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<A> withNewPodDisruptionBudgetAttributeRestrictionsLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetAttributeRestrictionsNestedImpl(item);
    }

    public A withNetworkPolicyAttributeRestrictions(NetworkPolicy networkPolicyAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (networkPolicyAttributeRestrictions!=null){ this.attributeRestrictions= new NetworkPolicyBuilder(networkPolicyAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<A> withNewNetworkPolicyAttributeRestrictions(){
            return new NetworkPolicyAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<A> withNewNetworkPolicyAttributeRestrictionsLike(NetworkPolicy item){
            return new NetworkPolicyAttributeRestrictionsNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingAttributeRestrictions(OpenshiftClusterRoleBinding openshiftClusterRoleBindingAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (openshiftClusterRoleBindingAttributeRestrictions!=null){ this.attributeRestrictions= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBindingAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleBindingAttributeRestrictions(){
            return new OpenshiftClusterRoleBindingAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleBindingAttributeRestrictionsLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingAttributeRestrictionsNestedImpl(item);
    }

    public A withRouteAttributeRestrictions(Route routeAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (routeAttributeRestrictions!=null){ this.attributeRestrictions= new RouteBuilder(routeAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.RouteAttributeRestrictionsNested<A> withNewRouteAttributeRestrictions(){
            return new RouteAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.RouteAttributeRestrictionsNested<A> withNewRouteAttributeRestrictionsLike(Route item){
            return new RouteAttributeRestrictionsNestedImpl(item);
    }

    public A withNamespaceAttributeRestrictions(Namespace namespaceAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (namespaceAttributeRestrictions!=null){ this.attributeRestrictions= new NamespaceBuilder(namespaceAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.NamespaceAttributeRestrictionsNested<A> withNewNamespaceAttributeRestrictions(){
            return new NamespaceAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.NamespaceAttributeRestrictionsNested<A> withNewNamespaceAttributeRestrictionsLike(Namespace item){
            return new NamespaceAttributeRestrictionsNestedImpl(item);
    }

    public A withLocalSubjectAccessReviewAttributeRestrictions(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview localSubjectAccessReviewAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (localSubjectAccessReviewAttributeRestrictions!=null){ this.attributeRestrictions= new LocalSubjectAccessReviewBuilder(localSubjectAccessReviewAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<A> withNewLocalSubjectAccessReviewAttributeRestrictions(){
            return new LocalSubjectAccessReviewAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<A> withNewLocalSubjectAccessReviewAttributeRestrictionsLike(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewAttributeRestrictionsNestedImpl(item);
    }

    public A withServiceAttributeRestrictions(Service serviceAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (serviceAttributeRestrictions!=null){ this.attributeRestrictions= new ServiceBuilder(serviceAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ServiceAttributeRestrictionsNested<A> withNewServiceAttributeRestrictions(){
            return new ServiceAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ServiceAttributeRestrictionsNested<A> withNewServiceAttributeRestrictionsLike(Service item){
            return new ServiceAttributeRestrictionsNestedImpl(item);
    }

    public A withReplicationControllerAttributeRestrictions(ReplicationController replicationControllerAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (replicationControllerAttributeRestrictions!=null){ this.attributeRestrictions= new ReplicationControllerBuilder(replicationControllerAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<A> withNewReplicationControllerAttributeRestrictions(){
            return new ReplicationControllerAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<A> withNewReplicationControllerAttributeRestrictionsLike(ReplicationController item){
            return new ReplicationControllerAttributeRestrictionsNestedImpl(item);
    }

    public A withSubjectAccessReviewAttributeRestrictions(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview subjectAccessReviewAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (subjectAccessReviewAttributeRestrictions!=null){ this.attributeRestrictions= new SubjectAccessReviewBuilder(subjectAccessReviewAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<A> withNewSubjectAccessReviewAttributeRestrictions(){
            return new SubjectAccessReviewAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<A> withNewSubjectAccessReviewAttributeRestrictionsLike(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
            return new SubjectAccessReviewAttributeRestrictionsNestedImpl(item);
    }

    public A withMutatingWebhookConfigurationAttributeRestrictions(MutatingWebhookConfiguration mutatingWebhookConfigurationAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (mutatingWebhookConfigurationAttributeRestrictions!=null){ this.attributeRestrictions= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfigurationAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<A> withNewMutatingWebhookConfigurationAttributeRestrictions(){
            return new MutatingWebhookConfigurationAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<A> withNewMutatingWebhookConfigurationAttributeRestrictionsLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationAttributeRestrictionsNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerAttributeRestrictions(HorizontalPodAutoscaler horizontalPodAutoscalerAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (horizontalPodAutoscalerAttributeRestrictions!=null){ this.attributeRestrictions= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscalerAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<A> withNewHorizontalPodAutoscalerAttributeRestrictions(){
            return new HorizontalPodAutoscalerAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<A> withNewHorizontalPodAutoscalerAttributeRestrictionsLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerAttributeRestrictionsNestedImpl(item);
    }

    public A withScaleAttributeRestrictions(Scale scaleAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (scaleAttributeRestrictions!=null){ this.attributeRestrictions= new ScaleBuilder(scaleAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ScaleAttributeRestrictionsNested<A> withNewScaleAttributeRestrictions(){
            return new ScaleAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ScaleAttributeRestrictionsNested<A> withNewScaleAttributeRestrictionsLike(Scale item){
            return new ScaleAttributeRestrictionsNestedImpl(item);
    }

    public A withImageAttributeRestrictions(Image imageAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (imageAttributeRestrictions!=null){ this.attributeRestrictions= new ImageBuilder(imageAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ImageAttributeRestrictionsNested<A> withNewImageAttributeRestrictions(){
            return new ImageAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ImageAttributeRestrictionsNested<A> withNewImageAttributeRestrictionsLike(Image item){
            return new ImageAttributeRestrictionsNestedImpl(item);
    }

    public A withReplicaSetAttributeRestrictions(ReplicaSet replicaSetAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (replicaSetAttributeRestrictions!=null){ this.attributeRestrictions= new ReplicaSetBuilder(replicaSetAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<A> withNewReplicaSetAttributeRestrictions(){
            return new ReplicaSetAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<A> withNewReplicaSetAttributeRestrictionsLike(ReplicaSet item){
            return new ReplicaSetAttributeRestrictionsNestedImpl(item);
    }

    public A withPodSecurityPolicyAttributeRestrictions(PodSecurityPolicy podSecurityPolicyAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (podSecurityPolicyAttributeRestrictions!=null){ this.attributeRestrictions= new PodSecurityPolicyBuilder(podSecurityPolicyAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<A> withNewPodSecurityPolicyAttributeRestrictions(){
            return new PodSecurityPolicyAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<A> withNewPodSecurityPolicyAttributeRestrictionsLike(PodSecurityPolicy item){
            return new PodSecurityPolicyAttributeRestrictionsNestedImpl(item);
    }

    public A withCronJobAttributeRestrictions(CronJob cronJobAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (cronJobAttributeRestrictions!=null){ this.attributeRestrictions= new CronJobBuilder(cronJobAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.CronJobAttributeRestrictionsNested<A> withNewCronJobAttributeRestrictions(){
            return new CronJobAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.CronJobAttributeRestrictionsNested<A> withNewCronJobAttributeRestrictionsLike(CronJob item){
            return new CronJobAttributeRestrictionsNestedImpl(item);
    }

    public A withEndpointsAttributeRestrictions(Endpoints endpointsAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (endpointsAttributeRestrictions!=null){ this.attributeRestrictions= new EndpointsBuilder(endpointsAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.EndpointsAttributeRestrictionsNested<A> withNewEndpointsAttributeRestrictions(){
            return new EndpointsAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.EndpointsAttributeRestrictionsNested<A> withNewEndpointsAttributeRestrictionsLike(Endpoints item){
            return new EndpointsAttributeRestrictionsNestedImpl(item);
    }

    public A withPodAttributeRestrictions(Pod podAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (podAttributeRestrictions!=null){ this.attributeRestrictions= new PodBuilder(podAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PodAttributeRestrictionsNested<A> withNewPodAttributeRestrictions(){
            return new PodAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PodAttributeRestrictionsNested<A> withNewPodAttributeRestrictionsLike(Pod item){
            return new PodAttributeRestrictionsNestedImpl(item);
    }

    public A withConfigMapAttributeRestrictions(ConfigMap configMapAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (configMapAttributeRestrictions!=null){ this.attributeRestrictions= new ConfigMapBuilder(configMapAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<A> withNewConfigMapAttributeRestrictions(){
            return new ConfigMapAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<A> withNewConfigMapAttributeRestrictionsLike(ConfigMap item){
            return new ConfigMapAttributeRestrictionsNestedImpl(item);
    }

    public A withCustomResourceDefinitionAttributeRestrictions(CustomResourceDefinition customResourceDefinitionAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (customResourceDefinitionAttributeRestrictions!=null){ this.attributeRestrictions= new CustomResourceDefinitionBuilder(customResourceDefinitionAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<A> withNewCustomResourceDefinitionAttributeRestrictions(){
            return new CustomResourceDefinitionAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<A> withNewCustomResourceDefinitionAttributeRestrictionsLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionAttributeRestrictionsNestedImpl(item);
    }

    public A withBuildAttributeRestrictions(Build buildAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (buildAttributeRestrictions!=null){ this.attributeRestrictions= new BuildBuilder(buildAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.BuildAttributeRestrictionsNested<A> withNewBuildAttributeRestrictions(){
            return new BuildAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.BuildAttributeRestrictionsNested<A> withNewBuildAttributeRestrictionsLike(Build item){
            return new BuildAttributeRestrictionsNestedImpl(item);
    }

    public A withImageStreamTagAttributeRestrictions(ImageStreamTag imageStreamTagAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (imageStreamTagAttributeRestrictions!=null){ this.attributeRestrictions= new ImageStreamTagBuilder(imageStreamTagAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<A> withNewImageStreamTagAttributeRestrictions(){
            return new ImageStreamTagAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<A> withNewImageStreamTagAttributeRestrictionsLike(ImageStreamTag item){
            return new ImageStreamTagAttributeRestrictionsNestedImpl(item);
    }

    public A withGroupAttributeRestrictions(Group groupAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (groupAttributeRestrictions!=null){ this.attributeRestrictions= new GroupBuilder(groupAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.GroupAttributeRestrictionsNested<A> withNewGroupAttributeRestrictions(){
            return new GroupAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.GroupAttributeRestrictionsNested<A> withNewGroupAttributeRestrictionsLike(Group item){
            return new GroupAttributeRestrictionsNestedImpl(item);
    }

    public A withImageSignatureAttributeRestrictions(ImageSignature imageSignatureAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (imageSignatureAttributeRestrictions!=null){ this.attributeRestrictions= new ImageSignatureBuilder(imageSignatureAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<A> withNewImageSignatureAttributeRestrictions(){
            return new ImageSignatureAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<A> withNewImageSignatureAttributeRestrictionsLike(ImageSignature item){
            return new ImageSignatureAttributeRestrictionsNestedImpl(item);
    }

    public A withResourceQuotaAttributeRestrictions(ResourceQuota resourceQuotaAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (resourceQuotaAttributeRestrictions!=null){ this.attributeRestrictions= new ResourceQuotaBuilder(resourceQuotaAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<A> withNewResourceQuotaAttributeRestrictions(){
            return new ResourceQuotaAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<A> withNewResourceQuotaAttributeRestrictionsLike(ResourceQuota item){
            return new ResourceQuotaAttributeRestrictionsNestedImpl(item);
    }

    public A withBuildRequestAttributeRestrictions(BuildRequest buildRequestAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (buildRequestAttributeRestrictions!=null){ this.attributeRestrictions= new BuildRequestBuilder(buildRequestAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<A> withNewBuildRequestAttributeRestrictions(){
            return new BuildRequestAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<A> withNewBuildRequestAttributeRestrictionsLike(BuildRequest item){
            return new BuildRequestAttributeRestrictionsNestedImpl(item);
    }

    public A withDaemonSetAttributeRestrictions(DaemonSet daemonSetAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (daemonSetAttributeRestrictions!=null){ this.attributeRestrictions= new DaemonSetBuilder(daemonSetAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<A> withNewDaemonSetAttributeRestrictions(){
            return new DaemonSetAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<A> withNewDaemonSetAttributeRestrictionsLike(DaemonSet item){
            return new DaemonSetAttributeRestrictionsNestedImpl(item);
    }

    public A withImageStreamAttributeRestrictions(ImageStream imageStreamAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (imageStreamAttributeRestrictions!=null){ this.attributeRestrictions= new ImageStreamBuilder(imageStreamAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<A> withNewImageStreamAttributeRestrictions(){
            return new ImageStreamAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<A> withNewImageStreamAttributeRestrictionsLike(ImageStream item){
            return new ImageStreamAttributeRestrictionsNestedImpl(item);
    }

    public A withOpenshiftRoleAttributeRestrictions(OpenshiftRole openshiftRoleAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (openshiftRoleAttributeRestrictions!=null){ this.attributeRestrictions= new OpenshiftRoleBuilder(openshiftRoleAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<A> withNewOpenshiftRoleAttributeRestrictions(){
            return new OpenshiftRoleAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<A> withNewOpenshiftRoleAttributeRestrictionsLike(OpenshiftRole item){
            return new OpenshiftRoleAttributeRestrictionsNestedImpl(item);
    }

    public A withOAuthClientAttributeRestrictions(OAuthClient oAuthClientAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (oAuthClientAttributeRestrictions!=null){ this.attributeRestrictions= new OAuthClientBuilder(oAuthClientAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<A> withNewOAuthClientAttributeRestrictions(){
            return new OAuthClientAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<A> withNewOAuthClientAttributeRestrictionsLike(OAuthClient item){
            return new OAuthClientAttributeRestrictionsNestedImpl(item);
    }

    public A withIdentityAttributeRestrictions(Identity identityAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (identityAttributeRestrictions!=null){ this.attributeRestrictions= new IdentityBuilder(identityAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.IdentityAttributeRestrictionsNested<A> withNewIdentityAttributeRestrictions(){
            return new IdentityAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.IdentityAttributeRestrictionsNested<A> withNewIdentityAttributeRestrictionsLike(Identity item){
            return new IdentityAttributeRestrictionsNestedImpl(item);
    }

    public A withLimitRangeAttributeRestrictions(LimitRange limitRangeAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (limitRangeAttributeRestrictions!=null){ this.attributeRestrictions= new LimitRangeBuilder(limitRangeAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<A> withNewLimitRangeAttributeRestrictions(){
            return new LimitRangeAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<A> withNewLimitRangeAttributeRestrictionsLike(LimitRange item){
            return new LimitRangeAttributeRestrictionsNestedImpl(item);
    }

    public A withImageStreamImportAttributeRestrictions(ImageStreamImport imageStreamImportAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (imageStreamImportAttributeRestrictions!=null){ this.attributeRestrictions= new ImageStreamImportBuilder(imageStreamImportAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<A> withNewImageStreamImportAttributeRestrictions(){
            return new ImageStreamImportAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<A> withNewImageStreamImportAttributeRestrictionsLike(ImageStreamImport item){
            return new ImageStreamImportAttributeRestrictionsNestedImpl(item);
    }

    public A withOpenshiftRoleBindingRestrictionAttributeRestrictions(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (openshiftRoleBindingRestrictionAttributeRestrictions!=null){ this.attributeRestrictions= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestrictionAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingRestrictionAttributeRestrictions(){
            return new OpenshiftRoleBindingRestrictionAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<A> withNewOpenshiftRoleBindingRestrictionAttributeRestrictionsLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionAttributeRestrictionsNestedImpl(item);
    }

    public A withRoleBindingAttributeRestrictions(RoleBinding roleBindingAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (roleBindingAttributeRestrictions!=null){ this.attributeRestrictions= new RoleBindingBuilder(roleBindingAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<A> withNewRoleBindingAttributeRestrictions(){
            return new RoleBindingAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<A> withNewRoleBindingAttributeRestrictionsLike(RoleBinding item){
            return new RoleBindingAttributeRestrictionsNestedImpl(item);
    }

    public A withPodPresetAttributeRestrictions(PodPreset podPresetAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (podPresetAttributeRestrictions!=null){ this.attributeRestrictions= new PodPresetBuilder(podPresetAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PodPresetAttributeRestrictionsNested<A> withNewPodPresetAttributeRestrictions(){
            return new PodPresetAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PodPresetAttributeRestrictionsNested<A> withNewPodPresetAttributeRestrictionsLike(PodPreset item){
            return new PodPresetAttributeRestrictionsNestedImpl(item);
    }

    public A withProjectAttributeRestrictions(Project projectAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (projectAttributeRestrictions!=null){ this.attributeRestrictions= new ProjectBuilder(projectAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ProjectAttributeRestrictionsNested<A> withNewProjectAttributeRestrictions(){
            return new ProjectAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ProjectAttributeRestrictionsNested<A> withNewProjectAttributeRestrictionsLike(Project item){
            return new ProjectAttributeRestrictionsNestedImpl(item);
    }

    public A withBuildConfigAttributeRestrictions(BuildConfig buildConfigAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (buildConfigAttributeRestrictions!=null){ this.attributeRestrictions= new BuildConfigBuilder(buildConfigAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<A> withNewBuildConfigAttributeRestrictions(){
            return new BuildConfigAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<A> withNewBuildConfigAttributeRestrictionsLike(BuildConfig item){
            return new BuildConfigAttributeRestrictionsNestedImpl(item);
    }

    public A withClusterRoleAttributeRestrictions(ClusterRole clusterRoleAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (clusterRoleAttributeRestrictions!=null){ this.attributeRestrictions= new ClusterRoleBuilder(clusterRoleAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<A> withNewClusterRoleAttributeRestrictions(){
            return new ClusterRoleAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<A> withNewClusterRoleAttributeRestrictionsLike(ClusterRole item){
            return new ClusterRoleAttributeRestrictionsNestedImpl(item);
    }

    public A withOAuthAuthorizeTokenAttributeRestrictions(OAuthAuthorizeToken oAuthAuthorizeTokenAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (oAuthAuthorizeTokenAttributeRestrictions!=null){ this.attributeRestrictions= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeTokenAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<A> withNewOAuthAuthorizeTokenAttributeRestrictions(){
            return new OAuthAuthorizeTokenAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<A> withNewOAuthAuthorizeTokenAttributeRestrictionsLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenAttributeRestrictionsNestedImpl(item);
    }

    public A withProjectRequestAttributeRestrictions(ProjectRequest projectRequestAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (projectRequestAttributeRestrictions!=null){ this.attributeRestrictions= new ProjectRequestBuilder(projectRequestAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<A> withNewProjectRequestAttributeRestrictions(){
            return new ProjectRequestAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<A> withNewProjectRequestAttributeRestrictionsLike(ProjectRequest item){
            return new ProjectRequestAttributeRestrictionsNestedImpl(item);
    }

    public A withPriorityClassAttributeRestrictions(PriorityClass priorityClassAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (priorityClassAttributeRestrictions!=null){ this.attributeRestrictions= new PriorityClassBuilder(priorityClassAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<A> withNewPriorityClassAttributeRestrictions(){
            return new PriorityClassAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<A> withNewPriorityClassAttributeRestrictionsLike(PriorityClass item){
            return new PriorityClassAttributeRestrictionsNestedImpl(item);
    }

    public A withTemplateAttributeRestrictions(Template templateAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (templateAttributeRestrictions!=null){ this.attributeRestrictions= new TemplateBuilder(templateAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.TemplateAttributeRestrictionsNested<A> withNewTemplateAttributeRestrictions(){
            return new TemplateAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.TemplateAttributeRestrictionsNested<A> withNewTemplateAttributeRestrictionsLike(Template item){
            return new TemplateAttributeRestrictionsNestedImpl(item);
    }

    public A withOAuthClientAuthorizationAttributeRestrictions(OAuthClientAuthorization oAuthClientAuthorizationAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (oAuthClientAuthorizationAttributeRestrictions!=null){ this.attributeRestrictions= new OAuthClientAuthorizationBuilder(oAuthClientAuthorizationAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<A> withNewOAuthClientAuthorizationAttributeRestrictions(){
            return new OAuthClientAuthorizationAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<A> withNewOAuthClientAuthorizationAttributeRestrictionsLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationAttributeRestrictionsNestedImpl(item);
    }

    public A withDeploymentAttributeRestrictions(Deployment deploymentAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (deploymentAttributeRestrictions!=null){ this.attributeRestrictions= new DeploymentBuilder(deploymentAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.DeploymentAttributeRestrictionsNested<A> withNewDeploymentAttributeRestrictions(){
            return new DeploymentAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.DeploymentAttributeRestrictionsNested<A> withNewDeploymentAttributeRestrictionsLike(Deployment item){
            return new DeploymentAttributeRestrictionsNestedImpl(item);
    }

    public A withPodTemplateAttributeRestrictions(PodTemplate podTemplateAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (podTemplateAttributeRestrictions!=null){ this.attributeRestrictions= new PodTemplateBuilder(podTemplateAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<A> withNewPodTemplateAttributeRestrictions(){
            return new PodTemplateAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<A> withNewPodTemplateAttributeRestrictionsLike(PodTemplate item){
            return new PodTemplateAttributeRestrictionsNestedImpl(item);
    }

    public A withEventAttributeRestrictions(Event eventAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (eventAttributeRestrictions!=null){ this.attributeRestrictions= new EventBuilder(eventAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.EventAttributeRestrictionsNested<A> withNewEventAttributeRestrictions(){
            return new EventAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.EventAttributeRestrictionsNested<A> withNewEventAttributeRestrictionsLike(Event item){
            return new EventAttributeRestrictionsNestedImpl(item);
    }

    public A withIngressAttributeRestrictions(Ingress ingressAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (ingressAttributeRestrictions!=null){ this.attributeRestrictions= new IngressBuilder(ingressAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.IngressAttributeRestrictionsNested<A> withNewIngressAttributeRestrictions(){
            return new IngressAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.IngressAttributeRestrictionsNested<A> withNewIngressAttributeRestrictionsLike(Ingress item){
            return new IngressAttributeRestrictionsNestedImpl(item);
    }

    public A withDeploymentConfigAttributeRestrictions(DeploymentConfig deploymentConfigAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (deploymentConfigAttributeRestrictions!=null){ this.attributeRestrictions= new DeploymentConfigBuilder(deploymentConfigAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<A> withNewDeploymentConfigAttributeRestrictions(){
            return new DeploymentConfigAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<A> withNewDeploymentConfigAttributeRestrictionsLike(DeploymentConfig item){
            return new DeploymentConfigAttributeRestrictionsNestedImpl(item);
    }

    public A withOAuthAccessTokenAttributeRestrictions(OAuthAccessToken oAuthAccessTokenAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (oAuthAccessTokenAttributeRestrictions!=null){ this.attributeRestrictions= new OAuthAccessTokenBuilder(oAuthAccessTokenAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<A> withNewOAuthAccessTokenAttributeRestrictions(){
            return new OAuthAccessTokenAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<A> withNewOAuthAccessTokenAttributeRestrictionsLike(OAuthAccessToken item){
            return new OAuthAccessTokenAttributeRestrictionsNestedImpl(item);
    }

    public A withPersistentVolumeAttributeRestrictions(PersistentVolume persistentVolumeAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (persistentVolumeAttributeRestrictions!=null){ this.attributeRestrictions= new PersistentVolumeBuilder(persistentVolumeAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<A> withNewPersistentVolumeAttributeRestrictions(){
            return new PersistentVolumeAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<A> withNewPersistentVolumeAttributeRestrictionsLike(PersistentVolume item){
            return new PersistentVolumeAttributeRestrictionsNestedImpl(item);
    }

    public A withPersistentVolumeClaimAttributeRestrictions(PersistentVolumeClaim persistentVolumeClaimAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (persistentVolumeClaimAttributeRestrictions!=null){ this.attributeRestrictions= new PersistentVolumeClaimBuilder(persistentVolumeClaimAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<A> withNewPersistentVolumeClaimAttributeRestrictions(){
            return new PersistentVolumeClaimAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<A> withNewPersistentVolumeClaimAttributeRestrictionsLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimAttributeRestrictionsNestedImpl(item);
    }

    public A withEventAttributeRestrictions(io.fabric8.kubernetes.api.model.events.Event eventAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (eventAttributeRestrictions!=null){ this.attributeRestrictions= new io.fabric8.kubernetes.api.model.events.EventBuilder(eventAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.EventsEventAttributeRestrictionsNested<A> withNewEventsEventAttributeRestrictions(){
            return new EventsEventAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.EventsEventAttributeRestrictionsNested<A> withNewEventAttributeRestrictionsLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventAttributeRestrictionsNestedImpl(item);
    }

    public A withStatefulSetAttributeRestrictions(StatefulSet statefulSetAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (statefulSetAttributeRestrictions!=null){ this.attributeRestrictions= new StatefulSetBuilder(statefulSetAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<A> withNewStatefulSetAttributeRestrictions(){
            return new StatefulSetAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<A> withNewStatefulSetAttributeRestrictionsLike(StatefulSet item){
            return new StatefulSetAttributeRestrictionsNestedImpl(item);
    }

    public A withOpenshiftClusterRoleAttributeRestrictions(OpenshiftClusterRole openshiftClusterRoleAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (openshiftClusterRoleAttributeRestrictions!=null){ this.attributeRestrictions= new OpenshiftClusterRoleBuilder(openshiftClusterRoleAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleAttributeRestrictions(){
            return new OpenshiftClusterRoleAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<A> withNewOpenshiftClusterRoleAttributeRestrictionsLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleAttributeRestrictionsNestedImpl(item);
    }

    public A withRoleAttributeRestrictions(Role roleAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (roleAttributeRestrictions!=null){ this.attributeRestrictions= new RoleBuilder(roleAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.RoleAttributeRestrictionsNested<A> withNewRoleAttributeRestrictions(){
            return new RoleAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.RoleAttributeRestrictionsNested<A> withNewRoleAttributeRestrictionsLike(Role item){
            return new RoleAttributeRestrictionsNestedImpl(item);
    }

    public A withUserAttributeRestrictions(User userAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (userAttributeRestrictions!=null){ this.attributeRestrictions= new UserBuilder(userAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.UserAttributeRestrictionsNested<A> withNewUserAttributeRestrictions(){
            return new UserAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.UserAttributeRestrictionsNested<A> withNewUserAttributeRestrictionsLike(User item){
            return new UserAttributeRestrictionsNestedImpl(item);
    }

    public A withComponentStatusAttributeRestrictions(ComponentStatus componentStatusAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (componentStatusAttributeRestrictions!=null){ this.attributeRestrictions= new ComponentStatusBuilder(componentStatusAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<A> withNewComponentStatusAttributeRestrictions(){
            return new ComponentStatusAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<A> withNewComponentStatusAttributeRestrictionsLike(ComponentStatus item){
            return new ComponentStatusAttributeRestrictionsNestedImpl(item);
    }

    public A withTokenReviewAttributeRestrictions(TokenReview tokenReviewAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (tokenReviewAttributeRestrictions!=null){ this.attributeRestrictions= new TokenReviewBuilder(tokenReviewAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<A> withNewTokenReviewAttributeRestrictions(){
            return new TokenReviewAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<A> withNewTokenReviewAttributeRestrictionsLike(TokenReview item){
            return new TokenReviewAttributeRestrictionsNestedImpl(item);
    }

    public A withBindingAttributeRestrictions(Binding bindingAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (bindingAttributeRestrictions!=null){ this.attributeRestrictions= new BindingBuilder(bindingAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.BindingAttributeRestrictionsNested<A> withNewBindingAttributeRestrictions(){
            return new BindingAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.BindingAttributeRestrictionsNested<A> withNewBindingAttributeRestrictionsLike(Binding item){
            return new BindingAttributeRestrictionsNestedImpl(item);
    }

    public A withSecretAttributeRestrictions(Secret secretAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (secretAttributeRestrictions!=null){ this.attributeRestrictions= new SecretBuilder(secretAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.SecretAttributeRestrictionsNested<A> withNewSecretAttributeRestrictions(){
            return new SecretAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.SecretAttributeRestrictionsNested<A> withNewSecretAttributeRestrictionsLike(Secret item){
            return new SecretAttributeRestrictionsNestedImpl(item);
    }

    public A withSecurityContextConstraintsAttributeRestrictions(SecurityContextConstraints securityContextConstraintsAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (securityContextConstraintsAttributeRestrictions!=null){ this.attributeRestrictions= new SecurityContextConstraintsBuilder(securityContextConstraintsAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<A> withNewSecurityContextConstraintsAttributeRestrictions(){
            return new SecurityContextConstraintsAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<A> withNewSecurityContextConstraintsAttributeRestrictionsLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsAttributeRestrictionsNestedImpl(item);
    }

    public A withNetNamespaceAttributeRestrictions(NetNamespace netNamespaceAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (netNamespaceAttributeRestrictions!=null){ this.attributeRestrictions= new NetNamespaceBuilder(netNamespaceAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<A> withNewNetNamespaceAttributeRestrictions(){
            return new NetNamespaceAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<A> withNewNetNamespaceAttributeRestrictionsLike(NetNamespace item){
            return new NetNamespaceAttributeRestrictionsNestedImpl(item);
    }

    public A withNodeAttributeRestrictions(Node nodeAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (nodeAttributeRestrictions!=null){ this.attributeRestrictions= new NodeBuilder(nodeAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.NodeAttributeRestrictionsNested<A> withNewNodeAttributeRestrictions(){
            return new NodeAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.NodeAttributeRestrictionsNested<A> withNewNodeAttributeRestrictionsLike(Node item){
            return new NodeAttributeRestrictionsNestedImpl(item);
    }

    public A withJobAttributeRestrictions(Job jobAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (jobAttributeRestrictions!=null){ this.attributeRestrictions= new JobBuilder(jobAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.JobAttributeRestrictionsNested<A> withNewJobAttributeRestrictions(){
            return new JobAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.JobAttributeRestrictionsNested<A> withNewJobAttributeRestrictionsLike(Job item){
            return new JobAttributeRestrictionsNestedImpl(item);
    }

    public A withCertificateSigningRequestAttributeRestrictions(CertificateSigningRequest certificateSigningRequestAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (certificateSigningRequestAttributeRestrictions!=null){ this.attributeRestrictions= new CertificateSigningRequestBuilder(certificateSigningRequestAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<A> withNewCertificateSigningRequestAttributeRestrictions(){
            return new CertificateSigningRequestAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<A> withNewCertificateSigningRequestAttributeRestrictionsLike(CertificateSigningRequest item){
            return new CertificateSigningRequestAttributeRestrictionsNestedImpl(item);
    }

    public A withServiceAccountAttributeRestrictions(ServiceAccount serviceAccountAttributeRestrictions){
            _visitables.remove(this.attributeRestrictions);
            if (serviceAccountAttributeRestrictions!=null){ this.attributeRestrictions= new ServiceAccountBuilder(serviceAccountAttributeRestrictions); _visitables.add(this.attributeRestrictions);} return (A) this;
    }

    public PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<A> withNewServiceAccountAttributeRestrictions(){
            return new ServiceAccountAttributeRestrictionsNestedImpl();
    }

    public PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<A> withNewServiceAccountAttributeRestrictionsLike(ServiceAccount item){
            return new ServiceAccountAttributeRestrictionsNestedImpl(item);
    }

    public A addToNonResourceURLs(int index,String item){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            this.nonResourceURLs.add(index, item);
            return (A)this;
    }

    public A setToNonResourceURLs(int index,String item){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            this.nonResourceURLs.set(index, item); return (A)this;
    }

    public A addToNonResourceURLs(String... items){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
    }

    public A addAllToNonResourceURLs(Collection<String> items){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
    }

    public A removeFromNonResourceURLs(String... items){
            for (String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
    }

    public A removeAllFromNonResourceURLs(Collection<String> items){
            for (String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
    }

    public List<String> getNonResourceURLs(){
            return this.nonResourceURLs;
    }

    public String getNonResourceURL(int index){
            return this.nonResourceURLs.get(index);
    }

    public String getFirstNonResourceURL(){
            return this.nonResourceURLs.get(0);
    }

    public String getLastNonResourceURL(){
            return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
    }

    public String getMatchingNonResourceURL(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: nonResourceURLs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNonResourceURLs(List<String> nonResourceURLs){
            if (this.nonResourceURLs != null) { _visitables.removeAll(this.nonResourceURLs);}
            if (nonResourceURLs != null) {this.nonResourceURLs = new ArrayList<String>(); for (String item : nonResourceURLs){this.addToNonResourceURLs(item);}} else { this.nonResourceURLs = new ArrayList<String>();} return (A) this;
    }

    public A withNonResourceURLs(String... nonResourceURLs){
            if (this.nonResourceURLs != null) {this.nonResourceURLs.clear();}
            if (nonResourceURLs != null) {for (String item :nonResourceURLs){ this.addToNonResourceURLs(item);}} return (A) this;
    }

    public Boolean hasNonResourceURLs(){
            return nonResourceURLs != null && !nonResourceURLs.isEmpty();
    }

    public A addToResourceNames(int index,String item){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            this.resourceNames.add(index, item);
            return (A)this;
    }

    public A setToResourceNames(int index,String item){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            this.resourceNames.set(index, item); return (A)this;
    }

    public A addToResourceNames(String... items){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            for (String item : items) {this.resourceNames.add(item);} return (A)this;
    }

    public A addAllToResourceNames(Collection<String> items){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            for (String item : items) {this.resourceNames.add(item);} return (A)this;
    }

    public A removeFromResourceNames(String... items){
            for (String item : items) {if (this.resourceNames!= null){ this.resourceNames.remove(item);}} return (A)this;
    }

    public A removeAllFromResourceNames(Collection<String> items){
            for (String item : items) {if (this.resourceNames!= null){ this.resourceNames.remove(item);}} return (A)this;
    }

    public List<String> getResourceNames(){
            return this.resourceNames;
    }

    public String getResourceName(int index){
            return this.resourceNames.get(index);
    }

    public String getFirstResourceName(){
            return this.resourceNames.get(0);
    }

    public String getLastResourceName(){
            return this.resourceNames.get(resourceNames.size() - 1);
    }

    public String getMatchingResourceName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: resourceNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withResourceNames(List<String> resourceNames){
            if (this.resourceNames != null) { _visitables.removeAll(this.resourceNames);}
            if (resourceNames != null) {this.resourceNames = new ArrayList<String>(); for (String item : resourceNames){this.addToResourceNames(item);}} else { this.resourceNames = new ArrayList<String>();} return (A) this;
    }

    public A withResourceNames(String... resourceNames){
            if (this.resourceNames != null) {this.resourceNames.clear();}
            if (resourceNames != null) {for (String item :resourceNames){ this.addToResourceNames(item);}} return (A) this;
    }

    public Boolean hasResourceNames(){
            return resourceNames != null && !resourceNames.isEmpty();
    }

    public A addToResources(int index,String item){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            this.resources.add(index, item);
            return (A)this;
    }

    public A setToResources(int index,String item){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            this.resources.set(index, item); return (A)this;
    }

    public A addToResources(String... items){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            for (String item : items) {this.resources.add(item);} return (A)this;
    }

    public A addAllToResources(Collection<String> items){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            for (String item : items) {this.resources.add(item);} return (A)this;
    }

    public A removeFromResources(String... items){
            for (String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
    }

    public A removeAllFromResources(Collection<String> items){
            for (String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
    }

    public List<String> getResources(){
            return this.resources;
    }

    public String getResource(int index){
            return this.resources.get(index);
    }

    public String getFirstResource(){
            return this.resources.get(0);
    }

    public String getLastResource(){
            return this.resources.get(resources.size() - 1);
    }

    public String getMatchingResource(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: resources) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withResources(List<String> resources){
            if (this.resources != null) { _visitables.removeAll(this.resources);}
            if (resources != null) {this.resources = new ArrayList<String>(); for (String item : resources){this.addToResources(item);}} else { this.resources = new ArrayList<String>();} return (A) this;
    }

    public A withResources(String... resources){
            if (this.resources != null) {this.resources.clear();}
            if (resources != null) {for (String item :resources){ this.addToResources(item);}} return (A) this;
    }

    public Boolean hasResources(){
            return resources != null && !resources.isEmpty();
    }

    public A addToVerbs(int index,String item){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            this.verbs.add(index, item);
            return (A)this;
    }

    public A setToVerbs(int index,String item){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            this.verbs.set(index, item); return (A)this;
    }

    public A addToVerbs(String... items){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            for (String item : items) {this.verbs.add(item);} return (A)this;
    }

    public A addAllToVerbs(Collection<String> items){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            for (String item : items) {this.verbs.add(item);} return (A)this;
    }

    public A removeFromVerbs(String... items){
            for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
    }

    public A removeAllFromVerbs(Collection<String> items){
            for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
    }

    public List<String> getVerbs(){
            return this.verbs;
    }

    public String getVerb(int index){
            return this.verbs.get(index);
    }

    public String getFirstVerb(){
            return this.verbs.get(0);
    }

    public String getLastVerb(){
            return this.verbs.get(verbs.size() - 1);
    }

    public String getMatchingVerb(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: verbs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withVerbs(List<String> verbs){
            if (this.verbs != null) { _visitables.removeAll(this.verbs);}
            if (verbs != null) {this.verbs = new ArrayList<String>(); for (String item : verbs){this.addToVerbs(item);}} else { this.verbs = new ArrayList<String>();} return (A) this;
    }

    public A withVerbs(String... verbs){
            if (this.verbs != null) {this.verbs.clear();}
            if (verbs != null) {for (String item :verbs){ this.addToVerbs(item);}} return (A) this;
    }

    public Boolean hasVerbs(){
            return verbs != null && !verbs.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PolicyRuleFluentImpl that = (PolicyRuleFluentImpl) o;
            if (apiGroups != null ? !apiGroups.equals(that.apiGroups) :that.apiGroups != null) return false;
            if (attributeRestrictions != null ? !attributeRestrictions.equals(that.attributeRestrictions) :that.attributeRestrictions != null) return false;
            if (nonResourceURLs != null ? !nonResourceURLs.equals(that.nonResourceURLs) :that.nonResourceURLs != null) return false;
            if (resourceNames != null ? !resourceNames.equals(that.resourceNames) :that.resourceNames != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
            return true;
    }


    public class ValidatingWebhookConfigurationAttributeRestrictionsNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ValidatingWebhookConfigurationAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationAttributeRestrictionsNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationAttributeRestrictionsNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withValidatingWebhookConfigurationAttributeRestrictions(builder.build());
    }
    public N endValidatingWebhookConfigurationAttributeRestrictions(){
            return and();
    }

}
    public class StorageClassAttributeRestrictionsNestedImpl<N> extends StorageClassFluentImpl<PolicyRuleFluent.StorageClassAttributeRestrictionsNested<N>> implements PolicyRuleFluent.StorageClassAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassAttributeRestrictionsNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassAttributeRestrictionsNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withStorageClassAttributeRestrictions(builder.build());
    }
    public N endStorageClassAttributeRestrictions(){
            return and();
    }

}
    public class ClusterRoleBindingAttributeRestrictionsNestedImpl<N> extends ClusterRoleBindingFluentImpl<PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ClusterRoleBindingAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingAttributeRestrictionsNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingAttributeRestrictionsNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withClusterRoleBindingAttributeRestrictions(builder.build());
    }
    public N endClusterRoleBindingAttributeRestrictions(){
            return and();
    }

}
    public class OpenshiftRoleBindingAttributeRestrictionsNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OpenshiftRoleBindingAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingAttributeRestrictionsNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingAttributeRestrictionsNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOpenshiftRoleBindingAttributeRestrictions(builder.build());
    }
    public N endOpenshiftRoleBindingAttributeRestrictions(){
            return and();
    }

}
    public class PodDisruptionBudgetAttributeRestrictionsNestedImpl<N> extends PodDisruptionBudgetFluentImpl<PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PodDisruptionBudgetAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetAttributeRestrictionsNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetAttributeRestrictionsNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPodDisruptionBudgetAttributeRestrictions(builder.build());
    }
    public N endPodDisruptionBudgetAttributeRestrictions(){
            return and();
    }

}
    public class NetworkPolicyAttributeRestrictionsNestedImpl<N> extends NetworkPolicyFluentImpl<PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<N>> implements PolicyRuleFluent.NetworkPolicyAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyAttributeRestrictionsNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyAttributeRestrictionsNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withNetworkPolicyAttributeRestrictions(builder.build());
    }
    public N endNetworkPolicyAttributeRestrictions(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingAttributeRestrictionsNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OpenshiftClusterRoleBindingAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingAttributeRestrictionsNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingAttributeRestrictionsNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOpenshiftClusterRoleBindingAttributeRestrictions(builder.build());
    }
    public N endOpenshiftClusterRoleBindingAttributeRestrictions(){
            return and();
    }

}
    public class RouteAttributeRestrictionsNestedImpl<N> extends RouteFluentImpl<PolicyRuleFluent.RouteAttributeRestrictionsNested<N>> implements PolicyRuleFluent.RouteAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteAttributeRestrictionsNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteAttributeRestrictionsNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withRouteAttributeRestrictions(builder.build());
    }
    public N endRouteAttributeRestrictions(){
            return and();
    }

}
    public class NamespaceAttributeRestrictionsNestedImpl<N> extends NamespaceFluentImpl<PolicyRuleFluent.NamespaceAttributeRestrictionsNested<N>> implements PolicyRuleFluent.NamespaceAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceAttributeRestrictionsNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceAttributeRestrictionsNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withNamespaceAttributeRestrictions(builder.build());
    }
    public N endNamespaceAttributeRestrictions(){
            return and();
    }

}
    public class LocalSubjectAccessReviewAttributeRestrictionsNestedImpl<N> extends io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl<PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<N>> implements PolicyRuleFluent.LocalSubjectAccessReviewAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder builder;
    
            LocalSubjectAccessReviewAttributeRestrictionsNestedImpl(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview item){
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewAttributeRestrictionsNestedImpl(){
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withLocalSubjectAccessReviewAttributeRestrictions(builder.build());
    }
    public N endLocalSubjectAccessReviewAttributeRestrictions(){
            return and();
    }

}
    public class ServiceAttributeRestrictionsNestedImpl<N> extends ServiceFluentImpl<PolicyRuleFluent.ServiceAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ServiceAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
    
            ServiceAttributeRestrictionsNestedImpl(Service item){
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceAttributeRestrictionsNestedImpl(){
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withServiceAttributeRestrictions(builder.build());
    }
    public N endServiceAttributeRestrictions(){
            return and();
    }

}
    public class ReplicationControllerAttributeRestrictionsNestedImpl<N> extends ReplicationControllerFluentImpl<PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ReplicationControllerAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
    
            ReplicationControllerAttributeRestrictionsNestedImpl(ReplicationController item){
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerAttributeRestrictionsNestedImpl(){
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withReplicationControllerAttributeRestrictions(builder.build());
    }
    public N endReplicationControllerAttributeRestrictions(){
            return and();
    }

}
    public class SubjectAccessReviewAttributeRestrictionsNestedImpl<N> extends io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl<PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<N>> implements PolicyRuleFluent.SubjectAccessReviewAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder builder;
    
            SubjectAccessReviewAttributeRestrictionsNestedImpl(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewAttributeRestrictionsNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withSubjectAccessReviewAttributeRestrictions(builder.build());
    }
    public N endSubjectAccessReviewAttributeRestrictions(){
            return and();
    }

}
    public class MutatingWebhookConfigurationAttributeRestrictionsNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<N>> implements PolicyRuleFluent.MutatingWebhookConfigurationAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationAttributeRestrictionsNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationAttributeRestrictionsNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withMutatingWebhookConfigurationAttributeRestrictions(builder.build());
    }
    public N endMutatingWebhookConfigurationAttributeRestrictions(){
            return and();
    }

}
    public class HorizontalPodAutoscalerAttributeRestrictionsNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<N>> implements PolicyRuleFluent.HorizontalPodAutoscalerAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerAttributeRestrictionsNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerAttributeRestrictionsNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withHorizontalPodAutoscalerAttributeRestrictions(builder.build());
    }
    public N endHorizontalPodAutoscalerAttributeRestrictions(){
            return and();
    }

}
    public class ScaleAttributeRestrictionsNestedImpl<N> extends ScaleFluentImpl<PolicyRuleFluent.ScaleAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ScaleAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleAttributeRestrictionsNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleAttributeRestrictionsNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withScaleAttributeRestrictions(builder.build());
    }
    public N endScaleAttributeRestrictions(){
            return and();
    }

}
    public class ImageAttributeRestrictionsNestedImpl<N> extends ImageFluentImpl<PolicyRuleFluent.ImageAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ImageAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageAttributeRestrictionsNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageAttributeRestrictionsNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withImageAttributeRestrictions(builder.build());
    }
    public N endImageAttributeRestrictions(){
            return and();
    }

}
    public class ReplicaSetAttributeRestrictionsNestedImpl<N> extends ReplicaSetFluentImpl<PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ReplicaSetAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetAttributeRestrictionsNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetAttributeRestrictionsNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withReplicaSetAttributeRestrictions(builder.build());
    }
    public N endReplicaSetAttributeRestrictions(){
            return and();
    }

}
    public class PodSecurityPolicyAttributeRestrictionsNestedImpl<N> extends PodSecurityPolicyFluentImpl<PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PodSecurityPolicyAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyAttributeRestrictionsNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyAttributeRestrictionsNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPodSecurityPolicyAttributeRestrictions(builder.build());
    }
    public N endPodSecurityPolicyAttributeRestrictions(){
            return and();
    }

}
    public class CronJobAttributeRestrictionsNestedImpl<N> extends CronJobFluentImpl<PolicyRuleFluent.CronJobAttributeRestrictionsNested<N>> implements PolicyRuleFluent.CronJobAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobAttributeRestrictionsNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobAttributeRestrictionsNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withCronJobAttributeRestrictions(builder.build());
    }
    public N endCronJobAttributeRestrictions(){
            return and();
    }

}
    public class EndpointsAttributeRestrictionsNestedImpl<N> extends EndpointsFluentImpl<PolicyRuleFluent.EndpointsAttributeRestrictionsNested<N>> implements PolicyRuleFluent.EndpointsAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsAttributeRestrictionsNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsAttributeRestrictionsNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withEndpointsAttributeRestrictions(builder.build());
    }
    public N endEndpointsAttributeRestrictions(){
            return and();
    }

}
    public class PodAttributeRestrictionsNestedImpl<N> extends PodFluentImpl<PolicyRuleFluent.PodAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PodAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
    
            PodAttributeRestrictionsNestedImpl(Pod item){
                    this.builder = new PodBuilder(this, item);
            }
            PodAttributeRestrictionsNestedImpl(){
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPodAttributeRestrictions(builder.build());
    }
    public N endPodAttributeRestrictions(){
            return and();
    }

}
    public class ConfigMapAttributeRestrictionsNestedImpl<N> extends ConfigMapFluentImpl<PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ConfigMapAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapAttributeRestrictionsNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapAttributeRestrictionsNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withConfigMapAttributeRestrictions(builder.build());
    }
    public N endConfigMapAttributeRestrictions(){
            return and();
    }

}
    public class CustomResourceDefinitionAttributeRestrictionsNestedImpl<N> extends CustomResourceDefinitionFluentImpl<PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<N>> implements PolicyRuleFluent.CustomResourceDefinitionAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionAttributeRestrictionsNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionAttributeRestrictionsNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withCustomResourceDefinitionAttributeRestrictions(builder.build());
    }
    public N endCustomResourceDefinitionAttributeRestrictions(){
            return and();
    }

}
    public class BuildAttributeRestrictionsNestedImpl<N> extends BuildFluentImpl<PolicyRuleFluent.BuildAttributeRestrictionsNested<N>> implements PolicyRuleFluent.BuildAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
    
            BuildAttributeRestrictionsNestedImpl(Build item){
                    this.builder = new BuildBuilder(this, item);
            }
            BuildAttributeRestrictionsNestedImpl(){
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withBuildAttributeRestrictions(builder.build());
    }
    public N endBuildAttributeRestrictions(){
            return and();
    }

}
    public class ImageStreamTagAttributeRestrictionsNestedImpl<N> extends ImageStreamTagFluentImpl<PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ImageStreamTagAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
    
            ImageStreamTagAttributeRestrictionsNestedImpl(ImageStreamTag item){
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagAttributeRestrictionsNestedImpl(){
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withImageStreamTagAttributeRestrictions(builder.build());
    }
    public N endImageStreamTagAttributeRestrictions(){
            return and();
    }

}
    public class GroupAttributeRestrictionsNestedImpl<N> extends GroupFluentImpl<PolicyRuleFluent.GroupAttributeRestrictionsNested<N>> implements PolicyRuleFluent.GroupAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupAttributeRestrictionsNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupAttributeRestrictionsNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withGroupAttributeRestrictions(builder.build());
    }
    public N endGroupAttributeRestrictions(){
            return and();
    }

}
    public class ImageSignatureAttributeRestrictionsNestedImpl<N> extends ImageSignatureFluentImpl<PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ImageSignatureAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
    
            ImageSignatureAttributeRestrictionsNestedImpl(ImageSignature item){
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureAttributeRestrictionsNestedImpl(){
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withImageSignatureAttributeRestrictions(builder.build());
    }
    public N endImageSignatureAttributeRestrictions(){
            return and();
    }

}
    public class ResourceQuotaAttributeRestrictionsNestedImpl<N> extends ResourceQuotaFluentImpl<PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ResourceQuotaAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaAttributeRestrictionsNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaAttributeRestrictionsNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withResourceQuotaAttributeRestrictions(builder.build());
    }
    public N endResourceQuotaAttributeRestrictions(){
            return and();
    }

}
    public class BuildRequestAttributeRestrictionsNestedImpl<N> extends BuildRequestFluentImpl<PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<N>> implements PolicyRuleFluent.BuildRequestAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestAttributeRestrictionsNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestAttributeRestrictionsNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withBuildRequestAttributeRestrictions(builder.build());
    }
    public N endBuildRequestAttributeRestrictions(){
            return and();
    }

}
    public class DaemonSetAttributeRestrictionsNestedImpl<N> extends DaemonSetFluentImpl<PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<N>> implements PolicyRuleFluent.DaemonSetAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetAttributeRestrictionsNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetAttributeRestrictionsNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withDaemonSetAttributeRestrictions(builder.build());
    }
    public N endDaemonSetAttributeRestrictions(){
            return and();
    }

}
    public class ImageStreamAttributeRestrictionsNestedImpl<N> extends ImageStreamFluentImpl<PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ImageStreamAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImageStreamAttributeRestrictionsNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamAttributeRestrictionsNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withImageStreamAttributeRestrictions(builder.build());
    }
    public N endImageStreamAttributeRestrictions(){
            return and();
    }

}
    public class OpenshiftRoleAttributeRestrictionsNestedImpl<N> extends OpenshiftRoleFluentImpl<PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OpenshiftRoleAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleAttributeRestrictionsNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleAttributeRestrictionsNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOpenshiftRoleAttributeRestrictions(builder.build());
    }
    public N endOpenshiftRoleAttributeRestrictions(){
            return and();
    }

}
    public class OAuthClientAttributeRestrictionsNestedImpl<N> extends OAuthClientFluentImpl<PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OAuthClientAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientAttributeRestrictionsNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientAttributeRestrictionsNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOAuthClientAttributeRestrictions(builder.build());
    }
    public N endOAuthClientAttributeRestrictions(){
            return and();
    }

}
    public class IdentityAttributeRestrictionsNestedImpl<N> extends IdentityFluentImpl<PolicyRuleFluent.IdentityAttributeRestrictionsNested<N>> implements PolicyRuleFluent.IdentityAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityAttributeRestrictionsNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityAttributeRestrictionsNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withIdentityAttributeRestrictions(builder.build());
    }
    public N endIdentityAttributeRestrictions(){
            return and();
    }

}
    public class LimitRangeAttributeRestrictionsNestedImpl<N> extends LimitRangeFluentImpl<PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<N>> implements PolicyRuleFluent.LimitRangeAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
    
            LimitRangeAttributeRestrictionsNestedImpl(LimitRange item){
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeAttributeRestrictionsNestedImpl(){
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withLimitRangeAttributeRestrictions(builder.build());
    }
    public N endLimitRangeAttributeRestrictions(){
            return and();
    }

}
    public class ImageStreamImportAttributeRestrictionsNestedImpl<N> extends ImageStreamImportFluentImpl<PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ImageStreamImportAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportAttributeRestrictionsNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportAttributeRestrictionsNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withImageStreamImportAttributeRestrictions(builder.build());
    }
    public N endImageStreamImportAttributeRestrictions(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionAttributeRestrictionsNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OpenshiftRoleBindingRestrictionAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionAttributeRestrictionsNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionAttributeRestrictionsNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOpenshiftRoleBindingRestrictionAttributeRestrictions(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionAttributeRestrictions(){
            return and();
    }

}
    public class RoleBindingAttributeRestrictionsNestedImpl<N> extends RoleBindingFluentImpl<PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<N>> implements PolicyRuleFluent.RoleBindingAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingAttributeRestrictionsNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingAttributeRestrictionsNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withRoleBindingAttributeRestrictions(builder.build());
    }
    public N endRoleBindingAttributeRestrictions(){
            return and();
    }

}
    public class PodPresetAttributeRestrictionsNestedImpl<N> extends PodPresetFluentImpl<PolicyRuleFluent.PodPresetAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PodPresetAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetAttributeRestrictionsNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetAttributeRestrictionsNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPodPresetAttributeRestrictions(builder.build());
    }
    public N endPodPresetAttributeRestrictions(){
            return and();
    }

}
    public class ProjectAttributeRestrictionsNestedImpl<N> extends ProjectFluentImpl<PolicyRuleFluent.ProjectAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ProjectAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectAttributeRestrictionsNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectAttributeRestrictionsNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withProjectAttributeRestrictions(builder.build());
    }
    public N endProjectAttributeRestrictions(){
            return and();
    }

}
    public class BuildConfigAttributeRestrictionsNestedImpl<N> extends BuildConfigFluentImpl<PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<N>> implements PolicyRuleFluent.BuildConfigAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
    
            BuildConfigAttributeRestrictionsNestedImpl(BuildConfig item){
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigAttributeRestrictionsNestedImpl(){
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withBuildConfigAttributeRestrictions(builder.build());
    }
    public N endBuildConfigAttributeRestrictions(){
            return and();
    }

}
    public class ClusterRoleAttributeRestrictionsNestedImpl<N> extends ClusterRoleFluentImpl<PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ClusterRoleAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleAttributeRestrictionsNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleAttributeRestrictionsNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withClusterRoleAttributeRestrictions(builder.build());
    }
    public N endClusterRoleAttributeRestrictions(){
            return and();
    }

}
    public class OAuthAuthorizeTokenAttributeRestrictionsNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OAuthAuthorizeTokenAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenAttributeRestrictionsNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenAttributeRestrictionsNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOAuthAuthorizeTokenAttributeRestrictions(builder.build());
    }
    public N endOAuthAuthorizeTokenAttributeRestrictions(){
            return and();
    }

}
    public class ProjectRequestAttributeRestrictionsNestedImpl<N> extends ProjectRequestFluentImpl<PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ProjectRequestAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestAttributeRestrictionsNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestAttributeRestrictionsNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withProjectRequestAttributeRestrictions(builder.build());
    }
    public N endProjectRequestAttributeRestrictions(){
            return and();
    }

}
    public class PriorityClassAttributeRestrictionsNestedImpl<N> extends PriorityClassFluentImpl<PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PriorityClassAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassAttributeRestrictionsNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassAttributeRestrictionsNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPriorityClassAttributeRestrictions(builder.build());
    }
    public N endPriorityClassAttributeRestrictions(){
            return and();
    }

}
    public class TemplateAttributeRestrictionsNestedImpl<N> extends TemplateFluentImpl<PolicyRuleFluent.TemplateAttributeRestrictionsNested<N>> implements PolicyRuleFluent.TemplateAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateAttributeRestrictionsNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateAttributeRestrictionsNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withTemplateAttributeRestrictions(builder.build());
    }
    public N endTemplateAttributeRestrictions(){
            return and();
    }

}
    public class OAuthClientAuthorizationAttributeRestrictionsNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OAuthClientAuthorizationAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationAttributeRestrictionsNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationAttributeRestrictionsNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOAuthClientAuthorizationAttributeRestrictions(builder.build());
    }
    public N endOAuthClientAuthorizationAttributeRestrictions(){
            return and();
    }

}
    public class DeploymentAttributeRestrictionsNestedImpl<N> extends DeploymentFluentImpl<PolicyRuleFluent.DeploymentAttributeRestrictionsNested<N>> implements PolicyRuleFluent.DeploymentAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentAttributeRestrictionsNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentAttributeRestrictionsNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withDeploymentAttributeRestrictions(builder.build());
    }
    public N endDeploymentAttributeRestrictions(){
            return and();
    }

}
    public class PodTemplateAttributeRestrictionsNestedImpl<N> extends PodTemplateFluentImpl<PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PodTemplateAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
    
            PodTemplateAttributeRestrictionsNestedImpl(PodTemplate item){
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateAttributeRestrictionsNestedImpl(){
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPodTemplateAttributeRestrictions(builder.build());
    }
    public N endPodTemplateAttributeRestrictions(){
            return and();
    }

}
    public class EventAttributeRestrictionsNestedImpl<N> extends EventFluentImpl<PolicyRuleFluent.EventAttributeRestrictionsNested<N>> implements PolicyRuleFluent.EventAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
    
            EventAttributeRestrictionsNestedImpl(Event item){
                    this.builder = new EventBuilder(this, item);
            }
            EventAttributeRestrictionsNestedImpl(){
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withEventAttributeRestrictions(builder.build());
    }
    public N endEventAttributeRestrictions(){
            return and();
    }

}
    public class IngressAttributeRestrictionsNestedImpl<N> extends IngressFluentImpl<PolicyRuleFluent.IngressAttributeRestrictionsNested<N>> implements PolicyRuleFluent.IngressAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressAttributeRestrictionsNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressAttributeRestrictionsNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withIngressAttributeRestrictions(builder.build());
    }
    public N endIngressAttributeRestrictions(){
            return and();
    }

}
    public class DeploymentConfigAttributeRestrictionsNestedImpl<N> extends DeploymentConfigFluentImpl<PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<N>> implements PolicyRuleFluent.DeploymentConfigAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigAttributeRestrictionsNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigAttributeRestrictionsNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withDeploymentConfigAttributeRestrictions(builder.build());
    }
    public N endDeploymentConfigAttributeRestrictions(){
            return and();
    }

}
    public class OAuthAccessTokenAttributeRestrictionsNestedImpl<N> extends OAuthAccessTokenFluentImpl<PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OAuthAccessTokenAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenAttributeRestrictionsNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenAttributeRestrictionsNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOAuthAccessTokenAttributeRestrictions(builder.build());
    }
    public N endOAuthAccessTokenAttributeRestrictions(){
            return and();
    }

}
    public class PersistentVolumeAttributeRestrictionsNestedImpl<N> extends PersistentVolumeFluentImpl<PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PersistentVolumeAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeAttributeRestrictionsNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeAttributeRestrictionsNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPersistentVolumeAttributeRestrictions(builder.build());
    }
    public N endPersistentVolumeAttributeRestrictions(){
            return and();
    }

}
    public class PersistentVolumeClaimAttributeRestrictionsNestedImpl<N> extends PersistentVolumeClaimFluentImpl<PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<N>> implements PolicyRuleFluent.PersistentVolumeClaimAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimAttributeRestrictionsNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimAttributeRestrictionsNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withPersistentVolumeClaimAttributeRestrictions(builder.build());
    }
    public N endPersistentVolumeClaimAttributeRestrictions(){
            return and();
    }

}
    public class EventsEventAttributeRestrictionsNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<PolicyRuleFluent.EventsEventAttributeRestrictionsNested<N>> implements PolicyRuleFluent.EventsEventAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventAttributeRestrictionsNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventAttributeRestrictionsNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withEventAttributeRestrictions(builder.build());
    }
    public N endEventsEventAttributeRestrictions(){
            return and();
    }

}
    public class StatefulSetAttributeRestrictionsNestedImpl<N> extends StatefulSetFluentImpl<PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<N>> implements PolicyRuleFluent.StatefulSetAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetAttributeRestrictionsNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetAttributeRestrictionsNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withStatefulSetAttributeRestrictions(builder.build());
    }
    public N endStatefulSetAttributeRestrictions(){
            return and();
    }

}
    public class OpenshiftClusterRoleAttributeRestrictionsNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<N>> implements PolicyRuleFluent.OpenshiftClusterRoleAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleAttributeRestrictionsNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleAttributeRestrictionsNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withOpenshiftClusterRoleAttributeRestrictions(builder.build());
    }
    public N endOpenshiftClusterRoleAttributeRestrictions(){
            return and();
    }

}
    public class RoleAttributeRestrictionsNestedImpl<N> extends RoleFluentImpl<PolicyRuleFluent.RoleAttributeRestrictionsNested<N>> implements PolicyRuleFluent.RoleAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleAttributeRestrictionsNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleAttributeRestrictionsNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withRoleAttributeRestrictions(builder.build());
    }
    public N endRoleAttributeRestrictions(){
            return and();
    }

}
    public class UserAttributeRestrictionsNestedImpl<N> extends UserFluentImpl<PolicyRuleFluent.UserAttributeRestrictionsNested<N>> implements PolicyRuleFluent.UserAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserAttributeRestrictionsNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserAttributeRestrictionsNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withUserAttributeRestrictions(builder.build());
    }
    public N endUserAttributeRestrictions(){
            return and();
    }

}
    public class ComponentStatusAttributeRestrictionsNestedImpl<N> extends ComponentStatusFluentImpl<PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ComponentStatusAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
    
            ComponentStatusAttributeRestrictionsNestedImpl(ComponentStatus item){
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusAttributeRestrictionsNestedImpl(){
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withComponentStatusAttributeRestrictions(builder.build());
    }
    public N endComponentStatusAttributeRestrictions(){
            return and();
    }

}
    public class TokenReviewAttributeRestrictionsNestedImpl<N> extends TokenReviewFluentImpl<PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<N>> implements PolicyRuleFluent.TokenReviewAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewAttributeRestrictionsNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewAttributeRestrictionsNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withTokenReviewAttributeRestrictions(builder.build());
    }
    public N endTokenReviewAttributeRestrictions(){
            return and();
    }

}
    public class BindingAttributeRestrictionsNestedImpl<N> extends BindingFluentImpl<PolicyRuleFluent.BindingAttributeRestrictionsNested<N>> implements PolicyRuleFluent.BindingAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingAttributeRestrictionsNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingAttributeRestrictionsNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withBindingAttributeRestrictions(builder.build());
    }
    public N endBindingAttributeRestrictions(){
            return and();
    }

}
    public class SecretAttributeRestrictionsNestedImpl<N> extends SecretFluentImpl<PolicyRuleFluent.SecretAttributeRestrictionsNested<N>> implements PolicyRuleFluent.SecretAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretAttributeRestrictionsNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretAttributeRestrictionsNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withSecretAttributeRestrictions(builder.build());
    }
    public N endSecretAttributeRestrictions(){
            return and();
    }

}
    public class SecurityContextConstraintsAttributeRestrictionsNestedImpl<N> extends SecurityContextConstraintsFluentImpl<PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<N>> implements PolicyRuleFluent.SecurityContextConstraintsAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsAttributeRestrictionsNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsAttributeRestrictionsNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withSecurityContextConstraintsAttributeRestrictions(builder.build());
    }
    public N endSecurityContextConstraintsAttributeRestrictions(){
            return and();
    }

}
    public class NetNamespaceAttributeRestrictionsNestedImpl<N> extends NetNamespaceFluentImpl<PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<N>> implements PolicyRuleFluent.NetNamespaceAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNamespaceAttributeRestrictionsNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceAttributeRestrictionsNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withNetNamespaceAttributeRestrictions(builder.build());
    }
    public N endNetNamespaceAttributeRestrictions(){
            return and();
    }

}
    public class NodeAttributeRestrictionsNestedImpl<N> extends NodeFluentImpl<PolicyRuleFluent.NodeAttributeRestrictionsNested<N>> implements PolicyRuleFluent.NodeAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeAttributeRestrictionsNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeAttributeRestrictionsNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withNodeAttributeRestrictions(builder.build());
    }
    public N endNodeAttributeRestrictions(){
            return and();
    }

}
    public class JobAttributeRestrictionsNestedImpl<N> extends JobFluentImpl<PolicyRuleFluent.JobAttributeRestrictionsNested<N>> implements PolicyRuleFluent.JobAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobAttributeRestrictionsNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobAttributeRestrictionsNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withJobAttributeRestrictions(builder.build());
    }
    public N endJobAttributeRestrictions(){
            return and();
    }

}
    public class CertificateSigningRequestAttributeRestrictionsNestedImpl<N> extends CertificateSigningRequestFluentImpl<PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<N>> implements PolicyRuleFluent.CertificateSigningRequestAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestAttributeRestrictionsNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestAttributeRestrictionsNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withCertificateSigningRequestAttributeRestrictions(builder.build());
    }
    public N endCertificateSigningRequestAttributeRestrictions(){
            return and();
    }

}
    public class ServiceAccountAttributeRestrictionsNestedImpl<N> extends ServiceAccountFluentImpl<PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<N>> implements PolicyRuleFluent.ServiceAccountAttributeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountAttributeRestrictionsNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountAttributeRestrictionsNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) PolicyRuleFluentImpl.this.withServiceAccountAttributeRestrictions(builder.build());
    }
    public N endServiceAccountAttributeRestrictions(){
            return and();
    }

}


}
