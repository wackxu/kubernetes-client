package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.model.apps.ReplicaSetCondition;
import io.fabric8.kubernetes.api.model.batch.CronJobSpec;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListFluent;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfigBuilder;
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes;
import io.fabric8.openshift.api.model.BuildStatusOutputToBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition;
import io.fabric8.kubernetes.api.model.extensions.IngressTLSFluent;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesFluent;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBoolFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatusFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.openshift.api.model.ConfigMapBuildSource;
import io.fabric8.openshift.api.model.RouteIngressConditionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScale;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersion;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingListFluent;
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptionsBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluent;
import io.fabric8.openshift.api.model.ProjectStatusBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressListFluent;
import io.fabric8.openshift.api.model.ParameterFluent;
import io.fabric8.openshift.api.model.NamedTagEventListFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionReview;
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReference;
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategyBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsBuilder;
import io.fabric8.openshift.api.model.SecretSpecBuilder;
import io.fabric8.openshift.api.model.ImageListFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourcesFluent;
import io.fabric8.openshift.api.model.ImageStreamTagBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatusBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReferenceBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec;
import io.fabric8.openshift.api.model.RouteSpec;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.openshift.api.model.RunAsUserStrategyOptions;
import io.fabric8.openshift.api.model.GenericWebHookCause;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsBuilder;
import io.fabric8.openshift.api.model.SignatureCondition;
import io.fabric8.openshift.api.model.SourceBuildStrategyBuilder;
import io.fabric8.openshift.api.model.ImageSourceFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.openshift.api.model.BuildFluent;
import io.fabric8.openshift.api.model.BuildBuilder;
import io.fabric8.openshift.api.model.ProjectSpec;
import io.fabric8.kubernetes.api.model.rbac.RoleListBuilder;
import io.fabric8.openshift.api.model.ImageFluent;
import io.fabric8.kubernetes.api.model.version.InfoBuilder;
import io.fabric8.openshift.api.model.GitLabWebHookCauseBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListBuilder;
import io.fabric8.openshift.api.model.ParameterBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecBuilder;
import io.fabric8.openshift.api.model.BuildSource;
import io.fabric8.openshift.api.model.OAuthAccessTokenList;
import io.fabric8.kubernetes.api.model.extensions.ScaleSpecFluent;
import io.fabric8.openshift.api.model.ImageSignature;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigListBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolumeFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluent;
import io.fabric8.openshift.api.model.WebHookTriggerBuilder;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPathFluent;
import io.fabric8.openshift.api.model.DeploymentConfigSpecBuilder;
import io.fabric8.kubernetes.api.model.extensions.RollbackConfigBuilder;
import io.fabric8.openshift.api.model.ImageChangeTriggerFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionFluent;
import io.fabric8.openshift.api.model.GroupListFluent;
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParamsFluent;
import io.fabric8.openshift.api.model.SourceControlUser;
import io.fabric8.openshift.api.model.GitHubWebHookCause;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.openshift.api.model.BuildTriggerPolicyBuilder;
import io.fabric8.openshift.api.model.SourceBuildStrategy;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluent;
import io.fabric8.openshift.api.model.CustomBuildStrategy;
import io.fabric8.kubernetes.api.model.extensions.IngressStatus;
import io.fabric8.openshift.api.model.NamedTagEventListBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeploymentFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobStatus;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluent;
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParamsFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressSpecBuilder;
import io.fabric8.openshift.api.model.ImageSource;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.openshift.api.model.ImageImportStatusBuilder;
import io.fabric8.openshift.api.model.ImageStreamSpec;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptionsFluent;
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptionsBuilder;
import io.fabric8.kubernetes.api.model.batch.JobStatusFluent;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.ImageSourcePathBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceColumnDefinitionBuilder;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.kubernetes.api.model.runtime.RawExtensionBuilder;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentationFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.openshift.api.model.TagEventConditionFluent;
import io.fabric8.openshift.api.model.BuildStatusOutputBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentConditionFluent;
import io.fabric8.openshift.api.model.WebHookTriggerFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptions;
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributesBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpecFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategyBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray;
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParamsBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus;
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatus;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatusFluent;
import io.fabric8.openshift.api.model.BuildConfigListFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestrictionFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecFluent;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusFluent;
import io.fabric8.openshift.api.model.StepInfoFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressListBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpecBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobListFluent;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.openshift.api.model.UserListFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingListBuilder;
import io.fabric8.openshift.api.model.DeploymentCauseBuilder;
import io.fabric8.openshift.api.model.SecretBuildSource;
import io.fabric8.openshift.api.model.TagReferenceFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpecBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetCondition;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluent;
import io.fabric8.openshift.api.model.DeploymentConfigList;
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategyBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation;
import io.fabric8.openshift.api.model.DeploymentTriggerPolicy;
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParamsBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleFluent;
import io.fabric8.openshift.api.model.ProjectSpecBuilder;
import io.fabric8.openshift.api.model.LifecycleHookFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategyFluent;
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressRule;
import io.fabric8.openshift.api.model.SecretLocalReference;
import java.lang.Boolean;
import io.fabric8.openshift.api.model.RoutePort;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListBuilder;
import io.fabric8.openshift.api.model.GitBuildSource;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategyFluent;
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecBuilder;
import io.fabric8.openshift.api.model.UserRestriction;
import io.fabric8.openshift.api.model.ImageChangeCause;
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams;
import io.fabric8.openshift.api.model.TemplateListBuilder;
import io.fabric8.openshift.api.model.TagImageHook;
import io.fabric8.kubernetes.api.model.authentication.UserInfoFluent;
import io.fabric8.openshift.api.model.TagImageHookBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetConditionFluent;
import io.fabric8.openshift.api.model.ProjectStatus;
import io.fabric8.openshift.api.model.TemplateListFluent;
import io.fabric8.openshift.api.model.ImageStreamSpecBuilder;
import io.fabric8.openshift.api.model.RouteFluent;
import io.fabric8.openshift.api.model.SourceStrategyOptions;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperations;
import io.fabric8.openshift.api.model.GitHubWebHookCauseBuilder;
import io.fabric8.openshift.api.model.GitSourceRevisionFluent;
import io.fabric8.openshift.api.model.BitbucketWebHookCause;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.openshift.api.model.BuildConfigStatus;
import io.fabric8.openshift.api.model.BuildPostCommitSpecFluent;
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptions;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.openshift.api.model.OAuthClientListFluent;
import io.fabric8.openshift.api.model.TagEvent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentListFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversionFluent;
import io.fabric8.openshift.api.model.ImageStreamImportStatusBuilder;
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParamsFluent;
import io.fabric8.openshift.api.model.GitSourceRevision;
import io.fabric8.openshift.api.model.NetNamespaceFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobSpecFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressSpec;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversion;
import io.fabric8.openshift.api.model.ServiceAccountRestrictionBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest;
import io.fabric8.openshift.api.model.BuildSpecBuilder;
import io.fabric8.kubernetes.api.model.batch.JobListBuilder;
import io.fabric8.openshift.api.model.SourceControlUserBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRuleFluent;
import io.fabric8.openshift.api.model.BuildStrategy;
import io.fabric8.kubernetes.api.model.extensions.IngressRuleFluent;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluent;
import io.fabric8.openshift.api.model.DockerStrategyOptionsFluent;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenListFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatusBuilder;
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptionsFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatusBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidationFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluent;
import io.fabric8.openshift.api.model.SignatureSubjectBuilder;
import io.fabric8.openshift.api.model.RouteIngressConditionFluent;
import io.fabric8.openshift.api.model.WebHookTrigger;
import io.fabric8.openshift.api.model.ImageStreamImportFluent;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleBuilder;
import io.fabric8.openshift.api.model.ImageStreamStatusBuilder;
import io.fabric8.openshift.api.model.DeploymentCauseImageTriggerFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluent;
import io.fabric8.openshift.api.model.ImageSignatureBuilder;
import io.fabric8.openshift.api.model.DockerStrategyOptions;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList;
import io.fabric8.openshift.api.model.BuildStrategyFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversionBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressSpecFluent;
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentation;
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatusFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.openshift.api.model.RouteIngressCondition;
import io.fabric8.openshift.api.model.DeploymentTriggerPolicyFluent;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptionsFluent;
import io.fabric8.openshift.api.model.ImageStreamTagListFluent;
import io.fabric8.openshift.api.model.SourceStrategyOptionsBuilder;
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.TagEventConditionBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressBackendFluent;
import io.fabric8.kubernetes.api.model.apiextensions.JSON;
import io.fabric8.kubernetes.api.model.authentication.UserInfoBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatus;
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributesFluent;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec;
import io.fabric8.openshift.api.model.UserList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec;
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParamsFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListFluent;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec;
import io.fabric8.kubernetes.api.model.settings.PodPresetListFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec;
import io.fabric8.openshift.api.model.BitbucketWebHookCauseBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigSpecFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleRefBuilder;
import io.fabric8.openshift.api.model.BuildStatusOutputToFluent;
import io.fabric8.openshift.api.model.BuildStatusBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArrayBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluent;
import io.fabric8.openshift.api.model.RouteIngressFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetList;
import io.fabric8.openshift.api.model.BuildSourceBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluent;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.openshift.api.model.BuildStatusFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpecBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.extensions.HostPortRangeFluent;
import io.fabric8.openshift.api.model.StepInfo;
import io.fabric8.kubernetes.api.model.apps.DeploymentStatusFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressStatusFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassList;
import io.fabric8.openshift.api.model.BuildStatusOutputTo;
import io.fabric8.openshift.api.model.SecretSpecFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleListFluent;
import io.fabric8.openshift.api.model.RouteListFluent;
import io.fabric8.openshift.api.model.RouteIngressBuilder;
import io.fabric8.kubernetes.api.model.batch.JobSpec;
import io.fabric8.kubernetes.api.model.apps.DeploymentStatus;
import io.fabric8.openshift.api.model.ImageStreamImportSpecFluent;
import io.fabric8.openshift.api.model.GenericWebHookCauseFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidationBuilder;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleFluent;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.openshift.api.model.NetNamespaceListBuilder;
import io.fabric8.openshift.api.model.SourceRevisionBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams;
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptionsBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentationBuilder;
import io.fabric8.openshift.api.model.GitBuildSourceBuilder;
import io.fabric8.openshift.api.model.BuildConfigStatusBuilder;
import io.fabric8.openshift.api.model.BuildPostCommitSpec;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.batch.JobConditionBuilder;
import io.fabric8.openshift.api.model.ImageStreamFluent;
import io.fabric8.openshift.api.model.BinaryBuildSource;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpecFluent;
import io.fabric8.openshift.api.model.RouteIngress;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBoolBuilder;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams;
import io.fabric8.kubernetes.api.model.extensions.ScaleSpecBuilder;
import io.fabric8.openshift.api.model.SourceRevision;
import io.fabric8.openshift.api.model.LifecycleHook;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.openshift.api.model.ImageStreamSpecFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpecFluent;
import io.fabric8.openshift.api.model.BuildStatus;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersionFluent;
import io.fabric8.kubernetes.api.model.extensions.IDRange;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListFluent;
import io.fabric8.openshift.api.model.BuildPostCommitSpecBuilder;
import io.fabric8.openshift.api.model.BitbucketWebHookCauseFluent;
import io.fabric8.openshift.api.model.GitSourceRevisionBuilder;
import io.fabric8.openshift.api.model.IdentityListBuilder;
import io.fabric8.kubernetes.api.model.extensions.HostPortRangeBuilder;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.kubernetes.api.model.apps.DeploymentCondition;
import io.fabric8.kubernetes.api.model.rbac.PolicyRule;
import io.fabric8.openshift.api.model.CustomBuildStrategyBuilder;
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptionsFluent;
import io.fabric8.openshift.api.model.TLSConfigBuilder;
import io.fabric8.openshift.api.model.BuildConfigList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListFluent;
import io.fabric8.openshift.api.model.ProjectSpecFluent;
import io.fabric8.openshift.api.model.GroupRestrictionBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetConditionBuilder;
import io.fabric8.kubernetes.api.model.runtime.RawExtensionFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy;
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptions;
import io.fabric8.openshift.api.model.ImageLabelBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListFluent;
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatusBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetConditionFluent;
import io.fabric8.openshift.api.model.ExecNewPodHook;
import io.fabric8.openshift.api.model.UserListBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRule;
import io.fabric8.openshift.api.model.GroupRestrictionFluent;
import io.fabric8.openshift.api.model.BuildTriggerCause;
import io.fabric8.openshift.api.model.DeploymentDetails;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListFluent;
import io.fabric8.openshift.api.model.ImageLayer;
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListBuilder;
import io.fabric8.openshift.api.model.ImageLayerFluent;
import io.fabric8.openshift.api.model.DockerBuildStrategyBuilder;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPathBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassList;
import io.fabric8.openshift.api.model.UserRestrictionFluent;
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec;
import io.fabric8.openshift.api.model.BuildSpecFluent;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentStatusBuilder;
import io.fabric8.openshift.api.model.RoutePortBuilder;
import io.fabric8.openshift.api.model.ImageSourcePath;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseFluent;
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolume;
import io.fabric8.openshift.api.model.UserRestrictionBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.ImageStreamListBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatusFluent;
import io.fabric8.kubernetes.api.model.runtime.RawExtension;
import io.fabric8.openshift.api.model.GenericWebHookCauseBuilder;
import io.fabric8.openshift.api.model.ProjectStatusFluent;
import io.fabric8.openshift.api.model.TemplateList;
import io.fabric8.openshift.api.model.DockerBuildStrategy;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeerFluent;
import io.fabric8.openshift.api.model.BuildList;
import io.fabric8.openshift.api.model.OAuthClientListBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagListBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import io.fabric8.openshift.api.model.IdentityList;
import java.lang.String;
import io.fabric8.openshift.api.model.LifecycleHookBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleRefFluent;
import io.fabric8.openshift.api.model.ImageLookupPolicyFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetConditionBuilder;
import io.fabric8.openshift.api.model.DeploymentDetailsFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetConditionFluent;
import io.fabric8.openshift.api.model.ImageChangeTriggerBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPathBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListBuilder;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.openshift.api.model.StageInfo;
import io.fabric8.kubernetes.api.model.extensions.HostPortRange;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRuleBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpecBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetList;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestBuilder;
import io.fabric8.openshift.api.model.ProjectList;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatus;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListFluent;
import io.fabric8.openshift.api.model.GitLabWebHookCause;
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatusFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressBackendBuilder;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.openshift.api.model.RepositoryImportStatusFluent;
import io.fabric8.openshift.api.model.Parameter;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRuleBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestriction;
import io.fabric8.openshift.api.model.RouteSpecFluent;
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpecFluent;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.kubernetes.api.model.extensions.IDRangeFluent;
import io.fabric8.openshift.api.model.BuildStrategyBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListFluent;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpecBuilder;
import io.fabric8.kubernetes.api.model.authentication.UserInfo;
import io.fabric8.openshift.api.model.ProjectListFluent;
import io.fabric8.openshift.api.model.BuildTriggerCauseBuilder;
import io.fabric8.openshift.api.model.BuildSpec;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListFluent;
import io.fabric8.openshift.api.model.RepositoryImportSpecBuilder;
import io.fabric8.kubernetes.api.model.version.Info;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.openshift.api.model.TagReferencePolicyFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluent;
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpecFluent;
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpecBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluent;
import io.fabric8.kubernetes.api.model.networking.IPBlockFluent;
import io.fabric8.openshift.api.model.DeploymentTriggerPolicyBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobList;
import io.fabric8.openshift.api.model.RepositoryImportSpec;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPortFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArrayFluent;
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListFluent;
import io.fabric8.openshift.api.model.RepositoryImportStatusBuilder;
import io.fabric8.openshift.api.model.StepInfoBuilder;
import io.fabric8.openshift.api.model.BinaryBuildSourceBuilder;
import io.fabric8.openshift.api.model.ImageListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobCondition;
import io.fabric8.openshift.api.model.RouteTargetReferenceFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleRef;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListBuilder;
import io.fabric8.openshift.api.model.RouteStatusFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobFluent;
import io.fabric8.openshift.api.model.BuildOutputFluent;
import io.fabric8.openshift.api.model.RouteSpecBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressRuleBuilder;
import io.fabric8.openshift.api.model.BinaryBuildSourceFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressFluent;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatusBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec;
import io.fabric8.openshift.api.model.StageInfoFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList;
import io.fabric8.openshift.api.model.ImageSourcePathFluent;
import io.fabric8.openshift.api.model.SignatureSubjectFluent;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValueFluent;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.openshift.api.model.ImageLookupPolicyBuilder;
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptionsFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList;
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestCondition;
import io.fabric8.openshift.api.model.ServiceAccountReferenceBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.openshift.api.model.ServiceAccountRestrictionFluent;
import io.fabric8.openshift.api.model.RunAsUserStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.BuildConfigStatusFluent;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSetFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourcesBuilder;
import io.fabric8.openshift.api.model.ConfigMapBuildSourceFluent;
import io.fabric8.openshift.api.model.BuildOutput;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategy;
import io.fabric8.kubernetes.api.model.rbac.PolicyRuleFluent;
import io.fabric8.kubernetes.api.model.batch.JobStatusBuilder;
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger;
import io.fabric8.openshift.api.model.ImageStreamImportStatusFluent;
import io.fabric8.openshift.api.model.BuildTriggerPolicy;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategyBuilder;
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.TagReference;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScaleBuilder;
import io.fabric8.openshift.api.model.RouteListBuilder;
import io.fabric8.openshift.api.model.ImageImportSpec;
import io.fabric8.openshift.api.model.IdentityListFluent;
import io.fabric8.kubernetes.api.model.rbac.AggregationRule;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackFluent;
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions;
import io.fabric8.kubernetes.api.model.networking.IPBlock;
import io.fabric8.kubernetes.api.model.apps.DaemonSetCondition;
import io.fabric8.openshift.api.model.TagImportPolicyBuilder;
import io.fabric8.openshift.api.model.ImageChangeTrigger;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluent;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatusBuilder;
import io.fabric8.kubernetes.api.model.batch.JobSpecFluent;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpecFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec;
import io.fabric8.openshift.api.model.SourceRevisionFluent;
import java.lang.Long;
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatus;
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributesBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluent;
import io.fabric8.openshift.api.model.SignatureIssuerFluent;
import io.fabric8.openshift.api.model.ImageImportStatusFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.openshift.api.model.ExecNewPodHookBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScaleFluent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptionsFluent;
import io.fabric8.openshift.api.model.DeploymentConfigFluent;
import io.fabric8.kubernetes.api.model.version.InfoFluent;
import io.fabric8.openshift.api.model.RouteList;
import io.fabric8.openshift.api.model.ImageChangeCauseBuilder;
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParamsBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeploymentBuilder;
import io.fabric8.kubernetes.api.model.rbac.SubjectBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleFluent;
import io.fabric8.openshift.api.model.ImageStreamList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeerBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONBuilder;
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPathFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList;
import javax.validation.Valid;
import io.fabric8.openshift.api.model.ProjectRequest;
import io.fabric8.kubernetes.api.model.admissionregistration.Rule;
import io.fabric8.openshift.api.model.OAuthAccessTokenListBuilder;
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributesFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategyBuilder;
import io.fabric8.openshift.api.model.ConfigMapBuildSourceBuilder;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValueBuilder;
import io.fabric8.openshift.api.model.GroupFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigListFluent;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluent;
import io.fabric8.openshift.api.model.SecretBuildSourceFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewBuilder;
import io.fabric8.openshift.api.model.TagReferenceBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluent;
import io.fabric8.kubernetes.api.model.rbac.RoleListFluent;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluent;
import io.fabric8.openshift.api.model.ImageList;
import io.fabric8.openshift.api.model.StageInfoBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluent;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue;
import io.fabric8.kubernetes.api.model.extensions.ScaleStatusBuilder;
import io.fabric8.kubernetes.api.model.extensions.RollbackConfigFluent;
import io.fabric8.openshift.api.model.GroupRestriction;
import io.fabric8.kubernetes.api.model.batch.CronJobListFluent;
import io.fabric8.openshift.api.model.ImageLabelFluent;
import io.fabric8.openshift.api.model.DeploymentCauseFluent;
import io.fabric8.openshift.api.model.ImageSignatureFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceColumnDefinition;
import io.fabric8.openshift.api.model.TagImportPolicy;
import io.fabric8.openshift.api.model.RunAsUserStrategyOptionsFluent;
import io.fabric8.openshift.api.model.ImageStreamImportSpec;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames;
import io.fabric8.openshift.api.model.SignatureIssuer;
import io.fabric8.openshift.api.model.SourceControlUserFluent;
import io.fabric8.openshift.api.model.DeploymentConfigStatusBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetList;
import io.fabric8.openshift.api.model.DeploymentConfigSpec;
import io.fabric8.openshift.api.model.IdentityFluent;
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolumeBuilder;
import io.fabric8.openshift.api.model.TagImageHookFluent;
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPath;
import io.fabric8.openshift.api.model.ImageImportSpecBuilder;
import io.fabric8.openshift.api.model.ImageStreamStatusFluent;
import io.fabric8.openshift.api.model.SecretLocalReferenceFluent;
import io.fabric8.openshift.api.model.ImageLayerBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec;
import io.fabric8.openshift.api.model.NetNamespaceList;
import io.fabric8.kubernetes.api.model.batch.CronJobSpecBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList;
import io.fabric8.kubernetes.api.model.batch.JobFluent;
import io.fabric8.openshift.api.model.BuildConfigListBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluent;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatusBuilder;
import io.fabric8.kubernetes.api.model.rbac.PolicyRuleBuilder;
import io.fabric8.openshift.api.model.BuildTriggerCauseFluent;
import io.fabric8.openshift.api.model.BuildOutputBuilder;
import io.fabric8.kubernetes.api.model.batch.JobList;
import io.fabric8.kubernetes.api.model.batch.CronJobListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionBuilder;
import io.fabric8.openshift.api.model.SecretBuildSourceBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookFluent;
import io.fabric8.openshift.api.model.TagReferencePolicy;
import io.fabric8.openshift.api.model.NamedTagEventList;
import io.fabric8.openshift.api.model.CustomBuildStrategyFluent;
import io.fabric8.openshift.api.model.ImageSourceBuilder;
import io.fabric8.openshift.api.model.TagEventCondition;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.GroupListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpecFluent;
import io.fabric8.openshift.api.model.GroupList;
import io.fabric8.openshift.api.model.ImageStreamImportSpecBuilder;
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes;
import io.fabric8.openshift.api.model.BuildConfigSpecBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPort;
import io.fabric8.openshift.api.model.BuildListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluent;
import io.fabric8.openshift.api.model.ImageStreamImportStatus;
import io.fabric8.openshift.api.model.SignatureIssuerBuilder;
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategyFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressList;
import io.fabric8.openshift.api.model.ScopeRestrictionFluent;
import io.fabric8.kubernetes.api.model.extensions.IDRangeBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSetBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpecFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraintsList;
import io.fabric8.openshift.api.model.RouteStatusBuilder;
import io.fabric8.kubernetes.api.model.batch.JobConditionFluent;
import io.fabric8.openshift.api.model.SignatureConditionFluent;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecFluent;
import io.fabric8.openshift.api.model.Image;
import io.fabric8.openshift.api.model.ImageStreamBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassListFluent;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.RouteTargetReferenceBuilder;
import io.fabric8.openshift.api.model.BuildConfigSpecFluent;
import io.fabric8.openshift.api.model.TLSConfigFluent;
import io.fabric8.openshift.api.model.TagImportPolicyFluent;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListBuilder;
import io.fabric8.openshift.api.model.SourceBuildStrategyFluent;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpecFluent;
import io.fabric8.openshift.api.model.ServiceAccountReference;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRule;
import java.util.Map;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.openshift.api.model.TagEventBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatusFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceColumnDefinitionFluent;
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpecBuilder;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpecBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluent;
import io.fabric8.openshift.api.model.SourceStrategyOptionsFluent;
import io.fabric8.openshift.api.model.TagEventFluent;
import io.fabric8.kubernetes.api.model.extensions.IngressTLS;
import io.fabric8.kubernetes.api.model.extensions.IngressBackend;
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategyFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleListBuilder;
import io.fabric8.openshift.api.model.ServiceAccountReferenceFluent;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec;
import io.fabric8.openshift.api.model.ProjectListBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleList;
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParamsBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.openshift.api.model.NetNamespaceListFluent;
import io.fabric8.openshift.api.model.ImageLabel;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobStatusFluent;
import io.fabric8.openshift.api.model.RoutePortFluent;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListFluent;
import io.fabric8.openshift.api.model.DeploymentDetailsBuilder;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.kubernetes.api.model.rbac.SubjectFluent;
import io.fabric8.openshift.api.model.ImageImportStatus;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusFluent;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse;
import io.fabric8.openshift.api.model.BuildSourceFluent;
import io.fabric8.openshift.api.model.RouteStatus;
import io.fabric8.openshift.api.model.BuildStatusOutput;
import io.fabric8.openshift.api.model.SignatureConditionBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagFluent;
import io.fabric8.openshift.api.model.DeploymentCause;
import io.fabric8.openshift.api.model.RepositoryImportStatus;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfigFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.openshift.api.model.BuildRequestFluent;
import io.fabric8.openshift.api.model.RepositoryImportSpecFluent;
import io.fabric8.openshift.api.model.ImageImportSpecFluent;
import io.fabric8.openshift.api.model.DeploymentConfigStatus;
import io.fabric8.kubernetes.api.model.apps.DeploymentConditionBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentListBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.openshift.api.model.BuildConfigSpec;
import io.fabric8.kubernetes.api.model.apps.DaemonSetConditionBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluent;
import io.fabric8.openshift.api.model.DeploymentConfigStatusFluent;
import io.fabric8.openshift.api.model.BuildStatusOutputFluent;
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy;
import io.fabric8.kubernetes.api.model.extensions.IngressStatusBuilder;
import io.fabric8.openshift.api.model.GitBuildSourceFluent;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool;
import io.fabric8.openshift.api.model.ImageStreamStatus;
import io.fabric8.openshift.api.model.ProjectRequestFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleList;
import io.fabric8.openshift.api.model.ServiceAccountRestriction;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestrictionBuilder;
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.ExecNewPodHookFluent;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersionBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpecFluent;
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReferenceFluent;
import io.fabric8.openshift.api.model.OAuthClientFluent;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluent;
import io.fabric8.kubernetes.api.model.batch.JobSpecBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPortBuilder;
import io.fabric8.openshift.api.model.OAuthClientList;
import io.fabric8.openshift.api.model.ProjectFluent;
import io.fabric8.openshift.api.model.ImageBuilder;
import io.fabric8.openshift.api.model.BuildTriggerPolicyFluent;
import io.fabric8.openshift.api.model.SecretSpec;
import io.fabric8.openshift.api.model.SecretLocalReferenceBuilder;
import io.fabric8.kubernetes.api.model.rbac.Subject;
import io.fabric8.openshift.api.model.ScopeRestriction;
import java.lang.Integer;
import io.fabric8.openshift.api.model.SignatureSubject;
import io.fabric8.kubernetes.api.model.networking.IPBlockBuilder;
import io.fabric8.openshift.api.model.UserFluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.openshift.api.model.DockerStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleStatusFluent;
import io.fabric8.openshift.api.model.DeploymentCauseImageTriggerBuilder;
import io.fabric8.openshift.api.model.Identity;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesBuilder;
import io.fabric8.openshift.api.model.ImageChangeCauseFluent;
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions;
import io.fabric8.openshift.api.model.BuildConfigFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRuleFluent;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.extensions.ScaleStatus;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray;
import io.fabric8.openshift.api.model.ImageStreamTagList;
import io.fabric8.openshift.api.model.ImageLookupPolicy;
import io.fabric8.kubernetes.api.model.batch.JobStatus;
import io.fabric8.openshift.api.model.TagReferencePolicyBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressTLSBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobStatusBuilder;
import io.fabric8.openshift.api.model.TLSConfig;
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListFluent;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpecBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus;
import io.fabric8.openshift.api.model.BuildConfigBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassListBuilder;
import io.fabric8.openshift.api.model.GitHubWebHookCauseFluent;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingList;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.openshift.api.model.BuildListFluent;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.openshift.api.model.ScopeRestrictionBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment;
import io.fabric8.openshift.api.model.DockerBuildStrategyFluent;
import io.fabric8.openshift.api.model.RouteTargetReference;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategyFluent;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.openshift.api.model.ImageStreamListFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluent;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatusFluent;
import io.fabric8.openshift.api.model.TemplateFluent;
import io.fabric8.openshift.api.model.GitLabWebHookCauseFluent;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpecBuilder;

