package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamedTagEventListBuilder extends NamedTagEventListFluentImpl<NamedTagEventListBuilder> implements VisitableBuilder<NamedTagEventList,NamedTagEventListBuilder>{

    NamedTagEventListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamedTagEventListBuilder(){
            this(true);
    }
    public NamedTagEventListBuilder(Boolean validationEnabled){
            this(new NamedTagEventList(), validationEnabled);
    }
    public NamedTagEventListBuilder(NamedTagEventListFluent<?> fluent){
            this(fluent, true);
    }
    public NamedTagEventListBuilder(NamedTagEventListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamedTagEventList(), validationEnabled);
    }
    public NamedTagEventListBuilder(NamedTagEventListFluent<?> fluent,NamedTagEventList instance){
            this(fluent, instance, true);
    }
    public NamedTagEventListBuilder(NamedTagEventListFluent<?> fluent,NamedTagEventList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withItems(instance.getItems()); 
            fluent.withTag(instance.getTag()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedTagEventListBuilder(NamedTagEventList instance){
            this(instance,true);
    }
    public NamedTagEventListBuilder(NamedTagEventList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withItems(instance.getItems()); 
            this.withTag(instance.getTag()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedTagEventListBuilder(Validator validator){
            this(new NamedTagEventList(), true);
    }
    public NamedTagEventListBuilder(NamedTagEventListFluent<?> fluent,NamedTagEventList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withItems(instance.getItems()); 
            fluent.withTag(instance.getTag()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamedTagEventListBuilder(NamedTagEventList instance,Validator validator){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withItems(instance.getItems()); 
            this.withTag(instance.getTag()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamedTagEventList build(){
            NamedTagEventList buildable = new NamedTagEventList(fluent.getConditions(),fluent.getItems(),fluent.getTag());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedTagEventListBuilder that = (NamedTagEventListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
