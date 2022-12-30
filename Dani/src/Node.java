public class Node {
    private String nim, nama, email, nohp;

    Node(String n1, String n2,String n3, String n4){
        this.nim = n1;
        this.nama = n2;
        this.email = n3;
        this.nohp = n4;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public void printall(){
        System.out.printf("(%s, %s, %s, %s)", this.nim, this.nama, this.email, this.nohp);
        System.out.println();
    }

}
