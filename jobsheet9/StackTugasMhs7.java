package jobsheet9;

public class StackTugasMhs7 {
    Mahasiswa7stack[] stack;
    int size;
    int top;

    public StackTugasMhs7(int size) {
        this.size = size;
        stack = new Mahasiswa7stack[size];
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

    public void push(Mahasiswa7stack mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa7stack pop() {
        if (!isEmpty()) {
            Mahasiswa7stack m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa7stack peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dkumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" +stack[i].kelas);
        }
        System.out.println("");
    }
}
