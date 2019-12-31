package io.fabric8.kubernetes.api.model;

import io.fabric8.openshift.api.model.OpenshiftRoleBindingListFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetCondition;
import io.fabric8.kubernetes.api.model.batch.CronJobSpec;
import io.fabric8.openshift.api.model.BinaryBuildSourceFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfigBuilder;
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes;
import io.fabric8.openshift.api.model.BuildStatusOutputToBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList;
import io.fabric8.openshift.api.model.TagImageHookFluentImpl;
import io.fabric8.openshift.api.model.BuildRequestFluentImpl;
import io.fabric8.openshift.api.model.DeploymentDetailsFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusFluentImpl;
import io.fabric8.openshift.api.model.SecurityContextConstraints;
import io.fabric8.openshift.api.model.ConfigMapBuildSource;
import io.fabric8.openshift.api.model.RouteIngressConditionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScale;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersion;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.ProjectStatusBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReferenceFluentImpl;
import io.fabric8.openshift.api.model.WebHookTriggerFluentImpl;
import io.fabric8.kubernetes.api.model.admission.AdmissionReview;
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReference;
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategyBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsBuilder;
import io.fabric8.openshift.api.model.SecretSpecBuilder;
import io.fabric8.openshift.api.model.SignatureConditionFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatusFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamTagBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatusBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReferenceBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec;
import io.fabric8.openshift.api.model.TemplateListFluentImpl;
import io.fabric8.openshift.api.model.RouteSpec;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview;
import io.fabric8.openshift.api.model.RunAsUserStrategyOptions;
import io.fabric8.openshift.api.model.GenericWebHookCause;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeploymentFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListFluentImpl;
import io.fabric8.openshift.api.model.GitHubWebHookCauseFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsBuilder;
import io.fabric8.openshift.api.model.SignatureCondition;
import io.fabric8.openshift.api.model.SourceBuildStrategyBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.batch.JobStatusFluentImpl;
import io.fabric8.openshift.api.model.BuildBuilder;
import io.fabric8.openshift.api.model.ProjectSpec;
import io.fabric8.kubernetes.api.model.rbac.RoleListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusFluentImpl;
import io.fabric8.openshift.api.model.SecretLocalReferenceFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleFluentImpl;
import io.fabric8.kubernetes.api.model.version.InfoBuilder;
import io.fabric8.openshift.api.model.ImageChangeTriggerFluentImpl;
import io.fabric8.openshift.api.model.SourceStrategyOptionsFluentImpl;
import io.fabric8.openshift.api.model.GitLabWebHookCauseBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatusBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListBuilder;
import io.fabric8.openshift.api.model.ParameterBuilder;
import io.fabric8.openshift.api.model.GitBuildSourceFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecBuilder;
import io.fabric8.openshift.api.model.BuildSource;
import io.fabric8.openshift.api.model.OAuthAccessTokenList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetConditionFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamTagListFluentImpl;
import io.fabric8.openshift.api.model.ImageSignature;
import io.fabric8.openshift.api.model.ImageStreamImportBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatusFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPreset;
import io.fabric8.openshift.api.model.DockerBuildStrategyFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.ScaleSpecFluentImpl;
import io.fabric8.openshift.api.model.WebHookTriggerBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigSpecBuilder;
import io.fabric8.kubernetes.api.model.extensions.RollbackConfigBuilder;
import io.fabric8.openshift.api.model.OAuthClientListFluentImpl;
import io.fabric8.openshift.api.model.SourceBuildStrategyFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamListFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecFluentImpl;
import io.fabric8.openshift.api.model.SourceControlUser;
import io.fabric8.openshift.api.model.GitHubWebHookCause;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.openshift.api.model.BuildTriggerPolicyBuilder;
import io.fabric8.openshift.api.model.SourceBuildStrategy;
import io.fabric8.openshift.api.model.CustomBuildStrategy;
import io.fabric8.kubernetes.api.model.extensions.IngressStatus;
import io.fabric8.openshift.api.model.NamedTagEventListBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobStatus;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValueFluentImpl;
import io.fabric8.openshift.api.model.SignatureSubjectFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressSpecBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourcesFluentImpl;
import io.fabric8.openshift.api.model.ImageSource;
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.openshift.api.model.ImageImportStatusBuilder;
import io.fabric8.openshift.api.model.ImageStreamSpec;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.SecretSpecFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListFluentImpl;
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.ImageSourcePathBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceColumnDefinitionBuilder;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.kubernetes.api.model.runtime.RawExtensionBuilder;
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolumeFluentImpl;
import io.fabric8.openshift.api.model.RouteBuilder;
import io.fabric8.openshift.api.model.StageInfoFluentImpl;
import io.fabric8.openshift.api.model.RunAsUserStrategyOptionsFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetBuilder;
import io.fabric8.openshift.api.model.BuildStatusOutputBuilder;
import io.fabric8.openshift.api.model.BuildConfigFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressTLSFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClass;
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptions;
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributesBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategyBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray;
import io.fabric8.kubernetes.api.model.batch.JobSpecFluentImpl;
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParamsBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus;
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatus;
import io.fabric8.openshift.api.model.NamedTagEventListFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpecFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressListBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpecBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSet;
import io.fabric8.openshift.api.model.DeploymentCauseImageTriggerFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingListBuilder;
import io.fabric8.openshift.api.model.DeploymentCauseBuilder;
import io.fabric8.openshift.api.model.SecretBuildSource;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpecBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetCondition;
import io.fabric8.openshift.api.model.DeploymentConfigList;
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategyBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyFluentImpl;
import io.fabric8.openshift.api.model.DeploymentTriggerPolicy;
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParamsBuilder;
import io.fabric8.openshift.api.model.ProjectSpecBuilder;
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy;
import io.fabric8.openshift.api.model.UserFluentImpl;
import io.fabric8.openshift.api.model.ScopeRestrictionFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperationsFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressRule;
import io.fabric8.openshift.api.model.SecretLocalReference;
import java.lang.Boolean;
import io.fabric8.openshift.api.model.RoutePort;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListBuilder;
import io.fabric8.openshift.api.model.GitBuildSource;
import java.lang.Object;
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArrayFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpecBuilder;
import io.fabric8.openshift.api.model.UserRestriction;
import io.fabric8.openshift.api.model.ImageChangeCause;
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams;
import io.fabric8.openshift.api.model.ParameterFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpecFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportSpecFluentImpl;
import io.fabric8.openshift.api.model.TemplateListBuilder;
import io.fabric8.openshift.api.model.TagImageHook;
import io.fabric8.kubernetes.api.model.rbac.RoleFluentImpl;
import io.fabric8.openshift.api.model.TagImageHookBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBuilder;
import io.fabric8.openshift.api.model.ProjectStatus;
import io.fabric8.openshift.api.model.ImageStreamSpecBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.openshift.api.model.SourceStrategyOptions;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperations;
import io.fabric8.openshift.api.model.GitHubWebHookCauseBuilder;
import io.fabric8.openshift.api.model.BitbucketWebHookCause;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.openshift.api.model.BuildConfigStatus;
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptions;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigSpecFluentImpl;
import io.fabric8.openshift.api.model.TagEvent;
import io.fabric8.openshift.api.model.OAuthClientFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IDRangeFluentImpl;
import io.fabric8.openshift.api.model.RepositoryImportStatusFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportStatusBuilder;
import io.fabric8.openshift.api.model.GitSourceRevision;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestrictionFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptionsFluentImpl;
import io.fabric8.openshift.api.model.SecretBuildSourceFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressSpec;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversion;
import io.fabric8.openshift.api.model.ServiceAccountRestrictionBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBoolFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceColumnDefinitionFluentImpl;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest;
import io.fabric8.openshift.api.model.BuildSpecBuilder;
import io.fabric8.kubernetes.api.model.batch.JobListBuilder;
import io.fabric8.openshift.api.model.ImageSourceFluentImpl;
import io.fabric8.openshift.api.model.GenericWebHookCauseFluentImpl;
import io.fabric8.openshift.api.model.SourceControlUserBuilder;
import io.fabric8.openshift.api.model.BuildStrategy;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRuleFluentImpl;
import io.fabric8.openshift.api.model.OAuthAccessTokenBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatusBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPortFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatusBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategyFluentImpl;
import io.fabric8.openshift.api.model.RouteTargetReferenceFluentImpl;
import io.fabric8.openshift.api.model.UserRestrictionFluentImpl;
import io.fabric8.openshift.api.model.SignatureSubjectBuilder;
import io.fabric8.openshift.api.model.WebHookTrigger;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpecFluentImpl;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.admissionregistration.RuleBuilder;
import io.fabric8.openshift.api.model.ImageStreamStatusBuilder;
import io.fabric8.openshift.api.model.TagEventFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatusFluentImpl;
import io.fabric8.openshift.api.model.ImageSignatureBuilder;
import io.fabric8.openshift.api.model.DockerStrategyOptions;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentation;
import io.fabric8.openshift.api.model.SecurityContextConstraintsFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest;
import io.fabric8.openshift.api.model.RouteIngressCondition;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.openshift.api.model.ImageFluentImpl;
import io.fabric8.openshift.api.model.BuildConfigListFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationBuilder;
import io.fabric8.openshift.api.model.SourceStrategyOptionsBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleListFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.ProjectFluentImpl;
import io.fabric8.openshift.api.model.TagEventConditionBuilder;
import io.fabric8.openshift.api.model.TagEventConditionFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSON;
import io.fabric8.openshift.api.model.TLSConfigFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.UserInfoBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatus;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec;
import io.fabric8.openshift.api.model.UserList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec;
import io.fabric8.openshift.api.model.ImageListFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec;
import io.fabric8.openshift.api.model.BitbucketWebHookCauseBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleRefBuilder;
import io.fabric8.openshift.api.model.BuildStatusBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionBuilder;
import io.fabric8.openshift.api.model.ImageStreamStatusFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArrayBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetList;
import io.fabric8.openshift.api.model.GitLabWebHookCauseFluentImpl;
import io.fabric8.openshift.api.model.BuildSourceBuilder;
import io.fabric8.kubernetes.api.model.authentication.UserInfoFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationFluentImpl;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpecBuilder;
import io.fabric8.openshift.api.model.ImageImportStatusFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.openshift.api.model.StepInfo;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListFluentImpl;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassList;
import io.fabric8.openshift.api.model.BuildStatusOutputTo;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListFluentImpl;
import io.fabric8.openshift.api.model.ServiceAccountRestrictionFluentImpl;
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptionsFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleListFluentImpl;
import io.fabric8.openshift.api.model.RouteIngressBuilder;
import io.fabric8.kubernetes.api.model.batch.JobSpec;
import io.fabric8.kubernetes.api.model.apps.DeploymentStatus;
import io.fabric8.openshift.api.model.ProjectSpecFluentImpl;
import io.fabric8.openshift.api.model.GroupFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.TemplateBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidationBuilder;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsFluentImpl;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.openshift.api.model.NetNamespaceListBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyFluentImpl;
import io.fabric8.openshift.api.model.SourceRevisionBuilder;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationBuilder;
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams;
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptionsBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentationBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategyFluentImpl;
import io.fabric8.openshift.api.model.GitBuildSourceBuilder;
import io.fabric8.openshift.api.model.BuildConfigStatusBuilder;
import io.fabric8.openshift.api.model.BuildPostCommitSpec;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategyFluentImpl;
import io.fabric8.kubernetes.api.model.batch.JobListFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.batch.JobConditionBuilder;
import io.fabric8.openshift.api.model.BinaryBuildSource;
import io.fabric8.openshift.api.model.RouteIngress;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBoolBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetConditionFluentImpl;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSetFluentImpl;
import io.fabric8.openshift.api.model.UserBuilder;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClass;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionBuilder;
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams;
import io.fabric8.kubernetes.api.model.extensions.ScaleSpecBuilder;
import io.fabric8.openshift.api.model.SourceRevision;
import io.fabric8.openshift.api.model.LifecycleHook;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview;
import io.fabric8.openshift.api.model.BuildStatus;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestListFluentImpl;
import io.fabric8.openshift.api.model.ImageSourcePathFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IDRange;
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentationFluentImpl;
import io.fabric8.openshift.api.model.BuildPostCommitSpecBuilder;
import io.fabric8.openshift.api.model.GitSourceRevisionBuilder;
import io.fabric8.openshift.api.model.BuildStatusOutputToFluentImpl;
import io.fabric8.openshift.api.model.IdentityListBuilder;
import io.fabric8.kubernetes.api.model.extensions.HostPortRangeBuilder;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.kubernetes.api.model.apps.DeploymentCondition;
import io.fabric8.openshift.api.model.BuildOutputFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.PolicyRule;
import io.fabric8.openshift.api.model.CustomBuildStrategyBuilder;
import io.fabric8.openshift.api.model.ProjectRequestFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportFluentImpl;
import io.fabric8.openshift.api.model.ExecNewPodHookFluentImpl;
import io.fabric8.openshift.api.model.TLSConfigBuilder;
import io.fabric8.openshift.api.model.BuildConfigList;
import io.fabric8.openshift.api.model.ImageImportSpecFluentImpl;
import io.fabric8.openshift.api.model.GroupRestrictionBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetConditionBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatusFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptions;
import io.fabric8.openshift.api.model.DockerStrategyOptionsFluentImpl;
import io.fabric8.openshift.api.model.ImageLabelBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatusBuilder;
import io.fabric8.openshift.api.model.TagImportPolicyFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportStatusFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArrayFluentImpl;
import io.fabric8.openshift.api.model.ExecNewPodHook;
import io.fabric8.openshift.api.model.UserListBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRule;
import io.fabric8.openshift.api.model.BuildTriggerCause;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentListFluentImpl;
import io.fabric8.openshift.api.model.DeploymentDetails;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction;
import io.fabric8.openshift.api.model.ImageLayer;
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListFluentImpl;
import io.fabric8.openshift.api.model.RouteIngressConditionFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetListBuilder;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingListBuilder;
import io.fabric8.openshift.api.model.LifecycleHookFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpecFluentImpl;
import io.fabric8.openshift.api.model.DockerBuildStrategyBuilder;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPathBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassList;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec;
import io.fabric8.kubernetes.api.model.apps.DeploymentStatusBuilder;
import io.fabric8.openshift.api.model.RoutePortBuilder;
import io.fabric8.openshift.api.model.ImageSourcePath;
import io.fabric8.openshift.api.model.ImageStreamSpecFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolume;
import io.fabric8.openshift.api.model.UserRestrictionBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleBuilder;
import io.fabric8.openshift.api.model.ImageStreamListBuilder;
import io.fabric8.openshift.api.model.BuildFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetConditionFluentImpl;
import io.fabric8.kubernetes.api.model.runtime.RawExtension;
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategyFluentImpl;
import io.fabric8.openshift.api.model.GenericWebHookCauseBuilder;
import io.fabric8.openshift.api.model.ImageStreamFluentImpl;
import io.fabric8.openshift.api.model.TemplateList;
import io.fabric8.openshift.api.model.DockerBuildStrategy;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath;
import io.fabric8.openshift.api.model.DeploymentCauseFluentImpl;
import io.fabric8.openshift.api.model.BuildList;
import io.fabric8.openshift.api.model.OAuthClientListBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagListBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigBuilder;
import io.fabric8.openshift.api.model.IdentityList;
import java.lang.String;
import io.fabric8.openshift.api.model.LifecycleHookBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetListBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetConditionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersionFluentImpl;
import io.fabric8.openshift.api.model.CustomBuildStrategyFluentImpl;
import io.fabric8.openshift.api.model.OAuthAccessTokenFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidationFluentImpl;
import io.fabric8.openshift.api.model.ImageChangeTriggerBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatusBuilder;
import io.fabric8.openshift.api.model.RepositoryImportSpecFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewBuilder;
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPathBuilder;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListBuilder;
import io.fabric8.openshift.api.model.OAuthClientBuilder;
import io.fabric8.openshift.api.model.BitbucketWebHookCauseFluentImpl;
import io.fabric8.openshift.api.model.StageInfo;
import io.fabric8.kubernetes.api.model.extensions.HostPortRange;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRuleBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassBuilder;
import io.fabric8.openshift.api.model.BuildTriggerCauseFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpecBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetList;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestBuilder;
import io.fabric8.openshift.api.model.ProjectList;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy;
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatus;
import io.fabric8.openshift.api.model.GitLabWebHookCause;
import io.fabric8.openshift.api.model.OAuthAccessTokenListFluentImpl;
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressBackendBuilder;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingListFluentImpl;
import io.fabric8.kubernetes.api.model.runtime.RawExtensionFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewBuilder;
import io.fabric8.openshift.api.model.Parameter;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRuleBuilder;
import io.fabric8.kubernetes.api.model.extensions.ScaleFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestriction;
import io.fabric8.openshift.api.model.ImageStreamImport;
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPathFluentImpl;
import io.fabric8.openshift.api.model.BuildStrategyBuilder;
import io.fabric8.openshift.api.model.ConfigMapBuildSourceFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressRuleFluentImpl;
import io.fabric8.openshift.api.model.ImageLookupPolicyFluentImpl;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.openshift.api.model.ProjectBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpecBuilder;
import io.fabric8.openshift.api.model.GitSourceRevisionFluentImpl;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpecFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.UserInfo;
import io.fabric8.openshift.api.model.BuildTriggerCauseBuilder;
import io.fabric8.openshift.api.model.BuildSpec;
import io.fabric8.kubernetes.api.model.batch.CronJobStatusFluentImpl;
import io.fabric8.kubernetes.api.model.storage.StorageClassFluentImpl;
import io.fabric8.openshift.api.model.RepositoryImportSpecBuilder;
import io.fabric8.kubernetes.api.model.version.Info;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.openshift.api.model.RouteIngressFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpecBuilder;
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParamsFluentImpl;
import io.fabric8.openshift.api.model.DeploymentTriggerPolicyBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobList;
import io.fabric8.openshift.api.model.RepositoryImportSpec;
import io.fabric8.openshift.api.model.SecurityContextConstraintsBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec;
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig;
import io.fabric8.openshift.api.model.RepositoryImportStatusBuilder;
import io.fabric8.openshift.api.model.RouteListFluentImpl;
import io.fabric8.openshift.api.model.StepInfoBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressListFluentImpl;
import io.fabric8.openshift.api.model.BinaryBuildSourceBuilder;
import io.fabric8.openshift.api.model.DeploymentTriggerPolicyFluentImpl;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassFluentImpl;
import io.fabric8.openshift.api.model.ImageListBuilder;
import io.fabric8.kubernetes.api.model.batch.JobCondition;
import io.fabric8.openshift.api.model.BuildSpecFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.RoleRef;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationListBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobListFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.settings.PodPresetListFluentImpl;
import io.fabric8.openshift.api.model.RouteSpecBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressRuleBuilder;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatusBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionFluentImpl;
import io.fabric8.kubernetes.api.model.batch.CronJobBuilder;
import io.fabric8.openshift.api.model.ImageLookupPolicyBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList;
import io.fabric8.openshift.api.model.IdentityBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList;
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec;
import io.fabric8.openshift.api.model.NetNamespaceFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestCondition;
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributesFluentImpl;
import io.fabric8.openshift.api.model.ServiceAccountReferenceBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet;
import io.fabric8.kubernetes.api.model.apps.StatefulSetFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.openshift.api.model.RunAsUserStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.DeploymentConfigStatusFluentImpl;
import io.fabric8.openshift.api.model.NetNamespace;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenListFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeerFluentImpl;
import io.fabric8.openshift.api.model.NetNamespaceListFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRuleFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourcesBuilder;
import io.fabric8.openshift.api.model.BuildOutput;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecFluentImpl;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategy;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpecFluentImpl;
import io.fabric8.kubernetes.api.model.batch.JobStatusBuilder;
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger;
import io.fabric8.openshift.api.model.BuildTriggerPolicy;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategyBuilder;
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.TagReference;
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParamsFluentImpl;
import io.fabric8.openshift.api.model.OAuthClientAuthorization;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScaleBuilder;
import io.fabric8.openshift.api.model.RouteListBuilder;
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategyFluentImpl;
import io.fabric8.openshift.api.model.ImageImportSpec;
import io.fabric8.kubernetes.api.model.rbac.AggregationRule;
import io.fabric8.openshift.api.model.IdentityFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions;
import io.fabric8.kubernetes.api.model.networking.IPBlock;
import io.fabric8.kubernetes.api.model.apps.DaemonSetCondition;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewFluentImpl;
import io.fabric8.openshift.api.model.TagImportPolicyBuilder;
import io.fabric8.openshift.api.model.ImageSignatureFluentImpl;
import io.fabric8.openshift.api.model.BuildStatusFluentImpl;
import io.fabric8.openshift.api.model.ImageChangeTrigger;
import io.fabric8.openshift.api.model.TagReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatusFluentImpl;
import io.fabric8.openshift.api.model.GroupBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionConditionFluentImpl;
import io.fabric8.openshift.api.model.UserListFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatusBuilder;
import io.fabric8.openshift.api.model.BuildStrategyFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptionsFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.PolicyRuleFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpecFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec;
import java.lang.Long;
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatus;
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributesBuilder;
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyListFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetListBuilder;
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParamsFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptionsFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpecFluentImpl;
import io.fabric8.openshift.api.model.ExecNewPodHookBuilder;
import io.fabric8.openshift.api.model.RouteList;
import io.fabric8.openshift.api.model.ImageChangeCauseBuilder;
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParamsBuilder;
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptionsFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyListBuilder;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeploymentBuilder;
import io.fabric8.kubernetes.api.model.rbac.SubjectBuilder;
import io.fabric8.openshift.api.model.BuildStatusOutputFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeerBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList;
import javax.validation.Valid;
import io.fabric8.openshift.api.model.ProjectRequest;
import io.fabric8.kubernetes.api.model.admissionregistration.Rule;
import io.fabric8.openshift.api.model.OAuthAccessTokenListBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategyBuilder;
import io.fabric8.openshift.api.model.ConfigMapBuildSourceBuilder;
import io.fabric8.openshift.api.model.TemplateFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValueBuilder;
import io.fabric8.openshift.api.model.ImageChangeCauseFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionReviewBuilder;
import io.fabric8.openshift.api.model.TagReferenceBuilder;
import io.fabric8.openshift.api.model.BuildSourceFluentImpl;
import io.fabric8.openshift.api.model.ImageList;
import io.fabric8.openshift.api.model.StageInfoBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressBackendFluentImpl;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseBuilder;
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReviewFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue;
import io.fabric8.kubernetes.api.model.extensions.ScaleStatusBuilder;
import io.fabric8.openshift.api.model.ServiceAccountReferenceFluentImpl;
import io.fabric8.openshift.api.model.GroupRestriction;
import io.fabric8.kubernetes.api.model.extensions.HostPortRangeFluentImpl;
import io.fabric8.openshift.api.model.SourceRevisionFluentImpl;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceColumnDefinition;
import io.fabric8.openshift.api.model.SignatureIssuerFluentImpl;
import io.fabric8.openshift.api.model.RouteSpecFluentImpl;
import io.fabric8.openshift.api.model.TagImportPolicy;
import io.fabric8.kubernetes.api.model.batch.CronJobFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamImportSpec;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames;
import io.fabric8.openshift.api.model.SignatureIssuer;
import io.fabric8.openshift.api.model.BuildTriggerPolicyFluentImpl;
import io.fabric8.openshift.api.model.DeploymentConfigStatusBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetList;
import io.fabric8.openshift.api.model.DeploymentConfigSpec;
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolumeBuilder;
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPath;
import io.fabric8.openshift.api.model.ImageImportSpecBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressSpecFluentImpl;
import io.fabric8.openshift.api.model.ImageLayerBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsListFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec;
import io.fabric8.openshift.api.model.NetNamespaceList;
import io.fabric8.kubernetes.api.model.batch.CronJobSpecBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList;
import io.fabric8.openshift.api.model.BuildConfigListBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobSpecFluentImpl;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatusBuilder;
import io.fabric8.kubernetes.api.model.rbac.PolicyRuleBuilder;
import io.fabric8.openshift.api.model.BuildPostCommitSpecFluentImpl;
import io.fabric8.openshift.api.model.BuildOutputBuilder;
import io.fabric8.kubernetes.api.model.batch.JobList;
import io.fabric8.kubernetes.api.model.batch.CronJobListBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestConditionBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionRequestFluentImpl;
import io.fabric8.openshift.api.model.SecretBuildSourceBuilder;
import io.fabric8.kubernetes.api.model.settings.PodPresetSpecBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenBuilder;
import io.fabric8.openshift.api.model.IdentityListFluentImpl;
import io.fabric8.openshift.api.model.TagReferencePolicy;
import io.fabric8.openshift.api.model.NamedTagEventList;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingFluentImpl;
import io.fabric8.openshift.api.model.ImageSourceBuilder;
import io.fabric8.openshift.api.model.TagEventCondition;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.openshift.api.model.GroupListBuilder;
import io.fabric8.kubernetes.api.model.networking.IPBlockFluentImpl;
import io.fabric8.openshift.api.model.StepInfoFluentImpl;
import io.fabric8.openshift.api.model.GroupList;
import io.fabric8.openshift.api.model.ImageStreamImportSpecBuilder;
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes;
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptionsFluentImpl;
import io.fabric8.openshift.api.model.BuildConfigSpecBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPort;
import io.fabric8.openshift.api.model.BuildListBuilder;
import io.fabric8.openshift.api.model.ImageStreamImportStatus;
import io.fabric8.openshift.api.model.SignatureIssuerBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressList;
import io.fabric8.openshift.api.model.GroupRestrictionFluentImpl;
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpecFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IDRangeBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingListFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.RollbackConfigFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressStatusFluentImpl;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSetBuilder;
import io.fabric8.openshift.api.model.SecurityContextConstraintsList;
import io.fabric8.openshift.api.model.RouteStatusBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatusFluentImpl;
import io.fabric8.openshift.api.model.BuildListFluentImpl;
import io.fabric8.openshift.api.model.ProjectRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.kubernetes.api.model.rbac.SubjectFluentImpl;
import io.fabric8.openshift.api.model.Image;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassListFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversionFluentImpl;
import io.fabric8.openshift.api.model.RouteStatusFluentImpl;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.RouteTargetReferenceBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationListBuilder;
import io.fabric8.openshift.api.model.ServiceAccountReference;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRule;
import io.fabric8.openshift.api.model.NetNamespaceBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBinding;
import io.fabric8.openshift.api.model.TagEventBuilder;
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpecBuilder;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollbackBuilder;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpecBuilder;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.IngressTLS;
import io.fabric8.kubernetes.api.model.extensions.IngressBackend;
import io.fabric8.kubernetes.api.model.extensions.ScaleStatusFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleListBuilder;
import io.fabric8.openshift.api.model.TagReferencePolicyFluentImpl;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse;
import io.fabric8.kubernetes.api.model.rbac.RoleRefFluentImpl;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec;
import io.fabric8.openshift.api.model.ProjectListBuilder;
import io.fabric8.kubernetes.api.model.version.InfoFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.RoleList;
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParamsBuilder;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.openshift.api.model.ImageLabel;
import io.fabric8.kubernetes.api.model.apps.DaemonSetBuilder;
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfigFluentImpl;
import io.fabric8.openshift.api.model.DeploymentDetailsBuilder;
import io.fabric8.kubernetes.api.model.extensions.Scale;
import io.fabric8.openshift.api.model.ImageImportStatus;
import io.fabric8.openshift.api.model.ProjectStatusFluentImpl;
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPathFluentImpl;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse;
import io.fabric8.openshift.api.model.ImageLayerFluentImpl;
import io.fabric8.openshift.api.model.ProjectListFluentImpl;
import io.fabric8.openshift.api.model.RouteStatus;
import io.fabric8.openshift.api.model.BuildStatusOutput;
import io.fabric8.openshift.api.model.SignatureConditionBuilder;
import io.fabric8.openshift.api.model.DeploymentCause;
import io.fabric8.openshift.api.model.RepositoryImportStatus;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.openshift.api.model.DeploymentConfigStatus;
import io.fabric8.kubernetes.api.model.apps.DeploymentConditionBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentListBuilder;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleListFluentImpl;
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributesFluentImpl;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList;
import io.fabric8.kubernetes.api.model.apps.ReplicaSet;
import io.fabric8.openshift.api.model.BuildConfigSpec;
import io.fabric8.kubernetes.api.model.apps.DaemonSetConditionBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassListFluentImpl;
import io.fabric8.openshift.api.model.SubjectAccessReviewResponseFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy;
import io.fabric8.kubernetes.api.model.extensions.IngressStatusBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool;
import io.fabric8.kubernetes.api.model.authentication.TokenReviewFluentImpl;
import io.fabric8.openshift.api.model.ImageStreamStatus;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftRoleList;
import io.fabric8.openshift.api.model.ServiceAccountRestriction;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseBuilder;
import io.fabric8.kubernetes.api.model.admission.AdmissionResponseFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestrictionBuilder;
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.RouteFluentImpl;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpecFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatusFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersionBuilder;
import io.fabric8.kubernetes.api.model.apps.ReplicaSetFluentImpl;
import io.fabric8.kubernetes.api.model.batch.JobSpecBuilder;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPortBuilder;
import io.fabric8.openshift.api.model.OAuthClientList;
import io.fabric8.openshift.api.model.ImageBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScaleFluentImpl;
import io.fabric8.openshift.api.model.SecretSpec;
import io.fabric8.openshift.api.model.SecretLocalReferenceBuilder;
import io.fabric8.kubernetes.api.model.rbac.Subject;
import io.fabric8.openshift.api.model.ScopeRestriction;
import java.lang.Integer;
import io.fabric8.openshift.api.model.SignatureSubject;
import io.fabric8.kubernetes.api.model.networking.IPBlockBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.openshift.api.model.ImageLabelFluentImpl;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleFluentImpl;
import io.fabric8.kubernetes.api.model.apps.DeploymentConditionFluentImpl;
import io.fabric8.openshift.api.model.DockerStrategyOptionsBuilder;
import io.fabric8.openshift.api.model.BuildRequestBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassBuilder;
import io.fabric8.openshift.api.model.DeploymentCauseImageTriggerBuilder;
import io.fabric8.openshift.api.model.Identity;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNamesBuilder;
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions;
import io.fabric8.kubernetes.api.model.apps.DaemonSetFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingList;
import io.fabric8.kubernetes.api.model.batch.CronJob;
import io.fabric8.kubernetes.api.model.extensions.ScaleStatus;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestBuilder;
import io.fabric8.openshift.api.model.ImageStreamTagFluentImpl;
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParamsFluentImpl;
import io.fabric8.openshift.api.model.SourceControlUserFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray;
import io.fabric8.openshift.api.model.ImageStreamTagList;
import io.fabric8.openshift.api.model.ImageLookupPolicy;
import io.fabric8.kubernetes.api.model.batch.JobStatus;
import io.fabric8.openshift.api.model.TagReferencePolicyBuilder;
import io.fabric8.kubernetes.api.model.extensions.IngressTLSBuilder;
import io.fabric8.kubernetes.api.model.batch.CronJobStatusBuilder;
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestFluentImpl;
import io.fabric8.openshift.api.model.TLSConfig;
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionListBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps;
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpecBuilder;
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenFluentImpl;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus;
import io.fabric8.openshift.api.model.BuildConfigBuilder;
import io.fabric8.kubernetes.api.model.storage.StorageClassListBuilder;
import io.fabric8.openshift.api.model.OpenshiftRoleBindingList;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.apps.DeploymentStatusFluentImpl;
import io.fabric8.openshift.api.model.GroupListFluentImpl;
import io.fabric8.openshift.api.model.OpenshiftClusterRole;
import io.fabric8.openshift.api.model.BuildRequest;
import io.fabric8.openshift.api.model.RoutePortFluentImpl;
import io.fabric8.openshift.api.model.ScopeRestrictionBuilder;
import io.fabric8.kubernetes.api.model.apps.StatefulSet;
import io.fabric8.openshift.api.model.OpenshiftRole;
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment;
import io.fabric8.openshift.api.model.RouteTargetReference;
import io.fabric8.openshift.api.model.User;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget;
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetListFluentImpl;
import io.fabric8.kubernetes.api.model.batch.JobConditionFluentImpl;
import io.fabric8.openshift.api.model.BuildConfigStatusFluentImpl;
import io.fabric8.openshift.api.model.BuildConfigSpecFluentImpl;
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationListFluentImpl;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpecBuilder;

public class WatchEventFluentImpl<A extends WatchEventFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements WatchEventFluent<A>{

    private VisitableBuilder<? extends KubernetesResource,?> object;
    private String type;

    public WatchEventFluentImpl(){
    }
    public WatchEventFluentImpl(WatchEvent instance){
            this.withObject(instance.getObject()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public KubernetesResource getObject(){
            return this.object!=null?this.object.build():null;
    }

    public KubernetesResource buildObject(){
            return this.object!=null?this.object.build():null;
    }

    public A withObject(KubernetesResource object){
            if (object instanceof Patch){ this.object= new PatchBuilder((Patch)object); _visitables.add(this.object);}
            if (object instanceof DeploymentList){ this.object= new DeploymentListBuilder((DeploymentList)object); _visitables.add(this.object);}
            if (object instanceof ScopeRestriction){ this.object= new ScopeRestrictionBuilder((ScopeRestriction)object); _visitables.add(this.object);}
            if (object instanceof PodsMetricSource){ this.object= new PodsMetricSourceBuilder((PodsMetricSource)object); _visitables.add(this.object);}
            if (object instanceof StepInfo){ this.object= new StepInfoBuilder((StepInfo)object); _visitables.add(this.object);}
            if (object instanceof StatefulSetStatus){ this.object= new StatefulSetStatusBuilder((StatefulSetStatus)object); _visitables.add(this.object);}
            if (object instanceof PodTemplateSpec){ this.object= new PodTemplateSpecBuilder((PodTemplateSpec)object); _visitables.add(this.object);}
            if (object instanceof AuthInfo){ this.object= new AuthInfoBuilder((AuthInfo)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapKeySelector){ this.object= new ConfigMapKeySelectorBuilder((ConfigMapKeySelector)object); _visitables.add(this.object);}
            if (object instanceof RuleWithOperations){ this.object= new RuleWithOperationsBuilder((RuleWithOperations)object); _visitables.add(this.object);}
            if (object instanceof HostPathVolumeSource){ this.object= new HostPathVolumeSourceBuilder((HostPathVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof NamedContext){ this.object= new NamedContextBuilder((NamedContext)object); _visitables.add(this.object);}
            if (object instanceof Config){ this.object= new ConfigBuilder((Config)object); _visitables.add(this.object);}
            if (object instanceof PodPresetSpec){ this.object= new PodPresetSpecBuilder((PodPresetSpec)object); _visitables.add(this.object);}
            if (object instanceof Affinity){ this.object= new AffinityBuilder((Affinity)object); _visitables.add(this.object);}
            if (object instanceof ResourceAttributes){ this.object= new ResourceAttributesBuilder((ResourceAttributes)object); _visitables.add(this.object);}
            if (object instanceof SubjectAccessReviewSpec){ this.object= new SubjectAccessReviewSpecBuilder((SubjectAccessReviewSpec)object); _visitables.add(this.object);}
            if (object instanceof ValidatingWebhookConfiguration){ this.object= new ValidatingWebhookConfigurationBuilder((ValidatingWebhookConfiguration)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.PolicyRule){ this.object= new io.fabric8.openshift.api.model.PolicyRuleBuilder((io.fabric8.openshift.api.model.PolicyRule)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicyEgressRule){ this.object= new NetworkPolicyEgressRuleBuilder((NetworkPolicyEgressRule)object); _visitables.add(this.object);}
            if (object instanceof IPBlock){ this.object= new IPBlockBuilder((IPBlock)object); _visitables.add(this.object);}
            if (object instanceof DeploymentTriggerPolicy){ this.object= new DeploymentTriggerPolicyBuilder((DeploymentTriggerPolicy)object); _visitables.add(this.object);}
            if (object instanceof BuildStrategy){ this.object= new BuildStrategyBuilder((BuildStrategy)object); _visitables.add(this.object);}
            if (object instanceof ServiceReference){ this.object= new ServiceReferenceBuilder((ServiceReference)object); _visitables.add(this.object);}
            if (object instanceof StatefulSetSpec){ this.object= new StatefulSetSpecBuilder((StatefulSetSpec)object); _visitables.add(this.object);}
            if (object instanceof StorageClass){ this.object= new StorageClassBuilder((StorageClass)object); _visitables.add(this.object);}
            if (object instanceof CustomBuildStrategy){ this.object= new CustomBuildStrategyBuilder((CustomBuildStrategy)object); _visitables.add(this.object);}
            if (object instanceof HorizontalPodAutoscalerCondition){ this.object= new HorizontalPodAutoscalerConditionBuilder((HorizontalPodAutoscalerCondition)object); _visitables.add(this.object);}
            if (object instanceof AzureFileVolumeSource){ this.object= new AzureFileVolumeSourceBuilder((AzureFileVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ClusterRoleBinding){ this.object= new ClusterRoleBindingBuilder((ClusterRoleBinding)object); _visitables.add(this.object);}
            if (object instanceof EnvVar){ this.object= new EnvVarBuilder((EnvVar)object); _visitables.add(this.object);}
            if (object instanceof SubjectAccessReviewResponse){ this.object= new SubjectAccessReviewResponseBuilder((SubjectAccessReviewResponse)object); _visitables.add(this.object);}
            if (object instanceof HostPortRange){ this.object= new HostPortRangeBuilder((HostPortRange)object); _visitables.add(this.object);}
            if (object instanceof LoadBalancerIngress){ this.object= new LoadBalancerIngressBuilder((LoadBalancerIngress)object); _visitables.add(this.object);}
            if (object instanceof AttachedVolume){ this.object= new AttachedVolumeBuilder((AttachedVolume)object); _visitables.add(this.object);}
            if (object instanceof LocalObjectReference){ this.object= new LocalObjectReferenceBuilder((LocalObjectReference)object); _visitables.add(this.object);}
            if (object instanceof NamedAuthInfo){ this.object= new NamedAuthInfoBuilder((NamedAuthInfo)object); _visitables.add(this.object);}
            if (object instanceof JobCondition){ this.object= new JobConditionBuilder((JobCondition)object); _visitables.add(this.object);}
            if (object instanceof PodSpec){ this.object= new PodSpecBuilder((PodSpec)object); _visitables.add(this.object);}
            if (object instanceof Preconditions){ this.object= new PreconditionsBuilder((Preconditions)object); _visitables.add(this.object);}
            if (object instanceof TagReferencePolicy){ this.object= new TagReferencePolicyBuilder((TagReferencePolicy)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleBinding){ this.object= new OpenshiftRoleBindingBuilder((OpenshiftRoleBinding)object); _visitables.add(this.object);}
            if (object instanceof CephFSVolumeSource){ this.object= new CephFSVolumeSourceBuilder((CephFSVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof NodeCondition){ this.object= new NodeConditionBuilder((NodeCondition)object); _visitables.add(this.object);}
            if (object instanceof EndpointSubset){ this.object= new EndpointSubsetBuilder((EndpointSubset)object); _visitables.add(this.object);}
            if (object instanceof LocalVolumeSource){ this.object= new LocalVolumeSourceBuilder((LocalVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof CertificateSigningRequestList){ this.object= new CertificateSigningRequestListBuilder((CertificateSigningRequestList)object); _visitables.add(this.object);}
            if (object instanceof PodDisruptionBudget){ this.object= new PodDisruptionBudgetBuilder((PodDisruptionBudget)object); _visitables.add(this.object);}
            if (object instanceof DaemonSetStatus){ this.object= new DaemonSetStatusBuilder((DaemonSetStatus)object); _visitables.add(this.object);}
            if (object instanceof ObjectMetricSource){ this.object= new ObjectMetricSourceBuilder((ObjectMetricSource)object); _visitables.add(this.object);}
            if (object instanceof BuildStatusOutput){ this.object= new BuildStatusOutputBuilder((BuildStatusOutput)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicyPeer){ this.object= new NetworkPolicyPeerBuilder((NetworkPolicyPeer)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapNodeConfigSource){ this.object= new ConfigMapNodeConfigSourceBuilder((ConfigMapNodeConfigSource)object); _visitables.add(this.object);}
            if (object instanceof HTTPGetAction){ this.object= new HTTPGetActionBuilder((HTTPGetAction)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftClusterRoleScopeRestriction){ this.object= new OpenshiftClusterRoleScopeRestrictionBuilder((OpenshiftClusterRoleScopeRestriction)object); _visitables.add(this.object);}
            if (object instanceof GitLabWebHookCause){ this.object= new GitLabWebHookCauseBuilder((GitLabWebHookCause)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicy){ this.object= new NetworkPolicyBuilder((NetworkPolicy)object); _visitables.add(this.object);}
            if (object instanceof SecretBuildSource){ this.object= new SecretBuildSourceBuilder((SecretBuildSource)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftClusterRoleBinding){ this.object= new OpenshiftClusterRoleBindingBuilder((OpenshiftClusterRoleBinding)object); _visitables.add(this.object);}
            if (object instanceof DaemonSetSpec){ this.object= new DaemonSetSpecBuilder((DaemonSetSpec)object); _visitables.add(this.object);}
            if (object instanceof SELinuxStrategyOptions){ this.object= new SELinuxStrategyOptionsBuilder((SELinuxStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof JobStatus){ this.object= new JobStatusBuilder((JobStatus)object); _visitables.add(this.object);}
            if (object instanceof ObjectMetricStatus){ this.object= new ObjectMetricStatusBuilder((ObjectMetricStatus)object); _visitables.add(this.object);}
            if (object instanceof BitbucketWebHookCause){ this.object= new BitbucketWebHookCauseBuilder((BitbucketWebHookCause)object); _visitables.add(this.object);}
            if (object instanceof ProjectList){ this.object= new ProjectListBuilder((ProjectList)object); _visitables.add(this.object);}
            if (object instanceof PodSecurityPolicySpec){ this.object= new PodSecurityPolicySpecBuilder((PodSecurityPolicySpec)object); _visitables.add(this.object);}
            if (object instanceof RoleBindingList){ this.object= new RoleBindingListBuilder((RoleBindingList)object); _visitables.add(this.object);}
            if (object instanceof EnvFromSource){ this.object= new EnvFromSourceBuilder((EnvFromSource)object); _visitables.add(this.object);}
            if (object instanceof NamespaceSpec){ this.object= new NamespaceSpecBuilder((NamespaceSpec)object); _visitables.add(this.object);}
            if (object instanceof Route){ this.object= new RouteBuilder((Route)object); _visitables.add(this.object);}
            if (object instanceof TypeMeta){ this.object= new TypeMetaBuilder((TypeMeta)object); _visitables.add(this.object);}
            if (object instanceof IngressBackend){ this.object= new IngressBackendBuilder((IngressBackend)object); _visitables.add(this.object);}
            if (object instanceof FlexVolumeSource){ this.object= new FlexVolumeSourceBuilder((FlexVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof RBDVolumeSource){ this.object= new RBDVolumeSourceBuilder((RBDVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ResourceQuotaList){ this.object= new ResourceQuotaListBuilder((ResourceQuotaList)object); _visitables.add(this.object);}
            if (object instanceof NodeConfigStatus){ this.object= new NodeConfigStatusBuilder((NodeConfigStatus)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicyList){ this.object= new NetworkPolicyListBuilder((NetworkPolicyList)object); _visitables.add(this.object);}
            if (object instanceof AdmissionResponse){ this.object= new AdmissionResponseBuilder((AdmissionResponse)object); _visitables.add(this.object);}
            if (object instanceof AdmissionRequest){ this.object= new AdmissionRequestBuilder((AdmissionRequest)object); _visitables.add(this.object);}
            if (object instanceof RawExtension){ this.object= new RawExtensionBuilder((RawExtension)object); _visitables.add(this.object);}
            if (object instanceof SecurityContextConstraintsList){ this.object= new SecurityContextConstraintsListBuilder((SecurityContextConstraintsList)object); _visitables.add(this.object);}
            if (object instanceof BuildConfigList){ this.object= new BuildConfigListBuilder((BuildConfigList)object); _visitables.add(this.object);}
            if (object instanceof IdentityList){ this.object= new IdentityListBuilder((IdentityList)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapProjection){ this.object= new ConfigMapProjectionBuilder((ConfigMapProjection)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinitionSpec){ this.object= new CustomResourceDefinitionSpecBuilder((CustomResourceDefinitionSpec)object); _visitables.add(this.object);}
            if (object instanceof Namespace){ this.object= new NamespaceBuilder((Namespace)object); _visitables.add(this.object);}
            if (object instanceof ContainerStateTerminated){ this.object= new ContainerStateTerminatedBuilder((ContainerStateTerminated)object); _visitables.add(this.object);}
            if (object instanceof GroupVersionKind){ this.object= new GroupVersionKindBuilder((GroupVersionKind)object); _visitables.add(this.object);}
            if (object instanceof RunAsUserStrategyOptions){ this.object= new RunAsUserStrategyOptionsBuilder((RunAsUserStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof LimitRangeSpec){ this.object= new LimitRangeSpecBuilder((LimitRangeSpec)object); _visitables.add(this.object);}
            if (object instanceof SourceControlUser){ this.object= new SourceControlUserBuilder((SourceControlUser)object); _visitables.add(this.object);}
            if (object instanceof ContainerState){ this.object= new ContainerStateBuilder((ContainerState)object); _visitables.add(this.object);}
            if (object instanceof UserInfo){ this.object= new UserInfoBuilder((UserInfo)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaimStatus){ this.object= new PersistentVolumeClaimStatusBuilder((PersistentVolumeClaimStatus)object); _visitables.add(this.object);}
            if (object instanceof ServiceSpec){ this.object= new ServiceSpecBuilder((ServiceSpec)object); _visitables.add(this.object);}
            if (object instanceof PhotonPersistentDiskVolumeSource){ this.object= new PhotonPersistentDiskVolumeSourceBuilder((PhotonPersistentDiskVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof IngressRule){ this.object= new IngressRuleBuilder((IngressRule)object); _visitables.add(this.object);}
            if (object instanceof IngressStatus){ this.object= new IngressStatusBuilder((IngressStatus)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamList){ this.object= new ImageStreamListBuilder((ImageStreamList)object); _visitables.add(this.object);}
            if (object instanceof NodeSpec){ this.object= new NodeSpecBuilder((NodeSpec)object); _visitables.add(this.object);}
            if (object instanceof LocalSubjectAccessReview){ this.object= new LocalSubjectAccessReviewBuilder((LocalSubjectAccessReview)object); _visitables.add(this.object);}
            if (object instanceof SecretList){ this.object= new SecretListBuilder((SecretList)object); _visitables.add(this.object);}
            if (object instanceof NodeAddress){ this.object= new NodeAddressBuilder((NodeAddress)object); _visitables.add(this.object);}
            if (object instanceof PodAffinity){ this.object= new PodAffinityBuilder((PodAffinity)object); _visitables.add(this.object);}
            if (object instanceof HorizontalPodAutoscalerList){ this.object= new HorizontalPodAutoscalerListBuilder((HorizontalPodAutoscalerList)object); _visitables.add(this.object);}
            if (object instanceof Service){ this.object= new ServiceBuilder((Service)object); _visitables.add(this.object);}
            if (object instanceof ExecEnvVar){ this.object= new ExecEnvVarBuilder((ExecEnvVar)object); _visitables.add(this.object);}
            if (object instanceof DeploymentStatus){ this.object= new DeploymentStatusBuilder((DeploymentStatus)object); _visitables.add(this.object);}
            if (object instanceof EventSeries){ this.object= new EventSeriesBuilder((EventSeries)object); _visitables.add(this.object);}
            if (object instanceof Initializers){ this.object= new InitializersBuilder((Initializers)object); _visitables.add(this.object);}
            if (object instanceof ContainerImage){ this.object= new ContainerImageBuilder((ContainerImage)object); _visitables.add(this.object);}
            if (object instanceof NodeStatus){ this.object= new NodeStatusBuilder((NodeStatus)object); _visitables.add(this.object);}
            if (object instanceof ReplicationController){ this.object= new ReplicationControllerBuilder((ReplicationController)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapList){ this.object= new ConfigMapListBuilder((ConfigMapList)object); _visitables.add(this.object);}
            if (object instanceof SubjectAccessReview){ this.object= new SubjectAccessReviewBuilder((SubjectAccessReview)object); _visitables.add(this.object);}
            if (object instanceof PreferredSchedulingTerm){ this.object= new PreferredSchedulingTermBuilder((PreferredSchedulingTerm)object); _visitables.add(this.object);}
            if (object instanceof ExternalDocumentation){ this.object= new ExternalDocumentationBuilder((ExternalDocumentation)object); _visitables.add(this.object);}
            if (object instanceof ImageLookupPolicy){ this.object= new ImageLookupPolicyBuilder((ImageLookupPolicy)object); _visitables.add(this.object);}
            if (object instanceof MutatingWebhookConfigurationList){ this.object= new MutatingWebhookConfigurationListBuilder((MutatingWebhookConfigurationList)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.AllowedFlexVolume){ this.object= new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder((io.fabric8.openshift.api.model.AllowedFlexVolume)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.SubjectAccessReview){ this.object= new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder((io.fabric8.openshift.api.model.SubjectAccessReview)object); _visitables.add(this.object);}
            if (object instanceof PodPresetList){ this.object= new PodPresetListBuilder((PodPresetList)object); _visitables.add(this.object);}
            if (object instanceof MutatingWebhookConfiguration){ this.object= new MutatingWebhookConfigurationBuilder((MutatingWebhookConfiguration)object); _visitables.add(this.object);}
            if (object instanceof VolumeMount){ this.object= new VolumeMountBuilder((VolumeMount)object); _visitables.add(this.object);}
            if (object instanceof LabelSelector){ this.object= new LabelSelectorBuilder((LabelSelector)object); _visitables.add(this.object);}
            if (object instanceof CronJobStatus){ this.object= new CronJobStatusBuilder((CronJobStatus)object); _visitables.add(this.object);}
            if (object instanceof BuildSpec){ this.object= new BuildSpecBuilder((BuildSpec)object); _visitables.add(this.object);}
            if (object instanceof StatusCause){ this.object= new StatusCauseBuilder((StatusCause)object); _visitables.add(this.object);}
            if (object instanceof ProjectStatus){ this.object= new ProjectStatusBuilder((ProjectStatus)object); _visitables.add(this.object);}
            if (object instanceof NamedCluster){ this.object= new NamedClusterBuilder((NamedCluster)object); _visitables.add(this.object);}
            if (object instanceof GitSourceRevision){ this.object= new GitSourceRevisionBuilder((GitSourceRevision)object); _visitables.add(this.object);}
            if (object instanceof StatusDetails){ this.object= new StatusDetailsBuilder((StatusDetails)object); _visitables.add(this.object);}
            if (object instanceof ImageChangeTrigger){ this.object= new ImageChangeTriggerBuilder((ImageChangeTrigger)object); _visitables.add(this.object);}
            if (object instanceof Sysctl){ this.object= new SysctlBuilder((Sysctl)object); _visitables.add(this.object);}
            if (object instanceof HorizontalPodAutoscaler){ this.object= new HorizontalPodAutoscalerBuilder((HorizontalPodAutoscaler)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamImportSpec){ this.object= new ImageStreamImportSpecBuilder((ImageStreamImportSpec)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.FSGroupStrategyOptions){ this.object= new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder((io.fabric8.openshift.api.model.FSGroupStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof Scale){ this.object= new ScaleBuilder((Scale)object); _visitables.add(this.object);}
            if (object instanceof Status){ this.object= new StatusBuilder((Status)object); _visitables.add(this.object);}
            if (object instanceof DeleteOptions){ this.object= new DeleteOptionsBuilder((DeleteOptions)object); _visitables.add(this.object);}
            if (object instanceof ContainerStatus){ this.object= new ContainerStatusBuilder((ContainerStatus)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapEnvSource){ this.object= new ConfigMapEnvSourceBuilder((ConfigMapEnvSource)object); _visitables.add(this.object);}
            if (object instanceof DeploymentSpec){ this.object= new DeploymentSpecBuilder((DeploymentSpec)object); _visitables.add(this.object);}
            if (object instanceof CertificateSigningRequestStatus){ this.object= new CertificateSigningRequestStatusBuilder((CertificateSigningRequestStatus)object); _visitables.add(this.object);}
            if (object instanceof NodeSelectorRequirement){ this.object= new NodeSelectorRequirementBuilder((NodeSelectorRequirement)object); _visitables.add(this.object);}
            if (object instanceof RecreateDeploymentStrategyParams){ this.object= new RecreateDeploymentStrategyParamsBuilder((RecreateDeploymentStrategyParams)object); _visitables.add(this.object);}
            if (object instanceof DockerStrategyOptions){ this.object= new DockerStrategyOptionsBuilder((DockerStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof ImageList){ this.object= new ImageListBuilder((ImageList)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapBuildSource){ this.object= new ConfigMapBuildSourceBuilder((ConfigMapBuildSource)object); _visitables.add(this.object);}
            if (object instanceof ReplicaSetList){ this.object= new ReplicaSetListBuilder((ReplicaSetList)object); _visitables.add(this.object);}
            if (object instanceof PodTemplateList){ this.object= new PodTemplateListBuilder((PodTemplateList)object); _visitables.add(this.object);}
            if (object instanceof Image){ this.object= new ImageBuilder((Image)object); _visitables.add(this.object);}
            if (object instanceof TLSConfig){ this.object= new TLSConfigBuilder((TLSConfig)object); _visitables.add(this.object);}
            if (object instanceof EndpointAddress){ this.object= new EndpointAddressBuilder((EndpointAddress)object); _visitables.add(this.object);}
            if (object instanceof BuildStatus){ this.object= new BuildStatusBuilder((BuildStatus)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinitionCondition){ this.object= new CustomResourceDefinitionConditionBuilder((CustomResourceDefinitionCondition)object); _visitables.add(this.object);}
            if (object instanceof NodeConfigSource){ this.object= new NodeConfigSourceBuilder((NodeConfigSource)object); _visitables.add(this.object);}
            if (object instanceof ImageSource){ this.object= new ImageSourceBuilder((ImageSource)object); _visitables.add(this.object);}
            if (object instanceof VsphereVirtualDiskVolumeSource){ this.object= new VsphereVirtualDiskVolumeSourceBuilder((VsphereVirtualDiskVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof Rule){ this.object= new RuleBuilder((Rule)object); _visitables.add(this.object);}
            if (object instanceof TagReference){ this.object= new TagReferenceBuilder((TagReference)object); _visitables.add(this.object);}
            if (object instanceof CrossVersionObjectReference){ this.object= new CrossVersionObjectReferenceBuilder((CrossVersionObjectReference)object); _visitables.add(this.object);}
            if (object instanceof LabelSelectorRequirement){ this.object= new LabelSelectorRequirementBuilder((LabelSelectorRequirement)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceSubresources){ this.object= new CustomResourceSubresourcesBuilder((CustomResourceSubresources)object); _visitables.add(this.object);}
            if (object instanceof DaemonSetUpdateStrategy){ this.object= new DaemonSetUpdateStrategyBuilder((DaemonSetUpdateStrategy)object); _visitables.add(this.object);}
            if (object instanceof ReplicaSet){ this.object= new ReplicaSetBuilder((ReplicaSet)object); _visitables.add(this.object);}
            if (object instanceof GitRepoVolumeSource){ this.object= new GitRepoVolumeSourceBuilder((GitRepoVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof AggregationRule){ this.object= new AggregationRuleBuilder((AggregationRule)object); _visitables.add(this.object);}
            if (object instanceof EndpointsList){ this.object= new EndpointsListBuilder((EndpointsList)object); _visitables.add(this.object);}
            if (object instanceof GroupVersionResource){ this.object= new GroupVersionResourceBuilder((GroupVersionResource)object); _visitables.add(this.object);}
            if (object instanceof BuildSource){ this.object= new BuildSourceBuilder((BuildSource)object); _visitables.add(this.object);}
            if (object instanceof PodSecurityPolicy){ this.object= new PodSecurityPolicyBuilder((PodSecurityPolicy)object); _visitables.add(this.object);}
            if (object instanceof CronJob){ this.object= new CronJobBuilder((CronJob)object); _visitables.add(this.object);}
            if (object instanceof TopologySelectorTerm){ this.object= new TopologySelectorTermBuilder((TopologySelectorTerm)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceSubresourceScale){ this.object= new CustomResourceSubresourceScaleBuilder((CustomResourceSubresourceScale)object); _visitables.add(this.object);}
            if (object instanceof StorageOSPersistentVolumeSource){ this.object= new StorageOSPersistentVolumeSourceBuilder((StorageOSPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof CertificateSigningRequestSpec){ this.object= new CertificateSigningRequestSpecBuilder((CertificateSigningRequestSpec)object); _visitables.add(this.object);}
            if (object instanceof SecurityContext){ this.object= new SecurityContextBuilder((SecurityContext)object); _visitables.add(this.object);}
            if (object instanceof ConfigMapVolumeSource){ this.object= new ConfigMapVolumeSourceBuilder((ConfigMapVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ComponentStatusList){ this.object= new ComponentStatusListBuilder((ComponentStatusList)object); _visitables.add(this.object);}
            if (object instanceof GitBuildSource){ this.object= new GitBuildSourceBuilder((GitBuildSource)object); _visitables.add(this.object);}
            if (object instanceof FlockerVolumeSource){ this.object= new FlockerVolumeSourceBuilder((FlockerVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ScaleIOVolumeSource){ this.object= new ScaleIOVolumeSourceBuilder((ScaleIOVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof LimitRangeList){ this.object= new LimitRangeListBuilder((LimitRangeList)object); _visitables.add(this.object);}
            if (object instanceof Probe){ this.object= new ProbeBuilder((Probe)object); _visitables.add(this.object);}
            if (object instanceof ImageSourcePath){ this.object= new ImageSourcePathBuilder((ImageSourcePath)object); _visitables.add(this.object);}
            if (object instanceof Endpoints){ this.object= new EndpointsBuilder((Endpoints)object); _visitables.add(this.object);}
            if (object instanceof BuildConfigStatus){ this.object= new BuildConfigStatusBuilder((BuildConfigStatus)object); _visitables.add(this.object);}
            if (object instanceof Parameter){ this.object= new ParameterBuilder((Parameter)object); _visitables.add(this.object);}
            if (object instanceof SecretVolumeSource){ this.object= new SecretVolumeSourceBuilder((SecretVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof Pod){ this.object= new PodBuilder((Pod)object); _visitables.add(this.object);}
            if (object instanceof ClientIPConfig){ this.object= new ClientIPConfigBuilder((ClientIPConfig)object); _visitables.add(this.object);}
            if (object instanceof Context){ this.object= new ContextBuilder((Context)object); _visitables.add(this.object);}
            if (object instanceof NodeAffinity){ this.object= new NodeAffinityBuilder((NodeAffinity)object); _visitables.add(this.object);}
            if (object instanceof ConfigMap){ this.object= new ConfigMapBuilder((ConfigMap)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinition){ this.object= new CustomResourceDefinitionBuilder((CustomResourceDefinition)object); _visitables.add(this.object);}
            if (object instanceof FCVolumeSource){ this.object= new FCVolumeSourceBuilder((FCVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinitionStatus){ this.object= new CustomResourceDefinitionStatusBuilder((CustomResourceDefinitionStatus)object); _visitables.add(this.object);}
            if (object instanceof JobList){ this.object= new JobListBuilder((JobList)object); _visitables.add(this.object);}
            if (object instanceof OAuthAuthorizeTokenList){ this.object= new OAuthAuthorizeTokenListBuilder((OAuthAuthorizeTokenList)object); _visitables.add(this.object);}
            if (object instanceof JSONSchemaPropsOrStringArray){ this.object= new JSONSchemaPropsOrStringArrayBuilder((JSONSchemaPropsOrStringArray)object); _visitables.add(this.object);}
            if (object instanceof CustomDeploymentStrategyParams){ this.object= new CustomDeploymentStrategyParamsBuilder((CustomDeploymentStrategyParams)object); _visitables.add(this.object);}
            if (object instanceof ImageImportSpec){ this.object= new ImageImportSpecBuilder((ImageImportSpec)object); _visitables.add(this.object);}
            if (object instanceof PodSecurityContext){ this.object= new PodSecurityContextBuilder((PodSecurityContext)object); _visitables.add(this.object);}
            if (object instanceof DownwardAPIProjection){ this.object= new DownwardAPIProjectionBuilder((DownwardAPIProjection)object); _visitables.add(this.object);}
            if (object instanceof PodAffinityTerm){ this.object= new PodAffinityTermBuilder((PodAffinityTerm)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.IDRange){ this.object= new io.fabric8.openshift.api.model.IDRangeBuilder((io.fabric8.openshift.api.model.IDRange)object); _visitables.add(this.object);}
            if (object instanceof BuildConfigSpec){ this.object= new BuildConfigSpecBuilder((BuildConfigSpec)object); _visitables.add(this.object);}
            if (object instanceof NonResourceAttributes){ this.object= new NonResourceAttributesBuilder((NonResourceAttributes)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaimVolumeSource){ this.object= new PersistentVolumeClaimVolumeSourceBuilder((PersistentVolumeClaimVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof SubjectAccessReviewStatus){ this.object= new SubjectAccessReviewStatusBuilder((SubjectAccessReviewStatus)object); _visitables.add(this.object);}
            if (object instanceof WebHookTrigger){ this.object= new WebHookTriggerBuilder((WebHookTrigger)object); _visitables.add(this.object);}
            if (object instanceof ServiceAccountReference){ this.object= new ServiceAccountReferenceBuilder((ServiceAccountReference)object); _visitables.add(this.object);}
            if (object instanceof Build){ this.object= new BuildBuilder((Build)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinitionList){ this.object= new CustomResourceDefinitionListBuilder((CustomResourceDefinitionList)object); _visitables.add(this.object);}
            if (object instanceof AllowedFlexVolume){ this.object= new AllowedFlexVolumeBuilder((AllowedFlexVolume)object); _visitables.add(this.object);}
            if (object instanceof ResourceMetricStatus){ this.object= new ResourceMetricStatusBuilder((ResourceMetricStatus)object); _visitables.add(this.object);}
            if (object instanceof TagImportPolicy){ this.object= new TagImportPolicyBuilder((TagImportPolicy)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamTag){ this.object= new ImageStreamTagBuilder((ImageStreamTag)object); _visitables.add(this.object);}
            if (object instanceof KeyToPath){ this.object= new KeyToPathBuilder((KeyToPath)object); _visitables.add(this.object);}
            if (object instanceof StatefulSetCondition){ this.object= new StatefulSetConditionBuilder((StatefulSetCondition)object); _visitables.add(this.object);}
            if (object instanceof RoutePort){ this.object= new RoutePortBuilder((RoutePort)object); _visitables.add(this.object);}
            if (object instanceof JSONSchemaPropsOrBool){ this.object= new JSONSchemaPropsOrBoolBuilder((JSONSchemaPropsOrBool)object); _visitables.add(this.object);}
            if (object instanceof FlexPersistentVolumeSource){ this.object= new FlexPersistentVolumeSourceBuilder((FlexPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof Group){ this.object= new GroupBuilder((Group)object); _visitables.add(this.object);}
            if (object instanceof BuildTriggerCause){ this.object= new BuildTriggerCauseBuilder((BuildTriggerCause)object); _visitables.add(this.object);}
            if (object instanceof NamespaceList){ this.object= new NamespaceListBuilder((NamespaceList)object); _visitables.add(this.object);}
            if (object instanceof PodDisruptionBudgetStatus){ this.object= new PodDisruptionBudgetStatusBuilder((PodDisruptionBudgetStatus)object); _visitables.add(this.object);}
            if (object instanceof PodDNSConfig){ this.object= new PodDNSConfigBuilder((PodDNSConfig)object); _visitables.add(this.object);}
            if (object instanceof NodeList){ this.object= new NodeListBuilder((NodeList)object); _visitables.add(this.object);}
            if (object instanceof HorizontalPodAutoscalerSpec){ this.object= new HorizontalPodAutoscalerSpecBuilder((HorizontalPodAutoscalerSpec)object); _visitables.add(this.object);}
            if (object instanceof ImageSignature){ this.object= new ImageSignatureBuilder((ImageSignature)object); _visitables.add(this.object);}
            if (object instanceof EnvVarSource){ this.object= new EnvVarSourceBuilder((EnvVarSource)object); _visitables.add(this.object);}
            if (object instanceof VolumeProjection){ this.object= new VolumeProjectionBuilder((VolumeProjection)object); _visitables.add(this.object);}
            if (object instanceof ResourceQuota){ this.object= new ResourceQuotaBuilder((ResourceQuota)object); _visitables.add(this.object);}
            if (object instanceof DeploymentStrategy){ this.object= new DeploymentStrategyBuilder((DeploymentStrategy)object); _visitables.add(this.object);}
            if (object instanceof OAuthAccessTokenList){ this.object= new OAuthAccessTokenListBuilder((OAuthAccessTokenList)object); _visitables.add(this.object);}
            if (object instanceof NodeSelectorTerm){ this.object= new NodeSelectorTermBuilder((NodeSelectorTerm)object); _visitables.add(this.object);}
            if (object instanceof ScaleIOPersistentVolumeSource){ this.object= new ScaleIOPersistentVolumeSourceBuilder((ScaleIOPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions){ this.object= new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder((io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof WeightedPodAffinityTerm){ this.object= new WeightedPodAffinityTermBuilder((WeightedPodAffinityTerm)object); _visitables.add(this.object);}
            if (object instanceof RollingUpdateStatefulSetStrategy){ this.object= new RollingUpdateStatefulSetStrategyBuilder((RollingUpdateStatefulSetStrategy)object); _visitables.add(this.object);}
            if (object instanceof BuildRequest){ this.object= new BuildRequestBuilder((BuildRequest)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.kubernetes.api.model.apiextensions.ServiceReference){ this.object= new io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceBuilder((io.fabric8.kubernetes.api.model.apiextensions.ServiceReference)object); _visitables.add(this.object);}
            if (object instanceof NodeSystemInfo){ this.object= new NodeSystemInfoBuilder((NodeSystemInfo)object); _visitables.add(this.object);}
            if (object instanceof RouteList){ this.object= new RouteListBuilder((RouteList)object); _visitables.add(this.object);}
            if (object instanceof AuthProviderConfig){ this.object= new AuthProviderConfigBuilder((AuthProviderConfig)object); _visitables.add(this.object);}
            if (object instanceof VolumeDevice){ this.object= new VolumeDeviceBuilder((VolumeDevice)object); _visitables.add(this.object);}
            if (object instanceof DaemonSet){ this.object= new DaemonSetBuilder((DaemonSet)object); _visitables.add(this.object);}
            if (object instanceof TokenReviewSpec){ this.object= new TokenReviewSpecBuilder((TokenReviewSpec)object); _visitables.add(this.object);}
            if (object instanceof DeploymentDetails){ this.object= new DeploymentDetailsBuilder((DeploymentDetails)object); _visitables.add(this.object);}
            if (object instanceof Volume){ this.object= new VolumeBuilder((Volume)object); _visitables.add(this.object);}
            if (object instanceof KubernetesRunAsUserStrategyOptions){ this.object= new KubernetesRunAsUserStrategyOptionsBuilder((KubernetesRunAsUserStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof NFSVolumeSource){ this.object= new NFSVolumeSourceBuilder((NFSVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof DeploymentCondition){ this.object= new DeploymentConditionBuilder((DeploymentCondition)object); _visitables.add(this.object);}
            if (object instanceof Cluster){ this.object= new ClusterBuilder((Cluster)object); _visitables.add(this.object);}
            if (object instanceof ImageStream){ this.object= new ImageStreamBuilder((ImageStream)object); _visitables.add(this.object);}
            if (object instanceof StorageOSVolumeSource){ this.object= new StorageOSVolumeSourceBuilder((StorageOSVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof BuildList){ this.object= new BuildListBuilder((BuildList)object); _visitables.add(this.object);}
            if (object instanceof TemplateList){ this.object= new TemplateListBuilder((TemplateList)object); _visitables.add(this.object);}
            if (object instanceof KubernetesList){ this.object= new KubernetesListBuilder((KubernetesList)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinitionVersion){ this.object= new CustomResourceDefinitionVersionBuilder((CustomResourceDefinitionVersion)object); _visitables.add(this.object);}
            if (object instanceof ProjectSpec){ this.object= new ProjectSpecBuilder((ProjectSpec)object); _visitables.add(this.object);}
            if (object instanceof HTTPHeader){ this.object= new HTTPHeaderBuilder((HTTPHeader)object); _visitables.add(this.object);}
            if (object instanceof Capabilities){ this.object= new CapabilitiesBuilder((Capabilities)object); _visitables.add(this.object);}
            if (object instanceof ObjectReference){ this.object= new ObjectReferenceBuilder((ObjectReference)object); _visitables.add(this.object);}
            if (object instanceof WatchEvent){ this.object= new WatchEventBuilder((WatchEvent)object); _visitables.add(this.object);}
            if (object instanceof SignatureIssuer){ this.object= new SignatureIssuerBuilder((SignatureIssuer)object); _visitables.add(this.object);}
            if (object instanceof ImageLayer){ this.object= new ImageLayerBuilder((ImageLayer)object); _visitables.add(this.object);}
            if (object instanceof SecretProjection){ this.object= new SecretProjectionBuilder((SecretProjection)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig){ this.object= new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder((io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig)object); _visitables.add(this.object);}
            if (object instanceof GlusterfsVolumeSource){ this.object= new GlusterfsVolumeSourceBuilder((GlusterfsVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof NamespaceStatus){ this.object= new NamespaceStatusBuilder((NamespaceStatus)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRole){ this.object= new OpenshiftRoleBuilder((OpenshiftRole)object); _visitables.add(this.object);}
            if (object instanceof CronJobSpec){ this.object= new CronJobSpecBuilder((CronJobSpec)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceColumnDefinition){ this.object= new CustomResourceColumnDefinitionBuilder((CustomResourceColumnDefinition)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamSpec){ this.object= new ImageStreamSpecBuilder((ImageStreamSpec)object); _visitables.add(this.object);}
            if (object instanceof SecretEnvSource){ this.object= new SecretEnvSourceBuilder((SecretEnvSource)object); _visitables.add(this.object);}
            if (object instanceof OAuthClient){ this.object= new OAuthClientBuilder((OAuthClient)object); _visitables.add(this.object);}
            if (object instanceof Identity){ this.object= new IdentityBuilder((Identity)object); _visitables.add(this.object);}
            if (object instanceof AWSElasticBlockStoreVolumeSource){ this.object= new AWSElasticBlockStoreVolumeSourceBuilder((AWSElasticBlockStoreVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof MetricStatus){ this.object= new MetricStatusBuilder((MetricStatus)object); _visitables.add(this.object);}
            if (object instanceof GenericWebHookCause){ this.object= new GenericWebHookCauseBuilder((GenericWebHookCause)object); _visitables.add(this.object);}
            if (object instanceof ServiceAccountRestriction){ this.object= new ServiceAccountRestrictionBuilder((ServiceAccountRestriction)object); _visitables.add(this.object);}
            if (object instanceof LimitRange){ this.object= new LimitRangeBuilder((LimitRange)object); _visitables.add(this.object);}
            if (object instanceof SecretLocalReference){ this.object= new SecretLocalReferenceBuilder((SecretLocalReference)object); _visitables.add(this.object);}
            if (object instanceof IDRange){ this.object= new IDRangeBuilder((IDRange)object); _visitables.add(this.object);}
            if (object instanceof UserRestriction){ this.object= new UserRestrictionBuilder((UserRestriction)object); _visitables.add(this.object);}
            if (object instanceof CSIPersistentVolumeSource){ this.object= new CSIPersistentVolumeSourceBuilder((CSIPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamImport){ this.object= new ImageStreamImportBuilder((ImageStreamImport)object); _visitables.add(this.object);}
            if (object instanceof ReplicaSetSpec){ this.object= new ReplicaSetSpecBuilder((ReplicaSetSpec)object); _visitables.add(this.object);}
            if (object instanceof ResourceRequirements){ this.object= new ResourceRequirementsBuilder((ResourceRequirements)object); _visitables.add(this.object);}
            if (object instanceof ExternalMetricSource){ this.object= new ExternalMetricSourceBuilder((ExternalMetricSource)object); _visitables.add(this.object);}
            if (object instanceof GitHubWebHookCause){ this.object= new GitHubWebHookCauseBuilder((GitHubWebHookCause)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaimList){ this.object= new PersistentVolumeClaimListBuilder((PersistentVolumeClaimList)object); _visitables.add(this.object);}
            if (object instanceof OAuthClientList){ this.object= new OAuthClientListBuilder((OAuthClientList)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleBindingList){ this.object= new OpenshiftRoleBindingListBuilder((OpenshiftRoleBindingList)object); _visitables.add(this.object);}
            if (object instanceof ResourceMetricSource){ this.object= new ResourceMetricSourceBuilder((ResourceMetricSource)object); _visitables.add(this.object);}
            if (object instanceof ReplicationControllerStatus){ this.object= new ReplicationControllerStatusBuilder((ReplicationControllerStatus)object); _visitables.add(this.object);}
            if (object instanceof IngressList){ this.object= new IngressListBuilder((IngressList)object); _visitables.add(this.object);}
            if (object instanceof MicroTime){ this.object= new MicroTimeBuilder((MicroTime)object); _visitables.add(this.object);}
            if (object instanceof ValidatingWebhookConfigurationList){ this.object= new ValidatingWebhookConfigurationListBuilder((ValidatingWebhookConfigurationList)object); _visitables.add(this.object);}
            if (object instanceof PolicyRule){ this.object= new PolicyRuleBuilder((PolicyRule)object); _visitables.add(this.object);}
            if (object instanceof Lifecycle){ this.object= new LifecycleBuilder((Lifecycle)object); _visitables.add(this.object);}
            if (object instanceof RepositoryImportSpec){ this.object= new RepositoryImportSpecBuilder((RepositoryImportSpec)object); _visitables.add(this.object);}
            if (object instanceof PortworxVolumeSource){ this.object= new PortworxVolumeSourceBuilder((PortworxVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof EventSource){ this.object= new EventSourceBuilder((EventSource)object); _visitables.add(this.object);}
            if (object instanceof Initializer){ this.object= new InitializerBuilder((Initializer)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamImportStatus){ this.object= new ImageStreamImportStatusBuilder((ImageStreamImportStatus)object); _visitables.add(this.object);}
            if (object instanceof HTTPIngressRuleValue){ this.object= new HTTPIngressRuleValueBuilder((HTTPIngressRuleValue)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleBindingRestriction){ this.object= new OpenshiftRoleBindingRestrictionBuilder((OpenshiftRoleBindingRestriction)object); _visitables.add(this.object);}
            if (object instanceof ComponentCondition){ this.object= new ComponentConditionBuilder((ComponentCondition)object); _visitables.add(this.object);}
            if (object instanceof ReplicationControllerSpec){ this.object= new ReplicationControllerSpecBuilder((ReplicationControllerSpec)object); _visitables.add(this.object);}
            if (object instanceof WebhookClientConfig){ this.object= new WebhookClientConfigBuilder((WebhookClientConfig)object); _visitables.add(this.object);}
            if (object instanceof DeploymentTriggerImageChangeParams){ this.object= new DeploymentTriggerImageChangeParamsBuilder((DeploymentTriggerImageChangeParams)object); _visitables.add(this.object);}
            if (object instanceof RoleBinding){ this.object= new RoleBindingBuilder((RoleBinding)object); _visitables.add(this.object);}
            if (object instanceof PodPreset){ this.object= new PodPresetBuilder((PodPreset)object); _visitables.add(this.object);}
            if (object instanceof RollingUpdateDeployment){ this.object= new RollingUpdateDeploymentBuilder((RollingUpdateDeployment)object); _visitables.add(this.object);}
            if (object instanceof EmptyDirVolumeSource){ this.object= new EmptyDirVolumeSourceBuilder((EmptyDirVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof TagImageHook){ this.object= new TagImageHookBuilder((TagImageHook)object); _visitables.add(this.object);}
            if (object instanceof RouteTargetReference){ this.object= new RouteTargetReferenceBuilder((RouteTargetReference)object); _visitables.add(this.object);}
            if (object instanceof AzureDiskVolumeSource){ this.object= new AzureDiskVolumeSourceBuilder((AzureDiskVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof Project){ this.object= new ProjectBuilder((Project)object); _visitables.add(this.object);}
            if (object instanceof Info){ this.object= new InfoBuilder((Info)object); _visitables.add(this.object);}
            if (object instanceof ServiceStatus){ this.object= new ServiceStatusBuilder((ServiceStatus)object); _visitables.add(this.object);}
            if (object instanceof Taint){ this.object= new TaintBuilder((Taint)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleBindingRestrictionSpec){ this.object= new OpenshiftRoleBindingRestrictionSpecBuilder((OpenshiftRoleBindingRestrictionSpec)object); _visitables.add(this.object);}
            if (object instanceof AllowedHostPath){ this.object= new AllowedHostPathBuilder((AllowedHostPath)object); _visitables.add(this.object);}
            if (object instanceof DeploymentConfigList){ this.object= new DeploymentConfigListBuilder((DeploymentConfigList)object); _visitables.add(this.object);}
            if (object instanceof BuildConfig){ this.object= new BuildConfigBuilder((BuildConfig)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceConversion){ this.object= new CustomResourceConversionBuilder((CustomResourceConversion)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceDefinitionNames){ this.object= new CustomResourceDefinitionNamesBuilder((CustomResourceDefinitionNames)object); _visitables.add(this.object);}
            if (object instanceof ImageImportStatus){ this.object= new ImageImportStatusBuilder((ImageImportStatus)object); _visitables.add(this.object);}
            if (object instanceof IngressTLS){ this.object= new IngressTLSBuilder((IngressTLS)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceValidation){ this.object= new CustomResourceValidationBuilder((CustomResourceValidation)object); _visitables.add(this.object);}
            if (object instanceof PodDisruptionBudgetList){ this.object= new PodDisruptionBudgetListBuilder((PodDisruptionBudgetList)object); _visitables.add(this.object);}
            if (object instanceof DeploymentConfigStatus){ this.object= new DeploymentConfigStatusBuilder((DeploymentConfigStatus)object); _visitables.add(this.object);}
            if (object instanceof GlusterfsPersistentVolumeSource){ this.object= new GlusterfsPersistentVolumeSourceBuilder((GlusterfsPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ClusterRole){ this.object= new ClusterRoleBuilder((ClusterRole)object); _visitables.add(this.object);}
            if (object instanceof ClusterRoleBindingList){ this.object= new ClusterRoleBindingListBuilder((ClusterRoleBindingList)object); _visitables.add(this.object);}
            if (object instanceof TokenReviewStatus){ this.object= new TokenReviewStatusBuilder((TokenReviewStatus)object); _visitables.add(this.object);}
            if (object instanceof TagEvent){ this.object= new TagEventBuilder((TagEvent)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamTagList){ this.object= new ImageStreamTagListBuilder((ImageStreamTagList)object); _visitables.add(this.object);}
            if (object instanceof CustomResourceSubresourceStatus){ this.object= new CustomResourceSubresourceStatusBuilder((CustomResourceSubresourceStatus)object); _visitables.add(this.object);}
            if (object instanceof ISCSIPersistentVolumeSource){ this.object= new ISCSIPersistentVolumeSourceBuilder((ISCSIPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof DownwardAPIVolumeSource){ this.object= new DownwardAPIVolumeSourceBuilder((DownwardAPIVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ListMeta){ this.object= new ListMetaBuilder((ListMeta)object); _visitables.add(this.object);}
            if (object instanceof RootPaths){ this.object= new RootPathsBuilder((RootPaths)object); _visitables.add(this.object);}
            if (object instanceof SecretReference){ this.object= new SecretReferenceBuilder((SecretReference)object); _visitables.add(this.object);}
            if (object instanceof SourceStrategyOptions){ this.object= new SourceStrategyOptionsBuilder((SourceStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof ISCSIVolumeSource){ this.object= new ISCSIVolumeSourceBuilder((ISCSIVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof SecretKeySelector){ this.object= new SecretKeySelectorBuilder((SecretKeySelector)object); _visitables.add(this.object);}
            if (object instanceof OAuthAuthorizeToken){ this.object= new OAuthAuthorizeTokenBuilder((OAuthAuthorizeToken)object); _visitables.add(this.object);}
            if (object instanceof QuobyteVolumeSource){ this.object= new QuobyteVolumeSourceBuilder((QuobyteVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof DockerBuildStrategy){ this.object= new DockerBuildStrategyBuilder((DockerBuildStrategy)object); _visitables.add(this.object);}
            if (object instanceof SignatureCondition){ this.object= new SignatureConditionBuilder((SignatureCondition)object); _visitables.add(this.object);}
            if (object instanceof JobSpec){ this.object= new JobSpecBuilder((JobSpec)object); _visitables.add(this.object);}
            if (object instanceof ResourceQuotaStatus){ this.object= new ResourceQuotaStatusBuilder((ResourceQuotaStatus)object); _visitables.add(this.object);}
            if (object instanceof ExternalMetricStatus){ this.object= new ExternalMetricStatusBuilder((ExternalMetricStatus)object); _visitables.add(this.object);}
            if (object instanceof ScopedResourceSelectorRequirement){ this.object= new ScopedResourceSelectorRequirementBuilder((ScopedResourceSelectorRequirement)object); _visitables.add(this.object);}
            if (object instanceof DeploymentCause){ this.object= new DeploymentCauseBuilder((DeploymentCause)object); _visitables.add(this.object);}
            if (object instanceof RepositoryImportStatus){ this.object= new RepositoryImportStatusBuilder((RepositoryImportStatus)object); _visitables.add(this.object);}
            if (object instanceof GroupList){ this.object= new GroupListBuilder((GroupList)object); _visitables.add(this.object);}
            if (object instanceof ProjectedVolumeSource){ this.object= new ProjectedVolumeSourceBuilder((ProjectedVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof LifecycleHook){ this.object= new LifecycleHookBuilder((LifecycleHook)object); _visitables.add(this.object);}
            if (object instanceof Handler){ this.object= new HandlerBuilder((Handler)object); _visitables.add(this.object);}
            if (object instanceof ServiceAccountTokenProjection){ this.object= new ServiceAccountTokenProjectionBuilder((ServiceAccountTokenProjection)object); _visitables.add(this.object);}
            if (object instanceof Container){ this.object= new ContainerBuilder((Container)object); _visitables.add(this.object);}
            if (object instanceof TypedLocalObjectReference){ this.object= new TypedLocalObjectReferenceBuilder((TypedLocalObjectReference)object); _visitables.add(this.object);}
            if (object instanceof SupplementalGroupsStrategyOptions){ this.object= new SupplementalGroupsStrategyOptionsBuilder((SupplementalGroupsStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof CronJobList){ this.object= new CronJobListBuilder((CronJobList)object); _visitables.add(this.object);}
            if (object instanceof RollbackConfig){ this.object= new RollbackConfigBuilder((RollbackConfig)object); _visitables.add(this.object);}
            if (object instanceof RouteStatus){ this.object= new RouteStatusBuilder((RouteStatus)object); _visitables.add(this.object);}
            if (object instanceof PodCondition){ this.object= new PodConditionBuilder((PodCondition)object); _visitables.add(this.object);}
            if (object instanceof DaemonSetCondition){ this.object= new DaemonSetConditionBuilder((DaemonSetCondition)object); _visitables.add(this.object);}
            if (object instanceof DeploymentRollback){ this.object= new DeploymentRollbackBuilder((DeploymentRollback)object); _visitables.add(this.object);}
            if (object instanceof ExecAction){ this.object= new ExecActionBuilder((ExecAction)object); _visitables.add(this.object);}
            if (object instanceof NamedTagEventList){ this.object= new NamedTagEventListBuilder((NamedTagEventList)object); _visitables.add(this.object);}
            if (object instanceof Toleration){ this.object= new TolerationBuilder((Toleration)object); _visitables.add(this.object);}
            if (object instanceof NodeSelector){ this.object= new NodeSelectorBuilder((NodeSelector)object); _visitables.add(this.object);}
            if (object instanceof Webhook){ this.object= new WebhookBuilder((Webhook)object); _visitables.add(this.object);}
            if (object instanceof RouteSpec){ this.object= new RouteSpecBuilder((RouteSpec)object); _visitables.add(this.object);}
            if (object instanceof CephFSPersistentVolumeSource){ this.object= new CephFSPersistentVolumeSourceBuilder((CephFSPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaimCondition){ this.object= new PersistentVolumeClaimConditionBuilder((PersistentVolumeClaimCondition)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeList){ this.object= new PersistentVolumeListBuilder((PersistentVolumeList)object); _visitables.add(this.object);}
            if (object instanceof ProjectRequest){ this.object= new ProjectRequestBuilder((ProjectRequest)object); _visitables.add(this.object);}
            if (object instanceof PriorityClass){ this.object= new PriorityClassBuilder((PriorityClass)object); _visitables.add(this.object);}
            if (object instanceof Template){ this.object= new TemplateBuilder((Template)object); _visitables.add(this.object);}
            if (object instanceof PodDNSConfigOption){ this.object= new PodDNSConfigOptionBuilder((PodDNSConfigOption)object); _visitables.add(this.object);}
            if (object instanceof GCEPersistentDiskVolumeSource){ this.object= new GCEPersistentDiskVolumeSourceBuilder((GCEPersistentDiskVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof OAuthClientAuthorization){ this.object= new OAuthClientAuthorizationBuilder((OAuthClientAuthorization)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicyIngressRule){ this.object= new NetworkPolicyIngressRuleBuilder((NetworkPolicyIngressRule)object); _visitables.add(this.object);}
            if (object instanceof JobTemplateSpec){ this.object= new JobTemplateSpecBuilder((JobTemplateSpec)object); _visitables.add(this.object);}
            if (object instanceof ImageChangeCause){ this.object= new ImageChangeCauseBuilder((ImageChangeCause)object); _visitables.add(this.object);}
            if (object instanceof EventList){ this.object= new EventListBuilder((EventList)object); _visitables.add(this.object);}
            if (object instanceof PodReadinessGate){ this.object= new PodReadinessGateBuilder((PodReadinessGate)object); _visitables.add(this.object);}
            if (object instanceof Deployment){ this.object= new DeploymentBuilder((Deployment)object); _visitables.add(this.object);}
            if (object instanceof ContainerStateWaiting){ this.object= new ContainerStateWaitingBuilder((ContainerStateWaiting)object); _visitables.add(this.object);}
            if (object instanceof TagEventCondition){ this.object= new TagEventConditionBuilder((TagEventCondition)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftRoleList){ this.object= new OpenshiftRoleListBuilder((OpenshiftRoleList)object); _visitables.add(this.object);}
            if (object instanceof NetNamespaceList){ this.object= new NetNamespaceListBuilder((NetNamespaceList)object); _visitables.add(this.object);}
            if (object instanceof BinaryBuildSource){ this.object= new BinaryBuildSourceBuilder((BinaryBuildSource)object); _visitables.add(this.object);}
            if (object instanceof OAuthClientAuthorizationList){ this.object= new OAuthClientAuthorizationListBuilder((OAuthClientAuthorizationList)object); _visitables.add(this.object);}
            if (object instanceof IngressSpec){ this.object= new IngressSpecBuilder((IngressSpec)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.LocalSubjectAccessReview){ this.object= new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder((io.fabric8.openshift.api.model.LocalSubjectAccessReview)object); _visitables.add(this.object);}
            if (object instanceof AdmissionReview){ this.object= new AdmissionReviewBuilder((AdmissionReview)object); _visitables.add(this.object);}
            if (object instanceof RollingDeploymentStrategyParams){ this.object= new RollingDeploymentStrategyParamsBuilder((RollingDeploymentStrategyParams)object); _visitables.add(this.object);}
            if (object instanceof DownwardAPIVolumeFile){ this.object= new DownwardAPIVolumeFileBuilder((DownwardAPIVolumeFile)object); _visitables.add(this.object);}
            if (object instanceof ImageLabel){ this.object= new ImageLabelBuilder((ImageLabel)object); _visitables.add(this.object);}
            if (object instanceof PodTemplate){ this.object= new PodTemplateBuilder((PodTemplate)object); _visitables.add(this.object);}
            if (object instanceof TCPSocketAction){ this.object= new TCPSocketActionBuilder((TCPSocketAction)object); _visitables.add(this.object);}
            if (object instanceof DaemonSetList){ this.object= new DaemonSetListBuilder((DaemonSetList)object); _visitables.add(this.object);}
            if (object instanceof Event){ this.object= new EventBuilder((Event)object); _visitables.add(this.object);}
            if (object instanceof Preferences){ this.object= new PreferencesBuilder((Preferences)object); _visitables.add(this.object);}
            if (object instanceof Ingress){ this.object= new IngressBuilder((Ingress)object); _visitables.add(this.object);}
            if (object instanceof DeploymentConfig){ this.object= new DeploymentConfigBuilder((DeploymentConfig)object); _visitables.add(this.object);}
            if (object instanceof ObjectFieldSelector){ this.object= new ObjectFieldSelectorBuilder((ObjectFieldSelector)object); _visitables.add(this.object);}
            if (object instanceof OAuthAccessToken){ this.object= new OAuthAccessTokenBuilder((OAuthAccessToken)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolume){ this.object= new PersistentVolumeBuilder((PersistentVolume)object); _visitables.add(this.object);}
            if (object instanceof CinderVolumeSource){ this.object= new CinderVolumeSourceBuilder((CinderVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ObjectMeta){ this.object= new ObjectMetaBuilder((ObjectMeta)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaim){ this.object= new PersistentVolumeClaimBuilder((PersistentVolumeClaim)object); _visitables.add(this.object);}
            if (object instanceof JSONSchemaProps){ this.object= new JSONSchemaPropsBuilder((JSONSchemaProps)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.DeploymentCondition){ this.object= new io.fabric8.openshift.api.model.DeploymentConditionBuilder((io.fabric8.openshift.api.model.DeploymentCondition)object); _visitables.add(this.object);}
            if (object instanceof DeploymentCauseImageTrigger){ this.object= new DeploymentCauseImageTriggerBuilder((DeploymentCauseImageTrigger)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicyPort){ this.object= new NetworkPolicyPortBuilder((NetworkPolicyPort)object); _visitables.add(this.object);}
            if (object instanceof OwnerReference){ this.object= new OwnerReferenceBuilder((OwnerReference)object); _visitables.add(this.object);}
            if (object instanceof CinderPersistentVolumeSource){ this.object= new CinderPersistentVolumeSourceBuilder((CinderPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof ReplicationControllerCondition){ this.object= new ReplicationControllerConditionBuilder((ReplicationControllerCondition)object); _visitables.add(this.object);}
            if (object instanceof PodAntiAffinity){ this.object= new PodAntiAffinityBuilder((PodAntiAffinity)object); _visitables.add(this.object);}
            if (object instanceof PodDisruptionBudgetSpec){ this.object= new PodDisruptionBudgetSpecBuilder((PodDisruptionBudgetSpec)object); _visitables.add(this.object);}
            if (object instanceof MetricSpec){ this.object= new MetricSpecBuilder((MetricSpec)object); _visitables.add(this.object);}
            if (object instanceof ReplicationControllerList){ this.object= new ReplicationControllerListBuilder((ReplicationControllerList)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.kubernetes.api.model.events.Event){ this.object= new io.fabric8.kubernetes.api.model.events.EventBuilder((io.fabric8.kubernetes.api.model.events.Event)object); _visitables.add(this.object);}
            if (object instanceof ContainerStateRunning){ this.object= new ContainerStateRunningBuilder((ContainerStateRunning)object); _visitables.add(this.object);}
            if (object instanceof HorizontalPodAutoscalerStatus){ this.object= new HorizontalPodAutoscalerStatusBuilder((HorizontalPodAutoscalerStatus)object); _visitables.add(this.object);}
            if (object instanceof JSONSchemaPropsOrArray){ this.object= new JSONSchemaPropsOrArrayBuilder((JSONSchemaPropsOrArray)object); _visitables.add(this.object);}
            if (object instanceof HTTPIngressPath){ this.object= new HTTPIngressPathBuilder((HTTPIngressPath)object); _visitables.add(this.object);}
            if (object instanceof NamedExtension){ this.object= new NamedExtensionBuilder((NamedExtension)object); _visitables.add(this.object);}
            if (object instanceof AzureFilePersistentVolumeSource){ this.object= new AzureFilePersistentVolumeSourceBuilder((AzureFilePersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof SourceBuildStrategy){ this.object= new SourceBuildStrategyBuilder((SourceBuildStrategy)object); _visitables.add(this.object);}
            if (object instanceof StatefulSet){ this.object= new StatefulSetBuilder((StatefulSet)object); _visitables.add(this.object);}
            if (object instanceof ContainerPort){ this.object= new ContainerPortBuilder((ContainerPort)object); _visitables.add(this.object);}
            if (object instanceof BuildPostCommitSpec){ this.object= new BuildPostCommitSpecBuilder((BuildPostCommitSpec)object); _visitables.add(this.object);}
            if (object instanceof PodList){ this.object= new PodListBuilder((PodList)object); _visitables.add(this.object);}
            if (object instanceof ResourceFieldSelector){ this.object= new ResourceFieldSelectorBuilder((ResourceFieldSelector)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftClusterRole){ this.object= new OpenshiftClusterRoleBuilder((OpenshiftClusterRole)object); _visitables.add(this.object);}
            if (object instanceof ScaleSpec){ this.object= new ScaleSpecBuilder((ScaleSpec)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.openshift.api.model.DeploymentStrategy){ this.object= new io.fabric8.openshift.api.model.DeploymentStrategyBuilder((io.fabric8.openshift.api.model.DeploymentStrategy)object); _visitables.add(this.object);}
            if (object instanceof SignatureSubject){ this.object= new SignatureSubjectBuilder((SignatureSubject)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeClaimSpec){ this.object= new PersistentVolumeClaimSpecBuilder((PersistentVolumeClaimSpec)object); _visitables.add(this.object);}
            if (object instanceof RouteIngressCondition){ this.object= new RouteIngressConditionBuilder((RouteIngressCondition)object); _visitables.add(this.object);}
            if (object instanceof LoadBalancerStatus){ this.object= new LoadBalancerStatusBuilder((LoadBalancerStatus)object); _visitables.add(this.object);}
            if (object instanceof ScopeSelector){ this.object= new ScopeSelectorBuilder((ScopeSelector)object); _visitables.add(this.object);}
            if (object instanceof RunAsGroupStrategyOptions){ this.object= new RunAsGroupStrategyOptionsBuilder((RunAsGroupStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof StageInfo){ this.object= new StageInfoBuilder((StageInfo)object); _visitables.add(this.object);}
            if (object instanceof UserList){ this.object= new UserListBuilder((UserList)object); _visitables.add(this.object);}
            if (object instanceof Role){ this.object= new RoleBuilder((Role)object); _visitables.add(this.object);}
            if (object instanceof ServicePort){ this.object= new ServicePortBuilder((ServicePort)object); _visitables.add(this.object);}
            if (object instanceof User){ this.object= new UserBuilder((User)object); _visitables.add(this.object);}
            if (object instanceof SessionAffinityConfig){ this.object= new SessionAffinityConfigBuilder((SessionAffinityConfig)object); _visitables.add(this.object);}
            if (object instanceof BuildStatusOutputTo){ this.object= new BuildStatusOutputToBuilder((BuildStatusOutputTo)object); _visitables.add(this.object);}
            if (object instanceof SecretSpec){ this.object= new SecretSpecBuilder((SecretSpec)object); _visitables.add(this.object);}
            if (object instanceof ServiceAccountList){ this.object= new ServiceAccountListBuilder((ServiceAccountList)object); _visitables.add(this.object);}
            if (object instanceof ExecNewPodHook){ this.object= new ExecNewPodHookBuilder((ExecNewPodHook)object); _visitables.add(this.object);}
            if (object instanceof ComponentStatus){ this.object= new ComponentStatusBuilder((ComponentStatus)object); _visitables.add(this.object);}
            if (object instanceof ScaleStatus){ this.object= new ScaleStatusBuilder((ScaleStatus)object); _visitables.add(this.object);}
            if (object instanceof CertificateSigningRequestCondition){ this.object= new CertificateSigningRequestConditionBuilder((CertificateSigningRequestCondition)object); _visitables.add(this.object);}
            if (object instanceof DaemonEndpoint){ this.object= new DaemonEndpointBuilder((DaemonEndpoint)object); _visitables.add(this.object);}
            if (object instanceof BuildTriggerPolicy){ this.object= new BuildTriggerPolicyBuilder((BuildTriggerPolicy)object); _visitables.add(this.object);}
            if (object instanceof TokenReview){ this.object= new TokenReviewBuilder((TokenReview)object); _visitables.add(this.object);}
            if (object instanceof PodSecurityPolicyList){ this.object= new PodSecurityPolicyListBuilder((PodSecurityPolicyList)object); _visitables.add(this.object);}
            if (object instanceof StorageClassList){ this.object= new StorageClassListBuilder((StorageClassList)object); _visitables.add(this.object);}
            if (object instanceof RoleList){ this.object= new RoleListBuilder((RoleList)object); _visitables.add(this.object);}
            if (object instanceof RoleRef){ this.object= new RoleRefBuilder((RoleRef)object); _visitables.add(this.object);}
            if (object instanceof Binding){ this.object= new BindingBuilder((Binding)object); _visitables.add(this.object);}
            if (object instanceof DeploymentConfigSpec){ this.object= new DeploymentConfigSpecBuilder((DeploymentConfigSpec)object); _visitables.add(this.object);}
            if (object instanceof RollingUpdateDaemonSet){ this.object= new RollingUpdateDaemonSetBuilder((RollingUpdateDaemonSet)object); _visitables.add(this.object);}
            if (object instanceof NetworkPolicySpec){ this.object= new NetworkPolicySpecBuilder((NetworkPolicySpec)object); _visitables.add(this.object);}
            if (object instanceof Secret){ this.object= new SecretBuilder((Secret)object); _visitables.add(this.object);}
            if (object instanceof ServiceList){ this.object= new ServiceListBuilder((ServiceList)object); _visitables.add(this.object);}
            if (object instanceof StatefulSetUpdateStrategy){ this.object= new StatefulSetUpdateStrategyBuilder((StatefulSetUpdateStrategy)object); _visitables.add(this.object);}
            if (object instanceof io.fabric8.kubernetes.api.model.events.EventSeries){ this.object= new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder((io.fabric8.kubernetes.api.model.events.EventSeries)object); _visitables.add(this.object);}
            if (object instanceof VolumeNodeAffinity){ this.object= new VolumeNodeAffinityBuilder((VolumeNodeAffinity)object); _visitables.add(this.object);}
            if (object instanceof PodsMetricStatus){ this.object= new PodsMetricStatusBuilder((PodsMetricStatus)object); _visitables.add(this.object);}
            if (object instanceof ResourceQuotaSpec){ this.object= new ResourceQuotaSpecBuilder((ResourceQuotaSpec)object); _visitables.add(this.object);}
            if (object instanceof GroupRestriction){ this.object= new GroupRestrictionBuilder((GroupRestriction)object); _visitables.add(this.object);}
            if (object instanceof JenkinsPipelineBuildStrategy){ this.object= new JenkinsPipelineBuildStrategyBuilder((JenkinsPipelineBuildStrategy)object); _visitables.add(this.object);}
            if (object instanceof SecurityContextConstraints){ this.object= new SecurityContextConstraintsBuilder((SecurityContextConstraints)object); _visitables.add(this.object);}
            if (object instanceof Subject){ this.object= new SubjectBuilder((Subject)object); _visitables.add(this.object);}
            if (object instanceof ReplicaSetCondition){ this.object= new ReplicaSetConditionBuilder((ReplicaSetCondition)object); _visitables.add(this.object);}
            if (object instanceof BaseKubernetesList){ this.object= new BaseKubernetesListBuilder((BaseKubernetesList)object); _visitables.add(this.object);}
            if (object instanceof SELinuxContextStrategyOptions){ this.object= new SELinuxContextStrategyOptionsBuilder((SELinuxContextStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof TopologySelectorLabelRequirement){ this.object= new TopologySelectorLabelRequirementBuilder((TopologySelectorLabelRequirement)object); _visitables.add(this.object);}
            if (object instanceof RBDPersistentVolumeSource){ this.object= new RBDPersistentVolumeSourceBuilder((RBDPersistentVolumeSource)object); _visitables.add(this.object);}
            if (object instanceof SELinuxOptions){ this.object= new SELinuxOptionsBuilder((SELinuxOptions)object); _visitables.add(this.object);}
            if (object instanceof HostAlias){ this.object= new HostAliasBuilder((HostAlias)object); _visitables.add(this.object);}
            if (object instanceof ImageStreamStatus){ this.object= new ImageStreamStatusBuilder((ImageStreamStatus)object); _visitables.add(this.object);}
            if (object instanceof NodeDaemonEndpoints){ this.object= new NodeDaemonEndpointsBuilder((NodeDaemonEndpoints)object); _visitables.add(this.object);}
            if (object instanceof NetNamespace){ this.object= new NetNamespaceBuilder((NetNamespace)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeSpec){ this.object= new PersistentVolumeSpecBuilder((PersistentVolumeSpec)object); _visitables.add(this.object);}
            if (object instanceof StatefulSetList){ this.object= new StatefulSetListBuilder((StatefulSetList)object); _visitables.add(this.object);}
            if (object instanceof OpenshiftClusterRoleBindingList){ this.object= new OpenshiftClusterRoleBindingListBuilder((OpenshiftClusterRoleBindingList)object); _visitables.add(this.object);}
            if (object instanceof ReplicaSetStatus){ this.object= new ReplicaSetStatusBuilder((ReplicaSetStatus)object); _visitables.add(this.object);}
            if (object instanceof Node){ this.object= new NodeBuilder((Node)object); _visitables.add(this.object);}
            if (object instanceof PriorityClassList){ this.object= new PriorityClassListBuilder((PriorityClassList)object); _visitables.add(this.object);}
            if (object instanceof Job){ this.object= new JobBuilder((Job)object); _visitables.add(this.object);}
            if (object instanceof PodStatus){ this.object= new PodStatusBuilder((PodStatus)object); _visitables.add(this.object);}
            if (object instanceof BuildOutput){ this.object= new BuildOutputBuilder((BuildOutput)object); _visitables.add(this.object);}
            if (object instanceof ExecConfig){ this.object= new ExecConfigBuilder((ExecConfig)object); _visitables.add(this.object);}
            if (object instanceof PersistentVolumeStatus){ this.object= new PersistentVolumeStatusBuilder((PersistentVolumeStatus)object); _visitables.add(this.object);}
            if (object instanceof EndpointPort){ this.object= new EndpointPortBuilder((EndpointPort)object); _visitables.add(this.object);}
            if (object instanceof SourceRevision){ this.object= new SourceRevisionBuilder((SourceRevision)object); _visitables.add(this.object);}
            if (object instanceof JSON){ this.object= new JSONBuilder((JSON)object); _visitables.add(this.object);}
            if (object instanceof LimitRangeItem){ this.object= new LimitRangeItemBuilder((LimitRangeItem)object); _visitables.add(this.object);}
            if (object instanceof CertificateSigningRequest){ this.object= new CertificateSigningRequestBuilder((CertificateSigningRequest)object); _visitables.add(this.object);}
            if (object instanceof FSGroupStrategyOptions){ this.object= new FSGroupStrategyOptionsBuilder((FSGroupStrategyOptions)object); _visitables.add(this.object);}
            if (object instanceof ClusterRoleList){ this.object= new ClusterRoleListBuilder((ClusterRoleList)object); _visitables.add(this.object);}
            if (object instanceof RouteIngress){ this.object= new RouteIngressBuilder((RouteIngress)object); _visitables.add(this.object);}
            if (object instanceof ServiceAccount){ this.object= new ServiceAccountBuilder((ServiceAccount)object); _visitables.add(this.object);}
            return (A) this;
    }

    public Boolean hasObject(){
            return this.object != null;
    }

    public A withPatchObject(Patch patchObject){
            _visitables.remove(this.object);
            if (patchObject!=null){ this.object= new PatchBuilder(patchObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PatchObjectNested<A> withNewPatchObject(){
            return new PatchObjectNestedImpl();
    }

    public WatchEventFluent.PatchObjectNested<A> withNewPatchObjectLike(Patch item){
            return new PatchObjectNestedImpl(item);
    }

    public A withDeploymentListObject(DeploymentList deploymentListObject){
            _visitables.remove(this.object);
            if (deploymentListObject!=null){ this.object= new DeploymentListBuilder(deploymentListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentListObjectNested<A> withNewDeploymentListObject(){
            return new DeploymentListObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentListObjectNested<A> withNewDeploymentListObjectLike(DeploymentList item){
            return new DeploymentListObjectNestedImpl(item);
    }

    public A withScopeRestrictionObject(ScopeRestriction scopeRestrictionObject){
            _visitables.remove(this.object);
            if (scopeRestrictionObject!=null){ this.object= new ScopeRestrictionBuilder(scopeRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScopeRestrictionObjectNested<A> withNewScopeRestrictionObject(){
            return new ScopeRestrictionObjectNestedImpl();
    }

    public WatchEventFluent.ScopeRestrictionObjectNested<A> withNewScopeRestrictionObjectLike(ScopeRestriction item){
            return new ScopeRestrictionObjectNestedImpl(item);
    }

    public A withPodsMetricSourceObject(PodsMetricSource podsMetricSourceObject){
            _visitables.remove(this.object);
            if (podsMetricSourceObject!=null){ this.object= new PodsMetricSourceBuilder(podsMetricSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodsMetricSourceObjectNested<A> withNewPodsMetricSourceObject(){
            return new PodsMetricSourceObjectNestedImpl();
    }

    public WatchEventFluent.PodsMetricSourceObjectNested<A> withNewPodsMetricSourceObjectLike(PodsMetricSource item){
            return new PodsMetricSourceObjectNestedImpl(item);
    }

    public A withStepInfoObject(StepInfo stepInfoObject){
            _visitables.remove(this.object);
            if (stepInfoObject!=null){ this.object= new StepInfoBuilder(stepInfoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StepInfoObjectNested<A> withNewStepInfoObject(){
            return new StepInfoObjectNestedImpl();
    }

    public WatchEventFluent.StepInfoObjectNested<A> withNewStepInfoObjectLike(StepInfo item){
            return new StepInfoObjectNestedImpl(item);
    }

    public A withNewStepInfoObject(Long durationMilliseconds,String name,String startTime){
            return (A)withStepInfoObject(new StepInfo(durationMilliseconds, name, startTime));
    }

    public A withStatefulSetStatusObject(StatefulSetStatus statefulSetStatusObject){
            _visitables.remove(this.object);
            if (statefulSetStatusObject!=null){ this.object= new StatefulSetStatusBuilder(statefulSetStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatefulSetStatusObjectNested<A> withNewStatefulSetStatusObject(){
            return new StatefulSetStatusObjectNestedImpl();
    }

    public WatchEventFluent.StatefulSetStatusObjectNested<A> withNewStatefulSetStatusObjectLike(StatefulSetStatus item){
            return new StatefulSetStatusObjectNestedImpl(item);
    }

    public A withPodTemplateSpecObject(PodTemplateSpec podTemplateSpecObject){
            _visitables.remove(this.object);
            if (podTemplateSpecObject!=null){ this.object= new PodTemplateSpecBuilder(podTemplateSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodTemplateSpecObjectNested<A> withNewPodTemplateSpecObject(){
            return new PodTemplateSpecObjectNestedImpl();
    }

    public WatchEventFluent.PodTemplateSpecObjectNested<A> withNewPodTemplateSpecObjectLike(PodTemplateSpec item){
            return new PodTemplateSpecObjectNestedImpl(item);
    }

    public A withAuthInfoObject(AuthInfo authInfoObject){
            _visitables.remove(this.object);
            if (authInfoObject!=null){ this.object= new AuthInfoBuilder(authInfoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AuthInfoObjectNested<A> withNewAuthInfoObject(){
            return new AuthInfoObjectNestedImpl();
    }

    public WatchEventFluent.AuthInfoObjectNested<A> withNewAuthInfoObjectLike(AuthInfo item){
            return new AuthInfoObjectNestedImpl(item);
    }

    public A withConfigMapKeySelectorObject(ConfigMapKeySelector configMapKeySelectorObject){
            _visitables.remove(this.object);
            if (configMapKeySelectorObject!=null){ this.object= new ConfigMapKeySelectorBuilder(configMapKeySelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapKeySelectorObjectNested<A> withNewConfigMapKeySelectorObject(){
            return new ConfigMapKeySelectorObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapKeySelectorObjectNested<A> withNewConfigMapKeySelectorObjectLike(ConfigMapKeySelector item){
            return new ConfigMapKeySelectorObjectNestedImpl(item);
    }

    public A withNewConfigMapKeySelectorObject(String key,String name,Boolean optional){
            return (A)withConfigMapKeySelectorObject(new ConfigMapKeySelector(key, name, optional));
    }

    public A withRuleWithOperationsObject(RuleWithOperations ruleWithOperationsObject){
            _visitables.remove(this.object);
            if (ruleWithOperationsObject!=null){ this.object= new RuleWithOperationsBuilder(ruleWithOperationsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RuleWithOperationsObjectNested<A> withNewRuleWithOperationsObject(){
            return new RuleWithOperationsObjectNestedImpl();
    }

    public WatchEventFluent.RuleWithOperationsObjectNested<A> withNewRuleWithOperationsObjectLike(RuleWithOperations item){
            return new RuleWithOperationsObjectNestedImpl(item);
    }

    public A withHostPathVolumeSourceObject(HostPathVolumeSource hostPathVolumeSourceObject){
            _visitables.remove(this.object);
            if (hostPathVolumeSourceObject!=null){ this.object= new HostPathVolumeSourceBuilder(hostPathVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HostPathVolumeSourceObjectNested<A> withNewHostPathVolumeSourceObject(){
            return new HostPathVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.HostPathVolumeSourceObjectNested<A> withNewHostPathVolumeSourceObjectLike(HostPathVolumeSource item){
            return new HostPathVolumeSourceObjectNestedImpl(item);
    }

    public A withNewHostPathVolumeSourceObject(String path,String type){
            return (A)withHostPathVolumeSourceObject(new HostPathVolumeSource(path, type));
    }

    public A withNamedContextObject(NamedContext namedContextObject){
            _visitables.remove(this.object);
            if (namedContextObject!=null){ this.object= new NamedContextBuilder(namedContextObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamedContextObjectNested<A> withNewNamedContextObject(){
            return new NamedContextObjectNestedImpl();
    }

    public WatchEventFluent.NamedContextObjectNested<A> withNewNamedContextObjectLike(NamedContext item){
            return new NamedContextObjectNestedImpl(item);
    }

    public A withConfigObject(Config configObject){
            _visitables.remove(this.object);
            if (configObject!=null){ this.object= new ConfigBuilder(configObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigObjectNested<A> withNewConfigObject(){
            return new ConfigObjectNestedImpl();
    }

    public WatchEventFluent.ConfigObjectNested<A> withNewConfigObjectLike(Config item){
            return new ConfigObjectNestedImpl(item);
    }

    public A withPodPresetSpecObject(PodPresetSpec podPresetSpecObject){
            _visitables.remove(this.object);
            if (podPresetSpecObject!=null){ this.object= new PodPresetSpecBuilder(podPresetSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodPresetSpecObjectNested<A> withNewPodPresetSpecObject(){
            return new PodPresetSpecObjectNestedImpl();
    }

    public WatchEventFluent.PodPresetSpecObjectNested<A> withNewPodPresetSpecObjectLike(PodPresetSpec item){
            return new PodPresetSpecObjectNestedImpl(item);
    }

    public A withAffinityObject(Affinity affinityObject){
            _visitables.remove(this.object);
            if (affinityObject!=null){ this.object= new AffinityBuilder(affinityObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AffinityObjectNested<A> withNewAffinityObject(){
            return new AffinityObjectNestedImpl();
    }

    public WatchEventFluent.AffinityObjectNested<A> withNewAffinityObjectLike(Affinity item){
            return new AffinityObjectNestedImpl(item);
    }

    public A withResourceAttributesObject(ResourceAttributes resourceAttributesObject){
            _visitables.remove(this.object);
            if (resourceAttributesObject!=null){ this.object= new ResourceAttributesBuilder(resourceAttributesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceAttributesObjectNested<A> withNewResourceAttributesObject(){
            return new ResourceAttributesObjectNestedImpl();
    }

    public WatchEventFluent.ResourceAttributesObjectNested<A> withNewResourceAttributesObjectLike(ResourceAttributes item){
            return new ResourceAttributesObjectNestedImpl(item);
    }

    public A withSubjectAccessReviewSpecObject(SubjectAccessReviewSpec subjectAccessReviewSpecObject){
            _visitables.remove(this.object);
            if (subjectAccessReviewSpecObject!=null){ this.object= new SubjectAccessReviewSpecBuilder(subjectAccessReviewSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SubjectAccessReviewSpecObjectNested<A> withNewSubjectAccessReviewSpecObject(){
            return new SubjectAccessReviewSpecObjectNestedImpl();
    }

    public WatchEventFluent.SubjectAccessReviewSpecObjectNested<A> withNewSubjectAccessReviewSpecObjectLike(SubjectAccessReviewSpec item){
            return new SubjectAccessReviewSpecObjectNestedImpl(item);
    }

    public A withValidatingWebhookConfigurationObject(ValidatingWebhookConfiguration validatingWebhookConfigurationObject){
            _visitables.remove(this.object);
            if (validatingWebhookConfigurationObject!=null){ this.object= new ValidatingWebhookConfigurationBuilder(validatingWebhookConfigurationObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObject(){
            return new ValidatingWebhookConfigurationObjectNestedImpl();
    }

    public WatchEventFluent.ValidatingWebhookConfigurationObjectNested<A> withNewValidatingWebhookConfigurationObjectLike(ValidatingWebhookConfiguration item){
            return new ValidatingWebhookConfigurationObjectNestedImpl(item);
    }

    public A withPolicyRuleObject(io.fabric8.openshift.api.model.PolicyRule policyRuleObject){
            _visitables.remove(this.object);
            if (policyRuleObject!=null){ this.object= new io.fabric8.openshift.api.model.PolicyRuleBuilder(policyRuleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelPolicyRuleObjectNested<A> withNewModelPolicyRuleObject(){
            return new ModelPolicyRuleObjectNestedImpl();
    }

    public WatchEventFluent.ModelPolicyRuleObjectNested<A> withNewPolicyRuleObjectLike(io.fabric8.openshift.api.model.PolicyRule item){
            return new ModelPolicyRuleObjectNestedImpl(item);
    }

    public A withNetworkPolicyEgressRuleObject(NetworkPolicyEgressRule networkPolicyEgressRuleObject){
            _visitables.remove(this.object);
            if (networkPolicyEgressRuleObject!=null){ this.object= new NetworkPolicyEgressRuleBuilder(networkPolicyEgressRuleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicyEgressRuleObjectNested<A> withNewNetworkPolicyEgressRuleObject(){
            return new NetworkPolicyEgressRuleObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicyEgressRuleObjectNested<A> withNewNetworkPolicyEgressRuleObjectLike(NetworkPolicyEgressRule item){
            return new NetworkPolicyEgressRuleObjectNestedImpl(item);
    }

    public A withIPBlockObject(IPBlock iPBlockObject){
            _visitables.remove(this.object);
            if (iPBlockObject!=null){ this.object= new IPBlockBuilder(iPBlockObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IPBlockObjectNested<A> withNewIPBlockObject(){
            return new IPBlockObjectNestedImpl();
    }

    public WatchEventFluent.IPBlockObjectNested<A> withNewIPBlockObjectLike(IPBlock item){
            return new IPBlockObjectNestedImpl(item);
    }

    public A withDeploymentTriggerPolicyObject(DeploymentTriggerPolicy deploymentTriggerPolicyObject){
            _visitables.remove(this.object);
            if (deploymentTriggerPolicyObject!=null){ this.object= new DeploymentTriggerPolicyBuilder(deploymentTriggerPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentTriggerPolicyObjectNested<A> withNewDeploymentTriggerPolicyObject(){
            return new DeploymentTriggerPolicyObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentTriggerPolicyObjectNested<A> withNewDeploymentTriggerPolicyObjectLike(DeploymentTriggerPolicy item){
            return new DeploymentTriggerPolicyObjectNestedImpl(item);
    }

    public A withBuildStrategyObject(BuildStrategy buildStrategyObject){
            _visitables.remove(this.object);
            if (buildStrategyObject!=null){ this.object= new BuildStrategyBuilder(buildStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildStrategyObjectNested<A> withNewBuildStrategyObject(){
            return new BuildStrategyObjectNestedImpl();
    }

    public WatchEventFluent.BuildStrategyObjectNested<A> withNewBuildStrategyObjectLike(BuildStrategy item){
            return new BuildStrategyObjectNestedImpl(item);
    }

    public A withServiceReferenceObject(ServiceReference serviceReferenceObject){
            _visitables.remove(this.object);
            if (serviceReferenceObject!=null){ this.object= new ServiceReferenceBuilder(serviceReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceReferenceObjectNested<A> withNewServiceReferenceObject(){
            return new ServiceReferenceObjectNestedImpl();
    }

    public WatchEventFluent.ServiceReferenceObjectNested<A> withNewServiceReferenceObjectLike(ServiceReference item){
            return new ServiceReferenceObjectNestedImpl(item);
    }

    public A withNewServiceReferenceObject(String name,String namespace,String path){
            return (A)withServiceReferenceObject(new ServiceReference(name, namespace, path));
    }

    public A withStatefulSetSpecObject(StatefulSetSpec statefulSetSpecObject){
            _visitables.remove(this.object);
            if (statefulSetSpecObject!=null){ this.object= new StatefulSetSpecBuilder(statefulSetSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatefulSetSpecObjectNested<A> withNewStatefulSetSpecObject(){
            return new StatefulSetSpecObjectNestedImpl();
    }

    public WatchEventFluent.StatefulSetSpecObjectNested<A> withNewStatefulSetSpecObjectLike(StatefulSetSpec item){
            return new StatefulSetSpecObjectNestedImpl(item);
    }

    public A withStorageClassObject(StorageClass storageClassObject){
            _visitables.remove(this.object);
            if (storageClassObject!=null){ this.object= new StorageClassBuilder(storageClassObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StorageClassObjectNested<A> withNewStorageClassObject(){
            return new StorageClassObjectNestedImpl();
    }

    public WatchEventFluent.StorageClassObjectNested<A> withNewStorageClassObjectLike(StorageClass item){
            return new StorageClassObjectNestedImpl(item);
    }

    public A withCustomBuildStrategyObject(CustomBuildStrategy customBuildStrategyObject){
            _visitables.remove(this.object);
            if (customBuildStrategyObject!=null){ this.object= new CustomBuildStrategyBuilder(customBuildStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomBuildStrategyObjectNested<A> withNewCustomBuildStrategyObject(){
            return new CustomBuildStrategyObjectNestedImpl();
    }

    public WatchEventFluent.CustomBuildStrategyObjectNested<A> withNewCustomBuildStrategyObjectLike(CustomBuildStrategy item){
            return new CustomBuildStrategyObjectNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerConditionObject(HorizontalPodAutoscalerCondition horizontalPodAutoscalerConditionObject){
            _visitables.remove(this.object);
            if (horizontalPodAutoscalerConditionObject!=null){ this.object= new HorizontalPodAutoscalerConditionBuilder(horizontalPodAutoscalerConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<A> withNewHorizontalPodAutoscalerConditionObject(){
            return new HorizontalPodAutoscalerConditionObjectNestedImpl();
    }

    public WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<A> withNewHorizontalPodAutoscalerConditionObjectLike(HorizontalPodAutoscalerCondition item){
            return new HorizontalPodAutoscalerConditionObjectNestedImpl(item);
    }

    public A withNewHorizontalPodAutoscalerConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withHorizontalPodAutoscalerConditionObject(new HorizontalPodAutoscalerCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withAzureFileVolumeSourceObject(AzureFileVolumeSource azureFileVolumeSourceObject){
            _visitables.remove(this.object);
            if (azureFileVolumeSourceObject!=null){ this.object= new AzureFileVolumeSourceBuilder(azureFileVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AzureFileVolumeSourceObjectNested<A> withNewAzureFileVolumeSourceObject(){
            return new AzureFileVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.AzureFileVolumeSourceObjectNested<A> withNewAzureFileVolumeSourceObjectLike(AzureFileVolumeSource item){
            return new AzureFileVolumeSourceObjectNestedImpl(item);
    }

    public A withNewAzureFileVolumeSourceObject(Boolean readOnly,String secretName,String shareName){
            return (A)withAzureFileVolumeSourceObject(new AzureFileVolumeSource(readOnly, secretName, shareName));
    }

    public A withClusterRoleBindingObject(ClusterRoleBinding clusterRoleBindingObject){
            _visitables.remove(this.object);
            if (clusterRoleBindingObject!=null){ this.object= new ClusterRoleBindingBuilder(clusterRoleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObject(){
            return new ClusterRoleBindingObjectNestedImpl();
    }

    public WatchEventFluent.ClusterRoleBindingObjectNested<A> withNewClusterRoleBindingObjectLike(ClusterRoleBinding item){
            return new ClusterRoleBindingObjectNestedImpl(item);
    }

    public A withEnvVarObject(EnvVar envVarObject){
            _visitables.remove(this.object);
            if (envVarObject!=null){ this.object= new EnvVarBuilder(envVarObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EnvVarObjectNested<A> withNewEnvVarObject(){
            return new EnvVarObjectNestedImpl();
    }

    public WatchEventFluent.EnvVarObjectNested<A> withNewEnvVarObjectLike(EnvVar item){
            return new EnvVarObjectNestedImpl(item);
    }

    public A withSubjectAccessReviewResponseObject(SubjectAccessReviewResponse subjectAccessReviewResponseObject){
            _visitables.remove(this.object);
            if (subjectAccessReviewResponseObject!=null){ this.object= new SubjectAccessReviewResponseBuilder(subjectAccessReviewResponseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SubjectAccessReviewResponseObjectNested<A> withNewSubjectAccessReviewResponseObject(){
            return new SubjectAccessReviewResponseObjectNestedImpl();
    }

    public WatchEventFluent.SubjectAccessReviewResponseObjectNested<A> withNewSubjectAccessReviewResponseObjectLike(SubjectAccessReviewResponse item){
            return new SubjectAccessReviewResponseObjectNestedImpl(item);
    }

    public A withHostPortRangeObject(HostPortRange hostPortRangeObject){
            _visitables.remove(this.object);
            if (hostPortRangeObject!=null){ this.object= new HostPortRangeBuilder(hostPortRangeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HostPortRangeObjectNested<A> withNewHostPortRangeObject(){
            return new HostPortRangeObjectNestedImpl();
    }

    public WatchEventFluent.HostPortRangeObjectNested<A> withNewHostPortRangeObjectLike(HostPortRange item){
            return new HostPortRangeObjectNestedImpl(item);
    }

    public A withNewHostPortRangeObject(Integer max,Integer min){
            return (A)withHostPortRangeObject(new HostPortRange(max, min));
    }

    public A withLoadBalancerIngressObject(LoadBalancerIngress loadBalancerIngressObject){
            _visitables.remove(this.object);
            if (loadBalancerIngressObject!=null){ this.object= new LoadBalancerIngressBuilder(loadBalancerIngressObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LoadBalancerIngressObjectNested<A> withNewLoadBalancerIngressObject(){
            return new LoadBalancerIngressObjectNestedImpl();
    }

    public WatchEventFluent.LoadBalancerIngressObjectNested<A> withNewLoadBalancerIngressObjectLike(LoadBalancerIngress item){
            return new LoadBalancerIngressObjectNestedImpl(item);
    }

    public A withNewLoadBalancerIngressObject(String hostname,String ip){
            return (A)withLoadBalancerIngressObject(new LoadBalancerIngress(hostname, ip));
    }

    public A withAttachedVolumeObject(AttachedVolume attachedVolumeObject){
            _visitables.remove(this.object);
            if (attachedVolumeObject!=null){ this.object= new AttachedVolumeBuilder(attachedVolumeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AttachedVolumeObjectNested<A> withNewAttachedVolumeObject(){
            return new AttachedVolumeObjectNestedImpl();
    }

    public WatchEventFluent.AttachedVolumeObjectNested<A> withNewAttachedVolumeObjectLike(AttachedVolume item){
            return new AttachedVolumeObjectNestedImpl(item);
    }

    public A withNewAttachedVolumeObject(String devicePath,String name){
            return (A)withAttachedVolumeObject(new AttachedVolume(devicePath, name));
    }

    public A withLocalObjectReference(LocalObjectReference localObjectReference){
            _visitables.remove(this.object);
            if (localObjectReference!=null){ this.object= new LocalObjectReferenceBuilder(localObjectReference); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LocalObjectReferenceNested<A> withNewLocalObjectReference(){
            return new LocalObjectReferenceNestedImpl();
    }

    public WatchEventFluent.LocalObjectReferenceNested<A> withNewLocalObjectReferenceLike(LocalObjectReference item){
            return new LocalObjectReferenceNestedImpl(item);
    }

    public A withNewLocalObjectReference(String name){
            return (A)withLocalObjectReference(new LocalObjectReference(name));
    }

    public A withNamedAuthInfoObject(NamedAuthInfo namedAuthInfoObject){
            _visitables.remove(this.object);
            if (namedAuthInfoObject!=null){ this.object= new NamedAuthInfoBuilder(namedAuthInfoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamedAuthInfoObjectNested<A> withNewNamedAuthInfoObject(){
            return new NamedAuthInfoObjectNestedImpl();
    }

    public WatchEventFluent.NamedAuthInfoObjectNested<A> withNewNamedAuthInfoObjectLike(NamedAuthInfo item){
            return new NamedAuthInfoObjectNestedImpl(item);
    }

    public A withJobConditionObject(JobCondition jobConditionObject){
            _visitables.remove(this.object);
            if (jobConditionObject!=null){ this.object= new JobConditionBuilder(jobConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JobConditionObjectNested<A> withNewJobConditionObject(){
            return new JobConditionObjectNestedImpl();
    }

    public WatchEventFluent.JobConditionObjectNested<A> withNewJobConditionObjectLike(JobCondition item){
            return new JobConditionObjectNestedImpl(item);
    }

    public A withPodSpecObject(PodSpec podSpecObject){
            _visitables.remove(this.object);
            if (podSpecObject!=null){ this.object= new PodSpecBuilder(podSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodSpecObjectNested<A> withNewPodSpecObject(){
            return new PodSpecObjectNestedImpl();
    }

    public WatchEventFluent.PodSpecObjectNested<A> withNewPodSpecObjectLike(PodSpec item){
            return new PodSpecObjectNestedImpl(item);
    }

    public A withPreconditionsObject(Preconditions preconditionsObject){
            _visitables.remove(this.object);
            if (preconditionsObject!=null){ this.object= new PreconditionsBuilder(preconditionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PreconditionsObjectNested<A> withNewPreconditionsObject(){
            return new PreconditionsObjectNestedImpl();
    }

    public WatchEventFluent.PreconditionsObjectNested<A> withNewPreconditionsObjectLike(Preconditions item){
            return new PreconditionsObjectNestedImpl(item);
    }

    public A withNewPreconditionsObject(String uid){
            return (A)withPreconditionsObject(new Preconditions(uid));
    }

    public A withTagReferencePolicyObject(TagReferencePolicy tagReferencePolicyObject){
            _visitables.remove(this.object);
            if (tagReferencePolicyObject!=null){ this.object= new TagReferencePolicyBuilder(tagReferencePolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TagReferencePolicyObjectNested<A> withNewTagReferencePolicyObject(){
            return new TagReferencePolicyObjectNestedImpl();
    }

    public WatchEventFluent.TagReferencePolicyObjectNested<A> withNewTagReferencePolicyObjectLike(TagReferencePolicy item){
            return new TagReferencePolicyObjectNestedImpl(item);
    }

    public A withNewTagReferencePolicyObject(String type){
            return (A)withTagReferencePolicyObject(new TagReferencePolicy(type));
    }

    public A withOpenshiftRoleBindingObject(OpenshiftRoleBinding openshiftRoleBindingObject){
            _visitables.remove(this.object);
            if (openshiftRoleBindingObject!=null){ this.object= new OpenshiftRoleBindingBuilder(openshiftRoleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObject(){
            return new OpenshiftRoleBindingObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftRoleBindingObjectNested<A> withNewOpenshiftRoleBindingObjectLike(OpenshiftRoleBinding item){
            return new OpenshiftRoleBindingObjectNestedImpl(item);
    }

    public A withCephFSVolumeSourceObject(CephFSVolumeSource cephFSVolumeSourceObject){
            _visitables.remove(this.object);
            if (cephFSVolumeSourceObject!=null){ this.object= new CephFSVolumeSourceBuilder(cephFSVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CephFSVolumeSourceObjectNested<A> withNewCephFSVolumeSourceObject(){
            return new CephFSVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.CephFSVolumeSourceObjectNested<A> withNewCephFSVolumeSourceObjectLike(CephFSVolumeSource item){
            return new CephFSVolumeSourceObjectNestedImpl(item);
    }

    public A withNodeConditionObject(NodeCondition nodeConditionObject){
            _visitables.remove(this.object);
            if (nodeConditionObject!=null){ this.object= new NodeConditionBuilder(nodeConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeConditionObjectNested<A> withNewNodeConditionObject(){
            return new NodeConditionObjectNestedImpl();
    }

    public WatchEventFluent.NodeConditionObjectNested<A> withNewNodeConditionObjectLike(NodeCondition item){
            return new NodeConditionObjectNestedImpl(item);
    }

    public A withEndpointSubsetObject(EndpointSubset endpointSubsetObject){
            _visitables.remove(this.object);
            if (endpointSubsetObject!=null){ this.object= new EndpointSubsetBuilder(endpointSubsetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EndpointSubsetObjectNested<A> withNewEndpointSubsetObject(){
            return new EndpointSubsetObjectNestedImpl();
    }

    public WatchEventFluent.EndpointSubsetObjectNested<A> withNewEndpointSubsetObjectLike(EndpointSubset item){
            return new EndpointSubsetObjectNestedImpl(item);
    }

    public A withLocalVolumeSourceObject(LocalVolumeSource localVolumeSourceObject){
            _visitables.remove(this.object);
            if (localVolumeSourceObject!=null){ this.object= new LocalVolumeSourceBuilder(localVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LocalVolumeSourceObjectNested<A> withNewLocalVolumeSourceObject(){
            return new LocalVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.LocalVolumeSourceObjectNested<A> withNewLocalVolumeSourceObjectLike(LocalVolumeSource item){
            return new LocalVolumeSourceObjectNestedImpl(item);
    }

    public A withNewLocalVolumeSourceObject(String fsType,String path){
            return (A)withLocalVolumeSourceObject(new LocalVolumeSource(fsType, path));
    }

    public A withCertificateSigningRequestListObject(CertificateSigningRequestList certificateSigningRequestListObject){
            _visitables.remove(this.object);
            if (certificateSigningRequestListObject!=null){ this.object= new CertificateSigningRequestListBuilder(certificateSigningRequestListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CertificateSigningRequestListObjectNested<A> withNewCertificateSigningRequestListObject(){
            return new CertificateSigningRequestListObjectNestedImpl();
    }

    public WatchEventFluent.CertificateSigningRequestListObjectNested<A> withNewCertificateSigningRequestListObjectLike(CertificateSigningRequestList item){
            return new CertificateSigningRequestListObjectNestedImpl(item);
    }

    public A withPodDisruptionBudgetObject(PodDisruptionBudget podDisruptionBudgetObject){
            _visitables.remove(this.object);
            if (podDisruptionBudgetObject!=null){ this.object= new PodDisruptionBudgetBuilder(podDisruptionBudgetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObject(){
            return new PodDisruptionBudgetObjectNestedImpl();
    }

    public WatchEventFluent.PodDisruptionBudgetObjectNested<A> withNewPodDisruptionBudgetObjectLike(PodDisruptionBudget item){
            return new PodDisruptionBudgetObjectNestedImpl(item);
    }

    public A withDaemonSetStatusObject(DaemonSetStatus daemonSetStatusObject){
            _visitables.remove(this.object);
            if (daemonSetStatusObject!=null){ this.object= new DaemonSetStatusBuilder(daemonSetStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonSetStatusObjectNested<A> withNewDaemonSetStatusObject(){
            return new DaemonSetStatusObjectNestedImpl();
    }

    public WatchEventFluent.DaemonSetStatusObjectNested<A> withNewDaemonSetStatusObjectLike(DaemonSetStatus item){
            return new DaemonSetStatusObjectNestedImpl(item);
    }

    public A withObjectMetricSourceObject(ObjectMetricSource objectMetricSourceObject){
            _visitables.remove(this.object);
            if (objectMetricSourceObject!=null){ this.object= new ObjectMetricSourceBuilder(objectMetricSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ObjectMetricSourceObjectNested<A> withNewObjectMetricSourceObject(){
            return new ObjectMetricSourceObjectNestedImpl();
    }

    public WatchEventFluent.ObjectMetricSourceObjectNested<A> withNewObjectMetricSourceObjectLike(ObjectMetricSource item){
            return new ObjectMetricSourceObjectNestedImpl(item);
    }

    public A withBuildStatusOutputObject(BuildStatusOutput buildStatusOutputObject){
            _visitables.remove(this.object);
            if (buildStatusOutputObject!=null){ this.object= new BuildStatusOutputBuilder(buildStatusOutputObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildStatusOutputObjectNested<A> withNewBuildStatusOutputObject(){
            return new BuildStatusOutputObjectNestedImpl();
    }

    public WatchEventFluent.BuildStatusOutputObjectNested<A> withNewBuildStatusOutputObjectLike(BuildStatusOutput item){
            return new BuildStatusOutputObjectNestedImpl(item);
    }

    public A withNetworkPolicyPeerObject(NetworkPolicyPeer networkPolicyPeerObject){
            _visitables.remove(this.object);
            if (networkPolicyPeerObject!=null){ this.object= new NetworkPolicyPeerBuilder(networkPolicyPeerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicyPeerObjectNested<A> withNewNetworkPolicyPeerObject(){
            return new NetworkPolicyPeerObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicyPeerObjectNested<A> withNewNetworkPolicyPeerObjectLike(NetworkPolicyPeer item){
            return new NetworkPolicyPeerObjectNestedImpl(item);
    }

    public A withConfigMapNodeConfigSourceObject(ConfigMapNodeConfigSource configMapNodeConfigSourceObject){
            _visitables.remove(this.object);
            if (configMapNodeConfigSourceObject!=null){ this.object= new ConfigMapNodeConfigSourceBuilder(configMapNodeConfigSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<A> withNewConfigMapNodeConfigSourceObject(){
            return new ConfigMapNodeConfigSourceObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<A> withNewConfigMapNodeConfigSourceObjectLike(ConfigMapNodeConfigSource item){
            return new ConfigMapNodeConfigSourceObjectNestedImpl(item);
    }

    public A withNewConfigMapNodeConfigSourceObject(String kubeletConfigKey,String name,String namespace,String resourceVersion,String uid){
            return (A)withConfigMapNodeConfigSourceObject(new ConfigMapNodeConfigSource(kubeletConfigKey, name, namespace, resourceVersion, uid));
    }

    public A withHTTPGetActionObject(HTTPGetAction hTTPGetActionObject){
            _visitables.remove(this.object);
            if (hTTPGetActionObject!=null){ this.object= new HTTPGetActionBuilder(hTTPGetActionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HTTPGetActionObjectNested<A> withNewHTTPGetActionObject(){
            return new HTTPGetActionObjectNestedImpl();
    }

    public WatchEventFluent.HTTPGetActionObjectNested<A> withNewHTTPGetActionObjectLike(HTTPGetAction item){
            return new HTTPGetActionObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleScopeRestrictionObject(OpenshiftClusterRoleScopeRestriction openshiftClusterRoleScopeRestrictionObject){
            _visitables.remove(this.object);
            if (openshiftClusterRoleScopeRestrictionObject!=null){ this.object= new OpenshiftClusterRoleScopeRestrictionBuilder(openshiftClusterRoleScopeRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<A> withNewOpenshiftClusterRoleScopeRestrictionObject(){
            return new OpenshiftClusterRoleScopeRestrictionObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<A> withNewOpenshiftClusterRoleScopeRestrictionObjectLike(OpenshiftClusterRoleScopeRestriction item){
            return new OpenshiftClusterRoleScopeRestrictionObjectNestedImpl(item);
    }

    public A withGitLabWebHookCauseObject(GitLabWebHookCause gitLabWebHookCauseObject){
            _visitables.remove(this.object);
            if (gitLabWebHookCauseObject!=null){ this.object= new GitLabWebHookCauseBuilder(gitLabWebHookCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GitLabWebHookCauseObjectNested<A> withNewGitLabWebHookCauseObject(){
            return new GitLabWebHookCauseObjectNestedImpl();
    }

    public WatchEventFluent.GitLabWebHookCauseObjectNested<A> withNewGitLabWebHookCauseObjectLike(GitLabWebHookCause item){
            return new GitLabWebHookCauseObjectNestedImpl(item);
    }

    public A withNetworkPolicyObject(NetworkPolicy networkPolicyObject){
            _visitables.remove(this.object);
            if (networkPolicyObject!=null){ this.object= new NetworkPolicyBuilder(networkPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObject(){
            return new NetworkPolicyObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicyObjectNested<A> withNewNetworkPolicyObjectLike(NetworkPolicy item){
            return new NetworkPolicyObjectNestedImpl(item);
    }

    public A withSecretBuildSourceObject(SecretBuildSource secretBuildSourceObject){
            _visitables.remove(this.object);
            if (secretBuildSourceObject!=null){ this.object= new SecretBuildSourceBuilder(secretBuildSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretBuildSourceObjectNested<A> withNewSecretBuildSourceObject(){
            return new SecretBuildSourceObjectNestedImpl();
    }

    public WatchEventFluent.SecretBuildSourceObjectNested<A> withNewSecretBuildSourceObjectLike(SecretBuildSource item){
            return new SecretBuildSourceObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingObject(OpenshiftClusterRoleBinding openshiftClusterRoleBindingObject){
            _visitables.remove(this.object);
            if (openshiftClusterRoleBindingObject!=null){ this.object= new OpenshiftClusterRoleBindingBuilder(openshiftClusterRoleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObject(){
            return new OpenshiftClusterRoleBindingObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<A> withNewOpenshiftClusterRoleBindingObjectLike(OpenshiftClusterRoleBinding item){
            return new OpenshiftClusterRoleBindingObjectNestedImpl(item);
    }

    public A withDaemonSetSpecObject(DaemonSetSpec daemonSetSpecObject){
            _visitables.remove(this.object);
            if (daemonSetSpecObject!=null){ this.object= new DaemonSetSpecBuilder(daemonSetSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonSetSpecObjectNested<A> withNewDaemonSetSpecObject(){
            return new DaemonSetSpecObjectNestedImpl();
    }

    public WatchEventFluent.DaemonSetSpecObjectNested<A> withNewDaemonSetSpecObjectLike(DaemonSetSpec item){
            return new DaemonSetSpecObjectNestedImpl(item);
    }

    public A withSELinuxStrategyOptionsObject(SELinuxStrategyOptions sELinuxStrategyOptionsObject){
            _visitables.remove(this.object);
            if (sELinuxStrategyOptionsObject!=null){ this.object= new SELinuxStrategyOptionsBuilder(sELinuxStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SELinuxStrategyOptionsObjectNested<A> withNewSELinuxStrategyOptionsObject(){
            return new SELinuxStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.SELinuxStrategyOptionsObjectNested<A> withNewSELinuxStrategyOptionsObjectLike(SELinuxStrategyOptions item){
            return new SELinuxStrategyOptionsObjectNestedImpl(item);
    }

    public A withJobStatusObject(JobStatus jobStatusObject){
            _visitables.remove(this.object);
            if (jobStatusObject!=null){ this.object= new JobStatusBuilder(jobStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JobStatusObjectNested<A> withNewJobStatusObject(){
            return new JobStatusObjectNestedImpl();
    }

    public WatchEventFluent.JobStatusObjectNested<A> withNewJobStatusObjectLike(JobStatus item){
            return new JobStatusObjectNestedImpl(item);
    }

    public A withObjectMetricStatusObject(ObjectMetricStatus objectMetricStatusObject){
            _visitables.remove(this.object);
            if (objectMetricStatusObject!=null){ this.object= new ObjectMetricStatusBuilder(objectMetricStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ObjectMetricStatusObjectNested<A> withNewObjectMetricStatusObject(){
            return new ObjectMetricStatusObjectNestedImpl();
    }

    public WatchEventFluent.ObjectMetricStatusObjectNested<A> withNewObjectMetricStatusObjectLike(ObjectMetricStatus item){
            return new ObjectMetricStatusObjectNestedImpl(item);
    }

    public A withBitbucketWebHookCauseObject(BitbucketWebHookCause bitbucketWebHookCauseObject){
            _visitables.remove(this.object);
            if (bitbucketWebHookCauseObject!=null){ this.object= new BitbucketWebHookCauseBuilder(bitbucketWebHookCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BitbucketWebHookCauseObjectNested<A> withNewBitbucketWebHookCauseObject(){
            return new BitbucketWebHookCauseObjectNestedImpl();
    }

    public WatchEventFluent.BitbucketWebHookCauseObjectNested<A> withNewBitbucketWebHookCauseObjectLike(BitbucketWebHookCause item){
            return new BitbucketWebHookCauseObjectNestedImpl(item);
    }

    public A withProjectListObject(ProjectList projectListObject){
            _visitables.remove(this.object);
            if (projectListObject!=null){ this.object= new ProjectListBuilder(projectListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProjectListObjectNested<A> withNewProjectListObject(){
            return new ProjectListObjectNestedImpl();
    }

    public WatchEventFluent.ProjectListObjectNested<A> withNewProjectListObjectLike(ProjectList item){
            return new ProjectListObjectNestedImpl(item);
    }

    public A withPodSecurityPolicySpecObject(PodSecurityPolicySpec podSecurityPolicySpecObject){
            _visitables.remove(this.object);
            if (podSecurityPolicySpecObject!=null){ this.object= new PodSecurityPolicySpecBuilder(podSecurityPolicySpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodSecurityPolicySpecObjectNested<A> withNewPodSecurityPolicySpecObject(){
            return new PodSecurityPolicySpecObjectNestedImpl();
    }

    public WatchEventFluent.PodSecurityPolicySpecObjectNested<A> withNewPodSecurityPolicySpecObjectLike(PodSecurityPolicySpec item){
            return new PodSecurityPolicySpecObjectNestedImpl(item);
    }

    public A withRoleBindingListObject(RoleBindingList roleBindingListObject){
            _visitables.remove(this.object);
            if (roleBindingListObject!=null){ this.object= new RoleBindingListBuilder(roleBindingListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RoleBindingListObjectNested<A> withNewRoleBindingListObject(){
            return new RoleBindingListObjectNestedImpl();
    }

    public WatchEventFluent.RoleBindingListObjectNested<A> withNewRoleBindingListObjectLike(RoleBindingList item){
            return new RoleBindingListObjectNestedImpl(item);
    }

    public A withEnvFromSourceObject(EnvFromSource envFromSourceObject){
            _visitables.remove(this.object);
            if (envFromSourceObject!=null){ this.object= new EnvFromSourceBuilder(envFromSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EnvFromSourceObjectNested<A> withNewEnvFromSourceObject(){
            return new EnvFromSourceObjectNestedImpl();
    }

    public WatchEventFluent.EnvFromSourceObjectNested<A> withNewEnvFromSourceObjectLike(EnvFromSource item){
            return new EnvFromSourceObjectNestedImpl(item);
    }

    public A withNamespaceSpecObject(NamespaceSpec namespaceSpecObject){
            _visitables.remove(this.object);
            if (namespaceSpecObject!=null){ this.object= new NamespaceSpecBuilder(namespaceSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamespaceSpecObjectNested<A> withNewNamespaceSpecObject(){
            return new NamespaceSpecObjectNestedImpl();
    }

    public WatchEventFluent.NamespaceSpecObjectNested<A> withNewNamespaceSpecObjectLike(NamespaceSpec item){
            return new NamespaceSpecObjectNestedImpl(item);
    }

    public A withRouteObject(Route routeObject){
            _visitables.remove(this.object);
            if (routeObject!=null){ this.object= new RouteBuilder(routeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteObjectNested<A> withNewRouteObject(){
            return new RouteObjectNestedImpl();
    }

    public WatchEventFluent.RouteObjectNested<A> withNewRouteObjectLike(Route item){
            return new RouteObjectNestedImpl(item);
    }

    public A withTypeMetaObject(TypeMeta typeMetaObject){
            _visitables.remove(this.object);
            if (typeMetaObject!=null){ this.object= new TypeMetaBuilder(typeMetaObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TypeMetaObjectNested<A> withNewTypeMetaObject(){
            return new TypeMetaObjectNestedImpl();
    }

    public WatchEventFluent.TypeMetaObjectNested<A> withNewTypeMetaObjectLike(TypeMeta item){
            return new TypeMetaObjectNestedImpl(item);
    }

    public A withNewTypeMetaObject(String apiVersion,String kind){
            return (A)withTypeMetaObject(new TypeMeta(apiVersion, kind));
    }

    public A withIngressBackendObject(IngressBackend ingressBackendObject){
            _visitables.remove(this.object);
            if (ingressBackendObject!=null){ this.object= new IngressBackendBuilder(ingressBackendObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressBackendObjectNested<A> withNewIngressBackendObject(){
            return new IngressBackendObjectNestedImpl();
    }

    public WatchEventFluent.IngressBackendObjectNested<A> withNewIngressBackendObjectLike(IngressBackend item){
            return new IngressBackendObjectNestedImpl(item);
    }

    public A withFlexVolumeSourceObject(FlexVolumeSource flexVolumeSourceObject){
            _visitables.remove(this.object);
            if (flexVolumeSourceObject!=null){ this.object= new FlexVolumeSourceBuilder(flexVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.FlexVolumeSourceObjectNested<A> withNewFlexVolumeSourceObject(){
            return new FlexVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.FlexVolumeSourceObjectNested<A> withNewFlexVolumeSourceObjectLike(FlexVolumeSource item){
            return new FlexVolumeSourceObjectNestedImpl(item);
    }

    public A withRBDVolumeSourceObject(RBDVolumeSource rBDVolumeSourceObject){
            _visitables.remove(this.object);
            if (rBDVolumeSourceObject!=null){ this.object= new RBDVolumeSourceBuilder(rBDVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RBDVolumeSourceObjectNested<A> withNewRBDVolumeSourceObject(){
            return new RBDVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.RBDVolumeSourceObjectNested<A> withNewRBDVolumeSourceObjectLike(RBDVolumeSource item){
            return new RBDVolumeSourceObjectNestedImpl(item);
    }

    public A withResourceQuotaListObject(ResourceQuotaList resourceQuotaListObject){
            _visitables.remove(this.object);
            if (resourceQuotaListObject!=null){ this.object= new ResourceQuotaListBuilder(resourceQuotaListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceQuotaListObjectNested<A> withNewResourceQuotaListObject(){
            return new ResourceQuotaListObjectNestedImpl();
    }

    public WatchEventFluent.ResourceQuotaListObjectNested<A> withNewResourceQuotaListObjectLike(ResourceQuotaList item){
            return new ResourceQuotaListObjectNestedImpl(item);
    }

    public A withNodeConfigStatusObject(NodeConfigStatus nodeConfigStatusObject){
            _visitables.remove(this.object);
            if (nodeConfigStatusObject!=null){ this.object= new NodeConfigStatusBuilder(nodeConfigStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeConfigStatusObjectNested<A> withNewNodeConfigStatusObject(){
            return new NodeConfigStatusObjectNestedImpl();
    }

    public WatchEventFluent.NodeConfigStatusObjectNested<A> withNewNodeConfigStatusObjectLike(NodeConfigStatus item){
            return new NodeConfigStatusObjectNestedImpl(item);
    }

    public A withNetworkPolicyListObject(NetworkPolicyList networkPolicyListObject){
            _visitables.remove(this.object);
            if (networkPolicyListObject!=null){ this.object= new NetworkPolicyListBuilder(networkPolicyListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicyListObjectNested<A> withNewNetworkPolicyListObject(){
            return new NetworkPolicyListObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicyListObjectNested<A> withNewNetworkPolicyListObjectLike(NetworkPolicyList item){
            return new NetworkPolicyListObjectNestedImpl(item);
    }

    public A withAdmissionResponseObject(AdmissionResponse admissionResponseObject){
            _visitables.remove(this.object);
            if (admissionResponseObject!=null){ this.object= new AdmissionResponseBuilder(admissionResponseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AdmissionResponseObjectNested<A> withNewAdmissionResponseObject(){
            return new AdmissionResponseObjectNestedImpl();
    }

    public WatchEventFluent.AdmissionResponseObjectNested<A> withNewAdmissionResponseObjectLike(AdmissionResponse item){
            return new AdmissionResponseObjectNestedImpl(item);
    }

    public A withAdmissionRequestObject(AdmissionRequest admissionRequestObject){
            _visitables.remove(this.object);
            if (admissionRequestObject!=null){ this.object= new AdmissionRequestBuilder(admissionRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AdmissionRequestObjectNested<A> withNewAdmissionRequestObject(){
            return new AdmissionRequestObjectNestedImpl();
    }

    public WatchEventFluent.AdmissionRequestObjectNested<A> withNewAdmissionRequestObjectLike(AdmissionRequest item){
            return new AdmissionRequestObjectNestedImpl(item);
    }

    public A withRawExtensionObject(RawExtension rawExtensionObject){
            _visitables.remove(this.object);
            if (rawExtensionObject!=null){ this.object= new RawExtensionBuilder(rawExtensionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RawExtensionObjectNested<A> withNewRawExtensionObject(){
            return new RawExtensionObjectNestedImpl();
    }

    public WatchEventFluent.RawExtensionObjectNested<A> withNewRawExtensionObjectLike(RawExtension item){
            return new RawExtensionObjectNestedImpl(item);
    }

    public A withNewRawExtensionObject(String raw){
            return (A)withRawExtensionObject(new RawExtension(raw));
    }

    public A withSecurityContextConstraintsListObject(SecurityContextConstraintsList securityContextConstraintsListObject){
            _visitables.remove(this.object);
            if (securityContextConstraintsListObject!=null){ this.object= new SecurityContextConstraintsListBuilder(securityContextConstraintsListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecurityContextConstraintsListObjectNested<A> withNewSecurityContextConstraintsListObject(){
            return new SecurityContextConstraintsListObjectNestedImpl();
    }

    public WatchEventFluent.SecurityContextConstraintsListObjectNested<A> withNewSecurityContextConstraintsListObjectLike(SecurityContextConstraintsList item){
            return new SecurityContextConstraintsListObjectNestedImpl(item);
    }

    public A withBuildConfigListObject(BuildConfigList buildConfigListObject){
            _visitables.remove(this.object);
            if (buildConfigListObject!=null){ this.object= new BuildConfigListBuilder(buildConfigListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildConfigListObjectNested<A> withNewBuildConfigListObject(){
            return new BuildConfigListObjectNestedImpl();
    }

    public WatchEventFluent.BuildConfigListObjectNested<A> withNewBuildConfigListObjectLike(BuildConfigList item){
            return new BuildConfigListObjectNestedImpl(item);
    }

    public A withIdentityListObject(IdentityList identityListObject){
            _visitables.remove(this.object);
            if (identityListObject!=null){ this.object= new IdentityListBuilder(identityListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IdentityListObjectNested<A> withNewIdentityListObject(){
            return new IdentityListObjectNestedImpl();
    }

    public WatchEventFluent.IdentityListObjectNested<A> withNewIdentityListObjectLike(IdentityList item){
            return new IdentityListObjectNestedImpl(item);
    }

    public A withConfigMapProjectionObject(ConfigMapProjection configMapProjectionObject){
            _visitables.remove(this.object);
            if (configMapProjectionObject!=null){ this.object= new ConfigMapProjectionBuilder(configMapProjectionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapProjectionObjectNested<A> withNewConfigMapProjectionObject(){
            return new ConfigMapProjectionObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapProjectionObjectNested<A> withNewConfigMapProjectionObjectLike(ConfigMapProjection item){
            return new ConfigMapProjectionObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionSpecObject(CustomResourceDefinitionSpec customResourceDefinitionSpecObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionSpecObject!=null){ this.object= new CustomResourceDefinitionSpecBuilder(customResourceDefinitionSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionSpecObjectNested<A> withNewCustomResourceDefinitionSpecObject(){
            return new CustomResourceDefinitionSpecObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionSpecObjectNested<A> withNewCustomResourceDefinitionSpecObjectLike(CustomResourceDefinitionSpec item){
            return new CustomResourceDefinitionSpecObjectNestedImpl(item);
    }

    public A withNamespaceObject(Namespace namespaceObject){
            _visitables.remove(this.object);
            if (namespaceObject!=null){ this.object= new NamespaceBuilder(namespaceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamespaceObjectNested<A> withNewNamespaceObject(){
            return new NamespaceObjectNestedImpl();
    }

    public WatchEventFluent.NamespaceObjectNested<A> withNewNamespaceObjectLike(Namespace item){
            return new NamespaceObjectNestedImpl(item);
    }

    public A withContainerStateTerminatedObject(ContainerStateTerminated containerStateTerminatedObject){
            _visitables.remove(this.object);
            if (containerStateTerminatedObject!=null){ this.object= new ContainerStateTerminatedBuilder(containerStateTerminatedObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerStateTerminatedObjectNested<A> withNewContainerStateTerminatedObject(){
            return new ContainerStateTerminatedObjectNestedImpl();
    }

    public WatchEventFluent.ContainerStateTerminatedObjectNested<A> withNewContainerStateTerminatedObjectLike(ContainerStateTerminated item){
            return new ContainerStateTerminatedObjectNestedImpl(item);
    }

    public A withGroupVersionKindObject(GroupVersionKind groupVersionKindObject){
            _visitables.remove(this.object);
            if (groupVersionKindObject!=null){ this.object= new GroupVersionKindBuilder(groupVersionKindObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GroupVersionKindObjectNested<A> withNewGroupVersionKindObject(){
            return new GroupVersionKindObjectNestedImpl();
    }

    public WatchEventFluent.GroupVersionKindObjectNested<A> withNewGroupVersionKindObjectLike(GroupVersionKind item){
            return new GroupVersionKindObjectNestedImpl(item);
    }

    public A withNewGroupVersionKindObject(String group,String kind,String version){
            return (A)withGroupVersionKindObject(new GroupVersionKind(group, kind, version));
    }

    public A withRunAsUserStrategyOptionsObject(RunAsUserStrategyOptions runAsUserStrategyOptionsObject){
            _visitables.remove(this.object);
            if (runAsUserStrategyOptionsObject!=null){ this.object= new RunAsUserStrategyOptionsBuilder(runAsUserStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RunAsUserStrategyOptionsObjectNested<A> withNewRunAsUserStrategyOptionsObject(){
            return new RunAsUserStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.RunAsUserStrategyOptionsObjectNested<A> withNewRunAsUserStrategyOptionsObjectLike(RunAsUserStrategyOptions item){
            return new RunAsUserStrategyOptionsObjectNestedImpl(item);
    }

    public A withNewRunAsUserStrategyOptionsObject(String type,Long uid,Long uidRangeMax,Long uidRangeMin){
            return (A)withRunAsUserStrategyOptionsObject(new RunAsUserStrategyOptions(type, uid, uidRangeMax, uidRangeMin));
    }

    public A withLimitRangeSpecObject(LimitRangeSpec limitRangeSpecObject){
            _visitables.remove(this.object);
            if (limitRangeSpecObject!=null){ this.object= new LimitRangeSpecBuilder(limitRangeSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LimitRangeSpecObjectNested<A> withNewLimitRangeSpecObject(){
            return new LimitRangeSpecObjectNestedImpl();
    }

    public WatchEventFluent.LimitRangeSpecObjectNested<A> withNewLimitRangeSpecObjectLike(LimitRangeSpec item){
            return new LimitRangeSpecObjectNestedImpl(item);
    }

    public A withSourceControlUserObject(SourceControlUser sourceControlUserObject){
            _visitables.remove(this.object);
            if (sourceControlUserObject!=null){ this.object= new SourceControlUserBuilder(sourceControlUserObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SourceControlUserObjectNested<A> withNewSourceControlUserObject(){
            return new SourceControlUserObjectNestedImpl();
    }

    public WatchEventFluent.SourceControlUserObjectNested<A> withNewSourceControlUserObjectLike(SourceControlUser item){
            return new SourceControlUserObjectNestedImpl(item);
    }

    public A withNewSourceControlUserObject(String email,String name){
            return (A)withSourceControlUserObject(new SourceControlUser(email, name));
    }

    public A withContainerStateObject(ContainerState containerStateObject){
            _visitables.remove(this.object);
            if (containerStateObject!=null){ this.object= new ContainerStateBuilder(containerStateObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerStateObjectNested<A> withNewContainerStateObject(){
            return new ContainerStateObjectNestedImpl();
    }

    public WatchEventFluent.ContainerStateObjectNested<A> withNewContainerStateObjectLike(ContainerState item){
            return new ContainerStateObjectNestedImpl(item);
    }

    public A withUserInfoObject(UserInfo userInfoObject){
            _visitables.remove(this.object);
            if (userInfoObject!=null){ this.object= new UserInfoBuilder(userInfoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.UserInfoObjectNested<A> withNewUserInfoObject(){
            return new UserInfoObjectNestedImpl();
    }

    public WatchEventFluent.UserInfoObjectNested<A> withNewUserInfoObjectLike(UserInfo item){
            return new UserInfoObjectNestedImpl(item);
    }

    public A withPersistentVolumeClaimStatusObject(PersistentVolumeClaimStatus persistentVolumeClaimStatusObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimStatusObject!=null){ this.object= new PersistentVolumeClaimStatusBuilder(persistentVolumeClaimStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeClaimStatusObjectNested<A> withNewPersistentVolumeClaimStatusObject(){
            return new PersistentVolumeClaimStatusObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeClaimStatusObjectNested<A> withNewPersistentVolumeClaimStatusObjectLike(PersistentVolumeClaimStatus item){
            return new PersistentVolumeClaimStatusObjectNestedImpl(item);
    }

    public A withServiceSpecObject(ServiceSpec serviceSpecObject){
            _visitables.remove(this.object);
            if (serviceSpecObject!=null){ this.object= new ServiceSpecBuilder(serviceSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceSpecObjectNested<A> withNewServiceSpecObject(){
            return new ServiceSpecObjectNestedImpl();
    }

    public WatchEventFluent.ServiceSpecObjectNested<A> withNewServiceSpecObjectLike(ServiceSpec item){
            return new ServiceSpecObjectNestedImpl(item);
    }

    public A withPhotonPersistentDiskVolumeSourceObject(PhotonPersistentDiskVolumeSource photonPersistentDiskVolumeSourceObject){
            _visitables.remove(this.object);
            if (photonPersistentDiskVolumeSourceObject!=null){ this.object= new PhotonPersistentDiskVolumeSourceBuilder(photonPersistentDiskVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<A> withNewPhotonPersistentDiskVolumeSourceObject(){
            return new PhotonPersistentDiskVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<A> withNewPhotonPersistentDiskVolumeSourceObjectLike(PhotonPersistentDiskVolumeSource item){
            return new PhotonPersistentDiskVolumeSourceObjectNestedImpl(item);
    }

    public A withNewPhotonPersistentDiskVolumeSourceObject(String fsType,String pdID){
            return (A)withPhotonPersistentDiskVolumeSourceObject(new PhotonPersistentDiskVolumeSource(fsType, pdID));
    }

    public A withIngressRuleObject(IngressRule ingressRuleObject){
            _visitables.remove(this.object);
            if (ingressRuleObject!=null){ this.object= new IngressRuleBuilder(ingressRuleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressRuleObjectNested<A> withNewIngressRuleObject(){
            return new IngressRuleObjectNestedImpl();
    }

    public WatchEventFluent.IngressRuleObjectNested<A> withNewIngressRuleObjectLike(IngressRule item){
            return new IngressRuleObjectNestedImpl(item);
    }

    public A withIngressStatusObject(IngressStatus ingressStatusObject){
            _visitables.remove(this.object);
            if (ingressStatusObject!=null){ this.object= new IngressStatusBuilder(ingressStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressStatusObjectNested<A> withNewIngressStatusObject(){
            return new IngressStatusObjectNestedImpl();
    }

    public WatchEventFluent.IngressStatusObjectNested<A> withNewIngressStatusObjectLike(IngressStatus item){
            return new IngressStatusObjectNestedImpl(item);
    }

    public A withImageStreamListObject(ImageStreamList imageStreamListObject){
            _visitables.remove(this.object);
            if (imageStreamListObject!=null){ this.object= new ImageStreamListBuilder(imageStreamListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamListObjectNested<A> withNewImageStreamListObject(){
            return new ImageStreamListObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamListObjectNested<A> withNewImageStreamListObjectLike(ImageStreamList item){
            return new ImageStreamListObjectNestedImpl(item);
    }

    public A withNodeSpecObject(NodeSpec nodeSpecObject){
            _visitables.remove(this.object);
            if (nodeSpecObject!=null){ this.object= new NodeSpecBuilder(nodeSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeSpecObjectNested<A> withNewNodeSpecObject(){
            return new NodeSpecObjectNestedImpl();
    }

    public WatchEventFluent.NodeSpecObjectNested<A> withNewNodeSpecObjectLike(NodeSpec item){
            return new NodeSpecObjectNestedImpl(item);
    }

    public A withLocalSubjectAccessReviewObject(LocalSubjectAccessReview localSubjectAccessReviewObject){
            _visitables.remove(this.object);
            if (localSubjectAccessReviewObject!=null){ this.object= new LocalSubjectAccessReviewBuilder(localSubjectAccessReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObject(){
            return new LocalSubjectAccessReviewObjectNestedImpl();
    }

    public WatchEventFluent.LocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObjectLike(LocalSubjectAccessReview item){
            return new LocalSubjectAccessReviewObjectNestedImpl(item);
    }

    public A withSecretListObject(SecretList secretListObject){
            _visitables.remove(this.object);
            if (secretListObject!=null){ this.object= new SecretListBuilder(secretListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretListObjectNested<A> withNewSecretListObject(){
            return new SecretListObjectNestedImpl();
    }

    public WatchEventFluent.SecretListObjectNested<A> withNewSecretListObjectLike(SecretList item){
            return new SecretListObjectNestedImpl(item);
    }

    public A withNodeAddressObject(NodeAddress nodeAddressObject){
            _visitables.remove(this.object);
            if (nodeAddressObject!=null){ this.object= new NodeAddressBuilder(nodeAddressObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeAddressObjectNested<A> withNewNodeAddressObject(){
            return new NodeAddressObjectNestedImpl();
    }

    public WatchEventFluent.NodeAddressObjectNested<A> withNewNodeAddressObjectLike(NodeAddress item){
            return new NodeAddressObjectNestedImpl(item);
    }

    public A withNewNodeAddressObject(String address,String type){
            return (A)withNodeAddressObject(new NodeAddress(address, type));
    }

    public A withPodAffinityObject(PodAffinity podAffinityObject){
            _visitables.remove(this.object);
            if (podAffinityObject!=null){ this.object= new PodAffinityBuilder(podAffinityObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodAffinityObjectNested<A> withNewPodAffinityObject(){
            return new PodAffinityObjectNestedImpl();
    }

    public WatchEventFluent.PodAffinityObjectNested<A> withNewPodAffinityObjectLike(PodAffinity item){
            return new PodAffinityObjectNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerListObject(HorizontalPodAutoscalerList horizontalPodAutoscalerListObject){
            _visitables.remove(this.object);
            if (horizontalPodAutoscalerListObject!=null){ this.object= new HorizontalPodAutoscalerListBuilder(horizontalPodAutoscalerListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HorizontalPodAutoscalerListObjectNested<A> withNewHorizontalPodAutoscalerListObject(){
            return new HorizontalPodAutoscalerListObjectNestedImpl();
    }

    public WatchEventFluent.HorizontalPodAutoscalerListObjectNested<A> withNewHorizontalPodAutoscalerListObjectLike(HorizontalPodAutoscalerList item){
            return new HorizontalPodAutoscalerListObjectNestedImpl(item);
    }

    public A withServiceObject(Service serviceObject){
            _visitables.remove(this.object);
            if (serviceObject!=null){ this.object= new ServiceBuilder(serviceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceObjectNested<A> withNewServiceObject(){
            return new ServiceObjectNestedImpl();
    }

    public WatchEventFluent.ServiceObjectNested<A> withNewServiceObjectLike(Service item){
            return new ServiceObjectNestedImpl(item);
    }

    public A withExecEnvVarObject(ExecEnvVar execEnvVarObject){
            _visitables.remove(this.object);
            if (execEnvVarObject!=null){ this.object= new ExecEnvVarBuilder(execEnvVarObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExecEnvVarObjectNested<A> withNewExecEnvVarObject(){
            return new ExecEnvVarObjectNestedImpl();
    }

    public WatchEventFluent.ExecEnvVarObjectNested<A> withNewExecEnvVarObjectLike(ExecEnvVar item){
            return new ExecEnvVarObjectNestedImpl(item);
    }

    public A withNewExecEnvVarObject(String name,String value){
            return (A)withExecEnvVarObject(new ExecEnvVar(name, value));
    }

    public A withDeploymentStatusObject(DeploymentStatus deploymentStatusObject){
            _visitables.remove(this.object);
            if (deploymentStatusObject!=null){ this.object= new DeploymentStatusBuilder(deploymentStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentStatusObjectNested<A> withNewDeploymentStatusObject(){
            return new DeploymentStatusObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentStatusObjectNested<A> withNewDeploymentStatusObjectLike(DeploymentStatus item){
            return new DeploymentStatusObjectNestedImpl(item);
    }

    public A withEventSeriesObject(EventSeries eventSeriesObject){
            _visitables.remove(this.object);
            if (eventSeriesObject!=null){ this.object= new EventSeriesBuilder(eventSeriesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EventSeriesObjectNested<A> withNewEventSeriesObject(){
            return new EventSeriesObjectNestedImpl();
    }

    public WatchEventFluent.EventSeriesObjectNested<A> withNewEventSeriesObjectLike(EventSeries item){
            return new EventSeriesObjectNestedImpl(item);
    }

    public A withInitializersObject(Initializers initializersObject){
            _visitables.remove(this.object);
            if (initializersObject!=null){ this.object= new InitializersBuilder(initializersObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.InitializersObjectNested<A> withNewInitializersObject(){
            return new InitializersObjectNestedImpl();
    }

    public WatchEventFluent.InitializersObjectNested<A> withNewInitializersObjectLike(Initializers item){
            return new InitializersObjectNestedImpl(item);
    }

    public A withContainerImageObject(ContainerImage containerImageObject){
            _visitables.remove(this.object);
            if (containerImageObject!=null){ this.object= new ContainerImageBuilder(containerImageObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerImageObjectNested<A> withNewContainerImageObject(){
            return new ContainerImageObjectNestedImpl();
    }

    public WatchEventFluent.ContainerImageObjectNested<A> withNewContainerImageObjectLike(ContainerImage item){
            return new ContainerImageObjectNestedImpl(item);
    }

    public A withNodeStatusObject(NodeStatus nodeStatusObject){
            _visitables.remove(this.object);
            if (nodeStatusObject!=null){ this.object= new NodeStatusBuilder(nodeStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeStatusObjectNested<A> withNewNodeStatusObject(){
            return new NodeStatusObjectNestedImpl();
    }

    public WatchEventFluent.NodeStatusObjectNested<A> withNewNodeStatusObjectLike(NodeStatus item){
            return new NodeStatusObjectNestedImpl(item);
    }

    public A withReplicationControllerObject(ReplicationController replicationControllerObject){
            _visitables.remove(this.object);
            if (replicationControllerObject!=null){ this.object= new ReplicationControllerBuilder(replicationControllerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObject(){
            return new ReplicationControllerObjectNestedImpl();
    }

    public WatchEventFluent.ReplicationControllerObjectNested<A> withNewReplicationControllerObjectLike(ReplicationController item){
            return new ReplicationControllerObjectNestedImpl(item);
    }

    public A withConfigMapListObject(ConfigMapList configMapListObject){
            _visitables.remove(this.object);
            if (configMapListObject!=null){ this.object= new ConfigMapListBuilder(configMapListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapListObjectNested<A> withNewConfigMapListObject(){
            return new ConfigMapListObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapListObjectNested<A> withNewConfigMapListObjectLike(ConfigMapList item){
            return new ConfigMapListObjectNestedImpl(item);
    }

    public A withSubjectAccessReviewObject(SubjectAccessReview subjectAccessReviewObject){
            _visitables.remove(this.object);
            if (subjectAccessReviewObject!=null){ this.object= new SubjectAccessReviewBuilder(subjectAccessReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObject(){
            return new SubjectAccessReviewObjectNestedImpl();
    }

    public WatchEventFluent.SubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObjectLike(SubjectAccessReview item){
            return new SubjectAccessReviewObjectNestedImpl(item);
    }

    public A withPreferredSchedulingTermObject(PreferredSchedulingTerm preferredSchedulingTermObject){
            _visitables.remove(this.object);
            if (preferredSchedulingTermObject!=null){ this.object= new PreferredSchedulingTermBuilder(preferredSchedulingTermObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PreferredSchedulingTermObjectNested<A> withNewPreferredSchedulingTermObject(){
            return new PreferredSchedulingTermObjectNestedImpl();
    }

    public WatchEventFluent.PreferredSchedulingTermObjectNested<A> withNewPreferredSchedulingTermObjectLike(PreferredSchedulingTerm item){
            return new PreferredSchedulingTermObjectNestedImpl(item);
    }

    public A withExternalDocumentationObject(ExternalDocumentation externalDocumentationObject){
            _visitables.remove(this.object);
            if (externalDocumentationObject!=null){ this.object= new ExternalDocumentationBuilder(externalDocumentationObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExternalDocumentationObjectNested<A> withNewExternalDocumentationObject(){
            return new ExternalDocumentationObjectNestedImpl();
    }

    public WatchEventFluent.ExternalDocumentationObjectNested<A> withNewExternalDocumentationObjectLike(ExternalDocumentation item){
            return new ExternalDocumentationObjectNestedImpl(item);
    }

    public A withNewExternalDocumentationObject(String description,String url){
            return (A)withExternalDocumentationObject(new ExternalDocumentation(description, url));
    }

    public A withImageLookupPolicyObject(ImageLookupPolicy imageLookupPolicyObject){
            _visitables.remove(this.object);
            if (imageLookupPolicyObject!=null){ this.object= new ImageLookupPolicyBuilder(imageLookupPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageLookupPolicyObjectNested<A> withNewImageLookupPolicyObject(){
            return new ImageLookupPolicyObjectNestedImpl();
    }

    public WatchEventFluent.ImageLookupPolicyObjectNested<A> withNewImageLookupPolicyObjectLike(ImageLookupPolicy item){
            return new ImageLookupPolicyObjectNestedImpl(item);
    }

    public A withNewImageLookupPolicyObject(Boolean local){
            return (A)withImageLookupPolicyObject(new ImageLookupPolicy(local));
    }

    public A withMutatingWebhookConfigurationListObject(MutatingWebhookConfigurationList mutatingWebhookConfigurationListObject){
            _visitables.remove(this.object);
            if (mutatingWebhookConfigurationListObject!=null){ this.object= new MutatingWebhookConfigurationListBuilder(mutatingWebhookConfigurationListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.MutatingWebhookConfigurationListObjectNested<A> withNewMutatingWebhookConfigurationListObject(){
            return new MutatingWebhookConfigurationListObjectNestedImpl();
    }

    public WatchEventFluent.MutatingWebhookConfigurationListObjectNested<A> withNewMutatingWebhookConfigurationListObjectLike(MutatingWebhookConfigurationList item){
            return new MutatingWebhookConfigurationListObjectNestedImpl(item);
    }

    public A withAllowedFlexVolumeObject(io.fabric8.openshift.api.model.AllowedFlexVolume allowedFlexVolumeObject){
            _visitables.remove(this.object);
            if (allowedFlexVolumeObject!=null){ this.object= new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(allowedFlexVolumeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelAllowedFlexVolumeObjectNested<A> withNewModelAllowedFlexVolumeObject(){
            return new ModelAllowedFlexVolumeObjectNestedImpl();
    }

    public WatchEventFluent.ModelAllowedFlexVolumeObjectNested<A> withNewAllowedFlexVolumeObjectLike(io.fabric8.openshift.api.model.AllowedFlexVolume item){
            return new ModelAllowedFlexVolumeObjectNestedImpl(item);
    }

    public A withNewModelAllowedFlexVolumeObject(String driver){
            return (A)withAllowedFlexVolumeObject(new AllowedFlexVolume(driver));
    }

    public A withSubjectAccessReviewObject(io.fabric8.openshift.api.model.SubjectAccessReview subjectAccessReviewObject){
            _visitables.remove(this.object);
            if (subjectAccessReviewObject!=null){ this.object= new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder(subjectAccessReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelSubjectAccessReviewObjectNested<A> withNewModelSubjectAccessReviewObject(){
            return new ModelSubjectAccessReviewObjectNestedImpl();
    }

    public WatchEventFluent.ModelSubjectAccessReviewObjectNested<A> withNewSubjectAccessReviewObjectLike(io.fabric8.openshift.api.model.SubjectAccessReview item){
            return new ModelSubjectAccessReviewObjectNestedImpl(item);
    }

    public A withPodPresetListObject(PodPresetList podPresetListObject){
            _visitables.remove(this.object);
            if (podPresetListObject!=null){ this.object= new PodPresetListBuilder(podPresetListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodPresetListObjectNested<A> withNewPodPresetListObject(){
            return new PodPresetListObjectNestedImpl();
    }

    public WatchEventFluent.PodPresetListObjectNested<A> withNewPodPresetListObjectLike(PodPresetList item){
            return new PodPresetListObjectNestedImpl(item);
    }

    public A withMutatingWebhookConfigurationObject(MutatingWebhookConfiguration mutatingWebhookConfigurationObject){
            _visitables.remove(this.object);
            if (mutatingWebhookConfigurationObject!=null){ this.object= new MutatingWebhookConfigurationBuilder(mutatingWebhookConfigurationObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObject(){
            return new MutatingWebhookConfigurationObjectNestedImpl();
    }

    public WatchEventFluent.MutatingWebhookConfigurationObjectNested<A> withNewMutatingWebhookConfigurationObjectLike(MutatingWebhookConfiguration item){
            return new MutatingWebhookConfigurationObjectNestedImpl(item);
    }

    public A withVolumeMountObject(VolumeMount volumeMountObject){
            _visitables.remove(this.object);
            if (volumeMountObject!=null){ this.object= new VolumeMountBuilder(volumeMountObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.VolumeMountObjectNested<A> withNewVolumeMountObject(){
            return new VolumeMountObjectNestedImpl();
    }

    public WatchEventFluent.VolumeMountObjectNested<A> withNewVolumeMountObjectLike(VolumeMount item){
            return new VolumeMountObjectNestedImpl(item);
    }

    public A withNewVolumeMountObject(String mountPath,String mountPropagation,String name,Boolean readOnly,String subPath){
            return (A)withVolumeMountObject(new VolumeMount(mountPath, mountPropagation, name, readOnly, subPath));
    }

    public A withLabelSelectorObject(LabelSelector labelSelectorObject){
            _visitables.remove(this.object);
            if (labelSelectorObject!=null){ this.object= new LabelSelectorBuilder(labelSelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LabelSelectorObjectNested<A> withNewLabelSelectorObject(){
            return new LabelSelectorObjectNestedImpl();
    }

    public WatchEventFluent.LabelSelectorObjectNested<A> withNewLabelSelectorObjectLike(LabelSelector item){
            return new LabelSelectorObjectNestedImpl(item);
    }

    public A withCronJobStatusObject(CronJobStatus cronJobStatusObject){
            _visitables.remove(this.object);
            if (cronJobStatusObject!=null){ this.object= new CronJobStatusBuilder(cronJobStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CronJobStatusObjectNested<A> withNewCronJobStatusObject(){
            return new CronJobStatusObjectNestedImpl();
    }

    public WatchEventFluent.CronJobStatusObjectNested<A> withNewCronJobStatusObjectLike(CronJobStatus item){
            return new CronJobStatusObjectNestedImpl(item);
    }

    public A withBuildSpecObject(BuildSpec buildSpecObject){
            _visitables.remove(this.object);
            if (buildSpecObject!=null){ this.object= new BuildSpecBuilder(buildSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildSpecObjectNested<A> withNewBuildSpecObject(){
            return new BuildSpecObjectNestedImpl();
    }

    public WatchEventFluent.BuildSpecObjectNested<A> withNewBuildSpecObjectLike(BuildSpec item){
            return new BuildSpecObjectNestedImpl(item);
    }

    public A withStatusCauseObject(StatusCause statusCauseObject){
            _visitables.remove(this.object);
            if (statusCauseObject!=null){ this.object= new StatusCauseBuilder(statusCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatusCauseObjectNested<A> withNewStatusCauseObject(){
            return new StatusCauseObjectNestedImpl();
    }

    public WatchEventFluent.StatusCauseObjectNested<A> withNewStatusCauseObjectLike(StatusCause item){
            return new StatusCauseObjectNestedImpl(item);
    }

    public A withNewStatusCauseObject(String field,String message,String reason){
            return (A)withStatusCauseObject(new StatusCause(field, message, reason));
    }

    public A withProjectStatusObject(ProjectStatus projectStatusObject){
            _visitables.remove(this.object);
            if (projectStatusObject!=null){ this.object= new ProjectStatusBuilder(projectStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProjectStatusObjectNested<A> withNewProjectStatusObject(){
            return new ProjectStatusObjectNestedImpl();
    }

    public WatchEventFluent.ProjectStatusObjectNested<A> withNewProjectStatusObjectLike(ProjectStatus item){
            return new ProjectStatusObjectNestedImpl(item);
    }

    public A withNewProjectStatusObject(String phase){
            return (A)withProjectStatusObject(new ProjectStatus(phase));
    }

    public A withNamedClusterObject(NamedCluster namedClusterObject){
            _visitables.remove(this.object);
            if (namedClusterObject!=null){ this.object= new NamedClusterBuilder(namedClusterObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamedClusterObjectNested<A> withNewNamedClusterObject(){
            return new NamedClusterObjectNestedImpl();
    }

    public WatchEventFluent.NamedClusterObjectNested<A> withNewNamedClusterObjectLike(NamedCluster item){
            return new NamedClusterObjectNestedImpl(item);
    }

    public A withGitSourceRevisionObject(GitSourceRevision gitSourceRevisionObject){
            _visitables.remove(this.object);
            if (gitSourceRevisionObject!=null){ this.object= new GitSourceRevisionBuilder(gitSourceRevisionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GitSourceRevisionObjectNested<A> withNewGitSourceRevisionObject(){
            return new GitSourceRevisionObjectNestedImpl();
    }

    public WatchEventFluent.GitSourceRevisionObjectNested<A> withNewGitSourceRevisionObjectLike(GitSourceRevision item){
            return new GitSourceRevisionObjectNestedImpl(item);
    }

    public A withStatusDetailsObject(StatusDetails statusDetailsObject){
            _visitables.remove(this.object);
            if (statusDetailsObject!=null){ this.object= new StatusDetailsBuilder(statusDetailsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatusDetailsObjectNested<A> withNewStatusDetailsObject(){
            return new StatusDetailsObjectNestedImpl();
    }

    public WatchEventFluent.StatusDetailsObjectNested<A> withNewStatusDetailsObjectLike(StatusDetails item){
            return new StatusDetailsObjectNestedImpl(item);
    }

    public A withImageChangeTriggerObject(ImageChangeTrigger imageChangeTriggerObject){
            _visitables.remove(this.object);
            if (imageChangeTriggerObject!=null){ this.object= new ImageChangeTriggerBuilder(imageChangeTriggerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageChangeTriggerObjectNested<A> withNewImageChangeTriggerObject(){
            return new ImageChangeTriggerObjectNestedImpl();
    }

    public WatchEventFluent.ImageChangeTriggerObjectNested<A> withNewImageChangeTriggerObjectLike(ImageChangeTrigger item){
            return new ImageChangeTriggerObjectNestedImpl(item);
    }

    public A withSysctlObject(Sysctl sysctlObject){
            _visitables.remove(this.object);
            if (sysctlObject!=null){ this.object= new SysctlBuilder(sysctlObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SysctlObjectNested<A> withNewSysctlObject(){
            return new SysctlObjectNestedImpl();
    }

    public WatchEventFluent.SysctlObjectNested<A> withNewSysctlObjectLike(Sysctl item){
            return new SysctlObjectNestedImpl(item);
    }

    public A withNewSysctlObject(String name,String value){
            return (A)withSysctlObject(new Sysctl(name, value));
    }

    public A withHorizontalPodAutoscalerObject(HorizontalPodAutoscaler horizontalPodAutoscalerObject){
            _visitables.remove(this.object);
            if (horizontalPodAutoscalerObject!=null){ this.object= new HorizontalPodAutoscalerBuilder(horizontalPodAutoscalerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObject(){
            return new HorizontalPodAutoscalerObjectNestedImpl();
    }

    public WatchEventFluent.HorizontalPodAutoscalerObjectNested<A> withNewHorizontalPodAutoscalerObjectLike(HorizontalPodAutoscaler item){
            return new HorizontalPodAutoscalerObjectNestedImpl(item);
    }

    public A withImageStreamImportSpecObject(ImageStreamImportSpec imageStreamImportSpecObject){
            _visitables.remove(this.object);
            if (imageStreamImportSpecObject!=null){ this.object= new ImageStreamImportSpecBuilder(imageStreamImportSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamImportSpecObjectNested<A> withNewImageStreamImportSpecObject(){
            return new ImageStreamImportSpecObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamImportSpecObjectNested<A> withNewImageStreamImportSpecObjectLike(ImageStreamImportSpec item){
            return new ImageStreamImportSpecObjectNestedImpl(item);
    }

    public A withFSGroupStrategyOptionsObject(io.fabric8.openshift.api.model.FSGroupStrategyOptions fSGroupStrategyOptionsObject){
            _visitables.remove(this.object);
            if (fSGroupStrategyOptionsObject!=null){ this.object= new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder(fSGroupStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<A> withNewModelFSGroupStrategyOptionsObject(){
            return new ModelFSGroupStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<A> withNewFSGroupStrategyOptionsObjectLike(io.fabric8.openshift.api.model.FSGroupStrategyOptions item){
            return new ModelFSGroupStrategyOptionsObjectNestedImpl(item);
    }

    public A withScaleObject(Scale scaleObject){
            _visitables.remove(this.object);
            if (scaleObject!=null){ this.object= new ScaleBuilder(scaleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScaleObjectNested<A> withNewScaleObject(){
            return new ScaleObjectNestedImpl();
    }

    public WatchEventFluent.ScaleObjectNested<A> withNewScaleObjectLike(Scale item){
            return new ScaleObjectNestedImpl(item);
    }

    public A withStatusObject(Status statusObject){
            _visitables.remove(this.object);
            if (statusObject!=null){ this.object= new StatusBuilder(statusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatusObjectNested<A> withNewStatusObject(){
            return new StatusObjectNestedImpl();
    }

    public WatchEventFluent.StatusObjectNested<A> withNewStatusObjectLike(Status item){
            return new StatusObjectNestedImpl(item);
    }

    public A withDeleteOptionsObject(DeleteOptions deleteOptionsObject){
            _visitables.remove(this.object);
            if (deleteOptionsObject!=null){ this.object= new DeleteOptionsBuilder(deleteOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeleteOptionsObjectNested<A> withNewDeleteOptionsObject(){
            return new DeleteOptionsObjectNestedImpl();
    }

    public WatchEventFluent.DeleteOptionsObjectNested<A> withNewDeleteOptionsObjectLike(DeleteOptions item){
            return new DeleteOptionsObjectNestedImpl(item);
    }

    public A withContainerStatusObject(ContainerStatus containerStatusObject){
            _visitables.remove(this.object);
            if (containerStatusObject!=null){ this.object= new ContainerStatusBuilder(containerStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerStatusObjectNested<A> withNewContainerStatusObject(){
            return new ContainerStatusObjectNestedImpl();
    }

    public WatchEventFluent.ContainerStatusObjectNested<A> withNewContainerStatusObjectLike(ContainerStatus item){
            return new ContainerStatusObjectNestedImpl(item);
    }

    public A withConfigMapEnvSourceObject(ConfigMapEnvSource configMapEnvSourceObject){
            _visitables.remove(this.object);
            if (configMapEnvSourceObject!=null){ this.object= new ConfigMapEnvSourceBuilder(configMapEnvSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapEnvSourceObjectNested<A> withNewConfigMapEnvSourceObject(){
            return new ConfigMapEnvSourceObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapEnvSourceObjectNested<A> withNewConfigMapEnvSourceObjectLike(ConfigMapEnvSource item){
            return new ConfigMapEnvSourceObjectNestedImpl(item);
    }

    public A withNewConfigMapEnvSourceObject(String name,Boolean optional){
            return (A)withConfigMapEnvSourceObject(new ConfigMapEnvSource(name, optional));
    }

    public A withDeploymentSpecObject(DeploymentSpec deploymentSpecObject){
            _visitables.remove(this.object);
            if (deploymentSpecObject!=null){ this.object= new DeploymentSpecBuilder(deploymentSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentSpecObjectNested<A> withNewDeploymentSpecObject(){
            return new DeploymentSpecObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentSpecObjectNested<A> withNewDeploymentSpecObjectLike(DeploymentSpec item){
            return new DeploymentSpecObjectNestedImpl(item);
    }

    public A withCertificateSigningRequestStatusObject(CertificateSigningRequestStatus certificateSigningRequestStatusObject){
            _visitables.remove(this.object);
            if (certificateSigningRequestStatusObject!=null){ this.object= new CertificateSigningRequestStatusBuilder(certificateSigningRequestStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CertificateSigningRequestStatusObjectNested<A> withNewCertificateSigningRequestStatusObject(){
            return new CertificateSigningRequestStatusObjectNestedImpl();
    }

    public WatchEventFluent.CertificateSigningRequestStatusObjectNested<A> withNewCertificateSigningRequestStatusObjectLike(CertificateSigningRequestStatus item){
            return new CertificateSigningRequestStatusObjectNestedImpl(item);
    }

    public A withNodeSelectorRequirementObject(NodeSelectorRequirement nodeSelectorRequirementObject){
            _visitables.remove(this.object);
            if (nodeSelectorRequirementObject!=null){ this.object= new NodeSelectorRequirementBuilder(nodeSelectorRequirementObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeSelectorRequirementObjectNested<A> withNewNodeSelectorRequirementObject(){
            return new NodeSelectorRequirementObjectNestedImpl();
    }

    public WatchEventFluent.NodeSelectorRequirementObjectNested<A> withNewNodeSelectorRequirementObjectLike(NodeSelectorRequirement item){
            return new NodeSelectorRequirementObjectNestedImpl(item);
    }

    public A withRecreateDeploymentStrategyParamsObject(RecreateDeploymentStrategyParams recreateDeploymentStrategyParamsObject){
            _visitables.remove(this.object);
            if (recreateDeploymentStrategyParamsObject!=null){ this.object= new RecreateDeploymentStrategyParamsBuilder(recreateDeploymentStrategyParamsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<A> withNewRecreateDeploymentStrategyParamsObject(){
            return new RecreateDeploymentStrategyParamsObjectNestedImpl();
    }

    public WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<A> withNewRecreateDeploymentStrategyParamsObjectLike(RecreateDeploymentStrategyParams item){
            return new RecreateDeploymentStrategyParamsObjectNestedImpl(item);
    }

    public A withDockerStrategyOptionsObject(DockerStrategyOptions dockerStrategyOptionsObject){
            _visitables.remove(this.object);
            if (dockerStrategyOptionsObject!=null){ this.object= new DockerStrategyOptionsBuilder(dockerStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DockerStrategyOptionsObjectNested<A> withNewDockerStrategyOptionsObject(){
            return new DockerStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.DockerStrategyOptionsObjectNested<A> withNewDockerStrategyOptionsObjectLike(DockerStrategyOptions item){
            return new DockerStrategyOptionsObjectNestedImpl(item);
    }

    public A withImageListObject(ImageList imageListObject){
            _visitables.remove(this.object);
            if (imageListObject!=null){ this.object= new ImageListBuilder(imageListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageListObjectNested<A> withNewImageListObject(){
            return new ImageListObjectNestedImpl();
    }

    public WatchEventFluent.ImageListObjectNested<A> withNewImageListObjectLike(ImageList item){
            return new ImageListObjectNestedImpl(item);
    }

    public A withConfigMapBuildSourceObject(ConfigMapBuildSource configMapBuildSourceObject){
            _visitables.remove(this.object);
            if (configMapBuildSourceObject!=null){ this.object= new ConfigMapBuildSourceBuilder(configMapBuildSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapBuildSourceObjectNested<A> withNewConfigMapBuildSourceObject(){
            return new ConfigMapBuildSourceObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapBuildSourceObjectNested<A> withNewConfigMapBuildSourceObjectLike(ConfigMapBuildSource item){
            return new ConfigMapBuildSourceObjectNestedImpl(item);
    }

    public A withReplicaSetListObject(ReplicaSetList replicaSetListObject){
            _visitables.remove(this.object);
            if (replicaSetListObject!=null){ this.object= new ReplicaSetListBuilder(replicaSetListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicaSetListObjectNested<A> withNewReplicaSetListObject(){
            return new ReplicaSetListObjectNestedImpl();
    }

    public WatchEventFluent.ReplicaSetListObjectNested<A> withNewReplicaSetListObjectLike(ReplicaSetList item){
            return new ReplicaSetListObjectNestedImpl(item);
    }

    public A withPodTemplateListObject(PodTemplateList podTemplateListObject){
            _visitables.remove(this.object);
            if (podTemplateListObject!=null){ this.object= new PodTemplateListBuilder(podTemplateListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodTemplateListObjectNested<A> withNewPodTemplateListObject(){
            return new PodTemplateListObjectNestedImpl();
    }

    public WatchEventFluent.PodTemplateListObjectNested<A> withNewPodTemplateListObjectLike(PodTemplateList item){
            return new PodTemplateListObjectNestedImpl(item);
    }

    public A withImageObject(Image imageObject){
            _visitables.remove(this.object);
            if (imageObject!=null){ this.object= new ImageBuilder(imageObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageObjectNested<A> withNewImageObject(){
            return new ImageObjectNestedImpl();
    }

    public WatchEventFluent.ImageObjectNested<A> withNewImageObjectLike(Image item){
            return new ImageObjectNestedImpl(item);
    }

    public A withTLSConfigObject(TLSConfig tLSConfigObject){
            _visitables.remove(this.object);
            if (tLSConfigObject!=null){ this.object= new TLSConfigBuilder(tLSConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TLSConfigObjectNested<A> withNewTLSConfigObject(){
            return new TLSConfigObjectNestedImpl();
    }

    public WatchEventFluent.TLSConfigObjectNested<A> withNewTLSConfigObjectLike(TLSConfig item){
            return new TLSConfigObjectNestedImpl(item);
    }

    public A withEndpointAddressObject(EndpointAddress endpointAddressObject){
            _visitables.remove(this.object);
            if (endpointAddressObject!=null){ this.object= new EndpointAddressBuilder(endpointAddressObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EndpointAddressObjectNested<A> withNewEndpointAddressObject(){
            return new EndpointAddressObjectNestedImpl();
    }

    public WatchEventFluent.EndpointAddressObjectNested<A> withNewEndpointAddressObjectLike(EndpointAddress item){
            return new EndpointAddressObjectNestedImpl(item);
    }

    public A withBuildStatusObject(BuildStatus buildStatusObject){
            _visitables.remove(this.object);
            if (buildStatusObject!=null){ this.object= new BuildStatusBuilder(buildStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildStatusObjectNested<A> withNewBuildStatusObject(){
            return new BuildStatusObjectNestedImpl();
    }

    public WatchEventFluent.BuildStatusObjectNested<A> withNewBuildStatusObjectLike(BuildStatus item){
            return new BuildStatusObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionConditionObject(CustomResourceDefinitionCondition customResourceDefinitionConditionObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionConditionObject!=null){ this.object= new CustomResourceDefinitionConditionBuilder(customResourceDefinitionConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionConditionObjectNested<A> withNewCustomResourceDefinitionConditionObject(){
            return new CustomResourceDefinitionConditionObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionConditionObjectNested<A> withNewCustomResourceDefinitionConditionObjectLike(CustomResourceDefinitionCondition item){
            return new CustomResourceDefinitionConditionObjectNestedImpl(item);
    }

    public A withNewCustomResourceDefinitionConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withCustomResourceDefinitionConditionObject(new CustomResourceDefinitionCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withNodeConfigSourceObject(NodeConfigSource nodeConfigSourceObject){
            _visitables.remove(this.object);
            if (nodeConfigSourceObject!=null){ this.object= new NodeConfigSourceBuilder(nodeConfigSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeConfigSourceObjectNested<A> withNewNodeConfigSourceObject(){
            return new NodeConfigSourceObjectNestedImpl();
    }

    public WatchEventFluent.NodeConfigSourceObjectNested<A> withNewNodeConfigSourceObjectLike(NodeConfigSource item){
            return new NodeConfigSourceObjectNestedImpl(item);
    }

    public A withImageSourceObject(ImageSource imageSourceObject){
            _visitables.remove(this.object);
            if (imageSourceObject!=null){ this.object= new ImageSourceBuilder(imageSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageSourceObjectNested<A> withNewImageSourceObject(){
            return new ImageSourceObjectNestedImpl();
    }

    public WatchEventFluent.ImageSourceObjectNested<A> withNewImageSourceObjectLike(ImageSource item){
            return new ImageSourceObjectNestedImpl(item);
    }

    public A withVsphereVirtualDiskVolumeSourceObject(VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSourceObject){
            _visitables.remove(this.object);
            if (vsphereVirtualDiskVolumeSourceObject!=null){ this.object= new VsphereVirtualDiskVolumeSourceBuilder(vsphereVirtualDiskVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<A> withNewVsphereVirtualDiskVolumeSourceObject(){
            return new VsphereVirtualDiskVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<A> withNewVsphereVirtualDiskVolumeSourceObjectLike(VsphereVirtualDiskVolumeSource item){
            return new VsphereVirtualDiskVolumeSourceObjectNestedImpl(item);
    }

    public A withNewVsphereVirtualDiskVolumeSourceObject(String fsType,String storagePolicyID,String storagePolicyName,String volumePath){
            return (A)withVsphereVirtualDiskVolumeSourceObject(new VsphereVirtualDiskVolumeSource(fsType, storagePolicyID, storagePolicyName, volumePath));
    }

    public A withRuleObject(Rule ruleObject){
            _visitables.remove(this.object);
            if (ruleObject!=null){ this.object= new RuleBuilder(ruleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RuleObjectNested<A> withNewRuleObject(){
            return new RuleObjectNestedImpl();
    }

    public WatchEventFluent.RuleObjectNested<A> withNewRuleObjectLike(Rule item){
            return new RuleObjectNestedImpl(item);
    }

    public A withTagReferenceObject(TagReference tagReferenceObject){
            _visitables.remove(this.object);
            if (tagReferenceObject!=null){ this.object= new TagReferenceBuilder(tagReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TagReferenceObjectNested<A> withNewTagReferenceObject(){
            return new TagReferenceObjectNestedImpl();
    }

    public WatchEventFluent.TagReferenceObjectNested<A> withNewTagReferenceObjectLike(TagReference item){
            return new TagReferenceObjectNestedImpl(item);
    }

    public A withCrossVersionObjectReference(CrossVersionObjectReference crossVersionObjectReference){
            _visitables.remove(this.object);
            if (crossVersionObjectReference!=null){ this.object= new CrossVersionObjectReferenceBuilder(crossVersionObjectReference); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CrossVersionObjectReferenceNested<A> withNewCrossVersionObjectReference(){
            return new CrossVersionObjectReferenceNestedImpl();
    }

    public WatchEventFluent.CrossVersionObjectReferenceNested<A> withNewCrossVersionObjectReferenceLike(CrossVersionObjectReference item){
            return new CrossVersionObjectReferenceNestedImpl(item);
    }

    public A withNewCrossVersionObjectReference(String apiVersion,String kind,String name){
            return (A)withCrossVersionObjectReference(new CrossVersionObjectReference(apiVersion, kind, name));
    }

    public A withLabelSelectorRequirementObject(LabelSelectorRequirement labelSelectorRequirementObject){
            _visitables.remove(this.object);
            if (labelSelectorRequirementObject!=null){ this.object= new LabelSelectorRequirementBuilder(labelSelectorRequirementObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LabelSelectorRequirementObjectNested<A> withNewLabelSelectorRequirementObject(){
            return new LabelSelectorRequirementObjectNestedImpl();
    }

    public WatchEventFluent.LabelSelectorRequirementObjectNested<A> withNewLabelSelectorRequirementObjectLike(LabelSelectorRequirement item){
            return new LabelSelectorRequirementObjectNestedImpl(item);
    }

    public A withCustomResourceSubresourcesObject(CustomResourceSubresources customResourceSubresourcesObject){
            _visitables.remove(this.object);
            if (customResourceSubresourcesObject!=null){ this.object= new CustomResourceSubresourcesBuilder(customResourceSubresourcesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceSubresourcesObjectNested<A> withNewCustomResourceSubresourcesObject(){
            return new CustomResourceSubresourcesObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceSubresourcesObjectNested<A> withNewCustomResourceSubresourcesObjectLike(CustomResourceSubresources item){
            return new CustomResourceSubresourcesObjectNestedImpl(item);
    }

    public A withDaemonSetUpdateStrategyObject(DaemonSetUpdateStrategy daemonSetUpdateStrategyObject){
            _visitables.remove(this.object);
            if (daemonSetUpdateStrategyObject!=null){ this.object= new DaemonSetUpdateStrategyBuilder(daemonSetUpdateStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonSetUpdateStrategyObjectNested<A> withNewDaemonSetUpdateStrategyObject(){
            return new DaemonSetUpdateStrategyObjectNestedImpl();
    }

    public WatchEventFluent.DaemonSetUpdateStrategyObjectNested<A> withNewDaemonSetUpdateStrategyObjectLike(DaemonSetUpdateStrategy item){
            return new DaemonSetUpdateStrategyObjectNestedImpl(item);
    }

    public A withReplicaSetObject(ReplicaSet replicaSetObject){
            _visitables.remove(this.object);
            if (replicaSetObject!=null){ this.object= new ReplicaSetBuilder(replicaSetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicaSetObjectNested<A> withNewReplicaSetObject(){
            return new ReplicaSetObjectNestedImpl();
    }

    public WatchEventFluent.ReplicaSetObjectNested<A> withNewReplicaSetObjectLike(ReplicaSet item){
            return new ReplicaSetObjectNestedImpl(item);
    }

    public A withGitRepoVolumeSourceObject(GitRepoVolumeSource gitRepoVolumeSourceObject){
            _visitables.remove(this.object);
            if (gitRepoVolumeSourceObject!=null){ this.object= new GitRepoVolumeSourceBuilder(gitRepoVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GitRepoVolumeSourceObjectNested<A> withNewGitRepoVolumeSourceObject(){
            return new GitRepoVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.GitRepoVolumeSourceObjectNested<A> withNewGitRepoVolumeSourceObjectLike(GitRepoVolumeSource item){
            return new GitRepoVolumeSourceObjectNestedImpl(item);
    }

    public A withNewGitRepoVolumeSourceObject(String directory,String repository,String revision){
            return (A)withGitRepoVolumeSourceObject(new GitRepoVolumeSource(directory, repository, revision));
    }

    public A withAggregationRuleObject(AggregationRule aggregationRuleObject){
            _visitables.remove(this.object);
            if (aggregationRuleObject!=null){ this.object= new AggregationRuleBuilder(aggregationRuleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AggregationRuleObjectNested<A> withNewAggregationRuleObject(){
            return new AggregationRuleObjectNestedImpl();
    }

    public WatchEventFluent.AggregationRuleObjectNested<A> withNewAggregationRuleObjectLike(AggregationRule item){
            return new AggregationRuleObjectNestedImpl(item);
    }

    public A withEndpointsListObject(EndpointsList endpointsListObject){
            _visitables.remove(this.object);
            if (endpointsListObject!=null){ this.object= new EndpointsListBuilder(endpointsListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EndpointsListObjectNested<A> withNewEndpointsListObject(){
            return new EndpointsListObjectNestedImpl();
    }

    public WatchEventFluent.EndpointsListObjectNested<A> withNewEndpointsListObjectLike(EndpointsList item){
            return new EndpointsListObjectNestedImpl(item);
    }

    public A withGroupVersionResourceObject(GroupVersionResource groupVersionResourceObject){
            _visitables.remove(this.object);
            if (groupVersionResourceObject!=null){ this.object= new GroupVersionResourceBuilder(groupVersionResourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GroupVersionResourceObjectNested<A> withNewGroupVersionResourceObject(){
            return new GroupVersionResourceObjectNestedImpl();
    }

    public WatchEventFluent.GroupVersionResourceObjectNested<A> withNewGroupVersionResourceObjectLike(GroupVersionResource item){
            return new GroupVersionResourceObjectNestedImpl(item);
    }

    public A withNewGroupVersionResourceObject(String group,String resource,String version){
            return (A)withGroupVersionResourceObject(new GroupVersionResource(group, resource, version));
    }

    public A withBuildSourceObject(BuildSource buildSourceObject){
            _visitables.remove(this.object);
            if (buildSourceObject!=null){ this.object= new BuildSourceBuilder(buildSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildSourceObjectNested<A> withNewBuildSourceObject(){
            return new BuildSourceObjectNestedImpl();
    }

    public WatchEventFluent.BuildSourceObjectNested<A> withNewBuildSourceObjectLike(BuildSource item){
            return new BuildSourceObjectNestedImpl(item);
    }

    public A withPodSecurityPolicyObject(PodSecurityPolicy podSecurityPolicyObject){
            _visitables.remove(this.object);
            if (podSecurityPolicyObject!=null){ this.object= new PodSecurityPolicyBuilder(podSecurityPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObject(){
            return new PodSecurityPolicyObjectNestedImpl();
    }

    public WatchEventFluent.PodSecurityPolicyObjectNested<A> withNewPodSecurityPolicyObjectLike(PodSecurityPolicy item){
            return new PodSecurityPolicyObjectNestedImpl(item);
    }

    public A withCronJobObject(CronJob cronJobObject){
            _visitables.remove(this.object);
            if (cronJobObject!=null){ this.object= new CronJobBuilder(cronJobObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CronJobObjectNested<A> withNewCronJobObject(){
            return new CronJobObjectNestedImpl();
    }

    public WatchEventFluent.CronJobObjectNested<A> withNewCronJobObjectLike(CronJob item){
            return new CronJobObjectNestedImpl(item);
    }

    public A withTopologySelectorTermObject(TopologySelectorTerm topologySelectorTermObject){
            _visitables.remove(this.object);
            if (topologySelectorTermObject!=null){ this.object= new TopologySelectorTermBuilder(topologySelectorTermObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TopologySelectorTermObjectNested<A> withNewTopologySelectorTermObject(){
            return new TopologySelectorTermObjectNestedImpl();
    }

    public WatchEventFluent.TopologySelectorTermObjectNested<A> withNewTopologySelectorTermObjectLike(TopologySelectorTerm item){
            return new TopologySelectorTermObjectNestedImpl(item);
    }

    public A withCustomResourceSubresourceScaleObject(CustomResourceSubresourceScale customResourceSubresourceScaleObject){
            _visitables.remove(this.object);
            if (customResourceSubresourceScaleObject!=null){ this.object= new CustomResourceSubresourceScaleBuilder(customResourceSubresourceScaleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceSubresourceScaleObjectNested<A> withNewCustomResourceSubresourceScaleObject(){
            return new CustomResourceSubresourceScaleObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceSubresourceScaleObjectNested<A> withNewCustomResourceSubresourceScaleObjectLike(CustomResourceSubresourceScale item){
            return new CustomResourceSubresourceScaleObjectNestedImpl(item);
    }

    public A withNewCustomResourceSubresourceScaleObject(String labelSelectorPath,String specReplicasPath,String statusReplicasPath){
            return (A)withCustomResourceSubresourceScaleObject(new CustomResourceSubresourceScale(labelSelectorPath, specReplicasPath, statusReplicasPath));
    }

    public A withStorageOSPersistentVolumeSourceObject(StorageOSPersistentVolumeSource storageOSPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (storageOSPersistentVolumeSourceObject!=null){ this.object= new StorageOSPersistentVolumeSourceBuilder(storageOSPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<A> withNewStorageOSPersistentVolumeSourceObject(){
            return new StorageOSPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<A> withNewStorageOSPersistentVolumeSourceObjectLike(StorageOSPersistentVolumeSource item){
            return new StorageOSPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withCertificateSigningRequestSpecObject(CertificateSigningRequestSpec certificateSigningRequestSpecObject){
            _visitables.remove(this.object);
            if (certificateSigningRequestSpecObject!=null){ this.object= new CertificateSigningRequestSpecBuilder(certificateSigningRequestSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CertificateSigningRequestSpecObjectNested<A> withNewCertificateSigningRequestSpecObject(){
            return new CertificateSigningRequestSpecObjectNestedImpl();
    }

    public WatchEventFluent.CertificateSigningRequestSpecObjectNested<A> withNewCertificateSigningRequestSpecObjectLike(CertificateSigningRequestSpec item){
            return new CertificateSigningRequestSpecObjectNestedImpl(item);
    }

    public A withSecurityContextObject(SecurityContext securityContextObject){
            _visitables.remove(this.object);
            if (securityContextObject!=null){ this.object= new SecurityContextBuilder(securityContextObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecurityContextObjectNested<A> withNewSecurityContextObject(){
            return new SecurityContextObjectNestedImpl();
    }

    public WatchEventFluent.SecurityContextObjectNested<A> withNewSecurityContextObjectLike(SecurityContext item){
            return new SecurityContextObjectNestedImpl(item);
    }

    public A withConfigMapVolumeSourceObject(ConfigMapVolumeSource configMapVolumeSourceObject){
            _visitables.remove(this.object);
            if (configMapVolumeSourceObject!=null){ this.object= new ConfigMapVolumeSourceBuilder(configMapVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapVolumeSourceObjectNested<A> withNewConfigMapVolumeSourceObject(){
            return new ConfigMapVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapVolumeSourceObjectNested<A> withNewConfigMapVolumeSourceObjectLike(ConfigMapVolumeSource item){
            return new ConfigMapVolumeSourceObjectNestedImpl(item);
    }

    public A withComponentStatusListObject(ComponentStatusList componentStatusListObject){
            _visitables.remove(this.object);
            if (componentStatusListObject!=null){ this.object= new ComponentStatusListBuilder(componentStatusListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ComponentStatusListObjectNested<A> withNewComponentStatusListObject(){
            return new ComponentStatusListObjectNestedImpl();
    }

    public WatchEventFluent.ComponentStatusListObjectNested<A> withNewComponentStatusListObjectLike(ComponentStatusList item){
            return new ComponentStatusListObjectNestedImpl(item);
    }

    public A withGitBuildSourceObject(GitBuildSource gitBuildSourceObject){
            _visitables.remove(this.object);
            if (gitBuildSourceObject!=null){ this.object= new GitBuildSourceBuilder(gitBuildSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GitBuildSourceObjectNested<A> withNewGitBuildSourceObject(){
            return new GitBuildSourceObjectNestedImpl();
    }

    public WatchEventFluent.GitBuildSourceObjectNested<A> withNewGitBuildSourceObjectLike(GitBuildSource item){
            return new GitBuildSourceObjectNestedImpl(item);
    }

    public A withNewGitBuildSourceObject(String httpProxy,String httpsProxy,String noProxy,String ref,String uri){
            return (A)withGitBuildSourceObject(new GitBuildSource(httpProxy, httpsProxy, noProxy, ref, uri));
    }

    public A withFlockerVolumeSourceObject(FlockerVolumeSource flockerVolumeSourceObject){
            _visitables.remove(this.object);
            if (flockerVolumeSourceObject!=null){ this.object= new FlockerVolumeSourceBuilder(flockerVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.FlockerVolumeSourceObjectNested<A> withNewFlockerVolumeSourceObject(){
            return new FlockerVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.FlockerVolumeSourceObjectNested<A> withNewFlockerVolumeSourceObjectLike(FlockerVolumeSource item){
            return new FlockerVolumeSourceObjectNestedImpl(item);
    }

    public A withNewFlockerVolumeSourceObject(String datasetName,String datasetUUID){
            return (A)withFlockerVolumeSourceObject(new FlockerVolumeSource(datasetName, datasetUUID));
    }

    public A withScaleIOVolumeSourceObject(ScaleIOVolumeSource scaleIOVolumeSourceObject){
            _visitables.remove(this.object);
            if (scaleIOVolumeSourceObject!=null){ this.object= new ScaleIOVolumeSourceBuilder(scaleIOVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScaleIOVolumeSourceObjectNested<A> withNewScaleIOVolumeSourceObject(){
            return new ScaleIOVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.ScaleIOVolumeSourceObjectNested<A> withNewScaleIOVolumeSourceObjectLike(ScaleIOVolumeSource item){
            return new ScaleIOVolumeSourceObjectNestedImpl(item);
    }

    public A withLimitRangeListObject(LimitRangeList limitRangeListObject){
            _visitables.remove(this.object);
            if (limitRangeListObject!=null){ this.object= new LimitRangeListBuilder(limitRangeListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LimitRangeListObjectNested<A> withNewLimitRangeListObject(){
            return new LimitRangeListObjectNestedImpl();
    }

    public WatchEventFluent.LimitRangeListObjectNested<A> withNewLimitRangeListObjectLike(LimitRangeList item){
            return new LimitRangeListObjectNestedImpl(item);
    }

    public A withProbeObject(Probe probeObject){
            _visitables.remove(this.object);
            if (probeObject!=null){ this.object= new ProbeBuilder(probeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProbeObjectNested<A> withNewProbeObject(){
            return new ProbeObjectNestedImpl();
    }

    public WatchEventFluent.ProbeObjectNested<A> withNewProbeObjectLike(Probe item){
            return new ProbeObjectNestedImpl(item);
    }

    public A withImageSourcePathObject(ImageSourcePath imageSourcePathObject){
            _visitables.remove(this.object);
            if (imageSourcePathObject!=null){ this.object= new ImageSourcePathBuilder(imageSourcePathObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageSourcePathObjectNested<A> withNewImageSourcePathObject(){
            return new ImageSourcePathObjectNestedImpl();
    }

    public WatchEventFluent.ImageSourcePathObjectNested<A> withNewImageSourcePathObjectLike(ImageSourcePath item){
            return new ImageSourcePathObjectNestedImpl(item);
    }

    public A withNewImageSourcePathObject(String destinationDir,String sourcePath){
            return (A)withImageSourcePathObject(new ImageSourcePath(destinationDir, sourcePath));
    }

    public A withEndpointsObject(Endpoints endpointsObject){
            _visitables.remove(this.object);
            if (endpointsObject!=null){ this.object= new EndpointsBuilder(endpointsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EndpointsObjectNested<A> withNewEndpointsObject(){
            return new EndpointsObjectNestedImpl();
    }

    public WatchEventFluent.EndpointsObjectNested<A> withNewEndpointsObjectLike(Endpoints item){
            return new EndpointsObjectNestedImpl(item);
    }

    public A withBuildConfigStatusObject(BuildConfigStatus buildConfigStatusObject){
            _visitables.remove(this.object);
            if (buildConfigStatusObject!=null){ this.object= new BuildConfigStatusBuilder(buildConfigStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildConfigStatusObjectNested<A> withNewBuildConfigStatusObject(){
            return new BuildConfigStatusObjectNestedImpl();
    }

    public WatchEventFluent.BuildConfigStatusObjectNested<A> withNewBuildConfigStatusObjectLike(BuildConfigStatus item){
            return new BuildConfigStatusObjectNestedImpl(item);
    }

    public A withNewBuildConfigStatusObject(Long lastVersion){
            return (A)withBuildConfigStatusObject(new BuildConfigStatus(lastVersion));
    }

    public A withParameterObject(Parameter parameterObject){
            _visitables.remove(this.object);
            if (parameterObject!=null){ this.object= new ParameterBuilder(parameterObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ParameterObjectNested<A> withNewParameterObject(){
            return new ParameterObjectNestedImpl();
    }

    public WatchEventFluent.ParameterObjectNested<A> withNewParameterObjectLike(Parameter item){
            return new ParameterObjectNestedImpl(item);
    }

    public A withSecretVolumeSourceObject(SecretVolumeSource secretVolumeSourceObject){
            _visitables.remove(this.object);
            if (secretVolumeSourceObject!=null){ this.object= new SecretVolumeSourceBuilder(secretVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretVolumeSourceObjectNested<A> withNewSecretVolumeSourceObject(){
            return new SecretVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.SecretVolumeSourceObjectNested<A> withNewSecretVolumeSourceObjectLike(SecretVolumeSource item){
            return new SecretVolumeSourceObjectNestedImpl(item);
    }

    public A withPodObject(Pod podObject){
            _visitables.remove(this.object);
            if (podObject!=null){ this.object= new PodBuilder(podObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodObjectNested<A> withNewPodObject(){
            return new PodObjectNestedImpl();
    }

    public WatchEventFluent.PodObjectNested<A> withNewPodObjectLike(Pod item){
            return new PodObjectNestedImpl(item);
    }

    public A withClientIPConfigObject(ClientIPConfig clientIPConfigObject){
            _visitables.remove(this.object);
            if (clientIPConfigObject!=null){ this.object= new ClientIPConfigBuilder(clientIPConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ClientIPConfigObjectNested<A> withNewClientIPConfigObject(){
            return new ClientIPConfigObjectNestedImpl();
    }

    public WatchEventFluent.ClientIPConfigObjectNested<A> withNewClientIPConfigObjectLike(ClientIPConfig item){
            return new ClientIPConfigObjectNestedImpl(item);
    }

    public A withNewClientIPConfigObject(Integer timeoutSeconds){
            return (A)withClientIPConfigObject(new ClientIPConfig(timeoutSeconds));
    }

    public A withContextObject(Context contextObject){
            _visitables.remove(this.object);
            if (contextObject!=null){ this.object= new ContextBuilder(contextObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContextObjectNested<A> withNewContextObject(){
            return new ContextObjectNestedImpl();
    }

    public WatchEventFluent.ContextObjectNested<A> withNewContextObjectLike(Context item){
            return new ContextObjectNestedImpl(item);
    }

    public A withNodeAffinityObject(NodeAffinity nodeAffinityObject){
            _visitables.remove(this.object);
            if (nodeAffinityObject!=null){ this.object= new NodeAffinityBuilder(nodeAffinityObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeAffinityObjectNested<A> withNewNodeAffinityObject(){
            return new NodeAffinityObjectNestedImpl();
    }

    public WatchEventFluent.NodeAffinityObjectNested<A> withNewNodeAffinityObjectLike(NodeAffinity item){
            return new NodeAffinityObjectNestedImpl(item);
    }

    public A withConfigMapObject(ConfigMap configMapObject){
            _visitables.remove(this.object);
            if (configMapObject!=null){ this.object= new ConfigMapBuilder(configMapObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ConfigMapObjectNested<A> withNewConfigMapObject(){
            return new ConfigMapObjectNestedImpl();
    }

    public WatchEventFluent.ConfigMapObjectNested<A> withNewConfigMapObjectLike(ConfigMap item){
            return new ConfigMapObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionObject(CustomResourceDefinition customResourceDefinitionObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionObject!=null){ this.object= new CustomResourceDefinitionBuilder(customResourceDefinitionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObject(){
            return new CustomResourceDefinitionObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionObjectNested<A> withNewCustomResourceDefinitionObjectLike(CustomResourceDefinition item){
            return new CustomResourceDefinitionObjectNestedImpl(item);
    }

    public A withFCVolumeSourceObject(FCVolumeSource fCVolumeSourceObject){
            _visitables.remove(this.object);
            if (fCVolumeSourceObject!=null){ this.object= new FCVolumeSourceBuilder(fCVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.FCVolumeSourceObjectNested<A> withNewFCVolumeSourceObject(){
            return new FCVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.FCVolumeSourceObjectNested<A> withNewFCVolumeSourceObjectLike(FCVolumeSource item){
            return new FCVolumeSourceObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionStatusObject(CustomResourceDefinitionStatus customResourceDefinitionStatusObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionStatusObject!=null){ this.object= new CustomResourceDefinitionStatusBuilder(customResourceDefinitionStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionStatusObjectNested<A> withNewCustomResourceDefinitionStatusObject(){
            return new CustomResourceDefinitionStatusObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionStatusObjectNested<A> withNewCustomResourceDefinitionStatusObjectLike(CustomResourceDefinitionStatus item){
            return new CustomResourceDefinitionStatusObjectNestedImpl(item);
    }

    public A withJobListObject(JobList jobListObject){
            _visitables.remove(this.object);
            if (jobListObject!=null){ this.object= new JobListBuilder(jobListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JobListObjectNested<A> withNewJobListObject(){
            return new JobListObjectNestedImpl();
    }

    public WatchEventFluent.JobListObjectNested<A> withNewJobListObjectLike(JobList item){
            return new JobListObjectNestedImpl(item);
    }

    public A withOAuthAuthorizeTokenListObject(OAuthAuthorizeTokenList oAuthAuthorizeTokenListObject){
            _visitables.remove(this.object);
            if (oAuthAuthorizeTokenListObject!=null){ this.object= new OAuthAuthorizeTokenListBuilder(oAuthAuthorizeTokenListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthAuthorizeTokenListObjectNested<A> withNewOAuthAuthorizeTokenListObject(){
            return new OAuthAuthorizeTokenListObjectNestedImpl();
    }

    public WatchEventFluent.OAuthAuthorizeTokenListObjectNested<A> withNewOAuthAuthorizeTokenListObjectLike(OAuthAuthorizeTokenList item){
            return new OAuthAuthorizeTokenListObjectNestedImpl(item);
    }

    public A withJSONSchemaPropsOrStringArrayObject(JSONSchemaPropsOrStringArray jSONSchemaPropsOrStringArrayObject){
            _visitables.remove(this.object);
            if (jSONSchemaPropsOrStringArrayObject!=null){ this.object= new JSONSchemaPropsOrStringArrayBuilder(jSONSchemaPropsOrStringArrayObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<A> withNewJSONSchemaPropsOrStringArrayObject(){
            return new JSONSchemaPropsOrStringArrayObjectNestedImpl();
    }

    public WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<A> withNewJSONSchemaPropsOrStringArrayObjectLike(JSONSchemaPropsOrStringArray item){
            return new JSONSchemaPropsOrStringArrayObjectNestedImpl(item);
    }

    public A withCustomDeploymentStrategyParamsObject(CustomDeploymentStrategyParams customDeploymentStrategyParamsObject){
            _visitables.remove(this.object);
            if (customDeploymentStrategyParamsObject!=null){ this.object= new CustomDeploymentStrategyParamsBuilder(customDeploymentStrategyParamsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<A> withNewCustomDeploymentStrategyParamsObject(){
            return new CustomDeploymentStrategyParamsObjectNestedImpl();
    }

    public WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<A> withNewCustomDeploymentStrategyParamsObjectLike(CustomDeploymentStrategyParams item){
            return new CustomDeploymentStrategyParamsObjectNestedImpl(item);
    }

    public A withImageImportSpecObject(ImageImportSpec imageImportSpecObject){
            _visitables.remove(this.object);
            if (imageImportSpecObject!=null){ this.object= new ImageImportSpecBuilder(imageImportSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageImportSpecObjectNested<A> withNewImageImportSpecObject(){
            return new ImageImportSpecObjectNestedImpl();
    }

    public WatchEventFluent.ImageImportSpecObjectNested<A> withNewImageImportSpecObjectLike(ImageImportSpec item){
            return new ImageImportSpecObjectNestedImpl(item);
    }

    public A withPodSecurityContextObject(PodSecurityContext podSecurityContextObject){
            _visitables.remove(this.object);
            if (podSecurityContextObject!=null){ this.object= new PodSecurityContextBuilder(podSecurityContextObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodSecurityContextObjectNested<A> withNewPodSecurityContextObject(){
            return new PodSecurityContextObjectNestedImpl();
    }

    public WatchEventFluent.PodSecurityContextObjectNested<A> withNewPodSecurityContextObjectLike(PodSecurityContext item){
            return new PodSecurityContextObjectNestedImpl(item);
    }

    public A withDownwardAPIProjectionObject(DownwardAPIProjection downwardAPIProjectionObject){
            _visitables.remove(this.object);
            if (downwardAPIProjectionObject!=null){ this.object= new DownwardAPIProjectionBuilder(downwardAPIProjectionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DownwardAPIProjectionObjectNested<A> withNewDownwardAPIProjectionObject(){
            return new DownwardAPIProjectionObjectNestedImpl();
    }

    public WatchEventFluent.DownwardAPIProjectionObjectNested<A> withNewDownwardAPIProjectionObjectLike(DownwardAPIProjection item){
            return new DownwardAPIProjectionObjectNestedImpl(item);
    }

    public A withPodAffinityTermObject(PodAffinityTerm podAffinityTermObject){
            _visitables.remove(this.object);
            if (podAffinityTermObject!=null){ this.object= new PodAffinityTermBuilder(podAffinityTermObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodAffinityTermObjectNested<A> withNewPodAffinityTermObject(){
            return new PodAffinityTermObjectNestedImpl();
    }

    public WatchEventFluent.PodAffinityTermObjectNested<A> withNewPodAffinityTermObjectLike(PodAffinityTerm item){
            return new PodAffinityTermObjectNestedImpl(item);
    }

    public A withIDRangeObject(io.fabric8.openshift.api.model.IDRange iDRangeObject){
            _visitables.remove(this.object);
            if (iDRangeObject!=null){ this.object= new io.fabric8.openshift.api.model.IDRangeBuilder(iDRangeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelIDRangeObjectNested<A> withNewModelIDRangeObject(){
            return new ModelIDRangeObjectNestedImpl();
    }

    public WatchEventFluent.ModelIDRangeObjectNested<A> withNewIDRangeObjectLike(io.fabric8.openshift.api.model.IDRange item){
            return new ModelIDRangeObjectNestedImpl(item);
    }

    public A withNewModelIDRangeObject(Long max,Long min){
            return (A)withIDRangeObject(new IDRange(max, min));
    }

    public A withBuildConfigSpecObject(BuildConfigSpec buildConfigSpecObject){
            _visitables.remove(this.object);
            if (buildConfigSpecObject!=null){ this.object= new BuildConfigSpecBuilder(buildConfigSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildConfigSpecObjectNested<A> withNewBuildConfigSpecObject(){
            return new BuildConfigSpecObjectNestedImpl();
    }

    public WatchEventFluent.BuildConfigSpecObjectNested<A> withNewBuildConfigSpecObjectLike(BuildConfigSpec item){
            return new BuildConfigSpecObjectNestedImpl(item);
    }

    public A withNonResourceAttributesObject(NonResourceAttributes nonResourceAttributesObject){
            _visitables.remove(this.object);
            if (nonResourceAttributesObject!=null){ this.object= new NonResourceAttributesBuilder(nonResourceAttributesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NonResourceAttributesObjectNested<A> withNewNonResourceAttributesObject(){
            return new NonResourceAttributesObjectNestedImpl();
    }

    public WatchEventFluent.NonResourceAttributesObjectNested<A> withNewNonResourceAttributesObjectLike(NonResourceAttributes item){
            return new NonResourceAttributesObjectNestedImpl(item);
    }

    public A withNewNonResourceAttributesObject(String path,String verb){
            return (A)withNonResourceAttributesObject(new NonResourceAttributes(path, verb));
    }

    public A withPersistentVolumeClaimSourceObject(PersistentVolumeClaimVolumeSource persistentVolumeClaimSourceObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimSourceObject!=null){ this.object= new PersistentVolumeClaimVolumeSourceBuilder(persistentVolumeClaimSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeClaimSourceObjectNested<A> withNewPersistentVolumeClaimSourceObject(){
            return new PersistentVolumeClaimSourceObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeClaimSourceObjectNested<A> withNewPersistentVolumeClaimSourceObjectLike(PersistentVolumeClaimVolumeSource item){
            return new PersistentVolumeClaimSourceObjectNestedImpl(item);
    }

    public A withNewPersistentVolumeClaimSourceObject(String claimName,Boolean readOnly){
            return (A)withPersistentVolumeClaimSourceObject(new PersistentVolumeClaimVolumeSource(claimName, readOnly));
    }

    public A withSubjectAccessReviewStatusObject(SubjectAccessReviewStatus subjectAccessReviewStatusObject){
            _visitables.remove(this.object);
            if (subjectAccessReviewStatusObject!=null){ this.object= new SubjectAccessReviewStatusBuilder(subjectAccessReviewStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SubjectAccessReviewStatusObjectNested<A> withNewSubjectAccessReviewStatusObject(){
            return new SubjectAccessReviewStatusObjectNestedImpl();
    }

    public WatchEventFluent.SubjectAccessReviewStatusObjectNested<A> withNewSubjectAccessReviewStatusObjectLike(SubjectAccessReviewStatus item){
            return new SubjectAccessReviewStatusObjectNestedImpl(item);
    }

    public A withNewSubjectAccessReviewStatusObject(Boolean allowed,Boolean denied,String evaluationError,String reason){
            return (A)withSubjectAccessReviewStatusObject(new SubjectAccessReviewStatus(allowed, denied, evaluationError, reason));
    }

    public A withWebHookTriggerObject(WebHookTrigger webHookTriggerObject){
            _visitables.remove(this.object);
            if (webHookTriggerObject!=null){ this.object= new WebHookTriggerBuilder(webHookTriggerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.WebHookTriggerObjectNested<A> withNewWebHookTriggerObject(){
            return new WebHookTriggerObjectNestedImpl();
    }

    public WatchEventFluent.WebHookTriggerObjectNested<A> withNewWebHookTriggerObjectLike(WebHookTrigger item){
            return new WebHookTriggerObjectNestedImpl(item);
    }

    public A withServiceAccountReferenceObject(ServiceAccountReference serviceAccountReferenceObject){
            _visitables.remove(this.object);
            if (serviceAccountReferenceObject!=null){ this.object= new ServiceAccountReferenceBuilder(serviceAccountReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceAccountReferenceObjectNested<A> withNewServiceAccountReferenceObject(){
            return new ServiceAccountReferenceObjectNestedImpl();
    }

    public WatchEventFluent.ServiceAccountReferenceObjectNested<A> withNewServiceAccountReferenceObjectLike(ServiceAccountReference item){
            return new ServiceAccountReferenceObjectNestedImpl(item);
    }

    public A withNewServiceAccountReferenceObject(String name,String namespace){
            return (A)withServiceAccountReferenceObject(new ServiceAccountReference(name, namespace));
    }

    public A withBuildObject(Build buildObject){
            _visitables.remove(this.object);
            if (buildObject!=null){ this.object= new BuildBuilder(buildObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildObjectNested<A> withNewBuildObject(){
            return new BuildObjectNestedImpl();
    }

    public WatchEventFluent.BuildObjectNested<A> withNewBuildObjectLike(Build item){
            return new BuildObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionListObject(CustomResourceDefinitionList customResourceDefinitionListObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionListObject!=null){ this.object= new CustomResourceDefinitionListBuilder(customResourceDefinitionListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionListObjectNested<A> withNewCustomResourceDefinitionListObject(){
            return new CustomResourceDefinitionListObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionListObjectNested<A> withNewCustomResourceDefinitionListObjectLike(CustomResourceDefinitionList item){
            return new CustomResourceDefinitionListObjectNestedImpl(item);
    }

    public A withAllowedFlexVolumeObject(AllowedFlexVolume allowedFlexVolumeObject){
            _visitables.remove(this.object);
            if (allowedFlexVolumeObject!=null){ this.object= new AllowedFlexVolumeBuilder(allowedFlexVolumeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AllowedFlexVolumeObjectNested<A> withNewAllowedFlexVolumeObject(){
            return new AllowedFlexVolumeObjectNestedImpl();
    }

    public WatchEventFluent.AllowedFlexVolumeObjectNested<A> withNewAllowedFlexVolumeObjectLike(AllowedFlexVolume item){
            return new AllowedFlexVolumeObjectNestedImpl(item);
    }

    public A withNewAllowedFlexVolumeObject(String driver){
            return (A)withAllowedFlexVolumeObject(new AllowedFlexVolume(driver));
    }

    public A withResourceMetricStatusObject(ResourceMetricStatus resourceMetricStatusObject){
            _visitables.remove(this.object);
            if (resourceMetricStatusObject!=null){ this.object= new ResourceMetricStatusBuilder(resourceMetricStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceMetricStatusObjectNested<A> withNewResourceMetricStatusObject(){
            return new ResourceMetricStatusObjectNestedImpl();
    }

    public WatchEventFluent.ResourceMetricStatusObjectNested<A> withNewResourceMetricStatusObjectLike(ResourceMetricStatus item){
            return new ResourceMetricStatusObjectNestedImpl(item);
    }

    public A withTagImportPolicyObject(TagImportPolicy tagImportPolicyObject){
            _visitables.remove(this.object);
            if (tagImportPolicyObject!=null){ this.object= new TagImportPolicyBuilder(tagImportPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TagImportPolicyObjectNested<A> withNewTagImportPolicyObject(){
            return new TagImportPolicyObjectNestedImpl();
    }

    public WatchEventFluent.TagImportPolicyObjectNested<A> withNewTagImportPolicyObjectLike(TagImportPolicy item){
            return new TagImportPolicyObjectNestedImpl(item);
    }

    public A withNewTagImportPolicyObject(Boolean insecure,Boolean scheduled){
            return (A)withTagImportPolicyObject(new TagImportPolicy(insecure, scheduled));
    }

    public A withImageStreamTagObject(ImageStreamTag imageStreamTagObject){
            _visitables.remove(this.object);
            if (imageStreamTagObject!=null){ this.object= new ImageStreamTagBuilder(imageStreamTagObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObject(){
            return new ImageStreamTagObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamTagObjectNested<A> withNewImageStreamTagObjectLike(ImageStreamTag item){
            return new ImageStreamTagObjectNestedImpl(item);
    }

    public A withKeyToPathObject(KeyToPath keyToPathObject){
            _visitables.remove(this.object);
            if (keyToPathObject!=null){ this.object= new KeyToPathBuilder(keyToPathObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.KeyToPathObjectNested<A> withNewKeyToPathObject(){
            return new KeyToPathObjectNestedImpl();
    }

    public WatchEventFluent.KeyToPathObjectNested<A> withNewKeyToPathObjectLike(KeyToPath item){
            return new KeyToPathObjectNestedImpl(item);
    }

    public A withNewKeyToPathObject(String key,Integer mode,String path){
            return (A)withKeyToPathObject(new KeyToPath(key, mode, path));
    }

    public A withStatefulSetConditionObject(StatefulSetCondition statefulSetConditionObject){
            _visitables.remove(this.object);
            if (statefulSetConditionObject!=null){ this.object= new StatefulSetConditionBuilder(statefulSetConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatefulSetConditionObjectNested<A> withNewStatefulSetConditionObject(){
            return new StatefulSetConditionObjectNestedImpl();
    }

    public WatchEventFluent.StatefulSetConditionObjectNested<A> withNewStatefulSetConditionObjectLike(StatefulSetCondition item){
            return new StatefulSetConditionObjectNestedImpl(item);
    }

    public A withNewStatefulSetConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withStatefulSetConditionObject(new StatefulSetCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withRoutePortObject(RoutePort routePortObject){
            _visitables.remove(this.object);
            if (routePortObject!=null){ this.object= new RoutePortBuilder(routePortObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RoutePortObjectNested<A> withNewRoutePortObject(){
            return new RoutePortObjectNestedImpl();
    }

    public WatchEventFluent.RoutePortObjectNested<A> withNewRoutePortObjectLike(RoutePort item){
            return new RoutePortObjectNestedImpl(item);
    }

    public A withJSONSchemaPropsOrBoolObject(JSONSchemaPropsOrBool jSONSchemaPropsOrBoolObject){
            _visitables.remove(this.object);
            if (jSONSchemaPropsOrBoolObject!=null){ this.object= new JSONSchemaPropsOrBoolBuilder(jSONSchemaPropsOrBoolObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<A> withNewJSONSchemaPropsOrBoolObject(){
            return new JSONSchemaPropsOrBoolObjectNestedImpl();
    }

    public WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<A> withNewJSONSchemaPropsOrBoolObjectLike(JSONSchemaPropsOrBool item){
            return new JSONSchemaPropsOrBoolObjectNestedImpl(item);
    }

    public A withFlexPersistentVolumeSourceObject(FlexPersistentVolumeSource flexPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (flexPersistentVolumeSourceObject!=null){ this.object= new FlexPersistentVolumeSourceBuilder(flexPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.FlexPersistentVolumeSourceObjectNested<A> withNewFlexPersistentVolumeSourceObject(){
            return new FlexPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.FlexPersistentVolumeSourceObjectNested<A> withNewFlexPersistentVolumeSourceObjectLike(FlexPersistentVolumeSource item){
            return new FlexPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withGroupObject(Group groupObject){
            _visitables.remove(this.object);
            if (groupObject!=null){ this.object= new GroupBuilder(groupObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GroupObjectNested<A> withNewGroupObject(){
            return new GroupObjectNestedImpl();
    }

    public WatchEventFluent.GroupObjectNested<A> withNewGroupObjectLike(Group item){
            return new GroupObjectNestedImpl(item);
    }

    public A withBuildTriggerCauseObject(BuildTriggerCause buildTriggerCauseObject){
            _visitables.remove(this.object);
            if (buildTriggerCauseObject!=null){ this.object= new BuildTriggerCauseBuilder(buildTriggerCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildTriggerCauseObjectNested<A> withNewBuildTriggerCauseObject(){
            return new BuildTriggerCauseObjectNestedImpl();
    }

    public WatchEventFluent.BuildTriggerCauseObjectNested<A> withNewBuildTriggerCauseObjectLike(BuildTriggerCause item){
            return new BuildTriggerCauseObjectNestedImpl(item);
    }

    public A withNamespaceListObject(NamespaceList namespaceListObject){
            _visitables.remove(this.object);
            if (namespaceListObject!=null){ this.object= new NamespaceListBuilder(namespaceListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamespaceListObjectNested<A> withNewNamespaceListObject(){
            return new NamespaceListObjectNestedImpl();
    }

    public WatchEventFluent.NamespaceListObjectNested<A> withNewNamespaceListObjectLike(NamespaceList item){
            return new NamespaceListObjectNestedImpl(item);
    }

    public A withPodDisruptionBudgetStatusObject(PodDisruptionBudgetStatus podDisruptionBudgetStatusObject){
            _visitables.remove(this.object);
            if (podDisruptionBudgetStatusObject!=null){ this.object= new PodDisruptionBudgetStatusBuilder(podDisruptionBudgetStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodDisruptionBudgetStatusObjectNested<A> withNewPodDisruptionBudgetStatusObject(){
            return new PodDisruptionBudgetStatusObjectNestedImpl();
    }

    public WatchEventFluent.PodDisruptionBudgetStatusObjectNested<A> withNewPodDisruptionBudgetStatusObjectLike(PodDisruptionBudgetStatus item){
            return new PodDisruptionBudgetStatusObjectNestedImpl(item);
    }

    public A withPodDNSConfigObject(PodDNSConfig podDNSConfigObject){
            _visitables.remove(this.object);
            if (podDNSConfigObject!=null){ this.object= new PodDNSConfigBuilder(podDNSConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodDNSConfigObjectNested<A> withNewPodDNSConfigObject(){
            return new PodDNSConfigObjectNestedImpl();
    }

    public WatchEventFluent.PodDNSConfigObjectNested<A> withNewPodDNSConfigObjectLike(PodDNSConfig item){
            return new PodDNSConfigObjectNestedImpl(item);
    }

    public A withNodeListObject(NodeList nodeListObject){
            _visitables.remove(this.object);
            if (nodeListObject!=null){ this.object= new NodeListBuilder(nodeListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeListObjectNested<A> withNewNodeListObject(){
            return new NodeListObjectNestedImpl();
    }

    public WatchEventFluent.NodeListObjectNested<A> withNewNodeListObjectLike(NodeList item){
            return new NodeListObjectNestedImpl(item);
    }

    public A withHorizontalPodAutoscalerSpecObject(HorizontalPodAutoscalerSpec horizontalPodAutoscalerSpecObject){
            _visitables.remove(this.object);
            if (horizontalPodAutoscalerSpecObject!=null){ this.object= new HorizontalPodAutoscalerSpecBuilder(horizontalPodAutoscalerSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<A> withNewHorizontalPodAutoscalerSpecObject(){
            return new HorizontalPodAutoscalerSpecObjectNestedImpl();
    }

    public WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<A> withNewHorizontalPodAutoscalerSpecObjectLike(HorizontalPodAutoscalerSpec item){
            return new HorizontalPodAutoscalerSpecObjectNestedImpl(item);
    }

    public A withImageSignatureObject(ImageSignature imageSignatureObject){
            _visitables.remove(this.object);
            if (imageSignatureObject!=null){ this.object= new ImageSignatureBuilder(imageSignatureObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageSignatureObjectNested<A> withNewImageSignatureObject(){
            return new ImageSignatureObjectNestedImpl();
    }

    public WatchEventFluent.ImageSignatureObjectNested<A> withNewImageSignatureObjectLike(ImageSignature item){
            return new ImageSignatureObjectNestedImpl(item);
    }

    public A withEnvVarSourceObject(EnvVarSource envVarSourceObject){
            _visitables.remove(this.object);
            if (envVarSourceObject!=null){ this.object= new EnvVarSourceBuilder(envVarSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EnvVarSourceObjectNested<A> withNewEnvVarSourceObject(){
            return new EnvVarSourceObjectNestedImpl();
    }

    public WatchEventFluent.EnvVarSourceObjectNested<A> withNewEnvVarSourceObjectLike(EnvVarSource item){
            return new EnvVarSourceObjectNestedImpl(item);
    }

    public A withVolumeProjectionObject(VolumeProjection volumeProjectionObject){
            _visitables.remove(this.object);
            if (volumeProjectionObject!=null){ this.object= new VolumeProjectionBuilder(volumeProjectionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.VolumeProjectionObjectNested<A> withNewVolumeProjectionObject(){
            return new VolumeProjectionObjectNestedImpl();
    }

    public WatchEventFluent.VolumeProjectionObjectNested<A> withNewVolumeProjectionObjectLike(VolumeProjection item){
            return new VolumeProjectionObjectNestedImpl(item);
    }

    public A withResourceQuotaObject(ResourceQuota resourceQuotaObject){
            _visitables.remove(this.object);
            if (resourceQuotaObject!=null){ this.object= new ResourceQuotaBuilder(resourceQuotaObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObject(){
            return new ResourceQuotaObjectNestedImpl();
    }

    public WatchEventFluent.ResourceQuotaObjectNested<A> withNewResourceQuotaObjectLike(ResourceQuota item){
            return new ResourceQuotaObjectNestedImpl(item);
    }

    public A withDeploymentStrategyObject(DeploymentStrategy deploymentStrategyObject){
            _visitables.remove(this.object);
            if (deploymentStrategyObject!=null){ this.object= new DeploymentStrategyBuilder(deploymentStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentStrategyObjectNested<A> withNewDeploymentStrategyObject(){
            return new DeploymentStrategyObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentStrategyObjectNested<A> withNewDeploymentStrategyObjectLike(DeploymentStrategy item){
            return new DeploymentStrategyObjectNestedImpl(item);
    }

    public A withOAuthAccessTokenListObject(OAuthAccessTokenList oAuthAccessTokenListObject){
            _visitables.remove(this.object);
            if (oAuthAccessTokenListObject!=null){ this.object= new OAuthAccessTokenListBuilder(oAuthAccessTokenListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthAccessTokenListObjectNested<A> withNewOAuthAccessTokenListObject(){
            return new OAuthAccessTokenListObjectNestedImpl();
    }

    public WatchEventFluent.OAuthAccessTokenListObjectNested<A> withNewOAuthAccessTokenListObjectLike(OAuthAccessTokenList item){
            return new OAuthAccessTokenListObjectNestedImpl(item);
    }

    public A withNodeSelectorTermObject(NodeSelectorTerm nodeSelectorTermObject){
            _visitables.remove(this.object);
            if (nodeSelectorTermObject!=null){ this.object= new NodeSelectorTermBuilder(nodeSelectorTermObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeSelectorTermObjectNested<A> withNewNodeSelectorTermObject(){
            return new NodeSelectorTermObjectNestedImpl();
    }

    public WatchEventFluent.NodeSelectorTermObjectNested<A> withNewNodeSelectorTermObjectLike(NodeSelectorTerm item){
            return new NodeSelectorTermObjectNestedImpl(item);
    }

    public A withScaleIOPersistentVolumeSourceObject(ScaleIOPersistentVolumeSource scaleIOPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (scaleIOPersistentVolumeSourceObject!=null){ this.object= new ScaleIOPersistentVolumeSourceBuilder(scaleIOPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<A> withNewScaleIOPersistentVolumeSourceObject(){
            return new ScaleIOPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<A> withNewScaleIOPersistentVolumeSourceObjectLike(ScaleIOPersistentVolumeSource item){
            return new ScaleIOPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withSupplementalGroupsStrategyOptionsObject(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions supplementalGroupsStrategyOptionsObject){
            _visitables.remove(this.object);
            if (supplementalGroupsStrategyOptionsObject!=null){ this.object= new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder(supplementalGroupsStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<A> withNewModelSupplementalGroupsStrategyOptionsObject(){
            return new ModelSupplementalGroupsStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<A> withNewSupplementalGroupsStrategyOptionsObjectLike(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item){
            return new ModelSupplementalGroupsStrategyOptionsObjectNestedImpl(item);
    }

    public A withWeightedPodAffinityTermObject(WeightedPodAffinityTerm weightedPodAffinityTermObject){
            _visitables.remove(this.object);
            if (weightedPodAffinityTermObject!=null){ this.object= new WeightedPodAffinityTermBuilder(weightedPodAffinityTermObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.WeightedPodAffinityTermObjectNested<A> withNewWeightedPodAffinityTermObject(){
            return new WeightedPodAffinityTermObjectNestedImpl();
    }

    public WatchEventFluent.WeightedPodAffinityTermObjectNested<A> withNewWeightedPodAffinityTermObjectLike(WeightedPodAffinityTerm item){
            return new WeightedPodAffinityTermObjectNestedImpl(item);
    }

    public A withRollingUpdateStatefulSetStrategyObject(RollingUpdateStatefulSetStrategy rollingUpdateStatefulSetStrategyObject){
            _visitables.remove(this.object);
            if (rollingUpdateStatefulSetStrategyObject!=null){ this.object= new RollingUpdateStatefulSetStrategyBuilder(rollingUpdateStatefulSetStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<A> withNewRollingUpdateStatefulSetStrategyObject(){
            return new RollingUpdateStatefulSetStrategyObjectNestedImpl();
    }

    public WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<A> withNewRollingUpdateStatefulSetStrategyObjectLike(RollingUpdateStatefulSetStrategy item){
            return new RollingUpdateStatefulSetStrategyObjectNestedImpl(item);
    }

    public A withNewRollingUpdateStatefulSetStrategyObject(Integer partition){
            return (A)withRollingUpdateStatefulSetStrategyObject(new RollingUpdateStatefulSetStrategy(partition));
    }

    public A withBuildRequestObject(BuildRequest buildRequestObject){
            _visitables.remove(this.object);
            if (buildRequestObject!=null){ this.object= new BuildRequestBuilder(buildRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildRequestObjectNested<A> withNewBuildRequestObject(){
            return new BuildRequestObjectNestedImpl();
    }

    public WatchEventFluent.BuildRequestObjectNested<A> withNewBuildRequestObjectLike(BuildRequest item){
            return new BuildRequestObjectNestedImpl(item);
    }

    public A withServiceReferenceObject(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference serviceReferenceObject){
            _visitables.remove(this.object);
            if (serviceReferenceObject!=null){ this.object= new io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceBuilder(serviceReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ApiextensionsServiceReferenceObjectNested<A> withNewApiextensionsServiceReferenceObject(){
            return new ApiextensionsServiceReferenceObjectNestedImpl();
    }

    public WatchEventFluent.ApiextensionsServiceReferenceObjectNested<A> withNewServiceReferenceObjectLike(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item){
            return new ApiextensionsServiceReferenceObjectNestedImpl(item);
    }

    public A withNewApiextensionsServiceReferenceObject(String name,String namespace,String path){
            return (A)withServiceReferenceObject(new ServiceReference(name, namespace, path));
    }

    public A withNodeSystemInfoObject(NodeSystemInfo nodeSystemInfoObject){
            _visitables.remove(this.object);
            if (nodeSystemInfoObject!=null){ this.object= new NodeSystemInfoBuilder(nodeSystemInfoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeSystemInfoObjectNested<A> withNewNodeSystemInfoObject(){
            return new NodeSystemInfoObjectNestedImpl();
    }

    public WatchEventFluent.NodeSystemInfoObjectNested<A> withNewNodeSystemInfoObjectLike(NodeSystemInfo item){
            return new NodeSystemInfoObjectNestedImpl(item);
    }

    public A withRouteListObject(RouteList routeListObject){
            _visitables.remove(this.object);
            if (routeListObject!=null){ this.object= new RouteListBuilder(routeListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteListObjectNested<A> withNewRouteListObject(){
            return new RouteListObjectNestedImpl();
    }

    public WatchEventFluent.RouteListObjectNested<A> withNewRouteListObjectLike(RouteList item){
            return new RouteListObjectNestedImpl(item);
    }

    public A withAuthProviderConfigObject(AuthProviderConfig authProviderConfigObject){
            _visitables.remove(this.object);
            if (authProviderConfigObject!=null){ this.object= new AuthProviderConfigBuilder(authProviderConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AuthProviderConfigObjectNested<A> withNewAuthProviderConfigObject(){
            return new AuthProviderConfigObjectNestedImpl();
    }

    public WatchEventFluent.AuthProviderConfigObjectNested<A> withNewAuthProviderConfigObjectLike(AuthProviderConfig item){
            return new AuthProviderConfigObjectNestedImpl(item);
    }

    public A withVolumeDeviceObject(VolumeDevice volumeDeviceObject){
            _visitables.remove(this.object);
            if (volumeDeviceObject!=null){ this.object= new VolumeDeviceBuilder(volumeDeviceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.VolumeDeviceObjectNested<A> withNewVolumeDeviceObject(){
            return new VolumeDeviceObjectNestedImpl();
    }

    public WatchEventFluent.VolumeDeviceObjectNested<A> withNewVolumeDeviceObjectLike(VolumeDevice item){
            return new VolumeDeviceObjectNestedImpl(item);
    }

    public A withNewVolumeDeviceObject(String devicePath,String name){
            return (A)withVolumeDeviceObject(new VolumeDevice(devicePath, name));
    }

    public A withDaemonSetObject(DaemonSet daemonSetObject){
            _visitables.remove(this.object);
            if (daemonSetObject!=null){ this.object= new DaemonSetBuilder(daemonSetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonSetObjectNested<A> withNewDaemonSetObject(){
            return new DaemonSetObjectNestedImpl();
    }

    public WatchEventFluent.DaemonSetObjectNested<A> withNewDaemonSetObjectLike(DaemonSet item){
            return new DaemonSetObjectNestedImpl(item);
    }

    public A withTokenReviewSpecObject(TokenReviewSpec tokenReviewSpecObject){
            _visitables.remove(this.object);
            if (tokenReviewSpecObject!=null){ this.object= new TokenReviewSpecBuilder(tokenReviewSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TokenReviewSpecObjectNested<A> withNewTokenReviewSpecObject(){
            return new TokenReviewSpecObjectNestedImpl();
    }

    public WatchEventFluent.TokenReviewSpecObjectNested<A> withNewTokenReviewSpecObjectLike(TokenReviewSpec item){
            return new TokenReviewSpecObjectNestedImpl(item);
    }

    public A withDeploymentDetailsObject(DeploymentDetails deploymentDetailsObject){
            _visitables.remove(this.object);
            if (deploymentDetailsObject!=null){ this.object= new DeploymentDetailsBuilder(deploymentDetailsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentDetailsObjectNested<A> withNewDeploymentDetailsObject(){
            return new DeploymentDetailsObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentDetailsObjectNested<A> withNewDeploymentDetailsObjectLike(DeploymentDetails item){
            return new DeploymentDetailsObjectNestedImpl(item);
    }

    public A withVolumeObject(Volume volumeObject){
            _visitables.remove(this.object);
            if (volumeObject!=null){ this.object= new VolumeBuilder(volumeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.VolumeObjectNested<A> withNewVolumeObject(){
            return new VolumeObjectNestedImpl();
    }

    public WatchEventFluent.VolumeObjectNested<A> withNewVolumeObjectLike(Volume item){
            return new VolumeObjectNestedImpl(item);
    }

    public A withKubernetesRunAsUserStrategyOptionsObject(KubernetesRunAsUserStrategyOptions kubernetesRunAsUserStrategyOptionsObject){
            _visitables.remove(this.object);
            if (kubernetesRunAsUserStrategyOptionsObject!=null){ this.object= new KubernetesRunAsUserStrategyOptionsBuilder(kubernetesRunAsUserStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<A> withNewKubernetesRunAsUserStrategyOptionsObject(){
            return new KubernetesRunAsUserStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<A> withNewKubernetesRunAsUserStrategyOptionsObjectLike(KubernetesRunAsUserStrategyOptions item){
            return new KubernetesRunAsUserStrategyOptionsObjectNestedImpl(item);
    }

    public A withNFSVolumeSourceObject(NFSVolumeSource nFSVolumeSourceObject){
            _visitables.remove(this.object);
            if (nFSVolumeSourceObject!=null){ this.object= new NFSVolumeSourceBuilder(nFSVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NFSVolumeSourceObjectNested<A> withNewNFSVolumeSourceObject(){
            return new NFSVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.NFSVolumeSourceObjectNested<A> withNewNFSVolumeSourceObjectLike(NFSVolumeSource item){
            return new NFSVolumeSourceObjectNestedImpl(item);
    }

    public A withNewNFSVolumeSourceObject(String path,Boolean readOnly,String server){
            return (A)withNFSVolumeSourceObject(new NFSVolumeSource(path, readOnly, server));
    }

    public A withDeploymentConditionObject(DeploymentCondition deploymentConditionObject){
            _visitables.remove(this.object);
            if (deploymentConditionObject!=null){ this.object= new DeploymentConditionBuilder(deploymentConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentConditionObjectNested<A> withNewDeploymentConditionObject(){
            return new DeploymentConditionObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentConditionObjectNested<A> withNewDeploymentConditionObjectLike(DeploymentCondition item){
            return new DeploymentConditionObjectNestedImpl(item);
    }

    public A withClusterObject(Cluster clusterObject){
            _visitables.remove(this.object);
            if (clusterObject!=null){ this.object= new ClusterBuilder(clusterObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ClusterObjectNested<A> withNewClusterObject(){
            return new ClusterObjectNestedImpl();
    }

    public WatchEventFluent.ClusterObjectNested<A> withNewClusterObjectLike(Cluster item){
            return new ClusterObjectNestedImpl(item);
    }

    public A withImageStreamObject(ImageStream imageStreamObject){
            _visitables.remove(this.object);
            if (imageStreamObject!=null){ this.object= new ImageStreamBuilder(imageStreamObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamObjectNested<A> withNewImageStreamObject(){
            return new ImageStreamObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamObjectNested<A> withNewImageStreamObjectLike(ImageStream item){
            return new ImageStreamObjectNestedImpl(item);
    }

    public A withStorageOSVolumeSourceObject(StorageOSVolumeSource storageOSVolumeSourceObject){
            _visitables.remove(this.object);
            if (storageOSVolumeSourceObject!=null){ this.object= new StorageOSVolumeSourceBuilder(storageOSVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StorageOSVolumeSourceObjectNested<A> withNewStorageOSVolumeSourceObject(){
            return new StorageOSVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.StorageOSVolumeSourceObjectNested<A> withNewStorageOSVolumeSourceObjectLike(StorageOSVolumeSource item){
            return new StorageOSVolumeSourceObjectNestedImpl(item);
    }

    public A withBuildListObject(BuildList buildListObject){
            _visitables.remove(this.object);
            if (buildListObject!=null){ this.object= new BuildListBuilder(buildListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildListObjectNested<A> withNewBuildListObject(){
            return new BuildListObjectNestedImpl();
    }

    public WatchEventFluent.BuildListObjectNested<A> withNewBuildListObjectLike(BuildList item){
            return new BuildListObjectNestedImpl(item);
    }

    public A withTemplateListObject(TemplateList templateListObject){
            _visitables.remove(this.object);
            if (templateListObject!=null){ this.object= new TemplateListBuilder(templateListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TemplateListObjectNested<A> withNewTemplateListObject(){
            return new TemplateListObjectNestedImpl();
    }

    public WatchEventFluent.TemplateListObjectNested<A> withNewTemplateListObjectLike(TemplateList item){
            return new TemplateListObjectNestedImpl(item);
    }

    public A withKubernetesListObject(KubernetesList kubernetesListObject){
            _visitables.remove(this.object);
            if (kubernetesListObject!=null){ this.object= new KubernetesListBuilder(kubernetesListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.KubernetesListObjectNested<A> withNewKubernetesListObject(){
            return new KubernetesListObjectNestedImpl();
    }

    public WatchEventFluent.KubernetesListObjectNested<A> withNewKubernetesListObjectLike(KubernetesList item){
            return new KubernetesListObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionVersionObject(CustomResourceDefinitionVersion customResourceDefinitionVersionObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionVersionObject!=null){ this.object= new CustomResourceDefinitionVersionBuilder(customResourceDefinitionVersionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionVersionObjectNested<A> withNewCustomResourceDefinitionVersionObject(){
            return new CustomResourceDefinitionVersionObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionVersionObjectNested<A> withNewCustomResourceDefinitionVersionObjectLike(CustomResourceDefinitionVersion item){
            return new CustomResourceDefinitionVersionObjectNestedImpl(item);
    }

    public A withProjectSpecObject(ProjectSpec projectSpecObject){
            _visitables.remove(this.object);
            if (projectSpecObject!=null){ this.object= new ProjectSpecBuilder(projectSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProjectSpecObjectNested<A> withNewProjectSpecObject(){
            return new ProjectSpecObjectNestedImpl();
    }

    public WatchEventFluent.ProjectSpecObjectNested<A> withNewProjectSpecObjectLike(ProjectSpec item){
            return new ProjectSpecObjectNestedImpl(item);
    }

    public A withHTTPHeaderObject(HTTPHeader hTTPHeaderObject){
            _visitables.remove(this.object);
            if (hTTPHeaderObject!=null){ this.object= new HTTPHeaderBuilder(hTTPHeaderObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HTTPHeaderObjectNested<A> withNewHTTPHeaderObject(){
            return new HTTPHeaderObjectNestedImpl();
    }

    public WatchEventFluent.HTTPHeaderObjectNested<A> withNewHTTPHeaderObjectLike(HTTPHeader item){
            return new HTTPHeaderObjectNestedImpl(item);
    }

    public A withNewHTTPHeaderObject(String name,String value){
            return (A)withHTTPHeaderObject(new HTTPHeader(name, value));
    }

    public A withCapabilitiesObject(Capabilities capabilitiesObject){
            _visitables.remove(this.object);
            if (capabilitiesObject!=null){ this.object= new CapabilitiesBuilder(capabilitiesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CapabilitiesObjectNested<A> withNewCapabilitiesObject(){
            return new CapabilitiesObjectNestedImpl();
    }

    public WatchEventFluent.CapabilitiesObjectNested<A> withNewCapabilitiesObjectLike(Capabilities item){
            return new CapabilitiesObjectNestedImpl(item);
    }

    public A withObjectReferenceObject(ObjectReference objectReferenceObject){
            _visitables.remove(this.object);
            if (objectReferenceObject!=null){ this.object= new ObjectReferenceBuilder(objectReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ObjectReferenceObjectNested<A> withNewObjectReferenceObject(){
            return new ObjectReferenceObjectNestedImpl();
    }

    public WatchEventFluent.ObjectReferenceObjectNested<A> withNewObjectReferenceObjectLike(ObjectReference item){
            return new ObjectReferenceObjectNestedImpl(item);
    }

    public A withWatchEventObject(WatchEvent watchEventObject){
            _visitables.remove(this.object);
            if (watchEventObject!=null){ this.object= new WatchEventBuilder(watchEventObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.WatchEventObjectNested<A> withNewWatchEventObject(){
            return new WatchEventObjectNestedImpl();
    }

    public WatchEventFluent.WatchEventObjectNested<A> withNewWatchEventObjectLike(WatchEvent item){
            return new WatchEventObjectNestedImpl(item);
    }

    public A withSignatureIssuerObject(SignatureIssuer signatureIssuerObject){
            _visitables.remove(this.object);
            if (signatureIssuerObject!=null){ this.object= new SignatureIssuerBuilder(signatureIssuerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SignatureIssuerObjectNested<A> withNewSignatureIssuerObject(){
            return new SignatureIssuerObjectNestedImpl();
    }

    public WatchEventFluent.SignatureIssuerObjectNested<A> withNewSignatureIssuerObjectLike(SignatureIssuer item){
            return new SignatureIssuerObjectNestedImpl(item);
    }

    public A withNewSignatureIssuerObject(String commonName,String organization){
            return (A)withSignatureIssuerObject(new SignatureIssuer(commonName, organization));
    }

    public A withImageLayerObject(ImageLayer imageLayerObject){
            _visitables.remove(this.object);
            if (imageLayerObject!=null){ this.object= new ImageLayerBuilder(imageLayerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageLayerObjectNested<A> withNewImageLayerObject(){
            return new ImageLayerObjectNestedImpl();
    }

    public WatchEventFluent.ImageLayerObjectNested<A> withNewImageLayerObjectLike(ImageLayer item){
            return new ImageLayerObjectNestedImpl(item);
    }

    public A withNewImageLayerObject(String mediaType,String name,Long size){
            return (A)withImageLayerObject(new ImageLayer(mediaType, name, size));
    }

    public A withSecretProjectionObject(SecretProjection secretProjectionObject){
            _visitables.remove(this.object);
            if (secretProjectionObject!=null){ this.object= new SecretProjectionBuilder(secretProjectionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretProjectionObjectNested<A> withNewSecretProjectionObject(){
            return new SecretProjectionObjectNestedImpl();
    }

    public WatchEventFluent.SecretProjectionObjectNested<A> withNewSecretProjectionObjectLike(SecretProjection item){
            return new SecretProjectionObjectNestedImpl(item);
    }

    public A withWebhookClientConfigObject(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig webhookClientConfigObject){
            _visitables.remove(this.object);
            if (webhookClientConfigObject!=null){ this.object= new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder(webhookClientConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<A> withNewApiextensionsWebhookClientConfigObject(){
            return new ApiextensionsWebhookClientConfigObjectNestedImpl();
    }

    public WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<A> withNewWebhookClientConfigObjectLike(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item){
            return new ApiextensionsWebhookClientConfigObjectNestedImpl(item);
    }

    public A withGlusterfsVolumeSourceObject(GlusterfsVolumeSource glusterfsVolumeSourceObject){
            _visitables.remove(this.object);
            if (glusterfsVolumeSourceObject!=null){ this.object= new GlusterfsVolumeSourceBuilder(glusterfsVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GlusterfsVolumeSourceObjectNested<A> withNewGlusterfsVolumeSourceObject(){
            return new GlusterfsVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.GlusterfsVolumeSourceObjectNested<A> withNewGlusterfsVolumeSourceObjectLike(GlusterfsVolumeSource item){
            return new GlusterfsVolumeSourceObjectNestedImpl(item);
    }

    public A withNewGlusterfsVolumeSourceObject(String endpoints,String path,Boolean readOnly){
            return (A)withGlusterfsVolumeSourceObject(new GlusterfsVolumeSource(endpoints, path, readOnly));
    }

    public A withNamespaceStatusObject(NamespaceStatus namespaceStatusObject){
            _visitables.remove(this.object);
            if (namespaceStatusObject!=null){ this.object= new NamespaceStatusBuilder(namespaceStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamespaceStatusObjectNested<A> withNewNamespaceStatusObject(){
            return new NamespaceStatusObjectNestedImpl();
    }

    public WatchEventFluent.NamespaceStatusObjectNested<A> withNewNamespaceStatusObjectLike(NamespaceStatus item){
            return new NamespaceStatusObjectNestedImpl(item);
    }

    public A withNewNamespaceStatusObject(String phase){
            return (A)withNamespaceStatusObject(new NamespaceStatus(phase));
    }

    public A withOpenshiftRoleObject(OpenshiftRole openshiftRoleObject){
            _visitables.remove(this.object);
            if (openshiftRoleObject!=null){ this.object= new OpenshiftRoleBuilder(openshiftRoleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObject(){
            return new OpenshiftRoleObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftRoleObjectNested<A> withNewOpenshiftRoleObjectLike(OpenshiftRole item){
            return new OpenshiftRoleObjectNestedImpl(item);
    }

    public A withCronJobSpecObject(CronJobSpec cronJobSpecObject){
            _visitables.remove(this.object);
            if (cronJobSpecObject!=null){ this.object= new CronJobSpecBuilder(cronJobSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CronJobSpecObjectNested<A> withNewCronJobSpecObject(){
            return new CronJobSpecObjectNestedImpl();
    }

    public WatchEventFluent.CronJobSpecObjectNested<A> withNewCronJobSpecObjectLike(CronJobSpec item){
            return new CronJobSpecObjectNestedImpl(item);
    }

    public A withCustomResourceColumnDefinitionObject(CustomResourceColumnDefinition customResourceColumnDefinitionObject){
            _visitables.remove(this.object);
            if (customResourceColumnDefinitionObject!=null){ this.object= new CustomResourceColumnDefinitionBuilder(customResourceColumnDefinitionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceColumnDefinitionObjectNested<A> withNewCustomResourceColumnDefinitionObject(){
            return new CustomResourceColumnDefinitionObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceColumnDefinitionObjectNested<A> withNewCustomResourceColumnDefinitionObjectLike(CustomResourceColumnDefinition item){
            return new CustomResourceColumnDefinitionObjectNestedImpl(item);
    }

    public A withImageStreamSpecObject(ImageStreamSpec imageStreamSpecObject){
            _visitables.remove(this.object);
            if (imageStreamSpecObject!=null){ this.object= new ImageStreamSpecBuilder(imageStreamSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamSpecObjectNested<A> withNewImageStreamSpecObject(){
            return new ImageStreamSpecObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamSpecObjectNested<A> withNewImageStreamSpecObjectLike(ImageStreamSpec item){
            return new ImageStreamSpecObjectNestedImpl(item);
    }

    public A withSecretEnvSourceObject(SecretEnvSource secretEnvSourceObject){
            _visitables.remove(this.object);
            if (secretEnvSourceObject!=null){ this.object= new SecretEnvSourceBuilder(secretEnvSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretEnvSourceObjectNested<A> withNewSecretEnvSourceObject(){
            return new SecretEnvSourceObjectNestedImpl();
    }

    public WatchEventFluent.SecretEnvSourceObjectNested<A> withNewSecretEnvSourceObjectLike(SecretEnvSource item){
            return new SecretEnvSourceObjectNestedImpl(item);
    }

    public A withNewSecretEnvSourceObject(String name,Boolean optional){
            return (A)withSecretEnvSourceObject(new SecretEnvSource(name, optional));
    }

    public A withOAuthClientObject(OAuthClient oAuthClientObject){
            _visitables.remove(this.object);
            if (oAuthClientObject!=null){ this.object= new OAuthClientBuilder(oAuthClientObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthClientObjectNested<A> withNewOAuthClientObject(){
            return new OAuthClientObjectNestedImpl();
    }

    public WatchEventFluent.OAuthClientObjectNested<A> withNewOAuthClientObjectLike(OAuthClient item){
            return new OAuthClientObjectNestedImpl(item);
    }

    public A withIdentityObject(Identity identityObject){
            _visitables.remove(this.object);
            if (identityObject!=null){ this.object= new IdentityBuilder(identityObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IdentityObjectNested<A> withNewIdentityObject(){
            return new IdentityObjectNestedImpl();
    }

    public WatchEventFluent.IdentityObjectNested<A> withNewIdentityObjectLike(Identity item){
            return new IdentityObjectNestedImpl(item);
    }

    public A withAWSElasticBlockStoreVolumeSourceObject(AWSElasticBlockStoreVolumeSource aWSElasticBlockStoreVolumeSourceObject){
            _visitables.remove(this.object);
            if (aWSElasticBlockStoreVolumeSourceObject!=null){ this.object= new AWSElasticBlockStoreVolumeSourceBuilder(aWSElasticBlockStoreVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<A> withNewAWSElasticBlockStoreVolumeSourceObject(){
            return new AWSElasticBlockStoreVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<A> withNewAWSElasticBlockStoreVolumeSourceObjectLike(AWSElasticBlockStoreVolumeSource item){
            return new AWSElasticBlockStoreVolumeSourceObjectNestedImpl(item);
    }

    public A withNewAWSElasticBlockStoreVolumeSourceObject(String fsType,Integer partition,Boolean readOnly,String volumeID){
            return (A)withAWSElasticBlockStoreVolumeSourceObject(new AWSElasticBlockStoreVolumeSource(fsType, partition, readOnly, volumeID));
    }

    public A withMetricStatusObject(MetricStatus metricStatusObject){
            _visitables.remove(this.object);
            if (metricStatusObject!=null){ this.object= new MetricStatusBuilder(metricStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.MetricStatusObjectNested<A> withNewMetricStatusObject(){
            return new MetricStatusObjectNestedImpl();
    }

    public WatchEventFluent.MetricStatusObjectNested<A> withNewMetricStatusObjectLike(MetricStatus item){
            return new MetricStatusObjectNestedImpl(item);
    }

    public A withGenericWebHookCauseObject(GenericWebHookCause genericWebHookCauseObject){
            _visitables.remove(this.object);
            if (genericWebHookCauseObject!=null){ this.object= new GenericWebHookCauseBuilder(genericWebHookCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GenericWebHookCauseObjectNested<A> withNewGenericWebHookCauseObject(){
            return new GenericWebHookCauseObjectNestedImpl();
    }

    public WatchEventFluent.GenericWebHookCauseObjectNested<A> withNewGenericWebHookCauseObjectLike(GenericWebHookCause item){
            return new GenericWebHookCauseObjectNestedImpl(item);
    }

    public A withServiceAccountRestrictionObject(ServiceAccountRestriction serviceAccountRestrictionObject){
            _visitables.remove(this.object);
            if (serviceAccountRestrictionObject!=null){ this.object= new ServiceAccountRestrictionBuilder(serviceAccountRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceAccountRestrictionObjectNested<A> withNewServiceAccountRestrictionObject(){
            return new ServiceAccountRestrictionObjectNestedImpl();
    }

    public WatchEventFluent.ServiceAccountRestrictionObjectNested<A> withNewServiceAccountRestrictionObjectLike(ServiceAccountRestriction item){
            return new ServiceAccountRestrictionObjectNestedImpl(item);
    }

    public A withLimitRangeObject(LimitRange limitRangeObject){
            _visitables.remove(this.object);
            if (limitRangeObject!=null){ this.object= new LimitRangeBuilder(limitRangeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LimitRangeObjectNested<A> withNewLimitRangeObject(){
            return new LimitRangeObjectNestedImpl();
    }

    public WatchEventFluent.LimitRangeObjectNested<A> withNewLimitRangeObjectLike(LimitRange item){
            return new LimitRangeObjectNestedImpl(item);
    }

    public A withSecretLocalReferenceObject(SecretLocalReference secretLocalReferenceObject){
            _visitables.remove(this.object);
            if (secretLocalReferenceObject!=null){ this.object= new SecretLocalReferenceBuilder(secretLocalReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretLocalReferenceObjectNested<A> withNewSecretLocalReferenceObject(){
            return new SecretLocalReferenceObjectNestedImpl();
    }

    public WatchEventFluent.SecretLocalReferenceObjectNested<A> withNewSecretLocalReferenceObjectLike(SecretLocalReference item){
            return new SecretLocalReferenceObjectNestedImpl(item);
    }

    public A withNewSecretLocalReferenceObject(String name){
            return (A)withSecretLocalReferenceObject(new SecretLocalReference(name));
    }

    public A withIDRangeObject(IDRange iDRangeObject){
            _visitables.remove(this.object);
            if (iDRangeObject!=null){ this.object= new IDRangeBuilder(iDRangeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IDRangeObjectNested<A> withNewIDRangeObject(){
            return new IDRangeObjectNestedImpl();
    }

    public WatchEventFluent.IDRangeObjectNested<A> withNewIDRangeObjectLike(IDRange item){
            return new IDRangeObjectNestedImpl(item);
    }

    public A withNewIDRangeObject(Long max,Long min){
            return (A)withIDRangeObject(new IDRange(max, min));
    }

    public A withUserRestrictionObject(UserRestriction userRestrictionObject){
            _visitables.remove(this.object);
            if (userRestrictionObject!=null){ this.object= new UserRestrictionBuilder(userRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.UserRestrictionObjectNested<A> withNewUserRestrictionObject(){
            return new UserRestrictionObjectNestedImpl();
    }

    public WatchEventFluent.UserRestrictionObjectNested<A> withNewUserRestrictionObjectLike(UserRestriction item){
            return new UserRestrictionObjectNestedImpl(item);
    }

    public A withCSIPersistentVolumeSourceObject(CSIPersistentVolumeSource cSIPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (cSIPersistentVolumeSourceObject!=null){ this.object= new CSIPersistentVolumeSourceBuilder(cSIPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CSIPersistentVolumeSourceObjectNested<A> withNewCSIPersistentVolumeSourceObject(){
            return new CSIPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.CSIPersistentVolumeSourceObjectNested<A> withNewCSIPersistentVolumeSourceObjectLike(CSIPersistentVolumeSource item){
            return new CSIPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withImageStreamImportObject(ImageStreamImport imageStreamImportObject){
            _visitables.remove(this.object);
            if (imageStreamImportObject!=null){ this.object= new ImageStreamImportBuilder(imageStreamImportObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObject(){
            return new ImageStreamImportObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamImportObjectNested<A> withNewImageStreamImportObjectLike(ImageStreamImport item){
            return new ImageStreamImportObjectNestedImpl(item);
    }

    public A withReplicaSetSpecObject(ReplicaSetSpec replicaSetSpecObject){
            _visitables.remove(this.object);
            if (replicaSetSpecObject!=null){ this.object= new ReplicaSetSpecBuilder(replicaSetSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicaSetSpecObjectNested<A> withNewReplicaSetSpecObject(){
            return new ReplicaSetSpecObjectNestedImpl();
    }

    public WatchEventFluent.ReplicaSetSpecObjectNested<A> withNewReplicaSetSpecObjectLike(ReplicaSetSpec item){
            return new ReplicaSetSpecObjectNestedImpl(item);
    }

    public A withResourceRequirementsObject(ResourceRequirements resourceRequirementsObject){
            _visitables.remove(this.object);
            if (resourceRequirementsObject!=null){ this.object= new ResourceRequirementsBuilder(resourceRequirementsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceRequirementsObjectNested<A> withNewResourceRequirementsObject(){
            return new ResourceRequirementsObjectNestedImpl();
    }

    public WatchEventFluent.ResourceRequirementsObjectNested<A> withNewResourceRequirementsObjectLike(ResourceRequirements item){
            return new ResourceRequirementsObjectNestedImpl(item);
    }

    public A withExternalMetricSourceObject(ExternalMetricSource externalMetricSourceObject){
            _visitables.remove(this.object);
            if (externalMetricSourceObject!=null){ this.object= new ExternalMetricSourceBuilder(externalMetricSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExternalMetricSourceObjectNested<A> withNewExternalMetricSourceObject(){
            return new ExternalMetricSourceObjectNestedImpl();
    }

    public WatchEventFluent.ExternalMetricSourceObjectNested<A> withNewExternalMetricSourceObjectLike(ExternalMetricSource item){
            return new ExternalMetricSourceObjectNestedImpl(item);
    }

    public A withGitHubWebHookCauseObject(GitHubWebHookCause gitHubWebHookCauseObject){
            _visitables.remove(this.object);
            if (gitHubWebHookCauseObject!=null){ this.object= new GitHubWebHookCauseBuilder(gitHubWebHookCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GitHubWebHookCauseObjectNested<A> withNewGitHubWebHookCauseObject(){
            return new GitHubWebHookCauseObjectNestedImpl();
    }

    public WatchEventFluent.GitHubWebHookCauseObjectNested<A> withNewGitHubWebHookCauseObjectLike(GitHubWebHookCause item){
            return new GitHubWebHookCauseObjectNestedImpl(item);
    }

    public A withPersistentVolumeClaimListObject(PersistentVolumeClaimList persistentVolumeClaimListObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimListObject!=null){ this.object= new PersistentVolumeClaimListBuilder(persistentVolumeClaimListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeClaimListObjectNested<A> withNewPersistentVolumeClaimListObject(){
            return new PersistentVolumeClaimListObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeClaimListObjectNested<A> withNewPersistentVolumeClaimListObjectLike(PersistentVolumeClaimList item){
            return new PersistentVolumeClaimListObjectNestedImpl(item);
    }

    public A withOAuthClientListObject(OAuthClientList oAuthClientListObject){
            _visitables.remove(this.object);
            if (oAuthClientListObject!=null){ this.object= new OAuthClientListBuilder(oAuthClientListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthClientListObjectNested<A> withNewOAuthClientListObject(){
            return new OAuthClientListObjectNestedImpl();
    }

    public WatchEventFluent.OAuthClientListObjectNested<A> withNewOAuthClientListObjectLike(OAuthClientList item){
            return new OAuthClientListObjectNestedImpl(item);
    }

    public A withOpenshiftRoleBindingListObject(OpenshiftRoleBindingList openshiftRoleBindingListObject){
            _visitables.remove(this.object);
            if (openshiftRoleBindingListObject!=null){ this.object= new OpenshiftRoleBindingListBuilder(openshiftRoleBindingListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftRoleBindingListObjectNested<A> withNewOpenshiftRoleBindingListObject(){
            return new OpenshiftRoleBindingListObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftRoleBindingListObjectNested<A> withNewOpenshiftRoleBindingListObjectLike(OpenshiftRoleBindingList item){
            return new OpenshiftRoleBindingListObjectNestedImpl(item);
    }

    public A withResourceMetricSourceObject(ResourceMetricSource resourceMetricSourceObject){
            _visitables.remove(this.object);
            if (resourceMetricSourceObject!=null){ this.object= new ResourceMetricSourceBuilder(resourceMetricSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceMetricSourceObjectNested<A> withNewResourceMetricSourceObject(){
            return new ResourceMetricSourceObjectNestedImpl();
    }

    public WatchEventFluent.ResourceMetricSourceObjectNested<A> withNewResourceMetricSourceObjectLike(ResourceMetricSource item){
            return new ResourceMetricSourceObjectNestedImpl(item);
    }

    public A withReplicationControllerStatusObject(ReplicationControllerStatus replicationControllerStatusObject){
            _visitables.remove(this.object);
            if (replicationControllerStatusObject!=null){ this.object= new ReplicationControllerStatusBuilder(replicationControllerStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicationControllerStatusObjectNested<A> withNewReplicationControllerStatusObject(){
            return new ReplicationControllerStatusObjectNestedImpl();
    }

    public WatchEventFluent.ReplicationControllerStatusObjectNested<A> withNewReplicationControllerStatusObjectLike(ReplicationControllerStatus item){
            return new ReplicationControllerStatusObjectNestedImpl(item);
    }

    public A withIngressListObject(IngressList ingressListObject){
            _visitables.remove(this.object);
            if (ingressListObject!=null){ this.object= new IngressListBuilder(ingressListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressListObjectNested<A> withNewIngressListObject(){
            return new IngressListObjectNestedImpl();
    }

    public WatchEventFluent.IngressListObjectNested<A> withNewIngressListObjectLike(IngressList item){
            return new IngressListObjectNestedImpl(item);
    }

    public A withMicroTimeObject(MicroTime microTimeObject){
            _visitables.remove(this.object);
            if (microTimeObject!=null){ this.object= new MicroTimeBuilder(microTimeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.MicroTimeObjectNested<A> withNewMicroTimeObject(){
            return new MicroTimeObjectNestedImpl();
    }

    public WatchEventFluent.MicroTimeObjectNested<A> withNewMicroTimeObjectLike(MicroTime item){
            return new MicroTimeObjectNestedImpl(item);
    }

    public A withNewMicroTimeObject(String time){
            return (A)withMicroTimeObject(new MicroTime(time));
    }

    public A withValidatingWebhookConfigurationListObject(ValidatingWebhookConfigurationList validatingWebhookConfigurationListObject){
            _visitables.remove(this.object);
            if (validatingWebhookConfigurationListObject!=null){ this.object= new ValidatingWebhookConfigurationListBuilder(validatingWebhookConfigurationListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<A> withNewValidatingWebhookConfigurationListObject(){
            return new ValidatingWebhookConfigurationListObjectNestedImpl();
    }

    public WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<A> withNewValidatingWebhookConfigurationListObjectLike(ValidatingWebhookConfigurationList item){
            return new ValidatingWebhookConfigurationListObjectNestedImpl(item);
    }

    public A withPolicyRuleObject(PolicyRule policyRuleObject){
            _visitables.remove(this.object);
            if (policyRuleObject!=null){ this.object= new PolicyRuleBuilder(policyRuleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PolicyRuleObjectNested<A> withNewPolicyRuleObject(){
            return new PolicyRuleObjectNestedImpl();
    }

    public WatchEventFluent.PolicyRuleObjectNested<A> withNewPolicyRuleObjectLike(PolicyRule item){
            return new PolicyRuleObjectNestedImpl(item);
    }

    public A withLifecycleObject(Lifecycle lifecycleObject){
            _visitables.remove(this.object);
            if (lifecycleObject!=null){ this.object= new LifecycleBuilder(lifecycleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LifecycleObjectNested<A> withNewLifecycleObject(){
            return new LifecycleObjectNestedImpl();
    }

    public WatchEventFluent.LifecycleObjectNested<A> withNewLifecycleObjectLike(Lifecycle item){
            return new LifecycleObjectNestedImpl(item);
    }

    public A withRepositoryImportSpecObject(RepositoryImportSpec repositoryImportSpecObject){
            _visitables.remove(this.object);
            if (repositoryImportSpecObject!=null){ this.object= new RepositoryImportSpecBuilder(repositoryImportSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RepositoryImportSpecObjectNested<A> withNewRepositoryImportSpecObject(){
            return new RepositoryImportSpecObjectNestedImpl();
    }

    public WatchEventFluent.RepositoryImportSpecObjectNested<A> withNewRepositoryImportSpecObjectLike(RepositoryImportSpec item){
            return new RepositoryImportSpecObjectNestedImpl(item);
    }

    public A withPortworxVolumeSourceObject(PortworxVolumeSource portworxVolumeSourceObject){
            _visitables.remove(this.object);
            if (portworxVolumeSourceObject!=null){ this.object= new PortworxVolumeSourceBuilder(portworxVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PortworxVolumeSourceObjectNested<A> withNewPortworxVolumeSourceObject(){
            return new PortworxVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.PortworxVolumeSourceObjectNested<A> withNewPortworxVolumeSourceObjectLike(PortworxVolumeSource item){
            return new PortworxVolumeSourceObjectNestedImpl(item);
    }

    public A withNewPortworxVolumeSourceObject(String fsType,Boolean readOnly,String volumeID){
            return (A)withPortworxVolumeSourceObject(new PortworxVolumeSource(fsType, readOnly, volumeID));
    }

    public A withEventSourceObject(EventSource eventSourceObject){
            _visitables.remove(this.object);
            if (eventSourceObject!=null){ this.object= new EventSourceBuilder(eventSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EventSourceObjectNested<A> withNewEventSourceObject(){
            return new EventSourceObjectNestedImpl();
    }

    public WatchEventFluent.EventSourceObjectNested<A> withNewEventSourceObjectLike(EventSource item){
            return new EventSourceObjectNestedImpl(item);
    }

    public A withNewEventSourceObject(String component,String host){
            return (A)withEventSourceObject(new EventSource(component, host));
    }

    public A withInitializerObject(Initializer initializerObject){
            _visitables.remove(this.object);
            if (initializerObject!=null){ this.object= new InitializerBuilder(initializerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.InitializerObjectNested<A> withNewInitializerObject(){
            return new InitializerObjectNestedImpl();
    }

    public WatchEventFluent.InitializerObjectNested<A> withNewInitializerObjectLike(Initializer item){
            return new InitializerObjectNestedImpl(item);
    }

    public A withNewInitializerObject(String name){
            return (A)withInitializerObject(new Initializer(name));
    }

    public A withImageStreamImportStatusObject(ImageStreamImportStatus imageStreamImportStatusObject){
            _visitables.remove(this.object);
            if (imageStreamImportStatusObject!=null){ this.object= new ImageStreamImportStatusBuilder(imageStreamImportStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamImportStatusObjectNested<A> withNewImageStreamImportStatusObject(){
            return new ImageStreamImportStatusObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamImportStatusObjectNested<A> withNewImageStreamImportStatusObjectLike(ImageStreamImportStatus item){
            return new ImageStreamImportStatusObjectNestedImpl(item);
    }

    public A withHTTPIngressRuleValueObject(HTTPIngressRuleValue hTTPIngressRuleValueObject){
            _visitables.remove(this.object);
            if (hTTPIngressRuleValueObject!=null){ this.object= new HTTPIngressRuleValueBuilder(hTTPIngressRuleValueObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HTTPIngressRuleValueObjectNested<A> withNewHTTPIngressRuleValueObject(){
            return new HTTPIngressRuleValueObjectNestedImpl();
    }

    public WatchEventFluent.HTTPIngressRuleValueObjectNested<A> withNewHTTPIngressRuleValueObjectLike(HTTPIngressRuleValue item){
            return new HTTPIngressRuleValueObjectNestedImpl(item);
    }

    public A withOpenshiftRoleBindingRestrictionObject(OpenshiftRoleBindingRestriction openshiftRoleBindingRestrictionObject){
            _visitables.remove(this.object);
            if (openshiftRoleBindingRestrictionObject!=null){ this.object= new OpenshiftRoleBindingRestrictionBuilder(openshiftRoleBindingRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObject(){
            return new OpenshiftRoleBindingRestrictionObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<A> withNewOpenshiftRoleBindingRestrictionObjectLike(OpenshiftRoleBindingRestriction item){
            return new OpenshiftRoleBindingRestrictionObjectNestedImpl(item);
    }

    public A withComponentConditionObject(ComponentCondition componentConditionObject){
            _visitables.remove(this.object);
            if (componentConditionObject!=null){ this.object= new ComponentConditionBuilder(componentConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ComponentConditionObjectNested<A> withNewComponentConditionObject(){
            return new ComponentConditionObjectNestedImpl();
    }

    public WatchEventFluent.ComponentConditionObjectNested<A> withNewComponentConditionObjectLike(ComponentCondition item){
            return new ComponentConditionObjectNestedImpl(item);
    }

    public A withNewComponentConditionObject(String error,String message,String status,String type){
            return (A)withComponentConditionObject(new ComponentCondition(error, message, status, type));
    }

    public A withReplicationControllerSpecObject(ReplicationControllerSpec replicationControllerSpecObject){
            _visitables.remove(this.object);
            if (replicationControllerSpecObject!=null){ this.object= new ReplicationControllerSpecBuilder(replicationControllerSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicationControllerSpecObjectNested<A> withNewReplicationControllerSpecObject(){
            return new ReplicationControllerSpecObjectNestedImpl();
    }

    public WatchEventFluent.ReplicationControllerSpecObjectNested<A> withNewReplicationControllerSpecObjectLike(ReplicationControllerSpec item){
            return new ReplicationControllerSpecObjectNestedImpl(item);
    }

    public A withWebhookClientConfigObject(WebhookClientConfig webhookClientConfigObject){
            _visitables.remove(this.object);
            if (webhookClientConfigObject!=null){ this.object= new WebhookClientConfigBuilder(webhookClientConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.WebhookClientConfigObjectNested<A> withNewWebhookClientConfigObject(){
            return new WebhookClientConfigObjectNestedImpl();
    }

    public WatchEventFluent.WebhookClientConfigObjectNested<A> withNewWebhookClientConfigObjectLike(WebhookClientConfig item){
            return new WebhookClientConfigObjectNestedImpl(item);
    }

    public A withDeploymentTriggerImageChangeParamsObject(DeploymentTriggerImageChangeParams deploymentTriggerImageChangeParamsObject){
            _visitables.remove(this.object);
            if (deploymentTriggerImageChangeParamsObject!=null){ this.object= new DeploymentTriggerImageChangeParamsBuilder(deploymentTriggerImageChangeParamsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<A> withNewDeploymentTriggerImageChangeParamsObject(){
            return new DeploymentTriggerImageChangeParamsObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<A> withNewDeploymentTriggerImageChangeParamsObjectLike(DeploymentTriggerImageChangeParams item){
            return new DeploymentTriggerImageChangeParamsObjectNestedImpl(item);
    }

    public A withRoleBindingObject(RoleBinding roleBindingObject){
            _visitables.remove(this.object);
            if (roleBindingObject!=null){ this.object= new RoleBindingBuilder(roleBindingObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RoleBindingObjectNested<A> withNewRoleBindingObject(){
            return new RoleBindingObjectNestedImpl();
    }

    public WatchEventFluent.RoleBindingObjectNested<A> withNewRoleBindingObjectLike(RoleBinding item){
            return new RoleBindingObjectNestedImpl(item);
    }

    public A withPodPresetObject(PodPreset podPresetObject){
            _visitables.remove(this.object);
            if (podPresetObject!=null){ this.object= new PodPresetBuilder(podPresetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodPresetObjectNested<A> withNewPodPresetObject(){
            return new PodPresetObjectNestedImpl();
    }

    public WatchEventFluent.PodPresetObjectNested<A> withNewPodPresetObjectLike(PodPreset item){
            return new PodPresetObjectNestedImpl(item);
    }

    public A withRollingUpdateDeploymentObject(RollingUpdateDeployment rollingUpdateDeploymentObject){
            _visitables.remove(this.object);
            if (rollingUpdateDeploymentObject!=null){ this.object= new RollingUpdateDeploymentBuilder(rollingUpdateDeploymentObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RollingUpdateDeploymentObjectNested<A> withNewRollingUpdateDeploymentObject(){
            return new RollingUpdateDeploymentObjectNestedImpl();
    }

    public WatchEventFluent.RollingUpdateDeploymentObjectNested<A> withNewRollingUpdateDeploymentObjectLike(RollingUpdateDeployment item){
            return new RollingUpdateDeploymentObjectNestedImpl(item);
    }

    public A withEmptyDirVolumeSourceObject(EmptyDirVolumeSource emptyDirVolumeSourceObject){
            _visitables.remove(this.object);
            if (emptyDirVolumeSourceObject!=null){ this.object= new EmptyDirVolumeSourceBuilder(emptyDirVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EmptyDirVolumeSourceObjectNested<A> withNewEmptyDirVolumeSourceObject(){
            return new EmptyDirVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.EmptyDirVolumeSourceObjectNested<A> withNewEmptyDirVolumeSourceObjectLike(EmptyDirVolumeSource item){
            return new EmptyDirVolumeSourceObjectNestedImpl(item);
    }

    public A withTagImageHookObject(TagImageHook tagImageHookObject){
            _visitables.remove(this.object);
            if (tagImageHookObject!=null){ this.object= new TagImageHookBuilder(tagImageHookObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TagImageHookObjectNested<A> withNewTagImageHookObject(){
            return new TagImageHookObjectNestedImpl();
    }

    public WatchEventFluent.TagImageHookObjectNested<A> withNewTagImageHookObjectLike(TagImageHook item){
            return new TagImageHookObjectNestedImpl(item);
    }

    public A withRouteTargetReferenceObject(RouteTargetReference routeTargetReferenceObject){
            _visitables.remove(this.object);
            if (routeTargetReferenceObject!=null){ this.object= new RouteTargetReferenceBuilder(routeTargetReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteTargetReferenceObjectNested<A> withNewRouteTargetReferenceObject(){
            return new RouteTargetReferenceObjectNestedImpl();
    }

    public WatchEventFluent.RouteTargetReferenceObjectNested<A> withNewRouteTargetReferenceObjectLike(RouteTargetReference item){
            return new RouteTargetReferenceObjectNestedImpl(item);
    }

    public A withNewRouteTargetReferenceObject(String kind,String name,Integer weight){
            return (A)withRouteTargetReferenceObject(new RouteTargetReference(kind, name, weight));
    }

    public A withAzureDiskVolumeSourceObject(AzureDiskVolumeSource azureDiskVolumeSourceObject){
            _visitables.remove(this.object);
            if (azureDiskVolumeSourceObject!=null){ this.object= new AzureDiskVolumeSourceBuilder(azureDiskVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AzureDiskVolumeSourceObjectNested<A> withNewAzureDiskVolumeSourceObject(){
            return new AzureDiskVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.AzureDiskVolumeSourceObjectNested<A> withNewAzureDiskVolumeSourceObjectLike(AzureDiskVolumeSource item){
            return new AzureDiskVolumeSourceObjectNestedImpl(item);
    }

    public A withProjectObject(Project projectObject){
            _visitables.remove(this.object);
            if (projectObject!=null){ this.object= new ProjectBuilder(projectObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProjectObjectNested<A> withNewProjectObject(){
            return new ProjectObjectNestedImpl();
    }

    public WatchEventFluent.ProjectObjectNested<A> withNewProjectObjectLike(Project item){
            return new ProjectObjectNestedImpl(item);
    }

    public A withInfoObject(Info infoObject){
            _visitables.remove(this.object);
            if (infoObject!=null){ this.object= new InfoBuilder(infoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.InfoObjectNested<A> withNewInfoObject(){
            return new InfoObjectNestedImpl();
    }

    public WatchEventFluent.InfoObjectNested<A> withNewInfoObjectLike(Info item){
            return new InfoObjectNestedImpl(item);
    }

    public A withServiceStatusObject(ServiceStatus serviceStatusObject){
            _visitables.remove(this.object);
            if (serviceStatusObject!=null){ this.object= new ServiceStatusBuilder(serviceStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceStatusObjectNested<A> withNewServiceStatusObject(){
            return new ServiceStatusObjectNestedImpl();
    }

    public WatchEventFluent.ServiceStatusObjectNested<A> withNewServiceStatusObjectLike(ServiceStatus item){
            return new ServiceStatusObjectNestedImpl(item);
    }

    public A withTaintObject(Taint taintObject){
            _visitables.remove(this.object);
            if (taintObject!=null){ this.object= new TaintBuilder(taintObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TaintObjectNested<A> withNewTaintObject(){
            return new TaintObjectNestedImpl();
    }

    public WatchEventFluent.TaintObjectNested<A> withNewTaintObjectLike(Taint item){
            return new TaintObjectNestedImpl(item);
    }

    public A withNewTaintObject(String effect,String key,String timeAdded,String value){
            return (A)withTaintObject(new Taint(effect, key, timeAdded, value));
    }

    public A withOpenshiftRoleBindingRestrictionSpecObject(OpenshiftRoleBindingRestrictionSpec openshiftRoleBindingRestrictionSpecObject){
            _visitables.remove(this.object);
            if (openshiftRoleBindingRestrictionSpecObject!=null){ this.object= new OpenshiftRoleBindingRestrictionSpecBuilder(openshiftRoleBindingRestrictionSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<A> withNewOpenshiftRoleBindingRestrictionSpecObject(){
            return new OpenshiftRoleBindingRestrictionSpecObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<A> withNewOpenshiftRoleBindingRestrictionSpecObjectLike(OpenshiftRoleBindingRestrictionSpec item){
            return new OpenshiftRoleBindingRestrictionSpecObjectNestedImpl(item);
    }

    public A withAllowedHostPathObject(AllowedHostPath allowedHostPathObject){
            _visitables.remove(this.object);
            if (allowedHostPathObject!=null){ this.object= new AllowedHostPathBuilder(allowedHostPathObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AllowedHostPathObjectNested<A> withNewAllowedHostPathObject(){
            return new AllowedHostPathObjectNestedImpl();
    }

    public WatchEventFluent.AllowedHostPathObjectNested<A> withNewAllowedHostPathObjectLike(AllowedHostPath item){
            return new AllowedHostPathObjectNestedImpl(item);
    }

    public A withNewAllowedHostPathObject(String pathPrefix,Boolean readOnly){
            return (A)withAllowedHostPathObject(new AllowedHostPath(pathPrefix, readOnly));
    }

    public A withDeploymentConfigListObject(DeploymentConfigList deploymentConfigListObject){
            _visitables.remove(this.object);
            if (deploymentConfigListObject!=null){ this.object= new DeploymentConfigListBuilder(deploymentConfigListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentConfigListObjectNested<A> withNewDeploymentConfigListObject(){
            return new DeploymentConfigListObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentConfigListObjectNested<A> withNewDeploymentConfigListObjectLike(DeploymentConfigList item){
            return new DeploymentConfigListObjectNestedImpl(item);
    }

    public A withBuildConfigObject(BuildConfig buildConfigObject){
            _visitables.remove(this.object);
            if (buildConfigObject!=null){ this.object= new BuildConfigBuilder(buildConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildConfigObjectNested<A> withNewBuildConfigObject(){
            return new BuildConfigObjectNestedImpl();
    }

    public WatchEventFluent.BuildConfigObjectNested<A> withNewBuildConfigObjectLike(BuildConfig item){
            return new BuildConfigObjectNestedImpl(item);
    }

    public A withCustomResourceConversionObject(CustomResourceConversion customResourceConversionObject){
            _visitables.remove(this.object);
            if (customResourceConversionObject!=null){ this.object= new CustomResourceConversionBuilder(customResourceConversionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceConversionObjectNested<A> withNewCustomResourceConversionObject(){
            return new CustomResourceConversionObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceConversionObjectNested<A> withNewCustomResourceConversionObjectLike(CustomResourceConversion item){
            return new CustomResourceConversionObjectNestedImpl(item);
    }

    public A withCustomResourceDefinitionNamesObject(CustomResourceDefinitionNames customResourceDefinitionNamesObject){
            _visitables.remove(this.object);
            if (customResourceDefinitionNamesObject!=null){ this.object= new CustomResourceDefinitionNamesBuilder(customResourceDefinitionNamesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceDefinitionNamesObjectNested<A> withNewCustomResourceDefinitionNamesObject(){
            return new CustomResourceDefinitionNamesObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceDefinitionNamesObjectNested<A> withNewCustomResourceDefinitionNamesObjectLike(CustomResourceDefinitionNames item){
            return new CustomResourceDefinitionNamesObjectNestedImpl(item);
    }

    public A withImageImportStatusObject(ImageImportStatus imageImportStatusObject){
            _visitables.remove(this.object);
            if (imageImportStatusObject!=null){ this.object= new ImageImportStatusBuilder(imageImportStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageImportStatusObjectNested<A> withNewImageImportStatusObject(){
            return new ImageImportStatusObjectNestedImpl();
    }

    public WatchEventFluent.ImageImportStatusObjectNested<A> withNewImageImportStatusObjectLike(ImageImportStatus item){
            return new ImageImportStatusObjectNestedImpl(item);
    }

    public A withIngressTLSObject(IngressTLS ingressTLSObject){
            _visitables.remove(this.object);
            if (ingressTLSObject!=null){ this.object= new IngressTLSBuilder(ingressTLSObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressTLSObjectNested<A> withNewIngressTLSObject(){
            return new IngressTLSObjectNestedImpl();
    }

    public WatchEventFluent.IngressTLSObjectNested<A> withNewIngressTLSObjectLike(IngressTLS item){
            return new IngressTLSObjectNestedImpl(item);
    }

    public A withCustomResourceValidationObject(CustomResourceValidation customResourceValidationObject){
            _visitables.remove(this.object);
            if (customResourceValidationObject!=null){ this.object= new CustomResourceValidationBuilder(customResourceValidationObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceValidationObjectNested<A> withNewCustomResourceValidationObject(){
            return new CustomResourceValidationObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceValidationObjectNested<A> withNewCustomResourceValidationObjectLike(CustomResourceValidation item){
            return new CustomResourceValidationObjectNestedImpl(item);
    }

    public A withPodDisruptionBudgetListObject(PodDisruptionBudgetList podDisruptionBudgetListObject){
            _visitables.remove(this.object);
            if (podDisruptionBudgetListObject!=null){ this.object= new PodDisruptionBudgetListBuilder(podDisruptionBudgetListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodDisruptionBudgetListObjectNested<A> withNewPodDisruptionBudgetListObject(){
            return new PodDisruptionBudgetListObjectNestedImpl();
    }

    public WatchEventFluent.PodDisruptionBudgetListObjectNested<A> withNewPodDisruptionBudgetListObjectLike(PodDisruptionBudgetList item){
            return new PodDisruptionBudgetListObjectNestedImpl(item);
    }

    public A withDeploymentConfigStatusObject(DeploymentConfigStatus deploymentConfigStatusObject){
            _visitables.remove(this.object);
            if (deploymentConfigStatusObject!=null){ this.object= new DeploymentConfigStatusBuilder(deploymentConfigStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentConfigStatusObjectNested<A> withNewDeploymentConfigStatusObject(){
            return new DeploymentConfigStatusObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentConfigStatusObjectNested<A> withNewDeploymentConfigStatusObjectLike(DeploymentConfigStatus item){
            return new DeploymentConfigStatusObjectNestedImpl(item);
    }

    public A withGlusterfsPersistentVolumeSourceObject(GlusterfsPersistentVolumeSource glusterfsPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (glusterfsPersistentVolumeSourceObject!=null){ this.object= new GlusterfsPersistentVolumeSourceBuilder(glusterfsPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<A> withNewGlusterfsPersistentVolumeSourceObject(){
            return new GlusterfsPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<A> withNewGlusterfsPersistentVolumeSourceObjectLike(GlusterfsPersistentVolumeSource item){
            return new GlusterfsPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withNewGlusterfsPersistentVolumeSourceObject(String endpoints,String endpointsNamespace,String path,Boolean readOnly){
            return (A)withGlusterfsPersistentVolumeSourceObject(new GlusterfsPersistentVolumeSource(endpoints, endpointsNamespace, path, readOnly));
    }

    public A withClusterRoleObject(ClusterRole clusterRoleObject){
            _visitables.remove(this.object);
            if (clusterRoleObject!=null){ this.object= new ClusterRoleBuilder(clusterRoleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ClusterRoleObjectNested<A> withNewClusterRoleObject(){
            return new ClusterRoleObjectNestedImpl();
    }

    public WatchEventFluent.ClusterRoleObjectNested<A> withNewClusterRoleObjectLike(ClusterRole item){
            return new ClusterRoleObjectNestedImpl(item);
    }

    public A withClusterRoleBindingListObject(ClusterRoleBindingList clusterRoleBindingListObject){
            _visitables.remove(this.object);
            if (clusterRoleBindingListObject!=null){ this.object= new ClusterRoleBindingListBuilder(clusterRoleBindingListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ClusterRoleBindingListObjectNested<A> withNewClusterRoleBindingListObject(){
            return new ClusterRoleBindingListObjectNestedImpl();
    }

    public WatchEventFluent.ClusterRoleBindingListObjectNested<A> withNewClusterRoleBindingListObjectLike(ClusterRoleBindingList item){
            return new ClusterRoleBindingListObjectNestedImpl(item);
    }

    public A withTokenReviewStatusObject(TokenReviewStatus tokenReviewStatusObject){
            _visitables.remove(this.object);
            if (tokenReviewStatusObject!=null){ this.object= new TokenReviewStatusBuilder(tokenReviewStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TokenReviewStatusObjectNested<A> withNewTokenReviewStatusObject(){
            return new TokenReviewStatusObjectNestedImpl();
    }

    public WatchEventFluent.TokenReviewStatusObjectNested<A> withNewTokenReviewStatusObjectLike(TokenReviewStatus item){
            return new TokenReviewStatusObjectNestedImpl(item);
    }

    public A withTagEventObject(TagEvent tagEventObject){
            _visitables.remove(this.object);
            if (tagEventObject!=null){ this.object= new TagEventBuilder(tagEventObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TagEventObjectNested<A> withNewTagEventObject(){
            return new TagEventObjectNestedImpl();
    }

    public WatchEventFluent.TagEventObjectNested<A> withNewTagEventObjectLike(TagEvent item){
            return new TagEventObjectNestedImpl(item);
    }

    public A withNewTagEventObject(String created,String dockerImageReference,Long generation,String image){
            return (A)withTagEventObject(new TagEvent(created, dockerImageReference, generation, image));
    }

    public A withImageStreamTagListObject(ImageStreamTagList imageStreamTagListObject){
            _visitables.remove(this.object);
            if (imageStreamTagListObject!=null){ this.object= new ImageStreamTagListBuilder(imageStreamTagListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamTagListObjectNested<A> withNewImageStreamTagListObject(){
            return new ImageStreamTagListObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamTagListObjectNested<A> withNewImageStreamTagListObjectLike(ImageStreamTagList item){
            return new ImageStreamTagListObjectNestedImpl(item);
    }

    public A withCustomResourceSubresourceStatusObject(CustomResourceSubresourceStatus customResourceSubresourceStatusObject){
            _visitables.remove(this.object);
            if (customResourceSubresourceStatusObject!=null){ this.object= new CustomResourceSubresourceStatusBuilder(customResourceSubresourceStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CustomResourceSubresourceStatusObjectNested<A> withNewCustomResourceSubresourceStatusObject(){
            return new CustomResourceSubresourceStatusObjectNestedImpl();
    }

    public WatchEventFluent.CustomResourceSubresourceStatusObjectNested<A> withNewCustomResourceSubresourceStatusObjectLike(CustomResourceSubresourceStatus item){
            return new CustomResourceSubresourceStatusObjectNestedImpl(item);
    }

    public A withISCSIPersistentVolumeSourceObject(ISCSIPersistentVolumeSource iSCSIPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (iSCSIPersistentVolumeSourceObject!=null){ this.object= new ISCSIPersistentVolumeSourceBuilder(iSCSIPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<A> withNewISCSIPersistentVolumeSourceObject(){
            return new ISCSIPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<A> withNewISCSIPersistentVolumeSourceObjectLike(ISCSIPersistentVolumeSource item){
            return new ISCSIPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withDownwardAPIVolumeSourceObject(DownwardAPIVolumeSource downwardAPIVolumeSourceObject){
            _visitables.remove(this.object);
            if (downwardAPIVolumeSourceObject!=null){ this.object= new DownwardAPIVolumeSourceBuilder(downwardAPIVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DownwardAPIVolumeSourceObjectNested<A> withNewDownwardAPIVolumeSourceObject(){
            return new DownwardAPIVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.DownwardAPIVolumeSourceObjectNested<A> withNewDownwardAPIVolumeSourceObjectLike(DownwardAPIVolumeSource item){
            return new DownwardAPIVolumeSourceObjectNestedImpl(item);
    }

    public A withListMetaObject(ListMeta listMetaObject){
            _visitables.remove(this.object);
            if (listMetaObject!=null){ this.object= new ListMetaBuilder(listMetaObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ListMetaObjectNested<A> withNewListMetaObject(){
            return new ListMetaObjectNestedImpl();
    }

    public WatchEventFluent.ListMetaObjectNested<A> withNewListMetaObjectLike(ListMeta item){
            return new ListMetaObjectNestedImpl(item);
    }

    public A withNewListMetaObject(String _continue,String resourceVersion,String selfLink){
            return (A)withListMetaObject(new ListMeta(_continue, resourceVersion, selfLink));
    }

    public A withRootPathsObject(RootPaths rootPathsObject){
            _visitables.remove(this.object);
            if (rootPathsObject!=null){ this.object= new RootPathsBuilder(rootPathsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RootPathsObjectNested<A> withNewRootPathsObject(){
            return new RootPathsObjectNestedImpl();
    }

    public WatchEventFluent.RootPathsObjectNested<A> withNewRootPathsObjectLike(RootPaths item){
            return new RootPathsObjectNestedImpl(item);
    }

    public A withSecretReferenceObject(SecretReference secretReferenceObject){
            _visitables.remove(this.object);
            if (secretReferenceObject!=null){ this.object= new SecretReferenceBuilder(secretReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretReferenceObjectNested<A> withNewSecretReferenceObject(){
            return new SecretReferenceObjectNestedImpl();
    }

    public WatchEventFluent.SecretReferenceObjectNested<A> withNewSecretReferenceObjectLike(SecretReference item){
            return new SecretReferenceObjectNestedImpl(item);
    }

    public A withNewSecretReferenceObject(String name,String namespace){
            return (A)withSecretReferenceObject(new SecretReference(name, namespace));
    }

    public A withSourceStrategyOptionsObject(SourceStrategyOptions sourceStrategyOptionsObject){
            _visitables.remove(this.object);
            if (sourceStrategyOptionsObject!=null){ this.object= new SourceStrategyOptionsBuilder(sourceStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SourceStrategyOptionsObjectNested<A> withNewSourceStrategyOptionsObject(){
            return new SourceStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.SourceStrategyOptionsObjectNested<A> withNewSourceStrategyOptionsObjectLike(SourceStrategyOptions item){
            return new SourceStrategyOptionsObjectNestedImpl(item);
    }

    public A withNewSourceStrategyOptionsObject(Boolean incremental){
            return (A)withSourceStrategyOptionsObject(new SourceStrategyOptions(incremental));
    }

    public A withISCSIVolumeSourceObject(ISCSIVolumeSource iSCSIVolumeSourceObject){
            _visitables.remove(this.object);
            if (iSCSIVolumeSourceObject!=null){ this.object= new ISCSIVolumeSourceBuilder(iSCSIVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ISCSIVolumeSourceObjectNested<A> withNewISCSIVolumeSourceObject(){
            return new ISCSIVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.ISCSIVolumeSourceObjectNested<A> withNewISCSIVolumeSourceObjectLike(ISCSIVolumeSource item){
            return new ISCSIVolumeSourceObjectNestedImpl(item);
    }

    public A withSecretKeySelectorObject(SecretKeySelector secretKeySelectorObject){
            _visitables.remove(this.object);
            if (secretKeySelectorObject!=null){ this.object= new SecretKeySelectorBuilder(secretKeySelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretKeySelectorObjectNested<A> withNewSecretKeySelectorObject(){
            return new SecretKeySelectorObjectNestedImpl();
    }

    public WatchEventFluent.SecretKeySelectorObjectNested<A> withNewSecretKeySelectorObjectLike(SecretKeySelector item){
            return new SecretKeySelectorObjectNestedImpl(item);
    }

    public A withNewSecretKeySelectorObject(String key,String name,Boolean optional){
            return (A)withSecretKeySelectorObject(new SecretKeySelector(key, name, optional));
    }

    public A withOAuthAuthorizeTokenObject(OAuthAuthorizeToken oAuthAuthorizeTokenObject){
            _visitables.remove(this.object);
            if (oAuthAuthorizeTokenObject!=null){ this.object= new OAuthAuthorizeTokenBuilder(oAuthAuthorizeTokenObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObject(){
            return new OAuthAuthorizeTokenObjectNestedImpl();
    }

    public WatchEventFluent.OAuthAuthorizeTokenObjectNested<A> withNewOAuthAuthorizeTokenObjectLike(OAuthAuthorizeToken item){
            return new OAuthAuthorizeTokenObjectNestedImpl(item);
    }

    public A withQuobyteVolumeSourceObject(QuobyteVolumeSource quobyteVolumeSourceObject){
            _visitables.remove(this.object);
            if (quobyteVolumeSourceObject!=null){ this.object= new QuobyteVolumeSourceBuilder(quobyteVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.QuobyteVolumeSourceObjectNested<A> withNewQuobyteVolumeSourceObject(){
            return new QuobyteVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.QuobyteVolumeSourceObjectNested<A> withNewQuobyteVolumeSourceObjectLike(QuobyteVolumeSource item){
            return new QuobyteVolumeSourceObjectNestedImpl(item);
    }

    public A withNewQuobyteVolumeSourceObject(String group,Boolean readOnly,String registry,String user,String volume){
            return (A)withQuobyteVolumeSourceObject(new QuobyteVolumeSource(group, readOnly, registry, user, volume));
    }

    public A withDockerBuildStrategyObject(DockerBuildStrategy dockerBuildStrategyObject){
            _visitables.remove(this.object);
            if (dockerBuildStrategyObject!=null){ this.object= new DockerBuildStrategyBuilder(dockerBuildStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DockerBuildStrategyObjectNested<A> withNewDockerBuildStrategyObject(){
            return new DockerBuildStrategyObjectNestedImpl();
    }

    public WatchEventFluent.DockerBuildStrategyObjectNested<A> withNewDockerBuildStrategyObjectLike(DockerBuildStrategy item){
            return new DockerBuildStrategyObjectNestedImpl(item);
    }

    public A withSignatureConditionObject(SignatureCondition signatureConditionObject){
            _visitables.remove(this.object);
            if (signatureConditionObject!=null){ this.object= new SignatureConditionBuilder(signatureConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SignatureConditionObjectNested<A> withNewSignatureConditionObject(){
            return new SignatureConditionObjectNestedImpl();
    }

    public WatchEventFluent.SignatureConditionObjectNested<A> withNewSignatureConditionObjectLike(SignatureCondition item){
            return new SignatureConditionObjectNestedImpl(item);
    }

    public A withJobSpecObject(JobSpec jobSpecObject){
            _visitables.remove(this.object);
            if (jobSpecObject!=null){ this.object= new JobSpecBuilder(jobSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JobSpecObjectNested<A> withNewJobSpecObject(){
            return new JobSpecObjectNestedImpl();
    }

    public WatchEventFluent.JobSpecObjectNested<A> withNewJobSpecObjectLike(JobSpec item){
            return new JobSpecObjectNestedImpl(item);
    }

    public A withResourceQuotaStatusObject(ResourceQuotaStatus resourceQuotaStatusObject){
            _visitables.remove(this.object);
            if (resourceQuotaStatusObject!=null){ this.object= new ResourceQuotaStatusBuilder(resourceQuotaStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceQuotaStatusObjectNested<A> withNewResourceQuotaStatusObject(){
            return new ResourceQuotaStatusObjectNestedImpl();
    }

    public WatchEventFluent.ResourceQuotaStatusObjectNested<A> withNewResourceQuotaStatusObjectLike(ResourceQuotaStatus item){
            return new ResourceQuotaStatusObjectNestedImpl(item);
    }

    public A withExternalMetricStatusObject(ExternalMetricStatus externalMetricStatusObject){
            _visitables.remove(this.object);
            if (externalMetricStatusObject!=null){ this.object= new ExternalMetricStatusBuilder(externalMetricStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExternalMetricStatusObjectNested<A> withNewExternalMetricStatusObject(){
            return new ExternalMetricStatusObjectNestedImpl();
    }

    public WatchEventFluent.ExternalMetricStatusObjectNested<A> withNewExternalMetricStatusObjectLike(ExternalMetricStatus item){
            return new ExternalMetricStatusObjectNestedImpl(item);
    }

    public A withScopedResourceSelectorRequirementObject(ScopedResourceSelectorRequirement scopedResourceSelectorRequirementObject){
            _visitables.remove(this.object);
            if (scopedResourceSelectorRequirementObject!=null){ this.object= new ScopedResourceSelectorRequirementBuilder(scopedResourceSelectorRequirementObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<A> withNewScopedResourceSelectorRequirementObject(){
            return new ScopedResourceSelectorRequirementObjectNestedImpl();
    }

    public WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<A> withNewScopedResourceSelectorRequirementObjectLike(ScopedResourceSelectorRequirement item){
            return new ScopedResourceSelectorRequirementObjectNestedImpl(item);
    }

    public A withDeploymentCauseObject(DeploymentCause deploymentCauseObject){
            _visitables.remove(this.object);
            if (deploymentCauseObject!=null){ this.object= new DeploymentCauseBuilder(deploymentCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentCauseObjectNested<A> withNewDeploymentCauseObject(){
            return new DeploymentCauseObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentCauseObjectNested<A> withNewDeploymentCauseObjectLike(DeploymentCause item){
            return new DeploymentCauseObjectNestedImpl(item);
    }

    public A withRepositoryImportStatusObject(RepositoryImportStatus repositoryImportStatusObject){
            _visitables.remove(this.object);
            if (repositoryImportStatusObject!=null){ this.object= new RepositoryImportStatusBuilder(repositoryImportStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RepositoryImportStatusObjectNested<A> withNewRepositoryImportStatusObject(){
            return new RepositoryImportStatusObjectNestedImpl();
    }

    public WatchEventFluent.RepositoryImportStatusObjectNested<A> withNewRepositoryImportStatusObjectLike(RepositoryImportStatus item){
            return new RepositoryImportStatusObjectNestedImpl(item);
    }

    public A withGroupListObject(GroupList groupListObject){
            _visitables.remove(this.object);
            if (groupListObject!=null){ this.object= new GroupListBuilder(groupListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GroupListObjectNested<A> withNewGroupListObject(){
            return new GroupListObjectNestedImpl();
    }

    public WatchEventFluent.GroupListObjectNested<A> withNewGroupListObjectLike(GroupList item){
            return new GroupListObjectNestedImpl(item);
    }

    public A withProjectedVolumeSourceObject(ProjectedVolumeSource projectedVolumeSourceObject){
            _visitables.remove(this.object);
            if (projectedVolumeSourceObject!=null){ this.object= new ProjectedVolumeSourceBuilder(projectedVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProjectedVolumeSourceObjectNested<A> withNewProjectedVolumeSourceObject(){
            return new ProjectedVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.ProjectedVolumeSourceObjectNested<A> withNewProjectedVolumeSourceObjectLike(ProjectedVolumeSource item){
            return new ProjectedVolumeSourceObjectNestedImpl(item);
    }

    public A withLifecycleHookObject(LifecycleHook lifecycleHookObject){
            _visitables.remove(this.object);
            if (lifecycleHookObject!=null){ this.object= new LifecycleHookBuilder(lifecycleHookObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LifecycleHookObjectNested<A> withNewLifecycleHookObject(){
            return new LifecycleHookObjectNestedImpl();
    }

    public WatchEventFluent.LifecycleHookObjectNested<A> withNewLifecycleHookObjectLike(LifecycleHook item){
            return new LifecycleHookObjectNestedImpl(item);
    }

    public A withHandlerObject(Handler handlerObject){
            _visitables.remove(this.object);
            if (handlerObject!=null){ this.object= new HandlerBuilder(handlerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HandlerObjectNested<A> withNewHandlerObject(){
            return new HandlerObjectNestedImpl();
    }

    public WatchEventFluent.HandlerObjectNested<A> withNewHandlerObjectLike(Handler item){
            return new HandlerObjectNestedImpl(item);
    }

    public A withServiceAccountTokenProjectionObject(ServiceAccountTokenProjection serviceAccountTokenProjectionObject){
            _visitables.remove(this.object);
            if (serviceAccountTokenProjectionObject!=null){ this.object= new ServiceAccountTokenProjectionBuilder(serviceAccountTokenProjectionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceAccountTokenProjectionObjectNested<A> withNewServiceAccountTokenProjectionObject(){
            return new ServiceAccountTokenProjectionObjectNestedImpl();
    }

    public WatchEventFluent.ServiceAccountTokenProjectionObjectNested<A> withNewServiceAccountTokenProjectionObjectLike(ServiceAccountTokenProjection item){
            return new ServiceAccountTokenProjectionObjectNestedImpl(item);
    }

    public A withNewServiceAccountTokenProjectionObject(String audience,Long expirationSeconds,String path){
            return (A)withServiceAccountTokenProjectionObject(new ServiceAccountTokenProjection(audience, expirationSeconds, path));
    }

    public A withContainerObject(Container containerObject){
            _visitables.remove(this.object);
            if (containerObject!=null){ this.object= new ContainerBuilder(containerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerObjectNested<A> withNewContainerObject(){
            return new ContainerObjectNestedImpl();
    }

    public WatchEventFluent.ContainerObjectNested<A> withNewContainerObjectLike(Container item){
            return new ContainerObjectNestedImpl(item);
    }

    public A withTypedLocalObjectReference(TypedLocalObjectReference typedLocalObjectReference){
            _visitables.remove(this.object);
            if (typedLocalObjectReference!=null){ this.object= new TypedLocalObjectReferenceBuilder(typedLocalObjectReference); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TypedLocalObjectReferenceNested<A> withNewTypedLocalObjectReference(){
            return new TypedLocalObjectReferenceNestedImpl();
    }

    public WatchEventFluent.TypedLocalObjectReferenceNested<A> withNewTypedLocalObjectReferenceLike(TypedLocalObjectReference item){
            return new TypedLocalObjectReferenceNestedImpl(item);
    }

    public A withNewTypedLocalObjectReference(String apiGroup,String kind,String name){
            return (A)withTypedLocalObjectReference(new TypedLocalObjectReference(apiGroup, kind, name));
    }

    public A withSupplementalGroupsStrategyOptionsObject(SupplementalGroupsStrategyOptions supplementalGroupsStrategyOptionsObject){
            _visitables.remove(this.object);
            if (supplementalGroupsStrategyOptionsObject!=null){ this.object= new SupplementalGroupsStrategyOptionsBuilder(supplementalGroupsStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<A> withNewSupplementalGroupsStrategyOptionsObject(){
            return new SupplementalGroupsStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<A> withNewSupplementalGroupsStrategyOptionsObjectLike(SupplementalGroupsStrategyOptions item){
            return new SupplementalGroupsStrategyOptionsObjectNestedImpl(item);
    }

    public A withCronJobListObject(CronJobList cronJobListObject){
            _visitables.remove(this.object);
            if (cronJobListObject!=null){ this.object= new CronJobListBuilder(cronJobListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CronJobListObjectNested<A> withNewCronJobListObject(){
            return new CronJobListObjectNestedImpl();
    }

    public WatchEventFluent.CronJobListObjectNested<A> withNewCronJobListObjectLike(CronJobList item){
            return new CronJobListObjectNestedImpl(item);
    }

    public A withRollbackConfigObject(RollbackConfig rollbackConfigObject){
            _visitables.remove(this.object);
            if (rollbackConfigObject!=null){ this.object= new RollbackConfigBuilder(rollbackConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RollbackConfigObjectNested<A> withNewRollbackConfigObject(){
            return new RollbackConfigObjectNestedImpl();
    }

    public WatchEventFluent.RollbackConfigObjectNested<A> withNewRollbackConfigObjectLike(RollbackConfig item){
            return new RollbackConfigObjectNestedImpl(item);
    }

    public A withNewRollbackConfigObject(Long revision){
            return (A)withRollbackConfigObject(new RollbackConfig(revision));
    }

    public A withRouteStatusObject(RouteStatus routeStatusObject){
            _visitables.remove(this.object);
            if (routeStatusObject!=null){ this.object= new RouteStatusBuilder(routeStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteStatusObjectNested<A> withNewRouteStatusObject(){
            return new RouteStatusObjectNestedImpl();
    }

    public WatchEventFluent.RouteStatusObjectNested<A> withNewRouteStatusObjectLike(RouteStatus item){
            return new RouteStatusObjectNestedImpl(item);
    }

    public A withPodConditionObject(PodCondition podConditionObject){
            _visitables.remove(this.object);
            if (podConditionObject!=null){ this.object= new PodConditionBuilder(podConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodConditionObjectNested<A> withNewPodConditionObject(){
            return new PodConditionObjectNestedImpl();
    }

    public WatchEventFluent.PodConditionObjectNested<A> withNewPodConditionObjectLike(PodCondition item){
            return new PodConditionObjectNestedImpl(item);
    }

    public A withDaemonSetConditionObject(DaemonSetCondition daemonSetConditionObject){
            _visitables.remove(this.object);
            if (daemonSetConditionObject!=null){ this.object= new DaemonSetConditionBuilder(daemonSetConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonSetConditionObjectNested<A> withNewDaemonSetConditionObject(){
            return new DaemonSetConditionObjectNestedImpl();
    }

    public WatchEventFluent.DaemonSetConditionObjectNested<A> withNewDaemonSetConditionObjectLike(DaemonSetCondition item){
            return new DaemonSetConditionObjectNestedImpl(item);
    }

    public A withNewDaemonSetConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withDaemonSetConditionObject(new DaemonSetCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withDeploymentRollbackObject(DeploymentRollback deploymentRollbackObject){
            _visitables.remove(this.object);
            if (deploymentRollbackObject!=null){ this.object= new DeploymentRollbackBuilder(deploymentRollbackObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentRollbackObjectNested<A> withNewDeploymentRollbackObject(){
            return new DeploymentRollbackObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentRollbackObjectNested<A> withNewDeploymentRollbackObjectLike(DeploymentRollback item){
            return new DeploymentRollbackObjectNestedImpl(item);
    }

    public A withExecActionObject(ExecAction execActionObject){
            _visitables.remove(this.object);
            if (execActionObject!=null){ this.object= new ExecActionBuilder(execActionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExecActionObjectNested<A> withNewExecActionObject(){
            return new ExecActionObjectNestedImpl();
    }

    public WatchEventFluent.ExecActionObjectNested<A> withNewExecActionObjectLike(ExecAction item){
            return new ExecActionObjectNestedImpl(item);
    }

    public A withNamedTagEventListObject(NamedTagEventList namedTagEventListObject){
            _visitables.remove(this.object);
            if (namedTagEventListObject!=null){ this.object= new NamedTagEventListBuilder(namedTagEventListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamedTagEventListObjectNested<A> withNewNamedTagEventListObject(){
            return new NamedTagEventListObjectNestedImpl();
    }

    public WatchEventFluent.NamedTagEventListObjectNested<A> withNewNamedTagEventListObjectLike(NamedTagEventList item){
            return new NamedTagEventListObjectNestedImpl(item);
    }

    public A withTolerationObject(Toleration tolerationObject){
            _visitables.remove(this.object);
            if (tolerationObject!=null){ this.object= new TolerationBuilder(tolerationObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TolerationObjectNested<A> withNewTolerationObject(){
            return new TolerationObjectNestedImpl();
    }

    public WatchEventFluent.TolerationObjectNested<A> withNewTolerationObjectLike(Toleration item){
            return new TolerationObjectNestedImpl(item);
    }

    public A withNewTolerationObject(String effect,String key,String operator,Long tolerationSeconds,String value){
            return (A)withTolerationObject(new Toleration(effect, key, operator, tolerationSeconds, value));
    }

    public A withNodeSelectorObject(NodeSelector nodeSelectorObject){
            _visitables.remove(this.object);
            if (nodeSelectorObject!=null){ this.object= new NodeSelectorBuilder(nodeSelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeSelectorObjectNested<A> withNewNodeSelectorObject(){
            return new NodeSelectorObjectNestedImpl();
    }

    public WatchEventFluent.NodeSelectorObjectNested<A> withNewNodeSelectorObjectLike(NodeSelector item){
            return new NodeSelectorObjectNestedImpl(item);
    }

    public A withWebhookObject(Webhook webhookObject){
            _visitables.remove(this.object);
            if (webhookObject!=null){ this.object= new WebhookBuilder(webhookObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.WebhookObjectNested<A> withNewWebhookObject(){
            return new WebhookObjectNestedImpl();
    }

    public WatchEventFluent.WebhookObjectNested<A> withNewWebhookObjectLike(Webhook item){
            return new WebhookObjectNestedImpl(item);
    }

    public A withRouteSpecObject(RouteSpec routeSpecObject){
            _visitables.remove(this.object);
            if (routeSpecObject!=null){ this.object= new RouteSpecBuilder(routeSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteSpecObjectNested<A> withNewRouteSpecObject(){
            return new RouteSpecObjectNestedImpl();
    }

    public WatchEventFluent.RouteSpecObjectNested<A> withNewRouteSpecObjectLike(RouteSpec item){
            return new RouteSpecObjectNestedImpl(item);
    }

    public A withCephFSPersistentVolumeSourceObject(CephFSPersistentVolumeSource cephFSPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (cephFSPersistentVolumeSourceObject!=null){ this.object= new CephFSPersistentVolumeSourceBuilder(cephFSPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<A> withNewCephFSPersistentVolumeSourceObject(){
            return new CephFSPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<A> withNewCephFSPersistentVolumeSourceObjectLike(CephFSPersistentVolumeSource item){
            return new CephFSPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withPersistentVolumeClaimConditionObject(PersistentVolumeClaimCondition persistentVolumeClaimConditionObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimConditionObject!=null){ this.object= new PersistentVolumeClaimConditionBuilder(persistentVolumeClaimConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeClaimConditionObjectNested<A> withNewPersistentVolumeClaimConditionObject(){
            return new PersistentVolumeClaimConditionObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeClaimConditionObjectNested<A> withNewPersistentVolumeClaimConditionObjectLike(PersistentVolumeClaimCondition item){
            return new PersistentVolumeClaimConditionObjectNestedImpl(item);
    }

    public A withPersistentVolumeListObject(PersistentVolumeList persistentVolumeListObject){
            _visitables.remove(this.object);
            if (persistentVolumeListObject!=null){ this.object= new PersistentVolumeListBuilder(persistentVolumeListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeListObjectNested<A> withNewPersistentVolumeListObject(){
            return new PersistentVolumeListObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeListObjectNested<A> withNewPersistentVolumeListObjectLike(PersistentVolumeList item){
            return new PersistentVolumeListObjectNestedImpl(item);
    }

    public A withProjectRequestObject(ProjectRequest projectRequestObject){
            _visitables.remove(this.object);
            if (projectRequestObject!=null){ this.object= new ProjectRequestBuilder(projectRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ProjectRequestObjectNested<A> withNewProjectRequestObject(){
            return new ProjectRequestObjectNestedImpl();
    }

    public WatchEventFluent.ProjectRequestObjectNested<A> withNewProjectRequestObjectLike(ProjectRequest item){
            return new ProjectRequestObjectNestedImpl(item);
    }

    public A withPriorityClassObject(PriorityClass priorityClassObject){
            _visitables.remove(this.object);
            if (priorityClassObject!=null){ this.object= new PriorityClassBuilder(priorityClassObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PriorityClassObjectNested<A> withNewPriorityClassObject(){
            return new PriorityClassObjectNestedImpl();
    }

    public WatchEventFluent.PriorityClassObjectNested<A> withNewPriorityClassObjectLike(PriorityClass item){
            return new PriorityClassObjectNestedImpl(item);
    }

    public A withTemplateObject(Template templateObject){
            _visitables.remove(this.object);
            if (templateObject!=null){ this.object= new TemplateBuilder(templateObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TemplateObjectNested<A> withNewTemplateObject(){
            return new TemplateObjectNestedImpl();
    }

    public WatchEventFluent.TemplateObjectNested<A> withNewTemplateObjectLike(Template item){
            return new TemplateObjectNestedImpl(item);
    }

    public A withPodDNSConfigOptionObject(PodDNSConfigOption podDNSConfigOptionObject){
            _visitables.remove(this.object);
            if (podDNSConfigOptionObject!=null){ this.object= new PodDNSConfigOptionBuilder(podDNSConfigOptionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodDNSConfigOptionObjectNested<A> withNewPodDNSConfigOptionObject(){
            return new PodDNSConfigOptionObjectNestedImpl();
    }

    public WatchEventFluent.PodDNSConfigOptionObjectNested<A> withNewPodDNSConfigOptionObjectLike(PodDNSConfigOption item){
            return new PodDNSConfigOptionObjectNestedImpl(item);
    }

    public A withNewPodDNSConfigOptionObject(String name,String value){
            return (A)withPodDNSConfigOptionObject(new PodDNSConfigOption(name, value));
    }

    public A withGCEPersistentDiskVolumeSourceObject(GCEPersistentDiskVolumeSource gCEPersistentDiskVolumeSourceObject){
            _visitables.remove(this.object);
            if (gCEPersistentDiskVolumeSourceObject!=null){ this.object= new GCEPersistentDiskVolumeSourceBuilder(gCEPersistentDiskVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<A> withNewGCEPersistentDiskVolumeSourceObject(){
            return new GCEPersistentDiskVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<A> withNewGCEPersistentDiskVolumeSourceObjectLike(GCEPersistentDiskVolumeSource item){
            return new GCEPersistentDiskVolumeSourceObjectNestedImpl(item);
    }

    public A withNewGCEPersistentDiskVolumeSourceObject(String fsType,Integer partition,String pdName,Boolean readOnly){
            return (A)withGCEPersistentDiskVolumeSourceObject(new GCEPersistentDiskVolumeSource(fsType, partition, pdName, readOnly));
    }

    public A withOAuthClientAuthorizationObject(OAuthClientAuthorization oAuthClientAuthorizationObject){
            _visitables.remove(this.object);
            if (oAuthClientAuthorizationObject!=null){ this.object= new OAuthClientAuthorizationBuilder(oAuthClientAuthorizationObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObject(){
            return new OAuthClientAuthorizationObjectNestedImpl();
    }

    public WatchEventFluent.OAuthClientAuthorizationObjectNested<A> withNewOAuthClientAuthorizationObjectLike(OAuthClientAuthorization item){
            return new OAuthClientAuthorizationObjectNestedImpl(item);
    }

    public A withNetworkPolicyIngressRuleObject(NetworkPolicyIngressRule networkPolicyIngressRuleObject){
            _visitables.remove(this.object);
            if (networkPolicyIngressRuleObject!=null){ this.object= new NetworkPolicyIngressRuleBuilder(networkPolicyIngressRuleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicyIngressRuleObjectNested<A> withNewNetworkPolicyIngressRuleObject(){
            return new NetworkPolicyIngressRuleObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicyIngressRuleObjectNested<A> withNewNetworkPolicyIngressRuleObjectLike(NetworkPolicyIngressRule item){
            return new NetworkPolicyIngressRuleObjectNestedImpl(item);
    }

    public A withJobTemplateSpecObject(JobTemplateSpec jobTemplateSpecObject){
            _visitables.remove(this.object);
            if (jobTemplateSpecObject!=null){ this.object= new JobTemplateSpecBuilder(jobTemplateSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JobTemplateSpecObjectNested<A> withNewJobTemplateSpecObject(){
            return new JobTemplateSpecObjectNestedImpl();
    }

    public WatchEventFluent.JobTemplateSpecObjectNested<A> withNewJobTemplateSpecObjectLike(JobTemplateSpec item){
            return new JobTemplateSpecObjectNestedImpl(item);
    }

    public A withImageChangeCauseObject(ImageChangeCause imageChangeCauseObject){
            _visitables.remove(this.object);
            if (imageChangeCauseObject!=null){ this.object= new ImageChangeCauseBuilder(imageChangeCauseObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageChangeCauseObjectNested<A> withNewImageChangeCauseObject(){
            return new ImageChangeCauseObjectNestedImpl();
    }

    public WatchEventFluent.ImageChangeCauseObjectNested<A> withNewImageChangeCauseObjectLike(ImageChangeCause item){
            return new ImageChangeCauseObjectNestedImpl(item);
    }

    public A withEventListObject(EventList eventListObject){
            _visitables.remove(this.object);
            if (eventListObject!=null){ this.object= new EventListBuilder(eventListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EventListObjectNested<A> withNewEventListObject(){
            return new EventListObjectNestedImpl();
    }

    public WatchEventFluent.EventListObjectNested<A> withNewEventListObjectLike(EventList item){
            return new EventListObjectNestedImpl(item);
    }

    public A withPodReadinessGateObject(PodReadinessGate podReadinessGateObject){
            _visitables.remove(this.object);
            if (podReadinessGateObject!=null){ this.object= new PodReadinessGateBuilder(podReadinessGateObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodReadinessGateObjectNested<A> withNewPodReadinessGateObject(){
            return new PodReadinessGateObjectNestedImpl();
    }

    public WatchEventFluent.PodReadinessGateObjectNested<A> withNewPodReadinessGateObjectLike(PodReadinessGate item){
            return new PodReadinessGateObjectNestedImpl(item);
    }

    public A withNewPodReadinessGateObject(String conditionType){
            return (A)withPodReadinessGateObject(new PodReadinessGate(conditionType));
    }

    public A withDeploymentObject(Deployment deploymentObject){
            _visitables.remove(this.object);
            if (deploymentObject!=null){ this.object= new DeploymentBuilder(deploymentObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentObjectNested<A> withNewDeploymentObject(){
            return new DeploymentObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentObjectNested<A> withNewDeploymentObjectLike(Deployment item){
            return new DeploymentObjectNestedImpl(item);
    }

    public A withContainerStateWaitingObject(ContainerStateWaiting containerStateWaitingObject){
            _visitables.remove(this.object);
            if (containerStateWaitingObject!=null){ this.object= new ContainerStateWaitingBuilder(containerStateWaitingObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerStateWaitingObjectNested<A> withNewContainerStateWaitingObject(){
            return new ContainerStateWaitingObjectNestedImpl();
    }

    public WatchEventFluent.ContainerStateWaitingObjectNested<A> withNewContainerStateWaitingObjectLike(ContainerStateWaiting item){
            return new ContainerStateWaitingObjectNestedImpl(item);
    }

    public A withNewContainerStateWaitingObject(String message,String reason){
            return (A)withContainerStateWaitingObject(new ContainerStateWaiting(message, reason));
    }

    public A withTagEventConditionObject(TagEventCondition tagEventConditionObject){
            _visitables.remove(this.object);
            if (tagEventConditionObject!=null){ this.object= new TagEventConditionBuilder(tagEventConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TagEventConditionObjectNested<A> withNewTagEventConditionObject(){
            return new TagEventConditionObjectNestedImpl();
    }

    public WatchEventFluent.TagEventConditionObjectNested<A> withNewTagEventConditionObjectLike(TagEventCondition item){
            return new TagEventConditionObjectNestedImpl(item);
    }

    public A withOpenshiftRoleListObject(OpenshiftRoleList openshiftRoleListObject){
            _visitables.remove(this.object);
            if (openshiftRoleListObject!=null){ this.object= new OpenshiftRoleListBuilder(openshiftRoleListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftRoleListObjectNested<A> withNewOpenshiftRoleListObject(){
            return new OpenshiftRoleListObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftRoleListObjectNested<A> withNewOpenshiftRoleListObjectLike(OpenshiftRoleList item){
            return new OpenshiftRoleListObjectNestedImpl(item);
    }

    public A withNetNamespaceListObject(NetNamespaceList netNamespaceListObject){
            _visitables.remove(this.object);
            if (netNamespaceListObject!=null){ this.object= new NetNamespaceListBuilder(netNamespaceListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetNamespaceListObjectNested<A> withNewNetNamespaceListObject(){
            return new NetNamespaceListObjectNestedImpl();
    }

    public WatchEventFluent.NetNamespaceListObjectNested<A> withNewNetNamespaceListObjectLike(NetNamespaceList item){
            return new NetNamespaceListObjectNestedImpl(item);
    }

    public A withBinaryBuildSourceObject(BinaryBuildSource binaryBuildSourceObject){
            _visitables.remove(this.object);
            if (binaryBuildSourceObject!=null){ this.object= new BinaryBuildSourceBuilder(binaryBuildSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BinaryBuildSourceObjectNested<A> withNewBinaryBuildSourceObject(){
            return new BinaryBuildSourceObjectNestedImpl();
    }

    public WatchEventFluent.BinaryBuildSourceObjectNested<A> withNewBinaryBuildSourceObjectLike(BinaryBuildSource item){
            return new BinaryBuildSourceObjectNestedImpl(item);
    }

    public A withNewBinaryBuildSourceObject(String asFile){
            return (A)withBinaryBuildSourceObject(new BinaryBuildSource(asFile));
    }

    public A withOAuthClientAuthorizationListObject(OAuthClientAuthorizationList oAuthClientAuthorizationListObject){
            _visitables.remove(this.object);
            if (oAuthClientAuthorizationListObject!=null){ this.object= new OAuthClientAuthorizationListBuilder(oAuthClientAuthorizationListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthClientAuthorizationListObjectNested<A> withNewOAuthClientAuthorizationListObject(){
            return new OAuthClientAuthorizationListObjectNestedImpl();
    }

    public WatchEventFluent.OAuthClientAuthorizationListObjectNested<A> withNewOAuthClientAuthorizationListObjectLike(OAuthClientAuthorizationList item){
            return new OAuthClientAuthorizationListObjectNestedImpl(item);
    }

    public A withIngressSpecObject(IngressSpec ingressSpecObject){
            _visitables.remove(this.object);
            if (ingressSpecObject!=null){ this.object= new IngressSpecBuilder(ingressSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressSpecObjectNested<A> withNewIngressSpecObject(){
            return new IngressSpecObjectNestedImpl();
    }

    public WatchEventFluent.IngressSpecObjectNested<A> withNewIngressSpecObjectLike(IngressSpec item){
            return new IngressSpecObjectNestedImpl(item);
    }

    public A withLocalSubjectAccessReviewObject(io.fabric8.openshift.api.model.LocalSubjectAccessReview localSubjectAccessReviewObject){
            _visitables.remove(this.object);
            if (localSubjectAccessReviewObject!=null){ this.object= new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder(localSubjectAccessReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<A> withNewModelLocalSubjectAccessReviewObject(){
            return new ModelLocalSubjectAccessReviewObjectNestedImpl();
    }

    public WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<A> withNewLocalSubjectAccessReviewObjectLike(io.fabric8.openshift.api.model.LocalSubjectAccessReview item){
            return new ModelLocalSubjectAccessReviewObjectNestedImpl(item);
    }

    public A withAdmissionReviewObject(AdmissionReview admissionReviewObject){
            _visitables.remove(this.object);
            if (admissionReviewObject!=null){ this.object= new AdmissionReviewBuilder(admissionReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AdmissionReviewObjectNested<A> withNewAdmissionReviewObject(){
            return new AdmissionReviewObjectNestedImpl();
    }

    public WatchEventFluent.AdmissionReviewObjectNested<A> withNewAdmissionReviewObjectLike(AdmissionReview item){
            return new AdmissionReviewObjectNestedImpl(item);
    }

    public A withRollingDeploymentStrategyParamsObject(RollingDeploymentStrategyParams rollingDeploymentStrategyParamsObject){
            _visitables.remove(this.object);
            if (rollingDeploymentStrategyParamsObject!=null){ this.object= new RollingDeploymentStrategyParamsBuilder(rollingDeploymentStrategyParamsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<A> withNewRollingDeploymentStrategyParamsObject(){
            return new RollingDeploymentStrategyParamsObjectNestedImpl();
    }

    public WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<A> withNewRollingDeploymentStrategyParamsObjectLike(RollingDeploymentStrategyParams item){
            return new RollingDeploymentStrategyParamsObjectNestedImpl(item);
    }

    public A withDownwardAPIVolumeFileObject(DownwardAPIVolumeFile downwardAPIVolumeFileObject){
            _visitables.remove(this.object);
            if (downwardAPIVolumeFileObject!=null){ this.object= new DownwardAPIVolumeFileBuilder(downwardAPIVolumeFileObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DownwardAPIVolumeFileObjectNested<A> withNewDownwardAPIVolumeFileObject(){
            return new DownwardAPIVolumeFileObjectNestedImpl();
    }

    public WatchEventFluent.DownwardAPIVolumeFileObjectNested<A> withNewDownwardAPIVolumeFileObjectLike(DownwardAPIVolumeFile item){
            return new DownwardAPIVolumeFileObjectNestedImpl(item);
    }

    public A withImageLabelObject(ImageLabel imageLabelObject){
            _visitables.remove(this.object);
            if (imageLabelObject!=null){ this.object= new ImageLabelBuilder(imageLabelObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageLabelObjectNested<A> withNewImageLabelObject(){
            return new ImageLabelObjectNestedImpl();
    }

    public WatchEventFluent.ImageLabelObjectNested<A> withNewImageLabelObjectLike(ImageLabel item){
            return new ImageLabelObjectNestedImpl(item);
    }

    public A withNewImageLabelObject(String name,String value){
            return (A)withImageLabelObject(new ImageLabel(name, value));
    }

    public A withPodTemplateObject(PodTemplate podTemplateObject){
            _visitables.remove(this.object);
            if (podTemplateObject!=null){ this.object= new PodTemplateBuilder(podTemplateObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodTemplateObjectNested<A> withNewPodTemplateObject(){
            return new PodTemplateObjectNestedImpl();
    }

    public WatchEventFluent.PodTemplateObjectNested<A> withNewPodTemplateObjectLike(PodTemplate item){
            return new PodTemplateObjectNestedImpl(item);
    }

    public A withTCPSocketActionObject(TCPSocketAction tCPSocketActionObject){
            _visitables.remove(this.object);
            if (tCPSocketActionObject!=null){ this.object= new TCPSocketActionBuilder(tCPSocketActionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TCPSocketActionObjectNested<A> withNewTCPSocketActionObject(){
            return new TCPSocketActionObjectNestedImpl();
    }

    public WatchEventFluent.TCPSocketActionObjectNested<A> withNewTCPSocketActionObjectLike(TCPSocketAction item){
            return new TCPSocketActionObjectNestedImpl(item);
    }

    public A withDaemonSetListObject(DaemonSetList daemonSetListObject){
            _visitables.remove(this.object);
            if (daemonSetListObject!=null){ this.object= new DaemonSetListBuilder(daemonSetListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonSetListObjectNested<A> withNewDaemonSetListObject(){
            return new DaemonSetListObjectNestedImpl();
    }

    public WatchEventFluent.DaemonSetListObjectNested<A> withNewDaemonSetListObjectLike(DaemonSetList item){
            return new DaemonSetListObjectNestedImpl(item);
    }

    public A withEventObject(Event eventObject){
            _visitables.remove(this.object);
            if (eventObject!=null){ this.object= new EventBuilder(eventObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EventObjectNested<A> withNewEventObject(){
            return new EventObjectNestedImpl();
    }

    public WatchEventFluent.EventObjectNested<A> withNewEventObjectLike(Event item){
            return new EventObjectNestedImpl(item);
    }

    public A withPreferencesObject(Preferences preferencesObject){
            _visitables.remove(this.object);
            if (preferencesObject!=null){ this.object= new PreferencesBuilder(preferencesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PreferencesObjectNested<A> withNewPreferencesObject(){
            return new PreferencesObjectNestedImpl();
    }

    public WatchEventFluent.PreferencesObjectNested<A> withNewPreferencesObjectLike(Preferences item){
            return new PreferencesObjectNestedImpl(item);
    }

    public A withIngressObject(Ingress ingressObject){
            _visitables.remove(this.object);
            if (ingressObject!=null){ this.object= new IngressBuilder(ingressObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.IngressObjectNested<A> withNewIngressObject(){
            return new IngressObjectNestedImpl();
    }

    public WatchEventFluent.IngressObjectNested<A> withNewIngressObjectLike(Ingress item){
            return new IngressObjectNestedImpl(item);
    }

    public A withDeploymentConfigObject(DeploymentConfig deploymentConfigObject){
            _visitables.remove(this.object);
            if (deploymentConfigObject!=null){ this.object= new DeploymentConfigBuilder(deploymentConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObject(){
            return new DeploymentConfigObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentConfigObjectNested<A> withNewDeploymentConfigObjectLike(DeploymentConfig item){
            return new DeploymentConfigObjectNestedImpl(item);
    }

    public A withObjectFieldSelectorObject(ObjectFieldSelector objectFieldSelectorObject){
            _visitables.remove(this.object);
            if (objectFieldSelectorObject!=null){ this.object= new ObjectFieldSelectorBuilder(objectFieldSelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ObjectFieldSelectorObjectNested<A> withNewObjectFieldSelectorObject(){
            return new ObjectFieldSelectorObjectNestedImpl();
    }

    public WatchEventFluent.ObjectFieldSelectorObjectNested<A> withNewObjectFieldSelectorObjectLike(ObjectFieldSelector item){
            return new ObjectFieldSelectorObjectNestedImpl(item);
    }

    public A withNewObjectFieldSelectorObject(String apiVersion,String fieldPath){
            return (A)withObjectFieldSelectorObject(new ObjectFieldSelector(apiVersion, fieldPath));
    }

    public A withOAuthAccessTokenObject(OAuthAccessToken oAuthAccessTokenObject){
            _visitables.remove(this.object);
            if (oAuthAccessTokenObject!=null){ this.object= new OAuthAccessTokenBuilder(oAuthAccessTokenObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObject(){
            return new OAuthAccessTokenObjectNestedImpl();
    }

    public WatchEventFluent.OAuthAccessTokenObjectNested<A> withNewOAuthAccessTokenObjectLike(OAuthAccessToken item){
            return new OAuthAccessTokenObjectNestedImpl(item);
    }

    public A withPersistentVolumeObject(PersistentVolume persistentVolumeObject){
            _visitables.remove(this.object);
            if (persistentVolumeObject!=null){ this.object= new PersistentVolumeBuilder(persistentVolumeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObject(){
            return new PersistentVolumeObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeObjectNested<A> withNewPersistentVolumeObjectLike(PersistentVolume item){
            return new PersistentVolumeObjectNestedImpl(item);
    }

    public A withCinderVolumeSourceObject(CinderVolumeSource cinderVolumeSourceObject){
            _visitables.remove(this.object);
            if (cinderVolumeSourceObject!=null){ this.object= new CinderVolumeSourceBuilder(cinderVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CinderVolumeSourceObjectNested<A> withNewCinderVolumeSourceObject(){
            return new CinderVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.CinderVolumeSourceObjectNested<A> withNewCinderVolumeSourceObjectLike(CinderVolumeSource item){
            return new CinderVolumeSourceObjectNestedImpl(item);
    }

    public A withObjectMetaObject(ObjectMeta objectMetaObject){
            _visitables.remove(this.object);
            if (objectMetaObject!=null){ this.object= new ObjectMetaBuilder(objectMetaObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ObjectMetaObjectNested<A> withNewObjectMetaObject(){
            return new ObjectMetaObjectNestedImpl();
    }

    public WatchEventFluent.ObjectMetaObjectNested<A> withNewObjectMetaObjectLike(ObjectMeta item){
            return new ObjectMetaObjectNestedImpl(item);
    }

    public A withPersistentVolumeClaimObject(PersistentVolumeClaim persistentVolumeClaimObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimObject!=null){ this.object= new PersistentVolumeClaimBuilder(persistentVolumeClaimObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObject(){
            return new PersistentVolumeClaimObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeClaimObjectNested<A> withNewPersistentVolumeClaimObjectLike(PersistentVolumeClaim item){
            return new PersistentVolumeClaimObjectNestedImpl(item);
    }

    public A withJSONSchemaPropsObject(JSONSchemaProps jSONSchemaPropsObject){
            _visitables.remove(this.object);
            if (jSONSchemaPropsObject!=null){ this.object= new JSONSchemaPropsBuilder(jSONSchemaPropsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JSONSchemaPropsObjectNested<A> withNewJSONSchemaPropsObject(){
            return new JSONSchemaPropsObjectNestedImpl();
    }

    public WatchEventFluent.JSONSchemaPropsObjectNested<A> withNewJSONSchemaPropsObjectLike(JSONSchemaProps item){
            return new JSONSchemaPropsObjectNestedImpl(item);
    }

    public A withDeploymentConditionObject(io.fabric8.openshift.api.model.DeploymentCondition deploymentConditionObject){
            _visitables.remove(this.object);
            if (deploymentConditionObject!=null){ this.object= new io.fabric8.openshift.api.model.DeploymentConditionBuilder(deploymentConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelDeploymentConditionObjectNested<A> withNewModelDeploymentConditionObject(){
            return new ModelDeploymentConditionObjectNestedImpl();
    }

    public WatchEventFluent.ModelDeploymentConditionObjectNested<A> withNewDeploymentConditionObjectLike(io.fabric8.openshift.api.model.DeploymentCondition item){
            return new ModelDeploymentConditionObjectNestedImpl(item);
    }

    public A withDeploymentCauseImageTriggerObject(DeploymentCauseImageTrigger deploymentCauseImageTriggerObject){
            _visitables.remove(this.object);
            if (deploymentCauseImageTriggerObject!=null){ this.object= new DeploymentCauseImageTriggerBuilder(deploymentCauseImageTriggerObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentCauseImageTriggerObjectNested<A> withNewDeploymentCauseImageTriggerObject(){
            return new DeploymentCauseImageTriggerObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentCauseImageTriggerObjectNested<A> withNewDeploymentCauseImageTriggerObjectLike(DeploymentCauseImageTrigger item){
            return new DeploymentCauseImageTriggerObjectNestedImpl(item);
    }

    public A withNetworkPolicyPortObject(NetworkPolicyPort networkPolicyPortObject){
            _visitables.remove(this.object);
            if (networkPolicyPortObject!=null){ this.object= new NetworkPolicyPortBuilder(networkPolicyPortObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicyPortObjectNested<A> withNewNetworkPolicyPortObject(){
            return new NetworkPolicyPortObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicyPortObjectNested<A> withNewNetworkPolicyPortObjectLike(NetworkPolicyPort item){
            return new NetworkPolicyPortObjectNestedImpl(item);
    }

    public A withOwnerReferenceObject(OwnerReference ownerReferenceObject){
            _visitables.remove(this.object);
            if (ownerReferenceObject!=null){ this.object= new OwnerReferenceBuilder(ownerReferenceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OwnerReferenceObjectNested<A> withNewOwnerReferenceObject(){
            return new OwnerReferenceObjectNestedImpl();
    }

    public WatchEventFluent.OwnerReferenceObjectNested<A> withNewOwnerReferenceObjectLike(OwnerReference item){
            return new OwnerReferenceObjectNestedImpl(item);
    }

    public A withCinderPersistentVolumeSourceObject(CinderPersistentVolumeSource cinderPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (cinderPersistentVolumeSourceObject!=null){ this.object= new CinderPersistentVolumeSourceBuilder(cinderPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CinderPersistentVolumeSourceObjectNested<A> withNewCinderPersistentVolumeSourceObject(){
            return new CinderPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.CinderPersistentVolumeSourceObjectNested<A> withNewCinderPersistentVolumeSourceObjectLike(CinderPersistentVolumeSource item){
            return new CinderPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withReplicationControllerConditionObject(ReplicationControllerCondition replicationControllerConditionObject){
            _visitables.remove(this.object);
            if (replicationControllerConditionObject!=null){ this.object= new ReplicationControllerConditionBuilder(replicationControllerConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicationControllerConditionObjectNested<A> withNewReplicationControllerConditionObject(){
            return new ReplicationControllerConditionObjectNestedImpl();
    }

    public WatchEventFluent.ReplicationControllerConditionObjectNested<A> withNewReplicationControllerConditionObjectLike(ReplicationControllerCondition item){
            return new ReplicationControllerConditionObjectNestedImpl(item);
    }

    public A withNewReplicationControllerConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withReplicationControllerConditionObject(new ReplicationControllerCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withPodAntiAffinityObject(PodAntiAffinity podAntiAffinityObject){
            _visitables.remove(this.object);
            if (podAntiAffinityObject!=null){ this.object= new PodAntiAffinityBuilder(podAntiAffinityObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodAntiAffinityObjectNested<A> withNewPodAntiAffinityObject(){
            return new PodAntiAffinityObjectNestedImpl();
    }

    public WatchEventFluent.PodAntiAffinityObjectNested<A> withNewPodAntiAffinityObjectLike(PodAntiAffinity item){
            return new PodAntiAffinityObjectNestedImpl(item);
    }

    public A withPodDisruptionBudgetSpecObject(PodDisruptionBudgetSpec podDisruptionBudgetSpecObject){
            _visitables.remove(this.object);
            if (podDisruptionBudgetSpecObject!=null){ this.object= new PodDisruptionBudgetSpecBuilder(podDisruptionBudgetSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodDisruptionBudgetSpecObjectNested<A> withNewPodDisruptionBudgetSpecObject(){
            return new PodDisruptionBudgetSpecObjectNestedImpl();
    }

    public WatchEventFluent.PodDisruptionBudgetSpecObjectNested<A> withNewPodDisruptionBudgetSpecObjectLike(PodDisruptionBudgetSpec item){
            return new PodDisruptionBudgetSpecObjectNestedImpl(item);
    }

    public A withMetricSpecObject(MetricSpec metricSpecObject){
            _visitables.remove(this.object);
            if (metricSpecObject!=null){ this.object= new MetricSpecBuilder(metricSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.MetricSpecObjectNested<A> withNewMetricSpecObject(){
            return new MetricSpecObjectNestedImpl();
    }

    public WatchEventFluent.MetricSpecObjectNested<A> withNewMetricSpecObjectLike(MetricSpec item){
            return new MetricSpecObjectNestedImpl(item);
    }

    public A withReplicationControllerListObject(ReplicationControllerList replicationControllerListObject){
            _visitables.remove(this.object);
            if (replicationControllerListObject!=null){ this.object= new ReplicationControllerListBuilder(replicationControllerListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicationControllerListObjectNested<A> withNewReplicationControllerListObject(){
            return new ReplicationControllerListObjectNestedImpl();
    }

    public WatchEventFluent.ReplicationControllerListObjectNested<A> withNewReplicationControllerListObjectLike(ReplicationControllerList item){
            return new ReplicationControllerListObjectNestedImpl(item);
    }

    public A withEventObject(io.fabric8.kubernetes.api.model.events.Event eventObject){
            _visitables.remove(this.object);
            if (eventObject!=null){ this.object= new io.fabric8.kubernetes.api.model.events.EventBuilder(eventObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EventsEventObjectNested<A> withNewEventsEventObject(){
            return new EventsEventObjectNestedImpl();
    }

    public WatchEventFluent.EventsEventObjectNested<A> withNewEventObjectLike(io.fabric8.kubernetes.api.model.events.Event item){
            return new EventsEventObjectNestedImpl(item);
    }

    public A withContainerStateRunningObject(ContainerStateRunning containerStateRunningObject){
            _visitables.remove(this.object);
            if (containerStateRunningObject!=null){ this.object= new ContainerStateRunningBuilder(containerStateRunningObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerStateRunningObjectNested<A> withNewContainerStateRunningObject(){
            return new ContainerStateRunningObjectNestedImpl();
    }

    public WatchEventFluent.ContainerStateRunningObjectNested<A> withNewContainerStateRunningObjectLike(ContainerStateRunning item){
            return new ContainerStateRunningObjectNestedImpl(item);
    }

    public A withNewContainerStateRunningObject(String startedAt){
            return (A)withContainerStateRunningObject(new ContainerStateRunning(startedAt));
    }

    public A withHorizontalPodAutoscalerStatusObject(HorizontalPodAutoscalerStatus horizontalPodAutoscalerStatusObject){
            _visitables.remove(this.object);
            if (horizontalPodAutoscalerStatusObject!=null){ this.object= new HorizontalPodAutoscalerStatusBuilder(horizontalPodAutoscalerStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<A> withNewHorizontalPodAutoscalerStatusObject(){
            return new HorizontalPodAutoscalerStatusObjectNestedImpl();
    }

    public WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<A> withNewHorizontalPodAutoscalerStatusObjectLike(HorizontalPodAutoscalerStatus item){
            return new HorizontalPodAutoscalerStatusObjectNestedImpl(item);
    }

    public A withJSONSchemaPropsOrArrayObject(JSONSchemaPropsOrArray jSONSchemaPropsOrArrayObject){
            _visitables.remove(this.object);
            if (jSONSchemaPropsOrArrayObject!=null){ this.object= new JSONSchemaPropsOrArrayBuilder(jSONSchemaPropsOrArrayObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<A> withNewJSONSchemaPropsOrArrayObject(){
            return new JSONSchemaPropsOrArrayObjectNestedImpl();
    }

    public WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<A> withNewJSONSchemaPropsOrArrayObjectLike(JSONSchemaPropsOrArray item){
            return new JSONSchemaPropsOrArrayObjectNestedImpl(item);
    }

    public A withHTTPIngressPathObject(HTTPIngressPath hTTPIngressPathObject){
            _visitables.remove(this.object);
            if (hTTPIngressPathObject!=null){ this.object= new HTTPIngressPathBuilder(hTTPIngressPathObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HTTPIngressPathObjectNested<A> withNewHTTPIngressPathObject(){
            return new HTTPIngressPathObjectNestedImpl();
    }

    public WatchEventFluent.HTTPIngressPathObjectNested<A> withNewHTTPIngressPathObjectLike(HTTPIngressPath item){
            return new HTTPIngressPathObjectNestedImpl(item);
    }

    public A withNamedExtensionObject(NamedExtension namedExtensionObject){
            _visitables.remove(this.object);
            if (namedExtensionObject!=null){ this.object= new NamedExtensionBuilder(namedExtensionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NamedExtensionObjectNested<A> withNewNamedExtensionObject(){
            return new NamedExtensionObjectNestedImpl();
    }

    public WatchEventFluent.NamedExtensionObjectNested<A> withNewNamedExtensionObjectLike(NamedExtension item){
            return new NamedExtensionObjectNestedImpl(item);
    }

    public A withAzureFilePersistentVolumeSourceObject(AzureFilePersistentVolumeSource azureFilePersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (azureFilePersistentVolumeSourceObject!=null){ this.object= new AzureFilePersistentVolumeSourceBuilder(azureFilePersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<A> withNewAzureFilePersistentVolumeSourceObject(){
            return new AzureFilePersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<A> withNewAzureFilePersistentVolumeSourceObjectLike(AzureFilePersistentVolumeSource item){
            return new AzureFilePersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withNewAzureFilePersistentVolumeSourceObject(Boolean readOnly,String secretName,String secretNamespace,String shareName){
            return (A)withAzureFilePersistentVolumeSourceObject(new AzureFilePersistentVolumeSource(readOnly, secretName, secretNamespace, shareName));
    }

    public A withSourceBuildStrategyObject(SourceBuildStrategy sourceBuildStrategyObject){
            _visitables.remove(this.object);
            if (sourceBuildStrategyObject!=null){ this.object= new SourceBuildStrategyBuilder(sourceBuildStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SourceBuildStrategyObjectNested<A> withNewSourceBuildStrategyObject(){
            return new SourceBuildStrategyObjectNestedImpl();
    }

    public WatchEventFluent.SourceBuildStrategyObjectNested<A> withNewSourceBuildStrategyObjectLike(SourceBuildStrategy item){
            return new SourceBuildStrategyObjectNestedImpl(item);
    }

    public A withStatefulSetObject(StatefulSet statefulSetObject){
            _visitables.remove(this.object);
            if (statefulSetObject!=null){ this.object= new StatefulSetBuilder(statefulSetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatefulSetObjectNested<A> withNewStatefulSetObject(){
            return new StatefulSetObjectNestedImpl();
    }

    public WatchEventFluent.StatefulSetObjectNested<A> withNewStatefulSetObjectLike(StatefulSet item){
            return new StatefulSetObjectNestedImpl(item);
    }

    public A withContainerPortObject(ContainerPort containerPortObject){
            _visitables.remove(this.object);
            if (containerPortObject!=null){ this.object= new ContainerPortBuilder(containerPortObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ContainerPortObjectNested<A> withNewContainerPortObject(){
            return new ContainerPortObjectNestedImpl();
    }

    public WatchEventFluent.ContainerPortObjectNested<A> withNewContainerPortObjectLike(ContainerPort item){
            return new ContainerPortObjectNestedImpl(item);
    }

    public A withNewContainerPortObject(Integer containerPort,String hostIP,Integer hostPort,String name,String protocol){
            return (A)withContainerPortObject(new ContainerPort(containerPort, hostIP, hostPort, name, protocol));
    }

    public A withBuildPostCommitSpecObject(BuildPostCommitSpec buildPostCommitSpecObject){
            _visitables.remove(this.object);
            if (buildPostCommitSpecObject!=null){ this.object= new BuildPostCommitSpecBuilder(buildPostCommitSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildPostCommitSpecObjectNested<A> withNewBuildPostCommitSpecObject(){
            return new BuildPostCommitSpecObjectNestedImpl();
    }

    public WatchEventFluent.BuildPostCommitSpecObjectNested<A> withNewBuildPostCommitSpecObjectLike(BuildPostCommitSpec item){
            return new BuildPostCommitSpecObjectNestedImpl(item);
    }

    public A withPodListObject(PodList podListObject){
            _visitables.remove(this.object);
            if (podListObject!=null){ this.object= new PodListBuilder(podListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodListObjectNested<A> withNewPodListObject(){
            return new PodListObjectNestedImpl();
    }

    public WatchEventFluent.PodListObjectNested<A> withNewPodListObjectLike(PodList item){
            return new PodListObjectNestedImpl(item);
    }

    public A withResourceFieldSelectorObject(ResourceFieldSelector resourceFieldSelectorObject){
            _visitables.remove(this.object);
            if (resourceFieldSelectorObject!=null){ this.object= new ResourceFieldSelectorBuilder(resourceFieldSelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceFieldSelectorObjectNested<A> withNewResourceFieldSelectorObject(){
            return new ResourceFieldSelectorObjectNestedImpl();
    }

    public WatchEventFluent.ResourceFieldSelectorObjectNested<A> withNewResourceFieldSelectorObjectLike(ResourceFieldSelector item){
            return new ResourceFieldSelectorObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleObject(OpenshiftClusterRole openshiftClusterRoleObject){
            _visitables.remove(this.object);
            if (openshiftClusterRoleObject!=null){ this.object= new OpenshiftClusterRoleBuilder(openshiftClusterRoleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObject(){
            return new OpenshiftClusterRoleObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftClusterRoleObjectNested<A> withNewOpenshiftClusterRoleObjectLike(OpenshiftClusterRole item){
            return new OpenshiftClusterRoleObjectNestedImpl(item);
    }

    public A withScaleSpecObject(ScaleSpec scaleSpecObject){
            _visitables.remove(this.object);
            if (scaleSpecObject!=null){ this.object= new ScaleSpecBuilder(scaleSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScaleSpecObjectNested<A> withNewScaleSpecObject(){
            return new ScaleSpecObjectNestedImpl();
    }

    public WatchEventFluent.ScaleSpecObjectNested<A> withNewScaleSpecObjectLike(ScaleSpec item){
            return new ScaleSpecObjectNestedImpl(item);
    }

    public A withNewScaleSpecObject(Integer replicas){
            return (A)withScaleSpecObject(new ScaleSpec(replicas));
    }

    public A withDeploymentStrategyObject(io.fabric8.openshift.api.model.DeploymentStrategy deploymentStrategyObject){
            _visitables.remove(this.object);
            if (deploymentStrategyObject!=null){ this.object= new io.fabric8.openshift.api.model.DeploymentStrategyBuilder(deploymentStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ModelDeploymentStrategyObjectNested<A> withNewModelDeploymentStrategyObject(){
            return new ModelDeploymentStrategyObjectNestedImpl();
    }

    public WatchEventFluent.ModelDeploymentStrategyObjectNested<A> withNewDeploymentStrategyObjectLike(io.fabric8.openshift.api.model.DeploymentStrategy item){
            return new ModelDeploymentStrategyObjectNestedImpl(item);
    }

    public A withSignatureSubjectObject(SignatureSubject signatureSubjectObject){
            _visitables.remove(this.object);
            if (signatureSubjectObject!=null){ this.object= new SignatureSubjectBuilder(signatureSubjectObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SignatureSubjectObjectNested<A> withNewSignatureSubjectObject(){
            return new SignatureSubjectObjectNestedImpl();
    }

    public WatchEventFluent.SignatureSubjectObjectNested<A> withNewSignatureSubjectObjectLike(SignatureSubject item){
            return new SignatureSubjectObjectNestedImpl(item);
    }

    public A withNewSignatureSubjectObject(String commonName,String organization,String publicKeyID){
            return (A)withSignatureSubjectObject(new SignatureSubject(commonName, organization, publicKeyID));
    }

    public A withPersistentVolumeClaimSpecObject(PersistentVolumeClaimSpec persistentVolumeClaimSpecObject){
            _visitables.remove(this.object);
            if (persistentVolumeClaimSpecObject!=null){ this.object= new PersistentVolumeClaimSpecBuilder(persistentVolumeClaimSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeClaimSpecObjectNested<A> withNewPersistentVolumeClaimSpecObject(){
            return new PersistentVolumeClaimSpecObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeClaimSpecObjectNested<A> withNewPersistentVolumeClaimSpecObjectLike(PersistentVolumeClaimSpec item){
            return new PersistentVolumeClaimSpecObjectNestedImpl(item);
    }

    public A withRouteIngressConditionObject(RouteIngressCondition routeIngressConditionObject){
            _visitables.remove(this.object);
            if (routeIngressConditionObject!=null){ this.object= new RouteIngressConditionBuilder(routeIngressConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteIngressConditionObjectNested<A> withNewRouteIngressConditionObject(){
            return new RouteIngressConditionObjectNestedImpl();
    }

    public WatchEventFluent.RouteIngressConditionObjectNested<A> withNewRouteIngressConditionObjectLike(RouteIngressCondition item){
            return new RouteIngressConditionObjectNestedImpl(item);
    }

    public A withNewRouteIngressConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withRouteIngressConditionObject(new RouteIngressCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withLoadBalancerStatusObject(LoadBalancerStatus loadBalancerStatusObject){
            _visitables.remove(this.object);
            if (loadBalancerStatusObject!=null){ this.object= new LoadBalancerStatusBuilder(loadBalancerStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LoadBalancerStatusObjectNested<A> withNewLoadBalancerStatusObject(){
            return new LoadBalancerStatusObjectNestedImpl();
    }

    public WatchEventFluent.LoadBalancerStatusObjectNested<A> withNewLoadBalancerStatusObjectLike(LoadBalancerStatus item){
            return new LoadBalancerStatusObjectNestedImpl(item);
    }

    public A withScopeSelectorObject(ScopeSelector scopeSelectorObject){
            _visitables.remove(this.object);
            if (scopeSelectorObject!=null){ this.object= new ScopeSelectorBuilder(scopeSelectorObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScopeSelectorObjectNested<A> withNewScopeSelectorObject(){
            return new ScopeSelectorObjectNestedImpl();
    }

    public WatchEventFluent.ScopeSelectorObjectNested<A> withNewScopeSelectorObjectLike(ScopeSelector item){
            return new ScopeSelectorObjectNestedImpl(item);
    }

    public A withRunAsGroupStrategyOptionsObject(RunAsGroupStrategyOptions runAsGroupStrategyOptionsObject){
            _visitables.remove(this.object);
            if (runAsGroupStrategyOptionsObject!=null){ this.object= new RunAsGroupStrategyOptionsBuilder(runAsGroupStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<A> withNewRunAsGroupStrategyOptionsObject(){
            return new RunAsGroupStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<A> withNewRunAsGroupStrategyOptionsObjectLike(RunAsGroupStrategyOptions item){
            return new RunAsGroupStrategyOptionsObjectNestedImpl(item);
    }

    public A withStageInfoObject(StageInfo stageInfoObject){
            _visitables.remove(this.object);
            if (stageInfoObject!=null){ this.object= new StageInfoBuilder(stageInfoObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StageInfoObjectNested<A> withNewStageInfoObject(){
            return new StageInfoObjectNestedImpl();
    }

    public WatchEventFluent.StageInfoObjectNested<A> withNewStageInfoObjectLike(StageInfo item){
            return new StageInfoObjectNestedImpl(item);
    }

    public A withUserListObject(UserList userListObject){
            _visitables.remove(this.object);
            if (userListObject!=null){ this.object= new UserListBuilder(userListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.UserListObjectNested<A> withNewUserListObject(){
            return new UserListObjectNestedImpl();
    }

    public WatchEventFluent.UserListObjectNested<A> withNewUserListObjectLike(UserList item){
            return new UserListObjectNestedImpl(item);
    }

    public A withRoleObject(Role roleObject){
            _visitables.remove(this.object);
            if (roleObject!=null){ this.object= new RoleBuilder(roleObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RoleObjectNested<A> withNewRoleObject(){
            return new RoleObjectNestedImpl();
    }

    public WatchEventFluent.RoleObjectNested<A> withNewRoleObjectLike(Role item){
            return new RoleObjectNestedImpl(item);
    }

    public A withServicePortObject(ServicePort servicePortObject){
            _visitables.remove(this.object);
            if (servicePortObject!=null){ this.object= new ServicePortBuilder(servicePortObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServicePortObjectNested<A> withNewServicePortObject(){
            return new ServicePortObjectNestedImpl();
    }

    public WatchEventFluent.ServicePortObjectNested<A> withNewServicePortObjectLike(ServicePort item){
            return new ServicePortObjectNestedImpl(item);
    }

    public A withUserObject(User userObject){
            _visitables.remove(this.object);
            if (userObject!=null){ this.object= new UserBuilder(userObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.UserObjectNested<A> withNewUserObject(){
            return new UserObjectNestedImpl();
    }

    public WatchEventFluent.UserObjectNested<A> withNewUserObjectLike(User item){
            return new UserObjectNestedImpl(item);
    }

    public A withSessionAffinityConfigObject(SessionAffinityConfig sessionAffinityConfigObject){
            _visitables.remove(this.object);
            if (sessionAffinityConfigObject!=null){ this.object= new SessionAffinityConfigBuilder(sessionAffinityConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SessionAffinityConfigObjectNested<A> withNewSessionAffinityConfigObject(){
            return new SessionAffinityConfigObjectNestedImpl();
    }

    public WatchEventFluent.SessionAffinityConfigObjectNested<A> withNewSessionAffinityConfigObjectLike(SessionAffinityConfig item){
            return new SessionAffinityConfigObjectNestedImpl(item);
    }

    public A withBuildStatusOutputToObject(BuildStatusOutputTo buildStatusOutputToObject){
            _visitables.remove(this.object);
            if (buildStatusOutputToObject!=null){ this.object= new BuildStatusOutputToBuilder(buildStatusOutputToObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildStatusOutputToObjectNested<A> withNewBuildStatusOutputToObject(){
            return new BuildStatusOutputToObjectNestedImpl();
    }

    public WatchEventFluent.BuildStatusOutputToObjectNested<A> withNewBuildStatusOutputToObjectLike(BuildStatusOutputTo item){
            return new BuildStatusOutputToObjectNestedImpl(item);
    }

    public A withNewBuildStatusOutputToObject(String imageDigest){
            return (A)withBuildStatusOutputToObject(new BuildStatusOutputTo(imageDigest));
    }

    public A withSecretSpecObject(SecretSpec secretSpecObject){
            _visitables.remove(this.object);
            if (secretSpecObject!=null){ this.object= new SecretSpecBuilder(secretSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretSpecObjectNested<A> withNewSecretSpecObject(){
            return new SecretSpecObjectNestedImpl();
    }

    public WatchEventFluent.SecretSpecObjectNested<A> withNewSecretSpecObjectLike(SecretSpec item){
            return new SecretSpecObjectNestedImpl(item);
    }

    public A withServiceAccountListObject(ServiceAccountList serviceAccountListObject){
            _visitables.remove(this.object);
            if (serviceAccountListObject!=null){ this.object= new ServiceAccountListBuilder(serviceAccountListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceAccountListObjectNested<A> withNewServiceAccountListObject(){
            return new ServiceAccountListObjectNestedImpl();
    }

    public WatchEventFluent.ServiceAccountListObjectNested<A> withNewServiceAccountListObjectLike(ServiceAccountList item){
            return new ServiceAccountListObjectNestedImpl(item);
    }

    public A withExecNewPodHookObject(ExecNewPodHook execNewPodHookObject){
            _visitables.remove(this.object);
            if (execNewPodHookObject!=null){ this.object= new ExecNewPodHookBuilder(execNewPodHookObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExecNewPodHookObjectNested<A> withNewExecNewPodHookObject(){
            return new ExecNewPodHookObjectNestedImpl();
    }

    public WatchEventFluent.ExecNewPodHookObjectNested<A> withNewExecNewPodHookObjectLike(ExecNewPodHook item){
            return new ExecNewPodHookObjectNestedImpl(item);
    }

    public A withComponentStatusObject(ComponentStatus componentStatusObject){
            _visitables.remove(this.object);
            if (componentStatusObject!=null){ this.object= new ComponentStatusBuilder(componentStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ComponentStatusObjectNested<A> withNewComponentStatusObject(){
            return new ComponentStatusObjectNestedImpl();
    }

    public WatchEventFluent.ComponentStatusObjectNested<A> withNewComponentStatusObjectLike(ComponentStatus item){
            return new ComponentStatusObjectNestedImpl(item);
    }

    public A withScaleStatusObject(ScaleStatus scaleStatusObject){
            _visitables.remove(this.object);
            if (scaleStatusObject!=null){ this.object= new ScaleStatusBuilder(scaleStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ScaleStatusObjectNested<A> withNewScaleStatusObject(){
            return new ScaleStatusObjectNestedImpl();
    }

    public WatchEventFluent.ScaleStatusObjectNested<A> withNewScaleStatusObjectLike(ScaleStatus item){
            return new ScaleStatusObjectNestedImpl(item);
    }

    public A withCertificateSigningRequestConditionObject(CertificateSigningRequestCondition certificateSigningRequestConditionObject){
            _visitables.remove(this.object);
            if (certificateSigningRequestConditionObject!=null){ this.object= new CertificateSigningRequestConditionBuilder(certificateSigningRequestConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CertificateSigningRequestConditionObjectNested<A> withNewCertificateSigningRequestConditionObject(){
            return new CertificateSigningRequestConditionObjectNestedImpl();
    }

    public WatchEventFluent.CertificateSigningRequestConditionObjectNested<A> withNewCertificateSigningRequestConditionObjectLike(CertificateSigningRequestCondition item){
            return new CertificateSigningRequestConditionObjectNestedImpl(item);
    }

    public A withNewCertificateSigningRequestConditionObject(String lastUpdateTime,String message,String reason,String type){
            return (A)withCertificateSigningRequestConditionObject(new CertificateSigningRequestCondition(lastUpdateTime, message, reason, type));
    }

    public A withDaemonEndpointObject(DaemonEndpoint daemonEndpointObject){
            _visitables.remove(this.object);
            if (daemonEndpointObject!=null){ this.object= new DaemonEndpointBuilder(daemonEndpointObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DaemonEndpointObjectNested<A> withNewDaemonEndpointObject(){
            return new DaemonEndpointObjectNestedImpl();
    }

    public WatchEventFluent.DaemonEndpointObjectNested<A> withNewDaemonEndpointObjectLike(DaemonEndpoint item){
            return new DaemonEndpointObjectNestedImpl(item);
    }

    public A withNewDaemonEndpointObject(Integer port){
            return (A)withDaemonEndpointObject(new DaemonEndpoint(port));
    }

    public A withBuildTriggerPolicyObject(BuildTriggerPolicy buildTriggerPolicyObject){
            _visitables.remove(this.object);
            if (buildTriggerPolicyObject!=null){ this.object= new BuildTriggerPolicyBuilder(buildTriggerPolicyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildTriggerPolicyObjectNested<A> withNewBuildTriggerPolicyObject(){
            return new BuildTriggerPolicyObjectNestedImpl();
    }

    public WatchEventFluent.BuildTriggerPolicyObjectNested<A> withNewBuildTriggerPolicyObjectLike(BuildTriggerPolicy item){
            return new BuildTriggerPolicyObjectNestedImpl(item);
    }

    public A withTokenReviewObject(TokenReview tokenReviewObject){
            _visitables.remove(this.object);
            if (tokenReviewObject!=null){ this.object= new TokenReviewBuilder(tokenReviewObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TokenReviewObjectNested<A> withNewTokenReviewObject(){
            return new TokenReviewObjectNestedImpl();
    }

    public WatchEventFluent.TokenReviewObjectNested<A> withNewTokenReviewObjectLike(TokenReview item){
            return new TokenReviewObjectNestedImpl(item);
    }

    public A withPodSecurityPolicyListObject(PodSecurityPolicyList podSecurityPolicyListObject){
            _visitables.remove(this.object);
            if (podSecurityPolicyListObject!=null){ this.object= new PodSecurityPolicyListBuilder(podSecurityPolicyListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodSecurityPolicyListObjectNested<A> withNewPodSecurityPolicyListObject(){
            return new PodSecurityPolicyListObjectNestedImpl();
    }

    public WatchEventFluent.PodSecurityPolicyListObjectNested<A> withNewPodSecurityPolicyListObjectLike(PodSecurityPolicyList item){
            return new PodSecurityPolicyListObjectNestedImpl(item);
    }

    public A withStorageClassListObject(StorageClassList storageClassListObject){
            _visitables.remove(this.object);
            if (storageClassListObject!=null){ this.object= new StorageClassListBuilder(storageClassListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StorageClassListObjectNested<A> withNewStorageClassListObject(){
            return new StorageClassListObjectNestedImpl();
    }

    public WatchEventFluent.StorageClassListObjectNested<A> withNewStorageClassListObjectLike(StorageClassList item){
            return new StorageClassListObjectNestedImpl(item);
    }

    public A withRoleListObject(RoleList roleListObject){
            _visitables.remove(this.object);
            if (roleListObject!=null){ this.object= new RoleListBuilder(roleListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RoleListObjectNested<A> withNewRoleListObject(){
            return new RoleListObjectNestedImpl();
    }

    public WatchEventFluent.RoleListObjectNested<A> withNewRoleListObjectLike(RoleList item){
            return new RoleListObjectNestedImpl(item);
    }

    public A withRoleRefObject(RoleRef roleRefObject){
            _visitables.remove(this.object);
            if (roleRefObject!=null){ this.object= new RoleRefBuilder(roleRefObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RoleRefObjectNested<A> withNewRoleRefObject(){
            return new RoleRefObjectNestedImpl();
    }

    public WatchEventFluent.RoleRefObjectNested<A> withNewRoleRefObjectLike(RoleRef item){
            return new RoleRefObjectNestedImpl(item);
    }

    public A withNewRoleRefObject(String apiGroup,String kind,String name){
            return (A)withRoleRefObject(new RoleRef(apiGroup, kind, name));
    }

    public A withBindingObject(Binding bindingObject){
            _visitables.remove(this.object);
            if (bindingObject!=null){ this.object= new BindingBuilder(bindingObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BindingObjectNested<A> withNewBindingObject(){
            return new BindingObjectNestedImpl();
    }

    public WatchEventFluent.BindingObjectNested<A> withNewBindingObjectLike(Binding item){
            return new BindingObjectNestedImpl(item);
    }

    public A withDeploymentConfigSpecObject(DeploymentConfigSpec deploymentConfigSpecObject){
            _visitables.remove(this.object);
            if (deploymentConfigSpecObject!=null){ this.object= new DeploymentConfigSpecBuilder(deploymentConfigSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.DeploymentConfigSpecObjectNested<A> withNewDeploymentConfigSpecObject(){
            return new DeploymentConfigSpecObjectNestedImpl();
    }

    public WatchEventFluent.DeploymentConfigSpecObjectNested<A> withNewDeploymentConfigSpecObjectLike(DeploymentConfigSpec item){
            return new DeploymentConfigSpecObjectNestedImpl(item);
    }

    public A withRollingUpdateDaemonSetObject(RollingUpdateDaemonSet rollingUpdateDaemonSetObject){
            _visitables.remove(this.object);
            if (rollingUpdateDaemonSetObject!=null){ this.object= new RollingUpdateDaemonSetBuilder(rollingUpdateDaemonSetObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RollingUpdateDaemonSetObjectNested<A> withNewRollingUpdateDaemonSetObject(){
            return new RollingUpdateDaemonSetObjectNestedImpl();
    }

    public WatchEventFluent.RollingUpdateDaemonSetObjectNested<A> withNewRollingUpdateDaemonSetObjectLike(RollingUpdateDaemonSet item){
            return new RollingUpdateDaemonSetObjectNestedImpl(item);
    }

    public A withNetworkPolicySpecObject(NetworkPolicySpec networkPolicySpecObject){
            _visitables.remove(this.object);
            if (networkPolicySpecObject!=null){ this.object= new NetworkPolicySpecBuilder(networkPolicySpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetworkPolicySpecObjectNested<A> withNewNetworkPolicySpecObject(){
            return new NetworkPolicySpecObjectNestedImpl();
    }

    public WatchEventFluent.NetworkPolicySpecObjectNested<A> withNewNetworkPolicySpecObjectLike(NetworkPolicySpec item){
            return new NetworkPolicySpecObjectNestedImpl(item);
    }

    public A withSecretObject(Secret secretObject){
            _visitables.remove(this.object);
            if (secretObject!=null){ this.object= new SecretBuilder(secretObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecretObjectNested<A> withNewSecretObject(){
            return new SecretObjectNestedImpl();
    }

    public WatchEventFluent.SecretObjectNested<A> withNewSecretObjectLike(Secret item){
            return new SecretObjectNestedImpl(item);
    }

    public A withServiceListObject(ServiceList serviceListObject){
            _visitables.remove(this.object);
            if (serviceListObject!=null){ this.object= new ServiceListBuilder(serviceListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceListObjectNested<A> withNewServiceListObject(){
            return new ServiceListObjectNestedImpl();
    }

    public WatchEventFluent.ServiceListObjectNested<A> withNewServiceListObjectLike(ServiceList item){
            return new ServiceListObjectNestedImpl(item);
    }

    public A withStatefulSetUpdateStrategyObject(StatefulSetUpdateStrategy statefulSetUpdateStrategyObject){
            _visitables.remove(this.object);
            if (statefulSetUpdateStrategyObject!=null){ this.object= new StatefulSetUpdateStrategyBuilder(statefulSetUpdateStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatefulSetUpdateStrategyObjectNested<A> withNewStatefulSetUpdateStrategyObject(){
            return new StatefulSetUpdateStrategyObjectNestedImpl();
    }

    public WatchEventFluent.StatefulSetUpdateStrategyObjectNested<A> withNewStatefulSetUpdateStrategyObjectLike(StatefulSetUpdateStrategy item){
            return new StatefulSetUpdateStrategyObjectNestedImpl(item);
    }

    public A withEventSeriesObject(io.fabric8.kubernetes.api.model.events.EventSeries eventSeriesObject){
            _visitables.remove(this.object);
            if (eventSeriesObject!=null){ this.object= new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(eventSeriesObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EventsEventSeriesObjectNested<A> withNewEventsEventSeriesObject(){
            return new EventsEventSeriesObjectNestedImpl();
    }

    public WatchEventFluent.EventsEventSeriesObjectNested<A> withNewEventSeriesObjectLike(io.fabric8.kubernetes.api.model.events.EventSeries item){
            return new EventsEventSeriesObjectNestedImpl(item);
    }

    public A withVolumeNodeAffinityObject(VolumeNodeAffinity volumeNodeAffinityObject){
            _visitables.remove(this.object);
            if (volumeNodeAffinityObject!=null){ this.object= new VolumeNodeAffinityBuilder(volumeNodeAffinityObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.VolumeNodeAffinityObjectNested<A> withNewVolumeNodeAffinityObject(){
            return new VolumeNodeAffinityObjectNestedImpl();
    }

    public WatchEventFluent.VolumeNodeAffinityObjectNested<A> withNewVolumeNodeAffinityObjectLike(VolumeNodeAffinity item){
            return new VolumeNodeAffinityObjectNestedImpl(item);
    }

    public A withPodsMetricStatusObject(PodsMetricStatus podsMetricStatusObject){
            _visitables.remove(this.object);
            if (podsMetricStatusObject!=null){ this.object= new PodsMetricStatusBuilder(podsMetricStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodsMetricStatusObjectNested<A> withNewPodsMetricStatusObject(){
            return new PodsMetricStatusObjectNestedImpl();
    }

    public WatchEventFluent.PodsMetricStatusObjectNested<A> withNewPodsMetricStatusObjectLike(PodsMetricStatus item){
            return new PodsMetricStatusObjectNestedImpl(item);
    }

    public A withResourceQuotaSpecObject(ResourceQuotaSpec resourceQuotaSpecObject){
            _visitables.remove(this.object);
            if (resourceQuotaSpecObject!=null){ this.object= new ResourceQuotaSpecBuilder(resourceQuotaSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ResourceQuotaSpecObjectNested<A> withNewResourceQuotaSpecObject(){
            return new ResourceQuotaSpecObjectNestedImpl();
    }

    public WatchEventFluent.ResourceQuotaSpecObjectNested<A> withNewResourceQuotaSpecObjectLike(ResourceQuotaSpec item){
            return new ResourceQuotaSpecObjectNestedImpl(item);
    }

    public A withGroupRestrictionObject(GroupRestriction groupRestrictionObject){
            _visitables.remove(this.object);
            if (groupRestrictionObject!=null){ this.object= new GroupRestrictionBuilder(groupRestrictionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.GroupRestrictionObjectNested<A> withNewGroupRestrictionObject(){
            return new GroupRestrictionObjectNestedImpl();
    }

    public WatchEventFluent.GroupRestrictionObjectNested<A> withNewGroupRestrictionObjectLike(GroupRestriction item){
            return new GroupRestrictionObjectNestedImpl(item);
    }

    public A withJenkinsPipelineBuildStrategyObject(JenkinsPipelineBuildStrategy jenkinsPipelineBuildStrategyObject){
            _visitables.remove(this.object);
            if (jenkinsPipelineBuildStrategyObject!=null){ this.object= new JenkinsPipelineBuildStrategyBuilder(jenkinsPipelineBuildStrategyObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<A> withNewJenkinsPipelineBuildStrategyObject(){
            return new JenkinsPipelineBuildStrategyObjectNestedImpl();
    }

    public WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<A> withNewJenkinsPipelineBuildStrategyObjectLike(JenkinsPipelineBuildStrategy item){
            return new JenkinsPipelineBuildStrategyObjectNestedImpl(item);
    }

    public A withSecurityContextConstraintsObject(SecurityContextConstraints securityContextConstraintsObject){
            _visitables.remove(this.object);
            if (securityContextConstraintsObject!=null){ this.object= new SecurityContextConstraintsBuilder(securityContextConstraintsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObject(){
            return new SecurityContextConstraintsObjectNestedImpl();
    }

    public WatchEventFluent.SecurityContextConstraintsObjectNested<A> withNewSecurityContextConstraintsObjectLike(SecurityContextConstraints item){
            return new SecurityContextConstraintsObjectNestedImpl(item);
    }

    public A withSubjectObject(Subject subjectObject){
            _visitables.remove(this.object);
            if (subjectObject!=null){ this.object= new SubjectBuilder(subjectObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SubjectObjectNested<A> withNewSubjectObject(){
            return new SubjectObjectNestedImpl();
    }

    public WatchEventFluent.SubjectObjectNested<A> withNewSubjectObjectLike(Subject item){
            return new SubjectObjectNestedImpl(item);
    }

    public A withNewSubjectObject(String apiGroup,String kind,String name,String namespace){
            return (A)withSubjectObject(new Subject(apiGroup, kind, name, namespace));
    }

    public A withReplicaSetConditionObject(ReplicaSetCondition replicaSetConditionObject){
            _visitables.remove(this.object);
            if (replicaSetConditionObject!=null){ this.object= new ReplicaSetConditionBuilder(replicaSetConditionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicaSetConditionObjectNested<A> withNewReplicaSetConditionObject(){
            return new ReplicaSetConditionObjectNestedImpl();
    }

    public WatchEventFluent.ReplicaSetConditionObjectNested<A> withNewReplicaSetConditionObjectLike(ReplicaSetCondition item){
            return new ReplicaSetConditionObjectNestedImpl(item);
    }

    public A withNewReplicaSetConditionObject(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)withReplicaSetConditionObject(new ReplicaSetCondition(lastTransitionTime, message, reason, status, type));
    }

    public A withBaseKubernetesListObject(BaseKubernetesList baseKubernetesListObject){
            _visitables.remove(this.object);
            if (baseKubernetesListObject!=null){ this.object= new BaseKubernetesListBuilder(baseKubernetesListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BaseKubernetesListObjectNested<A> withNewBaseKubernetesListObject(){
            return new BaseKubernetesListObjectNestedImpl();
    }

    public WatchEventFluent.BaseKubernetesListObjectNested<A> withNewBaseKubernetesListObjectLike(BaseKubernetesList item){
            return new BaseKubernetesListObjectNestedImpl(item);
    }

    public A withSELinuxContextStrategyOptionsObject(SELinuxContextStrategyOptions sELinuxContextStrategyOptionsObject){
            _visitables.remove(this.object);
            if (sELinuxContextStrategyOptionsObject!=null){ this.object= new SELinuxContextStrategyOptionsBuilder(sELinuxContextStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<A> withNewSELinuxContextStrategyOptionsObject(){
            return new SELinuxContextStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<A> withNewSELinuxContextStrategyOptionsObjectLike(SELinuxContextStrategyOptions item){
            return new SELinuxContextStrategyOptionsObjectNestedImpl(item);
    }

    public A withTopologySelectorLabelRequirementObject(TopologySelectorLabelRequirement topologySelectorLabelRequirementObject){
            _visitables.remove(this.object);
            if (topologySelectorLabelRequirementObject!=null){ this.object= new TopologySelectorLabelRequirementBuilder(topologySelectorLabelRequirementObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.TopologySelectorLabelRequirementObjectNested<A> withNewTopologySelectorLabelRequirementObject(){
            return new TopologySelectorLabelRequirementObjectNestedImpl();
    }

    public WatchEventFluent.TopologySelectorLabelRequirementObjectNested<A> withNewTopologySelectorLabelRequirementObjectLike(TopologySelectorLabelRequirement item){
            return new TopologySelectorLabelRequirementObjectNestedImpl(item);
    }

    public A withRBDPersistentVolumeSourceObject(RBDPersistentVolumeSource rBDPersistentVolumeSourceObject){
            _visitables.remove(this.object);
            if (rBDPersistentVolumeSourceObject!=null){ this.object= new RBDPersistentVolumeSourceBuilder(rBDPersistentVolumeSourceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RBDPersistentVolumeSourceObjectNested<A> withNewRBDPersistentVolumeSourceObject(){
            return new RBDPersistentVolumeSourceObjectNestedImpl();
    }

    public WatchEventFluent.RBDPersistentVolumeSourceObjectNested<A> withNewRBDPersistentVolumeSourceObjectLike(RBDPersistentVolumeSource item){
            return new RBDPersistentVolumeSourceObjectNestedImpl(item);
    }

    public A withSELinuxOptionsObject(SELinuxOptions sELinuxOptionsObject){
            _visitables.remove(this.object);
            if (sELinuxOptionsObject!=null){ this.object= new SELinuxOptionsBuilder(sELinuxOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SELinuxOptionsObjectNested<A> withNewSELinuxOptionsObject(){
            return new SELinuxOptionsObjectNestedImpl();
    }

    public WatchEventFluent.SELinuxOptionsObjectNested<A> withNewSELinuxOptionsObjectLike(SELinuxOptions item){
            return new SELinuxOptionsObjectNestedImpl(item);
    }

    public A withNewSELinuxOptionsObject(String level,String role,String type,String user){
            return (A)withSELinuxOptionsObject(new SELinuxOptions(level, role, type, user));
    }

    public A withHostAliasObject(HostAlias hostAliasObject){
            _visitables.remove(this.object);
            if (hostAliasObject!=null){ this.object= new HostAliasBuilder(hostAliasObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.HostAliasObjectNested<A> withNewHostAliasObject(){
            return new HostAliasObjectNestedImpl();
    }

    public WatchEventFluent.HostAliasObjectNested<A> withNewHostAliasObjectLike(HostAlias item){
            return new HostAliasObjectNestedImpl(item);
    }

    public A withImageStreamStatusObject(ImageStreamStatus imageStreamStatusObject){
            _visitables.remove(this.object);
            if (imageStreamStatusObject!=null){ this.object= new ImageStreamStatusBuilder(imageStreamStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ImageStreamStatusObjectNested<A> withNewImageStreamStatusObject(){
            return new ImageStreamStatusObjectNestedImpl();
    }

    public WatchEventFluent.ImageStreamStatusObjectNested<A> withNewImageStreamStatusObjectLike(ImageStreamStatus item){
            return new ImageStreamStatusObjectNestedImpl(item);
    }

    public A withNodeDaemonEndpointsObject(NodeDaemonEndpoints nodeDaemonEndpointsObject){
            _visitables.remove(this.object);
            if (nodeDaemonEndpointsObject!=null){ this.object= new NodeDaemonEndpointsBuilder(nodeDaemonEndpointsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeDaemonEndpointsObjectNested<A> withNewNodeDaemonEndpointsObject(){
            return new NodeDaemonEndpointsObjectNestedImpl();
    }

    public WatchEventFluent.NodeDaemonEndpointsObjectNested<A> withNewNodeDaemonEndpointsObjectLike(NodeDaemonEndpoints item){
            return new NodeDaemonEndpointsObjectNestedImpl(item);
    }

    public A withNetNamespaceObject(NetNamespace netNamespaceObject){
            _visitables.remove(this.object);
            if (netNamespaceObject!=null){ this.object= new NetNamespaceBuilder(netNamespaceObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObject(){
            return new NetNamespaceObjectNestedImpl();
    }

    public WatchEventFluent.NetNamespaceObjectNested<A> withNewNetNamespaceObjectLike(NetNamespace item){
            return new NetNamespaceObjectNestedImpl(item);
    }

    public A withPersistentVolumeSpecObject(PersistentVolumeSpec persistentVolumeSpecObject){
            _visitables.remove(this.object);
            if (persistentVolumeSpecObject!=null){ this.object= new PersistentVolumeSpecBuilder(persistentVolumeSpecObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeSpecObjectNested<A> withNewPersistentVolumeSpecObject(){
            return new PersistentVolumeSpecObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeSpecObjectNested<A> withNewPersistentVolumeSpecObjectLike(PersistentVolumeSpec item){
            return new PersistentVolumeSpecObjectNestedImpl(item);
    }

    public A withStatefulSetListObject(StatefulSetList statefulSetListObject){
            _visitables.remove(this.object);
            if (statefulSetListObject!=null){ this.object= new StatefulSetListBuilder(statefulSetListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.StatefulSetListObjectNested<A> withNewStatefulSetListObject(){
            return new StatefulSetListObjectNestedImpl();
    }

    public WatchEventFluent.StatefulSetListObjectNested<A> withNewStatefulSetListObjectLike(StatefulSetList item){
            return new StatefulSetListObjectNestedImpl(item);
    }

    public A withOpenshiftClusterRoleBindingListObject(OpenshiftClusterRoleBindingList openshiftClusterRoleBindingListObject){
            _visitables.remove(this.object);
            if (openshiftClusterRoleBindingListObject!=null){ this.object= new OpenshiftClusterRoleBindingListBuilder(openshiftClusterRoleBindingListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<A> withNewOpenshiftClusterRoleBindingListObject(){
            return new OpenshiftClusterRoleBindingListObjectNestedImpl();
    }

    public WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<A> withNewOpenshiftClusterRoleBindingListObjectLike(OpenshiftClusterRoleBindingList item){
            return new OpenshiftClusterRoleBindingListObjectNestedImpl(item);
    }

    public A withReplicaSetStatusObject(ReplicaSetStatus replicaSetStatusObject){
            _visitables.remove(this.object);
            if (replicaSetStatusObject!=null){ this.object= new ReplicaSetStatusBuilder(replicaSetStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ReplicaSetStatusObjectNested<A> withNewReplicaSetStatusObject(){
            return new ReplicaSetStatusObjectNestedImpl();
    }

    public WatchEventFluent.ReplicaSetStatusObjectNested<A> withNewReplicaSetStatusObjectLike(ReplicaSetStatus item){
            return new ReplicaSetStatusObjectNestedImpl(item);
    }

    public A withNodeObject(Node nodeObject){
            _visitables.remove(this.object);
            if (nodeObject!=null){ this.object= new NodeBuilder(nodeObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.NodeObjectNested<A> withNewNodeObject(){
            return new NodeObjectNestedImpl();
    }

    public WatchEventFluent.NodeObjectNested<A> withNewNodeObjectLike(Node item){
            return new NodeObjectNestedImpl(item);
    }

    public A withPriorityClassListObject(PriorityClassList priorityClassListObject){
            _visitables.remove(this.object);
            if (priorityClassListObject!=null){ this.object= new PriorityClassListBuilder(priorityClassListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PriorityClassListObjectNested<A> withNewPriorityClassListObject(){
            return new PriorityClassListObjectNestedImpl();
    }

    public WatchEventFluent.PriorityClassListObjectNested<A> withNewPriorityClassListObjectLike(PriorityClassList item){
            return new PriorityClassListObjectNestedImpl(item);
    }

    public A withJobObject(Job jobObject){
            _visitables.remove(this.object);
            if (jobObject!=null){ this.object= new JobBuilder(jobObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JobObjectNested<A> withNewJobObject(){
            return new JobObjectNestedImpl();
    }

    public WatchEventFluent.JobObjectNested<A> withNewJobObjectLike(Job item){
            return new JobObjectNestedImpl(item);
    }

    public A withPodStatusObject(PodStatus podStatusObject){
            _visitables.remove(this.object);
            if (podStatusObject!=null){ this.object= new PodStatusBuilder(podStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PodStatusObjectNested<A> withNewPodStatusObject(){
            return new PodStatusObjectNestedImpl();
    }

    public WatchEventFluent.PodStatusObjectNested<A> withNewPodStatusObjectLike(PodStatus item){
            return new PodStatusObjectNestedImpl(item);
    }

    public A withBuildOutputObject(BuildOutput buildOutputObject){
            _visitables.remove(this.object);
            if (buildOutputObject!=null){ this.object= new BuildOutputBuilder(buildOutputObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.BuildOutputObjectNested<A> withNewBuildOutputObject(){
            return new BuildOutputObjectNestedImpl();
    }

    public WatchEventFluent.BuildOutputObjectNested<A> withNewBuildOutputObjectLike(BuildOutput item){
            return new BuildOutputObjectNestedImpl(item);
    }

    public A withExecConfigObject(ExecConfig execConfigObject){
            _visitables.remove(this.object);
            if (execConfigObject!=null){ this.object= new ExecConfigBuilder(execConfigObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ExecConfigObjectNested<A> withNewExecConfigObject(){
            return new ExecConfigObjectNestedImpl();
    }

    public WatchEventFluent.ExecConfigObjectNested<A> withNewExecConfigObjectLike(ExecConfig item){
            return new ExecConfigObjectNestedImpl(item);
    }

    public A withPersistentVolumeStatusObject(PersistentVolumeStatus persistentVolumeStatusObject){
            _visitables.remove(this.object);
            if (persistentVolumeStatusObject!=null){ this.object= new PersistentVolumeStatusBuilder(persistentVolumeStatusObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.PersistentVolumeStatusObjectNested<A> withNewPersistentVolumeStatusObject(){
            return new PersistentVolumeStatusObjectNestedImpl();
    }

    public WatchEventFluent.PersistentVolumeStatusObjectNested<A> withNewPersistentVolumeStatusObjectLike(PersistentVolumeStatus item){
            return new PersistentVolumeStatusObjectNestedImpl(item);
    }

    public A withNewPersistentVolumeStatusObject(String message,String phase,String reason){
            return (A)withPersistentVolumeStatusObject(new PersistentVolumeStatus(message, phase, reason));
    }

    public A withEndpointPortObject(EndpointPort endpointPortObject){
            _visitables.remove(this.object);
            if (endpointPortObject!=null){ this.object= new EndpointPortBuilder(endpointPortObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.EndpointPortObjectNested<A> withNewEndpointPortObject(){
            return new EndpointPortObjectNestedImpl();
    }

    public WatchEventFluent.EndpointPortObjectNested<A> withNewEndpointPortObjectLike(EndpointPort item){
            return new EndpointPortObjectNestedImpl(item);
    }

    public A withNewEndpointPortObject(String name,Integer port,String protocol){
            return (A)withEndpointPortObject(new EndpointPort(name, port, protocol));
    }

    public A withSourceRevisionObject(SourceRevision sourceRevisionObject){
            _visitables.remove(this.object);
            if (sourceRevisionObject!=null){ this.object= new SourceRevisionBuilder(sourceRevisionObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.SourceRevisionObjectNested<A> withNewSourceRevisionObject(){
            return new SourceRevisionObjectNestedImpl();
    }

    public WatchEventFluent.SourceRevisionObjectNested<A> withNewSourceRevisionObjectLike(SourceRevision item){
            return new SourceRevisionObjectNestedImpl(item);
    }

    public A withJSONObject(JSON jSONObject){
            _visitables.remove(this.object);
            if (jSONObject!=null){ this.object= new JSONBuilder(jSONObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.JSONObjectNested<A> withNewJSONObject(){
            return new JSONObjectNestedImpl();
    }

    public WatchEventFluent.JSONObjectNested<A> withNewJSONObjectLike(JSON item){
            return new JSONObjectNestedImpl(item);
    }

    public A withNewJSONObject(String raw){
            return (A)withJSONObject(new JSON(raw));
    }

    public A withLimitRangeItemObject(LimitRangeItem limitRangeItemObject){
            _visitables.remove(this.object);
            if (limitRangeItemObject!=null){ this.object= new LimitRangeItemBuilder(limitRangeItemObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.LimitRangeItemObjectNested<A> withNewLimitRangeItemObject(){
            return new LimitRangeItemObjectNestedImpl();
    }

    public WatchEventFluent.LimitRangeItemObjectNested<A> withNewLimitRangeItemObjectLike(LimitRangeItem item){
            return new LimitRangeItemObjectNestedImpl(item);
    }

    public A withCertificateSigningRequestObject(CertificateSigningRequest certificateSigningRequestObject){
            _visitables.remove(this.object);
            if (certificateSigningRequestObject!=null){ this.object= new CertificateSigningRequestBuilder(certificateSigningRequestObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObject(){
            return new CertificateSigningRequestObjectNestedImpl();
    }

    public WatchEventFluent.CertificateSigningRequestObjectNested<A> withNewCertificateSigningRequestObjectLike(CertificateSigningRequest item){
            return new CertificateSigningRequestObjectNestedImpl(item);
    }

    public A withFSGroupStrategyOptionsObject(FSGroupStrategyOptions fSGroupStrategyOptionsObject){
            _visitables.remove(this.object);
            if (fSGroupStrategyOptionsObject!=null){ this.object= new FSGroupStrategyOptionsBuilder(fSGroupStrategyOptionsObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.FSGroupStrategyOptionsObjectNested<A> withNewFSGroupStrategyOptionsObject(){
            return new FSGroupStrategyOptionsObjectNestedImpl();
    }

    public WatchEventFluent.FSGroupStrategyOptionsObjectNested<A> withNewFSGroupStrategyOptionsObjectLike(FSGroupStrategyOptions item){
            return new FSGroupStrategyOptionsObjectNestedImpl(item);
    }

    public A withClusterRoleListObject(ClusterRoleList clusterRoleListObject){
            _visitables.remove(this.object);
            if (clusterRoleListObject!=null){ this.object= new ClusterRoleListBuilder(clusterRoleListObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ClusterRoleListObjectNested<A> withNewClusterRoleListObject(){
            return new ClusterRoleListObjectNestedImpl();
    }

    public WatchEventFluent.ClusterRoleListObjectNested<A> withNewClusterRoleListObjectLike(ClusterRoleList item){
            return new ClusterRoleListObjectNestedImpl(item);
    }

    public A withRouteIngressObject(RouteIngress routeIngressObject){
            _visitables.remove(this.object);
            if (routeIngressObject!=null){ this.object= new RouteIngressBuilder(routeIngressObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.RouteIngressObjectNested<A> withNewRouteIngressObject(){
            return new RouteIngressObjectNestedImpl();
    }

    public WatchEventFluent.RouteIngressObjectNested<A> withNewRouteIngressObjectLike(RouteIngress item){
            return new RouteIngressObjectNestedImpl(item);
    }

    public A withServiceAccountObject(ServiceAccount serviceAccountObject){
            _visitables.remove(this.object);
            if (serviceAccountObject!=null){ this.object= new ServiceAccountBuilder(serviceAccountObject); _visitables.add(this.object);} return (A) this;
    }

    public WatchEventFluent.ServiceAccountObjectNested<A> withNewServiceAccountObject(){
            return new ServiceAccountObjectNestedImpl();
    }

    public WatchEventFluent.ServiceAccountObjectNested<A> withNewServiceAccountObjectLike(ServiceAccount item){
            return new ServiceAccountObjectNestedImpl(item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WatchEventFluentImpl that = (WatchEventFluentImpl) o;
            if (object != null ? !object.equals(that.object) :that.object != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class PatchObjectNestedImpl<N> extends PatchFluentImpl<WatchEventFluent.PatchObjectNested<N>> implements WatchEventFluent.PatchObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PatchBuilder builder;
    
            PatchObjectNestedImpl(Patch item){
                    this.builder = new PatchBuilder(this, item);
            }
            PatchObjectNestedImpl(){
                    this.builder = new PatchBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPatchObject(builder.build());
    }
    public N endPatchObject(){
            return and();
    }

}
    public class DeploymentListObjectNestedImpl<N> extends DeploymentListFluentImpl<WatchEventFluent.DeploymentListObjectNested<N>> implements WatchEventFluent.DeploymentListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentListBuilder builder;
    
            DeploymentListObjectNestedImpl(DeploymentList item){
                    this.builder = new DeploymentListBuilder(this, item);
            }
            DeploymentListObjectNestedImpl(){
                    this.builder = new DeploymentListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentListObject(builder.build());
    }
    public N endDeploymentListObject(){
            return and();
    }

}
    public class ScopeRestrictionObjectNestedImpl<N> extends ScopeRestrictionFluentImpl<WatchEventFluent.ScopeRestrictionObjectNested<N>> implements WatchEventFluent.ScopeRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScopeRestrictionBuilder builder;
    
            ScopeRestrictionObjectNestedImpl(ScopeRestriction item){
                    this.builder = new ScopeRestrictionBuilder(this, item);
            }
            ScopeRestrictionObjectNestedImpl(){
                    this.builder = new ScopeRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScopeRestrictionObject(builder.build());
    }
    public N endScopeRestrictionObject(){
            return and();
    }

}
    public class PodsMetricSourceObjectNestedImpl<N> extends PodsMetricSourceFluentImpl<WatchEventFluent.PodsMetricSourceObjectNested<N>> implements WatchEventFluent.PodsMetricSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodsMetricSourceBuilder builder;
    
            PodsMetricSourceObjectNestedImpl(PodsMetricSource item){
                    this.builder = new PodsMetricSourceBuilder(this, item);
            }
            PodsMetricSourceObjectNestedImpl(){
                    this.builder = new PodsMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodsMetricSourceObject(builder.build());
    }
    public N endPodsMetricSourceObject(){
            return and();
    }

}
    public class StepInfoObjectNestedImpl<N> extends StepInfoFluentImpl<WatchEventFluent.StepInfoObjectNested<N>> implements WatchEventFluent.StepInfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StepInfoBuilder builder;
    
            StepInfoObjectNestedImpl(StepInfo item){
                    this.builder = new StepInfoBuilder(this, item);
            }
            StepInfoObjectNestedImpl(){
                    this.builder = new StepInfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStepInfoObject(builder.build());
    }
    public N endStepInfoObject(){
            return and();
    }

}
    public class StatefulSetStatusObjectNestedImpl<N> extends StatefulSetStatusFluentImpl<WatchEventFluent.StatefulSetStatusObjectNested<N>> implements WatchEventFluent.StatefulSetStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetStatusBuilder builder;
    
            StatefulSetStatusObjectNestedImpl(StatefulSetStatus item){
                    this.builder = new StatefulSetStatusBuilder(this, item);
            }
            StatefulSetStatusObjectNestedImpl(){
                    this.builder = new StatefulSetStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatefulSetStatusObject(builder.build());
    }
    public N endStatefulSetStatusObject(){
            return and();
    }

}
    public class PodTemplateSpecObjectNestedImpl<N> extends PodTemplateSpecFluentImpl<WatchEventFluent.PodTemplateSpecObjectNested<N>> implements WatchEventFluent.PodTemplateSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            PodTemplateSpecObjectNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            PodTemplateSpecObjectNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodTemplateSpecObject(builder.build());
    }
    public N endPodTemplateSpecObject(){
            return and();
    }

}
    public class AuthInfoObjectNestedImpl<N> extends AuthInfoFluentImpl<WatchEventFluent.AuthInfoObjectNested<N>> implements WatchEventFluent.AuthInfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AuthInfoBuilder builder;
    
            AuthInfoObjectNestedImpl(AuthInfo item){
                    this.builder = new AuthInfoBuilder(this, item);
            }
            AuthInfoObjectNestedImpl(){
                    this.builder = new AuthInfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAuthInfoObject(builder.build());
    }
    public N endAuthInfoObject(){
            return and();
    }

}
    public class ConfigMapKeySelectorObjectNestedImpl<N> extends ConfigMapKeySelectorFluentImpl<WatchEventFluent.ConfigMapKeySelectorObjectNested<N>> implements WatchEventFluent.ConfigMapKeySelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapKeySelectorBuilder builder;
    
            ConfigMapKeySelectorObjectNestedImpl(ConfigMapKeySelector item){
                    this.builder = new ConfigMapKeySelectorBuilder(this, item);
            }
            ConfigMapKeySelectorObjectNestedImpl(){
                    this.builder = new ConfigMapKeySelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapKeySelectorObject(builder.build());
    }
    public N endConfigMapKeySelectorObject(){
            return and();
    }

}
    public class RuleWithOperationsObjectNestedImpl<N> extends RuleWithOperationsFluentImpl<WatchEventFluent.RuleWithOperationsObjectNested<N>> implements WatchEventFluent.RuleWithOperationsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RuleWithOperationsBuilder builder;
    
            RuleWithOperationsObjectNestedImpl(RuleWithOperations item){
                    this.builder = new RuleWithOperationsBuilder(this, item);
            }
            RuleWithOperationsObjectNestedImpl(){
                    this.builder = new RuleWithOperationsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRuleWithOperationsObject(builder.build());
    }
    public N endRuleWithOperationsObject(){
            return and();
    }

}
    public class HostPathVolumeSourceObjectNestedImpl<N> extends HostPathVolumeSourceFluentImpl<WatchEventFluent.HostPathVolumeSourceObjectNested<N>> implements WatchEventFluent.HostPathVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostPathVolumeSourceBuilder builder;
    
            HostPathVolumeSourceObjectNestedImpl(HostPathVolumeSource item){
                    this.builder = new HostPathVolumeSourceBuilder(this, item);
            }
            HostPathVolumeSourceObjectNestedImpl(){
                    this.builder = new HostPathVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHostPathVolumeSourceObject(builder.build());
    }
    public N endHostPathVolumeSourceObject(){
            return and();
    }

}
    public class NamedContextObjectNestedImpl<N> extends NamedContextFluentImpl<WatchEventFluent.NamedContextObjectNested<N>> implements WatchEventFluent.NamedContextObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedContextBuilder builder;
    
            NamedContextObjectNestedImpl(NamedContext item){
                    this.builder = new NamedContextBuilder(this, item);
            }
            NamedContextObjectNestedImpl(){
                    this.builder = new NamedContextBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamedContextObject(builder.build());
    }
    public N endNamedContextObject(){
            return and();
    }

}
    public class ConfigObjectNestedImpl<N> extends ConfigFluentImpl<WatchEventFluent.ConfigObjectNested<N>> implements WatchEventFluent.ConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigBuilder builder;
    
            ConfigObjectNestedImpl(Config item){
                    this.builder = new ConfigBuilder(this, item);
            }
            ConfigObjectNestedImpl(){
                    this.builder = new ConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigObject(builder.build());
    }
    public N endConfigObject(){
            return and();
    }

}
    public class PodPresetSpecObjectNestedImpl<N> extends PodPresetSpecFluentImpl<WatchEventFluent.PodPresetSpecObjectNested<N>> implements WatchEventFluent.PodPresetSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetSpecBuilder builder;
    
            PodPresetSpecObjectNestedImpl(PodPresetSpec item){
                    this.builder = new PodPresetSpecBuilder(this, item);
            }
            PodPresetSpecObjectNestedImpl(){
                    this.builder = new PodPresetSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodPresetSpecObject(builder.build());
    }
    public N endPodPresetSpecObject(){
            return and();
    }

}
    public class AffinityObjectNestedImpl<N> extends AffinityFluentImpl<WatchEventFluent.AffinityObjectNested<N>> implements WatchEventFluent.AffinityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AffinityBuilder builder;
    
            AffinityObjectNestedImpl(Affinity item){
                    this.builder = new AffinityBuilder(this, item);
            }
            AffinityObjectNestedImpl(){
                    this.builder = new AffinityBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAffinityObject(builder.build());
    }
    public N endAffinityObject(){
            return and();
    }

}
    public class ResourceAttributesObjectNestedImpl<N> extends ResourceAttributesFluentImpl<WatchEventFluent.ResourceAttributesObjectNested<N>> implements WatchEventFluent.ResourceAttributesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceAttributesBuilder builder;
    
            ResourceAttributesObjectNestedImpl(ResourceAttributes item){
                    this.builder = new ResourceAttributesBuilder(this, item);
            }
            ResourceAttributesObjectNestedImpl(){
                    this.builder = new ResourceAttributesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceAttributesObject(builder.build());
    }
    public N endResourceAttributesObject(){
            return and();
    }

}
    public class SubjectAccessReviewSpecObjectNestedImpl<N> extends SubjectAccessReviewSpecFluentImpl<WatchEventFluent.SubjectAccessReviewSpecObjectNested<N>> implements WatchEventFluent.SubjectAccessReviewSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewSpecBuilder builder;
    
            SubjectAccessReviewSpecObjectNestedImpl(SubjectAccessReviewSpec item){
                    this.builder = new SubjectAccessReviewSpecBuilder(this, item);
            }
            SubjectAccessReviewSpecObjectNestedImpl(){
                    this.builder = new SubjectAccessReviewSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSubjectAccessReviewSpecObject(builder.build());
    }
    public N endSubjectAccessReviewSpecObject(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationObjectNestedImpl<N> extends ValidatingWebhookConfigurationFluentImpl<WatchEventFluent.ValidatingWebhookConfigurationObjectNested<N>> implements WatchEventFluent.ValidatingWebhookConfigurationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationBuilder builder;
    
            ValidatingWebhookConfigurationObjectNestedImpl(ValidatingWebhookConfiguration item){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this, item);
            }
            ValidatingWebhookConfigurationObjectNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withValidatingWebhookConfigurationObject(builder.build());
    }
    public N endValidatingWebhookConfigurationObject(){
            return and();
    }

}
    public class ModelPolicyRuleObjectNestedImpl<N> extends io.fabric8.openshift.api.model.PolicyRuleFluentImpl<WatchEventFluent.ModelPolicyRuleObjectNested<N>> implements WatchEventFluent.ModelPolicyRuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.PolicyRuleBuilder builder;
    
            ModelPolicyRuleObjectNestedImpl(io.fabric8.openshift.api.model.PolicyRule item){
                    this.builder = new io.fabric8.openshift.api.model.PolicyRuleBuilder(this, item);
            }
            ModelPolicyRuleObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.PolicyRuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPolicyRuleObject(builder.build());
    }
    public N endModelPolicyRuleObject(){
            return and();
    }

}
    public class NetworkPolicyEgressRuleObjectNestedImpl<N> extends NetworkPolicyEgressRuleFluentImpl<WatchEventFluent.NetworkPolicyEgressRuleObjectNested<N>> implements WatchEventFluent.NetworkPolicyEgressRuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyEgressRuleBuilder builder;
    
            NetworkPolicyEgressRuleObjectNestedImpl(NetworkPolicyEgressRule item){
                    this.builder = new NetworkPolicyEgressRuleBuilder(this, item);
            }
            NetworkPolicyEgressRuleObjectNestedImpl(){
                    this.builder = new NetworkPolicyEgressRuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicyEgressRuleObject(builder.build());
    }
    public N endNetworkPolicyEgressRuleObject(){
            return and();
    }

}
    public class IPBlockObjectNestedImpl<N> extends IPBlockFluentImpl<WatchEventFluent.IPBlockObjectNested<N>> implements WatchEventFluent.IPBlockObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IPBlockBuilder builder;
    
            IPBlockObjectNestedImpl(IPBlock item){
                    this.builder = new IPBlockBuilder(this, item);
            }
            IPBlockObjectNestedImpl(){
                    this.builder = new IPBlockBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIPBlockObject(builder.build());
    }
    public N endIPBlockObject(){
            return and();
    }

}
    public class DeploymentTriggerPolicyObjectNestedImpl<N> extends DeploymentTriggerPolicyFluentImpl<WatchEventFluent.DeploymentTriggerPolicyObjectNested<N>> implements WatchEventFluent.DeploymentTriggerPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentTriggerPolicyBuilder builder;
    
            DeploymentTriggerPolicyObjectNestedImpl(DeploymentTriggerPolicy item){
                    this.builder = new DeploymentTriggerPolicyBuilder(this, item);
            }
            DeploymentTriggerPolicyObjectNestedImpl(){
                    this.builder = new DeploymentTriggerPolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentTriggerPolicyObject(builder.build());
    }
    public N endDeploymentTriggerPolicyObject(){
            return and();
    }

}
    public class BuildStrategyObjectNestedImpl<N> extends BuildStrategyFluentImpl<WatchEventFluent.BuildStrategyObjectNested<N>> implements WatchEventFluent.BuildStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStrategyBuilder builder;
    
            BuildStrategyObjectNestedImpl(BuildStrategy item){
                    this.builder = new BuildStrategyBuilder(this, item);
            }
            BuildStrategyObjectNestedImpl(){
                    this.builder = new BuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildStrategyObject(builder.build());
    }
    public N endBuildStrategyObject(){
            return and();
    }

}
    public class ServiceReferenceObjectNestedImpl<N> extends ServiceReferenceFluentImpl<WatchEventFluent.ServiceReferenceObjectNested<N>> implements WatchEventFluent.ServiceReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceReferenceBuilder builder;
    
            ServiceReferenceObjectNestedImpl(ServiceReference item){
                    this.builder = new ServiceReferenceBuilder(this, item);
            }
            ServiceReferenceObjectNestedImpl(){
                    this.builder = new ServiceReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceReferenceObject(builder.build());
    }
    public N endServiceReferenceObject(){
            return and();
    }

}
    public class StatefulSetSpecObjectNestedImpl<N> extends StatefulSetSpecFluentImpl<WatchEventFluent.StatefulSetSpecObjectNested<N>> implements WatchEventFluent.StatefulSetSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetSpecBuilder builder;
    
            StatefulSetSpecObjectNestedImpl(StatefulSetSpec item){
                    this.builder = new StatefulSetSpecBuilder(this, item);
            }
            StatefulSetSpecObjectNestedImpl(){
                    this.builder = new StatefulSetSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatefulSetSpecObject(builder.build());
    }
    public N endStatefulSetSpecObject(){
            return and();
    }

}
    public class StorageClassObjectNestedImpl<N> extends StorageClassFluentImpl<WatchEventFluent.StorageClassObjectNested<N>> implements WatchEventFluent.StorageClassObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassBuilder builder;
    
            StorageClassObjectNestedImpl(StorageClass item){
                    this.builder = new StorageClassBuilder(this, item);
            }
            StorageClassObjectNestedImpl(){
                    this.builder = new StorageClassBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStorageClassObject(builder.build());
    }
    public N endStorageClassObject(){
            return and();
    }

}
    public class CustomBuildStrategyObjectNestedImpl<N> extends CustomBuildStrategyFluentImpl<WatchEventFluent.CustomBuildStrategyObjectNested<N>> implements WatchEventFluent.CustomBuildStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomBuildStrategyBuilder builder;
    
            CustomBuildStrategyObjectNestedImpl(CustomBuildStrategy item){
                    this.builder = new CustomBuildStrategyBuilder(this, item);
            }
            CustomBuildStrategyObjectNestedImpl(){
                    this.builder = new CustomBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomBuildStrategyObject(builder.build());
    }
    public N endCustomBuildStrategyObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerConditionObjectNestedImpl<N> extends HorizontalPodAutoscalerConditionFluentImpl<WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<N>> implements WatchEventFluent.HorizontalPodAutoscalerConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerConditionBuilder builder;
    
            HorizontalPodAutoscalerConditionObjectNestedImpl(HorizontalPodAutoscalerCondition item){
                    this.builder = new HorizontalPodAutoscalerConditionBuilder(this, item);
            }
            HorizontalPodAutoscalerConditionObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHorizontalPodAutoscalerConditionObject(builder.build());
    }
    public N endHorizontalPodAutoscalerConditionObject(){
            return and();
    }

}
    public class AzureFileVolumeSourceObjectNestedImpl<N> extends AzureFileVolumeSourceFluentImpl<WatchEventFluent.AzureFileVolumeSourceObjectNested<N>> implements WatchEventFluent.AzureFileVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureFileVolumeSourceBuilder builder;
    
            AzureFileVolumeSourceObjectNestedImpl(AzureFileVolumeSource item){
                    this.builder = new AzureFileVolumeSourceBuilder(this, item);
            }
            AzureFileVolumeSourceObjectNestedImpl(){
                    this.builder = new AzureFileVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAzureFileVolumeSourceObject(builder.build());
    }
    public N endAzureFileVolumeSourceObject(){
            return and();
    }

}
    public class ClusterRoleBindingObjectNestedImpl<N> extends ClusterRoleBindingFluentImpl<WatchEventFluent.ClusterRoleBindingObjectNested<N>> implements WatchEventFluent.ClusterRoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingBuilder builder;
    
            ClusterRoleBindingObjectNestedImpl(ClusterRoleBinding item){
                    this.builder = new ClusterRoleBindingBuilder(this, item);
            }
            ClusterRoleBindingObjectNestedImpl(){
                    this.builder = new ClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withClusterRoleBindingObject(builder.build());
    }
    public N endClusterRoleBindingObject(){
            return and();
    }

}
    public class EnvVarObjectNestedImpl<N> extends EnvVarFluentImpl<WatchEventFluent.EnvVarObjectNested<N>> implements WatchEventFluent.EnvVarObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
    
            EnvVarObjectNestedImpl(EnvVar item){
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvVarObjectNestedImpl(){
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEnvVarObject(builder.build());
    }
    public N endEnvVarObject(){
            return and();
    }

}
    public class SubjectAccessReviewResponseObjectNestedImpl<N> extends SubjectAccessReviewResponseFluentImpl<WatchEventFluent.SubjectAccessReviewResponseObjectNested<N>> implements WatchEventFluent.SubjectAccessReviewResponseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewResponseBuilder builder;
    
            SubjectAccessReviewResponseObjectNestedImpl(SubjectAccessReviewResponse item){
                    this.builder = new SubjectAccessReviewResponseBuilder(this, item);
            }
            SubjectAccessReviewResponseObjectNestedImpl(){
                    this.builder = new SubjectAccessReviewResponseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSubjectAccessReviewResponseObject(builder.build());
    }
    public N endSubjectAccessReviewResponseObject(){
            return and();
    }

}
    public class HostPortRangeObjectNestedImpl<N> extends HostPortRangeFluentImpl<WatchEventFluent.HostPortRangeObjectNested<N>> implements WatchEventFluent.HostPortRangeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostPortRangeBuilder builder;
    
            HostPortRangeObjectNestedImpl(HostPortRange item){
                    this.builder = new HostPortRangeBuilder(this, item);
            }
            HostPortRangeObjectNestedImpl(){
                    this.builder = new HostPortRangeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHostPortRangeObject(builder.build());
    }
    public N endHostPortRangeObject(){
            return and();
    }

}
    public class LoadBalancerIngressObjectNestedImpl<N> extends LoadBalancerIngressFluentImpl<WatchEventFluent.LoadBalancerIngressObjectNested<N>> implements WatchEventFluent.LoadBalancerIngressObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LoadBalancerIngressBuilder builder;
    
            LoadBalancerIngressObjectNestedImpl(LoadBalancerIngress item){
                    this.builder = new LoadBalancerIngressBuilder(this, item);
            }
            LoadBalancerIngressObjectNestedImpl(){
                    this.builder = new LoadBalancerIngressBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLoadBalancerIngressObject(builder.build());
    }
    public N endLoadBalancerIngressObject(){
            return and();
    }

}
    public class AttachedVolumeObjectNestedImpl<N> extends AttachedVolumeFluentImpl<WatchEventFluent.AttachedVolumeObjectNested<N>> implements WatchEventFluent.AttachedVolumeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AttachedVolumeBuilder builder;
    
            AttachedVolumeObjectNestedImpl(AttachedVolume item){
                    this.builder = new AttachedVolumeBuilder(this, item);
            }
            AttachedVolumeObjectNestedImpl(){
                    this.builder = new AttachedVolumeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAttachedVolumeObject(builder.build());
    }
    public N endAttachedVolumeObject(){
            return and();
    }

}
    public class LocalObjectReferenceNestedImpl<N> extends LocalObjectReferenceFluentImpl<WatchEventFluent.LocalObjectReferenceNested<N>> implements WatchEventFluent.LocalObjectReferenceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            LocalObjectReferenceNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            LocalObjectReferenceNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLocalObjectReference(builder.build());
    }
    public N endLocalObjectReference(){
            return and();
    }

}
    public class NamedAuthInfoObjectNestedImpl<N> extends NamedAuthInfoFluentImpl<WatchEventFluent.NamedAuthInfoObjectNested<N>> implements WatchEventFluent.NamedAuthInfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedAuthInfoBuilder builder;
    
            NamedAuthInfoObjectNestedImpl(NamedAuthInfo item){
                    this.builder = new NamedAuthInfoBuilder(this, item);
            }
            NamedAuthInfoObjectNestedImpl(){
                    this.builder = new NamedAuthInfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamedAuthInfoObject(builder.build());
    }
    public N endNamedAuthInfoObject(){
            return and();
    }

}
    public class JobConditionObjectNestedImpl<N> extends JobConditionFluentImpl<WatchEventFluent.JobConditionObjectNested<N>> implements WatchEventFluent.JobConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobConditionBuilder builder;
    
            JobConditionObjectNestedImpl(JobCondition item){
                    this.builder = new JobConditionBuilder(this, item);
            }
            JobConditionObjectNestedImpl(){
                    this.builder = new JobConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJobConditionObject(builder.build());
    }
    public N endJobConditionObject(){
            return and();
    }

}
    public class PodSpecObjectNestedImpl<N> extends PodSpecFluentImpl<WatchEventFluent.PodSpecObjectNested<N>> implements WatchEventFluent.PodSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSpecBuilder builder;
    
            PodSpecObjectNestedImpl(PodSpec item){
                    this.builder = new PodSpecBuilder(this, item);
            }
            PodSpecObjectNestedImpl(){
                    this.builder = new PodSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodSpecObject(builder.build());
    }
    public N endPodSpecObject(){
            return and();
    }

}
    public class PreconditionsObjectNestedImpl<N> extends PreconditionsFluentImpl<WatchEventFluent.PreconditionsObjectNested<N>> implements WatchEventFluent.PreconditionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PreconditionsBuilder builder;
    
            PreconditionsObjectNestedImpl(Preconditions item){
                    this.builder = new PreconditionsBuilder(this, item);
            }
            PreconditionsObjectNestedImpl(){
                    this.builder = new PreconditionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPreconditionsObject(builder.build());
    }
    public N endPreconditionsObject(){
            return and();
    }

}
    public class TagReferencePolicyObjectNestedImpl<N> extends TagReferencePolicyFluentImpl<WatchEventFluent.TagReferencePolicyObjectNested<N>> implements WatchEventFluent.TagReferencePolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferencePolicyBuilder builder;
    
            TagReferencePolicyObjectNestedImpl(TagReferencePolicy item){
                    this.builder = new TagReferencePolicyBuilder(this, item);
            }
            TagReferencePolicyObjectNestedImpl(){
                    this.builder = new TagReferencePolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTagReferencePolicyObject(builder.build());
    }
    public N endTagReferencePolicyObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingObjectNestedImpl<N> extends OpenshiftRoleBindingFluentImpl<WatchEventFluent.OpenshiftRoleBindingObjectNested<N>> implements WatchEventFluent.OpenshiftRoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingBuilder builder;
    
            OpenshiftRoleBindingObjectNestedImpl(OpenshiftRoleBinding item){
                    this.builder = new OpenshiftRoleBindingBuilder(this, item);
            }
            OpenshiftRoleBindingObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftRoleBindingObject(builder.build());
    }
    public N endOpenshiftRoleBindingObject(){
            return and();
    }

}
    public class CephFSVolumeSourceObjectNestedImpl<N> extends CephFSVolumeSourceFluentImpl<WatchEventFluent.CephFSVolumeSourceObjectNested<N>> implements WatchEventFluent.CephFSVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CephFSVolumeSourceBuilder builder;
    
            CephFSVolumeSourceObjectNestedImpl(CephFSVolumeSource item){
                    this.builder = new CephFSVolumeSourceBuilder(this, item);
            }
            CephFSVolumeSourceObjectNestedImpl(){
                    this.builder = new CephFSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCephFSVolumeSourceObject(builder.build());
    }
    public N endCephFSVolumeSourceObject(){
            return and();
    }

}
    public class NodeConditionObjectNestedImpl<N> extends NodeConditionFluentImpl<WatchEventFluent.NodeConditionObjectNested<N>> implements WatchEventFluent.NodeConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConditionBuilder builder;
    
            NodeConditionObjectNestedImpl(NodeCondition item){
                    this.builder = new NodeConditionBuilder(this, item);
            }
            NodeConditionObjectNestedImpl(){
                    this.builder = new NodeConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeConditionObject(builder.build());
    }
    public N endNodeConditionObject(){
            return and();
    }

}
    public class EndpointSubsetObjectNestedImpl<N> extends EndpointSubsetFluentImpl<WatchEventFluent.EndpointSubsetObjectNested<N>> implements WatchEventFluent.EndpointSubsetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointSubsetBuilder builder;
    
            EndpointSubsetObjectNestedImpl(EndpointSubset item){
                    this.builder = new EndpointSubsetBuilder(this, item);
            }
            EndpointSubsetObjectNestedImpl(){
                    this.builder = new EndpointSubsetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEndpointSubsetObject(builder.build());
    }
    public N endEndpointSubsetObject(){
            return and();
    }

}
    public class LocalVolumeSourceObjectNestedImpl<N> extends LocalVolumeSourceFluentImpl<WatchEventFluent.LocalVolumeSourceObjectNested<N>> implements WatchEventFluent.LocalVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalVolumeSourceBuilder builder;
    
            LocalVolumeSourceObjectNestedImpl(LocalVolumeSource item){
                    this.builder = new LocalVolumeSourceBuilder(this, item);
            }
            LocalVolumeSourceObjectNestedImpl(){
                    this.builder = new LocalVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLocalVolumeSourceObject(builder.build());
    }
    public N endLocalVolumeSourceObject(){
            return and();
    }

}
    public class CertificateSigningRequestListObjectNestedImpl<N> extends CertificateSigningRequestListFluentImpl<WatchEventFluent.CertificateSigningRequestListObjectNested<N>> implements WatchEventFluent.CertificateSigningRequestListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestListBuilder builder;
    
            CertificateSigningRequestListObjectNestedImpl(CertificateSigningRequestList item){
                    this.builder = new CertificateSigningRequestListBuilder(this, item);
            }
            CertificateSigningRequestListObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCertificateSigningRequestListObject(builder.build());
    }
    public N endCertificateSigningRequestListObject(){
            return and();
    }

}
    public class PodDisruptionBudgetObjectNestedImpl<N> extends PodDisruptionBudgetFluentImpl<WatchEventFluent.PodDisruptionBudgetObjectNested<N>> implements WatchEventFluent.PodDisruptionBudgetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetBuilder builder;
    
            PodDisruptionBudgetObjectNestedImpl(PodDisruptionBudget item){
                    this.builder = new PodDisruptionBudgetBuilder(this, item);
            }
            PodDisruptionBudgetObjectNestedImpl(){
                    this.builder = new PodDisruptionBudgetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodDisruptionBudgetObject(builder.build());
    }
    public N endPodDisruptionBudgetObject(){
            return and();
    }

}
    public class DaemonSetStatusObjectNestedImpl<N> extends DaemonSetStatusFluentImpl<WatchEventFluent.DaemonSetStatusObjectNested<N>> implements WatchEventFluent.DaemonSetStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetStatusBuilder builder;
    
            DaemonSetStatusObjectNestedImpl(DaemonSetStatus item){
                    this.builder = new DaemonSetStatusBuilder(this, item);
            }
            DaemonSetStatusObjectNestedImpl(){
                    this.builder = new DaemonSetStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonSetStatusObject(builder.build());
    }
    public N endDaemonSetStatusObject(){
            return and();
    }

}
    public class ObjectMetricSourceObjectNestedImpl<N> extends ObjectMetricSourceFluentImpl<WatchEventFluent.ObjectMetricSourceObjectNested<N>> implements WatchEventFluent.ObjectMetricSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetricSourceBuilder builder;
    
            ObjectMetricSourceObjectNestedImpl(ObjectMetricSource item){
                    this.builder = new ObjectMetricSourceBuilder(this, item);
            }
            ObjectMetricSourceObjectNestedImpl(){
                    this.builder = new ObjectMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withObjectMetricSourceObject(builder.build());
    }
    public N endObjectMetricSourceObject(){
            return and();
    }

}
    public class BuildStatusOutputObjectNestedImpl<N> extends BuildStatusOutputFluentImpl<WatchEventFluent.BuildStatusOutputObjectNested<N>> implements WatchEventFluent.BuildStatusOutputObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStatusOutputBuilder builder;
    
            BuildStatusOutputObjectNestedImpl(BuildStatusOutput item){
                    this.builder = new BuildStatusOutputBuilder(this, item);
            }
            BuildStatusOutputObjectNestedImpl(){
                    this.builder = new BuildStatusOutputBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildStatusOutputObject(builder.build());
    }
    public N endBuildStatusOutputObject(){
            return and();
    }

}
    public class NetworkPolicyPeerObjectNestedImpl<N> extends NetworkPolicyPeerFluentImpl<WatchEventFluent.NetworkPolicyPeerObjectNested<N>> implements WatchEventFluent.NetworkPolicyPeerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyPeerBuilder builder;
    
            NetworkPolicyPeerObjectNestedImpl(NetworkPolicyPeer item){
                    this.builder = new NetworkPolicyPeerBuilder(this, item);
            }
            NetworkPolicyPeerObjectNestedImpl(){
                    this.builder = new NetworkPolicyPeerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicyPeerObject(builder.build());
    }
    public N endNetworkPolicyPeerObject(){
            return and();
    }

}
    public class ConfigMapNodeConfigSourceObjectNestedImpl<N> extends ConfigMapNodeConfigSourceFluentImpl<WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<N>> implements WatchEventFluent.ConfigMapNodeConfigSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapNodeConfigSourceBuilder builder;
    
            ConfigMapNodeConfigSourceObjectNestedImpl(ConfigMapNodeConfigSource item){
                    this.builder = new ConfigMapNodeConfigSourceBuilder(this, item);
            }
            ConfigMapNodeConfigSourceObjectNestedImpl(){
                    this.builder = new ConfigMapNodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapNodeConfigSourceObject(builder.build());
    }
    public N endConfigMapNodeConfigSourceObject(){
            return and();
    }

}
    public class HTTPGetActionObjectNestedImpl<N> extends HTTPGetActionFluentImpl<WatchEventFluent.HTTPGetActionObjectNested<N>> implements WatchEventFluent.HTTPGetActionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPGetActionBuilder builder;
    
            HTTPGetActionObjectNestedImpl(HTTPGetAction item){
                    this.builder = new HTTPGetActionBuilder(this, item);
            }
            HTTPGetActionObjectNestedImpl(){
                    this.builder = new HTTPGetActionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHTTPGetActionObject(builder.build());
    }
    public N endHTTPGetActionObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleScopeRestrictionObjectNestedImpl<N> extends OpenshiftClusterRoleScopeRestrictionFluentImpl<WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<N>> implements WatchEventFluent.OpenshiftClusterRoleScopeRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleScopeRestrictionBuilder builder;
    
            OpenshiftClusterRoleScopeRestrictionObjectNestedImpl(OpenshiftClusterRoleScopeRestriction item){
                    this.builder = new OpenshiftClusterRoleScopeRestrictionBuilder(this, item);
            }
            OpenshiftClusterRoleScopeRestrictionObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleScopeRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftClusterRoleScopeRestrictionObject(builder.build());
    }
    public N endOpenshiftClusterRoleScopeRestrictionObject(){
            return and();
    }

}
    public class GitLabWebHookCauseObjectNestedImpl<N> extends GitLabWebHookCauseFluentImpl<WatchEventFluent.GitLabWebHookCauseObjectNested<N>> implements WatchEventFluent.GitLabWebHookCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitLabWebHookCauseBuilder builder;
    
            GitLabWebHookCauseObjectNestedImpl(GitLabWebHookCause item){
                    this.builder = new GitLabWebHookCauseBuilder(this, item);
            }
            GitLabWebHookCauseObjectNestedImpl(){
                    this.builder = new GitLabWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGitLabWebHookCauseObject(builder.build());
    }
    public N endGitLabWebHookCauseObject(){
            return and();
    }

}
    public class NetworkPolicyObjectNestedImpl<N> extends NetworkPolicyFluentImpl<WatchEventFluent.NetworkPolicyObjectNested<N>> implements WatchEventFluent.NetworkPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyBuilder builder;
    
            NetworkPolicyObjectNestedImpl(NetworkPolicy item){
                    this.builder = new NetworkPolicyBuilder(this, item);
            }
            NetworkPolicyObjectNestedImpl(){
                    this.builder = new NetworkPolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicyObject(builder.build());
    }
    public N endNetworkPolicyObject(){
            return and();
    }

}
    public class SecretBuildSourceObjectNestedImpl<N> extends SecretBuildSourceFluentImpl<WatchEventFluent.SecretBuildSourceObjectNested<N>> implements WatchEventFluent.SecretBuildSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuildSourceBuilder builder;
    
            SecretBuildSourceObjectNestedImpl(SecretBuildSource item){
                    this.builder = new SecretBuildSourceBuilder(this, item);
            }
            SecretBuildSourceObjectNestedImpl(){
                    this.builder = new SecretBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretBuildSourceObject(builder.build());
    }
    public N endSecretBuildSourceObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingObjectNestedImpl<N> extends OpenshiftClusterRoleBindingFluentImpl<WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<N>> implements WatchEventFluent.OpenshiftClusterRoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingBuilder builder;
    
            OpenshiftClusterRoleBindingObjectNestedImpl(OpenshiftClusterRoleBinding item){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this, item);
            }
            OpenshiftClusterRoleBindingObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftClusterRoleBindingObject(builder.build());
    }
    public N endOpenshiftClusterRoleBindingObject(){
            return and();
    }

}
    public class DaemonSetSpecObjectNestedImpl<N> extends DaemonSetSpecFluentImpl<WatchEventFluent.DaemonSetSpecObjectNested<N>> implements WatchEventFluent.DaemonSetSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetSpecBuilder builder;
    
            DaemonSetSpecObjectNestedImpl(DaemonSetSpec item){
                    this.builder = new DaemonSetSpecBuilder(this, item);
            }
            DaemonSetSpecObjectNestedImpl(){
                    this.builder = new DaemonSetSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonSetSpecObject(builder.build());
    }
    public N endDaemonSetSpecObject(){
            return and();
    }

}
    public class SELinuxStrategyOptionsObjectNestedImpl<N> extends SELinuxStrategyOptionsFluentImpl<WatchEventFluent.SELinuxStrategyOptionsObjectNested<N>> implements WatchEventFluent.SELinuxStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxStrategyOptionsBuilder builder;
    
            SELinuxStrategyOptionsObjectNestedImpl(SELinuxStrategyOptions item){
                    this.builder = new SELinuxStrategyOptionsBuilder(this, item);
            }
            SELinuxStrategyOptionsObjectNestedImpl(){
                    this.builder = new SELinuxStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSELinuxStrategyOptionsObject(builder.build());
    }
    public N endSELinuxStrategyOptionsObject(){
            return and();
    }

}
    public class JobStatusObjectNestedImpl<N> extends JobStatusFluentImpl<WatchEventFluent.JobStatusObjectNested<N>> implements WatchEventFluent.JobStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobStatusBuilder builder;
    
            JobStatusObjectNestedImpl(JobStatus item){
                    this.builder = new JobStatusBuilder(this, item);
            }
            JobStatusObjectNestedImpl(){
                    this.builder = new JobStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJobStatusObject(builder.build());
    }
    public N endJobStatusObject(){
            return and();
    }

}
    public class ObjectMetricStatusObjectNestedImpl<N> extends ObjectMetricStatusFluentImpl<WatchEventFluent.ObjectMetricStatusObjectNested<N>> implements WatchEventFluent.ObjectMetricStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetricStatusBuilder builder;
    
            ObjectMetricStatusObjectNestedImpl(ObjectMetricStatus item){
                    this.builder = new ObjectMetricStatusBuilder(this, item);
            }
            ObjectMetricStatusObjectNestedImpl(){
                    this.builder = new ObjectMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withObjectMetricStatusObject(builder.build());
    }
    public N endObjectMetricStatusObject(){
            return and();
    }

}
    public class BitbucketWebHookCauseObjectNestedImpl<N> extends BitbucketWebHookCauseFluentImpl<WatchEventFluent.BitbucketWebHookCauseObjectNested<N>> implements WatchEventFluent.BitbucketWebHookCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BitbucketWebHookCauseBuilder builder;
    
            BitbucketWebHookCauseObjectNestedImpl(BitbucketWebHookCause item){
                    this.builder = new BitbucketWebHookCauseBuilder(this, item);
            }
            BitbucketWebHookCauseObjectNestedImpl(){
                    this.builder = new BitbucketWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBitbucketWebHookCauseObject(builder.build());
    }
    public N endBitbucketWebHookCauseObject(){
            return and();
    }

}
    public class ProjectListObjectNestedImpl<N> extends ProjectListFluentImpl<WatchEventFluent.ProjectListObjectNested<N>> implements WatchEventFluent.ProjectListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectListBuilder builder;
    
            ProjectListObjectNestedImpl(ProjectList item){
                    this.builder = new ProjectListBuilder(this, item);
            }
            ProjectListObjectNestedImpl(){
                    this.builder = new ProjectListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProjectListObject(builder.build());
    }
    public N endProjectListObject(){
            return and();
    }

}
    public class PodSecurityPolicySpecObjectNestedImpl<N> extends PodSecurityPolicySpecFluentImpl<WatchEventFluent.PodSecurityPolicySpecObjectNested<N>> implements WatchEventFluent.PodSecurityPolicySpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicySpecBuilder builder;
    
            PodSecurityPolicySpecObjectNestedImpl(PodSecurityPolicySpec item){
                    this.builder = new PodSecurityPolicySpecBuilder(this, item);
            }
            PodSecurityPolicySpecObjectNestedImpl(){
                    this.builder = new PodSecurityPolicySpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodSecurityPolicySpecObject(builder.build());
    }
    public N endPodSecurityPolicySpecObject(){
            return and();
    }

}
    public class RoleBindingListObjectNestedImpl<N> extends RoleBindingListFluentImpl<WatchEventFluent.RoleBindingListObjectNested<N>> implements WatchEventFluent.RoleBindingListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingListBuilder builder;
    
            RoleBindingListObjectNestedImpl(RoleBindingList item){
                    this.builder = new RoleBindingListBuilder(this, item);
            }
            RoleBindingListObjectNestedImpl(){
                    this.builder = new RoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRoleBindingListObject(builder.build());
    }
    public N endRoleBindingListObject(){
            return and();
    }

}
    public class EnvFromSourceObjectNestedImpl<N> extends EnvFromSourceFluentImpl<WatchEventFluent.EnvFromSourceObjectNested<N>> implements WatchEventFluent.EnvFromSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvFromSourceBuilder builder;
    
            EnvFromSourceObjectNestedImpl(EnvFromSource item){
                    this.builder = new EnvFromSourceBuilder(this, item);
            }
            EnvFromSourceObjectNestedImpl(){
                    this.builder = new EnvFromSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEnvFromSourceObject(builder.build());
    }
    public N endEnvFromSourceObject(){
            return and();
    }

}
    public class NamespaceSpecObjectNestedImpl<N> extends NamespaceSpecFluentImpl<WatchEventFluent.NamespaceSpecObjectNested<N>> implements WatchEventFluent.NamespaceSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceSpecBuilder builder;
    
            NamespaceSpecObjectNestedImpl(NamespaceSpec item){
                    this.builder = new NamespaceSpecBuilder(this, item);
            }
            NamespaceSpecObjectNestedImpl(){
                    this.builder = new NamespaceSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamespaceSpecObject(builder.build());
    }
    public N endNamespaceSpecObject(){
            return and();
    }

}
    public class RouteObjectNestedImpl<N> extends RouteFluentImpl<WatchEventFluent.RouteObjectNested<N>> implements WatchEventFluent.RouteObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteBuilder builder;
    
            RouteObjectNestedImpl(Route item){
                    this.builder = new RouteBuilder(this, item);
            }
            RouteObjectNestedImpl(){
                    this.builder = new RouteBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteObject(builder.build());
    }
    public N endRouteObject(){
            return and();
    }

}
    public class TypeMetaObjectNestedImpl<N> extends TypeMetaFluentImpl<WatchEventFluent.TypeMetaObjectNested<N>> implements WatchEventFluent.TypeMetaObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TypeMetaBuilder builder;
    
            TypeMetaObjectNestedImpl(TypeMeta item){
                    this.builder = new TypeMetaBuilder(this, item);
            }
            TypeMetaObjectNestedImpl(){
                    this.builder = new TypeMetaBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTypeMetaObject(builder.build());
    }
    public N endTypeMetaObject(){
            return and();
    }

}
    public class IngressBackendObjectNestedImpl<N> extends IngressBackendFluentImpl<WatchEventFluent.IngressBackendObjectNested<N>> implements WatchEventFluent.IngressBackendObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBackendBuilder builder;
    
            IngressBackendObjectNestedImpl(IngressBackend item){
                    this.builder = new IngressBackendBuilder(this, item);
            }
            IngressBackendObjectNestedImpl(){
                    this.builder = new IngressBackendBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressBackendObject(builder.build());
    }
    public N endIngressBackendObject(){
            return and();
    }

}
    public class FlexVolumeSourceObjectNestedImpl<N> extends FlexVolumeSourceFluentImpl<WatchEventFluent.FlexVolumeSourceObjectNested<N>> implements WatchEventFluent.FlexVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlexVolumeSourceBuilder builder;
    
            FlexVolumeSourceObjectNestedImpl(FlexVolumeSource item){
                    this.builder = new FlexVolumeSourceBuilder(this, item);
            }
            FlexVolumeSourceObjectNestedImpl(){
                    this.builder = new FlexVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withFlexVolumeSourceObject(builder.build());
    }
    public N endFlexVolumeSourceObject(){
            return and();
    }

}
    public class RBDVolumeSourceObjectNestedImpl<N> extends RBDVolumeSourceFluentImpl<WatchEventFluent.RBDVolumeSourceObjectNested<N>> implements WatchEventFluent.RBDVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RBDVolumeSourceBuilder builder;
    
            RBDVolumeSourceObjectNestedImpl(RBDVolumeSource item){
                    this.builder = new RBDVolumeSourceBuilder(this, item);
            }
            RBDVolumeSourceObjectNestedImpl(){
                    this.builder = new RBDVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRBDVolumeSourceObject(builder.build());
    }
    public N endRBDVolumeSourceObject(){
            return and();
    }

}
    public class ResourceQuotaListObjectNestedImpl<N> extends ResourceQuotaListFluentImpl<WatchEventFluent.ResourceQuotaListObjectNested<N>> implements WatchEventFluent.ResourceQuotaListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaListBuilder builder;
    
            ResourceQuotaListObjectNestedImpl(ResourceQuotaList item){
                    this.builder = new ResourceQuotaListBuilder(this, item);
            }
            ResourceQuotaListObjectNestedImpl(){
                    this.builder = new ResourceQuotaListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceQuotaListObject(builder.build());
    }
    public N endResourceQuotaListObject(){
            return and();
    }

}
    public class NodeConfigStatusObjectNestedImpl<N> extends NodeConfigStatusFluentImpl<WatchEventFluent.NodeConfigStatusObjectNested<N>> implements WatchEventFluent.NodeConfigStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigStatusBuilder builder;
    
            NodeConfigStatusObjectNestedImpl(NodeConfigStatus item){
                    this.builder = new NodeConfigStatusBuilder(this, item);
            }
            NodeConfigStatusObjectNestedImpl(){
                    this.builder = new NodeConfigStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeConfigStatusObject(builder.build());
    }
    public N endNodeConfigStatusObject(){
            return and();
    }

}
    public class NetworkPolicyListObjectNestedImpl<N> extends NetworkPolicyListFluentImpl<WatchEventFluent.NetworkPolicyListObjectNested<N>> implements WatchEventFluent.NetworkPolicyListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyListBuilder builder;
    
            NetworkPolicyListObjectNestedImpl(NetworkPolicyList item){
                    this.builder = new NetworkPolicyListBuilder(this, item);
            }
            NetworkPolicyListObjectNestedImpl(){
                    this.builder = new NetworkPolicyListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicyListObject(builder.build());
    }
    public N endNetworkPolicyListObject(){
            return and();
    }

}
    public class AdmissionResponseObjectNestedImpl<N> extends AdmissionResponseFluentImpl<WatchEventFluent.AdmissionResponseObjectNested<N>> implements WatchEventFluent.AdmissionResponseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionResponseBuilder builder;
    
            AdmissionResponseObjectNestedImpl(AdmissionResponse item){
                    this.builder = new AdmissionResponseBuilder(this, item);
            }
            AdmissionResponseObjectNestedImpl(){
                    this.builder = new AdmissionResponseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAdmissionResponseObject(builder.build());
    }
    public N endAdmissionResponseObject(){
            return and();
    }

}
    public class AdmissionRequestObjectNestedImpl<N> extends AdmissionRequestFluentImpl<WatchEventFluent.AdmissionRequestObjectNested<N>> implements WatchEventFluent.AdmissionRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionRequestBuilder builder;
    
            AdmissionRequestObjectNestedImpl(AdmissionRequest item){
                    this.builder = new AdmissionRequestBuilder(this, item);
            }
            AdmissionRequestObjectNestedImpl(){
                    this.builder = new AdmissionRequestBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAdmissionRequestObject(builder.build());
    }
    public N endAdmissionRequestObject(){
            return and();
    }

}
    public class RawExtensionObjectNestedImpl<N> extends RawExtensionFluentImpl<WatchEventFluent.RawExtensionObjectNested<N>> implements WatchEventFluent.RawExtensionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RawExtensionBuilder builder;
    
            RawExtensionObjectNestedImpl(RawExtension item){
                    this.builder = new RawExtensionBuilder(this, item);
            }
            RawExtensionObjectNestedImpl(){
                    this.builder = new RawExtensionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRawExtensionObject(builder.build());
    }
    public N endRawExtensionObject(){
            return and();
    }

}
    public class SecurityContextConstraintsListObjectNestedImpl<N> extends SecurityContextConstraintsListFluentImpl<WatchEventFluent.SecurityContextConstraintsListObjectNested<N>> implements WatchEventFluent.SecurityContextConstraintsListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsListBuilder builder;
    
            SecurityContextConstraintsListObjectNestedImpl(SecurityContextConstraintsList item){
                    this.builder = new SecurityContextConstraintsListBuilder(this, item);
            }
            SecurityContextConstraintsListObjectNestedImpl(){
                    this.builder = new SecurityContextConstraintsListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecurityContextConstraintsListObject(builder.build());
    }
    public N endSecurityContextConstraintsListObject(){
            return and();
    }

}
    public class BuildConfigListObjectNestedImpl<N> extends BuildConfigListFluentImpl<WatchEventFluent.BuildConfigListObjectNested<N>> implements WatchEventFluent.BuildConfigListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigListBuilder builder;
    
            BuildConfigListObjectNestedImpl(BuildConfigList item){
                    this.builder = new BuildConfigListBuilder(this, item);
            }
            BuildConfigListObjectNestedImpl(){
                    this.builder = new BuildConfigListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildConfigListObject(builder.build());
    }
    public N endBuildConfigListObject(){
            return and();
    }

}
    public class IdentityListObjectNestedImpl<N> extends IdentityListFluentImpl<WatchEventFluent.IdentityListObjectNested<N>> implements WatchEventFluent.IdentityListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityListBuilder builder;
    
            IdentityListObjectNestedImpl(IdentityList item){
                    this.builder = new IdentityListBuilder(this, item);
            }
            IdentityListObjectNestedImpl(){
                    this.builder = new IdentityListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIdentityListObject(builder.build());
    }
    public N endIdentityListObject(){
            return and();
    }

}
    public class ConfigMapProjectionObjectNestedImpl<N> extends ConfigMapProjectionFluentImpl<WatchEventFluent.ConfigMapProjectionObjectNested<N>> implements WatchEventFluent.ConfigMapProjectionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapProjectionBuilder builder;
    
            ConfigMapProjectionObjectNestedImpl(ConfigMapProjection item){
                    this.builder = new ConfigMapProjectionBuilder(this, item);
            }
            ConfigMapProjectionObjectNestedImpl(){
                    this.builder = new ConfigMapProjectionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapProjectionObject(builder.build());
    }
    public N endConfigMapProjectionObject(){
            return and();
    }

}
    public class CustomResourceDefinitionSpecObjectNestedImpl<N> extends CustomResourceDefinitionSpecFluentImpl<WatchEventFluent.CustomResourceDefinitionSpecObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionSpecBuilder builder;
    
            CustomResourceDefinitionSpecObjectNestedImpl(CustomResourceDefinitionSpec item){
                    this.builder = new CustomResourceDefinitionSpecBuilder(this, item);
            }
            CustomResourceDefinitionSpecObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionSpecObject(builder.build());
    }
    public N endCustomResourceDefinitionSpecObject(){
            return and();
    }

}
    public class NamespaceObjectNestedImpl<N> extends NamespaceFluentImpl<WatchEventFluent.NamespaceObjectNested<N>> implements WatchEventFluent.NamespaceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceBuilder builder;
    
            NamespaceObjectNestedImpl(Namespace item){
                    this.builder = new NamespaceBuilder(this, item);
            }
            NamespaceObjectNestedImpl(){
                    this.builder = new NamespaceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamespaceObject(builder.build());
    }
    public N endNamespaceObject(){
            return and();
    }

}
    public class ContainerStateTerminatedObjectNestedImpl<N> extends ContainerStateTerminatedFluentImpl<WatchEventFluent.ContainerStateTerminatedObjectNested<N>> implements WatchEventFluent.ContainerStateTerminatedObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateTerminatedBuilder builder;
    
            ContainerStateTerminatedObjectNestedImpl(ContainerStateTerminated item){
                    this.builder = new ContainerStateTerminatedBuilder(this, item);
            }
            ContainerStateTerminatedObjectNestedImpl(){
                    this.builder = new ContainerStateTerminatedBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerStateTerminatedObject(builder.build());
    }
    public N endContainerStateTerminatedObject(){
            return and();
    }

}
    public class GroupVersionKindObjectNestedImpl<N> extends GroupVersionKindFluentImpl<WatchEventFluent.GroupVersionKindObjectNested<N>> implements WatchEventFluent.GroupVersionKindObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupVersionKindBuilder builder;
    
            GroupVersionKindObjectNestedImpl(GroupVersionKind item){
                    this.builder = new GroupVersionKindBuilder(this, item);
            }
            GroupVersionKindObjectNestedImpl(){
                    this.builder = new GroupVersionKindBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGroupVersionKindObject(builder.build());
    }
    public N endGroupVersionKindObject(){
            return and();
    }

}
    public class RunAsUserStrategyOptionsObjectNestedImpl<N> extends RunAsUserStrategyOptionsFluentImpl<WatchEventFluent.RunAsUserStrategyOptionsObjectNested<N>> implements WatchEventFluent.RunAsUserStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RunAsUserStrategyOptionsBuilder builder;
    
            RunAsUserStrategyOptionsObjectNestedImpl(RunAsUserStrategyOptions item){
                    this.builder = new RunAsUserStrategyOptionsBuilder(this, item);
            }
            RunAsUserStrategyOptionsObjectNestedImpl(){
                    this.builder = new RunAsUserStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRunAsUserStrategyOptionsObject(builder.build());
    }
    public N endRunAsUserStrategyOptionsObject(){
            return and();
    }

}
    public class LimitRangeSpecObjectNestedImpl<N> extends LimitRangeSpecFluentImpl<WatchEventFluent.LimitRangeSpecObjectNested<N>> implements WatchEventFluent.LimitRangeSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeSpecBuilder builder;
    
            LimitRangeSpecObjectNestedImpl(LimitRangeSpec item){
                    this.builder = new LimitRangeSpecBuilder(this, item);
            }
            LimitRangeSpecObjectNestedImpl(){
                    this.builder = new LimitRangeSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLimitRangeSpecObject(builder.build());
    }
    public N endLimitRangeSpecObject(){
            return and();
    }

}
    public class SourceControlUserObjectNestedImpl<N> extends SourceControlUserFluentImpl<WatchEventFluent.SourceControlUserObjectNested<N>> implements WatchEventFluent.SourceControlUserObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceControlUserBuilder builder;
    
            SourceControlUserObjectNestedImpl(SourceControlUser item){
                    this.builder = new SourceControlUserBuilder(this, item);
            }
            SourceControlUserObjectNestedImpl(){
                    this.builder = new SourceControlUserBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSourceControlUserObject(builder.build());
    }
    public N endSourceControlUserObject(){
            return and();
    }

}
    public class ContainerStateObjectNestedImpl<N> extends ContainerStateFluentImpl<WatchEventFluent.ContainerStateObjectNested<N>> implements WatchEventFluent.ContainerStateObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateBuilder builder;
    
            ContainerStateObjectNestedImpl(ContainerState item){
                    this.builder = new ContainerStateBuilder(this, item);
            }
            ContainerStateObjectNestedImpl(){
                    this.builder = new ContainerStateBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerStateObject(builder.build());
    }
    public N endContainerStateObject(){
            return and();
    }

}
    public class UserInfoObjectNestedImpl<N> extends UserInfoFluentImpl<WatchEventFluent.UserInfoObjectNested<N>> implements WatchEventFluent.UserInfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserInfoBuilder builder;
    
            UserInfoObjectNestedImpl(UserInfo item){
                    this.builder = new UserInfoBuilder(this, item);
            }
            UserInfoObjectNestedImpl(){
                    this.builder = new UserInfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withUserInfoObject(builder.build());
    }
    public N endUserInfoObject(){
            return and();
    }

}
    public class PersistentVolumeClaimStatusObjectNestedImpl<N> extends PersistentVolumeClaimStatusFluentImpl<WatchEventFluent.PersistentVolumeClaimStatusObjectNested<N>> implements WatchEventFluent.PersistentVolumeClaimStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimStatusBuilder builder;
    
            PersistentVolumeClaimStatusObjectNestedImpl(PersistentVolumeClaimStatus item){
                    this.builder = new PersistentVolumeClaimStatusBuilder(this, item);
            }
            PersistentVolumeClaimStatusObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeClaimStatusObject(builder.build());
    }
    public N endPersistentVolumeClaimStatusObject(){
            return and();
    }

}
    public class ServiceSpecObjectNestedImpl<N> extends ServiceSpecFluentImpl<WatchEventFluent.ServiceSpecObjectNested<N>> implements WatchEventFluent.ServiceSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceSpecBuilder builder;
    
            ServiceSpecObjectNestedImpl(ServiceSpec item){
                    this.builder = new ServiceSpecBuilder(this, item);
            }
            ServiceSpecObjectNestedImpl(){
                    this.builder = new ServiceSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceSpecObject(builder.build());
    }
    public N endServiceSpecObject(){
            return and();
    }

}
    public class PhotonPersistentDiskVolumeSourceObjectNestedImpl<N> extends PhotonPersistentDiskVolumeSourceFluentImpl<WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<N>> implements WatchEventFluent.PhotonPersistentDiskVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PhotonPersistentDiskVolumeSourceBuilder builder;
    
            PhotonPersistentDiskVolumeSourceObjectNestedImpl(PhotonPersistentDiskVolumeSource item){
                    this.builder = new PhotonPersistentDiskVolumeSourceBuilder(this, item);
            }
            PhotonPersistentDiskVolumeSourceObjectNestedImpl(){
                    this.builder = new PhotonPersistentDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPhotonPersistentDiskVolumeSourceObject(builder.build());
    }
    public N endPhotonPersistentDiskVolumeSourceObject(){
            return and();
    }

}
    public class IngressRuleObjectNestedImpl<N> extends IngressRuleFluentImpl<WatchEventFluent.IngressRuleObjectNested<N>> implements WatchEventFluent.IngressRuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressRuleBuilder builder;
    
            IngressRuleObjectNestedImpl(IngressRule item){
                    this.builder = new IngressRuleBuilder(this, item);
            }
            IngressRuleObjectNestedImpl(){
                    this.builder = new IngressRuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressRuleObject(builder.build());
    }
    public N endIngressRuleObject(){
            return and();
    }

}
    public class IngressStatusObjectNestedImpl<N> extends IngressStatusFluentImpl<WatchEventFluent.IngressStatusObjectNested<N>> implements WatchEventFluent.IngressStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressStatusBuilder builder;
    
            IngressStatusObjectNestedImpl(IngressStatus item){
                    this.builder = new IngressStatusBuilder(this, item);
            }
            IngressStatusObjectNestedImpl(){
                    this.builder = new IngressStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressStatusObject(builder.build());
    }
    public N endIngressStatusObject(){
            return and();
    }

}
    public class ImageStreamListObjectNestedImpl<N> extends ImageStreamListFluentImpl<WatchEventFluent.ImageStreamListObjectNested<N>> implements WatchEventFluent.ImageStreamListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamListBuilder builder;
    
            ImageStreamListObjectNestedImpl(ImageStreamList item){
                    this.builder = new ImageStreamListBuilder(this, item);
            }
            ImageStreamListObjectNestedImpl(){
                    this.builder = new ImageStreamListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamListObject(builder.build());
    }
    public N endImageStreamListObject(){
            return and();
    }

}
    public class NodeSpecObjectNestedImpl<N> extends NodeSpecFluentImpl<WatchEventFluent.NodeSpecObjectNested<N>> implements WatchEventFluent.NodeSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSpecBuilder builder;
    
            NodeSpecObjectNestedImpl(NodeSpec item){
                    this.builder = new NodeSpecBuilder(this, item);
            }
            NodeSpecObjectNestedImpl(){
                    this.builder = new NodeSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeSpecObject(builder.build());
    }
    public N endNodeSpecObject(){
            return and();
    }

}
    public class LocalSubjectAccessReviewObjectNestedImpl<N> extends LocalSubjectAccessReviewFluentImpl<WatchEventFluent.LocalSubjectAccessReviewObjectNested<N>> implements WatchEventFluent.LocalSubjectAccessReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalSubjectAccessReviewBuilder builder;
    
            LocalSubjectAccessReviewObjectNestedImpl(LocalSubjectAccessReview item){
                    this.builder = new LocalSubjectAccessReviewBuilder(this, item);
            }
            LocalSubjectAccessReviewObjectNestedImpl(){
                    this.builder = new LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLocalSubjectAccessReviewObject(builder.build());
    }
    public N endLocalSubjectAccessReviewObject(){
            return and();
    }

}
    public class SecretListObjectNestedImpl<N> extends SecretListFluentImpl<WatchEventFluent.SecretListObjectNested<N>> implements WatchEventFluent.SecretListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretListBuilder builder;
    
            SecretListObjectNestedImpl(SecretList item){
                    this.builder = new SecretListBuilder(this, item);
            }
            SecretListObjectNestedImpl(){
                    this.builder = new SecretListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretListObject(builder.build());
    }
    public N endSecretListObject(){
            return and();
    }

}
    public class NodeAddressObjectNestedImpl<N> extends NodeAddressFluentImpl<WatchEventFluent.NodeAddressObjectNested<N>> implements WatchEventFluent.NodeAddressObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeAddressBuilder builder;
    
            NodeAddressObjectNestedImpl(NodeAddress item){
                    this.builder = new NodeAddressBuilder(this, item);
            }
            NodeAddressObjectNestedImpl(){
                    this.builder = new NodeAddressBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeAddressObject(builder.build());
    }
    public N endNodeAddressObject(){
            return and();
    }

}
    public class PodAffinityObjectNestedImpl<N> extends PodAffinityFluentImpl<WatchEventFluent.PodAffinityObjectNested<N>> implements WatchEventFluent.PodAffinityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAffinityBuilder builder;
    
            PodAffinityObjectNestedImpl(PodAffinity item){
                    this.builder = new PodAffinityBuilder(this, item);
            }
            PodAffinityObjectNestedImpl(){
                    this.builder = new PodAffinityBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodAffinityObject(builder.build());
    }
    public N endPodAffinityObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerListObjectNestedImpl<N> extends HorizontalPodAutoscalerListFluentImpl<WatchEventFluent.HorizontalPodAutoscalerListObjectNested<N>> implements WatchEventFluent.HorizontalPodAutoscalerListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerListBuilder builder;
    
            HorizontalPodAutoscalerListObjectNestedImpl(HorizontalPodAutoscalerList item){
                    this.builder = new HorizontalPodAutoscalerListBuilder(this, item);
            }
            HorizontalPodAutoscalerListObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHorizontalPodAutoscalerListObject(builder.build());
    }
    public N endHorizontalPodAutoscalerListObject(){
            return and();
    }

}
    public class ServiceObjectNestedImpl<N> extends ServiceFluentImpl<WatchEventFluent.ServiceObjectNested<N>> implements WatchEventFluent.ServiceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceBuilder builder;
    
            ServiceObjectNestedImpl(Service item){
                    this.builder = new ServiceBuilder(this, item);
            }
            ServiceObjectNestedImpl(){
                    this.builder = new ServiceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceObject(builder.build());
    }
    public N endServiceObject(){
            return and();
    }

}
    public class ExecEnvVarObjectNestedImpl<N> extends ExecEnvVarFluentImpl<WatchEventFluent.ExecEnvVarObjectNested<N>> implements WatchEventFluent.ExecEnvVarObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecEnvVarBuilder builder;
    
            ExecEnvVarObjectNestedImpl(ExecEnvVar item){
                    this.builder = new ExecEnvVarBuilder(this, item);
            }
            ExecEnvVarObjectNestedImpl(){
                    this.builder = new ExecEnvVarBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExecEnvVarObject(builder.build());
    }
    public N endExecEnvVarObject(){
            return and();
    }

}
    public class DeploymentStatusObjectNestedImpl<N> extends DeploymentStatusFluentImpl<WatchEventFluent.DeploymentStatusObjectNested<N>> implements WatchEventFluent.DeploymentStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentStatusBuilder builder;
    
            DeploymentStatusObjectNestedImpl(DeploymentStatus item){
                    this.builder = new DeploymentStatusBuilder(this, item);
            }
            DeploymentStatusObjectNestedImpl(){
                    this.builder = new DeploymentStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentStatusObject(builder.build());
    }
    public N endDeploymentStatusObject(){
            return and();
    }

}
    public class EventSeriesObjectNestedImpl<N> extends EventSeriesFluentImpl<WatchEventFluent.EventSeriesObjectNested<N>> implements WatchEventFluent.EventSeriesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventSeriesBuilder builder;
    
            EventSeriesObjectNestedImpl(EventSeries item){
                    this.builder = new EventSeriesBuilder(this, item);
            }
            EventSeriesObjectNestedImpl(){
                    this.builder = new EventSeriesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEventSeriesObject(builder.build());
    }
    public N endEventSeriesObject(){
            return and();
    }

}
    public class InitializersObjectNestedImpl<N> extends InitializersFluentImpl<WatchEventFluent.InitializersObjectNested<N>> implements WatchEventFluent.InitializersObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InitializersBuilder builder;
    
            InitializersObjectNestedImpl(Initializers item){
                    this.builder = new InitializersBuilder(this, item);
            }
            InitializersObjectNestedImpl(){
                    this.builder = new InitializersBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withInitializersObject(builder.build());
    }
    public N endInitializersObject(){
            return and();
    }

}
    public class ContainerImageObjectNestedImpl<N> extends ContainerImageFluentImpl<WatchEventFluent.ContainerImageObjectNested<N>> implements WatchEventFluent.ContainerImageObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerImageBuilder builder;
    
            ContainerImageObjectNestedImpl(ContainerImage item){
                    this.builder = new ContainerImageBuilder(this, item);
            }
            ContainerImageObjectNestedImpl(){
                    this.builder = new ContainerImageBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerImageObject(builder.build());
    }
    public N endContainerImageObject(){
            return and();
    }

}
    public class NodeStatusObjectNestedImpl<N> extends NodeStatusFluentImpl<WatchEventFluent.NodeStatusObjectNested<N>> implements WatchEventFluent.NodeStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeStatusBuilder builder;
    
            NodeStatusObjectNestedImpl(NodeStatus item){
                    this.builder = new NodeStatusBuilder(this, item);
            }
            NodeStatusObjectNestedImpl(){
                    this.builder = new NodeStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeStatusObject(builder.build());
    }
    public N endNodeStatusObject(){
            return and();
    }

}
    public class ReplicationControllerObjectNestedImpl<N> extends ReplicationControllerFluentImpl<WatchEventFluent.ReplicationControllerObjectNested<N>> implements WatchEventFluent.ReplicationControllerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerBuilder builder;
    
            ReplicationControllerObjectNestedImpl(ReplicationController item){
                    this.builder = new ReplicationControllerBuilder(this, item);
            }
            ReplicationControllerObjectNestedImpl(){
                    this.builder = new ReplicationControllerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicationControllerObject(builder.build());
    }
    public N endReplicationControllerObject(){
            return and();
    }

}
    public class ConfigMapListObjectNestedImpl<N> extends ConfigMapListFluentImpl<WatchEventFluent.ConfigMapListObjectNested<N>> implements WatchEventFluent.ConfigMapListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapListBuilder builder;
    
            ConfigMapListObjectNestedImpl(ConfigMapList item){
                    this.builder = new ConfigMapListBuilder(this, item);
            }
            ConfigMapListObjectNestedImpl(){
                    this.builder = new ConfigMapListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapListObject(builder.build());
    }
    public N endConfigMapListObject(){
            return and();
    }

}
    public class SubjectAccessReviewObjectNestedImpl<N> extends SubjectAccessReviewFluentImpl<WatchEventFluent.SubjectAccessReviewObjectNested<N>> implements WatchEventFluent.SubjectAccessReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewBuilder builder;
    
            SubjectAccessReviewObjectNestedImpl(SubjectAccessReview item){
                    this.builder = new SubjectAccessReviewBuilder(this, item);
            }
            SubjectAccessReviewObjectNestedImpl(){
                    this.builder = new SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSubjectAccessReviewObject(builder.build());
    }
    public N endSubjectAccessReviewObject(){
            return and();
    }

}
    public class PreferredSchedulingTermObjectNestedImpl<N> extends PreferredSchedulingTermFluentImpl<WatchEventFluent.PreferredSchedulingTermObjectNested<N>> implements WatchEventFluent.PreferredSchedulingTermObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PreferredSchedulingTermBuilder builder;
    
            PreferredSchedulingTermObjectNestedImpl(PreferredSchedulingTerm item){
                    this.builder = new PreferredSchedulingTermBuilder(this, item);
            }
            PreferredSchedulingTermObjectNestedImpl(){
                    this.builder = new PreferredSchedulingTermBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPreferredSchedulingTermObject(builder.build());
    }
    public N endPreferredSchedulingTermObject(){
            return and();
    }

}
    public class ExternalDocumentationObjectNestedImpl<N> extends ExternalDocumentationFluentImpl<WatchEventFluent.ExternalDocumentationObjectNested<N>> implements WatchEventFluent.ExternalDocumentationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExternalDocumentationBuilder builder;
    
            ExternalDocumentationObjectNestedImpl(ExternalDocumentation item){
                    this.builder = new ExternalDocumentationBuilder(this, item);
            }
            ExternalDocumentationObjectNestedImpl(){
                    this.builder = new ExternalDocumentationBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExternalDocumentationObject(builder.build());
    }
    public N endExternalDocumentationObject(){
            return and();
    }

}
    public class ImageLookupPolicyObjectNestedImpl<N> extends ImageLookupPolicyFluentImpl<WatchEventFluent.ImageLookupPolicyObjectNested<N>> implements WatchEventFluent.ImageLookupPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLookupPolicyBuilder builder;
    
            ImageLookupPolicyObjectNestedImpl(ImageLookupPolicy item){
                    this.builder = new ImageLookupPolicyBuilder(this, item);
            }
            ImageLookupPolicyObjectNestedImpl(){
                    this.builder = new ImageLookupPolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageLookupPolicyObject(builder.build());
    }
    public N endImageLookupPolicyObject(){
            return and();
    }

}
    public class MutatingWebhookConfigurationListObjectNestedImpl<N> extends MutatingWebhookConfigurationListFluentImpl<WatchEventFluent.MutatingWebhookConfigurationListObjectNested<N>> implements WatchEventFluent.MutatingWebhookConfigurationListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationListBuilder builder;
    
            MutatingWebhookConfigurationListObjectNestedImpl(MutatingWebhookConfigurationList item){
                    this.builder = new MutatingWebhookConfigurationListBuilder(this, item);
            }
            MutatingWebhookConfigurationListObjectNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withMutatingWebhookConfigurationListObject(builder.build());
    }
    public N endMutatingWebhookConfigurationListObject(){
            return and();
    }

}
    public class ModelAllowedFlexVolumeObjectNestedImpl<N> extends io.fabric8.openshift.api.model.AllowedFlexVolumeFluentImpl<WatchEventFluent.ModelAllowedFlexVolumeObjectNested<N>> implements WatchEventFluent.ModelAllowedFlexVolumeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder;
    
            ModelAllowedFlexVolumeObjectNestedImpl(io.fabric8.openshift.api.model.AllowedFlexVolume item){
                    this.builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(this, item);
            }
            ModelAllowedFlexVolumeObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAllowedFlexVolumeObject(builder.build());
    }
    public N endModelAllowedFlexVolumeObject(){
            return and();
    }

}
    public class ModelSubjectAccessReviewObjectNestedImpl<N> extends io.fabric8.openshift.api.model.SubjectAccessReviewFluentImpl<WatchEventFluent.ModelSubjectAccessReviewObjectNested<N>> implements WatchEventFluent.ModelSubjectAccessReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.SubjectAccessReviewBuilder builder;
    
            ModelSubjectAccessReviewObjectNestedImpl(io.fabric8.openshift.api.model.SubjectAccessReview item){
                    this.builder = new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder(this, item);
            }
            ModelSubjectAccessReviewObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.SubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSubjectAccessReviewObject(builder.build());
    }
    public N endModelSubjectAccessReviewObject(){
            return and();
    }

}
    public class PodPresetListObjectNestedImpl<N> extends PodPresetListFluentImpl<WatchEventFluent.PodPresetListObjectNested<N>> implements WatchEventFluent.PodPresetListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetListBuilder builder;
    
            PodPresetListObjectNestedImpl(PodPresetList item){
                    this.builder = new PodPresetListBuilder(this, item);
            }
            PodPresetListObjectNestedImpl(){
                    this.builder = new PodPresetListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodPresetListObject(builder.build());
    }
    public N endPodPresetListObject(){
            return and();
    }

}
    public class MutatingWebhookConfigurationObjectNestedImpl<N> extends MutatingWebhookConfigurationFluentImpl<WatchEventFluent.MutatingWebhookConfigurationObjectNested<N>> implements WatchEventFluent.MutatingWebhookConfigurationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MutatingWebhookConfigurationBuilder builder;
    
            MutatingWebhookConfigurationObjectNestedImpl(MutatingWebhookConfiguration item){
                    this.builder = new MutatingWebhookConfigurationBuilder(this, item);
            }
            MutatingWebhookConfigurationObjectNestedImpl(){
                    this.builder = new MutatingWebhookConfigurationBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withMutatingWebhookConfigurationObject(builder.build());
    }
    public N endMutatingWebhookConfigurationObject(){
            return and();
    }

}
    public class VolumeMountObjectNestedImpl<N> extends VolumeMountFluentImpl<WatchEventFluent.VolumeMountObjectNested<N>> implements WatchEventFluent.VolumeMountObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeMountBuilder builder;
    
            VolumeMountObjectNestedImpl(VolumeMount item){
                    this.builder = new VolumeMountBuilder(this, item);
            }
            VolumeMountObjectNestedImpl(){
                    this.builder = new VolumeMountBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withVolumeMountObject(builder.build());
    }
    public N endVolumeMountObject(){
            return and();
    }

}
    public class LabelSelectorObjectNestedImpl<N> extends LabelSelectorFluentImpl<WatchEventFluent.LabelSelectorObjectNested<N>> implements WatchEventFluent.LabelSelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            LabelSelectorObjectNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            LabelSelectorObjectNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLabelSelectorObject(builder.build());
    }
    public N endLabelSelectorObject(){
            return and();
    }

}
    public class CronJobStatusObjectNestedImpl<N> extends CronJobStatusFluentImpl<WatchEventFluent.CronJobStatusObjectNested<N>> implements WatchEventFluent.CronJobStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobStatusBuilder builder;
    
            CronJobStatusObjectNestedImpl(CronJobStatus item){
                    this.builder = new CronJobStatusBuilder(this, item);
            }
            CronJobStatusObjectNestedImpl(){
                    this.builder = new CronJobStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCronJobStatusObject(builder.build());
    }
    public N endCronJobStatusObject(){
            return and();
    }

}
    public class BuildSpecObjectNestedImpl<N> extends BuildSpecFluentImpl<WatchEventFluent.BuildSpecObjectNested<N>> implements WatchEventFluent.BuildSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildSpecBuilder builder;
    
            BuildSpecObjectNestedImpl(BuildSpec item){
                    this.builder = new BuildSpecBuilder(this, item);
            }
            BuildSpecObjectNestedImpl(){
                    this.builder = new BuildSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildSpecObject(builder.build());
    }
    public N endBuildSpecObject(){
            return and();
    }

}
    public class StatusCauseObjectNestedImpl<N> extends StatusCauseFluentImpl<WatchEventFluent.StatusCauseObjectNested<N>> implements WatchEventFluent.StatusCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusCauseBuilder builder;
    
            StatusCauseObjectNestedImpl(StatusCause item){
                    this.builder = new StatusCauseBuilder(this, item);
            }
            StatusCauseObjectNestedImpl(){
                    this.builder = new StatusCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatusCauseObject(builder.build());
    }
    public N endStatusCauseObject(){
            return and();
    }

}
    public class ProjectStatusObjectNestedImpl<N> extends ProjectStatusFluentImpl<WatchEventFluent.ProjectStatusObjectNested<N>> implements WatchEventFluent.ProjectStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectStatusBuilder builder;
    
            ProjectStatusObjectNestedImpl(ProjectStatus item){
                    this.builder = new ProjectStatusBuilder(this, item);
            }
            ProjectStatusObjectNestedImpl(){
                    this.builder = new ProjectStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProjectStatusObject(builder.build());
    }
    public N endProjectStatusObject(){
            return and();
    }

}
    public class NamedClusterObjectNestedImpl<N> extends NamedClusterFluentImpl<WatchEventFluent.NamedClusterObjectNested<N>> implements WatchEventFluent.NamedClusterObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedClusterBuilder builder;
    
            NamedClusterObjectNestedImpl(NamedCluster item){
                    this.builder = new NamedClusterBuilder(this, item);
            }
            NamedClusterObjectNestedImpl(){
                    this.builder = new NamedClusterBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamedClusterObject(builder.build());
    }
    public N endNamedClusterObject(){
            return and();
    }

}
    public class GitSourceRevisionObjectNestedImpl<N> extends GitSourceRevisionFluentImpl<WatchEventFluent.GitSourceRevisionObjectNested<N>> implements WatchEventFluent.GitSourceRevisionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitSourceRevisionBuilder builder;
    
            GitSourceRevisionObjectNestedImpl(GitSourceRevision item){
                    this.builder = new GitSourceRevisionBuilder(this, item);
            }
            GitSourceRevisionObjectNestedImpl(){
                    this.builder = new GitSourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGitSourceRevisionObject(builder.build());
    }
    public N endGitSourceRevisionObject(){
            return and();
    }

}
    public class StatusDetailsObjectNestedImpl<N> extends StatusDetailsFluentImpl<WatchEventFluent.StatusDetailsObjectNested<N>> implements WatchEventFluent.StatusDetailsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusDetailsBuilder builder;
    
            StatusDetailsObjectNestedImpl(StatusDetails item){
                    this.builder = new StatusDetailsBuilder(this, item);
            }
            StatusDetailsObjectNestedImpl(){
                    this.builder = new StatusDetailsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatusDetailsObject(builder.build());
    }
    public N endStatusDetailsObject(){
            return and();
    }

}
    public class ImageChangeTriggerObjectNestedImpl<N> extends ImageChangeTriggerFluentImpl<WatchEventFluent.ImageChangeTriggerObjectNested<N>> implements WatchEventFluent.ImageChangeTriggerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageChangeTriggerBuilder builder;
    
            ImageChangeTriggerObjectNestedImpl(ImageChangeTrigger item){
                    this.builder = new ImageChangeTriggerBuilder(this, item);
            }
            ImageChangeTriggerObjectNestedImpl(){
                    this.builder = new ImageChangeTriggerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageChangeTriggerObject(builder.build());
    }
    public N endImageChangeTriggerObject(){
            return and();
    }

}
    public class SysctlObjectNestedImpl<N> extends SysctlFluentImpl<WatchEventFluent.SysctlObjectNested<N>> implements WatchEventFluent.SysctlObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SysctlBuilder builder;
    
            SysctlObjectNestedImpl(Sysctl item){
                    this.builder = new SysctlBuilder(this, item);
            }
            SysctlObjectNestedImpl(){
                    this.builder = new SysctlBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSysctlObject(builder.build());
    }
    public N endSysctlObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerObjectNestedImpl<N> extends HorizontalPodAutoscalerFluentImpl<WatchEventFluent.HorizontalPodAutoscalerObjectNested<N>> implements WatchEventFluent.HorizontalPodAutoscalerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerBuilder builder;
    
            HorizontalPodAutoscalerObjectNestedImpl(HorizontalPodAutoscaler item){
                    this.builder = new HorizontalPodAutoscalerBuilder(this, item);
            }
            HorizontalPodAutoscalerObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHorizontalPodAutoscalerObject(builder.build());
    }
    public N endHorizontalPodAutoscalerObject(){
            return and();
    }

}
    public class ImageStreamImportSpecObjectNestedImpl<N> extends ImageStreamImportSpecFluentImpl<WatchEventFluent.ImageStreamImportSpecObjectNested<N>> implements WatchEventFluent.ImageStreamImportSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportSpecBuilder builder;
    
            ImageStreamImportSpecObjectNestedImpl(ImageStreamImportSpec item){
                    this.builder = new ImageStreamImportSpecBuilder(this, item);
            }
            ImageStreamImportSpecObjectNestedImpl(){
                    this.builder = new ImageStreamImportSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamImportSpecObject(builder.build());
    }
    public N endImageStreamImportSpecObject(){
            return and();
    }

}
    public class ModelFSGroupStrategyOptionsObjectNestedImpl<N> extends io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluentImpl<WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<N>> implements WatchEventFluent.ModelFSGroupStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder builder;
    
            ModelFSGroupStrategyOptionsObjectNestedImpl(io.fabric8.openshift.api.model.FSGroupStrategyOptions item){
                    this.builder = new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder(this, item);
            }
            ModelFSGroupStrategyOptionsObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withFSGroupStrategyOptionsObject(builder.build());
    }
    public N endModelFSGroupStrategyOptionsObject(){
            return and();
    }

}
    public class ScaleObjectNestedImpl<N> extends ScaleFluentImpl<WatchEventFluent.ScaleObjectNested<N>> implements WatchEventFluent.ScaleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleBuilder builder;
    
            ScaleObjectNestedImpl(Scale item){
                    this.builder = new ScaleBuilder(this, item);
            }
            ScaleObjectNestedImpl(){
                    this.builder = new ScaleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScaleObject(builder.build());
    }
    public N endScaleObject(){
            return and();
    }

}
    public class StatusObjectNestedImpl<N> extends StatusFluentImpl<WatchEventFluent.StatusObjectNested<N>> implements WatchEventFluent.StatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusBuilder builder;
    
            StatusObjectNestedImpl(Status item){
                    this.builder = new StatusBuilder(this, item);
            }
            StatusObjectNestedImpl(){
                    this.builder = new StatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatusObject(builder.build());
    }
    public N endStatusObject(){
            return and();
    }

}
    public class DeleteOptionsObjectNestedImpl<N> extends DeleteOptionsFluentImpl<WatchEventFluent.DeleteOptionsObjectNested<N>> implements WatchEventFluent.DeleteOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeleteOptionsBuilder builder;
    
            DeleteOptionsObjectNestedImpl(DeleteOptions item){
                    this.builder = new DeleteOptionsBuilder(this, item);
            }
            DeleteOptionsObjectNestedImpl(){
                    this.builder = new DeleteOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeleteOptionsObject(builder.build());
    }
    public N endDeleteOptionsObject(){
            return and();
    }

}
    public class ContainerStatusObjectNestedImpl<N> extends ContainerStatusFluentImpl<WatchEventFluent.ContainerStatusObjectNested<N>> implements WatchEventFluent.ContainerStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStatusBuilder builder;
    
            ContainerStatusObjectNestedImpl(ContainerStatus item){
                    this.builder = new ContainerStatusBuilder(this, item);
            }
            ContainerStatusObjectNestedImpl(){
                    this.builder = new ContainerStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerStatusObject(builder.build());
    }
    public N endContainerStatusObject(){
            return and();
    }

}
    public class ConfigMapEnvSourceObjectNestedImpl<N> extends ConfigMapEnvSourceFluentImpl<WatchEventFluent.ConfigMapEnvSourceObjectNested<N>> implements WatchEventFluent.ConfigMapEnvSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapEnvSourceBuilder builder;
    
            ConfigMapEnvSourceObjectNestedImpl(ConfigMapEnvSource item){
                    this.builder = new ConfigMapEnvSourceBuilder(this, item);
            }
            ConfigMapEnvSourceObjectNestedImpl(){
                    this.builder = new ConfigMapEnvSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapEnvSourceObject(builder.build());
    }
    public N endConfigMapEnvSourceObject(){
            return and();
    }

}
    public class DeploymentSpecObjectNestedImpl<N> extends DeploymentSpecFluentImpl<WatchEventFluent.DeploymentSpecObjectNested<N>> implements WatchEventFluent.DeploymentSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentSpecBuilder builder;
    
            DeploymentSpecObjectNestedImpl(DeploymentSpec item){
                    this.builder = new DeploymentSpecBuilder(this, item);
            }
            DeploymentSpecObjectNestedImpl(){
                    this.builder = new DeploymentSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentSpecObject(builder.build());
    }
    public N endDeploymentSpecObject(){
            return and();
    }

}
    public class CertificateSigningRequestStatusObjectNestedImpl<N> extends CertificateSigningRequestStatusFluentImpl<WatchEventFluent.CertificateSigningRequestStatusObjectNested<N>> implements WatchEventFluent.CertificateSigningRequestStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestStatusBuilder builder;
    
            CertificateSigningRequestStatusObjectNestedImpl(CertificateSigningRequestStatus item){
                    this.builder = new CertificateSigningRequestStatusBuilder(this, item);
            }
            CertificateSigningRequestStatusObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCertificateSigningRequestStatusObject(builder.build());
    }
    public N endCertificateSigningRequestStatusObject(){
            return and();
    }

}
    public class NodeSelectorRequirementObjectNestedImpl<N> extends NodeSelectorRequirementFluentImpl<WatchEventFluent.NodeSelectorRequirementObjectNested<N>> implements WatchEventFluent.NodeSelectorRequirementObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorRequirementBuilder builder;
    
            NodeSelectorRequirementObjectNestedImpl(NodeSelectorRequirement item){
                    this.builder = new NodeSelectorRequirementBuilder(this, item);
            }
            NodeSelectorRequirementObjectNestedImpl(){
                    this.builder = new NodeSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeSelectorRequirementObject(builder.build());
    }
    public N endNodeSelectorRequirementObject(){
            return and();
    }

}
    public class RecreateDeploymentStrategyParamsObjectNestedImpl<N> extends RecreateDeploymentStrategyParamsFluentImpl<WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<N>> implements WatchEventFluent.RecreateDeploymentStrategyParamsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RecreateDeploymentStrategyParamsBuilder builder;
    
            RecreateDeploymentStrategyParamsObjectNestedImpl(RecreateDeploymentStrategyParams item){
                    this.builder = new RecreateDeploymentStrategyParamsBuilder(this, item);
            }
            RecreateDeploymentStrategyParamsObjectNestedImpl(){
                    this.builder = new RecreateDeploymentStrategyParamsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRecreateDeploymentStrategyParamsObject(builder.build());
    }
    public N endRecreateDeploymentStrategyParamsObject(){
            return and();
    }

}
    public class DockerStrategyOptionsObjectNestedImpl<N> extends DockerStrategyOptionsFluentImpl<WatchEventFluent.DockerStrategyOptionsObjectNested<N>> implements WatchEventFluent.DockerStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DockerStrategyOptionsBuilder builder;
    
            DockerStrategyOptionsObjectNestedImpl(DockerStrategyOptions item){
                    this.builder = new DockerStrategyOptionsBuilder(this, item);
            }
            DockerStrategyOptionsObjectNestedImpl(){
                    this.builder = new DockerStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDockerStrategyOptionsObject(builder.build());
    }
    public N endDockerStrategyOptionsObject(){
            return and();
    }

}
    public class ImageListObjectNestedImpl<N> extends ImageListFluentImpl<WatchEventFluent.ImageListObjectNested<N>> implements WatchEventFluent.ImageListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageListBuilder builder;
    
            ImageListObjectNestedImpl(ImageList item){
                    this.builder = new ImageListBuilder(this, item);
            }
            ImageListObjectNestedImpl(){
                    this.builder = new ImageListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageListObject(builder.build());
    }
    public N endImageListObject(){
            return and();
    }

}
    public class ConfigMapBuildSourceObjectNestedImpl<N> extends ConfigMapBuildSourceFluentImpl<WatchEventFluent.ConfigMapBuildSourceObjectNested<N>> implements WatchEventFluent.ConfigMapBuildSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuildSourceBuilder builder;
    
            ConfigMapBuildSourceObjectNestedImpl(ConfigMapBuildSource item){
                    this.builder = new ConfigMapBuildSourceBuilder(this, item);
            }
            ConfigMapBuildSourceObjectNestedImpl(){
                    this.builder = new ConfigMapBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapBuildSourceObject(builder.build());
    }
    public N endConfigMapBuildSourceObject(){
            return and();
    }

}
    public class ReplicaSetListObjectNestedImpl<N> extends ReplicaSetListFluentImpl<WatchEventFluent.ReplicaSetListObjectNested<N>> implements WatchEventFluent.ReplicaSetListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetListBuilder builder;
    
            ReplicaSetListObjectNestedImpl(ReplicaSetList item){
                    this.builder = new ReplicaSetListBuilder(this, item);
            }
            ReplicaSetListObjectNestedImpl(){
                    this.builder = new ReplicaSetListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicaSetListObject(builder.build());
    }
    public N endReplicaSetListObject(){
            return and();
    }

}
    public class PodTemplateListObjectNestedImpl<N> extends PodTemplateListFluentImpl<WatchEventFluent.PodTemplateListObjectNested<N>> implements WatchEventFluent.PodTemplateListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateListBuilder builder;
    
            PodTemplateListObjectNestedImpl(PodTemplateList item){
                    this.builder = new PodTemplateListBuilder(this, item);
            }
            PodTemplateListObjectNestedImpl(){
                    this.builder = new PodTemplateListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodTemplateListObject(builder.build());
    }
    public N endPodTemplateListObject(){
            return and();
    }

}
    public class ImageObjectNestedImpl<N> extends ImageFluentImpl<WatchEventFluent.ImageObjectNested<N>> implements WatchEventFluent.ImageObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageObjectNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageObjectNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageObject(builder.build());
    }
    public N endImageObject(){
            return and();
    }

}
    public class TLSConfigObjectNestedImpl<N> extends TLSConfigFluentImpl<WatchEventFluent.TLSConfigObjectNested<N>> implements WatchEventFluent.TLSConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TLSConfigBuilder builder;
    
            TLSConfigObjectNestedImpl(TLSConfig item){
                    this.builder = new TLSConfigBuilder(this, item);
            }
            TLSConfigObjectNestedImpl(){
                    this.builder = new TLSConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTLSConfigObject(builder.build());
    }
    public N endTLSConfigObject(){
            return and();
    }

}
    public class EndpointAddressObjectNestedImpl<N> extends EndpointAddressFluentImpl<WatchEventFluent.EndpointAddressObjectNested<N>> implements WatchEventFluent.EndpointAddressObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointAddressBuilder builder;
    
            EndpointAddressObjectNestedImpl(EndpointAddress item){
                    this.builder = new EndpointAddressBuilder(this, item);
            }
            EndpointAddressObjectNestedImpl(){
                    this.builder = new EndpointAddressBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEndpointAddressObject(builder.build());
    }
    public N endEndpointAddressObject(){
            return and();
    }

}
    public class BuildStatusObjectNestedImpl<N> extends BuildStatusFluentImpl<WatchEventFluent.BuildStatusObjectNested<N>> implements WatchEventFluent.BuildStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStatusBuilder builder;
    
            BuildStatusObjectNestedImpl(BuildStatus item){
                    this.builder = new BuildStatusBuilder(this, item);
            }
            BuildStatusObjectNestedImpl(){
                    this.builder = new BuildStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildStatusObject(builder.build());
    }
    public N endBuildStatusObject(){
            return and();
    }

}
    public class CustomResourceDefinitionConditionObjectNestedImpl<N> extends CustomResourceDefinitionConditionFluentImpl<WatchEventFluent.CustomResourceDefinitionConditionObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionConditionBuilder builder;
    
            CustomResourceDefinitionConditionObjectNestedImpl(CustomResourceDefinitionCondition item){
                    this.builder = new CustomResourceDefinitionConditionBuilder(this, item);
            }
            CustomResourceDefinitionConditionObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionConditionObject(builder.build());
    }
    public N endCustomResourceDefinitionConditionObject(){
            return and();
    }

}
    public class NodeConfigSourceObjectNestedImpl<N> extends NodeConfigSourceFluentImpl<WatchEventFluent.NodeConfigSourceObjectNested<N>> implements WatchEventFluent.NodeConfigSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigSourceBuilder builder;
    
            NodeConfigSourceObjectNestedImpl(NodeConfigSource item){
                    this.builder = new NodeConfigSourceBuilder(this, item);
            }
            NodeConfigSourceObjectNestedImpl(){
                    this.builder = new NodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeConfigSourceObject(builder.build());
    }
    public N endNodeConfigSourceObject(){
            return and();
    }

}
    public class ImageSourceObjectNestedImpl<N> extends ImageSourceFluentImpl<WatchEventFluent.ImageSourceObjectNested<N>> implements WatchEventFluent.ImageSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSourceBuilder builder;
    
            ImageSourceObjectNestedImpl(ImageSource item){
                    this.builder = new ImageSourceBuilder(this, item);
            }
            ImageSourceObjectNestedImpl(){
                    this.builder = new ImageSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageSourceObject(builder.build());
    }
    public N endImageSourceObject(){
            return and();
    }

}
    public class VsphereVirtualDiskVolumeSourceObjectNestedImpl<N> extends VsphereVirtualDiskVolumeSourceFluentImpl<WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<N>> implements WatchEventFluent.VsphereVirtualDiskVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VsphereVirtualDiskVolumeSourceBuilder builder;
    
            VsphereVirtualDiskVolumeSourceObjectNestedImpl(VsphereVirtualDiskVolumeSource item){
                    this.builder = new VsphereVirtualDiskVolumeSourceBuilder(this, item);
            }
            VsphereVirtualDiskVolumeSourceObjectNestedImpl(){
                    this.builder = new VsphereVirtualDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withVsphereVirtualDiskVolumeSourceObject(builder.build());
    }
    public N endVsphereVirtualDiskVolumeSourceObject(){
            return and();
    }

}
    public class RuleObjectNestedImpl<N> extends RuleFluentImpl<WatchEventFluent.RuleObjectNested<N>> implements WatchEventFluent.RuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RuleBuilder builder;
    
            RuleObjectNestedImpl(Rule item){
                    this.builder = new RuleBuilder(this, item);
            }
            RuleObjectNestedImpl(){
                    this.builder = new RuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRuleObject(builder.build());
    }
    public N endRuleObject(){
            return and();
    }

}
    public class TagReferenceObjectNestedImpl<N> extends TagReferenceFluentImpl<WatchEventFluent.TagReferenceObjectNested<N>> implements WatchEventFluent.TagReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferenceBuilder builder;
    
            TagReferenceObjectNestedImpl(TagReference item){
                    this.builder = new TagReferenceBuilder(this, item);
            }
            TagReferenceObjectNestedImpl(){
                    this.builder = new TagReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTagReferenceObject(builder.build());
    }
    public N endTagReferenceObject(){
            return and();
    }

}
    public class CrossVersionObjectReferenceNestedImpl<N> extends CrossVersionObjectReferenceFluentImpl<WatchEventFluent.CrossVersionObjectReferenceNested<N>> implements WatchEventFluent.CrossVersionObjectReferenceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CrossVersionObjectReferenceBuilder builder;
    
            CrossVersionObjectReferenceNestedImpl(CrossVersionObjectReference item){
                    this.builder = new CrossVersionObjectReferenceBuilder(this, item);
            }
            CrossVersionObjectReferenceNestedImpl(){
                    this.builder = new CrossVersionObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCrossVersionObjectReference(builder.build());
    }
    public N endCrossVersionObjectReference(){
            return and();
    }

}
    public class LabelSelectorRequirementObjectNestedImpl<N> extends LabelSelectorRequirementFluentImpl<WatchEventFluent.LabelSelectorRequirementObjectNested<N>> implements WatchEventFluent.LabelSelectorRequirementObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorRequirementBuilder builder;
    
            LabelSelectorRequirementObjectNestedImpl(LabelSelectorRequirement item){
                    this.builder = new LabelSelectorRequirementBuilder(this, item);
            }
            LabelSelectorRequirementObjectNestedImpl(){
                    this.builder = new LabelSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLabelSelectorRequirementObject(builder.build());
    }
    public N endLabelSelectorRequirementObject(){
            return and();
    }

}
    public class CustomResourceSubresourcesObjectNestedImpl<N> extends CustomResourceSubresourcesFluentImpl<WatchEventFluent.CustomResourceSubresourcesObjectNested<N>> implements WatchEventFluent.CustomResourceSubresourcesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourcesBuilder builder;
    
            CustomResourceSubresourcesObjectNestedImpl(CustomResourceSubresources item){
                    this.builder = new CustomResourceSubresourcesBuilder(this, item);
            }
            CustomResourceSubresourcesObjectNestedImpl(){
                    this.builder = new CustomResourceSubresourcesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceSubresourcesObject(builder.build());
    }
    public N endCustomResourceSubresourcesObject(){
            return and();
    }

}
    public class DaemonSetUpdateStrategyObjectNestedImpl<N> extends DaemonSetUpdateStrategyFluentImpl<WatchEventFluent.DaemonSetUpdateStrategyObjectNested<N>> implements WatchEventFluent.DaemonSetUpdateStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetUpdateStrategyBuilder builder;
    
            DaemonSetUpdateStrategyObjectNestedImpl(DaemonSetUpdateStrategy item){
                    this.builder = new DaemonSetUpdateStrategyBuilder(this, item);
            }
            DaemonSetUpdateStrategyObjectNestedImpl(){
                    this.builder = new DaemonSetUpdateStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonSetUpdateStrategyObject(builder.build());
    }
    public N endDaemonSetUpdateStrategyObject(){
            return and();
    }

}
    public class ReplicaSetObjectNestedImpl<N> extends ReplicaSetFluentImpl<WatchEventFluent.ReplicaSetObjectNested<N>> implements WatchEventFluent.ReplicaSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetBuilder builder;
    
            ReplicaSetObjectNestedImpl(ReplicaSet item){
                    this.builder = new ReplicaSetBuilder(this, item);
            }
            ReplicaSetObjectNestedImpl(){
                    this.builder = new ReplicaSetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicaSetObject(builder.build());
    }
    public N endReplicaSetObject(){
            return and();
    }

}
    public class GitRepoVolumeSourceObjectNestedImpl<N> extends GitRepoVolumeSourceFluentImpl<WatchEventFluent.GitRepoVolumeSourceObjectNested<N>> implements WatchEventFluent.GitRepoVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitRepoVolumeSourceBuilder builder;
    
            GitRepoVolumeSourceObjectNestedImpl(GitRepoVolumeSource item){
                    this.builder = new GitRepoVolumeSourceBuilder(this, item);
            }
            GitRepoVolumeSourceObjectNestedImpl(){
                    this.builder = new GitRepoVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGitRepoVolumeSourceObject(builder.build());
    }
    public N endGitRepoVolumeSourceObject(){
            return and();
    }

}
    public class AggregationRuleObjectNestedImpl<N> extends AggregationRuleFluentImpl<WatchEventFluent.AggregationRuleObjectNested<N>> implements WatchEventFluent.AggregationRuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AggregationRuleBuilder builder;
    
            AggregationRuleObjectNestedImpl(AggregationRule item){
                    this.builder = new AggregationRuleBuilder(this, item);
            }
            AggregationRuleObjectNestedImpl(){
                    this.builder = new AggregationRuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAggregationRuleObject(builder.build());
    }
    public N endAggregationRuleObject(){
            return and();
    }

}
    public class EndpointsListObjectNestedImpl<N> extends EndpointsListFluentImpl<WatchEventFluent.EndpointsListObjectNested<N>> implements WatchEventFluent.EndpointsListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsListBuilder builder;
    
            EndpointsListObjectNestedImpl(EndpointsList item){
                    this.builder = new EndpointsListBuilder(this, item);
            }
            EndpointsListObjectNestedImpl(){
                    this.builder = new EndpointsListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEndpointsListObject(builder.build());
    }
    public N endEndpointsListObject(){
            return and();
    }

}
    public class GroupVersionResourceObjectNestedImpl<N> extends GroupVersionResourceFluentImpl<WatchEventFluent.GroupVersionResourceObjectNested<N>> implements WatchEventFluent.GroupVersionResourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupVersionResourceBuilder builder;
    
            GroupVersionResourceObjectNestedImpl(GroupVersionResource item){
                    this.builder = new GroupVersionResourceBuilder(this, item);
            }
            GroupVersionResourceObjectNestedImpl(){
                    this.builder = new GroupVersionResourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGroupVersionResourceObject(builder.build());
    }
    public N endGroupVersionResourceObject(){
            return and();
    }

}
    public class BuildSourceObjectNestedImpl<N> extends BuildSourceFluentImpl<WatchEventFluent.BuildSourceObjectNested<N>> implements WatchEventFluent.BuildSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildSourceBuilder builder;
    
            BuildSourceObjectNestedImpl(BuildSource item){
                    this.builder = new BuildSourceBuilder(this, item);
            }
            BuildSourceObjectNestedImpl(){
                    this.builder = new BuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildSourceObject(builder.build());
    }
    public N endBuildSourceObject(){
            return and();
    }

}
    public class PodSecurityPolicyObjectNestedImpl<N> extends PodSecurityPolicyFluentImpl<WatchEventFluent.PodSecurityPolicyObjectNested<N>> implements WatchEventFluent.PodSecurityPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyBuilder builder;
    
            PodSecurityPolicyObjectNestedImpl(PodSecurityPolicy item){
                    this.builder = new PodSecurityPolicyBuilder(this, item);
            }
            PodSecurityPolicyObjectNestedImpl(){
                    this.builder = new PodSecurityPolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodSecurityPolicyObject(builder.build());
    }
    public N endPodSecurityPolicyObject(){
            return and();
    }

}
    public class CronJobObjectNestedImpl<N> extends CronJobFluentImpl<WatchEventFluent.CronJobObjectNested<N>> implements WatchEventFluent.CronJobObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
    
            CronJobObjectNestedImpl(CronJob item){
                    this.builder = new CronJobBuilder(this, item);
            }
            CronJobObjectNestedImpl(){
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCronJobObject(builder.build());
    }
    public N endCronJobObject(){
            return and();
    }

}
    public class TopologySelectorTermObjectNestedImpl<N> extends TopologySelectorTermFluentImpl<WatchEventFluent.TopologySelectorTermObjectNested<N>> implements WatchEventFluent.TopologySelectorTermObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TopologySelectorTermBuilder builder;
    
            TopologySelectorTermObjectNestedImpl(TopologySelectorTerm item){
                    this.builder = new TopologySelectorTermBuilder(this, item);
            }
            TopologySelectorTermObjectNestedImpl(){
                    this.builder = new TopologySelectorTermBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTopologySelectorTermObject(builder.build());
    }
    public N endTopologySelectorTermObject(){
            return and();
    }

}
    public class CustomResourceSubresourceScaleObjectNestedImpl<N> extends CustomResourceSubresourceScaleFluentImpl<WatchEventFluent.CustomResourceSubresourceScaleObjectNested<N>> implements WatchEventFluent.CustomResourceSubresourceScaleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourceScaleBuilder builder;
    
            CustomResourceSubresourceScaleObjectNestedImpl(CustomResourceSubresourceScale item){
                    this.builder = new CustomResourceSubresourceScaleBuilder(this, item);
            }
            CustomResourceSubresourceScaleObjectNestedImpl(){
                    this.builder = new CustomResourceSubresourceScaleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceSubresourceScaleObject(builder.build());
    }
    public N endCustomResourceSubresourceScaleObject(){
            return and();
    }

}
    public class StorageOSPersistentVolumeSourceObjectNestedImpl<N> extends StorageOSPersistentVolumeSourceFluentImpl<WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.StorageOSPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageOSPersistentVolumeSourceBuilder builder;
    
            StorageOSPersistentVolumeSourceObjectNestedImpl(StorageOSPersistentVolumeSource item){
                    this.builder = new StorageOSPersistentVolumeSourceBuilder(this, item);
            }
            StorageOSPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new StorageOSPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStorageOSPersistentVolumeSourceObject(builder.build());
    }
    public N endStorageOSPersistentVolumeSourceObject(){
            return and();
    }

}
    public class CertificateSigningRequestSpecObjectNestedImpl<N> extends CertificateSigningRequestSpecFluentImpl<WatchEventFluent.CertificateSigningRequestSpecObjectNested<N>> implements WatchEventFluent.CertificateSigningRequestSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestSpecBuilder builder;
    
            CertificateSigningRequestSpecObjectNestedImpl(CertificateSigningRequestSpec item){
                    this.builder = new CertificateSigningRequestSpecBuilder(this, item);
            }
            CertificateSigningRequestSpecObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCertificateSigningRequestSpecObject(builder.build());
    }
    public N endCertificateSigningRequestSpecObject(){
            return and();
    }

}
    public class SecurityContextObjectNestedImpl<N> extends SecurityContextFluentImpl<WatchEventFluent.SecurityContextObjectNested<N>> implements WatchEventFluent.SecurityContextObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextBuilder builder;
    
            SecurityContextObjectNestedImpl(SecurityContext item){
                    this.builder = new SecurityContextBuilder(this, item);
            }
            SecurityContextObjectNestedImpl(){
                    this.builder = new SecurityContextBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecurityContextObject(builder.build());
    }
    public N endSecurityContextObject(){
            return and();
    }

}
    public class ConfigMapVolumeSourceObjectNestedImpl<N> extends ConfigMapVolumeSourceFluentImpl<WatchEventFluent.ConfigMapVolumeSourceObjectNested<N>> implements WatchEventFluent.ConfigMapVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapVolumeSourceBuilder builder;
    
            ConfigMapVolumeSourceObjectNestedImpl(ConfigMapVolumeSource item){
                    this.builder = new ConfigMapVolumeSourceBuilder(this, item);
            }
            ConfigMapVolumeSourceObjectNestedImpl(){
                    this.builder = new ConfigMapVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapVolumeSourceObject(builder.build());
    }
    public N endConfigMapVolumeSourceObject(){
            return and();
    }

}
    public class ComponentStatusListObjectNestedImpl<N> extends ComponentStatusListFluentImpl<WatchEventFluent.ComponentStatusListObjectNested<N>> implements WatchEventFluent.ComponentStatusListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusListBuilder builder;
    
            ComponentStatusListObjectNestedImpl(ComponentStatusList item){
                    this.builder = new ComponentStatusListBuilder(this, item);
            }
            ComponentStatusListObjectNestedImpl(){
                    this.builder = new ComponentStatusListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withComponentStatusListObject(builder.build());
    }
    public N endComponentStatusListObject(){
            return and();
    }

}
    public class GitBuildSourceObjectNestedImpl<N> extends GitBuildSourceFluentImpl<WatchEventFluent.GitBuildSourceObjectNested<N>> implements WatchEventFluent.GitBuildSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitBuildSourceBuilder builder;
    
            GitBuildSourceObjectNestedImpl(GitBuildSource item){
                    this.builder = new GitBuildSourceBuilder(this, item);
            }
            GitBuildSourceObjectNestedImpl(){
                    this.builder = new GitBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGitBuildSourceObject(builder.build());
    }
    public N endGitBuildSourceObject(){
            return and();
    }

}
    public class FlockerVolumeSourceObjectNestedImpl<N> extends FlockerVolumeSourceFluentImpl<WatchEventFluent.FlockerVolumeSourceObjectNested<N>> implements WatchEventFluent.FlockerVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlockerVolumeSourceBuilder builder;
    
            FlockerVolumeSourceObjectNestedImpl(FlockerVolumeSource item){
                    this.builder = new FlockerVolumeSourceBuilder(this, item);
            }
            FlockerVolumeSourceObjectNestedImpl(){
                    this.builder = new FlockerVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withFlockerVolumeSourceObject(builder.build());
    }
    public N endFlockerVolumeSourceObject(){
            return and();
    }

}
    public class ScaleIOVolumeSourceObjectNestedImpl<N> extends ScaleIOVolumeSourceFluentImpl<WatchEventFluent.ScaleIOVolumeSourceObjectNested<N>> implements WatchEventFluent.ScaleIOVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleIOVolumeSourceBuilder builder;
    
            ScaleIOVolumeSourceObjectNestedImpl(ScaleIOVolumeSource item){
                    this.builder = new ScaleIOVolumeSourceBuilder(this, item);
            }
            ScaleIOVolumeSourceObjectNestedImpl(){
                    this.builder = new ScaleIOVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScaleIOVolumeSourceObject(builder.build());
    }
    public N endScaleIOVolumeSourceObject(){
            return and();
    }

}
    public class LimitRangeListObjectNestedImpl<N> extends LimitRangeListFluentImpl<WatchEventFluent.LimitRangeListObjectNested<N>> implements WatchEventFluent.LimitRangeListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeListBuilder builder;
    
            LimitRangeListObjectNestedImpl(LimitRangeList item){
                    this.builder = new LimitRangeListBuilder(this, item);
            }
            LimitRangeListObjectNestedImpl(){
                    this.builder = new LimitRangeListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLimitRangeListObject(builder.build());
    }
    public N endLimitRangeListObject(){
            return and();
    }

}
    public class ProbeObjectNestedImpl<N> extends ProbeFluentImpl<WatchEventFluent.ProbeObjectNested<N>> implements WatchEventFluent.ProbeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProbeBuilder builder;
    
            ProbeObjectNestedImpl(Probe item){
                    this.builder = new ProbeBuilder(this, item);
            }
            ProbeObjectNestedImpl(){
                    this.builder = new ProbeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProbeObject(builder.build());
    }
    public N endProbeObject(){
            return and();
    }

}
    public class ImageSourcePathObjectNestedImpl<N> extends ImageSourcePathFluentImpl<WatchEventFluent.ImageSourcePathObjectNested<N>> implements WatchEventFluent.ImageSourcePathObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSourcePathBuilder builder;
    
            ImageSourcePathObjectNestedImpl(ImageSourcePath item){
                    this.builder = new ImageSourcePathBuilder(this, item);
            }
            ImageSourcePathObjectNestedImpl(){
                    this.builder = new ImageSourcePathBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageSourcePathObject(builder.build());
    }
    public N endImageSourcePathObject(){
            return and();
    }

}
    public class EndpointsObjectNestedImpl<N> extends EndpointsFluentImpl<WatchEventFluent.EndpointsObjectNested<N>> implements WatchEventFluent.EndpointsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointsBuilder builder;
    
            EndpointsObjectNestedImpl(Endpoints item){
                    this.builder = new EndpointsBuilder(this, item);
            }
            EndpointsObjectNestedImpl(){
                    this.builder = new EndpointsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEndpointsObject(builder.build());
    }
    public N endEndpointsObject(){
            return and();
    }

}
    public class BuildConfigStatusObjectNestedImpl<N> extends BuildConfigStatusFluentImpl<WatchEventFluent.BuildConfigStatusObjectNested<N>> implements WatchEventFluent.BuildConfigStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigStatusBuilder builder;
    
            BuildConfigStatusObjectNestedImpl(BuildConfigStatus item){
                    this.builder = new BuildConfigStatusBuilder(this, item);
            }
            BuildConfigStatusObjectNestedImpl(){
                    this.builder = new BuildConfigStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildConfigStatusObject(builder.build());
    }
    public N endBuildConfigStatusObject(){
            return and();
    }

}
    public class ParameterObjectNestedImpl<N> extends ParameterFluentImpl<WatchEventFluent.ParameterObjectNested<N>> implements WatchEventFluent.ParameterObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ParameterBuilder builder;
    
            ParameterObjectNestedImpl(Parameter item){
                    this.builder = new ParameterBuilder(this, item);
            }
            ParameterObjectNestedImpl(){
                    this.builder = new ParameterBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withParameterObject(builder.build());
    }
    public N endParameterObject(){
            return and();
    }

}
    public class SecretVolumeSourceObjectNestedImpl<N> extends SecretVolumeSourceFluentImpl<WatchEventFluent.SecretVolumeSourceObjectNested<N>> implements WatchEventFluent.SecretVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretVolumeSourceBuilder builder;
    
            SecretVolumeSourceObjectNestedImpl(SecretVolumeSource item){
                    this.builder = new SecretVolumeSourceBuilder(this, item);
            }
            SecretVolumeSourceObjectNestedImpl(){
                    this.builder = new SecretVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretVolumeSourceObject(builder.build());
    }
    public N endSecretVolumeSourceObject(){
            return and();
    }

}
    public class PodObjectNestedImpl<N> extends PodFluentImpl<WatchEventFluent.PodObjectNested<N>> implements WatchEventFluent.PodObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodBuilder builder;
    
            PodObjectNestedImpl(Pod item){
                    this.builder = new PodBuilder(this, item);
            }
            PodObjectNestedImpl(){
                    this.builder = new PodBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodObject(builder.build());
    }
    public N endPodObject(){
            return and();
    }

}
    public class ClientIPConfigObjectNestedImpl<N> extends ClientIPConfigFluentImpl<WatchEventFluent.ClientIPConfigObjectNested<N>> implements WatchEventFluent.ClientIPConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClientIPConfigBuilder builder;
    
            ClientIPConfigObjectNestedImpl(ClientIPConfig item){
                    this.builder = new ClientIPConfigBuilder(this, item);
            }
            ClientIPConfigObjectNestedImpl(){
                    this.builder = new ClientIPConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withClientIPConfigObject(builder.build());
    }
    public N endClientIPConfigObject(){
            return and();
    }

}
    public class ContextObjectNestedImpl<N> extends ContextFluentImpl<WatchEventFluent.ContextObjectNested<N>> implements WatchEventFluent.ContextObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContextBuilder builder;
    
            ContextObjectNestedImpl(Context item){
                    this.builder = new ContextBuilder(this, item);
            }
            ContextObjectNestedImpl(){
                    this.builder = new ContextBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContextObject(builder.build());
    }
    public N endContextObject(){
            return and();
    }

}
    public class NodeAffinityObjectNestedImpl<N> extends NodeAffinityFluentImpl<WatchEventFluent.NodeAffinityObjectNested<N>> implements WatchEventFluent.NodeAffinityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeAffinityBuilder builder;
    
            NodeAffinityObjectNestedImpl(NodeAffinity item){
                    this.builder = new NodeAffinityBuilder(this, item);
            }
            NodeAffinityObjectNestedImpl(){
                    this.builder = new NodeAffinityBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeAffinityObject(builder.build());
    }
    public N endNodeAffinityObject(){
            return and();
    }

}
    public class ConfigMapObjectNestedImpl<N> extends ConfigMapFluentImpl<WatchEventFluent.ConfigMapObjectNested<N>> implements WatchEventFluent.ConfigMapObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
    
            ConfigMapObjectNestedImpl(ConfigMap item){
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ConfigMapObjectNestedImpl(){
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withConfigMapObject(builder.build());
    }
    public N endConfigMapObject(){
            return and();
    }

}
    public class CustomResourceDefinitionObjectNestedImpl<N> extends CustomResourceDefinitionFluentImpl<WatchEventFluent.CustomResourceDefinitionObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionBuilder builder;
    
            CustomResourceDefinitionObjectNestedImpl(CustomResourceDefinition item){
                    this.builder = new CustomResourceDefinitionBuilder(this, item);
            }
            CustomResourceDefinitionObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionObject(builder.build());
    }
    public N endCustomResourceDefinitionObject(){
            return and();
    }

}
    public class FCVolumeSourceObjectNestedImpl<N> extends FCVolumeSourceFluentImpl<WatchEventFluent.FCVolumeSourceObjectNested<N>> implements WatchEventFluent.FCVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FCVolumeSourceBuilder builder;
    
            FCVolumeSourceObjectNestedImpl(FCVolumeSource item){
                    this.builder = new FCVolumeSourceBuilder(this, item);
            }
            FCVolumeSourceObjectNestedImpl(){
                    this.builder = new FCVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withFCVolumeSourceObject(builder.build());
    }
    public N endFCVolumeSourceObject(){
            return and();
    }

}
    public class CustomResourceDefinitionStatusObjectNestedImpl<N> extends CustomResourceDefinitionStatusFluentImpl<WatchEventFluent.CustomResourceDefinitionStatusObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionStatusBuilder builder;
    
            CustomResourceDefinitionStatusObjectNestedImpl(CustomResourceDefinitionStatus item){
                    this.builder = new CustomResourceDefinitionStatusBuilder(this, item);
            }
            CustomResourceDefinitionStatusObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionStatusObject(builder.build());
    }
    public N endCustomResourceDefinitionStatusObject(){
            return and();
    }

}
    public class JobListObjectNestedImpl<N> extends JobListFluentImpl<WatchEventFluent.JobListObjectNested<N>> implements WatchEventFluent.JobListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobListBuilder builder;
    
            JobListObjectNestedImpl(JobList item){
                    this.builder = new JobListBuilder(this, item);
            }
            JobListObjectNestedImpl(){
                    this.builder = new JobListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJobListObject(builder.build());
    }
    public N endJobListObject(){
            return and();
    }

}
    public class OAuthAuthorizeTokenListObjectNestedImpl<N> extends OAuthAuthorizeTokenListFluentImpl<WatchEventFluent.OAuthAuthorizeTokenListObjectNested<N>> implements WatchEventFluent.OAuthAuthorizeTokenListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenListBuilder builder;
    
            OAuthAuthorizeTokenListObjectNestedImpl(OAuthAuthorizeTokenList item){
                    this.builder = new OAuthAuthorizeTokenListBuilder(this, item);
            }
            OAuthAuthorizeTokenListObjectNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthAuthorizeTokenListObject(builder.build());
    }
    public N endOAuthAuthorizeTokenListObject(){
            return and();
    }

}
    public class JSONSchemaPropsOrStringArrayObjectNestedImpl<N> extends JSONSchemaPropsOrStringArrayFluentImpl<WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<N>> implements WatchEventFluent.JSONSchemaPropsOrStringArrayObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrStringArrayBuilder builder;
    
            JSONSchemaPropsOrStringArrayObjectNestedImpl(JSONSchemaPropsOrStringArray item){
                    this.builder = new JSONSchemaPropsOrStringArrayBuilder(this, item);
            }
            JSONSchemaPropsOrStringArrayObjectNestedImpl(){
                    this.builder = new JSONSchemaPropsOrStringArrayBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJSONSchemaPropsOrStringArrayObject(builder.build());
    }
    public N endJSONSchemaPropsOrStringArrayObject(){
            return and();
    }

}
    public class CustomDeploymentStrategyParamsObjectNestedImpl<N> extends CustomDeploymentStrategyParamsFluentImpl<WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<N>> implements WatchEventFluent.CustomDeploymentStrategyParamsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomDeploymentStrategyParamsBuilder builder;
    
            CustomDeploymentStrategyParamsObjectNestedImpl(CustomDeploymentStrategyParams item){
                    this.builder = new CustomDeploymentStrategyParamsBuilder(this, item);
            }
            CustomDeploymentStrategyParamsObjectNestedImpl(){
                    this.builder = new CustomDeploymentStrategyParamsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomDeploymentStrategyParamsObject(builder.build());
    }
    public N endCustomDeploymentStrategyParamsObject(){
            return and();
    }

}
    public class ImageImportSpecObjectNestedImpl<N> extends ImageImportSpecFluentImpl<WatchEventFluent.ImageImportSpecObjectNested<N>> implements WatchEventFluent.ImageImportSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageImportSpecBuilder builder;
    
            ImageImportSpecObjectNestedImpl(ImageImportSpec item){
                    this.builder = new ImageImportSpecBuilder(this, item);
            }
            ImageImportSpecObjectNestedImpl(){
                    this.builder = new ImageImportSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageImportSpecObject(builder.build());
    }
    public N endImageImportSpecObject(){
            return and();
    }

}
    public class PodSecurityContextObjectNestedImpl<N> extends PodSecurityContextFluentImpl<WatchEventFluent.PodSecurityContextObjectNested<N>> implements WatchEventFluent.PodSecurityContextObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityContextBuilder builder;
    
            PodSecurityContextObjectNestedImpl(PodSecurityContext item){
                    this.builder = new PodSecurityContextBuilder(this, item);
            }
            PodSecurityContextObjectNestedImpl(){
                    this.builder = new PodSecurityContextBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodSecurityContextObject(builder.build());
    }
    public N endPodSecurityContextObject(){
            return and();
    }

}
    public class DownwardAPIProjectionObjectNestedImpl<N> extends DownwardAPIProjectionFluentImpl<WatchEventFluent.DownwardAPIProjectionObjectNested<N>> implements WatchEventFluent.DownwardAPIProjectionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DownwardAPIProjectionBuilder builder;
    
            DownwardAPIProjectionObjectNestedImpl(DownwardAPIProjection item){
                    this.builder = new DownwardAPIProjectionBuilder(this, item);
            }
            DownwardAPIProjectionObjectNestedImpl(){
                    this.builder = new DownwardAPIProjectionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDownwardAPIProjectionObject(builder.build());
    }
    public N endDownwardAPIProjectionObject(){
            return and();
    }

}
    public class PodAffinityTermObjectNestedImpl<N> extends PodAffinityTermFluentImpl<WatchEventFluent.PodAffinityTermObjectNested<N>> implements WatchEventFluent.PodAffinityTermObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAffinityTermBuilder builder;
    
            PodAffinityTermObjectNestedImpl(PodAffinityTerm item){
                    this.builder = new PodAffinityTermBuilder(this, item);
            }
            PodAffinityTermObjectNestedImpl(){
                    this.builder = new PodAffinityTermBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodAffinityTermObject(builder.build());
    }
    public N endPodAffinityTermObject(){
            return and();
    }

}
    public class ModelIDRangeObjectNestedImpl<N> extends io.fabric8.openshift.api.model.IDRangeFluentImpl<WatchEventFluent.ModelIDRangeObjectNested<N>> implements WatchEventFluent.ModelIDRangeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.IDRangeBuilder builder;
    
            ModelIDRangeObjectNestedImpl(io.fabric8.openshift.api.model.IDRange item){
                    this.builder = new io.fabric8.openshift.api.model.IDRangeBuilder(this, item);
            }
            ModelIDRangeObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.IDRangeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIDRangeObject(builder.build());
    }
    public N endModelIDRangeObject(){
            return and();
    }

}
    public class BuildConfigSpecObjectNestedImpl<N> extends BuildConfigSpecFluentImpl<WatchEventFluent.BuildConfigSpecObjectNested<N>> implements WatchEventFluent.BuildConfigSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigSpecBuilder builder;
    
            BuildConfigSpecObjectNestedImpl(BuildConfigSpec item){
                    this.builder = new BuildConfigSpecBuilder(this, item);
            }
            BuildConfigSpecObjectNestedImpl(){
                    this.builder = new BuildConfigSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildConfigSpecObject(builder.build());
    }
    public N endBuildConfigSpecObject(){
            return and();
    }

}
    public class NonResourceAttributesObjectNestedImpl<N> extends NonResourceAttributesFluentImpl<WatchEventFluent.NonResourceAttributesObjectNested<N>> implements WatchEventFluent.NonResourceAttributesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NonResourceAttributesBuilder builder;
    
            NonResourceAttributesObjectNestedImpl(NonResourceAttributes item){
                    this.builder = new NonResourceAttributesBuilder(this, item);
            }
            NonResourceAttributesObjectNestedImpl(){
                    this.builder = new NonResourceAttributesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNonResourceAttributesObject(builder.build());
    }
    public N endNonResourceAttributesObject(){
            return and();
    }

}
    public class PersistentVolumeClaimSourceObjectNestedImpl<N> extends PersistentVolumeClaimVolumeSourceFluentImpl<WatchEventFluent.PersistentVolumeClaimSourceObjectNested<N>> implements WatchEventFluent.PersistentVolumeClaimSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimVolumeSourceBuilder builder;
    
            PersistentVolumeClaimSourceObjectNestedImpl(PersistentVolumeClaimVolumeSource item){
                    this.builder = new PersistentVolumeClaimVolumeSourceBuilder(this, item);
            }
            PersistentVolumeClaimSourceObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeClaimSourceObject(builder.build());
    }
    public N endPersistentVolumeClaimSourceObject(){
            return and();
    }

}
    public class SubjectAccessReviewStatusObjectNestedImpl<N> extends SubjectAccessReviewStatusFluentImpl<WatchEventFluent.SubjectAccessReviewStatusObjectNested<N>> implements WatchEventFluent.SubjectAccessReviewStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewStatusBuilder builder;
    
            SubjectAccessReviewStatusObjectNestedImpl(SubjectAccessReviewStatus item){
                    this.builder = new SubjectAccessReviewStatusBuilder(this, item);
            }
            SubjectAccessReviewStatusObjectNestedImpl(){
                    this.builder = new SubjectAccessReviewStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSubjectAccessReviewStatusObject(builder.build());
    }
    public N endSubjectAccessReviewStatusObject(){
            return and();
    }

}
    public class WebHookTriggerObjectNestedImpl<N> extends WebHookTriggerFluentImpl<WatchEventFluent.WebHookTriggerObjectNested<N>> implements WatchEventFluent.WebHookTriggerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebHookTriggerBuilder builder;
    
            WebHookTriggerObjectNestedImpl(WebHookTrigger item){
                    this.builder = new WebHookTriggerBuilder(this, item);
            }
            WebHookTriggerObjectNestedImpl(){
                    this.builder = new WebHookTriggerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withWebHookTriggerObject(builder.build());
    }
    public N endWebHookTriggerObject(){
            return and();
    }

}
    public class ServiceAccountReferenceObjectNestedImpl<N> extends ServiceAccountReferenceFluentImpl<WatchEventFluent.ServiceAccountReferenceObjectNested<N>> implements WatchEventFluent.ServiceAccountReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountReferenceBuilder builder;
    
            ServiceAccountReferenceObjectNestedImpl(ServiceAccountReference item){
                    this.builder = new ServiceAccountReferenceBuilder(this, item);
            }
            ServiceAccountReferenceObjectNestedImpl(){
                    this.builder = new ServiceAccountReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceAccountReferenceObject(builder.build());
    }
    public N endServiceAccountReferenceObject(){
            return and();
    }

}
    public class BuildObjectNestedImpl<N> extends BuildFluentImpl<WatchEventFluent.BuildObjectNested<N>> implements WatchEventFluent.BuildObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildBuilder builder;
    
            BuildObjectNestedImpl(Build item){
                    this.builder = new BuildBuilder(this, item);
            }
            BuildObjectNestedImpl(){
                    this.builder = new BuildBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildObject(builder.build());
    }
    public N endBuildObject(){
            return and();
    }

}
    public class CustomResourceDefinitionListObjectNestedImpl<N> extends CustomResourceDefinitionListFluentImpl<WatchEventFluent.CustomResourceDefinitionListObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionListBuilder builder;
    
            CustomResourceDefinitionListObjectNestedImpl(CustomResourceDefinitionList item){
                    this.builder = new CustomResourceDefinitionListBuilder(this, item);
            }
            CustomResourceDefinitionListObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionListObject(builder.build());
    }
    public N endCustomResourceDefinitionListObject(){
            return and();
    }

}
    public class AllowedFlexVolumeObjectNestedImpl<N> extends AllowedFlexVolumeFluentImpl<WatchEventFluent.AllowedFlexVolumeObjectNested<N>> implements WatchEventFluent.AllowedFlexVolumeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AllowedFlexVolumeBuilder builder;
    
            AllowedFlexVolumeObjectNestedImpl(AllowedFlexVolume item){
                    this.builder = new AllowedFlexVolumeBuilder(this, item);
            }
            AllowedFlexVolumeObjectNestedImpl(){
                    this.builder = new AllowedFlexVolumeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAllowedFlexVolumeObject(builder.build());
    }
    public N endAllowedFlexVolumeObject(){
            return and();
    }

}
    public class ResourceMetricStatusObjectNestedImpl<N> extends ResourceMetricStatusFluentImpl<WatchEventFluent.ResourceMetricStatusObjectNested<N>> implements WatchEventFluent.ResourceMetricStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceMetricStatusBuilder builder;
    
            ResourceMetricStatusObjectNestedImpl(ResourceMetricStatus item){
                    this.builder = new ResourceMetricStatusBuilder(this, item);
            }
            ResourceMetricStatusObjectNestedImpl(){
                    this.builder = new ResourceMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceMetricStatusObject(builder.build());
    }
    public N endResourceMetricStatusObject(){
            return and();
    }

}
    public class TagImportPolicyObjectNestedImpl<N> extends TagImportPolicyFluentImpl<WatchEventFluent.TagImportPolicyObjectNested<N>> implements WatchEventFluent.TagImportPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagImportPolicyBuilder builder;
    
            TagImportPolicyObjectNestedImpl(TagImportPolicy item){
                    this.builder = new TagImportPolicyBuilder(this, item);
            }
            TagImportPolicyObjectNestedImpl(){
                    this.builder = new TagImportPolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTagImportPolicyObject(builder.build());
    }
    public N endTagImportPolicyObject(){
            return and();
    }

}
    public class ImageStreamTagObjectNestedImpl<N> extends ImageStreamTagFluentImpl<WatchEventFluent.ImageStreamTagObjectNested<N>> implements WatchEventFluent.ImageStreamTagObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagBuilder builder;
    
            ImageStreamTagObjectNestedImpl(ImageStreamTag item){
                    this.builder = new ImageStreamTagBuilder(this, item);
            }
            ImageStreamTagObjectNestedImpl(){
                    this.builder = new ImageStreamTagBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamTagObject(builder.build());
    }
    public N endImageStreamTagObject(){
            return and();
    }

}
    public class KeyToPathObjectNestedImpl<N> extends KeyToPathFluentImpl<WatchEventFluent.KeyToPathObjectNested<N>> implements WatchEventFluent.KeyToPathObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final KeyToPathBuilder builder;
    
            KeyToPathObjectNestedImpl(KeyToPath item){
                    this.builder = new KeyToPathBuilder(this, item);
            }
            KeyToPathObjectNestedImpl(){
                    this.builder = new KeyToPathBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withKeyToPathObject(builder.build());
    }
    public N endKeyToPathObject(){
            return and();
    }

}
    public class StatefulSetConditionObjectNestedImpl<N> extends StatefulSetConditionFluentImpl<WatchEventFluent.StatefulSetConditionObjectNested<N>> implements WatchEventFluent.StatefulSetConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetConditionBuilder builder;
    
            StatefulSetConditionObjectNestedImpl(StatefulSetCondition item){
                    this.builder = new StatefulSetConditionBuilder(this, item);
            }
            StatefulSetConditionObjectNestedImpl(){
                    this.builder = new StatefulSetConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatefulSetConditionObject(builder.build());
    }
    public N endStatefulSetConditionObject(){
            return and();
    }

}
    public class RoutePortObjectNestedImpl<N> extends RoutePortFluentImpl<WatchEventFluent.RoutePortObjectNested<N>> implements WatchEventFluent.RoutePortObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoutePortBuilder builder;
    
            RoutePortObjectNestedImpl(RoutePort item){
                    this.builder = new RoutePortBuilder(this, item);
            }
            RoutePortObjectNestedImpl(){
                    this.builder = new RoutePortBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRoutePortObject(builder.build());
    }
    public N endRoutePortObject(){
            return and();
    }

}
    public class JSONSchemaPropsOrBoolObjectNestedImpl<N> extends JSONSchemaPropsOrBoolFluentImpl<WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<N>> implements WatchEventFluent.JSONSchemaPropsOrBoolObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrBoolBuilder builder;
    
            JSONSchemaPropsOrBoolObjectNestedImpl(JSONSchemaPropsOrBool item){
                    this.builder = new JSONSchemaPropsOrBoolBuilder(this, item);
            }
            JSONSchemaPropsOrBoolObjectNestedImpl(){
                    this.builder = new JSONSchemaPropsOrBoolBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJSONSchemaPropsOrBoolObject(builder.build());
    }
    public N endJSONSchemaPropsOrBoolObject(){
            return and();
    }

}
    public class FlexPersistentVolumeSourceObjectNestedImpl<N> extends FlexPersistentVolumeSourceFluentImpl<WatchEventFluent.FlexPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.FlexPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlexPersistentVolumeSourceBuilder builder;
    
            FlexPersistentVolumeSourceObjectNestedImpl(FlexPersistentVolumeSource item){
                    this.builder = new FlexPersistentVolumeSourceBuilder(this, item);
            }
            FlexPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new FlexPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withFlexPersistentVolumeSourceObject(builder.build());
    }
    public N endFlexPersistentVolumeSourceObject(){
            return and();
    }

}
    public class GroupObjectNestedImpl<N> extends GroupFluentImpl<WatchEventFluent.GroupObjectNested<N>> implements WatchEventFluent.GroupObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupBuilder builder;
    
            GroupObjectNestedImpl(Group item){
                    this.builder = new GroupBuilder(this, item);
            }
            GroupObjectNestedImpl(){
                    this.builder = new GroupBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGroupObject(builder.build());
    }
    public N endGroupObject(){
            return and();
    }

}
    public class BuildTriggerCauseObjectNestedImpl<N> extends BuildTriggerCauseFluentImpl<WatchEventFluent.BuildTriggerCauseObjectNested<N>> implements WatchEventFluent.BuildTriggerCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildTriggerCauseBuilder builder;
    
            BuildTriggerCauseObjectNestedImpl(BuildTriggerCause item){
                    this.builder = new BuildTriggerCauseBuilder(this, item);
            }
            BuildTriggerCauseObjectNestedImpl(){
                    this.builder = new BuildTriggerCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildTriggerCauseObject(builder.build());
    }
    public N endBuildTriggerCauseObject(){
            return and();
    }

}
    public class NamespaceListObjectNestedImpl<N> extends NamespaceListFluentImpl<WatchEventFluent.NamespaceListObjectNested<N>> implements WatchEventFluent.NamespaceListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceListBuilder builder;
    
            NamespaceListObjectNestedImpl(NamespaceList item){
                    this.builder = new NamespaceListBuilder(this, item);
            }
            NamespaceListObjectNestedImpl(){
                    this.builder = new NamespaceListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamespaceListObject(builder.build());
    }
    public N endNamespaceListObject(){
            return and();
    }

}
    public class PodDisruptionBudgetStatusObjectNestedImpl<N> extends PodDisruptionBudgetStatusFluentImpl<WatchEventFluent.PodDisruptionBudgetStatusObjectNested<N>> implements WatchEventFluent.PodDisruptionBudgetStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetStatusBuilder builder;
    
            PodDisruptionBudgetStatusObjectNestedImpl(PodDisruptionBudgetStatus item){
                    this.builder = new PodDisruptionBudgetStatusBuilder(this, item);
            }
            PodDisruptionBudgetStatusObjectNestedImpl(){
                    this.builder = new PodDisruptionBudgetStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodDisruptionBudgetStatusObject(builder.build());
    }
    public N endPodDisruptionBudgetStatusObject(){
            return and();
    }

}
    public class PodDNSConfigObjectNestedImpl<N> extends PodDNSConfigFluentImpl<WatchEventFluent.PodDNSConfigObjectNested<N>> implements WatchEventFluent.PodDNSConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDNSConfigBuilder builder;
    
            PodDNSConfigObjectNestedImpl(PodDNSConfig item){
                    this.builder = new PodDNSConfigBuilder(this, item);
            }
            PodDNSConfigObjectNestedImpl(){
                    this.builder = new PodDNSConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodDNSConfigObject(builder.build());
    }
    public N endPodDNSConfigObject(){
            return and();
    }

}
    public class NodeListObjectNestedImpl<N> extends NodeListFluentImpl<WatchEventFluent.NodeListObjectNested<N>> implements WatchEventFluent.NodeListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeListBuilder builder;
    
            NodeListObjectNestedImpl(NodeList item){
                    this.builder = new NodeListBuilder(this, item);
            }
            NodeListObjectNestedImpl(){
                    this.builder = new NodeListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeListObject(builder.build());
    }
    public N endNodeListObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerSpecObjectNestedImpl<N> extends HorizontalPodAutoscalerSpecFluentImpl<WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<N>> implements WatchEventFluent.HorizontalPodAutoscalerSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerSpecBuilder builder;
    
            HorizontalPodAutoscalerSpecObjectNestedImpl(HorizontalPodAutoscalerSpec item){
                    this.builder = new HorizontalPodAutoscalerSpecBuilder(this, item);
            }
            HorizontalPodAutoscalerSpecObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHorizontalPodAutoscalerSpecObject(builder.build());
    }
    public N endHorizontalPodAutoscalerSpecObject(){
            return and();
    }

}
    public class ImageSignatureObjectNestedImpl<N> extends ImageSignatureFluentImpl<WatchEventFluent.ImageSignatureObjectNested<N>> implements WatchEventFluent.ImageSignatureObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
    
            ImageSignatureObjectNestedImpl(ImageSignature item){
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            ImageSignatureObjectNestedImpl(){
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageSignatureObject(builder.build());
    }
    public N endImageSignatureObject(){
            return and();
    }

}
    public class EnvVarSourceObjectNestedImpl<N> extends EnvVarSourceFluentImpl<WatchEventFluent.EnvVarSourceObjectNested<N>> implements WatchEventFluent.EnvVarSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarSourceBuilder builder;
    
            EnvVarSourceObjectNestedImpl(EnvVarSource item){
                    this.builder = new EnvVarSourceBuilder(this, item);
            }
            EnvVarSourceObjectNestedImpl(){
                    this.builder = new EnvVarSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEnvVarSourceObject(builder.build());
    }
    public N endEnvVarSourceObject(){
            return and();
    }

}
    public class VolumeProjectionObjectNestedImpl<N> extends VolumeProjectionFluentImpl<WatchEventFluent.VolumeProjectionObjectNested<N>> implements WatchEventFluent.VolumeProjectionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeProjectionBuilder builder;
    
            VolumeProjectionObjectNestedImpl(VolumeProjection item){
                    this.builder = new VolumeProjectionBuilder(this, item);
            }
            VolumeProjectionObjectNestedImpl(){
                    this.builder = new VolumeProjectionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withVolumeProjectionObject(builder.build());
    }
    public N endVolumeProjectionObject(){
            return and();
    }

}
    public class ResourceQuotaObjectNestedImpl<N> extends ResourceQuotaFluentImpl<WatchEventFluent.ResourceQuotaObjectNested<N>> implements WatchEventFluent.ResourceQuotaObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaBuilder builder;
    
            ResourceQuotaObjectNestedImpl(ResourceQuota item){
                    this.builder = new ResourceQuotaBuilder(this, item);
            }
            ResourceQuotaObjectNestedImpl(){
                    this.builder = new ResourceQuotaBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceQuotaObject(builder.build());
    }
    public N endResourceQuotaObject(){
            return and();
    }

}
    public class DeploymentStrategyObjectNestedImpl<N> extends DeploymentStrategyFluentImpl<WatchEventFluent.DeploymentStrategyObjectNested<N>> implements WatchEventFluent.DeploymentStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentStrategyBuilder builder;
    
            DeploymentStrategyObjectNestedImpl(DeploymentStrategy item){
                    this.builder = new DeploymentStrategyBuilder(this, item);
            }
            DeploymentStrategyObjectNestedImpl(){
                    this.builder = new DeploymentStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentStrategyObject(builder.build());
    }
    public N endDeploymentStrategyObject(){
            return and();
    }

}
    public class OAuthAccessTokenListObjectNestedImpl<N> extends OAuthAccessTokenListFluentImpl<WatchEventFluent.OAuthAccessTokenListObjectNested<N>> implements WatchEventFluent.OAuthAccessTokenListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenListBuilder builder;
    
            OAuthAccessTokenListObjectNestedImpl(OAuthAccessTokenList item){
                    this.builder = new OAuthAccessTokenListBuilder(this, item);
            }
            OAuthAccessTokenListObjectNestedImpl(){
                    this.builder = new OAuthAccessTokenListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthAccessTokenListObject(builder.build());
    }
    public N endOAuthAccessTokenListObject(){
            return and();
    }

}
    public class NodeSelectorTermObjectNestedImpl<N> extends NodeSelectorTermFluentImpl<WatchEventFluent.NodeSelectorTermObjectNested<N>> implements WatchEventFluent.NodeSelectorTermObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorTermBuilder builder;
    
            NodeSelectorTermObjectNestedImpl(NodeSelectorTerm item){
                    this.builder = new NodeSelectorTermBuilder(this, item);
            }
            NodeSelectorTermObjectNestedImpl(){
                    this.builder = new NodeSelectorTermBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeSelectorTermObject(builder.build());
    }
    public N endNodeSelectorTermObject(){
            return and();
    }

}
    public class ScaleIOPersistentVolumeSourceObjectNestedImpl<N> extends ScaleIOPersistentVolumeSourceFluentImpl<WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.ScaleIOPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleIOPersistentVolumeSourceBuilder builder;
    
            ScaleIOPersistentVolumeSourceObjectNestedImpl(ScaleIOPersistentVolumeSource item){
                    this.builder = new ScaleIOPersistentVolumeSourceBuilder(this, item);
            }
            ScaleIOPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new ScaleIOPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScaleIOPersistentVolumeSourceObject(builder.build());
    }
    public N endScaleIOPersistentVolumeSourceObject(){
            return and();
    }

}
    public class ModelSupplementalGroupsStrategyOptionsObjectNestedImpl<N> extends io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluentImpl<WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<N>> implements WatchEventFluent.ModelSupplementalGroupsStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder builder;
    
            ModelSupplementalGroupsStrategyOptionsObjectNestedImpl(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item){
                    this.builder = new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder(this, item);
            }
            ModelSupplementalGroupsStrategyOptionsObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSupplementalGroupsStrategyOptionsObject(builder.build());
    }
    public N endModelSupplementalGroupsStrategyOptionsObject(){
            return and();
    }

}
    public class WeightedPodAffinityTermObjectNestedImpl<N> extends WeightedPodAffinityTermFluentImpl<WatchEventFluent.WeightedPodAffinityTermObjectNested<N>> implements WatchEventFluent.WeightedPodAffinityTermObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WeightedPodAffinityTermBuilder builder;
    
            WeightedPodAffinityTermObjectNestedImpl(WeightedPodAffinityTerm item){
                    this.builder = new WeightedPodAffinityTermBuilder(this, item);
            }
            WeightedPodAffinityTermObjectNestedImpl(){
                    this.builder = new WeightedPodAffinityTermBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withWeightedPodAffinityTermObject(builder.build());
    }
    public N endWeightedPodAffinityTermObject(){
            return and();
    }

}
    public class RollingUpdateStatefulSetStrategyObjectNestedImpl<N> extends RollingUpdateStatefulSetStrategyFluentImpl<WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<N>> implements WatchEventFluent.RollingUpdateStatefulSetStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingUpdateStatefulSetStrategyBuilder builder;
    
            RollingUpdateStatefulSetStrategyObjectNestedImpl(RollingUpdateStatefulSetStrategy item){
                    this.builder = new RollingUpdateStatefulSetStrategyBuilder(this, item);
            }
            RollingUpdateStatefulSetStrategyObjectNestedImpl(){
                    this.builder = new RollingUpdateStatefulSetStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRollingUpdateStatefulSetStrategyObject(builder.build());
    }
    public N endRollingUpdateStatefulSetStrategyObject(){
            return and();
    }

}
    public class BuildRequestObjectNestedImpl<N> extends BuildRequestFluentImpl<WatchEventFluent.BuildRequestObjectNested<N>> implements WatchEventFluent.BuildRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildRequestBuilder builder;
    
            BuildRequestObjectNestedImpl(BuildRequest item){
                    this.builder = new BuildRequestBuilder(this, item);
            }
            BuildRequestObjectNestedImpl(){
                    this.builder = new BuildRequestBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildRequestObject(builder.build());
    }
    public N endBuildRequestObject(){
            return and();
    }

}
    public class ApiextensionsServiceReferenceObjectNestedImpl<N> extends io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceFluentImpl<WatchEventFluent.ApiextensionsServiceReferenceObjectNested<N>> implements WatchEventFluent.ApiextensionsServiceReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceBuilder builder;
    
            ApiextensionsServiceReferenceObjectNestedImpl(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item){
                    this.builder = new io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceBuilder(this, item);
            }
            ApiextensionsServiceReferenceObjectNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceReferenceObject(builder.build());
    }
    public N endApiextensionsServiceReferenceObject(){
            return and();
    }

}
    public class NodeSystemInfoObjectNestedImpl<N> extends NodeSystemInfoFluentImpl<WatchEventFluent.NodeSystemInfoObjectNested<N>> implements WatchEventFluent.NodeSystemInfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSystemInfoBuilder builder;
    
            NodeSystemInfoObjectNestedImpl(NodeSystemInfo item){
                    this.builder = new NodeSystemInfoBuilder(this, item);
            }
            NodeSystemInfoObjectNestedImpl(){
                    this.builder = new NodeSystemInfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeSystemInfoObject(builder.build());
    }
    public N endNodeSystemInfoObject(){
            return and();
    }

}
    public class RouteListObjectNestedImpl<N> extends RouteListFluentImpl<WatchEventFluent.RouteListObjectNested<N>> implements WatchEventFluent.RouteListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteListBuilder builder;
    
            RouteListObjectNestedImpl(RouteList item){
                    this.builder = new RouteListBuilder(this, item);
            }
            RouteListObjectNestedImpl(){
                    this.builder = new RouteListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteListObject(builder.build());
    }
    public N endRouteListObject(){
            return and();
    }

}
    public class AuthProviderConfigObjectNestedImpl<N> extends AuthProviderConfigFluentImpl<WatchEventFluent.AuthProviderConfigObjectNested<N>> implements WatchEventFluent.AuthProviderConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AuthProviderConfigBuilder builder;
    
            AuthProviderConfigObjectNestedImpl(AuthProviderConfig item){
                    this.builder = new AuthProviderConfigBuilder(this, item);
            }
            AuthProviderConfigObjectNestedImpl(){
                    this.builder = new AuthProviderConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAuthProviderConfigObject(builder.build());
    }
    public N endAuthProviderConfigObject(){
            return and();
    }

}
    public class VolumeDeviceObjectNestedImpl<N> extends VolumeDeviceFluentImpl<WatchEventFluent.VolumeDeviceObjectNested<N>> implements WatchEventFluent.VolumeDeviceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeDeviceBuilder builder;
    
            VolumeDeviceObjectNestedImpl(VolumeDevice item){
                    this.builder = new VolumeDeviceBuilder(this, item);
            }
            VolumeDeviceObjectNestedImpl(){
                    this.builder = new VolumeDeviceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withVolumeDeviceObject(builder.build());
    }
    public N endVolumeDeviceObject(){
            return and();
    }

}
    public class DaemonSetObjectNestedImpl<N> extends DaemonSetFluentImpl<WatchEventFluent.DaemonSetObjectNested<N>> implements WatchEventFluent.DaemonSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetBuilder builder;
    
            DaemonSetObjectNestedImpl(DaemonSet item){
                    this.builder = new DaemonSetBuilder(this, item);
            }
            DaemonSetObjectNestedImpl(){
                    this.builder = new DaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonSetObject(builder.build());
    }
    public N endDaemonSetObject(){
            return and();
    }

}
    public class TokenReviewSpecObjectNestedImpl<N> extends TokenReviewSpecFluentImpl<WatchEventFluent.TokenReviewSpecObjectNested<N>> implements WatchEventFluent.TokenReviewSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewSpecBuilder builder;
    
            TokenReviewSpecObjectNestedImpl(TokenReviewSpec item){
                    this.builder = new TokenReviewSpecBuilder(this, item);
            }
            TokenReviewSpecObjectNestedImpl(){
                    this.builder = new TokenReviewSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTokenReviewSpecObject(builder.build());
    }
    public N endTokenReviewSpecObject(){
            return and();
    }

}
    public class DeploymentDetailsObjectNestedImpl<N> extends DeploymentDetailsFluentImpl<WatchEventFluent.DeploymentDetailsObjectNested<N>> implements WatchEventFluent.DeploymentDetailsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentDetailsBuilder builder;
    
            DeploymentDetailsObjectNestedImpl(DeploymentDetails item){
                    this.builder = new DeploymentDetailsBuilder(this, item);
            }
            DeploymentDetailsObjectNestedImpl(){
                    this.builder = new DeploymentDetailsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentDetailsObject(builder.build());
    }
    public N endDeploymentDetailsObject(){
            return and();
    }

}
    public class VolumeObjectNestedImpl<N> extends VolumeFluentImpl<WatchEventFluent.VolumeObjectNested<N>> implements WatchEventFluent.VolumeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeBuilder builder;
    
            VolumeObjectNestedImpl(Volume item){
                    this.builder = new VolumeBuilder(this, item);
            }
            VolumeObjectNestedImpl(){
                    this.builder = new VolumeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withVolumeObject(builder.build());
    }
    public N endVolumeObject(){
            return and();
    }

}
    public class KubernetesRunAsUserStrategyOptionsObjectNestedImpl<N> extends KubernetesRunAsUserStrategyOptionsFluentImpl<WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<N>> implements WatchEventFluent.KubernetesRunAsUserStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final KubernetesRunAsUserStrategyOptionsBuilder builder;
    
            KubernetesRunAsUserStrategyOptionsObjectNestedImpl(KubernetesRunAsUserStrategyOptions item){
                    this.builder = new KubernetesRunAsUserStrategyOptionsBuilder(this, item);
            }
            KubernetesRunAsUserStrategyOptionsObjectNestedImpl(){
                    this.builder = new KubernetesRunAsUserStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withKubernetesRunAsUserStrategyOptionsObject(builder.build());
    }
    public N endKubernetesRunAsUserStrategyOptionsObject(){
            return and();
    }

}
    public class NFSVolumeSourceObjectNestedImpl<N> extends NFSVolumeSourceFluentImpl<WatchEventFluent.NFSVolumeSourceObjectNested<N>> implements WatchEventFluent.NFSVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NFSVolumeSourceBuilder builder;
    
            NFSVolumeSourceObjectNestedImpl(NFSVolumeSource item){
                    this.builder = new NFSVolumeSourceBuilder(this, item);
            }
            NFSVolumeSourceObjectNestedImpl(){
                    this.builder = new NFSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNFSVolumeSourceObject(builder.build());
    }
    public N endNFSVolumeSourceObject(){
            return and();
    }

}
    public class DeploymentConditionObjectNestedImpl<N> extends DeploymentConditionFluentImpl<WatchEventFluent.DeploymentConditionObjectNested<N>> implements WatchEventFluent.DeploymentConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConditionBuilder builder;
    
            DeploymentConditionObjectNestedImpl(DeploymentCondition item){
                    this.builder = new DeploymentConditionBuilder(this, item);
            }
            DeploymentConditionObjectNestedImpl(){
                    this.builder = new DeploymentConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentConditionObject(builder.build());
    }
    public N endDeploymentConditionObject(){
            return and();
    }

}
    public class ClusterObjectNestedImpl<N> extends ClusterFluentImpl<WatchEventFluent.ClusterObjectNested<N>> implements WatchEventFluent.ClusterObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterBuilder builder;
    
            ClusterObjectNestedImpl(Cluster item){
                    this.builder = new ClusterBuilder(this, item);
            }
            ClusterObjectNestedImpl(){
                    this.builder = new ClusterBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withClusterObject(builder.build());
    }
    public N endClusterObject(){
            return and();
    }

}
    public class ImageStreamObjectNestedImpl<N> extends ImageStreamFluentImpl<WatchEventFluent.ImageStreamObjectNested<N>> implements WatchEventFluent.ImageStreamObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImageStreamObjectNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImageStreamObjectNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamObject(builder.build());
    }
    public N endImageStreamObject(){
            return and();
    }

}
    public class StorageOSVolumeSourceObjectNestedImpl<N> extends StorageOSVolumeSourceFluentImpl<WatchEventFluent.StorageOSVolumeSourceObjectNested<N>> implements WatchEventFluent.StorageOSVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageOSVolumeSourceBuilder builder;
    
            StorageOSVolumeSourceObjectNestedImpl(StorageOSVolumeSource item){
                    this.builder = new StorageOSVolumeSourceBuilder(this, item);
            }
            StorageOSVolumeSourceObjectNestedImpl(){
                    this.builder = new StorageOSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStorageOSVolumeSourceObject(builder.build());
    }
    public N endStorageOSVolumeSourceObject(){
            return and();
    }

}
    public class BuildListObjectNestedImpl<N> extends BuildListFluentImpl<WatchEventFluent.BuildListObjectNested<N>> implements WatchEventFluent.BuildListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildListBuilder builder;
    
            BuildListObjectNestedImpl(BuildList item){
                    this.builder = new BuildListBuilder(this, item);
            }
            BuildListObjectNestedImpl(){
                    this.builder = new BuildListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildListObject(builder.build());
    }
    public N endBuildListObject(){
            return and();
    }

}
    public class TemplateListObjectNestedImpl<N> extends TemplateListFluentImpl<WatchEventFluent.TemplateListObjectNested<N>> implements WatchEventFluent.TemplateListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateListBuilder builder;
    
            TemplateListObjectNestedImpl(TemplateList item){
                    this.builder = new TemplateListBuilder(this, item);
            }
            TemplateListObjectNestedImpl(){
                    this.builder = new TemplateListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTemplateListObject(builder.build());
    }
    public N endTemplateListObject(){
            return and();
    }

}
    public class KubernetesListObjectNestedImpl<N> extends KubernetesListFluentImpl<WatchEventFluent.KubernetesListObjectNested<N>> implements WatchEventFluent.KubernetesListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final KubernetesListBuilder builder;
    
            KubernetesListObjectNestedImpl(KubernetesList item){
                    this.builder = new KubernetesListBuilder(this, item);
            }
            KubernetesListObjectNestedImpl(){
                    this.builder = new KubernetesListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withKubernetesListObject(builder.build());
    }
    public N endKubernetesListObject(){
            return and();
    }

}
    public class CustomResourceDefinitionVersionObjectNestedImpl<N> extends CustomResourceDefinitionVersionFluentImpl<WatchEventFluent.CustomResourceDefinitionVersionObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionVersionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionVersionBuilder builder;
    
            CustomResourceDefinitionVersionObjectNestedImpl(CustomResourceDefinitionVersion item){
                    this.builder = new CustomResourceDefinitionVersionBuilder(this, item);
            }
            CustomResourceDefinitionVersionObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionVersionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionVersionObject(builder.build());
    }
    public N endCustomResourceDefinitionVersionObject(){
            return and();
    }

}
    public class ProjectSpecObjectNestedImpl<N> extends ProjectSpecFluentImpl<WatchEventFluent.ProjectSpecObjectNested<N>> implements WatchEventFluent.ProjectSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectSpecBuilder builder;
    
            ProjectSpecObjectNestedImpl(ProjectSpec item){
                    this.builder = new ProjectSpecBuilder(this, item);
            }
            ProjectSpecObjectNestedImpl(){
                    this.builder = new ProjectSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProjectSpecObject(builder.build());
    }
    public N endProjectSpecObject(){
            return and();
    }

}
    public class HTTPHeaderObjectNestedImpl<N> extends HTTPHeaderFluentImpl<WatchEventFluent.HTTPHeaderObjectNested<N>> implements WatchEventFluent.HTTPHeaderObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPHeaderBuilder builder;
    
            HTTPHeaderObjectNestedImpl(HTTPHeader item){
                    this.builder = new HTTPHeaderBuilder(this, item);
            }
            HTTPHeaderObjectNestedImpl(){
                    this.builder = new HTTPHeaderBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHTTPHeaderObject(builder.build());
    }
    public N endHTTPHeaderObject(){
            return and();
    }

}
    public class CapabilitiesObjectNestedImpl<N> extends CapabilitiesFluentImpl<WatchEventFluent.CapabilitiesObjectNested<N>> implements WatchEventFluent.CapabilitiesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CapabilitiesBuilder builder;
    
            CapabilitiesObjectNestedImpl(Capabilities item){
                    this.builder = new CapabilitiesBuilder(this, item);
            }
            CapabilitiesObjectNestedImpl(){
                    this.builder = new CapabilitiesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCapabilitiesObject(builder.build());
    }
    public N endCapabilitiesObject(){
            return and();
    }

}
    public class ObjectReferenceObjectNestedImpl<N> extends ObjectReferenceFluentImpl<WatchEventFluent.ObjectReferenceObjectNested<N>> implements WatchEventFluent.ObjectReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            ObjectReferenceObjectNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            ObjectReferenceObjectNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withObjectReferenceObject(builder.build());
    }
    public N endObjectReferenceObject(){
            return and();
    }

}
    public class WatchEventObjectNestedImpl<N> extends WatchEventFluentImpl<WatchEventFluent.WatchEventObjectNested<N>> implements WatchEventFluent.WatchEventObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WatchEventBuilder builder;
    
            WatchEventObjectNestedImpl(WatchEvent item){
                    this.builder = new WatchEventBuilder(this, item);
            }
            WatchEventObjectNestedImpl(){
                    this.builder = new WatchEventBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withWatchEventObject(builder.build());
    }
    public N endWatchEventObject(){
            return and();
    }

}
    public class SignatureIssuerObjectNestedImpl<N> extends SignatureIssuerFluentImpl<WatchEventFluent.SignatureIssuerObjectNested<N>> implements WatchEventFluent.SignatureIssuerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SignatureIssuerBuilder builder;
    
            SignatureIssuerObjectNestedImpl(SignatureIssuer item){
                    this.builder = new SignatureIssuerBuilder(this, item);
            }
            SignatureIssuerObjectNestedImpl(){
                    this.builder = new SignatureIssuerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSignatureIssuerObject(builder.build());
    }
    public N endSignatureIssuerObject(){
            return and();
    }

}
    public class ImageLayerObjectNestedImpl<N> extends ImageLayerFluentImpl<WatchEventFluent.ImageLayerObjectNested<N>> implements WatchEventFluent.ImageLayerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLayerBuilder builder;
    
            ImageLayerObjectNestedImpl(ImageLayer item){
                    this.builder = new ImageLayerBuilder(this, item);
            }
            ImageLayerObjectNestedImpl(){
                    this.builder = new ImageLayerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageLayerObject(builder.build());
    }
    public N endImageLayerObject(){
            return and();
    }

}
    public class SecretProjectionObjectNestedImpl<N> extends SecretProjectionFluentImpl<WatchEventFluent.SecretProjectionObjectNested<N>> implements WatchEventFluent.SecretProjectionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretProjectionBuilder builder;
    
            SecretProjectionObjectNestedImpl(SecretProjection item){
                    this.builder = new SecretProjectionBuilder(this, item);
            }
            SecretProjectionObjectNestedImpl(){
                    this.builder = new SecretProjectionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretProjectionObject(builder.build());
    }
    public N endSecretProjectionObject(){
            return and();
    }

}
    public class ApiextensionsWebhookClientConfigObjectNestedImpl<N> extends io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigFluentImpl<WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<N>> implements WatchEventFluent.ApiextensionsWebhookClientConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder builder;
    
            ApiextensionsWebhookClientConfigObjectNestedImpl(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item){
                    this.builder = new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder(this, item);
            }
            ApiextensionsWebhookClientConfigObjectNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withWebhookClientConfigObject(builder.build());
    }
    public N endApiextensionsWebhookClientConfigObject(){
            return and();
    }

}
    public class GlusterfsVolumeSourceObjectNestedImpl<N> extends GlusterfsVolumeSourceFluentImpl<WatchEventFluent.GlusterfsVolumeSourceObjectNested<N>> implements WatchEventFluent.GlusterfsVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GlusterfsVolumeSourceBuilder builder;
    
            GlusterfsVolumeSourceObjectNestedImpl(GlusterfsVolumeSource item){
                    this.builder = new GlusterfsVolumeSourceBuilder(this, item);
            }
            GlusterfsVolumeSourceObjectNestedImpl(){
                    this.builder = new GlusterfsVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGlusterfsVolumeSourceObject(builder.build());
    }
    public N endGlusterfsVolumeSourceObject(){
            return and();
    }

}
    public class NamespaceStatusObjectNestedImpl<N> extends NamespaceStatusFluentImpl<WatchEventFluent.NamespaceStatusObjectNested<N>> implements WatchEventFluent.NamespaceStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceStatusBuilder builder;
    
            NamespaceStatusObjectNestedImpl(NamespaceStatus item){
                    this.builder = new NamespaceStatusBuilder(this, item);
            }
            NamespaceStatusObjectNestedImpl(){
                    this.builder = new NamespaceStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamespaceStatusObject(builder.build());
    }
    public N endNamespaceStatusObject(){
            return and();
    }

}
    public class OpenshiftRoleObjectNestedImpl<N> extends OpenshiftRoleFluentImpl<WatchEventFluent.OpenshiftRoleObjectNested<N>> implements WatchEventFluent.OpenshiftRoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
    
            OpenshiftRoleObjectNestedImpl(OpenshiftRole item){
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            OpenshiftRoleObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftRoleObject(builder.build());
    }
    public N endOpenshiftRoleObject(){
            return and();
    }

}
    public class CronJobSpecObjectNestedImpl<N> extends CronJobSpecFluentImpl<WatchEventFluent.CronJobSpecObjectNested<N>> implements WatchEventFluent.CronJobSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobSpecBuilder builder;
    
            CronJobSpecObjectNestedImpl(CronJobSpec item){
                    this.builder = new CronJobSpecBuilder(this, item);
            }
            CronJobSpecObjectNestedImpl(){
                    this.builder = new CronJobSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCronJobSpecObject(builder.build());
    }
    public N endCronJobSpecObject(){
            return and();
    }

}
    public class CustomResourceColumnDefinitionObjectNestedImpl<N> extends CustomResourceColumnDefinitionFluentImpl<WatchEventFluent.CustomResourceColumnDefinitionObjectNested<N>> implements WatchEventFluent.CustomResourceColumnDefinitionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceColumnDefinitionBuilder builder;
    
            CustomResourceColumnDefinitionObjectNestedImpl(CustomResourceColumnDefinition item){
                    this.builder = new CustomResourceColumnDefinitionBuilder(this, item);
            }
            CustomResourceColumnDefinitionObjectNestedImpl(){
                    this.builder = new CustomResourceColumnDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceColumnDefinitionObject(builder.build());
    }
    public N endCustomResourceColumnDefinitionObject(){
            return and();
    }

}
    public class ImageStreamSpecObjectNestedImpl<N> extends ImageStreamSpecFluentImpl<WatchEventFluent.ImageStreamSpecObjectNested<N>> implements WatchEventFluent.ImageStreamSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamSpecBuilder builder;
    
            ImageStreamSpecObjectNestedImpl(ImageStreamSpec item){
                    this.builder = new ImageStreamSpecBuilder(this, item);
            }
            ImageStreamSpecObjectNestedImpl(){
                    this.builder = new ImageStreamSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamSpecObject(builder.build());
    }
    public N endImageStreamSpecObject(){
            return and();
    }

}
    public class SecretEnvSourceObjectNestedImpl<N> extends SecretEnvSourceFluentImpl<WatchEventFluent.SecretEnvSourceObjectNested<N>> implements WatchEventFluent.SecretEnvSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretEnvSourceBuilder builder;
    
            SecretEnvSourceObjectNestedImpl(SecretEnvSource item){
                    this.builder = new SecretEnvSourceBuilder(this, item);
            }
            SecretEnvSourceObjectNestedImpl(){
                    this.builder = new SecretEnvSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretEnvSourceObject(builder.build());
    }
    public N endSecretEnvSourceObject(){
            return and();
    }

}
    public class OAuthClientObjectNestedImpl<N> extends OAuthClientFluentImpl<WatchEventFluent.OAuthClientObjectNested<N>> implements WatchEventFluent.OAuthClientObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientBuilder builder;
    
            OAuthClientObjectNestedImpl(OAuthClient item){
                    this.builder = new OAuthClientBuilder(this, item);
            }
            OAuthClientObjectNestedImpl(){
                    this.builder = new OAuthClientBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthClientObject(builder.build());
    }
    public N endOAuthClientObject(){
            return and();
    }

}
    public class IdentityObjectNestedImpl<N> extends IdentityFluentImpl<WatchEventFluent.IdentityObjectNested<N>> implements WatchEventFluent.IdentityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IdentityBuilder builder;
    
            IdentityObjectNestedImpl(Identity item){
                    this.builder = new IdentityBuilder(this, item);
            }
            IdentityObjectNestedImpl(){
                    this.builder = new IdentityBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIdentityObject(builder.build());
    }
    public N endIdentityObject(){
            return and();
    }

}
    public class AWSElasticBlockStoreVolumeSourceObjectNestedImpl<N> extends AWSElasticBlockStoreVolumeSourceFluentImpl<WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<N>> implements WatchEventFluent.AWSElasticBlockStoreVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AWSElasticBlockStoreVolumeSourceBuilder builder;
    
            AWSElasticBlockStoreVolumeSourceObjectNestedImpl(AWSElasticBlockStoreVolumeSource item){
                    this.builder = new AWSElasticBlockStoreVolumeSourceBuilder(this, item);
            }
            AWSElasticBlockStoreVolumeSourceObjectNestedImpl(){
                    this.builder = new AWSElasticBlockStoreVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAWSElasticBlockStoreVolumeSourceObject(builder.build());
    }
    public N endAWSElasticBlockStoreVolumeSourceObject(){
            return and();
    }

}
    public class MetricStatusObjectNestedImpl<N> extends MetricStatusFluentImpl<WatchEventFluent.MetricStatusObjectNested<N>> implements WatchEventFluent.MetricStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MetricStatusBuilder builder;
    
            MetricStatusObjectNestedImpl(MetricStatus item){
                    this.builder = new MetricStatusBuilder(this, item);
            }
            MetricStatusObjectNestedImpl(){
                    this.builder = new MetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withMetricStatusObject(builder.build());
    }
    public N endMetricStatusObject(){
            return and();
    }

}
    public class GenericWebHookCauseObjectNestedImpl<N> extends GenericWebHookCauseFluentImpl<WatchEventFluent.GenericWebHookCauseObjectNested<N>> implements WatchEventFluent.GenericWebHookCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GenericWebHookCauseBuilder builder;
    
            GenericWebHookCauseObjectNestedImpl(GenericWebHookCause item){
                    this.builder = new GenericWebHookCauseBuilder(this, item);
            }
            GenericWebHookCauseObjectNestedImpl(){
                    this.builder = new GenericWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGenericWebHookCauseObject(builder.build());
    }
    public N endGenericWebHookCauseObject(){
            return and();
    }

}
    public class ServiceAccountRestrictionObjectNestedImpl<N> extends ServiceAccountRestrictionFluentImpl<WatchEventFluent.ServiceAccountRestrictionObjectNested<N>> implements WatchEventFluent.ServiceAccountRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountRestrictionBuilder builder;
    
            ServiceAccountRestrictionObjectNestedImpl(ServiceAccountRestriction item){
                    this.builder = new ServiceAccountRestrictionBuilder(this, item);
            }
            ServiceAccountRestrictionObjectNestedImpl(){
                    this.builder = new ServiceAccountRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceAccountRestrictionObject(builder.build());
    }
    public N endServiceAccountRestrictionObject(){
            return and();
    }

}
    public class LimitRangeObjectNestedImpl<N> extends LimitRangeFluentImpl<WatchEventFluent.LimitRangeObjectNested<N>> implements WatchEventFluent.LimitRangeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeBuilder builder;
    
            LimitRangeObjectNestedImpl(LimitRange item){
                    this.builder = new LimitRangeBuilder(this, item);
            }
            LimitRangeObjectNestedImpl(){
                    this.builder = new LimitRangeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLimitRangeObject(builder.build());
    }
    public N endLimitRangeObject(){
            return and();
    }

}
    public class SecretLocalReferenceObjectNestedImpl<N> extends SecretLocalReferenceFluentImpl<WatchEventFluent.SecretLocalReferenceObjectNested<N>> implements WatchEventFluent.SecretLocalReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretLocalReferenceBuilder builder;
    
            SecretLocalReferenceObjectNestedImpl(SecretLocalReference item){
                    this.builder = new SecretLocalReferenceBuilder(this, item);
            }
            SecretLocalReferenceObjectNestedImpl(){
                    this.builder = new SecretLocalReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretLocalReferenceObject(builder.build());
    }
    public N endSecretLocalReferenceObject(){
            return and();
    }

}
    public class IDRangeObjectNestedImpl<N> extends IDRangeFluentImpl<WatchEventFluent.IDRangeObjectNested<N>> implements WatchEventFluent.IDRangeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IDRangeBuilder builder;
    
            IDRangeObjectNestedImpl(IDRange item){
                    this.builder = new IDRangeBuilder(this, item);
            }
            IDRangeObjectNestedImpl(){
                    this.builder = new IDRangeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIDRangeObject(builder.build());
    }
    public N endIDRangeObject(){
            return and();
    }

}
    public class UserRestrictionObjectNestedImpl<N> extends UserRestrictionFluentImpl<WatchEventFluent.UserRestrictionObjectNested<N>> implements WatchEventFluent.UserRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserRestrictionBuilder builder;
    
            UserRestrictionObjectNestedImpl(UserRestriction item){
                    this.builder = new UserRestrictionBuilder(this, item);
            }
            UserRestrictionObjectNestedImpl(){
                    this.builder = new UserRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withUserRestrictionObject(builder.build());
    }
    public N endUserRestrictionObject(){
            return and();
    }

}
    public class CSIPersistentVolumeSourceObjectNestedImpl<N> extends CSIPersistentVolumeSourceFluentImpl<WatchEventFluent.CSIPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.CSIPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CSIPersistentVolumeSourceBuilder builder;
    
            CSIPersistentVolumeSourceObjectNestedImpl(CSIPersistentVolumeSource item){
                    this.builder = new CSIPersistentVolumeSourceBuilder(this, item);
            }
            CSIPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new CSIPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCSIPersistentVolumeSourceObject(builder.build());
    }
    public N endCSIPersistentVolumeSourceObject(){
            return and();
    }

}
    public class ImageStreamImportObjectNestedImpl<N> extends ImageStreamImportFluentImpl<WatchEventFluent.ImageStreamImportObjectNested<N>> implements WatchEventFluent.ImageStreamImportObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportBuilder builder;
    
            ImageStreamImportObjectNestedImpl(ImageStreamImport item){
                    this.builder = new ImageStreamImportBuilder(this, item);
            }
            ImageStreamImportObjectNestedImpl(){
                    this.builder = new ImageStreamImportBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamImportObject(builder.build());
    }
    public N endImageStreamImportObject(){
            return and();
    }

}
    public class ReplicaSetSpecObjectNestedImpl<N> extends ReplicaSetSpecFluentImpl<WatchEventFluent.ReplicaSetSpecObjectNested<N>> implements WatchEventFluent.ReplicaSetSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetSpecBuilder builder;
    
            ReplicaSetSpecObjectNestedImpl(ReplicaSetSpec item){
                    this.builder = new ReplicaSetSpecBuilder(this, item);
            }
            ReplicaSetSpecObjectNestedImpl(){
                    this.builder = new ReplicaSetSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicaSetSpecObject(builder.build());
    }
    public N endReplicaSetSpecObject(){
            return and();
    }

}
    public class ResourceRequirementsObjectNestedImpl<N> extends ResourceRequirementsFluentImpl<WatchEventFluent.ResourceRequirementsObjectNested<N>> implements WatchEventFluent.ResourceRequirementsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceRequirementsBuilder builder;
    
            ResourceRequirementsObjectNestedImpl(ResourceRequirements item){
                    this.builder = new ResourceRequirementsBuilder(this, item);
            }
            ResourceRequirementsObjectNestedImpl(){
                    this.builder = new ResourceRequirementsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceRequirementsObject(builder.build());
    }
    public N endResourceRequirementsObject(){
            return and();
    }

}
    public class ExternalMetricSourceObjectNestedImpl<N> extends ExternalMetricSourceFluentImpl<WatchEventFluent.ExternalMetricSourceObjectNested<N>> implements WatchEventFluent.ExternalMetricSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExternalMetricSourceBuilder builder;
    
            ExternalMetricSourceObjectNestedImpl(ExternalMetricSource item){
                    this.builder = new ExternalMetricSourceBuilder(this, item);
            }
            ExternalMetricSourceObjectNestedImpl(){
                    this.builder = new ExternalMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExternalMetricSourceObject(builder.build());
    }
    public N endExternalMetricSourceObject(){
            return and();
    }

}
    public class GitHubWebHookCauseObjectNestedImpl<N> extends GitHubWebHookCauseFluentImpl<WatchEventFluent.GitHubWebHookCauseObjectNested<N>> implements WatchEventFluent.GitHubWebHookCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitHubWebHookCauseBuilder builder;
    
            GitHubWebHookCauseObjectNestedImpl(GitHubWebHookCause item){
                    this.builder = new GitHubWebHookCauseBuilder(this, item);
            }
            GitHubWebHookCauseObjectNestedImpl(){
                    this.builder = new GitHubWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGitHubWebHookCauseObject(builder.build());
    }
    public N endGitHubWebHookCauseObject(){
            return and();
    }

}
    public class PersistentVolumeClaimListObjectNestedImpl<N> extends PersistentVolumeClaimListFluentImpl<WatchEventFluent.PersistentVolumeClaimListObjectNested<N>> implements WatchEventFluent.PersistentVolumeClaimListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimListBuilder builder;
    
            PersistentVolumeClaimListObjectNestedImpl(PersistentVolumeClaimList item){
                    this.builder = new PersistentVolumeClaimListBuilder(this, item);
            }
            PersistentVolumeClaimListObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeClaimListObject(builder.build());
    }
    public N endPersistentVolumeClaimListObject(){
            return and();
    }

}
    public class OAuthClientListObjectNestedImpl<N> extends OAuthClientListFluentImpl<WatchEventFluent.OAuthClientListObjectNested<N>> implements WatchEventFluent.OAuthClientListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientListBuilder builder;
    
            OAuthClientListObjectNestedImpl(OAuthClientList item){
                    this.builder = new OAuthClientListBuilder(this, item);
            }
            OAuthClientListObjectNestedImpl(){
                    this.builder = new OAuthClientListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthClientListObject(builder.build());
    }
    public N endOAuthClientListObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingListObjectNestedImpl<N> extends OpenshiftRoleBindingListFluentImpl<WatchEventFluent.OpenshiftRoleBindingListObjectNested<N>> implements WatchEventFluent.OpenshiftRoleBindingListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingListBuilder builder;
    
            OpenshiftRoleBindingListObjectNestedImpl(OpenshiftRoleBindingList item){
                    this.builder = new OpenshiftRoleBindingListBuilder(this, item);
            }
            OpenshiftRoleBindingListObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftRoleBindingListObject(builder.build());
    }
    public N endOpenshiftRoleBindingListObject(){
            return and();
    }

}
    public class ResourceMetricSourceObjectNestedImpl<N> extends ResourceMetricSourceFluentImpl<WatchEventFluent.ResourceMetricSourceObjectNested<N>> implements WatchEventFluent.ResourceMetricSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceMetricSourceBuilder builder;
    
            ResourceMetricSourceObjectNestedImpl(ResourceMetricSource item){
                    this.builder = new ResourceMetricSourceBuilder(this, item);
            }
            ResourceMetricSourceObjectNestedImpl(){
                    this.builder = new ResourceMetricSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceMetricSourceObject(builder.build());
    }
    public N endResourceMetricSourceObject(){
            return and();
    }

}
    public class ReplicationControllerStatusObjectNestedImpl<N> extends ReplicationControllerStatusFluentImpl<WatchEventFluent.ReplicationControllerStatusObjectNested<N>> implements WatchEventFluent.ReplicationControllerStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerStatusBuilder builder;
    
            ReplicationControllerStatusObjectNestedImpl(ReplicationControllerStatus item){
                    this.builder = new ReplicationControllerStatusBuilder(this, item);
            }
            ReplicationControllerStatusObjectNestedImpl(){
                    this.builder = new ReplicationControllerStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicationControllerStatusObject(builder.build());
    }
    public N endReplicationControllerStatusObject(){
            return and();
    }

}
    public class IngressListObjectNestedImpl<N> extends IngressListFluentImpl<WatchEventFluent.IngressListObjectNested<N>> implements WatchEventFluent.IngressListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressListBuilder builder;
    
            IngressListObjectNestedImpl(IngressList item){
                    this.builder = new IngressListBuilder(this, item);
            }
            IngressListObjectNestedImpl(){
                    this.builder = new IngressListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressListObject(builder.build());
    }
    public N endIngressListObject(){
            return and();
    }

}
    public class MicroTimeObjectNestedImpl<N> extends MicroTimeFluentImpl<WatchEventFluent.MicroTimeObjectNested<N>> implements WatchEventFluent.MicroTimeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MicroTimeBuilder builder;
    
            MicroTimeObjectNestedImpl(MicroTime item){
                    this.builder = new MicroTimeBuilder(this, item);
            }
            MicroTimeObjectNestedImpl(){
                    this.builder = new MicroTimeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withMicroTimeObject(builder.build());
    }
    public N endMicroTimeObject(){
            return and();
    }

}
    public class ValidatingWebhookConfigurationListObjectNestedImpl<N> extends ValidatingWebhookConfigurationListFluentImpl<WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<N>> implements WatchEventFluent.ValidatingWebhookConfigurationListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ValidatingWebhookConfigurationListBuilder builder;
    
            ValidatingWebhookConfigurationListObjectNestedImpl(ValidatingWebhookConfigurationList item){
                    this.builder = new ValidatingWebhookConfigurationListBuilder(this, item);
            }
            ValidatingWebhookConfigurationListObjectNestedImpl(){
                    this.builder = new ValidatingWebhookConfigurationListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withValidatingWebhookConfigurationListObject(builder.build());
    }
    public N endValidatingWebhookConfigurationListObject(){
            return and();
    }

}
    public class PolicyRuleObjectNestedImpl<N> extends PolicyRuleFluentImpl<WatchEventFluent.PolicyRuleObjectNested<N>> implements WatchEventFluent.PolicyRuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PolicyRuleBuilder builder;
    
            PolicyRuleObjectNestedImpl(PolicyRule item){
                    this.builder = new PolicyRuleBuilder(this, item);
            }
            PolicyRuleObjectNestedImpl(){
                    this.builder = new PolicyRuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPolicyRuleObject(builder.build());
    }
    public N endPolicyRuleObject(){
            return and();
    }

}
    public class LifecycleObjectNestedImpl<N> extends LifecycleFluentImpl<WatchEventFluent.LifecycleObjectNested<N>> implements WatchEventFluent.LifecycleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleBuilder builder;
    
            LifecycleObjectNestedImpl(Lifecycle item){
                    this.builder = new LifecycleBuilder(this, item);
            }
            LifecycleObjectNestedImpl(){
                    this.builder = new LifecycleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLifecycleObject(builder.build());
    }
    public N endLifecycleObject(){
            return and();
    }

}
    public class RepositoryImportSpecObjectNestedImpl<N> extends RepositoryImportSpecFluentImpl<WatchEventFluent.RepositoryImportSpecObjectNested<N>> implements WatchEventFluent.RepositoryImportSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RepositoryImportSpecBuilder builder;
    
            RepositoryImportSpecObjectNestedImpl(RepositoryImportSpec item){
                    this.builder = new RepositoryImportSpecBuilder(this, item);
            }
            RepositoryImportSpecObjectNestedImpl(){
                    this.builder = new RepositoryImportSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRepositoryImportSpecObject(builder.build());
    }
    public N endRepositoryImportSpecObject(){
            return and();
    }

}
    public class PortworxVolumeSourceObjectNestedImpl<N> extends PortworxVolumeSourceFluentImpl<WatchEventFluent.PortworxVolumeSourceObjectNested<N>> implements WatchEventFluent.PortworxVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PortworxVolumeSourceBuilder builder;
    
            PortworxVolumeSourceObjectNestedImpl(PortworxVolumeSource item){
                    this.builder = new PortworxVolumeSourceBuilder(this, item);
            }
            PortworxVolumeSourceObjectNestedImpl(){
                    this.builder = new PortworxVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPortworxVolumeSourceObject(builder.build());
    }
    public N endPortworxVolumeSourceObject(){
            return and();
    }

}
    public class EventSourceObjectNestedImpl<N> extends EventSourceFluentImpl<WatchEventFluent.EventSourceObjectNested<N>> implements WatchEventFluent.EventSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventSourceBuilder builder;
    
            EventSourceObjectNestedImpl(EventSource item){
                    this.builder = new EventSourceBuilder(this, item);
            }
            EventSourceObjectNestedImpl(){
                    this.builder = new EventSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEventSourceObject(builder.build());
    }
    public N endEventSourceObject(){
            return and();
    }

}
    public class InitializerObjectNestedImpl<N> extends InitializerFluentImpl<WatchEventFluent.InitializerObjectNested<N>> implements WatchEventFluent.InitializerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InitializerBuilder builder;
    
            InitializerObjectNestedImpl(Initializer item){
                    this.builder = new InitializerBuilder(this, item);
            }
            InitializerObjectNestedImpl(){
                    this.builder = new InitializerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withInitializerObject(builder.build());
    }
    public N endInitializerObject(){
            return and();
    }

}
    public class ImageStreamImportStatusObjectNestedImpl<N> extends ImageStreamImportStatusFluentImpl<WatchEventFluent.ImageStreamImportStatusObjectNested<N>> implements WatchEventFluent.ImageStreamImportStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamImportStatusBuilder builder;
    
            ImageStreamImportStatusObjectNestedImpl(ImageStreamImportStatus item){
                    this.builder = new ImageStreamImportStatusBuilder(this, item);
            }
            ImageStreamImportStatusObjectNestedImpl(){
                    this.builder = new ImageStreamImportStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamImportStatusObject(builder.build());
    }
    public N endImageStreamImportStatusObject(){
            return and();
    }

}
    public class HTTPIngressRuleValueObjectNestedImpl<N> extends HTTPIngressRuleValueFluentImpl<WatchEventFluent.HTTPIngressRuleValueObjectNested<N>> implements WatchEventFluent.HTTPIngressRuleValueObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPIngressRuleValueBuilder builder;
    
            HTTPIngressRuleValueObjectNestedImpl(HTTPIngressRuleValue item){
                    this.builder = new HTTPIngressRuleValueBuilder(this, item);
            }
            HTTPIngressRuleValueObjectNestedImpl(){
                    this.builder = new HTTPIngressRuleValueBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHTTPIngressRuleValueObject(builder.build());
    }
    public N endHTTPIngressRuleValueObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionObjectNestedImpl<N> extends OpenshiftRoleBindingRestrictionFluentImpl<WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<N>> implements WatchEventFluent.OpenshiftRoleBindingRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionBuilder builder;
    
            OpenshiftRoleBindingRestrictionObjectNestedImpl(OpenshiftRoleBindingRestriction item){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftRoleBindingRestrictionObject(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionObject(){
            return and();
    }

}
    public class ComponentConditionObjectNestedImpl<N> extends ComponentConditionFluentImpl<WatchEventFluent.ComponentConditionObjectNested<N>> implements WatchEventFluent.ComponentConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentConditionBuilder builder;
    
            ComponentConditionObjectNestedImpl(ComponentCondition item){
                    this.builder = new ComponentConditionBuilder(this, item);
            }
            ComponentConditionObjectNestedImpl(){
                    this.builder = new ComponentConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withComponentConditionObject(builder.build());
    }
    public N endComponentConditionObject(){
            return and();
    }

}
    public class ReplicationControllerSpecObjectNestedImpl<N> extends ReplicationControllerSpecFluentImpl<WatchEventFluent.ReplicationControllerSpecObjectNested<N>> implements WatchEventFluent.ReplicationControllerSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerSpecBuilder builder;
    
            ReplicationControllerSpecObjectNestedImpl(ReplicationControllerSpec item){
                    this.builder = new ReplicationControllerSpecBuilder(this, item);
            }
            ReplicationControllerSpecObjectNestedImpl(){
                    this.builder = new ReplicationControllerSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicationControllerSpecObject(builder.build());
    }
    public N endReplicationControllerSpecObject(){
            return and();
    }

}
    public class WebhookClientConfigObjectNestedImpl<N> extends WebhookClientConfigFluentImpl<WatchEventFluent.WebhookClientConfigObjectNested<N>> implements WatchEventFluent.WebhookClientConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebhookClientConfigBuilder builder;
    
            WebhookClientConfigObjectNestedImpl(WebhookClientConfig item){
                    this.builder = new WebhookClientConfigBuilder(this, item);
            }
            WebhookClientConfigObjectNestedImpl(){
                    this.builder = new WebhookClientConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withWebhookClientConfigObject(builder.build());
    }
    public N endWebhookClientConfigObject(){
            return and();
    }

}
    public class DeploymentTriggerImageChangeParamsObjectNestedImpl<N> extends DeploymentTriggerImageChangeParamsFluentImpl<WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<N>> implements WatchEventFluent.DeploymentTriggerImageChangeParamsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentTriggerImageChangeParamsBuilder builder;
    
            DeploymentTriggerImageChangeParamsObjectNestedImpl(DeploymentTriggerImageChangeParams item){
                    this.builder = new DeploymentTriggerImageChangeParamsBuilder(this, item);
            }
            DeploymentTriggerImageChangeParamsObjectNestedImpl(){
                    this.builder = new DeploymentTriggerImageChangeParamsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentTriggerImageChangeParamsObject(builder.build());
    }
    public N endDeploymentTriggerImageChangeParamsObject(){
            return and();
    }

}
    public class RoleBindingObjectNestedImpl<N> extends RoleBindingFluentImpl<WatchEventFluent.RoleBindingObjectNested<N>> implements WatchEventFluent.RoleBindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBindingBuilder builder;
    
            RoleBindingObjectNestedImpl(RoleBinding item){
                    this.builder = new RoleBindingBuilder(this, item);
            }
            RoleBindingObjectNestedImpl(){
                    this.builder = new RoleBindingBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRoleBindingObject(builder.build());
    }
    public N endRoleBindingObject(){
            return and();
    }

}
    public class PodPresetObjectNestedImpl<N> extends PodPresetFluentImpl<WatchEventFluent.PodPresetObjectNested<N>> implements WatchEventFluent.PodPresetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodPresetBuilder builder;
    
            PodPresetObjectNestedImpl(PodPreset item){
                    this.builder = new PodPresetBuilder(this, item);
            }
            PodPresetObjectNestedImpl(){
                    this.builder = new PodPresetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodPresetObject(builder.build());
    }
    public N endPodPresetObject(){
            return and();
    }

}
    public class RollingUpdateDeploymentObjectNestedImpl<N> extends RollingUpdateDeploymentFluentImpl<WatchEventFluent.RollingUpdateDeploymentObjectNested<N>> implements WatchEventFluent.RollingUpdateDeploymentObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingUpdateDeploymentBuilder builder;
    
            RollingUpdateDeploymentObjectNestedImpl(RollingUpdateDeployment item){
                    this.builder = new RollingUpdateDeploymentBuilder(this, item);
            }
            RollingUpdateDeploymentObjectNestedImpl(){
                    this.builder = new RollingUpdateDeploymentBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRollingUpdateDeploymentObject(builder.build());
    }
    public N endRollingUpdateDeploymentObject(){
            return and();
    }

}
    public class EmptyDirVolumeSourceObjectNestedImpl<N> extends EmptyDirVolumeSourceFluentImpl<WatchEventFluent.EmptyDirVolumeSourceObjectNested<N>> implements WatchEventFluent.EmptyDirVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EmptyDirVolumeSourceBuilder builder;
    
            EmptyDirVolumeSourceObjectNestedImpl(EmptyDirVolumeSource item){
                    this.builder = new EmptyDirVolumeSourceBuilder(this, item);
            }
            EmptyDirVolumeSourceObjectNestedImpl(){
                    this.builder = new EmptyDirVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEmptyDirVolumeSourceObject(builder.build());
    }
    public N endEmptyDirVolumeSourceObject(){
            return and();
    }

}
    public class TagImageHookObjectNestedImpl<N> extends TagImageHookFluentImpl<WatchEventFluent.TagImageHookObjectNested<N>> implements WatchEventFluent.TagImageHookObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagImageHookBuilder builder;
    
            TagImageHookObjectNestedImpl(TagImageHook item){
                    this.builder = new TagImageHookBuilder(this, item);
            }
            TagImageHookObjectNestedImpl(){
                    this.builder = new TagImageHookBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTagImageHookObject(builder.build());
    }
    public N endTagImageHookObject(){
            return and();
    }

}
    public class RouteTargetReferenceObjectNestedImpl<N> extends RouteTargetReferenceFluentImpl<WatchEventFluent.RouteTargetReferenceObjectNested<N>> implements WatchEventFluent.RouteTargetReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteTargetReferenceBuilder builder;
    
            RouteTargetReferenceObjectNestedImpl(RouteTargetReference item){
                    this.builder = new RouteTargetReferenceBuilder(this, item);
            }
            RouteTargetReferenceObjectNestedImpl(){
                    this.builder = new RouteTargetReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteTargetReferenceObject(builder.build());
    }
    public N endRouteTargetReferenceObject(){
            return and();
    }

}
    public class AzureDiskVolumeSourceObjectNestedImpl<N> extends AzureDiskVolumeSourceFluentImpl<WatchEventFluent.AzureDiskVolumeSourceObjectNested<N>> implements WatchEventFluent.AzureDiskVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureDiskVolumeSourceBuilder builder;
    
            AzureDiskVolumeSourceObjectNestedImpl(AzureDiskVolumeSource item){
                    this.builder = new AzureDiskVolumeSourceBuilder(this, item);
            }
            AzureDiskVolumeSourceObjectNestedImpl(){
                    this.builder = new AzureDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAzureDiskVolumeSourceObject(builder.build());
    }
    public N endAzureDiskVolumeSourceObject(){
            return and();
    }

}
    public class ProjectObjectNestedImpl<N> extends ProjectFluentImpl<WatchEventFluent.ProjectObjectNested<N>> implements WatchEventFluent.ProjectObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectBuilder builder;
    
            ProjectObjectNestedImpl(Project item){
                    this.builder = new ProjectBuilder(this, item);
            }
            ProjectObjectNestedImpl(){
                    this.builder = new ProjectBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProjectObject(builder.build());
    }
    public N endProjectObject(){
            return and();
    }

}
    public class InfoObjectNestedImpl<N> extends InfoFluentImpl<WatchEventFluent.InfoObjectNested<N>> implements WatchEventFluent.InfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final InfoBuilder builder;
    
            InfoObjectNestedImpl(Info item){
                    this.builder = new InfoBuilder(this, item);
            }
            InfoObjectNestedImpl(){
                    this.builder = new InfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withInfoObject(builder.build());
    }
    public N endInfoObject(){
            return and();
    }

}
    public class ServiceStatusObjectNestedImpl<N> extends ServiceStatusFluentImpl<WatchEventFluent.ServiceStatusObjectNested<N>> implements WatchEventFluent.ServiceStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceStatusBuilder builder;
    
            ServiceStatusObjectNestedImpl(ServiceStatus item){
                    this.builder = new ServiceStatusBuilder(this, item);
            }
            ServiceStatusObjectNestedImpl(){
                    this.builder = new ServiceStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceStatusObject(builder.build());
    }
    public N endServiceStatusObject(){
            return and();
    }

}
    public class TaintObjectNestedImpl<N> extends TaintFluentImpl<WatchEventFluent.TaintObjectNested<N>> implements WatchEventFluent.TaintObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TaintBuilder builder;
    
            TaintObjectNestedImpl(Taint item){
                    this.builder = new TaintBuilder(this, item);
            }
            TaintObjectNestedImpl(){
                    this.builder = new TaintBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTaintObject(builder.build());
    }
    public N endTaintObject(){
            return and();
    }

}
    public class OpenshiftRoleBindingRestrictionSpecObjectNestedImpl<N> extends OpenshiftRoleBindingRestrictionSpecFluentImpl<WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<N>> implements WatchEventFluent.OpenshiftRoleBindingRestrictionSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBindingRestrictionSpecBuilder builder;
    
            OpenshiftRoleBindingRestrictionSpecObjectNestedImpl(OpenshiftRoleBindingRestrictionSpec item){
                    this.builder = new OpenshiftRoleBindingRestrictionSpecBuilder(this, item);
            }
            OpenshiftRoleBindingRestrictionSpecObjectNestedImpl(){
                    this.builder = new OpenshiftRoleBindingRestrictionSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftRoleBindingRestrictionSpecObject(builder.build());
    }
    public N endOpenshiftRoleBindingRestrictionSpecObject(){
            return and();
    }

}
    public class AllowedHostPathObjectNestedImpl<N> extends AllowedHostPathFluentImpl<WatchEventFluent.AllowedHostPathObjectNested<N>> implements WatchEventFluent.AllowedHostPathObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AllowedHostPathBuilder builder;
    
            AllowedHostPathObjectNestedImpl(AllowedHostPath item){
                    this.builder = new AllowedHostPathBuilder(this, item);
            }
            AllowedHostPathObjectNestedImpl(){
                    this.builder = new AllowedHostPathBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAllowedHostPathObject(builder.build());
    }
    public N endAllowedHostPathObject(){
            return and();
    }

}
    public class DeploymentConfigListObjectNestedImpl<N> extends DeploymentConfigListFluentImpl<WatchEventFluent.DeploymentConfigListObjectNested<N>> implements WatchEventFluent.DeploymentConfigListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigListBuilder builder;
    
            DeploymentConfigListObjectNestedImpl(DeploymentConfigList item){
                    this.builder = new DeploymentConfigListBuilder(this, item);
            }
            DeploymentConfigListObjectNestedImpl(){
                    this.builder = new DeploymentConfigListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentConfigListObject(builder.build());
    }
    public N endDeploymentConfigListObject(){
            return and();
    }

}
    public class BuildConfigObjectNestedImpl<N> extends BuildConfigFluentImpl<WatchEventFluent.BuildConfigObjectNested<N>> implements WatchEventFluent.BuildConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigBuilder builder;
    
            BuildConfigObjectNestedImpl(BuildConfig item){
                    this.builder = new BuildConfigBuilder(this, item);
            }
            BuildConfigObjectNestedImpl(){
                    this.builder = new BuildConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildConfigObject(builder.build());
    }
    public N endBuildConfigObject(){
            return and();
    }

}
    public class CustomResourceConversionObjectNestedImpl<N> extends CustomResourceConversionFluentImpl<WatchEventFluent.CustomResourceConversionObjectNested<N>> implements WatchEventFluent.CustomResourceConversionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceConversionBuilder builder;
    
            CustomResourceConversionObjectNestedImpl(CustomResourceConversion item){
                    this.builder = new CustomResourceConversionBuilder(this, item);
            }
            CustomResourceConversionObjectNestedImpl(){
                    this.builder = new CustomResourceConversionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceConversionObject(builder.build());
    }
    public N endCustomResourceConversionObject(){
            return and();
    }

}
    public class CustomResourceDefinitionNamesObjectNestedImpl<N> extends CustomResourceDefinitionNamesFluentImpl<WatchEventFluent.CustomResourceDefinitionNamesObjectNested<N>> implements WatchEventFluent.CustomResourceDefinitionNamesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionNamesBuilder builder;
    
            CustomResourceDefinitionNamesObjectNestedImpl(CustomResourceDefinitionNames item){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this, item);
            }
            CustomResourceDefinitionNamesObjectNestedImpl(){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceDefinitionNamesObject(builder.build());
    }
    public N endCustomResourceDefinitionNamesObject(){
            return and();
    }

}
    public class ImageImportStatusObjectNestedImpl<N> extends ImageImportStatusFluentImpl<WatchEventFluent.ImageImportStatusObjectNested<N>> implements WatchEventFluent.ImageImportStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageImportStatusBuilder builder;
    
            ImageImportStatusObjectNestedImpl(ImageImportStatus item){
                    this.builder = new ImageImportStatusBuilder(this, item);
            }
            ImageImportStatusObjectNestedImpl(){
                    this.builder = new ImageImportStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageImportStatusObject(builder.build());
    }
    public N endImageImportStatusObject(){
            return and();
    }

}
    public class IngressTLSObjectNestedImpl<N> extends IngressTLSFluentImpl<WatchEventFluent.IngressTLSObjectNested<N>> implements WatchEventFluent.IngressTLSObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressTLSBuilder builder;
    
            IngressTLSObjectNestedImpl(IngressTLS item){
                    this.builder = new IngressTLSBuilder(this, item);
            }
            IngressTLSObjectNestedImpl(){
                    this.builder = new IngressTLSBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressTLSObject(builder.build());
    }
    public N endIngressTLSObject(){
            return and();
    }

}
    public class CustomResourceValidationObjectNestedImpl<N> extends CustomResourceValidationFluentImpl<WatchEventFluent.CustomResourceValidationObjectNested<N>> implements WatchEventFluent.CustomResourceValidationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceValidationBuilder builder;
    
            CustomResourceValidationObjectNestedImpl(CustomResourceValidation item){
                    this.builder = new CustomResourceValidationBuilder(this, item);
            }
            CustomResourceValidationObjectNestedImpl(){
                    this.builder = new CustomResourceValidationBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceValidationObject(builder.build());
    }
    public N endCustomResourceValidationObject(){
            return and();
    }

}
    public class PodDisruptionBudgetListObjectNestedImpl<N> extends PodDisruptionBudgetListFluentImpl<WatchEventFluent.PodDisruptionBudgetListObjectNested<N>> implements WatchEventFluent.PodDisruptionBudgetListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetListBuilder builder;
    
            PodDisruptionBudgetListObjectNestedImpl(PodDisruptionBudgetList item){
                    this.builder = new PodDisruptionBudgetListBuilder(this, item);
            }
            PodDisruptionBudgetListObjectNestedImpl(){
                    this.builder = new PodDisruptionBudgetListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodDisruptionBudgetListObject(builder.build());
    }
    public N endPodDisruptionBudgetListObject(){
            return and();
    }

}
    public class DeploymentConfigStatusObjectNestedImpl<N> extends DeploymentConfigStatusFluentImpl<WatchEventFluent.DeploymentConfigStatusObjectNested<N>> implements WatchEventFluent.DeploymentConfigStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigStatusBuilder builder;
    
            DeploymentConfigStatusObjectNestedImpl(DeploymentConfigStatus item){
                    this.builder = new DeploymentConfigStatusBuilder(this, item);
            }
            DeploymentConfigStatusObjectNestedImpl(){
                    this.builder = new DeploymentConfigStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentConfigStatusObject(builder.build());
    }
    public N endDeploymentConfigStatusObject(){
            return and();
    }

}
    public class GlusterfsPersistentVolumeSourceObjectNestedImpl<N> extends GlusterfsPersistentVolumeSourceFluentImpl<WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.GlusterfsPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GlusterfsPersistentVolumeSourceBuilder builder;
    
            GlusterfsPersistentVolumeSourceObjectNestedImpl(GlusterfsPersistentVolumeSource item){
                    this.builder = new GlusterfsPersistentVolumeSourceBuilder(this, item);
            }
            GlusterfsPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new GlusterfsPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGlusterfsPersistentVolumeSourceObject(builder.build());
    }
    public N endGlusterfsPersistentVolumeSourceObject(){
            return and();
    }

}
    public class ClusterRoleObjectNestedImpl<N> extends ClusterRoleFluentImpl<WatchEventFluent.ClusterRoleObjectNested<N>> implements WatchEventFluent.ClusterRoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBuilder builder;
    
            ClusterRoleObjectNestedImpl(ClusterRole item){
                    this.builder = new ClusterRoleBuilder(this, item);
            }
            ClusterRoleObjectNestedImpl(){
                    this.builder = new ClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withClusterRoleObject(builder.build());
    }
    public N endClusterRoleObject(){
            return and();
    }

}
    public class ClusterRoleBindingListObjectNestedImpl<N> extends ClusterRoleBindingListFluentImpl<WatchEventFluent.ClusterRoleBindingListObjectNested<N>> implements WatchEventFluent.ClusterRoleBindingListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleBindingListBuilder builder;
    
            ClusterRoleBindingListObjectNestedImpl(ClusterRoleBindingList item){
                    this.builder = new ClusterRoleBindingListBuilder(this, item);
            }
            ClusterRoleBindingListObjectNestedImpl(){
                    this.builder = new ClusterRoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withClusterRoleBindingListObject(builder.build());
    }
    public N endClusterRoleBindingListObject(){
            return and();
    }

}
    public class TokenReviewStatusObjectNestedImpl<N> extends TokenReviewStatusFluentImpl<WatchEventFluent.TokenReviewStatusObjectNested<N>> implements WatchEventFluent.TokenReviewStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewStatusBuilder builder;
    
            TokenReviewStatusObjectNestedImpl(TokenReviewStatus item){
                    this.builder = new TokenReviewStatusBuilder(this, item);
            }
            TokenReviewStatusObjectNestedImpl(){
                    this.builder = new TokenReviewStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTokenReviewStatusObject(builder.build());
    }
    public N endTokenReviewStatusObject(){
            return and();
    }

}
    public class TagEventObjectNestedImpl<N> extends TagEventFluentImpl<WatchEventFluent.TagEventObjectNested<N>> implements WatchEventFluent.TagEventObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagEventBuilder builder;
    
            TagEventObjectNestedImpl(TagEvent item){
                    this.builder = new TagEventBuilder(this, item);
            }
            TagEventObjectNestedImpl(){
                    this.builder = new TagEventBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTagEventObject(builder.build());
    }
    public N endTagEventObject(){
            return and();
    }

}
    public class ImageStreamTagListObjectNestedImpl<N> extends ImageStreamTagListFluentImpl<WatchEventFluent.ImageStreamTagListObjectNested<N>> implements WatchEventFluent.ImageStreamTagListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamTagListBuilder builder;
    
            ImageStreamTagListObjectNestedImpl(ImageStreamTagList item){
                    this.builder = new ImageStreamTagListBuilder(this, item);
            }
            ImageStreamTagListObjectNestedImpl(){
                    this.builder = new ImageStreamTagListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamTagListObject(builder.build());
    }
    public N endImageStreamTagListObject(){
            return and();
    }

}
    public class CustomResourceSubresourceStatusObjectNestedImpl<N> extends CustomResourceSubresourceStatusFluentImpl<WatchEventFluent.CustomResourceSubresourceStatusObjectNested<N>> implements WatchEventFluent.CustomResourceSubresourceStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourceStatusBuilder builder;
    
            CustomResourceSubresourceStatusObjectNestedImpl(CustomResourceSubresourceStatus item){
                    this.builder = new CustomResourceSubresourceStatusBuilder(this, item);
            }
            CustomResourceSubresourceStatusObjectNestedImpl(){
                    this.builder = new CustomResourceSubresourceStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCustomResourceSubresourceStatusObject(builder.build());
    }
    public N endCustomResourceSubresourceStatusObject(){
            return and();
    }

}
    public class ISCSIPersistentVolumeSourceObjectNestedImpl<N> extends ISCSIPersistentVolumeSourceFluentImpl<WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.ISCSIPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ISCSIPersistentVolumeSourceBuilder builder;
    
            ISCSIPersistentVolumeSourceObjectNestedImpl(ISCSIPersistentVolumeSource item){
                    this.builder = new ISCSIPersistentVolumeSourceBuilder(this, item);
            }
            ISCSIPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new ISCSIPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withISCSIPersistentVolumeSourceObject(builder.build());
    }
    public N endISCSIPersistentVolumeSourceObject(){
            return and();
    }

}
    public class DownwardAPIVolumeSourceObjectNestedImpl<N> extends DownwardAPIVolumeSourceFluentImpl<WatchEventFluent.DownwardAPIVolumeSourceObjectNested<N>> implements WatchEventFluent.DownwardAPIVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DownwardAPIVolumeSourceBuilder builder;
    
            DownwardAPIVolumeSourceObjectNestedImpl(DownwardAPIVolumeSource item){
                    this.builder = new DownwardAPIVolumeSourceBuilder(this, item);
            }
            DownwardAPIVolumeSourceObjectNestedImpl(){
                    this.builder = new DownwardAPIVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDownwardAPIVolumeSourceObject(builder.build());
    }
    public N endDownwardAPIVolumeSourceObject(){
            return and();
    }

}
    public class ListMetaObjectNestedImpl<N> extends ListMetaFluentImpl<WatchEventFluent.ListMetaObjectNested<N>> implements WatchEventFluent.ListMetaObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            ListMetaObjectNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            ListMetaObjectNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withListMetaObject(builder.build());
    }
    public N endListMetaObject(){
            return and();
    }

}
    public class RootPathsObjectNestedImpl<N> extends RootPathsFluentImpl<WatchEventFluent.RootPathsObjectNested<N>> implements WatchEventFluent.RootPathsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RootPathsBuilder builder;
    
            RootPathsObjectNestedImpl(RootPaths item){
                    this.builder = new RootPathsBuilder(this, item);
            }
            RootPathsObjectNestedImpl(){
                    this.builder = new RootPathsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRootPathsObject(builder.build());
    }
    public N endRootPathsObject(){
            return and();
    }

}
    public class SecretReferenceObjectNestedImpl<N> extends SecretReferenceFluentImpl<WatchEventFluent.SecretReferenceObjectNested<N>> implements WatchEventFluent.SecretReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            SecretReferenceObjectNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            SecretReferenceObjectNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretReferenceObject(builder.build());
    }
    public N endSecretReferenceObject(){
            return and();
    }

}
    public class SourceStrategyOptionsObjectNestedImpl<N> extends SourceStrategyOptionsFluentImpl<WatchEventFluent.SourceStrategyOptionsObjectNested<N>> implements WatchEventFluent.SourceStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceStrategyOptionsBuilder builder;
    
            SourceStrategyOptionsObjectNestedImpl(SourceStrategyOptions item){
                    this.builder = new SourceStrategyOptionsBuilder(this, item);
            }
            SourceStrategyOptionsObjectNestedImpl(){
                    this.builder = new SourceStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSourceStrategyOptionsObject(builder.build());
    }
    public N endSourceStrategyOptionsObject(){
            return and();
    }

}
    public class ISCSIVolumeSourceObjectNestedImpl<N> extends ISCSIVolumeSourceFluentImpl<WatchEventFluent.ISCSIVolumeSourceObjectNested<N>> implements WatchEventFluent.ISCSIVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ISCSIVolumeSourceBuilder builder;
    
            ISCSIVolumeSourceObjectNestedImpl(ISCSIVolumeSource item){
                    this.builder = new ISCSIVolumeSourceBuilder(this, item);
            }
            ISCSIVolumeSourceObjectNestedImpl(){
                    this.builder = new ISCSIVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withISCSIVolumeSourceObject(builder.build());
    }
    public N endISCSIVolumeSourceObject(){
            return and();
    }

}
    public class SecretKeySelectorObjectNestedImpl<N> extends SecretKeySelectorFluentImpl<WatchEventFluent.SecretKeySelectorObjectNested<N>> implements WatchEventFluent.SecretKeySelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretKeySelectorBuilder builder;
    
            SecretKeySelectorObjectNestedImpl(SecretKeySelector item){
                    this.builder = new SecretKeySelectorBuilder(this, item);
            }
            SecretKeySelectorObjectNestedImpl(){
                    this.builder = new SecretKeySelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretKeySelectorObject(builder.build());
    }
    public N endSecretKeySelectorObject(){
            return and();
    }

}
    public class OAuthAuthorizeTokenObjectNestedImpl<N> extends OAuthAuthorizeTokenFluentImpl<WatchEventFluent.OAuthAuthorizeTokenObjectNested<N>> implements WatchEventFluent.OAuthAuthorizeTokenObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAuthorizeTokenBuilder builder;
    
            OAuthAuthorizeTokenObjectNestedImpl(OAuthAuthorizeToken item){
                    this.builder = new OAuthAuthorizeTokenBuilder(this, item);
            }
            OAuthAuthorizeTokenObjectNestedImpl(){
                    this.builder = new OAuthAuthorizeTokenBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthAuthorizeTokenObject(builder.build());
    }
    public N endOAuthAuthorizeTokenObject(){
            return and();
    }

}
    public class QuobyteVolumeSourceObjectNestedImpl<N> extends QuobyteVolumeSourceFluentImpl<WatchEventFluent.QuobyteVolumeSourceObjectNested<N>> implements WatchEventFluent.QuobyteVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuobyteVolumeSourceBuilder builder;
    
            QuobyteVolumeSourceObjectNestedImpl(QuobyteVolumeSource item){
                    this.builder = new QuobyteVolumeSourceBuilder(this, item);
            }
            QuobyteVolumeSourceObjectNestedImpl(){
                    this.builder = new QuobyteVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withQuobyteVolumeSourceObject(builder.build());
    }
    public N endQuobyteVolumeSourceObject(){
            return and();
    }

}
    public class DockerBuildStrategyObjectNestedImpl<N> extends DockerBuildStrategyFluentImpl<WatchEventFluent.DockerBuildStrategyObjectNested<N>> implements WatchEventFluent.DockerBuildStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DockerBuildStrategyBuilder builder;
    
            DockerBuildStrategyObjectNestedImpl(DockerBuildStrategy item){
                    this.builder = new DockerBuildStrategyBuilder(this, item);
            }
            DockerBuildStrategyObjectNestedImpl(){
                    this.builder = new DockerBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDockerBuildStrategyObject(builder.build());
    }
    public N endDockerBuildStrategyObject(){
            return and();
    }

}
    public class SignatureConditionObjectNestedImpl<N> extends SignatureConditionFluentImpl<WatchEventFluent.SignatureConditionObjectNested<N>> implements WatchEventFluent.SignatureConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SignatureConditionBuilder builder;
    
            SignatureConditionObjectNestedImpl(SignatureCondition item){
                    this.builder = new SignatureConditionBuilder(this, item);
            }
            SignatureConditionObjectNestedImpl(){
                    this.builder = new SignatureConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSignatureConditionObject(builder.build());
    }
    public N endSignatureConditionObject(){
            return and();
    }

}
    public class JobSpecObjectNestedImpl<N> extends JobSpecFluentImpl<WatchEventFluent.JobSpecObjectNested<N>> implements WatchEventFluent.JobSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobSpecBuilder builder;
    
            JobSpecObjectNestedImpl(JobSpec item){
                    this.builder = new JobSpecBuilder(this, item);
            }
            JobSpecObjectNestedImpl(){
                    this.builder = new JobSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJobSpecObject(builder.build());
    }
    public N endJobSpecObject(){
            return and();
    }

}
    public class ResourceQuotaStatusObjectNestedImpl<N> extends ResourceQuotaStatusFluentImpl<WatchEventFluent.ResourceQuotaStatusObjectNested<N>> implements WatchEventFluent.ResourceQuotaStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaStatusBuilder builder;
    
            ResourceQuotaStatusObjectNestedImpl(ResourceQuotaStatus item){
                    this.builder = new ResourceQuotaStatusBuilder(this, item);
            }
            ResourceQuotaStatusObjectNestedImpl(){
                    this.builder = new ResourceQuotaStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceQuotaStatusObject(builder.build());
    }
    public N endResourceQuotaStatusObject(){
            return and();
    }

}
    public class ExternalMetricStatusObjectNestedImpl<N> extends ExternalMetricStatusFluentImpl<WatchEventFluent.ExternalMetricStatusObjectNested<N>> implements WatchEventFluent.ExternalMetricStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExternalMetricStatusBuilder builder;
    
            ExternalMetricStatusObjectNestedImpl(ExternalMetricStatus item){
                    this.builder = new ExternalMetricStatusBuilder(this, item);
            }
            ExternalMetricStatusObjectNestedImpl(){
                    this.builder = new ExternalMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExternalMetricStatusObject(builder.build());
    }
    public N endExternalMetricStatusObject(){
            return and();
    }

}
    public class ScopedResourceSelectorRequirementObjectNestedImpl<N> extends ScopedResourceSelectorRequirementFluentImpl<WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<N>> implements WatchEventFluent.ScopedResourceSelectorRequirementObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScopedResourceSelectorRequirementBuilder builder;
    
            ScopedResourceSelectorRequirementObjectNestedImpl(ScopedResourceSelectorRequirement item){
                    this.builder = new ScopedResourceSelectorRequirementBuilder(this, item);
            }
            ScopedResourceSelectorRequirementObjectNestedImpl(){
                    this.builder = new ScopedResourceSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScopedResourceSelectorRequirementObject(builder.build());
    }
    public N endScopedResourceSelectorRequirementObject(){
            return and();
    }

}
    public class DeploymentCauseObjectNestedImpl<N> extends DeploymentCauseFluentImpl<WatchEventFluent.DeploymentCauseObjectNested<N>> implements WatchEventFluent.DeploymentCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentCauseBuilder builder;
    
            DeploymentCauseObjectNestedImpl(DeploymentCause item){
                    this.builder = new DeploymentCauseBuilder(this, item);
            }
            DeploymentCauseObjectNestedImpl(){
                    this.builder = new DeploymentCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentCauseObject(builder.build());
    }
    public N endDeploymentCauseObject(){
            return and();
    }

}
    public class RepositoryImportStatusObjectNestedImpl<N> extends RepositoryImportStatusFluentImpl<WatchEventFluent.RepositoryImportStatusObjectNested<N>> implements WatchEventFluent.RepositoryImportStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RepositoryImportStatusBuilder builder;
    
            RepositoryImportStatusObjectNestedImpl(RepositoryImportStatus item){
                    this.builder = new RepositoryImportStatusBuilder(this, item);
            }
            RepositoryImportStatusObjectNestedImpl(){
                    this.builder = new RepositoryImportStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRepositoryImportStatusObject(builder.build());
    }
    public N endRepositoryImportStatusObject(){
            return and();
    }

}
    public class GroupListObjectNestedImpl<N> extends GroupListFluentImpl<WatchEventFluent.GroupListObjectNested<N>> implements WatchEventFluent.GroupListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupListBuilder builder;
    
            GroupListObjectNestedImpl(GroupList item){
                    this.builder = new GroupListBuilder(this, item);
            }
            GroupListObjectNestedImpl(){
                    this.builder = new GroupListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGroupListObject(builder.build());
    }
    public N endGroupListObject(){
            return and();
    }

}
    public class ProjectedVolumeSourceObjectNestedImpl<N> extends ProjectedVolumeSourceFluentImpl<WatchEventFluent.ProjectedVolumeSourceObjectNested<N>> implements WatchEventFluent.ProjectedVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectedVolumeSourceBuilder builder;
    
            ProjectedVolumeSourceObjectNestedImpl(ProjectedVolumeSource item){
                    this.builder = new ProjectedVolumeSourceBuilder(this, item);
            }
            ProjectedVolumeSourceObjectNestedImpl(){
                    this.builder = new ProjectedVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProjectedVolumeSourceObject(builder.build());
    }
    public N endProjectedVolumeSourceObject(){
            return and();
    }

}
    public class LifecycleHookObjectNestedImpl<N> extends LifecycleHookFluentImpl<WatchEventFluent.LifecycleHookObjectNested<N>> implements WatchEventFluent.LifecycleHookObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleHookBuilder builder;
    
            LifecycleHookObjectNestedImpl(LifecycleHook item){
                    this.builder = new LifecycleHookBuilder(this, item);
            }
            LifecycleHookObjectNestedImpl(){
                    this.builder = new LifecycleHookBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLifecycleHookObject(builder.build());
    }
    public N endLifecycleHookObject(){
            return and();
    }

}
    public class HandlerObjectNestedImpl<N> extends HandlerFluentImpl<WatchEventFluent.HandlerObjectNested<N>> implements WatchEventFluent.HandlerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HandlerBuilder builder;
    
            HandlerObjectNestedImpl(Handler item){
                    this.builder = new HandlerBuilder(this, item);
            }
            HandlerObjectNestedImpl(){
                    this.builder = new HandlerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHandlerObject(builder.build());
    }
    public N endHandlerObject(){
            return and();
    }

}
    public class ServiceAccountTokenProjectionObjectNestedImpl<N> extends ServiceAccountTokenProjectionFluentImpl<WatchEventFluent.ServiceAccountTokenProjectionObjectNested<N>> implements WatchEventFluent.ServiceAccountTokenProjectionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountTokenProjectionBuilder builder;
    
            ServiceAccountTokenProjectionObjectNestedImpl(ServiceAccountTokenProjection item){
                    this.builder = new ServiceAccountTokenProjectionBuilder(this, item);
            }
            ServiceAccountTokenProjectionObjectNestedImpl(){
                    this.builder = new ServiceAccountTokenProjectionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceAccountTokenProjectionObject(builder.build());
    }
    public N endServiceAccountTokenProjectionObject(){
            return and();
    }

}
    public class ContainerObjectNestedImpl<N> extends ContainerFluentImpl<WatchEventFluent.ContainerObjectNested<N>> implements WatchEventFluent.ContainerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerBuilder builder;
    
            ContainerObjectNestedImpl(Container item){
                    this.builder = new ContainerBuilder(this, item);
            }
            ContainerObjectNestedImpl(){
                    this.builder = new ContainerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerObject(builder.build());
    }
    public N endContainerObject(){
            return and();
    }

}
    public class TypedLocalObjectReferenceNestedImpl<N> extends TypedLocalObjectReferenceFluentImpl<WatchEventFluent.TypedLocalObjectReferenceNested<N>> implements WatchEventFluent.TypedLocalObjectReferenceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TypedLocalObjectReferenceBuilder builder;
    
            TypedLocalObjectReferenceNestedImpl(TypedLocalObjectReference item){
                    this.builder = new TypedLocalObjectReferenceBuilder(this, item);
            }
            TypedLocalObjectReferenceNestedImpl(){
                    this.builder = new TypedLocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTypedLocalObjectReference(builder.build());
    }
    public N endTypedLocalObjectReference(){
            return and();
    }

}
    public class SupplementalGroupsStrategyOptionsObjectNestedImpl<N> extends SupplementalGroupsStrategyOptionsFluentImpl<WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<N>> implements WatchEventFluent.SupplementalGroupsStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SupplementalGroupsStrategyOptionsBuilder builder;
    
            SupplementalGroupsStrategyOptionsObjectNestedImpl(SupplementalGroupsStrategyOptions item){
                    this.builder = new SupplementalGroupsStrategyOptionsBuilder(this, item);
            }
            SupplementalGroupsStrategyOptionsObjectNestedImpl(){
                    this.builder = new SupplementalGroupsStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSupplementalGroupsStrategyOptionsObject(builder.build());
    }
    public N endSupplementalGroupsStrategyOptionsObject(){
            return and();
    }

}
    public class CronJobListObjectNestedImpl<N> extends CronJobListFluentImpl<WatchEventFluent.CronJobListObjectNested<N>> implements WatchEventFluent.CronJobListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobListBuilder builder;
    
            CronJobListObjectNestedImpl(CronJobList item){
                    this.builder = new CronJobListBuilder(this, item);
            }
            CronJobListObjectNestedImpl(){
                    this.builder = new CronJobListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCronJobListObject(builder.build());
    }
    public N endCronJobListObject(){
            return and();
    }

}
    public class RollbackConfigObjectNestedImpl<N> extends RollbackConfigFluentImpl<WatchEventFluent.RollbackConfigObjectNested<N>> implements WatchEventFluent.RollbackConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollbackConfigBuilder builder;
    
            RollbackConfigObjectNestedImpl(RollbackConfig item){
                    this.builder = new RollbackConfigBuilder(this, item);
            }
            RollbackConfigObjectNestedImpl(){
                    this.builder = new RollbackConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRollbackConfigObject(builder.build());
    }
    public N endRollbackConfigObject(){
            return and();
    }

}
    public class RouteStatusObjectNestedImpl<N> extends RouteStatusFluentImpl<WatchEventFluent.RouteStatusObjectNested<N>> implements WatchEventFluent.RouteStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteStatusBuilder builder;
    
            RouteStatusObjectNestedImpl(RouteStatus item){
                    this.builder = new RouteStatusBuilder(this, item);
            }
            RouteStatusObjectNestedImpl(){
                    this.builder = new RouteStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteStatusObject(builder.build());
    }
    public N endRouteStatusObject(){
            return and();
    }

}
    public class PodConditionObjectNestedImpl<N> extends PodConditionFluentImpl<WatchEventFluent.PodConditionObjectNested<N>> implements WatchEventFluent.PodConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodConditionBuilder builder;
    
            PodConditionObjectNestedImpl(PodCondition item){
                    this.builder = new PodConditionBuilder(this, item);
            }
            PodConditionObjectNestedImpl(){
                    this.builder = new PodConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodConditionObject(builder.build());
    }
    public N endPodConditionObject(){
            return and();
    }

}
    public class DaemonSetConditionObjectNestedImpl<N> extends DaemonSetConditionFluentImpl<WatchEventFluent.DaemonSetConditionObjectNested<N>> implements WatchEventFluent.DaemonSetConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetConditionBuilder builder;
    
            DaemonSetConditionObjectNestedImpl(DaemonSetCondition item){
                    this.builder = new DaemonSetConditionBuilder(this, item);
            }
            DaemonSetConditionObjectNestedImpl(){
                    this.builder = new DaemonSetConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonSetConditionObject(builder.build());
    }
    public N endDaemonSetConditionObject(){
            return and();
    }

}
    public class DeploymentRollbackObjectNestedImpl<N> extends DeploymentRollbackFluentImpl<WatchEventFluent.DeploymentRollbackObjectNested<N>> implements WatchEventFluent.DeploymentRollbackObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentRollbackBuilder builder;
    
            DeploymentRollbackObjectNestedImpl(DeploymentRollback item){
                    this.builder = new DeploymentRollbackBuilder(this, item);
            }
            DeploymentRollbackObjectNestedImpl(){
                    this.builder = new DeploymentRollbackBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentRollbackObject(builder.build());
    }
    public N endDeploymentRollbackObject(){
            return and();
    }

}
    public class ExecActionObjectNestedImpl<N> extends ExecActionFluentImpl<WatchEventFluent.ExecActionObjectNested<N>> implements WatchEventFluent.ExecActionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecActionBuilder builder;
    
            ExecActionObjectNestedImpl(ExecAction item){
                    this.builder = new ExecActionBuilder(this, item);
            }
            ExecActionObjectNestedImpl(){
                    this.builder = new ExecActionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExecActionObject(builder.build());
    }
    public N endExecActionObject(){
            return and();
    }

}
    public class NamedTagEventListObjectNestedImpl<N> extends NamedTagEventListFluentImpl<WatchEventFluent.NamedTagEventListObjectNested<N>> implements WatchEventFluent.NamedTagEventListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedTagEventListBuilder builder;
    
            NamedTagEventListObjectNestedImpl(NamedTagEventList item){
                    this.builder = new NamedTagEventListBuilder(this, item);
            }
            NamedTagEventListObjectNestedImpl(){
                    this.builder = new NamedTagEventListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamedTagEventListObject(builder.build());
    }
    public N endNamedTagEventListObject(){
            return and();
    }

}
    public class TolerationObjectNestedImpl<N> extends TolerationFluentImpl<WatchEventFluent.TolerationObjectNested<N>> implements WatchEventFluent.TolerationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TolerationBuilder builder;
    
            TolerationObjectNestedImpl(Toleration item){
                    this.builder = new TolerationBuilder(this, item);
            }
            TolerationObjectNestedImpl(){
                    this.builder = new TolerationBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTolerationObject(builder.build());
    }
    public N endTolerationObject(){
            return and();
    }

}
    public class NodeSelectorObjectNestedImpl<N> extends NodeSelectorFluentImpl<WatchEventFluent.NodeSelectorObjectNested<N>> implements WatchEventFluent.NodeSelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorBuilder builder;
    
            NodeSelectorObjectNestedImpl(NodeSelector item){
                    this.builder = new NodeSelectorBuilder(this, item);
            }
            NodeSelectorObjectNestedImpl(){
                    this.builder = new NodeSelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeSelectorObject(builder.build());
    }
    public N endNodeSelectorObject(){
            return and();
    }

}
    public class WebhookObjectNestedImpl<N> extends WebhookFluentImpl<WatchEventFluent.WebhookObjectNested<N>> implements WatchEventFluent.WebhookObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebhookBuilder builder;
    
            WebhookObjectNestedImpl(Webhook item){
                    this.builder = new WebhookBuilder(this, item);
            }
            WebhookObjectNestedImpl(){
                    this.builder = new WebhookBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withWebhookObject(builder.build());
    }
    public N endWebhookObject(){
            return and();
    }

}
    public class RouteSpecObjectNestedImpl<N> extends RouteSpecFluentImpl<WatchEventFluent.RouteSpecObjectNested<N>> implements WatchEventFluent.RouteSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteSpecBuilder builder;
    
            RouteSpecObjectNestedImpl(RouteSpec item){
                    this.builder = new RouteSpecBuilder(this, item);
            }
            RouteSpecObjectNestedImpl(){
                    this.builder = new RouteSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteSpecObject(builder.build());
    }
    public N endRouteSpecObject(){
            return and();
    }

}
    public class CephFSPersistentVolumeSourceObjectNestedImpl<N> extends CephFSPersistentVolumeSourceFluentImpl<WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.CephFSPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CephFSPersistentVolumeSourceBuilder builder;
    
            CephFSPersistentVolumeSourceObjectNestedImpl(CephFSPersistentVolumeSource item){
                    this.builder = new CephFSPersistentVolumeSourceBuilder(this, item);
            }
            CephFSPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new CephFSPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCephFSPersistentVolumeSourceObject(builder.build());
    }
    public N endCephFSPersistentVolumeSourceObject(){
            return and();
    }

}
    public class PersistentVolumeClaimConditionObjectNestedImpl<N> extends PersistentVolumeClaimConditionFluentImpl<WatchEventFluent.PersistentVolumeClaimConditionObjectNested<N>> implements WatchEventFluent.PersistentVolumeClaimConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimConditionBuilder builder;
    
            PersistentVolumeClaimConditionObjectNestedImpl(PersistentVolumeClaimCondition item){
                    this.builder = new PersistentVolumeClaimConditionBuilder(this, item);
            }
            PersistentVolumeClaimConditionObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeClaimConditionObject(builder.build());
    }
    public N endPersistentVolumeClaimConditionObject(){
            return and();
    }

}
    public class PersistentVolumeListObjectNestedImpl<N> extends PersistentVolumeListFluentImpl<WatchEventFluent.PersistentVolumeListObjectNested<N>> implements WatchEventFluent.PersistentVolumeListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeListBuilder builder;
    
            PersistentVolumeListObjectNestedImpl(PersistentVolumeList item){
                    this.builder = new PersistentVolumeListBuilder(this, item);
            }
            PersistentVolumeListObjectNestedImpl(){
                    this.builder = new PersistentVolumeListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeListObject(builder.build());
    }
    public N endPersistentVolumeListObject(){
            return and();
    }

}
    public class ProjectRequestObjectNestedImpl<N> extends ProjectRequestFluentImpl<WatchEventFluent.ProjectRequestObjectNested<N>> implements WatchEventFluent.ProjectRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectRequestBuilder builder;
    
            ProjectRequestObjectNestedImpl(ProjectRequest item){
                    this.builder = new ProjectRequestBuilder(this, item);
            }
            ProjectRequestObjectNestedImpl(){
                    this.builder = new ProjectRequestBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withProjectRequestObject(builder.build());
    }
    public N endProjectRequestObject(){
            return and();
    }

}
    public class PriorityClassObjectNestedImpl<N> extends PriorityClassFluentImpl<WatchEventFluent.PriorityClassObjectNested<N>> implements WatchEventFluent.PriorityClassObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassBuilder builder;
    
            PriorityClassObjectNestedImpl(PriorityClass item){
                    this.builder = new PriorityClassBuilder(this, item);
            }
            PriorityClassObjectNestedImpl(){
                    this.builder = new PriorityClassBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPriorityClassObject(builder.build());
    }
    public N endPriorityClassObject(){
            return and();
    }

}
    public class TemplateObjectNestedImpl<N> extends TemplateFluentImpl<WatchEventFluent.TemplateObjectNested<N>> implements WatchEventFluent.TemplateObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TemplateBuilder builder;
    
            TemplateObjectNestedImpl(Template item){
                    this.builder = new TemplateBuilder(this, item);
            }
            TemplateObjectNestedImpl(){
                    this.builder = new TemplateBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTemplateObject(builder.build());
    }
    public N endTemplateObject(){
            return and();
    }

}
    public class PodDNSConfigOptionObjectNestedImpl<N> extends PodDNSConfigOptionFluentImpl<WatchEventFluent.PodDNSConfigOptionObjectNested<N>> implements WatchEventFluent.PodDNSConfigOptionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDNSConfigOptionBuilder builder;
    
            PodDNSConfigOptionObjectNestedImpl(PodDNSConfigOption item){
                    this.builder = new PodDNSConfigOptionBuilder(this, item);
            }
            PodDNSConfigOptionObjectNestedImpl(){
                    this.builder = new PodDNSConfigOptionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodDNSConfigOptionObject(builder.build());
    }
    public N endPodDNSConfigOptionObject(){
            return and();
    }

}
    public class GCEPersistentDiskVolumeSourceObjectNestedImpl<N> extends GCEPersistentDiskVolumeSourceFluentImpl<WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<N>> implements WatchEventFluent.GCEPersistentDiskVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GCEPersistentDiskVolumeSourceBuilder builder;
    
            GCEPersistentDiskVolumeSourceObjectNestedImpl(GCEPersistentDiskVolumeSource item){
                    this.builder = new GCEPersistentDiskVolumeSourceBuilder(this, item);
            }
            GCEPersistentDiskVolumeSourceObjectNestedImpl(){
                    this.builder = new GCEPersistentDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGCEPersistentDiskVolumeSourceObject(builder.build());
    }
    public N endGCEPersistentDiskVolumeSourceObject(){
            return and();
    }

}
    public class OAuthClientAuthorizationObjectNestedImpl<N> extends OAuthClientAuthorizationFluentImpl<WatchEventFluent.OAuthClientAuthorizationObjectNested<N>> implements WatchEventFluent.OAuthClientAuthorizationObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationBuilder builder;
    
            OAuthClientAuthorizationObjectNestedImpl(OAuthClientAuthorization item){
                    this.builder = new OAuthClientAuthorizationBuilder(this, item);
            }
            OAuthClientAuthorizationObjectNestedImpl(){
                    this.builder = new OAuthClientAuthorizationBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthClientAuthorizationObject(builder.build());
    }
    public N endOAuthClientAuthorizationObject(){
            return and();
    }

}
    public class NetworkPolicyIngressRuleObjectNestedImpl<N> extends NetworkPolicyIngressRuleFluentImpl<WatchEventFluent.NetworkPolicyIngressRuleObjectNested<N>> implements WatchEventFluent.NetworkPolicyIngressRuleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyIngressRuleBuilder builder;
    
            NetworkPolicyIngressRuleObjectNestedImpl(NetworkPolicyIngressRule item){
                    this.builder = new NetworkPolicyIngressRuleBuilder(this, item);
            }
            NetworkPolicyIngressRuleObjectNestedImpl(){
                    this.builder = new NetworkPolicyIngressRuleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicyIngressRuleObject(builder.build());
    }
    public N endNetworkPolicyIngressRuleObject(){
            return and();
    }

}
    public class JobTemplateSpecObjectNestedImpl<N> extends JobTemplateSpecFluentImpl<WatchEventFluent.JobTemplateSpecObjectNested<N>> implements WatchEventFluent.JobTemplateSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobTemplateSpecBuilder builder;
    
            JobTemplateSpecObjectNestedImpl(JobTemplateSpec item){
                    this.builder = new JobTemplateSpecBuilder(this, item);
            }
            JobTemplateSpecObjectNestedImpl(){
                    this.builder = new JobTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJobTemplateSpecObject(builder.build());
    }
    public N endJobTemplateSpecObject(){
            return and();
    }

}
    public class ImageChangeCauseObjectNestedImpl<N> extends ImageChangeCauseFluentImpl<WatchEventFluent.ImageChangeCauseObjectNested<N>> implements WatchEventFluent.ImageChangeCauseObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageChangeCauseBuilder builder;
    
            ImageChangeCauseObjectNestedImpl(ImageChangeCause item){
                    this.builder = new ImageChangeCauseBuilder(this, item);
            }
            ImageChangeCauseObjectNestedImpl(){
                    this.builder = new ImageChangeCauseBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageChangeCauseObject(builder.build());
    }
    public N endImageChangeCauseObject(){
            return and();
    }

}
    public class EventListObjectNestedImpl<N> extends EventListFluentImpl<WatchEventFluent.EventListObjectNested<N>> implements WatchEventFluent.EventListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventListBuilder builder;
    
            EventListObjectNestedImpl(EventList item){
                    this.builder = new EventListBuilder(this, item);
            }
            EventListObjectNestedImpl(){
                    this.builder = new EventListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEventListObject(builder.build());
    }
    public N endEventListObject(){
            return and();
    }

}
    public class PodReadinessGateObjectNestedImpl<N> extends PodReadinessGateFluentImpl<WatchEventFluent.PodReadinessGateObjectNested<N>> implements WatchEventFluent.PodReadinessGateObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodReadinessGateBuilder builder;
    
            PodReadinessGateObjectNestedImpl(PodReadinessGate item){
                    this.builder = new PodReadinessGateBuilder(this, item);
            }
            PodReadinessGateObjectNestedImpl(){
                    this.builder = new PodReadinessGateBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodReadinessGateObject(builder.build());
    }
    public N endPodReadinessGateObject(){
            return and();
    }

}
    public class DeploymentObjectNestedImpl<N> extends DeploymentFluentImpl<WatchEventFluent.DeploymentObjectNested<N>> implements WatchEventFluent.DeploymentObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentBuilder builder;
    
            DeploymentObjectNestedImpl(Deployment item){
                    this.builder = new DeploymentBuilder(this, item);
            }
            DeploymentObjectNestedImpl(){
                    this.builder = new DeploymentBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentObject(builder.build());
    }
    public N endDeploymentObject(){
            return and();
    }

}
    public class ContainerStateWaitingObjectNestedImpl<N> extends ContainerStateWaitingFluentImpl<WatchEventFluent.ContainerStateWaitingObjectNested<N>> implements WatchEventFluent.ContainerStateWaitingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateWaitingBuilder builder;
    
            ContainerStateWaitingObjectNestedImpl(ContainerStateWaiting item){
                    this.builder = new ContainerStateWaitingBuilder(this, item);
            }
            ContainerStateWaitingObjectNestedImpl(){
                    this.builder = new ContainerStateWaitingBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerStateWaitingObject(builder.build());
    }
    public N endContainerStateWaitingObject(){
            return and();
    }

}
    public class TagEventConditionObjectNestedImpl<N> extends TagEventConditionFluentImpl<WatchEventFluent.TagEventConditionObjectNested<N>> implements WatchEventFluent.TagEventConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagEventConditionBuilder builder;
    
            TagEventConditionObjectNestedImpl(TagEventCondition item){
                    this.builder = new TagEventConditionBuilder(this, item);
            }
            TagEventConditionObjectNestedImpl(){
                    this.builder = new TagEventConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTagEventConditionObject(builder.build());
    }
    public N endTagEventConditionObject(){
            return and();
    }

}
    public class OpenshiftRoleListObjectNestedImpl<N> extends OpenshiftRoleListFluentImpl<WatchEventFluent.OpenshiftRoleListObjectNested<N>> implements WatchEventFluent.OpenshiftRoleListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleListBuilder builder;
    
            OpenshiftRoleListObjectNestedImpl(OpenshiftRoleList item){
                    this.builder = new OpenshiftRoleListBuilder(this, item);
            }
            OpenshiftRoleListObjectNestedImpl(){
                    this.builder = new OpenshiftRoleListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftRoleListObject(builder.build());
    }
    public N endOpenshiftRoleListObject(){
            return and();
    }

}
    public class NetNamespaceListObjectNestedImpl<N> extends NetNamespaceListFluentImpl<WatchEventFluent.NetNamespaceListObjectNested<N>> implements WatchEventFluent.NetNamespaceListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceListBuilder builder;
    
            NetNamespaceListObjectNestedImpl(NetNamespaceList item){
                    this.builder = new NetNamespaceListBuilder(this, item);
            }
            NetNamespaceListObjectNestedImpl(){
                    this.builder = new NetNamespaceListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetNamespaceListObject(builder.build());
    }
    public N endNetNamespaceListObject(){
            return and();
    }

}
    public class BinaryBuildSourceObjectNestedImpl<N> extends BinaryBuildSourceFluentImpl<WatchEventFluent.BinaryBuildSourceObjectNested<N>> implements WatchEventFluent.BinaryBuildSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BinaryBuildSourceBuilder builder;
    
            BinaryBuildSourceObjectNestedImpl(BinaryBuildSource item){
                    this.builder = new BinaryBuildSourceBuilder(this, item);
            }
            BinaryBuildSourceObjectNestedImpl(){
                    this.builder = new BinaryBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBinaryBuildSourceObject(builder.build());
    }
    public N endBinaryBuildSourceObject(){
            return and();
    }

}
    public class OAuthClientAuthorizationListObjectNestedImpl<N> extends OAuthClientAuthorizationListFluentImpl<WatchEventFluent.OAuthClientAuthorizationListObjectNested<N>> implements WatchEventFluent.OAuthClientAuthorizationListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthClientAuthorizationListBuilder builder;
    
            OAuthClientAuthorizationListObjectNestedImpl(OAuthClientAuthorizationList item){
                    this.builder = new OAuthClientAuthorizationListBuilder(this, item);
            }
            OAuthClientAuthorizationListObjectNestedImpl(){
                    this.builder = new OAuthClientAuthorizationListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthClientAuthorizationListObject(builder.build());
    }
    public N endOAuthClientAuthorizationListObject(){
            return and();
    }

}
    public class IngressSpecObjectNestedImpl<N> extends IngressSpecFluentImpl<WatchEventFluent.IngressSpecObjectNested<N>> implements WatchEventFluent.IngressSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressSpecBuilder builder;
    
            IngressSpecObjectNestedImpl(IngressSpec item){
                    this.builder = new IngressSpecBuilder(this, item);
            }
            IngressSpecObjectNestedImpl(){
                    this.builder = new IngressSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressSpecObject(builder.build());
    }
    public N endIngressSpecObject(){
            return and();
    }

}
    public class ModelLocalSubjectAccessReviewObjectNestedImpl<N> extends io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluentImpl<WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<N>> implements WatchEventFluent.ModelLocalSubjectAccessReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder builder;
    
            ModelLocalSubjectAccessReviewObjectNestedImpl(io.fabric8.openshift.api.model.LocalSubjectAccessReview item){
                    this.builder = new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder(this, item);
            }
            ModelLocalSubjectAccessReviewObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLocalSubjectAccessReviewObject(builder.build());
    }
    public N endModelLocalSubjectAccessReviewObject(){
            return and();
    }

}
    public class AdmissionReviewObjectNestedImpl<N> extends AdmissionReviewFluentImpl<WatchEventFluent.AdmissionReviewObjectNested<N>> implements WatchEventFluent.AdmissionReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AdmissionReviewBuilder builder;
    
            AdmissionReviewObjectNestedImpl(AdmissionReview item){
                    this.builder = new AdmissionReviewBuilder(this, item);
            }
            AdmissionReviewObjectNestedImpl(){
                    this.builder = new AdmissionReviewBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAdmissionReviewObject(builder.build());
    }
    public N endAdmissionReviewObject(){
            return and();
    }

}
    public class RollingDeploymentStrategyParamsObjectNestedImpl<N> extends RollingDeploymentStrategyParamsFluentImpl<WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<N>> implements WatchEventFluent.RollingDeploymentStrategyParamsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingDeploymentStrategyParamsBuilder builder;
    
            RollingDeploymentStrategyParamsObjectNestedImpl(RollingDeploymentStrategyParams item){
                    this.builder = new RollingDeploymentStrategyParamsBuilder(this, item);
            }
            RollingDeploymentStrategyParamsObjectNestedImpl(){
                    this.builder = new RollingDeploymentStrategyParamsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRollingDeploymentStrategyParamsObject(builder.build());
    }
    public N endRollingDeploymentStrategyParamsObject(){
            return and();
    }

}
    public class DownwardAPIVolumeFileObjectNestedImpl<N> extends DownwardAPIVolumeFileFluentImpl<WatchEventFluent.DownwardAPIVolumeFileObjectNested<N>> implements WatchEventFluent.DownwardAPIVolumeFileObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DownwardAPIVolumeFileBuilder builder;
    
            DownwardAPIVolumeFileObjectNestedImpl(DownwardAPIVolumeFile item){
                    this.builder = new DownwardAPIVolumeFileBuilder(this, item);
            }
            DownwardAPIVolumeFileObjectNestedImpl(){
                    this.builder = new DownwardAPIVolumeFileBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDownwardAPIVolumeFileObject(builder.build());
    }
    public N endDownwardAPIVolumeFileObject(){
            return and();
    }

}
    public class ImageLabelObjectNestedImpl<N> extends ImageLabelFluentImpl<WatchEventFluent.ImageLabelObjectNested<N>> implements WatchEventFluent.ImageLabelObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLabelBuilder builder;
    
            ImageLabelObjectNestedImpl(ImageLabel item){
                    this.builder = new ImageLabelBuilder(this, item);
            }
            ImageLabelObjectNestedImpl(){
                    this.builder = new ImageLabelBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageLabelObject(builder.build());
    }
    public N endImageLabelObject(){
            return and();
    }

}
    public class PodTemplateObjectNestedImpl<N> extends PodTemplateFluentImpl<WatchEventFluent.PodTemplateObjectNested<N>> implements WatchEventFluent.PodTemplateObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateBuilder builder;
    
            PodTemplateObjectNestedImpl(PodTemplate item){
                    this.builder = new PodTemplateBuilder(this, item);
            }
            PodTemplateObjectNestedImpl(){
                    this.builder = new PodTemplateBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodTemplateObject(builder.build());
    }
    public N endPodTemplateObject(){
            return and();
    }

}
    public class TCPSocketActionObjectNestedImpl<N> extends TCPSocketActionFluentImpl<WatchEventFluent.TCPSocketActionObjectNested<N>> implements WatchEventFluent.TCPSocketActionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TCPSocketActionBuilder builder;
    
            TCPSocketActionObjectNestedImpl(TCPSocketAction item){
                    this.builder = new TCPSocketActionBuilder(this, item);
            }
            TCPSocketActionObjectNestedImpl(){
                    this.builder = new TCPSocketActionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTCPSocketActionObject(builder.build());
    }
    public N endTCPSocketActionObject(){
            return and();
    }

}
    public class DaemonSetListObjectNestedImpl<N> extends DaemonSetListFluentImpl<WatchEventFluent.DaemonSetListObjectNested<N>> implements WatchEventFluent.DaemonSetListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetListBuilder builder;
    
            DaemonSetListObjectNestedImpl(DaemonSetList item){
                    this.builder = new DaemonSetListBuilder(this, item);
            }
            DaemonSetListObjectNestedImpl(){
                    this.builder = new DaemonSetListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonSetListObject(builder.build());
    }
    public N endDaemonSetListObject(){
            return and();
    }

}
    public class EventObjectNestedImpl<N> extends EventFluentImpl<WatchEventFluent.EventObjectNested<N>> implements WatchEventFluent.EventObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EventBuilder builder;
    
            EventObjectNestedImpl(Event item){
                    this.builder = new EventBuilder(this, item);
            }
            EventObjectNestedImpl(){
                    this.builder = new EventBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEventObject(builder.build());
    }
    public N endEventObject(){
            return and();
    }

}
    public class PreferencesObjectNestedImpl<N> extends PreferencesFluentImpl<WatchEventFluent.PreferencesObjectNested<N>> implements WatchEventFluent.PreferencesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PreferencesBuilder builder;
    
            PreferencesObjectNestedImpl(Preferences item){
                    this.builder = new PreferencesBuilder(this, item);
            }
            PreferencesObjectNestedImpl(){
                    this.builder = new PreferencesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPreferencesObject(builder.build());
    }
    public N endPreferencesObject(){
            return and();
    }

}
    public class IngressObjectNestedImpl<N> extends IngressFluentImpl<WatchEventFluent.IngressObjectNested<N>> implements WatchEventFluent.IngressObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBuilder builder;
    
            IngressObjectNestedImpl(Ingress item){
                    this.builder = new IngressBuilder(this, item);
            }
            IngressObjectNestedImpl(){
                    this.builder = new IngressBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withIngressObject(builder.build());
    }
    public N endIngressObject(){
            return and();
    }

}
    public class DeploymentConfigObjectNestedImpl<N> extends DeploymentConfigFluentImpl<WatchEventFluent.DeploymentConfigObjectNested<N>> implements WatchEventFluent.DeploymentConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigBuilder builder;
    
            DeploymentConfigObjectNestedImpl(DeploymentConfig item){
                    this.builder = new DeploymentConfigBuilder(this, item);
            }
            DeploymentConfigObjectNestedImpl(){
                    this.builder = new DeploymentConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentConfigObject(builder.build());
    }
    public N endDeploymentConfigObject(){
            return and();
    }

}
    public class ObjectFieldSelectorObjectNestedImpl<N> extends ObjectFieldSelectorFluentImpl<WatchEventFluent.ObjectFieldSelectorObjectNested<N>> implements WatchEventFluent.ObjectFieldSelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectFieldSelectorBuilder builder;
    
            ObjectFieldSelectorObjectNestedImpl(ObjectFieldSelector item){
                    this.builder = new ObjectFieldSelectorBuilder(this, item);
            }
            ObjectFieldSelectorObjectNestedImpl(){
                    this.builder = new ObjectFieldSelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withObjectFieldSelectorObject(builder.build());
    }
    public N endObjectFieldSelectorObject(){
            return and();
    }

}
    public class OAuthAccessTokenObjectNestedImpl<N> extends OAuthAccessTokenFluentImpl<WatchEventFluent.OAuthAccessTokenObjectNested<N>> implements WatchEventFluent.OAuthAccessTokenObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OAuthAccessTokenBuilder builder;
    
            OAuthAccessTokenObjectNestedImpl(OAuthAccessToken item){
                    this.builder = new OAuthAccessTokenBuilder(this, item);
            }
            OAuthAccessTokenObjectNestedImpl(){
                    this.builder = new OAuthAccessTokenBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOAuthAccessTokenObject(builder.build());
    }
    public N endOAuthAccessTokenObject(){
            return and();
    }

}
    public class PersistentVolumeObjectNestedImpl<N> extends PersistentVolumeFluentImpl<WatchEventFluent.PersistentVolumeObjectNested<N>> implements WatchEventFluent.PersistentVolumeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeBuilder builder;
    
            PersistentVolumeObjectNestedImpl(PersistentVolume item){
                    this.builder = new PersistentVolumeBuilder(this, item);
            }
            PersistentVolumeObjectNestedImpl(){
                    this.builder = new PersistentVolumeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeObject(builder.build());
    }
    public N endPersistentVolumeObject(){
            return and();
    }

}
    public class CinderVolumeSourceObjectNestedImpl<N> extends CinderVolumeSourceFluentImpl<WatchEventFluent.CinderVolumeSourceObjectNested<N>> implements WatchEventFluent.CinderVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CinderVolumeSourceBuilder builder;
    
            CinderVolumeSourceObjectNestedImpl(CinderVolumeSource item){
                    this.builder = new CinderVolumeSourceBuilder(this, item);
            }
            CinderVolumeSourceObjectNestedImpl(){
                    this.builder = new CinderVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCinderVolumeSourceObject(builder.build());
    }
    public N endCinderVolumeSourceObject(){
            return and();
    }

}
    public class ObjectMetaObjectNestedImpl<N> extends ObjectMetaFluentImpl<WatchEventFluent.ObjectMetaObjectNested<N>> implements WatchEventFluent.ObjectMetaObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            ObjectMetaObjectNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            ObjectMetaObjectNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withObjectMetaObject(builder.build());
    }
    public N endObjectMetaObject(){
            return and();
    }

}
    public class PersistentVolumeClaimObjectNestedImpl<N> extends PersistentVolumeClaimFluentImpl<WatchEventFluent.PersistentVolumeClaimObjectNested<N>> implements WatchEventFluent.PersistentVolumeClaimObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
    
            PersistentVolumeClaimObjectNestedImpl(PersistentVolumeClaim item){
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            PersistentVolumeClaimObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeClaimObject(builder.build());
    }
    public N endPersistentVolumeClaimObject(){
            return and();
    }

}
    public class JSONSchemaPropsObjectNestedImpl<N> extends JSONSchemaPropsFluentImpl<WatchEventFluent.JSONSchemaPropsObjectNested<N>> implements WatchEventFluent.JSONSchemaPropsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
    
            JSONSchemaPropsObjectNestedImpl(JSONSchemaProps item){
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            JSONSchemaPropsObjectNestedImpl(){
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJSONSchemaPropsObject(builder.build());
    }
    public N endJSONSchemaPropsObject(){
            return and();
    }

}
    public class ModelDeploymentConditionObjectNestedImpl<N> extends io.fabric8.openshift.api.model.DeploymentConditionFluentImpl<WatchEventFluent.ModelDeploymentConditionObjectNested<N>> implements WatchEventFluent.ModelDeploymentConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.DeploymentConditionBuilder builder;
    
            ModelDeploymentConditionObjectNestedImpl(io.fabric8.openshift.api.model.DeploymentCondition item){
                    this.builder = new io.fabric8.openshift.api.model.DeploymentConditionBuilder(this, item);
            }
            ModelDeploymentConditionObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.DeploymentConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentConditionObject(builder.build());
    }
    public N endModelDeploymentConditionObject(){
            return and();
    }

}
    public class DeploymentCauseImageTriggerObjectNestedImpl<N> extends DeploymentCauseImageTriggerFluentImpl<WatchEventFluent.DeploymentCauseImageTriggerObjectNested<N>> implements WatchEventFluent.DeploymentCauseImageTriggerObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentCauseImageTriggerBuilder builder;
    
            DeploymentCauseImageTriggerObjectNestedImpl(DeploymentCauseImageTrigger item){
                    this.builder = new DeploymentCauseImageTriggerBuilder(this, item);
            }
            DeploymentCauseImageTriggerObjectNestedImpl(){
                    this.builder = new DeploymentCauseImageTriggerBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentCauseImageTriggerObject(builder.build());
    }
    public N endDeploymentCauseImageTriggerObject(){
            return and();
    }

}
    public class NetworkPolicyPortObjectNestedImpl<N> extends NetworkPolicyPortFluentImpl<WatchEventFluent.NetworkPolicyPortObjectNested<N>> implements WatchEventFluent.NetworkPolicyPortObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyPortBuilder builder;
    
            NetworkPolicyPortObjectNestedImpl(NetworkPolicyPort item){
                    this.builder = new NetworkPolicyPortBuilder(this, item);
            }
            NetworkPolicyPortObjectNestedImpl(){
                    this.builder = new NetworkPolicyPortBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicyPortObject(builder.build());
    }
    public N endNetworkPolicyPortObject(){
            return and();
    }

}
    public class OwnerReferenceObjectNestedImpl<N> extends OwnerReferenceFluentImpl<WatchEventFluent.OwnerReferenceObjectNested<N>> implements WatchEventFluent.OwnerReferenceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OwnerReferenceBuilder builder;
    
            OwnerReferenceObjectNestedImpl(OwnerReference item){
                    this.builder = new OwnerReferenceBuilder(this, item);
            }
            OwnerReferenceObjectNestedImpl(){
                    this.builder = new OwnerReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOwnerReferenceObject(builder.build());
    }
    public N endOwnerReferenceObject(){
            return and();
    }

}
    public class CinderPersistentVolumeSourceObjectNestedImpl<N> extends CinderPersistentVolumeSourceFluentImpl<WatchEventFluent.CinderPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.CinderPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CinderPersistentVolumeSourceBuilder builder;
    
            CinderPersistentVolumeSourceObjectNestedImpl(CinderPersistentVolumeSource item){
                    this.builder = new CinderPersistentVolumeSourceBuilder(this, item);
            }
            CinderPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new CinderPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCinderPersistentVolumeSourceObject(builder.build());
    }
    public N endCinderPersistentVolumeSourceObject(){
            return and();
    }

}
    public class ReplicationControllerConditionObjectNestedImpl<N> extends ReplicationControllerConditionFluentImpl<WatchEventFluent.ReplicationControllerConditionObjectNested<N>> implements WatchEventFluent.ReplicationControllerConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerConditionBuilder builder;
    
            ReplicationControllerConditionObjectNestedImpl(ReplicationControllerCondition item){
                    this.builder = new ReplicationControllerConditionBuilder(this, item);
            }
            ReplicationControllerConditionObjectNestedImpl(){
                    this.builder = new ReplicationControllerConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicationControllerConditionObject(builder.build());
    }
    public N endReplicationControllerConditionObject(){
            return and();
    }

}
    public class PodAntiAffinityObjectNestedImpl<N> extends PodAntiAffinityFluentImpl<WatchEventFluent.PodAntiAffinityObjectNested<N>> implements WatchEventFluent.PodAntiAffinityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAntiAffinityBuilder builder;
    
            PodAntiAffinityObjectNestedImpl(PodAntiAffinity item){
                    this.builder = new PodAntiAffinityBuilder(this, item);
            }
            PodAntiAffinityObjectNestedImpl(){
                    this.builder = new PodAntiAffinityBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodAntiAffinityObject(builder.build());
    }
    public N endPodAntiAffinityObject(){
            return and();
    }

}
    public class PodDisruptionBudgetSpecObjectNestedImpl<N> extends PodDisruptionBudgetSpecFluentImpl<WatchEventFluent.PodDisruptionBudgetSpecObjectNested<N>> implements WatchEventFluent.PodDisruptionBudgetSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetSpecBuilder builder;
    
            PodDisruptionBudgetSpecObjectNestedImpl(PodDisruptionBudgetSpec item){
                    this.builder = new PodDisruptionBudgetSpecBuilder(this, item);
            }
            PodDisruptionBudgetSpecObjectNestedImpl(){
                    this.builder = new PodDisruptionBudgetSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodDisruptionBudgetSpecObject(builder.build());
    }
    public N endPodDisruptionBudgetSpecObject(){
            return and();
    }

}
    public class MetricSpecObjectNestedImpl<N> extends MetricSpecFluentImpl<WatchEventFluent.MetricSpecObjectNested<N>> implements WatchEventFluent.MetricSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MetricSpecBuilder builder;
    
            MetricSpecObjectNestedImpl(MetricSpec item){
                    this.builder = new MetricSpecBuilder(this, item);
            }
            MetricSpecObjectNestedImpl(){
                    this.builder = new MetricSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withMetricSpecObject(builder.build());
    }
    public N endMetricSpecObject(){
            return and();
    }

}
    public class ReplicationControllerListObjectNestedImpl<N> extends ReplicationControllerListFluentImpl<WatchEventFluent.ReplicationControllerListObjectNested<N>> implements WatchEventFluent.ReplicationControllerListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerListBuilder builder;
    
            ReplicationControllerListObjectNestedImpl(ReplicationControllerList item){
                    this.builder = new ReplicationControllerListBuilder(this, item);
            }
            ReplicationControllerListObjectNestedImpl(){
                    this.builder = new ReplicationControllerListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicationControllerListObject(builder.build());
    }
    public N endReplicationControllerListObject(){
            return and();
    }

}
    public class EventsEventObjectNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<WatchEventFluent.EventsEventObjectNested<N>> implements WatchEventFluent.EventsEventObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    
            EventsEventObjectNestedImpl(io.fabric8.kubernetes.api.model.events.Event item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this, item);
            }
            EventsEventObjectNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEventObject(builder.build());
    }
    public N endEventsEventObject(){
            return and();
    }

}
    public class ContainerStateRunningObjectNestedImpl<N> extends ContainerStateRunningFluentImpl<WatchEventFluent.ContainerStateRunningObjectNested<N>> implements WatchEventFluent.ContainerStateRunningObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateRunningBuilder builder;
    
            ContainerStateRunningObjectNestedImpl(ContainerStateRunning item){
                    this.builder = new ContainerStateRunningBuilder(this, item);
            }
            ContainerStateRunningObjectNestedImpl(){
                    this.builder = new ContainerStateRunningBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerStateRunningObject(builder.build());
    }
    public N endContainerStateRunningObject(){
            return and();
    }

}
    public class HorizontalPodAutoscalerStatusObjectNestedImpl<N> extends HorizontalPodAutoscalerStatusFluentImpl<WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<N>> implements WatchEventFluent.HorizontalPodAutoscalerStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerStatusBuilder builder;
    
            HorizontalPodAutoscalerStatusObjectNestedImpl(HorizontalPodAutoscalerStatus item){
                    this.builder = new HorizontalPodAutoscalerStatusBuilder(this, item);
            }
            HorizontalPodAutoscalerStatusObjectNestedImpl(){
                    this.builder = new HorizontalPodAutoscalerStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHorizontalPodAutoscalerStatusObject(builder.build());
    }
    public N endHorizontalPodAutoscalerStatusObject(){
            return and();
    }

}
    public class JSONSchemaPropsOrArrayObjectNestedImpl<N> extends JSONSchemaPropsOrArrayFluentImpl<WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<N>> implements WatchEventFluent.JSONSchemaPropsOrArrayObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrArrayBuilder builder;
    
            JSONSchemaPropsOrArrayObjectNestedImpl(JSONSchemaPropsOrArray item){
                    this.builder = new JSONSchemaPropsOrArrayBuilder(this, item);
            }
            JSONSchemaPropsOrArrayObjectNestedImpl(){
                    this.builder = new JSONSchemaPropsOrArrayBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJSONSchemaPropsOrArrayObject(builder.build());
    }
    public N endJSONSchemaPropsOrArrayObject(){
            return and();
    }

}
    public class HTTPIngressPathObjectNestedImpl<N> extends HTTPIngressPathFluentImpl<WatchEventFluent.HTTPIngressPathObjectNested<N>> implements WatchEventFluent.HTTPIngressPathObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPIngressPathBuilder builder;
    
            HTTPIngressPathObjectNestedImpl(HTTPIngressPath item){
                    this.builder = new HTTPIngressPathBuilder(this, item);
            }
            HTTPIngressPathObjectNestedImpl(){
                    this.builder = new HTTPIngressPathBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHTTPIngressPathObject(builder.build());
    }
    public N endHTTPIngressPathObject(){
            return and();
    }

}
    public class NamedExtensionObjectNestedImpl<N> extends NamedExtensionFluentImpl<WatchEventFluent.NamedExtensionObjectNested<N>> implements WatchEventFluent.NamedExtensionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedExtensionBuilder builder;
    
            NamedExtensionObjectNestedImpl(NamedExtension item){
                    this.builder = new NamedExtensionBuilder(this, item);
            }
            NamedExtensionObjectNestedImpl(){
                    this.builder = new NamedExtensionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNamedExtensionObject(builder.build());
    }
    public N endNamedExtensionObject(){
            return and();
    }

}
    public class AzureFilePersistentVolumeSourceObjectNestedImpl<N> extends AzureFilePersistentVolumeSourceFluentImpl<WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.AzureFilePersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureFilePersistentVolumeSourceBuilder builder;
    
            AzureFilePersistentVolumeSourceObjectNestedImpl(AzureFilePersistentVolumeSource item){
                    this.builder = new AzureFilePersistentVolumeSourceBuilder(this, item);
            }
            AzureFilePersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new AzureFilePersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withAzureFilePersistentVolumeSourceObject(builder.build());
    }
    public N endAzureFilePersistentVolumeSourceObject(){
            return and();
    }

}
    public class SourceBuildStrategyObjectNestedImpl<N> extends SourceBuildStrategyFluentImpl<WatchEventFluent.SourceBuildStrategyObjectNested<N>> implements WatchEventFluent.SourceBuildStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceBuildStrategyBuilder builder;
    
            SourceBuildStrategyObjectNestedImpl(SourceBuildStrategy item){
                    this.builder = new SourceBuildStrategyBuilder(this, item);
            }
            SourceBuildStrategyObjectNestedImpl(){
                    this.builder = new SourceBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSourceBuildStrategyObject(builder.build());
    }
    public N endSourceBuildStrategyObject(){
            return and();
    }

}
    public class StatefulSetObjectNestedImpl<N> extends StatefulSetFluentImpl<WatchEventFluent.StatefulSetObjectNested<N>> implements WatchEventFluent.StatefulSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetBuilder builder;
    
            StatefulSetObjectNestedImpl(StatefulSet item){
                    this.builder = new StatefulSetBuilder(this, item);
            }
            StatefulSetObjectNestedImpl(){
                    this.builder = new StatefulSetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatefulSetObject(builder.build());
    }
    public N endStatefulSetObject(){
            return and();
    }

}
    public class ContainerPortObjectNestedImpl<N> extends ContainerPortFluentImpl<WatchEventFluent.ContainerPortObjectNested<N>> implements WatchEventFluent.ContainerPortObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerPortBuilder builder;
    
            ContainerPortObjectNestedImpl(ContainerPort item){
                    this.builder = new ContainerPortBuilder(this, item);
            }
            ContainerPortObjectNestedImpl(){
                    this.builder = new ContainerPortBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withContainerPortObject(builder.build());
    }
    public N endContainerPortObject(){
            return and();
    }

}
    public class BuildPostCommitSpecObjectNestedImpl<N> extends BuildPostCommitSpecFluentImpl<WatchEventFluent.BuildPostCommitSpecObjectNested<N>> implements WatchEventFluent.BuildPostCommitSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildPostCommitSpecBuilder builder;
    
            BuildPostCommitSpecObjectNestedImpl(BuildPostCommitSpec item){
                    this.builder = new BuildPostCommitSpecBuilder(this, item);
            }
            BuildPostCommitSpecObjectNestedImpl(){
                    this.builder = new BuildPostCommitSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildPostCommitSpecObject(builder.build());
    }
    public N endBuildPostCommitSpecObject(){
            return and();
    }

}
    public class PodListObjectNestedImpl<N> extends PodListFluentImpl<WatchEventFluent.PodListObjectNested<N>> implements WatchEventFluent.PodListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodListBuilder builder;
    
            PodListObjectNestedImpl(PodList item){
                    this.builder = new PodListBuilder(this, item);
            }
            PodListObjectNestedImpl(){
                    this.builder = new PodListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodListObject(builder.build());
    }
    public N endPodListObject(){
            return and();
    }

}
    public class ResourceFieldSelectorObjectNestedImpl<N> extends ResourceFieldSelectorFluentImpl<WatchEventFluent.ResourceFieldSelectorObjectNested<N>> implements WatchEventFluent.ResourceFieldSelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceFieldSelectorBuilder builder;
    
            ResourceFieldSelectorObjectNestedImpl(ResourceFieldSelector item){
                    this.builder = new ResourceFieldSelectorBuilder(this, item);
            }
            ResourceFieldSelectorObjectNestedImpl(){
                    this.builder = new ResourceFieldSelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceFieldSelectorObject(builder.build());
    }
    public N endResourceFieldSelectorObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleObjectNestedImpl<N> extends OpenshiftClusterRoleFluentImpl<WatchEventFluent.OpenshiftClusterRoleObjectNested<N>> implements WatchEventFluent.OpenshiftClusterRoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBuilder builder;
    
            OpenshiftClusterRoleObjectNestedImpl(OpenshiftClusterRole item){
                    this.builder = new OpenshiftClusterRoleBuilder(this, item);
            }
            OpenshiftClusterRoleObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftClusterRoleObject(builder.build());
    }
    public N endOpenshiftClusterRoleObject(){
            return and();
    }

}
    public class ScaleSpecObjectNestedImpl<N> extends ScaleSpecFluentImpl<WatchEventFluent.ScaleSpecObjectNested<N>> implements WatchEventFluent.ScaleSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleSpecBuilder builder;
    
            ScaleSpecObjectNestedImpl(ScaleSpec item){
                    this.builder = new ScaleSpecBuilder(this, item);
            }
            ScaleSpecObjectNestedImpl(){
                    this.builder = new ScaleSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScaleSpecObject(builder.build());
    }
    public N endScaleSpecObject(){
            return and();
    }

}
    public class ModelDeploymentStrategyObjectNestedImpl<N> extends io.fabric8.openshift.api.model.DeploymentStrategyFluentImpl<WatchEventFluent.ModelDeploymentStrategyObjectNested<N>> implements WatchEventFluent.ModelDeploymentStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.DeploymentStrategyBuilder builder;
    
            ModelDeploymentStrategyObjectNestedImpl(io.fabric8.openshift.api.model.DeploymentStrategy item){
                    this.builder = new io.fabric8.openshift.api.model.DeploymentStrategyBuilder(this, item);
            }
            ModelDeploymentStrategyObjectNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.DeploymentStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentStrategyObject(builder.build());
    }
    public N endModelDeploymentStrategyObject(){
            return and();
    }

}
    public class SignatureSubjectObjectNestedImpl<N> extends SignatureSubjectFluentImpl<WatchEventFluent.SignatureSubjectObjectNested<N>> implements WatchEventFluent.SignatureSubjectObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SignatureSubjectBuilder builder;
    
            SignatureSubjectObjectNestedImpl(SignatureSubject item){
                    this.builder = new SignatureSubjectBuilder(this, item);
            }
            SignatureSubjectObjectNestedImpl(){
                    this.builder = new SignatureSubjectBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSignatureSubjectObject(builder.build());
    }
    public N endSignatureSubjectObject(){
            return and();
    }

}
    public class PersistentVolumeClaimSpecObjectNestedImpl<N> extends PersistentVolumeClaimSpecFluentImpl<WatchEventFluent.PersistentVolumeClaimSpecObjectNested<N>> implements WatchEventFluent.PersistentVolumeClaimSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimSpecBuilder builder;
    
            PersistentVolumeClaimSpecObjectNestedImpl(PersistentVolumeClaimSpec item){
                    this.builder = new PersistentVolumeClaimSpecBuilder(this, item);
            }
            PersistentVolumeClaimSpecObjectNestedImpl(){
                    this.builder = new PersistentVolumeClaimSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeClaimSpecObject(builder.build());
    }
    public N endPersistentVolumeClaimSpecObject(){
            return and();
    }

}
    public class RouteIngressConditionObjectNestedImpl<N> extends RouteIngressConditionFluentImpl<WatchEventFluent.RouteIngressConditionObjectNested<N>> implements WatchEventFluent.RouteIngressConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteIngressConditionBuilder builder;
    
            RouteIngressConditionObjectNestedImpl(RouteIngressCondition item){
                    this.builder = new RouteIngressConditionBuilder(this, item);
            }
            RouteIngressConditionObjectNestedImpl(){
                    this.builder = new RouteIngressConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteIngressConditionObject(builder.build());
    }
    public N endRouteIngressConditionObject(){
            return and();
    }

}
    public class LoadBalancerStatusObjectNestedImpl<N> extends LoadBalancerStatusFluentImpl<WatchEventFluent.LoadBalancerStatusObjectNested<N>> implements WatchEventFluent.LoadBalancerStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LoadBalancerStatusBuilder builder;
    
            LoadBalancerStatusObjectNestedImpl(LoadBalancerStatus item){
                    this.builder = new LoadBalancerStatusBuilder(this, item);
            }
            LoadBalancerStatusObjectNestedImpl(){
                    this.builder = new LoadBalancerStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLoadBalancerStatusObject(builder.build());
    }
    public N endLoadBalancerStatusObject(){
            return and();
    }

}
    public class ScopeSelectorObjectNestedImpl<N> extends ScopeSelectorFluentImpl<WatchEventFluent.ScopeSelectorObjectNested<N>> implements WatchEventFluent.ScopeSelectorObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScopeSelectorBuilder builder;
    
            ScopeSelectorObjectNestedImpl(ScopeSelector item){
                    this.builder = new ScopeSelectorBuilder(this, item);
            }
            ScopeSelectorObjectNestedImpl(){
                    this.builder = new ScopeSelectorBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScopeSelectorObject(builder.build());
    }
    public N endScopeSelectorObject(){
            return and();
    }

}
    public class RunAsGroupStrategyOptionsObjectNestedImpl<N> extends RunAsGroupStrategyOptionsFluentImpl<WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<N>> implements WatchEventFluent.RunAsGroupStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RunAsGroupStrategyOptionsBuilder builder;
    
            RunAsGroupStrategyOptionsObjectNestedImpl(RunAsGroupStrategyOptions item){
                    this.builder = new RunAsGroupStrategyOptionsBuilder(this, item);
            }
            RunAsGroupStrategyOptionsObjectNestedImpl(){
                    this.builder = new RunAsGroupStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRunAsGroupStrategyOptionsObject(builder.build());
    }
    public N endRunAsGroupStrategyOptionsObject(){
            return and();
    }

}
    public class StageInfoObjectNestedImpl<N> extends StageInfoFluentImpl<WatchEventFluent.StageInfoObjectNested<N>> implements WatchEventFluent.StageInfoObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StageInfoBuilder builder;
    
            StageInfoObjectNestedImpl(StageInfo item){
                    this.builder = new StageInfoBuilder(this, item);
            }
            StageInfoObjectNestedImpl(){
                    this.builder = new StageInfoBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStageInfoObject(builder.build());
    }
    public N endStageInfoObject(){
            return and();
    }

}
    public class UserListObjectNestedImpl<N> extends UserListFluentImpl<WatchEventFluent.UserListObjectNested<N>> implements WatchEventFluent.UserListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserListBuilder builder;
    
            UserListObjectNestedImpl(UserList item){
                    this.builder = new UserListBuilder(this, item);
            }
            UserListObjectNestedImpl(){
                    this.builder = new UserListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withUserListObject(builder.build());
    }
    public N endUserListObject(){
            return and();
    }

}
    public class RoleObjectNestedImpl<N> extends RoleFluentImpl<WatchEventFluent.RoleObjectNested<N>> implements WatchEventFluent.RoleObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleBuilder builder;
    
            RoleObjectNestedImpl(Role item){
                    this.builder = new RoleBuilder(this, item);
            }
            RoleObjectNestedImpl(){
                    this.builder = new RoleBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRoleObject(builder.build());
    }
    public N endRoleObject(){
            return and();
    }

}
    public class ServicePortObjectNestedImpl<N> extends ServicePortFluentImpl<WatchEventFluent.ServicePortObjectNested<N>> implements WatchEventFluent.ServicePortObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServicePortBuilder builder;
    
            ServicePortObjectNestedImpl(ServicePort item){
                    this.builder = new ServicePortBuilder(this, item);
            }
            ServicePortObjectNestedImpl(){
                    this.builder = new ServicePortBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServicePortObject(builder.build());
    }
    public N endServicePortObject(){
            return and();
    }

}
    public class UserObjectNestedImpl<N> extends UserFluentImpl<WatchEventFluent.UserObjectNested<N>> implements WatchEventFluent.UserObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserBuilder builder;
    
            UserObjectNestedImpl(User item){
                    this.builder = new UserBuilder(this, item);
            }
            UserObjectNestedImpl(){
                    this.builder = new UserBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withUserObject(builder.build());
    }
    public N endUserObject(){
            return and();
    }

}
    public class SessionAffinityConfigObjectNestedImpl<N> extends SessionAffinityConfigFluentImpl<WatchEventFluent.SessionAffinityConfigObjectNested<N>> implements WatchEventFluent.SessionAffinityConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SessionAffinityConfigBuilder builder;
    
            SessionAffinityConfigObjectNestedImpl(SessionAffinityConfig item){
                    this.builder = new SessionAffinityConfigBuilder(this, item);
            }
            SessionAffinityConfigObjectNestedImpl(){
                    this.builder = new SessionAffinityConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSessionAffinityConfigObject(builder.build());
    }
    public N endSessionAffinityConfigObject(){
            return and();
    }

}
    public class BuildStatusOutputToObjectNestedImpl<N> extends BuildStatusOutputToFluentImpl<WatchEventFluent.BuildStatusOutputToObjectNested<N>> implements WatchEventFluent.BuildStatusOutputToObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStatusOutputToBuilder builder;
    
            BuildStatusOutputToObjectNestedImpl(BuildStatusOutputTo item){
                    this.builder = new BuildStatusOutputToBuilder(this, item);
            }
            BuildStatusOutputToObjectNestedImpl(){
                    this.builder = new BuildStatusOutputToBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildStatusOutputToObject(builder.build());
    }
    public N endBuildStatusOutputToObject(){
            return and();
    }

}
    public class SecretSpecObjectNestedImpl<N> extends SecretSpecFluentImpl<WatchEventFluent.SecretSpecObjectNested<N>> implements WatchEventFluent.SecretSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretSpecBuilder builder;
    
            SecretSpecObjectNestedImpl(SecretSpec item){
                    this.builder = new SecretSpecBuilder(this, item);
            }
            SecretSpecObjectNestedImpl(){
                    this.builder = new SecretSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretSpecObject(builder.build());
    }
    public N endSecretSpecObject(){
            return and();
    }

}
    public class ServiceAccountListObjectNestedImpl<N> extends ServiceAccountListFluentImpl<WatchEventFluent.ServiceAccountListObjectNested<N>> implements WatchEventFluent.ServiceAccountListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountListBuilder builder;
    
            ServiceAccountListObjectNestedImpl(ServiceAccountList item){
                    this.builder = new ServiceAccountListBuilder(this, item);
            }
            ServiceAccountListObjectNestedImpl(){
                    this.builder = new ServiceAccountListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceAccountListObject(builder.build());
    }
    public N endServiceAccountListObject(){
            return and();
    }

}
    public class ExecNewPodHookObjectNestedImpl<N> extends ExecNewPodHookFluentImpl<WatchEventFluent.ExecNewPodHookObjectNested<N>> implements WatchEventFluent.ExecNewPodHookObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecNewPodHookBuilder builder;
    
            ExecNewPodHookObjectNestedImpl(ExecNewPodHook item){
                    this.builder = new ExecNewPodHookBuilder(this, item);
            }
            ExecNewPodHookObjectNestedImpl(){
                    this.builder = new ExecNewPodHookBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExecNewPodHookObject(builder.build());
    }
    public N endExecNewPodHookObject(){
            return and();
    }

}
    public class ComponentStatusObjectNestedImpl<N> extends ComponentStatusFluentImpl<WatchEventFluent.ComponentStatusObjectNested<N>> implements WatchEventFluent.ComponentStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
    
            ComponentStatusObjectNestedImpl(ComponentStatus item){
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ComponentStatusObjectNestedImpl(){
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withComponentStatusObject(builder.build());
    }
    public N endComponentStatusObject(){
            return and();
    }

}
    public class ScaleStatusObjectNestedImpl<N> extends ScaleStatusFluentImpl<WatchEventFluent.ScaleStatusObjectNested<N>> implements WatchEventFluent.ScaleStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleStatusBuilder builder;
    
            ScaleStatusObjectNestedImpl(ScaleStatus item){
                    this.builder = new ScaleStatusBuilder(this, item);
            }
            ScaleStatusObjectNestedImpl(){
                    this.builder = new ScaleStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withScaleStatusObject(builder.build());
    }
    public N endScaleStatusObject(){
            return and();
    }

}
    public class CertificateSigningRequestConditionObjectNestedImpl<N> extends CertificateSigningRequestConditionFluentImpl<WatchEventFluent.CertificateSigningRequestConditionObjectNested<N>> implements WatchEventFluent.CertificateSigningRequestConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestConditionBuilder builder;
    
            CertificateSigningRequestConditionObjectNestedImpl(CertificateSigningRequestCondition item){
                    this.builder = new CertificateSigningRequestConditionBuilder(this, item);
            }
            CertificateSigningRequestConditionObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCertificateSigningRequestConditionObject(builder.build());
    }
    public N endCertificateSigningRequestConditionObject(){
            return and();
    }

}
    public class DaemonEndpointObjectNestedImpl<N> extends DaemonEndpointFluentImpl<WatchEventFluent.DaemonEndpointObjectNested<N>> implements WatchEventFluent.DaemonEndpointObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonEndpointBuilder builder;
    
            DaemonEndpointObjectNestedImpl(DaemonEndpoint item){
                    this.builder = new DaemonEndpointBuilder(this, item);
            }
            DaemonEndpointObjectNestedImpl(){
                    this.builder = new DaemonEndpointBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDaemonEndpointObject(builder.build());
    }
    public N endDaemonEndpointObject(){
            return and();
    }

}
    public class BuildTriggerPolicyObjectNestedImpl<N> extends BuildTriggerPolicyFluentImpl<WatchEventFluent.BuildTriggerPolicyObjectNested<N>> implements WatchEventFluent.BuildTriggerPolicyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildTriggerPolicyBuilder builder;
    
            BuildTriggerPolicyObjectNestedImpl(BuildTriggerPolicy item){
                    this.builder = new BuildTriggerPolicyBuilder(this, item);
            }
            BuildTriggerPolicyObjectNestedImpl(){
                    this.builder = new BuildTriggerPolicyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildTriggerPolicyObject(builder.build());
    }
    public N endBuildTriggerPolicyObject(){
            return and();
    }

}
    public class TokenReviewObjectNestedImpl<N> extends TokenReviewFluentImpl<WatchEventFluent.TokenReviewObjectNested<N>> implements WatchEventFluent.TokenReviewObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewBuilder builder;
    
            TokenReviewObjectNestedImpl(TokenReview item){
                    this.builder = new TokenReviewBuilder(this, item);
            }
            TokenReviewObjectNestedImpl(){
                    this.builder = new TokenReviewBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTokenReviewObject(builder.build());
    }
    public N endTokenReviewObject(){
            return and();
    }

}
    public class PodSecurityPolicyListObjectNestedImpl<N> extends PodSecurityPolicyListFluentImpl<WatchEventFluent.PodSecurityPolicyListObjectNested<N>> implements WatchEventFluent.PodSecurityPolicyListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityPolicyListBuilder builder;
    
            PodSecurityPolicyListObjectNestedImpl(PodSecurityPolicyList item){
                    this.builder = new PodSecurityPolicyListBuilder(this, item);
            }
            PodSecurityPolicyListObjectNestedImpl(){
                    this.builder = new PodSecurityPolicyListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodSecurityPolicyListObject(builder.build());
    }
    public N endPodSecurityPolicyListObject(){
            return and();
    }

}
    public class StorageClassListObjectNestedImpl<N> extends StorageClassListFluentImpl<WatchEventFluent.StorageClassListObjectNested<N>> implements WatchEventFluent.StorageClassListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageClassListBuilder builder;
    
            StorageClassListObjectNestedImpl(StorageClassList item){
                    this.builder = new StorageClassListBuilder(this, item);
            }
            StorageClassListObjectNestedImpl(){
                    this.builder = new StorageClassListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStorageClassListObject(builder.build());
    }
    public N endStorageClassListObject(){
            return and();
    }

}
    public class RoleListObjectNestedImpl<N> extends RoleListFluentImpl<WatchEventFluent.RoleListObjectNested<N>> implements WatchEventFluent.RoleListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleListBuilder builder;
    
            RoleListObjectNestedImpl(RoleList item){
                    this.builder = new RoleListBuilder(this, item);
            }
            RoleListObjectNestedImpl(){
                    this.builder = new RoleListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRoleListObject(builder.build());
    }
    public N endRoleListObject(){
            return and();
    }

}
    public class RoleRefObjectNestedImpl<N> extends RoleRefFluentImpl<WatchEventFluent.RoleRefObjectNested<N>> implements WatchEventFluent.RoleRefObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RoleRefBuilder builder;
    
            RoleRefObjectNestedImpl(RoleRef item){
                    this.builder = new RoleRefBuilder(this, item);
            }
            RoleRefObjectNestedImpl(){
                    this.builder = new RoleRefBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRoleRefObject(builder.build());
    }
    public N endRoleRefObject(){
            return and();
    }

}
    public class BindingObjectNestedImpl<N> extends BindingFluentImpl<WatchEventFluent.BindingObjectNested<N>> implements WatchEventFluent.BindingObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BindingBuilder builder;
    
            BindingObjectNestedImpl(Binding item){
                    this.builder = new BindingBuilder(this, item);
            }
            BindingObjectNestedImpl(){
                    this.builder = new BindingBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBindingObject(builder.build());
    }
    public N endBindingObject(){
            return and();
    }

}
    public class DeploymentConfigSpecObjectNestedImpl<N> extends DeploymentConfigSpecFluentImpl<WatchEventFluent.DeploymentConfigSpecObjectNested<N>> implements WatchEventFluent.DeploymentConfigSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigSpecBuilder builder;
    
            DeploymentConfigSpecObjectNestedImpl(DeploymentConfigSpec item){
                    this.builder = new DeploymentConfigSpecBuilder(this, item);
            }
            DeploymentConfigSpecObjectNestedImpl(){
                    this.builder = new DeploymentConfigSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withDeploymentConfigSpecObject(builder.build());
    }
    public N endDeploymentConfigSpecObject(){
            return and();
    }

}
    public class RollingUpdateDaemonSetObjectNestedImpl<N> extends RollingUpdateDaemonSetFluentImpl<WatchEventFluent.RollingUpdateDaemonSetObjectNested<N>> implements WatchEventFluent.RollingUpdateDaemonSetObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingUpdateDaemonSetBuilder builder;
    
            RollingUpdateDaemonSetObjectNestedImpl(RollingUpdateDaemonSet item){
                    this.builder = new RollingUpdateDaemonSetBuilder(this, item);
            }
            RollingUpdateDaemonSetObjectNestedImpl(){
                    this.builder = new RollingUpdateDaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRollingUpdateDaemonSetObject(builder.build());
    }
    public N endRollingUpdateDaemonSetObject(){
            return and();
    }

}
    public class NetworkPolicySpecObjectNestedImpl<N> extends NetworkPolicySpecFluentImpl<WatchEventFluent.NetworkPolicySpecObjectNested<N>> implements WatchEventFluent.NetworkPolicySpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicySpecBuilder builder;
    
            NetworkPolicySpecObjectNestedImpl(NetworkPolicySpec item){
                    this.builder = new NetworkPolicySpecBuilder(this, item);
            }
            NetworkPolicySpecObjectNestedImpl(){
                    this.builder = new NetworkPolicySpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetworkPolicySpecObject(builder.build());
    }
    public N endNetworkPolicySpecObject(){
            return and();
    }

}
    public class SecretObjectNestedImpl<N> extends SecretFluentImpl<WatchEventFluent.SecretObjectNested<N>> implements WatchEventFluent.SecretObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuilder builder;
    
            SecretObjectNestedImpl(Secret item){
                    this.builder = new SecretBuilder(this, item);
            }
            SecretObjectNestedImpl(){
                    this.builder = new SecretBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecretObject(builder.build());
    }
    public N endSecretObject(){
            return and();
    }

}
    public class ServiceListObjectNestedImpl<N> extends ServiceListFluentImpl<WatchEventFluent.ServiceListObjectNested<N>> implements WatchEventFluent.ServiceListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceListBuilder builder;
    
            ServiceListObjectNestedImpl(ServiceList item){
                    this.builder = new ServiceListBuilder(this, item);
            }
            ServiceListObjectNestedImpl(){
                    this.builder = new ServiceListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceListObject(builder.build());
    }
    public N endServiceListObject(){
            return and();
    }

}
    public class StatefulSetUpdateStrategyObjectNestedImpl<N> extends StatefulSetUpdateStrategyFluentImpl<WatchEventFluent.StatefulSetUpdateStrategyObjectNested<N>> implements WatchEventFluent.StatefulSetUpdateStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetUpdateStrategyBuilder builder;
    
            StatefulSetUpdateStrategyObjectNestedImpl(StatefulSetUpdateStrategy item){
                    this.builder = new StatefulSetUpdateStrategyBuilder(this, item);
            }
            StatefulSetUpdateStrategyObjectNestedImpl(){
                    this.builder = new StatefulSetUpdateStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatefulSetUpdateStrategyObject(builder.build());
    }
    public N endStatefulSetUpdateStrategyObject(){
            return and();
    }

}
    public class EventsEventSeriesObjectNestedImpl<N> extends io.fabric8.kubernetes.api.model.events.EventSeriesFluentImpl<WatchEventFluent.EventsEventSeriesObjectNested<N>> implements WatchEventFluent.EventsEventSeriesObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.events.EventSeriesBuilder builder;
    
            EventsEventSeriesObjectNestedImpl(io.fabric8.kubernetes.api.model.events.EventSeries item){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(this, item);
            }
            EventsEventSeriesObjectNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.events.EventSeriesBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEventSeriesObject(builder.build());
    }
    public N endEventsEventSeriesObject(){
            return and();
    }

}
    public class VolumeNodeAffinityObjectNestedImpl<N> extends VolumeNodeAffinityFluentImpl<WatchEventFluent.VolumeNodeAffinityObjectNested<N>> implements WatchEventFluent.VolumeNodeAffinityObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeNodeAffinityBuilder builder;
    
            VolumeNodeAffinityObjectNestedImpl(VolumeNodeAffinity item){
                    this.builder = new VolumeNodeAffinityBuilder(this, item);
            }
            VolumeNodeAffinityObjectNestedImpl(){
                    this.builder = new VolumeNodeAffinityBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withVolumeNodeAffinityObject(builder.build());
    }
    public N endVolumeNodeAffinityObject(){
            return and();
    }

}
    public class PodsMetricStatusObjectNestedImpl<N> extends PodsMetricStatusFluentImpl<WatchEventFluent.PodsMetricStatusObjectNested<N>> implements WatchEventFluent.PodsMetricStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodsMetricStatusBuilder builder;
    
            PodsMetricStatusObjectNestedImpl(PodsMetricStatus item){
                    this.builder = new PodsMetricStatusBuilder(this, item);
            }
            PodsMetricStatusObjectNestedImpl(){
                    this.builder = new PodsMetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodsMetricStatusObject(builder.build());
    }
    public N endPodsMetricStatusObject(){
            return and();
    }

}
    public class ResourceQuotaSpecObjectNestedImpl<N> extends ResourceQuotaSpecFluentImpl<WatchEventFluent.ResourceQuotaSpecObjectNested<N>> implements WatchEventFluent.ResourceQuotaSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaSpecBuilder builder;
    
            ResourceQuotaSpecObjectNestedImpl(ResourceQuotaSpec item){
                    this.builder = new ResourceQuotaSpecBuilder(this, item);
            }
            ResourceQuotaSpecObjectNestedImpl(){
                    this.builder = new ResourceQuotaSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withResourceQuotaSpecObject(builder.build());
    }
    public N endResourceQuotaSpecObject(){
            return and();
    }

}
    public class GroupRestrictionObjectNestedImpl<N> extends GroupRestrictionFluentImpl<WatchEventFluent.GroupRestrictionObjectNested<N>> implements WatchEventFluent.GroupRestrictionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupRestrictionBuilder builder;
    
            GroupRestrictionObjectNestedImpl(GroupRestriction item){
                    this.builder = new GroupRestrictionBuilder(this, item);
            }
            GroupRestrictionObjectNestedImpl(){
                    this.builder = new GroupRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withGroupRestrictionObject(builder.build());
    }
    public N endGroupRestrictionObject(){
            return and();
    }

}
    public class JenkinsPipelineBuildStrategyObjectNestedImpl<N> extends JenkinsPipelineBuildStrategyFluentImpl<WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<N>> implements WatchEventFluent.JenkinsPipelineBuildStrategyObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JenkinsPipelineBuildStrategyBuilder builder;
    
            JenkinsPipelineBuildStrategyObjectNestedImpl(JenkinsPipelineBuildStrategy item){
                    this.builder = new JenkinsPipelineBuildStrategyBuilder(this, item);
            }
            JenkinsPipelineBuildStrategyObjectNestedImpl(){
                    this.builder = new JenkinsPipelineBuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJenkinsPipelineBuildStrategyObject(builder.build());
    }
    public N endJenkinsPipelineBuildStrategyObject(){
            return and();
    }

}
    public class SecurityContextConstraintsObjectNestedImpl<N> extends SecurityContextConstraintsFluentImpl<WatchEventFluent.SecurityContextConstraintsObjectNested<N>> implements WatchEventFluent.SecurityContextConstraintsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextConstraintsBuilder builder;
    
            SecurityContextConstraintsObjectNestedImpl(SecurityContextConstraints item){
                    this.builder = new SecurityContextConstraintsBuilder(this, item);
            }
            SecurityContextConstraintsObjectNestedImpl(){
                    this.builder = new SecurityContextConstraintsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSecurityContextConstraintsObject(builder.build());
    }
    public N endSecurityContextConstraintsObject(){
            return and();
    }

}
    public class SubjectObjectNestedImpl<N> extends SubjectFluentImpl<WatchEventFluent.SubjectObjectNested<N>> implements WatchEventFluent.SubjectObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectBuilder builder;
    
            SubjectObjectNestedImpl(Subject item){
                    this.builder = new SubjectBuilder(this, item);
            }
            SubjectObjectNestedImpl(){
                    this.builder = new SubjectBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSubjectObject(builder.build());
    }
    public N endSubjectObject(){
            return and();
    }

}
    public class ReplicaSetConditionObjectNestedImpl<N> extends ReplicaSetConditionFluentImpl<WatchEventFluent.ReplicaSetConditionObjectNested<N>> implements WatchEventFluent.ReplicaSetConditionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetConditionBuilder builder;
    
            ReplicaSetConditionObjectNestedImpl(ReplicaSetCondition item){
                    this.builder = new ReplicaSetConditionBuilder(this, item);
            }
            ReplicaSetConditionObjectNestedImpl(){
                    this.builder = new ReplicaSetConditionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicaSetConditionObject(builder.build());
    }
    public N endReplicaSetConditionObject(){
            return and();
    }

}
    public class BaseKubernetesListObjectNestedImpl<N> extends BaseKubernetesListFluentImpl<WatchEventFluent.BaseKubernetesListObjectNested<N>> implements WatchEventFluent.BaseKubernetesListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BaseKubernetesListBuilder builder;
    
            BaseKubernetesListObjectNestedImpl(BaseKubernetesList item){
                    this.builder = new BaseKubernetesListBuilder(this, item);
            }
            BaseKubernetesListObjectNestedImpl(){
                    this.builder = new BaseKubernetesListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBaseKubernetesListObject(builder.build());
    }
    public N endBaseKubernetesListObject(){
            return and();
    }

}
    public class SELinuxContextStrategyOptionsObjectNestedImpl<N> extends SELinuxContextStrategyOptionsFluentImpl<WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<N>> implements WatchEventFluent.SELinuxContextStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxContextStrategyOptionsBuilder builder;
    
            SELinuxContextStrategyOptionsObjectNestedImpl(SELinuxContextStrategyOptions item){
                    this.builder = new SELinuxContextStrategyOptionsBuilder(this, item);
            }
            SELinuxContextStrategyOptionsObjectNestedImpl(){
                    this.builder = new SELinuxContextStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSELinuxContextStrategyOptionsObject(builder.build());
    }
    public N endSELinuxContextStrategyOptionsObject(){
            return and();
    }

}
    public class TopologySelectorLabelRequirementObjectNestedImpl<N> extends TopologySelectorLabelRequirementFluentImpl<WatchEventFluent.TopologySelectorLabelRequirementObjectNested<N>> implements WatchEventFluent.TopologySelectorLabelRequirementObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TopologySelectorLabelRequirementBuilder builder;
    
            TopologySelectorLabelRequirementObjectNestedImpl(TopologySelectorLabelRequirement item){
                    this.builder = new TopologySelectorLabelRequirementBuilder(this, item);
            }
            TopologySelectorLabelRequirementObjectNestedImpl(){
                    this.builder = new TopologySelectorLabelRequirementBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withTopologySelectorLabelRequirementObject(builder.build());
    }
    public N endTopologySelectorLabelRequirementObject(){
            return and();
    }

}
    public class RBDPersistentVolumeSourceObjectNestedImpl<N> extends RBDPersistentVolumeSourceFluentImpl<WatchEventFluent.RBDPersistentVolumeSourceObjectNested<N>> implements WatchEventFluent.RBDPersistentVolumeSourceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RBDPersistentVolumeSourceBuilder builder;
    
            RBDPersistentVolumeSourceObjectNestedImpl(RBDPersistentVolumeSource item){
                    this.builder = new RBDPersistentVolumeSourceBuilder(this, item);
            }
            RBDPersistentVolumeSourceObjectNestedImpl(){
                    this.builder = new RBDPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRBDPersistentVolumeSourceObject(builder.build());
    }
    public N endRBDPersistentVolumeSourceObject(){
            return and();
    }

}
    public class SELinuxOptionsObjectNestedImpl<N> extends SELinuxOptionsFluentImpl<WatchEventFluent.SELinuxOptionsObjectNested<N>> implements WatchEventFluent.SELinuxOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxOptionsBuilder builder;
    
            SELinuxOptionsObjectNestedImpl(SELinuxOptions item){
                    this.builder = new SELinuxOptionsBuilder(this, item);
            }
            SELinuxOptionsObjectNestedImpl(){
                    this.builder = new SELinuxOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSELinuxOptionsObject(builder.build());
    }
    public N endSELinuxOptionsObject(){
            return and();
    }

}
    public class HostAliasObjectNestedImpl<N> extends HostAliasFluentImpl<WatchEventFluent.HostAliasObjectNested<N>> implements WatchEventFluent.HostAliasObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostAliasBuilder builder;
    
            HostAliasObjectNestedImpl(HostAlias item){
                    this.builder = new HostAliasBuilder(this, item);
            }
            HostAliasObjectNestedImpl(){
                    this.builder = new HostAliasBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withHostAliasObject(builder.build());
    }
    public N endHostAliasObject(){
            return and();
    }

}
    public class ImageStreamStatusObjectNestedImpl<N> extends ImageStreamStatusFluentImpl<WatchEventFluent.ImageStreamStatusObjectNested<N>> implements WatchEventFluent.ImageStreamStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamStatusBuilder builder;
    
            ImageStreamStatusObjectNestedImpl(ImageStreamStatus item){
                    this.builder = new ImageStreamStatusBuilder(this, item);
            }
            ImageStreamStatusObjectNestedImpl(){
                    this.builder = new ImageStreamStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withImageStreamStatusObject(builder.build());
    }
    public N endImageStreamStatusObject(){
            return and();
    }

}
    public class NodeDaemonEndpointsObjectNestedImpl<N> extends NodeDaemonEndpointsFluentImpl<WatchEventFluent.NodeDaemonEndpointsObjectNested<N>> implements WatchEventFluent.NodeDaemonEndpointsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeDaemonEndpointsBuilder builder;
    
            NodeDaemonEndpointsObjectNestedImpl(NodeDaemonEndpoints item){
                    this.builder = new NodeDaemonEndpointsBuilder(this, item);
            }
            NodeDaemonEndpointsObjectNestedImpl(){
                    this.builder = new NodeDaemonEndpointsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeDaemonEndpointsObject(builder.build());
    }
    public N endNodeDaemonEndpointsObject(){
            return and();
    }

}
    public class NetNamespaceObjectNestedImpl<N> extends NetNamespaceFluentImpl<WatchEventFluent.NetNamespaceObjectNested<N>> implements WatchEventFluent.NetNamespaceObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetNamespaceBuilder builder;
    
            NetNamespaceObjectNestedImpl(NetNamespace item){
                    this.builder = new NetNamespaceBuilder(this, item);
            }
            NetNamespaceObjectNestedImpl(){
                    this.builder = new NetNamespaceBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNetNamespaceObject(builder.build());
    }
    public N endNetNamespaceObject(){
            return and();
    }

}
    public class PersistentVolumeSpecObjectNestedImpl<N> extends PersistentVolumeSpecFluentImpl<WatchEventFluent.PersistentVolumeSpecObjectNested<N>> implements WatchEventFluent.PersistentVolumeSpecObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeSpecBuilder builder;
    
            PersistentVolumeSpecObjectNestedImpl(PersistentVolumeSpec item){
                    this.builder = new PersistentVolumeSpecBuilder(this, item);
            }
            PersistentVolumeSpecObjectNestedImpl(){
                    this.builder = new PersistentVolumeSpecBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeSpecObject(builder.build());
    }
    public N endPersistentVolumeSpecObject(){
            return and();
    }

}
    public class StatefulSetListObjectNestedImpl<N> extends StatefulSetListFluentImpl<WatchEventFluent.StatefulSetListObjectNested<N>> implements WatchEventFluent.StatefulSetListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetListBuilder builder;
    
            StatefulSetListObjectNestedImpl(StatefulSetList item){
                    this.builder = new StatefulSetListBuilder(this, item);
            }
            StatefulSetListObjectNestedImpl(){
                    this.builder = new StatefulSetListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withStatefulSetListObject(builder.build());
    }
    public N endStatefulSetListObject(){
            return and();
    }

}
    public class OpenshiftClusterRoleBindingListObjectNestedImpl<N> extends OpenshiftClusterRoleBindingListFluentImpl<WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<N>> implements WatchEventFluent.OpenshiftClusterRoleBindingListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleBindingListBuilder builder;
    
            OpenshiftClusterRoleBindingListObjectNestedImpl(OpenshiftClusterRoleBindingList item){
                    this.builder = new OpenshiftClusterRoleBindingListBuilder(this, item);
            }
            OpenshiftClusterRoleBindingListObjectNestedImpl(){
                    this.builder = new OpenshiftClusterRoleBindingListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withOpenshiftClusterRoleBindingListObject(builder.build());
    }
    public N endOpenshiftClusterRoleBindingListObject(){
            return and();
    }

}
    public class ReplicaSetStatusObjectNestedImpl<N> extends ReplicaSetStatusFluentImpl<WatchEventFluent.ReplicaSetStatusObjectNested<N>> implements WatchEventFluent.ReplicaSetStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetStatusBuilder builder;
    
            ReplicaSetStatusObjectNestedImpl(ReplicaSetStatus item){
                    this.builder = new ReplicaSetStatusBuilder(this, item);
            }
            ReplicaSetStatusObjectNestedImpl(){
                    this.builder = new ReplicaSetStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withReplicaSetStatusObject(builder.build());
    }
    public N endReplicaSetStatusObject(){
            return and();
    }

}
    public class NodeObjectNestedImpl<N> extends NodeFluentImpl<WatchEventFluent.NodeObjectNested<N>> implements WatchEventFluent.NodeObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeBuilder builder;
    
            NodeObjectNestedImpl(Node item){
                    this.builder = new NodeBuilder(this, item);
            }
            NodeObjectNestedImpl(){
                    this.builder = new NodeBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withNodeObject(builder.build());
    }
    public N endNodeObject(){
            return and();
    }

}
    public class PriorityClassListObjectNestedImpl<N> extends PriorityClassListFluentImpl<WatchEventFluent.PriorityClassListObjectNested<N>> implements WatchEventFluent.PriorityClassListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PriorityClassListBuilder builder;
    
            PriorityClassListObjectNestedImpl(PriorityClassList item){
                    this.builder = new PriorityClassListBuilder(this, item);
            }
            PriorityClassListObjectNestedImpl(){
                    this.builder = new PriorityClassListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPriorityClassListObject(builder.build());
    }
    public N endPriorityClassListObject(){
            return and();
    }

}
    public class JobObjectNestedImpl<N> extends JobFluentImpl<WatchEventFluent.JobObjectNested<N>> implements WatchEventFluent.JobObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobBuilder builder;
    
            JobObjectNestedImpl(Job item){
                    this.builder = new JobBuilder(this, item);
            }
            JobObjectNestedImpl(){
                    this.builder = new JobBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJobObject(builder.build());
    }
    public N endJobObject(){
            return and();
    }

}
    public class PodStatusObjectNestedImpl<N> extends PodStatusFluentImpl<WatchEventFluent.PodStatusObjectNested<N>> implements WatchEventFluent.PodStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodStatusBuilder builder;
    
            PodStatusObjectNestedImpl(PodStatus item){
                    this.builder = new PodStatusBuilder(this, item);
            }
            PodStatusObjectNestedImpl(){
                    this.builder = new PodStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPodStatusObject(builder.build());
    }
    public N endPodStatusObject(){
            return and();
    }

}
    public class BuildOutputObjectNestedImpl<N> extends BuildOutputFluentImpl<WatchEventFluent.BuildOutputObjectNested<N>> implements WatchEventFluent.BuildOutputObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildOutputBuilder builder;
    
            BuildOutputObjectNestedImpl(BuildOutput item){
                    this.builder = new BuildOutputBuilder(this, item);
            }
            BuildOutputObjectNestedImpl(){
                    this.builder = new BuildOutputBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withBuildOutputObject(builder.build());
    }
    public N endBuildOutputObject(){
            return and();
    }

}
    public class ExecConfigObjectNestedImpl<N> extends ExecConfigFluentImpl<WatchEventFluent.ExecConfigObjectNested<N>> implements WatchEventFluent.ExecConfigObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecConfigBuilder builder;
    
            ExecConfigObjectNestedImpl(ExecConfig item){
                    this.builder = new ExecConfigBuilder(this, item);
            }
            ExecConfigObjectNestedImpl(){
                    this.builder = new ExecConfigBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withExecConfigObject(builder.build());
    }
    public N endExecConfigObject(){
            return and();
    }

}
    public class PersistentVolumeStatusObjectNestedImpl<N> extends PersistentVolumeStatusFluentImpl<WatchEventFluent.PersistentVolumeStatusObjectNested<N>> implements WatchEventFluent.PersistentVolumeStatusObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeStatusBuilder builder;
    
            PersistentVolumeStatusObjectNestedImpl(PersistentVolumeStatus item){
                    this.builder = new PersistentVolumeStatusBuilder(this, item);
            }
            PersistentVolumeStatusObjectNestedImpl(){
                    this.builder = new PersistentVolumeStatusBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withPersistentVolumeStatusObject(builder.build());
    }
    public N endPersistentVolumeStatusObject(){
            return and();
    }

}
    public class EndpointPortObjectNestedImpl<N> extends EndpointPortFluentImpl<WatchEventFluent.EndpointPortObjectNested<N>> implements WatchEventFluent.EndpointPortObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointPortBuilder builder;
    
            EndpointPortObjectNestedImpl(EndpointPort item){
                    this.builder = new EndpointPortBuilder(this, item);
            }
            EndpointPortObjectNestedImpl(){
                    this.builder = new EndpointPortBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withEndpointPortObject(builder.build());
    }
    public N endEndpointPortObject(){
            return and();
    }

}
    public class SourceRevisionObjectNestedImpl<N> extends SourceRevisionFluentImpl<WatchEventFluent.SourceRevisionObjectNested<N>> implements WatchEventFluent.SourceRevisionObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceRevisionBuilder builder;
    
            SourceRevisionObjectNestedImpl(SourceRevision item){
                    this.builder = new SourceRevisionBuilder(this, item);
            }
            SourceRevisionObjectNestedImpl(){
                    this.builder = new SourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withSourceRevisionObject(builder.build());
    }
    public N endSourceRevisionObject(){
            return and();
    }

}
    public class JSONObjectNestedImpl<N> extends JSONFluentImpl<WatchEventFluent.JSONObjectNested<N>> implements WatchEventFluent.JSONObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONBuilder builder;
    
            JSONObjectNestedImpl(JSON item){
                    this.builder = new JSONBuilder(this, item);
            }
            JSONObjectNestedImpl(){
                    this.builder = new JSONBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withJSONObject(builder.build());
    }
    public N endJSONObject(){
            return and();
    }

}
    public class LimitRangeItemObjectNestedImpl<N> extends LimitRangeItemFluentImpl<WatchEventFluent.LimitRangeItemObjectNested<N>> implements WatchEventFluent.LimitRangeItemObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeItemBuilder builder;
    
            LimitRangeItemObjectNestedImpl(LimitRangeItem item){
                    this.builder = new LimitRangeItemBuilder(this, item);
            }
            LimitRangeItemObjectNestedImpl(){
                    this.builder = new LimitRangeItemBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withLimitRangeItemObject(builder.build());
    }
    public N endLimitRangeItemObject(){
            return and();
    }

}
    public class CertificateSigningRequestObjectNestedImpl<N> extends CertificateSigningRequestFluentImpl<WatchEventFluent.CertificateSigningRequestObjectNested<N>> implements WatchEventFluent.CertificateSigningRequestObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CertificateSigningRequestBuilder builder;
    
            CertificateSigningRequestObjectNestedImpl(CertificateSigningRequest item){
                    this.builder = new CertificateSigningRequestBuilder(this, item);
            }
            CertificateSigningRequestObjectNestedImpl(){
                    this.builder = new CertificateSigningRequestBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withCertificateSigningRequestObject(builder.build());
    }
    public N endCertificateSigningRequestObject(){
            return and();
    }

}
    public class FSGroupStrategyOptionsObjectNestedImpl<N> extends FSGroupStrategyOptionsFluentImpl<WatchEventFluent.FSGroupStrategyOptionsObjectNested<N>> implements WatchEventFluent.FSGroupStrategyOptionsObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FSGroupStrategyOptionsBuilder builder;
    
            FSGroupStrategyOptionsObjectNestedImpl(FSGroupStrategyOptions item){
                    this.builder = new FSGroupStrategyOptionsBuilder(this, item);
            }
            FSGroupStrategyOptionsObjectNestedImpl(){
                    this.builder = new FSGroupStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withFSGroupStrategyOptionsObject(builder.build());
    }
    public N endFSGroupStrategyOptionsObject(){
            return and();
    }

}
    public class ClusterRoleListObjectNestedImpl<N> extends ClusterRoleListFluentImpl<WatchEventFluent.ClusterRoleListObjectNested<N>> implements WatchEventFluent.ClusterRoleListObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClusterRoleListBuilder builder;
    
            ClusterRoleListObjectNestedImpl(ClusterRoleList item){
                    this.builder = new ClusterRoleListBuilder(this, item);
            }
            ClusterRoleListObjectNestedImpl(){
                    this.builder = new ClusterRoleListBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withClusterRoleListObject(builder.build());
    }
    public N endClusterRoleListObject(){
            return and();
    }

}
    public class RouteIngressObjectNestedImpl<N> extends RouteIngressFluentImpl<WatchEventFluent.RouteIngressObjectNested<N>> implements WatchEventFluent.RouteIngressObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteIngressBuilder builder;
    
            RouteIngressObjectNestedImpl(RouteIngress item){
                    this.builder = new RouteIngressBuilder(this, item);
            }
            RouteIngressObjectNestedImpl(){
                    this.builder = new RouteIngressBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withRouteIngressObject(builder.build());
    }
    public N endRouteIngressObject(){
            return and();
    }

}
    public class ServiceAccountObjectNestedImpl<N> extends ServiceAccountFluentImpl<WatchEventFluent.ServiceAccountObjectNested<N>> implements WatchEventFluent.ServiceAccountObjectNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountBuilder builder;
    
            ServiceAccountObjectNestedImpl(ServiceAccount item){
                    this.builder = new ServiceAccountBuilder(this, item);
            }
            ServiceAccountObjectNestedImpl(){
                    this.builder = new ServiceAccountBuilder(this);
            }
    
    public N and(){
            return (N) WatchEventFluentImpl.this.withServiceAccountObject(builder.build());
    }
    public N endServiceAccountObject(){
            return and();
    }

}


}
