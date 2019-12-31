package io.fabric8.kubernetes.api.model;

import io.fabric8.openshift.api.model.OpenshiftRoleBindingListFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import io.fabric8.openshift.api.model.IdentityList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListBuilder;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.openshift.api.model.BuildRequestFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetList;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestBuilder;
import io.fabric8.openshift.api.model.ProjectList;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.openshift.api.model.OAuthAccessTokenListFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusFluentImpl;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.kubernetes.api.model.admission.AdmissionReview;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsBuilder;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluentImpl;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec;
import io.fabric8.openshift.api.model.TemplateListFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListFluentImpl;
import io.fabric8.kubernetes.api.model.version.Info;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobList;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.kubernetes.api.model.events.EventSeriesFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.rbac.RoleListBuilder;
import io.fabric8.openshift.api.model.RouteListFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusFluentImpl;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluentImpl;
import io.fabric8.openshift.api.model.ImageListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleFluentImpl;
import io.fabric8.kubernetes.api.model.version.InfoBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobListFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.events.EventSeries;
import io.fabric8.kubernetes.api.model.settings.PodPresetListFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenList;
import io.fabric8.openshift.api.model.ImageStreamTagListFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigListBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientListFluentImpl;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.openshift.api.model.ImageStreamListFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecFluentImpl;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList;
import io.fabric8.openshift.api.model.NetNamespaceFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestCondition;
import com.fasterxml.jackson.databind.DeserializationContext;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;
import io.fabric8.openshift.api.model.NetNamespaceListFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListFluentImpl;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListBuilder;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.RouteListBuilder;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.rbac.AggregationRule;
import io.fabric8.openshift.api.model.IdentityFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray;
import io.fabric8.kubernetes.api.model.events.EventBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionFluentImpl;
import io.fabric8.openshift.api.model.UserListFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressListBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListBuilder;
import java.lang.Long;
import io.fabric8.kubernetes.api.model.batch.JobFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListFluentImpl;
import com.fasterxml.jackson.databind.JsonSerializer;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingListBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigList;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.openshift.api.model.UserFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsFluentImpl;
import io.fabric8.openshift.api.model.RouteList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListBuilder;
import java.lang.Boolean;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluentImpl;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListBuilder;
import io.fabric8.openshift.api.model.ImageStreamList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList;
import javax.validation.Valid;
import io.fabric8.openshift.api.model.ProjectRequest;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.admissionregistration.Rule;
import io.fabric8.openshift.api.model.OAuthAccessTokenListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecBuilder;
import io.fabric8.openshift.api.model.TemplateFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigFluentImpl;
import io.fabric8.openshift.api.model.TemplateListBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleFluentImpl;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.openshift.api.model.ImageList;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperations;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.openshift.api.model.TagEvent;
import io.fabric8.openshift.api.model.OAuthClientFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecFluentImpl;
import io.fabric8.kubernetes.api.model.batch.CronJobFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest;
import io.fabric8.kubernetes.api.model.batch.JobListBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetList;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluentImpl;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluentImpl;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListFluentImpl;
import io.fabric8.openshift.api.model.NetNamespaceList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.openshift.api.model.BuildConfigListBuilder;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.DeploymentConfig;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.events.EventSeriesBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleBuilder;
import io.fabric8.kubernetes.api.model.batch.JobList;
import io.fabric8.kubernetes.api.model.batch.CronJobListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionBuilder;
import io.fabric8.openshift.api.model.TagEventFluentImpl;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.openshift.api.model.IdentityListFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.GroupListBuilder;
import io.fabric8.openshift.api.model.GroupList;
import java.lang.Override;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluentImpl;
import io.fabric8.openshift.api.model.BuildListBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.BuildConfigListFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleListFluentImpl;
import io.fabric8.openshift.api.model.ProjectFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec;
import io.fabric8.openshift.api.model.UserList;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListFluentImpl;
import io.fabric8.openshift.api.model.SecurityContextConstraintsList;
import io.fabric8.openshift.api.model.ImageListFluentImpl;
import io.fabric8.openshift.api.model.BuildListFluentImpl;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetList;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassList;
import io.fabric8.openshift.api.model.TagEventBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleListFluentImpl;
import io.fabric8.openshift.api.model.GroupFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.OpenshiftRoleListBuilder;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList;
import io.fabric8.openshift.api.model.NetNamespaceListBuilder;
import io.fabric8.openshift.api.model.ProjectListBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.version.InfoFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.RoleList;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetListBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookBuilder;
import io.fabric8.kubernetes.api.model.batch.JobListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse;
import io.fabric8.openshift.api.model.ProjectListFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.kubernetes.api.model.apps.DeploymentListBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.storage.StorageClassListFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListFluentImpl;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluentImpl;
import io.fabric8.kubernetes.api.model.events.Event;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleList;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseFluentImpl;
import io.fabric8.openshift.api.model.IdentityListBuilder;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.openshift.api.model.RouteFluentImpl;
import io.fabric8.openshift.api.model.ProjectRequestFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportFluentImpl;
import io.fabric8.openshift.api.model.BuildConfigList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientList;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluentImpl;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.openshift.api.model.Identity;
import io.fabric8.openshift.api.model.UserListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentListFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagList;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import com.fasterxml.jackson.core.JsonGenerator;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassList;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluentImpl;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus;
import io.fabric8.kubernetes.api.model.events.EventFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingList;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.GroupListFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.openshift.api.model.ImageStreamListBuilder;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.TemplateList;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.openshift.api.model.BuildList;
import io.fabric8.openshift.api.model.OAuthClientListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamTagListBuilder;

public class KubeSchemaFluentImpl<A extends KubeSchemaFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements KubeSchemaFluent<A>{

    private AdmissionRequestBuilder admissionRequest;
    private AdmissionResponseBuilder admissionResponse;
    private AdmissionReviewBuilder admissionReview;
    private WebhookBuilder admissionWebhook;
    private AggregationRuleBuilder aggregationRule;
    private BaseKubernetesListBuilder baseKubernetesList;
    private BindingBuilder binding;
    private BuildConfigListBuilder buildConfigList;
    private BuildListBuilder buildList;
    private BuildRequestBuilder buildRequest;
    private CertificateSigningRequestBuilder certificateSigningRequest;
    private CertificateSigningRequestConditionBuilder certificateSigningRequestCondition;
    private CertificateSigningRequestListBuilder certificateSigningRequestList;
    private CertificateSigningRequestSpecBuilder certificateSigningRequestSpec;
    private CertificateSigningRequestStatusBuilder certificateSigningRequestStatus;
    private ClusterRoleBuilder clusterRole;
    private ClusterRoleBindingBuilder clusterRoleBinding;
    private ClusterRoleBindingListBuilder clusterRoleBindingList;
    private ClusterRoleListBuilder clusterRoleList;
    private ComponentStatusListBuilder componentStatusList;
    private ConfigBuilder config;
    private ConfigMapBuilder configMap;
    private ConfigMapListBuilder configMapList;
    private ContainerStatusBuilder containerStatus;
    private CronJobBuilder cronJob;
    private CronJobListBuilder cronJobList;
    private CustomResourceDefinitionBuilder customResourceDefinition;
    private CustomResourceDefinitionConditionBuilder customResourceDefinitionCondition;
    private CustomResourceDefinitionListBuilder customResourceDefinitionList;
    private CustomResourceDefinitionNamesBuilder customResourceDefinitionNames;
    private CustomResourceDefinitionSpecBuilder customResourceDefinitionSpec;
    private CustomResourceDefinitionStatusBuilder customResourceDefinitionStatus;
    private DaemonSetBuilder daemonSet;
    private DaemonSetListBuilder daemonSetList;
    private DeleteOptionsBuilder deleteOptions;
    private DeploymentBuilder deployment;
    private DeploymentConfigBuilder deploymentConfig;
    private DeploymentConfigListBuilder deploymentConfigList;
    private DeploymentListBuilder deploymentList;
    private DeploymentRollbackBuilder deploymentRollback;
    private EndpointsBuilder endpoints;
    private EndpointsListBuilder endpointsList;
    private EnvVarBuilder envVar;
    private io.fabric8.kubernetes.api.model.events.EventBuilder event;
    private EventListBuilder eventList;
    private io.fabric8.kubernetes.api.model.events.EventSeriesBuilder eventSeries;
    private String eventSeriesState;
    private GroupBuilder group;
    private GroupListBuilder groupList;
    private HorizontalPodAutoscalerBuilder horizontalPodAutoscaler;
    private HorizontalPodAutoscalerListBuilder horizontalPodAutoscalerList;
    private IdentityBuilder identity;
    private IdentityListBuilder identityList;
    private ImageListBuilder imageList;
    private ImageStreamImportBuilder imageStreamImport;
    private ImageStreamListBuilder imageStreamList;
    private ImageStreamTagListBuilder imageStreamTagList;
    private InfoBuilder info;
    private IngressBuilder ingress;
    private IngressListBuilder ingressList;
    private InitializerBuilder initializer;
    private InitializersBuilder initializers;
    private JSONSchemaPropsOrStringArrayBuilder jSONSchemaPropsorStringArray;
    private JobBuilder job;
    private JobListBuilder jobList;
    private LocalSubjectAccessReviewBuilder k8sLocalSubjectAccessReview;
    private SubjectAccessReviewBuilder k8sSubjectAccessReview;
    private LimitRangeListBuilder limitRangeList;
    private io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder localSubjectAccessReview;
    private MutatingWebhookConfigurationBuilder mutatingWebhookConfiguration;
    private MutatingWebhookConfigurationListBuilder mutatingWebhookConfigurationList;
    private NamespaceBuilder namespace;
    private NamespaceListBuilder namespaceList;
    private NetNamespaceBuilder netNameSpace;
    private NetNamespaceListBuilder netNameSpaceList;
    private NetworkPolicyBuilder networkPolicy;
    private NetworkPolicyListBuilder networkPolicyList;
    private NodeBuilder node;
    private NodeListBuilder nodeList;
    private OAuthAccessTokenBuilder oAuthAccessToken;
    private OAuthAccessTokenListBuilder oAuthAccessTokenList;
    private OAuthAuthorizeTokenBuilder oAuthAuthorizeToken;
    private OAuthAuthorizeTokenListBuilder oAuthAuthorizeTokenList;
    private OAuthClientBuilder oAuthClient;
    private OAuthClientAuthorizationBuilder oAuthClientAuthorization;
    private OAuthClientAuthorizationListBuilder oAuthClientAuthorizationList;
    private OAuthClientListBuilder oAuthClientList;
    private ObjectMetaBuilder objectMeta;
    private OpenshiftClusterRoleBuilder openshiftClusterRole;
    private OpenshiftClusterRoleBindingBuilder openshiftClusterRoleBinding;
    private OpenshiftClusterRoleBindingListBuilder openshiftClusterRoleBindingList;
    private OpenshiftRoleBuilder openshiftRole;
    private OpenshiftRoleBindingBuilder openshiftRoleBinding;
    private OpenshiftRoleBindingListBuilder openshiftRoleBindingList;
    private OpenshiftRoleBindingRestrictionBuilder openshiftRoleBindingRestriction;
    private OpenshiftRoleListBuilder openshiftRoleList;
    private String operation;
    private PatchBuilder patch;
    private String patchType;
    private PersistentVolumeBuilder persistentVolume;
    private PersistentVolumeClaimBuilder persistentVolumeClaim;
    private PersistentVolumeClaimListBuilder persistentVolumeClaimList;
    private PersistentVolumeListBuilder persistentVolumeList;
    private PodDisruptionBudgetBuilder podDisruptionBudget;
    private PodDisruptionBudgetListBuilder podDisruptionBudgetList;
    private PodListBuilder podList;
    private PodPresetBuilder podPreset;
    private PodPresetListBuilder podPresetList;
    private PodPresetSpecBuilder podPresetSpec;
    private PodSecurityPolicyBuilder podSecurityPolicy;
    private PodSecurityPolicyListBuilder podSecurityPolicyList;
    private PodTemplateListBuilder podTemplateList;
    private PriorityClassBuilder priorityClass;
    private PriorityClassListBuilder priorityClassList;
    private ProjectBuilder project;
    private ProjectListBuilder projectList;
    private ProjectRequestBuilder projectRequest;
    private QuantityBuilder quantity;
    private ReplicaSetBuilder replicaSet;
    private ReplicaSetListBuilder replicaSetList;
    private ReplicationControllerListBuilder replicationControllerList;
    private ResourceQuotaBuilder resourceQuota;
    private ResourceQuotaListBuilder resourceQuotaList;
    private RoleBuilder role;
    private RoleBindingBuilder roleBinding;
    private RoleBindingListBuilder roleBindingList;
    private RoleListBuilder roleList;
    private RootPathsBuilder rootPaths;
    private RouteBuilder route;
    private RouteListBuilder routeList;
    private RuleBuilder rule;
    private RuleWithOperationsBuilder ruleWithOperations;
    private ScaleBuilder scale;
    private SecretBuilder secret;
    private SecretListBuilder secretList;
    private SecurityContextConstraintsBuilder securityContextConstraints;
    private SecurityContextConstraintsListBuilder securityContextConstraintsList;
    private ServiceAccountBuilder serviceAccount;
    private ServiceAccountListBuilder serviceAccountList;
    private ServiceListBuilder serviceList;
    private StatefulSetBuilder statefulSet;
    private StatefulSetListBuilder statefulSetList;
    private StatusBuilder status;
    private StorageClassBuilder storageClass;
    private StorageClassListBuilder storageClassList;
    private io.fabric8.openshift.api.model.SubjectAccessReviewBuilder subjectAccessReview;
    private SubjectAccessReviewResponseBuilder subjectAccessReviewResponse;
    private TagEventBuilder tagEvent;
    private TemplateBuilder template;
    private TemplateListBuilder templateList;
    private TokenReviewBuilder tokenReview;
    private TolerationBuilder toleration;
    private TypeMetaBuilder typeMeta;
    private UserBuilder user;
    private UserListBuilder userList;
    private ValidatingWebhookConfigurationBuilder validatingWebhookConfiguration;
    private ValidatingWebhookConfigurationListBuilder validatingWebhookConfigurationList;
    private WatchEventBuilder watchEvent;

    public KubeSchemaFluentImpl(){
    }
    public KubeSchemaFluentImpl(KubeSchema instance){
            this.withAdmissionRequest(instance.getAdmissionRequest()); 
            this.withAdmissionResponse(instance.getAdmissionResponse()); 
            this.withAdmissionReview(instance.getAdmissionReview()); 
            this.withAdmissionWebhook(instance.getAdmissionWebhook()); 
            this.withAggregationRule(instance.getAggregationRule()); 
            this.withBaseKubernetesList(instance.getBaseKubernetesList()); 
            this.withBinding(instance.getBinding()); 
            this.withBuildConfigList(instance.getBuildConfigList()); 
            this.withBuildList(instance.getBuildList()); 
            this.withBuildRequest(instance.getBuildRequest()); 
            this.withCertificateSigningRequest(instance.getCertificateSigningRequest()); 
            this.withCertificateSigningRequestCondition(instance.getCertificateSigningRequestCondition()); 
            this.withCertificateSigningRequestList(instance.getCertificateSigningRequestList()); 
            this.withCertificateSigningRequestSpec(instance.getCertificateSigningRequestSpec()); 
            this.withCertificateSigningRequestStatus(instance.getCertificateSigningRequestStatus()); 
            this.withClusterRole(instance.getClusterRole()); 
            this.withClusterRoleBinding(instance.getClusterRoleBinding()); 
            this.withClusterRoleBindingList(instance.getClusterRoleBindingList()); 
            this.withClusterRoleList(instance.getClusterRoleList()); 
            this.withComponentStatusList(instance.getComponentStatusList()); 
            this.withConfig(instance.getConfig()); 
            this.withConfigMap(instance.getConfigMap()); 
            this.withConfigMapList(instance.getConfigMapList()); 
            this.withContainerStatus(instance.getContainerStatus()); 
            this.withCronJob(instance.getCronJob()); 
            this.withCronJobList(instance.getCronJobList()); 
            this.withCustomResourceDefinition(instance.getCustomResourceDefinition()); 
            this.withCustomResourceDefinitionCondition(instance.getCustomResourceDefinitionCondition()); 
            this.withCustomResourceDefinitionList(instance.getCustomResourceDefinitionList()); 
            this.withCustomResourceDefinitionNames(instance.getCustomResourceDefinitionNames()); 
            this.withCustomResourceDefinitionSpec(instance.getCustomResourceDefinitionSpec()); 
            this.withCustomResourceDefinitionStatus(instance.getCustomResourceDefinitionStatus()); 
            this.withDaemonSet(instance.getDaemonSet()); 
            this.withDaemonSetList(instance.getDaemonSetList()); 
            this.withDeleteOptions(instance.getDeleteOptions()); 
            this.withDeployment(instance.getDeployment()); 
            this.withDeploymentConfig(instance.getDeploymentConfig()); 
            this.withDeploymentConfigList(instance.getDeploymentConfigList()); 
            this.withDeploymentList(instance.getDeploymentList()); 
            this.withDeploymentRollback(instance.getDeploymentRollback()); 
            this.withEndpoints(instance.getEndpoints()); 
            this.withEndpointsList(instance.getEndpointsList()); 
            this.withEnvVar(instance.getEnvVar()); 
            this.withEvent(instance.getEvent()); 
            this.withEventList(instance.getEventList()); 
            this.withEventSeries(instance.getEventSeries()); 
            this.withEventSeriesState(instance.getEventSeriesState()); 
            this.withGroup(instance.getGroup()); 
            this.withGroupList(instance.getGroupList()); 
            this.withHorizontalPodAutoscaler(instance.getHorizontalPodAutoscaler()); 
            this.withHorizontalPodAutoscalerList(instance.getHorizontalPodAutoscalerList()); 
            this.withIdentity(instance.getIdentity()); 
            this.withIdentityList(instance.getIdentityList()); 
            this.withImageList(instance.getImageList()); 
            this.withImageStreamImport(instance.getImageStreamImport()); 
            this.withImageStreamList(instance.getImageStreamList()); 
            this.withImageStreamTagList(instance.getImageStreamTagList()); 
            this.withInfo(instance.getInfo()); 
            this.withIngress(instance.getIngress()); 
            this.withIngressList(instance.getIngressList()); 
            this.withInitializer(instance.getInitializer()); 
            this.withInitializers(instance.getInitializers()); 
            this.withJSONSchemaPropsorStringArray(instance.getJSONSchemaPropsorStringArray()); 
            this.withJob(instance.getJob()); 
            this.withJobList(instance.getJobList()); 
            this.withK8sLocalSubjectAccessReview(instance.getK8sLocalSubjectAccessReview()); 
            this.withK8sSubjectAccessReview(instance.getK8sSubjectAccessReview()); 
            this.withLimitRangeList(instance.getLimitRangeList()); 
            this.withLocalSubjectAccessReview(instance.getLocalSubjectAccessReview()); 
            this.withMutatingWebhookConfiguration(instance.getMutatingWebhookConfiguration()); 
            this.withMutatingWebhookConfigurationList(instance.getMutatingWebhookConfigurationList()); 
            this.withNamespace(instance.getNamespace()); 
            this.withNamespaceList(instance.getNamespaceList()); 
            this.withNetNameSpace(instance.getNetNameSpace()); 
            this.withNetNameSpaceList(instance.getNetNameSpaceList()); 
            this.withNetworkPolicy(instance.getNetworkPolicy()); 
            this.withNetworkPolicyList(instance.getNetworkPolicyList()); 
            this.withNode(instance.getNode()); 
            this.withNodeList(instance.getNodeList()); 
            this.withOAuthAccessToken(instance.getOAuthAccessToken()); 
            this.withOAuthAccessTokenList(instance.getOAuthAccessTokenList()); 
            this.withOAuthAuthorizeToken(instance.getOAuthAuthorizeToken()); 
            this.withOAuthAuthorizeTokenList(instance.getOAuthAuthorizeTokenList()); 
            this.withOAuthClient(instance.getOAuthClient()); 
            this.withOAuthClientAuthorization(instance.getOAuthClientAuthorization()); 
            this.withOAuthClientAuthorizationList(instance.getOAuthClientAuthorizationList()); 
            this.withOAuthClientList(instance.getOAuthClientList()); 
            this.withObjectMeta(instance.getObjectMeta()); 
            this.withOpenshiftClusterRole(instance.getOpenshiftClusterRole()); 
            this.withOpenshiftClusterRoleBinding(instance.getOpenshiftClusterRoleBinding()); 
            this.withOpenshiftClusterRoleBindingList(instance.getOpenshiftClusterRoleBindingList()); 
            this.withOpenshiftRole(instance.getOpenshiftRole()); 
            this.withOpenshiftRoleBinding(instance.getOpenshiftRoleBinding()); 
            this.withOpenshiftRoleBindingList(instance.getOpenshiftRoleBindingList()); 
            this.withOpenshiftRoleBindingRestriction(instance.getOpenshiftRoleBindingRestriction()); 
            this.withOpenshiftRoleList(instance.getOpenshiftRoleList()); 
            this.withOperation(instance.getOperation()); 
            this.withPatch(instance.getPatch()); 
            this.withPatchType(instance.getPatchType()); 
            this.withPersistentVolume(instance.getPersistentVolume()); 
            this.withPersistentVolumeClaim(instance.getPersistentVolumeClaim()); 
            this.withPersistentVolumeClaimList(instance.getPersistentVolumeClaimList()); 
            this.withPersistentVolumeList(instance.getPersistentVolumeList()); 
            this.withPodDisruptionBudget(instance.getPodDisruptionBudget()); 
            this.withPodDisruptionBudgetList(instance.getPodDisruptionBudgetList()); 
            this.withPodList(instance.getPodList()); 
            this.withPodPreset(instance.getPodPreset()); 
            this.withPodPresetList(instance.getPodPresetList()); 
            this.withPodPresetSpec(instance.getPodPresetSpec()); 
            this.withPodSecurityPolicy(instance.getPodSecurityPolicy()); 
            this.withPodSecurityPolicyList(instance.getPodSecurityPolicyList()); 
            this.withPodTemplateList(instance.getPodTemplateList()); 
            this.withPriorityClass(instance.getPriorityClass()); 
            this.withPriorityClassList(instance.getPriorityClassList()); 
            this.withProject(instance.getProject()); 
            this.withProjectList(instance.getProjectList()); 
            this.withProjectRequest(instance.getProjectRequest()); 
            this.withQuantity(instance.getQuantity()); 
            this.withReplicaSet(instance.getReplicaSet()); 
            this.withReplicaSetList(instance.getReplicaSetList()); 
            this.withReplicationControllerList(instance.getReplicationControllerList()); 
            this.withResourceQuota(instance.getResourceQuota()); 
            this.withResourceQuotaList(instance.getResourceQuotaList()); 
            this.withRole(instance.getRole()); 
            this.withRoleBinding(instance.getRoleBinding()); 
            this.withRoleBindingList(instance.getRoleBindingList()); 
            this.withRoleList(instance.getRoleList()); 
            this.withRootPaths(instance.getRootPaths()); 
            this.withRoute(instance.getRoute()); 
            this.withRouteList(instance.getRouteList()); 
            this.withRule(instance.getRule()); 
            this.withRuleWithOperations(instance.getRuleWithOperations()); 
            this.withScale(instance.getScale()); 
            this.withSecret(instance.getSecret()); 
            this.withSecretList(instance.getSecretList()); 
            this.withSecurityContextConstraints(instance.getSecurityContextConstraints()); 
            this.withSecurityContextConstraintsList(instance.getSecurityContextConstraintsList()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withServiceAccountList(instance.getServiceAccountList()); 
            this.withServiceList(instance.getServiceList()); 
            this.withStatefulSet(instance.getStatefulSet()); 
            this.withStatefulSetList(instance.getStatefulSetList()); 
            this.withStatus(instance.getStatus()); 
            this.withStorageClass(instance.getStorageClass()); 
            this.withStorageClassList(instance.getStorageClassList()); 
            this.withSubjectAccessReview(instance.getSubjectAccessReview()); 
            this.withSubjectAccessReviewResponse(instance.getSubjectAccessReviewResponse()); 
            this.withTagEvent(instance.getTagEvent()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTemplateList(instance.getTemplateList()); 
            this.withTokenReview(instance.getTokenReview()); 
            this.withToleration(instance.getToleration()); 
            this.withTypeMeta(instance.getTypeMeta()); 
            this.withUser(instance.getUser()); 
            this.withUserList(instance.getUserList()); 
            this.withValidatingWebhookConfiguration(instance.getValidatingWebhookConfiguration()); 
            this.withValidatingWebhookConfigurationList(instance.getValidatingWebhookConfigurationList()); 
            this.withWatchEvent(instance.getWatchEvent()); 
    }

    
/**
 * This method has been deprecated, please use method buildAdmissionRequest instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionRequest getAdmissionRequest(){
            return this.admissionRequest!=null?this.admissionRequest.build():null;
    }

    public AdmissionRequest buildAdmissionRequest(){
            return this.admissionRequest!=null?this.admissionRequest.build():null;
    }

    public A withAdmissionRequest(AdmissionRequest admissionRequest){
            _visitables.remove(this.admissionRequest);
            if (admissionRequest!=null){ this.admissionRequest= new AdmissionRequestBuilder(admissionRequest); _visitables.add(this.admissionRequest);} return (A) this;
    }

    public Boolean hasAdmissionRequest(){
            return this.admissionRequest != null;
    }

    public KubeSchemaFluent.AdmissionRequestNested<A> withNewAdmissionRequest(){
            return new AdmissionRequestNestedImpl();
    }

    public KubeSchemaFluent.AdmissionRequestNested<A> withNewAdmissionRequestLike(AdmissionRequest item){
            return new AdmissionRequestNestedImpl(item);
    }

    public KubeSchemaFluent.AdmissionRequestNested<A> editAdmissionRequest(){
            return withNewAdmissionRequestLike(getAdmissionRequest());
    }

    public KubeSchemaFluent.AdmissionRequestNested<A> editOrNewAdmissionRequest(){
            return withNewAdmissionRequestLike(getAdmissionRequest() != null ? getAdmissionRequest(): new AdmissionRequestBuilder().build());
    }

    public KubeSchemaFluent.AdmissionRequestNested<A> editOrNewAdmissionRequestLike(AdmissionRequest item){
            return withNewAdmissionRequestLike(getAdmissionRequest() != null ? getAdmissionRequest(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAdmissionResponse instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionResponse getAdmissionResponse(){
            return this.admissionResponse!=null?this.admissionResponse.build():null;
    }

    public AdmissionResponse buildAdmissionResponse(){
            return this.admissionResponse!=null?this.admissionResponse.build():null;
    }

    public A withAdmissionResponse(AdmissionResponse admissionResponse){
            _visitables.remove(this.admissionResponse);
            if (admissionResponse!=null){ this.admissionResponse= new AdmissionResponseBuilder(admissionResponse); _visitables.add(this.admissionResponse);} return (A) this;
    }

    public Boolean hasAdmissionResponse(){
            return this.admissionResponse != null;
    }

    public KubeSchemaFluent.AdmissionResponseNested<A> withNewAdmissionResponse(){
            return new AdmissionResponseNestedImpl();
    }

    public KubeSchemaFluent.AdmissionResponseNested<A> withNewAdmissionResponseLike(AdmissionResponse item){
            return new AdmissionResponseNestedImpl(item);
    }

    public KubeSchemaFluent.AdmissionResponseNested<A> editAdmissionResponse(){
            return withNewAdmissionResponseLike(getAdmissionResponse());
    }

    public KubeSchemaFluent.AdmissionResponseNested<A> editOrNewAdmissionResponse(){
            return withNewAdmissionResponseLike(getAdmissionResponse() != null ? getAdmissionResponse(): new AdmissionResponseBuilder().build());
    }

    public KubeSchemaFluent.AdmissionResponseNested<A> editOrNewAdmissionResponseLike(AdmissionResponse item){
            return withNewAdmissionResponseLike(getAdmissionResponse() != null ? getAdmissionResponse(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAdmissionReview instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionReview getAdmissionReview(){
            return this.admissionReview!=null?this.admissionReview.build():null;
    }

    public AdmissionReview buildAdmissionReview(){
            return this.admissionReview!=null?this.admissionReview.build():null;
    }

    public A withAdmissionReview(AdmissionReview admissionReview){
            _visitables.remove(this.admissionReview);
            if (admissionReview!=null){ this.admissionReview= new AdmissionReviewBuilder(admissionReview); _visitables.add(this.admissionReview);} return (A) this;
    }

    public Boolean hasAdmissionReview(){
            return this.admissionReview != null;
    }

    public KubeSchemaFluent.AdmissionReviewNested<A> withNewAdmissionReview(){
            return new AdmissionReviewNestedImpl();
    }

    public KubeSchemaFluent.AdmissionReviewNested<A> withNewAdmissionReviewLike(AdmissionReview item){
            return new AdmissionReviewNestedImpl(item);
    }

    public KubeSchemaFluent.AdmissionReviewNested<A> editAdmissionReview(){
            return withNewAdmissionReviewLike(getAdmissionReview());
    }

    public KubeSchemaFluent.AdmissionReviewNested<A> editOrNewAdmissionReview(){
            return withNewAdmissionReviewLike(getAdmissionReview() != null ? getAdmissionReview(): new AdmissionReviewBuilder().build());
    }

    public KubeSchemaFluent.AdmissionReviewNested<A> editOrNewAdmissionReviewLike(AdmissionReview item){
            return withNewAdmissionReviewLike(getAdmissionReview() != null ? getAdmissionReview(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAdmissionWebhook instead.
 * @return The buildable object.
 */
@Deprecated public Webhook getAdmissionWebhook(){
            return this.admissionWebhook!=null?this.admissionWebhook.build():null;
    }

    public Webhook buildAdmissionWebhook(){
            return this.admissionWebhook!=null?this.admissionWebhook.build():null;
    }

    public A withAdmissionWebhook(Webhook admissionWebhook){
            _visitables.remove(this.admissionWebhook);
            if (admissionWebhook!=null){ this.admissionWebhook= new WebhookBuilder(admissionWebhook); _visitables.add(this.admissionWebhook);} return (A) this;
    }

    public Boolean hasAdmissionWebhook(){
            return this.admissionWebhook != null;
    }

    public KubeSchemaFluent.AdmissionWebhookNested<A> withNewAdmissionWebhook(){
            return new AdmissionWebhookNestedImpl();
    }

    public KubeSchemaFluent.AdmissionWebhookNested<A> withNewAdmissionWebhookLike(Webhook item){
            return new AdmissionWebhookNestedImpl(item);
    }

    public KubeSchemaFluent.AdmissionWebhookNested<A> editAdmissionWebhook(){
            return withNewAdmissionWebhookLike(getAdmissionWebhook());
    }

    public KubeSchemaFluent.AdmissionWebhookNested<A> editOrNewAdmissionWebhook(){
            return withNewAdmissionWebhookLike(getAdmissionWebhook() != null ? getAdmissionWebhook(): new WebhookBuilder().build());
    }

    public KubeSchemaFluent.AdmissionWebhookNested<A> editOrNewAdmissionWebhookLike(Webhook item){
            return withNewAdmissionWebhookLike(getAdmissionWebhook() != null ? getAdmissionWebhook(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAggregationRule instead.
 * @return The buildable object.
 */
@Deprecated public AggregationRule getAggregationRule(){
            return this.aggregationRule!=null?this.aggregationRule.build():null;
    }

    public AggregationRule buildAggregationRule(){
            return this.aggregationRule!=null?this.aggregationRule.build():null;
    }

    public A withAggregationRule(AggregationRule aggregationRule){
            _visitables.remove(this.aggregationRule);
            if (aggregationRule!=null){ this.aggregationRule= new AggregationRuleBuilder(aggregationRule); _visitables.add(this.aggregationRule);} return (A) this;
    }

    public Boolean hasAggregationRule(){
            return this.aggregationRule != null;
    }

    public KubeSchemaFluent.AggregationRuleNested<A> withNewAggregationRule(){
            return new AggregationRuleNestedImpl();
    }

    public KubeSchemaFluent.AggregationRuleNested<A> withNewAggregationRuleLike(AggregationRule item){
            return new AggregationRuleNestedImpl(item);
    }

    public KubeSchemaFluent.AggregationRuleNested<A> editAggregationRule(){
            return withNewAggregationRuleLike(getAggregationRule());
    }

    public KubeSchemaFluent.AggregationRuleNested<A> editOrNewAggregationRule(){
            return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): new AggregationRuleBuilder().build());
    }

    public KubeSchemaFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(AggregationRule item){
            return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): item);
    }

    
/**
 * This method has been deprecated, please use method buildBaseKubernetesList instead.
 * @return The buildable object.
 */
@Deprecated public BaseKubernetesList getBaseKubernetesList(){
            return this.baseKubernetesList!=null?this.baseKubernetesList.build():null;
    }

    public BaseKubernetesList buildBaseKubernetesList(){
            return this.baseKubernetesList!=null?this.baseKubernetesList.build():null;
    }

    public A withBaseKubernetesList(BaseKubernetesList baseKubernetesList){
            _visitables.remove(this.baseKubernetesList);
            if (baseKubernetesList!=null){ this.baseKubernetesList= new BaseKubernetesListBuilder(baseKubernetesList); _visitables.add(this.baseKubernetesList);} return (A) this;
    }

    public Boolean hasBaseKubernetesList(){
            return this.baseKubernetesList != null;
    }

    public KubeSchemaFluent.BaseKubernetesListNested<A> withNewBaseKubernetesList(){
            return new BaseKubernetesListNestedImpl();
    }

    public KubeSchemaFluent.BaseKubernetesListNested<A> withNewBaseKubernetesListLike(BaseKubernetesList item){
            return new BaseKubernetesListNestedImpl(item);
    }

    public KubeSchemaFluent.BaseKubernetesListNested<A> editBaseKubernetesList(){
            return withNewBaseKubernetesListLike(getBaseKubernetesList());
    }

    public KubeSchemaFluent.BaseKubernetesListNested<A> editOrNewBaseKubernetesList(){
            return withNewBaseKubernetesListLike(getBaseKubernetesList() != null ? getBaseKubernetesList(): new BaseKubernetesListBuilder().build());
    }

    public KubeSchemaFluent.BaseKubernetesListNested<A> editOrNewBaseKubernetesListLike(BaseKubernetesList item){
            return withNewBaseKubernetesListLike(getBaseKubernetesList() != null ? getBaseKubernetesList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildBinding instead.
 * @return The buildable object.
 */
@Deprecated public Binding getBinding(){
            return this.binding!=null?this.binding.build():null;
    }

    public Binding buildBinding(){
            return this.binding!=null?this.binding.build():null;
    }

    public A withBinding(Binding binding){
            _visitables.remove(this.binding);
            if (binding!=null){ this.binding= new BindingBuilder(binding); _visitables.add(this.binding);} return (A) this;
    }

    public Boolean hasBinding(){
            return this.binding != null;
    }

    public KubeSchemaFluent.BindingNested<A> withNewBinding(){
            return new BindingNestedImpl();
    }

    public KubeSchemaFluent.BindingNested<A> withNewBindingLike(Binding item){
            return new BindingNestedImpl(item);
    }

    public KubeSchemaFluent.BindingNested<A> editBinding(){
            return withNewBindingLike(getBinding());
    }

    public KubeSchemaFluent.BindingNested<A> editOrNewBinding(){
            return withNewBindingLike(getBinding() != null ? getBinding(): new BindingBuilder().build());
    }

    public KubeSchemaFluent.BindingNested<A> editOrNewBindingLike(Binding item){
            return withNewBindingLike(getBinding() != null ? getBinding(): item);
    }

    
/**
 * This method has been deprecated, please use method buildBuildConfigList instead.
 * @return The buildable object.
 */
@Deprecated public BuildConfigList getBuildConfigList(){
            return this.buildConfigList!=null?this.buildConfigList.build():null;
    }

    public BuildConfigList buildBuildConfigList(){
            return this.buildConfigList!=null?this.buildConfigList.build():null;
    }

    public A withBuildConfigList(BuildConfigList buildConfigList){
            _visitables.remove(this.buildConfigList);
            if (buildConfigList!=null){ this.buildConfigList= new BuildConfigListBuilder(buildConfigList); _visitables.add(this.buildConfigList);} return (A) this;
    }

    public Boolean hasBuildConfigList(){
            return this.buildConfigList != null;
    }

    public KubeSchemaFluent.BuildConfigListNested<A> withNewBuildConfigList(){
            return new BuildConfigListNestedImpl();
    }

    public KubeSchemaFluent.BuildConfigListNested<A> withNewBuildConfigListLike(BuildConfigList item){
            return new BuildConfigListNestedImpl(item);
    }

    public KubeSchemaFluent.BuildConfigListNested<A> editBuildConfigList(){
            return withNewBuildConfigListLike(getBuildConfigList());
    }

    public KubeSchemaFluent.BuildConfigListNested<A> editOrNewBuildConfigList(){
            return withNewBuildConfigListLike(getBuildConfigList() != null ? getBuildConfigList(): new BuildConfigListBuilder().build());
    }

    public KubeSchemaFluent.BuildConfigListNested<A> editOrNewBuildConfigListLike(BuildConfigList item){
            return withNewBuildConfigListLike(getBuildConfigList() != null ? getBuildConfigList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildBuildList instead.
 * @return The buildable object.
 */
@Deprecated public BuildList getBuildList(){
            return this.buildList!=null?this.buildList.build():null;
    }

    public BuildList buildBuildList(){
            return this.buildList!=null?this.buildList.build():null;
    }

    public A withBuildList(BuildList buildList){
            _visitables.remove(this.buildList);
            if (buildList!=null){ this.buildList= new BuildListBuilder(buildList); _visitables.add(this.buildList);} return (A) this;
    }

    public Boolean hasBuildList(){
            return this.buildList != null;
    }

    public KubeSchemaFluent.BuildListNested<A> withNewBuildList(){
            return new BuildListNestedImpl();
    }

    public KubeSchemaFluent.BuildListNested<A> withNewBuildListLike(BuildList item){
            return new BuildListNestedImpl(item);
    }

    public KubeSchemaFluent.BuildListNested<A> editBuildList(){
            return withNewBuildListLike(getBuildList());
    }

    public KubeSchemaFluent.BuildListNested<A> editOrNewBuildList(){
            return withNewBuildListLike(getBuildList() != null ? getBuildList(): new BuildListBuilder().build());
    }

    public KubeSchemaFluent.BuildListNested<A> editOrNewBuildListLike(BuildList item){
            return withNewBuildListLike(getBuildList() != null ? getBuildList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildBuildRequest instead.
 * @return The buildable object.
 */
@Deprecated public BuildRequest getBuildRequest(){
            return this.buildRequest!=null?this.buildRequest.build():null;
    }

    public BuildRequest buildBuildRequest(){
            return this.buildRequest!=null?this.buildRequest.build():null;
    }

    public A withBuildRequest(BuildRequest buildRequest){
            _visitables.remove(this.buildRequest);
            if (buildRequest!=null){ this.buildRequest= new BuildRequestBuilder(buildRequest); _visitables.add(this.buildRequest);} return (A) this;
    }

    public Boolean hasBuildRequest(){
            return this.buildRequest != null;
    }

    public KubeSchemaFluent.BuildRequestNested<A> withNewBuildRequest(){
            return new BuildRequestNestedImpl();
    }

    public KubeSchemaFluent.BuildRequestNested<A> withNewBuildRequestLike(BuildRequest item){
            return new BuildRequestNestedImpl(item);
    }

    public KubeSchemaFluent.BuildRequestNested<A> editBuildRequest(){
            return withNewBuildRequestLike(getBuildRequest());
    }

    public KubeSchemaFluent.BuildRequestNested<A> editOrNewBuildRequest(){
            return withNewBuildRequestLike(getBuildRequest() != null ? getBuildRequest(): new BuildRequestBuilder().build());
    }

    public KubeSchemaFluent.BuildRequestNested<A> editOrNewBuildRequestLike(BuildRequest item){
            return withNewBuildRequestLike(getBuildRequest() != null ? getBuildRequest(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequest instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequest getCertificateSigningRequest(){
            return this.certificateSigningRequest!=null?this.certificateSigningRequest.build():null;
    }

    public CertificateSigningRequest buildCertificateSigningRequest(){
            return this.certificateSigningRequest!=null?this.certificateSigningRequest.build():null;
    }

    public A withCertificateSigningRequest(CertificateSigningRequest certificateSigningRequest){
            _visitables.remove(this.certificateSigningRequest);
            if (certificateSigningRequest!=null){ this.certificateSigningRequest= new CertificateSigningRequestBuilder(certificateSigningRequest); _visitables.add(this.certificateSigningRequest);} return (A) this;
    }

    public Boolean hasCertificateSigningRequest(){
            return this.certificateSigningRequest != null;
    }

    public KubeSchemaFluent.CertificateSigningRequestNested<A> withNewCertificateSigningRequest(){
            return new CertificateSigningRequestNestedImpl();
    }

    public KubeSchemaFluent.CertificateSigningRequestNested<A> withNewCertificateSigningRequestLike(CertificateSigningRequest item){
            return new CertificateSigningRequestNestedImpl(item);
    }

    public KubeSchemaFluent.CertificateSigningRequestNested<A> editCertificateSigningRequest(){
            return withNewCertificateSigningRequestLike(getCertificateSigningRequest());
    }

    public KubeSchemaFluent.CertificateSigningRequestNested<A> editOrNewCertificateSigningRequest(){
            return withNewCertificateSigningRequestLike(getCertificateSigningRequest() != null ? getCertificateSigningRequest(): new CertificateSigningRequestBuilder().build());
    }

    public KubeSchemaFluent.CertificateSigningRequestNested<A> editOrNewCertificateSigningRequestLike(CertificateSigningRequest item){
            return withNewCertificateSigningRequestLike(getCertificateSigningRequest() != null ? getCertificateSigningRequest(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestCondition instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestCondition getCertificateSigningRequestCondition(){
            return this.certificateSigningRequestCondition!=null?this.certificateSigningRequestCondition.build():null;
    }

    public CertificateSigningRequestCondition buildCertificateSigningRequestCondition(){
            return this.certificateSigningRequestCondition!=null?this.certificateSigningRequestCondition.build():null;
    }

    public A withCertificateSigningRequestCondition(CertificateSigningRequestCondition certificateSigningRequestCondition){
            _visitables.remove(this.certificateSigningRequestCondition);
            if (certificateSigningRequestCondition!=null){ this.certificateSigningRequestCondition= new CertificateSigningRequestConditionBuilder(certificateSigningRequestCondition); _visitables.add(this.certificateSigningRequestCondition);} return (A) this;
    }

    public Boolean hasCertificateSigningRequestCondition(){
            return this.certificateSigningRequestCondition != null;
    }

    public A withNewCertificateSigningRequestCondition(String lastUpdateTime,String message,String reason,String type){
            return (A)withCertificateSigningRequestCondition(new CertificateSigningRequestCondition(lastUpdateTime, message, reason, type));
    }

    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> withNewCertificateSigningRequestCondition(){
            return new CertificateSigningRequestConditionNestedImpl();
    }

    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> withNewCertificateSigningRequestConditionLike(CertificateSigningRequestCondition item){
            return new CertificateSigningRequestConditionNestedImpl(item);
    }

    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> editCertificateSigningRequestCondition(){
            return withNewCertificateSigningRequestConditionLike(getCertificateSigningRequestCondition());
    }

    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> editOrNewCertificateSigningRequestCondition(){
            return withNewCertificateSigningRequestConditionLike(getCertificateSigningRequestCondition() != null ? getCertificateSigningRequestCondition(): new CertificateSigningRequestConditionBuilder().build());
    }

    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> editOrNewCertificateSigningRequestConditionLike(CertificateSigningRequestCondition item){
            return withNewCertificateSigningRequestConditionLike(getCertificateSigningRequestCondition() != null ? getCertificateSigningRequestCondition(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestList instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestList getCertificateSigningRequestList(){
            return this.certificateSigningRequestList!=null?this.certificateSigningRequestList.build():null;
    }

    public CertificateSigningRequestList buildCertificateSigningRequestList(){
            return this.certificateSigningRequestList!=null?this.certificateSigningRequestList.build():null;
    }

    public A withCertificateSigningRequestList(CertificateSigningRequestList certificateSigningRequestList){
            _visitables.remove(this.certificateSigningRequestList);
            if (certificateSigningRequestList!=null){ this.certificateSigningRequestList= new CertificateSigningRequestListBuilder(certificateSigningRequestList); _visitables.add(this.certificateSigningRequestList);} return (A) this;
    }

    public Boolean hasCertificateSigningRequestList(){
            return this.certificateSigningRequestList != null;
    }

    public KubeSchemaFluent.CertificateSigningRequestListNested<A> withNewCertificateSigningRequestList(){
            return new CertificateSigningRequestListNestedImpl();
    }

    public KubeSchemaFluent.CertificateSigningRequestListNested<A> withNewCertificateSigningRequestListLike(CertificateSigningRequestList item){
            return new CertificateSigningRequestListNestedImpl(item);
    }

    public KubeSchemaFluent.CertificateSigningRequestListNested<A> editCertificateSigningRequestList(){
            return withNewCertificateSigningRequestListLike(getCertificateSigningRequestList());
    }

    public KubeSchemaFluent.CertificateSigningRequestListNested<A> editOrNewCertificateSigningRequestList(){
            return withNewCertificateSigningRequestListLike(getCertificateSigningRequestList() != null ? getCertificateSigningRequestList(): new CertificateSigningRequestListBuilder().build());
    }

    public KubeSchemaFluent.CertificateSigningRequestListNested<A> editOrNewCertificateSigningRequestListLike(CertificateSigningRequestList item){
            return withNewCertificateSigningRequestListLike(getCertificateSigningRequestList() != null ? getCertificateSigningRequestList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestSpec instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestSpec getCertificateSigningRequestSpec(){
            return this.certificateSigningRequestSpec!=null?this.certificateSigningRequestSpec.build():null;
    }

    public CertificateSigningRequestSpec buildCertificateSigningRequestSpec(){
            return this.certificateSigningRequestSpec!=null?this.certificateSigningRequestSpec.build():null;
    }

    public A withCertificateSigningRequestSpec(CertificateSigningRequestSpec certificateSigningRequestSpec){
            _visitables.remove(this.certificateSigningRequestSpec);
            if (certificateSigningRequestSpec!=null){ this.certificateSigningRequestSpec= new CertificateSigningRequestSpecBuilder(certificateSigningRequestSpec); _visitables.add(this.certificateSigningRequestSpec);} return (A) this;
    }

    public Boolean hasCertificateSigningRequestSpec(){
            return this.certificateSigningRequestSpec != null;
    }

    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> withNewCertificateSigningRequestSpec(){
            return new CertificateSigningRequestSpecNestedImpl();
    }

    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> withNewCertificateSigningRequestSpecLike(CertificateSigningRequestSpec item){
            return new CertificateSigningRequestSpecNestedImpl(item);
    }

    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> editCertificateSigningRequestSpec(){
            return withNewCertificateSigningRequestSpecLike(getCertificateSigningRequestSpec());
    }

    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> editOrNewCertificateSigningRequestSpec(){
            return withNewCertificateSigningRequestSpecLike(getCertificateSigningRequestSpec() != null ? getCertificateSigningRequestSpec(): new CertificateSigningRequestSpecBuilder().build());
    }

    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> editOrNewCertificateSigningRequestSpecLike(CertificateSigningRequestSpec item){
            return withNewCertificateSigningRequestSpecLike(getCertificateSigningRequestSpec() != null ? getCertificateSigningRequestSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestStatus instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestStatus getCertificateSigningRequestStatus(){
            return this.certificateSigningRequestStatus!=null?this.certificateSigningRequestStatus.build():null;
    }

    public CertificateSigningRequestStatus buildCertificateSigningRequestStatus(){
            return this.certificateSigningRequestStatus!=null?this.certificateSigningRequestStatus.build():null;
    }

    public A withCertificateSigningRequestStatus(CertificateSigningRequestStatus certificateSigningRequestStatus){
            _visitables.remove(this.certificateSigningRequestStatus);
            if (certificateSigningRequestStatus!=null){ this.certificateSigningRequestStatus= new CertificateSigningRequestStatusBuilder(certificateSigningRequestStatus); _visitables.add(this.certificateSigningRequestStatus);} return (A) this;
    }

    public Boolean hasCertificateSigningRequestStatus(){
            return this.certificateSigningRequestStatus != null;
    }

    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> withNewCertificateSigningRequestStatus(){
            return new CertificateSigningRequestStatusNestedImpl();
    }

    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> withNewCertificateSigningRequestStatusLike(CertificateSigningRequestStatus item){
            return new CertificateSigningRequestStatusNestedImpl(item);
    }

    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> editCertificateSigningRequestStatus(){
            return withNewCertificateSigningRequestStatusLike(getCertificateSigningRequestStatus());
    }

    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> editOrNewCertificateSigningRequestStatus(){
            return withNewCertificateSigningRequestStatusLike(getCertificateSigningRequestStatus() != null ? getCertificateSigningRequestStatus(): new CertificateSigningRequestStatusBuilder().build());
    }

    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> editOrNewCertificateSigningRequestStatusLike(CertificateSigningRequestStatus item){
            return withNewCertificateSigningRequestStatusLike(getCertificateSigningRequestStatus() != null ? getCertificateSigningRequestStatus(): item);
    }

    
/**
 * This method has been deprecated, please use method buildClusterRole instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRole getClusterRole(){
            return this.clusterRole!=null?this.clusterRole.build():null;
    }

    public ClusterRole buildClusterRole(){
            return this.clusterRole!=null?this.clusterRole.build():null;
    }

    public A withClusterRole(ClusterRole clusterRole){
            _visitables.remove(this.clusterRole);
            if (clusterRole!=null){ this.clusterRole= new ClusterRoleBuilder(clusterRole); _visitables.add(this.clusterRole);} return (A) this;
    }

    public Boolean hasClusterRole(){
            return this.clusterRole != null;
    }

    public KubeSchemaFluent.ClusterRoleNested<A> withNewClusterRole(){
            return new ClusterRoleNestedImpl();
    }

    public KubeSchemaFluent.ClusterRoleNested<A> withNewClusterRoleLike(ClusterRole item){
            return new ClusterRoleNestedImpl(item);
    }

    public KubeSchemaFluent.ClusterRoleNested<A> editClusterRole(){
            return withNewClusterRoleLike(getClusterRole());
    }

    public KubeSchemaFluent.ClusterRoleNested<A> editOrNewClusterRole(){
            return withNewClusterRoleLike(getClusterRole() != null ? getClusterRole(): new ClusterRoleBuilder().build());
    }

    public KubeSchemaFluent.ClusterRoleNested<A> editOrNewClusterRoleLike(ClusterRole item){
            return withNewClusterRoleLike(getClusterRole() != null ? getClusterRole(): item);
    }

    
/**
 * This method has been deprecated, please use method buildClusterRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRoleBinding getClusterRoleBinding(){
            return this.clusterRoleBinding!=null?this.clusterRoleBinding.build():null;
    }

    public ClusterRoleBinding buildClusterRoleBinding(){
            return this.clusterRoleBinding!=null?this.clusterRoleBinding.build():null;
    }

    public A withClusterRoleBinding(ClusterRoleBinding clusterRoleBinding){
            _visitables.remove(this.clusterRoleBinding);
            if (clusterRoleBinding!=null){ this.clusterRoleBinding= new ClusterRoleBindingBuilder(clusterRoleBinding); _visitables.add(this.clusterRoleBinding);} return (A) this;
    }

    public Boolean hasClusterRoleBinding(){
            return this.clusterRoleBinding != null;
    }

    public KubeSchemaFluent.ClusterRoleBindingNested<A> withNewClusterRoleBinding(){
            return new ClusterRoleBindingNestedImpl();
    }

    public KubeSchemaFluent.ClusterRoleBindingNested<A> withNewClusterRoleBindingLike(ClusterRoleBinding item){
            return new ClusterRoleBindingNestedImpl(item);
    }

    public KubeSchemaFluent.ClusterRoleBindingNested<A> editClusterRoleBinding(){
            return withNewClusterRoleBindingLike(getClusterRoleBinding());
    }

    public KubeSchemaFluent.ClusterRoleBindingNested<A> editOrNewClusterRoleBinding(){
            return withNewClusterRoleBindingLike(getClusterRoleBinding() != null ? getClusterRoleBinding(): new ClusterRoleBindingBuilder().build());
    }

    public KubeSchemaFluent.ClusterRoleBindingNested<A> editOrNewClusterRoleBindingLike(ClusterRoleBinding item){
            return withNewClusterRoleBindingLike(getClusterRoleBinding() != null ? getClusterRoleBinding(): item);
    }

    
/**
 * This method has been deprecated, please use method buildClusterRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRoleBindingList getClusterRoleBindingList(){
            return this.clusterRoleBindingList!=null?this.clusterRoleBindingList.build():null;
    }

    public ClusterRoleBindingList buildClusterRoleBindingList(){
            return this.clusterRoleBindingList!=null?this.clusterRoleBindingList.build():null;
    }

    public A withClusterRoleBindingList(ClusterRoleBindingList clusterRoleBindingList){
            _visitables.remove(this.clusterRoleBindingList);
            if (clusterRoleBindingList!=null){ this.clusterRoleBindingList= new ClusterRoleBindingListBuilder(clusterRoleBindingList); _visitables.add(this.clusterRoleBindingList);} return (A) this;
    }

    public Boolean hasClusterRoleBindingList(){
            return this.clusterRoleBindingList != null;
    }

    public KubeSchemaFluent.ClusterRoleBindingListNested<A> withNewClusterRoleBindingList(){
            return new ClusterRoleBindingListNestedImpl();
    }

    public KubeSchemaFluent.ClusterRoleBindingListNested<A> withNewClusterRoleBindingListLike(ClusterRoleBindingList item){
            return new ClusterRoleBindingListNestedImpl(item);
    }

    public KubeSchemaFluent.ClusterRoleBindingListNested<A> editClusterRoleBindingList(){
            return withNewClusterRoleBindingListLike(getClusterRoleBindingList());
    }

    public KubeSchemaFluent.ClusterRoleBindingListNested<A> editOrNewClusterRoleBindingList(){
            return withNewClusterRoleBindingListLike(getClusterRoleBindingList() != null ? getClusterRoleBindingList(): new ClusterRoleBindingListBuilder().build());
    }

    public KubeSchemaFluent.ClusterRoleBindingListNested<A> editOrNewClusterRoleBindingListLike(ClusterRoleBindingList item){
            return withNewClusterRoleBindingListLike(getClusterRoleBindingList() != null ? getClusterRoleBindingList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildClusterRoleList instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRoleList getClusterRoleList(){
            return this.clusterRoleList!=null?this.clusterRoleList.build():null;
    }

    public ClusterRoleList buildClusterRoleList(){
            return this.clusterRoleList!=null?this.clusterRoleList.build():null;
    }

    public A withClusterRoleList(ClusterRoleList clusterRoleList){
            _visitables.remove(this.clusterRoleList);
            if (clusterRoleList!=null){ this.clusterRoleList= new ClusterRoleListBuilder(clusterRoleList); _visitables.add(this.clusterRoleList);} return (A) this;
    }

    public Boolean hasClusterRoleList(){
            return this.clusterRoleList != null;
    }

    public KubeSchemaFluent.ClusterRoleListNested<A> withNewClusterRoleList(){
            return new ClusterRoleListNestedImpl();
    }

    public KubeSchemaFluent.ClusterRoleListNested<A> withNewClusterRoleListLike(ClusterRoleList item){
            return new ClusterRoleListNestedImpl(item);
    }

    public KubeSchemaFluent.ClusterRoleListNested<A> editClusterRoleList(){
            return withNewClusterRoleListLike(getClusterRoleList());
    }

    public KubeSchemaFluent.ClusterRoleListNested<A> editOrNewClusterRoleList(){
            return withNewClusterRoleListLike(getClusterRoleList() != null ? getClusterRoleList(): new ClusterRoleListBuilder().build());
    }

    public KubeSchemaFluent.ClusterRoleListNested<A> editOrNewClusterRoleListLike(ClusterRoleList item){
            return withNewClusterRoleListLike(getClusterRoleList() != null ? getClusterRoleList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildComponentStatusList instead.
 * @return The buildable object.
 */
@Deprecated public ComponentStatusList getComponentStatusList(){
            return this.componentStatusList!=null?this.componentStatusList.build():null;
    }

    public ComponentStatusList buildComponentStatusList(){
            return this.componentStatusList!=null?this.componentStatusList.build():null;
    }

    public A withComponentStatusList(ComponentStatusList componentStatusList){
            _visitables.remove(this.componentStatusList);
            if (componentStatusList!=null){ this.componentStatusList= new ComponentStatusListBuilder(componentStatusList); _visitables.add(this.componentStatusList);} return (A) this;
    }

    public Boolean hasComponentStatusList(){
            return this.componentStatusList != null;
    }

    public KubeSchemaFluent.ComponentStatusListNested<A> withNewComponentStatusList(){
            return new ComponentStatusListNestedImpl();
    }

    public KubeSchemaFluent.ComponentStatusListNested<A> withNewComponentStatusListLike(ComponentStatusList item){
            return new ComponentStatusListNestedImpl(item);
    }

    public KubeSchemaFluent.ComponentStatusListNested<A> editComponentStatusList(){
            return withNewComponentStatusListLike(getComponentStatusList());
    }

    public KubeSchemaFluent.ComponentStatusListNested<A> editOrNewComponentStatusList(){
            return withNewComponentStatusListLike(getComponentStatusList() != null ? getComponentStatusList(): new ComponentStatusListBuilder().build());
    }

    public KubeSchemaFluent.ComponentStatusListNested<A> editOrNewComponentStatusListLike(ComponentStatusList item){
            return withNewComponentStatusListLike(getComponentStatusList() != null ? getComponentStatusList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildConfig instead.
 * @return The buildable object.
 */
@Deprecated public Config getConfig(){
            return this.config!=null?this.config.build():null;
    }

    public Config buildConfig(){
            return this.config!=null?this.config.build():null;
    }

    public A withConfig(Config config){
            _visitables.remove(this.config);
            if (config!=null){ this.config= new ConfigBuilder(config); _visitables.add(this.config);} return (A) this;
    }

    public Boolean hasConfig(){
            return this.config != null;
    }

    public KubeSchemaFluent.ConfigNested<A> withNewConfig(){
            return new ConfigNestedImpl();
    }

    public KubeSchemaFluent.ConfigNested<A> withNewConfigLike(Config item){
            return new ConfigNestedImpl(item);
    }

    public KubeSchemaFluent.ConfigNested<A> editConfig(){
            return withNewConfigLike(getConfig());
    }

    public KubeSchemaFluent.ConfigNested<A> editOrNewConfig(){
            return withNewConfigLike(getConfig() != null ? getConfig(): new ConfigBuilder().build());
    }

    public KubeSchemaFluent.ConfigNested<A> editOrNewConfigLike(Config item){
            return withNewConfigLike(getConfig() != null ? getConfig(): item);
    }

    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMap getConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public ConfigMap buildConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public A withConfigMap(ConfigMap configMap){
            _visitables.remove(this.configMap);
            if (configMap!=null){ this.configMap= new ConfigMapBuilder(configMap); _visitables.add(this.configMap);} return (A) this;
    }

    public Boolean hasConfigMap(){
            return this.configMap != null;
    }

    public KubeSchemaFluent.ConfigMapNested<A> withNewConfigMap(){
            return new ConfigMapNestedImpl();
    }

    public KubeSchemaFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMap item){
            return new ConfigMapNestedImpl(item);
    }

    public KubeSchemaFluent.ConfigMapNested<A> editConfigMap(){
            return withNewConfigMapLike(getConfigMap());
    }

    public KubeSchemaFluent.ConfigMapNested<A> editOrNewConfigMap(){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new ConfigMapBuilder().build());
    }

    public KubeSchemaFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMap item){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
    }

    
/**
 * This method has been deprecated, please use method buildConfigMapList instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapList getConfigMapList(){
            return this.configMapList!=null?this.configMapList.build():null;
    }

    public ConfigMapList buildConfigMapList(){
            return this.configMapList!=null?this.configMapList.build():null;
    }

    public A withConfigMapList(ConfigMapList configMapList){
            _visitables.remove(this.configMapList);
            if (configMapList!=null){ this.configMapList= new ConfigMapListBuilder(configMapList); _visitables.add(this.configMapList);} return (A) this;
    }

    public Boolean hasConfigMapList(){
            return this.configMapList != null;
    }

    public KubeSchemaFluent.ConfigMapListNested<A> withNewConfigMapList(){
            return new ConfigMapListNestedImpl();
    }

    public KubeSchemaFluent.ConfigMapListNested<A> withNewConfigMapListLike(ConfigMapList item){
            return new ConfigMapListNestedImpl(item);
    }

    public KubeSchemaFluent.ConfigMapListNested<A> editConfigMapList(){
            return withNewConfigMapListLike(getConfigMapList());
    }

    public KubeSchemaFluent.ConfigMapListNested<A> editOrNewConfigMapList(){
            return withNewConfigMapListLike(getConfigMapList() != null ? getConfigMapList(): new ConfigMapListBuilder().build());
    }

    public KubeSchemaFluent.ConfigMapListNested<A> editOrNewConfigMapListLike(ConfigMapList item){
            return withNewConfigMapListLike(getConfigMapList() != null ? getConfigMapList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildContainerStatus instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStatus getContainerStatus(){
            return this.containerStatus!=null?this.containerStatus.build():null;
    }

    public ContainerStatus buildContainerStatus(){
            return this.containerStatus!=null?this.containerStatus.build():null;
    }

    public A withContainerStatus(ContainerStatus containerStatus){
            _visitables.remove(this.containerStatus);
            if (containerStatus!=null){ this.containerStatus= new ContainerStatusBuilder(containerStatus); _visitables.add(this.containerStatus);} return (A) this;
    }

    public Boolean hasContainerStatus(){
            return this.containerStatus != null;
    }

    public KubeSchemaFluent.ContainerStatusNested<A> withNewContainerStatus(){
            return new ContainerStatusNestedImpl();
    }

    public KubeSchemaFluent.ContainerStatusNested<A> withNewContainerStatusLike(ContainerStatus item){
            return new ContainerStatusNestedImpl(item);
    }

    public KubeSchemaFluent.ContainerStatusNested<A> editContainerStatus(){
            return withNewContainerStatusLike(getContainerStatus());
    }

    public KubeSchemaFluent.ContainerStatusNested<A> editOrNewContainerStatus(){
            return withNewContainerStatusLike(getContainerStatus() != null ? getContainerStatus(): new ContainerStatusBuilder().build());
    }

    public KubeSchemaFluent.ContainerStatusNested<A> editOrNewContainerStatusLike(ContainerStatus item){
            return withNewContainerStatusLike(getContainerStatus() != null ? getContainerStatus(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCronJob instead.
 * @return The buildable object.
 */
@Deprecated public CronJob getCronJob(){
            return this.cronJob!=null?this.cronJob.build():null;
    }

    public CronJob buildCronJob(){
            return this.cronJob!=null?this.cronJob.build():null;
    }

    public A withCronJob(CronJob cronJob){
            _visitables.remove(this.cronJob);
            if (cronJob!=null){ this.cronJob= new CronJobBuilder(cronJob); _visitables.add(this.cronJob);} return (A) this;
    }

    public Boolean hasCronJob(){
            return this.cronJob != null;
    }

    public KubeSchemaFluent.CronJobNested<A> withNewCronJob(){
            return new CronJobNestedImpl();
    }

    public KubeSchemaFluent.CronJobNested<A> withNewCronJobLike(CronJob item){
            return new CronJobNestedImpl(item);
    }

    public KubeSchemaFluent.CronJobNested<A> editCronJob(){
            return withNewCronJobLike(getCronJob());
    }

    public KubeSchemaFluent.CronJobNested<A> editOrNewCronJob(){
            return withNewCronJobLike(getCronJob() != null ? getCronJob(): new CronJobBuilder().build());
    }

    public KubeSchemaFluent.CronJobNested<A> editOrNewCronJobLike(CronJob item){
            return withNewCronJobLike(getCronJob() != null ? getCronJob(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCronJobList instead.
 * @return The buildable object.
 */
@Deprecated public CronJobList getCronJobList(){
            return this.cronJobList!=null?this.cronJobList.build():null;
    }

    public CronJobList buildCronJobList(){
            return this.cronJobList!=null?this.cronJobList.build():null;
    }

    public A withCronJobList(CronJobList cronJobList){
            _visitables.remove(this.cronJobList);
            if (cronJobList!=null){ this.cronJobList= new CronJobListBuilder(cronJobList); _visitables.add(this.cronJobList);} return (A) this;
    }

    public Boolean hasCronJobList(){
            return this.cronJobList != null;
    }

    public KubeSchemaFluent.CronJobListNested<A> withNewCronJobList(){
            return new CronJobListNestedImpl();
    }

    public KubeSchemaFluent.CronJobListNested<A> withNewCronJobListLike(CronJobList item){
            return new CronJobListNestedImpl(item);
    }

    public KubeSchemaFluent.CronJobListNested<A> editCronJobList(){
            return withNewCronJobListLike(getCronJobList());
    }

    public KubeSchemaFluent.CronJobListNested<A> editOrNewCronJobList(){
            return withNewCronJobListLike(getCronJobList() != null ? getCronJobList(): new CronJobListBuilder().build());
    }

    public KubeSchemaFluent.CronJobListNested<A> editOrNewCronJobListLike(CronJobList item){
            return withNewCronJobListLike(getCronJobList() != null ? getCronJobList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinition instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinition getCustomResourceDefinition(){
            return this.customResourceDefinition!=null?this.customResourceDefinition.build():null;
    }

    public CustomResourceDefinition buildCustomResourceDefinition(){
            return this.customResourceDefinition!=null?this.customResourceDefinition.build():null;
    }

    public A withCustomResourceDefinition(CustomResourceDefinition customResourceDefinition){
            _visitables.remove(this.customResourceDefinition);
            if (customResourceDefinition!=null){ this.customResourceDefinition= new CustomResourceDefinitionBuilder(customResourceDefinition); _visitables.add(this.customResourceDefinition);} return (A) this;
    }

    public Boolean hasCustomResourceDefinition(){
            return this.customResourceDefinition != null;
    }

    public KubeSchemaFluent.CustomResourceDefinitionNested<A> withNewCustomResourceDefinition(){
            return new CustomResourceDefinitionNestedImpl();
    }

    public KubeSchemaFluent.CustomResourceDefinitionNested<A> withNewCustomResourceDefinitionLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionNestedImpl(item);
    }

    public KubeSchemaFluent.CustomResourceDefinitionNested<A> editCustomResourceDefinition(){
            return withNewCustomResourceDefinitionLike(getCustomResourceDefinition());
    }

    public KubeSchemaFluent.CustomResourceDefinitionNested<A> editOrNewCustomResourceDefinition(){
            return withNewCustomResourceDefinitionLike(getCustomResourceDefinition() != null ? getCustomResourceDefinition(): new CustomResourceDefinitionBuilder().build());
    }

    public KubeSchemaFluent.CustomResourceDefinitionNested<A> editOrNewCustomResourceDefinitionLike(CustomResourceDefinition item){
            return withNewCustomResourceDefinitionLike(getCustomResourceDefinition() != null ? getCustomResourceDefinition(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionCondition instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionCondition getCustomResourceDefinitionCondition(){
            return this.customResourceDefinitionCondition!=null?this.customResourceDefinitionCondition.build():null;
    }

    public CustomResourceDefinitionCondition buildCustomResourceDefinitionCondition(){
            return this.customResourceDefinitionCondition!=null?this.customResourceDefinitionCondition.build():null;
    }

    public A withCustomResourceDefinitionCondition(CustomResourceDefinitionCondition customResourceDefinitionCondition){
            _visitables.remove(this.customResourceDefinitionCondition);
            if (customResourceDefinitionCondition!=null){ this.customResourceDefinitionCondition= new CustomResourceDefinitionConditionBuilder(customResourceDefinitionCondition); _visitables.add(this.customResourceDefinitionCondition);} return (A) this;
    }

    public Boolean hasCustomResourceDefinitionCondition(){
            return this.customResourceDefinitionCondition != null;
    }

    public A withNewCustomResourceDefinitionCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withCustomResourceDefinitionCondition(new CustomResourceDefinitionCondition(lastTransitionTime, message, reason, status, type));
    }

    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> withNewCustomResourceDefinitionCondition(){
            return new CustomResourceDefinitionConditionNestedImpl();
    }

    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> withNewCustomResourceDefinitionConditionLike(CustomResourceDefinitionCondition item){
            return new CustomResourceDefinitionConditionNestedImpl(item);
    }

    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> editCustomResourceDefinitionCondition(){
            return withNewCustomResourceDefinitionConditionLike(getCustomResourceDefinitionCondition());
    }

    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> editOrNewCustomResourceDefinitionCondition(){
            return withNewCustomResourceDefinitionConditionLike(getCustomResourceDefinitionCondition() != null ? getCustomResourceDefinitionCondition(): new CustomResourceDefinitionConditionBuilder().build());
    }

    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> editOrNewCustomResourceDefinitionConditionLike(CustomResourceDefinitionCondition item){
            return withNewCustomResourceDefinitionConditionLike(getCustomResourceDefinitionCondition() != null ? getCustomResourceDefinitionCondition(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionList instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionList getCustomResourceDefinitionList(){
            return this.customResourceDefinitionList!=null?this.customResourceDefinitionList.build():null;
    }

    public CustomResourceDefinitionList buildCustomResourceDefinitionList(){
            return this.customResourceDefinitionList!=null?this.customResourceDefinitionList.build():null;
    }

    public A withCustomResourceDefinitionList(CustomResourceDefinitionList customResourceDefinitionList){
            _visitables.remove(this.customResourceDefinitionList);
            if (customResourceDefinitionList!=null){ this.customResourceDefinitionList= new CustomResourceDefinitionListBuilder(customResourceDefinitionList); _visitables.add(this.customResourceDefinitionList);} return (A) this;
    }

    public Boolean hasCustomResourceDefinitionList(){
            return this.customResourceDefinitionList != null;
    }

    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> withNewCustomResourceDefinitionList(){
            return new CustomResourceDefinitionListNestedImpl();
    }

    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> withNewCustomResourceDefinitionListLike(CustomResourceDefinitionList item){
            return new CustomResourceDefinitionListNestedImpl(item);
    }

    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> editCustomResourceDefinitionList(){
            return withNewCustomResourceDefinitionListLike(getCustomResourceDefinitionList());
    }

    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> editOrNewCustomResourceDefinitionList(){
            return withNewCustomResourceDefinitionListLike(getCustomResourceDefinitionList() != null ? getCustomResourceDefinitionList(): new CustomResourceDefinitionListBuilder().build());
    }

    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> editOrNewCustomResourceDefinitionListLike(CustomResourceDefinitionList item){
            return withNewCustomResourceDefinitionListLike(getCustomResourceDefinitionList() != null ? getCustomResourceDefinitionList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionNames instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionNames getCustomResourceDefinitionNames(){
            return this.customResourceDefinitionNames!=null?this.customResourceDefinitionNames.build():null;
    }

    public CustomResourceDefinitionNames buildCustomResourceDefinitionNames(){
            return this.customResourceDefinitionNames!=null?this.customResourceDefinitionNames.build():null;
    }

    public A withCustomResourceDefinitionNames(CustomResourceDefinitionNames customResourceDefinitionNames){
            _visitables.remove(this.customResourceDefinitionNames);
            if (customResourceDefinitionNames!=null){ this.customResourceDefinitionNames= new CustomResourceDefinitionNamesBuilder(customResourceDefinitionNames); _visitables.add(this.customResourceDefinitionNames);} return (A) this;
    }

    public Boolean hasCustomResourceDefinitionNames(){
            return this.customResourceDefinitionNames != null;
    }

    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> withNewCustomResourceDefinitionNames(){
            return new CustomResourceDefinitionNamesNestedImpl();
    }

    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> withNewCustomResourceDefinitionNamesLike(CustomResourceDefinitionNames item){
            return new CustomResourceDefinitionNamesNestedImpl(item);
    }

    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> editCustomResourceDefinitionNames(){
            return withNewCustomResourceDefinitionNamesLike(getCustomResourceDefinitionNames());
    }

    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> editOrNewCustomResourceDefinitionNames(){
            return withNewCustomResourceDefinitionNamesLike(getCustomResourceDefinitionNames() != null ? getCustomResourceDefinitionNames(): new CustomResourceDefinitionNamesBuilder().build());
    }

    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> editOrNewCustomResourceDefinitionNamesLike(CustomResourceDefinitionNames item){
            return withNewCustomResourceDefinitionNamesLike(getCustomResourceDefinitionNames() != null ? getCustomResourceDefinitionNames(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionSpec instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionSpec getCustomResourceDefinitionSpec(){
            return this.customResourceDefinitionSpec!=null?this.customResourceDefinitionSpec.build():null;
    }

    public CustomResourceDefinitionSpec buildCustomResourceDefinitionSpec(){
            return this.customResourceDefinitionSpec!=null?this.customResourceDefinitionSpec.build():null;
    }

    public A withCustomResourceDefinitionSpec(CustomResourceDefinitionSpec customResourceDefinitionSpec){
            _visitables.remove(this.customResourceDefinitionSpec);
            if (customResourceDefinitionSpec!=null){ this.customResourceDefinitionSpec= new CustomResourceDefinitionSpecBuilder(customResourceDefinitionSpec); _visitables.add(this.customResourceDefinitionSpec);} return (A) this;
    }

    public Boolean hasCustomResourceDefinitionSpec(){
            return this.customResourceDefinitionSpec != null;
    }

    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> withNewCustomResourceDefinitionSpec(){
            return new CustomResourceDefinitionSpecNestedImpl();
    }

    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> withNewCustomResourceDefinitionSpecLike(CustomResourceDefinitionSpec item){
            return new CustomResourceDefinitionSpecNestedImpl(item);
    }

    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> editCustomResourceDefinitionSpec(){
            return withNewCustomResourceDefinitionSpecLike(getCustomResourceDefinitionSpec());
    }

    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> editOrNewCustomResourceDefinitionSpec(){
            return withNewCustomResourceDefinitionSpecLike(getCustomResourceDefinitionSpec() != null ? getCustomResourceDefinitionSpec(): new CustomResourceDefinitionSpecBuilder().build());
    }

    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> editOrNewCustomResourceDefinitionSpecLike(CustomResourceDefinitionSpec item){
            return withNewCustomResourceDefinitionSpecLike(getCustomResourceDefinitionSpec() != null ? getCustomResourceDefinitionSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionStatus instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionStatus getCustomResourceDefinitionStatus(){
            return this.customResourceDefinitionStatus!=null?this.customResourceDefinitionStatus.build():null;
    }

    public CustomResourceDefinitionStatus buildCustomResourceDefinitionStatus(){
            return this.customResourceDefinitionStatus!=null?this.customResourceDefinitionStatus.build():null;
    }

    public A withCustomResourceDefinitionStatus(CustomResourceDefinitionStatus customResourceDefinitionStatus){
            _visitables.remove(this.customResourceDefinitionStatus);
            if (customResourceDefinitionStatus!=null){ this.customResourceDefinitionStatus= new CustomResourceDefinitionStatusBuilder(customResourceDefinitionStatus); _visitables.add(this.customResourceDefinitionStatus);} return (A) this;
    }

    public Boolean hasCustomResourceDefinitionStatus(){
            return this.customResourceDefinitionStatus != null;
    }

    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> withNewCustomResourceDefinitionStatus(){
            return new CustomResourceDefinitionStatusNestedImpl();
    }

    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> withNewCustomResourceDefinitionStatusLike(CustomResourceDefinitionStatus item){
            return new CustomResourceDefinitionStatusNestedImpl(item);
    }

    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> editCustomResourceDefinitionStatus(){
            return withNewCustomResourceDefinitionStatusLike(getCustomResourceDefinitionStatus());
    }

    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> editOrNewCustomResourceDefinitionStatus(){
            return withNewCustomResourceDefinitionStatusLike(getCustomResourceDefinitionStatus() != null ? getCustomResourceDefinitionStatus(): new CustomResourceDefinitionStatusBuilder().build());
    }

    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> editOrNewCustomResourceDefinitionStatusLike(CustomResourceDefinitionStatus item){
            return withNewCustomResourceDefinitionStatusLike(getCustomResourceDefinitionStatus() != null ? getCustomResourceDefinitionStatus(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDaemonSet instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSet getDaemonSet(){
            return this.daemonSet!=null?this.daemonSet.build():null;
    }

    public DaemonSet buildDaemonSet(){
            return this.daemonSet!=null?this.daemonSet.build():null;
    }

    public A withDaemonSet(DaemonSet daemonSet){
            _visitables.remove(this.daemonSet);
            if (daemonSet!=null){ this.daemonSet= new DaemonSetBuilder(daemonSet); _visitables.add(this.daemonSet);} return (A) this;
    }

    public Boolean hasDaemonSet(){
            return this.daemonSet != null;
    }

    public KubeSchemaFluent.DaemonSetNested<A> withNewDaemonSet(){
            return new DaemonSetNestedImpl();
    }

    public KubeSchemaFluent.DaemonSetNested<A> withNewDaemonSetLike(DaemonSet item){
            return new DaemonSetNestedImpl(item);
    }

    public KubeSchemaFluent.DaemonSetNested<A> editDaemonSet(){
            return withNewDaemonSetLike(getDaemonSet());
    }

    public KubeSchemaFluent.DaemonSetNested<A> editOrNewDaemonSet(){
            return withNewDaemonSetLike(getDaemonSet() != null ? getDaemonSet(): new DaemonSetBuilder().build());
    }

    public KubeSchemaFluent.DaemonSetNested<A> editOrNewDaemonSetLike(DaemonSet item){
            return withNewDaemonSetLike(getDaemonSet() != null ? getDaemonSet(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDaemonSetList instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSetList getDaemonSetList(){
            return this.daemonSetList!=null?this.daemonSetList.build():null;
    }

    public DaemonSetList buildDaemonSetList(){
            return this.daemonSetList!=null?this.daemonSetList.build():null;
    }

    public A withDaemonSetList(DaemonSetList daemonSetList){
            _visitables.remove(this.daemonSetList);
            if (daemonSetList!=null){ this.daemonSetList= new DaemonSetListBuilder(daemonSetList); _visitables.add(this.daemonSetList);} return (A) this;
    }

    public Boolean hasDaemonSetList(){
            return this.daemonSetList != null;
    }

    public KubeSchemaFluent.DaemonSetListNested<A> withNewDaemonSetList(){
            return new DaemonSetListNestedImpl();
    }

    public KubeSchemaFluent.DaemonSetListNested<A> withNewDaemonSetListLike(DaemonSetList item){
            return new DaemonSetListNestedImpl(item);
    }

    public KubeSchemaFluent.DaemonSetListNested<A> editDaemonSetList(){
            return withNewDaemonSetListLike(getDaemonSetList());
    }

    public KubeSchemaFluent.DaemonSetListNested<A> editOrNewDaemonSetList(){
            return withNewDaemonSetListLike(getDaemonSetList() != null ? getDaemonSetList(): new DaemonSetListBuilder().build());
    }

    public KubeSchemaFluent.DaemonSetListNested<A> editOrNewDaemonSetListLike(DaemonSetList item){
            return withNewDaemonSetListLike(getDaemonSetList() != null ? getDaemonSetList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDeleteOptions instead.
 * @return The buildable object.
 */
@Deprecated public DeleteOptions getDeleteOptions(){
            return this.deleteOptions!=null?this.deleteOptions.build():null;
    }

    public DeleteOptions buildDeleteOptions(){
            return this.deleteOptions!=null?this.deleteOptions.build():null;
    }

    public A withDeleteOptions(DeleteOptions deleteOptions){
            _visitables.remove(this.deleteOptions);
            if (deleteOptions!=null){ this.deleteOptions= new DeleteOptionsBuilder(deleteOptions); _visitables.add(this.deleteOptions);} return (A) this;
    }

    public Boolean hasDeleteOptions(){
            return this.deleteOptions != null;
    }

    public KubeSchemaFluent.DeleteOptionsNested<A> withNewDeleteOptions(){
            return new DeleteOptionsNestedImpl();
    }

    public KubeSchemaFluent.DeleteOptionsNested<A> withNewDeleteOptionsLike(DeleteOptions item){
            return new DeleteOptionsNestedImpl(item);
    }

    public KubeSchemaFluent.DeleteOptionsNested<A> editDeleteOptions(){
            return withNewDeleteOptionsLike(getDeleteOptions());
    }

    public KubeSchemaFluent.DeleteOptionsNested<A> editOrNewDeleteOptions(){
            return withNewDeleteOptionsLike(getDeleteOptions() != null ? getDeleteOptions(): new DeleteOptionsBuilder().build());
    }

    public KubeSchemaFluent.DeleteOptionsNested<A> editOrNewDeleteOptionsLike(DeleteOptions item){
            return withNewDeleteOptionsLike(getDeleteOptions() != null ? getDeleteOptions(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDeployment instead.
 * @return The buildable object.
 */
@Deprecated public Deployment getDeployment(){
            return this.deployment!=null?this.deployment.build():null;
    }

    public Deployment buildDeployment(){
            return this.deployment!=null?this.deployment.build():null;
    }

    public A withDeployment(Deployment deployment){
            _visitables.remove(this.deployment);
            if (deployment!=null){ this.deployment= new DeploymentBuilder(deployment); _visitables.add(this.deployment);} return (A) this;
    }

    public Boolean hasDeployment(){
            return this.deployment != null;
    }

    public KubeSchemaFluent.DeploymentNested<A> withNewDeployment(){
            return new DeploymentNestedImpl();
    }

    public KubeSchemaFluent.DeploymentNested<A> withNewDeploymentLike(Deployment item){
            return new DeploymentNestedImpl(item);
    }

    public KubeSchemaFluent.DeploymentNested<A> editDeployment(){
            return withNewDeploymentLike(getDeployment());
    }

    public KubeSchemaFluent.DeploymentNested<A> editOrNewDeployment(){
            return withNewDeploymentLike(getDeployment() != null ? getDeployment(): new DeploymentBuilder().build());
    }

    public KubeSchemaFluent.DeploymentNested<A> editOrNewDeploymentLike(Deployment item){
            return withNewDeploymentLike(getDeployment() != null ? getDeployment(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDeploymentConfig instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfig getDeploymentConfig(){
            return this.deploymentConfig!=null?this.deploymentConfig.build():null;
    }

    public DeploymentConfig buildDeploymentConfig(){
            return this.deploymentConfig!=null?this.deploymentConfig.build():null;
    }

    public A withDeploymentConfig(DeploymentConfig deploymentConfig){
            _visitables.remove(this.deploymentConfig);
            if (deploymentConfig!=null){ this.deploymentConfig= new DeploymentConfigBuilder(deploymentConfig); _visitables.add(this.deploymentConfig);} return (A) this;
    }

    public Boolean hasDeploymentConfig(){
            return this.deploymentConfig != null;
    }

    public KubeSchemaFluent.DeploymentConfigNested<A> withNewDeploymentConfig(){
            return new DeploymentConfigNestedImpl();
    }

    public KubeSchemaFluent.DeploymentConfigNested<A> withNewDeploymentConfigLike(DeploymentConfig item){
            return new DeploymentConfigNestedImpl(item);
    }

    public KubeSchemaFluent.DeploymentConfigNested<A> editDeploymentConfig(){
            return withNewDeploymentConfigLike(getDeploymentConfig());
    }

    public KubeSchemaFluent.DeploymentConfigNested<A> editOrNewDeploymentConfig(){
            return withNewDeploymentConfigLike(getDeploymentConfig() != null ? getDeploymentConfig(): new DeploymentConfigBuilder().build());
    }

    public KubeSchemaFluent.DeploymentConfigNested<A> editOrNewDeploymentConfigLike(DeploymentConfig item){
            return withNewDeploymentConfigLike(getDeploymentConfig() != null ? getDeploymentConfig(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDeploymentConfigList instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfigList getDeploymentConfigList(){
            return this.deploymentConfigList!=null?this.deploymentConfigList.build():null;
    }

    public DeploymentConfigList buildDeploymentConfigList(){
            return this.deploymentConfigList!=null?this.deploymentConfigList.build():null;
    }

    public A withDeploymentConfigList(DeploymentConfigList deploymentConfigList){
            _visitables.remove(this.deploymentConfigList);
            if (deploymentConfigList!=null){ this.deploymentConfigList= new DeploymentConfigListBuilder(deploymentConfigList); _visitables.add(this.deploymentConfigList);} return (A) this;
    }

    public Boolean hasDeploymentConfigList(){
            return this.deploymentConfigList != null;
    }

    public KubeSchemaFluent.DeploymentConfigListNested<A> withNewDeploymentConfigList(){
            return new DeploymentConfigListNestedImpl();
    }

    public KubeSchemaFluent.DeploymentConfigListNested<A> withNewDeploymentConfigListLike(DeploymentConfigList item){
            return new DeploymentConfigListNestedImpl(item);
    }

    public KubeSchemaFluent.DeploymentConfigListNested<A> editDeploymentConfigList(){
            return withNewDeploymentConfigListLike(getDeploymentConfigList());
    }

    public KubeSchemaFluent.DeploymentConfigListNested<A> editOrNewDeploymentConfigList(){
            return withNewDeploymentConfigListLike(getDeploymentConfigList() != null ? getDeploymentConfigList(): new DeploymentConfigListBuilder().build());
    }

    public KubeSchemaFluent.DeploymentConfigListNested<A> editOrNewDeploymentConfigListLike(DeploymentConfigList item){
            return withNewDeploymentConfigListLike(getDeploymentConfigList() != null ? getDeploymentConfigList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDeploymentList instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentList getDeploymentList(){
            return this.deploymentList!=null?this.deploymentList.build():null;
    }

    public DeploymentList buildDeploymentList(){
            return this.deploymentList!=null?this.deploymentList.build():null;
    }

    public A withDeploymentList(DeploymentList deploymentList){
            _visitables.remove(this.deploymentList);
            if (deploymentList!=null){ this.deploymentList= new DeploymentListBuilder(deploymentList); _visitables.add(this.deploymentList);} return (A) this;
    }

    public Boolean hasDeploymentList(){
            return this.deploymentList != null;
    }

    public KubeSchemaFluent.DeploymentListNested<A> withNewDeploymentList(){
            return new DeploymentListNestedImpl();
    }

    public KubeSchemaFluent.DeploymentListNested<A> withNewDeploymentListLike(DeploymentList item){
            return new DeploymentListNestedImpl(item);
    }

    public KubeSchemaFluent.DeploymentListNested<A> editDeploymentList(){
            return withNewDeploymentListLike(getDeploymentList());
    }

    public KubeSchemaFluent.DeploymentListNested<A> editOrNewDeploymentList(){
            return withNewDeploymentListLike(getDeploymentList() != null ? getDeploymentList(): new DeploymentListBuilder().build());
    }

    public KubeSchemaFluent.DeploymentListNested<A> editOrNewDeploymentListLike(DeploymentList item){
            return withNewDeploymentListLike(getDeploymentList() != null ? getDeploymentList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDeploymentRollback instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentRollback getDeploymentRollback(){
            return this.deploymentRollback!=null?this.deploymentRollback.build():null;
    }

    public DeploymentRollback buildDeploymentRollback(){
            return this.deploymentRollback!=null?this.deploymentRollback.build():null;
    }

    public A withDeploymentRollback(DeploymentRollback deploymentRollback){
            _visitables.remove(this.deploymentRollback);
            if (deploymentRollback!=null){ this.deploymentRollback= new DeploymentRollbackBuilder(deploymentRollback); _visitables.add(this.deploymentRollback);} return (A) this;
    }

    public Boolean hasDeploymentRollback(){
            return this.deploymentRollback != null;
    }

    public KubeSchemaFluent.DeploymentRollbackNested<A> withNewDeploymentRollback(){
            return new DeploymentRollbackNestedImpl();
    }

    public KubeSchemaFluent.DeploymentRollbackNested<A> withNewDeploymentRollbackLike(DeploymentRollback item){
            return new DeploymentRollbackNestedImpl(item);
    }

    public KubeSchemaFluent.DeploymentRollbackNested<A> editDeploymentRollback(){
            return withNewDeploymentRollbackLike(getDeploymentRollback());
    }

    public KubeSchemaFluent.DeploymentRollbackNested<A> editOrNewDeploymentRollback(){
            return withNewDeploymentRollbackLike(getDeploymentRollback() != null ? getDeploymentRollback(): new DeploymentRollbackBuilder().build());
    }

    public KubeSchemaFluent.DeploymentRollbackNested<A> editOrNewDeploymentRollbackLike(DeploymentRollback item){
            return withNewDeploymentRollbackLike(getDeploymentRollback() != null ? getDeploymentRollback(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEndpoints instead.
 * @return The buildable object.
 */
@Deprecated public Endpoints getEndpoints(){
            return this.endpoints!=null?this.endpoints.build():null;
    }

    public Endpoints buildEndpoints(){
            return this.endpoints!=null?this.endpoints.build():null;
    }

    public A withEndpoints(Endpoints endpoints){
            _visitables.remove(this.endpoints);
            if (endpoints!=null){ this.endpoints= new EndpointsBuilder(endpoints); _visitables.add(this.endpoints);} return (A) this;
    }

    public Boolean hasEndpoints(){
            return this.endpoints != null;
    }

    public KubeSchemaFluent.EndpointsNested<A> withNewEndpoints(){
            return new EndpointsNestedImpl();
    }

    public KubeSchemaFluent.EndpointsNested<A> withNewEndpointsLike(Endpoints item){
            return new EndpointsNestedImpl(item);
    }

    public KubeSchemaFluent.EndpointsNested<A> editEndpoints(){
            return withNewEndpointsLike(getEndpoints());
    }

    public KubeSchemaFluent.EndpointsNested<A> editOrNewEndpoints(){
            return withNewEndpointsLike(getEndpoints() != null ? getEndpoints(): new EndpointsBuilder().build());
    }

    public KubeSchemaFluent.EndpointsNested<A> editOrNewEndpointsLike(Endpoints item){
            return withNewEndpointsLike(getEndpoints() != null ? getEndpoints(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEndpointsList instead.
 * @return The buildable object.
 */
@Deprecated public EndpointsList getEndpointsList(){
            return this.endpointsList!=null?this.endpointsList.build():null;
    }

    public EndpointsList buildEndpointsList(){
            return this.endpointsList!=null?this.endpointsList.build():null;
    }

    public A withEndpointsList(EndpointsList endpointsList){
            _visitables.remove(this.endpointsList);
            if (endpointsList!=null){ this.endpointsList= new EndpointsListBuilder(endpointsList); _visitables.add(this.endpointsList);} return (A) this;
    }

    public Boolean hasEndpointsList(){
            return this.endpointsList != null;
    }

    public KubeSchemaFluent.EndpointsListNested<A> withNewEndpointsList(){
            return new EndpointsListNestedImpl();
    }

    public KubeSchemaFluent.EndpointsListNested<A> withNewEndpointsListLike(EndpointsList item){
            return new EndpointsListNestedImpl(item);
    }

    public KubeSchemaFluent.EndpointsListNested<A> editEndpointsList(){
            return withNewEndpointsListLike(getEndpointsList());
    }

    public KubeSchemaFluent.EndpointsListNested<A> editOrNewEndpointsList(){
            return withNewEndpointsListLike(getEndpointsList() != null ? getEndpointsList(): new EndpointsListBuilder().build());
    }

    public KubeSchemaFluent.EndpointsListNested<A> editOrNewEndpointsListLike(EndpointsList item){
            return withNewEndpointsListLike(getEndpointsList() != null ? getEndpointsList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEnvVar instead.
 * @return The buildable object.
 */
@Deprecated public EnvVar getEnvVar(){
            return this.envVar!=null?this.envVar.build():null;
    }

    public EnvVar buildEnvVar(){
            return this.envVar!=null?this.envVar.build():null;
    }

    public A withEnvVar(EnvVar envVar){
            _visitables.remove(this.envVar);
            if (envVar!=null){ this.envVar= new EnvVarBuilder(envVar); _visitables.add(this.envVar);} return (A) this;
    }

    public Boolean hasEnvVar(){
            return this.envVar != null;
    }

    public KubeSchemaFluent.EnvVarNested<A> withNewEnvVar(){
            return new EnvVarNestedImpl();
    }

    public KubeSchemaFluent.EnvVarNested<A> withNewEnvVarLike(EnvVar item){
            return new EnvVarNestedImpl(item);
    }

    public KubeSchemaFluent.EnvVarNested<A> editEnvVar(){
            return withNewEnvVarLike(getEnvVar());
    }

    public KubeSchemaFluent.EnvVarNested<A> editOrNewEnvVar(){
            return withNewEnvVarLike(getEnvVar() != null ? getEnvVar(): new EnvVarBuilder().build());
    }

    public KubeSchemaFluent.EnvVarNested<A> editOrNewEnvVarLike(EnvVar item){
            return withNewEnvVarLike(getEnvVar() != null ? getEnvVar(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEvent instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.events.Event getEvent(){
            return this.event!=null?this.event.build():null;
    }

    public io.fabric8.kubernetes.api.model.events.Event buildEvent(){
            return this.event!=null?this.event.build():null;
    }

    public A withEvent(io.fabric8.kubernetes.api.model.events.Event event){
            _visitables.remove(this.event);
            if (event!=null){ this.event= new io.fabric8.kubernetes.api.model.events.EventBuilder(event); _visitables.add(this.event);} return (A) this;
    }

    public Boolean hasEvent(){
            return this.event != null;
    }

    public KubeSchemaFluent.EventsEventNested<A> withNewEventsEvent(){
            return new EventsEventNestedImpl();
    }

    public KubeSchemaFluent.EventsEventNested<A> withNewEventLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventNestedImpl(item);
    }

    public KubeSchemaFluent.EventsEventNested<A> editEventsEvent(){
            return withNewEventLike(getEvent());
    }

    public KubeSchemaFluent.EventsEventNested<A> editOrNewEvent(){
            return withNewEventLike(getEvent() != null ? getEvent(): new io.fabric8.kubernetes.api.model.events.EventBuilder().build());
    }

    public KubeSchemaFluent.EventsEventNested<A> editOrNewEventLike(io.fabric8.kubernetes.api.model.events.Event item){
            return withNewEventLike(getEvent() != null ? getEvent(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEventList instead.
 * @return The buildable object.
 */
@Deprecated public EventList getEventList(){
            return this.eventList!=null?this.eventList.build():null;
    }

    public EventList buildEventList(){
            return this.eventList!=null?this.eventList.build():null;
    }

    public A withEventList(EventList eventList){
            _visitables.remove(this.eventList);
            if (eventList!=null){ this.eventList= new EventListBuilder(eventList); _visitables.add(this.eventList);} return (A) this;
    }

    public Boolean hasEventList(){
            return this.eventList != null;
    }

    public KubeSchemaFluent.EventListNested<A> withNewEventList(){
            return new EventListNestedImpl();
    }

    public KubeSchemaFluent.EventListNested<A> withNewEventListLike(EventList item){
            return new EventListNestedImpl(item);
    }

    public KubeSchemaFluent.EventListNested<A> editEventList(){
            return withNewEventListLike(getEventList());
    }

    public KubeSchemaFluent.EventListNested<A> editOrNewEventList(){
            return withNewEventListLike(getEventList() != null ? getEventList(): new EventListBuilder().build());
    }

    public KubeSchemaFluent.EventListNested<A> editOrNewEventListLike(EventList item){
            return withNewEventListLike(getEventList() != null ? getEventList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEventSeries instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.events.EventSeries getEventSeries(){
            return this.eventSeries!=null?this.eventSeries.build():null;
    }

    public io.fabric8.kubernetes.api.model.events.EventSeries buildEventSeries(){
            return this.eventSeries!=null?this.eventSeries.build():null;
    }

    public A withEventSeries(io.fabric8.kubernetes.api.model.events.EventSeries eventSeries){
            _visitables.remove(this.eventSeries);
            if (eventSeries!=null){ this.eventSeries= new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(eventSeries); _visitables.add(this.eventSeries);} return (A) this;
    }

    public Boolean hasEventSeries(){
            return this.eventSeries != null;
    }

    public KubeSchemaFluent.EventsEventSeriesNested<A> withNewEventsEventSeries(){
            return new EventsEventSeriesNestedImpl();
    }

    public KubeSchemaFluent.EventsEventSeriesNested<A> withNewEventSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item){
            return new EventsEventSeriesNestedImpl(item);
    }

    public KubeSchemaFluent.EventsEventSeriesNested<A> editEventsEventSeries(){
            return withNewEventSeriesLike(getEventSeries());
    }

    public KubeSchemaFluent.EventsEventSeriesNested<A> editOrNewEventSeries(){
            return withNewEventSeriesLike(getEventSeries() != null ? getEventSeries(): new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder().build());
    }

    public KubeSchemaFluent.EventsEventSeriesNested<A> editOrNewEventSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item){
            return withNewEventSeriesLike(getEventSeries() != null ? getEventSeries(): item);
    }

    public String getEventSeriesState(){
            return this.eventSeriesState;
    }

    public A withEventSeriesState(String eventSeriesState){
            this.eventSeriesState=eventSeriesState; return (A) this;
    }

    public Boolean hasEventSeriesState(){
            return this.eventSeriesState != null;
    }

    
/**
 * This method has been deprecated, please use method buildGroup instead.
 * @return The buildable object.
 */
@Deprecated public Group getGroup(){
            return this.group!=null?this.group.build():null;
    }

    public Group buildGroup(){
            return this.group!=null?this.group.build():null;
    }

    public A withGroup(Group group){
            _visitables.remove(this.group);
            if (group!=null){ this.group= new GroupBuilder(group); _visitables.add(this.group);} return (A) this;
    }

    public Boolean hasGroup(){
            return this.group != null;
    }

    public KubeSchemaFluent.GroupNested<A> withNewGroup(){
            return new GroupNestedImpl();
    }

    public KubeSchemaFluent.GroupNested<A> withNewGroupLike(Group item){
            return new GroupNestedImpl(item);
    }

    public KubeSchemaFluent.GroupNested<A> editGroup(){
            return withNewGroupLike(getGroup());
    }

    public KubeSchemaFluent.GroupNested<A> editOrNewGroup(){
            return withNewGroupLike(getGroup() != null ? getGroup(): new GroupBuilder().build());
    }

    public KubeSchemaFluent.GroupNested<A> editOrNewGroupLike(Group item){
            return withNewGroupLike(getGroup() != null ? getGroup(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGroupList instead.
 * @return The buildable object.
 */
@Deprecated public GroupList getGroupList(){
            return this.groupList!=null?this.groupList.build():null;
    }

    public GroupList buildGroupList(){
            return this.groupList!=null?this.groupList.build():null;
    }

    public A withGroupList(GroupList groupList){
            _visitables.remove(this.groupList);
            if (groupList!=null){ this.groupList= new GroupListBuilder(groupList); _visitables.add(this.groupList);} return (A) this;
    }

    public Boolean hasGroupList(){
            return this.groupList != null;
    }

    public KubeSchemaFluent.GroupListNested<A> withNewGroupList(){
            return new GroupListNestedImpl();
    }

    public KubeSchemaFluent.GroupListNested<A> withNewGroupListLike(GroupList item){
            return new GroupListNestedImpl(item);
    }

    public KubeSchemaFluent.GroupListNested<A> editGroupList(){
            return withNewGroupListLike(getGroupList());
    }

    public KubeSchemaFluent.GroupListNested<A> editOrNewGroupList(){
            return withNewGroupListLike(getGroupList() != null ? getGroupList(): new GroupListBuilder().build());
    }

    public KubeSchemaFluent.GroupListNested<A> editOrNewGroupListLike(GroupList item){
            return withNewGroupListLike(getGroupList() != null ? getGroupList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildHorizontalPodAutoscaler instead.
 * @return The buildable object.
 */
@Deprecated public HorizontalPodAutoscaler getHorizontalPodAutoscaler(){
            return this.horizontalPodAutoscaler!=null?this.horizontalPodAutoscaler.build():null;
    }

    public HorizontalPodAutoscaler buildHorizontalPodAutoscaler(){
            return this.horizontalPodAutoscaler!=null?this.horizontalPodAutoscaler.build():null;
    }

    public A withHorizontalPodAutoscaler(HorizontalPodAutoscaler horizontalPodAutoscaler){
            _visitables.remove(this.horizontalPodAutoscaler);
            if (horizontalPodAutoscaler!=null){ this.horizontalPodAutoscaler= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscaler); _visitables.add(this.horizontalPodAutoscaler);} return (A) this;
    }

    public Boolean hasHorizontalPodAutoscaler(){
            return this.horizontalPodAutoscaler != null;
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> withNewHorizontalPodAutoscaler(){
            return new HorizontalPodAutoscalerNestedImpl();
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> withNewHorizontalPodAutoscalerLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerNestedImpl(item);
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> editHorizontalPodAutoscaler(){
            return withNewHorizontalPodAutoscalerLike(getHorizontalPodAutoscaler());
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> editOrNewHorizontalPodAutoscaler(){
            return withNewHorizontalPodAutoscalerLike(getHorizontalPodAutoscaler() != null ? getHorizontalPodAutoscaler(): new HorizontalPodAutoscalerBuilder().build());
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> editOrNewHorizontalPodAutoscalerLike(HorizontalPodAutoscaler item){
            return withNewHorizontalPodAutoscalerLike(getHorizontalPodAutoscaler() != null ? getHorizontalPodAutoscaler(): item);
    }

    
/**
 * This method has been deprecated, please use method buildHorizontalPodAutoscalerList instead.
 * @return The buildable object.
 */
@Deprecated public HorizontalPodAutoscalerList getHorizontalPodAutoscalerList(){
            return this.horizontalPodAutoscalerList!=null?this.horizontalPodAutoscalerList.build():null;
    }

    public HorizontalPodAutoscalerList buildHorizontalPodAutoscalerList(){
            return this.horizontalPodAutoscalerList!=null?this.horizontalPodAutoscalerList.build():null;
    }

    public A withHorizontalPodAutoscalerList(HorizontalPodAutoscalerList horizontalPodAutoscalerList){
            _visitables.remove(this.horizontalPodAutoscalerList);
            if (horizontalPodAutoscalerList!=null){ this.horizontalPodAutoscalerList= new HorizontalPodAutoscalerListBuilder(horizontalPodAutoscalerList); _visitables.add(this.horizontalPodAutoscalerList);} return (A) this;
    }

    public Boolean hasHorizontalPodAutoscalerList(){
            return this.horizontalPodAutoscalerList != null;
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> withNewHorizontalPodAutoscalerList(){
            return new HorizontalPodAutoscalerListNestedImpl();
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> withNewHorizontalPodAutoscalerListLike(HorizontalPodAutoscalerList item){
            return new HorizontalPodAutoscalerListNestedImpl(item);
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> editHorizontalPodAutoscalerList(){
            return withNewHorizontalPodAutoscalerListLike(getHorizontalPodAutoscalerList());
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> editOrNewHorizontalPodAutoscalerList(){
            return withNewHorizontalPodAutoscalerListLike(getHorizontalPodAutoscalerList() != null ? getHorizontalPodAutoscalerList(): new HorizontalPodAutoscalerListBuilder().build());
    }

    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> editOrNewHorizontalPodAutoscalerListLike(HorizontalPodAutoscalerList item){
            return withNewHorizontalPodAutoscalerListLike(getHorizontalPodAutoscalerList() != null ? getHorizontalPodAutoscalerList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIdentity instead.
 * @return The buildable object.
 */
@Deprecated public Identity getIdentity(){
            return this.identity!=null?this.identity.build():null;
    }

    public Identity buildIdentity(){
            return this.identity!=null?this.identity.build():null;
    }

    public A withIdentity(Identity identity){
            _visitables.remove(this.identity);
            if (identity!=null){ this.identity= new IdentityBuilder(identity); _visitables.add(this.identity);} return (A) this;
    }

    public Boolean hasIdentity(){
            return this.identity != null;
    }

    public KubeSchemaFluent.IdentityNested<A> withNewIdentity(){
            return new IdentityNestedImpl();
    }

    public KubeSchemaFluent.IdentityNested<A> withNewIdentityLike(Identity item){
            return new IdentityNestedImpl(item);
    }

    public KubeSchemaFluent.IdentityNested<A> editIdentity(){
            return withNewIdentityLike(getIdentity());
    }

    public KubeSchemaFluent.IdentityNested<A> editOrNewIdentity(){
            return withNewIdentityLike(getIdentity() != null ? getIdentity(): new IdentityBuilder().build());
    }

    public KubeSchemaFluent.IdentityNested<A> editOrNewIdentityLike(Identity item){
            return withNewIdentityLike(getIdentity() != null ? getIdentity(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIdentityList instead.
 * @return The buildable object.
 */
@Deprecated public IdentityList getIdentityList(){
            return this.identityList!=null?this.identityList.build():null;
    }

    public IdentityList buildIdentityList(){
            return this.identityList!=null?this.identityList.build():null;
    }

    public A withIdentityList(IdentityList identityList){
            _visitables.remove(this.identityList);
            if (identityList!=null){ this.identityList= new IdentityListBuilder(identityList); _visitables.add(this.identityList);} return (A) this;
    }

    public Boolean hasIdentityList(){
            return this.identityList != null;
    }

    public KubeSchemaFluent.IdentityListNested<A> withNewIdentityList(){
            return new IdentityListNestedImpl();
    }

    public KubeSchemaFluent.IdentityListNested<A> withNewIdentityListLike(IdentityList item){
            return new IdentityListNestedImpl(item);
    }

    public KubeSchemaFluent.IdentityListNested<A> editIdentityList(){
            return withNewIdentityListLike(getIdentityList());
    }

    public KubeSchemaFluent.IdentityListNested<A> editOrNewIdentityList(){
            return withNewIdentityListLike(getIdentityList() != null ? getIdentityList(): new IdentityListBuilder().build());
    }

    public KubeSchemaFluent.IdentityListNested<A> editOrNewIdentityListLike(IdentityList item){
            return withNewIdentityListLike(getIdentityList() != null ? getIdentityList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImageList instead.
 * @return The buildable object.
 */
@Deprecated public ImageList getImageList(){
            return this.imageList!=null?this.imageList.build():null;
    }

    public ImageList buildImageList(){
            return this.imageList!=null?this.imageList.build():null;
    }

    public A withImageList(ImageList imageList){
            _visitables.remove(this.imageList);
            if (imageList!=null){ this.imageList= new ImageListBuilder(imageList); _visitables.add(this.imageList);} return (A) this;
    }

    public Boolean hasImageList(){
            return this.imageList != null;
    }

    public KubeSchemaFluent.ImageListNested<A> withNewImageList(){
            return new ImageListNestedImpl();
    }

    public KubeSchemaFluent.ImageListNested<A> withNewImageListLike(ImageList item){
            return new ImageListNestedImpl(item);
    }

    public KubeSchemaFluent.ImageListNested<A> editImageList(){
            return withNewImageListLike(getImageList());
    }

    public KubeSchemaFluent.ImageListNested<A> editOrNewImageList(){
            return withNewImageListLike(getImageList() != null ? getImageList(): new ImageListBuilder().build());
    }

    public KubeSchemaFluent.ImageListNested<A> editOrNewImageListLike(ImageList item){
            return withNewImageListLike(getImageList() != null ? getImageList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImageStreamImport instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamImport getImageStreamImport(){
            return this.imageStreamImport!=null?this.imageStreamImport.build():null;
    }

    public ImageStreamImport buildImageStreamImport(){
            return this.imageStreamImport!=null?this.imageStreamImport.build():null;
    }

    public A withImageStreamImport(ImageStreamImport imageStreamImport){
            _visitables.remove(this.imageStreamImport);
            if (imageStreamImport!=null){ this.imageStreamImport= new ImageStreamImportBuilder(imageStreamImport); _visitables.add(this.imageStreamImport);} return (A) this;
    }

    public Boolean hasImageStreamImport(){
            return this.imageStreamImport != null;
    }

    public KubeSchemaFluent.ImageStreamImportNested<A> withNewImageStreamImport(){
            return new ImageStreamImportNestedImpl();
    }

    public KubeSchemaFluent.ImageStreamImportNested<A> withNewImageStreamImportLike(ImageStreamImport item){
            return new ImageStreamImportNestedImpl(item);
    }

    public KubeSchemaFluent.ImageStreamImportNested<A> editImageStreamImport(){
            return withNewImageStreamImportLike(getImageStreamImport());
    }

    public KubeSchemaFluent.ImageStreamImportNested<A> editOrNewImageStreamImport(){
            return withNewImageStreamImportLike(getImageStreamImport() != null ? getImageStreamImport(): new ImageStreamImportBuilder().build());
    }

    public KubeSchemaFluent.ImageStreamImportNested<A> editOrNewImageStreamImportLike(ImageStreamImport item){
            return withNewImageStreamImportLike(getImageStreamImport() != null ? getImageStreamImport(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImageStreamList instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamList getImageStreamList(){
            return this.imageStreamList!=null?this.imageStreamList.build():null;
    }

    public ImageStreamList buildImageStreamList(){
            return this.imageStreamList!=null?this.imageStreamList.build():null;
    }

    public A withImageStreamList(ImageStreamList imageStreamList){
            _visitables.remove(this.imageStreamList);
            if (imageStreamList!=null){ this.imageStreamList= new ImageStreamListBuilder(imageStreamList); _visitables.add(this.imageStreamList);} return (A) this;
    }

    public Boolean hasImageStreamList(){
            return this.imageStreamList != null;
    }

    public KubeSchemaFluent.ImageStreamListNested<A> withNewImageStreamList(){
            return new ImageStreamListNestedImpl();
    }

    public KubeSchemaFluent.ImageStreamListNested<A> withNewImageStreamListLike(ImageStreamList item){
            return new ImageStreamListNestedImpl(item);
    }

    public KubeSchemaFluent.ImageStreamListNested<A> editImageStreamList(){
            return withNewImageStreamListLike(getImageStreamList());
    }

    public KubeSchemaFluent.ImageStreamListNested<A> editOrNewImageStreamList(){
            return withNewImageStreamListLike(getImageStreamList() != null ? getImageStreamList(): new ImageStreamListBuilder().build());
    }

    public KubeSchemaFluent.ImageStreamListNested<A> editOrNewImageStreamListLike(ImageStreamList item){
            return withNewImageStreamListLike(getImageStreamList() != null ? getImageStreamList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImageStreamTagList instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamTagList getImageStreamTagList(){
            return this.imageStreamTagList!=null?this.imageStreamTagList.build():null;
    }

    public ImageStreamTagList buildImageStreamTagList(){
            return this.imageStreamTagList!=null?this.imageStreamTagList.build():null;
    }

    public A withImageStreamTagList(ImageStreamTagList imageStreamTagList){
            _visitables.remove(this.imageStreamTagList);
            if (imageStreamTagList!=null){ this.imageStreamTagList= new ImageStreamTagListBuilder(imageStreamTagList); _visitables.add(this.imageStreamTagList);} return (A) this;
    }

    public Boolean hasImageStreamTagList(){
            return this.imageStreamTagList != null;
    }

    public KubeSchemaFluent.ImageStreamTagListNested<A> withNewImageStreamTagList(){
            return new ImageStreamTagListNestedImpl();
    }

    public KubeSchemaFluent.ImageStreamTagListNested<A> withNewImageStreamTagListLike(ImageStreamTagList item){
            return new ImageStreamTagListNestedImpl(item);
    }

    public KubeSchemaFluent.ImageStreamTagListNested<A> editImageStreamTagList(){
            return withNewImageStreamTagListLike(getImageStreamTagList());
    }

    public KubeSchemaFluent.ImageStreamTagListNested<A> editOrNewImageStreamTagList(){
            return withNewImageStreamTagListLike(getImageStreamTagList() != null ? getImageStreamTagList(): new ImageStreamTagListBuilder().build());
    }

    public KubeSchemaFluent.ImageStreamTagListNested<A> editOrNewImageStreamTagListLike(ImageStreamTagList item){
            return withNewImageStreamTagListLike(getImageStreamTagList() != null ? getImageStreamTagList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildInfo instead.
 * @return The buildable object.
 */
@Deprecated public Info getInfo(){
            return this.info!=null?this.info.build():null;
    }

    public Info buildInfo(){
            return this.info!=null?this.info.build():null;
    }

    public A withInfo(Info info){
            _visitables.remove(this.info);
            if (info!=null){ this.info= new InfoBuilder(info); _visitables.add(this.info);} return (A) this;
    }

    public Boolean hasInfo(){
            return this.info != null;
    }

    public KubeSchemaFluent.InfoNested<A> withNewInfo(){
            return new InfoNestedImpl();
    }

    public KubeSchemaFluent.InfoNested<A> withNewInfoLike(Info item){
            return new InfoNestedImpl(item);
    }

    public KubeSchemaFluent.InfoNested<A> editInfo(){
            return withNewInfoLike(getInfo());
    }

    public KubeSchemaFluent.InfoNested<A> editOrNewInfo(){
            return withNewInfoLike(getInfo() != null ? getInfo(): new InfoBuilder().build());
    }

    public KubeSchemaFluent.InfoNested<A> editOrNewInfoLike(Info item){
            return withNewInfoLike(getInfo() != null ? getInfo(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public Ingress getIngress(){
            return this.ingress!=null?this.ingress.build():null;
    }

    public Ingress buildIngress(){
            return this.ingress!=null?this.ingress.build():null;
    }

    public A withIngress(Ingress ingress){
            _visitables.remove(this.ingress);
            if (ingress!=null){ this.ingress= new IngressBuilder(ingress); _visitables.add(this.ingress);} return (A) this;
    }

    public Boolean hasIngress(){
            return this.ingress != null;
    }

    public KubeSchemaFluent.IngressNested<A> withNewIngress(){
            return new IngressNestedImpl();
    }

    public KubeSchemaFluent.IngressNested<A> withNewIngressLike(Ingress item){
            return new IngressNestedImpl(item);
    }

    public KubeSchemaFluent.IngressNested<A> editIngress(){
            return withNewIngressLike(getIngress());
    }

    public KubeSchemaFluent.IngressNested<A> editOrNewIngress(){
            return withNewIngressLike(getIngress() != null ? getIngress(): new IngressBuilder().build());
    }

    public KubeSchemaFluent.IngressNested<A> editOrNewIngressLike(Ingress item){
            return withNewIngressLike(getIngress() != null ? getIngress(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIngressList instead.
 * @return The buildable object.
 */
@Deprecated public IngressList getIngressList(){
            return this.ingressList!=null?this.ingressList.build():null;
    }

    public IngressList buildIngressList(){
            return this.ingressList!=null?this.ingressList.build():null;
    }

    public A withIngressList(IngressList ingressList){
            _visitables.remove(this.ingressList);
            if (ingressList!=null){ this.ingressList= new IngressListBuilder(ingressList); _visitables.add(this.ingressList);} return (A) this;
    }

    public Boolean hasIngressList(){
            return this.ingressList != null;
    }

    public KubeSchemaFluent.IngressListNested<A> withNewIngressList(){
            return new IngressListNestedImpl();
    }

    public KubeSchemaFluent.IngressListNested<A> withNewIngressListLike(IngressList item){
            return new IngressListNestedImpl(item);
    }

    public KubeSchemaFluent.IngressListNested<A> editIngressList(){
            return withNewIngressListLike(getIngressList());
    }

    public KubeSchemaFluent.IngressListNested<A> editOrNewIngressList(){
            return withNewIngressListLike(getIngressList() != null ? getIngressList(): new IngressListBuilder().build());
    }

    public KubeSchemaFluent.IngressListNested<A> editOrNewIngressListLike(IngressList item){
            return withNewIngressListLike(getIngressList() != null ? getIngressList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildInitializer instead.
 * @return The buildable object.
 */
@Deprecated public Initializer getInitializer(){
            return this.initializer!=null?this.initializer.build():null;
    }

    public Initializer buildInitializer(){
            return this.initializer!=null?this.initializer.build():null;
    }

    public A withInitializer(Initializer initializer){
            _visitables.remove(this.initializer);
            if (initializer!=null){ this.initializer= new InitializerBuilder(initializer); _visitables.add(this.initializer);} return (A) this;
    }

    public Boolean hasInitializer(){
            return this.initializer != null;
    }

    public A withNewInitializer(String name){
            return (A)withInitializer(new Initializer(name));
    }

    public KubeSchemaFluent.InitializerNested<A> withNewInitializer(){
            return new InitializerNestedImpl();
    }

    public KubeSchemaFluent.InitializerNested<A> withNewInitializerLike(Initializer item){
            return new InitializerNestedImpl(item);
    }

    public KubeSchemaFluent.InitializerNested<A> editInitializer(){
            return withNewInitializerLike(getInitializer());
    }

    public KubeSchemaFluent.InitializerNested<A> editOrNewInitializer(){
            return withNewInitializerLike(getInitializer() != null ? getInitializer(): new InitializerBuilder().build());
    }

    public KubeSchemaFluent.InitializerNested<A> editOrNewInitializerLike(Initializer item){
            return withNewInitializerLike(getInitializer() != null ? getInitializer(): item);
    }

    
/**
 * This method has been deprecated, please use method buildInitializers instead.
 * @return The buildable object.
 */
@Deprecated public Initializers getInitializers(){
            return this.initializers!=null?this.initializers.build():null;
    }

    public Initializers buildInitializers(){
            return this.initializers!=null?this.initializers.build():null;
    }

    public A withInitializers(Initializers initializers){
            _visitables.remove(this.initializers);
            if (initializers!=null){ this.initializers= new InitializersBuilder(initializers); _visitables.add(this.initializers);} return (A) this;
    }

    public Boolean hasInitializers(){
            return this.initializers != null;
    }

    public KubeSchemaFluent.InitializersNested<A> withNewInitializers(){
            return new InitializersNestedImpl();
    }

    public KubeSchemaFluent.InitializersNested<A> withNewInitializersLike(Initializers item){
            return new InitializersNestedImpl(item);
    }

    public KubeSchemaFluent.InitializersNested<A> editInitializers(){
            return withNewInitializersLike(getInitializers());
    }

    public KubeSchemaFluent.InitializersNested<A> editOrNewInitializers(){
            return withNewInitializersLike(getInitializers() != null ? getInitializers(): new InitializersBuilder().build());
    }

    public KubeSchemaFluent.InitializersNested<A> editOrNewInitializersLike(Initializers item){
            return withNewInitializersLike(getInitializers() != null ? getInitializers(): item);
    }

    
/**
 * This method has been deprecated, please use method buildJSONSchemaPropsorStringArray instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrStringArray getJSONSchemaPropsorStringArray(){
            return this.jSONSchemaPropsorStringArray!=null?this.jSONSchemaPropsorStringArray.build():null;
    }

    public JSONSchemaPropsOrStringArray buildJSONSchemaPropsorStringArray(){
            return this.jSONSchemaPropsorStringArray!=null?this.jSONSchemaPropsorStringArray.build():null;
    }

    public A withJSONSchemaPropsorStringArray(JSONSchemaPropsOrStringArray jSONSchemaPropsorStringArray){
            _visitables.remove(this.jSONSchemaPropsorStringArray);
            if (jSONSchemaPropsorStringArray!=null){ this.jSONSchemaPropsorStringArray= new JSONSchemaPropsOrStringArrayBuilder(jSONSchemaPropsorStringArray); _visitables.add(this.jSONSchemaPropsorStringArray);} return (A) this;
    }

    public Boolean hasJSONSchemaPropsorStringArray(){
            return this.jSONSchemaPropsorStringArray != null;
    }

    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> withNewJSONSchemaPropsorStringArray(){
            return new JSONSchemaPropsorStringArrayNestedImpl();
    }

    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> withNewJSONSchemaPropsorStringArrayLike(JSONSchemaPropsOrStringArray item){
            return new JSONSchemaPropsorStringArrayNestedImpl(item);
    }

    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> editJSONSchemaPropsorStringArray(){
            return withNewJSONSchemaPropsorStringArrayLike(getJSONSchemaPropsorStringArray());
    }

    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> editOrNewJSONSchemaPropsorStringArray(){
            return withNewJSONSchemaPropsorStringArrayLike(getJSONSchemaPropsorStringArray() != null ? getJSONSchemaPropsorStringArray(): new JSONSchemaPropsOrStringArrayBuilder().build());
    }

    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> editOrNewJSONSchemaPropsorStringArrayLike(JSONSchemaPropsOrStringArray item){
            return withNewJSONSchemaPropsorStringArrayLike(getJSONSchemaPropsorStringArray() != null ? getJSONSchemaPropsorStringArray(): item);
    }

    
/**
 * This method has been deprecated, please use method buildJob instead.
 * @return The buildable object.
 */
@Deprecated public Job getJob(){
            return this.job!=null?this.job.build():null;
    }

    public Job buildJob(){
            return this.job!=null?this.job.build():null;
    }

    public A withJob(Job job){
            _visitables.remove(this.job);
            if (job!=null){ this.job= new JobBuilder(job); _visitables.add(this.job);} return (A) this;
    }

    public Boolean hasJob(){
            return this.job != null;
    }

    public KubeSchemaFluent.JobNested<A> withNewJob(){
            return new JobNestedImpl();
    }

    public KubeSchemaFluent.JobNested<A> withNewJobLike(Job item){
            return new JobNestedImpl(item);
    }

    public KubeSchemaFluent.JobNested<A> editJob(){
            return withNewJobLike(getJob());
    }

    public KubeSchemaFluent.JobNested<A> editOrNewJob(){
            return withNewJobLike(getJob() != null ? getJob(): new JobBuilder().build());
    }

    public KubeSchemaFluent.JobNested<A> editOrNewJobLike(Job item){
            return withNewJobLike(getJob() != null ? getJob(): item);
    }

    
/**
 * This method has been deprecated, please use method buildJobList instead.
 * @return The buildable object.
 */
@Deprecated public JobList getJobList(){
            return this.jobList!=null?this.jobList.build():null;
    }

    public JobList buildJobList(){
            return this.jobList!=null?this.jobList.build():null;
    }

    public A withJobList(JobList jobList){
            _visitables.remove(this.jobList);
            if (jobList!=null){ this.jobList= new JobListBuilder(jobList); _visitables.add(this.jobList);} return (A) this;
    }

    public Boolean hasJobList(){
            return this.jobList != null;
    }

    public KubeSchemaFluent.JobListNested<A> withNewJobList(){
            return new JobListNestedImpl();
    }

    public KubeSchemaFluent.JobListNested<A> withNewJobListLike(JobList item){
            return new JobListNestedImpl(item);
    }

    public KubeSchemaFluent.JobListNested<A> editJobList(){
            return withNewJobListLike(getJobList());
    }

    public KubeSchemaFluent.JobListNested<A> editOrNewJobList(){
            return withNewJobListLike(getJobList() != null ? getJobList(): new JobListBuilder().build());
    }

    public KubeSchemaFluent.JobListNested<A> editOrNewJobListLike(JobList item){
            return withNewJobListLike(getJobList() != null ? getJobList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildK8sLocalSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public LocalSubjectAccessReview getK8sLocalSubjectAccessReview(){
            return this.k8sLocalSubjectAccessReview!=null?this.k8sLocalSubjectAccessReview.build():null;
    }

    public LocalSubjectAccessReview buildK8sLocalSubjectAccessReview(){
            return this.k8sLocalSubjectAccessReview!=null?this.k8sLocalSubjectAccessReview.build():null;
    }

    public A withK8sLocalSubjectAccessReview(LocalSubjectAccessReview k8sLocalSubjectAccessReview){
            _visitables.remove(this.k8sLocalSubjectAccessReview);
            if (k8sLocalSubjectAccessReview!=null){ this.k8sLocalSubjectAccessReview= new LocalSubjectAccessReviewBuilder(k8sLocalSubjectAccessReview); _visitables.add(this.k8sLocalSubjectAccessReview);} return (A) this;
    }

    public Boolean hasK8sLocalSubjectAccessReview(){
            return this.k8sLocalSubjectAccessReview != null;
    }

    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> withNewK8sLocalSubjectAccessReview(){
            return new K8sLocalSubjectAccessReviewNestedImpl();
    }

    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> withNewK8sLocalSubjectAccessReviewLike(LocalSubjectAccessReview item){
            return new K8sLocalSubjectAccessReviewNestedImpl(item);
    }

    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> editK8sLocalSubjectAccessReview(){
            return withNewK8sLocalSubjectAccessReviewLike(getK8sLocalSubjectAccessReview());
    }

    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> editOrNewK8sLocalSubjectAccessReview(){
            return withNewK8sLocalSubjectAccessReviewLike(getK8sLocalSubjectAccessReview() != null ? getK8sLocalSubjectAccessReview(): new LocalSubjectAccessReviewBuilder().build());
    }

    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> editOrNewK8sLocalSubjectAccessReviewLike(LocalSubjectAccessReview item){
            return withNewK8sLocalSubjectAccessReviewLike(getK8sLocalSubjectAccessReview() != null ? getK8sLocalSubjectAccessReview(): item);
    }

    
/**
 * This method has been deprecated, please use method buildK8sSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReview getK8sSubjectAccessReview(){
            return this.k8sSubjectAccessReview!=null?this.k8sSubjectAccessReview.build():null;
    }

    public SubjectAccessReview buildK8sSubjectAccessReview(){
            return this.k8sSubjectAccessReview!=null?this.k8sSubjectAccessReview.build():null;
    }

    public A withK8sSubjectAccessReview(SubjectAccessReview k8sSubjectAccessReview){
            _visitables.remove(this.k8sSubjectAccessReview);
            if (k8sSubjectAccessReview!=null){ this.k8sSubjectAccessReview= new SubjectAccessReviewBuilder(k8sSubjectAccessReview); _visitables.add(this.k8sSubjectAccessReview);} return (A) this;
    }

    public Boolean hasK8sSubjectAccessReview(){
            return this.k8sSubjectAccessReview != null;
    }

    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> withNewK8sSubjectAccessReview(){
            return new K8sSubjectAccessReviewNestedImpl();
    }

    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> withNewK8sSubjectAccessReviewLike(SubjectAccessReview item){
            return new K8sSubjectAccessReviewNestedImpl(item);
    }

    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> editK8sSubjectAccessReview(){
            return withNewK8sSubjectAccessReviewLike(getK8sSubjectAccessReview());
    }

    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> editOrNewK8sSubjectAccessReview(){
            return withNewK8sSubjectAccessReviewLike(getK8sSubjectAccessReview() != null ? getK8sSubjectAccessReview(): new SubjectAccessReviewBuilder().build());
    }

    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> editOrNewK8sSubjectAccessReviewLike(SubjectAccessReview item){
            return withNewK8sSubjectAccessReviewLike(getK8sSubjectAccessReview() != null ? getK8sSubjectAccessReview(): item);
    }

    
/**
 * This method has been deprecated, please use method buildLimitRangeList instead.
 * @return The buildable object.
 */
@Deprecated public LimitRangeList getLimitRangeList(){
            return this.limitRangeList!=null?this.limitRangeList.build():null;
    }

    public LimitRangeList buildLimitRangeList(){
            return this.limitRangeList!=null?this.limitRangeList.build():null;
    }

    public A withLimitRangeList(LimitRangeList limitRangeList){
            _visitables.remove(this.limitRangeList);
            if (limitRangeList!=null){ this.limitRangeList= new LimitRangeListBuilder(limitRangeList); _visitables.add(this.limitRangeList);} return (A) this;
    }

    public Boolean hasLimitRangeList(){
            return this.limitRangeList != null;
    }

    public KubeSchemaFluent.LimitRangeListNested<A> withNewLimitRangeList(){
            return new LimitRangeListNestedImpl();
    }

    public KubeSchemaFluent.LimitRangeListNested<A> withNewLimitRangeListLike(LimitRangeList item){
            return new LimitRangeListNestedImpl(item);
    }

    public KubeSchemaFluent.LimitRangeListNested<A> editLimitRangeList(){
            return withNewLimitRangeListLike(getLimitRangeList());
    }

    public KubeSchemaFluent.LimitRangeListNested<A> editOrNewLimitRangeList(){
            return withNewLimitRangeListLike(getLimitRangeList() != null ? getLimitRangeList(): new LimitRangeListBuilder().build());
    }

    public KubeSchemaFluent.LimitRangeListNested<A> editOrNewLimitRangeListLike(LimitRangeList item){
            return withNewLimitRangeListLike(getLimitRangeList() != null ? getLimitRangeList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildLocalSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.LocalSubjectAccessReview getLocalSubjectAccessReview(){
            return this.localSubjectAccessReview!=null?this.localSubjectAccessReview.build():null;
    }

    public io.fabric8.openshift.api.model.LocalSubjectAccessReview buildLocalSubjectAccessReview(){
            return this.localSubjectAccessReview!=null?this.localSubjectAccessReview.build():null;
    }

    public A withLocalSubjectAccessReview(io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReview){
            _visitables.remove(this.localSubjectAccessReview);
            if (localSubjectAccessReview!=null){ this.localSubjectAccessReview= new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder(localSubjectAccessReview); _visitables.add(this.localSubjectAccessReview);} return (A) this;
    }

    public Boolean hasLocalSubjectAccessReview(){
            return this.localSubjectAccessReview != null;
    }

    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> withNewModelLocalSubjectAccessReview(){
            return new ModelLocalSubjectAccessReviewNestedImpl();
    }

    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> withNewLocalSubjectAccessReviewLike(io.fabric8.openshift.api.model.LocalSubjectAccessReview item){
            return new ModelLocalSubjectAccessReviewNestedImpl(item);
    }

    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> editModelLocalSubjectAccessReview(){
            return withNewLocalSubjectAccessReviewLike(getLocalSubjectAccessReview());
    }

    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> editOrNewLocalSubjectAccessReview(){
            return withNewLocalSubjectAccessReviewLike(getLocalSubjectAccessReview() != null ? getLocalSubjectAccessReview(): new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder().build());
    }

    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> editOrNewLocalSubjectAccessReviewLike(io.fabric8.openshift.api.model.LocalSubjectAccessReview item){
            return withNewLocalSubjectAccessReviewLike(getLocalSubjectAccessReview() != null ? getLocalSubjectAccessReview(): item);
    }

    
/**
 * This method has been deprecated, please use method buildMutatingWebhookConfiguration instead.
 * @return The buildable object.
 */
@Deprecated public MutatingWebhookConfiguration getMutatingWebhookConfiguration(){
            return this.mutatingWebhookConfiguration!=null?this.mutatingWebhookConfiguration.build():null;
    }

    public MutatingWebhookConfiguration buildMutatingWebhookConfiguration(){
            return this.mutatingWebhookConfiguration!=null?this.mutatingWebhookConfiguration.build():null;
    }

    public A withMutatingWebhookConfiguration(MutatingWebhookConfiguration mutatingWebhookConfiguration){
            _visitables.remove(this.mutatingWebhookConfiguration);
            if (mutatingWebhookConfiguration!=null){ this.mutatingWebhookConfiguration= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfiguration); _visitables.add(this.mutatingWebhookConfiguration);} return (A) this;
    }

    public Boolean hasMutatingWebhookConfiguration(){
            return this.mutatingWebhookConfiguration != null;
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> withNewMutatingWebhookConfiguration(){
            return new MutatingWebhookConfigurationNestedImpl();
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> withNewMutatingWebhookConfigurationLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationNestedImpl(item);
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> editMutatingWebhookConfiguration(){
            return withNewMutatingWebhookConfigurationLike(getMutatingWebhookConfiguration());
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> editOrNewMutatingWebhookConfiguration(){
            return withNewMutatingWebhookConfigurationLike(getMutatingWebhookConfiguration() != null ? getMutatingWebhookConfiguration(): new MutatingWebhookConfigurationBuilder().build());
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> editOrNewMutatingWebhookConfigurationLike(MutatingWebhookConfiguration item){
            return withNewMutatingWebhookConfigurationLike(getMutatingWebhookConfiguration() != null ? getMutatingWebhookConfiguration(): item);
    }

    
/**
 * This method has been deprecated, please use method buildMutatingWebhookConfigurationList instead.
 * @return The buildable object.
 */
@Deprecated public MutatingWebhookConfigurationList getMutatingWebhookConfigurationList(){
            return this.mutatingWebhookConfigurationList!=null?this.mutatingWebhookConfigurationList.build():null;
    }

    public MutatingWebhookConfigurationList buildMutatingWebhookConfigurationList(){
            return this.mutatingWebhookConfigurationList!=null?this.mutatingWebhookConfigurationList.build():null;
    }

    public A withMutatingWebhookConfigurationList(MutatingWebhookConfigurationList mutatingWebhookConfigurationList){
            _visitables.remove(this.mutatingWebhookConfigurationList);
            if (mutatingWebhookConfigurationList!=null){ this.mutatingWebhookConfigurationList= new MutatingWebhookConfigurationListBuilder(mutatingWebhookConfigurationList); _visitables.add(this.mutatingWebhookConfigurationList);} return (A) this;
    }

    public Boolean hasMutatingWebhookConfigurationList(){
            return this.mutatingWebhookConfigurationList != null;
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> withNewMutatingWebhookConfigurationList(){
            return new MutatingWebhookConfigurationListNestedImpl();
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> withNewMutatingWebhookConfigurationListLike(MutatingWebhookConfigurationList item){
            return new MutatingWebhookConfigurationListNestedImpl(item);
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> editMutatingWebhookConfigurationList(){
            return withNewMutatingWebhookConfigurationListLike(getMutatingWebhookConfigurationList());
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> editOrNewMutatingWebhookConfigurationList(){
            return withNewMutatingWebhookConfigurationListLike(getMutatingWebhookConfigurationList() != null ? getMutatingWebhookConfigurationList(): new MutatingWebhookConfigurationListBuilder().build());
    }

    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> editOrNewMutatingWebhookConfigurationListLike(MutatingWebhookConfigurationList item){
            return withNewMutatingWebhookConfigurationListLike(getMutatingWebhookConfigurationList() != null ? getMutatingWebhookConfigurationList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNamespace instead.
 * @return The buildable object.
 */
@Deprecated public Namespace getNamespace(){
            return this.namespace!=null?this.namespace.build():null;
    }

    public Namespace buildNamespace(){
            return this.namespace!=null?this.namespace.build():null;
    }

    public A withNamespace(Namespace namespace){
            _visitables.remove(this.namespace);
            if (namespace!=null){ this.namespace= new NamespaceBuilder(namespace); _visitables.add(this.namespace);} return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public KubeSchemaFluent.NamespaceNested<A> withNewNamespace(){
            return new NamespaceNestedImpl();
    }

    public KubeSchemaFluent.NamespaceNested<A> withNewNamespaceLike(Namespace item){
            return new NamespaceNestedImpl(item);
    }

    public KubeSchemaFluent.NamespaceNested<A> editNamespace(){
            return withNewNamespaceLike(getNamespace());
    }

    public KubeSchemaFluent.NamespaceNested<A> editOrNewNamespace(){
            return withNewNamespaceLike(getNamespace() != null ? getNamespace(): new NamespaceBuilder().build());
    }

    public KubeSchemaFluent.NamespaceNested<A> editOrNewNamespaceLike(Namespace item){
            return withNewNamespaceLike(getNamespace() != null ? getNamespace(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNamespaceList instead.
 * @return The buildable object.
 */
@Deprecated public NamespaceList getNamespaceList(){
            return this.namespaceList!=null?this.namespaceList.build():null;
    }

    public NamespaceList buildNamespaceList(){
            return this.namespaceList!=null?this.namespaceList.build():null;
    }

    public A withNamespaceList(NamespaceList namespaceList){
            _visitables.remove(this.namespaceList);
            if (namespaceList!=null){ this.namespaceList= new NamespaceListBuilder(namespaceList); _visitables.add(this.namespaceList);} return (A) this;
    }

    public Boolean hasNamespaceList(){
            return this.namespaceList != null;
    }

    public KubeSchemaFluent.NamespaceListNested<A> withNewNamespaceList(){
            return new NamespaceListNestedImpl();
    }

    public KubeSchemaFluent.NamespaceListNested<A> withNewNamespaceListLike(NamespaceList item){
            return new NamespaceListNestedImpl(item);
    }

    public KubeSchemaFluent.NamespaceListNested<A> editNamespaceList(){
            return withNewNamespaceListLike(getNamespaceList());
    }

    public KubeSchemaFluent.NamespaceListNested<A> editOrNewNamespaceList(){
            return withNewNamespaceListLike(getNamespaceList() != null ? getNamespaceList(): new NamespaceListBuilder().build());
    }

    public KubeSchemaFluent.NamespaceListNested<A> editOrNewNamespaceListLike(NamespaceList item){
            return withNewNamespaceListLike(getNamespaceList() != null ? getNamespaceList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNetNameSpace instead.
 * @return The buildable object.
 */
@Deprecated public NetNamespace getNetNameSpace(){
            return this.netNameSpace!=null?this.netNameSpace.build():null;
    }

    public NetNamespace buildNetNameSpace(){
            return this.netNameSpace!=null?this.netNameSpace.build():null;
    }

    public A withNetNameSpace(NetNamespace netNameSpace){
            _visitables.remove(this.netNameSpace);
            if (netNameSpace!=null){ this.netNameSpace= new NetNamespaceBuilder(netNameSpace); _visitables.add(this.netNameSpace);} return (A) this;
    }

    public Boolean hasNetNameSpace(){
            return this.netNameSpace != null;
    }

    public KubeSchemaFluent.NetNameSpaceNested<A> withNewNetNameSpace(){
            return new NetNameSpaceNestedImpl();
    }

    public KubeSchemaFluent.NetNameSpaceNested<A> withNewNetNameSpaceLike(NetNamespace item){
            return new NetNameSpaceNestedImpl(item);
    }

    public KubeSchemaFluent.NetNameSpaceNested<A> editNetNameSpace(){
            return withNewNetNameSpaceLike(getNetNameSpace());
    }

    public KubeSchemaFluent.NetNameSpaceNested<A> editOrNewNetNameSpace(){
            return withNewNetNameSpaceLike(getNetNameSpace() != null ? getNetNameSpace(): new NetNamespaceBuilder().build());
    }

    public KubeSchemaFluent.NetNameSpaceNested<A> editOrNewNetNameSpaceLike(NetNamespace item){
            return withNewNetNameSpaceLike(getNetNameSpace() != null ? getNetNameSpace(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNetNameSpaceList instead.
 * @return The buildable object.
 */
@Deprecated public NetNamespaceList getNetNameSpaceList(){
            return this.netNameSpaceList!=null?this.netNameSpaceList.build():null;
    }

    public NetNamespaceList buildNetNameSpaceList(){
            return this.netNameSpaceList!=null?this.netNameSpaceList.build():null;
    }

    public A withNetNameSpaceList(NetNamespaceList netNameSpaceList){
            _visitables.remove(this.netNameSpaceList);
            if (netNameSpaceList!=null){ this.netNameSpaceList= new NetNamespaceListBuilder(netNameSpaceList); _visitables.add(this.netNameSpaceList);} return (A) this;
    }

    public Boolean hasNetNameSpaceList(){
            return this.netNameSpaceList != null;
    }

    public KubeSchemaFluent.NetNameSpaceListNested<A> withNewNetNameSpaceList(){
            return new NetNameSpaceListNestedImpl();
    }

    public KubeSchemaFluent.NetNameSpaceListNested<A> withNewNetNameSpaceListLike(NetNamespaceList item){
            return new NetNameSpaceListNestedImpl(item);
    }

    public KubeSchemaFluent.NetNameSpaceListNested<A> editNetNameSpaceList(){
            return withNewNetNameSpaceListLike(getNetNameSpaceList());
    }

    public KubeSchemaFluent.NetNameSpaceListNested<A> editOrNewNetNameSpaceList(){
            return withNewNetNameSpaceListLike(getNetNameSpaceList() != null ? getNetNameSpaceList(): new NetNamespaceListBuilder().build());
    }

    public KubeSchemaFluent.NetNameSpaceListNested<A> editOrNewNetNameSpaceListLike(NetNamespaceList item){
            return withNewNetNameSpaceListLike(getNetNameSpaceList() != null ? getNetNameSpaceList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNetworkPolicy instead.
 * @return The buildable object.
 */
@Deprecated public NetworkPolicy getNetworkPolicy(){
            return this.networkPolicy!=null?this.networkPolicy.build():null;
    }

    public NetworkPolicy buildNetworkPolicy(){
            return this.networkPolicy!=null?this.networkPolicy.build():null;
    }

    public A withNetworkPolicy(NetworkPolicy networkPolicy){
            _visitables.remove(this.networkPolicy);
            if (networkPolicy!=null){ this.networkPolicy= new NetworkPolicyBuilder(networkPolicy); _visitables.add(this.networkPolicy);} return (A) this;
    }

    public Boolean hasNetworkPolicy(){
            return this.networkPolicy != null;
    }

    public KubeSchemaFluent.NetworkPolicyNested<A> withNewNetworkPolicy(){
            return new NetworkPolicyNestedImpl();
    }

    public KubeSchemaFluent.NetworkPolicyNested<A> withNewNetworkPolicyLike(NetworkPolicy item){
            return new NetworkPolicyNestedImpl(item);
    }

    public KubeSchemaFluent.NetworkPolicyNested<A> editNetworkPolicy(){
            return withNewNetworkPolicyLike(getNetworkPolicy());
    }

    public KubeSchemaFluent.NetworkPolicyNested<A> editOrNewNetworkPolicy(){
            return withNewNetworkPolicyLike(getNetworkPolicy() != null ? getNetworkPolicy(): new NetworkPolicyBuilder().build());
    }

    public KubeSchemaFluent.NetworkPolicyNested<A> editOrNewNetworkPolicyLike(NetworkPolicy item){
            return withNewNetworkPolicyLike(getNetworkPolicy() != null ? getNetworkPolicy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNetworkPolicyList instead.
 * @return The buildable object.
 */
@Deprecated public NetworkPolicyList getNetworkPolicyList(){
            return this.networkPolicyList!=null?this.networkPolicyList.build():null;
    }

    public NetworkPolicyList buildNetworkPolicyList(){
            return this.networkPolicyList!=null?this.networkPolicyList.build():null;
    }

    public A withNetworkPolicyList(NetworkPolicyList networkPolicyList){
            _visitables.remove(this.networkPolicyList);
            if (networkPolicyList!=null){ this.networkPolicyList= new NetworkPolicyListBuilder(networkPolicyList); _visitables.add(this.networkPolicyList);} return (A) this;
    }

    public Boolean hasNetworkPolicyList(){
            return this.networkPolicyList != null;
    }

    public KubeSchemaFluent.NetworkPolicyListNested<A> withNewNetworkPolicyList(){
            return new NetworkPolicyListNestedImpl();
    }

    public KubeSchemaFluent.NetworkPolicyListNested<A> withNewNetworkPolicyListLike(NetworkPolicyList item){
            return new NetworkPolicyListNestedImpl(item);
    }

    public KubeSchemaFluent.NetworkPolicyListNested<A> editNetworkPolicyList(){
            return withNewNetworkPolicyListLike(getNetworkPolicyList());
    }

    public KubeSchemaFluent.NetworkPolicyListNested<A> editOrNewNetworkPolicyList(){
            return withNewNetworkPolicyListLike(getNetworkPolicyList() != null ? getNetworkPolicyList(): new NetworkPolicyListBuilder().build());
    }

    public KubeSchemaFluent.NetworkPolicyListNested<A> editOrNewNetworkPolicyListLike(NetworkPolicyList item){
            return withNewNetworkPolicyListLike(getNetworkPolicyList() != null ? getNetworkPolicyList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNode instead.
 * @return The buildable object.
 */
@Deprecated public Node getNode(){
            return this.node!=null?this.node.build():null;
    }

    public Node buildNode(){
            return this.node!=null?this.node.build():null;
    }

    public A withNode(Node node){
            _visitables.remove(this.node);
            if (node!=null){ this.node= new NodeBuilder(node); _visitables.add(this.node);} return (A) this;
    }

    public Boolean hasNode(){
            return this.node != null;
    }

    public KubeSchemaFluent.NodeNested<A> withNewNode(){
            return new NodeNestedImpl();
    }

    public KubeSchemaFluent.NodeNested<A> withNewNodeLike(Node item){
            return new NodeNestedImpl(item);
    }

    public KubeSchemaFluent.NodeNested<A> editNode(){
            return withNewNodeLike(getNode());
    }

    public KubeSchemaFluent.NodeNested<A> editOrNewNode(){
            return withNewNodeLike(getNode() != null ? getNode(): new NodeBuilder().build());
    }

    public KubeSchemaFluent.NodeNested<A> editOrNewNodeLike(Node item){
            return withNewNodeLike(getNode() != null ? getNode(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNodeList instead.
 * @return The buildable object.
 */
@Deprecated public NodeList getNodeList(){
            return this.nodeList!=null?this.nodeList.build():null;
    }

    public NodeList buildNodeList(){
            return this.nodeList!=null?this.nodeList.build():null;
    }

    public A withNodeList(NodeList nodeList){
            _visitables.remove(this.nodeList);
            if (nodeList!=null){ this.nodeList= new NodeListBuilder(nodeList); _visitables.add(this.nodeList);} return (A) this;
    }

    public Boolean hasNodeList(){
            return this.nodeList != null;
    }

    public KubeSchemaFluent.NodeListNested<A> withNewNodeList(){
            return new NodeListNestedImpl();
    }

    public KubeSchemaFluent.NodeListNested<A> withNewNodeListLike(NodeList item){
            return new NodeListNestedImpl(item);
    }

    public KubeSchemaFluent.NodeListNested<A> editNodeList(){
            return withNewNodeListLike(getNodeList());
    }

    public KubeSchemaFluent.NodeListNested<A> editOrNewNodeList(){
            return withNewNodeListLike(getNodeList() != null ? getNodeList(): new NodeListBuilder().build());
    }

    public KubeSchemaFluent.NodeListNested<A> editOrNewNodeListLike(NodeList item){
            return withNewNodeListLike(getNodeList() != null ? getNodeList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthAccessToken instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAccessToken getOAuthAccessToken(){
            return this.oAuthAccessToken!=null?this.oAuthAccessToken.build():null;
    }

    public OAuthAccessToken buildOAuthAccessToken(){
            return this.oAuthAccessToken!=null?this.oAuthAccessToken.build():null;
    }

    public A withOAuthAccessToken(OAuthAccessToken oAuthAccessToken){
            _visitables.remove(this.oAuthAccessToken);
            if (oAuthAccessToken!=null){ this.oAuthAccessToken= new OAuthAccessTokenBuilder(oAuthAccessToken); _visitables.add(this.oAuthAccessToken);} return (A) this;
    }

    public Boolean hasOAuthAccessToken(){
            return this.oAuthAccessToken != null;
    }

    public KubeSchemaFluent.OAuthAccessTokenNested<A> withNewOAuthAccessToken(){
            return new OAuthAccessTokenNestedImpl();
    }

    public KubeSchemaFluent.OAuthAccessTokenNested<A> withNewOAuthAccessTokenLike(OAuthAccessToken item){
            return new OAuthAccessTokenNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthAccessTokenNested<A> editOAuthAccessToken(){
            return withNewOAuthAccessTokenLike(getOAuthAccessToken());
    }

    public KubeSchemaFluent.OAuthAccessTokenNested<A> editOrNewOAuthAccessToken(){
            return withNewOAuthAccessTokenLike(getOAuthAccessToken() != null ? getOAuthAccessToken(): new OAuthAccessTokenBuilder().build());
    }

    public KubeSchemaFluent.OAuthAccessTokenNested<A> editOrNewOAuthAccessTokenLike(OAuthAccessToken item){
            return withNewOAuthAccessTokenLike(getOAuthAccessToken() != null ? getOAuthAccessToken(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthAccessTokenList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAccessTokenList getOAuthAccessTokenList(){
            return this.oAuthAccessTokenList!=null?this.oAuthAccessTokenList.build():null;
    }

    public OAuthAccessTokenList buildOAuthAccessTokenList(){
            return this.oAuthAccessTokenList!=null?this.oAuthAccessTokenList.build():null;
    }

    public A withOAuthAccessTokenList(OAuthAccessTokenList oAuthAccessTokenList){
            _visitables.remove(this.oAuthAccessTokenList);
            if (oAuthAccessTokenList!=null){ this.oAuthAccessTokenList= new OAuthAccessTokenListBuilder(oAuthAccessTokenList); _visitables.add(this.oAuthAccessTokenList);} return (A) this;
    }

    public Boolean hasOAuthAccessTokenList(){
            return this.oAuthAccessTokenList != null;
    }

    public KubeSchemaFluent.OAuthAccessTokenListNested<A> withNewOAuthAccessTokenList(){
            return new OAuthAccessTokenListNestedImpl();
    }

    public KubeSchemaFluent.OAuthAccessTokenListNested<A> withNewOAuthAccessTokenListLike(OAuthAccessTokenList item){
            return new OAuthAccessTokenListNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthAccessTokenListNested<A> editOAuthAccessTokenList(){
            return withNewOAuthAccessTokenListLike(getOAuthAccessTokenList());
    }

    public KubeSchemaFluent.OAuthAccessTokenListNested<A> editOrNewOAuthAccessTokenList(){
            return withNewOAuthAccessTokenListLike(getOAuthAccessTokenList() != null ? getOAuthAccessTokenList(): new OAuthAccessTokenListBuilder().build());
    }

    public KubeSchemaFluent.OAuthAccessTokenListNested<A> editOrNewOAuthAccessTokenListLike(OAuthAccessTokenList item){
            return withNewOAuthAccessTokenListLike(getOAuthAccessTokenList() != null ? getOAuthAccessTokenList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthAuthorizeToken instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAuthorizeToken getOAuthAuthorizeToken(){
            return this.oAuthAuthorizeToken!=null?this.oAuthAuthorizeToken.build():null;
    }

    public OAuthAuthorizeToken buildOAuthAuthorizeToken(){
            return this.oAuthAuthorizeToken!=null?this.oAuthAuthorizeToken.build():null;
    }

    public A withOAuthAuthorizeToken(OAuthAuthorizeToken oAuthAuthorizeToken){
            _visitables.remove(this.oAuthAuthorizeToken);
            if (oAuthAuthorizeToken!=null){ this.oAuthAuthorizeToken= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeToken); _visitables.add(this.oAuthAuthorizeToken);} return (A) this;
    }

    public Boolean hasOAuthAuthorizeToken(){
            return this.oAuthAuthorizeToken != null;
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> withNewOAuthAuthorizeToken(){
            return new OAuthAuthorizeTokenNestedImpl();
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> withNewOAuthAuthorizeTokenLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> editOAuthAuthorizeToken(){
            return withNewOAuthAuthorizeTokenLike(getOAuthAuthorizeToken());
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> editOrNewOAuthAuthorizeToken(){
            return withNewOAuthAuthorizeTokenLike(getOAuthAuthorizeToken() != null ? getOAuthAuthorizeToken(): new OAuthAuthorizeTokenBuilder().build());
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> editOrNewOAuthAuthorizeTokenLike(OAuthAuthorizeToken item){
            return withNewOAuthAuthorizeTokenLike(getOAuthAuthorizeToken() != null ? getOAuthAuthorizeToken(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthAuthorizeTokenList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAuthorizeTokenList getOAuthAuthorizeTokenList(){
            return this.oAuthAuthorizeTokenList!=null?this.oAuthAuthorizeTokenList.build():null;
    }

    public OAuthAuthorizeTokenList buildOAuthAuthorizeTokenList(){
            return this.oAuthAuthorizeTokenList!=null?this.oAuthAuthorizeTokenList.build():null;
    }

    public A withOAuthAuthorizeTokenList(OAuthAuthorizeTokenList oAuthAuthorizeTokenList){
            _visitables.remove(this.oAuthAuthorizeTokenList);
            if (oAuthAuthorizeTokenList!=null){ this.oAuthAuthorizeTokenList= new OAuthAuthorizeTokenListBuilder(oAuthAuthorizeTokenList); _visitables.add(this.oAuthAuthorizeTokenList);} return (A) this;
    }

    public Boolean hasOAuthAuthorizeTokenList(){
            return this.oAuthAuthorizeTokenList != null;
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> withNewOAuthAuthorizeTokenList(){
            return new OAuthAuthorizeTokenListNestedImpl();
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> withNewOAuthAuthorizeTokenListLike(OAuthAuthorizeTokenList item){
            return new OAuthAuthorizeTokenListNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> editOAuthAuthorizeTokenList(){
            return withNewOAuthAuthorizeTokenListLike(getOAuthAuthorizeTokenList());
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> editOrNewOAuthAuthorizeTokenList(){
            return withNewOAuthAuthorizeTokenListLike(getOAuthAuthorizeTokenList() != null ? getOAuthAuthorizeTokenList(): new OAuthAuthorizeTokenListBuilder().build());
    }

    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> editOrNewOAuthAuthorizeTokenListLike(OAuthAuthorizeTokenList item){
            return withNewOAuthAuthorizeTokenListLike(getOAuthAuthorizeTokenList() != null ? getOAuthAuthorizeTokenList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthClient instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClient getOAuthClient(){
            return this.oAuthClient!=null?this.oAuthClient.build():null;
    }

    public OAuthClient buildOAuthClient(){
            return this.oAuthClient!=null?this.oAuthClient.build():null;
    }

    public A withOAuthClient(OAuthClient oAuthClient){
            _visitables.remove(this.oAuthClient);
            if (oAuthClient!=null){ this.oAuthClient= new OAuthClientBuilder(oAuthClient); _visitables.add(this.oAuthClient);} return (A) this;
    }

    public Boolean hasOAuthClient(){
            return this.oAuthClient != null;
    }

    public KubeSchemaFluent.OAuthClientNested<A> withNewOAuthClient(){
            return new OAuthClientNestedImpl();
    }

    public KubeSchemaFluent.OAuthClientNested<A> withNewOAuthClientLike(OAuthClient item){
            return new OAuthClientNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthClientNested<A> editOAuthClient(){
            return withNewOAuthClientLike(getOAuthClient());
    }

    public KubeSchemaFluent.OAuthClientNested<A> editOrNewOAuthClient(){
            return withNewOAuthClientLike(getOAuthClient() != null ? getOAuthClient(): new OAuthClientBuilder().build());
    }

    public KubeSchemaFluent.OAuthClientNested<A> editOrNewOAuthClientLike(OAuthClient item){
            return withNewOAuthClientLike(getOAuthClient() != null ? getOAuthClient(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthClientAuthorization instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClientAuthorization getOAuthClientAuthorization(){
            return this.oAuthClientAuthorization!=null?this.oAuthClientAuthorization.build():null;
    }

    public OAuthClientAuthorization buildOAuthClientAuthorization(){
            return this.oAuthClientAuthorization!=null?this.oAuthClientAuthorization.build():null;
    }

    public A withOAuthClientAuthorization(OAuthClientAuthorization oAuthClientAuthorization){
            _visitables.remove(this.oAuthClientAuthorization);
            if (oAuthClientAuthorization!=null){ this.oAuthClientAuthorization= new OAuthClientAuthorizationBuilder(oAuthClientAuthorization); _visitables.add(this.oAuthClientAuthorization);} return (A) this;
    }

    public Boolean hasOAuthClientAuthorization(){
            return this.oAuthClientAuthorization != null;
    }

    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> withNewOAuthClientAuthorization(){
            return new OAuthClientAuthorizationNestedImpl();
    }

    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> withNewOAuthClientAuthorizationLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> editOAuthClientAuthorization(){
            return withNewOAuthClientAuthorizationLike(getOAuthClientAuthorization());
    }

    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> editOrNewOAuthClientAuthorization(){
            return withNewOAuthClientAuthorizationLike(getOAuthClientAuthorization() != null ? getOAuthClientAuthorization(): new OAuthClientAuthorizationBuilder().build());
    }

    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> editOrNewOAuthClientAuthorizationLike(OAuthClientAuthorization item){
            return withNewOAuthClientAuthorizationLike(getOAuthClientAuthorization() != null ? getOAuthClientAuthorization(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthClientAuthorizationList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClientAuthorizationList getOAuthClientAuthorizationList(){
            return this.oAuthClientAuthorizationList!=null?this.oAuthClientAuthorizationList.build():null;
    }

    public OAuthClientAuthorizationList buildOAuthClientAuthorizationList(){
            return this.oAuthClientAuthorizationList!=null?this.oAuthClientAuthorizationList.build():null;
    }

    public A withOAuthClientAuthorizationList(OAuthClientAuthorizationList oAuthClientAuthorizationList){
            _visitables.remove(this.oAuthClientAuthorizationList);
            if (oAuthClientAuthorizationList!=null){ this.oAuthClientAuthorizationList= new OAuthClientAuthorizationListBuilder(oAuthClientAuthorizationList); _visitables.add(this.oAuthClientAuthorizationList);} return (A) this;
    }

    public Boolean hasOAuthClientAuthorizationList(){
            return this.oAuthClientAuthorizationList != null;
    }

    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> withNewOAuthClientAuthorizationList(){
            return new OAuthClientAuthorizationListNestedImpl();
    }

    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> withNewOAuthClientAuthorizationListLike(OAuthClientAuthorizationList item){
            return new OAuthClientAuthorizationListNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> editOAuthClientAuthorizationList(){
            return withNewOAuthClientAuthorizationListLike(getOAuthClientAuthorizationList());
    }

    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> editOrNewOAuthClientAuthorizationList(){
            return withNewOAuthClientAuthorizationListLike(getOAuthClientAuthorizationList() != null ? getOAuthClientAuthorizationList(): new OAuthClientAuthorizationListBuilder().build());
    }

    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> editOrNewOAuthClientAuthorizationListLike(OAuthClientAuthorizationList item){
            return withNewOAuthClientAuthorizationListLike(getOAuthClientAuthorizationList() != null ? getOAuthClientAuthorizationList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOAuthClientList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClientList getOAuthClientList(){
            return this.oAuthClientList!=null?this.oAuthClientList.build():null;
    }

    public OAuthClientList buildOAuthClientList(){
            return this.oAuthClientList!=null?this.oAuthClientList.build():null;
    }

    public A withOAuthClientList(OAuthClientList oAuthClientList){
            _visitables.remove(this.oAuthClientList);
            if (oAuthClientList!=null){ this.oAuthClientList= new OAuthClientListBuilder(oAuthClientList); _visitables.add(this.oAuthClientList);} return (A) this;
    }

    public Boolean hasOAuthClientList(){
            return this.oAuthClientList != null;
    }

    public KubeSchemaFluent.OAuthClientListNested<A> withNewOAuthClientList(){
            return new OAuthClientListNestedImpl();
    }

    public KubeSchemaFluent.OAuthClientListNested<A> withNewOAuthClientListLike(OAuthClientList item){
            return new OAuthClientListNestedImpl(item);
    }

    public KubeSchemaFluent.OAuthClientListNested<A> editOAuthClientList(){
            return withNewOAuthClientListLike(getOAuthClientList());
    }

    public KubeSchemaFluent.OAuthClientListNested<A> editOrNewOAuthClientList(){
            return withNewOAuthClientListLike(getOAuthClientList() != null ? getOAuthClientList(): new OAuthClientListBuilder().build());
    }

    public KubeSchemaFluent.OAuthClientListNested<A> editOrNewOAuthClientListLike(OAuthClientList item){
            return withNewOAuthClientListLike(getOAuthClientList() != null ? getOAuthClientList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildObjectMeta instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getObjectMeta(){
            return this.objectMeta!=null?this.objectMeta.build():null;
    }

    public ObjectMeta buildObjectMeta(){
            return this.objectMeta!=null?this.objectMeta.build():null;
    }

    public A withObjectMeta(ObjectMeta objectMeta){
            _visitables.remove(this.objectMeta);
            if (objectMeta!=null){ this.objectMeta= new ObjectMetaBuilder(objectMeta); _visitables.add(this.objectMeta);} return (A) this;
    }

    public Boolean hasObjectMeta(){
            return this.objectMeta != null;
    }

    public KubeSchemaFluent.ObjectMetaNested<A> withNewObjectMeta(){
            return new ObjectMetaNestedImpl();
    }

    public KubeSchemaFluent.ObjectMetaNested<A> withNewObjectMetaLike(ObjectMeta item){
            return new ObjectMetaNestedImpl(item);
    }

    public KubeSchemaFluent.ObjectMetaNested<A> editObjectMeta(){
            return withNewObjectMetaLike(getObjectMeta());
    }

    public KubeSchemaFluent.ObjectMetaNested<A> editOrNewObjectMeta(){
            return withNewObjectMetaLike(getObjectMeta() != null ? getObjectMeta(): new ObjectMetaBuilder().build());
    }

    public KubeSchemaFluent.ObjectMetaNested<A> editOrNewObjectMetaLike(ObjectMeta item){
            return withNewObjectMetaLike(getObjectMeta() != null ? getObjectMeta(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftClusterRole instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRole getOpenshiftClusterRole(){
            return this.openshiftClusterRole!=null?this.openshiftClusterRole.build():null;
    }

    public OpenshiftClusterRole buildOpenshiftClusterRole(){
            return this.openshiftClusterRole!=null?this.openshiftClusterRole.build():null;
    }

    public A withOpenshiftClusterRole(OpenshiftClusterRole openshiftClusterRole){
            _visitables.remove(this.openshiftClusterRole);
            if (openshiftClusterRole!=null){ this.openshiftClusterRole= new OpenshiftClusterRoleBuilder(openshiftClusterRole); _visitables.add(this.openshiftClusterRole);} return (A) this;
    }

    public Boolean hasOpenshiftClusterRole(){
            return this.openshiftClusterRole != null;
    }

    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> withNewOpenshiftClusterRole(){
            return new OpenshiftClusterRoleNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> withNewOpenshiftClusterRoleLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> editOpenshiftClusterRole(){
            return withNewOpenshiftClusterRoleLike(getOpenshiftClusterRole());
    }

    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> editOrNewOpenshiftClusterRole(){
            return withNewOpenshiftClusterRoleLike(getOpenshiftClusterRole() != null ? getOpenshiftClusterRole(): new OpenshiftClusterRoleBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> editOrNewOpenshiftClusterRoleLike(OpenshiftClusterRole item){
            return withNewOpenshiftClusterRoleLike(getOpenshiftClusterRole() != null ? getOpenshiftClusterRole(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftClusterRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRoleBinding getOpenshiftClusterRoleBinding(){
            return this.openshiftClusterRoleBinding!=null?this.openshiftClusterRoleBinding.build():null;
    }

    public OpenshiftClusterRoleBinding buildOpenshiftClusterRoleBinding(){
            return this.openshiftClusterRoleBinding!=null?this.openshiftClusterRoleBinding.build():null;
    }

    public A withOpenshiftClusterRoleBinding(OpenshiftClusterRoleBinding openshiftClusterRoleBinding){
            _visitables.remove(this.openshiftClusterRoleBinding);
            if (openshiftClusterRoleBinding!=null){ this.openshiftClusterRoleBinding= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBinding); _visitables.add(this.openshiftClusterRoleBinding);} return (A) this;
    }

    public Boolean hasOpenshiftClusterRoleBinding(){
            return this.openshiftClusterRoleBinding != null;
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> withNewOpenshiftClusterRoleBinding(){
            return new OpenshiftClusterRoleBindingNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> withNewOpenshiftClusterRoleBindingLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> editOpenshiftClusterRoleBinding(){
            return withNewOpenshiftClusterRoleBindingLike(getOpenshiftClusterRoleBinding());
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> editOrNewOpenshiftClusterRoleBinding(){
            return withNewOpenshiftClusterRoleBindingLike(getOpenshiftClusterRoleBinding() != null ? getOpenshiftClusterRoleBinding(): new OpenshiftClusterRoleBindingBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> editOrNewOpenshiftClusterRoleBindingLike(OpenshiftClusterRoleBinding item){
            return withNewOpenshiftClusterRoleBindingLike(getOpenshiftClusterRoleBinding() != null ? getOpenshiftClusterRoleBinding(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftClusterRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRoleBindingList getOpenshiftClusterRoleBindingList(){
            return this.openshiftClusterRoleBindingList!=null?this.openshiftClusterRoleBindingList.build():null;
    }

    public OpenshiftClusterRoleBindingList buildOpenshiftClusterRoleBindingList(){
            return this.openshiftClusterRoleBindingList!=null?this.openshiftClusterRoleBindingList.build():null;
    }

    public A withOpenshiftClusterRoleBindingList(OpenshiftClusterRoleBindingList openshiftClusterRoleBindingList){
            _visitables.remove(this.openshiftClusterRoleBindingList);
            if (openshiftClusterRoleBindingList!=null){ this.openshiftClusterRoleBindingList= new OpenshiftClusterRoleBindingListBuilder(openshiftClusterRoleBindingList); _visitables.add(this.openshiftClusterRoleBindingList);} return (A) this;
    }

    public Boolean hasOpenshiftClusterRoleBindingList(){
            return this.openshiftClusterRoleBindingList != null;
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> withNewOpenshiftClusterRoleBindingList(){
            return new OpenshiftClusterRoleBindingListNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> withNewOpenshiftClusterRoleBindingListLike(OpenshiftClusterRoleBindingList item){
            return new OpenshiftClusterRoleBindingListNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> editOpenshiftClusterRoleBindingList(){
            return withNewOpenshiftClusterRoleBindingListLike(getOpenshiftClusterRoleBindingList());
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> editOrNewOpenshiftClusterRoleBindingList(){
            return withNewOpenshiftClusterRoleBindingListLike(getOpenshiftClusterRoleBindingList() != null ? getOpenshiftClusterRoleBindingList(): new OpenshiftClusterRoleBindingListBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> editOrNewOpenshiftClusterRoleBindingListLike(OpenshiftClusterRoleBindingList item){
            return withNewOpenshiftClusterRoleBindingListLike(getOpenshiftClusterRoleBindingList() != null ? getOpenshiftClusterRoleBindingList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftRole instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRole getOpenshiftRole(){
            return this.openshiftRole!=null?this.openshiftRole.build():null;
    }

    public OpenshiftRole buildOpenshiftRole(){
            return this.openshiftRole!=null?this.openshiftRole.build():null;
    }

    public A withOpenshiftRole(OpenshiftRole openshiftRole){
            _visitables.remove(this.openshiftRole);
            if (openshiftRole!=null){ this.openshiftRole= new OpenshiftRoleBuilder(openshiftRole); _visitables.add(this.openshiftRole);} return (A) this;
    }

    public Boolean hasOpenshiftRole(){
            return this.openshiftRole != null;
    }

    public KubeSchemaFluent.OpenshiftRoleNested<A> withNewOpenshiftRole(){
            return new OpenshiftRoleNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftRoleNested<A> withNewOpenshiftRoleLike(OpenshiftRole item){
            return new OpenshiftRoleNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftRoleNested<A> editOpenshiftRole(){
            return withNewOpenshiftRoleLike(getOpenshiftRole());
    }

    public KubeSchemaFluent.OpenshiftRoleNested<A> editOrNewOpenshiftRole(){
            return withNewOpenshiftRoleLike(getOpenshiftRole() != null ? getOpenshiftRole(): new OpenshiftRoleBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftRoleNested<A> editOrNewOpenshiftRoleLike(OpenshiftRole item){
            return withNewOpenshiftRoleLike(getOpenshiftRole() != null ? getOpenshiftRole(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBinding getOpenshiftRoleBinding(){
            return this.openshiftRoleBinding!=null?this.openshiftRoleBinding.build():null;
    }

    public OpenshiftRoleBinding buildOpenshiftRoleBinding(){
            return this.openshiftRoleBinding!=null?this.openshiftRoleBinding.build():null;
    }

    public A withOpenshiftRoleBinding(OpenshiftRoleBinding openshiftRoleBinding){
            _visitables.remove(this.openshiftRoleBinding);
            if (openshiftRoleBinding!=null){ this.openshiftRoleBinding= new OpenshiftRoleBindingBuilder(openshiftRoleBinding); _visitables.add(this.openshiftRoleBinding);} return (A) this;
    }

    public Boolean hasOpenshiftRoleBinding(){
            return this.openshiftRoleBinding != null;
    }

    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> withNewOpenshiftRoleBinding(){
            return new OpenshiftRoleBindingNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> withNewOpenshiftRoleBindingLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> editOpenshiftRoleBinding(){
            return withNewOpenshiftRoleBindingLike(getOpenshiftRoleBinding());
    }

    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> editOrNewOpenshiftRoleBinding(){
            return withNewOpenshiftRoleBindingLike(getOpenshiftRoleBinding() != null ? getOpenshiftRoleBinding(): new OpenshiftRoleBindingBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> editOrNewOpenshiftRoleBindingLike(OpenshiftRoleBinding item){
            return withNewOpenshiftRoleBindingLike(getOpenshiftRoleBinding() != null ? getOpenshiftRoleBinding(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBindingList getOpenshiftRoleBindingList(){
            return this.openshiftRoleBindingList!=null?this.openshiftRoleBindingList.build():null;
    }

    public OpenshiftRoleBindingList buildOpenshiftRoleBindingList(){
            return this.openshiftRoleBindingList!=null?this.openshiftRoleBindingList.build():null;
    }

    public A withOpenshiftRoleBindingList(OpenshiftRoleBindingList openshiftRoleBindingList){
            _visitables.remove(this.openshiftRoleBindingList);
            if (openshiftRoleBindingList!=null){ this.openshiftRoleBindingList= new OpenshiftRoleBindingListBuilder(openshiftRoleBindingList); _visitables.add(this.openshiftRoleBindingList);} return (A) this;
    }

    public Boolean hasOpenshiftRoleBindingList(){
            return this.openshiftRoleBindingList != null;
    }

    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> withNewOpenshiftRoleBindingList(){
            return new OpenshiftRoleBindingListNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> withNewOpenshiftRoleBindingListLike(OpenshiftRoleBindingList item){
            return new OpenshiftRoleBindingListNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> editOpenshiftRoleBindingList(){
            return withNewOpenshiftRoleBindingListLike(getOpenshiftRoleBindingList());
    }

    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> editOrNewOpenshiftRoleBindingList(){
            return withNewOpenshiftRoleBindingListLike(getOpenshiftRoleBindingList() != null ? getOpenshiftRoleBindingList(): new OpenshiftRoleBindingListBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> editOrNewOpenshiftRoleBindingListLike(OpenshiftRoleBindingList item){
            return withNewOpenshiftRoleBindingListLike(getOpenshiftRoleBindingList() != null ? getOpenshiftRoleBindingList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleBindingRestriction instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBindingRestriction getOpenshiftRoleBindingRestriction(){
            return this.openshiftRoleBindingRestriction!=null?this.openshiftRoleBindingRestriction.build():null;
    }

    public OpenshiftRoleBindingRestriction buildOpenshiftRoleBindingRestriction(){
            return this.openshiftRoleBindingRestriction!=null?this.openshiftRoleBindingRestriction.build():null;
    }

    public A withOpenshiftRoleBindingRestriction(OpenshiftRoleBindingRestriction openshiftRoleBindingRestriction){
            _visitables.remove(this.openshiftRoleBindingRestriction);
            if (openshiftRoleBindingRestriction!=null){ this.openshiftRoleBindingRestriction= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestriction); _visitables.add(this.openshiftRoleBindingRestriction);} return (A) this;
    }

    public Boolean hasOpenshiftRoleBindingRestriction(){
            return this.openshiftRoleBindingRestriction != null;
    }

    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> withNewOpenshiftRoleBindingRestriction(){
            return new OpenshiftRoleBindingRestrictionNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> withNewOpenshiftRoleBindingRestrictionLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> editOpenshiftRoleBindingRestriction(){
            return withNewOpenshiftRoleBindingRestrictionLike(getOpenshiftRoleBindingRestriction());
    }

    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> editOrNewOpenshiftRoleBindingRestriction(){
            return withNewOpenshiftRoleBindingRestrictionLike(getOpenshiftRoleBindingRestriction() != null ? getOpenshiftRoleBindingRestriction(): new OpenshiftRoleBindingRestrictionBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> editOrNewOpenshiftRoleBindingRestrictionLike(OpenshiftRoleBindingRestriction item){
            return withNewOpenshiftRoleBindingRestrictionLike(getOpenshiftRoleBindingRestriction() != null ? getOpenshiftRoleBindingRestriction(): item);
    }

    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleList instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleList getOpenshiftRoleList(){
            return this.openshiftRoleList!=null?this.openshiftRoleList.build():null;
    }

    public OpenshiftRoleList buildOpenshiftRoleList(){
            return this.openshiftRoleList!=null?this.openshiftRoleList.build():null;
    }

    public A withOpenshiftRoleList(OpenshiftRoleList openshiftRoleList){
            _visitables.remove(this.openshiftRoleList);
            if (openshiftRoleList!=null){ this.openshiftRoleList= new OpenshiftRoleListBuilder(openshiftRoleList); _visitables.add(this.openshiftRoleList);} return (A) this;
    }

    public Boolean hasOpenshiftRoleList(){
            return this.openshiftRoleList != null;
    }

    public KubeSchemaFluent.OpenshiftRoleListNested<A> withNewOpenshiftRoleList(){
            return new OpenshiftRoleListNestedImpl();
    }

    public KubeSchemaFluent.OpenshiftRoleListNested<A> withNewOpenshiftRoleListLike(OpenshiftRoleList item){
            return new OpenshiftRoleListNestedImpl(item);
    }

    public KubeSchemaFluent.OpenshiftRoleListNested<A> editOpenshiftRoleList(){
            return withNewOpenshiftRoleListLike(getOpenshiftRoleList());
    }

    public KubeSchemaFluent.OpenshiftRoleListNested<A> editOrNewOpenshiftRoleList(){
            return withNewOpenshiftRoleListLike(getOpenshiftRoleList() != null ? getOpenshiftRoleList(): new OpenshiftRoleListBuilder().build());
    }

    public KubeSchemaFluent.OpenshiftRoleListNested<A> editOrNewOpenshiftRoleListLike(OpenshiftRoleList item){
            return withNewOpenshiftRoleListLike(getOpenshiftRoleList() != null ? getOpenshiftRoleList(): item);
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
 * This method has been deprecated, please use method buildPatch instead.
 * @return The buildable object.
 */
@Deprecated public Patch getPatch(){
            return this.patch!=null?this.patch.build():null;
    }

    public Patch buildPatch(){
            return this.patch!=null?this.patch.build():null;
    }

    public A withPatch(Patch patch){
            _visitables.remove(this.patch);
            if (patch!=null){ this.patch= new PatchBuilder(patch); _visitables.add(this.patch);} return (A) this;
    }

    public Boolean hasPatch(){
            return this.patch != null;
    }

    public KubeSchemaFluent.PatchNested<A> withNewPatch(){
            return new PatchNestedImpl();
    }

    public KubeSchemaFluent.PatchNested<A> withNewPatchLike(Patch item){
            return new PatchNestedImpl(item);
    }

    public KubeSchemaFluent.PatchNested<A> editPatch(){
            return withNewPatchLike(getPatch());
    }

    public KubeSchemaFluent.PatchNested<A> editOrNewPatch(){
            return withNewPatchLike(getPatch() != null ? getPatch(): new PatchBuilder().build());
    }

    public KubeSchemaFluent.PatchNested<A> editOrNewPatchLike(Patch item){
            return withNewPatchLike(getPatch() != null ? getPatch(): item);
    }

    public String getPatchType(){
            return this.patchType;
    }

    public A withPatchType(String patchType){
            this.patchType=patchType; return (A) this;
    }

    public Boolean hasPatchType(){
            return this.patchType != null;
    }

    
/**
 * This method has been deprecated, please use method buildPersistentVolume instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolume getPersistentVolume(){
            return this.persistentVolume!=null?this.persistentVolume.build():null;
    }

    public PersistentVolume buildPersistentVolume(){
            return this.persistentVolume!=null?this.persistentVolume.build():null;
    }

    public A withPersistentVolume(PersistentVolume persistentVolume){
            _visitables.remove(this.persistentVolume);
            if (persistentVolume!=null){ this.persistentVolume= new PersistentVolumeBuilder(persistentVolume); _visitables.add(this.persistentVolume);} return (A) this;
    }

    public Boolean hasPersistentVolume(){
            return this.persistentVolume != null;
    }

    public KubeSchemaFluent.PersistentVolumeNested<A> withNewPersistentVolume(){
            return new PersistentVolumeNestedImpl();
    }

    public KubeSchemaFluent.PersistentVolumeNested<A> withNewPersistentVolumeLike(PersistentVolume item){
            return new PersistentVolumeNestedImpl(item);
    }

    public KubeSchemaFluent.PersistentVolumeNested<A> editPersistentVolume(){
            return withNewPersistentVolumeLike(getPersistentVolume());
    }

    public KubeSchemaFluent.PersistentVolumeNested<A> editOrNewPersistentVolume(){
            return withNewPersistentVolumeLike(getPersistentVolume() != null ? getPersistentVolume(): new PersistentVolumeBuilder().build());
    }

    public KubeSchemaFluent.PersistentVolumeNested<A> editOrNewPersistentVolumeLike(PersistentVolume item){
            return withNewPersistentVolumeLike(getPersistentVolume() != null ? getPersistentVolume(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaim getPersistentVolumeClaim(){
            return this.persistentVolumeClaim!=null?this.persistentVolumeClaim.build():null;
    }

    public PersistentVolumeClaim buildPersistentVolumeClaim(){
            return this.persistentVolumeClaim!=null?this.persistentVolumeClaim.build():null;
    }

    public A withPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim){
            _visitables.remove(this.persistentVolumeClaim);
            if (persistentVolumeClaim!=null){ this.persistentVolumeClaim= new PersistentVolumeClaimBuilder(persistentVolumeClaim); _visitables.add(this.persistentVolumeClaim);} return (A) this;
    }

    public Boolean hasPersistentVolumeClaim(){
            return this.persistentVolumeClaim != null;
    }

    public KubeSchemaFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim(){
            return new PersistentVolumeClaimNestedImpl();
    }

    public KubeSchemaFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimNestedImpl(item);
    }

    public KubeSchemaFluent.PersistentVolumeClaimNested<A> editPersistentVolumeClaim(){
            return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim());
    }

    public KubeSchemaFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim(){
            return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim() != null ? getPersistentVolumeClaim(): new PersistentVolumeClaimBuilder().build());
    }

    public KubeSchemaFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(PersistentVolumeClaim item){
            return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim() != null ? getPersistentVolumeClaim(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPersistentVolumeClaimList instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimList getPersistentVolumeClaimList(){
            return this.persistentVolumeClaimList!=null?this.persistentVolumeClaimList.build():null;
    }

    public PersistentVolumeClaimList buildPersistentVolumeClaimList(){
            return this.persistentVolumeClaimList!=null?this.persistentVolumeClaimList.build():null;
    }

    public A withPersistentVolumeClaimList(PersistentVolumeClaimList persistentVolumeClaimList){
            _visitables.remove(this.persistentVolumeClaimList);
            if (persistentVolumeClaimList!=null){ this.persistentVolumeClaimList= new PersistentVolumeClaimListBuilder(persistentVolumeClaimList); _visitables.add(this.persistentVolumeClaimList);} return (A) this;
    }

    public Boolean hasPersistentVolumeClaimList(){
            return this.persistentVolumeClaimList != null;
    }

    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> withNewPersistentVolumeClaimList(){
            return new PersistentVolumeClaimListNestedImpl();
    }

    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> withNewPersistentVolumeClaimListLike(PersistentVolumeClaimList item){
            return new PersistentVolumeClaimListNestedImpl(item);
    }

    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> editPersistentVolumeClaimList(){
            return withNewPersistentVolumeClaimListLike(getPersistentVolumeClaimList());
    }

    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> editOrNewPersistentVolumeClaimList(){
            return withNewPersistentVolumeClaimListLike(getPersistentVolumeClaimList() != null ? getPersistentVolumeClaimList(): new PersistentVolumeClaimListBuilder().build());
    }

    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> editOrNewPersistentVolumeClaimListLike(PersistentVolumeClaimList item){
            return withNewPersistentVolumeClaimListLike(getPersistentVolumeClaimList() != null ? getPersistentVolumeClaimList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPersistentVolumeList instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeList getPersistentVolumeList(){
            return this.persistentVolumeList!=null?this.persistentVolumeList.build():null;
    }

    public PersistentVolumeList buildPersistentVolumeList(){
            return this.persistentVolumeList!=null?this.persistentVolumeList.build():null;
    }

    public A withPersistentVolumeList(PersistentVolumeList persistentVolumeList){
            _visitables.remove(this.persistentVolumeList);
            if (persistentVolumeList!=null){ this.persistentVolumeList= new PersistentVolumeListBuilder(persistentVolumeList); _visitables.add(this.persistentVolumeList);} return (A) this;
    }

    public Boolean hasPersistentVolumeList(){
            return this.persistentVolumeList != null;
    }

    public KubeSchemaFluent.PersistentVolumeListNested<A> withNewPersistentVolumeList(){
            return new PersistentVolumeListNestedImpl();
    }

    public KubeSchemaFluent.PersistentVolumeListNested<A> withNewPersistentVolumeListLike(PersistentVolumeList item){
            return new PersistentVolumeListNestedImpl(item);
    }

    public KubeSchemaFluent.PersistentVolumeListNested<A> editPersistentVolumeList(){
            return withNewPersistentVolumeListLike(getPersistentVolumeList());
    }

    public KubeSchemaFluent.PersistentVolumeListNested<A> editOrNewPersistentVolumeList(){
            return withNewPersistentVolumeListLike(getPersistentVolumeList() != null ? getPersistentVolumeList(): new PersistentVolumeListBuilder().build());
    }

    public KubeSchemaFluent.PersistentVolumeListNested<A> editOrNewPersistentVolumeListLike(PersistentVolumeList item){
            return withNewPersistentVolumeListLike(getPersistentVolumeList() != null ? getPersistentVolumeList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodDisruptionBudget instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudget getPodDisruptionBudget(){
            return this.podDisruptionBudget!=null?this.podDisruptionBudget.build():null;
    }

    public PodDisruptionBudget buildPodDisruptionBudget(){
            return this.podDisruptionBudget!=null?this.podDisruptionBudget.build():null;
    }

    public A withPodDisruptionBudget(PodDisruptionBudget podDisruptionBudget){
            _visitables.remove(this.podDisruptionBudget);
            if (podDisruptionBudget!=null){ this.podDisruptionBudget= new PodDisruptionBudgetBuilder(podDisruptionBudget); _visitables.add(this.podDisruptionBudget);} return (A) this;
    }

    public Boolean hasPodDisruptionBudget(){
            return this.podDisruptionBudget != null;
    }

    public KubeSchemaFluent.PodDisruptionBudgetNested<A> withNewPodDisruptionBudget(){
            return new PodDisruptionBudgetNestedImpl();
    }

    public KubeSchemaFluent.PodDisruptionBudgetNested<A> withNewPodDisruptionBudgetLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetNestedImpl(item);
    }

    public KubeSchemaFluent.PodDisruptionBudgetNested<A> editPodDisruptionBudget(){
            return withNewPodDisruptionBudgetLike(getPodDisruptionBudget());
    }

    public KubeSchemaFluent.PodDisruptionBudgetNested<A> editOrNewPodDisruptionBudget(){
            return withNewPodDisruptionBudgetLike(getPodDisruptionBudget() != null ? getPodDisruptionBudget(): new PodDisruptionBudgetBuilder().build());
    }

    public KubeSchemaFluent.PodDisruptionBudgetNested<A> editOrNewPodDisruptionBudgetLike(PodDisruptionBudget item){
            return withNewPodDisruptionBudgetLike(getPodDisruptionBudget() != null ? getPodDisruptionBudget(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodDisruptionBudgetList instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudgetList getPodDisruptionBudgetList(){
            return this.podDisruptionBudgetList!=null?this.podDisruptionBudgetList.build():null;
    }

    public PodDisruptionBudgetList buildPodDisruptionBudgetList(){
            return this.podDisruptionBudgetList!=null?this.podDisruptionBudgetList.build():null;
    }

    public A withPodDisruptionBudgetList(PodDisruptionBudgetList podDisruptionBudgetList){
            _visitables.remove(this.podDisruptionBudgetList);
            if (podDisruptionBudgetList!=null){ this.podDisruptionBudgetList= new PodDisruptionBudgetListBuilder(podDisruptionBudgetList); _visitables.add(this.podDisruptionBudgetList);} return (A) this;
    }

    public Boolean hasPodDisruptionBudgetList(){
            return this.podDisruptionBudgetList != null;
    }

    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> withNewPodDisruptionBudgetList(){
            return new PodDisruptionBudgetListNestedImpl();
    }

    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> withNewPodDisruptionBudgetListLike(PodDisruptionBudgetList item){
            return new PodDisruptionBudgetListNestedImpl(item);
    }

    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> editPodDisruptionBudgetList(){
            return withNewPodDisruptionBudgetListLike(getPodDisruptionBudgetList());
    }

    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> editOrNewPodDisruptionBudgetList(){
            return withNewPodDisruptionBudgetListLike(getPodDisruptionBudgetList() != null ? getPodDisruptionBudgetList(): new PodDisruptionBudgetListBuilder().build());
    }

    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> editOrNewPodDisruptionBudgetListLike(PodDisruptionBudgetList item){
            return withNewPodDisruptionBudgetListLike(getPodDisruptionBudgetList() != null ? getPodDisruptionBudgetList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodList instead.
 * @return The buildable object.
 */
@Deprecated public PodList getPodList(){
            return this.podList!=null?this.podList.build():null;
    }

    public PodList buildPodList(){
            return this.podList!=null?this.podList.build():null;
    }

    public A withPodList(PodList podList){
            _visitables.remove(this.podList);
            if (podList!=null){ this.podList= new PodListBuilder(podList); _visitables.add(this.podList);} return (A) this;
    }

    public Boolean hasPodList(){
            return this.podList != null;
    }

    public KubeSchemaFluent.PodListNested<A> withNewPodList(){
            return new PodListNestedImpl();
    }

    public KubeSchemaFluent.PodListNested<A> withNewPodListLike(PodList item){
            return new PodListNestedImpl(item);
    }

    public KubeSchemaFluent.PodListNested<A> editPodList(){
            return withNewPodListLike(getPodList());
    }

    public KubeSchemaFluent.PodListNested<A> editOrNewPodList(){
            return withNewPodListLike(getPodList() != null ? getPodList(): new PodListBuilder().build());
    }

    public KubeSchemaFluent.PodListNested<A> editOrNewPodListLike(PodList item){
            return withNewPodListLike(getPodList() != null ? getPodList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodPreset instead.
 * @return The buildable object.
 */
@Deprecated public PodPreset getPodPreset(){
            return this.podPreset!=null?this.podPreset.build():null;
    }

    public PodPreset buildPodPreset(){
            return this.podPreset!=null?this.podPreset.build():null;
    }

    public A withPodPreset(PodPreset podPreset){
            _visitables.remove(this.podPreset);
            if (podPreset!=null){ this.podPreset= new PodPresetBuilder(podPreset); _visitables.add(this.podPreset);} return (A) this;
    }

    public Boolean hasPodPreset(){
            return this.podPreset != null;
    }

    public KubeSchemaFluent.PodPresetNested<A> withNewPodPreset(){
            return new PodPresetNestedImpl();
    }

    public KubeSchemaFluent.PodPresetNested<A> withNewPodPresetLike(PodPreset item){
            return new PodPresetNestedImpl(item);
    }

    public KubeSchemaFluent.PodPresetNested<A> editPodPreset(){
            return withNewPodPresetLike(getPodPreset());
    }

    public KubeSchemaFluent.PodPresetNested<A> editOrNewPodPreset(){
            return withNewPodPresetLike(getPodPreset() != null ? getPodPreset(): new PodPresetBuilder().build());
    }

    public KubeSchemaFluent.PodPresetNested<A> editOrNewPodPresetLike(PodPreset item){
            return withNewPodPresetLike(getPodPreset() != null ? getPodPreset(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodPresetList instead.
 * @return The buildable object.
 */
@Deprecated public PodPresetList getPodPresetList(){
            return this.podPresetList!=null?this.podPresetList.build():null;
    }

    public PodPresetList buildPodPresetList(){
            return this.podPresetList!=null?this.podPresetList.build():null;
    }

    public A withPodPresetList(PodPresetList podPresetList){
            _visitables.remove(this.podPresetList);
            if (podPresetList!=null){ this.podPresetList= new PodPresetListBuilder(podPresetList); _visitables.add(this.podPresetList);} return (A) this;
    }

    public Boolean hasPodPresetList(){
            return this.podPresetList != null;
    }

    public KubeSchemaFluent.PodPresetListNested<A> withNewPodPresetList(){
            return new PodPresetListNestedImpl();
    }

    public KubeSchemaFluent.PodPresetListNested<A> withNewPodPresetListLike(PodPresetList item){
            return new PodPresetListNestedImpl(item);
    }

    public KubeSchemaFluent.PodPresetListNested<A> editPodPresetList(){
            return withNewPodPresetListLike(getPodPresetList());
    }

    public KubeSchemaFluent.PodPresetListNested<A> editOrNewPodPresetList(){
            return withNewPodPresetListLike(getPodPresetList() != null ? getPodPresetList(): new PodPresetListBuilder().build());
    }

    public KubeSchemaFluent.PodPresetListNested<A> editOrNewPodPresetListLike(PodPresetList item){
            return withNewPodPresetListLike(getPodPresetList() != null ? getPodPresetList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodPresetSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodPresetSpec getPodPresetSpec(){
            return this.podPresetSpec!=null?this.podPresetSpec.build():null;
    }

    public PodPresetSpec buildPodPresetSpec(){
            return this.podPresetSpec!=null?this.podPresetSpec.build():null;
    }

    public A withPodPresetSpec(PodPresetSpec podPresetSpec){
            _visitables.remove(this.podPresetSpec);
            if (podPresetSpec!=null){ this.podPresetSpec= new PodPresetSpecBuilder(podPresetSpec); _visitables.add(this.podPresetSpec);} return (A) this;
    }

    public Boolean hasPodPresetSpec(){
            return this.podPresetSpec != null;
    }

    public KubeSchemaFluent.PodPresetSpecNested<A> withNewPodPresetSpec(){
            return new PodPresetSpecNestedImpl();
    }

    public KubeSchemaFluent.PodPresetSpecNested<A> withNewPodPresetSpecLike(PodPresetSpec item){
            return new PodPresetSpecNestedImpl(item);
    }

    public KubeSchemaFluent.PodPresetSpecNested<A> editPodPresetSpec(){
            return withNewPodPresetSpecLike(getPodPresetSpec());
    }

    public KubeSchemaFluent.PodPresetSpecNested<A> editOrNewPodPresetSpec(){
            return withNewPodPresetSpecLike(getPodPresetSpec() != null ? getPodPresetSpec(): new PodPresetSpecBuilder().build());
    }

    public KubeSchemaFluent.PodPresetSpecNested<A> editOrNewPodPresetSpecLike(PodPresetSpec item){
            return withNewPodPresetSpecLike(getPodPresetSpec() != null ? getPodPresetSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodSecurityPolicy instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityPolicy getPodSecurityPolicy(){
            return this.podSecurityPolicy!=null?this.podSecurityPolicy.build():null;
    }

    public PodSecurityPolicy buildPodSecurityPolicy(){
            return this.podSecurityPolicy!=null?this.podSecurityPolicy.build():null;
    }

    public A withPodSecurityPolicy(PodSecurityPolicy podSecurityPolicy){
            _visitables.remove(this.podSecurityPolicy);
            if (podSecurityPolicy!=null){ this.podSecurityPolicy= new PodSecurityPolicyBuilder(podSecurityPolicy); _visitables.add(this.podSecurityPolicy);} return (A) this;
    }

    public Boolean hasPodSecurityPolicy(){
            return this.podSecurityPolicy != null;
    }

    public KubeSchemaFluent.PodSecurityPolicyNested<A> withNewPodSecurityPolicy(){
            return new PodSecurityPolicyNestedImpl();
    }

    public KubeSchemaFluent.PodSecurityPolicyNested<A> withNewPodSecurityPolicyLike(PodSecurityPolicy item){
            return new PodSecurityPolicyNestedImpl(item);
    }

    public KubeSchemaFluent.PodSecurityPolicyNested<A> editPodSecurityPolicy(){
            return withNewPodSecurityPolicyLike(getPodSecurityPolicy());
    }

    public KubeSchemaFluent.PodSecurityPolicyNested<A> editOrNewPodSecurityPolicy(){
            return withNewPodSecurityPolicyLike(getPodSecurityPolicy() != null ? getPodSecurityPolicy(): new PodSecurityPolicyBuilder().build());
    }

    public KubeSchemaFluent.PodSecurityPolicyNested<A> editOrNewPodSecurityPolicyLike(PodSecurityPolicy item){
            return withNewPodSecurityPolicyLike(getPodSecurityPolicy() != null ? getPodSecurityPolicy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodSecurityPolicyList instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityPolicyList getPodSecurityPolicyList(){
            return this.podSecurityPolicyList!=null?this.podSecurityPolicyList.build():null;
    }

    public PodSecurityPolicyList buildPodSecurityPolicyList(){
            return this.podSecurityPolicyList!=null?this.podSecurityPolicyList.build():null;
    }

    public A withPodSecurityPolicyList(PodSecurityPolicyList podSecurityPolicyList){
            _visitables.remove(this.podSecurityPolicyList);
            if (podSecurityPolicyList!=null){ this.podSecurityPolicyList= new PodSecurityPolicyListBuilder(podSecurityPolicyList); _visitables.add(this.podSecurityPolicyList);} return (A) this;
    }

    public Boolean hasPodSecurityPolicyList(){
            return this.podSecurityPolicyList != null;
    }

    public KubeSchemaFluent.PodSecurityPolicyListNested<A> withNewPodSecurityPolicyList(){
            return new PodSecurityPolicyListNestedImpl();
    }

    public KubeSchemaFluent.PodSecurityPolicyListNested<A> withNewPodSecurityPolicyListLike(PodSecurityPolicyList item){
            return new PodSecurityPolicyListNestedImpl(item);
    }

    public KubeSchemaFluent.PodSecurityPolicyListNested<A> editPodSecurityPolicyList(){
            return withNewPodSecurityPolicyListLike(getPodSecurityPolicyList());
    }

    public KubeSchemaFluent.PodSecurityPolicyListNested<A> editOrNewPodSecurityPolicyList(){
            return withNewPodSecurityPolicyListLike(getPodSecurityPolicyList() != null ? getPodSecurityPolicyList(): new PodSecurityPolicyListBuilder().build());
    }

    public KubeSchemaFluent.PodSecurityPolicyListNested<A> editOrNewPodSecurityPolicyListLike(PodSecurityPolicyList item){
            return withNewPodSecurityPolicyListLike(getPodSecurityPolicyList() != null ? getPodSecurityPolicyList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodTemplateList instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateList getPodTemplateList(){
            return this.podTemplateList!=null?this.podTemplateList.build():null;
    }

    public PodTemplateList buildPodTemplateList(){
            return this.podTemplateList!=null?this.podTemplateList.build():null;
    }

    public A withPodTemplateList(PodTemplateList podTemplateList){
            _visitables.remove(this.podTemplateList);
            if (podTemplateList!=null){ this.podTemplateList= new PodTemplateListBuilder(podTemplateList); _visitables.add(this.podTemplateList);} return (A) this;
    }

    public Boolean hasPodTemplateList(){
            return this.podTemplateList != null;
    }

    public KubeSchemaFluent.PodTemplateListNested<A> withNewPodTemplateList(){
            return new PodTemplateListNestedImpl();
    }

    public KubeSchemaFluent.PodTemplateListNested<A> withNewPodTemplateListLike(PodTemplateList item){
            return new PodTemplateListNestedImpl(item);
    }

    public KubeSchemaFluent.PodTemplateListNested<A> editPodTemplateList(){
            return withNewPodTemplateListLike(getPodTemplateList());
    }

    public KubeSchemaFluent.PodTemplateListNested<A> editOrNewPodTemplateList(){
            return withNewPodTemplateListLike(getPodTemplateList() != null ? getPodTemplateList(): new PodTemplateListBuilder().build());
    }

    public KubeSchemaFluent.PodTemplateListNested<A> editOrNewPodTemplateListLike(PodTemplateList item){
            return withNewPodTemplateListLike(getPodTemplateList() != null ? getPodTemplateList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPriorityClass instead.
 * @return The buildable object.
 */
@Deprecated public PriorityClass getPriorityClass(){
            return this.priorityClass!=null?this.priorityClass.build():null;
    }

    public PriorityClass buildPriorityClass(){
            return this.priorityClass!=null?this.priorityClass.build():null;
    }

    public A withPriorityClass(PriorityClass priorityClass){
            _visitables.remove(this.priorityClass);
            if (priorityClass!=null){ this.priorityClass= new PriorityClassBuilder(priorityClass); _visitables.add(this.priorityClass);} return (A) this;
    }

    public Boolean hasPriorityClass(){
            return this.priorityClass != null;
    }

    public KubeSchemaFluent.PriorityClassNested<A> withNewPriorityClass(){
            return new PriorityClassNestedImpl();
    }

    public KubeSchemaFluent.PriorityClassNested<A> withNewPriorityClassLike(PriorityClass item){
            return new PriorityClassNestedImpl(item);
    }

    public KubeSchemaFluent.PriorityClassNested<A> editPriorityClass(){
            return withNewPriorityClassLike(getPriorityClass());
    }

    public KubeSchemaFluent.PriorityClassNested<A> editOrNewPriorityClass(){
            return withNewPriorityClassLike(getPriorityClass() != null ? getPriorityClass(): new PriorityClassBuilder().build());
    }

    public KubeSchemaFluent.PriorityClassNested<A> editOrNewPriorityClassLike(PriorityClass item){
            return withNewPriorityClassLike(getPriorityClass() != null ? getPriorityClass(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPriorityClassList instead.
 * @return The buildable object.
 */
@Deprecated public PriorityClassList getPriorityClassList(){
            return this.priorityClassList!=null?this.priorityClassList.build():null;
    }

    public PriorityClassList buildPriorityClassList(){
            return this.priorityClassList!=null?this.priorityClassList.build():null;
    }

    public A withPriorityClassList(PriorityClassList priorityClassList){
            _visitables.remove(this.priorityClassList);
            if (priorityClassList!=null){ this.priorityClassList= new PriorityClassListBuilder(priorityClassList); _visitables.add(this.priorityClassList);} return (A) this;
    }

    public Boolean hasPriorityClassList(){
            return this.priorityClassList != null;
    }

    public KubeSchemaFluent.PriorityClassListNested<A> withNewPriorityClassList(){
            return new PriorityClassListNestedImpl();
    }

    public KubeSchemaFluent.PriorityClassListNested<A> withNewPriorityClassListLike(PriorityClassList item){
            return new PriorityClassListNestedImpl(item);
    }

    public KubeSchemaFluent.PriorityClassListNested<A> editPriorityClassList(){
            return withNewPriorityClassListLike(getPriorityClassList());
    }

    public KubeSchemaFluent.PriorityClassListNested<A> editOrNewPriorityClassList(){
            return withNewPriorityClassListLike(getPriorityClassList() != null ? getPriorityClassList(): new PriorityClassListBuilder().build());
    }

    public KubeSchemaFluent.PriorityClassListNested<A> editOrNewPriorityClassListLike(PriorityClassList item){
            return withNewPriorityClassListLike(getPriorityClassList() != null ? getPriorityClassList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildProject instead.
 * @return The buildable object.
 */
@Deprecated public Project getProject(){
            return this.project!=null?this.project.build():null;
    }

    public Project buildProject(){
            return this.project!=null?this.project.build():null;
    }

    public A withProject(Project project){
            _visitables.remove(this.project);
            if (project!=null){ this.project= new ProjectBuilder(project); _visitables.add(this.project);} return (A) this;
    }

    public Boolean hasProject(){
            return this.project != null;
    }

    public KubeSchemaFluent.ProjectNested<A> withNewProject(){
            return new ProjectNestedImpl();
    }

    public KubeSchemaFluent.ProjectNested<A> withNewProjectLike(Project item){
            return new ProjectNestedImpl(item);
    }

    public KubeSchemaFluent.ProjectNested<A> editProject(){
            return withNewProjectLike(getProject());
    }

    public KubeSchemaFluent.ProjectNested<A> editOrNewProject(){
            return withNewProjectLike(getProject() != null ? getProject(): new ProjectBuilder().build());
    }

    public KubeSchemaFluent.ProjectNested<A> editOrNewProjectLike(Project item){
            return withNewProjectLike(getProject() != null ? getProject(): item);
    }

    
/**
 * This method has been deprecated, please use method buildProjectList instead.
 * @return The buildable object.
 */
@Deprecated public ProjectList getProjectList(){
            return this.projectList!=null?this.projectList.build():null;
    }

    public ProjectList buildProjectList(){
            return this.projectList!=null?this.projectList.build():null;
    }

    public A withProjectList(ProjectList projectList){
            _visitables.remove(this.projectList);
            if (projectList!=null){ this.projectList= new ProjectListBuilder(projectList); _visitables.add(this.projectList);} return (A) this;
    }

    public Boolean hasProjectList(){
            return this.projectList != null;
    }

    public KubeSchemaFluent.ProjectListNested<A> withNewProjectList(){
            return new ProjectListNestedImpl();
    }

    public KubeSchemaFluent.ProjectListNested<A> withNewProjectListLike(ProjectList item){
            return new ProjectListNestedImpl(item);
    }

    public KubeSchemaFluent.ProjectListNested<A> editProjectList(){
            return withNewProjectListLike(getProjectList());
    }

    public KubeSchemaFluent.ProjectListNested<A> editOrNewProjectList(){
            return withNewProjectListLike(getProjectList() != null ? getProjectList(): new ProjectListBuilder().build());
    }

    public KubeSchemaFluent.ProjectListNested<A> editOrNewProjectListLike(ProjectList item){
            return withNewProjectListLike(getProjectList() != null ? getProjectList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildProjectRequest instead.
 * @return The buildable object.
 */
@Deprecated public ProjectRequest getProjectRequest(){
            return this.projectRequest!=null?this.projectRequest.build():null;
    }

    public ProjectRequest buildProjectRequest(){
            return this.projectRequest!=null?this.projectRequest.build():null;
    }

    public A withProjectRequest(ProjectRequest projectRequest){
            _visitables.remove(this.projectRequest);
            if (projectRequest!=null){ this.projectRequest= new ProjectRequestBuilder(projectRequest); _visitables.add(this.projectRequest);} return (A) this;
    }

    public Boolean hasProjectRequest(){
            return this.projectRequest != null;
    }

    public KubeSchemaFluent.ProjectRequestNested<A> withNewProjectRequest(){
            return new ProjectRequestNestedImpl();
    }

    public KubeSchemaFluent.ProjectRequestNested<A> withNewProjectRequestLike(ProjectRequest item){
            return new ProjectRequestNestedImpl(item);
    }

    public KubeSchemaFluent.ProjectRequestNested<A> editProjectRequest(){
            return withNewProjectRequestLike(getProjectRequest());
    }

    public KubeSchemaFluent.ProjectRequestNested<A> editOrNewProjectRequest(){
            return withNewProjectRequestLike(getProjectRequest() != null ? getProjectRequest(): new ProjectRequestBuilder().build());
    }

    public KubeSchemaFluent.ProjectRequestNested<A> editOrNewProjectRequestLike(ProjectRequest item){
            return withNewProjectRequestLike(getProjectRequest() != null ? getProjectRequest(): item);
    }

    
/**
 * This method has been deprecated, please use method buildQuantity instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getQuantity(){
            return this.quantity!=null?this.quantity.build():null;
    }

    public Quantity buildQuantity(){
            return this.quantity!=null?this.quantity.build():null;
    }

    public A withQuantity(Quantity quantity){
            _visitables.remove(this.quantity);
            if (quantity!=null){ this.quantity= new QuantityBuilder(quantity); _visitables.add(this.quantity);} return (A) this;
    }

    public Boolean hasQuantity(){
            return this.quantity != null;
    }

    public A withNewQuantity(String amount,String format){
            return (A)withQuantity(new Quantity(amount, format));
    }

    public A withNewQuantity(String amount){
            return (A)withQuantity(new Quantity(amount));
    }

    public KubeSchemaFluent.QuantityNested<A> withNewQuantity(){
            return new QuantityNestedImpl();
    }

    public KubeSchemaFluent.QuantityNested<A> withNewQuantityLike(Quantity item){
            return new QuantityNestedImpl(item);
    }

    public KubeSchemaFluent.QuantityNested<A> editQuantity(){
            return withNewQuantityLike(getQuantity());
    }

    public KubeSchemaFluent.QuantityNested<A> editOrNewQuantity(){
            return withNewQuantityLike(getQuantity() != null ? getQuantity(): new QuantityBuilder().build());
    }

    public KubeSchemaFluent.QuantityNested<A> editOrNewQuantityLike(Quantity item){
            return withNewQuantityLike(getQuantity() != null ? getQuantity(): item);
    }

    
/**
 * This method has been deprecated, please use method buildReplicaSet instead.
 * @return The buildable object.
 */
@Deprecated public ReplicaSet getReplicaSet(){
            return this.replicaSet!=null?this.replicaSet.build():null;
    }

    public ReplicaSet buildReplicaSet(){
            return this.replicaSet!=null?this.replicaSet.build():null;
    }

    public A withReplicaSet(ReplicaSet replicaSet){
            _visitables.remove(this.replicaSet);
            if (replicaSet!=null){ this.replicaSet= new ReplicaSetBuilder(replicaSet); _visitables.add(this.replicaSet);} return (A) this;
    }

    public Boolean hasReplicaSet(){
            return this.replicaSet != null;
    }

    public KubeSchemaFluent.ReplicaSetNested<A> withNewReplicaSet(){
            return new ReplicaSetNestedImpl();
    }

    public KubeSchemaFluent.ReplicaSetNested<A> withNewReplicaSetLike(ReplicaSet item){
            return new ReplicaSetNestedImpl(item);
    }

    public KubeSchemaFluent.ReplicaSetNested<A> editReplicaSet(){
            return withNewReplicaSetLike(getReplicaSet());
    }

    public KubeSchemaFluent.ReplicaSetNested<A> editOrNewReplicaSet(){
            return withNewReplicaSetLike(getReplicaSet() != null ? getReplicaSet(): new ReplicaSetBuilder().build());
    }

    public KubeSchemaFluent.ReplicaSetNested<A> editOrNewReplicaSetLike(ReplicaSet item){
            return withNewReplicaSetLike(getReplicaSet() != null ? getReplicaSet(): item);
    }

    
/**
 * This method has been deprecated, please use method buildReplicaSetList instead.
 * @return The buildable object.
 */
@Deprecated public ReplicaSetList getReplicaSetList(){
            return this.replicaSetList!=null?this.replicaSetList.build():null;
    }

    public ReplicaSetList buildReplicaSetList(){
            return this.replicaSetList!=null?this.replicaSetList.build():null;
    }

    public A withReplicaSetList(ReplicaSetList replicaSetList){
            _visitables.remove(this.replicaSetList);
            if (replicaSetList!=null){ this.replicaSetList= new ReplicaSetListBuilder(replicaSetList); _visitables.add(this.replicaSetList);} return (A) this;
    }

    public Boolean hasReplicaSetList(){
            return this.replicaSetList != null;
    }

    public KubeSchemaFluent.ReplicaSetListNested<A> withNewReplicaSetList(){
            return new ReplicaSetListNestedImpl();
    }

    public KubeSchemaFluent.ReplicaSetListNested<A> withNewReplicaSetListLike(ReplicaSetList item){
            return new ReplicaSetListNestedImpl(item);
    }

    public KubeSchemaFluent.ReplicaSetListNested<A> editReplicaSetList(){
            return withNewReplicaSetListLike(getReplicaSetList());
    }

    public KubeSchemaFluent.ReplicaSetListNested<A> editOrNewReplicaSetList(){
            return withNewReplicaSetListLike(getReplicaSetList() != null ? getReplicaSetList(): new ReplicaSetListBuilder().build());
    }

    public KubeSchemaFluent.ReplicaSetListNested<A> editOrNewReplicaSetListLike(ReplicaSetList item){
            return withNewReplicaSetListLike(getReplicaSetList() != null ? getReplicaSetList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildReplicationControllerList instead.
 * @return The buildable object.
 */
@Deprecated public ReplicationControllerList getReplicationControllerList(){
            return this.replicationControllerList!=null?this.replicationControllerList.build():null;
    }

    public ReplicationControllerList buildReplicationControllerList(){
            return this.replicationControllerList!=null?this.replicationControllerList.build():null;
    }

    public A withReplicationControllerList(ReplicationControllerList replicationControllerList){
            _visitables.remove(this.replicationControllerList);
            if (replicationControllerList!=null){ this.replicationControllerList= new ReplicationControllerListBuilder(replicationControllerList); _visitables.add(this.replicationControllerList);} return (A) this;
    }

    public Boolean hasReplicationControllerList(){
            return this.replicationControllerList != null;
    }

    public KubeSchemaFluent.ReplicationControllerListNested<A> withNewReplicationControllerList(){
            return new ReplicationControllerListNestedImpl();
    }

    public KubeSchemaFluent.ReplicationControllerListNested<A> withNewReplicationControllerListLike(ReplicationControllerList item){
            return new ReplicationControllerListNestedImpl(item);
    }

    public KubeSchemaFluent.ReplicationControllerListNested<A> editReplicationControllerList(){
            return withNewReplicationControllerListLike(getReplicationControllerList());
    }

    public KubeSchemaFluent.ReplicationControllerListNested<A> editOrNewReplicationControllerList(){
            return withNewReplicationControllerListLike(getReplicationControllerList() != null ? getReplicationControllerList(): new ReplicationControllerListBuilder().build());
    }

    public KubeSchemaFluent.ReplicationControllerListNested<A> editOrNewReplicationControllerListLike(ReplicationControllerList item){
            return withNewReplicationControllerListLike(getReplicationControllerList() != null ? getReplicationControllerList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResourceQuota instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuota getResourceQuota(){
            return this.resourceQuota!=null?this.resourceQuota.build():null;
    }

    public ResourceQuota buildResourceQuota(){
            return this.resourceQuota!=null?this.resourceQuota.build():null;
    }

    public A withResourceQuota(ResourceQuota resourceQuota){
            _visitables.remove(this.resourceQuota);
            if (resourceQuota!=null){ this.resourceQuota= new ResourceQuotaBuilder(resourceQuota); _visitables.add(this.resourceQuota);} return (A) this;
    }

    public Boolean hasResourceQuota(){
            return this.resourceQuota != null;
    }

    public KubeSchemaFluent.ResourceQuotaNested<A> withNewResourceQuota(){
            return new ResourceQuotaNestedImpl();
    }

    public KubeSchemaFluent.ResourceQuotaNested<A> withNewResourceQuotaLike(ResourceQuota item){
            return new ResourceQuotaNestedImpl(item);
    }

    public KubeSchemaFluent.ResourceQuotaNested<A> editResourceQuota(){
            return withNewResourceQuotaLike(getResourceQuota());
    }

    public KubeSchemaFluent.ResourceQuotaNested<A> editOrNewResourceQuota(){
            return withNewResourceQuotaLike(getResourceQuota() != null ? getResourceQuota(): new ResourceQuotaBuilder().build());
    }

    public KubeSchemaFluent.ResourceQuotaNested<A> editOrNewResourceQuotaLike(ResourceQuota item){
            return withNewResourceQuotaLike(getResourceQuota() != null ? getResourceQuota(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResourceQuotaList instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuotaList getResourceQuotaList(){
            return this.resourceQuotaList!=null?this.resourceQuotaList.build():null;
    }

    public ResourceQuotaList buildResourceQuotaList(){
            return this.resourceQuotaList!=null?this.resourceQuotaList.build():null;
    }

    public A withResourceQuotaList(ResourceQuotaList resourceQuotaList){
            _visitables.remove(this.resourceQuotaList);
            if (resourceQuotaList!=null){ this.resourceQuotaList= new ResourceQuotaListBuilder(resourceQuotaList); _visitables.add(this.resourceQuotaList);} return (A) this;
    }

    public Boolean hasResourceQuotaList(){
            return this.resourceQuotaList != null;
    }

    public KubeSchemaFluent.ResourceQuotaListNested<A> withNewResourceQuotaList(){
            return new ResourceQuotaListNestedImpl();
    }

    public KubeSchemaFluent.ResourceQuotaListNested<A> withNewResourceQuotaListLike(ResourceQuotaList item){
            return new ResourceQuotaListNestedImpl(item);
    }

    public KubeSchemaFluent.ResourceQuotaListNested<A> editResourceQuotaList(){
            return withNewResourceQuotaListLike(getResourceQuotaList());
    }

    public KubeSchemaFluent.ResourceQuotaListNested<A> editOrNewResourceQuotaList(){
            return withNewResourceQuotaListLike(getResourceQuotaList() != null ? getResourceQuotaList(): new ResourceQuotaListBuilder().build());
    }

    public KubeSchemaFluent.ResourceQuotaListNested<A> editOrNewResourceQuotaListLike(ResourceQuotaList item){
            return withNewResourceQuotaListLike(getResourceQuotaList() != null ? getResourceQuotaList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRole instead.
 * @return The buildable object.
 */
@Deprecated public Role getRole(){
            return this.role!=null?this.role.build():null;
    }

    public Role buildRole(){
            return this.role!=null?this.role.build():null;
    }

    public A withRole(Role role){
            _visitables.remove(this.role);
            if (role!=null){ this.role= new RoleBuilder(role); _visitables.add(this.role);} return (A) this;
    }

    public Boolean hasRole(){
            return this.role != null;
    }

    public KubeSchemaFluent.RoleNested<A> withNewRole(){
            return new RoleNestedImpl();
    }

    public KubeSchemaFluent.RoleNested<A> withNewRoleLike(Role item){
            return new RoleNestedImpl(item);
    }

    public KubeSchemaFluent.RoleNested<A> editRole(){
            return withNewRoleLike(getRole());
    }

    public KubeSchemaFluent.RoleNested<A> editOrNewRole(){
            return withNewRoleLike(getRole() != null ? getRole(): new RoleBuilder().build());
    }

    public KubeSchemaFluent.RoleNested<A> editOrNewRoleLike(Role item){
            return withNewRoleLike(getRole() != null ? getRole(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public RoleBinding getRoleBinding(){
            return this.roleBinding!=null?this.roleBinding.build():null;
    }

    public RoleBinding buildRoleBinding(){
            return this.roleBinding!=null?this.roleBinding.build():null;
    }

    public A withRoleBinding(RoleBinding roleBinding){
            _visitables.remove(this.roleBinding);
            if (roleBinding!=null){ this.roleBinding= new RoleBindingBuilder(roleBinding); _visitables.add(this.roleBinding);} return (A) this;
    }

    public Boolean hasRoleBinding(){
            return this.roleBinding != null;
    }

    public KubeSchemaFluent.RoleBindingNested<A> withNewRoleBinding(){
            return new RoleBindingNestedImpl();
    }

    public KubeSchemaFluent.RoleBindingNested<A> withNewRoleBindingLike(RoleBinding item){
            return new RoleBindingNestedImpl(item);
    }

    public KubeSchemaFluent.RoleBindingNested<A> editRoleBinding(){
            return withNewRoleBindingLike(getRoleBinding());
    }

    public KubeSchemaFluent.RoleBindingNested<A> editOrNewRoleBinding(){
            return withNewRoleBindingLike(getRoleBinding() != null ? getRoleBinding(): new RoleBindingBuilder().build());
    }

    public KubeSchemaFluent.RoleBindingNested<A> editOrNewRoleBindingLike(RoleBinding item){
            return withNewRoleBindingLike(getRoleBinding() != null ? getRoleBinding(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public RoleBindingList getRoleBindingList(){
            return this.roleBindingList!=null?this.roleBindingList.build():null;
    }

    public RoleBindingList buildRoleBindingList(){
            return this.roleBindingList!=null?this.roleBindingList.build():null;
    }

    public A withRoleBindingList(RoleBindingList roleBindingList){
            _visitables.remove(this.roleBindingList);
            if (roleBindingList!=null){ this.roleBindingList= new RoleBindingListBuilder(roleBindingList); _visitables.add(this.roleBindingList);} return (A) this;
    }

    public Boolean hasRoleBindingList(){
            return this.roleBindingList != null;
    }

    public KubeSchemaFluent.RoleBindingListNested<A> withNewRoleBindingList(){
            return new RoleBindingListNestedImpl();
    }

    public KubeSchemaFluent.RoleBindingListNested<A> withNewRoleBindingListLike(RoleBindingList item){
            return new RoleBindingListNestedImpl(item);
    }

    public KubeSchemaFluent.RoleBindingListNested<A> editRoleBindingList(){
            return withNewRoleBindingListLike(getRoleBindingList());
    }

    public KubeSchemaFluent.RoleBindingListNested<A> editOrNewRoleBindingList(){
            return withNewRoleBindingListLike(getRoleBindingList() != null ? getRoleBindingList(): new RoleBindingListBuilder().build());
    }

    public KubeSchemaFluent.RoleBindingListNested<A> editOrNewRoleBindingListLike(RoleBindingList item){
            return withNewRoleBindingListLike(getRoleBindingList() != null ? getRoleBindingList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRoleList instead.
 * @return The buildable object.
 */
@Deprecated public RoleList getRoleList(){
            return this.roleList!=null?this.roleList.build():null;
    }

    public RoleList buildRoleList(){
            return this.roleList!=null?this.roleList.build():null;
    }

    public A withRoleList(RoleList roleList){
            _visitables.remove(this.roleList);
            if (roleList!=null){ this.roleList= new RoleListBuilder(roleList); _visitables.add(this.roleList);} return (A) this;
    }

    public Boolean hasRoleList(){
            return this.roleList != null;
    }

    public KubeSchemaFluent.RoleListNested<A> withNewRoleList(){
            return new RoleListNestedImpl();
    }

    public KubeSchemaFluent.RoleListNested<A> withNewRoleListLike(RoleList item){
            return new RoleListNestedImpl(item);
    }

    public KubeSchemaFluent.RoleListNested<A> editRoleList(){
            return withNewRoleListLike(getRoleList());
    }

    public KubeSchemaFluent.RoleListNested<A> editOrNewRoleList(){
            return withNewRoleListLike(getRoleList() != null ? getRoleList(): new RoleListBuilder().build());
    }

    public KubeSchemaFluent.RoleListNested<A> editOrNewRoleListLike(RoleList item){
            return withNewRoleListLike(getRoleList() != null ? getRoleList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRootPaths instead.
 * @return The buildable object.
 */
@Deprecated public RootPaths getRootPaths(){
            return this.rootPaths!=null?this.rootPaths.build():null;
    }

    public RootPaths buildRootPaths(){
            return this.rootPaths!=null?this.rootPaths.build():null;
    }

    public A withRootPaths(RootPaths rootPaths){
            _visitables.remove(this.rootPaths);
            if (rootPaths!=null){ this.rootPaths= new RootPathsBuilder(rootPaths); _visitables.add(this.rootPaths);} return (A) this;
    }

    public Boolean hasRootPaths(){
            return this.rootPaths != null;
    }

    public KubeSchemaFluent.RootPathsNested<A> withNewRootPaths(){
            return new RootPathsNestedImpl();
    }

    public KubeSchemaFluent.RootPathsNested<A> withNewRootPathsLike(RootPaths item){
            return new RootPathsNestedImpl(item);
    }

    public KubeSchemaFluent.RootPathsNested<A> editRootPaths(){
            return withNewRootPathsLike(getRootPaths());
    }

    public KubeSchemaFluent.RootPathsNested<A> editOrNewRootPaths(){
            return withNewRootPathsLike(getRootPaths() != null ? getRootPaths(): new RootPathsBuilder().build());
    }

    public KubeSchemaFluent.RootPathsNested<A> editOrNewRootPathsLike(RootPaths item){
            return withNewRootPathsLike(getRootPaths() != null ? getRootPaths(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRoute instead.
 * @return The buildable object.
 */
@Deprecated public Route getRoute(){
            return this.route!=null?this.route.build():null;
    }

    public Route buildRoute(){
            return this.route!=null?this.route.build():null;
    }

    public A withRoute(Route route){
            _visitables.remove(this.route);
            if (route!=null){ this.route= new RouteBuilder(route); _visitables.add(this.route);} return (A) this;
    }

    public Boolean hasRoute(){
            return this.route != null;
    }

    public KubeSchemaFluent.RouteNested<A> withNewRoute(){
            return new RouteNestedImpl();
    }

    public KubeSchemaFluent.RouteNested<A> withNewRouteLike(Route item){
            return new RouteNestedImpl(item);
    }

    public KubeSchemaFluent.RouteNested<A> editRoute(){
            return withNewRouteLike(getRoute());
    }

    public KubeSchemaFluent.RouteNested<A> editOrNewRoute(){
            return withNewRouteLike(getRoute() != null ? getRoute(): new RouteBuilder().build());
    }

    public KubeSchemaFluent.RouteNested<A> editOrNewRouteLike(Route item){
            return withNewRouteLike(getRoute() != null ? getRoute(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRouteList instead.
 * @return The buildable object.
 */
@Deprecated public RouteList getRouteList(){
            return this.routeList!=null?this.routeList.build():null;
    }

    public RouteList buildRouteList(){
            return this.routeList!=null?this.routeList.build():null;
    }

    public A withRouteList(RouteList routeList){
            _visitables.remove(this.routeList);
            if (routeList!=null){ this.routeList= new RouteListBuilder(routeList); _visitables.add(this.routeList);} return (A) this;
    }

    public Boolean hasRouteList(){
            return this.routeList != null;
    }

    public KubeSchemaFluent.RouteListNested<A> withNewRouteList(){
            return new RouteListNestedImpl();
    }

    public KubeSchemaFluent.RouteListNested<A> withNewRouteListLike(RouteList item){
            return new RouteListNestedImpl(item);
    }

    public KubeSchemaFluent.RouteListNested<A> editRouteList(){
            return withNewRouteListLike(getRouteList());
    }

    public KubeSchemaFluent.RouteListNested<A> editOrNewRouteList(){
            return withNewRouteListLike(getRouteList() != null ? getRouteList(): new RouteListBuilder().build());
    }

    public KubeSchemaFluent.RouteListNested<A> editOrNewRouteListLike(RouteList item){
            return withNewRouteListLike(getRouteList() != null ? getRouteList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRule instead.
 * @return The buildable object.
 */
@Deprecated public Rule getRule(){
            return this.rule!=null?this.rule.build():null;
    }

    public Rule buildRule(){
            return this.rule!=null?this.rule.build():null;
    }

    public A withRule(Rule rule){
            _visitables.remove(this.rule);
            if (rule!=null){ this.rule= new RuleBuilder(rule); _visitables.add(this.rule);} return (A) this;
    }

    public Boolean hasRule(){
            return this.rule != null;
    }

    public KubeSchemaFluent.RuleNested<A> withNewRule(){
            return new RuleNestedImpl();
    }

    public KubeSchemaFluent.RuleNested<A> withNewRuleLike(Rule item){
            return new RuleNestedImpl(item);
    }

    public KubeSchemaFluent.RuleNested<A> editRule(){
            return withNewRuleLike(getRule());
    }

    public KubeSchemaFluent.RuleNested<A> editOrNewRule(){
            return withNewRuleLike(getRule() != null ? getRule(): new RuleBuilder().build());
    }

    public KubeSchemaFluent.RuleNested<A> editOrNewRuleLike(Rule item){
            return withNewRuleLike(getRule() != null ? getRule(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRuleWithOperations instead.
 * @return The buildable object.
 */
@Deprecated public RuleWithOperations getRuleWithOperations(){
            return this.ruleWithOperations!=null?this.ruleWithOperations.build():null;
    }

    public RuleWithOperations buildRuleWithOperations(){
            return this.ruleWithOperations!=null?this.ruleWithOperations.build():null;
    }

    public A withRuleWithOperations(RuleWithOperations ruleWithOperations){
            _visitables.remove(this.ruleWithOperations);
            if (ruleWithOperations!=null){ this.ruleWithOperations= new RuleWithOperationsBuilder(ruleWithOperations); _visitables.add(this.ruleWithOperations);} return (A) this;
    }

    public Boolean hasRuleWithOperations(){
            return this.ruleWithOperations != null;
    }

    public KubeSchemaFluent.RuleWithOperationsNested<A> withNewRuleWithOperations(){
            return new RuleWithOperationsNestedImpl();
    }

    public KubeSchemaFluent.RuleWithOperationsNested<A> withNewRuleWithOperationsLike(RuleWithOperations item){
            return new RuleWithOperationsNestedImpl(item);
    }

    public KubeSchemaFluent.RuleWithOperationsNested<A> editRuleWithOperations(){
            return withNewRuleWithOperationsLike(getRuleWithOperations());
    }

    public KubeSchemaFluent.RuleWithOperationsNested<A> editOrNewRuleWithOperations(){
            return withNewRuleWithOperationsLike(getRuleWithOperations() != null ? getRuleWithOperations(): new RuleWithOperationsBuilder().build());
    }

    public KubeSchemaFluent.RuleWithOperationsNested<A> editOrNewRuleWithOperationsLike(RuleWithOperations item){
            return withNewRuleWithOperationsLike(getRuleWithOperations() != null ? getRuleWithOperations(): item);
    }

    
/**
 * This method has been deprecated, please use method buildScale instead.
 * @return The buildable object.
 */
@Deprecated public Scale getScale(){
            return this.scale!=null?this.scale.build():null;
    }

    public Scale buildScale(){
            return this.scale!=null?this.scale.build():null;
    }

    public A withScale(Scale scale){
            _visitables.remove(this.scale);
            if (scale!=null){ this.scale= new ScaleBuilder(scale); _visitables.add(this.scale);} return (A) this;
    }

    public Boolean hasScale(){
            return this.scale != null;
    }

    public KubeSchemaFluent.ScaleNested<A> withNewScale(){
            return new ScaleNestedImpl();
    }

    public KubeSchemaFluent.ScaleNested<A> withNewScaleLike(Scale item){
            return new ScaleNestedImpl(item);
    }

    public KubeSchemaFluent.ScaleNested<A> editScale(){
            return withNewScaleLike(getScale());
    }

    public KubeSchemaFluent.ScaleNested<A> editOrNewScale(){
            return withNewScaleLike(getScale() != null ? getScale(): new ScaleBuilder().build());
    }

    public KubeSchemaFluent.ScaleNested<A> editOrNewScaleLike(Scale item){
            return withNewScaleLike(getScale() != null ? getScale(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public Secret getSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public Secret buildSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public A withSecret(Secret secret){
            _visitables.remove(this.secret);
            if (secret!=null){ this.secret= new SecretBuilder(secret); _visitables.add(this.secret);} return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    public KubeSchemaFluent.SecretNested<A> withNewSecret(){
            return new SecretNestedImpl();
    }

    public KubeSchemaFluent.SecretNested<A> withNewSecretLike(Secret item){
            return new SecretNestedImpl(item);
    }

    public KubeSchemaFluent.SecretNested<A> editSecret(){
            return withNewSecretLike(getSecret());
    }

    public KubeSchemaFluent.SecretNested<A> editOrNewSecret(){
            return withNewSecretLike(getSecret() != null ? getSecret(): new SecretBuilder().build());
    }

    public KubeSchemaFluent.SecretNested<A> editOrNewSecretLike(Secret item){
            return withNewSecretLike(getSecret() != null ? getSecret(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecretList instead.
 * @return The buildable object.
 */
@Deprecated public SecretList getSecretList(){
            return this.secretList!=null?this.secretList.build():null;
    }

    public SecretList buildSecretList(){
            return this.secretList!=null?this.secretList.build():null;
    }

    public A withSecretList(SecretList secretList){
            _visitables.remove(this.secretList);
            if (secretList!=null){ this.secretList= new SecretListBuilder(secretList); _visitables.add(this.secretList);} return (A) this;
    }

    public Boolean hasSecretList(){
            return this.secretList != null;
    }

    public KubeSchemaFluent.SecretListNested<A> withNewSecretList(){
            return new SecretListNestedImpl();
    }

    public KubeSchemaFluent.SecretListNested<A> withNewSecretListLike(SecretList item){
            return new SecretListNestedImpl(item);
    }

    public KubeSchemaFluent.SecretListNested<A> editSecretList(){
            return withNewSecretListLike(getSecretList());
    }

    public KubeSchemaFluent.SecretListNested<A> editOrNewSecretList(){
            return withNewSecretListLike(getSecretList() != null ? getSecretList(): new SecretListBuilder().build());
    }

    public KubeSchemaFluent.SecretListNested<A> editOrNewSecretListLike(SecretList item){
            return withNewSecretListLike(getSecretList() != null ? getSecretList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecurityContextConstraints instead.
 * @return The buildable object.
 */
@Deprecated public SecurityContextConstraints getSecurityContextConstraints(){
            return this.securityContextConstraints!=null?this.securityContextConstraints.build():null;
    }

    public SecurityContextConstraints buildSecurityContextConstraints(){
            return this.securityContextConstraints!=null?this.securityContextConstraints.build():null;
    }

    public A withSecurityContextConstraints(SecurityContextConstraints securityContextConstraints){
            _visitables.remove(this.securityContextConstraints);
            if (securityContextConstraints!=null){ this.securityContextConstraints= new SecurityContextConstraintsBuilder(securityContextConstraints); _visitables.add(this.securityContextConstraints);} return (A) this;
    }

    public Boolean hasSecurityContextConstraints(){
            return this.securityContextConstraints != null;
    }

    public KubeSchemaFluent.SecurityContextConstraintsNested<A> withNewSecurityContextConstraints(){
            return new SecurityContextConstraintsNestedImpl();
    }

    public KubeSchemaFluent.SecurityContextConstraintsNested<A> withNewSecurityContextConstraintsLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsNestedImpl(item);
    }

    public KubeSchemaFluent.SecurityContextConstraintsNested<A> editSecurityContextConstraints(){
            return withNewSecurityContextConstraintsLike(getSecurityContextConstraints());
    }

    public KubeSchemaFluent.SecurityContextConstraintsNested<A> editOrNewSecurityContextConstraints(){
            return withNewSecurityContextConstraintsLike(getSecurityContextConstraints() != null ? getSecurityContextConstraints(): new SecurityContextConstraintsBuilder().build());
    }

    public KubeSchemaFluent.SecurityContextConstraintsNested<A> editOrNewSecurityContextConstraintsLike(SecurityContextConstraints item){
            return withNewSecurityContextConstraintsLike(getSecurityContextConstraints() != null ? getSecurityContextConstraints(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecurityContextConstraintsList instead.
 * @return The buildable object.
 */
@Deprecated public SecurityContextConstraintsList getSecurityContextConstraintsList(){
            return this.securityContextConstraintsList!=null?this.securityContextConstraintsList.build():null;
    }

    public SecurityContextConstraintsList buildSecurityContextConstraintsList(){
            return this.securityContextConstraintsList!=null?this.securityContextConstraintsList.build():null;
    }

    public A withSecurityContextConstraintsList(SecurityContextConstraintsList securityContextConstraintsList){
            _visitables.remove(this.securityContextConstraintsList);
            if (securityContextConstraintsList!=null){ this.securityContextConstraintsList= new SecurityContextConstraintsListBuilder(securityContextConstraintsList); _visitables.add(this.securityContextConstraintsList);} return (A) this;
    }

    public Boolean hasSecurityContextConstraintsList(){
            return this.securityContextConstraintsList != null;
    }

    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> withNewSecurityContextConstraintsList(){
            return new SecurityContextConstraintsListNestedImpl();
    }

    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> withNewSecurityContextConstraintsListLike(SecurityContextConstraintsList item){
            return new SecurityContextConstraintsListNestedImpl(item);
    }

    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> editSecurityContextConstraintsList(){
            return withNewSecurityContextConstraintsListLike(getSecurityContextConstraintsList());
    }

    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> editOrNewSecurityContextConstraintsList(){
            return withNewSecurityContextConstraintsListLike(getSecurityContextConstraintsList() != null ? getSecurityContextConstraintsList(): new SecurityContextConstraintsListBuilder().build());
    }

    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> editOrNewSecurityContextConstraintsListLike(SecurityContextConstraintsList item){
            return withNewSecurityContextConstraintsListLike(getSecurityContextConstraintsList() != null ? getSecurityContextConstraintsList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildServiceAccount instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccount getServiceAccount(){
            return this.serviceAccount!=null?this.serviceAccount.build():null;
    }

    public ServiceAccount buildServiceAccount(){
            return this.serviceAccount!=null?this.serviceAccount.build():null;
    }

    public A withServiceAccount(ServiceAccount serviceAccount){
            _visitables.remove(this.serviceAccount);
            if (serviceAccount!=null){ this.serviceAccount= new ServiceAccountBuilder(serviceAccount); _visitables.add(this.serviceAccount);} return (A) this;
    }

    public Boolean hasServiceAccount(){
            return this.serviceAccount != null;
    }

    public KubeSchemaFluent.ServiceAccountNested<A> withNewServiceAccount(){
            return new ServiceAccountNestedImpl();
    }

    public KubeSchemaFluent.ServiceAccountNested<A> withNewServiceAccountLike(ServiceAccount item){
            return new ServiceAccountNestedImpl(item);
    }

    public KubeSchemaFluent.ServiceAccountNested<A> editServiceAccount(){
            return withNewServiceAccountLike(getServiceAccount());
    }

    public KubeSchemaFluent.ServiceAccountNested<A> editOrNewServiceAccount(){
            return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): new ServiceAccountBuilder().build());
    }

    public KubeSchemaFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(ServiceAccount item){
            return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): item);
    }

    
/**
 * This method has been deprecated, please use method buildServiceAccountList instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccountList getServiceAccountList(){
            return this.serviceAccountList!=null?this.serviceAccountList.build():null;
    }

    public ServiceAccountList buildServiceAccountList(){
            return this.serviceAccountList!=null?this.serviceAccountList.build():null;
    }

    public A withServiceAccountList(ServiceAccountList serviceAccountList){
            _visitables.remove(this.serviceAccountList);
            if (serviceAccountList!=null){ this.serviceAccountList= new ServiceAccountListBuilder(serviceAccountList); _visitables.add(this.serviceAccountList);} return (A) this;
    }

    public Boolean hasServiceAccountList(){
            return this.serviceAccountList != null;
    }

    public KubeSchemaFluent.ServiceAccountListNested<A> withNewServiceAccountList(){
            return new ServiceAccountListNestedImpl();
    }

    public KubeSchemaFluent.ServiceAccountListNested<A> withNewServiceAccountListLike(ServiceAccountList item){
            return new ServiceAccountListNestedImpl(item);
    }

    public KubeSchemaFluent.ServiceAccountListNested<A> editServiceAccountList(){
            return withNewServiceAccountListLike(getServiceAccountList());
    }

    public KubeSchemaFluent.ServiceAccountListNested<A> editOrNewServiceAccountList(){
            return withNewServiceAccountListLike(getServiceAccountList() != null ? getServiceAccountList(): new ServiceAccountListBuilder().build());
    }

    public KubeSchemaFluent.ServiceAccountListNested<A> editOrNewServiceAccountListLike(ServiceAccountList item){
            return withNewServiceAccountListLike(getServiceAccountList() != null ? getServiceAccountList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildServiceList instead.
 * @return The buildable object.
 */
@Deprecated public ServiceList getServiceList(){
            return this.serviceList!=null?this.serviceList.build():null;
    }

    public ServiceList buildServiceList(){
            return this.serviceList!=null?this.serviceList.build():null;
    }

    public A withServiceList(ServiceList serviceList){
            _visitables.remove(this.serviceList);
            if (serviceList!=null){ this.serviceList= new ServiceListBuilder(serviceList); _visitables.add(this.serviceList);} return (A) this;
    }

    public Boolean hasServiceList(){
            return this.serviceList != null;
    }

    public KubeSchemaFluent.ServiceListNested<A> withNewServiceList(){
            return new ServiceListNestedImpl();
    }

    public KubeSchemaFluent.ServiceListNested<A> withNewServiceListLike(ServiceList item){
            return new ServiceListNestedImpl(item);
    }

    public KubeSchemaFluent.ServiceListNested<A> editServiceList(){
            return withNewServiceListLike(getServiceList());
    }

    public KubeSchemaFluent.ServiceListNested<A> editOrNewServiceList(){
            return withNewServiceListLike(getServiceList() != null ? getServiceList(): new ServiceListBuilder().build());
    }

    public KubeSchemaFluent.ServiceListNested<A> editOrNewServiceListLike(ServiceList item){
            return withNewServiceListLike(getServiceList() != null ? getServiceList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatefulSet instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSet getStatefulSet(){
            return this.statefulSet!=null?this.statefulSet.build():null;
    }

    public StatefulSet buildStatefulSet(){
            return this.statefulSet!=null?this.statefulSet.build():null;
    }

    public A withStatefulSet(StatefulSet statefulSet){
            _visitables.remove(this.statefulSet);
            if (statefulSet!=null){ this.statefulSet= new StatefulSetBuilder(statefulSet); _visitables.add(this.statefulSet);} return (A) this;
    }

    public Boolean hasStatefulSet(){
            return this.statefulSet != null;
    }

    public KubeSchemaFluent.StatefulSetNested<A> withNewStatefulSet(){
            return new StatefulSetNestedImpl();
    }

    public KubeSchemaFluent.StatefulSetNested<A> withNewStatefulSetLike(StatefulSet item){
            return new StatefulSetNestedImpl(item);
    }

    public KubeSchemaFluent.StatefulSetNested<A> editStatefulSet(){
            return withNewStatefulSetLike(getStatefulSet());
    }

    public KubeSchemaFluent.StatefulSetNested<A> editOrNewStatefulSet(){
            return withNewStatefulSetLike(getStatefulSet() != null ? getStatefulSet(): new StatefulSetBuilder().build());
    }

    public KubeSchemaFluent.StatefulSetNested<A> editOrNewStatefulSetLike(StatefulSet item){
            return withNewStatefulSetLike(getStatefulSet() != null ? getStatefulSet(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatefulSetList instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetList getStatefulSetList(){
            return this.statefulSetList!=null?this.statefulSetList.build():null;
    }

    public StatefulSetList buildStatefulSetList(){
            return this.statefulSetList!=null?this.statefulSetList.build():null;
    }

    public A withStatefulSetList(StatefulSetList statefulSetList){
            _visitables.remove(this.statefulSetList);
            if (statefulSetList!=null){ this.statefulSetList= new StatefulSetListBuilder(statefulSetList); _visitables.add(this.statefulSetList);} return (A) this;
    }

    public Boolean hasStatefulSetList(){
            return this.statefulSetList != null;
    }

    public KubeSchemaFluent.StatefulSetListNested<A> withNewStatefulSetList(){
            return new StatefulSetListNestedImpl();
    }

    public KubeSchemaFluent.StatefulSetListNested<A> withNewStatefulSetListLike(StatefulSetList item){
            return new StatefulSetListNestedImpl(item);
    }

    public KubeSchemaFluent.StatefulSetListNested<A> editStatefulSetList(){
            return withNewStatefulSetListLike(getStatefulSetList());
    }

    public KubeSchemaFluent.StatefulSetListNested<A> editOrNewStatefulSetList(){
            return withNewStatefulSetListLike(getStatefulSetList() != null ? getStatefulSetList(): new StatefulSetListBuilder().build());
    }

    public KubeSchemaFluent.StatefulSetListNested<A> editOrNewStatefulSetListLike(StatefulSetList item){
            return withNewStatefulSetListLike(getStatefulSetList() != null ? getStatefulSetList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public Status buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(Status status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new StatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public KubeSchemaFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public KubeSchemaFluent.StatusNested<A> withNewStatusLike(Status item){
            return new StatusNestedImpl(item);
    }

    public KubeSchemaFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public KubeSchemaFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new StatusBuilder().build());
    }

    public KubeSchemaFluent.StatusNested<A> editOrNewStatusLike(Status item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStorageClass instead.
 * @return The buildable object.
 */
@Deprecated public StorageClass getStorageClass(){
            return this.storageClass!=null?this.storageClass.build():null;
    }

    public StorageClass buildStorageClass(){
            return this.storageClass!=null?this.storageClass.build():null;
    }

    public A withStorageClass(StorageClass storageClass){
            _visitables.remove(this.storageClass);
            if (storageClass!=null){ this.storageClass= new StorageClassBuilder(storageClass); _visitables.add(this.storageClass);} return (A) this;
    }

    public Boolean hasStorageClass(){
            return this.storageClass != null;
    }

    public KubeSchemaFluent.StorageClassNested<A> withNewStorageClass(){
            return new StorageClassNestedImpl();
    }

    public KubeSchemaFluent.StorageClassNested<A> withNewStorageClassLike(StorageClass item){
            return new StorageClassNestedImpl(item);
    }

    public KubeSchemaFluent.StorageClassNested<A> editStorageClass(){
            return withNewStorageClassLike(getStorageClass());
    }

    public KubeSchemaFluent.StorageClassNested<A> editOrNewStorageClass(){
            return withNewStorageClassLike(getStorageClass() != null ? getStorageClass(): new StorageClassBuilder().build());
    }

    public KubeSchemaFluent.StorageClassNested<A> editOrNewStorageClassLike(StorageClass item){
            return withNewStorageClassLike(getStorageClass() != null ? getStorageClass(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStorageClassList instead.
 * @return The buildable object.
 */
@Deprecated public StorageClassList getStorageClassList(){
            return this.storageClassList!=null?this.storageClassList.build():null;
    }

    public StorageClassList buildStorageClassList(){
            return this.storageClassList!=null?this.storageClassList.build():null;
    }

    public A withStorageClassList(StorageClassList storageClassList){
            _visitables.remove(this.storageClassList);
            if (storageClassList!=null){ this.storageClassList= new StorageClassListBuilder(storageClassList); _visitables.add(this.storageClassList);} return (A) this;
    }

    public Boolean hasStorageClassList(){
            return this.storageClassList != null;
    }

    public KubeSchemaFluent.StorageClassListNested<A> withNewStorageClassList(){
            return new StorageClassListNestedImpl();
    }

    public KubeSchemaFluent.StorageClassListNested<A> withNewStorageClassListLike(StorageClassList item){
            return new StorageClassListNestedImpl(item);
    }

    public KubeSchemaFluent.StorageClassListNested<A> editStorageClassList(){
            return withNewStorageClassListLike(getStorageClassList());
    }

    public KubeSchemaFluent.StorageClassListNested<A> editOrNewStorageClassList(){
            return withNewStorageClassListLike(getStorageClassList() != null ? getStorageClassList(): new StorageClassListBuilder().build());
    }

    public KubeSchemaFluent.StorageClassListNested<A> editOrNewStorageClassListLike(StorageClassList item){
            return withNewStorageClassListLike(getStorageClassList() != null ? getStorageClassList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.SubjectAccessReview getSubjectAccessReview(){
            return this.subjectAccessReview!=null?this.subjectAccessReview.build():null;
    }

    public io.fabric8.openshift.api.model.SubjectAccessReview buildSubjectAccessReview(){
            return this.subjectAccessReview!=null?this.subjectAccessReview.build():null;
    }

    public A withSubjectAccessReview(io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReview){
            _visitables.remove(this.subjectAccessReview);
            if (subjectAccessReview!=null){ this.subjectAccessReview= new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder(subjectAccessReview); _visitables.add(this.subjectAccessReview);} return (A) this;
    }

    public Boolean hasSubjectAccessReview(){
            return this.subjectAccessReview != null;
    }

    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> withNewModelSubjectAccessReview(){
            return new ModelSubjectAccessReviewNestedImpl();
    }

    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> withNewSubjectAccessReviewLike(io.fabric8.openshift.api.model.SubjectAccessReview item){
            return new ModelSubjectAccessReviewNestedImpl(item);
    }

    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> editModelSubjectAccessReview(){
            return withNewSubjectAccessReviewLike(getSubjectAccessReview());
    }

    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> editOrNewSubjectAccessReview(){
            return withNewSubjectAccessReviewLike(getSubjectAccessReview() != null ? getSubjectAccessReview(): new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder().build());
    }

    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> editOrNewSubjectAccessReviewLike(io.fabric8.openshift.api.model.SubjectAccessReview item){
            return withNewSubjectAccessReviewLike(getSubjectAccessReview() != null ? getSubjectAccessReview(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSubjectAccessReviewResponse instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReviewResponse getSubjectAccessReviewResponse(){
            return this.subjectAccessReviewResponse!=null?this.subjectAccessReviewResponse.build():null;
    }

    public SubjectAccessReviewResponse buildSubjectAccessReviewResponse(){
            return this.subjectAccessReviewResponse!=null?this.subjectAccessReviewResponse.build():null;
    }

    public A withSubjectAccessReviewResponse(SubjectAccessReviewResponse subjectAccessReviewResponse){
            _visitables.remove(this.subjectAccessReviewResponse);
            if (subjectAccessReviewResponse!=null){ this.subjectAccessReviewResponse= new SubjectAccessReviewResponseBuilder(subjectAccessReviewResponse); _visitables.add(this.subjectAccessReviewResponse);} return (A) this;
    }

    public Boolean hasSubjectAccessReviewResponse(){
            return this.subjectAccessReviewResponse != null;
    }

    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> withNewSubjectAccessReviewResponse(){
            return new SubjectAccessReviewResponseNestedImpl();
    }

    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> withNewSubjectAccessReviewResponseLike(SubjectAccessReviewResponse item){
            return new SubjectAccessReviewResponseNestedImpl(item);
    }

    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> editSubjectAccessReviewResponse(){
            return withNewSubjectAccessReviewResponseLike(getSubjectAccessReviewResponse());
    }

    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> editOrNewSubjectAccessReviewResponse(){
            return withNewSubjectAccessReviewResponseLike(getSubjectAccessReviewResponse() != null ? getSubjectAccessReviewResponse(): new SubjectAccessReviewResponseBuilder().build());
    }

    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> editOrNewSubjectAccessReviewResponseLike(SubjectAccessReviewResponse item){
            return withNewSubjectAccessReviewResponseLike(getSubjectAccessReviewResponse() != null ? getSubjectAccessReviewResponse(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTagEvent instead.
 * @return The buildable object.
 */
@Deprecated public TagEvent getTagEvent(){
            return this.tagEvent!=null?this.tagEvent.build():null;
    }

    public TagEvent buildTagEvent(){
            return this.tagEvent!=null?this.tagEvent.build():null;
    }

    public A withTagEvent(TagEvent tagEvent){
            _visitables.remove(this.tagEvent);
            if (tagEvent!=null){ this.tagEvent= new TagEventBuilder(tagEvent); _visitables.add(this.tagEvent);} return (A) this;
    }

    public Boolean hasTagEvent(){
            return this.tagEvent != null;
    }

    public A withNewTagEvent(String created,String dockerImageReference,Long generation,String image){
            return (A)withTagEvent(new TagEvent(created, dockerImageReference, generation, image));
    }

    public KubeSchemaFluent.TagEventNested<A> withNewTagEvent(){
            return new TagEventNestedImpl();
    }

    public KubeSchemaFluent.TagEventNested<A> withNewTagEventLike(TagEvent item){
            return new TagEventNestedImpl(item);
    }

    public KubeSchemaFluent.TagEventNested<A> editTagEvent(){
            return withNewTagEventLike(getTagEvent());
    }

    public KubeSchemaFluent.TagEventNested<A> editOrNewTagEvent(){
            return withNewTagEventLike(getTagEvent() != null ? getTagEvent(): new TagEventBuilder().build());
    }

    public KubeSchemaFluent.TagEventNested<A> editOrNewTagEventLike(TagEvent item){
            return withNewTagEventLike(getTagEvent() != null ? getTagEvent(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public Template getTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public Template buildTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public A withTemplate(Template template){
            _visitables.remove(this.template);
            if (template!=null){ this.template= new TemplateBuilder(template); _visitables.add(this.template);} return (A) this;
    }

    public Boolean hasTemplate(){
            return this.template != null;
    }

    public KubeSchemaFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public KubeSchemaFluent.TemplateNested<A> withNewTemplateLike(Template item){
            return new TemplateNestedImpl(item);
    }

    public KubeSchemaFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public KubeSchemaFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new TemplateBuilder().build());
    }

    public KubeSchemaFluent.TemplateNested<A> editOrNewTemplateLike(Template item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTemplateList instead.
 * @return The buildable object.
 */
@Deprecated public TemplateList getTemplateList(){
            return this.templateList!=null?this.templateList.build():null;
    }

    public TemplateList buildTemplateList(){
            return this.templateList!=null?this.templateList.build():null;
    }

    public A withTemplateList(TemplateList templateList){
            _visitables.remove(this.templateList);
            if (templateList!=null){ this.templateList= new TemplateListBuilder(templateList); _visitables.add(this.templateList);} return (A) this;
    }

    public Boolean hasTemplateList(){
            return this.templateList != null;
    }

    public KubeSchemaFluent.TemplateListNested<A> withNewTemplateList(){
            return new TemplateListNestedImpl();
    }

    public KubeSchemaFluent.TemplateListNested<A> withNewTemplateListLike(TemplateList item){
            return new TemplateListNestedImpl(item);
    }

    public KubeSchemaFluent.TemplateListNested<A> editTemplateList(){
            return withNewTemplateListLike(getTemplateList());
    }

    public KubeSchemaFluent.TemplateListNested<A> editOrNewTemplateList(){
            return withNewTemplateListLike(getTemplateList() != null ? getTemplateList(): new TemplateListBuilder().build());
    }

    public KubeSchemaFluent.TemplateListNested<A> editOrNewTemplateListLike(TemplateList item){
            return withNewTemplateListLike(getTemplateList() != null ? getTemplateList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTokenReview instead.
 * @return The buildable object.
 */
@Deprecated public TokenReview getTokenReview(){
            return this.tokenReview!=null?this.tokenReview.build():null;
    }

    public TokenReview buildTokenReview(){
            return this.tokenReview!=null?this.tokenReview.build():null;
    }

    public A withTokenReview(TokenReview tokenReview){
            _visitables.remove(this.tokenReview);
            if (tokenReview!=null){ this.tokenReview= new TokenReviewBuilder(tokenReview); _visitables.add(this.tokenReview);} return (A) this;
    }

    public Boolean hasTokenReview(){
            return this.tokenReview != null;
    }

    public KubeSchemaFluent.TokenReviewNested<A> withNewTokenReview(){
            return new TokenReviewNestedImpl();
    }

    public KubeSchemaFluent.TokenReviewNested<A> withNewTokenReviewLike(TokenReview item){
            return new TokenReviewNestedImpl(item);
    }

    public KubeSchemaFluent.TokenReviewNested<A> editTokenReview(){
            return withNewTokenReviewLike(getTokenReview());
    }

    public KubeSchemaFluent.TokenReviewNested<A> editOrNewTokenReview(){
            return withNewTokenReviewLike(getTokenReview() != null ? getTokenReview(): new TokenReviewBuilder().build());
    }

    public KubeSchemaFluent.TokenReviewNested<A> editOrNewTokenReviewLike(TokenReview item){
            return withNewTokenReviewLike(getTokenReview() != null ? getTokenReview(): item);
    }

    
/**
 * This method has been deprecated, please use method buildToleration instead.
 * @return The buildable object.
 */
@Deprecated public Toleration getToleration(){
            return this.toleration!=null?this.toleration.build():null;
    }

    public Toleration buildToleration(){
            return this.toleration!=null?this.toleration.build():null;
    }

    public A withToleration(Toleration toleration){
            _visitables.remove(this.toleration);
            if (toleration!=null){ this.toleration= new TolerationBuilder(toleration); _visitables.add(this.toleration);} return (A) this;
    }

    public Boolean hasToleration(){
            return this.toleration != null;
    }

    public A withNewToleration(String effect,String key,String operator,Long tolerationSeconds,String value){
            return (A)withToleration(new Toleration(effect, key, operator, tolerationSeconds, value));
    }

    public KubeSchemaFluent.TolerationNested<A> withNewToleration(){
            return new TolerationNestedImpl();
    }

    public KubeSchemaFluent.TolerationNested<A> withNewTolerationLike(Toleration item){
            return new TolerationNestedImpl(item);
    }

    public KubeSchemaFluent.TolerationNested<A> editToleration(){
            return withNewTolerationLike(getToleration());
    }

    public KubeSchemaFluent.TolerationNested<A> editOrNewToleration(){
            return withNewTolerationLike(getToleration() != null ? getToleration(): new TolerationBuilder().build());
    }

    public KubeSchemaFluent.TolerationNested<A> editOrNewTolerationLike(Toleration item){
            return withNewTolerationLike(getToleration() != null ? getToleration(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTypeMeta instead.
 * @return The buildable object.
 */
@Deprecated public TypeMeta getTypeMeta(){
            return this.typeMeta!=null?this.typeMeta.build():null;
    }

    public TypeMeta buildTypeMeta(){
            return this.typeMeta!=null?this.typeMeta.build():null;
    }

    public A withTypeMeta(TypeMeta typeMeta){
            _visitables.remove(this.typeMeta);
            if (typeMeta!=null){ this.typeMeta= new TypeMetaBuilder(typeMeta); _visitables.add(this.typeMeta);} return (A) this;
    }

    public Boolean hasTypeMeta(){
            return this.typeMeta != null;
    }

    public A withNewTypeMeta(String apiVersion,String kind){
            return (A)withTypeMeta(new TypeMeta(apiVersion, kind));
    }

    public KubeSchemaFluent.TypeMetaNested<A> withNewTypeMeta(){
            return new TypeMetaNestedImpl();
    }

    public KubeSchemaFluent.TypeMetaNested<A> withNewTypeMetaLike(TypeMeta item){
            return new TypeMetaNestedImpl(item);
    }

    public KubeSchemaFluent.TypeMetaNested<A> editTypeMeta(){
            return withNewTypeMetaLike(getTypeMeta());
    }

    public KubeSchemaFluent.TypeMetaNested<A> editOrNewTypeMeta(){
            return withNewTypeMetaLike(getTypeMeta() != null ? getTypeMeta(): new TypeMetaBuilder().build());
    }

    public KubeSchemaFluent.TypeMetaNested<A> editOrNewTypeMetaLike(TypeMeta item){
            return withNewTypeMetaLike(getTypeMeta() != null ? getTypeMeta(): item);
    }

    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public User getUser(){
            return this.user!=null?this.user.build():null;
    }

    public User buildUser(){
            return this.user!=null?this.user.build():null;
    }

    public A withUser(User user){
            _visitables.remove(this.user);
            if (user!=null){ this.user= new UserBuilder(user); _visitables.add(this.user);} return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public KubeSchemaFluent.UserNested<A> withNewUser(){
            return new UserNestedImpl();
    }

    public KubeSchemaFluent.UserNested<A> withNewUserLike(User item){
            return new UserNestedImpl(item);
    }

    public KubeSchemaFluent.UserNested<A> editUser(){
            return withNewUserLike(getUser());
    }

    public KubeSchemaFluent.UserNested<A> editOrNewUser(){
            return withNewUserLike(getUser() != null ? getUser(): new UserBuilder().build());
    }

    public KubeSchemaFluent.UserNested<A> editOrNewUserLike(User item){
            return withNewUserLike(getUser() != null ? getUser(): item);
    }

    
/**
 * This method has been deprecated, please use method buildUserList instead.
 * @return The buildable object.
 */
@Deprecated public UserList getUserList(){
            return this.userList!=null?this.userList.build():null;
    }

    public UserList buildUserList(){
            return this.userList!=null?this.userList.build():null;
    }

    public A withUserList(UserList userList){
            _visitables.remove(this.userList);
            if (userList!=null){ this.userList= new UserListBuilder(userList); _visitables.add(this.userList);} return (A) this;
    }

    public Boolean hasUserList(){
            return this.userList != null;
    }

    public KubeSchemaFluent.UserListNested<A> withNewUserList(){
            return new UserListNestedImpl();
    }

    public KubeSchemaFluent.UserListNested<A> withNewUserListLike(UserList item){
            return new UserListNestedImpl(item);
    }

    public KubeSchemaFluent.UserListNested<A> editUserList(){
            return withNewUserListLike(getUserList());
    }

    public KubeSchemaFluent.UserListNested<A> editOrNewUserList(){
            return withNewUserListLike(getUserList() != null ? getUserList(): new UserListBuilder().build());
    }

    public KubeSchemaFluent.UserListNested<A> editOrNewUserListLike(UserList item){
            return withNewUserListLike(getUserList() != null ? getUserList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildValidatingWebhookConfiguration instead.
 * @return The buildable object.
 */
@Deprecated public ValidatingWebhookConfiguration getValidatingWebhookConfiguration(){
            return this.validatingWebhookConfiguration!=null?this.validatingWebhookConfiguration.build():null;
    }

    public ValidatingWebhookConfiguration buildValidatingWebhookConfiguration(){
            return this.validatingWebhookConfiguration!=null?this.validatingWebhookConfiguration.build():null;
    }

    public A withValidatingWebhookConfiguration(ValidatingWebhookConfiguration validatingWebhookConfiguration){
            _visitables.remove(this.validatingWebhookConfiguration);
            if (validatingWebhookConfiguration!=null){ this.validatingWebhookConfiguration= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfiguration); _visitables.add(this.validatingWebhookConfiguration);} return (A) this;
    }

    public Boolean hasValidatingWebhookConfiguration(){
            return this.validatingWebhookConfiguration != null;
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> withNewValidatingWebhookConfiguration(){
            return new ValidatingWebhookConfigurationNestedImpl();
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> withNewValidatingWebhookConfigurationLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationNestedImpl(item);
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> editValidatingWebhookConfiguration(){
            return withNewValidatingWebhookConfigurationLike(getValidatingWebhookConfiguration());
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> editOrNewValidatingWebhookConfiguration(){
            return withNewValidatingWebhookConfigurationLike(getValidatingWebhookConfiguration() != null ? getValidatingWebhookConfiguration(): new ValidatingWebhookConfigurationBuilder().build());
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> editOrNewValidatingWebhookConfigurationLike(ValidatingWebhookConfiguration item){
            return withNewValidatingWebhookConfigurationLike(getValidatingWebhookConfiguration() != null ? getValidatingWebhookConfiguration(): item);
    }

    
/**
 * This method has been deprecated, please use method buildValidatingWebhookConfigurationList instead.
 * @return The buildable object.
 */
@Deprecated public ValidatingWebhookConfigurationList getValidatingWebhookConfigurationList(){
            return this.validatingWebhookConfigurationList!=null?this.validatingWebhookConfigurationList.build():null;
    }

    public ValidatingWebhookConfigurationList buildValidatingWebhookConfigurationList(){
            return this.validatingWebhookConfigurationList!=null?this.validatingWebhookConfigurationList.build():null;
    }

    public A withValidatingWebhookConfigurationList(ValidatingWebhookConfigurationList validatingWebhookConfigurationList){
            _visitables.remove(this.validatingWebhookConfigurationList);
            if (validatingWebhookConfigurationList!=null){ this.validatingWebhookConfigurationList= new ValidatingWebhookConfigurationListBuilder(validatingWebhookConfigurationList); _visitables.add(this.validatingWebhookConfigurationList);} return (A) this;
    }

    public Boolean hasValidatingWebhookConfigurationList(){
            return this.validatingWebhookConfigurationList != null;
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> withNewValidatingWebhookConfigurationList(){
            return new ValidatingWebhookConfigurationListNestedImpl();
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> withNewValidatingWebhookConfigurationListLike(ValidatingWebhookConfigurationList item){
            return new ValidatingWebhookConfigurationListNestedImpl(item);
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> editValidatingWebhookConfigurationList(){
            return withNewValidatingWebhookConfigurationListLike(getValidatingWebhookConfigurationList());
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> editOrNewValidatingWebhookConfigurationList(){
            return withNewValidatingWebhookConfigurationListLike(getValidatingWebhookConfigurationList() != null ? getValidatingWebhookConfigurationList(): new ValidatingWebhookConfigurationListBuilder().build());
    }

    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> editOrNewValidatingWebhookConfigurationListLike(ValidatingWebhookConfigurationList item){
            return withNewValidatingWebhookConfigurationListLike(getValidatingWebhookConfigurationList() != null ? getValidatingWebhookConfigurationList(): item);
    }

    
/**
 * This method has been deprecated, please use method buildWatchEvent instead.
 * @return The buildable object.
 */
@Deprecated public WatchEvent getWatchEvent(){
            return this.watchEvent!=null?this.watchEvent.build():null;
    }

    public WatchEvent buildWatchEvent(){
            return this.watchEvent!=null?this.watchEvent.build():null;
    }

    public A withWatchEvent(WatchEvent watchEvent){
            _visitables.remove(this.watchEvent);
            if (watchEvent!=null){ this.watchEvent= new WatchEventBuilder(watchEvent); _visitables.add(this.watchEvent);} return (A) this;
    }

    public Boolean hasWatchEvent(){
            return this.watchEvent != null;
    }

    public KubeSchemaFluent.WatchEventNested<A> withNewWatchEvent(){
            return new WatchEventNestedImpl();
    }

    public KubeSchemaFluent.WatchEventNested<A> withNewWatchEventLike(WatchEvent item){
            return new WatchEventNestedImpl(item);
    }

    public KubeSchemaFluent.WatchEventNested<A> editWatchEvent(){
            return withNewWatchEventLike(getWatchEvent());
    }

    public KubeSchemaFluent.WatchEventNested<A> editOrNewWatchEvent(){
            return withNewWatchEventLike(getWatchEvent() != null ? getWatchEvent(): new WatchEventBuilder().build());
    }

    public KubeSchemaFluent.WatchEventNested<A> editOrNewWatchEventLike(WatchEvent item){
            return withNewWatchEventLike(getWatchEvent() != null ? getWatchEvent(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            KubeSchemaFluentImpl that = (KubeSchemaFluentImpl) o;
            if (admissionRequest != null ? !admissionRequest.equals(that.admissionRequest) :that.admissionRequest != null) return false;
            if (admissionResponse != null ? !admissionResponse.equals(that.admissionResponse) :that.admissionResponse != null) return false;
            if (admissionReview != null ? !admissionReview.equals(that.admissionReview) :that.admissionReview != null) return false;
            if (admissionWebhook != null ? !admissionWebhook.equals(that.admissionWebhook) :that.admissionWebhook != null) return false;
            if (aggregationRule != null ? !aggregationRule.equals(that.aggregationRule) :that.aggregationRule != null) return false;
            if (baseKubernetesList != null ? !baseKubernetesList.equals(that.baseKubernetesList) :that.baseKubernetesList != null) return false;
            if (binding != null ? !binding.equals(that.binding) :that.binding != null) return false;
            if (buildConfigList != null ? !buildConfigList.equals(that.buildConfigList) :that.buildConfigList != null) return false;
            if (buildList != null ? !buildList.equals(that.buildList) :that.buildList != null) return false;
            if (buildRequest != null ? !buildRequest.equals(that.buildRequest) :that.buildRequest != null) return false;
            if (certificateSigningRequest != null ? !certificateSigningRequest.equals(that.certificateSigningRequest) :that.certificateSigningRequest != null) return false;
            if (certificateSigningRequestCondition != null ? !certificateSigningRequestCondition.equals(that.certificateSigningRequestCondition) :that.certificateSigningRequestCondition != null) return false;
            if (certificateSigningRequestList != null ? !certificateSigningRequestList.equals(that.certificateSigningRequestList) :that.certificateSigningRequestList != null) return false;
            if (certificateSigningRequestSpec != null ? !certificateSigningRequestSpec.equals(that.certificateSigningRequestSpec) :that.certificateSigningRequestSpec != null) return false;
            if (certificateSigningRequestStatus != null ? !certificateSigningRequestStatus.equals(that.certificateSigningRequestStatus) :that.certificateSigningRequestStatus != null) return false;
            if (clusterRole != null ? !clusterRole.equals(that.clusterRole) :that.clusterRole != null) return false;
            if (clusterRoleBinding != null ? !clusterRoleBinding.equals(that.clusterRoleBinding) :that.clusterRoleBinding != null) return false;
            if (clusterRoleBindingList != null ? !clusterRoleBindingList.equals(that.clusterRoleBindingList) :that.clusterRoleBindingList != null) return false;
            if (clusterRoleList != null ? !clusterRoleList.equals(that.clusterRoleList) :that.clusterRoleList != null) return false;
            if (componentStatusList != null ? !componentStatusList.equals(that.componentStatusList) :that.componentStatusList != null) return false;
            if (config != null ? !config.equals(that.config) :that.config != null) return false;
            if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
            if (configMapList != null ? !configMapList.equals(that.configMapList) :that.configMapList != null) return false;
            if (containerStatus != null ? !containerStatus.equals(that.containerStatus) :that.containerStatus != null) return false;
            if (cronJob != null ? !cronJob.equals(that.cronJob) :that.cronJob != null) return false;
            if (cronJobList != null ? !cronJobList.equals(that.cronJobList) :that.cronJobList != null) return false;
            if (customResourceDefinition != null ? !customResourceDefinition.equals(that.customResourceDefinition) :that.customResourceDefinition != null) return false;
            if (customResourceDefinitionCondition != null ? !customResourceDefinitionCondition.equals(that.customResourceDefinitionCondition) :that.customResourceDefinitionCondition != null) return false;
            if (customResourceDefinitionList != null ? !customResourceDefinitionList.equals(that.customResourceDefinitionList) :that.customResourceDefinitionList != null) return false;
            if (customResourceDefinitionNames != null ? !customResourceDefinitionNames.equals(that.customResourceDefinitionNames) :that.customResourceDefinitionNames != null) return false;
            if (customResourceDefinitionSpec != null ? !customResourceDefinitionSpec.equals(that.customResourceDefinitionSpec) :that.customResourceDefinitionSpec != null) return false;
            if (customResourceDefinitionStatus != null ? !customResourceDefinitionStatus.equals(that.customResourceDefinitionStatus) :that.customResourceDefinitionStatus != null) return false;
            if (daemonSet != null ? !daemonSet.equals(that.daemonSet) :that.daemonSet != null) return false;
            if (daemonSetList != null ? !daemonSetList.equals(that.daemonSetList) :that.daemonSetList != null) return false;
            if (deleteOptions != null ? !deleteOptions.equals(that.deleteOptions) :that.deleteOptions != null) return false;
            if (deployment != null ? !deployment.equals(that.deployment) :that.deployment != null) return false;
            if (deploymentConfig != null ? !deploymentConfig.equals(that.deploymentConfig) :that.deploymentConfig != null) return false;
            if (deploymentConfigList != null ? !deploymentConfigList.equals(that.deploymentConfigList) :that.deploymentConfigList != null) return false;
            if (deploymentList != null ? !deploymentList.equals(that.deploymentList) :that.deploymentList != null) return false;
            if (deploymentRollback != null ? !deploymentRollback.equals(that.deploymentRollback) :that.deploymentRollback != null) return false;
            if (endpoints != null ? !endpoints.equals(that.endpoints) :that.endpoints != null) return false;
            if (endpointsList != null ? !endpointsList.equals(that.endpointsList) :that.endpointsList != null) return false;
            if (envVar != null ? !envVar.equals(that.envVar) :that.envVar != null) return false;
            if (event != null ? !event.equals(that.event) :that.event != null) return false;
            if (eventList != null ? !eventList.equals(that.eventList) :that.eventList != null) return false;
            if (eventSeries != null ? !eventSeries.equals(that.eventSeries) :that.eventSeries != null) return false;
            if (eventSeriesState != null ? !eventSeriesState.equals(that.eventSeriesState) :that.eventSeriesState != null) return false;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (groupList != null ? !groupList.equals(that.groupList) :that.groupList != null) return false;
            if (horizontalPodAutoscaler != null ? !horizontalPodAutoscaler.equals(that.horizontalPodAutoscaler) :that.horizontalPodAutoscaler != null) return false;
            if (horizontalPodAutoscalerList != null ? !horizontalPodAutoscalerList.equals(that.horizontalPodAutoscalerList) :that.horizontalPodAutoscalerList != null) return false;
            if (identity != null ? !identity.equals(that.identity) :that.identity != null) return false;
            if (identityList != null ? !identityList.equals(that.identityList) :that.identityList != null) return false;
            if (imageList != null ? !imageList.equals(that.imageList) :that.imageList != null) return false;
            if (imageStreamImport != null ? !imageStreamImport.equals(that.imageStreamImport) :that.imageStreamImport != null) return false;
            if (imageStreamList != null ? !imageStreamList.equals(that.imageStreamList) :that.imageStreamList != null) return false;
            if (imageStreamTagList != null ? !imageStreamTagList.equals(that.imageStreamTagList) :that.imageStreamTagList != null) return false;
            if (info != null ? !info.equals(that.info) :that.info != null) return false;
            if (ingress != null ? !ingress.equals(that.ingress) :that.ingress != null) return false;
            if (ingressList != null ? !ingressList.equals(that.ingressList) :that.ingressList != null) return false;
            if (initializer != null ? !initializer.equals(that.initializer) :that.initializer != null) return false;
            if (initializers != null ? !initializers.equals(that.initializers) :that.initializers != null) return false;
            if (jSONSchemaPropsorStringArray != null ? !jSONSchemaPropsorStringArray.equals(that.jSONSchemaPropsorStringArray) :that.jSONSchemaPropsorStringArray != null) return false;
            if (job != null ? !job.equals(that.job) :that.job != null) return false;
            if (jobList != null ? !jobList.equals(that.jobList) :that.jobList != null) return false;
            if (k8sLocalSubjectAccessReview != null ? !k8sLocalSubjectAccessReview.equals(that.k8sLocalSubjectAccessReview) :that.k8sLocalSubjectAccessReview != null) return false;
            if (k8sSubjectAccessReview != null ? !k8sSubjectAccessReview.equals(that.k8sSubjectAccessReview) :that.k8sSubjectAccessReview != null) return false;
            if (limitRangeList != null ? !limitRangeList.equals(that.limitRangeList) :that.limitRangeList != null) return false;
            if (localSubjectAccessReview != null ? !localSubjectAccessReview.equals(that.localSubjectAccessReview) :that.localSubjectAccessReview != null) return false;
            if (mutatingWebhookConfiguration != null ? !mutatingWebhookConfiguration.equals(that.mutatingWebhookConfiguration) :that.mutatingWebhookConfiguration != null) return false;
            if (mutatingWebhookConfigurationList != null ? !mutatingWebhookConfigurationList.equals(that.mutatingWebhookConfigurationList) :that.mutatingWebhookConfigurationList != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (namespaceList != null ? !namespaceList.equals(that.namespaceList) :that.namespaceList != null) return false;
            if (netNameSpace != null ? !netNameSpace.equals(that.netNameSpace) :that.netNameSpace != null) return false;
            if (netNameSpaceList != null ? !netNameSpaceList.equals(that.netNameSpaceList) :that.netNameSpaceList != null) return false;
            if (networkPolicy != null ? !networkPolicy.equals(that.networkPolicy) :that.networkPolicy != null) return false;
            if (networkPolicyList != null ? !networkPolicyList.equals(that.networkPolicyList) :that.networkPolicyList != null) return false;
            if (node != null ? !node.equals(that.node) :that.node != null) return false;
            if (nodeList != null ? !nodeList.equals(that.nodeList) :that.nodeList != null) return false;
            if (oAuthAccessToken != null ? !oAuthAccessToken.equals(that.oAuthAccessToken) :that.oAuthAccessToken != null) return false;
            if (oAuthAccessTokenList != null ? !oAuthAccessTokenList.equals(that.oAuthAccessTokenList) :that.oAuthAccessTokenList != null) return false;
            if (oAuthAuthorizeToken != null ? !oAuthAuthorizeToken.equals(that.oAuthAuthorizeToken) :that.oAuthAuthorizeToken != null) return false;
            if (oAuthAuthorizeTokenList != null ? !oAuthAuthorizeTokenList.equals(that.oAuthAuthorizeTokenList) :that.oAuthAuthorizeTokenList != null) return false;
            if (oAuthClient != null ? !oAuthClient.equals(that.oAuthClient) :that.oAuthClient != null) return false;
            if (oAuthClientAuthorization != null ? !oAuthClientAuthorization.equals(that.oAuthClientAuthorization) :that.oAuthClientAuthorization != null) return false;
            if (oAuthClientAuthorizationList != null ? !oAuthClientAuthorizationList.equals(that.oAuthClientAuthorizationList) :that.oAuthClientAuthorizationList != null) return false;
            if (oAuthClientList != null ? !oAuthClientList.equals(that.oAuthClientList) :that.oAuthClientList != null) return false;
            if (objectMeta != null ? !objectMeta.equals(that.objectMeta) :that.objectMeta != null) return false;
            if (openshiftClusterRole != null ? !openshiftClusterRole.equals(that.openshiftClusterRole) :that.openshiftClusterRole != null) return false;
            if (openshiftClusterRoleBinding != null ? !openshiftClusterRoleBinding.equals(that.openshiftClusterRoleBinding) :that.openshiftClusterRoleBinding != null) return false;
            if (openshiftClusterRoleBindingList != null ? !openshiftClusterRoleBindingList.equals(that.openshiftClusterRoleBindingList) :that.openshiftClusterRoleBindingList != null) return false;
            if (openshiftRole != null ? !openshiftRole.equals(that.openshiftRole) :that.openshiftRole != null) return false;
            if (openshiftRoleBinding != null ? !openshiftRoleBinding.equals(that.openshiftRoleBinding) :that.openshiftRoleBinding != null) return false;
            if (openshiftRoleBindingList != null ? !openshiftRoleBindingList.equals(that.openshiftRoleBindingList) :that.openshiftRoleBindingList != null) return false;
            if (openshiftRoleBindingRestriction != null ? !openshiftRoleBindingRestriction.equals(that.openshiftRoleBindingRestriction) :that.openshiftRoleBindingRestriction != null) return false;
            if (openshiftRoleList != null ? !openshiftRoleList.equals(that.openshiftRoleList) :that.openshiftRoleList != null) return false;
            if (operation != null ? !operation.equals(that.operation) :that.operation != null) return false;
            if (patch != null ? !patch.equals(that.patch) :that.patch != null) return false;
            if (patchType != null ? !patchType.equals(that.patchType) :that.patchType != null) return false;
            if (persistentVolume != null ? !persistentVolume.equals(that.persistentVolume) :that.persistentVolume != null) return false;
            if (persistentVolumeClaim != null ? !persistentVolumeClaim.equals(that.persistentVolumeClaim) :that.persistentVolumeClaim != null) return false;
            if (persistentVolumeClaimList != null ? !persistentVolumeClaimList.equals(that.persistentVolumeClaimList) :that.persistentVolumeClaimList != null) return false;
            if (persistentVolumeList != null ? !persistentVolumeList.equals(that.persistentVolumeList) :that.persistentVolumeList != null) return false;
            if (podDisruptionBudget != null ? !podDisruptionBudget.equals(that.podDisruptionBudget) :that.podDisruptionBudget != null) return false;
            if (podDisruptionBudgetList != null ? !podDisruptionBudgetList.equals(that.podDisruptionBudgetList) :that.podDisruptionBudgetList != null) return false;
            if (podList != null ? !podList.equals(that.podList) :that.podList != null) return false;
            if (podPreset != null ? !podPreset.equals(that.podPreset) :that.podPreset != null) return false;
            if (podPresetList != null ? !podPresetList.equals(that.podPresetList) :that.podPresetList != null) return false;
            if (podPresetSpec != null ? !podPresetSpec.equals(that.podPresetSpec) :that.podPresetSpec != null) return false;
            if (podSecurityPolicy != null ? !podSecurityPolicy.equals(that.podSecurityPolicy) :that.podSecurityPolicy != null) return false;
            if (podSecurityPolicyList != null ? !podSecurityPolicyList.equals(that.podSecurityPolicyList) :that.podSecurityPolicyList != null) return false;
            if (podTemplateList != null ? !podTemplateList.equals(that.podTemplateList) :that.podTemplateList != null) return false;
            if (priorityClass != null ? !priorityClass.equals(that.priorityClass) :that.priorityClass != null) return false;
            if (priorityClassList != null ? !priorityClassList.equals(that.priorityClassList) :that.priorityClassList != null) return false;
            if (project != null ? !project.equals(that.project) :that.project != null) return false;
            if (projectList != null ? !projectList.equals(that.projectList) :that.projectList != null) return false;
            if (projectRequest != null ? !projectRequest.equals(that.projectRequest) :that.projectRequest != null) return false;
            if (quantity != null ? !quantity.equals(that.quantity) :that.quantity != null) return false;
            if (replicaSet != null ? !replicaSet.equals(that.replicaSet) :that.replicaSet != null) return false;
            if (replicaSetList != null ? !replicaSetList.equals(that.replicaSetList) :that.replicaSetList != null) return false;
            if (replicationControllerList != null ? !replicationControllerList.equals(that.replicationControllerList) :that.replicationControllerList != null) return false;
            if (resourceQuota != null ? !resourceQuota.equals(that.resourceQuota) :that.resourceQuota != null) return false;
            if (resourceQuotaList != null ? !resourceQuotaList.equals(that.resourceQuotaList) :that.resourceQuotaList != null) return false;
            if (role != null ? !role.equals(that.role) :that.role != null) return false;
            if (roleBinding != null ? !roleBinding.equals(that.roleBinding) :that.roleBinding != null) return false;
            if (roleBindingList != null ? !roleBindingList.equals(that.roleBindingList) :that.roleBindingList != null) return false;
            if (roleList != null ? !roleList.equals(that.roleList) :that.roleList != null) return false;
            if (rootPaths != null ? !rootPaths.equals(that.rootPaths) :that.rootPaths != null) return false;
            if (route != null ? !route.equals(that.route) :that.route != null) return false;
            if (routeList != null ? !routeList.equals(that.routeList) :that.routeList != null) return false;
            if (rule != null ? !rule.equals(that.rule) :that.rule != null) return false;
            if (ruleWithOperations != null ? !ruleWithOperations.equals(that.ruleWithOperations) :that.ruleWithOperations != null) return false;
            if (scale != null ? !scale.equals(that.scale) :that.scale != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            if (secretList != null ? !secretList.equals(that.secretList) :that.secretList != null) return false;
            if (securityContextConstraints != null ? !securityContextConstraints.equals(that.securityContextConstraints) :that.securityContextConstraints != null) return false;
            if (securityContextConstraintsList != null ? !securityContextConstraintsList.equals(that.securityContextConstraintsList) :that.securityContextConstraintsList != null) return false;
            if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
            if (serviceAccountList != null ? !serviceAccountList.equals(that.serviceAccountList) :that.serviceAccountList != null) return false;
            if (serviceList != null ? !serviceList.equals(that.serviceList) :that.serviceList != null) return false;
            if (statefulSet != null ? !statefulSet.equals(that.statefulSet) :that.statefulSet != null) return false;
            if (statefulSetList != null ? !statefulSetList.equals(that.statefulSetList) :that.statefulSetList != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            if (storageClass != null ? !storageClass.equals(that.storageClass) :that.storageClass != null) return false;
            if (storageClassList != null ? !storageClassList.equals(that.storageClassList) :that.storageClassList != null) return false;
            if (subjectAccessReview != null ? !subjectAccessReview.equals(that.subjectAccessReview) :that.subjectAccessReview != null) return false;
            if (subjectAccessReviewResponse != null ? !subjectAccessReviewResponse.equals(that.subjectAccessReviewResponse) :that.subjectAccessReviewResponse != null) return false;
            if (tagEvent != null ? !tagEvent.equals(that.tagEvent) :that.tagEvent != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            if (templateList != null ? !templateList.equals(that.templateList) :that.templateList != null) return false;
            if (tokenReview != null ? !tokenReview.equals(that.tokenReview) :that.tokenReview != null) return false;
            if (toleration != null ? !toleration.equals(that.toleration) :that.toleration != null) return false;
            if (typeMeta != null ? !typeMeta.equals(that.typeMeta) :that.typeMeta != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            if (userList != null ? !userList.equals(that.userList) :that.userList != null) return false;
            if (validatingWebhookConfiguration != null ? !validatingWebhookConfiguration.equals(that.validatingWebhookConfiguration) :that.validatingWebhookConfiguration != null) return false;
            if (validatingWebhookConfigurationList != null ? !validatingWebhookConfigurationList.equals(that.validatingWebhookConfigurationList) :that.validatingWebhookConfigurationList != null) return false;
            if (watchEvent != null ? !watchEvent.equals(that.watchEvent) :that.watchEvent != null) return false;
            return true;
    }


    public class AdmissionRequestNestedImpl<N> extends AdmissionRequestFluentImpl<KubeSchemaFluent.AdmissionRequestNested<N>> implements KubeSchemaFluent.AdmissionRequestNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionRequestBuilder builder;
    
            AdmissionRequestNestedImpl(AdmissionRequest item){
                    this.builder = new AdmissionRequestBuilder(this, item);
            }
            AdmissionRequestNestedImpl(){
                    this.builder = new AdmissionRequestBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withAdmissionRequest(builder.build());
    }
    public N endAdmissionRequest(){
            return and();
    }

}
    public class AdmissionResponseNestedImpl<N> extends AdmissionResponseFluentImpl<KubeSchemaFluent.AdmissionResponseNested<N>> implements KubeSchemaFluent.AdmissionResponseNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionResponseBuilder builder;
    
            AdmissionResponseNestedImpl(AdmissionResponse item){
                    this.builder = new AdmissionResponseBuilder(this, item);
            }
            AdmissionResponseNestedImpl(){
                    this.builder = new AdmissionResponseBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withAdmissionResponse(builder.build());
    }
    public N endAdmissionResponse(){
            return and();
    }

}
    public class AdmissionReviewNestedImpl<N> extends AdmissionReviewFluentImpl<KubeSchemaFluent.AdmissionReviewNested<N>> implements KubeSchemaFluent.AdmissionReviewNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionReviewBuilder builder;
    
            AdmissionReviewNestedImpl(AdmissionReview item){
                    this.builder = new AdmissionReviewBuilder(this, item);
            }
            AdmissionReviewNestedImpl(){
                    this.builder = new AdmissionReviewBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withAdmissionReview(builder.build());
    }
    public N endAdmissionReview(){
            return and();
    }

}
    public class AdmissionWebhookNestedImpl<N> extends WebhookFluentImpl<KubeSchemaFluent.AdmissionWebhookNested<N>> implements KubeSchemaFluent.AdmissionWebhookNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebhookBuilder builder;
    
            AdmissionWebhookNestedImpl(Webhook item){
                    this.builder = new WebhookBuilder(this, item);
            }
            AdmissionWebhookNestedImpl(){
                    this.builder = new WebhookBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withAdmissionWebhook(builder.build());
    }
    public N endAdmissionWebhook(){
            return and();
    }

}
    public class AggregationRuleNestedImpl<N> extends AggregationRuleFluentImpl<KubeSchemaFluent.AggregationRuleNested<N>> implements KubeSchemaFluent.AggregationRuleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AggregationRuleBuilder builder;
    
            AggregationRuleNestedImpl(AggregationRule item){
                    this.builder = new AggregationRuleBuilder(this, item);
            }
            AggregationRuleNestedImpl(){
                    this.builder = new AggregationRuleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withAggregationRule(builder.build());
    }
    public N endAggregationRule(){
            return and();
    }

}
    public class BaseKubernetesListNestedImpl<N> extends BaseKubernetesListFluentImpl<KubeSchemaFluent.BaseKubernetesListNested<N>> implements KubeSchemaFluent.BaseKubernetesListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BaseKubernetesListBuilder builder;
    
            BaseKubernetesListNestedImpl(BaseKubernetesList item){
                    this.builder = new BaseKubernetesListBuilder(this, item);
            }
            BaseKubernetesListNestedImpl(){
                    this.builder = new BaseKubernetesListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withBaseKubernetesList(builder.build());
    }
    public N endBaseKubernetesList(){
            return and();
    }

}
    public class BindingNestedImpl<N> extends BindingFluentImpl<KubeSchemaFluent.BindingNested<N>> implements KubeSchemaFluent.BindingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withBinding(builder.build());
    }
    public N endBinding(){
            return and();
    }

}
    public class BuildConfigListNestedImpl<N> extends BuildConfigListFluentImpl<KubeSchemaFluent.BuildConfigListNested<N>> implements KubeSchemaFluent.BuildConfigListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigListBuilder builder;
    
            BuildConfigListNestedImpl(BuildConfigList item){
                    this.builder = new BuildConfigListBuilder(this, item);
            }
            BuildConfigListNestedImpl(){
                    this.builder = new BuildConfigListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withBuildConfigList(builder.build());
    }
    public N endBuildConfigList(){
            return and();
    }

}
    public class BuildListNestedImpl<N> extends BuildListFluentImpl<KubeSchemaFluent.BuildListNested<N>> implements KubeSchemaFluent.BuildListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildListBuilder builder;
    
            BuildListNestedImpl(BuildList item){
                    this.builder = new BuildListBuilder(this, item);
            }
            BuildListNestedImpl(){
                    this.builder = new BuildListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withBuildList(builder.build());
    }
    public N endBuildList(){
            return and();
    }

}
    public class BuildRequestNestedImpl<N> extends BuildRequestFluentImpl<KubeSchemaFluent.BuildRequestNested<N>> implements KubeSchemaFluent.BuildRequestNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withBuildRequest(builder.build());
    }
    public N endBuildRequest(){
            return and();
    }

}
    public class CertificateSigningRequestNestedImpl<N> extends CertificateSigningRequestFluentImpl<KubeSchemaFluent.CertificateSigningRequestNested<N>> implements KubeSchemaFluent.CertificateSigningRequestNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCertificateSigningRequest(builder.build());
    }
    public N endCertificateSigningRequest(){
            return and();
    }

}
    public class CertificateSigningRequestConditionNestedImpl<N> extends CertificateSigningRequestConditionFluentImpl<KubeSchemaFluent.CertificateSigningRequestConditionNested<N>> implements KubeSchemaFluent.CertificateSigningRequestConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestConditionBuilder builder;
    
            CertificateSigningRequestConditionNestedImpl(CertificateSigningRequestCondition item){
                    this.builder = new CertificateSigningRequestConditionBuilder(this, item);
            }
            CertificateSigningRequestConditionNestedImpl(){
                    this.builder = new CertificateSigningRequestConditionBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCertificateSigningRequestCondition(builder.build());
    }
    public N endCertificateSigningRequestCondition(){
            return and();
    }

}
    public class CertificateSigningRequestListNestedImpl<N> extends CertificateSigningRequestListFluentImpl<KubeSchemaFluent.CertificateSigningRequestListNested<N>> implements KubeSchemaFluent.CertificateSigningRequestListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestListBuilder builder;
    
            CertificateSigningRequestListNestedImpl(CertificateSigningRequestList item){
                    this.builder = new CertificateSigningRequestListBuilder(this, item);
            }
            CertificateSigningRequestListNestedImpl(){
                    this.builder = new CertificateSigningRequestListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCertificateSigningRequestList(builder.build());
    }
    public N endCertificateSigningRequestList(){
            return and();
    }

}
    public class CertificateSigningRequestSpecNestedImpl<N> extends CertificateSigningRequestSpecFluentImpl<KubeSchemaFluent.CertificateSigningRequestSpecNested<N>> implements KubeSchemaFluent.CertificateSigningRequestSpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestSpecBuilder builder;
    
            CertificateSigningRequestSpecNestedImpl(CertificateSigningRequestSpec item){
                    this.builder = new CertificateSigningRequestSpecBuilder(this, item);
            }
            CertificateSigningRequestSpecNestedImpl(){
                    this.builder = new CertificateSigningRequestSpecBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCertificateSigningRequestSpec(builder.build());
    }
    public N endCertificateSigningRequestSpec(){
            return and();
    }

}
    public class CertificateSigningRequestStatusNestedImpl<N> extends CertificateSigningRequestStatusFluentImpl<KubeSchemaFluent.CertificateSigningRequestStatusNested<N>> implements KubeSchemaFluent.CertificateSigningRequestStatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestStatusBuilder builder;
    
            CertificateSigningRequestStatusNestedImpl(CertificateSigningRequestStatus item){
                    this.builder = new CertificateSigningRequestStatusBuilder(this, item);
            }
            CertificateSigningRequestStatusNestedImpl(){
                    this.builder = new CertificateSigningRequestStatusBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCertificateSigningRequestStatus(builder.build());
    }
    public N endCertificateSigningRequestStatus(){
            return and();
    }

}
    public class ClusterRoleNestedImpl<N> extends ClusterRoleFluentImpl<KubeSchemaFluent.ClusterRoleNested<N>> implements KubeSchemaFluent.ClusterRoleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withClusterRole(builder.build());
    }
    public N endClusterRole(){
            return and();
    }

}
    public class ClusterRoleBindingNestedImpl<N> extends ClusterRoleBindingFluentImpl<KubeSchemaFluent.ClusterRoleBindingNested<N>> implements KubeSchemaFluent.ClusterRoleBindingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withClusterRoleBinding(builder.build());
    }
    public N endClusterRoleBinding(){
            return and();
    }

}
    public class ClusterRoleBindingListNestedImpl<N> extends ClusterRoleBindingListFluentImpl<KubeSchemaFluent.ClusterRoleBindingListNested<N>> implements KubeSchemaFluent.ClusterRoleBindingListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingListBuilder builder;
    
            ClusterRoleBindingListNestedImpl(ClusterRoleBindingList item){
                    this.builder = new ClusterRoleBindingListBuilder(this, item);
            }
            ClusterRoleBindingListNestedImpl(){
                    this.builder = new ClusterRoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withClusterRoleBindingList(builder.build());
    }
    public N endClusterRoleBindingList(){
            return and();
    }

}
    public class ClusterRoleListNestedImpl<N> extends ClusterRoleListFluentImpl<KubeSchemaFluent.ClusterRoleListNested<N>> implements KubeSchemaFluent.ClusterRoleListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleListBuilder builder;
    
            ClusterRoleListNestedImpl(ClusterRoleList item){
                    this.builder = new ClusterRoleListBuilder(this, item);
            }
            ClusterRoleListNestedImpl(){
                    this.builder = new ClusterRoleListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withClusterRoleList(builder.build());
    }
    public N endClusterRoleList(){
            return and();
    }

}
    public class ComponentStatusListNestedImpl<N> extends ComponentStatusListFluentImpl<KubeSchemaFluent.ComponentStatusListNested<N>> implements KubeSchemaFluent.ComponentStatusListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusListBuilder builder;
    
            ComponentStatusListNestedImpl(ComponentStatusList item){
                    this.builder = new ComponentStatusListBuilder(this, item);
            }
            ComponentStatusListNestedImpl(){
                    this.builder = new ComponentStatusListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withComponentStatusList(builder.build());
    }
    public N endComponentStatusList(){
            return and();
    }

}
    public class ConfigNestedImpl<N> extends ConfigFluentImpl<KubeSchemaFluent.ConfigNested<N>> implements KubeSchemaFluent.ConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigBuilder builder;
    
            ConfigNestedImpl(Config item){
                    this.builder = new ConfigBuilder(this, item);
            }
            ConfigNestedImpl(){
                    this.builder = new ConfigBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withConfig(builder.build());
    }
    public N endConfig(){
            return and();
    }

}
    public class ConfigMapNestedImpl<N> extends ConfigMapFluentImpl<KubeSchemaFluent.ConfigMapNested<N>> implements KubeSchemaFluent.ConfigMapNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap(){
            return and();
    }

}
    public class ConfigMapListNestedImpl<N> extends ConfigMapListFluentImpl<KubeSchemaFluent.ConfigMapListNested<N>> implements KubeSchemaFluent.ConfigMapListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapListBuilder builder;
    
            ConfigMapListNestedImpl(ConfigMapList item){
                    this.builder = new ConfigMapListBuilder(this, item);
            }
            ConfigMapListNestedImpl(){
                    this.builder = new ConfigMapListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withConfigMapList(builder.build());
    }
    public N endConfigMapList(){
            return and();
    }

}
    public class ContainerStatusNestedImpl<N> extends ContainerStatusFluentImpl<KubeSchemaFluent.ContainerStatusNested<N>> implements KubeSchemaFluent.ContainerStatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStatusBuilder builder;
    
            ContainerStatusNestedImpl(ContainerStatus item){
                    this.builder = new ContainerStatusBuilder(this, item);
            }
            ContainerStatusNestedImpl(){
                    this.builder = new ContainerStatusBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withContainerStatus(builder.build());
    }
    public N endContainerStatus(){
            return and();
    }

}
    public class CronJobNestedImpl<N> extends CronJobFluentImpl<KubeSchemaFluent.CronJobNested<N>> implements KubeSchemaFluent.CronJobNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCronJob(builder.build());
    }
    public N endCronJob(){
            return and();
    }

}
    public class CronJobListNestedImpl<N> extends CronJobListFluentImpl<KubeSchemaFluent.CronJobListNested<N>> implements KubeSchemaFluent.CronJobListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobListBuilder builder;
    
            CronJobListNestedImpl(CronJobList item){
                    this.builder = new CronJobListBuilder(this, item);
            }
            CronJobListNestedImpl(){
                    this.builder = new CronJobListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCronJobList(builder.build());
    }
    public N endCronJobList(){
            return and();
    }

}
    public class CustomResourceDefinitionNestedImpl<N> extends CustomResourceDefinitionFluentImpl<KubeSchemaFluent.CustomResourceDefinitionNested<N>> implements KubeSchemaFluent.CustomResourceDefinitionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCustomResourceDefinition(builder.build());
    }
    public N endCustomResourceDefinition(){
            return and();
    }

}
    public class CustomResourceDefinitionConditionNestedImpl<N> extends CustomResourceDefinitionConditionFluentImpl<KubeSchemaFluent.CustomResourceDefinitionConditionNested<N>> implements KubeSchemaFluent.CustomResourceDefinitionConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionConditionBuilder builder;
    
            CustomResourceDefinitionConditionNestedImpl(CustomResourceDefinitionCondition item){
                    this.builder = new CustomResourceDefinitionConditionBuilder(this, item);
            }
            CustomResourceDefinitionConditionNestedImpl(){
                    this.builder = new CustomResourceDefinitionConditionBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCustomResourceDefinitionCondition(builder.build());
    }
    public N endCustomResourceDefinitionCondition(){
            return and();
    }

}
    public class CustomResourceDefinitionListNestedImpl<N> extends CustomResourceDefinitionListFluentImpl<KubeSchemaFluent.CustomResourceDefinitionListNested<N>> implements KubeSchemaFluent.CustomResourceDefinitionListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionListBuilder builder;
    
            CustomResourceDefinitionListNestedImpl(CustomResourceDefinitionList item){
                    this.builder = new CustomResourceDefinitionListBuilder(this, item);
            }
            CustomResourceDefinitionListNestedImpl(){
                    this.builder = new CustomResourceDefinitionListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCustomResourceDefinitionList(builder.build());
    }
    public N endCustomResourceDefinitionList(){
            return and();
    }

}
    public class CustomResourceDefinitionNamesNestedImpl<N> extends CustomResourceDefinitionNamesFluentImpl<KubeSchemaFluent.CustomResourceDefinitionNamesNested<N>> implements KubeSchemaFluent.CustomResourceDefinitionNamesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionNamesBuilder builder;
    
            CustomResourceDefinitionNamesNestedImpl(CustomResourceDefinitionNames item){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this, item);
            }
            CustomResourceDefinitionNamesNestedImpl(){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCustomResourceDefinitionNames(builder.build());
    }
    public N endCustomResourceDefinitionNames(){
            return and();
    }

}
    public class CustomResourceDefinitionSpecNestedImpl<N> extends CustomResourceDefinitionSpecFluentImpl<KubeSchemaFluent.CustomResourceDefinitionSpecNested<N>> implements KubeSchemaFluent.CustomResourceDefinitionSpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionSpecBuilder builder;
    
            CustomResourceDefinitionSpecNestedImpl(CustomResourceDefinitionSpec item){
                    this.builder = new CustomResourceDefinitionSpecBuilder(this, item);
            }
            CustomResourceDefinitionSpecNestedImpl(){
                    this.builder = new CustomResourceDefinitionSpecBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCustomResourceDefinitionSpec(builder.build());
    }
    public N endCustomResourceDefinitionSpec(){
            return and();
    }

}
    public class CustomResourceDefinitionStatusNestedImpl<N> extends CustomResourceDefinitionStatusFluentImpl<KubeSchemaFluent.CustomResourceDefinitionStatusNested<N>> implements KubeSchemaFluent.CustomResourceDefinitionStatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionStatusBuilder builder;
    
            CustomResourceDefinitionStatusNestedImpl(CustomResourceDefinitionStatus item){
                    this.builder = new CustomResourceDefinitionStatusBuilder(this, item);
            }
            CustomResourceDefinitionStatusNestedImpl(){
                    this.builder = new CustomResourceDefinitionStatusBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withCustomResourceDefinitionStatus(builder.build());
    }
    public N endCustomResourceDefinitionStatus(){
            return and();
    }

}
    public class DaemonSetNestedImpl<N> extends DaemonSetFluentImpl<KubeSchemaFluent.DaemonSetNested<N>> implements KubeSchemaFluent.DaemonSetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDaemonSet(builder.build());
    }
    public N endDaemonSet(){
            return and();
    }

}
    public class DaemonSetListNestedImpl<N> extends DaemonSetListFluentImpl<KubeSchemaFluent.DaemonSetListNested<N>> implements KubeSchemaFluent.DaemonSetListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetListBuilder builder;
    
            DaemonSetListNestedImpl(DaemonSetList item){
                    this.builder = new DaemonSetListBuilder(this, item);
            }
            DaemonSetListNestedImpl(){
                    this.builder = new DaemonSetListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDaemonSetList(builder.build());
    }
    public N endDaemonSetList(){
            return and();
    }

}
    public class DeleteOptionsNestedImpl<N> extends DeleteOptionsFluentImpl<KubeSchemaFluent.DeleteOptionsNested<N>> implements KubeSchemaFluent.DeleteOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeleteOptionsBuilder builder;
    
            DeleteOptionsNestedImpl(DeleteOptions item){
                    this.builder = new DeleteOptionsBuilder(this, item);
            }
            DeleteOptionsNestedImpl(){
                    this.builder = new DeleteOptionsBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDeleteOptions(builder.build());
    }
    public N endDeleteOptions(){
            return and();
    }

}
    public class DeploymentNestedImpl<N> extends DeploymentFluentImpl<KubeSchemaFluent.DeploymentNested<N>> implements KubeSchemaFluent.DeploymentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDeployment(builder.build());
    }
    public N endDeployment(){
            return and();
    }

}
    public class DeploymentConfigNestedImpl<N> extends DeploymentConfigFluentImpl<KubeSchemaFluent.DeploymentConfigNested<N>> implements KubeSchemaFluent.DeploymentConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDeploymentConfig(builder.build());
    }
    public N endDeploymentConfig(){
            return and();
    }

}
    public class DeploymentConfigListNestedImpl<N> extends DeploymentConfigListFluentImpl<KubeSchemaFluent.DeploymentConfigListNested<N>> implements KubeSchemaFluent.DeploymentConfigListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigListBuilder builder;
    
            DeploymentConfigListNestedImpl(DeploymentConfigList item){
                    this.builder = new DeploymentConfigListBuilder(this, item);
            }
            DeploymentConfigListNestedImpl(){
                    this.builder = new DeploymentConfigListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDeploymentConfigList(builder.build());
    }
    public N endDeploymentConfigList(){
            return and();
    }

}
    public class DeploymentListNestedImpl<N> extends DeploymentListFluentImpl<KubeSchemaFluent.DeploymentListNested<N>> implements KubeSchemaFluent.DeploymentListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentListBuilder builder;
    
            DeploymentListNestedImpl(DeploymentList item){
                    this.builder = new DeploymentListBuilder(this, item);
            }
            DeploymentListNestedImpl(){
                    this.builder = new DeploymentListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDeploymentList(builder.build());
    }
    public N endDeploymentList(){
            return and();
    }

}
    public class DeploymentRollbackNestedImpl<N> extends DeploymentRollbackFluentImpl<KubeSchemaFluent.DeploymentRollbackNested<N>> implements KubeSchemaFluent.DeploymentRollbackNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentRollbackBuilder builder;
    
            DeploymentRollbackNestedImpl(DeploymentRollback item){
                    this.builder = new DeploymentRollbackBuilder(this, item);
            }
            DeploymentRollbackNestedImpl(){
                    this.builder = new DeploymentRollbackBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withDeploymentRollback(builder.build());
    }
    public N endDeploymentRollback(){
            return and();
    }

}
    public class EndpointsNestedImpl<N> extends EndpointsFluentImpl<KubeSchemaFluent.EndpointsNested<N>> implements KubeSchemaFluent.EndpointsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withEndpoints(builder.build());
    }
    public N endEndpoints(){
            return and();
    }

}
    public class EndpointsListNestedImpl<N> extends EndpointsListFluentImpl<KubeSchemaFluent.EndpointsListNested<N>> implements KubeSchemaFluent.EndpointsListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsListBuilder builder;
    
            EndpointsListNestedImpl(EndpointsList item){
                    this.builder = new EndpointsListBuilder(this, item);
            }
            EndpointsListNestedImpl(){
                    this.builder = new EndpointsListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withEndpointsList(builder.build());
    }
    public N endEndpointsList(){
            return and();
    }

}
    public class EnvVarNestedImpl<N> extends EnvVarFluentImpl<KubeSchemaFluent.EnvVarNested<N>> implements KubeSchemaFluent.EnvVarNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
    
            EnvVarNestedImpl(EnvVar item){
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvVarNestedImpl(){
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withEnvVar(builder.build());
    }
    public N endEnvVar(){
            return and();
    }

}
    public class EventsEventNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<KubeSchemaFluent.EventsEventNested<N>> implements KubeSchemaFluent.EventsEventNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withEvent(builder.build());
    }
    public N endEventsEvent(){
            return and();
    }

}
    public class EventListNestedImpl<N> extends EventListFluentImpl<KubeSchemaFluent.EventListNested<N>> implements KubeSchemaFluent.EventListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventListBuilder builder;
    
            EventListNestedImpl(EventList item){
                    this.builder = new EventListBuilder(this, item);
            }
            EventListNestedImpl(){
                    this.builder = new EventListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withEventList(builder.build());
    }
    public N endEventList(){
            return and();
    }

}
    public class EventsEventSeriesNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventSeriesFluentImpl<KubeSchemaFluent.EventsEventSeriesNested<N>> implements KubeSchemaFluent.EventsEventSeriesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventSeriesBuilder builder;
    
            EventsEventSeriesNestedImpl(io.fabric8.kubernetes.api.model.events.EventSeries item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(this, item);
            }
            EventsEventSeriesNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withEventSeries(builder.build());
    }
    public N endEventsEventSeries(){
            return and();
    }

}
    public class GroupNestedImpl<N> extends GroupFluentImpl<KubeSchemaFluent.GroupNested<N>> implements KubeSchemaFluent.GroupNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withGroup(builder.build());
    }
    public N endGroup(){
            return and();
    }

}
    public class GroupListNestedImpl<N> extends GroupListFluentImpl<KubeSchemaFluent.GroupListNested<N>> implements KubeSchemaFluent.GroupListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupListBuilder builder;
    
            GroupListNestedImpl(GroupList item){
                    this.builder = new GroupListBuilder(this, item);
            }
            GroupListNestedImpl(){
                    this.builder = new GroupListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withGroupList(builder.build());
    }
    public N endGroupList(){
            return and();
    }

}
    public class HorizontalPodAutoscalerNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<KubeSchemaFluent.HorizontalPodAutoscalerNested<N>> implements KubeSchemaFluent.HorizontalPodAutoscalerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withHorizontalPodAutoscaler(builder.build());
    }
    public N endHorizontalPodAutoscaler(){
            return and();
    }

}
    public class HorizontalPodAutoscalerListNestedImpl<N> extends HorizontalPodAutoscalerListFluentImpl<KubeSchemaFluent.HorizontalPodAutoscalerListNested<N>> implements KubeSchemaFluent.HorizontalPodAutoscalerListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerListBuilder builder;
    
            HorizontalPodAutoscalerListNestedImpl(HorizontalPodAutoscalerList item){
                    this.builder = new HorizontalPodAutoscalerListBuilder(this, item);
            }
            HorizontalPodAutoscalerListNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withHorizontalPodAutoscalerList(builder.build());
    }
    public N endHorizontalPodAutoscalerList(){
            return and();
    }

}
    public class IdentityNestedImpl<N> extends IdentityFluentImpl<KubeSchemaFluent.IdentityNested<N>> implements KubeSchemaFluent.IdentityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withIdentity(builder.build());
    }
    public N endIdentity(){
            return and();
    }

}
    public class IdentityListNestedImpl<N> extends IdentityListFluentImpl<KubeSchemaFluent.IdentityListNested<N>> implements KubeSchemaFluent.IdentityListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityListBuilder builder;
    
            IdentityListNestedImpl(IdentityList item){
                    this.builder = new IdentityListBuilder(this, item);
            }
            IdentityListNestedImpl(){
                    this.builder = new IdentityListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withIdentityList(builder.build());
    }
    public N endIdentityList(){
            return and();
    }

}
    public class ImageListNestedImpl<N> extends ImageListFluentImpl<KubeSchemaFluent.ImageListNested<N>> implements KubeSchemaFluent.ImageListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageListBuilder builder;
    
            ImageListNestedImpl(ImageList item){
                    this.builder = new ImageListBuilder(this, item);
            }
            ImageListNestedImpl(){
                    this.builder = new ImageListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withImageList(builder.build());
    }
    public N endImageList(){
            return and();
    }

}
    public class ImageStreamImportNestedImpl<N> extends ImageStreamImportFluentImpl<KubeSchemaFluent.ImageStreamImportNested<N>> implements KubeSchemaFluent.ImageStreamImportNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withImageStreamImport(builder.build());
    }
    public N endImageStreamImport(){
            return and();
    }

}
    public class ImageStreamListNestedImpl<N> extends ImageStreamListFluentImpl<KubeSchemaFluent.ImageStreamListNested<N>> implements KubeSchemaFluent.ImageStreamListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamListBuilder builder;
    
            ImageStreamListNestedImpl(ImageStreamList item){
                    this.builder = new ImageStreamListBuilder(this, item);
            }
            ImageStreamListNestedImpl(){
                    this.builder = new ImageStreamListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withImageStreamList(builder.build());
    }
    public N endImageStreamList(){
            return and();
    }

}
    public class ImageStreamTagListNestedImpl<N> extends ImageStreamTagListFluentImpl<KubeSchemaFluent.ImageStreamTagListNested<N>> implements KubeSchemaFluent.ImageStreamTagListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagListBuilder builder;
    
            ImageStreamTagListNestedImpl(ImageStreamTagList item){
                    this.builder = new ImageStreamTagListBuilder(this, item);
            }
            ImageStreamTagListNestedImpl(){
                    this.builder = new ImageStreamTagListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withImageStreamTagList(builder.build());
    }
    public N endImageStreamTagList(){
            return and();
    }

}
    public class InfoNestedImpl<N> extends InfoFluentImpl<KubeSchemaFluent.InfoNested<N>> implements KubeSchemaFluent.InfoNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InfoBuilder builder;
    
            InfoNestedImpl(Info item){
                    this.builder = new InfoBuilder(this, item);
            }
            InfoNestedImpl(){
                    this.builder = new InfoBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withInfo(builder.build());
    }
    public N endInfo(){
            return and();
    }

}
    public class IngressNestedImpl<N> extends IngressFluentImpl<KubeSchemaFluent.IngressNested<N>> implements KubeSchemaFluent.IngressNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withIngress(builder.build());
    }
    public N endIngress(){
            return and();
    }

}
    public class IngressListNestedImpl<N> extends IngressListFluentImpl<KubeSchemaFluent.IngressListNested<N>> implements KubeSchemaFluent.IngressListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressListBuilder builder;
    
            IngressListNestedImpl(IngressList item){
                    this.builder = new IngressListBuilder(this, item);
            }
            IngressListNestedImpl(){
                    this.builder = new IngressListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withIngressList(builder.build());
    }
    public N endIngressList(){
            return and();
    }

}
    public class InitializerNestedImpl<N> extends InitializerFluentImpl<KubeSchemaFluent.InitializerNested<N>> implements KubeSchemaFluent.InitializerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InitializerBuilder builder;
    
            InitializerNestedImpl(Initializer item){
                    this.builder = new InitializerBuilder(this, item);
            }
            InitializerNestedImpl(){
                    this.builder = new InitializerBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withInitializer(builder.build());
    }
    public N endInitializer(){
            return and();
    }

}
    public class InitializersNestedImpl<N> extends InitializersFluentImpl<KubeSchemaFluent.InitializersNested<N>> implements KubeSchemaFluent.InitializersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InitializersBuilder builder;
    
            InitializersNestedImpl(Initializers item){
                    this.builder = new InitializersBuilder(this, item);
            }
            InitializersNestedImpl(){
                    this.builder = new InitializersBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withInitializers(builder.build());
    }
    public N endInitializers(){
            return and();
    }

}
    public class JSONSchemaPropsorStringArrayNestedImpl<N> extends JSONSchemaPropsOrStringArrayFluentImpl<KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<N>> implements KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrStringArrayBuilder builder;
    
            JSONSchemaPropsorStringArrayNestedImpl(JSONSchemaPropsOrStringArray item){
                    this.builder = new JSONSchemaPropsOrStringArrayBuilder(this, item);
            }
            JSONSchemaPropsorStringArrayNestedImpl(){
                    this.builder = new JSONSchemaPropsOrStringArrayBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withJSONSchemaPropsorStringArray(builder.build());
    }
    public N endJSONSchemaPropsorStringArray(){
            return and();
    }

}
    public class JobNestedImpl<N> extends JobFluentImpl<KubeSchemaFluent.JobNested<N>> implements KubeSchemaFluent.JobNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withJob(builder.build());
    }
    public N endJob(){
            return and();
    }

}
    public class JobListNestedImpl<N> extends JobListFluentImpl<KubeSchemaFluent.JobListNested<N>> implements KubeSchemaFluent.JobListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobListBuilder builder;
    
            JobListNestedImpl(JobList item){
                    this.builder = new JobListBuilder(this, item);
            }
            JobListNestedImpl(){
                    this.builder = new JobListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withJobList(builder.build());
    }
    public N endJobList(){
            return and();
    }

}
    public class K8sLocalSubjectAccessReviewNestedImpl<N> extends LocalSubjectAccessReviewFluentImpl<KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<N>> implements KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalSubjectAccessReviewBuilder builder;
    
            K8sLocalSubjectAccessReviewNestedImpl(LocalSubjectAccessReview item){
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            K8sLocalSubjectAccessReviewNestedImpl(){
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withK8sLocalSubjectAccessReview(builder.build());
    }
    public N endK8sLocalSubjectAccessReview(){
            return and();
    }

}
    public class K8sSubjectAccessReviewNestedImpl<N> extends SubjectAccessReviewFluentImpl<KubeSchemaFluent.K8sSubjectAccessReviewNested<N>> implements KubeSchemaFluent.K8sSubjectAccessReviewNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewBuilder builder;
    
            K8sSubjectAccessReviewNestedImpl(SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            K8sSubjectAccessReviewNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withK8sSubjectAccessReview(builder.build());
    }
    public N endK8sSubjectAccessReview(){
            return and();
    }

}
    public class LimitRangeListNestedImpl<N> extends LimitRangeListFluentImpl<KubeSchemaFluent.LimitRangeListNested<N>> implements KubeSchemaFluent.LimitRangeListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeListBuilder builder;
    
            LimitRangeListNestedImpl(LimitRangeList item){
                    this.builder = new LimitRangeListBuilder(this, item);
            }
            LimitRangeListNestedImpl(){
                    this.builder = new LimitRangeListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withLimitRangeList(builder.build());
    }
    public N endLimitRangeList(){
            return and();
    }

}
    public class ModelLocalSubjectAccessReviewNestedImpl<N> extends io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluentImpl<KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<N>> implements KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder builder;
    
            ModelLocalSubjectAccessReviewNestedImpl(io.fabric8.openshift.api.model.LocalSubjectAccessReview item){
                    this.builder = new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder(this, item);
            }
            ModelLocalSubjectAccessReviewNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withLocalSubjectAccessReview(builder.build());
    }
    public N endModelLocalSubjectAccessReview(){
            return and();
    }

}
    public class MutatingWebhookConfigurationNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<KubeSchemaFluent.MutatingWebhookConfigurationNested<N>> implements KubeSchemaFluent.MutatingWebhookConfigurationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withMutatingWebhookConfiguration(builder.build());
    }
    public N endMutatingWebhookConfiguration(){
            return and();
    }

}
    public class MutatingWebhookConfigurationListNestedImpl<N> extends MutatingWebhookConfigurationListFluentImpl<KubeSchemaFluent.MutatingWebhookConfigurationListNested<N>> implements KubeSchemaFluent.MutatingWebhookConfigurationListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationListBuilder builder;
    
            MutatingWebhookConfigurationListNestedImpl(MutatingWebhookConfigurationList item){
                    this.builder = new MutatingWebhookConfigurationListBuilder(this, item);
            }
            MutatingWebhookConfigurationListNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withMutatingWebhookConfigurationList(builder.build());
    }
    public N endMutatingWebhookConfigurationList(){
            return and();
    }

}
    public class NamespaceNestedImpl<N> extends NamespaceFluentImpl<KubeSchemaFluent.NamespaceNested<N>> implements KubeSchemaFluent.NamespaceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNamespace(builder.build());
    }
    public N endNamespace(){
            return and();
    }

}
    public class NamespaceListNestedImpl<N> extends NamespaceListFluentImpl<KubeSchemaFluent.NamespaceListNested<N>> implements KubeSchemaFluent.NamespaceListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceListBuilder builder;
    
            NamespaceListNestedImpl(NamespaceList item){
                    this.builder = new NamespaceListBuilder(this, item);
            }
            NamespaceListNestedImpl(){
                    this.builder = new NamespaceListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNamespaceList(builder.build());
    }
    public N endNamespaceList(){
            return and();
    }

}
    public class NetNameSpaceNestedImpl<N> extends NetNamespaceFluentImpl<KubeSchemaFluent.NetNameSpaceNested<N>> implements KubeSchemaFluent.NetNameSpaceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNameSpaceNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNameSpaceNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNetNameSpace(builder.build());
    }
    public N endNetNameSpace(){
            return and();
    }

}
    public class NetNameSpaceListNestedImpl<N> extends NetNamespaceListFluentImpl<KubeSchemaFluent.NetNameSpaceListNested<N>> implements KubeSchemaFluent.NetNameSpaceListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceListBuilder builder;
    
            NetNameSpaceListNestedImpl(NetNamespaceList item){
                    this.builder = new NetNamespaceListBuilder(this, item);
            }
            NetNameSpaceListNestedImpl(){
                    this.builder = new NetNamespaceListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNetNameSpaceList(builder.build());
    }
    public N endNetNameSpaceList(){
            return and();
    }

}
    public class NetworkPolicyNestedImpl<N> extends NetworkPolicyFluentImpl<KubeSchemaFluent.NetworkPolicyNested<N>> implements KubeSchemaFluent.NetworkPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNetworkPolicy(builder.build());
    }
    public N endNetworkPolicy(){
            return and();
    }

}
    public class NetworkPolicyListNestedImpl<N> extends NetworkPolicyListFluentImpl<KubeSchemaFluent.NetworkPolicyListNested<N>> implements KubeSchemaFluent.NetworkPolicyListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyListBuilder builder;
    
            NetworkPolicyListNestedImpl(NetworkPolicyList item){
                    this.builder = new NetworkPolicyListBuilder(this, item);
            }
            NetworkPolicyListNestedImpl(){
                    this.builder = new NetworkPolicyListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNetworkPolicyList(builder.build());
    }
    public N endNetworkPolicyList(){
            return and();
    }

}
    public class NodeNestedImpl<N> extends NodeFluentImpl<KubeSchemaFluent.NodeNested<N>> implements KubeSchemaFluent.NodeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNode(builder.build());
    }
    public N endNode(){
            return and();
    }

}
    public class NodeListNestedImpl<N> extends NodeListFluentImpl<KubeSchemaFluent.NodeListNested<N>> implements KubeSchemaFluent.NodeListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeListBuilder builder;
    
            NodeListNestedImpl(NodeList item){
                    this.builder = new NodeListBuilder(this, item);
            }
            NodeListNestedImpl(){
                    this.builder = new NodeListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withNodeList(builder.build());
    }
    public N endNodeList(){
            return and();
    }

}
    public class OAuthAccessTokenNestedImpl<N> extends OAuthAccessTokenFluentImpl<KubeSchemaFluent.OAuthAccessTokenNested<N>> implements KubeSchemaFluent.OAuthAccessTokenNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthAccessToken(builder.build());
    }
    public N endOAuthAccessToken(){
            return and();
    }

}
    public class OAuthAccessTokenListNestedImpl<N> extends OAuthAccessTokenListFluentImpl<KubeSchemaFluent.OAuthAccessTokenListNested<N>> implements KubeSchemaFluent.OAuthAccessTokenListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenListBuilder builder;
    
            OAuthAccessTokenListNestedImpl(OAuthAccessTokenList item){
                    this.builder = new OAuthAccessTokenListBuilder(this, item);
            }
            OAuthAccessTokenListNestedImpl(){
                    this.builder = new OAuthAccessTokenListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthAccessTokenList(builder.build());
    }
    public N endOAuthAccessTokenList(){
            return and();
    }

}
    public class OAuthAuthorizeTokenNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<KubeSchemaFluent.OAuthAuthorizeTokenNested<N>> implements KubeSchemaFluent.OAuthAuthorizeTokenNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthAuthorizeToken(builder.build());
    }
    public N endOAuthAuthorizeToken(){
            return and();
    }

}
    public class OAuthAuthorizeTokenListNestedImpl<N> extends OAuthAuthorizeTokenListFluentImpl<KubeSchemaFluent.OAuthAuthorizeTokenListNested<N>> implements KubeSchemaFluent.OAuthAuthorizeTokenListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenListBuilder builder;
    
            OAuthAuthorizeTokenListNestedImpl(OAuthAuthorizeTokenList item){
                    this.builder = new OAuthAuthorizeTokenListBuilder(this, item);
            }
            OAuthAuthorizeTokenListNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthAuthorizeTokenList(builder.build());
    }
    public N endOAuthAuthorizeTokenList(){
            return and();
    }

}
    public class OAuthClientNestedImpl<N> extends OAuthClientFluentImpl<KubeSchemaFluent.OAuthClientNested<N>> implements KubeSchemaFluent.OAuthClientNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthClient(builder.build());
    }
    public N endOAuthClient(){
            return and();
    }

}
    public class OAuthClientAuthorizationNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<KubeSchemaFluent.OAuthClientAuthorizationNested<N>> implements KubeSchemaFluent.OAuthClientAuthorizationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthClientAuthorization(builder.build());
    }
    public N endOAuthClientAuthorization(){
            return and();
    }

}
    public class OAuthClientAuthorizationListNestedImpl<N> extends OAuthClientAuthorizationListFluentImpl<KubeSchemaFluent.OAuthClientAuthorizationListNested<N>> implements KubeSchemaFluent.OAuthClientAuthorizationListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationListBuilder builder;
    
            OAuthClientAuthorizationListNestedImpl(OAuthClientAuthorizationList item){
                    this.builder = new OAuthClientAuthorizationListBuilder(this, item);
            }
            OAuthClientAuthorizationListNestedImpl(){
                    this.builder = new OAuthClientAuthorizationListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthClientAuthorizationList(builder.build());
    }
    public N endOAuthClientAuthorizationList(){
            return and();
    }

}
    public class OAuthClientListNestedImpl<N> extends OAuthClientListFluentImpl<KubeSchemaFluent.OAuthClientListNested<N>> implements KubeSchemaFluent.OAuthClientListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientListBuilder builder;
    
            OAuthClientListNestedImpl(OAuthClientList item){
                    this.builder = new OAuthClientListBuilder(this, item);
            }
            OAuthClientListNestedImpl(){
                    this.builder = new OAuthClientListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOAuthClientList(builder.build());
    }
    public N endOAuthClientList(){
            return and();
    }

}
    public class ObjectMetaNestedImpl<N> extends ObjectMetaFluentImpl<KubeSchemaFluent.ObjectMetaNested<N>> implements KubeSchemaFluent.ObjectMetaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            ObjectMetaNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            ObjectMetaNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withObjectMeta(builder.build());
    }
    public N endObjectMeta(){
            return and();
    }

}
    public class OpenshiftClusterRoleNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<KubeSchemaFluent.OpenshiftClusterRoleNested<N>> implements KubeSchemaFluent.OpenshiftClusterRoleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftClusterRole(builder.build());
    }
    public N endOpenshiftClusterRole(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<KubeSchemaFluent.OpenshiftClusterRoleBindingNested<N>> implements KubeSchemaFluent.OpenshiftClusterRoleBindingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftClusterRoleBinding(builder.build());
    }
    public N endOpenshiftClusterRoleBinding(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingListNestedImpl<N> extends OpenshiftClusterRoleBindingListFluentImpl<KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<N>> implements KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingListBuilder builder;
    
            OpenshiftClusterRoleBindingListNestedImpl(OpenshiftClusterRoleBindingList item){
                    this.builder = new OpenshiftClusterRoleBindingListBuilder(this, item);
            }
            OpenshiftClusterRoleBindingListNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftClusterRoleBindingList(builder.build());
    }
    public N endOpenshiftClusterRoleBindingList(){
            return and();
    }

}
    public class OpenshiftRoleNestedImpl<N> extends OpenshiftRoleFluentImpl<KubeSchemaFluent.OpenshiftRoleNested<N>> implements KubeSchemaFluent.OpenshiftRoleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftRole(builder.build());
    }
    public N endOpenshiftRole(){
            return and();
    }

}
    public class OpenshiftRoleBindingNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<KubeSchemaFluent.OpenshiftRoleBindingNested<N>> implements KubeSchemaFluent.OpenshiftRoleBindingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftRoleBinding(builder.build());
    }
    public N endOpenshiftRoleBinding(){
            return and();
    }

}
    public class OpenshiftRoleBindingListNestedImpl<N> extends OpenshiftRoleBindingListFluentImpl<KubeSchemaFluent.OpenshiftRoleBindingListNested<N>> implements KubeSchemaFluent.OpenshiftRoleBindingListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingListBuilder builder;
    
            OpenshiftRoleBindingListNestedImpl(OpenshiftRoleBindingList item){
                    this.builder = new OpenshiftRoleBindingListBuilder(this, item);
            }
            OpenshiftRoleBindingListNestedImpl(){
                    this.builder = new OpenshiftRoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftRoleBindingList(builder.build());
    }
    public N endOpenshiftRoleBindingList(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<N>> implements KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftRoleBindingRestriction(builder.build());
    }
    public N endOpenshiftRoleBindingRestriction(){
            return and();
    }

}
    public class OpenshiftRoleListNestedImpl<N> extends OpenshiftRoleListFluentImpl<KubeSchemaFluent.OpenshiftRoleListNested<N>> implements KubeSchemaFluent.OpenshiftRoleListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleListBuilder builder;
    
            OpenshiftRoleListNestedImpl(OpenshiftRoleList item){
                    this.builder = new OpenshiftRoleListBuilder(this, item);
            }
            OpenshiftRoleListNestedImpl(){
                    this.builder = new OpenshiftRoleListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withOpenshiftRoleList(builder.build());
    }
    public N endOpenshiftRoleList(){
            return and();
    }

}
    public class PatchNestedImpl<N> extends PatchFluentImpl<KubeSchemaFluent.PatchNested<N>> implements KubeSchemaFluent.PatchNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PatchBuilder builder;
    
            PatchNestedImpl(Patch item){
                    this.builder = new PatchBuilder(this, item);
            }
            PatchNestedImpl(){
                    this.builder = new PatchBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPatch(builder.build());
    }
    public N endPatch(){
            return and();
    }

}
    public class PersistentVolumeNestedImpl<N> extends PersistentVolumeFluentImpl<KubeSchemaFluent.PersistentVolumeNested<N>> implements KubeSchemaFluent.PersistentVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPersistentVolume(builder.build());
    }
    public N endPersistentVolume(){
            return and();
    }

}
    public class PersistentVolumeClaimNestedImpl<N> extends PersistentVolumeClaimFluentImpl<KubeSchemaFluent.PersistentVolumeClaimNested<N>> implements KubeSchemaFluent.PersistentVolumeClaimNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPersistentVolumeClaim(builder.build());
    }
    public N endPersistentVolumeClaim(){
            return and();
    }

}
    public class PersistentVolumeClaimListNestedImpl<N> extends PersistentVolumeClaimListFluentImpl<KubeSchemaFluent.PersistentVolumeClaimListNested<N>> implements KubeSchemaFluent.PersistentVolumeClaimListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimListBuilder builder;
    
            PersistentVolumeClaimListNestedImpl(PersistentVolumeClaimList item){
                    this.builder = new PersistentVolumeClaimListBuilder(this, item);
            }
            PersistentVolumeClaimListNestedImpl(){
                    this.builder = new PersistentVolumeClaimListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPersistentVolumeClaimList(builder.build());
    }
    public N endPersistentVolumeClaimList(){
            return and();
    }

}
    public class PersistentVolumeListNestedImpl<N> extends PersistentVolumeListFluentImpl<KubeSchemaFluent.PersistentVolumeListNested<N>> implements KubeSchemaFluent.PersistentVolumeListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeListBuilder builder;
    
            PersistentVolumeListNestedImpl(PersistentVolumeList item){
                    this.builder = new PersistentVolumeListBuilder(this, item);
            }
            PersistentVolumeListNestedImpl(){
                    this.builder = new PersistentVolumeListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPersistentVolumeList(builder.build());
    }
    public N endPersistentVolumeList(){
            return and();
    }

}
    public class PodDisruptionBudgetNestedImpl<N> extends PodDisruptionBudgetFluentImpl<KubeSchemaFluent.PodDisruptionBudgetNested<N>> implements KubeSchemaFluent.PodDisruptionBudgetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodDisruptionBudget(builder.build());
    }
    public N endPodDisruptionBudget(){
            return and();
    }

}
    public class PodDisruptionBudgetListNestedImpl<N> extends PodDisruptionBudgetListFluentImpl<KubeSchemaFluent.PodDisruptionBudgetListNested<N>> implements KubeSchemaFluent.PodDisruptionBudgetListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetListBuilder builder;
    
            PodDisruptionBudgetListNestedImpl(PodDisruptionBudgetList item){
                    this.builder = new PodDisruptionBudgetListBuilder(this, item);
            }
            PodDisruptionBudgetListNestedImpl(){
                    this.builder = new PodDisruptionBudgetListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodDisruptionBudgetList(builder.build());
    }
    public N endPodDisruptionBudgetList(){
            return and();
    }

}
    public class PodListNestedImpl<N> extends PodListFluentImpl<KubeSchemaFluent.PodListNested<N>> implements KubeSchemaFluent.PodListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodListBuilder builder;
    
            PodListNestedImpl(PodList item){
                    this.builder = new PodListBuilder(this, item);
            }
            PodListNestedImpl(){
                    this.builder = new PodListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodList(builder.build());
    }
    public N endPodList(){
            return and();
    }

}
    public class PodPresetNestedImpl<N> extends PodPresetFluentImpl<KubeSchemaFluent.PodPresetNested<N>> implements KubeSchemaFluent.PodPresetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodPreset(builder.build());
    }
    public N endPodPreset(){
            return and();
    }

}
    public class PodPresetListNestedImpl<N> extends PodPresetListFluentImpl<KubeSchemaFluent.PodPresetListNested<N>> implements KubeSchemaFluent.PodPresetListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetListBuilder builder;
    
            PodPresetListNestedImpl(PodPresetList item){
                    this.builder = new PodPresetListBuilder(this, item);
            }
            PodPresetListNestedImpl(){
                    this.builder = new PodPresetListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodPresetList(builder.build());
    }
    public N endPodPresetList(){
            return and();
    }

}
    public class PodPresetSpecNestedImpl<N> extends PodPresetSpecFluentImpl<KubeSchemaFluent.PodPresetSpecNested<N>> implements KubeSchemaFluent.PodPresetSpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetSpecBuilder builder;
    
            PodPresetSpecNestedImpl(PodPresetSpec item){
                    this.builder = new PodPresetSpecBuilder(this, item);
            }
            PodPresetSpecNestedImpl(){
                    this.builder = new PodPresetSpecBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodPresetSpec(builder.build());
    }
    public N endPodPresetSpec(){
            return and();
    }

}
    public class PodSecurityPolicyNestedImpl<N> extends PodSecurityPolicyFluentImpl<KubeSchemaFluent.PodSecurityPolicyNested<N>> implements KubeSchemaFluent.PodSecurityPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodSecurityPolicy(builder.build());
    }
    public N endPodSecurityPolicy(){
            return and();
    }

}
    public class PodSecurityPolicyListNestedImpl<N> extends PodSecurityPolicyListFluentImpl<KubeSchemaFluent.PodSecurityPolicyListNested<N>> implements KubeSchemaFluent.PodSecurityPolicyListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyListBuilder builder;
    
            PodSecurityPolicyListNestedImpl(PodSecurityPolicyList item){
                    this.builder = new PodSecurityPolicyListBuilder(this, item);
            }
            PodSecurityPolicyListNestedImpl(){
                    this.builder = new PodSecurityPolicyListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodSecurityPolicyList(builder.build());
    }
    public N endPodSecurityPolicyList(){
            return and();
    }

}
    public class PodTemplateListNestedImpl<N> extends PodTemplateListFluentImpl<KubeSchemaFluent.PodTemplateListNested<N>> implements KubeSchemaFluent.PodTemplateListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateListBuilder builder;
    
            PodTemplateListNestedImpl(PodTemplateList item){
                    this.builder = new PodTemplateListBuilder(this, item);
            }
            PodTemplateListNestedImpl(){
                    this.builder = new PodTemplateListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPodTemplateList(builder.build());
    }
    public N endPodTemplateList(){
            return and();
    }

}
    public class PriorityClassNestedImpl<N> extends PriorityClassFluentImpl<KubeSchemaFluent.PriorityClassNested<N>> implements KubeSchemaFluent.PriorityClassNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPriorityClass(builder.build());
    }
    public N endPriorityClass(){
            return and();
    }

}
    public class PriorityClassListNestedImpl<N> extends PriorityClassListFluentImpl<KubeSchemaFluent.PriorityClassListNested<N>> implements KubeSchemaFluent.PriorityClassListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassListBuilder builder;
    
            PriorityClassListNestedImpl(PriorityClassList item){
                    this.builder = new PriorityClassListBuilder(this, item);
            }
            PriorityClassListNestedImpl(){
                    this.builder = new PriorityClassListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withPriorityClassList(builder.build());
    }
    public N endPriorityClassList(){
            return and();
    }

}
    public class ProjectNestedImpl<N> extends ProjectFluentImpl<KubeSchemaFluent.ProjectNested<N>> implements KubeSchemaFluent.ProjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withProject(builder.build());
    }
    public N endProject(){
            return and();
    }

}
    public class ProjectListNestedImpl<N> extends ProjectListFluentImpl<KubeSchemaFluent.ProjectListNested<N>> implements KubeSchemaFluent.ProjectListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectListBuilder builder;
    
            ProjectListNestedImpl(ProjectList item){
                    this.builder = new ProjectListBuilder(this, item);
            }
            ProjectListNestedImpl(){
                    this.builder = new ProjectListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withProjectList(builder.build());
    }
    public N endProjectList(){
            return and();
    }

}
    public class ProjectRequestNestedImpl<N> extends ProjectRequestFluentImpl<KubeSchemaFluent.ProjectRequestNested<N>> implements KubeSchemaFluent.ProjectRequestNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withProjectRequest(builder.build());
    }
    public N endProjectRequest(){
            return and();
    }

}
    public class QuantityNestedImpl<N> extends QuantityFluentImpl<KubeSchemaFluent.QuantityNested<N>> implements KubeSchemaFluent.QuantityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            QuantityNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            QuantityNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withQuantity(builder.build());
    }
    public N endQuantity(){
            return and();
    }

}
    public class ReplicaSetNestedImpl<N> extends ReplicaSetFluentImpl<KubeSchemaFluent.ReplicaSetNested<N>> implements KubeSchemaFluent.ReplicaSetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withReplicaSet(builder.build());
    }
    public N endReplicaSet(){
            return and();
    }

}
    public class ReplicaSetListNestedImpl<N> extends ReplicaSetListFluentImpl<KubeSchemaFluent.ReplicaSetListNested<N>> implements KubeSchemaFluent.ReplicaSetListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetListBuilder builder;
    
            ReplicaSetListNestedImpl(ReplicaSetList item){
                    this.builder = new ReplicaSetListBuilder(this, item);
            }
            ReplicaSetListNestedImpl(){
                    this.builder = new ReplicaSetListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withReplicaSetList(builder.build());
    }
    public N endReplicaSetList(){
            return and();
    }

}
    public class ReplicationControllerListNestedImpl<N> extends ReplicationControllerListFluentImpl<KubeSchemaFluent.ReplicationControllerListNested<N>> implements KubeSchemaFluent.ReplicationControllerListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerListBuilder builder;
    
            ReplicationControllerListNestedImpl(ReplicationControllerList item){
                    this.builder = new ReplicationControllerListBuilder(this, item);
            }
            ReplicationControllerListNestedImpl(){
                    this.builder = new ReplicationControllerListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withReplicationControllerList(builder.build());
    }
    public N endReplicationControllerList(){
            return and();
    }

}
    public class ResourceQuotaNestedImpl<N> extends ResourceQuotaFluentImpl<KubeSchemaFluent.ResourceQuotaNested<N>> implements KubeSchemaFluent.ResourceQuotaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withResourceQuota(builder.build());
    }
    public N endResourceQuota(){
            return and();
    }

}
    public class ResourceQuotaListNestedImpl<N> extends ResourceQuotaListFluentImpl<KubeSchemaFluent.ResourceQuotaListNested<N>> implements KubeSchemaFluent.ResourceQuotaListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaListBuilder builder;
    
            ResourceQuotaListNestedImpl(ResourceQuotaList item){
                    this.builder = new ResourceQuotaListBuilder(this, item);
            }
            ResourceQuotaListNestedImpl(){
                    this.builder = new ResourceQuotaListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withResourceQuotaList(builder.build());
    }
    public N endResourceQuotaList(){
            return and();
    }

}
    public class RoleNestedImpl<N> extends RoleFluentImpl<KubeSchemaFluent.RoleNested<N>> implements KubeSchemaFluent.RoleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRole(builder.build());
    }
    public N endRole(){
            return and();
    }

}
    public class RoleBindingNestedImpl<N> extends RoleBindingFluentImpl<KubeSchemaFluent.RoleBindingNested<N>> implements KubeSchemaFluent.RoleBindingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRoleBinding(builder.build());
    }
    public N endRoleBinding(){
            return and();
    }

}
    public class RoleBindingListNestedImpl<N> extends RoleBindingListFluentImpl<KubeSchemaFluent.RoleBindingListNested<N>> implements KubeSchemaFluent.RoleBindingListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingListBuilder builder;
    
            RoleBindingListNestedImpl(RoleBindingList item){
                    this.builder = new RoleBindingListBuilder(this, item);
            }
            RoleBindingListNestedImpl(){
                    this.builder = new RoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRoleBindingList(builder.build());
    }
    public N endRoleBindingList(){
            return and();
    }

}
    public class RoleListNestedImpl<N> extends RoleListFluentImpl<KubeSchemaFluent.RoleListNested<N>> implements KubeSchemaFluent.RoleListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleListBuilder builder;
    
            RoleListNestedImpl(RoleList item){
                    this.builder = new RoleListBuilder(this, item);
            }
            RoleListNestedImpl(){
                    this.builder = new RoleListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRoleList(builder.build());
    }
    public N endRoleList(){
            return and();
    }

}
    public class RootPathsNestedImpl<N> extends RootPathsFluentImpl<KubeSchemaFluent.RootPathsNested<N>> implements KubeSchemaFluent.RootPathsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RootPathsBuilder builder;
    
            RootPathsNestedImpl(RootPaths item){
                    this.builder = new RootPathsBuilder(this, item);
            }
            RootPathsNestedImpl(){
                    this.builder = new RootPathsBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRootPaths(builder.build());
    }
    public N endRootPaths(){
            return and();
    }

}
    public class RouteNestedImpl<N> extends RouteFluentImpl<KubeSchemaFluent.RouteNested<N>> implements KubeSchemaFluent.RouteNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRoute(builder.build());
    }
    public N endRoute(){
            return and();
    }

}
    public class RouteListNestedImpl<N> extends RouteListFluentImpl<KubeSchemaFluent.RouteListNested<N>> implements KubeSchemaFluent.RouteListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteListBuilder builder;
    
            RouteListNestedImpl(RouteList item){
                    this.builder = new RouteListBuilder(this, item);
            }
            RouteListNestedImpl(){
                    this.builder = new RouteListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRouteList(builder.build());
    }
    public N endRouteList(){
            return and();
    }

}
    public class RuleNestedImpl<N> extends RuleFluentImpl<KubeSchemaFluent.RuleNested<N>> implements KubeSchemaFluent.RuleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RuleBuilder builder;
    
            RuleNestedImpl(Rule item){
                    this.builder = new RuleBuilder(this, item);
            }
            RuleNestedImpl(){
                    this.builder = new RuleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRule(builder.build());
    }
    public N endRule(){
            return and();
    }

}
    public class RuleWithOperationsNestedImpl<N> extends RuleWithOperationsFluentImpl<KubeSchemaFluent.RuleWithOperationsNested<N>> implements KubeSchemaFluent.RuleWithOperationsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RuleWithOperationsBuilder builder;
    
            RuleWithOperationsNestedImpl(RuleWithOperations item){
                    this.builder = new RuleWithOperationsBuilder(this, item);
            }
            RuleWithOperationsNestedImpl(){
                    this.builder = new RuleWithOperationsBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withRuleWithOperations(builder.build());
    }
    public N endRuleWithOperations(){
            return and();
    }

}
    public class ScaleNestedImpl<N> extends ScaleFluentImpl<KubeSchemaFluent.ScaleNested<N>> implements KubeSchemaFluent.ScaleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withScale(builder.build());
    }
    public N endScale(){
            return and();
    }

}
    public class SecretNestedImpl<N> extends SecretFluentImpl<KubeSchemaFluent.SecretNested<N>> implements KubeSchemaFluent.SecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withSecret(builder.build());
    }
    public N endSecret(){
            return and();
    }

}
    public class SecretListNestedImpl<N> extends SecretListFluentImpl<KubeSchemaFluent.SecretListNested<N>> implements KubeSchemaFluent.SecretListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretListBuilder builder;
    
            SecretListNestedImpl(SecretList item){
                    this.builder = new SecretListBuilder(this, item);
            }
            SecretListNestedImpl(){
                    this.builder = new SecretListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withSecretList(builder.build());
    }
    public N endSecretList(){
            return and();
    }

}
    public class SecurityContextConstraintsNestedImpl<N> extends SecurityContextConstraintsFluentImpl<KubeSchemaFluent.SecurityContextConstraintsNested<N>> implements KubeSchemaFluent.SecurityContextConstraintsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withSecurityContextConstraints(builder.build());
    }
    public N endSecurityContextConstraints(){
            return and();
    }

}
    public class SecurityContextConstraintsListNestedImpl<N> extends SecurityContextConstraintsListFluentImpl<KubeSchemaFluent.SecurityContextConstraintsListNested<N>> implements KubeSchemaFluent.SecurityContextConstraintsListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsListBuilder builder;
    
            SecurityContextConstraintsListNestedImpl(SecurityContextConstraintsList item){
                    this.builder = new SecurityContextConstraintsListBuilder(this, item);
            }
            SecurityContextConstraintsListNestedImpl(){
                    this.builder = new SecurityContextConstraintsListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withSecurityContextConstraintsList(builder.build());
    }
    public N endSecurityContextConstraintsList(){
            return and();
    }

}
    public class ServiceAccountNestedImpl<N> extends ServiceAccountFluentImpl<KubeSchemaFluent.ServiceAccountNested<N>> implements KubeSchemaFluent.ServiceAccountNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withServiceAccount(builder.build());
    }
    public N endServiceAccount(){
            return and();
    }

}
    public class ServiceAccountListNestedImpl<N> extends ServiceAccountListFluentImpl<KubeSchemaFluent.ServiceAccountListNested<N>> implements KubeSchemaFluent.ServiceAccountListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountListBuilder builder;
    
            ServiceAccountListNestedImpl(ServiceAccountList item){
                    this.builder = new ServiceAccountListBuilder(this, item);
            }
            ServiceAccountListNestedImpl(){
                    this.builder = new ServiceAccountListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withServiceAccountList(builder.build());
    }
    public N endServiceAccountList(){
            return and();
    }

}
    public class ServiceListNestedImpl<N> extends ServiceListFluentImpl<KubeSchemaFluent.ServiceListNested<N>> implements KubeSchemaFluent.ServiceListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceListBuilder builder;
    
            ServiceListNestedImpl(ServiceList item){
                    this.builder = new ServiceListBuilder(this, item);
            }
            ServiceListNestedImpl(){
                    this.builder = new ServiceListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withServiceList(builder.build());
    }
    public N endServiceList(){
            return and();
    }

}
    public class StatefulSetNestedImpl<N> extends StatefulSetFluentImpl<KubeSchemaFluent.StatefulSetNested<N>> implements KubeSchemaFluent.StatefulSetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withStatefulSet(builder.build());
    }
    public N endStatefulSet(){
            return and();
    }

}
    public class StatefulSetListNestedImpl<N> extends StatefulSetListFluentImpl<KubeSchemaFluent.StatefulSetListNested<N>> implements KubeSchemaFluent.StatefulSetListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetListBuilder builder;
    
            StatefulSetListNestedImpl(StatefulSetList item){
                    this.builder = new StatefulSetListBuilder(this, item);
            }
            StatefulSetListNestedImpl(){
                    this.builder = new StatefulSetListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withStatefulSetList(builder.build());
    }
    public N endStatefulSetList(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends StatusFluentImpl<KubeSchemaFluent.StatusNested<N>> implements KubeSchemaFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusBuilder builder;
    
            StatusNestedImpl(Status item){
                    this.builder = new StatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new StatusBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}
    public class StorageClassNestedImpl<N> extends StorageClassFluentImpl<KubeSchemaFluent.StorageClassNested<N>> implements KubeSchemaFluent.StorageClassNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withStorageClass(builder.build());
    }
    public N endStorageClass(){
            return and();
    }

}
    public class StorageClassListNestedImpl<N> extends StorageClassListFluentImpl<KubeSchemaFluent.StorageClassListNested<N>> implements KubeSchemaFluent.StorageClassListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassListBuilder builder;
    
            StorageClassListNestedImpl(StorageClassList item){
                    this.builder = new StorageClassListBuilder(this, item);
            }
            StorageClassListNestedImpl(){
                    this.builder = new StorageClassListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withStorageClassList(builder.build());
    }
    public N endStorageClassList(){
            return and();
    }

}
    public class ModelSubjectAccessReviewNestedImpl<N> extends io.fabric8.openshift.api.model.SubjectAccessReviewFluentImpl<KubeSchemaFluent.ModelSubjectAccessReviewNested<N>> implements KubeSchemaFluent.ModelSubjectAccessReviewNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.SubjectAccessReviewBuilder builder;
    
            ModelSubjectAccessReviewNestedImpl(io.fabric8.openshift.api.model.SubjectAccessReview item){
                    this.builder = new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder(this, item);
            }
            ModelSubjectAccessReviewNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withSubjectAccessReview(builder.build());
    }
    public N endModelSubjectAccessReview(){
            return and();
    }

}
    public class SubjectAccessReviewResponseNestedImpl<N> extends SubjectAccessReviewResponseFluentImpl<KubeSchemaFluent.SubjectAccessReviewResponseNested<N>> implements KubeSchemaFluent.SubjectAccessReviewResponseNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewResponseBuilder builder;
    
            SubjectAccessReviewResponseNestedImpl(SubjectAccessReviewResponse item){
                    this.builder = new SubjectAccessReviewResponseBuilder(this, item);
            }
            SubjectAccessReviewResponseNestedImpl(){
                    this.builder = new SubjectAccessReviewResponseBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withSubjectAccessReviewResponse(builder.build());
    }
    public N endSubjectAccessReviewResponse(){
            return and();
    }

}
    public class TagEventNestedImpl<N> extends TagEventFluentImpl<KubeSchemaFluent.TagEventNested<N>> implements KubeSchemaFluent.TagEventNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagEventBuilder builder;
    
            TagEventNestedImpl(TagEvent item){
                    this.builder = new TagEventBuilder(this, item);
            }
            TagEventNestedImpl(){
                    this.builder = new TagEventBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withTagEvent(builder.build());
    }
    public N endTagEvent(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends TemplateFluentImpl<KubeSchemaFluent.TemplateNested<N>> implements KubeSchemaFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}
    public class TemplateListNestedImpl<N> extends TemplateListFluentImpl<KubeSchemaFluent.TemplateListNested<N>> implements KubeSchemaFluent.TemplateListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateListBuilder builder;
    
            TemplateListNestedImpl(TemplateList item){
                    this.builder = new TemplateListBuilder(this, item);
            }
            TemplateListNestedImpl(){
                    this.builder = new TemplateListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withTemplateList(builder.build());
    }
    public N endTemplateList(){
            return and();
    }

}
    public class TokenReviewNestedImpl<N> extends TokenReviewFluentImpl<KubeSchemaFluent.TokenReviewNested<N>> implements KubeSchemaFluent.TokenReviewNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withTokenReview(builder.build());
    }
    public N endTokenReview(){
            return and();
    }

}
    public class TolerationNestedImpl<N> extends TolerationFluentImpl<KubeSchemaFluent.TolerationNested<N>> implements KubeSchemaFluent.TolerationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TolerationBuilder builder;
    
            TolerationNestedImpl(Toleration item){
                    this.builder = new TolerationBuilder(this, item);
            }
            TolerationNestedImpl(){
                    this.builder = new TolerationBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withToleration(builder.build());
    }
    public N endToleration(){
            return and();
    }

}
    public class TypeMetaNestedImpl<N> extends TypeMetaFluentImpl<KubeSchemaFluent.TypeMetaNested<N>> implements KubeSchemaFluent.TypeMetaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TypeMetaBuilder builder;
    
            TypeMetaNestedImpl(TypeMeta item){
                    this.builder = new TypeMetaBuilder(this, item);
            }
            TypeMetaNestedImpl(){
                    this.builder = new TypeMetaBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withTypeMeta(builder.build());
    }
    public N endTypeMeta(){
            return and();
    }

}
    public class UserNestedImpl<N> extends UserFluentImpl<KubeSchemaFluent.UserNested<N>> implements KubeSchemaFluent.UserNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withUser(builder.build());
    }
    public N endUser(){
            return and();
    }

}
    public class UserListNestedImpl<N> extends UserListFluentImpl<KubeSchemaFluent.UserListNested<N>> implements KubeSchemaFluent.UserListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserListBuilder builder;
    
            UserListNestedImpl(UserList item){
                    this.builder = new UserListBuilder(this, item);
            }
            UserListNestedImpl(){
                    this.builder = new UserListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withUserList(builder.build());
    }
    public N endUserList(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<KubeSchemaFluent.ValidatingWebhookConfigurationNested<N>> implements KubeSchemaFluent.ValidatingWebhookConfigurationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withValidatingWebhookConfiguration(builder.build());
    }
    public N endValidatingWebhookConfiguration(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationListNestedImpl<N> extends ValidatingWebhookConfigurationListFluentImpl<KubeSchemaFluent.ValidatingWebhookConfigurationListNested<N>> implements KubeSchemaFluent.ValidatingWebhookConfigurationListNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationListBuilder builder;
    
            ValidatingWebhookConfigurationListNestedImpl(ValidatingWebhookConfigurationList item){
                    this.builder = new ValidatingWebhookConfigurationListBuilder(this, item);
            }
            ValidatingWebhookConfigurationListNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationListBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withValidatingWebhookConfigurationList(builder.build());
    }
    public N endValidatingWebhookConfigurationList(){
            return and();
    }

}
    public class WatchEventNestedImpl<N> extends WatchEventFluentImpl<KubeSchemaFluent.WatchEventNested<N>> implements KubeSchemaFluent.WatchEventNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WatchEventBuilder builder;
    
            WatchEventNestedImpl(WatchEvent item){
                    this.builder = new WatchEventBuilder(this, item);
            }
            WatchEventNestedImpl(){
                    this.builder = new WatchEventBuilder(this);
            }
    
    public N and(){
            return (N) KubeSchemaFluentImpl.this.withWatchEvent(builder.build());
    }
    public N endWatchEvent(){
            return and();
    }

}


}
