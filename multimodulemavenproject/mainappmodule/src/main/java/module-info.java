

module com.baeldung.mainappmodule {
    requires com.baeldung.entitymodule;
    requires com.baeldung.userdaomodule;
    requires com.baeldung.daomodule;
    uses com.baeldung.daomodule.Dao;
}
