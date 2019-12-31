package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecurityContextConstraintsBuilder extends SecurityContextConstraintsFluentImpl<SecurityContextConstraintsBuilder> implements VisitableBuilder<SecurityContextConstraints,SecurityContextConstraintsBuilder>{

    SecurityContextConstraintsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecurityContextConstraintsBuilder(){
            this(true);
    }
    public SecurityContextConstraintsBuilder(Boolean validationEnabled){
            this(new SecurityContextConstraints(), validationEnabled);
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraintsFluent<?> fluent){
            this(fluent, true);
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraintsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecurityContextConstraints(), validationEnabled);
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraintsFluent<?> fluent,SecurityContextConstraints instance){
            this(fluent, instance, true);
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraintsFluent<?> fluent,SecurityContextConstraints instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowHostDirVolumePlugin(instance.getAllowHostDirVolumePlugin()); 
            fluent.withAllowHostIPC(instance.getAllowHostIPC()); 
            fluent.withAllowHostNetwork(instance.getAllowHostNetwork()); 
            fluent.withAllowHostPID(instance.getAllowHostPID()); 
            fluent.withAllowHostPorts(instance.getAllowHostPorts()); 
            fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            fluent.withAllowPrivilegedContainer(instance.getAllowPrivilegedContainer()); 
            fluent.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            fluent.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            fluent.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            fluent.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            fluent.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            fluent.withFsGroup(instance.getFsGroup()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withPriority(instance.getPriority()); 
            fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            fluent.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinuxContext(instance.getSeLinuxContext()); 
            fluent.withSeccompProfiles(instance.getSeccompProfiles()); 
            fluent.withSupplementalGroups(instance.getSupplementalGroups()); 
            fluent.withUsers(instance.getUsers()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraints instance){
            this(instance,true);
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraints instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowHostDirVolumePlugin(instance.getAllowHostDirVolumePlugin()); 
            this.withAllowHostIPC(instance.getAllowHostIPC()); 
            this.withAllowHostNetwork(instance.getAllowHostNetwork()); 
            this.withAllowHostPID(instance.getAllowHostPID()); 
            this.withAllowHostPorts(instance.getAllowHostPorts()); 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withAllowPrivilegedContainer(instance.getAllowPrivilegedContainer()); 
            this.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            this.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            this.withFsGroup(instance.getFsGroup()); 
            this.withGroups(instance.getGroups()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withPriority(instance.getPriority()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxContext(instance.getSeLinuxContext()); 
            this.withSeccompProfiles(instance.getSeccompProfiles()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withUsers(instance.getUsers()); 
            this.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecurityContextConstraintsBuilder(Validator validator){
            this(new SecurityContextConstraints(), true);
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraintsFluent<?> fluent,SecurityContextConstraints instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowHostDirVolumePlugin(instance.getAllowHostDirVolumePlugin()); 
            fluent.withAllowHostIPC(instance.getAllowHostIPC()); 
            fluent.withAllowHostNetwork(instance.getAllowHostNetwork()); 
            fluent.withAllowHostPID(instance.getAllowHostPID()); 
            fluent.withAllowHostPorts(instance.getAllowHostPorts()); 
            fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            fluent.withAllowPrivilegedContainer(instance.getAllowPrivilegedContainer()); 
            fluent.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            fluent.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            fluent.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            fluent.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            fluent.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            fluent.withFsGroup(instance.getFsGroup()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withPriority(instance.getPriority()); 
            fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            fluent.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinuxContext(instance.getSeLinuxContext()); 
            fluent.withSeccompProfiles(instance.getSeccompProfiles()); 
            fluent.withSupplementalGroups(instance.getSupplementalGroups()); 
            fluent.withUsers(instance.getUsers()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecurityContextConstraintsBuilder(SecurityContextConstraints instance,Validator validator){
            this.fluent = this; 
            this.withAllowHostDirVolumePlugin(instance.getAllowHostDirVolumePlugin()); 
            this.withAllowHostIPC(instance.getAllowHostIPC()); 
            this.withAllowHostNetwork(instance.getAllowHostNetwork()); 
            this.withAllowHostPID(instance.getAllowHostPID()); 
            this.withAllowHostPorts(instance.getAllowHostPorts()); 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withAllowPrivilegedContainer(instance.getAllowPrivilegedContainer()); 
            this.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            this.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            this.withFsGroup(instance.getFsGroup()); 
            this.withGroups(instance.getGroups()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withPriority(instance.getPriority()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxContext(instance.getSeLinuxContext()); 
            this.withSeccompProfiles(instance.getSeccompProfiles()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withUsers(instance.getUsers()); 
            this.withVolumes(instance.getVolumes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecurityContextConstraints build(){
            SecurityContextConstraints buildable = new SecurityContextConstraints(fluent.isAllowHostDirVolumePlugin(),fluent.isAllowHostIPC(),fluent.isAllowHostNetwork(),fluent.isAllowHostPID(),fluent.isAllowHostPorts(),fluent.isAllowPrivilegeEscalation(),fluent.isAllowPrivilegedContainer(),fluent.getAllowedCapabilities(),fluent.getAllowedFlexVolumes(),fluent.getAllowedUnsafeSysctls(),fluent.getApiVersion(),fluent.getDefaultAddCapabilities(),fluent.isDefaultAllowPrivilegeEscalation(),fluent.getForbiddenSysctls(),fluent.getFsGroup(),fluent.getGroups(),fluent.getKind(),fluent.getMetadata(),fluent.getPriority(),fluent.isReadOnlyRootFilesystem(),fluent.getRequiredDropCapabilities(),fluent.getRunAsUser(),fluent.getSeLinuxContext(),fluent.getSeccompProfiles(),fluent.getSupplementalGroups(),fluent.getUsers(),fluent.getVolumes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecurityContextConstraintsBuilder that = (SecurityContextConstraintsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
