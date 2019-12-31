package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeSystemInfoBuilder extends NodeSystemInfoFluentImpl<NodeSystemInfoBuilder> implements VisitableBuilder<NodeSystemInfo,NodeSystemInfoBuilder>{

    NodeSystemInfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeSystemInfoBuilder(){
            this(true);
    }
    public NodeSystemInfoBuilder(Boolean validationEnabled){
            this(new NodeSystemInfo(), validationEnabled);
    }
    public NodeSystemInfoBuilder(NodeSystemInfoFluent<?> fluent){
            this(fluent, true);
    }
    public NodeSystemInfoBuilder(NodeSystemInfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeSystemInfo(), validationEnabled);
    }
    public NodeSystemInfoBuilder(NodeSystemInfoFluent<?> fluent,NodeSystemInfo instance){
            this(fluent, instance, true);
    }
    public NodeSystemInfoBuilder(NodeSystemInfoFluent<?> fluent,NodeSystemInfo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withArchitecture(instance.getArchitecture()); 
            fluent.withBootID(instance.getBootID()); 
            fluent.withContainerRuntimeVersion(instance.getContainerRuntimeVersion()); 
            fluent.withKernelVersion(instance.getKernelVersion()); 
            fluent.withKubeProxyVersion(instance.getKubeProxyVersion()); 
            fluent.withKubeletVersion(instance.getKubeletVersion()); 
            fluent.withMachineID(instance.getMachineID()); 
            fluent.withOperatingSystem(instance.getOperatingSystem()); 
            fluent.withOsImage(instance.getOsImage()); 
            fluent.withSystemUUID(instance.getSystemUUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSystemInfoBuilder(NodeSystemInfo instance){
            this(instance,true);
    }
    public NodeSystemInfoBuilder(NodeSystemInfo instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withArchitecture(instance.getArchitecture()); 
            this.withBootID(instance.getBootID()); 
            this.withContainerRuntimeVersion(instance.getContainerRuntimeVersion()); 
            this.withKernelVersion(instance.getKernelVersion()); 
            this.withKubeProxyVersion(instance.getKubeProxyVersion()); 
            this.withKubeletVersion(instance.getKubeletVersion()); 
            this.withMachineID(instance.getMachineID()); 
            this.withOperatingSystem(instance.getOperatingSystem()); 
            this.withOsImage(instance.getOsImage()); 
            this.withSystemUUID(instance.getSystemUUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSystemInfoBuilder(Validator validator){
            this(new NodeSystemInfo(), true);
    }
    public NodeSystemInfoBuilder(NodeSystemInfoFluent<?> fluent,NodeSystemInfo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withArchitecture(instance.getArchitecture()); 
            fluent.withBootID(instance.getBootID()); 
            fluent.withContainerRuntimeVersion(instance.getContainerRuntimeVersion()); 
            fluent.withKernelVersion(instance.getKernelVersion()); 
            fluent.withKubeProxyVersion(instance.getKubeProxyVersion()); 
            fluent.withKubeletVersion(instance.getKubeletVersion()); 
            fluent.withMachineID(instance.getMachineID()); 
            fluent.withOperatingSystem(instance.getOperatingSystem()); 
            fluent.withOsImage(instance.getOsImage()); 
            fluent.withSystemUUID(instance.getSystemUUID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeSystemInfoBuilder(NodeSystemInfo instance,Validator validator){
            this.fluent = this; 
            this.withArchitecture(instance.getArchitecture()); 
            this.withBootID(instance.getBootID()); 
            this.withContainerRuntimeVersion(instance.getContainerRuntimeVersion()); 
            this.withKernelVersion(instance.getKernelVersion()); 
            this.withKubeProxyVersion(instance.getKubeProxyVersion()); 
            this.withKubeletVersion(instance.getKubeletVersion()); 
            this.withMachineID(instance.getMachineID()); 
            this.withOperatingSystem(instance.getOperatingSystem()); 
            this.withOsImage(instance.getOsImage()); 
            this.withSystemUUID(instance.getSystemUUID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeSystemInfo build(){
            NodeSystemInfo buildable = new NodeSystemInfo(fluent.getArchitecture(),fluent.getBootID(),fluent.getContainerRuntimeVersion(),fluent.getKernelVersion(),fluent.getKubeProxyVersion(),fluent.getKubeletVersion(),fluent.getMachineID(),fluent.getOperatingSystem(),fluent.getOsImage(),fluent.getSystemUUID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSystemInfoBuilder that = (NodeSystemInfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
