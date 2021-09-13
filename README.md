Library Application

Στην εφαρμογή αυτή χρησιμοποιήθηκαν τα εξής:
Java 8
Apache Maven 3.8.2
Vert.x 4.1.3
Mysql 14.14
Mysql connector 8.0.26

Τα dependencies αναφέρονται στο αρχείο pom.xml .

Προτιμήθηκε αντι της MariaDB, η MySql, της οποίας η πρώτη αποτελεί fork, καθώς υπήρχε ήδη στο σύστημα. 
Η μόνη διαφορά είναι το connector java - database, του οποίου το αρχείο jar πρέπει να συμπεριληφθεί στις Libraries της εφαρμογής για να λειτουργήσει σωστά. Επίσης πριν τη έναρξη της εφαρμογής πρέπει να έχει δημιουργηθεί η LibraryDatabase και στη συνέχεια τα απαραίτητα Tables δημιουργούνται αυτόματα.

Τα στοιχεία της βάσης δεδομένων (url, driver_class, user, password) πρέπει να δηλωθούν στο αρχείο my-application-conf.json που βρίσκεται στο φάκελο src/main/conf. Στο ίδιο αρχείο δηλώνεται και το προτιμώμενο port που θα χρησιμοποιεί η εφαρμογή (στην προκειμένη περίπτωση το 8082).


Για να λειτουργήσει η εφαρμογή πρέπει αρχικά να δοθεί η εντολή “mvn compile vertx:run“ από τον κεντρικό φάκελό της, στον οποίο βρίσκεται και το αρχείο pom.xml .

Η πρόσβαση είναι δυνατή μέσω του http://localhost:8082. Αντί για το το 8082 μπορεί να χρησιμοποιηθεί οποιοδήποτε άλλο διαθέσιμο port.

Απο τα ζητούμενα δεν ολοκληρώθηκε το υλοποιήθηκε το Authentication mechanism και ο δανεισμός.
