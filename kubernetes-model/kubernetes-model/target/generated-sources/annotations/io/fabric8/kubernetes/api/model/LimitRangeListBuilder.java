package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LimitRangeListBuilder extends LimitRangeListFluentImpl<LimitRangeListBuilder> implements VisitableBuilder<LimitRangeList,LimitRangeListBuilder>{

    LimitRangeListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LimitRangeListBuilder(){
            this(true);
    }
    public LimitRangeListBuilder(Boolean validationEnabled){
            this(new LimitRangeList(), validationEnabled);
    }
    public LimitRangeListBuilder(LimitRangeListFluent<?> fluent){
            this(fluent, true);
    }
    public LimitRangeListBuilder(LimitRangeListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LimitRangeList(), validationEnabled);
    }
    public LimitRangeListBuilder(LimitRangeListFluent<?> fluent,LimitRangeList instance){
            this(fluent, instance, true);
    }
    public LimitRangeListBuilder(LimitRangeListFluent<?> fluent,LimitRangeList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeListBuilder(LimitRangeList instance){
            this(instance,true);
    }
    public LimitRangeListBuilder(LimitRangeList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeListBuilder(Validator validator){
            this(new LimitRangeList(), true);
    }
    public LimitRangeListBuilder(LimitRangeListFluent<?> fluent,LimitRangeList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LimitRangeListBuilder(LimitRangeList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LimitRangeList build(){
            LimitRangeList buildable = new LimitRangeList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeListBuilder that = (LimitRangeListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
