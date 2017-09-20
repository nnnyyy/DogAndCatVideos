/**
 * Created by nnnyy on 2017-09-19.
 */
var admin = require('firebase-admin');
var serviceAccount = require("../path/to/serviceAccountKey.json");

admin.initializeApp({
    credential: admin.credential.cert(serviceAccount),
    databaseURL: "https://nocashapps.firebaseio.com"
});

var db = admin.database();
var ref = db.ref("server/saving-data/fireblog")
var usersRef = ref.child("users");
usersRef.set({
    mymy1: {
       name: "wang"
    },
    mymy2: {
        name: "kim"
    }
});
