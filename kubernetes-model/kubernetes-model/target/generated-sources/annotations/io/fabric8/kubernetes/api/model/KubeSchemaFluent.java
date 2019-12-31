package io.fabric8.kubernetes.api.model;

import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import io.fabric8.openshift.api.model.IdentityList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseFluent;
import io.fabric8.openshift.api.model.IdentityFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListFluent;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenListFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.openshift.api.model.NetNamespaceList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList;
import io.fabric8.kubernetes.api.model.batch.JobFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.openshift.api.model.BuildConfigListBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluent;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecFluent;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListBuilder;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecFluent;
import io.fabric8.kubernetes.api.model.apps.DaemonSetList;
import io.fabric8.openshift.api.model.ImageStreamImportFluent;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestBuilder;
import io.fabric8.kubernetes.api.model.events.EventSeriesBuilder;
import io.fabric8.openshift.api.model.ProjectList;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleBuilder;
import io.fabric8.kubernetes.api.model.batch.JobList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluent;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluent;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingListFluent;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.openshift.api.model.GroupListBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluent;
import io.fabric8.openshift.api.model.GroupList;
import io.fabric8.kubernetes.api.model.extensions.IngressListFluent;
import java.lang.Override;
import io.fabric8.openshift.api.model.BuildListBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionReview;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsBuilder;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListBuilder;
import io.fabric8.openshift.api.model.ImageListFluent;
import io.fabric8.openshift.api.model.ImageStreamTagListFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressList;
import io.fabric8.openshift.api.model.ProjectListFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec;
import io.fabric8.openshift.api.model.UserList;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec;
import io.fabric8.openshift.api.model.SecurityContextConstraintsList;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListFluent;
import io.fabric8.kubernetes.api.model.version.Info;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetListFluent;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecFluent;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobList;
import io.fabric8.kubernetes.api.model.storage.StorageClassListFluent;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetList;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleListBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListFluent;
import java.util.Map;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.openshift.api.model.ImageListBuilder;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.kubernetes.api.model.version.InfoBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassList;
import io.fabric8.openshift.api.model.TagEventBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusBuilder;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleListFluent;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListBuilder;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackBuilder;
import io.fabric8.openshift.api.model.RouteListFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.events.EventSeries;
import io.fabric8.kubernetes.api.model.batch.CronJobFluent;
import io.fabric8.openshift.api.model.TagEventFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenList;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigListBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.OpenshiftRoleListBuilder;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressFluent;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleFluent;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluent;
import io.fabric8.openshift.api.model.NetNamespaceListBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList;
import io.fabric8.openshift.api.model.ProjectListBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleList;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.GroupListFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetListBuilder;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.openshift.api.model.NetNamespaceListFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestCondition;
import com.fasterxml.jackson.databind.DeserializationContext;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluent;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListFluent;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusFluent;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.events.EventFluent;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.openshift.api.model.BuildRequestFluent;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListBuilder;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.RouteListBuilder;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.openshift.api.model.IdentityListFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.kubernetes.api.model.rbac.AggregationRule;
import io.fabric8.kubernetes.api.model.apps.DeploymentListBuilder;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray;
import io.fabric8.kubernetes.api.model.events.EventBuilder;
import io.fabric8.kubernetes.api.model.events.Event;
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook;
import io.fabric8.openshift.api.model.BuildConfigListFluent;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluent;
import io.fabric8.openshift.api.model.ProjectRequestFluent;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleList;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusFluent;
import io.fabric8.openshift.api.model.IdentityListBuilder;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.kubernetes.api.model.extensions.IngressListBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobListFluent;
import io.fabric8.kubernetes.api.model.events.EventSeriesFluent;
import java.lang.Long;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.openshift.api.model.BuildConfigList;
import io.fabric8.openshift.api.model.OAuthClientFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluent;
import io.fabric8.openshift.api.model.UserListFluent;
import com.fasterxml.jackson.databind.JsonSerializer;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluent;
import io.fabric8.openshift.api.model.OAuthClientList;
import io.fabric8.openshift.api.model.ProjectFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluent;
import io.fabric8.openshift.api.model.DeploymentConfigList;
import io.fabric8.kubernetes.api.model.rbac.RoleFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.openshift.api.model.UserFluent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListFluent;
import io.fabric8.openshift.api.model.DeploymentConfigFluent;
import io.fabric8.kubernetes.api.model.version.InfoFluent;
import io.fabric8.openshift.api.model.RouteList;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListBuilder;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.openshift.api.model.Identity;
import java.lang.Boolean;
import io.fabric8.openshift.api.model.UserListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListBuilder;
import io.fabric8.openshift.api.model.ImageStreamList;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.openshift.api.model.ProjectRequest;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.admissionregistration.Rule;
import io.fabric8.openshift.api.model.OAuthAccessTokenListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagList;
import io.fabric8.openshift.api.model.TemplateListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.openshift.api.model.GroupFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigListFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleListFluent;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListBuilder;
import io.fabric8.openshift.api.model.ImageList;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListBuilder;
import io.fabric8.openshift.api.model.TemplateListFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassList;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluent;
import io.fabric8.openshift.api.model.RouteFluent;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperations;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingList;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.BuildListFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.openshift.api.model.ImageStreamListBuilder;
import io.fabric8.openshift.api.model.OAuthClientListFluent;
import io.fabric8.openshift.api.model.TagEvent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.batch.CronJobListFluent;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.kubernetes.api.model.apps.DeploymentListFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.NetNamespaceFluent;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.TemplateList;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.openshift.api.model.ImageStreamListFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluent;
import io.fabric8.openshift.api.model.TemplateFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.openshift.api.model.BuildList;
import io.fabric8.openshift.api.model.OAuthClientListBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest;
import io.fabric8.kubernetes.api.model.batch.JobListBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagListBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetList;

public interface KubeSchemaFluent<A extends KubeSchemaFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAdmissionRequest instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionRequest getAdmissionRequest();
    public AdmissionRequest buildAdmissionRequest();
    public A withAdmissionRequest(AdmissionRequest admissionRequest);
    public Boolean hasAdmissionRequest();
    public KubeSchemaFluent.AdmissionRequestNested<A> withNewAdmissionRequest();
    public KubeSchemaFluent.AdmissionRequestNested<A> withNewAdmissionRequestLike(AdmissionRequest item);
    public KubeSchemaFluent.AdmissionRequestNested<A> editAdmissionRequest();
    public KubeSchemaFluent.AdmissionRequestNested<A> editOrNewAdmissionRequest();
    public KubeSchemaFluent.AdmissionRequestNested<A> editOrNewAdmissionRequestLike(AdmissionRequest item);
    
/**
 * This method has been deprecated, please use method buildAdmissionResponse instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionResponse getAdmissionResponse();
    public AdmissionResponse buildAdmissionResponse();
    public A withAdmissionResponse(AdmissionResponse admissionResponse);
    public Boolean hasAdmissionResponse();
    public KubeSchemaFluent.AdmissionResponseNested<A> withNewAdmissionResponse();
    public KubeSchemaFluent.AdmissionResponseNested<A> withNewAdmissionResponseLike(AdmissionResponse item);
    public KubeSchemaFluent.AdmissionResponseNested<A> editAdmissionResponse();
    public KubeSchemaFluent.AdmissionResponseNested<A> editOrNewAdmissionResponse();
    public KubeSchemaFluent.AdmissionResponseNested<A> editOrNewAdmissionResponseLike(AdmissionResponse item);
    
/**
 * This method has been deprecated, please use method buildAdmissionReview instead.
 * @return The buildable object.
 */
@Deprecated public AdmissionReview getAdmissionReview();
    public AdmissionReview buildAdmissionReview();
    public A withAdmissionReview(AdmissionReview admissionReview);
    public Boolean hasAdmissionReview();
    public KubeSchemaFluent.AdmissionReviewNested<A> withNewAdmissionReview();
    public KubeSchemaFluent.AdmissionReviewNested<A> withNewAdmissionReviewLike(AdmissionReview item);
    public KubeSchemaFluent.AdmissionReviewNested<A> editAdmissionReview();
    public KubeSchemaFluent.AdmissionReviewNested<A> editOrNewAdmissionReview();
    public KubeSchemaFluent.AdmissionReviewNested<A> editOrNewAdmissionReviewLike(AdmissionReview item);
    
/**
 * This method has been deprecated, please use method buildAdmissionWebhook instead.
 * @return The buildable object.
 */
@Deprecated public Webhook getAdmissionWebhook();
    public Webhook buildAdmissionWebhook();
    public A withAdmissionWebhook(Webhook admissionWebhook);
    public Boolean hasAdmissionWebhook();
    public KubeSchemaFluent.AdmissionWebhookNested<A> withNewAdmissionWebhook();
    public KubeSchemaFluent.AdmissionWebhookNested<A> withNewAdmissionWebhookLike(Webhook item);
    public KubeSchemaFluent.AdmissionWebhookNested<A> editAdmissionWebhook();
    public KubeSchemaFluent.AdmissionWebhookNested<A> editOrNewAdmissionWebhook();
    public KubeSchemaFluent.AdmissionWebhookNested<A> editOrNewAdmissionWebhookLike(Webhook item);
    
/**
 * This method has been deprecated, please use method buildAggregationRule instead.
 * @return The buildable object.
 */
@Deprecated public AggregationRule getAggregationRule();
    public AggregationRule buildAggregationRule();
    public A withAggregationRule(AggregationRule aggregationRule);
    public Boolean hasAggregationRule();
    public KubeSchemaFluent.AggregationRuleNested<A> withNewAggregationRule();
    public KubeSchemaFluent.AggregationRuleNested<A> withNewAggregationRuleLike(AggregationRule item);
    public KubeSchemaFluent.AggregationRuleNested<A> editAggregationRule();
    public KubeSchemaFluent.AggregationRuleNested<A> editOrNewAggregationRule();
    public KubeSchemaFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(AggregationRule item);
    
/**
 * This method has been deprecated, please use method buildBaseKubernetesList instead.
 * @return The buildable object.
 */
@Deprecated public BaseKubernetesList getBaseKubernetesList();
    public BaseKubernetesList buildBaseKubernetesList();
    public A withBaseKubernetesList(BaseKubernetesList baseKubernetesList);
    public Boolean hasBaseKubernetesList();
    public KubeSchemaFluent.BaseKubernetesListNested<A> withNewBaseKubernetesList();
    public KubeSchemaFluent.BaseKubernetesListNested<A> withNewBaseKubernetesListLike(BaseKubernetesList item);
    public KubeSchemaFluent.BaseKubernetesListNested<A> editBaseKubernetesList();
    public KubeSchemaFluent.BaseKubernetesListNested<A> editOrNewBaseKubernetesList();
    public KubeSchemaFluent.BaseKubernetesListNested<A> editOrNewBaseKubernetesListLike(BaseKubernetesList item);
    
/**
 * This method has been deprecated, please use method buildBinding instead.
 * @return The buildable object.
 */
@Deprecated public Binding getBinding();
    public Binding buildBinding();
    public A withBinding(Binding binding);
    public Boolean hasBinding();
    public KubeSchemaFluent.BindingNested<A> withNewBinding();
    public KubeSchemaFluent.BindingNested<A> withNewBindingLike(Binding item);
    public KubeSchemaFluent.BindingNested<A> editBinding();
    public KubeSchemaFluent.BindingNested<A> editOrNewBinding();
    public KubeSchemaFluent.BindingNested<A> editOrNewBindingLike(Binding item);
    
/**
 * This method has been deprecated, please use method buildBuildConfigList instead.
 * @return The buildable object.
 */
@Deprecated public BuildConfigList getBuildConfigList();
    public BuildConfigList buildBuildConfigList();
    public A withBuildConfigList(BuildConfigList buildConfigList);
    public Boolean hasBuildConfigList();
    public KubeSchemaFluent.BuildConfigListNested<A> withNewBuildConfigList();
    public KubeSchemaFluent.BuildConfigListNested<A> withNewBuildConfigListLike(BuildConfigList item);
    public KubeSchemaFluent.BuildConfigListNested<A> editBuildConfigList();
    public KubeSchemaFluent.BuildConfigListNested<A> editOrNewBuildConfigList();
    public KubeSchemaFluent.BuildConfigListNested<A> editOrNewBuildConfigListLike(BuildConfigList item);
    
/**
 * This method has been deprecated, please use method buildBuildList instead.
 * @return The buildable object.
 */
@Deprecated public BuildList getBuildList();
    public BuildList buildBuildList();
    public A withBuildList(BuildList buildList);
    public Boolean hasBuildList();
    public KubeSchemaFluent.BuildListNested<A> withNewBuildList();
    public KubeSchemaFluent.BuildListNested<A> withNewBuildListLike(BuildList item);
    public KubeSchemaFluent.BuildListNested<A> editBuildList();
    public KubeSchemaFluent.BuildListNested<A> editOrNewBuildList();
    public KubeSchemaFluent.BuildListNested<A> editOrNewBuildListLike(BuildList item);
    
/**
 * This method has been deprecated, please use method buildBuildRequest instead.
 * @return The buildable object.
 */
@Deprecated public BuildRequest getBuildRequest();
    public BuildRequest buildBuildRequest();
    public A withBuildRequest(BuildRequest buildRequest);
    public Boolean hasBuildRequest();
    public KubeSchemaFluent.BuildRequestNested<A> withNewBuildRequest();
    public KubeSchemaFluent.BuildRequestNested<A> withNewBuildRequestLike(BuildRequest item);
    public KubeSchemaFluent.BuildRequestNested<A> editBuildRequest();
    public KubeSchemaFluent.BuildRequestNested<A> editOrNewBuildRequest();
    public KubeSchemaFluent.BuildRequestNested<A> editOrNewBuildRequestLike(BuildRequest item);
    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequest instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequest getCertificateSigningRequest();
    public CertificateSigningRequest buildCertificateSigningRequest();
    public A withCertificateSigningRequest(CertificateSigningRequest certificateSigningRequest);
    public Boolean hasCertificateSigningRequest();
    public KubeSchemaFluent.CertificateSigningRequestNested<A> withNewCertificateSigningRequest();
    public KubeSchemaFluent.CertificateSigningRequestNested<A> withNewCertificateSigningRequestLike(CertificateSigningRequest item);
    public KubeSchemaFluent.CertificateSigningRequestNested<A> editCertificateSigningRequest();
    public KubeSchemaFluent.CertificateSigningRequestNested<A> editOrNewCertificateSigningRequest();
    public KubeSchemaFluent.CertificateSigningRequestNested<A> editOrNewCertificateSigningRequestLike(CertificateSigningRequest item);
    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestCondition instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestCondition getCertificateSigningRequestCondition();
    public CertificateSigningRequestCondition buildCertificateSigningRequestCondition();
    public A withCertificateSigningRequestCondition(CertificateSigningRequestCondition certificateSigningRequestCondition);
    public Boolean hasCertificateSigningRequestCondition();
    public A withNewCertificateSigningRequestCondition(String lastUpdateTime,String message,String reason,String type);
    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> withNewCertificateSigningRequestCondition();
    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> withNewCertificateSigningRequestConditionLike(CertificateSigningRequestCondition item);
    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> editCertificateSigningRequestCondition();
    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> editOrNewCertificateSigningRequestCondition();
    public KubeSchemaFluent.CertificateSigningRequestConditionNested<A> editOrNewCertificateSigningRequestConditionLike(CertificateSigningRequestCondition item);
    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestList instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestList getCertificateSigningRequestList();
    public CertificateSigningRequestList buildCertificateSigningRequestList();
    public A withCertificateSigningRequestList(CertificateSigningRequestList certificateSigningRequestList);
    public Boolean hasCertificateSigningRequestList();
    public KubeSchemaFluent.CertificateSigningRequestListNested<A> withNewCertificateSigningRequestList();
    public KubeSchemaFluent.CertificateSigningRequestListNested<A> withNewCertificateSigningRequestListLike(CertificateSigningRequestList item);
    public KubeSchemaFluent.CertificateSigningRequestListNested<A> editCertificateSigningRequestList();
    public KubeSchemaFluent.CertificateSigningRequestListNested<A> editOrNewCertificateSigningRequestList();
    public KubeSchemaFluent.CertificateSigningRequestListNested<A> editOrNewCertificateSigningRequestListLike(CertificateSigningRequestList item);
    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestSpec instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestSpec getCertificateSigningRequestSpec();
    public CertificateSigningRequestSpec buildCertificateSigningRequestSpec();
    public A withCertificateSigningRequestSpec(CertificateSigningRequestSpec certificateSigningRequestSpec);
    public Boolean hasCertificateSigningRequestSpec();
    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> withNewCertificateSigningRequestSpec();
    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> withNewCertificateSigningRequestSpecLike(CertificateSigningRequestSpec item);
    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> editCertificateSigningRequestSpec();
    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> editOrNewCertificateSigningRequestSpec();
    public KubeSchemaFluent.CertificateSigningRequestSpecNested<A> editOrNewCertificateSigningRequestSpecLike(CertificateSigningRequestSpec item);
    
