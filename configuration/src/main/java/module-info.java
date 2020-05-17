module org.example.configuration {
    exports org.example.config;

    requires org.example.usecase;
    requires org.example.domain;
    requires org.example.jug;
    requires org.example.db.simple;
    requires org.example.encoder.sha256;
}