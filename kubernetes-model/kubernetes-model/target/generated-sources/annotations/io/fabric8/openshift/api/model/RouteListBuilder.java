package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RouteListBuilder extends RouteListFluentImpl<RouteListBuilder> implements VisitableBuilder<RouteList,RouteListBuilder>{

    RouteListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RouteListBuilder(){
            this(true);
    }
    public RouteListBuilder(Boolean validationEnabled){
            this(new RouteList(), validationEnabled);
    }
    public RouteListBuilder(RouteListFluent<?> fluent){
            this(fluent, true);
    }
    public RouteListBuilder(RouteListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RouteList(), validationEnabled);
    }
    public RouteListBuilder(RouteListFluent<?> fluent,RouteList instance){
            this(fluent, instance, true);
    }
    public RouteListBuilder(RouteListFluent<?> fluent,RouteList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteListBuilder(RouteList instance){
            this(instance,true);
    }
    public RouteListBuilder(RouteList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteListBuilder(Validator validator){
            this(new RouteList(), true);
    }
    public RouteListBuilder(RouteListFluent<?> fluent,RouteList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RouteListBuilder(RouteList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RouteList build(){
            RouteList buildable = new RouteList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteListBuilder that = (RouteListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
