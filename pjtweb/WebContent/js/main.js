/* write */
    function option(num) {
        if (num == 2) {
            $("#send").hide();
            $("#driver").show();
        } else {
            $("#send").show();
            $("#driver").hide();
        }
    }
    function field_chk_write() {
        var price = document.getElementById("price");
        var dprt = document.getElementById("dprt");
        var dprt_date = document.getElementById("dprt_date");
        var ariv = document.getElementById("ariv");
        var ariv_date = document.getElementById("ariv_date");
        var cargo = document.getElementById("cargo");
        var cargo_kind = document.getElementById("cargo_kind");
        var cargo_weight = document.getElementById("cargo_weight");
        var via = document.getElementById("via");
        var from = document.getElementById("from");
        var from_tel = document.getElementById("from_tel");
        var to = document.getElementById("to");
        var to_tel = document.getElementById("to_tel");
        var ps = document.getElementById("ps");

        if(price.value=="null"||price.value==""){
            alert("운임을 입력해 주세요.");
            price.focus();
            return false;
        }
        if(isNaN(price.value)==true){
            alert("운임을 숫자로만 입력해 주세요.");
            price.focus();
            return false;
        }
        if(dprt.value=="null"||dprt.value==""){
            alert("출발지를 입력해 주세요.");
            dprt.focus();
            return false;
        }
        if(dprt_date.value=="null"||dprt_date.value==""){
            alert("출발시간 입력해 주세요.");
            dprt_date.focus();
            return false;
        }
        if(ariv.value=="null"||ariv.value==""){
            alert("도착지를 입력해 주세요.");
            ariv.focus();
            return false;
        }
        if(ariv_date.value=="null"||ariv_date.value==""){
            alert("도착시간 입력해 주세요.");
            ariv_date.focus();
            return false;
        }
        if(cargo.value=="null"||cargo.value==""){
            alert("화물명을 입력해 주세요.");
            cargo.focus();
            return false;
        }
        if(cargo_kind.value=="null"||cargo_kind.value==""){
            alert("화물종류를 입력해 주세요.");
            cargo_kind.focus();
            return false;
        }
        if(cargo_weight.value=="null"||cargo_weight.value==""){
            alert("화물중량 입력해 주세요.");
            cargo_weight.focus();
            return false;
        }
        if(isNaN(cargo_weight.value)==true){
            alert("중량을 숫자로만 입력해 주세요.");
            cargo_weight.focus();
            return false;
        }
        if(via.value=="null"||via.value==""){
            alert("경유지를 입력해 주세요.");
            via.focus();
            return false;
        }
        if(from.value=="null"||from.value==""){
            alert("보내는사람을 입력해 주세요.");
            from.focus();
            return false;
        }
        if(from_tel.value=="null"||from_tel.value==""){
            alert("연락처를 입력해 주세요.");
            from_tel.focus();
            return false;
        }
        if(isNaN(from_tel.value)==true){
            alert("연락처를 숫자로만 입력해 주세요.");
            from_tel.focus();
            return false;
        }        
        if(to.value=="null"||to.value==""){
            alert("받는사람을 입력해 주세요.");
            to.focus();
            return false;
        }                    
        if(to_tel.value=="null"||to_tel.value==""){
            alert("연락처를 입력해 주세요.");
            to_tel.focus();
            return false;
        }
        if(dprt_date.value>ariv_date.value){
            alert("도착시간이 출발시간보다 빠릅니다.");
            ariv_date.focus();
            return false;
        }
    }
        function field_chk_write2() {
        var price = document.getElementById("price2");
        var dprt = document.getElementById("dprt2");
        var dprt_date = document.getElementById("dprt_date2");
        var ariv = document.getElementById("ariv2");
        var ariv_date = document.getElementById("ariv_date2");
        var car = document.getElementById("car");
        var car_kind = document.getElementById("car_kind");
        var cargo_weight = document.getElementById("cargo_weight2");
        var via = document.getElementById("via2");
        var driver = document.getElementById("driver");
        var driver_tel = document.getElementById("driver_tel");

        if(price.value=="null"||price.value==""){
            alert("운임을 입력해 주세요.");
            price.focus();
            return false;
        }
        if(isNaN(price.value)==true){
            alert("운임을 숫자로만 입력해 주세요.");
            price.focus();
            return false;
        }
        if(dprt.value=="null"||dprt.value==""){
            alert("출발지를 입력해 주세요.");
            dprt.focus();
            return false;
        }
        if(dprt_date.value=="null"||dprt_date.value==""){
            alert("출발시간 입력해 주세요.");
            dprt_date.focus();
            return false;
        }
        if(ariv.value=="null"||ariv.value==""){
            alert("도착지를 입력해 주세요.");
            ariv.focus();
            return false;
        }
        if(ariv_date.value=="null"||ariv_date.value==""){
            alert("도착시간 입력해 주세요.");
            ariv_date.focus();
            return false;
        }
        if(car.value=="null"||car.value==""){
            alert("차량명 입력해 주세요.");
            car.focus();
            return false;
        }
        if(car_kind.value=="null"||car_kind.value==""){
            alert("차량종류를 입력해 주세요.");
            car_kind.focus();
            return false;
        }
        if(cargo_weight.value=="null"||cargo_weight.value==""){
            alert("화물중량 입력해 주세요.");
            cargo_weight.focus();
            return false;
        }
        if(isNaN(cargo_weight.value)==true){
            alert("중량을 숫자로만 입력해 주세요.");
            cargo_weight.focus();
            return false;
        }
        if(via.value=="null"||via.value==""){
            alert("경유지를 입력해 주세요.");
            via.focus();
            return false;
        }
        if(driver.value=="null"||driver.value==""){
            alert("기사 이름을 입력해 주세요.");
            driver.focus();
            return false;
        }
        if(driver_tel.value=="null"||driver_tel.value==""){
            alert("연락처를 입력해 주세요.");
            driver_tel.focus();
            return false;
        }
        if(isNaN(driver_tel.value)==true){
            alert("연락처를 숫자로만 입력해 주세요.");
            cargo_weight.focus();
            return false;
        }        
        if(dprt_date.value>ariv_date.value){
            alert("도착시간이 출발시간보다 빠릅니다.");
            ariv_date.focus();
            return false;
        }
    }