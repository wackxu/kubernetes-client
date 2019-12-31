package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodSecurityPolicySpecBuilder extends PodSecurityPolicySpecFluentImpl<PodSecurityPolicySpecBuilder> implements VisitableBuilder<PodSecurityPolicySpec,PodSecurityPolicySpecBuilder>{

    PodSecurityPolicySpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodSecurityPolicySpecBuilder(){
            this(true);
    }
    public PodSecurityPolicySpecBuilder(Boolean validationEnabled){
            this(new PodSecurityPolicySpec(), validationEnabled);
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpecFluent<?> fluent){
            this(fluent, true);
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodSecurityPolicySpec(), validationEnabled);
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpecFluent<?> fluent,PodSecurityPolicySpec instance){
            this(fluent, instance, true);
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpecFluent<?> fluent,PodSecurityPolicySpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            fluent.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            fluent.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            fluent.withAllowedHostPaths(instance.getAllowedHostPaths()); 
            fluent.withAllowedProcMountTypes(instance.getAllowedProcMountTypes()); 
            fluent.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            fluent.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            fluent.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            fluent.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            fluent.withFsGroup(instance.getFsGroup()); 
            fluent.withHostIPC(instance.getHostIPC()); 
            fluent.withHostNetwork(instance.getHostNetwork()); 
            fluent.withHostPID(instance.getHostPID()); 
            fluent.withHostPorts(instance.getHostPorts()); 
            fluent.withPrivileged(instance.getPrivileged()); 
            fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            fluent.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            fluent.withRunAsGroup(instance.getRunAsGroup()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinux(instance.getSeLinux()); 
            fluent.withSupplementalGroups(instance.getSupplementalGroups()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpec instance){
            this(instance,true);
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            this.withAllowedHostPaths(instance.getAllowedHostPaths()); 
            this.withAllowedProcMountTypes(instance.getAllowedProcMountTypes()); 
            this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            this.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            this.withFsGroup(instance.getFsGroup()); 
            this.withHostIPC(instance.getHostIPC()); 
            this.withHostNetwork(instance.getHostNetwork()); 
            this.withHostPID(instance.getHostPID()); 
            this.withHostPorts(instance.getHostPorts()); 
            this.withPrivileged(instance.getPrivileged()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinux(instance.getSeLinux()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityPolicySpecBuilder(Validator validator){
            this(new PodSecurityPolicySpec(), true);
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpecFluent<?> fluent,PodSecurityPolicySpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            fluent.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            fluent.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            fluent.withAllowedHostPaths(instance.getAllowedHostPaths()); 
            fluent.withAllowedProcMountTypes(instance.getAllowedProcMountTypes()); 
            fluent.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            fluent.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            fluent.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            fluent.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            fluent.withFsGroup(instance.getFsGroup()); 
            fluent.withHostIPC(instance.getHostIPC()); 
            fluent.withHostNetwork(instance.getHostNetwork()); 
            fluent.withHostPID(instance.getHostPID()); 
            fluent.withHostPorts(instance.getHostPorts()); 
            fluent.withPrivileged(instance.getPrivileged()); 
            fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            fluent.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            fluent.withRunAsGroup(instance.getRunAsGroup()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinux(instance.getSeLinux()); 
            fluent.withSupplementalGroups(instance.getSupplementalGroups()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodSecurityPolicySpecBuilder(PodSecurityPolicySpec instance,Validator validator){
            this.fluent = this; 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            this.withAllowedHostPaths(instance.getAllowedHostPaths()); 
            this.withAllowedProcMountTypes(instance.getAllowedProcMountTypes()); 
            this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            this.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            this.withFsGroup(instance.getFsGroup()); 
            this.withHostIPC(instance.getHostIPC()); 
            this.withHostNetwork(instance.getHostNetwork()); 
            this.withHostPID(instance.getHostPID()); 
            this.withHostPorts(instance.getHostPorts()); 
            this.withPrivileged(instance.getPrivileged()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinux(instance.getSeLinux()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withVolumes(instance.getVolumes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodSecurityPolicySpec build(){
            PodSecurityPolicySpec buildable = new PodSecurityPolicySpec(fluent.isAllowPrivilegeEscalation(),fluent.getAllowedCapabilities(),fluent.getAllowedFlexVolumes(),fluent.getAllowedHostPaths(),fluent.getAllowedProcMountTypes(),fluent.getAllowedUnsafeSysctls(),fluent.getDefaultAddCapabilities(),fluent.isDefaultAllowPrivilegeEscalation(),fluent.getForbiddenSysctls(),fluent.getFsGroup(),fluent.isHostIPC(),fluent.isHostNetwork(),fluent.isHostPID(),fluent.getHostPorts(),fluent.isPrivileged(),fluent.isReadOnlyRootFilesystem(),fluent.getRequiredDropCapabilities(),fluent.getRunAsGroup(),fluent.getRunAsUser(),fluent.getSeLinux(),fluent.getSupplementalGroups(),fluent.getVolumes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSecurityPolicySpecBuilder that = (PodSecurityPolicySpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
