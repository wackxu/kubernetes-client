package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
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

public class NamedExtensionFluentImpl<A extends NamedExtensionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamedExtensionFluent<A>{

    private VisitableBuilder<? extends HasMetadata,?> extension;
    private String name;

    public NamedExtensionFluentImpl(){
    }
    public NamedExtensionFluentImpl(NamedExtension instance){
            this.withExtension(instance.getExtension()); 
            this.withName(instance.getName()); 
    }

    
/**
 * This method has been deprecated, please use method buildExtension instead.
 * @return The buildable object.
 */
@Deprecated public HasMetadata getExtension(){
            return this.extension!=null?this.extension.build():null;
    }

    public HasMetadata buildExtension(){
            return this.extension!=null?this.extension.build():null;
    }

    public A withExtension(HasMetadata extension){
            if (extension instanceof ValidatingWebhookConfiguration){ this.extension= new ValidatingWebhookConfigurationBuilder((ValidatingWebhookConfiguration)extension); _visitables.add(this.extension);}
            if (extension instanceof StorageClass){ this.extension= new StorageClassBuilder((StorageClass)extension); _visitables.add(this.extension);}
            if (extension instanceof ClusterRoleBinding){ this.extension= new ClusterRoleBindingBuilder((ClusterRoleBinding)extension); _visitables.add(this.extension);}
            if (extension instanceof OpenshiftRoleBinding){ this.extension= new OpenshiftRoleBindingBuilder((OpenshiftRoleBinding)extension); _visitables.add(this.extension);}
            if (extension instanceof PodDisruptionBudget){ this.extension= new PodDisruptionBudgetBuilder((PodDisruptionBudget)extension); _visitables.add(this.extension);}
            if (extension instanceof NetworkPolicy){ this.extension= new NetworkPolicyBuilder((NetworkPolicy)extension); _visitables.add(this.extension);}
            if (extension instanceof OpenshiftClusterRoleBinding){ this.extension= new OpenshiftClusterRoleBindingBuilder((OpenshiftClusterRoleBinding)extension); _visitables.add(this.extension);}
            if (extension instanceof Route){ this.extension= new RouteBuilder((Route)extension); _visitables.add(this.extension);}
            if (extension instanceof Namespace){ this.extension= new NamespaceBuilder((Namespace)extension); _visitables.add(this.extension);}
            if (extension instanceof LocalSubjectAccessReview){ this.extension= new LocalSubjectAccessReviewBuilder((LocalSubjectAccessReview)extension); _visitables.add(this.extension);}
            if (extension instanceof Service){ this.extension= new ServiceBuilder((Service)extension); _visitables.add(this.extension);}
            if (extension instanceof ReplicationController){ this.extension= new ReplicationControllerBuilder((ReplicationController)extension); _visitables.add(this.extension);}
            if (extension instanceof SubjectAccessReview){ this.extension= new SubjectAccessReviewBuilder((SubjectAccessReview)extension); _visitables.add(this.extension);}
            if (extension instanceof MutatingWebhookConfiguration){ this.extension= new MutatingWebhookConfigurationBuilder((MutatingWebhookConfiguration)extension); _visitables.add(this.extension);}
            if (extension instanceof HorizontalPodAutoscaler){ this.extension= new HorizontalPodAutoscalerBuilder((HorizontalPodAutoscaler)extension); _visitables.add(this.extension);}
            if (extension instanceof Scale){ this.extension= new ScaleBuilder((Scale)extension); _visitables.add(this.extension);}
            if (extension instanceof Image){ this.extension= new ImageBuilder((Image)extension); _visitables.add(this.extension);}
            if (extension instanceof ReplicaSet){ this.extension= new ReplicaSetBuilder((ReplicaSet)extension); _visitables.add(this.extension);}
            if (extension instanceof PodSecurityPolicy){ this.extension= new PodSecurityPolicyBuilder((PodSecurityPolicy)extension); _visitables.add(this.extension);}
            if (extension instanceof CronJob){ this.extension= new CronJobBuilder((CronJob)extension); _visitables.add(this.extension);}
            if (extension instanceof Endpoints){ this.extension= new EndpointsBuilder((Endpoints)extension); _visitables.add(this.extension);}
            if (extension instanceof Pod){ this.extension= new PodBuilder((Pod)extension); _visitables.add(this.extension);}
            if (extension instanceof ConfigMap){ this.extension= new ConfigMapBuilder((ConfigMap)extension); _visitables.add(this.extension);}
            if (extension instanceof CustomResourceDefinition){ this.extension= new CustomResourceDefinitionBuilder((CustomResourceDefinition)extension); _visitables.add(this.extension);}
            if (extension instanceof Build){ this.extension= new BuildBuilder((Build)extension); _visitables.add(this.extension);}
            if (extension instanceof ImageStreamTag){ this.extension= new ImageStreamTagBuilder((ImageStreamTag)extension); _visitables.add(this.extension);}
            if (extension instanceof Group){ this.extension= new GroupBuilder((Group)extension); _visitables.add(this.extension);}
            if (extension instanceof ImageSignature){ this.extension= new ImageSignatureBuilder((ImageSignature)extension); _visitables.add(this.extension);}
            if (extension instanceof ResourceQuota){ this.extension= new ResourceQuotaBuilder((ResourceQuota)extension); _visitables.add(this.extension);}
            if (extension instanceof BuildRequest){ this.extension= new BuildRequestBuilder((BuildRequest)extension); _visitables.add(this.extension);}
            if (extension instanceof DaemonSet){ this.extension= new DaemonSetBuilder((DaemonSet)extension); _visitables.add(this.extension);}
            if (extension instanceof ImageStream){ this.extension= new ImageStreamBuilder((ImageStream)extension); _visitables.add(this.extension);}
            if (extension instanceof OpenshiftRole){ this.extension= new OpenshiftRoleBuilder((OpenshiftRole)extension); _visitables.add(this.extension);}
            if (extension instanceof OAuthClient){ this.extension= new OAuthClientBuilder((OAuthClient)extension); _visitables.add(this.extension);}
            if (extension instanceof Identity){ this.extension= new IdentityBuilder((Identity)extension); _visitables.add(this.extension);}
            if (extension instanceof LimitRange){ this.extension= new LimitRangeBuilder((LimitRange)extension); _visitables.add(this.extension);}
            if (extension instanceof ImageStreamImport){ this.extension= new ImageStreamImportBuilder((ImageStreamImport)extension); _visitables.add(this.extension);}
            if (extension instanceof OpenshiftRoleBindingRestriction){ this.extension= new OpenshiftRoleBindingRestrictionBuilder((OpenshiftRoleBindingRestriction)extension); _visitables.add(this.extension);}
            if (extension instanceof RoleBinding){ this.extension= new RoleBindingBuilder((RoleBinding)extension); _visitables.add(this.extension);}
            if (extension instanceof PodPreset){ this.extension= new PodPresetBuilder((PodPreset)extension); _visitables.add(this.extension);}
            if (extension instanceof Project){ this.extension= new ProjectBuilder((Project)extension); _visitables.add(this.extension);}
            if (extension instanceof BuildConfig){ this.extension= new BuildConfigBuilder((BuildConfig)extension); _visitables.add(this.extension);}
            if (extension instanceof ClusterRole){ this.extension= new ClusterRoleBuilder((ClusterRole)extension); _visitables.add(this.extension);}
            if (extension instanceof OAuthAuthorizeToken){ this.extension= new OAuthAuthorizeTokenBuilder((OAuthAuthorizeToken)extension); _visitables.add(this.extension);}
            if (extension instanceof ProjectRequest){ this.extension= new ProjectRequestBuilder((ProjectRequest)extension); _visitables.add(this.extension);}
            if (extension instanceof PriorityClass){ this.extension= new PriorityClassBuilder((PriorityClass)extension); _visitables.add(this.extension);}
            if (extension instanceof Template){ this.extension= new TemplateBuilder((Template)extension); _visitables.add(this.extension);}
            if (extension instanceof OAuthClientAuthorization){ this.extension= new OAuthClientAuthorizationBuilder((OAuthClientAuthorization)extension); _visitables.add(this.extension);}
            if (extension instanceof Deployment){ this.extension= new DeploymentBuilder((Deployment)extension); _visitables.add(this.extension);}
            if (extension instanceof PodTemplate){ this.extension= new PodTemplateBuilder((PodTemplate)extension); _visitables.add(this.extension);}
            if (extension instanceof Event){ this.extension= new EventBuilder((Event)extension); _visitables.add(this.extension);}
            if (extension instanceof Ingress){ this.extension= new IngressBuilder((Ingress)extension); _visitables.add(this.extension);}
            if (extension instanceof DeploymentConfig){ this.extension= new DeploymentConfigBuilder((DeploymentConfig)extension); _visitables.add(this.extension);}
            if (extension instanceof OAuthAccessToken){ this.extension= new OAuthAccessTokenBuilder((OAuthAccessToken)extension); _visitables.add(this.extension);}
            if (extension instanceof PersistentVolume){ this.extension= new PersistentVolumeBuilder((PersistentVolume)extension); _visitables.add(this.extension);}
            if (extension instanceof PersistentVolumeClaim){ this.extension= new PersistentVolumeClaimBuilder((PersistentVolumeClaim)extension); _visitables.add(this.extension);}
            if (extension instanceof io.fabric8.kubernetes.api.model.events.Event){ this.extension= new io.fabric8.kubernetes.api.model.events.EventBuilder((io.fabric8.kubernetes.api.model.events.Event)extension); _visitables.add(this.extension);}
            if (extension instanceof StatefulSet){ this.extension= new StatefulSetBuilder((StatefulSet)extension); _visitables.add(this.extension);}
            if (extension instanceof OpenshiftClusterRole){ this.extension= new OpenshiftClusterRoleBuilder((OpenshiftClusterRole)extension); _visitables.add(this.extension);}
            if (extension instanceof Role){ this.extension= new RoleBuilder((Role)extension); _visitables.add(this.extension);}
            if (extension instanceof User){ this.extension= new UserBuilder((User)extension); _visitables.add(this.extension);}
            if (extension instanceof ComponentStatus){ this.extension= new ComponentStatusBuilder((ComponentStatus)extension); _visitables.add(this.extension);}
            if (extension instanceof TokenReview){ this.extension= new TokenReviewBuilder((TokenReview)extension); _visitables.add(this.extension);}
            if (extension instanceof Binding){ this.extension= new BindingBuilder((Binding)extension); _visitables.add(this.extension);}
            if (extension instanceof Secret){ this.extension= new SecretBuilder((Secret)extension); _visitables.add(this.extension);}
            if (extension instanceof SecurityContextConstraints){ this.extension= new SecurityContextConstraintsBuilder((SecurityContextConstraints)extension); _visitables.add(this.extension);}
            if (extension instanceof NetNamespace){ this.extension= new NetNamespaceBuilder((NetNamespace)extension); _visitables.add(this.extension);}
            if (extension instanceof Node){ this.extension= new NodeBuilder((Node)extension); _visitables.add(this.extension);}
            if (extension instanceof Job){ this.extension= new JobBuilder((Job)extension); _visitables.add(this.extension);}
            if (extension instanceof CertificateSigningRequest){ this.extension= new CertificateSigningRequestBuilder((CertificateSigningRequest)extension); _visitables.add(this.extension);}
            if (extension instanceof ServiceAccount){ this.extension= new ServiceAccountBuilder((ServiceAccount)extension); _visitables.add(this.extension);}
            return (A) this;
    }