/**
 * This method has been deprecated, please use method buildCertificateSigningRequestStatus instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestStatus getCertificateSigningRequestStatus();
    public CertificateSigningRequestStatus buildCertificateSigningRequestStatus();
    public A withCertificateSigningRequestStatus(CertificateSigningRequestStatus certificateSigningRequestStatus);
    public Boolean hasCertificateSigningRequestStatus();
    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> withNewCertificateSigningRequestStatus();
    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> withNewCertificateSigningRequestStatusLike(CertificateSigningRequestStatus item);
    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> editCertificateSigningRequestStatus();
    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> editOrNewCertificateSigningRequestStatus();
    public KubeSchemaFluent.CertificateSigningRequestStatusNested<A> editOrNewCertificateSigningRequestStatusLike(CertificateSigningRequestStatus item);
    
/**
 * This method has been deprecated, please use method buildClusterRole instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRole getClusterRole();
    public ClusterRole buildClusterRole();
    public A withClusterRole(ClusterRole clusterRole);
    public Boolean hasClusterRole();
    public KubeSchemaFluent.ClusterRoleNested<A> withNewClusterRole();
    public KubeSchemaFluent.ClusterRoleNested<A> withNewClusterRoleLike(ClusterRole item);
    public KubeSchemaFluent.ClusterRoleNested<A> editClusterRole();
    public KubeSchemaFluent.ClusterRoleNested<A> editOrNewClusterRole();
    public KubeSchemaFluent.ClusterRoleNested<A> editOrNewClusterRoleLike(ClusterRole item);
    
/**
 * This method has been deprecated, please use method buildClusterRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRoleBinding getClusterRoleBinding();
    public ClusterRoleBinding buildClusterRoleBinding();
    public A withClusterRoleBinding(ClusterRoleBinding clusterRoleBinding);
    public Boolean hasClusterRoleBinding();
    public KubeSchemaFluent.ClusterRoleBindingNested<A> withNewClusterRoleBinding();
    public KubeSchemaFluent.ClusterRoleBindingNested<A> withNewClusterRoleBindingLike(ClusterRoleBinding item);
    public KubeSchemaFluent.ClusterRoleBindingNested<A> editClusterRoleBinding();
    public KubeSchemaFluent.ClusterRoleBindingNested<A> editOrNewClusterRoleBinding();
    public KubeSchemaFluent.ClusterRoleBindingNested<A> editOrNewClusterRoleBindingLike(ClusterRoleBinding item);
    
/**
 * This method has been deprecated, please use method buildClusterRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRoleBindingList getClusterRoleBindingList();
    public ClusterRoleBindingList buildClusterRoleBindingList();
    public A withClusterRoleBindingList(ClusterRoleBindingList clusterRoleBindingList);
    public Boolean hasClusterRoleBindingList();
    public KubeSchemaFluent.ClusterRoleBindingListNested<A> withNewClusterRoleBindingList();
    public KubeSchemaFluent.ClusterRoleBindingListNested<A> withNewClusterRoleBindingListLike(ClusterRoleBindingList item);
    public KubeSchemaFluent.ClusterRoleBindingListNested<A> editClusterRoleBindingList();
    public KubeSchemaFluent.ClusterRoleBindingListNested<A> editOrNewClusterRoleBindingList();
    public KubeSchemaFluent.ClusterRoleBindingListNested<A> editOrNewClusterRoleBindingListLike(ClusterRoleBindingList item);
    
/**
 * This method has been deprecated, please use method buildClusterRoleList instead.
 * @return The buildable object.
 */
@Deprecated public ClusterRoleList getClusterRoleList();
    public ClusterRoleList buildClusterRoleList();
    public A withClusterRoleList(ClusterRoleList clusterRoleList);
    public Boolean hasClusterRoleList();
    public KubeSchemaFluent.ClusterRoleListNested<A> withNewClusterRoleList();
    public KubeSchemaFluent.ClusterRoleListNested<A> withNewClusterRoleListLike(ClusterRoleList item);
    public KubeSchemaFluent.ClusterRoleListNested<A> editClusterRoleList();
    public KubeSchemaFluent.ClusterRoleListNested<A> editOrNewClusterRoleList();
    public KubeSchemaFluent.ClusterRoleListNested<A> editOrNewClusterRoleListLike(ClusterRoleList item);
    
/**
 * This method has been deprecated, please use method buildComponentStatusList instead.
 * @return The buildable object.
 */
@Deprecated public ComponentStatusList getComponentStatusList();
    public ComponentStatusList buildComponentStatusList();
    public A withComponentStatusList(ComponentStatusList componentStatusList);
    public Boolean hasComponentStatusList();
    public KubeSchemaFluent.ComponentStatusListNested<A> withNewComponentStatusList();
    public KubeSchemaFluent.ComponentStatusListNested<A> withNewComponentStatusListLike(ComponentStatusList item);
    public KubeSchemaFluent.ComponentStatusListNested<A> editComponentStatusList();
    public KubeSchemaFluent.ComponentStatusListNested<A> editOrNewComponentStatusList();
    public KubeSchemaFluent.ComponentStatusListNested<A> editOrNewComponentStatusListLike(ComponentStatusList item);
    
/**
 * This method has been deprecated, please use method buildConfig instead.
 * @return The buildable object.
 */
@Deprecated public Config getConfig();
    public Config buildConfig();
    public A withConfig(Config config);
    public Boolean hasConfig();
    public KubeSchemaFluent.ConfigNested<A> withNewConfig();
    public KubeSchemaFluent.ConfigNested<A> withNewConfigLike(Config item);
    public KubeSchemaFluent.ConfigNested<A> editConfig();
    public KubeSchemaFluent.ConfigNested<A> editOrNewConfig();
    public KubeSchemaFluent.ConfigNested<A> editOrNewConfigLike(Config item);
    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMap getConfigMap();
    public ConfigMap buildConfigMap();
    public A withConfigMap(ConfigMap configMap);
    public Boolean hasConfigMap();
    public KubeSchemaFluent.ConfigMapNested<A> withNewConfigMap();
    public KubeSchemaFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMap item);
    public KubeSchemaFluent.ConfigMapNested<A> editConfigMap();
    public KubeSchemaFluent.ConfigMapNested<A> editOrNewConfigMap();
    public KubeSchemaFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMap item);
    
/**
 * This method has been deprecated, please use method buildConfigMapList instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapList getConfigMapList();
    public ConfigMapList buildConfigMapList();
    public A withConfigMapList(ConfigMapList configMapList);
    public Boolean hasConfigMapList();
    public KubeSchemaFluent.ConfigMapListNested<A> withNewConfigMapList();
    public KubeSchemaFluent.ConfigMapListNested<A> withNewConfigMapListLike(ConfigMapList item);
    public KubeSchemaFluent.ConfigMapListNested<A> editConfigMapList();
    public KubeSchemaFluent.ConfigMapListNested<A> editOrNewConfigMapList();
    public KubeSchemaFluent.ConfigMapListNested<A> editOrNewConfigMapListLike(ConfigMapList item);
    
/**
 * This method has been deprecated, please use method buildContainerStatus instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStatus getContainerStatus();
    public ContainerStatus buildContainerStatus();
    public A withContainerStatus(ContainerStatus containerStatus);
    public Boolean hasContainerStatus();
    public KubeSchemaFluent.ContainerStatusNested<A> withNewContainerStatus();
    public KubeSchemaFluent.ContainerStatusNested<A> withNewContainerStatusLike(ContainerStatus item);
    public KubeSchemaFluent.ContainerStatusNested<A> editContainerStatus();
    public KubeSchemaFluent.ContainerStatusNested<A> editOrNewContainerStatus();
    public KubeSchemaFluent.ContainerStatusNested<A> editOrNewContainerStatusLike(ContainerStatus item);
    
/**
 * This method has been deprecated, please use method buildCronJob instead.
 * @return The buildable object.
 */
@Deprecated public CronJob getCronJob();
    public CronJob buildCronJob();
    public A withCronJob(CronJob cronJob);
    public Boolean hasCronJob();
    public KubeSchemaFluent.CronJobNested<A> withNewCronJob();
    public KubeSchemaFluent.CronJobNested<A> withNewCronJobLike(CronJob item);
    public KubeSchemaFluent.CronJobNested<A> editCronJob();
    public KubeSchemaFluent.CronJobNested<A> editOrNewCronJob();
    public KubeSchemaFluent.CronJobNested<A> editOrNewCronJobLike(CronJob item);
    
/**
 * This method has been deprecated, please use method buildCronJobList instead.
 * @return The buildable object.
 */
@Deprecated public CronJobList getCronJobList();
    public CronJobList buildCronJobList();
    public A withCronJobList(CronJobList cronJobList);
    public Boolean hasCronJobList();
    public KubeSchemaFluent.CronJobListNested<A> withNewCronJobList();
    public KubeSchemaFluent.CronJobListNested<A> withNewCronJobListLike(CronJobList item);
    public KubeSchemaFluent.CronJobListNested<A> editCronJobList();
    public KubeSchemaFluent.CronJobListNested<A> editOrNewCronJobList();
    public KubeSchemaFluent.CronJobListNested<A> editOrNewCronJobListLike(CronJobList item);
    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinition instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinition getCustomResourceDefinition();
    public CustomResourceDefinition buildCustomResourceDefinition();
    public A withCustomResourceDefinition(CustomResourceDefinition customResourceDefinition);
    public Boolean hasCustomResourceDefinition();
    public KubeSchemaFluent.CustomResourceDefinitionNested<A> withNewCustomResourceDefinition();
    public KubeSchemaFluent.CustomResourceDefinitionNested<A> withNewCustomResourceDefinitionLike(CustomResourceDefinition item);
    public KubeSchemaFluent.CustomResourceDefinitionNested<A> editCustomResourceDefinition();
    public KubeSchemaFluent.CustomResourceDefinitionNested<A> editOrNewCustomResourceDefinition();
    public KubeSchemaFluent.CustomResourceDefinitionNested<A> editOrNewCustomResourceDefinitionLike(CustomResourceDefinition item);
    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionCondition instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionCondition getCustomResourceDefinitionCondition();
    public CustomResourceDefinitionCondition buildCustomResourceDefinitionCondition();
    public A withCustomResourceDefinitionCondition(CustomResourceDefinitionCondition customResourceDefinitionCondition);
    public Boolean hasCustomResourceDefinitionCondition();
    public A withNewCustomResourceDefinitionCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> withNewCustomResourceDefinitionCondition();
    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> withNewCustomResourceDefinitionConditionLike(CustomResourceDefinitionCondition item);
    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> editCustomResourceDefinitionCondition();
    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> editOrNewCustomResourceDefinitionCondition();
    public KubeSchemaFluent.CustomResourceDefinitionConditionNested<A> editOrNewCustomResourceDefinitionConditionLike(CustomResourceDefinitionCondition item);
    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionList instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionList getCustomResourceDefinitionList();
    public CustomResourceDefinitionList buildCustomResourceDefinitionList();
    public A withCustomResourceDefinitionList(CustomResourceDefinitionList customResourceDefinitionList);
    public Boolean hasCustomResourceDefinitionList();
    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> withNewCustomResourceDefinitionList();
    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> withNewCustomResourceDefinitionListLike(CustomResourceDefinitionList item);
    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> editCustomResourceDefinitionList();
    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> editOrNewCustomResourceDefinitionList();
    public KubeSchemaFluent.CustomResourceDefinitionListNested<A> editOrNewCustomResourceDefinitionListLike(CustomResourceDefinitionList item);
    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionNames instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionNames getCustomResourceDefinitionNames();
    public CustomResourceDefinitionNames buildCustomResourceDefinitionNames();
    public A withCustomResourceDefinitionNames(CustomResourceDefinitionNames customResourceDefinitionNames);
    public Boolean hasCustomResourceDefinitionNames();
    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> withNewCustomResourceDefinitionNames();
    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> withNewCustomResourceDefinitionNamesLike(CustomResourceDefinitionNames item);
    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> editCustomResourceDefinitionNames();
    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> editOrNewCustomResourceDefinitionNames();
    public KubeSchemaFluent.CustomResourceDefinitionNamesNested<A> editOrNewCustomResourceDefinitionNamesLike(CustomResourceDefinitionNames item);
    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionSpec instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionSpec getCustomResourceDefinitionSpec();
    public CustomResourceDefinitionSpec buildCustomResourceDefinitionSpec();
    public A withCustomResourceDefinitionSpec(CustomResourceDefinitionSpec customResourceDefinitionSpec);
    public Boolean hasCustomResourceDefinitionSpec();
    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> withNewCustomResourceDefinitionSpec();
    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> withNewCustomResourceDefinitionSpecLike(CustomResourceDefinitionSpec item);
    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> editCustomResourceDefinitionSpec();
    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> editOrNewCustomResourceDefinitionSpec();
    public KubeSchemaFluent.CustomResourceDefinitionSpecNested<A> editOrNewCustomResourceDefinitionSpecLike(CustomResourceDefinitionSpec item);
    
/**
 * This method has been deprecated, please use method buildCustomResourceDefinitionStatus instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionStatus getCustomResourceDefinitionStatus();
    public CustomResourceDefinitionStatus buildCustomResourceDefinitionStatus();
    public A withCustomResourceDefinitionStatus(CustomResourceDefinitionStatus customResourceDefinitionStatus);
    public Boolean hasCustomResourceDefinitionStatus();
    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> withNewCustomResourceDefinitionStatus();
    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> withNewCustomResourceDefinitionStatusLike(CustomResourceDefinitionStatus item);
    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> editCustomResourceDefinitionStatus();
    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> editOrNewCustomResourceDefinitionStatus();
    public KubeSchemaFluent.CustomResourceDefinitionStatusNested<A> editOrNewCustomResourceDefinitionStatusLike(CustomResourceDefinitionStatus item);
    
/**
 * This method has been deprecated, please use method buildDaemonSet instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSet getDaemonSet();
    public DaemonSet buildDaemonSet();
    public A withDaemonSet(DaemonSet daemonSet);
    public Boolean hasDaemonSet();
    public KubeSchemaFluent.DaemonSetNested<A> withNewDaemonSet();
    public KubeSchemaFluent.DaemonSetNested<A> withNewDaemonSetLike(DaemonSet item);
    public KubeSchemaFluent.DaemonSetNested<A> editDaemonSet();
    public KubeSchemaFluent.DaemonSetNested<A> editOrNewDaemonSet();
    public KubeSchemaFluent.DaemonSetNested<A> editOrNewDaemonSetLike(DaemonSet item);
    
/**
 * This method has been deprecated, please use method buildDaemonSetList instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSetList getDaemonSetList();
    public DaemonSetList buildDaemonSetList();
    public A withDaemonSetList(DaemonSetList daemonSetList);
    public Boolean hasDaemonSetList();
    public KubeSchemaFluent.DaemonSetListNested<A> withNewDaemonSetList();
    public KubeSchemaFluent.DaemonSetListNested<A> withNewDaemonSetListLike(DaemonSetList item);
    public KubeSchemaFluent.DaemonSetListNested<A> editDaemonSetList();
    public KubeSchemaFluent.DaemonSetListNested<A> editOrNewDaemonSetList();
    public KubeSchemaFluent.DaemonSetListNested<A> editOrNewDaemonSetListLike(DaemonSetList item);
    
/**
 * This method has been deprecated, please use method buildDeleteOptions instead.
 * @return The buildable object.
 */
@Deprecated public DeleteOptions getDeleteOptions();
    public DeleteOptions buildDeleteOptions();
    public A withDeleteOptions(DeleteOptions deleteOptions);
    public Boolean hasDeleteOptions();
    public KubeSchemaFluent.DeleteOptionsNested<A> withNewDeleteOptions();
    public KubeSchemaFluent.DeleteOptionsNested<A> withNewDeleteOptionsLike(DeleteOptions item);
    public KubeSchemaFluent.DeleteOptionsNested<A> editDeleteOptions();
    public KubeSchemaFluent.DeleteOptionsNested<A> editOrNewDeleteOptions();
    public KubeSchemaFluent.DeleteOptionsNested<A> editOrNewDeleteOptionsLike(DeleteOptions item);
    
/**
 * This method has been deprecated, please use method buildDeployment instead.
 * @return The buildable object.
 */
@Deprecated public Deployment getDeployment();
    public Deployment buildDeployment();
    public A withDeployment(Deployment deployment);
    public Boolean hasDeployment();
    public KubeSchemaFluent.DeploymentNested<A> withNewDeployment();
    public KubeSchemaFluent.DeploymentNested<A> withNewDeploymentLike(Deployment item);
    public KubeSchemaFluent.DeploymentNested<A> editDeployment();
    public KubeSchemaFluent.DeploymentNested<A> editOrNewDeployment();
    public KubeSchemaFluent.DeploymentNested<A> editOrNewDeploymentLike(Deployment item);
    
/**
 * This method has been deprecated, please use method buildDeploymentConfig instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfig getDeploymentConfig();
    public DeploymentConfig buildDeploymentConfig();
    public A withDeploymentConfig(DeploymentConfig deploymentConfig);
    public Boolean hasDeploymentConfig();
    public KubeSchemaFluent.DeploymentConfigNested<A> withNewDeploymentConfig();
    public KubeSchemaFluent.DeploymentConfigNested<A> withNewDeploymentConfigLike(DeploymentConfig item);
    public KubeSchemaFluent.DeploymentConfigNested<A> editDeploymentConfig();
    public KubeSchemaFluent.DeploymentConfigNested<A> editOrNewDeploymentConfig();
    public KubeSchemaFluent.DeploymentConfigNested<A> editOrNewDeploymentConfigLike(DeploymentConfig item);
    
/**
 * This method has been deprecated, please use method buildDeploymentConfigList instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfigList getDeploymentConfigList();
    public DeploymentConfigList buildDeploymentConfigList();
    public A withDeploymentConfigList(DeploymentConfigList deploymentConfigList);
    public Boolean hasDeploymentConfigList();
    public KubeSchemaFluent.DeploymentConfigListNested<A> withNewDeploymentConfigList();
    public KubeSchemaFluent.DeploymentConfigListNested<A> withNewDeploymentConfigListLike(DeploymentConfigList item);
    public KubeSchemaFluent.DeploymentConfigListNested<A> editDeploymentConfigList();
    public KubeSchemaFluent.DeploymentConfigListNested<A> editOrNewDeploymentConfigList();
    public KubeSchemaFluent.DeploymentConfigListNested<A> editOrNewDeploymentConfigListLike(DeploymentConfigList item);
    
/**
 * This method has been deprecated, please use method buildDeploymentList instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentList getDeploymentList();
    public DeploymentList buildDeploymentList();
    public A withDeploymentList(DeploymentList deploymentList);
    public Boolean hasDeploymentList();
    public KubeSchemaFluent.DeploymentListNested<A> withNewDeploymentList();
    public KubeSchemaFluent.DeploymentListNested<A> withNewDeploymentListLike(DeploymentList item);
    public KubeSchemaFluent.DeploymentListNested<A> editDeploymentList();
    public KubeSchemaFluent.DeploymentListNested<A> editOrNewDeploymentList();
    public KubeSchemaFluent.DeploymentListNested<A> editOrNewDeploymentListLike(DeploymentList item);
    
/**
 * This method has been deprecated, please use method buildDeploymentRollback instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentRollback getDeploymentRollback();
    public DeploymentRollback buildDeploymentRollback();
    public A withDeploymentRollback(DeploymentRollback deploymentRollback);
    public Boolean hasDeploymentRollback();
    public KubeSchemaFluent.DeploymentRollbackNested<A> withNewDeploymentRollback();
    public KubeSchemaFluent.DeploymentRollbackNested<A> withNewDeploymentRollbackLike(DeploymentRollback item);
    public KubeSchemaFluent.DeploymentRollbackNested<A> editDeploymentRollback();
    public KubeSchemaFluent.DeploymentRollbackNested<A> editOrNewDeploymentRollback();
    public KubeSchemaFluent.DeploymentRollbackNested<A> editOrNewDeploymentRollbackLike(DeploymentRollback item);
    
/**
 * This method has been deprecated, please use method buildEndpoints instead.
 * @return The buildable object.
 */
