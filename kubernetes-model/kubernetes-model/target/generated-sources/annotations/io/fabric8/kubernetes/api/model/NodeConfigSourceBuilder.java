package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeConfigSourceBuilder extends NodeConfigSourceFluentImpl<NodeConfigSourceBuilder> implements VisitableBuilder<NodeConfigSource,NodeConfigSourceBuilder>{

    NodeConfigSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeConfigSourceBuilder(){
            this(true);
    }
    public NodeConfigSourceBuilder(Boolean validationEnabled){
            this(new NodeConfigSource(), validationEnabled);
    }
    public NodeConfigSourceBuilder(NodeConfigSourceFluent<?> fluent){
            this(fluent, true);
    }
    public NodeConfigSourceBuilder(NodeConfigSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeConfigSource(), validationEnabled);
    }
    public NodeConfigSourceBuilder(NodeConfigSourceFluent<?> fluent,NodeConfigSource instance){
            this(fluent, instance, true);
    }
    public NodeConfigSourceBuilder(NodeConfigSourceFluent<?> fluent,NodeConfigSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfigMap(instance.getConfigMap()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeConfigSourceBuilder(NodeConfigSource instance){
            this(instance,true);
    }
    public NodeConfigSourceBuilder(NodeConfigSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfigMap(instance.getConfigMap()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeConfigSourceBuilder(Validator validator){
            this(new NodeConfigSource(), true);
    }
    public NodeConfigSourceBuilder(NodeConfigSourceFluent<?> fluent,NodeConfigSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfigMap(instance.getConfigMap()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeConfigSourceBuilder(NodeConfigSource instance,Validator validator){
            this.fluent = this; 
            this.withConfigMap(instance.getConfigMap()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeConfigSource build(){
            NodeConfigSource buildable = new NodeConfigSource(fluent.getConfigMap());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeConfigSourceBuilder that = (NodeConfigSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
