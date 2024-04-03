import java.util.List;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    } 

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil(); 
            System.out.println("-------------");
        }
    } 

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) { 
                if (listMhs[j] != null && listMhs[j - 1] != null) { 
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    } 
    void selectionSort(){
        for(int i=0; i<idx-1; i++){
            int idxMin = i;
            for(int j=i+1; j<idx; j++){
                if(listMhs[j] != null && listMhs[idxMin] != null) {
                    if(listMhs[j].ipk < listMhs[idxMin].ipk){
                        idxMin = j;
                    }
                }
            }
            if(idxMin != i) {
                Mahasiswa tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp ;
            }
        }
    } 
}
