package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RouteTargetReferenceBuilder extends RouteTargetReferenceFluentImpl<RouteTargetReferenceBuilder> implements VisitableBuilder<RouteTargetReference,RouteTargetReferenceBuilder>{

    RouteTargetReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RouteTargetReferenceBuilder(){
            this(true);
    }
    public RouteTargetReferenceBuilder(Boolean validationEnabled){
            this(new RouteTargetReference(), validationEnabled);
    }
    public RouteTargetReferenceBuilder(RouteTargetReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public RouteTargetReferenceBuilder(RouteTargetReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RouteTargetReference(), validationEnabled);
    }
    public RouteTargetReferenceBuilder(RouteTargetReferenceFluent<?> fluent,RouteTargetReference instance){
            this(fluent, instance, true);
    }
    public RouteTargetReferenceBuilder(RouteTargetReferenceFluent<?> fluent,RouteTargetReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withWeight(instance.getWeight()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteTargetReferenceBuilder(RouteTargetReference instance){
            this(instance,true);
    }
    public RouteTargetReferenceBuilder(RouteTargetReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withWeight(instance.getWeight()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteTargetReferenceBuilder(Validator validator){
            this(new RouteTargetReference(), true);
    }
    public RouteTargetReferenceBuilder(RouteTargetReferenceFluent<?> fluent,RouteTargetReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withWeight(instance.getWeight()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RouteTargetReferenceBuilder(RouteTargetReference instance,Validator validator){
            this.fluent = this; 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withWeight(instance.getWeight()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RouteTargetReference build(){
            RouteTargetReference buildable = new RouteTargetReference(fluent.getKind(),fluent.getName(),fluent.getWeight());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteTargetReferenceBuilder that = (RouteTargetReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
