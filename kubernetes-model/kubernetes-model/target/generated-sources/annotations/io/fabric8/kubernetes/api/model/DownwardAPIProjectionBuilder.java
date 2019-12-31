package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DownwardAPIProjectionBuilder extends DownwardAPIProjectionFluentImpl<DownwardAPIProjectionBuilder> implements VisitableBuilder<DownwardAPIProjection,DownwardAPIProjectionBuilder>{

    DownwardAPIProjectionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DownwardAPIProjectionBuilder(){
            this(true);
    }
    public DownwardAPIProjectionBuilder(Boolean validationEnabled){
            this(new DownwardAPIProjection(), validationEnabled);
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjectionFluent<?> fluent){
            this(fluent, true);
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjectionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DownwardAPIProjection(), validationEnabled);
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjectionFluent<?> fluent,DownwardAPIProjection instance){
            this(fluent, instance, true);
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjectionFluent<?> fluent,DownwardAPIProjection instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withItems(instance.getItems()); 
            this.validationEnabled = validationEnabled; 
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjection instance){
            this(instance,true);
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjection instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withItems(instance.getItems()); 
            this.validationEnabled = validationEnabled; 
    }
    public DownwardAPIProjectionBuilder(Validator validator){
            this(new DownwardAPIProjection(), true);
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjectionFluent<?> fluent,DownwardAPIProjection instance,Validator validator){
            this.fluent = fluent; 
            fluent.withItems(instance.getItems()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DownwardAPIProjectionBuilder(DownwardAPIProjection instance,Validator validator){
            this.fluent = this; 
            this.withItems(instance.getItems()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DownwardAPIProjection build(){
            DownwardAPIProjection buildable = new DownwardAPIProjection(fluent.getItems());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DownwardAPIProjectionBuilder that = (DownwardAPIProjectionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
