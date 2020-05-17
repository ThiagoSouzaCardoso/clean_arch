module org.example.usecase{
    exports org.example.usecase;
    exports org.example.usecase.exception;
    exports org.example.usecase.port;

    requires org.apache.commons.lang3;
    requires org.example.domain;
}