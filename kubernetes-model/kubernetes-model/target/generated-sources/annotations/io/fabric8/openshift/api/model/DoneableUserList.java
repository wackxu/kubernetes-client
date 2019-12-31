package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableUserList extends UserListFluentImpl<DoneableUserList> implements Doneable<UserList>{

    private final UserListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<UserList,UserList> function;

    public DoneableUserList(io.fabric8.kubernetes.api.builder.Function<UserList,UserList> function){
            super();this.builder=new UserListBuilder(this);this.function=function;
    }
    public DoneableUserList(UserList item,io.fabric8.kubernetes.api.builder.Function<UserList,UserList> function){
            super(item);this.builder=new UserListBuilder(this, item);this.function=function;
    }
    public DoneableUserList(UserList item){
            super(item);this.builder=new UserListBuilder(this, item);this.function=new Function<UserList, UserList>() {
    public UserList apply(UserList item) {
        return item;
    }
}
;
    }

    public UserList done(){
             return function.apply(builder.build());
    }




}
