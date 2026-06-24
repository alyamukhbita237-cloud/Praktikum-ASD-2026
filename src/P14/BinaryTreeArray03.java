package P14;

public class BinaryTreeArray03 {
    Mahasiswa03[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray03() {
        this.dataMahasiswa = new Mahasiswa03[10];
    }

    void populateData(Mahasiswa03 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa03 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            dataMahasiswa[++idxLast] = data;
        } else {
            System.out.println("Array penuh!");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {

                dataMahasiswa[idxStart].tampilInformasi();

                traversePreOrder(2 * idxStart + 1);

                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePostOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (dataMahasiswa[idxStart] != null) {
            traversePostOrder(2 * idxStart + 1); // left child
            traversePostOrder(2 * idxStart + 2); // right child
            dataMahasiswa[idxStart].tampilInformasi();
        }
    }
}
    
}
