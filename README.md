# QLShop
# DATABASE NAME: QLShopQA
# TABLE
  # -NHANVIEN
    +MANV --PR
    +TENNV
    +GIOITINH
    +CMND
    +NGAYSINH
    +CHUCVU
    +TENTAIKHOAN
    +MATKHAU
    +DANGHI
  -SANPHAM
    +MA --PR
    +TEN
    +SLTON
    +GIA
    +KICHTHUOC
  -CTHOADON
    +MAHD --PR
    +MASP  --PR
    +TENSP
    +SOLUONGBAN
    +TONGTIENSP
  -HOADON
    +MAHD
    +NGAY
    +TONGTIEN
    +TENKHACHHANG
    +SDTKH
    +MANV
INSERT INTO dbo.SANPHAM(MA, TEN , SLTON, GIA, KICKTHUOC)
VALUES (N'SP001', N'ÁO THỂ THAO', 20, 60000, 'XXL'), (N'SP002', N'ÁO SƠ MI', 50, 100000, 'L'), (N'SP003', N'ÁO PHÔNG TRẮNG', 100, 99000, 'XL'),
(N'SP004', N'ÁO PHÔNG XANH', 80, 120000, 'XL'), (N'SP005', N'ÁO KHOÁC LÔNG', 120, 150000, 'XL'), (N'SP006', N'ÁO KHOÁC GIÓ', 130, 155000, 'XXL'), (N'SP007', N'ÁO THỂ THAO', 20, 60000, 'XXL'),
(N'SP008', N'BỘ QUẦN ÁO VĂN PHÒNG', 200, 230000, 'XXL'), (N'SP009', N'BỘ QUẦN ÁO NGỦ NỮ', 230, 210000, 'XL'), (N'SP010', N'BỘ QUẦN ÁO THỂ THAO NAM', 300, 250000, 'XXL'), (N'SP011', N'QUẦN JEAN NAM', 200, 120000, 'XXL'),
(N'SP012', N'ÁO KHOÁC CHỐNG NẮNG', 210, 175000, 'XL'),(N'SP013', N'ÁO KHOÁC CHỐNG NẮNG CÓ MŨ', 200, 190000, 'XXL'), (N'SP014', N'ÁO THUN COTTON', 120, 160000, 'XL'), (N'SP015', N'ÁO QUẦN SHORT NAM', 300, 110000, 'XL'),
(N'SP016', N'BỘ QUẦN ÁO THỂ THAO NỮ', 170, 200000, 'XL'), (N'SP017', N'QUẦN JEAN RÁCH HAI BÊN GỐI', 300, 270000, 'XL'), (N'SP018', N'QUẦN ĐŨI RỘNG ỐNG DÀI', 350, 100000, 'L'), (N'SP019', N'QUẦN JEAN LEVI', 300, 300000, 'XXL'),
(N'SP020', N'QUẦN SHORT NỮ', 300, 130000, 'XL'), (N'SP021', N'QUẦN ỐNG SUÔNG NỮ', 250, 160000, 'XL')
------------------
INSERT INTO dbo.NHANVIEN(MANV, TENNV, GIOITINH, CMND, NGAYSINH, CHUCVU, TENTAIKHOAN, MATKHAU)
VALUES
(N'Y22NV001',N'NGUYỄN VĂN MƯỜI',N'NAM', '2235674214', '1999-10-22', N'NHÂN VIÊN', 'SHOP001','123456'),
(N'Y22NV002',N'NGUYỄN THỊ KIM',N'NỮ', '3849283947', '1997-01-02', N'NHÂN VIÊN', 'SHOP002','123456'),
(N'Y22NV003',N'PHAN ĐÌNH DUY',N'NAM', '45633234555', '2000-12-10', N'NHÂN VIÊN', 'SHOP003','123456'),
(N'Y22NV004',N'TRẦN KIM DUNG',N'NỮ', '9832857321', '2001-05-02', N'NHÂN VIÊN', 'SHOP004','123456'),
(N'Y22NV005',N'LÝ VĂN QUÂN',N'NAM', '2209321234', '2000-08-10', N'NHÂN VIÊN', 'SHOP005','123456'),
(N'Y22NV006',N'NGUYỄN THỊ MỸ DUYÊN',N'NỮ', '7632829283', '1999-02-21', N'QUẢN LÝ', 'SHOP006','123456'),
(N'Y22NV007',N'NGUYỄN TRUNG QUÂN',N'NAM', '4564930294', '1995-07-08', N'QUẢN LÝ', 'SHOP007','123456')
    
