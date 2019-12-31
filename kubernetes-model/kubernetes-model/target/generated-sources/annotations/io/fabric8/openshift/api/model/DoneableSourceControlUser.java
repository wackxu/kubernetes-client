package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSourceControlUser extends SourceControlUserFluentImpl<DoneableSourceControlUser> implements Doneable<SourceControlUser>{

    private final SourceControlUserBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SourceControlUser,SourceControlUser> function;

    public DoneableSourceControlUser(io.fabric8.kubernetes.api.builder.Function<SourceControlUser,SourceControlUser> function){
            super();this.builder=new SourceControlUserBuilder(this);this.function=function;
    }
    public DoneableSourceControlUser(SourceControlUser item,io.fabric8.kubernetes.api.builder.Function<SourceControlUser,SourceControlUser> function){
            super(item);this.builder=new SourceControlUserBuilder(this, item);this.function=function;
    }
    public DoneableSourceControlUser(SourceControlUser item){
            super(item);this.builder=new SourceControlUserBuilder(this, item);this.function=new Function<SourceControlUser, SourceControlUser>() {
    public SourceControlUser apply(SourceControlUser item) {
        return item;
    }
}
;
    }

    public SourceControlUser done(){
             return function.apply(builder.build());
    }




}
