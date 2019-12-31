package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodSpecBuilder extends PodSpecFluentImpl<PodSpecBuilder> implements VisitableBuilder<PodSpec,PodSpecBuilder>{

    PodSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodSpecBuilder(){
            this(true);
    }
    public PodSpecBuilder(Boolean validationEnabled){
            this(new PodSpec(), validationEnabled);
    }
    public PodSpecBuilder(PodSpecFluent<?> fluent){
            this(fluent, true);
    }
    public PodSpecBuilder(PodSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodSpec(), validationEnabled);
    }
    public PodSpecBuilder(PodSpecFluent<?> fluent,PodSpec instance){
            this(fluent, instance, true);
    }
    public PodSpecBuilder(PodSpecFluent<?> fluent,PodSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            fluent.withAffinity(instance.getAffinity()); 
            fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            fluent.withContainers(instance.getContainers()); 
            fluent.withDnsConfig(instance.getDnsConfig()); 
            fluent.withDnsPolicy(instance.getDnsPolicy()); 
            fluent.withEnableServiceLinks(instance.getEnableServiceLinks()); 
            fluent.withHostAliases(instance.getHostAliases()); 
            fluent.withHostIPC(instance.getHostIPC()); 
            fluent.withHostNetwork(instance.getHostNetwork()); 
            fluent.withHostPID(instance.getHostPID()); 
            fluent.withHostname(instance.getHostname()); 
            fluent.withImagePullSecrets(instance.getImagePullSecrets()); 
            fluent.withInitContainers(instance.getInitContainers()); 
            fluent.withNodeName(instance.getNodeName()); 
            fluent.withNodeSelector(instance.getNodeSelector()); 
            fluent.withPriority(instance.getPriority()); 
            fluent.withPriorityClassName(instance.getPriorityClassName()); 
            fluent.withReadinessGates(instance.getReadinessGates()); 
            fluent.withRestartPolicy(instance.getRestartPolicy()); 
            fluent.withRuntimeClassName(instance.getRuntimeClassName()); 
            fluent.withSchedulerName(instance.getSchedulerName()); 
            fluent.withSecurityContext(instance.getSecurityContext()); 
            fluent.withServiceAccount(instance.getServiceAccount()); 
            fluent.withServiceAccountName(instance.getServiceAccountName()); 
            fluent.withShareProcessNamespace(instance.getShareProcessNamespace()); 
            fluent.withSubdomain(instance.getSubdomain()); 
            fluent.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds()); 
            fluent.withTolerations(instance.getTolerations()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSpecBuilder(PodSpec instance){
            this(instance,true);
    }
    public PodSpecBuilder(PodSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withAffinity(instance.getAffinity()); 
            this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            this.withContainers(instance.getContainers()); 
            this.withDnsConfig(instance.getDnsConfig()); 
            this.withDnsPolicy(instance.getDnsPolicy()); 
            this.withEnableServiceLinks(instance.getEnableServiceLinks()); 
            this.withHostAliases(instance.getHostAliases()); 
            this.withHostIPC(instance.getHostIPC()); 
            this.withHostNetwork(instance.getHostNetwork()); 
            this.withHostPID(instance.getHostPID()); 
            this.withHostname(instance.getHostname()); 
            this.withImagePullSecrets(instance.getImagePullSecrets()); 
            this.withInitContainers(instance.getInitContainers()); 
            this.withNodeName(instance.getNodeName()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withPriority(instance.getPriority()); 
            this.withPriorityClassName(instance.getPriorityClassName()); 
            this.withReadinessGates(instance.getReadinessGates()); 
            this.withRestartPolicy(instance.getRestartPolicy()); 
            this.withRuntimeClassName(instance.getRuntimeClassName()); 
            this.withSchedulerName(instance.getSchedulerName()); 
            this.withSecurityContext(instance.getSecurityContext()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withServiceAccountName(instance.getServiceAccountName()); 
            this.withShareProcessNamespace(instance.getShareProcessNamespace()); 
            this.withSubdomain(instance.getSubdomain()); 
            this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds()); 
            this.withTolerations(instance.getTolerations()); 
            this.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSpecBuilder(Validator validator){
            this(new PodSpec(), true);
    }
    public PodSpecBuilder(PodSpecFluent<?> fluent,PodSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            fluent.withAffinity(instance.getAffinity()); 
            fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            fluent.withContainers(instance.getContainers()); 
            fluent.withDnsConfig(instance.getDnsConfig()); 
            fluent.withDnsPolicy(instance.getDnsPolicy()); 
            fluent.withEnableServiceLinks(instance.getEnableServiceLinks()); 
            fluent.withHostAliases(instance.getHostAliases()); 
            fluent.withHostIPC(instance.getHostIPC()); 
            fluent.withHostNetwork(instance.getHostNetwork()); 
            fluent.withHostPID(instance.getHostPID()); 
            fluent.withHostname(instance.getHostname()); 
            fluent.withImagePullSecrets(instance.getImagePullSecrets()); 
            fluent.withInitContainers(instance.getInitContainers()); 
            fluent.withNodeName(instance.getNodeName()); 
            fluent.withNodeSelector(instance.getNodeSelector()); 
            fluent.withPriority(instance.getPriority()); 
            fluent.withPriorityClassName(instance.getPriorityClassName()); 
            fluent.withReadinessGates(instance.getReadinessGates()); 
            fluent.withRestartPolicy(instance.getRestartPolicy()); 
            fluent.withRuntimeClassName(instance.getRuntimeClassName()); 
            fluent.withSchedulerName(instance.getSchedulerName()); 
            fluent.withSecurityContext(instance.getSecurityContext()); 
            fluent.withServiceAccount(instance.getServiceAccount()); 
            fluent.withServiceAccountName(instance.getServiceAccountName()); 
            fluent.withShareProcessNamespace(instance.getShareProcessNamespace()); 
            fluent.withSubdomain(instance.getSubdomain()); 
            fluent.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds()); 
            fluent.withTolerations(instance.getTolerations()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodSpecBuilder(PodSpec instance,Validator validator){
            this.fluent = this; 
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withAffinity(instance.getAffinity()); 
            this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            this.withContainers(instance.getContainers()); 
            this.withDnsConfig(instance.getDnsConfig()); 
            this.withDnsPolicy(instance.getDnsPolicy()); 
            this.withEnableServiceLinks(instance.getEnableServiceLinks()); 
            this.withHostAliases(instance.getHostAliases()); 
            this.withHostIPC(instance.getHostIPC()); 
            this.withHostNetwork(instance.getHostNetwork()); 
            this.withHostPID(instance.getHostPID()); 
            this.withHostname(instance.getHostname()); 
            this.withImagePullSecrets(instance.getImagePullSecrets()); 
            this.withInitContainers(instance.getInitContainers()); 
            this.withNodeName(instance.getNodeName()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withPriority(instance.getPriority()); 
            this.withPriorityClassName(instance.getPriorityClassName()); 
            this.withReadinessGates(instance.getReadinessGates()); 
            this.withRestartPolicy(instance.getRestartPolicy()); 
            this.withRuntimeClassName(instance.getRuntimeClassName()); 
            this.withSchedulerName(instance.getSchedulerName()); 
            this.withSecurityContext(instance.getSecurityContext()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withServiceAccountName(instance.getServiceAccountName()); 
            this.withShareProcessNamespace(instance.getShareProcessNamespace()); 
            this.withSubdomain(instance.getSubdomain()); 
            this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds()); 
            this.withTolerations(instance.getTolerations()); 
            this.withVolumes(instance.getVolumes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodSpec build(){
            PodSpec buildable = new PodSpec(fluent.getActiveDeadlineSeconds(),fluent.getAffinity(),fluent.isAutomountServiceAccountToken(),fluent.getContainers(),fluent.getDnsConfig(),fluent.getDnsPolicy(),fluent.isEnableServiceLinks(),fluent.getHostAliases(),fluent.isHostIPC(),fluent.isHostNetwork(),fluent.isHostPID(),fluent.getHostname(),fluent.getImagePullSecrets(),fluent.getInitContainers(),fluent.getNodeName(),fluent.getNodeSelector(),fluent.getPriority(),fluent.getPriorityClassName(),fluent.getReadinessGates(),fluent.getRestartPolicy(),fluent.getRuntimeClassName(),fluent.getSchedulerName(),fluent.getSecurityContext(),fluent.getServiceAccount(),fluent.getServiceAccountName(),fluent.isShareProcessNamespace(),fluent.getSubdomain(),fluent.getTerminationGracePeriodSeconds(),fluent.getTolerations(),fluent.getVolumes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSpecBuilder that = (PodSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
