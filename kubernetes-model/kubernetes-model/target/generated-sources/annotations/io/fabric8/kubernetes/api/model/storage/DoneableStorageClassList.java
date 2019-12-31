package io.fabric8.kubernetes.api.model.storage;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStorageClassList extends StorageClassListFluentImpl<DoneableStorageClassList> implements Doneable<StorageClassList>{

    private final StorageClassListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StorageClassList,StorageClassList> function;

    public DoneableStorageClassList(io.fabric8.kubernetes.api.builder.Function<StorageClassList,StorageClassList> function){
            super();this.builder=new StorageClassListBuilder(this);this.function=function;
    }
    public DoneableStorageClassList(StorageClassList item,io.fabric8.kubernetes.api.builder.Function<StorageClassList,StorageClassList> function){
            super(item);this.builder=new StorageClassListBuilder(this, item);this.function=function;
    }
    public DoneableStorageClassList(StorageClassList item){
            super(item);this.builder=new StorageClassListBuilder(this, item);this.function=new Function<StorageClassList, StorageClassList>() {
    public StorageClassList apply(StorageClassList item) {
        return item;
    }
}
;
    }

    public StorageClassList done(){
             return function.apply(builder.build());
    }




}
