/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author hieud
 */
public class Province {

    private int proCode;
    private String proName;

    public Province(int proCode, String proName) {
        this.proCode = proCode;
        this.proName = proName;
    }

    public int getProCode() {
        return proCode;
    }

    public void setProCode(int proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.proCode;
        hash = 97 * hash + Objects.hashCode(this.proName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Province other = (Province) obj;
        if (this.proCode != other.proCode) {
            return false;
        }
        return Objects.equals(this.proName, other.proName);
    }

    @Override
    public String toString() {
        return "Province{" + "proCode=" + proCode + ", proName=" + proName + '}';
    }

    public static ArrayList<Province> getProvinceList() {
        String[] arr_province = {"An Giang",
            "Bà Rịa – Vũng Tàu",
            "Bạc Liêu",
            "Bắc Giang",
            "Bắc Kạn",
            "Bắc Ninh",
            "Bến Tre",
            "Bình Dương",
            "Bình Định",
            "Bình Phước",
            "Bình Thuận",
            "Cà Mau",
            "Cao Bằng",
            "Cần Thơ",
            "Đà Nẵng",
            "Đắk Lắk",
            "Đắk Nông",
            "Điện Biên",
            "Đồng Nai",
            "Đồng Tháp",
            "Gia Lai",
            "Hà Giang",
            "Hà Nam",
            "Hà Nội",
            "Hà Tĩnh",
            "Hải Dương",
            "Hải Phòng",
            "Hậu Giang",
            "Hòa Bình",
            "Thành phố Hồ Chí Minh",
            "Hưng Yên",
            "Khánh Hòa",
            "Kiên Giang",
            "Kon Tum",
            "Lai Châu",
            "Lạng Sơn",
            "Lào Cai",
            "Lâm Đồng",
            "Long An",
            "Nam Định",
            "Nghệ An",
            "Ninh Bình",
            "Ninh Thuận",
            "Phú Thọ",
            "Phú Yên",
            "Quảng Bình",
            "Quảng Nam",
            "Quảng Ngãi",
            "Quảng Ninh",
            "Quảng Trị",
            "Sóc Trăng",
            "Sơn La",
            "Tây Ninh",
            "Thái Bình",
            "Thái Nguyên",
            "Thanh Hóa",
            "Thừa Thiên Huế",
            "Tiền Giang",
            "Trà Vinh",
            "Tuyên Quang",
            "Vĩnh Long",
            "Vĩnh Phúc",
            "Yên Bái"
        };
        ArrayList<Province> provinceList = new ArrayList<>();
        int i = 0;
        for (String proName : arr_province) {
            Province province = new Province(i, proName);
            provinceList.add(province);
        }
        return provinceList;
    }

    public static Province getProvinceById(int stuHomeTown) {
        return Province.getProvinceList().get(stuHomeTown);
    }

    public static Province getProvinceByName(String string) {
        ArrayList<Province> provinceList = Province.getProvinceList();
        for (Province province : provinceList) {
            if (province.proName.equals(province.proName)) {
                return province;
            }
        }
        return null;
    }
}
