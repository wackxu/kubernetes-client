package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScaleSpecBuilder extends ScaleSpecFluentImpl<ScaleSpecBuilder> implements VisitableBuilder<ScaleSpec,ScaleSpecBuilder>{

    ScaleSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScaleSpecBuilder(){
            this(true);
    }
    public ScaleSpecBuilder(Boolean validationEnabled){
            this(new ScaleSpec(), validationEnabled);
    }
    public ScaleSpecBuilder(ScaleSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ScaleSpecBuilder(ScaleSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScaleSpec(), validationEnabled);
    }
    public ScaleSpecBuilder(ScaleSpecFluent<?> fluent,ScaleSpec instance){
            this(fluent, instance, true);
    }
    public ScaleSpecBuilder(ScaleSpecFluent<?> fluent,ScaleSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withReplicas(instance.getReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScaleSpecBuilder(ScaleSpec instance){
            this(instance,true);
    }
    public ScaleSpecBuilder(ScaleSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withReplicas(instance.getReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScaleSpecBuilder(Validator validator){
            this(new ScaleSpec(), true);
    }
    public ScaleSpecBuilder(ScaleSpecFluent<?> fluent,ScaleSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withReplicas(instance.getReplicas()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ScaleSpecBuilder(ScaleSpec instance,Validator validator){
            this.fluent = this; 
            this.withReplicas(instance.getReplicas()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ScaleSpec build(){
            ScaleSpec buildable = new ScaleSpec(fluent.getReplicas());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleSpecBuilder that = (ScaleSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
