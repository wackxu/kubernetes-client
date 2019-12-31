
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse;
import io.fabric8.kubernetes.api.model.admission.AdmissionReview;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList;
import io.fabric8.kubernetes.api.model.admissionregistration.Rule;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperations;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList;
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.kubernetes.api.model.apps.DaemonSetList;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.kubernetes.api.model.apps.StatefulSetList;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.batch.CronJobList;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.batch.JobList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestCondition;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus;
import io.fabric8.kubernetes.api.model.events.Event;
import io.fabric8.kubernetes.api.model.events.EventSeries;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.extensions.IngressList;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList;
import io.fabric8.kubernetes.api.model.rbac.AggregationRule;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList;
import io.fabric8.kubernetes.api.model.rbac.RoleList;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassList;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.settings.PodPresetList;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.storage.StorageClassList;
import io.fabric8.kubernetes.api.model.version.Info;
import io.fabric8.openshift.api.model.BuildConfigList;
import io.fabric8.openshift.api.model.BuildList;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.DeploymentConfigList;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.GroupList;
import io.fabric8.openshift.api.model.Identity;
import io.fabric8.openshift.api.model.IdentityList;
import io.fabric8.openshift.api.model.ImageList;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.openshift.api.model.ImageStreamList;
import io.fabric8.openshift.api.model.ImageStreamTagList;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.openshift.api.model.NetNamespaceList;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.OAuthAccessTokenList;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList;
import io.fabric8.openshift.api.model.OAuthClientList;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingList;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingList;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.openshift.api.model.OpenshiftRoleList;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.ProjectList;
import io.fabric8.openshift.api.model.ProjectRequest;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.openshift.api.model.RouteList;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.openshift.api.model.SecurityContextConstraintsList;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse;
import io.fabric8.openshift.api.model.TagEvent;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.TemplateList;
import io.fabric8.openshift.api.model.User;
import io.fabric8.openshift.api.model.UserList;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "AdmissionRequest",
    "AdmissionResponse",
    "AdmissionReview",
    "AdmissionWebhook",
    "AggregationRule",
    "BaseKubernetesList",
    "Binding",
    "BuildConfigList",
    "BuildList",
    "BuildRequest",
    "CertificateSigningRequest",
    "CertificateSigningRequestCondition",
    "CertificateSigningRequestList",
    "CertificateSigningRequestSpec",
    "CertificateSigningRequestStatus",
    "ClusterRole",
    "ClusterRoleBinding",
    "ClusterRoleBindingList",
    "ClusterRoleList",
    "ComponentStatusList",
    "Config",
    "ConfigMap",
    "ConfigMapList",
    "ContainerStatus",
    "CronJob",
    "CronJobList",
    "CustomResourceDefinition",
    "CustomResourceDefinitionCondition",
    "CustomResourceDefinitionList",
    "CustomResourceDefinitionNames",
    "CustomResourceDefinitionSpec",
    "CustomResourceDefinitionStatus",
    "DaemonSet",
    "DaemonSetList",
    "DeleteOptions",
    "Deployment",
    "DeploymentConfig",
    "DeploymentConfigList",
    "DeploymentList",
    "DeploymentRollback",
    "Endpoints",
    "EndpointsList",
    "EnvVar",
    "Event",
    "EventList",
    "EventSeries",
    "EventSeriesState",
    "Group",
    "GroupList",
    "HorizontalPodAutoscaler",
    "HorizontalPodAutoscalerList",
    "Identity",
    "IdentityList",
    "ImageList",
    "ImageStreamImport",
    "ImageStreamList",
    "ImageStreamTagList",
    "Info",
    "Ingress",
    "IngressList",
    "Initializer",
    "Initializers",
    "JSONSchemaPropsorStringArray",
    "Job",
    "JobList",
    "K8sLocalSubjectAccessReview",
    "K8sSubjectAccessReview",
    "LimitRangeList",
    "LocalSubjectAccessReview",
    "MutatingWebhookConfiguration",
    "MutatingWebhookConfigurationList",
    "Namespace",
    "NamespaceList",
    "NetNameSpace",
    "NetNameSpaceList",
    "NetworkPolicy",
    "NetworkPolicyList",
    "Node",
    "NodeList",
    "OAuthAccessToken",
    "OAuthAccessTokenList",
    "OAuthAuthorizeToken",
    "OAuthAuthorizeTokenList",
    "OAuthClient",
    "OAuthClientAuthorization",
    "OAuthClientAuthorizationList",
    "OAuthClientList",
    "ObjectMeta",
    "OpenshiftClusterRole",
    "OpenshiftClusterRoleBinding",
    "OpenshiftClusterRoleBindingList",
    "OpenshiftRole",
    "OpenshiftRoleBinding",
    "OpenshiftRoleBindingList",
    "OpenshiftRoleBindingRestriction",
    "OpenshiftRoleList",
    "Operation",
    "Patch",
    "PatchType",
    "PersistentVolume",
    "PersistentVolumeClaim",
    "PersistentVolumeClaimList",
    "PersistentVolumeList",
    "PodDisruptionBudget",
    "PodDisruptionBudgetList",
    "PodList",
    "PodPreset",
    "PodPresetList",
    "PodPresetSpec",
    "PodSecurityPolicy",
    "PodSecurityPolicyList",
    "PodTemplateList",
    "PriorityClass",
    "PriorityClassList",
    "Project",
    "ProjectList",
    "ProjectRequest",
    "Quantity",
    "ReplicaSet",
    "ReplicaSetList",
    "ReplicationControllerList",
    "ResourceQuota",
    "ResourceQuotaList",
    "Role",
    "RoleBinding",
    "RoleBindingList",
    "RoleList",
    "RootPaths",
    "Route",
    "RouteList",
    "Rule",
    "RuleWithOperations",
    "Scale",
    "Secret",
    "SecretList",
    "SecurityContextConstraints",
    "SecurityContextConstraintsList",
    "ServiceAccount",
    "ServiceAccountList",
    "ServiceList",
    "StatefulSet",
    "StatefulSetList",
    "Status",
    "StorageClass",
    "StorageClassList",
    "SubjectAccessReview",
    "SubjectAccessReviewResponse",
    "TagEvent",
    "Template",
    "TemplateList",
    "TokenReview",
    "Toleration",
    "TypeMeta",
    "User",
    "UserList",
    "ValidatingWebhookConfiguration",
    "ValidatingWebhookConfigurationList",
    "WatchEvent"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class KubeSchema {

    /**
     * 
     * 
     */
    @JsonProperty("AdmissionRequest")
    @Valid
    private AdmissionRequest admissionRequest;
    /**
     * 
     * 
     */
    @JsonProperty("AdmissionResponse")
    @Valid
    private AdmissionResponse admissionResponse;
    /**
     * 
     * 
     */
    @JsonProperty("AdmissionReview")
    @Valid
    private AdmissionReview admissionReview;
    /**
     * 
     * 
     */
    @JsonProperty("AdmissionWebhook")
    @Valid
    private Webhook admissionWebhook;
    /**
     * 
     * 
     */
    @JsonProperty("AggregationRule")
    @Valid
    private AggregationRule aggregationRule;
    /**
     * 
     * 
     */
    @JsonProperty("BaseKubernetesList")
    @Valid
    private BaseKubernetesList baseKubernetesList;
    /**
     * 
     * 
     */
    @JsonProperty("Binding")
    @Valid
    private Binding binding;
    /**
     * 
     * 
     */
    @JsonProperty("BuildConfigList")
    @Valid
    private BuildConfigList buildConfigList;
    /**
     * 
     * 
     */
    @JsonProperty("BuildList")
    @Valid
    private BuildList buildList;
    /**
     * 
     * 
     */
    @JsonProperty("BuildRequest")
    @Valid
    private BuildRequest buildRequest;
    /**
     * 
     * 
     */
    @JsonProperty("CertificateSigningRequest")
    @Valid
    private CertificateSigningRequest certificateSigningRequest;
    /**
     * 
     * 
     */
    @JsonProperty("CertificateSigningRequestCondition")
    @Valid
    private CertificateSigningRequestCondition certificateSigningRequestCondition;
    /**
     * 
     * 
     */
    @JsonProperty("CertificateSigningRequestList")
    @Valid
    private CertificateSigningRequestList certificateSigningRequestList;
    /**
     * 
     * 
     */
    @JsonProperty("CertificateSigningRequestSpec")
    @Valid
    private CertificateSigningRequestSpec certificateSigningRequestSpec;
    /**
     * 
     * 
     */
    @JsonProperty("CertificateSigningRequestStatus")
    @Valid
    private CertificateSigningRequestStatus certificateSigningRequestStatus;
    /**
     * 
     * 
     */
    @JsonProperty("ClusterRole")
    @Valid
    private ClusterRole clusterRole;
    /**
     * 
     * 
     */
    @JsonProperty("ClusterRoleBinding")
    @Valid
    private ClusterRoleBinding clusterRoleBinding;
    /**
     * 
     * 
     */
    @JsonProperty("ClusterRoleBindingList")
    @Valid
    private ClusterRoleBindingList clusterRoleBindingList;
    /**
     * 
     * 
     */
    @JsonProperty("ClusterRoleList")
    @Valid
    private ClusterRoleList clusterRoleList;
    /**
     * 
     * 
     */
    @JsonProperty("ComponentStatusList")
    @Valid
    private ComponentStatusList componentStatusList;
    /**
     * 
     * 
     */
    @JsonProperty("Config")
    @Valid
    private Config config;
    /**
     * 
     * 
     */
    @JsonProperty("ConfigMap")
    @Valid
    private ConfigMap configMap;
    /**
     * 
     * 
     */
    @JsonProperty("ConfigMapList")
    @Valid
    private ConfigMapList configMapList;
    /**
     * 
     * 
     */
    @JsonProperty("ContainerStatus")
    @Valid
    private ContainerStatus containerStatus;
    /**
     * 
     * 
     */
    @JsonProperty("CronJob")
    @Valid
    private CronJob cronJob;
    /**
     * 
     * 
     */
    @JsonProperty("CronJobList")
    @Valid
    private CronJobList cronJobList;
    /**
     * 
     * 
     */
    @JsonProperty("CustomResourceDefinition")
    @Valid
    private CustomResourceDefinition customResourceDefinition;
    /**
     * 
     * 
     */
    @JsonProperty("CustomResourceDefinitionCondition")
    @Valid
    private CustomResourceDefinitionCondition customResourceDefinitionCondition;
    /**
     * 
     * 
     */
    @JsonProperty("CustomResourceDefinitionList")
    @Valid
    private CustomResourceDefinitionList customResourceDefinitionList;
    /**
     * 
     * 
     */
    @JsonProperty("CustomResourceDefinitionNames")
    @Valid
    private CustomResourceDefinitionNames customResourceDefinitionNames;
    /**
     * 
     * 
     */
    @JsonProperty("CustomResourceDefinitionSpec")
    @Valid
    private CustomResourceDefinitionSpec customResourceDefinitionSpec;
    /**
     * 
     * 
     */
    @JsonProperty("CustomResourceDefinitionStatus")
    @Valid
    private CustomResourceDefinitionStatus customResourceDefinitionStatus;
    /**
     * 
     * 
     */
    @JsonProperty("DaemonSet")
    @Valid
    private DaemonSet daemonSet;
    /**
     * 
     * 
     */
    @JsonProperty("DaemonSetList")
    @Valid
    private DaemonSetList daemonSetList;
    /**
     * 
     * 
     */
    @JsonProperty("DeleteOptions")
    @Valid
    private DeleteOptions deleteOptions;
    /**
     * 
     * 
     */
    @JsonProperty("Deployment")
    @Valid
    private Deployment deployment;
    /**
     * 
     * 
     */
    @JsonProperty("DeploymentConfig")
    @Valid
    private DeploymentConfig deploymentConfig;
    /**
     * 
     * 
     */
    @JsonProperty("DeploymentConfigList")
    @Valid
    private DeploymentConfigList deploymentConfigList;
    /**
     * 
     * 
     */
    @JsonProperty("DeploymentList")
    @Valid
    private DeploymentList deploymentList;
    /**
     * 
     * 
     */
    @JsonProperty("DeploymentRollback")
    @Valid
    private DeploymentRollback deploymentRollback;
    /**
     * 
     * 
     */
    @JsonProperty("Endpoints")
    @Valid
    private Endpoints endpoints;
    /**
     * 
     * 
     */
    @JsonProperty("EndpointsList")
    @Valid
    private EndpointsList endpointsList;
    /**
     * 
     * 
     */
    @JsonProperty("EnvVar")
    @Valid
    private EnvVar envVar;
    /**
     * 
     * 
     */
    @JsonProperty("Event")
    @Valid
    private Event event;
    /**
     * 
     * 
     */
    @JsonProperty("EventList")
    @Valid
    private EventList eventList;
    /**
     * 
     * 
     */
    @JsonProperty("EventSeries")
    @Valid
    private EventSeries eventSeries;
    /**
     * 
     * 
     */
    @JsonProperty("EventSeriesState")
    private String eventSeriesState;
    /**
     * 
     * 
     */
    @JsonProperty("Group")
    @Valid
    private Group group;
    /**
     * 
     * 
     */
    @JsonProperty("GroupList")
    @Valid
    private GroupList groupList;
    /**
     * 
     * 
     */
    @JsonProperty("HorizontalPodAutoscaler")
    @Valid
    private HorizontalPodAutoscaler horizontalPodAutoscaler;
    /**
     * 
     * 
     */
    @JsonProperty("HorizontalPodAutoscalerList")
    @Valid
    private HorizontalPodAutoscalerList horizontalPodAutoscalerList;
    /**
     * 
     * 
     */
    @JsonProperty("Identity")
    @Valid
    private Identity identity;
    /**
     * 
     * 
     */
    @JsonProperty("IdentityList")
    @Valid
    private IdentityList identityList;
    /**
     * 
     * 
     */
    @JsonProperty("ImageList")
    @Valid
    private ImageList imageList;
    /**
     * 
     * 
     */
    @JsonProperty("ImageStreamImport")
    @Valid
    private ImageStreamImport imageStreamImport;
    /**
     * 
     * 
     */
    @JsonProperty("ImageStreamList")
    @Valid
    private ImageStreamList imageStreamList;
    /**
     * 
     * 
     */
    @JsonProperty("ImageStreamTagList")
    @Valid
    private ImageStreamTagList imageStreamTagList;
    /**
     * 
     * 
     */
    @JsonProperty("Info")
    @Valid
    private Info info;
    /**
     * 
     * 
     */
    @JsonProperty("Ingress")
    @Valid
    private Ingress ingress;
    /**
     * 
     * 
     */
    @JsonProperty("IngressList")
    @Valid
    private IngressList ingressList;
    /**
     * 
     * 
     */
    @JsonProperty("Initializer")
    @Valid
    private Initializer initializer;
    /**
     * 
     * 
     */
    @JsonProperty("Initializers")
    @Valid
    private Initializers initializers;
    /**
     * 
     * 
     */
    @JsonProperty("JSONSchemaPropsorStringArray")
    @Valid
    private JSONSchemaPropsOrStringArray jSONSchemaPropsorStringArray;
    /**
     * 
     * 
     */
    @JsonProperty("Job")
    @Valid
    private Job job;
    /**
     * 
     * 
     */
    @JsonProperty("JobList")
    @Valid
    private JobList jobList;
    /**
     * 
     * 
     */
    @JsonProperty("K8sLocalSubjectAccessReview")
    @Valid
    private io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview k8sLocalSubjectAccessReview;
    /**
     * 
     * 
     */
    @JsonProperty("K8sSubjectAccessReview")
    @Valid
    private io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview k8sSubjectAccessReview;
    /**
     * 
     * 
     */
    @JsonProperty("LimitRangeList")
    @Valid
    private LimitRangeList limitRangeList;
    /**
     * 
     * 
     */
    @JsonProperty("LocalSubjectAccessReview")
    @Valid
    private io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReview;
    /**
     * 
     * 
     */
    @JsonProperty("MutatingWebhookConfiguration")
    @Valid
    private MutatingWebhookConfiguration mutatingWebhookConfiguration;
    /**
     * 
     * 
     */
    @JsonProperty("MutatingWebhookConfigurationList")
    @Valid
    private MutatingWebhookConfigurationList mutatingWebhookConfigurationList;
    /**
     * 
     * 
     */
    @JsonProperty("Namespace")
    @Valid
    private Namespace namespace;
    /**
     * 
     * 
     */
    @JsonProperty("NamespaceList")
    @Valid
    private NamespaceList namespaceList;
    /**
     * 
     * 
     */
    @JsonProperty("NetNameSpace")
    @Valid
    private NetNamespace netNameSpace;
    /**
     * 
     * 
     */
    @JsonProperty("NetNameSpaceList")
    @Valid
    private NetNamespaceList netNameSpaceList;
    /**
     * 
     * 
     */
    @JsonProperty("NetworkPolicy")
    @Valid
    private NetworkPolicy networkPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("NetworkPolicyList")
    @Valid
    private NetworkPolicyList networkPolicyList;
    /**
     * 
     * 
     */
    @JsonProperty("Node")
    @Valid
    private Node node;
    /**
     * 
     * 
     */
    @JsonProperty("NodeList")
    @Valid
    private NodeList nodeList;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthAccessToken")
    @Valid
    private OAuthAccessToken oAuthAccessToken;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthAccessTokenList")
    @Valid
    private OAuthAccessTokenList oAuthAccessTokenList;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthAuthorizeToken")
    @Valid
    private OAuthAuthorizeToken oAuthAuthorizeToken;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthAuthorizeTokenList")
    @Valid
    private OAuthAuthorizeTokenList oAuthAuthorizeTokenList;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthClient")
    @Valid
    private OAuthClient oAuthClient;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthClientAuthorization")
    @Valid
    private OAuthClientAuthorization oAuthClientAuthorization;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthClientAuthorizationList")
    @Valid
    private OAuthClientAuthorizationList oAuthClientAuthorizationList;
    /**
     * 
     * 
     */
    @JsonProperty("OAuthClientList")
    @Valid
    private OAuthClientList oAuthClientList;
    /**
     * 
     * 
     */
    @JsonProperty("ObjectMeta")
    @Valid
    private ObjectMeta objectMeta;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftClusterRole")
    @Valid
    private OpenshiftClusterRole openshiftClusterRole;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftClusterRoleBinding")
    @Valid
    private OpenshiftClusterRoleBinding openshiftClusterRoleBinding;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftClusterRoleBindingList")
    @Valid
    private OpenshiftClusterRoleBindingList openshiftClusterRoleBindingList;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftRole")
    @Valid
    private OpenshiftRole openshiftRole;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftRoleBinding")
    @Valid
    private OpenshiftRoleBinding openshiftRoleBinding;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftRoleBindingList")
    @Valid
    private OpenshiftRoleBindingList openshiftRoleBindingList;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftRoleBindingRestriction")
    @Valid
    private OpenshiftRoleBindingRestriction openshiftRoleBindingRestriction;
    /**
     * 
     * 
     */
    @JsonProperty("OpenshiftRoleList")
    @Valid
    private OpenshiftRoleList openshiftRoleList;
    /**
     * 
     * 
     */
    @JsonProperty("Operation")
    private String operation;
    /**
     * 
     * 
     */
    @JsonProperty("Patch")
    @Valid
    private Patch patch;
    /**
     * 
     * 
     */
    @JsonProperty("PatchType")
    private String patchType;
    /**
     * 
     * 
     */
    @JsonProperty("PersistentVolume")
    @Valid
    private PersistentVolume persistentVolume;
    /**
     * 
     * 
     */
    @JsonProperty("PersistentVolumeClaim")
    @Valid
    private PersistentVolumeClaim persistentVolumeClaim;
    /**
     * 
     * 
     */
    @JsonProperty("PersistentVolumeClaimList")
    @Valid
    private PersistentVolumeClaimList persistentVolumeClaimList;
    /**
     * 
     * 
     */
    @JsonProperty("PersistentVolumeList")
    @Valid
    private PersistentVolumeList persistentVolumeList;
    /**
     * 
     * 
     */
    @JsonProperty("PodDisruptionBudget")
    @Valid
    private PodDisruptionBudget podDisruptionBudget;
    /**
     * 
     * 
     */
    @JsonProperty("PodDisruptionBudgetList")
    @Valid
    private PodDisruptionBudgetList podDisruptionBudgetList;
    /**
     * 
     * 
     */
    @JsonProperty("PodList")
    @Valid
    private PodList podList;
    /**
     * 
     * 
     */
    @JsonProperty("PodPreset")
    @Valid
    private PodPreset podPreset;
    /**
     * 
     * 
     */
    @JsonProperty("PodPresetList")
    @Valid
    private PodPresetList podPresetList;
    /**
     * 
     * 
     */
    @JsonProperty("PodPresetSpec")
    @Valid
    private PodPresetSpec podPresetSpec;
    /**
     * 
     * 
     */
    @JsonProperty("PodSecurityPolicy")
    @Valid
    private PodSecurityPolicy podSecurityPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("PodSecurityPolicyList")
    @Valid
    private PodSecurityPolicyList podSecurityPolicyList;
    /**
     * 
     * 
     */
    @JsonProperty("PodTemplateList")
    @Valid
    private PodTemplateList podTemplateList;
    /**
     * 
     * 
     */
    @JsonProperty("PriorityClass")
    @Valid
    private PriorityClass priorityClass;
    /**
     * 
     * 
     */
    @JsonProperty("PriorityClassList")
    @Valid
    private PriorityClassList priorityClassList;
    /**
     * 
     * 
     */
    @JsonProperty("Project")
    @Valid
    private Project project;
    /**
     * 
     * 
     */
    @JsonProperty("ProjectList")
    @Valid
    private ProjectList projectList;
    /**
     * 
     * 
     */
    @JsonProperty("ProjectRequest")
    @Valid
    private ProjectRequest projectRequest;
    /**
     * 
     * 
     */
    @JsonProperty("Quantity")
    @Valid
    private Quantity quantity;
    /**
     * 
     * 
     */
    @JsonProperty("ReplicaSet")
    @Valid
    private ReplicaSet replicaSet;
    /**
     * 
     * 
     */
    @JsonProperty("ReplicaSetList")
    @Valid
    private ReplicaSetList replicaSetList;
    /**
     * 
     * 
     */
    @JsonProperty("ReplicationControllerList")
    @Valid
    private ReplicationControllerList replicationControllerList;
    /**
     * 
     * 
     */
    @JsonProperty("ResourceQuota")
    @Valid
    private ResourceQuota resourceQuota;
    /**
     * 
     * 
     */
    @JsonProperty("ResourceQuotaList")
    @Valid
    private ResourceQuotaList resourceQuotaList;
    /**
     * 
     * 
     */
    @JsonProperty("Role")
    @Valid
    private Role role;
    /**
     * 
     * 
     */
    @JsonProperty("RoleBinding")
    @Valid
    private RoleBinding roleBinding;
    /**
     * 
     * 
     */
    @JsonProperty("RoleBindingList")
    @Valid
    private RoleBindingList roleBindingList;
    /**
     * 
     * 
     */
    @JsonProperty("RoleList")
    @Valid
    private RoleList roleList;
    /**
     * 
     * 
     */
    @JsonProperty("RootPaths")
    @Valid
    private RootPaths rootPaths;
    /**
     * 
     * 
     */
    @JsonProperty("Route")
    @Valid
    private Route route;
    /**
     * 
     * 
     */
    @JsonProperty("RouteList")
    @Valid
    private RouteList routeList;
    /**
     * 
     * 
     */
    @JsonProperty("Rule")
    @Valid
    private Rule rule;
    /**
     * 
     * 
     */
    @JsonProperty("RuleWithOperations")
    @Valid
    private RuleWithOperations ruleWithOperations;
    /**
     * 
     * 
     */
    @JsonProperty("Scale")
    @Valid
    private Scale scale;
    /**
     * 
     * 
     */
    @JsonProperty("Secret")
    @Valid
    private Secret secret;
    /**
     * 
     * 
     */
    @JsonProperty("SecretList")
    @Valid
    private SecretList secretList;
    /**
     * 
     * 
     */
    @JsonProperty("SecurityContextConstraints")
    @Valid
    private SecurityContextConstraints securityContextConstraints;
    /**
     * 
     * 
     */
    @JsonProperty("SecurityContextConstraintsList")
    @Valid
    private SecurityContextConstraintsList securityContextConstraintsList;
    /**
     * 
     * 
     */
    @JsonProperty("ServiceAccount")
    @Valid
    private ServiceAccount serviceAccount;
    /**
     * 
     * 
     */
    @JsonProperty("ServiceAccountList")
    @Valid
    private ServiceAccountList serviceAccountList;
    /**
     * 
     * 
     */
    @JsonProperty("ServiceList")
    @Valid
    private ServiceList serviceList;
    /**
     * 
     * 
     */
    @JsonProperty("StatefulSet")
    @Valid
    private StatefulSet statefulSet;
    /**
     * 
     * 
     */
    @JsonProperty("StatefulSetList")
    @Valid
    private StatefulSetList statefulSetList;
    /**
     * 
     * 
     */
    @JsonProperty("Status")
    @Valid
    private Status status;
    /**
     * 
     * 
     */
    @JsonProperty("StorageClass")
    @Valid
    private StorageClass storageClass;
    /**
     * 
     * 
     */
    @JsonProperty("StorageClassList")
    @Valid
    private StorageClassList storageClassList;
    /**
     * 
     * 
     */
    @JsonProperty("SubjectAccessReview")
    @Valid
    private io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReview;
    /**
     * 
     * 
     */
    @JsonProperty("SubjectAccessReviewResponse")
    @Valid
    private SubjectAccessReviewResponse subjectAccessReviewResponse;
    /**
     * 
     * 
     */
    @JsonProperty("TagEvent")
    @Valid
    private TagEvent tagEvent;
    /**
     * 
     * 
     */
    @JsonProperty("Template")
    @Valid
    private Template template;
    /**
     * 
     * 
     */
    @JsonProperty("TemplateList")
    @Valid
    private TemplateList templateList;
    /**
     * 
     * 
     */
    @JsonProperty("TokenReview")
    @Valid
    private TokenReview tokenReview;
    /**
     * 
     * 
     */
    @JsonProperty("Toleration")
    @Valid
    private Toleration toleration;
    /**
     * 
     * 
     */
    @JsonProperty("TypeMeta")
    @Valid
    private TypeMeta typeMeta;
    /**
     * 
     * 
     */
    @JsonProperty("User")
    @Valid
    private User user;
    /**
     * 
     * 
     */
    @JsonProperty("UserList")
    @Valid
    private UserList userList;
    /**
     * 
     * 
     */
    @JsonProperty("ValidatingWebhookConfiguration")
    @Valid
    private ValidatingWebhookConfiguration validatingWebhookConfiguration;
    /**
     * 
     * 
     */
    @JsonProperty("ValidatingWebhookConfigurationList")
    @Valid
    private ValidatingWebhookConfigurationList validatingWebhookConfigurationList;
    /**
     * 
     * 
     */
    @JsonProperty("WatchEvent")
    @Valid
    private WatchEvent watchEvent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public KubeSchema() {
    }

    /**
     * 
     * @param aggregationRule
     * @param roleBinding
     * @param binding
     * @param certificateSigningRequestSpec
     * @param customResourceDefinitionSpec
     * @param daemonSet
     * @param daemonSetList
     * @param openshiftClusterRole
     * @param patch
     * @param securityContextConstraintsList
     * @param oAuthClientAuthorizationList
     * @param serviceAccountList
     * @param userList
     * @param openshiftClusterRoleBindingList
     * @param secretList
     * @param podDisruptionBudget
     * @param clusterRoleBindingList
     * @param podPresetSpec
     * @param deleteOptions
     * @param priorityClassList
     * @param ruleWithOperations
     * @param networkPolicy
     * @param groupList
     * @param toleration
     * @param tagEvent
     * @param projectRequest
     * @param roleList
     * @param nodeList
     * @param customResourceDefinitionList
     * @param node
     * @param customResourceDefinitionNames
     * @param route
     * @param customResourceDefinitionCondition
     * @param validatingWebhookConfiguration
     * @param k8sSubjectAccessReview
     * @param netNameSpace
     * @param netNameSpaceList
     * @param tokenReview
     * @param imageList
     * @param eventSeries
     * @param mutatingWebhookConfiguration
     * @param persistentVolumeClaimList
     * @param status
     * @param template
     * @param buildRequest
     * @param role
     * @param admissionWebhook
     * @param ingressList
     * @param baseKubernetesList
     * @param statefulSetList
     * @param subjectAccessReviewResponse
     * @param podList
     * @param secret
     * @param openshiftRoleBindingList
     * @param storageClass
     * @param identity
     * @param oAuthAccessTokenList
     * @param buildList
     * @param rootPaths
     * @param event
     * @param containerStatus
     * @param horizontalPodAutoscalerList
     * @param replicaSetList
     * @param deployment
     * @param oAuthClientList
     * @param endpoints
     * @param oAuthAuthorizeTokenList
     * @param clusterRole
     * @param envVar
     * @param storageClassList
     * @param admissionResponse
     * @param clusterRoleList
     * @param initializer
     * @param openshiftRoleBindingRestriction
     * @param objectMeta
     * @param componentStatusList
     * @param oAuthClient
     * @param config
     * @param operation
     * @param podPresetList
     * @param routeList
     * @param securityContextConstraints
     * @param deploymentRollback
     * @param configMapList
     * @param openshiftRole
     * @param admissionRequest
     * @param eventList
     * @param validatingWebhookConfigurationList
     * @param project
     * @param k8sLocalSubjectAccessReview
     * @param namespaceList
     * @param deploymentConfig
     * @param customResourceDefinition
     * @param persistentVolume
     * @param resourceQuota
     * @param watchEvent
     * @param openshiftClusterRoleBinding
     * @param certificateSigningRequestStatus
     * @param cronJobList
     * @param group
     * @param info
     * @param projectList
     * @param oAuthAccessToken
     * @param imageStreamImport
     * @param imageStreamList
     * @param limitRangeList
     * @param deploymentList
     * @param eventSeriesState
     * @param oAuthClientAuthorization
     * @param imageStreamTagList
     * @param priorityClass
     * @param replicaSet
     * @param openshiftRoleList
     * @param cronJob
     * @param buildConfigList
     * @param ingress
     * @param configMap
     * @param identityList
     * @param subjectAccessReview
     * @param job
     * @param jobList
     * @param openshiftRoleBinding
     * @param podSecurityPolicy
     * @param admissionReview
     * @param podDisruptionBudgetList
     * @param patchType
     * @param replicationControllerList
     * @param rule
     * @param scale
     * @param roleBindingList
     * @param certificateSigningRequest
     * @param oAuthAuthorizeToken
     * @param persistentVolumeList
     * @param mutatingWebhookConfigurationList
     * @param localSubjectAccessReview
     * @param endpointsList
     * @param quantity
     * @param networkPolicyList
     * @param templateList
     * @param serviceAccount
     * @param horizontalPodAutoscaler
     * @param jSONSchemaPropsorStringArray
     * @param certificateSigningRequestList
     * @param resourceQuotaList
     * @param podTemplateList
     * @param deploymentConfigList
     * @param typeMeta
     * @param initializers
     * @param statefulSet
     * @param namespace
     * @param serviceList
     * @param customResourceDefinitionStatus
     * @param clusterRoleBinding
     * @param persistentVolumeClaim
     * @param certificateSigningRequestCondition
     * @param podSecurityPolicyList
     * @param user
     * @param podPreset
     */
    public KubeSchema(AdmissionRequest admissionRequest, AdmissionResponse admissionResponse, AdmissionReview admissionReview, Webhook admissionWebhook, AggregationRule aggregationRule, BaseKubernetesList baseKubernetesList, Binding binding, BuildConfigList buildConfigList, BuildList buildList, BuildRequest buildRequest, CertificateSigningRequest certificateSigningRequest, CertificateSigningRequestCondition certificateSigningRequestCondition, CertificateSigningRequestList certificateSigningRequestList, CertificateSigningRequestSpec certificateSigningRequestSpec, CertificateSigningRequestStatus certificateSigningRequestStatus, ClusterRole clusterRole, ClusterRoleBinding clusterRoleBinding, ClusterRoleBindingList clusterRoleBindingList, ClusterRoleList clusterRoleList, ComponentStatusList componentStatusList, Config config, ConfigMap configMap, ConfigMapList configMapList, ContainerStatus containerStatus, CronJob cronJob, CronJobList cronJobList, CustomResourceDefinition customResourceDefinition, CustomResourceDefinitionCondition customResourceDefinitionCondition, CustomResourceDefinitionList customResourceDefinitionList, CustomResourceDefinitionNames customResourceDefinitionNames, CustomResourceDefinitionSpec customResourceDefinitionSpec, CustomResourceDefinitionStatus customResourceDefinitionStatus, DaemonSet daemonSet, DaemonSetList daemonSetList, DeleteOptions deleteOptions, Deployment deployment, DeploymentConfig deploymentConfig, DeploymentConfigList deploymentConfigList, DeploymentList deploymentList, DeploymentRollback deploymentRollback, Endpoints endpoints, EndpointsList endpointsList, EnvVar envVar, Event event, EventList eventList, EventSeries eventSeries, String eventSeriesState, Group group, GroupList groupList, HorizontalPodAutoscaler horizontalPodAutoscaler, HorizontalPodAutoscalerList horizontalPodAutoscalerList, Identity identity, IdentityList identityList, ImageList imageList, ImageStreamImport imageStreamImport, ImageStreamList imageStreamList, ImageStreamTagList imageStreamTagList, Info info, Ingress ingress, IngressList ingressList, Initializer initializer, Initializers initializers, JSONSchemaPropsOrStringArray jSONSchemaPropsorStringArray, Job job, JobList jobList, io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview k8sLocalSubjectAccessReview, io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview k8sSubjectAccessReview, LimitRangeList limitRangeList, io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReview, MutatingWebhookConfiguration mutatingWebhookConfiguration, MutatingWebhookConfigurationList mutatingWebhookConfigurationList, Namespace namespace, NamespaceList namespaceList, NetNamespace netNameSpace, NetNamespaceList netNameSpaceList, NetworkPolicy networkPolicy, NetworkPolicyList networkPolicyList, Node node, NodeList nodeList, OAuthAccessToken oAuthAccessToken, OAuthAccessTokenList oAuthAccessTokenList, OAuthAuthorizeToken oAuthAuthorizeToken, OAuthAuthorizeTokenList oAuthAuthorizeTokenList, OAuthClient oAuthClient, OAuthClientAuthorization oAuthClientAuthorization, OAuthClientAuthorizationList oAuthClientAuthorizationList, OAuthClientList oAuthClientList, ObjectMeta objectMeta, OpenshiftClusterRole openshiftClusterRole, OpenshiftClusterRoleBinding openshiftClusterRoleBinding, OpenshiftClusterRoleBindingList openshiftClusterRoleBindingList, OpenshiftRole openshiftRole, OpenshiftRoleBinding openshiftRoleBinding, OpenshiftRoleBindingList openshiftRoleBindingList, OpenshiftRoleBindingRestriction openshiftRoleBindingRestriction, OpenshiftRoleList openshiftRoleList, String operation, Patch patch, String patchType, PersistentVolume persistentVolume, PersistentVolumeClaim persistentVolumeClaim, PersistentVolumeClaimList persistentVolumeClaimList, PersistentVolumeList persistentVolumeList, PodDisruptionBudget podDisruptionBudget, PodDisruptionBudgetList podDisruptionBudgetList, PodList podList, PodPreset podPreset, PodPresetList podPresetList, PodPresetSpec podPresetSpec, PodSecurityPolicy podSecurityPolicy, PodSecurityPolicyList podSecurityPolicyList, PodTemplateList podTemplateList, PriorityClass priorityClass, PriorityClassList priorityClassList, Project project, ProjectList projectList, ProjectRequest projectRequest, Quantity quantity, ReplicaSet replicaSet, ReplicaSetList replicaSetList, ReplicationControllerList replicationControllerList, ResourceQuota resourceQuota, ResourceQuotaList resourceQuotaList, Role role, RoleBinding roleBinding, RoleBindingList roleBindingList, RoleList roleList, RootPaths rootPaths, Route route, RouteList routeList, Rule rule, RuleWithOperations ruleWithOperations, Scale scale, Secret secret, SecretList secretList, SecurityContextConstraints securityContextConstraints, SecurityContextConstraintsList securityContextConstraintsList, ServiceAccount serviceAccount, ServiceAccountList serviceAccountList, ServiceList serviceList, StatefulSet statefulSet, StatefulSetList statefulSetList, Status status, StorageClass storageClass, StorageClassList storageClassList, io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReview, SubjectAccessReviewResponse subjectAccessReviewResponse, TagEvent tagEvent, Template template, TemplateList templateList, TokenReview tokenReview, Toleration toleration, TypeMeta typeMeta, User user, UserList userList, ValidatingWebhookConfiguration validatingWebhookConfiguration, ValidatingWebhookConfigurationList validatingWebhookConfigurationList, WatchEvent watchEvent) {
        this.admissionRequest = admissionRequest;
        this.admissionResponse = admissionResponse;
        this.admissionReview = admissionReview;
        this.admissionWebhook = admissionWebhook;
        this.aggregationRule = aggregationRule;
        this.baseKubernetesList = baseKubernetesList;
        this.binding = binding;
        this.buildConfigList = buildConfigList;
        this.buildList = buildList;
        this.buildRequest = buildRequest;
        this.certificateSigningRequest = certificateSigningRequest;
        this.certificateSigningRequestCondition = certificateSigningRequestCondition;
        this.certificateSigningRequestList = certificateSigningRequestList;
        this.certificateSigningRequestSpec = certificateSigningRequestSpec;
        this.certificateSigningRequestStatus = certificateSigningRequestStatus;
        this.clusterRole = clusterRole;
        this.clusterRoleBinding = clusterRoleBinding;
        this.clusterRoleBindingList = clusterRoleBindingList;
        this.clusterRoleList = clusterRoleList;
        this.componentStatusList = componentStatusList;
        this.config = config;
        this.configMap = configMap;
        this.configMapList = configMapList;
        this.containerStatus = containerStatus;
        this.cronJob = cronJob;
        this.cronJobList = cronJobList;
        this.customResourceDefinition = customResourceDefinition;
        this.customResourceDefinitionCondition = customResourceDefinitionCondition;
        this.customResourceDefinitionList = customResourceDefinitionList;
        this.customResourceDefinitionNames = customResourceDefinitionNames;
        this.customResourceDefinitionSpec = customResourceDefinitionSpec;
        this.customResourceDefinitionStatus = customResourceDefinitionStatus;
        this.daemonSet = daemonSet;
        this.daemonSetList = daemonSetList;
        this.deleteOptions = deleteOptions;
        this.deployment = deployment;
        this.deploymentConfig = deploymentConfig;
        this.deploymentConfigList = deploymentConfigList;
        this.deploymentList = deploymentList;
        this.deploymentRollback = deploymentRollback;
        this.endpoints = endpoints;
        this.endpointsList = endpointsList;
        this.envVar = envVar;
        this.event = event;
        this.eventList = eventList;
        this.eventSeries = eventSeries;
        this.eventSeriesState = eventSeriesState;
        this.group = group;
        this.groupList = groupList;
        this.horizontalPodAutoscaler = horizontalPodAutoscaler;
        this.horizontalPodAutoscalerList = horizontalPodAutoscalerList;
        this.identity = identity;
        this.identityList = identityList;
        this.imageList = imageList;
        this.imageStreamImport = imageStreamImport;
        this.imageStreamList = imageStreamList;
        this.imageStreamTagList = imageStreamTagList;
        this.info = info;
        this.ingress = ingress;
        this.ingressList = ingressList;
        this.initializer = initializer;
        this.initializers = initializers;
        this.jSONSchemaPropsorStringArray = jSONSchemaPropsorStringArray;
        this.job = job;
        this.jobList = jobList;
        this.k8sLocalSubjectAccessReview = k8sLocalSubjectAccessReview;
        this.k8sSubjectAccessReview = k8sSubjectAccessReview;
        this.limitRangeList = limitRangeList;
        this.localSubjectAccessReview = localSubjectAccessReview;
        this.mutatingWebhookConfiguration = mutatingWebhookConfiguration;
        this.mutatingWebhookConfigurationList = mutatingWebhookConfigurationList;
        this.namespace = namespace;
        this.namespaceList = namespaceList;
        this.netNameSpace = netNameSpace;
        this.netNameSpaceList = netNameSpaceList;
        this.networkPolicy = networkPolicy;
        this.networkPolicyList = networkPolicyList;
        this.node = node;
        this.nodeList = nodeList;
        this.oAuthAccessToken = oAuthAccessToken;
        this.oAuthAccessTokenList = oAuthAccessTokenList;
        this.oAuthAuthorizeToken = oAuthAuthorizeToken;
        this.oAuthAuthorizeTokenList = oAuthAuthorizeTokenList;
        this.oAuthClient = oAuthClient;
        this.oAuthClientAuthorization = oAuthClientAuthorization;
        this.oAuthClientAuthorizationList = oAuthClientAuthorizationList;
        this.oAuthClientList = oAuthClientList;
        this.objectMeta = objectMeta;
        this.openshiftClusterRole = openshiftClusterRole;
        this.openshiftClusterRoleBinding = openshiftClusterRoleBinding;
        this.openshiftClusterRoleBindingList = openshiftClusterRoleBindingList;
        this.openshiftRole = openshiftRole;
        this.openshiftRoleBinding = openshiftRoleBinding;
        this.openshiftRoleBindingList = openshiftRoleBindingList;
        this.openshiftRoleBindingRestriction = openshiftRoleBindingRestriction;
        this.openshiftRoleList = openshiftRoleList;
        this.operation = operation;
        this.patch = patch;
        this.patchType = patchType;
        this.persistentVolume = persistentVolume;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.persistentVolumeClaimList = persistentVolumeClaimList;
        this.persistentVolumeList = persistentVolumeList;
        this.podDisruptionBudget = podDisruptionBudget;
        this.podDisruptionBudgetList = podDisruptionBudgetList;
        this.podList = podList;
        this.podPreset = podPreset;
        this.podPresetList = podPresetList;
        this.podPresetSpec = podPresetSpec;
        this.podSecurityPolicy = podSecurityPolicy;
        this.podSecurityPolicyList = podSecurityPolicyList;
        this.podTemplateList = podTemplateList;
        this.priorityClass = priorityClass;
        this.priorityClassList = priorityClassList;
        this.project = project;
        this.projectList = projectList;
        this.projectRequest = projectRequest;
        this.quantity = quantity;
        this.replicaSet = replicaSet;
        this.replicaSetList = replicaSetList;
        this.replicationControllerList = replicationControllerList;
        this.resourceQuota = resourceQuota;
        this.resourceQuotaList = resourceQuotaList;
        this.role = role;
        this.roleBinding = roleBinding;
        this.roleBindingList = roleBindingList;
        this.roleList = roleList;
        this.rootPaths = rootPaths;
        this.route = route;
        this.routeList = routeList;
        this.rule = rule;
        this.ruleWithOperations = ruleWithOperations;
        this.scale = scale;
        this.secret = secret;
        this.secretList = secretList;
        this.securityContextConstraints = securityContextConstraints;
        this.securityContextConstraintsList = securityContextConstraintsList;
        this.serviceAccount = serviceAccount;
        this.serviceAccountList = serviceAccountList;
        this.serviceList = serviceList;
        this.statefulSet = statefulSet;
        this.statefulSetList = statefulSetList;
        this.status = status;
        this.storageClass = storageClass;
        this.storageClassList = storageClassList;
        this.subjectAccessReview = subjectAccessReview;
        this.subjectAccessReviewResponse = subjectAccessReviewResponse;
        this.tagEvent = tagEvent;
        this.template = template;
        this.templateList = templateList;
        this.tokenReview = tokenReview;
        this.toleration = toleration;
        this.typeMeta = typeMeta;
        this.user = user;
        this.userList = userList;
        this.validatingWebhookConfiguration = validatingWebhookConfiguration;
        this.validatingWebhookConfigurationList = validatingWebhookConfigurationList;
        this.watchEvent = watchEvent;
    }

    /**
     * 
     * 
     * @return
     *     The admissionRequest
     */
    @JsonProperty("AdmissionRequest")
    public AdmissionRequest getAdmissionRequest() {
        return admissionRequest;
    }

    /**
     * 
     * 
     * @param admissionRequest
     *     The AdmissionRequest
     */
    @JsonProperty("AdmissionRequest")
    public void setAdmissionRequest(AdmissionRequest admissionRequest) {
        this.admissionRequest = admissionRequest;
    }

    /**
     * 
     * 
     * @return
     *     The admissionResponse
     */
    @JsonProperty("AdmissionResponse")
    public AdmissionResponse getAdmissionResponse() {
        return admissionResponse;
    }

    /**
     * 
     * 
     * @param admissionResponse
     *     The AdmissionResponse
     */
    @JsonProperty("AdmissionResponse")
    public void setAdmissionResponse(AdmissionResponse admissionResponse) {
        this.admissionResponse = admissionResponse;
    }

    /**
     * 
     * 
     * @return
     *     The admissionReview
     */
    @JsonProperty("AdmissionReview")
    public AdmissionReview getAdmissionReview() {
        return admissionReview;
    }

    /**
     * 
     * 
     * @param admissionReview
     *     The AdmissionReview
     */
    @JsonProperty("AdmissionReview")
    public void setAdmissionReview(AdmissionReview admissionReview) {
        this.admissionReview = admissionReview;
    }

    /**
     * 
     * 
     * @return
     *     The admissionWebhook
     */
    @JsonProperty("AdmissionWebhook")
    public Webhook getAdmissionWebhook() {
        return admissionWebhook;
    }

    /**
     * 
     * 
     * @param admissionWebhook
     *     The AdmissionWebhook
     */
    @JsonProperty("AdmissionWebhook")
    public void setAdmissionWebhook(Webhook admissionWebhook) {
        this.admissionWebhook = admissionWebhook;
    }

    /**
     * 
     * 
     * @return
     *     The aggregationRule
     */
    @JsonProperty("AggregationRule")
    public AggregationRule getAggregationRule() {
        return aggregationRule;
    }

    /**
     * 
     * 
     * @param aggregationRule
     *     The AggregationRule
     */
    @JsonProperty("AggregationRule")
    public void setAggregationRule(AggregationRule aggregationRule) {
        this.aggregationRule = aggregationRule;
    }

    /**
     * 
     * 
     * @return
     *     The baseKubernetesList
     */
    @JsonProperty("BaseKubernetesList")
    public BaseKubernetesList getBaseKubernetesList() {
        return baseKubernetesList;
    }

    /**
     * 
     * 
     * @param baseKubernetesList
     *     The BaseKubernetesList
     */
    @JsonProperty("BaseKubernetesList")
    public void setBaseKubernetesList(BaseKubernetesList baseKubernetesList) {
        this.baseKubernetesList = baseKubernetesList;
    }

    /**
     * 
     * 
     * @return
     *     The binding
     */
    @JsonProperty("Binding")
    public Binding getBinding() {
        return binding;
    }

    /**
     * 
     * 
     * @param binding
     *     The Binding
     */
    @JsonProperty("Binding")
    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    /**
     * 
     * 
     * @return
     *     The buildConfigList
     */
    @JsonProperty("BuildConfigList")
    public BuildConfigList getBuildConfigList() {
        return buildConfigList;
    }

    /**
     * 
     * 
     * @param buildConfigList
     *     The BuildConfigList
     */
    @JsonProperty("BuildConfigList")
    public void setBuildConfigList(BuildConfigList buildConfigList) {
        this.buildConfigList = buildConfigList;
    }

    /**
     * 
     * 
     * @return
     *     The buildList
     */
    @JsonProperty("BuildList")
    public BuildList getBuildList() {
        return buildList;
    }

    /**
     * 
     * 
     * @param buildList
     *     The BuildList
     */
    @JsonProperty("BuildList")
    public void setBuildList(BuildList buildList) {
        this.buildList = buildList;
    }

    /**
     * 
     * 
     * @return
     *     The buildRequest
     */
    @JsonProperty("BuildRequest")
    public BuildRequest getBuildRequest() {
        return buildRequest;
    }

    /**
     * 
     * 
     * @param buildRequest
     *     The BuildRequest
     */
    @JsonProperty("BuildRequest")
    public void setBuildRequest(BuildRequest buildRequest) {
        this.buildRequest = buildRequest;
    }

    /**
     * 
     * 
     * @return
     *     The certificateSigningRequest
     */
    @JsonProperty("CertificateSigningRequest")
    public CertificateSigningRequest getCertificateSigningRequest() {
        return certificateSigningRequest;
    }

    /**
     * 
     * 
     * @param certificateSigningRequest
     *     The CertificateSigningRequest
     */
    @JsonProperty("CertificateSigningRequest")
    public void setCertificateSigningRequest(CertificateSigningRequest certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
    }

    /**
     * 
     * 
     * @return
     *     The certificateSigningRequestCondition
     */
    @JsonProperty("CertificateSigningRequestCondition")
    public CertificateSigningRequestCondition getCertificateSigningRequestCondition() {
        return certificateSigningRequestCondition;
    }

    /**
     * 
     * 
     * @param certificateSigningRequestCondition
     *     The CertificateSigningRequestCondition
     */
    @JsonProperty("CertificateSigningRequestCondition")
    public void setCertificateSigningRequestCondition(CertificateSigningRequestCondition certificateSigningRequestCondition) {
        this.certificateSigningRequestCondition = certificateSigningRequestCondition;
    }

    /**
     * 
     * 
     * @return
     *     The certificateSigningRequestList
     */
    @JsonProperty("CertificateSigningRequestList")
    public CertificateSigningRequestList getCertificateSigningRequestList() {
        return certificateSigningRequestList;
    }

    /**
     * 
     * 
     * @param certificateSigningRequestList
     *     The CertificateSigningRequestList
     */
    @JsonProperty("CertificateSigningRequestList")
    public void setCertificateSigningRequestList(CertificateSigningRequestList certificateSigningRequestList) {
        this.certificateSigningRequestList = certificateSigningRequestList;
    }

    /**
     * 
     * 
     * @return
     *     The certificateSigningRequestSpec
     */
    @JsonProperty("CertificateSigningRequestSpec")
    public CertificateSigningRequestSpec getCertificateSigningRequestSpec() {
        return certificateSigningRequestSpec;
    }

    /**
     * 
     * 
     * @param certificateSigningRequestSpec
     *     The CertificateSigningRequestSpec
     */
    @JsonProperty("CertificateSigningRequestSpec")
    public void setCertificateSigningRequestSpec(CertificateSigningRequestSpec certificateSigningRequestSpec) {
        this.certificateSigningRequestSpec = certificateSigningRequestSpec;
    }

    /**
     * 
     * 
     * @return
     *     The certificateSigningRequestStatus
     */
    @JsonProperty("CertificateSigningRequestStatus")
    public CertificateSigningRequestStatus getCertificateSigningRequestStatus() {
        return certificateSigningRequestStatus;
    }

    /**
     * 
     * 
     * @param certificateSigningRequestStatus
     *     The CertificateSigningRequestStatus
     */
    @JsonProperty("CertificateSigningRequestStatus")
    public void setCertificateSigningRequestStatus(CertificateSigningRequestStatus certificateSigningRequestStatus) {
        this.certificateSigningRequestStatus = certificateSigningRequestStatus;
    }

    /**
     * 
     * 
     * @return
     *     The clusterRole
     */
    @JsonProperty("ClusterRole")
    public ClusterRole getClusterRole() {
        return clusterRole;
    }

    /**
     * 
     * 
     * @param clusterRole
     *     The ClusterRole
     */
    @JsonProperty("ClusterRole")
    public void setClusterRole(ClusterRole clusterRole) {
        this.clusterRole = clusterRole;
    }

    /**
     * 
     * 
     * @return
     *     The clusterRoleBinding
     */
    @JsonProperty("ClusterRoleBinding")
    public ClusterRoleBinding getClusterRoleBinding() {
        return clusterRoleBinding;
    }

    /**
     * 
     * 
     * @param clusterRoleBinding
     *     The ClusterRoleBinding
     */
    @JsonProperty("ClusterRoleBinding")
    public void setClusterRoleBinding(ClusterRoleBinding clusterRoleBinding) {
        this.clusterRoleBinding = clusterRoleBinding;
    }

    /**
     * 
     * 
     * @return
     *     The clusterRoleBindingList
     */
    @JsonProperty("ClusterRoleBindingList")
    public ClusterRoleBindingList getClusterRoleBindingList() {
        return clusterRoleBindingList;
    }

    /**
     * 
     * 
     * @param clusterRoleBindingList
     *     The ClusterRoleBindingList
     */
    @JsonProperty("ClusterRoleBindingList")
    public void setClusterRoleBindingList(ClusterRoleBindingList clusterRoleBindingList) {
        this.clusterRoleBindingList = clusterRoleBindingList;
    }

    /**
     * 
     * 
     * @return
     *     The clusterRoleList
     */
    @JsonProperty("ClusterRoleList")
    public ClusterRoleList getClusterRoleList() {
        return clusterRoleList;
    }

    /**
     * 
     * 
     * @param clusterRoleList
     *     The ClusterRoleList
     */
    @JsonProperty("ClusterRoleList")
    public void setClusterRoleList(ClusterRoleList clusterRoleList) {
        this.clusterRoleList = clusterRoleList;
    }

    /**
     * 
     * 
     * @return
     *     The componentStatusList
     */
    @JsonProperty("ComponentStatusList")
    public ComponentStatusList getComponentStatusList() {
        return componentStatusList;
    }

    /**
     * 
     * 
     * @param componentStatusList
     *     The ComponentStatusList
     */
    @JsonProperty("ComponentStatusList")
    public void setComponentStatusList(ComponentStatusList componentStatusList) {
        this.componentStatusList = componentStatusList;
    }

    /**
     * 
     * 
     * @return
     *     The config
     */
    @JsonProperty("Config")
    public Config getConfig() {
        return config;
    }

    /**
     * 
     * 
     * @param config
     *     The Config
     */
    @JsonProperty("Config")
    public void setConfig(Config config) {
        this.config = config;
    }

    /**
     * 
     * 
     * @return
     *     The configMap
     */
    @JsonProperty("ConfigMap")
    public ConfigMap getConfigMap() {
        return configMap;
    }

    /**
     * 
     * 
     * @param configMap
     *     The ConfigMap
     */
    @JsonProperty("ConfigMap")
    public void setConfigMap(ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * 
     * 
     * @return
     *     The configMapList
     */
    @JsonProperty("ConfigMapList")
    public ConfigMapList getConfigMapList() {
        return configMapList;
    }

    /**
     * 
     * 
     * @param configMapList
     *     The ConfigMapList
     */
    @JsonProperty("ConfigMapList")
    public void setConfigMapList(ConfigMapList configMapList) {
        this.configMapList = configMapList;
    }

    /**
     * 
     * 
     * @return
     *     The containerStatus
     */
    @JsonProperty("ContainerStatus")
    public ContainerStatus getContainerStatus() {
        return containerStatus;
    }

    /**
     * 
     * 
     * @param containerStatus
     *     The ContainerStatus
     */
    @JsonProperty("ContainerStatus")
    public void setContainerStatus(ContainerStatus containerStatus) {
        this.containerStatus = containerStatus;
    }

    /**
     * 
     * 
     * @return
     *     The cronJob
     */
    @JsonProperty("CronJob")
    public CronJob getCronJob() {
        return cronJob;
    }

    /**
     * 
     * 
     * @param cronJob
     *     The CronJob
     */
    @JsonProperty("CronJob")
    public void setCronJob(CronJob cronJob) {
        this.cronJob = cronJob;
    }

    /**
     * 
     * 
     * @return
     *     The cronJobList
     */
    @JsonProperty("CronJobList")
    public CronJobList getCronJobList() {
        return cronJobList;
    }

    /**
     * 
     * 
     * @param cronJobList
     *     The CronJobList
     */
    @JsonProperty("CronJobList")
    public void setCronJobList(CronJobList cronJobList) {
        this.cronJobList = cronJobList;
    }

    /**
     * 
     * 
     * @return
     *     The customResourceDefinition
     */
    @JsonProperty("CustomResourceDefinition")
    public CustomResourceDefinition getCustomResourceDefinition() {
        return customResourceDefinition;
    }

    /**
     * 
     * 
     * @param customResourceDefinition
     *     The CustomResourceDefinition
     */
    @JsonProperty("CustomResourceDefinition")
    public void setCustomResourceDefinition(CustomResourceDefinition customResourceDefinition) {
        this.customResourceDefinition = customResourceDefinition;
    }

    /**
     * 
     * 
     * @return
     *     The customResourceDefinitionCondition
     */
    @JsonProperty("CustomResourceDefinitionCondition")
    public CustomResourceDefinitionCondition getCustomResourceDefinitionCondition() {
        return customResourceDefinitionCondition;
    }

    /**
     * 
     * 
     * @param customResourceDefinitionCondition
     *     The CustomResourceDefinitionCondition
     */
    @JsonProperty("CustomResourceDefinitionCondition")
    public void setCustomResourceDefinitionCondition(CustomResourceDefinitionCondition customResourceDefinitionCondition) {
        this.customResourceDefinitionCondition = customResourceDefinitionCondition;
    }

    /**
     * 
     * 
     * @return
     *     The customResourceDefinitionList
     */
    @JsonProperty("CustomResourceDefinitionList")
    public CustomResourceDefinitionList getCustomResourceDefinitionList() {
        return customResourceDefinitionList;
    }

    /**
     * 
     * 
     * @param customResourceDefinitionList
     *     The CustomResourceDefinitionList
     */
    @JsonProperty("CustomResourceDefinitionList")
    public void setCustomResourceDefinitionList(CustomResourceDefinitionList customResourceDefinitionList) {
        this.customResourceDefinitionList = customResourceDefinitionList;
    }

    /**
     * 
     * 
     * @return
     *     The customResourceDefinitionNames
     */
    @JsonProperty("CustomResourceDefinitionNames")
    public CustomResourceDefinitionNames getCustomResourceDefinitionNames() {
        return customResourceDefinitionNames;
    }

    /**
     * 
     * 
     * @param customResourceDefinitionNames
     *     The CustomResourceDefinitionNames
     */
    @JsonProperty("CustomResourceDefinitionNames")
    public void setCustomResourceDefinitionNames(CustomResourceDefinitionNames customResourceDefinitionNames) {
        this.customResourceDefinitionNames = customResourceDefinitionNames;
    }

    /**
     * 
     * 
     * @return
     *     The customResourceDefinitionSpec
     */
    @JsonProperty("CustomResourceDefinitionSpec")
    public CustomResourceDefinitionSpec getCustomResourceDefinitionSpec() {
        return customResourceDefinitionSpec;
    }

    /**
     * 
     * 
     * @param customResourceDefinitionSpec
     *     The CustomResourceDefinitionSpec
     */
    @JsonProperty("CustomResourceDefinitionSpec")
    public void setCustomResourceDefinitionSpec(CustomResourceDefinitionSpec customResourceDefinitionSpec) {
        this.customResourceDefinitionSpec = customResourceDefinitionSpec;
    }

    /**
     * 
     * 
     * @return
     *     The customResourceDefinitionStatus
     */
    @JsonProperty("CustomResourceDefinitionStatus")
    public CustomResourceDefinitionStatus getCustomResourceDefinitionStatus() {
        return customResourceDefinitionStatus;
    }

    /**
     * 
     * 
     * @param customResourceDefinitionStatus
     *     The CustomResourceDefinitionStatus
     */
    @JsonProperty("CustomResourceDefinitionStatus")
    public void setCustomResourceDefinitionStatus(CustomResourceDefinitionStatus customResourceDefinitionStatus) {
        this.customResourceDefinitionStatus = customResourceDefinitionStatus;
    }

    /**
     * 
     * 
     * @return
     *     The daemonSet
     */
    @JsonProperty("DaemonSet")
    public DaemonSet getDaemonSet() {
        return daemonSet;
    }

    /**
     * 
     * 
     * @param daemonSet
     *     The DaemonSet
     */
    @JsonProperty("DaemonSet")
    public void setDaemonSet(DaemonSet daemonSet) {
        this.daemonSet = daemonSet;
    }

    /**
     * 
     * 
     * @return
     *     The daemonSetList
     */
    @JsonProperty("DaemonSetList")
    public DaemonSetList getDaemonSetList() {
        return daemonSetList;
    }

    /**
     * 
     * 
     * @param daemonSetList
     *     The DaemonSetList
     */
    @JsonProperty("DaemonSetList")
    public void setDaemonSetList(DaemonSetList daemonSetList) {
        this.daemonSetList = daemonSetList;
    }

    /**
     * 
     * 
     * @return
     *     The deleteOptions
     */
    @JsonProperty("DeleteOptions")
    public DeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    /**
     * 
     * 
     * @param deleteOptions
     *     The DeleteOptions
     */
    @JsonProperty("DeleteOptions")
    public void setDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
    }

    /**
     * 
     * 
     * @return
     *     The deployment
     */
    @JsonProperty("Deployment")
    public Deployment getDeployment() {
        return deployment;
    }

    /**
     * 
     * 
     * @param deployment
     *     The Deployment
     */
    @JsonProperty("Deployment")
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * 
     * 
     * @return
     *     The deploymentConfig
     */
    @JsonProperty("DeploymentConfig")
    public DeploymentConfig getDeploymentConfig() {
        return deploymentConfig;
    }

    /**
     * 
     * 
     * @param deploymentConfig
     *     The DeploymentConfig
     */
    @JsonProperty("DeploymentConfig")
    public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

    /**
     * 
     * 
     * @return
     *     The deploymentConfigList
     */
    @JsonProperty("DeploymentConfigList")
    public DeploymentConfigList getDeploymentConfigList() {
        return deploymentConfigList;
    }

    /**
     * 
     * 
     * @param deploymentConfigList
     *     The DeploymentConfigList
     */
    @JsonProperty("DeploymentConfigList")
    public void setDeploymentConfigList(DeploymentConfigList deploymentConfigList) {
        this.deploymentConfigList = deploymentConfigList;
    }

    /**
     * 
     * 
     * @return
     *     The deploymentList
     */
    @JsonProperty("DeploymentList")
    public DeploymentList getDeploymentList() {
        return deploymentList;
    }

    /**
     * 
     * 
     * @param deploymentList
     *     The DeploymentList
     */
    @JsonProperty("DeploymentList")
    public void setDeploymentList(DeploymentList deploymentList) {
        this.deploymentList = deploymentList;
    }

    /**
     * 
     * 
     * @return
     *     The deploymentRollback
     */
    @JsonProperty("DeploymentRollback")
    public DeploymentRollback getDeploymentRollback() {
        return deploymentRollback;
    }

    /**
     * 
     * 
     * @param deploymentRollback
     *     The DeploymentRollback
     */
    @JsonProperty("DeploymentRollback")
    public void setDeploymentRollback(DeploymentRollback deploymentRollback) {
        this.deploymentRollback = deploymentRollback;
    }

    /**
     * 
     * 
     * @return
     *     The endpoints
     */
    @JsonProperty("Endpoints")
    public Endpoints getEndpoints() {
        return endpoints;
    }

    /**
     * 
     * 
     * @param endpoints
     *     The Endpoints
     */
    @JsonProperty("Endpoints")
    public void setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * 
     * 
     * @return
     *     The endpointsList
     */
    @JsonProperty("EndpointsList")
    public EndpointsList getEndpointsList() {
        return endpointsList;
    }

    /**
     * 
     * 
     * @param endpointsList
     *     The EndpointsList
     */
    @JsonProperty("EndpointsList")
    public void setEndpointsList(EndpointsList endpointsList) {
        this.endpointsList = endpointsList;
    }

    /**
     * 
     * 
     * @return
     *     The envVar
     */
    @JsonProperty("EnvVar")
    public EnvVar getEnvVar() {
        return envVar;
    }

    /**
     * 
     * 
     * @param envVar
     *     The EnvVar
     */
    @JsonProperty("EnvVar")
    public void setEnvVar(EnvVar envVar) {
        this.envVar = envVar;
    }

    /**
     * 
     * 
     * @return
     *     The event
     */
    @JsonProperty("Event")
    public Event getEvent() {
        return event;
    }

    /**
     * 
     * 
     * @param event
     *     The Event
     */
    @JsonProperty("Event")
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * 
     * 
     * @return
     *     The eventList
     */
    @JsonProperty("EventList")
    public EventList getEventList() {
        return eventList;
    }

    /**
     * 
     * 
     * @param eventList
     *     The EventList
     */
    @JsonProperty("EventList")
    public void setEventList(EventList eventList) {
        this.eventList = eventList;
    }

    /**
     * 
     * 
     * @return
     *     The eventSeries
     */
    @JsonProperty("EventSeries")
    public EventSeries getEventSeries() {
        return eventSeries;
    }

    /**
     * 
     * 
     * @param eventSeries
     *     The EventSeries
     */
    @JsonProperty("EventSeries")
    public void setEventSeries(EventSeries eventSeries) {
        this.eventSeries = eventSeries;
    }

    /**
     * 
     * 
     * @return
     *     The eventSeriesState
     */
    @JsonProperty("EventSeriesState")
    public String getEventSeriesState() {
        return eventSeriesState;
    }

    /**
     * 
     * 
     * @param eventSeriesState
     *     The EventSeriesState
     */
    @JsonProperty("EventSeriesState")
    public void setEventSeriesState(String eventSeriesState) {
        this.eventSeriesState = eventSeriesState;
    }

    /**
     * 
     * 
     * @return
     *     The group
     */
    @JsonProperty("Group")
    public Group getGroup() {
        return group;
    }

    /**
     * 
     * 
     * @param group
     *     The Group
     */
    @JsonProperty("Group")
    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * 
     * 
     * @return
     *     The groupList
     */
    @JsonProperty("GroupList")
    public GroupList getGroupList() {
        return groupList;
    }

    /**
     * 
     * 
     * @param groupList
     *     The GroupList
     */
    @JsonProperty("GroupList")
    public void setGroupList(GroupList groupList) {
        this.groupList = groupList;
    }

    /**
     * 
     * 
     * @return
     *     The horizontalPodAutoscaler
     */
    @JsonProperty("HorizontalPodAutoscaler")
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return horizontalPodAutoscaler;
    }

    /**
     * 
     * 
     * @param horizontalPodAutoscaler
     *     The HorizontalPodAutoscaler
     */
    @JsonProperty("HorizontalPodAutoscaler")
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler horizontalPodAutoscaler) {
        this.horizontalPodAutoscaler = horizontalPodAutoscaler;
    }

    /**
     * 
     * 
     * @return
     *     The horizontalPodAutoscalerList
     */
    @JsonProperty("HorizontalPodAutoscalerList")
    public HorizontalPodAutoscalerList getHorizontalPodAutoscalerList() {
        return horizontalPodAutoscalerList;
    }

    /**
     * 
     * 
     * @param horizontalPodAutoscalerList
     *     The HorizontalPodAutoscalerList
     */
    @JsonProperty("HorizontalPodAutoscalerList")
    public void setHorizontalPodAutoscalerList(HorizontalPodAutoscalerList horizontalPodAutoscalerList) {
        this.horizontalPodAutoscalerList = horizontalPodAutoscalerList;
    }

    /**
     * 
     * 
     * @return
     *     The identity
     */
    @JsonProperty("Identity")
    public Identity getIdentity() {
        return identity;
    }

    /**
     * 
     * 
     * @param identity
     *     The Identity
     */
    @JsonProperty("Identity")
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    /**
     * 
     * 
     * @return
     *     The identityList
     */
    @JsonProperty("IdentityList")
    public IdentityList getIdentityList() {
        return identityList;
    }

    /**
     * 
     * 
     * @param identityList
     *     The IdentityList
     */
    @JsonProperty("IdentityList")
    public void setIdentityList(IdentityList identityList) {
        this.identityList = identityList;
    }

    /**
     * 
     * 
     * @return
     *     The imageList
     */
    @JsonProperty("ImageList")
    public ImageList getImageList() {
        return imageList;
    }

    /**
     * 
     * 
     * @param imageList
     *     The ImageList
     */
    @JsonProperty("ImageList")
    public void setImageList(ImageList imageList) {
        this.imageList = imageList;
    }

    /**
     * 
     * 
     * @return
     *     The imageStreamImport
     */
    @JsonProperty("ImageStreamImport")
    public ImageStreamImport getImageStreamImport() {
        return imageStreamImport;
    }

    /**
     * 
     * 
     * @param imageStreamImport
     *     The ImageStreamImport
     */
    @JsonProperty("ImageStreamImport")
    public void setImageStreamImport(ImageStreamImport imageStreamImport) {
        this.imageStreamImport = imageStreamImport;
    }

    /**
     * 
     * 
     * @return
     *     The imageStreamList
     */
    @JsonProperty("ImageStreamList")
    public ImageStreamList getImageStreamList() {
        return imageStreamList;
    }

    /**
     * 
     * 
     * @param imageStreamList
     *     The ImageStreamList
     */
    @JsonProperty("ImageStreamList")
    public void setImageStreamList(ImageStreamList imageStreamList) {
        this.imageStreamList = imageStreamList;
    }

    /**
     * 
     * 
     * @return
     *     The imageStreamTagList
     */
    @JsonProperty("ImageStreamTagList")
    public ImageStreamTagList getImageStreamTagList() {
        return imageStreamTagList;
    }

    /**
     * 
     * 
     * @param imageStreamTagList
     *     The ImageStreamTagList
     */
    @JsonProperty("ImageStreamTagList")
    public void setImageStreamTagList(ImageStreamTagList imageStreamTagList) {
        this.imageStreamTagList = imageStreamTagList;
    }

    /**
     * 
     * 
     * @return
     *     The info
     */
    @JsonProperty("Info")
    public Info getInfo() {
        return info;
    }

    /**
     * 
     * 
     * @param info
     *     The Info
     */
    @JsonProperty("Info")
    public void setInfo(Info info) {
        this.info = info;
    }

    /**
     * 
     * 
     * @return
     *     The ingress
     */
    @JsonProperty("Ingress")
    public Ingress getIngress() {
        return ingress;
    }

    /**
     * 
     * 
     * @param ingress
     *     The Ingress
     */
    @JsonProperty("Ingress")
    public void setIngress(Ingress ingress) {
        this.ingress = ingress;
    }

    /**
     * 
     * 
     * @return
     *     The ingressList
     */
    @JsonProperty("IngressList")
    public IngressList getIngressList() {
        return ingressList;
    }

    /**
     * 
     * 
     * @param ingressList
     *     The IngressList
     */
    @JsonProperty("IngressList")
    public void setIngressList(IngressList ingressList) {
        this.ingressList = ingressList;
    }

    /**
     * 
     * 
     * @return
     *     The initializer
     */
    @JsonProperty("Initializer")
    public Initializer getInitializer() {
        return initializer;
    }

    /**
     * 
     * 
     * @param initializer
     *     The Initializer
     */
    @JsonProperty("Initializer")
    public void setInitializer(Initializer initializer) {
        this.initializer = initializer;
    }

    /**
     * 
     * 
     * @return
     *     The initializers
     */
    @JsonProperty("Initializers")
    public Initializers getInitializers() {
        return initializers;
    }

    /**
     * 
     * 
     * @param initializers
     *     The Initializers
     */
    @JsonProperty("Initializers")
    public void setInitializers(Initializers initializers) {
        this.initializers = initializers;
    }

    /**
     * 
     * 
     * @return
     *     The jSONSchemaPropsorStringArray
     */
    @JsonProperty("JSONSchemaPropsorStringArray")
    public JSONSchemaPropsOrStringArray getJSONSchemaPropsorStringArray() {
        return jSONSchemaPropsorStringArray;
    }

    /**
     * 
     * 
     * @param jSONSchemaPropsorStringArray
     *     The JSONSchemaPropsorStringArray
     */
    @JsonProperty("JSONSchemaPropsorStringArray")
    public void setJSONSchemaPropsorStringArray(JSONSchemaPropsOrStringArray jSONSchemaPropsorStringArray) {
        this.jSONSchemaPropsorStringArray = jSONSchemaPropsorStringArray;
    }

    /**
     * 
     * 
     * @return
     *     The job
     */
    @JsonProperty("Job")
    public Job getJob() {
        return job;
    }

    /**
     * 
     * 
     * @param job
     *     The Job
     */
    @JsonProperty("Job")
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * 
     * 
     * @return
     *     The jobList
     */
    @JsonProperty("JobList")
    public JobList getJobList() {
        return jobList;
    }

    /**
     * 
     * 
     * @param jobList
     *     The JobList
     */
    @JsonProperty("JobList")
    public void setJobList(JobList jobList) {
        this.jobList = jobList;
    }

    /**
     * 
     * 
     * @return
     *     The k8sLocalSubjectAccessReview
     */
    @JsonProperty("K8sLocalSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview getK8sLocalSubjectAccessReview() {
        return k8sLocalSubjectAccessReview;
    }

    /**
     * 
     * 
     * @param k8sLocalSubjectAccessReview
     *     The K8sLocalSubjectAccessReview
     */
    @JsonProperty("K8sLocalSubjectAccessReview")
    public void setK8sLocalSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview k8sLocalSubjectAccessReview) {
        this.k8sLocalSubjectAccessReview = k8sLocalSubjectAccessReview;
    }

    /**
     * 
     * 
     * @return
     *     The k8sSubjectAccessReview
     */
    @JsonProperty("K8sSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview getK8sSubjectAccessReview() {
        return k8sSubjectAccessReview;
    }

    /**
     * 
     * 
     * @param k8sSubjectAccessReview
     *     The K8sSubjectAccessReview
     */
    @JsonProperty("K8sSubjectAccessReview")
    public void setK8sSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview k8sSubjectAccessReview) {
        this.k8sSubjectAccessReview = k8sSubjectAccessReview;
    }

    /**
     * 
     * 
     * @return
     *     The limitRangeList
     */
    @JsonProperty("LimitRangeList")
    public LimitRangeList getLimitRangeList() {
        return limitRangeList;
    }

    /**
     * 
     * 
     * @param limitRangeList
     *     The LimitRangeList
     */
    @JsonProperty("LimitRangeList")
    public void setLimitRangeList(LimitRangeList limitRangeList) {
        this.limitRangeList = limitRangeList;
    }

    /**
     * 
     * 
     * @return
     *     The localSubjectAccessReview
     */
    @JsonProperty("LocalSubjectAccessReview")
    public io.fabric8.openshift.api.model.LocalSubjectAccessReview getLocalSubjectAccessReview() {
        return localSubjectAccessReview;
    }

    /**
     * 
     * 
     * @param localSubjectAccessReview
     *     The LocalSubjectAccessReview
     */
    @JsonProperty("LocalSubjectAccessReview")
    public void setLocalSubjectAccessReview(io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReview) {
        this.localSubjectAccessReview = localSubjectAccessReview;
    }

    /**
     * 
     * 
     * @return
     *     The mutatingWebhookConfiguration
     */
    @JsonProperty("MutatingWebhookConfiguration")
    public MutatingWebhookConfiguration getMutatingWebhookConfiguration() {
        return mutatingWebhookConfiguration;
    }

    /**
     * 
     * 
     * @param mutatingWebhookConfiguration
     *     The MutatingWebhookConfiguration
     */
    @JsonProperty("MutatingWebhookConfiguration")
    public void setMutatingWebhookConfiguration(MutatingWebhookConfiguration mutatingWebhookConfiguration) {
        this.mutatingWebhookConfiguration = mutatingWebhookConfiguration;
    }

    /**
     * 
     * 
     * @return
     *     The mutatingWebhookConfigurationList
     */
    @JsonProperty("MutatingWebhookConfigurationList")
    public MutatingWebhookConfigurationList getMutatingWebhookConfigurationList() {
        return mutatingWebhookConfigurationList;
    }

    /**
     * 
     * 
     * @param mutatingWebhookConfigurationList
     *     The MutatingWebhookConfigurationList
     */
    @JsonProperty("MutatingWebhookConfigurationList")
    public void setMutatingWebhookConfigurationList(MutatingWebhookConfigurationList mutatingWebhookConfigurationList) {
        this.mutatingWebhookConfigurationList = mutatingWebhookConfigurationList;
    }

    /**
     * 
     * 
     * @return
     *     The namespace
     */
    @JsonProperty("Namespace")
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * 
     * 
     * @param namespace
     *     The Namespace
     */
    @JsonProperty("Namespace")
    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    /**
     * 
     * 
     * @return
     *     The namespaceList
     */
    @JsonProperty("NamespaceList")
    public NamespaceList getNamespaceList() {
        return namespaceList;
    }

    /**
     * 
     * 
     * @param namespaceList
     *     The NamespaceList
     */
    @JsonProperty("NamespaceList")
    public void setNamespaceList(NamespaceList namespaceList) {
        this.namespaceList = namespaceList;
    }

    /**
     * 
     * 
     * @return
     *     The netNameSpace
     */
    @JsonProperty("NetNameSpace")
    public NetNamespace getNetNameSpace() {
        return netNameSpace;
    }

    /**
     * 
     * 
     * @param netNameSpace
     *     The NetNameSpace
     */
    @JsonProperty("NetNameSpace")
    public void setNetNameSpace(NetNamespace netNameSpace) {
        this.netNameSpace = netNameSpace;
    }

    /**
     * 
     * 
     * @return
     *     The netNameSpaceList
     */
    @JsonProperty("NetNameSpaceList")
    public NetNamespaceList getNetNameSpaceList() {
        return netNameSpaceList;
    }

    /**
     * 
     * 
     * @param netNameSpaceList
     *     The NetNameSpaceList
     */
    @JsonProperty("NetNameSpaceList")
    public void setNetNameSpaceList(NetNamespaceList netNameSpaceList) {
        this.netNameSpaceList = netNameSpaceList;
    }

    /**
     * 
     * 
     * @return
     *     The networkPolicy
     */
    @JsonProperty("NetworkPolicy")
    public NetworkPolicy getNetworkPolicy() {
        return networkPolicy;
    }

    /**
     * 
     * 
     * @param networkPolicy
     *     The NetworkPolicy
     */
    @JsonProperty("NetworkPolicy")
    public void setNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The networkPolicyList
     */
    @JsonProperty("NetworkPolicyList")
    public NetworkPolicyList getNetworkPolicyList() {
        return networkPolicyList;
    }

    /**
     * 
     * 
     * @param networkPolicyList
     *     The NetworkPolicyList
     */
    @JsonProperty("NetworkPolicyList")
    public void setNetworkPolicyList(NetworkPolicyList networkPolicyList) {
        this.networkPolicyList = networkPolicyList;
    }

    /**
     * 
     * 
     * @return
     *     The node
     */
    @JsonProperty("Node")
    public Node getNode() {
        return node;
    }

    /**
     * 
     * 
     * @param node
     *     The Node
     */
    @JsonProperty("Node")
    public void setNode(Node node) {
        this.node = node;
    }

    /**
     * 
     * 
     * @return
     *     The nodeList
     */
    @JsonProperty("NodeList")
    public NodeList getNodeList() {
        return nodeList;
    }

    /**
     * 
     * 
     * @param nodeList
     *     The NodeList
     */
    @JsonProperty("NodeList")
    public void setNodeList(NodeList nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthAccessToken
     */
    @JsonProperty("OAuthAccessToken")
    public OAuthAccessToken getOAuthAccessToken() {
        return oAuthAccessToken;
    }

    /**
     * 
     * 
     * @param oAuthAccessToken
     *     The OAuthAccessToken
     */
    @JsonProperty("OAuthAccessToken")
    public void setOAuthAccessToken(OAuthAccessToken oAuthAccessToken) {
        this.oAuthAccessToken = oAuthAccessToken;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthAccessTokenList
     */
    @JsonProperty("OAuthAccessTokenList")
    public OAuthAccessTokenList getOAuthAccessTokenList() {
        return oAuthAccessTokenList;
    }

    /**
     * 
     * 
     * @param oAuthAccessTokenList
     *     The OAuthAccessTokenList
     */
    @JsonProperty("OAuthAccessTokenList")
    public void setOAuthAccessTokenList(OAuthAccessTokenList oAuthAccessTokenList) {
        this.oAuthAccessTokenList = oAuthAccessTokenList;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthAuthorizeToken
     */
    @JsonProperty("OAuthAuthorizeToken")
    public OAuthAuthorizeToken getOAuthAuthorizeToken() {
        return oAuthAuthorizeToken;
    }

    /**
     * 
     * 
     * @param oAuthAuthorizeToken
     *     The OAuthAuthorizeToken
     */
    @JsonProperty("OAuthAuthorizeToken")
    public void setOAuthAuthorizeToken(OAuthAuthorizeToken oAuthAuthorizeToken) {
        this.oAuthAuthorizeToken = oAuthAuthorizeToken;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthAuthorizeTokenList
     */
    @JsonProperty("OAuthAuthorizeTokenList")
    public OAuthAuthorizeTokenList getOAuthAuthorizeTokenList() {
        return oAuthAuthorizeTokenList;
    }

    /**
     * 
     * 
     * @param oAuthAuthorizeTokenList
     *     The OAuthAuthorizeTokenList
     */
    @JsonProperty("OAuthAuthorizeTokenList")
    public void setOAuthAuthorizeTokenList(OAuthAuthorizeTokenList oAuthAuthorizeTokenList) {
        this.oAuthAuthorizeTokenList = oAuthAuthorizeTokenList;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthClient
     */
    @JsonProperty("OAuthClient")
    public OAuthClient getOAuthClient() {
        return oAuthClient;
    }

    /**
     * 
     * 
     * @param oAuthClient
     *     The OAuthClient
     */
    @JsonProperty("OAuthClient")
    public void setOAuthClient(OAuthClient oAuthClient) {
        this.oAuthClient = oAuthClient;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthClientAuthorization
     */
    @JsonProperty("OAuthClientAuthorization")
    public OAuthClientAuthorization getOAuthClientAuthorization() {
        return oAuthClientAuthorization;
    }

    /**
     * 
     * 
     * @param oAuthClientAuthorization
     *     The OAuthClientAuthorization
     */
    @JsonProperty("OAuthClientAuthorization")
    public void setOAuthClientAuthorization(OAuthClientAuthorization oAuthClientAuthorization) {
        this.oAuthClientAuthorization = oAuthClientAuthorization;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthClientAuthorizationList
     */
    @JsonProperty("OAuthClientAuthorizationList")
    public OAuthClientAuthorizationList getOAuthClientAuthorizationList() {
        return oAuthClientAuthorizationList;
    }

    /**
     * 
     * 
     * @param oAuthClientAuthorizationList
     *     The OAuthClientAuthorizationList
     */
    @JsonProperty("OAuthClientAuthorizationList")
    public void setOAuthClientAuthorizationList(OAuthClientAuthorizationList oAuthClientAuthorizationList) {
        this.oAuthClientAuthorizationList = oAuthClientAuthorizationList;
    }

    /**
     * 
     * 
     * @return
     *     The oAuthClientList
     */
    @JsonProperty("OAuthClientList")
    public OAuthClientList getOAuthClientList() {
        return oAuthClientList;
    }

    /**
     * 
     * 
     * @param oAuthClientList
     *     The OAuthClientList
     */
    @JsonProperty("OAuthClientList")
    public void setOAuthClientList(OAuthClientList oAuthClientList) {
        this.oAuthClientList = oAuthClientList;
    }

    /**
     * 
     * 
     * @return
     *     The objectMeta
     */
    @JsonProperty("ObjectMeta")
    public ObjectMeta getObjectMeta() {
        return objectMeta;
    }

    /**
     * 
     * 
     * @param objectMeta
     *     The ObjectMeta
     */
    @JsonProperty("ObjectMeta")
    public void setObjectMeta(ObjectMeta objectMeta) {
        this.objectMeta = objectMeta;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftClusterRole
     */
    @JsonProperty("OpenshiftClusterRole")
    public OpenshiftClusterRole getOpenshiftClusterRole() {
        return openshiftClusterRole;
    }

    /**
     * 
     * 
     * @param openshiftClusterRole
     *     The OpenshiftClusterRole
     */
    @JsonProperty("OpenshiftClusterRole")
    public void setOpenshiftClusterRole(OpenshiftClusterRole openshiftClusterRole) {
        this.openshiftClusterRole = openshiftClusterRole;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftClusterRoleBinding
     */
    @JsonProperty("OpenshiftClusterRoleBinding")
    public OpenshiftClusterRoleBinding getOpenshiftClusterRoleBinding() {
        return openshiftClusterRoleBinding;
    }

    /**
     * 
     * 
     * @param openshiftClusterRoleBinding
     *     The OpenshiftClusterRoleBinding
     */
    @JsonProperty("OpenshiftClusterRoleBinding")
    public void setOpenshiftClusterRoleBinding(OpenshiftClusterRoleBinding openshiftClusterRoleBinding) {
        this.openshiftClusterRoleBinding = openshiftClusterRoleBinding;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftClusterRoleBindingList
     */
    @JsonProperty("OpenshiftClusterRoleBindingList")
    public OpenshiftClusterRoleBindingList getOpenshiftClusterRoleBindingList() {
        return openshiftClusterRoleBindingList;
    }

    /**
     * 
     * 
     * @param openshiftClusterRoleBindingList
     *     The OpenshiftClusterRoleBindingList
     */
    @JsonProperty("OpenshiftClusterRoleBindingList")
    public void setOpenshiftClusterRoleBindingList(OpenshiftClusterRoleBindingList openshiftClusterRoleBindingList) {
        this.openshiftClusterRoleBindingList = openshiftClusterRoleBindingList;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftRole
     */
    @JsonProperty("OpenshiftRole")
    public OpenshiftRole getOpenshiftRole() {
        return openshiftRole;
    }

    /**
     * 
     * 
     * @param openshiftRole
     *     The OpenshiftRole
     */
    @JsonProperty("OpenshiftRole")
    public void setOpenshiftRole(OpenshiftRole openshiftRole) {
        this.openshiftRole = openshiftRole;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftRoleBinding
     */
    @JsonProperty("OpenshiftRoleBinding")
    public OpenshiftRoleBinding getOpenshiftRoleBinding() {
        return openshiftRoleBinding;
    }

    /**
     * 
     * 
     * @param openshiftRoleBinding
     *     The OpenshiftRoleBinding
     */
    @JsonProperty("OpenshiftRoleBinding")
    public void setOpenshiftRoleBinding(OpenshiftRoleBinding openshiftRoleBinding) {
        this.openshiftRoleBinding = openshiftRoleBinding;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftRoleBindingList
     */
    @JsonProperty("OpenshiftRoleBindingList")
    public OpenshiftRoleBindingList getOpenshiftRoleBindingList() {
        return openshiftRoleBindingList;
    }

    /**
     * 
     * 
     * @param openshiftRoleBindingList
     *     The OpenshiftRoleBindingList
     */
    @JsonProperty("OpenshiftRoleBindingList")
    public void setOpenshiftRoleBindingList(OpenshiftRoleBindingList openshiftRoleBindingList) {
        this.openshiftRoleBindingList = openshiftRoleBindingList;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftRoleBindingRestriction
     */
    @JsonProperty("OpenshiftRoleBindingRestriction")
    public OpenshiftRoleBindingRestriction getOpenshiftRoleBindingRestriction() {
        return openshiftRoleBindingRestriction;
    }

    /**
     * 
     * 
     * @param openshiftRoleBindingRestriction
     *     The OpenshiftRoleBindingRestriction
     */
    @JsonProperty("OpenshiftRoleBindingRestriction")
    public void setOpenshiftRoleBindingRestriction(OpenshiftRoleBindingRestriction openshiftRoleBindingRestriction) {
        this.openshiftRoleBindingRestriction = openshiftRoleBindingRestriction;
    }

    /**
     * 
     * 
     * @return
     *     The openshiftRoleList
     */
    @JsonProperty("OpenshiftRoleList")
    public OpenshiftRoleList getOpenshiftRoleList() {
        return openshiftRoleList;
    }

    /**
     * 
     * 
     * @param openshiftRoleList
     *     The OpenshiftRoleList
     */
    @JsonProperty("OpenshiftRoleList")
    public void setOpenshiftRoleList(OpenshiftRoleList openshiftRoleList) {
        this.openshiftRoleList = openshiftRoleList;
    }

    /**
     * 
     * 
     * @return
     *     The operation
     */
    @JsonProperty("Operation")
    public String getOperation() {
        return operation;
    }

    /**
     * 
     * 
     * @param operation
     *     The Operation
     */
    @JsonProperty("Operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 
     * 
     * @return
     *     The patch
     */
    @JsonProperty("Patch")
    public Patch getPatch() {
        return patch;
    }

    /**
     * 
     * 
     * @param patch
     *     The Patch
     */
    @JsonProperty("Patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    /**
     * 
     * 
     * @return
     *     The patchType
     */
    @JsonProperty("PatchType")
    public String getPatchType() {
        return patchType;
    }

    /**
     * 
     * 
     * @param patchType
     *     The PatchType
     */
    @JsonProperty("PatchType")
    public void setPatchType(String patchType) {
        this.patchType = patchType;
    }

    /**
     * 
     * 
     * @return
     *     The persistentVolume
     */
    @JsonProperty("PersistentVolume")
    public PersistentVolume getPersistentVolume() {
        return persistentVolume;
    }

    /**
     * 
     * 
     * @param persistentVolume
     *     The PersistentVolume
     */
    @JsonProperty("PersistentVolume")
    public void setPersistentVolume(PersistentVolume persistentVolume) {
        this.persistentVolume = persistentVolume;
    }

    /**
     * 
     * 
     * @return
     *     The persistentVolumeClaim
     */
    @JsonProperty("PersistentVolumeClaim")
    public PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    /**
     * 
     * 
     * @param persistentVolumeClaim
     *     The PersistentVolumeClaim
     */
    @JsonProperty("PersistentVolumeClaim")
    public void setPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * 
     * 
     * @return
     *     The persistentVolumeClaimList
     */
    @JsonProperty("PersistentVolumeClaimList")
    public PersistentVolumeClaimList getPersistentVolumeClaimList() {
        return persistentVolumeClaimList;
    }

    /**
     * 
     * 
     * @param persistentVolumeClaimList
     *     The PersistentVolumeClaimList
     */
    @JsonProperty("PersistentVolumeClaimList")
    public void setPersistentVolumeClaimList(PersistentVolumeClaimList persistentVolumeClaimList) {
        this.persistentVolumeClaimList = persistentVolumeClaimList;
    }

    /**
     * 
     * 
     * @return
     *     The persistentVolumeList
     */
    @JsonProperty("PersistentVolumeList")
    public PersistentVolumeList getPersistentVolumeList() {
        return persistentVolumeList;
    }

    /**
     * 
     * 
     * @param persistentVolumeList
     *     The PersistentVolumeList
     */
    @JsonProperty("PersistentVolumeList")
    public void setPersistentVolumeList(PersistentVolumeList persistentVolumeList) {
        this.persistentVolumeList = persistentVolumeList;
    }

    /**
     * 
     * 
     * @return
     *     The podDisruptionBudget
     */
    @JsonProperty("PodDisruptionBudget")
    public PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    /**
     * 
     * 
     * @param podDisruptionBudget
     *     The PodDisruptionBudget
     */
    @JsonProperty("PodDisruptionBudget")
    public void setPodDisruptionBudget(PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    /**
     * 
     * 
     * @return
     *     The podDisruptionBudgetList
     */
    @JsonProperty("PodDisruptionBudgetList")
    public PodDisruptionBudgetList getPodDisruptionBudgetList() {
        return podDisruptionBudgetList;
    }

    /**
     * 
     * 
     * @param podDisruptionBudgetList
     *     The PodDisruptionBudgetList
     */
    @JsonProperty("PodDisruptionBudgetList")
    public void setPodDisruptionBudgetList(PodDisruptionBudgetList podDisruptionBudgetList) {
        this.podDisruptionBudgetList = podDisruptionBudgetList;
    }

    /**
     * 
     * 
     * @return
     *     The podList
     */
    @JsonProperty("PodList")
    public PodList getPodList() {
        return podList;
    }

    /**
     * 
     * 
     * @param podList
     *     The PodList
     */
    @JsonProperty("PodList")
    public void setPodList(PodList podList) {
        this.podList = podList;
    }

    /**
     * 
     * 
     * @return
     *     The podPreset
     */
    @JsonProperty("PodPreset")
    public PodPreset getPodPreset() {
        return podPreset;
    }

    /**
     * 
     * 
     * @param podPreset
     *     The PodPreset
     */
    @JsonProperty("PodPreset")
    public void setPodPreset(PodPreset podPreset) {
        this.podPreset = podPreset;
    }

    /**
     * 
     * 
     * @return
     *     The podPresetList
     */
    @JsonProperty("PodPresetList")
    public PodPresetList getPodPresetList() {
        return podPresetList;
    }

    /**
     * 
     * 
     * @param podPresetList
     *     The PodPresetList
     */
    @JsonProperty("PodPresetList")
    public void setPodPresetList(PodPresetList podPresetList) {
        this.podPresetList = podPresetList;
    }

    /**
     * 
     * 
     * @return
     *     The podPresetSpec
     */
    @JsonProperty("PodPresetSpec")
    public PodPresetSpec getPodPresetSpec() {
        return podPresetSpec;
    }

    /**
     * 
     * 
     * @param podPresetSpec
     *     The PodPresetSpec
     */
    @JsonProperty("PodPresetSpec")
    public void setPodPresetSpec(PodPresetSpec podPresetSpec) {
        this.podPresetSpec = podPresetSpec;
    }

    /**
     * 
     * 
     * @return
     *     The podSecurityPolicy
     */
    @JsonProperty("PodSecurityPolicy")
    public PodSecurityPolicy getPodSecurityPolicy() {
        return podSecurityPolicy;
    }

    /**
     * 
     * 
     * @param podSecurityPolicy
     *     The PodSecurityPolicy
     */
    @JsonProperty("PodSecurityPolicy")
    public void setPodSecurityPolicy(PodSecurityPolicy podSecurityPolicy) {
        this.podSecurityPolicy = podSecurityPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The podSecurityPolicyList
     */
    @JsonProperty("PodSecurityPolicyList")
    public PodSecurityPolicyList getPodSecurityPolicyList() {
        return podSecurityPolicyList;
    }

    /**
     * 
     * 
     * @param podSecurityPolicyList
     *     The PodSecurityPolicyList
     */
    @JsonProperty("PodSecurityPolicyList")
    public void setPodSecurityPolicyList(PodSecurityPolicyList podSecurityPolicyList) {
        this.podSecurityPolicyList = podSecurityPolicyList;
    }

    /**
     * 
     * 
     * @return
     *     The podTemplateList
     */
    @JsonProperty("PodTemplateList")
    public PodTemplateList getPodTemplateList() {
        return podTemplateList;
    }

    /**
     * 
     * 
     * @param podTemplateList
     *     The PodTemplateList
     */
    @JsonProperty("PodTemplateList")
    public void setPodTemplateList(PodTemplateList podTemplateList) {
        this.podTemplateList = podTemplateList;
    }

    /**
     * 
     * 
     * @return
     *     The priorityClass
     */
    @JsonProperty("PriorityClass")
    public PriorityClass getPriorityClass() {
        return priorityClass;
    }

    /**
     * 
     * 
     * @param priorityClass
     *     The PriorityClass
     */
    @JsonProperty("PriorityClass")
    public void setPriorityClass(PriorityClass priorityClass) {
        this.priorityClass = priorityClass;
    }

    /**
     * 
     * 
     * @return
     *     The priorityClassList
     */
    @JsonProperty("PriorityClassList")
    public PriorityClassList getPriorityClassList() {
        return priorityClassList;
    }

    /**
     * 
     * 
     * @param priorityClassList
     *     The PriorityClassList
     */
    @JsonProperty("PriorityClassList")
    public void setPriorityClassList(PriorityClassList priorityClassList) {
        this.priorityClassList = priorityClassList;
    }

    /**
     * 
     * 
     * @return
     *     The project
     */
    @JsonProperty("Project")
    public Project getProject() {
        return project;
    }

    /**
     * 
     * 
     * @param project
     *     The Project
     */
    @JsonProperty("Project")
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * 
     * 
     * @return
     *     The projectList
     */
    @JsonProperty("ProjectList")
    public ProjectList getProjectList() {
        return projectList;
    }

    /**
     * 
     * 
     * @param projectList
     *     The ProjectList
     */
    @JsonProperty("ProjectList")
    public void setProjectList(ProjectList projectList) {
        this.projectList = projectList;
    }

    /**
     * 
     * 
     * @return
     *     The projectRequest
     */
    @JsonProperty("ProjectRequest")
    public ProjectRequest getProjectRequest() {
        return projectRequest;
    }

    /**
     * 
     * 
     * @param projectRequest
     *     The ProjectRequest
     */
    @JsonProperty("ProjectRequest")
    public void setProjectRequest(ProjectRequest projectRequest) {
        this.projectRequest = projectRequest;
    }

    /**
     * 
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("Quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * 
     * 
     * @param quantity
     *     The Quantity
     */
    @JsonProperty("Quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * 
     * @return
     *     The replicaSet
     */
    @JsonProperty("ReplicaSet")
    public ReplicaSet getReplicaSet() {
        return replicaSet;
    }

    /**
     * 
     * 
     * @param replicaSet
     *     The ReplicaSet
     */
    @JsonProperty("ReplicaSet")
    public void setReplicaSet(ReplicaSet replicaSet) {
        this.replicaSet = replicaSet;
    }

    /**
     * 
     * 
     * @return
     *     The replicaSetList
     */
    @JsonProperty("ReplicaSetList")
    public ReplicaSetList getReplicaSetList() {
        return replicaSetList;
    }

    /**
     * 
     * 
     * @param replicaSetList
     *     The ReplicaSetList
     */
    @JsonProperty("ReplicaSetList")
    public void setReplicaSetList(ReplicaSetList replicaSetList) {
        this.replicaSetList = replicaSetList;
    }

    /**
     * 
     * 
     * @return
     *     The replicationControllerList
     */
    @JsonProperty("ReplicationControllerList")
    public ReplicationControllerList getReplicationControllerList() {
        return replicationControllerList;
    }

    /**
     * 
     * 
     * @param replicationControllerList
     *     The ReplicationControllerList
     */
    @JsonProperty("ReplicationControllerList")
    public void setReplicationControllerList(ReplicationControllerList replicationControllerList) {
        this.replicationControllerList = replicationControllerList;
    }

    /**
     * 
     * 
     * @return
     *     The resourceQuota
     */
    @JsonProperty("ResourceQuota")
    public ResourceQuota getResourceQuota() {
        return resourceQuota;
    }

    /**
     * 
     * 
     * @param resourceQuota
     *     The ResourceQuota
     */
    @JsonProperty("ResourceQuota")
    public void setResourceQuota(ResourceQuota resourceQuota) {
        this.resourceQuota = resourceQuota;
    }

    /**
     * 
     * 
     * @return
     *     The resourceQuotaList
     */
    @JsonProperty("ResourceQuotaList")
    public ResourceQuotaList getResourceQuotaList() {
        return resourceQuotaList;
    }

    /**
     * 
     * 
     * @param resourceQuotaList
     *     The ResourceQuotaList
     */
    @JsonProperty("ResourceQuotaList")
    public void setResourceQuotaList(ResourceQuotaList resourceQuotaList) {
        this.resourceQuotaList = resourceQuotaList;
    }

    /**
     * 
     * 
     * @return
     *     The role
     */
    @JsonProperty("Role")
    public Role getRole() {
        return role;
    }

    /**
     * 
     * 
     * @param role
     *     The Role
     */
    @JsonProperty("Role")
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * 
     * 
     * @return
     *     The roleBinding
     */
    @JsonProperty("RoleBinding")
    public RoleBinding getRoleBinding() {
        return roleBinding;
    }

    /**
     * 
     * 
     * @param roleBinding
     *     The RoleBinding
     */
    @JsonProperty("RoleBinding")
    public void setRoleBinding(RoleBinding roleBinding) {
        this.roleBinding = roleBinding;
    }

    /**
     * 
     * 
     * @return
     *     The roleBindingList
     */
    @JsonProperty("RoleBindingList")
    public RoleBindingList getRoleBindingList() {
        return roleBindingList;
    }

    /**
     * 
     * 
     * @param roleBindingList
     *     The RoleBindingList
     */
    @JsonProperty("RoleBindingList")
    public void setRoleBindingList(RoleBindingList roleBindingList) {
        this.roleBindingList = roleBindingList;
    }

    /**
     * 
     * 
     * @return
     *     The roleList
     */
    @JsonProperty("RoleList")
    public RoleList getRoleList() {
        return roleList;
    }

    /**
     * 
     * 
     * @param roleList
     *     The RoleList
     */
    @JsonProperty("RoleList")
    public void setRoleList(RoleList roleList) {
        this.roleList = roleList;
    }

    /**
     * 
     * 
     * @return
     *     The rootPaths
     */
    @JsonProperty("RootPaths")
    public RootPaths getRootPaths() {
        return rootPaths;
    }

    /**
     * 
     * 
     * @param rootPaths
     *     The RootPaths
     */
    @JsonProperty("RootPaths")
    public void setRootPaths(RootPaths rootPaths) {
        this.rootPaths = rootPaths;
    }

    /**
     * 
     * 
     * @return
     *     The route
     */
    @JsonProperty("Route")
    public Route getRoute() {
        return route;
    }

    /**
     * 
     * 
     * @param route
     *     The Route
     */
    @JsonProperty("Route")
    public void setRoute(Route route) {
        this.route = route;
    }

    /**
     * 
     * 
     * @return
     *     The routeList
     */
    @JsonProperty("RouteList")
    public RouteList getRouteList() {
        return routeList;
    }

    /**
     * 
     * 
     * @param routeList
     *     The RouteList
     */
    @JsonProperty("RouteList")
    public void setRouteList(RouteList routeList) {
        this.routeList = routeList;
    }

    /**
     * 
     * 
     * @return
     *     The rule
     */
    @JsonProperty("Rule")
    public Rule getRule() {
        return rule;
    }

    /**
     * 
     * 
     * @param rule
     *     The Rule
     */
    @JsonProperty("Rule")
    public void setRule(Rule rule) {
        this.rule = rule;
    }

    /**
     * 
     * 
     * @return
     *     The ruleWithOperations
     */
    @JsonProperty("RuleWithOperations")
    public RuleWithOperations getRuleWithOperations() {
        return ruleWithOperations;
    }

    /**
     * 
     * 
     * @param ruleWithOperations
     *     The RuleWithOperations
     */
    @JsonProperty("RuleWithOperations")
    public void setRuleWithOperations(RuleWithOperations ruleWithOperations) {
        this.ruleWithOperations = ruleWithOperations;
    }

    /**
     * 
     * 
     * @return
     *     The scale
     */
    @JsonProperty("Scale")
    public Scale getScale() {
        return scale;
    }

    /**
     * 
     * 
     * @param scale
     *     The Scale
     */
    @JsonProperty("Scale")
    public void setScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * 
     * 
     * @return
     *     The secret
     */
    @JsonProperty("Secret")
    public Secret getSecret() {
        return secret;
    }

    /**
     * 
     * 
     * @param secret
     *     The Secret
     */
    @JsonProperty("Secret")
    public void setSecret(Secret secret) {
        this.secret = secret;
    }

    /**
     * 
     * 
     * @return
     *     The secretList
     */
    @JsonProperty("SecretList")
    public SecretList getSecretList() {
        return secretList;
    }

    /**
     * 
     * 
     * @param secretList
     *     The SecretList
     */
    @JsonProperty("SecretList")
    public void setSecretList(SecretList secretList) {
        this.secretList = secretList;
    }

    /**
     * 
     * 
     * @return
     *     The securityContextConstraints
     */
    @JsonProperty("SecurityContextConstraints")
    public SecurityContextConstraints getSecurityContextConstraints() {
        return securityContextConstraints;
    }

    /**
     * 
     * 
     * @param securityContextConstraints
     *     The SecurityContextConstraints
     */
    @JsonProperty("SecurityContextConstraints")
    public void setSecurityContextConstraints(SecurityContextConstraints securityContextConstraints) {
        this.securityContextConstraints = securityContextConstraints;
    }

    /**
     * 
     * 
     * @return
     *     The securityContextConstraintsList
     */
    @JsonProperty("SecurityContextConstraintsList")
    public SecurityContextConstraintsList getSecurityContextConstraintsList() {
        return securityContextConstraintsList;
    }

    /**
     * 
     * 
     * @param securityContextConstraintsList
     *     The SecurityContextConstraintsList
     */
    @JsonProperty("SecurityContextConstraintsList")
    public void setSecurityContextConstraintsList(SecurityContextConstraintsList securityContextConstraintsList) {
        this.securityContextConstraintsList = securityContextConstraintsList;
    }

    /**
     * 
     * 
     * @return
     *     The serviceAccount
     */
    @JsonProperty("ServiceAccount")
    public ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    /**
     * 
     * 
     * @param serviceAccount
     *     The ServiceAccount
     */
    @JsonProperty("ServiceAccount")
    public void setServiceAccount(ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * 
     * 
     * @return
     *     The serviceAccountList
     */
    @JsonProperty("ServiceAccountList")
    public ServiceAccountList getServiceAccountList() {
        return serviceAccountList;
    }

    /**
     * 
     * 
     * @param serviceAccountList
     *     The ServiceAccountList
     */
    @JsonProperty("ServiceAccountList")
    public void setServiceAccountList(ServiceAccountList serviceAccountList) {
        this.serviceAccountList = serviceAccountList;
    }

    /**
     * 
     * 
     * @return
     *     The serviceList
     */
    @JsonProperty("ServiceList")
    public ServiceList getServiceList() {
        return serviceList;
    }

    /**
     * 
     * 
     * @param serviceList
     *     The ServiceList
     */
    @JsonProperty("ServiceList")
    public void setServiceList(ServiceList serviceList) {
        this.serviceList = serviceList;
    }

    /**
     * 
     * 
     * @return
     *     The statefulSet
     */
    @JsonProperty("StatefulSet")
    public StatefulSet getStatefulSet() {
        return statefulSet;
    }

    /**
     * 
     * 
     * @param statefulSet
     *     The StatefulSet
     */
    @JsonProperty("StatefulSet")
    public void setStatefulSet(StatefulSet statefulSet) {
        this.statefulSet = statefulSet;
    }

    /**
     * 
     * 
     * @return
     *     The statefulSetList
     */
    @JsonProperty("StatefulSetList")
    public StatefulSetList getStatefulSetList() {
        return statefulSetList;
    }

    /**
     * 
     * 
     * @param statefulSetList
     *     The StatefulSetList
     */
    @JsonProperty("StatefulSetList")
    public void setStatefulSetList(StatefulSetList statefulSetList) {
        this.statefulSetList = statefulSetList;
    }

    /**
     * 
     * 
     * @return
     *     The status
     */
    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * 
     * @param status
     *     The Status
     */
    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * 
     * @return
     *     The storageClass
     */
    @JsonProperty("StorageClass")
    public StorageClass getStorageClass() {
        return storageClass;
    }

    /**
     * 
     * 
     * @param storageClass
     *     The StorageClass
     */
    @JsonProperty("StorageClass")
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * 
     * 
     * @return
     *     The storageClassList
     */
    @JsonProperty("StorageClassList")
    public StorageClassList getStorageClassList() {
        return storageClassList;
    }

    /**
     * 
     * 
     * @param storageClassList
     *     The StorageClassList
     */
    @JsonProperty("StorageClassList")
    public void setStorageClassList(StorageClassList storageClassList) {
        this.storageClassList = storageClassList;
    }

    /**
     * 
     * 
     * @return
     *     The subjectAccessReview
     */
    @JsonProperty("SubjectAccessReview")
    public io.fabric8.openshift.api.model.SubjectAccessReview getSubjectAccessReview() {
        return subjectAccessReview;
    }

    /**
     * 
     * 
     * @param subjectAccessReview
     *     The SubjectAccessReview
     */
    @JsonProperty("SubjectAccessReview")
    public void setSubjectAccessReview(io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReview) {
        this.subjectAccessReview = subjectAccessReview;
    }

    /**
     * 
     * 
     * @return
     *     The subjectAccessReviewResponse
     */
    @JsonProperty("SubjectAccessReviewResponse")
    public SubjectAccessReviewResponse getSubjectAccessReviewResponse() {
        return subjectAccessReviewResponse;
    }

    /**
     * 
     * 
     * @param subjectAccessReviewResponse
     *     The SubjectAccessReviewResponse
     */
    @JsonProperty("SubjectAccessReviewResponse")
    public void setSubjectAccessReviewResponse(SubjectAccessReviewResponse subjectAccessReviewResponse) {
        this.subjectAccessReviewResponse = subjectAccessReviewResponse;
    }

    /**
     * 
     * 
     * @return
     *     The tagEvent
     */
    @JsonProperty("TagEvent")
    public TagEvent getTagEvent() {
        return tagEvent;
    }

    /**
     * 
     * 
     * @param tagEvent
     *     The TagEvent
     */
    @JsonProperty("TagEvent")
    public void setTagEvent(TagEvent tagEvent) {
        this.tagEvent = tagEvent;
    }

    /**
     * 
     * 
     * @return
     *     The template
     */
    @JsonProperty("Template")
    public Template getTemplate() {
        return template;
    }

    /**
     * 
     * 
     * @param template
     *     The Template
     */
    @JsonProperty("Template")
    public void setTemplate(Template template) {
        this.template = template;
    }

    /**
     * 
     * 
     * @return
     *     The templateList
     */
    @JsonProperty("TemplateList")
    public TemplateList getTemplateList() {
        return templateList;
    }

    /**
     * 
     * 
     * @param templateList
     *     The TemplateList
     */
    @JsonProperty("TemplateList")
    public void setTemplateList(TemplateList templateList) {
        this.templateList = templateList;
    }

    /**
     * 
     * 
     * @return
     *     The tokenReview
     */
    @JsonProperty("TokenReview")
    public TokenReview getTokenReview() {
        return tokenReview;
    }

    /**
     * 
     * 
     * @param tokenReview
     *     The TokenReview
     */
    @JsonProperty("TokenReview")
    public void setTokenReview(TokenReview tokenReview) {
        this.tokenReview = tokenReview;
    }

    /**
     * 
     * 
     * @return
     *     The toleration
     */
    @JsonProperty("Toleration")
    public Toleration getToleration() {
        return toleration;
    }

    /**
     * 
     * 
     * @param toleration
     *     The Toleration
     */
    @JsonProperty("Toleration")
    public void setToleration(Toleration toleration) {
        this.toleration = toleration;
    }

    /**
     * 
     * 
     * @return
     *     The typeMeta
     */
    @JsonProperty("TypeMeta")
    public TypeMeta getTypeMeta() {
        return typeMeta;
    }

    /**
     * 
     * 
     * @param typeMeta
     *     The TypeMeta
     */
    @JsonProperty("TypeMeta")
    public void setTypeMeta(TypeMeta typeMeta) {
        this.typeMeta = typeMeta;
    }

    /**
     * 
     * 
     * @return
     *     The user
     */
    @JsonProperty("User")
    public User getUser() {
        return user;
    }

    /**
     * 
     * 
     * @param user
     *     The User
     */
    @JsonProperty("User")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * 
     * @return
     *     The userList
     */
    @JsonProperty("UserList")
    public UserList getUserList() {
        return userList;
    }

    /**
     * 
     * 
     * @param userList
     *     The UserList
     */
    @JsonProperty("UserList")
    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    /**
     * 
     * 
     * @return
     *     The validatingWebhookConfiguration
     */
    @JsonProperty("ValidatingWebhookConfiguration")
    public ValidatingWebhookConfiguration getValidatingWebhookConfiguration() {
        return validatingWebhookConfiguration;
    }

    /**
     * 
     * 
     * @param validatingWebhookConfiguration
     *     The ValidatingWebhookConfiguration
     */
    @JsonProperty("ValidatingWebhookConfiguration")
    public void setValidatingWebhookConfiguration(ValidatingWebhookConfiguration validatingWebhookConfiguration) {
        this.validatingWebhookConfiguration = validatingWebhookConfiguration;
    }

    /**
     * 
     * 
     * @return
     *     The validatingWebhookConfigurationList
     */
    @JsonProperty("ValidatingWebhookConfigurationList")
    public ValidatingWebhookConfigurationList getValidatingWebhookConfigurationList() {
        return validatingWebhookConfigurationList;
    }

    /**
     * 
     * 
     * @param validatingWebhookConfigurationList
     *     The ValidatingWebhookConfigurationList
     */
    @JsonProperty("ValidatingWebhookConfigurationList")
    public void setValidatingWebhookConfigurationList(ValidatingWebhookConfigurationList validatingWebhookConfigurationList) {
        this.validatingWebhookConfigurationList = validatingWebhookConfigurationList;
    }

    /**
     * 
     * 
     * @return
     *     The watchEvent
     */
    @JsonProperty("WatchEvent")
    public WatchEvent getWatchEvent() {
        return watchEvent;
    }

    /**
     * 
     * 
     * @param watchEvent
     *     The WatchEvent
     */
    @JsonProperty("WatchEvent")
    public void setWatchEvent(WatchEvent watchEvent) {
        this.watchEvent = watchEvent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
