package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeSelectorTermBuilder extends NodeSelectorTermFluentImpl<NodeSelectorTermBuilder> implements VisitableBuilder<NodeSelectorTerm,NodeSelectorTermBuilder>{

    NodeSelectorTermFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeSelectorTermBuilder(){
            this(true);
    }
    public NodeSelectorTermBuilder(Boolean validationEnabled){
            this(new NodeSelectorTerm(), validationEnabled);
    }
    public NodeSelectorTermBuilder(NodeSelectorTermFluent<?> fluent){
            this(fluent, true);
    }
    public NodeSelectorTermBuilder(NodeSelectorTermFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeSelectorTerm(), validationEnabled);
    }
    public NodeSelectorTermBuilder(NodeSelectorTermFluent<?> fluent,NodeSelectorTerm instance){
            this(fluent, instance, true);
    }
    public NodeSelectorTermBuilder(NodeSelectorTermFluent<?> fluent,NodeSelectorTerm instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMatchExpressions(instance.getMatchExpressions()); 
            fluent.withMatchFields(instance.getMatchFields()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSelectorTermBuilder(NodeSelectorTerm instance){
            this(instance,true);
    }
    public NodeSelectorTermBuilder(NodeSelectorTerm instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.withMatchFields(instance.getMatchFields()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSelectorTermBuilder(Validator validator){
            this(new NodeSelectorTerm(), true);
    }
    public NodeSelectorTermBuilder(NodeSelectorTermFluent<?> fluent,NodeSelectorTerm instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMatchExpressions(instance.getMatchExpressions()); 
            fluent.withMatchFields(instance.getMatchFields()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeSelectorTermBuilder(NodeSelectorTerm instance,Validator validator){
            this.fluent = this; 
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.withMatchFields(instance.getMatchFields()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeSelectorTerm build(){
            NodeSelectorTerm buildable = new NodeSelectorTerm(fluent.getMatchExpressions(),fluent.getMatchFields());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSelectorTermBuilder that = (NodeSelectorTermBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
