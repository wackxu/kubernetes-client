package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRepositoryImportSpec extends RepositoryImportSpecFluentImpl<DoneableRepositoryImportSpec> implements Doneable<RepositoryImportSpec>{

    private final RepositoryImportSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RepositoryImportSpec,RepositoryImportSpec> function;

    public DoneableRepositoryImportSpec(io.fabric8.kubernetes.api.builder.Function<RepositoryImportSpec,RepositoryImportSpec> function){
            super();this.builder=new RepositoryImportSpecBuilder(this);this.function=function;
    }
    public DoneableRepositoryImportSpec(RepositoryImportSpec item,io.fabric8.kubernetes.api.builder.Function<RepositoryImportSpec,RepositoryImportSpec> function){
            super(item);this.builder=new RepositoryImportSpecBuilder(this, item);this.function=function;
    }
    public DoneableRepositoryImportSpec(RepositoryImportSpec item){
            super(item);this.builder=new RepositoryImportSpecBuilder(this, item);this.function=new Function<RepositoryImportSpec, RepositoryImportSpec>() {
    public RepositoryImportSpec apply(RepositoryImportSpec item) {
        return item;
    }
}
;
    }

    public RepositoryImportSpec done(){
             return function.apply(builder.build());
    }




}
