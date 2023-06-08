package com.example.appdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.GridView;

import com.example.appdoctruyen.Adapter.truyenTranhAdapter;
import com.example.appdoctruyen.object.truyentranh;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gdvList;
    private truyenTranhAdapter adapter;
    private ArrayList<truyentranh> truyentranhArrayList;
    private EditText edt_timkiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        AnhXa();
        setup();
        setclick();
    }
    private void init(){
        truyentranhArrayList = new ArrayList<>();
        truyentranhArrayList.add(new truyentranh(" Tôi Cùng Phe Với Phản Diện","Chương 118","https://static.8cache.com/cover/eJzLyTDWTws2crT0MfV0d3GNNEn39Aw19KmIKPfIiCowT3KOKkpPKihODMpNc8sKS8pxNbbIMqwyz8x3DC421a2oTI9MS9YtccwzjywLDfDxzQ0xNkquTLctNzI01c0wNjICAO3DHyk=/toi-cung-phe-voi-phan-dien.jpg"));
        truyentranhArrayList.add(new truyentranh(" Chuế Tế Đỉnh Phong Nhất Đẳng Độc Tôn","Chương 534","https://static.8cache.com/cover/eJwNzUUSo0AAAMAXpRYLctgDbkNwvVAZ3EmAAPP63f5Ajy35JwBHjo-jRL7FO86989vY-lz1N8dNjrXMmZFr0_0WuZLIO4kGH9xSId0IdVbuRVe85kEdDmn1cJEKXWy1U3fFBudaAdEz_RndLHgo5Z7pliZXSu69Qn-C0FwiUC3zBFVCpJJ7Yrp6opEAGefq5CNiciTZFbpnEgxNc6_FjZ_Jo-SHgTDTpbxB5SLKeRsB8bVyvln2DINpcHAQosFtl2Tad_woFlwFDhItLL795lFm3ELguj19LFlvMus9JS1ANcqgpAZ8fcyEVxwKXR6CV2CO6kskfKkPyXBFNF-Kqpo_u_2KSd8kplVc-lNSaiydE1Z74nMHRCySljHYt6avrAac83bxuj6s-DHKTd2zJBfK0TmEqxgCVStvtlZ5InjUQNvLwCU_5mIUWzYcGyHVSvhKJbQuOMypD60okxDFpAOUU9ivIWp4-0G2E4D-fuJs3Rsc9cR4iPQJpFandW3atxtTJ4-uyhYCxR1Ljx7zbbeFz8dVIJaRpZ-fIA4HVET-rukfb3R5lqGm9Nr6GWZSKkJ-G-8pqn7eexgap1uezWji1JO23CKSeJfZhX6MWjrU4Y91P1pvzP-v7kdd6FevqbIxBnuUaMV9hf25sv_poEH8OBPlX7vZSBOVaRbZaxALVMoNWiIHoPr6dZzV7hkL8o7d0VAWbHPch0vu3WQHPv9NKvnvSeDPR0sSxD_hOe59/chue-te-dinh-phong-nhat-dang-doc-ton.jpg"));
        truyentranhArrayList.add(new truyentranh(" Vương Phi Xung Hỉ","Chương 51","https://static.8cache.com/cover/eJzLyTDWDzBMcw0PdKzKda4qTM5JcwtMzTVIdjcydXNzzvfNMEiMcslMDyvJinf38Q4zNy3xSrbIrfQ1dKtKTcwOtAhyC_NIygsrczLN8zH3qDAtcS5zSbctNzI01c0wNjICAAWaHxs=/vuong-phi-xung-hi.jpg"));
        truyentranhArrayList.add(new truyentranh(" Ấm Áp Từ Anh","Chương 55","https://static.8cache.com/cover/eJzLyTDWT6usMIzPCDfMzywqDAmvyM4uzQnNLfPIMDQMLMxLK02Mcg7PCc4tck32CY80Ci2uCK0KyAoJyUg28Iwsjs_1ctYtNig09TEJtghPjzTy93b2KrctNzI01c0wNjICAIC1IHs=/am-ap-tu-anh.jpg"));
        truyentranhArrayList.add(new truyentranh(" Đệ Nhất Kiếm Thần","Chương 10940","https://static.8cache.com/cover/o/eJzLyTDW180oLgory3H0C3D31A8rLE3yrgwyz_X31HeEAi8jE30nZzfjKmMLv2BzV_1yI0NT3QxjIyNdz2QTIwC9NBM2/de-nhat-kiem-than-799220.jpg"));
        truyentranhArrayList.add(new truyentranh(" Tôi Cùng Phe Với Phản Diện","Chương 118","https://static.8cache.com/cover/eJzLyTDWTws2crT0MfV0d3GNNEn39Aw19KmIKPfIiCowT3KOKkpPKihODMpNc8sKS8pxNbbIMqwyz8x3DC421a2oTI9MS9YtccwzjywLDfDxzQ0xNkquTLctNzI01c0wNjICAO3DHyk=/toi-cung-phe-voi-phan-dien.jpg"));
        truyentranhArrayList.add(new truyentranh(" Chuế Tế Đỉnh Phong Nhất Đẳng Độc Tôn","Chương 534","https://static.8cache.com/cover/eJwNzUUSo0AAAMAXpRYLctgDbkNwvVAZ3EmAAPP63f5Ajy35JwBHjo-jRL7FO86989vY-lz1N8dNjrXMmZFr0_0WuZLIO4kGH9xSId0IdVbuRVe85kEdDmn1cJEKXWy1U3fFBudaAdEz_RndLHgo5Z7pliZXSu69Qn-C0FwiUC3zBFVCpJJ7Yrp6opEAGefq5CNiciTZFbpnEgxNc6_FjZ_Jo-SHgTDTpbxB5SLKeRsB8bVyvln2DINpcHAQosFtl2Tad_woFlwFDhItLL795lFm3ELguj19LFlvMus9JS1ANcqgpAZ8fcyEVxwKXR6CV2CO6kskfKkPyXBFNF-Kqpo_u_2KSd8kplVc-lNSaiydE1Z74nMHRCySljHYt6avrAac83bxuj6s-DHKTd2zJBfK0TmEqxgCVStvtlZ5InjUQNvLwCU_5mIUWzYcGyHVSvhKJbQuOMypD60okxDFpAOUU9ivIWp4-0G2E4D-fuJs3Rsc9cR4iPQJpFandW3atxtTJ4-uyhYCxR1Ljx7zbbeFz8dVIJaRpZ-fIA4HVET-rukfb3R5lqGm9Nr6GWZSKkJ-G-8pqn7eexgap1uezWji1JO23CKSeJfZhX6MWjrU4Y91P1pvzP-v7kdd6FevqbIxBnuUaMV9hf25sv_poEH8OBPlX7vZSBOVaRbZaxALVMoNWiIHoPr6dZzV7hkL8o7d0VAWbHPch0vu3WQHPv9NKvnvSeDPR0sSxD_hOe59/chue-te-dinh-phong-nhat-dang-doc-ton.jpg"));
        truyentranhArrayList.add(new truyentranh(" Vương Phi Xung Hỉ","Chương 51","https://static.8cache.com/cover/eJzLyTDWDzBMcw0PdKzKda4qTM5JcwtMzTVIdjcydXNzzvfNMEiMcslMDyvJinf38Q4zNy3xSrbIrfQ1dKtKTcwOtAhyC_NIygsrczLN8zH3qDAtcS5zSbctNzI01c0wNjICAAWaHxs=/vuong-phi-xung-hi.jpg"));
        truyentranhArrayList.add(new truyentranh(" Ấm Áp Từ Anh","Chương 55","https://static.8cache.com/cover/eJzLyTDWT6usMIzPCDfMzywqDAmvyM4uzQnNLfPIMDQMLMxLK02Mcg7PCc4tck32CY80Ci2uCK0KyAoJyUg28Iwsjs_1ctYtNig09TEJtghPjzTy93b2KrctNzI01c0wNjICAIC1IHs=/am-ap-tu-anh.jpg"));
        truyentranhArrayList.add(new truyentranh(" Tôi Cùng Phe Với Phản Diện","Chương 118","https://static.8cache.com/cover/eJzLyTDWTws2crT0MfV0d3GNNEn39Aw19KmIKPfIiCowT3KOKkpPKihODMpNc8sKS8pxNbbIMqwyz8x3DC421a2oTI9MS9YtccwzjywLDfDxzQ0xNkquTLctNzI01c0wNjICAO3DHyk=/toi-cung-phe-voi-phan-dien.jpg"));
        truyentranhArrayList.add(new truyentranh(" Chuế Tế Đỉnh Phong Nhất Đẳng Độc Tôn","Chương 534","https://static.8cache.com/cover/eJwNzUUSo0AAAMAXpRYLctgDbkNwvVAZ3EmAAPP63f5Ajy35JwBHjo-jRL7FO86989vY-lz1N8dNjrXMmZFr0_0WuZLIO4kGH9xSId0IdVbuRVe85kEdDmn1cJEKXWy1U3fFBudaAdEz_RndLHgo5Z7pliZXSu69Qn-C0FwiUC3zBFVCpJJ7Yrp6opEAGefq5CNiciTZFbpnEgxNc6_FjZ_Jo-SHgTDTpbxB5SLKeRsB8bVyvln2DINpcHAQosFtl2Tad_woFlwFDhItLL795lFm3ELguj19LFlvMus9JS1ANcqgpAZ8fcyEVxwKXR6CV2CO6kskfKkPyXBFNF-Kqpo_u_2KSd8kplVc-lNSaiydE1Z74nMHRCySljHYt6avrAac83bxuj6s-DHKTd2zJBfK0TmEqxgCVStvtlZ5InjUQNvLwCU_5mIUWzYcGyHVSvhKJbQuOMypD60okxDFpAOUU9ivIWp4-0G2E4D-fuJs3Rsc9cR4iPQJpFandW3atxtTJ4-uyhYCxR1Ljx7zbbeFz8dVIJaRpZ-fIA4HVET-rukfb3R5lqGm9Nr6GWZSKkJ-G-8pqn7eexgap1uezWji1JO23CKSeJfZhX6MWjrU4Y91P1pvzP-v7kdd6FevqbIxBnuUaMV9hf25sv_poEH8OBPlX7vZSBOVaRbZaxALVMoNWiIHoPr6dZzV7hkL8o7d0VAWbHPch0vu3WQHPv9NKvnvSeDPR0sSxD_hOe59/chue-te-dinh-phong-nhat-dang-doc-ton.jpg"));
        truyentranhArrayList.add(new truyentranh(" Vương Phi Xung Hỉ","Chương 51","https://static.8cache.com/cover/eJzLyTDWDzBMcw0PdKzKda4qTM5JcwtMzTVIdjcydXNzzvfNMEiMcslMDyvJinf38Q4zNy3xSrbIrfQ1dKtKTcwOtAhyC_NIygsrczLN8zH3qDAtcS5zSbctNzI01c0wNjICAAWaHxs=/vuong-phi-xung-hi.jpg"));
        truyentranhArrayList.add(new truyentranh(" Ấm Áp Từ Anh","Chương 55","https://static.8cache.com/cover/eJzLyTDWT6usMIzPCDfMzywqDAmvyM4uzQnNLfPIMDQMLMxLK02Mcg7PCc4tck32CY80Ci2uCK0KyAoJyUg28Iwsjs_1ctYtNig09TEJtghPjzTy93b2KrctNzI01c0wNjICAIC1IHs=/am-ap-tu-anh.jpg"));
        adapter = new truyenTranhAdapter(this,0,truyentranhArrayList);
    }
    private void AnhXa(){
        gdvList = (GridView) findViewById(R.id.gdvlist);
        edt_timkiem = (EditText) findViewById((R.id.edt_seach));
//        adapter =
    }
    private void setup(){
        gdvList.setAdapter(adapter);
    }
    private void setclick(){
        edt_timkiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s1) {
                String s = edt_timkiem.getText().toString();
                adapter.sorTruyen(s);
            }
        });
    }
}