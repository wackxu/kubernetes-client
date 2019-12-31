package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SourceStrategyOptionsBuilder extends SourceStrategyOptionsFluentImpl<SourceStrategyOptionsBuilder> implements VisitableBuilder<SourceStrategyOptions,SourceStrategyOptionsBuilder>{

    SourceStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SourceStrategyOptionsBuilder(){
            this(true);
    }
    public SourceStrategyOptionsBuilder(Boolean validationEnabled){
            this(new SourceStrategyOptions(), validationEnabled);
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SourceStrategyOptions(), validationEnabled);
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptionsFluent<?> fluent,SourceStrategyOptions instance){
            this(fluent, instance, true);
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptionsFluent<?> fluent,SourceStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withIncremental(instance.getIncremental()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptions instance){
            this(instance,true);
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withIncremental(instance.getIncremental()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceStrategyOptionsBuilder(Validator validator){
            this(new SourceStrategyOptions(), true);
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptionsFluent<?> fluent,SourceStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withIncremental(instance.getIncremental()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SourceStrategyOptionsBuilder(SourceStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withIncremental(instance.getIncremental()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SourceStrategyOptions build(){
            SourceStrategyOptions buildable = new SourceStrategyOptions(fluent.isIncremental());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceStrategyOptionsBuilder that = (SourceStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