@Deprecated public Endpoints getEndpoints();
    public Endpoints buildEndpoints();
    public A withEndpoints(Endpoints endpoints);
    public Boolean hasEndpoints();
    public KubeSchemaFluent.EndpointsNested<A> withNewEndpoints();
    public KubeSchemaFluent.EndpointsNested<A> withNewEndpointsLike(Endpoints item);
    public KubeSchemaFluent.EndpointsNested<A> editEndpoints();
    public KubeSchemaFluent.EndpointsNested<A> editOrNewEndpoints();
    public KubeSchemaFluent.EndpointsNested<A> editOrNewEndpointsLike(Endpoints item);
    
/**
 * This method has been deprecated, please use method buildEndpointsList instead.
 * @return The buildable object.
 */
@Deprecated public EndpointsList getEndpointsList();
    public EndpointsList buildEndpointsList();
    public A withEndpointsList(EndpointsList endpointsList);
    public Boolean hasEndpointsList();
    public KubeSchemaFluent.EndpointsListNested<A> withNewEndpointsList();
    public KubeSchemaFluent.EndpointsListNested<A> withNewEndpointsListLike(EndpointsList item);
    public KubeSchemaFluent.EndpointsListNested<A> editEndpointsList();
    public KubeSchemaFluent.EndpointsListNested<A> editOrNewEndpointsList();
    public KubeSchemaFluent.EndpointsListNested<A> editOrNewEndpointsListLike(EndpointsList item);
    
/**
 * This method has been deprecated, please use method buildEnvVar instead.
 * @return The buildable object.
 */
@Deprecated public EnvVar getEnvVar();
    public EnvVar buildEnvVar();
    public A withEnvVar(EnvVar envVar);
    public Boolean hasEnvVar();
    public KubeSchemaFluent.EnvVarNested<A> withNewEnvVar();
    public KubeSchemaFluent.EnvVarNested<A> withNewEnvVarLike(EnvVar item);
    public KubeSchemaFluent.EnvVarNested<A> editEnvVar();
    public KubeSchemaFluent.EnvVarNested<A> editOrNewEnvVar();
    public KubeSchemaFluent.EnvVarNested<A> editOrNewEnvVarLike(EnvVar item);
    
/**
 * This method has been deprecated, please use method buildEvent instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.events.Event getEvent();
    public io.fabric8.kubernetes.api.model.events.Event buildEvent();
    public A withEvent(io.fabric8.kubernetes.api.model.events.Event event);
    public Boolean hasEvent();
    public KubeSchemaFluent.EventsEventNested<A> withNewEventsEvent();
    public KubeSchemaFluent.EventsEventNested<A> withNewEventLike(io.fabric8.kubernetes.api.model.events.Event item);
    public KubeSchemaFluent.EventsEventNested<A> editEventsEvent();
    public KubeSchemaFluent.EventsEventNested<A> editOrNewEvent();
    public KubeSchemaFluent.EventsEventNested<A> editOrNewEventLike(io.fabric8.kubernetes.api.model.events.Event item);
    
/**
 * This method has been deprecated, please use method buildEventList instead.
 * @return The buildable object.
 */
@Deprecated public EventList getEventList();
    public EventList buildEventList();
    public A withEventList(EventList eventList);
    public Boolean hasEventList();
    public KubeSchemaFluent.EventListNested<A> withNewEventList();
    public KubeSchemaFluent.EventListNested<A> withNewEventListLike(EventList item);
    public KubeSchemaFluent.EventListNested<A> editEventList();
    public KubeSchemaFluent.EventListNested<A> editOrNewEventList();
    public KubeSchemaFluent.EventListNested<A> editOrNewEventListLike(EventList item);
    
/**
 * This method has been deprecated, please use method buildEventSeries instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.events.EventSeries getEventSeries();
    public io.fabric8.kubernetes.api.model.events.EventSeries buildEventSeries();
    public A withEventSeries(io.fabric8.kubernetes.api.model.events.EventSeries eventSeries);
    public Boolean hasEventSeries();
    public KubeSchemaFluent.EventsEventSeriesNested<A> withNewEventsEventSeries();
    public KubeSchemaFluent.EventsEventSeriesNested<A> withNewEventSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item);
    public KubeSchemaFluent.EventsEventSeriesNested<A> editEventsEventSeries();
    public KubeSchemaFluent.EventsEventSeriesNested<A> editOrNewEventSeries();
    public KubeSchemaFluent.EventsEventSeriesNested<A> editOrNewEventSeriesLike(io.fabric8.kubernetes.api.model.events.EventSeries item);
    public String getEventSeriesState();
    public A withEventSeriesState(String eventSeriesState);
    public Boolean hasEventSeriesState();
    
/**
 * This method has been deprecated, please use method buildGroup instead.
 * @return The buildable object.
 */
@Deprecated public Group getGroup();
    public Group buildGroup();
    public A withGroup(Group group);
    public Boolean hasGroup();
    public KubeSchemaFluent.GroupNested<A> withNewGroup();
    public KubeSchemaFluent.GroupNested<A> withNewGroupLike(Group item);
    public KubeSchemaFluent.GroupNested<A> editGroup();
    public KubeSchemaFluent.GroupNested<A> editOrNewGroup();
    public KubeSchemaFluent.GroupNested<A> editOrNewGroupLike(Group item);
    
/**
 * This method has been deprecated, please use method buildGroupList instead.
 * @return The buildable object.
 */
@Deprecated public GroupList getGroupList();
    public GroupList buildGroupList();
    public A withGroupList(GroupList groupList);
    public Boolean hasGroupList();
    public KubeSchemaFluent.GroupListNested<A> withNewGroupList();
    public KubeSchemaFluent.GroupListNested<A> withNewGroupListLike(GroupList item);
    public KubeSchemaFluent.GroupListNested<A> editGroupList();
    public KubeSchemaFluent.GroupListNested<A> editOrNewGroupList();
    public KubeSchemaFluent.GroupListNested<A> editOrNewGroupListLike(GroupList item);
    
/**
 * This method has been deprecated, please use method buildHorizontalPodAutoscaler instead.
 * @return The buildable object.
 */
@Deprecated public HorizontalPodAutoscaler getHorizontalPodAutoscaler();
    public HorizontalPodAutoscaler buildHorizontalPodAutoscaler();
    public A withHorizontalPodAutoscaler(HorizontalPodAutoscaler horizontalPodAutoscaler);
    public Boolean hasHorizontalPodAutoscaler();
    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> withNewHorizontalPodAutoscaler();
    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> withNewHorizontalPodAutoscalerLike(HorizontalPodAutoscaler item);
    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> editHorizontalPodAutoscaler();
    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> editOrNewHorizontalPodAutoscaler();
    public KubeSchemaFluent.HorizontalPodAutoscalerNested<A> editOrNewHorizontalPodAutoscalerLike(HorizontalPodAutoscaler item);
    
/**
 * This method has been deprecated, please use method buildHorizontalPodAutoscalerList instead.
 * @return The buildable object.
 */
@Deprecated public HorizontalPodAutoscalerList getHorizontalPodAutoscalerList();
    public HorizontalPodAutoscalerList buildHorizontalPodAutoscalerList();
    public A withHorizontalPodAutoscalerList(HorizontalPodAutoscalerList horizontalPodAutoscalerList);
    public Boolean hasHorizontalPodAutoscalerList();
    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> withNewHorizontalPodAutoscalerList();
    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> withNewHorizontalPodAutoscalerListLike(HorizontalPodAutoscalerList item);
    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> editHorizontalPodAutoscalerList();
    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> editOrNewHorizontalPodAutoscalerList();
    public KubeSchemaFluent.HorizontalPodAutoscalerListNested<A> editOrNewHorizontalPodAutoscalerListLike(HorizontalPodAutoscalerList item);
    
/**
 * This method has been deprecated, please use method buildIdentity instead.
 * @return The buildable object.
 */
@Deprecated public Identity getIdentity();
    public Identity buildIdentity();
    public A withIdentity(Identity identity);
    public Boolean hasIdentity();
    public KubeSchemaFluent.IdentityNested<A> withNewIdentity();
    public KubeSchemaFluent.IdentityNested<A> withNewIdentityLike(Identity item);
    public KubeSchemaFluent.IdentityNested<A> editIdentity();
    public KubeSchemaFluent.IdentityNested<A> editOrNewIdentity();
    public KubeSchemaFluent.IdentityNested<A> editOrNewIdentityLike(Identity item);
    
/**
 * This method has been deprecated, please use method buildIdentityList instead.
 * @return The buildable object.
 */
@Deprecated public IdentityList getIdentityList();
    public IdentityList buildIdentityList();
    public A withIdentityList(IdentityList identityList);
    public Boolean hasIdentityList();
    public KubeSchemaFluent.IdentityListNested<A> withNewIdentityList();
    public KubeSchemaFluent.IdentityListNested<A> withNewIdentityListLike(IdentityList item);
    public KubeSchemaFluent.IdentityListNested<A> editIdentityList();
    public KubeSchemaFluent.IdentityListNested<A> editOrNewIdentityList();
    public KubeSchemaFluent.IdentityListNested<A> editOrNewIdentityListLike(IdentityList item);
    
/**
 * This method has been deprecated, please use method buildImageList instead.
 * @return The buildable object.
 */
@Deprecated public ImageList getImageList();
    public ImageList buildImageList();
    public A withImageList(ImageList imageList);
    public Boolean hasImageList();
    public KubeSchemaFluent.ImageListNested<A> withNewImageList();
    public KubeSchemaFluent.ImageListNested<A> withNewImageListLike(ImageList item);
    public KubeSchemaFluent.ImageListNested<A> editImageList();
    public KubeSchemaFluent.ImageListNested<A> editOrNewImageList();
    public KubeSchemaFluent.ImageListNested<A> editOrNewImageListLike(ImageList item);
    
/**
 * This method has been deprecated, please use method buildImageStreamImport instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamImport getImageStreamImport();
    public ImageStreamImport buildImageStreamImport();
    public A withImageStreamImport(ImageStreamImport imageStreamImport);
    public Boolean hasImageStreamImport();
    public KubeSchemaFluent.ImageStreamImportNested<A> withNewImageStreamImport();
    public KubeSchemaFluent.ImageStreamImportNested<A> withNewImageStreamImportLike(ImageStreamImport item);
    public KubeSchemaFluent.ImageStreamImportNested<A> editImageStreamImport();
    public KubeSchemaFluent.ImageStreamImportNested<A> editOrNewImageStreamImport();
    public KubeSchemaFluent.ImageStreamImportNested<A> editOrNewImageStreamImportLike(ImageStreamImport item);
    
/**
 * This method has been deprecated, please use method buildImageStreamList instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamList getImageStreamList();
    public ImageStreamList buildImageStreamList();
    public A withImageStreamList(ImageStreamList imageStreamList);
    public Boolean hasImageStreamList();
    public KubeSchemaFluent.ImageStreamListNested<A> withNewImageStreamList();
    public KubeSchemaFluent.ImageStreamListNested<A> withNewImageStreamListLike(ImageStreamList item);
    public KubeSchemaFluent.ImageStreamListNested<A> editImageStreamList();
    public KubeSchemaFluent.ImageStreamListNested<A> editOrNewImageStreamList();
    public KubeSchemaFluent.ImageStreamListNested<A> editOrNewImageStreamListLike(ImageStreamList item);
    
/**
 * This method has been deprecated, please use method buildImageStreamTagList instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamTagList getImageStreamTagList();
    public ImageStreamTagList buildImageStreamTagList();
    public A withImageStreamTagList(ImageStreamTagList imageStreamTagList);
    public Boolean hasImageStreamTagList();
    public KubeSchemaFluent.ImageStreamTagListNested<A> withNewImageStreamTagList();
    public KubeSchemaFluent.ImageStreamTagListNested<A> withNewImageStreamTagListLike(ImageStreamTagList item);
    public KubeSchemaFluent.ImageStreamTagListNested<A> editImageStreamTagList();
    public KubeSchemaFluent.ImageStreamTagListNested<A> editOrNewImageStreamTagList();
    public KubeSchemaFluent.ImageStreamTagListNested<A> editOrNewImageStreamTagListLike(ImageStreamTagList item);
    
/**
 * This method has been deprecated, please use method buildInfo instead.
 * @return The buildable object.
 */
@Deprecated public Info getInfo();
    public Info buildInfo();
    public A withInfo(Info info);
    public Boolean hasInfo();
    public KubeSchemaFluent.InfoNested<A> withNewInfo();
    public KubeSchemaFluent.InfoNested<A> withNewInfoLike(Info item);
    public KubeSchemaFluent.InfoNested<A> editInfo();
    public KubeSchemaFluent.InfoNested<A> editOrNewInfo();
    public KubeSchemaFluent.InfoNested<A> editOrNewInfoLike(Info item);
    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public Ingress getIngress();
    public Ingress buildIngress();
    public A withIngress(Ingress ingress);
    public Boolean hasIngress();
    public KubeSchemaFluent.IngressNested<A> withNewIngress();
    public KubeSchemaFluent.IngressNested<A> withNewIngressLike(Ingress item);
    public KubeSchemaFluent.IngressNested<A> editIngress();
    public KubeSchemaFluent.IngressNested<A> editOrNewIngress();
    public KubeSchemaFluent.IngressNested<A> editOrNewIngressLike(Ingress item);
    
/**
 * This method has been deprecated, please use method buildIngressList instead.
 * @return The buildable object.
 */
@Deprecated public IngressList getIngressList();
    public IngressList buildIngressList();
    public A withIngressList(IngressList ingressList);
    public Boolean hasIngressList();
    public KubeSchemaFluent.IngressListNested<A> withNewIngressList();
    public KubeSchemaFluent.IngressListNested<A> withNewIngressListLike(IngressList item);
    public KubeSchemaFluent.IngressListNested<A> editIngressList();
    public KubeSchemaFluent.IngressListNested<A> editOrNewIngressList();
    public KubeSchemaFluent.IngressListNested<A> editOrNewIngressListLike(IngressList item);
    
/**
 * This method has been deprecated, please use method buildInitializer instead.
 * @return The buildable object.
 */
@Deprecated public Initializer getInitializer();
    public Initializer buildInitializer();
    public A withInitializer(Initializer initializer);
    public Boolean hasInitializer();
    public A withNewInitializer(String name);
    public KubeSchemaFluent.InitializerNested<A> withNewInitializer();
    public KubeSchemaFluent.InitializerNested<A> withNewInitializerLike(Initializer item);
    public KubeSchemaFluent.InitializerNested<A> editInitializer();
    public KubeSchemaFluent.InitializerNested<A> editOrNewInitializer();
    public KubeSchemaFluent.InitializerNested<A> editOrNewInitializerLike(Initializer item);
    
/**
 * This method has been deprecated, please use method buildInitializers instead.
 * @return The buildable object.
 */
@Deprecated public Initializers getInitializers();
    public Initializers buildInitializers();
    public A withInitializers(Initializers initializers);
    public Boolean hasInitializers();
    public KubeSchemaFluent.InitializersNested<A> withNewInitializers();
    public KubeSchemaFluent.InitializersNested<A> withNewInitializersLike(Initializers item);
    public KubeSchemaFluent.InitializersNested<A> editInitializers();
    public KubeSchemaFluent.InitializersNested<A> editOrNewInitializers();
    public KubeSchemaFluent.InitializersNested<A> editOrNewInitializersLike(Initializers item);
    
/**
 * This method has been deprecated, please use method buildJSONSchemaPropsorStringArray instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrStringArray getJSONSchemaPropsorStringArray();
    public JSONSchemaPropsOrStringArray buildJSONSchemaPropsorStringArray();
    public A withJSONSchemaPropsorStringArray(JSONSchemaPropsOrStringArray jSONSchemaPropsorStringArray);
    public Boolean hasJSONSchemaPropsorStringArray();
    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> withNewJSONSchemaPropsorStringArray();
    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> withNewJSONSchemaPropsorStringArrayLike(JSONSchemaPropsOrStringArray item);
    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> editJSONSchemaPropsorStringArray();
    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> editOrNewJSONSchemaPropsorStringArray();
    public KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<A> editOrNewJSONSchemaPropsorStringArrayLike(JSONSchemaPropsOrStringArray item);
    
/**
 * This method has been deprecated, please use method buildJob instead.
 * @return The buildable object.
 */
@Deprecated public Job getJob();
    public Job buildJob();
    public A withJob(Job job);
    public Boolean hasJob();
    public KubeSchemaFluent.JobNested<A> withNewJob();
    public KubeSchemaFluent.JobNested<A> withNewJobLike(Job item);
    public KubeSchemaFluent.JobNested<A> editJob();
    public KubeSchemaFluent.JobNested<A> editOrNewJob();
    public KubeSchemaFluent.JobNested<A> editOrNewJobLike(Job item);
    
/**
 * This method has been deprecated, please use method buildJobList instead.
 * @return The buildable object.
 */
@Deprecated public JobList getJobList();
    public JobList buildJobList();
    public A withJobList(JobList jobList);
    public Boolean hasJobList();
    public KubeSchemaFluent.JobListNested<A> withNewJobList();
    public KubeSchemaFluent.JobListNested<A> withNewJobListLike(JobList item);
    public KubeSchemaFluent.JobListNested<A> editJobList();
    public KubeSchemaFluent.JobListNested<A> editOrNewJobList();
    public KubeSchemaFluent.JobListNested<A> editOrNewJobListLike(JobList item);
    
/**
 * This method has been deprecated, please use method buildK8sLocalSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public LocalSubjectAccessReview getK8sLocalSubjectAccessReview();
    public LocalSubjectAccessReview buildK8sLocalSubjectAccessReview();
    public A withK8sLocalSubjectAccessReview(LocalSubjectAccessReview k8sLocalSubjectAccessReview);
    public Boolean hasK8sLocalSubjectAccessReview();
    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> withNewK8sLocalSubjectAccessReview();
    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> withNewK8sLocalSubjectAccessReviewLike(LocalSubjectAccessReview item);
    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> editK8sLocalSubjectAccessReview();
    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> editOrNewK8sLocalSubjectAccessReview();
    public KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<A> editOrNewK8sLocalSubjectAccessReviewLike(LocalSubjectAccessReview item);
    
/**
 * This method has been deprecated, please use method buildK8sSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReview getK8sSubjectAccessReview();
    public SubjectAccessReview buildK8sSubjectAccessReview();
    public A withK8sSubjectAccessReview(SubjectAccessReview k8sSubjectAccessReview);
    public Boolean hasK8sSubjectAccessReview();
    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> withNewK8sSubjectAccessReview();
    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> withNewK8sSubjectAccessReviewLike(SubjectAccessReview item);
    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> editK8sSubjectAccessReview();
    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> editOrNewK8sSubjectAccessReview();
    public KubeSchemaFluent.K8sSubjectAccessReviewNested<A> editOrNewK8sSubjectAccessReviewLike(SubjectAccessReview item);
    
/**
 * This method has been deprecated, please use method buildLimitRangeList instead.
 * @return The buildable object.
 */
