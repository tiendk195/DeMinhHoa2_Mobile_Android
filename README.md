# DeMinhHoa2_Mobile_Android
//    Lưu ý
//      + Trong bài các tên id của các đối tượng:
//      + Button :btn  EditText  :edt   , RadioButton  rdo     ,CheckBox   ck
//      + Do đề yêu cầu chuyển giao giữa các Layout nên chủ yếu sử dụng Intent
//    Hãy đảm bảo layout ban đầu(Đăng Nhập) sẽ được đặt thuộc tính android:exported="true"> và <intent-filter>
    <action android:name="android.intent.action.MAIN" />
    <category android:name="android.intent.category.LAUNCHER" />
</intent-filter>s
//    trong AndroidManifest sẽ được khởi chạy đầu tiên.Các activity còn lại sẽ tự động là false
//      + Ở đây chủ yếu sử dụng Toast để hiện thông tin lên màn hình (có thể đối ý JSON để hiện thị chuỗi JSON dưới dạng TextView Hoặc EditText tùy ý). 
//      + 1 Activity bao gồm (layout xml và java class) nên hãy đảm bảo khi tạo phải tạo cả 2
//Cách tạo:Chuột phải vào ‘app’ -> New -> Activity ->Gallery -> Empty Activity
