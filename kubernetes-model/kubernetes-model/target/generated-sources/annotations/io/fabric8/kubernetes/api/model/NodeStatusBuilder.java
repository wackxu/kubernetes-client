package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeStatusBuilder extends NodeStatusFluentImpl<NodeStatusBuilder> implements VisitableBuilder<NodeStatus,NodeStatusBuilder>{

    NodeStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeStatusBuilder(){
            this(true);
    }
    public NodeStatusBuilder(Boolean validationEnabled){
            this(new NodeStatus(), validationEnabled);
    }
    public NodeStatusBuilder(NodeStatusFluent<?> fluent){
            this(fluent, true);
    }
    public NodeStatusBuilder(NodeStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeStatus(), validationEnabled);
    }
    public NodeStatusBuilder(NodeStatusFluent<?> fluent,NodeStatus instance){
            this(fluent, instance, true);
    }
    public NodeStatusBuilder(NodeStatusFluent<?> fluent,NodeStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAddresses(instance.getAddresses()); 
            fluent.withAllocatable(instance.getAllocatable()); 
            fluent.withCapacity(instance.getCapacity()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withConfig(instance.getConfig()); 
            fluent.withDaemonEndpoints(instance.getDaemonEndpoints()); 
            fluent.withImages(instance.getImages()); 
            fluent.withNodeInfo(instance.getNodeInfo()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withVolumesAttached(instance.getVolumesAttached()); 
            fluent.withVolumesInUse(instance.getVolumesInUse()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeStatusBuilder(NodeStatus instance){
            this(instance,true);
    }
    public NodeStatusBuilder(NodeStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAddresses(instance.getAddresses()); 
            this.withAllocatable(instance.getAllocatable()); 
            this.withCapacity(instance.getCapacity()); 
            this.withConditions(instance.getConditions()); 
            this.withConfig(instance.getConfig()); 
            this.withDaemonEndpoints(instance.getDaemonEndpoints()); 
            this.withImages(instance.getImages()); 
            this.withNodeInfo(instance.getNodeInfo()); 
            this.withPhase(instance.getPhase()); 
            this.withVolumesAttached(instance.getVolumesAttached()); 
            this.withVolumesInUse(instance.getVolumesInUse()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeStatusBuilder(Validator validator){
            this(new NodeStatus(), true);
    }
    public NodeStatusBuilder(NodeStatusFluent<?> fluent,NodeStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAddresses(instance.getAddresses()); 
            fluent.withAllocatable(instance.getAllocatable()); 
            fluent.withCapacity(instance.getCapacity()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withConfig(instance.getConfig()); 
            fluent.withDaemonEndpoints(instance.getDaemonEndpoints()); 
            fluent.withImages(instance.getImages()); 
            fluent.withNodeInfo(instance.getNodeInfo()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withVolumesAttached(instance.getVolumesAttached()); 
            fluent.withVolumesInUse(instance.getVolumesInUse()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeStatusBuilder(NodeStatus instance,Validator validator){
            this.fluent = this; 
            this.withAddresses(instance.getAddresses()); 
            this.withAllocatable(instance.getAllocatable()); 
            this.withCapacity(instance.getCapacity()); 
            this.withConditions(instance.getConditions()); 
            this.withConfig(instance.getConfig()); 
            this.withDaemonEndpoints(instance.getDaemonEndpoints()); 
            this.withImages(instance.getImages()); 
            this.withNodeInfo(instance.getNodeInfo()); 
            this.withPhase(instance.getPhase()); 
            this.withVolumesAttached(instance.getVolumesAttached()); 
            this.withVolumesInUse(instance.getVolumesInUse()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeStatus build(){
            NodeStatus buildable = new NodeStatus(fluent.getAddresses(),fluent.getAllocatable(),fluent.getCapacity(),fluent.getConditions(),fluent.getConfig(),fluent.getDaemonEndpoints(),fluent.getImages(),fluent.getNodeInfo(),fluent.getPhase(),fluent.getVolumesAttached(),fluent.getVolumesInUse());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeStatusBuilder that = (NodeStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
