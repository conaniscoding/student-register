$(document).ready(function (){
    debugger;
    $("#queryBtn").click(function () {
        var name = $("#stuName").val();
        $("#stuInfo").text("").hide();
        if(!name){
            alert("请输入学员姓名");
        }else{
            $.ajax({
                url:"/stu/detail",
                data:{name:name},
                datatype:"json",
                success:function (data) {
                    $("#stuInfo").text(data).show();
                },
                error:function (data) {
                    $("#stuInfo").text(data).show();
                }
            });
        }
    });
});
