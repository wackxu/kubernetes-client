package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeSelectorBuilder extends NodeSelectorFluentImpl<NodeSelectorBuilder> implements VisitableBuilder<NodeSelector,NodeSelectorBuilder>{

    NodeSelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeSelectorBuilder(){
            this(true);
    }
    public NodeSelectorBuilder(Boolean validationEnabled){
            this(new NodeSelector(), validationEnabled);
    }
    public NodeSelectorBuilder(NodeSelectorFluent<?> fluent){
            this(fluent, true);
    }
    public NodeSelectorBuilder(NodeSelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeSelector(), validationEnabled);
    }
    public NodeSelectorBuilder(NodeSelectorFluent<?> fluent,NodeSelector instance){
            this(fluent, instance, true);
    }
    public NodeSelectorBuilder(NodeSelectorFluent<?> fluent,NodeSelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withNodeSelectorTerms(instance.getNodeSelectorTerms()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSelectorBuilder(NodeSelector instance){
            this(instance,true);
    }
    public NodeSelectorBuilder(NodeSelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withNodeSelectorTerms(instance.getNodeSelectorTerms()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSelectorBuilder(Validator validator){
            this(new NodeSelector(), true);
    }
    public NodeSelectorBuilder(NodeSelectorFluent<?> fluent,NodeSelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withNodeSelectorTerms(instance.getNodeSelectorTerms()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeSelectorBuilder(NodeSelector instance,Validator validator){
            this.fluent = this; 
            this.withNodeSelectorTerms(instance.getNodeSelectorTerms()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeSelector build(){
            NodeSelector buildable = new NodeSelector(fluent.getNodeSelectorTerms());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSelectorBuilder that = (NodeSelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
