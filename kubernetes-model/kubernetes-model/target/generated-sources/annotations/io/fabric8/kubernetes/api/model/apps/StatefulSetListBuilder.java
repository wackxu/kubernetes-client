package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatefulSetListBuilder extends StatefulSetListFluentImpl<StatefulSetListBuilder> implements VisitableBuilder<StatefulSetList,StatefulSetListBuilder>{

    StatefulSetListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatefulSetListBuilder(){
            this(true);
    }
    public StatefulSetListBuilder(Boolean validationEnabled){
            this(new StatefulSetList(), validationEnabled);
    }
    public StatefulSetListBuilder(StatefulSetListFluent<?> fluent){
            this(fluent, true);
    }
    public StatefulSetListBuilder(StatefulSetListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatefulSetList(), validationEnabled);
    }
    public StatefulSetListBuilder(StatefulSetListFluent<?> fluent,StatefulSetList instance){
            this(fluent, instance, true);
    }
    public StatefulSetListBuilder(StatefulSetListFluent<?> fluent,StatefulSetList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetListBuilder(StatefulSetList instance){
            this(instance,true);
    }
    public StatefulSetListBuilder(StatefulSetList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetListBuilder(Validator validator){
            this(new StatefulSetList(), true);
    }
    public StatefulSetListBuilder(StatefulSetListFluent<?> fluent,StatefulSetList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatefulSetListBuilder(StatefulSetList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatefulSetList build(){
            StatefulSetList buildable = new StatefulSetList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetListBuilder that = (StatefulSetListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
