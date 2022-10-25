public class ListIsNullException extends Exception {

    String err;

    private void addError(String error) {
        err = error;
    }

    public static ListIsNullException validate() throws ListIsNullException {

        ListIsNullException listIsNull = new ListIsNullException();
        listIsNull.addError("List is null");

        return listIsNull;
    }

    public static String listEmpty() throws ListIsNullException {
        return "List is null";
    }
}
