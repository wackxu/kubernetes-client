package io.fabric8.kubernetes.api.model.version;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class InfoBuilder extends InfoFluentImpl<InfoBuilder> implements VisitableBuilder<Info,InfoBuilder>{

    InfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public InfoBuilder(){
            this(true);
    }
    public InfoBuilder(Boolean validationEnabled){
            this(new Info(), validationEnabled);
    }
    public InfoBuilder(InfoFluent<?> fluent){
            this(fluent, true);
    }
    public InfoBuilder(InfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Info(), validationEnabled);
    }
    public InfoBuilder(InfoFluent<?> fluent,Info instance){
            this(fluent, instance, true);
    }
    public InfoBuilder(InfoFluent<?> fluent,Info instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBuildDate(instance.getBuildDate()); 
            fluent.withCompiler(instance.getCompiler()); 
            fluent.withGitCommit(instance.getGitCommit()); 
            fluent.withGitTreeState(instance.getGitTreeState()); 
            fluent.withGitVersion(instance.getGitVersion()); 
            fluent.withGoVersion(instance.getGoVersion()); 
            fluent.withMajor(instance.getMajor()); 
            fluent.withMinor(instance.getMinor()); 
            fluent.withPlatform(instance.getPlatform()); 
            this.validationEnabled = validationEnabled; 
    }
    public InfoBuilder(Info instance){
            this(instance,true);
    }
    public InfoBuilder(Info instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBuildDate(instance.getBuildDate()); 
            this.withCompiler(instance.getCompiler()); 
            this.withGitCommit(instance.getGitCommit()); 
            this.withGitTreeState(instance.getGitTreeState()); 
            this.withGitVersion(instance.getGitVersion()); 
            this.withGoVersion(instance.getGoVersion()); 
            this.withMajor(instance.getMajor()); 
            this.withMinor(instance.getMinor()); 
            this.withPlatform(instance.getPlatform()); 
            this.validationEnabled = validationEnabled; 
    }
    public InfoBuilder(Validator validator){
            this(new Info(), true);
    }
    public InfoBuilder(InfoFluent<?> fluent,Info instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBuildDate(instance.getBuildDate()); 
            fluent.withCompiler(instance.getCompiler()); 
            fluent.withGitCommit(instance.getGitCommit()); 
            fluent.withGitTreeState(instance.getGitTreeState()); 
            fluent.withGitVersion(instance.getGitVersion()); 
            fluent.withGoVersion(instance.getGoVersion()); 
            fluent.withMajor(instance.getMajor()); 
            fluent.withMinor(instance.getMinor()); 
            fluent.withPlatform(instance.getPlatform()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public InfoBuilder(Info instance,Validator validator){
            this.fluent = this; 
            this.withBuildDate(instance.getBuildDate()); 
            this.withCompiler(instance.getCompiler()); 
            this.withGitCommit(instance.getGitCommit()); 
            this.withGitTreeState(instance.getGitTreeState()); 
            this.withGitVersion(instance.getGitVersion()); 
            this.withGoVersion(instance.getGoVersion()); 
            this.withMajor(instance.getMajor()); 
            this.withMinor(instance.getMinor()); 
            this.withPlatform(instance.getPlatform()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Info build(){
            Info buildable = new Info(fluent.getBuildDate(),fluent.getCompiler(),fluent.getGitCommit(),fluent.getGitTreeState(),fluent.getGitVersion(),fluent.getGoVersion(),fluent.getMajor(),fluent.getMinor(),fluent.getPlatform());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            InfoBuilder that = (InfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