@Deprecated public LimitRangeList getLimitRangeList();
    public LimitRangeList buildLimitRangeList();
    public A withLimitRangeList(LimitRangeList limitRangeList);
    public Boolean hasLimitRangeList();
    public KubeSchemaFluent.LimitRangeListNested<A> withNewLimitRangeList();
    public KubeSchemaFluent.LimitRangeListNested<A> withNewLimitRangeListLike(LimitRangeList item);
    public KubeSchemaFluent.LimitRangeListNested<A> editLimitRangeList();
    public KubeSchemaFluent.LimitRangeListNested<A> editOrNewLimitRangeList();
    public KubeSchemaFluent.LimitRangeListNested<A> editOrNewLimitRangeListLike(LimitRangeList item);
    
/**
 * This method has been deprecated, please use method buildLocalSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.LocalSubjectAccessReview getLocalSubjectAccessReview();
    public io.fabric8.openshift.api.model.LocalSubjectAccessReview buildLocalSubjectAccessReview();
    public A withLocalSubjectAccessReview(io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReview);
    public Boolean hasLocalSubjectAccessReview();
    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> withNewModelLocalSubjectAccessReview();
    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> withNewLocalSubjectAccessReviewLike(io.fabric8.openshift.api.model.LocalSubjectAccessReview item);
    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> editModelLocalSubjectAccessReview();
    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> editOrNewLocalSubjectAccessReview();
    public KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<A> editOrNewLocalSubjectAccessReviewLike(io.fabric8.openshift.api.model.LocalSubjectAccessReview item);
    
/**
 * This method has been deprecated, please use method buildMutatingWebhookConfiguration instead.
 * @return The buildable object.
 */
@Deprecated public MutatingWebhookConfiguration getMutatingWebhookConfiguration();
    public MutatingWebhookConfiguration buildMutatingWebhookConfiguration();
    public A withMutatingWebhookConfiguration(MutatingWebhookConfiguration mutatingWebhookConfiguration);
    public Boolean hasMutatingWebhookConfiguration();
    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> withNewMutatingWebhookConfiguration();
    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> withNewMutatingWebhookConfigurationLike(MutatingWebhookConfiguration item);
    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> editMutatingWebhookConfiguration();
    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> editOrNewMutatingWebhookConfiguration();
    public KubeSchemaFluent.MutatingWebhookConfigurationNested<A> editOrNewMutatingWebhookConfigurationLike(MutatingWebhookConfiguration item);
    
/**
 * This method has been deprecated, please use method buildMutatingWebhookConfigurationList instead.
 * @return The buildable object.
 */
@Deprecated public MutatingWebhookConfigurationList getMutatingWebhookConfigurationList();
    public MutatingWebhookConfigurationList buildMutatingWebhookConfigurationList();
    public A withMutatingWebhookConfigurationList(MutatingWebhookConfigurationList mutatingWebhookConfigurationList);
    public Boolean hasMutatingWebhookConfigurationList();
    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> withNewMutatingWebhookConfigurationList();
    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> withNewMutatingWebhookConfigurationListLike(MutatingWebhookConfigurationList item);
    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> editMutatingWebhookConfigurationList();
    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> editOrNewMutatingWebhookConfigurationList();
    public KubeSchemaFluent.MutatingWebhookConfigurationListNested<A> editOrNewMutatingWebhookConfigurationListLike(MutatingWebhookConfigurationList item);
    
/**
 * This method has been deprecated, please use method buildNamespace instead.
 * @return The buildable object.
 */
@Deprecated public Namespace getNamespace();
    public Namespace buildNamespace();
    public A withNamespace(Namespace namespace);
    public Boolean hasNamespace();
    public KubeSchemaFluent.NamespaceNested<A> withNewNamespace();
    public KubeSchemaFluent.NamespaceNested<A> withNewNamespaceLike(Namespace item);
    public KubeSchemaFluent.NamespaceNested<A> editNamespace();
    public KubeSchemaFluent.NamespaceNested<A> editOrNewNamespace();
    public KubeSchemaFluent.NamespaceNested<A> editOrNewNamespaceLike(Namespace item);
    
/**
 * This method has been deprecated, please use method buildNamespaceList instead.
 * @return The buildable object.
 */
@Deprecated public NamespaceList getNamespaceList();
    public NamespaceList buildNamespaceList();
    public A withNamespaceList(NamespaceList namespaceList);
    public Boolean hasNamespaceList();
    public KubeSchemaFluent.NamespaceListNested<A> withNewNamespaceList();
    public KubeSchemaFluent.NamespaceListNested<A> withNewNamespaceListLike(NamespaceList item);
    public KubeSchemaFluent.NamespaceListNested<A> editNamespaceList();
    public KubeSchemaFluent.NamespaceListNested<A> editOrNewNamespaceList();
    public KubeSchemaFluent.NamespaceListNested<A> editOrNewNamespaceListLike(NamespaceList item);
    
/**
 * This method has been deprecated, please use method buildNetNameSpace instead.
 * @return The buildable object.
 */
@Deprecated public NetNamespace getNetNameSpace();
    public NetNamespace buildNetNameSpace();
    public A withNetNameSpace(NetNamespace netNameSpace);
    public Boolean hasNetNameSpace();
    public KubeSchemaFluent.NetNameSpaceNested<A> withNewNetNameSpace();
    public KubeSchemaFluent.NetNameSpaceNested<A> withNewNetNameSpaceLike(NetNamespace item);
    public KubeSchemaFluent.NetNameSpaceNested<A> editNetNameSpace();
    public KubeSchemaFluent.NetNameSpaceNested<A> editOrNewNetNameSpace();
    public KubeSchemaFluent.NetNameSpaceNested<A> editOrNewNetNameSpaceLike(NetNamespace item);
    
/**
 * This method has been deprecated, please use method buildNetNameSpaceList instead.
 * @return The buildable object.
 */
@Deprecated public NetNamespaceList getNetNameSpaceList();
    public NetNamespaceList buildNetNameSpaceList();
    public A withNetNameSpaceList(NetNamespaceList netNameSpaceList);
    public Boolean hasNetNameSpaceList();
    public KubeSchemaFluent.NetNameSpaceListNested<A> withNewNetNameSpaceList();
    public KubeSchemaFluent.NetNameSpaceListNested<A> withNewNetNameSpaceListLike(NetNamespaceList item);
    public KubeSchemaFluent.NetNameSpaceListNested<A> editNetNameSpaceList();
    public KubeSchemaFluent.NetNameSpaceListNested<A> editOrNewNetNameSpaceList();
    public KubeSchemaFluent.NetNameSpaceListNested<A> editOrNewNetNameSpaceListLike(NetNamespaceList item);
    
/**
 * This method has been deprecated, please use method buildNetworkPolicy instead.
 * @return The buildable object.
 */
@Deprecated public NetworkPolicy getNetworkPolicy();
    public NetworkPolicy buildNetworkPolicy();
    public A withNetworkPolicy(NetworkPolicy networkPolicy);
    public Boolean hasNetworkPolicy();
    public KubeSchemaFluent.NetworkPolicyNested<A> withNewNetworkPolicy();
    public KubeSchemaFluent.NetworkPolicyNested<A> withNewNetworkPolicyLike(NetworkPolicy item);
    public KubeSchemaFluent.NetworkPolicyNested<A> editNetworkPolicy();
    public KubeSchemaFluent.NetworkPolicyNested<A> editOrNewNetworkPolicy();
    public KubeSchemaFluent.NetworkPolicyNested<A> editOrNewNetworkPolicyLike(NetworkPolicy item);
    
/**
 * This method has been deprecated, please use method buildNetworkPolicyList instead.
 * @return The buildable object.
 */
@Deprecated public NetworkPolicyList getNetworkPolicyList();
    public NetworkPolicyList buildNetworkPolicyList();
    public A withNetworkPolicyList(NetworkPolicyList networkPolicyList);
    public Boolean hasNetworkPolicyList();
    public KubeSchemaFluent.NetworkPolicyListNested<A> withNewNetworkPolicyList();
    public KubeSchemaFluent.NetworkPolicyListNested<A> withNewNetworkPolicyListLike(NetworkPolicyList item);
    public KubeSchemaFluent.NetworkPolicyListNested<A> editNetworkPolicyList();
    public KubeSchemaFluent.NetworkPolicyListNested<A> editOrNewNetworkPolicyList();
    public KubeSchemaFluent.NetworkPolicyListNested<A> editOrNewNetworkPolicyListLike(NetworkPolicyList item);
    
/**
 * This method has been deprecated, please use method buildNode instead.
 * @return The buildable object.
 */
@Deprecated public Node getNode();
    public Node buildNode();
    public A withNode(Node node);
    public Boolean hasNode();
    public KubeSchemaFluent.NodeNested<A> withNewNode();
    public KubeSchemaFluent.NodeNested<A> withNewNodeLike(Node item);
    public KubeSchemaFluent.NodeNested<A> editNode();
    public KubeSchemaFluent.NodeNested<A> editOrNewNode();
    public KubeSchemaFluent.NodeNested<A> editOrNewNodeLike(Node item);
    
/**
 * This method has been deprecated, please use method buildNodeList instead.
 * @return The buildable object.
 */
@Deprecated public NodeList getNodeList();
    public NodeList buildNodeList();
    public A withNodeList(NodeList nodeList);
    public Boolean hasNodeList();
    public KubeSchemaFluent.NodeListNested<A> withNewNodeList();
    public KubeSchemaFluent.NodeListNested<A> withNewNodeListLike(NodeList item);
    public KubeSchemaFluent.NodeListNested<A> editNodeList();
    public KubeSchemaFluent.NodeListNested<A> editOrNewNodeList();
    public KubeSchemaFluent.NodeListNested<A> editOrNewNodeListLike(NodeList item);
    
/**
 * This method has been deprecated, please use method buildOAuthAccessToken instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAccessToken getOAuthAccessToken();
    public OAuthAccessToken buildOAuthAccessToken();
    public A withOAuthAccessToken(OAuthAccessToken oAuthAccessToken);
    public Boolean hasOAuthAccessToken();
    public KubeSchemaFluent.OAuthAccessTokenNested<A> withNewOAuthAccessToken();
    public KubeSchemaFluent.OAuthAccessTokenNested<A> withNewOAuthAccessTokenLike(OAuthAccessToken item);
    public KubeSchemaFluent.OAuthAccessTokenNested<A> editOAuthAccessToken();
    public KubeSchemaFluent.OAuthAccessTokenNested<A> editOrNewOAuthAccessToken();
    public KubeSchemaFluent.OAuthAccessTokenNested<A> editOrNewOAuthAccessTokenLike(OAuthAccessToken item);
    
/**
 * This method has been deprecated, please use method buildOAuthAccessTokenList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAccessTokenList getOAuthAccessTokenList();
    public OAuthAccessTokenList buildOAuthAccessTokenList();
    public A withOAuthAccessTokenList(OAuthAccessTokenList oAuthAccessTokenList);
    public Boolean hasOAuthAccessTokenList();
    public KubeSchemaFluent.OAuthAccessTokenListNested<A> withNewOAuthAccessTokenList();
    public KubeSchemaFluent.OAuthAccessTokenListNested<A> withNewOAuthAccessTokenListLike(OAuthAccessTokenList item);
    public KubeSchemaFluent.OAuthAccessTokenListNested<A> editOAuthAccessTokenList();
    public KubeSchemaFluent.OAuthAccessTokenListNested<A> editOrNewOAuthAccessTokenList();
    public KubeSchemaFluent.OAuthAccessTokenListNested<A> editOrNewOAuthAccessTokenListLike(OAuthAccessTokenList item);
    
/**
 * This method has been deprecated, please use method buildOAuthAuthorizeToken instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAuthorizeToken getOAuthAuthorizeToken();
    public OAuthAuthorizeToken buildOAuthAuthorizeToken();
    public A withOAuthAuthorizeToken(OAuthAuthorizeToken oAuthAuthorizeToken);
    public Boolean hasOAuthAuthorizeToken();
    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> withNewOAuthAuthorizeToken();
    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> withNewOAuthAuthorizeTokenLike(OAuthAuthorizeToken item);
    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> editOAuthAuthorizeToken();
    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> editOrNewOAuthAuthorizeToken();
    public KubeSchemaFluent.OAuthAuthorizeTokenNested<A> editOrNewOAuthAuthorizeTokenLike(OAuthAuthorizeToken item);
    
/**
 * This method has been deprecated, please use method buildOAuthAuthorizeTokenList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthAuthorizeTokenList getOAuthAuthorizeTokenList();
    public OAuthAuthorizeTokenList buildOAuthAuthorizeTokenList();
    public A withOAuthAuthorizeTokenList(OAuthAuthorizeTokenList oAuthAuthorizeTokenList);
    public Boolean hasOAuthAuthorizeTokenList();
    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> withNewOAuthAuthorizeTokenList();
    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> withNewOAuthAuthorizeTokenListLike(OAuthAuthorizeTokenList item);
    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> editOAuthAuthorizeTokenList();
    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> editOrNewOAuthAuthorizeTokenList();
    public KubeSchemaFluent.OAuthAuthorizeTokenListNested<A> editOrNewOAuthAuthorizeTokenListLike(OAuthAuthorizeTokenList item);
    
/**
 * This method has been deprecated, please use method buildOAuthClient instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClient getOAuthClient();
    public OAuthClient buildOAuthClient();
    public A withOAuthClient(OAuthClient oAuthClient);
    public Boolean hasOAuthClient();
    public KubeSchemaFluent.OAuthClientNested<A> withNewOAuthClient();
    public KubeSchemaFluent.OAuthClientNested<A> withNewOAuthClientLike(OAuthClient item);
    public KubeSchemaFluent.OAuthClientNested<A> editOAuthClient();
    public KubeSchemaFluent.OAuthClientNested<A> editOrNewOAuthClient();
    public KubeSchemaFluent.OAuthClientNested<A> editOrNewOAuthClientLike(OAuthClient item);
    
/**
 * This method has been deprecated, please use method buildOAuthClientAuthorization instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClientAuthorization getOAuthClientAuthorization();
    public OAuthClientAuthorization buildOAuthClientAuthorization();
    public A withOAuthClientAuthorization(OAuthClientAuthorization oAuthClientAuthorization);
    public Boolean hasOAuthClientAuthorization();
    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> withNewOAuthClientAuthorization();
    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> withNewOAuthClientAuthorizationLike(OAuthClientAuthorization item);
    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> editOAuthClientAuthorization();
    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> editOrNewOAuthClientAuthorization();
    public KubeSchemaFluent.OAuthClientAuthorizationNested<A> editOrNewOAuthClientAuthorizationLike(OAuthClientAuthorization item);
    
/**
 * This method has been deprecated, please use method buildOAuthClientAuthorizationList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClientAuthorizationList getOAuthClientAuthorizationList();
    public OAuthClientAuthorizationList buildOAuthClientAuthorizationList();
    public A withOAuthClientAuthorizationList(OAuthClientAuthorizationList oAuthClientAuthorizationList);
    public Boolean hasOAuthClientAuthorizationList();
    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> withNewOAuthClientAuthorizationList();
    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> withNewOAuthClientAuthorizationListLike(OAuthClientAuthorizationList item);
    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> editOAuthClientAuthorizationList();
    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> editOrNewOAuthClientAuthorizationList();
    public KubeSchemaFluent.OAuthClientAuthorizationListNested<A> editOrNewOAuthClientAuthorizationListLike(OAuthClientAuthorizationList item);
    
/**
 * This method has been deprecated, please use method buildOAuthClientList instead.
 * @return The buildable object.
 */
@Deprecated public OAuthClientList getOAuthClientList();
    public OAuthClientList buildOAuthClientList();
    public A withOAuthClientList(OAuthClientList oAuthClientList);
    public Boolean hasOAuthClientList();
    public KubeSchemaFluent.OAuthClientListNested<A> withNewOAuthClientList();
    public KubeSchemaFluent.OAuthClientListNested<A> withNewOAuthClientListLike(OAuthClientList item);
    public KubeSchemaFluent.OAuthClientListNested<A> editOAuthClientList();
    public KubeSchemaFluent.OAuthClientListNested<A> editOrNewOAuthClientList();
    public KubeSchemaFluent.OAuthClientListNested<A> editOrNewOAuthClientListLike(OAuthClientList item);
    
