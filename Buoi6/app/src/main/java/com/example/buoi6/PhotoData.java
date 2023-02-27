package com.example.buoi6;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<Photo>();
        photos.add(new Photo(1,"https://upload.wikimedia.org/wikipedia/commons/9/92/95apple.jpeg","Qua Tao","Táo là một loài cây rụng lá, cây thường có chiều cao từ 2 đến 4,5 m (6 đến 15 ft) trong môi trường canh tác và có chiều cao lên đến 9 m (30 ft) trong điều kiện tự nhiên."));
        photos.add(new Photo(2,"https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Garden_strawberry_%28Fragaria_%C3%97_ananassa%29_single.jpg/420px-Garden_strawberry_%28Fragaria_%C3%97_ananassa%29_single.jpg","Dau Tay","Dâu tây vườn hay gọi đơn giản là dâu tây (danh pháp khoa học: Fragaria × ananassa)[1] là một chi thực vật hạt kín và loài thực vật có hoa thuộc họ Hoa hồng (Rosaceae). Dâu tây xuất xứ từ châu Mỹ và được các nhà làm vườn châu Âu cho lai tạo vào thế kỷ 18 để tạo nên giống dâu tây được trồng rộng rãi hiện nay."));
        photos.add(new Photo(3,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Mango_and_cross_section_edit.jpg/330px-Mango_and_cross_section_edit.jpg","Xoai","Xoài là một loại trái cây vị ngọt thuộc chi Xoài, bao gồm rất nhiều quả cây nhiệt đới, được trồng chủ yếu như trái cây ăn được. Phần lớn các loài được tìm thấy trong tự nhiên là các loại xoài hoang dã. Tất cả đều thuộc họ thực vật có hoa Anacardiaceae."));
        photos.add(new Photo(4,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Luxor%2C_Banana_Island%2C_Banana_Tree%2C_Egypt%2C_Oct_2004.jpg/420px-Luxor%2C_Banana_Island%2C_Banana_Tree%2C_Egypt%2C_Oct_2004.jpg","Chuoi","Chuối là tên gọi loại quả của các loài cây thuộc chi Chuối; đây được coi là một trong các loại trái cây được ăn rộng rãi nhất. Những cây chuối có gốc từ vùng nhiệt đới ở Đông Nam Á và Úc. Ngày nay, chuối được trồng khắp vùng nhiệt đới.[1]"));
        photos.add(new Photo(5,"https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Starr_070313-5664_Citrus_maxima.jpg/420px-Starr_070313-5664_Citrus_maxima.jpg","Buoi","Bưởi (danh pháp hai phần: Citrus maxima (Merr., Burm. f.), hay Citrus grandis L., là một loại quả thuộc chi Cam chanh, thường có màu xanh lục nhạt cho tới vàng khi chín, có múi dày, tép xốp, có vị ngọt, đắng hoặc chua ngọt tùy loại."));
        photos.add(new Photo(6,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Berthe_Hoola_van_Nooten48.jpg/420px-Berthe_Hoola_van_Nooten48.jpg","Mang cut","Măng cụt là một loại cây bản địa ở Đông Nam Á. Được đánh giá cao nhờ độ ngon ngọt, kết cấu tinh tế và hương vị chua và ngọt thanh, măng cụt đã được trồng ở bán đảo Mã Lai, Borneo, Sumatra, bán đảo Đông Dương và Philippines từ thời cổ đại. "));
        photos.add(new Photo(7,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Citrullus_lanatus5SHSU.jpg/420px-Citrullus_lanatus5SHSU.jpg","Dua hau","Ngon"));
        return  photos;
    }
    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i=0;i<phs.size();i++) {
            if (phs.get(i).getId()==id){
                return phs.get(i);
            }
        }
        return null;
        }
}
