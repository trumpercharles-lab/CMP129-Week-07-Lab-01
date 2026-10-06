public class Library {
    private Member[] registeredMembers={new Member("No Name", 0),new Member("No Name", 0),new Member("No Name", 0),new Member("No Name", 0),new Member("No Name", 0)};
    private Book[] library={new Book("No Name", "No Name", "1234abcd", 0),new Book("No Name", "No Name", "1234abcd", 0),new Book("No Name", "No Name", "1234abcd", 0),new Book("No Name", "No Name", "1234abcd", 0),new Book("No Name", "No Name", "1234abcd", 0)};
    //private Book[] burrowedBooks={};

    //Getter Methods
    public Member getMember(int ID){
        Member targetMember=registeredMembers[0];

        for(int c=1;c<=registeredMembers.length;c++){
            if(registeredMembers[c-1].getID()==ID){
                targetMember=registeredMembers[c-1];
            }
        }

        return targetMember;
    }

    public Book getBook(String title){
        Book targetBook=library[0];

        for(int c=1;c<=library.length;c++){
            if(library[c-1].getTitle()==title){
                targetBook = library[c-1];
            }
        }

        return targetBook;
    }

    //Removal Methods
    public void removeMember(int ID){
        for(int c=1;c<=registeredMembers.length;c++){
            if(registeredMembers[c-1].getID()==ID){
                registeredMembers[c-1]=new Member("No Name", 0);
            }
        }
    }

    public void removeBook(String title){
        for(int c=1;c<=library.length;c++){
            if(library[c-1].getTitle()==title){
                library[c-1]=new Book("No Name", "No Name", "1234abcd", 0);
            }
        }
    }

    //Add Methods
    public void registerMember(String name, int ID){
        boolean slotFound=false;

        for(int c=1;c<=registeredMembers.length;c++){
            if(slotFound==false&&registeredMembers[c-1].getName()=="No Name"&&registeredMembers[c-1].getID()==0){
                slotFound=true;
                registeredMembers[c-1]=new Member(name, ID);
            }
        }
    }

    public void addBook(String title, String author, String ISBN, int Availability){
        boolean slotFound=false;

        for(int c=1;c<=library.length;c++){
            if(slotFound==false&&library[c-1].getTitle()=="No Name"){
                slotFound=true;
                library[c-1]=new Book(title, author, ISBN, Availability);
            }
        }
    }

    //Display
    public void displayLibrary(){
        String msg="Library Display\n\nMembers: ";

        for(int c=1;c<=registeredMembers.length;c++){
            if(registeredMembers[c-1].getName()!="No Name"&&registeredMembers[c-1].getID()!=0){
                msg=msg+"\n"+registeredMembers[c-1].getName()+": "+registeredMembers[c-1].getID();
            }
        }

        msg=msg+"\n\nBooks: ";

        for(int c=1;c<=library.length;c++){
            if(library[c-1].getTitle()!="No Name"&& library[c-1].getAuthor()!="No Name"){
                msg=msg+"\n\n"+library[c-1].getTitle()+":\nAuthor="+library[c-1].getAuthor()+"\nISBN="+library[c-1].getISBN()+"\nAvailability="+library[c-1].getAvailability()+"\n";
            }
        }

        System.out.print(msg);
    }
}