/**
 * This method has been deprecated, please use method buildObjectMeta instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getObjectMeta();
    public ObjectMeta buildObjectMeta();
    public A withObjectMeta(ObjectMeta objectMeta);
    public Boolean hasObjectMeta();
    public KubeSchemaFluent.ObjectMetaNested<A> withNewObjectMeta();
    public KubeSchemaFluent.ObjectMetaNested<A> withNewObjectMetaLike(ObjectMeta item);
    public KubeSchemaFluent.ObjectMetaNested<A> editObjectMeta();
    public KubeSchemaFluent.ObjectMetaNested<A> editOrNewObjectMeta();
    public KubeSchemaFluent.ObjectMetaNested<A> editOrNewObjectMetaLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftClusterRole instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRole getOpenshiftClusterRole();
    public OpenshiftClusterRole buildOpenshiftClusterRole();
    public A withOpenshiftClusterRole(OpenshiftClusterRole openshiftClusterRole);
    public Boolean hasOpenshiftClusterRole();
    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> withNewOpenshiftClusterRole();
    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> withNewOpenshiftClusterRoleLike(OpenshiftClusterRole item);
    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> editOpenshiftClusterRole();
    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> editOrNewOpenshiftClusterRole();
    public KubeSchemaFluent.OpenshiftClusterRoleNested<A> editOrNewOpenshiftClusterRoleLike(OpenshiftClusterRole item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftClusterRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRoleBinding getOpenshiftClusterRoleBinding();
    public OpenshiftClusterRoleBinding buildOpenshiftClusterRoleBinding();
    public A withOpenshiftClusterRoleBinding(OpenshiftClusterRoleBinding openshiftClusterRoleBinding);
    public Boolean hasOpenshiftClusterRoleBinding();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> withNewOpenshiftClusterRoleBinding();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> withNewOpenshiftClusterRoleBindingLike(OpenshiftClusterRoleBinding item);
    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> editOpenshiftClusterRoleBinding();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> editOrNewOpenshiftClusterRoleBinding();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingNested<A> editOrNewOpenshiftClusterRoleBindingLike(OpenshiftClusterRoleBinding item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftClusterRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRoleBindingList getOpenshiftClusterRoleBindingList();
    public OpenshiftClusterRoleBindingList buildOpenshiftClusterRoleBindingList();
    public A withOpenshiftClusterRoleBindingList(OpenshiftClusterRoleBindingList openshiftClusterRoleBindingList);
    public Boolean hasOpenshiftClusterRoleBindingList();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> withNewOpenshiftClusterRoleBindingList();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> withNewOpenshiftClusterRoleBindingListLike(OpenshiftClusterRoleBindingList item);
    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> editOpenshiftClusterRoleBindingList();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> editOrNewOpenshiftClusterRoleBindingList();
    public KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<A> editOrNewOpenshiftClusterRoleBindingListLike(OpenshiftClusterRoleBindingList item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftRole instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRole getOpenshiftRole();
    public OpenshiftRole buildOpenshiftRole();
    public A withOpenshiftRole(OpenshiftRole openshiftRole);
    public Boolean hasOpenshiftRole();
    public KubeSchemaFluent.OpenshiftRoleNested<A> withNewOpenshiftRole();
    public KubeSchemaFluent.OpenshiftRoleNested<A> withNewOpenshiftRoleLike(OpenshiftRole item);
    public KubeSchemaFluent.OpenshiftRoleNested<A> editOpenshiftRole();
    public KubeSchemaFluent.OpenshiftRoleNested<A> editOrNewOpenshiftRole();
    public KubeSchemaFluent.OpenshiftRoleNested<A> editOrNewOpenshiftRoleLike(OpenshiftRole item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBinding getOpenshiftRoleBinding();
    public OpenshiftRoleBinding buildOpenshiftRoleBinding();
    public A withOpenshiftRoleBinding(OpenshiftRoleBinding openshiftRoleBinding);
    public Boolean hasOpenshiftRoleBinding();
    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> withNewOpenshiftRoleBinding();
    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> withNewOpenshiftRoleBindingLike(OpenshiftRoleBinding item);
    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> editOpenshiftRoleBinding();
    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> editOrNewOpenshiftRoleBinding();
    public KubeSchemaFluent.OpenshiftRoleBindingNested<A> editOrNewOpenshiftRoleBindingLike(OpenshiftRoleBinding item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBindingList getOpenshiftRoleBindingList();
    public OpenshiftRoleBindingList buildOpenshiftRoleBindingList();
    public A withOpenshiftRoleBindingList(OpenshiftRoleBindingList openshiftRoleBindingList);
    public Boolean hasOpenshiftRoleBindingList();
    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> withNewOpenshiftRoleBindingList();
    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> withNewOpenshiftRoleBindingListLike(OpenshiftRoleBindingList item);
    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> editOpenshiftRoleBindingList();
    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> editOrNewOpenshiftRoleBindingList();
    public KubeSchemaFluent.OpenshiftRoleBindingListNested<A> editOrNewOpenshiftRoleBindingListLike(OpenshiftRoleBindingList item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleBindingRestriction instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBindingRestriction getOpenshiftRoleBindingRestriction();
    public OpenshiftRoleBindingRestriction buildOpenshiftRoleBindingRestriction();
    public A withOpenshiftRoleBindingRestriction(OpenshiftRoleBindingRestriction openshiftRoleBindingRestriction);
    public Boolean hasOpenshiftRoleBindingRestriction();
    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> withNewOpenshiftRoleBindingRestriction();
    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> withNewOpenshiftRoleBindingRestrictionLike(OpenshiftRoleBindingRestriction item);
    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> editOpenshiftRoleBindingRestriction();
    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> editOrNewOpenshiftRoleBindingRestriction();
    public KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<A> editOrNewOpenshiftRoleBindingRestrictionLike(OpenshiftRoleBindingRestriction item);
    
/**
 * This method has been deprecated, please use method buildOpenshiftRoleList instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleList getOpenshiftRoleList();
    public OpenshiftRoleList buildOpenshiftRoleList();
    public A withOpenshiftRoleList(OpenshiftRoleList openshiftRoleList);
    public Boolean hasOpenshiftRoleList();
    public KubeSchemaFluent.OpenshiftRoleListNested<A> withNewOpenshiftRoleList();
    public KubeSchemaFluent.OpenshiftRoleListNested<A> withNewOpenshiftRoleListLike(OpenshiftRoleList item);
    public KubeSchemaFluent.OpenshiftRoleListNested<A> editOpenshiftRoleList();
    public KubeSchemaFluent.OpenshiftRoleListNested<A> editOrNewOpenshiftRoleList();
    public KubeSchemaFluent.OpenshiftRoleListNested<A> editOrNewOpenshiftRoleListLike(OpenshiftRoleList item);
    public String getOperation();
    public A withOperation(String operation);
    public Boolean hasOperation();
    
/**
 * This method has been deprecated, please use method buildPatch instead.
 * @return The buildable object.
 */
@Deprecated public Patch getPatch();
    public Patch buildPatch();
    public A withPatch(Patch patch);
    public Boolean hasPatch();
    public KubeSchemaFluent.PatchNested<A> withNewPatch();
    public KubeSchemaFluent.PatchNested<A> withNewPatchLike(Patch item);
    public KubeSchemaFluent.PatchNested<A> editPatch();
    public KubeSchemaFluent.PatchNested<A> editOrNewPatch();
    public KubeSchemaFluent.PatchNested<A> editOrNewPatchLike(Patch item);
    public String getPatchType();
    public A withPatchType(String patchType);
    public Boolean hasPatchType();
    
/**
 * This method has been deprecated, please use method buildPersistentVolume instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolume getPersistentVolume();
    public PersistentVolume buildPersistentVolume();
    public A withPersistentVolume(PersistentVolume persistentVolume);
    public Boolean hasPersistentVolume();
    public KubeSchemaFluent.PersistentVolumeNested<A> withNewPersistentVolume();
    public KubeSchemaFluent.PersistentVolumeNested<A> withNewPersistentVolumeLike(PersistentVolume item);
    public KubeSchemaFluent.PersistentVolumeNested<A> editPersistentVolume();
    public KubeSchemaFluent.PersistentVolumeNested<A> editOrNewPersistentVolume();
    public KubeSchemaFluent.PersistentVolumeNested<A> editOrNewPersistentVolumeLike(PersistentVolume item);
    
/**
 * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaim getPersistentVolumeClaim();
    public PersistentVolumeClaim buildPersistentVolumeClaim();
    public A withPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim);
    public Boolean hasPersistentVolumeClaim();
    public KubeSchemaFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim();
    public KubeSchemaFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(PersistentVolumeClaim item);
    public KubeSchemaFluent.PersistentVolumeClaimNested<A> editPersistentVolumeClaim();
    public KubeSchemaFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim();
    public KubeSchemaFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(PersistentVolumeClaim item);
    
/**
 * This method has been deprecated, please use method buildPersistentVolumeClaimList instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimList getPersistentVolumeClaimList();
    public PersistentVolumeClaimList buildPersistentVolumeClaimList();
    public A withPersistentVolumeClaimList(PersistentVolumeClaimList persistentVolumeClaimList);
    public Boolean hasPersistentVolumeClaimList();
    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> withNewPersistentVolumeClaimList();
    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> withNewPersistentVolumeClaimListLike(PersistentVolumeClaimList item);
    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> editPersistentVolumeClaimList();
    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> editOrNewPersistentVolumeClaimList();
    public KubeSchemaFluent.PersistentVolumeClaimListNested<A> editOrNewPersistentVolumeClaimListLike(PersistentVolumeClaimList item);
    
/**
 * This method has been deprecated, please use method buildPersistentVolumeList instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeList getPersistentVolumeList();
    public PersistentVolumeList buildPersistentVolumeList();
    public A withPersistentVolumeList(PersistentVolumeList persistentVolumeList);
    public Boolean hasPersistentVolumeList();
    public KubeSchemaFluent.PersistentVolumeListNested<A> withNewPersistentVolumeList();
    public KubeSchemaFluent.PersistentVolumeListNested<A> withNewPersistentVolumeListLike(PersistentVolumeList item);
    public KubeSchemaFluent.PersistentVolumeListNested<A> editPersistentVolumeList();
    public KubeSchemaFluent.PersistentVolumeListNested<A> editOrNewPersistentVolumeList();
    public KubeSchemaFluent.PersistentVolumeListNested<A> editOrNewPersistentVolumeListLike(PersistentVolumeList item);
    
/**
 * This method has been deprecated, please use method buildPodDisruptionBudget instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudget getPodDisruptionBudget();
    public PodDisruptionBudget buildPodDisruptionBudget();
    public A withPodDisruptionBudget(PodDisruptionBudget podDisruptionBudget);
    public Boolean hasPodDisruptionBudget();
    public KubeSchemaFluent.PodDisruptionBudgetNested<A> withNewPodDisruptionBudget();
    public KubeSchemaFluent.PodDisruptionBudgetNested<A> withNewPodDisruptionBudgetLike(PodDisruptionBudget item);
    public KubeSchemaFluent.PodDisruptionBudgetNested<A> editPodDisruptionBudget();
    public KubeSchemaFluent.PodDisruptionBudgetNested<A> editOrNewPodDisruptionBudget();
    public KubeSchemaFluent.PodDisruptionBudgetNested<A> editOrNewPodDisruptionBudgetLike(PodDisruptionBudget item);
    
/**
 * This method has been deprecated, please use method buildPodDisruptionBudgetList instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudgetList getPodDisruptionBudgetList();
    public PodDisruptionBudgetList buildPodDisruptionBudgetList();
    public A withPodDisruptionBudgetList(PodDisruptionBudgetList podDisruptionBudgetList);
    public Boolean hasPodDisruptionBudgetList();
    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> withNewPodDisruptionBudgetList();
    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> withNewPodDisruptionBudgetListLike(PodDisruptionBudgetList item);
    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> editPodDisruptionBudgetList();
    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> editOrNewPodDisruptionBudgetList();
    public KubeSchemaFluent.PodDisruptionBudgetListNested<A> editOrNewPodDisruptionBudgetListLike(PodDisruptionBudgetList item);
    
/**
 * This method has been deprecated, please use method buildPodList instead.
 * @return The buildable object.
 */
@Deprecated public PodList getPodList();
    public PodList buildPodList();
    public A withPodList(PodList podList);
    public Boolean hasPodList();
    public KubeSchemaFluent.PodListNested<A> withNewPodList();
    public KubeSchemaFluent.PodListNested<A> withNewPodListLike(PodList item);
    public KubeSchemaFluent.PodListNested<A> editPodList();
    public KubeSchemaFluent.PodListNested<A> editOrNewPodList();
    public KubeSchemaFluent.PodListNested<A> editOrNewPodListLike(PodList item);
    
/**
 * This method has been deprecated, please use method buildPodPreset instead.
 * @return The buildable object.
 */
@Deprecated public PodPreset getPodPreset();
    public PodPreset buildPodPreset();
    public A withPodPreset(PodPreset podPreset);
    public Boolean hasPodPreset();
    public KubeSchemaFluent.PodPresetNested<A> withNewPodPreset();
    public KubeSchemaFluent.PodPresetNested<A> withNewPodPresetLike(PodPreset item);
    public KubeSchemaFluent.PodPresetNested<A> editPodPreset();
    public KubeSchemaFluent.PodPresetNested<A> editOrNewPodPreset();
    public KubeSchemaFluent.PodPresetNested<A> editOrNewPodPresetLike(PodPreset item);
    
/**
 * This method has been deprecated, please use method buildPodPresetList instead.
 * @return The buildable object.
 */
@Deprecated public PodPresetList getPodPresetList();
    public PodPresetList buildPodPresetList();
    public A withPodPresetList(PodPresetList podPresetList);
    public Boolean hasPodPresetList();
    public KubeSchemaFluent.PodPresetListNested<A> withNewPodPresetList();
    public KubeSchemaFluent.PodPresetListNested<A> withNewPodPresetListLike(PodPresetList item);
    public KubeSchemaFluent.PodPresetListNested<A> editPodPresetList();
    public KubeSchemaFluent.PodPresetListNested<A> editOrNewPodPresetList();
    public KubeSchemaFluent.PodPresetListNested<A> editOrNewPodPresetListLike(PodPresetList item);
    
/**
 * This method has been deprecated, please use method buildPodPresetSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodPresetSpec getPodPresetSpec();
    public PodPresetSpec buildPodPresetSpec();
    public A withPodPresetSpec(PodPresetSpec podPresetSpec);
    public Boolean hasPodPresetSpec();
    public KubeSchemaFluent.PodPresetSpecNested<A> withNewPodPresetSpec();
    public KubeSchemaFluent.PodPresetSpecNested<A> withNewPodPresetSpecLike(PodPresetSpec item);
    public KubeSchemaFluent.PodPresetSpecNested<A> editPodPresetSpec();
    public KubeSchemaFluent.PodPresetSpecNested<A> editOrNewPodPresetSpec();
    public KubeSchemaFluent.PodPresetSpecNested<A> editOrNewPodPresetSpecLike(PodPresetSpec item);
    
/**
 * This method has been deprecated, please use method buildPodSecurityPolicy instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityPolicy getPodSecurityPolicy();
    public PodSecurityPolicy buildPodSecurityPolicy();
    public A withPodSecurityPolicy(PodSecurityPolicy podSecurityPolicy);
    public Boolean hasPodSecurityPolicy();
    public KubeSchemaFluent.PodSecurityPolicyNested<A> withNewPodSecurityPolicy();
    public KubeSchemaFluent.PodSecurityPolicyNested<A> withNewPodSecurityPolicyLike(PodSecurityPolicy item);
    public KubeSchemaFluent.PodSecurityPolicyNested<A> editPodSecurityPolicy();
    public KubeSchemaFluent.PodSecurityPolicyNested<A> editOrNewPodSecurityPolicy();
    public KubeSchemaFluent.PodSecurityPolicyNested<A> editOrNewPodSecurityPolicyLike(PodSecurityPolicy item);
    
/**
 * This method has been deprecated, please use method buildPodSecurityPolicyList instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityPolicyList getPodSecurityPolicyList();
    public PodSecurityPolicyList buildPodSecurityPolicyList();
    public A withPodSecurityPolicyList(PodSecurityPolicyList podSecurityPolicyList);
    public Boolean hasPodSecurityPolicyList();
    public KubeSchemaFluent.PodSecurityPolicyListNested<A> withNewPodSecurityPolicyList();
    public KubeSchemaFluent.PodSecurityPolicyListNested<A> withNewPodSecurityPolicyListLike(PodSecurityPolicyList item);
    public KubeSchemaFluent.PodSecurityPolicyListNested<A> editPodSecurityPolicyList();
    public KubeSchemaFluent.PodSecurityPolicyListNested<A> editOrNewPodSecurityPolicyList();
    public KubeSchemaFluent.PodSecurityPolicyListNested<A> editOrNewPodSecurityPolicyListLike(PodSecurityPolicyList item);
    
/**
 * This method has been deprecated, please use method buildPodTemplateList instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateList getPodTemplateList();
    public PodTemplateList buildPodTemplateList();
    public A withPodTemplateList(PodTemplateList podTemplateList);
    public Boolean hasPodTemplateList();
    public KubeSchemaFluent.PodTemplateListNested<A> withNewPodTemplateList();
    public KubeSchemaFluent.PodTemplateListNested<A> withNewPodTemplateListLike(PodTemplateList item);
    public KubeSchemaFluent.PodTemplateListNested<A> editPodTemplateList();
    public KubeSchemaFluent.PodTemplateListNested<A> editOrNewPodTemplateList();
    public KubeSchemaFluent.PodTemplateListNested<A> editOrNewPodTemplateListLike(PodTemplateList item);
    
/**
 * This method has been deprecated, please use method buildPriorityClass instead.
 * @return The buildable object.
 */
@Deprecated public PriorityClass getPriorityClass();
    public PriorityClass buildPriorityClass();
    public A withPriorityClass(PriorityClass priorityClass);
    public Boolean hasPriorityClass();
    public KubeSchemaFluent.PriorityClassNested<A> withNewPriorityClass();
    public KubeSchemaFluent.PriorityClassNested<A> withNewPriorityClassLike(PriorityClass item);
    public KubeSchemaFluent.PriorityClassNested<A> editPriorityClass();
    public KubeSchemaFluent.PriorityClassNested<A> editOrNewPriorityClass();
    public KubeSchemaFluent.PriorityClassNested<A> editOrNewPriorityClassLike(PriorityClass item);
    
/**
 * This method has been deprecated, please use method buildPriorityClassList instead.
 * @return The buildable object.
 */
@Deprecated public PriorityClassList getPriorityClassList();
    public PriorityClassList buildPriorityClassList();
    public A withPriorityClassList(PriorityClassList priorityClassList);
    public Boolean hasPriorityClassList();
    public KubeSchemaFluent.PriorityClassListNested<A> withNewPriorityClassList();
    public KubeSchemaFluent.PriorityClassListNested<A> withNewPriorityClassListLike(PriorityClassList item);
    public KubeSchemaFluent.PriorityClassListNested<A> editPriorityClassList();
    public KubeSchemaFluent.PriorityClassListNested<A> editOrNewPriorityClassList();
    public KubeSchemaFluent.PriorityClassListNested<A> editOrNewPriorityClassListLike(PriorityClassList item);
    
/**
 * This method has been deprecated, please use method buildProject instead.
 * @return The buildable object.
 */
@Deprecated public Project getProject();
    public Project buildProject();
    public A withProject(Project project);
    public Boolean hasProject();
    public KubeSchemaFluent.ProjectNested<A> withNewProject();
    public KubeSchemaFluent.ProjectNested<A> withNewProjectLike(Project item);
    public KubeSchemaFluent.ProjectNested<A> editProject();
    public KubeSchemaFluent.ProjectNested<A> editOrNewProject();
    public KubeSchemaFluent.ProjectNested<A> editOrNewProjectLike(Project item);
    
/**
 * This method has been deprecated, please use method buildProjectList instead.
 * @return The buildable object.
 */
