package intermidiate.classandobj;

/*
  Code Challenge - Creating Classes and Objects

  Create a program to show loading message to your application users.
  Define a class Loading which has one public method called LoadingMessage(), which should print "Loading" when called.
  Create an object named loading and call that method.

  Don't forget to use new keyword while creating an object.
 */

public class CreateClassAndObject {
  public static void main(String[] args) {
    // create a Loading object with the same name
    Loading loading = new Loading();
    loading.loadingMessage();
  }
}
class Loading {
  // complete the class, and LoadingMessage() method
  public static void loadingMessage(){
    System.out.println("Loading");
  }
}
