package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeSpecBuilder extends NodeSpecFluentImpl<NodeSpecBuilder> implements VisitableBuilder<NodeSpec,NodeSpecBuilder>{

    NodeSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeSpecBuilder(){
            this(true);
    }
    public NodeSpecBuilder(Boolean validationEnabled){
            this(new NodeSpec(), validationEnabled);
    }
    public NodeSpecBuilder(NodeSpecFluent<?> fluent){
            this(fluent, true);
    }
    public NodeSpecBuilder(NodeSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeSpec(), validationEnabled);
    }
    public NodeSpecBuilder(NodeSpecFluent<?> fluent,NodeSpec instance){
            this(fluent, instance, true);
    }
    public NodeSpecBuilder(NodeSpecFluent<?> fluent,NodeSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfigSource(instance.getConfigSource()); 
            fluent.withExternalID(instance.getExternalID()); 
            fluent.withPodCIDR(instance.getPodCIDR()); 
            fluent.withProviderID(instance.getProviderID()); 
            fluent.withTaints(instance.getTaints()); 
            fluent.withUnschedulable(instance.getUnschedulable()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSpecBuilder(NodeSpec instance){
            this(instance,true);
    }
    public NodeSpecBuilder(NodeSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfigSource(instance.getConfigSource()); 
            this.withExternalID(instance.getExternalID()); 
            this.withPodCIDR(instance.getPodCIDR()); 
            this.withProviderID(instance.getProviderID()); 
            this.withTaints(instance.getTaints()); 
            this.withUnschedulable(instance.getUnschedulable()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSpecBuilder(Validator validator){
            this(new NodeSpec(), true);
    }
    public NodeSpecBuilder(NodeSpecFluent<?> fluent,NodeSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfigSource(instance.getConfigSource()); 
            fluent.withExternalID(instance.getExternalID()); 
            fluent.withPodCIDR(instance.getPodCIDR()); 
            fluent.withProviderID(instance.getProviderID()); 
            fluent.withTaints(instance.getTaints()); 
            fluent.withUnschedulable(instance.getUnschedulable()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeSpecBuilder(NodeSpec instance,Validator validator){
            this.fluent = this; 
            this.withConfigSource(instance.getConfigSource()); 
            this.withExternalID(instance.getExternalID()); 
            this.withPodCIDR(instance.getPodCIDR()); 
            this.withProviderID(instance.getProviderID()); 
            this.withTaints(instance.getTaints()); 
            this.withUnschedulable(instance.getUnschedulable()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeSpec build(){
            NodeSpec buildable = new NodeSpec(fluent.getConfigSource(),fluent.getExternalID(),fluent.getPodCIDR(),fluent.getProviderID(),fluent.getTaints(),fluent.isUnschedulable());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSpecBuilder that = (NodeSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