@Deprecated public ProjectList getProjectList();
    public ProjectList buildProjectList();
    public A withProjectList(ProjectList projectList);
    public Boolean hasProjectList();
    public KubeSchemaFluent.ProjectListNested<A> withNewProjectList();
    public KubeSchemaFluent.ProjectListNested<A> withNewProjectListLike(ProjectList item);
    public KubeSchemaFluent.ProjectListNested<A> editProjectList();
    public KubeSchemaFluent.ProjectListNested<A> editOrNewProjectList();
    public KubeSchemaFluent.ProjectListNested<A> editOrNewProjectListLike(ProjectList item);
    
/**
 * This method has been deprecated, please use method buildProjectRequest instead.
 * @return The buildable object.
 */
@Deprecated public ProjectRequest getProjectRequest();
    public ProjectRequest buildProjectRequest();
    public A withProjectRequest(ProjectRequest projectRequest);
    public Boolean hasProjectRequest();
    public KubeSchemaFluent.ProjectRequestNested<A> withNewProjectRequest();
    public KubeSchemaFluent.ProjectRequestNested<A> withNewProjectRequestLike(ProjectRequest item);
    public KubeSchemaFluent.ProjectRequestNested<A> editProjectRequest();
    public KubeSchemaFluent.ProjectRequestNested<A> editOrNewProjectRequest();
    public KubeSchemaFluent.ProjectRequestNested<A> editOrNewProjectRequestLike(ProjectRequest item);
    
/**
 * This method has been deprecated, please use method buildQuantity instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getQuantity();
    public Quantity buildQuantity();
    public A withQuantity(Quantity quantity);
    public Boolean hasQuantity();
    public A withNewQuantity(String amount,String format);
    public A withNewQuantity(String amount);
    public KubeSchemaFluent.QuantityNested<A> withNewQuantity();
    public KubeSchemaFluent.QuantityNested<A> withNewQuantityLike(Quantity item);
    public KubeSchemaFluent.QuantityNested<A> editQuantity();
    public KubeSchemaFluent.QuantityNested<A> editOrNewQuantity();
    public KubeSchemaFluent.QuantityNested<A> editOrNewQuantityLike(Quantity item);
    
/**
 * This method has been deprecated, please use method buildReplicaSet instead.
 * @return The buildable object.
 */
@Deprecated public ReplicaSet getReplicaSet();
    public ReplicaSet buildReplicaSet();
    public A withReplicaSet(ReplicaSet replicaSet);
    public Boolean hasReplicaSet();
    public KubeSchemaFluent.ReplicaSetNested<A> withNewReplicaSet();
    public KubeSchemaFluent.ReplicaSetNested<A> withNewReplicaSetLike(ReplicaSet item);
    public KubeSchemaFluent.ReplicaSetNested<A> editReplicaSet();
    public KubeSchemaFluent.ReplicaSetNested<A> editOrNewReplicaSet();
    public KubeSchemaFluent.ReplicaSetNested<A> editOrNewReplicaSetLike(ReplicaSet item);
    
/**
 * This method has been deprecated, please use method buildReplicaSetList instead.
 * @return The buildable object.
 */
@Deprecated public ReplicaSetList getReplicaSetList();
    public ReplicaSetList buildReplicaSetList();
    public A withReplicaSetList(ReplicaSetList replicaSetList);
    public Boolean hasReplicaSetList();
    public KubeSchemaFluent.ReplicaSetListNested<A> withNewReplicaSetList();
    public KubeSchemaFluent.ReplicaSetListNested<A> withNewReplicaSetListLike(ReplicaSetList item);
    public KubeSchemaFluent.ReplicaSetListNested<A> editReplicaSetList();
    public KubeSchemaFluent.ReplicaSetListNested<A> editOrNewReplicaSetList();
    public KubeSchemaFluent.ReplicaSetListNested<A> editOrNewReplicaSetListLike(ReplicaSetList item);
    
/**
 * This method has been deprecated, please use method buildReplicationControllerList instead.
 * @return The buildable object.
 */
@Deprecated public ReplicationControllerList getReplicationControllerList();
    public ReplicationControllerList buildReplicationControllerList();
    public A withReplicationControllerList(ReplicationControllerList replicationControllerList);
    public Boolean hasReplicationControllerList();
    public KubeSchemaFluent.ReplicationControllerListNested<A> withNewReplicationControllerList();
    public KubeSchemaFluent.ReplicationControllerListNested<A> withNewReplicationControllerListLike(ReplicationControllerList item);
    public KubeSchemaFluent.ReplicationControllerListNested<A> editReplicationControllerList();
    public KubeSchemaFluent.ReplicationControllerListNested<A> editOrNewReplicationControllerList();
    public KubeSchemaFluent.ReplicationControllerListNested<A> editOrNewReplicationControllerListLike(ReplicationControllerList item);
    
/**
 * This method has been deprecated, please use method buildResourceQuota instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuota getResourceQuota();
    public ResourceQuota buildResourceQuota();
    public A withResourceQuota(ResourceQuota resourceQuota);
    public Boolean hasResourceQuota();
    public KubeSchemaFluent.ResourceQuotaNested<A> withNewResourceQuota();
    public KubeSchemaFluent.ResourceQuotaNested<A> withNewResourceQuotaLike(ResourceQuota item);
    public KubeSchemaFluent.ResourceQuotaNested<A> editResourceQuota();
    public KubeSchemaFluent.ResourceQuotaNested<A> editOrNewResourceQuota();
    public KubeSchemaFluent.ResourceQuotaNested<A> editOrNewResourceQuotaLike(ResourceQuota item);
    
/**
 * This method has been deprecated, please use method buildResourceQuotaList instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuotaList getResourceQuotaList();
    public ResourceQuotaList buildResourceQuotaList();
    public A withResourceQuotaList(ResourceQuotaList resourceQuotaList);
    public Boolean hasResourceQuotaList();
    public KubeSchemaFluent.ResourceQuotaListNested<A> withNewResourceQuotaList();
    public KubeSchemaFluent.ResourceQuotaListNested<A> withNewResourceQuotaListLike(ResourceQuotaList item);
    public KubeSchemaFluent.ResourceQuotaListNested<A> editResourceQuotaList();
    public KubeSchemaFluent.ResourceQuotaListNested<A> editOrNewResourceQuotaList();
    public KubeSchemaFluent.ResourceQuotaListNested<A> editOrNewResourceQuotaListLike(ResourceQuotaList item);
    
/**
 * This method has been deprecated, please use method buildRole instead.
 * @return The buildable object.
 */
@Deprecated public Role getRole();
    public Role buildRole();
    public A withRole(Role role);
    public Boolean hasRole();
    public KubeSchemaFluent.RoleNested<A> withNewRole();
    public KubeSchemaFluent.RoleNested<A> withNewRoleLike(Role item);
    public KubeSchemaFluent.RoleNested<A> editRole();
    public KubeSchemaFluent.RoleNested<A> editOrNewRole();
    public KubeSchemaFluent.RoleNested<A> editOrNewRoleLike(Role item);
    
/**
 * This method has been deprecated, please use method buildRoleBinding instead.
 * @return The buildable object.
 */
@Deprecated public RoleBinding getRoleBinding();
    public RoleBinding buildRoleBinding();
    public A withRoleBinding(RoleBinding roleBinding);
    public Boolean hasRoleBinding();
    public KubeSchemaFluent.RoleBindingNested<A> withNewRoleBinding();
    public KubeSchemaFluent.RoleBindingNested<A> withNewRoleBindingLike(RoleBinding item);
    public KubeSchemaFluent.RoleBindingNested<A> editRoleBinding();
    public KubeSchemaFluent.RoleBindingNested<A> editOrNewRoleBinding();
    public KubeSchemaFluent.RoleBindingNested<A> editOrNewRoleBindingLike(RoleBinding item);
    
/**
 * This method has been deprecated, please use method buildRoleBindingList instead.
 * @return The buildable object.
 */
@Deprecated public RoleBindingList getRoleBindingList();
    public RoleBindingList buildRoleBindingList();
    public A withRoleBindingList(RoleBindingList roleBindingList);
    public Boolean hasRoleBindingList();
    public KubeSchemaFluent.RoleBindingListNested<A> withNewRoleBindingList();
    public KubeSchemaFluent.RoleBindingListNested<A> withNewRoleBindingListLike(RoleBindingList item);
    public KubeSchemaFluent.RoleBindingListNested<A> editRoleBindingList();
    public KubeSchemaFluent.RoleBindingListNested<A> editOrNewRoleBindingList();
    public KubeSchemaFluent.RoleBindingListNested<A> editOrNewRoleBindingListLike(RoleBindingList item);
    
/**
 * This method has been deprecated, please use method buildRoleList instead.
 * @return The buildable object.
 */
@Deprecated public RoleList getRoleList();
    public RoleList buildRoleList();
    public A withRoleList(RoleList roleList);
    public Boolean hasRoleList();
    public KubeSchemaFluent.RoleListNested<A> withNewRoleList();
    public KubeSchemaFluent.RoleListNested<A> withNewRoleListLike(RoleList item);
    public KubeSchemaFluent.RoleListNested<A> editRoleList();
    public KubeSchemaFluent.RoleListNested<A> editOrNewRoleList();
    public KubeSchemaFluent.RoleListNested<A> editOrNewRoleListLike(RoleList item);
    
/**
 * This method has been deprecated, please use method buildRootPaths instead.
 * @return The buildable object.
 */
@Deprecated public RootPaths getRootPaths();
    public RootPaths buildRootPaths();
    public A withRootPaths(RootPaths rootPaths);
    public Boolean hasRootPaths();
    public KubeSchemaFluent.RootPathsNested<A> withNewRootPaths();
    public KubeSchemaFluent.RootPathsNested<A> withNewRootPathsLike(RootPaths item);
    public KubeSchemaFluent.RootPathsNested<A> editRootPaths();
    public KubeSchemaFluent.RootPathsNested<A> editOrNewRootPaths();
    public KubeSchemaFluent.RootPathsNested<A> editOrNewRootPathsLike(RootPaths item);
    
/**
 * This method has been deprecated, please use method buildRoute instead.
 * @return The buildable object.
 */
@Deprecated public Route getRoute();
    public Route buildRoute();
    public A withRoute(Route route);
    public Boolean hasRoute();
    public KubeSchemaFluent.RouteNested<A> withNewRoute();
    public KubeSchemaFluent.RouteNested<A> withNewRouteLike(Route item);
    public KubeSchemaFluent.RouteNested<A> editRoute();
    public KubeSchemaFluent.RouteNested<A> editOrNewRoute();
    public KubeSchemaFluent.RouteNested<A> editOrNewRouteLike(Route item);
    
/**
 * This method has been deprecated, please use method buildRouteList instead.
 * @return The buildable object.
 */
@Deprecated public RouteList getRouteList();
    public RouteList buildRouteList();
    public A withRouteList(RouteList routeList);
    public Boolean hasRouteList();
    public KubeSchemaFluent.RouteListNested<A> withNewRouteList();
    public KubeSchemaFluent.RouteListNested<A> withNewRouteListLike(RouteList item);
    public KubeSchemaFluent.RouteListNested<A> editRouteList();
    public KubeSchemaFluent.RouteListNested<A> editOrNewRouteList();
    public KubeSchemaFluent.RouteListNested<A> editOrNewRouteListLike(RouteList item);
    
/**
 * This method has been deprecated, please use method buildRule instead.
 * @return The buildable object.
 */
@Deprecated public Rule getRule();
    public Rule buildRule();
    public A withRule(Rule rule);
    public Boolean hasRule();
    public KubeSchemaFluent.RuleNested<A> withNewRule();
    public KubeSchemaFluent.RuleNested<A> withNewRuleLike(Rule item);
    public KubeSchemaFluent.RuleNested<A> editRule();
    public KubeSchemaFluent.RuleNested<A> editOrNewRule();
    public KubeSchemaFluent.RuleNested<A> editOrNewRuleLike(Rule item);
    
/**
 * This method has been deprecated, please use method buildRuleWithOperations instead.
 * @return The buildable object.
 */
@Deprecated public RuleWithOperations getRuleWithOperations();
    public RuleWithOperations buildRuleWithOperations();
    public A withRuleWithOperations(RuleWithOperations ruleWithOperations);
    public Boolean hasRuleWithOperations();
    public KubeSchemaFluent.RuleWithOperationsNested<A> withNewRuleWithOperations();
    public KubeSchemaFluent.RuleWithOperationsNested<A> withNewRuleWithOperationsLike(RuleWithOperations item);
    public KubeSchemaFluent.RuleWithOperationsNested<A> editRuleWithOperations();
    public KubeSchemaFluent.RuleWithOperationsNested<A> editOrNewRuleWithOperations();
    public KubeSchemaFluent.RuleWithOperationsNested<A> editOrNewRuleWithOperationsLike(RuleWithOperations item);
    
/**
 * This method has been deprecated, please use method buildScale instead.
 * @return The buildable object.
 */
@Deprecated public Scale getScale();
    public Scale buildScale();
    public A withScale(Scale scale);
    public Boolean hasScale();
    public KubeSchemaFluent.ScaleNested<A> withNewScale();
    public KubeSchemaFluent.ScaleNested<A> withNewScaleLike(Scale item);
    public KubeSchemaFluent.ScaleNested<A> editScale();
    public KubeSchemaFluent.ScaleNested<A> editOrNewScale();
    public KubeSchemaFluent.ScaleNested<A> editOrNewScaleLike(Scale item);
    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public Secret getSecret();
    public Secret buildSecret();
    public A withSecret(Secret secret);
    public Boolean hasSecret();
    public KubeSchemaFluent.SecretNested<A> withNewSecret();
    public KubeSchemaFluent.SecretNested<A> withNewSecretLike(Secret item);
    public KubeSchemaFluent.SecretNested<A> editSecret();
    public KubeSchemaFluent.SecretNested<A> editOrNewSecret();
    public KubeSchemaFluent.SecretNested<A> editOrNewSecretLike(Secret item);
    
/**
 * This method has been deprecated, please use method buildSecretList instead.
 * @return The buildable object.
 */
@Deprecated public SecretList getSecretList();
    public SecretList buildSecretList();
    public A withSecretList(SecretList secretList);
    public Boolean hasSecretList();
    public KubeSchemaFluent.SecretListNested<A> withNewSecretList();
    public KubeSchemaFluent.SecretListNested<A> withNewSecretListLike(SecretList item);
    public KubeSchemaFluent.SecretListNested<A> editSecretList();
    public KubeSchemaFluent.SecretListNested<A> editOrNewSecretList();
    public KubeSchemaFluent.SecretListNested<A> editOrNewSecretListLike(SecretList item);
    
/**
 * This method has been deprecated, please use method buildSecurityContextConstraints instead.
 * @return The buildable object.
 */
@Deprecated public SecurityContextConstraints getSecurityContextConstraints();
    public SecurityContextConstraints buildSecurityContextConstraints();
    public A withSecurityContextConstraints(SecurityContextConstraints securityContextConstraints);
    public Boolean hasSecurityContextConstraints();
    public KubeSchemaFluent.SecurityContextConstraintsNested<A> withNewSecurityContextConstraints();
    public KubeSchemaFluent.SecurityContextConstraintsNested<A> withNewSecurityContextConstraintsLike(SecurityContextConstraints item);
    public KubeSchemaFluent.SecurityContextConstraintsNested<A> editSecurityContextConstraints();
    public KubeSchemaFluent.SecurityContextConstraintsNested<A> editOrNewSecurityContextConstraints();
    public KubeSchemaFluent.SecurityContextConstraintsNested<A> editOrNewSecurityContextConstraintsLike(SecurityContextConstraints item);
    
/**
 * This method has been deprecated, please use method buildSecurityContextConstraintsList instead.
 * @return The buildable object.
 */
@Deprecated public SecurityContextConstraintsList getSecurityContextConstraintsList();
    public SecurityContextConstraintsList buildSecurityContextConstraintsList();
    public A withSecurityContextConstraintsList(SecurityContextConstraintsList securityContextConstraintsList);
    public Boolean hasSecurityContextConstraintsList();
    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> withNewSecurityContextConstraintsList();
    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> withNewSecurityContextConstraintsListLike(SecurityContextConstraintsList item);
    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> editSecurityContextConstraintsList();
    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> editOrNewSecurityContextConstraintsList();
    public KubeSchemaFluent.SecurityContextConstraintsListNested<A> editOrNewSecurityContextConstraintsListLike(SecurityContextConstraintsList item);
    
/**
 * This method has been deprecated, please use method buildServiceAccount instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccount getServiceAccount();
    public ServiceAccount buildServiceAccount();
    public A withServiceAccount(ServiceAccount serviceAccount);
    public Boolean hasServiceAccount();
    public KubeSchemaFluent.ServiceAccountNested<A> withNewServiceAccount();
    public KubeSchemaFluent.ServiceAccountNested<A> withNewServiceAccountLike(ServiceAccount item);
    public KubeSchemaFluent.ServiceAccountNested<A> editServiceAccount();
    public KubeSchemaFluent.ServiceAccountNested<A> editOrNewServiceAccount();
    public KubeSchemaFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(ServiceAccount item);
    
/**
 * This method has been deprecated, please use method buildServiceAccountList instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccountList getServiceAccountList();
    public ServiceAccountList buildServiceAccountList();
    public A withServiceAccountList(ServiceAccountList serviceAccountList);
    public Boolean hasServiceAccountList();
    public KubeSchemaFluent.ServiceAccountListNested<A> withNewServiceAccountList();
    public KubeSchemaFluent.ServiceAccountListNested<A> withNewServiceAccountListLike(ServiceAccountList item);
    public KubeSchemaFluent.ServiceAccountListNested<A> editServiceAccountList();
    public KubeSchemaFluent.ServiceAccountListNested<A> editOrNewServiceAccountList();
    public KubeSchemaFluent.ServiceAccountListNested<A> editOrNewServiceAccountListLike(ServiceAccountList item);
    
/**
 * This method has been deprecated, please use method buildServiceList instead.
 * @return The buildable object.
 */
@Deprecated public ServiceList getServiceList();
    public ServiceList buildServiceList();
    public A withServiceList(ServiceList serviceList);
    public Boolean hasServiceList();
    public KubeSchemaFluent.ServiceListNested<A> withNewServiceList();
    public KubeSchemaFluent.ServiceListNested<A> withNewServiceListLike(ServiceList item);
    public KubeSchemaFluent.ServiceListNested<A> editServiceList();
    public KubeSchemaFluent.ServiceListNested<A> editOrNewServiceList();
    public KubeSchemaFluent.ServiceListNested<A> editOrNewServiceListLike(ServiceList item);
    
