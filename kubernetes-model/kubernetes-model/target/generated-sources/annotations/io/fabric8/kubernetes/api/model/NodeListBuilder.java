package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeListBuilder extends NodeListFluentImpl<NodeListBuilder> implements VisitableBuilder<NodeList,NodeListBuilder>{

    NodeListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeListBuilder(){
            this(true);
    }
    public NodeListBuilder(Boolean validationEnabled){
            this(new NodeList(), validationEnabled);
    }
    public NodeListBuilder(NodeListFluent<?> fluent){
            this(fluent, true);
    }
    public NodeListBuilder(NodeListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeList(), validationEnabled);
    }
    public NodeListBuilder(NodeListFluent<?> fluent,NodeList instance){
            this(fluent, instance, true);
    }
    public NodeListBuilder(NodeListFluent<?> fluent,NodeList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeListBuilder(NodeList instance){
            this(instance,true);
    }
    public NodeListBuilder(NodeList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeListBuilder(Validator validator){
            this(new NodeList(), true);
    }
    public NodeListBuilder(NodeListFluent<?> fluent,NodeList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeListBuilder(NodeList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeList build(){
            NodeList buildable = new NodeList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeListBuilder that = (NodeListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
