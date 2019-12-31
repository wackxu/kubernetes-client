package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TopologySelectorTermBuilder extends TopologySelectorTermFluentImpl<TopologySelectorTermBuilder> implements VisitableBuilder<TopologySelectorTerm,TopologySelectorTermBuilder>{

    TopologySelectorTermFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TopologySelectorTermBuilder(){
            this(true);
    }
    public TopologySelectorTermBuilder(Boolean validationEnabled){
            this(new TopologySelectorTerm(), validationEnabled);
    }
    public TopologySelectorTermBuilder(TopologySelectorTermFluent<?> fluent){
            this(fluent, true);
    }
    public TopologySelectorTermBuilder(TopologySelectorTermFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TopologySelectorTerm(), validationEnabled);
    }
    public TopologySelectorTermBuilder(TopologySelectorTermFluent<?> fluent,TopologySelectorTerm instance){
            this(fluent, instance, true);
    }
    public TopologySelectorTermBuilder(TopologySelectorTermFluent<?> fluent,TopologySelectorTerm instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMatchLabelExpressions(instance.getMatchLabelExpressions()); 
            this.validationEnabled = validationEnabled; 
    }
    public TopologySelectorTermBuilder(TopologySelectorTerm instance){
            this(instance,true);
    }
    public TopologySelectorTermBuilder(TopologySelectorTerm instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMatchLabelExpressions(instance.getMatchLabelExpressions()); 
            this.validationEnabled = validationEnabled; 
    }
    public TopologySelectorTermBuilder(Validator validator){
            this(new TopologySelectorTerm(), true);
    }
    public TopologySelectorTermBuilder(TopologySelectorTermFluent<?> fluent,TopologySelectorTerm instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMatchLabelExpressions(instance.getMatchLabelExpressions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TopologySelectorTermBuilder(TopologySelectorTerm instance,Validator validator){
            this.fluent = this; 
            this.withMatchLabelExpressions(instance.getMatchLabelExpressions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TopologySelectorTerm build(){
            TopologySelectorTerm buildable = new TopologySelectorTerm(fluent.getMatchLabelExpressions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TopologySelectorTermBuilder that = (TopologySelectorTermBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