/**
 * This method has been deprecated, please use method buildStatefulSet instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSet getStatefulSet();
    public StatefulSet buildStatefulSet();
    public A withStatefulSet(StatefulSet statefulSet);
    public Boolean hasStatefulSet();
    public KubeSchemaFluent.StatefulSetNested<A> withNewStatefulSet();
    public KubeSchemaFluent.StatefulSetNested<A> withNewStatefulSetLike(StatefulSet item);
    public KubeSchemaFluent.StatefulSetNested<A> editStatefulSet();
    public KubeSchemaFluent.StatefulSetNested<A> editOrNewStatefulSet();
    public KubeSchemaFluent.StatefulSetNested<A> editOrNewStatefulSetLike(StatefulSet item);
    
/**
 * This method has been deprecated, please use method buildStatefulSetList instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetList getStatefulSetList();
    public StatefulSetList buildStatefulSetList();
    public A withStatefulSetList(StatefulSetList statefulSetList);
    public Boolean hasStatefulSetList();
    public KubeSchemaFluent.StatefulSetListNested<A> withNewStatefulSetList();
    public KubeSchemaFluent.StatefulSetListNested<A> withNewStatefulSetListLike(StatefulSetList item);
    public KubeSchemaFluent.StatefulSetListNested<A> editStatefulSetList();
    public KubeSchemaFluent.StatefulSetListNested<A> editOrNewStatefulSetList();
    public KubeSchemaFluent.StatefulSetListNested<A> editOrNewStatefulSetListLike(StatefulSetList item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus();
    public Status buildStatus();
    public A withStatus(Status status);
    public Boolean hasStatus();
    public KubeSchemaFluent.StatusNested<A> withNewStatus();
    public KubeSchemaFluent.StatusNested<A> withNewStatusLike(Status item);
    public KubeSchemaFluent.StatusNested<A> editStatus();
    public KubeSchemaFluent.StatusNested<A> editOrNewStatus();
    public KubeSchemaFluent.StatusNested<A> editOrNewStatusLike(Status item);
    
/**
 * This method has been deprecated, please use method buildStorageClass instead.
 * @return The buildable object.
 */
@Deprecated public StorageClass getStorageClass();
    public StorageClass buildStorageClass();
    public A withStorageClass(StorageClass storageClass);
    public Boolean hasStorageClass();
    public KubeSchemaFluent.StorageClassNested<A> withNewStorageClass();
    public KubeSchemaFluent.StorageClassNested<A> withNewStorageClassLike(StorageClass item);
    public KubeSchemaFluent.StorageClassNested<A> editStorageClass();
    public KubeSchemaFluent.StorageClassNested<A> editOrNewStorageClass();
    public KubeSchemaFluent.StorageClassNested<A> editOrNewStorageClassLike(StorageClass item);
    
/**
 * This method has been deprecated, please use method buildStorageClassList instead.
 * @return The buildable object.
 */
@Deprecated public StorageClassList getStorageClassList();
    public StorageClassList buildStorageClassList();
    public A withStorageClassList(StorageClassList storageClassList);
    public Boolean hasStorageClassList();
    public KubeSchemaFluent.StorageClassListNested<A> withNewStorageClassList();
    public KubeSchemaFluent.StorageClassListNested<A> withNewStorageClassListLike(StorageClassList item);
    public KubeSchemaFluent.StorageClassListNested<A> editStorageClassList();
    public KubeSchemaFluent.StorageClassListNested<A> editOrNewStorageClassList();
    public KubeSchemaFluent.StorageClassListNested<A> editOrNewStorageClassListLike(StorageClassList item);
    
/**
 * This method has been deprecated, please use method buildSubjectAccessReview instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.SubjectAccessReview getSubjectAccessReview();
    public io.fabric8.openshift.api.model.SubjectAccessReview buildSubjectAccessReview();
    public A withSubjectAccessReview(io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReview);
    public Boolean hasSubjectAccessReview();
    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> withNewModelSubjectAccessReview();
    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> withNewSubjectAccessReviewLike(io.fabric8.openshift.api.model.SubjectAccessReview item);
    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> editModelSubjectAccessReview();
    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> editOrNewSubjectAccessReview();
    public KubeSchemaFluent.ModelSubjectAccessReviewNested<A> editOrNewSubjectAccessReviewLike(io.fabric8.openshift.api.model.SubjectAccessReview item);
    
/**
 * This method has been deprecated, please use method buildSubjectAccessReviewResponse instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReviewResponse getSubjectAccessReviewResponse();
    public SubjectAccessReviewResponse buildSubjectAccessReviewResponse();
    public A withSubjectAccessReviewResponse(SubjectAccessReviewResponse subjectAccessReviewResponse);
    public Boolean hasSubjectAccessReviewResponse();
    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> withNewSubjectAccessReviewResponse();
    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> withNewSubjectAccessReviewResponseLike(SubjectAccessReviewResponse item);
    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> editSubjectAccessReviewResponse();
    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> editOrNewSubjectAccessReviewResponse();
    public KubeSchemaFluent.SubjectAccessReviewResponseNested<A> editOrNewSubjectAccessReviewResponseLike(SubjectAccessReviewResponse item);
    
/**
 * This method has been deprecated, please use method buildTagEvent instead.
 * @return The buildable object.
 */
@Deprecated public TagEvent getTagEvent();
    public TagEvent buildTagEvent();
    public A withTagEvent(TagEvent tagEvent);
    public Boolean hasTagEvent();
    public A withNewTagEvent(String created,String dockerImageReference,Long generation,String image);
    public KubeSchemaFluent.TagEventNested<A> withNewTagEvent();
    public KubeSchemaFluent.TagEventNested<A> withNewTagEventLike(TagEvent item);
    public KubeSchemaFluent.TagEventNested<A> editTagEvent();
    public KubeSchemaFluent.TagEventNested<A> editOrNewTagEvent();
    public KubeSchemaFluent.TagEventNested<A> editOrNewTagEventLike(TagEvent item);
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public Template getTemplate();
    public Template buildTemplate();
    public A withTemplate(Template template);
    public Boolean hasTemplate();
    public KubeSchemaFluent.TemplateNested<A> withNewTemplate();
    public KubeSchemaFluent.TemplateNested<A> withNewTemplateLike(Template item);
    public KubeSchemaFluent.TemplateNested<A> editTemplate();
    public KubeSchemaFluent.TemplateNested<A> editOrNewTemplate();
    public KubeSchemaFluent.TemplateNested<A> editOrNewTemplateLike(Template item);
    
/**
 * This method has been deprecated, please use method buildTemplateList instead.
 * @return The buildable object.
 */
@Deprecated public TemplateList getTemplateList();
    public TemplateList buildTemplateList();
    public A withTemplateList(TemplateList templateList);
    public Boolean hasTemplateList();
    public KubeSchemaFluent.TemplateListNested<A> withNewTemplateList();
    public KubeSchemaFluent.TemplateListNested<A> withNewTemplateListLike(TemplateList item);
    public KubeSchemaFluent.TemplateListNested<A> editTemplateList();
    public KubeSchemaFluent.TemplateListNested<A> editOrNewTemplateList();
    public KubeSchemaFluent.TemplateListNested<A> editOrNewTemplateListLike(TemplateList item);
    
/**
 * This method has been deprecated, please use method buildTokenReview instead.
 * @return The buildable object.
 */
@Deprecated public TokenReview getTokenReview();
    public TokenReview buildTokenReview();
    public A withTokenReview(TokenReview tokenReview);
    public Boolean hasTokenReview();
    public KubeSchemaFluent.TokenReviewNested<A> withNewTokenReview();
    public KubeSchemaFluent.TokenReviewNested<A> withNewTokenReviewLike(TokenReview item);
    public KubeSchemaFluent.TokenReviewNested<A> editTokenReview();
    public KubeSchemaFluent.TokenReviewNested<A> editOrNewTokenReview();
    public KubeSchemaFluent.TokenReviewNested<A> editOrNewTokenReviewLike(TokenReview item);
    
/**
 * This method has been deprecated, please use method buildToleration instead.
 * @return The buildable object.
 */
@Deprecated public Toleration getToleration();
    public Toleration buildToleration();
    public A withToleration(Toleration toleration);
    public Boolean hasToleration();
    public A withNewToleration(String effect,String key,String operator,Long tolerationSeconds,String value);
    public KubeSchemaFluent.TolerationNested<A> withNewToleration();
    public KubeSchemaFluent.TolerationNested<A> withNewTolerationLike(Toleration item);
    public KubeSchemaFluent.TolerationNested<A> editToleration();
    public KubeSchemaFluent.TolerationNested<A> editOrNewToleration();
    public KubeSchemaFluent.TolerationNested<A> editOrNewTolerationLike(Toleration item);
    
/**
 * This method has been deprecated, please use method buildTypeMeta instead.
 * @return The buildable object.
 */
@Deprecated public TypeMeta getTypeMeta();
    public TypeMeta buildTypeMeta();
    public A withTypeMeta(TypeMeta typeMeta);
    public Boolean hasTypeMeta();
    public A withNewTypeMeta(String apiVersion,String kind);
    public KubeSchemaFluent.TypeMetaNested<A> withNewTypeMeta();
    public KubeSchemaFluent.TypeMetaNested<A> withNewTypeMetaLike(TypeMeta item);
    public KubeSchemaFluent.TypeMetaNested<A> editTypeMeta();
    public KubeSchemaFluent.TypeMetaNested<A> editOrNewTypeMeta();
    public KubeSchemaFluent.TypeMetaNested<A> editOrNewTypeMetaLike(TypeMeta item);
    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public User getUser();
    public User buildUser();
    public A withUser(User user);
    public Boolean hasUser();
    public KubeSchemaFluent.UserNested<A> withNewUser();
    public KubeSchemaFluent.UserNested<A> withNewUserLike(User item);
    public KubeSchemaFluent.UserNested<A> editUser();
    public KubeSchemaFluent.UserNested<A> editOrNewUser();
    public KubeSchemaFluent.UserNested<A> editOrNewUserLike(User item);
    
/**
 * This method has been deprecated, please use method buildUserList instead.
 * @return The buildable object.
 */
@Deprecated public UserList getUserList();
    public UserList buildUserList();
    public A withUserList(UserList userList);
    public Boolean hasUserList();
    public KubeSchemaFluent.UserListNested<A> withNewUserList();
    public KubeSchemaFluent.UserListNested<A> withNewUserListLike(UserList item);
    public KubeSchemaFluent.UserListNested<A> editUserList();
    public KubeSchemaFluent.UserListNested<A> editOrNewUserList();
    public KubeSchemaFluent.UserListNested<A> editOrNewUserListLike(UserList item);
    
/**
 * This method has been deprecated, please use method buildValidatingWebhookConfiguration instead.
 * @return The buildable object.
 */
@Deprecated public ValidatingWebhookConfiguration getValidatingWebhookConfiguration();
    public ValidatingWebhookConfiguration buildValidatingWebhookConfiguration();
    public A withValidatingWebhookConfiguration(ValidatingWebhookConfiguration validatingWebhookConfiguration);
    public Boolean hasValidatingWebhookConfiguration();
    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> withNewValidatingWebhookConfiguration();
    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> withNewValidatingWebhookConfigurationLike(ValidatingWebhookConfiguration item);
    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> editValidatingWebhookConfiguration();
    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> editOrNewValidatingWebhookConfiguration();
    public KubeSchemaFluent.ValidatingWebhookConfigurationNested<A> editOrNewValidatingWebhookConfigurationLike(ValidatingWebhookConfiguration item);
    
/**
 * This method has been deprecated, please use method buildValidatingWebhookConfigurationList instead.
 * @return The buildable object.
 */
@Deprecated public ValidatingWebhookConfigurationList getValidatingWebhookConfigurationList();
    public ValidatingWebhookConfigurationList buildValidatingWebhookConfigurationList();
    public A withValidatingWebhookConfigurationList(ValidatingWebhookConfigurationList validatingWebhookConfigurationList);
    public Boolean hasValidatingWebhookConfigurationList();
    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> withNewValidatingWebhookConfigurationList();
    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> withNewValidatingWebhookConfigurationListLike(ValidatingWebhookConfigurationList item);
    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> editValidatingWebhookConfigurationList();
    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> editOrNewValidatingWebhookConfigurationList();
    public KubeSchemaFluent.ValidatingWebhookConfigurationListNested<A> editOrNewValidatingWebhookConfigurationListLike(ValidatingWebhookConfigurationList item);
    
/**
 * This method has been deprecated, please use method buildWatchEvent instead.
 * @return The buildable object.
 */
