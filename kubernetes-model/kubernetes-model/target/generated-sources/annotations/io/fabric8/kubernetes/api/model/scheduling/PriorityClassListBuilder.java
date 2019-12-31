package io.fabric8.kubernetes.api.model.scheduling;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PriorityClassListBuilder extends PriorityClassListFluentImpl<PriorityClassListBuilder> implements VisitableBuilder<PriorityClassList,PriorityClassListBuilder>{

    PriorityClassListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PriorityClassListBuilder(){
            this(true);
    }
    public PriorityClassListBuilder(Boolean validationEnabled){
            this(new PriorityClassList(), validationEnabled);
    }
    public PriorityClassListBuilder(PriorityClassListFluent<?> fluent){
            this(fluent, true);
    }
    public PriorityClassListBuilder(PriorityClassListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PriorityClassList(), validationEnabled);
    }
    public PriorityClassListBuilder(PriorityClassListFluent<?> fluent,PriorityClassList instance){
            this(fluent, instance, true);
    }
    public PriorityClassListBuilder(PriorityClassListFluent<?> fluent,PriorityClassList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PriorityClassListBuilder(PriorityClassList instance){
            this(instance,true);
    }
    public PriorityClassListBuilder(PriorityClassList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PriorityClassListBuilder(Validator validator){
            this(new PriorityClassList(), true);
    }
    public PriorityClassListBuilder(PriorityClassListFluent<?> fluent,PriorityClassList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PriorityClassListBuilder(PriorityClassList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PriorityClassList build(){
            PriorityClassList buildable = new PriorityClassList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PriorityClassListBuilder that = (PriorityClassListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
