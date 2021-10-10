package backend.ex5;

import java.util.LinkedList;

public class QLCB {
    LinkedList<Canbo> qlcb;

    public QLCB(LinkedList<Canbo> qlcb) {
        this.qlcb = qlcb;
    }
    
    public void themCanBo(Canbo canbo){
        qlcb.add(canbo);
    }

    public void timKiemCanBoTheoTen(String ten){
        int size = qlcb.size();
        for(int i= 0;i<size;i++){
            if (qlcb.get(i).getHoTen() == ten){
                qlcb.get(i).toString();
            }
        }
    }

    public void hienThiDanhSachCanBo(){
        int size = qlcb.size();
        System.out.println("so luong can bo: " + size);
        for(int i= 0;i<size;i++){
            qlcb.get(i).toString();
        }
    }

    public void xoaCanBo(String ten){
        int size = qlcb.size();
        for(int i= 0;i<size;i++){
            if (qlcb.get(i).getHoTen() == ten){
                qlcb.remove(i);
            }
        }
    }
}
