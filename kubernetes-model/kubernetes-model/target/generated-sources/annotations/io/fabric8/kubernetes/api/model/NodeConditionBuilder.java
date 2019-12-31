package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeConditionBuilder extends NodeConditionFluentImpl<NodeConditionBuilder> implements VisitableBuilder<NodeCondition,NodeConditionBuilder>{

    NodeConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeConditionBuilder(){
            this(true);
    }
    public NodeConditionBuilder(Boolean validationEnabled){
            this(new NodeCondition(), validationEnabled);
    }
    public NodeConditionBuilder(NodeConditionFluent<?> fluent){
            this(fluent, true);
    }
    public NodeConditionBuilder(NodeConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeCondition(), validationEnabled);
    }
    public NodeConditionBuilder(NodeConditionFluent<?> fluent,NodeCondition instance){
            this(fluent, instance, true);
    }
    public NodeConditionBuilder(NodeConditionFluent<?> fluent,NodeCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastHeartbeatTime(instance.getLastHeartbeatTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeConditionBuilder(NodeCondition instance){
            this(instance,true);
    }
    public NodeConditionBuilder(NodeCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastHeartbeatTime(instance.getLastHeartbeatTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeConditionBuilder(Validator validator){
            this(new NodeCondition(), true);
    }
    public NodeConditionBuilder(NodeConditionFluent<?> fluent,NodeCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastHeartbeatTime(instance.getLastHeartbeatTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeConditionBuilder(NodeCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastHeartbeatTime(instance.getLastHeartbeatTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeCondition build(){
            NodeCondition buildable = new NodeCondition(fluent.getLastHeartbeatTime(),fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeConditionBuilder that = (NodeConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