    public Boolean hasExtension(){
            return this.extension != null;
    }

    public A withValidatingWebhookConfigurationExtension(ValidatingWebhookConfiguration validatingWebhookConfigurationExtension){
            _visitables.remove(this.extension);
            if (validatingWebhookConfigurationExtension!=null){ this.extension= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfigurationExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<A> withNewValidatingWebhookConfigurationExtension(){
            return new ValidatingWebhookConfigurationExtensionNestedImpl();
    }

    public NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<A> withNewValidatingWebhookConfigurationExtensionLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationExtensionNestedImpl(item);
    }

    public A withStorageClassExtension(StorageClass storageClassExtension){
            _visitables.remove(this.extension);
            if (storageClassExtension!=null){ this.extension= new StorageClassBuilder(storageClassExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.StorageClassExtensionNested<A> withNewStorageClassExtension(){
            return new StorageClassExtensionNestedImpl();
    }

    public NamedExtensionFluent.StorageClassExtensionNested<A> withNewStorageClassExtensionLike(StorageClass item){
            return new StorageClassExtensionNestedImpl(item);
    }

    public A withClusterRoleBindingExtension(ClusterRoleBinding clusterRoleBindingExtension){
            _visitables.remove(this.extension);
            if (clusterRoleBindingExtension!=null){ this.extension= new ClusterRoleBindingBuilder(clusterRoleBindingExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ClusterRoleBindingExtensionNested<A> withNewClusterRoleBindingExtension(){
            return new ClusterRoleBindingExtensionNestedImpl();
    }

    public NamedExtensionFluent.ClusterRoleBindingExtensionNested<A> withNewClusterRoleBindingExtensionLike(ClusterRoleBinding item){
            return new ClusterRoleBindingExtensionNestedImpl(item);
    }

    public A withOpenshiftRoleBindingExtension(OpenshiftRoleBinding openshiftRoleBindingExtension){
            _visitables.remove(this.extension);
            if (openshiftRoleBindingExtension!=null){ this.extension= new OpenshiftRoleBindingBuilder(openshiftRoleBindingExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<A> withNewOpenshiftRoleBindingExtension(){
            return new OpenshiftRoleBindingExtensionNestedImpl();
    }

    public NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<A> withNewOpenshiftRoleBindingExtensionLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingExtensionNestedImpl(item);
    }

    public A withPodDisruptionBudgetExtension(PodDisruptionBudget podDisruptionBudgetExtension){
            _visitables.remove(this.extension);
            if (podDisruptionBudgetExtension!=null){ this.extension= new PodDisruptionBudgetBuilder(podDisruptionBudgetExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PodDisruptionBudgetExtensionNested<A> withNewPodDisruptionBudgetExtension(){
            return new PodDisruptionBudgetExtensionNestedImpl();
    }

    public NamedExtensionFluent.PodDisruptionBudgetExtensionNested<A> withNewPodDisruptionBudgetExtensionLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetExtensionNestedImpl(item);
    }

    public A withNetworkPolicyExtension(NetworkPolicy networkPolicyExtension){
            _visitables.remove(this.extension);
            if (networkPolicyExtension!=null){ this.extension= new NetworkPolicyBuilder(networkPolicyExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.NetworkPolicyExtensionNested<A> withNewNetworkPolicyExtension(){
            return new NetworkPolicyExtensionNestedImpl();
    }

    public NamedExtensionFluent.NetworkPolicyExtensionNested<A> withNewNetworkPolicyExtensionLike(NetworkPolicy item){
            return new NetworkPolicyExtensionNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingExtension(OpenshiftClusterRoleBinding openshiftClusterRoleBindingExtension){
            _visitables.remove(this.extension);
            if (openshiftClusterRoleBindingExtension!=null){ this.extension= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBindingExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<A> withNewOpenshiftClusterRoleBindingExtension(){
            return new OpenshiftClusterRoleBindingExtensionNestedImpl();
    }

    public NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<A> withNewOpenshiftClusterRoleBindingExtensionLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingExtensionNestedImpl(item);
    }

    public A withRouteExtension(Route routeExtension){
            _visitables.remove(this.extension);
            if (routeExtension!=null){ this.extension= new RouteBuilder(routeExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.RouteExtensionNested<A> withNewRouteExtension(){
            return new RouteExtensionNestedImpl();
    }

    public NamedExtensionFluent.RouteExtensionNested<A> withNewRouteExtensionLike(Route item){
            return new RouteExtensionNestedImpl(item);
    }

    public A withNamespaceExtension(Namespace namespaceExtension){
            _visitables.remove(this.extension);
            if (namespaceExtension!=null){ this.extension= new NamespaceBuilder(namespaceExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.NamespaceExtensionNested<A> withNewNamespaceExtension(){
            return new NamespaceExtensionNestedImpl();
    }

    public NamedExtensionFluent.NamespaceExtensionNested<A> withNewNamespaceExtensionLike(Namespace item){
            return new NamespaceExtensionNestedImpl(item);
    }

    public A withLocalSubjectAccessReviewExtension(LocalSubjectAccessReview localSubjectAccessReviewExtension){
            _visitables.remove(this.extension);
            if (localSubjectAccessReviewExtension!=null){ this.extension= new LocalSubjectAccessReviewBuilder(localSubjectAccessReviewExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<A> withNewLocalSubjectAccessReviewExtension(){
            return new LocalSubjectAccessReviewExtensionNestedImpl();
    }

    public NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<A> withNewLocalSubjectAccessReviewExtensionLike(LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewExtensionNestedImpl(item);
    }

    public A withServiceExtension(Service serviceExtension){
            _visitables.remove(this.extension);
            if (serviceExtension!=null){ this.extension= new ServiceBuilder(serviceExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ServiceExtensionNested<A> withNewServiceExtension(){
            return new ServiceExtensionNestedImpl();
    }

    public NamedExtensionFluent.ServiceExtensionNested<A> withNewServiceExtensionLike(Service item){
            return new ServiceExtensionNestedImpl(item);
    }

    public A withReplicationControllerExtension(ReplicationController replicationControllerExtension){
            _visitables.remove(this.extension);
            if (replicationControllerExtension!=null){ this.extension= new ReplicationControllerBuilder(replicationControllerExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ReplicationControllerExtensionNested<A> withNewReplicationControllerExtension(){
            return new ReplicationControllerExtensionNestedImpl();
    }

    public NamedExtensionFluent.ReplicationControllerExtensionNested<A> withNewReplicationControllerExtensionLike(ReplicationController item){
            return new ReplicationControllerExtensionNestedImpl(item);
    }

    public A withSubjectAccessReviewExtension(SubjectAccessReview subjectAccessReviewExtension){
            _visitables.remove(this.extension);
            if (subjectAccessReviewExtension!=null){ this.extension= new SubjectAccessReviewBuilder(subjectAccessReviewExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.SubjectAccessReviewExtensionNested<A> withNewSubjectAccessReviewExtension(){
            return new SubjectAccessReviewExtensionNestedImpl();
    }

    public NamedExtensionFluent.SubjectAccessReviewExtensionNested<A> withNewSubjectAccessReviewExtensionLike(SubjectAccessReview item){
            return new SubjectAccessReviewExtensionNestedImpl(item);
    }

    public A withMutatingWebhookConfigurationExtension(MutatingWebhookConfiguration mutatingWebhookConfigurationExtension){
            _visitables.remove(this.extension);
            if (mutatingWebhookConfigurationExtension!=null){ this.extension= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfigurationExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<A> withNewMutatingWebhookConfigurationExtension(){
            return new MutatingWebhookConfigurationExtensionNestedImpl();
    }

    public NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<A> withNewMutatingWebhookConfigurationExtensionLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationExtensionNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerExtension(HorizontalPodAutoscaler horizontalPodAutoscalerExtension){
            _visitables.remove(this.extension);
            if (horizontalPodAutoscalerExtension!=null){ this.extension= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscalerExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<A> withNewHorizontalPodAutoscalerExtension(){
            return new HorizontalPodAutoscalerExtensionNestedImpl();
    }

    public NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<A> withNewHorizontalPodAutoscalerExtensionLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerExtensionNestedImpl(item);
    }

    public A withScaleExtension(Scale scaleExtension){
            _visitables.remove(this.extension);
            if (scaleExtension!=null){ this.extension= new ScaleBuilder(scaleExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ScaleExtensionNested<A> withNewScaleExtension(){
            return new ScaleExtensionNestedImpl();
    }

    public NamedExtensionFluent.ScaleExtensionNested<A> withNewScaleExtensionLike(Scale item){
            return new ScaleExtensionNestedImpl(item);
    }

    public A withImageExtension(Image imageExtension){
            _visitables.remove(this.extension);
            if (imageExtension!=null){ this.extension= new ImageBuilder(imageExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ImageExtensionNested<A> withNewImageExtension(){
            return new ImageExtensionNestedImpl();
    }

    public NamedExtensionFluent.ImageExtensionNested<A> withNewImageExtensionLike(Image item){
            return new ImageExtensionNestedImpl(item);
    }

    public A withReplicaSetExtension(ReplicaSet replicaSetExtension){
            _visitables.remove(this.extension);
            if (replicaSetExtension!=null){ this.extension= new ReplicaSetBuilder(replicaSetExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ReplicaSetExtensionNested<A> withNewReplicaSetExtension(){
            return new ReplicaSetExtensionNestedImpl();
    }

    public NamedExtensionFluent.ReplicaSetExtensionNested<A> withNewReplicaSetExtensionLike(ReplicaSet item){
            return new ReplicaSetExtensionNestedImpl(item);
    }

    public A withPodSecurityPolicyExtension(PodSecurityPolicy podSecurityPolicyExtension){
            _visitables.remove(this.extension);
            if (podSecurityPolicyExtension!=null){ this.extension= new PodSecurityPolicyBuilder(podSecurityPolicyExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PodSecurityPolicyExtensionNested<A> withNewPodSecurityPolicyExtension(){
            return new PodSecurityPolicyExtensionNestedImpl();
    }

    public NamedExtensionFluent.PodSecurityPolicyExtensionNested<A> withNewPodSecurityPolicyExtensionLike(PodSecurityPolicy item){
            return new PodSecurityPolicyExtensionNestedImpl(item);
    }

    public A withCronJobExtension(CronJob cronJobExtension){
            _visitables.remove(this.extension);
            if (cronJobExtension!=null){ this.extension= new CronJobBuilder(cronJobExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.CronJobExtensionNested<A> withNewCronJobExtension(){
            return new CronJobExtensionNestedImpl();
    }

    public NamedExtensionFluent.CronJobExtensionNested<A> withNewCronJobExtensionLike(CronJob item){
            return new CronJobExtensionNestedImpl(item);
    }

    public A withEndpointsExtension(Endpoints endpointsExtension){
            _visitables.remove(this.extension);
            if (endpointsExtension!=null){ this.extension= new EndpointsBuilder(endpointsExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.EndpointsExtensionNested<A> withNewEndpointsExtension(){
            return new EndpointsExtensionNestedImpl();
    }

    public NamedExtensionFluent.EndpointsExtensionNested<A> withNewEndpointsExtensionLike(Endpoints item){
            return new EndpointsExtensionNestedImpl(item);
    }

    public A withPodExtension(Pod podExtension){
            _visitables.remove(this.extension);
            if (podExtension!=null){ this.extension= new PodBuilder(podExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PodExtensionNested<A> withNewPodExtension(){
            return new PodExtensionNestedImpl();
    }

    public NamedExtensionFluent.PodExtensionNested<A> withNewPodExtensionLike(Pod item){
            return new PodExtensionNestedImpl(item);
    }

    public A withConfigMapExtension(ConfigMap configMapExtension){
            _visitables.remove(this.extension);
            if (configMapExtension!=null){ this.extension= new ConfigMapBuilder(configMapExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ConfigMapExtensionNested<A> withNewConfigMapExtension(){
            return new ConfigMapExtensionNestedImpl();
    }

    public NamedExtensionFluent.ConfigMapExtensionNested<A> withNewConfigMapExtensionLike(ConfigMap item){
            return new ConfigMapExtensionNestedImpl(item);
    }

    public A withCustomResourceDefinitionExtension(CustomResourceDefinition customResourceDefinitionExtension){
            _visitables.remove(this.extension);
            if (customResourceDefinitionExtension!=null){ this.extension= new CustomResourceDefinitionBuilder(customResourceDefinitionExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.CustomResourceDefinitionExtensionNested<A> withNewCustomResourceDefinitionExtension(){
            return new CustomResourceDefinitionExtensionNestedImpl();
    }

    public NamedExtensionFluent.CustomResourceDefinitionExtensionNested<A> withNewCustomResourceDefinitionExtensionLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionExtensionNestedImpl(item);
    }

    public A withBuildExtension(Build buildExtension){
            _visitables.remove(this.extension);
            if (buildExtension!=null){ this.extension= new BuildBuilder(buildExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.BuildExtensionNested<A> withNewBuildExtension(){
            return new BuildExtensionNestedImpl();
    }

    public NamedExtensionFluent.BuildExtensionNested<A> withNewBuildExtensionLike(Build item){
            return new BuildExtensionNestedImpl(item);
    }

    public A withImageStreamTagExtension(ImageStreamTag imageStreamTagExtension){
            _visitables.remove(this.extension);
            if (imageStreamTagExtension!=null){ this.extension= new ImageStreamTagBuilder(imageStreamTagExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ImageStreamTagExtensionNested<A> withNewImageStreamTagExtension(){
            return new ImageStreamTagExtensionNestedImpl();
    }

    public NamedExtensionFluent.ImageStreamTagExtensionNested<A> withNewImageStreamTagExtensionLike(ImageStreamTag item){
            return new ImageStreamTagExtensionNestedImpl(item);
    }

    public A withGroupExtension(Group groupExtension){
            _visitables.remove(this.extension);
            if (groupExtension!=null){ this.extension= new GroupBuilder(groupExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.GroupExtensionNested<A> withNewGroupExtension(){
            return new GroupExtensionNestedImpl();
    }

    public NamedExtensionFluent.GroupExtensionNested<A> withNewGroupExtensionLike(Group item){
            return new GroupExtensionNestedImpl(item);
    }

    public A withImageSignatureExtension(ImageSignature imageSignatureExtension){
            _visitables.remove(this.extension);
            if (imageSignatureExtension!=null){ this.extension= new ImageSignatureBuilder(imageSignatureExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ImageSignatureExtensionNested<A> withNewImageSignatureExtension(){
            return new ImageSignatureExtensionNestedImpl();
    }

    public NamedExtensionFluent.ImageSignatureExtensionNested<A> withNewImageSignatureExtensionLike(ImageSignature item){
            return new ImageSignatureExtensionNestedImpl(item);
    }

    public A withResourceQuotaExtension(ResourceQuota resourceQuotaExtension){
            _visitables.remove(this.extension);
            if (resourceQuotaExtension!=null){ this.extension= new ResourceQuotaBuilder(resourceQuotaExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ResourceQuotaExtensionNested<A> withNewResourceQuotaExtension(){
            return new ResourceQuotaExtensionNestedImpl();
    }

    public NamedExtensionFluent.ResourceQuotaExtensionNested<A> withNewResourceQuotaExtensionLike(ResourceQuota item){
            return new ResourceQuotaExtensionNestedImpl(item);
    }

    public A withBuildRequestExtension(BuildRequest buildRequestExtension){
            _visitables.remove(this.extension);
            if (buildRequestExtension!=null){ this.extension= new BuildRequestBuilder(buildRequestExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.BuildRequestExtensionNested<A> withNewBuildRequestExtension(){
            return new BuildRequestExtensionNestedImpl();
    }

    public NamedExtensionFluent.BuildRequestExtensionNested<A> withNewBuildRequestExtensionLike(BuildRequest item){
            return new BuildRequestExtensionNestedImpl(item);
    }

    public A withDaemonSetExtension(DaemonSet daemonSetExtension){
            _visitables.remove(this.extension);
            if (daemonSetExtension!=null){ this.extension= new DaemonSetBuilder(daemonSetExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.DaemonSetExtensionNested<A> withNewDaemonSetExtension(){
            return new DaemonSetExtensionNestedImpl();
    }

    public NamedExtensionFluent.DaemonSetExtensionNested<A> withNewDaemonSetExtensionLike(DaemonSet item){
            return new DaemonSetExtensionNestedImpl(item);
    }

    public A withImageStreamExtension(ImageStream imageStreamExtension){
            _visitables.remove(this.extension);
            if (imageStreamExtension!=null){ this.extension= new ImageStreamBuilder(imageStreamExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ImageStreamExtensionNested<A> withNewImageStreamExtension(){
            return new ImageStreamExtensionNestedImpl();
    }

    public NamedExtensionFluent.ImageStreamExtensionNested<A> withNewImageStreamExtensionLike(ImageStream item){
            return new ImageStreamExtensionNestedImpl(item);
    }

    public A withOpenshiftRoleExtension(OpenshiftRole openshiftRoleExtension){
            _visitables.remove(this.extension);
            if (openshiftRoleExtension!=null){ this.extension= new OpenshiftRoleBuilder(openshiftRoleExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OpenshiftRoleExtensionNested<A> withNewOpenshiftRoleExtension(){
            return new OpenshiftRoleExtensionNestedImpl();
    }

    public NamedExtensionFluent.OpenshiftRoleExtensionNested<A> withNewOpenshiftRoleExtensionLike(OpenshiftRole item){
            return new OpenshiftRoleExtensionNestedImpl(item);
    }

    public A withOAuthClientExtension(OAuthClient oAuthClientExtension){
            _visitables.remove(this.extension);
            if (oAuthClientExtension!=null){ this.extension= new OAuthClientBuilder(oAuthClientExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OAuthClientExtensionNested<A> withNewOAuthClientExtension(){
            return new OAuthClientExtensionNestedImpl();
    }

    public NamedExtensionFluent.OAuthClientExtensionNested<A> withNewOAuthClientExtensionLike(OAuthClient item){
            return new OAuthClientExtensionNestedImpl(item);
    }

    public A withIdentityExtension(Identity identityExtension){
            _visitables.remove(this.extension);
            if (identityExtension!=null){ this.extension= new IdentityBuilder(identityExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.IdentityExtensionNested<A> withNewIdentityExtension(){
            return new IdentityExtensionNestedImpl();
    }

    public NamedExtensionFluent.IdentityExtensionNested<A> withNewIdentityExtensionLike(Identity item){
            return new IdentityExtensionNestedImpl(item);
    }

    public A withLimitRangeExtension(LimitRange limitRangeExtension){
            _visitables.remove(this.extension);
            if (limitRangeExtension!=null){ this.extension= new LimitRangeBuilder(limitRangeExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.LimitRangeExtensionNested<A> withNewLimitRangeExtension(){
            return new LimitRangeExtensionNestedImpl();
    }

    public NamedExtensionFluent.LimitRangeExtensionNested<A> withNewLimitRangeExtensionLike(LimitRange item){
            return new LimitRangeExtensionNestedImpl(item);
    }

    public A withImageStreamImportExtension(ImageStreamImport imageStreamImportExtension){
            _visitables.remove(this.extension);
            if (imageStreamImportExtension!=null){ this.extension= new ImageStreamImportBuilder(imageStreamImportExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ImageStreamImportExtensionNested<A> withNewImageStreamImportExtension(){
            return new ImageStreamImportExtensionNestedImpl();
    }

    public NamedExtensionFluent.ImageStreamImportExtensionNested<A> withNewImageStreamImportExtensionLike(ImageStreamImport item){
            return new ImageStreamImportExtensionNestedImpl(item);
    }

    public A withOpenshiftRoleBindingRestrictionExtension(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionExtension){
            _visitables.remove(this.extension);
            if (openshiftRoleBindingRestrictionExtension!=null){ this.extension= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestrictionExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<A> withNewOpenshiftRoleBindingRestrictionExtension(){
            return new OpenshiftRoleBindingRestrictionExtensionNestedImpl();
    }

    public NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<A> withNewOpenshiftRoleBindingRestrictionExtensionLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionExtensionNestedImpl(item);
    }

    public A withRoleBindingExtension(RoleBinding roleBindingExtension){
            _visitables.remove(this.extension);
            if (roleBindingExtension!=null){ this.extension= new RoleBindingBuilder(roleBindingExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.RoleBindingExtensionNested<A> withNewRoleBindingExtension(){
            return new RoleBindingExtensionNestedImpl();
    }

    public NamedExtensionFluent.RoleBindingExtensionNested<A> withNewRoleBindingExtensionLike(RoleBinding item){
            return new RoleBindingExtensionNestedImpl(item);
    }

    public A withPodPresetExtension(PodPreset podPresetExtension){
            _visitables.remove(this.extension);
            if (podPresetExtension!=null){ this.extension= new PodPresetBuilder(podPresetExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PodPresetExtensionNested<A> withNewPodPresetExtension(){
            return new PodPresetExtensionNestedImpl();
    }

    public NamedExtensionFluent.PodPresetExtensionNested<A> withNewPodPresetExtensionLike(PodPreset item){
            return new PodPresetExtensionNestedImpl(item);
    }

    public A withProjectExtension(Project projectExtension){
            _visitables.remove(this.extension);
            if (projectExtension!=null){ this.extension= new ProjectBuilder(projectExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ProjectExtensionNested<A> withNewProjectExtension(){
            return new ProjectExtensionNestedImpl();
    }

    public NamedExtensionFluent.ProjectExtensionNested<A> withNewProjectExtensionLike(Project item){
            return new ProjectExtensionNestedImpl(item);
    }

    public A withBuildConfigExtension(BuildConfig buildConfigExtension){
            _visitables.remove(this.extension);
            if (buildConfigExtension!=null){ this.extension= new BuildConfigBuilder(buildConfigExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.BuildConfigExtensionNested<A> withNewBuildConfigExtension(){
            return new BuildConfigExtensionNestedImpl();
    }

    public NamedExtensionFluent.BuildConfigExtensionNested<A> withNewBuildConfigExtensionLike(BuildConfig item){
            return new BuildConfigExtensionNestedImpl(item);
    }

    public A withClusterRoleExtension(ClusterRole clusterRoleExtension){
            _visitables.remove(this.extension);
            if (clusterRoleExtension!=null){ this.extension= new ClusterRoleBuilder(clusterRoleExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ClusterRoleExtensionNested<A> withNewClusterRoleExtension(){
            return new ClusterRoleExtensionNestedImpl();
    }

    public NamedExtensionFluent.ClusterRoleExtensionNested<A> withNewClusterRoleExtensionLike(ClusterRole item){
            return new ClusterRoleExtensionNestedImpl(item);
    }

    public A withOAuthAuthorizeTokenExtension(OAuthAuthorizeToken oAuthAuthorizeTokenExtension){
            _visitables.remove(this.extension);
            if (oAuthAuthorizeTokenExtension!=null){ this.extension= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeTokenExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<A> withNewOAuthAuthorizeTokenExtension(){
            return new OAuthAuthorizeTokenExtensionNestedImpl();
    }

    public NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<A> withNewOAuthAuthorizeTokenExtensionLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenExtensionNestedImpl(item);
    }

    public A withProjectRequestExtension(ProjectRequest projectRequestExtension){
            _visitables.remove(this.extension);
            if (projectRequestExtension!=null){ this.extension= new ProjectRequestBuilder(projectRequestExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ProjectRequestExtensionNested<A> withNewProjectRequestExtension(){
            return new ProjectRequestExtensionNestedImpl();
    }

    public NamedExtensionFluent.ProjectRequestExtensionNested<A> withNewProjectRequestExtensionLike(ProjectRequest item){
            return new ProjectRequestExtensionNestedImpl(item);
    }

    public A withPriorityClassExtension(PriorityClass priorityClassExtension){
            _visitables.remove(this.extension);
            if (priorityClassExtension!=null){ this.extension= new PriorityClassBuilder(priorityClassExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PriorityClassExtensionNested<A> withNewPriorityClassExtension(){
            return new PriorityClassExtensionNestedImpl();
    }

    public NamedExtensionFluent.PriorityClassExtensionNested<A> withNewPriorityClassExtensionLike(PriorityClass item){
            return new PriorityClassExtensionNestedImpl(item);
    }

    public A withTemplateExtension(Template templateExtension){
            _visitables.remove(this.extension);
            if (templateExtension!=null){ this.extension= new TemplateBuilder(templateExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.TemplateExtensionNested<A> withNewTemplateExtension(){
            return new TemplateExtensionNestedImpl();
    }

    public NamedExtensionFluent.TemplateExtensionNested<A> withNewTemplateExtensionLike(Template item){
            return new TemplateExtensionNestedImpl(item);
    }

    public A withOAuthClientAuthorizationExtension(OAuthClientAuthorization oAuthClientAuthorizationExtension){
            _visitables.remove(this.extension);
            if (oAuthClientAuthorizationExtension!=null){ this.extension= new OAuthClientAuthorizationBuilder(oAuthClientAuthorizationExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<A> withNewOAuthClientAuthorizationExtension(){
            return new OAuthClientAuthorizationExtensionNestedImpl();
    }

    public NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<A> withNewOAuthClientAuthorizationExtensionLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationExtensionNestedImpl(item);
    }

    public A withDeploymentExtension(Deployment deploymentExtension){
            _visitables.remove(this.extension);
            if (deploymentExtension!=null){ this.extension= new DeploymentBuilder(deploymentExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.DeploymentExtensionNested<A> withNewDeploymentExtension(){
            return new DeploymentExtensionNestedImpl();
    }

    public NamedExtensionFluent.DeploymentExtensionNested<A> withNewDeploymentExtensionLike(Deployment item){
            return new DeploymentExtensionNestedImpl(item);
    }

    public A withPodTemplateExtension(PodTemplate podTemplateExtension){
            _visitables.remove(this.extension);
            if (podTemplateExtension!=null){ this.extension= new PodTemplateBuilder(podTemplateExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PodTemplateExtensionNested<A> withNewPodTemplateExtension(){
            return new PodTemplateExtensionNestedImpl();
    }

    public NamedExtensionFluent.PodTemplateExtensionNested<A> withNewPodTemplateExtensionLike(PodTemplate item){
            return new PodTemplateExtensionNestedImpl(item);
    }

    public A withEventExtension(Event eventExtension){
            _visitables.remove(this.extension);
            if (eventExtension!=null){ this.extension= new EventBuilder(eventExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.EventExtensionNested<A> withNewEventExtension(){
            return new EventExtensionNestedImpl();
    }

    public NamedExtensionFluent.EventExtensionNested<A> withNewEventExtensionLike(Event item){
            return new EventExtensionNestedImpl(item);
    }

    public A withIngressExtension(Ingress ingressExtension){
            _visitables.remove(this.extension);
            if (ingressExtension!=null){ this.extension= new IngressBuilder(ingressExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.IngressExtensionNested<A> withNewIngressExtension(){
            return new IngressExtensionNestedImpl();
    }

    public NamedExtensionFluent.IngressExtensionNested<A> withNewIngressExtensionLike(Ingress item){
            return new IngressExtensionNestedImpl(item);
    }

    public A withDeploymentConfigExtension(DeploymentConfig deploymentConfigExtension){
            _visitables.remove(this.extension);
            if (deploymentConfigExtension!=null){ this.extension= new DeploymentConfigBuilder(deploymentConfigExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.DeploymentConfigExtensionNested<A> withNewDeploymentConfigExtension(){
            return new DeploymentConfigExtensionNestedImpl();
    }

    public NamedExtensionFluent.DeploymentConfigExtensionNested<A> withNewDeploymentConfigExtensionLike(DeploymentConfig item){
            return new DeploymentConfigExtensionNestedImpl(item);
    }

    public A withOAuthAccessTokenExtension(OAuthAccessToken oAuthAccessTokenExtension){
            _visitables.remove(this.extension);
            if (oAuthAccessTokenExtension!=null){ this.extension= new OAuthAccessTokenBuilder(oAuthAccessTokenExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OAuthAccessTokenExtensionNested<A> withNewOAuthAccessTokenExtension(){
            return new OAuthAccessTokenExtensionNestedImpl();
    }

    public NamedExtensionFluent.OAuthAccessTokenExtensionNested<A> withNewOAuthAccessTokenExtensionLike(OAuthAccessToken item){
            return new OAuthAccessTokenExtensionNestedImpl(item);
    }

    public A withPersistentVolumeExtension(PersistentVolume persistentVolumeExtension){
            _visitables.remove(this.extension);
            if (persistentVolumeExtension!=null){ this.extension= new PersistentVolumeBuilder(persistentVolumeExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PersistentVolumeExtensionNested<A> withNewPersistentVolumeExtension(){
            return new PersistentVolumeExtensionNestedImpl();
    }

    public NamedExtensionFluent.PersistentVolumeExtensionNested<A> withNewPersistentVolumeExtensionLike(PersistentVolume item){
            return new PersistentVolumeExtensionNestedImpl(item);
    }

    public A withPersistentVolumeClaimExtension(PersistentVolumeClaim persistentVolumeClaimExtension){
            _visitables.remove(this.extension);
            if (persistentVolumeClaimExtension!=null){ this.extension= new PersistentVolumeClaimBuilder(persistentVolumeClaimExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.PersistentVolumeClaimExtensionNested<A> withNewPersistentVolumeClaimExtension(){
            return new PersistentVolumeClaimExtensionNestedImpl();
    }

    public NamedExtensionFluent.PersistentVolumeClaimExtensionNested<A> withNewPersistentVolumeClaimExtensionLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimExtensionNestedImpl(item);
    }

    public A withEventExtension(io.fabric8.kubernetes.api.model.events.Event eventExtension){
            _visitables.remove(this.extension);
            if (eventExtension!=null){ this.extension= new io.fabric8.kubernetes.api.model.events.EventBuilder(eventExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.EventsEventExtensionNested<A> withNewEventsEventExtension(){
            return new EventsEventExtensionNestedImpl();
    }

    public NamedExtensionFluent.EventsEventExtensionNested<A> withNewEventExtensionLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventExtensionNestedImpl(item);
    }

    public A withStatefulSetExtension(StatefulSet statefulSetExtension){
            _visitables.remove(this.extension);
            if (statefulSetExtension!=null){ this.extension= new StatefulSetBuilder(statefulSetExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.StatefulSetExtensionNested<A> withNewStatefulSetExtension(){
            return new StatefulSetExtensionNestedImpl();
    }

    public NamedExtensionFluent.StatefulSetExtensionNested<A> withNewStatefulSetExtensionLike(StatefulSet item){
            return new StatefulSetExtensionNestedImpl(item);
    }

    public A withOpenshiftClusterRoleExtension(OpenshiftClusterRole openshiftClusterRoleExtension){
            _visitables.remove(this.extension);
            if (openshiftClusterRoleExtension!=null){ this.extension= new OpenshiftClusterRoleBuilder(openshiftClusterRoleExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<A> withNewOpenshiftClusterRoleExtension(){
            return new OpenshiftClusterRoleExtensionNestedImpl();
    }

    public NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<A> withNewOpenshiftClusterRoleExtensionLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleExtensionNestedImpl(item);
    }

    public A withRoleExtension(Role roleExtension){
            _visitables.remove(this.extension);
            if (roleExtension!=null){ this.extension= new RoleBuilder(roleExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.RoleExtensionNested<A> withNewRoleExtension(){
            return new RoleExtensionNestedImpl();
    }

    public NamedExtensionFluent.RoleExtensionNested<A> withNewRoleExtensionLike(Role item){
            return new RoleExtensionNestedImpl(item);
    }

    public A withUserExtension(User userExtension){
            _visitables.remove(this.extension);
            if (userExtension!=null){ this.extension= new UserBuilder(userExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.UserExtensionNested<A> withNewUserExtension(){
            return new UserExtensionNestedImpl();
    }

    public NamedExtensionFluent.UserExtensionNested<A> withNewUserExtensionLike(User item){
            return new UserExtensionNestedImpl(item);
    }

    public A withComponentStatusExtension(ComponentStatus componentStatusExtension){
            _visitables.remove(this.extension);
            if (componentStatusExtension!=null){ this.extension= new ComponentStatusBuilder(componentStatusExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ComponentStatusExtensionNested<A> withNewComponentStatusExtension(){
            return new ComponentStatusExtensionNestedImpl();
    }

    public NamedExtensionFluent.ComponentStatusExtensionNested<A> withNewComponentStatusExtensionLike(ComponentStatus item){
            return new ComponentStatusExtensionNestedImpl(item);
    }

    public A withTokenReviewExtension(TokenReview tokenReviewExtension){
            _visitables.remove(this.extension);
            if (tokenReviewExtension!=null){ this.extension= new TokenReviewBuilder(tokenReviewExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.TokenReviewExtensionNested<A> withNewTokenReviewExtension(){
            return new TokenReviewExtensionNestedImpl();
    }

    public NamedExtensionFluent.TokenReviewExtensionNested<A> withNewTokenReviewExtensionLike(TokenReview item){
            return new TokenReviewExtensionNestedImpl(item);
    }

    public A withBindingExtension(Binding bindingExtension){
            _visitables.remove(this.extension);
            if (bindingExtension!=null){ this.extension= new BindingBuilder(bindingExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.BindingExtensionNested<A> withNewBindingExtension(){
            return new BindingExtensionNestedImpl();
    }

    public NamedExtensionFluent.BindingExtensionNested<A> withNewBindingExtensionLike(Binding item){
            return new BindingExtensionNestedImpl(item);
    }

    public A withSecretExtension(Secret secretExtension){
            _visitables.remove(this.extension);
            if (secretExtension!=null){ this.extension= new SecretBuilder(secretExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.SecretExtensionNested<A> withNewSecretExtension(){
            return new SecretExtensionNestedImpl();
    }

    public NamedExtensionFluent.SecretExtensionNested<A> withNewSecretExtensionLike(Secret item){
            return new SecretExtensionNestedImpl(item);
    }

    public A withSecurityContextConstraintsExtension(SecurityContextConstraints securityContextConstraintsExtension){
            _visitables.remove(this.extension);
            if (securityContextConstraintsExtension!=null){ this.extension= new SecurityContextConstraintsBuilder(securityContextConstraintsExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.SecurityContextConstraintsExtensionNested<A> withNewSecurityContextConstraintsExtension(){
            return new SecurityContextConstraintsExtensionNestedImpl();
    }

    public NamedExtensionFluent.SecurityContextConstraintsExtensionNested<A> withNewSecurityContextConstraintsExtensionLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsExtensionNestedImpl(item);
    }

    public A withNetNamespaceExtension(NetNamespace netNamespaceExtension){
            _visitables.remove(this.extension);
            if (netNamespaceExtension!=null){ this.extension= new NetNamespaceBuilder(netNamespaceExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.NetNamespaceExtensionNested<A> withNewNetNamespaceExtension(){
            return new NetNamespaceExtensionNestedImpl();
    }

    public NamedExtensionFluent.NetNamespaceExtensionNested<A> withNewNetNamespaceExtensionLike(NetNamespace item){
            return new NetNamespaceExtensionNestedImpl(item);
    }

    public A withNodeExtension(Node nodeExtension){
            _visitables.remove(this.extension);
            if (nodeExtension!=null){ this.extension= new NodeBuilder(nodeExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.NodeExtensionNested<A> withNewNodeExtension(){
            return new NodeExtensionNestedImpl();
    }

    public NamedExtensionFluent.NodeExtensionNested<A> withNewNodeExtensionLike(Node item){
            return new NodeExtensionNestedImpl(item);
    }

    public A withJobExtension(Job jobExtension){
            _visitables.remove(this.extension);
            if (jobExtension!=null){ this.extension= new JobBuilder(jobExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.JobExtensionNested<A> withNewJobExtension(){
            return new JobExtensionNestedImpl();
    }

    public NamedExtensionFluent.JobExtensionNested<A> withNewJobExtensionLike(Job item){
            return new JobExtensionNestedImpl(item);
    }

    public A withCertificateSigningRequestExtension(CertificateSigningRequest certificateSigningRequestExtension){
            _visitables.remove(this.extension);
            if (certificateSigningRequestExtension!=null){ this.extension= new CertificateSigningRequestBuilder(certificateSigningRequestExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.CertificateSigningRequestExtensionNested<A> withNewCertificateSigningRequestExtension(){
            return new CertificateSigningRequestExtensionNestedImpl();
    }

    public NamedExtensionFluent.CertificateSigningRequestExtensionNested<A> withNewCertificateSigningRequestExtensionLike(CertificateSigningRequest item){
            return new CertificateSigningRequestExtensionNestedImpl(item);
    }

    public A withServiceAccountExtension(ServiceAccount serviceAccountExtension){
            _visitables.remove(this.extension);
            if (serviceAccountExtension!=null){ this.extension= new ServiceAccountBuilder(serviceAccountExtension); _visitables.add(this.extension);} return (A) this;
    }

    public NamedExtensionFluent.ServiceAccountExtensionNested<A> withNewServiceAccountExtension(){
            return new ServiceAccountExtensionNestedImpl();
    }

    public NamedExtensionFluent.ServiceAccountExtensionNested<A> withNewServiceAccountExtensionLike(ServiceAccount item){
            return new ServiceAccountExtensionNestedImpl(item);
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedExtensionFluentImpl that = (NamedExtensionFluentImpl) o;
            if (extension != null ? !extension.equals(that.extension) :that.extension != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }


    public class ValidatingWebhookConfigurationExtensionNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<N>> implements NamedExtensionFluent.ValidatingWebhookConfigurationExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationExtensionNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationExtensionNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withValidatingWebhookConfigurationExtension(builder.build());
    }
    public N endValidatingWebhookConfigurationExtension(){
            return and();
    }

}
    public class StorageClassExtensionNestedImpl<N> extends StorageClassFluentImpl<NamedExtensionFluent.StorageClassExtensionNested<N>> implements NamedExtensionFluent.StorageClassExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassExtensionNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassExtensionNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withStorageClassExtension(builder.build());
    }
    public N endStorageClassExtension(){
            return and();
    }

}
    public class ClusterRoleBindingExtensionNestedImpl<N> extends ClusterRoleBindingFluentImpl<NamedExtensionFluent.ClusterRoleBindingExtensionNested<N>> implements NamedExtensionFluent.ClusterRoleBindingExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingExtensionNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingExtensionNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withClusterRoleBindingExtension(builder.build());
    }
    public N endClusterRoleBindingExtension(){
            return and();
    }

}
    public class OpenshiftRoleBindingExtensionNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<N>> implements NamedExtensionFluent.OpenshiftRoleBindingExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingExtensionNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingExtensionNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOpenshiftRoleBindingExtension(builder.build());
    }
    public N endOpenshiftRoleBindingExtension(){
            return and();
    }

}
    public class PodDisruptionBudgetExtensionNestedImpl<N> extends PodDisruptionBudgetFluentImpl<NamedExtensionFluent.PodDisruptionBudgetExtensionNested<N>> implements NamedExtensionFluent.PodDisruptionBudgetExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetExtensionNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetExtensionNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPodDisruptionBudgetExtension(builder.build());
    }
    public N endPodDisruptionBudgetExtension(){
            return and();
    }

}
    public class NetworkPolicyExtensionNestedImpl<N> extends NetworkPolicyFluentImpl<NamedExtensionFluent.NetworkPolicyExtensionNested<N>> implements NamedExtensionFluent.NetworkPolicyExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyExtensionNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyExtensionNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withNetworkPolicyExtension(builder.build());
    }
    public N endNetworkPolicyExtension(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingExtensionNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<N>> implements NamedExtensionFluent.OpenshiftClusterRoleBindingExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingExtensionNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingExtensionNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOpenshiftClusterRoleBindingExtension(builder.build());
    }
    public N endOpenshiftClusterRoleBindingExtension(){
            return and();
    }

}
    public class RouteExtensionNestedImpl<N> extends RouteFluentImpl<NamedExtensionFluent.RouteExtensionNested<N>> implements NamedExtensionFluent.RouteExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteExtensionNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteExtensionNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withRouteExtension(builder.build());
    }
    public N endRouteExtension(){
            return and();
    }

}
    public class NamespaceExtensionNestedImpl<N> extends NamespaceFluentImpl<NamedExtensionFluent.NamespaceExtensionNested<N>> implements NamedExtensionFluent.NamespaceExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceExtensionNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceExtensionNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withNamespaceExtension(builder.build());
    }
    public N endNamespaceExtension(){
            return and();
    }

}
    public class LocalSubjectAccessReviewExtensionNestedImpl<N> extends LocalSubjectAccessReviewFluentImpl<NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<N>> implements NamedExtensionFluent.LocalSubjectAccessReviewExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalSubjectAccessReviewBuilder builder;
    
            LocalSubjectAccessReviewExtensionNestedImpl(LocalSubjectAccessReview item){
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewExtensionNestedImpl(){
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withLocalSubjectAccessReviewExtension(builder.build());
    }
    public N endLocalSubjectAccessReviewExtension(){
            return and();
    }

}
    public class ServiceExtensionNestedImpl<N> extends ServiceFluentImpl<NamedExtensionFluent.ServiceExtensionNested<N>> implements NamedExtensionFluent.ServiceExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
    
            ServiceExtensionNestedImpl(Service item){
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceExtensionNestedImpl(){
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withServiceExtension(builder.build());
    }
    public N endServiceExtension(){
            return and();
    }

}
    public class ReplicationControllerExtensionNestedImpl<N> extends ReplicationControllerFluentImpl<NamedExtensionFluent.ReplicationControllerExtensionNested<N>> implements NamedExtensionFluent.ReplicationControllerExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
    
            ReplicationControllerExtensionNestedImpl(ReplicationController item){
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerExtensionNestedImpl(){
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withReplicationControllerExtension(builder.build());
    }
    public N endReplicationControllerExtension(){
            return and();
    }

}
    public class SubjectAccessReviewExtensionNestedImpl<N> extends SubjectAccessReviewFluentImpl<NamedExtensionFluent.SubjectAccessReviewExtensionNested<N>> implements NamedExtensionFluent.SubjectAccessReviewExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewBuilder builder;
    
            SubjectAccessReviewExtensionNestedImpl(SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewExtensionNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withSubjectAccessReviewExtension(builder.build());
    }
    public N endSubjectAccessReviewExtension(){
            return and();
    }

}
    public class MutatingWebhookConfigurationExtensionNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<N>> implements NamedExtensionFluent.MutatingWebhookConfigurationExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationExtensionNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationExtensionNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withMutatingWebhookConfigurationExtension(builder.build());
    }
    public N endMutatingWebhookConfigurationExtension(){
            return and();
    }

}
    public class HorizontalPodAutoscalerExtensionNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<N>> implements NamedExtensionFluent.HorizontalPodAutoscalerExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerExtensionNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerExtensionNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withHorizontalPodAutoscalerExtension(builder.build());
    }
    public N endHorizontalPodAutoscalerExtension(){
            return and();
    }

}
    public class ScaleExtensionNestedImpl<N> extends ScaleFluentImpl<NamedExtensionFluent.ScaleExtensionNested<N>> implements NamedExtensionFluent.ScaleExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleExtensionNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleExtensionNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withScaleExtension(builder.build());
    }
    public N endScaleExtension(){
            return and();
    }

}
    public class ImageExtensionNestedImpl<N> extends ImageFluentImpl<NamedExtensionFluent.ImageExtensionNested<N>> implements NamedExtensionFluent.ImageExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageExtensionNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageExtensionNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withImageExtension(builder.build());
    }
    public N endImageExtension(){
            return and();
    }

}
    public class ReplicaSetExtensionNestedImpl<N> extends ReplicaSetFluentImpl<NamedExtensionFluent.ReplicaSetExtensionNested<N>> implements NamedExtensionFluent.ReplicaSetExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetExtensionNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetExtensionNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withReplicaSetExtension(builder.build());
    }
    public N endReplicaSetExtension(){
            return and();
    }

}
    public class PodSecurityPolicyExtensionNestedImpl<N> extends PodSecurityPolicyFluentImpl<NamedExtensionFluent.PodSecurityPolicyExtensionNested<N>> implements NamedExtensionFluent.PodSecurityPolicyExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyExtensionNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyExtensionNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPodSecurityPolicyExtension(builder.build());
    }
    public N endPodSecurityPolicyExtension(){
            return and();
    }

}
    public class CronJobExtensionNestedImpl<N> extends CronJobFluentImpl<NamedExtensionFluent.CronJobExtensionNested<N>> implements NamedExtensionFluent.CronJobExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobExtensionNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobExtensionNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withCronJobExtension(builder.build());
    }
    public N endCronJobExtension(){
            return and();
    }

}
    public class EndpointsExtensionNestedImpl<N> extends EndpointsFluentImpl<NamedExtensionFluent.EndpointsExtensionNested<N>> implements NamedExtensionFluent.EndpointsExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsExtensionNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsExtensionNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withEndpointsExtension(builder.build());
    }
    public N endEndpointsExtension(){
            return and();
    }

}
    public class PodExtensionNestedImpl<N> extends PodFluentImpl<NamedExtensionFluent.PodExtensionNested<N>> implements NamedExtensionFluent.PodExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
    
            PodExtensionNestedImpl(Pod item){
                    this.builder = new PodBuilder(this, item);
            }
            PodExtensionNestedImpl(){
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPodExtension(builder.build());
    }
    public N endPodExtension(){
            return and();
    }

}
    public class ConfigMapExtensionNestedImpl<N> extends ConfigMapFluentImpl<NamedExtensionFluent.ConfigMapExtensionNested<N>> implements NamedExtensionFluent.ConfigMapExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapExtensionNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapExtensionNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withConfigMapExtension(builder.build());
    }
    public N endConfigMapExtension(){
            return and();
    }

}
    public class CustomResourceDefinitionExtensionNestedImpl<N> extends CustomResourceDefinitionFluentImpl<NamedExtensionFluent.CustomResourceDefinitionExtensionNested<N>> implements NamedExtensionFluent.CustomResourceDefinitionExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionExtensionNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionExtensionNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withCustomResourceDefinitionExtension(builder.build());
    }
    public N endCustomResourceDefinitionExtension(){
            return and();
    }

}
    public class BuildExtensionNestedImpl<N> extends BuildFluentImpl<NamedExtensionFluent.BuildExtensionNested<N>> implements NamedExtensionFluent.BuildExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
    
            BuildExtensionNestedImpl(Build item){
                    this.builder = new BuildBuilder(this, item);
            }
            BuildExtensionNestedImpl(){
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withBuildExtension(builder.build());
    }
    public N endBuildExtension(){
            return and();
    }

}
    public class ImageStreamTagExtensionNestedImpl<N> extends ImageStreamTagFluentImpl<NamedExtensionFluent.ImageStreamTagExtensionNested<N>> implements NamedExtensionFluent.ImageStreamTagExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
    
            ImageStreamTagExtensionNestedImpl(ImageStreamTag item){
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagExtensionNestedImpl(){
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withImageStreamTagExtension(builder.build());
    }
    public N endImageStreamTagExtension(){
            return and();
    }

}
    public class GroupExtensionNestedImpl<N> extends GroupFluentImpl<NamedExtensionFluent.GroupExtensionNested<N>> implements NamedExtensionFluent.GroupExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupExtensionNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupExtensionNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withGroupExtension(builder.build());
    }
    public N endGroupExtension(){
            return and();
    }

}
    public class ImageSignatureExtensionNestedImpl<N> extends ImageSignatureFluentImpl<NamedExtensionFluent.ImageSignatureExtensionNested<N>> implements NamedExtensionFluent.ImageSignatureExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
    
            ImageSignatureExtensionNestedImpl(ImageSignature item){
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureExtensionNestedImpl(){
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withImageSignatureExtension(builder.build());
    }
    public N endImageSignatureExtension(){
            return and();
    }

}
    public class ResourceQuotaExtensionNestedImpl<N> extends ResourceQuotaFluentImpl<NamedExtensionFluent.ResourceQuotaExtensionNested<N>> implements NamedExtensionFluent.ResourceQuotaExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaExtensionNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaExtensionNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withResourceQuotaExtension(builder.build());
    }
    public N endResourceQuotaExtension(){
            return and();
    }

}
    public class BuildRequestExtensionNestedImpl<N> extends BuildRequestFluentImpl<NamedExtensionFluent.BuildRequestExtensionNested<N>> implements NamedExtensionFluent.BuildRequestExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestExtensionNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestExtensionNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withBuildRequestExtension(builder.build());
    }
    public N endBuildRequestExtension(){
            return and();
    }

}
    public class DaemonSetExtensionNestedImpl<N> extends DaemonSetFluentImpl<NamedExtensionFluent.DaemonSetExtensionNested<N>> implements NamedExtensionFluent.DaemonSetExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetExtensionNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetExtensionNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withDaemonSetExtension(builder.build());
    }
    public N endDaemonSetExtension(){
            return and();
    }

}
    public class ImageStreamExtensionNestedImpl<N> extends ImageStreamFluentImpl<NamedExtensionFluent.ImageStreamExtensionNested<N>> implements NamedExtensionFluent.ImageStreamExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImageStreamExtensionNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamExtensionNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withImageStreamExtension(builder.build());
    }
    public N endImageStreamExtension(){
            return and();
    }

}
    public class OpenshiftRoleExtensionNestedImpl<N> extends OpenshiftRoleFluentImpl<NamedExtensionFluent.OpenshiftRoleExtensionNested<N>> implements NamedExtensionFluent.OpenshiftRoleExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleExtensionNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleExtensionNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOpenshiftRoleExtension(builder.build());
    }
    public N endOpenshiftRoleExtension(){
            return and();
    }

}
    public class OAuthClientExtensionNestedImpl<N> extends OAuthClientFluentImpl<NamedExtensionFluent.OAuthClientExtensionNested<N>> implements NamedExtensionFluent.OAuthClientExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientExtensionNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientExtensionNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOAuthClientExtension(builder.build());
    }
    public N endOAuthClientExtension(){
            return and();
    }

}
    public class IdentityExtensionNestedImpl<N> extends IdentityFluentImpl<NamedExtensionFluent.IdentityExtensionNested<N>> implements NamedExtensionFluent.IdentityExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityExtensionNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityExtensionNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withIdentityExtension(builder.build());
    }
    public N endIdentityExtension(){
            return and();
    }

}
    public class LimitRangeExtensionNestedImpl<N> extends LimitRangeFluentImpl<NamedExtensionFluent.LimitRangeExtensionNested<N>> implements NamedExtensionFluent.LimitRangeExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
    
            LimitRangeExtensionNestedImpl(LimitRange item){
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeExtensionNestedImpl(){
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withLimitRangeExtension(builder.build());
    }
    public N endLimitRangeExtension(){
            return and();
    }

}
    public class ImageStreamImportExtensionNestedImpl<N> extends ImageStreamImportFluentImpl<NamedExtensionFluent.ImageStreamImportExtensionNested<N>> implements NamedExtensionFluent.ImageStreamImportExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportExtensionNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportExtensionNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withImageStreamImportExtension(builder.build());
    }
    public N endImageStreamImportExtension(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionExtensionNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<N>> implements NamedExtensionFluent.OpenshiftRoleBindingRestrictionExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionExtensionNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionExtensionNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOpenshiftRoleBindingRestrictionExtension(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionExtension(){
            return and();
    }

}
    public class RoleBindingExtensionNestedImpl<N> extends RoleBindingFluentImpl<NamedExtensionFluent.RoleBindingExtensionNested<N>> implements NamedExtensionFluent.RoleBindingExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingExtensionNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingExtensionNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withRoleBindingExtension(builder.build());
    }
    public N endRoleBindingExtension(){
            return and();
    }

}
    public class PodPresetExtensionNestedImpl<N> extends PodPresetFluentImpl<NamedExtensionFluent.PodPresetExtensionNested<N>> implements NamedExtensionFluent.PodPresetExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetExtensionNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetExtensionNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPodPresetExtension(builder.build());
    }
    public N endPodPresetExtension(){
            return and();
    }

}
    public class ProjectExtensionNestedImpl<N> extends ProjectFluentImpl<NamedExtensionFluent.ProjectExtensionNested<N>> implements NamedExtensionFluent.ProjectExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectExtensionNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectExtensionNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withProjectExtension(builder.build());
    }
    public N endProjectExtension(){
            return and();
    }

}
    public class BuildConfigExtensionNestedImpl<N> extends BuildConfigFluentImpl<NamedExtensionFluent.BuildConfigExtensionNested<N>> implements NamedExtensionFluent.BuildConfigExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
    
            BuildConfigExtensionNestedImpl(BuildConfig item){
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigExtensionNestedImpl(){
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withBuildConfigExtension(builder.build());
    }
    public N endBuildConfigExtension(){
            return and();
    }

}
    public class ClusterRoleExtensionNestedImpl<N> extends ClusterRoleFluentImpl<NamedExtensionFluent.ClusterRoleExtensionNested<N>> implements NamedExtensionFluent.ClusterRoleExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleExtensionNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleExtensionNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withClusterRoleExtension(builder.build());
    }
    public N endClusterRoleExtension(){
            return and();
    }

}
    public class OAuthAuthorizeTokenExtensionNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<N>> implements NamedExtensionFluent.OAuthAuthorizeTokenExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenExtensionNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenExtensionNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOAuthAuthorizeTokenExtension(builder.build());
    }
    public N endOAuthAuthorizeTokenExtension(){
            return and();
    }

}
    public class ProjectRequestExtensionNestedImpl<N> extends ProjectRequestFluentImpl<NamedExtensionFluent.ProjectRequestExtensionNested<N>> implements NamedExtensionFluent.ProjectRequestExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestExtensionNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestExtensionNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withProjectRequestExtension(builder.build());
    }
    public N endProjectRequestExtension(){
            return and();
    }

}
    public class PriorityClassExtensionNestedImpl<N> extends PriorityClassFluentImpl<NamedExtensionFluent.PriorityClassExtensionNested<N>> implements NamedExtensionFluent.PriorityClassExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassExtensionNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassExtensionNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPriorityClassExtension(builder.build());
    }
    public N endPriorityClassExtension(){
            return and();
    }

}
    public class TemplateExtensionNestedImpl<N> extends TemplateFluentImpl<NamedExtensionFluent.TemplateExtensionNested<N>> implements NamedExtensionFluent.TemplateExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateExtensionNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateExtensionNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withTemplateExtension(builder.build());
    }
    public N endTemplateExtension(){
            return and();
    }

}
    public class OAuthClientAuthorizationExtensionNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<N>> implements NamedExtensionFluent.OAuthClientAuthorizationExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationExtensionNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationExtensionNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOAuthClientAuthorizationExtension(builder.build());
    }
    public N endOAuthClientAuthorizationExtension(){
            return and();
    }

}
    public class DeploymentExtensionNestedImpl<N> extends DeploymentFluentImpl<NamedExtensionFluent.DeploymentExtensionNested<N>> implements NamedExtensionFluent.DeploymentExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentExtensionNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentExtensionNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withDeploymentExtension(builder.build());
    }
    public N endDeploymentExtension(){
            return and();
    }

}
    public class PodTemplateExtensionNestedImpl<N> extends PodTemplateFluentImpl<NamedExtensionFluent.PodTemplateExtensionNested<N>> implements NamedExtensionFluent.PodTemplateExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
    
            PodTemplateExtensionNestedImpl(PodTemplate item){
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateExtensionNestedImpl(){
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPodTemplateExtension(builder.build());
    }
    public N endPodTemplateExtension(){
            return and();
    }

}
    public class EventExtensionNestedImpl<N> extends EventFluentImpl<NamedExtensionFluent.EventExtensionNested<N>> implements NamedExtensionFluent.EventExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
    
            EventExtensionNestedImpl(Event item){
                    this.builder = new EventBuilder(this, item);
            }
            EventExtensionNestedImpl(){
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withEventExtension(builder.build());
    }
    public N endEventExtension(){
            return and();
    }

}
    public class IngressExtensionNestedImpl<N> extends IngressFluentImpl<NamedExtensionFluent.IngressExtensionNested<N>> implements NamedExtensionFluent.IngressExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressExtensionNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressExtensionNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withIngressExtension(builder.build());
    }
    public N endIngressExtension(){
            return and();
    }

}
    public class DeploymentConfigExtensionNestedImpl<N> extends DeploymentConfigFluentImpl<NamedExtensionFluent.DeploymentConfigExtensionNested<N>> implements NamedExtensionFluent.DeploymentConfigExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigExtensionNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigExtensionNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withDeploymentConfigExtension(builder.build());
    }
    public N endDeploymentConfigExtension(){
            return and();
    }

}
    public class OAuthAccessTokenExtensionNestedImpl<N> extends OAuthAccessTokenFluentImpl<NamedExtensionFluent.OAuthAccessTokenExtensionNested<N>> implements NamedExtensionFluent.OAuthAccessTokenExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenExtensionNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenExtensionNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOAuthAccessTokenExtension(builder.build());
    }
    public N endOAuthAccessTokenExtension(){
            return and();
    }

}
    public class PersistentVolumeExtensionNestedImpl<N> extends PersistentVolumeFluentImpl<NamedExtensionFluent.PersistentVolumeExtensionNested<N>> implements NamedExtensionFluent.PersistentVolumeExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeExtensionNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeExtensionNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPersistentVolumeExtension(builder.build());
    }
    public N endPersistentVolumeExtension(){
            return and();
    }

}
    public class PersistentVolumeClaimExtensionNestedImpl<N> extends PersistentVolumeClaimFluentImpl<NamedExtensionFluent.PersistentVolumeClaimExtensionNested<N>> implements NamedExtensionFluent.PersistentVolumeClaimExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimExtensionNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimExtensionNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withPersistentVolumeClaimExtension(builder.build());
    }
    public N endPersistentVolumeClaimExtension(){
            return and();
    }

}
    public class EventsEventExtensionNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<NamedExtensionFluent.EventsEventExtensionNested<N>> implements NamedExtensionFluent.EventsEventExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventExtensionNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventExtensionNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withEventExtension(builder.build());
    }
    public N endEventsEventExtension(){
            return and();
    }

}
    public class StatefulSetExtensionNestedImpl<N> extends StatefulSetFluentImpl<NamedExtensionFluent.StatefulSetExtensionNested<N>> implements NamedExtensionFluent.StatefulSetExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetExtensionNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetExtensionNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withStatefulSetExtension(builder.build());
    }
    public N endStatefulSetExtension(){
            return and();
    }

}
    public class OpenshiftClusterRoleExtensionNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<N>> implements NamedExtensionFluent.OpenshiftClusterRoleExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleExtensionNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleExtensionNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withOpenshiftClusterRoleExtension(builder.build());
    }
    public N endOpenshiftClusterRoleExtension(){
            return and();
    }

}
    public class RoleExtensionNestedImpl<N> extends RoleFluentImpl<NamedExtensionFluent.RoleExtensionNested<N>> implements NamedExtensionFluent.RoleExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleExtensionNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleExtensionNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withRoleExtension(builder.build());
    }
    public N endRoleExtension(){
            return and();
    }

}
    public class UserExtensionNestedImpl<N> extends UserFluentImpl<NamedExtensionFluent.UserExtensionNested<N>> implements NamedExtensionFluent.UserExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserExtensionNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserExtensionNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withUserExtension(builder.build());
    }
    public N endUserExtension(){
            return and();
    }

}
    public class ComponentStatusExtensionNestedImpl<N> extends ComponentStatusFluentImpl<NamedExtensionFluent.ComponentStatusExtensionNested<N>> implements NamedExtensionFluent.ComponentStatusExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
    
            ComponentStatusExtensionNestedImpl(ComponentStatus item){
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusExtensionNestedImpl(){
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withComponentStatusExtension(builder.build());
    }
    public N endComponentStatusExtension(){
            return and();
    }

}
    public class TokenReviewExtensionNestedImpl<N> extends TokenReviewFluentImpl<NamedExtensionFluent.TokenReviewExtensionNested<N>> implements NamedExtensionFluent.TokenReviewExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewExtensionNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewExtensionNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withTokenReviewExtension(builder.build());
    }
    public N endTokenReviewExtension(){
            return and();
    }

}
    public class BindingExtensionNestedImpl<N> extends BindingFluentImpl<NamedExtensionFluent.BindingExtensionNested<N>> implements NamedExtensionFluent.BindingExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingExtensionNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingExtensionNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withBindingExtension(builder.build());
    }
    public N endBindingExtension(){
            return and();
    }

}
    public class SecretExtensionNestedImpl<N> extends SecretFluentImpl<NamedExtensionFluent.SecretExtensionNested<N>> implements NamedExtensionFluent.SecretExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretExtensionNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretExtensionNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withSecretExtension(builder.build());
    }
    public N endSecretExtension(){
            return and();
    }

}
    public class SecurityContextConstraintsExtensionNestedImpl<N> extends SecurityContextConstraintsFluentImpl<NamedExtensionFluent.SecurityContextConstraintsExtensionNested<N>> implements NamedExtensionFluent.SecurityContextConstraintsExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsExtensionNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsExtensionNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withSecurityContextConstraintsExtension(builder.build());
    }
    public N endSecurityContextConstraintsExtension(){
            return and();
    }

}
    public class NetNamespaceExtensionNestedImpl<N> extends NetNamespaceFluentImpl<NamedExtensionFluent.NetNamespaceExtensionNested<N>> implements NamedExtensionFluent.NetNamespaceExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNamespaceExtensionNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceExtensionNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withNetNamespaceExtension(builder.build());
    }
    public N endNetNamespaceExtension(){
            return and();
    }

}
    public class NodeExtensionNestedImpl<N> extends NodeFluentImpl<NamedExtensionFluent.NodeExtensionNested<N>> implements NamedExtensionFluent.NodeExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeExtensionNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeExtensionNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withNodeExtension(builder.build());
    }
    public N endNodeExtension(){
            return and();
    }

}
    public class JobExtensionNestedImpl<N> extends JobFluentImpl<NamedExtensionFluent.JobExtensionNested<N>> implements NamedExtensionFluent.JobExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobExtensionNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobExtensionNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withJobExtension(builder.build());
    }
    public N endJobExtension(){
            return and();
    }

}
    public class CertificateSigningRequestExtensionNestedImpl<N> extends CertificateSigningRequestFluentImpl<NamedExtensionFluent.CertificateSigningRequestExtensionNested<N>> implements NamedExtensionFluent.CertificateSigningRequestExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestExtensionNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestExtensionNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withCertificateSigningRequestExtension(builder.build());
    }
    public N endCertificateSigningRequestExtension(){
            return and();
    }

}
    public class ServiceAccountExtensionNestedImpl<N> extends ServiceAccountFluentImpl<NamedExtensionFluent.ServiceAccountExtensionNested<N>> implements NamedExtensionFluent.ServiceAccountExtensionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountExtensionNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountExtensionNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) NamedExtensionFluentImpl.this.withServiceAccountExtension(builder.build());
    }
    public N endServiceAccountExtension(){
            return and();
    }

}


}