@Deprecated public WatchEvent getWatchEvent();
    public WatchEvent buildWatchEvent();
    public A withWatchEvent(WatchEvent watchEvent);
    public Boolean hasWatchEvent();
    public KubeSchemaFluent.WatchEventNested<A> withNewWatchEvent();
    public KubeSchemaFluent.WatchEventNested<A> withNewWatchEventLike(WatchEvent item);
    public KubeSchemaFluent.WatchEventNested<A> editWatchEvent();
    public KubeSchemaFluent.WatchEventNested<A> editOrNewWatchEvent();
    public KubeSchemaFluent.WatchEventNested<A> editOrNewWatchEventLike(WatchEvent item);

    public interface AdmissionRequestNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionRequestFluent<KubeSchemaFluent.AdmissionRequestNested<N>>{

        
    public N and();    public N endAdmissionRequest();
}
    public interface AdmissionResponseNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionResponseFluent<KubeSchemaFluent.AdmissionResponseNested<N>>{

        
    public N and();    public N endAdmissionResponse();
}
    public interface AdmissionReviewNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionReviewFluent<KubeSchemaFluent.AdmissionReviewNested<N>>{

        
    public N and();    public N endAdmissionReview();
}
    public interface AdmissionWebhookNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebhookFluent<KubeSchemaFluent.AdmissionWebhookNested<N>>{

        
    public N and();    public N endAdmissionWebhook();
}
    public interface AggregationRuleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AggregationRuleFluent<KubeSchemaFluent.AggregationRuleNested<N>>{

        
    public N and();    public N endAggregationRule();
}
    public interface BaseKubernetesListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BaseKubernetesListFluent<KubeSchemaFluent.BaseKubernetesListNested<N>>{

        
    public N and();    public N endBaseKubernetesList();
}
    public interface BindingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<KubeSchemaFluent.BindingNested<N>>{

        
    public N and();    public N endBinding();
}
    public interface BuildConfigListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigListFluent<KubeSchemaFluent.BuildConfigListNested<N>>{

        
    public N and();    public N endBuildConfigList();
}
    public interface BuildListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildListFluent<KubeSchemaFluent.BuildListNested<N>>{

        
    public N and();    public N endBuildList();
}
    public interface BuildRequestNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<KubeSchemaFluent.BuildRequestNested<N>>{

        
    public N and();    public N endBuildRequest();
}
    public interface CertificateSigningRequestNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<KubeSchemaFluent.CertificateSigningRequestNested<N>>{

        
    public N and();    public N endCertificateSigningRequest();
}
    public interface CertificateSigningRequestConditionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestConditionFluent<KubeSchemaFluent.CertificateSigningRequestConditionNested<N>>{

        
    public N and();    public N endCertificateSigningRequestCondition();
}
    public interface CertificateSigningRequestListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestListFluent<KubeSchemaFluent.CertificateSigningRequestListNested<N>>{

        
    public N and();    public N endCertificateSigningRequestList();
}
    public interface CertificateSigningRequestSpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestSpecFluent<KubeSchemaFluent.CertificateSigningRequestSpecNested<N>>{

        
    public N and();    public N endCertificateSigningRequestSpec();
}
    public interface CertificateSigningRequestStatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestStatusFluent<KubeSchemaFluent.CertificateSigningRequestStatusNested<N>>{

        
    public N and();    public N endCertificateSigningRequestStatus();
}
    public interface ClusterRoleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<KubeSchemaFluent.ClusterRoleNested<N>>{

        
    public N and();    public N endClusterRole();
}
    public interface ClusterRoleBindingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<KubeSchemaFluent.ClusterRoleBindingNested<N>>{

        
    public N and();    public N endClusterRoleBinding();
}
    public interface ClusterRoleBindingListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingListFluent<KubeSchemaFluent.ClusterRoleBindingListNested<N>>{

        
    public N and();    public N endClusterRoleBindingList();
}
    public interface ClusterRoleListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleListFluent<KubeSchemaFluent.ClusterRoleListNested<N>>{

        
    public N and();    public N endClusterRoleList();
}
    public interface ComponentStatusListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusListFluent<KubeSchemaFluent.ComponentStatusListNested<N>>{

        
    public N and();    public N endComponentStatusList();
}
    public interface ConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigFluent<KubeSchemaFluent.ConfigNested<N>>{

        
    public N and();    public N endConfig();
}
    public interface ConfigMapNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<KubeSchemaFluent.ConfigMapNested<N>>{

        
    public N and();    public N endConfigMap();
}
    public interface ConfigMapListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapListFluent<KubeSchemaFluent.ConfigMapListNested<N>>{

        
    public N and();    public N endConfigMapList();
}
    public interface ContainerStatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStatusFluent<KubeSchemaFluent.ContainerStatusNested<N>>{

        
    public N and();    public N endContainerStatus();
}
    public interface CronJobNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<KubeSchemaFluent.CronJobNested<N>>{

        
    public N and();    public N endCronJob();
}
    public interface CronJobListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobListFluent<KubeSchemaFluent.CronJobListNested<N>>{

        
    public N and();    public N endCronJobList();
}
    public interface CustomResourceDefinitionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<KubeSchemaFluent.CustomResourceDefinitionNested<N>>{

        
    public N and();    public N endCustomResourceDefinition();
}
    public interface CustomResourceDefinitionConditionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionConditionFluent<KubeSchemaFluent.CustomResourceDefinitionConditionNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionCondition();
}
    public interface CustomResourceDefinitionListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionListFluent<KubeSchemaFluent.CustomResourceDefinitionListNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionList();
}
    public interface CustomResourceDefinitionNamesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionNamesFluent<KubeSchemaFluent.CustomResourceDefinitionNamesNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionNames();
}
    public interface CustomResourceDefinitionSpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionSpecFluent<KubeSchemaFluent.CustomResourceDefinitionSpecNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionSpec();
}
    public interface CustomResourceDefinitionStatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionStatusFluent<KubeSchemaFluent.CustomResourceDefinitionStatusNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionStatus();
}
    public interface DaemonSetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<KubeSchemaFluent.DaemonSetNested<N>>{

        
    public N and();    public N endDaemonSet();
}
    public interface DaemonSetListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetListFluent<KubeSchemaFluent.DaemonSetListNested<N>>{

        
    public N and();    public N endDaemonSetList();
}
    public interface DeleteOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeleteOptionsFluent<KubeSchemaFluent.DeleteOptionsNested<N>>{

        
    public N and();    public N endDeleteOptions();
}
    public interface DeploymentNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<KubeSchemaFluent.DeploymentNested<N>>{

        
    public N and();    public N endDeployment();
}
    public interface DeploymentConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<KubeSchemaFluent.DeploymentConfigNested<N>>{

        
    public N and();    public N endDeploymentConfig();
}
    public interface DeploymentConfigListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigListFluent<KubeSchemaFluent.DeploymentConfigListNested<N>>{

        
    public N and();    public N endDeploymentConfigList();
}
    public interface DeploymentListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentListFluent<KubeSchemaFluent.DeploymentListNested<N>>{

        
    public N and();    public N endDeploymentList();
}
    public interface DeploymentRollbackNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentRollbackFluent<KubeSchemaFluent.DeploymentRollbackNested<N>>{

        
    public N and();    public N endDeploymentRollback();
}
    public interface EndpointsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<KubeSchemaFluent.EndpointsNested<N>>{

        
    public N and();    public N endEndpoints();
}
    public interface EndpointsListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsListFluent<KubeSchemaFluent.EndpointsListNested<N>>{

        
    public N and();    public N endEndpointsList();
}
    public interface EnvVarNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<KubeSchemaFluent.EnvVarNested<N>>{

        
    public N and();    public N endEnvVar();
}
    public interface EventsEventNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<KubeSchemaFluent.EventsEventNested<N>>{

        
    public N and();    public N endEventsEvent();
}
    public interface EventListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventListFluent<KubeSchemaFluent.EventListNested<N>>{

        
    public N and();    public N endEventList();
}
    public interface EventsEventSeriesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventSeriesFluent<KubeSchemaFluent.EventsEventSeriesNested<N>>{

        
    public N and();    public N endEventsEventSeries();
}
    public interface GroupNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<KubeSchemaFluent.GroupNested<N>>{

        
    public N and();    public N endGroup();
}
    public interface GroupListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupListFluent<KubeSchemaFluent.GroupListNested<N>>{

        
    public N and();    public N endGroupList();
}
    public interface HorizontalPodAutoscalerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<KubeSchemaFluent.HorizontalPodAutoscalerNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscaler();
}
    public interface HorizontalPodAutoscalerListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerListFluent<KubeSchemaFluent.HorizontalPodAutoscalerListNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerList();
}
    public interface IdentityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<KubeSchemaFluent.IdentityNested<N>>{

        
    public N and();    public N endIdentity();
}
    public interface IdentityListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityListFluent<KubeSchemaFluent.IdentityListNested<N>>{

        
    public N and();    public N endIdentityList();
}
    public interface ImageListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageListFluent<KubeSchemaFluent.ImageListNested<N>>{

        
    public N and();    public N endImageList();
}
    public interface ImageStreamImportNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<KubeSchemaFluent.ImageStreamImportNested<N>>{

        
    public N and();    public N endImageStreamImport();
}
    public interface ImageStreamListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamListFluent<KubeSchemaFluent.ImageStreamListNested<N>>{

        
    public N and();    public N endImageStreamList();
}
    public interface ImageStreamTagListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagListFluent<KubeSchemaFluent.ImageStreamTagListNested<N>>{

        
    public N and();    public N endImageStreamTagList();
}
    public interface InfoNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InfoFluent<KubeSchemaFluent.InfoNested<N>>{

        
    public N and();    public N endInfo();
}
    public interface IngressNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<KubeSchemaFluent.IngressNested<N>>{

        
    public N and();    public N endIngress();
}
    public interface IngressListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressListFluent<KubeSchemaFluent.IngressListNested<N>>{

        
    public N and();    public N endIngressList();
}
    public interface InitializerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InitializerFluent<KubeSchemaFluent.InitializerNested<N>>{

        
    public N and();    public N endInitializer();
}
    public interface InitializersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InitializersFluent<KubeSchemaFluent.InitializersNested<N>>{

        
    public N and();    public N endInitializers();
}
    public interface JSONSchemaPropsorStringArrayNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrStringArrayFluent<KubeSchemaFluent.JSONSchemaPropsorStringArrayNested<N>>{

        
    public N and();    public N endJSONSchemaPropsorStringArray();
}
    public interface JobNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<KubeSchemaFluent.JobNested<N>>{

        
    public N and();    public N endJob();
}
    public interface JobListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobListFluent<KubeSchemaFluent.JobListNested<N>>{

        
    public N and();    public N endJobList();
}
    public interface K8sLocalSubjectAccessReviewNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<KubeSchemaFluent.K8sLocalSubjectAccessReviewNested<N>>{

        
    public N and();    public N endK8sLocalSubjectAccessReview();
}
    public interface K8sSubjectAccessReviewNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewFluent<KubeSchemaFluent.K8sSubjectAccessReviewNested<N>>{

        
    public N and();    public N endK8sSubjectAccessReview();
}
    public interface LimitRangeListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeListFluent<KubeSchemaFluent.LimitRangeListNested<N>>{

        
    public N and();    public N endLimitRangeList();
}
    public interface ModelLocalSubjectAccessReviewNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluent<KubeSchemaFluent.ModelLocalSubjectAccessReviewNested<N>>{

        
    public N and();    public N endModelLocalSubjectAccessReview();
}
    public interface MutatingWebhookConfigurationNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<KubeSchemaFluent.MutatingWebhookConfigurationNested<N>>{

        
    public N and();    public N endMutatingWebhookConfiguration();
}
    public interface MutatingWebhookConfigurationListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationListFluent<KubeSchemaFluent.MutatingWebhookConfigurationListNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationList();
}
    public interface NamespaceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<KubeSchemaFluent.NamespaceNested<N>>{

        
    public N and();    public N endNamespace();
}
    public interface NamespaceListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceListFluent<KubeSchemaFluent.NamespaceListNested<N>>{

        
    public N and();    public N endNamespaceList();
}
    public interface NetNameSpaceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<KubeSchemaFluent.NetNameSpaceNested<N>>{

        
    public N and();    public N endNetNameSpace();
}
    public interface NetNameSpaceListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceListFluent<KubeSchemaFluent.NetNameSpaceListNested<N>>{

        
    public N and();    public N endNetNameSpaceList();
}
    public interface NetworkPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<KubeSchemaFluent.NetworkPolicyNested<N>>{

        
    public N and();    public N endNetworkPolicy();
}
    public interface NetworkPolicyListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyListFluent<KubeSchemaFluent.NetworkPolicyListNested<N>>{

        
    public N and();    public N endNetworkPolicyList();
}
    public interface NodeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<KubeSchemaFluent.NodeNested<N>>{

        
    public N and();    public N endNode();
}
    public interface NodeListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeListFluent<KubeSchemaFluent.NodeListNested<N>>{

        
    public N and();    public N endNodeList();
}
    public interface OAuthAccessTokenNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<KubeSchemaFluent.OAuthAccessTokenNested<N>>{

        
    public N and();    public N endOAuthAccessToken();
}
    public interface OAuthAccessTokenListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenListFluent<KubeSchemaFluent.OAuthAccessTokenListNested<N>>{

        
    public N and();    public N endOAuthAccessTokenList();
}
    public interface OAuthAuthorizeTokenNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<KubeSchemaFluent.OAuthAuthorizeTokenNested<N>>{

        
    public N and();    public N endOAuthAuthorizeToken();
}
    public interface OAuthAuthorizeTokenListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenListFluent<KubeSchemaFluent.OAuthAuthorizeTokenListNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenList();
}
    public interface OAuthClientNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<KubeSchemaFluent.OAuthClientNested<N>>{

        
    public N and();    public N endOAuthClient();
}
    public interface OAuthClientAuthorizationNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<KubeSchemaFluent.OAuthClientAuthorizationNested<N>>{

        
    public N and();    public N endOAuthClientAuthorization();
}
    public interface OAuthClientAuthorizationListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationListFluent<KubeSchemaFluent.OAuthClientAuthorizationListNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationList();
}
    public interface OAuthClientListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientListFluent<KubeSchemaFluent.OAuthClientListNested<N>>{

        
    public N and();    public N endOAuthClientList();
}
    public interface ObjectMetaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<KubeSchemaFluent.ObjectMetaNested<N>>{

        
    public N and();    public N endObjectMeta();
}
    public interface OpenshiftClusterRoleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<KubeSchemaFluent.OpenshiftClusterRoleNested<N>>{

        
    public N and();    public N endOpenshiftClusterRole();
}
    public interface OpenshiftClusterRoleBindingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<KubeSchemaFluent.OpenshiftClusterRoleBindingNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBinding();
}
    public interface OpenshiftClusterRoleBindingListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingListFluent<KubeSchemaFluent.OpenshiftClusterRoleBindingListNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingList();
}
    public interface OpenshiftRoleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<KubeSchemaFluent.OpenshiftRoleNested<N>>{

        
    public N and();    public N endOpenshiftRole();
}
    public interface OpenshiftRoleBindingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<KubeSchemaFluent.OpenshiftRoleBindingNested<N>>{

        
    public N and();    public N endOpenshiftRoleBinding();
}
    public interface OpenshiftRoleBindingListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingListFluent<KubeSchemaFluent.OpenshiftRoleBindingListNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingList();
}
    public interface OpenshiftRoleBindingRestrictionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<KubeSchemaFluent.OpenshiftRoleBindingRestrictionNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestriction();
}
    public interface OpenshiftRoleListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleListFluent<KubeSchemaFluent.OpenshiftRoleListNested<N>>{

        
    public N and();    public N endOpenshiftRoleList();
}
    public interface PatchNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PatchFluent<KubeSchemaFluent.PatchNested<N>>{

        
    public N and();    public N endPatch();
}
    public interface PersistentVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<KubeSchemaFluent.PersistentVolumeNested<N>>{

        
    public N and();    public N endPersistentVolume();
}
    public interface PersistentVolumeClaimNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<KubeSchemaFluent.PersistentVolumeClaimNested<N>>{

        
    public N and();    public N endPersistentVolumeClaim();
}
    public interface PersistentVolumeClaimListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimListFluent<KubeSchemaFluent.PersistentVolumeClaimListNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimList();
}
    public interface PersistentVolumeListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeListFluent<KubeSchemaFluent.PersistentVolumeListNested<N>>{

        
    public N and();    public N endPersistentVolumeList();
}
    public interface PodDisruptionBudgetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<KubeSchemaFluent.PodDisruptionBudgetNested<N>>{

        
    public N and();    public N endPodDisruptionBudget();
}
    public interface PodDisruptionBudgetListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetListFluent<KubeSchemaFluent.PodDisruptionBudgetListNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetList();
}
    public interface PodListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodListFluent<KubeSchemaFluent.PodListNested<N>>{

        
    public N and();    public N endPodList();
}
    public interface PodPresetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<KubeSchemaFluent.PodPresetNested<N>>{

        
    public N and();    public N endPodPreset();
}
    public interface PodPresetListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetListFluent<KubeSchemaFluent.PodPresetListNested<N>>{

        
    public N and();    public N endPodPresetList();
}
    public interface PodPresetSpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetSpecFluent<KubeSchemaFluent.PodPresetSpecNested<N>>{

        
    public N and();    public N endPodPresetSpec();
}
    public interface PodSecurityPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<KubeSchemaFluent.PodSecurityPolicyNested<N>>{

        
    public N and();    public N endPodSecurityPolicy();
}
    public interface PodSecurityPolicyListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyListFluent<KubeSchemaFluent.PodSecurityPolicyListNested<N>>{

        
    public N and();    public N endPodSecurityPolicyList();
}
    public interface PodTemplateListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateListFluent<KubeSchemaFluent.PodTemplateListNested<N>>{

        
    public N and();    public N endPodTemplateList();
}
    public interface PriorityClassNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<KubeSchemaFluent.PriorityClassNested<N>>{

        
    public N and();    public N endPriorityClass();
}
    public interface PriorityClassListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassListFluent<KubeSchemaFluent.PriorityClassListNested<N>>{

        
    public N and();    public N endPriorityClassList();
}
    public interface ProjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<KubeSchemaFluent.ProjectNested<N>>{

        
    public N and();    public N endProject();
}
    public interface ProjectListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectListFluent<KubeSchemaFluent.ProjectListNested<N>>{

        
    public N and();    public N endProjectList();
}
    public interface ProjectRequestNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<KubeSchemaFluent.ProjectRequestNested<N>>{

        
    public N and();    public N endProjectRequest();
}
    public interface QuantityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<KubeSchemaFluent.QuantityNested<N>>{

        
    public N and();    public N endQuantity();
}
    public interface ReplicaSetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<KubeSchemaFluent.ReplicaSetNested<N>>{

        
    public N and();    public N endReplicaSet();
}
    public interface ReplicaSetListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetListFluent<KubeSchemaFluent.ReplicaSetListNested<N>>{

        
    public N and();    public N endReplicaSetList();
}
    public interface ReplicationControllerListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerListFluent<KubeSchemaFluent.ReplicationControllerListNested<N>>{

        
    public N and();    public N endReplicationControllerList();
}
    public interface ResourceQuotaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<KubeSchemaFluent.ResourceQuotaNested<N>>{

        
    public N and();    public N endResourceQuota();
}
    public interface ResourceQuotaListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaListFluent<KubeSchemaFluent.ResourceQuotaListNested<N>>{

        
    public N and();    public N endResourceQuotaList();
}
    public interface RoleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<KubeSchemaFluent.RoleNested<N>>{

        
    public N and();    public N endRole();
}
    public interface RoleBindingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<KubeSchemaFluent.RoleBindingNested<N>>{

        
    public N and();    public N endRoleBinding();
}
    public interface RoleBindingListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingListFluent<KubeSchemaFluent.RoleBindingListNested<N>>{

        
    public N and();    public N endRoleBindingList();
}
    public interface RoleListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleListFluent<KubeSchemaFluent.RoleListNested<N>>{

        
    public N and();    public N endRoleList();
}
    public interface RootPathsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RootPathsFluent<KubeSchemaFluent.RootPathsNested<N>>{

        
    public N and();    public N endRootPaths();
}
    public interface RouteNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<KubeSchemaFluent.RouteNested<N>>{

        
    public N and();    public N endRoute();
}
    public interface RouteListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteListFluent<KubeSchemaFluent.RouteListNested<N>>{

        
    public N and();    public N endRouteList();
}
    public interface RuleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RuleFluent<KubeSchemaFluent.RuleNested<N>>{

        
    public N and();    public N endRule();
}
    public interface RuleWithOperationsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RuleWithOperationsFluent<KubeSchemaFluent.RuleWithOperationsNested<N>>{

        
    public N and();    public N endRuleWithOperations();
}
    public interface ScaleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<KubeSchemaFluent.ScaleNested<N>>{

        
    public N and();    public N endScale();
}
    public interface SecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<KubeSchemaFluent.SecretNested<N>>{

        
    public N and();    public N endSecret();
}
    public interface SecretListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretListFluent<KubeSchemaFluent.SecretListNested<N>>{

        
    public N and();    public N endSecretList();
}
    public interface SecurityContextConstraintsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<KubeSchemaFluent.SecurityContextConstraintsNested<N>>{

        
    public N and();    public N endSecurityContextConstraints();
}
    public interface SecurityContextConstraintsListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsListFluent<KubeSchemaFluent.SecurityContextConstraintsListNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsList();
}
    public interface ServiceAccountNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<KubeSchemaFluent.ServiceAccountNested<N>>{

        
    public N and();    public N endServiceAccount();
}
    public interface ServiceAccountListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountListFluent<KubeSchemaFluent.ServiceAccountListNested<N>>{

        
    public N and();    public N endServiceAccountList();
}
    public interface ServiceListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceListFluent<KubeSchemaFluent.ServiceListNested<N>>{

        
    public N and();    public N endServiceList();
}
    public interface StatefulSetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<KubeSchemaFluent.StatefulSetNested<N>>{

        
    public N and();    public N endStatefulSet();
}
    public interface StatefulSetListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetListFluent<KubeSchemaFluent.StatefulSetListNested<N>>{

        
    public N and();    public N endStatefulSetList();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusFluent<KubeSchemaFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}
    public interface StorageClassNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<KubeSchemaFluent.StorageClassNested<N>>{

        
    public N and();    public N endStorageClass();
}
    public interface StorageClassListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassListFluent<KubeSchemaFluent.StorageClassListNested<N>>{

        
    public N and();    public N endStorageClassList();
}
    public interface ModelSubjectAccessReviewNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.SubjectAccessReviewFluent<KubeSchemaFluent.ModelSubjectAccessReviewNested<N>>{

        
    public N and();    public N endModelSubjectAccessReview();
}
    public interface SubjectAccessReviewResponseNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewResponseFluent<KubeSchemaFluent.SubjectAccessReviewResponseNested<N>>{

        
    public N and();    public N endSubjectAccessReviewResponse();
}
    public interface TagEventNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagEventFluent<KubeSchemaFluent.TagEventNested<N>>{

        
    public N and();    public N endTagEvent();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<KubeSchemaFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}
    public interface TemplateListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateListFluent<KubeSchemaFluent.TemplateListNested<N>>{

        
    public N and();    public N endTemplateList();
}
    public interface TokenReviewNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<KubeSchemaFluent.TokenReviewNested<N>>{

        
    public N and();    public N endTokenReview();
}
    public interface TolerationNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TolerationFluent<KubeSchemaFluent.TolerationNested<N>>{

        
    public N and();    public N endToleration();
}
    public interface TypeMetaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TypeMetaFluent<KubeSchemaFluent.TypeMetaNested<N>>{

        
    public N and();    public N endTypeMeta();
}
    public interface UserNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<KubeSchemaFluent.UserNested<N>>{

        
    public N and();    public N endUser();
}
    public interface UserListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserListFluent<KubeSchemaFluent.UserListNested<N>>{

        
    public N and();    public N endUserList();
}
    public interface ValidatingWebhookConfigurationNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<KubeSchemaFluent.ValidatingWebhookConfigurationNested<N>>{

        
    public N and();    public N endValidatingWebhookConfiguration();
}
    public interface ValidatingWebhookConfigurationListNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationListFluent<KubeSchemaFluent.ValidatingWebhookConfigurationListNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationList();
}
    public interface WatchEventNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WatchEventFluent<KubeSchemaFluent.WatchEventNested<N>>{

        
    public N and();    public N endWatchEvent();
}


}
