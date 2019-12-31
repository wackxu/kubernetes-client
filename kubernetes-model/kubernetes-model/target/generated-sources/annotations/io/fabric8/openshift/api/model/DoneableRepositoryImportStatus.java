package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRepositoryImportStatus extends RepositoryImportStatusFluentImpl<DoneableRepositoryImportStatus> implements Doneable<RepositoryImportStatus>{

    private final RepositoryImportStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RepositoryImportStatus,RepositoryImportStatus> function;

    public DoneableRepositoryImportStatus(io.fabric8.kubernetes.api.builder.Function<RepositoryImportStatus,RepositoryImportStatus> function){
            super();this.builder=new RepositoryImportStatusBuilder(this);this.function=function;
    }
    public DoneableRepositoryImportStatus(RepositoryImportStatus item,io.fabric8.kubernetes.api.builder.Function<RepositoryImportStatus,RepositoryImportStatus> function){
            super(item);this.builder=new RepositoryImportStatusBuilder(this, item);this.function=function;
    }
    public DoneableRepositoryImportStatus(RepositoryImportStatus item){
            super(item);this.builder=new RepositoryImportStatusBuilder(this, item);this.function=new Function<RepositoryImportStatus, RepositoryImportStatus>() {
    public RepositoryImportStatus apply(RepositoryImportStatus item) {
        return item;
    }
}
;
    }

    public RepositoryImportStatus done(){
             return function.apply(builder.build());
    }




}
