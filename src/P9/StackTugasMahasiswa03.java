package P9;

public class StackTugasMahasiswa03 {
    Mahasiswa03[] stack;
    int top;
    int size;

    public StackTugasMahasiswa03(int size) {
        this.size = size;
        stack = new Mahasiswa03[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa03 Mhs) {
        if (!isFull()) {
            top++;
            stack[top] = Mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi. ");
        }
    }

    public Mahasiswa03 pop() {
        if (!isEmpty()) {
            Mahasiswa03 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai. ");
            return null;
        }
    }

    public Mahasiswa03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan ");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }

    public Mahasiswa03 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int count(){
        return top + 1;
    }
}
