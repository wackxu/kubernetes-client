package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildRequestBuilder extends BuildRequestFluentImpl<BuildRequestBuilder> implements VisitableBuilder<BuildRequest,BuildRequestBuilder>{

    BuildRequestFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildRequestBuilder(){
            this(true);
    }
    public BuildRequestBuilder(Boolean validationEnabled){
            this(new BuildRequest(), validationEnabled);
    }
    public BuildRequestBuilder(BuildRequestFluent<?> fluent){
            this(fluent, true);
    }
    public BuildRequestBuilder(BuildRequestFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildRequest(), validationEnabled);
    }
    public BuildRequestBuilder(BuildRequestFluent<?> fluent,BuildRequest instance){
            this(fluent, instance, true);
    }
    public BuildRequestBuilder(BuildRequestFluent<?> fluent,BuildRequest instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withBinary(instance.getBinary()); 
            fluent.withDockerStrategyOptions(instance.getDockerStrategyOptions()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLastVersion(instance.getLastVersion()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSourceStrategyOptions(instance.getSourceStrategyOptions()); 
            fluent.withTriggeredBy(instance.getTriggeredBy()); 
            fluent.withTriggeredByImage(instance.getTriggeredByImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildRequestBuilder(BuildRequest instance){
            this(instance,true);
    }
    public BuildRequestBuilder(BuildRequest instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withBinary(instance.getBinary()); 
            this.withDockerStrategyOptions(instance.getDockerStrategyOptions()); 
            this.withEnv(instance.getEnv()); 
            this.withFrom(instance.getFrom()); 
            this.withKind(instance.getKind()); 
            this.withLastVersion(instance.getLastVersion()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRevision(instance.getRevision()); 
            this.withSourceStrategyOptions(instance.getSourceStrategyOptions()); 
            this.withTriggeredBy(instance.getTriggeredBy()); 
            this.withTriggeredByImage(instance.getTriggeredByImage()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildRequestBuilder(Validator validator){
            this(new BuildRequest(), true);
    }
    public BuildRequestBuilder(BuildRequestFluent<?> fluent,BuildRequest instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withBinary(instance.getBinary()); 
            fluent.withDockerStrategyOptions(instance.getDockerStrategyOptions()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLastVersion(instance.getLastVersion()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSourceStrategyOptions(instance.getSourceStrategyOptions()); 
            fluent.withTriggeredBy(instance.getTriggeredBy()); 
            fluent.withTriggeredByImage(instance.getTriggeredByImage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildRequestBuilder(BuildRequest instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withBinary(instance.getBinary()); 
            this.withDockerStrategyOptions(instance.getDockerStrategyOptions()); 
            this.withEnv(instance.getEnv()); 
            this.withFrom(instance.getFrom()); 
            this.withKind(instance.getKind()); 
            this.withLastVersion(instance.getLastVersion()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRevision(instance.getRevision()); 
            this.withSourceStrategyOptions(instance.getSourceStrategyOptions()); 
            this.withTriggeredBy(instance.getTriggeredBy()); 
            this.withTriggeredByImage(instance.getTriggeredByImage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildRequest build(){
            BuildRequest buildable = new BuildRequest(fluent.getApiVersion(),fluent.getBinary(),fluent.getDockerStrategyOptions(),fluent.getEnv(),fluent.getFrom(),fluent.getKind(),fluent.getLastVersion(),fluent.getMetadata(),fluent.getRevision(),fluent.getSourceStrategyOptions(),fluent.getTriggeredBy(),fluent.getTriggeredByImage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildRequestBuilder that = (BuildRequestBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