public interface WatchEventFluent<A extends WatchEventFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public KubernetesResource getObject();
    public KubernetesResource buildObject();
    public A withObject(KubernetesResource object);
    public Boolean hasObject();
    public A withPatchObject(Patch patchObject);
    public WatchEventFluent.PatchObjectNested<A> withNewPatchObject();
    public WatchEventFluent.PatchObjectNested<A> withNewPatchObjectLike(Patch item);
    public A withDeploymentListObject(DeploymentList deploymentListObject);
    public WatchEventFluent.DeploymentListObjectNested<A> withNewDeploymentListObject();
    public WatchEventFluent.DeploymentListObjectNested<A> withNewDeploymentListObjectLike(DeploymentList item);
    public A withScopeRestrictionObject(ScopeRestriction scopeRestrictionObject);
    public WatchEventFluent.ScopeRestrictionObjectNested<A> withNewScopeRestrictionObject();
    public WatchEventFluent.ScopeRestrictionObjectNested<A> withNewScopeRestrictionObjectLike(ScopeRestriction item);
    public A withPodsMetricSourceObject(PodsMetricSource podsMetricSourceObject);
    public WatchEventFluent.PodsMetricSourceObjectNested<A> withNewPodsMetricSourceObject();
    public WatchEventFluent.PodsMetricSourceObjectNested<A> withNewPodsMetricSourceObjectLike(PodsMetricSource item);
    public A withStepInfoObject(StepInfo stepInfoObject);
    public WatchEventFluent.StepInfoObjectNested<A> withNewStepInfoObject();
    public WatchEventFluent.StepInfoObjectNested<A> withNewStepInfoObjectLike(StepInfo item);
    public A withNewStepInfoObject(Long durationMilliseconds,String name,String startTime);
    public A withStatefulSetStatusObject(StatefulSetStatus statefulSetStatusObject);
    public WatchEventFluent.StatefulSetStatusObjectNested<A> withNewStatefulSetStatusObject();
    public WatchEventFluent.StatefulSetStatusObjectNested<A> withNewStatefulSetStatusObjectLike(StatefulSetStatus item);
    public A withPodTemplateSpecObject(PodTemplateSpec podTemplateSpecObject);
    public WatchEventFluent.PodTemplateSpecObjectNested<A> withNewPodTemplateSpecObject();
    public WatchEventFluent.PodTemplateSpecObjectNested<A> withNewPodTemplateSpecObjectLike(PodTemplateSpec item);
    public A withAuthInfoObject(AuthInfo authInfoObject);
    public WatchEventFluent.AuthInfoObjectNested<A> withNewAuthInfoObject();
    public WatchEventFluent.AuthInfoObjectNested<A> withNewAuthInfoObjectLike(AuthInfo item);
    public A withConfigMapKeySelectorObject(ConfigMapKeySelector configMapKeySelectorObject);
    public WatchEventFluent.ConfigMapKeySelectorObjectNested<A> withNewConfigMapKeySelectorObject();
    public WatchEventFluent.ConfigMapKeySelectorObjectNested<A> withNewConfigMapKeySelectorObjectLike(ConfigMapKeySelector item);
    public A withNewConfigMapKeySelectorObject(String key,String name,Boolean optional);
    public A withRuleWithOperationsObject(RuleWithOperations ruleWithOperationsObject);
    public WatchEventFluent.RuleWithOperationsObjectNested<A> withNewRuleWithOperationsObject();
    public WatchEventFluent.RuleWithOperationsObjectNested<A> withNewRuleWithOperationsObjectLike(RuleWithOperations item);
    public A withHostPathVolumeSourceObject(HostPathVolumeSource hostPathVolumeSourceObject);
    public WatchEventFluent.HostPathVolumeSourceObjectNested<A> withNewHostPathVolumeSourceObject();
    public WatchEventFluent.HostPathVolumeSourceObjectNested<A> withNewHostPathVolumeSourceObjectLike(HostPathVolumeSource item);
    public A withNewHostPathVolumeSourceObject(String path,String type);
    public A withNamedContextObject(NamedContext namedContextObject);
    public WatchEventFluent.NamedContextObjectNested<A> withNewNamedContextObject();
    public WatchEventFluent.NamedContextObjectNested<A> withNewNamedContextObjectLike(NamedContext item);
    public A withConfigObject(Config configObject);
    public WatchEventFluent.ConfigObjectNested<A> withNewConfigObject();
    public WatchEventFluent.ConfigObjectNested<A> withNewConfigObjectLike(Config item);
    public A withPodPresetSpecObject(PodPresetSpec podPresetSpecObject);
    public WatchEventFluent.PodPresetSpecObjectNested<A> withNewPodPresetSpecObject();
    public WatchEventFluent.PodPresetSpecObjectNested<A> withNewPodPresetSpecObjectLike(PodPresetSpec item);
    public A withAffinityObject(Affinity affinityObject);
    public WatchEventFluent.AffinityObjectNested<A> withNewAffinityObject();
    public WatchEventFluent.AffinityObjectNested<A> withNewAffinityObjectLike(Affinity item);
    public A withResourceAttributesObject(ResourceAttributes resourceAttributesObject);
    public WatchEventFluent.ResourceAttributesObjectNested<A> withNewResourceAttributesObject();
    public WatchEventFluent.ResourceAttributesObjectNested<A> withNewResourceAttributesObjectLike(ResourceAttributes item);
    public A withSubjectAccessReviewSpecObject(SubjectAccessReviewSpec subjectAccessReviewSpecObject);
    public WatchEventFluent.SubjectAccessReviewSpecObjectNested<A> withNewSubjectAccessReviewSpecObject();
    public WatchEventFluent.SubjectAccessReviewSpecObjectNested<A> withNewSubjectAccessReviewSpecObjectLike(SubjectAccessReviewSpec item);
    public A withValidatingWebhookConfigurationObject(ValidatingWebhookConfiguration validatingWebhookConfigurationObject);
    public WatchEventFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObject();
    public WatchEventFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObjectLike(ValidatingWebhookConfiguration item);
    public A withPolicyRuleObject(io.fabric8.openshift.api.model.PolicyRule policyRuleObject);
    public WatchEventFluent.ModelPolicyRuleObjectNested<A> withNewModelPolicyRuleObject();
    public WatchEventFluent.ModelPolicyRuleObjectNested<A> withNewPolicyRuleObjectLike(io.fabric8.openshift.api.model.PolicyRule item);
    public A withNetworkPolicyEgressRuleObject(NetworkPolicyEgressRule networkPolicyEgressRuleObject);
    public WatchEventFluent.NetworkPolicyEgressRuleObjectNested<A> withNewNetworkPolicyEgressRuleObject();
    public WatchEventFluent.NetworkPolicyEgressRuleObjectNested<A> withNewNetworkPolicyEgressRuleObjectLike(NetworkPolicyEgressRule item);
    public A withIPBlockObject(IPBlock iPBlockObject);
    public WatchEventFluent.IPBlockObjectNested<A> withNewIPBlockObject();
    public WatchEventFluent.IPBlockObjectNested<A> withNewIPBlockObjectLike(IPBlock item);
    public A withDeploymentTriggerPolicyObject(DeploymentTriggerPolicy deploymentTriggerPolicyObject);
    public WatchEventFluent.DeploymentTriggerPolicyObjectNested<A> withNewDeploymentTriggerPolicyObject();
    public WatchEventFluent.DeploymentTriggerPolicyObjectNested<A> withNewDeploymentTriggerPolicyObjectLike(DeploymentTriggerPolicy item);
    public A withBuildStrategyObject(BuildStrategy buildStrategyObject);
    public WatchEventFluent.BuildStrategyObjectNested<A> withNewBuildStrategyObject();
    public WatchEventFluent.BuildStrategyObjectNested<A> withNewBuildStrategyObjectLike(BuildStrategy item);
    public A withServiceReferenceObject(ServiceReference serviceReferenceObject);
    public WatchEventFluent.ServiceReferenceObjectNested<A> withNewServiceReferenceObject();
    public WatchEventFluent.ServiceReferenceObjectNested<A> withNewServiceReferenceObjectLike(ServiceReference item);
    public A withNewServiceReferenceObject(String name,String namespace,String path);
    public A withStatefulSetSpecObject(StatefulSetSpec statefulSetSpecObject);
    public WatchEventFluent.StatefulSetSpecObjectNested<A> withNewStatefulSetSpecObject();
    public WatchEventFluent.StatefulSetSpecObjectNested<A> withNewStatefulSetSpecObjectLike(StatefulSetSpec item);
    public A withStorageClassObject(StorageClass storageClassObject);
    public WatchEventFluent.StorageClassObjectNested<A> withNewStorageClassObject();
    public WatchEventFluent.StorageClassObjectNested<A> withNewStorageClassObjectLike(StorageClass item);
    public A withCustomBuildStrategyObject(CustomBuildStrategy customBuildStrategyObject);
    public WatchEventFluent.CustomBuildStrategyObjectNested<A> withNewCustomBuildStrategyObject();
    public WatchEventFluent.CustomBuildStrategyObjectNested<A> withNewCustomBuildStrategyObjectLike(CustomBuildStrategy item);
    public A withHorizontalPodAutoscalerConditionObject(HorizontalPodAutoscalerCondition horizontalPodAutoscalerConditionObject);
    public WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<A> withNewHorizontalPodAutoscalerConditionObject();
    public WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<A> withNewHorizontalPodAutoscalerConditionObjectLike(HorizontalPodAutoscalerCondition item);
    public A withNewHorizontalPodAutoscalerConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withAzureFileVolumeSourceObject(AzureFileVolumeSource azureFileVolumeSourceObject);
    public WatchEventFluent.AzureFileVolumeSourceObjectNested<A> withNewAzureFileVolumeSourceObject();
    public WatchEventFluent.AzureFileVolumeSourceObjectNested<A> withNewAzureFileVolumeSourceObjectLike(AzureFileVolumeSource item);
    public A withNewAzureFileVolumeSourceObject(Boolean readOnly,String secretName,String shareName);
    public A withClusterRoleBindingObject(ClusterRoleBinding clusterRoleBindingObject);
    public WatchEventFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObject();
    public WatchEventFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObjectLike(ClusterRoleBinding item);
    public A withEnvVarObject(EnvVar envVarObject);
    public WatchEventFluent.EnvVarObjectNested<A> withNewEnvVarObject();
    public WatchEventFluent.EnvVarObjectNested<A> withNewEnvVarObjectLike(EnvVar item);
    public A withSubjectAccessReviewResponseObject(SubjectAccessReviewResponse subjectAccessReviewResponseObject);
    public WatchEventFluent.SubjectAccessReviewResponseObjectNested<A> withNewSubjectAccessReviewResponseObject();
    public WatchEventFluent.SubjectAccessReviewResponseObjectNested<A> withNewSubjectAccessReviewResponseObjectLike(SubjectAccessReviewResponse item);
    public A withHostPortRangeObject(HostPortRange hostPortRangeObject);
    public WatchEventFluent.HostPortRangeObjectNested<A> withNewHostPortRangeObject();
    public WatchEventFluent.HostPortRangeObjectNested<A> withNewHostPortRangeObjectLike(HostPortRange item);
    public A withNewHostPortRangeObject(Integer max,Integer min);
    public A withLoadBalancerIngressObject(LoadBalancerIngress loadBalancerIngressObject);
    public WatchEventFluent.LoadBalancerIngressObjectNested<A> withNewLoadBalancerIngressObject();
    public WatchEventFluent.LoadBalancerIngressObjectNested<A> withNewLoadBalancerIngressObjectLike(LoadBalancerIngress item);
    public A withNewLoadBalancerIngressObject(String hostname,String ip);
    public A withAttachedVolumeObject(AttachedVolume attachedVolumeObject);
    public WatchEventFluent.AttachedVolumeObjectNested<A> withNewAttachedVolumeObject();
    public WatchEventFluent.AttachedVolumeObjectNested<A> withNewAttachedVolumeObjectLike(AttachedVolume item);
    public A withNewAttachedVolumeObject(String devicePath,String name);
    public A withLocalObjectReference(LocalObjectReference localObjectReference);
    public WatchEventFluent.LocalObjectReferenceNested<A> withNewLocalObjectReference();
    public WatchEventFluent.LocalObjectReferenceNested<A> withNewLocalObjectReferenceLike(LocalObjectReference item);
    public A withNewLocalObjectReference(String name);
    public A withNamedAuthInfoObject(NamedAuthInfo namedAuthInfoObject);
    public WatchEventFluent.NamedAuthInfoObjectNested<A> withNewNamedAuthInfoObject();
    public WatchEventFluent.NamedAuthInfoObjectNested<A> withNewNamedAuthInfoObjectLike(NamedAuthInfo item);
    public A withJobConditionObject(JobCondition jobConditionObject);
    public WatchEventFluent.JobConditionObjectNested<A> withNewJobConditionObject();
    public WatchEventFluent.JobConditionObjectNested<A> withNewJobConditionObjectLike(JobCondition item);
    public A withPodSpecObject(PodSpec podSpecObject);
    public WatchEventFluent.PodSpecObjectNested<A> withNewPodSpecObject();
    public WatchEventFluent.PodSpecObjectNested<A> withNewPodSpecObjectLike(PodSpec item);
    public A withPreconditionsObject(Preconditions preconditionsObject);
    public WatchEventFluent.PreconditionsObjectNested<A> withNewPreconditionsObject();
    public WatchEventFluent.PreconditionsObjectNested<A> withNewPreconditionsObjectLike(Preconditions item);
    public A withNewPreconditionsObject(String uid);
    public A withTagReferencePolicyObject(TagReferencePolicy tagReferencePolicyObject);
    public WatchEventFluent.TagReferencePolicyObjectNested<A> withNewTagReferencePolicyObject();
    public WatchEventFluent.TagReferencePolicyObjectNested<A> withNewTagReferencePolicyObjectLike(TagReferencePolicy item);
    public A withNewTagReferencePolicyObject(String type);
    public A withOpenshiftRoleBindingObject(OpenshiftRoleBinding openshiftRoleBindingObject);
    public WatchEventFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObject();
    public WatchEventFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObjectLike(OpenshiftRoleBinding item);
    public A withCephFSVolumeSourceObject(CephFSVolumeSource cephFSVolumeSourceObject);
    public WatchEventFluent.CephFSVolumeSourceObjectNested<A> withNewCephFSVolumeSourceObject();
    public WatchEventFluent.CephFSVolumeSourceObjectNested<A> withNewCephFSVolumeSourceObjectLike(CephFSVolumeSource item);
    public A withNodeConditionObject(NodeCondition nodeConditionObject);
    public WatchEventFluent.NodeConditionObjectNested<A> withNewNodeConditionObject();
    public WatchEventFluent.NodeConditionObjectNested<A> withNewNodeConditionObjectLike(NodeCondition item);
    public A withEndpointSubsetObject(EndpointSubset endpointSubsetObject);
    public WatchEventFluent.EndpointSubsetObjectNested<A> withNewEndpointSubsetObject();
    public WatchEventFluent.EndpointSubsetObjectNested<A> withNewEndpointSubsetObjectLike(EndpointSubset item);
    public A withLocalVolumeSourceObject(LocalVolumeSource localVolumeSourceObject);
    public WatchEventFluent.LocalVolumeSourceObjectNested<A> withNewLocalVolumeSourceObject();
    public WatchEventFluent.LocalVolumeSourceObjectNested<A> withNewLocalVolumeSourceObjectLike(LocalVolumeSource item);
    public A withNewLocalVolumeSourceObject(String fsType,String path);
    public A withCertificateSigningRequestListObject(CertificateSigningRequestList certificateSigningRequestListObject);
    public WatchEventFluent.CertificateSigningRequestListObjectNested<A> withNewCertificateSigningRequestListObject();
    public WatchEventFluent.CertificateSigningRequestListObjectNested<A> withNewCertificateSigningRequestListObjectLike(CertificateSigningRequestList item);
    public A withPodDisruptionBudgetObject(PodDisruptionBudget podDisruptionBudgetObject);
    public WatchEventFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObject();
    public WatchEventFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObjectLike(PodDisruptionBudget item);
    public A withDaemonSetStatusObject(DaemonSetStatus daemonSetStatusObject);
    public WatchEventFluent.DaemonSetStatusObjectNested<A> withNewDaemonSetStatusObject();
    public WatchEventFluent.DaemonSetStatusObjectNested<A> withNewDaemonSetStatusObjectLike(DaemonSetStatus item);
    public A withObjectMetricSourceObject(ObjectMetricSource objectMetricSourceObject);
    public WatchEventFluent.ObjectMetricSourceObjectNested<A> withNewObjectMetricSourceObject();
    public WatchEventFluent.ObjectMetricSourceObjectNested<A> withNewObjectMetricSourceObjectLike(ObjectMetricSource item);
    public A withBuildStatusOutputObject(BuildStatusOutput buildStatusOutputObject);
    public WatchEventFluent.BuildStatusOutputObjectNested<A> withNewBuildStatusOutputObject();
    public WatchEventFluent.BuildStatusOutputObjectNested<A> withNewBuildStatusOutputObjectLike(BuildStatusOutput item);
    public A withNetworkPolicyPeerObject(NetworkPolicyPeer networkPolicyPeerObject);
    public WatchEventFluent.NetworkPolicyPeerObjectNested<A> withNewNetworkPolicyPeerObject();
    public WatchEventFluent.NetworkPolicyPeerObjectNested<A> withNewNetworkPolicyPeerObjectLike(NetworkPolicyPeer item);
    public A withConfigMapNodeConfigSourceObject(ConfigMapNodeConfigSource configMapNodeConfigSourceObject);
    public WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<A> withNewConfigMapNodeConfigSourceObject();
    public WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<A> withNewConfigMapNodeConfigSourceObjectLike(ConfigMapNodeConfigSource item);
    public A withNewConfigMapNodeConfigSourceObject(String kubeletConfigKey,String name,String namespace,String resourceVersion,String uid);
    public A withHTTPGetActionObject(HTTPGetAction hTTPGetActionObject);
    public WatchEventFluent.HTTPGetActionObjectNested<A> withNewHTTPGetActionObject();
    public WatchEventFluent.HTTPGetActionObjectNested<A> withNewHTTPGetActionObjectLike(HTTPGetAction item);
    public A withOpenshiftClusterRoleScopeRestrictionObject(OpenshiftClusterRoleScopeRestriction openshiftClusterRoleScopeRestrictionObject);
    public WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<A> withNewOpenshiftClusterRoleScopeRestrictionObject();
    public WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<A> withNewOpenshiftClusterRoleScopeRestrictionObjectLike(OpenshiftClusterRoleScopeRestriction item);
    public A withGitLabWebHookCauseObject(GitLabWebHookCause gitLabWebHookCauseObject);
    public WatchEventFluent.GitLabWebHookCauseObjectNested<A> withNewGitLabWebHookCauseObject();
    public WatchEventFluent.GitLabWebHookCauseObjectNested<A> withNewGitLabWebHookCauseObjectLike(GitLabWebHookCause item);
    public A withNetworkPolicyObject(NetworkPolicy networkPolicyObject);
    public WatchEventFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObject();
    public WatchEventFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObjectLike(NetworkPolicy item);
    public A withSecretBuildSourceObject(SecretBuildSource secretBuildSourceObject);
    public WatchEventFluent.SecretBuildSourceObjectNested<A> withNewSecretBuildSourceObject();
    public WatchEventFluent.SecretBuildSourceObjectNested<A> withNewSecretBuildSourceObjectLike(SecretBuildSource item);
    public A withOpenshiftClusterRoleBindingObject(OpenshiftClusterRoleBinding openshiftClusterRoleBindingObject);
    public WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObject();
    public WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObjectLike(OpenshiftClusterRoleBinding item);
    public A withDaemonSetSpecObject(DaemonSetSpec daemonSetSpecObject);
    public WatchEventFluent.DaemonSetSpecObjectNested<A> withNewDaemonSetSpecObject();
    public WatchEventFluent.DaemonSetSpecObjectNested<A> withNewDaemonSetSpecObjectLike(DaemonSetSpec item);
    public A withSELinuxStrategyOptionsObject(SELinuxStrategyOptions sELinuxStrategyOptionsObject);
    public WatchEventFluent.SELinuxStrategyOptionsObjectNested<A> withNewSELinuxStrategyOptionsObject();
    public WatchEventFluent.SELinuxStrategyOptionsObjectNested<A> withNewSELinuxStrategyOptionsObjectLike(SELinuxStrategyOptions item);
    public A withJobStatusObject(JobStatus jobStatusObject);
    public WatchEventFluent.JobStatusObjectNested<A> withNewJobStatusObject();
    public WatchEventFluent.JobStatusObjectNested<A> withNewJobStatusObjectLike(JobStatus item);
    public A withObjectMetricStatusObject(ObjectMetricStatus objectMetricStatusObject);
    public WatchEventFluent.ObjectMetricStatusObjectNested<A> withNewObjectMetricStatusObject();
    public WatchEventFluent.ObjectMetricStatusObjectNested<A> withNewObjectMetricStatusObjectLike(ObjectMetricStatus item);
    public A withBitbucketWebHookCauseObject(BitbucketWebHookCause bitbucketWebHookCauseObject);
    public WatchEventFluent.BitbucketWebHookCauseObjectNested<A> withNewBitbucketWebHookCauseObject();
    public WatchEventFluent.BitbucketWebHookCauseObjectNested<A> withNewBitbucketWebHookCauseObjectLike(BitbucketWebHookCause item);
    public A withProjectListObject(ProjectList projectListObject);
    public WatchEventFluent.ProjectListObjectNested<A> withNewProjectListObject();
    public WatchEventFluent.ProjectListObjectNested<A> withNewProjectListObjectLike(ProjectList item);
    public A withPodSecurityPolicySpecObject(PodSecurityPolicySpec podSecurityPolicySpecObject);
    public WatchEventFluent.PodSecurityPolicySpecObjectNested<A> withNewPodSecurityPolicySpecObject();
    public WatchEventFluent.PodSecurityPolicySpecObjectNested<A> withNewPodSecurityPolicySpecObjectLike(PodSecurityPolicySpec item);
    public A withRoleBindingListObject(RoleBindingList roleBindingListObject);
    public WatchEventFluent.RoleBindingListObjectNested<A> withNewRoleBindingListObject();
    public WatchEventFluent.RoleBindingListObjectNested<A> withNewRoleBindingListObjectLike(RoleBindingList item);
    public A withEnvFromSourceObject(EnvFromSource envFromSourceObject);
    public WatchEventFluent.EnvFromSourceObjectNested<A> withNewEnvFromSourceObject();
    public WatchEventFluent.EnvFromSourceObjectNested<A> withNewEnvFromSourceObjectLike(EnvFromSource item);
    public A withNamespaceSpecObject(NamespaceSpec namespaceSpecObject);
    public WatchEventFluent.NamespaceSpecObjectNested<A> withNewNamespaceSpecObject();
    public WatchEventFluent.NamespaceSpecObjectNested<A> withNewNamespaceSpecObjectLike(NamespaceSpec item);
    public A withRouteObject(Route routeObject);
    public WatchEventFluent.RouteObjectNested<A> withNewRouteObject();
    public WatchEventFluent.RouteObjectNested<A> withNewRouteObjectLike(Route item);
    public A withTypeMetaObject(TypeMeta typeMetaObject);
    public WatchEventFluent.TypeMetaObjectNested<A> withNewTypeMetaObject();
    public WatchEventFluent.TypeMetaObjectNested<A> withNewTypeMetaObjectLike(TypeMeta item);
    public A withNewTypeMetaObject(String apiVersion,String kind);
    public A withIngressBackendObject(IngressBackend ingressBackendObject);
    public WatchEventFluent.IngressBackendObjectNested<A> withNewIngressBackendObject();
    public WatchEventFluent.IngressBackendObjectNested<A> withNewIngressBackendObjectLike(IngressBackend item);
    public A withFlexVolumeSourceObject(FlexVolumeSource flexVolumeSourceObject);
    public WatchEventFluent.FlexVolumeSourceObjectNested<A> withNewFlexVolumeSourceObject();
    public WatchEventFluent.FlexVolumeSourceObjectNested<A> withNewFlexVolumeSourceObjectLike(FlexVolumeSource item);
    public A withRBDVolumeSourceObject(RBDVolumeSource rBDVolumeSourceObject);
    public WatchEventFluent.RBDVolumeSourceObjectNested<A> withNewRBDVolumeSourceObject();
    public WatchEventFluent.RBDVolumeSourceObjectNested<A> withNewRBDVolumeSourceObjectLike(RBDVolumeSource item);
    public A withResourceQuotaListObject(ResourceQuotaList resourceQuotaListObject);
    public WatchEventFluent.ResourceQuotaListObjectNested<A> withNewResourceQuotaListObject();
    public WatchEventFluent.ResourceQuotaListObjectNested<A> withNewResourceQuotaListObjectLike(ResourceQuotaList item);
    public A withNodeConfigStatusObject(NodeConfigStatus nodeConfigStatusObject);
    public WatchEventFluent.NodeConfigStatusObjectNested<A> withNewNodeConfigStatusObject();
    public WatchEventFluent.NodeConfigStatusObjectNested<A> withNewNodeConfigStatusObjectLike(NodeConfigStatus item);
    public A withNetworkPolicyListObject(NetworkPolicyList networkPolicyListObject);
    public WatchEventFluent.NetworkPolicyListObjectNested<A> withNewNetworkPolicyListObject();
    public WatchEventFluent.NetworkPolicyListObjectNested<A> withNewNetworkPolicyListObjectLike(NetworkPolicyList item);
    public A withAdmissionResponseObject(AdmissionResponse admissionResponseObject);
    public WatchEventFluent.AdmissionResponseObjectNested<A> withNewAdmissionResponseObject();
    public WatchEventFluent.AdmissionResponseObjectNested<A> withNewAdmissionResponseObjectLike(AdmissionResponse item);
    public A withAdmissionRequestObject(AdmissionRequest admissionRequestObject);
    public WatchEventFluent.AdmissionRequestObjectNested<A> withNewAdmissionRequestObject();
    public WatchEventFluent.AdmissionRequestObjectNested<A> withNewAdmissionRequestObjectLike(AdmissionRequest item);
    public A withRawExtensionObject(RawExtension rawExtensionObject);
    public WatchEventFluent.RawExtensionObjectNested<A> withNewRawExtensionObject();
    public WatchEventFluent.RawExtensionObjectNested<A> withNewRawExtensionObjectLike(RawExtension item);
    public A withNewRawExtensionObject(String raw);
    public A withSecurityContextConstraintsListObject(SecurityContextConstraintsList securityContextConstraintsListObject);
    public WatchEventFluent.SecurityContextConstraintsListObjectNested<A> withNewSecurityContextConstraintsListObject();
    public WatchEventFluent.SecurityContextConstraintsListObjectNested<A> withNewSecurityContextConstraintsListObjectLike(SecurityContextConstraintsList item);
    public A withBuildConfigListObject(BuildConfigList buildConfigListObject);
    public WatchEventFluent.BuildConfigListObjectNested<A> withNewBuildConfigListObject();
    public WatchEventFluent.BuildConfigListObjectNested<A> withNewBuildConfigListObjectLike(BuildConfigList item);
    public A withIdentityListObject(IdentityList identityListObject);
    public WatchEventFluent.IdentityListObjectNested<A> withNewIdentityListObject();
    public WatchEventFluent.IdentityListObjectNested<A> withNewIdentityListObjectLike(IdentityList item);
    public A withConfigMapProjectionObject(ConfigMapProjection configMapProjectionObject);
    public WatchEventFluent.ConfigMapProjectionObjectNested<A> withNewConfigMapProjectionObject();
    public WatchEventFluent.ConfigMapProjectionObjectNested<A> withNewConfigMapProjectionObjectLike(ConfigMapProjection item);
    public A withCustomResourceDefinitionSpecObject(CustomResourceDefinitionSpec customResourceDefinitionSpecObject);
    public WatchEventFluent.CustomResourceDefinitionSpecObjectNested<A> withNewCustomResourceDefinitionSpecObject();
    public WatchEventFluent.CustomResourceDefinitionSpecObjectNested<A> withNewCustomResourceDefinitionSpecObjectLike(CustomResourceDefinitionSpec item);
    public A withNamespaceObject(Namespace namespaceObject);
    public WatchEventFluent.NamespaceObjectNested<A> withNewNamespaceObject();
    public WatchEventFluent.NamespaceObjectNested<A> withNewNamespaceObjectLike(Namespace item);
    public A withContainerStateTerminatedObject(ContainerStateTerminated containerStateTerminatedObject);
    public WatchEventFluent.ContainerStateTerminatedObjectNested<A> withNewContainerStateTerminatedObject();
    public WatchEventFluent.ContainerStateTerminatedObjectNested<A> withNewContainerStateTerminatedObjectLike(ContainerStateTerminated item);
    public A withGroupVersionKindObject(GroupVersionKind groupVersionKindObject);
    public WatchEventFluent.GroupVersionKindObjectNested<A> withNewGroupVersionKindObject();
    public WatchEventFluent.GroupVersionKindObjectNested<A> withNewGroupVersionKindObjectLike(GroupVersionKind item);
    public A withNewGroupVersionKindObject(String group,String kind,String version);
    public A withRunAsUserStrategyOptionsObject(RunAsUserStrategyOptions runAsUserStrategyOptionsObject);
    public WatchEventFluent.RunAsUserStrategyOptionsObjectNested<A> withNewRunAsUserStrategyOptionsObject();
    public WatchEventFluent.RunAsUserStrategyOptionsObjectNested<A> withNewRunAsUserStrategyOptionsObjectLike(RunAsUserStrategyOptions item);
    public A withNewRunAsUserStrategyOptionsObject(String type,Long uid,Long uidRangeMax,Long uidRangeMin);
    public A withLimitRangeSpecObject(LimitRangeSpec limitRangeSpecObject);
    public WatchEventFluent.LimitRangeSpecObjectNested<A> withNewLimitRangeSpecObject();
    public WatchEventFluent.LimitRangeSpecObjectNested<A> withNewLimitRangeSpecObjectLike(LimitRangeSpec item);
    public A withSourceControlUserObject(SourceControlUser sourceControlUserObject);
    public WatchEventFluent.SourceControlUserObjectNested<A> withNewSourceControlUserObject();
    public WatchEventFluent.SourceControlUserObjectNested<A> withNewSourceControlUserObjectLike(SourceControlUser item);
    public A withNewSourceControlUserObject(String email,String name);
    public A withContainerStateObject(ContainerState containerStateObject);
    public WatchEventFluent.ContainerStateObjectNested<A> withNewContainerStateObject();
    public WatchEventFluent.ContainerStateObjectNested<A> withNewContainerStateObjectLike(ContainerState item);
    public A withUserInfoObject(UserInfo userInfoObject);
    public WatchEventFluent.UserInfoObjectNested<A> withNewUserInfoObject();
    public WatchEventFluent.UserInfoObjectNested<A> withNewUserInfoObjectLike(UserInfo item);
    public A withPersistentVolumeClaimStatusObject(PersistentVolumeClaimStatus persistentVolumeClaimStatusObject);
    public WatchEventFluent.PersistentVolumeClaimStatusObjectNested<A> withNewPersistentVolumeClaimStatusObject();
    public WatchEventFluent.PersistentVolumeClaimStatusObjectNested<A> withNewPersistentVolumeClaimStatusObjectLike(PersistentVolumeClaimStatus item);
    public A withServiceSpecObject(ServiceSpec serviceSpecObject);
    public WatchEventFluent.ServiceSpecObjectNested<A> withNewServiceSpecObject();
    public WatchEventFluent.ServiceSpecObjectNested<A> withNewServiceSpecObjectLike(ServiceSpec item);
    public A withPhotonPersistentDiskVolumeSourceObject(PhotonPersistentDiskVolumeSource photonPersistentDiskVolumeSourceObject);
    public WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<A> withNewPhotonPersistentDiskVolumeSourceObject();
    public WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<A> withNewPhotonPersistentDiskVolumeSourceObjectLike(PhotonPersistentDiskVolumeSource item);
    public A withNewPhotonPersistentDiskVolumeSourceObject(String fsType,String pdID);
    public A withIngressRuleObject(IngressRule ingressRuleObject);
    public WatchEventFluent.IngressRuleObjectNested<A> withNewIngressRuleObject();
    public WatchEventFluent.IngressRuleObjectNested<A> withNewIngressRuleObjectLike(IngressRule item);
    public A withIngressStatusObject(IngressStatus ingressStatusObject);
    public WatchEventFluent.IngressStatusObjectNested<A> withNewIngressStatusObject();
    public WatchEventFluent.IngressStatusObjectNested<A> withNewIngressStatusObjectLike(IngressStatus item);
    public A withImageStreamListObject(ImageStreamList imageStreamListObject);
    public WatchEventFluent.ImageStreamListObjectNested<A> withNewImageStreamListObject();
    public WatchEventFluent.ImageStreamListObjectNested<A> withNewImageStreamListObjectLike(ImageStreamList item);
    public A withNodeSpecObject(NodeSpec nodeSpecObject);
    public WatchEventFluent.NodeSpecObjectNested<A> withNewNodeSpecObject();
    public WatchEventFluent.NodeSpecObjectNested<A> withNewNodeSpecObjectLike(NodeSpec item);
    public A withLocalSubjectAccessReviewObject(LocalSubjectAccessReview localSubjectAccessReviewObject);
    public WatchEventFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObject();
    public WatchEventFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObjectLike(LocalSubjectAccessReview item);
    public A withSecretListObject(SecretList secretListObject);
    public WatchEventFluent.SecretListObjectNested<A> withNewSecretListObject();
    public WatchEventFluent.SecretListObjectNested<A> withNewSecretListObjectLike(SecretList item);
    public A withNodeAddressObject(NodeAddress nodeAddressObject);
    public WatchEventFluent.NodeAddressObjectNested<A> withNewNodeAddressObject();
    public WatchEventFluent.NodeAddressObjectNested<A> withNewNodeAddressObjectLike(NodeAddress item);
    public A withNewNodeAddressObject(String address,String type);
    public A withPodAffinityObject(PodAffinity podAffinityObject);
    public WatchEventFluent.PodAffinityObjectNested<A> withNewPodAffinityObject();
    public WatchEventFluent.PodAffinityObjectNested<A> withNewPodAffinityObjectLike(PodAffinity item);
    public A withHorizontalPodAutoscalerListObject(HorizontalPodAutoscalerList horizontalPodAutoscalerListObject);
    public WatchEventFluent.HorizontalPodAutoscalerListObjectNested<A> withNewHorizontalPodAutoscalerListObject();
    public WatchEventFluent.HorizontalPodAutoscalerListObjectNested<A> withNewHorizontalPodAutoscalerListObjectLike(HorizontalPodAutoscalerList item);
    public A withServiceObject(Service serviceObject);
    public WatchEventFluent.ServiceObjectNested<A> withNewServiceObject();
    public WatchEventFluent.ServiceObjectNested<A> withNewServiceObjectLike(Service item);
    public A withExecEnvVarObject(ExecEnvVar execEnvVarObject);
    public WatchEventFluent.ExecEnvVarObjectNested<A> withNewExecEnvVarObject();
    public WatchEventFluent.ExecEnvVarObjectNested<A> withNewExecEnvVarObjectLike(ExecEnvVar item);
    public A withNewExecEnvVarObject(String name,String value);
    public A withDeploymentStatusObject(DeploymentStatus deploymentStatusObject);
    public WatchEventFluent.DeploymentStatusObjectNested<A> withNewDeploymentStatusObject();
    public WatchEventFluent.DeploymentStatusObjectNested<A> withNewDeploymentStatusObjectLike(DeploymentStatus item);
    public A withEventSeriesObject(EventSeries eventSeriesObject);
    public WatchEventFluent.EventSeriesObjectNested<A> withNewEventSeriesObject();
    public WatchEventFluent.EventSeriesObjectNested<A> withNewEventSeriesObjectLike(EventSeries item);
    public A withInitializersObject(Initializers initializersObject);
    public WatchEventFluent.InitializersObjectNested<A> withNewInitializersObject();
    public WatchEventFluent.InitializersObjectNested<A> withNewInitializersObjectLike(Initializers item);
    public A withContainerImageObject(ContainerImage containerImageObject);
    public WatchEventFluent.ContainerImageObjectNested<A> withNewContainerImageObject();
    public WatchEventFluent.ContainerImageObjectNested<A> withNewContainerImageObjectLike(ContainerImage item);
    public A withNodeStatusObject(NodeStatus nodeStatusObject);
    public WatchEventFluent.NodeStatusObjectNested<A> withNewNodeStatusObject();
    public WatchEventFluent.NodeStatusObjectNested<A> withNewNodeStatusObjectLike(NodeStatus item);
    public A withReplicationControllerObject(ReplicationController replicationControllerObject);
    public WatchEventFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObject();
    public WatchEventFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObjectLike(ReplicationController item);
    public A withConfigMapListObject(ConfigMapList configMapListObject);
    public WatchEventFluent.ConfigMapListObjectNested<A> withNewConfigMapListObject();
    public WatchEventFluent.ConfigMapListObjectNested<A> withNewConfigMapListObjectLike(ConfigMapList item);
    public A withSubjectAccessReviewObject(SubjectAccessReview subjectAccessReviewObject);
    public WatchEventFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObject();
    public WatchEventFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObjectLike(SubjectAccessReview item);
    public A withPreferredSchedulingTermObject(PreferredSchedulingTerm preferredSchedulingTermObject);
    public WatchEventFluent.PreferredSchedulingTermObjectNested<A> withNewPreferredSchedulingTermObject();
    public WatchEventFluent.PreferredSchedulingTermObjectNested<A> withNewPreferredSchedulingTermObjectLike(PreferredSchedulingTerm item);
    public A withExternalDocumentationObject(ExternalDocumentation externalDocumentationObject);
    public WatchEventFluent.ExternalDocumentationObjectNested<A> withNewExternalDocumentationObject();
    public WatchEventFluent.ExternalDocumentationObjectNested<A> withNewExternalDocumentationObjectLike(ExternalDocumentation item);
    public A withNewExternalDocumentationObject(String description,String url);
    public A withImageLookupPolicyObject(ImageLookupPolicy imageLookupPolicyObject);
    public WatchEventFluent.ImageLookupPolicyObjectNested<A> withNewImageLookupPolicyObject();
    public WatchEventFluent.ImageLookupPolicyObjectNested<A> withNewImageLookupPolicyObjectLike(ImageLookupPolicy item);
    public A withNewImageLookupPolicyObject(Boolean local);
    public A withMutatingWebhookConfigurationListObject(MutatingWebhookConfigurationList mutatingWebhookConfigurationListObject);
    public WatchEventFluent.MutatingWebhookConfigurationListObjectNested<A> withNewMutatingWebhookConfigurationListObject();
    public WatchEventFluent.MutatingWebhookConfigurationListObjectNested<A> withNewMutatingWebhookConfigurationListObjectLike(MutatingWebhookConfigurationList item);
    public A withAllowedFlexVolumeObject(io.fabric8.openshift.api.model.AllowedFlexVolume allowedFlexVolumeObject);
    public WatchEventFluent.ModelAllowedFlexVolumeObjectNested<A> withNewModelAllowedFlexVolumeObject();
    public WatchEventFluent.ModelAllowedFlexVolumeObjectNested<A> withNewAllowedFlexVolumeObjectLike(io.fabric8.openshift.api.model.AllowedFlexVolume item);
    public A withNewModelAllowedFlexVolumeObject(String driver);
    public A withSubjectAccessReviewObject(io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReviewObject);
    public WatchEventFluent.ModelSubjectAccessReviewObjectNested<A> withNewModelSubjectAccessReviewObject();
    public WatchEventFluent.ModelSubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObjectLike(io.fabric8.openshift.api.model.SubjectAccessReview item);
    public A withPodPresetListObject(PodPresetList podPresetListObject);
    public WatchEventFluent.PodPresetListObjectNested<A> withNewPodPresetListObject();
    public WatchEventFluent.PodPresetListObjectNested<A> withNewPodPresetListObjectLike(PodPresetList item);
    public A withMutatingWebhookConfigurationObject(MutatingWebhookConfiguration mutatingWebhookConfigurationObject);
    public WatchEventFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObject();
    public WatchEventFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObjectLike(MutatingWebhookConfiguration item);
    public A withVolumeMountObject(VolumeMount volumeMountObject);
    public WatchEventFluent.VolumeMountObjectNested<A> withNewVolumeMountObject();
    public WatchEventFluent.VolumeMountObjectNested<A> withNewVolumeMountObjectLike(VolumeMount item);
    public A withNewVolumeMountObject(String mountPath,String mountPropagation,String name,Boolean readOnly,String subPath);
    public A withLabelSelectorObject(LabelSelector labelSelectorObject);
    public WatchEventFluent.LabelSelectorObjectNested<A> withNewLabelSelectorObject();
    public WatchEventFluent.LabelSelectorObjectNested<A> withNewLabelSelectorObjectLike(LabelSelector item);
    public A withCronJobStatusObject(CronJobStatus cronJobStatusObject);
    public WatchEventFluent.CronJobStatusObjectNested<A> withNewCronJobStatusObject();
    public WatchEventFluent.CronJobStatusObjectNested<A> withNewCronJobStatusObjectLike(CronJobStatus item);
    public A withBuildSpecObject(BuildSpec buildSpecObject);
    public WatchEventFluent.BuildSpecObjectNested<A> withNewBuildSpecObject();
    public WatchEventFluent.BuildSpecObjectNested<A> withNewBuildSpecObjectLike(BuildSpec item);
    public A withStatusCauseObject(StatusCause statusCauseObject);
    public WatchEventFluent.StatusCauseObjectNested<A> withNewStatusCauseObject();
    public WatchEventFluent.StatusCauseObjectNested<A> withNewStatusCauseObjectLike(StatusCause item);
    public A withNewStatusCauseObject(String field,String message,String reason);
    public A withProjectStatusObject(ProjectStatus projectStatusObject);
    public WatchEventFluent.ProjectStatusObjectNested<A> withNewProjectStatusObject();
    public WatchEventFluent.ProjectStatusObjectNested<A> withNewProjectStatusObjectLike(ProjectStatus item);
    public A withNewProjectStatusObject(String phase);
    public A withNamedClusterObject(NamedCluster namedClusterObject);
    public WatchEventFluent.NamedClusterObjectNested<A> withNewNamedClusterObject();
    public WatchEventFluent.NamedClusterObjectNested<A> withNewNamedClusterObjectLike(NamedCluster item);
    public A withGitSourceRevisionObject(GitSourceRevision gitSourceRevisionObject);
    public WatchEventFluent.GitSourceRevisionObjectNested<A> withNewGitSourceRevisionObject();
    public WatchEventFluent.GitSourceRevisionObjectNested<A> withNewGitSourceRevisionObjectLike(GitSourceRevision item);
    public A withStatusDetailsObject(StatusDetails statusDetailsObject);
    public WatchEventFluent.StatusDetailsObjectNested<A> withNewStatusDetailsObject();
    public WatchEventFluent.StatusDetailsObjectNested<A> withNewStatusDetailsObjectLike(StatusDetails item);
    public A withImageChangeTriggerObject(ImageChangeTrigger imageChangeTriggerObject);
    public WatchEventFluent.ImageChangeTriggerObjectNested<A> withNewImageChangeTriggerObject();
    public WatchEventFluent.ImageChangeTriggerObjectNested<A> withNewImageChangeTriggerObjectLike(ImageChangeTrigger item);
    public A withSysctlObject(Sysctl sysctlObject);
    public WatchEventFluent.SysctlObjectNested<A> withNewSysctlObject();
    public WatchEventFluent.SysctlObjectNested<A> withNewSysctlObjectLike(Sysctl item);
    public A withNewSysctlObject(String name,String value);
    public A withHorizontalPodAutoscalerObject(HorizontalPodAutoscaler horizontalPodAutoscalerObject);
    public WatchEventFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObject();
    public WatchEventFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObjectLike(HorizontalPodAutoscaler item);
    public A withImageStreamImportSpecObject(ImageStreamImportSpec imageStreamImportSpecObject);
    public WatchEventFluent.ImageStreamImportSpecObjectNested<A> withNewImageStreamImportSpecObject();
    public WatchEventFluent.ImageStreamImportSpecObjectNested<A> withNewImageStreamImportSpecObjectLike(ImageStreamImportSpec item);
    public A withFSGroupStrategyOptionsObject(io.fabric8.openshift.api.model.FSGroupStrategyOptions fSGroupStrategyOptionsObject);
    public WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<A> withNewModelFSGroupStrategyOptionsObject();
    public WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<A> withNewFSGroupStrategyOptionsObjectLike(io.fabric8.openshift.api.model.FSGroupStrategyOptions item);
    public A withScaleObject(Scale scaleObject);
    public WatchEventFluent.ScaleObjectNested<A> withNewScaleObject();
    public WatchEventFluent.ScaleObjectNested<A> withNewScaleObjectLike(Scale item);
    public A withStatusObject(Status statusObject);
    public WatchEventFluent.StatusObjectNested<A> withNewStatusObject();
    public WatchEventFluent.StatusObjectNested<A> withNewStatusObjectLike(Status item);
    public A withDeleteOptionsObject(DeleteOptions deleteOptionsObject);
    public WatchEventFluent.DeleteOptionsObjectNested<A> withNewDeleteOptionsObject();
    public WatchEventFluent.DeleteOptionsObjectNested<A> withNewDeleteOptionsObjectLike(DeleteOptions item);
    public A withContainerStatusObject(ContainerStatus containerStatusObject);
    public WatchEventFluent.ContainerStatusObjectNested<A> withNewContainerStatusObject();
    public WatchEventFluent.ContainerStatusObjectNested<A> withNewContainerStatusObjectLike(ContainerStatus item);
    public A withConfigMapEnvSourceObject(ConfigMapEnvSource configMapEnvSourceObject);
    public WatchEventFluent.ConfigMapEnvSourceObjectNested<A> withNewConfigMapEnvSourceObject();
    public WatchEventFluent.ConfigMapEnvSourceObjectNested<A> withNewConfigMapEnvSourceObjectLike(ConfigMapEnvSource item);
    public A withNewConfigMapEnvSourceObject(String name,Boolean optional);
    public A withDeploymentSpecObject(DeploymentSpec deploymentSpecObject);
    public WatchEventFluent.DeploymentSpecObjectNested<A> withNewDeploymentSpecObject();
    public WatchEventFluent.DeploymentSpecObjectNested<A> withNewDeploymentSpecObjectLike(DeploymentSpec item);
    public A withCertificateSigningRequestStatusObject(CertificateSigningRequestStatus certificateSigningRequestStatusObject);
    public WatchEventFluent.CertificateSigningRequestStatusObjectNested<A> withNewCertificateSigningRequestStatusObject();
    public WatchEventFluent.CertificateSigningRequestStatusObjectNested<A> withNewCertificateSigningRequestStatusObjectLike(CertificateSigningRequestStatus item);
    public A withNodeSelectorRequirementObject(NodeSelectorRequirement nodeSelectorRequirementObject);
    public WatchEventFluent.NodeSelectorRequirementObjectNested<A> withNewNodeSelectorRequirementObject();
    public WatchEventFluent.NodeSelectorRequirementObjectNested<A> withNewNodeSelectorRequirementObjectLike(NodeSelectorRequirement item);
    public A withRecreateDeploymentStrategyParamsObject(RecreateDeploymentStrategyParams recreateDeploymentStrategyParamsObject);
    public WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<A> withNewRecreateDeploymentStrategyParamsObject();
    public WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<A> withNewRecreateDeploymentStrategyParamsObjectLike(RecreateDeploymentStrategyParams item);
    public A withDockerStrategyOptionsObject(DockerStrategyOptions dockerStrategyOptionsObject);
    public WatchEventFluent.DockerStrategyOptionsObjectNested<A> withNewDockerStrategyOptionsObject();
    public WatchEventFluent.DockerStrategyOptionsObjectNested<A> withNewDockerStrategyOptionsObjectLike(DockerStrategyOptions item);
    public A withImageListObject(ImageList imageListObject);
    public WatchEventFluent.ImageListObjectNested<A> withNewImageListObject();
    public WatchEventFluent.ImageListObjectNested<A> withNewImageListObjectLike(ImageList item);
    public A withConfigMapBuildSourceObject(ConfigMapBuildSource configMapBuildSourceObject);
    public WatchEventFluent.ConfigMapBuildSourceObjectNested<A> withNewConfigMapBuildSourceObject();
    public WatchEventFluent.ConfigMapBuildSourceObjectNested<A> withNewConfigMapBuildSourceObjectLike(ConfigMapBuildSource item);
    public A withReplicaSetListObject(ReplicaSetList replicaSetListObject);
    public WatchEventFluent.ReplicaSetListObjectNested<A> withNewReplicaSetListObject();
    public WatchEventFluent.ReplicaSetListObjectNested<A> withNewReplicaSetListObjectLike(ReplicaSetList item);
    public A withPodTemplateListObject(PodTemplateList podTemplateListObject);
    public WatchEventFluent.PodTemplateListObjectNested<A> withNewPodTemplateListObject();
    public WatchEventFluent.PodTemplateListObjectNested<A> withNewPodTemplateListObjectLike(PodTemplateList item);
    public A withImageObject(Image imageObject);
    public WatchEventFluent.ImageObjectNested<A> withNewImageObject();
    public WatchEventFluent.ImageObjectNested<A> withNewImageObjectLike(Image item);
    public A withTLSConfigObject(TLSConfig tLSConfigObject);
    public WatchEventFluent.TLSConfigObjectNested<A> withNewTLSConfigObject();
    public WatchEventFluent.TLSConfigObjectNested<A> withNewTLSConfigObjectLike(TLSConfig item);
    public A withEndpointAddressObject(EndpointAddress endpointAddressObject);
    public WatchEventFluent.EndpointAddressObjectNested<A> withNewEndpointAddressObject();
    public WatchEventFluent.EndpointAddressObjectNested<A> withNewEndpointAddressObjectLike(EndpointAddress item);
    public A withBuildStatusObject(BuildStatus buildStatusObject);
    public WatchEventFluent.BuildStatusObjectNested<A> withNewBuildStatusObject();
    public WatchEventFluent.BuildStatusObjectNested<A> withNewBuildStatusObjectLike(BuildStatus item);
    public A withCustomResourceDefinitionConditionObject(CustomResourceDefinitionCondition customResourceDefinitionConditionObject);
    public WatchEventFluent.CustomResourceDefinitionConditionObjectNested<A> withNewCustomResourceDefinitionConditionObject();
    public WatchEventFluent.CustomResourceDefinitionConditionObjectNested<A> withNewCustomResourceDefinitionConditionObjectLike(CustomResourceDefinitionCondition item);
    public A withNewCustomResourceDefinitionConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withNodeConfigSourceObject(NodeConfigSource nodeConfigSourceObject);
    public WatchEventFluent.NodeConfigSourceObjectNested<A> withNewNodeConfigSourceObject();
    public WatchEventFluent.NodeConfigSourceObjectNested<A> withNewNodeConfigSourceObjectLike(NodeConfigSource item);
    public A withImageSourceObject(ImageSource imageSourceObject);
    public WatchEventFluent.ImageSourceObjectNested<A> withNewImageSourceObject();
    public WatchEventFluent.ImageSourceObjectNested<A> withNewImageSourceObjectLike(ImageSource item);
    public A withVsphereVirtualDiskVolumeSourceObject(VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSourceObject);
    public WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<A> withNewVsphereVirtualDiskVolumeSourceObject();
    public WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<A> withNewVsphereVirtualDiskVolumeSourceObjectLike(VsphereVirtualDiskVolumeSource item);
    public A withNewVsphereVirtualDiskVolumeSourceObject(String fsType,String storagePolicyID,String storagePolicyName,String volumePath);
    public A withRuleObject(Rule ruleObject);
    public WatchEventFluent.RuleObjectNested<A> withNewRuleObject();
    public WatchEventFluent.RuleObjectNested<A> withNewRuleObjectLike(Rule item);
    public A withTagReferenceObject(TagReference tagReferenceObject);
    public WatchEventFluent.TagReferenceObjectNested<A> withNewTagReferenceObject();
    public WatchEventFluent.TagReferenceObjectNested<A> withNewTagReferenceObjectLike(TagReference item);
    public A withCrossVersionObjectReference(CrossVersionObjectReference crossVersionObjectReference);
    public WatchEventFluent.CrossVersionObjectReferenceNested<A> withNewCrossVersionObjectReference();
    public WatchEventFluent.CrossVersionObjectReferenceNested<A> withNewCrossVersionObjectReferenceLike(CrossVersionObjectReference item);
    public A withNewCrossVersionObjectReference(String apiVersion,String kind,String name);
    public A withLabelSelectorRequirementObject(LabelSelectorRequirement labelSelectorRequirementObject);
    public WatchEventFluent.LabelSelectorRequirementObjectNested<A> withNewLabelSelectorRequirementObject();
    public WatchEventFluent.LabelSelectorRequirementObjectNested<A> withNewLabelSelectorRequirementObjectLike(LabelSelectorRequirement item);
    public A withCustomResourceSubresourcesObject(CustomResourceSubresources customResourceSubresourcesObject);
    public WatchEventFluent.CustomResourceSubresourcesObjectNested<A> withNewCustomResourceSubresourcesObject();
    public WatchEventFluent.CustomResourceSubresourcesObjectNested<A> withNewCustomResourceSubresourcesObjectLike(CustomResourceSubresources item);
    public A withDaemonSetUpdateStrategyObject(DaemonSetUpdateStrategy daemonSetUpdateStrategyObject);
    public WatchEventFluent.DaemonSetUpdateStrategyObjectNested<A> withNewDaemonSetUpdateStrategyObject();
    public WatchEventFluent.DaemonSetUpdateStrategyObjectNested<A> withNewDaemonSetUpdateStrategyObjectLike(DaemonSetUpdateStrategy item);
    public A withReplicaSetObject(ReplicaSet replicaSetObject);
    public WatchEventFluent.ReplicaSetObjectNested<A> withNewReplicaSetObject();
    public WatchEventFluent.ReplicaSetObjectNested<A> withNewReplicaSetObjectLike(ReplicaSet item);
    public A withGitRepoVolumeSourceObject(GitRepoVolumeSource gitRepoVolumeSourceObject);
    public WatchEventFluent.GitRepoVolumeSourceObjectNested<A> withNewGitRepoVolumeSourceObject();
    public WatchEventFluent.GitRepoVolumeSourceObjectNested<A> withNewGitRepoVolumeSourceObjectLike(GitRepoVolumeSource item);
    public A withNewGitRepoVolumeSourceObject(String directory,String repository,String revision);
    public A withAggregationRuleObject(AggregationRule aggregationRuleObject);
    public WatchEventFluent.AggregationRuleObjectNested<A> withNewAggregationRuleObject();
    public WatchEventFluent.AggregationRuleObjectNested<A> withNewAggregationRuleObjectLike(AggregationRule item);
    public A withEndpointsListObject(EndpointsList endpointsListObject);
    public WatchEventFluent.EndpointsListObjectNested<A> withNewEndpointsListObject();
    public WatchEventFluent.EndpointsListObjectNested<A> withNewEndpointsListObjectLike(EndpointsList item);
    public A withGroupVersionResourceObject(GroupVersionResource groupVersionResourceObject);
    public WatchEventFluent.GroupVersionResourceObjectNested<A> withNewGroupVersionResourceObject();
    public WatchEventFluent.GroupVersionResourceObjectNested<A> withNewGroupVersionResourceObjectLike(GroupVersionResource item);
    public A withNewGroupVersionResourceObject(String group,String resource,String version);
    public A withBuildSourceObject(BuildSource buildSourceObject);
    public WatchEventFluent.BuildSourceObjectNested<A> withNewBuildSourceObject();
    public WatchEventFluent.BuildSourceObjectNested<A> withNewBuildSourceObjectLike(BuildSource item);
    public A withPodSecurityPolicyObject(PodSecurityPolicy podSecurityPolicyObject);
    public WatchEventFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObject();
    public WatchEventFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObjectLike(PodSecurityPolicy item);
    public A withCronJobObject(CronJob cronJobObject);
    public WatchEventFluent.CronJobObjectNested<A> withNewCronJobObject();
    public WatchEventFluent.CronJobObjectNested<A> withNewCronJobObjectLike(CronJob item);
    public A withTopologySelectorTermObject(TopologySelectorTerm topologySelectorTermObject);
    public WatchEventFluent.TopologySelectorTermObjectNested<A> withNewTopologySelectorTermObject();
    public WatchEventFluent.TopologySelectorTermObjectNested<A> withNewTopologySelectorTermObjectLike(TopologySelectorTerm item);
    public A withCustomResourceSubresourceScaleObject(CustomResourceSubresourceScale customResourceSubresourceScaleObject);
    public WatchEventFluent.CustomResourceSubresourceScaleObjectNested<A> withNewCustomResourceSubresourceScaleObject();
    public WatchEventFluent.CustomResourceSubresourceScaleObjectNested<A> withNewCustomResourceSubresourceScaleObjectLike(CustomResourceSubresourceScale item);
    public A withNewCustomResourceSubresourceScaleObject(String labelSelectorPath,String specReplicasPath,String statusReplicasPath);
    public A withStorageOSPersistentVolumeSourceObject(StorageOSPersistentVolumeSource storageOSPersistentVolumeSourceObject);
    public WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<A> withNewStorageOSPersistentVolumeSourceObject();
    public WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<A> withNewStorageOSPersistentVolumeSourceObjectLike(StorageOSPersistentVolumeSource item);
    public A withCertificateSigningRequestSpecObject(CertificateSigningRequestSpec certificateSigningRequestSpecObject);
    public WatchEventFluent.CertificateSigningRequestSpecObjectNested<A> withNewCertificateSigningRequestSpecObject();
    public WatchEventFluent.CertificateSigningRequestSpecObjectNested<A> withNewCertificateSigningRequestSpecObjectLike(CertificateSigningRequestSpec item);
    public A withSecurityContextObject(SecurityContext securityContextObject);
    public WatchEventFluent.SecurityContextObjectNested<A> withNewSecurityContextObject();
    public WatchEventFluent.SecurityContextObjectNested<A> withNewSecurityContextObjectLike(SecurityContext item);
    public A withConfigMapVolumeSourceObject(ConfigMapVolumeSource configMapVolumeSourceObject);
    public WatchEventFluent.ConfigMapVolumeSourceObjectNested<A> withNewConfigMapVolumeSourceObject();
    public WatchEventFluent.ConfigMapVolumeSourceObjectNested<A> withNewConfigMapVolumeSourceObjectLike(ConfigMapVolumeSource item);
    public A withComponentStatusListObject(ComponentStatusList componentStatusListObject);
    public WatchEventFluent.ComponentStatusListObjectNested<A> withNewComponentStatusListObject();
    public WatchEventFluent.ComponentStatusListObjectNested<A> withNewComponentStatusListObjectLike(ComponentStatusList item);
    public A withGitBuildSourceObject(GitBuildSource gitBuildSourceObject);
    public WatchEventFluent.GitBuildSourceObjectNested<A> withNewGitBuildSourceObject();
    public WatchEventFluent.GitBuildSourceObjectNested<A> withNewGitBuildSourceObjectLike(GitBuildSource item);
    public A withNewGitBuildSourceObject(String httpProxy,String httpsProxy,String noProxy,String ref,String uri);
    public A withFlockerVolumeSourceObject(FlockerVolumeSource flockerVolumeSourceObject);
    public WatchEventFluent.FlockerVolumeSourceObjectNested<A> withNewFlockerVolumeSourceObject();
    public WatchEventFluent.FlockerVolumeSourceObjectNested<A> withNewFlockerVolumeSourceObjectLike(FlockerVolumeSource item);
    public A withNewFlockerVolumeSourceObject(String datasetName,String datasetUUID);
    public A withScaleIOVolumeSourceObject(ScaleIOVolumeSource scaleIOVolumeSourceObject);
    public WatchEventFluent.ScaleIOVolumeSourceObjectNested<A> withNewScaleIOVolumeSourceObject();
    public WatchEventFluent.ScaleIOVolumeSourceObjectNested<A> withNewScaleIOVolumeSourceObjectLike(ScaleIOVolumeSource item);
    public A withLimitRangeListObject(LimitRangeList limitRangeListObject);
    public WatchEventFluent.LimitRangeListObjectNested<A> withNewLimitRangeListObject();
    public WatchEventFluent.LimitRangeListObjectNested<A> withNewLimitRangeListObjectLike(LimitRangeList item);
    public A withProbeObject(Probe probeObject);
    public WatchEventFluent.ProbeObjectNested<A> withNewProbeObject();
    public WatchEventFluent.ProbeObjectNested<A> withNewProbeObjectLike(Probe item);
    public A withImageSourcePathObject(ImageSourcePath imageSourcePathObject);
    public WatchEventFluent.ImageSourcePathObjectNested<A> withNewImageSourcePathObject();
    public WatchEventFluent.ImageSourcePathObjectNested<A> withNewImageSourcePathObjectLike(ImageSourcePath item);
    public A withNewImageSourcePathObject(String destinationDir,String sourcePath);
    public A withEndpointsObject(Endpoints endpointsObject);
    public WatchEventFluent.EndpointsObjectNested<A> withNewEndpointsObject();
    public WatchEventFluent.EndpointsObjectNested<A> withNewEndpointsObjectLike(Endpoints item);
    public A withBuildConfigStatusObject(BuildConfigStatus buildConfigStatusObject);
    public WatchEventFluent.BuildConfigStatusObjectNested<A> withNewBuildConfigStatusObject();
    public WatchEventFluent.BuildConfigStatusObjectNested<A> withNewBuildConfigStatusObjectLike(BuildConfigStatus item);
    public A withNewBuildConfigStatusObject(Long lastVersion);
    public A withParameterObject(Parameter parameterObject);
    public WatchEventFluent.ParameterObjectNested<A> withNewParameterObject();
    public WatchEventFluent.ParameterObjectNested<A> withNewParameterObjectLike(Parameter item);
    public A withSecretVolumeSourceObject(SecretVolumeSource secretVolumeSourceObject);
    public WatchEventFluent.SecretVolumeSourceObjectNested<A> withNewSecretVolumeSourceObject();
    public WatchEventFluent.SecretVolumeSourceObjectNested<A> withNewSecretVolumeSourceObjectLike(SecretVolumeSource item);
    public A withPodObject(Pod podObject);
    public WatchEventFluent.PodObjectNested<A> withNewPodObject();
    public WatchEventFluent.PodObjectNested<A> withNewPodObjectLike(Pod item);
    public A withClientIPConfigObject(ClientIPConfig clientIPConfigObject);
    public WatchEventFluent.ClientIPConfigObjectNested<A> withNewClientIPConfigObject();
    public WatchEventFluent.ClientIPConfigObjectNested<A> withNewClientIPConfigObjectLike(ClientIPConfig item);
    public A withNewClientIPConfigObject(Integer timeoutSeconds);
    public A withContextObject(Context contextObject);
    public WatchEventFluent.ContextObjectNested<A> withNewContextObject();
    public WatchEventFluent.ContextObjectNested<A> withNewContextObjectLike(Context item);
    public A withNodeAffinityObject(NodeAffinity nodeAffinityObject);
    public WatchEventFluent.NodeAffinityObjectNested<A> withNewNodeAffinityObject();
    public WatchEventFluent.NodeAffinityObjectNested<A> withNewNodeAffinityObjectLike(NodeAffinity item);
    public A withConfigMapObject(ConfigMap configMapObject);
    public WatchEventFluent.ConfigMapObjectNested<A> withNewConfigMapObject();
    public WatchEventFluent.ConfigMapObjectNested<A> withNewConfigMapObjectLike(ConfigMap item);
    public A withCustomResourceDefinitionObject(CustomResourceDefinition customResourceDefinitionObject);
    public WatchEventFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObject();
    public WatchEventFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObjectLike(CustomResourceDefinition item);
    public A withFCVolumeSourceObject(FCVolumeSource fCVolumeSourceObject);
    public WatchEventFluent.FCVolumeSourceObjectNested<A> withNewFCVolumeSourceObject();
    public WatchEventFluent.FCVolumeSourceObjectNested<A> withNewFCVolumeSourceObjectLike(FCVolumeSource item);
    public A withCustomResourceDefinitionStatusObject(CustomResourceDefinitionStatus customResourceDefinitionStatusObject);
    public WatchEventFluent.CustomResourceDefinitionStatusObjectNested<A> withNewCustomResourceDefinitionStatusObject();
    public WatchEventFluent.CustomResourceDefinitionStatusObjectNested<A> withNewCustomResourceDefinitionStatusObjectLike(CustomResourceDefinitionStatus item);
    public A withJobListObject(JobList jobListObject);
    public WatchEventFluent.JobListObjectNested<A> withNewJobListObject();
    public WatchEventFluent.JobListObjectNested<A> withNewJobListObjectLike(JobList item);
    public A withOAuthAuthorizeTokenListObject(OAuthAuthorizeTokenList oAuthAuthorizeTokenListObject);
    public WatchEventFluent.OAuthAuthorizeTokenListObjectNested<A> withNewOAuthAuthorizeTokenListObject();
    public WatchEventFluent.OAuthAuthorizeTokenListObjectNested<A> withNewOAuthAuthorizeTokenListObjectLike(OAuthAuthorizeTokenList item);
    public A withJSONSchemaPropsOrStringArrayObject(JSONSchemaPropsOrStringArray jSONSchemaPropsOrStringArrayObject);
    public WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<A> withNewJSONSchemaPropsOrStringArrayObject();
    public WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<A> withNewJSONSchemaPropsOrStringArrayObjectLike(JSONSchemaPropsOrStringArray item);
    public A withCustomDeploymentStrategyParamsObject(CustomDeploymentStrategyParams customDeploymentStrategyParamsObject);
    public WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<A> withNewCustomDeploymentStrategyParamsObject();
    public WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<A> withNewCustomDeploymentStrategyParamsObjectLike(CustomDeploymentStrategyParams item);
    public A withImageImportSpecObject(ImageImportSpec imageImportSpecObject);
    public WatchEventFluent.ImageImportSpecObjectNested<A> withNewImageImportSpecObject();
    public WatchEventFluent.ImageImportSpecObjectNested<A> withNewImageImportSpecObjectLike(ImageImportSpec item);
    public A withPodSecurityContextObject(PodSecurityContext podSecurityContextObject);
    public WatchEventFluent.PodSecurityContextObjectNested<A> withNewPodSecurityContextObject();
    public WatchEventFluent.PodSecurityContextObjectNested<A> withNewPodSecurityContextObjectLike(PodSecurityContext item);
    public A withDownwardAPIProjectionObject(DownwardAPIProjection downwardAPIProjectionObject);
    public WatchEventFluent.DownwardAPIProjectionObjectNested<A> withNewDownwardAPIProjectionObject();
    public WatchEventFluent.DownwardAPIProjectionObjectNested<A> withNewDownwardAPIProjectionObjectLike(DownwardAPIProjection item);
    public A withPodAffinityTermObject(PodAffinityTerm podAffinityTermObject);
    public WatchEventFluent.PodAffinityTermObjectNested<A> withNewPodAffinityTermObject();
    public WatchEventFluent.PodAffinityTermObjectNested<A> withNewPodAffinityTermObjectLike(PodAffinityTerm item);
    public A withIDRangeObject(io.fabric8.openshift.api.model.IDRange iDRangeObject);
    public WatchEventFluent.ModelIDRangeObjectNested<A> withNewModelIDRangeObject();
    public WatchEventFluent.ModelIDRangeObjectNested<A> withNewIDRangeObjectLike(io.fabric8.openshift.api.model.IDRange item);
    public A withNewModelIDRangeObject(Long max,Long min);
    public A withBuildConfigSpecObject(BuildConfigSpec buildConfigSpecObject);
    public WatchEventFluent.BuildConfigSpecObjectNested<A> withNewBuildConfigSpecObject();
    public WatchEventFluent.BuildConfigSpecObjectNested<A> withNewBuildConfigSpecObjectLike(BuildConfigSpec item);
    public A withNonResourceAttributesObject(NonResourceAttributes nonResourceAttributesObject);
    public WatchEventFluent.NonResourceAttributesObjectNested<A> withNewNonResourceAttributesObject();
    public WatchEventFluent.NonResourceAttributesObjectNested<A> withNewNonResourceAttributesObjectLike(NonResourceAttributes item);
    public A withNewNonResourceAttributesObject(String path,String verb);
    public A withPersistentVolumeClaimSourceObject(PersistentVolumeClaimVolumeSource persistentVolumeClaimSourceObject);
    public WatchEventFluent.PersistentVolumeClaimSourceObjectNested<A> withNewPersistentVolumeClaimSourceObject();
    public WatchEventFluent.PersistentVolumeClaimSourceObjectNested<A> withNewPersistentVolumeClaimSourceObjectLike(PersistentVolumeClaimVolumeSource item);
    public A withNewPersistentVolumeClaimSourceObject(String claimName,Boolean readOnly);
    public A withSubjectAccessReviewStatusObject(SubjectAccessReviewStatus subjectAccessReviewStatusObject);
    public WatchEventFluent.SubjectAccessReviewStatusObjectNested<A> withNewSubjectAccessReviewStatusObject();
    public WatchEventFluent.SubjectAccessReviewStatusObjectNested<A> withNewSubjectAccessReviewStatusObjectLike(SubjectAccessReviewStatus item);
    public A withNewSubjectAccessReviewStatusObject(Boolean allowed,Boolean denied,String evaluationError,String reason);
    public A withWebHookTriggerObject(WebHookTrigger webHookTriggerObject);
    public WatchEventFluent.WebHookTriggerObjectNested<A> withNewWebHookTriggerObject();
    public WatchEventFluent.WebHookTriggerObjectNested<A> withNewWebHookTriggerObjectLike(WebHookTrigger item);
    public A withServiceAccountReferenceObject(ServiceAccountReference serviceAccountReferenceObject);
    public WatchEventFluent.ServiceAccountReferenceObjectNested<A> withNewServiceAccountReferenceObject();
    public WatchEventFluent.ServiceAccountReferenceObjectNested<A> withNewServiceAccountReferenceObjectLike(ServiceAccountReference item);
    public A withNewServiceAccountReferenceObject(String name,String namespace);
    public A withBuildObject(Build buildObject);
    public WatchEventFluent.BuildObjectNested<A> withNewBuildObject();
    public WatchEventFluent.BuildObjectNested<A> withNewBuildObjectLike(Build item);
    public A withCustomResourceDefinitionListObject(CustomResourceDefinitionList customResourceDefinitionListObject);
    public WatchEventFluent.CustomResourceDefinitionListObjectNested<A> withNewCustomResourceDefinitionListObject();
    public WatchEventFluent.CustomResourceDefinitionListObjectNested<A> withNewCustomResourceDefinitionListObjectLike(CustomResourceDefinitionList item);
    public A withAllowedFlexVolumeObject(AllowedFlexVolume allowedFlexVolumeObject);
    public WatchEventFluent.AllowedFlexVolumeObjectNested<A> withNewAllowedFlexVolumeObject();
    public WatchEventFluent.AllowedFlexVolumeObjectNested<A> withNewAllowedFlexVolumeObjectLike(AllowedFlexVolume item);
    public A withNewAllowedFlexVolumeObject(String driver);
    public A withResourceMetricStatusObject(ResourceMetricStatus resourceMetricStatusObject);
    public WatchEventFluent.ResourceMetricStatusObjectNested<A> withNewResourceMetricStatusObject();
    public WatchEventFluent.ResourceMetricStatusObjectNested<A> withNewResourceMetricStatusObjectLike(ResourceMetricStatus item);
    public A withTagImportPolicyObject(TagImportPolicy tagImportPolicyObject);
    public WatchEventFluent.TagImportPolicyObjectNested<A> withNewTagImportPolicyObject();
    public WatchEventFluent.TagImportPolicyObjectNested<A> withNewTagImportPolicyObjectLike(TagImportPolicy item);
    public A withNewTagImportPolicyObject(Boolean insecure,Boolean scheduled);
    public A withImageStreamTagObject(ImageStreamTag imageStreamTagObject);
    public WatchEventFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObject();
    public WatchEventFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObjectLike(ImageStreamTag item);
    public A withKeyToPathObject(KeyToPath keyToPathObject);
    public WatchEventFluent.KeyToPathObjectNested<A> withNewKeyToPathObject();
    public WatchEventFluent.KeyToPathObjectNested<A> withNewKeyToPathObjectLike(KeyToPath item);
    public A withNewKeyToPathObject(String key,Integer mode,String path);
    public A withStatefulSetConditionObject(StatefulSetCondition statefulSetConditionObject);
    public WatchEventFluent.StatefulSetConditionObjectNested<A> withNewStatefulSetConditionObject();
    public WatchEventFluent.StatefulSetConditionObjectNested<A> withNewStatefulSetConditionObjectLike(StatefulSetCondition item);
    public A withNewStatefulSetConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withRoutePortObject(RoutePort routePortObject);
    public WatchEventFluent.RoutePortObjectNested<A> withNewRoutePortObject();
    public WatchEventFluent.RoutePortObjectNested<A> withNewRoutePortObjectLike(RoutePort item);
    public A withJSONSchemaPropsOrBoolObject(JSONSchemaPropsOrBool jSONSchemaPropsOrBoolObject);
    public WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<A> withNewJSONSchemaPropsOrBoolObject();
    public WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<A> withNewJSONSchemaPropsOrBoolObjectLike(JSONSchemaPropsOrBool item);
    public A withFlexPersistentVolumeSourceObject(FlexPersistentVolumeSource flexPersistentVolumeSourceObject);
    public WatchEventFluent.FlexPersistentVolumeSourceObjectNested<A> withNewFlexPersistentVolumeSourceObject();
    public WatchEventFluent.FlexPersistentVolumeSourceObjectNested<A> withNewFlexPersistentVolumeSourceObjectLike(FlexPersistentVolumeSource item);
    public A withGroupObject(Group groupObject);
    public WatchEventFluent.GroupObjectNested<A> withNewGroupObject();
    public WatchEventFluent.GroupObjectNested<A> withNewGroupObjectLike(Group item);
    public A withBuildTriggerCauseObject(BuildTriggerCause buildTriggerCauseObject);
    public WatchEventFluent.BuildTriggerCauseObjectNested<A> withNewBuildTriggerCauseObject();
    public WatchEventFluent.BuildTriggerCauseObjectNested<A> withNewBuildTriggerCauseObjectLike(BuildTriggerCause item);
    public A withNamespaceListObject(NamespaceList namespaceListObject);
    public WatchEventFluent.NamespaceListObjectNested<A> withNewNamespaceListObject();
    public WatchEventFluent.NamespaceListObjectNested<A> withNewNamespaceListObjectLike(NamespaceList item);
    public A withPodDisruptionBudgetStatusObject(PodDisruptionBudgetStatus podDisruptionBudgetStatusObject);
    public WatchEventFluent.PodDisruptionBudgetStatusObjectNested<A> withNewPodDisruptionBudgetStatusObject();
    public WatchEventFluent.PodDisruptionBudgetStatusObjectNested<A> withNewPodDisruptionBudgetStatusObjectLike(PodDisruptionBudgetStatus item);
    public A withPodDNSConfigObject(PodDNSConfig podDNSConfigObject);
    public WatchEventFluent.PodDNSConfigObjectNested<A> withNewPodDNSConfigObject();
    public WatchEventFluent.PodDNSConfigObjectNested<A> withNewPodDNSConfigObjectLike(PodDNSConfig item);
    public A withNodeListObject(NodeList nodeListObject);
    public WatchEventFluent.NodeListObjectNested<A> withNewNodeListObject();
    public WatchEventFluent.NodeListObjectNested<A> withNewNodeListObjectLike(NodeList item);
    public A withHorizontalPodAutoscalerSpecObject(HorizontalPodAutoscalerSpec horizontalPodAutoscalerSpecObject);
    public WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<A> withNewHorizontalPodAutoscalerSpecObject();
    public WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<A> withNewHorizontalPodAutoscalerSpecObjectLike(HorizontalPodAutoscalerSpec item);
    public A withImageSignatureObject(ImageSignature imageSignatureObject);
    public WatchEventFluent.ImageSignatureObjectNested<A> withNewImageSignatureObject();
    public WatchEventFluent.ImageSignatureObjectNested<A> withNewImageSignatureObjectLike(ImageSignature item);
    public A withEnvVarSourceObject(EnvVarSource envVarSourceObject);
    public WatchEventFluent.EnvVarSourceObjectNested<A> withNewEnvVarSourceObject();
    public WatchEventFluent.EnvVarSourceObjectNested<A> withNewEnvVarSourceObjectLike(EnvVarSource item);
    public A withVolumeProjectionObject(VolumeProjection volumeProjectionObject);
    public WatchEventFluent.VolumeProjectionObjectNested<A> withNewVolumeProjectionObject();
    public WatchEventFluent.VolumeProjectionObjectNested<A> withNewVolumeProjectionObjectLike(VolumeProjection item);
    public A withResourceQuotaObject(ResourceQuota resourceQuotaObject);
    public WatchEventFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObject();
    public WatchEventFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObjectLike(ResourceQuota item);
    public A withDeploymentStrategyObject(DeploymentStrategy deploymentStrategyObject);
    public WatchEventFluent.DeploymentStrategyObjectNested<A> withNewDeploymentStrategyObject();
    public WatchEventFluent.DeploymentStrategyObjectNested<A> withNewDeploymentStrategyObjectLike(DeploymentStrategy item);
    public A withOAuthAccessTokenListObject(OAuthAccessTokenList oAuthAccessTokenListObject);
    public WatchEventFluent.OAuthAccessTokenListObjectNested<A> withNewOAuthAccessTokenListObject();
    public WatchEventFluent.OAuthAccessTokenListObjectNested<A> withNewOAuthAccessTokenListObjectLike(OAuthAccessTokenList item);
    public A withNodeSelectorTermObject(NodeSelectorTerm nodeSelectorTermObject);
    public WatchEventFluent.NodeSelectorTermObjectNested<A> withNewNodeSelectorTermObject();
    public WatchEventFluent.NodeSelectorTermObjectNested<A> withNewNodeSelectorTermObjectLike(NodeSelectorTerm item);
    public A withScaleIOPersistentVolumeSourceObject(ScaleIOPersistentVolumeSource scaleIOPersistentVolumeSourceObject);
    public WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<A> withNewScaleIOPersistentVolumeSourceObject();
    public WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<A> withNewScaleIOPersistentVolumeSourceObjectLike(ScaleIOPersistentVolumeSource item);
    public A withSupplementalGroupsStrategyOptionsObject(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions supplementalGroupsStrategyOptionsObject);
    public WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<A> withNewModelSupplementalGroupsStrategyOptionsObject();
    public WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<A> withNewSupplementalGroupsStrategyOptionsObjectLike(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item);
    public A withWeightedPodAffinityTermObject(WeightedPodAffinityTerm weightedPodAffinityTermObject);
    public WatchEventFluent.WeightedPodAffinityTermObjectNested<A> withNewWeightedPodAffinityTermObject();
    public WatchEventFluent.WeightedPodAffinityTermObjectNested<A> withNewWeightedPodAffinityTermObjectLike(WeightedPodAffinityTerm item);
    public A withRollingUpdateStatefulSetStrategyObject(RollingUpdateStatefulSetStrategy rollingUpdateStatefulSetStrategyObject);
    public WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<A> withNewRollingUpdateStatefulSetStrategyObject();
    public WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<A> withNewRollingUpdateStatefulSetStrategyObjectLike(RollingUpdateStatefulSetStrategy item);
    public A withNewRollingUpdateStatefulSetStrategyObject(Integer partition);
    public A withBuildRequestObject(BuildRequest buildRequestObject);
    public WatchEventFluent.BuildRequestObjectNested<A> withNewBuildRequestObject();
    public WatchEventFluent.BuildRequestObjectNested<A> withNewBuildRequestObjectLike(BuildRequest item);
    public A withServiceReferenceObject(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference serviceReferenceObject);
    public WatchEventFluent.ApiextensionsServiceReferenceObjectNested<A> withNewApiextensionsServiceReferenceObject();
    public WatchEventFluent.ApiextensionsServiceReferenceObjectNested<A> withNewServiceReferenceObjectLike(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item);
    public A withNewApiextensionsServiceReferenceObject(String name,String namespace,String path);
    public A withNodeSystemInfoObject(NodeSystemInfo nodeSystemInfoObject);
    public WatchEventFluent.NodeSystemInfoObjectNested<A> withNewNodeSystemInfoObject();
    public WatchEventFluent.NodeSystemInfoObjectNested<A> withNewNodeSystemInfoObjectLike(NodeSystemInfo item);
    public A withRouteListObject(RouteList routeListObject);
    public WatchEventFluent.RouteListObjectNested<A> withNewRouteListObject();
    public WatchEventFluent.RouteListObjectNested<A> withNewRouteListObjectLike(RouteList item);
    public A withAuthProviderConfigObject(AuthProviderConfig authProviderConfigObject);
    public WatchEventFluent.AuthProviderConfigObjectNested<A> withNewAuthProviderConfigObject();
    public WatchEventFluent.AuthProviderConfigObjectNested<A> withNewAuthProviderConfigObjectLike(AuthProviderConfig item);
    public A withVolumeDeviceObject(VolumeDevice volumeDeviceObject);
    public WatchEventFluent.VolumeDeviceObjectNested<A> withNewVolumeDeviceObject();
    public WatchEventFluent.VolumeDeviceObjectNested<A> withNewVolumeDeviceObjectLike(VolumeDevice item);
    public A withNewVolumeDeviceObject(String devicePath,String name);
    public A withDaemonSetObject(DaemonSet daemonSetObject);
    public WatchEventFluent.DaemonSetObjectNested<A> withNewDaemonSetObject();
    public WatchEventFluent.DaemonSetObjectNested<A> withNewDaemonSetObjectLike(DaemonSet item);
    public A withTokenReviewSpecObject(TokenReviewSpec tokenReviewSpecObject);
    public WatchEventFluent.TokenReviewSpecObjectNested<A> withNewTokenReviewSpecObject();
    public WatchEventFluent.TokenReviewSpecObjectNested<A> withNewTokenReviewSpecObjectLike(TokenReviewSpec item);
    public A withDeploymentDetailsObject(DeploymentDetails deploymentDetailsObject);
    public WatchEventFluent.DeploymentDetailsObjectNested<A> withNewDeploymentDetailsObject();
    public WatchEventFluent.DeploymentDetailsObjectNested<A> withNewDeploymentDetailsObjectLike(DeploymentDetails item);
    public A withVolumeObject(Volume volumeObject);
    public WatchEventFluent.VolumeObjectNested<A> withNewVolumeObject();
    public WatchEventFluent.VolumeObjectNested<A> withNewVolumeObjectLike(Volume item);
    public A withKubernetesRunAsUserStrategyOptionsObject(KubernetesRunAsUserStrategyOptions kubernetesRunAsUserStrategyOptionsObject);
    public WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<A> withNewKubernetesRunAsUserStrategyOptionsObject();
    public WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<A> withNewKubernetesRunAsUserStrategyOptionsObjectLike(KubernetesRunAsUserStrategyOptions item);
    public A withNFSVolumeSourceObject(NFSVolumeSource nFSVolumeSourceObject);
    public WatchEventFluent.NFSVolumeSourceObjectNested<A> withNewNFSVolumeSourceObject();
    public WatchEventFluent.NFSVolumeSourceObjectNested<A> withNewNFSVolumeSourceObjectLike(NFSVolumeSource item);
    public A withNewNFSVolumeSourceObject(String path,Boolean readOnly,String server);
    public A withDeploymentConditionObject(DeploymentCondition deploymentConditionObject);
    public WatchEventFluent.DeploymentConditionObjectNested<A> withNewDeploymentConditionObject();
    public WatchEventFluent.DeploymentConditionObjectNested<A> withNewDeploymentConditionObjectLike(DeploymentCondition item);
    public A withClusterObject(Cluster clusterObject);
    public WatchEventFluent.ClusterObjectNested<A> withNewClusterObject();
    public WatchEventFluent.ClusterObjectNested<A> withNewClusterObjectLike(Cluster item);
    public A withImageStreamObject(ImageStream imageStreamObject);
    public WatchEventFluent.ImageStreamObjectNested<A> withNewImageStreamObject();
    public WatchEventFluent.ImageStreamObjectNested<A> withNewImageStreamObjectLike(ImageStream item);
    public A withStorageOSVolumeSourceObject(StorageOSVolumeSource storageOSVolumeSourceObject);
    public WatchEventFluent.StorageOSVolumeSourceObjectNested<A> withNewStorageOSVolumeSourceObject();
    public WatchEventFluent.StorageOSVolumeSourceObjectNested<A> withNewStorageOSVolumeSourceObjectLike(StorageOSVolumeSource item);
    public A withBuildListObject(BuildList buildListObject);
    public WatchEventFluent.BuildListObjectNested<A> withNewBuildListObject();
    public WatchEventFluent.BuildListObjectNested<A> withNewBuildListObjectLike(BuildList item);
    public A withTemplateListObject(TemplateList templateListObject);
    public WatchEventFluent.TemplateListObjectNested<A> withNewTemplateListObject();
    public WatchEventFluent.TemplateListObjectNested<A> withNewTemplateListObjectLike(TemplateList item);
    public A withKubernetesListObject(KubernetesList kubernetesListObject);
    public WatchEventFluent.KubernetesListObjectNested<A> withNewKubernetesListObject();
    public WatchEventFluent.KubernetesListObjectNested<A> withNewKubernetesListObjectLike(KubernetesList item);
    public A withCustomResourceDefinitionVersionObject(CustomResourceDefinitionVersion customResourceDefinitionVersionObject);
    public WatchEventFluent.CustomResourceDefinitionVersionObjectNested<A> withNewCustomResourceDefinitionVersionObject();
    public WatchEventFluent.CustomResourceDefinitionVersionObjectNested<A> withNewCustomResourceDefinitionVersionObjectLike(CustomResourceDefinitionVersion item);
    public A withProjectSpecObject(ProjectSpec projectSpecObject);
    public WatchEventFluent.ProjectSpecObjectNested<A> withNewProjectSpecObject();
    public WatchEventFluent.ProjectSpecObjectNested<A> withNewProjectSpecObjectLike(ProjectSpec item);
    public A withHTTPHeaderObject(HTTPHeader hTTPHeaderObject);
    public WatchEventFluent.HTTPHeaderObjectNested<A> withNewHTTPHeaderObject();
    public WatchEventFluent.HTTPHeaderObjectNested<A> withNewHTTPHeaderObjectLike(HTTPHeader item);
    public A withNewHTTPHeaderObject(String name,String value);
    public A withCapabilitiesObject(Capabilities capabilitiesObject);
    public WatchEventFluent.CapabilitiesObjectNested<A> withNewCapabilitiesObject();
    public WatchEventFluent.CapabilitiesObjectNested<A> withNewCapabilitiesObjectLike(Capabilities item);
    public A withObjectReferenceObject(ObjectReference objectReferenceObject);
    public WatchEventFluent.ObjectReferenceObjectNested<A> withNewObjectReferenceObject();
    public WatchEventFluent.ObjectReferenceObjectNested<A> withNewObjectReferenceObjectLike(ObjectReference item);
    public A withWatchEventObject(WatchEvent watchEventObject);
    public WatchEventFluent.WatchEventObjectNested<A> withNewWatchEventObject();
    public WatchEventFluent.WatchEventObjectNested<A> withNewWatchEventObjectLike(WatchEvent item);
    public A withSignatureIssuerObject(SignatureIssuer signatureIssuerObject);
    public WatchEventFluent.SignatureIssuerObjectNested<A> withNewSignatureIssuerObject();
    public WatchEventFluent.SignatureIssuerObjectNested<A> withNewSignatureIssuerObjectLike(SignatureIssuer item);
    public A withNewSignatureIssuerObject(String commonName,String organization);
    public A withImageLayerObject(ImageLayer imageLayerObject);
    public WatchEventFluent.ImageLayerObjectNested<A> withNewImageLayerObject();
    public WatchEventFluent.ImageLayerObjectNested<A> withNewImageLayerObjectLike(ImageLayer item);
    public A withNewImageLayerObject(String mediaType,String name,Long size);
    public A withSecretProjectionObject(SecretProjection secretProjectionObject);
    public WatchEventFluent.SecretProjectionObjectNested<A> withNewSecretProjectionObject();
    public WatchEventFluent.SecretProjectionObjectNested<A> withNewSecretProjectionObjectLike(SecretProjection item);
    public A withWebhookClientConfigObject(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig webhookClientConfigObject);
    public WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<A> withNewApiextensionsWebhookClientConfigObject();
    public WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<A> withNewWebhookClientConfigObjectLike(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item);
    public A withGlusterfsVolumeSourceObject(GlusterfsVolumeSource glusterfsVolumeSourceObject);
    public WatchEventFluent.GlusterfsVolumeSourceObjectNested<A> withNewGlusterfsVolumeSourceObject();
    public WatchEventFluent.GlusterfsVolumeSourceObjectNested<A> withNewGlusterfsVolumeSourceObjectLike(GlusterfsVolumeSource item);
    public A withNewGlusterfsVolumeSourceObject(String endpoints,String path,Boolean readOnly);
    public A withNamespaceStatusObject(NamespaceStatus namespaceStatusObject);
    public WatchEventFluent.NamespaceStatusObjectNested<A> withNewNamespaceStatusObject();
    public WatchEventFluent.NamespaceStatusObjectNested<A> withNewNamespaceStatusObjectLike(NamespaceStatus item);
    public A withNewNamespaceStatusObject(String phase);
    public A withOpenshiftRoleObject(OpenshiftRole openshiftRoleObject);
    public WatchEventFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObject();
    public WatchEventFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObjectLike(OpenshiftRole item);
    public A withCronJobSpecObject(CronJobSpec cronJobSpecObject);
    public WatchEventFluent.CronJobSpecObjectNested<A> withNewCronJobSpecObject();
    public WatchEventFluent.CronJobSpecObjectNested<A> withNewCronJobSpecObjectLike(CronJobSpec item);
    public A withCustomResourceColumnDefinitionObject(CustomResourceColumnDefinition customResourceColumnDefinitionObject);
    public WatchEventFluent.CustomResourceColumnDefinitionObjectNested<A> withNewCustomResourceColumnDefinitionObject();
    public WatchEventFluent.CustomResourceColumnDefinitionObjectNested<A> withNewCustomResourceColumnDefinitionObjectLike(CustomResourceColumnDefinition item);
    public A withImageStreamSpecObject(ImageStreamSpec imageStreamSpecObject);
    public WatchEventFluent.ImageStreamSpecObjectNested<A> withNewImageStreamSpecObject();
    public WatchEventFluent.ImageStreamSpecObjectNested<A> withNewImageStreamSpecObjectLike(ImageStreamSpec item);
    public A withSecretEnvSourceObject(SecretEnvSource secretEnvSourceObject);
    public WatchEventFluent.SecretEnvSourceObjectNested<A> withNewSecretEnvSourceObject();
    public WatchEventFluent.SecretEnvSourceObjectNested<A> withNewSecretEnvSourceObjectLike(SecretEnvSource item);
    public A withNewSecretEnvSourceObject(String name,Boolean optional);
    public A withOAuthClientObject(OAuthClient oAuthClientObject);
    public WatchEventFluent.OAuthClientObjectNested<A> withNewOAuthClientObject();
    public WatchEventFluent.OAuthClientObjectNested<A> withNewOAuthClientObjectLike(OAuthClient item);
    public A withIdentityObject(Identity identityObject);
    public WatchEventFluent.IdentityObjectNested<A> withNewIdentityObject();
    public WatchEventFluent.IdentityObjectNested<A> withNewIdentityObjectLike(Identity item);
    public A withAWSElasticBlockStoreVolumeSourceObject(AWSElasticBlockStoreVolumeSource aWSElasticBlockStoreVolumeSourceObject);
    public WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<A> withNewAWSElasticBlockStoreVolumeSourceObject();
    public WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<A> withNewAWSElasticBlockStoreVolumeSourceObjectLike(AWSElasticBlockStoreVolumeSource item);
    public A withNewAWSElasticBlockStoreVolumeSourceObject(String fsType,Integer partition,Boolean readOnly,String volumeID);
    public A withMetricStatusObject(MetricStatus metricStatusObject);
    public WatchEventFluent.MetricStatusObjectNested<A> withNewMetricStatusObject();
    public WatchEventFluent.MetricStatusObjectNested<A> withNewMetricStatusObjectLike(MetricStatus item);
    public A withGenericWebHookCauseObject(GenericWebHookCause genericWebHookCauseObject);
    public WatchEventFluent.GenericWebHookCauseObjectNested<A> withNewGenericWebHookCauseObject();
    public WatchEventFluent.GenericWebHookCauseObjectNested<A> withNewGenericWebHookCauseObjectLike(GenericWebHookCause item);
    public A withServiceAccountRestrictionObject(ServiceAccountRestriction serviceAccountRestrictionObject);
    public WatchEventFluent.ServiceAccountRestrictionObjectNested<A> withNewServiceAccountRestrictionObject();
    public WatchEventFluent.ServiceAccountRestrictionObjectNested<A> withNewServiceAccountRestrictionObjectLike(ServiceAccountRestriction item);
    public A withLimitRangeObject(LimitRange limitRangeObject);
    public WatchEventFluent.LimitRangeObjectNested<A> withNewLimitRangeObject();
    public WatchEventFluent.LimitRangeObjectNested<A> withNewLimitRangeObjectLike(LimitRange item);
    public A withSecretLocalReferenceObject(SecretLocalReference secretLocalReferenceObject);
    public WatchEventFluent.SecretLocalReferenceObjectNested<A> withNewSecretLocalReferenceObject();
    public WatchEventFluent.SecretLocalReferenceObjectNested<A> withNewSecretLocalReferenceObjectLike(SecretLocalReference item);
    public A withNewSecretLocalReferenceObject(String name);
    public A withIDRangeObject(IDRange iDRangeObject);
    public WatchEventFluent.IDRangeObjectNested<A> withNewIDRangeObject();
    public WatchEventFluent.IDRangeObjectNested<A> withNewIDRangeObjectLike(IDRange item);
    public A withNewIDRangeObject(Long max,Long min);
    public A withUserRestrictionObject(UserRestriction userRestrictionObject);
    public WatchEventFluent.UserRestrictionObjectNested<A> withNewUserRestrictionObject();
    public WatchEventFluent.UserRestrictionObjectNested<A> withNewUserRestrictionObjectLike(UserRestriction item);
    public A withCSIPersistentVolumeSourceObject(CSIPersistentVolumeSource cSIPersistentVolumeSourceObject);
    public WatchEventFluent.CSIPersistentVolumeSourceObjectNested<A> withNewCSIPersistentVolumeSourceObject();
    public WatchEventFluent.CSIPersistentVolumeSourceObjectNested<A> withNewCSIPersistentVolumeSourceObjectLike(CSIPersistentVolumeSource item);
    public A withImageStreamImportObject(ImageStreamImport imageStreamImportObject);
    public WatchEventFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObject();
    public WatchEventFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObjectLike(ImageStreamImport item);
    public A withReplicaSetSpecObject(ReplicaSetSpec replicaSetSpecObject);
    public WatchEventFluent.ReplicaSetSpecObjectNested<A> withNewReplicaSetSpecObject();
    public WatchEventFluent.ReplicaSetSpecObjectNested<A> withNewReplicaSetSpecObjectLike(ReplicaSetSpec item);
    public A withResourceRequirementsObject(ResourceRequirements resourceRequirementsObject);
    public WatchEventFluent.ResourceRequirementsObjectNested<A> withNewResourceRequirementsObject();
    public WatchEventFluent.ResourceRequirementsObjectNested<A> withNewResourceRequirementsObjectLike(ResourceRequirements item);
    public A withExternalMetricSourceObject(ExternalMetricSource externalMetricSourceObject);
    public WatchEventFluent.ExternalMetricSourceObjectNested<A> withNewExternalMetricSourceObject();
    public WatchEventFluent.ExternalMetricSourceObjectNested<A> withNewExternalMetricSourceObjectLike(ExternalMetricSource item);
    public A withGitHubWebHookCauseObject(GitHubWebHookCause gitHubWebHookCauseObject);
    public WatchEventFluent.GitHubWebHookCauseObjectNested<A> withNewGitHubWebHookCauseObject();
    public WatchEventFluent.GitHubWebHookCauseObjectNested<A> withNewGitHubWebHookCauseObjectLike(GitHubWebHookCause item);
    public A withPersistentVolumeClaimListObject(PersistentVolumeClaimList persistentVolumeClaimListObject);
    public WatchEventFluent.PersistentVolumeClaimListObjectNested<A> withNewPersistentVolumeClaimListObject();
    public WatchEventFluent.PersistentVolumeClaimListObjectNested<A> withNewPersistentVolumeClaimListObjectLike(PersistentVolumeClaimList item);
    public A withOAuthClientListObject(OAuthClientList oAuthClientListObject);
    public WatchEventFluent.OAuthClientListObjectNested<A> withNewOAuthClientListObject();
    public WatchEventFluent.OAuthClientListObjectNested<A> withNewOAuthClientListObjectLike(OAuthClientList item);
    public A withOpenshiftRoleBindingListObject(OpenshiftRoleBindingList openshiftRoleBindingListObject);
    public WatchEventFluent.OpenshiftRoleBindingListObjectNested<A> withNewOpenshiftRoleBindingListObject();
    public WatchEventFluent.OpenshiftRoleBindingListObjectNested<A> withNewOpenshiftRoleBindingListObjectLike(OpenshiftRoleBindingList item);
    public A withResourceMetricSourceObject(ResourceMetricSource resourceMetricSourceObject);
    public WatchEventFluent.ResourceMetricSourceObjectNested<A> withNewResourceMetricSourceObject();
    public WatchEventFluent.ResourceMetricSourceObjectNested<A> withNewResourceMetricSourceObjectLike(ResourceMetricSource item);
    public A withReplicationControllerStatusObject(ReplicationControllerStatus replicationControllerStatusObject);
    public WatchEventFluent.ReplicationControllerStatusObjectNested<A> withNewReplicationControllerStatusObject();
    public WatchEventFluent.ReplicationControllerStatusObjectNested<A> withNewReplicationControllerStatusObjectLike(ReplicationControllerStatus item);
    public A withIngressListObject(IngressList ingressListObject);
    public WatchEventFluent.IngressListObjectNested<A> withNewIngressListObject();
    public WatchEventFluent.IngressListObjectNested<A> withNewIngressListObjectLike(IngressList item);
    public A withMicroTimeObject(MicroTime microTimeObject);
    public WatchEventFluent.MicroTimeObjectNested<A> withNewMicroTimeObject();
    public WatchEventFluent.MicroTimeObjectNested<A> withNewMicroTimeObjectLike(MicroTime item);
    public A withNewMicroTimeObject(String time);
    public A withValidatingWebhookConfigurationListObject(ValidatingWebhookConfigurationList validatingWebhookConfigurationListObject);
    public WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<A> withNewValidatingWebhookConfigurationListObject();
    public WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<A> withNewValidatingWebhookConfigurationListObjectLike(ValidatingWebhookConfigurationList item);
    public A withPolicyRuleObject(PolicyRule policyRuleObject);
    public WatchEventFluent.PolicyRuleObjectNested<A> withNewPolicyRuleObject();
    public WatchEventFluent.PolicyRuleObjectNested<A> withNewPolicyRuleObjectLike(PolicyRule item);
    public A withLifecycleObject(Lifecycle lifecycleObject);
    public WatchEventFluent.LifecycleObjectNested<A> withNewLifecycleObject();
    public WatchEventFluent.LifecycleObjectNested<A> withNewLifecycleObjectLike(Lifecycle item);
    public A withRepositoryImportSpecObject(RepositoryImportSpec repositoryImportSpecObject);
    public WatchEventFluent.RepositoryImportSpecObjectNested<A> withNewRepositoryImportSpecObject();
    public WatchEventFluent.RepositoryImportSpecObjectNested<A> withNewRepositoryImportSpecObjectLike(RepositoryImportSpec item);
    public A withPortworxVolumeSourceObject(PortworxVolumeSource portworxVolumeSourceObject);
    public WatchEventFluent.PortworxVolumeSourceObjectNested<A> withNewPortworxVolumeSourceObject();
    public WatchEventFluent.PortworxVolumeSourceObjectNested<A> withNewPortworxVolumeSourceObjectLike(PortworxVolumeSource item);
    public A withNewPortworxVolumeSourceObject(String fsType,Boolean readOnly,String volumeID);
    public A withEventSourceObject(EventSource eventSourceObject);
    public WatchEventFluent.EventSourceObjectNested<A> withNewEventSourceObject();
    public WatchEventFluent.EventSourceObjectNested<A> withNewEventSourceObjectLike(EventSource item);
    public A withNewEventSourceObject(String component,String host);
    public A withInitializerObject(Initializer initializerObject);
    public WatchEventFluent.InitializerObjectNested<A> withNewInitializerObject();
    public WatchEventFluent.InitializerObjectNested<A> withNewInitializerObjectLike(Initializer item);
    public A withNewInitializerObject(String name);
    public A withImageStreamImportStatusObject(ImageStreamImportStatus imageStreamImportStatusObject);
    public WatchEventFluent.ImageStreamImportStatusObjectNested<A> withNewImageStreamImportStatusObject();
    public WatchEventFluent.ImageStreamImportStatusObjectNested<A> withNewImageStreamImportStatusObjectLike(ImageStreamImportStatus item);
    public A withHTTPIngressRuleValueObject(HTTPIngressRuleValue hTTPIngressRuleValueObject);
    public WatchEventFluent.HTTPIngressRuleValueObjectNested<A> withNewHTTPIngressRuleValueObject();
    public WatchEventFluent.HTTPIngressRuleValueObjectNested<A> withNewHTTPIngressRuleValueObjectLike(HTTPIngressRuleValue item);
    public A withOpenshiftRoleBindingRestrictionObject(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionObject);
    public WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObject();
    public WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObjectLike(OpenshiftRoleBindingRestriction item);
    public A withComponentConditionObject(ComponentCondition componentConditionObject);
    public WatchEventFluent.ComponentConditionObjectNested<A> withNewComponentConditionObject();
    public WatchEventFluent.ComponentConditionObjectNested<A> withNewComponentConditionObjectLike(ComponentCondition item);
    public A withNewComponentConditionObject(String error,String message,String status,String type);
    public A withReplicationControllerSpecObject(ReplicationControllerSpec replicationControllerSpecObject);
    public WatchEventFluent.ReplicationControllerSpecObjectNested<A> withNewReplicationControllerSpecObject();
    public WatchEventFluent.ReplicationControllerSpecObjectNested<A> withNewReplicationControllerSpecObjectLike(ReplicationControllerSpec item);
    public A withWebhookClientConfigObject(WebhookClientConfig webhookClientConfigObject);
    public WatchEventFluent.WebhookClientConfigObjectNested<A> withNewWebhookClientConfigObject();
    public WatchEventFluent.WebhookClientConfigObjectNested<A> withNewWebhookClientConfigObjectLike(WebhookClientConfig item);
    public A withDeploymentTriggerImageChangeParamsObject(DeploymentTriggerImageChangeParams deploymentTriggerImageChangeParamsObject);
    public WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<A> withNewDeploymentTriggerImageChangeParamsObject();
    public WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<A> withNewDeploymentTriggerImageChangeParamsObjectLike(DeploymentTriggerImageChangeParams item);
    public A withRoleBindingObject(RoleBinding roleBindingObject);
    public WatchEventFluent.RoleBindingObjectNested<A> withNewRoleBindingObject();
    public WatchEventFluent.RoleBindingObjectNested<A> withNewRoleBindingObjectLike(RoleBinding item);
    public A withPodPresetObject(PodPreset podPresetObject);
    public WatchEventFluent.PodPresetObjectNested<A> withNewPodPresetObject();
    public WatchEventFluent.PodPresetObjectNested<A> withNewPodPresetObjectLike(PodPreset item);
    public A withRollingUpdateDeploymentObject(RollingUpdateDeployment rollingUpdateDeploymentObject);
    public WatchEventFluent.RollingUpdateDeploymentObjectNested<A> withNewRollingUpdateDeploymentObject();
    public WatchEventFluent.RollingUpdateDeploymentObjectNested<A> withNewRollingUpdateDeploymentObjectLike(RollingUpdateDeployment item);
    public A withEmptyDirVolumeSourceObject(EmptyDirVolumeSource emptyDirVolumeSourceObject);
    public WatchEventFluent.EmptyDirVolumeSourceObjectNested<A> withNewEmptyDirVolumeSourceObject();
    public WatchEventFluent.EmptyDirVolumeSourceObjectNested<A> withNewEmptyDirVolumeSourceObjectLike(EmptyDirVolumeSource item);
    public A withTagImageHookObject(TagImageHook tagImageHookObject);
    public WatchEventFluent.TagImageHookObjectNested<A> withNewTagImageHookObject();
    public WatchEventFluent.TagImageHookObjectNested<A> withNewTagImageHookObjectLike(TagImageHook item);
    public A withRouteTargetReferenceObject(RouteTargetReference routeTargetReferenceObject);
    public WatchEventFluent.RouteTargetReferenceObjectNested<A> withNewRouteTargetReferenceObject();
    public WatchEventFluent.RouteTargetReferenceObjectNested<A> withNewRouteTargetReferenceObjectLike(RouteTargetReference item);
    public A withNewRouteTargetReferenceObject(String kind,String name,Integer weight);
    public A withAzureDiskVolumeSourceObject(AzureDiskVolumeSource azureDiskVolumeSourceObject);
    public WatchEventFluent.AzureDiskVolumeSourceObjectNested<A> withNewAzureDiskVolumeSourceObject();
    public WatchEventFluent.AzureDiskVolumeSourceObjectNested<A> withNewAzureDiskVolumeSourceObjectLike(AzureDiskVolumeSource item);
    public A withProjectObject(Project projectObject);
    public WatchEventFluent.ProjectObjectNested<A> withNewProjectObject();
    public WatchEventFluent.ProjectObjectNested<A> withNewProjectObjectLike(Project item);
    public A withInfoObject(Info infoObject);
    public WatchEventFluent.InfoObjectNested<A> withNewInfoObject();
    public WatchEventFluent.InfoObjectNested<A> withNewInfoObjectLike(Info item);
    public A withServiceStatusObject(ServiceStatus serviceStatusObject);
    public WatchEventFluent.ServiceStatusObjectNested<A> withNewServiceStatusObject();
    public WatchEventFluent.ServiceStatusObjectNested<A> withNewServiceStatusObjectLike(ServiceStatus item);
    public A withTaintObject(Taint taintObject);
    public WatchEventFluent.TaintObjectNested<A> withNewTaintObject();
    public WatchEventFluent.TaintObjectNested<A> withNewTaintObjectLike(Taint item);
    public A withNewTaintObject(String effect,String key,String timeAdded,String value);
    public A withOpenshiftRoleBindingRestrictionSpecObject(OpenshiftRoleBindingRestrictionSpec openshiftRoleBindingRestrictionSpecObject);
    public WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<A> withNewOpenshiftRoleBindingRestrictionSpecObject();
    public WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<A> withNewOpenshiftRoleBindingRestrictionSpecObjectLike(OpenshiftRoleBindingRestrictionSpec item);
    public A withAllowedHostPathObject(AllowedHostPath allowedHostPathObject);
    public WatchEventFluent.AllowedHostPathObjectNested<A> withNewAllowedHostPathObject();
    public WatchEventFluent.AllowedHostPathObjectNested<A> withNewAllowedHostPathObjectLike(AllowedHostPath item);
    public A withNewAllowedHostPathObject(String pathPrefix,Boolean readOnly);
    public A withDeploymentConfigListObject(DeploymentConfigList deploymentConfigListObject);
    public WatchEventFluent.DeploymentConfigListObjectNested<A> withNewDeploymentConfigListObject();
    public WatchEventFluent.DeploymentConfigListObjectNested<A> withNewDeploymentConfigListObjectLike(DeploymentConfigList item);
    public A withBuildConfigObject(BuildConfig buildConfigObject);
    public WatchEventFluent.BuildConfigObjectNested<A> withNewBuildConfigObject();
    public WatchEventFluent.BuildConfigObjectNested<A> withNewBuildConfigObjectLike(BuildConfig item);
    public A withCustomResourceConversionObject(CustomResourceConversion customResourceConversionObject);
    public WatchEventFluent.CustomResourceConversionObjectNested<A> withNewCustomResourceConversionObject();
    public WatchEventFluent.CustomResourceConversionObjectNested<A> withNewCustomResourceConversionObjectLike(CustomResourceConversion item);
    public A withCustomResourceDefinitionNamesObject(CustomResourceDefinitionNames customResourceDefinitionNamesObject);
    public WatchEventFluent.CustomResourceDefinitionNamesObjectNested<A> withNewCustomResourceDefinitionNamesObject();
    public WatchEventFluent.CustomResourceDefinitionNamesObjectNested<A> withNewCustomResourceDefinitionNamesObjectLike(CustomResourceDefinitionNames item);
    public A withImageImportStatusObject(ImageImportStatus imageImportStatusObject);
    public WatchEventFluent.ImageImportStatusObjectNested<A> withNewImageImportStatusObject();
    public WatchEventFluent.ImageImportStatusObjectNested<A> withNewImageImportStatusObjectLike(ImageImportStatus item);
    public A withIngressTLSObject(IngressTLS ingressTLSObject);
    public WatchEventFluent.IngressTLSObjectNested<A> withNewIngressTLSObject();
    public WatchEventFluent.IngressTLSObjectNested<A> withNewIngressTLSObjectLike(IngressTLS item);
    public A withCustomResourceValidationObject(CustomResourceValidation customResourceValidationObject);
    public WatchEventFluent.CustomResourceValidationObjectNested<A> withNewCustomResourceValidationObject();
    public WatchEventFluent.CustomResourceValidationObjectNested<A> withNewCustomResourceValidationObjectLike(CustomResourceValidation item);
    public A withPodDisruptionBudgetListObject(PodDisruptionBudgetList podDisruptionBudgetListObject);
    public WatchEventFluent.PodDisruptionBudgetListObjectNested<A> withNewPodDisruptionBudgetListObject();
    public WatchEventFluent.PodDisruptionBudgetListObjectNested<A> withNewPodDisruptionBudgetListObjectLike(PodDisruptionBudgetList item);
    public A withDeploymentConfigStatusObject(DeploymentConfigStatus deploymentConfigStatusObject);
    public WatchEventFluent.DeploymentConfigStatusObjectNested<A> withNewDeploymentConfigStatusObject();
    public WatchEventFluent.DeploymentConfigStatusObjectNested<A> withNewDeploymentConfigStatusObjectLike(DeploymentConfigStatus item);
    public A withGlusterfsPersistentVolumeSourceObject(GlusterfsPersistentVolumeSource glusterfsPersistentVolumeSourceObject);
    public WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<A> withNewGlusterfsPersistentVolumeSourceObject();
    public WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<A> withNewGlusterfsPersistentVolumeSourceObjectLike(GlusterfsPersistentVolumeSource item);
    public A withNewGlusterfsPersistentVolumeSourceObject(String endpoints,String endpointsNamespace,String path,Boolean readOnly);
    public A withClusterRoleObject(ClusterRole clusterRoleObject);
    public WatchEventFluent.ClusterRoleObjectNested<A> withNewClusterRoleObject();
    public WatchEventFluent.ClusterRoleObjectNested<A> withNewClusterRoleObjectLike(ClusterRole item);
    public A withClusterRoleBindingListObject(ClusterRoleBindingList clusterRoleBindingListObject);
    public WatchEventFluent.ClusterRoleBindingListObjectNested<A> withNewClusterRoleBindingListObject();
    public WatchEventFluent.ClusterRoleBindingListObjectNested<A> withNewClusterRoleBindingListObjectLike(ClusterRoleBindingList item);
    public A withTokenReviewStatusObject(TokenReviewStatus tokenReviewStatusObject);
    public WatchEventFluent.TokenReviewStatusObjectNested<A> withNewTokenReviewStatusObject();
    public WatchEventFluent.TokenReviewStatusObjectNested<A> withNewTokenReviewStatusObjectLike(TokenReviewStatus item);
    public A withTagEventObject(TagEvent tagEventObject);
    public WatchEventFluent.TagEventObjectNested<A> withNewTagEventObject();
    public WatchEventFluent.TagEventObjectNested<A> withNewTagEventObjectLike(TagEvent item);
    public A withNewTagEventObject(String created,String dockerImageReference,Long generation,String image);
    public A withImageStreamTagListObject(ImageStreamTagList imageStreamTagListObject);
    public WatchEventFluent.ImageStreamTagListObjectNested<A> withNewImageStreamTagListObject();
    public WatchEventFluent.ImageStreamTagListObjectNested<A> withNewImageStreamTagListObjectLike(ImageStreamTagList item);
    public A withCustomResourceSubresourceStatusObject(CustomResourceSubresourceStatus customResourceSubresourceStatusObject);
    public WatchEventFluent.CustomResourceSubresourceStatusObjectNested<A> withNewCustomResourceSubresourceStatusObject();
    public WatchEventFluent.CustomResourceSubresourceStatusObjectNested<A> withNewCustomResourceSubresourceStatusObjectLike(CustomResourceSubresourceStatus item);
    public A withISCSIPersistentVolumeSourceObject(ISCSIPersistentVolumeSource iSCSIPersistentVolumeSourceObject);
    public WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<A> withNewISCSIPersistentVolumeSourceObject();
    public WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<A> withNewISCSIPersistentVolumeSourceObjectLike(ISCSIPersistentVolumeSource item);
    public A withDownwardAPIVolumeSourceObject(DownwardAPIVolumeSource downwardAPIVolumeSourceObject);
    public WatchEventFluent.DownwardAPIVolumeSourceObjectNested<A> withNewDownwardAPIVolumeSourceObject();
    public WatchEventFluent.DownwardAPIVolumeSourceObjectNested<A> withNewDownwardAPIVolumeSourceObjectLike(DownwardAPIVolumeSource item);
    public A withListMetaObject(ListMeta listMetaObject);
    public WatchEventFluent.ListMetaObjectNested<A> withNewListMetaObject();
    public WatchEventFluent.ListMetaObjectNested<A> withNewListMetaObjectLike(ListMeta item);
    public A withNewListMetaObject(String _continue,String resourceVersion,String selfLink);
    public A withRootPathsObject(RootPaths rootPathsObject);
    public WatchEventFluent.RootPathsObjectNested<A> withNewRootPathsObject();
    public WatchEventFluent.RootPathsObjectNested<A> withNewRootPathsObjectLike(RootPaths item);
    public A withSecretReferenceObject(SecretReference secretReferenceObject);
    public WatchEventFluent.SecretReferenceObjectNested<A> withNewSecretReferenceObject();
    public WatchEventFluent.SecretReferenceObjectNested<A> withNewSecretReferenceObjectLike(SecretReference item);
    public A withNewSecretReferenceObject(String name,String namespace);
    public A withSourceStrategyOptionsObject(SourceStrategyOptions sourceStrategyOptionsObject);
    public WatchEventFluent.SourceStrategyOptionsObjectNested<A> withNewSourceStrategyOptionsObject();
    public WatchEventFluent.SourceStrategyOptionsObjectNested<A> withNewSourceStrategyOptionsObjectLike(SourceStrategyOptions item);
    public A withNewSourceStrategyOptionsObject(Boolean incremental);
    public A withISCSIVolumeSourceObject(ISCSIVolumeSource iSCSIVolumeSourceObject);
    public WatchEventFluent.ISCSIVolumeSourceObjectNested<A> withNewISCSIVolumeSourceObject();
    public WatchEventFluent.ISCSIVolumeSourceObjectNested<A> withNewISCSIVolumeSourceObjectLike(ISCSIVolumeSource item);
    public A withSecretKeySelectorObject(SecretKeySelector secretKeySelectorObject);
    public WatchEventFluent.SecretKeySelectorObjectNested<A> withNewSecretKeySelectorObject();
    public WatchEventFluent.SecretKeySelectorObjectNested<A> withNewSecretKeySelectorObjectLike(SecretKeySelector item);
    public A withNewSecretKeySelectorObject(String key,String name,Boolean optional);
    public A withOAuthAuthorizeTokenObject(OAuthAuthorizeToken oAuthAuthorizeTokenObject);
    public WatchEventFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObject();
    public WatchEventFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObjectLike(OAuthAuthorizeToken item);
    public A withQuobyteVolumeSourceObject(QuobyteVolumeSource quobyteVolumeSourceObject);
    public WatchEventFluent.QuobyteVolumeSourceObjectNested<A> withNewQuobyteVolumeSourceObject();
    public WatchEventFluent.QuobyteVolumeSourceObjectNested<A> withNewQuobyteVolumeSourceObjectLike(QuobyteVolumeSource item);
    public A withNewQuobyteVolumeSourceObject(String group,Boolean readOnly,String registry,String user,String volume);
    public A withDockerBuildStrategyObject(DockerBuildStrategy dockerBuildStrategyObject);
    public WatchEventFluent.DockerBuildStrategyObjectNested<A> withNewDockerBuildStrategyObject();
    public WatchEventFluent.DockerBuildStrategyObjectNested<A> withNewDockerBuildStrategyObjectLike(DockerBuildStrategy item);
    public A withSignatureConditionObject(SignatureCondition signatureConditionObject);
    public WatchEventFluent.SignatureConditionObjectNested<A> withNewSignatureConditionObject();
    public WatchEventFluent.SignatureConditionObjectNested<A> withNewSignatureConditionObjectLike(SignatureCondition item);
    public A withJobSpecObject(JobSpec jobSpecObject);
    public WatchEventFluent.JobSpecObjectNested<A> withNewJobSpecObject();
    public WatchEventFluent.JobSpecObjectNested<A> withNewJobSpecObjectLike(JobSpec item);
    public A withResourceQuotaStatusObject(ResourceQuotaStatus resourceQuotaStatusObject);
    public WatchEventFluent.ResourceQuotaStatusObjectNested<A> withNewResourceQuotaStatusObject();
    public WatchEventFluent.ResourceQuotaStatusObjectNested<A> withNewResourceQuotaStatusObjectLike(ResourceQuotaStatus item);
    public A withExternalMetricStatusObject(ExternalMetricStatus externalMetricStatusObject);
    public WatchEventFluent.ExternalMetricStatusObjectNested<A> withNewExternalMetricStatusObject();
    public WatchEventFluent.ExternalMetricStatusObjectNested<A> withNewExternalMetricStatusObjectLike(ExternalMetricStatus item);
    public A withScopedResourceSelectorRequirementObject(ScopedResourceSelectorRequirement scopedResourceSelectorRequirementObject);
    public WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<A> withNewScopedResourceSelectorRequirementObject();
    public WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<A> withNewScopedResourceSelectorRequirementObjectLike(ScopedResourceSelectorRequirement item);
    public A withDeploymentCauseObject(DeploymentCause deploymentCauseObject);
    public WatchEventFluent.DeploymentCauseObjectNested<A> withNewDeploymentCauseObject();
    public WatchEventFluent.DeploymentCauseObjectNested<A> withNewDeploymentCauseObjectLike(DeploymentCause item);
    public A withRepositoryImportStatusObject(RepositoryImportStatus repositoryImportStatusObject);
    public WatchEventFluent.RepositoryImportStatusObjectNested<A> withNewRepositoryImportStatusObject();
    public WatchEventFluent.RepositoryImportStatusObjectNested<A> withNewRepositoryImportStatusObjectLike(RepositoryImportStatus item);
    public A withGroupListObject(GroupList groupListObject);
    public WatchEventFluent.GroupListObjectNested<A> withNewGroupListObject();
    public WatchEventFluent.GroupListObjectNested<A> withNewGroupListObjectLike(GroupList item);
    public A withProjectedVolumeSourceObject(ProjectedVolumeSource projectedVolumeSourceObject);
    public WatchEventFluent.ProjectedVolumeSourceObjectNested<A> withNewProjectedVolumeSourceObject();
    public WatchEventFluent.ProjectedVolumeSourceObjectNested<A> withNewProjectedVolumeSourceObjectLike(ProjectedVolumeSource item);
    public A withLifecycleHookObject(LifecycleHook lifecycleHookObject);
    public WatchEventFluent.LifecycleHookObjectNested<A> withNewLifecycleHookObject();
    public WatchEventFluent.LifecycleHookObjectNested<A> withNewLifecycleHookObjectLike(LifecycleHook item);
    public A withHandlerObject(Handler handlerObject);
    public WatchEventFluent.HandlerObjectNested<A> withNewHandlerObject();
    public WatchEventFluent.HandlerObjectNested<A> withNewHandlerObjectLike(Handler item);
    public A withServiceAccountTokenProjectionObject(ServiceAccountTokenProjection serviceAccountTokenProjectionObject);
    public WatchEventFluent.ServiceAccountTokenProjectionObjectNested<A> withNewServiceAccountTokenProjectionObject();
    public WatchEventFluent.ServiceAccountTokenProjectionObjectNested<A> withNewServiceAccountTokenProjectionObjectLike(ServiceAccountTokenProjection item);
    public A withNewServiceAccountTokenProjectionObject(String audience,Long expirationSeconds,String path);
    public A withContainerObject(Container containerObject);
    public WatchEventFluent.ContainerObjectNested<A> withNewContainerObject();
    public WatchEventFluent.ContainerObjectNested<A> withNewContainerObjectLike(Container item);
    public A withTypedLocalObjectReference(TypedLocalObjectReference typedLocalObjectReference);
    public WatchEventFluent.TypedLocalObjectReferenceNested<A> withNewTypedLocalObjectReference();
    public WatchEventFluent.TypedLocalObjectReferenceNested<A> withNewTypedLocalObjectReferenceLike(TypedLocalObjectReference item);
    public A withNewTypedLocalObjectReference(String apiGroup,String kind,String name);
    public A withSupplementalGroupsStrategyOptionsObject(SupplementalGroupsStrategyOptions supplementalGroupsStrategyOptionsObject);
    public WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<A> withNewSupplementalGroupsStrategyOptionsObject();
    public WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<A> withNewSupplementalGroupsStrategyOptionsObjectLike(SupplementalGroupsStrategyOptions item);
    public A withCronJobListObject(CronJobList cronJobListObject);
    public WatchEventFluent.CronJobListObjectNested<A> withNewCronJobListObject();
    public WatchEventFluent.CronJobListObjectNested<A> withNewCronJobListObjectLike(CronJobList item);
    public A withRollbackConfigObject(RollbackConfig rollbackConfigObject);
    public WatchEventFluent.RollbackConfigObjectNested<A> withNewRollbackConfigObject();
    public WatchEventFluent.RollbackConfigObjectNested<A> withNewRollbackConfigObjectLike(RollbackConfig item);
    public A withNewRollbackConfigObject(Long revision);
    public A withRouteStatusObject(RouteStatus routeStatusObject);
    public WatchEventFluent.RouteStatusObjectNested<A> withNewRouteStatusObject();
    public WatchEventFluent.RouteStatusObjectNested<A> withNewRouteStatusObjectLike(RouteStatus item);
    public A withPodConditionObject(PodCondition podConditionObject);
    public WatchEventFluent.PodConditionObjectNested<A> withNewPodConditionObject();
    public WatchEventFluent.PodConditionObjectNested<A> withNewPodConditionObjectLike(PodCondition item);
    public A withDaemonSetConditionObject(DaemonSetCondition daemonSetConditionObject);
    public WatchEventFluent.DaemonSetConditionObjectNested<A> withNewDaemonSetConditionObject();
    public WatchEventFluent.DaemonSetConditionObjectNested<A> withNewDaemonSetConditionObjectLike(DaemonSetCondition item);
    public A withNewDaemonSetConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withDeploymentRollbackObject(DeploymentRollback deploymentRollbackObject);
    public WatchEventFluent.DeploymentRollbackObjectNested<A> withNewDeploymentRollbackObject();
    public WatchEventFluent.DeploymentRollbackObjectNested<A> withNewDeploymentRollbackObjectLike(DeploymentRollback item);
    public A withExecActionObject(ExecAction execActionObject);
    public WatchEventFluent.ExecActionObjectNested<A> withNewExecActionObject();
    public WatchEventFluent.ExecActionObjectNested<A> withNewExecActionObjectLike(ExecAction item);
    public A withNamedTagEventListObject(NamedTagEventList namedTagEventListObject);
    public WatchEventFluent.NamedTagEventListObjectNested<A> withNewNamedTagEventListObject();
    public WatchEventFluent.NamedTagEventListObjectNested<A> withNewNamedTagEventListObjectLike(NamedTagEventList item);
    public A withTolerationObject(Toleration tolerationObject);
    public WatchEventFluent.TolerationObjectNested<A> withNewTolerationObject();
    public WatchEventFluent.TolerationObjectNested<A> withNewTolerationObjectLike(Toleration item);
    public A withNewTolerationObject(String effect,String key,String operator,Long tolerationSeconds,String value);
    public A withNodeSelectorObject(NodeSelector nodeSelectorObject);
    public WatchEventFluent.NodeSelectorObjectNested<A> withNewNodeSelectorObject();
    public WatchEventFluent.NodeSelectorObjectNested<A> withNewNodeSelectorObjectLike(NodeSelector item);
    public A withWebhookObject(Webhook webhookObject);
    public WatchEventFluent.WebhookObjectNested<A> withNewWebhookObject();
    public WatchEventFluent.WebhookObjectNested<A> withNewWebhookObjectLike(Webhook item);
    public A withRouteSpecObject(RouteSpec routeSpecObject);
    public WatchEventFluent.RouteSpecObjectNested<A> withNewRouteSpecObject();
    public WatchEventFluent.RouteSpecObjectNested<A> withNewRouteSpecObjectLike(RouteSpec item);
    public A withCephFSPersistentVolumeSourceObject(CephFSPersistentVolumeSource cephFSPersistentVolumeSourceObject);
    public WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<A> withNewCephFSPersistentVolumeSourceObject();
    public WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<A> withNewCephFSPersistentVolumeSourceObjectLike(CephFSPersistentVolumeSource item);
    public A withPersistentVolumeClaimConditionObject(PersistentVolumeClaimCondition persistentVolumeClaimConditionObject);
    public WatchEventFluent.PersistentVolumeClaimConditionObjectNested<A> withNewPersistentVolumeClaimConditionObject();
    public WatchEventFluent.PersistentVolumeClaimConditionObjectNested<A> withNewPersistentVolumeClaimConditionObjectLike(PersistentVolumeClaimCondition item);
    public A withPersistentVolumeListObject(PersistentVolumeList persistentVolumeListObject);
    public WatchEventFluent.PersistentVolumeListObjectNested<A> withNewPersistentVolumeListObject();
    public WatchEventFluent.PersistentVolumeListObjectNested<A> withNewPersistentVolumeListObjectLike(PersistentVolumeList item);
    public A withProjectRequestObject(ProjectRequest projectRequestObject);
    public WatchEventFluent.ProjectRequestObjectNested<A> withNewProjectRequestObject();
    public WatchEventFluent.ProjectRequestObjectNested<A> withNewProjectRequestObjectLike(ProjectRequest item);
    public A withPriorityClassObject(PriorityClass priorityClassObject);
    public WatchEventFluent.PriorityClassObjectNested<A> withNewPriorityClassObject();
    public WatchEventFluent.PriorityClassObjectNested<A> withNewPriorityClassObjectLike(PriorityClass item);
    public A withTemplateObject(Template templateObject);
    public WatchEventFluent.TemplateObjectNested<A> withNewTemplateObject();
    public WatchEventFluent.TemplateObjectNested<A> withNewTemplateObjectLike(Template item);
    public A withPodDNSConfigOptionObject(PodDNSConfigOption podDNSConfigOptionObject);
    public WatchEventFluent.PodDNSConfigOptionObjectNested<A> withNewPodDNSConfigOptionObject();
    public WatchEventFluent.PodDNSConfigOptionObjectNested<A> withNewPodDNSConfigOptionObjectLike(PodDNSConfigOption item);
    public A withNewPodDNSConfigOptionObject(String name,String value);
    public A withGCEPersistentDiskVolumeSourceObject(GCEPersistentDiskVolumeSource gCEPersistentDiskVolumeSourceObject);
    public WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<A> withNewGCEPersistentDiskVolumeSourceObject();
    public WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<A> withNewGCEPersistentDiskVolumeSourceObjectLike(GCEPersistentDiskVolumeSource item);
    public A withNewGCEPersistentDiskVolumeSourceObject(String fsType,Integer partition,String pdName,Boolean readOnly);
    public A withOAuthClientAuthorizationObject(OAuthClientAuthorization oAuthClientAuthorizationObject);
    public WatchEventFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObject();
    public WatchEventFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObjectLike(OAuthClientAuthorization item);
    public A withNetworkPolicyIngressRuleObject(NetworkPolicyIngressRule networkPolicyIngressRuleObject);
    public WatchEventFluent.NetworkPolicyIngressRuleObjectNested<A> withNewNetworkPolicyIngressRuleObject();
    public WatchEventFluent.NetworkPolicyIngressRuleObjectNested<A> withNewNetworkPolicyIngressRuleObjectLike(NetworkPolicyIngressRule item);
    public A withJobTemplateSpecObject(JobTemplateSpec jobTemplateSpecObject);
    public WatchEventFluent.JobTemplateSpecObjectNested<A> withNewJobTemplateSpecObject();
    public WatchEventFluent.JobTemplateSpecObjectNested<A> withNewJobTemplateSpecObjectLike(JobTemplateSpec item);
    public A withImageChangeCauseObject(ImageChangeCause imageChangeCauseObject);
    public WatchEventFluent.ImageChangeCauseObjectNested<A> withNewImageChangeCauseObject();
    public WatchEventFluent.ImageChangeCauseObjectNested<A> withNewImageChangeCauseObjectLike(ImageChangeCause item);
    public A withEventListObject(EventList eventListObject);
    public WatchEventFluent.EventListObjectNested<A> withNewEventListObject();
    public WatchEventFluent.EventListObjectNested<A> withNewEventListObjectLike(EventList item);
    public A withPodReadinessGateObject(PodReadinessGate podReadinessGateObject);
    public WatchEventFluent.PodReadinessGateObjectNested<A> withNewPodReadinessGateObject();
    public WatchEventFluent.PodReadinessGateObjectNested<A> withNewPodReadinessGateObjectLike(PodReadinessGate item);
    public A withNewPodReadinessGateObject(String conditionType);
    public A withDeploymentObject(Deployment deploymentObject);
    public WatchEventFluent.DeploymentObjectNested<A> withNewDeploymentObject();
    public WatchEventFluent.DeploymentObjectNested<A> withNewDeploymentObjectLike(Deployment item);
    public A withContainerStateWaitingObject(ContainerStateWaiting containerStateWaitingObject);
    public WatchEventFluent.ContainerStateWaitingObjectNested<A> withNewContainerStateWaitingObject();
    public WatchEventFluent.ContainerStateWaitingObjectNested<A> withNewContainerStateWaitingObjectLike(ContainerStateWaiting item);
    public A withNewContainerStateWaitingObject(String message,String reason);
    public A withTagEventConditionObject(TagEventCondition tagEventConditionObject);
    public WatchEventFluent.TagEventConditionObjectNested<A> withNewTagEventConditionObject();
    public WatchEventFluent.TagEventConditionObjectNested<A> withNewTagEventConditionObjectLike(TagEventCondition item);
    public A withOpenshiftRoleListObject(OpenshiftRoleList openshiftRoleListObject);
    public WatchEventFluent.OpenshiftRoleListObjectNested<A> withNewOpenshiftRoleListObject();
    public WatchEventFluent.OpenshiftRoleListObjectNested<A> withNewOpenshiftRoleListObjectLike(OpenshiftRoleList item);
    public A withNetNamespaceListObject(NetNamespaceList netNamespaceListObject);
    public WatchEventFluent.NetNamespaceListObjectNested<A> withNewNetNamespaceListObject();
    public WatchEventFluent.NetNamespaceListObjectNested<A> withNewNetNamespaceListObjectLike(NetNamespaceList item);
    public A withBinaryBuildSourceObject(BinaryBuildSource binaryBuildSourceObject);
    public WatchEventFluent.BinaryBuildSourceObjectNested<A> withNewBinaryBuildSourceObject();
    public WatchEventFluent.BinaryBuildSourceObjectNested<A> withNewBinaryBuildSourceObjectLike(BinaryBuildSource item);
    public A withNewBinaryBuildSourceObject(String asFile);
    public A withOAuthClientAuthorizationListObject(OAuthClientAuthorizationList oAuthClientAuthorizationListObject);
    public WatchEventFluent.OAuthClientAuthorizationListObjectNested<A> withNewOAuthClientAuthorizationListObject();
    public WatchEventFluent.OAuthClientAuthorizationListObjectNested<A> withNewOAuthClientAuthorizationListObjectLike(OAuthClientAuthorizationList item);
    public A withIngressSpecObject(IngressSpec ingressSpecObject);
    public WatchEventFluent.IngressSpecObjectNested<A> withNewIngressSpecObject();
    public WatchEventFluent.IngressSpecObjectNested<A> withNewIngressSpecObjectLike(IngressSpec item);
    public A withLocalSubjectAccessReviewObject(io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReviewObject);
    public WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<A> withNewModelLocalSubjectAccessReviewObject();
    public WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObjectLike(io.fabric8.openshift.api.model.LocalSubjectAccessReview item);
    public A withAdmissionReviewObject(AdmissionReview admissionReviewObject);
    public WatchEventFluent.AdmissionReviewObjectNested<A> withNewAdmissionReviewObject();
    public WatchEventFluent.AdmissionReviewObjectNested<A> withNewAdmissionReviewObjectLike(AdmissionReview item);
    public A withRollingDeploymentStrategyParamsObject(RollingDeploymentStrategyParams rollingDeploymentStrategyParamsObject);
    public WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<A> withNewRollingDeploymentStrategyParamsObject();
    public WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<A> withNewRollingDeploymentStrategyParamsObjectLike(RollingDeploymentStrategyParams item);
    public A withDownwardAPIVolumeFileObject(DownwardAPIVolumeFile downwardAPIVolumeFileObject);
    public WatchEventFluent.DownwardAPIVolumeFileObjectNested<A> withNewDownwardAPIVolumeFileObject();
    public WatchEventFluent.DownwardAPIVolumeFileObjectNested<A> withNewDownwardAPIVolumeFileObjectLike(DownwardAPIVolumeFile item);
    public A withImageLabelObject(ImageLabel imageLabelObject);
    public WatchEventFluent.ImageLabelObjectNested<A> withNewImageLabelObject();
    public WatchEventFluent.ImageLabelObjectNested<A> withNewImageLabelObjectLike(ImageLabel item);
    public A withNewImageLabelObject(String name,String value);
    public A withPodTemplateObject(PodTemplate podTemplateObject);
    public WatchEventFluent.PodTemplateObjectNested<A> withNewPodTemplateObject();
    public WatchEventFluent.PodTemplateObjectNested<A> withNewPodTemplateObjectLike(PodTemplate item);
    public A withTCPSocketActionObject(TCPSocketAction tCPSocketActionObject);
    public WatchEventFluent.TCPSocketActionObjectNested<A> withNewTCPSocketActionObject();
    public WatchEventFluent.TCPSocketActionObjectNested<A> withNewTCPSocketActionObjectLike(TCPSocketAction item);
    public A withDaemonSetListObject(DaemonSetList daemonSetListObject);
    public WatchEventFluent.DaemonSetListObjectNested<A> withNewDaemonSetListObject();
    public WatchEventFluent.DaemonSetListObjectNested<A> withNewDaemonSetListObjectLike(DaemonSetList item);
    public A withEventObject(Event eventObject);
    public WatchEventFluent.EventObjectNested<A> withNewEventObject();
    public WatchEventFluent.EventObjectNested<A> withNewEventObjectLike(Event item);
    public A withPreferencesObject(Preferences preferencesObject);
    public WatchEventFluent.PreferencesObjectNested<A> withNewPreferencesObject();
    public WatchEventFluent.PreferencesObjectNested<A> withNewPreferencesObjectLike(Preferences item);
    public A withIngressObject(Ingress ingressObject);
    public WatchEventFluent.IngressObjectNested<A> withNewIngressObject();
    public WatchEventFluent.IngressObjectNested<A> withNewIngressObjectLike(Ingress item);
    public A withDeploymentConfigObject(DeploymentConfig deploymentConfigObject);
    public WatchEventFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObject();
    public WatchEventFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObjectLike(DeploymentConfig item);
    public A withObjectFieldSelectorObject(ObjectFieldSelector objectFieldSelectorObject);
    public WatchEventFluent.ObjectFieldSelectorObjectNested<A> withNewObjectFieldSelectorObject();
    public WatchEventFluent.ObjectFieldSelectorObjectNested<A> withNewObjectFieldSelectorObjectLike(ObjectFieldSelector item);
    public A withNewObjectFieldSelectorObject(String apiVersion,String fieldPath);
    public A withOAuthAccessTokenObject(OAuthAccessToken oAuthAccessTokenObject);
    public WatchEventFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObject();
    public WatchEventFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObjectLike(OAuthAccessToken item);
    public A withPersistentVolumeObject(PersistentVolume persistentVolumeObject);
    public WatchEventFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObject();
    public WatchEventFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObjectLike(PersistentVolume item);
    public A withCinderVolumeSourceObject(CinderVolumeSource cinderVolumeSourceObject);
    public WatchEventFluent.CinderVolumeSourceObjectNested<A> withNewCinderVolumeSourceObject();
    public WatchEventFluent.CinderVolumeSourceObjectNested<A> withNewCinderVolumeSourceObjectLike(CinderVolumeSource item);
    public A withObjectMetaObject(ObjectMeta objectMetaObject);
    public WatchEventFluent.ObjectMetaObjectNested<A> withNewObjectMetaObject();
    public WatchEventFluent.ObjectMetaObjectNested<A> withNewObjectMetaObjectLike(ObjectMeta item);
    public A withPersistentVolumeClaimObject(PersistentVolumeClaim persistentVolumeClaimObject);
    public WatchEventFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObject();
    public WatchEventFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObjectLike(PersistentVolumeClaim item);
    public A withJSONSchemaPropsObject(JSONSchemaProps jSONSchemaPropsObject);
    public WatchEventFluent.JSONSchemaPropsObjectNested<A> withNewJSONSchemaPropsObject();
    public WatchEventFluent.JSONSchemaPropsObjectNested<A> withNewJSONSchemaPropsObjectLike(JSONSchemaProps item);
    public A withDeploymentConditionObject(io.fabric8.openshift.api.model.DeploymentCondition deploymentConditionObject);
    public WatchEventFluent.ModelDeploymentConditionObjectNested<A> withNewModelDeploymentConditionObject();
    public WatchEventFluent.ModelDeploymentConditionObjectNested<A> withNewDeploymentConditionObjectLike(io.fabric8.openshift.api.model.DeploymentCondition item);
    public A withDeploymentCauseImageTriggerObject(DeploymentCauseImageTrigger deploymentCauseImageTriggerObject);
    public WatchEventFluent.DeploymentCauseImageTriggerObjectNested<A> withNewDeploymentCauseImageTriggerObject();
    public WatchEventFluent.DeploymentCauseImageTriggerObjectNested<A> withNewDeploymentCauseImageTriggerObjectLike(DeploymentCauseImageTrigger item);
    public A withNetworkPolicyPortObject(NetworkPolicyPort networkPolicyPortObject);
    public WatchEventFluent.NetworkPolicyPortObjectNested<A> withNewNetworkPolicyPortObject();
    public WatchEventFluent.NetworkPolicyPortObjectNested<A> withNewNetworkPolicyPortObjectLike(NetworkPolicyPort item);
    public A withOwnerReferenceObject(OwnerReference ownerReferenceObject);
    public WatchEventFluent.OwnerReferenceObjectNested<A> withNewOwnerReferenceObject();
    public WatchEventFluent.OwnerReferenceObjectNested<A> withNewOwnerReferenceObjectLike(OwnerReference item);
    public A withCinderPersistentVolumeSourceObject(CinderPersistentVolumeSource cinderPersistentVolumeSourceObject);
    public WatchEventFluent.CinderPersistentVolumeSourceObjectNested<A> withNewCinderPersistentVolumeSourceObject();
    public WatchEventFluent.CinderPersistentVolumeSourceObjectNested<A> withNewCinderPersistentVolumeSourceObjectLike(CinderPersistentVolumeSource item);
    public A withReplicationControllerConditionObject(ReplicationControllerCondition replicationControllerConditionObject);
    public WatchEventFluent.ReplicationControllerConditionObjectNested<A> withNewReplicationControllerConditionObject();
    public WatchEventFluent.ReplicationControllerConditionObjectNested<A> withNewReplicationControllerConditionObjectLike(ReplicationControllerCondition item);
    public A withNewReplicationControllerConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withPodAntiAffinityObject(PodAntiAffinity podAntiAffinityObject);
    public WatchEventFluent.PodAntiAffinityObjectNested<A> withNewPodAntiAffinityObject();
    public WatchEventFluent.PodAntiAffinityObjectNested<A> withNewPodAntiAffinityObjectLike(PodAntiAffinity item);
    public A withPodDisruptionBudgetSpecObject(PodDisruptionBudgetSpec podDisruptionBudgetSpecObject);
    public WatchEventFluent.PodDisruptionBudgetSpecObjectNested<A> withNewPodDisruptionBudgetSpecObject();
    public WatchEventFluent.PodDisruptionBudgetSpecObjectNested<A> withNewPodDisruptionBudgetSpecObjectLike(PodDisruptionBudgetSpec item);
    public A withMetricSpecObject(MetricSpec metricSpecObject);
    public WatchEventFluent.MetricSpecObjectNested<A> withNewMetricSpecObject();
    public WatchEventFluent.MetricSpecObjectNested<A> withNewMetricSpecObjectLike(MetricSpec item);
    public A withReplicationControllerListObject(ReplicationControllerList replicationControllerListObject);
    public WatchEventFluent.ReplicationControllerListObjectNested<A> withNewReplicationControllerListObject();
    public WatchEventFluent.ReplicationControllerListObjectNested<A> withNewReplicationControllerListObjectLike(ReplicationControllerList item);
    public A withEventObject(io.fabric8.kubernetes.api.model.events.Event eventObject);
    public WatchEventFluent.EventsEventObjectNested<A> withNewEventsEventObject();
    public WatchEventFluent.EventsEventObjectNested<A> withNewEventObjectLike(io.fabric8.kubernetes.api.model.events.Event item);
    public A withContainerStateRunningObject(ContainerStateRunning containerStateRunningObject);
    public WatchEventFluent.ContainerStateRunningObjectNested<A> withNewContainerStateRunningObject();
    public WatchEventFluent.ContainerStateRunningObjectNested<A> withNewContainerStateRunningObjectLike(ContainerStateRunning item);
    public A withNewContainerStateRunningObject(String startedAt);
    public A withHorizontalPodAutoscalerStatusObject(HorizontalPodAutoscalerStatus horizontalPodAutoscalerStatusObject);
    public WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<A> withNewHorizontalPodAutoscalerStatusObject();
    public WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<A> withNewHorizontalPodAutoscalerStatusObjectLike(HorizontalPodAutoscalerStatus item);
    public A withJSONSchemaPropsOrArrayObject(JSONSchemaPropsOrArray jSONSchemaPropsOrArrayObject);
    public WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<A> withNewJSONSchemaPropsOrArrayObject();
    public WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<A> withNewJSONSchemaPropsOrArrayObjectLike(JSONSchemaPropsOrArray item);
    public A withHTTPIngressPathObject(HTTPIngressPath hTTPIngressPathObject);
    public WatchEventFluent.HTTPIngressPathObjectNested<A> withNewHTTPIngressPathObject();
    public WatchEventFluent.HTTPIngressPathObjectNested<A> withNewHTTPIngressPathObjectLike(HTTPIngressPath item);
    public A withNamedExtensionObject(NamedExtension namedExtensionObject);
    public WatchEventFluent.NamedExtensionObjectNested<A> withNewNamedExtensionObject();
    public WatchEventFluent.NamedExtensionObjectNested<A> withNewNamedExtensionObjectLike(NamedExtension item);
    public A withAzureFilePersistentVolumeSourceObject(AzureFilePersistentVolumeSource azureFilePersistentVolumeSourceObject);
    public WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<A> withNewAzureFilePersistentVolumeSourceObject();
    public WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<A> withNewAzureFilePersistentVolumeSourceObjectLike(AzureFilePersistentVolumeSource item);
    public A withNewAzureFilePersistentVolumeSourceObject(Boolean readOnly,String secretName,String secretNamespace,String shareName);
    public A withSourceBuildStrategyObject(SourceBuildStrategy sourceBuildStrategyObject);
    public WatchEventFluent.SourceBuildStrategyObjectNested<A> withNewSourceBuildStrategyObject();
    public WatchEventFluent.SourceBuildStrategyObjectNested<A> withNewSourceBuildStrategyObjectLike(SourceBuildStrategy item);
    public A withStatefulSetObject(StatefulSet statefulSetObject);
    public WatchEventFluent.StatefulSetObjectNested<A> withNewStatefulSetObject();
    public WatchEventFluent.StatefulSetObjectNested<A> withNewStatefulSetObjectLike(StatefulSet item);
    public A withContainerPortObject(ContainerPort containerPortObject);
    public WatchEventFluent.ContainerPortObjectNested<A> withNewContainerPortObject();
    public WatchEventFluent.ContainerPortObjectNested<A> withNewContainerPortObjectLike(ContainerPort item);
    public A withNewContainerPortObject(Integer containerPort,String hostIP,Integer hostPort,String name,String protocol);
    public A withBuildPostCommitSpecObject(BuildPostCommitSpec buildPostCommitSpecObject);
    public WatchEventFluent.BuildPostCommitSpecObjectNested<A> withNewBuildPostCommitSpecObject();
    public WatchEventFluent.BuildPostCommitSpecObjectNested<A> withNewBuildPostCommitSpecObjectLike(BuildPostCommitSpec item);
    public A withPodListObject(PodList podListObject);
    public WatchEventFluent.PodListObjectNested<A> withNewPodListObject();
    public WatchEventFluent.PodListObjectNested<A> withNewPodListObjectLike(PodList item);
    public A withResourceFieldSelectorObject(ResourceFieldSelector resourceFieldSelectorObject);
    public WatchEventFluent.ResourceFieldSelectorObjectNested<A> withNewResourceFieldSelectorObject();
    public WatchEventFluent.ResourceFieldSelectorObjectNested<A> withNewResourceFieldSelectorObjectLike(ResourceFieldSelector item);
    public A withOpenshiftClusterRoleObject(OpenshiftClusterRole openshiftClusterRoleObject);
    public WatchEventFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObject();
    public WatchEventFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObjectLike(OpenshiftClusterRole item);
    public A withScaleSpecObject(ScaleSpec scaleSpecObject);
    public WatchEventFluent.ScaleSpecObjectNested<A> withNewScaleSpecObject();
    public WatchEventFluent.ScaleSpecObjectNested<A> withNewScaleSpecObjectLike(ScaleSpec item);
    public A withNewScaleSpecObject(Integer replicas);
    public A withDeploymentStrategyObject(io.fabric8.openshift.api.model.DeploymentStrategy deploymentStrategyObject);
    public WatchEventFluent.ModelDeploymentStrategyObjectNested<A> withNewModelDeploymentStrategyObject();
    public WatchEventFluent.ModelDeploymentStrategyObjectNested<A> withNewDeploymentStrategyObjectLike(io.fabric8.openshift.api.model.DeploymentStrategy item);
    public A withSignatureSubjectObject(SignatureSubject signatureSubjectObject);
    public WatchEventFluent.SignatureSubjectObjectNested<A> withNewSignatureSubjectObject();
    public WatchEventFluent.SignatureSubjectObjectNested<A> withNewSignatureSubjectObjectLike(SignatureSubject item);
    public A withNewSignatureSubjectObject(String commonName,String organization,String publicKeyID);
    public A withPersistentVolumeClaimSpecObject(PersistentVolumeClaimSpec persistentVolumeClaimSpecObject);
    public WatchEventFluent.PersistentVolumeClaimSpecObjectNested<A> withNewPersistentVolumeClaimSpecObject();
    public WatchEventFluent.PersistentVolumeClaimSpecObjectNested<A> withNewPersistentVolumeClaimSpecObjectLike(PersistentVolumeClaimSpec item);
    public A withRouteIngressConditionObject(RouteIngressCondition routeIngressConditionObject);
    public WatchEventFluent.RouteIngressConditionObjectNested<A> withNewRouteIngressConditionObject();
    public WatchEventFluent.RouteIngressConditionObjectNested<A> withNewRouteIngressConditionObjectLike(RouteIngressCondition item);
    public A withNewRouteIngressConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withLoadBalancerStatusObject(LoadBalancerStatus loadBalancerStatusObject);
    public WatchEventFluent.LoadBalancerStatusObjectNested<A> withNewLoadBalancerStatusObject();
    public WatchEventFluent.LoadBalancerStatusObjectNested<A> withNewLoadBalancerStatusObjectLike(LoadBalancerStatus item);
    public A withScopeSelectorObject(ScopeSelector scopeSelectorObject);
    public WatchEventFluent.ScopeSelectorObjectNested<A> withNewScopeSelectorObject();
    public WatchEventFluent.ScopeSelectorObjectNested<A> withNewScopeSelectorObjectLike(ScopeSelector item);
    public A withRunAsGroupStrategyOptionsObject(RunAsGroupStrategyOptions runAsGroupStrategyOptionsObject);
    public WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<A> withNewRunAsGroupStrategyOptionsObject();
    public WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<A> withNewRunAsGroupStrategyOptionsObjectLike(RunAsGroupStrategyOptions item);
    public A withStageInfoObject(StageInfo stageInfoObject);
    public WatchEventFluent.StageInfoObjectNested<A> withNewStageInfoObject();
    public WatchEventFluent.StageInfoObjectNested<A> withNewStageInfoObjectLike(StageInfo item);
    public A withUserListObject(UserList userListObject);
    public WatchEventFluent.UserListObjectNested<A> withNewUserListObject();
    public WatchEventFluent.UserListObjectNested<A> withNewUserListObjectLike(UserList item);
    public A withRoleObject(Role roleObject);
    public WatchEventFluent.RoleObjectNested<A> withNewRoleObject();
    public WatchEventFluent.RoleObjectNested<A> withNewRoleObjectLike(Role item);
    public A withServicePortObject(ServicePort servicePortObject);
    public WatchEventFluent.ServicePortObjectNested<A> withNewServicePortObject();
    public WatchEventFluent.ServicePortObjectNested<A> withNewServicePortObjectLike(ServicePort item);
    public A withUserObject(User userObject);
    public WatchEventFluent.UserObjectNested<A> withNewUserObject();
    public WatchEventFluent.UserObjectNested<A> withNewUserObjectLike(User item);
    public A withSessionAffinityConfigObject(SessionAffinityConfig sessionAffinityConfigObject);
    public WatchEventFluent.SessionAffinityConfigObjectNested<A> withNewSessionAffinityConfigObject();
    public WatchEventFluent.SessionAffinityConfigObjectNested<A> withNewSessionAffinityConfigObjectLike(SessionAffinityConfig item);
    public A withBuildStatusOutputToObject(BuildStatusOutputTo buildStatusOutputToObject);
    public WatchEventFluent.BuildStatusOutputToObjectNested<A> withNewBuildStatusOutputToObject();
    public WatchEventFluent.BuildStatusOutputToObjectNested<A> withNewBuildStatusOutputToObjectLike(BuildStatusOutputTo item);
    public A withNewBuildStatusOutputToObject(String imageDigest);
    public A withSecretSpecObject(SecretSpec secretSpecObject);
    public WatchEventFluent.SecretSpecObjectNested<A> withNewSecretSpecObject();
    public WatchEventFluent.SecretSpecObjectNested<A> withNewSecretSpecObjectLike(SecretSpec item);
    public A withServiceAccountListObject(ServiceAccountList serviceAccountListObject);
    public WatchEventFluent.ServiceAccountListObjectNested<A> withNewServiceAccountListObject();
    public WatchEventFluent.ServiceAccountListObjectNested<A> withNewServiceAccountListObjectLike(ServiceAccountList item);
    public A withExecNewPodHookObject(ExecNewPodHook execNewPodHookObject);
    public WatchEventFluent.ExecNewPodHookObjectNested<A> withNewExecNewPodHookObject();
    public WatchEventFluent.ExecNewPodHookObjectNested<A> withNewExecNewPodHookObjectLike(ExecNewPodHook item);
    public A withComponentStatusObject(ComponentStatus componentStatusObject);
    public WatchEventFluent.ComponentStatusObjectNested<A> withNewComponentStatusObject();
    public WatchEventFluent.ComponentStatusObjectNested<A> withNewComponentStatusObjectLike(ComponentStatus item);
    public A withScaleStatusObject(ScaleStatus scaleStatusObject);
    public WatchEventFluent.ScaleStatusObjectNested<A> withNewScaleStatusObject();
    public WatchEventFluent.ScaleStatusObjectNested<A> withNewScaleStatusObjectLike(ScaleStatus item);
    public A withCertificateSigningRequestConditionObject(CertificateSigningRequestCondition certificateSigningRequestConditionObject);
    public WatchEventFluent.CertificateSigningRequestConditionObjectNested<A> withNewCertificateSigningRequestConditionObject();
    public WatchEventFluent.CertificateSigningRequestConditionObjectNested<A> withNewCertificateSigningRequestConditionObjectLike(CertificateSigningRequestCondition item);
    public A withNewCertificateSigningRequestConditionObject(String lastUpdateTime,String message,String reason,String type);
    public A withDaemonEndpointObject(DaemonEndpoint daemonEndpointObject);
    public WatchEventFluent.DaemonEndpointObjectNested<A> withNewDaemonEndpointObject();
    public WatchEventFluent.DaemonEndpointObjectNested<A> withNewDaemonEndpointObjectLike(DaemonEndpoint item);
    public A withNewDaemonEndpointObject(Integer port);
    public A withBuildTriggerPolicyObject(BuildTriggerPolicy buildTriggerPolicyObject);
    public WatchEventFluent.BuildTriggerPolicyObjectNested<A> withNewBuildTriggerPolicyObject();
    public WatchEventFluent.BuildTriggerPolicyObjectNested<A> withNewBuildTriggerPolicyObjectLike(BuildTriggerPolicy item);
    public A withTokenReviewObject(TokenReview tokenReviewObject);
    public WatchEventFluent.TokenReviewObjectNested<A> withNewTokenReviewObject();
    public WatchEventFluent.TokenReviewObjectNested<A> withNewTokenReviewObjectLike(TokenReview item);
    public A withPodSecurityPolicyListObject(PodSecurityPolicyList podSecurityPolicyListObject);
    public WatchEventFluent.PodSecurityPolicyListObjectNested<A> withNewPodSecurityPolicyListObject();
    public WatchEventFluent.PodSecurityPolicyListObjectNested<A> withNewPodSecurityPolicyListObjectLike(PodSecurityPolicyList item);
    public A withStorageClassListObject(StorageClassList storageClassListObject);
    public WatchEventFluent.StorageClassListObjectNested<A> withNewStorageClassListObject();
    public WatchEventFluent.StorageClassListObjectNested<A> withNewStorageClassListObjectLike(StorageClassList item);
    public A withRoleListObject(RoleList roleListObject);
    public WatchEventFluent.RoleListObjectNested<A> withNewRoleListObject();
    public WatchEventFluent.RoleListObjectNested<A> withNewRoleListObjectLike(RoleList item);
    public A withRoleRefObject(RoleRef roleRefObject);
    public WatchEventFluent.RoleRefObjectNested<A> withNewRoleRefObject();
    public WatchEventFluent.RoleRefObjectNested<A> withNewRoleRefObjectLike(RoleRef item);
    public A withNewRoleRefObject(String apiGroup,String kind,String name);
    public A withBindingObject(Binding bindingObject);
    public WatchEventFluent.BindingObjectNested<A> withNewBindingObject();
    public WatchEventFluent.BindingObjectNested<A> withNewBindingObjectLike(Binding item);
    public A withDeploymentConfigSpecObject(DeploymentConfigSpec deploymentConfigSpecObject);
    public WatchEventFluent.DeploymentConfigSpecObjectNested<A> withNewDeploymentConfigSpecObject();
    public WatchEventFluent.DeploymentConfigSpecObjectNested<A> withNewDeploymentConfigSpecObjectLike(DeploymentConfigSpec item);
    public A withRollingUpdateDaemonSetObject(RollingUpdateDaemonSet rollingUpdateDaemonSetObject);
    public WatchEventFluent.RollingUpdateDaemonSetObjectNested<A> withNewRollingUpdateDaemonSetObject();
    public WatchEventFluent.RollingUpdateDaemonSetObjectNested<A> withNewRollingUpdateDaemonSetObjectLike(RollingUpdateDaemonSet item);
    public A withNetworkPolicySpecObject(NetworkPolicySpec networkPolicySpecObject);
    public WatchEventFluent.NetworkPolicySpecObjectNested<A> withNewNetworkPolicySpecObject();
    public WatchEventFluent.NetworkPolicySpecObjectNested<A> withNewNetworkPolicySpecObjectLike(NetworkPolicySpec item);
    public A withSecretObject(Secret secretObject);
    public WatchEventFluent.SecretObjectNested<A> withNewSecretObject();
    public WatchEventFluent.SecretObjectNested<A> withNewSecretObjectLike(Secret item);
    public A withServiceListObject(ServiceList serviceListObject);
    public WatchEventFluent.ServiceListObjectNested<A> withNewServiceListObject();
    public WatchEventFluent.ServiceListObjectNested<A> withNewServiceListObjectLike(ServiceList item);
    public A withStatefulSetUpdateStrategyObject(StatefulSetUpdateStrategy statefulSetUpdateStrategyObject);
    public WatchEventFluent.StatefulSetUpdateStrategyObjectNested<A> withNewStatefulSetUpdateStrategyObject();
    public WatchEventFluent.StatefulSetUpdateStrategyObjectNested<A> withNewStatefulSetUpdateStrategyObjectLike(StatefulSetUpdateStrategy item);
    public A withEventSeriesObject(io.fabric8.kubernetes.api.model.events.EventSeries eventSeriesObject);
    public WatchEventFluent.EventsEventSeriesObjectNested<A> withNewEventsEventSeriesObject();
    public WatchEventFluent.EventsEventSeriesObjectNested<A> withNewEventSeriesObjectLike(io.fabric8.kubernetes.api.model.events.EventSeries item);
    public A withVolumeNodeAffinityObject(VolumeNodeAffinity volumeNodeAffinityObject);
    public WatchEventFluent.VolumeNodeAffinityObjectNested<A> withNewVolumeNodeAffinityObject();
    public WatchEventFluent.VolumeNodeAffinityObjectNested<A> withNewVolumeNodeAffinityObjectLike(VolumeNodeAffinity item);
    public A withPodsMetricStatusObject(PodsMetricStatus podsMetricStatusObject);
    public WatchEventFluent.PodsMetricStatusObjectNested<A> withNewPodsMetricStatusObject();
    public WatchEventFluent.PodsMetricStatusObjectNested<A> withNewPodsMetricStatusObjectLike(PodsMetricStatus item);
    public A withResourceQuotaSpecObject(ResourceQuotaSpec resourceQuotaSpecObject);
    public WatchEventFluent.ResourceQuotaSpecObjectNested<A> withNewResourceQuotaSpecObject();
    public WatchEventFluent.ResourceQuotaSpecObjectNested<A> withNewResourceQuotaSpecObjectLike(ResourceQuotaSpec item);
    public A withGroupRestrictionObject(GroupRestriction groupRestrictionObject);
    public WatchEventFluent.GroupRestrictionObjectNested<A> withNewGroupRestrictionObject();
    public WatchEventFluent.GroupRestrictionObjectNested<A> withNewGroupRestrictionObjectLike(GroupRestriction item);
    public A withJenkinsPipelineBuildStrategyObject(JenkinsPipelineBuildStrategy jenkinsPipelineBuildStrategyObject);
    public WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<A> withNewJenkinsPipelineBuildStrategyObject();
    public WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<A> withNewJenkinsPipelineBuildStrategyObjectLike(JenkinsPipelineBuildStrategy item);
    public A withSecurityContextConstraintsObject(SecurityContextConstraints securityContextConstraintsObject);
    public WatchEventFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObject();
    public WatchEventFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObjectLike(SecurityContextConstraints item);
    public A withSubjectObject(Subject subjectObject);
    public WatchEventFluent.SubjectObjectNested<A> withNewSubjectObject();
    public WatchEventFluent.SubjectObjectNested<A> withNewSubjectObjectLike(Subject item);
    public A withNewSubjectObject(String apiGroup,String kind,String name,String namespace);
    public A withReplicaSetConditionObject(ReplicaSetCondition replicaSetConditionObject);
    public WatchEventFluent.ReplicaSetConditionObjectNested<A> withNewReplicaSetConditionObject();
    public WatchEventFluent.ReplicaSetConditionObjectNested<A> withNewReplicaSetConditionObjectLike(ReplicaSetCondition item);
    public A withNewReplicaSetConditionObject(String lastTransitionTime,String message,String reason,String status,String type);
    public A withBaseKubernetesListObject(BaseKubernetesList baseKubernetesListObject);
    public WatchEventFluent.BaseKubernetesListObjectNested<A> withNewBaseKubernetesListObject();
    public WatchEventFluent.BaseKubernetesListObjectNested<A> withNewBaseKubernetesListObjectLike(BaseKubernetesList item);
    public A withSELinuxContextStrategyOptionsObject(SELinuxContextStrategyOptions sELinuxContextStrategyOptionsObject);
    public WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<A> withNewSELinuxContextStrategyOptionsObject();
    public WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<A> withNewSELinuxContextStrategyOptionsObjectLike(SELinuxContextStrategyOptions item);
    public A withTopologySelectorLabelRequirementObject(TopologySelectorLabelRequirement topologySelectorLabelRequirementObject);
    public WatchEventFluent.TopologySelectorLabelRequirementObjectNested<A> withNewTopologySelectorLabelRequirementObject();
    public WatchEventFluent.TopologySelectorLabelRequirementObjectNested<A> withNewTopologySelectorLabelRequirementObjectLike(TopologySelectorLabelRequirement item);
    public A withRBDPersistentVolumeSourceObject(RBDPersistentVolumeSource rBDPersistentVolumeSourceObject);
    public WatchEventFluent.RBDPersistentVolumeSourceObjectNested<A> withNewRBDPersistentVolumeSourceObject();
    public WatchEventFluent.RBDPersistentVolumeSourceObjectNested<A> withNewRBDPersistentVolumeSourceObjectLike(RBDPersistentVolumeSource item);
    public A withSELinuxOptionsObject(SELinuxOptions sELinuxOptionsObject);
    public WatchEventFluent.SELinuxOptionsObjectNested<A> withNewSELinuxOptionsObject();
    public WatchEventFluent.SELinuxOptionsObjectNested<A> withNewSELinuxOptionsObjectLike(SELinuxOptions item);
    public A withNewSELinuxOptionsObject(String level,String role,String type,String user);
    public A withHostAliasObject(HostAlias hostAliasObject);
    public WatchEventFluent.HostAliasObjectNested<A> withNewHostAliasObject();
    public WatchEventFluent.HostAliasObjectNested<A> withNewHostAliasObjectLike(HostAlias item);
    public A withImageStreamStatusObject(ImageStreamStatus imageStreamStatusObject);
    public WatchEventFluent.ImageStreamStatusObjectNested<A> withNewImageStreamStatusObject();
    public WatchEventFluent.ImageStreamStatusObjectNested<A> withNewImageStreamStatusObjectLike(ImageStreamStatus item);
    public A withNodeDaemonEndpointsObject(NodeDaemonEndpoints nodeDaemonEndpointsObject);
    public WatchEventFluent.NodeDaemonEndpointsObjectNested<A> withNewNodeDaemonEndpointsObject();
    public WatchEventFluent.NodeDaemonEndpointsObjectNested<A> withNewNodeDaemonEndpointsObjectLike(NodeDaemonEndpoints item);
    public A withNetNamespaceObject(NetNamespace netNamespaceObject);
    public WatchEventFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObject();
    public WatchEventFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObjectLike(NetNamespace item);
    public A withPersistentVolumeSpecObject(PersistentVolumeSpec persistentVolumeSpecObject);
    public WatchEventFluent.PersistentVolumeSpecObjectNested<A> withNewPersistentVolumeSpecObject();
    public WatchEventFluent.PersistentVolumeSpecObjectNested<A> withNewPersistentVolumeSpecObjectLike(PersistentVolumeSpec item);
    public A withStatefulSetListObject(StatefulSetList statefulSetListObject);
    public WatchEventFluent.StatefulSetListObjectNested<A> withNewStatefulSetListObject();
    public WatchEventFluent.StatefulSetListObjectNested<A> withNewStatefulSetListObjectLike(StatefulSetList item);
    public A withOpenshiftClusterRoleBindingListObject(OpenshiftClusterRoleBindingList openshiftClusterRoleBindingListObject);
    public WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<A> withNewOpenshiftClusterRoleBindingListObject();
    public WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<A> withNewOpenshiftClusterRoleBindingListObjectLike(OpenshiftClusterRoleBindingList item);
    public A withReplicaSetStatusObject(ReplicaSetStatus replicaSetStatusObject);
    public WatchEventFluent.ReplicaSetStatusObjectNested<A> withNewReplicaSetStatusObject();
    public WatchEventFluent.ReplicaSetStatusObjectNested<A> withNewReplicaSetStatusObjectLike(ReplicaSetStatus item);
    public A withNodeObject(Node nodeObject);
    public WatchEventFluent.NodeObjectNested<A> withNewNodeObject();
    public WatchEventFluent.NodeObjectNested<A> withNewNodeObjectLike(Node item);
    public A withPriorityClassListObject(PriorityClassList priorityClassListObject);
    public WatchEventFluent.PriorityClassListObjectNested<A> withNewPriorityClassListObject();
    public WatchEventFluent.PriorityClassListObjectNested<A> withNewPriorityClassListObjectLike(PriorityClassList item);
    public A withJobObject(Job jobObject);
    public WatchEventFluent.JobObjectNested<A> withNewJobObject();
    public WatchEventFluent.JobObjectNested<A> withNewJobObjectLike(Job item);
    public A withPodStatusObject(PodStatus podStatusObject);
    public WatchEventFluent.PodStatusObjectNested<A> withNewPodStatusObject();
    public WatchEventFluent.PodStatusObjectNested<A> withNewPodStatusObjectLike(PodStatus item);
    public A withBuildOutputObject(BuildOutput buildOutputObject);
    public WatchEventFluent.BuildOutputObjectNested<A> withNewBuildOutputObject();
    public WatchEventFluent.BuildOutputObjectNested<A> withNewBuildOutputObjectLike(BuildOutput item);
    public A withExecConfigObject(ExecConfig execConfigObject);
    public WatchEventFluent.ExecConfigObjectNested<A> withNewExecConfigObject();
    public WatchEventFluent.ExecConfigObjectNested<A> withNewExecConfigObjectLike(ExecConfig item);
    public A withPersistentVolumeStatusObject(PersistentVolumeStatus persistentVolumeStatusObject);
    public WatchEventFluent.PersistentVolumeStatusObjectNested<A> withNewPersistentVolumeStatusObject();
    public WatchEventFluent.PersistentVolumeStatusObjectNested<A> withNewPersistentVolumeStatusObjectLike(PersistentVolumeStatus item);
    public A withNewPersistentVolumeStatusObject(String message,String phase,String reason);
    public A withEndpointPortObject(EndpointPort endpointPortObject);
    public WatchEventFluent.EndpointPortObjectNested<A> withNewEndpointPortObject();
    public WatchEventFluent.EndpointPortObjectNested<A> withNewEndpointPortObjectLike(EndpointPort item);
    public A withNewEndpointPortObject(String name,Integer port,String protocol);
    public A withSourceRevisionObject(SourceRevision sourceRevisionObject);
    public WatchEventFluent.SourceRevisionObjectNested<A> withNewSourceRevisionObject();
    public WatchEventFluent.SourceRevisionObjectNested<A> withNewSourceRevisionObjectLike(SourceRevision item);
    public A withJSONObject(JSON jSONObject);
    public WatchEventFluent.JSONObjectNested<A> withNewJSONObject();
    public WatchEventFluent.JSONObjectNested<A> withNewJSONObjectLike(JSON item);
    public A withNewJSONObject(String raw);
    public A withLimitRangeItemObject(LimitRangeItem limitRangeItemObject);
    public WatchEventFluent.LimitRangeItemObjectNested<A> withNewLimitRangeItemObject();
    public WatchEventFluent.LimitRangeItemObjectNested<A> withNewLimitRangeItemObjectLike(LimitRangeItem item);
    public A withCertificateSigningRequestObject(CertificateSigningRequest certificateSigningRequestObject);
    public WatchEventFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObject();
    public WatchEventFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObjectLike(CertificateSigningRequest item);
    public A withFSGroupStrategyOptionsObject(FSGroupStrategyOptions fSGroupStrategyOptionsObject);
    public WatchEventFluent.FSGroupStrategyOptionsObjectNested<A> withNewFSGroupStrategyOptionsObject();
    public WatchEventFluent.FSGroupStrategyOptionsObjectNested<A> withNewFSGroupStrategyOptionsObjectLike(FSGroupStrategyOptions item);
    public A withClusterRoleListObject(ClusterRoleList clusterRoleListObject);
    public WatchEventFluent.ClusterRoleListObjectNested<A> withNewClusterRoleListObject();
    public WatchEventFluent.ClusterRoleListObjectNested<A> withNewClusterRoleListObjectLike(ClusterRoleList item);
    public A withRouteIngressObject(RouteIngress routeIngressObject);
    public WatchEventFluent.RouteIngressObjectNested<A> withNewRouteIngressObject();
    public WatchEventFluent.RouteIngressObjectNested<A> withNewRouteIngressObjectLike(RouteIngress item);
    public A withServiceAccountObject(ServiceAccount serviceAccountObject);
    public WatchEventFluent.ServiceAccountObjectNested<A> withNewServiceAccountObject();
    public WatchEventFluent.ServiceAccountObjectNested<A> withNewServiceAccountObjectLike(ServiceAccount item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface PatchObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PatchFluent<WatchEventFluent.PatchObjectNested<N>>{

        
    public N and();    public N endPatchObject();
}
    public interface DeploymentListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentListFluent<WatchEventFluent.DeploymentListObjectNested<N>>{

        
    public N and();    public N endDeploymentListObject();
}
    public interface ScopeRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScopeRestrictionFluent<WatchEventFluent.ScopeRestrictionObjectNested<N>>{

        
    public N and();    public N endScopeRestrictionObject();
}
    public interface PodsMetricSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodsMetricSourceFluent<WatchEventFluent.PodsMetricSourceObjectNested<N>>{

        
    public N and();    public N endPodsMetricSourceObject();
}
    public interface StepInfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StepInfoFluent<WatchEventFluent.StepInfoObjectNested<N>>{

        
    public N and();    public N endStepInfoObject();
}
    public interface StatefulSetStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetStatusFluent<WatchEventFluent.StatefulSetStatusObjectNested<N>>{

        
    public N and();    public N endStatefulSetStatusObject();
}
    public interface PodTemplateSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<WatchEventFluent.PodTemplateSpecObjectNested<N>>{

        
    public N and();    public N endPodTemplateSpecObject();
}
    public interface AuthInfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AuthInfoFluent<WatchEventFluent.AuthInfoObjectNested<N>>{

        
    public N and();    public N endAuthInfoObject();
}
    public interface ConfigMapKeySelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapKeySelectorFluent<WatchEventFluent.ConfigMapKeySelectorObjectNested<N>>{

        
    public N and();    public N endConfigMapKeySelectorObject();
}
    public interface RuleWithOperationsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RuleWithOperationsFluent<WatchEventFluent.RuleWithOperationsObjectNested<N>>{

        
    public N and();    public N endRuleWithOperationsObject();
}
    public interface HostPathVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostPathVolumeSourceFluent<WatchEventFluent.HostPathVolumeSourceObjectNested<N>>{

        
    public N and();    public N endHostPathVolumeSourceObject();
}
    public interface NamedContextObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedContextFluent<WatchEventFluent.NamedContextObjectNested<N>>{

        
    public N and();    public N endNamedContextObject();
}
    public interface ConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigFluent<WatchEventFluent.ConfigObjectNested<N>>{

        
    public N and();    public N endConfigObject();
}
    public interface PodPresetSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetSpecFluent<WatchEventFluent.PodPresetSpecObjectNested<N>>{

        
    public N and();    public N endPodPresetSpecObject();
}
    public interface AffinityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AffinityFluent<WatchEventFluent.AffinityObjectNested<N>>{

        
    public N and();    public N endAffinityObject();
}
    public interface ResourceAttributesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceAttributesFluent<WatchEventFluent.ResourceAttributesObjectNested<N>>{

        
    public N and();    public N endResourceAttributesObject();
}
    public interface SubjectAccessReviewSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewSpecFluent<WatchEventFluent.SubjectAccessReviewSpecObjectNested<N>>{

        
    public N and();    public N endSubjectAccessReviewSpecObject();
}
    public interface ValidatingWebhookConfigurationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<WatchEventFluent.ValidatingWebhookConfigurationObjectNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationObject();
}
    public interface ModelPolicyRuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.PolicyRuleFluent<WatchEventFluent.ModelPolicyRuleObjectNested<N>>{

        
    public N and();    public N endModelPolicyRuleObject();
}
    public interface NetworkPolicyEgressRuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyEgressRuleFluent<WatchEventFluent.NetworkPolicyEgressRuleObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyEgressRuleObject();
}
    public interface IPBlockObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IPBlockFluent<WatchEventFluent.IPBlockObjectNested<N>>{

        
    public N and();    public N endIPBlockObject();
}
    public interface DeploymentTriggerPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentTriggerPolicyFluent<WatchEventFluent.DeploymentTriggerPolicyObjectNested<N>>{

        
    public N and();    public N endDeploymentTriggerPolicyObject();
}
    public interface BuildStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStrategyFluent<WatchEventFluent.BuildStrategyObjectNested<N>>{

        
    public N and();    public N endBuildStrategyObject();
}
    public interface ServiceReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceReferenceFluent<WatchEventFluent.ServiceReferenceObjectNested<N>>{

        
    public N and();    public N endServiceReferenceObject();
}
    public interface StatefulSetSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetSpecFluent<WatchEventFluent.StatefulSetSpecObjectNested<N>>{

        
    public N and();    public N endStatefulSetSpecObject();
}
    public interface StorageClassObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<WatchEventFluent.StorageClassObjectNested<N>>{

        
    public N and();    public N endStorageClassObject();
}
    public interface CustomBuildStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomBuildStrategyFluent<WatchEventFluent.CustomBuildStrategyObjectNested<N>>{

        
    public N and();    public N endCustomBuildStrategyObject();
}
    public interface HorizontalPodAutoscalerConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerConditionFluent<WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerConditionObject();
}
    public interface AzureFileVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureFileVolumeSourceFluent<WatchEventFluent.AzureFileVolumeSourceObjectNested<N>>{

        
    public N and();    public N endAzureFileVolumeSourceObject();
}
    public interface ClusterRoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<WatchEventFluent.ClusterRoleBindingObjectNested<N>>{

        
    public N and();    public N endClusterRoleBindingObject();
}
    public interface EnvVarObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<WatchEventFluent.EnvVarObjectNested<N>>{

        
    public N and();    public N endEnvVarObject();
}
    public interface SubjectAccessReviewResponseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewResponseFluent<WatchEventFluent.SubjectAccessReviewResponseObjectNested<N>>{

        
    public N and();    public N endSubjectAccessReviewResponseObject();
}
    public interface HostPortRangeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostPortRangeFluent<WatchEventFluent.HostPortRangeObjectNested<N>>{

        
    public N and();    public N endHostPortRangeObject();
}
    public interface LoadBalancerIngressObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LoadBalancerIngressFluent<WatchEventFluent.LoadBalancerIngressObjectNested<N>>{

        
    public N and();    public N endLoadBalancerIngressObject();
}
    public interface AttachedVolumeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AttachedVolumeFluent<WatchEventFluent.AttachedVolumeObjectNested<N>>{

        
    public N and();    public N endAttachedVolumeObject();
}
    public interface LocalObjectReferenceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<WatchEventFluent.LocalObjectReferenceNested<N>>{

        
    public N and();    public N endLocalObjectReference();
}
    public interface NamedAuthInfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedAuthInfoFluent<WatchEventFluent.NamedAuthInfoObjectNested<N>>{

        
    public N and();    public N endNamedAuthInfoObject();
}
    public interface JobConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobConditionFluent<WatchEventFluent.JobConditionObjectNested<N>>{

        
    public N and();    public N endJobConditionObject();
}
    public interface PodSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSpecFluent<WatchEventFluent.PodSpecObjectNested<N>>{

        
    public N and();    public N endPodSpecObject();
}
    public interface PreconditionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PreconditionsFluent<WatchEventFluent.PreconditionsObjectNested<N>>{

        
    public N and();    public N endPreconditionsObject();
}
    public interface TagReferencePolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferencePolicyFluent<WatchEventFluent.TagReferencePolicyObjectNested<N>>{

        
    public N and();    public N endTagReferencePolicyObject();
}
    public interface OpenshiftRoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<WatchEventFluent.OpenshiftRoleBindingObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingObject();
}
    public interface CephFSVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CephFSVolumeSourceFluent<WatchEventFluent.CephFSVolumeSourceObjectNested<N>>{

        
    public N and();    public N endCephFSVolumeSourceObject();
}
    public interface NodeConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConditionFluent<WatchEventFluent.NodeConditionObjectNested<N>>{

        
    public N and();    public N endNodeConditionObject();
}
    public interface EndpointSubsetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointSubsetFluent<WatchEventFluent.EndpointSubsetObjectNested<N>>{

        
    public N and();    public N endEndpointSubsetObject();
}
    public interface LocalVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalVolumeSourceFluent<WatchEventFluent.LocalVolumeSourceObjectNested<N>>{

        
    public N and();    public N endLocalVolumeSourceObject();
}
    public interface CertificateSigningRequestListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestListFluent<WatchEventFluent.CertificateSigningRequestListObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestListObject();
}
    public interface PodDisruptionBudgetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<WatchEventFluent.PodDisruptionBudgetObjectNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetObject();
}
    public interface DaemonSetStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetStatusFluent<WatchEventFluent.DaemonSetStatusObjectNested<N>>{

        
    public N and();    public N endDaemonSetStatusObject();
}
    public interface ObjectMetricSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetricSourceFluent<WatchEventFluent.ObjectMetricSourceObjectNested<N>>{

        
    public N and();    public N endObjectMetricSourceObject();
}
    public interface BuildStatusOutputObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStatusOutputFluent<WatchEventFluent.BuildStatusOutputObjectNested<N>>{

        
    public N and();    public N endBuildStatusOutputObject();
}
    public interface NetworkPolicyPeerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyPeerFluent<WatchEventFluent.NetworkPolicyPeerObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyPeerObject();
}
    public interface ConfigMapNodeConfigSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapNodeConfigSourceFluent<WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<N>>{

        
    public N and();    public N endConfigMapNodeConfigSourceObject();
}
    public interface HTTPGetActionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPGetActionFluent<WatchEventFluent.HTTPGetActionObjectNested<N>>{

        
    public N and();    public N endHTTPGetActionObject();
}
    public interface OpenshiftClusterRoleScopeRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleScopeRestrictionFluent<WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleScopeRestrictionObject();
}
    public interface GitLabWebHookCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitLabWebHookCauseFluent<WatchEventFluent.GitLabWebHookCauseObjectNested<N>>{

        
    public N and();    public N endGitLabWebHookCauseObject();
}
    public interface NetworkPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<WatchEventFluent.NetworkPolicyObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyObject();
}
    public interface SecretBuildSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretBuildSourceFluent<WatchEventFluent.SecretBuildSourceObjectNested<N>>{

        
    public N and();    public N endSecretBuildSourceObject();
}
    public interface OpenshiftClusterRoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingObject();
}
    public interface DaemonSetSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetSpecFluent<WatchEventFluent.DaemonSetSpecObjectNested<N>>{

        
    public N and();    public N endDaemonSetSpecObject();
}
    public interface SELinuxStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxStrategyOptionsFluent<WatchEventFluent.SELinuxStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endSELinuxStrategyOptionsObject();
}
    public interface JobStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobStatusFluent<WatchEventFluent.JobStatusObjectNested<N>>{

        
    public N and();    public N endJobStatusObject();
}
    public interface ObjectMetricStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetricStatusFluent<WatchEventFluent.ObjectMetricStatusObjectNested<N>>{

        
    public N and();    public N endObjectMetricStatusObject();
}
    public interface BitbucketWebHookCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BitbucketWebHookCauseFluent<WatchEventFluent.BitbucketWebHookCauseObjectNested<N>>{

        
    public N and();    public N endBitbucketWebHookCauseObject();
}
    public interface ProjectListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectListFluent<WatchEventFluent.ProjectListObjectNested<N>>{

        
    public N and();    public N endProjectListObject();
}
    public interface PodSecurityPolicySpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicySpecFluent<WatchEventFluent.PodSecurityPolicySpecObjectNested<N>>{

        
    public N and();    public N endPodSecurityPolicySpecObject();
}
    public interface RoleBindingListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingListFluent<WatchEventFluent.RoleBindingListObjectNested<N>>{

        
    public N and();    public N endRoleBindingListObject();
}
    public interface EnvFromSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvFromSourceFluent<WatchEventFluent.EnvFromSourceObjectNested<N>>{

        
    public N and();    public N endEnvFromSourceObject();
}
    public interface NamespaceSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceSpecFluent<WatchEventFluent.NamespaceSpecObjectNested<N>>{

        
    public N and();    public N endNamespaceSpecObject();
}
    public interface RouteObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<WatchEventFluent.RouteObjectNested<N>>{

        
    public N and();    public N endRouteObject();
}
    public interface TypeMetaObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TypeMetaFluent<WatchEventFluent.TypeMetaObjectNested<N>>{

        
    public N and();    public N endTypeMetaObject();
}
    public interface IngressBackendObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressBackendFluent<WatchEventFluent.IngressBackendObjectNested<N>>{

        
    public N and();    public N endIngressBackendObject();
}
    public interface FlexVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlexVolumeSourceFluent<WatchEventFluent.FlexVolumeSourceObjectNested<N>>{

        
    public N and();    public N endFlexVolumeSourceObject();
}
    public interface RBDVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RBDVolumeSourceFluent<WatchEventFluent.RBDVolumeSourceObjectNested<N>>{

        
    public N and();    public N endRBDVolumeSourceObject();
}
    public interface ResourceQuotaListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaListFluent<WatchEventFluent.ResourceQuotaListObjectNested<N>>{

        
    public N and();    public N endResourceQuotaListObject();
}
    public interface NodeConfigStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigStatusFluent<WatchEventFluent.NodeConfigStatusObjectNested<N>>{

        
    public N and();    public N endNodeConfigStatusObject();
}
    public interface NetworkPolicyListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyListFluent<WatchEventFluent.NetworkPolicyListObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyListObject();
}
    public interface AdmissionResponseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionResponseFluent<WatchEventFluent.AdmissionResponseObjectNested<N>>{

        
    public N and();    public N endAdmissionResponseObject();
}
    public interface AdmissionRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionRequestFluent<WatchEventFluent.AdmissionRequestObjectNested<N>>{

        
    public N and();    public N endAdmissionRequestObject();
}
    public interface RawExtensionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RawExtensionFluent<WatchEventFluent.RawExtensionObjectNested<N>>{

        
    public N and();    public N endRawExtensionObject();
}
    public interface SecurityContextConstraintsListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsListFluent<WatchEventFluent.SecurityContextConstraintsListObjectNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsListObject();
}
    public interface BuildConfigListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigListFluent<WatchEventFluent.BuildConfigListObjectNested<N>>{

        
    public N and();    public N endBuildConfigListObject();
}
    public interface IdentityListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityListFluent<WatchEventFluent.IdentityListObjectNested<N>>{

        
    public N and();    public N endIdentityListObject();
}
    public interface ConfigMapProjectionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapProjectionFluent<WatchEventFluent.ConfigMapProjectionObjectNested<N>>{

        
    public N and();    public N endConfigMapProjectionObject();
}
    public interface CustomResourceDefinitionSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionSpecFluent<WatchEventFluent.CustomResourceDefinitionSpecObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionSpecObject();
}
    public interface NamespaceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<WatchEventFluent.NamespaceObjectNested<N>>{

        
    public N and();    public N endNamespaceObject();
}
    public interface ContainerStateTerminatedObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateTerminatedFluent<WatchEventFluent.ContainerStateTerminatedObjectNested<N>>{

        
    public N and();    public N endContainerStateTerminatedObject();
}
    public interface GroupVersionKindObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupVersionKindFluent<WatchEventFluent.GroupVersionKindObjectNested<N>>{

        
    public N and();    public N endGroupVersionKindObject();
}
    public interface RunAsUserStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RunAsUserStrategyOptionsFluent<WatchEventFluent.RunAsUserStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endRunAsUserStrategyOptionsObject();
}
    public interface LimitRangeSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeSpecFluent<WatchEventFluent.LimitRangeSpecObjectNested<N>>{

        
    public N and();    public N endLimitRangeSpecObject();
}
    public interface SourceControlUserObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceControlUserFluent<WatchEventFluent.SourceControlUserObjectNested<N>>{

        
    public N and();    public N endSourceControlUserObject();
}
    public interface ContainerStateObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateFluent<WatchEventFluent.ContainerStateObjectNested<N>>{

        
    public N and();    public N endContainerStateObject();
}
    public interface UserInfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserInfoFluent<WatchEventFluent.UserInfoObjectNested<N>>{

        
    public N and();    public N endUserInfoObject();
}
    public interface PersistentVolumeClaimStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimStatusFluent<WatchEventFluent.PersistentVolumeClaimStatusObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimStatusObject();
}
    public interface ServiceSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceSpecFluent<WatchEventFluent.ServiceSpecObjectNested<N>>{

        
    public N and();    public N endServiceSpecObject();
}
    public interface PhotonPersistentDiskVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PhotonPersistentDiskVolumeSourceFluent<WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<N>>{

        
    public N and();    public N endPhotonPersistentDiskVolumeSourceObject();
}
    public interface IngressRuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressRuleFluent<WatchEventFluent.IngressRuleObjectNested<N>>{

        
    public N and();    public N endIngressRuleObject();
}
    public interface IngressStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressStatusFluent<WatchEventFluent.IngressStatusObjectNested<N>>{

        
    public N and();    public N endIngressStatusObject();
}
    public interface ImageStreamListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamListFluent<WatchEventFluent.ImageStreamListObjectNested<N>>{

        
    public N and();    public N endImageStreamListObject();
}
    public interface NodeSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSpecFluent<WatchEventFluent.NodeSpecObjectNested<N>>{

        
    public N and();    public N endNodeSpecObject();
}
    public interface LocalSubjectAccessReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalSubjectAccessReviewFluent<WatchEventFluent.LocalSubjectAccessReviewObjectNested<N>>{

        
    public N and();    public N endLocalSubjectAccessReviewObject();
}
    public interface SecretListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretListFluent<WatchEventFluent.SecretListObjectNested<N>>{

        
    public N and();    public N endSecretListObject();
}
    public interface NodeAddressObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeAddressFluent<WatchEventFluent.NodeAddressObjectNested<N>>{

        
    public N and();    public N endNodeAddressObject();
}
    public interface PodAffinityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAffinityFluent<WatchEventFluent.PodAffinityObjectNested<N>>{

        
    public N and();    public N endPodAffinityObject();
}
    public interface HorizontalPodAutoscalerListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerListFluent<WatchEventFluent.HorizontalPodAutoscalerListObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerListObject();
}
    public interface ServiceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<WatchEventFluent.ServiceObjectNested<N>>{

        
    public N and();    public N endServiceObject();
}
    public interface ExecEnvVarObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecEnvVarFluent<WatchEventFluent.ExecEnvVarObjectNested<N>>{

        
    public N and();    public N endExecEnvVarObject();
}
    public interface DeploymentStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentStatusFluent<WatchEventFluent.DeploymentStatusObjectNested<N>>{

        
    public N and();    public N endDeploymentStatusObject();
}
    public interface EventSeriesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventSeriesFluent<WatchEventFluent.EventSeriesObjectNested<N>>{

        
    public N and();    public N endEventSeriesObject();
}
    public interface InitializersObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InitializersFluent<WatchEventFluent.InitializersObjectNested<N>>{

        
    public N and();    public N endInitializersObject();
}
    public interface ContainerImageObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerImageFluent<WatchEventFluent.ContainerImageObjectNested<N>>{

        
    public N and();    public N endContainerImageObject();
}
    public interface NodeStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeStatusFluent<WatchEventFluent.NodeStatusObjectNested<N>>{

        
    public N and();    public N endNodeStatusObject();
}
    public interface ReplicationControllerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<WatchEventFluent.ReplicationControllerObjectNested<N>>{

        
    public N and();    public N endReplicationControllerObject();
}
    public interface ConfigMapListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapListFluent<WatchEventFluent.ConfigMapListObjectNested<N>>{

        
    public N and();    public N endConfigMapListObject();
}
    public interface SubjectAccessReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewFluent<WatchEventFluent.SubjectAccessReviewObjectNested<N>>{

        
    public N and();    public N endSubjectAccessReviewObject();
}
    public interface PreferredSchedulingTermObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PreferredSchedulingTermFluent<WatchEventFluent.PreferredSchedulingTermObjectNested<N>>{

        
    public N and();    public N endPreferredSchedulingTermObject();
}
    public interface ExternalDocumentationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExternalDocumentationFluent<WatchEventFluent.ExternalDocumentationObjectNested<N>>{

        
    public N and();    public N endExternalDocumentationObject();
}
    public interface ImageLookupPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLookupPolicyFluent<WatchEventFluent.ImageLookupPolicyObjectNested<N>>{

        
    public N and();    public N endImageLookupPolicyObject();
}
    public interface MutatingWebhookConfigurationListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationListFluent<WatchEventFluent.MutatingWebhookConfigurationListObjectNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationListObject();
}
    public interface ModelAllowedFlexVolumeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<WatchEventFluent.ModelAllowedFlexVolumeObjectNested<N>>{

        
    public N and();    public N endModelAllowedFlexVolumeObject();
}
    public interface ModelSubjectAccessReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.SubjectAccessReviewFluent<WatchEventFluent.ModelSubjectAccessReviewObjectNested<N>>{

        
    public N and();    public N endModelSubjectAccessReviewObject();
}
    public interface PodPresetListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetListFluent<WatchEventFluent.PodPresetListObjectNested<N>>{

        
    public N and();    public N endPodPresetListObject();
}
    public interface MutatingWebhookConfigurationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<WatchEventFluent.MutatingWebhookConfigurationObjectNested<N>>{

        
    public N and();    public N endMutatingWebhookConfigurationObject();
}
    public interface VolumeMountObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeMountFluent<WatchEventFluent.VolumeMountObjectNested<N>>{

        
    public N and();    public N endVolumeMountObject();
}
    public interface LabelSelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<WatchEventFluent.LabelSelectorObjectNested<N>>{

        
    public N and();    public N endLabelSelectorObject();
}
    public interface CronJobStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobStatusFluent<WatchEventFluent.CronJobStatusObjectNested<N>>{

        
    public N and();    public N endCronJobStatusObject();
}
    public interface BuildSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildSpecFluent<WatchEventFluent.BuildSpecObjectNested<N>>{

        
    public N and();    public N endBuildSpecObject();
}
    public interface StatusCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusCauseFluent<WatchEventFluent.StatusCauseObjectNested<N>>{

        
    public N and();    public N endStatusCauseObject();
}
    public interface ProjectStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectStatusFluent<WatchEventFluent.ProjectStatusObjectNested<N>>{

        
    public N and();    public N endProjectStatusObject();
}
    public interface NamedClusterObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedClusterFluent<WatchEventFluent.NamedClusterObjectNested<N>>{

        
    public N and();    public N endNamedClusterObject();
}
    public interface GitSourceRevisionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitSourceRevisionFluent<WatchEventFluent.GitSourceRevisionObjectNested<N>>{

        
    public N and();    public N endGitSourceRevisionObject();
}
    public interface StatusDetailsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusDetailsFluent<WatchEventFluent.StatusDetailsObjectNested<N>>{

        
    public N and();    public N endStatusDetailsObject();
}
    public interface ImageChangeTriggerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageChangeTriggerFluent<WatchEventFluent.ImageChangeTriggerObjectNested<N>>{

        
    public N and();    public N endImageChangeTriggerObject();
}
    public interface SysctlObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SysctlFluent<WatchEventFluent.SysctlObjectNested<N>>{

        
    public N and();    public N endSysctlObject();
}
    public interface HorizontalPodAutoscalerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<WatchEventFluent.HorizontalPodAutoscalerObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerObject();
}
    public interface ImageStreamImportSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportSpecFluent<WatchEventFluent.ImageStreamImportSpecObjectNested<N>>{

        
    public N and();    public N endImageStreamImportSpecObject();
}
    public interface ModelFSGroupStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endModelFSGroupStrategyOptionsObject();
}
    public interface ScaleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleFluent<WatchEventFluent.ScaleObjectNested<N>>{

        
    public N and();    public N endScaleObject();
}
    public interface StatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusFluent<WatchEventFluent.StatusObjectNested<N>>{

        
    public N and();    public N endStatusObject();
}
    public interface DeleteOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeleteOptionsFluent<WatchEventFluent.DeleteOptionsObjectNested<N>>{

        
    public N and();    public N endDeleteOptionsObject();
}
    public interface ContainerStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStatusFluent<WatchEventFluent.ContainerStatusObjectNested<N>>{

        
    public N and();    public N endContainerStatusObject();
}
    public interface ConfigMapEnvSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapEnvSourceFluent<WatchEventFluent.ConfigMapEnvSourceObjectNested<N>>{

        
    public N and();    public N endConfigMapEnvSourceObject();
}
    public interface DeploymentSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentSpecFluent<WatchEventFluent.DeploymentSpecObjectNested<N>>{

        
    public N and();    public N endDeploymentSpecObject();
}
    public interface CertificateSigningRequestStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestStatusFluent<WatchEventFluent.CertificateSigningRequestStatusObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestStatusObject();
}
    public interface NodeSelectorRequirementObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorRequirementFluent<WatchEventFluent.NodeSelectorRequirementObjectNested<N>>{

        
    public N and();    public N endNodeSelectorRequirementObject();
}
    public interface RecreateDeploymentStrategyParamsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RecreateDeploymentStrategyParamsFluent<WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<N>>{

        
    public N and();    public N endRecreateDeploymentStrategyParamsObject();
}
    public interface DockerStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DockerStrategyOptionsFluent<WatchEventFluent.DockerStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endDockerStrategyOptionsObject();
}
    public interface ImageListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageListFluent<WatchEventFluent.ImageListObjectNested<N>>{

        
    public N and();    public N endImageListObject();
}
    public interface ConfigMapBuildSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapBuildSourceFluent<WatchEventFluent.ConfigMapBuildSourceObjectNested<N>>{

        
    public N and();    public N endConfigMapBuildSourceObject();
}
    public interface ReplicaSetListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetListFluent<WatchEventFluent.ReplicaSetListObjectNested<N>>{

        
    public N and();    public N endReplicaSetListObject();
}
    public interface PodTemplateListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateListFluent<WatchEventFluent.PodTemplateListObjectNested<N>>{

        
    public N and();    public N endPodTemplateListObject();
}
    public interface ImageObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<WatchEventFluent.ImageObjectNested<N>>{

        
    public N and();    public N endImageObject();
}
    public interface TLSConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TLSConfigFluent<WatchEventFluent.TLSConfigObjectNested<N>>{

        
    public N and();    public N endTLSConfigObject();
}
    public interface EndpointAddressObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointAddressFluent<WatchEventFluent.EndpointAddressObjectNested<N>>{

        
    public N and();    public N endEndpointAddressObject();
}
    public interface BuildStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStatusFluent<WatchEventFluent.BuildStatusObjectNested<N>>{

        
    public N and();    public N endBuildStatusObject();
}
    public interface CustomResourceDefinitionConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionConditionFluent<WatchEventFluent.CustomResourceDefinitionConditionObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionConditionObject();
}
    public interface NodeConfigSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigSourceFluent<WatchEventFluent.NodeConfigSourceObjectNested<N>>{

        
    public N and();    public N endNodeConfigSourceObject();
}
    public interface ImageSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSourceFluent<WatchEventFluent.ImageSourceObjectNested<N>>{

        
    public N and();    public N endImageSourceObject();
}
    public interface VsphereVirtualDiskVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VsphereVirtualDiskVolumeSourceFluent<WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<N>>{

        
    public N and();    public N endVsphereVirtualDiskVolumeSourceObject();
}
    public interface RuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RuleFluent<WatchEventFluent.RuleObjectNested<N>>{

        
    public N and();    public N endRuleObject();
}
    public interface TagReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferenceFluent<WatchEventFluent.TagReferenceObjectNested<N>>{

        
    public N and();    public N endTagReferenceObject();
}
    public interface CrossVersionObjectReferenceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CrossVersionObjectReferenceFluent<WatchEventFluent.CrossVersionObjectReferenceNested<N>>{

        
    public N and();    public N endCrossVersionObjectReference();
}
    public interface LabelSelectorRequirementObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorRequirementFluent<WatchEventFluent.LabelSelectorRequirementObjectNested<N>>{

        
    public N and();    public N endLabelSelectorRequirementObject();
}
    public interface CustomResourceSubresourcesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourcesFluent<WatchEventFluent.CustomResourceSubresourcesObjectNested<N>>{

        
    public N and();    public N endCustomResourceSubresourcesObject();
}
    public interface DaemonSetUpdateStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetUpdateStrategyFluent<WatchEventFluent.DaemonSetUpdateStrategyObjectNested<N>>{

        
    public N and();    public N endDaemonSetUpdateStrategyObject();
}
    public interface ReplicaSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<WatchEventFluent.ReplicaSetObjectNested<N>>{

        
    public N and();    public N endReplicaSetObject();
}
    public interface GitRepoVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitRepoVolumeSourceFluent<WatchEventFluent.GitRepoVolumeSourceObjectNested<N>>{

        
    public N and();    public N endGitRepoVolumeSourceObject();
}
    public interface AggregationRuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AggregationRuleFluent<WatchEventFluent.AggregationRuleObjectNested<N>>{

        
    public N and();    public N endAggregationRuleObject();
}
    public interface EndpointsListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsListFluent<WatchEventFluent.EndpointsListObjectNested<N>>{

        
    public N and();    public N endEndpointsListObject();
}
    public interface GroupVersionResourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupVersionResourceFluent<WatchEventFluent.GroupVersionResourceObjectNested<N>>{

        
    public N and();    public N endGroupVersionResourceObject();
}
    public interface BuildSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildSourceFluent<WatchEventFluent.BuildSourceObjectNested<N>>{

        
    public N and();    public N endBuildSourceObject();
}
    public interface PodSecurityPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<WatchEventFluent.PodSecurityPolicyObjectNested<N>>{

        
    public N and();    public N endPodSecurityPolicyObject();
}
    public interface CronJobObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<WatchEventFluent.CronJobObjectNested<N>>{

        
    public N and();    public N endCronJobObject();
}
    public interface TopologySelectorTermObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TopologySelectorTermFluent<WatchEventFluent.TopologySelectorTermObjectNested<N>>{

        
    public N and();    public N endTopologySelectorTermObject();
}
    public interface CustomResourceSubresourceScaleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourceScaleFluent<WatchEventFluent.CustomResourceSubresourceScaleObjectNested<N>>{

        
    public N and();    public N endCustomResourceSubresourceScaleObject();
}
    public interface StorageOSPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageOSPersistentVolumeSourceFluent<WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endStorageOSPersistentVolumeSourceObject();
}
    public interface CertificateSigningRequestSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestSpecFluent<WatchEventFluent.CertificateSigningRequestSpecObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestSpecObject();
}
    public interface SecurityContextObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextFluent<WatchEventFluent.SecurityContextObjectNested<N>>{

        
    public N and();    public N endSecurityContextObject();
}
    public interface ConfigMapVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapVolumeSourceFluent<WatchEventFluent.ConfigMapVolumeSourceObjectNested<N>>{

        
    public N and();    public N endConfigMapVolumeSourceObject();
}
    public interface ComponentStatusListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusListFluent<WatchEventFluent.ComponentStatusListObjectNested<N>>{

        
    public N and();    public N endComponentStatusListObject();
}
    public interface GitBuildSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitBuildSourceFluent<WatchEventFluent.GitBuildSourceObjectNested<N>>{

        
    public N and();    public N endGitBuildSourceObject();
}
    public interface FlockerVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlockerVolumeSourceFluent<WatchEventFluent.FlockerVolumeSourceObjectNested<N>>{

        
    public N and();    public N endFlockerVolumeSourceObject();
}
    public interface ScaleIOVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleIOVolumeSourceFluent<WatchEventFluent.ScaleIOVolumeSourceObjectNested<N>>{

        
    public N and();    public N endScaleIOVolumeSourceObject();
}
    public interface LimitRangeListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeListFluent<WatchEventFluent.LimitRangeListObjectNested<N>>{

        
    public N and();    public N endLimitRangeListObject();
}
    public interface ProbeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProbeFluent<WatchEventFluent.ProbeObjectNested<N>>{

        
    public N and();    public N endProbeObject();
}
    public interface ImageSourcePathObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSourcePathFluent<WatchEventFluent.ImageSourcePathObjectNested<N>>{

        
    public N and();    public N endImageSourcePathObject();
}
    public interface EndpointsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<WatchEventFluent.EndpointsObjectNested<N>>{

        
    public N and();    public N endEndpointsObject();
}
    public interface BuildConfigStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigStatusFluent<WatchEventFluent.BuildConfigStatusObjectNested<N>>{

        
    public N and();    public N endBuildConfigStatusObject();
}
    public interface ParameterObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ParameterFluent<WatchEventFluent.ParameterObjectNested<N>>{

        
    public N and();    public N endParameterObject();
}
    public interface SecretVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretVolumeSourceFluent<WatchEventFluent.SecretVolumeSourceObjectNested<N>>{

        
    public N and();    public N endSecretVolumeSourceObject();
}
    public interface PodObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<WatchEventFluent.PodObjectNested<N>>{

        
    public N and();    public N endPodObject();
}
    public interface ClientIPConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClientIPConfigFluent<WatchEventFluent.ClientIPConfigObjectNested<N>>{

        
    public N and();    public N endClientIPConfigObject();
}
    public interface ContextObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContextFluent<WatchEventFluent.ContextObjectNested<N>>{

        
    public N and();    public N endContextObject();
}
    public interface NodeAffinityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeAffinityFluent<WatchEventFluent.NodeAffinityObjectNested<N>>{

        
    public N and();    public N endNodeAffinityObject();
}
    public interface ConfigMapObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<WatchEventFluent.ConfigMapObjectNested<N>>{

        
    public N and();    public N endConfigMapObject();
}
    public interface CustomResourceDefinitionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<WatchEventFluent.CustomResourceDefinitionObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionObject();
}
    public interface FCVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FCVolumeSourceFluent<WatchEventFluent.FCVolumeSourceObjectNested<N>>{

        
    public N and();    public N endFCVolumeSourceObject();
}
    public interface CustomResourceDefinitionStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionStatusFluent<WatchEventFluent.CustomResourceDefinitionStatusObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionStatusObject();
}
    public interface JobListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobListFluent<WatchEventFluent.JobListObjectNested<N>>{

        
    public N and();    public N endJobListObject();
}
    public interface OAuthAuthorizeTokenListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenListFluent<WatchEventFluent.OAuthAuthorizeTokenListObjectNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenListObject();
}
    public interface JSONSchemaPropsOrStringArrayObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrStringArrayFluent<WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<N>>{

        
    public N and();    public N endJSONSchemaPropsOrStringArrayObject();
}
    public interface CustomDeploymentStrategyParamsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomDeploymentStrategyParamsFluent<WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<N>>{

        
    public N and();    public N endCustomDeploymentStrategyParamsObject();
}
    public interface ImageImportSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageImportSpecFluent<WatchEventFluent.ImageImportSpecObjectNested<N>>{

        
    public N and();    public N endImageImportSpecObject();
}
    public interface PodSecurityContextObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityContextFluent<WatchEventFluent.PodSecurityContextObjectNested<N>>{

        
    public N and();    public N endPodSecurityContextObject();
}
    public interface DownwardAPIProjectionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DownwardAPIProjectionFluent<WatchEventFluent.DownwardAPIProjectionObjectNested<N>>{

        
    public N and();    public N endDownwardAPIProjectionObject();
}
    public interface PodAffinityTermObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAffinityTermFluent<WatchEventFluent.PodAffinityTermObjectNested<N>>{

        
    public N and();    public N endPodAffinityTermObject();
}
    public interface ModelIDRangeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.IDRangeFluent<WatchEventFluent.ModelIDRangeObjectNested<N>>{

        
    public N and();    public N endModelIDRangeObject();
}
    public interface BuildConfigSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigSpecFluent<WatchEventFluent.BuildConfigSpecObjectNested<N>>{

        
    public N and();    public N endBuildConfigSpecObject();
}
    public interface NonResourceAttributesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NonResourceAttributesFluent<WatchEventFluent.NonResourceAttributesObjectNested<N>>{

        
    public N and();    public N endNonResourceAttributesObject();
}
    public interface PersistentVolumeClaimSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimVolumeSourceFluent<WatchEventFluent.PersistentVolumeClaimSourceObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimSourceObject();
}
    public interface SubjectAccessReviewStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewStatusFluent<WatchEventFluent.SubjectAccessReviewStatusObjectNested<N>>{

        
    public N and();    public N endSubjectAccessReviewStatusObject();
}
    public interface WebHookTriggerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebHookTriggerFluent<WatchEventFluent.WebHookTriggerObjectNested<N>>{

        
    public N and();    public N endWebHookTriggerObject();
}
    public interface ServiceAccountReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountReferenceFluent<WatchEventFluent.ServiceAccountReferenceObjectNested<N>>{

        
    public N and();    public N endServiceAccountReferenceObject();
}
    public interface BuildObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<WatchEventFluent.BuildObjectNested<N>>{

        
    public N and();    public N endBuildObject();
}
    public interface CustomResourceDefinitionListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionListFluent<WatchEventFluent.CustomResourceDefinitionListObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionListObject();
}
    public interface AllowedFlexVolumeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AllowedFlexVolumeFluent<WatchEventFluent.AllowedFlexVolumeObjectNested<N>>{

        
    public N and();    public N endAllowedFlexVolumeObject();
}
    public interface ResourceMetricStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceMetricStatusFluent<WatchEventFluent.ResourceMetricStatusObjectNested<N>>{

        
    public N and();    public N endResourceMetricStatusObject();
}
    public interface TagImportPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagImportPolicyFluent<WatchEventFluent.TagImportPolicyObjectNested<N>>{

        
    public N and();    public N endTagImportPolicyObject();
}
    public interface ImageStreamTagObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<WatchEventFluent.ImageStreamTagObjectNested<N>>{

        
    public N and();    public N endImageStreamTagObject();
}
    public interface KeyToPathObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,KeyToPathFluent<WatchEventFluent.KeyToPathObjectNested<N>>{

        
    public N and();    public N endKeyToPathObject();
}
    public interface StatefulSetConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetConditionFluent<WatchEventFluent.StatefulSetConditionObjectNested<N>>{

        
    public N and();    public N endStatefulSetConditionObject();
}
    public interface RoutePortObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoutePortFluent<WatchEventFluent.RoutePortObjectNested<N>>{

        
    public N and();    public N endRoutePortObject();
}
    public interface JSONSchemaPropsOrBoolObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrBoolFluent<WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<N>>{

        
    public N and();    public N endJSONSchemaPropsOrBoolObject();
}
    public interface FlexPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlexPersistentVolumeSourceFluent<WatchEventFluent.FlexPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endFlexPersistentVolumeSourceObject();
}
    public interface GroupObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<WatchEventFluent.GroupObjectNested<N>>{

        
    public N and();    public N endGroupObject();
}
    public interface BuildTriggerCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildTriggerCauseFluent<WatchEventFluent.BuildTriggerCauseObjectNested<N>>{

        
    public N and();    public N endBuildTriggerCauseObject();
}
    public interface NamespaceListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceListFluent<WatchEventFluent.NamespaceListObjectNested<N>>{

        
    public N and();    public N endNamespaceListObject();
}
    public interface PodDisruptionBudgetStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetStatusFluent<WatchEventFluent.PodDisruptionBudgetStatusObjectNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetStatusObject();
}
    public interface PodDNSConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDNSConfigFluent<WatchEventFluent.PodDNSConfigObjectNested<N>>{

        
    public N and();    public N endPodDNSConfigObject();
}
    public interface NodeListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeListFluent<WatchEventFluent.NodeListObjectNested<N>>{

        
    public N and();    public N endNodeListObject();
}
    public interface HorizontalPodAutoscalerSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerSpecFluent<WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerSpecObject();
}
    public interface ImageSignatureObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<WatchEventFluent.ImageSignatureObjectNested<N>>{

        
    public N and();    public N endImageSignatureObject();
}
    public interface EnvVarSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarSourceFluent<WatchEventFluent.EnvVarSourceObjectNested<N>>{

        
    public N and();    public N endEnvVarSourceObject();
}
    public interface VolumeProjectionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeProjectionFluent<WatchEventFluent.VolumeProjectionObjectNested<N>>{

        
    public N and();    public N endVolumeProjectionObject();
}
    public interface ResourceQuotaObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<WatchEventFluent.ResourceQuotaObjectNested<N>>{

        
    public N and();    public N endResourceQuotaObject();
}
    public interface DeploymentStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentStrategyFluent<WatchEventFluent.DeploymentStrategyObjectNested<N>>{

        
    public N and();    public N endDeploymentStrategyObject();
}
    public interface OAuthAccessTokenListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenListFluent<WatchEventFluent.OAuthAccessTokenListObjectNested<N>>{

        
    public N and();    public N endOAuthAccessTokenListObject();
}
    public interface NodeSelectorTermObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorTermFluent<WatchEventFluent.NodeSelectorTermObjectNested<N>>{

        
    public N and();    public N endNodeSelectorTermObject();
}
    public interface ScaleIOPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleIOPersistentVolumeSourceFluent<WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endScaleIOPersistentVolumeSourceObject();
}
    public interface ModelSupplementalGroupsStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endModelSupplementalGroupsStrategyOptionsObject();
}
    public interface WeightedPodAffinityTermObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WeightedPodAffinityTermFluent<WatchEventFluent.WeightedPodAffinityTermObjectNested<N>>{

        
    public N and();    public N endWeightedPodAffinityTermObject();
}
    public interface RollingUpdateStatefulSetStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingUpdateStatefulSetStrategyFluent<WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<N>>{

        
    public N and();    public N endRollingUpdateStatefulSetStrategyObject();
}
    public interface BuildRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildRequestFluent<WatchEventFluent.BuildRequestObjectNested<N>>{

        
    public N and();    public N endBuildRequestObject();
}
    public interface ApiextensionsServiceReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceFluent<WatchEventFluent.ApiextensionsServiceReferenceObjectNested<N>>{

        
    public N and();    public N endApiextensionsServiceReferenceObject();
}
    public interface NodeSystemInfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSystemInfoFluent<WatchEventFluent.NodeSystemInfoObjectNested<N>>{

        
    public N and();    public N endNodeSystemInfoObject();
}
    public interface RouteListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteListFluent<WatchEventFluent.RouteListObjectNested<N>>{

        
    public N and();    public N endRouteListObject();
}
    public interface AuthProviderConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AuthProviderConfigFluent<WatchEventFluent.AuthProviderConfigObjectNested<N>>{

        
    public N and();    public N endAuthProviderConfigObject();
}
    public interface VolumeDeviceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeDeviceFluent<WatchEventFluent.VolumeDeviceObjectNested<N>>{

        
    public N and();    public N endVolumeDeviceObject();
}
    public interface DaemonSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<WatchEventFluent.DaemonSetObjectNested<N>>{

        
    public N and();    public N endDaemonSetObject();
}
    public interface TokenReviewSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewSpecFluent<WatchEventFluent.TokenReviewSpecObjectNested<N>>{

        
    public N and();    public N endTokenReviewSpecObject();
}
    public interface DeploymentDetailsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentDetailsFluent<WatchEventFluent.DeploymentDetailsObjectNested<N>>{

        
    public N and();    public N endDeploymentDetailsObject();
}
    public interface VolumeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeFluent<WatchEventFluent.VolumeObjectNested<N>>{

        
    public N and();    public N endVolumeObject();
}
    public interface KubernetesRunAsUserStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,KubernetesRunAsUserStrategyOptionsFluent<WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endKubernetesRunAsUserStrategyOptionsObject();
}
    public interface NFSVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NFSVolumeSourceFluent<WatchEventFluent.NFSVolumeSourceObjectNested<N>>{

        
    public N and();    public N endNFSVolumeSourceObject();
}
    public interface DeploymentConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConditionFluent<WatchEventFluent.DeploymentConditionObjectNested<N>>{

        
    public N and();    public N endDeploymentConditionObject();
}
    public interface ClusterObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterFluent<WatchEventFluent.ClusterObjectNested<N>>{

        
    public N and();    public N endClusterObject();
}
    public interface ImageStreamObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<WatchEventFluent.ImageStreamObjectNested<N>>{

        
    public N and();    public N endImageStreamObject();
}
    public interface StorageOSVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageOSVolumeSourceFluent<WatchEventFluent.StorageOSVolumeSourceObjectNested<N>>{

        
    public N and();    public N endStorageOSVolumeSourceObject();
}
    public interface BuildListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildListFluent<WatchEventFluent.BuildListObjectNested<N>>{

        
    public N and();    public N endBuildListObject();
}
    public interface TemplateListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateListFluent<WatchEventFluent.TemplateListObjectNested<N>>{

        
    public N and();    public N endTemplateListObject();
}
    public interface KubernetesListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,KubernetesListFluent<WatchEventFluent.KubernetesListObjectNested<N>>{

        
    public N and();    public N endKubernetesListObject();
}
    public interface CustomResourceDefinitionVersionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionVersionFluent<WatchEventFluent.CustomResourceDefinitionVersionObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionVersionObject();
}
    public interface ProjectSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectSpecFluent<WatchEventFluent.ProjectSpecObjectNested<N>>{

        
    public N and();    public N endProjectSpecObject();
}
    public interface HTTPHeaderObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPHeaderFluent<WatchEventFluent.HTTPHeaderObjectNested<N>>{

        
    public N and();    public N endHTTPHeaderObject();
}
    public interface CapabilitiesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CapabilitiesFluent<WatchEventFluent.CapabilitiesObjectNested<N>>{

        
    public N and();    public N endCapabilitiesObject();
}
    public interface ObjectReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<WatchEventFluent.ObjectReferenceObjectNested<N>>{

        
    public N and();    public N endObjectReferenceObject();
}
    public interface WatchEventObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WatchEventFluent<WatchEventFluent.WatchEventObjectNested<N>>{

        
    public N and();    public N endWatchEventObject();
}
    public interface SignatureIssuerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SignatureIssuerFluent<WatchEventFluent.SignatureIssuerObjectNested<N>>{

        
    public N and();    public N endSignatureIssuerObject();
}
    public interface ImageLayerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLayerFluent<WatchEventFluent.ImageLayerObjectNested<N>>{

        
    public N and();    public N endImageLayerObject();
}
    public interface SecretProjectionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretProjectionFluent<WatchEventFluent.SecretProjectionObjectNested<N>>{

        
    public N and();    public N endSecretProjectionObject();
}
    public interface ApiextensionsWebhookClientConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigFluent<WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<N>>{

        
    public N and();    public N endApiextensionsWebhookClientConfigObject();
}
    public interface GlusterfsVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GlusterfsVolumeSourceFluent<WatchEventFluent.GlusterfsVolumeSourceObjectNested<N>>{

        
    public N and();    public N endGlusterfsVolumeSourceObject();
}
    public interface NamespaceStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceStatusFluent<WatchEventFluent.NamespaceStatusObjectNested<N>>{

        
    public N and();    public N endNamespaceStatusObject();
}
    public interface OpenshiftRoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<WatchEventFluent.OpenshiftRoleObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleObject();
}
    public interface CronJobSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobSpecFluent<WatchEventFluent.CronJobSpecObjectNested<N>>{

        
    public N and();    public N endCronJobSpecObject();
}
    public interface CustomResourceColumnDefinitionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceColumnDefinitionFluent<WatchEventFluent.CustomResourceColumnDefinitionObjectNested<N>>{

        
    public N and();    public N endCustomResourceColumnDefinitionObject();
}
    public interface ImageStreamSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamSpecFluent<WatchEventFluent.ImageStreamSpecObjectNested<N>>{

        
    public N and();    public N endImageStreamSpecObject();
}
    public interface SecretEnvSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretEnvSourceFluent<WatchEventFluent.SecretEnvSourceObjectNested<N>>{

        
    public N and();    public N endSecretEnvSourceObject();
}
    public interface OAuthClientObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<WatchEventFluent.OAuthClientObjectNested<N>>{

        
    public N and();    public N endOAuthClientObject();
}
    public interface IdentityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<WatchEventFluent.IdentityObjectNested<N>>{

        
    public N and();    public N endIdentityObject();
}
    public interface AWSElasticBlockStoreVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AWSElasticBlockStoreVolumeSourceFluent<WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<N>>{

        
    public N and();    public N endAWSElasticBlockStoreVolumeSourceObject();
}
    public interface MetricStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MetricStatusFluent<WatchEventFluent.MetricStatusObjectNested<N>>{

        
    public N and();    public N endMetricStatusObject();
}
    public interface GenericWebHookCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GenericWebHookCauseFluent<WatchEventFluent.GenericWebHookCauseObjectNested<N>>{

        
    public N and();    public N endGenericWebHookCauseObject();
}
    public interface ServiceAccountRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountRestrictionFluent<WatchEventFluent.ServiceAccountRestrictionObjectNested<N>>{

        
    public N and();    public N endServiceAccountRestrictionObject();
}
    public interface LimitRangeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<WatchEventFluent.LimitRangeObjectNested<N>>{

        
    public N and();    public N endLimitRangeObject();
}
    public interface SecretLocalReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretLocalReferenceFluent<WatchEventFluent.SecretLocalReferenceObjectNested<N>>{

        
    public N and();    public N endSecretLocalReferenceObject();
}
    public interface IDRangeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IDRangeFluent<WatchEventFluent.IDRangeObjectNested<N>>{

        
    public N and();    public N endIDRangeObject();
}
    public interface UserRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserRestrictionFluent<WatchEventFluent.UserRestrictionObjectNested<N>>{

        
    public N and();    public N endUserRestrictionObject();
}
    public interface CSIPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CSIPersistentVolumeSourceFluent<WatchEventFluent.CSIPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endCSIPersistentVolumeSourceObject();
}
    public interface ImageStreamImportObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportFluent<WatchEventFluent.ImageStreamImportObjectNested<N>>{

        
    public N and();    public N endImageStreamImportObject();
}
    public interface ReplicaSetSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetSpecFluent<WatchEventFluent.ReplicaSetSpecObjectNested<N>>{

        
    public N and();    public N endReplicaSetSpecObject();
}
    public interface ResourceRequirementsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceRequirementsFluent<WatchEventFluent.ResourceRequirementsObjectNested<N>>{

        
    public N and();    public N endResourceRequirementsObject();
}
    public interface ExternalMetricSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExternalMetricSourceFluent<WatchEventFluent.ExternalMetricSourceObjectNested<N>>{

        
    public N and();    public N endExternalMetricSourceObject();
}
    public interface GitHubWebHookCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitHubWebHookCauseFluent<WatchEventFluent.GitHubWebHookCauseObjectNested<N>>{

        
    public N and();    public N endGitHubWebHookCauseObject();
}
    public interface PersistentVolumeClaimListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimListFluent<WatchEventFluent.PersistentVolumeClaimListObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimListObject();
}
    public interface OAuthClientListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientListFluent<WatchEventFluent.OAuthClientListObjectNested<N>>{

        
    public N and();    public N endOAuthClientListObject();
}
    public interface OpenshiftRoleBindingListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingListFluent<WatchEventFluent.OpenshiftRoleBindingListObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingListObject();
}
    public interface ResourceMetricSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceMetricSourceFluent<WatchEventFluent.ResourceMetricSourceObjectNested<N>>{

        
    public N and();    public N endResourceMetricSourceObject();
}
    public interface ReplicationControllerStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerStatusFluent<WatchEventFluent.ReplicationControllerStatusObjectNested<N>>{

        
    public N and();    public N endReplicationControllerStatusObject();
}
    public interface IngressListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressListFluent<WatchEventFluent.IngressListObjectNested<N>>{

        
    public N and();    public N endIngressListObject();
}
    public interface MicroTimeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MicroTimeFluent<WatchEventFluent.MicroTimeObjectNested<N>>{

        
    public N and();    public N endMicroTimeObject();
}
    public interface ValidatingWebhookConfigurationListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationListFluent<WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<N>>{

        
    public N and();    public N endValidatingWebhookConfigurationListObject();
}
    public interface PolicyRuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PolicyRuleFluent<WatchEventFluent.PolicyRuleObjectNested<N>>{

        
    public N and();    public N endPolicyRuleObject();
}
    public interface LifecycleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleFluent<WatchEventFluent.LifecycleObjectNested<N>>{

        
    public N and();    public N endLifecycleObject();
}
    public interface RepositoryImportSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RepositoryImportSpecFluent<WatchEventFluent.RepositoryImportSpecObjectNested<N>>{

        
    public N and();    public N endRepositoryImportSpecObject();
}
    public interface PortworxVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PortworxVolumeSourceFluent<WatchEventFluent.PortworxVolumeSourceObjectNested<N>>{

        
    public N and();    public N endPortworxVolumeSourceObject();
}
    public interface EventSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventSourceFluent<WatchEventFluent.EventSourceObjectNested<N>>{

        
    public N and();    public N endEventSourceObject();
}
    public interface InitializerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InitializerFluent<WatchEventFluent.InitializerObjectNested<N>>{

        
    public N and();    public N endInitializerObject();
}
    public interface ImageStreamImportStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportStatusFluent<WatchEventFluent.ImageStreamImportStatusObjectNested<N>>{

        
    public N and();    public N endImageStreamImportStatusObject();
}
    public interface HTTPIngressRuleValueObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPIngressRuleValueFluent<WatchEventFluent.HTTPIngressRuleValueObjectNested<N>>{

        
    public N and();    public N endHTTPIngressRuleValueObject();
}
    public interface OpenshiftRoleBindingRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionFluent<WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionObject();
}
    public interface ComponentConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentConditionFluent<WatchEventFluent.ComponentConditionObjectNested<N>>{

        
    public N and();    public N endComponentConditionObject();
}
    public interface ReplicationControllerSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerSpecFluent<WatchEventFluent.ReplicationControllerSpecObjectNested<N>>{

        
    public N and();    public N endReplicationControllerSpecObject();
}
    public interface WebhookClientConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebhookClientConfigFluent<WatchEventFluent.WebhookClientConfigObjectNested<N>>{

        
    public N and();    public N endWebhookClientConfigObject();
}
    public interface DeploymentTriggerImageChangeParamsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentTriggerImageChangeParamsFluent<WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<N>>{

        
    public N and();    public N endDeploymentTriggerImageChangeParamsObject();
}
    public interface RoleBindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<WatchEventFluent.RoleBindingObjectNested<N>>{

        
    public N and();    public N endRoleBindingObject();
}
    public interface PodPresetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<WatchEventFluent.PodPresetObjectNested<N>>{

        
    public N and();    public N endPodPresetObject();
}
    public interface RollingUpdateDeploymentObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingUpdateDeploymentFluent<WatchEventFluent.RollingUpdateDeploymentObjectNested<N>>{

        
    public N and();    public N endRollingUpdateDeploymentObject();
}
    public interface EmptyDirVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EmptyDirVolumeSourceFluent<WatchEventFluent.EmptyDirVolumeSourceObjectNested<N>>{

        
    public N and();    public N endEmptyDirVolumeSourceObject();
}
    public interface TagImageHookObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagImageHookFluent<WatchEventFluent.TagImageHookObjectNested<N>>{

        
    public N and();    public N endTagImageHookObject();
}
    public interface RouteTargetReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteTargetReferenceFluent<WatchEventFluent.RouteTargetReferenceObjectNested<N>>{

        
    public N and();    public N endRouteTargetReferenceObject();
}
    public interface AzureDiskVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureDiskVolumeSourceFluent<WatchEventFluent.AzureDiskVolumeSourceObjectNested<N>>{

        
    public N and();    public N endAzureDiskVolumeSourceObject();
}
    public interface ProjectObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<WatchEventFluent.ProjectObjectNested<N>>{

        
    public N and();    public N endProjectObject();
}
    public interface InfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InfoFluent<WatchEventFluent.InfoObjectNested<N>>{

        
    public N and();    public N endInfoObject();
}
    public interface ServiceStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceStatusFluent<WatchEventFluent.ServiceStatusObjectNested<N>>{

        
    public N and();    public N endServiceStatusObject();
}
    public interface TaintObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TaintFluent<WatchEventFluent.TaintObjectNested<N>>{

        
    public N and();    public N endTaintObject();
}
    public interface OpenshiftRoleBindingRestrictionSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionSpecFluent<WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleBindingRestrictionSpecObject();
}
    public interface AllowedHostPathObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AllowedHostPathFluent<WatchEventFluent.AllowedHostPathObjectNested<N>>{

        
    public N and();    public N endAllowedHostPathObject();
}
    public interface DeploymentConfigListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigListFluent<WatchEventFluent.DeploymentConfigListObjectNested<N>>{

        
    public N and();    public N endDeploymentConfigListObject();
}
    public interface BuildConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<WatchEventFluent.BuildConfigObjectNested<N>>{

        
    public N and();    public N endBuildConfigObject();
}
    public interface CustomResourceConversionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceConversionFluent<WatchEventFluent.CustomResourceConversionObjectNested<N>>{

        
    public N and();    public N endCustomResourceConversionObject();
}
    public interface CustomResourceDefinitionNamesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionNamesFluent<WatchEventFluent.CustomResourceDefinitionNamesObjectNested<N>>{

        
    public N and();    public N endCustomResourceDefinitionNamesObject();
}
    public interface ImageImportStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageImportStatusFluent<WatchEventFluent.ImageImportStatusObjectNested<N>>{

        
    public N and();    public N endImageImportStatusObject();
}
    public interface IngressTLSObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressTLSFluent<WatchEventFluent.IngressTLSObjectNested<N>>{

        
    public N and();    public N endIngressTLSObject();
}
    public interface CustomResourceValidationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceValidationFluent<WatchEventFluent.CustomResourceValidationObjectNested<N>>{

        
    public N and();    public N endCustomResourceValidationObject();
}
    public interface PodDisruptionBudgetListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetListFluent<WatchEventFluent.PodDisruptionBudgetListObjectNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetListObject();
}
    public interface DeploymentConfigStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigStatusFluent<WatchEventFluent.DeploymentConfigStatusObjectNested<N>>{

        
    public N and();    public N endDeploymentConfigStatusObject();
}
    public interface GlusterfsPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GlusterfsPersistentVolumeSourceFluent<WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endGlusterfsPersistentVolumeSourceObject();
}
    public interface ClusterRoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<WatchEventFluent.ClusterRoleObjectNested<N>>{

        
    public N and();    public N endClusterRoleObject();
}
    public interface ClusterRoleBindingListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingListFluent<WatchEventFluent.ClusterRoleBindingListObjectNested<N>>{

        
    public N and();    public N endClusterRoleBindingListObject();
}
    public interface TokenReviewStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewStatusFluent<WatchEventFluent.TokenReviewStatusObjectNested<N>>{

        
    public N and();    public N endTokenReviewStatusObject();
}
    public interface TagEventObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagEventFluent<WatchEventFluent.TagEventObjectNested<N>>{

        
    public N and();    public N endTagEventObject();
}
    public interface ImageStreamTagListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagListFluent<WatchEventFluent.ImageStreamTagListObjectNested<N>>{

        
    public N and();    public N endImageStreamTagListObject();
}
    public interface CustomResourceSubresourceStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourceStatusFluent<WatchEventFluent.CustomResourceSubresourceStatusObjectNested<N>>{

        
    public N and();    public N endCustomResourceSubresourceStatusObject();
}
    public interface ISCSIPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ISCSIPersistentVolumeSourceFluent<WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endISCSIPersistentVolumeSourceObject();
}
    public interface DownwardAPIVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DownwardAPIVolumeSourceFluent<WatchEventFluent.DownwardAPIVolumeSourceObjectNested<N>>{

        
    public N and();    public N endDownwardAPIVolumeSourceObject();
}
    public interface ListMetaObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<WatchEventFluent.ListMetaObjectNested<N>>{

        
    public N and();    public N endListMetaObject();
}
    public interface RootPathsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RootPathsFluent<WatchEventFluent.RootPathsObjectNested<N>>{

        
    public N and();    public N endRootPathsObject();
}
    public interface SecretReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretReferenceFluent<WatchEventFluent.SecretReferenceObjectNested<N>>{

        
    public N and();    public N endSecretReferenceObject();
}
    public interface SourceStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceStrategyOptionsFluent<WatchEventFluent.SourceStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endSourceStrategyOptionsObject();
}
    public interface ISCSIVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ISCSIVolumeSourceFluent<WatchEventFluent.ISCSIVolumeSourceObjectNested<N>>{

        
    public N and();    public N endISCSIVolumeSourceObject();
}
    public interface SecretKeySelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretKeySelectorFluent<WatchEventFluent.SecretKeySelectorObjectNested<N>>{

        
    public N and();    public N endSecretKeySelectorObject();
}
    public interface OAuthAuthorizeTokenObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<WatchEventFluent.OAuthAuthorizeTokenObjectNested<N>>{

        
    public N and();    public N endOAuthAuthorizeTokenObject();
}
    public interface QuobyteVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuobyteVolumeSourceFluent<WatchEventFluent.QuobyteVolumeSourceObjectNested<N>>{

        
    public N and();    public N endQuobyteVolumeSourceObject();
}
    public interface DockerBuildStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DockerBuildStrategyFluent<WatchEventFluent.DockerBuildStrategyObjectNested<N>>{

        
    public N and();    public N endDockerBuildStrategyObject();
}
    public interface SignatureConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SignatureConditionFluent<WatchEventFluent.SignatureConditionObjectNested<N>>{

        
    public N and();    public N endSignatureConditionObject();
}
    public interface JobSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobSpecFluent<WatchEventFluent.JobSpecObjectNested<N>>{

        
    public N and();    public N endJobSpecObject();
}
    public interface ResourceQuotaStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaStatusFluent<WatchEventFluent.ResourceQuotaStatusObjectNested<N>>{

        
    public N and();    public N endResourceQuotaStatusObject();
}
    public interface ExternalMetricStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExternalMetricStatusFluent<WatchEventFluent.ExternalMetricStatusObjectNested<N>>{

        
    public N and();    public N endExternalMetricStatusObject();
}
    public interface ScopedResourceSelectorRequirementObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScopedResourceSelectorRequirementFluent<WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<N>>{

        
    public N and();    public N endScopedResourceSelectorRequirementObject();
}
    public interface DeploymentCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentCauseFluent<WatchEventFluent.DeploymentCauseObjectNested<N>>{

        
    public N and();    public N endDeploymentCauseObject();
}
    public interface RepositoryImportStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RepositoryImportStatusFluent<WatchEventFluent.RepositoryImportStatusObjectNested<N>>{

        
    public N and();    public N endRepositoryImportStatusObject();
}
    public interface GroupListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupListFluent<WatchEventFluent.GroupListObjectNested<N>>{

        
    public N and();    public N endGroupListObject();
}
    public interface ProjectedVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectedVolumeSourceFluent<WatchEventFluent.ProjectedVolumeSourceObjectNested<N>>{

        
    public N and();    public N endProjectedVolumeSourceObject();
}
    public interface LifecycleHookObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleHookFluent<WatchEventFluent.LifecycleHookObjectNested<N>>{

        
    public N and();    public N endLifecycleHookObject();
}
    public interface HandlerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HandlerFluent<WatchEventFluent.HandlerObjectNested<N>>{

        
    public N and();    public N endHandlerObject();
}
    public interface ServiceAccountTokenProjectionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountTokenProjectionFluent<WatchEventFluent.ServiceAccountTokenProjectionObjectNested<N>>{

        
    public N and();    public N endServiceAccountTokenProjectionObject();
}
    public interface ContainerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerFluent<WatchEventFluent.ContainerObjectNested<N>>{

        
    public N and();    public N endContainerObject();
}
    public interface TypedLocalObjectReferenceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TypedLocalObjectReferenceFluent<WatchEventFluent.TypedLocalObjectReferenceNested<N>>{

        
    public N and();    public N endTypedLocalObjectReference();
}
    public interface SupplementalGroupsStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SupplementalGroupsStrategyOptionsFluent<WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endSupplementalGroupsStrategyOptionsObject();
}
    public interface CronJobListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobListFluent<WatchEventFluent.CronJobListObjectNested<N>>{

        
    public N and();    public N endCronJobListObject();
}
    public interface RollbackConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollbackConfigFluent<WatchEventFluent.RollbackConfigObjectNested<N>>{

        
    public N and();    public N endRollbackConfigObject();
}
    public interface RouteStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteStatusFluent<WatchEventFluent.RouteStatusObjectNested<N>>{

        
    public N and();    public N endRouteStatusObject();
}
    public interface PodConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodConditionFluent<WatchEventFluent.PodConditionObjectNested<N>>{

        
    public N and();    public N endPodConditionObject();
}
    public interface DaemonSetConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetConditionFluent<WatchEventFluent.DaemonSetConditionObjectNested<N>>{

        
    public N and();    public N endDaemonSetConditionObject();
}
    public interface DeploymentRollbackObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentRollbackFluent<WatchEventFluent.DeploymentRollbackObjectNested<N>>{

        
    public N and();    public N endDeploymentRollbackObject();
}
    public interface ExecActionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecActionFluent<WatchEventFluent.ExecActionObjectNested<N>>{

        
    public N and();    public N endExecActionObject();
}
    public interface NamedTagEventListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedTagEventListFluent<WatchEventFluent.NamedTagEventListObjectNested<N>>{

        
    public N and();    public N endNamedTagEventListObject();
}
    public interface TolerationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TolerationFluent<WatchEventFluent.TolerationObjectNested<N>>{

        
    public N and();    public N endTolerationObject();
}
    public interface NodeSelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorFluent<WatchEventFluent.NodeSelectorObjectNested<N>>{

        
    public N and();    public N endNodeSelectorObject();
}
    public interface WebhookObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebhookFluent<WatchEventFluent.WebhookObjectNested<N>>{

        
    public N and();    public N endWebhookObject();
}
    public interface RouteSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteSpecFluent<WatchEventFluent.RouteSpecObjectNested<N>>{

        
    public N and();    public N endRouteSpecObject();
}
    public interface CephFSPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CephFSPersistentVolumeSourceFluent<WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endCephFSPersistentVolumeSourceObject();
}
    public interface PersistentVolumeClaimConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimConditionFluent<WatchEventFluent.PersistentVolumeClaimConditionObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimConditionObject();
}
    public interface PersistentVolumeListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeListFluent<WatchEventFluent.PersistentVolumeListObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeListObject();
}
    public interface ProjectRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectRequestFluent<WatchEventFluent.ProjectRequestObjectNested<N>>{

        
    public N and();    public N endProjectRequestObject();
}
    public interface PriorityClassObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<WatchEventFluent.PriorityClassObjectNested<N>>{

        
    public N and();    public N endPriorityClassObject();
}
    public interface TemplateObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<WatchEventFluent.TemplateObjectNested<N>>{

        
    public N and();    public N endTemplateObject();
}
    public interface PodDNSConfigOptionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDNSConfigOptionFluent<WatchEventFluent.PodDNSConfigOptionObjectNested<N>>{

        
    public N and();    public N endPodDNSConfigOptionObject();
}
    public interface GCEPersistentDiskVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GCEPersistentDiskVolumeSourceFluent<WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<N>>{

        
    public N and();    public N endGCEPersistentDiskVolumeSourceObject();
}
    public interface OAuthClientAuthorizationObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<WatchEventFluent.OAuthClientAuthorizationObjectNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationObject();
}
    public interface NetworkPolicyIngressRuleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyIngressRuleFluent<WatchEventFluent.NetworkPolicyIngressRuleObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyIngressRuleObject();
}
    public interface JobTemplateSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobTemplateSpecFluent<WatchEventFluent.JobTemplateSpecObjectNested<N>>{

        
    public N and();    public N endJobTemplateSpecObject();
}
    public interface ImageChangeCauseObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageChangeCauseFluent<WatchEventFluent.ImageChangeCauseObjectNested<N>>{

        
    public N and();    public N endImageChangeCauseObject();
}
    public interface EventListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventListFluent<WatchEventFluent.EventListObjectNested<N>>{

        
    public N and();    public N endEventListObject();
}
    public interface PodReadinessGateObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodReadinessGateFluent<WatchEventFluent.PodReadinessGateObjectNested<N>>{

        
    public N and();    public N endPodReadinessGateObject();
}
    public interface DeploymentObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<WatchEventFluent.DeploymentObjectNested<N>>{

        
    public N and();    public N endDeploymentObject();
}
    public interface ContainerStateWaitingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateWaitingFluent<WatchEventFluent.ContainerStateWaitingObjectNested<N>>{

        
    public N and();    public N endContainerStateWaitingObject();
}
    public interface TagEventConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagEventConditionFluent<WatchEventFluent.TagEventConditionObjectNested<N>>{

        
    public N and();    public N endTagEventConditionObject();
}
    public interface OpenshiftRoleListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleListFluent<WatchEventFluent.OpenshiftRoleListObjectNested<N>>{

        
    public N and();    public N endOpenshiftRoleListObject();
}
    public interface NetNamespaceListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceListFluent<WatchEventFluent.NetNamespaceListObjectNested<N>>{

        
    public N and();    public N endNetNamespaceListObject();
}
    public interface BinaryBuildSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BinaryBuildSourceFluent<WatchEventFluent.BinaryBuildSourceObjectNested<N>>{

        
    public N and();    public N endBinaryBuildSourceObject();
}
    public interface OAuthClientAuthorizationListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationListFluent<WatchEventFluent.OAuthClientAuthorizationListObjectNested<N>>{

        
    public N and();    public N endOAuthClientAuthorizationListObject();
}
    public interface IngressSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressSpecFluent<WatchEventFluent.IngressSpecObjectNested<N>>{

        
    public N and();    public N endIngressSpecObject();
}
    public interface ModelLocalSubjectAccessReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluent<WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<N>>{

        
    public N and();    public N endModelLocalSubjectAccessReviewObject();
}
    public interface AdmissionReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AdmissionReviewFluent<WatchEventFluent.AdmissionReviewObjectNested<N>>{

        
    public N and();    public N endAdmissionReviewObject();
}
    public interface RollingDeploymentStrategyParamsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingDeploymentStrategyParamsFluent<WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<N>>{

        
    public N and();    public N endRollingDeploymentStrategyParamsObject();
}
    public interface DownwardAPIVolumeFileObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DownwardAPIVolumeFileFluent<WatchEventFluent.DownwardAPIVolumeFileObjectNested<N>>{

        
    public N and();    public N endDownwardAPIVolumeFileObject();
}
    public interface ImageLabelObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLabelFluent<WatchEventFluent.ImageLabelObjectNested<N>>{

        
    public N and();    public N endImageLabelObject();
}
    public interface PodTemplateObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<WatchEventFluent.PodTemplateObjectNested<N>>{

        
    public N and();    public N endPodTemplateObject();
}
    public interface TCPSocketActionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TCPSocketActionFluent<WatchEventFluent.TCPSocketActionObjectNested<N>>{

        
    public N and();    public N endTCPSocketActionObject();
}
    public interface DaemonSetListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetListFluent<WatchEventFluent.DaemonSetListObjectNested<N>>{

        
    public N and();    public N endDaemonSetListObject();
}
    public interface EventObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<WatchEventFluent.EventObjectNested<N>>{

        
    public N and();    public N endEventObject();
}
    public interface PreferencesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PreferencesFluent<WatchEventFluent.PreferencesObjectNested<N>>{

        
    public N and();    public N endPreferencesObject();
}
    public interface IngressObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<WatchEventFluent.IngressObjectNested<N>>{

        
    public N and();    public N endIngressObject();
}
    public interface DeploymentConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<WatchEventFluent.DeploymentConfigObjectNested<N>>{

        
    public N and();    public N endDeploymentConfigObject();
}
    public interface ObjectFieldSelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectFieldSelectorFluent<WatchEventFluent.ObjectFieldSelectorObjectNested<N>>{

        
    public N and();    public N endObjectFieldSelectorObject();
}
    public interface OAuthAccessTokenObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<WatchEventFluent.OAuthAccessTokenObjectNested<N>>{

        
    public N and();    public N endOAuthAccessTokenObject();
}
    public interface PersistentVolumeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<WatchEventFluent.PersistentVolumeObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeObject();
}
    public interface CinderVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CinderVolumeSourceFluent<WatchEventFluent.CinderVolumeSourceObjectNested<N>>{

        
    public N and();    public N endCinderVolumeSourceObject();
}
    public interface ObjectMetaObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<WatchEventFluent.ObjectMetaObjectNested<N>>{

        
    public N and();    public N endObjectMetaObject();
}
    public interface PersistentVolumeClaimObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<WatchEventFluent.PersistentVolumeClaimObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimObject();
}
    public interface JSONSchemaPropsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<WatchEventFluent.JSONSchemaPropsObjectNested<N>>{

        
    public N and();    public N endJSONSchemaPropsObject();
}
    public interface ModelDeploymentConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.DeploymentConditionFluent<WatchEventFluent.ModelDeploymentConditionObjectNested<N>>{

        
    public N and();    public N endModelDeploymentConditionObject();
}
    public interface DeploymentCauseImageTriggerObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentCauseImageTriggerFluent<WatchEventFluent.DeploymentCauseImageTriggerObjectNested<N>>{

        
    public N and();    public N endDeploymentCauseImageTriggerObject();
}
    public interface NetworkPolicyPortObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyPortFluent<WatchEventFluent.NetworkPolicyPortObjectNested<N>>{

        
    public N and();    public N endNetworkPolicyPortObject();
}
    public interface OwnerReferenceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OwnerReferenceFluent<WatchEventFluent.OwnerReferenceObjectNested<N>>{

        
    public N and();    public N endOwnerReferenceObject();
}
    public interface CinderPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CinderPersistentVolumeSourceFluent<WatchEventFluent.CinderPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endCinderPersistentVolumeSourceObject();
}
    public interface ReplicationControllerConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerConditionFluent<WatchEventFluent.ReplicationControllerConditionObjectNested<N>>{

        
    public N and();    public N endReplicationControllerConditionObject();
}
    public interface PodAntiAffinityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAntiAffinityFluent<WatchEventFluent.PodAntiAffinityObjectNested<N>>{

        
    public N and();    public N endPodAntiAffinityObject();
}
    public interface PodDisruptionBudgetSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetSpecFluent<WatchEventFluent.PodDisruptionBudgetSpecObjectNested<N>>{

        
    public N and();    public N endPodDisruptionBudgetSpecObject();
}
    public interface MetricSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MetricSpecFluent<WatchEventFluent.MetricSpecObjectNested<N>>{

        
    public N and();    public N endMetricSpecObject();
}
    public interface ReplicationControllerListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerListFluent<WatchEventFluent.ReplicationControllerListObjectNested<N>>{

        
    public N and();    public N endReplicationControllerListObject();
}
    public interface EventsEventObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventFluent<WatchEventFluent.EventsEventObjectNested<N>>{

        
    public N and();    public N endEventsEventObject();
}
    public interface ContainerStateRunningObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateRunningFluent<WatchEventFluent.ContainerStateRunningObjectNested<N>>{

        
    public N and();    public N endContainerStateRunningObject();
}
    public interface HorizontalPodAutoscalerStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerStatusFluent<WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<N>>{

        
    public N and();    public N endHorizontalPodAutoscalerStatusObject();
}
    public interface JSONSchemaPropsOrArrayObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrArrayFluent<WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<N>>{

        
    public N and();    public N endJSONSchemaPropsOrArrayObject();
}
    public interface HTTPIngressPathObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPIngressPathFluent<WatchEventFluent.HTTPIngressPathObjectNested<N>>{

        
    public N and();    public N endHTTPIngressPathObject();
}
    public interface NamedExtensionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedExtensionFluent<WatchEventFluent.NamedExtensionObjectNested<N>>{

        
    public N and();    public N endNamedExtensionObject();
}
    public interface AzureFilePersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureFilePersistentVolumeSourceFluent<WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endAzureFilePersistentVolumeSourceObject();
}
    public interface SourceBuildStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceBuildStrategyFluent<WatchEventFluent.SourceBuildStrategyObjectNested<N>>{

        
    public N and();    public N endSourceBuildStrategyObject();
}
    public interface StatefulSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<WatchEventFluent.StatefulSetObjectNested<N>>{

        
    public N and();    public N endStatefulSetObject();
}
    public interface ContainerPortObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerPortFluent<WatchEventFluent.ContainerPortObjectNested<N>>{

        
    public N and();    public N endContainerPortObject();
}
    public interface BuildPostCommitSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildPostCommitSpecFluent<WatchEventFluent.BuildPostCommitSpecObjectNested<N>>{

        
    public N and();    public N endBuildPostCommitSpecObject();
}
    public interface PodListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodListFluent<WatchEventFluent.PodListObjectNested<N>>{

        
    public N and();    public N endPodListObject();
}
    public interface ResourceFieldSelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceFieldSelectorFluent<WatchEventFluent.ResourceFieldSelectorObjectNested<N>>{

        
    public N and();    public N endResourceFieldSelectorObject();
}
    public interface OpenshiftClusterRoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleFluent<WatchEventFluent.OpenshiftClusterRoleObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleObject();
}
    public interface ScaleSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleSpecFluent<WatchEventFluent.ScaleSpecObjectNested<N>>{

        
    public N and();    public N endScaleSpecObject();
}
    public interface ModelDeploymentStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.DeploymentStrategyFluent<WatchEventFluent.ModelDeploymentStrategyObjectNested<N>>{

        
    public N and();    public N endModelDeploymentStrategyObject();
}
    public interface SignatureSubjectObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SignatureSubjectFluent<WatchEventFluent.SignatureSubjectObjectNested<N>>{

        
    public N and();    public N endSignatureSubjectObject();
}
    public interface PersistentVolumeClaimSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimSpecFluent<WatchEventFluent.PersistentVolumeClaimSpecObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeClaimSpecObject();
}
    public interface RouteIngressConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteIngressConditionFluent<WatchEventFluent.RouteIngressConditionObjectNested<N>>{

        
    public N and();    public N endRouteIngressConditionObject();
}
    public interface LoadBalancerStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LoadBalancerStatusFluent<WatchEventFluent.LoadBalancerStatusObjectNested<N>>{

        
    public N and();    public N endLoadBalancerStatusObject();
}
    public interface ScopeSelectorObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScopeSelectorFluent<WatchEventFluent.ScopeSelectorObjectNested<N>>{

        
    public N and();    public N endScopeSelectorObject();
}
    public interface RunAsGroupStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RunAsGroupStrategyOptionsFluent<WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endRunAsGroupStrategyOptionsObject();
}
    public interface StageInfoObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StageInfoFluent<WatchEventFluent.StageInfoObjectNested<N>>{

        
    public N and();    public N endStageInfoObject();
}
    public interface UserListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserListFluent<WatchEventFluent.UserListObjectNested<N>>{

        
    public N and();    public N endUserListObject();
}
    public interface RoleObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<WatchEventFluent.RoleObjectNested<N>>{

        
    public N and();    public N endRoleObject();
}
    public interface ServicePortObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServicePortFluent<WatchEventFluent.ServicePortObjectNested<N>>{

        
    public N and();    public N endServicePortObject();
}
    public interface UserObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<WatchEventFluent.UserObjectNested<N>>{

        
    public N and();    public N endUserObject();
}
    public interface SessionAffinityConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SessionAffinityConfigFluent<WatchEventFluent.SessionAffinityConfigObjectNested<N>>{

        
    public N and();    public N endSessionAffinityConfigObject();
}
    public interface BuildStatusOutputToObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStatusOutputToFluent<WatchEventFluent.BuildStatusOutputToObjectNested<N>>{

        
    public N and();    public N endBuildStatusOutputToObject();
}
    public interface SecretSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretSpecFluent<WatchEventFluent.SecretSpecObjectNested<N>>{

        
    public N and();    public N endSecretSpecObject();
}
    public interface ServiceAccountListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountListFluent<WatchEventFluent.ServiceAccountListObjectNested<N>>{

        
    public N and();    public N endServiceAccountListObject();
}
    public interface ExecNewPodHookObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecNewPodHookFluent<WatchEventFluent.ExecNewPodHookObjectNested<N>>{

        
    public N and();    public N endExecNewPodHookObject();
}
    public interface ComponentStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<WatchEventFluent.ComponentStatusObjectNested<N>>{

        
    public N and();    public N endComponentStatusObject();
}
    public interface ScaleStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleStatusFluent<WatchEventFluent.ScaleStatusObjectNested<N>>{

        
    public N and();    public N endScaleStatusObject();
}
    public interface CertificateSigningRequestConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestConditionFluent<WatchEventFluent.CertificateSigningRequestConditionObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestConditionObject();
}
    public interface DaemonEndpointObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonEndpointFluent<WatchEventFluent.DaemonEndpointObjectNested<N>>{

        
    public N and();    public N endDaemonEndpointObject();
}
    public interface BuildTriggerPolicyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildTriggerPolicyFluent<WatchEventFluent.BuildTriggerPolicyObjectNested<N>>{

        
    public N and();    public N endBuildTriggerPolicyObject();
}
    public interface TokenReviewObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewFluent<WatchEventFluent.TokenReviewObjectNested<N>>{

        
    public N and();    public N endTokenReviewObject();
}
    public interface PodSecurityPolicyListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyListFluent<WatchEventFluent.PodSecurityPolicyListObjectNested<N>>{

        
    public N and();    public N endPodSecurityPolicyListObject();
}
    public interface StorageClassListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassListFluent<WatchEventFluent.StorageClassListObjectNested<N>>{

        
    public N and();    public N endStorageClassListObject();
}
    public interface RoleListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleListFluent<WatchEventFluent.RoleListObjectNested<N>>{

        
    public N and();    public N endRoleListObject();
}
    public interface RoleRefObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleRefFluent<WatchEventFluent.RoleRefObjectNested<N>>{

        
    public N and();    public N endRoleRefObject();
}
    public interface BindingObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BindingFluent<WatchEventFluent.BindingObjectNested<N>>{

        
    public N and();    public N endBindingObject();
}
    public interface DeploymentConfigSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigSpecFluent<WatchEventFluent.DeploymentConfigSpecObjectNested<N>>{

        
    public N and();    public N endDeploymentConfigSpecObject();
}
    public interface RollingUpdateDaemonSetObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingUpdateDaemonSetFluent<WatchEventFluent.RollingUpdateDaemonSetObjectNested<N>>{

        
    public N and();    public N endRollingUpdateDaemonSetObject();
}
    public interface NetworkPolicySpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicySpecFluent<WatchEventFluent.NetworkPolicySpecObjectNested<N>>{

        
    public N and();    public N endNetworkPolicySpecObject();
}
    public interface SecretObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<WatchEventFluent.SecretObjectNested<N>>{

        
    public N and();    public N endSecretObject();
}
    public interface ServiceListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceListFluent<WatchEventFluent.ServiceListObjectNested<N>>{

        
    public N and();    public N endServiceListObject();
}
    public interface StatefulSetUpdateStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetUpdateStrategyFluent<WatchEventFluent.StatefulSetUpdateStrategyObjectNested<N>>{

        
    public N and();    public N endStatefulSetUpdateStrategyObject();
}
    public interface EventsEventSeriesObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.events.EventSeriesFluent<WatchEventFluent.EventsEventSeriesObjectNested<N>>{

        
    public N and();    public N endEventsEventSeriesObject();
}
    public interface VolumeNodeAffinityObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeNodeAffinityFluent<WatchEventFluent.VolumeNodeAffinityObjectNested<N>>{

        
    public N and();    public N endVolumeNodeAffinityObject();
}
    public interface PodsMetricStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodsMetricStatusFluent<WatchEventFluent.PodsMetricStatusObjectNested<N>>{

        
    public N and();    public N endPodsMetricStatusObject();
}
    public interface ResourceQuotaSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaSpecFluent<WatchEventFluent.ResourceQuotaSpecObjectNested<N>>{

        
    public N and();    public N endResourceQuotaSpecObject();
}
    public interface GroupRestrictionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupRestrictionFluent<WatchEventFluent.GroupRestrictionObjectNested<N>>{

        
    public N and();    public N endGroupRestrictionObject();
}
    public interface JenkinsPipelineBuildStrategyObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JenkinsPipelineBuildStrategyFluent<WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<N>>{

        
    public N and();    public N endJenkinsPipelineBuildStrategyObject();
}
    public interface SecurityContextConstraintsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<WatchEventFluent.SecurityContextConstraintsObjectNested<N>>{

        
    public N and();    public N endSecurityContextConstraintsObject();
}
    public interface SubjectObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectFluent<WatchEventFluent.SubjectObjectNested<N>>{

        
    public N and();    public N endSubjectObject();
}
    public interface ReplicaSetConditionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetConditionFluent<WatchEventFluent.ReplicaSetConditionObjectNested<N>>{

        
    public N and();    public N endReplicaSetConditionObject();
}
    public interface BaseKubernetesListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BaseKubernetesListFluent<WatchEventFluent.BaseKubernetesListObjectNested<N>>{

        
    public N and();    public N endBaseKubernetesListObject();
}
    public interface SELinuxContextStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxContextStrategyOptionsFluent<WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endSELinuxContextStrategyOptionsObject();
}
    public interface TopologySelectorLabelRequirementObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TopologySelectorLabelRequirementFluent<WatchEventFluent.TopologySelectorLabelRequirementObjectNested<N>>{

        
    public N and();    public N endTopologySelectorLabelRequirementObject();
}
    public interface RBDPersistentVolumeSourceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RBDPersistentVolumeSourceFluent<WatchEventFluent.RBDPersistentVolumeSourceObjectNested<N>>{

        
    public N and();    public N endRBDPersistentVolumeSourceObject();
}
    public interface SELinuxOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxOptionsFluent<WatchEventFluent.SELinuxOptionsObjectNested<N>>{

        
    public N and();    public N endSELinuxOptionsObject();
}
    public interface HostAliasObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostAliasFluent<WatchEventFluent.HostAliasObjectNested<N>>{

        
    public N and();    public N endHostAliasObject();
}
    public interface ImageStreamStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamStatusFluent<WatchEventFluent.ImageStreamStatusObjectNested<N>>{

        
    public N and();    public N endImageStreamStatusObject();
}
    public interface NodeDaemonEndpointsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeDaemonEndpointsFluent<WatchEventFluent.NodeDaemonEndpointsObjectNested<N>>{

        
    public N and();    public N endNodeDaemonEndpointsObject();
}
    public interface NetNamespaceObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetNamespaceFluent<WatchEventFluent.NetNamespaceObjectNested<N>>{

        
    public N and();    public N endNetNamespaceObject();
}
    public interface PersistentVolumeSpecObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeSpecFluent<WatchEventFluent.PersistentVolumeSpecObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeSpecObject();
}
    public interface StatefulSetListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetListFluent<WatchEventFluent.StatefulSetListObjectNested<N>>{

        
    public N and();    public N endStatefulSetListObject();
}
    public interface OpenshiftClusterRoleBindingListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingListFluent<WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<N>>{

        
    public N and();    public N endOpenshiftClusterRoleBindingListObject();
}
    public interface ReplicaSetStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetStatusFluent<WatchEventFluent.ReplicaSetStatusObjectNested<N>>{

        
    public N and();    public N endReplicaSetStatusObject();
}
    public interface NodeObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<WatchEventFluent.NodeObjectNested<N>>{

        
    public N and();    public N endNodeObject();
}
    public interface PriorityClassListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassListFluent<WatchEventFluent.PriorityClassListObjectNested<N>>{

        
    public N and();    public N endPriorityClassListObject();
}
    public interface JobObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<WatchEventFluent.JobObjectNested<N>>{

        
    public N and();    public N endJobObject();
}
    public interface PodStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodStatusFluent<WatchEventFluent.PodStatusObjectNested<N>>{

        
    public N and();    public N endPodStatusObject();
}
    public interface BuildOutputObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildOutputFluent<WatchEventFluent.BuildOutputObjectNested<N>>{

        
    public N and();    public N endBuildOutputObject();
}
    public interface ExecConfigObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecConfigFluent<WatchEventFluent.ExecConfigObjectNested<N>>{

        
    public N and();    public N endExecConfigObject();
}
    public interface PersistentVolumeStatusObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeStatusFluent<WatchEventFluent.PersistentVolumeStatusObjectNested<N>>{

        
    public N and();    public N endPersistentVolumeStatusObject();
}
    public interface EndpointPortObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointPortFluent<WatchEventFluent.EndpointPortObjectNested<N>>{

        
    public N and();    public N endEndpointPortObject();
}
    public interface SourceRevisionObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceRevisionFluent<WatchEventFluent.SourceRevisionObjectNested<N>>{

        
    public N and();    public N endSourceRevisionObject();
}
    public interface JSONObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONFluent<WatchEventFluent.JSONObjectNested<N>>{

        
    public N and();    public N endJSONObject();
}
    public interface LimitRangeItemObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeItemFluent<WatchEventFluent.LimitRangeItemObjectNested<N>>{

        
    public N and();    public N endLimitRangeItemObject();
}
    public interface CertificateSigningRequestObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<WatchEventFluent.CertificateSigningRequestObjectNested<N>>{

        
    public N and();    public N endCertificateSigningRequestObject();
}
    public interface FSGroupStrategyOptionsObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FSGroupStrategyOptionsFluent<WatchEventFluent.FSGroupStrategyOptionsObjectNested<N>>{

        
    public N and();    public N endFSGroupStrategyOptionsObject();
}
    public interface ClusterRoleListObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleListFluent<WatchEventFluent.ClusterRoleListObjectNested<N>>{

        
    public N and();    public N endClusterRoleListObject();
}
    public interface RouteIngressObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteIngressFluent<WatchEventFluent.RouteIngressObjectNested<N>>{

        
    public N and();    public N endRouteIngressObject();
}
    public interface ServiceAccountObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<WatchEventFluent.ServiceAccountObjectNested<N>>{

        
    public N and();    public N endServiceAccountObject();
}


}
