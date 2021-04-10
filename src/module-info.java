module MyContacts {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires java.xml;

    opens com.krallnyx.contacts;
    opens com.krallnyx.contacts.datamodel;
}