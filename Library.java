public class Library {
    private Member[] registeredMembers={};
    private Book[] library={};
    private Book[] burrowedBooks={};

    //Getter Methods
    public Member getMember(int ID){
        Member targetMember=new Member("", 0);

        for(int c=1;c<=registeredMembers.length;c++){
            if(registeredMembers[c-1].getID()==ID){
                targetMember=registeredMembers[c-1];
            }
        }

        return targetMember;
    }

    public Book getBook(String title){
        Book targetBook=new Book("", "", "", 0)

        for(int c=1;c<=library.length;c++){
            if(library[c-1].getTitle()==title){
                targetBook=library[c-1];
            }
        }

        return targetBook;
    }

    //Removal Methods
    public void removeMember(int ID){
        for(int c=1;c<=registeredMembers.length;c++){
            if(registeredMembers[c-1].getID()==ID){
                registeredMembers[c-1]
            }
        }
    }
}
