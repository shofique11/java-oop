public interface Library {
    //Example of interface
    void openLibrary();
    void closeLibrary();
}
class CampusLibrary implements Library
{
    @Override
    public void openLibrary() {
        System.out.println("Campus library is opened at 9.00 am");
    }

    @Override
    public void closeLibrary() {
        System.out.println("Campus library is closed at 5.00 pm");
    }
}
